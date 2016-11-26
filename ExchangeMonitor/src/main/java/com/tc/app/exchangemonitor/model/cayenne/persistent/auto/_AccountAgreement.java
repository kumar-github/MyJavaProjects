package com.tc.app.exchangemonitor.model.cayenne.persistent.auto;

import java.util.List;

import org.apache.cayenne.CayenneDataObject;
import org.apache.cayenne.exp.Property;

import com.tc.app.exchangemonitor.model.cayenne.persistent.Account;
import com.tc.app.exchangemonitor.model.cayenne.persistent.TradeGroup;
import com.tc.app.exchangemonitor.model.cayenne.persistent.TradeItem;

/**
 * Class _AccountAgreement was generated by Cayenne.
 * It is probably a good idea to avoid changing this class manually,
 * since it may be overwritten next time code is regenerated.
 * If you need to make any customizations, please use subclass.
 */
public abstract class _AccountAgreement extends CayenneDataObject
{

	private static final long serialVersionUID = 1L;

	public static final String AGREEMENT_NUM_PK_COLUMN = "agreement_num";

	public static final Property<String> AGREEMENT_CODE = new Property<>("agreementCode");
	public static final Property<String> CONFIRM_BY = new Property<>("confirmBy");
	public static final Property<String> EXT_AGREEMENT_CODE = new Property<>("extAgreementCode");
	public static final Property<String> FORWARD_NETTING_IND = new Property<>("forwardNettingInd");
	public static final Property<String> PRODUCT_TYPE = new Property<>("productType");
	public static final Property<Integer> TRANS_ID = new Property<>("transId");
	public static final Property<String> VOUCHER_NETTING_IND = new Property<>("voucherNettingInd");
	public static final Property<Account> ACCOUNT = new Property<>("account");
	public static final Property<Account> ACCOUNT1 = new Property<>("account1");
	public static final Property<TradeGroup> TRADE_GROUP = new Property<>("tradeGroup");
	public static final Property<List<TradeItem>> TRADE_ITEMS = new Property<>("tradeItems");

	public void setAgreementCode(final String agreementCode)
	{
		this.writeProperty("agreementCode", agreementCode);
	}

	public String getAgreementCode()
	{
		return (String) this.readProperty("agreementCode");
	}

	public void setConfirmBy(final String confirmBy)
	{
		this.writeProperty("confirmBy", confirmBy);
	}

	public String getConfirmBy()
	{
		return (String) this.readProperty("confirmBy");
	}

	public void setExtAgreementCode(final String extAgreementCode)
	{
		this.writeProperty("extAgreementCode", extAgreementCode);
	}

	public String getExtAgreementCode()
	{
		return (String) this.readProperty("extAgreementCode");
	}

	public void setForwardNettingInd(final String forwardNettingInd)
	{
		this.writeProperty("forwardNettingInd", forwardNettingInd);
	}

	public String getForwardNettingInd()
	{
		return (String) this.readProperty("forwardNettingInd");
	}

	public void setProductType(final String productType)
	{
		this.writeProperty("productType", productType);
	}

	public String getProductType()
	{
		return (String) this.readProperty("productType");
	}

	public void setTransId(final Integer transId)
	{
		this.writeProperty("transId", transId);
	}

	public Integer getTransId()
	{
		return (Integer) this.readProperty("transId");
	}

	public void setVoucherNettingInd(final String voucherNettingInd)
	{
		this.writeProperty("voucherNettingInd", voucherNettingInd);
	}

	public String getVoucherNettingInd()
	{
		return (String) this.readProperty("voucherNettingInd");
	}

	public void setAccount(final Account account)
	{
		this.setToOneTarget("account", account, true);
	}

	public Account getAccount()
	{
		return (Account) this.readProperty("account");
	}

	public void setAccount1(final Account account1)
	{
		this.setToOneTarget("account1", account1, true);
	}

	public Account getAccount1()
	{
		return (Account) this.readProperty("account1");
	}

	public void setTradeGroup(final TradeGroup tradeGroup)
	{
		this.setToOneTarget("tradeGroup", tradeGroup, true);
	}

	public TradeGroup getTradeGroup()
	{
		return (TradeGroup) this.readProperty("tradeGroup");
	}

	public void addToTradeItems(final TradeItem obj)
	{
		this.addToManyTarget("tradeItems", obj, true);
	}

	public void removeFromTradeItems(final TradeItem obj)
	{
		this.removeToManyTarget("tradeItems", obj, true);
	}

	@SuppressWarnings("unchecked")
	public List<TradeItem> getTradeItems()
	{
		return (List<TradeItem>) this.readProperty("tradeItems");
	}

}
