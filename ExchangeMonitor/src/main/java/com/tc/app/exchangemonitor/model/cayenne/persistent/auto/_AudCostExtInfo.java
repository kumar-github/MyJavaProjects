package com.tc.app.exchangemonitor.model.cayenne.persistent.auto;

import java.math.BigDecimal;

import org.apache.cayenne.CayenneDataObject;
import org.apache.cayenne.exp.Property;

/**
 * Class _AudCostExtInfo was generated by Cayenne.
 * It is probably a good idea to avoid changing this class manually,
 * since it may be overwritten next time code is regenerated.
 * If you need to make any customizations, please use subclass.
 */
public abstract class _AudCostExtInfo extends CayenneDataObject
{

	private static final long serialVersionUID = 1L;

	public static final Property<String> COST_DESC = new Property<String>("costDesc");
	public static final Property<Integer> COST_NUM = new Property<Integer>("costNum");
	public static final Property<String> COST_PL_CONTRIBUTION_IND = new Property<String>("costPlContributionInd");
	public static final Property<BigDecimal> CREATION_FX_RATE = new Property<BigDecimal>("creationFxRate");
	public static final Property<String> CREATION_RATE_MDIND = new Property<String>("creationRateMDInd");
	public static final Property<BigDecimal> DISCOUNT_RATE = new Property<BigDecimal>("discountRate");
	public static final Property<String> FX_COMPUTE_IND = new Property<String>("fxComputeInd");
	public static final Property<Integer> FX_EXP_NUM = new Property<Integer>("fxExpNum");
	public static final Property<Integer> FX_LINK_OID = new Property<Integer>("fxLinkOid");
	public static final Property<String> FX_LOCKING_STATUS = new Property<String>("fxLockingStatus");
	public static final Property<Integer> FX_REAL_PORT_NUM = new Property<Integer>("fxRealPortNum");
	public static final Property<Integer> LC_NUM = new Property<Integer>("lcNum");
	public static final Property<String> MANUAL_INPUT_PL_CONTRIB_IND = new Property<String>("manualInputPlContribInd");
	public static final Property<String> MATERIAL_CODE = new Property<String>("materialCode");
	public static final Property<Integer> ORIG_VOUCHER_NUM = new Property<Integer>("origVoucherNum");
	public static final Property<String> PAY_TERM_OVERRIDE_IND = new Property<String>("payTermOverrideInd");
	public static final Property<Integer> PL_CONTRIB_MOD_TRANSID = new Property<Integer>("plContribModTransid");
	public static final Property<Integer> PR_COST_NUM = new Property<Integer>("prCostNum");
	public static final Property<String> PRELIM_TYPE_OVERRIDE_IND = new Property<String>("prelimTypeOverrideInd");
	public static final Property<String> PREPAYMENT_IND = new Property<String>("prepaymentInd");
	public static final Property<Double> QTY_ADJ_FACTOR = new Property<Double>("qtyAdjFactor");
	public static final Property<Integer> QTY_ADJ_RULE_NUM = new Property<Integer>("qtyAdjRuleNum");
	public static final Property<Integer> RELATED_COST_NUM = new Property<Integer>("relatedCostNum");
	public static final Property<BigDecimal> RESERVE_COST_AMT = new Property<BigDecimal>("reserveCostAmt");
	public static final Property<Integer> RESP_TRANS_ID = new Property<Integer>("respTransId");
	public static final Property<Integer> RISK_COVER_NUM = new Property<Integer>("riskCoverNum");
	public static final Property<Integer> TRANS_ID = new Property<Integer>("transId");
	public static final Property<BigDecimal> VAT_RATE = new Property<BigDecimal>("vatRate");
	public static final Property<String> VOYAGE_CODE = new Property<String>("voyageCode");

	public void setCostDesc(String costDesc)
	{
		writeProperty("costDesc", costDesc);
	}

	public String getCostDesc()
	{
		return (String) readProperty("costDesc");
	}

	public void setCostNum(Integer costNum)
	{
		writeProperty("costNum", costNum);
	}

	public Integer getCostNum()
	{
		return (Integer) readProperty("costNum");
	}

	public void setCostPlContributionInd(String costPlContributionInd)
	{
		writeProperty("costPlContributionInd", costPlContributionInd);
	}

	public String getCostPlContributionInd()
	{
		return (String) readProperty("costPlContributionInd");
	}

	public void setCreationFxRate(BigDecimal creationFxRate)
	{
		writeProperty("creationFxRate", creationFxRate);
	}

	public BigDecimal getCreationFxRate()
	{
		return (BigDecimal) readProperty("creationFxRate");
	}

	public void setCreationRateMDInd(String creationRateMDInd)
	{
		writeProperty("creationRateMDInd", creationRateMDInd);
	}

	public String getCreationRateMDInd()
	{
		return (String) readProperty("creationRateMDInd");
	}

	public void setDiscountRate(BigDecimal discountRate)
	{
		writeProperty("discountRate", discountRate);
	}

	public BigDecimal getDiscountRate()
	{
		return (BigDecimal) readProperty("discountRate");
	}

	public void setFxComputeInd(String fxComputeInd)
	{
		writeProperty("fxComputeInd", fxComputeInd);
	}

	public String getFxComputeInd()
	{
		return (String) readProperty("fxComputeInd");
	}

