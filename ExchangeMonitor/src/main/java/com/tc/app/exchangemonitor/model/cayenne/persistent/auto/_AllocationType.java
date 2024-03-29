package com.tc.app.exchangemonitor.model.cayenne.persistent.auto;

import java.util.List;

import org.apache.cayenne.CayenneDataObject;
import org.apache.cayenne.exp.Property;

import com.tc.app.exchangemonitor.model.cayenne.persistent.Allocation;

/**
 * Class _AllocationType was generated by Cayenne.
 * It is probably a good idea to avoid changing this class manually,
 * since it may be overwritten next time code is regenerated.
 * If you need to make any customizations, please use subclass.
 */
public abstract class _AllocationType extends CayenneDataObject
{

	private static final long serialVersionUID = 1L;

	public static final String ALLOC_TYPE_CODE_PK_COLUMN = "alloc_type_code";

	public static final Property<String> ALLOC_TYPE_DESC = new Property<String>("allocTypeDesc");
	public static final Property<String> MOT_TYPE_CODE = new Property<String>("motTypeCode");
	public static final Property<String> OWN_MOVEMENT_COST_IND = new Property<String>("ownMovementCostInd");
	public static final Property<Integer> TRANS_ID = new Property<Integer>("transId");
	public static final Property<List<Allocation>> ALLOCATIONS = new Property<List<Allocation>>("allocations");

	public void setAllocTypeDesc(String allocTypeDesc)
	{
		writeProperty("allocTypeDesc", allocTypeDesc);
	}

	public String getAllocTypeDesc()
	{
		return (String) readProperty("allocTypeDesc");
	}

	public void setMotTypeCode(String motTypeCode)
	{
		writeProperty("motTypeCode", motTypeCode);
	}

	public String getMotTypeCode()
	{
		return (String) readProperty("motTypeCode");
	}

	public void setOwnMovementCostInd(String ownMovementCostInd)
	{
		writeProperty("ownMovementCostInd", ownMovementCostInd);
	}

	public String getOwnMovementCostInd()
	{
		return (String) readProperty("ownMovementCostInd");
	}

	public void setTransId(Integer transId)
	{
		writeProperty("transId", transId);
	}

	public Integer getTransId()
	{
		return (Integer) readProperty("transId");
	}

	public void addToAllocations(Allocation obj)
	{
		addToManyTarget("allocations", obj, true);
	}

	public void removeFromAllocations(Allocation obj)
	{
		removeToManyTarget("allocations", obj, true);
	}

	@SuppressWarnings("unchecked")
	public List<Allocation> getAllocations()
	{
		return (List<Allocation>) readProperty("allocations");
	}

}
