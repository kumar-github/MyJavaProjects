package com.tc.app.exchangemonitor.model.cayenne.persistent.auto;

import java.math.BigDecimal;
import java.util.List;

import org.apache.cayenne.CayenneDataObject;
import org.apache.cayenne.exp.Property;

import com.tc.app.exchangemonitor.model.cayenne.persistent.AiEstActual;
import com.tc.app.exchangemonitor.model.cayenne.persistent.Allocation;
import com.tc.app.exchangemonitor.model.cayenne.persistent.AllocationCriteria;
import com.tc.app.exchangemonitor.model.cayenne.persistent.AllocationItem;
import com.tc.app.exchangemonitor.model.cayenne.persistent.AllocationWorldScale;
import com.tc.app.exchangemonitor.model.cayenne.persistent.BrokerCommissionDefault;
import com.tc.app.exchangemonitor.model.cayenne.persistent.BunkerPurPriceLookup;
import com.tc.app.exchangemonitor.model.cayenne.persistent.CommodityLocation;
import com.tc.app.exchangemonitor.model.cayenne.persistent.DeskLocation;
import com.tc.app.exchangemonitor.model.cayenne.persistent.Exposure;
import com.tc.app.exchangemonitor.model.cayenne.persistent.Facility;
import com.tc.app.exchangemonitor.model.cayenne.persistent.ForecastValue;
import com.tc.app.exchangemonitor.model.cayenne.persistent.FormulaComponentExt;
import com.tc.app.exchangemonitor.model.cayenne.persistent.IctsUser;
import com.tc.app.exchangemonitor.model.cayenne.persistent.InvCreditExposure;
import com.tc.app.exchangemonitor.model.cayenne.persistent.Inventory;
import com.tc.app.exchangemonitor.model.cayenne.persistent.InventoryRollCriteria;
import com.tc.app.exchangemonitor.model.cayenne.persistent.Lc;
import com.tc.app.exchangemonitor.model.cayenne.persistent.LocationAlias;
import com.tc.app.exchangemonitor.model.cayenne.persistent.LocationData;
import com.tc.app.exchangemonitor.model.cayenne.persistent.LocationExtInfo;
import com.tc.app.exchangemonitor.model.cayenne.persistent.LocationGroup;
import com.tc.app.exchangemonitor.model.cayenne.persistent.LocationTankInfo;
import com.tc.app.exchangemonitor.model.cayenne.persistent.Mot;
import com.tc.app.exchangemonitor.model.cayenne.persistent.MotLocation;
import com.tc.app.exchangemonitor.model.cayenne.persistent.MotLocationTariff;
import com.tc.app.exchangemonitor.model.cayenne.persistent.Parcel;
import com.tc.app.exchangemonitor.model.cayenne.persistent.ParentGuarantee;
import com.tc.app.exchangemonitor.model.cayenne.persistent.Path;
import com.tc.app.exchangemonitor.model.cayenne.persistent.Quote;
import com.tc.app.exchangemonitor.model.cayenne.persistent.RailcarPtpRate;
import com.tc.app.exchangemonitor.model.cayenne.persistent.RecapItem;
import com.tc.app.exchangemonitor.model.cayenne.persistent.RiskCover;
import com.tc.app.exchangemonitor.model.cayenne.persistent.Scenario;
import com.tc.app.exchangemonitor.model.cayenne.persistent.Shipment;
import com.tc.app.exchangemonitor.model.cayenne.persistent.TaxLocation;
import com.tc.app.exchangemonitor.model.cayenne.persistent.TaxRate;
import com.tc.app.exchangemonitor.model.cayenne.persistent.TempValueAdjust;
import com.tc.app.exchangemonitor.model.cayenne.persistent.TradeItem;
import com.tc.app.exchangemonitor.model.cayenne.persistent.TradeItemBunker;
import com.tc.app.exchangemonitor.model.cayenne.persistent.TradeItemComposite;
import com.tc.app.exchangemonitor.model.cayenne.persistent.TradeItemDryPhy;
import com.tc.app.exchangemonitor.model.cayenne.persistent.TradeItemStorage;
import com.tc.app.exchangemonitor.model.cayenne.persistent.TradeItemWetPhy;
import com.tc.app.exchangemonitor.model.cayenne.persistent.TransportCostSchedule;

/**
 * Class _Location was generated by Cayenne.
 * It is probably a good idea to avoid changing this class manually,
 * since it may be overwritten next time code is regenerated.
 * If you need to make any customizations, please use subclass.
 */
public abstract class _Location extends CayenneDataObject
{

	private static final long serialVersionUID = 1L;

	public static final String LOC_CODE_PK_COLUMN = "loc_code";

