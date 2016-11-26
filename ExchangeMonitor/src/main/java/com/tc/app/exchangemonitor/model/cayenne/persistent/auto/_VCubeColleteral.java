package com.tc.app.exchangemonitor.model.cayenne.persistent.auto;

import java.util.Date;

import org.apache.cayenne.CayenneDataObject;
import org.apache.cayenne.exp.Property;

/**
 * Class _VCubeColleteral was generated by Cayenne.
 * It is probably a good idea to avoid changing this class manually,
 * since it may be overwritten next time code is regenerated.
 * If you need to make any customizations, please use subclass.
 */
public abstract class _VCubeColleteral extends CayenneDataObject
{

	private static final long serialVersionUID = 1L;

	public static final Property<String> ADVISING_BANK = new Property<String>("advisingBank");
	public static final Property<Integer> AGREEMENT_REFERENCE = new Property<Integer>("agreementReference");
	public static final Property<String> APPLICANT = new Property<String>("applicant");
	public static final Property<String> BENEFICIARY = new Property<String>("beneficiary");
	public static final Property<String> COLLATERAL_TYPE = new Property<String>("collateralType");
	public static final Property<String> CURRENCY = new Property<String>("currency");
	public static final Property<Date> END_DATE = new Property<Date>("endDate");
	public static final Property<String> ISSUING_BANK = new Property<String>("issuingBank");
	public static final Property<String> LC_EXP_IMP_IND = new Property<String>("lcExpImpInd");
	public static final Property<Integer> LC_NUM = new Property<Integer>("lcNum");
	public static final Property<String> LC_STATUS = new Property<String>("lcStatus");
	public static final Property<String> LC_USAGE = new Property<String>("lcUsage");
	public static final Property<Date> START_DATE = new Property<Date>("startDate");
	public static final Property<Double> VALUE = new Property<Double>("value");

	public void setAdvisingBank(String advisingBank)
	{
		writeProperty("advisingBank", advisingBank);
	}

	public String getAdvisingBank()
	{
		return (String) readProperty("advisingBank");
	}

	public void setAgreementReference(Integer agreementReference)
	{
		writeProperty("agreementReference", agreementReference);
	}

	public Integer getAgreementReference()
	{
		return (Integer) readProperty("agreementReference");
	}

	public void setApplicant(String applicant)
	{
		writeProperty("applicant", applicant);
	}

	public String getApplicant()
	{
		return (String) readProperty("applicant");
	}

	public void setBeneficiary(String beneficiary)
	{
		writeProperty("beneficiary", beneficiary);
	}

	public String getBeneficiary()
	{
		return (String) readProperty("beneficiary");
	}

	public void setCollateralType(String collateralType)
	{
		writeProperty("collateralType", collateralType);
	}

	public String getCollateralType()
	{
		return (String) readProperty("collateralType");
	}

	public void setCurrency(String currency)
	{
		writeProperty("currency", currency);
	}

	public String getCurrency()
	{
		return (String) readProperty("currency");
	}

	public void setEndDate(Date endDate)
	{
		writeProperty("endDate", endDate);
	}

	public Date getEndDate()
	{
		return (Date) readProperty("endDate");
	}

	public void setIssuingBank(String issuingBank)
	{
		writeProperty("issuingBank", issuingBank);
	}

	public String getIssuingBank()
	{
		return (String) readProperty("issuingBank");
	}

	public void setLcExpImpInd(String lcExpImpInd)
	{
		writeProperty("lcExpImpInd", lcExpImpInd);
	}

	public String getLcExpImpInd()
	{
		return (String) readProperty("lcExpImpInd");
	}

	public void setLcNum(Integer lcNum)
	{
		writeProperty("lcNum", lcNum);
	}

	public Integer getLcNum()
	{
		return (Integer) readProperty("lcNum");
	}

	public void setLcStatus(String lcStatus)
	{
		writeProperty("lcStatus", lcStatus);
	}

	public String getLcStatus()
	{
		return (String) readProperty("lcStatus");
	}

	public void setLcUsage(String lcUsage)
	{
		writeProperty("lcUsage", lcUsage);
	}

	public String getLcUsage()
	{
		return (String) readProperty("lcUsage");
	}

	public void setStartDate(Date startDate)
	{
		writeProperty("startDate", startDate);
	}

	public Date getStartDate()
	{
		return (Date) readProperty("startDate");
	}

	public void setValue(Double value)
	{
		writeProperty("value", value);
	}

	public Double getValue()
	{
		return (Double) readProperty("value");
	}

}
