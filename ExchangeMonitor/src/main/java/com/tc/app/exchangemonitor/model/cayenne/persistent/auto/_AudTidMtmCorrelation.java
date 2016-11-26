package com.tc.app.exchangemonitor.model.cayenne.persistent.auto;

import java.math.BigDecimal;
import java.util.Date;

import org.apache.cayenne.CayenneDataObject;
import org.apache.cayenne.exp.Property;

/**
 * Class _AudTidMtmCorrelation was generated by Cayenne.
 * It is probably a good idea to avoid changing this class manually,
 * since it may be overwritten next time code is regenerated.
 * If you need to make any customizations, please use subclass.
 */
public abstract class _AudTidMtmCorrelation extends CayenneDataObject
{

	private static final long serialVersionUID = 1L;

	public static final Property<BigDecimal> CORRELATION = new Property<BigDecimal>("correlation");
	public static final Property<Integer> DIST_NUM1 = new Property<Integer>("distNum1");
	public static final Property<Integer> DIST_NUM2 = new Property<Integer>("distNum2");
	public static final Property<Date> MTM_PL_ASOF_DATE = new Property<Date>("mtmPlAsofDate");
	public static final Property<Integer> RESP_TRANS_ID = new Property<Integer>("respTransId");
	public static final Property<Integer> TRANS_ID = new Property<Integer>("transId");

	public void setCorrelation(BigDecimal correlation)
	{
		writeProperty("correlation", correlation);
	}

	public BigDecimal getCorrelation()
	{
		return (BigDecimal) readProperty("correlation");
	}

	public void setDistNum1(Integer distNum1)
	{
		writeProperty("distNum1", distNum1);
	}

	public Integer getDistNum1()
	{
		return (Integer) readProperty("distNum1");
	}

	public void setDistNum2(Integer distNum2)
	{
		writeProperty("distNum2", distNum2);
	}

	public Integer getDistNum2()
	{
		return (Integer) readProperty("distNum2");
	}

	public void setMtmPlAsofDate(Date mtmPlAsofDate)
	{
		writeProperty("mtmPlAsofDate", mtmPlAsofDate);
	}

	public Date getMtmPlAsofDate()
	{
		return (Date) readProperty("mtmPlAsofDate");
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
