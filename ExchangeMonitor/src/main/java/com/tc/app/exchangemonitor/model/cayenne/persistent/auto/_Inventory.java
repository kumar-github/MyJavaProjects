package com.tc.app.exchangemonitor.model.cayenne.persistent.auto;

import java.math.BigDecimal;
import java.util.Date;
import java.util.List;

import org.apache.cayenne.CayenneDataObject;
import org.apache.cayenne.exp.Property;

import com.tc.app.exchangemonitor.model.cayenne.persistent.Commodity;
import com.tc.app.exchangemonitor.model.cayenne.persistent.InvActual;
import com.tc.app.exchangemonitor.model.cayenne.persistent.InvPricingPeriod;
import com.tc.app.exchangemonitor.model.cayenne.persistent.Location;
import com.tc.app.exchangemonitor.model.cayenne.persistent.Market;
import com.tc.app.exchangemonitor.model.cayenne.persistent.Uom;

/**
 * Class _Inventory was generated by Cayenne.
 * It is probably a good idea to avoid changing this class manually,
 * since it may be overwritten next time code is regenerated.
 * If you need to make any customizations, please use subclass.
 */
public abstract class _Inventory extends CayenneDataObject
{

	private static final long serialVersionUID = 1L;

	public static final String INV_NUM_PK_COLUMN = "inv_num";

