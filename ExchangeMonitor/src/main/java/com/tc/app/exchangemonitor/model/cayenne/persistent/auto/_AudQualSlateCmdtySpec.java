package com.tc.app.exchangemonitor.model.cayenne.persistent.auto;

import java.math.BigDecimal;

import org.apache.cayenne.CayenneDataObject;
import org.apache.cayenne.exp.Property;

/**
 * Class _AudQualSlateCmdtySpec was generated by Cayenne.
 * It is probably a good idea to avoid changing this class manually,
 * since it may be overwritten next time code is regenerated.
 * If you need to make any customizations, please use subclass.
 */
public abstract class _AudQualSlateCmdtySpec extends CayenneDataObject
{

	private static final long serialVersionUID = 1L;

	public static final Property<String> CMDTY_CODE = new Property<String>("cmdtyCode");
	public static final Property<BigDecimal> CMDTY_SPEC_MAX_VAL = new Property<BigDecimal>("cmdtySpecMaxVal");
	public static final Property<BigDecimal> CMDTY_SPEC_MIN_VAL = new Property<BigDecimal>("cmdtySpecMinVal");
	public static final Property<BigDecimal> CMDTY_SPEC_TYPICAL_VAL = new Property<BigDecimal>("cmdtySpecTypicalVal");
	public static final Property<Boolean> MANDATORY_IND = new Property<Boolean>("mandatoryInd");
	public static final Property<Integer> OID = new Property<Integer>("oid");
	public static final Property<Integer> QUALITY_SLATE_ID = new Property<Integer>("qualitySlateId");
	public static final Property<Integer> RESP_TRANS_ID = new Property<Integer>("respTransId");
	public static final Property<String> SPEC_CODE = new Property<String>("specCode");
	public static final Property<Integer> TRANS_ID = new Property<Integer>("transId");
	public static final Property<String> TYPICAL_STRING_VALUE = new Property<String>("typicalStringValue");

	public void setCmdtyCode(String cmdtyCode)
	{
		writeProperty("cmdtyCode", cmdtyCode);
	}

	public String getCmdtyCode()
	{
		return (String) readProperty("cmdtyCode");
	}

	public void setCmdtySpecMaxVal(BigDecimal cmdtySpecMaxVal)
	{
		writeProperty("cmdtySpecMaxVal", cmdtySpecMaxVal);
	}

	public BigDecimal getCmdtySpecMaxVal()
	{
		return (BigDecimal) readProperty("cmdtySpecMaxVal");
	}

	public void setCmdtySpecMinVal(BigDecimal cmdtySpecMinVal)
	{
		writeProperty("cmdtySpecMinVal", cmdtySpecMinVal);
	}

	public BigDecimal getCmdtySpecMinVal()
	{
		return (BigDecimal) readProperty("cmdtySpecMinVal");
	}

	public void setCmdtySpecTypicalVal(BigDecimal cmdtySpecTypicalVal)
	{
		writeProperty("cmdtySpecTypicalVal", cmdtySpecTypicalVal);
	}

	public BigDecimal getCmdtySpecTypicalVal()
	{
		return (BigDecimal) readProperty("cmdtySpecTypicalVal");
	}

	public void setMandatoryInd(Boolean mandatoryInd)
	{
		writeProperty("mandatoryInd", mandatoryInd);
	}

	public Boolean getMandatoryInd()
	{
		return (Boolean) readProperty("mandatoryInd");
	}

	public void setOid(Integer oid)
	{
		writeProperty("oid", oid);
	}

	public Integer getOid()
	{
		return (Integer) readProperty("oid");
	}

	public void setQualitySlateId(Integer qualitySlateId)
	{
		writeProperty("qualitySlateId", qualitySlateId);
	}

	public Integer getQualitySlateId()
	{
		return (Integer) readProperty("qualitySlateId");
	}

	public void setRespTransId(Integer respTransId)
	{
		writeProperty("respTransId", respTransId);
	}

	public Integer getRespTransId()
	{
		return (Integer) readProperty("respTransId");
	}

	public void setSpecCode(String specCode)
	{
		writeProperty("specCode", specCode);
	}

	public String getSpecCode()
	{
		return (String) readProperty("specCode");
	}

	public void setTransId(Integer transId)
	{
		writeProperty("transId", transId);
	}

	public Integer getTransId()
	{
		return (Integer) readProperty("transId");
	}

	public void setTypicalStringValue(String typicalStringValue)
	{
		writeProperty("typicalStringValue", typicalStringValue);
	}

	public String getTypicalStringValue()
	{
		return (String) readProperty("typicalStringValue");
	}

}