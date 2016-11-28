package com.tc.app.exchangemonitor.model.cayenne.persistent.auto;

import java.math.BigDecimal;
import java.util.Date;

import org.apache.cayenne.CayenneDataObject;
import org.apache.cayenne.exp.Property;

/**
 * Class _VParcelRev was generated by Cayenne.
 * It is probably a good idea to avoid changing this class manually,
 * since it may be overwritten next time code is regenerated.
 * If you need to make any customizations, please use subclass.
 */
public abstract class _VParcelRev extends CayenneDataObject
{

	private static final long serialVersionUID = 1L;

	public static final Property<Short> ALLOC_ITEM_NUM = new Property<Short>("allocItemNum");
	public static final Property<Integer> ALLOC_NUM = new Property<Integer>("allocNum");
	public static final Property<Integer> ASOF_TRANS_ID = new Property<Integer>("asofTransId");
	public static final Property<Short> ASSOCIATIVE_STATE = new Property<Short>("associativeState");
	public static final Property<Integer> BOOKCO_BANK_ACCT_NUM = new Property<Integer>("bookcoBankAcctNum");
	public static final Property<String> CMDTY_CODE = new Property<String>("cmdtyCode");
	public static final Property<Integer> CMNT_NUM = new Property<Integer>("cmntNum");
	public static final Property<Date> CREATION_DATE = new Property<Date>("creationDate");
	public static final Property<String> CREATOR_INIT = new Property<String>("creatorInit");
	public static final Property<String> CUSTOM_CODE = new Property<String>("customCode");
	public static final Property<String> CUSTOM_STATUS = new Property<String>("customStatus");
	public static final Property<Date> ESTIMATED_DATE = new Property<Date>("estimatedDate");
	public static final Property<String> EXCISE_STATUS = new Property<String>("exciseStatus");
	public static final Property<String> FACILITY_CODE = new Property<String>("facilityCode");
	public static final Property<Double> FLOAT_VALUE = new Property<Double>("floatValue");
	public static final Property<Integer> FORECAST_NUM = new Property<Integer>("forecastNum");
	public static final Property<String> GN_TARIC_CODE = new Property<String>("gnTaricCode");
	public static final Property<String> GRADE = new Property<String>("grade");
	public static final Property<String> INSPECTOR = new Property<String>("inspector");
	public static final Property<Integer> INT_VALUE = new Property<Integer>("intValue");
	public static final Property<Integer> INV_NUM = new Property<Integer>("invNum");
	public static final Property<Short> ITEM_NUM = new Property<Short>("itemNum");
	public static final Property<String> LAST_UPDATE_BY_INIT = new Property<String>("lastUpdateByInit");
	public static final Property<Date> LAST_UPDATE_DATE = new Property<Date>("lastUpdateDate");
	public static final Property<String> LATEST_FEED_NAME = new Property<String>("latestFeedName");
	public static final Property<String> LOCATION_CODE = new Property<String>("locationCode");
	public static final Property<String> MOT_TYPE_CODE = new Property<String>("motTypeCode");
	public static final Property<BigDecimal> NOMIN_QTY = new Property<BigDecimal>("nominQty");
	public static final Property<String> NOMIN_QTY_UOM_CODE = new Property<String>("nominQtyUomCode");
	public static final Property<Integer> OID = new Property<Integer>("oid");
	public static final Property<Short> ORDER_NUM = new Property<Short>("orderNum");
	public static final Property<String> PRODUCT_CODE = new Property<String>("productCode");
	public static final Property<String> QUALITY = new Property<String>("quality");
	public static final Property<Integer> REAL_PORT_NUM = new Property<Integer>("realPortNum");
	public static final Property<String> REFERENCE = new Property<String>("reference");
	public static final Property<Integer> RESP_TRANS_ID = new Property<Integer>("respTransId");
	public static final Property<Date> SCH_FROM_DATE = new Property<Date>("schFromDate");
	public static final Property<BigDecimal> SCH_QTY = new Property<BigDecimal>("schQty");
	public static final Property<String> SCH_QTY_UOM_CODE = new Property<String>("schQtyUomCode");
	public static final Property<Date> SCH_TO_DATE = new Property<Date>("schToDate");
	public static final Property<String> SEND_TO_SAP = new Property<String>("sendToSap");
	public static final Property<Integer> SHIPMENT_NUM = new Property<Integer>("shipmentNum");
	public static final Property<Short> STATUS = new Property<Short>("status");
	public static final Property<String> STRING_VALUE = new Property<String>("stringValue");
	public static final Property<Integer> T4CONSIGNEE = new Property<Integer>("t4Consignee");
	public static final Property<String> T4LOC = new Property<String>("t4Loc");
	public static final Property<Integer> T4TANKAGE = new Property<Integer>("t4Tankage");
	public static final Property<Integer> TANK_CODE = new Property<Integer>("tankCode");
	public static final Property<String> TARIFF_CODE = new Property<String>("tariffCode");
	public static final Property<Integer> TRADE_NUM = new Property<Integer>("tradeNum");
	public static final Property<Integer> TRANS_ID = new Property<Integer>("transId");
	public static final Property<String> TRANSMITALL_TYPE = new Property<String>("transmitallType");
	public static final Property<String> TYPE = new Property<String>("type");

