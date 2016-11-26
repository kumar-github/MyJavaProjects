package com.tc.app.exchangemonitor.model.cayenne.persistent.auto;

import java.util.Date;

import org.apache.cayenne.CayenneDataObject;
import org.apache.cayenne.exp.Property;

/**
 * Class _VTsTradeItemWetPhy was generated by Cayenne.
 * It is probably a good idea to avoid changing this class manually,
 * since it may be overwritten next time code is regenerated.
 * If you need to make any customizations, please use subclass.
 */
public abstract class _VTsTradeItemWetPhy extends CayenneDataObject
{

	private static final long serialVersionUID = 1L;

	public static final Property<Date> CREDIT_APPROVAL_DATE = new Property<Date>("creditApprovalDate");
	public static final Property<String> CREDIT_APPROVER_INIT = new Property<String>("creditApproverInit");
	public static final Property<String> CREDIT_TERM_CODE = new Property<String>("creditTermCode");
	public static final Property<Date> DEL_DATE_FROM = new Property<Date>("delDateFrom");
	public static final Property<Date> DEL_DATE_TO = new Property<Date>("delDateTo");
	public static final Property<String> DEL_LOC_CODE = new Property<String>("delLocCode");
	public static final Property<String> DEL_LOC_NAME = new Property<String>("delLocName");
	public static final Property<String> DEL_TERM_CODE = new Property<String>("delTermCode");
	public static final Property<String> DENSITY_IND = new Property<String>("densityInd");
	public static final Property<Short> ITEM_NUM = new Property<Short>("itemNum");
	public static final Property<String> LC_REQUIRED = new Property<String>("lcRequired");
	public static final Property<Double> MAX_QTY = new Property<Double>("maxQty");
	public static final Property<Double> MIN_QTY = new Property<Double>("minQty");
	public static final Property<String> MOT_CODE = new Property<String>("motCode");
	public static final Property<String> MOT_FULL_NAME = new Property<String>("motFullName");
	public static final Property<Short> ORDER_NUM = new Property<Short>("orderNum");
	public static final Property<Integer> PAY_DAYS = new Property<Integer>("payDays");
	public static final Property<String> PAY_TERM_CODE = new Property<String>("payTermCode");
	public static final Property<String> TOL_OPT = new Property<String>("tolOpt");
	public static final Property<Double> TOL_QTY = new Property<Double>("tolQty");
	public static final Property<String> TOL_QTY_UOM_CODE = new Property<String>("tolQtyUomCode");
	public static final Property<String> TOL_SIGN = new Property<String>("tolSign");
	public static final Property<Integer> TRADE_NUM = new Property<Integer>("tradeNum");
	public static final Property<Integer> TRANS_ID = new Property<Integer>("transId");
	public static final Property<String> TRANSPORTATION = new Property<String>("transportation");

	public void setCreditApprovalDate(Date creditApprovalDate)
	{
		writeProperty("creditApprovalDate", creditApprovalDate);
	}

	public Date getCreditApprovalDate()
	{
		return (Date) readProperty("creditApprovalDate");
	}

	public void setCreditApproverInit(String creditApproverInit)
	{
		writeProperty("creditApproverInit", creditApproverInit);
	}

	public String getCreditApproverInit()
	{
		return (String) readProperty("creditApproverInit");
	}

	public void setCreditTermCode(String creditTermCode)
	{
		writeProperty("creditTermCode", creditTermCode);
	}

	public String getCreditTermCode()
	{
		return (String) readProperty("creditTermCode");
	}

	public void setDelDateFrom(Date delDateFrom)
	{
		writeProperty("delDateFrom", delDateFrom);
	}

	public Date getDelDateFrom()
	{
		return (Date) readProperty("delDateFrom");
	}

	public void setDelDateTo(Date delDateTo)
	{
		writeProperty("delDateTo", delDateTo);
	}

	public Date getDelDateTo()
	{
		return (Date) readProperty("delDateTo");
	}

	public void setDelLocCode(String delLocCode)
	{
		writeProperty("delLocCode", delLocCode);
	}

	public String getDelLocCode()
	{
		return (String) readProperty("delLocCode");
	}

	public void setDelLocName(String delLocName)
	{
		writeProperty("delLocName", delLocName);
	}

	public String getDelLocName()
	{
		return (String) readProperty("delLocName");
	}

	public void setDelTermCode(String delTermCode)
	{
		writeProperty("delTermCode", delTermCode);
	}

	public String getDelTermCode()
	{
		return (String) readProperty("delTermCode");
	}

	public void setDensityInd(String densityInd)
	{
		writeProperty("densityInd", densityInd);
	}

	public String getDensityInd()
	{
		return (String) readProperty("densityInd");
	}

	public void setItemNum(Short itemNum)
	{
		writeProperty("itemNum", itemNum);
	}

	public Short getItemNum()
	{
		return (Short) readProperty("itemNum");
	}

	public void setLcRequired(String lcRequired)
	{
		writeProperty("lcRequired", lcRequired);
	}

	public String getLcRequired()
	{
		return (String) readProperty("lcRequired");
	}

	public void setMaxQty(Double maxQty)
	{
		writeProperty("maxQty", maxQty);
	}

	public Double getMaxQty()
	{
		return (Double) readProperty("maxQty");
	}

	public void setMinQty(Double minQty)
	{
		writeProperty("minQty", minQty);
	}

	public Double getMinQty()
	{
		return (Double) readProperty("minQty");
	}

	public void setMotCode(String motCode)
	{
		writeProperty("motCode", motCode);
	}

	public String getMotCode()
	{
		return (String) readProperty("motCode");
	}

	public void setMotFullName(String motFullName)
	{
		writeProperty("motFullName", motFullName);
	}

	public String getMotFullName()
	{
		return (String) readProperty("motFullName");
	}

	public void setOrderNum(Short orderNum)
	{
		writeProperty("orderNum", orderNum);
	}

	public Short getOrderNum()
	{
		return (Short) readProperty("orderNum");
	}

	public void setPayDays(Integer payDays)
	{
		writeProperty("payDays", payDays);
	}

	public Integer getPayDays()
	{
		return (Integer) readProperty("payDays");
	}

	public void setPayTermCode(String payTermCode)
	{
		writeProperty("payTermCode", payTermCode);
	}

	public String getPayTermCode()
	{
		return (String) readProperty("payTermCode");
	}

	public void setTolOpt(String tolOpt)
	{
		writeProperty("tolOpt", tolOpt);
	}

	public String getTolOpt()
	{
		return (String) readProperty("tolOpt");
	}

	public void setTolQty(Double tolQty)
	{
		writeProperty("tolQty", tolQty);
	}

	public Double getTolQty()
	{
		return (Double) readProperty("tolQty");
	}

	public void setTolQtyUomCode(String tolQtyUomCode)
	{
		writeProperty("tolQtyUomCode", tolQtyUomCode);
	}

	public String getTolQtyUomCode()
	{
		return (String) readProperty("tolQtyUomCode");
	}

	public void setTolSign(String tolSign)
	{
		writeProperty("tolSign", tolSign);
	}

	public String getTolSign()
	{
		return (String) readProperty("tolSign");
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

	public void setTransportation(String transportation)
	{
		writeProperty("transportation", transportation);
	}

	public String getTransportation()
	{
		return (String) readProperty("transportation");
	}

}
