package com.tc.app.exchangemonitor.model.cayenne.persistent.auto;

import java.util.Date;

import org.apache.cayenne.CayenneDataObject;
import org.apache.cayenne.exp.Property;

import com.tc.app.exchangemonitor.model.cayenne.persistent.FeedDetailData;

/**
 * Class _MsiInboundActual was generated by Cayenne.
 * It is probably a good idea to avoid changing this class manually,
 * since it may be overwritten next time code is regenerated.
 * If you need to make any customizations, please use subclass.
 */
public abstract class _MsiInboundActual extends CayenneDataObject
{

	private static final long serialVersionUID = 1L;

	public static final Property<String> ACTUAL_CANCEL_IND = new Property<String>("actualCancelInd");
	public static final Property<Date> ACTUAL_DATE = new Property<Date>("actualDate");
	public static final Property<Double> ACTUAL_DENSITY = new Property<Double>("actualDensity");
	public static final Property<Date> ACTUAL_POSTING_DATE = new Property<Date>("actualPostingDate");
	public static final Property<Double> PRICE_QUANT = new Property<Double>("priceQuant");
	public static final Property<String> PRICE_UOM = new Property<String>("priceUom");
	public static final Property<String> PS_IND = new Property<String>("psInd");
	public static final Property<Double> SALES_QUANT = new Property<Double>("salesQuant");
	public static final Property<String> SALES_UOM = new Property<String>("salesUom");
	public static final Property<String> SAP_DELIVERY_NUM = new Property<String>("sapDeliveryNum");
	public static final Property<String> SAP_ORDER_NUM = new Property<String>("sapOrderNum");
	public static final Property<String> SAP_POSITION_NUM = new Property<String>("sapPositionNum");
	public static final Property<String> SAP_SHIPMENT_NUM = new Property<String>("sapShipmentNum");
	public static final Property<String> SYMPHONY_PARCEL_NUM = new Property<String>("symphonyParcelNum");
	public static final Property<String> SYMPHONY_SHIP_NUM = new Property<String>("symphonyShipNum");
	public static final Property<String> SYMPHONY_TOI = new Property<String>("symphonyToi");
	public static final Property<Integer> TRANS_ID = new Property<Integer>("transId");
	public static final Property<FeedDetailData> FDD = new Property<FeedDetailData>("fdd");

	public void setActualCancelInd(String actualCancelInd)
	{
		writeProperty("actualCancelInd", actualCancelInd);
	}

	public String getActualCancelInd()
	{
		return (String) readProperty("actualCancelInd");
	}

	public void setActualDate(Date actualDate)
	{
		writeProperty("actualDate", actualDate);
	}

	public Date getActualDate()
	{
		return (Date) readProperty("actualDate");
	}

	public void setActualDensity(Double actualDensity)
	{
		writeProperty("actualDensity", actualDensity);
	}

	public Double getActualDensity()
	{
		return (Double) readProperty("actualDensity");
	}

	public void setActualPostingDate(Date actualPostingDate)
	{
		writeProperty("actualPostingDate", actualPostingDate);
	}

	public Date getActualPostingDate()
	{
		return (Date) readProperty("actualPostingDate");
	}

	public void setPriceQuant(Double priceQuant)
	{
		writeProperty("priceQuant", priceQuant);
	}

	public Double getPriceQuant()
	{
		return (Double) readProperty("priceQuant");
	}

	public void setPriceUom(String priceUom)
	{
		writeProperty("priceUom", priceUom);
	}

	public String getPriceUom()
	{
		return (String) readProperty("priceUom");
	}

	public void setPsInd(String psInd)
	{
		writeProperty("psInd", psInd);
	}

	public String getPsInd()
	{
		return (String) readProperty("psInd");
	}

	public void setSalesQuant(Double salesQuant)
	{
		writeProperty("salesQuant", salesQuant);
	}

	public Double getSalesQuant()
	{
		return (Double) readProperty("salesQuant");
	}

	public void setSalesUom(String salesUom)
	{
		writeProperty("salesUom", salesUom);
	}

	public String getSalesUom()
	{
		return (String) readProperty("salesUom");
	}

	public void setSapDeliveryNum(String sapDeliveryNum)
	{
		writeProperty("sapDeliveryNum", sapDeliveryNum);
	}

	public String getSapDeliveryNum()
	{
		return (String) readProperty("sapDeliveryNum");
	}

	public void setSapOrderNum(String sapOrderNum)
	{
		writeProperty("sapOrderNum", sapOrderNum);
	}

	public String getSapOrderNum()
	{
		return (String) readProperty("sapOrderNum");
	}

	public void setSapPositionNum(String sapPositionNum)
	{
		writeProperty("sapPositionNum", sapPositionNum);
	}

	public String getSapPositionNum()
	{
		return (String) readProperty("sapPositionNum");
	}

	public void setSapShipmentNum(String sapShipmentNum)
	{
		writeProperty("sapShipmentNum", sapShipmentNum);
	}

	public String getSapShipmentNum()
	{
		return (String) readProperty("sapShipmentNum");
	}

	public void setSymphonyParcelNum(String symphonyParcelNum)
	{
		writeProperty("symphonyParcelNum", symphonyParcelNum);
	}

	public String getSymphonyParcelNum()
	{
		return (String) readProperty("symphonyParcelNum");
	}

	public void setSymphonyShipNum(String symphonyShipNum)
	{
		writeProperty("symphonyShipNum", symphonyShipNum);
	}

	public String getSymphonyShipNum()
	{
		return (String) readProperty("symphonyShipNum");
	}

	public void setSymphonyToi(String symphonyToi)
	{
		writeProperty("symphonyToi", symphonyToi);
	}

	public String getSymphonyToi()
	{
		return (String) readProperty("symphonyToi");
	}

	public void setTransId(Integer transId)
	{
		writeProperty("transId", transId);
	}

	public Integer getTransId()
	{
		return (Integer) readProperty("transId");
	}

	public void setFdd(FeedDetailData fdd)
	{
		setToOneTarget("fdd", fdd, true);
	}

	public FeedDetailData getFdd()
	{
		return (FeedDetailData) readProperty("fdd");
	}

}