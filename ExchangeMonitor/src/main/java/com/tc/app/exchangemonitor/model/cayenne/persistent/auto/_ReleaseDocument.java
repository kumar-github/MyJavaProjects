package com.tc.app.exchangemonitor.model.cayenne.persistent.auto;

import java.util.List;

import org.apache.cayenne.CayenneDataObject;
import org.apache.cayenne.exp.Property;

import com.tc.app.exchangemonitor.model.cayenne.persistent.Allocation;
import com.tc.app.exchangemonitor.model.cayenne.persistent.ReleaseDocumentDriver;
import com.tc.app.exchangemonitor.model.cayenne.persistent.Trade;

/**
 * Class _ReleaseDocument was generated by Cayenne.
 * It is probably a good idea to avoid changing this class manually,
 * since it may be overwritten next time code is regenerated.
 * If you need to make any customizations, please use subclass.
 */
public abstract class _ReleaseDocument extends CayenneDataObject
{

	private static final long serialVersionUID = 1L;

	public static final String RELEASE_DOC_NUM_PK_COLUMN = "release_doc_num";

	public static final Property<Boolean> RELEASE_PRINTED_IND = new Property<Boolean>("releasePrintedInd");
	public static final Property<Integer> SELLING_OFFICE_ADDR_NUM = new Property<Integer>("sellingOfficeAddrNum");
	public static final Property<Integer> TRANS_ID = new Property<Integer>("transId");
	public static final Property<List<Allocation>> ALLOCATIONS = new Property<List<Allocation>>("allocations");
	public static final Property<List<ReleaseDocumentDriver>> RELEASE_DOCUMENT_DRIVERS = new Property<List<ReleaseDocumentDriver>>("releaseDocumentDrivers");
	public static final Property<Trade> TRADE = new Property<Trade>("trade");

	public void setReleasePrintedInd(Boolean releasePrintedInd)
	{
		writeProperty("releasePrintedInd", releasePrintedInd);
	}

	public Boolean getReleasePrintedInd()
	{
		return (Boolean) readProperty("releasePrintedInd");
	}

	public void setSellingOfficeAddrNum(Integer sellingOfficeAddrNum)
	{
		writeProperty("sellingOfficeAddrNum", sellingOfficeAddrNum);
	}

	public Integer getSellingOfficeAddrNum()
	{
		return (Integer) readProperty("sellingOfficeAddrNum");
	}

	public void setTransId(Integer transId)
	{
		writeProperty("transId", transId);
	}

	public Integer getTransId()
	{
		return (Integer) readProperty("transId");
	}

	public void addToAllocations(Allocation obj)
	{
		addToManyTarget("allocations", obj, true);
	}

	public void removeFromAllocations(Allocation obj)
	{
		removeToManyTarget("allocations", obj, true);
	}

	@SuppressWarnings("unchecked")
	public List<Allocation> getAllocations()
	{
		return (List<Allocation>) readProperty("allocations");
	}

	public void addToReleaseDocumentDrivers(ReleaseDocumentDriver obj)
	{
		addToManyTarget("releaseDocumentDrivers", obj, true);
	}

	public void removeFromReleaseDocumentDrivers(ReleaseDocumentDriver obj)
	{
		removeToManyTarget("releaseDocumentDrivers", obj, true);
	}

	@SuppressWarnings("unchecked")
	public List<ReleaseDocumentDriver> getReleaseDocumentDrivers()
	{
		return (List<ReleaseDocumentDriver>) readProperty("releaseDocumentDrivers");
	}

	public void setTrade(Trade trade)
	{
		setToOneTarget("trade", trade, true);
	}

	public Trade getTrade()
	{
		return (Trade) readProperty("trade");
	}

}
