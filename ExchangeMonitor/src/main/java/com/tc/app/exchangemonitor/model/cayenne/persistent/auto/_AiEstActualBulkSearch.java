package com.tc.app.exchangemonitor.model.cayenne.persistent.auto;

import java.util.Date;

import org.apache.cayenne.CayenneDataObject;
import org.apache.cayenne.exp.Property;

/**
 * Class _AiEstActualBulkSearch was generated by Cayenne.
 * It is probably a good idea to avoid changing this class manually,
 * since it may be overwritten next time code is regenerated.
 * If you need to make any customizations, please use subclass.
 */
public abstract class _AiEstActualBulkSearch extends CayenneDataObject
{

	private static final long serialVersionUID = 1L;

	public static final Property<Integer> AI_EST_ACTUAL_NUM = new Property<Integer>("aiEstActualNum");
	public static final Property<Integer> ALLOC_ITEM_NUM = new Property<Integer>("allocItemNum");
	public static final Property<Integer> ALLOC_NUM = new Property<Integer>("allocNum");
	public static final Property<String> SEARCH_GUID = new Property<String>("searchGuid");
	public static final Property<Date> SEARCH_TIME = new Property<Date>("searchTime");
	public static final Property<Integer> SEQUENCE = new Property<Integer>("sequence");

	public void setAiEstActualNum(Integer aiEstActualNum)
	{
		writeProperty("aiEstActualNum", aiEstActualNum);
	}

	public Integer getAiEstActualNum()
	{
		return (Integer) readProperty("aiEstActualNum");
	}

	public void setAllocItemNum(Integer allocItemNum)
	{
		writeProperty("allocItemNum", allocItemNum);
	}

	public Integer getAllocItemNum()
	{
		return (Integer) readProperty("allocItemNum");
	}

	public void setAllocNum(Integer allocNum)
	{
		writeProperty("allocNum", allocNum);
	}

	public Integer getAllocNum()
	{
		return (Integer) readProperty("allocNum");
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

	public void setSequence(Integer sequence)
	{
		writeProperty("sequence", sequence);
	}

	public Integer getSequence()
	{
		return (Integer) readProperty("sequence");
	}

}
