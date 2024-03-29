package com.tc.app.exchangemonitor.model.cayenne.persistent.auto;

import java.util.Date;

import org.apache.cayenne.CayenneDataObject;
import org.apache.cayenne.exp.Property;

/**
 * Class _VBcpAudCost90 was generated by Cayenne.
 * It is probably a good idea to avoid changing this class manually,
 * since it may be overwritten next time code is regenerated.
 * If you need to make any customizations, please use subclass.
 */
public abstract class _VBcpAudCost90 extends CayenneDataObject
{

	private static final long serialVersionUID = 1L;

	public static final Property<Integer> ACCT_NUM = new Property<Integer>("acctNum");
	public static final Property<String> ASSAY_FINAL_IND = new Property<String>("assayFinalInd");
	public static final Property<Date> BUS_COST_FATE_MOD_DATE = new Property<Date>("busCostFateModDate");
	public static final Property<String> BUS_COST_FATE_MOD_INIT = new Property<String>("busCostFateModInit");
	public static final Property<Short> BUS_COST_FATE_NUM = new Property<Short>("busCostFateNum");
	public static final Property<Short> BUS_COST_STATE_NUM = new Property<Short>("busCostStateNum");
	public static final Property<Short> BUS_COST_TYPE_NUM = new Property<Short>("busCostTypeNum");
	public static final Property<Date> CASH_DATE = new Property<Date>("cashDate");
	public static final Property<Integer> CMNT_NUM = new Property<Integer>("cmntNum");
	public static final Property<String> COST_ACCRUAL_IND = new Property<String>("costAccrualInd");
	public static final Property<Double> COST_AMT = new Property<Double>("costAmt");
	public static final Property<String> COST_AMT_TYPE = new Property<String>("costAmtType");
	public static final Property<Date> COST_APPROVAL_DATE = new Property<Date>("costApprovalDate");
	public static final Property<String> COST_APPROVAL_INIT = new Property<String>("costApprovalInit");
	public static final Property<Integer> COST_BOOK_COMP_NUM = new Property<Integer>("costBookCompNum");
	public static final Property<String> COST_BOOK_COMP_SHORT_NAME = new Property<String>("costBookCompShortName");
	public static final Property<String> COST_BOOK_CURR_CODE = new Property<String>("costBookCurrCode");
	public static final Property<Double> COST_BOOK_EXCH_RATE = new Property<Double>("costBookExchRate");
	public static final Property<Date> COST_BOOK_PRD_DATE = new Property<Date>("costBookPrdDate");
	public static final Property<String> COST_CENTER_CODE_CREDIT = new Property<String>("costCenterCodeCredit");
	public static final Property<String> COST_CENTER_CODE_DEBT = new Property<String>("costCenterCodeDebt");
	public static final Property<String> COST_CODE = new Property<String>("costCode");
	public static final Property<String> COST_CREDIT_IND = new Property<String>("costCreditInd");
	public static final Property<Double> COST_DRAWN_BAL_AMT = new Property<Double>("costDrawnBalAmt");
	public static final Property<Date> COST_DUE_DATE = new Property<Date>("costDueDate");
	public static final Property<Date> COST_DUE_DATE_MOD_DATE = new Property<Date>("costDueDateModDate");
	public static final Property<String> COST_DUE_DATE_MOD_INIT = new Property<String>("costDueDateModInit");
	public static final Property<Date> COST_EFF_DATE = new Property<Date>("costEffDate");
	public static final Property<String> COST_EST_FINAL_IND = new Property<String>("costEstFinalInd");
	public static final Property<String> COST_GL_ACCT_CR_CODE = new Property<String>("costGlAcctCrCode");
	public static final Property<String> COST_GL_ACCT_DR_CODE = new Property<String>("costGlAcctDrCode");
	public static final Property<Date> COST_GL_ACCT_MOD_DATE = new Property<Date>("costGlAcctModDate");
	public static final Property<String> COST_GL_ACCT_MOD_INIT = new Property<String>("costGlAcctModInit");
	public static final Property<Date> COST_GL_BOOK_DATE = new Property<Date>("costGlBookDate");
	public static final Property<String> COST_GL_BOOK_INIT = new Property<String>("costGlBookInit");
	public static final Property<String> COST_GL_BOOK_TYPE_CODE = new Property<String>("costGlBookTypeCode");
	public static final Property<String> COST_GL_OFFSET_ACCT_CODE = new Property<String>("costGlOffsetAcctCode");
	public static final Property<Integer> COST_NUM = new Property<Integer>("costNum");
	public static final Property<String> COST_OWNER_CODE = new Property<String>("costOwnerCode");
	public static final Property<Integer> COST_OWNER_KEY1 = new Property<Integer>("costOwnerKey1");
	public static final Property<Integer> COST_OWNER_KEY2 = new Property<Integer>("costOwnerKey2");
	public static final Property<Integer> COST_OWNER_KEY3 = new Property<Integer>("costOwnerKey3");
	public static final Property<Integer> COST_OWNER_KEY4 = new Property<Integer>("costOwnerKey4");
	public static final Property<Integer> COST_OWNER_KEY5 = new Property<Integer>("costOwnerKey5");
	public static final Property<Integer> COST_OWNER_KEY6 = new Property<Integer>("costOwnerKey6");
	public static final Property<Integer> COST_OWNER_KEY7 = new Property<Integer>("costOwnerKey7");
	public static final Property<Integer> COST_OWNER_KEY8 = new Property<Integer>("costOwnerKey8");
	public static final Property<Date> COST_PAID_DATE = new Property<Date>("costPaidDate");
	public static final Property<String> COST_PARTIAL_IND = new Property<String>("costPartialInd");
	public static final Property<Short> COST_PAY_DAYS = new Property<Short>("costPayDays");
	public static final Property<String> COST_PAY_REC_IND = new Property<String>("costPayRecInd");
	public static final Property<String> COST_PERIOD_IND = new Property<String>("costPeriodInd");
	public static final Property<String> COST_PL_CODE = new Property<String>("costPlCode");
	public static final Property<String> COST_PRICE_CURR_CODE = new Property<String>("costPriceCurrCode");
	public static final Property<String> COST_PRICE_EST_ACTUAL_IND = new Property<String>("costPriceEstActualInd");
	public static final Property<Date> COST_PRICE_MOD_DATE = new Property<Date>("costPriceModDate");
	public static final Property<String> COST_PRICE_MOD_INIT = new Property<String>("costPriceModInit");
	public static final Property<String> COST_PRICE_UOM_CODE = new Property<String>("costPriceUomCode");
	public static final Property<String> COST_PRIM_SEC_IND = new Property<String>("costPrimSecInd");
	public static final Property<Double> COST_QTY = new Property<Double>("costQty");
	public static final Property<String> COST_QTY_EST_ACTUAL_IND = new Property<String>("costQtyEstActualInd");
	public static final Property<String> COST_QTY_UOM_CODE = new Property<String>("costQtyUomCode");
	public static final Property<Integer> COST_RATE_OID = new Property<Integer>("costRateOid");
	public static final Property<Short> COST_SEND_ID = new Property<Short>("costSendId");
	public static final Property<String> COST_SHORT_CMNT = new Property<String>("costShortCmnt");
	public static final Property<String> COST_STATUS = new Property<String>("costStatus");
	public static final Property<String> COST_TYPE_CODE = new Property<String>("costTypeCode");
	public static final Property<Double> COST_UNIT_PRICE = new Property<Double>("costUnitPrice");
	public static final Property<Double> COST_VOUCHERED_AMT = new Property<Double>("costVoucheredAmt");
	public static final Property<String> COST_XRATE_CONV_IND = new Property<String>("costXrateConvInd");
	public static final Property<Date> CREATION_DATE = new Property<Date>("creationDate");
	public static final Property<String> CREATOR_INIT = new Property<String>("creatorInit");
	public static final Property<String> CREDIT_TERM_CODE = new Property<String>("creditTermCode");
	public static final Property<Integer> EFF_DATE_OVERRIDE_TRANS_ID = new Property<Integer>("effDateOverrideTransId");
	public static final Property<String> EXTERNAL_REF_KEY = new Property<String>("externalRefKey");
	public static final Property<Integer> FINANCE_BANK_NUM = new Property<Integer>("financeBankNum");
	public static final Property<Date> FIRST_ACCRUED_DATE = new Property<Date>("firstAccruedDate");
	public static final Property<String> INTERNAL_COST_IND = new Property<String>("internalCostInd");
	public static final Property<Integer> PARENT_COST_NUM = new Property<Integer>("parentCostNum");
	public static final Property<String> PAY_METHOD_CODE = new Property<String>("payMethodCode");
	public static final Property<String> PAY_TERM_CODE = new Property<String>("payTermCode");
	public static final Property<String> PO_NUMBER = new Property<String>("poNumber");
	public static final Property<Integer> PORT_NUM = new Property<Integer>("portNum");
	public static final Property<Integer> POS_GROUP_NUM = new Property<Integer>("posGroupNum");
	public static final Property<String> QTY_TYPE = new Property<String>("qtyType");
	public static final Property<Integer> RESP_TRANS_ID = new Property<Integer>("respTransId");
	public static final Property<String> TAX_STATUS_CODE = new Property<String>("taxStatusCode");
	public static final Property<Integer> TEMPLATE_COST_NUM = new Property<Integer>("templateCostNum");
	public static final Property<Integer> TRANS_ID = new Property<Integer>("transId");
	public static final Property<Integer> VC_ACCT_NUM = new Property<Integer>("vcAcctNum");

