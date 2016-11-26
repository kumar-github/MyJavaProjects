package com.tc.app.exchangemonitor.model.cayenne.persistent.auto;

import java.util.Date;

import org.apache.cayenne.CayenneDataObject;
import org.apache.cayenne.exp.Property;

import com.tc.app.exchangemonitor.model.cayenne.persistent.Commodity;
import com.tc.app.exchangemonitor.model.cayenne.persistent.IctsUser;
import com.tc.app.exchangemonitor.model.cayenne.persistent.Uom;

/**
 * Class _Accumulation was generated by Cayenne.
 * It is probably a good idea to avoid changing this class manually,
 * since it may be overwritten next time code is regenerated.
 * If you need to make any customizations, please use subclass.
 */
public abstract class _Accumulation extends CayenneDataObject
{

	private static final long serialVersionUID = 1L;

	public static final String ACCUM_NUM_PK_COLUMN = "accum_num";
	public static final String ITEM_NUM_PK_COLUMN = "item_num";
	public static final String ORDER_NUM_PK_COLUMN = "order_num";
	public static final String TRADE_NUM_PK_COLUMN = "trade_num";

	public static final Property<String> ACCUM_CREATION_TYPE = new Property<String>("accumCreationType");
	public static final Property<Date> ACCUM_END_DATE = new Property<Date>("accumEndDate");
	public static final Property<Double> ACCUM_QTY = new Property<Double>("accumQty");
	public static final Property<Date> ACCUM_START_DATE = new Property<Date>("accumStartDate");
	public static final Property<Integer> AI_EST_ACTUAL_NUM = new Property<Integer>("aiEstActualNum");
	public static final Property<Short> ALLOC_ITEM_NUM = new Property<Short>("allocItemNum");
	public static final Property<Integer> ALLOC_NUM = new Property<Integer>("allocNum");
	public static final Property<Integer> CMNT_NUM = new Property<Integer>("cmntNum");
	public static final Property<Integer> COST_NUM = new Property<Integer>("costNum");
	public static final Property<Integer> FORMULA_NUM = new Property<Integer>("formulaNum");
	public static final Property<Short> FORMULA_PRECISION = new Property<Short>("formulaPrecision");
	public static final Property<String> IDMS_TRIG_BB_REF_NUM = new Property<String>("idmsTrigBbRefNum");
	public static final Property<Date> LAST_PRICING_AS_OF_DATE = new Property<Date>("lastPricingAsOfDate");
	public static final Property<Date> LAST_PRICING_RUN_DATE = new Property<Date>("lastPricingRunDate");
	public static final Property<String> MANUAL_OVERRIDE_IND = new Property<String>("manualOverrideInd");
	public static final Property<Short> MAX_QPP_NUM = new Property<Short>("maxQppNum");
	public static final Property<Date> NOMINAL_END_DATE = new Property<Date>("nominalEndDate");
	public static final Property<Date> NOMINAL_START_DATE = new Property<Date>("nominalStartDate");
	public static final Property<String> PRICE_STATUS = new Property<String>("priceStatus");
	public static final Property<Date> QUOTE_END_DATE = new Property<Date>("quoteEndDate");
	public static final Property<Date> QUOTE_START_DATE = new Property<Date>("quoteStartDate");
	public static final Property<Double> TOTAL_PRICE = new Property<Double>("totalPrice");
	public static final Property<Integer> TRANS_ID = new Property<Integer>("transId");
	public static final Property<Commodity> COMMODITY = new Property<Commodity>("commodity");
	public static final Property<IctsUser> ICTS_USER = new Property<IctsUser>("ictsUser");
	public static final Property<Uom> UOM = new Property<Uom>("uom");

	public void setAccumCreationType(String accumCreationType)
	{
		writeProperty("accumCreationType", accumCreationType);
	}

	public String getAccumCreationType()
	{
		return (String) readProperty("accumCreationType");
	}

	public void setAccumEndDate(Date accumEndDate)
	{
		writeProperty("accumEndDate", accumEndDate);
	}

	public Date getAccumEndDate()
	{
		return (Date) readProperty("accumEndDate");
	}

	public void setAccumQty(Double accumQty)
	{
		writeProperty("accumQty", accumQty);
	}

	public Double getAccumQty()
	{
		return (Double) readProperty("accumQty");
	}

	public void setAccumStartDate(Date accumStartDate)
	{
		writeProperty("accumStartDate", accumStartDate);
	}

