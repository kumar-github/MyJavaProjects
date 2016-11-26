package com.tc.app.exchangemonitor.model.cayenne.persistent.auto;

import java.util.Date;

import org.apache.cayenne.CayenneDataObject;
import org.apache.cayenne.exp.Property;

/**
 * Class _VMetTsLcAllocation was generated by Cayenne.
 * It is probably a good idea to avoid changing this class manually,
 * since it may be overwritten next time code is regenerated.
 * If you need to make any customizations, please use subclass.
 */
public abstract class _VMetTsLcAllocation extends CayenneDataObject
{

	private static final long serialVersionUID = 1L;

	public static final Property<String> BANK_LC_NUM = new Property<String>("bankLcNum");
	public static final Property<Double> LC_CAP_AMOUNT = new Property<Double>("lcCapAmount");
	public static final Property<Date> LC_EXP_DATE = new Property<Date>("lcExpDate");
	public static final Property<Date> LC_ISSUE_DATE = new Property<Date>("lcIssueDate");
	public static final Property<String> LC_ISSUING_BANK_NAME = new Property<String>("lcIssuingBankName");
	public static final Property<Integer> LC_ISSUING_BANK_NUM = new Property<Integer>("lcIssuingBankNum");
	public static final Property<Integer> LC_NUM = new Property<Integer>("lcNum");
	public static final Property<String> LC_TYPE_CODE = new Property<String>("lcTypeCode");

	public void setBankLcNum(String bankLcNum)
	{
		writeProperty("bankLcNum", bankLcNum);
	}

	public String getBankLcNum()
	{
		return (String) readProperty("bankLcNum");
	}

	public void setLcCapAmount(Double lcCapAmount)
	{
		writeProperty("lcCapAmount", lcCapAmount);
	}

	public Double getLcCapAmount()
	{
		return (Double) readProperty("lcCapAmount");
	}

	public void setLcExpDate(Date lcExpDate)
	{
		writeProperty("lcExpDate", lcExpDate);
	}

	public Date getLcExpDate()
	{
		return (Date) readProperty("lcExpDate");
	}

	public void setLcIssueDate(Date lcIssueDate)
	{
		writeProperty("lcIssueDate", lcIssueDate);
	}

	public Date getLcIssueDate()
	{
		return (Date) readProperty("lcIssueDate");
	}

	public void setLcIssuingBankName(String lcIssuingBankName)
	{
		writeProperty("lcIssuingBankName", lcIssuingBankName);
	}

	public String getLcIssuingBankName()
	{
		return (String) readProperty("lcIssuingBankName");
	}

	public void setLcIssuingBankNum(Integer lcIssuingBankNum)
	{
		writeProperty("lcIssuingBankNum", lcIssuingBankNum);
	}

	public Integer getLcIssuingBankNum()
	{
		return (Integer) readProperty("lcIssuingBankNum");
	}

	public void setLcNum(Integer lcNum)
	{
		writeProperty("lcNum", lcNum);
	}

	public Integer getLcNum()
	{
		return (Integer) readProperty("lcNum");
	}

	public void setLcTypeCode(String lcTypeCode)
	{
		writeProperty("lcTypeCode", lcTypeCode);
	}

	public String getLcTypeCode()
	{
		return (String) readProperty("lcTypeCode");
	}

}
