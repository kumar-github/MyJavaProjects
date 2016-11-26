package com.tc.app.exchangemonitor.model.cayenne.persistent.auto;

import org.apache.cayenne.CayenneDataObject;
import org.apache.cayenne.exp.Property;

import com.tc.app.exchangemonitor.model.cayenne.persistent.AliasSource;
import com.tc.app.exchangemonitor.model.cayenne.persistent.Commodity;
import com.tc.app.exchangemonitor.model.cayenne.persistent.CommodityMarket;
import com.tc.app.exchangemonitor.model.cayenne.persistent.IctsUser;
import com.tc.app.exchangemonitor.model.cayenne.persistent.PriceSource;
import com.tc.app.exchangemonitor.model.cayenne.persistent.Uom;

/**
 * Class _CommktFutureAttr was generated by Cayenne.
 * It is probably a good idea to avoid changing this class manually,
 * since it may be overwritten next time code is regenerated.
 * If you need to make any customizations, please use subclass.
 */
public abstract class _CommktFutureAttr extends CayenneDataObject
{

	private static final long serialVersionUID = 1L;

	public static final String COMMKT_KEY_PK_COLUMN = "commkt_key";

	public static final Property<String> COMMKT_FOREX_CMDTY_CODE = new Property<String>("commktForexCmdtyCode");
	public static final Property<String> COMMKT_FOREX_MKT_CODE = new Property<String>("commktForexMktCode");
	public static final Property<String> COMMKT_FORMULA_TYPE = new Property<String>("commktFormulaType");
	public static final Property<String> COMMKT_FUT_ATTR_STATUS = new Property<String>("commktFutAttrStatus");
	public static final Property<Double> COMMKT_FWD_MTH_QTY = new Property<Double>("commktFwdMthQty");
	public static final Property<String> COMMKT_INTERPOL_TYPE = new Property<String>("commktInterpolType");
	public static final Property<String> COMMKT_LIMIT_MOVE_IND = new Property<String>("commktLimitMoveInd");
	public static final Property<Double> COMMKT_LOT_SIZE = new Property<Double>("commktLotSize");
	public static final Property<Double> COMMKT_MAX_PRICE_VAR = new Property<Double>("commktMaxPriceVar");
	public static final Property<Double> COMMKT_MIN_PRICE_VAR = new Property<Double>("commktMinPriceVar");
	public static final Property<String> COMMKT_NEARBY_MASK = new Property<String>("commktNearbyMask");
	public static final Property<Short> COMMKT_NUM_MTH_OUT = new Property<Short>("commktNumMthOut");
	public static final Property<Double> COMMKT_POINT_CONV_NUM = new Property<Double>("commktPointConvNum");
	public static final Property<String> COMMKT_PRICE_DIV_MUL_IND = new Property<String>("commktPriceDivMulInd");
	public static final Property<String> COMMKT_PRICE_FMT = new Property<String>("commktPriceFmt");
	public static final Property<String> COMMKT_PRICE_FREQ = new Property<String>("commktPriceFreq");
	public static final Property<String> COMMKT_PRICE_FREQ_AS_OF = new Property<String>("commktPriceFreqAsOf");
	public static final Property<String> COMMKT_PRICE_SERIES = new Property<String>("commktPriceSeries");
	public static final Property<String> COMMKT_SAME_AS_CMDTY_CODE = new Property<String>("commktSameAsCmdtyCode");
	public static final Property<String> COMMKT_SAME_AS_MKT_CODE = new Property<String>("commktSameAsMktCode");
	public static final Property<String> COMMKT_SETTLEMENT_IND = new Property<String>("commktSettlementInd");
	public static final Property<Double> COMMKT_SPOT_MTH_QTY = new Property<Double>("commktSpotMthQty");
	public static final Property<String> COMMKT_SPOT_PRD = new Property<String>("commktSpotPrd");
	public static final Property<String> COMMKT_SUPPORT_PRICE_TYPE = new Property<String>("commktSupportPriceType");
	public static final Property<Double> COMMKT_TOTAL_OPEN_QTY = new Property<Double>("commktTotalOpenQty");
	public static final Property<String> COMMKT_TRADING_MTH_IND = new Property<String>("commktTradingMthInd");
	public static final Property<Integer> TRANS_ID = new Property<Integer>("transId");
	public static final Property<AliasSource> ALIAS_SOURCE = new Property<AliasSource>("aliasSource");
	public static final Property<Commodity> COMMODITY = new Property<Commodity>("commodity");
	public static final Property<CommodityMarket> COMMODITY_MARKET = new Property<CommodityMarket>("commodityMarket");
	public static final Property<IctsUser> ICTS_USER = new Property<IctsUser>("ictsUser");
	public static final Property<PriceSource> PRICE_SOURCE = new Property<PriceSource>("priceSource");
	public static final Property<Uom> UOM = new Property<Uom>("uom");
	public static final Property<Uom> UOM1 = new Property<Uom>("uom1");

