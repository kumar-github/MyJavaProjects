package com.tc.app.exchangemonitor.model.cayenne.persistent.auto;

import java.util.Date;

import org.apache.cayenne.CayenneDataObject;
import org.apache.cayenne.exp.Property;

/**
 * Class _AudWbContractCoaRoute was generated by Cayenne.
 * It is probably a good idea to avoid changing this class manually,
 * since it may be overwritten next time code is regenerated.
 * If you need to make any customizations, please use subclass.
 */
public abstract class _AudWbContractCoaRoute extends CayenneDataObject
{

	private static final long serialVersionUID = 1L;

	public static final Property<Date> DATE_OP = new Property<Date>("dateOp");
	public static final Property<String> FLD_PORT_KEY = new Property<String>("fldPortKey");
	public static final Property<String> FLDCHR_CONTR_DETAIL_KEY = new Property<String>("fldchrContrDetailKey");
	public static final Property<String> FLDCHR_CONTR_KEY = new Property<String>("fldchrContrKey");
	public static final Property<String> FLDCHR_ROUTE_KEY = new Property<String>("fldchrRouteKey");
	public static final Property<Integer> FLDINT_ROUTE_ORDER = new Property<Integer>("fldintRouteOrder");
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

	public void setFldPortKey(String fldPortKey)
	{
		writeProperty("fldPortKey", fldPortKey);
	}

	public String getFldPortKey()
	{
		return (String) readProperty("fldPortKey");
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

	public void setFldchrRouteKey(String fldchrRouteKey)
	{
		writeProperty("fldchrRouteKey", fldchrRouteKey);
	}

	public String getFldchrRouteKey()
	{
		return (String) readProperty("fldchrRouteKey");
	}

	public void setFldintRouteOrder(Integer fldintRouteOrder)
	{
		writeProperty("fldintRouteOrder", fldintRouteOrder);
	}

	public Integer getFldintRouteOrder()
	{
		return (Integer) readProperty("fldintRouteOrder");
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
