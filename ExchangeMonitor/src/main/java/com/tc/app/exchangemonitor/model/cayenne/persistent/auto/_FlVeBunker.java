package com.tc.app.exchangemonitor.model.cayenne.persistent.auto;

import java.math.BigDecimal;

import org.apache.cayenne.CayenneDataObject;
import org.apache.cayenne.exp.Property;

/**
 * Class _FlVeBunker was generated by Cayenne.
 * It is probably a good idea to avoid changing this class manually,
 * since it may be overwritten next time code is regenerated.
 * If you need to make any customizations, please use subclass.
 */
public abstract class _FlVeBunker extends CayenneDataObject
{

	private static final long serialVersionUID = 1L;

	public static final String BUNKER_ID_PK_COLUMN = "BunkerId";
	public static final String ESTIMATOR_ID_PK_COLUMN = "EstimatorID";

	public static final Property<BigDecimal> F_OPRICE = new Property<BigDecimal>("fOPrice");
	public static final Property<BigDecimal> F_OQUANTITY = new Property<BigDecimal>("fOQuantity");
	public static final Property<BigDecimal> M_DOPRICE = new Property<BigDecimal>("mDOPrice");
	public static final Property<BigDecimal> M_DOQUANTITY = new Property<BigDecimal>("mDOQuantity");
	public static final Property<String> REF_PORT = new Property<String>("refPort");
	public static final Property<String> REFUELLING_POINT = new Property<String>("refuellingPoint");
	public static final Property<Integer> TIME_TO_BUNKER = new Property<Integer>("timeToBunker");

	public void setFOPrice(BigDecimal fOPrice)
	{
		writeProperty("fOPrice", fOPrice);
	}

	public BigDecimal getFOPrice()
	{
		return (BigDecimal) readProperty("fOPrice");
	}

	public void setFOQuantity(BigDecimal fOQuantity)
	{
		writeProperty("fOQuantity", fOQuantity);
	}

	public BigDecimal getFOQuantity()
	{
		return (BigDecimal) readProperty("fOQuantity");
	}

	public void setMDOPrice(BigDecimal mDOPrice)
	{
		writeProperty("mDOPrice", mDOPrice);
	}

	public BigDecimal getMDOPrice()
	{
		return (BigDecimal) readProperty("mDOPrice");
	}

	public void setMDOQuantity(BigDecimal mDOQuantity)
	{
		writeProperty("mDOQuantity", mDOQuantity);
	}

	public BigDecimal getMDOQuantity()
	{
		return (BigDecimal) readProperty("mDOQuantity");
	}

	public void setRefPort(String refPort)
	{
		writeProperty("refPort", refPort);
	}

	public String getRefPort()
	{
		return (String) readProperty("refPort");
	}

	public void setRefuellingPoint(String refuellingPoint)
	{
		writeProperty("refuellingPoint", refuellingPoint);
	}

	public String getRefuellingPoint()
	{
		return (String) readProperty("refuellingPoint");
	}

	public void setTimeToBunker(Integer timeToBunker)
	{
		writeProperty("timeToBunker", timeToBunker);
	}

	public Integer getTimeToBunker()
	{
		return (Integer) readProperty("timeToBunker");
	}

}