	public static final Property<String> DEL_LOC_IND = new Property<>("delLocInd");
	public static final Property<String> INV_LOC_IND = new Property<>("invLocInd");
	public static final Property<BigDecimal> LATITUDE = new Property<>("latitude");
	public static final Property<String> LOC_NAME = new Property<>("locName");
	public static final Property<Short> LOC_NUM = new Property<>("locNum");
	public static final Property<String> LOC_STATUS = new Property<>("locStatus");
	public static final Property<BigDecimal> LONGITUDE = new Property<>("longitude");
	public static final Property<String> OFFICE_LOC_IND = new Property<>("officeLocInd");
	public static final Property<Integer> TRANS_ID = new Property<>("transId");
	public static final Property<String> WAREHOUSE_AGP_NUM = new Property<>("warehouseAgpNum");
	public static final Property<List<AiEstActual>> AI_EST_ACTUALS = new Property<>("aiEstActuals");
	public static final Property<List<AllocationCriteria>> ALLOCATION_CRITERIAS = new Property<>("allocationCriterias");
	public static final Property<List<AllocationItem>> ALLOCATION_ITEMS = new Property<>("allocationItems");
	public static final Property<List<AllocationItem>> ALLOCATION_ITEMS1 = new Property<>("allocationItems1");
	public static final Property<List<AllocationItem>> ALLOCATION_ITEMS2 = new Property<>("allocationItems2");
	public static final Property<List<AllocationItem>> ALLOCATION_ITEMS3 = new Property<>("allocationItems3");
	public static final Property<List<AllocationWorldScale>> ALLOCATION_WORLD_SCALES = new Property<>("allocationWorldScales");
	public static final Property<List<AllocationWorldScale>> ALLOCATION_WORLD_SCALES1 = new Property<>("allocationWorldScales1");
	public static final Property<List<AllocationWorldScale>> ALLOCATION_WORLD_SCALES2 = new Property<>("allocationWorldScales2");
	public static final Property<List<AllocationWorldScale>> ALLOCATION_WORLD_SCALES3 = new Property<>("allocationWorldScales3");
	public static final Property<List<Allocation>> ALLOCATIONS = new Property<>("allocations");
	public static final Property<List<Allocation>> ALLOCATIONS1 = new Property<>("allocations1");
	public static final Property<List<BrokerCommissionDefault>> BROKER_COMMISSION_DEFAULTS = new Property<>("brokerCommissionDefaults");
	public static final Property<List<BunkerPurPriceLookup>> BUNKER_PUR_PRICE_LOOKUPS = new Property<>("bunkerPurPriceLookups");
	public static final Property<List<CommodityLocation>> COMMODITY_LOCATIONS = new Property<>("commodityLocations");
	public static final Property<List<DeskLocation>> DESK_LOCATIONS = new Property<>("deskLocations");
	public static final Property<List<Exposure>> EXPOSURES = new Property<>("exposures");
	public static final Property<List<Facility>> FACILITIES = new Property<>("facilities");
	public static final Property<List<ForecastValue>> FORECAST_VALUES = new Property<>("forecastValues");
	public static final Property<List<FormulaComponentExt>> FORMULA_COMPONENT_EXTS = new Property<>("formulaComponentExts");
	public static final Property<List<IctsUser>> ICTS_USERS = new Property<>("ictsUsers");
	public static final Property<List<InvCreditExposure>> INV_CREDIT_EXPOSURES = new Property<>("invCreditExposures");
	public static final Property<List<Inventory>> INVENTORIES = new Property<>("inventories");
	public static final Property<List<InventoryRollCriteria>> INVENTORY_ROLL_CRITERIAS = new Property<>("inventoryRollCriterias");
	public static final Property<List<Lc>> LCS = new Property<>("lcs");
	public static final Property<LocationExtInfo> LOCATION = new Property<>("location");
	public static final Property<List<LocationAlias>> LOCATION_ALIASS = new Property<>("locationAliass");
	public static final Property<List<LocationData>> LOCATION_DATAS = new Property<>("locationDatas");
	public static final Property<List<LocationGroup>> LOCATION_GROUPS = new Property<>("locationGroups");
	public static final Property<List<LocationGroup>> LOCATION_GROUPS1 = new Property<>("locationGroups1");
	public static final Property<List<LocationTankInfo>> LOCATION_TANK_INFOES = new Property<>("locationTankInfoes");
	public static final Property<List<MotLocationTariff>> MOT_LOCATION_TARIFFS = new Property<>("motLocationTariffs");
	public static final Property<List<MotLocation>> MOT_LOCATIONS = new Property<>("motLocations");
	public static final Property<List<Mot>> MOTS = new Property<>("mots");
	public static final Property<List<Parcel>> PARCELS = new Property<>("parcels");
	public static final Property<List<ParentGuarantee>> PARENT_GUARANTEES = new Property<>("parentGuarantees");
	public static final Property<List<Path>> PATHS = new Property<>("paths");
	public static final Property<List<Path>> PATHS1 = new Property<>("paths1");
	public static final Property<List<Quote>> QUOTES = new Property<>("quotes");
	public static final Property<List<RailcarPtpRate>> RAILCAR_PTP_RATES = new Property<>("railcarPtpRates");
	public static final Property<List<RailcarPtpRate>> RAILCAR_PTP_RATES1 = new Property<>("railcarPtpRates1");
	public static final Property<List<RecapItem>> RECAP_ITEMS = new Property<>("recapItems");
	public static final Property<List<RiskCover>> RISK_COVERS = new Property<>("riskCovers");
	public static final Property<List<Scenario>> SCENARIOS = new Property<>("scenarios");
	public static final Property<List<Shipment>> SHIPMENTS = new Property<>("shipments");
	public static final Property<List<Shipment>> SHIPMENTS1 = new Property<>("shipments1");
	public static final Property<List<TaxLocation>> TAX_LOCATIONS = new Property<>("taxLocations");
	public static final Property<List<TaxRate>> TAX_RATES = new Property<>("taxRates");
	public static final Property<List<TempValueAdjust>> TEMP_VALUE_ADJUSTS = new Property<>("tempValueAdjusts");
	public static final Property<List<TradeItemBunker>> TRADE_ITEM_BUNKERS = new Property<>("tradeItemBunkers");
	public static final Property<List<TradeItemBunker>> TRADE_ITEM_BUNKERS1 = new Property<>("tradeItemBunkers1");
	public static final Property<List<TradeItemComposite>> TRADE_ITEM_COMPOSITES = new Property<>("tradeItemComposites");
	public static final Property<List<TradeItemComposite>> TRADE_ITEM_COMPOSITES1 = new Property<>("tradeItemComposites1");
	public static final Property<List<TradeItemDryPhy>> TRADE_ITEM_DRY_PHIES = new Property<>("tradeItemDryPhies");
	public static final Property<List<TradeItemStorage>> TRADE_ITEM_STORAGES = new Property<>("tradeItemStorages");
	public static final Property<List<TradeItemWetPhy>> TRADE_ITEM_WET_PHIES = new Property<>("tradeItemWetPhies");
	public static final Property<List<TradeItem>> TRADE_ITEMS = new Property<>("tradeItems");
	public static final Property<List<TradeItem>> TRADE_ITEMS1 = new Property<>("tradeItems1");
	public static final Property<List<TransportCostSchedule>> TRANSPORT_COST_SCHEDULES = new Property<>("transportCostSchedules");
	public static final Property<List<TransportCostSchedule>> TRANSPORT_COST_SCHEDULES1 = new Property<>("transportCostSchedules1");

