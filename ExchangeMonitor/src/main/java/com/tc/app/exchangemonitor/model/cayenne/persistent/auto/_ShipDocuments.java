package com.tc.app.exchangemonitor.model.cayenne.persistent.auto;

import java.util.Date;

import org.apache.cayenne.CayenneDataObject;
import org.apache.cayenne.exp.Property;

/**
 * Class _ShipDocuments was generated by Cayenne.
 * It is probably a good idea to avoid changing this class manually,
 * since it may be overwritten next time code is regenerated.
 * If you need to make any customizations, please use subclass.
 */
public abstract class _ShipDocuments extends CayenneDataObject
{

	private static final long serialVersionUID = 1L;

	public static final String FLDCHR_DOCUMENT_ID_PK_COLUMN = "fldchrDocumentId";
	public static final String FLDCHR_LLOYDS_REF_NUM_PK_COLUMN = "fldchrLloydsRefNum";

	public static final Property<String> FLDCHR_DOCUMENT_COMMENTS = new Property<String>("fldchrDocumentComments");
	public static final Property<String> FLDCHR_DOCUMENT_REAL_NAME = new Property<String>("fldchrDocumentRealName");
	public static final Property<String> FLDCHR_DOCUMENT_SYSTEM_NAME = new Property<String>("fldchrDocumentSystemName");
	public static final Property<String> FLDCHR_PATH = new Property<String>("fldchrPath");
	public static final Property<Date> FLDCHR_TIME_STAMP = new Property<Date>("fldchrTimeStamp");
	public static final Property<Date> FLDCHR_UPDATE_TIME_STAMP = new Property<Date>("fldchrUpdateTimeStamp");
	public static final Property<String> FLDCHR_USER_ID = new Property<String>("fldchrUserId");
	public static final Property<String> FLDCHR_USER_ID_UPDATE = new Property<String>("fldchrUserIdUpdate");

	public void setFldchrDocumentComments(String fldchrDocumentComments)
	{
		writeProperty("fldchrDocumentComments", fldchrDocumentComments);
	}

	public String getFldchrDocumentComments()
	{
		return (String) readProperty("fldchrDocumentComments");
	}

	public void setFldchrDocumentRealName(String fldchrDocumentRealName)
	{
		writeProperty("fldchrDocumentRealName", fldchrDocumentRealName);
	}

	public String getFldchrDocumentRealName()
	{
		return (String) readProperty("fldchrDocumentRealName");
	}

	public void setFldchrDocumentSystemName(String fldchrDocumentSystemName)
	{
		writeProperty("fldchrDocumentSystemName", fldchrDocumentSystemName);
	}

	public String getFldchrDocumentSystemName()
	{
		return (String) readProperty("fldchrDocumentSystemName");
	}

	public void setFldchrPath(String fldchrPath)
	{
		writeProperty("fldchrPath", fldchrPath);
	}

	public String getFldchrPath()
	{
		return (String) readProperty("fldchrPath");
	}

	public void setFldchrTimeStamp(Date fldchrTimeStamp)
	{
		writeProperty("fldchrTimeStamp", fldchrTimeStamp);
	}

	public Date getFldchrTimeStamp()
	{
		return (Date) readProperty("fldchrTimeStamp");
	}

	public void setFldchrUpdateTimeStamp(Date fldchrUpdateTimeStamp)
	{
		writeProperty("fldchrUpdateTimeStamp", fldchrUpdateTimeStamp);
	}

	public Date getFldchrUpdateTimeStamp()
	{
		return (Date) readProperty("fldchrUpdateTimeStamp");
	}

	public void setFldchrUserId(String fldchrUserId)
	{
		writeProperty("fldchrUserId", fldchrUserId);
	}

	public String getFldchrUserId()
	{
		return (String) readProperty("fldchrUserId");
	}

	public void setFldchrUserIdUpdate(String fldchrUserIdUpdate)
	{
		writeProperty("fldchrUserIdUpdate", fldchrUserIdUpdate);
	}

	public String getFldchrUserIdUpdate()
	{
		return (String) readProperty("fldchrUserIdUpdate");
	}

}