	public Date getAccumStartDate()
	{
		return (Date) readProperty("accumStartDate");
	}

	public void setAiEstActualNum(Integer aiEstActualNum)
	{
		writeProperty("aiEstActualNum", aiEstActualNum);
	}

	public Integer getAiEstActualNum()
	{
		return (Integer) readProperty("aiEstActualNum");
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

	public void setCmntNum(Integer cmntNum)
	{
		writeProperty("cmntNum", cmntNum);
	}

	public Integer getCmntNum()
	{
		return (Integer) readProperty("cmntNum");
	}

	public void setCostNum(Integer costNum)
	{
		writeProperty("costNum", costNum);
	}

	public Integer getCostNum()
	{
		return (Integer) readProperty("costNum");
	}

	public void setFormulaNum(Integer formulaNum)
	{
		writeProperty("formulaNum", formulaNum);
	}

	public Integer getFormulaNum()
	{
		return (Integer) readProperty("formulaNum");
	}

	public void setFormulaPrecision(Short formulaPrecision)
	{
		writeProperty("formulaPrecision", formulaPrecision);
	}

	public Short getFormulaPrecision()
	{
		return (Short) readProperty("formulaPrecision");
	}

	public void setIdmsTrigBbRefNum(String idmsTrigBbRefNum)
	{
		writeProperty("idmsTrigBbRefNum", idmsTrigBbRefNum);
	}

	public String getIdmsTrigBbRefNum()
	{
		return (String) readProperty("idmsTrigBbRefNum");
	}

	public void setLastPricingAsOfDate(Date lastPricingAsOfDate)
	{
		writeProperty("lastPricingAsOfDate", lastPricingAsOfDate);
	}

	public Date getLastPricingAsOfDate()
	{
		return (Date) readProperty("lastPricingAsOfDate");
	}

	public void setLastPricingRunDate(Date lastPricingRunDate)
	{
		writeProperty("lastPricingRunDate", lastPricingRunDate);
	}

	public Date getLastPricingRunDate()
	{
		return (Date) readProperty("lastPricingRunDate");
	}

	public void setManualOverrideInd(String manualOverrideInd)
	{
		writeProperty("manualOverrideInd", manualOverrideInd);
	}

	public String getManualOverrideInd()
	{
		return (String) readProperty("manualOverrideInd");
	}

	public void setMaxQppNum(Short maxQppNum)
	{
		writeProperty("maxQppNum", maxQppNum);
	}

	public Short getMaxQppNum()
	{
		return (Short) readProperty("maxQppNum");
	}

	public void setNominalEndDate(Date nominalEndDate)
	{
		writeProperty("nominalEndDate", nominalEndDate);
	}

	public Date getNominalEndDate()
	{
		return (Date) readProperty("nominalEndDate");
	}

	public void setNominalStartDate(Date nominalStartDate)
	{
		writeProperty("nominalStartDate", nominalStartDate);
	}

	public Date getNominalStartDate()
	{
		return (Date) readProperty("nominalStartDate");
	}

	public void setPriceStatus(String priceStatus)
	{
		writeProperty("priceStatus", priceStatus);
	}

	public String getPriceStatus()
	{
		return (String) readProperty("priceStatus");
	}

	public void setQuoteEndDate(Date quoteEndDate)
	{
		writeProperty("quoteEndDate", quoteEndDate);
	}

	public Date getQuoteEndDate()
	{
		return (Date) readProperty("quoteEndDate");
	}

	public void setQuoteStartDate(Date quoteStartDate)
	{
		writeProperty("quoteStartDate", quoteStartDate);
	}

	public Date getQuoteStartDate()
	{
		return (Date) readProperty("quoteStartDate");
	}

	public void setTotalPrice(Double totalPrice)
	{
		writeProperty("totalPrice", totalPrice);
	}

	public Double getTotalPrice()
	{
		return (Double) readProperty("totalPrice");
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

	public void setIctsUser(IctsUser ictsUser)
	{
		setToOneTarget("ictsUser", ictsUser, true);
	}

	public IctsUser getIctsUser()
	{
		return (IctsUser) readProperty("ictsUser");
	}

	public void setUom(Uom uom)
	{
		setToOneTarget("uom", uom, true);
	}

	public Uom getUom()
	{
		return (Uom) readProperty("uom");
	}

}
