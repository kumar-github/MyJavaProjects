package com.tc.app.exchangemonitor.model.cayenne.persistent.auto;

import org.apache.cayenne.CayenneDataObject;
import org.apache.cayenne.exp.Property;

/**
 * Class _VTradeItemExtInfoRev was generated by Cayenne.
 * It is probably a good idea to avoid changing this class manually,
 * since it may be overwritten next time code is regenerated.
 * If you need to make any customizations, please use subclass.
 */
public abstract class _VTradeItemExtInfoRev extends CayenneDataObject
{

	private static final long serialVersionUID = 1L;

	public static final Property<Integer> ASOF_TRANS_ID = new Property<Integer>("asofTransId");
	public static final Property<String> CUSTOM_FIELD1 = new Property<String>("customField1");
	public static final Property<String> CUSTOM_FIELD2 = new Property<String>("customField2");
	public static final Property<String> CUSTOM_FIELD3 = new Property<String>("customField3");
	public static final Property<String> CUSTOM_FIELD4 = new Property<String>("customField4");
	public static final Property<String> CUSTOM_FIELD5 = new Property<String>("customField5");
	public static final Property<String> CUSTOM_FIELD6 = new Property<String>("customField6");
	public static final Property<String> CUSTOM_FIELD7 = new Property<String>("customField7");
	public static final Property<String> CUSTOM_FIELD8 = new Property<String>("customField8");
	public static final Property<Short> ITEM_NUM = new Property<Short>("itemNum");
	public static final Property<Short> ORDER_NUM = new Property<Short>("orderNum");
	public static final Property<Integer> RESP_TRANS_ID = new Property<Integer>("respTransId");
	public static final Property<Integer> TRADE_NUM = new Property<Integer>("tradeNum");
	public static final Property<Integer> TRANS_ID = new Property<Integer>("transId");

	public void setAsofTransId(Integer asofTransId)
	{
		writeProperty("asofTransId", asofTransId);
	}

	public Integer getAsofTransId()
	{
		return (Integer) readProperty("asofTransId");
	}

	public void setCustomField1(String customField1)
	{
		writeProperty("customField1", customField1);
	}

	public String getCustomField1()
	{
		return (String) readProperty("customField1");
	}

	public void setCustomField2(String customField2)
	{
		writeProperty("customField2", customField2);
	}

	public String getCustomField2()
	{
		return (String) readProperty("customField2");
	}

	public void setCustomField3(String customField3)
	{
		writeProperty("customField3", customField3);
	}

	public String getCustomField3()
	{
		return (String) readProperty("customField3");
	}

	public void setCustomField4(String customField4)
	{
		writeProperty("customField4", customField4);
	}

	public String getCustomField4()
	{
		return (String) readProperty("customField4");
	}

	public void setCustomField5(String customField5)
	{
		writeProperty("customField5", customField5);
	}

	public String getCustomField5()
	{
		return (String) readProperty("customField5");
	}

	public void setCustomField6(String customField6)
	{
		writeProperty("customField6", customField6);
	}

	public String getCustomField6()
	{
		return (String) readProperty("customField6");
	}

	public void setCustomField7(String customField7)
	{
		writeProperty("customField7", customField7);
	}

	public String getCustomField7()
	{
		return (String) readProperty("customField7");
	}

	public void setCustomField8(String customField8)
	{
		writeProperty("customField8", customField8);
	}

	public String getCustomField8()
	{
		return (String) readProperty("customField8");
	}

	public void setItemNum(Short itemNum)
	{
		writeProperty("itemNum", itemNum);
	}

	public Short getItemNum()
	{
		return (Short) readProperty("itemNum");
	}

	public void setOrderNum(Short orderNum)
	{
		writeProperty("orderNum", orderNum);
	}

	public Short getOrderNum()
	{
		return (Short) readProperty("orderNum");
	}

	public void setRespTransId(Integer respTransId)
	{
		writeProperty("respTransId", respTransId);
	}

	public Integer getRespTransId()
	{
		return (Integer) readProperty("respTransId");
	}

	public void setTradeNum(Integer tradeNum)
	{
		writeProperty("tradeNum", tradeNum);
	}

	public Integer getTradeNum()
	{
		return (Integer) readProperty("tradeNum");
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