	public void setAcctNum(Integer acctNum)
	{
		writeProperty("acctNum", acctNum);
	}

	public Integer getAcctNum()
	{
		return (Integer) readProperty("acctNum");
	}

	public void setAssayFinalInd(String assayFinalInd)
	{
		writeProperty("assayFinalInd", assayFinalInd);
	}

	public String getAssayFinalInd()
	{
		return (String) readProperty("assayFinalInd");
	}

	public void setBusCostFateModDate(Date busCostFateModDate)
	{
		writeProperty("busCostFateModDate", busCostFateModDate);
	}

	public Date getBusCostFateModDate()
	{
		return (Date) readProperty("busCostFateModDate");
	}

	public void setBusCostFateModInit(String busCostFateModInit)
	{
		writeProperty("busCostFateModInit", busCostFateModInit);
	}

	public String getBusCostFateModInit()
	{
		return (String) readProperty("busCostFateModInit");
	}

	public void setBusCostFateNum(Short busCostFateNum)
	{
		writeProperty("busCostFateNum", busCostFateNum);
	}

	public Short getBusCostFateNum()
	{
		return (Short) readProperty("busCostFateNum");
	}

	public void setBusCostStateNum(Short busCostStateNum)
	{
		writeProperty("busCostStateNum", busCostStateNum);
	}

