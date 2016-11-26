package com.tc.app.exchangemonitor.model.cayenne.persistent.auto;

import java.util.Date;

import org.apache.cayenne.CayenneDataObject;
import org.apache.cayenne.exp.Property;

/**
 * Class _TrTimesheetToIcts was generated by Cayenne.
 * It is probably a good idea to avoid changing this class manually,
 * since it may be overwritten next time code is regenerated.
 * If you need to make any customizations, please use subclass.
 */
public abstract class _TrTimesheetToIcts extends CayenneDataObject
{

	private static final long serialVersionUID = 1L;

	public static final Property<Integer> ALLOCATION_NUM = new Property<Integer>("allocationNum");
	public static final Property<String> CARGO_OPERATION_TYPE = new Property<String>("cargoOperationType");
	public static final Property<Date> END_DATE = new Property<Date>("endDate");
	public static final Property<String> ICTS_STATUS = new Property<String>("ictsStatus");
	public static final Property<Date> INSERT_DATE_SIM = new Property<Date>("insertDateSim");
	public static final Property<Date> LAST_UPDATE_ICTS = new Property<Date>("lastUpdateIcts");
	public static final Property<Date> LAST_UPDATE_SIM = new Property<Date>("lastUpdateSim");
	public static final Property<String> NOTE = new Property<String>("note");
	public static final Property<String> OPERATION_TYPE = new Property<String>("operationType");
	public static final Property<String> PORTO = new Property<String>("porto");
	public static final Property<String> SIM_STATUS = new Property<String>("simStatus");
	public static final Property<Date> START_DATE = new Property<Date>("startDate");
	public static final Property<Integer> TS_ID = new Property<Integer>("tsId");

	public void setAllocationNum(Integer allocationNum)
	{
		writeProperty("allocationNum", allocationNum);
	}

	public Integer getAllocationNum()
	{
		return (Integer) readProperty("allocationNum");
	}

	public void setCargoOperationType(String cargoOperationType)
	{
		writeProperty("cargoOperationType", cargoOperationType);
	}

	public String getCargoOperationType()
	{
		return (String) readProperty("cargoOperationType");
	}

	public void setEndDate(Date endDate)
	{
		writeProperty("endDate", endDate);
	}

	public Date getEndDate()
	{
		return (Date) readProperty("endDate");
	}

	public void setIctsStatus(String ictsStatus)
	{
		writeProperty("ictsStatus", ictsStatus);
	}

	public String getIctsStatus()
	{
		return (String) readProperty("ictsStatus");
	}

	public void setInsertDateSim(Date insertDateSim)
	{
		writeProperty("insertDateSim", insertDateSim);
	}

	public Date getInsertDateSim()
	{
		return (Date) readProperty("insertDateSim");
	}

	public void setLastUpdateIcts(Date lastUpdateIcts)
	{
		writeProperty("lastUpdateIcts", lastUpdateIcts);
	}

	public Date getLastUpdateIcts()
	{
		return (Date) readProperty("lastUpdateIcts");
	}

	public void setLastUpdateSim(Date lastUpdateSim)
	{
		writeProperty("lastUpdateSim", lastUpdateSim);
	}

	public Date getLastUpdateSim()
	{
		return (Date) readProperty("lastUpdateSim");
	}

	public void setNote(String note)
	{
		writeProperty("note", note);
	}

	public String getNote()
	{
		return (String) readProperty("note");
	}

	public void setOperationType(String operationType)
	{
		writeProperty("operationType", operationType);
	}

	public String getOperationType()
	{
		return (String) readProperty("operationType");
	}

	public void setPorto(String porto)
	{
		writeProperty("porto", porto);
	}

	public String getPorto()
	{
		return (String) readProperty("porto");
	}

	public void setSimStatus(String simStatus)
	{
		writeProperty("simStatus", simStatus);
	}

	public String getSimStatus()
	{
		return (String) readProperty("simStatus");
	}

	public void setStartDate(Date startDate)
	{
		writeProperty("startDate", startDate);
	}

	public Date getStartDate()
	{
		return (Date) readProperty("startDate");
	}

	public void setTsId(Integer tsId)
	{
		writeProperty("tsId", tsId);
	}

	public Integer getTsId()
	{
		return (Integer) readProperty("tsId");
	}

}
