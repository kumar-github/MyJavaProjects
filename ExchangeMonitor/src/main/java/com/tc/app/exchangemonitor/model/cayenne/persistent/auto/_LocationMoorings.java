package com.tc.app.exchangemonitor.model.cayenne.persistent.auto;

import java.math.BigDecimal;

import org.apache.cayenne.CayenneDataObject;
import org.apache.cayenne.exp.Property;

/**
 * Class _LocationMoorings was generated by Cayenne.
 * It is probably a good idea to avoid changing this class manually,
 * since it may be overwritten next time code is regenerated.
 * If you need to make any customizations, please use subclass.
 */
public abstract class _LocationMoorings extends CayenneDataObject
{

	private static final long serialVersionUID = 1L;

	public static final String FLDCHR_MOORING_ID_PK_COLUMN = "fldchrMooringId";

	public static final Property<String> FLDCHR_AVAILABILITY_FLAG = new Property<String>("fldchrAvailabilityFlag");
	public static final Property<String> FLDCHR_DISCH_AFT_FLAG = new Property<String>("fldchrDischAftFlag");
	public static final Property<String> FLDCHR_LOCT_KEY = new Property<String>("fldchrLoctKey");
	public static final Property<BigDecimal> FLDDEC_DRAFT_FOT = new Property<BigDecimal>("flddecDraftFOT");
	public static final Property<BigDecimal> FLDDEC_LENGTH_FOT = new Property<BigDecimal>("flddecLengthFOT");
	public static final Property<BigDecimal> FLDDEC_LENGTH_MTR = new Property<BigDecimal>("flddecLengthMTR");
	public static final Property<BigDecimal> FLDDEC_MAX_DWT_TNE = new Property<BigDecimal>("flddecMaxDwtTNE");
	public static final Property<String> FLDVCH_MOORING_NAME = new Property<String>("fldvchMooringName");
	public static final Property<Integer> TRANS_ID = new Property<Integer>("transId");

	public void setFldchrAvailabilityFlag(String fldchrAvailabilityFlag)
	{
		writeProperty("fldchrAvailabilityFlag", fldchrAvailabilityFlag);
	}

	public String getFldchrAvailabilityFlag()
	{
		return (String) readProperty("fldchrAvailabilityFlag");
	}

	public void setFldchrDischAftFlag(String fldchrDischAftFlag)
	{
		writeProperty("fldchrDischAftFlag", fldchrDischAftFlag);
	}

	public String getFldchrDischAftFlag()
	{
		return (String) readProperty("fldchrDischAftFlag");
	}

	public void setFldchrLoctKey(String fldchrLoctKey)
	{
		writeProperty("fldchrLoctKey", fldchrLoctKey);
	}

	public String getFldchrLoctKey()
	{
		return (String) readProperty("fldchrLoctKey");
	}

	public void setFlddecDraftFOT(BigDecimal flddecDraftFOT)
	{
		writeProperty("flddecDraftFOT", flddecDraftFOT);
	}

	public BigDecimal getFlddecDraftFOT()
	{
		return (BigDecimal) readProperty("flddecDraftFOT");
	}

	public void setFlddecLengthFOT(BigDecimal flddecLengthFOT)
	{
		writeProperty("flddecLengthFOT", flddecLengthFOT);
	}

	public BigDecimal getFlddecLengthFOT()
	{
		return (BigDecimal) readProperty("flddecLengthFOT");
	}

	public void setFlddecLengthMTR(BigDecimal flddecLengthMTR)
	{
		writeProperty("flddecLengthMTR", flddecLengthMTR);
	}

	public BigDecimal getFlddecLengthMTR()
	{
		return (BigDecimal) readProperty("flddecLengthMTR");
	}

	public void setFlddecMaxDwtTNE(BigDecimal flddecMaxDwtTNE)
	{
		writeProperty("flddecMaxDwtTNE", flddecMaxDwtTNE);
	}

	public BigDecimal getFlddecMaxDwtTNE()
	{
		return (BigDecimal) readProperty("flddecMaxDwtTNE");
	}

	public void setFldvchMooringName(String fldvchMooringName)
	{
		writeProperty("fldvchMooringName", fldvchMooringName);
	}

	public String getFldvchMooringName()
	{
		return (String) readProperty("fldvchMooringName");
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
