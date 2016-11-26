package com.tc.app.exchangemonitor.model.cayenne.persistent.auto;

import java.util.Date;
import java.util.List;

import org.apache.cayenne.CayenneDataObject;
import org.apache.cayenne.exp.Property;

import com.tc.app.exchangemonitor.model.cayenne.persistent.AgBttAckCnfrmLitem;
import com.tc.app.exchangemonitor.model.cayenne.persistent.AgBttNomLitem;
import com.tc.app.exchangemonitor.model.cayenne.persistent.AgBttSchUpdLitem;
import com.tc.app.exchangemonitor.model.cayenne.persistent.AgBttTicketLitem;
import com.tc.app.exchangemonitor.model.cayenne.persistent.AgCustodyTicket;
import com.tc.app.exchangemonitor.model.cayenne.persistent.AgNominationLineItem;
import com.tc.app.exchangemonitor.model.cayenne.persistent.AgScheduleLineItem;
import com.tc.app.exchangemonitor.model.cayenne.persistent.AgTruckActualDetails;
import com.tc.app.exchangemonitor.model.cayenne.persistent.AgTruckShipperStmt;
import com.tc.app.exchangemonitor.model.cayenne.persistent.FeedData;
import com.tc.app.exchangemonitor.model.cayenne.persistent.FeedError;
import com.tc.app.exchangemonitor.model.cayenne.persistent.FeedStatus;
import com.tc.app.exchangemonitor.model.cayenne.persistent.FeedTransaction;
import com.tc.app.exchangemonitor.model.cayenne.persistent.FeedXsdXmlText;
import com.tc.app.exchangemonitor.model.cayenne.persistent.MsiInboundActual;
import com.tc.app.exchangemonitor.model.cayenne.persistent.MsiInboundContractTerm;
import com.tc.app.exchangemonitor.model.cayenne.persistent.MsiInboundCreditStatus;
import com.tc.app.exchangemonitor.model.cayenne.persistent.MsiInboundInvoice;
import com.tc.app.exchangemonitor.model.cayenne.persistent.MsiInboundPayment;
import com.tc.app.exchangemonitor.model.cayenne.persistent.MsiInboundShipmentParcel;
import com.tc.app.exchangemonitor.model.cayenne.persistent.MsiMdInboundAccount;
import com.tc.app.exchangemonitor.model.cayenne.persistent.MsiMdInboundBank;
import com.tc.app.exchangemonitor.model.cayenne.persistent.MsiMdInboundLocation;
import com.tc.app.exchangemonitor.model.cayenne.persistent.MsiMdInboundMaterial;
import com.tc.app.exchangemonitor.model.cayenne.persistent.MsiMdInboundTaxrep;
import com.tc.app.exchangemonitor.model.cayenne.persistent.MsiMdInboundVehicle;
import com.tc.app.exchangemonitor.model.cayenne.persistent.MsiOutboundData;
import com.tc.app.exchangemonitor.model.cayenne.persistent.PmType4Record;
import com.tc.app.exchangemonitor.model.cayenne.persistent.PmType5Record;
import com.tc.app.exchangemonitor.model.cayenne.persistent.PmTypeARecord;
import com.tc.app.exchangemonitor.model.cayenne.persistent.PmTypeBRecord;
import com.tc.app.exchangemonitor.model.cayenne.persistent.RgStagingAcct;
import com.tc.app.exchangemonitor.model.cayenne.persistent.RgStagingAcctAddress;
import com.tc.app.exchangemonitor.model.cayenne.persistent.RgStagingAcctBankInfo;
import com.tc.app.exchangemonitor.model.cayenne.persistent.TradeFeed;

/**
 * Class _FeedDetailData was generated by Cayenne.
 * It is probably a good idea to avoid changing this class manually,
 * since it may be overwritten next time code is regenerated.
 * If you need to make any customizations, please use subclass.
 */
public abstract class _FeedDetailData extends CayenneDataObject
{

	private static final long serialVersionUID = 1L;

	public static final String OID_PK_COLUMN = "oid";

