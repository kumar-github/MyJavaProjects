package com.tc.app.exchangemonitor.model.cayenne.persistent.auto;

import org.apache.cayenne.CayenneDataObject;
import org.apache.cayenne.exp.Property;

/**
 * Class _ViewVoyageStartEndPort was generated by Cayenne.
 * It is probably a good idea to avoid changing this class manually,
 * since it may be overwritten next time code is regenerated.
 * If you need to make any customizations, please use subclass.
 */
public abstract class _ViewVoyageStartEndPort extends CayenneDataObject
{

	private static final long serialVersionUID = 1L;

	public static final Property<String> END_PORT = new Property<String>("endPort");
	public static final Property<String> FLDCHR_CONTR_KEY = new Property<String>("fldchrContrKey");
	public static final Property<String> START_PORT = new Property<String>("startPort");

	public void setEndPort(String endPort)
	{
		writeProperty("endPort", endPort);
	}

	public String getEndPort()
	{
		return (String) readProperty("endPort");
	}

	public void setFldchrContrKey(String fldchrContrKey)
	{
		writeProperty("fldchrContrKey", fldchrContrKey);
	}

	public String getFldchrContrKey()
	{
		return (String) readProperty("fldchrContrKey");
	}

	public void setStartPort(String startPort)
	{
		writeProperty("startPort", startPort);
	}

	public String getStartPort()
	{
		return (String) readProperty("startPort");
	}

}
