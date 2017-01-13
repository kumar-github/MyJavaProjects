package com.tc.app.exchangemonitor.controller;

import java.io.FileOutputStream;
import java.net.URL;
import java.time.LocalDateTime;
import java.time.format.DateTimeFormatter;
import java.util.ArrayList;
import java.util.Date;
import java.util.GregorianCalendar;
import java.util.List;
import java.util.Map;
import java.util.ResourceBundle;
import java.util.stream.Collectors;

import org.apache.cayenne.ObjectContext;
import org.apache.cayenne.query.MappedExec;
import org.apache.cayenne.query.ObjectSelect;
import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;
import org.apache.poi.ss.usermodel.Cell;
import org.apache.poi.ss.usermodel.CellStyle;
import org.apache.poi.ss.usermodel.Row;
import org.apache.poi.ss.usermodel.Sheet;
import org.apache.poi.xssf.streaming.SXSSFWorkbook;
import org.controlsfx.control.CheckListView;

import com.tc.app.exchangemonitor.animation.FadeInUpTransition;
import com.tc.app.exchangemonitor.model.cayenne.persistent.ExchToolsTrade;
import com.tc.app.exchangemonitor.model.cayenne.persistent.ExternalMapping;
import com.tc.app.exchangemonitor.model.cayenne.persistent.ExternalTrade;
import com.tc.app.exchangemonitor.model.cayenne.persistent.ExternalTradeSource;
import com.tc.app.exchangemonitor.model.cayenne.persistent.ExternalTradeState;
import com.tc.app.exchangemonitor.model.cayenne.persistent.ExternalTradeStatus;
import com.tc.app.exchangemonitor.util.ApplicationHelper;
import com.tc.app.exchangemonitor.util.CayenneHelper;
import com.tc.app.exchangemonitor.util.CayenneReferenceDataCache;
import com.tc.app.exchangemonitor.util.CayenneReferenceDataFetchUtil;
import com.tc.app.exchangemonitor.util.DatePickerConverter;
import com.tc.app.exchangemonitor.util.ExcelStylesHelper;

import javafx.animation.FadeTransition;
import javafx.animation.KeyFrame;
import javafx.animation.KeyValue;
import javafx.animation.RotateTransition;
import javafx.animation.Timeline;
import javafx.application.Platform;
import javafx.beans.InvalidationListener;
import javafx.beans.binding.Bindings;
import javafx.beans.value.ChangeListener;
import javafx.beans.value.ObservableValue;
import javafx.collections.FXCollections;
import javafx.collections.ListChangeListener;
import javafx.collections.ListChangeListener.Change;
import javafx.collections.ObservableList;
import javafx.collections.transformation.FilteredList;
import javafx.collections.transformation.SortedList;
import javafx.concurrent.WorkerStateEvent;
import javafx.fxml.FXML;
import javafx.scene.control.Accordion;
import javafx.scene.control.Alert;
import javafx.scene.control.Alert.AlertType;
import javafx.scene.control.Button;
import javafx.scene.control.ButtonType;
import javafx.scene.control.DatePicker;
import javafx.scene.control.TableColumn;
import javafx.scene.control.TableView;
import javafx.scene.control.TextField;
import javafx.scene.control.TitledPane;
import javafx.scene.control.ToolBar;
import javafx.scene.effect.Glow;
import javafx.scene.image.ImageView;
import javafx.scene.text.Text;
import javafx.stage.Modality;
import javafx.stage.StageStyle;
import javafx.util.Duration;

/**
 * @author Saravana Kumar M
 */
public class MainApplicationMonitorTabController implements IMainApplicationMonitorTabController
{
	private static final Logger LOGGER = LogManager.getLogger();

	/**
	 * ============================================================================================================================================================================
	 * All Variables injected through FXML starts here
	 * ============================================================================================================================================================================
	 */

	@FXML
	private ToolBar applicationMainWindowCurrentFilterToolBar;

	@FXML
	private Button startMonitorButton;

	@FXML
	private ImageView startMonitorButtonImageView;

	@FXML
	private Button pauseMonitorButton;

	@FXML
	private Button stopMonitorButton;

	@FXML
	private Button reenterFailedTradeButton;

	@FXML
	private Button reenterAllFailedTradesButton;

	@FXML
	private Button saveTradesToExcelButton;

	@FXML
	private Text exchangesFilterKeyText;
	@FXML
	private Text exchangesFilterValueText;

	@FXML
	private Text statesFilterKeyText;
	@FXML
	private Text statesFilterValueText;

	@FXML
	private Text typesFilterKeyText;
	@FXML
	private Text typesFilterValueText;

	@FXML
	private Text accountsFilterKeyText;
	@FXML
	private Text accountsFilterValueText;

	@FXML
	private Text startDateFilterKeyText;
	@FXML
	private Text startDateFilterValueText;

	@FXML
	private Text endDateFilterKeyText;
	@FXML
	private Text endDateFilterValueText;

	@FXML
	private TitledPane actionTitledPane;

	@FXML
	private Accordion queryFilterAccordion;

	@FXML
	private CheckListView<ExternalTradeSource> externalTradeSourcesListView;

	@FXML
	private CheckListView<ExternalTradeState> externalTradeStatesListView;

	@FXML
	private CheckListView<ExternalTradeStatus> externalTradeStatusesListView;

	@FXML
	private CheckListView<ExternalMapping> externalTradeAccountsListView;

	@FXML
	private TextField externalTradeAccountsFilterTextField;

	@FXML
	private TitledPane externalTradeSourcesTitledPane;

	@FXML
	private TitledPane externalTradeStatesTitledPane;

	@FXML
	private TitledPane externalTradeStatusesTitledPane;

	@FXML
	private TitledPane externalTradeAccountsTitledPane;

	@FXML
	private DatePicker startDateDatePicker;

	@FXML
	private DatePicker endDateDatePicker;

	@FXML
	private TableView<ExternalTrade> externalTradesTableView;

	@FXML
	private TextField externalTradeTableViewDataFilterTextField;

	/**
	 * ============================================================================================================================================================================
	 * All FXML Variables ends here
	 * ============================================================================================================================================================================
	 */

	/**
	 * ============================================================================================================================================================================
	 * All Variables injected through @Inject starts here
	 * ============================================================================================================================================================================
	 */

	/**
	 * ============================================================================================================================================================================
	 * All Variables injected through @Inject ends here
	 * ============================================================================================================================================================================
	 */

	/**
	 * ============================================================================================================================================================================
	 * All other variable declaration starts here
	 * ============================================================================================================================================================================
	 */

	private ListChangeListener<ExternalTradeSource> externalTradeSourcesCheckBoxClickListener = null;
	private ListChangeListener<ExternalTradeState> externalTradeStatesCheckBoxClickListener = null;
	private ListChangeListener<ExternalTradeStatus> externalTradeStatusesCheckBoxClickListener = null;
	private ListChangeListener<ExternalMapping> externalTradeAccountsCheckBoxClickListener = null;
	private ChangeListener<String> externalTradeAccountsFilterTextFieldKeyListener = null;
	private InvalidationListener externalTradeTableViewDataFilterTextFieldKeyListener = null;
	private ChangeListener<String> reenterFailedTradeButtonListener = null;

	private final List<ExternalMapping> externalTradeAccounts = new ArrayList<>();

	private final List<ExternalMapping> checkedExternalTradeAccounts = new ArrayList<>();

	private final ObservableList<ExternalTradeSource> externalTradeSourceObservableList = FXCollections.observableArrayList();

	private final ObservableList<ExternalTradeState> externalTradeStateObservableList = FXCollections.observableArrayList();

	private final ObservableList<ExternalTradeStatus> externalTradeStatusObservableList = FXCollections.observableArrayList();

