package com.tc.app.exchangemonitor.model.cayenne.persistent.auto;

import java.math.BigDecimal;
import java.util.Date;

import org.apache.cayenne.CayenneDataObject;
import org.apache.cayenne.exp.Property;

/**
 * Class _AudTidMtmVolatility was generated by Cayenne.
 * It is probably a good idea to avoid changing this class manually,
 * since it may be overwritten next time code is regenerated.
 * If you need to make any customizations, please use subclass.
 */
public abstract class _AudTidMtmVolatility extends CayenneDataObject
{

	private static final long serialVersionUID = 1L;

	public static final Property<String> CURR_CODE = new Property<String>("currCode");
	public static final Property<Integer> DIST_NUM = new Property<Integer>("distNum");
	public static final Property<Date> MTM_PL_ASOF_DATE = new Property<Date>("mtmPlAsofDate");
	public static final Property<Integer> RESP_TRANS_ID = new Property<Integer>("respTransId");
	public static final Property<BigDecimal> SKEW_PRICE = new Property<BigDecimal>("skewPrice");
	public static final Property<BigDecimal> STRIKE_PRICE = new Property<BigDecimal>("strikePrice");
	public static final Property<Integer> TRANS_ID = new Property<Integer>("transId");
	public static final Property<String> UOM_CODE = new Property<String>("uomCode");
	public static final Property<String> USE_OPTION_SKEW = new Property<String>("useOptionSkew");
	public static final Property<Integer> VOL_NUM = new Property<Integer>("volNum");
	public static final Property<BigDecimal> VOLATILITY = new Property<BigDecimal>("volatility");

	public void setCurrCode(String currCode)
	{
		writeProperty("currCode", currCode);
	}

	public String getCurrCode()
	{
		return (String) readProperty("currCode");
	}

	public void setDistNum(Integer distNum)
	{
		writeProperty("distNum", distNum);
	}

	public Integer getDistNum()
	{
		return (Integer) readProperty("distNum");
	}

	public void setMtmPlAsofDate(Date mtmPlAsofDate)
	{
		writeProperty("mtmPlAsofDate", mtmPlAsofDate);
	}

	public Date getMtmPlAsofDate()
	{
		return (Date) readProperty("mtmPlAsofDate");
	}

	public void setRespTransId(Integer respTransId)
	{
		writeProperty("respTransId", respTransId);
	}

	public Integer getRespTransId()
	{
		return (Integer) readProperty("respTransId");
	}

	public void setSkewPrice(BigDecimal skewPrice)
	{
		writeProperty("skewPrice", skewPrice);
	}

	public BigDecimal getSkewPrice()
	{
		return (BigDecimal) readProperty("skewPrice");
	}

	public void setStrikePrice(BigDecimal strikePrice)
	{
		writeProperty("strikePrice", strikePrice);
	}

	public BigDecimal getStrikePrice()
	{
		return (BigDecimal) readProperty("strikePrice");
	}

	public void setTransId(Integer transId)
	{
		writeProperty("transId", transId);
	}

	public Integer getTransId()
	{
		return (Integer) readProperty("transId");
	}

	public void setUomCode(String uomCode)
	{
		writeProperty("uomCode", uomCode);
	}

	public String getUomCode()
	{
		return (String) readProperty("uomCode");
	}

	public void setUseOptionSkew(String useOptionSkew)
	{
		writeProperty("useOptionSkew", useOptionSkew);
	}

	public String getUseOptionSkew()
	{
		return (String) readProperty("useOptionSkew");
	}

	public void setVolNum(Integer volNum)
	{
		writeProperty("volNum", volNum);
	}

	public Integer getVolNum()
	{
		return (Integer) readProperty("volNum");
	}

	public void setVolatility(BigDecimal volatility)
	{
		writeProperty("volatility", volatility);
	}

	public BigDecimal getVolatility()
	{
		return (BigDecimal) readProperty("volatility");
	}

}