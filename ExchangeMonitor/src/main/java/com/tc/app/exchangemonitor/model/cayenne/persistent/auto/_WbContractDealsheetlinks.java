package com.tc.app.exchangemonitor.model.cayenne.persistent.auto;

import org.apache.cayenne.CayenneDataObject;
import org.apache.cayenne.exp.Property;

/**
 * Class _WbContractDealsheetlinks was generated by Cayenne.
 * It is probably a good idea to avoid changing this class manually,
 * since it may be overwritten next time code is regenerated.
 * If you need to make any customizations, please use subclass.
 */
public abstract class _WbContractDealsheetlinks extends CayenneDataObject
{

	private static final long serialVersionUID = 1L;

	public static final Property<String> FLDCHR_CONTR_KEY = new Property<String>("fldchrContrKey");
	public static final Property<String> FLDCHR_ENTITY_ALIAS = new Property<String>("fldchrEntityAlias");
	public static final Property<String> FLDCHR_LOT_KEY = new Property<String>("fldchrLotKey");
	public static final Property<String> FLDCHR_REC_ID = new Property<String>("fldchrRecId");
	public static final Property<String> FLDCHR_REC_ID_ENTITY_ALIAS = new Property<String>("fldchrRecIdEntityAlias");

	public void setFldchrContrKey(String fldchrContrKey)
	{
		writeProperty("fldchrContrKey", fldchrContrKey);
	}

	public String getFldchrContrKey()
	{
		return (String) readProperty("fldchrContrKey");
	}

	public void setFldchrEntityAlias(String fldchrEntityAlias)
	{
		writeProperty("fldchrEntityAlias", fldchrEntityAlias);
	}

	public String getFldchrEntityAlias()
	{
		return (String) readProperty("fldchrEntityAlias");
	}

	public void setFldchrLotKey(String fldchrLotKey)
	{
		writeProperty("fldchrLotKey", fldchrLotKey);
	}

	public String getFldchrLotKey()
	{
		return (String) readProperty("fldchrLotKey");
	}

	public void setFldchrRecId(String fldchrRecId)
	{
		writeProperty("fldchrRecId", fldchrRecId);
	}

	public String getFldchrRecId()
	{
		return (String) readProperty("fldchrRecId");
	}

	public void setFldchrRecIdEntityAlias(String fldchrRecIdEntityAlias)
	{
		writeProperty("fldchrRecIdEntityAlias", fldchrRecIdEntityAlias);
	}

	public String getFldchrRecIdEntityAlias()
	{
		return (String) readProperty("fldchrRecIdEntityAlias");
	}

}
