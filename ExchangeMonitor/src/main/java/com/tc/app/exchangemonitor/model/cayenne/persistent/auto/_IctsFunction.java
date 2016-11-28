package com.tc.app.exchangemonitor.model.cayenne.persistent.auto;

import java.util.List;

import org.apache.cayenne.CayenneDataObject;
import org.apache.cayenne.exp.Property;

import com.tc.app.exchangemonitor.model.cayenne.persistent.Application;
import com.tc.app.exchangemonitor.model.cayenne.persistent.FunctionAction;
import com.tc.app.exchangemonitor.model.cayenne.persistent.FunctionDetail;
import com.tc.app.exchangemonitor.model.cayenne.persistent.UserGroupPermission;

/**
 * Class _IctsFunction was generated by Cayenne.
 * It is probably a good idea to avoid changing this class manually,
 * since it may be overwritten next time code is regenerated.
 * If you need to make any customizations, please use subclass.
 */
public abstract class _IctsFunction extends CayenneDataObject
{

	private static final long serialVersionUID = 1L;

	public static final String FUNCTION_NUM_PK_COLUMN = "function_num";

	public static final Property<String> FUNCTION_NAME = new Property<>("functionName");
	public static final Property<Integer> TRANS_ID = new Property<>("transId");
	public static final Property<Application> APPLICATION = new Property<>("application");
	public static final Property<List<FunctionAction>> FUNCTION_ACTIONS = new Property<>("functionActions");
	public static final Property<List<FunctionDetail>> FUNCTION_DETAILS = new Property<>("functionDetails");
	public static final Property<List<UserGroupPermission>> USER_GROUP_PERMISSIONS = new Property<>("userGroupPermissions");

	public void setFunctionName(final String functionName)
	{
		this.writeProperty("functionName", functionName);
	}

	public String getFunctionName()
	{
		return (String) this.readProperty("functionName");
	}

	public void setTransId(final Integer transId)
	{
		this.writeProperty("transId", transId);
	}

	public Integer getTransId()
	{
		return (Integer) this.readProperty("transId");
	}

	public void setApplication(final Application application)
	{
		this.setToOneTarget("application", application, true);
	}

	public Application getApplication()
	{
		return (Application) this.readProperty("application");
	}

	public void addToFunctionActions(final FunctionAction obj)
	{
		this.addToManyTarget("functionActions", obj, true);
	}

	public void removeFromFunctionActions(final FunctionAction obj)
	{
		this.removeToManyTarget("functionActions", obj, true);
	}

	@SuppressWarnings("unchecked")
	public List<FunctionAction> getFunctionActions()
	{
		return (List<FunctionAction>) this.readProperty("functionActions");
	}

	public void addToFunctionDetails(final FunctionDetail obj)
	{
		this.addToManyTarget("functionDetails", obj, true);
	}

	public void removeFromFunctionDetails(final FunctionDetail obj)
	{
		this.removeToManyTarget("functionDetails", obj, true);
	}

	@SuppressWarnings("unchecked")
	public List<FunctionDetail> getFunctionDetails()
	{
		return (List<FunctionDetail>) this.readProperty("functionDetails");
	}

	public void addToUserGroupPermissions(final UserGroupPermission obj)
	{
		this.addToManyTarget("userGroupPermissions", obj, true);
	}

	public void removeFromUserGroupPermissions(final UserGroupPermission obj)
	{
		this.removeToManyTarget("userGroupPermissions", obj, true);
	}

	@SuppressWarnings("unchecked")
	public List<UserGroupPermission> getUserGroupPermissions()
	{
		return (List<UserGroupPermission>) this.readProperty("userGroupPermissions");
	}

}