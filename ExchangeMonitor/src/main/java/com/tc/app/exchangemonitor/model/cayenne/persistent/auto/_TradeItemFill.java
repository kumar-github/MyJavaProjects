package com.tc.app.exchangemonitor.model.cayenne.persistent.auto;

import java.math.BigDecimal;
import java.util.Date;

import org.apache.cayenne.CayenneDataObject;
import org.apache.cayenne.exp.Property;

import com.tc.app.exchangemonitor.model.cayenne.persistent.Commodity;
import com.tc.app.exchangemonitor.model.cayenne.persistent.Uom;

/**
 * Class _TradeItemFill was generated by Cayenne.
 * It is probably a good idea to avoid changing this class manually,
 * since it may be overwritten next time code is regenerated.
 * If you need to make any customizations, please use subclass.
 */
public abstract class _TradeItemFill extends CayenneDataObject
{

	private static final long serialVersionUID = 1L;

	public static final String ITEM_FILL_NUM_PK_COLUMN = "item_fill_num";
	public static final String ITEM_NUM_PK_COLUMN = "item_num";
	public static final String ORDER_NUM_PK_COLUMN = "order_num";
	public static final String TRADE_NUM_PK_COLUMN = "trade_num";

	public static final Property<BigDecimal> BROKER_FIFO_QTY = new Property<BigDecimal>("brokerFifoQty");
	public static final Property<Integer> BSI_FILL_NUM = new Property<Integer>("bsiFillNum");
	public static final Property<Date> EFP_POST_DATE = new Property<Date>("efpPostDate");
	public static final Property<String> EXTERNAL_TRADE_NUM = new Property<String>("externalTradeNum");
	public static final Property<BigDecimal> FIFO_QTY = new Property<BigDecimal>("fifoQty");
	public static final Property<Double> FILL_CLOSED_QTY = new Property<Double>("fillClosedQty");
	public static final Property<Date> FILL_DATE = new Property<Date>("fillDate");
	public static final Property<Double> FILL_PRICE = new Property<Double>("fillPrice");
	public static final Property<Double> FILL_QTY = new Property<Double>("fillQty");
	public static final Property<String> FILL_STATUS = new Property<String>("fillStatus");
	public static final Property<String> IN_OUT_HOUSE_IND = new Property<String>("inOutHouseInd");
	public static final Property<Short> INHOUSE_FILL_NUM = new Property<Short>("inhouseFillNum");
	public static final Property<Short> INHOUSE_ITEM_NUM = new Property<Short>("inhouseItemNum");
	public static final Property<Short> INHOUSE_ORDER_NUM = new Property<Short>("inhouseOrderNum");
	public static final Property<Integer> INHOUSE_TRADE_NUM = new Property<Integer>("inhouseTradeNum");
	public static final Property<String> OUTHOUSE_ACCT_ALLOC = new Property<String>("outhouseAcctAlloc");
	public static final Property<String> OUTHOUSE_PROFIT_CENTER = new Property<String>("outhouseProfitCenter");
	public static final Property<BigDecimal> PORT_MATCH_QTY = new Property<BigDecimal>("portMatchQty");
	public static final Property<Integer> TRANS_ID = new Property<Integer>("transId");
	public static final Property<Commodity> COMMODITY = new Property<Commodity>("commodity");
	public static final Property<Uom> UOM = new Property<Uom>("uom");
	public static final Property<Uom> UOM1 = new Property<Uom>("uom1");

	public void setBrokerFifoQty(BigDecimal brokerFifoQty)
	{
		writeProperty("brokerFifoQty", brokerFifoQty);
	}

	public BigDecimal getBrokerFifoQty()
	{
		return (BigDecimal) readProperty("brokerFifoQty");
	}

	public void setBsiFillNum(Integer bsiFillNum)
	{
		writeProperty("bsiFillNum", bsiFillNum);
	}

	public Integer getBsiFillNum()
	{
		return (Integer) readProperty("bsiFillNum");
	}

	public void setEfpPostDate(Date efpPostDate)
	{
		writeProperty("efpPostDate", efpPostDate);
	}

	public Date getEfpPostDate()
	{
		return (Date) readProperty("efpPostDate");
	}

	public void setExternalTradeNum(String externalTradeNum)
	{
		writeProperty("externalTradeNum", externalTradeNum);
	}

