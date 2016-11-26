package com.tc.app.exchangemonitor.model.cayenne.persistent.auto;

import java.math.BigDecimal;
import java.util.Date;

import org.apache.cayenne.CayenneDataObject;
import org.apache.cayenne.exp.Property;

/**
 * Class _AudFlVePlanMaindata was generated by Cayenne.
 * It is probably a good idea to avoid changing this class manually,
 * since it may be overwritten next time code is regenerated.
 * If you need to make any customizations, please use subclass.
 */
public abstract class _AudFlVePlanMaindata extends CayenneDataObject
{

	private static final long serialVersionUID = 1L;

	public static final Property<Integer> ADDITIONAL_BUNKER = new Property<Integer>("additionalBunker");
	public static final Property<BigDecimal> ADDITIONAL_COSTS = new Property<BigDecimal>("additionalCosts");
	public static final Property<BigDecimal> ADDITIONAL_IDLE_TIME = new Property<BigDecimal>("additionalIdleTime");
	public static final Property<BigDecimal> ADDITIONAL_SAILING_TIME = new Property<BigDecimal>("additionalSailingTime");
	public static final Property<BigDecimal> BALLAST_BONUS = new Property<BigDecimal>("ballastBonus");
	public static final Property<String> BUNKER_CALCULATION_METHOD = new Property<String>("bunkerCalculationMethod");
	public static final Property<String> COMMENTS = new Property<String>("comments");
	public static final Property<BigDecimal> COMMISSION = new Property<BigDecimal>("commission");
	public static final Property<Date> DATE_OP = new Property<Date>("dateOp");
	public static final Property<String> DESCRIPTION = new Property<String>("description");
	public static final Property<Integer> ESTIMATOR_ID = new Property<Integer>("estimatorID");
	public static final Property<BigDecimal> FIXED_FOPRICE = new Property<BigDecimal>("fixedFOPrice");
	public static final Property<BigDecimal> FIXED_MDOPRICE = new Property<BigDecimal>("fixedMDOPrice");
	public static final Property<Double> FLAT_RATE = new Property<Double>("flatRate");
	public static final Property<BigDecimal> GTC = new Property<BigDecimal>("gtc");
	public static final Property<String> LAST_BALLAST_PORT = new Property<String>("lastBallastPort");
	public static final Property<BigDecimal> NTC = new Property<BigDecimal>("ntc");
	public static final Property<String> OPERATION = new Property<String>("operation");
	public static final Property<Date> START_DATE = new Property<Date>("startDate");
	public static final Property<String> START_PORT = new Property<String>("startPort");
	public static final Property<String> T_CCONTRACT_KEY = new Property<String>("tCContractKey");
	public static final Property<Boolean> T_CRATE_DEFINED = new Property<Boolean>("tCRateDefined");
	public static final Property<String> USERID = new Property<String>("userid");
	public static final Property<Integer> VESSELID = new Property<Integer>("vesselid");
	public static final Property<String> VOYAGE_KEY = new Property<String>("voyageKey");
	public static final Property<BigDecimal> W_SBALLAST_BONUS = new Property<BigDecimal>("wSBallastBonus");
	public static final Property<Double> W_SCOMMISSION = new Property<Double>("wSCommission");
	public static final Property<Boolean> W_SRATE_DEFINED = new Property<Boolean>("wSRateDefined");
	public static final Property<Double> WORLD_SCALE = new Property<Double>("worldScale");

	public void setAdditionalBunker(Integer additionalBunker)
	{
		writeProperty("additionalBunker", additionalBunker);
	}

	public Integer getAdditionalBunker()
	{
		return (Integer) readProperty("additionalBunker");
	}

	public void setAdditionalCosts(BigDecimal additionalCosts)
	{
		writeProperty("additionalCosts", additionalCosts);
	}

	public BigDecimal getAdditionalCosts()
	{
		return (BigDecimal) readProperty("additionalCosts");
	}

	public void setAdditionalIdleTime(BigDecimal additionalIdleTime)
	{
		writeProperty("additionalIdleTime", additionalIdleTime);
	}

	public BigDecimal getAdditionalIdleTime()
	{
		return (BigDecimal) readProperty("additionalIdleTime");
	}

	public void setAdditionalSailingTime(BigDecimal additionalSailingTime)
	{
		writeProperty("additionalSailingTime", additionalSailingTime);
	}

	public BigDecimal getAdditionalSailingTime()
	{
		return (BigDecimal) readProperty("additionalSailingTime");
	}

	public void setBallastBonus(BigDecimal ballastBonus)
	{
		writeProperty("ballastBonus", ballastBonus);
	}

	public BigDecimal getBallastBonus()
	{
		return (BigDecimal) readProperty("ballastBonus");
	}

	public void setBunkerCalculationMethod(String bunkerCalculationMethod)
	{
		writeProperty("bunkerCalculationMethod", bunkerCalculationMethod);
	}

