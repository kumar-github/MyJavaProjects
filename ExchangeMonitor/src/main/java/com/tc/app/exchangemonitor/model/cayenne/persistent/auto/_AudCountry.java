package com.tc.app.exchangemonitor.model.cayenne.persistent.auto;

import org.apache.cayenne.CayenneDataObject;
import org.apache.cayenne.exp.Property;

/**
 * Class _AudCountry was generated by Cayenne.
 * It is probably a good idea to avoid changing this class manually,
 * since it may be overwritten next time code is regenerated.
 * If you need to make any customizations, please use subclass.
 */
public abstract class _AudCountry extends CayenneDataObject
{

	private static final long serialVersionUID = 1L;

	public static final Property<String> CALENDAR_CODE = new Property<String>("calendarCode");
	public static final Property<Integer> CMNT_NUM = new Property<Integer>("cmntNum");
	public static final Property<String> COUNTRY_CODE = new Property<String>("countryCode");
	public static final Property<Double> COUNTRY_LIMIT_AMT = new Property<Double>("countryLimitAmt");
	public static final Property<Double> COUNTRY_LIMIT_UTIL_AMT = new Property<Double>("countryLimitUtilAmt");
	public static final Property<String> COUNTRY_NAME = new Property<String>("countryName");
	public static final Property<Short> COUNTRY_NUM = new Property<Short>("countryNum");
	public static final Property<String> COUNTRY_STATUS = new Property<String>("countryStatus");
	public static final Property<String> EXPOSURE_PRIORITY_CODE = new Property<String>("exposurePriorityCode");
	public static final Property<String> EXT_CURR_CODE = new Property<String>("extCurrCode");
	public static final Property<String> INT_CURR_CODE = new Property<String>("intCurrCode");
	public static final Property<String> ISO_COUNTRY_CODE = new Property<String>("isoCountryCode");
	public static final Property<String> NO_BUS_IND = new Property<String>("noBusInd");
	public static final Property<Integer> RESP_TRANS_ID = new Property<Integer>("respTransId");
	public static final Property<Integer> TRANS_ID = new Property<Integer>("transId");

	public void setCalendarCode(String calendarCode)
	{
		writeProperty("calendarCode", calendarCode);
	}

	public String getCalendarCode()
	{
		return (String) readProperty("calendarCode");
	}

	public void setCmntNum(Integer cmntNum)
	{
		writeProperty("cmntNum", cmntNum);
	}

	public Integer getCmntNum()
	{
		return (Integer) readProperty("cmntNum");
	}

	public void setCountryCode(String countryCode)
	{
		writeProperty("countryCode", countryCode);
	}

	public String getCountryCode()
	{
		return (String) readProperty("countryCode");
	}

	public void setCountryLimitAmt(Double countryLimitAmt)
	{
		writeProperty("countryLimitAmt", countryLimitAmt);
	}

	public Double getCountryLimitAmt()
	{
		return (Double) readProperty("countryLimitAmt");
	}

	public void setCountryLimitUtilAmt(Double countryLimitUtilAmt)
	{
		writeProperty("countryLimitUtilAmt", countryLimitUtilAmt);
	}

	public Double getCountryLimitUtilAmt()
	{
		return (Double) readProperty("countryLimitUtilAmt");
	}

	public void setCountryName(String countryName)
	{
		writeProperty("countryName", countryName);
	}

	public String getCountryName()
	{
		return (String) readProperty("countryName");
	}

	public void setCountryNum(Short countryNum)
	{
		writeProperty("countryNum", countryNum);
	}

	public Short getCountryNum()
	{
		return (Short) readProperty("countryNum");
	}

	public void setCountryStatus(String countryStatus)
	{
		writeProperty("countryStatus", countryStatus);
	}

	public String getCountryStatus()
	{
		return (String) readProperty("countryStatus");
	}

	public void setExposurePriorityCode(String exposurePriorityCode)
	{
		writeProperty("exposurePriorityCode", exposurePriorityCode);
	}

	public String getExposurePriorityCode()
	{
		return (String) readProperty("exposurePriorityCode");
	}

	public void setExtCurrCode(String extCurrCode)
	{
		writeProperty("extCurrCode", extCurrCode);
	}

	public String getExtCurrCode()
	{
		return (String) readProperty("extCurrCode");
	}

	public void setIntCurrCode(String intCurrCode)
	{
		writeProperty("intCurrCode", intCurrCode);
	}

	public String getIntCurrCode()
	{
		return (String) readProperty("intCurrCode");
	}

	public void setIsoCountryCode(String isoCountryCode)
	{
		writeProperty("isoCountryCode", isoCountryCode);
	}

	public String getIsoCountryCode()
	{
		return (String) readProperty("isoCountryCode");
	}

	public void setNoBusInd(String noBusInd)
	{
		writeProperty("noBusInd", noBusInd);
	}

	public String getNoBusInd()
	{
		return (String) readProperty("noBusInd");
	}

	public void setRespTransId(Integer respTransId)
	{
		writeProperty("respTransId", respTransId);
	}

	public Integer getRespTransId()
	{
		return (Integer) readProperty("respTransId");
	}

	public void setTransId(Integer transId)
	{
		writeProperty("transId", transId);
	}

	public Integer getTransId()
	{
		return (Integer) readProperty("transId");
	}

}