	public String getExternalTradeNum()
	{
		return (String) readProperty("externalTradeNum");
	}

	public void setFifoQty(BigDecimal fifoQty)
	{
		writeProperty("fifoQty", fifoQty);
	}

	public BigDecimal getFifoQty()
	{
		return (BigDecimal) readProperty("fifoQty");
	}

	public void setFillClosedQty(Double fillClosedQty)
	{
		writeProperty("fillClosedQty", fillClosedQty);
	}

	public Double getFillClosedQty()
	{
		return (Double) readProperty("fillClosedQty");
	}

	public void setFillDate(Date fillDate)
	{
		writeProperty("fillDate", fillDate);
	}

	public Date getFillDate()
	{
		return (Date) readProperty("fillDate");
	}

	public void setFillPrice(Double fillPrice)
	{
		writeProperty("fillPrice", fillPrice);
	}

	public Double getFillPrice()
	{
		return (Double) readProperty("fillPrice");
	}

	public void setFillQty(Double fillQty)
	{
		writeProperty("fillQty", fillQty);
	}

	public Double getFillQty()
	{
		return (Double) readProperty("fillQty");
	}

	public void setFillStatus(String fillStatus)
	{
		writeProperty("fillStatus", fillStatus);
	}

	public String getFillStatus()
	{
		return (String) readProperty("fillStatus");
	}

	public void setInOutHouseInd(String inOutHouseInd)
	{
		writeProperty("inOutHouseInd", inOutHouseInd);
	}

	public String getInOutHouseInd()
	{
		return (String) readProperty("inOutHouseInd");
	}

	public void setInhouseFillNum(Short inhouseFillNum)
	{
		writeProperty("inhouseFillNum", inhouseFillNum);
	}

	public Short getInhouseFillNum()
	{
		return (Short) readProperty("inhouseFillNum");
	}

	public void setInhouseItemNum(Short inhouseItemNum)
	{
		writeProperty("inhouseItemNum", inhouseItemNum);
	}

	public Short getInhouseItemNum()
	{
		return (Short) readProperty("inhouseItemNum");
	}

	public void setInhouseOrderNum(Short inhouseOrderNum)
	{
		writeProperty("inhouseOrderNum", inhouseOrderNum);
	}

	public Short getInhouseOrderNum()
	{
		return (Short) readProperty("inhouseOrderNum");
	}

	public void setInhouseTradeNum(Integer inhouseTradeNum)
	{
		writeProperty("inhouseTradeNum", inhouseTradeNum);
	}

	public Integer getInhouseTradeNum()
	{
		return (Integer) readProperty("inhouseTradeNum");
	}

	public void setOuthouseAcctAlloc(String outhouseAcctAlloc)
	{
		writeProperty("outhouseAcctAlloc", outhouseAcctAlloc);
	}

	public String getOuthouseAcctAlloc()
	{
		return (String) readProperty("outhouseAcctAlloc");
	}

	public void setOuthouseProfitCenter(String outhouseProfitCenter)
	{
		writeProperty("outhouseProfitCenter", outhouseProfitCenter);
	}

	public String getOuthouseProfitCenter()
	{
		return (String) readProperty("outhouseProfitCenter");
	}

	public void setPortMatchQty(BigDecimal portMatchQty)
	{
		writeProperty("portMatchQty", portMatchQty);
	}

	public BigDecimal getPortMatchQty()
	{
		return (BigDecimal) readProperty("portMatchQty");
	}

	public void setTransId(Integer transId)
	{
		writeProperty("transId", transId);
	}

	public Integer getTransId()
	{
		return (Integer) readProperty("transId");
	}

	public void setCommodity(Commodity commodity)
	{
		setToOneTarget("commodity", commodity, true);
	}

	public Commodity getCommodity()
	{
		return (Commodity) readProperty("commodity");
	}

	public void setUom(Uom uom)
	{
		setToOneTarget("uom", uom, true);
	}

	public Uom getUom()
	{
		return (Uom) readProperty("uom");
	}

	public void setUom1(Uom uom1)
	{
		setToOneTarget("uom1", uom1, true);
	}

	public Uom getUom1()
	{
		return (Uom) readProperty("uom1");
	}

}