	public static final Property<Date> ETL_TIMESTAMP = new Property<>("etlTimestamp");
	public static final Property<Integer> TRANS_ID = new Property<>("transId");
	public static final Property<PmTypeBRecord> FDD = new Property<>("fdd");
	public static final Property<AgTruckShipperStmt> FDD1 = new Property<>("fdd1");
	public static final Property<PmTypeARecord> FDD2 = new Property<>("fdd2");
	public static final Property<PmType5Record> FDD3 = new Property<>("fdd3");
	public static final Property<PmType4Record> FDD4 = new Property<>("fdd4");
	public static final Property<TradeFeed> FDD5 = new Property<>("fdd5");
	public static final Property<AgTruckActualDetails> FDD6 = new Property<>("fdd6");
	public static final Property<AgScheduleLineItem> FDD_O = new Property<>("fddO");
	public static final Property<AgBttTicketLitem> FDD_O1 = new Property<>("fddO1");
	public static final Property<AgBttSchUpdLitem> FDD_O2 = new Property<>("fddO2");
	public static final Property<AgNominationLineItem> FDD_O3 = new Property<>("fddO3");
	public static final Property<AgCustodyTicket> FDD_O4 = new Property<>("fddO4");
	public static final Property<AgBttAckCnfrmLitem> FDD_O5 = new Property<>("fddO5");
	public static final Property<AgBttNomLitem> FDD_O6 = new Property<>("fddO6");
	public static final Property<FeedData> FEED_DATA = new Property<>("feedData");
	public static final Property<RgStagingAcct> FEED_DETAIL_DATA = new Property<>("feedDetailData");
	public static final Property<RgStagingAcctBankInfo> FEED_DETAIL_DATA1 = new Property<>("feedDetailData1");
	public static final Property<List<FeedError>> FEED_ERRORS = new Property<>("feedErrors");
	public static final Property<FeedStatus> FEED_STATUS = new Property<>("feedStatus");
	public static final Property<List<FeedTransaction>> FEED_TRANSACTIONS = new Property<>("feedTransactions");
	public static final Property<List<MsiInboundActual>> MSI_INBOUND_ACTUALS = new Property<>("msiInboundActuals");
	public static final Property<List<MsiInboundContractTerm>> MSI_INBOUND_CONTRACT_TERMS = new Property<>("msiInboundContractTerms");
	public static final Property<List<MsiInboundCreditStatus>> MSI_INBOUND_CREDIT_STATUSES = new Property<>("msiInboundCreditStatuses");
	public static final Property<List<MsiInboundInvoice>> MSI_INBOUND_INVOICES = new Property<>("msiInboundInvoices");
	public static final Property<List<MsiInboundPayment>> MSI_INBOUND_PAYMENTS = new Property<>("msiInboundPayments");
	public static final Property<List<MsiInboundShipmentParcel>> MSI_INBOUND_SHIPMENT_PARCELS = new Property<>("msiInboundShipmentParcels");
	public static final Property<List<MsiMdInboundAccount>> MSI_MD_INBOUND_ACCOUNTS = new Property<>("msiMdInboundAccounts");
	public static final Property<List<MsiMdInboundBank>> MSI_MD_INBOUND_BANKS = new Property<>("msiMdInboundBanks");
	public static final Property<List<MsiMdInboundLocation>> MSI_MD_INBOUND_LOCATIONS = new Property<>("msiMdInboundLocations");
	public static final Property<List<MsiMdInboundMaterial>> MSI_MD_INBOUND_MATERIALS = new Property<>("msiMdInboundMaterials");
	public static final Property<List<MsiMdInboundTaxrep>> MSI_MD_INBOUND_TAXREPS = new Property<>("msiMdInboundTaxreps");
	public static final Property<List<MsiMdInboundVehicle>> MSI_MD_INBOUND_VEHICLES = new Property<>("msiMdInboundVehicles");
	public static final Property<List<MsiOutboundData>> MSI_OUTBOUND_DATAS = new Property<>("msiOutboundDatas");
	public static final Property<FeedXsdXmlText> REQUEST_XML = new Property<>("requestXml");
	public static final Property<List<RgStagingAcctAddress>> RG_STAGING_ACCT_ADDRESSES = new Property<>("rgStagingAcctAddresses");

	public void setEtlTimestamp(final Date etlTimestamp)
	{
		this.writeProperty("etlTimestamp", etlTimestamp);
	}

	public Date getEtlTimestamp()
	{
		return (Date) this.readProperty("etlTimestamp");
	}

	public void setTransId(final Integer transId)
	{
		this.writeProperty("transId", transId);
	}

	public Integer getTransId()
	{
		return (Integer) this.readProperty("transId");
	}

	public void setFdd(final PmTypeBRecord fdd)
	{
		this.setToOneTarget("fdd", fdd, true);
	}

	public PmTypeBRecord getFdd()
	{
		return (PmTypeBRecord) this.readProperty("fdd");
	}

	public void setFdd1(final AgTruckShipperStmt fdd1)
	{
		this.setToOneTarget("fdd1", fdd1, true);
	}

