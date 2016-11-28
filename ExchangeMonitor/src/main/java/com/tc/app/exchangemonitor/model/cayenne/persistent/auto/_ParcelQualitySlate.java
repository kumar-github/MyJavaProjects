package com.tc.app.exchangemonitor.model.cayenne.persistent.auto;

import org.apache.cayenne.CayenneDataObject;
import org.apache.cayenne.exp.Property;

import com.tc.app.exchangemonitor.model.cayenne.persistent.QualitySlate;

/**
 * Class _ParcelQualitySlate was generated by Cayenne.
 * It is probably a good idea to avoid changing this class manually,
 * since it may be overwritten next time code is regenerated.
 * If you need to make any customizations, please use subclass.
 */
public abstract class _ParcelQualitySlate extends CayenneDataObject
{

	private static final long serialVersionUID = 1L;

	public static final String OID_PK_COLUMN = "oid";

	public static final Property<Integer> PARCEL_ID = new Property<Integer>("parcelId");
	public static final Property<Integer> TRANS_ID = new Property<Integer>("transId");
	public static final Property<QualitySlate> QUALITY_SLATE = new Property<QualitySlate>("qualitySlate");

	public void setParcelId(Integer parcelId)
	{
		writeProperty("parcelId", parcelId);
	}

	public Integer getParcelId()
	{
		return (Integer) readProperty("parcelId");
	}

	public void setTransId(Integer transId)
	{
		writeProperty("transId", transId);
	}

	public Integer getTransId()
	{
		return (Integer) readProperty("transId");
	}

	public void setQualitySlate(QualitySlate qualitySlate)
	{
		setToOneTarget("qualitySlate", qualitySlate, true);
	}

	public QualitySlate getQualitySlate()
	{
		return (QualitySlate) readProperty("qualitySlate");
	}

}