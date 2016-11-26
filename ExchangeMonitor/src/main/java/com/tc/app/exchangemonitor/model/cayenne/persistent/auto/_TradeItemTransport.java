package com.tc.app.exchangemonitor.model.cayenne.persistent.auto;

import java.math.BigDecimal;
import java.util.Date;

import org.apache.cayenne.CayenneDataObject;
import org.apache.cayenne.exp.Property;

import com.tc.app.exchangemonitor.model.cayenne.persistent.Commodity;
import com.tc.app.exchangemonitor.model.cayenne.persistent.CreditTerm;
import com.tc.app.exchangemonitor.model.cayenne.persistent.PaymentTerm;
import com.tc.app.exchangemonitor.model.cayenne.persistent.PipelineCycle;
import com.tc.app.exchangemonitor.model.cayenne.persistent.Uom;

/**
 * Class _TradeItemTransport was generated by Cayenne.
 * It is probably a good idea to avoid changing this class manually,
 * since it may be overwritten next time code is regenerated.
 * If you need to make any customizations, please use subclass.
 */
public abstract class _TradeItemTransport extends CayenneDataObject
{

	private static final long serialVersionUID = 1L;

	public static final String ITEM_NUM_PK_COLUMN = "item_num";
	public static final String ORDER_NUM_PK_COLUMN = "order_num";
	public static final String TRADE_NUM_PK_COLUMN = "trade_num";

	public static final Property<BigDecimal> CAPACITY = new Property<BigDecimal>("capacity");
	public static final Property<String> CONTAINER_IND = new Property<String>("containerInd");
	public static final Property<String> DEL_LOC_CODE = new Property<String>("delLocCode");
	public static final Property<String> DEMURRAGE_PERIODICITY = new Property<String>("demurragePeriodicity");
	public static final Property<Double> DEMURRAGE_PRICE = new Property<Double>("demurragePrice");
	public static final Property<Date> DISCH_DATE_FROM = new Property<Date>("dischDateFrom");
	public static final Property<Date> DISCH_DATE_TO = new Property<Date>("dischDateTo");
	public static final Property<String> DISPATCH_PERIODICITY = new Property<String>("dispatchPeriodicity");
	public static final Property<Double> DISPATCH_PRICE = new Property<Double>("dispatchPrice");
	public static final Property<Short> FREE_TIME = new Property<Short>("freeTime");
	public static final Property<String> FREE_TIME_UOM_CODE = new Property<String>("freeTimeUomCode");
	public static final Property<BigDecimal> HEEL = new Property<BigDecimal>("heel");
	public static final Property<Date> LOAD_DATE_FROM = new Property<Date>("loadDateFrom");
	public static final Property<Date> LOAD_DATE_TO = new Property<Date>("loadDateTo");
	public static final Property<String> LOAD_LOC_CODE = new Property<String>("loadLocCode");
	public static final Property<Double> LOSS_ALLOWANCE_QTY = new Property<Double>("lossAllowanceQty");
	public static final Property<Double> MAX_QTY = new Property<Double>("maxQty");
	public static final Property<BigDecimal> MIN_OP_REQ_QTY = new Property<BigDecimal>("minOpReqQty");
	public static final Property<Double> MIN_QTY = new Property<Double>("minQty");
	public static final Property<Double> MIN_SHIP_QTY = new Property<Double>("minShipQty");
	public static final Property<String> MOT_CODE = new Property<String>("motCode");
	public static final Property<Integer> NUMBER_OF_TRUCKS = new Property<Integer>("numberOfTrucks");
	public static final Property<Double> OVERRUN_PRICE = new Property<Double>("overrunPrice");
	public static final Property<Integer> PAY_DAYS = new Property<Integer>("payDays");
	public static final Property<Double> PUMP_RATE_QTY = new Property<Double>("pumpRateQty");
	public static final Property<String> PUMP_RATE_TIME_UOM_CODE = new Property<String>("pumpRateTimeUomCode");
	public static final Property<BigDecimal> SAFE_FILL = new Property<BigDecimal>("safeFill");
	public static final Property<Double> SHRINKAGE_QTY = new Property<Double>("shrinkageQty");
	public static final Property<Integer> TANK_NUM = new Property<Integer>("tankNum");
	public static final Property<BigDecimal> TARGET_MAX_QTY = new Property<BigDecimal>("targetMaxQty");
	public static final Property<BigDecimal> TARGET_MIN_QTY = new Property<BigDecimal>("targetMinQty");
	public static final Property<Short> TIMING_CYCLE_YEAR = new Property<Short>("timingCycleYear");
	public static final Property<Double> TOL_QTY = new Property<Double>("tolQty");
	public static final Property<String> TOL_SIGN = new Property<String>("tolSign");
	public static final Property<Integer> TRANS_ID = new Property<Integer>("transId");
	public static final Property<String> TRANSPORTATION = new Property<String>("transportation");
	public static final Property<Commodity> COMMODITY = new Property<Commodity>("commodity");
	public static final Property<Commodity> COMMODITY1 = new Property<Commodity>("commodity1");
	public static final Property<Commodity> COMMODITY2 = new Property<Commodity>("commodity2");
	public static final Property<Commodity> COMMODITY3 = new Property<Commodity>("commodity3");
	public static final Property<CreditTerm> CREDIT_TERM = new Property<CreditTerm>("creditTerm");
	public static final Property<PaymentTerm> PAYMENT_TERM = new Property<PaymentTerm>("paymentTerm");
	public static final Property<PipelineCycle> PIPELINE_CYCLE = new Property<PipelineCycle>("pipelineCycle");
	public static final Property<Uom> UOM = new Property<Uom>("uom");
	public static final Property<Uom> UOM1 = new Property<Uom>("uom1");
	public static final Property<Uom> UOM2 = new Property<Uom>("uom2");
	public static final Property<Uom> UOM3 = new Property<Uom>("uom3");
	public static final Property<Uom> UOM4 = new Property<Uom>("uom4");
	public static final Property<Uom> UOM5 = new Property<Uom>("uom5");
	public static final Property<Uom> UOM6 = new Property<Uom>("uom6");
	public static final Property<Uom> UOM7 = new Property<Uom>("uom7");

