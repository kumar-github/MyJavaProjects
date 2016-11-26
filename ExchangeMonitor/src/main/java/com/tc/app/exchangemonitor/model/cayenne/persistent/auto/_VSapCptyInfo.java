package com.tc.app.exchangemonitor.model.cayenne.persistent.auto;

import java.util.Date;

import org.apache.cayenne.CayenneDataObject;
import org.apache.cayenne.exp.Property;

/**
 * Class _VSapCptyInfo was generated by Cayenne.
 * It is probably a good idea to avoid changing this class manually,
 * since it may be overwritten next time code is regenerated.
 * If you need to make any customizations, please use subclass.
 */
public abstract class _VSapCptyInfo extends CayenneDataObject
{

	private static final long serialVersionUID = 1L;

	public static final Property<String> ACCT_ADDR_CITY = new Property<String>("acctAddrCity");
	public static final Property<String> ACCT_ADDR_LINE1 = new Property<String>("acctAddrLine1");
	public static final Property<String> ACCT_ADDR_LINE2 = new Property<String>("acctAddrLine2");
	public static final Property<String> ACCT_ADDR_LINE3 = new Property<String>("acctAddrLine3");
	public static final Property<String> ACCT_ADDR_LINE4 = new Property<String>("acctAddrLine4");
	public static final Property<String> ACCT_BANK_CITY = new Property<String>("acctBankCity");
	public static final Property<String> ACCT_BANK_COUNTRY_CODE = new Property<String>("acctBankCountryCode");
	public static final Property<String> ACCT_BANK_IBAN_NUM = new Property<String>("acctBankIbanNum");
	public static final Property<Integer> ACCT_BANK_ID = new Property<Integer>("acctBankId");
	public static final Property<String> ACCT_BANK_INFO_STATUS = new Property<String>("acctBankInfoStatus");
	public static final Property<String> ACCT_BANK_ROUTING_NUM = new Property<String>("acctBankRoutingNum");
	public static final Property<String> ACCT_FULL_NAME = new Property<String>("acctFullName");
	public static final Property<Integer> ACCT_NUM = new Property<Integer>("acctNum");
	public static final Property<String> ACCT_PARENT_IND = new Property<String>("acctParentInd");
	public static final Property<String> ACCT_SHORT_NAME = new Property<String>("acctShortName");
	public static final Property<String> ACCT_STATUS = new Property<String>("acctStatus");
	public static final Property<String> ACCT_TYPE_CODE = new Property<String>("acctTypeCode");
	public static final Property<Short> ADDR_ACCT_ADDR_NUM = new Property<Short>("addrAcctAddrNum");
	public static final Property<Integer> ADDR_ACCT_NUM = new Property<Integer>("addrAcctNum");
	public static final Property<String> ALIAS_SOURCE_CODE = new Property<String>("aliasSourceCode");
	public static final Property<String> BANK_ACCT_NO = new Property<String>("bankAcctNo");
	public static final Property<Integer> BANK_ACCT_NUM = new Property<Integer>("bankAcctNum");
	public static final Property<String> BANK_NAME = new Property<String>("bankName");
	public static final Property<String> BANK_SHORT_NAME = new Property<String>("bankShortName");
	public static final Property<String> CORRESP_BANK_ACCT_NO = new Property<String>("correspBankAcctNo");
	public static final Property<String> CORRESP_BANK_CITY = new Property<String>("correspBankCity");
	public static final Property<String> CORRESP_BANK_COUNTRY_CODE = new Property<String>("correspBankCountryCode");
	public static final Property<String> CORRESP_BANK_IBAN_NUM = new Property<String>("correspBankIbanNum");
	public static final Property<String> CORRESP_BANK_NAME = new Property<String>("correspBankName");
	public static final Property<String> CORRESP_BANK_ROUTING_NUM = new Property<String>("correspBankRoutingNum");
	public static final Property<String> CORRESP_SWIFT_CODE = new Property<String>("correspSwiftCode");
	public static final Property<String> COUNTRY_CODE = new Property<String>("countryCode");
	public static final Property<String> CURRENCY_CODE = new Property<String>("currencyCode");
	public static final Property<String> FURTHER_CREDIT_TO = new Property<String>("furtherCreditTo");
	public static final Property<String> GL_ACCT_CODE = new Property<String>("glAcctCode");
	public static final Property<Date> LAST_UPDATE_DATE = new Property<Date>("lastUpdateDate");
	public static final Property<String> P_OR_RIND = new Property<String>("pOrRInd");
	public static final Property<String> PAY_METHOD_CODE = new Property<String>("payMethodCode");
	public static final Property<String> STATE_CODE = new Property<String>("stateCode");
	public static final Property<String> SWIFT_CODE = new Property<String>("swiftCode");
	public static final Property<Integer> TRANS_ID = new Property<Integer>("transId");
	public static final Property<Integer> VC_ACCT_NUM = new Property<Integer>("vcAcctNum");

