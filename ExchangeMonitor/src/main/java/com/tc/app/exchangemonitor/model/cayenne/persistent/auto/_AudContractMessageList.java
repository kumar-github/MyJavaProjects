package com.tc.app.exchangemonitor.model.cayenne.persistent.auto;

import org.apache.cayenne.CayenneDataObject;
import org.apache.cayenne.exp.Property;

/**
 * Class _AudContractMessageList was generated by Cayenne.
 * It is probably a good idea to avoid changing this class manually,
 * since it may be overwritten next time code is regenerated.
 * If you need to make any customizations, please use subclass.
 */
public abstract class _AudContractMessageList extends CayenneDataObject
{

	private static final long serialVersionUID = 1L;

	public static final Property<String> CONTR_MSG_LIST_DATA = new Property<String>("contrMsgListData");
	public static final Property<Integer> CONTR_MSG_LIST_NUM = new Property<Integer>("contrMsgListNum");
	public static final Property<Integer> CONTR_NUM = new Property<Integer>("contrNum");
	public static final Property<Integer> CONTR_REV_NUM = new Property<Integer>("contrRevNum");
	public static final Property<Integer> RESP_TRANS_ID = new Property<Integer>("respTransId");
	public static final Property<Integer> TRANS_ID = new Property<Integer>("transId");

	public void setContrMsgListData(String contrMsgListData)
	{
		writeProperty("contrMsgListData", contrMsgListData);
	}

	public String getContrMsgListData()
	{
		return (String) readProperty("contrMsgListData");
	}

	public void setContrMsgListNum(Integer contrMsgListNum)
	{
		writeProperty("contrMsgListNum", contrMsgListNum);
	}

	public Integer getContrMsgListNum()
	{
		return (Integer) readProperty("contrMsgListNum");
	}

	public void setContrNum(Integer contrNum)
	{
		writeProperty("contrNum", contrNum);
	}

	public Integer getContrNum()
	{
		return (Integer) readProperty("contrNum");
	}

	public void setContrRevNum(Integer contrRevNum)
	{
		writeProperty("contrRevNum", contrRevNum);
	}

	public Integer getContrRevNum()
	{
		return (Integer) readProperty("contrRevNum");
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
