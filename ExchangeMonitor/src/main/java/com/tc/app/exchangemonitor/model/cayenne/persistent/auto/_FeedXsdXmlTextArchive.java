package com.tc.app.exchangemonitor.model.cayenne.persistent.auto;

import org.apache.cayenne.CayenneDataObject;
import org.apache.cayenne.exp.Property;

/**
 * Class _FeedXsdXmlTextArchive was generated by Cayenne.
 * It is probably a good idea to avoid changing this class manually,
 * since it may be overwritten next time code is regenerated.
 * If you need to make any customizations, please use subclass.
 */
public abstract class _FeedXsdXmlTextArchive extends CayenneDataObject
{

	private static final long serialVersionUID = 1L;

	public static final String ARCHIVED_DATE_PK_COLUMN = "archived_date";
	public static final String OID_PK_COLUMN = "oid";

	public static final Property<String> DOC_TEXT = new Property<String>("docText");
	public static final Property<Integer> TRANS_ID = new Property<Integer>("transId");

	public void setDocText(String docText)
	{
		writeProperty("docText", docText);
	}

	public String getDocText()
	{
		return (String) readProperty("docText");
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