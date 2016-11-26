package com.tc.app.exchangemonitor.model.cayenne.persistent.auto;

import java.util.Date;

import org.apache.cayenne.CayenneDataObject;
import org.apache.cayenne.exp.Property;

/**
 * Class _AudFreightAllocation was generated by Cayenne.
 * It is probably a good idea to avoid changing this class manually,
 * since it may be overwritten next time code is regenerated.
 * If you need to make any customizations, please use subclass.
 */
public abstract class _AudFreightAllocation extends CayenneDataObject
{

	private static final long serialVersionUID = 1L;

	public static final Property<String> ALLOCATION_TYPE = new Property<String>("allocationType");
	public static final Property<Date> CREATION_DATE = new Property<Date>("creationDate");
	public static final Property<String> CREATION_USER_INIT = new Property<String>("creationUserInit");
	public static final Property<Date> DATE_OP = new Property<Date>("dateOp");
	public static final Property<Date> FINAL_DATE = new Property<Date>("finalDate");
	public static final Property<String> FINAL_USER_INIT = new Property<String>("finalUserInit");
	public static final Property<Integer> OID = new Property<Integer>("oid");
	public static final Property<String> OPERATION = new Property<String>("operation");
	public static final Property<String> REMARKS = new Property<String>("remarks");
	public static final Property<String> STATUS = new Property<String>("status");
	public static final Property<String> USERID = new Property<String>("userid");

	public void setAllocationType(String allocationType)
	{
		writeProperty("allocationType", allocationType);
	}

	public String getAllocationType()
	{
		return (String) readProperty("allocationType");
	}

	public void setCreationDate(Date creationDate)
	{
		writeProperty("creationDate", creationDate);
	}

	public Date getCreationDate()
	{
		return (Date) readProperty("creationDate");
	}

	public void setCreationUserInit(String creationUserInit)
	{
		writeProperty("creationUserInit", creationUserInit);
	}

	public String getCreationUserInit()
	{
		return (String) readProperty("creationUserInit");
	}

	public void setDateOp(Date dateOp)
	{
		writeProperty("dateOp", dateOp);
	}

	public Date getDateOp()
	{
		return (Date) readProperty("dateOp");
	}

	public void setFinalDate(Date finalDate)
	{
		writeProperty("finalDate", finalDate);
	}

	public Date getFinalDate()
	{
		return (Date) readProperty("finalDate");
	}

	public void setFinalUserInit(String finalUserInit)
	{
		writeProperty("finalUserInit", finalUserInit);
	}

	public String getFinalUserInit()
	{
		return (String) readProperty("finalUserInit");
	}

	public void setOid(Integer oid)
	{
		writeProperty("oid", oid);
	}

	public Integer getOid()
	{
		return (Integer) readProperty("oid");
	}

	public void setOperation(String operation)
	{
		writeProperty("operation", operation);
	}

	public String getOperation()
	{
		return (String) readProperty("operation");
	}

	public void setRemarks(String remarks)
	{
		writeProperty("remarks", remarks);
	}

	public String getRemarks()
	{
		return (String) readProperty("remarks");
	}

	public void setStatus(String status)
	{
		writeProperty("status", status);
	}

	public String getStatus()
	{
		return (String) readProperty("status");
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
