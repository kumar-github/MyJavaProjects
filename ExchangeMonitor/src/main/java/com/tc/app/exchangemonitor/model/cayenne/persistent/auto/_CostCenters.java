package com.tc.app.exchangemonitor.model.cayenne.persistent.auto;

import java.util.List;

import org.apache.cayenne.CayenneDataObject;
import org.apache.cayenne.exp.Property;

import com.tc.app.exchangemonitor.model.cayenne.persistent.Channel;
import com.tc.app.exchangemonitor.model.cayenne.persistent.LocationCostCenters;

/**
 * Class _CostCenters was generated by Cayenne.
 * It is probably a good idea to avoid changing this class manually,
 * since it may be overwritten next time code is regenerated.
 * If you need to make any customizations, please use subclass.
 */
public abstract class _CostCenters extends CayenneDataObject
{

	private static final long serialVersionUID = 1L;

	public static final String FLDCHR_COST_CENTER_CODE_PK_COLUMN = "fldchrCostCenterCode";

	public static final Property<String> FLDVCH_COST_CENTER_DESC = new Property<>("fldvchCostCenterDesc");
	public static final Property<Integer> TRANS_ID = new Property<>("transId");
	public static final Property<Channel> CHANNEL = new Property<>("channel");
	public static final Property<List<LocationCostCenters>> LOCATION_COST_CENTERSS = new Property<>("locationCostCenterss");

	public void setFldvchCostCenterDesc(final String fldvchCostCenterDesc)
	{
		this.writeProperty("fldvchCostCenterDesc", fldvchCostCenterDesc);
	}

	public String getFldvchCostCenterDesc()
	{
		return (String) this.readProperty("fldvchCostCenterDesc");
	}

	public void setTransId(final Integer transId)
	{
		this.writeProperty("transId", transId);
	}

	public Integer getTransId()
	{
		return (Integer) this.readProperty("transId");
	}

	public void setChannel(final Channel channel)
	{
		this.setToOneTarget("channel", channel, true);
	}

	public Channel getChannel()
	{
		return (Channel) this.readProperty("channel");
	}

	public void addToLocationCostCenterss(final LocationCostCenters obj)
	{
		this.addToManyTarget("locationCostCenterss", obj, true);
	}

	public void removeFromLocationCostCenterss(final LocationCostCenters obj)
	{
		this.removeToManyTarget("locationCostCenterss", obj, true);
	}

	@SuppressWarnings("unchecked")
	public List<LocationCostCenters> getLocationCostCenterss()
	{
		return (List<LocationCostCenters>) this.readProperty("locationCostCenterss");
	}

}
