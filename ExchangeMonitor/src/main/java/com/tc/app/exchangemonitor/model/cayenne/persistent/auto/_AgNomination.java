package com.tc.app.exchangemonitor.model.cayenne.persistent.auto;

import java.util.Date;
import java.util.List;

import org.apache.cayenne.CayenneDataObject;
import org.apache.cayenne.exp.Property;

import com.tc.app.exchangemonitor.model.cayenne.persistent.AgNominationLineItem;
import com.tc.app.exchangemonitor.model.cayenne.persistent.FeedData;

/**
 * Class _AgNomination was generated by Cayenne.
 * It is probably a good idea to avoid changing this class manually,
 * since it may be overwritten next time code is regenerated.
 * If you need to make any customizations, please use subclass.
 */
public abstract class _AgNomination extends CayenneDataObject
{

	private static final long serialVersionUID = 1L;

	public static final String FD_OID_PK_COLUMN = "fd_oid";

	public static final Property<String> BATCH_NUMBER = new Property<String>("batchNumber");
	public static final Property<String> CARRIER_CODE = new Property<String>("carrierCode");
	public static final Property<Date> CREATED_DATE = new Property<Date>("createdDate");
	public static final Property<Integer> DOC_ID = new Property<Integer>("docId");
	public static final Property<Date> EVENT_DATETIME = new Property<Date>("eventDatetime");
	public static final Property<Date> LAST_UPDATE_DATE = new Property<Date>("lastUpdateDate");
	public static final Property<String> MARKET_PLACE = new Property<String>("marketPlace");
	public static final Property<Integer> PIPELINE_CYCLE = new Property<Integer>("pipelineCycle");
	public static final Property<Integer> PIPELINE_CYCLE_YEAR = new Property<Integer>("pipelineCycleYear");
	public static final Property<String> PIPELINE_SCD = new Property<String>("pipelineScd");
	public static final Property<Integer> PIPELINE_SEQUENCE = new Property<Integer>("pipelineSequence");
	public static final Property<String> PRODUCT_ID = new Property<String>("productId");
	public static final Property<String> SHIPPER_CODE = new Property<String>("shipperCode");
	public static final Property<Integer> TRANS_ID = new Property<Integer>("transId");
	public static final Property<String> TRANSACTION_TYPE = new Property<String>("transactionType");
	public static final Property<List<AgNominationLineItem>> AG_NOMINATION_LINE_ITEMS = new Property<List<AgNominationLineItem>>("agNominationLineItems");
	public static final Property<FeedData> FD_O = new Property<FeedData>("fdO");

	public void setBatchNumber(String batchNumber)
	{
		writeProperty("batchNumber", batchNumber);
	}

	public String getBatchNumber()
	{
		return (String) readProperty("batchNumber");
	}

	public void setCarrierCode(String carrierCode)
	{
		writeProperty("carrierCode", carrierCode);
	}

	public String getCarrierCode()
	{
		return (String) readProperty("carrierCode");
	}

	public void setCreatedDate(Date createdDate)
	{
		writeProperty("createdDate", createdDate);
	}

	public Date getCreatedDate()
	{
		return (Date) readProperty("createdDate");
	}

	public void setDocId(Integer docId)
	{
		writeProperty("docId", docId);
	}

	public Integer getDocId()
	{
		return (Integer) readProperty("docId");
	}

	public void setEventDatetime(Date eventDatetime)
	{
		writeProperty("eventDatetime", eventDatetime);
	}

	public Date getEventDatetime()
	{
		return (Date) readProperty("eventDatetime");
	}

	public void setLastUpdateDate(Date lastUpdateDate)
	{
		writeProperty("lastUpdateDate", lastUpdateDate);
	}

	public Date getLastUpdateDate()
	{
		return (Date) readProperty("lastUpdateDate");
	}

	public void setMarketPlace(String marketPlace)
	{
		writeProperty("marketPlace", marketPlace);
	}

	public String getMarketPlace()
	{
		return (String) readProperty("marketPlace");
	}

	public void setPipelineCycle(Integer pipelineCycle)
	{
		writeProperty("pipelineCycle", pipelineCycle);
	}

	public Integer getPipelineCycle()
	{
		return (Integer) readProperty("pipelineCycle");
	}

	public void setPipelineCycleYear(Integer pipelineCycleYear)
	{
		writeProperty("pipelineCycleYear", pipelineCycleYear);
	}

	public Integer getPipelineCycleYear()
	{
		return (Integer) readProperty("pipelineCycleYear");
	}

	public void setPipelineScd(String pipelineScd)
	{
		writeProperty("pipelineScd", pipelineScd);
	}

	public String getPipelineScd()
	{
		return (String) readProperty("pipelineScd");
	}

	public void setPipelineSequence(Integer pipelineSequence)
	{
		writeProperty("pipelineSequence", pipelineSequence);
	}

	public Integer getPipelineSequence()
	{
		return (Integer) readProperty("pipelineSequence");
	}

	public void setProductId(String productId)
	{
		writeProperty("productId", productId);
	}

	public String getProductId()
	{
		return (String) readProperty("productId");
	}

	public void setShipperCode(String shipperCode)
	{
		writeProperty("shipperCode", shipperCode);
	}

	public String getShipperCode()
	{
		return (String) readProperty("shipperCode");
	}

	public void setTransId(Integer transId)
	{
		writeProperty("transId", transId);
	}

	public Integer getTransId()
	{
		return (Integer) readProperty("transId");
	}

	public void setTransactionType(String transactionType)
	{
		writeProperty("transactionType", transactionType);
	}

	public String getTransactionType()
	{
		return (String) readProperty("transactionType");
	}

	public void addToAgNominationLineItems(AgNominationLineItem obj)
	{
		addToManyTarget("agNominationLineItems", obj, true);
	}

	public void removeFromAgNominationLineItems(AgNominationLineItem obj)
	{
		removeToManyTarget("agNominationLineItems", obj, true);
	}

	@SuppressWarnings("unchecked")
	public List<AgNominationLineItem> getAgNominationLineItems()
	{
		return (List<AgNominationLineItem>) readProperty("agNominationLineItems");
	}

	public void setFdO(FeedData fdO)
	{
		setToOneTarget("fdO", fdO, true);
	}

	public FeedData getFdO()
	{
		return (FeedData) readProperty("fdO");
	}

}