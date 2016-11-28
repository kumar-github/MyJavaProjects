package com.tc.app.exchangemonitor.model.cayenne.persistent.auto;

import java.util.Date;

import org.apache.cayenne.CayenneDataObject;
import org.apache.cayenne.exp.Property;

import com.tc.app.exchangemonitor.model.cayenne.persistent.AlsRunStatus;
import com.tc.app.exchangemonitor.model.cayenne.persistent.IctsTransaction;
import com.tc.app.exchangemonitor.model.cayenne.persistent.ServerConfig;

/**
 * Class _AlsRun was generated by Cayenne.
 * It is probably a good idea to avoid changing this class manually,
 * since it may be overwritten next time code is regenerated.
 * If you need to make any customizations, please use subclass.
 */
public abstract class _AlsRun extends CayenneDataObject
{

	private static final long serialVersionUID = 1L;

	public static final String ALS_MODULE_GROUP_ID_PK_COLUMN = "als_module_group_id";
	public static final String SEQUENCE_PK_COLUMN = "sequence";

	public static final Property<Date> CREATION_TIME = new Property<Date>("creationTime");
	public static final Property<Date> END_TIME = new Property<Date>("endTime");
	public static final Property<Short> INSTANCE_NUM = new Property<Short>("instanceNum");
	public static final Property<Date> START_TIME = new Property<Date>("startTime");
	public static final Property<Integer> TRANS_ID = new Property<Integer>("transId");
	public static final Property<ServerConfig> ALS_MODULE_GROUP = new Property<ServerConfig>("alsModuleGroup");
	public static final Property<AlsRunStatus> ALS_RUN_STATUS = new Property<AlsRunStatus>("alsRunStatus");
	public static final Property<IctsTransaction> ICTS_TRANSACTION = new Property<IctsTransaction>("ictsTransaction");

	public void setCreationTime(Date creationTime)
	{
		writeProperty("creationTime", creationTime);
	}

	public Date getCreationTime()
	{
		return (Date) readProperty("creationTime");
	}

	public void setEndTime(Date endTime)
	{
		writeProperty("endTime", endTime);
	}

	public Date getEndTime()
	{
		return (Date) readProperty("endTime");
	}

	public void setInstanceNum(Short instanceNum)
	{
		writeProperty("instanceNum", instanceNum);
	}

	public Short getInstanceNum()
	{
		return (Short) readProperty("instanceNum");
	}

	public void setStartTime(Date startTime)
	{
		writeProperty("startTime", startTime);
	}

	public Date getStartTime()
	{
		return (Date) readProperty("startTime");
	}

	public void setTransId(Integer transId)
	{
		writeProperty("transId", transId);
	}

	public Integer getTransId()
	{
		return (Integer) readProperty("transId");
	}

	public void setAlsModuleGroup(ServerConfig alsModuleGroup)
	{
		setToOneTarget("alsModuleGroup", alsModuleGroup, true);
	}

	public ServerConfig getAlsModuleGroup()
	{
		return (ServerConfig) readProperty("alsModuleGroup");
	}

	public void setAlsRunStatus(AlsRunStatus alsRunStatus)
	{
		setToOneTarget("alsRunStatus", alsRunStatus, true);
	}

	public AlsRunStatus getAlsRunStatus()
	{
		return (AlsRunStatus) readProperty("alsRunStatus");
	}

	public void setIctsTransaction(IctsTransaction ictsTransaction)
	{
		setToOneTarget("ictsTransaction", ictsTransaction, true);
	}

	public IctsTransaction getIctsTransaction()
	{
		return (IctsTransaction) readProperty("ictsTransaction");
	}

}