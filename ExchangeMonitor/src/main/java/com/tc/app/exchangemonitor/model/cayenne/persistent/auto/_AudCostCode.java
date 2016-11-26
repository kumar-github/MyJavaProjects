package com.tc.app.exchangemonitor.model.cayenne.persistent.auto;

import org.apache.cayenne.CayenneDataObject;
import org.apache.cayenne.exp.Property;

/**
 * Class _AudCostCode was generated by Cayenne.
 * It is probably a good idea to avoid changing this class manually,
 * since it may be overwritten next time code is regenerated.
 * If you need to make any customizations, please use subclass.
 */
public abstract class _AudCostCode extends CayenneDataObject
{

	private static final long serialVersionUID = 1L;

	public static final Property<String> COST_CODE = new Property<String>("costCode");
	public static final Property<String> COST_CODE_DESC = new Property<String>("costCodeDesc");
	public static final Property<String> COST_CODE_LONG_NAME = new Property<String>("costCodeLongName");
	public static final Property<Short> COST_CODE_ORDER_NUM = new Property<Short>("costCodeOrderNum");
	public static final Property<String> COST_CODE_TYPE_IND = new Property<String>("costCodeTypeInd");
	public static final Property<String> PL_IMPLICATION = new Property<String>("plImplication");
	public static final Property<Integer> RESP_TRANS_ID = new Property<Integer>("respTransId");
	public static final Property<Integer> TRANS_ID = new Property<Integer>("transId");

	public void setCostCode(String costCode)
	{
		writeProperty("costCode", costCode);
	}

	public String getCostCode()
	{
		return (String) readProperty("costCode");
	}

	public void setCostCodeDesc(String costCodeDesc)
	{
		writeProperty("costCodeDesc", costCodeDesc);
	}

	public String getCostCodeDesc()
	{
		return (String) readProperty("costCodeDesc");
	}

	public void setCostCodeLongName(String costCodeLongName)
	{
		writeProperty("costCodeLongName", costCodeLongName);
	}

	public String getCostCodeLongName()
	{
		return (String) readProperty("costCodeLongName");
	}

	public void setCostCodeOrderNum(Short costCodeOrderNum)
	{
		writeProperty("costCodeOrderNum", costCodeOrderNum);
	}

	public Short getCostCodeOrderNum()
	{
		return (Short) readProperty("costCodeOrderNum");
	}

	public void setCostCodeTypeInd(String costCodeTypeInd)
	{
		writeProperty("costCodeTypeInd", costCodeTypeInd);
	}

	public String getCostCodeTypeInd()
	{
		return (String) readProperty("costCodeTypeInd");
	}

	public void setPlImplication(String plImplication)
	{
		writeProperty("plImplication", plImplication);
	}

	public String getPlImplication()
	{
		return (String) readProperty("plImplication");
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
