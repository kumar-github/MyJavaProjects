package com.tc.app.exchangemonitor.model.cayenne.persistent.auto;

import org.apache.cayenne.CayenneDataObject;
import org.apache.cayenne.exp.Property;

/**
 * Class _WbContractCommodity was generated by Cayenne.
 * It is probably a good idea to avoid changing this class manually,
 * since it may be overwritten next time code is regenerated.
 * If you need to make any customizations, please use subclass.
 */
public abstract class _WbContractCommodity extends CayenneDataObject
{

	private static final long serialVersionUID = 1L;

	public static final String ID_PK_COLUMN = "id";

	public static final Property<String> CMDTY_CODE = new Property<String>("cmdtyCode");
	public static final Property<String> CONTRACT_KEY = new Property<String>("contractKey");
	public static final Property<Double> QTY = new Property<Double>("qty");
	public static final Property<String> REMARKS = new Property<String>("remarks");
	public static final Property<String> UOM_CODE = new Property<String>("uomCode");

	public void setCmdtyCode(String cmdtyCode)
	{
		writeProperty("cmdtyCode", cmdtyCode);
	}

	public String getCmdtyCode()
	{
		return (String) readProperty("cmdtyCode");
	}

	public void setContractKey(String contractKey)
	{
		writeProperty("contractKey", contractKey);
	}

	public String getContractKey()
	{
		return (String) readProperty("contractKey");
	}

	public void setQty(Double qty)
	{
		writeProperty("qty", qty);
	}

	public Double getQty()
	{
		return (Double) readProperty("qty");
	}

	public void setRemarks(String remarks)
	{
		writeProperty("remarks", remarks);
	}

	public String getRemarks()
	{
		return (String) readProperty("remarks");
	}

	public void setUomCode(String uomCode)
	{
		writeProperty("uomCode", uomCode);
	}

	public String getUomCode()
	{
		return (String) readProperty("uomCode");
	}

}