	public void setDelLocInd(final String delLocInd)
	{
		this.writeProperty("delLocInd", delLocInd);
	}

	public String getDelLocInd()
	{
		return (String) this.readProperty("delLocInd");
	}

	public void setInvLocInd(final String invLocInd)
	{
		this.writeProperty("invLocInd", invLocInd);
	}

	public String getInvLocInd()
	{
		return (String) this.readProperty("invLocInd");
	}

	public void setLatitude(final BigDecimal latitude)
	{
		this.writeProperty("latitude", latitude);
	}

	public BigDecimal getLatitude()
	{
		return (BigDecimal) this.readProperty("latitude");
	}

	public void setLocName(final String locName)
	{
		this.writeProperty("locName", locName);
	}

	public String getLocName()
	{
		return (String) this.readProperty("locName");
	}

	public void setLocNum(final Short locNum)
	{
		this.writeProperty("locNum", locNum);
	}

	public Short getLocNum()
	{
		return (Short) this.readProperty("locNum");
	}

	public void setLocStatus(final String locStatus)
	{
		this.writeProperty("locStatus", locStatus);
	}

	public String getLocStatus()
	{
		return (String) this.readProperty("locStatus");
	}

	public void setLongitude(final BigDecimal longitude)
	{
		this.writeProperty("longitude", longitude);
	}

	public BigDecimal getLongitude()
	{
		return (BigDecimal) this.readProperty("longitude");
	}

	public void setOfficeLocInd(final String officeLocInd)
	{
		this.writeProperty("officeLocInd", officeLocInd);
	}

	public String getOfficeLocInd()
	{
		return (String) this.readProperty("officeLocInd");
	}

	public void setTransId(final Integer transId)
	{
		this.writeProperty("transId", transId);
	}

	public Integer getTransId()
	{
		return (Integer) this.readProperty("transId");
	}

	public void setWarehouseAgpNum(final String warehouseAgpNum)
	{
		this.writeProperty("warehouseAgpNum", warehouseAgpNum);
	}

	public String getWarehouseAgpNum()
	{
		return (String) this.readProperty("warehouseAgpNum");
	}

	public void addToAiEstActuals(final AiEstActual obj)
	{
		this.addToManyTarget("aiEstActuals", obj, true);
	}

	public void removeFromAiEstActuals(final AiEstActual obj)
	{
		this.removeToManyTarget("aiEstActuals", obj, true);
	}

	@SuppressWarnings("unchecked")
	public List<AiEstActual> getAiEstActuals()
	{
		return (List<AiEstActual>) this.readProperty("aiEstActuals");
	}

	public void addToAllocationCriterias(final AllocationCriteria obj)
	{
		this.addToManyTarget("allocationCriterias", obj, true);
	}

	public void removeFromAllocationCriterias(final AllocationCriteria obj)
	{
		this.removeToManyTarget("allocationCriterias", obj, true);
	}

	@SuppressWarnings("unchecked")
	public List<AllocationCriteria> getAllocationCriterias()
	{
		return (List<AllocationCriteria>) this.readProperty("allocationCriterias");
	}

	public void addToAllocationItems(final AllocationItem obj)
	{
		this.addToManyTarget("allocationItems", obj, true);
	}

	public void removeFromAllocationItems(final AllocationItem obj)
	{
		this.removeToManyTarget("allocationItems", obj, true);
	}

	@SuppressWarnings("unchecked")
	public List<AllocationItem> getAllocationItems()
	{
		return (List<AllocationItem>) this.readProperty("allocationItems");
	}

