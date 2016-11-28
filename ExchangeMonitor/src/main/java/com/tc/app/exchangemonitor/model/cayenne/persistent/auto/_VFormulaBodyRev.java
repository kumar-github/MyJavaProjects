package com.tc.app.exchangemonitor.model.cayenne.persistent.auto;

import java.util.Date;

import org.apache.cayenne.CayenneDataObject;
import org.apache.cayenne.exp.Property;

/**
 * Class _VFormulaBodyRev was generated by Cayenne.
 * It is probably a good idea to avoid changing this class manually,
 * since it may be overwritten next time code is regenerated.
 * If you need to make any customizations, please use subclass.
 */
public abstract class _VFormulaBodyRev extends CayenneDataObject
{

	private static final long serialVersionUID = 1L;

	public static final Property<Integer> ASOF_TRANS_ID = new Property<Integer>("asofTransId");
	public static final Property<Date> AVG_PRICE_END_DATE = new Property<Date>("avgPriceEndDate");
	public static final Property<Date> AVG_PRICE_START_DATE = new Property<Date>("avgPriceStartDate");
	public static final Property<String> CHAR_VALUE = new Property<String>("charValue");
	public static final Property<String> COMPLEXITY_IND = new Property<String>("complexityInd");
	public static final Property<Double> DIFFERENTIAL_VAL = new Property<Double>("differentialVal");
	public static final Property<Short> FB_TRIGGER_NUM = new Property<Short>("fbTriggerNum");
	public static final Property<Double> FLOAT_VALUE = new Property<Double>("floatValue");
	public static final Property<Short> FORMULA_BODY_NUM = new Property<Short>("formulaBodyNum");
	public static final Property<String> FORMULA_BODY_STRING = new Property<String>("formulaBodyString");
	public static final Property<String> FORMULA_BODY_TEXT = new Property<String>("formulaBodyText");
	public static final Property<String> FORMULA_BODY_TYPE = new Property<String>("formulaBodyType");
	public static final Property<Integer> FORMULA_NUM = new Property<Integer>("formulaNum");
	public static final Property<String> FORMULA_PARSE_STRING = new Property<String>("formulaParseString");
	public static final Property<String> FORMULA_PARSE_TEXT = new Property<String>("formulaParseText");
	public static final Property<Double> FORMULA_QTY_PCNT_VAL = new Property<Double>("formulaQtyPcntVal");
	public static final Property<String> FORMULA_QTY_UOM_CODE = new Property<String>("formulaQtyUomCode");
	public static final Property<String> HOLIDAY_PRICING_RULE = new Property<String>("holidayPricingRule");
	public static final Property<Integer> PARENT_FB_NUM = new Property<Integer>("parentFbNum");
	public static final Property<String> RANGE_TYPE = new Property<String>("rangeType");
	public static final Property<Integer> RESP_TRANS_ID = new Property<Integer>("respTransId");
	public static final Property<String> SATURDAY_PRICING_RULE = new Property<String>("saturdayPricingRule");
	public static final Property<String> SUNDAY_PRICING_RULE = new Property<String>("sundayPricingRule");
	public static final Property<Integer> TRANS_ID = new Property<Integer>("transId");

	public void setAsofTransId(Integer asofTransId)
	{
		writeProperty("asofTransId", asofTransId);
	}

	public Integer getAsofTransId()
	{
		return (Integer) readProperty("asofTransId");
	}

	public void setAvgPriceEndDate(Date avgPriceEndDate)
	{
		writeProperty("avgPriceEndDate", avgPriceEndDate);
	}

	public Date getAvgPriceEndDate()
	{
		return (Date) readProperty("avgPriceEndDate");
	}

	public void setAvgPriceStartDate(Date avgPriceStartDate)
	{
		writeProperty("avgPriceStartDate", avgPriceStartDate);
	}

	public Date getAvgPriceStartDate()
	{
		return (Date) readProperty("avgPriceStartDate");
	}

	public void setCharValue(String charValue)
	{
		writeProperty("charValue", charValue);
	}

	public String getCharValue()
	{
		return (String) readProperty("charValue");
	}

	public void setComplexityInd(String complexityInd)
	{
		writeProperty("complexityInd", complexityInd);
	}

