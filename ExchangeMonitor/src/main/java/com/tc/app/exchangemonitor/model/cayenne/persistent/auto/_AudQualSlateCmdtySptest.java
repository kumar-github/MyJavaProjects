package com.tc.app.exchangemonitor.model.cayenne.persistent.auto;

import org.apache.cayenne.CayenneDataObject;
import org.apache.cayenne.exp.Property;

/**
 * Class _AudQualSlateCmdtySptest was generated by Cayenne.
 * It is probably a good idea to avoid changing this class manually,
 * since it may be overwritten next time code is regenerated.
 * If you need to make any customizations, please use subclass.
 */
public abstract class _AudQualSlateCmdtySptest extends CayenneDataObject
{

	private static final long serialVersionUID = 1L;

	public static final Property<String> CMDTY_CODE = new Property<String>("cmdtyCode");
	public static final Property<Boolean> IS_DEFAULT_TEST = new Property<Boolean>("isDefaultTest");
	public static final Property<Integer> OID = new Property<Integer>("oid");
	public static final Property<Integer> QUALITY_SLATE_ID = new Property<Integer>("qualitySlateId");
	public static final Property<Integer> RESP_TRANS_ID = new Property<Integer>("respTransId");
	public static final Property<String> SPEC_CODE = new Property<String>("specCode");
	public static final Property<String> SPEC_TEST_CODE = new Property<String>("specTestCode");
	public static final Property<Integer> TRANS_ID = new Property<Integer>("transId");

	public void setCmdtyCode(String cmdtyCode)
	{
		writeProperty("cmdtyCode", cmdtyCode);
	}

	public String getCmdtyCode()
	{
		return (String) readProperty("cmdtyCode");
	}

	public void setIsDefaultTest(Boolean isDefaultTest)
	{
		writeProperty("isDefaultTest", isDefaultTest);
	}

	public Boolean getIsDefaultTest()
	{
		return (Boolean) readProperty("isDefaultTest");
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

	public void setSpecTestCode(String specTestCode)
	{
		writeProperty("specTestCode", specTestCode);
	}

	public String getSpecTestCode()
	{
		return (String) readProperty("specTestCode");
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
