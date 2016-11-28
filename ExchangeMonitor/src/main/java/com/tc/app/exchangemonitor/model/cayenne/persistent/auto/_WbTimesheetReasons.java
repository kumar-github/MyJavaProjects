package com.tc.app.exchangemonitor.model.cayenne.persistent.auto;

import java.util.List;

import org.apache.cayenne.CayenneDataObject;
import org.apache.cayenne.exp.Property;

import com.tc.app.exchangemonitor.model.cayenne.persistent.WbOpsTimesheet;

/**
 * Class _WbTimesheetReasons was generated by Cayenne.
 * It is probably a good idea to avoid changing this class manually,
 * since it may be overwritten next time code is regenerated.
 * If you need to make any customizations, please use subclass.
 */
public abstract class _WbTimesheetReasons extends CayenneDataObject
{

	private static final long serialVersionUID = 1L;

	public static final String FLDCHR_TSHT_REASON_ID_PK_COLUMN = "fldchrTshtReasonId";

	public static final Property<String> FLDVCH_TSHT_REASON_DESC = new Property<String>("fldvchTshtReasonDesc");
	public static final Property<Integer> TRANS_ID = new Property<Integer>("transId");
	public static final Property<List<WbOpsTimesheet>> WB_OPS_TIMESHEETS = new Property<List<WbOpsTimesheet>>("wbOpsTimesheets");

	public void setFldvchTshtReasonDesc(String fldvchTshtReasonDesc)
	{
		writeProperty("fldvchTshtReasonDesc", fldvchTshtReasonDesc);
	}

	public String getFldvchTshtReasonDesc()
	{
		return (String) readProperty("fldvchTshtReasonDesc");
	}

	public void setTransId(Integer transId)
	{
		writeProperty("transId", transId);
	}

	public Integer getTransId()
	{
		return (Integer) readProperty("transId");
	}

	public void addToWbOpsTimesheets(WbOpsTimesheet obj)
	{
		addToManyTarget("wbOpsTimesheets", obj, true);
	}

	public void removeFromWbOpsTimesheets(WbOpsTimesheet obj)
	{
		removeToManyTarget("wbOpsTimesheets", obj, true);
	}

	@SuppressWarnings("unchecked")
	public List<WbOpsTimesheet> getWbOpsTimesheets()
	{
		return (List<WbOpsTimesheet>) readProperty("wbOpsTimesheets");
	}

}