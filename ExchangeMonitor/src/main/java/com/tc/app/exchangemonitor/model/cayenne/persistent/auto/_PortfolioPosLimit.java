package com.tc.app.exchangemonitor.model.cayenne.persistent.auto;

import java.math.BigDecimal;
import java.util.Date;

import org.apache.cayenne.CayenneDataObject;
import org.apache.cayenne.exp.Property;

import com.tc.app.exchangemonitor.model.cayenne.persistent.Portfolio;
import com.tc.app.exchangemonitor.model.cayenne.persistent.Uom;

/**
 * Class _PortfolioPosLimit was generated by Cayenne.
 * It is probably a good idea to avoid changing this class manually,
 * since it may be overwritten next time code is regenerated.
 * If you need to make any customizations, please use subclass.
 */
public abstract class _PortfolioPosLimit extends CayenneDataObject
{

	private static final long serialVersionUID = 1L;

	public static final String PORT_NUM_PK_COLUMN = "port_num";
	public static final String POS_LIMIT_ID_PK_COLUMN = "pos_limit_id";

	public static final Property<BigDecimal> LONG_LIMIT_QTY = new Property<BigDecimal>("longLimitQty");
	public static final Property<Date> POS_ASOF_DATE = new Property<Date>("posAsofDate");
	public static final Property<BigDecimal> POS_QTY = new Property<BigDecimal>("posQty");
	public static final Property<BigDecimal> SHORT_LIMIT_QTY = new Property<BigDecimal>("shortLimitQty");
	public static final Property<BigDecimal> TOLERANCE_PCT = new Property<BigDecimal>("tolerancePct");
	public static final Property<Integer> TRANS_ID = new Property<Integer>("transId");
	public static final Property<Portfolio> PORTFOLIO = new Property<Portfolio>("portfolio");
	public static final Property<Uom> UOM = new Property<Uom>("uom");

	public void setLongLimitQty(BigDecimal longLimitQty)
	{
		writeProperty("longLimitQty", longLimitQty);
	}

	public BigDecimal getLongLimitQty()
	{
		return (BigDecimal) readProperty("longLimitQty");
	}

	public void setPosAsofDate(Date posAsofDate)
	{
		writeProperty("posAsofDate", posAsofDate);
	}

	public Date getPosAsofDate()
	{
		return (Date) readProperty("posAsofDate");
	}

	public void setPosQty(BigDecimal posQty)
	{
		writeProperty("posQty", posQty);
	}

	public BigDecimal getPosQty()
	{
		return (BigDecimal) readProperty("posQty");
	}

	public void setShortLimitQty(BigDecimal shortLimitQty)
	{
		writeProperty("shortLimitQty", shortLimitQty);
	}

	public BigDecimal getShortLimitQty()
	{
		return (BigDecimal) readProperty("shortLimitQty");
	}

	public void setTolerancePct(BigDecimal tolerancePct)
	{
		writeProperty("tolerancePct", tolerancePct);
	}

	public BigDecimal getTolerancePct()
	{
		return (BigDecimal) readProperty("tolerancePct");
	}

	public void setTransId(Integer transId)
	{
		writeProperty("transId", transId);
	}

	public Integer getTransId()
	{
		return (Integer) readProperty("transId");
	}

	public void setPortfolio(Portfolio portfolio)
	{
		setToOneTarget("portfolio", portfolio, true);
	}

	public Portfolio getPortfolio()
	{
		return (Portfolio) readProperty("portfolio");
	}

	public void setUom(Uom uom)
	{
		setToOneTarget("uom", uom, true);
	}

	public Uom getUom()
	{
		return (Uom) readProperty("uom");
	}

}
