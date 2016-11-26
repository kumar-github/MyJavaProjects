package com.tc.app.exchangemonitor.model.cayenne.persistent.auto;

import java.math.BigDecimal;
import java.util.Date;
import java.util.List;

import org.apache.cayenne.CayenneDataObject;
import org.apache.cayenne.exp.Property;

import com.tc.app.exchangemonitor.model.cayenne.persistent.AgCustodyTicket;
import com.tc.app.exchangemonitor.model.cayenne.persistent.AgTruckShipperStmt;
import com.tc.app.exchangemonitor.model.cayenne.persistent.Location;
import com.tc.app.exchangemonitor.model.cayenne.persistent.Mot;
import com.tc.app.exchangemonitor.model.cayenne.persistent.Uom;

/**
 * Class _AiEstActual was generated by Cayenne.
 * It is probably a good idea to avoid changing this class manually,
 * since it may be overwritten next time code is regenerated.
 * If you need to make any customizations, please use subclass.
 */
public abstract class _AiEstActual extends CayenneDataObject
{

	private static final long serialVersionUID = 1L;

	public static final String AI_EST_ACTUAL_NUM_PK_COLUMN = "ai_est_actual_num";
	public static final String ALLOC_ITEM_NUM_PK_COLUMN = "alloc_item_num";
	public static final String ALLOC_NUM_PK_COLUMN = "alloc_num";

	public static final Property<Integer> ACCUM_NUM = new Property<>("accumNum");
	public static final Property<BigDecimal> ACTUAL_TAX_M315QTY = new Property<>("actualTaxM315Qty");
	public static final Property<BigDecimal> ACTUAL_TAX_MT_QTY = new Property<>("actualTaxMtQty");
	public static final Property<Short> ACTUAL_TIMEZONE = new Property<>("actualTimezone");
	public static final Property<Date> AI_EST_ACTUAL_DATE = new Property<>("aiEstActualDate");
	public static final Property<Double> AI_EST_ACTUAL_GROSS_QTY = new Property<>("aiEstActualGrossQty");
	public static final Property<String> AI_EST_ACTUAL_IND = new Property<>("aiEstActualInd");
	public static final Property<Double> AI_EST_ACTUAL_NET_QTY = new Property<>("aiEstActualNetQty");
	public static final Property<String> AI_EST_ACTUAL_SHORT_CMNT = new Property<>("aiEstActualShortCmnt");
	public static final Property<String> ASSAY_FINAL_IND = new Property<>("assayFinalInd");
	public static final Property<String> BOL_CODE = new Property<>("bolCode");
	public static final Property<Integer> DEST_TRADE_NUM = new Property<>("destTradeNum");
	public static final Property<String> FIXED_SWING_QTY_IND = new Property<>("fixedSwingQtyInd");
	public static final Property<Integer> INSERT_SEQUENCE = new Property<>("insertSequence");
	public static final Property<Integer> LEASE_NUM = new Property<>("leaseNum");
	public static final Property<String> MANUAL_INPUT_SEC_IND = new Property<>("manualInputSecInd");
	public static final Property<String> OWNER_CODE = new Property<>("ownerCode");
	public static final Property<String> SAP_POSITION_NUM = new Property<>("sapPositionNum");
	public static final Property<String> SCAC_CARRIER_CODE = new Property<>("scacCarrierCode");
	public static final Property<Double> SECONDARY_ACTUAL_GROSS_QTY = new Property<>("secondaryActualGrossQty");
	public static final Property<Double> SECONDARY_ACTUAL_NET_QTY = new Property<>("secondaryActualNetQty");
	public static final Property<Date> START_LOAD_DATE = new Property<>("startLoadDate");
	public static final Property<Date> STOP_LOAD_DATE = new Property<>("stopLoadDate");
	public static final Property<BigDecimal> TERTIARY_GROSS_QTY = new Property<>("tertiaryGrossQty");
	public static final Property<BigDecimal> TERTIARY_NET_QTY = new Property<>("tertiaryNetQty");
	public static final Property<String> TICKET_NUM = new Property<>("ticketNum");
	public static final Property<Integer> TRANS_ID = new Property<>("transId");
	public static final Property<String> TRANSPORTER_CODE = new Property<>("transporterCode");
	public static final Property<List<AgCustodyTicket>> AG_CUSTODY_TICKETS = new Property<>("agCustodyTickets");
	public static final Property<List<AgCustodyTicket>> AG_CUSTODY_TICKETS1 = new Property<>("agCustodyTickets1");
	public static final Property<List<AgCustodyTicket>> AG_CUSTODY_TICKETS2 = new Property<>("agCustodyTickets2");
	public static final Property<List<AgTruckShipperStmt>> AG_TRUCK_SHIPPER_STMTS = new Property<>("agTruckShipperStmts");
	public static final Property<List<AgTruckShipperStmt>> AG_TRUCK_SHIPPER_STMTS1 = new Property<>("agTruckShipperStmts1");
	public static final Property<List<AgTruckShipperStmt>> AG_TRUCK_SHIPPER_STMTS2 = new Property<>("agTruckShipperStmts2");
	public static final Property<Location> LOCATION = new Property<>("location");
	public static final Property<Mot> MOT = new Property<>("mot");
	public static final Property<Uom> UOM = new Property<>("uom");
	public static final Property<Uom> UOM1 = new Property<>("uom1");
	public static final Property<Uom> UOM2 = new Property<>("uom2");
	public static final Property<Uom> UOM3 = new Property<>("uom3");

