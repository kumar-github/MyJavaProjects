package com.tc.app.exchangemonitor.model.cayenne.persistent.auto;

import org.apache.cayenne.CayenneDataObject;
import org.apache.cayenne.exp.Property;

/**
 * Class _AudAccountType was generated by Cayenne.
 * It is probably a good idea to avoid changing this class manually,
 * since it may be overwritten next time code is regenerated.
 * If you need to make any customizations, please use subclass.
 */
public abstract class _AudAccountType extends CayenneDataObject
{

	private static final long serialVersionUID = 1L;

	public static final Property<String> ACCT_TYPE_CODE = new Property<String>("acctTypeCode");
	public static final Property<String> ACCT_TYPE_DESC = new Property<String>("acctTypeDesc");
	public static final Property<Short> ACCT_TYPE_NUM = new Property<Short>("acctTypeNum");
	public static final Property<Integer> RESP_TRANS_ID = new Property<Integer>("respTransId");
	public static final Property<Integer> TRANS_ID = new Property<Integer>("transId");

	public void setAcctTypeCode(String acctTypeCode)
	{
		writeProperty("acctTypeCode", acctTypeCode);
	}

	public String getAcctTypeCode()
	{
		return (String) readProperty("acctTypeCode");
	}

	public void setAcctTypeDesc(String acctTypeDesc)
	{
		writeProperty("acctTypeDesc", acctTypeDesc);
	}

	public String getAcctTypeDesc()
	{
		return (String) readProperty("acctTypeDesc");
	}

	public void setAcctTypeNum(Short acctTypeNum)
	{
		writeProperty("acctTypeNum", acctTypeNum);
	}

	public Short getAcctTypeNum()
	{
		return (Short) readProperty("acctTypeNum");
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
