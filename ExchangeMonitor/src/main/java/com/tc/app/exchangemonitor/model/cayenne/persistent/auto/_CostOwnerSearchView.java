package com.tc.app.exchangemonitor.model.cayenne.persistent.auto;

import org.apache.cayenne.CayenneDataObject;
import org.apache.cayenne.exp.Property;

/**
 * Class _CostOwnerSearchView was generated by Cayenne.
 * It is probably a good idea to avoid changing this class manually,
 * since it may be overwritten next time code is regenerated.
 * If you need to make any customizations, please use subclass.
 */
public abstract class _CostOwnerSearchView extends CayenneDataObject
{

	private static final long serialVersionUID = 1L;

	public static final Property<String> BC_OWNER_CODE = new Property<String>("bcOwnerCode");
	public static final Property<String> BC_OWNER_DESC = new Property<String>("bcOwnerDesc");
	public static final Property<String> BC_OWNER_FULL_NAME = new Property<String>("bcOwnerFullName");
	public static final Property<String> COST_OWNER_CODE = new Property<String>("costOwnerCode");
	public static final Property<String> COST_OWNER_KEY1NAME = new Property<String>("costOwnerKey1Name");
	public static final Property<String> COST_OWNER_KEY2NAME = new Property<String>("costOwnerKey2Name");
	public static final Property<String> COST_OWNER_KEY3NAME = new Property<String>("costOwnerKey3Name");
	public static final Property<String> COST_OWNER_KEY4NAME = new Property<String>("costOwnerKey4Name");
	public static final Property<String> COST_OWNER_KEY5NAME = new Property<String>("costOwnerKey5Name");
	public static final Property<String> COST_OWNER_KEY6NAME = new Property<String>("costOwnerKey6Name");
	public static final Property<String> COST_OWNER_KEY7NAME = new Property<String>("costOwnerKey7Name");
	public static final Property<String> COST_OWNER_KEY8NAME = new Property<String>("costOwnerKey8Name");
	public static final Property<String> COST_OWNER_TABLE_NAME = new Property<String>("costOwnerTableName");
	public static final Property<Integer> TRANS_ID = new Property<Integer>("transId");

	public void setBcOwnerCode(String bcOwnerCode)
	{
		writeProperty("bcOwnerCode", bcOwnerCode);
	}

	public String getBcOwnerCode()
	{
		return (String) readProperty("bcOwnerCode");
	}

	public void setBcOwnerDesc(String bcOwnerDesc)
	{
		writeProperty("bcOwnerDesc", bcOwnerDesc);
	}

	public String getBcOwnerDesc()
	{
		return (String) readProperty("bcOwnerDesc");
	}

	public void setBcOwnerFullName(String bcOwnerFullName)
	{
		writeProperty("bcOwnerFullName", bcOwnerFullName);
	}

	public String getBcOwnerFullName()
	{
		return (String) readProperty("bcOwnerFullName");
	}

	public void setCostOwnerCode(String costOwnerCode)
	{
		writeProperty("costOwnerCode", costOwnerCode);
	}

	public String getCostOwnerCode()
	{
		return (String) readProperty("costOwnerCode");
	}

	public void setCostOwnerKey1Name(String costOwnerKey1Name)
	{
		writeProperty("costOwnerKey1Name", costOwnerKey1Name);
	}

	public String getCostOwnerKey1Name()
	{
		return (String) readProperty("costOwnerKey1Name");
	}

	public void setCostOwnerKey2Name(String costOwnerKey2Name)
	{
		writeProperty("costOwnerKey2Name", costOwnerKey2Name);
	}

	public String getCostOwnerKey2Name()
	{
		return (String) readProperty("costOwnerKey2Name");
	}

	public void setCostOwnerKey3Name(String costOwnerKey3Name)
	{
		writeProperty("costOwnerKey3Name", costOwnerKey3Name);
	}

	public String getCostOwnerKey3Name()
	{
		return (String) readProperty("costOwnerKey3Name");
	}

	public void setCostOwnerKey4Name(String costOwnerKey4Name)
	{
		writeProperty("costOwnerKey4Name", costOwnerKey4Name);
	}

	public String getCostOwnerKey4Name()
	{
		return (String) readProperty("costOwnerKey4Name");
	}

	public void setCostOwnerKey5Name(String costOwnerKey5Name)
	{
		writeProperty("costOwnerKey5Name", costOwnerKey5Name);
	}

	public String getCostOwnerKey5Name()
	{
		return (String) readProperty("costOwnerKey5Name");
	}

	public void setCostOwnerKey6Name(String costOwnerKey6Name)
	{
		writeProperty("costOwnerKey6Name", costOwnerKey6Name);
	}

	public String getCostOwnerKey6Name()
	{
		return (String) readProperty("costOwnerKey6Name");
	}

	public void setCostOwnerKey7Name(String costOwnerKey7Name)
	{
		writeProperty("costOwnerKey7Name", costOwnerKey7Name);
	}

	public String getCostOwnerKey7Name()
	{
		return (String) readProperty("costOwnerKey7Name");
	}

	public void setCostOwnerKey8Name(String costOwnerKey8Name)
	{
		writeProperty("costOwnerKey8Name", costOwnerKey8Name);
	}

	public String getCostOwnerKey8Name()
	{
		return (String) readProperty("costOwnerKey8Name");
	}

	public void setCostOwnerTableName(String costOwnerTableName)
	{
		writeProperty("costOwnerTableName", costOwnerTableName);
	}

	public String getCostOwnerTableName()
	{
		return (String) readProperty("costOwnerTableName");
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
