package com.tc.app.exchangemonitor.model.cayenne.persistent.auto;

import org.apache.cayenne.CayenneDataObject;
import org.apache.cayenne.exp.Property;

import com.tc.app.exchangemonitor.model.cayenne.persistent.FeedData;
import com.tc.app.exchangemonitor.model.cayenne.persistent.FeedDetailData;

/**
 * Class _AgBttAckCnfrmLitem was generated by Cayenne.
 * It is probably a good idea to avoid changing this class manually,
 * since it may be overwritten next time code is regenerated.
 * If you need to make any customizations, please use subclass.
 */
public abstract class _AgBttAckCnfrmLitem extends CayenneDataObject
{

	private static final long serialVersionUID = 1L;

	public static final String FDD_OID_PK_COLUMN = "fdd_oid";

	public static final Property<String> EVENT_TYPE = new Property<String>("eventType");
	public static final Property<String> EXT_CHAR_COL1 = new Property<String>("extCharCol1");
	public static final Property<String> EXT_CHAR_COL2 = new Property<String>("extCharCol2");
	public static final Property<String> EXT_CHAR_COL3 = new Property<String>("extCharCol3");
	public static final Property<Integer> EXT_INT_COL1 = new Property<Integer>("extIntCol1");
	public static final Property<Integer> EXT_INT_COL2 = new Property<Integer>("extIntCol2");
	public static final Property<Integer> EXT_INT_COL3 = new Property<Integer>("extIntCol3");
	public static final Property<String> FAIL_DESC = new Property<String>("failDesc");
	public static final Property<Integer> LINE_ITEM_NUM = new Property<Integer>("lineItemNum");
	public static final Property<Integer> PARCEL_NUM = new Property<Integer>("parcelNum");
	public static final Property<String> STATUS = new Property<String>("status");
	public static final Property<Integer> TRANS_ID = new Property<Integer>("transId");
	public static final Property<FeedData> FD_O = new Property<FeedData>("fdO");
	public static final Property<FeedDetailData> FDD_O = new Property<FeedDetailData>("fddO");

	public void setEventType(String eventType)
	{
		writeProperty("eventType", eventType);
	}

	public String getEventType()
	{
		return (String) readProperty("eventType");
	}

	public void setExtCharCol1(String extCharCol1)
	{
		writeProperty("extCharCol1", extCharCol1);
	}

	public String getExtCharCol1()
	{
		return (String) readProperty("extCharCol1");
	}

	public void setExtCharCol2(String extCharCol2)
	{
		writeProperty("extCharCol2", extCharCol2);
	}

	public String getExtCharCol2()
	{
		return (String) readProperty("extCharCol2");
	}

	public void setExtCharCol3(String extCharCol3)
	{
		writeProperty("extCharCol3", extCharCol3);
	}

	public String getExtCharCol3()
	{
		return (String) readProperty("extCharCol3");
	}

	public void setExtIntCol1(Integer extIntCol1)
	{
		writeProperty("extIntCol1", extIntCol1);
	}

	public Integer getExtIntCol1()
	{
		return (Integer) readProperty("extIntCol1");
	}

	public void setExtIntCol2(Integer extIntCol2)
	{
		writeProperty("extIntCol2", extIntCol2);
	}

	public Integer getExtIntCol2()
	{
		return (Integer) readProperty("extIntCol2");
	}

	public void setExtIntCol3(Integer extIntCol3)
	{
		writeProperty("extIntCol3", extIntCol3);
	}

	public Integer getExtIntCol3()
	{
		return (Integer) readProperty("extIntCol3");
	}

	public void setFailDesc(String failDesc)
	{
		writeProperty("failDesc", failDesc);
	}

	public String getFailDesc()
	{
		return (String) readProperty("failDesc");
	}

	public void setLineItemNum(Integer lineItemNum)
	{
		writeProperty("lineItemNum", lineItemNum);
	}

	public Integer getLineItemNum()
	{
		return (Integer) readProperty("lineItemNum");
	}

	public void setParcelNum(Integer parcelNum)
	{
		writeProperty("parcelNum", parcelNum);
	}

	public Integer getParcelNum()
	{
		return (Integer) readProperty("parcelNum");
	}

	public void setStatus(String status)
	{
		writeProperty("status", status);
	}

	public String getStatus()
	{
		return (String) readProperty("status");
	}

	public void setTransId(Integer transId)
	{
		writeProperty("transId", transId);
	}

	public Integer getTransId()
	{
		return (Integer) readProperty("transId");
	}

	public void setFdO(FeedData fdO)
	{
		setToOneTarget("fdO", fdO, true);
	}

	public FeedData getFdO()
	{
		return (FeedData) readProperty("fdO");
	}

	public void setFddO(FeedDetailData fddO)
	{
		setToOneTarget("fddO", fddO, true);
	}

	public FeedDetailData getFddO()
	{
		return (FeedDetailData) readProperty("fddO");
	}

}
