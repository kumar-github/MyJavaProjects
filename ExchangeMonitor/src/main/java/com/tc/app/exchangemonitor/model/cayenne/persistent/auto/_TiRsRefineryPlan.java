package com.tc.app.exchangemonitor.model.cayenne.persistent.auto;

import java.math.BigDecimal;
import java.util.Date;

import org.apache.cayenne.CayenneDataObject;
import org.apache.cayenne.exp.Property;

import com.tc.app.exchangemonitor.model.cayenne.persistent.TiInboundDataXml;

/**
 * Class _TiRsRefineryPlan was generated by Cayenne.
 * It is probably a good idea to avoid changing this class manually,
 * since it may be overwritten next time code is regenerated.
 * If you need to make any customizations, please use subclass.
 */
public abstract class _TiRsRefineryPlan extends CayenneDataObject
{

	private static final long serialVersionUID = 1L;

	public static final String OID_PK_COLUMN = "oid";

	public static final Property<Date> END_DATE = new Property<Date>("endDate");
	public static final Property<Date> ETL_TIMESTAMP = new Property<Date>("etlTimestamp");
	public static final Property<String> FORECAST_TYPE = new Property<String>("forecastType");
	public static final Property<String> MATERIAL = new Property<String>("material");
	public static final Property<BigDecimal> PROD_FORECAST = new Property<BigDecimal>("prodForecast");
	public static final Property<String> PW_MATERIAL = new Property<String>("pwMaterial");
	public static final Property<String> REFINERY = new Property<String>("refinery");
	public static final Property<Date> START_DATE = new Property<Date>("startDate");
	public static final Property<String> STATUS = new Property<String>("status");
	public static final Property<String> UOM = new Property<String>("uom");
	public static final Property<Date> VERSION = new Property<Date>("version");
	public static final Property<TiInboundDataXml> INBOUND_DATA_O = new Property<TiInboundDataXml>("inboundDataO");

	public void setEndDate(Date endDate)
	{
		writeProperty("endDate", endDate);
	}

	public Date getEndDate()
	{
		return (Date) readProperty("endDate");
	}

	public void setEtlTimestamp(Date etlTimestamp)
	{
		writeProperty("etlTimestamp", etlTimestamp);
	}

	public Date getEtlTimestamp()
	{
		return (Date) readProperty("etlTimestamp");
	}

	public void setForecastType(String forecastType)
	{
		writeProperty("forecastType", forecastType);
	}

	public String getForecastType()
	{
		return (String) readProperty("forecastType");
	}

	public void setMaterial(String material)
	{
		writeProperty("material", material);
	}

	public String getMaterial()
	{
		return (String) readProperty("material");
	}

	public void setProdForecast(BigDecimal prodForecast)
	{
		writeProperty("prodForecast", prodForecast);
	}

	public BigDecimal getProdForecast()
	{
		return (BigDecimal) readProperty("prodForecast");
	}

	public void setPwMaterial(String pwMaterial)
	{
		writeProperty("pwMaterial", pwMaterial);
	}

	public String getPwMaterial()
	{
		return (String) readProperty("pwMaterial");
	}

	public void setRefinery(String refinery)
	{
		writeProperty("refinery", refinery);
	}

	public String getRefinery()
	{
		return (String) readProperty("refinery");
	}

	public void setStartDate(Date startDate)
	{
		writeProperty("startDate", startDate);
	}

	public Date getStartDate()
	{
		return (Date) readProperty("startDate");
	}

	public void setStatus(String status)
	{
		writeProperty("status", status);
	}

	public String getStatus()
	{
		return (String) readProperty("status");
	}

	public void setUom(String uom)
	{
		writeProperty("uom", uom);
	}

	public String getUom()
	{
		return (String) readProperty("uom");
	}

	public void setVersion(Date version)
	{
		writeProperty("version", version);
	}

	public Date getVersion()
	{
		return (Date) readProperty("version");
	}

	public void setInboundDataO(TiInboundDataXml inboundDataO)
	{
		setToOneTarget("inboundDataO", inboundDataO, true);
	}

	public TiInboundDataXml getInboundDataO()
	{
		return (TiInboundDataXml) readProperty("inboundDataO");
	}

}
