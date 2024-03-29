package com.tc.app.exchangemonitor.model.cayenne.persistent.auto;

import org.apache.cayenne.CayenneDataObject;
import org.apache.cayenne.exp.Property;

/**
 * Class _ParserField was generated by Cayenne.
 * It is probably a good idea to avoid changing this class manually,
 * since it may be overwritten next time code is regenerated.
 * If you need to make any customizations, please use subclass.
 */
public abstract class _ParserField extends CayenneDataObject
{

	private static final long serialVersionUID = 1L;

	public static final String ID_PK_COLUMN = "id";

	public static final Property<String> CONVERSION_NAME = new Property<String>("conversionName");
	public static final Property<Integer> END_INDEX = new Property<Integer>("endIndex");
	public static final Property<String> FIELD_NAME = new Property<String>("fieldName");
	public static final Property<Integer> FIELD_NUMBER = new Property<Integer>("fieldNumber");
	public static final Property<String> FIELD_NUMBERS = new Property<String>("fieldNumbers");
	public static final Property<Integer> LINE_NUMBER = new Property<Integer>("lineNumber");
	public static final Property<String> PARSER_FORMAT = new Property<String>("parserFormat");
	public static final Property<Integer> PARSER_ID = new Property<Integer>("parserId");
	public static final Property<String> REGEX = new Property<String>("regex");
	public static final Property<String> RESULT_CONCATENATOR = new Property<String>("resultConcatenator");
	public static final Property<Integer> START_INDEX = new Property<Integer>("startIndex");
	public static final Property<String> STATIC_FIELD_VALUE = new Property<String>("staticFieldValue");
	public static final Property<Integer> TRANS_ID = new Property<Integer>("transId");

	public void setConversionName(String conversionName)
	{
		writeProperty("conversionName", conversionName);
	}

	public String getConversionName()
	{
		return (String) readProperty("conversionName");
	}

	public void setEndIndex(Integer endIndex)
	{
		writeProperty("endIndex", endIndex);
	}

	public Integer getEndIndex()
	{
		return (Integer) readProperty("endIndex");
	}

	public void setFieldName(String fieldName)
	{
		writeProperty("fieldName", fieldName);
	}

	public String getFieldName()
	{
		return (String) readProperty("fieldName");
	}

	public void setFieldNumber(Integer fieldNumber)
	{
		writeProperty("fieldNumber", fieldNumber);
	}

	public Integer getFieldNumber()
	{
		return (Integer) readProperty("fieldNumber");
	}

	public void setFieldNumbers(String fieldNumbers)
	{
		writeProperty("fieldNumbers", fieldNumbers);
	}

	public String getFieldNumbers()
	{
		return (String) readProperty("fieldNumbers");
	}

	public void setLineNumber(Integer lineNumber)
	{
		writeProperty("lineNumber", lineNumber);
	}

	public Integer getLineNumber()
	{
		return (Integer) readProperty("lineNumber");
	}

	public void setParserFormat(String parserFormat)
	{
		writeProperty("parserFormat", parserFormat);
	}

	public String getParserFormat()
	{
		return (String) readProperty("parserFormat");
	}

	public void setParserId(Integer parserId)
	{
		writeProperty("parserId", parserId);
	}

	public Integer getParserId()
	{
		return (Integer) readProperty("parserId");
	}

	public void setRegex(String regex)
	{
		writeProperty("regex", regex);
	}

	public String getRegex()
	{
		return (String) readProperty("regex");
	}

	public void setResultConcatenator(String resultConcatenator)
	{
		writeProperty("resultConcatenator", resultConcatenator);
	}

	public String getResultConcatenator()
	{
		return (String) readProperty("resultConcatenator");
	}

	public void setStartIndex(Integer startIndex)
	{
		writeProperty("startIndex", startIndex);
	}

	public Integer getStartIndex()
	{
		return (Integer) readProperty("startIndex");
	}

	public void setStaticFieldValue(String staticFieldValue)
	{
		writeProperty("staticFieldValue", staticFieldValue);
	}

	public String getStaticFieldValue()
	{
		return (String) readProperty("staticFieldValue");
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
