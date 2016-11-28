package com.tc.app.exchangemonitor.model.cayenne.persistent.auto;

import org.apache.cayenne.CayenneDataObject;
import org.apache.cayenne.exp.Property;

import com.tc.app.exchangemonitor.model.cayenne.persistent.IctsEntityName;
import com.tc.app.exchangemonitor.model.cayenne.persistent.TiInboundDataXml;

/**
 * Class _TiFeedTransaction was generated by Cayenne.
 * It is probably a good idea to avoid changing this class manually,
 * since it may be overwritten next time code is regenerated.
 * If you need to make any customizations, please use subclass.
 */
public abstract class _TiFeedTransaction extends CayenneDataObject
{

	private static final long serialVersionUID = 1L;

	public static final String OID_PK_COLUMN = "oid";

	public static final Property<Integer> DD_INSTANCE_NUM = new Property<Integer>("ddInstanceNum");
	public static final Property<String> DD_STATUS = new Property<String>("ddStatus");
	public static final Property<Integer> FEED_ROW_OID = new Property<Integer>("feedRowOid");
	public static final Property<String> KEY1 = new Property<String>("key1");
	public static final Property<String> KEY2 = new Property<String>("key2");
	public static final Property<String> KEY3 = new Property<String>("key3");
	public static final Property<String> KEY4 = new Property<String>("key4");
	public static final Property<String> KEY5 = new Property<String>("key5");
	public static final Property<String> OPERATION = new Property<String>("operation");
	public static final Property<Integer> RESP_TRANS_ID = new Property<Integer>("respTransId");
	public static final Property<String> SOURCE = new Property<String>("source");
	public static final Property<IctsEntityName> ENTITY = new Property<IctsEntityName>("entity");
	public static final Property<TiInboundDataXml> INBOUND_DATA_O = new Property<TiInboundDataXml>("inboundDataO");

	public void setDdInstanceNum(Integer ddInstanceNum)
	{
		writeProperty("ddInstanceNum", ddInstanceNum);
	}

	public Integer getDdInstanceNum()
	{
		return (Integer) readProperty("ddInstanceNum");
	}

	public void setDdStatus(String ddStatus)
	{
		writeProperty("ddStatus", ddStatus);
	}

	public String getDdStatus()
	{
		return (String) readProperty("ddStatus");
	}

	public void setFeedRowOid(Integer feedRowOid)
	{
		writeProperty("feedRowOid", feedRowOid);
	}

	public Integer getFeedRowOid()
	{
		return (Integer) readProperty("feedRowOid");
	}

	public void setKey1(String key1)
	{
		writeProperty("key1", key1);
	}

	public String getKey1()
	{
		return (String) readProperty("key1");
	}

	public void setKey2(String key2)
	{
		writeProperty("key2", key2);
	}

	public String getKey2()
	{
		return (String) readProperty("key2");
	}

	public void setKey3(String key3)
	{
		writeProperty("key3", key3);
	}

	public String getKey3()
	{
		return (String) readProperty("key3");
	}

	public void setKey4(String key4)
	{
		writeProperty("key4", key4);
	}

	public String getKey4()
	{
		return (String) readProperty("key4");
	}

	public void setKey5(String key5)
	{
		writeProperty("key5", key5);
	}

	public String getKey5()
	{
		return (String) readProperty("key5");
	}

	public void setOperation(String operation)
	{
		writeProperty("operation", operation);
	}

	public String getOperation()
	{
		return (String) readProperty("operation");
	}

	public void setRespTransId(Integer respTransId)
	{
		writeProperty("respTransId", respTransId);
	}

	public Integer getRespTransId()
	{
		return (Integer) readProperty("respTransId");
	}

	public void setSource(String source)
	{
		writeProperty("source", source);
	}

	public String getSource()
	{
		return (String) readProperty("source");
	}

	public void setEntity(IctsEntityName entity)
	{
		setToOneTarget("entity", entity, true);
	}

	public IctsEntityName getEntity()
	{
		return (IctsEntityName) readProperty("entity");
	}

	public void setInboundDataO(TiInboundDataXml inboundDataO)
	{
		setToOneTarget("inboundDataO", inboundDataO, true);
	}

	public TiInboundDataXml getInboundDataO()
	{
		return (TiInboundDataXml) readProperty("inboundDataO");
	}

}