	public void setAccumNum(final Integer accumNum)
	{
		this.writeProperty("accumNum", accumNum);
	}

	public Integer getAccumNum()
	{
		return (Integer) this.readProperty("accumNum");
	}

	public void setActualTaxM315Qty(final BigDecimal actualTaxM315Qty)
	{
		this.writeProperty("actualTaxM315Qty", actualTaxM315Qty);
	}

	public BigDecimal getActualTaxM315Qty()
	{
		return (BigDecimal) this.readProperty("actualTaxM315Qty");
	}

	public void setActualTaxMtQty(final BigDecimal actualTaxMtQty)
	{
		this.writeProperty("actualTaxMtQty", actualTaxMtQty);
	}

	public BigDecimal getActualTaxMtQty()
	{
		return (BigDecimal) this.readProperty("actualTaxMtQty");
	}

	public void setActualTimezone(final Short actualTimezone)
	{
		this.writeProperty("actualTimezone", actualTimezone);
	}

	public Short getActualTimezone()
	{
		return (Short) this.readProperty("actualTimezone");
	}

	public void setAiEstActualDate(final Date aiEstActualDate)
	{
		this.writeProperty("aiEstActualDate", aiEstActualDate);
	}

	public Date getAiEstActualDate()
	{
		return (Date) this.readProperty("aiEstActualDate");
	}

	public void setAiEstActualGrossQty(final Double aiEstActualGrossQty)
	{
		this.writeProperty("aiEstActualGrossQty", aiEstActualGrossQty);
	}

	public Double getAiEstActualGrossQty()
	{
		return (Double) this.readProperty("aiEstActualGrossQty");
	}

	public void setAiEstActualInd(final String aiEstActualInd)
	{
		this.writeProperty("aiEstActualInd", aiEstActualInd);
	}

	public String getAiEstActualInd()
	{
		return (String) this.readProperty("aiEstActualInd");
	}

	public void setAiEstActualNetQty(final Double aiEstActualNetQty)
	{
		this.writeProperty("aiEstActualNetQty", aiEstActualNetQty);
	}

	public Double getAiEstActualNetQty()
	{
		return (Double) this.readProperty("aiEstActualNetQty");
	}

	public void setAiEstActualShortCmnt(final String aiEstActualShortCmnt)
	{
		this.writeProperty("aiEstActualShortCmnt", aiEstActualShortCmnt);
	}

	public String getAiEstActualShortCmnt()
	{
		return (String) this.readProperty("aiEstActualShortCmnt");
	}

	public void setAssayFinalInd(final String assayFinalInd)
	{
		this.writeProperty("assayFinalInd", assayFinalInd);
	}

	public String getAssayFinalInd()
	{
		return (String) this.readProperty("assayFinalInd");
	}

	public void setBolCode(final String bolCode)
	{
		this.writeProperty("bolCode", bolCode);
	}

	public String getBolCode()
	{
		return (String) this.readProperty("bolCode");
	}

