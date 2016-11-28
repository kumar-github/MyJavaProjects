package com.tc.app.exchangemonitor.model.cayenne.persistent.auto;

import java.math.BigDecimal;
import java.util.Date;

import org.apache.cayenne.CayenneDataObject;
import org.apache.cayenne.exp.Property;

/**
 * Class _VInventoryAllRs was generated by Cayenne.
 * It is probably a good idea to avoid changing this class manually,
 * since it may be overwritten next time code is regenerated.
 * If you need to make any customizations, please use subclass.
 */
public abstract class _VInventoryAllRs extends CayenneDataObject
{

	private static final long serialVersionUID = 1L;

	public static final Property<String> APP_NAME = new Property<String>("appName");
	public static final Property<String> BALANCE_PERIOD = new Property<String>("balancePeriod");
	public static final Property<String> CMDTY_CODE = new Property<String>("cmdtyCode");
	public static final Property<Integer> CMNT_NUM = new Property<Integer>("cmntNum");
	public static final Property<String> DEL_LOC_CODE = new Property<String>("delLocCode");
	public static final Property<Double> FIFO_OPEN_QTY = new Property<Double>("fifoOpenQty");
	public static final Property<String> FIFO_OPEN_QTY_UOM_CODE = new Property<String>("fifoOpenQtyUomCode");
	public static final Property<Double> INV_ADJ_QTY = new Property<Double>("invAdjQty");
	public static final Property<Double> INV_ADJ_SEC_QTY = new Property<Double>("invAdjSecQty");
	public static final Property<Double> INV_AVG_COST = new Property<Double>("invAvgCost");
	public static final Property<Date> INV_BAL_FROM_DATE = new Property<Date>("invBalFromDate");
	public static final Property<BigDecimal> INV_BAL_QTY = new Property<BigDecimal>("invBalQty");
	public static final Property<BigDecimal> INV_BAL_SEC_QTY = new Property<BigDecimal>("invBalSecQty");
	public static final Property<Date> INV_BAL_TO_DATE = new Property<Date>("invBalToDate");
	public static final Property<BigDecimal> INV_CAPACITY = new Property<BigDecimal>("invCapacity");
	public static final Property<Double> INV_CNFRMD_QTY = new Property<Double>("invCnfrmdQty");
	public static final Property<Double> INV_CNFRMD_SEC_QTY = new Property<Double>("invCnfrmdSecQty");
	public static final Property<String> INV_COST_CURR_CODE = new Property<String>("invCostCurrCode");
	public static final Property<String> INV_COST_UOM_CODE = new Property<String>("invCostUomCode");
	public static final Property<Integer> INV_CREDIT_EXPOSURE_OID = new Property<Integer>("invCreditExposureOid");
	public static final Property<Double> INV_CURR_ACTUAL_QTY = new Property<Double>("invCurrActualQty");
	public static final Property<Double> INV_CURR_ACTUAL_SEC_QTY = new Property<Double>("invCurrActualSecQty");
	public static final Property<Double> INV_CURR_PROJ_QTY = new Property<Double>("invCurrProjQty");
	public static final Property<Double> INV_CURR_PROJ_SEC_QTY = new Property<Double>("invCurrProjSecQty");
	public static final Property<Double> INV_DLVRY_ACTUAL_QTY = new Property<Double>("invDlvryActualQty");
	public static final Property<Double> INV_DLVRY_ACTUAL_SEC_QTY = new Property<Double>("invDlvryActualSecQty");
	public static final Property<Double> INV_DLVRY_PROJ_QTY = new Property<Double>("invDlvryProjQty");
	public static final Property<Double> INV_DLVRY_PROJ_SEC_QTY = new Property<Double>("invDlvryProjSecQty");
	public static final Property<BigDecimal> INV_FIFO_COST = new Property<BigDecimal>("invFifoCost");
	public static final Property<Integer> INV_FIFO_NUM = new Property<Integer>("invFifoNum");
	public static final Property<BigDecimal> INV_HEEL = new Property<BigDecimal>("invHeel");
	public static final Property<Integer> INV_LOOP_NUM = new Property<Integer>("invLoopNum");
	public static final Property<BigDecimal> INV_MAC_COST = new Property<BigDecimal>("invMacCost");
	public static final Property<BigDecimal> INV_MAC_INSERT_COST = new Property<BigDecimal>("invMacInsertCost");
	public static final Property<BigDecimal> INV_MIN_OP_REQ_QTY = new Property<BigDecimal>("invMinOpReqQty");
	public static final Property<Integer> INV_NUM = new Property<Integer>("invNum");
	public static final Property<Double> INV_OPEN_PRD_ACTUAL_QTY = new Property<Double>("invOpenPrdActualQty");
	public static final Property<Double> INV_OPEN_PRD_ACTUAL_SEC_QTY = new Property<Double>("invOpenPrdActualSecQty");
	public static final Property<Double> INV_OPEN_PRD_PROJ_QTY = new Property<Double>("invOpenPrdProjQty");
	public static final Property<Double> INV_OPEN_PRD_PROJ_SEC_QTY = new Property<Double>("invOpenPrdProjSecQty");
	public static final Property<String> INV_PRICING_TYPE = new Property<String>("invPricingType");
	public static final Property<String> INV_QTY_UOM_CODE = new Property<String>("invQtyUomCode");
	public static final Property<Double> INV_RCPT_ACTUAL_QTY = new Property<Double>("invRcptActualQty");
	public static final Property<Double> INV_RCPT_ACTUAL_SEC_QTY = new Property<Double>("invRcptActualSecQty");
	public static final Property<Double> INV_RCPT_PROJ_QTY = new Property<Double>("invRcptProjQty");
	public static final Property<Double> INV_RCPT_PROJ_SEC_QTY = new Property<Double>("invRcptProjSecQty");
	public static final Property<BigDecimal> INV_SAFE_FILL = new Property<BigDecimal>("invSafeFill");
	public static final Property<String> INV_SEC_QTY_UOM_CODE = new Property<String>("invSecQtyUomCode");
	public static final Property<BigDecimal> INV_TARGET_MAX_QTY = new Property<BigDecimal>("invTargetMaxQty");
	public static final Property<BigDecimal> INV_TARGET_MIN_QTY = new Property<BigDecimal>("invTargetMinQty");
	public static final Property<String> INV_TYPE = new Property<String>("invType");
	public static final Property<Double> INV_WACOG_COST = new Property<Double>("invWacogCost");
	public static final Property<Double> LINE_FILL_QTY = new Property<Double>("lineFillQty");
	public static final Property<String> LONG_CMDTY_CODE = new Property<String>("longCmdtyCode");
	public static final Property<String> LONG_RISK_MKT = new Property<String>("longRiskMkt");
	public static final Property<BigDecimal> MAC_INV_AMT = new Property<BigDecimal>("macInvAmt");
	public static final Property<String> NEEDS_REPRICING = new Property<String>("needsRepricing");
	public static final Property<Integer> NEXT_INV_NUM = new Property<Integer>("nextInvNum");
	public static final Property<String> OPEN_CLOSE_IND = new Property<String>("openCloseInd");
	public static final Property<Short> ORDER_NUM = new Property<Short>("orderNum");
	public static final Property<Integer> PORT_NUM = new Property<Integer>("portNum");
	public static final Property<Integer> POS_NUM = new Property<Integer>("posNum");
	public static final Property<Integer> PREV_INV_NUM = new Property<Integer>("prevInvNum");
	public static final Property<Double> R_INV_AVG_COST_AMT = new Property<Double>("rInvAvgCostAmt");
	public static final Property<Integer> RESP_TRANS_ID = new Property<Integer>("respTransId");
	public static final Property<String> ROLL_AT_MKT_PRICE_IND = new Property<String>("rollAtMktPriceInd");
	public static final Property<Short> SALE_ITEM_NUM = new Property<Short>("saleItemNum");
	public static final Property<Double> SEC_FIFO_OPEN_QTY = new Property<Double>("secFifoOpenQty");
	public static final Property<String> SEC_FIFO_OPEN_QTY_UOM_CODE = new Property<String>("secFifoOpenQtyUomCode");
	public static final Property<BigDecimal> SEQUENCE = new Property<BigDecimal>("sequence");
	public static final Property<String> SHORT_CMDTY_CODE = new Property<String>("shortCmdtyCode");
	public static final Property<String> SHORT_RISK_MKT = new Property<String>("shortRiskMkt");
	public static final Property<String> STORAGE_SUBLOC_NAME = new Property<String>("storageSublocName");
	public static final Property<Integer> TRADE_NUM = new Property<Integer>("tradeNum");
	public static final Property<Date> TRAN_DATE = new Property<Date>("tranDate");
	public static final Property<Integer> TRANS_ID = new Property<Integer>("transId");
	public static final Property<String> TRANS_TYPE = new Property<String>("transType");
	public static final Property<String> TRANS_USER_INIT = new Property<String>("transUserInit");
	public static final Property<Double> UNR_INV_AVG_COST_AMT = new Property<Double>("unrInvAvgCostAmt");
	public static final Property<Boolean> USE_MTM = new Property<Boolean>("useMtm");
	public static final Property<String> WORKSTATION_ID = new Property<String>("workstationId");

