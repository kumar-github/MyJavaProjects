package com.tc.app.exchangemonitor.model.cayenne.persistent.auto;

import org.apache.cayenne.CayenneDataObject;
import org.apache.cayenne.exp.Property;

/**
 * Class _AudBrokerCommissionDefault was generated by Cayenne.
 * It is probably a good idea to avoid changing this class manually,
 * since it may be overwritten next time code is regenerated.
 * If you need to make any customizations, please use subclass.
 */
public abstract class _AudBrokerCommissionDefault extends CayenneDataObject
{

	private static final long serialVersionUID = 1L;

	public static final Property<Integer> ACCT_NUM = new Property<Integer>("acctNum");
	public static final Property<Double> BRKR_COMM_AMT = new Property<Double>("brkrCommAmt");
	public static final Property<String> BRKR_COMM_CURR_CODE = new Property<String>("brkrCommCurrCode");
	public static final Property<Integer> BRKR_COMM_DFLT_NUM = new Property<Integer>("brkrCommDfltNum");
	public static final Property<String> BRKR_COMM_UOM_CODE = new Property<String>("brkrCommUomCode");
	public static final Property<Integer> BRKR_CONT_NUM = new Property<Integer>("brkrContNum");
	public static final Property<Integer> BRKR_NUM = new Property<Integer>("brkrNum");
	public static final Property<String> CMDTY_CODE = new Property<String>("cmdtyCode");
	public static final Property<String> DEL_LOC_CODE_KEY = new Property<String>("delLocCodeKey");
	public static final Property<String> ORDER_TYPE_CODE = new Property<String>("orderTypeCode");
	public static final Property<String> P_SIND = new Property<String>("pSInd");
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

	public void setBrkrCommAmt(Double brkrCommAmt)
	{
		writeProperty("brkrCommAmt", brkrCommAmt);
	}

	public Double getBrkrCommAmt()
	{
		return (Double) readProperty("brkrCommAmt");
	}

	public void setBrkrCommCurrCode(String brkrCommCurrCode)
	{
		writeProperty("brkrCommCurrCode", brkrCommCurrCode);
	}

	public String getBrkrCommCurrCode()
	{
		return (String) readProperty("brkrCommCurrCode");
	}

	public void setBrkrCommDfltNum(Integer brkrCommDfltNum)
	{
		writeProperty("brkrCommDfltNum", brkrCommDfltNum);
	}

	public Integer getBrkrCommDfltNum()
	{
		return (Integer) readProperty("brkrCommDfltNum");
	}

	public void setBrkrCommUomCode(String brkrCommUomCode)
	{
		writeProperty("brkrCommUomCode", brkrCommUomCode);
	}

	public String getBrkrCommUomCode()
	{
		return (String) readProperty("brkrCommUomCode");
	}

	public void setBrkrContNum(Integer brkrContNum)
	{
		writeProperty("brkrContNum", brkrContNum);
	}

	public Integer getBrkrContNum()
	{
		return (Integer) readProperty("brkrContNum");
	}

	public void setBrkrNum(Integer brkrNum)
	{
		writeProperty("brkrNum", brkrNum);
	}

	public Integer getBrkrNum()
	{
		return (Integer) readProperty("brkrNum");
	}

	public void setCmdtyCode(String cmdtyCode)
	{
		writeProperty("cmdtyCode", cmdtyCode);
	}

	public String getCmdtyCode()
	{
		return (String) readProperty("cmdtyCode");
	}

	public void setDelLocCodeKey(String delLocCodeKey)
	{
		writeProperty("delLocCodeKey", delLocCodeKey);
	}

	public String getDelLocCodeKey()
	{
		return (String) readProperty("delLocCodeKey");
	}

	public void setOrderTypeCode(String orderTypeCode)
	{
		writeProperty("orderTypeCode", orderTypeCode);
	}

	public String getOrderTypeCode()
	{
		return (String) readProperty("orderTypeCode");
	}

	public void setPSInd(String pSInd)
	{
		writeProperty("pSInd", pSInd);
	}

	public String getPSInd()
	{
		return (String) readProperty("pSInd");
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
