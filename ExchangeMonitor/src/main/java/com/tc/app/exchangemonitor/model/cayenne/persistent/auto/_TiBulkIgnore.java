package com.tc.app.exchangemonitor.model.cayenne.persistent.auto;

import java.util.Date;

import org.apache.cayenne.CayenneDataObject;
import org.apache.cayenne.exp.Property;

import com.tc.app.exchangemonitor.model.cayenne.persistent.AllocationItem;
import com.tc.app.exchangemonitor.model.cayenne.persistent.TiPsmvFeed;

/**
 * Class _TiBulkIgnore was generated by Cayenne.
 * It is probably a good idea to avoid changing this class manually,
 * since it may be overwritten next time code is regenerated.
 * If you need to make any customizations, please use subclass.
 */
public abstract class _TiBulkIgnore extends CayenneDataObject
{

	private static final long serialVersionUID = 1L;

	public static final String ALLOC_ITEM_NUM_PK_COLUMN = "alloc_item_num";
	public static final String ALLOC_NUM_PK_COLUMN = "alloc_num";

	public static final Property<Date> ETL_TIMESTAMP = new Property<Date>("etlTimestamp");
	public static final Property<AllocationItem> ALLOCATION_ITEM = new Property<AllocationItem>("allocationItem");
	public static final Property<AllocationItem> ALLOCATION_ITEM1 = new Property<AllocationItem>("allocationItem1");
	public static final Property<TiPsmvFeed> PSMVOL_O = new Property<TiPsmvFeed>("psmvolO");

	public void setEtlTimestamp(Date etlTimestamp)
	{
		writeProperty("etlTimestamp", etlTimestamp);
	}

	public Date getEtlTimestamp()
	{
		return (Date) readProperty("etlTimestamp");
	}

	public void setAllocationItem(AllocationItem allocationItem)
	{
		setToOneTarget("allocationItem", allocationItem, true);
	}

	public AllocationItem getAllocationItem()
	{
		return (AllocationItem) readProperty("allocationItem");
	}

	public void setAllocationItem1(AllocationItem allocationItem1)
	{
		setToOneTarget("allocationItem1", allocationItem1, true);
	}

	public AllocationItem getAllocationItem1()
	{
		return (AllocationItem) readProperty("allocationItem1");
	}

	public void setPsmvolO(TiPsmvFeed psmvolO)
	{
		setToOneTarget("psmvolO", psmvolO, true);
	}

	public TiPsmvFeed getPsmvolO()
	{
		return (TiPsmvFeed) readProperty("psmvolO");
	}

}