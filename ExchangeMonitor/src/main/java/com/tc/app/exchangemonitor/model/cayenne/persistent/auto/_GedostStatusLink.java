package com.tc.app.exchangemonitor.model.cayenne.persistent.auto;

import org.apache.cayenne.CayenneDataObject;
import org.apache.cayenne.exp.Property;

/**
 * Class _GedostStatusLink was generated by Cayenne.
 * It is probably a good idea to avoid changing this class manually,
 * since it may be overwritten next time code is regenerated.
 * If you need to make any customizations, please use subclass.
 */
public abstract class _GedostStatusLink extends CayenneDataObject
{

	private static final long serialVersionUID = 1L;

	public static final String FLDCHR_CONTR_KEY_PK_COLUMN = "fldchrContrKey";

	public static final Property<String> GEDOST_STATUS = new Property<String>("gedostStatus");

	public void setGedostStatus(String gedostStatus)
	{
		writeProperty("gedostStatus", gedostStatus);
	}

	public String getGedostStatus()
	{
		return (String) readProperty("gedostStatus");
	}

}
