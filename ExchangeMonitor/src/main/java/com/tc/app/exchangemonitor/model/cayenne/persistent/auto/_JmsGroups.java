package com.tc.app.exchangemonitor.model.cayenne.persistent.auto;

import org.apache.cayenne.CayenneDataObject;
import org.apache.cayenne.exp.Property;

/**
 * Class _JmsGroups was generated by Cayenne.
 * It is probably a good idea to avoid changing this class manually,
 * since it may be overwritten next time code is regenerated.
 * If you need to make any customizations, please use subclass.
 */
public abstract class _JmsGroups extends CayenneDataObject
{

	private static final long serialVersionUID = 1L;

	public static final Property<String> GROUP_CODE = new Property<String>("groupCode");
	public static final Property<String> GROUP_DESC = new Property<String>("groupDesc");
	public static final Property<Integer> TRANS_ID = new Property<Integer>("transId");

	public void setGroupCode(String groupCode)
	{
		writeProperty("groupCode", groupCode);
	}

	public String getGroupCode()
	{
		return (String) readProperty("groupCode");
	}

	public void setGroupDesc(String groupDesc)
	{
		writeProperty("groupDesc", groupDesc);
	}

	public String getGroupDesc()
	{
		return (String) readProperty("groupDesc");
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