	public void setAppName(String appName)
	{
		writeProperty("appName", appName);
	}

	public String getAppName()
	{
		return (String) readProperty("appName");
	}

	public void setBalancePeriod(String balancePeriod)
	{
		writeProperty("balancePeriod", balancePeriod);
	}

	public String getBalancePeriod()
	{
		return (String) readProperty("balancePeriod");
	}

	public void setCmdtyCode(String cmdtyCode)
	{
		writeProperty("cmdtyCode", cmdtyCode);
	}

	public String getCmdtyCode()
	{
		return (String) readProperty("cmdtyCode");
	}

	public void setCmntNum(Integer cmntNum)
	{
		writeProperty("cmntNum", cmntNum);
	}

	public Integer getCmntNum()
	{
		return (Integer) readProperty("cmntNum");
	}

	public void setDelLocCode(String delLocCode)
	{
		writeProperty("delLocCode", delLocCode);
	}

	public String getDelLocCode()
	{
		return (String) readProperty("delLocCode");
	}

	public void setFifoOpenQty(Double fifoOpenQty)
	{
		writeProperty("fifoOpenQty", fifoOpenQty);
	}

	public Double getFifoOpenQty()
	{
		return (Double) readProperty("fifoOpenQty");
	}

	public void setFifoOpenQtyUomCode(String fifoOpenQtyUomCode)
	{
		writeProperty("fifoOpenQtyUomCode", fifoOpenQtyUomCode);
	}

