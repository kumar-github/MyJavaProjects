package com.tc.app.exchangemonitor.model.cayenne.persistent.auto;

import org.apache.cayenne.CayenneDataObject;
import org.apache.cayenne.exp.Property;

/**
 * Class _FlMytaskTarget was generated by Cayenne.
 * It is probably a good idea to avoid changing this class manually,
 * since it may be overwritten next time code is regenerated.
 * If you need to make any customizations, please use subclass.
 */
public abstract class _FlMytaskTarget extends CayenneDataObject
{

	private static final long serialVersionUID = 1L;

	public static final String FLDINT_ID_TARGET_PK_COLUMN = "fldintIdTarget";

	public static final Property<String> FLDCHR_QUERY = new Property<String>("fldchrQuery");
	public static final Property<String> FLDCHR_WHERE = new Property<String>("fldchrWhere");
	public static final Property<Integer> FLDINT_ID_SCOPE = new Property<Integer>("fldintIdScope");
	public static final Property<String> FLDINT_NAME = new Property<String>("fldintName");

	public void setFldchrQuery(String fldchrQuery)
	{
		writeProperty("fldchrQuery", fldchrQuery);
	}

	public String getFldchrQuery()
	{
		return (String) readProperty("fldchrQuery");
	}

	public void setFldchrWhere(String fldchrWhere)
	{
		writeProperty("fldchrWhere", fldchrWhere);
	}

	public String getFldchrWhere()
	{
		return (String) readProperty("fldchrWhere");
	}

	public void setFldintIdScope(Integer fldintIdScope)
	{
		writeProperty("fldintIdScope", fldintIdScope);
	}

	public Integer getFldintIdScope()
	{
		return (Integer) readProperty("fldintIdScope");
	}

	public void setFldintName(String fldintName)
	{
		writeProperty("fldintName", fldintName);
	}

	public String getFldintName()
	{
		return (String) readProperty("fldintName");
	}

}
