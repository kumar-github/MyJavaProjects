package com.tc.app.exchangemonitor.model.cayenne.persistent.auto;

import org.apache.cayenne.CayenneDataObject;
import org.apache.cayenne.exp.Property;

import com.tc.app.exchangemonitor.model.cayenne.persistent.AcctBookcomp;
import com.tc.app.exchangemonitor.model.cayenne.persistent.CreditTerm;

/**
 * Class _AcctBookcompCrinfo was generated by Cayenne.
 * It is probably a good idea to avoid changing this class manually,
 * since it may be overwritten next time code is regenerated.
 * If you need to make any customizations, please use subclass.
 */
public abstract class _AcctBookcompCrinfo extends CayenneDataObject
{

	private static final long serialVersionUID = 1L;

	public static final String ACCT_BOOKCOMP_KEY_PK_COLUMN = "acct_bookcomp_key";

	public static final Property<Integer> TRANS_ID = new Property<Integer>("transId");
	public static final Property<AcctBookcomp> ACCT_BOOKCOMP = new Property<AcctBookcomp>("acctBookcomp");
	public static final Property<CreditTerm> CREDIT_TERM = new Property<CreditTerm>("creditTerm");

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

	public void setCreditTerm(CreditTerm creditTerm)
	{
		setToOneTarget("creditTerm", creditTerm, true);
	}

	public CreditTerm getCreditTerm()
	{
		return (CreditTerm) readProperty("creditTerm");
	}

}