	private final ObservableList<ExternalMapping> externalTradeAccountObservableList = FXCollections.observableArrayList();

	private final ObservableList<ExternalTrade> externalTradesObservableList = FXCollections.observableArrayList();
	private final FilteredList<ExternalTrade> externalTradesFilteredList = new FilteredList<>(this.externalTradesObservableList, p -> true);
	private final SortedList<ExternalTrade> externalTradesSortedList = new SortedList<>(this.externalTradesFilteredList);

	private final FetchExternalTradesScheduledService fetchExternalTradesScheduledService = new FetchExternalTradesScheduledService();

	/**
	 * ============================================================================================================================================================================
	 * All other variable declaration ends here
	 * ============================================================================================================================================================================
	 */

	@Override
	public void initialize(final URL location, final ResourceBundle resources)
	{
		/* add the instantiated controller object to map, so that we can use in the future. */
		this.addThisControllerToControllersMap();

		/* so that we can track if any fxml variables are not injected. */
		this.doAssertion();

		/* This is to bind the observable variables to the actual UI control. Once bound, the data in the observable variable will automatically displayed on the UI control. Note: Initially the variables
		 * value may be null, so nothing appears on the UI control but whenever the value gets changed on the variable either directly or indirectly that will reflect on the UI control automatically.
		 */
		this.doInitialDataBinding();

		this.setAnyUIComponentStateIfNeeded();

		/* This will initialize the user interface ensuring all UI controls are loaded with the proper data. We need to fetch data from DB and construct checkboxes, buttons etc... and display on the UI. */
		this.initializeGUI();

		/* This will create the listeners but wont attach it to any components */
		this.createListeners();

		/* This will initialize bind the listeners to the respective UI controls so that when app is launched, everything is ready for user interaction. */
		this.attachListeners();

		/* This will initialize the tables with the columns and bind the cell value factories for the columns. */
		this.initializeTableViews();

		/* This will initialize the animations if needed so that, we see the table rotation or button fade effect etc... */
		this.initializeAnimationsIfNeeded();
	}

	@Override
	public void addThisControllerToControllersMap()
	{
		ApplicationHelper.controllersMap.putInstance(MainApplicationMonitorTabController.class, this);
	}

	@Override
	public void doAssertion()
	{
		assert this.externalTradeTableViewDataFilterTextField != null : "fx:id=\"externalTradeTableViewDataFilterTextField\" was not injected. Check your FXML file MainApplicationViewNew.fxml";
	}

	@Override
	public void doInitialDataBinding()
	{
		/*
		Callback<ExternalTrade, List<MenuItem>> rowMenuItemFactory = new Callback<ExternalTrade, List<MenuItem>>() {
			@Override
			public List<MenuItem> call(ExternalTrade param) {
				final MenuItem addMenuItem = new MenuItem("Add");
				final MenuItem updateMenuItem = new MenuItem("Update");
				final MenuItem deleteMenuItem = new MenuItem("Delete");

				//return Collections.singletonList(addMenuItem);
				return Arrays.asList(addMenuItem, updateMenuItem, deleteMenuItem);
			}
		};
		 */

		//externalTradesTableView.setRowFactory(new CustomRowFactory<ExternalTrade>(null));
		//externalTradesTableView.setRowFactory(new CustomRowFactory<ExternalTrade>(rowMenuItemFactory));

		/* Since startDate and endDate are set as NULL initially, "null" is appearing in the startDateFilterText and endDateFilterText and bcoz of that the Text control is appearing in the UI. To get rid
		 * of that we are hiding the Text control if it contains text equals to "null"
		 */
		this.startDateFilterValueText.visibleProperty().bind(this.startDateFilterValueText.textProperty().isNotEqualTo("null"));
		this.endDateFilterValueText.visibleProperty().bind(this.endDateFilterValueText.textProperty().isNotEqualTo("null"));

		this.exchangesFilterKeyText.visibleProperty().bind(this.exchangesFilterValueText.textProperty().isNotEmpty());
		this.exchangesFilterKeyText.managedProperty().bind(this.exchangesFilterKeyText.visibleProperty());
		this.exchangesFilterValueText.managedProperty().bind(this.exchangesFilterValueText.visibleProperty());

		this.statesFilterKeyText.visibleProperty().bind(this.statesFilterValueText.textProperty().isNotEmpty());
		this.statesFilterKeyText.managedProperty().bind(this.statesFilterKeyText.visibleProperty());
		this.statesFilterValueText.managedProperty().bind(this.statesFilterValueText.visibleProperty());

		this.typesFilterKeyText.visibleProperty().bind(this.typesFilterValueText.textProperty().isNotEmpty());
		this.typesFilterKeyText.managedProperty().bind(this.typesFilterKeyText.visibleProperty());
		this.typesFilterValueText.managedProperty().bind(this.typesFilterValueText.visibleProperty());

		this.accountsFilterKeyText.visibleProperty().bind(this.accountsFilterValueText.textProperty().isNotEmpty());
		this.accountsFilterKeyText.managedProperty().bind(this.accountsFilterKeyText.visibleProperty());
		this.accountsFilterValueText.managedProperty().bind(this.accountsFilterValueText.visibleProperty());

		this.startDateFilterKeyText.visibleProperty().bind(this.startDateFilterValueText.textProperty().isNotEqualTo("null"));
		this.startDateFilterKeyText.managedProperty().bind(this.startDateFilterKeyText.visibleProperty());
		this.startDateFilterValueText.managedProperty().bind(this.startDateFilterValueText.visibleProperty());

		this.endDateFilterKeyText.visibleProperty().bind(this.endDateFilterValueText.textProperty().isNotEqualTo("null"));
		this.endDateFilterKeyText.managedProperty().bind(this.endDateFilterKeyText.visibleProperty());
		this.endDateFilterValueText.managedProperty().bind(this.endDateFilterValueText.visibleProperty());

		this.startDateFilterValueText.textProperty().bind(this.startDateDatePicker.valueProperty().asString());
		this.endDateFilterValueText.textProperty().bind(this.endDateDatePicker.valueProperty().asString());

		this.startMonitorButton.disableProperty().bind(this.fetchExternalTradesScheduledService.runningProperty());
		this.pauseMonitorButton.disableProperty().bind(this.fetchExternalTradesScheduledService.runningProperty().not());
		this.stopMonitorButton.disableProperty().bind(this.fetchExternalTradesScheduledService.runningProperty().not());

		this.externalTradesTableView.setItems(this.externalTradesSortedList);

		this.externalTradeTableViewDataFilterTextField.disableProperty().bind(this.fetchExternalTradesScheduledService.runningProperty());

		/*
		reenterFailedTradeButton.disableProperty().bind(Bindings.createBooleanBinding(() -> {
			if(externalTradesTableView.getSelectionModel().getSelectedItem() != null && externalTradesTableView.getSelectionModel().getSelectedItem().getExternalTradeStatusOid().getExternalTradeStatusName().equalsIgnoreCase("Failed") && !fetchExternalTradesScheduledService.isRunning())
				return false;
			return true;
		}, externalTradesTableView.getSelectionModel().selectedItemProperty()));
		 */
		this.reenterFailedTradeButton.disableProperty().bind(this.fetchExternalTradesScheduledService.runningProperty().or(Bindings.isEmpty(this.externalTradesTableView.getItems())).or(Bindings.createBooleanBinding(() -> {
			if((this.externalTradesTableView.getSelectionModel().getSelectedItem() != null) && this.externalTradesTableView.getSelectionModel().getSelectedItem().getExternalTradeStatusO().getExternalTradeStatusName().equalsIgnoreCase("Failed"))
				return false;
			return true;
		}, this.externalTradesTableView.getSelectionModel().selectedItemProperty())));

		this.reenterAllFailedTradesButton.disableProperty().bind(this.fetchExternalTradesScheduledService.runningProperty().or(Bindings.isEmpty(this.externalTradesTableView.getItems())));
		this.saveTradesToExcelButton.disableProperty().bind(this.fetchExternalTradesScheduledService.runningProperty().or(Bindings.isEmpty(this.externalTradesTableView.getItems())));

		/*
		reenterFailedTradeButton.disableProperty().bind(Bindings.createBooleanBinding(() -> {
			if(fetchExternalTradesScheduledService.isRunning() && (externalTradesTableView.getSelectionModel().getSelectedItem() != null && externalTradesTableView.getSelectionModel().getSelectedItem().getExternalTradeStatusOid().getExternalTradeStatusName().equals("Pending")))
				return true;
			return false;
		}, externalTradesTableView.getSelectionModel().selectedItemProperty()));
		 */

		//applicationMainWindowCurrentFilterToolBar.visibleProperty().bind(exchangesFilterText.textProperty().isNotEmpty().or(statesFilterText.textProperty().isNotEmpty()).or(typesFilterText.textProperty().isNotEmpty()).or(accountsFilterText.textProperty().isNotEmpty()).or(startDateFilterText.textProperty().isNotEqualTo("null")).or(endDateFilterText.textProperty().isNotEqualTo("null")));
		/* We are hiding the entire toolbar if no text in any of the Text control. */
		this.applicationMainWindowCurrentFilterToolBar.visibleProperty().bind(
		this.exchangesFilterKeyText.visibleProperty().or(this.statesFilterKeyText.visibleProperty()).or(this.typesFilterKeyText.visibleProperty()).or(this.accountsFilterKeyText.visibleProperty()).or(this.startDateFilterKeyText.visibleProperty()).or(this.endDateFilterKeyText.visibleProperty()));

		this.externalTradeSourcesListView.setItems(this.externalTradeSourceObservableList);
		this.externalTradeStatesListView.setItems(this.externalTradeStateObservableList);
		this.externalTradeStatusesListView.setItems(this.externalTradeStatusObservableList);
		this.externalTradeAccountsListView.setItems(this.externalTradeAccountObservableList);

		this.externalTradesSortedList.comparatorProperty().bind(this.externalTradesTableView.comparatorProperty());
	}

