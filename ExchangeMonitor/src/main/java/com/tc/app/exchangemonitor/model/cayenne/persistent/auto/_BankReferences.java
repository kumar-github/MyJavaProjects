package com.tc.app.exchangemonitor.model.cayenne.persistent.auto;

import org.apache.cayenne.CayenneDataObject;
import org.apache.cayenne.exp.Property;

/**
 * Class _BankReferences was generated by Cayenne.
 * It is probably a good idea to avoid changing this class manually,
 * since it may be overwritten next time code is regenerated.
 * If you need to make any customizations, please use subclass.
 */
public abstract class _BankReferences extends CayenneDataObject
{

	private static final long serialVersionUID = 1L;

	public static final String FLDCHR_REC_ID_PK_COLUMN = "fldchrRecId";

	public static final Property<String> FLDCHR_BANK_ABI_CAB = new Property<String>("fldchrBankAbiCab");
	public static final Property<String> FLDCHR_BANK_DESCRIPTION = new Property<String>("fldchrBankDescription");
	public static final Property<String> FLDCHR_BANK_REF_ACCOUNT = new Property<String>("fldchrBankRefAccount");

	public void setFldchrBankAbiCab(String fldchrBankAbiCab)
	{
		writeProperty("fldchrBankAbiCab", fldchrBankAbiCab);
	}

	public String getFldchrBankAbiCab()
	{
		return (String) readProperty("fldchrBankAbiCab");
	}

	public void setFldchrBankDescription(String fldchrBankDescription)
	{
		writeProperty("fldchrBankDescription", fldchrBankDescription);
	}

	public String getFldchrBankDescription()
	{
		return (String) readProperty("fldchrBankDescription");
	}

	public void setFldchrBankRefAccount(String fldchrBankRefAccount)
	{
		writeProperty("fldchrBankRefAccount", fldchrBankRefAccount);
	}

	public String getFldchrBankRefAccount()
	{
		return (String) readProperty("fldchrBankRefAccount");
	}

}
