package com.tc.app.exchangemonitor.model.cayenne.persistent.auto;

import org.apache.cayenne.CayenneDataObject;
import org.apache.cayenne.exp.Property;

import com.tc.app.exchangemonitor.model.cayenne.persistent.IctsFunction;
import com.tc.app.exchangemonitor.model.cayenne.persistent.UserGroup;

/**
 * Class _UserGroupPermission was generated by Cayenne.
 * It is probably a good idea to avoid changing this class manually,
 * since it may be overwritten next time code is regenerated.
 * If you need to make any customizations, please use subclass.
 */
public abstract class _UserGroupPermission extends CayenneDataObject
{

	private static final long serialVersionUID = 1L;

	public static final String FUNCTION_NUM_PK_COLUMN = "function_num";
	public static final String USER_GROUP_CODE_PK_COLUMN = "user_group_code";

	public static final Property<String> PERM_LEVEL = new Property<String>("permLevel");
	public static final Property<Integer> TRANS_ID = new Property<Integer>("transId");
	public static final Property<IctsFunction> ICTS_FUNCTION = new Property<IctsFunction>("ictsFunction");
	public static final Property<UserGroup> USER_GROUP = new Property<UserGroup>("userGroup");

	public void setPermLevel(String permLevel)
	{
		writeProperty("permLevel", permLevel);
	}

	public String getPermLevel()
	{
		return (String) readProperty("permLevel");
	}

	public void setTransId(Integer transId)
	{
		writeProperty("transId", transId);
	}

	public Integer getTransId()
	{
		return (Integer) readProperty("transId");
	}

	public void setIctsFunction(IctsFunction ictsFunction)
	{
		setToOneTarget("ictsFunction", ictsFunction, true);
	}

	public IctsFunction getIctsFunction()
	{
		return (IctsFunction) readProperty("ictsFunction");
	}

	public void setUserGroup(UserGroup userGroup)
	{
		setToOneTarget("userGroup", userGroup, true);
	}

	public UserGroup getUserGroup()
	{
		return (UserGroup) readProperty("userGroup");
	}

}