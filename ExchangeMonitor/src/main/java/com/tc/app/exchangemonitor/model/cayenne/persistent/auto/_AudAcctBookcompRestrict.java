package com.tc.app.exchangemonitor.model.cayenne.persistent.auto;

import java.util.Date;

import org.apache.cayenne.CayenneDataObject;
import org.apache.cayenne.exp.Property;

/**
 * Class _AudAcctBookcompRestrict was generated by Cayenne.
 * It is probably a good idea to avoid changing this class manually,
 * since it may be overwritten next time code is regenerated.
 * If you need to make any customizations, please use subclass.
 */
public abstract class _AudAcctBookcompRestrict extends CayenneDataObject
{

	private static final long serialVersionUID = 1L;

	public static final Property<Integer> ACCT_BOOKCOMP_KEY = new Property<Integer>("acctBookcompKey");
	public static final Property<Integer> ACCT_RESTRICTION_NUM = new Property<Integer>("acctRestrictionNum");
	public static final Property<Boolean> ALLOWS_BOOKOUT = new Property<Boolean>("allowsBookout");
	public static final Property<Boolean> ALLOWS_NETOUT = new Property<Boolean>("allowsNetout");
	public static final Property<String> NOBUY_RESTRICTION_IND = new Property<String>("nobuyRestrictionInd");
	public static final Property<String> NOSELL_RESTRICTION_IND = new Property<String>("nosellRestrictionInd");
	public static final Property<String> ORDER_TYPE_GROUP = new Property<String>("orderTypeGroup");
	public static final Property<Integer> RESP_TRANS_ID = new Property<Integer>("respTransId");
	public static final Property<Date> RESTRICTION_EFF_DATE = new Property<Date>("restrictionEffDate");
	public static final Property<Date> RESTRICTION_END_DATE = new Property<Date>("restrictionEndDate");
	public static final Property<String> TENOR_CODE = new Property<String>("tenorCode");
	public static final Property<Integer> TRANS_ID = new Property<Integer>("transId");

	public void setAcctBookcompKey(Integer acctBookcompKey)
	{
		writeProperty("acctBookcompKey", acctBookcompKey);
	}

	public Integer getAcctBookcompKey()
	{
		return (Integer) readProperty("acctBookcompKey");
	}

	public void setAcctRestrictionNum(Integer acctRestrictionNum)
	{
		writeProperty("acctRestrictionNum", acctRestrictionNum);
	}

	public Integer getAcctRestrictionNum()
	{
		return (Integer) readProperty("acctRestrictionNum");
	}

	public void setAllowsBookout(Boolean allowsBookout)
	{
		writeProperty("allowsBookout", allowsBookout);
	}

	public Boolean getAllowsBookout()
	{
		return (Boolean) readProperty("allowsBookout");
	}

	public void setAllowsNetout(Boolean allowsNetout)
	{
		writeProperty("allowsNetout", allowsNetout);
	}

	public Boolean getAllowsNetout()
	{
		return (Boolean) readProperty("allowsNetout");
	}

	public void setNobuyRestrictionInd(String nobuyRestrictionInd)
	{
		writeProperty("nobuyRestrictionInd", nobuyRestrictionInd);
	}

	public String getNobuyRestrictionInd()
	{
		return (String) readProperty("nobuyRestrictionInd");
	}

	public void setNosellRestrictionInd(String nosellRestrictionInd)
	{
		writeProperty("nosellRestrictionInd", nosellRestrictionInd);
	}

	public String getNosellRestrictionInd()
	{
		return (String) readProperty("nosellRestrictionInd");
	}

	public void setOrderTypeGroup(String orderTypeGroup)
	{
		writeProperty("orderTypeGroup", orderTypeGroup);
	}

	public String getOrderTypeGroup()
	{
		return (String) readProperty("orderTypeGroup");
	}

	public void setRespTransId(Integer respTransId)
	{
		writeProperty("respTransId", respTransId);
	}

	public Integer getRespTransId()
	{
		return (Integer) readProperty("respTransId");
	}

	public void setRestrictionEffDate(Date restrictionEffDate)
	{
		writeProperty("restrictionEffDate", restrictionEffDate);
	}

	public Date getRestrictionEffDate()
	{
		return (Date) readProperty("restrictionEffDate");
	}

	public void setRestrictionEndDate(Date restrictionEndDate)
	{
		writeProperty("restrictionEndDate", restrictionEndDate);
	}

	public Date getRestrictionEndDate()
	{
		return (Date) readProperty("restrictionEndDate");
	}

	public void setTenorCode(String tenorCode)
	{
		writeProperty("tenorCode", tenorCode);
	}

	public String getTenorCode()
	{
		return (String) readProperty("tenorCode");
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