	public String getFifoOpenQtyUomCode()
	{
		return (String) readProperty("fifoOpenQtyUomCode");
	}

	public void setInvAdjQty(Double invAdjQty)
	{
		writeProperty("invAdjQty", invAdjQty);
	}

	public Double getInvAdjQty()
	{
		return (Double) readProperty("invAdjQty");
	}

	public void setInvAdjSecQty(Double invAdjSecQty)
	{
		writeProperty("invAdjSecQty", invAdjSecQty);
	}

	public Double getInvAdjSecQty()
	{
		return (Double) readProperty("invAdjSecQty");
	}

	public void setInvAvgCost(Double invAvgCost)
	{
		writeProperty("invAvgCost", invAvgCost);
	}

	public Double getInvAvgCost()
	{
		return (Double) readProperty("invAvgCost");
	}

	public void setInvBalFromDate(Date invBalFromDate)
	{
		writeProperty("invBalFromDate", invBalFromDate);
	}

	public Date getInvBalFromDate()
	{
		return (Date) readProperty("invBalFromDate");
	}

	public void setInvBalQty(BigDecimal invBalQty)
	{
		writeProperty("invBalQty", invBalQty);
	}

	public BigDecimal getInvBalQty()
	{
		return (BigDecimal) readProperty("invBalQty");
	}

	public void setInvBalSecQty(BigDecimal invBalSecQty)
	{
		writeProperty("invBalSecQty", invBalSecQty);
	}

	public BigDecimal getInvBalSecQty()
	{
		return (BigDecimal) readProperty("invBalSecQty");
	}

	public void setInvBalToDate(Date invBalToDate)
	{
		writeProperty("invBalToDate", invBalToDate);
	}

