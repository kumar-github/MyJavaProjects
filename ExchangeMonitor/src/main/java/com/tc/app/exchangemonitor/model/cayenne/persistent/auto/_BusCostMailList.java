package com.tc.app.exchangemonitor.model.cayenne.persistent.auto;

import org.apache.cayenne.CayenneDataObject;
import org.apache.cayenne.exp.Property;

import com.tc.app.exchangemonitor.model.cayenne.persistent.BcMailCriteriaTime;
import com.tc.app.exchangemonitor.model.cayenne.persistent.BusCostMail;
import com.tc.app.exchangemonitor.model.cayenne.persistent.BusCostMailTime;
import com.tc.app.exchangemonitor.model.cayenne.persistent.IctsUser;

/**
 * Class _BusCostMailList was generated by Cayenne.
 * It is probably a good idea to avoid changing this class manually,
 * since it may be overwritten next time code is regenerated.
 * If you need to make any customizations, please use subclass.
 */
public abstract class _BusCostMailList extends CayenneDataObject
{

	private static final long serialVersionUID = 1L;

	public static final String BC_MAIL_LIST_NUM_PK_COLUMN = "bc_mail_list_num";

	public static final Property<String> BC_MAIL_LOGIN_NAME = new Property<String>("bcMailLoginName");
	public static final Property<String> BC_TYPE_CODE = new Property<String>("bcTypeCode");
	public static final Property<Integer> TRANS_ID = new Property<Integer>("transId");
	public static final Property<BcMailCriteriaTime> BC_MAIL_CRITERIA_TIME = new Property<BcMailCriteriaTime>("bcMailCriteriaTime");
	public static final Property<BusCostMail> BUS_COST_MAIL = new Property<BusCostMail>("busCostMail");
	public static final Property<BusCostMailTime> BUS_COST_MAIL_TIME = new Property<BusCostMailTime>("busCostMailTime");
	public static final Property<IctsUser> ICTS_USER = new Property<IctsUser>("ictsUser");

	public void setBcMailLoginName(String bcMailLoginName)
	{
		writeProperty("bcMailLoginName", bcMailLoginName);
	}

	public String getBcMailLoginName()
	{
		return (String) readProperty("bcMailLoginName");
	}

	public void setBcTypeCode(String bcTypeCode)
	{
		writeProperty("bcTypeCode", bcTypeCode);
	}

	public String getBcTypeCode()
	{
		return (String) readProperty("bcTypeCode");
	}

	public void setTransId(Integer transId)
	{
		writeProperty("transId", transId);
	}

	public Integer getTransId()
	{
		return (Integer) readProperty("transId");
	}

	public void setBcMailCriteriaTime(BcMailCriteriaTime bcMailCriteriaTime)
	{
		setToOneTarget("bcMailCriteriaTime", bcMailCriteriaTime, true);
	}

	public BcMailCriteriaTime getBcMailCriteriaTime()
	{
		return (BcMailCriteriaTime) readProperty("bcMailCriteriaTime");
	}

	public void setBusCostMail(BusCostMail busCostMail)
	{
		setToOneTarget("busCostMail", busCostMail, true);
	}

	public BusCostMail getBusCostMail()
	{
		return (BusCostMail) readProperty("busCostMail");
	}

	public void setBusCostMailTime(BusCostMailTime busCostMailTime)
	{
		setToOneTarget("busCostMailTime", busCostMailTime, true);
	}

	public BusCostMailTime getBusCostMailTime()
	{
		return (BusCostMailTime) readProperty("busCostMailTime");
	}

	public void setIctsUser(IctsUser ictsUser)
	{
		setToOneTarget("ictsUser", ictsUser, true);
	}

	public IctsUser getIctsUser()
	{
		return (IctsUser) readProperty("ictsUser");
	}

}