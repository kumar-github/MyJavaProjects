package com.tc.app.exchangemonitor.model.cayenne.persistent.auto;

import org.apache.cayenne.CayenneDataObject;
import org.apache.cayenne.exp.Property;

/**
 * Class _IdmsDepartmentMapping was generated by Cayenne.
 * It is probably a good idea to avoid changing this class manually,
 * since it may be overwritten next time code is regenerated.
 * If you need to make any customizations, please use subclass.
 */
public abstract class _IdmsDepartmentMapping extends CayenneDataObject
{

	private static final long serialVersionUID = 1L;

	public static final String IDMS_DEPT_CODE_PK_COLUMN = "idms_dept_code";

	public static final Property<String> IDMS_DEPT_NAME = new Property<String>("idmsDeptName");
	public static final Property<String> NEWSGRAZER_DEPT_NAME = new Property<String>("newsgrazerDeptName");
	public static final Property<Integer> TRANS_ID = new Property<Integer>("transId");

	public void setIdmsDeptName(String idmsDeptName)
	{
		writeProperty("idmsDeptName", idmsDeptName);
	}

	public String getIdmsDeptName()
	{
		return (String) readProperty("idmsDeptName");
	}

	public void setNewsgrazerDeptName(String newsgrazerDeptName)
	{
		writeProperty("newsgrazerDeptName", newsgrazerDeptName);
	}

	public String getNewsgrazerDeptName()
	{
		return (String) readProperty("newsgrazerDeptName");
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