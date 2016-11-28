package com.tc.app.exchangemonitor.model.cayenne.persistent.auto;

import org.apache.cayenne.CayenneDataObject;
import org.apache.cayenne.exp.Property;

import com.tc.app.exchangemonitor.model.cayenne.persistent.Contexts;
import com.tc.app.exchangemonitor.model.cayenne.persistent.MeasureTypes;

/**
 * Class _MeasureDefaults was generated by Cayenne.
 * It is probably a good idea to avoid changing this class manually,
 * since it may be overwritten next time code is regenerated.
 * If you need to make any customizations, please use subclass.
 */
public abstract class _MeasureDefaults extends CayenneDataObject
{

	private static final long serialVersionUID = 1L;

	public static final String FLDCHR_CONTEXT_ID_PK_COLUMN = "fldchrContextId";
	public static final String FLDCHR_MEAS_ID_PK_COLUMN = "fldchrMeasId";
	public static final String FLDCHR_MEAS_TYPE_FLAG_PK_COLUMN = "fldchrMeasTypeFlag";
	public static final String FLDCHR_MEAS_UMCODE_PK_COLUMN = "fldchrMeasUMCode";

	public static final Property<String> FLDCHR_REC_ID = new Property<String>("fldchrRecId");
	public static final Property<String> FLDCHR_TEMP_UMCODE = new Property<String>("fldchrTempUMCode");
	public static final Property<Short> FLDSMI_MEAS_CONTEXT_SORT_ORDER = new Property<Short>("fldsmiMeasContextSortOrder");
	public static final Property<Short> FLDSMI_MEAS_DECIMAL_DIGITS = new Property<Short>("fldsmiMeasDecimalDigits");
	public static final Property<Short> FLDSMI_MEAS_INTEGER_DIGITS = new Property<Short>("fldsmiMeasIntegerDigits");
	public static final Property<Integer> TRANS_ID = new Property<Integer>("transId");
	public static final Property<Contexts> FLDCHR_CONTEXT = new Property<Contexts>("fldchrContext");
	public static final Property<MeasureTypes> FLDCHR_MEAS = new Property<MeasureTypes>("fldchrMeas");

	public void setFldchrRecId(String fldchrRecId)
	{
		writeProperty("fldchrRecId", fldchrRecId);
	}

	public String getFldchrRecId()
	{
		return (String) readProperty("fldchrRecId");
	}

	public void setFldchrTempUMCode(String fldchrTempUMCode)
	{
		writeProperty("fldchrTempUMCode", fldchrTempUMCode);
	}

	public String getFldchrTempUMCode()
	{
		return (String) readProperty("fldchrTempUMCode");
	}

	public void setFldsmiMeasContextSortOrder(Short fldsmiMeasContextSortOrder)
	{
		writeProperty("fldsmiMeasContextSortOrder", fldsmiMeasContextSortOrder);
	}

	public Short getFldsmiMeasContextSortOrder()
	{
		return (Short) readProperty("fldsmiMeasContextSortOrder");
	}

	public void setFldsmiMeasDecimalDigits(Short fldsmiMeasDecimalDigits)
	{
		writeProperty("fldsmiMeasDecimalDigits", fldsmiMeasDecimalDigits);
	}

	public Short getFldsmiMeasDecimalDigits()
	{
		return (Short) readProperty("fldsmiMeasDecimalDigits");
	}

	public void setFldsmiMeasIntegerDigits(Short fldsmiMeasIntegerDigits)
	{
		writeProperty("fldsmiMeasIntegerDigits", fldsmiMeasIntegerDigits);
	}

	public Short getFldsmiMeasIntegerDigits()
	{
		return (Short) readProperty("fldsmiMeasIntegerDigits");
	}

	public void setTransId(Integer transId)
	{
		writeProperty("transId", transId);
	}

	public Integer getTransId()
	{
		return (Integer) readProperty("transId");
	}

	public void setFldchrContext(Contexts fldchrContext)
	{
		setToOneTarget("fldchrContext", fldchrContext, true);
	}

	public Contexts getFldchrContext()
	{
		return (Contexts) readProperty("fldchrContext");
	}

	public void setFldchrMeas(MeasureTypes fldchrMeas)
	{
		setToOneTarget("fldchrMeas", fldchrMeas, true);
	}

	public MeasureTypes getFldchrMeas()
	{
		return (MeasureTypes) readProperty("fldchrMeas");
	}

}