	public void setFxExpNum(Integer fxExpNum)
	{
		writeProperty("fxExpNum", fxExpNum);
	}

	public Integer getFxExpNum()
	{
		return (Integer) readProperty("fxExpNum");
	}

	public void setFxLinkOid(Integer fxLinkOid)
	{
		writeProperty("fxLinkOid", fxLinkOid);
	}

	public Integer getFxLinkOid()
	{
		return (Integer) readProperty("fxLinkOid");
	}

	public void setFxLockingStatus(String fxLockingStatus)
	{
		writeProperty("fxLockingStatus", fxLockingStatus);
	}

	public String getFxLockingStatus()
	{
		return (String) readProperty("fxLockingStatus");
	}

	public void setFxRealPortNum(Integer fxRealPortNum)
	{
		writeProperty("fxRealPortNum", fxRealPortNum);
	}

	public Integer getFxRealPortNum()
	{
		return (Integer) readProperty("fxRealPortNum");
	}

	public void setLcNum(Integer lcNum)
	{
		writeProperty("lcNum", lcNum);
	}

	public Integer getLcNum()
	{
		return (Integer) readProperty("lcNum");
	}

	public void setManualInputPlContribInd(String manualInputPlContribInd)
	{
		writeProperty("manualInputPlContribInd", manualInputPlContribInd);
	}

	public String getManualInputPlContribInd()
	{
		return (String) readProperty("manualInputPlContribInd");
	}

	public void setMaterialCode(String materialCode)
	{
		writeProperty("materialCode", materialCode);
	}

	public String getMaterialCode()
	{
		return (String) readProperty("materialCode");
	}

	public void setOrigVoucherNum(Integer origVoucherNum)
	{
		writeProperty("origVoucherNum", origVoucherNum);
	}

	public Integer getOrigVoucherNum()
	{
		return (Integer) readProperty("origVoucherNum");
	}

	public void setPayTermOverrideInd(String payTermOverrideInd)
	{
		writeProperty("payTermOverrideInd", payTermOverrideInd);
	}

	public String getPayTermOverrideInd()
	{
		return (String) readProperty("payTermOverrideInd");
	}

	public void setPlContribModTransid(Integer plContribModTransid)
	{
		writeProperty("plContribModTransid", plContribModTransid);
	}

	public Integer getPlContribModTransid()
	{
		return (Integer) readProperty("plContribModTransid");
	}

	public void setPrCostNum(Integer prCostNum)
	{
		writeProperty("prCostNum", prCostNum);
	}

	public Integer getPrCostNum()
	{
		return (Integer) readProperty("prCostNum");
	}

	public void setPrelimTypeOverrideInd(String prelimTypeOverrideInd)
	{
		writeProperty("prelimTypeOverrideInd", prelimTypeOverrideInd);
	}

	public String getPrelimTypeOverrideInd()
	{
		return (String) readProperty("prelimTypeOverrideInd");
	}

	public void setPrepaymentInd(String prepaymentInd)
	{
		writeProperty("prepaymentInd", prepaymentInd);
	}

	public String getPrepaymentInd()
	{
		return (String) readProperty("prepaymentInd");
	}

	public void setQtyAdjFactor(Double qtyAdjFactor)
	{
		writeProperty("qtyAdjFactor", qtyAdjFactor);
	}

	public Double getQtyAdjFactor()
	{
		return (Double) readProperty("qtyAdjFactor");
	}

	public void setQtyAdjRuleNum(Integer qtyAdjRuleNum)
	{
		writeProperty("qtyAdjRuleNum", qtyAdjRuleNum);
	}

	public Integer getQtyAdjRuleNum()
	{
		return (Integer) readProperty("qtyAdjRuleNum");
	}

	public void setRelatedCostNum(Integer relatedCostNum)
	{
		writeProperty("relatedCostNum", relatedCostNum);
	}

	public Integer getRelatedCostNum()
	{
		return (Integer) readProperty("relatedCostNum");
	}

	public void setReserveCostAmt(BigDecimal reserveCostAmt)
	{
		writeProperty("reserveCostAmt", reserveCostAmt);
	}

	public BigDecimal getReserveCostAmt()
	{
		return (BigDecimal) readProperty("reserveCostAmt");
	}

	public void setRespTransId(Integer respTransId)
	{
		writeProperty("respTransId", respTransId);
	}

	public Integer getRespTransId()
	{
		return (Integer) readProperty("respTransId");
	}

	public void setRiskCoverNum(Integer riskCoverNum)
	{
		writeProperty("riskCoverNum", riskCoverNum);
	}

	public Integer getRiskCoverNum()
	{
		return (Integer) readProperty("riskCoverNum");
	}

	public void setTransId(Integer transId)
	{
		writeProperty("transId", transId);
	}

	public Integer getTransId()
	{
		return (Integer) readProperty("transId");
	}

	public void setVatRate(BigDecimal vatRate)
	{
		writeProperty("vatRate", vatRate);
	}

	public BigDecimal getVatRate()
	{
		return (BigDecimal) readProperty("vatRate");
	}

	public void setVoyageCode(String voyageCode)
	{
		writeProperty("voyageCode", voyageCode);
	}

	public String getVoyageCode()
	{
		return (String) readProperty("voyageCode");
	}

}