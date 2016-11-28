package com.tc.app.exchangemonitor.model.cayenne.persistent.auto;

import org.apache.cayenne.CayenneDataObject;
import org.apache.cayenne.exp.Property;

import com.tc.app.exchangemonitor.model.cayenne.persistent.Account;
import com.tc.app.exchangemonitor.model.cayenne.persistent.IctsUser;

/**
 * Class _VoucherApproval was generated by Cayenne.
 * It is probably a good idea to avoid changing this class manually,
 * since it may be overwritten next time code is regenerated.
 * If you need to make any customizations, please use subclass.
 */
public abstract class _VoucherApproval extends CayenneDataObject
{

	private static final long serialVersionUID = 1L;

	public static final String VOUCHER_APPROVAL_NUM_PK_COLUMN = "voucher_approval_num";

	public static final Property<String> GL_ACCT_CR_CODE = new Property<String>("glAcctCrCode");
	public static final Property<String> GL_ACCT_DR_CODE = new Property<String>("glAcctDrCode");
	public static final Property<Integer> TRANS_ID = new Property<Integer>("transId");
	public static final Property<Double> VOUCHER_APPROVAL_LIMIT = new Property<Double>("voucherApprovalLimit");
	public static final Property<Account> ACCOUNT = new Property<Account>("account");
	public static final Property<IctsUser> ICTS_USER = new Property<IctsUser>("ictsUser");

	public void setGlAcctCrCode(String glAcctCrCode)
	{
		writeProperty("glAcctCrCode", glAcctCrCode);
	}

	public String getGlAcctCrCode()
	{
		return (String) readProperty("glAcctCrCode");
	}

	public void setGlAcctDrCode(String glAcctDrCode)
	{
		writeProperty("glAcctDrCode", glAcctDrCode);
	}

	public String getGlAcctDrCode()
	{
		return (String) readProperty("glAcctDrCode");
	}

	public void setTransId(Integer transId)
	{
		writeProperty("transId", transId);
	}

	public Integer getTransId()
	{
		return (Integer) readProperty("transId");
	}

	public void setVoucherApprovalLimit(Double voucherApprovalLimit)
	{
		writeProperty("voucherApprovalLimit", voucherApprovalLimit);
	}

	public Double getVoucherApprovalLimit()
	{
		return (Double) readProperty("voucherApprovalLimit");
	}

	public void setAccount(Account account)
	{
		setToOneTarget("account", account, true);
	}

	public Account getAccount()
	{
		return (Account) readProperty("account");
	}

	public void setIctsUser(IctsUser ictsUser)
	{
		setToOneTarget("ictsUser", ictsUser, true);
	}

	public IctsUser getIctsUser()
	{
		return (IctsUser) readProperty("ictsUser");
	}

}