	public AgTruckShipperStmt getFdd1()
	{
		return (AgTruckShipperStmt) this.readProperty("fdd1");
	}

	public void setFdd2(final PmTypeARecord fdd2)
	{
		this.setToOneTarget("fdd2", fdd2, true);
	}

	public PmTypeARecord getFdd2()
	{
		return (PmTypeARecord) this.readProperty("fdd2");
	}

	public void setFdd3(final PmType5Record fdd3)
	{
		this.setToOneTarget("fdd3", fdd3, true);
	}

	public PmType5Record getFdd3()
	{
		return (PmType5Record) this.readProperty("fdd3");
	}

	public void setFdd4(final PmType4Record fdd4)
	{
		this.setToOneTarget("fdd4", fdd4, true);
	}

	public PmType4Record getFdd4()
	{
		return (PmType4Record) this.readProperty("fdd4");
	}

	public void setFdd5(final TradeFeed fdd5)
	{
		this.setToOneTarget("fdd5", fdd5, true);
	}

	public TradeFeed getFdd5()
	{
		return (TradeFeed) this.readProperty("fdd5");
	}

	public void setFdd6(final AgTruckActualDetails fdd6)
	{
		this.setToOneTarget("fdd6", fdd6, true);
	}

	public AgTruckActualDetails getFdd6()
	{
		return (AgTruckActualDetails) this.readProperty("fdd6");
	}

	public void setFddO(final AgScheduleLineItem fddO)
	{
		this.setToOneTarget("fddO", fddO, true);
	}

	public AgScheduleLineItem getFddO()
	{
		return (AgScheduleLineItem) this.readProperty("fddO");
	}

	public void setFddO1(final AgBttTicketLitem fddO1)
	{
		this.setToOneTarget("fddO1", fddO1, true);
	}

	public AgBttTicketLitem getFddO1()
	{
		return (AgBttTicketLitem) this.readProperty("fddO1");
	}

	public void setFddO2(final AgBttSchUpdLitem fddO2)
	{
		this.setToOneTarget("fddO2", fddO2, true);
	}

	public AgBttSchUpdLitem getFddO2()
	{
		return (AgBttSchUpdLitem) this.readProperty("fddO2");
	}

	public void setFddO3(final AgNominationLineItem fddO3)
	{
		this.setToOneTarget("fddO3", fddO3, true);
	}

	public AgNominationLineItem getFddO3()
	{
		return (AgNominationLineItem) this.readProperty("fddO3");
	}

	public void setFddO4(final AgCustodyTicket fddO4)
	{
		this.setToOneTarget("fddO4", fddO4, true);
	}

	public AgCustodyTicket getFddO4()
	{
		return (AgCustodyTicket) this.readProperty("fddO4");
	}

	public void setFddO5(final AgBttAckCnfrmLitem fddO5)
	{
		this.setToOneTarget("fddO5", fddO5, true);
	}

	public AgBttAckCnfrmLitem getFddO5()
	{
		return (AgBttAckCnfrmLitem) this.readProperty("fddO5");
	}

	public void setFddO6(final AgBttNomLitem fddO6)
	{
		this.setToOneTarget("fddO6", fddO6, true);
	}

	public AgBttNomLitem getFddO6()
	{
		return (AgBttNomLitem) this.readProperty("fddO6");
	}

	public void setFeedData(final FeedData feedData)
	{
		this.setToOneTarget("feedData", feedData, true);
	}

	public FeedData getFeedData()
	{
		return (FeedData) this.readProperty("feedData");
	}

	public void setFeedDetailData(final RgStagingAcct feedDetailData)
	{
		this.setToOneTarget("feedDetailData", feedDetailData, true);
	}

	public RgStagingAcct getFeedDetailData()
	{
		return (RgStagingAcct) this.readProperty("feedDetailData");
	}

	public void setFeedDetailData1(final RgStagingAcctBankInfo feedDetailData1)
	{
		this.setToOneTarget("feedDetailData1", feedDetailData1, true);
	}

	public RgStagingAcctBankInfo getFeedDetailData1()
	{
		return (RgStagingAcctBankInfo) this.readProperty("feedDetailData1");
	}

	public void addToFeedErrors(final FeedError obj)
	{
		this.addToManyTarget("feedErrors", obj, true);
	}

	public void removeFromFeedErrors(final FeedError obj)
	{
		this.removeToManyTarget("feedErrors", obj, true);
	}

	@SuppressWarnings("unchecked")
	public List<FeedError> getFeedErrors()
	{
		return (List<FeedError>) this.readProperty("feedErrors");
	}

