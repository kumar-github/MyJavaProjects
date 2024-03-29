package com.tc.app.exchangemonitor.model.cayenne.persistent.auto;

import java.util.List;

import org.apache.cayenne.CayenneDataObject;
import org.apache.cayenne.exp.Property;

import com.tc.app.exchangemonitor.model.cayenne.persistent.FunctionDetail;
import com.tc.app.exchangemonitor.model.cayenne.persistent.IctsUserPermission;

/**
 * Class _FunctionDetailValue was generated by Cayenne.
 * It is probably a good idea to avoid changing this class manually,
 * since it may be overwritten next time code is regenerated.
 * If you need to make any customizations, please use subclass.
 */
public abstract class _FunctionDetailValue extends CayenneDataObject
{

	private static final long serialVersionUID = 1L;

	public static final String FDV_ID_PK_COLUMN = "fdv_id";

	public static final Property<String> ATTR_VALUE = new Property<String>("attrValue");
	public static final Property<String> DATA_TYPE = new Property<String>("dataType");
	public static final Property<Integer> TRANS_ID = new Property<Integer>("transId");
	public static final Property<FunctionDetail> FD = new Property<FunctionDetail>("fd");
	public static final Property<List<IctsUserPermission>> ICTS_USER_PERMISSIONS = new Property<List<IctsUserPermission>>("ictsUserPermissions");

	public void setAttrValue(String attrValue)
	{
		writeProperty("attrValue", attrValue);
	}

	public String getAttrValue()
	{
		return (String) readProperty("attrValue");
	}

	public void setDataType(String dataType)
	{
		writeProperty("dataType", dataType);
	}

	public String getDataType()
	{
		return (String) readProperty("dataType");
	}

	public void setTransId(Integer transId)
	{
		writeProperty("transId", transId);
	}

	public Integer getTransId()
	{
		return (Integer) readProperty("transId");
	}

	public void setFd(FunctionDetail fd)
	{
		setToOneTarget("fd", fd, true);
	}

	public FunctionDetail getFd()
	{
		return (FunctionDetail) readProperty("fd");
	}

	public void addToIctsUserPermissions(IctsUserPermission obj)
	{
		addToManyTarget("ictsUserPermissions", obj, true);
	}

	public void removeFromIctsUserPermissions(IctsUserPermission obj)
	{
		removeToManyTarget("ictsUserPermissions", obj, true);
	}

	@SuppressWarnings("unchecked")
	public List<IctsUserPermission> getIctsUserPermissions()
	{
		return (List<IctsUserPermission>) readProperty("ictsUserPermissions");
	}

}
