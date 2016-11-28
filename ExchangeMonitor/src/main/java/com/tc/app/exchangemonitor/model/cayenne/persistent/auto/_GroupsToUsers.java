package com.tc.app.exchangemonitor.model.cayenne.persistent.auto;

import org.apache.cayenne.CayenneDataObject;
import org.apache.cayenne.exp.Property;

import com.tc.app.exchangemonitor.model.cayenne.persistent.IctsUser;
import com.tc.app.exchangemonitor.model.cayenne.persistent.PermissionsGroups;

/**
 * Class _GroupsToUsers was generated by Cayenne.
 * It is probably a good idea to avoid changing this class manually,
 * since it may be overwritten next time code is regenerated.
 * If you need to make any customizations, please use subclass.
 */
public abstract class _GroupsToUsers extends CayenneDataObject
{

	private static final long serialVersionUID = 1L;

	public static final String USER_INIT_PK_COLUMN = "User_Init";
	public static final String FLDCHR_GROUP_CODE_PK_COLUMN = "fldchrGroupCode";

	public static final Property<Integer> TRANS_ID = new Property<Integer>("transId");
	public static final Property<IctsUser> ICTS_USER = new Property<IctsUser>("ictsUser");
	public static final Property<PermissionsGroups> PERMISSIONS_GROUPS = new Property<PermissionsGroups>("permissionsGroups");

	public void setTransId(Integer transId)
	{
		writeProperty("transId", transId);
	}

	public Integer getTransId()
	{
		return (Integer) readProperty("transId");
	}

	public void setIctsUser(IctsUser ictsUser)
	{
		setToOneTarget("ictsUser", ictsUser, true);
	}

	public IctsUser getIctsUser()
	{
		return (IctsUser) readProperty("ictsUser");
	}

	public void setPermissionsGroups(PermissionsGroups permissionsGroups)
	{
		setToOneTarget("permissionsGroups", permissionsGroups, true);
	}

	public PermissionsGroups getPermissionsGroups()
	{
		return (PermissionsGroups) readProperty("permissionsGroups");
	}

}