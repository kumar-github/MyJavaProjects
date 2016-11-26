package com.tc.app.exchangemonitor.model.cayenne.persistent.auto;

import java.util.Date;

import org.apache.cayenne.CayenneDataObject;
import org.apache.cayenne.exp.Property;

/**
 * Class _AudBunkerPurPriceLookup was generated by Cayenne.
 * It is probably a good idea to avoid changing this class manually,
 * since it may be overwritten next time code is regenerated.
 * If you need to make any customizations, please use subclass.
 */
public abstract class _AudBunkerPurPriceLookup extends CayenneDataObject
{

	private static final long serialVersionUID = 1L;

	public static final Property<String> CMDTY_CODE = new Property<String>("cmdtyCode");
	public static final Property<Date> DEL_DATE_FROM = new Property<Date>("delDateFrom");
	public static final Property<Date> DEL_DATE_TO = new Property<Date>("delDateTo");
	public static final Property<String> FORMULA_IND = new Property<String>("formulaInd");
	public static final Property<String> FORMULA_NAME = new Property<String>("formulaName");
	public static final Property<Integer> OID = new Property<Integer>("oid");
	public static final Property<Double> PRICE_AMT = new Property<Double>("priceAmt");
	public static final Property<String> PRICE_CURR_CODE = new Property<String>("priceCurrCode");
	public static final Property<String> PRICE_UOM_CODE = new Property<String>("priceUomCode");
	public static final Property<Integer> RESP_TRANS_ID = new Property<Integer>("respTransId");
	public static final Property<String> STORAGE_LOC_CODE = new Property<String>("storageLocCode");
	public static final Property<Integer> TRANS_ID = new Property<Integer>("transId");

	public void setCmdtyCode(String cmdtyCode)
	{
		writeProperty("cmdtyCode", cmdtyCode);
	}

	public String getCmdtyCode()
	{
		return (String) readProperty("cmdtyCode");
	}

	public void setDelDateFrom(Date delDateFrom)
	{
		writeProperty("delDateFrom", delDateFrom);
	}

	public Date getDelDateFrom()
	{
		return (Date) readProperty("delDateFrom");
	}

	public void setDelDateTo(Date delDateTo)
	{
		writeProperty("delDateTo", delDateTo);
	}

	public Date getDelDateTo()
	{
		return (Date) readProperty("delDateTo");
	}

	public void setFormulaInd(String formulaInd)
	{
		writeProperty("formulaInd", formulaInd);
	}

	public String getFormulaInd()
	{
		return (String) readProperty("formulaInd");
	}

	public void setFormulaName(String formulaName)
	{
		writeProperty("formulaName", formulaName);
	}

	public String getFormulaName()
	{
		return (String) readProperty("formulaName");
	}

	public void setOid(Integer oid)
	{
		writeProperty("oid", oid);
	}

	public Integer getOid()
	{
		return (Integer) readProperty("oid");
	}

	public void setPriceAmt(Double priceAmt)
	{
		writeProperty("priceAmt", priceAmt);
	}

	public Double getPriceAmt()
	{
		return (Double) readProperty("priceAmt");
	}

	public void setPriceCurrCode(String priceCurrCode)
	{
		writeProperty("priceCurrCode", priceCurrCode);
	}

	public String getPriceCurrCode()
	{
		return (String) readProperty("priceCurrCode");
	}

	public void setPriceUomCode(String priceUomCode)
	{
		writeProperty("priceUomCode", priceUomCode);
	}

	public String getPriceUomCode()
	{
		return (String) readProperty("priceUomCode");
	}

	public void setRespTransId(Integer respTransId)
	{
		writeProperty("respTransId", respTransId);
	}

	public Integer getRespTransId()
	{
		return (Integer) readProperty("respTransId");
	}

	public void setStorageLocCode(String storageLocCode)
	{
		writeProperty("storageLocCode", storageLocCode);
	}

	public String getStorageLocCode()
	{
		return (String) readProperty("storageLocCode");
	}

	public void setTransId(Integer transId)
	{
		writeProperty("transId", transId);
	}

	public Integer getTransId()
	{
		return (Integer) readProperty("transId");
	}

}
