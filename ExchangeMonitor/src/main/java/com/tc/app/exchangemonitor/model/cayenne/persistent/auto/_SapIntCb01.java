package com.tc.app.exchangemonitor.model.cayenne.persistent.auto;

import java.math.BigDecimal;
import java.util.Date;

import org.apache.cayenne.CayenneDataObject;
import org.apache.cayenne.exp.Property;

/**
 * Class _SapIntCb01 was generated by Cayenne.
 * It is probably a good idea to avoid changing this class manually,
 * since it may be overwritten next time code is regenerated.
 * If you need to make any customizations, please use subclass.
 */
public abstract class _SapIntCb01 extends CayenneDataObject
{

	private static final long serialVersionUID = 1L;

	public static final String FLDCHR_REC_ID_PK_COLUMN = "fldchrRecId";

	public static final Property<String> FLDCHR_APPROVAL_FLAG = new Property<String>("fldchrApprovalFlag");
	public static final Property<String> FLDCHR_CANCELLATION_FLAG = new Property<String>("fldchrCancellationFlag");
	public static final Property<String> FLDCHR_CHANNEL_CODE = new Property<String>("fldchrChannelCode");
	public static final Property<String> FLDCHR_CMDTY_CODE = new Property<String>("fldchrCmdtyCode");
	public static final Property<String> FLDCHR_CMDTY_UMCODE = new Property<String>("fldchrCmdtyUMCode");
	public static final Property<String> FLDCHR_CONTR_TYPE_FLAG = new Property<String>("fldchrContrTypeFlag");
	public static final Property<String> FLDCHR_CREATION_USER = new Property<String>("fldchrCreationUser");
	public static final Property<String> FLDCHR_DELETION_FLAG = new Property<String>("fldchrDeletionFlag");
	public static final Property<String> FLDCHR_DELETION_TYPE = new Property<String>("fldchrDeletionType");
	public static final Property<String> FLDCHR_HANDLING_TYPE = new Property<String>("fldchrHandlingType");
	public static final Property<String> FLDCHR_LLOYDS_REF_NUM = new Property<String>("fldchrLloydsRefNum");
	public static final Property<String> FLDCHR_LOT_KEY = new Property<String>("fldchrLotKey");
	public static final Property<String> FLDCHR_OP_DTL_KEY = new Property<String>("fldchrOpDtlKey");
	public static final Property<String> FLDCHR_OP_KEY = new Property<String>("fldchrOpKey");
	public static final Property<String> FLDCHR_RCVR_STORAGE_CODE = new Property<String>("fldchrRcvrStorageCode");
	public static final Property<String> FLDCHR_SENT_FLAG = new Property<String>("fldchrSentFlag");
	public static final Property<String> FLDCHR_SHPR_STORAGE_CODE = new Property<String>("fldchrShprStorageCode");
	public static final Property<String> FLDCHR_UPDATE_USER = new Property<String>("fldchrUpdateUser");
	public static final Property<BigDecimal> FLDDEC_CMDTY_QTY = new Property<BigDecimal>("flddecCmdtyQty");
	public static final Property<Integer> FLDINT_ALLOC_NUM = new Property<Integer>("fldintAllocNum");
	public static final Property<Date> FLDSDT_APPROVAL_DATE = new Property<Date>("fldsdtApprovalDate");
	public static final Property<Date> FLDSDT_CANCEL_SAP_RECORD = new Property<Date>("fldsdtCancelSapRecord");
	public static final Property<Date> FLDSDT_CREATION_DATE = new Property<Date>("fldsdtCreationDate");
	public static final Property<Date> FLDSDT_LCAN_END_DATE = new Property<Date>("fldsdtLcanEndDate");
	public static final Property<Date> FLDSDT_LCAN_START_DATE = new Property<Date>("fldsdtLcanStartDate");
	public static final Property<Date> FLDSDT_SEND_SAP_RECORD = new Property<Date>("fldsdtSendSapRecord");
	public static final Property<Date> FLDSDT_TIME_STAMP = new Property<Date>("fldsdtTimeStamp");
	public static final Property<Date> FLDSDT_UPDATE_DATE = new Property<Date>("fldsdtUpdateDate");
	public static final Property<Short> FLDSMI_ALLOC_ITEM_NUM = new Property<Short>("fldsmiAllocItemNum");
	public static final Property<Short> FLDSMI_VOYG_COUNTER = new Property<Short>("fldsmiVoygCounter");
	public static final Property<String> FLDVCH_CONTR_NUM = new Property<String>("fldvchContrNum");
	public static final Property<Integer> TRANS_ID = new Property<Integer>("transId");

