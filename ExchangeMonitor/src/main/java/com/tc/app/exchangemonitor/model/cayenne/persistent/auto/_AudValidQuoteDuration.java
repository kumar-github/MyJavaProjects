package com.tc.app.exchangemonitor.model.cayenne.persistent.auto;

import org.apache.cayenne.CayenneDataObject;
import org.apache.cayenne.exp.Property;

/**
 * Class _AudValidQuoteDuration was generated by Cayenne.
 * It is probably a good idea to avoid changing this class manually,
 * since it may be overwritten next time code is regenerated.
 * If you need to make any customizations, please use subclass.
 */
public abstract class _AudValidQuoteDuration extends CayenneDataObject
{

	private static final long serialVersionUID = 1L;

	public static final Property<Integer> ID = new Property<Integer>("id");
	public static final Property<Integer> QUOTE_ID = new Property<Integer>("quoteId");
	public static final Property<Integer> QUOTE_PERIOD_DURATION_ID = new Property<Integer>("quotePeriodDurationId");
	public static final Property<Integer> RESP_TRANS_ID = new Property<Integer>("respTransId");
	public static final Property<Integer> TRANS_ID = new Property<Integer>("transId");

	public void setId(Integer id)
	{
		writeProperty("id", id);
	}

	public Integer getId()
	{
		return (Integer) readProperty("id");
	}

	public void setQuoteId(Integer quoteId)
	{
		writeProperty("quoteId", quoteId);
	}

	public Integer getQuoteId()
	{
		return (Integer) readProperty("quoteId");
	}

	public void setQuotePeriodDurationId(Integer quotePeriodDurationId)
	{
		writeProperty("quotePeriodDurationId", quotePeriodDurationId);
	}

	public Integer getQuotePeriodDurationId()
	{
		return (Integer) readProperty("quotePeriodDurationId");
	}

	public void setRespTransId(Integer respTransId)
	{
		writeProperty("respTransId", respTransId);
	}

	public Integer getRespTransId()
	{
		return (Integer) readProperty("respTransId");
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
