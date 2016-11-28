package com.tc.app.exchangemonitor.model.cayenne.persistent.auto;

import java.util.List;

import org.apache.cayenne.CayenneDataObject;
import org.apache.cayenne.exp.Property;

import com.tc.app.exchangemonitor.model.cayenne.persistent.Account;
import com.tc.app.exchangemonitor.model.cayenne.persistent.RiskCover;
import com.tc.app.exchangemonitor.model.cayenne.persistent.Shipment;
import com.tc.app.exchangemonitor.model.cayenne.persistent.VoucherPayment;

/**
 * Class _Comment was generated by Cayenne.
 * It is probably a good idea to avoid changing this class manually,
 * since it may be overwritten next time code is regenerated.
 * If you need to make any customizations, please use subclass.
 */
public abstract class _Comment extends CayenneDataObject
{

	private static final long serialVersionUID = 1L;

	public static final String CMNT_NUM_PK_COLUMN = "cmnt_num";

	public static final Property<String> CMNT_PATH = new Property<String>("cmntPath");
	public static final Property<String> CMNT_TEXT = new Property<String>("cmntText");
	public static final Property<String> SHORT_CMNT = new Property<String>("shortCmnt");
	public static final Property<String> TINY_CMNT = new Property<String>("tinyCmnt");
	public static final Property<Integer> TRANS_ID = new Property<Integer>("transId");
	public static final Property<List<Account>> ACCOUNTS = new Property<List<Account>>("accounts");
	public static final Property<List<RiskCover>> RISK_COVERS = new Property<List<RiskCover>>("riskCovers");
	public static final Property<List<Shipment>> SHIPMENTS = new Property<List<Shipment>>("shipments");
	public static final Property<List<VoucherPayment>> VOUCHER_PAYMENTS = new Property<List<VoucherPayment>>("voucherPayments");

	public void setCmntPath(String cmntPath)
	{
		writeProperty("cmntPath", cmntPath);
	}

	public String getCmntPath()
	{
		return (String) readProperty("cmntPath");
	}

	public void setCmntText(String cmntText)
	{
		writeProperty("cmntText", cmntText);
	}

	public String getCmntText()
	{
		return (String) readProperty("cmntText");
	}

	public void setShortCmnt(String shortCmnt)
	{
		writeProperty("shortCmnt", shortCmnt);
	}

	public String getShortCmnt()
	{
		return (String) readProperty("shortCmnt");
	}

	public void setTinyCmnt(String tinyCmnt)
	{
		writeProperty("tinyCmnt", tinyCmnt);
	}

	public String getTinyCmnt()
	{
		return (String) readProperty("tinyCmnt");
	}

	public void setTransId(Integer transId)
	{
		writeProperty("transId", transId);
	}

	public Integer getTransId()
	{
		return (Integer) readProperty("transId");
	}

	public void addToAccounts(Account obj)
	{
		addToManyTarget("accounts", obj, true);
	}

	public void removeFromAccounts(Account obj)
	{
		removeToManyTarget("accounts", obj, true);
	}

	@SuppressWarnings("unchecked")
	public List<Account> getAccounts()
	{
		return (List<Account>) readProperty("accounts");
	}

	public void addToRiskCovers(RiskCover obj)
	{
		addToManyTarget("riskCovers", obj, true);
	}

	public void removeFromRiskCovers(RiskCover obj)
	{
		removeToManyTarget("riskCovers", obj, true);
	}

	@SuppressWarnings("unchecked")
	public List<RiskCover> getRiskCovers()
	{
		return (List<RiskCover>) readProperty("riskCovers");
	}

	public void addToShipments(Shipment obj)
	{
		addToManyTarget("shipments", obj, true);
	}

	public void removeFromShipments(Shipment obj)
	{
		removeToManyTarget("shipments", obj, true);
	}

	@SuppressWarnings("unchecked")
	public List<Shipment> getShipments()
	{
		return (List<Shipment>) readProperty("shipments");
	}

	public void addToVoucherPayments(VoucherPayment obj)
	{
		addToManyTarget("voucherPayments", obj, true);
	}

	public void removeFromVoucherPayments(VoucherPayment obj)
	{
		removeToManyTarget("voucherPayments", obj, true);
	}

	@SuppressWarnings("unchecked")
	public List<VoucherPayment> getVoucherPayments()
	{
		return (List<VoucherPayment>) readProperty("voucherPayments");
	}

}