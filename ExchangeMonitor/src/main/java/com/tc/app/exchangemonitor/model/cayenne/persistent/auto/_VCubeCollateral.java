package com.tc.app.exchangemonitor.model.cayenne.persistent.auto;

import java.util.Date;

import org.apache.cayenne.CayenneDataObject;
import org.apache.cayenne.exp.Property;

/**
 * Class _VCubeCollateral was generated by Cayenne.
 * It is probably a good idea to avoid changing this class manually,
 * since it may be overwritten next time code is regenerated.
 * If you need to make any customizations, please use subclass.
 */
public abstract class _VCubeCollateral extends CayenneDataObject
{

	private static final long serialVersionUID = 1L;

	public static final Property<Integer> ADVISING_ACCT_NUM = new Property<Integer>("advisingAcctNum");
	public static final Property<String> ADVISING_BANK = new Property<String>("advisingBank");
	public static final Property<String> APPLICANT = new Property<String>("applicant");
	public static final Property<Integer> APPLICANT_ACCT_NUM = new Property<Integer>("applicantAcctNum");
	public static final Property<String> BENEFICIARY = new Property<String>("beneficiary");
	public static final Property<Integer> BENEFICIARY_ACCT_NUM = new Property<Integer>("beneficiaryAcctNum");
	public static final Property<String> CURRENCY = new Property<String>("currency");
	public static final Property<Integer> ISSUING_ACCT_NUM = new Property<Integer>("issuingAcctNum");
	public static final Property<String> ISSUING_BANK = new Property<String>("issuingBank");
	public static final Property<Double> LC_AMT = new Property<Double>("lcAmt");
	public static final Property<Double> LC_AVAILABLE_AMT = new Property<Double>("lcAvailableAmt");
	public static final Property<String> LC_EXP_IMP_IND = new Property<String>("lcExpImpInd");
	public static final Property<Date> LC_EXPIRY_DATE = new Property<Date>("lcExpiryDate");
	public static final Property<Double> LC_MAX_AMT = new Property<Double>("lcMaxAmt");
	public static final Property<Integer> LC_NUM = new Property<Integer>("lcNum");
	public static final Property<Date> LC_START_DATE = new Property<Date>("lcStartDate");
	public static final Property<String> LC_STATUS_CODE = new Property<String>("lcStatusCode");
	public static final Property<String> LC_STATUS_DESC = new Property<String>("lcStatusDesc");
	public static final Property<String> LC_TRANSACT_OR_BLANKET = new Property<String>("lcTransactOrBlanket");
	public static final Property<String> LC_TYPE_CODE = new Property<String>("lcTypeCode");
	public static final Property<String> LC_TYPE_DESC = new Property<String>("lcTypeDesc");
	public static final Property<String> LC_USAGE_CODE = new Property<String>("lcUsageCode");
	public static final Property<String> LC_USAGE_DESC = new Property<String>("lcUsageDesc");
	public static final Property<Double> LC_UTILIZED_AMT = new Property<Double>("lcUtilizedAmt");

	public void setAdvisingAcctNum(Integer advisingAcctNum)
	{
		writeProperty("advisingAcctNum", advisingAcctNum);
	}

	public Integer getAdvisingAcctNum()
	{
		return (Integer) readProperty("advisingAcctNum");
	}

	public void setAdvisingBank(String advisingBank)
	{
		writeProperty("advisingBank", advisingBank);
	}

	public String getAdvisingBank()
	{
		return (String) readProperty("advisingBank");
	}

	public void setApplicant(String applicant)
	{
		writeProperty("applicant", applicant);
	}

	public String getApplicant()
	{
		return (String) readProperty("applicant");
	}

	public void setApplicantAcctNum(Integer applicantAcctNum)
	{
		writeProperty("applicantAcctNum", applicantAcctNum);
	}

	public Integer getApplicantAcctNum()
	{
		return (Integer) readProperty("applicantAcctNum");
	}

	public void setBeneficiary(String beneficiary)
	{
		writeProperty("beneficiary", beneficiary);
	}

	public String getBeneficiary()
	{
		return (String) readProperty("beneficiary");
	}

	public void setBeneficiaryAcctNum(Integer beneficiaryAcctNum)
	{
		writeProperty("beneficiaryAcctNum", beneficiaryAcctNum);
	}

