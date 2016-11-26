package com.tc.app.exchangemonitor.model.cayenne.persistent.auto;

import java.util.Date;

import org.apache.cayenne.CayenneDataObject;
import org.apache.cayenne.exp.Property;

/**
 * Class _AudScripthostLibrary was generated by Cayenne.
 * It is probably a good idea to avoid changing this class manually,
 * since it may be overwritten next time code is regenerated.
 * If you need to make any customizations, please use subclass.
 */
public abstract class _AudScripthostLibrary extends CayenneDataObject
{

	private static final long serialVersionUID = 1L;

	public static final Property<Date> DATE_OP = new Property<Date>("dateOp");
	public static final Property<Boolean> IS_PUBLIC = new Property<Boolean>("isPublic");
	public static final Property<String> LIBRARY_NAME = new Property<String>("libraryName");
	public static final Property<String> OPERATION = new Property<String>("operation");
	public static final Property<String> SCRIPT_BODY = new Property<String>("scriptBody");
	public static final Property<String> SCRIPT_DESCRIPTION = new Property<String>("scriptDescription");
	public static final Property<String> SCRIPT_NAME = new Property<String>("scriptName");
	public static final Property<Integer> SCRIPTHOST_LIBRARY_KEY = new Property<Integer>("scripthostLibraryKey");
	public static final Property<String> USER_INIT = new Property<String>("userInit");
	public static final Property<String> USERID = new Property<String>("userid");

	public void setDateOp(Date dateOp)
	{
		writeProperty("dateOp", dateOp);
	}

	public Date getDateOp()
	{
		return (Date) readProperty("dateOp");
	}

	public void setIsPublic(Boolean isPublic)
	{
		writeProperty("isPublic", isPublic);
	}

	public Boolean getIsPublic()
	{
		return (Boolean) readProperty("isPublic");
	}

	public void setLibraryName(String libraryName)
	{
		writeProperty("libraryName", libraryName);
	}

	public String getLibraryName()
	{
		return (String) readProperty("libraryName");
	}

	public void setOperation(String operation)
	{
		writeProperty("operation", operation);
	}

	public String getOperation()
	{
		return (String) readProperty("operation");
	}

	public void setScriptBody(String scriptBody)
	{
		writeProperty("scriptBody", scriptBody);
	}

	public String getScriptBody()
	{
		return (String) readProperty("scriptBody");
	}

	public void setScriptDescription(String scriptDescription)
	{
		writeProperty("scriptDescription", scriptDescription);
	}

	public String getScriptDescription()
	{
		return (String) readProperty("scriptDescription");
	}

	public void setScriptName(String scriptName)
	{
		writeProperty("scriptName", scriptName);
	}

	public String getScriptName()
	{
		return (String) readProperty("scriptName");
	}

	public void setScripthostLibraryKey(Integer scripthostLibraryKey)
	{
		writeProperty("scripthostLibraryKey", scripthostLibraryKey);
	}

	public Integer getScripthostLibraryKey()
	{
		return (Integer) readProperty("scripthostLibraryKey");
	}

	public void setUserInit(String userInit)
	{
		writeProperty("userInit", userInit);
	}

	public String getUserInit()
	{
		return (String) readProperty("userInit");
	}

	public void setUserid(String userid)
	{
		writeProperty("userid", userid);
	}

	public String getUserid()
	{
		return (String) readProperty("userid");
	}

}
