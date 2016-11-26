package com.tc.app.exchangemonitor.model.cayenne.persistent.auto;

import org.apache.cayenne.CayenneDataObject;
import org.apache.cayenne.exp.Property;

/**
 * Class _VCubeUserEntityMap was generated by Cayenne.
 * It is probably a good idea to avoid changing this class manually,
 * since it may be overwritten next time code is regenerated.
 * If you need to make any customizations, please use subclass.
 */
public abstract class _VCubeUserEntityMap extends CayenneDataObject
{

	private static final long serialVersionUID = 1L;

	public static final Property<String> BOOK_ENTITY_NAME = new Property<String>("bookEntityName");
	public static final Property<Integer> BOOK_ENTITY_NUM = new Property<Integer>("bookEntityNum");
	public static final Property<Integer> TRANS_ID = new Property<Integer>("transId");
	public static final Property<String> USER_INIT = new Property<String>("userInit");
	public static final Property<String> USER_LOGON_ID = new Property<String>("userLogonId");

	public void setBookEntityName(String bookEntityName)
	{
		writeProperty("bookEntityName", bookEntityName);
	}

	public String getBookEntityName()
	{
		return (String) readProperty("bookEntityName");
	}

	public void setBookEntityNum(Integer bookEntityNum)
	{
		writeProperty("bookEntityNum", bookEntityNum);
	}

	public Integer getBookEntityNum()
	{
		return (Integer) readProperty("bookEntityNum");
	}

	public void setTransId(Integer transId)
	{
		writeProperty("transId", transId);
	}

	public Integer getTransId()
	{
		return (Integer) readProperty("transId");
	}

	public void setUserInit(String userInit)
	{
		writeProperty("userInit", userInit);
	}

	public String getUserInit()
	{
		return (String) readProperty("userInit");
	}

	public void setUserLogonId(String userLogonId)
	{
		writeProperty("userLogonId", userLogonId);
	}

	public String getUserLogonId()
	{
		return (String) readProperty("userLogonId");
	}

}
