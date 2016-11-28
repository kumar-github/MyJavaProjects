package com.tc.app.exchangemonitor.model.cayenne.persistent.auto;

import java.util.Date;

import org.apache.cayenne.CayenneDataObject;
import org.apache.cayenne.exp.Property;

/**
 * Class _DocGenTradeAudit was generated by Cayenne.
 * It is probably a good idea to avoid changing this class manually,
 * since it may be overwritten next time code is regenerated.
 * If you need to make any customizations, please use subclass.
 */
public abstract class _DocGenTradeAudit extends CayenneDataObject
{

	private static final long serialVersionUID = 1L;

	public static final String CHANGED_COLUMN_PK_COLUMN = "changed_column";
	public static final String TABLE_KEY_PK_COLUMN = "table_key";
	public static final String TABLE_NAME_PK_COLUMN = "table_name";
	public static final String TRADE_NUM_PK_COLUMN = "trade_num";
	public static final String TRANS_ID_PK_COLUMN = "trans_id";

	public static final Property<String> AFTER_VALUE = new Property<String>("afterValue");
	public static final Property<String> BEFORE_VALUE = new Property<String>("beforeValue");
	public static final Property<Boolean> IS_NEW_ROW = new Property<Boolean>("isNewRow");
	public static final Property<Integer> MELE_NUM = new Property<Integer>("meleNum");
	public static final Property<String> ORDER_TYPE_CODE = new Property<String>("orderTypeCode");
	public static final Property<Date> TRAN_DATE = new Property<Date>("tranDate");

	public void setAfterValue(String afterValue)
	{
		writeProperty("afterValue", afterValue);
	}

	public String getAfterValue()
	{
		return (String) readProperty("afterValue");
	}

	public void setBeforeValue(String beforeValue)
	{
		writeProperty("beforeValue", beforeValue);
	}

	public String getBeforeValue()
	{
		return (String) readProperty("beforeValue");
	}

	public void setIsNewRow(Boolean isNewRow)
	{
		writeProperty("isNewRow", isNewRow);
	}

	public Boolean getIsNewRow()
	{
		return (Boolean) readProperty("isNewRow");
	}

	public void setMeleNum(Integer meleNum)
	{
		writeProperty("meleNum", meleNum);
	}

	public Integer getMeleNum()
	{
		return (Integer) readProperty("meleNum");
	}

	public void setOrderTypeCode(String orderTypeCode)
	{
		writeProperty("orderTypeCode", orderTypeCode);
	}

	public String getOrderTypeCode()
	{
		return (String) readProperty("orderTypeCode");
	}

	public void setTranDate(Date tranDate)
	{
		writeProperty("tranDate", tranDate);
	}

	public Date getTranDate()
	{
		return (Date) readProperty("tranDate");
	}

}