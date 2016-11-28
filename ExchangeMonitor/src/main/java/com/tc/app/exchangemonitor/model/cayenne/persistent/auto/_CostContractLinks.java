package com.tc.app.exchangemonitor.model.cayenne.persistent.auto;

import java.math.BigDecimal;
import java.util.Date;
import java.util.List;

import org.apache.cayenne.CayenneDataObject;
import org.apache.cayenne.exp.Property;

import com.tc.app.exchangemonitor.model.cayenne.persistent.Cost;
import com.tc.app.exchangemonitor.model.cayenne.persistent.WbContractTcCosts;

/**
 * Class _CostContractLinks was generated by Cayenne.
 * It is probably a good idea to avoid changing this class manually,
 * since it may be overwritten next time code is regenerated.
 * If you need to make any customizations, please use subclass.
 */
public abstract class _CostContractLinks extends CayenneDataObject
{

	private static final long serialVersionUID = 1L;

	public static final String FLDINT_COST_NUM_PK_COLUMN = "fldintCostNum";

	public static final Property<Boolean> CONTRIBUTE_TO_B2B = new Property<Boolean>("contributeToB2b");
	public static final Property<Integer> FLDBOL_CONCURS = new Property<Integer>("fldbolConcurs");
	public static final Property<Integer> FLDBOL_MIRROR = new Property<Integer>("fldbolMirror");
	public static final Property<String> FLDCHR_CONTR_KEY = new Property<String>("fldchrContrKey");
	public static final Property<String> FLDCHR_COST_ACTUAL_FLAG = new Property<String>("fldchrCostActualFlag");
	public static final Property<String> FLDCHR_COST_APPROVAL_FLAG = new Property<String>("fldchrCostApprovalFlag");
	public static final Property<String> FLDCHR_COST_AUTO_FLAG = new Property<String>("fldchrCostAutoFlag");
	public static final Property<String> FLDCHR_LOCT_KEY = new Property<String>("fldchrLoctKey");
	public static final Property<String> FLDCHR_REF_MONTH = new Property<String>("fldchrRefMonth");
	public static final Property<String> FLDCHR_REF_YEAR = new Property<String>("fldchrRefYear");
	public static final Property<String> FLDCHR_SPOT_CONTR_KEY = new Property<String>("fldchrSpotContrKey");
	public static final Property<String> FLDCHR_TSH_DEMURRAGE_COST = new Property<String>("fldchrTshDemurrageCost");
	public static final Property<String> FLDCHR_USER_NAME = new Property<String>("fldchrUserName");
	public static final Property<BigDecimal> FLDDEC_ADJUSTMENT_VALUE = new Property<BigDecimal>("flddecAdjustmentValue");
	public static final Property<BigDecimal> FLDDEC_GROSS_AMOUNT = new Property<BigDecimal>("flddecGrossAmount");
	public static final Property<BigDecimal> FLDDEC_PERCENTAGE = new Property<BigDecimal>("flddecPercentage");
	public static final Property<String> FLDNVC_COMMENTS = new Property<String>("fldnvcComments");
	public static final Property<Date> FLDSDT_COST_ACTUAL_DATE = new Property<Date>("fldsdtCostActualDate");
	public static final Property<Date> FLDSDT_COST_APPROVAL_DATE = new Property<Date>("fldsdtCostApprovalDate");
	public static final Property<Date> FLDSDT_TIME_STAMP = new Property<Date>("fldsdtTimeStamp");
	public static final Property<Integer> TRANS_ID = new Property<Integer>("transId");
	public static final Property<Cost> COST = new Property<Cost>("cost");
	public static final Property<List<WbContractTcCosts>> WB_CONTRACT_TC_COSTSS = new Property<List<WbContractTcCosts>>("wbContractTcCostss");

	public void setContributeToB2b(Boolean contributeToB2b)
	{
		writeProperty("contributeToB2b", contributeToB2b);
	}

	public Boolean getContributeToB2b()
	{
		return (Boolean) readProperty("contributeToB2b");
	}

	public void setFldbolConcurs(Integer fldbolConcurs)
	{
		writeProperty("fldbolConcurs", fldbolConcurs);
	}

	public Integer getFldbolConcurs()
	{
		return (Integer) readProperty("fldbolConcurs");
	}

	public void setFldbolMirror(Integer fldbolMirror)
	{
		writeProperty("fldbolMirror", fldbolMirror);
	}

	public Integer getFldbolMirror()
	{
		return (Integer) readProperty("fldbolMirror");
	}

	public void setFldchrContrKey(String fldchrContrKey)
	{
		writeProperty("fldchrContrKey", fldchrContrKey);
	}

	public String getFldchrContrKey()
	{
		return (String) readProperty("fldchrContrKey");
	}

	public void setFldchrCostActualFlag(String fldchrCostActualFlag)
	{
		writeProperty("fldchrCostActualFlag", fldchrCostActualFlag);
	}

	public String getFldchrCostActualFlag()
	{
		return (String) readProperty("fldchrCostActualFlag");
	}