	public Short getBusCostStateNum()
	{
		return (Short) readProperty("busCostStateNum");
	}

	public void setBusCostTypeNum(Short busCostTypeNum)
	{
		writeProperty("busCostTypeNum", busCostTypeNum);
	}

	public Short getBusCostTypeNum()
	{
		return (Short) readProperty("busCostTypeNum");
	}

	public void setCashDate(Date cashDate)
	{
		writeProperty("cashDate", cashDate);
	}

	public Date getCashDate()
	{
		return (Date) readProperty("cashDate");
	}

	public void setCmntNum(Integer cmntNum)
	{
		writeProperty("cmntNum", cmntNum);
	}

	public Integer getCmntNum()
	{
		return (Integer) readProperty("cmntNum");
	}

	public void setCostAccrualInd(String costAccrualInd)
	{
		writeProperty("costAccrualInd", costAccrualInd);
	}

	public String getCostAccrualInd()
	{
		return (String) readProperty("costAccrualInd");
	}

	public void setCostAmt(Double costAmt)
	{
		writeProperty("costAmt", costAmt);
	}

	public Double getCostAmt()
	{
		return (Double) readProperty("costAmt");
	}

	public void setCostAmtType(String costAmtType)
	{
		writeProperty("costAmtType", costAmtType);
	}

	public String getCostAmtType()
	{
		return (String) readProperty("costAmtType");
	}

	public void setCostApprovalDate(Date costApprovalDate)
	{
		writeProperty("costApprovalDate", costApprovalDate);
	}

	public Date getCostApprovalDate()
	{
		return (Date) readProperty("costApprovalDate");
	}

	public void setCostApprovalInit(String costApprovalInit)
	{
		writeProperty("costApprovalInit", costApprovalInit);
	}

	public String getCostApprovalInit()
	{
		return (String) readProperty("costApprovalInit");
	}

	public void setCostBookCompNum(Integer costBookCompNum)
	{
		writeProperty("costBookCompNum", costBookCompNum);
	}

	public Integer getCostBookCompNum()
	{
		return (Integer) readProperty("costBookCompNum");
	}

	public void setCostBookCompShortName(String costBookCompShortName)
	{
		writeProperty("costBookCompShortName", costBookCompShortName);
	}

