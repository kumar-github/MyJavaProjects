package com.tc.app.exchangemonitor.model.cayenne.persistent.auto;

import org.apache.cayenne.CayenneDataObject;
import org.apache.cayenne.exp.Property;

/**
 * Class _CostScheduledRate was generated by Cayenne.
 * It is probably a good idea to avoid changing this class manually,
 * since it may be overwritten next time code is regenerated.
 * If you need to make any customizations, please use subclass.
 */
public abstract class _CostScheduledRate extends CayenneDataObject
{

	private static final long serialVersionUID = 1L;

	public static final String COST_NUM_PK_COLUMN = "cost_num";
	public static final String SEQ_NUM_PK_COLUMN = "seq_num";

	public static final Property<Double> SCHEDULED_RATE = new Property<Double>("scheduledRate");
	public static final Property<Double> SCHEDULED_SCALE = new Property<Double>("scheduledScale");
	public static final Property<Integer> TRANS_ID = new Property<Integer>("transId");

	public void setScheduledRate(Double scheduledRate)
	{
		writeProperty("scheduledRate", scheduledRate);
	}

	public Double getScheduledRate()
	{
		return (Double) readProperty("scheduledRate");
	}

	public void setScheduledScale(Double scheduledScale)
	{
		writeProperty("scheduledScale", scheduledScale);
	}

	public Double getScheduledScale()
	{
		return (Double) readProperty("scheduledScale");
	}

	public void setTransId(Integer transId)
	{
		writeProperty("transId", transId);
	}

	public Integer getTransId()
	{
		return (Integer) readProperty("transId");
	}

}