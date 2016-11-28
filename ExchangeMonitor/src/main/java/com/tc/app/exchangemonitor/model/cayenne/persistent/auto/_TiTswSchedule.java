package com.tc.app.exchangemonitor.model.cayenne.persistent.auto;

import java.math.BigDecimal;
import java.util.Date;

import org.apache.cayenne.CayenneDataObject;
import org.apache.cayenne.exp.Property;

import com.tc.app.exchangemonitor.model.cayenne.persistent.TiInboundDataXml;

/**
 * Class _TiTswSchedule was generated by Cayenne.
 * It is probably a good idea to avoid changing this class manually,
 * since it may be overwritten next time code is regenerated.
 * If you need to make any customizations, please use subclass.
 */
public abstract class _TiTswSchedule extends CayenneDataObject
{

	private static final long serialVersionUID = 1L;

	public static final String OID_PK_COLUMN = "oid";

	public static final Property<BigDecimal> ACTUAL_POSTED_QUANTITY = new Property<BigDecimal>("actualPostedQuantity");
	public static final Property<String> ACTUAL_POSTED_QUANTITY_UOM = new Property<String>("actualPostedQuantityUom");
	public static final Property<String> CHANGE_INDICATOR = new Property<String>("changeIndicator");
	public static final Property<String> COMP_MATERIAL1 = new Property<String>("compMaterial1");
	public static final Property<BigDecimal> COMP_MATERIAL1QTY = new Property<BigDecimal>("compMaterial1Qty");
	public static final Property<String> COMP_MATERIAL2 = new Property<String>("compMaterial2");
	public static final Property<BigDecimal> COMP_MATERIAL2QTY = new Property<BigDecimal>("compMaterial2Qty");
	public static final Property<String> COMP_MATERIAL3 = new Property<String>("compMaterial3");
	public static final Property<BigDecimal> COMP_MATERIAL3QTY = new Property<BigDecimal>("compMaterial3Qty");
	public static final Property<String> COMP_MATERIAL4 = new Property<String>("compMaterial4");
	public static final Property<BigDecimal> COMP_MATERIAL4QTY = new Property<BigDecimal>("compMaterial4Qty");
	public static final Property<String> DELETE_INDICATOR = new Property<String>("deleteIndicator");
	public static final Property<String> DEMAND_MATERIAL = new Property<String>("demandMaterial");
	public static final Property<BigDecimal> DISCHARGE_QUANTITY = new Property<BigDecimal>("dischargeQuantity");
	public static final Property<String> DOCUMENT_INDICATOR = new Property<String>("documentIndicator");
	public static final Property<Date> ETL_TIMESTAMP = new Property<Date>("etlTimestamp");
	public static final Property<String> HEADER_DELETE_INDICATOR = new Property<String>("headerDeleteIndicator");
	public static final Property<String> IN_TRANSIT_PLANT = new Property<String>("inTransitPlant");
	public static final Property<BigDecimal> LOAD_QUANTITY = new Property<BigDecimal>("loadQuantity");
	public static final Property<String> LOC_PARTNER_STORAGE_LOC = new Property<String>("locPartnerStorageLoc");
	public static final Property<String> LOCATION_ID = new Property<String>("locationId");
	public static final Property<String> LOCATION_PARTNER_PLANT = new Property<String>("locationPartnerPlant");
	public static final Property<String> NOMIN_HEADER_STATUS = new Property<String>("nominHeaderStatus");
	public static final Property<String> NOMIN_ITEM_PARTIAL_COMPL_FLAG = new Property<String>("nominItemPartialComplFlag");
	public static final Property<String> NOMIN_ITEM_STATUS = new Property<String>("nominItemStatus");
	public static final Property<String> NOMIN_KEY = new Property<String>("nominKey");
	public static final Property<String> NOMIN_KEY_ITEM = new Property<String>("nominKeyItem");
	public static final Property<String> NOMIN_REF_DOC_ITEM = new Property<String>("nominRefDocItem");
	public static final Property<String> NOMIN_REF_DOC_NUM = new Property<String>("nominRefDocNum");
	public static final Property<String> NOMIN_UOM = new Property<String>("nominUom");
	public static final Property<String> PLANNING_LOCATION_FLAG = new Property<String>("planningLocationFlag");
	public static final Property<String> PLANNING_MONTH = new Property<String>("planningMonth");
	public static final Property<String> PW_DEMAND_MATERIAL = new Property<String>("pwDemandMaterial");
	public static final Property<String> PW_LOCATION_ID = new Property<String>("pwLocationId");
	public static final Property<String> PW_SCHEDULE_MATERIAL = new Property<String>("pwScheduleMaterial");
	public static final Property<String> REF_DOC_TYPE = new Property<String>("refDocType");
	public static final Property<String> SAP_DEMAND_MATERIAL = new Property<String>("sapDemandMaterial");
	public static final Property<String> SAP_LOCATION_ID = new Property<String>("sapLocationId");
	public static final Property<String> SAP_SCHEDULE_MATERIAL = new Property<String>("sapScheduleMaterial");
	public static final Property<Date> SCHEDULE_DATE = new Property<Date>("scheduleDate");
	public static final Property<String> SCHEDULE_TYPE = new Property<String>("scheduleType");
	public static final Property<String> SCHEDULED_MATERIAL = new Property<String>("scheduledMaterial");
	public static final Property<BigDecimal> SCHEDULED_QUANTITY = new Property<BigDecimal>("scheduledQuantity");
	public static final Property<String> SCHEDULED_UOM = new Property<String>("scheduledUom");
	public static final Property<String> SHIPPING_TYPE = new Property<String>("shippingType");
	public static final Property<String> STATUS = new Property<String>("status");
	public static final Property<String> TRANSPORT_SYSTEM = new Property<String>("transportSystem");
	public static final Property<String> TRANSPORT_SYSTEM_CARRIER = new Property<String>("transportSystemCarrier");
	public static final Property<TiInboundDataXml> INBOUND_DATA_O = new Property<TiInboundDataXml>("inboundDataO");

