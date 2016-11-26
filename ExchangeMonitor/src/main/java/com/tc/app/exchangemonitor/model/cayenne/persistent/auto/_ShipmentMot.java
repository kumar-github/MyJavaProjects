package com.tc.app.exchangemonitor.model.cayenne.persistent.auto;

import org.apache.cayenne.CayenneDataObject;
import org.apache.cayenne.exp.Property;

/**
 * Class _ShipmentMot was generated by Cayenne.
 * It is probably a good idea to avoid changing this class manually,
 * since it may be overwritten next time code is regenerated.
 * If you need to make any customizations, please use subclass.
 */
public abstract class _ShipmentMot extends CayenneDataObject
{

	private static final long serialVersionUID = 1L;

	public static final String MOT_CODE_PK_COLUMN = "mot_code";
	public static final String SHIPMENT_NUM_PK_COLUMN = "shipment_num";

	public static final Property<Integer> TRANS_ID = new Property<Integer>("transId");

	public void setTransId(Integer transId)
	{
		writeProperty("transId", transId);
	}

	public Integer getTransId()
	{
		return (Integer) readProperty("transId");
	}

}
