package com.tc.app.exchangemonitor.model.cayenne.persistent.auto;

import java.util.Date;

import org.apache.cayenne.CayenneDataObject;
import org.apache.cayenne.exp.Property;

/**
 * Class _VAllocItemTransportRev was generated by Cayenne.
 * It is probably a good idea to avoid changing this class manually,
 * since it may be overwritten next time code is regenerated.
 * If you need to make any customizations, please use subclass.
 */
public abstract class _VAllocItemTransportRev extends CayenneDataObject
{

	private static final long serialVersionUID = 1L;

	public static final Property<Short> ALLOC_ITEM_NUM = new Property<Short>("allocItemNum");
	public static final Property<Integer> ALLOC_NUM = new Property<Integer>("allocNum");
	public static final Property<Integer> ASOF_TRANS_ID = new Property<Integer>("asofTransId");
	public static final Property<String> BARGE_NAME = new Property<String>("bargeName");
	public static final Property<String> BL_ACTUAL_IND = new Property<String>("blActualInd");
	public static final Property<Date> BL_DATE = new Property<Date>("blDate");
	public static final Property<Double> BL_NET_QTY = new Property<Double>("blNetQty");
	public static final Property<Double> BL_QTY = new Property<Double>("blQty");
	public static final Property<String> BL_QTY_GROSS_NET_IND = new Property<String>("blQtyGrossNetInd");
	public static final Property<String> BL_QTY_UOM_CODE = new Property<String>("blQtyUomCode");
	public static final Property<Double> BL_SEC_NET_QTY = new Property<Double>("blSecNetQty");
	public static final Property<Double> BL_SEC_QTY = new Property<Double>("blSecQty");
	public static final Property<String> BL_SEC_QTY_UOM_CODE = new Property<String>("blSecQtyUomCode");
	public static final Property<String> BL_TICKET_NUM = new Property<String>("blTicketNum");
	public static final Property<String> CUSTOMS_IMP_EXP_NUM = new Property<String>("customsImpExpNum");
	public static final Property<Date> DECLARATION_DATE = new Property<Date>("declarationDate");
	public static final Property<Date> DISCH_CMNC_DATE = new Property<Date>("dischCmncDate");
	public static final Property<Date> DISCH_COMPL_DATE = new Property<Date>("dischComplDate");
	public static final Property<Double> DISCH_NET_QTY = new Property<Double>("dischNetQty");
	public static final Property<Double> DISCH_QTY = new Property<Double>("dischQty");
	public static final Property<String> DISCH_QTY_GROSS_NET_IND = new Property<String>("dischQtyGrossNetInd");
	public static final Property<String> DISCH_QTY_UOM_CODE = new Property<String>("dischQtyUomCode");
	public static final Property<Double> DISCH_SEC_NET_QTY = new Property<Double>("dischSecNetQty");
	public static final Property<Double> DISCH_SEC_QTY = new Property<Double>("dischSecQty");
	public static final Property<String> DISCH_SEC_QTY_UOM_CODE = new Property<String>("dischSecQtyUomCode");
	public static final Property<Date> ETA_DATE = new Property<Date>("etaDate");
	public static final Property<String> FSC_IND = new Property<String>("fscInd");
	public static final Property<Date> HOSES_CONNECTED_DATE = new Property<Date>("hosesConnectedDate");
	public static final Property<Date> HOSES_DISCONNECTED_DATE = new Property<Date>("hosesDisconnectedDate");
	public static final Property<Date> LAY_DAYS_END_DATE = new Property<Date>("layDaysEndDate");
	public static final Property<Date> LAY_DAYS_START_DATE = new Property<Date>("layDaysStartDate");
	public static final Property<Date> LOAD_CMNC_DATE = new Property<Date>("loadCmncDate");
	public static final Property<Date> LOAD_COMPL_DATE = new Property<Date>("loadComplDate");
	public static final Property<String> LOAD_DISCH_ACTUAL_IND = new Property<String>("loadDischActualInd");
	public static final Property<Date> LOAD_DISCH_DATE = new Property<Date>("loadDischDate");
	public static final Property<String> LOAD_DISCH_TICKET_NUM = new Property<String>("loadDischTicketNum");
	public static final Property<Double> LOAD_NET_QTY = new Property<Double>("loadNetQty");
	public static final Property<Double> LOAD_QTY = new Property<Double>("loadQty");
	public static final Property<String> LOAD_QTY_GROSS_NET_IND = new Property<String>("loadQtyGrossNetInd");
	public static final Property<String> LOAD_QTY_UOM_CODE = new Property<String>("loadQtyUomCode");
	public static final Property<Double> LOAD_SEC_NET_QTY = new Property<Double>("loadSecNetQty");
	public static final Property<Double> LOAD_SEC_QTY = new Property<Double>("loadSecQty");
	public static final Property<String> LOAD_SEC_QTY_UOM_CODE = new Property<String>("loadSecQtyUomCode");
	public static final Property<String> MANUAL_INPUT_SEC_IND = new Property<String>("manualInputSecInd");
	public static final Property<Date> NEGOTIATED_DATE = new Property<Date>("negotiatedDate");
	public static final Property<Date> NOR_DATE = new Property<Date>("norDate");
	public static final Property<String> ORIGIN_COUNTRY_CODE = new Property<String>("originCountryCode");
	public static final Property<String> PARCEL_NUM = new Property<String>("parcelNum");
	public static final Property<Date> PUMP_OFF_DATE = new Property<Date>("pumpOffDate");
	public static final Property<Date> PUMP_ON_DATE = new Property<Date>("pumpOnDate");
	public static final Property<Integer> RESP_TRANS_ID = new Property<Integer>("respTransId");
	public static final Property<Integer> TANK_NUM = new Property<Integer>("tankNum");
	public static final Property<Integer> TRANS_ID = new Property<Integer>("transId");
	public static final Property<Date> TRANSPORT_ARRIVAL_DATE = new Property<Date>("transportArrivalDate");
	public static final Property<Date> TRANSPORT_DEPART_DATE = new Property<Date>("transportDepartDate");
	public static final Property<String> TRANSPORTATION = new Property<String>("transportation");
	public static final Property<String> X_TRANSPORTATION = new Property<String>("xTransportation");

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

