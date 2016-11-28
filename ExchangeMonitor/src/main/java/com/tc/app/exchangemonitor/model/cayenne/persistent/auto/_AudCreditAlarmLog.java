package com.tc.app.exchangemonitor.model.cayenne.persistent.auto;

import java.util.Date;

import org.apache.cayenne.CayenneDataObject;
import org.apache.cayenne.exp.Property;

/**
 * Class _AudCreditAlarmLog was generated by Cayenne.
 * It is probably a good idea to avoid changing this class manually,
 * since it may be overwritten next time code is regenerated.
 * If you need to make any customizations, please use subclass.
 */
public abstract class _AudCreditAlarmLog extends CayenneDataObject
{

	private static final long serialVersionUID = 1L;

	public static final Property<Integer> ALARM_LOG_CMNT_NUM = new Property<Integer>("alarmLogCmntNum");
	public static final Property<String> ALARM_UOM_CODE = new Property<String>("alarmUomCode");
	public static final Property<Integer> CREDIT_ALARM_LOG_NUM = new Property<Integer>("creditAlarmLogNum");
	public static final Property<Integer> CREDIT_LIMIT_NUM = new Property<Integer>("creditLimitNum");
	public static final Property<Double> OVER_LIMIT_AMT = new Property<Double>("overLimitAmt");
	public static final Property<Integer> RESP_TRANS_ID = new Property<Integer>("respTransId");
	public static final Property<Date> TIME_OF_LOG = new Property<Date>("timeOfLog");
	public static final Property<Integer> TRANS_ID = new Property<Integer>("transId");

	public void setAlarmLogCmntNum(Integer alarmLogCmntNum)
	{
		writeProperty("alarmLogCmntNum", alarmLogCmntNum);
	}

	public Integer getAlarmLogCmntNum()
	{
		return (Integer) readProperty("alarmLogCmntNum");
	}

	public void setAlarmUomCode(String alarmUomCode)
	{
		writeProperty("alarmUomCode", alarmUomCode);
	}

	public String getAlarmUomCode()
	{
		return (String) readProperty("alarmUomCode");
	}

	public void setCreditAlarmLogNum(Integer creditAlarmLogNum)
	{
		writeProperty("creditAlarmLogNum", creditAlarmLogNum);
	}

	public Integer getCreditAlarmLogNum()
	{
		return (Integer) readProperty("creditAlarmLogNum");
	}

	public void setCreditLimitNum(Integer creditLimitNum)
	{
		writeProperty("creditLimitNum", creditLimitNum);
	}

	public Integer getCreditLimitNum()
	{
		return (Integer) readProperty("creditLimitNum");
	}

	public void setOverLimitAmt(Double overLimitAmt)
	{
		writeProperty("overLimitAmt", overLimitAmt);
	}

	public Double getOverLimitAmt()
	{
		return (Double) readProperty("overLimitAmt");
	}

	public void setRespTransId(Integer respTransId)
	{
		writeProperty("respTransId", respTransId);
	}

	public Integer getRespTransId()
	{
		return (Integer) readProperty("respTransId");
	}

	public void setTimeOfLog(Date timeOfLog)
	{
		writeProperty("timeOfLog", timeOfLog);
	}

	public Date getTimeOfLog()
	{
		return (Date) readProperty("timeOfLog");
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