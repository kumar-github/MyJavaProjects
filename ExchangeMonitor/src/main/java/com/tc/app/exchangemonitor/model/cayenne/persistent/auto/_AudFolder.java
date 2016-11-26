package com.tc.app.exchangemonitor.model.cayenne.persistent.auto;

import org.apache.cayenne.CayenneDataObject;
import org.apache.cayenne.exp.Property;

/**
 * Class _AudFolder was generated by Cayenne.
 * It is probably a good idea to avoid changing this class manually,
 * since it may be overwritten next time code is regenerated.
 * If you need to make any customizations, please use subclass.
 */
public abstract class _AudFolder extends CayenneDataObject
{

	private static final long serialVersionUID = 1L;

	public static final Property<String> FOLDER_NAME = new Property<String>("folderName");
	public static final Property<Integer> FOLDER_NUM = new Property<Integer>("folderNum");
	public static final Property<Integer> RESP_TRANS_ID = new Property<Integer>("respTransId");
	public static final Property<Integer> TRANS_ID = new Property<Integer>("transId");

	public void setFolderName(String folderName)
	{
		writeProperty("folderName", folderName);
	}

	public String getFolderName()
	{
		return (String) readProperty("folderName");
	}

	public void setFolderNum(Integer folderNum)
	{
		writeProperty("folderNum", folderNum);
	}

	public Integer getFolderNum()
	{
		return (Integer) readProperty("folderNum");
	}

	public void setRespTransId(Integer respTransId)
	{
		writeProperty("respTransId", respTransId);
	}

	public Integer getRespTransId()
	{
		return (Integer) readProperty("respTransId");
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
