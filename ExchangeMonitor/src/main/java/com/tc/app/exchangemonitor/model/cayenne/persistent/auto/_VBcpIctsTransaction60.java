package com.tc.app.exchangemonitor.model.cayenne.persistent.auto;

import java.math.BigDecimal;
import java.util.Date;

import org.apache.cayenne.CayenneDataObject;
import org.apache.cayenne.exp.Property;

/**
 * Class _VBcpIctsTransaction60 was generated by Cayenne.
 * It is probably a good idea to avoid changing this class manually,
 * since it may be overwritten next time code is regenerated.
 * If you need to make any customizations, please use subclass.
 */
public abstract class _VBcpIctsTransaction60 extends CayenneDataObject
{

	private static final long serialVersionUID = 1L;

	public static final Property<String> APP_NAME = new Property<String>("appName");
	public static final Property<String> APP_REVISION = new Property<String>("appRevision");
	public static final Property<Short> EXECUTOR_ID = new Property<Short>("executorId");
	public static final Property<Integer> PARENT_TRANS_ID = new Property<Integer>("parentTransId");
	public static final Property<BigDecimal> SEQUENCE = new Property<BigDecimal>("sequence");
	public static final Property<Short> SPID = new Property<Short>("spid");
	public static final Property<Date> TRAN_DATE = new Property<Date>("tranDate");
	public static final Property<Integer> TRANS_ID = new Property<Integer>("transId");
	public static final Property<String> TYPE = new Property<String>("type");
	public static final Property<String> USER_INIT = new Property<String>("userInit");
	public static final Property<String> WORKSTATION_ID = new Property<String>("workstationId");

	public void setAppName(String appName)
	{
		writeProperty("appName", appName);
	}

	public String getAppName()
	{
		return (String) readProperty("appName");
	}

	public void setAppRevision(String appRevision)
	{
		writeProperty("appRevision", appRevision);
	}

	public String getAppRevision()
	{
		return (String) readProperty("appRevision");
	}

	public void setExecutorId(Short executorId)
	{
		writeProperty("executorId", executorId);
	}

	public Short getExecutorId()
	{
		return (Short) readProperty("executorId");
	}

	public void setParentTransId(Integer parentTransId)
	{
		writeProperty("parentTransId", parentTransId);
	}

	public Integer getParentTransId()
	{
		return (Integer) readProperty("parentTransId");
	}

	public void setSequence(BigDecimal sequence)
	{
		writeProperty("sequence", sequence);
	}

	public BigDecimal getSequence()
	{
		return (BigDecimal) readProperty("sequence");
	}

	public void setSpid(Short spid)
	{
		writeProperty("spid", spid);
	}

	public Short getSpid()
	{
		return (Short) readProperty("spid");
	}

	public void setTranDate(Date tranDate)
	{
		writeProperty("tranDate", tranDate);
	}

	public Date getTranDate()
	{
		return (Date) readProperty("tranDate");
	}

	public void setTransId(Integer transId)
	{
		writeProperty("transId", transId);
	}

	public Integer getTransId()
	{
		return (Integer) readProperty("transId");
	}

	public void setType(String type)
	{
		writeProperty("type", type);
	}

	public String getType()
	{
		return (String) readProperty("type");
	}

	public void setUserInit(String userInit)
	{
		writeProperty("userInit", userInit);
	}

	public String getUserInit()
	{
		return (String) readProperty("userInit");
	}

	public void setWorkstationId(String workstationId)
	{
		writeProperty("workstationId", workstationId);
	}

	public String getWorkstationId()
	{
		return (String) readProperty("workstationId");
	}

}
