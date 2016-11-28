package com.tc.app.exchangemonitor.model.cayenne.persistent.auto;

import java.util.List;

import org.apache.cayenne.CayenneDataObject;
import org.apache.cayenne.exp.Property;

import com.tc.app.exchangemonitor.model.cayenne.persistent.AcctBcOtCrinfo;
import com.tc.app.exchangemonitor.model.cayenne.persistent.BrokerCommissionDefault;
import com.tc.app.exchangemonitor.model.cayenne.persistent.CreditReserve;
import com.tc.app.exchangemonitor.model.cayenne.persistent.LocTypeByOrder;
import com.tc.app.exchangemonitor.model.cayenne.persistent.MasterCollAgreement;
import com.tc.app.exchangemonitor.model.cayenne.persistent.MotTypeForOrder;
import com.tc.app.exchangemonitor.model.cayenne.persistent.OrderTypeGroup;
import com.tc.app.exchangemonitor.model.cayenne.persistent.TiMarkToMarket;
import com.tc.app.exchangemonitor.model.cayenne.persistent.TradeOrder;

/**
 * Class _OrderType was generated by Cayenne.
 * It is probably a good idea to avoid changing this class manually,
 * since it may be overwritten next time code is regenerated.
 * If you need to make any customizations, please use subclass.
 */
public abstract class _OrderType extends CayenneDataObject
{

	private static final long serialVersionUID = 1L;

	public static final String ORDER_TYPE_CODE_PK_COLUMN = "order_type_code";

	public static final Property<String> ORDER_TYPE_DESC = new Property<String>("orderTypeDesc");
	public static final Property<Integer> TRANS_ID = new Property<Integer>("transId");
	public static final Property<List<AcctBcOtCrinfo>> ACCT_BC_OT_CRINFOES = new Property<List<AcctBcOtCrinfo>>("acctBcOtCrinfoes");
	public static final Property<List<BrokerCommissionDefault>> BROKER_COMMISSION_DEFAULTS = new Property<List<BrokerCommissionDefault>>("brokerCommissionDefaults");
	public static final Property<List<CreditReserve>> CREDIT_RESERVES = new Property<List<CreditReserve>>("creditReserves");
	public static final Property<List<LocTypeByOrder>> LOC_TYPE_BY_ORDERS = new Property<List<LocTypeByOrder>>("locTypeByOrders");
	public static final Property<List<MasterCollAgreement>> MASTER_COLL_AGREEMENTS = new Property<List<MasterCollAgreement>>("masterCollAgreements");
	public static final Property<List<MotTypeForOrder>> MOT_TYPE_FOR_ORDERS = new Property<List<MotTypeForOrder>>("motTypeForOrders");
	public static final Property<List<OrderTypeGroup>> ORDER_TYPE_GROUPS = new Property<List<OrderTypeGroup>>("orderTypeGroups");
	public static final Property<List<TiMarkToMarket>> TI_MARK_TO_MARKETS = new Property<List<TiMarkToMarket>>("tiMarkToMarkets");
	public static final Property<List<TradeOrder>> TRADE_ORDERS = new Property<List<TradeOrder>>("tradeOrders");

	public void setOrderTypeDesc(String orderTypeDesc)
	{
		writeProperty("orderTypeDesc", orderTypeDesc);
	}

	public String getOrderTypeDesc()
	{
		return (String) readProperty("orderTypeDesc");
	}

	public void setTransId(Integer transId)
	{
		writeProperty("transId", transId);
	}

	public Integer getTransId()
	{
		return (Integer) readProperty("transId");
	}

	public void addToAcctBcOtCrinfoes(AcctBcOtCrinfo obj)
	{
		addToManyTarget("acctBcOtCrinfoes", obj, true);
	}

	public void removeFromAcctBcOtCrinfoes(AcctBcOtCrinfo obj)
	{
		removeToManyTarget("acctBcOtCrinfoes", obj, true);
	}

	@SuppressWarnings("unchecked")
	public List<AcctBcOtCrinfo> getAcctBcOtCrinfoes()
	{
		return (List<AcctBcOtCrinfo>) readProperty("acctBcOtCrinfoes");
	}

	public void addToBrokerCommissionDefaults(BrokerCommissionDefault obj)
	{
		addToManyTarget("brokerCommissionDefaults", obj, true);
	}

	public void removeFromBrokerCommissionDefaults(BrokerCommissionDefault obj)
	{
		removeToManyTarget("brokerCommissionDefaults", obj, true);
	}

	@SuppressWarnings("unchecked")
	public List<BrokerCommissionDefault> getBrokerCommissionDefaults()
	{
		return (List<BrokerCommissionDefault>) readProperty("brokerCommissionDefaults");
	}

	public void addToCreditReserves(CreditReserve obj)
	{
		addToManyTarget("creditReserves", obj, true);
	}

	public void removeFromCreditReserves(CreditReserve obj)
	{
		removeToManyTarget("creditReserves", obj, true);
	}

	@SuppressWarnings("unchecked")
	public List<CreditReserve> getCreditReserves()
	{
		return (List<CreditReserve>) readProperty("creditReserves");
	}

	public void addToLocTypeByOrders(LocTypeByOrder obj)
	{
		addToManyTarget("locTypeByOrders", obj, true);
	}

	public void removeFromLocTypeByOrders(LocTypeByOrder obj)
	{
		removeToManyTarget("locTypeByOrders", obj, true);
	}

	@SuppressWarnings("unchecked")
	public List<LocTypeByOrder> getLocTypeByOrders()
	{
		return (List<LocTypeByOrder>) readProperty("locTypeByOrders");
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

	public void addToMotTypeForOrders(MotTypeForOrder obj)
	{
		addToManyTarget("motTypeForOrders", obj, true);
	}

	public void removeFromMotTypeForOrders(MotTypeForOrder obj)
	{
		removeToManyTarget("motTypeForOrders", obj, true);
	}

	@SuppressWarnings("unchecked")
	public List<MotTypeForOrder> getMotTypeForOrders()
	{
		return (List<MotTypeForOrder>) readProperty("motTypeForOrders");
	}

	public void addToOrderTypeGroups(OrderTypeGroup obj)
	{
		addToManyTarget("orderTypeGroups", obj, true);
	}

	public void removeFromOrderTypeGroups(OrderTypeGroup obj)
	{
		removeToManyTarget("orderTypeGroups", obj, true);
	}

	@SuppressWarnings("unchecked")
	public List<OrderTypeGroup> getOrderTypeGroups()
	{
		return (List<OrderTypeGroup>) readProperty("orderTypeGroups");
	}

	public void addToTiMarkToMarkets(TiMarkToMarket obj)
	{
		addToManyTarget("tiMarkToMarkets", obj, true);
	}

	public void removeFromTiMarkToMarkets(TiMarkToMarket obj)
	{
		removeToManyTarget("tiMarkToMarkets", obj, true);
	}

	@SuppressWarnings("unchecked")
	public List<TiMarkToMarket> getTiMarkToMarkets()
	{
		return (List<TiMarkToMarket>) readProperty("tiMarkToMarkets");
	}

	public void addToTradeOrders(TradeOrder obj)
	{
		addToManyTarget("tradeOrders", obj, true);
	}

	public void removeFromTradeOrders(TradeOrder obj)
	{
		removeToManyTarget("tradeOrders", obj, true);
	}

	@SuppressWarnings("unchecked")
	public List<TradeOrder> getTradeOrders()
	{
		return (List<TradeOrder>) readProperty("tradeOrders");
	}

}