	@Override
	public void setAnyUIComponentStateIfNeeded()
	{
	}

	@Override
	public void initializeGUI()
	{
		/**
		 * fetch exchanges from external_trade_source table and construct checkbox for each exchange and set it on the UI
		 */
		this.fetchExternalTradeSources();

		/**
		 * fetch external trades states from external_trade_state table and construct checkbox for each trade state and set it on the UI
		 */
		this.fetchExternalTradeStates();

		/**
		 * fetch external trades statuses from external_trade_status table and construct checkbox for each trade status and set it on the UI
		 */
		this.fetchExternalTradeStatuses();

		/**
		 * fetch trade accounts from external_mapping table and with mapping_type 'K' and construct checkbox for trade account and set it on the UI
		 */
		this.fetchExternalTradeAccounts();

		/**
		 * set yesterday's date as default start date
		 */
		//startDateDatePicker.setValue(LocalDate.now().minusDays(1));
		this.startDateDatePicker.setValue(null);
		this.startDateDatePicker.setConverter(new DatePickerConverter("dd-MMM-yyyy"));
		//startDateDatePicker.setPromptText("dd-MMM-yyyy");

		/**
		 * set today's date as default end date
		 */
		//endDateDatePicker.setValue(LocalDate.now());
		this.endDateDatePicker.setValue(null);
		this.endDateDatePicker.setConverter(new DatePickerConverter("dd-MMM-yyyy"));

		/**
		 * fetch external trade types from external_trade_type table so that we can use when we display data in the TableView, since we need to display the
		 * trade_type_name in the UI
		 */
	}

	private void fetchExternalTradeSources()
	{
		this.externalTradeSourceObservableList.addAll(CayenneReferenceDataCache.loadExternalTradeSources().values());
	}

	private void fetchExternalTradeStates()
	{
		this.externalTradeStateObservableList.addAll(CayenneReferenceDataCache.loadExternalTradeStates().values());
	}

	private void fetchExternalTradeStatuses()
	{
		this.externalTradeStatusObservableList.addAll(CayenneReferenceDataCache.loadExternalTradeStatuses().values());
	}

	private void fetchExternalTradeAccounts()
	{
		this.externalTradeAccounts.addAll(CayenneReferenceDataCache.loadExternalTradeAccounts().values());

		// the below line is creating a dummy external mapping record with name "Any". not a better way.
		//this.externalTradeAccounts.add(0, new ExternalMapping("Any"));
		//this.externalTradeAccounts.add(0, CayenneHelper.getCayenneServerRuntime().newContext().newObject(ExternalMapping.class));
		final ExternalMapping anyExternalMapping = CayenneHelper.getCayenneServerRuntime().newContext().newObject(ExternalMapping.class);
		anyExternalMapping.setExternalValue1("Any");
		this.externalTradeAccounts.add(0, anyExternalMapping);
		this.externalTradeAccountObservableList.addAll(this.externalTradeAccounts);
	}

	/**
	 * ============================================================================================================================================================================
	 * All Listener creation starts here
	 * ============================================================================================================================================================================
	 */

	@Override
	public void createListeners()
	{
		this.externalTradeSourcesCheckBoxClickListener = (change) -> { this.handleExternalTradeSourcesCheckBoxClick(change); };
		this.externalTradeStatesCheckBoxClickListener = (change) -> { this.handleExternalTradeStatesCheckBoxClick(change); };
		this.externalTradeStatusesCheckBoxClickListener = (change) -> { this.handleExternalTradeStatusesCheckBoxClick(change); };
		this.externalTradeAccountsCheckBoxClickListener = (change) -> { this.handleExternalTradeAccountsCheckBoxClick(change); };
		this.externalTradeAccountsFilterTextFieldKeyListener = (observavleValue, oldValue, newValue) -> { this.handleExternalTradeAccountsFilterByKey(oldValue, newValue); };
		this.externalTradeTableViewDataFilterTextFieldKeyListener = (observable) -> { this.handleExternalTradesTableViewFilterByKey(); };
		this.reenterFailedTradeButtonListener = (observavleValue, oldValue, newValue) -> { this.handleReenterFailedTradeButtonEnableDisableForRecordSelection(oldValue, newValue); };
	}

	/**
	 * ============================================================================================================================================================================
	 * All Listener creation ends here
	 * ============================================================================================================================================================================
	 */

	/**
	 * ============================================================================================================================================================================
	 * All Listener registration starts here
	 * ============================================================================================================================================================================
	 */

	@Override
	public void attachListeners()
	{
		/*externalTradeSourcesListView.getCheckModel().getCheckedItems().addListener((Change<? extends ExternalTradeSource> change) ->
		{
			handleExternalTradeSourcesCheckBoxClick(change);
		});*/
		// the above code is commented and implemented as below.
		this.externalTradeSourcesListView.getCheckModel().getCheckedItems().addListener(this.externalTradeSourcesCheckBoxClickListener);
		this.externalTradeStatesListView.getCheckModel().getCheckedItems().addListener(this.externalTradeStatesCheckBoxClickListener);
		this.externalTradeStatusesListView.getCheckModel().getCheckedItems().addListener(this.externalTradeStatusesCheckBoxClickListener);
		this.externalTradeAccountsListView.getCheckModel().getCheckedItems().addListener(this.externalTradeAccountsCheckBoxClickListener);
		this.externalTradeAccountsFilterTextField.textProperty().addListener(this.externalTradeAccountsFilterTextFieldKeyListener);
		/*externalTradeAccountsFilterTextField.textProperty().addListener((ObservableValue<? extends String> observable, String oldValue, String newValue) ->
		{
			handleExternalTradeAccountsFilterByKey(oldValue, newValue);
		});*/

		this.externalTradeTableViewDataFilterTextField.textProperty().addListener(this.externalTradeTableViewDataFilterTextFieldKeyListener);
		/*externalTradeTableViewDataFilterTextField.textProperty().addListener((Observable observable) ->
		{
			externalTradesFilteredList.setPredicate(externalTradesTableViewFilterPredicate(externalTradeTableViewDataFilterTextField.getText().trim().toLowerCase()));
		});*/
	}

