package com.tc.app.exchangemonitor.model.cayenne.persistent.auto;

import org.apache.cayenne.CayenneDataObject;
import org.apache.cayenne.exp.Property;

/**
 * Class _AudSpreadComposition was generated by Cayenne.
 * It is probably a good idea to avoid changing this class manually,
 * since it may be overwritten next time code is regenerated.
 * If you need to make any customizations, please use subclass.
 */
public abstract class _AudSpreadComposition extends CayenneDataObject
{

	private static final long serialVersionUID = 1L;

	public static final Property<String> COMP_CMDTY_CODE = new Property<String>("compCmdtyCode");
	public static final Property<String> LONG_SHORT_IND = new Property<String>("longShortInd");
	public static final Property<Integer> PRODUCT_ID = new Property<Integer>("productId");
	public static final Property<Integer> RESP_TRANS_ID = new Property<Integer>("respTransId");
	public static final Property<String> SPREAD_CMDTY_CODE = new Property<String>("spreadCmdtyCode");
	public static final Property<Integer> SPREAD_QTY_FACTOR = new Property<Integer>("spreadQtyFactor");
	public static final Property<Integer> TRADING_PRD_OFFSET = new Property<Integer>("tradingPrdOffset");
	public static final Property<Integer> TRANS_ID = new Property<Integer>("transId");

	public void setCompCmdtyCode(String compCmdtyCode)
	{
		writeProperty("compCmdtyCode", compCmdtyCode);
	}

	public String getCompCmdtyCode()
	{
		return (String) readProperty("compCmdtyCode");
	}

	public void setLongShortInd(String longShortInd)
	{
		writeProperty("longShortInd", longShortInd);
	}

	public String getLongShortInd()
	{
		return (String) readProperty("longShortInd");
	}

	public void setProductId(Integer productId)
	{
		writeProperty("productId", productId);
	}

	public Integer getProductId()
	{
		return (Integer) readProperty("productId");
	}

	public void setRespTransId(Integer respTransId)
	{
		writeProperty("respTransId", respTransId);
	}

	public Integer getRespTransId()
	{
		return (Integer) readProperty("respTransId");
	}

	public void setSpreadCmdtyCode(String spreadCmdtyCode)
	{
		writeProperty("spreadCmdtyCode", spreadCmdtyCode);
	}

	public String getSpreadCmdtyCode()
	{
		return (String) readProperty("spreadCmdtyCode");
	}

	public void setSpreadQtyFactor(Integer spreadQtyFactor)
	{
		writeProperty("spreadQtyFactor", spreadQtyFactor);
	}

	public Integer getSpreadQtyFactor()
	{
		return (Integer) readProperty("spreadQtyFactor");
	}

	public void setTradingPrdOffset(Integer tradingPrdOffset)
	{
		writeProperty("tradingPrdOffset", tradingPrdOffset);
	}

	public Integer getTradingPrdOffset()
	{
		return (Integer) readProperty("tradingPrdOffset");
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
