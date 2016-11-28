package com.tc.app.exchangemonitor.model.cayenne.persistent.auto;

import java.util.Date;

import org.apache.cayenne.CayenneDataObject;
import org.apache.cayenne.exp.Property;

/**
 * Class _ShipmentBulkSearch was generated by Cayenne.
 * It is probably a good idea to avoid changing this class manually,
 * since it may be overwritten next time code is regenerated.
 * If you need to make any customizations, please use subclass.
 */
public abstract class _ShipmentBulkSearch extends CayenneDataObject
{

	private static final long serialVersionUID = 1L;

	public static final String SEQUENCE_PK_COLUMN = "sequence";

	public static final Property<Integer> ALLOC_NUM = new Property<Integer>("allocNum");
	public static final Property<String> REFERENCE = new Property<String>("reference");
	public static final Property<String> SEARCH_GUID = new Property<String>("searchGuid");
	public static final Property<Date> SEARCH_TIME = new Property<Date>("searchTime");
	public static final Property<Integer> SHIPMENT_ID = new Property<Integer>("shipmentId");

	public void setAllocNum(Integer allocNum)
	{
		writeProperty("allocNum", allocNum);
	}

	public Integer getAllocNum()
	{
		return (Integer) readProperty("allocNum");
	}

	public void setReference(String reference)
	{
		writeProperty("reference", reference);
	}

	public String getReference()
	{
		return (String) readProperty("reference");
	}

	public void setSearchGuid(String searchGuid)
	{
		writeProperty("searchGuid", searchGuid);
	}

	public String getSearchGuid()
	{
		return (String) readProperty("searchGuid");
	}

	public void setSearchTime(Date searchTime)
	{
		writeProperty("searchTime", searchTime);
	}

	public Date getSearchTime()
	{
		return (Date) readProperty("searchTime");
	}

	public void setShipmentId(Integer shipmentId)
	{
		writeProperty("shipmentId", shipmentId);
	}

	public Integer getShipmentId()
	{
		return (Integer) readProperty("shipmentId");
	}

}