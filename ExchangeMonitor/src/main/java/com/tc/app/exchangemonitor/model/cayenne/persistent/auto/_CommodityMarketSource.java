package com.tc.app.exchangemonitor.model.cayenne.persistent.auto;

import java.util.List;

import org.apache.cayenne.CayenneDataObject;
import org.apache.cayenne.exp.Property;

import com.tc.app.exchangemonitor.model.cayenne.persistent.AliasSource;
import com.tc.app.exchangemonitor.model.cayenne.persistent.Calendar;
import com.tc.app.exchangemonitor.model.cayenne.persistent.CommktSourceAlias;
import com.tc.app.exchangemonitor.model.cayenne.persistent.CommktSourceRollDate;
import com.tc.app.exchangemonitor.model.cayenne.persistent.CommodityMarket;
import com.tc.app.exchangemonitor.model.cayenne.persistent.PriceSource;

/**
 * Class _CommodityMarketSource was generated by Cayenne.
 * It is probably a good idea to avoid changing this class manually,
 * since it may be overwritten next time code is regenerated.
 * If you need to make any customizations, please use subclass.
 */
public abstract class _CommodityMarketSource extends CayenneDataObject
{

	private static final long serialVersionUID = 1L;

	public static final String COMMKT_KEY_PK_COLUMN = "commkt_key";
	public static final String PRICE_SOURCE_CODE_PK_COLUMN = "price_source_code";

	public static final Property<String> FINANCIAL_BORROW_USE_IND = new Property<>("financialBorrowUseInd");
	public static final Property<String> FINANCIAL_LEND_USE_IND = new Property<>("financialLendUseInd");
	public static final Property<String> OPTION_EVAL_USE_IND = new Property<>("optionEvalUseInd");
	public static final Property<Short> QUOTE_PRICE_PRECISION = new Property<>("quotePricePrecision");
	public static final Property<Integer> TRANS_ID = new Property<>("transId");
	public static final Property<String> TVM_USE_IND = new Property<>("tvmUseInd");
	public static final Property<AliasSource> ALIAS_SOURCE = new Property<>("aliasSource");
	public static final Property<Calendar> CALENDAR = new Property<>("calendar");
	public static final Property<List<CommktSourceAlias>> COMMKT_SOURCE_ALIASS = new Property<>("commktSourceAliass");
	public static final Property<List<CommktSourceAlias>> COMMKT_SOURCE_ALIASS1 = new Property<>("commktSourceAliass1");
	public static final Property<List<CommktSourceRollDate>> COMMKT_SOURCE_ROLL_DATES = new Property<>("commktSourceRollDates");
	public static final Property<List<CommktSourceRollDate>> COMMKT_SOURCE_ROLL_DATES1 = new Property<>("commktSourceRollDates1");
	public static final Property<CommodityMarket> COMMODITY_MARKET = new Property<>("commodityMarket");
	public static final Property<PriceSource> PRICE_SOURCE = new Property<>("priceSource");

	public void setFinancialBorrowUseInd(final String financialBorrowUseInd)
	{
		this.writeProperty("financialBorrowUseInd", financialBorrowUseInd);
	}

	public String getFinancialBorrowUseInd()
	{
		return (String) this.readProperty("financialBorrowUseInd");
	}

	public void setFinancialLendUseInd(final String financialLendUseInd)
	{
		this.writeProperty("financialLendUseInd", financialLendUseInd);
	}

	public String getFinancialLendUseInd()
	{
		return (String) this.readProperty("financialLendUseInd");
	}

	public void setOptionEvalUseInd(final String optionEvalUseInd)
	{
		this.writeProperty("optionEvalUseInd", optionEvalUseInd);
	}

	public String getOptionEvalUseInd()
	{
		return (String) this.readProperty("optionEvalUseInd");
	}

	public void setQuotePricePrecision(final Short quotePricePrecision)
	{
		this.writeProperty("quotePricePrecision", quotePricePrecision);
	}

	public Short getQuotePricePrecision()
	{
		return (Short) this.readProperty("quotePricePrecision");
	}

	public void setTransId(final Integer transId)
	{
		this.writeProperty("transId", transId);
	}

	public Integer getTransId()
	{
		return (Integer) this.readProperty("transId");
	}

	public void setTvmUseInd(final String tvmUseInd)
	{
		this.writeProperty("tvmUseInd", tvmUseInd);
	}

	public String getTvmUseInd()
	{
		return (String) this.readProperty("tvmUseInd");
	}

	public void setAliasSource(final AliasSource aliasSource)
	{
		this.setToOneTarget("aliasSource", aliasSource, true);
	}

	public AliasSource getAliasSource()
	{
		return (AliasSource) this.readProperty("aliasSource");
	}

	public void setCalendar(final Calendar calendar)
	{
		this.setToOneTarget("calendar", calendar, true);
	}

	public Calendar getCalendar()
	{
		return (Calendar) this.readProperty("calendar");
	}

	public void addToCommktSourceAliass(final CommktSourceAlias obj)
	{
		this.addToManyTarget("commktSourceAliass", obj, true);
	}

	public void removeFromCommktSourceAliass(final CommktSourceAlias obj)
	{
		this.removeToManyTarget("commktSourceAliass", obj, true);
	}

	@SuppressWarnings("unchecked")
	public List<CommktSourceAlias> getCommktSourceAliass()
	{
		return (List<CommktSourceAlias>) this.readProperty("commktSourceAliass");
	}

	public void addToCommktSourceAliass1(final CommktSourceAlias obj)
	{
		this.addToManyTarget("commktSourceAliass1", obj, true);
	}

	public void removeFromCommktSourceAliass1(final CommktSourceAlias obj)
	{
		this.removeToManyTarget("commktSourceAliass1", obj, true);
	}

	@SuppressWarnings("unchecked")
	public List<CommktSourceAlias> getCommktSourceAliass1()
	{
		return (List<CommktSourceAlias>) this.readProperty("commktSourceAliass1");
	}

	public void addToCommktSourceRollDates(final CommktSourceRollDate obj)
	{
		this.addToManyTarget("commktSourceRollDates", obj, true);
	}

	public void removeFromCommktSourceRollDates(final CommktSourceRollDate obj)
	{
		this.removeToManyTarget("commktSourceRollDates", obj, true);
	}

	@SuppressWarnings("unchecked")
	public List<CommktSourceRollDate> getCommktSourceRollDates()
	{
		return (List<CommktSourceRollDate>) this.readProperty("commktSourceRollDates");
	}

	public void addToCommktSourceRollDates1(final CommktSourceRollDate obj)
	{
		this.addToManyTarget("commktSourceRollDates1", obj, true);
	}

	public void removeFromCommktSourceRollDates1(final CommktSourceRollDate obj)
	{
		this.removeToManyTarget("commktSourceRollDates1", obj, true);
	}

	@SuppressWarnings("unchecked")
	public List<CommktSourceRollDate> getCommktSourceRollDates1()
	{
		return (List<CommktSourceRollDate>) this.readProperty("commktSourceRollDates1");
	}

	public void setCommodityMarket(final CommodityMarket commodityMarket)
	{
		this.setToOneTarget("commodityMarket", commodityMarket, true);
	}

	public CommodityMarket getCommodityMarket()
	{
		return (CommodityMarket) this.readProperty("commodityMarket");
	}

	public void setPriceSource(final PriceSource priceSource)
	{
		this.setToOneTarget("priceSource", priceSource, true);
	}

	public PriceSource getPriceSource()
	{
		return (PriceSource) this.readProperty("priceSource");
	}

}