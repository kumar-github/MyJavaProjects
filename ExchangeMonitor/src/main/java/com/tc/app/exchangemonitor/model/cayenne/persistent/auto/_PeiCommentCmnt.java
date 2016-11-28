package com.tc.app.exchangemonitor.model.cayenne.persistent.auto;

import org.apache.cayenne.CayenneDataObject;
import org.apache.cayenne.exp.Property;

/**
 * Class _PeiCommentCmnt was generated by Cayenne.
 * It is probably a good idea to avoid changing this class manually,
 * since it may be overwritten next time code is regenerated.
 * If you need to make any customizations, please use subclass.
 */
public abstract class _PeiCommentCmnt extends CayenneDataObject
{

	private static final long serialVersionUID = 1L;

	public static final String LONG_CMNT_NUM_PK_COLUMN = "long_cmnt_num";
	public static final String SEQUENCE_NUM_PK_COLUMN = "sequence_num";

	public static final Property<String> CMNT_CHUNK = new Property<String>("cmntChunk");
	public static final Property<Integer> TRANS_ID = new Property<Integer>("transId");

	public void setCmntChunk(String cmntChunk)
	{
		writeProperty("cmntChunk", cmntChunk);
	}

	public String getCmntChunk()
	{
		return (String) readProperty("cmntChunk");
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