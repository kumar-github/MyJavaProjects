package com.tc.app.exchangemonitor.model.cayenne.persistent.auto;

import java.util.Date;

import org.apache.cayenne.CayenneDataObject;
import org.apache.cayenne.exp.Property;

import com.tc.app.exchangemonitor.model.cayenne.persistent.Market;

/**
 * Class _FbModularInfo was generated by Cayenne.
 * It is probably a good idea to avoid changing this class manually,
 * since it may be overwritten next time code is regenerated.
 * If you need to make any customizations, please use subclass.
 */
public abstract class _FbModularInfo extends CayenneDataObject
{

	private static final long serialVersionUID = 1L;

	public static final String FORMULA_BODY_NUM_PK_COLUMN = "formula_body_num";
	public static final String FORMULA_NUM_PK_COLUMN = "formula_num";

	public static final Property<String> BASIS_CMDTY_CODE = new Property<String>("basisCmdtyCode");
	public static final Property<String> CROSS_REF_IND = new Property<String>("crossRefInd");
	public static final Property<Date> LAST_COMPUTED_ASOF_DATE = new Property<Date>("lastComputedAsofDate");
	public static final Property<Double> LAST_COMPUTED_VALUE = new Property<Double>("lastComputedValue");
	public static final Property<String> LINE_ITEM_CONTR_DESC = new Property<String>("lineItemContrDesc");
	public static final Property<String> LINE_ITEM_INVOICE_DESC = new Property<String>("lineItemInvoiceDesc");
	public static final Property<String> PAY_DEDUCT_IND = new Property<String>("payDeductInd");
	public static final Property<String> PRICE_PCNT_STRING = new Property<String>("pricePcntString");
	public static final Property<Double> PRICE_PCNT_VALUE = new Property<Double>("pricePcntValue");
	public static final Property<String> PRICE_QUOTE_STRING = new Property<String>("priceQuoteString");
	public static final Property<String> QP_DESC = new Property<String>("qpDesc");
	public static final Property<String> QP_ELECTED = new Property<String>("qpElected");
	public static final Property<Date> QP_ELECTION_DATE = new Property<Date>("qpElectionDate");
	public static final Property<String> QP_ELECTION_OPT = new Property<String>("qpElectionOpt");
	public static final Property<Date> QP_END_DATE = new Property<Date>("qpEndDate");
	public static final Property<Date> QP_START_DATE = new Property<Date>("qpStartDate");
	public static final Property<String> REF_CMDTY_CODE = new Property<String>("refCmdtyCode");
	public static final Property<String> RISK_TRADING_PRD = new Property<String>("riskTradingPrd");
	public static final Property<Integer> TRANS_ID = new Property<Integer>("transId");
	public static final Property<Market> MARKET = new Property<Market>("market");

	public void setBasisCmdtyCode(String basisCmdtyCode)
	{
		writeProperty("basisCmdtyCode", basisCmdtyCode);
	}

	public String getBasisCmdtyCode()
	{
		return (String) readProperty("basisCmdtyCode");
	}

	public void setCrossRefInd(String crossRefInd)
	{
		writeProperty("crossRefInd", crossRefInd);
	}

	public String getCrossRefInd()
	{
		return (String) readProperty("crossRefInd");
	}

	public void setLastComputedAsofDate(Date lastComputedAsofDate)
	{
		writeProperty("lastComputedAsofDate", lastComputedAsofDate);
	}

	public Date getLastComputedAsofDate()
	{
		return (Date) readProperty("lastComputedAsofDate");
	}

	public void setLastComputedValue(Double lastComputedValue)
	{
		writeProperty("lastComputedValue", lastComputedValue);
	}

	public Double getLastComputedValue()
	{
		return (Double) readProperty("lastComputedValue");
	}

	public void setLineItemContrDesc(String lineItemContrDesc)
	{
		writeProperty("lineItemContrDesc", lineItemContrDesc);
	}

	public String getLineItemContrDesc()
	{
		return (String) readProperty("lineItemContrDesc");
	}

	public void setLineItemInvoiceDesc(String lineItemInvoiceDesc)
	{
		writeProperty("lineItemInvoiceDesc", lineItemInvoiceDesc);
	}

	public String getLineItemInvoiceDesc()
	{
		return (String) readProperty("lineItemInvoiceDesc");
	}

	public void setPayDeductInd(String payDeductInd)
	{
		writeProperty("payDeductInd", payDeductInd);
	}

	public String getPayDeductInd()
	{
		return (String) readProperty("payDeductInd");
	}

	public void setPricePcntString(String pricePcntString)
	{
		writeProperty("pricePcntString", pricePcntString);
	}

	public String getPricePcntString()
	{
		return (String) readProperty("pricePcntString");
	}

	public void setPricePcntValue(Double pricePcntValue)
	{
		writeProperty("pricePcntValue", pricePcntValue);
	}

	public Double getPricePcntValue()
	{
		return (Double) readProperty("pricePcntValue");
	}

	public void setPriceQuoteString(String priceQuoteString)
	{
		writeProperty("priceQuoteString", priceQuoteString);
	}

	public String getPriceQuoteString()
	{
		return (String) readProperty("priceQuoteString");
	}

	public void setQpDesc(String qpDesc)
	{
		writeProperty("qpDesc", qpDesc);
	}

	public String getQpDesc()
	{
		return (String) readProperty("qpDesc");
	}

	public void setQpElected(String qpElected)
	{
		writeProperty("qpElected", qpElected);
	}

	public String getQpElected()
	{
		return (String) readProperty("qpElected");
	}

	public void setQpElectionDate(Date qpElectionDate)
	{
		writeProperty("qpElectionDate", qpElectionDate);
	}

	public Date getQpElectionDate()
	{
		return (Date) readProperty("qpElectionDate");
	}

	public void setQpElectionOpt(String qpElectionOpt)
	{
		writeProperty("qpElectionOpt", qpElectionOpt);
	}

	public String getQpElectionOpt()
	{
		return (String) readProperty("qpElectionOpt");
	}

	public void setQpEndDate(Date qpEndDate)
	{
		writeProperty("qpEndDate", qpEndDate);
	}

	public Date getQpEndDate()
	{
		return (Date) readProperty("qpEndDate");
	}

	public void setQpStartDate(Date qpStartDate)
	{
		writeProperty("qpStartDate", qpStartDate);
	}

	public Date getQpStartDate()
	{
		return (Date) readProperty("qpStartDate");
	}

	public void setRefCmdtyCode(String refCmdtyCode)
	{
		writeProperty("refCmdtyCode", refCmdtyCode);
	}

	public String getRefCmdtyCode()
	{
		return (String) readProperty("refCmdtyCode");
	}

	public void setRiskTradingPrd(String riskTradingPrd)
	{
		writeProperty("riskTradingPrd", riskTradingPrd);
	}

	public String getRiskTradingPrd()
	{
		return (String) readProperty("riskTradingPrd");
	}

	public void setTransId(Integer transId)
	{
		writeProperty("transId", transId);
	}

	public Integer getTransId()
	{
		return (Integer) readProperty("transId");
	}

	public void setMarket(Market market)
	{
		setToOneTarget("market", market, true);
	}

	public Market getMarket()
	{
		return (Market) readProperty("market");
	}

}