	/**
	 * ============================================================================================================================================================================
	 * All Listener registration ends here
	 * ============================================================================================================================================================================
	 */

	/**
	 * ============================================================================================================================================================================
	 * All Listeners methods starts here
	 * ============================================================================================================================================================================
	 */

	private void handleExternalTradeAccountsFilterByKey(final String oldValue, String newValue)
	{
		// If the number of characters in the text box is less than last time it must be because the user pressed delete
		if((oldValue != null) && (newValue.length() < oldValue.length()))
		{
			// Restore the lists original set of entries and start from the beginning
			this.externalTradeAccountsListView.setItems(FXCollections.observableArrayList(this.externalTradeAccounts));
		}

		// Change to upper case so that case is not an issue
		newValue = newValue.toUpperCase();

		// Filter out the entries that don't contain the entered text
		//final ObservableList<IExternalMappingEntity> subentries = FXCollections.observableArrayList();
		final ObservableList<ExternalMapping> subentries = FXCollections.observableArrayList();

		//for(final IExternalMappingEntity entry : this.externalTradeAccountsListView.getItems())
		for(final ExternalMapping entry : this.externalTradeAccountsListView.getItems())
		{
			if(entry.getExternalValue1().toUpperCase().contains(newValue))
			{
				subentries.add(entry);
			}
		}
		this.externalTradeAccountsListView.setItems(subentries);

		//for(final IExternalMappingEntity string : this.checkedExternalTradeAccounts)
		for(final ExternalMapping string : this.checkedExternalTradeAccounts)
		{
			if(subentries.contains(string))
			{
				this.externalTradeAccountsListView.getCheckModel().check(string);
			}
		}
		/*externalTradeAccountsListView.getCheckModel().getCheckedItems().addListener((Change<? extends ExternalMapping>change) ->
		{
			handleExternalTradeAccountsCheckBoxClick(change);
		});*/
		this.externalTradeAccountsListView.getCheckModel().getCheckedItems().addListener(this.externalTradeAccountsCheckBoxClickListener);
	};

	//private void handleExternalTradeSourcesCheckBoxClick(Change<? extends IExternalTradeSourceEntity> change)
	private void handleExternalTradeSourcesCheckBoxClick(final Change<? extends ExternalTradeSource> change)
	{
		if(this.externalTradeSourcesListView.getCheckModel().getCheckedItems().size() == 0)
		{
			this.externalTradeSourcesTitledPane.setText(ApplicationConstants.EXTERNAL_TRADE_SOURCES_TITLEDPANE_TEXT);
		}
		else
		{
			this.externalTradeSourcesTitledPane.setText(ApplicationConstants.EXTERNAL_TRADE_SOURCES_TITLEDPANE_TEXT + "(" + this.externalTradeSourcesListView.getCheckModel().getCheckedItems().size() + ")");
		}

		if(this.externalTradeSourcesListView.getCheckModel().getCheckedItems().size() > 0)
		{
			this.exchangesFilterValueText.setText(this.externalTradeSourcesListView.getCheckModel().getCheckedItems().toString());
		}
		else
		{
			this.exchangesFilterValueText.setText(null);
		}
	}

	private void handleExternalTradeStatesCheckBoxClick(final Change<? extends ExternalTradeState> change)
	{
		if(this.externalTradeStatesListView.getCheckModel().getCheckedItems().size() == 0)
		{
			this.externalTradeStatesTitledPane.setText(ApplicationConstants.EXTERNAL_TRADE_STATES_TITLEDPANE_TEXT);
		}
		else
		{
			this.externalTradeStatesTitledPane.setText(ApplicationConstants.EXTERNAL_TRADE_STATES_TITLEDPANE_TEXT + "(" + this.externalTradeStatesListView.getCheckModel().getCheckedItems().size() + ")");
		}

		if(this.externalTradeStatesListView.getCheckModel().getCheckedItems().size() > 0)
		{
			this.statesFilterValueText.setText(this.externalTradeStatesListView.getCheckModel().getCheckedItems().toString());
		}
		else
		{
			this.statesFilterValueText.setText(null);
		}
	};

	private void handleExternalTradeStatusesCheckBoxClick(final Change<? extends ExternalTradeStatus> change)
	{
		if(this.externalTradeStatusesListView.getCheckModel().getCheckedItems().size() == 0)
		{
			this.externalTradeStatusesTitledPane.setText(ApplicationConstants.EXTERNAL_TRADE_STATUSES_TITLEDPANE_TEXT);
		}
		else
		{
			this.externalTradeStatusesTitledPane.setText(ApplicationConstants.EXTERNAL_TRADE_STATUSES_TITLEDPANE_TEXT + "(" + this.externalTradeStatusesListView.getCheckModel().getCheckedItems().size() + ")");
		}

		if(this.externalTradeStatusesListView.getCheckModel().getCheckedItems().size() > 0)
		{
			this.typesFilterValueText.setText(this.externalTradeStatusesListView.getCheckModel().getCheckedItems().toString());
		}
		else
		{
			this.typesFilterValueText.setText(null);
		}
	};

	private void handleExternalTradeAccountsCheckBoxClick(final Change<? extends ExternalMapping> change)
	{
		change.next();
		//System.out.println(change.getAddedSubList().get(0));
		if(change.wasAdded())
		{
			this.checkedExternalTradeAccounts.add(change.getAddedSubList().get(0));
		}
		else if(change.wasRemoved())
		{
			this.checkedExternalTradeAccounts.remove(change.getRemoved().get(0));
		}
		if(this.checkedExternalTradeAccounts.size() == 0)
		{
			this.externalTradeAccountsTitledPane.setText(ApplicationConstants.EXTERNAL_TRADE_ACCOUNTS_TITLEDPANE_TEXT);
		}
		else
		{
			this.externalTradeAccountsTitledPane.setText(ApplicationConstants.EXTERNAL_TRADE_ACCOUNTS_TITLEDPANE_TEXT + "(" + this.checkedExternalTradeAccounts.size() + ")");
		}

		if(this.checkedExternalTradeAccounts.size() > 0)
		{
			this.accountsFilterValueText.setText(this.checkedExternalTradeAccounts.toString());
		}
		else
		{
			this.accountsFilterValueText.setText(null);
		}
	};

	private void handleExternalTradesTableViewFilterByKey()
	{
		this.externalTradesFilteredList.setPredicate(this.externalTradesTableViewFilterPredicate(this.externalTradeTableViewDataFilterTextField.getText().trim().toLowerCase()));

		Platform.runLater(() -> {
			// we don't want repeated selections
			MainApplicationMonitorTabController.this.externalTradesTableView.getSelectionModel().clearSelection();
			//get the focus
			MainApplicationMonitorTabController.this.externalTradesTableView.requestFocus();

			//select first item in TableView model
			MainApplicationMonitorTabController.this.externalTradesTableView.getSelectionModel().selectFirst();

			//set the focus on the first element
			MainApplicationMonitorTabController.this.externalTradesTableView.getFocusModel().focus(0);

			//render the selected item in the TableView
			//tableClickHandler(null);
		});

		Platform.runLater(() -> {
			MainApplicationMonitorTabController.this.externalTradeTableViewDataFilterTextField.requestFocus();
			MainApplicationMonitorTabController.this.externalTradeTableViewDataFilterTextField.end();
			//externalTradeTableViewDataFilterTextField.positionCaret(externalTradeTableViewDataFilterTextField.getLength()+1);
		});
	}

