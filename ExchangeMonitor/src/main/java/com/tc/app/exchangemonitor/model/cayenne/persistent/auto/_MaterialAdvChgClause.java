package com.tc.app.exchangemonitor.model.cayenne.persistent.auto;

import org.apache.cayenne.CayenneDataObject;
import org.apache.cayenne.exp.Property;

/**
 * Class _MaterialAdvChgClause was generated by Cayenne.
 * It is probably a good idea to avoid changing this class manually,
 * since it may be overwritten next time code is regenerated.
 * If you need to make any customizations, please use subclass.
 */
public abstract class _MaterialAdvChgClause extends CayenneDataObject
{

	private static final long serialVersionUID = 1L;

	public static final String MACC_NUM_PK_COLUMN = "macc_num";

	public static final Property<String> MACC_DESC = new Property<String>("maccDesc");
	public static final Property<Integer> TRANS_ID = new Property<Integer>("transId");

	public void setMaccDesc(String maccDesc)
	{
		writeProperty("maccDesc", maccDesc);
	}

	public String getMaccDesc()
	{
		return (String) readProperty("maccDesc");
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