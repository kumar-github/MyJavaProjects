package com.tc.app.exchangemonitor.model.cayenne.persistent.auto;

import org.apache.cayenne.CayenneDataObject;
import org.apache.cayenne.exp.Property;

/**
 * Class _Structure was generated by Cayenne.
 * It is probably a good idea to avoid changing this class manually,
 * since it may be overwritten next time code is regenerated.
 * If you need to make any customizations, please use subclass.
 */
public abstract class _Structure extends CayenneDataObject
{

	private static final long serialVersionUID = 1L;

	public static final String FLDCHR_REC_ID_PK_COLUMN = "fldchrRecId";

	public static final Property<Integer> FLDINT_LENGHT = new Property<Integer>("fldintLenght");
	public static final Property<Short> FLDSMI_DATA_TYPE = new Property<Short>("fldsmiDataType");
	public static final Property<Short> FLDSMI_PROG = new Property<Short>("fldsmiProg");
	public static final Property<Short> FLDTIN_IS_KEY = new Property<Short>("fldtinIsKey");
	public static final Property<Short> FLDTIN_IS_NULLABLE = new Property<Short>("fldtinIsNullable");
	public static final Property<String> FLDVCH_COLUMN_NAME = new Property<String>("fldvchColumnName");
	public static final Property<String> FLDVCH_COMMENT = new Property<String>("fldvchComment");
	public static final Property<String> FLDVCH_TABLE_NAME = new Property<String>("fldvchTableName");
	public static final Property<Integer> TRANS_ID = new Property<Integer>("transId");

	public void setFldintLenght(Integer fldintLenght)
	{
		writeProperty("fldintLenght", fldintLenght);
	}

	public Integer getFldintLenght()
	{
		return (Integer) readProperty("fldintLenght");
	}

	public void setFldsmiDataType(Short fldsmiDataType)
	{
		writeProperty("fldsmiDataType", fldsmiDataType);
	}

	public Short getFldsmiDataType()
	{
		return (Short) readProperty("fldsmiDataType");
	}

	public void setFldsmiProg(Short fldsmiProg)
	{
		writeProperty("fldsmiProg", fldsmiProg);
	}

	public Short getFldsmiProg()
	{
		return (Short) readProperty("fldsmiProg");
	}

	public void setFldtinIsKey(Short fldtinIsKey)
	{
		writeProperty("fldtinIsKey", fldtinIsKey);
	}

	public Short getFldtinIsKey()
	{
		return (Short) readProperty("fldtinIsKey");
	}

	public void setFldtinIsNullable(Short fldtinIsNullable)
	{
		writeProperty("fldtinIsNullable", fldtinIsNullable);
	}

	public Short getFldtinIsNullable()
	{
		return (Short) readProperty("fldtinIsNullable");
	}

	public void setFldvchColumnName(String fldvchColumnName)
	{
		writeProperty("fldvchColumnName", fldvchColumnName);
	}

	public String getFldvchColumnName()
	{
		return (String) readProperty("fldvchColumnName");
	}

	public void setFldvchComment(String fldvchComment)
	{
		writeProperty("fldvchComment", fldvchComment);
	}

	public String getFldvchComment()
	{
		return (String) readProperty("fldvchComment");
	}

	public void setFldvchTableName(String fldvchTableName)
	{
		writeProperty("fldvchTableName", fldvchTableName);
	}

	public String getFldvchTableName()
	{
		return (String) readProperty("fldvchTableName");
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