	public void addToAllocationItems1(final AllocationItem obj)
	{
		this.addToManyTarget("allocationItems1", obj, true);
	}

	public void removeFromAllocationItems1(final AllocationItem obj)
	{
		this.removeToManyTarget("allocationItems1", obj, true);
	}

	@SuppressWarnings("unchecked")
	public List<AllocationItem> getAllocationItems1()
	{
		return (List<AllocationItem>) this.readProperty("allocationItems1");
	}

	public void addToAllocationItems2(final AllocationItem obj)
	{
		this.addToManyTarget("allocationItems2", obj, true);
	}

	public void removeFromAllocationItems2(final AllocationItem obj)
	{
		this.removeToManyTarget("allocationItems2", obj, true);
	}

	@SuppressWarnings("unchecked")
	public List<AllocationItem> getAllocationItems2()
	{
		return (List<AllocationItem>) this.readProperty("allocationItems2");
	}

	public void addToAllocationItems3(final AllocationItem obj)
	{
		this.addToManyTarget("allocationItems3", obj, true);
	}

	public void removeFromAllocationItems3(final AllocationItem obj)
	{
		this.removeToManyTarget("allocationItems3", obj, true);
	}

	@SuppressWarnings("unchecked")
	public List<AllocationItem> getAllocationItems3()
	{
		return (List<AllocationItem>) this.readProperty("allocationItems3");
	}

	public void addToAllocationWorldScales(final AllocationWorldScale obj)
	{
		this.addToManyTarget("allocationWorldScales", obj, true);
	}

	public void removeFromAllocationWorldScales(final AllocationWorldScale obj)
	{
		this.removeToManyTarget("allocationWorldScales", obj, true);
	}

	@SuppressWarnings("unchecked")
	public List<AllocationWorldScale> getAllocationWorldScales()
	{
		return (List<AllocationWorldScale>) this.readProperty("allocationWorldScales");
	}

	public void addToAllocationWorldScales1(final AllocationWorldScale obj)
	{
		this.addToManyTarget("allocationWorldScales1", obj, true);
	}

	public void removeFromAllocationWorldScales1(final AllocationWorldScale obj)
	{
		this.removeToManyTarget("allocationWorldScales1", obj, true);
	}

	@SuppressWarnings("unchecked")
	public List<AllocationWorldScale> getAllocationWorldScales1()
	{
		return (List<AllocationWorldScale>) this.readProperty("allocationWorldScales1");
	}

	public void addToAllocationWorldScales2(final AllocationWorldScale obj)
	{
		this.addToManyTarget("allocationWorldScales2", obj, true);
	}

	public void removeFromAllocationWorldScales2(final AllocationWorldScale obj)
	{
		this.removeToManyTarget("allocationWorldScales2", obj, true);
	}

	@SuppressWarnings("unchecked")
	public List<AllocationWorldScale> getAllocationWorldScales2()
	{
		return (List<AllocationWorldScale>) this.readProperty("allocationWorldScales2");
	}

	public void addToAllocationWorldScales3(final AllocationWorldScale obj)
	{
		this.addToManyTarget("allocationWorldScales3", obj, true);
	}

	public void removeFromAllocationWorldScales3(final AllocationWorldScale obj)
	{
		this.removeToManyTarget("allocationWorldScales3", obj, true);
	}

	@SuppressWarnings("unchecked")
	public List<AllocationWorldScale> getAllocationWorldScales3()
	{
		return (List<AllocationWorldScale>) this.readProperty("allocationWorldScales3");
	}

	public void addToAllocations(final Allocation obj)
	{
		this.addToManyTarget("allocations", obj, true);
	}

	public void removeFromAllocations(final Allocation obj)
	{
		this.removeToManyTarget("allocations", obj, true);
	}

	@SuppressWarnings("unchecked")
	public List<Allocation> getAllocations()
	{
		return (List<Allocation>) this.readProperty("allocations");
	}

	public void addToAllocations1(final Allocation obj)
	{
		this.addToManyTarget("allocations1", obj, true);
	}

	public void removeFromAllocations1(final Allocation obj)
	{
		this.removeToManyTarget("allocations1", obj, true);
	}

	@SuppressWarnings("unchecked")
	public List<Allocation> getAllocations1()
	{
		return (List<Allocation>) this.readProperty("allocations1");
	}

	public void addToBrokerCommissionDefaults(final BrokerCommissionDefault obj)
	{
		this.addToManyTarget("brokerCommissionDefaults", obj, true);
	}

	public void removeFromBrokerCommissionDefaults(final BrokerCommissionDefault obj)
	{
		this.removeToManyTarget("brokerCommissionDefaults", obj, true);
	}

	@SuppressWarnings("unchecked")
	public List<BrokerCommissionDefault> getBrokerCommissionDefaults()
	{
		return (List<BrokerCommissionDefault>) this.readProperty("brokerCommissionDefaults");
	}

	public void addToBunkerPurPriceLookups(final BunkerPurPriceLookup obj)
	{
		this.addToManyTarget("bunkerPurPriceLookups", obj, true);
	}

	public void removeFromBunkerPurPriceLookups(final BunkerPurPriceLookup obj)
	{
		this.removeToManyTarget("bunkerPurPriceLookups", obj, true);
	}

