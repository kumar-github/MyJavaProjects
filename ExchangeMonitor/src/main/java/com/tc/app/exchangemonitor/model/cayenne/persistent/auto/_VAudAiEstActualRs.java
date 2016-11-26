package com.tc.app.exchangemonitor.model.cayenne.persistent.auto;

import java.math.BigDecimal;
import java.util.Date;

import org.apache.cayenne.CayenneDataObject;
import org.apache.cayenne.exp.Property;

/**
 * Class _VAudAiEstActualRs was generated by Cayenne.
 * It is probably a good idea to avoid changing this class manually,
 * since it may be overwritten next time code is regenerated.
 * If you need to make any customizations, please use subclass.
 */
public abstract class _VAudAiEstActualRs extends CayenneDataObject
{

	private static final long serialVersionUID = 1L;

	public static final Property<Integer> ACCUM_NUM = new Property<Integer>("accumNum");
	public static final Property<BigDecimal> ACTUAL_TAX_M315QTY = new Property<BigDecimal>("actualTaxM315Qty");
	public static final Property<BigDecimal> ACTUAL_TAX_MT_QTY = new Property<BigDecimal>("actualTaxMtQty");
	public static final Property<Short> ACTUAL_TIMEZONE = new Property<Short>("actualTimezone");
	public static final Property<Date> AI_EST_ACTUAL_DATE = new Property<Date>("aiEstActualDate");
	public static final Property<Double> AI_EST_ACTUAL_GROSS_QTY = new Property<Double>("aiEstActualGrossQty");
	public static final Property<String> AI_EST_ACTUAL_IND = new Property<String>("aiEstActualInd");
	public static final Property<Double> AI_EST_ACTUAL_NET_QTY = new Property<Double>("aiEstActualNetQty");
	public static final Property<Short> AI_EST_ACTUAL_NUM = new Property<Short>("aiEstActualNum");
	public static final Property<String> AI_EST_ACTUAL_SHORT_CMNT = new Property<String>("aiEstActualShortCmnt");
	public static final Property<String> AI_GROSS_QTY_UOM_CODE = new Property<String>("aiGrossQtyUomCode");
	public static final Property<String> AI_NET_QTY_UOM_CODE = new Property<String>("aiNetQtyUomCode");
	public static final Property<Short> ALLOC_ITEM_NUM = new Property<Short>("allocItemNum");
	public static final Property<Integer> ALLOC_NUM = new Property<Integer>("allocNum");
	public static final Property<String> APP_NAME = new Property<String>("appName");
	public static final Property<String> ASSAY_FINAL_IND = new Property<String>("assayFinalInd");
	public static final Property<String> BOL_CODE = new Property<String>("bolCode");
	public static final Property<String> DEL_LOC_CODE = new Property<String>("delLocCode");
	public static final Property<Integer> DEST_TRADE_NUM = new Property<Integer>("destTradeNum");
	public static final Property<String> FIXED_SWING_QTY_IND = new Property<String>("fixedSwingQtyInd");
	public static final Property<Integer> INSERT_SEQUENCE = new Property<Integer>("insertSequence");
	public static final Property<Integer> LEASE_NUM = new Property<Integer>("leaseNum");
	public static final Property<String> MANUAL_INPUT_SEC_IND = new Property<String>("manualInputSecInd");
	public static final Property<String> MOT_CODE = new Property<String>("motCode");
	public static final Property<String> OWNER_CODE = new Property<String>("ownerCode");
	public static final Property<Integer> RESP_TRANS_ID = new Property<Integer>("respTransId");
	public static final Property<String> SAP_POSITION_NUM = new Property<String>("sapPositionNum");
	public static final Property<String> SCAC_CARRIER_CODE = new Property<String>("scacCarrierCode");
	public static final Property<Double> SECONDARY_ACTUAL_GROSS_QTY = new Property<Double>("secondaryActualGrossQty");
	public static final Property<Double> SECONDARY_ACTUAL_NET_QTY = new Property<Double>("secondaryActualNetQty");
	public static final Property<String> SECONDARY_QTY_UOM_CODE = new Property<String>("secondaryQtyUomCode");
	public static final Property<Date> START_LOAD_DATE = new Property<Date>("startLoadDate");
	public static final Property<Date> STOP_LOAD_DATE = new Property<Date>("stopLoadDate");
	public static final Property<BigDecimal> TERTIARY_GROSS_QTY = new Property<BigDecimal>("tertiaryGrossQty");
	public static final Property<BigDecimal> TERTIARY_NET_QTY = new Property<BigDecimal>("tertiaryNetQty");
	public static final Property<String> TERTIARY_UOM_CODE = new Property<String>("tertiaryUomCode");
	public static final Property<String> TICKET_NUM = new Property<String>("ticketNum");
	public static final Property<Date> TRAN_DATE = new Property<Date>("tranDate");
	public static final Property<Integer> TRANS_ID = new Property<Integer>("transId");
	public static final Property<String> TRANS_TYPE = new Property<String>("transType");
	public static final Property<String> TRANS_USER_INIT = new Property<String>("transUserInit");
	public static final Property<String> TRANSPORTER_CODE = new Property<String>("transporterCode");

