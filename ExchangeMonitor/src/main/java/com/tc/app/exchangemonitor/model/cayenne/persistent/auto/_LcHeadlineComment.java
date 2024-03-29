package com.tc.app.exchangemonitor.model.cayenne.persistent.auto;

import org.apache.cayenne.CayenneDataObject;
import org.apache.cayenne.exp.Property;

/**
 * Class _LcHeadlineComment was generated by Cayenne.
 * It is probably a good idea to avoid changing this class manually,
 * since it may be overwritten next time code is regenerated.
 * If you need to make any customizations, please use subclass.
 */
public abstract class _LcHeadlineComment extends CayenneDataObject
{

	private static final long serialVersionUID = 1L;

	public static final Property<Integer> CMNT_NUM = new Property<Integer>("cmntNum");
	public static final Property<String> CMNT_TEXT = new Property<String>("cmntText");
	public static final Property<Integer> LC_NUM = new Property<Integer>("lcNum");
	public static final Property<String> SHORT_CMNT = new Property<String>("shortCmnt");
	public static final Property<String> TINY_CMNT = new Property<String>("tinyCmnt");

	public void setCmntNum(Integer cmntNum)
	{
		writeProperty("cmntNum", cmntNum);
	}

	public Integer getCmntNum()
	{
		return (Integer) readProperty("cmntNum");
	}

	public void setCmntText(String cmntText)
	{
		writeProperty("cmntText", cmntText);
	}

	public String getCmntText()
	{
		return (String) readProperty("cmntText");
	}

	public void setLcNum(Integer lcNum)
	{
		writeProperty("lcNum", lcNum);
	}

	public Integer getLcNum()
	{
		return (Integer) readProperty("lcNum");
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

}
