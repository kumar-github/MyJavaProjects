package com.tc.app.exchangemonitor.model.cayenne.persistent.auto;

import java.util.Date;

import org.apache.cayenne.CayenneDataObject;
import org.apache.cayenne.exp.Property;

/**
 * Class _AudABCPortDatabase was generated by Cayenne.
 * It is probably a good idea to avoid changing this class manually,
 * since it may be overwritten next time code is regenerated.
 * If you need to make any customizations, please use subclass.
 */
public abstract class _AudABCPortDatabase extends CayenneDataObject
{

	private static final long serialVersionUID = 1L;

	public static final Property<String> A_BCCOMPLETE_CODE = new Property<String>("aBCCompleteCode");
	public static final Property<String> A_BCCOUNTRY = new Property<String>("aBCCountry");
	public static final Property<String> A_BCPORT_CODE = new Property<String>("aBCPortCode");
	public static final Property<String> A_BCPORTNAME = new Property<String>("aBCPortname");
	public static final Property<Integer> ABCID = new Property<Integer>("abcid");
	public static final Property<Date> DATE_OP = new Property<Date>("dateOp");
	public static final Property<String> FLEETIME_PORT_NAME = new Property<String>("fleetimePortName");
	public static final Property<String> OPERATION = new Property<String>("operation");
	public static final Property<String> USERID = new Property<String>("userid");

	public void setABCCompleteCode(String aBCCompleteCode)
	{
		writeProperty("aBCCompleteCode", aBCCompleteCode);
	}

	public String getABCCompleteCode()
	{
		return (String) readProperty("aBCCompleteCode");
	}

	public void setABCCountry(String aBCCountry)
	{
		writeProperty("aBCCountry", aBCCountry);
	}

	public String getABCCountry()
	{
		return (String) readProperty("aBCCountry");
	}

	public void setABCPortCode(String aBCPortCode)
	{
		writeProperty("aBCPortCode", aBCPortCode);
	}

	public String getABCPortCode()
	{
		return (String) readProperty("aBCPortCode");
	}

	public void setABCPortname(String aBCPortname)
	{
		writeProperty("aBCPortname", aBCPortname);
	}

	public String getABCPortname()
	{
		return (String) readProperty("aBCPortname");
	}

	public void setAbcid(Integer abcid)
	{
		writeProperty("abcid", abcid);
	}

	public Integer getAbcid()
	{
		return (Integer) readProperty("abcid");
	}

	public void setDateOp(Date dateOp)
	{
		writeProperty("dateOp", dateOp);
	}

	public Date getDateOp()
	{
		return (Date) readProperty("dateOp");
	}

	public void setFleetimePortName(String fleetimePortName)
	{
		writeProperty("fleetimePortName", fleetimePortName);
	}

	public String getFleetimePortName()
	{
		return (String) readProperty("fleetimePortName");
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
