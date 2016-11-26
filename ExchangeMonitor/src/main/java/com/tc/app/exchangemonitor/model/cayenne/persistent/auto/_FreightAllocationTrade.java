package com.tc.app.exchangemonitor.model.cayenne.persistent.auto;

import org.apache.cayenne.CayenneDataObject;
import org.apache.cayenne.exp.Property;

/**
 * Class _FreightAllocationTrade was generated by Cayenne.
 * It is probably a good idea to avoid changing this class manually,
 * since it may be overwritten next time code is regenerated.
 * If you need to make any customizations, please use subclass.
 */
public abstract class _FreightAllocationTrade extends CayenneDataObject
{

	private static final long serialVersionUID = 1L;

	public static final String OID_PK_COLUMN = "oid";

	public static final Property<Integer> ALLOCATION_ID = new Property<Integer>("allocationId");
	public static final Property<Integer> CARGO_KEY = new Property<Integer>("cargoKey");
	public static final Property<String> TC_CONTRACT_KEY = new Property<String>("tcContractKey");
	public static final Property<String> TRADE_TYPE = new Property<String>("tradeType");

	public void setAllocationId(Integer allocationId)
	{
		writeProperty("allocationId", allocationId);
	}

	public Integer getAllocationId()
	{
		return (Integer) readProperty("allocationId");
	}

	public void setCargoKey(Integer cargoKey)
	{
		writeProperty("cargoKey", cargoKey);
	}

	public Integer getCargoKey()
	{
		return (Integer) readProperty("cargoKey");
	}

	public void setTcContractKey(String tcContractKey)
	{
		writeProperty("tcContractKey", tcContractKey);
	}

	public String getTcContractKey()
	{
		return (String) readProperty("tcContractKey");
	}

	public void setTradeType(String tradeType)
	{
		writeProperty("tradeType", tradeType);
	}

	public String getTradeType()
	{
		return (String) readProperty("tradeType");
	}

}