	public Date getInvBalToDate()
	{
		return (Date) readProperty("invBalToDate");
	}

	public void setInvCapacity(BigDecimal invCapacity)
	{
		writeProperty("invCapacity", invCapacity);
	}

	public BigDecimal getInvCapacity()
	{
		return (BigDecimal) readProperty("invCapacity");
	}

	public void setInvCnfrmdQty(Double invCnfrmdQty)
	{
		writeProperty("invCnfrmdQty", invCnfrmdQty);
	}

	public Double getInvCnfrmdQty()
	{
		return (Double) readProperty("invCnfrmdQty");
	}

	public void setInvCnfrmdSecQty(Double invCnfrmdSecQty)
	{
		writeProperty("invCnfrmdSecQty", invCnfrmdSecQty);
	}

	public Double getInvCnfrmdSecQty()
	{
		return (Double) readProperty("invCnfrmdSecQty");
	}

	public void setInvCostCurrCode(String invCostCurrCode)
	{
		writeProperty("invCostCurrCode", invCostCurrCode);
	}

	public String getInvCostCurrCode()
	{
		return (String) readProperty("invCostCurrCode");
	}

	public void setInvCostUomCode(String invCostUomCode)
	{
		writeProperty("invCostUomCode", invCostUomCode);
	}

	public String getInvCostUomCode()
	{
		return (String) readProperty("invCostUomCode");
	}

	public void setInvCreditExposureOid(Integer invCreditExposureOid)
	{
		writeProperty("invCreditExposureOid", invCreditExposureOid);
	}

	public Integer getInvCreditExposureOid()
	{
		return (Integer) readProperty("invCreditExposureOid");
	}

	public void setInvCurrActualQty(Double invCurrActualQty)
	{
		writeProperty("invCurrActualQty", invCurrActualQty);
	}

	public Double getInvCurrActualQty()
	{
		return (Double) readProperty("invCurrActualQty");
	}

	public void setInvCurrActualSecQty(Double invCurrActualSecQty)
	{
		writeProperty("invCurrActualSecQty", invCurrActualSecQty);
	}

	public Double getInvCurrActualSecQty()
	{
		return (Double) readProperty("invCurrActualSecQty");
	}

	public void setInvCurrProjQty(Double invCurrProjQty)
	{
		writeProperty("invCurrProjQty", invCurrProjQty);
	}

	public Double getInvCurrProjQty()
	{
		return (Double) readProperty("invCurrProjQty");
	}

	public void setInvCurrProjSecQty(Double invCurrProjSecQty)
	{
		writeProperty("invCurrProjSecQty", invCurrProjSecQty);
	}

	public Double getInvCurrProjSecQty()
	{
		return (Double) readProperty("invCurrProjSecQty");
	}

	public void setInvDlvryActualQty(Double invDlvryActualQty)
	{
		writeProperty("invDlvryActualQty", invDlvryActualQty);
	}

	public Double getInvDlvryActualQty()
	{
		return (Double) readProperty("invDlvryActualQty");
	}

	public void setInvDlvryActualSecQty(Double invDlvryActualSecQty)
	{
		writeProperty("invDlvryActualSecQty", invDlvryActualSecQty);
	}

	public Double getInvDlvryActualSecQty()
	{
		return (Double) readProperty("invDlvryActualSecQty");
	}

	public void setInvDlvryProjQty(Double invDlvryProjQty)
	{
		writeProperty("invDlvryProjQty", invDlvryProjQty);
	}

	public Double getInvDlvryProjQty()
	{
		return (Double) readProperty("invDlvryProjQty");
	}

	public void setInvDlvryProjSecQty(Double invDlvryProjSecQty)
	{
		writeProperty("invDlvryProjSecQty", invDlvryProjSecQty);
	}

	public Double getInvDlvryProjSecQty()
	{
		return (Double) readProperty("invDlvryProjSecQty");
	}

	public void setInvFifoCost(BigDecimal invFifoCost)
	{
		writeProperty("invFifoCost", invFifoCost);
	}

	public BigDecimal getInvFifoCost()
	{
		return (BigDecimal) readProperty("invFifoCost");
	}

