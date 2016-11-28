package com.tc.app.exchangemonitor.model.cayenne.persistent.auto;

import java.util.Date;

import org.apache.cayenne.CayenneDataObject;
import org.apache.cayenne.exp.Property;

import com.tc.app.exchangemonitor.model.cayenne.persistent.AcctBookcomp;

/**
 * Class _AcctBookcompCollatera was generated by Cayenne.
 * It is probably a good idea to avoid changing this class manually,
 * since it may be overwritten next time code is regenerated.
 * If you need to make any customizations, please use subclass.
 */
public abstract class _AcctBookcompCollatera extends CayenneDataObject
{

	private static final long serialVersionUID = 1L;

	public static final String ACCT_COLLAT_NUM_PK_COLUMN = "acct_collat_num";

	public static final Property<Date> ISDA_EFF_DATE = new Property<Date>("isdaEffDate");
	public static final Property<String> ISDA_IND = new Property<String>("isdaInd");
	public static final Property<Date> MCA_EFF_DATE = new Property<Date>("mcaEffDate");
	public static final Property<String> MCA_IND = new Property<String>("mcaInd");
	public static final Property<Date> NET_OUT_AGREE_EFF_DATE = new Property<Date>("netOutAgreeEffDate");
	public static final Property<String> NET_OUT_CONT_NUM = new Property<String>("netOutContNum");
	public static final Property<String> NET_PAY_AGREE_IND = new Property<String>("netPayAgreeInd");
	public static final Property<Integer> TRANS_ID = new Property<Integer>("transId");
	public static final Property<AcctBookcomp> ACCT_BOOKCOMP = new Property<AcctBookcomp>("acctBookcomp");

	public void setIsdaEffDate(Date isdaEffDate)
	{
		writeProperty("isdaEffDate", isdaEffDate);
	}

	public Date getIsdaEffDate()
	{
		return (Date) readProperty("isdaEffDate");
	}

	public void setIsdaInd(String isdaInd)
	{
		writeProperty("isdaInd", isdaInd);
	}

	public String getIsdaInd()
	{
		return (String) readProperty("isdaInd");
	}

	public void setMcaEffDate(Date mcaEffDate)
	{
		writeProperty("mcaEffDate", mcaEffDate);
	}

	public Date getMcaEffDate()
	{
		return (Date) readProperty("mcaEffDate");
	}

	public void setMcaInd(String mcaInd)
	{
		writeProperty("mcaInd", mcaInd);
	}

	public String getMcaInd()
	{
		return (String) readProperty("mcaInd");
	}

	public void setNetOutAgreeEffDate(Date netOutAgreeEffDate)
	{
		writeProperty("netOutAgreeEffDate", netOutAgreeEffDate);
	}

	public Date getNetOutAgreeEffDate()
	{
		return (Date) readProperty("netOutAgreeEffDate");
	}

	public void setNetOutContNum(String netOutContNum)
	{
		writeProperty("netOutContNum", netOutContNum);
	}

	public String getNetOutContNum()
	{
		return (String) readProperty("netOutContNum");
	}

	public void setNetPayAgreeInd(String netPayAgreeInd)
	{
		writeProperty("netPayAgreeInd", netPayAgreeInd);
	}

	public String getNetPayAgreeInd()
	{
		return (String) readProperty("netPayAgreeInd");
	}

	public void setTransId(Integer transId)
	{
		writeProperty("transId", transId);
	}

	public Integer getTransId()
	{
		return (Integer) readProperty("transId");
	}

	public void setAcctBookcomp(AcctBookcomp acctBookcomp)
	{
		setToOneTarget("acctBookcomp", acctBookcomp, true);
	}

	public AcctBookcomp getAcctBookcomp()
	{
		return (AcctBookcomp) readProperty("acctBookcomp");
	}

}