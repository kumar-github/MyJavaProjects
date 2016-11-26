package com.tc.app.exchangemonitor.model.cayenne.persistent.auto;

import java.math.BigDecimal;
import java.util.Date;
import java.util.List;

import org.apache.cayenne.CayenneDataObject;
import org.apache.cayenne.exp.Property;

import com.tc.app.exchangemonitor.model.cayenne.persistent.Cost;

/**
 * Class _CostRate was generated by Cayenne.
 * It is probably a good idea to avoid changing this class manually,
 * since it may be overwritten next time code is regenerated.
 * If you need to make any customizations, please use subclass.
 */
public abstract class _CostRate extends CayenneDataObject
{

	private static final long serialVersionUID = 1L;

	public static final String OID_PK_COLUMN = "oid";

	public static final Property<Integer> COST_NUM = new Property<Integer>("costNum");
	public static final Property<Date> EFFECTIVE_DATE = new Property<Date>("effectiveDate");
	public static final Property<BigDecimal> FACTOR = new Property<BigDecimal>("factor");
	public static final Property<Integer> FORMULA_COST_NUM = new Property<Integer>("formulaCostNum");
	public static final Property<String> FORMULA_IND = new Property<String>("formulaInd");
	public static final Property<Integer> FORMULA_NUM = new Property<Integer>("formulaNum");
	public static final Property<String> IS_FULLY_PRICED = new Property<String>("isFullyPriced");
	public static final Property<Integer> LIBRARARY_FORMULA_NUM = new Property<Integer>("librararyFormulaNum");
	public static final Property<BigDecimal> RATE = new Property<BigDecimal>("rate");
	public static final Property<String> RATE_CURR_CODE = new Property<String>("rateCurrCode");
	public static final Property<String> RATE_UOM_CODE = new Property<String>("rateUomCode");
	public static final Property<Integer> TRANS_ID = new Property<Integer>("transId");
	public static final Property<List<Cost>> COSTS = new Property<List<Cost>>("costs");

	public void setCostNum(Integer costNum)
	{
		writeProperty("costNum", costNum);
	}

	public Integer getCostNum()
	{
		return (Integer) readProperty("costNum");
	}

	public void setEffectiveDate(Date effectiveDate)
	{
		writeProperty("effectiveDate", effectiveDate);
	}

	public Date getEffectiveDate()
	{
		return (Date) readProperty("effectiveDate");
	}

	public void setFactor(BigDecimal factor)
	{
		writeProperty("factor", factor);
	}

	public BigDecimal getFactor()
	{
		return (BigDecimal) readProperty("factor");
	}

	public void setFormulaCostNum(Integer formulaCostNum)
	{
		writeProperty("formulaCostNum", formulaCostNum);
	}

	public Integer getFormulaCostNum()
	{
		return (Integer) readProperty("formulaCostNum");
	}

	public void setFormulaInd(String formulaInd)
	{
		writeProperty("formulaInd", formulaInd);
	}

	public String getFormulaInd()
	{
		return (String) readProperty("formulaInd");
	}

	public void setFormulaNum(Integer formulaNum)
	{
		writeProperty("formulaNum", formulaNum);
	}

	public Integer getFormulaNum()
	{
		return (Integer) readProperty("formulaNum");
	}

	public void setIsFullyPriced(String isFullyPriced)
	{
		writeProperty("isFullyPriced", isFullyPriced);
	}

	public String getIsFullyPriced()
	{
		return (String) readProperty("isFullyPriced");
	}

	public void setLibrararyFormulaNum(Integer librararyFormulaNum)
	{
		writeProperty("librararyFormulaNum", librararyFormulaNum);
	}

	public Integer getLibrararyFormulaNum()
	{
		return (Integer) readProperty("librararyFormulaNum");
	}

	public void setRate(BigDecimal rate)
	{
		writeProperty("rate", rate);
	}

	public BigDecimal getRate()
	{
		return (BigDecimal) readProperty("rate");
	}

	public void setRateCurrCode(String rateCurrCode)
	{
		writeProperty("rateCurrCode", rateCurrCode);
	}

	public String getRateCurrCode()
	{
		return (String) readProperty("rateCurrCode");
	}

	public void setRateUomCode(String rateUomCode)
	{
		writeProperty("rateUomCode", rateUomCode);
	}

	public String getRateUomCode()
	{
		return (String) readProperty("rateUomCode");
	}

	public void setTransId(Integer transId)
	{
		writeProperty("transId", transId);
	}

	public Integer getTransId()
	{
		return (Integer) readProperty("transId");
	}

	public void addToCosts(Cost obj)
	{
		addToManyTarget("costs", obj, true);
	}

	public void removeFromCosts(Cost obj)
	{
		removeToManyTarget("costs", obj, true);
	}

	@SuppressWarnings("unchecked")
	public List<Cost> getCosts()
	{
		return (List<Cost>) readProperty("costs");
	}

}
