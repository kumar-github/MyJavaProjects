package com.tc.app.exchangemonitor.model.cayenne.persistent.auto;

import java.math.BigDecimal;

import org.apache.cayenne.CayenneDataObject;
import org.apache.cayenne.exp.Property;

/**
 * Class _VFormulaComponentRev was generated by Cayenne.
 * It is probably a good idea to avoid changing this class manually,
 * since it may be overwritten next time code is regenerated.
 * If you need to make any customizations, please use subclass.
 */
public abstract class _VFormulaComponentRev extends CayenneDataObject
{

	private static final long serialVersionUID = 1L;

	public static final Property<Integer> ASOF_TRANS_ID = new Property<Integer>("asofTransId");
	public static final Property<Integer> COMMKT_KEY = new Property<Integer>("commktKey");
	public static final Property<Short> FORMULA_BODY_NUM = new Property<Short>("formulaBodyNum");
	public static final Property<String> FORMULA_COMP_CMNT = new Property<String>("formulaCompCmnt");
	public static final Property<String> FORMULA_COMP_CURR_CODE = new Property<String>("formulaCompCurrCode");
	public static final Property<String> FORMULA_COMP_LABEL = new Property<String>("formulaCompLabel");
	public static final Property<String> FORMULA_COMP_NAME = new Property<String>("formulaCompName");
	public static final Property<Short> FORMULA_COMP_NUM = new Property<Short>("formulaCompNum");
	public static final Property<Short> FORMULA_COMP_POS_NUM = new Property<Short>("formulaCompPosNum");
	public static final Property<Integer> FORMULA_COMP_REF = new Property<Integer>("formulaCompRef");
	public static final Property<String> FORMULA_COMP_TYPE = new Property<String>("formulaCompType");
	public static final Property<String> FORMULA_COMP_UOM_CODE = new Property<String>("formulaCompUomCode");
	public static final Property<Double> FORMULA_COMP_VAL = new Property<Double>("formulaCompVal");
	public static final Property<String> FORMULA_COMP_VAL_TYPE = new Property<String>("formulaCompValType");
	public static final Property<Integer> FORMULA_NUM = new Property<Integer>("formulaNum");
	public static final Property<String> IS_TYPE_WEIGHT_IND = new Property<String>("isTypeWeightInd");
	public static final Property<Double> LINEAR_FACTOR = new Property<Double>("linearFactor");
	public static final Property<String> PER_UOM_CODE = new Property<String>("perUomCode");
	public static final Property<String> PRICE_SOURCE_CODE = new Property<String>("priceSourceCode");
	public static final Property<Integer> RESP_TRANS_ID = new Property<Integer>("respTransId");
	public static final Property<String> TRADING_PRD = new Property<String>("tradingPrd");
	public static final Property<Integer> TRANS_ID = new Property<Integer>("transId");
	public static final Property<BigDecimal> UOM_RATIO_FACTOR = new Property<BigDecimal>("uomRatioFactor");

	public void setAsofTransId(Integer asofTransId)
	{
		writeProperty("asofTransId", asofTransId);
	}

	public Integer getAsofTransId()
	{
		return (Integer) readProperty("asofTransId");
	}

	public void setCommktKey(Integer commktKey)
	{
		writeProperty("commktKey", commktKey);
	}

	public Integer getCommktKey()
	{
		return (Integer) readProperty("commktKey");
	}

	public void setFormulaBodyNum(Short formulaBodyNum)
	{
		writeProperty("formulaBodyNum", formulaBodyNum);
	}

	public Short getFormulaBodyNum()
	{
		return (Short) readProperty("formulaBodyNum");
	}

	public void setFormulaCompCmnt(String formulaCompCmnt)
	{
		writeProperty("formulaCompCmnt", formulaCompCmnt);
	}

	public String getFormulaCompCmnt()
	{
		return (String) readProperty("formulaCompCmnt");
	}

	public void setFormulaCompCurrCode(String formulaCompCurrCode)
	{
		writeProperty("formulaCompCurrCode", formulaCompCurrCode);
	}

	public String getFormulaCompCurrCode()
	{
		return (String) readProperty("formulaCompCurrCode");
	}

