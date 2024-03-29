package com.tc.app.exchangemonitor.model.cayenne.persistent.auto;

import org.apache.cayenne.CayenneDataObject;
import org.apache.cayenne.exp.Property;

/**
 * Class _JmsLegalEntity was generated by Cayenne.
 * It is probably a good idea to avoid changing this class manually,
 * since it may be overwritten next time code is regenerated.
 * If you need to make any customizations, please use subclass.
 */
public abstract class _JmsLegalEntity extends CayenneDataObject
{

	private static final long serialVersionUID = 1L;

	public static final Property<String> LEGAL_ENTITY_CODE = new Property<String>("legalEntityCode");
	public static final Property<String> LEGAL_ENTITY_NAME = new Property<String>("legalEntityName");
	public static final Property<Integer> TRANS_ID = new Property<Integer>("transId");

	public void setLegalEntityCode(String legalEntityCode)
	{
		writeProperty("legalEntityCode", legalEntityCode);
	}

	public String getLegalEntityCode()
	{
		return (String) readProperty("legalEntityCode");
	}

	public void setLegalEntityName(String legalEntityName)
	{
		writeProperty("legalEntityName", legalEntityName);
	}

	public String getLegalEntityName()
	{
		return (String) readProperty("legalEntityName");
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
