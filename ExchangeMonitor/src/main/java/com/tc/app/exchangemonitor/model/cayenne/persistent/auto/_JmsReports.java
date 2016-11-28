package com.tc.app.exchangemonitor.model.cayenne.persistent.auto;

import org.apache.cayenne.CayenneDataObject;
import org.apache.cayenne.exp.Property;

/**
 * Class _JmsReports was generated by Cayenne.
 * It is probably a good idea to avoid changing this class manually,
 * since it may be overwritten next time code is regenerated.
 * If you need to make any customizations, please use subclass.
 */
public abstract class _JmsReports extends CayenneDataObject
{

	private static final long serialVersionUID = 1L;

	public static final Property<String> CLASSIFICATION_CODE = new Property<String>("classificationCode");
	public static final Property<String> DEPARTMENT_CODE = new Property<String>("departmentCode");
	public static final Property<String> DESK_CODE = new Property<String>("deskCode");
	public static final Property<String> DIVISION_CODE = new Property<String>("divisionCode");
	public static final Property<String> GROUP_CODE = new Property<String>("groupCode");
	public static final Property<String> LEGAL_ENTITY_CODE = new Property<String>("legalEntityCode");
	public static final Property<String> LOCATION_CODE = new Property<String>("locationCode");
	public static final Property<Integer> PORT_NUM = new Property<Integer>("portNum");
	public static final Property<String> PORT_SHORT_NAME = new Property<String>("portShortName");
	public static final Property<String> PROFIT_CENTER_CODE = new Property<String>("profitCenterCode");
	public static final Property<String> STRATEGY_CODE = new Property<String>("strategyCode");
	public static final Property<String> TRADER_INIT = new Property<String>("traderInit");

	public void setClassificationCode(String classificationCode)
	{
		writeProperty("classificationCode", classificationCode);
	}

	public String getClassificationCode()
	{
		return (String) readProperty("classificationCode");
	}

	public void setDepartmentCode(String departmentCode)
	{
		writeProperty("departmentCode", departmentCode);
	}

	public String getDepartmentCode()
	{
		return (String) readProperty("departmentCode");
	}

	public void setDeskCode(String deskCode)
	{
		writeProperty("deskCode", deskCode);
	}

	public String getDeskCode()
	{
		return (String) readProperty("deskCode");
	}

	public void setDivisionCode(String divisionCode)
	{
		writeProperty("divisionCode", divisionCode);
	}

	public String getDivisionCode()
	{
		return (String) readProperty("divisionCode");
	}

	public void setGroupCode(String groupCode)
	{
		writeProperty("groupCode", groupCode);
	}

	public String getGroupCode()
	{
		return (String) readProperty("groupCode");
	}

	public void setLegalEntityCode(String legalEntityCode)
	{
		writeProperty("legalEntityCode", legalEntityCode);
	}

	public String getLegalEntityCode()
	{
		return (String) readProperty("legalEntityCode");
	}

	public void setLocationCode(String locationCode)
	{
		writeProperty("locationCode", locationCode);
	}

	public String getLocationCode()
	{
		return (String) readProperty("locationCode");
	}

	public void setPortNum(Integer portNum)
	{
		writeProperty("portNum", portNum);
	}

	public Integer getPortNum()
	{
		return (Integer) readProperty("portNum");
	}

	public void setPortShortName(String portShortName)
	{
		writeProperty("portShortName", portShortName);
	}

	public String getPortShortName()
	{
		return (String) readProperty("portShortName");
	}

	public void setProfitCenterCode(String profitCenterCode)
	{
		writeProperty("profitCenterCode", profitCenterCode);
	}

	public String getProfitCenterCode()
	{
		return (String) readProperty("profitCenterCode");
	}

	public void setStrategyCode(String strategyCode)
	{
		writeProperty("strategyCode", strategyCode);
	}

	public String getStrategyCode()
	{
		return (String) readProperty("strategyCode");
	}

	public void setTraderInit(String traderInit)
	{
		writeProperty("traderInit", traderInit);
	}

	public String getTraderInit()
	{
		return (String) readProperty("traderInit");
	}

}