package com.tc.app.exchangemonitor.model.cayenne.persistent.auto;

import org.apache.cayenne.CayenneDataObject;
import org.apache.cayenne.exp.Property;

/**
 * Class _AudCostRelativePrice was generated by Cayenne.
 * It is probably a good idea to avoid changing this class manually,
 * since it may be overwritten next time code is regenerated.
 * If you need to make any customizations, please use subclass.
 */
public abstract class _AudCostRelativePrice extends CayenneDataObject
{

	private static final long serialVersionUID = 1L;

	public static final Property<Integer> COST_NUM = new Property<Integer>("costNum");
	public static final Property<Double> PERCENT_RATE_VALUE = new Property<Double>("percentRateValue");
	public static final Property<String> REFERENCE = new Property<String>("reference");
	public static final Property<String> RELATIVE_COST_CODE = new Property<String>("relativeCostCode");
	public static final Property<Integer> RESP_TRANS_ID = new Property<Integer>("respTransId");
	public static final Property<Short> SEQ_NUM = new Property<Short>("seqNum");
	public static final Property<Integer> TRANS_ID = new Property<Integer>("transId");

	public void setCostNum(Integer costNum)
	{
		writeProperty("costNum", costNum);
	}

	public Integer getCostNum()
	{
		return (Integer) readProperty("costNum");
	}

	public void setPercentRateValue(Double percentRateValue)
	{
		writeProperty("percentRateValue", percentRateValue);
	}

	public Double getPercentRateValue()
	{
		return (Double) readProperty("percentRateValue");
	}

	public void setReference(String reference)
	{
		writeProperty("reference", reference);
	}

	public String getReference()
	{
		return (String) readProperty("reference");
	}

	public void setRelativeCostCode(String relativeCostCode)
	{
		writeProperty("relativeCostCode", relativeCostCode);
	}

	public String getRelativeCostCode()
	{
		return (String) readProperty("relativeCostCode");
	}

	public void setRespTransId(Integer respTransId)
	{
		writeProperty("respTransId", respTransId);
	}

	public Integer getRespTransId()
	{
		return (Integer) readProperty("respTransId");
	}

	public void setSeqNum(Short seqNum)
	{
		writeProperty("seqNum", seqNum);
	}

	public Short getSeqNum()
	{
		return (Short) readProperty("seqNum");
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