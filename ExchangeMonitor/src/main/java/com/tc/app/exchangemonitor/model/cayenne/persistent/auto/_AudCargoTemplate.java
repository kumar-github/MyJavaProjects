package com.tc.app.exchangemonitor.model.cayenne.persistent.auto;

import java.math.BigDecimal;
import java.util.Date;

import org.apache.cayenne.CayenneDataObject;
import org.apache.cayenne.exp.Property;

/**
 * Class _AudCargoTemplate was generated by Cayenne.
 * It is probably a good idea to avoid changing this class manually,
 * since it may be overwritten next time code is regenerated.
 * If you need to make any customizations, please use subclass.
 */
public abstract class _AudCargoTemplate extends CayenneDataObject
{

	private static final long serialVersionUID = 1L;

	public static final Property<BigDecimal> BALAST_ADJTIME = new Property<BigDecimal>("balastAdjtime");
	public static final Property<BigDecimal> CARGO_POSITION_DAYS = new Property<BigDecimal>("cargoPositionDays");
	public static final Property<Date> CREATION_DATE = new Property<Date>("creationDate");
	public static final Property<String> CREATION_USER = new Property<String>("creationUser");
	public static final Property<Date> DATE_OP = new Property<Date>("dateOp");
	public static final Property<BigDecimal> HARBOUR_COST = new Property<BigDecimal>("harbourCost");
	public static final Property<BigDecimal> IFO_BUNKER_CONS = new Property<BigDecimal>("ifoBunkerCons");
	public static final Property<Integer> IFO_COMMKT_KEY = new Property<Integer>("ifoCommktKey");
	public static final Property<BigDecimal> IFO_MANUAL_PRICE = new Property<BigDecimal>("ifoManualPrice");
	public static final Property<String> IFO_PRICE_SOURCE_CODE = new Property<String>("ifoPriceSourceCode");
	public static final Property<BigDecimal> MDO_BUNKER_CONS = new Property<BigDecimal>("mdoBunkerCons");
	public static final Property<Integer> MDO_COMMKT_KEY = new Property<Integer>("mdoCommktKey");
	public static final Property<BigDecimal> MDO_MANUAL_PRICE = new Property<BigDecimal>("mdoManualPrice");
	public static final Property<String> MDO_PRICE_SOURCE_CODE = new Property<String>("mdoPriceSourceCode");
	public static final Property<String> OPERATION = new Property<String>("operation");
	public static final Property<BigDecimal> PRICE_ADJUSTMENT = new Property<BigDecimal>("priceAdjustment");
	public static final Property<Integer> PRICE_COMMKY_KEY = new Property<Integer>("priceCommkyKey");
	public static final Property<String> PRICE_SOURCE_CODE = new Property<String>("priceSourceCode");
	public static final Property<BigDecimal> QUANTITY = new Property<BigDecimal>("quantity");
	public static final Property<String> STATUS = new Property<String>("status");
	public static final Property<Integer> TEMPLATE_ID = new Property<Integer>("templateId");
	public static final Property<String> TEMPLATE_NAME = new Property<String>("templateName");
	public static final Property<Date> UPDATE_DATE = new Property<Date>("updateDate");
	public static final Property<String> UPDATE_USER = new Property<String>("updateUser");
	public static final Property<String> USERID = new Property<String>("userid");
	public static final Property<String> VESSEL_ID = new Property<String>("vesselId");
	public static final Property<String> VESSEL_NAME = new Property<String>("vesselName");
	public static final Property<BigDecimal> VOYAGE_DURATION = new Property<BigDecimal>("voyageDuration");

	public void setBalastAdjtime(BigDecimal balastAdjtime)
	{
		writeProperty("balastAdjtime", balastAdjtime);
	}

	public BigDecimal getBalastAdjtime()
	{
		return (BigDecimal) readProperty("balastAdjtime");
	}

	public void setCargoPositionDays(BigDecimal cargoPositionDays)
	{
		writeProperty("cargoPositionDays", cargoPositionDays);
	}

	public BigDecimal getCargoPositionDays()
	{
		return (BigDecimal) readProperty("cargoPositionDays");
	}

	public void setCreationDate(Date creationDate)
	{
		writeProperty("creationDate", creationDate);
	}

	public Date getCreationDate()
	{
		return (Date) readProperty("creationDate");
	}

	public void setCreationUser(String creationUser)
	{
		writeProperty("creationUser", creationUser);
	}

	public String getCreationUser()
	{
		return (String) readProperty("creationUser");
	}

	public void setDateOp(Date dateOp)
	{
		writeProperty("dateOp", dateOp);
	}

	public Date getDateOp()
	{
		return (Date) readProperty("dateOp");
	}

	public void setHarbourCost(BigDecimal harbourCost)
	{
		writeProperty("harbourCost", harbourCost);
	}

	public BigDecimal getHarbourCost()
	{
		return (BigDecimal) readProperty("harbourCost");
	}

