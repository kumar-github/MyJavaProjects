package com.tc.app.exchangemonitor.model.cayenne.persistent.auto;

import java.math.BigDecimal;
import java.util.Date;

import org.apache.cayenne.CayenneDataObject;
import org.apache.cayenne.exp.Property;

/**
 * Class _BookedInvReconcil was generated by Cayenne.
 * It is probably a good idea to avoid changing this class manually,
 * since it may be overwritten next time code is regenerated.
 * If you need to make any customizations, please use subclass.
 */
public abstract class _BookedInvReconcil extends CayenneDataObject
{

	private static final long serialVersionUID = 1L;

	public static final String OID_PK_COLUMN = "oid";

	public static final Property<String> BALANCE_TYPE = new Property<String>("balanceType");
	public static final Property<BigDecimal> BOOKED_QTY = new Property<BigDecimal>("bookedQty");
	public static final Property<String> BOOKED_QTY_UOM = new Property<String>("bookedQtyUom");
	public static final Property<String> EXCHANGE_AGREEMENT_NUM = new Property<String>("exchangeAgreementNum");
	public static final Property<Date> FROM_DATE = new Property<Date>("fromDate");
	public static final Property<String> MATERIAL_CODE = new Property<String>("materialCode");
	public static final Property<BigDecimal> PHYSICAL_QTY = new Property<BigDecimal>("physicalQty");
	public static final Property<String> PHYSICAL_QTY_UOM = new Property<String>("physicalQtyUom");
	public static final Property<String> SAP_LOC_CODE = new Property<String>("sapLocCode");
	public static final Property<String> STATUS = new Property<String>("status");
	public static final Property<Date> TO_DATE = new Property<Date>("toDate");

	public void setBalanceType(String balanceType)
	{
		writeProperty("balanceType", balanceType);
	}

	public String getBalanceType()
	{
		return (String) readProperty("balanceType");
	}

	public void setBookedQty(BigDecimal bookedQty)
	{
		writeProperty("bookedQty", bookedQty);
	}

	public BigDecimal getBookedQty()
	{
		return (BigDecimal) readProperty("bookedQty");
	}

	public void setBookedQtyUom(String bookedQtyUom)
	{
		writeProperty("bookedQtyUom", bookedQtyUom);
	}

	public String getBookedQtyUom()
	{
		return (String) readProperty("bookedQtyUom");
	}

	public void setExchangeAgreementNum(String exchangeAgreementNum)
	{
		writeProperty("exchangeAgreementNum", exchangeAgreementNum);
	}

	public String getExchangeAgreementNum()
	{
		return (String) readProperty("exchangeAgreementNum");
	}

	public void setFromDate(Date fromDate)
	{
		writeProperty("fromDate", fromDate);
	}

	public Date getFromDate()
	{
		return (Date) readProperty("fromDate");
	}

	public void setMaterialCode(String materialCode)
	{
		writeProperty("materialCode", materialCode);
	}

	public String getMaterialCode()
	{
		return (String) readProperty("materialCode");
	}

	public void setPhysicalQty(BigDecimal physicalQty)
	{
		writeProperty("physicalQty", physicalQty);
	}

	public BigDecimal getPhysicalQty()
	{
		return (BigDecimal) readProperty("physicalQty");
	}

	public void setPhysicalQtyUom(String physicalQtyUom)
	{
		writeProperty("physicalQtyUom", physicalQtyUom);
	}

	public String getPhysicalQtyUom()
	{
		return (String) readProperty("physicalQtyUom");
	}

	public void setSapLocCode(String sapLocCode)
	{
		writeProperty("sapLocCode", sapLocCode);
	}

	public String getSapLocCode()
	{
		return (String) readProperty("sapLocCode");
	}

	public void setStatus(String status)
	{
		writeProperty("status", status);
	}

	public String getStatus()
	{
		return (String) readProperty("status");
	}

	public void setToDate(Date toDate)
	{
		writeProperty("toDate", toDate);
	}

	public Date getToDate()
	{
		return (Date) readProperty("toDate");
	}

}
