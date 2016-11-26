package com.tc.app.exchangemonitor.model.cayenne.persistent.auto;

import java.math.BigDecimal;
import java.util.Date;

import org.apache.cayenne.CayenneDataObject;
import org.apache.cayenne.exp.Property;

/**
 * Class _VAllocationItemRev was generated by Cayenne.
 * It is probably a good idea to avoid changing this class manually,
 * since it may be overwritten next time code is regenerated.
 * If you need to make any customizations, please use subclass.
 */
public abstract class _VAllocationItemRev extends CayenneDataObject
{

	private static final long serialVersionUID = 1L;

	public static final Property<Integer> ACCT_NUM = new Property<Integer>("acctNum");
	public static final Property<String> ACCT_REF_NUM = new Property<String>("acctRefNum");
	public static final Property<Double> ACTUAL_GROSS_QTY = new Property<Double>("actualGrossQty");
	public static final Property<String> ACTUAL_GROSS_UOM_CODE = new Property<String>("actualGrossUomCode");
	public static final Property<String> ALLOC_ITEM_CONFIRM = new Property<String>("allocItemConfirm");
	public static final Property<Short> ALLOC_ITEM_NUM = new Property<Short>("allocItemNum");
	public static final Property<String> ALLOC_ITEM_SHORT_CMNT = new Property<String>("allocItemShortCmnt");
	public static final Property<String> ALLOC_ITEM_STATUS = new Property<String>("allocItemStatus");
	public static final Property<String> ALLOC_ITEM_TYPE = new Property<String>("allocItemType");
	public static final Property<String> ALLOC_ITEM_VERIFY = new Property<String>("allocItemVerify");
	public static final Property<Integer> ALLOC_NUM = new Property<Integer>("allocNum");
	public static final Property<Short> AR_ALLOC_ITEM_NUM = new Property<Short>("arAllocItemNum");
	public static final Property<Integer> AR_ALLOC_NUM = new Property<Integer>("arAllocNum");
	public static final Property<Integer> ASOF_TRANS_ID = new Property<Integer>("asofTransId");
	public static final Property<String> AUTO_RECEIPT_ACTUAL_IND = new Property<String>("autoReceiptActualInd");
	public static final Property<String> AUTO_RECEIPT_IND = new Property<String>("autoReceiptInd");
	public static final Property<Integer> AUTO_SAMPLING_COMP_NUM = new Property<Integer>("autoSamplingCompNum");
	public static final Property<String> AUTO_SAMPLING_IND = new Property<String>("autoSamplingInd");
	public static final Property<String> CMDTY_CODE = new Property<String>("cmdtyCode");
	public static final Property<Integer> CMNT_NUM = new Property<Integer>("cmntNum");
	public static final Property<Date> CONFIRMATION_DATE = new Property<Date>("confirmationDate");
	public static final Property<String> CR_ANLY_INIT = new Property<String>("crAnlyInit");
	public static final Property<String> CR_CLEAR_IND = new Property<String>("crClearInd");
	public static final Property<String> CREDIT_TERM_CODE = new Property<String>("creditTermCode");
	public static final Property<String> DEL_TERM_CODE = new Property<String>("delTermCode");
	public static final Property<String> DEST_LOC_CODE = new Property<String>("destLocCode");
	public static final Property<Date> ESTIMATE_EVENT_DATE = new Property<Date>("estimateEventDate");
	public static final Property<String> FINAL_DEST_LOC_CODE = new Property<String>("finalDestLocCode");
	public static final Property<Integer> FINANCE_BANK_NUM = new Property<Integer>("financeBankNum");
	public static final Property<String> FULLY_ACTUALIZED = new Property<String>("fullyActualized");
	public static final Property<String> IMP_REC_IND = new Property<String>("impRecInd");
	public static final Property<Integer> IMP_REC_REASON_OID = new Property<Integer>("impRecReasonOid");
	public static final Property<Integer> INSP_ACCT_NUM = new Property<Integer>("inspAcctNum");
	public static final Property<Date> INSPECTION_DATE = new Property<Date>("inspectionDate");
	public static final Property<Short> INSPECTOR_PERCENT = new Property<Short>("inspectorPercent");
	public static final Property<Integer> INV_NUM = new Property<Integer>("invNum");
	public static final Property<Short> ITEM_NUM = new Property<Short>("itemNum");
	public static final Property<Integer> LC_NUM = new Property<Integer>("lcNum");
	public static final Property<String> LOAD_PORT_LOC_CODE = new Property<String>("loadPortLocCode");
	public static final Property<Short> MAX_AI_EST_ACTUAL_NUM = new Property<Short>("maxAiEstActualNum");
	public static final Property<Short> NET_NOM_NUM = new Property<Short>("netNomNum");
	public static final Property<Date> NOMIN_DATE_FROM = new Property<Date>("nominDateFrom");
	public static final Property<Date> NOMIN_DATE_TO = new Property<Date>("nominDateTo");
	public static final Property<Double> NOMIN_QTY_MAX = new Property<Double>("nominQtyMax");
	public static final Property<String> NOMIN_QTY_MAX_UOM_CODE = new Property<String>("nominQtyMaxUomCode");
	public static final Property<Double> NOMIN_QTY_MIN = new Property<Double>("nominQtyMin");
	public static final Property<String> NOMIN_QTY_MIN_UOM_CODE = new Property<String>("nominQtyMinUomCode");
	public static final Property<Short> ORDER_NUM = new Property<Short>("orderNum");
	public static final Property<String> ORIGIN_LOC_CODE = new Property<String>("originLocCode");
	public static final Property<Short> PAY_DAYS = new Property<Short>("payDays");
	public static final Property<String> PAY_TERM_CODE = new Property<String>("payTermCode");
	public static final Property<String> PURCHASING_GROUP = new Property<String>("purchasingGroup");
	public static final Property<Integer> RECAP_ITEM_NUM = new Property<Integer>("recapItemNum");
	public static final Property<Date> REPORTING_DATE = new Property<Date>("reportingDate");
	public static final Property<Integer> RESP_TRANS_ID = new Property<Integer>("respTransId");
	public static final Property<String> SAP_DELIVERY_LINE_ITEM_NUM = new Property<String>("sapDeliveryLineItemNum");
	public static final Property<String> SAP_DELIVERY_NUM = new Property<String>("sapDeliveryNum");
	public static final Property<Double> SCH_QTY = new Property<Double>("schQty");
	public static final Property<String> SCH_QTY_PERIODICITY = new Property<String>("schQtyPeriodicity");
	public static final Property<String> SCH_QTY_UOM_CODE = new Property<String>("schQtyUomCode");
	public static final Property<String> SEC_ACTUAL_UOM_CODE = new Property<String>("secActualUomCode");
	public static final Property<Double> SECONDARY_ACTUAL_QTY = new Property<Double>("secondaryActualQty");
	public static final Property<Integer> SHIP_AGENT_COMP_NUM = new Property<Integer>("shipAgentCompNum");
	public static final Property<Integer> SHIP_BROKER_COMP_NUM = new Property<Integer>("shipBrokerCompNum");
	public static final Property<Short> SUB_ALLOC_NUM = new Property<Short>("subAllocNum");
	public static final Property<Date> TITLE_TRAN_DATE = new Property<Date>("titleTranDate");
	public static final Property<String> TITLE_TRAN_LOC_CODE = new Property<String>("titleTranLocCode");
	public static final Property<Integer> TRADE_NUM = new Property<Integer>("tradeNum");
	public static final Property<Integer> TRANS_ID = new Property<Integer>("transId");
	public static final Property<BigDecimal> TRANSFER_PRICE = new Property<BigDecimal>("transferPrice");
	public static final Property<String> TRANSFER_PRICE_CURR_CODE = new Property<String>("transferPriceCurrCode");
	public static final Property<String> TRANSFER_PRICE_CURR_CODE_TO = new Property<String>("transferPriceCurrCodeTo");
	public static final Property<Double> TRANSFER_PRICE_CURRENCY_RATE = new Property<Double>("transferPriceCurrencyRate");
	public static final Property<String> TRANSFER_PRICE_UOM_CODE = new Property<String>("transferPriceUomCode");
	public static final Property<Boolean> VAT_IND = new Property<Boolean>("vatInd");

