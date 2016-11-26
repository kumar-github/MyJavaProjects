package com.tc.app.exchangemonitor.model.cayenne.persistent.auto;

import org.apache.cayenne.CayenneDataObject;
import org.apache.cayenne.exp.Property;

/**
 * Class _AudUicStatus was generated by Cayenne.
 * It is probably a good idea to avoid changing this class manually,
 * since it may be overwritten next time code is regenerated.
 * If you need to make any customizations, please use subclass.
 */
public abstract class _AudUicStatus extends CayenneDataObject
{

	private static final long serialVersionUID = 1L;

	public static final Property<Integer> ENTITY_ID = new Property<Integer>("entityId");
	public static final Property<Integer> RESP_TRANS_ID = new Property<Integer>("respTransId");
	public static final Property<String> STATUS_SELECTOR = new Property<String>("statusSelector");
	public static final Property<Integer> TRANS_ID = new Property<Integer>("transId");

	public void setEntityId(Integer entityId)
	{
		writeProperty("entityId", entityId);
	}

	public Integer getEntityId()
	{
		return (Integer) readProperty("entityId");
	}

	public void setRespTransId(Integer respTransId)
	{
		writeProperty("respTransId", respTransId);
	}

	public Integer getRespTransId()
	{
		return (Integer) readProperty("respTransId");
	}

	public void setStatusSelector(String statusSelector)
	{
		writeProperty("statusSelector", statusSelector);
	}

	public String getStatusSelector()
	{
		return (String) readProperty("statusSelector");
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