	public void setCapacity(BigDecimal capacity)
	{
		writeProperty("capacity", capacity);
	}

	public BigDecimal getCapacity()
	{
		return (BigDecimal) readProperty("capacity");
	}

	public void setContainerInd(String containerInd)
	{
		writeProperty("containerInd", containerInd);
	}

	public String getContainerInd()
	{
		return (String) readProperty("containerInd");
	}

	public void setDelLocCode(String delLocCode)
	{
		writeProperty("delLocCode", delLocCode);
	}

	public String getDelLocCode()
	{
		return (String) readProperty("delLocCode");
	}

	public void setDemurragePeriodicity(String demurragePeriodicity)
	{
		writeProperty("demurragePeriodicity", demurragePeriodicity);
	}

	public String getDemurragePeriodicity()
	{
		return (String) readProperty("demurragePeriodicity");
	}

	public void setDemurragePrice(Double demurragePrice)
	{
		writeProperty("demurragePrice", demurragePrice);
	}

	public Double getDemurragePrice()
	{
		return (Double) readProperty("demurragePrice");
	}

	public void setDischDateFrom(Date dischDateFrom)
	{
		writeProperty("dischDateFrom", dischDateFrom);
	}

	public Date getDischDateFrom()
	{
		return (Date) readProperty("dischDateFrom");
	}

	public void setDischDateTo(Date dischDateTo)
	{
		writeProperty("dischDateTo", dischDateTo);
	}

	public Date getDischDateTo()
	{
		return (Date) readProperty("dischDateTo");
	}

	public void setDispatchPeriodicity(String dispatchPeriodicity)
	{
		writeProperty("dispatchPeriodicity", dispatchPeriodicity);
	}

	public String getDispatchPeriodicity()
	{
		return (String) readProperty("dispatchPeriodicity");
	}

	public void setDispatchPrice(Double dispatchPrice)
	{
		writeProperty("dispatchPrice", dispatchPrice);
	}

