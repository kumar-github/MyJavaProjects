package com.tc.app.exchangemonitor.model.cayenne.persistent.auto;

import java.math.BigDecimal;
import java.util.List;

import org.apache.cayenne.CayenneDataObject;
import org.apache.cayenne.exp.Property;

import com.tc.app.exchangemonitor.model.cayenne.persistent.AccisaGroup;

/**
 * Class _Accisa was generated by Cayenne.
 * It is probably a good idea to avoid changing this class manually,
 * since it may be overwritten next time code is regenerated.
 * If you need to make any customizations, please use subclass.
 */
public abstract class _Accisa extends CayenneDataObject
{

	private static final long serialVersionUID = 1L;

	public static final String FLDCHR_ACCISA_GROUP_PK_COLUMN = "fldchrAccisaGroup";

	public static final Property<BigDecimal> FLDDEC_ACCISA_MCVALUE = new Property<>("flddecAccisaMCValue");
	public static final Property<BigDecimal> FLDDEC_ACCISA_MTVALUE = new Property<>("flddecAccisaMTValue");
	public static final Property<List<AccisaGroup>> ACCISA_GROUPS = new Property<List<AccisaGroup>>("accisaGroups");

	public void setFlddecAccisaMCValue(final BigDecimal flddecAccisaMCValue)
	{
		this.writeProperty("flddecAccisaMCValue", flddecAccisaMCValue);
	}

	public BigDecimal getFlddecAccisaMCValue()
	{
		return (BigDecimal) this.readProperty("flddecAccisaMCValue");
	}

	public void setFlddecAccisaMTValue(final BigDecimal flddecAccisaMTValue)
	{
		this.writeProperty("flddecAccisaMTValue", flddecAccisaMTValue);
	}

	public BigDecimal getFlddecAccisaMTValue()
	{
		return (BigDecimal) this.readProperty("flddecAccisaMTValue");
	}

	public void addToAccisaGroups(final AccisaGroup obj)
	{
		this.addToManyTarget("accisaGroups", obj, true);
	}

	public void removeFromAccisaGroups(final AccisaGroup obj)
	{
		this.removeToManyTarget("accisaGroups", obj, true);
	}

	@SuppressWarnings("unchecked")
	public List<AccisaGroup> getAccisaGroups()
	{
		return (List<AccisaGroup>) this.readProperty("accisaGroups");
	}

}
