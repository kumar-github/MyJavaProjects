package com.tc.app.exchangemonitor.model.cayenne.persistent.auto;

import org.apache.cayenne.CayenneDataObject;
import org.apache.cayenne.exp.Property;

/**
 * Class _FormulaCompPriceTerm was generated by Cayenne.
 * It is probably a good idea to avoid changing this class manually,
 * since it may be overwritten next time code is regenerated.
 * If you need to make any customizations, please use subclass.
 */
public abstract class _FormulaCompPriceTerm extends CayenneDataObject
{

	private static final long serialVersionUID = 1L;

	public static final String FORMULA_BODY_NUM_PK_COLUMN = "formula_body_num";
	public static final String FORMULA_COMP_NUM_PK_COLUMN = "formula_comp_num";
	public static final String FORMULA_NUM_PK_COLUMN = "formula_num";

	public static final Property<String> FCPT_PRICE_CAL_DAYS_IND = new Property<String>("fcptPriceCalDaysInd");
	public static final Property<Short> FCPT_PRICING_DAYS = new Property<Short>("fcptPricingDays");
	public static final Property<String> FCPT_REL_PRICE_CAL_DAYS_IND = new Property<String>("fcptRelPriceCalDaysInd");
	public static final Property<Short> FCPT_RELATIVE_DAYS = new Property<Short>("fcptRelativeDays");
	public static final Property<String> FCPT_ROLL_ACCUM_PRD_IND = new Property<String>("fcptRollAccumPrdInd");
	public static final Property<String> FCPT_START_END_IND = new Property<String>("fcptStartEndInd");
	public static final Property<String> QPT_TERM_CODE = new Property<String>("qptTermCode");
	public static final Property<Integer> TRANS_ID = new Property<Integer>("transId");

	public void setFcptPriceCalDaysInd(String fcptPriceCalDaysInd)
	{
		writeProperty("fcptPriceCalDaysInd", fcptPriceCalDaysInd);
	}

	public String getFcptPriceCalDaysInd()
	{
		return (String) readProperty("fcptPriceCalDaysInd");
	}

	public void setFcptPricingDays(Short fcptPricingDays)
	{
		writeProperty("fcptPricingDays", fcptPricingDays);
	}

	public Short getFcptPricingDays()
	{
		return (Short) readProperty("fcptPricingDays");
	}

	public void setFcptRelPriceCalDaysInd(String fcptRelPriceCalDaysInd)
	{
		writeProperty("fcptRelPriceCalDaysInd", fcptRelPriceCalDaysInd);
	}

	public String getFcptRelPriceCalDaysInd()
	{
		return (String) readProperty("fcptRelPriceCalDaysInd");
	}

	public void setFcptRelativeDays(Short fcptRelativeDays)
	{
		writeProperty("fcptRelativeDays", fcptRelativeDays);
	}

	public Short getFcptRelativeDays()
	{
		return (Short) readProperty("fcptRelativeDays");
	}

	public void setFcptRollAccumPrdInd(String fcptRollAccumPrdInd)
	{
		writeProperty("fcptRollAccumPrdInd", fcptRollAccumPrdInd);
	}

	public String getFcptRollAccumPrdInd()
	{
		return (String) readProperty("fcptRollAccumPrdInd");
	}

	public void setFcptStartEndInd(String fcptStartEndInd)
	{
		writeProperty("fcptStartEndInd", fcptStartEndInd);
	}

	public String getFcptStartEndInd()
	{
		return (String) readProperty("fcptStartEndInd");
	}

	public void setQptTermCode(String qptTermCode)
	{
		writeProperty("qptTermCode", qptTermCode);
	}

	public String getQptTermCode()
	{
		return (String) readProperty("qptTermCode");
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