package com.tc.app.exchangemonitor.model.cayenne.persistent.auto;

import java.util.List;

import org.apache.cayenne.CayenneDataObject;
import org.apache.cayenne.exp.Property;

import com.tc.app.exchangemonitor.model.cayenne.persistent.Department;
import com.tc.app.exchangemonitor.model.cayenne.persistent.DeskLocation;
import com.tc.app.exchangemonitor.model.cayenne.persistent.IctsUser;
import com.tc.app.exchangemonitor.model.cayenne.persistent.UserResources;

/**
 * Class _Desk was generated by Cayenne.
 * It is probably a good idea to avoid changing this class manually,
 * since it may be overwritten next time code is regenerated.
 * If you need to make any customizations, please use subclass.
 */
public abstract class _Desk extends CayenneDataObject
{

	private static final long serialVersionUID = 1L;

	public static final String DESK_CODE_PK_COLUMN = "desk_code";

	public static final Property<String> DESK_NAME = new Property<String>("deskName");
	public static final Property<String> MANAGER_INIT = new Property<String>("managerInit");
	public static final Property<Integer> TRANS_ID = new Property<Integer>("transId");
	public static final Property<Department> DEPARTMENT = new Property<Department>("department");
	public static final Property<List<DeskLocation>> DESK_LOCATIONS = new Property<List<DeskLocation>>("deskLocations");
	public static final Property<List<IctsUser>> ICTS_USERS = new Property<List<IctsUser>>("ictsUsers");
	public static final Property<List<UserResources>> USER_RESOURCESES = new Property<List<UserResources>>("userResourceses");

	public void setDeskName(String deskName)
	{
		writeProperty("deskName", deskName);
	}

	public String getDeskName()
	{
		return (String) readProperty("deskName");
	}

	public void setManagerInit(String managerInit)
	{
		writeProperty("managerInit", managerInit);
	}

	public String getManagerInit()
	{
		return (String) readProperty("managerInit");
	}

	public void setTransId(Integer transId)
	{
		writeProperty("transId", transId);
	}

	public Integer getTransId()
	{
		return (Integer) readProperty("transId");
	}

	public void setDepartment(Department department)
	{
		setToOneTarget("department", department, true);
	}

	public Department getDepartment()
	{
		return (Department) readProperty("department");
	}

	public void addToDeskLocations(DeskLocation obj)
	{
		addToManyTarget("deskLocations", obj, true);
	}

	public void removeFromDeskLocations(DeskLocation obj)
	{
		removeToManyTarget("deskLocations", obj, true);
	}

	@SuppressWarnings("unchecked")
	public List<DeskLocation> getDeskLocations()
	{
		return (List<DeskLocation>) readProperty("deskLocations");
	}

	public void addToIctsUsers(IctsUser obj)
	{
		addToManyTarget("ictsUsers", obj, true);
	}

	public void removeFromIctsUsers(IctsUser obj)
	{
		removeToManyTarget("ictsUsers", obj, true);
	}

	@SuppressWarnings("unchecked")
	public List<IctsUser> getIctsUsers()
	{
		return (List<IctsUser>) readProperty("ictsUsers");
	}

	public void addToUserResourceses(UserResources obj)
	{
		addToManyTarget("userResourceses", obj, true);
	}

	public void removeFromUserResourceses(UserResources obj)
	{
		removeToManyTarget("userResourceses", obj, true);
	}

	@SuppressWarnings("unchecked")
	public List<UserResources> getUserResourceses()
	{
		return (List<UserResources>) readProperty("userResourceses");
	}

}
