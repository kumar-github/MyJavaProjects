package com.tc.app.exchangemonitor.model.cayenne.persistent.auto;

import java.math.BigDecimal;
import java.util.Date;

import org.apache.cayenne.CayenneDataObject;
import org.apache.cayenne.exp.Property;

/**
 * Class _VieWBVOXXBldate was generated by Cayenne.
 * It is probably a good idea to avoid changing this class manually,
 * since it may be overwritten next time code is regenerated.
 * If you need to make any customizations, please use subclass.
 */
public abstract class _VieWBVOXXBldate extends CayenneDataObject
{

	private static final long serialVersionUID = 1L;

	public static final Property<String> FLDCHR_FREIGHT_CRNCY_CODE = new Property<String>("fldchrFreightCrncyCode");
	public static final Property<String> FLDCHR_LOT_KEY = new Property<String>("fldchrLotKey");
	public static final Property<BigDecimal> FLDDEC_FREIGHT = new Property<BigDecimal>("flddecFreight");
	public static final Property<Date> FLDSDT_BLDATE = new Property<Date>("fldsdtBLDate");
	public static final Property<Date> FLDSDT_END_DATE = new Property<Date>("fldsdtEndDate");
	public static final Property<Date> FLDSDT_START_DATE = new Property<Date>("fldsdtStartDate");

	public void setFldchrFreightCrncyCode(String fldchrFreightCrncyCode)
	{
		writeProperty("fldchrFreightCrncyCode", fldchrFreightCrncyCode);
	}

	public String getFldchrFreightCrncyCode()
	{
		return (String) readProperty("fldchrFreightCrncyCode");
	}

	public void setFldchrLotKey(String fldchrLotKey)
	{
		writeProperty("fldchrLotKey", fldchrLotKey);
	}

	public String getFldchrLotKey()
	{
		return (String) readProperty("fldchrLotKey");
	}

	public void setFlddecFreight(BigDecimal flddecFreight)
	{
		writeProperty("flddecFreight", flddecFreight);
	}

	public BigDecimal getFlddecFreight()
	{
		return (BigDecimal) readProperty("flddecFreight");
	}

	public void setFldsdtBLDate(Date fldsdtBLDate)
	{
		writeProperty("fldsdtBLDate", fldsdtBLDate);
	}

	public Date getFldsdtBLDate()
	{
		return (Date) readProperty("fldsdtBLDate");
	}

	public void setFldsdtEndDate(Date fldsdtEndDate)
	{
		writeProperty("fldsdtEndDate", fldsdtEndDate);
	}

	public Date getFldsdtEndDate()
	{
		return (Date) readProperty("fldsdtEndDate");
	}

	public void setFldsdtStartDate(Date fldsdtStartDate)
	{
		writeProperty("fldsdtStartDate", fldsdtStartDate);
	}

	public Date getFldsdtStartDate()
	{
		return (Date) readProperty("fldsdtStartDate");
	}

}