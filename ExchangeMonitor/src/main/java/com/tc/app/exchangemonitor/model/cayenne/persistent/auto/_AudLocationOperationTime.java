package com.tc.app.exchangemonitor.model.cayenne.persistent.auto;

import java.math.BigDecimal;
import java.util.Date;

import org.apache.cayenne.CayenneDataObject;
import org.apache.cayenne.exp.Property;

/**
 * Class _AudLocationOperationTime was generated by Cayenne.
 * It is probably a good idea to avoid changing this class manually,
 * since it may be overwritten next time code is regenerated.
 * If you need to make any customizations, please use subclass.
 */
public abstract class _AudLocationOperationTime extends CayenneDataObject
{

	private static final long serialVersionUID = 1L;

	public static final Property<Date> DATE_OP = new Property<Date>("dateOp");
	public static final Property<String> FLDCHR_CMDTY_CODE = new Property<String>("fldchrCmdtyCode");
	public static final Property<String> FLDCHR_OPERATION_TYPE = new Property<String>("fldchrOperationType");
	public static final Property<String> FLDCHR_REC_ID = new Property<String>("fldchrRecId");
	public static final Property<String> FLDCHR_STORAGE_CODE = new Property<String>("fldchrStorageCode");
	public static final Property<BigDecimal> FLDDEC_LOAD_DISCH_RATE = new Property<BigDecimal>("flddecLoadDischRate");
	public static final Property<String> OPERATION = new Property<String>("operation");
	public static final Property<Integer> TRANS_ID = new Property<Integer>("transId");
	public static final Property<String> USERID = new Property<String>("userid");

	public void setDateOp(Date dateOp)
	{
		writeProperty("dateOp", dateOp);
	}

	public Date getDateOp()
	{
		return (Date) readProperty("dateOp");
	}

	public void setFldchrCmdtyCode(String fldchrCmdtyCode)
	{
		writeProperty("fldchrCmdtyCode", fldchrCmdtyCode);
	}

	public String getFldchrCmdtyCode()
	{
		return (String) readProperty("fldchrCmdtyCode");
	}

	public void setFldchrOperationType(String fldchrOperationType)
	{
		writeProperty("fldchrOperationType", fldchrOperationType);
	}

	public String getFldchrOperationType()
	{
		return (String) readProperty("fldchrOperationType");
	}

	public void setFldchrRecId(String fldchrRecId)
	{
		writeProperty("fldchrRecId", fldchrRecId);
	}

	public String getFldchrRecId()
	{
		return (String) readProperty("fldchrRecId");
	}

	public void setFldchrStorageCode(String fldchrStorageCode)
	{
		writeProperty("fldchrStorageCode", fldchrStorageCode);
	}

	public String getFldchrStorageCode()
	{
		return (String) readProperty("fldchrStorageCode");
	}

	public void setFlddecLoadDischRate(BigDecimal flddecLoadDischRate)
	{
		writeProperty("flddecLoadDischRate", flddecLoadDischRate);
	}

	public BigDecimal getFlddecLoadDischRate()
	{
		return (BigDecimal) readProperty("flddecLoadDischRate");
	}

	public void setOperation(String operation)
	{
		writeProperty("operation", operation);
	}

	public String getOperation()
	{
		return (String) readProperty("operation");
	}

	public void setTransId(Integer transId)
	{
		writeProperty("transId", transId);
	}

	public Integer getTransId()
	{
		return (Integer) readProperty("transId");
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
