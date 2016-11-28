package com.tc.app.exchangemonitor.model.cayenne.persistent.auto;

import org.apache.cayenne.CayenneDataObject;
import org.apache.cayenne.exp.Property;

/**
 * Class _IctsMenuConf was generated by Cayenne.
 * It is probably a good idea to avoid changing this class manually,
 * since it may be overwritten next time code is regenerated.
 * If you need to make any customizations, please use subclass.
 */
public abstract class _IctsMenuConf extends CayenneDataObject
{

	private static final long serialVersionUID = 1L;

	public static final String FLDINT_REC_ID_PK_COLUMN = "fldintRecID";

	public static final Property<String> FLDCHR_CODE = new Property<String>("fldchrCode");
	public static final Property<String> FLDCHR_FLAG = new Property<String>("fldchrFlag");
	public static final Property<Integer> FLDINT_KEY = new Property<Integer>("fldintKey");

	public void setFldchrCode(String fldchrCode)
	{
		writeProperty("fldchrCode", fldchrCode);
	}

	public String getFldchrCode()
	{
		return (String) readProperty("fldchrCode");
	}

	public void setFldchrFlag(String fldchrFlag)
	{
		writeProperty("fldchrFlag", fldchrFlag);
	}

	public String getFldchrFlag()
	{
		return (String) readProperty("fldchrFlag");
	}

	public void setFldintKey(Integer fldintKey)
	{
		writeProperty("fldintKey", fldintKey);
	}

	public Integer getFldintKey()
	{
		return (Integer) readProperty("fldintKey");
	}

}