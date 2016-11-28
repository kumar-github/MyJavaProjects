package com.tc.app.exchangemonitor.model.cayenne.persistent.auto;

import java.util.Date;
import java.util.List;

import org.apache.cayenne.CayenneDataObject;
import org.apache.cayenne.exp.Property;

import com.tc.app.exchangemonitor.model.cayenne.persistent.Account;
import com.tc.app.exchangemonitor.model.cayenne.persistent.BusCostFate;
import com.tc.app.exchangemonitor.model.cayenne.persistent.BusCostState;
import com.tc.app.exchangemonitor.model.cayenne.persistent.BusCostType;
import com.tc.app.exchangemonitor.model.cayenne.persistent.Commodity;
import com.tc.app.exchangemonitor.model.cayenne.persistent.Cost;
import com.tc.app.exchangemonitor.model.cayenne.persistent.CostCenter;
import com.tc.app.exchangemonitor.model.cayenne.persistent.CostContractLinks;
import com.tc.app.exchangemonitor.model.cayenne.persistent.CostOpLinks;
import com.tc.app.exchangemonitor.model.cayenne.persistent.CostOwner;
import com.tc.app.exchangemonitor.model.cayenne.persistent.CostRate;
import com.tc.app.exchangemonitor.model.cayenne.persistent.CostStatus;
import com.tc.app.exchangemonitor.model.cayenne.persistent.CostType;
import com.tc.app.exchangemonitor.model.cayenne.persistent.CostVesselLinks;
import com.tc.app.exchangemonitor.model.cayenne.persistent.CreditTerm;
import com.tc.app.exchangemonitor.model.cayenne.persistent.FinancialReconcil;
import com.tc.app.exchangemonitor.model.cayenne.persistent.IctsUser;
import com.tc.app.exchangemonitor.model.cayenne.persistent.PaymentMethod;
import com.tc.app.exchangemonitor.model.cayenne.persistent.PaymentTerm;
import com.tc.app.exchangemonitor.model.cayenne.persistent.TaxStatus;
import com.tc.app.exchangemonitor.model.cayenne.persistent.Uom;
import com.tc.app.exchangemonitor.model.cayenne.persistent.WbContractTcCostPerDay;

/**
 * Class _Cost was generated by Cayenne.
 * It is probably a good idea to avoid changing this class manually,
 * since it may be overwritten next time code is regenerated.
 * If you need to make any customizations, please use subclass.
 */
public abstract class _Cost extends CayenneDataObject
{

	private static final long serialVersionUID = 1L;

	public static final String COST_NUM_PK_COLUMN = "cost_num";

