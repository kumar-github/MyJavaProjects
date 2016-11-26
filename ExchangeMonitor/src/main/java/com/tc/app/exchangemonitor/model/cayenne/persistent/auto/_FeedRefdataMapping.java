package com.tc.app.exchangemonitor.model.cayenne.persistent.auto;

import org.apache.cayenne.CayenneDataObject;
import org.apache.cayenne.exp.Property;

import com.tc.app.exchangemonitor.model.cayenne.persistent.AliasSource;
import com.tc.app.exchangemonitor.model.cayenne.persistent.IctsEntityName;

/**
 * Class _FeedRefdataMapping was generated by Cayenne.
 * It is probably a good idea to avoid changing this class manually,
 * since it may be overwritten next time code is regenerated.
 * If you need to make any customizations, please use subclass.
 */
public abstract class _FeedRefdataMapping extends CayenneDataObject
{

	private static final long serialVersionUID = 1L;

	public static final String OID_PK_COLUMN = "oid";

	public static final Property<String> ENTITY_KEY1VALUE_ID = new Property<>("entityKey1ValueId");
	public static final Property<String> ENTITY_KEY2VALUE_ID = new Property<>("entityKey2ValueId");
	public static final Property<String> ENTITY_KEY3VALUE_ID = new Property<>("entityKey3ValueId");
	public static final Property<String> ENTITY_KEY4VALUE_ID = new Property<>("entityKey4ValueId");
	public static final Property<String> ENTITY_KEY5VALUE_ID = new Property<>("entityKey5ValueId");
	public static final Property<String> ENTITY_KEY6VALUE_ID = new Property<>("entityKey6ValueId");
	public static final Property<String> EXTERNAL_KEY1 = new Property<>("externalKey1");
	public static final Property<String> EXTERNAL_KEY2 = new Property<>("externalKey2");
	public static final Property<String> EXTERNAL_KEY3 = new Property<>("externalKey3");
	public static final Property<Integer> TRANS_ID = new Property<>("transId");
	public static final Property<AliasSource> ALIAS_SOURCE = new Property<>("aliasSource");
	public static final Property<IctsEntityName> ENTITY = new Property<>("entity");

	public void setEntityKey1ValueId(final String entityKey1ValueId)
	{
		this.writeProperty("entityKey1ValueId", entityKey1ValueId);
	}

	public String getEntityKey1ValueId()
	{
		return (String) this.readProperty("entityKey1ValueId");
	}

	public void setEntityKey2ValueId(final String entityKey2ValueId)
	{
		this.writeProperty("entityKey2ValueId", entityKey2ValueId);
	}

	public String getEntityKey2ValueId()
	{
		return (String) this.readProperty("entityKey2ValueId");
	}

	public void setEntityKey3ValueId(final String entityKey3ValueId)
	{
		this.writeProperty("entityKey3ValueId", entityKey3ValueId);
	}

	public String getEntityKey3ValueId()
	{
		return (String) this.readProperty("entityKey3ValueId");
	}

	public void setEntityKey4ValueId(final String entityKey4ValueId)
	{
		this.writeProperty("entityKey4ValueId", entityKey4ValueId);
	}

	public String getEntityKey4ValueId()
	{
		return (String) this.readProperty("entityKey4ValueId");
	}

	public void setEntityKey5ValueId(final String entityKey5ValueId)
	{
		this.writeProperty("entityKey5ValueId", entityKey5ValueId);
	}

	public String getEntityKey5ValueId()
	{
		return (String) this.readProperty("entityKey5ValueId");
	}

	public void setEntityKey6ValueId(final String entityKey6ValueId)
	{
		this.writeProperty("entityKey6ValueId", entityKey6ValueId);
	}

	public String getEntityKey6ValueId()
	{
		return (String) this.readProperty("entityKey6ValueId");
	}

	public void setExternalKey1(final String externalKey1)
	{
		this.writeProperty("externalKey1", externalKey1);
	}

	public String getExternalKey1()
	{
		return (String) this.readProperty("externalKey1");
	}

	public void setExternalKey2(final String externalKey2)
	{
		this.writeProperty("externalKey2", externalKey2);
	}

	public String getExternalKey2()
	{
		return (String) this.readProperty("externalKey2");
	}

	public void setExternalKey3(final String externalKey3)
	{
		this.writeProperty("externalKey3", externalKey3);
	}

	public String getExternalKey3()
	{
		return (String) this.readProperty("externalKey3");
	}

	public void setTransId(final Integer transId)
	{
		this.writeProperty("transId", transId);
	}

	public Integer getTransId()
	{
		return (Integer) this.readProperty("transId");
	}

	public void setAliasSource(final AliasSource aliasSource)
	{
		this.setToOneTarget("aliasSource", aliasSource, true);
	}

	public AliasSource getAliasSource()
	{
		return (AliasSource) this.readProperty("aliasSource");
	}

	public void setEntity(final IctsEntityName entity)
	{
		this.setToOneTarget("entity", entity, true);
	}

	public IctsEntityName getEntity()
	{
		return (IctsEntityName) this.readProperty("entity");
	}

}