	public String getCostBookCompShortName()
	{
		return (String) readProperty("costBookCompShortName");
	}

	public void setCostBookCurrCode(String costBookCurrCode)
	{
		writeProperty("costBookCurrCode", costBookCurrCode);
	}

	public String getCostBookCurrCode()
	{
		return (String) readProperty("costBookCurrCode");
	}

	public void setCostBookExchRate(Double costBookExchRate)
	{
		writeProperty("costBookExchRate", costBookExchRate);
	}

	public Double getCostBookExchRate()
	{
		return (Double) readProperty("costBookExchRate");
	}

	public void setCostBookPrdDate(Date costBookPrdDate)
	{
		writeProperty("costBookPrdDate", costBookPrdDate);
	}

	public Date getCostBookPrdDate()
	{
		return (Date) readProperty("costBookPrdDate");
	}

	public void setCostCenterCodeCredit(String costCenterCodeCredit)
	{
		writeProperty("costCenterCodeCredit", costCenterCodeCredit);
	}

	public String getCostCenterCodeCredit()
	{
		return (String) readProperty("costCenterCodeCredit");
	}

	public void setCostCenterCodeDebt(String costCenterCodeDebt)
	{
		writeProperty("costCenterCodeDebt", costCenterCodeDebt);
	}

	public String getCostCenterCodeDebt()
	{
		return (String) readProperty("costCenterCodeDebt");
	}

	public void setCostCode(String costCode)
	{
		writeProperty("costCode", costCode);
	}

	public String getCostCode()
	{
		return (String) readProperty("costCode");
	}

	public void setCostCreditInd(String costCreditInd)
	{
		writeProperty("costCreditInd", costCreditInd);
	}

	public String getCostCreditInd()
	{
		return (String) readProperty("costCreditInd");
	}

	public void setCostDrawnBalAmt(Double costDrawnBalAmt)
	{
		writeProperty("costDrawnBalAmt", costDrawnBalAmt);
	}

	public Double getCostDrawnBalAmt()
	{
		return (Double) readProperty("costDrawnBalAmt");
	}

	public void setCostDueDate(Date costDueDate)
	{
		writeProperty("costDueDate", costDueDate);
	}

	public Date getCostDueDate()
	{
		return (Date) readProperty("costDueDate");
	}

	public void setCostDueDateModDate(Date costDueDateModDate)
	{
		writeProperty("costDueDateModDate", costDueDateModDate);
	}

	public Date getCostDueDateModDate()
	{
		return (Date) readProperty("costDueDateModDate");
	}

	public void setCostDueDateModInit(String costDueDateModInit)
	{
		writeProperty("costDueDateModInit", costDueDateModInit);
	}

	public String getCostDueDateModInit()
	{
		return (String) readProperty("costDueDateModInit");
	}

	public void setCostEffDate(Date costEffDate)
	{
		writeProperty("costEffDate", costEffDate);
	}

	public Date getCostEffDate()
	{
		return (Date) readProperty("costEffDate");
	}

	public void setCostEstFinalInd(String costEstFinalInd)
	{
		writeProperty("costEstFinalInd", costEstFinalInd);
	}

	public String getCostEstFinalInd()
	{
		return (String) readProperty("costEstFinalInd");
	}

	public void setCostGlAcctCrCode(String costGlAcctCrCode)
	{
		writeProperty("costGlAcctCrCode", costGlAcctCrCode);
	}

	public String getCostGlAcctCrCode()
	{
		return (String) readProperty("costGlAcctCrCode");
	}

	public void setCostGlAcctDrCode(String costGlAcctDrCode)
	{
		writeProperty("costGlAcctDrCode", costGlAcctDrCode);
	}

	public String getCostGlAcctDrCode()
	{
		return (String) readProperty("costGlAcctDrCode");
	}

	public void setCostGlAcctModDate(Date costGlAcctModDate)
	{
		writeProperty("costGlAcctModDate", costGlAcctModDate);
	}

	public Date getCostGlAcctModDate()
	{
		return (Date) readProperty("costGlAcctModDate");
	}

	public void setCostGlAcctModInit(String costGlAcctModInit)
	{
		writeProperty("costGlAcctModInit", costGlAcctModInit);
	}

	public String getCostGlAcctModInit()
	{
		return (String) readProperty("costGlAcctModInit");
	}

