package com.tc.app.exchangemonitor.model.cayenne.persistent.auto;

import org.apache.cayenne.CayenneDataObject;
import org.apache.cayenne.exp.Property;

import com.tc.app.exchangemonitor.model.cayenne.persistent.Commodity;
import com.tc.app.exchangemonitor.model.cayenne.persistent.OtcOption;
import com.tc.app.exchangemonitor.model.cayenne.persistent.PriceSource;
import com.tc.app.exchangemonitor.model.cayenne.persistent.Uom;

/**
 * Class _PositionMarkToMarket was generated by Cayenne.
 * It is probably a good idea to avoid changing this class manually,
 * since it may be overwritten next time code is regenerated.
 * If you need to make any customizations, please use subclass.
 */
public abstract class _PositionMarkToMarket extends CayenneDataObject
{

	private static final long serialVersionUID = 1L;

	public static final String MTM_ASOF_DATE_PK_COLUMN = "mtm_asof_date";
	public static final String POS_NUM_PK_COLUMN = "pos_num";

	public static final Property<Double> DELTA = new Property<Double>("delta");
	public static final Property<Double> GAMMA = new Property<Double>("gamma");
	public static final Property<Double> INTEREST_RATE = new Property<Double>("interestRate");
	public static final Property<Double> MTM_MKT_PRICE = new Property<Double>("mtmMktPrice");
	public static final Property<String> OPT_EVAL_METHOD = new Property<String>("optEvalMethod");
	public static final Property<Double> THETA = new Property<Double>("theta");
	public static final Property<Integer> TRANS_ID = new Property<Integer>("transId");
	public static final Property<Double> VEGA = new Property<Double>("vega");
	public static final Property<Double> VOLATILITY = new Property<Double>("volatility");
	public static final Property<Commodity> COMMODITY = new Property<Commodity>("commodity");
	public static final Property<OtcOption> OTC_OPTION = new Property<OtcOption>("otcOption");
	public static final Property<PriceSource> PRICE_SOURCE = new Property<PriceSource>("priceSource");
	public static final Property<Uom> UOM = new Property<Uom>("uom");

	public void setDelta(Double delta)
	{
		writeProperty("delta", delta);
	}

	public Double getDelta()
	{
		return (Double) readProperty("delta");
	}

	public void setGamma(Double gamma)
	{
		writeProperty("gamma", gamma);
	}

	public Double getGamma()
	{
		return (Double) readProperty("gamma");
	}

	public void setInterestRate(Double interestRate)
	{
		writeProperty("interestRate", interestRate);
	}

	public Double getInterestRate()
	{
		return (Double) readProperty("interestRate");
	}

	public void setMtmMktPrice(Double mtmMktPrice)
	{
		writeProperty("mtmMktPrice", mtmMktPrice);
	}

	public Double getMtmMktPrice()
	{
		return (Double) readProperty("mtmMktPrice");
	}

	public void setOptEvalMethod(String optEvalMethod)
	{
		writeProperty("optEvalMethod", optEvalMethod);
	}

	public String getOptEvalMethod()
	{
		return (String) readProperty("optEvalMethod");
	}

	public void setTheta(Double theta)
	{
		writeProperty("theta", theta);
	}

	public Double getTheta()
	{
		return (Double) readProperty("theta");
	}

	public void setTransId(Integer transId)
	{
		writeProperty("transId", transId);
	}

	public Integer getTransId()
	{
		return (Integer) readProperty("transId");
	}

	public void setVega(Double vega)
	{
		writeProperty("vega", vega);
	}

	public Double getVega()
	{
		return (Double) readProperty("vega");
	}

	public void setVolatility(Double volatility)
	{
		writeProperty("volatility", volatility);
	}

	public Double getVolatility()
	{
		return (Double) readProperty("volatility");
	}

	public void setCommodity(Commodity commodity)
	{
		setToOneTarget("commodity", commodity, true);
	}

	public Commodity getCommodity()
	{
		return (Commodity) readProperty("commodity");
	}

	public void setOtcOption(OtcOption otcOption)
	{
		setToOneTarget("otcOption", otcOption, true);
	}

	public OtcOption getOtcOption()
	{
		return (OtcOption) readProperty("otcOption");
	}

	public void setPriceSource(PriceSource priceSource)
	{
		setToOneTarget("priceSource", priceSource, true);
	}

	public PriceSource getPriceSource()
	{
		return (PriceSource) readProperty("priceSource");
	}

	public void setUom(Uom uom)
	{
		setToOneTarget("uom", uom, true);
	}

	public Uom getUom()
	{
		return (Uom) readProperty("uom");
	}

}
