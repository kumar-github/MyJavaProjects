package com.tc.app.exchangemonitor.model.cayenne.persistent.auto;

import java.math.BigDecimal;

import org.apache.cayenne.CayenneDataObject;
import org.apache.cayenne.exp.Property;

/**
 * Class _VBcpTransactionTouch30 was generated by Cayenne.
 * It is probably a good idea to avoid changing this class manually,
 * since it may be overwritten next time code is regenerated.
 * If you need to make any customizations, please use subclass.
 */
public abstract class _VBcpTransactionTouch30 extends CayenneDataObject
{

	private static final long serialVersionUID = 1L;

	public static final Property<String> ENTITY_NAME = new Property<String>("entityName");
	public static final Property<String> KEY1 = new Property<String>("key1");
	public static final Property<String> KEY2 = new Property<String>("key2");
	public static final Property<String> KEY3 = new Property<String>("key3");
	public static final Property<String> KEY4 = new Property<String>("key4");
	public static final Property<String> KEY5 = new Property<String>("key5");
	public static final Property<String> KEY6 = new Property<String>("key6");
	public static final Property<String> KEY7 = new Property<String>("key7");
	public static final Property<String> KEY8 = new Property<String>("key8");
	public static final Property<String> OPERATION = new Property<String>("operation");
	public static final Property<BigDecimal> SEQUENCE = new Property<BigDecimal>("sequence");
	public static final Property<BigDecimal> TOUCH_KEY = new Property<BigDecimal>("touchKey");
	public static final Property<String> TOUCH_TYPE = new Property<String>("touchType");
	public static final Property<Integer> TRANS_ID = new Property<Integer>("transId");

	public void setEntityName(String entityName)
	{
		writeProperty("entityName", entityName);
	}

	public String getEntityName()
	{
		return (String) readProperty("entityName");
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

	public void setKey6(String key6)
	{
		writeProperty("key6", key6);
	}

	public String getKey6()
	{
		return (String) readProperty("key6");
	}

	public void setKey7(String key7)
	{
		writeProperty("key7", key7);
	}

	public String getKey7()
	{
		return (String) readProperty("key7");
	}

	public void setKey8(String key8)
	{
		writeProperty("key8", key8);
	}

	public String getKey8()
	{
		return (String) readProperty("key8");
	}

	public void setOperation(String operation)
	{
		writeProperty("operation", operation);
	}

	public String getOperation()
	{
		return (String) readProperty("operation");
	}

	public void setSequence(BigDecimal sequence)
	{
		writeProperty("sequence", sequence);
	}

	public BigDecimal getSequence()
	{
		return (BigDecimal) readProperty("sequence");
	}

	public void setTouchKey(BigDecimal touchKey)
	{
		writeProperty("touchKey", touchKey);
	}

	public BigDecimal getTouchKey()
	{
		return (BigDecimal) readProperty("touchKey");
	}

	public void setTouchType(String touchType)
	{
		writeProperty("touchType", touchType);
	}

	public String getTouchType()
	{
		return (String) readProperty("touchType");
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
