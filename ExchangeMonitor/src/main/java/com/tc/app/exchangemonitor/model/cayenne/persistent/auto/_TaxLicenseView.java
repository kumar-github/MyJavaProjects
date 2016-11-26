package com.tc.app.exchangemonitor.model.cayenne.persistent.auto;

import java.util.Date;

import org.apache.cayenne.CayenneDataObject;
import org.apache.cayenne.exp.Property;

/**
 * Class _TaxLicenseView was generated by Cayenne.
 * It is probably a good idea to avoid changing this class manually,
 * since it may be overwritten next time code is regenerated.
 * If you need to make any customizations, please use subclass.
 */
public abstract class _TaxLicenseView extends CayenneDataObject
{

	private static final long serialVersionUID = 1L;

	public static final Property<Integer> ACCT_NUM = new Property<Integer>("acctNum");
	public static final Property<String> CMDTY_CODE = new Property<String>("cmdtyCode");
	public static final Property<Integer> CMNT_NUM = new Property<Integer>("cmntNum");
	public static final Property<Integer> ISSUING_TAX_AUTHORITY_NUM = new Property<Integer>("issuingTaxAuthorityNum");
	public static final Property<Integer> LICENSE_COVERS_NUM = new Property<Integer>("licenseCoversNum");
	public static final Property<Date> LICENSE_EFF_DATE = new Property<Date>("licenseEffDate");
	public static final Property<Date> LICENSE_EXP_DATE = new Property<Date>("licenseExpDate");
	public static final Property<String> LICENSE_ID = new Property<String>("licenseId");
	public static final Property<Integer> LICENSE_NUM = new Property<Integer>("licenseNum");
	public static final Property<String> LICENSE_SHORT_CMNT = new Property<String>("licenseShortCmnt");
	public static final Property<String> PRODUCT_USAGE_CODE = new Property<String>("productUsageCode");
	public static final Property<String> TAX_CODE = new Property<String>("taxCode");
	public static final Property<String> TAX_EXEMPT_IND = new Property<String>("taxExemptInd");
	public static final Property<Double> TAX_RATE_DISCOUNT = new Property<Double>("taxRateDiscount");
	public static final Property<Integer> TRANS_ID = new Property<Integer>("transId");

	public void setAcctNum(Integer acctNum)
	{
		writeProperty("acctNum", acctNum);
	}

	public Integer getAcctNum()
	{
		return (Integer) readProperty("acctNum");
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

	public void setIssuingTaxAuthorityNum(Integer issuingTaxAuthorityNum)
	{
		writeProperty("issuingTaxAuthorityNum", issuingTaxAuthorityNum);
	}

	public Integer getIssuingTaxAuthorityNum()
	{
		return (Integer) readProperty("issuingTaxAuthorityNum");
	}

	public void setLicenseCoversNum(Integer licenseCoversNum)
	{
		writeProperty("licenseCoversNum", licenseCoversNum);
	}

	public Integer getLicenseCoversNum()
	{
		return (Integer) readProperty("licenseCoversNum");
	}

	public void setLicenseEffDate(Date licenseEffDate)
	{
		writeProperty("licenseEffDate", licenseEffDate);
	}

	public Date getLicenseEffDate()
	{
		return (Date) readProperty("licenseEffDate");
	}

	public void setLicenseExpDate(Date licenseExpDate)
	{
		writeProperty("licenseExpDate", licenseExpDate);
	}

	public Date getLicenseExpDate()
	{
		return (Date) readProperty("licenseExpDate");
	}

	public void setLicenseId(String licenseId)
	{
		writeProperty("licenseId", licenseId);
	}

	public String getLicenseId()
	{
		return (String) readProperty("licenseId");
	}

	public void setLicenseNum(Integer licenseNum)
	{
		writeProperty("licenseNum", licenseNum);
	}

	public Integer getLicenseNum()
	{
		return (Integer) readProperty("licenseNum");
	}

	public void setLicenseShortCmnt(String licenseShortCmnt)
	{
		writeProperty("licenseShortCmnt", licenseShortCmnt);
	}

	public String getLicenseShortCmnt()
	{
		return (String) readProperty("licenseShortCmnt");
	}

	public void setProductUsageCode(String productUsageCode)
	{
		writeProperty("productUsageCode", productUsageCode);
	}

	public String getProductUsageCode()
	{
		return (String) readProperty("productUsageCode");
	}

	public void setTaxCode(String taxCode)
	{
		writeProperty("taxCode", taxCode);
	}

	public String getTaxCode()
	{
		return (String) readProperty("taxCode");
	}

	public void setTaxExemptInd(String taxExemptInd)
	{
		writeProperty("taxExemptInd", taxExemptInd);
	}

	public String getTaxExemptInd()
	{
		return (String) readProperty("taxExemptInd");
	}

	public void setTaxRateDiscount(Double taxRateDiscount)
	{
		writeProperty("taxRateDiscount", taxRateDiscount);
	}

	public Double getTaxRateDiscount()
	{
		return (Double) readProperty("taxRateDiscount");
	}

	public void setTransId(Integer transId)
	{
		writeProperty("transId", transId);
	}

	public Integer getTransId()
	{
		return (Integer) readProperty("transId");
	}

}