	public void setAllocItemNum(Short allocItemNum)
	{
		writeProperty("allocItemNum", allocItemNum);
	}

	public Short getAllocItemNum()
	{
		return (Short) readProperty("allocItemNum");
	}

	public void setAllocNum(Integer allocNum)
	{
		writeProperty("allocNum", allocNum);
	}

	public Integer getAllocNum()
	{
		return (Integer) readProperty("allocNum");
	}

	public void setAsofTransId(Integer asofTransId)
	{
		writeProperty("asofTransId", asofTransId);
	}

	public Integer getAsofTransId()
	{
		return (Integer) readProperty("asofTransId");
	}

	public void setAssociativeState(Short associativeState)
	{
		writeProperty("associativeState", associativeState);
	}

	public Short getAssociativeState()
	{
		return (Short) readProperty("associativeState");
	}

	public void setBookcoBankAcctNum(Integer bookcoBankAcctNum)
	{
		writeProperty("bookcoBankAcctNum", bookcoBankAcctNum);
	}

	public Integer getBookcoBankAcctNum()
	{
		return (Integer) readProperty("bookcoBankAcctNum");
	}

	public void setCmdtyCode(String cmdtyCode)
	{
		writeProperty("cmdtyCode", cmdtyCode);
	}

	public String getCmdtyCode()
	{
		return (String) readProperty("cmdtyCode");
	}

	public void setCmntNum(Integer cmntNum)
	{
		writeProperty("cmntNum", cmntNum);
	}

	public Integer getCmntNum()
	{
		return (Integer) readProperty("cmntNum");
	}

	public void setCreationDate(Date creationDate)
	{
		writeProperty("creationDate", creationDate);
	}

	public Date getCreationDate()
	{
		return (Date) readProperty("creationDate");
	}

	public void setCreatorInit(String creatorInit)
	{
		writeProperty("creatorInit", creatorInit);
	}

	public String getCreatorInit()
	{
		return (String) readProperty("creatorInit");
	}

	public void setCustomCode(String customCode)
	{
		writeProperty("customCode", customCode);
	}

	public String getCustomCode()
	{
		return (String) readProperty("customCode");
	}

	public void setCustomStatus(String customStatus)
	{
		writeProperty("customStatus", customStatus);
	}

	public String getCustomStatus()
	{
		return (String) readProperty("customStatus");
	}

	public void setEstimatedDate(Date estimatedDate)
	{
		writeProperty("estimatedDate", estimatedDate);
	}

	public Date getEstimatedDate()
	{
		return (Date) readProperty("estimatedDate");
	}

	public void setExciseStatus(String exciseStatus)
	{
		writeProperty("exciseStatus", exciseStatus);
	}

