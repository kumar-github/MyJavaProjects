package com.tc.app.exchangemonitor.model.cayenne.persistent.auto;

import org.apache.cayenne.CayenneDataObject;
import org.apache.cayenne.exp.Property;

import com.tc.app.exchangemonitor.model.cayenne.persistent.Facility;
import com.tc.app.exchangemonitor.model.cayenne.persistent.LocationTankInfo;

/**
 * Class _FacilityTankGroup was generated by Cayenne.
 * It is probably a good idea to avoid changing this class manually,
 * since it may be overwritten next time code is regenerated.
 * If you need to make any customizations, please use subclass.
 */
public abstract class _FacilityTankGroup extends CayenneDataObject
{

	private static final long serialVersionUID = 1L;

	public static final String FACILITY_CODE_PK_COLUMN = "facility_code";
	public static final String TANK_NUM_PK_COLUMN = "tank_num";

	public static final Property<String> CONNECTED_IND = new Property<String>("connectedInd");
	public static final Property<Integer> TRANS_ID = new Property<Integer>("transId");
	public static final Property<Facility> FACILITY = new Property<Facility>("facility");
	public static final Property<LocationTankInfo> LOCATION_TANK_INFO = new Property<LocationTankInfo>("locationTankInfo");

	public void setConnectedInd(String connectedInd)
	{
		writeProperty("connectedInd", connectedInd);
	}

	public String getConnectedInd()
	{
		return (String) readProperty("connectedInd");
	}

	public void setTransId(Integer transId)
	{
		writeProperty("transId", transId);
	}

	public Integer getTransId()
	{
		return (Integer) readProperty("transId");
	}

	public void setFacility(Facility facility)
	{
		setToOneTarget("facility", facility, true);
	}

	public Facility getFacility()
	{
		return (Facility) readProperty("facility");
	}

	public void setLocationTankInfo(LocationTankInfo locationTankInfo)
	{
		setToOneTarget("locationTankInfo", locationTankInfo, true);
	}

	public LocationTankInfo getLocationTankInfo()
	{
		return (LocationTankInfo) readProperty("locationTankInfo");
	}

}
