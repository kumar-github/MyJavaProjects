package com.tc.app.exchangemonitor.model.cayenne.persistent.auto;

import java.util.Date;
import java.util.List;

import org.apache.cayenne.CayenneDataObject;
import org.apache.cayenne.exp.Property;

import com.tc.app.exchangemonitor.model.cayenne.persistent.ExtRefdataMapping;

/**
 * Class _ExtRefKeys was generated by Cayenne.
 * It is probably a good idea to avoid changing this class manually,
 * since it may be overwritten next time code is regenerated.
 * If you need to make any customizations, please use subclass.
 */
public abstract class _ExtRefKeys extends CayenneDataObject
{

	private static final long serialVersionUID = 1L;

	public static final String OID_PK_COLUMN = "oid";

	public static final Property<Date> DT_KEY_VALUE = new Property<Date>("dtKeyValue");
	public static final Property<Integer> INT_KEY_VALUE = new Property<Integer>("intKeyValue");
	public static final Property<String> STR_KEY_VALUE = new Property<String>("strKeyValue");
	public static final Property<Integer> TRANS_ID = new Property<Integer>("transId");
	public static final Property<List<ExtRefdataMapping>> EXT_REFDATA_MAPPINGS = new Property<List<ExtRefdataMapping>>("extRefdataMappings");
	public static final Property<List<ExtRefdataMapping>> EXT_REFDATA_MAPPINGS1 = new Property<List<ExtRefdataMapping>>("extRefdataMappings1");
	public static final Property<List<ExtRefdataMapping>> EXT_REFDATA_MAPPINGS2 = new Property<List<ExtRefdataMapping>>("extRefdataMappings2");
	public static final Property<List<ExtRefdataMapping>> EXT_REFDATA_MAPPINGS3 = new Property<List<ExtRefdataMapping>>("extRefdataMappings3");
	public static final Property<List<ExtRefdataMapping>> EXT_REFDATA_MAPPINGS4 = new Property<List<ExtRefdataMapping>>("extRefdataMappings4");
	public static final Property<List<ExtRefdataMapping>> EXT_REFDATA_MAPPINGS5 = new Property<List<ExtRefdataMapping>>("extRefdataMappings5");

	public void setDtKeyValue(Date dtKeyValue)
	{
		writeProperty("dtKeyValue", dtKeyValue);
	}

	public Date getDtKeyValue()
	{
		return (Date) readProperty("dtKeyValue");
	}

	public void setIntKeyValue(Integer intKeyValue)
	{
		writeProperty("intKeyValue", intKeyValue);
	}

	public Integer getIntKeyValue()
	{
		return (Integer) readProperty("intKeyValue");
	}

	public void setStrKeyValue(String strKeyValue)
	{
		writeProperty("strKeyValue", strKeyValue);
	}

	public String getStrKeyValue()
	{
		return (String) readProperty("strKeyValue");
	}

	public void setTransId(Integer transId)
	{
		writeProperty("transId", transId);
	}

	public Integer getTransId()
	{
		return (Integer) readProperty("transId");
	}

	public void addToExtRefdataMappings(ExtRefdataMapping obj)
	{
		addToManyTarget("extRefdataMappings", obj, true);
	}

	public void removeFromExtRefdataMappings(ExtRefdataMapping obj)
	{
		removeToManyTarget("extRefdataMappings", obj, true);
	}

	@SuppressWarnings("unchecked")
	public List<ExtRefdataMapping> getExtRefdataMappings()
	{
		return (List<ExtRefdataMapping>) readProperty("extRefdataMappings");
	}

	public void addToExtRefdataMappings1(ExtRefdataMapping obj)
	{
		addToManyTarget("extRefdataMappings1", obj, true);
	}

	public void removeFromExtRefdataMappings1(ExtRefdataMapping obj)
	{
		removeToManyTarget("extRefdataMappings1", obj, true);
	}

	@SuppressWarnings("unchecked")
	public List<ExtRefdataMapping> getExtRefdataMappings1()
	{
		return (List<ExtRefdataMapping>) readProperty("extRefdataMappings1");
	}

	public void addToExtRefdataMappings2(ExtRefdataMapping obj)
	{
		addToManyTarget("extRefdataMappings2", obj, true);
	}

	public void removeFromExtRefdataMappings2(ExtRefdataMapping obj)
	{
		removeToManyTarget("extRefdataMappings2", obj, true);
	}

	@SuppressWarnings("unchecked")
	public List<ExtRefdataMapping> getExtRefdataMappings2()
	{
		return (List<ExtRefdataMapping>) readProperty("extRefdataMappings2");
	}

	public void addToExtRefdataMappings3(ExtRefdataMapping obj)
	{
		addToManyTarget("extRefdataMappings3", obj, true);
	}

	public void removeFromExtRefdataMappings3(ExtRefdataMapping obj)
	{
		removeToManyTarget("extRefdataMappings3", obj, true);
	}

	@SuppressWarnings("unchecked")
	public List<ExtRefdataMapping> getExtRefdataMappings3()
	{
		return (List<ExtRefdataMapping>) readProperty("extRefdataMappings3");
	}

	public void addToExtRefdataMappings4(ExtRefdataMapping obj)
	{
		addToManyTarget("extRefdataMappings4", obj, true);
	}

	public void removeFromExtRefdataMappings4(ExtRefdataMapping obj)
	{
		removeToManyTarget("extRefdataMappings4", obj, true);
	}

	@SuppressWarnings("unchecked")
	public List<ExtRefdataMapping> getExtRefdataMappings4()
	{
		return (List<ExtRefdataMapping>) readProperty("extRefdataMappings4");
	}

	public void addToExtRefdataMappings5(ExtRefdataMapping obj)
	{
		addToManyTarget("extRefdataMappings5", obj, true);
	}

	public void removeFromExtRefdataMappings5(ExtRefdataMapping obj)
	{
		removeToManyTarget("extRefdataMappings5", obj, true);
	}

	@SuppressWarnings("unchecked")
	public List<ExtRefdataMapping> getExtRefdataMappings5()
	{
		return (List<ExtRefdataMapping>) readProperty("extRefdataMappings5");
	}

}
