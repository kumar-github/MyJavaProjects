package com.tc.app.exchangemonitor.model.cayenne.persistent.auto;

import org.apache.cayenne.CayenneDataObject;
import org.apache.cayenne.exp.Property;

/**
 * Class _VCubeCmdtyMktDetail was generated by Cayenne.
 * It is probably a good idea to avoid changing this class manually,
 * since it may be overwritten next time code is regenerated.
 * If you need to make any customizations, please use subclass.
 */
public abstract class _VCubeCmdtyMktDetail extends CayenneDataObject
{

	private static final long serialVersionUID = 1L;

	public static final Property<String> CMDTY_CATEGORY_CODE = new Property<String>("cmdtyCategoryCode");
	public static final Property<String> CMDTY_CODE = new Property<String>("cmdtyCode");
	public static final Property<String> CMDTY_FULL_NAME = new Property<String>("cmdtyFullName");
	public static final Property<String> CMDTY_SHORT_NAME = new Property<String>("cmdtyShortName");
	public static final Property<String> CMDTY_STATUS = new Property<String>("cmdtyStatus");
	public static final Property<String> CMDTY_TRADEABLE_IND = new Property<String>("cmdtyTradeableInd");
	public static final Property<String> CMDTY_TYPE = new Property<String>("cmdtyType");
	public static final Property<String> CMDTY_TYPE_CODE = new Property<String>("cmdtyTypeCode");
	public static final Property<String> CMDTY_TYPE_DESC = new Property<String>("cmdtyTypeDesc");
	public static final Property<String> COMMKT_FUT_ATTR_STATUS = new Property<String>("commktFutAttrStatus");
	public static final Property<Integer> COMMKT_KEY = new Property<Integer>("commktKey");
	public static final Property<Double> COMMKT_LOT_SIZE = new Property<Double>("commktLotSize");
	public static final Property<String> COMMKT_LOT_UOM_CODE = new Property<String>("commktLotUomCode");
	public static final Property<String> COMMKT_NAME = new Property<String>("commktName");
	public static final Property<String> COMMKT_PHY_ATTR_STATUS = new Property<String>("commktPhyAttrStatus");
	public static final Property<String> COMMKT_PRICE_UOM_CODE = new Property<String>("commktPriceUomCode");
	public static final Property<String> COMMKT_QTY_UOM_CODE = new Property<String>("commktQtyUomCode");
	public static final Property<String> MKT_CODE = new Property<String>("mktCode");
	public static final Property<String> MKT_FULL_NAME = new Property<String>("mktFullName");
	public static final Property<String> MKT_SHORT_NAME = new Property<String>("mktShortName");
	public static final Property<String> MKT_STATUS = new Property<String>("mktStatus");
	public static final Property<String> MTM_PRICE_SOURCE_CODE = new Property<String>("mtmPriceSourceCode");
	public static final Property<String> POS_CMDTY_GROUP_CODE = new Property<String>("posCmdtyGroupCode");
	public static final Property<String> POS_CMDTY_GROUP_NAME = new Property<String>("posCmdtyGroupName");
	public static final Property<String> PRIM_UOM_CODE = new Property<String>("primUomCode");
	public static final Property<String> SEC_PRICE_SOURCE_CODE = new Property<String>("secPriceSourceCode");
	public static final Property<String> SEC_UOM_CODE = new Property<String>("secUomCode");
	public static final Property<Integer> TRANS_ID = new Property<Integer>("transId");

	public void setCmdtyCategoryCode(String cmdtyCategoryCode)
	{
		writeProperty("cmdtyCategoryCode", cmdtyCategoryCode);
	}

	public String getCmdtyCategoryCode()
	{
		return (String) readProperty("cmdtyCategoryCode");
	}

	public void setCmdtyCode(String cmdtyCode)
	{
		writeProperty("cmdtyCode", cmdtyCode);
	}

	public String getCmdtyCode()
	{
		return (String) readProperty("cmdtyCode");
	}

	public void setCmdtyFullName(String cmdtyFullName)
	{
		writeProperty("cmdtyFullName", cmdtyFullName);
	}

	public String getCmdtyFullName()
	{
		return (String) readProperty("cmdtyFullName");
	}

	public void setCmdtyShortName(String cmdtyShortName)
	{
		writeProperty("cmdtyShortName", cmdtyShortName);
	}

	public String getCmdtyShortName()
	{
		return (String) readProperty("cmdtyShortName");
	}

	public void setCmdtyStatus(String cmdtyStatus)
	{
		writeProperty("cmdtyStatus", cmdtyStatus);
	}

	public String getCmdtyStatus()
	{
		return (String) readProperty("cmdtyStatus");
	}

	public void setCmdtyTradeableInd(String cmdtyTradeableInd)
	{
		writeProperty("cmdtyTradeableInd", cmdtyTradeableInd);
	}

	public String getCmdtyTradeableInd()
	{
		return (String) readProperty("cmdtyTradeableInd");
	}

