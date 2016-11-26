package com.tc.app.exchangemonitor.model.cayenne.persistent.auto;

import java.math.BigDecimal;
import java.util.Date;

import org.apache.cayenne.CayenneDataObject;
import org.apache.cayenne.exp.Property;

/**
 * Class _VFxExposureDistAllRs was generated by Cayenne.
 * It is probably a good idea to avoid changing this class manually,
 * since it may be overwritten next time code is regenerated.
 * If you need to make any customizations, please use subclass.
 */
public abstract class _VFxExposureDistAllRs extends CayenneDataObject
{

	private static final long serialVersionUID = 1L;

	public static final Property<String> APP_NAME = new Property<String>("appName");
	public static final Property<BigDecimal> FX_AMT = new Property<BigDecimal>("fxAmt");
	public static final Property<String> FX_CUSTOM_COLUMN1 = new Property<String>("fxCustomColumn1");
	public static final Property<String> FX_CUSTOM_COLUMN2 = new Property<String>("fxCustomColumn2");
	public static final Property<String> FX_CUSTOM_COLUMN3 = new Property<String>("fxCustomColumn3");
	public static final Property<String> FX_CUSTOM_COLUMN4 = new Property<String>("fxCustomColumn4");
	public static final Property<Date> FX_DROP_DATE = new Property<Date>("fxDropDate");
	public static final Property<Integer> FX_EXP_NUM = new Property<Integer>("fxExpNum");
	public static final Property<String> FX_OWNER_CODE = new Property<String>("fxOwnerCode");
	public static final Property<Integer> FX_OWNER_KEY1 = new Property<Integer>("fxOwnerKey1");
	public static final Property<Integer> FX_OWNER_KEY2 = new Property<Integer>("fxOwnerKey2");
	public static final Property<Integer> FX_OWNER_KEY3 = new Property<Integer>("fxOwnerKey3");
	public static final Property<Integer> FX_OWNER_KEY4 = new Property<Integer>("fxOwnerKey4");
	public static final Property<Integer> FX_OWNER_KEY5 = new Property<Integer>("fxOwnerKey5");
	public static final Property<Integer> FX_OWNER_KEY6 = new Property<Integer>("fxOwnerKey6");
	public static final Property<BigDecimal> FX_PRICE = new Property<BigDecimal>("fxPrice");
	public static final Property<String> FX_PRICE_CURR_CODE = new Property<String>("fxPriceCurrCode");
	public static final Property<String> FX_PRICE_UOM_CODE = new Property<String>("fxPriceUomCode");
	public static final Property<BigDecimal> FX_PRICED_AMT = new Property<BigDecimal>("fxPricedAmt");
	public static final Property<BigDecimal> FX_QTY = new Property<BigDecimal>("fxQty");
	public static final Property<String> FX_QTY_UOM_CODE = new Property<String>("fxQtyUomCode");
	public static final Property<Integer> FX_REAL_PORT_NUM = new Property<Integer>("fxRealPortNum");
	public static final Property<Short> ITEM_NUM = new Property<Short>("itemNum");
	public static final Property<Integer> OID = new Property<Integer>("oid");
	public static final Property<Short> ORDER_NUM = new Property<Short>("orderNum");
	public static final Property<Integer> RESP_TRANS_ID = new Property<Integer>("respTransId");
	public static final Property<BigDecimal> SEQUENCE = new Property<BigDecimal>("sequence");
	public static final Property<Integer> TRADE_NUM = new Property<Integer>("tradeNum");
	public static final Property<Date> TRAN_DATE = new Property<Date>("tranDate");
	public static final Property<Integer> TRANS_ID = new Property<Integer>("transId");
	public static final Property<String> TRANS_TYPE = new Property<String>("transType");
	public static final Property<String> TRANS_USER_INIT = new Property<String>("transUserInit");
	public static final Property<String> WORKSTATION_ID = new Property<String>("workstationId");

	public void setAppName(String appName)
	{
		writeProperty("appName", appName);
	}

	public String getAppName()
	{
		return (String) readProperty("appName");
	}

	public void setFxAmt(BigDecimal fxAmt)
	{
		writeProperty("fxAmt", fxAmt);
	}

	public BigDecimal getFxAmt()
	{
		return (BigDecimal) readProperty("fxAmt");
	}

	public void setFxCustomColumn1(String fxCustomColumn1)
	{
		writeProperty("fxCustomColumn1", fxCustomColumn1);
	}

	public String getFxCustomColumn1()
	{
		return (String) readProperty("fxCustomColumn1");
	}

	public void setFxCustomColumn2(String fxCustomColumn2)
	{
		writeProperty("fxCustomColumn2", fxCustomColumn2);
	}

	public String getFxCustomColumn2()
	{
		return (String) readProperty("fxCustomColumn2");
	}

	public void setFxCustomColumn3(String fxCustomColumn3)
	{
		writeProperty("fxCustomColumn3", fxCustomColumn3);
	}

	public String getFxCustomColumn3()
	{
		return (String) readProperty("fxCustomColumn3");
	}

	public void setFxCustomColumn4(String fxCustomColumn4)
	{
		writeProperty("fxCustomColumn4", fxCustomColumn4);
	}

	public String getFxCustomColumn4()
	{
		return (String) readProperty("fxCustomColumn4");
	}

	public void setFxDropDate(Date fxDropDate)
	{
		writeProperty("fxDropDate", fxDropDate);
	}

	public Date getFxDropDate()
	{
		return (Date) readProperty("fxDropDate");
	}

	public void setFxExpNum(Integer fxExpNum)
	{
		writeProperty("fxExpNum", fxExpNum);
	}

	public Integer getFxExpNum()
	{
		return (Integer) readProperty("fxExpNum");
	}

