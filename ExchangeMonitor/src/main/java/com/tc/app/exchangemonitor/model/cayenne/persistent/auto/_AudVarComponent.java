package com.tc.app.exchangemonitor.model.cayenne.persistent.auto;

import java.util.Date;

import org.apache.cayenne.CayenneDataObject;
import org.apache.cayenne.exp.Property;

/**
 * Class _AudVarComponent was generated by Cayenne.
 * It is probably a good idea to avoid changing this class manually,
 * since it may be overwritten next time code is regenerated.
 * If you need to make any customizations, please use subclass.
 */
public abstract class _AudVarComponent extends CayenneDataObject
{

	private static final long serialVersionUID = 1L;

	public static final Property<Double> ANNUAL_VOLATILITY = new Property<Double>("annualVolatility");
	public static final Property<String> CMDTY_CODE = new Property<String>("cmdtyCode");
	public static final Property<Integer> COMMKT_KEY = new Property<Integer>("commktKey");
	public static final Property<Double> COMPONENT_AMT = new Property<Double>("componentAmt");
	public static final Property<Date> DATE_OP = new Property<Date>("dateOp");
	public static final Property<String> MKT_CODE = new Property<String>("mktCode");
	public static final Property<Double> OPEN_QTY = new Property<Double>("openQty");
	public static final Property<String> OPEN_QTY_UOM_CODE = new Property<String>("openQtyUomCode");
	public static final Property<String> OPERATION = new Property<String>("operation");
	public static final Property<String> PORT_NUM_LIST = new Property<String>("portNumList");
	public static final Property<String> PRICE_SOURCE_CODE = new Property<String>("priceSourceCode");
	public static final Property<String> PRICE_TYPE = new Property<String>("priceType");
	public static final Property<Integer> ROWID = new Property<Integer>("rowid");
	public static final Property<Double> SETTL_EXCH_RATE = new Property<Double>("settlExchRate");
	public static final Property<Double> SETTL_PRICE = new Property<Double>("settlPrice");
	public static final Property<String> SETTL_PRICE_CURR_CODE = new Property<String>("settlPriceCurrCode");
	public static final Property<Date> TIME_HOR_CALC_DATE = new Property<Date>("timeHorCalcDate");
	public static final Property<String> TIME_HOR_CALC_USER_INIT = new Property<String>("timeHorCalcUserInit");
	public static final Property<Double> TIME_HOR_COMPONENT_AMT = new Property<Double>("timeHorComponentAmt");
	public static final Property<Double> TIME_HOR_EXCH_RATE = new Property<Double>("timeHorExchRate");
	public static final Property<Double> TIME_HOR_PRICE = new Property<Double>("timeHorPrice");
	public static final Property<String> TIME_HOR_PRICE_CURR_CODE = new Property<String>("timeHorPriceCurrCode");
	public static final Property<Date> TIME_HOR_PRICE_DATE = new Property<Date>("timeHorPriceDate");
	public static final Property<String> TRADING_PRD = new Property<String>("tradingPrd");
	public static final Property<String> USERID = new Property<String>("userid");
	public static final Property<Double> VAR_AMT = new Property<Double>("varAmt");
	public static final Property<Double> VAR_PCT = new Property<Double>("varPct");
	public static final Property<Integer> VAR_RUN_ID = new Property<Integer>("varRunId");

	public void setAnnualVolatility(Double annualVolatility)
	{
		writeProperty("annualVolatility", annualVolatility);
	}

	public Double getAnnualVolatility()
	{
		return (Double) readProperty("annualVolatility");
	}

	public void setCmdtyCode(String cmdtyCode)
	{
		writeProperty("cmdtyCode", cmdtyCode);
	}

	public String getCmdtyCode()
	{
		return (String) readProperty("cmdtyCode");
	}

	public void setCommktKey(Integer commktKey)
	{
		writeProperty("commktKey", commktKey);
	}

	public Integer getCommktKey()
	{
		return (Integer) readProperty("commktKey");
	}

	public void setComponentAmt(Double componentAmt)
	{
		writeProperty("componentAmt", componentAmt);
	}

	public Double getComponentAmt()
	{
		return (Double) readProperty("componentAmt");
	}

	public void setDateOp(Date dateOp)
	{
		writeProperty("dateOp", dateOp);
	}

	public Date getDateOp()
	{
		return (Date) readProperty("dateOp");
	}

	public void setMktCode(String mktCode)
	{
		writeProperty("mktCode", mktCode);
	}

	public String getMktCode()
	{
		return (String) readProperty("mktCode");
	}

	public void setOpenQty(Double openQty)
	{
		writeProperty("openQty", openQty);
	}

	public Double getOpenQty()
	{
		return (Double) readProperty("openQty");
	}

