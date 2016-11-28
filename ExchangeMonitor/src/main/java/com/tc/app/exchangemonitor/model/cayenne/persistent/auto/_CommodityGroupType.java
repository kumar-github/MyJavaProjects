package com.tc.app.exchangemonitor.model.cayenne.persistent.auto;

import java.util.List;

import org.apache.cayenne.CayenneDataObject;
import org.apache.cayenne.exp.Property;

import com.tc.app.exchangemonitor.model.cayenne.persistent.CommodityGroup;

/**
 * Class _CommodityGroupType was generated by Cayenne.
 * It is probably a good idea to avoid changing this class manually,
 * since it may be overwritten next time code is regenerated.
 * If you need to make any customizations, please use subclass.
 */
public abstract class _CommodityGroupType extends CayenneDataObject
{

	private static final long serialVersionUID = 1L;

	public static final String CMDTY_GROUP_TYPE_CODE_PK_COLUMN = "cmdty_group_type_code";

	public static final Property<String> CMDTY_GROUP_TYPE_DESC = new Property<String>("cmdtyGroupTypeDesc");
	public static final Property<Integer> TRANS_ID = new Property<Integer>("transId");
	public static final Property<List<CommodityGroup>> COMMODITY_GROUPS = new Property<List<CommodityGroup>>("commodityGroups");

	public void setCmdtyGroupTypeDesc(String cmdtyGroupTypeDesc)
	{
		writeProperty("cmdtyGroupTypeDesc", cmdtyGroupTypeDesc);
	}

	public String getCmdtyGroupTypeDesc()
	{
		return (String) readProperty("cmdtyGroupTypeDesc");
	}

	public void setTransId(Integer transId)
	{
		writeProperty("transId", transId);
	}

	public Integer getTransId()
	{
		return (Integer) readProperty("transId");
	}

	public void addToCommodityGroups(CommodityGroup obj)
	{
		addToManyTarget("commodityGroups", obj, true);
	}

	public void removeFromCommodityGroups(CommodityGroup obj)
	{
		removeToManyTarget("commodityGroups", obj, true);
	}

	@SuppressWarnings("unchecked")
	public List<CommodityGroup> getCommodityGroups()
	{
		return (List<CommodityGroup>) readProperty("commodityGroups");
	}

}