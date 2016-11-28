package com.tc.app.exchangemonitor.model.cayenne.persistent.auto;

import java.util.Date;

import org.apache.cayenne.CayenneDataObject;
import org.apache.cayenne.exp.Property;

/**
 * Class _AudLcAllocation was generated by Cayenne.
 * It is probably a good idea to avoid changing this class manually,
 * since it may be overwritten next time code is regenerated.
 * If you need to make any customizations, please use subclass.
 */
public abstract class _AudLcAllocation extends CayenneDataObject
{

	private static final long serialVersionUID = 1L;

	public static final Property<String> CMDTY_CODE = new Property<String>("cmdtyCode");
	public static final Property<Double> LC_ALLOC_AMT_CAP = new Property<Double>("lcAllocAmtCap");
	public static final Property<String> LC_ALLOC_AMT_CURR_CODE = new Property<String>("lcAllocAmtCurrCode");
	public static final Property<Double> LC_ALLOC_AMT_LEFT = new Property<Double>("lcAllocAmtLeft");
	public static final Property<String> LC_ALLOC_AMT_TOL_OPER = new Property<String>("lcAllocAmtTolOper");
	public static final Property<Short> LC_ALLOC_AMT_TOL_PCNT = new Property<Short>("lcAllocAmtTolPcnt");
	public static final Property<Double> LC_ALLOC_BASE_PRICE = new Property<Double>("lcAllocBasePrice");
	public static final Property<String> LC_ALLOC_BASE_PRICE_CURR_CODE = new Property<String>("lcAllocBasePriceCurrCode");
	public static final Property<String> LC_ALLOC_BASE_PRICE_UOM_CODE = new Property<String>("lcAllocBasePriceUomCode");
	public static final Property<Date> LC_ALLOC_END_DATE = new Property<Date>("lcAllocEndDate");
	public static final Property<Integer> LC_ALLOC_FORMULA_NUM = new Property<Integer>("lcAllocFormulaNum");
	public static final Property<Date> LC_ALLOC_LAST_BL_DATE = new Property<Date>("lcAllocLastBlDate");
	public static final Property<Double> LC_ALLOC_MAX_AMT = new Property<Double>("lcAllocMaxAmt");
	public static final Property<Double> LC_ALLOC_MAX_QTY = new Property<Double>("lcAllocMaxQty");
	public static final Property<Double> LC_ALLOC_MIN_AMT = new Property<Double>("lcAllocMinAmt");
	public static final Property<Double> LC_ALLOC_MIN_QTY = new Property<Double>("lcAllocMinQty");
	public static final Property<Short> LC_ALLOC_NUM = new Property<Short>("lcAllocNum");
	public static final Property<String> LC_ALLOC_PARTIAL_SHIP_IND = new Property<String>("lcAllocPartialShipInd");
	public static final Property<String> LC_ALLOC_QTY_TOL_OPER = new Property<String>("lcAllocQtyTolOper");
	public static final Property<Short> LC_ALLOC_QTY_TOL_PCNT = new Property<Short>("lcAllocQtyTolPcnt");
	public static final Property<String> LC_ALLOC_QTY_UOM_CODE = new Property<String>("lcAllocQtyUomCode");
	public static final Property<Date> LC_ALLOC_START_DATE = new Property<Date>("lcAllocStartDate");
	public static final Property<String> LC_ALLOC_TRANS_SHIP_IND = new Property<String>("lcAllocTransShipInd");
	public static final Property<Integer> LC_NUM = new Property<Integer>("lcNum");
	public static final Property<Integer> RESP_TRANS_ID = new Property<Integer>("respTransId");
	public static final Property<Integer> TRANS_ID = new Property<Integer>("transId");

	public void setCmdtyCode(String cmdtyCode)
	{
		writeProperty("cmdtyCode", cmdtyCode);
	}

	public String getCmdtyCode()
	{
		return (String) readProperty("cmdtyCode");
	}

	public void setLcAllocAmtCap(Double lcAllocAmtCap)
	{
		writeProperty("lcAllocAmtCap", lcAllocAmtCap);
	}

	public Double getLcAllocAmtCap()
	{
		return (Double) readProperty("lcAllocAmtCap");
	}

	public void setLcAllocAmtCurrCode(String lcAllocAmtCurrCode)
	{
		writeProperty("lcAllocAmtCurrCode", lcAllocAmtCurrCode);
	}

	public String getLcAllocAmtCurrCode()
	{
		return (String) readProperty("lcAllocAmtCurrCode");
	}

	public void setLcAllocAmtLeft(Double lcAllocAmtLeft)
	{
		writeProperty("lcAllocAmtLeft", lcAllocAmtLeft);
	}

	public Double getLcAllocAmtLeft()
	{
		return (Double) readProperty("lcAllocAmtLeft");
	}

	public void setLcAllocAmtTolOper(String lcAllocAmtTolOper)
	{
		writeProperty("lcAllocAmtTolOper", lcAllocAmtTolOper);
	}

	public String getLcAllocAmtTolOper()
	{
		return (String) readProperty("lcAllocAmtTolOper");
	}

	public void setLcAllocAmtTolPcnt(Short lcAllocAmtTolPcnt)
	{
		writeProperty("lcAllocAmtTolPcnt", lcAllocAmtTolPcnt);
	}

	public Short getLcAllocAmtTolPcnt()
	{
		return (Short) readProperty("lcAllocAmtTolPcnt");
	}

