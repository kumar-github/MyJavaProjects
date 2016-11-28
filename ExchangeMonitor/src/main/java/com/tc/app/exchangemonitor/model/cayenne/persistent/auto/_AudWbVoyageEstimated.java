package com.tc.app.exchangemonitor.model.cayenne.persistent.auto;

import java.math.BigDecimal;
import java.util.Date;

import org.apache.cayenne.CayenneDataObject;
import org.apache.cayenne.exp.Property;

/**
 * Class _AudWbVoyageEstimated was generated by Cayenne.
 * It is probably a good idea to avoid changing this class manually,
 * since it may be overwritten next time code is regenerated.
 * If you need to make any customizations, please use subclass.
 */
public abstract class _AudWbVoyageEstimated extends CayenneDataObject
{

	private static final long serialVersionUID = 1L;

	public static final Property<Integer> ALLOC_NUM = new Property<Integer>("allocNum");
	public static final Property<Double> B_CONS1 = new Property<Double>("bCons1");
	public static final Property<Double> B_CONS2 = new Property<Double>("bCons2");
	public static final Property<String> B_UOM1 = new Property<String>("bUom1");
	public static final Property<String> B_UOM2 = new Property<String>("bUom2");
	public static final Property<String> BUNK_CMDTY1 = new Property<String>("bunkCmdty1");
	public static final Property<String> BUNK_CMDTY2 = new Property<String>("bunkCmdty2");
	public static final Property<String> BUNK_CURR1 = new Property<String>("bunkCurr1");
	public static final Property<String> BUNK_CURR2 = new Property<String>("bunkCurr2");
	public static final Property<BigDecimal> BUNKER_COST1 = new Property<BigDecimal>("bunkerCost1");
	public static final Property<BigDecimal> BUNKER_COST2 = new Property<BigDecimal>("bunkerCost2");
	public static final Property<Date> DATE_OP = new Property<Date>("dateOp");
	public static final Property<String> FLDCHR_CONTR_KEY = new Property<String>("fldchrContrKey");
	public static final Property<String> FLDCHR_CONTR_VSL_KEY = new Property<String>("fldchrContrVslKey");
	public static final Property<String> FLDCHR_EST_FREIGHT_CRNCY_CODE = new Property<String>("fldchrEstFreightCrncyCode");
	public static final Property<String> FLDCHR_ESTIMATED_REF_MONTH = new Property<String>("fldchrEstimatedRefMonth");
	public static final Property<String> FLDCHR_ESTIMATED_REF_YEAR = new Property<String>("fldchrEstimatedRefYear");
	public static final Property<String> FLDCHR_ESTIMATED_VOYAGE_ID = new Property<String>("fldchrEstimatedVoyageId");
	public static final Property<String> FLDCHR_ESTIMATED_VOYAGE_KEY = new Property<String>("fldchrEstimatedVoyageKey");
	public static final Property<String> FLDCHR_LAST_PORT = new Property<String>("fldchrLastPort");
	public static final Property<String> FLDCHR_LLOYDS_REF_NUM = new Property<String>("fldchrLloydsRefNum");
	public static final Property<String> FLDCHR_VOYAGE_STATUS_FLAG = new Property<String>("fldchrVoyageStatusFlag");
	public static final Property<BigDecimal> FLDDEC_ESTIMATED_FREIGHT = new Property<BigDecimal>("flddecEstimatedFreight");
	public static final Property<Date> FLDSDT_LAST_CALL = new Property<Date>("fldsdtLastCall");
	public static final Property<Date> FLDSDT_VOYAGE_END = new Property<Date>("fldsdtVoyageEnd");
	public static final Property<String> OPERATION = new Property<String>("operation");
	public static final Property<String> USERID = new Property<String>("userid");

	public void setAllocNum(Integer allocNum)
	{
		writeProperty("allocNum", allocNum);
	}

	public Integer getAllocNum()
	{
		return (Integer) readProperty("allocNum");
	}

	public void setBCons1(Double bCons1)
	{
		writeProperty("bCons1", bCons1);
	}

	public Double getBCons1()
	{
		return (Double) readProperty("bCons1");
	}

	public void setBCons2(Double bCons2)
	{
		writeProperty("bCons2", bCons2);
	}

	public Double getBCons2()
	{
		return (Double) readProperty("bCons2");
	}

	public void setBUom1(String bUom1)
	{
		writeProperty("bUom1", bUom1);
	}

	public String getBUom1()
	{
		return (String) readProperty("bUom1");
	}

	public void setBUom2(String bUom2)
	{
		writeProperty("bUom2", bUom2);
	}

	public String getBUom2()
	{
		return (String) readProperty("bUom2");
	}

	public void setBunkCmdty1(String bunkCmdty1)
	{
		writeProperty("bunkCmdty1", bunkCmdty1);
	}

	public String getBunkCmdty1()
	{
		return (String) readProperty("bunkCmdty1");
	}

	public void setBunkCmdty2(String bunkCmdty2)
	{
		writeProperty("bunkCmdty2", bunkCmdty2);
	}

	public String getBunkCmdty2()
	{
		return (String) readProperty("bunkCmdty2");
	}

	public void setBunkCurr1(String bunkCurr1)
	{
		writeProperty("bunkCurr1", bunkCurr1);
	}