	public static final Property<String> BALANCE_PERIOD = new Property<>("balancePeriod");
	public static final Property<Integer> CMNT_NUM = new Property<>("cmntNum");
	public static final Property<Double> FIFO_OPEN_QTY = new Property<>("fifoOpenQty");
	public static final Property<String> FIFO_OPEN_QTY_UOM_CODE = new Property<>("fifoOpenQtyUomCode");
	public static final Property<Double> INV_ADJ_QTY = new Property<>("invAdjQty");
	public static final Property<Double> INV_ADJ_SEC_QTY = new Property<>("invAdjSecQty");
	public static final Property<Double> INV_AVG_COST = new Property<>("invAvgCost");
	public static final Property<Date> INV_BAL_FROM_DATE = new Property<>("invBalFromDate");
	public static final Property<BigDecimal> INV_BAL_QTY = new Property<>("invBalQty");
	public static final Property<BigDecimal> INV_BAL_SEC_QTY = new Property<>("invBalSecQty");
	public static final Property<Date> INV_BAL_TO_DATE = new Property<>("invBalToDate");
	public static final Property<BigDecimal> INV_CAPACITY = new Property<>("invCapacity");
	public static final Property<Double> INV_CNFRMD_QTY = new Property<>("invCnfrmdQty");
	public static final Property<Double> INV_CNFRMD_SEC_QTY = new Property<>("invCnfrmdSecQty");
	public static final Property<Integer> INV_CREDIT_EXPOSURE_OID = new Property<>("invCreditExposureOid");
	public static final Property<Double> INV_CURR_ACTUAL_QTY = new Property<>("invCurrActualQty");
	public static final Property<Double> INV_CURR_ACTUAL_SEC_QTY = new Property<>("invCurrActualSecQty");
	public static final Property<Double> INV_CURR_PROJ_QTY = new Property<>("invCurrProjQty");
	public static final Property<Double> INV_CURR_PROJ_SEC_QTY = new Property<>("invCurrProjSecQty");
	public static final Property<Double> INV_DLVRY_ACTUAL_QTY = new Property<>("invDlvryActualQty");
	public static final Property<Double> INV_DLVRY_ACTUAL_SEC_QTY = new Property<>("invDlvryActualSecQty");
	public static final Property<Double> INV_DLVRY_PROJ_QTY = new Property<>("invDlvryProjQty");
	public static final Property<Double> INV_DLVRY_PROJ_SEC_QTY = new Property<>("invDlvryProjSecQty");
	public static final Property<BigDecimal> INV_FIFO_COST = new Property<>("invFifoCost");
	public static final Property<Integer> INV_FIFO_NUM = new Property<>("invFifoNum");
	public static final Property<BigDecimal> INV_HEEL = new Property<>("invHeel");
	public static final Property<Integer> INV_LOOP_NUM = new Property<>("invLoopNum");
	public static final Property<BigDecimal> INV_MAC_COST = new Property<>("invMacCost");
	public static final Property<BigDecimal> INV_MAC_INSERT_COST = new Property<>("invMacInsertCost");
	public static final Property<BigDecimal> INV_MIN_OP_REQ_QTY = new Property<>("invMinOpReqQty");
	public static final Property<Double> INV_OPEN_PRD_ACTUAL_QTY = new Property<>("invOpenPrdActualQty");
	public static final Property<Double> INV_OPEN_PRD_ACTUAL_SEC_QTY = new Property<>("invOpenPrdActualSecQty");
	public static final Property<Double> INV_OPEN_PRD_PROJ_QTY = new Property<>("invOpenPrdProjQty");
	public static final Property<Double> INV_OPEN_PRD_PROJ_SEC_QTY = new Property<>("invOpenPrdProjSecQty");
	public static final Property<String> INV_PRICING_TYPE = new Property<>("invPricingType");
	public static final Property<Double> INV_RCPT_ACTUAL_QTY = new Property<>("invRcptActualQty");
	public static final Property<Double> INV_RCPT_ACTUAL_SEC_QTY = new Property<>("invRcptActualSecQty");
	public static final Property<Double> INV_RCPT_PROJ_QTY = new Property<>("invRcptProjQty");
	public static final Property<Double> INV_RCPT_PROJ_SEC_QTY = new Property<>("invRcptProjSecQty");
	public static final Property<BigDecimal> INV_SAFE_FILL = new Property<>("invSafeFill");
	public static final Property<BigDecimal> INV_TARGET_MAX_QTY = new Property<>("invTargetMaxQty");
	public static final Property<BigDecimal> INV_TARGET_MIN_QTY = new Property<>("invTargetMinQty");
	public static final Property<String> INV_TYPE = new Property<>("invType");
	public static final Property<Double> INV_WACOG_COST = new Property<>("invWacogCost");
	public static final Property<Double> LINE_FILL_QTY = new Property<>("lineFillQty");
	public static final Property<BigDecimal> MAC_INV_AMT = new Property<>("macInvAmt");
	public static final Property<String> NEEDS_REPRICING = new Property<>("needsRepricing");
	public static final Property<Integer> NEXT_INV_NUM = new Property<>("nextInvNum");
	public static final Property<String> OPEN_CLOSE_IND = new Property<>("openCloseInd");
	public static final Property<Short> ORDER_NUM = new Property<>("orderNum");
	public static final Property<Integer> PORT_NUM = new Property<>("portNum");
	public static final Property<Integer> POS_NUM = new Property<>("posNum");
	public static final Property<Integer> PREV_INV_NUM = new Property<>("prevInvNum");
	public static final Property<Double> R_INV_AVG_COST_AMT = new Property<>("rInvAvgCostAmt");
	public static final Property<String> ROLL_AT_MKT_PRICE_IND = new Property<>("rollAtMktPriceInd");
	public static final Property<Short> SALE_ITEM_NUM = new Property<>("saleItemNum");
	public static final Property<Double> SEC_FIFO_OPEN_QTY = new Property<>("secFifoOpenQty");
	public static final Property<String> SEC_FIFO_OPEN_QTY_UOM_CODE = new Property<>("secFifoOpenQtyUomCode");
	public static final Property<String> STORAGE_SUBLOC_NAME = new Property<>("storageSublocName");
	public static final Property<Integer> TRADE_NUM = new Property<>("tradeNum");
	public static final Property<Integer> TRANS_ID = new Property<>("transId");
	public static final Property<Double> UNR_INV_AVG_COST_AMT = new Property<>("unrInvAvgCostAmt");
	public static final Property<Boolean> USE_MTM = new Property<>("useMtm");
	public static final Property<Commodity> COMMODITY = new Property<>("commodity");
	public static final Property<Commodity> COMMODITY1 = new Property<>("commodity1");
	public static final Property<Commodity> COMMODITY2 = new Property<>("commodity2");
	public static final Property<Commodity> COMMODITY3 = new Property<>("commodity3");
	public static final Property<List<InvActual>> INV_ACTUALS = new Property<>("invActuals");
	public static final Property<InvPricingPeriod> INVENTORY = new Property<>("inventory");
	public static final Property<Location> LOCATION = new Property<>("location");
	public static final Property<Market> MARKET = new Property<>("market");
	public static final Property<Market> MARKET1 = new Property<>("market1");
	public static final Property<Uom> UOM = new Property<>("uom");
	public static final Property<Uom> UOM1 = new Property<>("uom1");
	public static final Property<Uom> UOM2 = new Property<>("uom2");

