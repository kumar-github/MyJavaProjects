package com.tc.app.exchangemonitor.model.cayenne.persistent.auto;

import java.math.BigDecimal;

import org.apache.cayenne.CayenneDataObject;
import org.apache.cayenne.exp.Property;

/**
 * Class _Server was generated by Cayenne.
 * It is probably a good idea to avoid changing this class manually,
 * since it may be overwritten next time code is regenerated.
 * If you need to make any customizations, please use subclass.
 */
public abstract class _Server extends CayenneDataObject
{

	private static final long serialVersionUID = 1L;

	public static final String NAME_PK_COLUMN = "name";

	public static final Property<BigDecimal> LAST_SEQUENCE = new Property<BigDecimal>("lastSequence");
	public static final Property<String> TYPE = new Property<String>("type");

	public void setLastSequence(BigDecimal lastSequence)
	{
		writeProperty("lastSequence", lastSequence);
	}

	public BigDecimal getLastSequence()
	{
		return (BigDecimal) readProperty("lastSequence");
	}

	public void setType(String type)
	{
		writeProperty("type", type);
	}

	public String getType()
	{
		return (String) readProperty("type");
	}

}