	@SuppressWarnings("unchecked")
	public List<BunkerPurPriceLookup> getBunkerPurPriceLookups()
	{
		return (List<BunkerPurPriceLookup>) this.readProperty("bunkerPurPriceLookups");
	}

	public void addToCommodityLocations(final CommodityLocation obj)
	{
		this.addToManyTarget("commodityLocations", obj, true);
	}

	public void removeFromCommodityLocations(final CommodityLocation obj)
	{
		this.removeToManyTarget("commodityLocations", obj, true);
	}

	@SuppressWarnings("unchecked")
	public List<CommodityLocation> getCommodityLocations()
	{
		return (List<CommodityLocation>) this.readProperty("commodityLocations");
	}

	public void addToDeskLocations(final DeskLocation obj)
	{
		this.addToManyTarget("deskLocations", obj, true);
	}

	public void removeFromDeskLocations(final DeskLocation obj)
	{
		this.removeToManyTarget("deskLocations", obj, true);
	}

	@SuppressWarnings("unchecked")
	public List<DeskLocation> getDeskLocations()
	{
		return (List<DeskLocation>) this.readProperty("deskLocations");
	}

	public void addToExposures(final Exposure obj)
	{
		this.addToManyTarget("exposures", obj, true);
	}

	public void removeFromExposures(final Exposure obj)
	{
		this.removeToManyTarget("exposures", obj, true);
	}

	@SuppressWarnings("unchecked")
	public List<Exposure> getExposures()
	{
		return (List<Exposure>) this.readProperty("exposures");
	}

	public void addToFacilities(final Facility obj)
	{
		this.addToManyTarget("facilities", obj, true);
	}

	public void removeFromFacilities(final Facility obj)
	{
		this.removeToManyTarget("facilities", obj, true);
	}

	@SuppressWarnings("unchecked")
	public List<Facility> getFacilities()
	{
		return (List<Facility>) this.readProperty("facilities");
	}

	public void addToForecastValues(final ForecastValue obj)
	{
		this.addToManyTarget("forecastValues", obj, true);
	}

	public void removeFromForecastValues(final ForecastValue obj)
	{
		this.removeToManyTarget("forecastValues", obj, true);
	}

	@SuppressWarnings("unchecked")
	public List<ForecastValue> getForecastValues()
	{
		return (List<ForecastValue>) this.readProperty("forecastValues");
	}

	public void addToFormulaComponentExts(final FormulaComponentExt obj)
	{
		this.addToManyTarget("formulaComponentExts", obj, true);
	}

	public void removeFromFormulaComponentExts(final FormulaComponentExt obj)
	{
		this.removeToManyTarget("formulaComponentExts", obj, true);
	}

	@SuppressWarnings("unchecked")
	public List<FormulaComponentExt> getFormulaComponentExts()
	{
		return (List<FormulaComponentExt>) this.readProperty("formulaComponentExts");
	}

	public void addToIctsUsers(final IctsUser obj)
	{
		this.addToManyTarget("ictsUsers", obj, true);
	}

	public void removeFromIctsUsers(final IctsUser obj)
	{
		this.removeToManyTarget("ictsUsers", obj, true);
	}

	@SuppressWarnings("unchecked")
	public List<IctsUser> getIctsUsers()
	{
		return (List<IctsUser>) this.readProperty("ictsUsers");
	}

	public void addToInvCreditExposures(final InvCreditExposure obj)
	{
		this.addToManyTarget("invCreditExposures", obj, true);
	}

	public void removeFromInvCreditExposures(final InvCreditExposure obj)
	{
		this.removeToManyTarget("invCreditExposures", obj, true);
	}

	@SuppressWarnings("unchecked")
	public List<InvCreditExposure> getInvCreditExposures()
	{
		return (List<InvCreditExposure>) this.readProperty("invCreditExposures");
	}

	public void addToInventories(final Inventory obj)
	{
		this.addToManyTarget("inventories", obj, true);
	}

	public void removeFromInventories(final Inventory obj)
	{
		this.removeToManyTarget("inventories", obj, true);
	}

	@SuppressWarnings("unchecked")
	public List<Inventory> getInventories()
	{
		return (List<Inventory>) this.readProperty("inventories");
	}

	public void addToInventoryRollCriterias(final InventoryRollCriteria obj)
	{
		this.addToManyTarget("inventoryRollCriterias", obj, true);
	}

	public void removeFromInventoryRollCriterias(final InventoryRollCriteria obj)
	{
		this.removeToManyTarget("inventoryRollCriterias", obj, true);
	}

	@SuppressWarnings("unchecked")
	public List<InventoryRollCriteria> getInventoryRollCriterias()
	{
		return (List<InventoryRollCriteria>) this.readProperty("inventoryRollCriterias");
	}

	public void addToLcs(final Lc obj)
	{
		this.addToManyTarget("lcs", obj, true);
	}

	public void removeFromLcs(final Lc obj)
	{
		this.removeToManyTarget("lcs", obj, true);
	}

	@SuppressWarnings("unchecked")
	public List<Lc> getLcs()
	{
		return (List<Lc>) this.readProperty("lcs");
	}

	public void setLocation(final LocationExtInfo location)
	{
		this.setToOneTarget("location", location, true);
	}

