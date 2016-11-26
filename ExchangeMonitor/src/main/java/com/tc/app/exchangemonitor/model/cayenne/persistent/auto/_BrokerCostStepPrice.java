package com.tc.app.exchangemonitor.model.cayenne.persistent.auto;

import java.math.BigDecimal;

import org.apache.cayenne.CayenneDataObject;
import org.apache.cayenne.exp.Property;

import com.tc.app.exchangemonitor.model.cayenne.persistent.BrokerCostAutogen;
import com.tc.app.exchangemonitor.model.cayenne.persistent.Commodity;
import com.tc.app.exchangemonitor.model.cayenne.persistent.Uom;

/**
 * Class _BrokerCostStepPrice was generated by Cayenne.
 * It is probably a good idea to avoid changing this class manually,
 * since it may be overwritten next time code is regenerated.
 * If you need to make any customizations, please use subclass.
 */
public abstract class _BrokerCostStepPrice extends CayenneDataObject
{

	private static final long serialVersionUID = 1L;

	public static final String COST_AUTOGEN_NUM_PK_COLUMN = "cost_autogen_num";
	public static final String STEP_PRICE_NUM_PK_COLUMN = "step_price_num";

	public static final Property<BigDecimal> QTY_UPTO = new Property<BigDecimal>("qtyUpto");
	public static final Property<Integer> TRANS_ID = new Property<Integer>("transId");
	public static final Property<BigDecimal> UNIT_PRICE = new Property<BigDecimal>("unitPrice");
	public static final Property<BrokerCostAutogen> BROKER_COST_AUTOGEN = new Property<BrokerCostAutogen>("brokerCostAutogen");
	public static final Property<Commodity> COMMODITY = new Property<Commodity>("commodity");
	public static final Property<Uom> UOM = new Property<Uom>("uom");
	public static final Property<Uom> UOM1 = new Property<Uom>("uom1");

	public void setQtyUpto(BigDecimal qtyUpto)
	{
		writeProperty("qtyUpto", qtyUpto);
	}

	public BigDecimal getQtyUpto()
	{
		return (BigDecimal) readProperty("qtyUpto");
	}

	public void setTransId(Integer transId)
	{
		writeProperty("transId", transId);
	}

	public Integer getTransId()
	{
		return (Integer) readProperty("transId");
	}

	public void setUnitPrice(BigDecimal unitPrice)
	{
		writeProperty("unitPrice", unitPrice);
	}

	public BigDecimal getUnitPrice()
	{
		return (BigDecimal) readProperty("unitPrice");
	}

	public void setBrokerCostAutogen(BrokerCostAutogen brokerCostAutogen)
	{
		setToOneTarget("brokerCostAutogen", brokerCostAutogen, true);
	}

	public BrokerCostAutogen getBrokerCostAutogen()
	{
		return (BrokerCostAutogen) readProperty("brokerCostAutogen");
	}

	public void setCommodity(Commodity commodity)
	{
		setToOneTarget("commodity", commodity, true);
	}

	public Commodity getCommodity()
	{
		return (Commodity) readProperty("commodity");
	}

	public void setUom(Uom uom)
	{
		setToOneTarget("uom", uom, true);
	}

	public Uom getUom()
	{
		return (Uom) readProperty("uom");
	}

	public void setUom1(Uom uom1)
	{
		setToOneTarget("uom1", uom1, true);
	}

	public Uom getUom1()
	{
		return (Uom) readProperty("uom1");
	}

}
