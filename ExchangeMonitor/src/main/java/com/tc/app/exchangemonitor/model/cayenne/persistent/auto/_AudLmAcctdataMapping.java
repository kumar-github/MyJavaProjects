package com.tc.app.exchangemonitor.model.cayenne.persistent.auto;

import org.apache.cayenne.CayenneDataObject;
import org.apache.cayenne.exp.Property;

/**
 * Class _AudLmAcctdataMapping was generated by Cayenne.
 * It is probably a good idea to avoid changing this class manually,
 * since it may be overwritten next time code is regenerated.
 * If you need to make any customizations, please use subclass.
 */
public abstract class _AudLmAcctdataMapping extends CayenneDataObject
{

	private static final long serialVersionUID = 1L;

	public static final Property<Integer> CLR_BROKER_NUM = new Property<Integer>("clrBrokerNum");
	public static final Property<String> CUST_IND = new Property<String>("custInd");
	public static final Property<String> EXT_ACCOUNT_ID = new Property<String>("extAccountId");
	public static final Property<String> EXT_ACCOUNT_TYPE = new Property<String>("extAccountType");
	public static final Property<Integer> OID = new Property<Integer>("oid");
	public static final Property<Integer> RESP_TRANS_ID = new Property<Integer>("respTransId");
	public static final Property<String> SEG_IND = new Property<String>("segInd");
	public static final Property<Integer> TRANS_ID = new Property<Integer>("transId");

	public void setClrBrokerNum(Integer clrBrokerNum)
	{
		writeProperty("clrBrokerNum", clrBrokerNum);
	}

	public Integer getClrBrokerNum()
	{
		return (Integer) readProperty("clrBrokerNum");
	}

	public void setCustInd(String custInd)
	{
		writeProperty("custInd", custInd);
	}

	public String getCustInd()
	{
		return (String) readProperty("custInd");
	}

	public void setExtAccountId(String extAccountId)
	{
		writeProperty("extAccountId", extAccountId);
	}

	public String getExtAccountId()
	{
		return (String) readProperty("extAccountId");
	}

	public void setExtAccountType(String extAccountType)
	{
		writeProperty("extAccountType", extAccountType);
	}

	public String getExtAccountType()
	{
		return (String) readProperty("extAccountType");
	}

	public void setOid(Integer oid)
	{
		writeProperty("oid", oid);
	}

	public Integer getOid()
	{
		return (Integer) readProperty("oid");
	}

	public void setRespTransId(Integer respTransId)
	{
		writeProperty("respTransId", respTransId);
	}

	public Integer getRespTransId()
	{
		return (Integer) readProperty("respTransId");
	}

	public void setSegInd(String segInd)
	{
		writeProperty("segInd", segInd);
	}

	public String getSegInd()
	{
		return (String) readProperty("segInd");
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