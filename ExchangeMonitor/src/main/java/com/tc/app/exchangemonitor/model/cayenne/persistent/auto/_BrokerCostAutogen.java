package com.tc.app.exchangemonitor.model.cayenne.persistent.auto;

import java.math.BigDecimal;
import java.util.Date;
import java.util.List;

import org.apache.cayenne.CayenneDataObject;
import org.apache.cayenne.exp.Property;

import com.tc.app.exchangemonitor.model.cayenne.persistent.Account;
import com.tc.app.exchangemonitor.model.cayenne.persistent.BrokerCostStepPrice;
import com.tc.app.exchangemonitor.model.cayenne.persistent.Commodity;
import com.tc.app.exchangemonitor.model.cayenne.persistent.CostCode;
import com.tc.app.exchangemonitor.model.cayenne.persistent.ExecutionType;
import com.tc.app.exchangemonitor.model.cayenne.persistent.Market;
import com.tc.app.exchangemonitor.model.cayenne.persistent.PaymentTerm;
import com.tc.app.exchangemonitor.model.cayenne.persistent.Uom;

/**
 * Class _BrokerCostAutogen was generated by Cayenne.
 * It is probably a good idea to avoid changing this class manually,
 * since it may be overwritten next time code is regenerated.
 * If you need to make any customizations, please use subclass.
 */
public abstract class _BrokerCostAutogen extends CayenneDataObject
{

	private static final long serialVersionUID = 1L;

	public static final String COST_AUTOGEN_NUM_PK_COLUMN = "cost_autogen_num";

	public static final Property<String> BLOCK_TRADE_IND = new Property<String>("blockTradeInd");
	public static final Property<String> COST_EFF_DATE_IND = new Property<String>("costEffDateInd");
	public static final Property<String> COST_PRICE_TYPE = new Property<String>("costPriceType");
	public static final Property<String> CREATION_TYPE = new Property<String>("creationType");
	public static final Property<String> ITEM_TYPE = new Property<String>("itemType");
	public static final Property<String> P_SIND = new Property<String>("pSInd");
	public static final Property<Integer> TRANS_ID = new Property<Integer>("transId");
	public static final Property<BigDecimal> UNIT_PRICE = new Property<BigDecimal>("unitPrice");
	public static final Property<Date> VALIDITY_END_DATE = new Property<Date>("validityEndDate");
	public static final Property<Date> VALIDITY_START_DATE = new Property<Date>("validityStartDate");
	public static final Property<Account> ACCOUNT = new Property<Account>("account");
	public static final Property<Account> ACCOUNT1 = new Property<Account>("account1");
	public static final Property<Account> ACCOUNT2 = new Property<Account>("account2");
	public static final Property<List<BrokerCostStepPrice>> BROKER_COST_STEP_PRICES = new Property<List<BrokerCostStepPrice>>("brokerCostStepPrices");
	public static final Property<Commodity> COMMODITY = new Property<Commodity>("commodity");
	public static final Property<Commodity> COMMODITY1 = new Property<Commodity>("commodity1");
	public static final Property<CostCode> COST_CODE = new Property<CostCode>("costCode");
	public static final Property<ExecutionType> EXECUTION_TYPE = new Property<ExecutionType>("executionType");
	public static final Property<Market> MARKET = new Property<Market>("market");
	public static final Property<PaymentTerm> PAYMENT_TERM = new Property<PaymentTerm>("paymentTerm");
	public static final Property<Uom> UOM = new Property<Uom>("uom");

	public void setBlockTradeInd(String blockTradeInd)
	{
		writeProperty("blockTradeInd", blockTradeInd);
	}

	public String getBlockTradeInd()
	{
		return (String) readProperty("blockTradeInd");
	}

	public void setCostEffDateInd(String costEffDateInd)
	{
		writeProperty("costEffDateInd", costEffDateInd);
	}

	public String getCostEffDateInd()
	{
		return (String) readProperty("costEffDateInd");
	}

	public void setCostPriceType(String costPriceType)
	{
		writeProperty("costPriceType", costPriceType);
	}