	public void setFxOwnerCode(String fxOwnerCode)
	{
		writeProperty("fxOwnerCode", fxOwnerCode);
	}

	public String getFxOwnerCode()
	{
		return (String) readProperty("fxOwnerCode");
	}

	public void setFxOwnerKey1(Integer fxOwnerKey1)
	{
		writeProperty("fxOwnerKey1", fxOwnerKey1);
	}

	public Integer getFxOwnerKey1()
	{
		return (Integer) readProperty("fxOwnerKey1");
	}

	public void setFxOwnerKey2(Integer fxOwnerKey2)
	{
		writeProperty("fxOwnerKey2", fxOwnerKey2);
	}

	public Integer getFxOwnerKey2()
	{
		return (Integer) readProperty("fxOwnerKey2");
	}

	public void setFxOwnerKey3(Integer fxOwnerKey3)
	{
		writeProperty("fxOwnerKey3", fxOwnerKey3);
	}

	public Integer getFxOwnerKey3()
	{
		return (Integer) readProperty("fxOwnerKey3");
	}

	public void setFxOwnerKey4(Integer fxOwnerKey4)
	{
		writeProperty("fxOwnerKey4", fxOwnerKey4);
	}

	public Integer getFxOwnerKey4()
	{
		return (Integer) readProperty("fxOwnerKey4");
	}

	public void setFxOwnerKey5(Integer fxOwnerKey5)
	{
		writeProperty("fxOwnerKey5", fxOwnerKey5);
	}

	public Integer getFxOwnerKey5()
	{
		return (Integer) readProperty("fxOwnerKey5");
	}

	public void setFxOwnerKey6(Integer fxOwnerKey6)
	{
		writeProperty("fxOwnerKey6", fxOwnerKey6);
	}

	public Integer getFxOwnerKey6()
	{
		return (Integer) readProperty("fxOwnerKey6");
	}

	public void setFxPrice(BigDecimal fxPrice)
	{
		writeProperty("fxPrice", fxPrice);
	}

	public BigDecimal getFxPrice()
	{
		return (BigDecimal) readProperty("fxPrice");
	}

	public void setFxPriceCurrCode(String fxPriceCurrCode)
	{
		writeProperty("fxPriceCurrCode", fxPriceCurrCode);
	}

	public String getFxPriceCurrCode()
	{
		return (String) readProperty("fxPriceCurrCode");
	}

	public void setFxPriceUomCode(String fxPriceUomCode)
	{
		writeProperty("fxPriceUomCode", fxPriceUomCode);
	}

	public String getFxPriceUomCode()
	{
		return (String) readProperty("fxPriceUomCode");
	}

	public void setFxPricedAmt(BigDecimal fxPricedAmt)
	{
		writeProperty("fxPricedAmt", fxPricedAmt);
	}

	public BigDecimal getFxPricedAmt()
	{
		return (BigDecimal) readProperty("fxPricedAmt");
	}

	public void setFxQty(BigDecimal fxQty)
	{
		writeProperty("fxQty", fxQty);
	}

	public BigDecimal getFxQty()
	{
		return (BigDecimal) readProperty("fxQty");
	}

	public void setFxQtyUomCode(String fxQtyUomCode)
	{
		writeProperty("fxQtyUomCode", fxQtyUomCode);
	}

	public String getFxQtyUomCode()
	{
		return (String) readProperty("fxQtyUomCode");
	}

	public void setFxRealPortNum(Integer fxRealPortNum)
	{
		writeProperty("fxRealPortNum", fxRealPortNum);
	}

	public Integer getFxRealPortNum()
	{
		return (Integer) readProperty("fxRealPortNum");
	}

	public void setItemNum(Short itemNum)
	{
		writeProperty("itemNum", itemNum);
	}

	public Short getItemNum()
	{
		return (Short) readProperty("itemNum");
	}

	public void setOid(Integer oid)
	{
		writeProperty("oid", oid);
	}

	public Integer getOid()
	{
		return (Integer) readProperty("oid");
	}

	public void setOrderNum(Short orderNum)
	{
		writeProperty("orderNum", orderNum);
	}

	public Short getOrderNum()
	{
		return (Short) readProperty("orderNum");
	}

	public void setRespTransId(Integer respTransId)
	{
		writeProperty("respTransId", respTransId);
	}

	public Integer getRespTransId()
	{
		return (Integer) readProperty("respTransId");
	}

	public void setSequence(BigDecimal sequence)
	{
		writeProperty("sequence", sequence);
	}

	public BigDecimal getSequence()
	{
		return (BigDecimal) readProperty("sequence");
	}

	public void setTradeNum(Integer tradeNum)
	{
		writeProperty("tradeNum", tradeNum);
	}

	public Integer getTradeNum()
	{
		return (Integer) readProperty("tradeNum");
	}

	public void setTranDate(Date tranDate)
	{
		writeProperty("tranDate", tranDate);
	}

	public Date getTranDate()
	{
		return (Date) readProperty("tranDate");
	}

	public void setTransId(Integer transId)
	{
		writeProperty("transId", transId);
	}

	public Integer getTransId()
	{
		return (Integer) readProperty("transId");
	}

	public void setTransType(String transType)
	{
		writeProperty("transType", transType);
	}

	public String getTransType()
	{
		return (String) readProperty("transType");
	}

	public void setTransUserInit(String transUserInit)
	{
		writeProperty("transUserInit", transUserInit);
	}

	public String getTransUserInit()
	{
		return (String) readProperty("transUserInit");
	}

	public void setWorkstationId(String workstationId)
	{
		writeProperty("workstationId", workstationId);
	}

	public String getWorkstationId()
	{
		return (String) readProperty("workstationId");
	}

}
