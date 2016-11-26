package com.tc.app.exchangemonitor.model.cayenne.persistent.auto;

import java.math.BigDecimal;

import org.apache.cayenne.CayenneDataObject;
import org.apache.cayenne.exp.Property;

/**
 * Class _RefuelingServiceLink was generated by Cayenne.
 * It is probably a good idea to avoid changing this class manually,
 * since it may be overwritten next time code is regenerated.
 * If you need to make any customizations, please use subclass.
 */
public abstract class _RefuelingServiceLink extends CayenneDataObject
{

	private static final long serialVersionUID = 1L;

	public static final String REFUELING_OP_PK_COLUMN = "RefuelingOP";
	public static final String SERVICE_OP_CODE_PK_COLUMN = "ServiceOpCode";

	public static final Property<BigDecimal> UNIT_PRICE_MT = new Property<BigDecimal>("unitPriceMT");

	public void setUnitPriceMT(BigDecimal unitPriceMT)
	{
		writeProperty("unitPriceMT", unitPriceMT);
	}

	public BigDecimal getUnitPriceMT()
	{
		return (BigDecimal) readProperty("unitPriceMT");
	}

}
