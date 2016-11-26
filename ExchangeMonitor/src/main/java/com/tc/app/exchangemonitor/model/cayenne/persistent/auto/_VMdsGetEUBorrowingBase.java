package com.tc.app.exchangemonitor.model.cayenne.persistent.auto;

import java.util.Date;

import org.apache.cayenne.CayenneDataObject;
import org.apache.cayenne.exp.Property;

/**
 * Class _VMdsGetEUBorrowingBase was generated by Cayenne.
 * It is probably a good idea to avoid changing this class manually,
 * since it may be overwritten next time code is regenerated.
 * If you need to make any customizations, please use subclass.
 */
public abstract class _VMdsGetEUBorrowingBase extends CayenneDataObject
{

	private static final long serialVersionUID = 1L;

	public static final Property<Integer> ALLOC_ITEM = new Property<Integer>("allocItem");
	public static final Property<Integer> ALLOCATION = new Property<Integer>("allocation");
	public static final Property<Double> AMOUNT = new Property<Double>("amount");
	public static final Property<String> BOOKING_COMPANY = new Property<String>("bookingCompany");
	public static final Property<Integer> COMMKT_KEY = new Property<Integer>("commktKey");
	public static final Property<String> COMMODITY = new Property<String>("commodity");
	public static final Property<Integer> COST_NUM = new Property<Integer>("costNum");
	public static final Property<Double> COST_QTY = new Property<Double>("costQTY");
	public static final Property<String> COST_TYPE = new Property<String>("costType");
	public static final Property<String> COST_UOM = new Property<String>("costUOM");
	public static final Property<String> COUNTERPART = new Property<String>("counterpart");
	public static final Property<String> COUNTERPART_FULL_NAME = new Property<String>("counterpartFullName");
	public static final Property<String> CURR = new Property<String>("curr");
	public static final Property<String> DELIVERY_TERM_CODE = new Property<String>("deliveryTermCode");
	public static final Property<Date> DUE = new Property<Date>("due");
	public static final Property<String> FINANCING_BANK = new Property<String>("financingBank");
	public static final Property<Integer> FINANCING_BANK_ACCT_NUM = new Property<Integer>("financingBankAcctNum");
	public static final Property<Double> HDG_RATE = new Property<Double>("hdgRate");
	public static final Property<Integer> ITEM = new Property<Integer>("item");
	public static final Property<String> LOCATION = new Property<String>("location");
	public static final Property<String> MOT = new Property<String>("mot");
	public static final Property<Integer> ORDR = new Property<Integer>("ordr");
	public static final Property<String> PAYMENT_TERM = new Property<String>("paymentTerm");
	public static final Property<Integer> PORT_NUM = new Property<Integer>("portNum");
	public static final Property<String> PR_UOM = new Property<String>("prUom");
	public static final Property<String> PRFTCNTR = new Property<String>("prftcntr");
	public static final Property<Double> PRICE = new Property<Double>("price");
	public static final Property<String> QTY_EST_ACT_IND = new Property<String>("qtyEstActInd");
	public static final Property<String> STATUS = new Property<String>("status");
	public static final Property<Date> TITLE_DT = new Property<Date>("titleDt");
	public static final Property<Integer> TRADE = new Property<Integer>("trade");
	public static final Property<Double> X_RATE = new Property<Double>("xRate");
	public static final Property<String> XRATE_IND = new Property<String>("xrateInd");

	public void setAllocItem(Integer allocItem)
	{
		writeProperty("allocItem", allocItem);
	}

	public Integer getAllocItem()
	{
		return (Integer) readProperty("allocItem");
	}

	public void setAllocation(Integer allocation)
	{
		writeProperty("allocation", allocation);
	}

	public Integer getAllocation()
	{
		return (Integer) readProperty("allocation");
	}

	public void setAmount(Double amount)
	{
		writeProperty("amount", amount);
	}

	public Double getAmount()
	{
		return (Double) readProperty("amount");
	}

	public void setBookingCompany(String bookingCompany)
	{
		writeProperty("bookingCompany", bookingCompany);
	}

	public String getBookingCompany()
	{
		return (String) readProperty("bookingCompany");
	}

	public void setCommktKey(Integer commktKey)
	{
		writeProperty("commktKey", commktKey);
	}

	public Integer getCommktKey()
	{
		return (Integer) readProperty("commktKey");
	}

	public void setCommodity(String commodity)
	{
		writeProperty("commodity", commodity);
	}

	public String getCommodity()
	{
		return (String) readProperty("commodity");
	}

	public void setCostNum(Integer costNum)
	{
		writeProperty("costNum", costNum);
	}

	public Integer getCostNum()
	{
		return (Integer) readProperty("costNum");
	}

	public void setCostQTY(Double costQTY)
	{
		writeProperty("costQTY", costQTY);
	}