	private void handleReenterFailedTradeButtonEnableDisableForRecordSelection(final String oldValue, final String newValue)
	{
		/*
		reenterFailedTradeButton.disableProperty().bind(fetchExternalTradesScheduledService.runningProperty().or(Bindings.isEmpty(externalTradesTableView.getItems())).or(Bindings.createBooleanBinding(() -> {
			if(externalTradesTableView.getSelectionModel().getSelectedItem() != null && externalTradesTableView.getSelectionModel().getSelectedItem().getExternalTradeStatusOid().getExternalTradeStatusName().equalsIgnoreCase("Failed"))
				return false;
			return true;
		}, externalTradesTableView.getSelectionModel().selectedItemProperty())));
		 */
		if(this.fetchExternalTradesScheduledService.isRunning() || this.externalTradesTableView.getItems().isEmpty() || this.externalTradesTableView.getSelectionModel().getSelectedItems().stream().anyMatch((a) -> !a.getExternalTradeStatusO().getExternalTradeStatusName().equals("Failed")))
		{
			this.reenterFailedTradeButton.setDisable(true);
		}
		this.reenterFailedTradeButton.setDisable(false);
	}

	/**
	 * ============================================================================================================================================================================
	 * All Listeners methods ends here
	 * ============================================================================================================================================================================
	 */

	private void initializeTableViews()
	{
		this.initializeExternalTradesTableView();
	}

	private void initializeExternalTradesTableView()
	{
		//externalTradesTableView.getSelectionModel().setCellSelectionEnabled(true);
		//externalTradesTableView.getSelectionModel().setSelectionMode(SelectionMode.MULTIPLE);
	}

	/**
	 * ============================================================================================================================================================================
	 * All Event Handling logic starts here
	 * ============================================================================================================================================================================
	 */

	@FXML
	private void handleStartMonitorButtonClick()
	{
		this.startMonitoringExternalTrades();
	}

	@FXML
	private void handlePauseMonitorButtonClick()
	{
		this.pauseMonitoringExternalTrades();
	}

	@FXML
	private void handleStopMonitorButtonClick()
	{
		this.stopMonitoringExternalTrades();
	}

	private void startMonitoringExternalTrades()
	{
		//acc.setExpandedPane(externalTradeSourcesTitledPane);
		/*
		 * USE CASE: User started monitoring external trades by selecting some criteria. Query got fired and got some records and it is displayed in the table. After some interval (10 seconds) the same query will get fired again
		 * and  the newly fetched records will be displayed in the table clearing the old records.
		 * Generally, it is not necessary to look for new records every time for the same query, unless something is changed in DB. So we will fire a select query which will tells if anything is changed in DB, if so fire the query again else DON'T
		 *
		 * But as a side effect, once we fetched the records based on the criteria and further we are not hitting the DB since nothing is changed but What if user changed his criteria and started a new search. We should fetch the records now
		 * irrespective of the changes.
		 * The below line will reset the old transids and record counts whenver user started a new search. Not a great idea but GOTTA GO HOME, so... atleast it works for now.
		 */
		FetchExternalTradesTask.reset();
		this.fetchExternalTradesFromDBForTableView();
	}

	private void pauseMonitoringExternalTrades()
	{
		if(this.fetchExternalTradesScheduledService != null)
		{
			if(this.fetchExternalTradesScheduledService.isRunning())
			{
				this.fetchExternalTradesScheduledService.cancel();
				//statusMessagesProperty().set("Task Stopped.");
				//progressStatusesProperty().set(0.0);
			}
		}
	}

	private void stopMonitoringExternalTrades()
	{
		this.pauseMonitoringExternalTrades();
		this.externalTradesObservableList.clear();
	}

	@FXML
	private void handleReEnterFailedTradeButtonClick()
	{
		this.updateFailedExternalTrades(this.externalTradesTableView.getSelectionModel().getSelectedItems().filtered(anExternalTrade -> anExternalTrade.getExternalTradeStatusO().getExternalTradeStatusName().equals("Failed")));
	}

	@FXML
	private void handleReEnterAllFailedTradesButtonClick()
	{
		this.updateFailedExternalTrades(this.externalTradesTableView.getItems().filtered(anExternalTrade -> anExternalTrade.getExternalTradeStatusO().getExternalTradeStatusName().equals("Failed")));
	}

	/*
	 * This method is responsible for creating an excel file and write all the
	 * external trade records which is currently displayed in the table.
	 */
	@FXML
	private void handleSaveTradesToExcelButtonClick()
	{
		Alert alert = null;
		final String fileName = "ExternalTrades_" + DateTimeFormatter.ofPattern("dd-MMM-yyyy_HH-mm-ss").format(LocalDateTime.now()) + ".xlsx";
		final boolean writeStatus = this.writeRecordsToExcelFile(fileName);
		if(writeStatus)
		{
			alert = new Alert(AlertType.INFORMATION, fileName + " saved successfully.", ButtonType.CLOSE);
		}
		else
		{
			alert = new Alert(AlertType.ERROR, "File not saved successfully", ButtonType.CLOSE);
		}

		alert.initStyle(StageStyle.TRANSPARENT);
		alert.initModality(Modality.APPLICATION_MODAL);
		alert.showAndWait();
	}

	@FXML
	private void handleReprocessThisTradeMenuItemClick()
	{
		System.out.println(this.externalTradesTableView.getSelectionModel().getSelectedItems());
		/*
		 TableRow aTableRow = (TableRow<T>)tableRowContextMenu.getOwnerNode();
		 aTableRow.getItem();
		 aTableRow.getTableView();
		 */
	}

	@FXML
	private void handleReprocessAllFailedTradesMenuItemClick()
	{
	}

