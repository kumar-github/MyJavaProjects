package com.tc.app.exchangemonitor.model.cayenne.persistent.auto;

import org.apache.cayenne.CayenneDataObject;
import org.apache.cayenne.exp.Property;

import com.tc.app.exchangemonitor.model.cayenne.persistent.FeedData;
import com.tc.app.exchangemonitor.model.cayenne.persistent.FeedDetailData;

/**
 * Class _FeedError was generated by Cayenne.
 * It is probably a good idea to avoid changing this class manually,
 * since it may be overwritten next time code is regenerated.
 * If you need to make any customizations, please use subclass.
 */
public abstract class _FeedError extends CayenneDataObject
{

	private static final long serialVersionUID = 1L;

	public static final String OID_PK_COLUMN = "oid";

	public static final Property<String> DESCRIPTION = new Property<>("description");
	public static final Property<Integer> TRANS_ID = new Property<>("transId");
	public static final Property<FeedData> FEED_DATA = new Property<>("feedData");
	public static final Property<FeedDetailData> FEED_DETAIL_DATA = new Property<>("feedDetailData");

	public void setDescription(final String description)
	{
		this.writeProperty("description", description);
	}

	public String getDescription()
	{
		return (String) this.readProperty("description");
	}

	public void setTransId(final Integer transId)
	{
		this.writeProperty("transId", transId);
	}

	public Integer getTransId()
	{
		return (Integer) this.readProperty("transId");
	}

	public void setFeedData(final FeedData feedData)
	{
		this.setToOneTarget("feedData", feedData, true);
	}

	public FeedData getFeedData()
	{
		return (FeedData) this.readProperty("feedData");
	}

	public void setFeedDetailData(final FeedDetailData feedDetailData)
	{
		this.setToOneTarget("feedDetailData", feedDetailData, true);
	}

	public FeedDetailData getFeedDetailData()
	{
		return (FeedDetailData) this.readProperty("feedDetailData");
	}

}