	public void setFldchrApprovalFlag(String fldchrApprovalFlag)
	{
		writeProperty("fldchrApprovalFlag", fldchrApprovalFlag);
	}

	public String getFldchrApprovalFlag()
	{
		return (String) readProperty("fldchrApprovalFlag");
	}

	public void setFldchrCancellationFlag(String fldchrCancellationFlag)
	{
		writeProperty("fldchrCancellationFlag", fldchrCancellationFlag);
	}

	public String getFldchrCancellationFlag()
	{
		return (String) readProperty("fldchrCancellationFlag");
	}

	public void setFldchrChannelCode(String fldchrChannelCode)
	{
		writeProperty("fldchrChannelCode", fldchrChannelCode);
	}

	public String getFldchrChannelCode()
	{
		return (String) readProperty("fldchrChannelCode");
	}

	public void setFldchrCmdtyCode(String fldchrCmdtyCode)
	{
		writeProperty("fldchrCmdtyCode", fldchrCmdtyCode);
	}

	public String getFldchrCmdtyCode()
	{
		return (String) readProperty("fldchrCmdtyCode");
	}

	public void setFldchrCmdtyUMCode(String fldchrCmdtyUMCode)
	{
		writeProperty("fldchrCmdtyUMCode", fldchrCmdtyUMCode);
	}

	public String getFldchrCmdtyUMCode()
	{
		return (String) readProperty("fldchrCmdtyUMCode");
	}

	public void setFldchrContrTypeFlag(String fldchrContrTypeFlag)
	{
		writeProperty("fldchrContrTypeFlag", fldchrContrTypeFlag);
	}

	public String getFldchrContrTypeFlag()
	{
		return (String) readProperty("fldchrContrTypeFlag");
	}

	public void setFldchrCreationUser(String fldchrCreationUser)
	{
		writeProperty("fldchrCreationUser", fldchrCreationUser);
	}

	public String getFldchrCreationUser()
	{
		return (String) readProperty("fldchrCreationUser");
	}

	public void setFldchrDeletionFlag(String fldchrDeletionFlag)
	{
		writeProperty("fldchrDeletionFlag", fldchrDeletionFlag);
	}

	public String getFldchrDeletionFlag()
	{
		return (String) readProperty("fldchrDeletionFlag");
	}

	public void setFldchrDeletionType(String fldchrDeletionType)
	{
		writeProperty("fldchrDeletionType", fldchrDeletionType);
	}

	public String getFldchrDeletionType()
	{
		return (String) readProperty("fldchrDeletionType");
	}

	public void setFldchrHandlingType(String fldchrHandlingType)
	{
		writeProperty("fldchrHandlingType", fldchrHandlingType);
	}

	public String getFldchrHandlingType()
	{
		return (String) readProperty("fldchrHandlingType");
	}

	public void setFldchrLloydsRefNum(String fldchrLloydsRefNum)
	{
		writeProperty("fldchrLloydsRefNum", fldchrLloydsRefNum);
	}

	public String getFldchrLloydsRefNum()
	{
		return (String) readProperty("fldchrLloydsRefNum");
	}

	public void setFldchrLotKey(String fldchrLotKey)
	{
		writeProperty("fldchrLotKey", fldchrLotKey);
	}

	public String getFldchrLotKey()
	{
		return (String) readProperty("fldchrLotKey");
	}

	public void setFldchrOpDtlKey(String fldchrOpDtlKey)
	{
		writeProperty("fldchrOpDtlKey", fldchrOpDtlKey);
	}

	public String getFldchrOpDtlKey()
	{
		return (String) readProperty("fldchrOpDtlKey");
	}

	public void setFldchrOpKey(String fldchrOpKey)
	{
		writeProperty("fldchrOpKey", fldchrOpKey);
	}

	public String getFldchrOpKey()
	{
		return (String) readProperty("fldchrOpKey");
	}

	public void setFldchrRcvrStorageCode(String fldchrRcvrStorageCode)
	{
		writeProperty("fldchrRcvrStorageCode", fldchrRcvrStorageCode);
	}

	public String getFldchrRcvrStorageCode()
	{
		return (String) readProperty("fldchrRcvrStorageCode");
	}

	public void setFldchrSentFlag(String fldchrSentFlag)
	{
		writeProperty("fldchrSentFlag", fldchrSentFlag);
	}

