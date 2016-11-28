package com.tc.app.exchangemonitor.model.cayenne.persistent.auto;

import org.apache.cayenne.CayenneDataObject;
import org.apache.cayenne.exp.Property;

/**
 * Class _DatabaseInfo was generated by Cayenne.
 * It is probably a good idea to avoid changing this class manually,
 * since it may be overwritten next time code is regenerated.
 * If you need to make any customizations, please use subclass.
 */
public abstract class _DatabaseInfo extends CayenneDataObject
{

	private static final long serialVersionUID = 1L;

	public static final String LAST_TOUCH_DATE_PK_COLUMN = "last_touch_date";

	public static final Property<String> DATA_SOURCE = new Property<String>("dataSource");
	public static final Property<String> MAJOR_REVNUM = new Property<String>("majorRevnum");
	public static final Property<String> MINOR_REVNUM = new Property<String>("minorRevnum");
	public static final Property<String> NOTE = new Property<String>("note");
	public static final Property<String> OWNER_CODE = new Property<String>("ownerCode");
	public static final Property<String> PATCH_LEVEL = new Property<String>("patchLevel");
	public static final Property<String> USAGE = new Property<String>("usage");

	public void setDataSource(String dataSource)
	{
		writeProperty("dataSource", dataSource);
	}

	public String getDataSource()
	{
		return (String) readProperty("dataSource");
	}

	public void setMajorRevnum(String majorRevnum)
	{
		writeProperty("majorRevnum", majorRevnum);
	}

	public String getMajorRevnum()
	{
		return (String) readProperty("majorRevnum");
	}

	public void setMinorRevnum(String minorRevnum)
	{
		writeProperty("minorRevnum", minorRevnum);
	}

	public String getMinorRevnum()
	{
		return (String) readProperty("minorRevnum");
	}

	public void setNote(String note)
	{
		writeProperty("note", note);
	}

	public String getNote()
	{
		return (String) readProperty("note");
	}

	public void setOwnerCode(String ownerCode)
	{
		writeProperty("ownerCode", ownerCode);
	}

	public String getOwnerCode()
	{
		return (String) readProperty("ownerCode");
	}

	public void setPatchLevel(String patchLevel)
	{
		writeProperty("patchLevel", patchLevel);
	}

	public String getPatchLevel()
	{
		return (String) readProperty("patchLevel");
	}

	public void setUsage(String usage)
	{
		writeProperty("usage", usage);
	}

	public String getUsage()
	{
		return (String) readProperty("usage");
	}

}