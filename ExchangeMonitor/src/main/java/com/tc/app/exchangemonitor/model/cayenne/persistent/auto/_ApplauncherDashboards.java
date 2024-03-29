package com.tc.app.exchangemonitor.model.cayenne.persistent.auto;

import org.apache.cayenne.CayenneDataObject;
import org.apache.cayenne.exp.Property;

/**
 * Class _ApplauncherDashboards was generated by Cayenne.
 * It is probably a good idea to avoid changing this class manually,
 * since it may be overwritten next time code is regenerated.
 * If you need to make any customizations, please use subclass.
 */
public abstract class _ApplauncherDashboards extends CayenneDataObject
{

	private static final long serialVersionUID = 1L;

	public static final String FILENAME_PK_COLUMN = "filename";

	public static final Property<String> APP_KEYCOLUMNS = new Property<String>("appKeycolumns");
	public static final Property<String> APP_UID = new Property<String>("appUid");
	public static final Property<String> DESCRIPTION = new Property<String>("description");
	public static final Property<Boolean> ENABLED = new Property<Boolean>("enabled");
	public static final Property<String> TITLE = new Property<String>("title");

	public void setAppKeycolumns(String appKeycolumns)
	{
		writeProperty("appKeycolumns", appKeycolumns);
	}

	public String getAppKeycolumns()
	{
		return (String) readProperty("appKeycolumns");
	}

	public void setAppUid(String appUid)
	{
		writeProperty("appUid", appUid);
	}

	public String getAppUid()
	{
		return (String) readProperty("appUid");
	}

	public void setDescription(String description)
	{
		writeProperty("description", description);
	}

	public String getDescription()
	{
		return (String) readProperty("description");
	}

	public void setEnabled(Boolean enabled)
	{
		writeProperty("enabled", enabled);
	}

	public Boolean getEnabled()
	{
		return (Boolean) readProperty("enabled");
	}

	public void setTitle(String title)
	{
		writeProperty("title", title);
	}

	public String getTitle()
	{
		return (String) readProperty("title");
	}

}