	public String getFldchrSentFlag()
	{
		return (String) readProperty("fldchrSentFlag");
	}

	public void setFldchrShprStorageCode(String fldchrShprStorageCode)
	{
		writeProperty("fldchrShprStorageCode", fldchrShprStorageCode);
	}

	public String getFldchrShprStorageCode()
	{
		return (String) readProperty("fldchrShprStorageCode");
	}

	public void setFldchrUpdateUser(String fldchrUpdateUser)
	{
		writeProperty("fldchrUpdateUser", fldchrUpdateUser);
	}

	public String getFldchrUpdateUser()
	{
		return (String) readProperty("fldchrUpdateUser");
	}

	public void setFlddecCmdtyQty(BigDecimal flddecCmdtyQty)
	{
		writeProperty("flddecCmdtyQty", flddecCmdtyQty);
	}

	public BigDecimal getFlddecCmdtyQty()
	{
		return (BigDecimal) readProperty("flddecCmdtyQty");
	}

	public void setFldintAllocNum(Integer fldintAllocNum)
	{
		writeProperty("fldintAllocNum", fldintAllocNum);
	}

	public Integer getFldintAllocNum()
	{
		return (Integer) readProperty("fldintAllocNum");
	}

	public void setFldsdtApprovalDate(Date fldsdtApprovalDate)
	{
		writeProperty("fldsdtApprovalDate", fldsdtApprovalDate);
	}

	public Date getFldsdtApprovalDate()
	{
		return (Date) readProperty("fldsdtApprovalDate");
	}

	public void setFldsdtCancelSapRecord(Date fldsdtCancelSapRecord)
	{
		writeProperty("fldsdtCancelSapRecord", fldsdtCancelSapRecord);
	}

	public Date getFldsdtCancelSapRecord()
	{
		return (Date) readProperty("fldsdtCancelSapRecord");
	}

	public void setFldsdtCreationDate(Date fldsdtCreationDate)
	{
		writeProperty("fldsdtCreationDate", fldsdtCreationDate);
	}

	public Date getFldsdtCreationDate()
	{
		return (Date) readProperty("fldsdtCreationDate");
	}

	public void setFldsdtLcanEndDate(Date fldsdtLcanEndDate)
	{
		writeProperty("fldsdtLcanEndDate", fldsdtLcanEndDate);
	}

	public Date getFldsdtLcanEndDate()
	{
		return (Date) readProperty("fldsdtLcanEndDate");
	}

	public void setFldsdtLcanStartDate(Date fldsdtLcanStartDate)
	{
		writeProperty("fldsdtLcanStartDate", fldsdtLcanStartDate);
	}

	public Date getFldsdtLcanStartDate()
	{
		return (Date) readProperty("fldsdtLcanStartDate");
	}

	public void setFldsdtSendSapRecord(Date fldsdtSendSapRecord)
	{
		writeProperty("fldsdtSendSapRecord", fldsdtSendSapRecord);
	}

	public Date getFldsdtSendSapRecord()
	{
		return (Date) readProperty("fldsdtSendSapRecord");
	}

	public void setFldsdtTimeStamp(Date fldsdtTimeStamp)
	{
		writeProperty("fldsdtTimeStamp", fldsdtTimeStamp);
	}

	public Date getFldsdtTimeStamp()
	{
		return (Date) readProperty("fldsdtTimeStamp");
	}

	public void setFldsdtUpdateDate(Date fldsdtUpdateDate)
	{
		writeProperty("fldsdtUpdateDate", fldsdtUpdateDate);
	}

	public Date getFldsdtUpdateDate()
	{
		return (Date) readProperty("fldsdtUpdateDate");
	}

	public void setFldsmiAllocItemNum(Short fldsmiAllocItemNum)
	{
		writeProperty("fldsmiAllocItemNum", fldsmiAllocItemNum);
	}

	public Short getFldsmiAllocItemNum()
	{
		return (Short) readProperty("fldsmiAllocItemNum");
	}

	public void setFldsmiVoygCounter(Short fldsmiVoygCounter)
	{
		writeProperty("fldsmiVoygCounter", fldsmiVoygCounter);
	}

	public Short getFldsmiVoygCounter()
	{
		return (Short) readProperty("fldsmiVoygCounter");
	}

	public void setFldvchContrNum(String fldvchContrNum)
	{
		writeProperty("fldvchContrNum", fldvchContrNum);
	}

	public String getFldvchContrNum()
	{
		return (String) readProperty("fldvchContrNum");
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
