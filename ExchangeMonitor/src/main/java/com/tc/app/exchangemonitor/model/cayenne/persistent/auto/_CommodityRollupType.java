package com.tc.app.exchangemonitor.model.cayenne.persistent.auto;

import java.util.List;

import org.apache.cayenne.CayenneDataObject;
import org.apache.cayenne.exp.Property;

import com.tc.app.exchangemonitor.model.cayenne.persistent.CommodityByRollupType;
import com.tc.app.exchangemonitor.model.cayenne.persistent.CommodityRollupHierarchy;

/**
 * Class _CommodityRollupType was generated by Cayenne.
 * It is probably a good idea to avoid changing this class manually,
 * since it may be overwritten next time code is regenerated.
 * If you need to make any customizations, please use subclass.
 */
public abstract class _CommodityRollupType extends CayenneDataObject
{

	private static final long serialVersionUID = 1L;

	public static final String ROLLUP_TYPE_CODE_PK_COLUMN = "rollup_type_code";

	public static final Property<String> ROLLUP_TYPE_DESC = new Property<String>("rollupTypeDesc");
	public static final Property<Integer> TRANS_ID = new Property<Integer>("transId");
	public static final Property<List<CommodityByRollupType>> COMMODITY_BY_ROLLUP_TYPES = new Property<List<CommodityByRollupType>>("commodityByRollupTypes");
	public static final Property<List<CommodityRollupHierarchy>> COMMODITY_ROLLUP_HIERARCHIES = new Property<List<CommodityRollupHierarchy>>("commodityRollupHierarchies");

	public void setRollupTypeDesc(String rollupTypeDesc)
	{
		writeProperty("rollupTypeDesc", rollupTypeDesc);
	}

	public String getRollupTypeDesc()
	{
		return (String) readProperty("rollupTypeDesc");
	}

	public void setTransId(Integer transId)
	{
		writeProperty("transId", transId);
	}

	public Integer getTransId()
	{
		return (Integer) readProperty("transId");
	}

	public void addToCommodityByRollupTypes(CommodityByRollupType obj)
	{
		addToManyTarget("commodityByRollupTypes", obj, true);
	}

	public void removeFromCommodityByRollupTypes(CommodityByRollupType obj)
	{
		removeToManyTarget("commodityByRollupTypes", obj, true);
	}

	@SuppressWarnings("unchecked")
	public List<CommodityByRollupType> getCommodityByRollupTypes()
	{
		return (List<CommodityByRollupType>) readProperty("commodityByRollupTypes");
	}

	public void addToCommodityRollupHierarchies(CommodityRollupHierarchy obj)
	{
		addToManyTarget("commodityRollupHierarchies", obj, true);
	}

	public void removeFromCommodityRollupHierarchies(CommodityRollupHierarchy obj)
	{
		removeToManyTarget("commodityRollupHierarchies", obj, true);
	}

	@SuppressWarnings("unchecked")
	public List<CommodityRollupHierarchy> getCommodityRollupHierarchies()
	{
		return (List<CommodityRollupHierarchy>) readProperty("commodityRollupHierarchies");
	}

}