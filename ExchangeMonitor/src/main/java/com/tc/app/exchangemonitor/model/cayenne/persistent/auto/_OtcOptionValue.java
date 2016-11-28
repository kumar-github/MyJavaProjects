package com.tc.app.exchangemonitor.model.cayenne.persistent.auto;

import org.apache.cayenne.CayenneDataObject;
import org.apache.cayenne.exp.Property;

import com.tc.app.exchangemonitor.model.cayenne.persistent.OtcOption;

/**
 * Class _OtcOptionValue was generated by Cayenne.
 * It is probably a good idea to avoid changing this class manually,
 * since it may be overwritten next time code is regenerated.
 * If you need to make any customizations, please use subclass.
 */
public abstract class _OtcOptionValue extends CayenneDataObject
{

	private static final long serialVersionUID = 1L;

	public static final String OTC_OPT_CODE_PK_COLUMN = "otc_opt_code";
	public static final String OTC_OPT_QUOTE_DATE_PK_COLUMN = "otc_opt_quote_date";

	public static final Property<Double> OTC_OPT_DELTA = new Property<Double>("otcOptDelta");
	public static final Property<Double> OTC_OPT_PRICE = new Property<Double>("otcOptPrice");
	public static final Property<Integer> TRANS_ID = new Property<Integer>("transId");
	public static final Property<OtcOption> OTC_OPTION = new Property<OtcOption>("otcOption");

	public void setOtcOptDelta(Double otcOptDelta)
	{
		writeProperty("otcOptDelta", otcOptDelta);
	}

	public Double getOtcOptDelta()
	{
		return (Double) readProperty("otcOptDelta");
	}

	public void setOtcOptPrice(Double otcOptPrice)
	{
		writeProperty("otcOptPrice", otcOptPrice);
	}

	public Double getOtcOptPrice()
	{
		return (Double) readProperty("otcOptPrice");
	}

	public void setTransId(Integer transId)
	{
		writeProperty("transId", transId);
	}

	public Integer getTransId()
	{
		return (Integer) readProperty("transId");
	}

	public void setOtcOption(OtcOption otcOption)
	{
		setToOneTarget("otcOption", otcOption, true);
	}

	public OtcOption getOtcOption()
	{
		return (OtcOption) readProperty("otcOption");
	}

}