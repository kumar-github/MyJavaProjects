package com.tc.app.exchangemonitor.model.cayenne.persistent.auto;

import org.apache.cayenne.CayenneDataObject;
import org.apache.cayenne.exp.Property;

/**
 * Class _AudAccountBankInfo was generated by Cayenne.
 * It is probably a good idea to avoid changing this class manually,
 * since it may be overwritten next time code is regenerated.
 * If you need to make any customizations, please use subclass.
 */
public abstract class _AudAccountBankInfo extends CayenneDataObject
{

	private static final long serialVersionUID = 1L;

	public static final Property<String> ACCT_BANK_CITY = new Property<String>("acctBankCity");
	public static final Property<String> ACCT_BANK_COUNTRY_CODE = new Property<String>("acctBankCountryCode");
	public static final Property<String> ACCT_BANK_IBAN_NUM = new Property<String>("acctBankIbanNum");
	public static final Property<Integer> ACCT_BANK_ID = new Property<Integer>("acctBankId");
	public static final Property<String> ACCT_BANK_INFO_STATUS = new Property<String>("acctBankInfoStatus");
	public static final Property<String> ACCT_BANK_ROUTING_NUM = new Property<String>("acctBankRoutingNum");
	public static final Property<Integer> ACCT_NUM = new Property<Integer>("acctNum");
	public static final Property<Short> ADDR_ACCT_ADDR_NUM = new Property<Short>("addrAcctAddrNum");
	public static final Property<Integer> ADDR_ACCT_NUM = new Property<Integer>("addrAcctNum");
	public static final Property<String> BANK_ACCT_NO = new Property<String>("bankAcctNo");
	public static final Property<Integer> BANK_ACCT_NUM = new Property<Integer>("bankAcctNum");
	public static final Property<String> BANK_ADDR = new Property<String>("bankAddr");
	public static final Property<String> BANK_NAME = new Property<String>("bankName");
	public static final Property<String> BANK_SHORT_NAME = new Property<String>("bankShortName");
	public static final Property<Integer> BOOK_COMP_NUM = new Property<Integer>("bookCompNum");
	public static final Property<String> CORRESP_BANK_ACCT_NO = new Property<String>("correspBankAcctNo");
	public static final Property<String> CORRESP_BANK_CITY = new Property<String>("correspBankCity");
	public static final Property<String> CORRESP_BANK_COUNTRY_CODE = new Property<String>("correspBankCountryCode");
	public static final Property<String> CORRESP_BANK_IBAN_NUM = new Property<String>("correspBankIbanNum");
	public static final Property<String> CORRESP_BANK_INSTR_TYPE_ID = new Property<String>("correspBankInstrTypeId");
	public static final Property<String> CORRESP_BANK_NAME = new Property<String>("correspBankName");
	public static final Property<String> CORRESP_BANK_ROUTING_NUM = new Property<String>("correspBankRoutingNum");
	public static final Property<String> CORRESP_SWIFT_CODE = new Property<String>("correspSwiftCode");
	public static final Property<Short> COST_SEND_ID = new Property<Short>("costSendId");
	public static final Property<String> CURRENCY_CODE = new Property<String>("currencyCode");
	public static final Property<String> FURTHER_CREDIT_TO = new Property<String>("furtherCreditTo");
	public static final Property<String> FURTHER_CREDIT_TO_EXT_ACCT_KEY = new Property<String>("furtherCreditToExtAcctKey");
	public static final Property<String> GL_ACCT_CODE = new Property<String>("glAcctCode");
	public static final Property<String> GL_ACCT_DESCR = new Property<String>("glAcctDescr");
	public static final Property<String> P_OR_RIND = new Property<String>("pOrRInd");
	public static final Property<String> PAY_METHOD_CODE = new Property<String>("payMethodCode");
	public static final Property<Integer> RESP_TRANS_ID = new Property<Integer>("respTransId");
	public static final Property<Short> SELLING_OFFICE_NUM = new Property<Short>("sellingOfficeNum");
	public static final Property<String> SPECIAL_PAYMENT_INSTR = new Property<String>("specialPaymentInstr");
	public static final Property<String> SWIFT_CODE = new Property<String>("swiftCode");
	public static final Property<Integer> TRANS_ID = new Property<Integer>("transId");
	public static final Property<Integer> VC_ACCT_NUM = new Property<Integer>("vcAcctNum");

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

	public void setAcctNum(Integer acctNum)
	{
		writeProperty("acctNum", acctNum);
	}

	public Integer getAcctNum()
	{
		return (Integer) readProperty("acctNum");
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

	public void setBankAddr(String bankAddr)
	{
		writeProperty("bankAddr", bankAddr);
	}

	public String getBankAddr()
	{
		return (String) readProperty("bankAddr");
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

	public void setBookCompNum(Integer bookCompNum)
	{
		writeProperty("bookCompNum", bookCompNum);
	}

	public Integer getBookCompNum()
	{
		return (Integer) readProperty("bookCompNum");
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

	public void setCorrespBankInstrTypeId(String correspBankInstrTypeId)
	{
		writeProperty("correspBankInstrTypeId", correspBankInstrTypeId);
	}

	public String getCorrespBankInstrTypeId()
	{
		return (String) readProperty("correspBankInstrTypeId");
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

	public void setCostSendId(Short costSendId)
	{
		writeProperty("costSendId", costSendId);
	}

	public Short getCostSendId()
	{
		return (Short) readProperty("costSendId");
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

	public void setFurtherCreditToExtAcctKey(String furtherCreditToExtAcctKey)
	{
		writeProperty("furtherCreditToExtAcctKey", furtherCreditToExtAcctKey);
	}

	public String getFurtherCreditToExtAcctKey()
	{
		return (String) readProperty("furtherCreditToExtAcctKey");
	}

	public void setGlAcctCode(String glAcctCode)
	{
		writeProperty("glAcctCode", glAcctCode);
	}

	public String getGlAcctCode()
	{
		return (String) readProperty("glAcctCode");
	}

	public void setGlAcctDescr(String glAcctDescr)
	{
		writeProperty("glAcctDescr", glAcctDescr);
	}

	public String getGlAcctDescr()
	{
		return (String) readProperty("glAcctDescr");
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

	public void setRespTransId(Integer respTransId)
	{
		writeProperty("respTransId", respTransId);
	}

	public Integer getRespTransId()
	{
		return (Integer) readProperty("respTransId");
	}

	public void setSellingOfficeNum(Short sellingOfficeNum)
	{
		writeProperty("sellingOfficeNum", sellingOfficeNum);
	}

	public Short getSellingOfficeNum()
	{
		return (Short) readProperty("sellingOfficeNum");
	}

	public void setSpecialPaymentInstr(String specialPaymentInstr)
	{
		writeProperty("specialPaymentInstr", specialPaymentInstr);
	}

	public String getSpecialPaymentInstr()
	{
		return (String) readProperty("specialPaymentInstr");
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
