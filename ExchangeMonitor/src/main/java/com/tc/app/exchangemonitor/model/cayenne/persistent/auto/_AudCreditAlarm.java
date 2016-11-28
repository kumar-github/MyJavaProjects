package com.tc.app.exchangemonitor.model.cayenne.persistent.auto;

import org.apache.cayenne.CayenneDataObject;
import org.apache.cayenne.exp.Property;

/**
 * Class _AudCreditAlarm was generated by Cayenne.
 * It is probably a good idea to avoid changing this class manually,
 * since it may be overwritten next time code is regenerated.
 * If you need to make any customizations, please use subclass.
 */
public abstract class _AudCreditAlarm extends CayenneDataObject
{

	private static final long serialVersionUID = 1L;

	public static final Property<Integer> ALARM_CMNT_NUM = new Property<Integer>("alarmCmntNum");
	public static final Property<String> ALARM_NOTIFY_IND = new Property<String>("alarmNotifyInd");
	public static final Property<Double> ALARM_PERCENT_AMT = new Property<Double>("alarmPercentAmt");
	public static final Property<String> ALARM_TYPE = new Property<String>("alarmType");
	public static final Property<Integer> CREDIT_LIMIT_NUM = new Property<Integer>("creditLimitNum");
	public static final Property<String> NOTIFY_EMAIL_GROUP = new Property<String>("notifyEmailGroup");
	public static final Property<Integer> RESP_TRANS_ID = new Property<Integer>("respTransId");
	public static final Property<Integer> TRANS_ID = new Property<Integer>("transId");

	public void setAlarmCmntNum(Integer alarmCmntNum)
	{
		writeProperty("alarmCmntNum", alarmCmntNum);
	}

	public Integer getAlarmCmntNum()
	{
		return (Integer) readProperty("alarmCmntNum");
	}

	public void setAlarmNotifyInd(String alarmNotifyInd)
	{
		writeProperty("alarmNotifyInd", alarmNotifyInd);
	}

	public String getAlarmNotifyInd()
	{
		return (String) readProperty("alarmNotifyInd");
	}

	public void setAlarmPercentAmt(Double alarmPercentAmt)
	{
		writeProperty("alarmPercentAmt", alarmPercentAmt);
	}

	public Double getAlarmPercentAmt()
	{
		return (Double) readProperty("alarmPercentAmt");
	}

	public void setAlarmType(String alarmType)
	{
		writeProperty("alarmType", alarmType);
	}

	public String getAlarmType()
	{
		return (String) readProperty("alarmType");
	}

	public void setCreditLimitNum(Integer creditLimitNum)
	{
		writeProperty("creditLimitNum", creditLimitNum);
	}

	public Integer getCreditLimitNum()
	{
		return (Integer) readProperty("creditLimitNum");
	}

	public void setNotifyEmailGroup(String notifyEmailGroup)
	{
		writeProperty("notifyEmailGroup", notifyEmailGroup);
	}

	public String getNotifyEmailGroup()
	{
		return (String) readProperty("notifyEmailGroup");
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

}