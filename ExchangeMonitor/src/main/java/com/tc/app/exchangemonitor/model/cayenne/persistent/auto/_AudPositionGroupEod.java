package com.tc.app.exchangemonitor.model.cayenne.persistent.auto;

import org.apache.cayenne.CayenneDataObject;
import org.apache.cayenne.exp.Property;

/**
 * Class _AudPositionGroupEod was generated by Cayenne.
 * It is probably a good idea to avoid changing this class manually,
 * since it may be overwritten next time code is regenerated.
 * If you need to make any customizations, please use subclass.
 */
public abstract class _AudPositionGroupEod extends CayenneDataObject
{

	private static final long serialVersionUID = 1L;

	public static final Property<String> IS_SPREAD_IND = new Property<String>("isSpreadInd");
	public static final Property<Integer> POS_GROUP_NUM = new Property<Integer>("posGroupNum");
	public static final Property<Integer> RESP_TRANS_ID = new Property<Integer>("respTransId");
	public static final Property<Integer> TRANS_ID = new Property<Integer>("transId");

	public void setIsSpreadInd(String isSpreadInd)
	{
		writeProperty("isSpreadInd", isSpreadInd);
	}

	public String getIsSpreadInd()
	{
		return (String) readProperty("isSpreadInd");
	}

	public void setPosGroupNum(Integer posGroupNum)
	{
		writeProperty("posGroupNum", posGroupNum);
	}

	public Integer getPosGroupNum()
	{
		return (Integer) readProperty("posGroupNum");
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