	public String getCostPriceType()
	{
		return (String) readProperty("costPriceType");
	}

	public void setCreationType(String creationType)
	{
		writeProperty("creationType", creationType);
	}

	public String getCreationType()
	{
		return (String) readProperty("creationType");
	}

	public void setItemType(String itemType)
	{
		writeProperty("itemType", itemType);
	}

	public String getItemType()
	{
		return (String) readProperty("itemType");
	}

	public void setPSInd(String pSInd)
	{
		writeProperty("pSInd", pSInd);
	}

	public String getPSInd()
	{
		return (String) readProperty("pSInd");
	}

	public void setTransId(Integer transId)
	{
		writeProperty("transId", transId);
	}

	public Integer getTransId()
	{
		return (Integer) readProperty("transId");
	}

	public void setUnitPrice(BigDecimal unitPrice)
	{
		writeProperty("unitPrice", unitPrice);
	}

	public BigDecimal getUnitPrice()
	{
		return (BigDecimal) readProperty("unitPrice");
	}

	public void setValidityEndDate(Date validityEndDate)
	{
		writeProperty("validityEndDate", validityEndDate);
	}

	public Date getValidityEndDate()
	{
		return (Date) readProperty("validityEndDate");
	}

	public void setValidityStartDate(Date validityStartDate)
	{
		writeProperty("validityStartDate", validityStartDate);
	}

	public Date getValidityStartDate()
	{
		return (Date) readProperty("validityStartDate");
	}

	public void setAccount(Account account)
	{
		setToOneTarget("account", account, true);
	}

	public Account getAccount()
	{
		return (Account) readProperty("account");
	}

	public void setAccount1(Account account1)
	{
		setToOneTarget("account1", account1, true);
	}

	public Account getAccount1()
	{
		return (Account) readProperty("account1");
	}

	public void setAccount2(Account account2)
	{
		setToOneTarget("account2", account2, true);
	}

	public Account getAccount2()
	{
		return (Account) readProperty("account2");
	}

	public void addToBrokerCostStepPrices(BrokerCostStepPrice obj)
	{
		addToManyTarget("brokerCostStepPrices", obj, true);
	}

	public void removeFromBrokerCostStepPrices(BrokerCostStepPrice obj)
	{
		removeToManyTarget("brokerCostStepPrices", obj, true);
	}

	@SuppressWarnings("unchecked")
	public List<BrokerCostStepPrice> getBrokerCostStepPrices()
	{
		return (List<BrokerCostStepPrice>) readProperty("brokerCostStepPrices");
	}

	public void setCommodity(Commodity commodity)
	{
		setToOneTarget("commodity", commodity, true);
	}

	public Commodity getCommodity()
	{
		return (Commodity) readProperty("commodity");
	}

	public void setCommodity1(Commodity commodity1)
	{
		setToOneTarget("commodity1", commodity1, true);
	}

	public Commodity getCommodity1()
	{
		return (Commodity) readProperty("commodity1");
	}

	public void setCostCode(CostCode costCode)
	{
		setToOneTarget("costCode", costCode, true);
	}

	public CostCode getCostCode()
	{
		return (CostCode) readProperty("costCode");
	}

	public void setExecutionType(ExecutionType executionType)
	{
		setToOneTarget("executionType", executionType, true);
	}

	public ExecutionType getExecutionType()
	{
		return (ExecutionType) readProperty("executionType");
	}

	public void setMarket(Market market)
	{
		setToOneTarget("market", market, true);
	}

	public Market getMarket()
	{
		return (Market) readProperty("market");
	}

	public void setPaymentTerm(PaymentTerm paymentTerm)
	{
		setToOneTarget("paymentTerm", paymentTerm, true);
	}

	public PaymentTerm getPaymentTerm()
	{
		return (PaymentTerm) readProperty("paymentTerm");
	}

	public void setUom(Uom uom)
	{
		setToOneTarget("uom", uom, true);
	}

	public Uom getUom()
	{
		return (Uom) readProperty("uom");
	}

}
