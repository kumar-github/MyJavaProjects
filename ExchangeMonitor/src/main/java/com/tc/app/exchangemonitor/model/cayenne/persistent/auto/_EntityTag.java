package com.tc.app.exchangemonitor.model.cayenne.persistent.auto;

import org.apache.cayenne.CayenneDataObject;
import org.apache.cayenne.exp.Property;

import com.tc.app.exchangemonitor.model.cayenne.persistent.EntityTagDefinition;

/**
 * Class _EntityTag was generated by Cayenne.
 * It is probably a good idea to avoid changing this class manually,
 * since it may be overwritten next time code is regenerated.
 * If you need to make any customizations, please use subclass.
 */
public abstract class _EntityTag extends CayenneDataObject
{

	private static final long serialVersionUID = 1L;

	public static final String ENTITY_TAG_KEY_PK_COLUMN = "entity_tag_key";

	public static final Property<String> KEY1 = new Property<String>("key1");
	public static final Property<String> KEY2 = new Property<String>("key2");
	public static final Property<String> KEY3 = new Property<String>("key3");
	public static final Property<String> KEY4 = new Property<String>("key4");
	public static final Property<String> KEY5 = new Property<String>("key5");
	public static final Property<String> KEY6 = new Property<String>("key6");
	public static final Property<String> KEY7 = new Property<String>("key7");
	public static final Property<String> KEY8 = new Property<String>("key8");
	public static final Property<String> TARGET_KEY1 = new Property<String>("targetKey1");
	public static final Property<String> TARGET_KEY2 = new Property<String>("targetKey2");
	public static final Property<String> TARGET_KEY3 = new Property<String>("targetKey3");
	public static final Property<String> TARGET_KEY4 = new Property<String>("targetKey4");
	public static final Property<String> TARGET_KEY5 = new Property<String>("targetKey5");
	public static final Property<String> TARGET_KEY6 = new Property<String>("targetKey6");
	public static final Property<String> TARGET_KEY7 = new Property<String>("targetKey7");
	public static final Property<String> TARGET_KEY8 = new Property<String>("targetKey8");
	public static final Property<Integer> TRANS_ID = new Property<Integer>("transId");
	public static final Property<EntityTagDefinition> ENTITY_TAG = new Property<EntityTagDefinition>("entityTag");

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

	public void setTargetKey1(String targetKey1)
	{
		writeProperty("targetKey1", targetKey1);
	}

	public String getTargetKey1()
	{
		return (String) readProperty("targetKey1");
	}

	public void setTargetKey2(String targetKey2)
	{
		writeProperty("targetKey2", targetKey2);
	}

	public String getTargetKey2()
	{
		return (String) readProperty("targetKey2");
	}

	public void setTargetKey3(String targetKey3)
	{
		writeProperty("targetKey3", targetKey3);
	}

	public String getTargetKey3()
	{
		return (String) readProperty("targetKey3");
	}

	public void setTargetKey4(String targetKey4)
	{
		writeProperty("targetKey4", targetKey4);
	}

	public String getTargetKey4()
	{
		return (String) readProperty("targetKey4");
	}

	public void setTargetKey5(String targetKey5)
	{
		writeProperty("targetKey5", targetKey5);
	}

	public String getTargetKey5()
	{
		return (String) readProperty("targetKey5");
	}

	public void setTargetKey6(String targetKey6)
	{
		writeProperty("targetKey6", targetKey6);
	}

	public String getTargetKey6()
	{
		return (String) readProperty("targetKey6");
	}

	public void setTargetKey7(String targetKey7)
	{
		writeProperty("targetKey7", targetKey7);
	}

	public String getTargetKey7()
	{
		return (String) readProperty("targetKey7");
	}

	public void setTargetKey8(String targetKey8)
	{
		writeProperty("targetKey8", targetKey8);
	}

	public String getTargetKey8()
	{
		return (String) readProperty("targetKey8");
	}

	public void setTransId(Integer transId)
	{
		writeProperty("transId", transId);
	}

	public Integer getTransId()
	{
		return (Integer) readProperty("transId");
	}

	public void setEntityTag(EntityTagDefinition entityTag)
	{
		setToOneTarget("entityTag", entityTag, true);
	}

	public EntityTagDefinition getEntityTag()
	{
		return (EntityTagDefinition) readProperty("entityTag");
	}

}
