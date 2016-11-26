package com.tc.app.exchangemonitor.model.cayenne.persistent.auto;

import java.math.BigDecimal;
import java.util.Date;

import org.apache.cayenne.CayenneDataObject;
import org.apache.cayenne.exp.Property;

/**
 * Class _VInventoryBuildDrawRev was generated by Cayenne.
 * It is probably a good idea to avoid changing this class manually,
 * since it may be overwritten next time code is regenerated.
 * If you need to make any customizations, please use subclass.
 */
public abstract class _VInventoryBuildDrawRev extends CayenneDataObject
{

	private static final long serialVersionUID = 1L;

	public static final Property<Double> ADJ_QTY = new Property<Double>("adjQty");
	public static final Property<String> ADJ_QTY_UOM_CODE = new Property<String>("adjQtyUomCode");
	public static final Property<String> ADJ_TYPE_IND = new Property<String>("adjTypeInd");
	public static final Property<Short> ALLOC_ITEM_NUM = new Property<Short>("allocItemNum");
	public static final Property<Integer> ALLOC_NUM = new Property<Integer>("allocNum");
	public static final Property<Integer> ASOF_TRANS_ID = new Property<Integer>("asofTransId");
	public static final Property<String> ASSOCIATED_CPTY = new Property<String>("associatedCpty");
	public static final Property<String> ASSOCIATED_TRADE = new Property<String>("associatedTrade");
	public static final Property<Integer> CMNT_NUM = new Property<Integer>("cmntNum");
	public static final Property<Double> INV_BDACTUAL_QTY = new Property<Double>("invBDActualQty");
	public static final Property<Double> INV_BDCOST = new Property<Double>("invBDCost");
	public static final Property<String> INV_BDCOST_CURR_CODE = new Property<String>("invBDCostCurrCode");
	public static final Property<String> INV_BDCOST_UOM_CODE = new Property<String>("invBDCostUomCode");
	public static final Property<Double> INV_BDCOST_WACOG = new Property<Double>("invBDCostWacog");
	public static final Property<Date> INV_BDDATE = new Property<Date>("invBDDate");
	public static final Property<Integer> INV_BDNUM = new Property<Integer>("invBDNum");
	public static final Property<Double> INV_BDQTY = new Property<Double>("invBDQty");
	public static final Property<String> INV_BDSTATUS = new Property<String>("invBDStatus");
	public static final Property<String> INV_BDTAX_STATUS_CODE = new Property<String>("invBDTaxStatusCode");
	public static final Property<String> INV_BDTYPE = new Property<String>("invBDType");
	public static final Property<BigDecimal> INV_CURR_ACTUAL_QTY = new Property<BigDecimal>("invCurrActualQty");
	public static final Property<BigDecimal> INV_CURR_PROJ_QTY = new Property<BigDecimal>("invCurrProjQty");
	public static final Property<Short> INV_DRAW_BDNUM = new Property<Short>("invDrawBDNum");
	public static final Property<Integer> INV_NUM = new Property<Integer>("invNum");
	public static final Property<Short> ITEM_NUM = new Property<Short>("itemNum");
	public static final Property<Short> ORDER_NUM = new Property<Short>("orderNum");
	public static final Property<Integer> POS_GROUP_NUM = new Property<Integer>("posGroupNum");
	public static final Property<Double> R_INV_BDCOST = new Property<Double>("rInvBDCost");
	public static final Property<Double> R_INV_BDCOST_WACOG = new Property<Double>("rInvBDCostWacog");
	public static final Property<Integer> RESP_TRANS_ID = new Property<Integer>("respTransId");
	public static final Property<Integer> TRADE_NUM = new Property<Integer>("tradeNum");
	public static final Property<Integer> TRANS_ID = new Property<Integer>("transId");
	public static final Property<Double> UNR_INV_BDCOST = new Property<Double>("unrInvBDCost");
	public static final Property<Double> UNR_INV_BDCOST_WACOG = new Property<Double>("unrInvBDCostWacog");
	public static final Property<String> VOYAGE_CODE = new Property<String>("voyageCode");

