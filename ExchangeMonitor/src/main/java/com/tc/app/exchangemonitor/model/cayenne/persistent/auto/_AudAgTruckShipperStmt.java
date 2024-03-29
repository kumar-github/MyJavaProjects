package com.tc.app.exchangemonitor.model.cayenne.persistent.auto;

import java.math.BigDecimal;

import org.apache.cayenne.CayenneDataObject;
import org.apache.cayenne.exp.Property;

/**
 * Class _AudAgTruckShipperStmt was generated by Cayenne.
 * It is probably a good idea to avoid changing this class manually,
 * since it may be overwritten next time code is regenerated.
 * If you need to make any customizations, please use subclass.
 */
public abstract class _AudAgTruckShipperStmt extends CayenneDataObject
{

	private static final long serialVersionUID = 1L;

	public static final Property<String> ACTUAL_COST = new Property<String>("actualCost");
	public static final Property<Short> AI_EST_ACTUAL_NUM = new Property<Short>("aiEstActualNum");
	public static final Property<Short> ALLOC_ITEM_NUM = new Property<Short>("allocItemNum");
	public static final Property<Integer> ALLOC_NUM = new Property<Integer>("allocNum");
	public static final Property<BigDecimal> BARRELS_CHARGE = new Property<BigDecimal>("barrelsCharge");
	public static final Property<BigDecimal> BOB_TAIL = new Property<BigDecimal>("bobTail");
	public static final Property<BigDecimal> BOB_TAIL_QTY = new Property<BigDecimal>("bobTailQty");
	public static final Property<BigDecimal> CHAIN_UP = new Property<BigDecimal>("chainUp");
	public static final Property<BigDecimal> CHAIN_UP_QTY = new Property<BigDecimal>("chainUpQty");
	public static final Property<BigDecimal> DEMURRAGE = new Property<BigDecimal>("demurrage");
	public static final Property<BigDecimal> DEMURRAGE_HOURS = new Property<BigDecimal>("demurrageHours");
	public static final Property<String> DESTINATION = new Property<String>("destination");
	public static final Property<BigDecimal> DIVERT = new Property<BigDecimal>("divert");
	public static final Property<Integer> FDD_ID = new Property<Integer>("fddId");
	public static final Property<BigDecimal> FUEL_RATE = new Property<BigDecimal>("fuelRate");
	public static final Property<String> GENERIC_COL1 = new Property<String>("genericCol1");
	public static final Property<String> GENERIC_COL10 = new Property<String>("genericCol10");
	public static final Property<String> GENERIC_COL2 = new Property<String>("genericCol2");
	public static final Property<String> GENERIC_COL3 = new Property<String>("genericCol3");
	public static final Property<String> GENERIC_COL4 = new Property<String>("genericCol4");
	public static final Property<String> GENERIC_COL5 = new Property<String>("genericCol5");
	public static final Property<String> GENERIC_COL6 = new Property<String>("genericCol6");
	public static final Property<String> GENERIC_COL7 = new Property<String>("genericCol7");
	public static final Property<String> GENERIC_COL8 = new Property<String>("genericCol8");
	public static final Property<String> GENERIC_COL9 = new Property<String>("genericCol9");
	public static final Property<String> LEASE_NAME = new Property<String>("leaseName");
	public static final Property<Integer> LEASE_NUM = new Property<Integer>("leaseNum");
	public static final Property<BigDecimal> MILES = new Property<BigDecimal>("miles");
	public static final Property<BigDecimal> PRICE_PER_MILE = new Property<BigDecimal>("pricePerMile");
	public static final Property<String> PURCHASER = new Property<String>("purchaser");
	public static final Property<BigDecimal> RATE = new Property<BigDecimal>("rate");
	public static final Property<BigDecimal> REJECT_RATE = new Property<BigDecimal>("rejectRate");
	public static final Property<Integer> RESP_TRANS_ID = new Property<Integer>("respTransId");
	public static final Property<BigDecimal> SPLIT_RATE = new Property<BigDecimal>("splitRate");
	public static final Property<String> STATUS = new Property<String>("status");
	public static final Property<BigDecimal> TOTAL_CHARGE = new Property<BigDecimal>("totalCharge");
	public static final Property<BigDecimal> TOTAL_RATE = new Property<BigDecimal>("totalRate");
	public static final Property<Integer> TRANS_ID = new Property<Integer>("transId");
	public static final Property<BigDecimal> VOLUME = new Property<BigDecimal>("volume");

