package com.tc.app.exchangemonitor.model.cayenne.persistent.auto;

import java.util.List;

import org.apache.cayenne.CayenneDataObject;
import org.apache.cayenne.exp.Property;

import com.tc.app.exchangemonitor.model.cayenne.persistent.Commodity;
import com.tc.app.exchangemonitor.model.cayenne.persistent.CreditGroup;
import com.tc.app.exchangemonitor.model.cayenne.persistent.TradeItem;
import com.tc.app.exchangemonitor.model.cayenne.persistent.AccountCreditInfo;
import com.tc.app.exchangemonitor.model.cayenne.persistent.AcctFiscalRep;
import com.tc.app.exchangemonitor.model.cayenne.persistent.AcctVatNumber;
import com.tc.app.exchangemonitor.model.cayenne.persistent.AiEstActualVat;
import com.tc.app.exchangemonitor.model.cayenne.persistent.AllocItemImpExp;
import com.tc.app.exchangemonitor.model.cayenne.persistent.AllocationItemTransport;
import com.tc.app.exchangemonitor.model.cayenne.persistent.AllocationItemVat;
import com.tc.app.exchangemonitor.model.cayenne.persistent.Calendar;
import com.tc.app.exchangemonitor.model.cayenne.persistent.CountryByGroup;
import com.tc.app.exchangemonitor.model.cayenne.persistent.CountryCreditAlarmLog;
import com.tc.app.exchangemonitor.model.cayenne.persistent.CountryExposure;
import com.tc.app.exchangemonitor.model.cayenne.persistent.CreditLimit;
import com.tc.app.exchangemonitor.model.cayenne.persistent.Exposure;
import com.tc.app.exchangemonitor.model.cayenne.persistent.LocationExtInfo;
import com.tc.app.exchangemonitor.model.cayenne.persistent.LocationTankInfo;
import com.tc.app.exchangemonitor.model.cayenne.persistent.VatDeclaration;

/**
 * Class _Country was generated by Cayenne.
 * It is probably a good idea to avoid changing this class manually,
 * since it may be overwritten next time code is regenerated.
 * If you need to make any customizations, please use subclass.
 */
public abstract class _Country extends CayenneDataObject
{

	private static final long serialVersionUID = 1L;

	public static final String COUNTRY_CODE_PK_COLUMN = "country_code";

	public static final Property<Integer> CMNT_NUM = new Property<>("cmntNum");
	public static final Property<Double> COUNTRY_LIMIT_AMT = new Property<>("countryLimitAmt");
	public static final Property<Double> COUNTRY_LIMIT_UTIL_AMT = new Property<>("countryLimitUtilAmt");
	public static final Property<String> COUNTRY_NAME = new Property<>("countryName");
	public static final Property<Short> COUNTRY_NUM = new Property<>("countryNum");
	public static final Property<String> COUNTRY_STATUS = new Property<>("countryStatus");
	public static final Property<String> EXPOSURE_PRIORITY_CODE = new Property<>("exposurePriorityCode");
	public static final Property<String> EXT_CURR_CODE = new Property<>("extCurrCode");
	public static final Property<String> INT_CURR_CODE = new Property<>("intCurrCode");
	public static final Property<String> ISO_COUNTRY_CODE = new Property<>("isoCountryCode");
	public static final Property<String> NO_BUS_IND = new Property<>("noBusInd");
	public static final Property<Integer> TRANS_ID = new Property<>("transId");
	public static final Property<List<AccountCreditInfo>> ACCOUNT_CREDIT_INFOES = new Property<>("accountCreditInfoes");
	public static final Property<List<AccountCreditInfo>> ACCOUNT_CREDIT_INFOES1 = new Property<>("accountCreditInfoes1");
	public static final Property<List<AcctFiscalRep>> ACCT_FISCAL_REPS = new Property<>("acctFiscalReps");
	public static final Property<List<AcctVatNumber>> ACCT_VAT_NUMBERS = new Property<>("acctVatNumbers");
	public static final Property<List<AiEstActualVat>> AI_EST_ACTUAL_VATS = new Property<>("aiEstActualVats");
	public static final Property<List<AiEstActualVat>> AI_EST_ACTUAL_VATS1 = new Property<>("aiEstActualVats1");
	public static final Property<List<AiEstActualVat>> AI_EST_ACTUAL_VATS2 = new Property<>("aiEstActualVats2");
	public static final Property<List<AiEstActualVat>> AI_EST_ACTUAL_VATS3 = new Property<>("aiEstActualVats3");
	public static final Property<List<AllocItemImpExp>> ALLOC_ITEM_IMP_EXPS = new Property<>("allocItemImpExps");
	public static final Property<List<AllocationItemTransport>> ALLOCATION_ITEM_TRANSPORTS = new Property<>("allocationItemTransports");
	public static final Property<List<AllocationItemVat>> ALLOCATION_ITEM_VATS = new Property<>("allocationItemVats");
	public static final Property<List<AllocationItemVat>> ALLOCATION_ITEM_VATS1 = new Property<>("allocationItemVats1");
	public static final Property<List<AllocationItemVat>> ALLOCATION_ITEM_VATS2 = new Property<>("allocationItemVats2");
	public static final Property<List<AllocationItemVat>> ALLOCATION_ITEM_VATS3 = new Property<>("allocationItemVats3");
	public static final Property<Calendar> CALENDAR = new Property<>("calendar");
	public static final Property<List<Commodity>> COMMODITIES = new Property<>("commodities");
	public static final Property<CountryExposure> COUNTRY = new Property<>("country");
	public static final Property<List<CountryByGroup>> COUNTRY_BY_GROUPS = new Property<>("countryByGroups");
	public static final Property<List<CountryCreditAlarmLog>> COUNTRY_CREDIT_ALARM_LOGS = new Property<>("countryCreditAlarmLogs");
	public static final Property<List<CreditGroup>> CREDIT_GROUPS = new Property<>("creditGroups");
	public static final Property<List<CreditLimit>> CREDIT_LIMITS = new Property<>("creditLimits");
	public static final Property<List<Exposure>> EXPOSURES = new Property<>("exposures");
	public static final Property<List<LocationExtInfo>> LOCATION_EXT_INFOES = new Property<>("locationExtInfoes");
	public static final Property<List<LocationTankInfo>> LOCATION_TANK_INFOES = new Property<>("locationTankInfoes");
	public static final Property<List<TradeItem>> TRADE_ITEMS = new Property<>("tradeItems");
	public static final Property<List<VatDeclaration>> VAT_DECLARATIONS = new Property<>("vatDeclarations");

