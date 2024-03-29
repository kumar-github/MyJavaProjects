package com.tc.app.exchangemonitor.model.cayenne.persistent.auto;

import java.util.Date;

import org.apache.cayenne.CayenneDataObject;
import org.apache.cayenne.exp.Property;

/**
 * Class _AudDemurrageReasons was generated by Cayenne.
 * It is probably a good idea to avoid changing this class manually,
 * since it may be overwritten next time code is regenerated.
 * If you need to make any customizations, please use subclass.
 */
public abstract class _AudDemurrageReasons extends CayenneDataObject
{

	private static final long serialVersionUID = 1L;

	public static final Property<Date> DATE_OP = new Property<Date>("dateOp");
	public static final Property<String> FLDCHR_DEM_REASON_CODE = new Property<String>("fldchrDemReasonCode");
	public static final Property<String> FLDCHR_DEM_REASON_ENABLED_FLAG = new Property<String>("fldchrDemReasonEnabledFlag");
	public static final Property<Integer> FLDINT_DEM_REASON_SORT_ORDER = new Property<Integer>("fldintDemReasonSortOrder");
	public static final Property<String> FLDVCH_DEM_REASON_DESC = new Property<String>("fldvchDemReasonDesc");
	public static final Property<String> OPERATION = new Property<String>("operation");
	public static final Property<String> USERID = new Property<String>("userid");

	public void setDateOp(Date dateOp)
	{
		writeProperty("dateOp", dateOp);
	}

	public Date getDateOp()
	{
		return (Date) readProperty("dateOp");
	}

	public void setFldchrDemReasonCode(String fldchrDemReasonCode)
	{
		writeProperty("fldchrDemReasonCode", fldchrDemReasonCode);
	}

	public String getFldchrDemReasonCode()
	{
		return (String) readProperty("fldchrDemReasonCode");
	}

	public void setFldchrDemReasonEnabledFlag(String fldchrDemReasonEnabledFlag)
	{
		writeProperty("fldchrDemReasonEnabledFlag", fldchrDemReasonEnabledFlag);
	}

	public String getFldchrDemReasonEnabledFlag()
	{
		return (String) readProperty("fldchrDemReasonEnabledFlag");
	}

	public void setFldintDemReasonSortOrder(Integer fldintDemReasonSortOrder)
	{
		writeProperty("fldintDemReasonSortOrder", fldintDemReasonSortOrder);
	}

	public Integer getFldintDemReasonSortOrder()
	{
		return (Integer) readProperty("fldintDemReasonSortOrder");
	}

	public void setFldvchDemReasonDesc(String fldvchDemReasonDesc)
	{
		writeProperty("fldvchDemReasonDesc", fldvchDemReasonDesc);
	}

	public String getFldvchDemReasonDesc()
	{
		return (String) readProperty("fldvchDemReasonDesc");
	}

	public void setOperation(String operation)
	{
		writeProperty("operation", operation);
	}

	public String getOperation()
	{
		return (String) readProperty("operation");
	}

	public void setUserid(String userid)
	{
		writeProperty("userid", userid);
	}

	public String getUserid()
	{
		return (String) readProperty("userid");
	}

}
