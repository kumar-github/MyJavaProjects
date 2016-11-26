package com.tc.app.exchangemonitor.model.cayenne.persistent.auto;

import java.math.BigDecimal;

import org.apache.cayenne.CayenneDataObject;
import org.apache.cayenne.exp.Property;

/**
 * Class _VVesselDistRev was generated by Cayenne.
 * It is probably a good idea to avoid changing this class manually,
 * since it may be overwritten next time code is regenerated.
 * If you need to make any customizations, please use subclass.
 */
public abstract class _VVesselDistRev extends CayenneDataObject
{

	private static final long serialVersionUID = 1L;

	public static final Property<BigDecimal> ALLOC_QTY = new Property<BigDecimal>("allocQty");
	public static final Property<Integer> ASOF_TRANS_ID = new Property<Integer>("asofTransId");
	public static final Property<BigDecimal> AVG_PRICE = new Property<BigDecimal>("avgPrice");
	public static final Property<Integer> COMMKT_KEY = new Property<Integer>("commktKey");
	public static final Property<BigDecimal> DIST_QTY = new Property<BigDecimal>("distQty");
	public static final Property<String> DIST_STATUS = new Property<String>("distStatus");
	public static final Property<String> DIST_TYPE = new Property<String>("distType");
	public static final Property<String> KEY1 = new Property<String>("key1");
	public static final Property<String> KEY2 = new Property<String>("key2");
	public static final Property<String> KEY3 = new Property<String>("key3");
	public static final Property<Integer> OID = new Property<Integer>("oid");
	public static final Property<String> P_SIND = new Property<String>("pSInd");
	public static final Property<Integer> POS_NUM = new Property<Integer>("posNum");
	public static final Property<String> PRICE_CURR_CODE = new Property<String>("priceCurrCode");
	public static final Property<String> PRICE_UOM_CODE = new Property<String>("priceUomCode");
	public static final Property<String> QTY_UOM_CODE = new Property<String>("qtyUomCode");
	public static final Property<Integer> REAL_PORT_NUM = new Property<Integer>("realPortNum");
	public static final Property<Integer> RESP_TRANS_ID = new Property<Integer>("respTransId");
	public static final Property<String> TRADING_PRD = new Property<String>("tradingPrd");
	public static final Property<Integer> TRANS_ID = new Property<Integer>("transId");

	public void setAllocQty(BigDecimal allocQty)
	{
		writeProperty("allocQty", allocQty);
	}

	public BigDecimal getAllocQty()
	{
		return (BigDecimal) readProperty("allocQty");
	}

	public void setAsofTransId(Integer asofTransId)
	{
		writeProperty("asofTransId", asofTransId);
	}

	public Integer getAsofTransId()
	{
		return (Integer) readProperty("asofTransId");
	}

	public void setAvgPrice(BigDecimal avgPrice)
	{
		writeProperty("avgPrice", avgPrice);
	}

	public BigDecimal getAvgPrice()
	{
		return (BigDecimal) readProperty("avgPrice");
	}

	public void setCommktKey(Integer commktKey)
	{
		writeProperty("commktKey", commktKey);
	}

	public Integer getCommktKey()
	{
		return (Integer) readProperty("commktKey");
	}

	public void setDistQty(BigDecimal distQty)
	{
		writeProperty("distQty", distQty);
	}

	public BigDecimal getDistQty()
	{
		return (BigDecimal) readProperty("distQty");
	}

	public void setDistStatus(String distStatus)
	{
		writeProperty("distStatus", distStatus);
	}

	public String getDistStatus()
	{
		return (String) readProperty("distStatus");
	}

	public void setDistType(String distType)
	{
		writeProperty("distType", distType);
	}

	public String getDistType()
	{
		return (String) readProperty("distType");
	}

	public void setKey1(String key1)
	{
		writeProperty("key1", key1);
	}

	public String getKey1()
	{
		return (String) readProperty("key1");
	}

	public void setKey2(String key2)
	{
		writeProperty("key2", key2);
	}

	public String getKey2()
	{
		return (String) readProperty("key2");
	}

	public void setKey3(String key3)
	{
		writeProperty("key3", key3);
	}

	public String getKey3()
	{
		return (String) readProperty("key3");
	}

	public void setOid(Integer oid)
	{
		writeProperty("oid", oid);
	}

	public Integer getOid()
	{
		return (Integer) readProperty("oid");
	}

	public void setPSInd(String pSInd)
	{
		writeProperty("pSInd", pSInd);
	}

	public String getPSInd()
	{
		return (String) readProperty("pSInd");
	}

	public void setPosNum(Integer posNum)
	{
		writeProperty("posNum", posNum);
	}

	public Integer getPosNum()
	{
		return (Integer) readProperty("posNum");
	}

	public void setPriceCurrCode(String priceCurrCode)
	{
		writeProperty("priceCurrCode", priceCurrCode);
	}

	public String getPriceCurrCode()
	{
		return (String) readProperty("priceCurrCode");
	}

	public void setPriceUomCode(String priceUomCode)
	{
		writeProperty("priceUomCode", priceUomCode);
	}

	public String getPriceUomCode()
	{
		return (String) readProperty("priceUomCode");
	}

	public void setQtyUomCode(String qtyUomCode)
	{
		writeProperty("qtyUomCode", qtyUomCode);
	}

	public String getQtyUomCode()
	{
		return (String) readProperty("qtyUomCode");
	}

	public void setRealPortNum(Integer realPortNum)
	{
		writeProperty("realPortNum", realPortNum);
	}

	public Integer getRealPortNum()
	{
		return (Integer) readProperty("realPortNum");
	}

	public void setRespTransId(Integer respTransId)
	{
		writeProperty("respTransId", respTransId);
	}

	public Integer getRespTransId()
	{
		return (Integer) readProperty("respTransId");
	}

	public void setTradingPrd(String tradingPrd)
	{
		writeProperty("tradingPrd", tradingPrd);
	}

	public String getTradingPrd()
	{
		return (String) readProperty("tradingPrd");
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
