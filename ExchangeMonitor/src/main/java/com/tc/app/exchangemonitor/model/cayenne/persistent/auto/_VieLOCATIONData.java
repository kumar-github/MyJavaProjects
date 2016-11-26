package com.tc.app.exchangemonitor.model.cayenne.persistent.auto;

import java.math.BigDecimal;

import org.apache.cayenne.CayenneDataObject;
import org.apache.cayenne.exp.Property;

/**
 * Class _VieLOCATIONData was generated by Cayenne.
 * It is probably a good idea to avoid changing this class manually,
 * since it may be overwritten next time code is regenerated.
 * If you need to make any customizations, please use subclass.
 */
public abstract class _VieLOCATIONData extends CayenneDataObject
{

	private static final long serialVersionUID = 1L;

	public static final Property<String> FLDCHR_AIRPORT_FLAG = new Property<String>("fldchrAirportFlag");
	public static final Property<String> FLDCHR_COUNTRY_CODE = new Property<String>("fldchrCountryCode");
	public static final Property<String> FLDCHR_FIXED_FUNCTIONS_FLAG = new Property<String>("fldchrFixedFunctionsFlag");
	public static final Property<String> FLDCHR_GEO_AREA_CODE = new Property<String>("fldchrGeoAreaCode");
	public static final Property<String> FLDCHR_LOCT_CODE = new Property<String>("fldchrLoctCode");
	public static final Property<String> FLDCHR_LOCT_KEY = new Property<String>("fldchrLoctKey");
	public static final Property<String> FLDCHR_PORT_FLAG = new Property<String>("fldchrPortFlag");
	public static final Property<String> FLDCHR_RAIL_TRML_FLAG = new Property<String>("fldchrRailTrmlFlag");
	public static final Property<String> FLDCHR_ROAD_TRML_FLAG = new Property<String>("fldchrRoadTrmlFlag");
	public static final Property<BigDecimal> FLDDEC_NO_OPERATION_CHARGES = new Property<BigDecimal>("flddecNoOperationCharges");
	public static final Property<Integer> FLDINT_MARITIME_AGCY_ACCT_NUM = new Property<Integer>("fldintMaritimeAgcyAcctNum");
	public static final Property<String> FLDVCH_COUNTRY_DESC = new Property<String>("fldvchCountryDesc");
	public static final Property<String> FLDVCH_GEO_AREA_DESC = new Property<String>("fldvchGeoAreaDesc");
	public static final Property<String> FLDVCH_LOCT_DESC = new Property<String>("fldvchLoctDesc");
	public static final Property<String> FLDVCH_LOCT_FULL_DESC = new Property<String>("fldvchLoctFullDesc");

	public void setFldchrAirportFlag(String fldchrAirportFlag)
	{
		writeProperty("fldchrAirportFlag", fldchrAirportFlag);
	}

	public String getFldchrAirportFlag()
	{
		return (String) readProperty("fldchrAirportFlag");
	}

	public void setFldchrCountryCode(String fldchrCountryCode)
	{
		writeProperty("fldchrCountryCode", fldchrCountryCode);
	}

	public String getFldchrCountryCode()
	{
		return (String) readProperty("fldchrCountryCode");
	}

	public void setFldchrFixedFunctionsFlag(String fldchrFixedFunctionsFlag)
	{
		writeProperty("fldchrFixedFunctionsFlag", fldchrFixedFunctionsFlag);
	}

	public String getFldchrFixedFunctionsFlag()
	{
		return (String) readProperty("fldchrFixedFunctionsFlag");
	}

	public void setFldchrGeoAreaCode(String fldchrGeoAreaCode)
	{
		writeProperty("fldchrGeoAreaCode", fldchrGeoAreaCode);
	}

	public String getFldchrGeoAreaCode()
	{
		return (String) readProperty("fldchrGeoAreaCode");
	}

	public void setFldchrLoctCode(String fldchrLoctCode)
	{
		writeProperty("fldchrLoctCode", fldchrLoctCode);
	}

	public String getFldchrLoctCode()
	{
		return (String) readProperty("fldchrLoctCode");
	}

	public void setFldchrLoctKey(String fldchrLoctKey)
	{
		writeProperty("fldchrLoctKey", fldchrLoctKey);
	}

	public String getFldchrLoctKey()
	{
		return (String) readProperty("fldchrLoctKey");
	}

	public void setFldchrPortFlag(String fldchrPortFlag)
	{
		writeProperty("fldchrPortFlag", fldchrPortFlag);
	}

	public String getFldchrPortFlag()
	{
		return (String) readProperty("fldchrPortFlag");
	}

	public void setFldchrRailTrmlFlag(String fldchrRailTrmlFlag)
	{
		writeProperty("fldchrRailTrmlFlag", fldchrRailTrmlFlag);
	}

	public String getFldchrRailTrmlFlag()
	{
		return (String) readProperty("fldchrRailTrmlFlag");
	}

	public void setFldchrRoadTrmlFlag(String fldchrRoadTrmlFlag)
	{
		writeProperty("fldchrRoadTrmlFlag", fldchrRoadTrmlFlag);
	}

	public String getFldchrRoadTrmlFlag()
	{
		return (String) readProperty("fldchrRoadTrmlFlag");
	}

	public void setFlddecNoOperationCharges(BigDecimal flddecNoOperationCharges)
	{
		writeProperty("flddecNoOperationCharges", flddecNoOperationCharges);
	}

	public BigDecimal getFlddecNoOperationCharges()
	{
		return (BigDecimal) readProperty("flddecNoOperationCharges");
	}

	public void setFldintMaritimeAgcyAcctNum(Integer fldintMaritimeAgcyAcctNum)
	{
		writeProperty("fldintMaritimeAgcyAcctNum", fldintMaritimeAgcyAcctNum);
	}

	public Integer getFldintMaritimeAgcyAcctNum()
	{
		return (Integer) readProperty("fldintMaritimeAgcyAcctNum");
	}

	public void setFldvchCountryDesc(String fldvchCountryDesc)
	{
		writeProperty("fldvchCountryDesc", fldvchCountryDesc);
	}

	public String getFldvchCountryDesc()
	{
		return (String) readProperty("fldvchCountryDesc");
	}

	public void setFldvchGeoAreaDesc(String fldvchGeoAreaDesc)
	{
		writeProperty("fldvchGeoAreaDesc", fldvchGeoAreaDesc);
	}

	public String getFldvchGeoAreaDesc()
	{
		return (String) readProperty("fldvchGeoAreaDesc");
	}

	public void setFldvchLoctDesc(String fldvchLoctDesc)
	{
		writeProperty("fldvchLoctDesc", fldvchLoctDesc);
	}

	public String getFldvchLoctDesc()
	{
		return (String) readProperty("fldvchLoctDesc");
	}

	public void setFldvchLoctFullDesc(String fldvchLoctFullDesc)
	{
		writeProperty("fldvchLoctFullDesc", fldvchLoctFullDesc);
	}

	public String getFldvchLoctFullDesc()
	{
		return (String) readProperty("fldvchLoctFullDesc");
	}

}