	public String getComplexityInd()
	{
		return (String) readProperty("complexityInd");
	}

	public void setDifferentialVal(Double differentialVal)
	{
		writeProperty("differentialVal", differentialVal);
	}

	public Double getDifferentialVal()
	{
		return (Double) readProperty("differentialVal");
	}

	public void setFbTriggerNum(Short fbTriggerNum)
	{
		writeProperty("fbTriggerNum", fbTriggerNum);
	}

	public Short getFbTriggerNum()
	{
		return (Short) readProperty("fbTriggerNum");
	}

	public void setFloatValue(Double floatValue)
	{
		writeProperty("floatValue", floatValue);
	}

	public Double getFloatValue()
	{
		return (Double) readProperty("floatValue");
	}

	public void setFormulaBodyNum(Short formulaBodyNum)
	{
		writeProperty("formulaBodyNum", formulaBodyNum);
	}

	public Short getFormulaBodyNum()
	{
		return (Short) readProperty("formulaBodyNum");
	}

	public void setFormulaBodyString(String formulaBodyString)
	{
		writeProperty("formulaBodyString", formulaBodyString);
	}

	public String getFormulaBodyString()
	{
		return (String) readProperty("formulaBodyString");
	}

	public void setFormulaBodyText(String formulaBodyText)
	{
		writeProperty("formulaBodyText", formulaBodyText);
	}

	public String getFormulaBodyText()
	{
		return (String) readProperty("formulaBodyText");
	}

	public void setFormulaBodyType(String formulaBodyType)
	{
		writeProperty("formulaBodyType", formulaBodyType);
	}

	public String getFormulaBodyType()
	{
		return (String) readProperty("formulaBodyType");
	}

	public void setFormulaNum(Integer formulaNum)
	{
		writeProperty("formulaNum", formulaNum);
	}

	public Integer getFormulaNum()
	{
		return (Integer) readProperty("formulaNum");
	}

	public void setFormulaParseString(String formulaParseString)
	{
		writeProperty("formulaParseString", formulaParseString);
	}

	public String getFormulaParseString()
	{
		return (String) readProperty("formulaParseString");
	}

	public void setFormulaParseText(String formulaParseText)
	{
		writeProperty("formulaParseText", formulaParseText);
	}

	public String getFormulaParseText()
	{
		return (String) readProperty("formulaParseText");
	}

	public void setFormulaQtyPcntVal(Double formulaQtyPcntVal)
	{
		writeProperty("formulaQtyPcntVal", formulaQtyPcntVal);
	}

	public Double getFormulaQtyPcntVal()
	{
		return (Double) readProperty("formulaQtyPcntVal");
	}

	public void setFormulaQtyUomCode(String formulaQtyUomCode)
	{
		writeProperty("formulaQtyUomCode", formulaQtyUomCode);
	}

	public String getFormulaQtyUomCode()
	{
		return (String) readProperty("formulaQtyUomCode");
	}

	public void setHolidayPricingRule(String holidayPricingRule)
	{
		writeProperty("holidayPricingRule", holidayPricingRule);
	}

	public String getHolidayPricingRule()
	{
		return (String) readProperty("holidayPricingRule");
	}

	public void setParentFbNum(Integer parentFbNum)
	{
		writeProperty("parentFbNum", parentFbNum);
	}

	public Integer getParentFbNum()
	{
		return (Integer) readProperty("parentFbNum");
	}

	public void setRangeType(String rangeType)
	{
		writeProperty("rangeType", rangeType);
	}

	public String getRangeType()
	{
		return (String) readProperty("rangeType");
	}

	public void setRespTransId(Integer respTransId)
	{
		writeProperty("respTransId", respTransId);
	}

	public Integer getRespTransId()
	{
		return (Integer) readProperty("respTransId");
	}

	public void setSaturdayPricingRule(String saturdayPricingRule)
	{
		writeProperty("saturdayPricingRule", saturdayPricingRule);
	}

	public String getSaturdayPricingRule()
	{
		return (String) readProperty("saturdayPricingRule");
	}

	public void setSundayPricingRule(String sundayPricingRule)
	{
		writeProperty("sundayPricingRule", sundayPricingRule);
	}

	public String getSundayPricingRule()
	{
		return (String) readProperty("sundayPricingRule");
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