	public String getExciseStatus()
	{
		return (String) readProperty("exciseStatus");
	}

	public void setFacilityCode(String facilityCode)
	{
		writeProperty("facilityCode", facilityCode);
	}

	public String getFacilityCode()
	{
		return (String) readProperty("facilityCode");
	}

	public void setFloatValue(Double floatValue)
	{
		writeProperty("floatValue", floatValue);
	}

	public Double getFloatValue()
	{
		return (Double) readProperty("floatValue");
	}

	public void setForecastNum(Integer forecastNum)
	{
		writeProperty("forecastNum", forecastNum);
	}

	public Integer getForecastNum()
	{
		return (Integer) readProperty("forecastNum");
	}

	public void setGnTaricCode(String gnTaricCode)
	{
		writeProperty("gnTaricCode", gnTaricCode);
	}

	public String getGnTaricCode()
	{
		return (String) readProperty("gnTaricCode");
	}

	public void setGrade(String grade)
	{
		writeProperty("grade", grade);
	}

	public String getGrade()
	{
		return (String) readProperty("grade");
	}

	public void setInspector(String inspector)
	{
		writeProperty("inspector", inspector);
	}

	public String getInspector()
	{
		return (String) readProperty("inspector");
	}

	public void setIntValue(Integer intValue)
	{
		writeProperty("intValue", intValue);
	}

	public Integer getIntValue()
	{
		return (Integer) readProperty("intValue");
	}

	public void setInvNum(Integer invNum)
	{
		writeProperty("invNum", invNum);
	}

	public Integer getInvNum()
	{
		return (Integer) readProperty("invNum");
	}

	public void setItemNum(Short itemNum)
	{
		writeProperty("itemNum", itemNum);
	}

	public Short getItemNum()
	{
		return (Short) readProperty("itemNum");
	}

	public void setLastUpdateByInit(String lastUpdateByInit)
	{
		writeProperty("lastUpdateByInit", lastUpdateByInit);
	}

	public String getLastUpdateByInit()
	{
		return (String) readProperty("lastUpdateByInit");
	}

	public void setLastUpdateDate(Date lastUpdateDate)
	{
		writeProperty("lastUpdateDate", lastUpdateDate);
	}

	public Date getLastUpdateDate()
	{
		return (Date) readProperty("lastUpdateDate");
	}

	public void setLatestFeedName(String latestFeedName)
	{
		writeProperty("latestFeedName", latestFeedName);
	}

	public String getLatestFeedName()
	{
		return (String) readProperty("latestFeedName");
	}

	public void setLocationCode(String locationCode)
	{
		writeProperty("locationCode", locationCode);
	}

	public String getLocationCode()
	{
		return (String) readProperty("locationCode");
	}

	public void setMotTypeCode(String motTypeCode)
	{
		writeProperty("motTypeCode", motTypeCode);
	}

	public String getMotTypeCode()
	{
		return (String) readProperty("motTypeCode");
	}

	public void setNominQty(BigDecimal nominQty)
	{
		writeProperty("nominQty", nominQty);
	}

	public BigDecimal getNominQty()
	{
		return (BigDecimal) readProperty("nominQty");
	}

	public void setNominQtyUomCode(String nominQtyUomCode)
	{
		writeProperty("nominQtyUomCode", nominQtyUomCode);
	}

	public String getNominQtyUomCode()
	{
		return (String) readProperty("nominQtyUomCode");
	}

	public void setOid(Integer oid)
	{
		writeProperty("oid", oid);
	}

	public Integer getOid()
	{
		return (Integer) readProperty("oid");
	}

	public void setOrderNum(Short orderNum)
	{
		writeProperty("orderNum", orderNum);
	}

	public Short getOrderNum()
	{
		return (Short) readProperty("orderNum");
	}

	public void setProductCode(String productCode)
	{
		writeProperty("productCode", productCode);
	}

	public String getProductCode()
	{
		return (String) readProperty("productCode");
	}

	public void setQuality(String quality)
	{
		writeProperty("quality", quality);
	}