	public Double getDispatchPrice()
	{
		return (Double) readProperty("dispatchPrice");
	}

	public void setFreeTime(Short freeTime)
	{
		writeProperty("freeTime", freeTime);
	}

	public Short getFreeTime()
	{
		return (Short) readProperty("freeTime");
	}

	public void setFreeTimeUomCode(String freeTimeUomCode)
	{
		writeProperty("freeTimeUomCode", freeTimeUomCode);
	}

	public String getFreeTimeUomCode()
	{
		return (String) readProperty("freeTimeUomCode");
	}

	public void setHeel(BigDecimal heel)
	{
		writeProperty("heel", heel);
	}

	public BigDecimal getHeel()
	{
		return (BigDecimal) readProperty("heel");
	}

	public void setLoadDateFrom(Date loadDateFrom)
	{
		writeProperty("loadDateFrom", loadDateFrom);
	}

	public Date getLoadDateFrom()
	{
		return (Date) readProperty("loadDateFrom");
	}

	public void setLoadDateTo(Date loadDateTo)
	{
		writeProperty("loadDateTo", loadDateTo);
	}

	public Date getLoadDateTo()
	{
		return (Date) readProperty("loadDateTo");
	}

	public void setLoadLocCode(String loadLocCode)
	{
		writeProperty("loadLocCode", loadLocCode);
	}

	public String getLoadLocCode()
	{
		return (String) readProperty("loadLocCode");
	}

	public void setLossAllowanceQty(Double lossAllowanceQty)
	{
		writeProperty("lossAllowanceQty", lossAllowanceQty);
	}

	public Double getLossAllowanceQty()
	{
		return (Double) readProperty("lossAllowanceQty");
	}

	public void setMaxQty(Double maxQty)
	{
		writeProperty("maxQty", maxQty);
	}

	public Double getMaxQty()
	{
		return (Double) readProperty("maxQty");
	}

	public void setMinOpReqQty(BigDecimal minOpReqQty)
	{
		writeProperty("minOpReqQty", minOpReqQty);
	}

	public BigDecimal getMinOpReqQty()
	{
		return (BigDecimal) readProperty("minOpReqQty");
	}

	public void setMinQty(Double minQty)
	{
		writeProperty("minQty", minQty);
	}

	public Double getMinQty()
	{
		return (Double) readProperty("minQty");
	}

	public void setMinShipQty(Double minShipQty)
	{
		writeProperty("minShipQty", minShipQty);
	}

	public Double getMinShipQty()
	{
		return (Double) readProperty("minShipQty");
	}

	public void setMotCode(String motCode)
	{
		writeProperty("motCode", motCode);
	}

	public String getMotCode()
	{
		return (String) readProperty("motCode");
	}

	public void setNumberOfTrucks(Integer numberOfTrucks)
	{
		writeProperty("numberOfTrucks", numberOfTrucks);
	}

	public Integer getNumberOfTrucks()
	{
		return (Integer) readProperty("numberOfTrucks");
	}

	public void setOverrunPrice(Double overrunPrice)
	{
		writeProperty("overrunPrice", overrunPrice);
	}

	public Double getOverrunPrice()
	{
		return (Double) readProperty("overrunPrice");
	}

	public void setPayDays(Integer payDays)
	{
		writeProperty("payDays", payDays);
	}

	public Integer getPayDays()
	{
		return (Integer) readProperty("payDays");
	}

	public void setPumpRateQty(Double pumpRateQty)
	{
		writeProperty("pumpRateQty", pumpRateQty);
	}

	public Double getPumpRateQty()
	{
		return (Double) readProperty("pumpRateQty");
	}

	public void setPumpRateTimeUomCode(String pumpRateTimeUomCode)
	{
		writeProperty("pumpRateTimeUomCode", pumpRateTimeUomCode);
	}

	public String getPumpRateTimeUomCode()
	{
		return (String) readProperty("pumpRateTimeUomCode");
	}

	public void setSafeFill(BigDecimal safeFill)
	{
		writeProperty("safeFill", safeFill);
	}

	public BigDecimal getSafeFill()
	{
		return (BigDecimal) readProperty("safeFill");
	}