	public void setActualPostedQuantity(BigDecimal actualPostedQuantity)
	{
		writeProperty("actualPostedQuantity", actualPostedQuantity);
	}

	public BigDecimal getActualPostedQuantity()
	{
		return (BigDecimal) readProperty("actualPostedQuantity");
	}

	public void setActualPostedQuantityUom(String actualPostedQuantityUom)
	{
		writeProperty("actualPostedQuantityUom", actualPostedQuantityUom);
	}

	public String getActualPostedQuantityUom()
	{
		return (String) readProperty("actualPostedQuantityUom");
	}

	public void setChangeIndicator(String changeIndicator)
	{
		writeProperty("changeIndicator", changeIndicator);
	}

	public String getChangeIndicator()
	{
		return (String) readProperty("changeIndicator");
	}

	public void setCompMaterial1(String compMaterial1)
	{
		writeProperty("compMaterial1", compMaterial1);
	}

	public String getCompMaterial1()
	{
		return (String) readProperty("compMaterial1");
	}

	public void setCompMaterial1Qty(BigDecimal compMaterial1Qty)
	{
		writeProperty("compMaterial1Qty", compMaterial1Qty);
	}

	public BigDecimal getCompMaterial1Qty()
	{
		return (BigDecimal) readProperty("compMaterial1Qty");
	}

	public void setCompMaterial2(String compMaterial2)
	{
		writeProperty("compMaterial2", compMaterial2);
	}

	public String getCompMaterial2()
	{
		return (String) readProperty("compMaterial2");
	}

	public void setCompMaterial2Qty(BigDecimal compMaterial2Qty)
	{
		writeProperty("compMaterial2Qty", compMaterial2Qty);
	}

	public BigDecimal getCompMaterial2Qty()
	{
		return (BigDecimal) readProperty("compMaterial2Qty");
	}

	public void setCompMaterial3(String compMaterial3)
	{
		writeProperty("compMaterial3", compMaterial3);
	}

	public String getCompMaterial3()
	{
		return (String) readProperty("compMaterial3");
	}

	public void setCompMaterial3Qty(BigDecimal compMaterial3Qty)
	{
		writeProperty("compMaterial3Qty", compMaterial3Qty);
	}

	public BigDecimal getCompMaterial3Qty()
	{
		return (BigDecimal) readProperty("compMaterial3Qty");
	}

	public void setCompMaterial4(String compMaterial4)
	{
		writeProperty("compMaterial4", compMaterial4);
	}

	public String getCompMaterial4()
	{
		return (String) readProperty("compMaterial4");
	}

	public void setCompMaterial4Qty(BigDecimal compMaterial4Qty)
	{
		writeProperty("compMaterial4Qty", compMaterial4Qty);
	}

	public BigDecimal getCompMaterial4Qty()
	{
		return (BigDecimal) readProperty("compMaterial4Qty");
	}

