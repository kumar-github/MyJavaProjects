package com.tc.app.exchangemonitor.model.cayenne.persistent.auto;

import java.util.Date;

import org.apache.cayenne.CayenneDataObject;
import org.apache.cayenne.exp.Property;

import com.tc.app.exchangemonitor.model.cayenne.persistent.Calendar;
import com.tc.app.exchangemonitor.model.cayenne.persistent.Uom;

/**
 * Class _QuotePricingPeriod was generated by Cayenne.
 * It is probably a good idea to avoid changing this class manually,
 * since it may be overwritten next time code is regenerated.
 * If you need to make any customizations, please use subclass.
 */
public abstract class _QuotePricingPeriod extends CayenneDataObject
{

	private static final long serialVersionUID = 1L;

	public static final String ACCUM_NUM_PK_COLUMN = "accum_num";
	public static final String ITEM_NUM_PK_COLUMN = "item_num";
	public static final String ORDER_NUM_PK_COLUMN = "order_num";
	public static final String QPP_NUM_PK_COLUMN = "qpp_num";
	public static final String TRADE_NUM_PK_COLUMN = "trade_num";

	public static final Property<Date> CAL_IMPACT_END_DATE = new Property<>("calImpactEndDate");
	public static final Property<Date> CAL_IMPACT_START_DATE = new Property<>("calImpactStartDate");
	public static final Property<Short> FORMULA_BODY_NUM = new Property<>("formulaBodyNum");
	public static final Property<Short> FORMULA_COMP_NUM = new Property<>("formulaCompNum");
	public static final Property<Integer> FORMULA_NUM = new Property<>("formulaNum");
	public static final Property<Date> LAST_PRICING_DATE = new Property<>("lastPricingDate");
	public static final Property<String> MANUAL_OVERRIDE_IND = new Property<>("manualOverrideInd");
	public static final Property<Date> NOMINAL_END_DATE = new Property<>("nominalEndDate");
	public static final Property<Date> NOMINAL_START_DATE = new Property<>("nominalStartDate");
	public static final Property<Short> NUM_OF_DAYS_PRICED = new Property<>("numOfDaysPriced");
	public static final Property<Short> NUM_OF_PRICING_DAYS = new Property<>("numOfPricingDays");
	public static final Property<Double> OPEN_PRICE = new Property<>("openPrice");
	public static final Property<String> PRICE_CURR_CODE = new Property<>("priceCurrCode");
	public static final Property<Double> PRICED_PRICE = new Property<>("pricedPrice");
	public static final Property<Double> PRICED_QTY = new Property<>("pricedQty");
	public static final Property<Date> QUOTE_END_DATE = new Property<>("quoteEndDate");
	public static final Property<Date> QUOTE_START_DATE = new Property<>("quoteStartDate");
	public static final Property<String> REAL_TRADING_PRD = new Property<>("realTradingPrd");
	public static final Property<String> RISK_TRADING_PRD = new Property<>("riskTradingPrd");
	public static final Property<Double> TOTAL_QTY = new Property<>("totalQty");
	public static final Property<Integer> TRANS_ID = new Property<>("transId");
	public static final Property<Calendar> CALENDAR = new Property<>("calendar");
	public static final Property<Uom> UOM = new Property<>("uom");
	public static final Property<Uom> UOM1 = new Property<>("uom1");

	public void setCalImpactEndDate(final Date calImpactEndDate)
	{
		this.writeProperty("calImpactEndDate", calImpactEndDate);
	}

	public Date getCalImpactEndDate()
	{
		return (Date) this.readProperty("calImpactEndDate");
	}

	public void setCalImpactStartDate(final Date calImpactStartDate)
	{
		this.writeProperty("calImpactStartDate", calImpactStartDate);
	}

	public Date getCalImpactStartDate()
	{
		return (Date) this.readProperty("calImpactStartDate");
	}

	public void setFormulaBodyNum(final Short formulaBodyNum)
	{
		this.writeProperty("formulaBodyNum", formulaBodyNum);
	}

	public Short getFormulaBodyNum()
	{
		return (Short) this.readProperty("formulaBodyNum");
	}

	public void setFormulaCompNum(final Short formulaCompNum)
	{
		this.writeProperty("formulaCompNum", formulaCompNum);
	}

	public Short getFormulaCompNum()
	{
		return (Short) this.readProperty("formulaCompNum");
	}

	public void setFormulaNum(final Integer formulaNum)
	{
		this.writeProperty("formulaNum", formulaNum);
	}

