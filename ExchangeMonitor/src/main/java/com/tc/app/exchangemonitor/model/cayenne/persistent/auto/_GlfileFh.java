package com.tc.app.exchangemonitor.model.cayenne.persistent.auto;

import org.apache.cayenne.CayenneDataObject;
import org.apache.cayenne.exp.Property;

/**
 * Class _GlfileFh was generated by Cayenne.
 * It is probably a good idea to avoid changing this class manually,
 * since it may be overwritten next time code is regenerated.
 * If you need to make any customizations, please use subclass.
 */
public abstract class _GlfileFh extends CayenneDataObject
{

	private static final long serialVersionUID = 1L;

	public static final String GLFILE_FH_NUM_PK_COLUMN = "glfile_fh_num";

	public static final Property<String> FH_DATA_INTERPRET_SW = new Property<String>("fhDataInterpretSw");
	public static final Property<String> FH_DECIMAL_SEPARATOR = new Property<String>("fhDecimalSeparator");
	public static final Property<String> FH_EDIT_ONLY_SW = new Property<String>("fhEditOnlySw");
	public static final Property<String> FH_EPIC_REPORT_ID = new Property<String>("fhEpicReportId");
	public static final Property<String> FH_GENERATE_ACCT_SW = new Property<String>("fhGenerateAcctSw");
	public static final Property<String> FH_PAGE_BREAK_SW = new Property<String>("fhPageBreakSw");
	public static final Property<String> FH_POST_SUMMARY_TYPE = new Property<String>("fhPostSummaryType");
	public static final Property<String> FH_POST_TO_INACTIVE_SW = new Property<String>("fhPostToInactiveSw");
	public static final Property<String> FH_POST_UNBALANCE_SW = new Property<String>("fhPostUnbalanceSw");
	public static final Property<String> FH_PRINT_LEVEL_SW = new Property<String>("fhPrintLevelSw");
	public static final Property<String> FH_PROCESS_MODE_SW = new Property<String>("fhProcessModeSw");
	public static final Property<String> FH_REPORT_TITLE = new Property<String>("fhReportTitle");
	public static final Property<String> FH_SIGN_FIX_SW = new Property<String>("fhSignFixSw");
	public static final Property<String> FH_THOUSAND_SEPARATOR = new Property<String>("fhThousandSeparator");
	public static final Property<String> FH_USE_SUSP_ACCT_SW = new Property<String>("fhUseSuspAcctSw");
	public static final Property<Integer> TRANS_ID = new Property<Integer>("transId");

	public void setFhDataInterpretSw(String fhDataInterpretSw)
	{
		writeProperty("fhDataInterpretSw", fhDataInterpretSw);
	}

	public String getFhDataInterpretSw()
	{
		return (String) readProperty("fhDataInterpretSw");
	}

	public void setFhDecimalSeparator(String fhDecimalSeparator)
	{
		writeProperty("fhDecimalSeparator", fhDecimalSeparator);
	}

	public String getFhDecimalSeparator()
	{
		return (String) readProperty("fhDecimalSeparator");
	}

	public void setFhEditOnlySw(String fhEditOnlySw)
	{
		writeProperty("fhEditOnlySw", fhEditOnlySw);
	}

	public String getFhEditOnlySw()
	{
		return (String) readProperty("fhEditOnlySw");
	}

	public void setFhEpicReportId(String fhEpicReportId)
	{
		writeProperty("fhEpicReportId", fhEpicReportId);
	}

	public String getFhEpicReportId()
	{
		return (String) readProperty("fhEpicReportId");
	}

	public void setFhGenerateAcctSw(String fhGenerateAcctSw)
	{
		writeProperty("fhGenerateAcctSw", fhGenerateAcctSw);
	}

	public String getFhGenerateAcctSw()
	{
		return (String) readProperty("fhGenerateAcctSw");
	}

	public void setFhPageBreakSw(String fhPageBreakSw)
	{
		writeProperty("fhPageBreakSw", fhPageBreakSw);
	}

	public String getFhPageBreakSw()
	{
		return (String) readProperty("fhPageBreakSw");
	}

	public void setFhPostSummaryType(String fhPostSummaryType)
	{
		writeProperty("fhPostSummaryType", fhPostSummaryType);
	}

	public String getFhPostSummaryType()
	{
		return (String) readProperty("fhPostSummaryType");
	}

	public void setFhPostToInactiveSw(String fhPostToInactiveSw)
	{
		writeProperty("fhPostToInactiveSw", fhPostToInactiveSw);
	}

	public String getFhPostToInactiveSw()
	{
		return (String) readProperty("fhPostToInactiveSw");
	}

	public void setFhPostUnbalanceSw(String fhPostUnbalanceSw)
	{
		writeProperty("fhPostUnbalanceSw", fhPostUnbalanceSw);
	}

	public String getFhPostUnbalanceSw()
	{
		return (String) readProperty("fhPostUnbalanceSw");
	}

	public void setFhPrintLevelSw(String fhPrintLevelSw)
	{
		writeProperty("fhPrintLevelSw", fhPrintLevelSw);
	}

	public String getFhPrintLevelSw()
	{
		return (String) readProperty("fhPrintLevelSw");
	}

	public void setFhProcessModeSw(String fhProcessModeSw)
	{
		writeProperty("fhProcessModeSw", fhProcessModeSw);
	}

	public String getFhProcessModeSw()
	{
		return (String) readProperty("fhProcessModeSw");
	}

	public void setFhReportTitle(String fhReportTitle)
	{
		writeProperty("fhReportTitle", fhReportTitle);
	}

	public String getFhReportTitle()
	{
		return (String) readProperty("fhReportTitle");
	}

	public void setFhSignFixSw(String fhSignFixSw)
	{
		writeProperty("fhSignFixSw", fhSignFixSw);
	}

	public String getFhSignFixSw()
	{
		return (String) readProperty("fhSignFixSw");
	}

	public void setFhThousandSeparator(String fhThousandSeparator)
	{
		writeProperty("fhThousandSeparator", fhThousandSeparator);
	}

	public String getFhThousandSeparator()
	{
		return (String) readProperty("fhThousandSeparator");
	}

	public void setFhUseSuspAcctSw(String fhUseSuspAcctSw)
	{
		writeProperty("fhUseSuspAcctSw", fhUseSuspAcctSw);
	}

	public String getFhUseSuspAcctSw()
	{
		return (String) readProperty("fhUseSuspAcctSw");
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