	public void setCmntNum(final Integer cmntNum)
	{
		this.writeProperty("cmntNum", cmntNum);
	}

	public Integer getCmntNum()
	{
		return (Integer) this.readProperty("cmntNum");
	}

	public void setCountryLimitAmt(final Double countryLimitAmt)
	{
		this.writeProperty("countryLimitAmt", countryLimitAmt);
	}

	public Double getCountryLimitAmt()
	{
		return (Double) this.readProperty("countryLimitAmt");
	}

	public void setCountryLimitUtilAmt(final Double countryLimitUtilAmt)
	{
		this.writeProperty("countryLimitUtilAmt", countryLimitUtilAmt);
	}

	public Double getCountryLimitUtilAmt()
	{
		return (Double) this.readProperty("countryLimitUtilAmt");
	}

	public void setCountryName(final String countryName)
	{
		this.writeProperty("countryName", countryName);
	}

	public String getCountryName()
	{
		return (String) this.readProperty("countryName");
	}

	public void setCountryNum(final Short countryNum)
	{
		this.writeProperty("countryNum", countryNum);
	}

	public Short getCountryNum()
	{
		return (Short) this.readProperty("countryNum");
	}

	public void setCountryStatus(final String countryStatus)
	{
		this.writeProperty("countryStatus", countryStatus);
	}

	public String getCountryStatus()
	{
		return (String) this.readProperty("countryStatus");
	}

	public void setExposurePriorityCode(final String exposurePriorityCode)
	{
		this.writeProperty("exposurePriorityCode", exposurePriorityCode);
	}

	public String getExposurePriorityCode()
	{
		return (String) this.readProperty("exposurePriorityCode");
	}

	public void setExtCurrCode(final String extCurrCode)
	{
		this.writeProperty("extCurrCode", extCurrCode);
	}

	public String getExtCurrCode()
	{
		return (String) this.readProperty("extCurrCode");
	}

	public void setIntCurrCode(final String intCurrCode)
	{
		this.writeProperty("intCurrCode", intCurrCode);
	}

	public String getIntCurrCode()
	{
		return (String) this.readProperty("intCurrCode");
	}

	public void setIsoCountryCode(final String isoCountryCode)
	{
		this.writeProperty("isoCountryCode", isoCountryCode);
	}

	public String getIsoCountryCode()
	{
		return (String) this.readProperty("isoCountryCode");
	}

	public void setNoBusInd(final String noBusInd)
	{
		this.writeProperty("noBusInd", noBusInd);
	}

	public String getNoBusInd()
	{
		return (String) this.readProperty("noBusInd");
	}

	public void setTransId(final Integer transId)
	{
		this.writeProperty("transId", transId);
	}

	public Integer getTransId()
	{
		return (Integer) this.readProperty("transId");
	}

