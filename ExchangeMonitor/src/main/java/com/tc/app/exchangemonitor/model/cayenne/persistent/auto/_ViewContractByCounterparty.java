package com.tc.app.exchangemonitor.model.cayenne.persistent.auto;

import java.math.BigDecimal;
import java.util.Date;

import org.apache.cayenne.CayenneDataObject;
import org.apache.cayenne.exp.Property;

/**
 * Class _ViewContractByCounterparty was generated by Cayenne.
 * It is probably a good idea to avoid changing this class manually,
 * since it may be overwritten next time code is regenerated.
 * If you need to make any customizations, please use subclass.
 */
public abstract class _ViewContractByCounterparty extends CayenneDataObject
{

	private static final long serialVersionUID = 1L;

	public static final Property<Date> CHARTER_PARTY_DATE = new Property<Date>("charterPartyDate");
	public static final Property<String> COUNTER_PARTY = new Property<String>("counterParty");
	public static final Property<String> DRY_WET = new Property<String>("dry_Wet");
	public static final Property<String> END_PORT = new Property<String>("endPort");
	public static final Property<String> FLDCHR_CONTR_TYPE_FLAG = new Property<String>("fldchrContrTypeFlag");
	public static final Property<String> FLDVCH_CARGO_DESC = new Property<String>("fldvchCargoDesc");
	public static final Property<Double> FREIGHT_AMOUNT = new Property<Double>("freight_Amount");
	public static final Property<String> FREIGHT_CURRENCY = new Property<String>("freight_Currency");
	public static final Property<BigDecimal> QUANTITY = new Property<BigDecimal>("quantity");
	public static final Property<String> SPOT_OUT_KEY = new Property<String>("spotOutKey");
	public static final Property<String> START_PORT = new Property<String>("startPort");
	public static final Property<String> UOM = new Property<String>("uom");
	public static final Property<String> VESSEL_NAME = new Property<String>("vessel_Name");

	public void setCharterPartyDate(Date charterPartyDate)
	{
		writeProperty("charterPartyDate", charterPartyDate);
	}

	public Date getCharterPartyDate()
	{
		return (Date) readProperty("charterPartyDate");
	}

	public void setCounterParty(String counterParty)
	{
		writeProperty("counterParty", counterParty);
	}

	public String getCounterParty()
	{
		return (String) readProperty("counterParty");
	}

	public void setDry_Wet(String dry_Wet)
	{
		writeProperty("dry_Wet", dry_Wet);
	}

	public String getDry_Wet()
	{
		return (String) readProperty("dry_Wet");
	}

	public void setEndPort(String endPort)
	{
		writeProperty("endPort", endPort);
	}

	public String getEndPort()
	{
		return (String) readProperty("endPort");
	}

	public void setFldchrContrTypeFlag(String fldchrContrTypeFlag)
	{
		writeProperty("fldchrContrTypeFlag", fldchrContrTypeFlag);
	}

	public String getFldchrContrTypeFlag()
	{
		return (String) readProperty("fldchrContrTypeFlag");
	}

	public void setFldvchCargoDesc(String fldvchCargoDesc)
	{
		writeProperty("fldvchCargoDesc", fldvchCargoDesc);
	}

	public String getFldvchCargoDesc()
	{
		return (String) readProperty("fldvchCargoDesc");
	}

	public void setFreight_Amount(Double freight_Amount)
	{
		writeProperty("freight_Amount", freight_Amount);
	}

	public Double getFreight_Amount()
	{
		return (Double) readProperty("freight_Amount");
	}

	public void setFreight_Currency(String freight_Currency)
	{
		writeProperty("freight_Currency", freight_Currency);
	}

	public String getFreight_Currency()
	{
		return (String) readProperty("freight_Currency");
	}

	public void setQuantity(BigDecimal quantity)
	{
		writeProperty("quantity", quantity);
	}

	public BigDecimal getQuantity()
	{
		return (BigDecimal) readProperty("quantity");
	}

	public void setSpotOutKey(String spotOutKey)
	{
		writeProperty("spotOutKey", spotOutKey);
	}

	public String getSpotOutKey()
	{
		return (String) readProperty("spotOutKey");
	}

	public void setStartPort(String startPort)
	{
		writeProperty("startPort", startPort);
	}

	public String getStartPort()
	{
		return (String) readProperty("startPort");
	}

	public void setUom(String uom)
	{
		writeProperty("uom", uom);
	}

	public String getUom()
	{
		return (String) readProperty("uom");
	}

	public void setVessel_Name(String vessel_Name)
	{
		writeProperty("vessel_Name", vessel_Name);
	}

	public String getVessel_Name()
	{
		return (String) readProperty("vessel_Name");
	}

}
