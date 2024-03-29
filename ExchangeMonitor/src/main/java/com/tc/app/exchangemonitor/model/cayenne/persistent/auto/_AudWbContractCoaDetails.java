package com.tc.app.exchangemonitor.model.cayenne.persistent.auto;

import java.math.BigDecimal;
import java.util.Date;

import org.apache.cayenne.CayenneDataObject;
import org.apache.cayenne.exp.Property;

/**
 * Class _AudWbContractCoaDetails was generated by Cayenne.
 * It is probably a good idea to avoid changing this class manually,
 * since it may be overwritten next time code is regenerated.
 * If you need to make any customizations, please use subclass.
 */
public abstract class _AudWbContractCoaDetails extends CayenneDataObject
{

	private static final long serialVersionUID = 1L;

	public static final Property<Date> DATE_OP = new Property<Date>("dateOp");
	public static final Property<String> FLDCHR_CONTR_DETAIL_KEY = new Property<String>("fldchrContrDetailKey");
	public static final Property<String> FLDCHR_CONTR_KEY = new Property<String>("fldchrContrKey");
	public static final Property<String> FLDCHR_LLOYDS_REF_NUM = new Property<String>("fldchrLloydsRefNum");
	public static final Property<String> FLDCHR_RATE_TYPE = new Property<String>("fldchrRateType");
	public static final Property<String> FLDCHR_TYPE = new Property<String>("fldchrType");
	public static final Property<String> FLDCHR_UOM_DEMURRAGE = new Property<String>("fldchrUomDemurrage");
	public static final Property<String> FLDCHR_UOM_RATE = new Property<String>("fldchrUomRate");
	public static final Property<BigDecimal> FLDDEC_ADDRESS_COMMISSION = new Property<BigDecimal>("flddecAddressCommission");
	public static final Property<BigDecimal> FLDDEC_CALCULATE = new Property<BigDecimal>("flddecCalculate");
	public static final Property<BigDecimal> FLDDEC_DEMURRAGE = new Property<BigDecimal>("flddecDemurrage");
	public static final Property<BigDecimal> FLDDEC_FLATE_RATE = new Property<BigDecimal>("flddecFlateRate");
	public static final Property<BigDecimal> FLDDEC_LUMPSUM = new Property<BigDecimal>("flddecLumpsum");
	public static final Property<BigDecimal> FLDDEC_MIN_QTY = new Property<BigDecimal>("flddecMinQty");
	public static final Property<BigDecimal> FLDDEC_WORDSCALE = new Property<BigDecimal>("flddecWordscale");
	public static final Property<Integer> FLDINT_BOOK_COMPANY = new Property<Integer>("fldintBookCompany");
	public static final Property<Integer> FLDINT_BROKER = new Property<Integer>("fldintBroker");
	public static final Property<Integer> FLDINT_CPARTY = new Property<Integer>("fldintCparty");
	public static final Property<Integer> FLDINT_ORDER = new Property<Integer>("fldintOrder");
	public static final Property<Date> FLDSDT_TIME_STAMP = new Property<Date>("fldsdtTimeStamp");
	public static final Property<String> OPERATION = new Property<String>("operation");
	public static final Property<String> USERID = new Property<String>("userid");

	public void setDateOp(Date dateOp)
	{
		writeProperty("dateOp", dateOp);
	}

	public Date getDateOp()
	{
		return (Date) readProperty("dateOp");
	}

	public void setFldchrContrDetailKey(String fldchrContrDetailKey)
	{
		writeProperty("fldchrContrDetailKey", fldchrContrDetailKey);
	}

	public String getFldchrContrDetailKey()
	{
		return (String) readProperty("fldchrContrDetailKey");
	}

	public void setFldchrContrKey(String fldchrContrKey)
	{
		writeProperty("fldchrContrKey", fldchrContrKey);
	}

	public String getFldchrContrKey()
	{
		return (String) readProperty("fldchrContrKey");
	}

	public void setFldchrLloydsRefNum(String fldchrLloydsRefNum)
	{
		writeProperty("fldchrLloydsRefNum", fldchrLloydsRefNum);
	}

	public String getFldchrLloydsRefNum()
	{
		return (String) readProperty("fldchrLloydsRefNum");
	}