	public Double getCostQTY()
	{
		return (Double) readProperty("costQTY");
	}

	public void setCostType(String costType)
	{
		writeProperty("costType", costType);
	}

	public String getCostType()
	{
		return (String) readProperty("costType");
	}

	public void setCostUOM(String costUOM)
	{
		writeProperty("costUOM", costUOM);
	}

	public String getCostUOM()
	{
		return (String) readProperty("costUOM");
	}

	public void setCounterpart(String counterpart)
	{
		writeProperty("counterpart", counterpart);
	}

	public String getCounterpart()
	{
		return (String) readProperty("counterpart");
	}

	public void setCounterpartFullName(String counterpartFullName)
	{
		writeProperty("counterpartFullName", counterpartFullName);
	}

	public String getCounterpartFullName()
	{
		return (String) readProperty("counterpartFullName");
	}

	public void setCurr(String curr)
	{
		writeProperty("curr", curr);
	}

	public String getCurr()
	{
		return (String) readProperty("curr");
	}

	public void setDeliveryTermCode(String deliveryTermCode)
	{
		writeProperty("deliveryTermCode", deliveryTermCode);
	}

	public String getDeliveryTermCode()
	{
		return (String) readProperty("deliveryTermCode");
	}

	public void setDue(Date due)
	{
		writeProperty("due", due);
	}

	public Date getDue()
	{
		return (Date) readProperty("due");
	}

	public void setFinancingBank(String financingBank)
	{
		writeProperty("financingBank", financingBank);
	}

	public String getFinancingBank()
	{
		return (String) readProperty("financingBank");
	}

	public void setFinancingBankAcctNum(Integer financingBankAcctNum)
	{
		writeProperty("financingBankAcctNum", financingBankAcctNum);
	}

	public Integer getFinancingBankAcctNum()
	{
		return (Integer) readProperty("financingBankAcctNum");
	}

	public void setHdgRate(Double hdgRate)
	{
		writeProperty("hdgRate", hdgRate);
	}

	public Double getHdgRate()
	{
		return (Double) readProperty("hdgRate");
	}

	public void setItem(Integer item)
	{
		writeProperty("item", item);
	}

	public Integer getItem()
	{
		return (Integer) readProperty("item");
	}

	public void setLocation(String location)
	{
		writeProperty("location", location);
	}

	public String getLocation()
	{
		return (String) readProperty("location");
	}

	public void setMot(String mot)
	{
		writeProperty("mot", mot);
	}

	public String getMot()
	{
		return (String) readProperty("mot");
	}

	public void setOrdr(Integer ordr)
	{
		writeProperty("ordr", ordr);
	}

	public Integer getOrdr()
	{
		return (Integer) readProperty("ordr");
	}

	public void setPaymentTerm(String paymentTerm)
	{
		writeProperty("paymentTerm", paymentTerm);
	}

	public String getPaymentTerm()
	{
		return (String) readProperty("paymentTerm");
	}

	public void setPortNum(Integer portNum)
	{
		writeProperty("portNum", portNum);
	}

	public Integer getPortNum()
	{
		return (Integer) readProperty("portNum");
	}

	public void setPrUom(String prUom)
	{
		writeProperty("prUom", prUom);
	}

	public String getPrUom()
	{
		return (String) readProperty("prUom");
	}

	public void setPrftcntr(String prftcntr)
	{
		writeProperty("prftcntr", prftcntr);
	}

	public String getPrftcntr()
	{
		return (String) readProperty("prftcntr");
	}

	public void setPrice(Double price)
	{
		writeProperty("price", price);
	}

	public Double getPrice()
	{
		return (Double) readProperty("price");
	}

	public void setQtyEstActInd(String qtyEstActInd)
	{
		writeProperty("qtyEstActInd", qtyEstActInd);
	}

	public String getQtyEstActInd()
	{
		return (String) readProperty("qtyEstActInd");
	}

	public void setStatus(String status)
	{
		writeProperty("status", status);
	}

	public String getStatus()
	{
		return (String) readProperty("status");
	}

	public void setTitleDt(Date titleDt)
	{
		writeProperty("titleDt", titleDt);
	}

	public Date getTitleDt()
	{
		return (Date) readProperty("titleDt");
	}

	public void setTrade(Integer trade)
	{
		writeProperty("trade", trade);
	}

	public Integer getTrade()
	{
		return (Integer) readProperty("trade");
	}

	public void setXRate(Double xRate)
	{
		writeProperty("xRate", xRate);
	}

	public Double getXRate()
	{
		return (Double) readProperty("xRate");
	}

	public void setXrateInd(String xrateInd)
	{
		writeProperty("xrateInd", xrateInd);
	}

	public String getXrateInd()
	{
		return (String) readProperty("xrateInd");
	}

}
