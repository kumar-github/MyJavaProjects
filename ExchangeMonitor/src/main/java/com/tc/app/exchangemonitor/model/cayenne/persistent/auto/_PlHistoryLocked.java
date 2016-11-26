package com.tc.app.exchangemonitor.model.cayenne.persistent.auto;

import java.math.BigDecimal;
import java.util.Date;

import org.apache.cayenne.CayenneDataObject;
import org.apache.cayenne.exp.Property;

/**
 * Class _PlHistoryLocked was generated by Cayenne.
 * It is probably a good idea to avoid changing this class manually,
 * since it may be overwritten next time code is regenerated.
 * If you need to make any customizations, please use subclass.
 */
public abstract class _PlHistoryLocked extends CayenneDataObject
{

	private static final long serialVersionUID = 1L;

	public static final Property<Double> CURRENCY_FX_RATE = new Property<Double>("currencyFxRate");
	public static final Property<Double> PL_AMT = new Property<Double>("plAmt");
	public static final Property<Date> PL_ASOF_DATE = new Property<Date>("plAsofDate");
	public static final Property<String> PL_CATEGORY_TYPE = new Property<String>("plCategoryType");
	public static final Property<String> PL_COST_PRIN_ADDL_IND = new Property<String>("plCostPrinAddlInd");
	public static final Property<String> PL_COST_STATUS_CODE = new Property<String>("plCostStatusCode");
	public static final Property<Double> PL_MKT_PRICE = new Property<Double>("plMktPrice");
	public static final Property<String> PL_OWNER_CODE = new Property<String>("plOwnerCode");
	public static final Property<String> PL_OWNER_SUB_CODE = new Property<String>("plOwnerSubCode");
	public static final Property<Integer> PL_PRIMARY_OWNER_KEY1 = new Property<Integer>("plPrimaryOwnerKey1");
	public static final Property<Integer> PL_PRIMARY_OWNER_KEY2 = new Property<Integer>("plPrimaryOwnerKey2");
	public static final Property<Integer> PL_PRIMARY_OWNER_KEY3 = new Property<Integer>("plPrimaryOwnerKey3");
	public static final Property<Integer> PL_PRIMARY_OWNER_KEY4 = new Property<Integer>("plPrimaryOwnerKey4");
	public static final Property<Date> PL_REALIZATION_DATE = new Property<Date>("plRealizationDate");
	public static final Property<Integer> PL_RECORD_KEY = new Property<Integer>("plRecordKey");
	public static final Property<Integer> PL_RECORD_OWNER_KEY = new Property<Integer>("plRecordOwnerKey");
	public static final Property<BigDecimal> PL_RECORD_QTY = new Property<BigDecimal>("plRecordQty");
	public static final Property<String> PL_RECORD_QTY_UOM_CODE = new Property<String>("plRecordQtyUomCode");
	public static final Property<Integer> PL_SECONDARY_OWNER_KEY1 = new Property<Integer>("plSecondaryOwnerKey1");
	public static final Property<Integer> PL_SECONDARY_OWNER_KEY2 = new Property<Integer>("plSecondaryOwnerKey2");
	public static final Property<Integer> PL_SECONDARY_OWNER_KEY3 = new Property<Integer>("plSecondaryOwnerKey3");
	public static final Property<String> PL_TYPE = new Property<String>("plType");
	public static final Property<Integer> POS_NUM = new Property<Integer>("posNum");
	public static final Property<Integer> REAL_PORT_NUM = new Property<Integer>("realPortNum");
	public static final Property<Integer> TRANS_ID = new Property<Integer>("transId");

	public void setCurrencyFxRate(Double currencyFxRate)
	{
		writeProperty("currencyFxRate", currencyFxRate);
	}

	public Double getCurrencyFxRate()
	{
		return (Double) readProperty("currencyFxRate");
	}

	public void setPlAmt(Double plAmt)
	{
		writeProperty("plAmt", plAmt);
	}

	public Double getPlAmt()
	{
		return (Double) readProperty("plAmt");
	}

	public void setPlAsofDate(Date plAsofDate)
	{
		writeProperty("plAsofDate", plAsofDate);
	}

	public Date getPlAsofDate()
	{
		return (Date) readProperty("plAsofDate");
	}

	public void setPlCategoryType(String plCategoryType)
	{
		writeProperty("plCategoryType", plCategoryType);
	}

	public String getPlCategoryType()
	{
		return (String) readProperty("plCategoryType");
	}

	public void setPlCostPrinAddlInd(String plCostPrinAddlInd)
	{
		writeProperty("plCostPrinAddlInd", plCostPrinAddlInd);
	}

	public String getPlCostPrinAddlInd()
	{
		return (String) readProperty("plCostPrinAddlInd");
	}

	public void setPlCostStatusCode(String plCostStatusCode)
	{
		writeProperty("plCostStatusCode", plCostStatusCode);
	}

	public String getPlCostStatusCode()
	{
		return (String) readProperty("plCostStatusCode");
	}

