package com.tc.app.exchangemonitor.model.cayenne.persistent.auto;

import java.math.BigDecimal;
import java.util.Date;
import java.util.List;

import org.apache.cayenne.CayenneDataObject;
import org.apache.cayenne.exp.Property;

import com.tc.app.exchangemonitor.model.cayenne.persistent.AgNominationLineItem;
import com.tc.app.exchangemonitor.model.cayenne.persistent.AgScheduleLineItem;
import com.tc.app.exchangemonitor.model.cayenne.persistent.Commodity;
import com.tc.app.exchangemonitor.model.cayenne.persistent.Facility;
import com.tc.app.exchangemonitor.model.cayenne.persistent.IctsUser;
import com.tc.app.exchangemonitor.model.cayenne.persistent.Location;
import com.tc.app.exchangemonitor.model.cayenne.persistent.MotType;
import com.tc.app.exchangemonitor.model.cayenne.persistent.ParcelStatus;
import com.tc.app.exchangemonitor.model.cayenne.persistent.PmTypeBRecord;
import com.tc.app.exchangemonitor.model.cayenne.persistent.Uom;

/**
 * Class _Parcel was generated by Cayenne.
 * It is probably a good idea to avoid changing this class manually,
 * since it may be overwritten next time code is regenerated.
 * If you need to make any customizations, please use subclass.
 */
public abstract class _Parcel extends CayenneDataObject
{

	private static final long serialVersionUID = 1L;

	public static final String OID_PK_COLUMN = "oid";

	public static final Property<Short> ALLOC_ITEM_NUM = new Property<>("allocItemNum");
	public static final Property<Integer> ALLOC_NUM = new Property<>("allocNum");
	public static final Property<Short> ASSOCIATIVE_STATE = new Property<>("associativeState");
	public static final Property<Integer> BOOKCO_BANK_ACCT_NUM = new Property<>("bookcoBankAcctNum");
	public static final Property<Integer> CMNT_NUM = new Property<>("cmntNum");
	public static final Property<Date> CREATION_DATE = new Property<>("creationDate");
	public static final Property<String> CUSTOM_CODE = new Property<>("customCode");
	public static final Property<String> CUSTOM_STATUS = new Property<>("customStatus");
	public static final Property<Date> ESTIMATED_DATE = new Property<>("estimatedDate");
	public static final Property<String> EXCISE_STATUS = new Property<>("exciseStatus");
	public static final Property<Double> FLOAT_VALUE = new Property<>("floatValue");
	public static final Property<Integer> FORECAST_NUM = new Property<>("forecastNum");
	public static final Property<String> GN_TARIC_CODE = new Property<>("gnTaricCode");
	public static final Property<String> GRADE = new Property<>("grade");
	public static final Property<String> INSPECTOR = new Property<>("inspector");
	public static final Property<Integer> INT_VALUE = new Property<>("intValue");
	public static final Property<Integer> INV_NUM = new Property<>("invNum");
	public static final Property<Short> ITEM_NUM = new Property<>("itemNum");
	public static final Property<Date> LAST_UPDATE_DATE = new Property<>("lastUpdateDate");
	public static final Property<String> LATEST_FEED_NAME = new Property<>("latestFeedName");
	public static final Property<BigDecimal> NOMIN_QTY = new Property<>("nominQty");
	public static final Property<Short> ORDER_NUM = new Property<>("orderNum");
	public static final Property<String> QUALITY = new Property<>("quality");
	public static final Property<Integer> REAL_PORT_NUM = new Property<>("realPortNum");
	public static final Property<String> REFERENCE = new Property<>("reference");
	public static final Property<Date> SCH_FROM_DATE = new Property<>("schFromDate");
	public static final Property<BigDecimal> SCH_QTY = new Property<>("schQty");
	public static final Property<Date> SCH_TO_DATE = new Property<>("schToDate");
	public static final Property<String> SEND_TO_SAP = new Property<>("sendToSap");
	public static final Property<Integer> SHIPMENT_NUM = new Property<>("shipmentNum");
	public static final Property<String> STRING_VALUE = new Property<>("stringValue");
	public static final Property<Integer> T4CONSIGNEE = new Property<>("t4Consignee");
	public static final Property<String> T4LOC = new Property<>("t4Loc");
	public static final Property<Integer> T4TANKAGE = new Property<>("t4Tankage");
	public static final Property<Integer> TANK_CODE = new Property<>("tankCode");
	public static final Property<String> TARIFF_CODE = new Property<>("tariffCode");
	public static final Property<Integer> TRADE_NUM = new Property<>("tradeNum");
	public static final Property<Integer> TRANS_ID = new Property<>("transId");
	public static final Property<String> TRANSMITALL_TYPE = new Property<>("transmitallType");
	public static final Property<String> TYPE = new Property<>("type");
	public static final Property<List<AgNominationLineItem>> AG_NOMINATION_LINE_ITEMS = new Property<>("agNominationLineItems");
	public static final Property<List<AgScheduleLineItem>> AG_SCHEDULE_LINE_ITEMS = new Property<>("agScheduleLineItems");
	public static final Property<Commodity> COMMODITY = new Property<>("commodity");
	public static final Property<Commodity> COMMODITY1 = new Property<>("commodity1");
	public static final Property<Facility> FACILITY = new Property<>("facility");
	public static final Property<IctsUser> ICTS_USER = new Property<>("ictsUser");
	public static final Property<IctsUser> ICTS_USER1 = new Property<>("ictsUser1");
	public static final Property<Location> LOCATION = new Property<>("location");
	public static final Property<MotType> MOT_TYPE = new Property<>("motType");
	public static final Property<ParcelStatus> PARCEL_STATUS = new Property<>("parcelStatus");
	public static final Property<List<PmTypeBRecord>> PM_TYPE_BRECORDS = new Property<>("pmTypeBRecords");
	public static final Property<Uom> UOM = new Property<>("uom");
	public static final Property<Uom> UOM1 = new Property<>("uom1");

