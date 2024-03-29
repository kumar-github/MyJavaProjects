package com.tc.app.exchangemonitor.model.cayenne.persistent.auto;

import java.util.List;

import org.apache.cayenne.CayenneDataObject;
import org.apache.cayenne.exp.Property;

import com.tc.app.exchangemonitor.model.cayenne.persistent.Account;
import com.tc.app.exchangemonitor.model.cayenne.persistent.Desk;
import com.tc.app.exchangemonitor.model.cayenne.persistent.GlAccountBalance;
import com.tc.app.exchangemonitor.model.cayenne.persistent.QuotePriceTerm;

/**
 * Class _Department was generated by Cayenne.
 * It is probably a good idea to avoid changing this class manually,
 * since it may be overwritten next time code is regenerated.
 * If you need to make any customizations, please use subclass.
 */
public abstract class _Department extends CayenneDataObject
{

	private static final long serialVersionUID = 1L;

	public static final String DEPT_CODE_PK_COLUMN = "dept_code";

	public static final Property<String> DEPT_NAME = new Property<String>("deptName");
	public static final Property<Short> DEPT_NUM = new Property<Short>("deptNum");
	public static final Property<String> MANAGER_INIT = new Property<String>("managerInit");
	public static final Property<String> PROFIT_CENTER_IND = new Property<String>("profitCenterInd");
	public static final Property<Integer> TRANS_ID = new Property<Integer>("transId");
	public static final Property<String> USER_ACCT_FLD1LABEL = new Property<String>("userAcctFld1Label");
	public static final Property<String> USER_ACCT_FLD2LABEL = new Property<String>("userAcctFld2Label");
	public static final Property<String> USER_ACCT_FLD3LABEL = new Property<String>("userAcctFld3Label");
	public static final Property<String> USER_ACCT_FLD4LABEL = new Property<String>("userAcctFld4Label");
	public static final Property<String> USER_ACCT_FLD5LABEL = new Property<String>("userAcctFld5Label");
	public static final Property<String> USER_ACCT_FLD6LABEL = new Property<String>("userAcctFld6Label");
	public static final Property<String> USER_CONT_FLD1LABEL = new Property<String>("userContFld1Label");
	public static final Property<String> USER_CONT_FLD2LABEL = new Property<String>("userContFld2Label");
	public static final Property<String> USER_CONT_FLD3LABEL = new Property<String>("userContFld3Label");
	public static final Property<String> USER_CONT_FLD4LABEL = new Property<String>("userContFld4Label");
	public static final Property<String> USER_CONT_FLD5LABEL = new Property<String>("userContFld5Label");
	public static final Property<String> USER_CONT_FLD6LABEL = new Property<String>("userContFld6Label");
	public static final Property<Account> ACCOUNT = new Property<Account>("account");
	public static final Property<List<Desk>> DESKS = new Property<List<Desk>>("desks");
	public static final Property<List<GlAccountBalance>> GL_ACCOUNT_BALANCES = new Property<List<GlAccountBalance>>("glAccountBalances");
	public static final Property<List<QuotePriceTerm>> QUOTE_PRICE_TERMS = new Property<List<QuotePriceTerm>>("quotePriceTerms");

	public void setDeptName(String deptName)
	{
		writeProperty("deptName", deptName);
	}

	public String getDeptName()
	{
		return (String) readProperty("deptName");
	}

	public void setDeptNum(Short deptNum)
	{
		writeProperty("deptNum", deptNum);
	}

	public Short getDeptNum()
	{
		return (Short) readProperty("deptNum");
	}

	public void setManagerInit(String managerInit)
	{
		writeProperty("managerInit", managerInit);
	}

	public String getManagerInit()
	{
		return (String) readProperty("managerInit");
	}

	public void setProfitCenterInd(String profitCenterInd)
	{
		writeProperty("profitCenterInd", profitCenterInd);
	}

	public String getProfitCenterInd()
	{
		return (String) readProperty("profitCenterInd");
	}

	public void setTransId(Integer transId)
	{
		writeProperty("transId", transId);
	}

	public Integer getTransId()
	{
		return (Integer) readProperty("transId");
	}

	public void setUserAcctFld1Label(String userAcctFld1Label)
	{
		writeProperty("userAcctFld1Label", userAcctFld1Label);
	}