	public void setBalancePeriod(final String balancePeriod)
	{
		this.writeProperty("balancePeriod", balancePeriod);
	}

	public String getBalancePeriod()
	{
		return (String) this.readProperty("balancePeriod");
	}

	public void setCmntNum(final Integer cmntNum)
	{
		this.writeProperty("cmntNum", cmntNum);
	}

	public Integer getCmntNum()
	{
		return (Integer) this.readProperty("cmntNum");
	}

	public void setFifoOpenQty(final Double fifoOpenQty)
	{
		this.writeProperty("fifoOpenQty", fifoOpenQty);
	}

	public Double getFifoOpenQty()
	{
		return (Double) this.readProperty("fifoOpenQty");
	}

	public void setFifoOpenQtyUomCode(final String fifoOpenQtyUomCode)
	{
		this.writeProperty("fifoOpenQtyUomCode", fifoOpenQtyUomCode);
	}

	public String getFifoOpenQtyUomCode()
	{
		return (String) this.readProperty("fifoOpenQtyUomCode");
	}

	public void setInvAdjQty(final Double invAdjQty)
	{
		this.writeProperty("invAdjQty", invAdjQty);
	}

	public Double getInvAdjQty()
	{
		return (Double) this.readProperty("invAdjQty");
	}

	public void setInvAdjSecQty(final Double invAdjSecQty)
	{
		this.writeProperty("invAdjSecQty", invAdjSecQty);
	}

	public Double getInvAdjSecQty()
	{
		return (Double) this.readProperty("invAdjSecQty");
	}

	public void setInvAvgCost(final Double invAvgCost)
	{
		this.writeProperty("invAvgCost", invAvgCost);
	}

	public Double getInvAvgCost()
	{
		return (Double) this.readProperty("invAvgCost");
	}

	public void setInvBalFromDate(final Date invBalFromDate)
	{
		this.writeProperty("invBalFromDate", invBalFromDate);
	}

	public Date getInvBalFromDate()
	{
		return (Date) this.readProperty("invBalFromDate");
	}

	public void setInvBalQty(final BigDecimal invBalQty)
	{
		this.writeProperty("invBalQty", invBalQty);
	}

	public BigDecimal getInvBalQty()
	{
		return (BigDecimal) this.readProperty("invBalQty");
	}

	public void setInvBalSecQty(final BigDecimal invBalSecQty)
	{
		this.writeProperty("invBalSecQty", invBalSecQty);
	}

	public BigDecimal getInvBalSecQty()
	{
		return (BigDecimal) this.readProperty("invBalSecQty");
	}

	public void setInvBalToDate(final Date invBalToDate)
	{
		this.writeProperty("invBalToDate", invBalToDate);
	}

	public Date getInvBalToDate()
	{
		return (Date) this.readProperty("invBalToDate");
	}

	public void setInvCapacity(final BigDecimal invCapacity)
	{
		this.writeProperty("invCapacity", invCapacity);
	}

	public BigDecimal getInvCapacity()
	{
		return (BigDecimal) this.readProperty("invCapacity");
	}

