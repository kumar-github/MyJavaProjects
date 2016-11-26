package com.tc.app.exchangemonitor.model.cayenne.persistent.auto;

import org.apache.cayenne.CayenneDataObject;
import org.apache.cayenne.exp.Property;

/**
 * Class _LocationTimeLimits was generated by Cayenne.
 * It is probably a good idea to avoid changing this class manually,
 * since it may be overwritten next time code is regenerated.
 * If you need to make any customizations, please use subclass.
 */
public abstract class _LocationTimeLimits extends CayenneDataObject
{

	private static final long serialVersionUID = 1L;

	public static final String FLDCHR_LOCT_KEY_PK_COLUMN = "fldchrLoctKey";
	public static final String FLDCHR_MONTH_PK_COLUMN = "fldchrMonth";
	public static final String FLDCHR_OP_FLAG_PK_COLUMN = "fldchrOpFlag";

	public static final Property<String> FLDCHR_REC_ID = new Property<String>("fldchrRecId");
	public static final Property<Short> FLDSMI_HI_LIMIT_HOURS = new Property<Short>("fldsmiHiLimitHours");
	public static final Property<Short> FLDSMI_HI_LIMIT_MINUTES = new Property<Short>("fldsmiHiLimitMinutes");
	public static final Property<Short> FLDSMI_LO_LIMIT_HOURS = new Property<Short>("fldsmiLoLimitHours");
	public static final Property<Short> FLDSMI_LO_LIMIT_MINUTES = new Property<Short>("fldsmiLoLimitMinutes");
	public static final Property<Integer> TRANS_ID = new Property<Integer>("transId");

	public void setFldchrRecId(String fldchrRecId)
	{
		writeProperty("fldchrRecId", fldchrRecId);
	}

	public String getFldchrRecId()
	{
		return (String) readProperty("fldchrRecId");
	}

	public void setFldsmiHiLimitHours(Short fldsmiHiLimitHours)
	{
		writeProperty("fldsmiHiLimitHours", fldsmiHiLimitHours);
	}

	public Short getFldsmiHiLimitHours()
	{
		return (Short) readProperty("fldsmiHiLimitHours");
	}

	public void setFldsmiHiLimitMinutes(Short fldsmiHiLimitMinutes)
	{
		writeProperty("fldsmiHiLimitMinutes", fldsmiHiLimitMinutes);
	}

	public Short getFldsmiHiLimitMinutes()
	{
		return (Short) readProperty("fldsmiHiLimitMinutes");
	}

	public void setFldsmiLoLimitHours(Short fldsmiLoLimitHours)
	{
		writeProperty("fldsmiLoLimitHours", fldsmiLoLimitHours);
	}

	public Short getFldsmiLoLimitHours()
	{
		return (Short) readProperty("fldsmiLoLimitHours");
	}

	public void setFldsmiLoLimitMinutes(Short fldsmiLoLimitMinutes)
	{
		writeProperty("fldsmiLoLimitMinutes", fldsmiLoLimitMinutes);
	}

	public Short getFldsmiLoLimitMinutes()
	{
		return (Short) readProperty("fldsmiLoLimitMinutes");
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
