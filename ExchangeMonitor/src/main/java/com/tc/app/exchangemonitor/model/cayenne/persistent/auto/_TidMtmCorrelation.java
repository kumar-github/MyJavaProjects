package com.tc.app.exchangemonitor.model.cayenne.persistent.auto;

import java.math.BigDecimal;

import org.apache.cayenne.CayenneDataObject;
import org.apache.cayenne.exp.Property;

/**
 * Class _TidMtmCorrelation was generated by Cayenne.
 * It is probably a good idea to avoid changing this class manually,
 * since it may be overwritten next time code is regenerated.
 * If you need to make any customizations, please use subclass.
 */
public abstract class _TidMtmCorrelation extends CayenneDataObject
{

	private static final long serialVersionUID = 1L;

	public static final String DIST_NUM1_PK_COLUMN = "dist_num1";
	public static final String DIST_NUM2_PK_COLUMN = "dist_num2";
	public static final String MTM_PL_ASOF_DATE_PK_COLUMN = "mtm_pl_asof_date";

	public static final Property<BigDecimal> CORRELATION = new Property<BigDecimal>("correlation");
	public static final Property<Integer> TRANS_ID = new Property<Integer>("transId");

	public void setCorrelation(BigDecimal correlation)
	{
		writeProperty("correlation", correlation);
	}

	public BigDecimal getCorrelation()
	{
		return (BigDecimal) readProperty("correlation");
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