	public void setFldchrRateType(String fldchrRateType)
	{
		writeProperty("fldchrRateType", fldchrRateType);
	}

	public String getFldchrRateType()
	{
		return (String) readProperty("fldchrRateType");
	}

	public void setFldchrType(String fldchrType)
	{
		writeProperty("fldchrType", fldchrType);
	}

	public String getFldchrType()
	{
		return (String) readProperty("fldchrType");
	}

	public void setFldchrUomDemurrage(String fldchrUomDemurrage)
	{
		writeProperty("fldchrUomDemurrage", fldchrUomDemurrage);
	}

	public String getFldchrUomDemurrage()
	{
		return (String) readProperty("fldchrUomDemurrage");
	}

	public void setFldchrUomRate(String fldchrUomRate)
	{
		writeProperty("fldchrUomRate", fldchrUomRate);
	}

	public String getFldchrUomRate()
	{
		return (String) readProperty("fldchrUomRate");
	}

	public void setFlddecAddressCommission(BigDecimal flddecAddressCommission)
	{
		writeProperty("flddecAddressCommission", flddecAddressCommission);
	}

	public BigDecimal getFlddecAddressCommission()
	{
		return (BigDecimal) readProperty("flddecAddressCommission");
	}

	public void setFlddecCalculate(BigDecimal flddecCalculate)
	{
		writeProperty("flddecCalculate", flddecCalculate);
	}

	public BigDecimal getFlddecCalculate()
	{
		return (BigDecimal) readProperty("flddecCalculate");
	}

	public void setFlddecDemurrage(BigDecimal flddecDemurrage)
	{
		writeProperty("flddecDemurrage", flddecDemurrage);
	}

	public BigDecimal getFlddecDemurrage()
	{
		return (BigDecimal) readProperty("flddecDemurrage");
	}

	public void setFlddecFlateRate(BigDecimal flddecFlateRate)
	{
		writeProperty("flddecFlateRate", flddecFlateRate);
	}

	public BigDecimal getFlddecFlateRate()
	{
		return (BigDecimal) readProperty("flddecFlateRate");
	}

	public void setFlddecLumpsum(BigDecimal flddecLumpsum)
	{
		writeProperty("flddecLumpsum", flddecLumpsum);
	}

	public BigDecimal getFlddecLumpsum()
	{
		return (BigDecimal) readProperty("flddecLumpsum");
	}

	public void setFlddecMinQty(BigDecimal flddecMinQty)
	{
		writeProperty("flddecMinQty", flddecMinQty);
	}

	public BigDecimal getFlddecMinQty()
	{
		return (BigDecimal) readProperty("flddecMinQty");
	}

	public void setFlddecWordscale(BigDecimal flddecWordscale)
	{
		writeProperty("flddecWordscale", flddecWordscale);
	}

	public BigDecimal getFlddecWordscale()
	{
		return (BigDecimal) readProperty("flddecWordscale");
	}

	public void setFldintBookCompany(Integer fldintBookCompany)
	{
		writeProperty("fldintBookCompany", fldintBookCompany);
	}

	public Integer getFldintBookCompany()
	{
		return (Integer) readProperty("fldintBookCompany");
	}

	public void setFldintBroker(Integer fldintBroker)
	{
		writeProperty("fldintBroker", fldintBroker);
	}

	public Integer getFldintBroker()
	{
		return (Integer) readProperty("fldintBroker");
	}

	public void setFldintCparty(Integer fldintCparty)
	{
		writeProperty("fldintCparty", fldintCparty);
	}

	public Integer getFldintCparty()
	{
		return (Integer) readProperty("fldintCparty");
	}

	public void setFldintOrder(Integer fldintOrder)
	{
		writeProperty("fldintOrder", fldintOrder);
	}

	public Integer getFldintOrder()
	{
		return (Integer) readProperty("fldintOrder");
	}

	public void setFldsdtTimeStamp(Date fldsdtTimeStamp)
	{
		writeProperty("fldsdtTimeStamp", fldsdtTimeStamp);
	}

	public Date getFldsdtTimeStamp()
	{
		return (Date) readProperty("fldsdtTimeStamp");
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
