package com.tc.app.exchangemonitor.model.cayenne.persistent.auto;

import java.math.BigDecimal;

import org.apache.cayenne.CayenneDataObject;
import org.apache.cayenne.exp.Property;

/**
 * Class _RcExtInfo was generated by Cayenne.
 * It is probably a good idea to avoid changing this class manually,
 * since it may be overwritten next time code is regenerated.
 * If you need to make any customizations, please use subclass.
 */
public abstract class _RcExtInfo extends CayenneDataObject
{

	private static final long serialVersionUID = 1L;

	public static final Property<BigDecimal> RATE_OF_DISCOUNT = new Property<BigDecimal>("rateOfDiscount");
	public static final Property<Integer> RISK_COVER_NUM = new Property<Integer>("riskCoverNum");

	public void setRateOfDiscount(BigDecimal rateOfDiscount)
	{
		writeProperty("rateOfDiscount", rateOfDiscount);
	}

	public BigDecimal getRateOfDiscount()
	{
		return (BigDecimal) readProperty("rateOfDiscount");
	}

	public void setRiskCoverNum(Integer riskCoverNum)
	{
		writeProperty("riskCoverNum", riskCoverNum);
	}

	public Integer getRiskCoverNum()
	{
		return (Integer) readProperty("riskCoverNum");
	}

}