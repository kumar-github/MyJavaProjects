package com.tc.app.exchangemonitor.model.cayenne.persistent.auto;

import java.math.BigDecimal;
import java.util.Date;

import org.apache.cayenne.CayenneDataObject;
import org.apache.cayenne.exp.Property;

/**
 * Class _AudFlMarketVessels was generated by Cayenne.
 * It is probably a good idea to avoid changing this class manually,
 * since it may be overwritten next time code is regenerated.
 * If you need to make any customizations, please use subclass.
 */
public abstract class _AudFlMarketVessels extends CayenneDataObject
{

	private static final long serialVersionUID = 1L;

	public static final Property<Date> DATE_OP = new Property<Date>("dateOp");
	public static final Property<BigDecimal> I_FOCONSUMPTION_ON_HARBOUR = new Property<BigDecimal>("iFOConsumptionOnHarbour");
	public static final Property<BigDecimal> I_FOCONSUMPTION_ON_NAVIGATION = new Property<BigDecimal>("iFOConsumptionOnNavigation");
	public static final Property<Integer> ID_VESSEL_TEMPLATE = new Property<Integer>("idVesselTemplate");
	public static final Property<BigDecimal> M_DOCONSUMPTION_ON_HARBOUR = new Property<BigDecimal>("mDOConsumptionOnHarbour");
	public static final Property<BigDecimal> M_DOCONSUMPTION_ON_NAVIGATION = new Property<BigDecimal>("mDOConsumptionOnNavigation");
	public static final Property<String> OPERATION = new Property<String>("operation");
	public static final Property<Integer> SPEED = new Property<Integer>("speed");
	public static final Property<String> USERID = new Property<String>("userid");
	public static final Property<BigDecimal> VESSEL_TCCOST_PER_DAY = new Property<BigDecimal>("vesselTCCostPerDay");
	public static final Property<String> VESSEL_TEMPLATE_NAME = new Property<String>("vesselTemplateName");

	public void setDateOp(Date dateOp)
	{
		writeProperty("dateOp", dateOp);
	}

	public Date getDateOp()
	{
		return (Date) readProperty("dateOp");
	}

	public void setIFOConsumptionOnHarbour(BigDecimal iFOConsumptionOnHarbour)
	{
		writeProperty("iFOConsumptionOnHarbour", iFOConsumptionOnHarbour);
	}

	public BigDecimal getIFOConsumptionOnHarbour()
	{
		return (BigDecimal) readProperty("iFOConsumptionOnHarbour");
	}

	public void setIFOConsumptionOnNavigation(BigDecimal iFOConsumptionOnNavigation)
	{
		writeProperty("iFOConsumptionOnNavigation", iFOConsumptionOnNavigation);
	}

	public BigDecimal getIFOConsumptionOnNavigation()
	{
		return (BigDecimal) readProperty("iFOConsumptionOnNavigation");
	}

	public void setIdVesselTemplate(Integer idVesselTemplate)
	{
		writeProperty("idVesselTemplate", idVesselTemplate);
	}

	public Integer getIdVesselTemplate()
	{
		return (Integer) readProperty("idVesselTemplate");
	}

	public void setMDOConsumptionOnHarbour(BigDecimal mDOConsumptionOnHarbour)
	{
		writeProperty("mDOConsumptionOnHarbour", mDOConsumptionOnHarbour);
	}

	public BigDecimal getMDOConsumptionOnHarbour()
	{
		return (BigDecimal) readProperty("mDOConsumptionOnHarbour");
	}

	public void setMDOConsumptionOnNavigation(BigDecimal mDOConsumptionOnNavigation)
	{
		writeProperty("mDOConsumptionOnNavigation", mDOConsumptionOnNavigation);
	}

	public BigDecimal getMDOConsumptionOnNavigation()
	{
		return (BigDecimal) readProperty("mDOConsumptionOnNavigation");
	}

	public void setOperation(String operation)
	{
		writeProperty("operation", operation);
	}

	public String getOperation()
	{
		return (String) readProperty("operation");
	}

	public void setSpeed(Integer speed)
	{
		writeProperty("speed", speed);
	}

	public Integer getSpeed()
	{
		return (Integer) readProperty("speed");
	}

	public void setUserid(String userid)
	{
		writeProperty("userid", userid);
	}

	public String getUserid()
	{
		return (String) readProperty("userid");
	}

	public void setVesselTCCostPerDay(BigDecimal vesselTCCostPerDay)
	{
		writeProperty("vesselTCCostPerDay", vesselTCCostPerDay);
	}

	public BigDecimal getVesselTCCostPerDay()
	{
		return (BigDecimal) readProperty("vesselTCCostPerDay");
	}

	public void setVesselTemplateName(String vesselTemplateName)
	{
		writeProperty("vesselTemplateName", vesselTemplateName);
	}

	public String getVesselTemplateName()
	{
		return (String) readProperty("vesselTemplateName");
	}

}