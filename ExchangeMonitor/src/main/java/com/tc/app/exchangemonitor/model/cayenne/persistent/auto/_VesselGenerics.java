package com.tc.app.exchangemonitor.model.cayenne.persistent.auto;

import java.math.BigDecimal;

import org.apache.cayenne.CayenneDataObject;
import org.apache.cayenne.exp.Property;

/**
 * Class _VesselGenerics was generated by Cayenne.
 * It is probably a good idea to avoid changing this class manually,
 * since it may be overwritten next time code is regenerated.
 * If you need to make any customizations, please use subclass.
 */
public abstract class _VesselGenerics extends CayenneDataObject
{

	private static final long serialVersionUID = 1L;

	public static final Property<BigDecimal> BALLAST_FUEL_OIL_CONSUMPTION = new Property<BigDecimal>("ballastFuelOilConsumption");
	public static final Property<BigDecimal> BALLAST_MARINE_DIESEL_CONSUMPTION = new Property<BigDecimal>("ballastMarineDieselConsumption");
	public static final Property<BigDecimal> BALLAST_SPEED = new Property<BigDecimal>("ballastSpeed");
	public static final Property<BigDecimal> DISCHARGE_FUEL_OIL_CONSUMPTION = new Property<BigDecimal>("dischargeFuelOilConsumption");
	public static final Property<BigDecimal> DISCHARGING_RATE = new Property<BigDecimal>("dischargingRate");
	public static final Property<BigDecimal> DRAFT = new Property<BigDecimal>("draft");
	public static final Property<BigDecimal> DSCHRG_MARINE_DIESEL_CONSUMPTION = new Property<BigDecimal>("dschrgMarineDieselConsumption");
	public static final Property<BigDecimal> DWT = new Property<BigDecimal>("dwt");
	public static final Property<BigDecimal> GT = new Property<BigDecimal>("gt");
	public static final Property<BigDecimal> HEATING_FUEL_OIL_CONSUMPTION = new Property<BigDecimal>("heatingFuelOilConsumption");
	public static final Property<BigDecimal> HEATING_MARINE_DIESEL_CONSUMPTION = new Property<BigDecimal>("heatingMarineDieselConsumption");
	public static final Property<BigDecimal> IDLE_FUEL_OIL_CONSUMPTION = new Property<BigDecimal>("idleFuelOilConsumption");
	public static final Property<BigDecimal> IDLE_MARINE_DIESEL_CONSUMPTION = new Property<BigDecimal>("idleMarineDieselConsumption");
	public static final Property<BigDecimal> LADEN_FUEL_OIL_CONSUMPTION = new Property<BigDecimal>("ladenFuelOilConsumption");
	public static final Property<BigDecimal> LADEN_MARINE_DIESEL_CONSUMPTION = new Property<BigDecimal>("ladenMarineDieselConsumption");
	public static final Property<BigDecimal> LADEN_SPEED = new Property<BigDecimal>("ladenSpeed");
	public static final Property<BigDecimal> LOAD_FUEL_OIL_CONSUMPTION = new Property<BigDecimal>("loadFuelOilConsumption");
	public static final Property<BigDecimal> LOAD_MARINE_DIESEL_CONSUMPTION = new Property<BigDecimal>("loadMarineDieselConsumption");
	public static final Property<BigDecimal> LOADING_RATE = new Property<BigDecimal>("loadingRate");
	public static final Property<Integer> TYPE_ID = new Property<Integer>("typeId");
	public static final Property<String> TYPE_NAME = new Property<String>("typeName");

	public void setBallastFuelOilConsumption(BigDecimal ballastFuelOilConsumption)
	{
		writeProperty("ballastFuelOilConsumption", ballastFuelOilConsumption);
	}

	public BigDecimal getBallastFuelOilConsumption()
	{
		return (BigDecimal) readProperty("ballastFuelOilConsumption");
	}

	public void setBallastMarineDieselConsumption(BigDecimal ballastMarineDieselConsumption)
	{
		writeProperty("ballastMarineDieselConsumption", ballastMarineDieselConsumption);
	}

	public BigDecimal getBallastMarineDieselConsumption()
	{
		return (BigDecimal) readProperty("ballastMarineDieselConsumption");
	}

	public void setBallastSpeed(BigDecimal ballastSpeed)
	{
		writeProperty("ballastSpeed", ballastSpeed);
	}

	public BigDecimal getBallastSpeed()
	{
		return (BigDecimal) readProperty("ballastSpeed");
	}

	public void setDischargeFuelOilConsumption(BigDecimal dischargeFuelOilConsumption)
	{
		writeProperty("dischargeFuelOilConsumption", dischargeFuelOilConsumption);
	}

	public BigDecimal getDischargeFuelOilConsumption()
	{
		return (BigDecimal) readProperty("dischargeFuelOilConsumption");
	}

