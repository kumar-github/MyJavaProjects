package com.tc.app.exchangemonitor.model.cayenne.persistent.auto;

import org.apache.cayenne.CayenneDataObject;
import org.apache.cayenne.exp.Property;

/**
 * Class _PcgType was generated by Cayenne.
 * It is probably a good idea to avoid changing this class manually,
 * since it may be overwritten next time code is regenerated.
 * If you need to make any customizations, please use subclass.
 */
public abstract class _PcgType extends CayenneDataObject
{

	private static final long serialVersionUID = 1L;

	public static final String PCG_TYPE_CODE_PK_COLUMN = "pcg_type_code";

	public static final Property<String> PCG_TYPE_DESC = new Property<String>("pcgTypeDesc");
	public static final Property<String> PCG_TYPE_SHORT_NAME = new Property<String>("pcgTypeShortName");
	public static final Property<Integer> TRANS_ID = new Property<Integer>("transId");

	public void setPcgTypeDesc(String pcgTypeDesc)
	{
		writeProperty("pcgTypeDesc", pcgTypeDesc);
	}

	public String getPcgTypeDesc()
	{
		return (String) readProperty("pcgTypeDesc");
	}

	public void setPcgTypeShortName(String pcgTypeShortName)
	{
		writeProperty("pcgTypeShortName", pcgTypeShortName);
	}

	public String getPcgTypeShortName()
	{
		return (String) readProperty("pcgTypeShortName");
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
