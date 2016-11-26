package com.tc.app.exchangemonitor.model.cayenne.persistent.auto;

import java.util.Date;

import org.apache.cayenne.CayenneDataObject;
import org.apache.cayenne.exp.Property;

/**
 * Class _VBcpQuotePrice60 was generated by Cayenne.
 * It is probably a good idea to avoid changing this class manually,
 * since it may be overwritten next time code is regenerated.
 * If you need to make any customizations, please use subclass.
 */
public abstract class _VBcpQuotePrice60 extends CayenneDataObject
{

	private static final long serialVersionUID = 1L;

	public static final Property<Short> ACCUM_NUM = new Property<Short>("accumNum");
	public static final Property<Double> FINAL_PRICE = new Property<Double>("finalPrice");
	public static final Property<Short> ITEM_NUM = new Property<Short>("itemNum");
	public static final Property<String> MANUAL_OVERRIDE_TYPE = new Property<String>("manualOverrideType");
	public static final Property<Date> NOMINAL_DATE = new Property<Date>("nominalDate");
	public static final Property<Short> ORDER_NUM = new Property<Short>("orderNum");
	public static final Property<String> PRICE_CURR_CODE = new Property<String>("priceCurrCode");
	public static final Property<Date> PRICE_QUOTE_DATE = new Property<Date>("priceQuoteDate");
	public static final Property<String> PRICE_UOM_CODE = new Property<String>("priceUomCode");
	public static final Property<String> PRICE_USED_IND = new Property<String>("priceUsedInd");
	public static final Property<Short> QPP_NUM = new Property<Short>("qppNum");
	public static final Property<Integer> TRADE_NUM = new Property<Integer>("tradeNum");
	public static final Property<Integer> TRANS_ID = new Property<Integer>("transId");

	public void setAccumNum(Short accumNum)
	{
		writeProperty("accumNum", accumNum);
	}

	public Short getAccumNum()
	{
		return (Short) readProperty("accumNum");
	}

	public void setFinalPrice(Double finalPrice)
	{
		writeProperty("finalPrice", finalPrice);
	}

	public Double getFinalPrice()
	{
		return (Double) readProperty("finalPrice");
	}

	public void setItemNum(Short itemNum)
	{
		writeProperty("itemNum", itemNum);
	}

	public Short getItemNum()
	{
		return (Short) readProperty("itemNum");
	}

	public void setManualOverrideType(String manualOverrideType)
	{
		writeProperty("manualOverrideType", manualOverrideType);
	}

	public String getManualOverrideType()
	{
		return (String) readProperty("manualOverrideType");
	}

	public void setNominalDate(Date nominalDate)
	{
		writeProperty("nominalDate", nominalDate);
	}

	public Date getNominalDate()
	{
		return (Date) readProperty("nominalDate");
	}

	public void setOrderNum(Short orderNum)
	{
		writeProperty("orderNum", orderNum);
	}

	public Short getOrderNum()
	{
		return (Short) readProperty("orderNum");
	}

	public void setPriceCurrCode(String priceCurrCode)
	{
		writeProperty("priceCurrCode", priceCurrCode);
	}

	public String getPriceCurrCode()
	{
		return (String) readProperty("priceCurrCode");
	}

	public void setPriceQuoteDate(Date priceQuoteDate)
	{
		writeProperty("priceQuoteDate", priceQuoteDate);
	}

	public Date getPriceQuoteDate()
	{
		return (Date) readProperty("priceQuoteDate");
	}

	public void setPriceUomCode(String priceUomCode)
	{
		writeProperty("priceUomCode", priceUomCode);
	}

	public String getPriceUomCode()
	{
		return (String) readProperty("priceUomCode");
	}

	public void setPriceUsedInd(String priceUsedInd)
	{
		writeProperty("priceUsedInd", priceUsedInd);
	}

	public String getPriceUsedInd()
	{
		return (String) readProperty("priceUsedInd");
	}

	public void setQppNum(Short qppNum)
	{
		writeProperty("qppNum", qppNum);
	}

	public Short getQppNum()
	{
		return (Short) readProperty("qppNum");
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

}
