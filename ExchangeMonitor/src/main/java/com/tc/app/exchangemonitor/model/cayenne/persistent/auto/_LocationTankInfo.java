package com.tc.app.exchangemonitor.model.cayenne.persistent.auto;

import java.math.BigDecimal;
import java.util.List;

import org.apache.cayenne.CayenneDataObject;
import org.apache.cayenne.exp.Property;

import com.tc.app.exchangemonitor.model.cayenne.persistent.Account;
import com.tc.app.exchangemonitor.model.cayenne.persistent.AiEstActualVat;
import com.tc.app.exchangemonitor.model.cayenne.persistent.AllocationItemTransport;
import com.tc.app.exchangemonitor.model.cayenne.persistent.AllocationItemVat;
import com.tc.app.exchangemonitor.model.cayenne.persistent.Country;
import com.tc.app.exchangemonitor.model.cayenne.persistent.FacilityTankGroup;
import com.tc.app.exchangemonitor.model.cayenne.persistent.Location;
import com.tc.app.exchangemonitor.model.cayenne.persistent.LocationTankInfoAlias;
import com.tc.app.exchangemonitor.model.cayenne.persistent.State;
import com.tc.app.exchangemonitor.model.cayenne.persistent.TradeItemDryPhy;
import com.tc.app.exchangemonitor.model.cayenne.persistent.TradeItemStorage;
import com.tc.app.exchangemonitor.model.cayenne.persistent.TradeItemWetPhy;
import com.tc.app.exchangemonitor.model.cayenne.persistent.Uom;

/**
 * Class _LocationTankInfo was generated by Cayenne.
 * It is probably a good idea to avoid changing this class manually,
 * since it may be overwritten next time code is regenerated.
 * If you need to make any customizations, please use subclass.
 */
public abstract class _LocationTankInfo extends CayenneDataObject
{

	private static final long serialVersionUID = 1L;

	public static final String TANK_NUM_PK_COLUMN = "tank_num";

	public static final Property<String> ADDRESS_LINE1 = new Property<>("addressLine1");
	public static final Property<String> ADDRESS_LINE2 = new Property<>("addressLine2");
	public static final Property<String> API_WELL_NUM = new Property<>("apiWellNum");
	public static final Property<String> BATTERY_GOVT_CODE = new Property<>("batteryGovtCode");
	public static final Property<Boolean> BONDED_WAREHOUSE_LOC_IND = new Property<>("bondedWarehouseLocInd");
	public static final Property<String> CITY_CODE = new Property<>("cityCode");
	public static final Property<Boolean> CONFIRMATION_STATUS = new Property<>("confirmationStatus");
	public static final Property<String> COUNTY_CODE = new Property<>("countyCode");
	public static final Property<String> EXCISE_INFO_ID = new Property<>("exciseInfoId");
	public static final Property<Boolean> EXCISE_WAREHOUSE_LOC_IND = new Property<>("exciseWarehouseLocInd");
	public static final Property<String> FIELD_NAME = new Property<>("fieldName");
	public static final Property<Boolean> FIRST_PURCHASER_IND = new Property<>("firstPurchaserInd");
	public static final Property<String> GEOLOGIC_FORMATION = new Property<>("geologicFormation");
	public static final Property<BigDecimal> LATITUDE = new Property<>("latitude");
	public static final Property<String> LEGAL_DESC = new Property<>("legalDesc");
	public static final Property<String> LOCATION_TANK_INFO_TYPE = new Property<>("locationTankInfoType");
	public static final Property<String> LONG_DESCRIPTION = new Property<>("longDescription");
	public static final Property<BigDecimal> LONGITUDE = new Property<>("longitude");
	public static final Property<String> METER_NUM = new Property<>("meterNum");
	public static final Property<String> POSTAL_CODE = new Property<>("postalCode");
	public static final Property<String> STATUS = new Property<>("status");
	public static final Property<String> SURVEY_ADDRESS = new Property<>("surveyAddress");
	public static final Property<BigDecimal> TANK_CAPACITY = new Property<>("tankCapacity");
	public static final Property<Integer> TRANS_ID = new Property<>("transId");
	public static final Property<String> WELL_NAME = new Property<>("wellName");
	public static final Property<Account> ACCOUNT = new Property<>("account");
	public static final Property<Account> ACCOUNT1 = new Property<>("account1");
	public static final Property<List<AiEstActualVat>> AI_EST_ACTUAL_VATS = new Property<>("aiEstActualVats");
	public static final Property<List<AllocationItemTransport>> ALLOCATION_ITEM_TRANSPORTS = new Property<>("allocationItemTransports");
	public static final Property<List<AllocationItemVat>> ALLOCATION_ITEM_VATS = new Property<>("allocationItemVats");
	public static final Property<Country> COUNTRY = new Property<>("country");
	public static final Property<List<FacilityTankGroup>> FACILITY_TANK_GROUPS = new Property<>("facilityTankGroups");
	public static final Property<Location> LOCATION = new Property<>("location");
	public static final Property<List<LocationTankInfoAlias>> LOCATION_TANK_INFO_ALIASS = new Property<>("locationTankInfoAliass");
	public static final Property<State> STATE = new Property<>("state");
	public static final Property<List<TradeItemDryPhy>> TRADE_ITEM_DRY_PHIES = new Property<>("tradeItemDryPhies");
	public static final Property<List<TradeItemStorage>> TRADE_ITEM_STORAGES = new Property<>("tradeItemStorages");
	public static final Property<List<TradeItemWetPhy>> TRADE_ITEM_WET_PHIES = new Property<>("tradeItemWetPhies");
	public static final Property<Uom> UOM = new Property<>("uom");

