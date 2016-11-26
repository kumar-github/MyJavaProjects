package com.tc.app.exchangemonitor.model.cayenne.persistent.auto;

import java.math.BigDecimal;

import org.apache.cayenne.CayenneDataObject;
import org.apache.cayenne.exp.Property;

import com.tc.app.exchangemonitor.model.cayenne.persistent.CargoPositionTemplate;

/**
 * Class _CargoPositionConsumptionSea was generated by Cayenne.
 * It is probably a good idea to avoid changing this class manually,
 * since it may be overwritten next time code is regenerated.
 * If you need to make any customizations, please use subclass.
 */
public abstract class _CargoPositionConsumptionSea extends CayenneDataObject
{

	private static final long serialVersionUID = 1L;

	public static final String BUNKER_CMDTY_PK_COLUMN = "bunker_cmdty";
	public static final String SPEED_PK_COLUMN = "speed";
	public static final String TEMPLATE_ID_PK_COLUMN = "template_id";

	public static final Property<BigDecimal> BALLAST = new Property<BigDecimal>("ballast");
	public static final Property<BigDecimal> LADEN = new Property<BigDecimal>("laden");
	public static final Property<CargoPositionTemplate> TEMPLATE = new Property<CargoPositionTemplate>("template");

	public void setBallast(BigDecimal ballast)
	{
		writeProperty("ballast", ballast);
	}

	public BigDecimal getBallast()
	{
		return (BigDecimal) readProperty("ballast");
	}

	public void setLaden(BigDecimal laden)
	{
		writeProperty("laden", laden);
	}

	public BigDecimal getLaden()
	{
		return (BigDecimal) readProperty("laden");
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
