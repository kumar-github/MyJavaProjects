package com.tc.app.exchangemonitor.model.cayenne.persistent.auto;

import org.apache.cayenne.CayenneDataObject;
import org.apache.cayenne.exp.Property;

/**
 * Class _VCubeTradekey was generated by Cayenne.
 * It is probably a good idea to avoid changing this class manually,
 * since it may be overwritten next time code is regenerated.
 * If you need to make any customizations, please use subclass.
 */
public abstract class _VCubeTradekey extends CayenneDataObject
{

	private static final long serialVersionUID = 1L;

	public static final Property<String> TRADE_KEY = new Property<String>("tradeKey");

	public void setTradeKey(String tradeKey)
	{
		writeProperty("tradeKey", tradeKey);
	}

	public String getTradeKey()
	{
		return (String) readProperty("tradeKey");
	}

}
