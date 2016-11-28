package com.tc.app.exchangemonitor.model.cayenne.persistent.auto;

import java.math.BigDecimal;

import org.apache.cayenne.CayenneDataObject;
import org.apache.cayenne.exp.Property;

import com.tc.app.exchangemonitor.model.cayenne.persistent.Commodity;

/**
 * Class _LocationCostFigures was generated by Cayenne.
 * It is probably a good idea to avoid changing this class manually,
 * since it may be overwritten next time code is regenerated.
 * If you need to make any customizations, please use subclass.
 */
public abstract class _LocationCostFigures extends CayenneDataObject
{

	private static final long serialVersionUID = 1L;

	public static final String FLDCHR_COST_TYPE_CODE_PK_COLUMN = "fldchrCostTypeCode";
	public static final String FLDCHR_LOCT_KEY_PK_COLUMN = "fldchrLoctKey";

	public static final Property<String> FLDCHR_LOAD_AMT_UMCODE = new Property<String>("fldchrLoadAmtUMCode");
	public static final Property<String> FLDCHR_REC_ID = new Property<String>("fldchrRecId");
	public static final Property<String> FLDCHR_UNLD_AMT_UMCODE = new Property<String>("fldchrUnldAmtUMCode");
	public static final Property<BigDecimal> FLDDEC_LOAD_AMT = new Property<BigDecimal>("flddecLoadAmt");
	public static final Property<BigDecimal> FLDDEC_UNLD_AMT = new Property<BigDecimal>("flddecUnldAmt");
	public static final Property<Integer> TRANS_ID = new Property<Integer>("transId");
	public static final Property<Commodity> COMMODITY = new Property<Commodity>("commodity");

	public void setFldchrLoadAmtUMCode(String fldchrLoadAmtUMCode)
	{
		writeProperty("fldchrLoadAmtUMCode", fldchrLoadAmtUMCode);
	}

	public String getFldchrLoadAmtUMCode()
	{
		return (String) readProperty("fldchrLoadAmtUMCode");
	}

	public void setFldchrRecId(String fldchrRecId)
	{
		writeProperty("fldchrRecId", fldchrRecId);
	}

	public String getFldchrRecId()
	{
		return (String) readProperty("fldchrRecId");
	}

	public void setFldchrUnldAmtUMCode(String fldchrUnldAmtUMCode)
	{
		writeProperty("fldchrUnldAmtUMCode", fldchrUnldAmtUMCode);
	}

	public String getFldchrUnldAmtUMCode()
	{
		return (String) readProperty("fldchrUnldAmtUMCode");
	}

	public void setFlddecLoadAmt(BigDecimal flddecLoadAmt)
	{
		writeProperty("flddecLoadAmt", flddecLoadAmt);
	}

	public BigDecimal getFlddecLoadAmt()
	{
		return (BigDecimal) readProperty("flddecLoadAmt");
	}

	public void setFlddecUnldAmt(BigDecimal flddecUnldAmt)
	{
		writeProperty("flddecUnldAmt", flddecUnldAmt);
	}

	public BigDecimal getFlddecUnldAmt()
	{
		return (BigDecimal) readProperty("flddecUnldAmt");
	}

	public void setTransId(Integer transId)
	{
		writeProperty("transId", transId);
	}

	public Integer getTransId()
	{
		return (Integer) readProperty("transId");
	}

	public void setCommodity(Commodity commodity)
	{
		setToOneTarget("commodity", commodity, true);
	}

	public Commodity getCommodity()
	{
		return (Commodity) readProperty("commodity");
	}

}