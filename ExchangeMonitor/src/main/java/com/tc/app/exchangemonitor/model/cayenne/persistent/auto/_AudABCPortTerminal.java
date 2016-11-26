package com.tc.app.exchangemonitor.model.cayenne.persistent.auto;

import java.util.Date;

import org.apache.cayenne.CayenneDataObject;
import org.apache.cayenne.exp.Property;

/**
 * Class _AudABCPortTerminal was generated by Cayenne.
 * It is probably a good idea to avoid changing this class manually,
 * since it may be overwritten next time code is regenerated.
 * If you need to make any customizations, please use subclass.
 */
public abstract class _AudABCPortTerminal extends CayenneDataObject
{

	private static final long serialVersionUID = 1L;

	public static final Property<String> A_BCCOMPLETE_CODE_PORT = new Property<String>("aBCCompleteCodePort");
	public static final Property<Integer> A_BCIDTERMINAL = new Property<Integer>("aBCIDTerminal");
	public static final Property<String> A_BCPORT_TERMINAL_CODE = new Property<String>("aBCPortTerminalCode");
	public static final Property<String> A_BCPORT_TERMINAL_DESCR = new Property<String>("aBCPortTerminalDescr");
	public static final Property<String> A_BCSTORAGE_SAP_ALIAS = new Property<String>("aBCStorageSapAlias");
	public static final Property<Date> DATE_OP = new Property<Date>("dateOp");
	public static final Property<String> OPERATION = new Property<String>("operation");
	public static final Property<String> USERID = new Property<String>("userid");

	public void setABCCompleteCodePort(String aBCCompleteCodePort)
	{
		writeProperty("aBCCompleteCodePort", aBCCompleteCodePort);
	}

	public String getABCCompleteCodePort()
	{
		return (String) readProperty("aBCCompleteCodePort");
	}

	public void setABCIDTerminal(Integer aBCIDTerminal)
	{
		writeProperty("aBCIDTerminal", aBCIDTerminal);
	}

	public Integer getABCIDTerminal()
	{
		return (Integer) readProperty("aBCIDTerminal");
	}

	public void setABCPortTerminalCode(String aBCPortTerminalCode)
	{
		writeProperty("aBCPortTerminalCode", aBCPortTerminalCode);
	}

	public String getABCPortTerminalCode()
	{
		return (String) readProperty("aBCPortTerminalCode");
	}

	public void setABCPortTerminalDescr(String aBCPortTerminalDescr)
	{
		writeProperty("aBCPortTerminalDescr", aBCPortTerminalDescr);
	}

	public String getABCPortTerminalDescr()
	{
		return (String) readProperty("aBCPortTerminalDescr");
	}

	public void setABCStorageSapAlias(String aBCStorageSapAlias)
	{
		writeProperty("aBCStorageSapAlias", aBCStorageSapAlias);
	}

	public String getABCStorageSapAlias()
	{
		return (String) readProperty("aBCStorageSapAlias");
	}

	public void setDateOp(Date dateOp)
	{
		writeProperty("dateOp", dateOp);
	}

	public Date getDateOp()
	{
		return (Date) readProperty("dateOp");
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
