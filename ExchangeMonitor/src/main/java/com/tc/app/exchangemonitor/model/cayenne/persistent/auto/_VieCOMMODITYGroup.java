package com.tc.app.exchangemonitor.model.cayenne.persistent.auto;

import org.apache.cayenne.CayenneDataObject;
import org.apache.cayenne.exp.Property;

/**
 * Class _VieCOMMODITYGroup was generated by Cayenne.
 * It is probably a good idea to avoid changing this class manually,
 * since it may be overwritten next time code is regenerated.
 * If you need to make any customizations, please use subclass.
 */
public abstract class _VieCOMMODITYGroup extends CayenneDataObject
{

	private static final long serialVersionUID = 1L;

	public static final Property<String> FLDCHR_CMDTY_GROUP_CODE = new Property<String>("fldchrCmdtyGroupCode");
	public static final Property<String> FLDCHR_CMDTY_GROUP_FULL_NAME = new Property<String>("fldchrCmdtyGroupFullName");
	public static final Property<String> FLDCHR_CMDTY_GROUP_SHORT_NAME = new Property<String>("fldchrCmdtyGroupShortName");
	public static final Property<String> FLDCHR_CMDTY_GROUP_TYPE_CODE = new Property<String>("fldchrCmdtyGroupTypeCode");
	public static final Property<String> FLDCHR_CMDTY_GROUP_TYPE_DESC = new Property<String>("fldchrCmdtyGroupTypeDesc");

	public void setFldchrCmdtyGroupCode(String fldchrCmdtyGroupCode)
	{
		writeProperty("fldchrCmdtyGroupCode", fldchrCmdtyGroupCode);
	}

	public String getFldchrCmdtyGroupCode()
	{
		return (String) readProperty("fldchrCmdtyGroupCode");
	}

	public void setFldchrCmdtyGroupFullName(String fldchrCmdtyGroupFullName)
	{
		writeProperty("fldchrCmdtyGroupFullName", fldchrCmdtyGroupFullName);
	}

	public String getFldchrCmdtyGroupFullName()
	{
		return (String) readProperty("fldchrCmdtyGroupFullName");
	}

	public void setFldchrCmdtyGroupShortName(String fldchrCmdtyGroupShortName)
	{
		writeProperty("fldchrCmdtyGroupShortName", fldchrCmdtyGroupShortName);
	}

	public String getFldchrCmdtyGroupShortName()
	{
		return (String) readProperty("fldchrCmdtyGroupShortName");
	}

	public void setFldchrCmdtyGroupTypeCode(String fldchrCmdtyGroupTypeCode)
	{
		writeProperty("fldchrCmdtyGroupTypeCode", fldchrCmdtyGroupTypeCode);
	}

	public String getFldchrCmdtyGroupTypeCode()
	{
		return (String) readProperty("fldchrCmdtyGroupTypeCode");
	}

	public void setFldchrCmdtyGroupTypeDesc(String fldchrCmdtyGroupTypeDesc)
	{
		writeProperty("fldchrCmdtyGroupTypeDesc", fldchrCmdtyGroupTypeDesc);
	}

	public String getFldchrCmdtyGroupTypeDesc()
	{
		return (String) readProperty("fldchrCmdtyGroupTypeDesc");
	}

}