	public void setCommktForexCmdtyCode(String commktForexCmdtyCode)
	{
		writeProperty("commktForexCmdtyCode", commktForexCmdtyCode);
	}

	public String getCommktForexCmdtyCode()
	{
		return (String) readProperty("commktForexCmdtyCode");
	}

	public void setCommktForexMktCode(String commktForexMktCode)
	{
		writeProperty("commktForexMktCode", commktForexMktCode);
	}

	public String getCommktForexMktCode()
	{
		return (String) readProperty("commktForexMktCode");
	}

	public void setCommktFormulaType(String commktFormulaType)
	{
		writeProperty("commktFormulaType", commktFormulaType);
	}

	public String getCommktFormulaType()
	{
		return (String) readProperty("commktFormulaType");
	}

	public void setCommktFutAttrStatus(String commktFutAttrStatus)
	{
		writeProperty("commktFutAttrStatus", commktFutAttrStatus);
	}

	public String getCommktFutAttrStatus()
	{
		return (String) readProperty("commktFutAttrStatus");
	}

	public void setCommktFwdMthQty(Double commktFwdMthQty)
	{
		writeProperty("commktFwdMthQty", commktFwdMthQty);
	}

	public Double getCommktFwdMthQty()
	{
		return (Double) readProperty("commktFwdMthQty");
	}

	public void setCommktInterpolType(String commktInterpolType)
	{
		writeProperty("commktInterpolType", commktInterpolType);
	}

	public String getCommktInterpolType()
	{
		return (String) readProperty("commktInterpolType");
	}

	public void setCommktLimitMoveInd(String commktLimitMoveInd)
	{
		writeProperty("commktLimitMoveInd", commktLimitMoveInd);
	}

	public String getCommktLimitMoveInd()
	{
		return (String) readProperty("commktLimitMoveInd");
	}

	public void setCommktLotSize(Double commktLotSize)
	{
		writeProperty("commktLotSize", commktLotSize);
	}

	public Double getCommktLotSize()
	{
		return (Double) readProperty("commktLotSize");
	}

	public void setCommktMaxPriceVar(Double commktMaxPriceVar)
	{
		writeProperty("commktMaxPriceVar", commktMaxPriceVar);
	}

	public Double getCommktMaxPriceVar()
	{
		return (Double) readProperty("commktMaxPriceVar");
	}

	public void setCommktMinPriceVar(Double commktMinPriceVar)
	{
		writeProperty("commktMinPriceVar", commktMinPriceVar);
	}

	public Double getCommktMinPriceVar()
	{
		return (Double) readProperty("commktMinPriceVar");
	}

	public void setCommktNearbyMask(String commktNearbyMask)
	{
		writeProperty("commktNearbyMask", commktNearbyMask);
	}

	public String getCommktNearbyMask()
	{
		return (String) readProperty("commktNearbyMask");
	}

	public void setCommktNumMthOut(Short commktNumMthOut)
	{
		writeProperty("commktNumMthOut", commktNumMthOut);
	}

	public Short getCommktNumMthOut()
	{
		return (Short) readProperty("commktNumMthOut");
	}

	public void setCommktPointConvNum(Double commktPointConvNum)
	{
		writeProperty("commktPointConvNum", commktPointConvNum);
	}

	public Double getCommktPointConvNum()
	{
		return (Double) readProperty("commktPointConvNum");
	}

	public void setCommktPriceDivMulInd(String commktPriceDivMulInd)
	{
		writeProperty("commktPriceDivMulInd", commktPriceDivMulInd);
	}

	public String getCommktPriceDivMulInd()
	{
		return (String) readProperty("commktPriceDivMulInd");
	}

	public void setCommktPriceFmt(String commktPriceFmt)
	{
		writeProperty("commktPriceFmt", commktPriceFmt);
	}

