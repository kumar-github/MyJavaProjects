package com.tc.app.exchangemonitor.model.cayenne.persistent.auto;

import org.apache.cayenne.CayenneDataObject;
import org.apache.cayenne.exp.Property;

/**
 * Class _AudUicRptCriteriaEntity was generated by Cayenne.
 * It is probably a good idea to avoid changing this class manually,
 * since it may be overwritten next time code is regenerated.
 * If you need to make any customizations, please use subclass.
 */
public abstract class _AudUicRptCriteriaEntity extends CayenneDataObject
{

	private static final long serialVersionUID = 1L;

	public static final Property<String> ENTITY_CRITERIA_SELECTOR = new Property<String>("entityCriteriaSelector");
	public static final Property<Integer> ENTITY_ID = new Property<Integer>("entityId");
	public static final Property<Integer> OID = new Property<Integer>("oid");
	public static final Property<Integer> REPORT_CRITERIA_ID = new Property<Integer>("reportCriteriaId");
	public static final Property<Integer> RESP_TRANS_ID = new Property<Integer>("respTransId");
	public static final Property<Integer> TRANS_ID = new Property<Integer>("transId");

	public void setEntityCriteriaSelector(String entityCriteriaSelector)
	{
		writeProperty("entityCriteriaSelector", entityCriteriaSelector);
	}

	public String getEntityCriteriaSelector()
	{
		return (String) readProperty("entityCriteriaSelector");
	}

	public void setEntityId(Integer entityId)
	{
		writeProperty("entityId", entityId);
	}

	public Integer getEntityId()
	{
		return (Integer) readProperty("entityId");
	}

	public void setOid(Integer oid)
	{
		writeProperty("oid", oid);
	}

	public Integer getOid()
	{
		return (Integer) readProperty("oid");
	}

	public void setReportCriteriaId(Integer reportCriteriaId)
	{
		writeProperty("reportCriteriaId", reportCriteriaId);
	}

	public Integer getReportCriteriaId()
	{
		return (Integer) readProperty("reportCriteriaId");
	}

	public void setRespTransId(Integer respTransId)
	{
		writeProperty("respTransId", respTransId);
	}

	public Integer getRespTransId()
	{
		return (Integer) readProperty("respTransId");
	}

	public void setTransId(Integer transId)
	{
		writeProperty("transId", transId);
	}

	public Integer getTransId()
	{
		return (Integer) readProperty("transId");
	}

}
