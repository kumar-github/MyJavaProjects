package com.tc.app.exchangemonitor.model.cayenne.persistent.auto;

import java.math.BigDecimal;
import java.util.Date;

import org.apache.cayenne.CayenneDataObject;
import org.apache.cayenne.exp.Property;

import com.tc.app.exchangemonitor.model.cayenne.persistent.Commodity;

/**
 * Class _TradeItemPl was generated by Cayenne.
 * It is probably a good idea to avoid changing this class manually,
 * since it may be overwritten next time code is regenerated.
 * If you need to make any customizations, please use subclass.
 */
public abstract class _TradeItemPl extends CayenneDataObject
{

	private static final long serialVersionUID = 1L;

	public static final String ITEM_NUM_PK_COLUMN = "item_num";
	public static final String ORDER_NUM_PK_COLUMN = "order_num";
	public static final String TRADE_NUM_PK_COLUMN = "trade_num";

	public static final Property<Double> ADDL_COST_SUM = new Property<Double>("addlCostSum");
	public static final Property<Double> CONTR_MTM_PL = new Property<Double>("contrMtmPl");
	public static final Property<Double> MTM_PL = new Property<Double>("mtmPl");
	public static final Property<Date> PL_ASOF_DATE = new Property<Date>("plAsofDate");
	public static final Property<BigDecimal> PRICE_FX_RATE = new Property<BigDecimal>("priceFxRate");
	public static final Property<Integer> TRANS_ID = new Property<Integer>("transId");
	public static final Property<Commodity> COMMODITY = new Property<Commodity>("commodity");

	public void setAddlCostSum(Double addlCostSum)
	{
		writeProperty("addlCostSum", addlCostSum);
	}

	public Double getAddlCostSum()
	{
		return (Double) readProperty("addlCostSum");
	}

	public void setContrMtmPl(Double contrMtmPl)
	{
		writeProperty("contrMtmPl", contrMtmPl);
	}

	public Double getContrMtmPl()
	{
		return (Double) readProperty("contrMtmPl");
	}

	public void setMtmPl(Double mtmPl)
	{
		writeProperty("mtmPl", mtmPl);
	}

	public Double getMtmPl()
	{
		return (Double) readProperty("mtmPl");
	}

	public void setPlAsofDate(Date plAsofDate)
	{
		writeProperty("plAsofDate", plAsofDate);
	}

	public Date getPlAsofDate()
	{
		return (Date) readProperty("plAsofDate");
	}

	public void setPriceFxRate(BigDecimal priceFxRate)
	{
		writeProperty("priceFxRate", priceFxRate);
	}

	public BigDecimal getPriceFxRate()
	{
		return (BigDecimal) readProperty("priceFxRate");
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

}