	public void setAccumNum(Integer accumNum)
	{
		writeProperty("accumNum", accumNum);
	}

	public Integer getAccumNum()
	{
		return (Integer) readProperty("accumNum");
	}

	public void setActualTaxM315Qty(BigDecimal actualTaxM315Qty)
	{
		writeProperty("actualTaxM315Qty", actualTaxM315Qty);
	}

	public BigDecimal getActualTaxM315Qty()
	{
		return (BigDecimal) readProperty("actualTaxM315Qty");
	}

	public void setActualTaxMtQty(BigDecimal actualTaxMtQty)
	{
		writeProperty("actualTaxMtQty", actualTaxMtQty);
	}

	public BigDecimal getActualTaxMtQty()
	{
		return (BigDecimal) readProperty("actualTaxMtQty");
	}

	public void setActualTimezone(Short actualTimezone)
	{
		writeProperty("actualTimezone", actualTimezone);
	}

	public Short getActualTimezone()
	{
		return (Short) readProperty("actualTimezone");
	}

	public void setAiEstActualDate(Date aiEstActualDate)
	{
		writeProperty("aiEstActualDate", aiEstActualDate);
	}

	public Date getAiEstActualDate()
	{
		return (Date) readProperty("aiEstActualDate");
	}

	public void setAiEstActualGrossQty(Double aiEstActualGrossQty)
	{
		writeProperty("aiEstActualGrossQty", aiEstActualGrossQty);
	}

	public Double getAiEstActualGrossQty()
	{
		return (Double) readProperty("aiEstActualGrossQty");
	}

	public void setAiEstActualInd(String aiEstActualInd)
	{
		writeProperty("aiEstActualInd", aiEstActualInd);
	}

	public String getAiEstActualInd()
	{
		return (String) readProperty("aiEstActualInd");
	}

	public void setAiEstActualNetQty(Double aiEstActualNetQty)
	{
		writeProperty("aiEstActualNetQty", aiEstActualNetQty);
	}

	public Double getAiEstActualNetQty()
	{
		return (Double) readProperty("aiEstActualNetQty");
	}

	public void setAiEstActualNum(Short aiEstActualNum)
	{
		writeProperty("aiEstActualNum", aiEstActualNum);
	}

	public Short getAiEstActualNum()
	{
		return (Short) readProperty("aiEstActualNum");
	}

	public void setAiEstActualShortCmnt(String aiEstActualShortCmnt)
	{
		writeProperty("aiEstActualShortCmnt", aiEstActualShortCmnt);
	}

	public String getAiEstActualShortCmnt()
	{
		return (String) readProperty("aiEstActualShortCmnt");
	}

	public void setAiGrossQtyUomCode(String aiGrossQtyUomCode)
	{
		writeProperty("aiGrossQtyUomCode", aiGrossQtyUomCode);
	}

	public String getAiGrossQtyUomCode()
	{
		return (String) readProperty("aiGrossQtyUomCode");
	}

	public void setAiNetQtyUomCode(String aiNetQtyUomCode)
	{
		writeProperty("aiNetQtyUomCode", aiNetQtyUomCode);
	}