	public Integer getBeneficiaryAcctNum()
	{
		return (Integer) readProperty("beneficiaryAcctNum");
	}

	public void setCurrency(String currency)
	{
		writeProperty("currency", currency);
	}

	public String getCurrency()
	{
		return (String) readProperty("currency");
	}

	public void setIssuingAcctNum(Integer issuingAcctNum)
	{
		writeProperty("issuingAcctNum", issuingAcctNum);
	}

	public Integer getIssuingAcctNum()
	{
		return (Integer) readProperty("issuingAcctNum");
	}

	public void setIssuingBank(String issuingBank)
	{
		writeProperty("issuingBank", issuingBank);
	}

	public String getIssuingBank()
	{
		return (String) readProperty("issuingBank");
	}

	public void setLcAmt(Double lcAmt)
	{
		writeProperty("lcAmt", lcAmt);
	}

	public Double getLcAmt()
	{
		return (Double) readProperty("lcAmt");
	}

	public void setLcAvailableAmt(Double lcAvailableAmt)
	{
		writeProperty("lcAvailableAmt", lcAvailableAmt);
	}

	public Double getLcAvailableAmt()
	{
		return (Double) readProperty("lcAvailableAmt");
	}

	public void setLcExpImpInd(String lcExpImpInd)
	{
		writeProperty("lcExpImpInd", lcExpImpInd);
	}

	public String getLcExpImpInd()
	{
		return (String) readProperty("lcExpImpInd");
	}

	public void setLcExpiryDate(Date lcExpiryDate)
	{
		writeProperty("lcExpiryDate", lcExpiryDate);
	}

	public Date getLcExpiryDate()
	{
		return (Date) readProperty("lcExpiryDate");
	}

	public void setLcMaxAmt(Double lcMaxAmt)
	{
		writeProperty("lcMaxAmt", lcMaxAmt);
	}

	public Double getLcMaxAmt()
	{
		return (Double) readProperty("lcMaxAmt");
	}

	public void setLcNum(Integer lcNum)
	{
		writeProperty("lcNum", lcNum);
	}

	public Integer getLcNum()
	{
		return (Integer) readProperty("lcNum");
	}

	public void setLcStartDate(Date lcStartDate)
	{
		writeProperty("lcStartDate", lcStartDate);
	}

	public Date getLcStartDate()
	{
		return (Date) readProperty("lcStartDate");
	}

	public void setLcStatusCode(String lcStatusCode)
	{
		writeProperty("lcStatusCode", lcStatusCode);
	}

	public String getLcStatusCode()
	{
		return (String) readProperty("lcStatusCode");
	}

	public void setLcStatusDesc(String lcStatusDesc)
	{
		writeProperty("lcStatusDesc", lcStatusDesc);
	}

	public String getLcStatusDesc()
	{
		return (String) readProperty("lcStatusDesc");
	}

	public void setLcTransactOrBlanket(String lcTransactOrBlanket)
	{
		writeProperty("lcTransactOrBlanket", lcTransactOrBlanket);
	}

	public String getLcTransactOrBlanket()
	{
		return (String) readProperty("lcTransactOrBlanket");
	}

	public void setLcTypeCode(String lcTypeCode)
	{
		writeProperty("lcTypeCode", lcTypeCode);
	}

	public String getLcTypeCode()
	{
		return (String) readProperty("lcTypeCode");
	}

	public void setLcTypeDesc(String lcTypeDesc)
	{
		writeProperty("lcTypeDesc", lcTypeDesc);
	}

	public String getLcTypeDesc()
	{
		return (String) readProperty("lcTypeDesc");
	}

	public void setLcUsageCode(String lcUsageCode)
	{
		writeProperty("lcUsageCode", lcUsageCode);
	}

	public String getLcUsageCode()
	{
		return (String) readProperty("lcUsageCode");
	}

	public void setLcUsageDesc(String lcUsageDesc)
	{
		writeProperty("lcUsageDesc", lcUsageDesc);
	}

	public String getLcUsageDesc()
	{
		return (String) readProperty("lcUsageDesc");
	}

	public void setLcUtilizedAmt(Double lcUtilizedAmt)
	{
		writeProperty("lcUtilizedAmt", lcUtilizedAmt);
	}

	public Double getLcUtilizedAmt()
	{
		return (Double) readProperty("lcUtilizedAmt");
	}

}
