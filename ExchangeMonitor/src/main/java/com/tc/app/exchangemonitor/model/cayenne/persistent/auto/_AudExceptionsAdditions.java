package com.tc.app.exchangemonitor.model.cayenne.persistent.auto;

import org.apache.cayenne.CayenneDataObject;
import org.apache.cayenne.exp.Property;

/**
 * Class _AudExceptionsAdditions was generated by Cayenne.
 * It is probably a good idea to avoid changing this class manually,
 * since it may be overwritten next time code is regenerated.
 * If you need to make any customizations, please use subclass.
 */
public abstract class _AudExceptionsAdditions extends CayenneDataObject
{

	private static final long serialVersionUID = 1L;

	public static final Property<String> EXCP_ADDNS_CODE = new Property<String>("excpAddnsCode");
	public static final Property<String> EXCP_ADDNS_DESC = new Property<String>("excpAddnsDesc");
	public static final Property<Integer> RESP_TRANS_ID = new Property<Integer>("respTransId");
	public static final Property<Integer> TRANS_ID = new Property<Integer>("transId");

	public void setExcpAddnsCode(String excpAddnsCode)
	{
		writeProperty("excpAddnsCode", excpAddnsCode);
	}

	public String getExcpAddnsCode()
	{
		return (String) readProperty("excpAddnsCode");
	}

	public void setExcpAddnsDesc(String excpAddnsDesc)
	{
		writeProperty("excpAddnsDesc", excpAddnsDesc);
	}

	public String getExcpAddnsDesc()
	{
		return (String) readProperty("excpAddnsDesc");
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