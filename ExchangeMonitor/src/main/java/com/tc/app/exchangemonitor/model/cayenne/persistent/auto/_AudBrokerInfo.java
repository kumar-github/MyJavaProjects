package com.tc.app.exchangemonitor.model.cayenne.persistent.auto;

import org.apache.cayenne.CayenneDataObject;
import org.apache.cayenne.exp.Property;

/**
 * Class _AudBrokerInfo was generated by Cayenne.
 * It is probably a good idea to avoid changing this class manually,
 * since it may be overwritten next time code is regenerated.
 * If you need to make any customizations, please use subclass.
 */
public abstract class _AudBrokerInfo extends CayenneDataObject
{

	private static final long serialVersionUID = 1L;

	public static final Property<Integer> ACCT_NUM = new Property<Integer>("acctNum");
	public static final Property<Double> DFLT_COMM_AMT = new Property<Double>("dfltCommAmt");
	public static final Property<String> DFLT_COMM_CURR_CODE = new Property<String>("dfltCommCurrCode");
	public static final Property<String> DFLT_COMM_UOM_CODE = new Property<String>("dfltCommUomCode");
	public static final Property<Integer> RESP_TRANS_ID = new Property<Integer>("respTransId");
	public static final Property<Integer> TRANS_ID = new Property<Integer>("transId");

	public void setAcctNum(Integer acctNum)
	{
		writeProperty("acctNum", acctNum);
	}

	public Integer getAcctNum()
	{
		return (Integer) readProperty("acctNum");
	}

	public void setDfltCommAmt(Double dfltCommAmt)
	{
		writeProperty("dfltCommAmt", dfltCommAmt);
	}

	public Double getDfltCommAmt()
	{
		return (Double) readProperty("dfltCommAmt");
	}

	public void setDfltCommCurrCode(String dfltCommCurrCode)
	{
		writeProperty("dfltCommCurrCode", dfltCommCurrCode);
	}

	public String getDfltCommCurrCode()
	{
		return (String) readProperty("dfltCommCurrCode");
	}

	public void setDfltCommUomCode(String dfltCommUomCode)
	{
		writeProperty("dfltCommUomCode", dfltCommUomCode);
	}

	public String getDfltCommUomCode()
	{
		return (String) readProperty("dfltCommUomCode");
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