	private void fetchExternalTradesFromDBForTableView()
	{
		ObjectSelect<ExternalTrade> objectSelectToFetchExternalTrades = null;

		final List<ExternalTradeSource> externalTradeSourceObjectsSelectedByUserFromUI = this.getExternalTradeSourcesSelectedByUserFromUI();
		final List<ExternalTradeState> externalTradeStateObjectsSelectedByUserFromUI = this.getExternalTradeStatesSelectedByUserFromUI();
		final List<ExternalTradeStatus> externalTradeStatusObjectsSelectedByUserFromUI = this.getExternalTradeStatusesSelectedByUserFromUI();
		final List<ExternalMapping> externalTradeAccountObjectsSelectedByUserFromUI = this.getExternalTradeAccountsSelectedByUserFromUI();

		//final String selectedStartDate = DateTimeFormatter.ofPattern("dd-MMM-yyyy").format(this.startDateDatePicker.getValue() != null ? this.startDateDatePicker.getValue() : LocalDate.now());
		//final String selectedEndDate = DateTimeFormatter.ofPattern("dd-MMM-yyyy").format(this.endDateDatePicker.getValue() != null ? this.endDateDatePicker.getValue() : LocalDate.now());

		//final List<String> selectedExternalTradeSourceNames = externalTradeSourceObjectsSelectedByUserFromUI.stream().map((anExternalTradeSource) -> anExternalTradeSource.getExternalTradeSrcName().trim()).collect(Collectors.toList());
		final List<String> selectedExternalTradeSourceNames = externalTradeSourceObjectsSelectedByUserFromUI.stream().map(ExternalTradeSource::getExternalTradeSrcName).map(String::trim).collect(Collectors.toList());
		final List<String> selectedExternalTradeStateNames = externalTradeStateObjectsSelectedByUserFromUI.stream().map(ExternalTradeState::getExternalTradeStateName).map(String::trim).collect(Collectors.toList());
		final List<String> selectedExternalTradeStatusNames = externalTradeStatusObjectsSelectedByUserFromUI.stream().map(ExternalTradeStatus::getExternalTradeStatusName).map(String::trim).collect(Collectors.toList());
		final List<String> selectedExternalTradeAccountNames = externalTradeAccountObjectsSelectedByUserFromUI.stream().map(ExternalMapping::getExternalValue1).map(String::trim).collect(Collectors.toList());
		final Date selectedStartDate = (this.startDateDatePicker.getValue() != null) ? new GregorianCalendar(this.startDateDatePicker.getValue().getYear(), this.startDateDatePicker.getValue().getMonthValue() - 1, this.startDateDatePicker.getValue().getDayOfMonth()).getTime() : GregorianCalendar.getInstance().getTime();
		final Date selectedEndDate = (this.endDateDatePicker.getValue() != null) ? new GregorianCalendar(this.endDateDatePicker.getValue().getYear(), this.endDateDatePicker.getValue().getMonthValue() - 1, this.endDateDatePicker.getValue().getDayOfMonth()).getTime() : GregorianCalendar.getInstance().getTime();

		//if((this.externalTradeAccountsListView.getCheckModel().getCheckedItems().size() == 0) || this.externalTradeAccountsListView.getCheckModel().getCheckedIndices().contains(0))
		if((selectedExternalTradeAccountNames.size() == 0) || selectedExternalTradeAccountNames.contains("Any"))
		{
			/* We are here bcoz, user didn't select any account or selected "Any" as account. So we should not care about the buyer account in the qulaifier. */
			objectSelectToFetchExternalTrades = ObjectSelect.query(ExternalTrade.class).where(ExternalTrade.EXTERNAL_TRADE_STATUS_O.dot(ExternalTradeStatus.EXTERNAL_TRADE_STATUS_NAME).in(selectedExternalTradeStatusNames)).and(ExternalTrade.EXTERNAL_TRADE_SOURCE_O.dot(ExternalTradeSource.EXTERNAL_TRADE_SRC_NAME).in(selectedExternalTradeSourceNames)).and(ExternalTrade.EXTERNAL_TRADE_STATE_O.dot(ExternalTradeState.EXTERNAL_TRADE_STATE_NAME).in(selectedExternalTradeStateNames)).and(ExternalTrade.EXTERNAL_TRADE_O1.dot(ExchToolsTrade.CREATION_DATE).between(selectedStartDate, selectedEndDate)).prefetch(ExternalTrade.EXTERNAL_TRADE_O1.joint()).prefetch(ExternalTrade.EXTERNAL_COMMENT.joint());
		}
		else
		{
			objectSelectToFetchExternalTrades = ObjectSelect.query(ExternalTrade.class).where(ExternalTrade.EXTERNAL_TRADE_STATUS_O.dot(ExternalTradeStatus.EXTERNAL_TRADE_STATUS_NAME).in(selectedExternalTradeStatusNames)).and(ExternalTrade.EXTERNAL_TRADE_SOURCE_O.dot(ExternalTradeSource.EXTERNAL_TRADE_SRC_NAME).in(selectedExternalTradeSourceNames)).and(ExternalTrade.EXTERNAL_TRADE_STATE_O.dot(ExternalTradeState.EXTERNAL_TRADE_STATE_NAME).in(selectedExternalTradeStateNames)).and(ExternalTrade.EXTERNAL_TRADE_O1.dot(ExchToolsTrade.CREATION_DATE).between(selectedStartDate, selectedEndDate)).and(ExternalTrade.EXTERNAL_TRADE_O1.dot(ExchToolsTrade.BUYER_ACCOUNT).in(selectedExternalTradeAccountNames)).prefetch(ExternalTrade.EXTERNAL_TRADE_O1.joint()).prefetch(ExternalTrade.EXTERNAL_COMMENT.joint());
		}

		/* This will fetch the data in a background thread, so UI will not be freezed and user can interact with the UI. Here we use a scheduled service which will invoke the task recurringly. */
		//this.fetchExternalTradesScheduledService.setSQLQuery(sqlQueryToFetchExternalTrades);
		this.fetchExternalTradesScheduledService.setObjectSelect(objectSelectToFetchExternalTrades);
		this.fetchExternalTradesScheduledService.setDelay(Duration.seconds(1));
		this.fetchExternalTradesScheduledService.setPeriod(Duration.seconds(10));

		/*
		 *  modified the above 2 lines as below. previously statusMessagesProperty and progressStatusesProperty are available in the same class but now moved to a different controller.
		 *  Eventually the below code has to be modified to access those properties from the respective controller class.
		 *  Currently accessing the statusMessagesProperty and progressStatusesProperty through the controller whose reference is injected while loading. this may not be the perfect approach,
		 *  need to find out a better way.
		 */
		this.fetchExternalTradesScheduledService.messageProperty().addListener((final ObservableValue<? extends String> observableValue, final String oldValue, final String newValue) -> {
			ApplicationHelper.controllersMap.getInstance(MainWindowController.class).statusMessagesProperty().set(newValue);
		});
		this.fetchExternalTradesScheduledService.progressProperty().addListener((final ObservableValue<? extends Number> observableValue, final Number oldValue, final Number newValue) -> {
			ApplicationHelper.controllersMap.getInstance(MainWindowController.class).progressStatusesProperty().set(newValue.doubleValue());
		});
		ApplicationHelper.controllersMap.getInstance(MainWindowController.class).isRunningProperty().bind(this.fetchExternalTradesScheduledService.runningProperty());
		ApplicationHelper.controllersMap.getInstance(MainWindowController.class).allTradesCountProperty().bind(Bindings.size(this.externalTradesObservableList));

		this.fetchExternalTradesScheduledService.restart();

		this.fetchExternalTradesScheduledService.setOnSucceeded((final WorkerStateEvent workerStateEvent) -> { this.doThisIfFetchSucceeded(); });
	}

	public ObservableList<ExternalTradeSource> getExternalTradeSourcesSelectedByUserFromUI()
	{
		return this.externalTradeSourcesListView.getCheckModel().getCheckedItems();
	}

	public List<ExternalTradeState> getExternalTradeStatesSelectedByUserFromUI()
	{
		return this.externalTradeStatesListView.getCheckModel().getCheckedItems();
	}

	public List<ExternalTradeStatus> getExternalTradeStatusesSelectedByUserFromUI()
	{
		return this.externalTradeStatusesListView.getCheckModel().getCheckedItems();
	}

	public List<ExternalMapping> getExternalTradeAccountsSelectedByUserFromUI()
	{
		return this.externalTradeAccountsListView.getCheckModel().getCheckedItems();
	}

