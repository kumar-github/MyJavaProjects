package com.tc.app.exchangemonitor.model.cayenne.persistent.auto;

import org.apache.cayenne.CayenneDataObject;
import org.apache.cayenne.exp.Property;

/**
 * Class _FlObjects was generated by Cayenne.
 * It is probably a good idea to avoid changing this class manually,
 * since it may be overwritten next time code is regenerated.
 * If you need to make any customizations, please use subclass.
 */
public abstract class _FlObjects extends CayenneDataObject
{

	private static final long serialVersionUID = 1L;

	public static final String OBJ_NAME_PK_COLUMN = "ObjName";
	public static final String OBJ_TYPE_PK_COLUMN = "ObjType";

	public static final Property<String> OBJ_REF = new Property<String>("objRef");

	public void setObjRef(String objRef)
	{
		writeProperty("objRef", objRef);
	}

	public String getObjRef()
	{
		return (String) readProperty("objRef");
	}

}