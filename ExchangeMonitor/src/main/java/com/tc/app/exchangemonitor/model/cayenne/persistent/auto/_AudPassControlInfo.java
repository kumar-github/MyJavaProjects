package com.tc.app.exchangemonitor.model.cayenne.persistent.auto;

import org.apache.cayenne.CayenneDataObject;
import org.apache.cayenne.exp.Property;

/**
 * Class _AudPassControlInfo was generated by Cayenne.
 * It is probably a good idea to avoid changing this class manually,
 * since it may be overwritten next time code is regenerated.
 * If you need to make any customizations, please use subclass.
 */
public abstract class _AudPassControlInfo extends CayenneDataObject
{

	private static final long serialVersionUID = 1L;

	public static final Property<Integer> PASS_CONTROL_ID = new Property<Integer>("passControlId");
	public static final Property<String> PASS_CONTROL_VAL1 = new Property<String>("passControlVal1");
	public static final Property<String> PASS_CONTROL_VAL2 = new Property<String>("passControlVal2");
	public static final Property<String> PASS_CONTROL_VAL3 = new Property<String>("passControlVal3");
	public static final Property<String> PASS_CONTROL_VAL4 = new Property<String>("passControlVal4");
	public static final Property<String> PASS_CONTROL_VAL5 = new Property<String>("passControlVal5");
	public static final Property<String> PASS_CONTROL_VAL6 = new Property<String>("passControlVal6");
	public static final Property<Integer> RESP_TRANS_ID = new Property<Integer>("respTransId");
	public static final Property<Integer> TRANS_ID = new Property<Integer>("transId");

	public void setPassControlId(Integer passControlId)
	{
		writeProperty("passControlId", passControlId);
	}

	public Integer getPassControlId()
	{
		return (Integer) readProperty("passControlId");
	}

	public void setPassControlVal1(String passControlVal1)
	{
		writeProperty("passControlVal1", passControlVal1);
	}

	public String getPassControlVal1()
	{
		return (String) readProperty("passControlVal1");
	}

	public void setPassControlVal2(String passControlVal2)
	{
		writeProperty("passControlVal2", passControlVal2);
	}

	public String getPassControlVal2()
	{
		return (String) readProperty("passControlVal2");
	}

	public void setPassControlVal3(String passControlVal3)
	{
		writeProperty("passControlVal3", passControlVal3);
	}

	public String getPassControlVal3()
	{
		return (String) readProperty("passControlVal3");
	}

	public void setPassControlVal4(String passControlVal4)
	{
		writeProperty("passControlVal4", passControlVal4);
	}

	public String getPassControlVal4()
	{
		return (String) readProperty("passControlVal4");
	}

	public void setPassControlVal5(String passControlVal5)
	{
		writeProperty("passControlVal5", passControlVal5);
	}

	public String getPassControlVal5()
	{
		return (String) readProperty("passControlVal5");
	}

	public void setPassControlVal6(String passControlVal6)
	{
		writeProperty("passControlVal6", passControlVal6);
	}

	public String getPassControlVal6()
	{
		return (String) readProperty("passControlVal6");
	}

	public void setRespTransId(Integer respTransId)
	{
		writeProperty("respTransId", respTransId);
	}

	public Integer getRespTransId()
	{
		return (Integer) readProperty("respTransId");
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