	public void setFeedStatus(final FeedStatus feedStatus)
	{
		this.setToOneTarget("feedStatus", feedStatus, true);
	}

	public FeedStatus getFeedStatus()
	{
		return (FeedStatus) this.readProperty("feedStatus");
	}

	public void addToFeedTransactions(final FeedTransaction obj)
	{
		this.addToManyTarget("feedTransactions", obj, true);
	}

	public void removeFromFeedTransactions(final FeedTransaction obj)
	{
		this.removeToManyTarget("feedTransactions", obj, true);
	}

	@SuppressWarnings("unchecked")
	public List<FeedTransaction> getFeedTransactions()
	{
		return (List<FeedTransaction>) this.readProperty("feedTransactions");
	}

	public void addToMsiInboundActuals(final MsiInboundActual obj)
	{
		this.addToManyTarget("msiInboundActuals", obj, true);
	}

	public void removeFromMsiInboundActuals(final MsiInboundActual obj)
	{
		this.removeToManyTarget("msiInboundActuals", obj, true);
	}

	@SuppressWarnings("unchecked")
	public List<MsiInboundActual> getMsiInboundActuals()
	{
		return (List<MsiInboundActual>) this.readProperty("msiInboundActuals");
	}

	public void addToMsiInboundContractTerms(final MsiInboundContractTerm obj)
	{
		this.addToManyTarget("msiInboundContractTerms", obj, true);
	}

	public void removeFromMsiInboundContractTerms(final MsiInboundContractTerm obj)
	{
		this.removeToManyTarget("msiInboundContractTerms", obj, true);
	}

	@SuppressWarnings("unchecked")
	public List<MsiInboundContractTerm> getMsiInboundContractTerms()
	{
		return (List<MsiInboundContractTerm>) this.readProperty("msiInboundContractTerms");
	}

	public void addToMsiInboundCreditStatuses(final MsiInboundCreditStatus obj)
	{
		this.addToManyTarget("msiInboundCreditStatuses", obj, true);
	}

	public void removeFromMsiInboundCreditStatuses(final MsiInboundCreditStatus obj)
	{
		this.removeToManyTarget("msiInboundCreditStatuses", obj, true);
	}

	@SuppressWarnings("unchecked")
	public List<MsiInboundCreditStatus> getMsiInboundCreditStatuses()
	{
		return (List<MsiInboundCreditStatus>) this.readProperty("msiInboundCreditStatuses");
	}

	public void addToMsiInboundInvoices(final MsiInboundInvoice obj)
	{
		this.addToManyTarget("msiInboundInvoices", obj, true);
	}

	public void removeFromMsiInboundInvoices(final MsiInboundInvoice obj)
	{
		this.removeToManyTarget("msiInboundInvoices", obj, true);
	}

	@SuppressWarnings("unchecked")
	public List<MsiInboundInvoice> getMsiInboundInvoices()
	{
		return (List<MsiInboundInvoice>) this.readProperty("msiInboundInvoices");
	}

	public void addToMsiInboundPayments(final MsiInboundPayment obj)
	{
		this.addToManyTarget("msiInboundPayments", obj, true);
	}

	public void removeFromMsiInboundPayments(final MsiInboundPayment obj)
	{
		this.removeToManyTarget("msiInboundPayments", obj, true);
	}

	@SuppressWarnings("unchecked")
	public List<MsiInboundPayment> getMsiInboundPayments()
	{
		return (List<MsiInboundPayment>) this.readProperty("msiInboundPayments");
	}

	public void addToMsiInboundShipmentParcels(final MsiInboundShipmentParcel obj)
	{
		this.addToManyTarget("msiInboundShipmentParcels", obj, true);
	}

	public void removeFromMsiInboundShipmentParcels(final MsiInboundShipmentParcel obj)
	{
		this.removeToManyTarget("msiInboundShipmentParcels", obj, true);
	}

	@SuppressWarnings("unchecked")
	public List<MsiInboundShipmentParcel> getMsiInboundShipmentParcels()
	{
		return (List<MsiInboundShipmentParcel>) this.readProperty("msiInboundShipmentParcels");
	}

	public void addToMsiMdInboundAccounts(final MsiMdInboundAccount obj)
	{
		this.addToManyTarget("msiMdInboundAccounts", obj, true);
	}

	public void removeFromMsiMdInboundAccounts(final MsiMdInboundAccount obj)
	{
		this.removeToManyTarget("msiMdInboundAccounts", obj, true);
	}

