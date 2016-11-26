package com.tc.app.exchangemonitor.model.cayenne.persistent.auto;

import java.util.Date;

import org.apache.cayenne.CayenneDataObject;
import org.apache.cayenne.exp.Property;

import com.tc.app.exchangemonitor.model.cayenne.persistent.Account;
import com.tc.app.exchangemonitor.model.cayenne.persistent.Portfolio;

/**
 * Class _BrokerFifoRunRec was generated by Cayenne.
 * It is probably a good idea to avoid changing this class manually,
 * since it may be overwritten next time code is regenerated.
 * If you need to make any customizations, please use subclass.
 */
public abstract class _BrokerFifoRunRec extends CayenneDataObject
{

	private static final long serialVersionUID = 1L;

	public static final String BROKER_NUM_PK_COLUMN = "broker_num";
	public static final String WORLD_PORT_NUM_PK_COLUMN = "world_port_num";

	public static final Property<Date> FUTURES_LAST_FIFO_DATE = new Property<Date>("futuresLastFifoDate");
	public static final Property<Date> OPTIONS_LAST_FIFO_DATE = new Property<Date>("optionsLastFifoDate");
	public static final Property<Integer> TRANS_ID = new Property<Integer>("transId");
	public static final Property<Account> ACCOUNT = new Property<Account>("account");
	public static final Property<Portfolio> PORTFOLIO = new Property<Portfolio>("portfolio");

	public void setFuturesLastFifoDate(Date futuresLastFifoDate)
	{
		writeProperty("futuresLastFifoDate", futuresLastFifoDate);
	}

	public Date getFuturesLastFifoDate()
	{
		return (Date) readProperty("futuresLastFifoDate");
	}

	public void setOptionsLastFifoDate(Date optionsLastFifoDate)
	{
		writeProperty("optionsLastFifoDate", optionsLastFifoDate);
	}

	public Date getOptionsLastFifoDate()
	{
		return (Date) readProperty("optionsLastFifoDate");
	}

	public void setTransId(Integer transId)
	{
		writeProperty("transId", transId);
	}

	public Integer getTransId()
	{
		return (Integer) readProperty("transId");
	}

	public void setAccount(Account account)
	{
		setToOneTarget("account", account, true);
	}

	public Account getAccount()
	{
		return (Account) readProperty("account");
	}

	public void setPortfolio(Portfolio portfolio)
	{
		setToOneTarget("portfolio", portfolio, true);
	}

	public Portfolio getPortfolio()
	{
		return (Portfolio) readProperty("portfolio");
	}

}