	public void setPlMktPrice(Double plMktPrice)
	{
		writeProperty("plMktPrice", plMktPrice);
	}

	public Double getPlMktPrice()
	{
		return (Double) readProperty("plMktPrice");
	}

	public void setPlOwnerCode(String plOwnerCode)
	{
		writeProperty("plOwnerCode", plOwnerCode);
	}

	public String getPlOwnerCode()
	{
		return (String) readProperty("plOwnerCode");
	}

	public void setPlOwnerSubCode(String plOwnerSubCode)
	{
		writeProperty("plOwnerSubCode", plOwnerSubCode);
	}

	public String getPlOwnerSubCode()
	{
		return (String) readProperty("plOwnerSubCode");
	}

	public void setPlPrimaryOwnerKey1(Integer plPrimaryOwnerKey1)
	{
		writeProperty("plPrimaryOwnerKey1", plPrimaryOwnerKey1);
	}

	public Integer getPlPrimaryOwnerKey1()
	{
		return (Integer) readProperty("plPrimaryOwnerKey1");
	}

	public void setPlPrimaryOwnerKey2(Integer plPrimaryOwnerKey2)
	{
		writeProperty("plPrimaryOwnerKey2", plPrimaryOwnerKey2);
	}

	public Integer getPlPrimaryOwnerKey2()
	{
		return (Integer) readProperty("plPrimaryOwnerKey2");
	}

	public void setPlPrimaryOwnerKey3(Integer plPrimaryOwnerKey3)
	{
		writeProperty("plPrimaryOwnerKey3", plPrimaryOwnerKey3);
	}

	public Integer getPlPrimaryOwnerKey3()
	{
		return (Integer) readProperty("plPrimaryOwnerKey3");
	}

	public void setPlPrimaryOwnerKey4(Integer plPrimaryOwnerKey4)
	{
		writeProperty("plPrimaryOwnerKey4", plPrimaryOwnerKey4);
	}

	public Integer getPlPrimaryOwnerKey4()
	{
		return (Integer) readProperty("plPrimaryOwnerKey4");
	}

	public void setPlRealizationDate(Date plRealizationDate)
	{
		writeProperty("plRealizationDate", plRealizationDate);
	}

	public Date getPlRealizationDate()
	{
		return (Date) readProperty("plRealizationDate");
	}

	public void setPlRecordKey(Integer plRecordKey)
	{
		writeProperty("plRecordKey", plRecordKey);
	}

	public Integer getPlRecordKey()
	{
		return (Integer) readProperty("plRecordKey");
	}

	public void setPlRecordOwnerKey(Integer plRecordOwnerKey)
	{
		writeProperty("plRecordOwnerKey", plRecordOwnerKey);
	}

	public Integer getPlRecordOwnerKey()
	{
		return (Integer) readProperty("plRecordOwnerKey");
	}

	public void setPlRecordQty(BigDecimal plRecordQty)
	{
		writeProperty("plRecordQty", plRecordQty);
	}

	public BigDecimal getPlRecordQty()
	{
		return (BigDecimal) readProperty("plRecordQty");
	}

	public void setPlRecordQtyUomCode(String plRecordQtyUomCode)
	{
		writeProperty("plRecordQtyUomCode", plRecordQtyUomCode);
	}

	public String getPlRecordQtyUomCode()
	{
		return (String) readProperty("plRecordQtyUomCode");
	}

	public void setPlSecondaryOwnerKey1(Integer plSecondaryOwnerKey1)
	{
		writeProperty("plSecondaryOwnerKey1", plSecondaryOwnerKey1);
	}

	public Integer getPlSecondaryOwnerKey1()
	{
		return (Integer) readProperty("plSecondaryOwnerKey1");
	}

	public void setPlSecondaryOwnerKey2(Integer plSecondaryOwnerKey2)
	{
		writeProperty("plSecondaryOwnerKey2", plSecondaryOwnerKey2);
	}

	public Integer getPlSecondaryOwnerKey2()
	{
		return (Integer) readProperty("plSecondaryOwnerKey2");
	}

	public void setPlSecondaryOwnerKey3(Integer plSecondaryOwnerKey3)
	{
		writeProperty("plSecondaryOwnerKey3", plSecondaryOwnerKey3);
	}

	public Integer getPlSecondaryOwnerKey3()
	{
		return (Integer) readProperty("plSecondaryOwnerKey3");
	}

	public void setPlType(String plType)
	{
		writeProperty("plType", plType);
	}

	public String getPlType()
	{
		return (String) readProperty("plType");
	}

	public void setPosNum(Integer posNum)
	{
		writeProperty("posNum", posNum);
	}

	public Integer getPosNum()
	{
		return (Integer) readProperty("posNum");
	}

	public void setRealPortNum(Integer realPortNum)
	{
		writeProperty("realPortNum", realPortNum);
	}

	public Integer getRealPortNum()
	{
		return (Integer) readProperty("realPortNum");
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
