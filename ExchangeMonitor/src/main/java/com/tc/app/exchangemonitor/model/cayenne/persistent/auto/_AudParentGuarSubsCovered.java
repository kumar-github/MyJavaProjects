package com.tc.app.exchangemonitor.model.cayenne.persistent.auto;

import org.apache.cayenne.CayenneDataObject;
import org.apache.cayenne.exp.Property;

/**
 * Class _AudParentGuarSubsCovered was generated by Cayenne.
 * It is probably a good idea to avoid changing this class manually,
 * since it may be overwritten next time code is regenerated.
 * If you need to make any customizations, please use subclass.
 */
public abstract class _AudParentGuarSubsCovered extends CayenneDataObject
{

	private static final long serialVersionUID = 1L;

	public static final Property<Integer> PG_NUM = new Property<Integer>("pgNum");
	public static final Property<Integer> PG_SUBSIDIARY_NUM = new Property<Integer>("pgSubsidiaryNum");
	public static final Property<Integer> RESP_TRANS_ID = new Property<Integer>("respTransId");
	public static final Property<Integer> TRANS_ID = new Property<Integer>("transId");

	public void setPgNum(Integer pgNum)
	{
		writeProperty("pgNum", pgNum);
	}

	public Integer getPgNum()
	{
		return (Integer) readProperty("pgNum");
	}

	public void setPgSubsidiaryNum(Integer pgSubsidiaryNum)
	{
		writeProperty("pgSubsidiaryNum", pgSubsidiaryNum);
	}

	public Integer getPgSubsidiaryNum()
	{
		return (Integer) readProperty("pgSubsidiaryNum");
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
