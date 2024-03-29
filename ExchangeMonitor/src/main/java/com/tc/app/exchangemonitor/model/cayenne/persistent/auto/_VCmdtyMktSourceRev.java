package com.tc.app.exchangemonitor.model.cayenne.persistent.auto;

import org.apache.cayenne.CayenneDataObject;
import org.apache.cayenne.exp.Property;

/**
 * Class _VCmdtyMktSourceRev was generated by Cayenne.
 * It is probably a good idea to avoid changing this class manually,
 * since it may be overwritten next time code is regenerated.
 * If you need to make any customizations, please use subclass.
 */
public abstract class _VCmdtyMktSourceRev extends CayenneDataObject
{

	private static final long serialVersionUID = 1L;

	public static final Property<Integer> ASOF_TRANS_ID = new Property<Integer>("asofTransId");
	public static final Property<String> CALENDAR_CODE = new Property<String>("calendarCode");
	public static final Property<Integer> COMMKT_KEY = new Property<Integer>("commktKey");
	public static final Property<String> DFLT_ALIAS_SOURCE_CODE = new Property<String>("dfltAliasSourceCode");
	public static final Property<String> FINANCIAL_BORROW_USE_IND = new Property<String>("financialBorrowUseInd");
	public static final Property<String> FINANCIAL_LEND_USE_IND = new Property<String>("financialLendUseInd");
	public static final Property<String> OPTION_EVAL_USE_IND = new Property<String>("optionEvalUseInd");
	public static final Property<String> PRICE_SOURCE_CODE = new Property<String>("priceSourceCode");
	public static final Property<Short> QUOTE_PRICE_PRECISION = new Property<Short>("quotePricePrecision");
	public static final Property<Integer> RESP_TRANS_ID = new Property<Integer>("respTransId");
	public static final Property<Integer> TRANS_ID = new Property<Integer>("transId");
	public static final Property<String> TVM_USE_IND = new Property<String>("tvmUseInd");

	public void setAsofTransId(Integer asofTransId)
	{
		writeProperty("asofTransId", asofTransId);
	}

	public Integer getAsofTransId()
	{
		return (Integer) readProperty("asofTransId");
	}

	public void setCalendarCode(String calendarCode)
	{
		writeProperty("calendarCode", calendarCode);
	}

	public String getCalendarCode()
	{
		return (String) readProperty("calendarCode");
	}

	public void setCommktKey(Integer commktKey)
	{
		writeProperty("commktKey", commktKey);
	}

	public Integer getCommktKey()
	{
		return (Integer) readProperty("commktKey");
	}

	public void setDfltAliasSourceCode(String dfltAliasSourceCode)
	{
		writeProperty("dfltAliasSourceCode", dfltAliasSourceCode);
	}

	public String getDfltAliasSourceCode()
	{
		return (String) readProperty("dfltAliasSourceCode");
	}

	public void setFinancialBorrowUseInd(String financialBorrowUseInd)
	{
		writeProperty("financialBorrowUseInd", financialBorrowUseInd);
	}

	public String getFinancialBorrowUseInd()
	{
		return (String) readProperty("financialBorrowUseInd");
	}

	public void setFinancialLendUseInd(String financialLendUseInd)
	{
		writeProperty("financialLendUseInd", financialLendUseInd);
	}

	public String getFinancialLendUseInd()
	{
		return (String) readProperty("financialLendUseInd");
	}

	public void setOptionEvalUseInd(String optionEvalUseInd)
	{
		writeProperty("optionEvalUseInd", optionEvalUseInd);
	}

	public String getOptionEvalUseInd()
	{
		return (String) readProperty("optionEvalUseInd");
	}

	public void setPriceSourceCode(String priceSourceCode)
	{
		writeProperty("priceSourceCode", priceSourceCode);
	}

	public String getPriceSourceCode()
	{
		return (String) readProperty("priceSourceCode");
	}

	public void setQuotePricePrecision(Short quotePricePrecision)
	{
		writeProperty("quotePricePrecision", quotePricePrecision);
	}

	public Short getQuotePricePrecision()
	{
		return (Short) readProperty("quotePricePrecision");
	}

	public void setRespTransId(Integer respTransId)
	{
		writeProperty("respTransId", respTransId);
	}

	public Integer getRespTransId()
	{
		return (Integer) readProperty("respTransId");
	}

	public void setTransId(Integer transId)
	{
		writeProperty("transId", transId);
	}

	public Integer getTransId()
	{
		return (Integer) readProperty("transId");
	}

	public void setTvmUseInd(String tvmUseInd)
	{
		writeProperty("tvmUseInd", tvmUseInd);
	}

	public String getTvmUseInd()
	{
		return (String) readProperty("tvmUseInd");
	}

}
