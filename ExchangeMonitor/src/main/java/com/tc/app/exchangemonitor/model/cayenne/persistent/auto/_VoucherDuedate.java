package com.tc.app.exchangemonitor.model.cayenne.persistent.auto;

import java.util.Date;

import org.apache.cayenne.CayenneDataObject;
import org.apache.cayenne.exp.Property;

import com.tc.app.exchangemonitor.model.cayenne.persistent.IctsUser;

/**
 * Class _VoucherDuedate was generated by Cayenne.
 * It is probably a good idea to avoid changing this class manually,
 * since it may be overwritten next time code is regenerated.
 * If you need to make any customizations, please use subclass.
 */
public abstract class _VoucherDuedate extends CayenneDataObject
{

	private static final long serialVersionUID = 1L;

	public static final String VOUCHER_NUM_PK_COLUMN = "voucher_num";
	public static final String VOUDUE_DUEDATE_PK_COLUMN = "voudue_duedate";
	public static final String VOUDUE_SEQ_NUM_PK_COLUMN = "voudue_seq_num";

	public static final Property<Integer> TRANS_ID = new Property<Integer>("transId");
	public static final Property<Double> VOUDUE_AMT = new Property<Double>("voudueAmt");
	public static final Property<String> VOUDUE_CANCEL_CORR_CODE = new Property<String>("voudueCancelCorrCode");
	public static final Property<Date> VOUDUE_CREATION_DATE = new Property<Date>("voudueCreationDate");
	public static final Property<Date> VOUDUE_MOD_DATE = new Property<Date>("voudueModDate");
	public static final Property<String> VOUDUE_PAY_RECV_IND = new Property<String>("vouduePayRecvInd");
	public static final Property<Date> VOUDUE_REVISED_DUE_DATE = new Property<Date>("voudueRevisedDueDate");
	public static final Property<String> VOUDUE_STATUS = new Property<String>("voudueStatus");
	public static final Property<Double> VOUDUE_TOT_PAID_AMT = new Property<Double>("voudueTotPaidAmt");
	public static final Property<IctsUser> ICTS_USER = new Property<IctsUser>("ictsUser");
	public static final Property<IctsUser> ICTS_USER1 = new Property<IctsUser>("ictsUser1");

	public void setTransId(Integer transId)
	{
		writeProperty("transId", transId);
	}

	public Integer getTransId()
	{
		return (Integer) readProperty("transId");
	}

	public void setVoudueAmt(Double voudueAmt)
	{
		writeProperty("voudueAmt", voudueAmt);
	}

	public Double getVoudueAmt()
	{
		return (Double) readProperty("voudueAmt");
	}

	public void setVoudueCancelCorrCode(String voudueCancelCorrCode)
	{
		writeProperty("voudueCancelCorrCode", voudueCancelCorrCode);
	}

	public String getVoudueCancelCorrCode()
	{
		return (String) readProperty("voudueCancelCorrCode");
	}

	public void setVoudueCreationDate(Date voudueCreationDate)
	{
		writeProperty("voudueCreationDate", voudueCreationDate);
	}

	public Date getVoudueCreationDate()
	{
		return (Date) readProperty("voudueCreationDate");
	}

	public void setVoudueModDate(Date voudueModDate)
	{
		writeProperty("voudueModDate", voudueModDate);
	}

	public Date getVoudueModDate()
	{
		return (Date) readProperty("voudueModDate");
	}

	public void setVouduePayRecvInd(String vouduePayRecvInd)
	{
		writeProperty("vouduePayRecvInd", vouduePayRecvInd);
	}

	public String getVouduePayRecvInd()
	{
		return (String) readProperty("vouduePayRecvInd");
	}

	public void setVoudueRevisedDueDate(Date voudueRevisedDueDate)
	{
		writeProperty("voudueRevisedDueDate", voudueRevisedDueDate);
	}

	public Date getVoudueRevisedDueDate()
	{
		return (Date) readProperty("voudueRevisedDueDate");
	}

	public void setVoudueStatus(String voudueStatus)
	{
		writeProperty("voudueStatus", voudueStatus);
	}

	public String getVoudueStatus()
	{
		return (String) readProperty("voudueStatus");
	}

	public void setVoudueTotPaidAmt(Double voudueTotPaidAmt)
	{
		writeProperty("voudueTotPaidAmt", voudueTotPaidAmt);
	}

	public Double getVoudueTotPaidAmt()
	{
		return (Double) readProperty("voudueTotPaidAmt");
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

}
