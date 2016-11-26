package com.tc.app.exchangemonitor.model.cayenne.persistent.auto;

import org.apache.cayenne.CayenneDataObject;
import org.apache.cayenne.exp.Property;

import com.tc.app.exchangemonitor.model.cayenne.persistent.Calendar;
import com.tc.app.exchangemonitor.model.cayenne.persistent.Commodity;
import com.tc.app.exchangemonitor.model.cayenne.persistent.Uom;

/**
 * Class _QuoteMarketdataSource was generated by Cayenne.
 * It is probably a good idea to avoid changing this class manually,
 * since it may be overwritten next time code is regenerated.
 * If you need to make any customizations, please use subclass.
 */
public abstract class _QuoteMarketdataSource extends CayenneDataObject
{

	private static final long serialVersionUID = 1L;

	public static final String ID_PK_COLUMN = "id";

	public static final Property<Integer> QUOTE_ID = new Property<>("quoteId");
	public static final Property<Integer> TRANS_ID = new Property<>("transId");
	public static final Property<Integer> VENDOR_ID = new Property<>("vendorId");
	public static final Property<Calendar> CALENDAR = new Property<>("calendar");
	public static final Property<Commodity> COMMODITY = new Property<>("commodity");
	public static final Property<Uom> UOM = new Property<>("uom");

	public void setQuoteId(final Integer quoteId)
	{
		this.writeProperty("quoteId", quoteId);
	}

	public Integer getQuoteId()
	{
		return (Integer) this.readProperty("quoteId");
	}

	public void setTransId(final Integer transId)
	{
		this.writeProperty("transId", transId);
	}

	public Integer getTransId()
	{
		return (Integer) this.readProperty("transId");
	}

	public void setVendorId(final Integer vendorId)
	{
		this.writeProperty("vendorId", vendorId);
	}

	public Integer getVendorId()
	{
		return (Integer) this.readProperty("vendorId");
	}

	public void setCalendar(final Calendar calendar)
	{
		this.setToOneTarget("calendar", calendar, true);
	}

	public Calendar getCalendar()
	{
		return (Calendar) this.readProperty("calendar");
	}

	public void setCommodity(final Commodity commodity)
	{
		this.setToOneTarget("commodity", commodity, true);
	}

	public Commodity getCommodity()
	{
		return (Commodity) this.readProperty("commodity");
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
