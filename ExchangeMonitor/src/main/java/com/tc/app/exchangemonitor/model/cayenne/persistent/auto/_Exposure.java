package com.tc.app.exchangemonitor.model.cayenne.persistent.auto;

import java.util.Date;

import org.apache.cayenne.CayenneDataObject;
import org.apache.cayenne.exp.Property;

import com.tc.app.exchangemonitor.model.cayenne.persistent.Account;
import com.tc.app.exchangemonitor.model.cayenne.persistent.Commodity;
import com.tc.app.exchangemonitor.model.cayenne.persistent.Country;
import com.tc.app.exchangemonitor.model.cayenne.persistent.Location;
import com.tc.app.exchangemonitor.model.cayenne.persistent.Market;

/**
 * Class _Exposure was generated by Cayenne.
 * It is probably a good idea to avoid changing this class manually,
 * since it may be overwritten next time code is regenerated.
 * If you need to make any customizations, please use subclass.
 */
public abstract class _Exposure extends CayenneDataObject
{

	private static final long serialVersionUID = 1L;

	public static final String EXPOSURE_NUM_PK_COLUMN = "exposure_num";

	public static final Property<Date> EXP_AS_OF_DATE = new Property<>("expAsOfDate");
	public static final Property<String> EXP_ORDER_TYPE_GROUP = new Property<>("expOrderTypeGroup");
	public static final Property<String> EXP_PASTDUE_IND = new Property<>("expPastdueInd");
	public static final Property<String> EXP_SECUR_IND = new Property<>("expSecurInd");
	public static final Property<String> EXP_TRADING_PRD = new Property<>("expTradingPrd");
	public static final Property<Integer> TRANS_ID = new Property<>("transId");
	public static final Property<Account> ACCOUNT = new Property<>("account");
	public static final Property<Account> ACCOUNT1 = new Property<>("account1");
	public static final Property<Commodity> COMMODITY = new Property<>("commodity");
	public static final Property<Country> COUNTRY = new Property<>("country");
	public static final Property<Location> LOCATION = new Property<>("location");
	public static final Property<Market> MARKET = new Property<>("market");

	public void setExpAsOfDate(final Date expAsOfDate)
	{
		this.writeProperty("expAsOfDate", expAsOfDate);
	}

	public Date getExpAsOfDate()
	{
		return (Date) this.readProperty("expAsOfDate");
	}

	public void setExpOrderTypeGroup(final String expOrderTypeGroup)
	{
		this.writeProperty("expOrderTypeGroup", expOrderTypeGroup);
	}

	public String getExpOrderTypeGroup()
	{
		return (String) this.readProperty("expOrderTypeGroup");
	}

	public void setExpPastdueInd(final String expPastdueInd)
	{
		this.writeProperty("expPastdueInd", expPastdueInd);
	}

	public String getExpPastdueInd()
	{
		return (String) this.readProperty("expPastdueInd");
	}

	public void setExpSecurInd(final String expSecurInd)
	{
		this.writeProperty("expSecurInd", expSecurInd);
	}

	public String getExpSecurInd()
	{
		return (String) this.readProperty("expSecurInd");
	}

	public void setExpTradingPrd(final String expTradingPrd)
	{
		this.writeProperty("expTradingPrd", expTradingPrd);
	}

	public String getExpTradingPrd()
	{
		return (String) this.readProperty("expTradingPrd");
	}

	public void setTransId(final Integer transId)
	{
		this.writeProperty("transId", transId);
	}

	public Integer getTransId()
	{
		return (Integer) this.readProperty("transId");
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

	public void setCommodity(final Commodity commodity)
	{
		this.setToOneTarget("commodity", commodity, true);
	}

	public Commodity getCommodity()
	{
		return (Commodity) this.readProperty("commodity");
	}

	public void setCountry(final Country country)
	{
		this.setToOneTarget("country", country, true);
	}

	public Country getCountry()
	{
		return (Country) this.readProperty("country");
	}

	public void setLocation(final Location location)
	{
		this.setToOneTarget("location", location, true);
	}

	public Location getLocation()
	{
		return (Location) this.readProperty("location");
	}

	public void setMarket(final Market market)
	{
		this.setToOneTarget("market", market, true);
	}

	public Market getMarket()
	{
		return (Market) this.readProperty("market");
	}

}