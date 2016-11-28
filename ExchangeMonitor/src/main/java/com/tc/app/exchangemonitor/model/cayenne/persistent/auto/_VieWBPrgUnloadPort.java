package com.tc.app.exchangemonitor.model.cayenne.persistent.auto;

import java.math.BigDecimal;
import java.util.Date;

import org.apache.cayenne.CayenneDataObject;
import org.apache.cayenne.exp.Property;

/**
 * Class _VieWBPrgUnloadPort was generated by Cayenne.
 * It is probably a good idea to avoid changing this class manually,
 * since it may be overwritten next time code is regenerated.
 * If you need to make any customizations, please use subclass.
 */
public abstract class _VieWBPrgUnloadPort extends CayenneDataObject
{

	private static final long serialVersionUID = 1L;

	public static final Property<String> FLDCHR_CARGO_MODE_FLAG = new Property<String>("fldchrCargoModeFlag");
	public static final Property<String> FLDCHR_CHANNEL_CODE = new Property<String>("fldchrChannelCode");
	public static final Property<String> FLDCHR_ETA_AUTO_FLAG = new Property<String>("fldchrEtaAutoFlag");
	public static final Property<String> FLDCHR_INSPECTION_NOTE = new Property<String>("fldchrInspectionNote");
	public static final Property<String> FLDCHR_LOCT_KEY = new Property<String>("fldchrLoctKey");
	public static final Property<String> FLDCHR_LOT_KEY = new Property<String>("fldchrLotKey");
	public static final Property<String> FLDCHR_OP_ID = new Property<String>("fldchrOpId");
	public static final Property<String> FLDCHR_OP_KEY = new Property<String>("fldchrOpKey");
	public static final Property<String> FLDCHR_PARENT_OP_KEY = new Property<String>("fldchrParentOpKey");
	public static final Property<String> FLDCHR_STORAGE_CODE = new Property<String>("fldchrStorageCode");
	public static final Property<BigDecimal> FLDDEC_DELAY_TIME = new Property<BigDecimal>("flddecDelayTime");
	public static final Property<Integer> FLDINT_DELAY_TYPE = new Property<Integer>("fldintDelayType");
	public static final Property<Integer> FLDINT_INSP_COMP_ACCT_NUM = new Property<Integer>("fldintInspCompAcctNum");
	public static final Property<Date> FLDSDT_ETA = new Property<Date>("fldsdtEta");
	public static final Property<Date> FLDSDT_LCAN_END = new Property<Date>("fldsdtLcanEnd");
	public static final Property<Date> FLDSDT_LCAN_START = new Property<Date>("fldsdtLcanStart");
	public static final Property<Integer> TRANS_ID = new Property<Integer>("transId");

	public void setFldchrCargoModeFlag(String fldchrCargoModeFlag)
	{
		writeProperty("fldchrCargoModeFlag", fldchrCargoModeFlag);
	}

	public String getFldchrCargoModeFlag()
	{
		return (String) readProperty("fldchrCargoModeFlag");
	}

	public void setFldchrChannelCode(String fldchrChannelCode)
	{
		writeProperty("fldchrChannelCode", fldchrChannelCode);
	}

	public String getFldchrChannelCode()
	{
		return (String) readProperty("fldchrChannelCode");
	}

	public void setFldchrEtaAutoFlag(String fldchrEtaAutoFlag)
	{
		writeProperty("fldchrEtaAutoFlag", fldchrEtaAutoFlag);
	}

	public String getFldchrEtaAutoFlag()
	{
		return (String) readProperty("fldchrEtaAutoFlag");
	}

	public void setFldchrInspectionNote(String fldchrInspectionNote)
	{
		writeProperty("fldchrInspectionNote", fldchrInspectionNote);
	}

	public String getFldchrInspectionNote()
	{
		return (String) readProperty("fldchrInspectionNote");
	}

	public void setFldchrLoctKey(String fldchrLoctKey)
	{
		writeProperty("fldchrLoctKey", fldchrLoctKey);
	}

	public String getFldchrLoctKey()
	{
		return (String) readProperty("fldchrLoctKey");
	}

	public void setFldchrLotKey(String fldchrLotKey)
	{
		writeProperty("fldchrLotKey", fldchrLotKey);
	}

	public String getFldchrLotKey()
	{
		return (String) readProperty("fldchrLotKey");
	}

	public void setFldchrOpId(String fldchrOpId)
	{
		writeProperty("fldchrOpId", fldchrOpId);
	}

	public String getFldchrOpId()
	{
		return (String) readProperty("fldchrOpId");
	}

	public void setFldchrOpKey(String fldchrOpKey)
	{
		writeProperty("fldchrOpKey", fldchrOpKey);
	}

	public String getFldchrOpKey()
	{
		return (String) readProperty("fldchrOpKey");
	}

	public void setFldchrParentOpKey(String fldchrParentOpKey)
	{
		writeProperty("fldchrParentOpKey", fldchrParentOpKey);
	}

	public String getFldchrParentOpKey()
	{
		return (String) readProperty("fldchrParentOpKey");
	}

	public void setFldchrStorageCode(String fldchrStorageCode)
	{
		writeProperty("fldchrStorageCode", fldchrStorageCode);
	}

	public String getFldchrStorageCode()
	{
		return (String) readProperty("fldchrStorageCode");
	}

	public void setFlddecDelayTime(BigDecimal flddecDelayTime)
	{
		writeProperty("flddecDelayTime", flddecDelayTime);
	}

	public BigDecimal getFlddecDelayTime()
	{
		return (BigDecimal) readProperty("flddecDelayTime");
	}

	public void setFldintDelayType(Integer fldintDelayType)
	{
		writeProperty("fldintDelayType", fldintDelayType);
	}

	public Integer getFldintDelayType()
	{
		return (Integer) readProperty("fldintDelayType");
	}

	public void setFldintInspCompAcctNum(Integer fldintInspCompAcctNum)
	{
		writeProperty("fldintInspCompAcctNum", fldintInspCompAcctNum);
	}

	public Integer getFldintInspCompAcctNum()
	{
		return (Integer) readProperty("fldintInspCompAcctNum");
	}

	public void setFldsdtEta(Date fldsdtEta)
	{
		writeProperty("fldsdtEta", fldsdtEta);
	}

	public Date getFldsdtEta()
	{
		return (Date) readProperty("fldsdtEta");
	}

	public void setFldsdtLcanEnd(Date fldsdtLcanEnd)
	{
		writeProperty("fldsdtLcanEnd", fldsdtLcanEnd);
	}

	public Date getFldsdtLcanEnd()
	{
		return (Date) readProperty("fldsdtLcanEnd");
	}

	public void setFldsdtLcanStart(Date fldsdtLcanStart)
	{
		writeProperty("fldsdtLcanStart", fldsdtLcanStart);
	}

	public Date getFldsdtLcanStart()
	{
		return (Date) readProperty("fldsdtLcanStart");
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