	public void setInvCnfrmdQty(final Double invCnfrmdQty)
	{
		this.writeProperty("invCnfrmdQty", invCnfrmdQty);
	}

	public Double getInvCnfrmdQty()
	{
		return (Double) this.readProperty("invCnfrmdQty");
	}

	public void setInvCnfrmdSecQty(final Double invCnfrmdSecQty)
	{
		this.writeProperty("invCnfrmdSecQty", invCnfrmdSecQty);
	}

	public Double getInvCnfrmdSecQty()
	{
		return (Double) this.readProperty("invCnfrmdSecQty");
	}

	public void setInvCreditExposureOid(final Integer invCreditExposureOid)
	{
		this.writeProperty("invCreditExposureOid", invCreditExposureOid);
	}

	public Integer getInvCreditExposureOid()
	{
		return (Integer) this.readProperty("invCreditExposureOid");
	}

	public void setInvCurrActualQty(final Double invCurrActualQty)
	{
		this.writeProperty("invCurrActualQty", invCurrActualQty);
	}

	public Double getInvCurrActualQty()
	{
		return (Double) this.readProperty("invCurrActualQty");
	}

	public void setInvCurrActualSecQty(final Double invCurrActualSecQty)
	{
		this.writeProperty("invCurrActualSecQty", invCurrActualSecQty);
	}

	public Double getInvCurrActualSecQty()
	{
		return (Double) this.readProperty("invCurrActualSecQty");
	}

	public void setInvCurrProjQty(final Double invCurrProjQty)
	{
		this.writeProperty("invCurrProjQty", invCurrProjQty);
	}

	public Double getInvCurrProjQty()
	{
		return (Double) this.readProperty("invCurrProjQty");
	}

	public void setInvCurrProjSecQty(final Double invCurrProjSecQty)
	{
		this.writeProperty("invCurrProjSecQty", invCurrProjSecQty);
	}

	public Double getInvCurrProjSecQty()
	{
		return (Double) this.readProperty("invCurrProjSecQty");
	}

	public void setInvDlvryActualQty(final Double invDlvryActualQty)
	{
		this.writeProperty("invDlvryActualQty", invDlvryActualQty);
	}

	public Double getInvDlvryActualQty()
	{
		return (Double) this.readProperty("invDlvryActualQty");
	}

	public void setInvDlvryActualSecQty(final Double invDlvryActualSecQty)
	{
		this.writeProperty("invDlvryActualSecQty", invDlvryActualSecQty);
	}

	public Double getInvDlvryActualSecQty()
	{
		return (Double) this.readProperty("invDlvryActualSecQty");
	}

	public void setInvDlvryProjQty(final Double invDlvryProjQty)
	{
		this.writeProperty("invDlvryProjQty", invDlvryProjQty);
	}

	public Double getInvDlvryProjQty()
	{
		return (Double) this.readProperty("invDlvryProjQty");
	}

	public void setInvDlvryProjSecQty(final Double invDlvryProjSecQty)
	{
		this.writeProperty("invDlvryProjSecQty", invDlvryProjSecQty);
	}

	public Double getInvDlvryProjSecQty()
	{
		return (Double) this.readProperty("invDlvryProjSecQty");
	}

	public void setInvFifoCost(final BigDecimal invFifoCost)
	{
		this.writeProperty("invFifoCost", invFifoCost);
	}

	public BigDecimal getInvFifoCost()
	{
		return (BigDecimal) this.readProperty("invFifoCost");
	}

	public void setInvFifoNum(final Integer invFifoNum)
	{
		this.writeProperty("invFifoNum", invFifoNum);
	}

	public Integer getInvFifoNum()
	{
		return (Integer) this.readProperty("invFifoNum");
	}

	public void setInvHeel(final BigDecimal invHeel)
	{
		this.writeProperty("invHeel", invHeel);
	}

	public BigDecimal getInvHeel()
	{
		return (BigDecimal) this.readProperty("invHeel");
	}

	public void setInvLoopNum(final Integer invLoopNum)
	{
		this.writeProperty("invLoopNum", invLoopNum);
	}