	public String getBunkerCalculationMethod()
	{
		return (String) readProperty("bunkerCalculationMethod");
	}

	public void setComments(String comments)
	{
		writeProperty("comments", comments);
	}

	public String getComments()
	{
		return (String) readProperty("comments");
	}

	public void setCommission(BigDecimal commission)
	{
		writeProperty("commission", commission);
	}

	public BigDecimal getCommission()
	{
		return (BigDecimal) readProperty("commission");
	}

	public void setDateOp(Date dateOp)
	{
		writeProperty("dateOp", dateOp);
	}

	public Date getDateOp()
	{
		return (Date) readProperty("dateOp");
	}

	public void setDescription(String description)
	{
		writeProperty("description", description);
	}

	public String getDescription()
	{
		return (String) readProperty("description");
	}

	public void setEstimatorID(Integer estimatorID)
	{
		writeProperty("estimatorID", estimatorID);
	}

	public Integer getEstimatorID()
	{
		return (Integer) readProperty("estimatorID");
	}

	public void setFixedFOPrice(BigDecimal fixedFOPrice)
	{
		writeProperty("fixedFOPrice", fixedFOPrice);
	}

	public BigDecimal getFixedFOPrice()
	{
		return (BigDecimal) readProperty("fixedFOPrice");
	}

	public void setFixedMDOPrice(BigDecimal fixedMDOPrice)
	{
		writeProperty("fixedMDOPrice", fixedMDOPrice);
	}

	public BigDecimal getFixedMDOPrice()
	{
		return (BigDecimal) readProperty("fixedMDOPrice");
	}

	public void setFlatRate(Double flatRate)
	{
		writeProperty("flatRate", flatRate);
	}

	public Double getFlatRate()
	{
		return (Double) readProperty("flatRate");
	}

	public void setGtc(BigDecimal gtc)
	{
		writeProperty("gtc", gtc);
	}

	public BigDecimal getGtc()
	{
		return (BigDecimal) readProperty("gtc");
	}

	public void setLastBallastPort(String lastBallastPort)
	{
		writeProperty("lastBallastPort", lastBallastPort);
	}

	public String getLastBallastPort()
	{
		return (String) readProperty("lastBallastPort");
	}

	public void setNtc(BigDecimal ntc)
	{
		writeProperty("ntc", ntc);
	}

	public BigDecimal getNtc()
	{
		return (BigDecimal) readProperty("ntc");
	}

	public void setOperation(String operation)
	{
		writeProperty("operation", operation);
	}

	public String getOperation()
	{
		return (String) readProperty("operation");
	}

	public void setStartDate(Date startDate)
	{
		writeProperty("startDate", startDate);
	}

	public Date getStartDate()
	{
		return (Date) readProperty("startDate");
	}

	public void setStartPort(String startPort)
	{
		writeProperty("startPort", startPort);
	}

	public String getStartPort()
	{
		return (String) readProperty("startPort");
	}

	public void setTCContractKey(String tCContractKey)
	{
		writeProperty("tCContractKey", tCContractKey);
	}

	public String getTCContractKey()
	{
		return (String) readProperty("tCContractKey");
	}

	public void setTCRateDefined(Boolean tCRateDefined)
	{
		writeProperty("tCRateDefined", tCRateDefined);
	}

	public Boolean getTCRateDefined()
	{
		return (Boolean) readProperty("tCRateDefined");
	}

	public void setUserid(String userid)
	{
		writeProperty("userid", userid);
	}

	public String getUserid()
	{
		return (String) readProperty("userid");
	}

	public void setVesselid(Integer vesselid)
	{
		writeProperty("vesselid", vesselid);
	}

	public Integer getVesselid()
	{
		return (Integer) readProperty("vesselid");
	}

	public void setVoyageKey(String voyageKey)
	{
		writeProperty("voyageKey", voyageKey);
	}

	public String getVoyageKey()
	{
		return (String) readProperty("voyageKey");
	}

	public void setWSBallastBonus(BigDecimal wSBallastBonus)
	{
		writeProperty("wSBallastBonus", wSBallastBonus);
	}

	public BigDecimal getWSBallastBonus()
	{
		return (BigDecimal) readProperty("wSBallastBonus");
	}

	public void setWSCommission(Double wSCommission)
	{
		writeProperty("wSCommission", wSCommission);
	}

	public Double getWSCommission()
	{
		return (Double) readProperty("wSCommission");
	}

	public void setWSRateDefined(Boolean wSRateDefined)
	{
		writeProperty("wSRateDefined", wSRateDefined);
	}

	public Boolean getWSRateDefined()
	{
		return (Boolean) readProperty("wSRateDefined");
	}

	public void setWorldScale(Double worldScale)
	{
		writeProperty("worldScale", worldScale);
	}

	public Double getWorldScale()
	{
		return (Double) readProperty("worldScale");
	}

}
