package com.tc.app.exchangemonitor.model.cayenne.persistent.auto;

import java.util.Date;

import org.apache.cayenne.CayenneDataObject;
import org.apache.cayenne.exp.Property;

import com.tc.app.exchangemonitor.model.cayenne.persistent.Account;

/**
 * Class _PortfolioBookPl was generated by Cayenne.
 * It is probably a good idea to avoid changing this class manually,
 * since it may be overwritten next time code is regenerated.
 * If you need to make any customizations, please use subclass.
 */
public abstract class _PortfolioBookPl extends CayenneDataObject
{

	private static final long serialVersionUID = 1L;

	public static final String BOOK_PL_NUM_PK_COLUMN = "book_pl_num";

	public static final Property<Date> BOOK_DATE = new Property<Date>("bookDate");
	public static final Property<String> BOOK_PL_CURR_CODE = new Property<String>("bookPlCurrCode");
	public static final Property<Double> HEDGE_BOOK_PL = new Property<Double>("hedgeBookPl");
	public static final Property<Double> PHYS_BOOK_PL = new Property<Double>("physBookPl");
	public static final Property<Integer> PORT_NUM = new Property<Integer>("portNum");
	public static final Property<Integer> TRANS_ID = new Property<Integer>("transId");
	public static final Property<Account> ACCOUNT = new Property<Account>("account");

	public void setBookDate(Date bookDate)
	{
		writeProperty("bookDate", bookDate);
	}

	public Date getBookDate()
	{
		return (Date) readProperty("bookDate");
	}

	public void setBookPlCurrCode(String bookPlCurrCode)
	{
		writeProperty("bookPlCurrCode", bookPlCurrCode);
	}

	public String getBookPlCurrCode()
	{
		return (String) readProperty("bookPlCurrCode");
	}

	public void setHedgeBookPl(Double hedgeBookPl)
	{
		writeProperty("hedgeBookPl", hedgeBookPl);
	}

	public Double getHedgeBookPl()
	{
		return (Double) readProperty("hedgeBookPl");
	}

	public void setPhysBookPl(Double physBookPl)
	{
		writeProperty("physBookPl", physBookPl);
	}

	public Double getPhysBookPl()
	{
		return (Double) readProperty("physBookPl");
	}

	public void setPortNum(Integer portNum)
	{
		writeProperty("portNum", portNum);
	}

	public Integer getPortNum()
	{
		return (Integer) readProperty("portNum");
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

}