	private void doThisIfFetchSucceeded()
	{
		/* Here we are checking for null. May not be a great idea but we are doing bcoz, we will return null only if we didn't hit the DB and want to retain the existing data in the table view.
		 * If we hit the DB then we will get a non null value but with count 0 or greater than 0 depends on the records fetched.
		 */
		if(this.fetchExternalTradesScheduledService.getValue() != null)
		{
			new FadeInUpTransition(this.externalTradesTableView).play();

			this.externalTradesObservableList.clear();
			this.externalTradesObservableList.addAll(this.fetchExternalTradesScheduledService.getValue());
			//dummyExternalTrades.addAll(fetchExternalTradesScheduledService.getLastValue());
			//dummyExternalTrades.addAll(fetchExternalTradesScheduledService.getLastValue() != null ? fetchExternalTradesScheduledService.getLastValue() : fetchExternalTradesScheduledService.getValue());

			/*
			ApplicationHelper.controllersMap.getInstance(MainWindowController.class).pendingTradesCountProperty().set((int) this.externalTradesObservableList.stream().filter((a) -> a.getExternalTradeStatusOid().getExternalTradeStatusName().equals("Pending")).count());
			ApplicationHelper.controllersMap.getInstance(MainWindowController.class).completedTradesCountProperty().set((int) this.externalTradesObservableList.stream().filter((a) -> a.getExternalTradeStatusOid().getExternalTradeStatusName().equals("Completed")).count());
			ApplicationHelper.controllersMap.getInstance(MainWindowController.class).failedTradesCountProperty().set((int) this.externalTradesObservableList.stream().filter((a) -> a.getExternalTradeStatusOid().getExternalTradeStatusName().equals("Failed")).count());
			ApplicationHelper.controllersMap.getInstance(MainWindowController.class).skippedTradesCountProperty().set((int) this.externalTradesObservableList.stream().filter((a) -> a.getExternalTradeStatusOid().getExternalTradeStatusName().equals("Skipped")).count());
			 */
			ApplicationHelper.controllersMap.getInstance(MainWindowController.class).pendingTradesCountProperty().set((int) this.externalTradesObservableList.stream().filter((a) -> a.getExternalTradeStatusO().getExternalTradeStatusName().equals("Pending")).count());
			ApplicationHelper.controllersMap.getInstance(MainWindowController.class).completedTradesCountProperty().set((int) this.externalTradesObservableList.stream().filter((a) -> a.getExternalTradeStatusO().getExternalTradeStatusName().equals("Completed")).count());
			ApplicationHelper.controllersMap.getInstance(MainWindowController.class).failedTradesCountProperty().set((int) this.externalTradesObservableList.stream().filter((a) -> a.getExternalTradeStatusO().getExternalTradeStatusName().equals("Failed")).count());
			ApplicationHelper.controllersMap.getInstance(MainWindowController.class).skippedTradesCountProperty().set((int) this.externalTradesObservableList.stream().filter((a) -> a.getExternalTradeStatusO().getExternalTradeStatusName().equals("Skipped")).count());
		}
	}

	private void updateFailedExternalTrades(final ObservableList<ExternalTrade> selectedItems)
	{
		final List<Integer> selectedExternalTradeOids = selectedItems.stream().map(ExternalTrade::getExternalTradeOid).collect(Collectors.toList());
		LOGGER.debug(selectedExternalTradeOids);
		try
		{
			CayenneHelper.getCayenneServerRuntime().performInTransaction(() -> this.update(selectedExternalTradeOids));
			LOGGER.info("{} External Trade(s) updated successfully.", selectedExternalTradeOids.size());
		}
		catch(final Exception exception)
		{
			LOGGER.error("Update Failed. {}", exception);
			throw new RuntimeException("Update Failed.", exception);
		}
		finally
		{
		}
	}

	private Integer update(final List<Integer> selectedExternalTradeOids)
	{
		final ObjectContext tempContext = CayenneHelper.getCayenneServerRuntime().newContext();
		final Integer transId = CayenneReferenceDataFetchUtil.generateNewTransaction("ExchangeMonitor", "U");
		final MappedExec updateExternalTradeStatusQuery = CayenneReferenceDataFetchUtil.getNonSelectQueryForName("UpdateExternalTradeStatus");
		updateExternalTradeStatusQuery.param("oidsParam", selectedExternalTradeOids);
		updateExternalTradeStatusQuery.param("transIdParam", transId);
		updateExternalTradeStatusQuery.execute(tempContext);

		final MappedExec updateExternalCommentQuery = CayenneReferenceDataFetchUtil.getNonSelectQueryForName("UpdateExternalCommentText");
		updateExternalCommentQuery.param("oidsParam", selectedExternalTradeOids);
		updateExternalCommentQuery.param("transIdParam", transId);
		updateExternalCommentQuery.execute(tempContext);
		return null;
	}

	private boolean writeRecordsToExcelFile(final String fileName)
	{
		boolean writeStatus = true;

		// SXSSFWorkbook anExcelWorkbook = new SXSSFWorkbook(100);
		final SXSSFWorkbook anExcelWorkbook = new SXSSFWorkbook();
		anExcelWorkbook.setCompressTempFiles(true);

		final Map<String, CellStyle> styles = ExcelStylesHelper.createStyles(anExcelWorkbook);

		final Sheet anExcelSheet = anExcelWorkbook.createSheet();

		final Row headerRow = anExcelSheet.createRow(0);

		final ObservableList<TableColumn<ExternalTrade, ?>> allCoulmns = this.externalTradesTableView.getColumns();
		final ObservableList<ExternalTrade> allItems = this.externalTradesTableView.getItems();
		for(int i = 0; i < allCoulmns.size(); i++)
		{
			final Cell headerCell = headerRow.createCell(i);
			headerCell.setCellValue(allCoulmns.get(i).getText());
			headerCell.setCellStyle(styles.get("headerStyle"));
		}

		/*
		 * String[] names = {"Sam", "Pamela", "Dave", "Pascal", "Erik"};
		 * IntStream.range(0, names.length).filter(i -> names[i].length() <=
		 * i).mapToObj(i -> names[i]).collect(Collectors.toList());
		 */

		/*
		 * allItems.stream().forEach((anItem) -> {
		 * allCoulmns.stream().forEach((aColumn) -> { aColumn.getCellData(row);
		 * }); });
		 */

		for(int row = 0; row < allItems.size(); row++)
		{
			final Row anExcelRow = anExcelSheet.createRow(row + 1);
			// anExcelRow.setRowStyle(styles.get("rowStyle"));
			for(int col = 0; col < allCoulmns.size(); col++)
			{
				final TableColumn<ExternalTrade, ?> aColumn = this.externalTradesTableView.getColumns().get(col);
				final String data = aColumn.getCellData(row) != null ? aColumn.getCellData(row).toString() : "";
				final Cell aCell = anExcelRow.createCell(col);
				aCell.setCellValue(data);
				aCell.setCellStyle(styles.get("rowStyle"));
				anExcelSheet.setColumnWidth(col, (int) ((30 * 8) / 0.05));
			}
		}

		try(FileOutputStream fout = new FileOutputStream(fileName))
		{
			anExcelWorkbook.write(fout);
			fout.close();
			anExcelWorkbook.dispose();
		}
		catch(final Exception exception)
		{
			writeStatus = false;
			LOGGER.error(exception);
		}
		finally
		{
			// fout.close();
		}
		return writeStatus;
	}

	/**
	 * ============================================================================================================================================================================
	 * All Event Handling logic ends here
	 * ============================================================================================================================================================================
	 */

	/**
	 * ============================================================================================================================================================================
	 * All Animation logic starts here
	 * ============================================================================================================================================================================
	 */

	private void initializeAnimationsIfNeeded()
	{
		if(this.isAnimationNeeded())
		{
			//give a glow effect to a button
			final Glow glow = new Glow();
			glow.setLevel(0.0);
			//startMonitorButton.setEffect(glow);

			final Timeline timeline = new Timeline();
			timeline.setCycleCount(Timeline.INDEFINITE);
			timeline.setAutoReverse(true);
			final KeyValue kv = new KeyValue(glow.levelProperty(), 0.3);
			final KeyFrame kf = new KeyFrame(Duration.millis(700), kv);
			timeline.getKeyFrames().add(kf);
			timeline.play();

			//to rotate a component
			final RotateTransition rotate = new RotateTransition(Duration.seconds(2), this.startMonitorButtonImageView);
			rotate.setFromAngle(0);
			rotate.setByAngle(360);
			rotate.setCycleCount(-1);
			/*rotate.setAutoReverse(true);
			rotate.setCycleCount(Animation.INDEFINITE);
			rotate.setInterpolator(Interpolator.LINEAR);*/
			rotate.play();

			final RotateTransition r = new RotateTransition(Duration.seconds(2), this.externalTradesTableView);
			r.setFromAngle(0);
			r.setByAngle(360);
			r.play();

			final FadeTransition ft = new FadeTransition(Duration.seconds(2), this.externalTradesTableView);
			ft.setFromValue(1.0);
			ft.setToValue(0.0);
			ft.setCycleCount(2);
			ft.setAutoReverse(true);
			ft.play();
		}
	}

