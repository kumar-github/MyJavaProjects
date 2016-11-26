package com.tc.app.exchangemonitor.model.cayenne.persistent.auto;

import org.apache.cayenne.CayenneDataObject;
import org.apache.cayenne.exp.Property;

/**
 * Class _AudFipsCounty was generated by Cayenne.
 * It is probably a good idea to avoid changing this class manually,
 * since it may be overwritten next time code is regenerated.
 * If you need to make any customizations, please use subclass.
 */
public abstract class _AudFipsCounty extends CayenneDataObject
{

	private static final long serialVersionUID = 1L;

	public static final Property<Boolean> ACTIVE_IND = new Property<Boolean>("activeInd");
	public static final Property<String> COUNTY_NAME = new Property<String>("countyName");
	public static final Property<String> FIPS_COUNTY_CODE = new Property<String>("fipsCountyCode");
	public static final Property<Integer> FIPS_STATE_NUM = new Property<Integer>("fipsStateNum");
	public static final Property<Integer> OID = new Property<Integer>("oid");
	public static final Property<Integer> RESP_TRANS_ID = new Property<Integer>("respTransId");
	public static final Property<Integer> TRANS_ID = new Property<Integer>("transId");

	public void setActiveInd(Boolean activeInd)
	{
		writeProperty("activeInd", activeInd);
	}

	public Boolean getActiveInd()
	{
		return (Boolean) readProperty("activeInd");
	}

	public void setCountyName(String countyName)
	{
		writeProperty("countyName", countyName);
	}

	public String getCountyName()
	{
		return (String) readProperty("countyName");
	}

	public void setFipsCountyCode(String fipsCountyCode)
	{
		writeProperty("fipsCountyCode", fipsCountyCode);
	}

	public String getFipsCountyCode()
	{
		return (String) readProperty("fipsCountyCode");
	}

	public void setFipsStateNum(Integer fipsStateNum)
	{
		writeProperty("fipsStateNum", fipsStateNum);
	}

	public Integer getFipsStateNum()
	{
		return (Integer) readProperty("fipsStateNum");
	}

	public void setOid(Integer oid)
	{
		writeProperty("oid", oid);
	}

	public Integer getOid()
	{
		return (Integer) readProperty("oid");
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