	public void setAllocItemNum(final Short allocItemNum)
	{
		this.writeProperty("allocItemNum", allocItemNum);
	}

	public Short getAllocItemNum()
	{
		return (Short) this.readProperty("allocItemNum");
	}

	public void setAllocNum(final Integer allocNum)
	{
		this.writeProperty("allocNum", allocNum);
	}

	public Integer getAllocNum()
	{
		return (Integer) this.readProperty("allocNum");
	}

	public void setAssociativeState(final Short associativeState)
	{
		this.writeProperty("associativeState", associativeState);
	}

	public Short getAssociativeState()
	{
		return (Short) this.readProperty("associativeState");
	}

	public void setBookcoBankAcctNum(final Integer bookcoBankAcctNum)
	{
		this.writeProperty("bookcoBankAcctNum", bookcoBankAcctNum);
	}

	public Integer getBookcoBankAcctNum()
	{
		return (Integer) this.readProperty("bookcoBankAcctNum");
	}

	public void setCmntNum(final Integer cmntNum)
	{
		this.writeProperty("cmntNum", cmntNum);
	}

	public Integer getCmntNum()
	{
		return (Integer) this.readProperty("cmntNum");
	}

	public void setCreationDate(final Date creationDate)
	{
		this.writeProperty("creationDate", creationDate);
	}

	public Date getCreationDate()
	{
		return (Date) this.readProperty("creationDate");
	}

	public void setCustomCode(final String customCode)
	{
		this.writeProperty("customCode", customCode);
	}

	public String getCustomCode()
	{
		return (String) this.readProperty("customCode");
	}

	public void setCustomStatus(final String customStatus)
	{
		this.writeProperty("customStatus", customStatus);
	}

	public String getCustomStatus()
	{
		return (String) this.readProperty("customStatus");
	}

	public void setEstimatedDate(final Date estimatedDate)
	{
		this.writeProperty("estimatedDate", estimatedDate);
	}

	public Date getEstimatedDate()
	{
		return (Date) this.readProperty("estimatedDate");
	}

	public void setExciseStatus(final String exciseStatus)
	{
		this.writeProperty("exciseStatus", exciseStatus);
	}

	public String getExciseStatus()
	{
		return (String) this.readProperty("exciseStatus");
	}

	public void setFloatValue(final Double floatValue)
	{
		this.writeProperty("floatValue", floatValue);
	}

	public Double getFloatValue()
	{
		return (Double) this.readProperty("floatValue");
	}

	public void setForecastNum(final Integer forecastNum)
	{
		this.writeProperty("forecastNum", forecastNum);
	}

	public Integer getForecastNum()
	{
		return (Integer) this.readProperty("forecastNum");
	}

	public void setGnTaricCode(final String gnTaricCode)
	{
		this.writeProperty("gnTaricCode", gnTaricCode);
	}

	public String getGnTaricCode()
	{
		return (String) this.readProperty("gnTaricCode");
	}

	public void setGrade(final String grade)
	{
		this.writeProperty("grade", grade);
	}

	public String getGrade()
	{
		return (String) this.readProperty("grade");
	}

	public void setInspector(final String inspector)
	{
		this.writeProperty("inspector", inspector);
	}