	public void setCostGlBookDate(Date costGlBookDate)
	{
		writeProperty("costGlBookDate", costGlBookDate);
	}

	public Date getCostGlBookDate()
	{
		return (Date) readProperty("costGlBookDate");
	}

	public void setCostGlBookInit(String costGlBookInit)
	{
		writeProperty("costGlBookInit", costGlBookInit);
	}

	public String getCostGlBookInit()
	{
		return (String) readProperty("costGlBookInit");
	}

	public void setCostGlBookTypeCode(String costGlBookTypeCode)
	{
		writeProperty("costGlBookTypeCode", costGlBookTypeCode);
	}

	public String getCostGlBookTypeCode()
	{
		return (String) readProperty("costGlBookTypeCode");
	}

	public void setCostGlOffsetAcctCode(String costGlOffsetAcctCode)
	{
		writeProperty("costGlOffsetAcctCode", costGlOffsetAcctCode);
	}

	public String getCostGlOffsetAcctCode()
	{
		return (String) readProperty("costGlOffsetAcctCode");
	}

	public void setCostNum(Integer costNum)
	{
		writeProperty("costNum", costNum);
	}

	public Integer getCostNum()
	{
		return (Integer) readProperty("costNum");
	}

	public void setCostOwnerCode(String costOwnerCode)
	{
		writeProperty("costOwnerCode", costOwnerCode);
	}

	public String getCostOwnerCode()
	{
		return (String) readProperty("costOwnerCode");
	}

	public void setCostOwnerKey1(Integer costOwnerKey1)
	{
		writeProperty("costOwnerKey1", costOwnerKey1);
	}

	public Integer getCostOwnerKey1()
	{
		return (Integer) readProperty("costOwnerKey1");
	}

	public void setCostOwnerKey2(Integer costOwnerKey2)
	{
		writeProperty("costOwnerKey2", costOwnerKey2);
	}

	public Integer getCostOwnerKey2()
	{
		return (Integer) readProperty("costOwnerKey2");
	}

	public void setCostOwnerKey3(Integer costOwnerKey3)
	{
		writeProperty("costOwnerKey3", costOwnerKey3);
	}

	public Integer getCostOwnerKey3()
	{
		return (Integer) readProperty("costOwnerKey3");
	}

	public void setCostOwnerKey4(Integer costOwnerKey4)
	{
		writeProperty("costOwnerKey4", costOwnerKey4);
	}

	public Integer getCostOwnerKey4()
	{
		return (Integer) readProperty("costOwnerKey4");
	}

	public void setCostOwnerKey5(Integer costOwnerKey5)
	{
		writeProperty("costOwnerKey5", costOwnerKey5);
	}

	public Integer getCostOwnerKey5()
	{
		return (Integer) readProperty("costOwnerKey5");
	}

	public void setCostOwnerKey6(Integer costOwnerKey6)
	{
		writeProperty("costOwnerKey6", costOwnerKey6);
	}

	public Integer getCostOwnerKey6()
	{
		return (Integer) readProperty("costOwnerKey6");
	}

	public void setCostOwnerKey7(Integer costOwnerKey7)
	{
		writeProperty("costOwnerKey7", costOwnerKey7);
	}

	public Integer getCostOwnerKey7()
	{
		return (Integer) readProperty("costOwnerKey7");
	}

	public void setCostOwnerKey8(Integer costOwnerKey8)
	{
		writeProperty("costOwnerKey8", costOwnerKey8);
	}

	public Integer getCostOwnerKey8()
	{
		return (Integer) readProperty("costOwnerKey8");
	}

	public void setCostPaidDate(Date costPaidDate)
	{
		writeProperty("costPaidDate", costPaidDate);
	}

	public Date getCostPaidDate()
	{
		return (Date) readProperty("costPaidDate");
	}

	public void setCostPartialInd(String costPartialInd)
	{
		writeProperty("costPartialInd", costPartialInd);
	}

	public String getCostPartialInd()
	{
		return (String) readProperty("costPartialInd");
	}

	public void setCostPayDays(Short costPayDays)
	{
		writeProperty("costPayDays", costPayDays);
	}

	public Short getCostPayDays()
	{
		return (Short) readProperty("costPayDays");
	}

	public void setCostPayRecInd(String costPayRecInd)
	{
		writeProperty("costPayRecInd", costPayRecInd);
	}

	public String getCostPayRecInd()
	{
		return (String) readProperty("costPayRecInd");
	}

