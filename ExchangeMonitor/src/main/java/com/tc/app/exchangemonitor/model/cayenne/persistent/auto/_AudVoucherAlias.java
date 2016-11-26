package com.tc.app.exchangemonitor.model.cayenne.persistent.auto;

import org.apache.cayenne.CayenneDataObject;
import org.apache.cayenne.exp.Property;

/**
 * Class _AudVoucherAlias was generated by Cayenne.
 * It is probably a good idea to avoid changing this class manually,
 * since it may be overwritten next time code is regenerated.
 * If you need to make any customizations, please use subclass.
 */
public abstract class _AudVoucherAlias extends CayenneDataObject
{

	private static final long serialVersionUID = 1L;

	public static final Property<String> ALIAS_SOURCE_CODE = new Property<String>("aliasSourceCode");
	public static final Property<Integer> RESP_TRANS_ID = new Property<Integer>("respTransId");
	public static final Property<Integer> TRANS_ID = new Property<Integer>("transId");
	public static final Property<String> VOUCHER_ALIAS_NAME = new Property<String>("voucherAliasName");
	public static final Property<Integer> VOUCHER_NUM = new Property<Integer>("voucherNum");

	public void setAliasSourceCode(String aliasSourceCode)
	{
		writeProperty("aliasSourceCode", aliasSourceCode);
	}

	public String getAliasSourceCode()
	{
		return (String) readProperty("aliasSourceCode");
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

	public void setVoucherAliasName(String voucherAliasName)
	{
		writeProperty("voucherAliasName", voucherAliasName);
	}

	public String getVoucherAliasName()
	{
		return (String) readProperty("voucherAliasName");
	}

	public void setVoucherNum(Integer voucherNum)
	{
		writeProperty("voucherNum", voucherNum);
	}

	public Integer getVoucherNum()
	{
		return (Integer) readProperty("voucherNum");
	}

}
