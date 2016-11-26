package com.tc.app.exchangemonitor.model.cayenne.persistent.auto;

import java.math.BigDecimal;
import java.util.Date;

import org.apache.cayenne.CayenneDataObject;
import org.apache.cayenne.exp.Property;

/**
 * Class _AudScenarioItem was generated by Cayenne.
 * It is probably a good idea to avoid changing this class manually,
 * since it may be overwritten next time code is regenerated.
 * If you need to make any customizations, please use subclass.
 */
public abstract class _AudScenarioItem extends CayenneDataObject
{

	private static final long serialVersionUID = 1L;

	public static final Property<Integer> ACCT_NUM = new Property<Integer>("acctNum");
	public static final Property<String> ACCT_REF_NUM = new Property<String>("acctRefNum");
	public static final Property<Integer> BOOKING_COMP_NUM = new Property<Integer>("bookingCompNum");
	public static final Property<String> BUY_SELL_IND = new Property<String>("buySellInd");
	public static final Property<String> CMDTY_CODE = new Property<String>("cmdtyCode");
	public static final Property<Date> DEL_END_DATE = new Property<Date>("delEndDate");
	public static final Property<Date> DEL_START_DATE = new Property<Date>("delStartDate");
	public static final Property<BigDecimal> DIFFERENTIAL = new Property<BigDecimal>("differential");
	public static final Property<String> DISCH_PORT_LOC_CODE = new Property<String>("dischPortLocCode");
	public static final Property<String> LOAD_PORT_LOC_CODE = new Property<String>("loadPortLocCode");
	public static final Property<String> MOT_CODE = new Property<String>("motCode");
	public static final Property<Integer> OID = new Property<Integer>("oid");
	public static final Property<Integer> OPP_PORT_NUM = new Property<Integer>("oppPortNum");
	public static final Property<Integer> PORT_NUM = new Property<Integer>("portNum");
	public static final Property<String> PRICE_CURR_CODE = new Property<String>("priceCurrCode");
	public static final Property<Date> PRICE_END_DATE = new Property<Date>("priceEndDate");
	public static final Property<Date> PRICE_START_DATE = new Property<Date>("priceStartDate");
	public static final Property<String> PRICE_UOM_CODE = new Property<String>("priceUomCode");
	public static final Property<BigDecimal> QTY = new Property<BigDecimal>("qty");
	public static final Property<BigDecimal> QTY_PERCENT = new Property<BigDecimal>("qtyPercent");
	public static final Property<String> QTY_PERIODICITY = new Property<String>("qtyPeriodicity");
	public static final Property<String> QTY_UOM_CODE = new Property<String>("qtyUomCode");
	public static final Property<String> QUOTE = new Property<String>("quote");
	public static final Property<Short> REF_ALLOC_ITEM_NUM = new Property<Short>("refAllocItemNum");
	public static final Property<Integer> REF_ALLOC_NUM = new Property<Integer>("refAllocNum");
	public static final Property<Short> REF_ITEM_NUM = new Property<Short>("refItemNum");
	public static final Property<Short> REF_ORDER_NUM = new Property<Short>("refOrderNum");
	public static final Property<Integer> REF_SUB_ALLOC_NUM = new Property<Integer>("refSubAllocNum");
	public static final Property<Integer> REF_TRADE_NUM = new Property<Integer>("refTradeNum");
	public static final Property<Integer> RESP_TRANS_ID = new Property<Integer>("respTransId");
	public static final Property<String> RISK_MKT_CODE = new Property<String>("riskMktCode");
	public static final Property<String> RISK_PERIOD = new Property<String>("riskPeriod");
	public static final Property<Integer> SCENARIO_ID = new Property<Integer>("scenarioId");
	public static final Property<Integer> TRANS_ID = new Property<Integer>("transId");

	public void setAcctNum(Integer acctNum)
	{
		writeProperty("acctNum", acctNum);
	}

	public Integer getAcctNum()
	{
		return (Integer) readProperty("acctNum");
	}

	public void setAcctRefNum(String acctRefNum)
	{
		writeProperty("acctRefNum", acctRefNum);
	}

	public String getAcctRefNum()
	{
		return (String) readProperty("acctRefNum");
	}

	public void setBookingCompNum(Integer bookingCompNum)
	{
		writeProperty("bookingCompNum", bookingCompNum);
	}

	public Integer getBookingCompNum()
	{
		return (Integer) readProperty("bookingCompNum");
	}

	public void setBuySellInd(String buySellInd)
	{
		writeProperty("buySellInd", buySellInd);
	}

	public String getBuySellInd()
	{
		return (String) readProperty("buySellInd");
	}

	public void setCmdtyCode(String cmdtyCode)
	{
		writeProperty("cmdtyCode", cmdtyCode);
	}

	public String getCmdtyCode()
	{
		return (String) readProperty("cmdtyCode");
	}

	public void setDelEndDate(Date delEndDate)
	{
		writeProperty("delEndDate", delEndDate);
	}

	public Date getDelEndDate()
	{
		return (Date) readProperty("delEndDate");
	}

	public void setDelStartDate(Date delStartDate)
	{
		writeProperty("delStartDate", delStartDate);
	}

	public Date getDelStartDate()
	{
		return (Date) readProperty("delStartDate");
	}

	public void setDifferential(BigDecimal differential)
	{
		writeProperty("differential", differential);
	}

	public BigDecimal getDifferential()
	{
		return (BigDecimal) readProperty("differential");
	}

