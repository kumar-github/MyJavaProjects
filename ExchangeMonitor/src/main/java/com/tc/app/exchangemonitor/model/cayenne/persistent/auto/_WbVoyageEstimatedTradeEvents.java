package com.tc.app.exchangemonitor.model.cayenne.persistent.auto;

import java.util.Date;

import org.apache.cayenne.CayenneDataObject;
import org.apache.cayenne.exp.Property;

/**
 * Class _WbVoyageEstimatedTradeEvents was generated by Cayenne.
 * It is probably a good idea to avoid changing this class manually,
 * since it may be overwritten next time code is regenerated.
 * If you need to make any customizations, please use subclass.
 */
public abstract class _WbVoyageEstimatedTradeEvents extends CayenneDataObject
{

	private static final long serialVersionUID = 1L;

	public static final String FLD_INT_EVENT_PK_COLUMN = "fldIntEvent";
	public static final String FLDCHR_ESTIMATED_PORT_KEY_PK_COLUMN = "fldchrEstimatedPortKey";

	public static final Property<Date> FLDSDT_DATE = new Property<Date>("fldsdtDate");

	public void setFldsdtDate(Date fldsdtDate)
	{
		writeProperty("fldsdtDate", fldsdtDate);
	}

	public Date getFldsdtDate()
	{
		return (Date) readProperty("fldsdtDate");
	}

}