	public void setFldchrCostApprovalFlag(String fldchrCostApprovalFlag)
	{
		writeProperty("fldchrCostApprovalFlag", fldchrCostApprovalFlag);
	}

	public String getFldchrCostApprovalFlag()
	{
		return (String) readProperty("fldchrCostApprovalFlag");
	}

	public void setFldchrCostAutoFlag(String fldchrCostAutoFlag)
	{
		writeProperty("fldchrCostAutoFlag", fldchrCostAutoFlag);
	}

	public String getFldchrCostAutoFlag()
	{
		return (String) readProperty("fldchrCostAutoFlag");
	}

	public void setFldchrLoctKey(String fldchrLoctKey)
	{
		writeProperty("fldchrLoctKey", fldchrLoctKey);
	}

	public String getFldchrLoctKey()
	{
		return (String) readProperty("fldchrLoctKey");
	}

	public void setFldchrRefMonth(String fldchrRefMonth)
	{
		writeProperty("fldchrRefMonth", fldchrRefMonth);
	}

	public String getFldchrRefMonth()
	{
		return (String) readProperty("fldchrRefMonth");
	}

	public void setFldchrRefYear(String fldchrRefYear)
	{
		writeProperty("fldchrRefYear", fldchrRefYear);
	}

	public String getFldchrRefYear()
	{
		return (String) readProperty("fldchrRefYear");
	}

	public void setFldchrSpotContrKey(String fldchrSpotContrKey)
	{
		writeProperty("fldchrSpotContrKey", fldchrSpotContrKey);
	}

	public String getFldchrSpotContrKey()
	{
		return (String) readProperty("fldchrSpotContrKey");
	}

	public void setFldchrTshDemurrageCost(String fldchrTshDemurrageCost)
	{
		writeProperty("fldchrTshDemurrageCost", fldchrTshDemurrageCost);
	}

	public String getFldchrTshDemurrageCost()
	{
		return (String) readProperty("fldchrTshDemurrageCost");
	}

	public void setFldchrUserName(String fldchrUserName)
	{
		writeProperty("fldchrUserName", fldchrUserName);
	}

	public String getFldchrUserName()
	{
		return (String) readProperty("fldchrUserName");
	}

	public void setFlddecAdjustmentValue(BigDecimal flddecAdjustmentValue)
	{
		writeProperty("flddecAdjustmentValue", flddecAdjustmentValue);
	}

	public BigDecimal getFlddecAdjustmentValue()
	{
		return (BigDecimal) readProperty("flddecAdjustmentValue");
	}

	public void setFlddecGrossAmount(BigDecimal flddecGrossAmount)
	{
		writeProperty("flddecGrossAmount", flddecGrossAmount);
	}

	public BigDecimal getFlddecGrossAmount()
	{
		return (BigDecimal) readProperty("flddecGrossAmount");
	}

	public void setFlddecPercentage(BigDecimal flddecPercentage)
	{
		writeProperty("flddecPercentage", flddecPercentage);
	}

	public BigDecimal getFlddecPercentage()
	{
		return (BigDecimal) readProperty("flddecPercentage");
	}

	public void setFldnvcComments(String fldnvcComments)
	{
		writeProperty("fldnvcComments", fldnvcComments);
	}

	public String getFldnvcComments()
	{
		return (String) readProperty("fldnvcComments");
	}

	public void setFldsdtCostActualDate(Date fldsdtCostActualDate)
	{
		writeProperty("fldsdtCostActualDate", fldsdtCostActualDate);
	}

	public Date getFldsdtCostActualDate()
	{
		return (Date) readProperty("fldsdtCostActualDate");
	}

	public void setFldsdtCostApprovalDate(Date fldsdtCostApprovalDate)
	{
		writeProperty("fldsdtCostApprovalDate", fldsdtCostApprovalDate);
	}

	public Date getFldsdtCostApprovalDate()
	{
		return (Date) readProperty("fldsdtCostApprovalDate");
	}

	public void setFldsdtTimeStamp(Date fldsdtTimeStamp)
	{
		writeProperty("fldsdtTimeStamp", fldsdtTimeStamp);
	}

	public Date getFldsdtTimeStamp()
	{
		return (Date) readProperty("fldsdtTimeStamp");
	}

	public void setTransId(Integer transId)
	{
		writeProperty("transId", transId);
	}

	public Integer getTransId()
	{
		return (Integer) readProperty("transId");
	}

	public void setCost(Cost cost)
	{
		setToOneTarget("cost", cost, true);
	}

	public Cost getCost()
	{
		return (Cost) readProperty("cost");
	}

	public void addToWbContractTcCostss(WbContractTcCosts obj)
	{
		addToManyTarget("wbContractTcCostss", obj, true);
	}

	public void removeFromWbContractTcCostss(WbContractTcCosts obj)
	{
		removeToManyTarget("wbContractTcCostss", obj, true);
	}

	@SuppressWarnings("unchecked")
	public List<WbContractTcCosts> getWbContractTcCostss()
	{
		return (List<WbContractTcCosts>) readProperty("wbContractTcCostss");
	}

}