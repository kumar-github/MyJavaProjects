package com.tc.app.exchangemonitor.model.cayenne.persistent.auto;

import org.apache.cayenne.CayenneDataObject;
import org.apache.cayenne.exp.Property;

/**
 * Class _AudDocumentMessage was generated by Cayenne.
 * It is probably a good idea to avoid changing this class manually,
 * since it may be overwritten next time code is regenerated.
 * If you need to make any customizations, please use subclass.
 */
public abstract class _AudDocumentMessage extends CayenneDataObject
{

	private static final long serialVersionUID = 1L;

	public static final Property<String> DOC_MSG_DATA = new Property<String>("docMsgData");
	public static final Property<Short> DOC_MSG_NUM = new Property<Short>("docMsgNum");
	public static final Property<Integer> DOC_NUM = new Property<Integer>("docNum");
	public static final Property<Short> DOC_REV_NUM = new Property<Short>("docRevNum");
	public static final Property<Integer> RESP_TRANS_ID = new Property<Integer>("respTransId");
	public static final Property<Integer> TRANS_ID = new Property<Integer>("transId");

	public void setDocMsgData(String docMsgData)
	{
		writeProperty("docMsgData", docMsgData);
	}

	public String getDocMsgData()
	{
		return (String) readProperty("docMsgData");
	}

	public void setDocMsgNum(Short docMsgNum)
	{
		writeProperty("docMsgNum", docMsgNum);
	}

	public Short getDocMsgNum()
	{
		return (Short) readProperty("docMsgNum");
	}

	public void setDocNum(Integer docNum)
	{
		writeProperty("docNum", docNum);
	}

	public Integer getDocNum()
	{
		return (Integer) readProperty("docNum");
	}

	public void setDocRevNum(Short docRevNum)
	{
		writeProperty("docRevNum", docRevNum);
	}

	public Short getDocRevNum()
	{
		return (Short) readProperty("docRevNum");
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