	public void setBargeName(String bargeName)
	{
		writeProperty("bargeName", bargeName);
	}

	public String getBargeName()
	{
		return (String) readProperty("bargeName");
	}

	public void setBlActualInd(String blActualInd)
	{
		writeProperty("blActualInd", blActualInd);
	}

	public String getBlActualInd()
	{
		return (String) readProperty("blActualInd");
	}

	public void setBlDate(Date blDate)
	{
		writeProperty("blDate", blDate);
	}

	public Date getBlDate()
	{
		return (Date) readProperty("blDate");
	}

	public void setBlNetQty(Double blNetQty)
	{
		writeProperty("blNetQty", blNetQty);
	}

	public Double getBlNetQty()
	{
		return (Double) readProperty("blNetQty");
	}

	public void setBlQty(Double blQty)
	{
		writeProperty("blQty", blQty);
	}

	public Double getBlQty()
	{
		return (Double) readProperty("blQty");
	}

	public void setBlQtyGrossNetInd(String blQtyGrossNetInd)
	{
		writeProperty("blQtyGrossNetInd", blQtyGrossNetInd);
	}

	public String getBlQtyGrossNetInd()
	{
		return (String) readProperty("blQtyGrossNetInd");
	}

	public void setBlQtyUomCode(String blQtyUomCode)
	{
		writeProperty("blQtyUomCode", blQtyUomCode);
	}

	public String getBlQtyUomCode()
	{
		return (String) readProperty("blQtyUomCode");
	}

	public void setBlSecNetQty(Double blSecNetQty)
	{
		writeProperty("blSecNetQty", blSecNetQty);
	}

	public Double getBlSecNetQty()
	{
		return (Double) readProperty("blSecNetQty");
	}

	public void setBlSecQty(Double blSecQty)
	{
		writeProperty("blSecQty", blSecQty);
	}

	public Double getBlSecQty()
	{
		return (Double) readProperty("blSecQty");
	}

	public void setBlSecQtyUomCode(String blSecQtyUomCode)
	{
		writeProperty("blSecQtyUomCode", blSecQtyUomCode);
	}

	public String getBlSecQtyUomCode()
	{
		return (String) readProperty("blSecQtyUomCode");
	}

	public void setBlTicketNum(String blTicketNum)
	{
		writeProperty("blTicketNum", blTicketNum);
	}

	public String getBlTicketNum()
	{
		return (String) readProperty("blTicketNum");
	}

	public void setCustomsImpExpNum(String customsImpExpNum)
	{
		writeProperty("customsImpExpNum", customsImpExpNum);
	}

	public String getCustomsImpExpNum()
	{
		return (String) readProperty("customsImpExpNum");
	}

	public void setDeclarationDate(Date declarationDate)
	{
		writeProperty("declarationDate", declarationDate);
	}

	public Date getDeclarationDate()
	{
		return (Date) readProperty("declarationDate");
	}

	public void setDischCmncDate(Date dischCmncDate)
	{
		writeProperty("dischCmncDate", dischCmncDate);
	}

	public Date getDischCmncDate()
	{
		return (Date) readProperty("dischCmncDate");
	}

