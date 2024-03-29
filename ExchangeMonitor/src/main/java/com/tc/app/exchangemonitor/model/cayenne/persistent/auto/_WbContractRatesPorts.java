package com.tc.app.exchangemonitor.model.cayenne.persistent.auto;

import org.apache.cayenne.CayenneDataObject;
import org.apache.cayenne.exp.Property;

/**
 * Class _WbContractRatesPorts was generated by Cayenne.
 * It is probably a good idea to avoid changing this class manually,
 * since it may be overwritten next time code is regenerated.
 * If you need to make any customizations, please use subclass.
 */
public abstract class _WbContractRatesPorts extends CayenneDataObject
{

	private static final long serialVersionUID = 1L;

	public static final String FLDCHR_REC_ID_PK_COLUMN = "fldchrRecId";

	public static final Property<String> FLDCHR_LOCT_KEY = new Property<String>("fldchrLoctKey");
	public static final Property<String> FLDCHR_RATE_ID = new Property<String>("fldchrRateId");
	public static final Property<Integer> FLDINT_LOCATION_ORDER = new Property<Integer>("fldintLocationOrder");
	public static final Property<Integer> TRANS_ID = new Property<Integer>("transId");

	public void setFldchrLoctKey(String fldchrLoctKey)
	{
		writeProperty("fldchrLoctKey", fldchrLoctKey);
	}

	public String getFldchrLoctKey()
	{
		return (String) readProperty("fldchrLoctKey");
	}

	public void setFldchrRateId(String fldchrRateId)
	{
		writeProperty("fldchrRateId", fldchrRateId);
	}

	public String getFldchrRateId()
	{
		return (String) readProperty("fldchrRateId");
	}

	public void setFldintLocationOrder(Integer fldintLocationOrder)
	{
		writeProperty("fldintLocationOrder", fldintLocationOrder);
	}

	public Integer getFldintLocationOrder()
	{
		return (Integer) readProperty("fldintLocationOrder");
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
