package com.tc.app.exchangemonitor.model.cayenne.persistent.auto;

import java.util.List;

import org.apache.cayenne.CayenneDataObject;
import org.apache.cayenne.exp.Property;

import com.tc.app.exchangemonitor.model.cayenne.persistent.CountryByGroup;

/**
 * Class _CountryGroup was generated by Cayenne.
 * It is probably a good idea to avoid changing this class manually,
 * since it may be overwritten next time code is regenerated.
 * If you need to make any customizations, please use subclass.
 */
public abstract class _CountryGroup extends CayenneDataObject
{

	private static final long serialVersionUID = 1L;

	public static final String CODE_PK_COLUMN = "code";

	public static final Property<String> LONG_DESCRIPTION = new Property<>("longDescription");
	public static final Property<Integer> TRANS_ID = new Property<>("transId");
	public static final Property<List<CountryByGroup>> COUNTRY_BY_GROUPS = new Property<>("countryByGroups");

	public void setLongDescription(final String longDescription)
	{
		this.writeProperty("longDescription", longDescription);
	}

	public String getLongDescription()
	{
		return (String) this.readProperty("longDescription");
	}

	public void setTransId(final Integer transId)
	{
		this.writeProperty("transId", transId);
	}

	public Integer getTransId()
	{
		return (Integer) this.readProperty("transId");
	}

	public void addToCountryByGroups(final CountryByGroup obj)
	{
		this.addToManyTarget("countryByGroups", obj, true);
	}

	public void removeFromCountryByGroups(final CountryByGroup obj)
	{
		this.removeToManyTarget("countryByGroups", obj, true);
	}

	@SuppressWarnings("unchecked")
	public List<CountryByGroup> getCountryByGroups()
	{
		return (List<CountryByGroup>) this.readProperty("countryByGroups");
	}

}