	public void setLcAllocBasePrice(Double lcAllocBasePrice)
	{
		writeProperty("lcAllocBasePrice", lcAllocBasePrice);
	}

	public Double getLcAllocBasePrice()
	{
		return (Double) readProperty("lcAllocBasePrice");
	}

	public void setLcAllocBasePriceCurrCode(String lcAllocBasePriceCurrCode)
	{
		writeProperty("lcAllocBasePriceCurrCode", lcAllocBasePriceCurrCode);
	}

	public String getLcAllocBasePriceCurrCode()
	{
		return (String) readProperty("lcAllocBasePriceCurrCode");
	}

	public void setLcAllocBasePriceUomCode(String lcAllocBasePriceUomCode)
	{
		writeProperty("lcAllocBasePriceUomCode", lcAllocBasePriceUomCode);
	}

	public String getLcAllocBasePriceUomCode()
	{
		return (String) readProperty("lcAllocBasePriceUomCode");
	}

	public void setLcAllocEndDate(Date lcAllocEndDate)
	{
		writeProperty("lcAllocEndDate", lcAllocEndDate);
	}

	public Date getLcAllocEndDate()
	{
		return (Date) readProperty("lcAllocEndDate");
	}

	public void setLcAllocFormulaNum(Integer lcAllocFormulaNum)
	{
		writeProperty("lcAllocFormulaNum", lcAllocFormulaNum);
	}

	public Integer getLcAllocFormulaNum()
	{
		return (Integer) readProperty("lcAllocFormulaNum");
	}

	public void setLcAllocLastBlDate(Date lcAllocLastBlDate)
	{
		writeProperty("lcAllocLastBlDate", lcAllocLastBlDate);
	}

	public Date getLcAllocLastBlDate()
	{
		return (Date) readProperty("lcAllocLastBlDate");
	}

	public void setLcAllocMaxAmt(Double lcAllocMaxAmt)
	{
		writeProperty("lcAllocMaxAmt", lcAllocMaxAmt);
	}

	public Double getLcAllocMaxAmt()
	{
		return (Double) readProperty("lcAllocMaxAmt");
	}

	public void setLcAllocMaxQty(Double lcAllocMaxQty)
	{
		writeProperty("lcAllocMaxQty", lcAllocMaxQty);
	}

	public Double getLcAllocMaxQty()
	{
		return (Double) readProperty("lcAllocMaxQty");
	}

	public void setLcAllocMinAmt(Double lcAllocMinAmt)
	{
		writeProperty("lcAllocMinAmt", lcAllocMinAmt);
	}

	public Double getLcAllocMinAmt()
	{
		return (Double) readProperty("lcAllocMinAmt");
	}

	public void setLcAllocMinQty(Double lcAllocMinQty)
	{
		writeProperty("lcAllocMinQty", lcAllocMinQty);
	}

	public Double getLcAllocMinQty()
	{
		return (Double) readProperty("lcAllocMinQty");
	}

	public void setLcAllocNum(Short lcAllocNum)
	{
		writeProperty("lcAllocNum", lcAllocNum);
	}

	public Short getLcAllocNum()
	{
		return (Short) readProperty("lcAllocNum");
	}

	public void setLcAllocPartialShipInd(String lcAllocPartialShipInd)
	{
		writeProperty("lcAllocPartialShipInd", lcAllocPartialShipInd);
	}

	public String getLcAllocPartialShipInd()
	{
		return (String) readProperty("lcAllocPartialShipInd");
	}

	public void setLcAllocQtyTolOper(String lcAllocQtyTolOper)
	{
		writeProperty("lcAllocQtyTolOper", lcAllocQtyTolOper);
	}

	public String getLcAllocQtyTolOper()
	{
		return (String) readProperty("lcAllocQtyTolOper");
	}

	public void setLcAllocQtyTolPcnt(Short lcAllocQtyTolPcnt)
	{
		writeProperty("lcAllocQtyTolPcnt", lcAllocQtyTolPcnt);
	}

	public Short getLcAllocQtyTolPcnt()
	{
		return (Short) readProperty("lcAllocQtyTolPcnt");
	}

	public void setLcAllocQtyUomCode(String lcAllocQtyUomCode)
	{
		writeProperty("lcAllocQtyUomCode", lcAllocQtyUomCode);
	}

	public String getLcAllocQtyUomCode()
	{
		return (String) readProperty("lcAllocQtyUomCode");
	}

	public void setLcAllocStartDate(Date lcAllocStartDate)
	{
		writeProperty("lcAllocStartDate", lcAllocStartDate);
	}

	public Date getLcAllocStartDate()
	{
		return (Date) readProperty("lcAllocStartDate");
	}

	public void setLcAllocTransShipInd(String lcAllocTransShipInd)
	{
		writeProperty("lcAllocTransShipInd", lcAllocTransShipInd);
	}

	public String getLcAllocTransShipInd()
	{
		return (String) readProperty("lcAllocTransShipInd");
	}

	public void setLcNum(Integer lcNum)
	{
		writeProperty("lcNum", lcNum);
	}

	public Integer getLcNum()
	{
		return (Integer) readProperty("lcNum");
	}

	public void setRespTransId(Integer respTransId)
	{
		writeProperty("respTransId", respTransId);
	}

	public Integer getRespTransId()
	{
		return (Integer) readProperty("respTransId");
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