	public void setDeleteIndicator(String deleteIndicator)
	{
		writeProperty("deleteIndicator", deleteIndicator);
	}

	public String getDeleteIndicator()
	{
		return (String) readProperty("deleteIndicator");
	}

	public void setDemandMaterial(String demandMaterial)
	{
		writeProperty("demandMaterial", demandMaterial);
	}

	public String getDemandMaterial()
	{
		return (String) readProperty("demandMaterial");
	}

	public void setDischargeQuantity(BigDecimal dischargeQuantity)
	{
		writeProperty("dischargeQuantity", dischargeQuantity);
	}

	public BigDecimal getDischargeQuantity()
	{
		return (BigDecimal) readProperty("dischargeQuantity");
	}

	public void setDocumentIndicator(String documentIndicator)
	{
		writeProperty("documentIndicator", documentIndicator);
	}

	public String getDocumentIndicator()
	{
		return (String) readProperty("documentIndicator");
	}

	public void setEtlTimestamp(Date etlTimestamp)
	{
		writeProperty("etlTimestamp", etlTimestamp);
	}

	public Date getEtlTimestamp()
	{
		return (Date) readProperty("etlTimestamp");
	}

	public void setHeaderDeleteIndicator(String headerDeleteIndicator)
	{
		writeProperty("headerDeleteIndicator", headerDeleteIndicator);
	}

	public String getHeaderDeleteIndicator()
	{
		return (String) readProperty("headerDeleteIndicator");
	}

	public void setInTransitPlant(String inTransitPlant)
	{
		writeProperty("inTransitPlant", inTransitPlant);
	}

	public String getInTransitPlant()
	{
		return (String) readProperty("inTransitPlant");
	}

	public void setLoadQuantity(BigDecimal loadQuantity)
	{
		writeProperty("loadQuantity", loadQuantity);
	}

	public BigDecimal getLoadQuantity()
	{
		return (BigDecimal) readProperty("loadQuantity");
	}

	public void setLocPartnerStorageLoc(String locPartnerStorageLoc)
	{
		writeProperty("locPartnerStorageLoc", locPartnerStorageLoc);
	}

	public String getLocPartnerStorageLoc()
	{
		return (String) readProperty("locPartnerStorageLoc");
	}

	public void setLocationId(String locationId)
	{
		writeProperty("locationId", locationId);
	}

	public String getLocationId()
	{
		return (String) readProperty("locationId");
	}

	public void setLocationPartnerPlant(String locationPartnerPlant)
	{
		writeProperty("locationPartnerPlant", locationPartnerPlant);
	}

	public String getLocationPartnerPlant()
	{
		return (String) readProperty("locationPartnerPlant");
	}

	public void setNominHeaderStatus(String nominHeaderStatus)
	{
		writeProperty("nominHeaderStatus", nominHeaderStatus);
	}

	public String getNominHeaderStatus()
	{
		return (String) readProperty("nominHeaderStatus");
	}

	public void setNominItemPartialComplFlag(String nominItemPartialComplFlag)
	{
		writeProperty("nominItemPartialComplFlag", nominItemPartialComplFlag);
	}

	public String getNominItemPartialComplFlag()
	{
		return (String) readProperty("nominItemPartialComplFlag");
	}

	public void setNominItemStatus(String nominItemStatus)
	{
		writeProperty("nominItemStatus", nominItemStatus);
	}

	public String getNominItemStatus()
	{
		return (String) readProperty("nominItemStatus");
	}

	public void setNominKey(String nominKey)
	{
		writeProperty("nominKey", nominKey);
	}

	public String getNominKey()
	{
		return (String) readProperty("nominKey");
	}

	public void setNominKeyItem(String nominKeyItem)
	{
		writeProperty("nominKeyItem", nominKeyItem);
	}

	public String getNominKeyItem()
	{
		return (String) readProperty("nominKeyItem");
	}

	public void setNominRefDocItem(String nominRefDocItem)
	{
		writeProperty("nominRefDocItem", nominRefDocItem);
	}

	public String getNominRefDocItem()
	{
		return (String) readProperty("nominRefDocItem");
	}

	public void setNominRefDocNum(String nominRefDocNum)
	{
		writeProperty("nominRefDocNum", nominRefDocNum);
	}

	public String getNominRefDocNum()
	{
		return (String) readProperty("nominRefDocNum");
	}

	public void setNominUom(String nominUom)
	{
		writeProperty("nominUom", nominUom);
	}

