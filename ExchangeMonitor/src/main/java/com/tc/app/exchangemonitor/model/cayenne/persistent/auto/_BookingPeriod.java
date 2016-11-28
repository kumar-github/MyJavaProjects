package com.tc.app.exchangemonitor.model.cayenne.persistent.auto;

import java.util.Date;

import org.apache.cayenne.CayenneDataObject;
import org.apache.cayenne.exp.Property;

import com.tc.app.exchangemonitor.model.cayenne.persistent.Account;

/**
 * Class _BookingPeriod was generated by Cayenne.
 * It is probably a good idea to avoid changing this class manually,
 * since it may be overwritten next time code is regenerated.
 * If you need to make any customizations, please use subclass.
 */
public abstract class _BookingPeriod extends CayenneDataObject
{

	private static final long serialVersionUID = 1L;

	public static final String BOOKING_COMP_NUM_PK_COLUMN = "booking_comp_num";
	public static final String BOOKING_PRD_NUM_PK_COLUMN = "booking_prd_num";
	public static final String BOOKING_PRD_YEAR_PK_COLUMN = "booking_prd_year";

	public static final Property<Date> BOOKING_PRD_END_DATE = new Property<Date>("bookingPrdEndDate");
	public static final Property<Date> BOOKING_PRD_START_DATE = new Property<Date>("bookingPrdStartDate");
	public static final Property<String> BOOKING_PRD_STATUS = new Property<String>("bookingPrdStatus");
	public static final Property<Integer> TRANS_ID = new Property<Integer>("transId");
	public static final Property<Account> ACCOUNT = new Property<Account>("account");

	public void setBookingPrdEndDate(Date bookingPrdEndDate)
	{
		writeProperty("bookingPrdEndDate", bookingPrdEndDate);
	}

	public Date getBookingPrdEndDate()
	{
		return (Date) readProperty("bookingPrdEndDate");
	}

	public void setBookingPrdStartDate(Date bookingPrdStartDate)
	{
		writeProperty("bookingPrdStartDate", bookingPrdStartDate);
	}

	public Date getBookingPrdStartDate()
	{
		return (Date) readProperty("bookingPrdStartDate");
	}

	public void setBookingPrdStatus(String bookingPrdStatus)
	{
		writeProperty("bookingPrdStatus", bookingPrdStatus);
	}

	public String getBookingPrdStatus()
	{
		return (String) readProperty("bookingPrdStatus");
	}

	public void setTransId(Integer transId)
	{
		writeProperty("transId", transId);
	}

	public Integer getTransId()
	{
		return (Integer) readProperty("transId");
	}

	public void setAccount(Account account)
	{
		setToOneTarget("account", account, true);
	}

	public Account getAccount()
	{
		return (Account) readProperty("account");
	}

}