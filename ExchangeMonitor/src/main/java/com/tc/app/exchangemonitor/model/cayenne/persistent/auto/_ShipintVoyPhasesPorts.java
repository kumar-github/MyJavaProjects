package com.tc.app.exchangemonitor.model.cayenne.persistent.auto;

import org.apache.cayenne.CayenneDataObject;
import org.apache.cayenne.exp.Property;

import com.tc.app.exchangemonitor.model.cayenne.persistent.ShipintVoyEventsPhases;
import com.tc.app.exchangemonitor.model.cayenne.persistent.ShipintVoyPort;

/**
 * Class _ShipintVoyPhasesPorts was generated by Cayenne.
 * It is probably a good idea to avoid changing this class manually,
 * since it may be overwritten next time code is regenerated.
 * If you need to make any customizations, please use subclass.
 */
public abstract class _ShipintVoyPhasesPorts extends CayenneDataObject
{

	private static final long serialVersionUID = 1L;

	public static final String EVENT_PHASES_ID_PK_COLUMN = "event_phases_id";
	public static final String VOY_PORT_ID_PK_COLUMN = "voy_port_id";

	public static final Property<Double> TIME_ELAPSED = new Property<Double>("timeElapsed");
	public static final Property<Double> WORTH = new Property<Double>("worth");
	public static final Property<ShipintVoyEventsPhases> EVENT_PHASES = new Property<ShipintVoyEventsPhases>("eventPhases");
	public static final Property<ShipintVoyPort> VOY_PORT = new Property<ShipintVoyPort>("voyPort");

	public void setTimeElapsed(Double timeElapsed)
	{
		writeProperty("timeElapsed", timeElapsed);
	}

	public Double getTimeElapsed()
	{
		return (Double) readProperty("timeElapsed");
	}

	public void setWorth(Double worth)
	{
		writeProperty("worth", worth);
	}

	public Double getWorth()
	{
		return (Double) readProperty("worth");
	}

	public void setEventPhases(ShipintVoyEventsPhases eventPhases)
	{
		setToOneTarget("eventPhases", eventPhases, true);
	}

	public ShipintVoyEventsPhases getEventPhases()
	{
		return (ShipintVoyEventsPhases) readProperty("eventPhases");
	}

	public void setVoyPort(ShipintVoyPort voyPort)
	{
		setToOneTarget("voyPort", voyPort, true);
	}

	public ShipintVoyPort getVoyPort()
	{
		return (ShipintVoyPort) readProperty("voyPort");
	}

}