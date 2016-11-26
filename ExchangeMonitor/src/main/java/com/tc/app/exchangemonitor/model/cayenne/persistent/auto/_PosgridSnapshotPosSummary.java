package com.tc.app.exchangemonitor.model.cayenne.persistent.auto;

import java.util.Date;

import org.apache.cayenne.CayenneDataObject;
import org.apache.cayenne.exp.Property;

/**
 * Class _PosgridSnapshotPosSummary was generated by Cayenne.
 * It is probably a good idea to avoid changing this class manually,
 * since it may be overwritten next time code is regenerated.
 * If you need to make any customizations, please use subclass.
 */
public abstract class _PosgridSnapshotPosSummary extends CayenneDataObject
{

	private static final long serialVersionUID = 1L;

	public static final Property<Date> ASOF_DATE = new Property<Date>("asofDate");
	public static final Property<Double> LONG_QTY = new Property<Double>("longQty");
	public static final Property<Integer> POS_NUM = new Property<Integer>("posNum");
	public static final Property<String> QTY_UOM_CODE = new Property<String>("qtyUomCode");
	public static final Property<Double> SHORT_QTY = new Property<Double>("shortQty");
	public static final Property<Integer> TRANS_ID = new Property<Integer>("transId");

	public void setAsofDate(Date asofDate)
	{
		writeProperty("asofDate", asofDate);
	}

	public Date getAsofDate()
	{
		return (Date) readProperty("asofDate");
	}

	public void setLongQty(Double longQty)
	{
		writeProperty("longQty", longQty);
	}

	public Double getLongQty()
	{
		return (Double) readProperty("longQty");
	}

	public void setPosNum(Integer posNum)
	{
		writeProperty("posNum", posNum);
	}

	public Integer getPosNum()
	{
		return (Integer) readProperty("posNum");
	}

	public void setQtyUomCode(String qtyUomCode)
	{
		writeProperty("qtyUomCode", qtyUomCode);
	}

	public String getQtyUomCode()
	{
		return (String) readProperty("qtyUomCode");
	}

	public void setShortQty(Double shortQty)
	{
		writeProperty("shortQty", shortQty);
	}

	public Double getShortQty()
	{
		return (Double) readProperty("shortQty");
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
