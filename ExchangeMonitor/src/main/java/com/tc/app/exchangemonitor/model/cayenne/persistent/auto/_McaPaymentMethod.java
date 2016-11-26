package com.tc.app.exchangemonitor.model.cayenne.persistent.auto;

import java.util.List;

import org.apache.cayenne.CayenneDataObject;
import org.apache.cayenne.exp.Property;

import com.tc.app.exchangemonitor.model.cayenne.persistent.MasterCollAgreement;

/**
 * Class _McaPaymentMethod was generated by Cayenne.
 * It is probably a good idea to avoid changing this class manually,
 * since it may be overwritten next time code is regenerated.
 * If you need to make any customizations, please use subclass.
 */
public abstract class _McaPaymentMethod extends CayenneDataObject
{

	private static final long serialVersionUID = 1L;

	public static final String PAY_METHOD_CODE_PK_COLUMN = "pay_method_code";

	public static final Property<String> ACCOUNTING_PAY_METHOD = new Property<String>("accountingPayMethod");
	public static final Property<String> PAY_METHOD_DESC = new Property<String>("payMethodDesc");
	public static final Property<Integer> TRANS_ID = new Property<Integer>("transId");
	public static final Property<List<MasterCollAgreement>> MASTER_COLL_AGREEMENTS = new Property<List<MasterCollAgreement>>("masterCollAgreements");
	public static final Property<List<MasterCollAgreement>> MASTER_COLL_AGREEMENTS1 = new Property<List<MasterCollAgreement>>("masterCollAgreements1");

	public void setAccountingPayMethod(String accountingPayMethod)
	{
		writeProperty("accountingPayMethod", accountingPayMethod);
	}

	public String getAccountingPayMethod()
	{
		return (String) readProperty("accountingPayMethod");
	}

	public void setPayMethodDesc(String payMethodDesc)
	{
		writeProperty("payMethodDesc", payMethodDesc);
	}

	public String getPayMethodDesc()
	{
		return (String) readProperty("payMethodDesc");
	}

	public void setTransId(Integer transId)
	{
		writeProperty("transId", transId);
	}

	public Integer getTransId()
	{
		return (Integer) readProperty("transId");
	}

	public void addToMasterCollAgreements(MasterCollAgreement obj)
	{
		addToManyTarget("masterCollAgreements", obj, true);
	}

	public void removeFromMasterCollAgreements(MasterCollAgreement obj)
	{
		removeToManyTarget("masterCollAgreements", obj, true);
	}

	@SuppressWarnings("unchecked")
	public List<MasterCollAgreement> getMasterCollAgreements()
	{
		return (List<MasterCollAgreement>) readProperty("masterCollAgreements");
	}

	public void addToMasterCollAgreements1(MasterCollAgreement obj)
	{
		addToManyTarget("masterCollAgreements1", obj, true);
	}

	public void removeFromMasterCollAgreements1(MasterCollAgreement obj)
	{
		removeToManyTarget("masterCollAgreements1", obj, true);
	}

	@SuppressWarnings("unchecked")
	public List<MasterCollAgreement> getMasterCollAgreements1()
	{
		return (List<MasterCollAgreement>) readProperty("masterCollAgreements1");
	}

}