	public void setAdjQty(Double adjQty)
	{
		writeProperty("adjQty", adjQty);
	}

	public Double getAdjQty()
	{
		return (Double) readProperty("adjQty");
	}

	public void setAdjQtyUomCode(String adjQtyUomCode)
	{
		writeProperty("adjQtyUomCode", adjQtyUomCode);
	}

	public String getAdjQtyUomCode()
	{
		return (String) readProperty("adjQtyUomCode");
	}

	public void setAdjTypeInd(String adjTypeInd)
	{
		writeProperty("adjTypeInd", adjTypeInd);
	}

	public String getAdjTypeInd()
	{
		return (String) readProperty("adjTypeInd");
	}

	public void setAllocItemNum(Short allocItemNum)
	{
		writeProperty("allocItemNum", allocItemNum);
	}

	public Short getAllocItemNum()
	{
		return (Short) readProperty("allocItemNum");
	}

	public void setAllocNum(Integer allocNum)
	{
		writeProperty("allocNum", allocNum);
	}

	public Integer getAllocNum()
	{
		return (Integer) readProperty("allocNum");
	}

	public void setAsofTransId(Integer asofTransId)
	{
		writeProperty("asofTransId", asofTransId);
	}

	public Integer getAsofTransId()
	{
		return (Integer) readProperty("asofTransId");
	}

	public void setAssociatedCpty(String associatedCpty)
	{
		writeProperty("associatedCpty", associatedCpty);
	}

	public String getAssociatedCpty()
	{
		return (String) readProperty("associatedCpty");
	}

	public void setAssociatedTrade(String associatedTrade)
	{
		writeProperty("associatedTrade", associatedTrade);
	}

	public String getAssociatedTrade()
	{
		return (String) readProperty("associatedTrade");
	}

	public void setCmntNum(Integer cmntNum)
	{
		writeProperty("cmntNum", cmntNum);
	}

	public Integer getCmntNum()
	{
		return (Integer) readProperty("cmntNum");
	}

	public void setInvBDActualQty(Double invBDActualQty)
	{
		writeProperty("invBDActualQty", invBDActualQty);
	}

	public Double getInvBDActualQty()
	{
		return (Double) readProperty("invBDActualQty");
	}

	public void setInvBDCost(Double invBDCost)
	{
		writeProperty("invBDCost", invBDCost);
	}

	public Double getInvBDCost()
	{
		return (Double) readProperty("invBDCost");
	}

	public void setInvBDCostCurrCode(String invBDCostCurrCode)
	{
		writeProperty("invBDCostCurrCode", invBDCostCurrCode);
	}

	public String getInvBDCostCurrCode()
	{
		return (String) readProperty("invBDCostCurrCode");
	}

	public void setInvBDCostUomCode(String invBDCostUomCode)
	{
		writeProperty("invBDCostUomCode", invBDCostUomCode);
	}

	public String getInvBDCostUomCode()
	{
		return (String) readProperty("invBDCostUomCode");
	}

	public void setInvBDCostWacog(Double invBDCostWacog)
	{
		writeProperty("invBDCostWacog", invBDCostWacog);
	}

	public Double getInvBDCostWacog()
	{
		return (Double) readProperty("invBDCostWacog");
	}

	public void setInvBDDate(Date invBDDate)
	{
		writeProperty("invBDDate", invBDDate);
	}

	public Date getInvBDDate()
	{
		return (Date) readProperty("invBDDate");
	}

	public void setInvBDNum(Integer invBDNum)
	{
		writeProperty("invBDNum", invBDNum);
	}

	public Integer getInvBDNum()
	{
		return (Integer) readProperty("invBDNum");
	}

	public void setInvBDQty(Double invBDQty)
	{
		writeProperty("invBDQty", invBDQty);
	}

