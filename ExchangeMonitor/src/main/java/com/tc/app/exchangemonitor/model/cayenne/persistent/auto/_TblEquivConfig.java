package com.tc.app.exchangemonitor.model.cayenne.persistent.auto;

import org.apache.cayenne.CayenneDataObject;
import org.apache.cayenne.exp.Property;

/**
 * Class _TblEquivConfig was generated by Cayenne.
 * It is probably a good idea to avoid changing this class manually,
 * since it may be overwritten next time code is regenerated.
 * If you need to make any customizations, please use subclass.
 */
public abstract class _TblEquivConfig extends CayenneDataObject
{

	private static final long serialVersionUID = 1L;

	public static final Property<String> CATEGORY = new Property<String>("category");
	public static final Property<String> CONFIG_NAME = new Property<String>("configName");
	public static final Property<String> CONFIGTYPE = new Property<String>("configtype");
	public static final Property<String> OPTION = new Property<String>("option");
	public static final Property<Short> VALUE_PARAM = new Property<Short>("valueParam");
	public static final Property<String> VALUE_PARAM2 = new Property<String>("valueParam2");

	public void setCategory(String category)
	{
		writeProperty("category", category);
	}

	public String getCategory()
	{
		return (String) readProperty("category");
	}

	public void setConfigName(String configName)
	{
		writeProperty("configName", configName);
	}

	public String getConfigName()
	{
		return (String) readProperty("configName");
	}

	public void setConfigtype(String configtype)
	{
		writeProperty("configtype", configtype);
	}

	public String getConfigtype()
	{
		return (String) readProperty("configtype");
	}

	public void setOption(String option)
	{
		writeProperty("option", option);
	}

	public String getOption()
	{
		return (String) readProperty("option");
	}

	public void setValueParam(Short valueParam)
	{
		writeProperty("valueParam", valueParam);
	}

	public Short getValueParam()
	{
		return (Short) readProperty("valueParam");
	}

	public void setValueParam2(String valueParam2)
	{
		writeProperty("valueParam2", valueParam2);
	}

	public String getValueParam2()
	{
		return (String) readProperty("valueParam2");
	}

}