	public void setDestTradeNum(final Integer destTradeNum)
	{
		this.writeProperty("destTradeNum", destTradeNum);
	}

	public Integer getDestTradeNum()
	{
		return (Integer) this.readProperty("destTradeNum");
	}

	public void setFixedSwingQtyInd(final String fixedSwingQtyInd)
	{
		this.writeProperty("fixedSwingQtyInd", fixedSwingQtyInd);
	}

	public String getFixedSwingQtyInd()
	{
		return (String) this.readProperty("fixedSwingQtyInd");
	}

	public void setInsertSequence(final Integer insertSequence)
	{
		this.writeProperty("insertSequence", insertSequence);
	}

	public Integer getInsertSequence()
	{
		return (Integer) this.readProperty("insertSequence");
	}

	public void setLeaseNum(final Integer leaseNum)
	{
		this.writeProperty("leaseNum", leaseNum);
	}

	public Integer getLeaseNum()
	{
		return (Integer) this.readProperty("leaseNum");
	}

	public void setManualInputSecInd(final String manualInputSecInd)
	{
		this.writeProperty("manualInputSecInd", manualInputSecInd);
	}

	public String getManualInputSecInd()
	{
		return (String) this.readProperty("manualInputSecInd");
	}

	public void setOwnerCode(final String ownerCode)
	{
		this.writeProperty("ownerCode", ownerCode);
	}

	public String getOwnerCode()
	{
		return (String) this.readProperty("ownerCode");
	}

	public void setSapPositionNum(final String sapPositionNum)
	{
		this.writeProperty("sapPositionNum", sapPositionNum);
	}

	public String getSapPositionNum()
	{
		return (String) this.readProperty("sapPositionNum");
	}

	public void setScacCarrierCode(final String scacCarrierCode)
	{
		this.writeProperty("scacCarrierCode", scacCarrierCode);
	}

	public String getScacCarrierCode()
	{
		return (String) this.readProperty("scacCarrierCode");
	}

	public void setSecondaryActualGrossQty(final Double secondaryActualGrossQty)
	{
		this.writeProperty("secondaryActualGrossQty", secondaryActualGrossQty);
	}

	public Double getSecondaryActualGrossQty()
	{
		return (Double) this.readProperty("secondaryActualGrossQty");
	}

	public void setSecondaryActualNetQty(final Double secondaryActualNetQty)
	{
		this.writeProperty("secondaryActualNetQty", secondaryActualNetQty);
	}

	public Double getSecondaryActualNetQty()
	{
		return (Double) this.readProperty("secondaryActualNetQty");
	}

	public void setStartLoadDate(final Date startLoadDate)
	{
		this.writeProperty("startLoadDate", startLoadDate);
	}

	public Date getStartLoadDate()
	{
		return (Date) this.readProperty("startLoadDate");
	}

	public void setStopLoadDate(final Date stopLoadDate)
	{
		this.writeProperty("stopLoadDate", stopLoadDate);
	}

	public Date getStopLoadDate()
	{
		return (Date) this.readProperty("stopLoadDate");
	}

	public void setTertiaryGrossQty(final BigDecimal tertiaryGrossQty)
	{
		this.writeProperty("tertiaryGrossQty", tertiaryGrossQty);
	}

	public BigDecimal getTertiaryGrossQty()
	{
		return (BigDecimal) this.readProperty("tertiaryGrossQty");
	}

	public void setTertiaryNetQty(final BigDecimal tertiaryNetQty)
	{
		this.writeProperty("tertiaryNetQty", tertiaryNetQty);
	}

	public BigDecimal getTertiaryNetQty()
	{
		return (BigDecimal) this.readProperty("tertiaryNetQty");
	}

	public void setTicketNum(final String ticketNum)
	{
		this.writeProperty("ticketNum", ticketNum);
	}

	public String getTicketNum()
	{
		return (String) this.readProperty("ticketNum");
	}

	public void setTransId(final Integer transId)
	{
		this.writeProperty("transId", transId);
	}

	public Integer getTransId()
	{
		return (Integer) this.readProperty("transId");
	}

	public void setTransporterCode(final String transporterCode)
	{
		this.writeProperty("transporterCode", transporterCode);
	}