	public void addToAccountCreditInfoes(final AccountCreditInfo obj)
	{
		this.addToManyTarget("accountCreditInfoes", obj, true);
	}

	public void removeFromAccountCreditInfoes(final AccountCreditInfo obj)
	{
		this.removeToManyTarget("accountCreditInfoes", obj, true);
	}

	@SuppressWarnings("unchecked")
	public List<AccountCreditInfo> getAccountCreditInfoes()
	{
		return (List<AccountCreditInfo>) this.readProperty("accountCreditInfoes");
	}

	public void addToAccountCreditInfoes1(final AccountCreditInfo obj)
	{
		this.addToManyTarget("accountCreditInfoes1", obj, true);
	}

	public void removeFromAccountCreditInfoes1(final AccountCreditInfo obj)
	{
		this.removeToManyTarget("accountCreditInfoes1", obj, true);
	}

	@SuppressWarnings("unchecked")
	public List<AccountCreditInfo> getAccountCreditInfoes1()
	{
		return (List<AccountCreditInfo>) this.readProperty("accountCreditInfoes1");
	}

	public void addToAcctFiscalReps(final AcctFiscalRep obj)
	{
		this.addToManyTarget("acctFiscalReps", obj, true);
	}

	public void removeFromAcctFiscalReps(final AcctFiscalRep obj)
	{
		this.removeToManyTarget("acctFiscalReps", obj, true);
	}

	@SuppressWarnings("unchecked")
	public List<AcctFiscalRep> getAcctFiscalReps()
	{
		return (List<AcctFiscalRep>) this.readProperty("acctFiscalReps");
	}

	public void addToAcctVatNumbers(final AcctVatNumber obj)
	{
		this.addToManyTarget("acctVatNumbers", obj, true);
	}

	public void removeFromAcctVatNumbers(final AcctVatNumber obj)
	{
		this.removeToManyTarget("acctVatNumbers", obj, true);
	}

