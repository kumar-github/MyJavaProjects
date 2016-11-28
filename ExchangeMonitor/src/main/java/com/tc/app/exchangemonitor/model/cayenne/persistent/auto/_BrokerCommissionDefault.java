package com.tc.app.exchangemonitor.model.cayenne.persistent.auto;

import org.apache.cayenne.CayenneDataObject;
import org.apache.cayenne.exp.Property;

import com.tc.app.exchangemonitor.model.cayenne.persistent.Account;
import com.tc.app.exchangemonitor.model.cayenne.persistent.AccountContact;
import com.tc.app.exchangemonitor.model.cayenne.persistent.Commodity;
import com.tc.app.exchangemonitor.model.cayenne.persistent.Location;
import com.tc.app.exchangemonitor.model.cayenne.persistent.OrderType;
import com.tc.app.exchangemonitor.model.cayenne.persistent.Uom;

/**
 * Class _BrokerCommissionDefault was generated by Cayenne.
 * It is probably a good idea to avoid changing this class manually,
 * since it may be overwritten next time code is regenerated.
 * If you need to make any customizations, please use subclass.
 */
public abstract class _BrokerCommissionDefault extends CayenneDataObject
{

	private static final long serialVersionUID = 1L;

	public static final String BRKR_COMM_DFLT_NUM_PK_COLUMN = "brkr_comm_dflt_num";

	public static final Property<Double> BRKR_COMM_AMT = new Property<>("brkrCommAmt");
	public static final Property<String> P_SIND = new Property<>("pSInd");
	public static final Property<Integer> TRANS_ID = new Property<>("transId");
	public static final Property<Account> ACCOUNT = new Property<>("account");
	public static final Property<Account> ACCOUNT1 = new Property<>("account1");
	public static final Property<AccountContact> ACCOUNT_CONTACT = new Property<>("accountContact");
	public static final Property<AccountContact> ACCOUNT_CONTACT1 = new Property<>("accountContact1");
	public static final Property<Commodity> COMMODITY = new Property<>("commodity");
	public static final Property<Commodity> COMMODITY1 = new Property<>("commodity1");
	public static final Property<Location> LOCATION = new Property<>("location");
	public static final Property<OrderType> ORDER_TYPE = new Property<>("orderType");
	public static final Property<Uom> UOM = new Property<>("uom");

	public void setBrkrCommAmt(final Double brkrCommAmt)
	{
		this.writeProperty("brkrCommAmt", brkrCommAmt);
	}

	public Double getBrkrCommAmt()
	{
		return (Double) this.readProperty("brkrCommAmt");
	}

	public void setPSInd(final String pSInd)
	{
		this.writeProperty("pSInd", pSInd);
	}

	public String getPSInd()
	{
		return (String) this.readProperty("pSInd");
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

	public void setAccountContact(final AccountContact accountContact)
	{
		this.setToOneTarget("accountContact", accountContact, true);
	}

	public AccountContact getAccountContact()
	{
		return (AccountContact) this.readProperty("accountContact");
	}

	public void setAccountContact1(final AccountContact accountContact1)
	{
		this.setToOneTarget("accountContact1", accountContact1, true);
	}

	public AccountContact getAccountContact1()
	{
		return (AccountContact) this.readProperty("accountContact1");
	}

	public void setCommodity(final Commodity commodity)
	{
		this.setToOneTarget("commodity", commodity, true);
	}

	public Commodity getCommodity()
	{
		return (Commodity) this.readProperty("commodity");
	}

	public void setCommodity1(final Commodity commodity1)
	{
		this.setToOneTarget("commodity1", commodity1, true);
	}

	public Commodity getCommodity1()
	{
		return (Commodity) this.readProperty("commodity1");
	}

	public void setLocation(final Location location)
	{
		this.setToOneTarget("location", location, true);
	}

	public Location getLocation()
	{
		return (Location) this.readProperty("location");
	}

	public void setOrderType(final OrderType orderType)
	{
		this.setToOneTarget("orderType", orderType, true);
	}

	public OrderType getOrderType()
	{
		return (OrderType) this.readProperty("orderType");
	}

	public void setUom(final Uom uom)
	{
		this.setToOneTarget("uom", uom, true);
	}

	public Uom getUom()
	{
		return (Uom) this.readProperty("uom");
	}

}