	public String getQuality()
	{
		return (String) readProperty("quality");
	}

	public void setRealPortNum(Integer realPortNum)
	{
		writeProperty("realPortNum", realPortNum);
	}

	public Integer getRealPortNum()
	{
		return (Integer) readProperty("realPortNum");
	}

	public void setReference(String reference)
	{
		writeProperty("reference", reference);
	}

	public String getReference()
	{
		return (String) readProperty("reference");
	}

	public void setRespTransId(Integer respTransId)
	{
		writeProperty("respTransId", respTransId);
	}

	public Integer getRespTransId()
	{
		return (Integer) readProperty("respTransId");
	}

	public void setSchFromDate(Date schFromDate)
	{
		writeProperty("schFromDate", schFromDate);
	}

	public Date getSchFromDate()
	{
		return (Date) readProperty("schFromDate");
	}

	public void setSchQty(BigDecimal schQty)
	{
		writeProperty("schQty", schQty);
	}

	public BigDecimal getSchQty()
	{
		return (BigDecimal) readProperty("schQty");
	}

	public void setSchQtyUomCode(String schQtyUomCode)
	{
		writeProperty("schQtyUomCode", schQtyUomCode);
	}

	public String getSchQtyUomCode()
	{
		return (String) readProperty("schQtyUomCode");
	}

	public void setSchToDate(Date schToDate)
	{
		writeProperty("schToDate", schToDate);
	}

	public Date getSchToDate()
	{
		return (Date) readProperty("schToDate");
	}

	public void setSendToSap(String sendToSap)
	{
		writeProperty("sendToSap", sendToSap);
	}

	public String getSendToSap()
	{
		return (String) readProperty("sendToSap");
	}

	public void setShipmentNum(Integer shipmentNum)
	{
		writeProperty("shipmentNum", shipmentNum);
	}

	public Integer getShipmentNum()
	{
		return (Integer) readProperty("shipmentNum");
	}

	public void setStatus(Short status)
	{
		writeProperty("status", status);
	}

	public Short getStatus()
	{
		return (Short) readProperty("status");
	}

	public void setStringValue(String stringValue)
	{
		writeProperty("stringValue", stringValue);
	}

	public String getStringValue()
	{
		return (String) readProperty("stringValue");
	}

	public void setT4Consignee(Integer t4Consignee)
	{
		writeProperty("t4Consignee", t4Consignee);
	}

	public Integer getT4Consignee()
	{
		return (Integer) readProperty("t4Consignee");
	}

	public void setT4Loc(String t4Loc)
	{
		writeProperty("t4Loc", t4Loc);
	}

	public String getT4Loc()
	{
		return (String) readProperty("t4Loc");
	}

	public void setT4Tankage(Integer t4Tankage)
	{
		writeProperty("t4Tankage", t4Tankage);
	}

	public Integer getT4Tankage()
	{
		return (Integer) readProperty("t4Tankage");
	}

	public void setTankCode(Integer tankCode)
	{
		writeProperty("tankCode", tankCode);
	}

	public Integer getTankCode()
	{
		return (Integer) readProperty("tankCode");
	}

	public void setTariffCode(String tariffCode)
	{
		writeProperty("tariffCode", tariffCode);
	}

	public String getTariffCode()
	{
		return (String) readProperty("tariffCode");
	}

	public void setTradeNum(Integer tradeNum)
	{
		writeProperty("tradeNum", tradeNum);
	}

	public Integer getTradeNum()
	{
		return (Integer) readProperty("tradeNum");
	}

	public void setTransId(Integer transId)
	{
		writeProperty("transId", transId);
	}

	public Integer getTransId()
	{
		return (Integer) readProperty("transId");
	}

	public void setTransmitallType(String transmitallType)
	{
		writeProperty("transmitallType", transmitallType);
	}

	public String getTransmitallType()
	{
		return (String) readProperty("transmitallType");
	}

	public void setType(String type)
	{
		writeProperty("type", type);
	}

	public String getType()
	{
		return (String) readProperty("type");
	}

}