	public void setActualCost(String actualCost)
	{
		writeProperty("actualCost", actualCost);
	}

	public String getActualCost()
	{
		return (String) readProperty("actualCost");
	}

	public void setAiEstActualNum(Short aiEstActualNum)
	{
		writeProperty("aiEstActualNum", aiEstActualNum);
	}

	public Short getAiEstActualNum()
	{
		return (Short) readProperty("aiEstActualNum");
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

	public void setBarrelsCharge(BigDecimal barrelsCharge)
	{
		writeProperty("barrelsCharge", barrelsCharge);
	}

	public BigDecimal getBarrelsCharge()
	{
		return (BigDecimal) readProperty("barrelsCharge");
	}

	public void setBobTail(BigDecimal bobTail)
	{
		writeProperty("bobTail", bobTail);
	}

	public BigDecimal getBobTail()
	{
		return (BigDecimal) readProperty("bobTail");
	}

	public void setBobTailQty(BigDecimal bobTailQty)
	{
		writeProperty("bobTailQty", bobTailQty);
	}

	public BigDecimal getBobTailQty()
	{
		return (BigDecimal) readProperty("bobTailQty");
	}

	public void setChainUp(BigDecimal chainUp)
	{
		writeProperty("chainUp", chainUp);
	}

	public BigDecimal getChainUp()
	{
		return (BigDecimal) readProperty("chainUp");
	}

	public void setChainUpQty(BigDecimal chainUpQty)
	{
		writeProperty("chainUpQty", chainUpQty);
	}

	public BigDecimal getChainUpQty()
	{
		return (BigDecimal) readProperty("chainUpQty");
	}

	public void setDemurrage(BigDecimal demurrage)
	{
		writeProperty("demurrage", demurrage);
	}

	public BigDecimal getDemurrage()
	{
		return (BigDecimal) readProperty("demurrage");
	}

	public void setDemurrageHours(BigDecimal demurrageHours)
	{
		writeProperty("demurrageHours", demurrageHours);
	}

	public BigDecimal getDemurrageHours()
	{
		return (BigDecimal) readProperty("demurrageHours");
	}

	public void setDestination(String destination)
	{
		writeProperty("destination", destination);
	}

	public String getDestination()
	{
		return (String) readProperty("destination");
	}

	public void setDivert(BigDecimal divert)
	{
		writeProperty("divert", divert);
	}

	public BigDecimal getDivert()
	{
		return (BigDecimal) readProperty("divert");
	}

	public void setFddId(Integer fddId)
	{
		writeProperty("fddId", fddId);
	}

	public Integer getFddId()
	{
		return (Integer) readProperty("fddId");
	}

	public void setFuelRate(BigDecimal fuelRate)
	{
		writeProperty("fuelRate", fuelRate);
	}

	public BigDecimal getFuelRate()
	{
		return (BigDecimal) readProperty("fuelRate");
	}

	public void setGenericCol1(String genericCol1)
	{
		writeProperty("genericCol1", genericCol1);
	}

	public String getGenericCol1()
	{
		return (String) readProperty("genericCol1");
	}

	public void setGenericCol10(String genericCol10)
	{
		writeProperty("genericCol10", genericCol10);
	}

	public String getGenericCol10()
	{
		return (String) readProperty("genericCol10");
	}

	public void setGenericCol2(String genericCol2)
	{
		writeProperty("genericCol2", genericCol2);
	}

	public String getGenericCol2()
	{
		return (String) readProperty("genericCol2");
	}

	public void setGenericCol3(String genericCol3)
	{
		writeProperty("genericCol3", genericCol3);
	}

	public String getGenericCol3()
	{
		return (String) readProperty("genericCol3");
	}

	public void setGenericCol4(String genericCol4)
	{
		writeProperty("genericCol4", genericCol4);
	}

	public String getGenericCol4()
	{
		return (String) readProperty("genericCol4");
	}

	public void setGenericCol5(String genericCol5)
	{
		writeProperty("genericCol5", genericCol5);
	}

	public String getGenericCol5()
	{
		return (String) readProperty("genericCol5");
	}

	public void setGenericCol6(String genericCol6)
	{
		writeProperty("genericCol6", genericCol6);
	}

	public String getGenericCol6()
	{
		return (String) readProperty("genericCol6");
	}

	public void setGenericCol7(String genericCol7)
	{
		writeProperty("genericCol7", genericCol7);
	}

	public String getGenericCol7()
	{
		return (String) readProperty("genericCol7");
	}

	public void setGenericCol8(String genericCol8)
	{
		writeProperty("genericCol8", genericCol8);
	}

	public String getGenericCol8()
	{
		return (String) readProperty("genericCol8");
	}

	public void setGenericCol9(String genericCol9)
	{
		writeProperty("genericCol9", genericCol9);
	}

	public String getGenericCol9()
	{
		return (String) readProperty("genericCol9");
	}

	public void setLeaseName(String leaseName)
	{
		writeProperty("leaseName", leaseName);
	}

	public String getLeaseName()
	{
		return (String) readProperty("leaseName");
	}

	public void setLeaseNum(Integer leaseNum)
	{
		writeProperty("leaseNum", leaseNum);
	}

	public Integer getLeaseNum()
	{
		return (Integer) readProperty("leaseNum");
	}

	public void setMiles(BigDecimal miles)
	{
		writeProperty("miles", miles);
	}

	public BigDecimal getMiles()
	{
		return (BigDecimal) readProperty("miles");
	}

	public void setPricePerMile(BigDecimal pricePerMile)
	{
		writeProperty("pricePerMile", pricePerMile);
	}

	public BigDecimal getPricePerMile()
	{
		return (BigDecimal) readProperty("pricePerMile");
	}

	public void setPurchaser(String purchaser)
	{
		writeProperty("purchaser", purchaser);
	}

	public String getPurchaser()
	{
		return (String) readProperty("purchaser");
	}

	public void setRate(BigDecimal rate)
	{
		writeProperty("rate", rate);
	}

	public BigDecimal getRate()
	{
		return (BigDecimal) readProperty("rate");
	}

	public void setRejectRate(BigDecimal rejectRate)
	{
		writeProperty("rejectRate", rejectRate);
	}

	public BigDecimal getRejectRate()
	{
		return (BigDecimal) readProperty("rejectRate");
	}

	public void setRespTransId(Integer respTransId)
	{
		writeProperty("respTransId", respTransId);
	}

	public Integer getRespTransId()
	{
		return (Integer) readProperty("respTransId");
	}

	public void setSplitRate(BigDecimal splitRate)
	{
		writeProperty("splitRate", splitRate);
	}

	public BigDecimal getSplitRate()
	{
		return (BigDecimal) readProperty("splitRate");
	}

	public void setStatus(String status)
	{
		writeProperty("status", status);
	}

	public String getStatus()
	{
		return (String) readProperty("status");
	}

	public void setTotalCharge(BigDecimal totalCharge)
	{
		writeProperty("totalCharge", totalCharge);
	}

	public BigDecimal getTotalCharge()
	{
		return (BigDecimal) readProperty("totalCharge");
	}

	public void setTotalRate(BigDecimal totalRate)
	{
		writeProperty("totalRate", totalRate);
	}

	public BigDecimal getTotalRate()
	{
		return (BigDecimal) readProperty("totalRate");
	}

	public void setTransId(Integer transId)
	{
		writeProperty("transId", transId);
	}

	public Integer getTransId()
	{
		return (Integer) readProperty("transId");
	}

	public void setVolume(BigDecimal volume)
	{
		writeProperty("volume", volume);
	}

	public BigDecimal getVolume()
	{
		return (BigDecimal) readProperty("volume");
	}

}