	public void setCostPeriodInd(String costPeriodInd)
	{
		writeProperty("costPeriodInd", costPeriodInd);
	}

	public String getCostPeriodInd()
	{
		return (String) readProperty("costPeriodInd");
	}

	public void setCostPlCode(String costPlCode)
	{
		writeProperty("costPlCode", costPlCode);
	}

	public String getCostPlCode()
	{
		return (String) readProperty("costPlCode");
	}

	public void setCostPriceCurrCode(String costPriceCurrCode)
	{
		writeProperty("costPriceCurrCode", costPriceCurrCode);
	}

	public String getCostPriceCurrCode()
	{
		return (String) readProperty("costPriceCurrCode");
	}

	public void setCostPriceEstActualInd(String costPriceEstActualInd)
	{
		writeProperty("costPriceEstActualInd", costPriceEstActualInd);
	}

	public String getCostPriceEstActualInd()
	{
		return (String) readProperty("costPriceEstActualInd");
	}

	public void setCostPriceModDate(Date costPriceModDate)
	{
		writeProperty("costPriceModDate", costPriceModDate);
	}

	public Date getCostPriceModDate()
	{
		return (Date) readProperty("costPriceModDate");
	}

	public void setCostPriceModInit(String costPriceModInit)
	{
		writeProperty("costPriceModInit", costPriceModInit);
	}

	public String getCostPriceModInit()
	{
		return (String) readProperty("costPriceModInit");
	}

	public void setCostPriceUomCode(String costPriceUomCode)
	{
		writeProperty("costPriceUomCode", costPriceUomCode);
	}

	public String getCostPriceUomCode()
	{
		return (String) readProperty("costPriceUomCode");
	}

	public void setCostPrimSecInd(String costPrimSecInd)
	{
		writeProperty("costPrimSecInd", costPrimSecInd);
	}

	public String getCostPrimSecInd()
	{
		return (String) readProperty("costPrimSecInd");
	}

	public void setCostQty(Double costQty)
	{
		writeProperty("costQty", costQty);
	}

	public Double getCostQty()
	{
		return (Double) readProperty("costQty");
	}

	public void setCostQtyEstActualInd(String costQtyEstActualInd)
	{
		writeProperty("costQtyEstActualInd", costQtyEstActualInd);
	}

	public String getCostQtyEstActualInd()
	{
		return (String) readProperty("costQtyEstActualInd");
	}

	public void setCostQtyUomCode(String costQtyUomCode)
	{
		writeProperty("costQtyUomCode", costQtyUomCode);
	}

	public String getCostQtyUomCode()
	{
		return (String) readProperty("costQtyUomCode");
	}

	public void setCostRateOid(Integer costRateOid)
	{
		writeProperty("costRateOid", costRateOid);
	}

	public Integer getCostRateOid()
	{
		return (Integer) readProperty("costRateOid");
	}

	public void setCostSendId(Short costSendId)
	{
		writeProperty("costSendId", costSendId);
	}

	public Short getCostSendId()
	{
		return (Short) readProperty("costSendId");
	}

	public void setCostShortCmnt(String costShortCmnt)
	{
		writeProperty("costShortCmnt", costShortCmnt);
	}

	public String getCostShortCmnt()
	{
		return (String) readProperty("costShortCmnt");
	}

	public void setCostStatus(String costStatus)
	{
		writeProperty("costStatus", costStatus);
	}

	public String getCostStatus()
	{
		return (String) readProperty("costStatus");
	}

	public void setCostTypeCode(String costTypeCode)
	{
		writeProperty("costTypeCode", costTypeCode);
	}

	public String getCostTypeCode()
	{
		return (String) readProperty("costTypeCode");
	}

	public void setCostUnitPrice(Double costUnitPrice)
	{
		writeProperty("costUnitPrice", costUnitPrice);
	}

	public Double getCostUnitPrice()
	{
		return (Double) readProperty("costUnitPrice");
	}

	public void setCostVoucheredAmt(Double costVoucheredAmt)
	{
		writeProperty("costVoucheredAmt", costVoucheredAmt);
	}

	public Double getCostVoucheredAmt()
	{
		return (Double) readProperty("costVoucheredAmt");
	}

	public void setCostXrateConvInd(String costXrateConvInd)
	{
		writeProperty("costXrateConvInd", costXrateConvInd);
	}

