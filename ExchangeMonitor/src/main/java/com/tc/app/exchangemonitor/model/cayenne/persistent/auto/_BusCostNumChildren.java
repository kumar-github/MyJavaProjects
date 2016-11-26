package com.tc.app.exchangemonitor.model.cayenne.persistent.auto;

import java.util.List;

import org.apache.cayenne.CayenneDataObject;
import org.apache.cayenne.exp.Property;

import com.tc.app.exchangemonitor.model.cayenne.persistent.BusCostType;

/**
 * Class _BusCostNumChildren was generated by Cayenne.
 * It is probably a good idea to avoid changing this class manually,
 * since it may be overwritten next time code is regenerated.
 * If you need to make any customizations, please use subclass.
 */
public abstract class _BusCostNumChildren extends CayenneDataObject
{

	private static final long serialVersionUID = 1L;

	public static final String BC_NUM_CHILDREN_CODE_PK_COLUMN = "bc_num_children_code";

	public static final Property<String> BC_NUM_CHILDREN_DESC = new Property<String>("bcNumChildrenDesc");
	public static final Property<String> BC_NUM_CHILDREN_FULL_NAME = new Property<String>("bcNumChildrenFullName");
	public static final Property<Integer> TRANS_ID = new Property<Integer>("transId");
	public static final Property<List<BusCostType>> BUS_COST_TYPES = new Property<List<BusCostType>>("busCostTypes");

	public void setBcNumChildrenDesc(String bcNumChildrenDesc)
	{
		writeProperty("bcNumChildrenDesc", bcNumChildrenDesc);
	}

	public String getBcNumChildrenDesc()
	{
		return (String) readProperty("bcNumChildrenDesc");
	}

	public void setBcNumChildrenFullName(String bcNumChildrenFullName)
	{
		writeProperty("bcNumChildrenFullName", bcNumChildrenFullName);
	}

	public String getBcNumChildrenFullName()
	{
		return (String) readProperty("bcNumChildrenFullName");
	}

	public void setTransId(Integer transId)
	{
		writeProperty("transId", transId);
	}

	public Integer getTransId()
	{
		return (Integer) readProperty("transId");
	}

	public void addToBusCostTypes(BusCostType obj)
	{
		addToManyTarget("busCostTypes", obj, true);
	}

	public void removeFromBusCostTypes(BusCostType obj)
	{
		removeToManyTarget("busCostTypes", obj, true);
	}

	@SuppressWarnings("unchecked")
	public List<BusCostType> getBusCostTypes()
	{
		return (List<BusCostType>) readProperty("busCostTypes");
	}

}
