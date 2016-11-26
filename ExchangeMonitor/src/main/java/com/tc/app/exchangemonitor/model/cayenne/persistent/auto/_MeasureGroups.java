package com.tc.app.exchangemonitor.model.cayenne.persistent.auto;

import java.util.List;

import org.apache.cayenne.CayenneDataObject;
import org.apache.cayenne.exp.Property;

import com.tc.app.exchangemonitor.model.cayenne.persistent.MeasureTypes;

/**
 * Class _MeasureGroups was generated by Cayenne.
 * It is probably a good idea to avoid changing this class manually,
 * since it may be overwritten next time code is regenerated.
 * If you need to make any customizations, please use subclass.
 */
public abstract class _MeasureGroups extends CayenneDataObject
{

	private static final long serialVersionUID = 1L;

	public static final String FLDCHR_MEAS_GROUP_ID_PK_COLUMN = "fldchrMeasGroupId";

	public static final Property<String> FLDVCH_MEAS_GROUP_DESC = new Property<String>("fldvchMeasGroupDesc");
	public static final Property<Integer> TRANS_ID = new Property<Integer>("transId");
	public static final Property<List<MeasureTypes>> MEASURE_TYPESES = new Property<List<MeasureTypes>>("measureTypeses");

	public void setFldvchMeasGroupDesc(String fldvchMeasGroupDesc)
	{
		writeProperty("fldvchMeasGroupDesc", fldvchMeasGroupDesc);
	}

	public String getFldvchMeasGroupDesc()
	{
		return (String) readProperty("fldvchMeasGroupDesc");
	}

	public void setTransId(Integer transId)
	{
		writeProperty("transId", transId);
	}

	public Integer getTransId()
	{
		return (Integer) readProperty("transId");
	}

	public void addToMeasureTypeses(MeasureTypes obj)
	{
		addToManyTarget("measureTypeses", obj, true);
	}

	public void removeFromMeasureTypeses(MeasureTypes obj)
	{
		removeToManyTarget("measureTypeses", obj, true);
	}

	@SuppressWarnings("unchecked")
	public List<MeasureTypes> getMeasureTypeses()
	{
		return (List<MeasureTypes>) readProperty("measureTypeses");
	}

}
