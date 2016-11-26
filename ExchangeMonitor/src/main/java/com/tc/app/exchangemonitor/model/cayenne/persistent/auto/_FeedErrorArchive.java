package com.tc.app.exchangemonitor.model.cayenne.persistent.auto;

import org.apache.cayenne.CayenneDataObject;
import org.apache.cayenne.exp.Property;

/**
 * Class _FeedErrorArchive was generated by Cayenne.
 * It is probably a good idea to avoid changing this class manually,
 * since it may be overwritten next time code is regenerated.
 * If you need to make any customizations, please use subclass.
 */
public abstract class _FeedErrorArchive extends CayenneDataObject
{

	private static final long serialVersionUID = 1L;

	public static final String ARCHIVED_DATE_PK_COLUMN = "archived_date";
	public static final String OID_PK_COLUMN = "oid";

	public static final Property<String> DESCRIPTION = new Property<String>("description");
	public static final Property<Integer> FEED_DATA_ID = new Property<Integer>("feedDataId");
	public static final Property<Integer> FEED_DETAIL_DATA_ID = new Property<Integer>("feedDetailDataId");
	public static final Property<Integer> TRANS_ID = new Property<Integer>("transId");

	public void setDescription(String description)
	{
		writeProperty("description", description);
	}

	public String getDescription()
	{
		return (String) readProperty("description");
	}

	public void setFeedDataId(Integer feedDataId)
	{
		writeProperty("feedDataId", feedDataId);
	}

	public Integer getFeedDataId()
	{
		return (Integer) readProperty("feedDataId");
	}

	public void setFeedDetailDataId(Integer feedDetailDataId)
	{
		writeProperty("feedDetailDataId", feedDetailDataId);
	}

	public Integer getFeedDetailDataId()
	{
		return (Integer) readProperty("feedDetailDataId");
	}

	public void setTransId(Integer transId)
	{
		writeProperty("transId", transId);
	}

	public Integer getTransId()
	{
		return (Integer) readProperty("transId");
	}

}
