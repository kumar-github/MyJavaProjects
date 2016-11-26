package com.tc.app.exchangemonitor.model.cayenne.persistent.auto;

import java.util.List;

import org.apache.cayenne.CayenneDataObject;
import org.apache.cayenne.exp.Property;

import com.tc.app.exchangemonitor.model.cayenne.persistent.LcSpecialCondition;

/**
 * Class _SpecialCondition was generated by Cayenne.
 * It is probably a good idea to avoid changing this class manually,
 * since it may be overwritten next time code is regenerated.
 * If you need to make any customizations, please use subclass.
 */
public abstract class _SpecialCondition extends CayenneDataObject
{

	private static final long serialVersionUID = 1L;

	public static final String SPECIAL_COND_NUM_PK_COLUMN = "special_cond_num";

	public static final Property<String> SPECIAL_COND_DESC = new Property<String>("specialCondDesc");
	public static final Property<String> SPECIAL_COND_SHORT_NAME = new Property<String>("specialCondShortName");
	public static final Property<Integer> TRANS_ID = new Property<Integer>("transId");
	public static final Property<List<LcSpecialCondition>> LC_SPECIAL_CONDITIONS = new Property<List<LcSpecialCondition>>("lcSpecialConditions");

	public void setSpecialCondDesc(String specialCondDesc)
	{
		writeProperty("specialCondDesc", specialCondDesc);
	}

	public String getSpecialCondDesc()
	{
		return (String) readProperty("specialCondDesc");
	}

	public void setSpecialCondShortName(String specialCondShortName)
	{
		writeProperty("specialCondShortName", specialCondShortName);
	}

	public String getSpecialCondShortName()
	{
		return (String) readProperty("specialCondShortName");
	}

	public void setTransId(Integer transId)
	{
		writeProperty("transId", transId);
	}

	public Integer getTransId()
	{
		return (Integer) readProperty("transId");
	}

	public void addToLcSpecialConditions(LcSpecialCondition obj)
	{
		addToManyTarget("lcSpecialConditions", obj, true);
	}

	public void removeFromLcSpecialConditions(LcSpecialCondition obj)
	{
		removeToManyTarget("lcSpecialConditions", obj, true);
	}

	@SuppressWarnings("unchecked")
	public List<LcSpecialCondition> getLcSpecialConditions()
	{
		return (List<LcSpecialCondition>) readProperty("lcSpecialConditions");
	}

}
