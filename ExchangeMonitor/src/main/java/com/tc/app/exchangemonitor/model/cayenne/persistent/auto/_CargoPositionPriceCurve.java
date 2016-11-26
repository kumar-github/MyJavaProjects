package com.tc.app.exchangemonitor.model.cayenne.persistent.auto;

import java.math.BigDecimal;
import java.util.Date;

import org.apache.cayenne.CayenneDataObject;
import org.apache.cayenne.exp.Property;

import com.tc.app.exchangemonitor.model.cayenne.persistent.CargoPositionTemplate;

/**
 * Class _CargoPositionPriceCurve was generated by Cayenne.
 * It is probably a good idea to avoid changing this class manually,
 * since it may be overwritten next time code is regenerated.
 * If you need to make any customizations, please use subclass.
 */
public abstract class _CargoPositionPriceCurve extends CayenneDataObject
{

	private static final long serialVersionUID = 1L;

	public static final String ID_PK_COLUMN = "id";

	public static final Property<BigDecimal> IFO_PRICE = new Property<BigDecimal>("ifoPrice");
	public static final Property<BigDecimal> MDO_PRICE = new Property<BigDecimal>("mdoPrice");
	public static final Property<Date> PRICE_DATE = new Property<Date>("priceDate");
	public static final Property<BigDecimal> PRICE_VALUE = new Property<BigDecimal>("priceValue");
	public static final Property<BigDecimal> VOYAGE_COST_DAY_PRICE = new Property<BigDecimal>("voyageCostDayPrice");
	public static final Property<CargoPositionTemplate> TEMPLATE = new Property<CargoPositionTemplate>("template");

	public void setIfoPrice(BigDecimal ifoPrice)
	{
		writeProperty("ifoPrice", ifoPrice);
	}

	public BigDecimal getIfoPrice()
	{
		return (BigDecimal) readProperty("ifoPrice");
	}

	public void setMdoPrice(BigDecimal mdoPrice)
	{
		writeProperty("mdoPrice", mdoPrice);
	}

	public BigDecimal getMdoPrice()
	{
		return (BigDecimal) readProperty("mdoPrice");
	}

	public void setPriceDate(Date priceDate)
	{
		writeProperty("priceDate", priceDate);
	}

	public Date getPriceDate()
	{
		return (Date) readProperty("priceDate");
	}

	public void setPriceValue(BigDecimal priceValue)
	{
		writeProperty("priceValue", priceValue);
	}

	public BigDecimal getPriceValue()
	{
		return (BigDecimal) readProperty("priceValue");
	}

	public void setVoyageCostDayPrice(BigDecimal voyageCostDayPrice)
	{
		writeProperty("voyageCostDayPrice", voyageCostDayPrice);
	}

	public BigDecimal getVoyageCostDayPrice()
	{
		return (BigDecimal) readProperty("voyageCostDayPrice");
	}

	public void setTemplate(CargoPositionTemplate template)
	{
		setToOneTarget("template", template, true);
	}

	public CargoPositionTemplate getTemplate()
	{
		return (CargoPositionTemplate) readProperty("template");
	}

}