	public void setFormulaCompLabel(String formulaCompLabel)
	{
		writeProperty("formulaCompLabel", formulaCompLabel);
	}

	public String getFormulaCompLabel()
	{
		return (String) readProperty("formulaCompLabel");
	}

	public void setFormulaCompName(String formulaCompName)
	{
		writeProperty("formulaCompName", formulaCompName);
	}

	public String getFormulaCompName()
	{
		return (String) readProperty("formulaCompName");
	}

	public void setFormulaCompNum(Short formulaCompNum)
	{
		writeProperty("formulaCompNum", formulaCompNum);
	}

	public Short getFormulaCompNum()
	{
		return (Short) readProperty("formulaCompNum");
	}

	public void setFormulaCompPosNum(Short formulaCompPosNum)
	{
		writeProperty("formulaCompPosNum", formulaCompPosNum);
	}

	public Short getFormulaCompPosNum()
	{
		return (Short) readProperty("formulaCompPosNum");
	}

	public void setFormulaCompRef(Integer formulaCompRef)
	{
		writeProperty("formulaCompRef", formulaCompRef);
	}

	public Integer getFormulaCompRef()
	{
		return (Integer) readProperty("formulaCompRef");
	}

	public void setFormulaCompType(String formulaCompType)
	{
		writeProperty("formulaCompType", formulaCompType);
	}

	public String getFormulaCompType()
	{
		return (String) readProperty("formulaCompType");
	}

	public void setFormulaCompUomCode(String formulaCompUomCode)
	{
		writeProperty("formulaCompUomCode", formulaCompUomCode);
	}

	public String getFormulaCompUomCode()
	{
		return (String) readProperty("formulaCompUomCode");
	}

	public void setFormulaCompVal(Double formulaCompVal)
	{
		writeProperty("formulaCompVal", formulaCompVal);
	}

	public Double getFormulaCompVal()
	{
		return (Double) readProperty("formulaCompVal");
	}

	public void setFormulaCompValType(String formulaCompValType)
	{
		writeProperty("formulaCompValType", formulaCompValType);
	}

	public String getFormulaCompValType()
	{
		return (String) readProperty("formulaCompValType");
	}

	public void setFormulaNum(Integer formulaNum)
	{
		writeProperty("formulaNum", formulaNum);
	}

	public Integer getFormulaNum()
	{
		return (Integer) readProperty("formulaNum");
	}

	public void setIsTypeWeightInd(String isTypeWeightInd)
	{
		writeProperty("isTypeWeightInd", isTypeWeightInd);
	}

	public String getIsTypeWeightInd()
	{
		return (String) readProperty("isTypeWeightInd");
	}

	public void setLinearFactor(Double linearFactor)
	{
		writeProperty("linearFactor", linearFactor);
	}

	public Double getLinearFactor()
	{
		return (Double) readProperty("linearFactor");
	}

	public void setPerUomCode(String perUomCode)
	{
		writeProperty("perUomCode", perUomCode);
	}

	public String getPerUomCode()
	{
		return (String) readProperty("perUomCode");
	}

	public void setPriceSourceCode(String priceSourceCode)
	{
		writeProperty("priceSourceCode", priceSourceCode);
	}

	public String getPriceSourceCode()
	{
		return (String) readProperty("priceSourceCode");
	}

	public void setRespTransId(Integer respTransId)
	{
		writeProperty("respTransId", respTransId);
	}

	public Integer getRespTransId()
	{
		return (Integer) readProperty("respTransId");
	}

	public void setTradingPrd(String tradingPrd)
	{
		writeProperty("tradingPrd", tradingPrd);
	}

	public String getTradingPrd()
	{
		return (String) readProperty("tradingPrd");
	}

	public void setTransId(Integer transId)
	{
		writeProperty("transId", transId);
	}

	public Integer getTransId()
	{
		return (Integer) readProperty("transId");
	}

	public void setUomRatioFactor(BigDecimal uomRatioFactor)
	{
		writeProperty("uomRatioFactor", uomRatioFactor);
	}

	public BigDecimal getUomRatioFactor()
	{
		return (BigDecimal) readProperty("uomRatioFactor");
	}

}
