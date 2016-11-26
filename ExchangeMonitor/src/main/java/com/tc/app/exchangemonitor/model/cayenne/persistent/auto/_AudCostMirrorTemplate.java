package com.tc.app.exchangemonitor.model.cayenne.persistent.auto;

import java.math.BigDecimal;
import java.util.Date;

import org.apache.cayenne.CayenneDataObject;
import org.apache.cayenne.exp.Property;

/**
 * Class _AudCostMirrorTemplate was generated by Cayenne.
 * It is probably a good idea to avoid changing this class manually,
 * since it may be overwritten next time code is regenerated.
 * If you need to make any customizations, please use subclass.
 */
public abstract class _AudCostMirrorTemplate extends CayenneDataObject
{

	private static final long serialVersionUID = 1L;

	public static final Property<Date> DATE_OP = new Property<Date>("dateOp");
	public static final Property<String> FLDCHR_CALCULATION_TYPE = new Property<String>("fldchrCalculationType");
	public static final Property<String> FLDCHR_CONTR_KEY = new Property<String>("fldchrContrKey");
	public static final Property<String> FLDCHR_NOTE = new Property<String>("fldchrNote");
	public static final Property<String> FLDCHR_TYPE_OPER_VALUE = new Property<String>("fldchrTypeOperValue");
	public static final Property<String> FLDCHR_TYPE_OPERATION = new Property<String>("fldchrTypeOperation");
	public static final Property<BigDecimal> FLDINT_CALCULATION_VALUE = new Property<BigDecimal>("fldintCalculationValue");
	public static final Property<Integer> FLDINT_REC_ID = new Property<Integer>("fldintRecID");
	public static final Property<String> OPERATION = new Property<String>("operation");
	public static final Property<Integer> OPERATION_GROUP = new Property<Integer>("operationGroup");
	public static final Property<String> USERID = new Property<String>("userid");

	public void setDateOp(Date dateOp)
	{
		writeProperty("dateOp", dateOp);
	}

	public Date getDateOp()
	{
		return (Date) readProperty("dateOp");
	}

	public void setFldchrCalculationType(String fldchrCalculationType)
	{
		writeProperty("fldchrCalculationType", fldchrCalculationType);
	}

	public String getFldchrCalculationType()
	{
		return (String) readProperty("fldchrCalculationType");
	}

	public void setFldchrContrKey(String fldchrContrKey)
	{
		writeProperty("fldchrContrKey", fldchrContrKey);
	}

	public String getFldchrContrKey()
	{
		return (String) readProperty("fldchrContrKey");
	}

	public void setFldchrNote(String fldchrNote)
	{
		writeProperty("fldchrNote", fldchrNote);
	}

	public String getFldchrNote()
	{
		return (String) readProperty("fldchrNote");
	}

	public void setFldchrTypeOperValue(String fldchrTypeOperValue)
	{
		writeProperty("fldchrTypeOperValue", fldchrTypeOperValue);
	}

	public String getFldchrTypeOperValue()
	{
		return (String) readProperty("fldchrTypeOperValue");
	}

	public void setFldchrTypeOperation(String fldchrTypeOperation)
	{
		writeProperty("fldchrTypeOperation", fldchrTypeOperation);
	}

	public String getFldchrTypeOperation()
	{
		return (String) readProperty("fldchrTypeOperation");
	}

	public void setFldintCalculationValue(BigDecimal fldintCalculationValue)
	{
		writeProperty("fldintCalculationValue", fldintCalculationValue);
	}

	public BigDecimal getFldintCalculationValue()
	{
		return (BigDecimal) readProperty("fldintCalculationValue");
	}

	public void setFldintRecID(Integer fldintRecID)
	{
		writeProperty("fldintRecID", fldintRecID);
	}

	public Integer getFldintRecID()
	{
		return (Integer) readProperty("fldintRecID");
	}

	public void setOperation(String operation)
	{
		writeProperty("operation", operation);
	}

	public String getOperation()
	{
		return (String) readProperty("operation");
	}

	public void setOperationGroup(Integer operationGroup)
	{
		writeProperty("operationGroup", operationGroup);
	}

	public Integer getOperationGroup()
	{
		return (Integer) readProperty("operationGroup");
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