	public Integer getInvLoopNum()
	{
		return (Integer) this.readProperty("invLoopNum");
	}

	public void setInvMacCost(final BigDecimal invMacCost)
	{
		this.writeProperty("invMacCost", invMacCost);
	}

	public BigDecimal getInvMacCost()
	{
		return (BigDecimal) this.readProperty("invMacCost");
	}

	public void setInvMacInsertCost(final BigDecimal invMacInsertCost)
	{
		this.writeProperty("invMacInsertCost", invMacInsertCost);
	}

	public BigDecimal getInvMacInsertCost()
	{
		return (BigDecimal) this.readProperty("invMacInsertCost");
	}

	public void setInvMinOpReqQty(final BigDecimal invMinOpReqQty)
	{
		this.writeProperty("invMinOpReqQty", invMinOpReqQty);
	}

	public BigDecimal getInvMinOpReqQty()
	{
		return (BigDecimal) this.readProperty("invMinOpReqQty");
	}

	public void setInvOpenPrdActualQty(final Double invOpenPrdActualQty)
	{
		this.writeProperty("invOpenPrdActualQty", invOpenPrdActualQty);
	}

	public Double getInvOpenPrdActualQty()
	{
		return (Double) this.readProperty("invOpenPrdActualQty");
	}

	public void setInvOpenPrdActualSecQty(final Double invOpenPrdActualSecQty)
	{
		this.writeProperty("invOpenPrdActualSecQty", invOpenPrdActualSecQty);
	}

	public Double getInvOpenPrdActualSecQty()
	{
		return (Double) this.readProperty("invOpenPrdActualSecQty");
	}

	public void setInvOpenPrdProjQty(final Double invOpenPrdProjQty)
	{
		this.writeProperty("invOpenPrdProjQty", invOpenPrdProjQty);
	}

	public Double getInvOpenPrdProjQty()
	{
		return (Double) this.readProperty("invOpenPrdProjQty");
	}

	public void setInvOpenPrdProjSecQty(final Double invOpenPrdProjSecQty)
	{
		this.writeProperty("invOpenPrdProjSecQty", invOpenPrdProjSecQty);
	}

	public Double getInvOpenPrdProjSecQty()
	{
		return (Double) this.readProperty("invOpenPrdProjSecQty");
	}

	public void setInvPricingType(final String invPricingType)
	{
		this.writeProperty("invPricingType", invPricingType);
	}

	public String getInvPricingType()
	{
		return (String) this.readProperty("invPricingType");
	}

	public void setInvRcptActualQty(final Double invRcptActualQty)
	{
		this.writeProperty("invRcptActualQty", invRcptActualQty);
	}

	public Double getInvRcptActualQty()
	{
		return (Double) this.readProperty("invRcptActualQty");
	}

	public void setInvRcptActualSecQty(final Double invRcptActualSecQty)
	{
		this.writeProperty("invRcptActualSecQty", invRcptActualSecQty);
	}

	public Double getInvRcptActualSecQty()
	{
		return (Double) this.readProperty("invRcptActualSecQty");
	}

	public void setInvRcptProjQty(final Double invRcptProjQty)
	{
		this.writeProperty("invRcptProjQty", invRcptProjQty);
	}

	public Double getInvRcptProjQty()
	{
		return (Double) this.readProperty("invRcptProjQty");
	}

	public void setInvRcptProjSecQty(final Double invRcptProjSecQty)
	{
		this.writeProperty("invRcptProjSecQty", invRcptProjSecQty);
	}

	public Double getInvRcptProjSecQty()
	{
		return (Double) this.readProperty("invRcptProjSecQty");
	}

	public void setInvSafeFill(final BigDecimal invSafeFill)
	{
		this.writeProperty("invSafeFill", invSafeFill);
	}

	public BigDecimal getInvSafeFill()
	{
		return (BigDecimal) this.readProperty("invSafeFill");
	}

