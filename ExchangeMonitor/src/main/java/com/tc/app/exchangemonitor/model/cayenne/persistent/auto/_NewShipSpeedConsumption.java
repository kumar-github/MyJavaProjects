package com.tc.app.exchangemonitor.model.cayenne.persistent.auto;

import java.math.BigDecimal;
import java.util.Date;

import org.apache.cayenne.CayenneDataObject;
import org.apache.cayenne.exp.Property;

import com.tc.app.exchangemonitor.model.cayenne.persistent.WbContract;

/**
 * Class _NewShipSpeedConsumption was generated by Cayenne.
 * It is probably a good idea to avoid changing this class manually,
 * since it may be overwritten next time code is regenerated.
 * If you need to make any customizations, please use subclass.
 */
public abstract class _NewShipSpeedConsumption extends CayenneDataObject
{

	private static final long serialVersionUID = 1L;

	public static final String FLDCHR_REC_ID_PK_COLUMN = "fldchrRecId";

	public static final Property<String> FLDCHR_CMDTY_CODE = new Property<String>("fldchrCmdtyCode");
	public static final Property<String> FLDCHR_LLOYDS_REF_NUM = new Property<String>("fldchrLloydsRefNum");
	public static final Property<String> FLDCHR_USER_NAME = new Property<String>("fldchrUserName");
	public static final Property<BigDecimal> FLDDBL_SPEED = new Property<BigDecimal>("flddblSpeed");
	public static final Property<BigDecimal> FLDDEC_BALLAST_CONSUMPTION = new Property<BigDecimal>("flddecBallastConsumption");
	public static final Property<BigDecimal> FLDDEC_LADEN_CONSUMPTION = new Property<BigDecimal>("flddecLadenConsumption");
	public static final Property<Date> FLDSDT_TIME_STAMP = new Property<Date>("fldsdtTimeStamp");
	public static final Property<WbContract> WB_CONTRACT = new Property<WbContract>("wbContract");

	public void setFldchrCmdtyCode(String fldchrCmdtyCode)
	{
		writeProperty("fldchrCmdtyCode", fldchrCmdtyCode);
	}

	public String getFldchrCmdtyCode()
	{
		return (String) readProperty("fldchrCmdtyCode");
	}

	public void setFldchrLloydsRefNum(String fldchrLloydsRefNum)
	{
		writeProperty("fldchrLloydsRefNum", fldchrLloydsRefNum);
	}

	public String getFldchrLloydsRefNum()
	{
		return (String) readProperty("fldchrLloydsRefNum");
	}

	public void setFldchrUserName(String fldchrUserName)
	{
		writeProperty("fldchrUserName", fldchrUserName);
	}

	public String getFldchrUserName()
	{
		return (String) readProperty("fldchrUserName");
	}

	public void setFlddblSpeed(BigDecimal flddblSpeed)
	{
		writeProperty("flddblSpeed", flddblSpeed);
	}

	public BigDecimal getFlddblSpeed()
	{
		return (BigDecimal) readProperty("flddblSpeed");
	}

	public void setFlddecBallastConsumption(BigDecimal flddecBallastConsumption)
	{
		writeProperty("flddecBallastConsumption", flddecBallastConsumption);
	}

	public BigDecimal getFlddecBallastConsumption()
	{
		return (BigDecimal) readProperty("flddecBallastConsumption");
	}

	public void setFlddecLadenConsumption(BigDecimal flddecLadenConsumption)
	{
		writeProperty("flddecLadenConsumption", flddecLadenConsumption);
	}

	public BigDecimal getFlddecLadenConsumption()
	{
		return (BigDecimal) readProperty("flddecLadenConsumption");
	}

	public void setFldsdtTimeStamp(Date fldsdtTimeStamp)
	{
		writeProperty("fldsdtTimeStamp", fldsdtTimeStamp);
	}

	public Date getFldsdtTimeStamp()
	{
		return (Date) readProperty("fldsdtTimeStamp");
	}

	public void setWbContract(WbContract wbContract)
	{
		setToOneTarget("wbContract", wbContract, true);
	}

	public WbContract getWbContract()
	{
		return (WbContract) readProperty("wbContract");
	}

}