	public LocationExtInfo getLocation()
	{
		return (LocationExtInfo) this.readProperty("location");
	}

	public void addToLocationAliass(final LocationAlias obj)
	{
		this.addToManyTarget("locationAliass", obj, true);
	}

	public void removeFromLocationAliass(final LocationAlias obj)
	{
		this.removeToManyTarget("locationAliass", obj, true);
	}

	@SuppressWarnings("unchecked")
	public List<LocationAlias> getLocationAliass()
	{
		return (List<LocationAlias>) this.readProperty("locationAliass");
	}

	public void addToLocationDatas(final LocationData obj)
	{
		this.addToManyTarget("locationDatas", obj, true);
	}

	public void removeFromLocationDatas(final LocationData obj)
	{
		this.removeToManyTarget("locationDatas", obj, true);
	}

	@SuppressWarnings("unchecked")
	public List<LocationData> getLocationDatas()
	{
		return (List<LocationData>) this.readProperty("locationDatas");
	}

	public void addToLocationGroups(final LocationGroup obj)
	{
		this.addToManyTarget("locationGroups", obj, true);
	}

	public void removeFromLocationGroups(final LocationGroup obj)
	{
		this.removeToManyTarget("locationGroups", obj, true);
	}

	@SuppressWarnings("unchecked")
	public List<LocationGroup> getLocationGroups()
	{
		return (List<LocationGroup>) this.readProperty("locationGroups");
	}

	public void addToLocationGroups1(final LocationGroup obj)
	{
		this.addToManyTarget("locationGroups1", obj, true);
	}

	public void removeFromLocationGroups1(final LocationGroup obj)
	{
		this.removeToManyTarget("locationGroups1", obj, true);
	}

	@SuppressWarnings("unchecked")
	public List<LocationGroup> getLocationGroups1()
	{
		return (List<LocationGroup>) this.readProperty("locationGroups1");
	}

	public void addToLocationTankInfoes(final LocationTankInfo obj)
	{
		this.addToManyTarget("locationTankInfoes", obj, true);
	}

	public void removeFromLocationTankInfoes(final LocationTankInfo obj)
	{
		this.removeToManyTarget("locationTankInfoes", obj, true);
	}

	@SuppressWarnings("unchecked")
	public List<LocationTankInfo> getLocationTankInfoes()
	{
		return (List<LocationTankInfo>) this.readProperty("locationTankInfoes");
	}

	public void addToMotLocationTariffs(final MotLocationTariff obj)
	{
		this.addToManyTarget("motLocationTariffs", obj, true);
	}

	public void removeFromMotLocationTariffs(final MotLocationTariff obj)
	{
		this.removeToManyTarget("motLocationTariffs", obj, true);
	}

	@SuppressWarnings("unchecked")
	public List<MotLocationTariff> getMotLocationTariffs()
	{
		return (List<MotLocationTariff>) this.readProperty("motLocationTariffs");
	}

	public void addToMotLocations(final MotLocation obj)
	{
		this.addToManyTarget("motLocations", obj, true);
	}

	public void removeFromMotLocations(final MotLocation obj)
	{
		this.removeToManyTarget("motLocations", obj, true);
	}

	@SuppressWarnings("unchecked")
	public List<MotLocation> getMotLocations()
	{
		return (List<MotLocation>) this.readProperty("motLocations");
	}

	public void addToMots(final Mot obj)
	{
		this.addToManyTarget("mots", obj, true);
	}

	public void removeFromMots(final Mot obj)
	{
		this.removeToManyTarget("mots", obj, true);
	}

	@SuppressWarnings("unchecked")
	public List<Mot> getMots()
	{
		return (List<Mot>) this.readProperty("mots");
	}

	public void addToParcels(final Parcel obj)
	{
		this.addToManyTarget("parcels", obj, true);
	}

	public void removeFromParcels(final Parcel obj)
	{
		this.removeToManyTarget("parcels", obj, true);
	}

	@SuppressWarnings("unchecked")
	public List<Parcel> getParcels()
	{
		return (List<Parcel>) this.readProperty("parcels");
	}

	public void addToParentGuarantees(final ParentGuarantee obj)
	{
		this.addToManyTarget("parentGuarantees", obj, true);
	}

	public void removeFromParentGuarantees(final ParentGuarantee obj)
	{
		this.removeToManyTarget("parentGuarantees", obj, true);
	}

	@SuppressWarnings("unchecked")
	public List<ParentGuarantee> getParentGuarantees()
	{
		return (List<ParentGuarantee>) this.readProperty("parentGuarantees");
	}

	public void addToPaths(final Path obj)
	{
		this.addToManyTarget("paths", obj, true);
	}

	public void removeFromPaths(final Path obj)
	{
		this.removeToManyTarget("paths", obj, true);
	}

	@SuppressWarnings("unchecked")
	public List<Path> getPaths()
	{
		return (List<Path>) this.readProperty("paths");
	}

	public void addToPaths1(final Path obj)
	{
		this.addToManyTarget("paths1", obj, true);
	}

	public void removeFromPaths1(final Path obj)
	{
		this.removeToManyTarget("paths1", obj, true);
	}

	@SuppressWarnings("unchecked")
	public List<Path> getPaths1()
	{
		return (List<Path>) this.readProperty("paths1");
	}

