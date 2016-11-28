package com.tc.app.exchangemonitor.model.cayenne.persistent.auto;

import org.apache.cayenne.CayenneDataObject;
import org.apache.cayenne.exp.Property;

import com.tc.app.exchangemonitor.model.cayenne.persistent.Application;

/**
 * Class _DocumentType was generated by Cayenne.
 * It is probably a good idea to avoid changing this class manually,
 * since it may be overwritten next time code is regenerated.
 * If you need to make any customizations, please use subclass.
 */
public abstract class _DocumentType extends CayenneDataObject
{

	private static final long serialVersionUID = 1L;

	public static final String DOC_TYPE_CODE_PK_COLUMN = "doc_type_code";

	public static final Property<String> DOC_TYPE_NAME = new Property<>("docTypeName");
	public static final Property<Integer> TRANS_ID = new Property<>("transId");
	public static final Property<Application> APPLICATION = new Property<>("application");

	public void setDocTypeName(final String docTypeName)
	{
		this.writeProperty("docTypeName", docTypeName);
	}

	public String getDocTypeName()
	{
		return (String) this.readProperty("docTypeName");
	}

	public void setTransId(final Integer transId)
	{
		this.writeProperty("transId", transId);
	}

	public Integer getTransId()
	{
		return (Integer) this.readProperty("transId");
	}

	public void setApplication(final Application application)
	{
		this.setToOneTarget("application", application, true);
	}

	public Application getApplication()
	{
		return (Application) this.readProperty("application");
	}

}