	public void setAcctNum(Integer acctNum)
	{
		writeProperty("acctNum", acctNum);
	}

	public Integer getAcctNum()
	{
		return (Integer) readProperty("acctNum");
	}

	public void setAcctRefNum(String acctRefNum)
	{
		writeProperty("acctRefNum", acctRefNum);
	}

	public String getAcctRefNum()
	{
		return (String) readProperty("acctRefNum");
	}

	public void setActualGrossQty(Double actualGrossQty)
	{
		writeProperty("actualGrossQty", actualGrossQty);
	}

	public Double getActualGrossQty()
	{
		return (Double) readProperty("actualGrossQty");
	}

	public void setActualGrossUomCode(String actualGrossUomCode)
	{
		writeProperty("actualGrossUomCode", actualGrossUomCode);
	}

	public String getActualGrossUomCode()
	{
		return (String) readProperty("actualGrossUomCode");
	}

	public void setAllocItemConfirm(String allocItemConfirm)
	{
		writeProperty("allocItemConfirm", allocItemConfirm);
	}

	public String getAllocItemConfirm()
	{
		return (String) readProperty("allocItemConfirm");
	}

	public void setAllocItemNum(Short allocItemNum)
	{
		writeProperty("allocItemNum", allocItemNum);
	}

	public Short getAllocItemNum()
	{
		return (Short) readProperty("allocItemNum");
	}

