package com.tc.app.exchangemonitor.model.cayenne.persistent.auto;

import java.util.List;

import org.apache.cayenne.CayenneDataObject;
import org.apache.cayenne.exp.Property;

import com.tc.app.exchangemonitor.model.cayenne.persistent.ShipintEvents;
import com.tc.app.exchangemonitor.model.cayenne.persistent.ShipintVoyPhasesPorts;

/**
 * Class _ShipintVoyEventsPhases was generated by Cayenne.
 * It is probably a good idea to avoid changing this class manually,
 * since it may be overwritten next time code is regenerated.
 * If you need to make any customizations, please use subclass.
 */
public abstract class _ShipintVoyEventsPhases extends CayenneDataObject
{

	private static final long serialVersionUID = 1L;

	public static final String OID_PK_COLUMN = "oid";

	public static final Property<Integer> SORT_ORDER = new Property<Integer>("sortOrder");
	public static final Property<ShipintEvents> SHIPINT_EVENTS = new Property<ShipintEvents>("shipintEvents");
	public static final Property<ShipintEvents> SHIPINT_EVENTS1 = new Property<ShipintEvents>("shipintEvents1");
	public static final Property<List<ShipintVoyPhasesPorts>> SHIPINT_VOY_PHASES_PORTSS = new Property<List<ShipintVoyPhasesPorts>>("shipintVoyPhasesPortss");

	public void setSortOrder(Integer sortOrder)
	{
		writeProperty("sortOrder", sortOrder);
	}

	public Integer getSortOrder()
	{
		return (Integer) readProperty("sortOrder");
	}

	public void setShipintEvents(ShipintEvents shipintEvents)
	{
		setToOneTarget("shipintEvents", shipintEvents, true);
	}

	public ShipintEvents getShipintEvents()
	{
		return (ShipintEvents) readProperty("shipintEvents");
	}

	public void setShipintEvents1(ShipintEvents shipintEvents1)
	{
		setToOneTarget("shipintEvents1", shipintEvents1, true);
	}

	public ShipintEvents getShipintEvents1()
	{
		return (ShipintEvents) readProperty("shipintEvents1");
	}

	public void addToShipintVoyPhasesPortss(ShipintVoyPhasesPorts obj)
	{
		addToManyTarget("shipintVoyPhasesPortss", obj, true);
	}

	public void removeFromShipintVoyPhasesPortss(ShipintVoyPhasesPorts obj)
	{
		removeToManyTarget("shipintVoyPhasesPortss", obj, true);
	}

	@SuppressWarnings("unchecked")
	public List<ShipintVoyPhasesPorts> getShipintVoyPhasesPortss()
	{
		return (List<ShipintVoyPhasesPorts>) readProperty("shipintVoyPhasesPortss");
	}

}