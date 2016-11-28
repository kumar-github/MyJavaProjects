package com.tc.app.exchangemonitor.model.cayenne.persistent.auto;

import java.math.BigDecimal;
import java.util.Date;

import org.apache.cayenne.CayenneDataObject;
import org.apache.cayenne.exp.Property;

/**
 * Class _CargoMtmMonitor was generated by Cayenne.
 * It is probably a good idea to avoid changing this class manually,
 * since it may be overwritten next time code is regenerated.
 * If you need to make any customizations, please use subclass.
 */
public abstract class _CargoMtmMonitor extends CayenneDataObject
{

	private static final long serialVersionUID = 1L;

	public static final String OID_PK_COLUMN = "oid";

	public static final Property<BigDecimal> ADDRESS_COMMISS = new Property<BigDecimal>("addressCommiss");
	public static final Property<BigDecimal> BROKER_COMMISS = new Property<BigDecimal>("brokerCommiss");
	public static final Property<String> BUY_SELL = new Property<String>("buySell");
	public static final Property<Integer> CARGO_KEY = new Property<Integer>("cargoKey");
	public static final Property<BigDecimal> CARGO_TRADE_PRICE = new Property<BigDecimal>("cargoTradePrice");
	public static final Property<Integer> COMMODITY_MARKET = new Property<Integer>("commodityMarket");
	public static final Property<Date> CP_DATE = new Property<Date>("cpDate");
	public static final Property<Date> LAYCAN_FROM = new Property<Date>("laycanFrom");
	public static final Property<Date> LAYCAN_TO = new Property<Date>("laycanTo");
	public static final Property<Date> MTM_ASOF_DATE = new Property<Date>("mtmAsofDate");
	public static final Property<Integer> PORTFOLIO = new Property<Integer>("portfolio");
	public static final Property<BigDecimal> QUANTITY = new Property<BigDecimal>("quantity");
	public static final Property<String> RATE_TYPE = new Property<String>("rateType");
	public static final Property<Date> RISK_PERIOD = new Property<Date>("riskPeriod");
	public static final Property<String> UOM = new Property<String>("uom");

	public void setAddressCommiss(BigDecimal addressCommiss)
	{
		writeProperty("addressCommiss", addressCommiss);
	}

	public BigDecimal getAddressCommiss()
	{
		return (BigDecimal) readProperty("addressCommiss");
	}

	public void setBrokerCommiss(BigDecimal brokerCommiss)
	{
		writeProperty("brokerCommiss", brokerCommiss);
	}

	public BigDecimal getBrokerCommiss()
	{
		return (BigDecimal) readProperty("brokerCommiss");
	}

	public void setBuySell(String buySell)
	{
		writeProperty("buySell", buySell);
	}

	public String getBuySell()
	{
		return (String) readProperty("buySell");
	}

	public void setCargoKey(Integer cargoKey)
	{
		writeProperty("cargoKey", cargoKey);
	}

	public Integer getCargoKey()
	{
		return (Integer) readProperty("cargoKey");
	}

	public void setCargoTradePrice(BigDecimal cargoTradePrice)
	{
		writeProperty("cargoTradePrice", cargoTradePrice);
	}

	public BigDecimal getCargoTradePrice()
	{
		return (BigDecimal) readProperty("cargoTradePrice");
	}

	public void setCommodityMarket(Integer commodityMarket)
	{
		writeProperty("commodityMarket", commodityMarket);
	}

	public Integer getCommodityMarket()
	{
		return (Integer) readProperty("commodityMarket");
	}

	public void setCpDate(Date cpDate)
	{
		writeProperty("cpDate", cpDate);
	}

	public Date getCpDate()
	{
		return (Date) readProperty("cpDate");
	}

	public void setLaycanFrom(Date laycanFrom)
	{
		writeProperty("laycanFrom", laycanFrom);
	}

	public Date getLaycanFrom()
	{
		return (Date) readProperty("laycanFrom");
	}

	public void setLaycanTo(Date laycanTo)
	{
		writeProperty("laycanTo", laycanTo);
	}

	public Date getLaycanTo()
	{
		return (Date) readProperty("laycanTo");
	}

	public void setMtmAsofDate(Date mtmAsofDate)
	{
		writeProperty("mtmAsofDate", mtmAsofDate);
	}

	public Date getMtmAsofDate()
	{
		return (Date) readProperty("mtmAsofDate");
	}

	public void setPortfolio(Integer portfolio)
	{
		writeProperty("portfolio", portfolio);
	}

	public Integer getPortfolio()
	{
		return (Integer) readProperty("portfolio");
	}

	public void setQuantity(BigDecimal quantity)
	{
		writeProperty("quantity", quantity);
	}

	public BigDecimal getQuantity()
	{
		return (BigDecimal) readProperty("quantity");
	}

	public void setRateType(String rateType)
	{
		writeProperty("rateType", rateType);
	}

	public String getRateType()
	{
		return (String) readProperty("rateType");
	}

	public void setRiskPeriod(Date riskPeriod)
	{
		writeProperty("riskPeriod", riskPeriod);
	}

	public Date getRiskPeriod()
	{
		return (Date) readProperty("riskPeriod");
	}

	public void setUom(String uom)
	{
		writeProperty("uom", uom);
	}

	public String getUom()
	{
		return (String) readProperty("uom");
	}

}