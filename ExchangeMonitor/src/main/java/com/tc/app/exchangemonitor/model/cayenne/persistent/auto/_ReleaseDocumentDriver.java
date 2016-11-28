package com.tc.app.exchangemonitor.model.cayenne.persistent.auto;

import org.apache.cayenne.CayenneDataObject;
import org.apache.cayenne.exp.Property;

import com.tc.app.exchangemonitor.model.cayenne.persistent.ReleaseDocument;

/**
 * Class _ReleaseDocumentDriver was generated by Cayenne.
 * It is probably a good idea to avoid changing this class manually,
 * since it may be overwritten next time code is regenerated.
 * If you need to make any customizations, please use subclass.
 */
public abstract class _ReleaseDocumentDriver extends CayenneDataObject
{

	private static final long serialVersionUID = 1L;

	public static final String OID_PK_COLUMN = "oid";

	public static final Property<String> DRIVER_NAME = new Property<String>("driverName");
	public static final Property<String> LICENSE_NUMBER = new Property<String>("licenseNumber");
	public static final Property<String> REGISTRATION_ID = new Property<String>("registrationId");
	public static final Property<Integer> TRANS_ID = new Property<Integer>("transId");
	public static final Property<String> TRUCK_TYPE = new Property<String>("truckType");
	public static final Property<ReleaseDocument> RELEASE_DOCUMENT = new Property<ReleaseDocument>("releaseDocument");

	public void setDriverName(String driverName)
	{
		writeProperty("driverName", driverName);
	}

	public String getDriverName()
	{
		return (String) readProperty("driverName");
	}

	public void setLicenseNumber(String licenseNumber)
	{
		writeProperty("licenseNumber", licenseNumber);
	}

	public String getLicenseNumber()
	{
		return (String) readProperty("licenseNumber");
	}

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

	public void setReleaseDocument(ReleaseDocument releaseDocument)
	{
		setToOneTarget("releaseDocument", releaseDocument, true);
	}

	public ReleaseDocument getReleaseDocument()
	{
		return (ReleaseDocument) readProperty("releaseDocument");
	}

}