	public void setCmdtyType(String cmdtyType)
	{
		writeProperty("cmdtyType", cmdtyType);
	}

	public String getCmdtyType()
	{
		return (String) readProperty("cmdtyType");
	}

	public void setCmdtyTypeCode(String cmdtyTypeCode)
	{
		writeProperty("cmdtyTypeCode", cmdtyTypeCode);
	}

	public String getCmdtyTypeCode()
	{
		return (String) readProperty("cmdtyTypeCode");
	}

	public void setCmdtyTypeDesc(String cmdtyTypeDesc)
	{
		writeProperty("cmdtyTypeDesc", cmdtyTypeDesc);
	}

	public String getCmdtyTypeDesc()
	{
		return (String) readProperty("cmdtyTypeDesc");
	}

	public void setCommktFutAttrStatus(String commktFutAttrStatus)
	{
		writeProperty("commktFutAttrStatus", commktFutAttrStatus);
	}

	public String getCommktFutAttrStatus()
	{
		return (String) readProperty("commktFutAttrStatus");
	}

	public void setCommktKey(Integer commktKey)
	{
		writeProperty("commktKey", commktKey);
	}

	public Integer getCommktKey()
	{
		return (Integer) readProperty("commktKey");
	}

	public void setCommktLotSize(Double commktLotSize)
	{
		writeProperty("commktLotSize", commktLotSize);
	}

	public Double getCommktLotSize()
	{
		return (Double) readProperty("commktLotSize");
	}

	public void setCommktLotUomCode(String commktLotUomCode)
	{
		writeProperty("commktLotUomCode", commktLotUomCode);
	}

	public String getCommktLotUomCode()
	{
		return (String) readProperty("commktLotUomCode");
	}

	public void setCommktName(String commktName)
	{
		writeProperty("commktName", commktName);
	}

	public String getCommktName()
	{
		return (String) readProperty("commktName");
	}

	public void setCommktPhyAttrStatus(String commktPhyAttrStatus)
	{
		writeProperty("commktPhyAttrStatus", commktPhyAttrStatus);
	}

	public String getCommktPhyAttrStatus()
	{
		return (String) readProperty("commktPhyAttrStatus");
	}

	public void setCommktPriceUomCode(String commktPriceUomCode)
	{
		writeProperty("commktPriceUomCode", commktPriceUomCode);
	}

	public String getCommktPriceUomCode()
	{
		return (String) readProperty("commktPriceUomCode");
	}

	public void setCommktQtyUomCode(String commktQtyUomCode)
	{
		writeProperty("commktQtyUomCode", commktQtyUomCode);
	}

	public String getCommktQtyUomCode()
	{
		return (String) readProperty("commktQtyUomCode");
	}

	public void setMktCode(String mktCode)
	{
		writeProperty("mktCode", mktCode);
	}

	public String getMktCode()
	{
		return (String) readProperty("mktCode");
	}

	public void setMktFullName(String mktFullName)
	{
		writeProperty("mktFullName", mktFullName);
	}

	public String getMktFullName()
	{
		return (String) readProperty("mktFullName");
	}

	public void setMktShortName(String mktShortName)
	{
		writeProperty("mktShortName", mktShortName);
	}

	public String getMktShortName()
	{
		return (String) readProperty("mktShortName");
	}

	public void setMktStatus(String mktStatus)
	{
		writeProperty("mktStatus", mktStatus);
	}

	public String getMktStatus()
	{
		return (String) readProperty("mktStatus");
	}

	public void setMtmPriceSourceCode(String mtmPriceSourceCode)
	{
		writeProperty("mtmPriceSourceCode", mtmPriceSourceCode);
	}

	public String getMtmPriceSourceCode()
	{
		return (String) readProperty("mtmPriceSourceCode");
	}

	public void setPosCmdtyGroupCode(String posCmdtyGroupCode)
	{
		writeProperty("posCmdtyGroupCode", posCmdtyGroupCode);
	}

	public String getPosCmdtyGroupCode()
	{
		return (String) readProperty("posCmdtyGroupCode");
	}

	public void setPosCmdtyGroupName(String posCmdtyGroupName)
	{
		writeProperty("posCmdtyGroupName", posCmdtyGroupName);
	}

	public String getPosCmdtyGroupName()
	{
		return (String) readProperty("posCmdtyGroupName");
	}

	public void setPrimUomCode(String primUomCode)
	{
		writeProperty("primUomCode", primUomCode);
	}

	public String getPrimUomCode()
	{
		return (String) readProperty("primUomCode");
	}

	public void setSecPriceSourceCode(String secPriceSourceCode)
	{
		writeProperty("secPriceSourceCode", secPriceSourceCode);
	}

	public String getSecPriceSourceCode()
	{
		return (String) readProperty("secPriceSourceCode");
	}

	public void setSecUomCode(String secUomCode)
	{
		writeProperty("secUomCode", secUomCode);
	}

	public String getSecUomCode()
	{
		return (String) readProperty("secUomCode");
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