	public Double getInvBDQty()
	{
		return (Double) readProperty("invBDQty");
	}

	public void setInvBDStatus(String invBDStatus)
	{
		writeProperty("invBDStatus", invBDStatus);
	}

	public String getInvBDStatus()
	{
		return (String) readProperty("invBDStatus");
	}

	public void setInvBDTaxStatusCode(String invBDTaxStatusCode)
	{
		writeProperty("invBDTaxStatusCode", invBDTaxStatusCode);
	}

	public String getInvBDTaxStatusCode()
	{
		return (String) readProperty("invBDTaxStatusCode");
	}

	public void setInvBDType(String invBDType)
	{
		writeProperty("invBDType", invBDType);
	}

	public String getInvBDType()
	{
		return (String) readProperty("invBDType");
	}

	public void setInvCurrActualQty(BigDecimal invCurrActualQty)
	{
		writeProperty("invCurrActualQty", invCurrActualQty);
	}

	public BigDecimal getInvCurrActualQty()
	{
		return (BigDecimal) readProperty("invCurrActualQty");
	}

	public void setInvCurrProjQty(BigDecimal invCurrProjQty)
	{
		writeProperty("invCurrProjQty", invCurrProjQty);
	}

	public BigDecimal getInvCurrProjQty()
	{
		return (BigDecimal) readProperty("invCurrProjQty");
	}

	public void setInvDrawBDNum(Short invDrawBDNum)
	{
		writeProperty("invDrawBDNum", invDrawBDNum);
	}

	public Short getInvDrawBDNum()
	{
		return (Short) readProperty("invDrawBDNum");
	}

	public void setInvNum(Integer invNum)
	{
		writeProperty("invNum", invNum);
	}

	public Integer getInvNum()
	{
		return (Integer) readProperty("invNum");
	}

	public void setItemNum(Short itemNum)
	{
		writeProperty("itemNum", itemNum);
	}

	public Short getItemNum()
	{
		return (Short) readProperty("itemNum");
	}

	public void setOrderNum(Short orderNum)
	{
		writeProperty("orderNum", orderNum);
	}

	public Short getOrderNum()
	{
		return (Short) readProperty("orderNum");
	}

	public void setPosGroupNum(Integer posGroupNum)
	{
		writeProperty("posGroupNum", posGroupNum);
	}

	public Integer getPosGroupNum()
	{
		return (Integer) readProperty("posGroupNum");
	}

	public void setRInvBDCost(Double rInvBDCost)
	{
		writeProperty("rInvBDCost", rInvBDCost);
	}

	public Double getRInvBDCost()
	{
		return (Double) readProperty("rInvBDCost");
	}

	public void setRInvBDCostWacog(Double rInvBDCostWacog)
	{
		writeProperty("rInvBDCostWacog", rInvBDCostWacog);
	}

	public Double getRInvBDCostWacog()
	{
		return (Double) readProperty("rInvBDCostWacog");
	}

	public void setRespTransId(Integer respTransId)
	{
		writeProperty("respTransId", respTransId);
	}

	public Integer getRespTransId()
	{
		return (Integer) readProperty("respTransId");
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

	public void setUnrInvBDCost(Double unrInvBDCost)
	{
		writeProperty("unrInvBDCost", unrInvBDCost);
	}

	public Double getUnrInvBDCost()
	{
		return (Double) readProperty("unrInvBDCost");
	}

	public void setUnrInvBDCostWacog(Double unrInvBDCostWacog)
	{
		writeProperty("unrInvBDCostWacog", unrInvBDCostWacog);
	}

	public Double getUnrInvBDCostWacog()
	{
		return (Double) readProperty("unrInvBDCostWacog");
	}

	public void setVoyageCode(String voyageCode)
	{
		writeProperty("voyageCode", voyageCode);
	}

	public String getVoyageCode()
	{
		return (String) readProperty("voyageCode");
	}

}
