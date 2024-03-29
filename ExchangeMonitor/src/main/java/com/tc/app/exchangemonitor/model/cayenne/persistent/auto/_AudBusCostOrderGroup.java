package com.tc.app.exchangemonitor.model.cayenne.persistent.auto;

import org.apache.cayenne.CayenneDataObject;
import org.apache.cayenne.exp.Property;

/**
 * Class _AudBusCostOrderGroup was generated by Cayenne.
 * It is probably a good idea to avoid changing this class manually,
 * since it may be overwritten next time code is regenerated.
 * If you need to make any customizations, please use subclass.
 */
public abstract class _AudBusCostOrderGroup extends CayenneDataObject
{

	private static final long serialVersionUID = 1L;

	public static final Property<Short> BC_TYPE_NUM = new Property<Short>("bcTypeNum");
	public static final Property<String> ORDER_TYPE_GROUP = new Property<String>("orderTypeGroup");
	public static final Property<Integer> RESP_TRANS_ID = new Property<Integer>("respTransId");
	public static final Property<Integer> TRANS_ID = new Property<Integer>("transId");

	public void setBcTypeNum(Short bcTypeNum)
	{
		writeProperty("bcTypeNum", bcTypeNum);
	}

	public Short getBcTypeNum()
	{
		return (Short) readProperty("bcTypeNum");
	}

	public void setOrderTypeGroup(String orderTypeGroup)
	{
		writeProperty("orderTypeGroup", orderTypeGroup);
	}

	public String getOrderTypeGroup()
	{
		return (String) readProperty("orderTypeGroup");
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
