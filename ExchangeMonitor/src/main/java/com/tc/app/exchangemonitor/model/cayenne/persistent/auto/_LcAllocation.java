package com.tc.app.exchangemonitor.model.cayenne.persistent.auto;

import java.util.Date;

import org.apache.cayenne.CayenneDataObject;
import org.apache.cayenne.exp.Property;

import com.tc.app.exchangemonitor.model.cayenne.persistent.Commodity;
import com.tc.app.exchangemonitor.model.cayenne.persistent.Uom;

/**
 * Class _LcAllocation was generated by Cayenne.
 * It is probably a good idea to avoid changing this class manually,
 * since it may be overwritten next time code is regenerated.
 * If you need to make any customizations, please use subclass.
 */
public abstract class _LcAllocation extends CayenneDataObject
{

	private static final long serialVersionUID = 1L;

	public static final String LC_ALLOC_NUM_PK_COLUMN = "lc_alloc_num";
	public static final String LC_NUM_PK_COLUMN = "lc_num";

	public static final Property<Double> LC_ALLOC_AMT_CAP = new Property<Double>("lcAllocAmtCap");
	public static final Property<Double> LC_ALLOC_AMT_LEFT = new Property<Double>("lcAllocAmtLeft");
	public static final Property<String> LC_ALLOC_AMT_TOL_OPER = new Property<String>("lcAllocAmtTolOper");
	public static final Property<Short> LC_ALLOC_AMT_TOL_PCNT = new Property<Short>("lcAllocAmtTolPcnt");
	public static final Property<Double> LC_ALLOC_BASE_PRICE = new Property<Double>("lcAllocBasePrice");
	public static final Property<Date> LC_ALLOC_END_DATE = new Property<Date>("lcAllocEndDate");
	public static final Property<Integer> LC_ALLOC_FORMULA_NUM = new Property<Integer>("lcAllocFormulaNum");
	public static final Property<Date> LC_ALLOC_LAST_BL_DATE = new Property<Date>("lcAllocLastBlDate");
	public static final Property<Double> LC_ALLOC_MAX_AMT = new Property<Double>("lcAllocMaxAmt");
	public static final Property<Double> LC_ALLOC_MAX_QTY = new Property<Double>("lcAllocMaxQty");
	public static final Property<Double> LC_ALLOC_MIN_AMT = new Property<Double>("lcAllocMinAmt");
	public static final Property<Double> LC_ALLOC_MIN_QTY = new Property<Double>("lcAllocMinQty");
	public static final Property<String> LC_ALLOC_PARTIAL_SHIP_IND = new Property<String>("lcAllocPartialShipInd");
	public static final Property<String> LC_ALLOC_QTY_TOL_OPER = new Property<String>("lcAllocQtyTolOper");
	public static final Property<Short> LC_ALLOC_QTY_TOL_PCNT = new Property<Short>("lcAllocQtyTolPcnt");
	public static final Property<Date> LC_ALLOC_START_DATE = new Property<Date>("lcAllocStartDate");
	public static final Property<String> LC_ALLOC_TRANS_SHIP_IND = new Property<String>("lcAllocTransShipInd");
	public static final Property<Integer> TRANS_ID = new Property<Integer>("transId");
	public static final Property<Commodity> COMMODITY = new Property<Commodity>("commodity");
	public static final Property<Commodity> COMMODITY1 = new Property<Commodity>("commodity1");
	public static final Property<Commodity> COMMODITY2 = new Property<Commodity>("commodity2");
	public static final Property<Uom> UOM = new Property<Uom>("uom");
	public static final Property<Uom> UOM1 = new Property<Uom>("uom1");

	public void setLcAllocAmtCap(Double lcAllocAmtCap)
	{
		writeProperty("lcAllocAmtCap", lcAllocAmtCap);
	}

	public Double getLcAllocAmtCap()
	{
		return (Double) readProperty("lcAllocAmtCap");
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

	public void setTransId(Integer transId)
	{
		writeProperty("transId", transId);
	}

	public Integer getTransId()
	{
		return (Integer) readProperty("transId");
	}

	public void setCommodity(Commodity commodity)
	{
		setToOneTarget("commodity", commodity, true);
	}

	public Commodity getCommodity()
	{
		return (Commodity) readProperty("commodity");
	}

	public void setCommodity1(Commodity commodity1)
	{
		setToOneTarget("commodity1", commodity1, true);
	}

	public Commodity getCommodity1()
	{
		return (Commodity) readProperty("commodity1");
	}

	public void setCommodity2(Commodity commodity2)
	{
		setToOneTarget("commodity2", commodity2, true);
	}

	public Commodity getCommodity2()
	{
		return (Commodity) readProperty("commodity2");
	}

	public void setUom(Uom uom)
	{
		setToOneTarget("uom", uom, true);
	}

	public Uom getUom()
	{
		return (Uom) readProperty("uom");
	}

	public void setUom1(Uom uom1)
	{
		setToOneTarget("uom1", uom1, true);
	}

	public Uom getUom1()
	{
		return (Uom) readProperty("uom1");
	}

}
