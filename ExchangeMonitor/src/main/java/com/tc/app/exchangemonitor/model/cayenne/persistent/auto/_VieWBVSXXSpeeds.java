package com.tc.app.exchangemonitor.model.cayenne.persistent.auto;

import java.math.BigDecimal;

import org.apache.cayenne.CayenneDataObject;
import org.apache.cayenne.exp.Property;

/**
 * Class _VieWBVSXXSpeeds was generated by Cayenne.
 * It is probably a good idea to avoid changing this class manually,
 * since it may be overwritten next time code is regenerated.
 * If you need to make any customizations, please use subclass.
 */
public abstract class _VieWBVSXXSpeeds extends CayenneDataObject
{

	private static final long serialVersionUID = 1L;

	public static final Property<String> FLDCHR_CONTR_VSL_KEY = new Property<String>("fldchrContrVslKey");
	public static final Property<BigDecimal> FLDCHR_SPEED_BALLAST = new Property<BigDecimal>("fldchrSpeedBallast");
	public static final Property<BigDecimal> FLDCHR_SPEED_LADEN = new Property<BigDecimal>("fldchrSpeedLaden");

	public void setFldchrContrVslKey(String fldchrContrVslKey)
	{
		writeProperty("fldchrContrVslKey", fldchrContrVslKey);
	}

	public String getFldchrContrVslKey()
	{
		return (String) readProperty("fldchrContrVslKey");
	}

	public void setFldchrSpeedBallast(BigDecimal fldchrSpeedBallast)
	{
		writeProperty("fldchrSpeedBallast", fldchrSpeedBallast);
	}

	public BigDecimal getFldchrSpeedBallast()
	{
		return (BigDecimal) readProperty("fldchrSpeedBallast");
	}

	public void setFldchrSpeedLaden(BigDecimal fldchrSpeedLaden)
	{
		writeProperty("fldchrSpeedLaden", fldchrSpeedLaden);
	}

	public BigDecimal getFldchrSpeedLaden()
	{
		return (BigDecimal) readProperty("fldchrSpeedLaden");
	}

}
