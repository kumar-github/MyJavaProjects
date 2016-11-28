package com.tc.app.exchangemonitor.model.cayenne.persistent.auto;

import java.util.List;

import org.apache.cayenne.CayenneDataObject;
import org.apache.cayenne.exp.Property;

import com.tc.app.exchangemonitor.model.cayenne.persistent.UicRptCriteria;

/**
 * Class _UicReportType was generated by Cayenne.
 * It is probably a good idea to avoid changing this class manually,
 * since it may be overwritten next time code is regenerated.
 * If you need to make any customizations, please use subclass.
 */
public abstract class _UicReportType extends CayenneDataObject
{

	private static final long serialVersionUID = 1L;

	public static final String OID_PK_COLUMN = "oid";

	public static final Property<String> REPORT_TYPE = new Property<String>("reportType");
	public static final Property<Integer> TRANS_ID = new Property<Integer>("transId");
	public static final Property<List<UicRptCriteria>> UIC_RPT_CRITERIAS = new Property<List<UicRptCriteria>>("uicRptCriterias");

	public void setReportType(String reportType)
	{
		writeProperty("reportType", reportType);
	}

	public String getReportType()
	{
		return (String) readProperty("reportType");
	}

	public void setTransId(Integer transId)
	{
		writeProperty("transId", transId);
	}

	public Integer getTransId()
	{
		return (Integer) readProperty("transId");
	}

	public void addToUicRptCriterias(UicRptCriteria obj)
	{
		addToManyTarget("uicRptCriterias", obj, true);
	}

	public void removeFromUicRptCriterias(UicRptCriteria obj)
	{
		removeToManyTarget("uicRptCriterias", obj, true);
	}

	@SuppressWarnings("unchecked")
	public List<UicRptCriteria> getUicRptCriterias()
	{
		return (List<UicRptCriteria>) readProperty("uicRptCriterias");
	}

}