	public String getBunkCurr1()
	{
		return (String) readProperty("bunkCurr1");
	}

	public void setBunkCurr2(String bunkCurr2)
	{
		writeProperty("bunkCurr2", bunkCurr2);
	}

	public String getBunkCurr2()
	{
		return (String) readProperty("bunkCurr2");
	}

	public void setBunkerCost1(BigDecimal bunkerCost1)
	{
		writeProperty("bunkerCost1", bunkerCost1);
	}

	public BigDecimal getBunkerCost1()
	{
		return (BigDecimal) readProperty("bunkerCost1");
	}

	public void setBunkerCost2(BigDecimal bunkerCost2)
	{
		writeProperty("bunkerCost2", bunkerCost2);
	}

	public BigDecimal getBunkerCost2()
	{
		return (BigDecimal) readProperty("bunkerCost2");
	}

	public void setDateOp(Date dateOp)
	{
		writeProperty("dateOp", dateOp);
	}

	public Date getDateOp()
	{
		return (Date) readProperty("dateOp");
	}

	public void setFldchrContrKey(String fldchrContrKey)
	{
		writeProperty("fldchrContrKey", fldchrContrKey);
	}

	public String getFldchrContrKey()
	{
		return (String) readProperty("fldchrContrKey");
	}

	public void setFldchrContrVslKey(String fldchrContrVslKey)
	{
		writeProperty("fldchrContrVslKey", fldchrContrVslKey);
	}

	public String getFldchrContrVslKey()
	{
		return (String) readProperty("fldchrContrVslKey");
	}

	public void setFldchrEstFreightCrncyCode(String fldchrEstFreightCrncyCode)
	{
		writeProperty("fldchrEstFreightCrncyCode", fldchrEstFreightCrncyCode);
	}

	public String getFldchrEstFreightCrncyCode()
	{
		return (String) readProperty("fldchrEstFreightCrncyCode");
	}

	public void setFldchrEstimatedRefMonth(String fldchrEstimatedRefMonth)
	{
		writeProperty("fldchrEstimatedRefMonth", fldchrEstimatedRefMonth);
	}

	public String getFldchrEstimatedRefMonth()
	{
		return (String) readProperty("fldchrEstimatedRefMonth");
	}

	public void setFldchrEstimatedRefYear(String fldchrEstimatedRefYear)
	{
		writeProperty("fldchrEstimatedRefYear", fldchrEstimatedRefYear);
	}

	public String getFldchrEstimatedRefYear()
	{
		return (String) readProperty("fldchrEstimatedRefYear");
	}

	public void setFldchrEstimatedVoyageId(String fldchrEstimatedVoyageId)
	{
		writeProperty("fldchrEstimatedVoyageId", fldchrEstimatedVoyageId);
	}

	public String getFldchrEstimatedVoyageId()
	{
		return (String) readProperty("fldchrEstimatedVoyageId");
	}

	public void setFldchrEstimatedVoyageKey(String fldchrEstimatedVoyageKey)
	{
		writeProperty("fldchrEstimatedVoyageKey", fldchrEstimatedVoyageKey);
	}

	public String getFldchrEstimatedVoyageKey()
	{
		return (String) readProperty("fldchrEstimatedVoyageKey");
	}

	public void setFldchrLastPort(String fldchrLastPort)
	{
		writeProperty("fldchrLastPort", fldchrLastPort);
	}

	public String getFldchrLastPort()
	{
		return (String) readProperty("fldchrLastPort");
	}

	public void setFldchrLloydsRefNum(String fldchrLloydsRefNum)
	{
		writeProperty("fldchrLloydsRefNum", fldchrLloydsRefNum);
	}

	public String getFldchrLloydsRefNum()
	{
		return (String) readProperty("fldchrLloydsRefNum");
	}

	public void setFldchrVoyageStatusFlag(String fldchrVoyageStatusFlag)
	{
		writeProperty("fldchrVoyageStatusFlag", fldchrVoyageStatusFlag);
	}

	public String getFldchrVoyageStatusFlag()
	{
		return (String) readProperty("fldchrVoyageStatusFlag");
	}

	public void setFlddecEstimatedFreight(BigDecimal flddecEstimatedFreight)
	{
		writeProperty("flddecEstimatedFreight", flddecEstimatedFreight);
	}

	public BigDecimal getFlddecEstimatedFreight()
	{
		return (BigDecimal) readProperty("flddecEstimatedFreight");
	}

	public void setFldsdtLastCall(Date fldsdtLastCall)
	{
		writeProperty("fldsdtLastCall", fldsdtLastCall);
	}

	public Date getFldsdtLastCall()
	{
		return (Date) readProperty("fldsdtLastCall");
	}

	public void setFldsdtVoyageEnd(Date fldsdtVoyageEnd)
	{
		writeProperty("fldsdtVoyageEnd", fldsdtVoyageEnd);
	}

	public Date getFldsdtVoyageEnd()
	{
		return (Date) readProperty("fldsdtVoyageEnd");
	}

	public void setOperation(String operation)
	{
		writeProperty("operation", operation);
	}

	public String getOperation()
	{
		return (String) readProperty("operation");
	}

	public void setUserid(String userid)
	{
		writeProperty("userid", userid);
	}

	public String getUserid()
	{
		return (String) readProperty("userid");
	}

}