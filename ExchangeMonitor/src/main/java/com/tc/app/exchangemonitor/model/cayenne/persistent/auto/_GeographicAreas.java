package com.tc.app.exchangemonitor.model.cayenne.persistent.auto;

import org.apache.cayenne.CayenneDataObject;
import org.apache.cayenne.exp.Property;

/**
 * Class _GeographicAreas was generated by Cayenne.
 * It is probably a good idea to avoid changing this class manually,
 * since it may be overwritten next time code is regenerated.
 * If you need to make any customizations, please use subclass.
 */
public abstract class _GeographicAreas extends CayenneDataObject
{

	private static final long serialVersionUID = 1L;

	public static final String FLDCHR_GEO_AREA_CODE_PK_COLUMN = "fldchrGeoAreaCode";

	public static final Property<String> FLDVCH_GEO_AREA_DESC = new Property<String>("fldvchGeoAreaDesc");
	public static final Property<Integer> TRANS_ID = new Property<Integer>("transId");

	public void setFldvchGeoAreaDesc(String fldvchGeoAreaDesc)
	{
		writeProperty("fldvchGeoAreaDesc", fldvchGeoAreaDesc);
	}

	public String getFldvchGeoAreaDesc()
	{
		return (String) readProperty("fldvchGeoAreaDesc");
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