	public void setDischargingRate(BigDecimal dischargingRate)
	{
		writeProperty("dischargingRate", dischargingRate);
	}

	public BigDecimal getDischargingRate()
	{
		return (BigDecimal) readProperty("dischargingRate");
	}

	public void setDraft(BigDecimal draft)
	{
		writeProperty("draft", draft);
	}

	public BigDecimal getDraft()
	{
		return (BigDecimal) readProperty("draft");
	}

	public void setDschrgMarineDieselConsumption(BigDecimal dschrgMarineDieselConsumption)
	{
		writeProperty("dschrgMarineDieselConsumption", dschrgMarineDieselConsumption);
	}

	public BigDecimal getDschrgMarineDieselConsumption()
	{
		return (BigDecimal) readProperty("dschrgMarineDieselConsumption");
	}

	public void setDwt(BigDecimal dwt)
	{
		writeProperty("dwt", dwt);
	}

	public BigDecimal getDwt()
	{
		return (BigDecimal) readProperty("dwt");
	}

	public void setGt(BigDecimal gt)
	{
		writeProperty("gt", gt);
	}

	public BigDecimal getGt()
	{
		return (BigDecimal) readProperty("gt");
	}

	public void setHeatingFuelOilConsumption(BigDecimal heatingFuelOilConsumption)
	{
		writeProperty("heatingFuelOilConsumption", heatingFuelOilConsumption);
	}

	public BigDecimal getHeatingFuelOilConsumption()
	{
		return (BigDecimal) readProperty("heatingFuelOilConsumption");
	}

	public void setHeatingMarineDieselConsumption(BigDecimal heatingMarineDieselConsumption)
	{
		writeProperty("heatingMarineDieselConsumption", heatingMarineDieselConsumption);
	}

	public BigDecimal getHeatingMarineDieselConsumption()
	{
		return (BigDecimal) readProperty("heatingMarineDieselConsumption");
	}

	public void setIdleFuelOilConsumption(BigDecimal idleFuelOilConsumption)
	{
		writeProperty("idleFuelOilConsumption", idleFuelOilConsumption);
	}

	public BigDecimal getIdleFuelOilConsumption()
	{
		return (BigDecimal) readProperty("idleFuelOilConsumption");
	}

	public void setIdleMarineDieselConsumption(BigDecimal idleMarineDieselConsumption)
	{
		writeProperty("idleMarineDieselConsumption", idleMarineDieselConsumption);
	}

	public BigDecimal getIdleMarineDieselConsumption()
	{
		return (BigDecimal) readProperty("idleMarineDieselConsumption");
	}

	public void setLadenFuelOilConsumption(BigDecimal ladenFuelOilConsumption)
	{
		writeProperty("ladenFuelOilConsumption", ladenFuelOilConsumption);
	}

	public BigDecimal getLadenFuelOilConsumption()
	{
		return (BigDecimal) readProperty("ladenFuelOilConsumption");
	}

	public void setLadenMarineDieselConsumption(BigDecimal ladenMarineDieselConsumption)
	{
		writeProperty("ladenMarineDieselConsumption", ladenMarineDieselConsumption);
	}

	public BigDecimal getLadenMarineDieselConsumption()
	{
		return (BigDecimal) readProperty("ladenMarineDieselConsumption");
	}

	public void setLadenSpeed(BigDecimal ladenSpeed)
	{
		writeProperty("ladenSpeed", ladenSpeed);
	}

	public BigDecimal getLadenSpeed()
	{
		return (BigDecimal) readProperty("ladenSpeed");
	}

	public void setLoadFuelOilConsumption(BigDecimal loadFuelOilConsumption)
	{
		writeProperty("loadFuelOilConsumption", loadFuelOilConsumption);
	}

	public BigDecimal getLoadFuelOilConsumption()
	{
		return (BigDecimal) readProperty("loadFuelOilConsumption");
	}

	public void setLoadMarineDieselConsumption(BigDecimal loadMarineDieselConsumption)
	{
		writeProperty("loadMarineDieselConsumption", loadMarineDieselConsumption);
	}

	public BigDecimal getLoadMarineDieselConsumption()
	{
		return (BigDecimal) readProperty("loadMarineDieselConsumption");
	}

	public void setLoadingRate(BigDecimal loadingRate)
	{
		writeProperty("loadingRate", loadingRate);
	}

	public BigDecimal getLoadingRate()
	{
		return (BigDecimal) readProperty("loadingRate");
	}

	public void setTypeId(Integer typeId)
	{
		writeProperty("typeId", typeId);
	}

	public Integer getTypeId()
	{
		return (Integer) readProperty("typeId");
	}

	public void setTypeName(String typeName)
	{
		writeProperty("typeName", typeName);
	}

	public String getTypeName()
	{
		return (String) readProperty("typeName");
	}

}