	public void setOpenQtyUomCode(String openQtyUomCode)
	{
		writeProperty("openQtyUomCode", openQtyUomCode);
	}

	public String getOpenQtyUomCode()
	{
		return (String) readProperty("openQtyUomCode");
	}

	public void setOperation(String operation)
	{
		writeProperty("operation", operation);
	}

	public String getOperation()
	{
		return (String) readProperty("operation");
	}

	public void setPortNumList(String portNumList)
	{
		writeProperty("portNumList", portNumList);
	}

	public String getPortNumList()
	{
		return (String) readProperty("portNumList");
	}

	public void setPriceSourceCode(String priceSourceCode)
	{
		writeProperty("priceSourceCode", priceSourceCode);
	}

	public String getPriceSourceCode()
	{
		return (String) readProperty("priceSourceCode");
	}

	public void setPriceType(String priceType)
	{
		writeProperty("priceType", priceType);
	}

	public String getPriceType()
	{
		return (String) readProperty("priceType");
	}

	public void setRowid(Integer rowid)
	{
		writeProperty("rowid", rowid);
	}

	public Integer getRowid()
	{
		return (Integer) readProperty("rowid");
	}

	public void setSettlExchRate(Double settlExchRate)
	{
		writeProperty("settlExchRate", settlExchRate);
	}

	public Double getSettlExchRate()
	{
		return (Double) readProperty("settlExchRate");
	}

	public void setSettlPrice(Double settlPrice)
	{
		writeProperty("settlPrice", settlPrice);
	}

	public Double getSettlPrice()
	{
		return (Double) readProperty("settlPrice");
	}

	public void setSettlPriceCurrCode(String settlPriceCurrCode)
	{
		writeProperty("settlPriceCurrCode", settlPriceCurrCode);
	}

	public String getSettlPriceCurrCode()
	{
		return (String) readProperty("settlPriceCurrCode");
	}

	public void setTimeHorCalcDate(Date timeHorCalcDate)
	{
		writeProperty("timeHorCalcDate", timeHorCalcDate);
	}

	public Date getTimeHorCalcDate()
	{
		return (Date) readProperty("timeHorCalcDate");
	}

	public void setTimeHorCalcUserInit(String timeHorCalcUserInit)
	{
		writeProperty("timeHorCalcUserInit", timeHorCalcUserInit);
	}

	public String getTimeHorCalcUserInit()
	{
		return (String) readProperty("timeHorCalcUserInit");
	}

	public void setTimeHorComponentAmt(Double timeHorComponentAmt)
	{
		writeProperty("timeHorComponentAmt", timeHorComponentAmt);
	}

	public Double getTimeHorComponentAmt()
	{
		return (Double) readProperty("timeHorComponentAmt");
	}

	public void setTimeHorExchRate(Double timeHorExchRate)
	{
		writeProperty("timeHorExchRate", timeHorExchRate);
	}

	public Double getTimeHorExchRate()
	{
		return (Double) readProperty("timeHorExchRate");
	}

	public void setTimeHorPrice(Double timeHorPrice)
	{
		writeProperty("timeHorPrice", timeHorPrice);
	}

	public Double getTimeHorPrice()
	{
		return (Double) readProperty("timeHorPrice");
	}

	public void setTimeHorPriceCurrCode(String timeHorPriceCurrCode)
	{
		writeProperty("timeHorPriceCurrCode", timeHorPriceCurrCode);
	}

	public String getTimeHorPriceCurrCode()
	{
		return (String) readProperty("timeHorPriceCurrCode");
	}

	public void setTimeHorPriceDate(Date timeHorPriceDate)
	{
		writeProperty("timeHorPriceDate", timeHorPriceDate);
	}

	public Date getTimeHorPriceDate()
	{
		return (Date) readProperty("timeHorPriceDate");
	}

	public void setTradingPrd(String tradingPrd)
	{
		writeProperty("tradingPrd", tradingPrd);
	}

	public String getTradingPrd()
	{
		return (String) readProperty("tradingPrd");
	}

	public void setUserid(String userid)
	{
		writeProperty("userid", userid);
	}

	public String getUserid()
	{
		return (String) readProperty("userid");
	}

	public void setVarAmt(Double varAmt)
	{
		writeProperty("varAmt", varAmt);
	}

	public Double getVarAmt()
	{
		return (Double) readProperty("varAmt");
	}

	public void setVarPct(Double varPct)
	{
		writeProperty("varPct", varPct);
	}

	public Double getVarPct()
	{
		return (Double) readProperty("varPct");
	}

	public void setVarRunId(Integer varRunId)
	{
		writeProperty("varRunId", varRunId);
	}

	public Integer getVarRunId()
	{
		return (Integer) readProperty("varRunId");
	}

}
