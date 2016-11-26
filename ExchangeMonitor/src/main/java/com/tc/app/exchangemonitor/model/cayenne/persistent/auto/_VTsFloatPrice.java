package com.tc.app.exchangemonitor.model.cayenne.persistent.auto;

import org.apache.cayenne.CayenneDataObject;
import org.apache.cayenne.exp.Property;

/**
 * Class _VTsFloatPrice was generated by Cayenne.
 * It is probably a good idea to avoid changing this class manually,
 * since it may be overwritten next time code is regenerated.
 * If you need to make any customizations, please use subclass.
 */
public abstract class _VTsFloatPrice extends CayenneDataObject
{

	private static final long serialVersionUID = 1L;

	public static final Property<String> FLOAT_PRICE = new Property<String>("floatPrice");
	public static final Property<Integer> FORMULA_NUM = new Property<Integer>("formulaNum");

	public void setFloatPrice(String floatPrice)
	{
		writeProperty("floatPrice", floatPrice);
	}

	public String getFloatPrice()
	{
		return (String) readProperty("floatPrice");
	}

	public void setFormulaNum(Integer formulaNum)
	{
		writeProperty("formulaNum", formulaNum);
	}

	public Integer getFormulaNum()
	{
		return (Integer) readProperty("formulaNum");
	}

}