	/**
	 * ============================================================================================================================================================================
	 * All Animation logic ends here
	 * ============================================================================================================================================================================
	 */

	private boolean isAnimationNeeded()
	{
		return false;
	}
}

/**
 * ============================================================================================================================================================================
 * All temporarily commented logic.
 * ============================================================================================================================================================================
 */

/*
	private void initializeExternalTradeTableView()
	{
		tradeOidTableColumn.setCellValueFactory(new PropertyValueFactory<>("oid"));
		tradeOidTableColumn.setCellValueFactory(new Callback<TableColumn.CellDataFeatures<DummyExternalTrade, Number>, ObservableValue<Number>>()
		{
			@Override
			public ObservableValue<Number> call(CellDataFeatures<DummyExternalTrade, Number> param)
			{
				return new SimpleIntegerProperty(param.getValue().getOid().intValue());
			}});

		 //commenting the above code, bcoz the same can be implemented as below using java 8 Lambda
		externalTradeOidTableColumn.setCellValueFactory(cellData -> new SimpleIntegerProperty(cellData.getValue().getOid()));
		tradeCreationDateTableColumn.setCellValueFactory(cellData -> new SimpleObjectProperty<Date>(cellData.getValue().getCreationDate()));

		//modified the above code as below. creationDate column in DB is Date or TimeStamp, so it is mandatory to define it as Date in the DummyExternalTrade bean class.
		 //But to utilize the java 8 LocalDate concept, we declared the TableView's creation date column as LocalDate. The value returned by the DummyExternalTrade bean is Date but
		 //the UI column is expecting a LocalDate. so we convert the date to LocalDate.
		tradeCreationDateTableColumn.setCellValueFactory(new TradeCreationDateCellValueFactory());
		tradeEntryDateTableColumn.setCellValueFactory(new TradeEntryDateCellValueFactory());
		tradeEntryDateTableColumn.setCellFactory(new TradeEntryDateCellFactory());
		tradeStateTableColumn.setCellValueFactory(cellData -> new SimpleStringProperty(cellData.getValue().getExternalTradeStateOid().getExternalTradeStateName()));
		tradeStatusTableColumn.setCellValueFactory(cellData -> new SimpleStringProperty(cellData.getValue().getExternalTradeStatusOid().getExternalTradeStatusName()));
		exchangeTableColumn.setCellValueFactory(cellData -> new SimpleStringProperty(cellData.getValue().getExternalTradeSourceOid().getExternalTradeSrcName()));
		commodityTableColumn.setCellValueFactory(cellData -> new SimpleStringProperty(cellData.getValue().getExchToolsTrade().getCommodity()));
		tradingPeriodTableColumn.setCellValueFactory(cellData -> new SimpleStringProperty(cellData.getValue().getExchToolsTrade().getTradingPeriod()));
		callPutTableColumn.setCellValueFactory(cellData -> new SimpleStringProperty(cellData.getValue().getExchToolsTrade().getCallPut()));

		strikePriceTableColumn.setCellValueFactory(cellData -> {
			if(cellData.getValue().getExchToolsTrade().getStrikePrice() != null)
				return new ReadOnlyDoubleWrapper(cellData.getValue().getExchToolsTrade().getStrikePrice().doubleValue());
			return null;
		});
		quantityTableColumn.setCellValueFactory(cellData -> new SimpleDoubleProperty(cellData.getValue().getExchToolsTrade().getQuantity()));
		priceTableColumn.setCellValueFactory(cellData -> new SimpleDoubleProperty(cellData.getValue().getExchToolsTrade().getPrice()));

		buyingCompanyTableColumn.setCellValueFactory(cellData -> {
			if(cellData.getValue().getExchToolsTrade().getInputAction().trim().equals("BUY"))
			{
				return new ReadOnlyStringWrapper(cellData.getValue().getExchToolsTrade().getInputCompany());
			}
			else
			{
				return new ReadOnlyStringWrapper(cellData.getValue().getExchToolsTrade().getAcceptedCompany());
			}
		});

		buyingTraderTableColumn.setCellValueFactory(cellData -> {
			if(cellData.getValue().getExchToolsTrade().getInputAction().trim().equals("BUY"))
				return new ReadOnlyStringWrapper(cellData.getValue().getExchToolsTrade().getInputTrader());
			return new ReadOnlyStringWrapper(cellData.getValue().getExchToolsTrade().getAcceptedTrader());
		});

		sellingCompanyTableColumn.setCellValueFactory(cellData -> {
			if(cellData.getValue().getExchToolsTrade().getInputAction().trim().equals("BUY"))
				return new ReadOnlyStringWrapper(cellData.getValue().getExchToolsTrade().getAcceptedCompany());
			return new ReadOnlyStringWrapper(cellData.getValue().getExchToolsTrade().getInputCompany());
		});

		sellingTraderTableColumn.setCellValueFactory(cellData -> {
			if(cellData.getValue().getExchToolsTrade().getInputAction().trim().equals("BUY"))
				return new ReadOnlyStringWrapper(cellData.getValue().getExchToolsTrade().getAcceptedTrader());
			return new ReadOnlyStringWrapper(cellData.getValue().getExchToolsTrade().getInputTrader());
		});

		exchangeTradeNumTableColumn.setCellValueFactory(cellData -> new SimpleStringProperty(cellData.getValue().getExchToolsTrade().getExchToolsTradeNum()));
		accountTableColumn.setCellValueFactory(cellData -> new SimpleStringProperty(cellData.getValue().getExchToolsTrade().getBuyerAccount()));

		ictsTradeNumTableColumn.setCellValueFactory(cellData -> {
			if(cellData.getValue().getTradeNum() != null)
				return new ReadOnlyStringWrapper(cellData.getValue().getTradeNum().toString());
			return null;
		});

		ictsPortNumTableColumn.setCellValueFactory(cellData -> {
			if(cellData.getValue().getPortNum() != null)
				return new ReadOnlyStringWrapper(cellData.getValue().getPortNum().toString());
			return null;
		});

		tradeTypeTableColumn.setCellValueFactory(cellData -> new SimpleStringProperty(cellData.getValue().getExchToolsTrade().getTradeType()));

		inputBrokerTableColumn.setCellValueFactory(cellData -> {
			if(cellData.getValue().getExchToolsTrade().getInputAction().trim().equals("BUY"))
				return new ReadOnlyStringWrapper(cellData.getValue().getExchToolsTrade().getInputBroker());
			return new ReadOnlyStringWrapper(cellData.getValue().getExchToolsTrade().getAcceptedBroker());
		});

		buyerClearingBrokerTableColumn.setCellValueFactory(cellData -> {
			return new ReadOnlyStringWrapper(cellData.getValue().getExchToolsTrade().getBuyerClrngBroker());
		});

		sellerClearingBrokerTableColumn.setCellValueFactory(cellData -> {
			return new ReadOnlyStringWrapper(cellData.getValue().getExchToolsTrade().getSellerClrngBroker());
		});

		commentTableColumn.setCellValueFactory(cellData -> new SimpleStringProperty(cellData.getValue().getExternalCommentOid() != null ? cellData.getValue().getExternalCommentOid().getCommentText() : null));
	}*/