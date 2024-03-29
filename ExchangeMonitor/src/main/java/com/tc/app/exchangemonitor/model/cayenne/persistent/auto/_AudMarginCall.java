package com.tc.app.exchangemonitor.model.cayenne.persistent.auto;

import java.util.Date;

import org.apache.cayenne.CayenneDataObject;
import org.apache.cayenne.exp.Property;

/**
 * Class _AudMarginCall was generated by Cayenne.
 * It is probably a good idea to avoid changing this class manually,
 * since it may be overwritten next time code is regenerated.
 * If you need to make any customizations, please use subclass.
 */
public abstract class _AudMarginCall extends CayenneDataObject
{

	private static final long serialVersionUID = 1L;

	public static final Property<Integer> ACCT_NUM = new Property<Integer>("acctNum");
	public static final Property<Double> CALL_AMOUNT = new Property<Double>("callAmount");
	public static final Property<String> CALL_CURR_CODE = new Property<String>("callCurrCode");
	public static final Property<Date> CALL_DATE = new Property<Date>("callDate");
	public static final Property<String> CALL_STATUS = new Property<String>("callStatus");
	public static final Property<Integer> COST_NUM = new Property<Integer>("costNum");
	public static final Property<Integer> DOC_NUM = new Property<Integer>("docNum");
	public static final Property<Date> DUE_DATE = new Property<Date>("dueDate");
	public static final Property<Integer> MARGIN_CALL_NUM = new Property<Integer>("marginCallNum");
	public static final Property<Integer> MCA_NUM = new Property<Integer>("mcaNum");
	public static final Property<String> PARTY_TYPE = new Property<String>("partyType");
	public static final Property<Integer> RESP_TRANS_ID = new Property<Integer>("respTransId");
	public static final Property<String> TOTAL_MTM_CURR = new Property<String>("totalMtmCurr");
	public static final Property<Double> TOTAL_MTM_EXP = new Property<Double>("totalMtmExp");
	public static final Property<Integer> TRANS_ID = new Property<Integer>("transId");

	public void setAcctNum(Integer acctNum)
	{
		writeProperty("acctNum", acctNum);
	}

	public Integer getAcctNum()
	{
		return (Integer) readProperty("acctNum");
	}

	public void setCallAmount(Double callAmount)
	{
		writeProperty("callAmount", callAmount);
	}

	public Double getCallAmount()
	{
		return (Double) readProperty("callAmount");
	}

	public void setCallCurrCode(String callCurrCode)
	{
		writeProperty("callCurrCode", callCurrCode);
	}

	public String getCallCurrCode()
	{
		return (String) readProperty("callCurrCode");
	}

	public void setCallDate(Date callDate)
	{
		writeProperty("callDate", callDate);
	}

	public Date getCallDate()
	{
		return (Date) readProperty("callDate");
	}

	public void setCallStatus(String callStatus)
	{
		writeProperty("callStatus", callStatus);
	}

	public String getCallStatus()
	{
		return (String) readProperty("callStatus");
	}

	public void setCostNum(Integer costNum)
	{
		writeProperty("costNum", costNum);
	}

	public Integer getCostNum()
	{
		return (Integer) readProperty("costNum");
	}

	public void setDocNum(Integer docNum)
	{
		writeProperty("docNum", docNum);
	}

	public Integer getDocNum()
	{
		return (Integer) readProperty("docNum");
	}

	public void setDueDate(Date dueDate)
	{
		writeProperty("dueDate", dueDate);
	}

	public Date getDueDate()
	{
		return (Date) readProperty("dueDate");
	}

	public void setMarginCallNum(Integer marginCallNum)
	{
		writeProperty("marginCallNum", marginCallNum);
	}

	public Integer getMarginCallNum()
	{
		return (Integer) readProperty("marginCallNum");
	}

	public void setMcaNum(Integer mcaNum)
	{
		writeProperty("mcaNum", mcaNum);
	}

	public Integer getMcaNum()
	{
		return (Integer) readProperty("mcaNum");
	}

	public void setPartyType(String partyType)
	{
		writeProperty("partyType", partyType);
	}

	public String getPartyType()
	{
		return (String) readProperty("partyType");
	}

	public void setRespTransId(Integer respTransId)
	{
		writeProperty("respTransId", respTransId);
	}

	public Integer getRespTransId()
	{
		return (Integer) readProperty("respTransId");
	}

	public void setTotalMtmCurr(String totalMtmCurr)
	{
		writeProperty("totalMtmCurr", totalMtmCurr);
	}

	public String getTotalMtmCurr()
	{
		return (String) readProperty("totalMtmCurr");
	}

	public void setTotalMtmExp(Double totalMtmExp)
	{
		writeProperty("totalMtmExp", totalMtmExp);
	}

	public Double getTotalMtmExp()
	{
		return (Double) readProperty("totalMtmExp");
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
