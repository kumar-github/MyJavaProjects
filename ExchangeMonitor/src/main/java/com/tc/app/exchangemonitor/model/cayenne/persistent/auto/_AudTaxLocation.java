package com.tc.app.exchangemonitor.model.cayenne.persistent.auto;

import org.apache.cayenne.CayenneDataObject;
import org.apache.cayenne.exp.Property;

/**
 * Class _AudTaxLocation was generated by Cayenne.
 * It is probably a good idea to avoid changing this class manually,
 * since it may be overwritten next time code is regenerated.
 * If you need to make any customizations, please use subclass.
 */
public abstract class _AudTaxLocation extends CayenneDataObject
{

	private static final long serialVersionUID = 1L;

	public static final Property<String> LOC_CODE = new Property<String>("locCode");
	public static final Property<Integer> RESP_TRANS_ID = new Property<Integer>("respTransId");
	public static final Property<Integer> TAX_AUTHORITY_NUM = new Property<Integer>("taxAuthorityNum");
	public static final Property<Integer> TRANS_ID = new Property<Integer>("transId");

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

	public void setTaxAuthorityNum(Integer taxAuthorityNum)
	{
		writeProperty("taxAuthorityNum", taxAuthorityNum);
	}

	public Integer getTaxAuthorityNum()
	{
		return (Integer) readProperty("taxAuthorityNum");
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