	public static final Property<String> ASSAY_FINAL_IND = new Property<String>("assayFinalInd");
	public static final Property<Date> BUS_COST_FATE_MOD_DATE = new Property<Date>("busCostFateModDate");
	public static final Property<Date> CASH_DATE = new Property<Date>("cashDate");
	public static final Property<Integer> CMNT_NUM = new Property<Integer>("cmntNum");
	public static final Property<String> COST_ACCRUAL_IND = new Property<String>("costAccrualInd");
	public static final Property<Double> COST_AMT = new Property<Double>("costAmt");
	public static final Property<String> COST_AMT_TYPE = new Property<String>("costAmtType");
	public static final Property<Date> COST_APPROVAL_DATE = new Property<Date>("costApprovalDate");
	public static final Property<String> COST_BOOK_COMP_SHORT_NAME = new Property<String>("costBookCompShortName");
	public static final Property<Double> COST_BOOK_EXCH_RATE = new Property<Double>("costBookExchRate");
	public static final Property<Date> COST_BOOK_PRD_DATE = new Property<Date>("costBookPrdDate");
	public static final Property<String> COST_CODE = new Property<String>("costCode");
	public static final Property<String> COST_CREDIT_IND = new Property<String>("costCreditInd");
	public static final Property<Double> COST_DRAWN_BAL_AMT = new Property<Double>("costDrawnBalAmt");
	public static final Property<Date> COST_DUE_DATE = new Property<Date>("costDueDate");
	public static final Property<Date> COST_DUE_DATE_MOD_DATE = new Property<Date>("costDueDateModDate");
	public static final Property<Date> COST_EFF_DATE = new Property<Date>("costEffDate");
	public static final Property<String> COST_EST_FINAL_IND = new Property<String>("costEstFinalInd");
	public static final Property<String> COST_GL_ACCT_CR_CODE = new Property<String>("costGlAcctCrCode");
	public static final Property<String> COST_GL_ACCT_DR_CODE = new Property<String>("costGlAcctDrCode");
	public static final Property<Date> COST_GL_ACCT_MOD_DATE = new Property<Date>("costGlAcctModDate");
	public static final Property<Date> COST_GL_BOOK_DATE = new Property<Date>("costGlBookDate");
	public static final Property<String> COST_GL_BOOK_TYPE_CODE = new Property<String>("costGlBookTypeCode");
	public static final Property<String> COST_GL_OFFSET_ACCT_CODE = new Property<String>("costGlOffsetAcctCode");
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
	public static final Property<String> COST_PRICE_EST_ACTUAL_IND = new Property<String>("costPriceEstActualInd");
	public static final Property<Date> COST_PRICE_MOD_DATE = new Property<Date>("costPriceModDate");
	public static final Property<String> COST_PRIM_SEC_IND = new Property<String>("costPrimSecInd");
	public static final Property<Double> COST_QTY = new Property<Double>("costQty");
	public static final Property<String> COST_QTY_EST_ACTUAL_IND = new Property<String>("costQtyEstActualInd");
	public static final Property<Short> COST_SEND_ID = new Property<Short>("costSendId");
	public static final Property<String> COST_SHORT_CMNT = new Property<String>("costShortCmnt");
	public static final Property<Double> COST_UNIT_PRICE = new Property<Double>("costUnitPrice");
	public static final Property<Double> COST_VOUCHERED_AMT = new Property<Double>("costVoucheredAmt");
	public static final Property<String> COST_XRATE_CONV_IND = new Property<String>("costXrateConvInd");
	public static final Property<Date> CREATION_DATE = new Property<Date>("creationDate");
	public static final Property<Integer> EFF_DATE_OVERRIDE_TRANS_ID = new Property<Integer>("effDateOverrideTransId");
	public static final Property<String> EXTERNAL_REF_KEY = new Property<String>("externalRefKey");
	public static final Property<Date> FIRST_ACCRUED_DATE = new Property<Date>("firstAccruedDate");
	public static final Property<String> INTERNAL_COST_IND = new Property<String>("internalCostInd");
	public static final Property<Integer> PARENT_COST_NUM = new Property<Integer>("parentCostNum");
	public static final Property<String> PO_NUMBER = new Property<String>("poNumber");
	public static final Property<Integer> PORT_NUM = new Property<Integer>("portNum");
	public static final Property<Integer> POS_GROUP_NUM = new Property<Integer>("posGroupNum");
	public static final Property<String> QTY_TYPE = new Property<String>("qtyType");
	public static final Property<Integer> TRANS_ID = new Property<Integer>("transId");
	public static final Property<Integer> VC_ACCT_NUM = new Property<Integer>("vcAcctNum");
	public static final Property<Account> ACCOUNT = new Property<Account>("account");
	public static final Property<Account> ACCOUNT1 = new Property<Account>("account1");
	public static final Property<Account> ACCOUNT2 = new Property<Account>("account2");
	public static final Property<BusCostFate> BUS_COST_FATE = new Property<BusCostFate>("busCostFate");
	public static final Property<BusCostState> BUS_COST_STATE = new Property<BusCostState>("busCostState");
	public static final Property<BusCostType> BUS_COST_TYPE = new Property<BusCostType>("busCostType");
	public static final Property<Commodity> COMMODITY = new Property<Commodity>("commodity");
	public static final Property<Commodity> COMMODITY1 = new Property<Commodity>("commodity1");
	public static final Property<CostOpLinks> COST = new Property<CostOpLinks>("cost");
	public static final Property<Cost> COST1 = new Property<Cost>("cost1");
	public static final Property<CostVesselLinks> COST2 = new Property<CostVesselLinks>("cost2");
	public static final Property<CostContractLinks> COST3 = new Property<CostContractLinks>("cost3");
	public static final Property<CostCenter> COST_CENTER = new Property<CostCenter>("costCenter");
	public static final Property<CostCenter> COST_CENTER1 = new Property<CostCenter>("costCenter1");
	public static final Property<CostOwner> COST_OWNER = new Property<CostOwner>("costOwner");
	public static final Property<CostRate> COST_RATE_O = new Property<CostRate>("costRateO");
	public static final Property<CostStatus> COST_STATUS = new Property<CostStatus>("costStatus");
	public static final Property<CostType> COST_TYPE = new Property<CostType>("costType");
	public static final Property<List<Cost>> COSTS = new Property<List<Cost>>("costs");
	public static final Property<CreditTerm> CREDIT_TERM = new Property<CreditTerm>("creditTerm");
	public static final Property<List<FinancialReconcil>> FINANCIAL_RECONCILS = new Property<List<FinancialReconcil>>("financialReconcils");
	public static final Property<IctsUser> ICTS_USER = new Property<IctsUser>("ictsUser");
	public static final Property<IctsUser> ICTS_USER1 = new Property<IctsUser>("ictsUser1");
	public static final Property<IctsUser> ICTS_USER2 = new Property<IctsUser>("ictsUser2");
	public static final Property<IctsUser> ICTS_USER3 = new Property<IctsUser>("ictsUser3");
	public static final Property<IctsUser> ICTS_USER4 = new Property<IctsUser>("ictsUser4");
	public static final Property<IctsUser> ICTS_USER5 = new Property<IctsUser>("ictsUser5");
	public static final Property<IctsUser> ICTS_USER6 = new Property<IctsUser>("ictsUser6");
	public static final Property<PaymentMethod> PAYMENT_METHOD = new Property<PaymentMethod>("paymentMethod");
	public static final Property<PaymentTerm> PAYMENT_TERM = new Property<PaymentTerm>("paymentTerm");
	public static final Property<TaxStatus> TAX_STATUS = new Property<TaxStatus>("taxStatus");
	public static final Property<Uom> UOM = new Property<Uom>("uom");
	public static final Property<Uom> UOM1 = new Property<Uom>("uom1");
	public static final Property<List<WbContractTcCostPerDay>> WB_CONTRACT_TC_COST_PER_DAYS = new Property<List<WbContractTcCostPerDay>>("wbContractTcCostPerDays");

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