	public void setInvTargetMaxQty(final BigDecimal invTargetMaxQty)
	{
		this.writeProperty("invTargetMaxQty", invTargetMaxQty);
	}

	public BigDecimal getInvTargetMaxQty()
	{
		return (BigDecimal) this.readProperty("invTargetMaxQty");
	}

	public void setInvTargetMinQty(final BigDecimal invTargetMinQty)
	{
		this.writeProperty("invTargetMinQty", invTargetMinQty);
	}

	public BigDecimal getInvTargetMinQty()
	{
		return (BigDecimal) this.readProperty("invTargetMinQty");
	}

	public void setInvType(final String invType)
	{
		this.writeProperty("invType", invType);
	}

	public String getInvType()
	{
		return (String) this.readProperty("invType");
	}

	public void setInvWacogCost(final Double invWacogCost)
	{
		this.writeProperty("invWacogCost", invWacogCost);
	}

	public Double getInvWacogCost()
	{
		return (Double) this.readProperty("invWacogCost");
	}

	public void setLineFillQty(final Double lineFillQty)
	{
		this.writeProperty("lineFillQty", lineFillQty);
	}

	public Double getLineFillQty()
	{
		return (Double) this.readProperty("lineFillQty");
	}

	public void setMacInvAmt(final BigDecimal macInvAmt)
	{
		this.writeProperty("macInvAmt", macInvAmt);
	}

	public BigDecimal getMacInvAmt()
	{
		return (BigDecimal) this.readProperty("macInvAmt");
	}

	public void setNeedsRepricing(final String needsRepricing)
	{
		this.writeProperty("needsRepricing", needsRepricing);
	}

	public String getNeedsRepricing()
	{
		return (String) this.readProperty("needsRepricing");
	}

	public void setNextInvNum(final Integer nextInvNum)
	{
		this.writeProperty("nextInvNum", nextInvNum);
	}

	public Integer getNextInvNum()
	{
		return (Integer) this.readProperty("nextInvNum");
	}

	public void setOpenCloseInd(final String openCloseInd)
	{
		this.writeProperty("openCloseInd", openCloseInd);
	}

	public String getOpenCloseInd()
	{
		return (String) this.readProperty("openCloseInd");
	}

	public void setOrderNum(final Short orderNum)
	{
		this.writeProperty("orderNum", orderNum);
	}

	public Short getOrderNum()
	{
		return (Short) this.readProperty("orderNum");
	}

	public void setPortNum(final Integer portNum)
	{
		this.writeProperty("portNum", portNum);
	}

	public Integer getPortNum()
	{
		return (Integer) this.readProperty("portNum");
	}

	public void setPosNum(final Integer posNum)
	{
		this.writeProperty("posNum", posNum);
	}

	public Integer getPosNum()
	{
		return (Integer) this.readProperty("posNum");
	}

	public void setPrevInvNum(final Integer prevInvNum)
	{
		this.writeProperty("prevInvNum", prevInvNum);
	}

	public Integer getPrevInvNum()
	{
		return (Integer) this.readProperty("prevInvNum");
	}

	public void setRInvAvgCostAmt(final Double rInvAvgCostAmt)
	{
		this.writeProperty("rInvAvgCostAmt", rInvAvgCostAmt);
	}

	public Double getRInvAvgCostAmt()
	{
		return (Double) this.readProperty("rInvAvgCostAmt");
	}

	public void setRollAtMktPriceInd(final String rollAtMktPriceInd)
	{
		this.writeProperty("rollAtMktPriceInd", rollAtMktPriceInd);
	}

	public String getRollAtMktPriceInd()
	{
		return (String) this.readProperty("rollAtMktPriceInd");
	}

	public void setSaleItemNum(final Short saleItemNum)
	{
		this.writeProperty("saleItemNum", saleItemNum);
	}

	public Short getSaleItemNum()
	{
		return (Short) this.readProperty("saleItemNum");
	}

	public void setSecFifoOpenQty(final Double secFifoOpenQty)
	{
		this.writeProperty("secFifoOpenQty", secFifoOpenQty);
	}