	@SuppressWarnings("unchecked")
	public List<AcctVatNumber> getAcctVatNumbers()
	{
		return (List<AcctVatNumber>) this.readProperty("acctVatNumbers");
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

	public void addToAiEstActualVats1(final AiEstActualVat obj)
	{
		this.addToManyTarget("aiEstActualVats1", obj, true);
	}

	public void removeFromAiEstActualVats1(final AiEstActualVat obj)
	{
		this.removeToManyTarget("aiEstActualVats1", obj, true);
	}

	@SuppressWarnings("unchecked")
	public List<AiEstActualVat> getAiEstActualVats1()
	{
		return (List<AiEstActualVat>) this.readProperty("aiEstActualVats1");
	}

	public void addToAiEstActualVats2(final AiEstActualVat obj)
	{
		this.addToManyTarget("aiEstActualVats2", obj, true);
	}

	public void removeFromAiEstActualVats2(final AiEstActualVat obj)
	{
		this.removeToManyTarget("aiEstActualVats2", obj, true);
	}

	@SuppressWarnings("unchecked")
	public List<AiEstActualVat> getAiEstActualVats2()
	{
		return (List<AiEstActualVat>) this.readProperty("aiEstActualVats2");
	}

	public void addToAiEstActualVats3(final AiEstActualVat obj)
	{
		this.addToManyTarget("aiEstActualVats3", obj, true);
	}

	public void removeFromAiEstActualVats3(final AiEstActualVat obj)
	{
		this.removeToManyTarget("aiEstActualVats3", obj, true);
	}

	@SuppressWarnings("unchecked")
	public List<AiEstActualVat> getAiEstActualVats3()
	{
		return (List<AiEstActualVat>) this.readProperty("aiEstActualVats3");
	}

	public void addToAllocItemImpExps(final AllocItemImpExp obj)
	{
		this.addToManyTarget("allocItemImpExps", obj, true);
	}

	public void removeFromAllocItemImpExps(final AllocItemImpExp obj)
	{
		this.removeToManyTarget("allocItemImpExps", obj, true);
	}

	@SuppressWarnings("unchecked")
	public List<AllocItemImpExp> getAllocItemImpExps()
	{
		return (List<AllocItemImpExp>) this.readProperty("allocItemImpExps");
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

	public void addToAllocationItemVats1(final AllocationItemVat obj)
	{
		this.addToManyTarget("allocationItemVats1", obj, true);
	}

	public void removeFromAllocationItemVats1(final AllocationItemVat obj)
	{
		this.removeToManyTarget("allocationItemVats1", obj, true);
	}

	@SuppressWarnings("unchecked")
	public List<AllocationItemVat> getAllocationItemVats1()
	{
		return (List<AllocationItemVat>) this.readProperty("allocationItemVats1");
	}

	public void addToAllocationItemVats2(final AllocationItemVat obj)
	{
		this.addToManyTarget("allocationItemVats2", obj, true);
	}

	public void removeFromAllocationItemVats2(final AllocationItemVat obj)
	{
		this.removeToManyTarget("allocationItemVats2", obj, true);
	}

	@SuppressWarnings("unchecked")
	public List<AllocationItemVat> getAllocationItemVats2()
	{
		return (List<AllocationItemVat>) this.readProperty("allocationItemVats2");
	}

	public void addToAllocationItemVats3(final AllocationItemVat obj)
	{
		this.addToManyTarget("allocationItemVats3", obj, true);
	}

	public void removeFromAllocationItemVats3(final AllocationItemVat obj)
	{
		this.removeToManyTarget("allocationItemVats3", obj, true);
	}

	@SuppressWarnings("unchecked")
	public List<AllocationItemVat> getAllocationItemVats3()
	{
		return (List<AllocationItemVat>) this.readProperty("allocationItemVats3");
	}

	public void setCalendar(final Calendar calendar)
	{
		this.setToOneTarget("calendar", calendar, true);
	}

	public Calendar getCalendar()
	{
		return (Calendar) this.readProperty("calendar");
	}

	public void addToCommodities(final Commodity obj)
	{
		this.addToManyTarget("commodities", obj, true);
	}

	public void removeFromCommodities(final Commodity obj)
	{
		this.removeToManyTarget("commodities", obj, true);
	}

	@SuppressWarnings("unchecked")
	public List<Commodity> getCommodities()
	{
		return (List<Commodity>) this.readProperty("commodities");
	}

	public void setCountry(final CountryExposure country)
	{
		this.setToOneTarget("country", country, true);
	}

	public CountryExposure getCountry()
	{
		return (CountryExposure) this.readProperty("country");
	}

	public void addToCountryByGroups(final CountryByGroup obj)
	{
		this.addToManyTarget("countryByGroups", obj, true);
	}

	public void removeFromCountryByGroups(final CountryByGroup obj)
	{
		this.removeToManyTarget("countryByGroups", obj, true);
	}

	@SuppressWarnings("unchecked")
	public List<CountryByGroup> getCountryByGroups()
	{
		return (List<CountryByGroup>) this.readProperty("countryByGroups");
	}

	public void addToCountryCreditAlarmLogs(final CountryCreditAlarmLog obj)
	{
		this.addToManyTarget("countryCreditAlarmLogs", obj, true);
	}

	public void removeFromCountryCreditAlarmLogs(final CountryCreditAlarmLog obj)
	{
		this.removeToManyTarget("countryCreditAlarmLogs", obj, true);
	}

	@SuppressWarnings("unchecked")
	public List<CountryCreditAlarmLog> getCountryCreditAlarmLogs()
	{
		return (List<CountryCreditAlarmLog>) this.readProperty("countryCreditAlarmLogs");
	}

	public void addToCreditGroups(final CreditGroup obj)
	{
		this.addToManyTarget("creditGroups", obj, true);
	}

	public void removeFromCreditGroups(final CreditGroup obj)
	{
		this.removeToManyTarget("creditGroups", obj, true);
	}

	@SuppressWarnings("unchecked")
	public List<CreditGroup> getCreditGroups()
	{
		return (List<CreditGroup>) this.readProperty("creditGroups");
	}

	public void addToCreditLimits(final CreditLimit obj)
	{
		this.addToManyTarget("creditLimits", obj, true);
	}

	public void removeFromCreditLimits(final CreditLimit obj)
	{
		this.removeToManyTarget("creditLimits", obj, true);
	}

	@SuppressWarnings("unchecked")
	public List<CreditLimit> getCreditLimits()
	{
		return (List<CreditLimit>) this.readProperty("creditLimits");
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

	public void addToLocationExtInfoes(final LocationExtInfo obj)
	{
		this.addToManyTarget("locationExtInfoes", obj, true);
	}

	public void removeFromLocationExtInfoes(final LocationExtInfo obj)
	{
		this.removeToManyTarget("locationExtInfoes", obj, true);
	}

	@SuppressWarnings("unchecked")
	public List<LocationExtInfo> getLocationExtInfoes()
	{
		return (List<LocationExtInfo>) this.readProperty("locationExtInfoes");
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

	public void addToVatDeclarations(final VatDeclaration obj)
	{
		this.addToManyTarget("vatDeclarations", obj, true);
	}

	public void removeFromVatDeclarations(final VatDeclaration obj)
	{
		this.removeToManyTarget("vatDeclarations", obj, true);
	}

	@SuppressWarnings("unchecked")
	public List<VatDeclaration> getVatDeclarations()
	{
		return (List<VatDeclaration>) this.readProperty("vatDeclarations");
	}

}