	public void setCostBookCompShortName(String costBookCompShortName)
	{
		writeProperty("costBookCompShortName", costBookCompShortName);
	}

	public String getCostBookCompShortName()
	{
		return (String) readProperty("costBookCompShortName");
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

	public void setCostGlBookDate(Date costGlBookDate)
	{
		writeProperty("costGlBookDate", costGlBookDate);
	}

	public Date getCostGlBookDate()
	{
		return (Date) readProperty("costGlBookDate");
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

	public void setAccount(Account account)
	{
		setToOneTarget("account", account, true);
	}

	public Account getAccount()
	{
		return (Account) readProperty("account");
	}

	public void setAccount1(Account account1)
	{
		setToOneTarget("account1", account1, true);
	}

	public Account getAccount1()
	{
		return (Account) readProperty("account1");
	}

	public void setAccount2(Account account2)
	{
		setToOneTarget("account2", account2, true);
	}

	public Account getAccount2()
	{
		return (Account) readProperty("account2");
	}

	public void setBusCostFate(BusCostFate busCostFate)
	{
		setToOneTarget("busCostFate", busCostFate, true);
	}

	public BusCostFate getBusCostFate()
	{
		return (BusCostFate) readProperty("busCostFate");
	}

	public void setBusCostState(BusCostState busCostState)
	{
		setToOneTarget("busCostState", busCostState, true);
	}

	public BusCostState getBusCostState()
	{
		return (BusCostState) readProperty("busCostState");
	}

	public void setBusCostType(BusCostType busCostType)
	{
		setToOneTarget("busCostType", busCostType, true);
	}

	public BusCostType getBusCostType()
	{
		return (BusCostType) readProperty("busCostType");
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

	public void setCost(CostOpLinks cost)
	{
		setToOneTarget("cost", cost, true);
	}

	public CostOpLinks getCost()
	{
		return (CostOpLinks) readProperty("cost");
	}

	public void setCost1(Cost cost1)
	{
		setToOneTarget("cost1", cost1, true);
	}

	public Cost getCost1()
	{
		return (Cost) readProperty("cost1");
	}

	public void setCost2(CostVesselLinks cost2)
	{
		setToOneTarget("cost2", cost2, true);
	}

	public CostVesselLinks getCost2()
	{
		return (CostVesselLinks) readProperty("cost2");
	}

	public void setCost3(CostContractLinks cost3)
	{
		setToOneTarget("cost3", cost3, true);
	}

	public CostContractLinks getCost3()
	{
		return (CostContractLinks) readProperty("cost3");
	}

	public void setCostCenter(CostCenter costCenter)
	{
		setToOneTarget("costCenter", costCenter, true);
	}

	public CostCenter getCostCenter()
	{
		return (CostCenter) readProperty("costCenter");
	}

	public void setCostCenter1(CostCenter costCenter1)
	{
		setToOneTarget("costCenter1", costCenter1, true);
	}

	public CostCenter getCostCenter1()
	{
		return (CostCenter) readProperty("costCenter1");
	}

	public void setCostOwner(CostOwner costOwner)
	{
		setToOneTarget("costOwner", costOwner, true);
	}

	public CostOwner getCostOwner()
	{
		return (CostOwner) readProperty("costOwner");
	}

	public void setCostRateO(CostRate costRateO)
	{
		setToOneTarget("costRateO", costRateO, true);
	}

	public CostRate getCostRateO()
	{
		return (CostRate) readProperty("costRateO");
	}

	public void setCostStatus(CostStatus costStatus)
	{
		setToOneTarget("costStatus", costStatus, true);
	}

	public CostStatus getCostStatus()
	{
		return (CostStatus) readProperty("costStatus");
	}

	public void setCostType(CostType costType)
	{
		setToOneTarget("costType", costType, true);
	}

	public CostType getCostType()
	{
		return (CostType) readProperty("costType");
	}

	public void addToCosts(Cost obj)
	{
		addToManyTarget("costs", obj, true);
	}

	public void removeFromCosts(Cost obj)
	{
		removeToManyTarget("costs", obj, true);
	}

	@SuppressWarnings("unchecked")
	public List<Cost> getCosts()
	{
		return (List<Cost>) readProperty("costs");
	}

	public void setCreditTerm(CreditTerm creditTerm)
	{
		setToOneTarget("creditTerm", creditTerm, true);
	}

	public CreditTerm getCreditTerm()
	{
		return (CreditTerm) readProperty("creditTerm");
	}

	public void addToFinancialReconcils(FinancialReconcil obj)
	{
		addToManyTarget("financialReconcils", obj, true);
	}

	public void removeFromFinancialReconcils(FinancialReconcil obj)
	{
		removeToManyTarget("financialReconcils", obj, true);
	}

	@SuppressWarnings("unchecked")
	public List<FinancialReconcil> getFinancialReconcils()
	{
		return (List<FinancialReconcil>) readProperty("financialReconcils");
	}

	public void setIctsUser(IctsUser ictsUser)
	{
		setToOneTarget("ictsUser", ictsUser, true);
	}

	public IctsUser getIctsUser()
	{
		return (IctsUser) readProperty("ictsUser");
	}

	public void setIctsUser1(IctsUser ictsUser1)
	{
		setToOneTarget("ictsUser1", ictsUser1, true);
	}

	public IctsUser getIctsUser1()
	{
		return (IctsUser) readProperty("ictsUser1");
	}

	public void setIctsUser2(IctsUser ictsUser2)
	{
		setToOneTarget("ictsUser2", ictsUser2, true);
	}

	public IctsUser getIctsUser2()
	{
		return (IctsUser) readProperty("ictsUser2");
	}

	public void setIctsUser3(IctsUser ictsUser3)
	{
		setToOneTarget("ictsUser3", ictsUser3, true);
	}

	public IctsUser getIctsUser3()
	{
		return (IctsUser) readProperty("ictsUser3");
	}

	public void setIctsUser4(IctsUser ictsUser4)
	{
		setToOneTarget("ictsUser4", ictsUser4, true);
	}

	public IctsUser getIctsUser4()
	{
		return (IctsUser) readProperty("ictsUser4");
	}

	public void setIctsUser5(IctsUser ictsUser5)
	{
		setToOneTarget("ictsUser5", ictsUser5, true);
	}

	public IctsUser getIctsUser5()
	{
		return (IctsUser) readProperty("ictsUser5");
	}

	public void setIctsUser6(IctsUser ictsUser6)
	{
		setToOneTarget("ictsUser6", ictsUser6, true);
	}

	public IctsUser getIctsUser6()
	{
		return (IctsUser) readProperty("ictsUser6");
	}

	public void setPaymentMethod(PaymentMethod paymentMethod)
	{
		setToOneTarget("paymentMethod", paymentMethod, true);
	}

	public PaymentMethod getPaymentMethod()
	{
		return (PaymentMethod) readProperty("paymentMethod");
	}

	public void setPaymentTerm(PaymentTerm paymentTerm)
	{
		setToOneTarget("paymentTerm", paymentTerm, true);
	}

	public PaymentTerm getPaymentTerm()
	{
		return (PaymentTerm) readProperty("paymentTerm");
	}

	public void setTaxStatus(TaxStatus taxStatus)
	{
		setToOneTarget("taxStatus", taxStatus, true);
	}

	public TaxStatus getTaxStatus()
	{
		return (TaxStatus) readProperty("taxStatus");
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

	public void addToWbContractTcCostPerDays(WbContractTcCostPerDay obj)
	{
		addToManyTarget("wbContractTcCostPerDays", obj, true);
	}

	public void removeFromWbContractTcCostPerDays(WbContractTcCostPerDay obj)
	{
		removeToManyTarget("wbContractTcCostPerDays", obj, true);
	}

	@SuppressWarnings("unchecked")
	public List<WbContractTcCostPerDay> getWbContractTcCostPerDays()
	{
		return (List<WbContractTcCostPerDay>) readProperty("wbContractTcCostPerDays");
	}

}