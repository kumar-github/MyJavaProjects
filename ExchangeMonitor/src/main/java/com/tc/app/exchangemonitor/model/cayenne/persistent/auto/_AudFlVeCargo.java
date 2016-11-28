package com.tc.app.exchangemonitor.model.cayenne.persistent.auto;

import java.math.BigDecimal;
import java.util.Date;

import org.apache.cayenne.CayenneDataObject;
import org.apache.cayenne.exp.Property;

/**
 * Class _AudFlVeCargo was generated by Cayenne.
 * It is probably a good idea to avoid changing this class manually,
 * since it may be overwritten next time code is regenerated.
 * If you need to make any customizations, please use subclass.
 */
public abstract class _AudFlVeCargo extends CayenneDataObject
{

	private static final long serialVersionUID = 1L;

	public static final Property<Integer> CARGO_ID = new Property<Integer>("cargoID");
	public static final Property<BigDecimal> CARGO_QUANTITY = new Property<BigDecimal>("cargoQuantity");
	public static final Property<BigDecimal> CARGO_REVENUE = new Property<BigDecimal>("cargoRevenue");
	public static final Property<BigDecimal> COMMISSIONS = new Property<BigDecimal>("commissions");
	public static final Property<Date> DATE_OP = new Property<Date>("dateOp");
	public static final Property<String> DISCHARGING_PORT = new Property<String>("dischargingPort");
	public static final Property<Integer> ESTIMATOR_ID = new Property<Integer>("estimatorID");
	public static final Property<String> LOADING_PORT = new Property<String>("loadingPort");
	public static final Property<String> OPERATION = new Property<String>("operation");
	public static final Property<String> USERID = new Property<String>("userid");

	public void setCargoID(Integer cargoID)
	{
		writeProperty("cargoID", cargoID);
	}

	public Integer getCargoID()
	{
		return (Integer) readProperty("cargoID");
	}

	public void setCargoQuantity(BigDecimal cargoQuantity)
	{
		writeProperty("cargoQuantity", cargoQuantity);
	}

	public BigDecimal getCargoQuantity()
	{
		return (BigDecimal) readProperty("cargoQuantity");
	}

	public void setCargoRevenue(BigDecimal cargoRevenue)
	{
		writeProperty("cargoRevenue", cargoRevenue);
	}

	public BigDecimal getCargoRevenue()
	{
		return (BigDecimal) readProperty("cargoRevenue");
	}

	public void setCommissions(BigDecimal commissions)
	{
		writeProperty("commissions", commissions);
	}

	public BigDecimal getCommissions()
	{
		return (BigDecimal) readProperty("commissions");
	}

	public void setDateOp(Date dateOp)
	{
		writeProperty("dateOp", dateOp);
	}

	public Date getDateOp()
	{
		return (Date) readProperty("dateOp");
	}

	public void setDischargingPort(String dischargingPort)
	{
		writeProperty("dischargingPort", dischargingPort);
	}

	public String getDischargingPort()
	{
		return (String) readProperty("dischargingPort");
	}

	public void setEstimatorID(Integer estimatorID)
	{
		writeProperty("estimatorID", estimatorID);
	}

	public Integer getEstimatorID()
	{
		return (Integer) readProperty("estimatorID");
	}

	public void setLoadingPort(String loadingPort)
	{
		writeProperty("loadingPort", loadingPort);
	}

	public String getLoadingPort()
	{
		return (String) readProperty("loadingPort");
	}

	public void setOperation(String operation)
	{
		writeProperty("operation", operation);
	}

	public String getOperation()
	{
		return (String) readProperty("operation");
	}

	public void setUserid(String userid)
	{
		writeProperty("userid", userid);
	}

	public String getUserid()
	{
		return (String) readProperty("userid");
	}

}