	public void setInvFifoNum(Integer invFifoNum)
	{
		writeProperty("invFifoNum", invFifoNum);
	}

	public Integer getInvFifoNum()
	{
		return (Integer) readProperty("invFifoNum");
	}

	public void setInvHeel(BigDecimal invHeel)
	{
		writeProperty("invHeel", invHeel);
	}

	public BigDecimal getInvHeel()
	{
		return (BigDecimal) readProperty("invHeel");
	}

	public void setInvLoopNum(Integer invLoopNum)
	{
		writeProperty("invLoopNum", invLoopNum);
	}

	public Integer getInvLoopNum()
	{
		return (Integer) readProperty("invLoopNum");
	}

	public void setInvMacCost(BigDecimal invMacCost)
	{
		writeProperty("invMacCost", invMacCost);
	}

	public BigDecimal getInvMacCost()
	{
		return (BigDecimal) readProperty("invMacCost");
	}

	public void setInvMacInsertCost(BigDecimal invMacInsertCost)
	{
		writeProperty("invMacInsertCost", invMacInsertCost);
	}

	public BigDecimal getInvMacInsertCost()
	{
		return (BigDecimal) readProperty("invMacInsertCost");
	}

	public void setInvMinOpReqQty(BigDecimal invMinOpReqQty)
	{
		writeProperty("invMinOpReqQty", invMinOpReqQty);
	}

	public BigDecimal getInvMinOpReqQty()
	{
		return (BigDecimal) readProperty("invMinOpReqQty");
	}

	public void setInvNum(Integer invNum)
	{
		writeProperty("invNum", invNum);
	}

	public Integer getInvNum()
	{
		return (Integer) readProperty("invNum");
	}

	public void setInvOpenPrdActualQty(Double invOpenPrdActualQty)
	{
		writeProperty("invOpenPrdActualQty", invOpenPrdActualQty);
	}

	public Double getInvOpenPrdActualQty()
	{
		return (Double) readProperty("invOpenPrdActualQty");
	}

	public void setInvOpenPrdActualSecQty(Double invOpenPrdActualSecQty)
	{
		writeProperty("invOpenPrdActualSecQty", invOpenPrdActualSecQty);
	}

	public Double getInvOpenPrdActualSecQty()
	{
		return (Double) readProperty("invOpenPrdActualSecQty");
	}

	public void setInvOpenPrdProjQty(Double invOpenPrdProjQty)
	{
		writeProperty("invOpenPrdProjQty", invOpenPrdProjQty);
	}

	public Double getInvOpenPrdProjQty()
	{
		return (Double) readProperty("invOpenPrdProjQty");
	}

	public void setInvOpenPrdProjSecQty(Double invOpenPrdProjSecQty)
	{
		writeProperty("invOpenPrdProjSecQty", invOpenPrdProjSecQty);
	}

	public Double getInvOpenPrdProjSecQty()
	{
		return (Double) readProperty("invOpenPrdProjSecQty");
	}

	public void setInvPricingType(String invPricingType)
	{
		writeProperty("invPricingType", invPricingType);
	}

	public String getInvPricingType()
	{
		return (String) readProperty("invPricingType");
	}

	public void setInvQtyUomCode(String invQtyUomCode)
	{
		writeProperty("invQtyUomCode", invQtyUomCode);
	}

	public String getInvQtyUomCode()
	{
		return (String) readProperty("invQtyUomCode");
	}

	public void setInvRcptActualQty(Double invRcptActualQty)
	{
		writeProperty("invRcptActualQty", invRcptActualQty);
	}

	public Double getInvRcptActualQty()
	{
		return (Double) readProperty("invRcptActualQty");
	}

	public void setInvRcptActualSecQty(Double invRcptActualSecQty)
	{
		writeProperty("invRcptActualSecQty", invRcptActualSecQty);
	}

	public Double getInvRcptActualSecQty()
	{
		return (Double) readProperty("invRcptActualSecQty");
	}

	public void setInvRcptProjQty(Double invRcptProjQty)
	{
		writeProperty("invRcptProjQty", invRcptProjQty);
	}

	public Double getInvRcptProjQty()
	{
		return (Double) readProperty("invRcptProjQty");
	}

