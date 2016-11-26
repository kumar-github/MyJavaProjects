package com.tc.app.exchangemonitor.model.cayenne.persistent.auto;

import java.util.Date;

import org.apache.cayenne.CayenneDataObject;
import org.apache.cayenne.exp.Property;

import com.tc.app.exchangemonitor.model.cayenne.persistent.Account;
import com.tc.app.exchangemonitor.model.cayenne.persistent.Commodity;
import com.tc.app.exchangemonitor.model.cayenne.persistent.Location;

/**
 * Class _TempValueAdjust was generated by Cayenne.
 * It is probably a good idea to avoid changing this class manually,
 * since it may be overwritten next time code is regenerated.
 * If you need to make any customizations, please use subclass.
 */
public abstract class _TempValueAdjust extends CayenneDataObject
{

	private static final long serialVersionUID = 1L;

	public static final String ACCT_NUM_PK_COLUMN = "acct_num";
	public static final String TVA_SEQNO_PK_COLUMN = "tva_seqno";

	public static final Property<Date> BEGIN_DATE = new Property<>("beginDate");
	public static final Property<Date> END_DATE = new Property<>("endDate");
	public static final Property<Double> PRICE_DELTA = new Property<>("priceDelta");
	public static final Property<String> PRICE_IND = new Property<>("priceInd");
	public static final Property<Integer> TRANS_ID = new Property<>("transId");
	public static final Property<Account> ACCOUNT = new Property<>("account");
	public static final Property<Commodity> COMMODITY = new Property<>("commodity");
	public static final Property<Location> LOCATION = new Property<>("location");

	public void setBeginDate(final Date beginDate)
	{
		this.writeProperty("beginDate", beginDate);
	}

	public Date getBeginDate()
	{
		return (Date) this.readProperty("beginDate");
	}

	public void setEndDate(final Date endDate)
	{
		this.writeProperty("endDate", endDate);
	}

	public Date getEndDate()
	{
		return (Date) this.readProperty("endDate");
	}

	public void setPriceDelta(final Double priceDelta)
	{
		this.writeProperty("priceDelta", priceDelta);
	}

	public Double getPriceDelta()
	{
		return (Double) this.readProperty("priceDelta");
	}

	public void setPriceInd(final String priceInd)
	{
		this.writeProperty("priceInd", priceInd);
	}

	public String getPriceInd()
	{
		return (String) this.readProperty("priceInd");
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

	public void setCommodity(final Commodity commodity)
	{
		this.setToOneTarget("commodity", commodity, true);
	}

	public Commodity getCommodity()
	{
		return (Commodity) this.readProperty("commodity");
	}

	public void setLocation(final Location location)
	{
		this.setToOneTarget("location", location, true);
	}

	public Location getLocation()
	{
		return (Location) this.readProperty("location");
	}

}
