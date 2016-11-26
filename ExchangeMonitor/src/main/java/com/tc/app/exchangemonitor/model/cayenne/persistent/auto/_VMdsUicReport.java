package com.tc.app.exchangemonitor.model.cayenne.persistent.auto;

import java.util.Date;

import org.apache.cayenne.CayenneDataObject;
import org.apache.cayenne.exp.Property;

/**
 * Class _VMdsUicReport was generated by Cayenne.
 * It is probably a good idea to avoid changing this class manually,
 * since it may be overwritten next time code is regenerated.
 * If you need to make any customizations, please use subclass.
 */
public abstract class _VMdsUicReport extends CayenneDataObject
{

	private static final long serialVersionUID = 1L;

	public static final Property<String> ACCT_FULL_NAME = new Property<String>("acctFullName");
	public static final Property<String> DATAELEMENT = new Property<String>("dataelement");
	public static final Property<String> ENTITY_NAME = new Property<String>("entityName");
	public static final Property<String> ENTITY_VALUE_SELECTOR = new Property<String>("entityValueSelector");
	public static final Property<String> ICTS_USER_NAME = new Property<String>("ictsUserName");
	public static final Property<Integer> KEY1 = new Property<Integer>("key1");
	public static final Property<Short> KEY2 = new Property<Short>("key2");
	public static final Property<Short> KEY3 = new Property<Short>("key3");
	public static final Property<String> NEW_VALUE = new Property<String>("newValue");
	public static final Property<Integer> OID = new Property<Integer>("oid");
	public static final Property<String> OLD_VALUE = new Property<String>("oldValue");
	public static final Property<String> OPERATION = new Property<String>("operation");
	public static final Property<String> OTHER_DATA1 = new Property<String>("otherData1");
	public static final Property<Date> OTHER_DATA2 = new Property<Date>("otherData2");
	public static final Property<String> PORT_SHORT_NAME = new Property<String>("portShortName");
	public static final Property<String> PROFIT_CENTER = new Property<String>("profitCenter");
	public static final Property<Integer> REAL_PORT_NUM = new Property<Integer>("realPortNum");
	public static final Property<Integer> RESP_TRANS_ID = new Property<Integer>("respTransId");
	public static final Property<Date> TRAN_DATE = new Property<Date>("tranDate");
	public static final Property<Integer> VALUES_CONFIG_OID = new Property<Integer>("valuesConfigOid");

	public void setAcctFullName(String acctFullName)
	{
		writeProperty("acctFullName", acctFullName);
	}

	public String getAcctFullName()
	{
		return (String) readProperty("acctFullName");
	}

	public void setDataelement(String dataelement)
	{
		writeProperty("dataelement", dataelement);
	}

	public String getDataelement()
	{
		return (String) readProperty("dataelement");
	}

	public void setEntityName(String entityName)
	{
		writeProperty("entityName", entityName);
	}

	public String getEntityName()
	{
		return (String) readProperty("entityName");
	}

	public void setEntityValueSelector(String entityValueSelector)
	{
		writeProperty("entityValueSelector", entityValueSelector);
	}

	public String getEntityValueSelector()
	{
		return (String) readProperty("entityValueSelector");
	}

	public void setIctsUserName(String ictsUserName)
	{
		writeProperty("ictsUserName", ictsUserName);
	}

	public String getIctsUserName()
	{
		return (String) readProperty("ictsUserName");
	}

	public void setKey1(Integer key1)
	{
		writeProperty("key1", key1);
	}

	public Integer getKey1()
	{
		return (Integer) readProperty("key1");
	}

	public void setKey2(Short key2)
	{
		writeProperty("key2", key2);
	}

	public Short getKey2()
	{
		return (Short) readProperty("key2");
	}

	public void setKey3(Short key3)
	{
		writeProperty("key3", key3);
	}

	public Short getKey3()
	{
		return (Short) readProperty("key3");
	}

	public void setNewValue(String newValue)
	{
		writeProperty("newValue", newValue);
	}

	public String getNewValue()
	{
		return (String) readProperty("newValue");
	}

	public void setOid(Integer oid)
	{
		writeProperty("oid", oid);
	}

	public Integer getOid()
	{
		return (Integer) readProperty("oid");
	}

	public void setOldValue(String oldValue)
	{
		writeProperty("oldValue", oldValue);
	}

	public String getOldValue()
	{
		return (String) readProperty("oldValue");
	}

	public void setOperation(String operation)
	{
		writeProperty("operation", operation);
	}

	public String getOperation()
	{
		return (String) readProperty("operation");
	}

	public void setOtherData1(String otherData1)
	{
		writeProperty("otherData1", otherData1);
	}

	public String getOtherData1()
	{
		return (String) readProperty("otherData1");
	}

	public void setOtherData2(Date otherData2)
	{
		writeProperty("otherData2", otherData2);
	}

	public Date getOtherData2()
	{
		return (Date) readProperty("otherData2");
	}

	public void setPortShortName(String portShortName)
	{
		writeProperty("portShortName", portShortName);
	}

	public String getPortShortName()
	{
		return (String) readProperty("portShortName");
	}

	public void setProfitCenter(String profitCenter)
	{
		writeProperty("profitCenter", profitCenter);
	}

	public String getProfitCenter()
	{
		return (String) readProperty("profitCenter");
	}

	public void setRealPortNum(Integer realPortNum)
	{
		writeProperty("realPortNum", realPortNum);
	}

	public Integer getRealPortNum()
	{
		return (Integer) readProperty("realPortNum");
	}

	public void setRespTransId(Integer respTransId)
	{
		writeProperty("respTransId", respTransId);
	}

	public Integer getRespTransId()
	{
		return (Integer) readProperty("respTransId");
	}

	public void setTranDate(Date tranDate)
	{
		writeProperty("tranDate", tranDate);
	}

	public Date getTranDate()
	{
		return (Date) readProperty("tranDate");
	}

	public void setValuesConfigOid(Integer valuesConfigOid)
	{
		writeProperty("valuesConfigOid", valuesConfigOid);
	}

	public Integer getValuesConfigOid()
	{
		return (Integer) readProperty("valuesConfigOid");
	}

}
