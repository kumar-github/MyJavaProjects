package com.tc.app.exchangemonitor.model.cayenne.persistent.auto;

import org.apache.cayenne.CayenneDataObject;
import org.apache.cayenne.exp.Property;

/**
 * Class _DemurrageStatus was generated by Cayenne.
 * It is probably a good idea to avoid changing this class manually,
 * since it may be overwritten next time code is regenerated.
 * If you need to make any customizations, please use subclass.
 */
public abstract class _DemurrageStatus extends CayenneDataObject
{

	private static final long serialVersionUID = 1L;

	public static final String FLDCHR_DEM_STATUS_CODE_PK_COLUMN = "fldchrDemStatusCode";

	public static final Property<String> FLDCHR_DEM_STATUS_ENABLED_FLAG = new Property<String>("fldchrDemStatusEnabledFlag");
	public static final Property<String> FLDVCH_DEM_STATUS_DESC = new Property<String>("fldvchDemStatusDesc");

	public void setFldchrDemStatusEnabledFlag(String fldchrDemStatusEnabledFlag)
	{
		writeProperty("fldchrDemStatusEnabledFlag", fldchrDemStatusEnabledFlag);
	}

	public String getFldchrDemStatusEnabledFlag()
	{
		return (String) readProperty("fldchrDemStatusEnabledFlag");
	}

	public void setFldvchDemStatusDesc(String fldvchDemStatusDesc)
	{
		writeProperty("fldvchDemStatusDesc", fldvchDemStatusDesc);
	}

	public String getFldvchDemStatusDesc()
	{
		return (String) readProperty("fldvchDemStatusDesc");
	}

}