	public String getCommktPriceFmt()
	{
		return (String) readProperty("commktPriceFmt");
	}

	public void setCommktPriceFreq(String commktPriceFreq)
	{
		writeProperty("commktPriceFreq", commktPriceFreq);
	}

	public String getCommktPriceFreq()
	{
		return (String) readProperty("commktPriceFreq");
	}

	public void setCommktPriceFreqAsOf(String commktPriceFreqAsOf)
	{
		writeProperty("commktPriceFreqAsOf", commktPriceFreqAsOf);
	}

	public String getCommktPriceFreqAsOf()
	{
		return (String) readProperty("commktPriceFreqAsOf");
	}

	public void setCommktPriceSeries(String commktPriceSeries)
	{
		writeProperty("commktPriceSeries", commktPriceSeries);
	}

	public String getCommktPriceSeries()
	{
		return (String) readProperty("commktPriceSeries");
	}

	public void setCommktSameAsCmdtyCode(String commktSameAsCmdtyCode)
	{
		writeProperty("commktSameAsCmdtyCode", commktSameAsCmdtyCode);
	}

	public String getCommktSameAsCmdtyCode()
	{
		return (String) readProperty("commktSameAsCmdtyCode");
	}

	public void setCommktSameAsMktCode(String commktSameAsMktCode)
	{
		writeProperty("commktSameAsMktCode", commktSameAsMktCode);
	}

	public String getCommktSameAsMktCode()
	{
		return (String) readProperty("commktSameAsMktCode");
	}

	public void setCommktSettlementInd(String commktSettlementInd)
	{
		writeProperty("commktSettlementInd", commktSettlementInd);
	}

	public String getCommktSettlementInd()
	{
		return (String) readProperty("commktSettlementInd");
	}

	public void setCommktSpotMthQty(Double commktSpotMthQty)
	{
		writeProperty("commktSpotMthQty", commktSpotMthQty);
	}

	public Double getCommktSpotMthQty()
	{
		return (Double) readProperty("commktSpotMthQty");
	}

	public void setCommktSpotPrd(String commktSpotPrd)
	{
		writeProperty("commktSpotPrd", commktSpotPrd);
	}

	public String getCommktSpotPrd()
	{
		return (String) readProperty("commktSpotPrd");
	}

	public void setCommktSupportPriceType(String commktSupportPriceType)
	{
		writeProperty("commktSupportPriceType", commktSupportPriceType);
	}

	public String getCommktSupportPriceType()
	{
		return (String) readProperty("commktSupportPriceType");
	}

	public void setCommktTotalOpenQty(Double commktTotalOpenQty)
	{
		writeProperty("commktTotalOpenQty", commktTotalOpenQty);
	}

	public Double getCommktTotalOpenQty()
	{
		return (Double) readProperty("commktTotalOpenQty");
	}

	public void setCommktTradingMthInd(String commktTradingMthInd)
	{
		writeProperty("commktTradingMthInd", commktTradingMthInd);
	}

	public String getCommktTradingMthInd()
	{
		return (String) readProperty("commktTradingMthInd");
	}

	public void setTransId(Integer transId)
	{
		writeProperty("transId", transId);
	}

	public Integer getTransId()
	{
		return (Integer) readProperty("transId");
	}

	public void setAliasSource(AliasSource aliasSource)
	{
		setToOneTarget("aliasSource", aliasSource, true);
	}

	public AliasSource getAliasSource()
	{
		return (AliasSource) readProperty("aliasSource");
	}

	public void setCommodity(Commodity commodity)
	{
		setToOneTarget("commodity", commodity, true);
	}

	public Commodity getCommodity()
	{
		return (Commodity) readProperty("commodity");
	}

	public void setCommodityMarket(CommodityMarket commodityMarket)
	{
		setToOneTarget("commodityMarket", commodityMarket, true);
	}

	public CommodityMarket getCommodityMarket()
	{
		return (CommodityMarket) readProperty("commodityMarket");
	}

	public void setIctsUser(IctsUser ictsUser)
	{
		setToOneTarget("ictsUser", ictsUser, true);
	}

	public IctsUser getIctsUser()
	{
		return (IctsUser) readProperty("ictsUser");
	}

	public void setPriceSource(PriceSource priceSource)
	{
		setToOneTarget("priceSource", priceSource, true);
	}

	public PriceSource getPriceSource()
	{
		return (PriceSource) readProperty("priceSource");
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
