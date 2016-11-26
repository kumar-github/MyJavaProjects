package com.tc.app.exchangemonitor.model.cayenne.persistent.auto;

import java.util.Date;

import org.apache.cayenne.CayenneDataObject;
import org.apache.cayenne.exp.Property;

/**
 * Class _TblHitRecords was generated by Cayenne.
 * It is probably a good idea to avoid changing this class manually,
 * since it may be overwritten next time code is regenerated.
 * If you need to make any customizations, please use subclass.
 */
public abstract class _TblHitRecords extends CayenneDataObject
{

	private static final long serialVersionUID = 1L;

	public static final Property<Integer> ALIAS_MATCHED = new Property<Integer>("aliasMatched");
	public static final Property<Integer> AVG_CALCULATED = new Property<Integer>("avgCalculated");
	public static final Property<String> CONFIG_NAME = new Property<String>("configNAme");
	public static final Property<Date> DATE_DOWNLOAD = new Property<Date>("dateDownload");
	public static final Property<String> END_TIME = new Property<String>("endTime");
	public static final Property<Integer> LINES_READ = new Property<Integer>("linesRead");
	public static final Property<String> PATH = new Property<String>("path");
	public static final Property<Integer> RECORDS_HIT = new Property<Integer>("recordsHit");

	public void setAliasMatched(Integer aliasMatched)
	{
		writeProperty("aliasMatched", aliasMatched);
	}

	public Integer getAliasMatched()
	{
		return (Integer) readProperty("aliasMatched");
	}

	public void setAvgCalculated(Integer avgCalculated)
	{
		writeProperty("avgCalculated", avgCalculated);
	}

	public Integer getAvgCalculated()
	{
		return (Integer) readProperty("avgCalculated");
	}

	public void setConfigNAme(String configNAme)
	{
		writeProperty("configNAme", configNAme);
	}

	public String getConfigNAme()
	{
		return (String) readProperty("configNAme");
	}

	public void setDateDownload(Date dateDownload)
	{
		writeProperty("dateDownload", dateDownload);
	}

	public Date getDateDownload()
	{
		return (Date) readProperty("dateDownload");
	}

	public void setEndTime(String endTime)
	{
		writeProperty("endTime", endTime);
	}

	public String getEndTime()
	{
		return (String) readProperty("endTime");
	}

	public void setLinesRead(Integer linesRead)
	{
		writeProperty("linesRead", linesRead);
	}

	public Integer getLinesRead()
	{
		return (Integer) readProperty("linesRead");
	}

	public void setPath(String path)
	{
		writeProperty("path", path);
	}

	public String getPath()
	{
		return (String) readProperty("path");
	}

	public void setRecordsHit(Integer recordsHit)
	{
		writeProperty("recordsHit", recordsHit);
	}

	public Integer getRecordsHit()
	{
		return (Integer) readProperty("recordsHit");
	}

}
