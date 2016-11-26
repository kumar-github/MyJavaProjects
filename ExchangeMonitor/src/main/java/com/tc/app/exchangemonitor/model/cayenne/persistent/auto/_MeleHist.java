package com.tc.app.exchangemonitor.model.cayenne.persistent.auto;

import java.util.Date;

import org.apache.cayenne.CayenneDataObject;
import org.apache.cayenne.exp.Property;

import com.tc.app.exchangemonitor.model.cayenne.persistent.Mele;

/**
 * Class _MeleHist was generated by Cayenne.
 * It is probably a good idea to avoid changing this class manually,
 * since it may be overwritten next time code is regenerated.
 * If you need to make any customizations, please use subclass.
 */
public abstract class _MeleHist extends CayenneDataObject
{

	private static final long serialVersionUID = 1L;

	public static final String EFF_DT_PK_COLUMN = "eff_dt";
	public static final String MELE_NO_PK_COLUMN = "mele_no";

	public static final Property<Date> EXPR_DT = new Property<Date>("exprDt");
	public static final Property<Integer> LE_ID = new Property<Integer>("leId");
	public static final Property<Date> MOD_TS = new Property<Date>("modTs");
	public static final Property<String> MOD_USER_CD = new Property<String>("modUserCd");
	public static final Property<Integer> PROFIT_AREA_ID = new Property<Integer>("profitAreaId");
	public static final Property<Mele> MELE = new Property<Mele>("mele");

	public void setExprDt(Date exprDt)
	{
		writeProperty("exprDt", exprDt);
	}

	public Date getExprDt()
	{
		return (Date) readProperty("exprDt");
	}

	public void setLeId(Integer leId)
	{
		writeProperty("leId", leId);
	}

	public Integer getLeId()
	{
		return (Integer) readProperty("leId");
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

	public void setProfitAreaId(Integer profitAreaId)
	{
		writeProperty("profitAreaId", profitAreaId);
	}

	public Integer getProfitAreaId()
	{
		return (Integer) readProperty("profitAreaId");
	}

	public void setMele(Mele mele)
	{
		setToOneTarget("mele", mele, true);
	}

	public Mele getMele()
	{
		return (Mele) readProperty("mele");
	}

}
