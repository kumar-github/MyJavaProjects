package com.tc.app.exchangemonitor.model.cayenne.persistent.auto;

import org.apache.cayenne.CayenneDataObject;
import org.apache.cayenne.exp.Property;

/**
 * Class _VIctsUserRev was generated by Cayenne.
 * It is probably a good idea to avoid changing this class manually,
 * since it may be overwritten next time code is regenerated.
 * If you need to make any customizations, please use subclass.
 */
public abstract class _VIctsUserRev extends CayenneDataObject
{

	private static final long serialVersionUID = 1L;

	public static final Property<Integer> ASOF_TRANS_ID = new Property<Integer>("asofTransId");
	public static final Property<String> DESK_CODE = new Property<String>("deskCode");
	public static final Property<String> EMAIL_ADDRESS = new Property<String>("emailAddress");
	public static final Property<String> LOC_CODE = new Property<String>("locCode");
	public static final Property<Integer> RESP_TRANS_ID = new Property<Integer>("respTransId");
	public static final Property<Integer> TRANS_ID = new Property<Integer>("transId");
	public static final Property<String> US_CITIZEN_IND = new Property<String>("usCitizenInd");
	public static final Property<Integer> USER_EMPLOYEE_NUM = new Property<Integer>("userEmployeeNum");
	public static final Property<String> USER_FIRST_NAME = new Property<String>("userFirstName");
	public static final Property<String> USER_INIT = new Property<String>("userInit");
	public static final Property<String> USER_JOB_TITLE = new Property<String>("userJobTitle");
	public static final Property<String> USER_LAST_NAME = new Property<String>("userLastName");
	public static final Property<String> USER_LOGON_ID = new Property<String>("userLogonId");
	public static final Property<String> USER_STATUS = new Property<String>("userStatus");

	public void setAsofTransId(Integer asofTransId)
	{
		writeProperty("asofTransId", asofTransId);
	}

	public Integer getAsofTransId()
	{
		return (Integer) readProperty("asofTransId");
	}

	public void setDeskCode(String deskCode)
	{
		writeProperty("deskCode", deskCode);
	}

	public String getDeskCode()
	{
		return (String) readProperty("deskCode");
	}

	public void setEmailAddress(String emailAddress)
	{
		writeProperty("emailAddress", emailAddress);
	}

	public String getEmailAddress()
	{
		return (String) readProperty("emailAddress");
	}

	public void setLocCode(String locCode)
	{
		writeProperty("locCode", locCode);
	}

	public String getLocCode()
	{
		return (String) readProperty("locCode");
	}

	public void setRespTransId(Integer respTransId)
	{
		writeProperty("respTransId", respTransId);
	}

	public Integer getRespTransId()
	{
		return (Integer) readProperty("respTransId");
	}

	public void setTransId(Integer transId)
	{
		writeProperty("transId", transId);
	}

	public Integer getTransId()
	{
		return (Integer) readProperty("transId");
	}

	public void setUsCitizenInd(String usCitizenInd)
	{
		writeProperty("usCitizenInd", usCitizenInd);
	}

	public String getUsCitizenInd()
	{
		return (String) readProperty("usCitizenInd");
	}

	public void setUserEmployeeNum(Integer userEmployeeNum)
	{
		writeProperty("userEmployeeNum", userEmployeeNum);
	}

	public Integer getUserEmployeeNum()
	{
		return (Integer) readProperty("userEmployeeNum");
	}

	public void setUserFirstName(String userFirstName)
	{
		writeProperty("userFirstName", userFirstName);
	}

	public String getUserFirstName()
	{
		return (String) readProperty("userFirstName");
	}

	public void setUserInit(String userInit)
	{
		writeProperty("userInit", userInit);
	}

	public String getUserInit()
	{
		return (String) readProperty("userInit");
	}

	public void setUserJobTitle(String userJobTitle)
	{
		writeProperty("userJobTitle", userJobTitle);
	}

	public String getUserJobTitle()
	{
		return (String) readProperty("userJobTitle");
	}

	public void setUserLastName(String userLastName)
	{
		writeProperty("userLastName", userLastName);
	}

	public String getUserLastName()
	{
		return (String) readProperty("userLastName");
	}

	public void setUserLogonId(String userLogonId)
	{
		writeProperty("userLogonId", userLogonId);
	}

	public String getUserLogonId()
	{
		return (String) readProperty("userLogonId");
	}

	public void setUserStatus(String userStatus)
	{
		writeProperty("userStatus", userStatus);
	}

	public String getUserStatus()
	{
		return (String) readProperty("userStatus");
	}

}
