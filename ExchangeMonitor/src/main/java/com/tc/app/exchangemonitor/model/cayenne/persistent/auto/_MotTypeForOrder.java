package com.tc.app.exchangemonitor.model.cayenne.persistent.auto;

import org.apache.cayenne.CayenneDataObject;
import org.apache.cayenne.exp.Property;

import com.tc.app.exchangemonitor.model.cayenne.persistent.OrderType;

/**
 * Class _MotTypeForOrder was generated by Cayenne.
 * It is probably a good idea to avoid changing this class manually,
 * since it may be overwritten next time code is regenerated.
 * If you need to make any customizations, please use subclass.
 */
public abstract class _MotTypeForOrder extends CayenneDataObject
{

	private static final long serialVersionUID = 1L;

	public static final String MOT_TYPE_CODE_PK_COLUMN = "mot_type_code";
	public static final String ORDER_TYPE_CODE_PK_COLUMN = "order_type_code";

	public static final Property<Integer> TRANS_ID = new Property<Integer>("transId");
	public static final Property<String> VIRTUAL_IND = new Property<String>("virtualInd");
	public static final Property<OrderType> ORDER_TYPE = new Property<OrderType>("orderType");

	public void setTransId(Integer transId)
	{
		writeProperty("transId", transId);
	}

	public Integer getTransId()
	{
		return (Integer) readProperty("transId");
	}

	public void setVirtualInd(String virtualInd)
	{
		writeProperty("virtualInd", virtualInd);
	}

	public String getVirtualInd()
	{
		return (String) readProperty("virtualInd");
	}

	public void setOrderType(OrderType orderType)
	{
		setToOneTarget("orderType", orderType, true);
	}

	public OrderType getOrderType()
	{
		return (OrderType) readProperty("orderType");
	}

}