package com.tc.app.exchangemonitor.model.cayenne.persistent.auto;

import org.apache.cayenne.CayenneDataObject;
import org.apache.cayenne.exp.Property;

/**
 * Class _PeiComment was generated by Cayenne.
 * It is probably a good idea to avoid changing this class manually,
 * since it may be overwritten next time code is regenerated.
 * If you need to make any customizations, please use subclass.
 */
public abstract class _PeiComment extends CayenneDataObject
{

	private static final long serialVersionUID = 1L;

	public static final String CMNT_NUM_PK_COLUMN = "cmnt_num";

	public static final Property<String> CMNT_PATH = new Property<String>("cmntPath");
	public static final Property<Integer> LONG_CMNT_NUM = new Property<Integer>("longCmntNum");
	public static final Property<String> SHORT_CMNT = new Property<String>("shortCmnt");
	public static final Property<String> TINY_CMNT = new Property<String>("tinyCmnt");
	public static final Property<Integer> TRANS_ID = new Property<Integer>("transId");

	public void setCmntPath(String cmntPath)
	{
		writeProperty("cmntPath", cmntPath);
	}

	public String getCmntPath()
	{
		return (String) readProperty("cmntPath");
	}

	public void setLongCmntNum(Integer longCmntNum)
	{
		writeProperty("longCmntNum", longCmntNum);
	}

	public Integer getLongCmntNum()
	{
		return (Integer) readProperty("longCmntNum");
	}

	public void setShortCmnt(String shortCmnt)
	{
		writeProperty("shortCmnt", shortCmnt);
	}

	public String getShortCmnt()
	{
		return (String) readProperty("shortCmnt");
	}

	public void setTinyCmnt(String tinyCmnt)
	{
		writeProperty("tinyCmnt", tinyCmnt);
	}

	public String getTinyCmnt()
	{
		return (String) readProperty("tinyCmnt");
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