	public void setIfoBunkerCons(BigDecimal ifoBunkerCons)
	{
		writeProperty("ifoBunkerCons", ifoBunkerCons);
	}

	public BigDecimal getIfoBunkerCons()
	{
		return (BigDecimal) readProperty("ifoBunkerCons");
	}

	public void setIfoCommktKey(Integer ifoCommktKey)
	{
		writeProperty("ifoCommktKey", ifoCommktKey);
	}

	public Integer getIfoCommktKey()
	{
		return (Integer) readProperty("ifoCommktKey");
	}

	public void setIfoManualPrice(BigDecimal ifoManualPrice)
	{
		writeProperty("ifoManualPrice", ifoManualPrice);
	}

	public BigDecimal getIfoManualPrice()
	{
		return (BigDecimal) readProperty("ifoManualPrice");
	}

	public void setIfoPriceSourceCode(String ifoPriceSourceCode)
	{
		writeProperty("ifoPriceSourceCode", ifoPriceSourceCode);
	}

	public String getIfoPriceSourceCode()
	{
		return (String) readProperty("ifoPriceSourceCode");
	}

	public void setMdoBunkerCons(BigDecimal mdoBunkerCons)
	{
		writeProperty("mdoBunkerCons", mdoBunkerCons);
	}

	public BigDecimal getMdoBunkerCons()
	{
		return (BigDecimal) readProperty("mdoBunkerCons");
	}

	public void setMdoCommktKey(Integer mdoCommktKey)
	{
		writeProperty("mdoCommktKey", mdoCommktKey);
	}

	public Integer getMdoCommktKey()
	{
		return (Integer) readProperty("mdoCommktKey");
	}

	public void setMdoManualPrice(BigDecimal mdoManualPrice)
	{
		writeProperty("mdoManualPrice", mdoManualPrice);
	}

	public BigDecimal getMdoManualPrice()
	{
		return (BigDecimal) readProperty("mdoManualPrice");
	}

	public void setMdoPriceSourceCode(String mdoPriceSourceCode)
	{
		writeProperty("mdoPriceSourceCode", mdoPriceSourceCode);
	}

	public String getMdoPriceSourceCode()
	{
		return (String) readProperty("mdoPriceSourceCode");
	}

	public void setOperation(String operation)
	{
		writeProperty("operation", operation);
	}

	public String getOperation()
	{
		return (String) readProperty("operation");
	}

	public void setPriceAdjustment(BigDecimal priceAdjustment)
	{
		writeProperty("priceAdjustment", priceAdjustment);
	}

	public BigDecimal getPriceAdjustment()
	{
		return (BigDecimal) readProperty("priceAdjustment");
	}

	public void setPriceCommkyKey(Integer priceCommkyKey)
	{
		writeProperty("priceCommkyKey", priceCommkyKey);
	}

	public Integer getPriceCommkyKey()
	{
		return (Integer) readProperty("priceCommkyKey");
	}

	public void setPriceSourceCode(String priceSourceCode)
	{
		writeProperty("priceSourceCode", priceSourceCode);
	}

	public String getPriceSourceCode()
	{
		return (String) readProperty("priceSourceCode");
	}

	public void setQuantity(BigDecimal quantity)
	{
		writeProperty("quantity", quantity);
	}

	public BigDecimal getQuantity()
	{
		return (BigDecimal) readProperty("quantity");
	}

	public void setStatus(String status)
	{
		writeProperty("status", status);
	}

	public String getStatus()
	{
		return (String) readProperty("status");
	}

	public void setTemplateId(Integer templateId)
	{
		writeProperty("templateId", templateId);
	}

	public Integer getTemplateId()
	{
		return (Integer) readProperty("templateId");
	}

	public void setTemplateName(String templateName)
	{
		writeProperty("templateName", templateName);
	}

	public String getTemplateName()
	{
		return (String) readProperty("templateName");
	}

	public void setUpdateDate(Date updateDate)
	{
		writeProperty("updateDate", updateDate);
	}

	public Date getUpdateDate()
	{
		return (Date) readProperty("updateDate");
	}

	public void setUpdateUser(String updateUser)
	{
		writeProperty("updateUser", updateUser);
	}

	public String getUpdateUser()
	{
		return (String) readProperty("updateUser");
	}

	public void setUserid(String userid)
	{
		writeProperty("userid", userid);
	}

	public String getUserid()
	{
		return (String) readProperty("userid");
	}

	public void setVesselId(String vesselId)
	{
		writeProperty("vesselId", vesselId);
	}

	public String getVesselId()
	{
		return (String) readProperty("vesselId");
	}

	public void setVesselName(String vesselName)
	{
		writeProperty("vesselName", vesselName);
	}

	public String getVesselName()
	{
		return (String) readProperty("vesselName");
	}

	public void setVoyageDuration(BigDecimal voyageDuration)
	{
		writeProperty("voyageDuration", voyageDuration);
	}

	public BigDecimal getVoyageDuration()
	{
		return (BigDecimal) readProperty("voyageDuration");
	}

}
