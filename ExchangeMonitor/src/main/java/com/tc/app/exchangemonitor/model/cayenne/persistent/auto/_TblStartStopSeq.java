package com.tc.app.exchangemonitor.model.cayenne.persistent.auto;

import org.apache.cayenne.CayenneDataObject;
import org.apache.cayenne.exp.Property;

/**
 * Class _TblStartStopSeq was generated by Cayenne.
 * It is probably a good idea to avoid changing this class manually,
 * since it may be overwritten next time code is regenerated.
 * If you need to make any customizations, please use subclass.
 */
public abstract class _TblStartStopSeq extends CayenneDataObject
{

	private static final long serialVersionUID = 1L;

	public static final Property<String> CONFIG_NAME = new Property<String>("configName");
	public static final Property<String> CONFIG_TYPE = new Property<String>("configType");
	public static final Property<Short> SEQ_NUMBER = new Property<Short>("seqNumber");
	public static final Property<String> START_KEYWORD = new Property<String>("startKeyword");
	public static final Property<String> START_POSITION = new Property<String>("startPosition");
	public static final Property<String> START_ROW_COL = new Property<String>("startRowCol");
	public static final Property<String> START_STRING = new Property<String>("startString");
	public static final Property<String> START_TYPE = new Property<String>("startType");
	public static final Property<String> STOP_KEY_WORD = new Property<String>("stopKeyWord");
	public static final Property<String> STOP_POSITION = new Property<String>("stopPosition");
	public static final Property<String> STOP_ROW_COL = new Property<String>("stopRowCol");
	public static final Property<String> STOP_STRING = new Property<String>("stopString");
	public static final Property<String> STOP_TYPE = new Property<String>("stopType");

	public void setConfigName(String configName)
	{
		writeProperty("configName", configName);
	}

	public String getConfigName()
	{
		return (String) readProperty("configName");
	}

	public void setConfigType(String configType)
	{
		writeProperty("configType", configType);
	}

	public String getConfigType()
	{
		return (String) readProperty("configType");
	}

	public void setSeqNumber(Short seqNumber)
	{
		writeProperty("seqNumber", seqNumber);
	}

	public Short getSeqNumber()
	{
		return (Short) readProperty("seqNumber");
	}

	public void setStartKeyword(String startKeyword)
	{
		writeProperty("startKeyword", startKeyword);
	}

	public String getStartKeyword()
	{
		return (String) readProperty("startKeyword");
	}

	public void setStartPosition(String startPosition)
	{
		writeProperty("startPosition", startPosition);
	}

	public String getStartPosition()
	{
		return (String) readProperty("startPosition");
	}

	public void setStartRowCol(String startRowCol)
	{
		writeProperty("startRowCol", startRowCol);
	}

	public String getStartRowCol()
	{
		return (String) readProperty("startRowCol");
	}

	public void setStartString(String startString)
	{
		writeProperty("startString", startString);
	}

	public String getStartString()
	{
		return (String) readProperty("startString");
	}

	public void setStartType(String startType)
	{
		writeProperty("startType", startType);
	}

	public String getStartType()
	{
		return (String) readProperty("startType");
	}

	public void setStopKeyWord(String stopKeyWord)
	{
		writeProperty("stopKeyWord", stopKeyWord);
	}

	public String getStopKeyWord()
	{
		return (String) readProperty("stopKeyWord");
	}

	public void setStopPosition(String stopPosition)
	{
		writeProperty("stopPosition", stopPosition);
	}

	public String getStopPosition()
	{
		return (String) readProperty("stopPosition");
	}

	public void setStopRowCol(String stopRowCol)
	{
		writeProperty("stopRowCol", stopRowCol);
	}

	public String getStopRowCol()
	{
		return (String) readProperty("stopRowCol");
	}

	public void setStopString(String stopString)
	{
		writeProperty("stopString", stopString);
	}

	public String getStopString()
	{
		return (String) readProperty("stopString");
	}

	public void setStopType(String stopType)
	{
		writeProperty("stopType", stopType);
	}

	public String getStopType()
	{
		return (String) readProperty("stopType");
	}

}
