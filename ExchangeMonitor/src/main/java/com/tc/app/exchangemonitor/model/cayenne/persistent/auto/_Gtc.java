package com.tc.app.exchangemonitor.model.cayenne.persistent.auto;

import java.util.Date;
import java.util.List;

import org.apache.cayenne.CayenneDataObject;
import org.apache.cayenne.exp.Property;

import com.tc.app.exchangemonitor.model.cayenne.persistent.AccountCommktGtc;
import com.tc.app.exchangemonitor.model.cayenne.persistent.IctsUser;
import com.tc.app.exchangemonitor.model.cayenne.persistent.TradeItem;

/**
 * Class _Gtc was generated by Cayenne.
 * It is probably a good idea to avoid changing this class manually,
 * since it may be overwritten next time code is regenerated.
 * If you need to make any customizations, please use subclass.
 */
public abstract class _Gtc extends CayenneDataObject
{

	private static final long serialVersionUID = 1L;

	public static final String GTC_CODE_PK_COLUMN = "gtc_code";

	public static final Property<Date> AGREEMENT_DATE = new Property<Date>("agreementDate");
	public static final Property<Integer> AGREEMENT_NUM = new Property<Integer>("agreementNum");
	public static final Property<Date> CREATION_DATE = new Property<Date>("creationDate");
	public static final Property<String> GTC_DESC = new Property<String>("gtcDesc");
	public static final Property<Integer> TRANS_ID = new Property<Integer>("transId");
	public static final Property<List<AccountCommktGtc>> ACCOUNT_COMMKT_GTCS = new Property<List<AccountCommktGtc>>("accountCommktGtcs");
	public static final Property<IctsUser> ICTS_USER = new Property<IctsUser>("ictsUser");
	public static final Property<List<TradeItem>> TRADE_ITEMS = new Property<List<TradeItem>>("tradeItems");

	public void setAgreementDate(Date agreementDate)
	{
		writeProperty("agreementDate", agreementDate);
	}

	public Date getAgreementDate()
	{
		return (Date) readProperty("agreementDate");
	}

	public void setAgreementNum(Integer agreementNum)
	{
		writeProperty("agreementNum", agreementNum);
	}

	public Integer getAgreementNum()
	{
		return (Integer) readProperty("agreementNum");
	}

	public void setCreationDate(Date creationDate)
	{
		writeProperty("creationDate", creationDate);
	}

	public Date getCreationDate()
	{
		return (Date) readProperty("creationDate");
	}

	public void setGtcDesc(String gtcDesc)
	{
		writeProperty("gtcDesc", gtcDesc);
	}

	public String getGtcDesc()
	{
		return (String) readProperty("gtcDesc");
	}

	public void setTransId(Integer transId)
	{
		writeProperty("transId", transId);
	}

	public Integer getTransId()
	{
		return (Integer) readProperty("transId");
	}

	public void addToAccountCommktGtcs(AccountCommktGtc obj)
	{
		addToManyTarget("accountCommktGtcs", obj, true);
	}

	public void removeFromAccountCommktGtcs(AccountCommktGtc obj)
	{
		removeToManyTarget("accountCommktGtcs", obj, true);
	}

	@SuppressWarnings("unchecked")
	public List<AccountCommktGtc> getAccountCommktGtcs()
	{
		return (List<AccountCommktGtc>) readProperty("accountCommktGtcs");
	}

	public void setIctsUser(IctsUser ictsUser)
	{
		setToOneTarget("ictsUser", ictsUser, true);
	}

	public IctsUser getIctsUser()
	{
		return (IctsUser) readProperty("ictsUser");
	}

	public void addToTradeItems(TradeItem obj)
	{
		addToManyTarget("tradeItems", obj, true);
	}

	public void removeFromTradeItems(TradeItem obj)
	{
		removeToManyTarget("tradeItems", obj, true);
	}

	@SuppressWarnings("unchecked")
	public List<TradeItem> getTradeItems()
	{
		return (List<TradeItem>) readProperty("tradeItems");
	}

}