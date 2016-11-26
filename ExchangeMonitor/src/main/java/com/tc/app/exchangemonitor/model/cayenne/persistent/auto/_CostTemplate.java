package com.tc.app.exchangemonitor.model.cayenne.persistent.auto;

import java.util.Date;

import org.apache.cayenne.CayenneDataObject;
import org.apache.cayenne.exp.Property;

/**
 * Class _CostTemplate was generated by Cayenne.
 * It is probably a good idea to avoid changing this class manually,
 * since it may be overwritten next time code is regenerated.
 * If you need to make any customizations, please use subclass.
 */
public abstract class _CostTemplate extends CayenneDataObject
{

	private static final long serialVersionUID = 1L;

	public static final String OID_PK_COLUMN = "oid";

	public static final Property<Integer> ACCT_NUM = new Property<Integer>("acctNum");
	public static final Property<Date> CREATION_DATE = new Property<Date>("creationDate");
	public static final Property<String> DEL_TERM_CODE = new Property<String>("delTermCode");
	public static final Property<String> DISCHARGE_LOC_CODE = new Property<String>("dischargeLocCode");
	public static final Property<String> FACILITY_CODE = new Property<String>("facilityCode");
	public static final Property<String> LOAD_LOC_CODE = new Property<String>("loadLocCode");
	public static final Property<String> MOT_CODE = new Property<String>("motCode");
	public static final Property<Integer> SEGMENT_OID = new Property<Integer>("segmentOid");
	public static final Property<Integer> TANK_NUM = new Property<Integer>("tankNum");
	public static final Property<String> TEMPLATE_CODE = new Property<String>("templateCode");
	public static final Property<String> TEMPLATE_NAME = new Property<String>("templateName");
	public static final Property<String> TRADE_ITEM_PSIND = new Property<String>("tradeItemPSInd");
	public static final Property<Integer> TRANS_ID = new Property<Integer>("transId");

	public void setAcctNum(Integer acctNum)
	{
		writeProperty("acctNum", acctNum);
	}

	public Integer getAcctNum()
	{
		return (Integer) readProperty("acctNum");
	}

	public void setCreationDate(Date creationDate)
	{
		writeProperty("creationDate", creationDate);
	}

	public Date getCreationDate()
	{
		return (Date) readProperty("creationDate");
	}

	public void setDelTermCode(String delTermCode)
	{
		writeProperty("delTermCode", delTermCode);
	}

	public String getDelTermCode()
	{
		return (String) readProperty("delTermCode");
	}

	public void setDischargeLocCode(String dischargeLocCode)
	{
		writeProperty("dischargeLocCode", dischargeLocCode);
	}

	public String getDischargeLocCode()
	{
		return (String) readProperty("dischargeLocCode");
	}

	public void setFacilityCode(String facilityCode)
	{
		writeProperty("facilityCode", facilityCode);
	}

	public String getFacilityCode()
	{
		return (String) readProperty("facilityCode");
	}

	public void setLoadLocCode(String loadLocCode)
	{
		writeProperty("loadLocCode", loadLocCode);
	}

	public String getLoadLocCode()
	{
		return (String) readProperty("loadLocCode");
	}

	public void setMotCode(String motCode)
	{
		writeProperty("motCode", motCode);
	}

	public String getMotCode()
	{
		return (String) readProperty("motCode");
	}

	public void setSegmentOid(Integer segmentOid)
	{
		writeProperty("segmentOid", segmentOid);
	}

	public Integer getSegmentOid()
	{
		return (Integer) readProperty("segmentOid");
	}

	public void setTankNum(Integer tankNum)
	{
		writeProperty("tankNum", tankNum);
	}

	public Integer getTankNum()
	{
		return (Integer) readProperty("tankNum");
	}

	public void setTemplateCode(String templateCode)
	{
		writeProperty("templateCode", templateCode);
	}

	public String getTemplateCode()
	{
		return (String) readProperty("templateCode");
	}

	public void setTemplateName(String templateName)
	{
		writeProperty("templateName", templateName);
	}

	public String getTemplateName()
	{
		return (String) readProperty("templateName");
	}

	public void setTradeItemPSInd(String tradeItemPSInd)
	{
		writeProperty("tradeItemPSInd", tradeItemPSInd);
	}

	public String getTradeItemPSInd()
	{
		return (String) readProperty("tradeItemPSInd");
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
