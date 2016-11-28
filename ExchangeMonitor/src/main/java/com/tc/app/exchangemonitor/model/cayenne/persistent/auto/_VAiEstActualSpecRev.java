package com.tc.app.exchangemonitor.model.cayenne.persistent.auto;

import org.apache.cayenne.CayenneDataObject;
import org.apache.cayenne.exp.Property;

/**
 * Class _VAiEstActualSpecRev was generated by Cayenne.
 * It is probably a good idea to avoid changing this class manually,
 * since it may be overwritten next time code is regenerated.
 * If you need to make any customizations, please use subclass.
 */
public abstract class _VAiEstActualSpecRev extends CayenneDataObject
{

	private static final long serialVersionUID = 1L;

	public static final Property<String> ACTUAL_SPEC_OPT_VAL = new Property<String>("actualSpecOptVal");
	public static final Property<Short> AI_EST_ACTUAL_NUM = new Property<Short>("aiEstActualNum");
	public static final Property<Short> ALLOC_ITEM_NUM = new Property<Short>("allocItemNum");
	public static final Property<Integer> ALLOC_NUM = new Property<Integer>("allocNum");
	public static final Property<Integer> ASOF_TRANS_ID = new Property<Integer>("asofTransId");
	public static final Property<String> PROVISIONAL_SPEC_OPT_VAL = new Property<String>("provisionalSpecOptVal");
	public static final Property<String> PROVISIONAL_TEXT_VAL = new Property<String>("provisionalTextVal");
	public static final Property<Integer> RESP_TRANS_ID = new Property<Integer>("respTransId");
	public static final Property<Double> SPEC_ACTUAL_VALUE = new Property<Double>("specActualValue");
	public static final Property<String> SPEC_ACTUAL_VALUE_TEXT = new Property<String>("specActualValueText");
	public static final Property<String> SPEC_CODE = new Property<String>("specCode");
	public static final Property<Double> SPEC_PROVISIONAL_VAL = new Property<Double>("specProvisionalVal");
	public static final Property<Integer> TRANS_ID = new Property<Integer>("transId");

	public void setActualSpecOptVal(String actualSpecOptVal)
	{
		writeProperty("actualSpecOptVal", actualSpecOptVal);
	}

	public String getActualSpecOptVal()
	{
		return (String) readProperty("actualSpecOptVal");
	}

	public void setAiEstActualNum(Short aiEstActualNum)
	{
		writeProperty("aiEstActualNum", aiEstActualNum);
	}

	public Short getAiEstActualNum()
	{
		return (Short) readProperty("aiEstActualNum");
	}

	public void setAllocItemNum(Short allocItemNum)
	{
		writeProperty("allocItemNum", allocItemNum);
	}

	public Short getAllocItemNum()
	{
		return (Short) readProperty("allocItemNum");
	}

	public void setAllocNum(Integer allocNum)
	{
		writeProperty("allocNum", allocNum);
	}

	public Integer getAllocNum()
	{
		return (Integer) readProperty("allocNum");
	}

	public void setAsofTransId(Integer asofTransId)
	{
		writeProperty("asofTransId", asofTransId);
	}

	public Integer getAsofTransId()
	{
		return (Integer) readProperty("asofTransId");
	}

	public void setProvisionalSpecOptVal(String provisionalSpecOptVal)
	{
		writeProperty("provisionalSpecOptVal", provisionalSpecOptVal);
	}

	public String getProvisionalSpecOptVal()
	{
		return (String) readProperty("provisionalSpecOptVal");
	}

	public void setProvisionalTextVal(String provisionalTextVal)
	{
		writeProperty("provisionalTextVal", provisionalTextVal);
	}

	public String getProvisionalTextVal()
	{
		return (String) readProperty("provisionalTextVal");
	}

	public void setRespTransId(Integer respTransId)
	{
		writeProperty("respTransId", respTransId);
	}

	public Integer getRespTransId()
	{
		return (Integer) readProperty("respTransId");
	}

	public void setSpecActualValue(Double specActualValue)
	{
		writeProperty("specActualValue", specActualValue);
	}

	public Double getSpecActualValue()
	{
		return (Double) readProperty("specActualValue");
	}

	public void setSpecActualValueText(String specActualValueText)
	{
		writeProperty("specActualValueText", specActualValueText);
	}

	public String getSpecActualValueText()
	{
		return (String) readProperty("specActualValueText");
	}

	public void setSpecCode(String specCode)
	{
		writeProperty("specCode", specCode);
	}

	public String getSpecCode()
	{
		return (String) readProperty("specCode");
	}

	public void setSpecProvisionalVal(Double specProvisionalVal)
	{
		writeProperty("specProvisionalVal", specProvisionalVal);
	}

	public Double getSpecProvisionalVal()
	{
		return (Double) readProperty("specProvisionalVal");
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