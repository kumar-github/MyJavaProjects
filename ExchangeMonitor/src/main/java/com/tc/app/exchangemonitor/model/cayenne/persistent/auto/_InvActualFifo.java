package com.tc.app.exchangemonitor.model.cayenne.persistent.auto;

import org.apache.cayenne.CayenneDataObject;
import org.apache.cayenne.exp.Property;

import com.tc.app.exchangemonitor.model.cayenne.persistent.InvActual;
import com.tc.app.exchangemonitor.model.cayenne.persistent.Uom;

/**
 * Class _InvActualFifo was generated by Cayenne.
 * It is probably a good idea to avoid changing this class manually,
 * since it may be overwritten next time code is regenerated.
 * If you need to make any customizations, please use subclass.
 */
public abstract class _InvActualFifo extends CayenneDataObject
{

	private static final long serialVersionUID = 1L;

	public static final String OID_PK_COLUMN = "oid";

	public static final Property<Double> FIFO_QTY = new Property<Double>("fifoQty");
	public static final Property<Integer> TRANS_ID = new Property<Integer>("transId");
	public static final Property<InvActual> INV_ACTUAL = new Property<InvActual>("invActual");
	public static final Property<InvActual> INV_ACTUAL1 = new Property<InvActual>("invActual1");
	public static final Property<Uom> UOM = new Property<Uom>("uom");

	public void setFifoQty(Double fifoQty)
	{
		writeProperty("fifoQty", fifoQty);
	}

	public Double getFifoQty()
	{
		return (Double) readProperty("fifoQty");
	}

	public void setTransId(Integer transId)
	{
		writeProperty("transId", transId);
	}

	public Integer getTransId()
	{
		return (Integer) readProperty("transId");
	}

	public void setInvActual(InvActual invActual)
	{
		setToOneTarget("invActual", invActual, true);
	}

	public InvActual getInvActual()
	{
		return (InvActual) readProperty("invActual");
	}

	public void setInvActual1(InvActual invActual1)
	{
		setToOneTarget("invActual1", invActual1, true);
	}

	public InvActual getInvActual1()
	{
		return (InvActual) readProperty("invActual1");
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