	public String getInspector()
	{
		return (String) this.readProperty("inspector");
	}

	public void setIntValue(final Integer intValue)
	{
		this.writeProperty("intValue", intValue);
	}

	public Integer getIntValue()
	{
		return (Integer) this.readProperty("intValue");
	}

	public void setInvNum(final Integer invNum)
	{
		this.writeProperty("invNum", invNum);
	}

	public Integer getInvNum()
	{
		return (Integer) this.readProperty("invNum");
	}

	public void setItemNum(final Short itemNum)
	{
		this.writeProperty("itemNum", itemNum);
	}

	public Short getItemNum()
	{
		return (Short) this.readProperty("itemNum");
	}

	public void setLastUpdateDate(final Date lastUpdateDate)
	{
		this.writeProperty("lastUpdateDate", lastUpdateDate);
	}

	public Date getLastUpdateDate()
	{
		return (Date) this.readProperty("lastUpdateDate");
	}

	public void setLatestFeedName(final String latestFeedName)
	{
		this.writeProperty("latestFeedName", latestFeedName);
	}

	public String getLatestFeedName()
	{
		return (String) this.readProperty("latestFeedName");
	}

	public void setNominQty(final BigDecimal nominQty)
	{
		this.writeProperty("nominQty", nominQty);
	}

	public BigDecimal getNominQty()
	{
		return (BigDecimal) this.readProperty("nominQty");
	}

	public void setOrderNum(final Short orderNum)
	{
		this.writeProperty("orderNum", orderNum);
	}

	public Short getOrderNum()
	{
		return (Short) this.readProperty("orderNum");
	}

	public void setQuality(final String quality)
	{
		this.writeProperty("quality", quality);
	}

	public String getQuality()
	{
		return (String) this.readProperty("quality");
	}

	public void setRealPortNum(final Integer realPortNum)
	{
		this.writeProperty("realPortNum", realPortNum);
	}

	public Integer getRealPortNum()
	{
		return (Integer) this.readProperty("realPortNum");
	}

	public void setReference(final String reference)
	{
		this.writeProperty("reference", reference);
	}

	public String getReference()
	{
		return (String) this.readProperty("reference");
	}

	public void setSchFromDate(final Date schFromDate)
	{
		this.writeProperty("schFromDate", schFromDate);
	}

	public Date getSchFromDate()
	{
		return (Date) this.readProperty("schFromDate");
	}

	public void setSchQty(final BigDecimal schQty)
	{
		this.writeProperty("schQty", schQty);
	}

	public BigDecimal getSchQty()
	{
		return (BigDecimal) this.readProperty("schQty");
	}

	public void setSchToDate(final Date schToDate)
	{
		this.writeProperty("schToDate", schToDate);
	}

	public Date getSchToDate()
	{
		return (Date) this.readProperty("schToDate");
	}

	public void setSendToSap(final String sendToSap)
	{
		this.writeProperty("sendToSap", sendToSap);
	}

	public String getSendToSap()
	{
		return (String) this.readProperty("sendToSap");
	}

	public void setShipmentNum(final Integer shipmentNum)
	{
		this.writeProperty("shipmentNum", shipmentNum);
	}

	public Integer getShipmentNum()
	{
		return (Integer) this.readProperty("shipmentNum");
	}

	public void setStringValue(final String stringValue)
	{
		this.writeProperty("stringValue", stringValue);
	}

	public String getStringValue()
	{
		return (String) this.readProperty("stringValue");
	}

	public void setT4Consignee(final Integer t4Consignee)
	{
		this.writeProperty("t4Consignee", t4Consignee);
	}

	public Integer getT4Consignee()
	{
		return (Integer) this.readProperty("t4Consignee");
	}

	public void setT4Loc(final String t4Loc)
	{
		this.writeProperty("t4Loc", t4Loc);
	}

	public String getT4Loc()
	{
		return (String) this.readProperty("t4Loc");
	}

	public void setT4Tankage(final Integer t4Tankage)
	{
		this.writeProperty("t4Tankage", t4Tankage);
	}

	public Integer getT4Tankage()
	{
		return (Integer) this.readProperty("t4Tankage");
	}

	public void setTankCode(final Integer tankCode)
	{
		this.writeProperty("tankCode", tankCode);
	}

	public Integer getTankCode()
	{
		return (Integer) this.readProperty("tankCode");
	}

	public void setTariffCode(final String tariffCode)
	{
		this.writeProperty("tariffCode", tariffCode);
	}

	public String getTariffCode()
	{
		return (String) this.readProperty("tariffCode");
	}

