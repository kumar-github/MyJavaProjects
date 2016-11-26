package com.tc.app.exchangemonitor.model.cayenne.persistent.auto;

import org.apache.cayenne.CayenneDataObject;
import org.apache.cayenne.exp.Property;

/**
 * Class _AudExtRefdataMapping was generated by Cayenne.
 * It is probably a good idea to avoid changing this class manually,
 * since it may be overwritten next time code is regenerated.
 * If you need to make any customizations, please use subclass.
 */
public abstract class _AudExtRefdataMapping extends CayenneDataObject
{

	private static final long serialVersionUID = 1L;

	public static final Property<String> ALIAS_SOURCE_CODE = new Property<String>("aliasSourceCode");
	public static final Property<Integer> ENTITY_ID = new Property<Integer>("entityId");
	public static final Property<Integer> ENTITY_KEY1VALUE_ID = new Property<Integer>("entityKey1ValueId");
	public static final Property<Integer> ENTITY_KEY2VALUE_ID = new Property<Integer>("entityKey2ValueId");
	public static final Property<Integer> ENTITY_KEY3VALUE_ID = new Property<Integer>("entityKey3ValueId");
	public static final Property<Integer> ENTITY_KEY4VALUE_ID = new Property<Integer>("entityKey4ValueId");
	public static final Property<Integer> ENTITY_KEY5VALUE_ID = new Property<Integer>("entityKey5ValueId");
	public static final Property<Integer> ENTITY_KEY6VALUE_ID = new Property<Integer>("entityKey6ValueId");
	public static final Property<String> EXTERNAL_KEY1 = new Property<String>("externalKey1");
	public static final Property<String> EXTERNAL_KEY2 = new Property<String>("externalKey2");
	public static final Property<String> EXTERNAL_KEY3 = new Property<String>("externalKey3");
	public static final Property<Integer> OID = new Property<Integer>("oid");
	public static final Property<Integer> RESP_TRANS_ID = new Property<Integer>("respTransId");
	public static final Property<Integer> TRANS_ID = new Property<Integer>("transId");

	public void setAliasSourceCode(String aliasSourceCode)
	{
		writeProperty("aliasSourceCode", aliasSourceCode);
	}

	public String getAliasSourceCode()
	{
		return (String) readProperty("aliasSourceCode");
	}

	public void setEntityId(Integer entityId)
	{
		writeProperty("entityId", entityId);
	}

	public Integer getEntityId()
	{
		return (Integer) readProperty("entityId");
	}

	public void setEntityKey1ValueId(Integer entityKey1ValueId)
	{
		writeProperty("entityKey1ValueId", entityKey1ValueId);
	}

	public Integer getEntityKey1ValueId()
	{
		return (Integer) readProperty("entityKey1ValueId");
	}

	public void setEntityKey2ValueId(Integer entityKey2ValueId)
	{
		writeProperty("entityKey2ValueId", entityKey2ValueId);
	}

	public Integer getEntityKey2ValueId()
	{
		return (Integer) readProperty("entityKey2ValueId");
	}

	public void setEntityKey3ValueId(Integer entityKey3ValueId)
	{
		writeProperty("entityKey3ValueId", entityKey3ValueId);
	}

	public Integer getEntityKey3ValueId()
	{
		return (Integer) readProperty("entityKey3ValueId");
	}

	public void setEntityKey4ValueId(Integer entityKey4ValueId)
	{
		writeProperty("entityKey4ValueId", entityKey4ValueId);
	}

	public Integer getEntityKey4ValueId()
	{
		return (Integer) readProperty("entityKey4ValueId");
	}

	public void setEntityKey5ValueId(Integer entityKey5ValueId)
	{
		writeProperty("entityKey5ValueId", entityKey5ValueId);
	}

	public Integer getEntityKey5ValueId()
	{
		return (Integer) readProperty("entityKey5ValueId");
	}

	public void setEntityKey6ValueId(Integer entityKey6ValueId)
	{
		writeProperty("entityKey6ValueId", entityKey6ValueId);
	}

	public Integer getEntityKey6ValueId()
	{
		return (Integer) readProperty("entityKey6ValueId");
	}

	public void setExternalKey1(String externalKey1)
	{
		writeProperty("externalKey1", externalKey1);
	}

	public String getExternalKey1()
	{
		return (String) readProperty("externalKey1");
	}

	public void setExternalKey2(String externalKey2)
	{
		writeProperty("externalKey2", externalKey2);
	}

	public String getExternalKey2()
	{
		return (String) readProperty("externalKey2");
	}

	public void setExternalKey3(String externalKey3)
	{
		writeProperty("externalKey3", externalKey3);
	}

	public String getExternalKey3()
	{
		return (String) readProperty("externalKey3");
	}

	public void setOid(Integer oid)
	{
		writeProperty("oid", oid);
	}

	public Integer getOid()
	{
		return (Integer) readProperty("oid");
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