	public void setAcctAddrCity(String acctAddrCity)
	{
		writeProperty("acctAddrCity", acctAddrCity);
	}

	public String getAcctAddrCity()
	{
		return (String) readProperty("acctAddrCity");
	}

	public void setAcctAddrLine1(String acctAddrLine1)
	{
		writeProperty("acctAddrLine1", acctAddrLine1);
	}

	public String getAcctAddrLine1()
	{
		return (String) readProperty("acctAddrLine1");
	}

	public void setAcctAddrLine2(String acctAddrLine2)
	{
		writeProperty("acctAddrLine2", acctAddrLine2);
	}

	public String getAcctAddrLine2()
	{
		return (String) readProperty("acctAddrLine2");
	}

	public void setAcctAddrLine3(String acctAddrLine3)
	{
		writeProperty("acctAddrLine3", acctAddrLine3);
	}

	public String getAcctAddrLine3()
	{
		return (String) readProperty("acctAddrLine3");
	}

	public void setAcctAddrLine4(String acctAddrLine4)
	{
		writeProperty("acctAddrLine4", acctAddrLine4);
	}

	public String getAcctAddrLine4()
	{
		return (String) readProperty("acctAddrLine4");
	}

	public void setAcctBankCity(String acctBankCity)
	{
		writeProperty("acctBankCity", acctBankCity);
	}

	public String getAcctBankCity()
	{
		return (String) readProperty("acctBankCity");
	}

	public void setAcctBankCountryCode(String acctBankCountryCode)
	{
		writeProperty("acctBankCountryCode", acctBankCountryCode);
	}

	public String getAcctBankCountryCode()
	{
		return (String) readProperty("acctBankCountryCode");
	}

	public void setAcctBankIbanNum(String acctBankIbanNum)
	{
		writeProperty("acctBankIbanNum", acctBankIbanNum);
	}

	public String getAcctBankIbanNum()
	{
		return (String) readProperty("acctBankIbanNum");
	}

	public void setAcctBankId(Integer acctBankId)
	{
		writeProperty("acctBankId", acctBankId);
	}

	public Integer getAcctBankId()
	{
		return (Integer) readProperty("acctBankId");
	}

	public void setAcctBankInfoStatus(String acctBankInfoStatus)
	{
		writeProperty("acctBankInfoStatus", acctBankInfoStatus);
	}

	public String getAcctBankInfoStatus()
	{
		return (String) readProperty("acctBankInfoStatus");
	}

	public void setAcctBankRoutingNum(String acctBankRoutingNum)
	{
		writeProperty("acctBankRoutingNum", acctBankRoutingNum);
	}

	public String getAcctBankRoutingNum()
	{
		return (String) readProperty("acctBankRoutingNum");
	}

	public void setAcctFullName(String acctFullName)
	{
		writeProperty("acctFullName", acctFullName);
	}

	public String getAcctFullName()
	{
		return (String) readProperty("acctFullName");
	}

	public void setAcctNum(Integer acctNum)
	{
		writeProperty("acctNum", acctNum);
	}

	public Integer getAcctNum()
	{
		return (Integer) readProperty("acctNum");
	}

	public void setAcctParentInd(String acctParentInd)
	{
		writeProperty("acctParentInd", acctParentInd);
	}

	public String getAcctParentInd()
	{
		return (String) readProperty("acctParentInd");
	}

	public void setAcctShortName(String acctShortName)
	{
		writeProperty("acctShortName", acctShortName);
	}

	public String getAcctShortName()
	{
		return (String) readProperty("acctShortName");
	}

	public void setAcctStatus(String acctStatus)
	{
		writeProperty("acctStatus", acctStatus);
	}

	public String getAcctStatus()
	{
		return (String) readProperty("acctStatus");
	}

	public void setAcctTypeCode(String acctTypeCode)
	{
		writeProperty("acctTypeCode", acctTypeCode);
	}

	public String getAcctTypeCode()
	{
		return (String) readProperty("acctTypeCode");
	}

	public void setAddrAcctAddrNum(Short addrAcctAddrNum)
	{
		writeProperty("addrAcctAddrNum", addrAcctAddrNum);
	}

	public Short getAddrAcctAddrNum()
	{
		return (Short) readProperty("addrAcctAddrNum");
	}

	public void setAddrAcctNum(Integer addrAcctNum)
	{
		writeProperty("addrAcctNum", addrAcctNum);
	}

	public Integer getAddrAcctNum()
	{
		return (Integer) readProperty("addrAcctNum");
	}