	public void setAddressLine1(final String addressLine1)
	{
		this.writeProperty("addressLine1", addressLine1);
	}

	public String getAddressLine1()
	{
		return (String) this.readProperty("addressLine1");
	}

	public void setAddressLine2(final String addressLine2)
	{
		this.writeProperty("addressLine2", addressLine2);
	}

	public String getAddressLine2()
	{
		return (String) this.readProperty("addressLine2");
	}

	public void setApiWellNum(final String apiWellNum)
	{
		this.writeProperty("apiWellNum", apiWellNum);
	}

	public String getApiWellNum()
	{
		return (String) this.readProperty("apiWellNum");
	}

	public void setBatteryGovtCode(final String batteryGovtCode)
	{
		this.writeProperty("batteryGovtCode", batteryGovtCode);
	}

	public String getBatteryGovtCode()
	{
		return (String) this.readProperty("batteryGovtCode");
	}

	public void setBondedWarehouseLocInd(final Boolean bondedWarehouseLocInd)
	{
		this.writeProperty("bondedWarehouseLocInd", bondedWarehouseLocInd);
	}

	public Boolean getBondedWarehouseLocInd()
	{
		return (Boolean) this.readProperty("bondedWarehouseLocInd");
	}

	public void setCityCode(final String cityCode)
	{
		this.writeProperty("cityCode", cityCode);
	}

	public String getCityCode()
	{
		return (String) this.readProperty("cityCode");
	}

	public void setConfirmationStatus(final Boolean confirmationStatus)
	{
		this.writeProperty("confirmationStatus", confirmationStatus);
	}

	public Boolean getConfirmationStatus()
	{
		return (Boolean) this.readProperty("confirmationStatus");
	}

	public void setCountyCode(final String countyCode)
	{
		this.writeProperty("countyCode", countyCode);
	}

	public String getCountyCode()
	{
		return (String) this.readProperty("countyCode");
	}

	public void setExciseInfoId(final String exciseInfoId)
	{
		this.writeProperty("exciseInfoId", exciseInfoId);
	}

	public String getExciseInfoId()
	{
		return (String) this.readProperty("exciseInfoId");
	}

	public void setExciseWarehouseLocInd(final Boolean exciseWarehouseLocInd)
	{
		this.writeProperty("exciseWarehouseLocInd", exciseWarehouseLocInd);
	}

	public Boolean getExciseWarehouseLocInd()
	{
		return (Boolean) this.readProperty("exciseWarehouseLocInd");
	}

	public void setFieldName(final String fieldName)
	{
		this.writeProperty("fieldName", fieldName);
	}

	public String getFieldName()
	{
		return (String) this.readProperty("fieldName");
	}

	public void setFirstPurchaserInd(final Boolean firstPurchaserInd)
	{
		this.writeProperty("firstPurchaserInd", firstPurchaserInd);
	}

	public Boolean getFirstPurchaserInd()
	{
		return (Boolean) this.readProperty("firstPurchaserInd");
	}

	public void setGeologicFormation(final String geologicFormation)
	{
		this.writeProperty("geologicFormation", geologicFormation);
	}

	public String getGeologicFormation()
	{
		return (String) this.readProperty("geologicFormation");
	}

	public void setLatitude(final BigDecimal latitude)
	{
		this.writeProperty("latitude", latitude);
	}

	public BigDecimal getLatitude()
	{
		return (BigDecimal) this.readProperty("latitude");
	}

	public void setLegalDesc(final String legalDesc)
	{
		this.writeProperty("legalDesc", legalDesc);
	}

	public String getLegalDesc()
	{
		return (String) this.readProperty("legalDesc");
	}

	public void setLocationTankInfoType(final String locationTankInfoType)
	{
		this.writeProperty("locationTankInfoType", locationTankInfoType);
	}

	public String getLocationTankInfoType()
	{
		return (String) this.readProperty("locationTankInfoType");
	}

	public void setLongDescription(final String longDescription)
	{
		this.writeProperty("longDescription", longDescription);
	}

	public String getLongDescription()
	{
		return (String) this.readProperty("longDescription");
	}

	public void setLongitude(final BigDecimal longitude)
	{
		this.writeProperty("longitude", longitude);
	}

	public BigDecimal getLongitude()
	{
		return (BigDecimal) this.readProperty("longitude");
	}

	public void setMeterNum(final String meterNum)
	{
		this.writeProperty("meterNum", meterNum);
	}