	public void setAllocItemShortCmnt(String allocItemShortCmnt)
	{
		writeProperty("allocItemShortCmnt", allocItemShortCmnt);
	}

	public String getAllocItemShortCmnt()
	{
		return (String) readProperty("allocItemShortCmnt");
	}

	public void setAllocItemStatus(String allocItemStatus)
	{
		writeProperty("allocItemStatus", allocItemStatus);
	}

	public String getAllocItemStatus()
	{
		return (String) readProperty("allocItemStatus");
	}

	public void setAllocItemType(String allocItemType)
	{
		writeProperty("allocItemType", allocItemType);
	}

	public String getAllocItemType()
	{
		return (String) readProperty("allocItemType");
	}

	public void setAllocItemVerify(String allocItemVerify)
	{
		writeProperty("allocItemVerify", allocItemVerify);
	}

	public String getAllocItemVerify()
	{
		return (String) readProperty("allocItemVerify");
	}

	public void setAllocNum(Integer allocNum)
	{
		writeProperty("allocNum", allocNum);
	}

	public Integer getAllocNum()
	{
		return (Integer) readProperty("allocNum");
	}

	public void setArAllocItemNum(Short arAllocItemNum)
	{
		writeProperty("arAllocItemNum", arAllocItemNum);
	}

	public Short getArAllocItemNum()
	{
		return (Short) readProperty("arAllocItemNum");
	}

	public void setArAllocNum(Integer arAllocNum)
	{
		writeProperty("arAllocNum", arAllocNum);
	}

	public Integer getArAllocNum()
	{
		return (Integer) readProperty("arAllocNum");
	}

	public void setAsofTransId(Integer asofTransId)
	{
		writeProperty("asofTransId", asofTransId);
	}

	public Integer getAsofTransId()
	{
		return (Integer) readProperty("asofTransId");
	}

	public void setAutoReceiptActualInd(String autoReceiptActualInd)
	{
		writeProperty("autoReceiptActualInd", autoReceiptActualInd);
	}

	public String getAutoReceiptActualInd()
	{
		return (String) readProperty("autoReceiptActualInd");
	}

	public void setAutoReceiptInd(String autoReceiptInd)
	{
		writeProperty("autoReceiptInd", autoReceiptInd);
	}

	public String getAutoReceiptInd()
	{
		return (String) readProperty("autoReceiptInd");
	}

	public void setAutoSamplingCompNum(Integer autoSamplingCompNum)
	{
		writeProperty("autoSamplingCompNum", autoSamplingCompNum);
	}

	public Integer getAutoSamplingCompNum()
	{
		return (Integer) readProperty("autoSamplingCompNum");
	}

	public void setAutoSamplingInd(String autoSamplingInd)
	{
		writeProperty("autoSamplingInd", autoSamplingInd);
	}

