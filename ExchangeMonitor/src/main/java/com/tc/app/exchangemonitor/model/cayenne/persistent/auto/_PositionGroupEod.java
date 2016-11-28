package com.tc.app.exchangemonitor.model.cayenne.persistent.auto;

import org.apache.cayenne.CayenneDataObject;
import org.apache.cayenne.exp.Property;

/**
 * Class _PositionGroupEod was generated by Cayenne.
 * It is probably a good idea to avoid changing this class manually,
 * since it may be overwritten next time code is regenerated.
 * If you need to make any customizations, please use subclass.
 */
public abstract class _PositionGroupEod extends CayenneDataObject
{

	private static final long serialVersionUID = 1L;

	public static final String POS_GROUP_NUM_PK_COLUMN = "pos_group_num";

	public static final Property<String> IS_SPREAD_IND = new Property<String>("isSpreadInd");
	public static final Property<Integer> TRANS_ID = new Property<Integer>("transId");

	public void setIsSpreadInd(String isSpreadInd)
	{
		writeProperty("isSpreadInd", isSpreadInd);
	}

	public String getIsSpreadInd()
	{
		return (String) readProperty("isSpreadInd");
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