	public void setShrinkageQty(Double shrinkageQty)
	{
		writeProperty("shrinkageQty", shrinkageQty);
	}

	public Double getShrinkageQty()
	{
		return (Double) readProperty("shrinkageQty");
	}

	public void setTankNum(Integer tankNum)
	{
		writeProperty("tankNum", tankNum);
	}

	public Integer getTankNum()
	{
		return (Integer) readProperty("tankNum");
	}

	public void setTargetMaxQty(BigDecimal targetMaxQty)
	{
		writeProperty("targetMaxQty", targetMaxQty);
	}

	public BigDecimal getTargetMaxQty()
	{
		return (BigDecimal) readProperty("targetMaxQty");
	}

	public void setTargetMinQty(BigDecimal targetMinQty)
	{
		writeProperty("targetMinQty", targetMinQty);
	}

	public BigDecimal getTargetMinQty()
	{
		return (BigDecimal) readProperty("targetMinQty");
	}

	public void setTimingCycleYear(Short timingCycleYear)
	{
		writeProperty("timingCycleYear", timingCycleYear);
	}

	public Short getTimingCycleYear()
	{
		return (Short) readProperty("timingCycleYear");
	}

	public void setTolQty(Double tolQty)
	{
		writeProperty("tolQty", tolQty);
	}

	public Double getTolQty()
	{
		return (Double) readProperty("tolQty");
	}

	public void setTolSign(String tolSign)
	{
		writeProperty("tolSign", tolSign);
	}

	public String getTolSign()
	{
		return (String) readProperty("tolSign");
	}

	public void setTransId(Integer transId)
	{
		writeProperty("transId", transId);
	}

	public Integer getTransId()
	{
		return (Integer) readProperty("transId");
	}

	public void setTransportation(String transportation)
	{
		writeProperty("transportation", transportation);
	}

	public String getTransportation()
	{
		return (String) readProperty("transportation");
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

	public void setCommodity3(Commodity commodity3)
	{
		setToOneTarget("commodity3", commodity3, true);
	}

	public Commodity getCommodity3()
	{
		return (Commodity) readProperty("commodity3");
	}

	public void setCreditTerm(CreditTerm creditTerm)
	{
		setToOneTarget("creditTerm", creditTerm, true);
	}

	public CreditTerm getCreditTerm()
	{
		return (CreditTerm) readProperty("creditTerm");
	}

	public void setPaymentTerm(PaymentTerm paymentTerm)
	{
		setToOneTarget("paymentTerm", paymentTerm, true);
	}

	public PaymentTerm getPaymentTerm()
	{
		return (PaymentTerm) readProperty("paymentTerm");
	}

	public void setPipelineCycle(PipelineCycle pipelineCycle)
	{
		setToOneTarget("pipelineCycle", pipelineCycle, true);
	}

	public PipelineCycle getPipelineCycle()
	{
		return (PipelineCycle) readProperty("pipelineCycle");
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

	public void setUom2(Uom uom2)
	{
		setToOneTarget("uom2", uom2, true);
	}

	public Uom getUom2()
	{
		return (Uom) readProperty("uom2");
	}

	public void setUom3(Uom uom3)
	{
		setToOneTarget("uom3", uom3, true);
	}

	public Uom getUom3()
	{
		return (Uom) readProperty("uom3");
	}

	public void setUom4(Uom uom4)
	{
		setToOneTarget("uom4", uom4, true);
	}

	public Uom getUom4()
	{
		return (Uom) readProperty("uom4");
	}

	public void setUom5(Uom uom5)
	{
		setToOneTarget("uom5", uom5, true);
	}

	public Uom getUom5()
	{
		return (Uom) readProperty("uom5");
	}

	public void setUom6(Uom uom6)
	{
		setToOneTarget("uom6", uom6, true);
	}

	public Uom getUom6()
	{
		return (Uom) readProperty("uom6");
	}

	public void setUom7(Uom uom7)
	{
		setToOneTarget("uom7", uom7, true);
	}

	public Uom getUom7()
	{
		return (Uom) readProperty("uom7");
	}

}
