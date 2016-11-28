package com.tc.app.exchangemonitor.model.cayenne.persistent.auto;

import org.apache.cayenne.CayenneDataObject;
import org.apache.cayenne.exp.Property;

/**
 * Class _AudLcDocType was generated by Cayenne.
 * It is probably a good idea to avoid changing this class manually,
 * since it may be overwritten next time code is regenerated.
 * If you need to make any customizations, please use subclass.
 */
public abstract class _AudLcDocType extends CayenneDataObject
{

	private static final long serialVersionUID = 1L;

	public static final Property<String> LC_DOC_TYPE_CODE = new Property<String>("lcDocTypeCode");
	public static final Property<String> LC_DOC_TYPE_DESC = new Property<String>("lcDocTypeDesc");
	public static final Property<String> LC_DOC_TYPE_SHORT_NAME = new Property<String>("lcDocTypeShortName");
	public static final Property<Integer> RESP_TRANS_ID = new Property<Integer>("respTransId");
	public static final Property<Integer> TRANS_ID = new Property<Integer>("transId");

	public void setLcDocTypeCode(String lcDocTypeCode)
	{
		writeProperty("lcDocTypeCode", lcDocTypeCode);
	}

	public String getLcDocTypeCode()
	{
		return (String) readProperty("lcDocTypeCode");
	}

	public void setLcDocTypeDesc(String lcDocTypeDesc)
	{
		writeProperty("lcDocTypeDesc", lcDocTypeDesc);
	}

	public String getLcDocTypeDesc()
	{
		return (String) readProperty("lcDocTypeDesc");
	}

	public void setLcDocTypeShortName(String lcDocTypeShortName)
	{
		writeProperty("lcDocTypeShortName", lcDocTypeShortName);
	}

	public String getLcDocTypeShortName()
	{
		return (String) readProperty("lcDocTypeShortName");
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