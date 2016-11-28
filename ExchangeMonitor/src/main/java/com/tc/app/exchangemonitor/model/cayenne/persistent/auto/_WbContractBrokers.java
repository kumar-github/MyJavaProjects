package com.tc.app.exchangemonitor.model.cayenne.persistent.auto;

import java.math.BigDecimal;

import org.apache.cayenne.CayenneDataObject;
import org.apache.cayenne.exp.Property;

/**
 * Class _WbContractBrokers was generated by Cayenne.
 * It is probably a good idea to avoid changing this class manually,
 * since it may be overwritten next time code is regenerated.
 * If you need to make any customizations, please use subclass.
 */
public abstract class _WbContractBrokers extends CayenneDataObject
{

	private static final long serialVersionUID = 1L;

	public static final String FLDCHR_CONTR_KEY_PK_COLUMN = "fldchrContrKey";
	public static final String FLDINT_BROKER_ACCT_NUM_PK_COLUMN = "fldintBrokerAcctNum";

	public static final Property<String> FLDCHR_CMDTY_UMCODE = new Property<String>("fldchrCmdtyUMCode");
	public static final Property<String> FLDCHR_COST_MODE_FLAG = new Property<String>("fldchrCostModeFlag");
	public static final Property<String> FLDCHR_CRNCY_CODE = new Property<String>("fldchrCrncyCode");
	public static final Property<String> FLDCHR_REC_ID = new Property<String>("fldchrRecId");
	public static final Property<BigDecimal> FLDDEC_LSUM_PRICE = new Property<BigDecimal>("flddecLsumPrice");
	public static final Property<BigDecimal> FLDDEC_PCTG = new Property<BigDecimal>("flddecPctg");
	public static final Property<BigDecimal> FLDDEC_UNIT_PRICE = new Property<BigDecimal>("flddecUnitPrice");
	public static final Property<Integer> FLDINT_BROKER_CONTACT_ACCT_NUM = new Property<Integer>("fldintBrokerContactAcctNum");
	public static final Property<String> FLDVCH_COMMENTS = new Property<String>("fldvchComments");
	public static final Property<String> FLDVCH_REF_NUM = new Property<String>("fldvchRefNum");
	public static final Property<Integer> TRANS_ID = new Property<Integer>("transId");

	public void setFldchrCmdtyUMCode(String fldchrCmdtyUMCode)
	{
		writeProperty("fldchrCmdtyUMCode", fldchrCmdtyUMCode);
	}

	public String getFldchrCmdtyUMCode()
	{
		return (String) readProperty("fldchrCmdtyUMCode");
	}

	public void setFldchrCostModeFlag(String fldchrCostModeFlag)
	{
		writeProperty("fldchrCostModeFlag", fldchrCostModeFlag);
	}

	public String getFldchrCostModeFlag()
	{
		return (String) readProperty("fldchrCostModeFlag");
	}

	public void setFldchrCrncyCode(String fldchrCrncyCode)
	{
		writeProperty("fldchrCrncyCode", fldchrCrncyCode);
	}

	public String getFldchrCrncyCode()
	{
		return (String) readProperty("fldchrCrncyCode");
	}

	public void setFldchrRecId(String fldchrRecId)
	{
		writeProperty("fldchrRecId", fldchrRecId);
	}

	public String getFldchrRecId()
	{
		return (String) readProperty("fldchrRecId");
	}

	public void setFlddecLsumPrice(BigDecimal flddecLsumPrice)
	{
		writeProperty("flddecLsumPrice", flddecLsumPrice);
	}

	public BigDecimal getFlddecLsumPrice()
	{
		return (BigDecimal) readProperty("flddecLsumPrice");
	}

	public void setFlddecPctg(BigDecimal flddecPctg)
	{
		writeProperty("flddecPctg", flddecPctg);
	}

	public BigDecimal getFlddecPctg()
	{
		return (BigDecimal) readProperty("flddecPctg");
	}

	public void setFlddecUnitPrice(BigDecimal flddecUnitPrice)
	{
		writeProperty("flddecUnitPrice", flddecUnitPrice);
	}

	public BigDecimal getFlddecUnitPrice()
	{
		return (BigDecimal) readProperty("flddecUnitPrice");
	}

	public void setFldintBrokerContactAcctNum(Integer fldintBrokerContactAcctNum)
	{
		writeProperty("fldintBrokerContactAcctNum", fldintBrokerContactAcctNum);
	}

	public Integer getFldintBrokerContactAcctNum()
	{
		return (Integer) readProperty("fldintBrokerContactAcctNum");
	}

	public void setFldvchComments(String fldvchComments)
	{
		writeProperty("fldvchComments", fldvchComments);
	}

	public String getFldvchComments()
	{
		return (String) readProperty("fldvchComments");
	}

	public void setFldvchRefNum(String fldvchRefNum)
	{
		writeProperty("fldvchRefNum", fldvchRefNum);
	}

	public String getFldvchRefNum()
	{
		return (String) readProperty("fldvchRefNum");
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