	public String getNominUom()
	{
		return (String) readProperty("nominUom");
	}

	public void setPlanningLocationFlag(String planningLocationFlag)
	{
		writeProperty("planningLocationFlag", planningLocationFlag);
	}

	public String getPlanningLocationFlag()
	{
		return (String) readProperty("planningLocationFlag");
	}

	public void setPlanningMonth(String planningMonth)
	{
		writeProperty("planningMonth", planningMonth);
	}

	public String getPlanningMonth()
	{
		return (String) readProperty("planningMonth");
	}

	public void setPwDemandMaterial(String pwDemandMaterial)
	{
		writeProperty("pwDemandMaterial", pwDemandMaterial);
	}

	public String getPwDemandMaterial()
	{
		return (String) readProperty("pwDemandMaterial");
	}

	public void setPwLocationId(String pwLocationId)
	{
		writeProperty("pwLocationId", pwLocationId);
	}

	public String getPwLocationId()
	{
		return (String) readProperty("pwLocationId");
	}

	public void setPwScheduleMaterial(String pwScheduleMaterial)
	{
		writeProperty("pwScheduleMaterial", pwScheduleMaterial);
	}

	public String getPwScheduleMaterial()
	{
		return (String) readProperty("pwScheduleMaterial");
	}

	public void setRefDocType(String refDocType)
	{
		writeProperty("refDocType", refDocType);
	}

	public String getRefDocType()
	{
		return (String) readProperty("refDocType");
	}

	public void setSapDemandMaterial(String sapDemandMaterial)
	{
		writeProperty("sapDemandMaterial", sapDemandMaterial);
	}

	public String getSapDemandMaterial()
	{
		return (String) readProperty("sapDemandMaterial");
	}

	public void setSapLocationId(String sapLocationId)
	{
		writeProperty("sapLocationId", sapLocationId);
	}

	public String getSapLocationId()
	{
		return (String) readProperty("sapLocationId");
	}

	public void setSapScheduleMaterial(String sapScheduleMaterial)
	{
		writeProperty("sapScheduleMaterial", sapScheduleMaterial);
	}

	public String getSapScheduleMaterial()
	{
		return (String) readProperty("sapScheduleMaterial");
	}

	public void setScheduleDate(Date scheduleDate)
	{
		writeProperty("scheduleDate", scheduleDate);
	}

	public Date getScheduleDate()
	{
		return (Date) readProperty("scheduleDate");
	}

	public void setScheduleType(String scheduleType)
	{
		writeProperty("scheduleType", scheduleType);
	}

	public String getScheduleType()
	{
		return (String) readProperty("scheduleType");
	}

	public void setScheduledMaterial(String scheduledMaterial)
	{
		writeProperty("scheduledMaterial", scheduledMaterial);
	}

	public String getScheduledMaterial()
	{
		return (String) readProperty("scheduledMaterial");
	}

	public void setScheduledQuantity(BigDecimal scheduledQuantity)
	{
		writeProperty("scheduledQuantity", scheduledQuantity);
	}

	public BigDecimal getScheduledQuantity()
	{
		return (BigDecimal) readProperty("scheduledQuantity");
	}

	public void setScheduledUom(String scheduledUom)
	{
		writeProperty("scheduledUom", scheduledUom);
	}

	public String getScheduledUom()
	{
		return (String) readProperty("scheduledUom");
	}

	public void setShippingType(String shippingType)
	{
		writeProperty("shippingType", shippingType);
	}

	public String getShippingType()
	{
		return (String) readProperty("shippingType");
	}

	public void setStatus(String status)
	{
		writeProperty("status", status);
	}

	public String getStatus()
	{
		return (String) readProperty("status");
	}

	public void setTransportSystem(String transportSystem)
	{
		writeProperty("transportSystem", transportSystem);
	}

	public String getTransportSystem()
	{
		return (String) readProperty("transportSystem");
	}

	public void setTransportSystemCarrier(String transportSystemCarrier)
	{
		writeProperty("transportSystemCarrier", transportSystemCarrier);
	}

	public String getTransportSystemCarrier()
	{
		return (String) readProperty("transportSystemCarrier");
	}

	public void setInboundDataO(TiInboundDataXml inboundDataO)
	{
		setToOneTarget("inboundDataO", inboundDataO, true);
	}

	public TiInboundDataXml getInboundDataO()
	{
		return (TiInboundDataXml) readProperty("inboundDataO");
	}

}