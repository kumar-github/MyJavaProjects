package com.tc.app.exchangemonitor.model.cayenne.persistent.auto;

import org.apache.cayenne.CayenneDataObject;
import org.apache.cayenne.exp.Property;

import com.tc.app.exchangemonitor.model.cayenne.persistent.Report;

/**
 * Class _ReportExcelConfig was generated by Cayenne.
 * It is probably a good idea to avoid changing this class manually,
 * since it may be overwritten next time code is regenerated.
 * If you need to make any customizations, please use subclass.
 */
public abstract class _ReportExcelConfig extends CayenneDataObject
{

	private static final long serialVersionUID = 1L;

	public static final String FLDCHR_REPORT_EXCEL_NAME_PK_COLUMN = "fldchrReportExcelName";
	public static final String FLDINT_REPORT_ID_PK_COLUMN = "fldintReportId";

	public static final Property<String> FLDCHR_ERASE_COLUMN = new Property<String>("fldchrEraseColumn");
	public static final Property<String> FLDCHR_ERASE_ROW = new Property<String>("fldchrEraseRow");
	public static final Property<String> FLDCHR_EXCEL_LABEL = new Property<String>("fldchrExcelLabel");
	public static final Property<String> FLDCHR_EXCEL_LEFT_LABEL = new Property<String>("fldchrExcelLeftLabel");
	public static final Property<String> FLDCHR_EXCEL_MIDDLE_LABEL = new Property<String>("fldchrExcelMiddleLabel");
	public static final Property<String> FLDCHR_EXCEL_PIVOUT_NAME = new Property<String>("fldchrExcelPivoutName");
	public static final Property<String> FLDCHR_EXCEL_TOP_LABEL = new Property<String>("fldchrExcelTopLabel");
	public static final Property<String> FLDCHR_EXCEL_WORK_SHEET_NAME = new Property<String>("fldchrExcelWorkSheetName");
	public static final Property<String> FLDCHR_FLAG_ENABLE_EXPORT_EXCEL = new Property<String>("fldchrFlagEnableExportExcel");
	public static final Property<String> FLDCHR_FLAG_ENABLE_PIVOUT = new Property<String>("fldchrFlagEnablePivout");
	public static final Property<String> FLDCHR_PACKAGE_NAME = new Property<String>("fldchrPackageName");
	public static final Property<Integer> FLDINT_REFERENCE_COLUMN = new Property<Integer>("fldintReferenceColumn");
	public static final Property<Report> FLDINT_REPORT = new Property<Report>("fldintReport");

	public void setFldchrEraseColumn(String fldchrEraseColumn)
	{
		writeProperty("fldchrEraseColumn", fldchrEraseColumn);
	}

	public String getFldchrEraseColumn()
	{
		return (String) readProperty("fldchrEraseColumn");
	}

	public void setFldchrEraseRow(String fldchrEraseRow)
	{
		writeProperty("fldchrEraseRow", fldchrEraseRow);
	}

	public String getFldchrEraseRow()
	{
		return (String) readProperty("fldchrEraseRow");
	}

	public void setFldchrExcelLabel(String fldchrExcelLabel)
	{
		writeProperty("fldchrExcelLabel", fldchrExcelLabel);
	}

	public String getFldchrExcelLabel()
	{
		return (String) readProperty("fldchrExcelLabel");
	}

	public void setFldchrExcelLeftLabel(String fldchrExcelLeftLabel)
	{
		writeProperty("fldchrExcelLeftLabel", fldchrExcelLeftLabel);
	}

	public String getFldchrExcelLeftLabel()
	{
		return (String) readProperty("fldchrExcelLeftLabel");
	}

	public void setFldchrExcelMiddleLabel(String fldchrExcelMiddleLabel)
	{
		writeProperty("fldchrExcelMiddleLabel", fldchrExcelMiddleLabel);
	}

	public String getFldchrExcelMiddleLabel()
	{
		return (String) readProperty("fldchrExcelMiddleLabel");
	}

	public void setFldchrExcelPivoutName(String fldchrExcelPivoutName)
	{
		writeProperty("fldchrExcelPivoutName", fldchrExcelPivoutName);
	}

	public String getFldchrExcelPivoutName()
	{
		return (String) readProperty("fldchrExcelPivoutName");
	}

	public void setFldchrExcelTopLabel(String fldchrExcelTopLabel)
	{
		writeProperty("fldchrExcelTopLabel", fldchrExcelTopLabel);
	}

	public String getFldchrExcelTopLabel()
	{
		return (String) readProperty("fldchrExcelTopLabel");
	}

	public void setFldchrExcelWorkSheetName(String fldchrExcelWorkSheetName)
	{
		writeProperty("fldchrExcelWorkSheetName", fldchrExcelWorkSheetName);
	}

	public String getFldchrExcelWorkSheetName()
	{
		return (String) readProperty("fldchrExcelWorkSheetName");
	}

	public void setFldchrFlagEnableExportExcel(String fldchrFlagEnableExportExcel)
	{
		writeProperty("fldchrFlagEnableExportExcel", fldchrFlagEnableExportExcel);
	}

	public String getFldchrFlagEnableExportExcel()
	{
		return (String) readProperty("fldchrFlagEnableExportExcel");
	}

	public void setFldchrFlagEnablePivout(String fldchrFlagEnablePivout)
	{
		writeProperty("fldchrFlagEnablePivout", fldchrFlagEnablePivout);
	}

	public String getFldchrFlagEnablePivout()
	{
		return (String) readProperty("fldchrFlagEnablePivout");
	}

	public void setFldchrPackageName(String fldchrPackageName)
	{
		writeProperty("fldchrPackageName", fldchrPackageName);
	}

	public String getFldchrPackageName()
	{
		return (String) readProperty("fldchrPackageName");
	}

	public void setFldintReferenceColumn(Integer fldintReferenceColumn)
	{
		writeProperty("fldintReferenceColumn", fldintReferenceColumn);
	}

	public Integer getFldintReferenceColumn()
	{
		return (Integer) readProperty("fldintReferenceColumn");
	}

	public void setFldintReport(Report fldintReport)
	{
		setToOneTarget("fldintReport", fldintReport, true);
	}

	public Report getFldintReport()
	{
		return (Report) readProperty("fldintReport");
	}

}