	public void setAliasSourceCode(String aliasSourceCode)
	{
		writeProperty("aliasSourceCode", aliasSourceCode);
	}

	public String getAliasSourceCode()
	{
		return (String) readProperty("aliasSourceCode");
	}

	public void setBankAcctNo(String bankAcctNo)
	{
		writeProperty("bankAcctNo", bankAcctNo);
	}

	public String getBankAcctNo()
	{
		return (String) readProperty("bankAcctNo");
	}

	public void setBankAcctNum(Integer bankAcctNum)
	{
		writeProperty("bankAcctNum", bankAcctNum);
	}

	public Integer getBankAcctNum()
	{
		return (Integer) readProperty("bankAcctNum");
	}

	public void setBankName(String bankName)
	{
		writeProperty("bankName", bankName);
	}

	public String getBankName()
	{
		return (String) readProperty("bankName");
	}

	public void setBankShortName(String bankShortName)
	{
		writeProperty("bankShortName", bankShortName);
	}

	public String getBankShortName()
	{
		return (String) readProperty("bankShortName");
	}

	public void setCorrespBankAcctNo(String correspBankAcctNo)
	{
		writeProperty("correspBankAcctNo", correspBankAcctNo);
	}

	public String getCorrespBankAcctNo()
	{
		return (String) readProperty("correspBankAcctNo");
	}

	public void setCorrespBankCity(String correspBankCity)
	{
		writeProperty("correspBankCity", correspBankCity);
	}

	public String getCorrespBankCity()
	{
		return (String) readProperty("correspBankCity");
	}

	public void setCorrespBankCountryCode(String correspBankCountryCode)
	{
		writeProperty("correspBankCountryCode", correspBankCountryCode);
	}

	public String getCorrespBankCountryCode()
	{
		return (String) readProperty("correspBankCountryCode");
	}

	public void setCorrespBankIbanNum(String correspBankIbanNum)
	{
		writeProperty("correspBankIbanNum", correspBankIbanNum);
	}

	public String getCorrespBankIbanNum()
	{
		return (String) readProperty("correspBankIbanNum");
	}

	public void setCorrespBankName(String correspBankName)
	{
		writeProperty("correspBankName", correspBankName);
	}

	public String getCorrespBankName()
	{
		return (String) readProperty("correspBankName");
	}

	public void setCorrespBankRoutingNum(String correspBankRoutingNum)
	{
		writeProperty("correspBankRoutingNum", correspBankRoutingNum);
	}

	public String getCorrespBankRoutingNum()
	{
		return (String) readProperty("correspBankRoutingNum");
	}

	public void setCorrespSwiftCode(String correspSwiftCode)
	{
		writeProperty("correspSwiftCode", correspSwiftCode);
	}

	public String getCorrespSwiftCode()
	{
		return (String) readProperty("correspSwiftCode");
	}

	public void setCountryCode(String countryCode)
	{
		writeProperty("countryCode", countryCode);
	}

	public String getCountryCode()
	{
		return (String) readProperty("countryCode");
	}

	public void setCurrencyCode(String currencyCode)
	{
		writeProperty("currencyCode", currencyCode);
	}

	public String getCurrencyCode()
	{
		return (String) readProperty("currencyCode");
	}

	public void setFurtherCreditTo(String furtherCreditTo)
	{
		writeProperty("furtherCreditTo", furtherCreditTo);
	}

	public String getFurtherCreditTo()
	{
		return (String) readProperty("furtherCreditTo");
	}

	public void setGlAcctCode(String glAcctCode)
	{
		writeProperty("glAcctCode", glAcctCode);
	}

	public String getGlAcctCode()
	{
		return (String) readProperty("glAcctCode");
	}

	public void setLastUpdateDate(Date lastUpdateDate)
	{
		writeProperty("lastUpdateDate", lastUpdateDate);
	}

	public Date getLastUpdateDate()
	{
		return (Date) readProperty("lastUpdateDate");
	}

	public void setPOrRInd(String pOrRInd)
	{
		writeProperty("pOrRInd", pOrRInd);
	}

	public String getPOrRInd()
	{
		return (String) readProperty("pOrRInd");
	}

	public void setPayMethodCode(String payMethodCode)
	{
		writeProperty("payMethodCode", payMethodCode);
	}

	public String getPayMethodCode()
	{
		return (String) readProperty("payMethodCode");
	}

	public void setStateCode(String stateCode)
	{
		writeProperty("stateCode", stateCode);
	}

	public String getStateCode()
	{
		return (String) readProperty("stateCode");
	}

	public void setSwiftCode(String swiftCode)
	{
		writeProperty("swiftCode", swiftCode);
	}

	public String getSwiftCode()
	{
		return (String) readProperty("swiftCode");
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
