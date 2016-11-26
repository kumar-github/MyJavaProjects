package com.tc.app.exchangemonitor.model.cayenne.persistent.auto;

import org.apache.cayenne.CayenneDataObject;
import org.apache.cayenne.exp.Property;

/**
 * Class _AudFacilityTankGroup was generated by Cayenne.
 * It is probably a good idea to avoid changing this class manually,
 * since it may be overwritten next time code is regenerated.
 * If you need to make any customizations, please use subclass.
 */
public abstract class _AudFacilityTankGroup extends CayenneDataObject
{

	private static final long serialVersionUID = 1L;

	public static final Property<String> CONNECTED_IND = new Property<String>("connectedInd");
	public static final Property<String> FACILITY_CODE = new Property<String>("facilityCode");
	public static final Property<Integer> RESP_TRANS_ID = new Property<Integer>("respTransId");
	public static final Property<Integer> TANK_NUM = new Property<Integer>("tankNum");
	public static final Property<Integer> TRANS_ID = new Property<Integer>("transId");

	public void setConnectedInd(String connectedInd)
	{
		writeProperty("connectedInd", connectedInd);
	}

	public String getConnectedInd()
	{
		return (String) readProperty("connectedInd");
	}

	public void setFacilityCode(String facilityCode)
	{
		writeProperty("facilityCode", facilityCode);
	}

	public String getFacilityCode()
	{
		return (String) readProperty("facilityCode");
	}

	public void setRespTransId(Integer respTransId)
	{
		writeProperty("respTransId", respTransId);
	}

	public Integer getRespTransId()
	{
		return (Integer) readProperty("respTransId");
	}

	public void setTankNum(Integer tankNum)
	{
		writeProperty("tankNum", tankNum);
	}

	public Integer getTankNum()
	{
		return (Integer) readProperty("tankNum");
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