	public String getCostXrateConvInd()
	{
		return (String) readProperty("costXrateConvInd");
	}

	public void setCreationDate(Date creationDate)
	{
		writeProperty("creationDate", creationDate);
	}

	public Date getCreationDate()
	{
		return (Date) readProperty("creationDate");
	}

	public void setCreatorInit(String creatorInit)
	{
		writeProperty("creatorInit", creatorInit);
	}

	public String getCreatorInit()
	{
		return (String) readProperty("creatorInit");
	}

	public void setCreditTermCode(String creditTermCode)
	{
		writeProperty("creditTermCode", creditTermCode);
	}

	public String getCreditTermCode()
	{
		return (String) readProperty("creditTermCode");
	}

	public void setEffDateOverrideTransId(Integer effDateOverrideTransId)
	{
		writeProperty("effDateOverrideTransId", effDateOverrideTransId);
	}

	public Integer getEffDateOverrideTransId()
	{
		return (Integer) readProperty("effDateOverrideTransId");
	}

	public void setExternalRefKey(String externalRefKey)
	{
		writeProperty("externalRefKey", externalRefKey);
	}

	public String getExternalRefKey()
	{
		return (String) readProperty("externalRefKey");
	}

	public void setFinanceBankNum(Integer financeBankNum)
	{
		writeProperty("financeBankNum", financeBankNum);
	}

	public Integer getFinanceBankNum()
	{
		return (Integer) readProperty("financeBankNum");
	}

	public void setFirstAccruedDate(Date firstAccruedDate)
	{
		writeProperty("firstAccruedDate", firstAccruedDate);
	}

	public Date getFirstAccruedDate()
	{
		return (Date) readProperty("firstAccruedDate");
	}

	public void setInternalCostInd(String internalCostInd)
	{
		writeProperty("internalCostInd", internalCostInd);
	}

	public String getInternalCostInd()
	{
		return (String) readProperty("internalCostInd");
	}

	public void setParentCostNum(Integer parentCostNum)
	{
		writeProperty("parentCostNum", parentCostNum);
	}

	public Integer getParentCostNum()
	{
		return (Integer) readProperty("parentCostNum");
	}

	public void setPayMethodCode(String payMethodCode)
	{
		writeProperty("payMethodCode", payMethodCode);
	}

	public String getPayMethodCode()
	{
		return (String) readProperty("payMethodCode");
	}

	public void setPayTermCode(String payTermCode)
	{
		writeProperty("payTermCode", payTermCode);
	}

	public String getPayTermCode()
	{
		return (String) readProperty("payTermCode");
	}

	public void setPoNumber(String poNumber)
	{
		writeProperty("poNumber", poNumber);
	}

	public String getPoNumber()
	{
		return (String) readProperty("poNumber");
	}

	public void setPortNum(Integer portNum)
	{
		writeProperty("portNum", portNum);
	}

	public Integer getPortNum()
	{
		return (Integer) readProperty("portNum");
	}

	public void setPosGroupNum(Integer posGroupNum)
	{
		writeProperty("posGroupNum", posGroupNum);
	}

	public Integer getPosGroupNum()
	{
		return (Integer) readProperty("posGroupNum");
	}

	public void setQtyType(String qtyType)
	{
		writeProperty("qtyType", qtyType);
	}

	public String getQtyType()
	{
		return (String) readProperty("qtyType");
	}

	public void setRespTransId(Integer respTransId)
	{
		writeProperty("respTransId", respTransId);
	}

	public Integer getRespTransId()
	{
		return (Integer) readProperty("respTransId");
	}

	public void setTaxStatusCode(String taxStatusCode)
	{
		writeProperty("taxStatusCode", taxStatusCode);
	}

	public String getTaxStatusCode()
	{
		return (String) readProperty("taxStatusCode");
	}

	public void setTemplateCostNum(Integer templateCostNum)
	{
		writeProperty("templateCostNum", templateCostNum);
	}

	public Integer getTemplateCostNum()
	{
		return (Integer) readProperty("templateCostNum");
	}

	public void setTransId(Integer transId)
	{
		writeProperty("transId", transId);
	}

	public Integer getTransId()
	{
		return (Integer) readProperty("transId");
	}

	public void setVcAcctNum(Integer vcAcctNum)
	{
		writeProperty("vcAcctNum", vcAcctNum);
	}

	public Integer getVcAcctNum()
	{
		return (Integer) readProperty("vcAcctNum");
	}

}
