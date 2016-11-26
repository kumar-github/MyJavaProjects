package com.tc.app.exchangemonitor.model.cayenne.persistent.auto;

import org.apache.cayenne.CayenneDataObject;
import org.apache.cayenne.exp.Property;

/**
 * Class _ABCPortTrascodLoc was generated by Cayenne.
 * It is probably a good idea to avoid changing this class manually,
 * since it may be overwritten next time code is regenerated.
 * If you need to make any customizations, please use subclass.
 */
public abstract class _ABCPortTrascodLoc extends CayenneDataObject
{

	private static final long serialVersionUID = 1L;

	public static final String FLDINT_LOCATION_ID_PK_COLUMN = "fldintLocationID";

	public static final Property<String> A_BCCOMPLETE_CODE = new Property<String>("aBCCompleteCode");
	public static final Property<String> LOC_CODE = new Property<String>("locCode");

	public void setABCCompleteCode(String aBCCompleteCode)
	{
		writeProperty("aBCCompleteCode", aBCCompleteCode);
	}

	public String getABCCompleteCode()
	{
		return (String) readProperty("aBCCompleteCode");
	}

	public void setLocCode(String locCode)
	{
		writeProperty("locCode", locCode);
	}

	public String getLocCode()
	{
		return (String) readProperty("locCode");
	}

}
