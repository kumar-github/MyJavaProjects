package com.tc.app.exchangemonitor.model.cayenne.persistent.auto;

import org.apache.cayenne.CayenneDataObject;
import org.apache.cayenne.exp.Property;

/**
 * Class _OperationType was generated by Cayenne.
 * It is probably a good idea to avoid changing this class manually,
 * since it may be overwritten next time code is regenerated.
 * If you need to make any customizations, please use subclass.
 */
public abstract class _OperationType extends CayenneDataObject
{

	private static final long serialVersionUID = 1L;

	public static final String OPER_TYPE_CODE_PK_COLUMN = "oper_type_code";

	public static final Property<String> OPER_TYPE_DESC = new Property<String>("operTypeDesc");
	public static final Property<Integer> TRANS_ID = new Property<Integer>("transId");

	public void setOperTypeDesc(String operTypeDesc)
	{
		writeProperty("operTypeDesc", operTypeDesc);
	}

	public String getOperTypeDesc()
	{
		return (String) readProperty("operTypeDesc");
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