	public String getAiNetQtyUomCode()
	{
		return (String) readProperty("aiNetQtyUomCode");
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

	public void setAppName(String appName)
	{
		writeProperty("appName", appName);
	}

	public String getAppName()
	{
		return (String) readProperty("appName");
	}

	public void setAssayFinalInd(String assayFinalInd)
	{
		writeProperty("assayFinalInd", assayFinalInd);
	}

	public String getAssayFinalInd()
	{
		return (String) readProperty("assayFinalInd");
	}

	public void setBolCode(String bolCode)
	{
		writeProperty("bolCode", bolCode);
	}

	public String getBolCode()
	{
		return (String) readProperty("bolCode");
	}

	public void setDelLocCode(String delLocCode)
	{
		writeProperty("delLocCode", delLocCode);
	}

	public String getDelLocCode()
	{
		return (String) readProperty("delLocCode");
	}

	public void setDestTradeNum(Integer destTradeNum)
	{
		writeProperty("destTradeNum", destTradeNum);
	}

	public Integer getDestTradeNum()
	{
		return (Integer) readProperty("destTradeNum");
	}

	public void setFixedSwingQtyInd(String fixedSwingQtyInd)
	{
		writeProperty("fixedSwingQtyInd", fixedSwingQtyInd);
	}

	public String getFixedSwingQtyInd()
	{
		return (String) readProperty("fixedSwingQtyInd");
	}

	public void setInsertSequence(Integer insertSequence)
	{
		writeProperty("insertSequence", insertSequence);
	}

	public Integer getInsertSequence()
	{
		return (Integer) readProperty("insertSequence");
	}

	public void setLeaseNum(Integer leaseNum)
	{
		writeProperty("leaseNum", leaseNum);
	}

	public Integer getLeaseNum()
	{
		return (Integer) readProperty("leaseNum");
	}

	public void setManualInputSecInd(String manualInputSecInd)
	{
		writeProperty("manualInputSecInd", manualInputSecInd);
	}

	public String getManualInputSecInd()
	{
		return (String) readProperty("manualInputSecInd");
	}

	public void setMotCode(String motCode)
	{
		writeProperty("motCode", motCode);
	}

	public String getMotCode()
	{
		return (String) readProperty("motCode");
	}

	public void setOwnerCode(String ownerCode)
	{
		writeProperty("ownerCode", ownerCode);
	}

	public String getOwnerCode()
	{
		return (String) readProperty("ownerCode");
	}

	public void setRespTransId(Integer respTransId)
	{
		writeProperty("respTransId", respTransId);
	}

	public Integer getRespTransId()
	{
		return (Integer) readProperty("respTransId");
	}

	public void setSapPositionNum(String sapPositionNum)
	{
		writeProperty("sapPositionNum", sapPositionNum);
	}

	public String getSapPositionNum()
	{
		return (String) readProperty("sapPositionNum");
	}

	public void setScacCarrierCode(String scacCarrierCode)
	{
		writeProperty("scacCarrierCode", scacCarrierCode);
	}

	public String getScacCarrierCode()
	{
		return (String) readProperty("scacCarrierCode");
	}

	public void setSecondaryActualGrossQty(Double secondaryActualGrossQty)
	{
		writeProperty("secondaryActualGrossQty", secondaryActualGrossQty);
	}

	public Double getSecondaryActualGrossQty()
	{
		return (Double) readProperty("secondaryActualGrossQty");
	}

	public void setSecondaryActualNetQty(Double secondaryActualNetQty)
	{
		writeProperty("secondaryActualNetQty", secondaryActualNetQty);
	}

	public Double getSecondaryActualNetQty()
	{
		return (Double) readProperty("secondaryActualNetQty");
	}

	public void setSecondaryQtyUomCode(String secondaryQtyUomCode)
	{
		writeProperty("secondaryQtyUomCode", secondaryQtyUomCode);
	}

	public String getSecondaryQtyUomCode()
	{
		return (String) readProperty("secondaryQtyUomCode");
	}

	public void setStartLoadDate(Date startLoadDate)
	{
		writeProperty("startLoadDate", startLoadDate);
	}

	public Date getStartLoadDate()
	{
		return (Date) readProperty("startLoadDate");
	}

	public void setStopLoadDate(Date stopLoadDate)
	{
		writeProperty("stopLoadDate", stopLoadDate);
	}

	public Date getStopLoadDate()
	{
		return (Date) readProperty("stopLoadDate");
	}

	public void setTertiaryGrossQty(BigDecimal tertiaryGrossQty)
	{
		writeProperty("tertiaryGrossQty", tertiaryGrossQty);
	}

	public BigDecimal getTertiaryGrossQty()
	{
		return (BigDecimal) readProperty("tertiaryGrossQty");
	}

	public void setTertiaryNetQty(BigDecimal tertiaryNetQty)
	{
		writeProperty("tertiaryNetQty", tertiaryNetQty);
	}

	public BigDecimal getTertiaryNetQty()
	{
		return (BigDecimal) readProperty("tertiaryNetQty");
	}

	public void setTertiaryUomCode(String tertiaryUomCode)
	{
		writeProperty("tertiaryUomCode", tertiaryUomCode);
	}

	public String getTertiaryUomCode()
	{
		return (String) readProperty("tertiaryUomCode");
	}

	public void setTicketNum(String ticketNum)
	{
		writeProperty("ticketNum", ticketNum);
	}

	public String getTicketNum()
	{
		return (String) readProperty("ticketNum");
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

	public void setTransporterCode(String transporterCode)
	{
		writeProperty("transporterCode", transporterCode);
	}

	public String getTransporterCode()
	{
		return (String) readProperty("transporterCode");
	}

}
