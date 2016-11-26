package com.tc.app.exchangemonitor.model.cayenne.persistent.auto;

import java.math.BigDecimal;

import org.apache.cayenne.CayenneDataObject;
import org.apache.cayenne.exp.Property;

/**
 * Class _WbContractRedeliver was generated by Cayenne.
 * It is probably a good idea to avoid changing this class manually,
 * since it may be overwritten next time code is regenerated.
 * If you need to make any customizations, please use subclass.
 */
public abstract class _WbContractRedeliver extends CayenneDataObject
{

	private static final long serialVersionUID = 1L;

	public static final Property<Double> ALT_IFOPRICE = new Property<Double>("altIFOPrice");
	public static final Property<Double> ALT_MDOPRICE = new Property<Double>("altMDOPrice");
	public static final Property<String> CALC_METHOD = new Property<String>("calcMethod");
	public static final Property<BigDecimal> FINAL_IFO_PRICE = new Property<BigDecimal>("finalIfoPrice");
	public static final Property<BigDecimal> FINAL_MDO_PRICE = new Property<BigDecimal>("finalMdoPrice");
	public static final Property<String> FLDCHR_CONTR_KEY = new Property<String>("fldchrContrKey");
	public static final Property<BigDecimal> I_FOROB = new Property<BigDecimal>("iFORob");
	public static final Property<String> IS_DELIVERED = new Property<String>("isDelivered");
	public static final Property<BigDecimal> M_DOROB = new Property<BigDecimal>("mDORob");

	public void setAltIFOPrice(Double altIFOPrice)
	{
		writeProperty("altIFOPrice", altIFOPrice);
	}

	public Double getAltIFOPrice()
	{
		return (Double) readProperty("altIFOPrice");
	}

	public void setAltMDOPrice(Double altMDOPrice)
	{
		writeProperty("altMDOPrice", altMDOPrice);
	}

	public Double getAltMDOPrice()
	{
		return (Double) readProperty("altMDOPrice");
	}

	public void setCalcMethod(String calcMethod)
	{
		writeProperty("calcMethod", calcMethod);
	}

	public String getCalcMethod()
	{
		return (String) readProperty("calcMethod");
	}

	public void setFinalIfoPrice(BigDecimal finalIfoPrice)
	{
		writeProperty("finalIfoPrice", finalIfoPrice);
	}

	public BigDecimal getFinalIfoPrice()
	{
		return (BigDecimal) readProperty("finalIfoPrice");
	}

	public void setFinalMdoPrice(BigDecimal finalMdoPrice)
	{
		writeProperty("finalMdoPrice", finalMdoPrice);
	}

	public BigDecimal getFinalMdoPrice()
	{
		return (BigDecimal) readProperty("finalMdoPrice");
	}

	public void setFldchrContrKey(String fldchrContrKey)
	{
		writeProperty("fldchrContrKey", fldchrContrKey);
	}

	public String getFldchrContrKey()
	{
		return (String) readProperty("fldchrContrKey");
	}

	public void setIFORob(BigDecimal iFORob)
	{
		writeProperty("iFORob", iFORob);
	}

	public BigDecimal getIFORob()
	{
		return (BigDecimal) readProperty("iFORob");
	}

	public void setIsDelivered(String isDelivered)
	{
		writeProperty("isDelivered", isDelivered);
	}

	public String getIsDelivered()
	{
		return (String) readProperty("isDelivered");
	}

	public void setMDORob(BigDecimal mDORob)
	{
		writeProperty("mDORob", mDORob);
	}

	public BigDecimal getMDORob()
	{
		return (BigDecimal) readProperty("mDORob");
	}

}
