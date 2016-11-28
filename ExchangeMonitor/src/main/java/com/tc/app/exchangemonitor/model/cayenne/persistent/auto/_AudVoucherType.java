package com.tc.app.exchangemonitor.model.cayenne.persistent.auto;

import org.apache.cayenne.CayenneDataObject;
import org.apache.cayenne.exp.Property;

/**
 * Class _AudVoucherType was generated by Cayenne.
 * It is probably a good idea to avoid changing this class manually,
 * since it may be overwritten next time code is regenerated.
 * If you need to make any customizations, please use subclass.
 */
public abstract class _AudVoucherType extends CayenneDataObject
{

	private static final long serialVersionUID = 1L;

	public static final Property<Integer> RESP_TRANS_ID = new Property<Integer>("respTransId");
	public static final Property<Integer> TRANS_ID = new Property<Integer>("transId");
	public static final Property<String> VOUCHER_TYPE_CODE = new Property<String>("voucherTypeCode");
	public static final Property<String> VOUCHER_TYPE_DESC = new Property<String>("voucherTypeDesc");

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

	public void setVoucherTypeCode(String voucherTypeCode)
	{
		writeProperty("voucherTypeCode", voucherTypeCode);
	}

	public String getVoucherTypeCode()
	{
		return (String) readProperty("voucherTypeCode");
	}

	public void setVoucherTypeDesc(String voucherTypeDesc)
	{
		writeProperty("voucherTypeDesc", voucherTypeDesc);
	}

	public String getVoucherTypeDesc()
	{
		return (String) readProperty("voucherTypeDesc");
	}

}