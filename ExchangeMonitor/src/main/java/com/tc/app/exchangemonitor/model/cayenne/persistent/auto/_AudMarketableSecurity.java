package com.tc.app.exchangemonitor.model.cayenne.persistent.auto;

import java.util.Date;

import org.apache.cayenne.CayenneDataObject;
import org.apache.cayenne.exp.Property;

/**
 * Class _AudMarketableSecurity was generated by Cayenne.
 * It is probably a good idea to avoid changing this class manually,
 * since it may be overwritten next time code is regenerated.
 * If you need to make any customizations, please use subclass.
 */
public abstract class _AudMarketableSecurity extends CayenneDataObject
{

	private static final long serialVersionUID = 1L;

	public static final Property<Integer> ACCT_NUM = new Property<Integer>("acctNum");
	public static final Property<String> CMDTY_CODE = new Property<String>("cmdtyCode");
	public static final Property<String> DESCRIPTION = new Property<String>("description");
	public static final Property<Integer> DOC_NUM = new Property<Integer>("docNum");
	public static final Property<Date> EXPIRY_DATE = new Property<Date>("expiryDate");
	public static final Property<Double> FACE_AMOUNT = new Property<Double>("faceAmount");
	public static final Property<String> FACE_AMT_CURR_CODE = new Property<String>("faceAmtCurrCode");
	public static final Property<Date> ISSUE_DATE = new Property<Date>("issueDate");
	public static final Property<Integer> MKT_SECURITY_NUM = new Property<Integer>("mktSecurityNum");
	public static final Property<String> MRK_SEC_STATUS = new Property<String>("mrkSecStatus");
	public static final Property<Double> PERCENT_AMOUNT = new Property<Double>("percentAmount");
	public static final Property<Integer> RESP_TRANS_ID = new Property<Integer>("respTransId");
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

	public void setDescription(String description)
	{
		writeProperty("description", description);
	}

	public String getDescription()
	{
		return (String) readProperty("description");
	}

	public void setDocNum(Integer docNum)
	{
		writeProperty("docNum", docNum);
	}

	public Integer getDocNum()
	{
		return (Integer) readProperty("docNum");
	}

	public void setExpiryDate(Date expiryDate)
	{
		writeProperty("expiryDate", expiryDate);
	}

	public Date getExpiryDate()
	{
		return (Date) readProperty("expiryDate");
	}

	public void setFaceAmount(Double faceAmount)
	{
		writeProperty("faceAmount", faceAmount);
	}

	public Double getFaceAmount()
	{
		return (Double) readProperty("faceAmount");
	}

	public void setFaceAmtCurrCode(String faceAmtCurrCode)
	{
		writeProperty("faceAmtCurrCode", faceAmtCurrCode);
	}

	public String getFaceAmtCurrCode()
	{
		return (String) readProperty("faceAmtCurrCode");
	}

	public void setIssueDate(Date issueDate)
	{
		writeProperty("issueDate", issueDate);
	}

	public Date getIssueDate()
	{
		return (Date) readProperty("issueDate");
	}

	public void setMktSecurityNum(Integer mktSecurityNum)
	{
		writeProperty("mktSecurityNum", mktSecurityNum);
	}

	public Integer getMktSecurityNum()
	{
		return (Integer) readProperty("mktSecurityNum");
	}

	public void setMrkSecStatus(String mrkSecStatus)
	{
		writeProperty("mrkSecStatus", mrkSecStatus);
	}

	public String getMrkSecStatus()
	{
		return (String) readProperty("mrkSecStatus");
	}

	public void setPercentAmount(Double percentAmount)
	{
		writeProperty("percentAmount", percentAmount);
	}

	public Double getPercentAmount()
	{
		return (Double) readProperty("percentAmount");
	}

	public void setRespTransId(Integer respTransId)
	{
		writeProperty("respTransId", respTransId);
	}

	public Integer getRespTransId()
	{
		return (Integer) readProperty("respTransId");
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