	public Integer getFormulaNum()
	{
		return (Integer) this.readProperty("formulaNum");
	}

	public void setLastPricingDate(final Date lastPricingDate)
	{
		this.writeProperty("lastPricingDate", lastPricingDate);
	}

	public Date getLastPricingDate()
	{
		return (Date) this.readProperty("lastPricingDate");
	}

	public void setManualOverrideInd(final String manualOverrideInd)
	{
		this.writeProperty("manualOverrideInd", manualOverrideInd);
	}

	public String getManualOverrideInd()
	{
		return (String) this.readProperty("manualOverrideInd");
	}

	public void setNominalEndDate(final Date nominalEndDate)
	{
		this.writeProperty("nominalEndDate", nominalEndDate);
	}

	public Date getNominalEndDate()
	{
		return (Date) this.readProperty("nominalEndDate");
	}

	public void setNominalStartDate(final Date nominalStartDate)
	{
		this.writeProperty("nominalStartDate", nominalStartDate);
	}

	public Date getNominalStartDate()
	{
		return (Date) this.readProperty("nominalStartDate");
	}

	public void setNumOfDaysPriced(final Short numOfDaysPriced)
	{
		this.writeProperty("numOfDaysPriced", numOfDaysPriced);
	}

	public Short getNumOfDaysPriced()
	{
		return (Short) this.readProperty("numOfDaysPriced");
	}

	public void setNumOfPricingDays(final Short numOfPricingDays)
	{
		this.writeProperty("numOfPricingDays", numOfPricingDays);
	}

	public Short getNumOfPricingDays()
	{
		return (Short) this.readProperty("numOfPricingDays");
	}

	public void setOpenPrice(final Double openPrice)
	{
		this.writeProperty("openPrice", openPrice);
	}

	public Double getOpenPrice()
	{
		return (Double) this.readProperty("openPrice");
	}

	public void setPriceCurrCode(final String priceCurrCode)
	{
		this.writeProperty("priceCurrCode", priceCurrCode);
	}

	public String getPriceCurrCode()
	{
		return (String) this.readProperty("priceCurrCode");
	}

	public void setPricedPrice(final Double pricedPrice)
	{
		this.writeProperty("pricedPrice", pricedPrice);
	}

	public Double getPricedPrice()
	{
		return (Double) this.readProperty("pricedPrice");
	}

	public void setPricedQty(final Double pricedQty)
	{
		this.writeProperty("pricedQty", pricedQty);
	}

	public Double getPricedQty()
	{
		return (Double) this.readProperty("pricedQty");
	}

	public void setQuoteEndDate(final Date quoteEndDate)
	{
		this.writeProperty("quoteEndDate", quoteEndDate);
	}

	public Date getQuoteEndDate()
	{
		return (Date) this.readProperty("quoteEndDate");
	}

	public void setQuoteStartDate(final Date quoteStartDate)
	{
		this.writeProperty("quoteStartDate", quoteStartDate);
	}

	public Date getQuoteStartDate()
	{
		return (Date) this.readProperty("quoteStartDate");
	}

	public void setRealTradingPrd(final String realTradingPrd)
	{
		this.writeProperty("realTradingPrd", realTradingPrd);
	}

	public String getRealTradingPrd()
	{
		return (String) this.readProperty("realTradingPrd");
	}

	public void setRiskTradingPrd(final String riskTradingPrd)
	{
		this.writeProperty("riskTradingPrd", riskTradingPrd);
	}

	public String getRiskTradingPrd()
	{
		return (String) this.readProperty("riskTradingPrd");
	}

	public void setTotalQty(final Double totalQty)
	{
		this.writeProperty("totalQty", totalQty);
	}

	public Double getTotalQty()
	{
		return (Double) this.readProperty("totalQty");
	}

	public void setTransId(final Integer transId)
	{
		this.writeProperty("transId", transId);
	}

	public Integer getTransId()
	{
		return (Integer) this.readProperty("transId");
	}

	public void setCalendar(final Calendar calendar)
	{
		this.setToOneTarget("calendar", calendar, true);
	}

	public Calendar getCalendar()
	{
		return (Calendar) this.readProperty("calendar");
	}

	public void setUom(final Uom uom)
	{
		this.setToOneTarget("uom", uom, true);
	}

	public Uom getUom()
	{
		return (Uom) this.readProperty("uom");
	}

	public void setUom1(final Uom uom1)
	{
		this.setToOneTarget("uom1", uom1, true);
	}

	public Uom getUom1()
	{
		return (Uom) this.readProperty("uom1");
	}

}