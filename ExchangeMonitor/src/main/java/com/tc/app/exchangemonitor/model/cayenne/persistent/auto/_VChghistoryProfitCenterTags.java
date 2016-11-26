package com.tc.app.exchangemonitor.model.cayenne.persistent.auto;

import org.apache.cayenne.CayenneDataObject;
import org.apache.cayenne.exp.Property;

/**
 * Class _VChghistoryProfitCenterTags was generated by Cayenne.
 * It is probably a good idea to avoid changing this class manually,
 * since it may be overwritten next time code is regenerated.
 * If you need to make any customizations, please use subclass.
 */
public abstract class _VChghistoryProfitCenterTags extends CayenneDataObject
{

	private static final long serialVersionUID = 1L;

	public static final Property<String> PROFIT_CENTER = new Property<String>("profitCenter");
	public static final Property<Integer> REAL_PORT_NUM = new Property<Integer>("realPortNum");

	public void setProfitCenter(String profitCenter)
	{
		writeProperty("profitCenter", profitCenter);
	}

	public String getProfitCenter()
	{
		return (String) readProperty("profitCenter");
	}

	public void setRealPortNum(Integer realPortNum)
	{
		writeProperty("realPortNum", realPortNum);
	}

	public Integer getRealPortNum()
	{
		return (Integer) readProperty("realPortNum");
	}

}