	public void setDischComplDate(Date dischComplDate)
	{
		writeProperty("dischComplDate", dischComplDate);
	}

	public Date getDischComplDate()
	{
		return (Date) readProperty("dischComplDate");
	}

	public void setDischNetQty(Double dischNetQty)
	{
		writeProperty("dischNetQty", dischNetQty);
	}

	public Double getDischNetQty()
	{
		return (Double) readProperty("dischNetQty");
	}

	public void setDischQty(Double dischQty)
	{
		writeProperty("dischQty", dischQty);
	}

	public Double getDischQty()
	{
		return (Double) readProperty("dischQty");
	}

	public void setDischQtyGrossNetInd(String dischQtyGrossNetInd)
	{
		writeProperty("dischQtyGrossNetInd", dischQtyGrossNetInd);
	}

	public String getDischQtyGrossNetInd()
	{
		return (String) readProperty("dischQtyGrossNetInd");
	}

	public void setDischQtyUomCode(String dischQtyUomCode)
	{
		writeProperty("dischQtyUomCode", dischQtyUomCode);
	}

	public String getDischQtyUomCode()
	{
		return (String) readProperty("dischQtyUomCode");
	}

	public void setDischSecNetQty(Double dischSecNetQty)
	{
		writeProperty("dischSecNetQty", dischSecNetQty);
	}

	public Double getDischSecNetQty()
	{
		return (Double) readProperty("dischSecNetQty");
	}

	public void setDischSecQty(Double dischSecQty)
	{
		writeProperty("dischSecQty", dischSecQty);
	}

	public Double getDischSecQty()
	{
		return (Double) readProperty("dischSecQty");
	}

	public void setDischSecQtyUomCode(String dischSecQtyUomCode)
	{
		writeProperty("dischSecQtyUomCode", dischSecQtyUomCode);
	}

	public String getDischSecQtyUomCode()
	{
		return (String) readProperty("dischSecQtyUomCode");
	}

	public void setEtaDate(Date etaDate)
	{
		writeProperty("etaDate", etaDate);
	}

	public Date getEtaDate()
	{
		return (Date) readProperty("etaDate");
	}

	public void setFscInd(String fscInd)
	{
		writeProperty("fscInd", fscInd);
	}

	public String getFscInd()
	{
		return (String) readProperty("fscInd");
	}

	public void setHosesConnectedDate(Date hosesConnectedDate)
	{
		writeProperty("hosesConnectedDate", hosesConnectedDate);
	}

	public Date getHosesConnectedDate()
	{
		return (Date) readProperty("hosesConnectedDate");
	}

	public void setHosesDisconnectedDate(Date hosesDisconnectedDate)
	{
		writeProperty("hosesDisconnectedDate", hosesDisconnectedDate);
	}

	public Date getHosesDisconnectedDate()
	{
		return (Date) readProperty("hosesDisconnectedDate");
	}

	public void setLayDaysEndDate(Date layDaysEndDate)
	{
		writeProperty("layDaysEndDate", layDaysEndDate);
	}

	public Date getLayDaysEndDate()
	{
		return (Date) readProperty("layDaysEndDate");
	}

	public void setLayDaysStartDate(Date layDaysStartDate)
	{
		writeProperty("layDaysStartDate", layDaysStartDate);
	}

	public Date getLayDaysStartDate()
	{
		return (Date) readProperty("layDaysStartDate");
	}

	public void setLoadCmncDate(Date loadCmncDate)
	{
		writeProperty("loadCmncDate", loadCmncDate);
	}

	public Date getLoadCmncDate()
	{
		return (Date) readProperty("loadCmncDate");
	}

	public void setLoadComplDate(Date loadComplDate)
	{
		writeProperty("loadComplDate", loadComplDate);
	}

	public Date getLoadComplDate()
	{
		return (Date) readProperty("loadComplDate");
	}

	public void setLoadDischActualInd(String loadDischActualInd)
	{
		writeProperty("loadDischActualInd", loadDischActualInd);
	}

	public String getLoadDischActualInd()
	{
		return (String) readProperty("loadDischActualInd");
	}

	public void setLoadDischDate(Date loadDischDate)
	{
		writeProperty("loadDischDate", loadDischDate);
	}

	public Date getLoadDischDate()
	{
		return (Date) readProperty("loadDischDate");
	}

	public void setLoadDischTicketNum(String loadDischTicketNum)
	{
		writeProperty("loadDischTicketNum", loadDischTicketNum);
	}

	public String getLoadDischTicketNum()
	{
		return (String) readProperty("loadDischTicketNum");
	}