	public String getMeterNum()
	{
		return (String) this.readProperty("meterNum");
	}

	public void setPostalCode(final String postalCode)
	{
		this.writeProperty("postalCode", postalCode);
	}

	public String getPostalCode()
	{
		return (String) this.readProperty("postalCode");
	}

	public void setStatus(final String status)
	{
		this.writeProperty("status", status);
	}

	public String getStatus()
	{
		return (String) this.readProperty("status");
	}

	public void setSurveyAddress(final String surveyAddress)
	{
		this.writeProperty("surveyAddress", surveyAddress);
	}

	public String getSurveyAddress()
	{
		return (String) this.readProperty("surveyAddress");
	}

	public void setTankCapacity(final BigDecimal tankCapacity)
	{
		this.writeProperty("tankCapacity", tankCapacity);
	}

	public BigDecimal getTankCapacity()
	{
		return (BigDecimal) this.readProperty("tankCapacity");
	}

	public void setTransId(final Integer transId)
	{
		this.writeProperty("transId", transId);
	}

	public Integer getTransId()
	{
		return (Integer) this.readProperty("transId");
	}

	public void setWellName(final String wellName)
	{
		this.writeProperty("wellName", wellName);
	}

	public String getWellName()
	{
		return (String) this.readProperty("wellName");
	}

	public void setAccount(final Account account)
	{
		this.setToOneTarget("account", account, true);
	}

	public Account getAccount()
	{
		return (Account) this.readProperty("account");
	}

	public void setAccount1(final Account account1)
	{
		this.setToOneTarget("account1", account1, true);
	}

	public Account getAccount1()
	{
		return (Account) this.readProperty("account1");
	}

	public void addToAiEstActualVats(final AiEstActualVat obj)
	{
		this.addToManyTarget("aiEstActualVats", obj, true);
	}

	public void removeFromAiEstActualVats(final AiEstActualVat obj)
	{
		this.removeToManyTarget("aiEstActualVats", obj, true);
	}

	@SuppressWarnings("unchecked")
	public List<AiEstActualVat> getAiEstActualVats()
	{
		return (List<AiEstActualVat>) this.readProperty("aiEstActualVats");
	}

	public void addToAllocationItemTransports(final AllocationItemTransport obj)
	{
		this.addToManyTarget("allocationItemTransports", obj, true);
	}

	public void removeFromAllocationItemTransports(final AllocationItemTransport obj)
	{
		this.removeToManyTarget("allocationItemTransports", obj, true);
	}

	@SuppressWarnings("unchecked")
	public List<AllocationItemTransport> getAllocationItemTransports()
	{
		return (List<AllocationItemTransport>) this.readProperty("allocationItemTransports");
	}

	public void addToAllocationItemVats(final AllocationItemVat obj)
	{
		this.addToManyTarget("allocationItemVats", obj, true);
	}

	public void removeFromAllocationItemVats(final AllocationItemVat obj)
	{
		this.removeToManyTarget("allocationItemVats", obj, true);
	}

	@SuppressWarnings("unchecked")
	public List<AllocationItemVat> getAllocationItemVats()
	{
		return (List<AllocationItemVat>) this.readProperty("allocationItemVats");
	}

	public void setCountry(final Country country)
	{
		this.setToOneTarget("country", country, true);
	}

	public Country getCountry()
	{
		return (Country) this.readProperty("country");
	}

	public void addToFacilityTankGroups(final FacilityTankGroup obj)
	{
		this.addToManyTarget("facilityTankGroups", obj, true);
	}

	public void removeFromFacilityTankGroups(final FacilityTankGroup obj)
	{
		this.removeToManyTarget("facilityTankGroups", obj, true);
	}

	@SuppressWarnings("unchecked")
	public List<FacilityTankGroup> getFacilityTankGroups()
	{
		return (List<FacilityTankGroup>) this.readProperty("facilityTankGroups");
	}

	public void setLocation(final Location location)
	{
		this.setToOneTarget("location", location, true);
	}

	public Location getLocation()
	{
		return (Location) this.readProperty("location");
	}

	public void addToLocationTankInfoAliass(final LocationTankInfoAlias obj)
	{
		this.addToManyTarget("locationTankInfoAliass", obj, true);
	}

	public void removeFromLocationTankInfoAliass(final LocationTankInfoAlias obj)
	{
		this.removeToManyTarget("locationTankInfoAliass", obj, true);
	}

	@SuppressWarnings("unchecked")
	public List<LocationTankInfoAlias> getLocationTankInfoAliass()
	{
		return (List<LocationTankInfoAlias>) this.readProperty("locationTankInfoAliass");
	}

	public void setState(final State state)
	{
		this.setToOneTarget("state", state, true);
	}

	public State getState()
	{
		return (State) this.readProperty("state");
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

	public void setUom(final Uom uom)
	{
		this.setToOneTarget("uom", uom, true);
	}

	public Uom getUom()
	{
		return (Uom) this.readProperty("uom");
	}

}
