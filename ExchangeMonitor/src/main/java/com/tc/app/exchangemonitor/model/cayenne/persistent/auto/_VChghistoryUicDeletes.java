package com.tc.app.exchangemonitor.model.cayenne.persistent.auto;

import java.util.Date;

import org.apache.cayenne.CayenneDataObject;
import org.apache.cayenne.exp.Property;

/**
 * Class _VChghistoryUicDeletes was generated by Cayenne.
 * It is probably a good idea to avoid changing this class manually,
 * since it may be overwritten next time code is regenerated.
 * If you need to make any customizations, please use subclass.
 */
public abstract class _VChghistoryUicDeletes extends CayenneDataObject
{

	private static final long serialVersionUID = 1L;

	public static final Property<String> ALLOC_ITEM_NUM = new Property<String>("allocItemNum");
	public static final Property<String> ALLOC_NUM = new Property<String>("allocNum");
	public static final Property<Integer> CHANGE_ID = new Property<Integer>("changeId");
	public static final Property<String> COST_NUM = new Property<String>("costNum");
	public static final Property<String> DATA_ELEMENT = new Property<String>("dataElement");
	public static final Property<String> DATASET_NAME = new Property<String>("datasetName");
	public static final Property<String> ITEM_NUM = new Property<String>("itemNum");
	public static final Property<Date> MOD_DATE = new Property<Date>("modDate");
	public static final Property<String> NEW_VALUE = new Property<String>("newValue");
	public static final Property<String> OLD_VALUE = new Property<String>("oldValue");
	public static final Property<String> ORDER_NUM = new Property<String>("orderNum");
	public static final Property<Integer> RESP_TRANS_ID = new Property<Integer>("respTransId");
	public static final Property<String> TRADE_NUM = new Property<String>("tradeNum");
	public static final Property<String> WHO_DID = new Property<String>("whoDid");

	public void setAllocItemNum(String allocItemNum)
	{
		writeProperty("allocItemNum", allocItemNum);
	}

	public String getAllocItemNum()
	{
		return (String) readProperty("allocItemNum");
	}

	public void setAllocNum(String allocNum)
	{
		writeProperty("allocNum", allocNum);
	}

	public String getAllocNum()
	{
		return (String) readProperty("allocNum");
	}

	public void setChangeId(Integer changeId)
	{
		writeProperty("changeId", changeId);
	}

	public Integer getChangeId()
	{
		return (Integer) readProperty("changeId");
	}

	public void setCostNum(String costNum)
	{
		writeProperty("costNum", costNum);
	}

	public String getCostNum()
	{
		return (String) readProperty("costNum");
	}

	public void setDataElement(String dataElement)
	{
		writeProperty("dataElement", dataElement);
	}

	public String getDataElement()
	{
		return (String) readProperty("dataElement");
	}

	public void setDatasetName(String datasetName)
	{
		writeProperty("datasetName", datasetName);
	}

	public String getDatasetName()
	{
		return (String) readProperty("datasetName");
	}

	public void setItemNum(String itemNum)
	{
		writeProperty("itemNum", itemNum);
	}

	public String getItemNum()
	{
		return (String) readProperty("itemNum");
	}

	public void setModDate(Date modDate)
	{
		writeProperty("modDate", modDate);
	}

	public Date getModDate()
	{
		return (Date) readProperty("modDate");
	}

	public void setNewValue(String newValue)
	{
		writeProperty("newValue", newValue);
	}

	public String getNewValue()
	{
		return (String) readProperty("newValue");
	}

	public void setOldValue(String oldValue)
	{
		writeProperty("oldValue", oldValue);
	}

	public String getOldValue()
	{
		return (String) readProperty("oldValue");
	}

	public void setOrderNum(String orderNum)
	{
		writeProperty("orderNum", orderNum);
	}

	public String getOrderNum()
	{
		return (String) readProperty("orderNum");
	}

	public void setRespTransId(Integer respTransId)
	{
		writeProperty("respTransId", respTransId);
	}

	public Integer getRespTransId()
	{
		return (Integer) readProperty("respTransId");
	}

	public void setTradeNum(String tradeNum)
	{
		writeProperty("tradeNum", tradeNum);
	}

	public String getTradeNum()
	{
		return (String) readProperty("tradeNum");
	}

	public void setWhoDid(String whoDid)
	{
		writeProperty("whoDid", whoDid);
	}

	public String getWhoDid()
	{
		return (String) readProperty("whoDid");
	}

}
