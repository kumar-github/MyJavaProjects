package com.tc.app.exchangemonitor.model.cayenne.persistent.auto;

import org.apache.cayenne.CayenneDataObject;
import org.apache.cayenne.exp.Property;

/**
 * Class _PortfolioGroup was generated by Cayenne.
 * It is probably a good idea to avoid changing this class manually,
 * since it may be overwritten next time code is regenerated.
 * If you need to make any customizations, please use subclass.
 */
public abstract class _PortfolioGroup extends CayenneDataObject
{

	private static final long serialVersionUID = 1L;

	public static final String PARENT_PORT_NUM_PK_COLUMN = "parent_port_num";
	public static final String PORT_NUM_PK_COLUMN = "port_num";

	public static final Property<String> IS_LINK_IND = new Property<String>("isLinkInd");
	public static final Property<Integer> TRANS_ID = new Property<Integer>("transId");

	public void setIsLinkInd(String isLinkInd)
	{
		writeProperty("isLinkInd", isLinkInd);
	}

	public String getIsLinkInd()
	{
		return (String) readProperty("isLinkInd");
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