	public void setTradeNum(final Integer tradeNum)
	{
		this.writeProperty("tradeNum", tradeNum);
	}

	public Integer getTradeNum()
	{
		return (Integer) this.readProperty("tradeNum");
	}

	public void setTransId(final Integer transId)
	{
		this.writeProperty("transId", transId);
	}

	public Integer getTransId()
	{
		return (Integer) this.readProperty("transId");
	}

	public void setTransmitallType(final String transmitallType)
	{
		this.writeProperty("transmitallType", transmitallType);
	}

	public String getTransmitallType()
	{
		return (String) this.readProperty("transmitallType");
	}

	public void setType(final String type)
	{
		this.writeProperty("type", type);
	}

	public String getType()
	{
		return (String) this.readProperty("type");
	}

	public void addToAgNominationLineItems(final AgNominationLineItem obj)
	{
		this.addToManyTarget("agNominationLineItems", obj, true);
	}

	public void removeFromAgNominationLineItems(final AgNominationLineItem obj)
	{
		this.removeToManyTarget("agNominationLineItems", obj, true);
	}

	@SuppressWarnings("unchecked")
	public List<AgNominationLineItem> getAgNominationLineItems()
	{
		return (List<AgNominationLineItem>) this.readProperty("agNominationLineItems");
	}

	public void addToAgScheduleLineItems(final AgScheduleLineItem obj)
	{
		this.addToManyTarget("agScheduleLineItems", obj, true);
	}

	public void removeFromAgScheduleLineItems(final AgScheduleLineItem obj)
	{
		this.removeToManyTarget("agScheduleLineItems", obj, true);
	}

	@SuppressWarnings("unchecked")
	public List<AgScheduleLineItem> getAgScheduleLineItems()
	{
		return (List<AgScheduleLineItem>) this.readProperty("agScheduleLineItems");
	}

	public void setCommodity(final Commodity commodity)
	{
		this.setToOneTarget("commodity", commodity, true);
	}

	public Commodity getCommodity()
	{
		return (Commodity) this.readProperty("commodity");
	}

	public void setCommodity1(final Commodity commodity1)
	{
		this.setToOneTarget("commodity1", commodity1, true);
	}

	public Commodity getCommodity1()
	{
		return (Commodity) this.readProperty("commodity1");
	}

	public void setFacility(final Facility facility)
	{
		this.setToOneTarget("facility", facility, true);
	}

	public Facility getFacility()
	{
		return (Facility) this.readProperty("facility");
	}

	public void setIctsUser(final IctsUser ictsUser)
	{
		this.setToOneTarget("ictsUser", ictsUser, true);
	}

	public IctsUser getIctsUser()
	{
		return (IctsUser) this.readProperty("ictsUser");
	}

	public void setIctsUser1(final IctsUser ictsUser1)
	{
		this.setToOneTarget("ictsUser1", ictsUser1, true);
	}

	public IctsUser getIctsUser1()
	{
		return (IctsUser) this.readProperty("ictsUser1");
	}

	public void setLocation(final Location location)
	{
		this.setToOneTarget("location", location, true);
	}

	public Location getLocation()
	{
		return (Location) this.readProperty("location");
	}

	public void setMotType(final MotType motType)
	{
		this.setToOneTarget("motType", motType, true);
	}

	public MotType getMotType()
	{
		return (MotType) this.readProperty("motType");
	}

	public void setParcelStatus(final ParcelStatus parcelStatus)
	{
		this.setToOneTarget("parcelStatus", parcelStatus, true);
	}

	public ParcelStatus getParcelStatus()
	{
		return (ParcelStatus) this.readProperty("parcelStatus");
	}

	public void addToPmTypeBRecords(final PmTypeBRecord obj)
	{
		this.addToManyTarget("pmTypeBRecords", obj, true);
	}

	public void removeFromPmTypeBRecords(final PmTypeBRecord obj)
	{
		this.removeToManyTarget("pmTypeBRecords", obj, true);
	}

	@SuppressWarnings("unchecked")
	public List<PmTypeBRecord> getPmTypeBRecords()
	{
		return (List<PmTypeBRecord>) this.readProperty("pmTypeBRecords");
	}

	public void setUom(final Uom uom)
	{
		this.setToOneTarget("uom", uom, true);
	}

	public Uom getUom()
	{
		return (Uom) this.readProperty("uom");
	}

	public void setUom1(final Uom uom1)
	{
		this.setToOneTarget("uom1", uom1, true);
	}

	public Uom getUom1()
	{
		return (Uom) this.readProperty("uom1");
	}

}