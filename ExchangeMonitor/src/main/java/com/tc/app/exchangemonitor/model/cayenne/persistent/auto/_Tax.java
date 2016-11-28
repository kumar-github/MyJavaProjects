package com.tc.app.exchangemonitor.model.cayenne.persistent.auto;

import java.util.Date;

import org.apache.cayenne.CayenneDataObject;
import org.apache.cayenne.exp.Property;

import com.tc.app.exchangemonitor.model.cayenne.persistent.Commodity;
import com.tc.app.exchangemonitor.model.cayenne.persistent.MotType;
import com.tc.app.exchangemonitor.model.cayenne.persistent.OrderTypeGrpDesc;
import com.tc.app.exchangemonitor.model.cayenne.persistent.Uom;

/**
 * Class _Tax was generated by Cayenne.
 * It is probably a good idea to avoid changing this class manually,
 * since it may be overwritten next time code is regenerated.
 * If you need to make any customizations, please use subclass.
 */
public abstract class _Tax extends CayenneDataObject
{

	private static final long serialVersionUID = 1L;

	public static final String TAX_NUM_PK_COLUMN = "tax_num";

	public static final Property<String> OVERRIDE_EXEMPTIONS_IND = new Property<String>("overrideExemptionsInd");
	public static final Property<String> OVERRIDE_PASS_THROUGH_IND = new Property<String>("overridePassThroughInd");
	public static final Property<Integer> TAX_AUTHORITY_NUM = new Property<Integer>("taxAuthorityNum");
	public static final Property<String> TAX_CALC_IND = new Property<String>("taxCalcInd");
	public static final Property<Date> TAX_EFF_DATE = new Property<Date>("taxEffDate");
	public static final Property<Date> TAX_EXP_DATE = new Property<Date>("taxExpDate");
	public static final Property<String> TAX_EXPORTS_IND = new Property<String>("taxExportsInd");
	public static final Property<String> TAX_FLAT_FEE_BASIS = new Property<String>("taxFlatFeeBasis");
	public static final Property<String> TAX_GROSS_NET_IND = new Property<String>("taxGrossNetInd");
	public static final Property<String> TAX_TIERED_IND = new Property<String>("taxTieredInd");
	public static final Property<Integer> TRANS_ID = new Property<Integer>("transId");
	public static final Property<String> USE_ADDITIONAL_PRIMARY_IND = new Property<String>("useAdditionalPrimaryInd");
	public static final Property<Commodity> COMMODITY = new Property<Commodity>("commodity");
	public static final Property<Commodity> COMMODITY1 = new Property<Commodity>("commodity1");
	public static final Property<Commodity> COMMODITY2 = new Property<Commodity>("commodity2");
	public static final Property<MotType> MOT_TYPE = new Property<MotType>("motType");
	public static final Property<OrderTypeGrpDesc> ORDER_TYPE_GRP_DESC = new Property<OrderTypeGrpDesc>("orderTypeGrpDesc");
	public static final Property<Uom> UOM = new Property<Uom>("uom");
	public static final Property<Uom> UOM1 = new Property<Uom>("uom1");

	public void setOverrideExemptionsInd(String overrideExemptionsInd)
	{
		writeProperty("overrideExemptionsInd", overrideExemptionsInd);
	}

	public String getOverrideExemptionsInd()
	{
		return (String) readProperty("overrideExemptionsInd");
	}

	public void setOverridePassThroughInd(String overridePassThroughInd)
	{
		writeProperty("overridePassThroughInd", overridePassThroughInd);
	}

	public String getOverridePassThroughInd()
	{
		return (String) readProperty("overridePassThroughInd");
	}

	public void setTaxAuthorityNum(Integer taxAuthorityNum)
	{
		writeProperty("taxAuthorityNum", taxAuthorityNum);
	}

	public Integer getTaxAuthorityNum()
	{
		return (Integer) readProperty("taxAuthorityNum");
	}

	public void setTaxCalcInd(String taxCalcInd)
	{
		writeProperty("taxCalcInd", taxCalcInd);
	}

	public String getTaxCalcInd()
	{
		return (String) readProperty("taxCalcInd");
	}

	public void setTaxEffDate(Date taxEffDate)
	{
		writeProperty("taxEffDate", taxEffDate);
	}

	public Date getTaxEffDate()
	{
		return (Date) readProperty("taxEffDate");
	}

	public void setTaxExpDate(Date taxExpDate)
	{
		writeProperty("taxExpDate", taxExpDate);
	}

	public Date getTaxExpDate()
	{
		return (Date) readProperty("taxExpDate");
	}

	public void setTaxExportsInd(String taxExportsInd)
	{
		writeProperty("taxExportsInd", taxExportsInd);
	}

	public String getTaxExportsInd()
	{
		return (String) readProperty("taxExportsInd");
	}

	public void setTaxFlatFeeBasis(String taxFlatFeeBasis)
	{
		writeProperty("taxFlatFeeBasis", taxFlatFeeBasis);
	}

	public String getTaxFlatFeeBasis()
	{
		return (String) readProperty("taxFlatFeeBasis");
	}

	public void setTaxGrossNetInd(String taxGrossNetInd)
	{
		writeProperty("taxGrossNetInd", taxGrossNetInd);
	}

	public String getTaxGrossNetInd()
	{
		return (String) readProperty("taxGrossNetInd");
	}

	public void setTaxTieredInd(String taxTieredInd)
	{
		writeProperty("taxTieredInd", taxTieredInd);
	}

	public String getTaxTieredInd()
	{
		return (String) readProperty("taxTieredInd");
	}

	public void setTransId(Integer transId)
	{
		writeProperty("transId", transId);
	}

	public Integer getTransId()
	{
		return (Integer) readProperty("transId");
	}

	public void setUseAdditionalPrimaryInd(String useAdditionalPrimaryInd)
	{
		writeProperty("useAdditionalPrimaryInd", useAdditionalPrimaryInd);
	}

	public String getUseAdditionalPrimaryInd()
	{
		return (String) readProperty("useAdditionalPrimaryInd");
	}

	public void setCommodity(Commodity commodity)
	{
		setToOneTarget("commodity", commodity, true);
	}

	public Commodity getCommodity()
	{
		return (Commodity) readProperty("commodity");
	}

	public void setCommodity1(Commodity commodity1)
	{
		setToOneTarget("commodity1", commodity1, true);
	}

	public Commodity getCommodity1()
	{
		return (Commodity) readProperty("commodity1");
	}

	public void setCommodity2(Commodity commodity2)
	{
		setToOneTarget("commodity2", commodity2, true);
	}

	public Commodity getCommodity2()
	{
		return (Commodity) readProperty("commodity2");
	}

	public void setMotType(MotType motType)
	{
		setToOneTarget("motType", motType, true);
	}

	public MotType getMotType()
	{
		return (MotType) readProperty("motType");
	}

	public void setOrderTypeGrpDesc(OrderTypeGrpDesc orderTypeGrpDesc)
	{
		setToOneTarget("orderTypeGrpDesc", orderTypeGrpDesc, true);
	}

	public OrderTypeGrpDesc getOrderTypeGrpDesc()
	{
		return (OrderTypeGrpDesc) readProperty("orderTypeGrpDesc");
	}

	public void setUom(Uom uom)
	{
		setToOneTarget("uom", uom, true);
	}

	public Uom getUom()
	{
		return (Uom) readProperty("uom");
	}

	public void setUom1(Uom uom1)
	{
		setToOneTarget("uom1", uom1, true);
	}

	public Uom getUom1()
	{
		return (Uom) readProperty("uom1");
	}

}