	@SuppressWarnings("unchecked")
	public List<MsiMdInboundAccount> getMsiMdInboundAccounts()
	{
		return (List<MsiMdInboundAccount>) this.readProperty("msiMdInboundAccounts");
	}

	public void addToMsiMdInboundBanks(final MsiMdInboundBank obj)
	{
		this.addToManyTarget("msiMdInboundBanks", obj, true);
	}

	public void removeFromMsiMdInboundBanks(final MsiMdInboundBank obj)
	{
		this.removeToManyTarget("msiMdInboundBanks", obj, true);
	}

	@SuppressWarnings("unchecked")
	public List<MsiMdInboundBank> getMsiMdInboundBanks()
	{
		return (List<MsiMdInboundBank>) this.readProperty("msiMdInboundBanks");
	}

	public void addToMsiMdInboundLocations(final MsiMdInboundLocation obj)
	{
		this.addToManyTarget("msiMdInboundLocations", obj, true);
	}

	public void removeFromMsiMdInboundLocations(final MsiMdInboundLocation obj)
	{
		this.removeToManyTarget("msiMdInboundLocations", obj, true);
	}

	@SuppressWarnings("unchecked")
	public List<MsiMdInboundLocation> getMsiMdInboundLocations()
	{
		return (List<MsiMdInboundLocation>) this.readProperty("msiMdInboundLocations");
	}

	public void addToMsiMdInboundMaterials(final MsiMdInboundMaterial obj)
	{
		this.addToManyTarget("msiMdInboundMaterials", obj, true);
	}

	public void removeFromMsiMdInboundMaterials(final MsiMdInboundMaterial obj)
	{
		this.removeToManyTarget("msiMdInboundMaterials", obj, true);
	}

	@SuppressWarnings("unchecked")
	public List<MsiMdInboundMaterial> getMsiMdInboundMaterials()
	{
		return (List<MsiMdInboundMaterial>) this.readProperty("msiMdInboundMaterials");
	}

	public void addToMsiMdInboundTaxreps(final MsiMdInboundTaxrep obj)
	{
		this.addToManyTarget("msiMdInboundTaxreps", obj, true);
	}

	public void removeFromMsiMdInboundTaxreps(final MsiMdInboundTaxrep obj)
	{
		this.removeToManyTarget("msiMdInboundTaxreps", obj, true);
	}

	@SuppressWarnings("unchecked")
	public List<MsiMdInboundTaxrep> getMsiMdInboundTaxreps()
	{
		return (List<MsiMdInboundTaxrep>) this.readProperty("msiMdInboundTaxreps");
	}

	public void addToMsiMdInboundVehicles(final MsiMdInboundVehicle obj)
	{
		this.addToManyTarget("msiMdInboundVehicles", obj, true);
	}

	public void removeFromMsiMdInboundVehicles(final MsiMdInboundVehicle obj)
	{
		this.removeToManyTarget("msiMdInboundVehicles", obj, true);
	}

	@SuppressWarnings("unchecked")
	public List<MsiMdInboundVehicle> getMsiMdInboundVehicles()
	{
		return (List<MsiMdInboundVehicle>) this.readProperty("msiMdInboundVehicles");
	}

	public void addToMsiOutboundDatas(final MsiOutboundData obj)
	{
		this.addToManyTarget("msiOutboundDatas", obj, true);
	}

	public void removeFromMsiOutboundDatas(final MsiOutboundData obj)
	{
		this.removeToManyTarget("msiOutboundDatas", obj, true);
	}

	@SuppressWarnings("unchecked")
	public List<MsiOutboundData> getMsiOutboundDatas()
	{
		return (List<MsiOutboundData>) this.readProperty("msiOutboundDatas");
	}

	public void setRequestXml(final FeedXsdXmlText requestXml)
	{
		this.setToOneTarget("requestXml", requestXml, true);
	}

	public FeedXsdXmlText getRequestXml()
	{
		return (FeedXsdXmlText) this.readProperty("requestXml");
	}

	public void addToRgStagingAcctAddresses(final RgStagingAcctAddress obj)
	{
		this.addToManyTarget("rgStagingAcctAddresses", obj, true);
	}

	public void removeFromRgStagingAcctAddresses(final RgStagingAcctAddress obj)
	{
		this.removeToManyTarget("rgStagingAcctAddresses", obj, true);
	}

	@SuppressWarnings("unchecked")
	public List<RgStagingAcctAddress> getRgStagingAcctAddresses()
	{
		return (List<RgStagingAcctAddress>) this.readProperty("rgStagingAcctAddresses");
	}

}