	public void addToQuotes(final Quote obj)
	{
		this.addToManyTarget("quotes", obj, true);
	}

	public void removeFromQuotes(final Quote obj)
	{
		this.removeToManyTarget("quotes", obj, true);
	}

	@SuppressWarnings("unchecked")
	public List<Quote> getQuotes()
	{
		return (List<Quote>) this.readProperty("quotes");
	}

	public void addToRailcarPtpRates(final RailcarPtpRate obj)
	{
		this.addToManyTarget("railcarPtpRates", obj, true);
	}

	public void removeFromRailcarPtpRates(final RailcarPtpRate obj)
	{
		this.removeToManyTarget("railcarPtpRates", obj, true);
	}

	@SuppressWarnings("unchecked")
	public List<RailcarPtpRate> getRailcarPtpRates()
	{
		return (List<RailcarPtpRate>) this.readProperty("railcarPtpRates");
	}

	public void addToRailcarPtpRates1(final RailcarPtpRate obj)
	{
		this.addToManyTarget("railcarPtpRates1", obj, true);
	}

	public void removeFromRailcarPtpRates1(final RailcarPtpRate obj)
	{
		this.removeToManyTarget("railcarPtpRates1", obj, true);
	}

	@SuppressWarnings("unchecked")
	public List<RailcarPtpRate> getRailcarPtpRates1()
	{
		return (List<RailcarPtpRate>) this.readProperty("railcarPtpRates1");
	}

	public void addToRecapItems(final RecapItem obj)
	{
		this.addToManyTarget("recapItems", obj, true);
	}

	public void removeFromRecapItems(final RecapItem obj)
	{
		this.removeToManyTarget("recapItems", obj, true);
	}

	@SuppressWarnings("unchecked")
	public List<RecapItem> getRecapItems()
	{
		return (List<RecapItem>) this.readProperty("recapItems");
	}

	public void addToRiskCovers(final RiskCover obj)
	{
		this.addToManyTarget("riskCovers", obj, true);
	}

	public void removeFromRiskCovers(final RiskCover obj)
	{
		this.removeToManyTarget("riskCovers", obj, true);
	}

	@SuppressWarnings("unchecked")
	public List<RiskCover> getRiskCovers()
	{
		return (List<RiskCover>) this.readProperty("riskCovers");
	}

	public void addToScenarios(final Scenario obj)
	{
		this.addToManyTarget("scenarios", obj, true);
	}

	public void removeFromScenarios(final Scenario obj)
	{
		this.removeToManyTarget("scenarios", obj, true);
	}

	@SuppressWarnings("unchecked")
	public List<Scenario> getScenarios()
	{
		return (List<Scenario>) this.readProperty("scenarios");
	}

	public void addToShipments(final Shipment obj)
	{
		this.addToManyTarget("shipments", obj, true);
	}

	public void removeFromShipments(final Shipment obj)
	{
		this.removeToManyTarget("shipments", obj, true);
	}

	@SuppressWarnings("unchecked")
	public List<Shipment> getShipments()
	{
		return (List<Shipment>) this.readProperty("shipments");
	}

	public void addToShipments1(final Shipment obj)
	{
		this.addToManyTarget("shipments1", obj, true);
	}

	public void removeFromShipments1(final Shipment obj)
	{
		this.removeToManyTarget("shipments1", obj, true);
	}

	@SuppressWarnings("unchecked")
	public List<Shipment> getShipments1()
	{
		return (List<Shipment>) this.readProperty("shipments1");
	}

	public void addToTaxLocations(final TaxLocation obj)
	{
		this.addToManyTarget("taxLocations", obj, true);
	}

	public void removeFromTaxLocations(final TaxLocation obj)
	{
		this.removeToManyTarget("taxLocations", obj, true);
	}

	@SuppressWarnings("unchecked")
	public List<TaxLocation> getTaxLocations()
	{
		return (List<TaxLocation>) this.readProperty("taxLocations");
	}

	public void addToTaxRates(final TaxRate obj)
	{
		this.addToManyTarget("taxRates", obj, true);
	}

	public void removeFromTaxRates(final TaxRate obj)
	{
		this.removeToManyTarget("taxRates", obj, true);
	}

	@SuppressWarnings("unchecked")
	public List<TaxRate> getTaxRates()
	{
		return (List<TaxRate>) this.readProperty("taxRates");
	}

	public void addToTempValueAdjusts(final TempValueAdjust obj)
	{
		this.addToManyTarget("tempValueAdjusts", obj, true);
	}

	public void removeFromTempValueAdjusts(final TempValueAdjust obj)
	{
		this.removeToManyTarget("tempValueAdjusts", obj, true);
	}

	@SuppressWarnings("unchecked")
	public List<TempValueAdjust> getTempValueAdjusts()
	{
		return (List<TempValueAdjust>) this.readProperty("tempValueAdjusts");
	}

	public void addToTradeItemBunkers(final TradeItemBunker obj)
	{
		this.addToManyTarget("tradeItemBunkers", obj, true);
	}

	public void removeFromTradeItemBunkers(final TradeItemBunker obj)
	{
		this.removeToManyTarget("tradeItemBunkers", obj, true);
	}

