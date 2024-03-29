package com.tc.app.exchangemonitor.model.cayenne.persistent.auto;

import java.util.Date;

import org.apache.cayenne.CayenneDataObject;
import org.apache.cayenne.exp.Property;

/**
 * Class _GoverningLaw was generated by Cayenne.
 * It is probably a good idea to avoid changing this class manually,
 * since it may be overwritten next time code is regenerated.
 * If you need to make any customizations, please use subclass.
 */
public abstract class _GoverningLaw extends CayenneDataObject
{

	private static final long serialVersionUID = 1L;

	public static final Property<Integer> GOVERNING_LAW_ID = new Property<Integer>("governingLawId");
	public static final Property<String> GOVERNING_LAW_NM = new Property<String>("governingLawNm");
	public static final Property<Date> INACTV_DT = new Property<Date>("inactvDt");
	public static final Property<Date> MOD_TS = new Property<Date>("modTs");
	public static final Property<String> MOD_USER_CD = new Property<String>("modUserCd");

	public void setGoverningLawId(Integer governingLawId)
	{
		writeProperty("governingLawId", governingLawId);
	}

	public Integer getGoverningLawId()
	{
		return (Integer) readProperty("governingLawId");
	}

	public void setGoverningLawNm(String governingLawNm)
	{
		writeProperty("governingLawNm", governingLawNm);
	}

	public String getGoverningLawNm()
	{
		return (String) readProperty("governingLawNm");
	}

	public void setInactvDt(Date inactvDt)
	{
		writeProperty("inactvDt", inactvDt);
	}

	public Date getInactvDt()
	{
		return (Date) readProperty("inactvDt");
	}

	public void setModTs(Date modTs)
	{
		writeProperty("modTs", modTs);
	}

	public Date getModTs()
	{
		return (Date) readProperty("modTs");
	}

	public void setModUserCd(String modUserCd)
	{
		writeProperty("modUserCd", modUserCd);
	}

	public String getModUserCd()
	{
		return (String) readProperty("modUserCd");
	}

}