	public String getAutoSamplingInd()
	{
		return (String) readProperty("autoSamplingInd");
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

	public void setConfirmationDate(Date confirmationDate)
	{
		writeProperty("confirmationDate", confirmationDate);
	}

	public Date getConfirmationDate()
	{
		return (Date) readProperty("confirmationDate");
	}

	public void setCrAnlyInit(String crAnlyInit)
	{
		writeProperty("crAnlyInit", crAnlyInit);
	}

	public String getCrAnlyInit()
	{
		return (String) readProperty("crAnlyInit");
	}

	public void setCrClearInd(String crClearInd)
	{
		writeProperty("crClearInd", crClearInd);
	}

	public String getCrClearInd()
	{
		return (String) readProperty("crClearInd");
	}

	public void setCreditTermCode(String creditTermCode)
	{
		writeProperty("creditTermCode", creditTermCode);
	}

	public String getCreditTermCode()
	{
		return (String) readProperty("creditTermCode");
	}

	public void setDelTermCode(String delTermCode)
	{
		writeProperty("delTermCode", delTermCode);
	}

	public String getDelTermCode()
	{
		return (String) readProperty("delTermCode");
	}

	public void setDestLocCode(String destLocCode)
	{
		writeProperty("destLocCode", destLocCode);
	}

	public String getDestLocCode()
	{
		return (String) readProperty("destLocCode");
	}

	public void setEstimateEventDate(Date estimateEventDate)
	{
		writeProperty("estimateEventDate", estimateEventDate);
	}

	public Date getEstimateEventDate()
	{
		return (Date) readProperty("estimateEventDate");
	}

	public void setFinalDestLocCode(String finalDestLocCode)
	{
		writeProperty("finalDestLocCode", finalDestLocCode);
	}

	public String getFinalDestLocCode()
	{
		return (String) readProperty("finalDestLocCode");
	}

	public void setFinanceBankNum(Integer financeBankNum)
	{
		writeProperty("financeBankNum", financeBankNum);
	}

	public Integer getFinanceBankNum()
	{
		return (Integer) readProperty("financeBankNum");
	}

	public void setFullyActualized(String fullyActualized)
	{
		writeProperty("fullyActualized", fullyActualized);
	}

	public String getFullyActualized()
	{
		return (String) readProperty("fullyActualized");
	}

	public void setImpRecInd(String impRecInd)
	{
		writeProperty("impRecInd", impRecInd);
	}

	public String getImpRecInd()
	{
		return (String) readProperty("impRecInd");
	}

	public void setImpRecReasonOid(Integer impRecReasonOid)
	{
		writeProperty("impRecReasonOid", impRecReasonOid);
	}

	public Integer getImpRecReasonOid()
	{
		return (Integer) readProperty("impRecReasonOid");
	}

	public void setInspAcctNum(Integer inspAcctNum)
	{
		writeProperty("inspAcctNum", inspAcctNum);
	}

	public Integer getInspAcctNum()
	{
		return (Integer) readProperty("inspAcctNum");
	}

	public void setInspectionDate(Date inspectionDate)
	{
		writeProperty("inspectionDate", inspectionDate);
	}

	public Date getInspectionDate()
	{
		return (Date) readProperty("inspectionDate");
	}

	public void setInspectorPercent(Short inspectorPercent)
	{
		writeProperty("inspectorPercent", inspectorPercent);
	}

	public Short getInspectorPercent()
	{
		return (Short) readProperty("inspectorPercent");
	}

	public void setInvNum(Integer invNum)
	{
		writeProperty("invNum", invNum);
	}

	public Integer getInvNum()
	{
		return (Integer) readProperty("invNum");
	}

	public void setItemNum(Short itemNum)
	{
		writeProperty("itemNum", itemNum);
	}

	public Short getItemNum()
	{
		return (Short) readProperty("itemNum");
	}

	public void setLcNum(Integer lcNum)
	{
		writeProperty("lcNum", lcNum);
	}

	public Integer getLcNum()
	{
		return (Integer) readProperty("lcNum");
	}

	public void setLoadPortLocCode(String loadPortLocCode)
	{
		writeProperty("loadPortLocCode", loadPortLocCode);
	}

	public String getLoadPortLocCode()
	{
		return (String) readProperty("loadPortLocCode");
	}

	public void setMaxAiEstActualNum(Short maxAiEstActualNum)
	{
		writeProperty("maxAiEstActualNum", maxAiEstActualNum);
	}

	public Short getMaxAiEstActualNum()
	{
		return (Short) readProperty("maxAiEstActualNum");
	}

	public void setNetNomNum(Short netNomNum)
	{
		writeProperty("netNomNum", netNomNum);
	}

	public Short getNetNomNum()
	{
		return (Short) readProperty("netNomNum");
	}

	public void setNominDateFrom(Date nominDateFrom)
	{
		writeProperty("nominDateFrom", nominDateFrom);
	}

	public Date getNominDateFrom()
	{
		return (Date) readProperty("nominDateFrom");
	}

	public void setNominDateTo(Date nominDateTo)
	{
		writeProperty("nominDateTo", nominDateTo);
	}

	public Date getNominDateTo()
	{
		return (Date) readProperty("nominDateTo");
	}

	public void setNominQtyMax(Double nominQtyMax)
	{
		writeProperty("nominQtyMax", nominQtyMax);
	}

	public Double getNominQtyMax()
	{
		return (Double) readProperty("nominQtyMax");
	}

	public void setNominQtyMaxUomCode(String nominQtyMaxUomCode)
	{
		writeProperty("nominQtyMaxUomCode", nominQtyMaxUomCode);
	}

	public String getNominQtyMaxUomCode()
	{
		return (String) readProperty("nominQtyMaxUomCode");
	}

	public void setNominQtyMin(Double nominQtyMin)
	{
		writeProperty("nominQtyMin", nominQtyMin);
	}

	public Double getNominQtyMin()
	{
		return (Double) readProperty("nominQtyMin");
	}

	public void setNominQtyMinUomCode(String nominQtyMinUomCode)
	{
		writeProperty("nominQtyMinUomCode", nominQtyMinUomCode);
	}

	public String getNominQtyMinUomCode()
	{
		return (String) readProperty("nominQtyMinUomCode");
	}

	public void setOrderNum(Short orderNum)
	{
		writeProperty("orderNum", orderNum);
	}

	public Short getOrderNum()
	{
		return (Short) readProperty("orderNum");
	}

	public void setOriginLocCode(String originLocCode)
	{
		writeProperty("originLocCode", originLocCode);
	}

	public String getOriginLocCode()
	{
		return (String) readProperty("originLocCode");
	}

	public void setPayDays(Short payDays)
	{
		writeProperty("payDays", payDays);
	}

	public Short getPayDays()
	{
		return (Short) readProperty("payDays");
	}

	public void setPayTermCode(String payTermCode)
	{
		writeProperty("payTermCode", payTermCode);
	}

	public String getPayTermCode()
	{
		return (String) readProperty("payTermCode");
	}

	public void setPurchasingGroup(String purchasingGroup)
	{
		writeProperty("purchasingGroup", purchasingGroup);
	}

	public String getPurchasingGroup()
	{
		return (String) readProperty("purchasingGroup");
	}

	public void setRecapItemNum(Integer recapItemNum)
	{
		writeProperty("recapItemNum", recapItemNum);
	}

	public Integer getRecapItemNum()
	{
		return (Integer) readProperty("recapItemNum");
	}

	public void setReportingDate(Date reportingDate)
	{
		writeProperty("reportingDate", reportingDate);
	}

	public Date getReportingDate()
	{
		return (Date) readProperty("reportingDate");
	}

	public void setRespTransId(Integer respTransId)
	{
		writeProperty("respTransId", respTransId);
	}

	public Integer getRespTransId()
	{
		return (Integer) readProperty("respTransId");
	}

	public void setSapDeliveryLineItemNum(String sapDeliveryLineItemNum)
	{
		writeProperty("sapDeliveryLineItemNum", sapDeliveryLineItemNum);
	}

	public String getSapDeliveryLineItemNum()
	{
		return (String) readProperty("sapDeliveryLineItemNum");
	}

	public void setSapDeliveryNum(String sapDeliveryNum)
	{
		writeProperty("sapDeliveryNum", sapDeliveryNum);
	}

	public String getSapDeliveryNum()
	{
		return (String) readProperty("sapDeliveryNum");
	}

	public void setSchQty(Double schQty)
	{
		writeProperty("schQty", schQty);
	}

	public Double getSchQty()
	{
		return (Double) readProperty("schQty");
	}

	public void setSchQtyPeriodicity(String schQtyPeriodicity)
	{
		writeProperty("schQtyPeriodicity", schQtyPeriodicity);
	}

	public String getSchQtyPeriodicity()
	{
		return (String) readProperty("schQtyPeriodicity");
	}

	public void setSchQtyUomCode(String schQtyUomCode)
	{
		writeProperty("schQtyUomCode", schQtyUomCode);
	}

	public String getSchQtyUomCode()
	{
		return (String) readProperty("schQtyUomCode");
	}

	public void setSecActualUomCode(String secActualUomCode)
	{
		writeProperty("secActualUomCode", secActualUomCode);
	}

	public String getSecActualUomCode()
	{
		return (String) readProperty("secActualUomCode");
	}

	public void setSecondaryActualQty(Double secondaryActualQty)
	{
		writeProperty("secondaryActualQty", secondaryActualQty);
	}

	public Double getSecondaryActualQty()
	{
		return (Double) readProperty("secondaryActualQty");
	}

	public void setShipAgentCompNum(Integer shipAgentCompNum)
	{
		writeProperty("shipAgentCompNum", shipAgentCompNum);
	}

	public Integer getShipAgentCompNum()
	{
		return (Integer) readProperty("shipAgentCompNum");
	}

	public void setShipBrokerCompNum(Integer shipBrokerCompNum)
	{
		writeProperty("shipBrokerCompNum", shipBrokerCompNum);
	}

	public Integer getShipBrokerCompNum()
	{
		return (Integer) readProperty("shipBrokerCompNum");
	}

	public void setSubAllocNum(Short subAllocNum)
	{
		writeProperty("subAllocNum", subAllocNum);
	}

	public Short getSubAllocNum()
	{
		return (Short) readProperty("subAllocNum");
	}

	public void setTitleTranDate(Date titleTranDate)
	{
		writeProperty("titleTranDate", titleTranDate);
	}

	public Date getTitleTranDate()
	{
		return (Date) readProperty("titleTranDate");
	}

	public void setTitleTranLocCode(String titleTranLocCode)
	{
		writeProperty("titleTranLocCode", titleTranLocCode);
	}

	public String getTitleTranLocCode()
	{
		return (String) readProperty("titleTranLocCode");
	}

	public void setTradeNum(Integer tradeNum)
	{
		writeProperty("tradeNum", tradeNum);
	}

	public Integer getTradeNum()
	{
		return (Integer) readProperty("tradeNum");
	}

	public void setTransId(Integer transId)
	{
		writeProperty("transId", transId);
	}

	public Integer getTransId()
	{
		return (Integer) readProperty("transId");
	}

	public void setTransferPrice(BigDecimal transferPrice)
	{
		writeProperty("transferPrice", transferPrice);
	}

	public BigDecimal getTransferPrice()
	{
		return (BigDecimal) readProperty("transferPrice");
	}

	public void setTransferPriceCurrCode(String transferPriceCurrCode)
	{
		writeProperty("transferPriceCurrCode", transferPriceCurrCode);
	}

	public String getTransferPriceCurrCode()
	{
		return (String) readProperty("transferPriceCurrCode");
	}

	public void setTransferPriceCurrCodeTo(String transferPriceCurrCodeTo)
	{
		writeProperty("transferPriceCurrCodeTo", transferPriceCurrCodeTo);
	}

	public String getTransferPriceCurrCodeTo()
	{
		return (String) readProperty("transferPriceCurrCodeTo");
	}

	public void setTransferPriceCurrencyRate(Double transferPriceCurrencyRate)
	{
		writeProperty("transferPriceCurrencyRate", transferPriceCurrencyRate);
	}

	public Double getTransferPriceCurrencyRate()
	{
		return (Double) readProperty("transferPriceCurrencyRate");
	}

	public void setTransferPriceUomCode(String transferPriceUomCode)
	{
		writeProperty("transferPriceUomCode", transferPriceUomCode);
	}

	public String getTransferPriceUomCode()
	{
		return (String) readProperty("transferPriceUomCode");
	}

	public void setVatInd(Boolean vatInd)
	{
		writeProperty("vatInd", vatInd);
	}

	public Boolean getVatInd()
	{
		return (Boolean) readProperty("vatInd");
	}

}
