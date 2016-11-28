package com.tc.app.exchangemonitor.model.cayenne.persistent.auto;

import java.util.Date;
import java.util.List;

import org.apache.cayenne.CayenneDataObject;
import org.apache.cayenne.exp.Property;

import com.tc.app.exchangemonitor.model.cayenne.persistent.LocKstLoc;

/**
 * Class _SrceLoc was generated by Cayenne.
 * It is probably a good idea to avoid changing this class manually,
 * since it may be overwritten next time code is regenerated.
 * If you need to make any customizations, please use subclass.
 */
public abstract class _SrceLoc extends CayenneDataObject
{

	private static final long serialVersionUID = 1L;

	public static final String SRCE_LOC_ID_PK_COLUMN = "srce_loc_id";

	public static final Property<Date> CRE_TS = new Property<Date>("creTs");
	public static final Property<String> EXTN_SYS_CD = new Property<String>("extnSysCd");
	public static final Property<Date> MOD_TS = new Property<Date>("modTs");
	public static final Property<String> MOD_USER_CD = new Property<String>("modUserCd");
	public static final Property<Boolean> SRCE_ACTV_FLG = new Property<Boolean>("srceActvFlg");
	public static final Property<String> SRCE_LOC_ABBR = new Property<String>("srceLocAbbr");
	public static final Property<String> SRCE_LOC_CD = new Property<String>("srceLocCd");
	public static final Property<String> SRCE_LOC_NM = new Property<String>("srceLocNm");
	public static final Property<String> SRCE_ST_ABBR = new Property<String>("srceStAbbr");
	public static final Property<List<LocKstLoc>> LOC_KST_LOCS = new Property<List<LocKstLoc>>("locKstLocs");

	public void setCreTs(Date creTs)
	{
		writeProperty("creTs", creTs);
	}

	public Date getCreTs()
	{
		return (Date) readProperty("creTs");
	}

	public void setExtnSysCd(String extnSysCd)
	{
		writeProperty("extnSysCd", extnSysCd);
	}

	public String getExtnSysCd()
	{
		return (String) readProperty("extnSysCd");
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

	public void setSrceActvFlg(Boolean srceActvFlg)
	{
		writeProperty("srceActvFlg", srceActvFlg);
	}

	public Boolean getSrceActvFlg()
	{
		return (Boolean) readProperty("srceActvFlg");
	}

	public void setSrceLocAbbr(String srceLocAbbr)
	{
		writeProperty("srceLocAbbr", srceLocAbbr);
	}

	public String getSrceLocAbbr()
	{
		return (String) readProperty("srceLocAbbr");
	}

	public void setSrceLocCd(String srceLocCd)
	{
		writeProperty("srceLocCd", srceLocCd);
	}

	public String getSrceLocCd()
	{
		return (String) readProperty("srceLocCd");
	}

	public void setSrceLocNm(String srceLocNm)
	{
		writeProperty("srceLocNm", srceLocNm);
	}

	public String getSrceLocNm()
	{
		return (String) readProperty("srceLocNm");
	}

	public void setSrceStAbbr(String srceStAbbr)
	{
		writeProperty("srceStAbbr", srceStAbbr);
	}

	public String getSrceStAbbr()
	{
		return (String) readProperty("srceStAbbr");
	}

	public void addToLocKstLocs(LocKstLoc obj)
	{
		addToManyTarget("locKstLocs", obj, true);
	}

	public void removeFromLocKstLocs(LocKstLoc obj)
	{
		removeToManyTarget("locKstLocs", obj, true);
	}

	@SuppressWarnings("unchecked")
	public List<LocKstLoc> getLocKstLocs()
	{
		return (List<LocKstLoc>) readProperty("locKstLocs");
	}

}