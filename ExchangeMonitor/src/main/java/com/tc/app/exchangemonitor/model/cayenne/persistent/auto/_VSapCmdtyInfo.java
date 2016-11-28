package com.tc.app.exchangemonitor.model.cayenne.persistent.auto;

import java.util.Date;

import org.apache.cayenne.CayenneDataObject;
import org.apache.cayenne.exp.Property;

/**
 * Class _VSapCmdtyInfo was generated by Cayenne.
 * It is probably a good idea to avoid changing this class manually,
 * since it may be overwritten next time code is regenerated.
 * If you need to make any customizations, please use subclass.
 */
public abstract class _VSapCmdtyInfo extends CayenneDataObject
{

	private static final long serialVersionUID = 1L;

	public static final Property<String> CMDTY_CATEGORY_CODE = new Property<String>("cmdtyCategoryCode");
	public static final Property<String> CMDTY_CODE = new Property<String>("cmdtyCode");
	public static final Property<String> CMDTY_FULL_NAME = new Property<String>("cmdtyFullName");
	public static final Property<String> CMDTY_GROUP_TYPE_CODE = new Property<String>("cmdtyGroupTypeCode");
	public static final Property<String> CMDTY_SHORT_NAME = new Property<String>("cmdtyShortName");
	public static final Property<String> CMDTY_STATUS = new Property<String>("cmdtyStatus");
	public static final Property<String> CMDTY_TRADEABLE_IND = new Property<String>("cmdtyTradeableInd");
	public static final Property<String> CMDTY_TYPE = new Property<String>("cmdtyType");
	public static final Property<String> COUNTRY_CODE = new Property<String>("countryCode");
	public static final Property<Date> LAST_UPDATE_DATE = new Property<Date>("lastUpdateDate");
	public static final Property<String> PARENT_CMDTY_CODE = new Property<String>("parentCmdtyCode");
	public static final Property<String> PRIM_CURR_CODE = new Property<String>("primCurrCode");
	public static final Property<String> PRIM_UOM_CODE = new Property<String>("primUomCode");
	public static final Property<String> SEC_UOM_CODE = new Property<String>("secUomCode");

	public void setCmdtyCategoryCode(String cmdtyCategoryCode)
	{
		writeProperty("cmdtyCategoryCode", cmdtyCategoryCode);
	}

	public String getCmdtyCategoryCode()
	{
		return (String) readProperty("cmdtyCategoryCode");
	}

	public void setCmdtyCode(String cmdtyCode)
	{
		writeProperty("cmdtyCode", cmdtyCode);
	}

	public String getCmdtyCode()
	{
		return (String) readProperty("cmdtyCode");
	}

	public void setCmdtyFullName(String cmdtyFullName)
	{
		writeProperty("cmdtyFullName", cmdtyFullName);
	}

	public String getCmdtyFullName()
	{
		return (String) readProperty("cmdtyFullName");
	}

	public void setCmdtyGroupTypeCode(String cmdtyGroupTypeCode)
	{
		writeProperty("cmdtyGroupTypeCode", cmdtyGroupTypeCode);
	}

	public String getCmdtyGroupTypeCode()
	{
		return (String) readProperty("cmdtyGroupTypeCode");
	}

	public void setCmdtyShortName(String cmdtyShortName)
	{
		writeProperty("cmdtyShortName", cmdtyShortName);
	}

	public String getCmdtyShortName()
	{
		return (String) readProperty("cmdtyShortName");
	}

	public void setCmdtyStatus(String cmdtyStatus)
	{
		writeProperty("cmdtyStatus", cmdtyStatus);
	}

	public String getCmdtyStatus()
	{
		return (String) readProperty("cmdtyStatus");
	}

	public void setCmdtyTradeableInd(String cmdtyTradeableInd)
	{
		writeProperty("cmdtyTradeableInd", cmdtyTradeableInd);
	}

	public String getCmdtyTradeableInd()
	{
		return (String) readProperty("cmdtyTradeableInd");
	}

	public void setCmdtyType(String cmdtyType)
	{
		writeProperty("cmdtyType", cmdtyType);
	}

	public String getCmdtyType()
	{
		return (String) readProperty("cmdtyType");
	}

	public void setCountryCode(String countryCode)
	{
		writeProperty("countryCode", countryCode);
	}

	public String getCountryCode()
	{
		return (String) readProperty("countryCode");
	}

	public void setLastUpdateDate(Date lastUpdateDate)
	{
		writeProperty("lastUpdateDate", lastUpdateDate);
	}

	public Date getLastUpdateDate()
	{
		return (Date) readProperty("lastUpdateDate");
	}

	public void setParentCmdtyCode(String parentCmdtyCode)
	{
		writeProperty("parentCmdtyCode", parentCmdtyCode);
	}

	public String getParentCmdtyCode()
	{
		return (String) readProperty("parentCmdtyCode");
	}

	public void setPrimCurrCode(String primCurrCode)
	{
		writeProperty("primCurrCode", primCurrCode);
	}

	public String getPrimCurrCode()
	{
		return (String) readProperty("primCurrCode");
	}

	public void setPrimUomCode(String primUomCode)
	{
		writeProperty("primUomCode", primUomCode);
	}

	public String getPrimUomCode()
	{
		return (String) readProperty("primUomCode");
	}

	public void setSecUomCode(String secUomCode)
	{
		writeProperty("secUomCode", secUomCode);
	}

	public String getSecUomCode()
	{
		return (String) readProperty("secUomCode");
	}

}