	public Double getSecFifoOpenQty()
	{
		return (Double) this.readProperty("secFifoOpenQty");
	}

	public void setSecFifoOpenQtyUomCode(final String secFifoOpenQtyUomCode)
	{
		this.writeProperty("secFifoOpenQtyUomCode", secFifoOpenQtyUomCode);
	}

	public String getSecFifoOpenQtyUomCode()
	{
		return (String) this.readProperty("secFifoOpenQtyUomCode");
	}

	public void setStorageSublocName(final String storageSublocName)
	{
		this.writeProperty("storageSublocName", storageSublocName);
	}

	public String getStorageSublocName()
	{
		return (String) this.readProperty("storageSublocName");
	}

	public void setTradeNum(final Integer tradeNum)
	{
		this.writeProperty("tradeNum", tradeNum);
	}

	public Integer getTradeNum()
	{
		return (Integer) this.readProperty("tradeNum");
	}

	public void setTransId(final Integer transId)
	{
		this.writeProperty("transId", transId);
	}

	public Integer getTransId()
	{
		return (Integer) this.readProperty("transId");
	}

	public void setUnrInvAvgCostAmt(final Double unrInvAvgCostAmt)
	{
		this.writeProperty("unrInvAvgCostAmt", unrInvAvgCostAmt);
	}

	public Double getUnrInvAvgCostAmt()
	{
		return (Double) this.readProperty("unrInvAvgCostAmt");
	}

	public void setUseMtm(final Boolean useMtm)
	{
		this.writeProperty("useMtm", useMtm);
	}

	public Boolean getUseMtm()
	{
		return (Boolean) this.readProperty("useMtm");
	}

	public void setCommodity(final Commodity commodity)
	{
		this.setToOneTarget("commodity", commodity, true);
	}

	public Commodity getCommodity()
	{
		return (Commodity) this.readProperty("commodity");
	}

	public void setCommodity1(final Commodity commodity1)
	{
		this.setToOneTarget("commodity1", commodity1, true);
	}

	public Commodity getCommodity1()
	{
		return (Commodity) this.readProperty("commodity1");
	}

	public void setCommodity2(final Commodity commodity2)
	{
		this.setToOneTarget("commodity2", commodity2, true);
	}

	public Commodity getCommodity2()
	{
		return (Commodity) this.readProperty("commodity2");
	}

	public void setCommodity3(final Commodity commodity3)
	{
		this.setToOneTarget("commodity3", commodity3, true);
	}

	public Commodity getCommodity3()
	{
		return (Commodity) this.readProperty("commodity3");
	}

	public void addToInvActuals(final InvActual obj)
	{
		this.addToManyTarget("invActuals", obj, true);
	}

	public void removeFromInvActuals(final InvActual obj)
	{
		this.removeToManyTarget("invActuals", obj, true);
	}

	@SuppressWarnings("unchecked")
	public List<InvActual> getInvActuals()
	{
		return (List<InvActual>) this.readProperty("invActuals");
	}

	public void setInventory(final InvPricingPeriod inventory)
	{
		this.setToOneTarget("inventory", inventory, true);
	}

	public InvPricingPeriod getInventory()
	{
		return (InvPricingPeriod) this.readProperty("inventory");
	}

	public void setLocation(final Location location)
	{
		this.setToOneTarget("location", location, true);
	}

	public Location getLocation()
	{
		return (Location) this.readProperty("location");
	}

	public void setMarket(final Market market)
	{
		this.setToOneTarget("market", market, true);
	}

	public Market getMarket()
	{
		return (Market) this.readProperty("market");
	}

	public void setMarket1(final Market market1)
	{
		this.setToOneTarget("market1", market1, true);
	}

	public Market getMarket1()
	{
		return (Market) this.readProperty("market1");
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

	public void setUom2(final Uom uom2)
	{
		this.setToOneTarget("uom2", uom2, true);
	}

	public Uom getUom2()
	{
		return (Uom) this.readProperty("uom2");
	}

}