	public void setLoadNetQty(Double loadNetQty)
	{
		writeProperty("loadNetQty", loadNetQty);
	}

	public Double getLoadNetQty()
	{
		return (Double) readProperty("loadNetQty");
	}

	public void setLoadQty(Double loadQty)
	{
		writeProperty("loadQty", loadQty);
	}

	public Double getLoadQty()
	{
		return (Double) readProperty("loadQty");
	}

	public void setLoadQtyGrossNetInd(String loadQtyGrossNetInd)
	{
		writeProperty("loadQtyGrossNetInd", loadQtyGrossNetInd);
	}

	public String getLoadQtyGrossNetInd()
	{
		return (String) readProperty("loadQtyGrossNetInd");
	}

	public void setLoadQtyUomCode(String loadQtyUomCode)
	{
		writeProperty("loadQtyUomCode", loadQtyUomCode);
	}

	public String getLoadQtyUomCode()
	{
		return (String) readProperty("loadQtyUomCode");
	}

	public void setLoadSecNetQty(Double loadSecNetQty)
	{
		writeProperty("loadSecNetQty", loadSecNetQty);
	}

	public Double getLoadSecNetQty()
	{
		return (Double) readProperty("loadSecNetQty");
	}

	public void setLoadSecQty(Double loadSecQty)
	{
		writeProperty("loadSecQty", loadSecQty);
	}

	public Double getLoadSecQty()
	{
		return (Double) readProperty("loadSecQty");
	}

	public void setLoadSecQtyUomCode(String loadSecQtyUomCode)
	{
		writeProperty("loadSecQtyUomCode", loadSecQtyUomCode);
	}

	public String getLoadSecQtyUomCode()
	{
		return (String) readProperty("loadSecQtyUomCode");
	}

	public void setManualInputSecInd(String manualInputSecInd)
	{
		writeProperty("manualInputSecInd", manualInputSecInd);
	}

	public String getManualInputSecInd()
	{
		return (String) readProperty("manualInputSecInd");
	}

	public void setNegotiatedDate(Date negotiatedDate)
	{
		writeProperty("negotiatedDate", negotiatedDate);
	}

	public Date getNegotiatedDate()
	{
		return (Date) readProperty("negotiatedDate");
	}

	public void setNorDate(Date norDate)
	{
		writeProperty("norDate", norDate);
	}

	public Date getNorDate()
	{
		return (Date) readProperty("norDate");
	}

	public void setOriginCountryCode(String originCountryCode)
	{
		writeProperty("originCountryCode", originCountryCode);
	}

	public String getOriginCountryCode()
	{
		return (String) readProperty("originCountryCode");
	}

	public void setParcelNum(String parcelNum)
	{
		writeProperty("parcelNum", parcelNum);
	}

	public String getParcelNum()
	{
		return (String) readProperty("parcelNum");
	}

	public void setPumpOffDate(Date pumpOffDate)
	{
		writeProperty("pumpOffDate", pumpOffDate);
	}

	public Date getPumpOffDate()
	{
		return (Date) readProperty("pumpOffDate");
	}

	public void setPumpOnDate(Date pumpOnDate)
	{
		writeProperty("pumpOnDate", pumpOnDate);
	}

	public Date getPumpOnDate()
	{
		return (Date) readProperty("pumpOnDate");
	}

	public void setRespTransId(Integer respTransId)
	{
		writeProperty("respTransId", respTransId);
	}

	public Integer getRespTransId()
	{
		return (Integer) readProperty("respTransId");
	}

	public void setTankNum(Integer tankNum)
	{
		writeProperty("tankNum", tankNum);
	}

	public Integer getTankNum()
	{
		return (Integer) readProperty("tankNum");
	}

	public void setTransId(Integer transId)
	{
		writeProperty("transId", transId);
	}

	public Integer getTransId()
	{
		return (Integer) readProperty("transId");
	}

	public void setTransportArrivalDate(Date transportArrivalDate)
	{
		writeProperty("transportArrivalDate", transportArrivalDate);
	}

	public Date getTransportArrivalDate()
	{
		return (Date) readProperty("transportArrivalDate");
	}

	public void setTransportDepartDate(Date transportDepartDate)
	{
		writeProperty("transportDepartDate", transportDepartDate);
	}

	public Date getTransportDepartDate()
	{
		return (Date) readProperty("transportDepartDate");
	}

	public void setTransportation(String transportation)
	{
		writeProperty("transportation", transportation);
	}

	public String getTransportation()
	{
		return (String) readProperty("transportation");
	}

	public void setXTransportation(String xTransportation)
	{
		writeProperty("xTransportation", xTransportation);
	}

	public String getXTransportation()
	{
		return (String) readProperty("xTransportation");
	}

}