	public void setDischPortLocCode(String dischPortLocCode)
	{
		writeProperty("dischPortLocCode", dischPortLocCode);
	}

	public String getDischPortLocCode()
	{
		return (String) readProperty("dischPortLocCode");
	}

	public void setLoadPortLocCode(String loadPortLocCode)
	{
		writeProperty("loadPortLocCode", loadPortLocCode);
	}

	public String getLoadPortLocCode()
	{
		return (String) readProperty("loadPortLocCode");
	}

	public void setMotCode(String motCode)
	{
		writeProperty("motCode", motCode);
	}

	public String getMotCode()
	{
		return (String) readProperty("motCode");
	}

	public void setOid(Integer oid)
	{
		writeProperty("oid", oid);
	}

	public Integer getOid()
	{
		return (Integer) readProperty("oid");
	}

	public void setOppPortNum(Integer oppPortNum)
	{
		writeProperty("oppPortNum", oppPortNum);
	}

	public Integer getOppPortNum()
	{
		return (Integer) readProperty("oppPortNum");
	}

	public void setPortNum(Integer portNum)
	{
		writeProperty("portNum", portNum);
	}

	public Integer getPortNum()
	{
		return (Integer) readProperty("portNum");
	}

	public void setPriceCurrCode(String priceCurrCode)
	{
		writeProperty("priceCurrCode", priceCurrCode);
	}

	public String getPriceCurrCode()
	{
		return (String) readProperty("priceCurrCode");
	}

	public void setPriceEndDate(Date priceEndDate)
	{
		writeProperty("priceEndDate", priceEndDate);
	}

	public Date getPriceEndDate()
	{
		return (Date) readProperty("priceEndDate");
	}

	public void setPriceStartDate(Date priceStartDate)
	{
		writeProperty("priceStartDate", priceStartDate);
	}

	public Date getPriceStartDate()
	{
		return (Date) readProperty("priceStartDate");
	}

	public void setPriceUomCode(String priceUomCode)
	{
		writeProperty("priceUomCode", priceUomCode);
	}

	public String getPriceUomCode()
	{
		return (String) readProperty("priceUomCode");
	}

	public void setQty(BigDecimal qty)
	{
		writeProperty("qty", qty);
	}

	public BigDecimal getQty()
	{
		return (BigDecimal) readProperty("qty");
	}

	public void setQtyPercent(BigDecimal qtyPercent)
	{
		writeProperty("qtyPercent", qtyPercent);
	}

	public BigDecimal getQtyPercent()
	{
		return (BigDecimal) readProperty("qtyPercent");
	}

	public void setQtyPeriodicity(String qtyPeriodicity)
	{
		writeProperty("qtyPeriodicity", qtyPeriodicity);
	}

	public String getQtyPeriodicity()
	{
		return (String) readProperty("qtyPeriodicity");
	}

	public void setQtyUomCode(String qtyUomCode)
	{
		writeProperty("qtyUomCode", qtyUomCode);
	}

	public String getQtyUomCode()
	{
		return (String) readProperty("qtyUomCode");
	}

	public void setQuote(String quote)
	{
		writeProperty("quote", quote);
	}

	public String getQuote()
	{
		return (String) readProperty("quote");
	}

	public void setRefAllocItemNum(Short refAllocItemNum)
	{
		writeProperty("refAllocItemNum", refAllocItemNum);
	}

	public Short getRefAllocItemNum()
	{
		return (Short) readProperty("refAllocItemNum");
	}

	public void setRefAllocNum(Integer refAllocNum)
	{
		writeProperty("refAllocNum", refAllocNum);
	}

	public Integer getRefAllocNum()
	{
		return (Integer) readProperty("refAllocNum");
	}

	public void setRefItemNum(Short refItemNum)
	{
		writeProperty("refItemNum", refItemNum);
	}

	public Short getRefItemNum()
	{
		return (Short) readProperty("refItemNum");
	}

	public void setRefOrderNum(Short refOrderNum)
	{
		writeProperty("refOrderNum", refOrderNum);
	}

	public Short getRefOrderNum()
	{
		return (Short) readProperty("refOrderNum");
	}

	public void setRefSubAllocNum(Integer refSubAllocNum)
	{
		writeProperty("refSubAllocNum", refSubAllocNum);
	}

	public Integer getRefSubAllocNum()
	{
		return (Integer) readProperty("refSubAllocNum");
	}

	public void setRefTradeNum(Integer refTradeNum)
	{
		writeProperty("refTradeNum", refTradeNum);
	}

	public Integer getRefTradeNum()
	{
		return (Integer) readProperty("refTradeNum");
	}

	public void setRespTransId(Integer respTransId)
	{
		writeProperty("respTransId", respTransId);
	}

	public Integer getRespTransId()
	{
		return (Integer) readProperty("respTransId");
	}

	public void setRiskMktCode(String riskMktCode)
	{
		writeProperty("riskMktCode", riskMktCode);
	}

	public String getRiskMktCode()
	{
		return (String) readProperty("riskMktCode");
	}

	public void setRiskPeriod(String riskPeriod)
	{
		writeProperty("riskPeriod", riskPeriod);
	}

	public String getRiskPeriod()
	{
		return (String) readProperty("riskPeriod");
	}

	public void setScenarioId(Integer scenarioId)
	{
		writeProperty("scenarioId", scenarioId);
	}

	public Integer getScenarioId()
	{
		return (Integer) readProperty("scenarioId");
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
