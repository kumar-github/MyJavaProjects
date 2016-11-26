package com.tc.app.exchangemonitor.model.cayenne.persistent.auto;

import java.util.List;

import org.apache.cayenne.CayenneDataObject;
import org.apache.cayenne.exp.Property;

import com.tc.app.exchangemonitor.model.cayenne.persistent.AccountInstruction;

/**
 * Class _ConfirmMethod was generated by Cayenne.
 * It is probably a good idea to avoid changing this class manually,
 * since it may be overwritten next time code is regenerated.
 * If you need to make any customizations, please use subclass.
 */
public abstract class _ConfirmMethod extends CayenneDataObject
{

	private static final long serialVersionUID = 1L;

	public static final String OID_PK_COLUMN = "oid";

	public static final Property<String> CONFIRM_METHOD_NAME = new Property<String>("confirmMethodName");
	public static final Property<Integer> TRANS_ID = new Property<Integer>("transId");
	public static final Property<List<AccountInstruction>> ACCOUNT_INSTRUCTIONS = new Property<List<AccountInstruction>>("accountInstructions");

	public void setConfirmMethodName(String confirmMethodName)
	{
		writeProperty("confirmMethodName", confirmMethodName);
	}

	public String getConfirmMethodName()
	{
		return (String) readProperty("confirmMethodName");
	}

	public void setTransId(Integer transId)
	{
		writeProperty("transId", transId);
	}

	public Integer getTransId()
	{
		return (Integer) readProperty("transId");
	}

	public void addToAccountInstructions(AccountInstruction obj)
	{
		addToManyTarget("accountInstructions", obj, true);
	}

	public void removeFromAccountInstructions(AccountInstruction obj)
	{
		removeToManyTarget("accountInstructions", obj, true);
	}

	@SuppressWarnings("unchecked")
	public List<AccountInstruction> getAccountInstructions()
	{
		return (List<AccountInstruction>) readProperty("accountInstructions");
	}

}