	public String getTransporterCode()
	{
		return (String) this.readProperty("transporterCode");
	}

	public void addToAgCustodyTickets(final AgCustodyTicket obj)
	{
		this.addToManyTarget("agCustodyTickets", obj, true);
	}

	public void removeFromAgCustodyTickets(final AgCustodyTicket obj)
	{
		this.removeToManyTarget("agCustodyTickets", obj, true);
	}

	@SuppressWarnings("unchecked")
	public List<AgCustodyTicket> getAgCustodyTickets()
	{
		return (List<AgCustodyTicket>) this.readProperty("agCustodyTickets");
	}

	public void addToAgCustodyTickets1(final AgCustodyTicket obj)
	{
		this.addToManyTarget("agCustodyTickets1", obj, true);
	}

	public void removeFromAgCustodyTickets1(final AgCustodyTicket obj)
	{
		this.removeToManyTarget("agCustodyTickets1", obj, true);
	}

	@SuppressWarnings("unchecked")
	public List<AgCustodyTicket> getAgCustodyTickets1()
	{
		return (List<AgCustodyTicket>) this.readProperty("agCustodyTickets1");
	}

	public void addToAgCustodyTickets2(final AgCustodyTicket obj)
	{
		this.addToManyTarget("agCustodyTickets2", obj, true);
	}

	public void removeFromAgCustodyTickets2(final AgCustodyTicket obj)
	{
		this.removeToManyTarget("agCustodyTickets2", obj, true);
	}

	@SuppressWarnings("unchecked")
	public List<AgCustodyTicket> getAgCustodyTickets2()
	{
		return (List<AgCustodyTicket>) this.readProperty("agCustodyTickets2");
	}

	public void addToAgTruckShipperStmts(final AgTruckShipperStmt obj)
	{
		this.addToManyTarget("agTruckShipperStmts", obj, true);
	}

	public void removeFromAgTruckShipperStmts(final AgTruckShipperStmt obj)
	{
		this.removeToManyTarget("agTruckShipperStmts", obj, true);
	}

	@SuppressWarnings("unchecked")
	public List<AgTruckShipperStmt> getAgTruckShipperStmts()
	{
		return (List<AgTruckShipperStmt>) this.readProperty("agTruckShipperStmts");
	}

	public void addToAgTruckShipperStmts1(final AgTruckShipperStmt obj)
	{
		this.addToManyTarget("agTruckShipperStmts1", obj, true);
	}

	public void removeFromAgTruckShipperStmts1(final AgTruckShipperStmt obj)
	{
		this.removeToManyTarget("agTruckShipperStmts1", obj, true);
	}

	@SuppressWarnings("unchecked")
	public List<AgTruckShipperStmt> getAgTruckShipperStmts1()
	{
		return (List<AgTruckShipperStmt>) this.readProperty("agTruckShipperStmts1");
	}

	public void addToAgTruckShipperStmts2(final AgTruckShipperStmt obj)
	{
		this.addToManyTarget("agTruckShipperStmts2", obj, true);
	}

	public void removeFromAgTruckShipperStmts2(final AgTruckShipperStmt obj)
	{
		this.removeToManyTarget("agTruckShipperStmts2", obj, true);
	}

	@SuppressWarnings("unchecked")
	public List<AgTruckShipperStmt> getAgTruckShipperStmts2()
	{
		return (List<AgTruckShipperStmt>) this.readProperty("agTruckShipperStmts2");
	}

	public void setLocation(final Location location)
	{
		this.setToOneTarget("location", location, true);
	}

	public Location getLocation()
	{
		return (Location) this.readProperty("location");
	}

	public void setMot(final Mot mot)
	{
		this.setToOneTarget("mot", mot, true);
	}

	public Mot getMot()
	{
		return (Mot) this.readProperty("mot");
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

	public void setUom2(final Uom uom2)
	{
		this.setToOneTarget("uom2", uom2, true);
	}

	public Uom getUom2()
	{
		return (Uom) this.readProperty("uom2");
	}

	public void setUom3(final Uom uom3)
	{
		this.setToOneTarget("uom3", uom3, true);
	}

	public Uom getUom3()
	{
		return (Uom) this.readProperty("uom3");
	}

}
