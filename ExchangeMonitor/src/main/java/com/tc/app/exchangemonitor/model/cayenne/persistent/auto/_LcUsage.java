package com.tc.app.exchangemonitor.model.cayenne.persistent.auto;

import java.util.List;

import org.apache.cayenne.CayenneDataObject;
import org.apache.cayenne.exp.Property;

import com.tc.app.exchangemonitor.model.cayenne.persistent.Lc;

/**
 * Class _LcUsage was generated by Cayenne.
 * It is probably a good idea to avoid changing this class manually,
 * since it may be overwritten next time code is regenerated.
 * If you need to make any customizations, please use subclass.
 */
public abstract class _LcUsage extends CayenneDataObject
{

	private static final long serialVersionUID = 1L;

	public static final String LC_USAGE_CODE_PK_COLUMN = "lc_usage_code";

	public static final Property<String> LC_USAGE_DESC = new Property<String>("lcUsageDesc");
	public static final Property<String> LC_USAGE_SHORT_NAME = new Property<String>("lcUsageShortName");
	public static final Property<Integer> TRANS_ID = new Property<Integer>("transId");
	public static final Property<List<Lc>> LCS = new Property<List<Lc>>("lcs");

	public void setLcUsageDesc(String lcUsageDesc)
	{
		writeProperty("lcUsageDesc", lcUsageDesc);
	}

	public String getLcUsageDesc()
	{
		return (String) readProperty("lcUsageDesc");
	}

	public void setLcUsageShortName(String lcUsageShortName)
	{
		writeProperty("lcUsageShortName", lcUsageShortName);
	}

	public String getLcUsageShortName()
	{
		return (String) readProperty("lcUsageShortName");
	}

	public void setTransId(Integer transId)
	{
		writeProperty("transId", transId);
	}

	public Integer getTransId()
	{
		return (Integer) readProperty("transId");
	}

	public void addToLcs(Lc obj)
	{
		addToManyTarget("lcs", obj, true);
	}

	public void removeFromLcs(Lc obj)
	{
		removeToManyTarget("lcs", obj, true);
	}

	@SuppressWarnings("unchecked")
	public List<Lc> getLcs()
	{
		return (List<Lc>) readProperty("lcs");
	}

}