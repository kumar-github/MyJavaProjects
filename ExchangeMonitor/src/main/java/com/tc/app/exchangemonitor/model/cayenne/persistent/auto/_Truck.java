package com.tc.app.exchangemonitor.model.cayenne.persistent.auto;

import org.apache.cayenne.CayenneDataObject;
import org.apache.cayenne.exp.Property;

/**
 * Class _Truck was generated by Cayenne.
 * It is probably a good idea to avoid changing this class manually,
 * since it may be overwritten next time code is regenerated.
 * If you need to make any customizations, please use subclass.
 */
public abstract class _Truck extends CayenneDataObject
{

	private static final long serialVersionUID = 1L;

	public static final String TRUCK_NUM_PK_COLUMN = "truck_num";

	public static final Property<String> REGISTRATION_ID = new Property<String>("registrationId");
	public static final Property<Integer> TRANS_ID = new Property<Integer>("transId");
	public static final Property<String> TRUCK_TYPE = new Property<String>("truckType");

	public void setRegistrationId(String registrationId)
	{
		writeProperty("registrationId", registrationId);
	}

	public String getRegistrationId()
	{
		return (String) readProperty("registrationId");
	}

	public void setTransId(Integer transId)
	{
		writeProperty("transId", transId);
	}

	public Integer getTransId()
	{
		return (Integer) readProperty("transId");
	}

	public void setTruckType(String truckType)
	{
		writeProperty("truckType", truckType);
	}

	public String getTruckType()
	{
		return (String) readProperty("truckType");
	}

}