	public void setInvRcptProjSecQty(Double invRcptProjSecQty)
	{
		writeProperty("invRcptProjSecQty", invRcptProjSecQty);
	}

	public Double getInvRcptProjSecQty()
	{
		return (Double) readProperty("invRcptProjSecQty");
	}

	public void setInvSafeFill(BigDecimal invSafeFill)
	{
		writeProperty("invSafeFill", invSafeFill);
	}

	public BigDecimal getInvSafeFill()
	{
		return (BigDecimal) readProperty("invSafeFill");
	}

	public void setInvSecQtyUomCode(String invSecQtyUomCode)
	{
		writeProperty("invSecQtyUomCode", invSecQtyUomCode);
	}

	public String getInvSecQtyUomCode()
	{
		return (String) readProperty("invSecQtyUomCode");
	}

	public void setInvTargetMaxQty(BigDecimal invTargetMaxQty)
	{
		writeProperty("invTargetMaxQty", invTargetMaxQty);
	}

	public BigDecimal getInvTargetMaxQty()
	{
		return (BigDecimal) readProperty("invTargetMaxQty");
	}

	public void setInvTargetMinQty(BigDecimal invTargetMinQty)
	{
		writeProperty("invTargetMinQty", invTargetMinQty);
	}

	public BigDecimal getInvTargetMinQty()
	{
		return (BigDecimal) readProperty("invTargetMinQty");
	}

	public void setInvType(String invType)
	{
		writeProperty("invType", invType);
	}

	public String getInvType()
	{
		return (String) readProperty("invType");
	}

	public void setInvWacogCost(Double invWacogCost)
	{
		writeProperty("invWacogCost", invWacogCost);
	}

	public Double getInvWacogCost()
	{
		return (Double) readProperty("invWacogCost");
	}

	public void setLineFillQty(Double lineFillQty)
	{
		writeProperty("lineFillQty", lineFillQty);
	}

	public Double getLineFillQty()
	{
		return (Double) readProperty("lineFillQty");
	}

	public void setLongCmdtyCode(String longCmdtyCode)
	{
		writeProperty("longCmdtyCode", longCmdtyCode);
	}

	public String getLongCmdtyCode()
	{
		return (String) readProperty("longCmdtyCode");
	}

	public void setLongRiskMkt(String longRiskMkt)
	{
		writeProperty("longRiskMkt", longRiskMkt);
	}

	public String getLongRiskMkt()
	{
		return (String) readProperty("longRiskMkt");
	}

	public void setMacInvAmt(BigDecimal macInvAmt)
	{
		writeProperty("macInvAmt", macInvAmt);
	}

	public BigDecimal getMacInvAmt()
	{
		return (BigDecimal) readProperty("macInvAmt");
	}

	public void setNeedsRepricing(String needsRepricing)
	{
		writeProperty("needsRepricing", needsRepricing);
	}

	public String getNeedsRepricing()
	{
		return (String) readProperty("needsRepricing");
	}

	public void setNextInvNum(Integer nextInvNum)
	{
		writeProperty("nextInvNum", nextInvNum);
	}

	public Integer getNextInvNum()
	{
		return (Integer) readProperty("nextInvNum");
	}

	public void setOpenCloseInd(String openCloseInd)
	{
		writeProperty("openCloseInd", openCloseInd);
	}

	public String getOpenCloseInd()
	{
		return (String) readProperty("openCloseInd");
	}

	public void setOrderNum(Short orderNum)
	{
		writeProperty("orderNum", orderNum);
	}

	public Short getOrderNum()
	{
		return (Short) readProperty("orderNum");
	}

	public void setPortNum(Integer portNum)
	{
		writeProperty("portNum", portNum);
	}

	public Integer getPortNum()
	{
		return (Integer) readProperty("portNum");
	}

	public void setPosNum(Integer posNum)
	{
		writeProperty("posNum", posNum);
	}

	public Integer getPosNum()
	{
		return (Integer) readProperty("posNum");
	}

	public void setPrevInvNum(Integer prevInvNum)
	{
		writeProperty("prevInvNum", prevInvNum);
	}

	public Integer getPrevInvNum()
	{
		return (Integer) readProperty("prevInvNum");
	}