	public String getUserAcctFld1Label()
	{
		return (String) readProperty("userAcctFld1Label");
	}

	public void setUserAcctFld2Label(String userAcctFld2Label)
	{
		writeProperty("userAcctFld2Label", userAcctFld2Label);
	}

	public String getUserAcctFld2Label()
	{
		return (String) readProperty("userAcctFld2Label");
	}

	public void setUserAcctFld3Label(String userAcctFld3Label)
	{
		writeProperty("userAcctFld3Label", userAcctFld3Label);
	}

	public String getUserAcctFld3Label()
	{
		return (String) readProperty("userAcctFld3Label");
	}

	public void setUserAcctFld4Label(String userAcctFld4Label)
	{
		writeProperty("userAcctFld4Label", userAcctFld4Label);
	}

	public String getUserAcctFld4Label()
	{
		return (String) readProperty("userAcctFld4Label");
	}

	public void setUserAcctFld5Label(String userAcctFld5Label)
	{
		writeProperty("userAcctFld5Label", userAcctFld5Label);
	}

	public String getUserAcctFld5Label()
	{
		return (String) readProperty("userAcctFld5Label");
	}

	public void setUserAcctFld6Label(String userAcctFld6Label)
	{
		writeProperty("userAcctFld6Label", userAcctFld6Label);
	}

	public String getUserAcctFld6Label()
	{
		return (String) readProperty("userAcctFld6Label");
	}

	public void setUserContFld1Label(String userContFld1Label)
	{
		writeProperty("userContFld1Label", userContFld1Label);
	}

	public String getUserContFld1Label()
	{
		return (String) readProperty("userContFld1Label");
	}

	public void setUserContFld2Label(String userContFld2Label)
	{
		writeProperty("userContFld2Label", userContFld2Label);
	}

	public String getUserContFld2Label()
	{
		return (String) readProperty("userContFld2Label");
	}

	public void setUserContFld3Label(String userContFld3Label)
	{
		writeProperty("userContFld3Label", userContFld3Label);
	}

	public String getUserContFld3Label()
	{
		return (String) readProperty("userContFld3Label");
	}

	public void setUserContFld4Label(String userContFld4Label)
	{
		writeProperty("userContFld4Label", userContFld4Label);
	}

	public String getUserContFld4Label()
	{
		return (String) readProperty("userContFld4Label");
	}

	public void setUserContFld5Label(String userContFld5Label)
	{
		writeProperty("userContFld5Label", userContFld5Label);
	}

	public String getUserContFld5Label()
	{
		return (String) readProperty("userContFld5Label");
	}

	public void setUserContFld6Label(String userContFld6Label)
	{
		writeProperty("userContFld6Label", userContFld6Label);
	}

	public String getUserContFld6Label()
	{
		return (String) readProperty("userContFld6Label");
	}

	public void setAccount(Account account)
	{
		setToOneTarget("account", account, true);
	}

	public Account getAccount()
	{
		return (Account) readProperty("account");
	}

	public void addToDesks(Desk obj)
	{
		addToManyTarget("desks", obj, true);
	}

	public void removeFromDesks(Desk obj)
	{
		removeToManyTarget("desks", obj, true);
	}

	@SuppressWarnings("unchecked")
	public List<Desk> getDesks()
	{
		return (List<Desk>) readProperty("desks");
	}

	public void addToGlAccountBalances(GlAccountBalance obj)
	{
		addToManyTarget("glAccountBalances", obj, true);
	}

	public void removeFromGlAccountBalances(GlAccountBalance obj)
	{
		removeToManyTarget("glAccountBalances", obj, true);
	}

	@SuppressWarnings("unchecked")
	public List<GlAccountBalance> getGlAccountBalances()
	{
		return (List<GlAccountBalance>) readProperty("glAccountBalances");
	}

	public void addToQuotePriceTerms(QuotePriceTerm obj)
	{
		addToManyTarget("quotePriceTerms", obj, true);
	}

	public void removeFromQuotePriceTerms(QuotePriceTerm obj)
	{
		removeToManyTarget("quotePriceTerms", obj, true);
	}

	@SuppressWarnings("unchecked")
	public List<QuotePriceTerm> getQuotePriceTerms()
	{
		return (List<QuotePriceTerm>) readProperty("quotePriceTerms");
	}

}
