package com.tc.app.exchangemonitor.model.cayenne.persistent.auto;

import org.apache.cayenne.CayenneDataObject;
import org.apache.cayenne.exp.Property;

/**
 * Class _VieWBOPCASumedGulfPipe was generated by Cayenne.
 * It is probably a good idea to avoid changing this class manually,
 * since it may be overwritten next time code is regenerated.
 * If you need to make any customizations, please use subclass.
 */
public abstract class _VieWBOPCASumedGulfPipe extends CayenneDataObject
{

	private static final long serialVersionUID = 1L;

	public static final Property<String> FLDCHR_OP_DTL_KEY = new Property<String>("fldchrOpDtlKey");
	public static final Property<String> FLDCHR_PARENT_OP_DTL_KEY = new Property<String>("fldchrParentOpDtlKey");

	public void setFldchrOpDtlKey(String fldchrOpDtlKey)
	{
		writeProperty("fldchrOpDtlKey", fldchrOpDtlKey);
	}

	public String getFldchrOpDtlKey()
	{
		return (String) readProperty("fldchrOpDtlKey");
	}

	public void setFldchrParentOpDtlKey(String fldchrParentOpDtlKey)
	{
		writeProperty("fldchrParentOpDtlKey", fldchrParentOpDtlKey);
	}

	public String getFldchrParentOpDtlKey()
	{
		return (String) readProperty("fldchrParentOpDtlKey");
	}

}