	public void setRInvAvgCostAmt(Double rInvAvgCostAmt)
	{
		writeProperty("rInvAvgCostAmt", rInvAvgCostAmt);
	}

	public Double getRInvAvgCostAmt()
	{
		return (Double) readProperty("rInvAvgCostAmt");
	}

	public void setRespTransId(Integer respTransId)
	{
		writeProperty("respTransId", respTransId);
	}

	public Integer getRespTransId()
	{
		return (Integer) readProperty("respTransId");
	}

	public void setRollAtMktPriceInd(String rollAtMktPriceInd)
	{
		writeProperty("rollAtMktPriceInd", rollAtMktPriceInd);
	}

	public String getRollAtMktPriceInd()
	{
		return (String) readProperty("rollAtMktPriceInd");
	}

	public void setSaleItemNum(Short saleItemNum)
	{
		writeProperty("saleItemNum", saleItemNum);
	}

	public Short getSaleItemNum()
	{
		return (Short) readProperty("saleItemNum");
	}

	public void setSecFifoOpenQty(Double secFifoOpenQty)
	{
		writeProperty("secFifoOpenQty", secFifoOpenQty);
	}

	public Double getSecFifoOpenQty()
	{
		return (Double) readProperty("secFifoOpenQty");
	}

	public void setSecFifoOpenQtyUomCode(String secFifoOpenQtyUomCode)
	{
		writeProperty("secFifoOpenQtyUomCode", secFifoOpenQtyUomCode);
	}

	public String getSecFifoOpenQtyUomCode()
	{
		return (String) readProperty("secFifoOpenQtyUomCode");
	}

	public void setSequence(BigDecimal sequence)
	{
		writeProperty("sequence", sequence);
	}

	public BigDecimal getSequence()
	{
		return (BigDecimal) readProperty("sequence");
	}

	public void setShortCmdtyCode(String shortCmdtyCode)
	{
		writeProperty("shortCmdtyCode", shortCmdtyCode);
	}

	public String getShortCmdtyCode()
	{
		return (String) readProperty("shortCmdtyCode");
	}

	public void setShortRiskMkt(String shortRiskMkt)
	{
		writeProperty("shortRiskMkt", shortRiskMkt);
	}

	public String getShortRiskMkt()
	{
		return (String) readProperty("shortRiskMkt");
	}

	public void setStorageSublocName(String storageSublocName)
	{
		writeProperty("storageSublocName", storageSublocName);
	}

	public String getStorageSublocName()
	{
		return (String) readProperty("storageSublocName");
	}

	public void setTradeNum(Integer tradeNum)
	{
		writeProperty("tradeNum", tradeNum);
	}

	public Integer getTradeNum()
	{
		return (Integer) readProperty("tradeNum");
	}

	public void setTranDate(Date tranDate)
	{
		writeProperty("tranDate", tranDate);
	}

	public Date getTranDate()
	{
		return (Date) readProperty("tranDate");
	}

	public void setTransId(Integer transId)
	{
		writeProperty("transId", transId);
	}

	public Integer getTransId()
	{
		return (Integer) readProperty("transId");
	}

	public void setTransType(String transType)
	{
		writeProperty("transType", transType);
	}

	public String getTransType()
	{
		return (String) readProperty("transType");
	}

	public void setTransUserInit(String transUserInit)
	{
		writeProperty("transUserInit", transUserInit);
	}

	public String getTransUserInit()
	{
		return (String) readProperty("transUserInit");
	}

	public void setUnrInvAvgCostAmt(Double unrInvAvgCostAmt)
	{
		writeProperty("unrInvAvgCostAmt", unrInvAvgCostAmt);
	}

	public Double getUnrInvAvgCostAmt()
	{
		return (Double) readProperty("unrInvAvgCostAmt");
	}

	public void setUseMtm(Boolean useMtm)
	{
		writeProperty("useMtm", useMtm);
	}

	public Boolean getUseMtm()
	{
		return (Boolean) readProperty("useMtm");
	}

	public void setWorkstationId(String workstationId)
	{
		writeProperty("workstationId", workstationId);
	}

	public String getWorkstationId()
	{
		return (String) readProperty("workstationId");
	}

}