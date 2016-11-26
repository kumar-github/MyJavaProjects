package com.tc.app.exchangemonitor.model.cayenne.persistent.auto;

import org.apache.cayenne.CayenneDataObject;
import org.apache.cayenne.exp.Property;

/**
 * Class _UicReportingHistory was generated by Cayenne.
 * It is probably a good idea to avoid changing this class manually,
 * since it may be overwritten next time code is regenerated.
 * If you need to make any customizations, please use subclass.
 */
public abstract class _UicReportingHistory extends CayenneDataObject
{

	private static final long serialVersionUID = 1L;

	public static final String REPORT_MOD_ID_PK_COLUMN = "report_mod_id";
	public static final String VALUES_CONFIG_ID_PK_COLUMN = "values_config_id";

	public static final Property<String> NEW_VALUE = new Property<String>("newValue");
	public static final Property<String> OLD_VALUE = new Property<String>("oldValue");

	public void setNewValue(String newValue)
	{
		writeProperty("newValue", newValue);
	}

	public String getNewValue()
	{
		return (String) readProperty("newValue");
	}

	public void setOldValue(String oldValue)
	{
		writeProperty("oldValue", oldValue);
	}

	public String getOldValue()
	{
		return (String) readProperty("oldValue");
	}

}
