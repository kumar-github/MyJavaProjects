package com.tc.app.exchangemonitor.model.cayenne.persistent.auto;

import java.math.BigDecimal;
import java.util.Date;

import org.apache.cayenne.CayenneDataObject;
import org.apache.cayenne.exp.Property;

/**
 * Class _AudWbContractHireSec was generated by Cayenne.
 * It is probably a good idea to avoid changing this class manually,
 * since it may be overwritten next time code is regenerated.
 * If you need to make any customizations, please use subclass.
 */
public abstract class _AudWbContractHireSec extends CayenneDataObject
{

	private static final long serialVersionUID = 1L;

	public static final Property<Date> DATE_OP = new Property<Date>("dateOp");
	public static final Property<Date> END_DATE = new Property<Date>("endDate");
	public static final Property<String> ENTITY_ID = new Property<String>("entityID");
	public static final Property<String> FLDCHR_CONTR_KEY = new Property<String>("fldchrContrKey");
	public static final Property<String> OPERATION = new Property<String>("operation");
	public static final Property<BigDecimal> PRICE_SEC = new Property<BigDecimal>("priceSec");
	public static final Property<Date> START_DATE = new Property<Date>("startDate");
	public static final Property<String> USERID = new Property<String>("userid");

	public void setDateOp(Date dateOp)
	{
		writeProperty("dateOp", dateOp);
	}

	public Date getDateOp()
	{
		return (Date) readProperty("dateOp");
	}

	public void setEndDate(Date endDate)
	{
		writeProperty("endDate", endDate);
	}

	public Date getEndDate()
	{
		return (Date) readProperty("endDate");
	}

	public void setEntityID(String entityID)
	{
		writeProperty("entityID", entityID);
	}

	public String getEntityID()
	{
		return (String) readProperty("entityID");
	}

	public void setFldchrContrKey(String fldchrContrKey)
	{
		writeProperty("fldchrContrKey", fldchrContrKey);
	}

	public String getFldchrContrKey()
	{
		return (String) readProperty("fldchrContrKey");
	}

	public void setOperation(String operation)
	{
		writeProperty("operation", operation);
	}

	public String getOperation()
	{
		return (String) readProperty("operation");
	}

	public void setPriceSec(BigDecimal priceSec)
	{
		writeProperty("priceSec", priceSec);
	}

	public BigDecimal getPriceSec()
	{
		return (BigDecimal) readProperty("priceSec");
	}

	public void setStartDate(Date startDate)
	{
		writeProperty("startDate", startDate);
	}

	public Date getStartDate()
	{
		return (Date) readProperty("startDate");
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