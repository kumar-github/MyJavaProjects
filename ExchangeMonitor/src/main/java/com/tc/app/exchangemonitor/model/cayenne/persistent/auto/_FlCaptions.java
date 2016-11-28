package com.tc.app.exchangemonitor.model.cayenne.persistent.auto;

import org.apache.cayenne.CayenneDataObject;
import org.apache.cayenne.exp.Property;

/**
 * Class _FlCaptions was generated by Cayenne.
 * It is probably a good idea to avoid changing this class manually,
 * since it may be overwritten next time code is regenerated.
 * If you need to make any customizations, please use subclass.
 */
public abstract class _FlCaptions extends CayenneDataObject
{

	private static final long serialVersionUID = 1L;

	public static final String FLDINT_CAPTION_ID_PK_COLUMN = "fldintCaptionId";

	public static final Property<String> FLDCHR_FROM_TEXT = new Property<String>("fldchrFromText");
	public static final Property<String> FLDCHR_TO_TEXT = new Property<String>("fldchrToText");

	public void setFldchrFromText(String fldchrFromText)
	{
		writeProperty("fldchrFromText", fldchrFromText);
	}

	public String getFldchrFromText()
	{
		return (String) readProperty("fldchrFromText");
	}

	public void setFldchrToText(String fldchrToText)
	{
		writeProperty("fldchrToText", fldchrToText);
	}

	public String getFldchrToText()
	{
		return (String) readProperty("fldchrToText");
	}

}