	@SuppressWarnings("unchecked")
	public List<TradeItemBunker> getTradeItemBunkers()
	{
		return (List<TradeItemBunker>) this.readProperty("tradeItemBunkers");
	}

	public void addToTradeItemBunkers1(final TradeItemBunker obj)
	{
		this.addToManyTarget("tradeItemBunkers1", obj, true);
	}

	public void removeFromTradeItemBunkers1(final TradeItemBunker obj)
	{
		this.removeToManyTarget("tradeItemBunkers1", obj, true);
	}

	@SuppressWarnings("unchecked")
	public List<TradeItemBunker> getTradeItemBunkers1()
	{
		return (List<TradeItemBunker>) this.readProperty("tradeItemBunkers1");
	}

	public void addToTradeItemComposites(final TradeItemComposite obj)
	{
		this.addToManyTarget("tradeItemComposites", obj, true);
	}

	public void removeFromTradeItemComposites(final TradeItemComposite obj)
	{
		this.removeToManyTarget("tradeItemComposites", obj, true);
	}

	@SuppressWarnings("unchecked")
	public List<TradeItemComposite> getTradeItemComposites()
	{
		return (List<TradeItemComposite>) this.readProperty("tradeItemComposites");
	}

	public void addToTradeItemComposites1(final TradeItemComposite obj)
	{
		this.addToManyTarget("tradeItemComposites1", obj, true);
	}

	public void removeFromTradeItemComposites1(final TradeItemComposite obj)
	{
		this.removeToManyTarget("tradeItemComposites1", obj, true);
	}

	@SuppressWarnings("unchecked")
	public List<TradeItemComposite> getTradeItemComposites1()
	{
		return (List<TradeItemComposite>) this.readProperty("tradeItemComposites1");
	}

	public void addToTradeItemDryPhies(final TradeItemDryPhy obj)
	{
		this.addToManyTarget("tradeItemDryPhies", obj, true);
	}

	public void removeFromTradeItemDryPhies(final TradeItemDryPhy obj)
	{
		this.removeToManyTarget("tradeItemDryPhies", obj, true);
	}

	@SuppressWarnings("unchecked")
	public List<TradeItemDryPhy> getTradeItemDryPhies()
	{
		return (List<TradeItemDryPhy>) this.readProperty("tradeItemDryPhies");
	}

	public void addToTradeItemStorages(final TradeItemStorage obj)
	{
		this.addToManyTarget("tradeItemStorages", obj, true);
	}

	public void removeFromTradeItemStorages(final TradeItemStorage obj)
	{
		this.removeToManyTarget("tradeItemStorages", obj, true);
	}

	@SuppressWarnings("unchecked")
	public List<TradeItemStorage> getTradeItemStorages()
	{
		return (List<TradeItemStorage>) this.readProperty("tradeItemStorages");
	}

	public void addToTradeItemWetPhies(final TradeItemWetPhy obj)
	{
		this.addToManyTarget("tradeItemWetPhies", obj, true);
	}

	public void removeFromTradeItemWetPhies(final TradeItemWetPhy obj)
	{
		this.removeToManyTarget("tradeItemWetPhies", obj, true);
	}

	@SuppressWarnings("unchecked")
	public List<TradeItemWetPhy> getTradeItemWetPhies()
	{
		return (List<TradeItemWetPhy>) this.readProperty("tradeItemWetPhies");
	}

	public void addToTradeItems(final TradeItem obj)
	{
		this.addToManyTarget("tradeItems", obj, true);
	}

	public void removeFromTradeItems(final TradeItem obj)
	{
		this.removeToManyTarget("tradeItems", obj, true);
	}

	@SuppressWarnings("unchecked")
	public List<TradeItem> getTradeItems()
	{
		return (List<TradeItem>) this.readProperty("tradeItems");
	}

	public void addToTradeItems1(final TradeItem obj)
	{
		this.addToManyTarget("tradeItems1", obj, true);
	}

	public void removeFromTradeItems1(final TradeItem obj)
	{
		this.removeToManyTarget("tradeItems1", obj, true);
	}

	@SuppressWarnings("unchecked")
	public List<TradeItem> getTradeItems1()
	{
		return (List<TradeItem>) this.readProperty("tradeItems1");
	}

	public void addToTransportCostSchedules(final TransportCostSchedule obj)
	{
		this.addToManyTarget("transportCostSchedules", obj, true);
	}

	public void removeFromTransportCostSchedules(final TransportCostSchedule obj)
	{
		this.removeToManyTarget("transportCostSchedules", obj, true);
	}

	@SuppressWarnings("unchecked")
	public List<TransportCostSchedule> getTransportCostSchedules()
	{
		return (List<TransportCostSchedule>) this.readProperty("transportCostSchedules");
	}

	public void addToTransportCostSchedules1(final TransportCostSchedule obj)
	{
		this.addToManyTarget("transportCostSchedules1", obj, true);
	}

	public void removeFromTransportCostSchedules1(final TransportCostSchedule obj)
	{
		this.removeToManyTarget("transportCostSchedules1", obj, true);
	}

	@SuppressWarnings("unchecked")
	public List<TransportCostSchedule> getTransportCostSchedules1()
	{
		return (List<TransportCostSchedule>) this.readProperty("transportCostSchedules1");
	}

}