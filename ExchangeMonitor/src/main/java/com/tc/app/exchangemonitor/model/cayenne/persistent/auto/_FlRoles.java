package com.tc.app.exchangemonitor.model.cayenne.persistent.auto;

import java.util.List;

import org.apache.cayenne.CayenneDataObject;
import org.apache.cayenne.exp.Property;

import com.tc.app.exchangemonitor.model.cayenne.persistent.FlGroupsRoles;
import com.tc.app.exchangemonitor.model.cayenne.persistent.FlUsersRoles;

/**
 * Class _FlRoles was generated by Cayenne.
 * It is probably a good idea to avoid changing this class manually,
 * since it may be overwritten next time code is regenerated.
 * If you need to make any customizations, please use subclass.
 */
public abstract class _FlRoles extends CayenneDataObject
{

	private static final long serialVersionUID = 1L;

	public static final String ROLE_NAME_PK_COLUMN = "roleName";

	public static final Property<String> DESCRIPTION = new Property<String>("description");
	public static final Property<String> ROLE_ALIAS_FT1 = new Property<String>("roleAliasFt1");
	public static final Property<List<FlGroupsRoles>> FL_GROUPS_ROLESES = new Property<List<FlGroupsRoles>>("flGroupsRoleses");
	public static final Property<List<FlUsersRoles>> FL_USERS_ROLESES = new Property<List<FlUsersRoles>>("flUsersRoleses");

	public void setDescription(String description)
	{
		writeProperty("description", description);
	}

	public String getDescription()
	{
		return (String) readProperty("description");
	}

	public void setRoleAliasFt1(String roleAliasFt1)
	{
		writeProperty("roleAliasFt1", roleAliasFt1);
	}

	public String getRoleAliasFt1()
	{
		return (String) readProperty("roleAliasFt1");
	}

	public void addToFlGroupsRoleses(FlGroupsRoles obj)
	{
		addToManyTarget("flGroupsRoleses", obj, true);
	}

	public void removeFromFlGroupsRoleses(FlGroupsRoles obj)
	{
		removeToManyTarget("flGroupsRoleses", obj, true);
	}

	@SuppressWarnings("unchecked")
	public List<FlGroupsRoles> getFlGroupsRoleses()
	{
		return (List<FlGroupsRoles>) readProperty("flGroupsRoleses");
	}

	public void addToFlUsersRoleses(FlUsersRoles obj)
	{
		addToManyTarget("flUsersRoleses", obj, true);
	}

	public void removeFromFlUsersRoleses(FlUsersRoles obj)
	{
		removeToManyTarget("flUsersRoleses", obj, true);
	}

	@SuppressWarnings("unchecked")
	public List<FlUsersRoles> getFlUsersRoleses()
	{
		return (List<FlUsersRoles>) readProperty("flUsersRoleses");
	}

}
