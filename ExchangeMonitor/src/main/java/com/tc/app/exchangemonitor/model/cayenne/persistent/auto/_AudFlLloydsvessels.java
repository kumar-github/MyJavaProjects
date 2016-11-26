package com.tc.app.exchangemonitor.model.cayenne.persistent.auto;

import java.math.BigDecimal;
import java.util.Date;

import org.apache.cayenne.CayenneDataObject;
import org.apache.cayenne.exp.Property;

/**
 * Class _AudFlLloydsvessels was generated by Cayenne.
 * It is probably a good idea to avoid changing this class manually,
 * since it may be overwritten next time code is regenerated.
 * If you need to make any customizations, please use subclass.
 */
public abstract class _AudFlLloydsvessels extends CayenneDataObject
{

	private static final long serialVersionUID = 1L;

	public static final Property<Integer> BALE_CAPACITY = new Property<Integer>("baleCapacity");
	public static final Property<BigDecimal> BREADTH_EXTREME = new Property<BigDecimal>("breadthExtreme");
	public static final Property<BigDecimal> BREADTH_MOULDED = new Property<BigDecimal>("breadthMoulded");
	public static final Property<String> CARGO_CAPACITIES_NARRATIVE = new Property<String>("cargoCapacitiesNarrative");
	public static final Property<String> CLASS_NARRATIVE = new Property<String>("classNarrative");
	public static final Property<String> CLASSIFICATION_SOCIETY_CODE = new Property<String>("classificationSocietyCode");
	public static final Property<String> COUNTRY_OF_BUILD = new Property<String>("countryOfBuild");
	public static final Property<Date> DATE_OP = new Property<Date>("dateOp");
	public static final Property<Integer> DEADWEIGHT = new Property<Integer>("deadweight");
	public static final Property<BigDecimal> DEPTH = new Property<BigDecimal>("depth");
	public static final Property<BigDecimal> DRAUGHT = new Property<BigDecimal>("draught");
	public static final Property<String> EX_NAME = new Property<String>("exName");
	public static final Property<String> FLAG_NAME = new Property<String>("flagName");
	public static final Property<BigDecimal> FUEL_CONSUMPTION_MAIN_ENGINESONLY = new Property<BigDecimal>("fuelConsumptionMainEnginesonly");
	public static final Property<BigDecimal> FUEL_CONSUMPTION_TOTAL = new Property<BigDecimal>("fuelConsumptionTotal");
	public static final Property<BigDecimal> FUEL_TYPE1CAPACITY = new Property<BigDecimal>("fuelType1Capacity");
	public static final Property<String> FUEL_TYPE1FIRST = new Property<String>("fuelType1First");
	public static final Property<BigDecimal> FUEL_TYPE2CAPACITY = new Property<BigDecimal>("fuelType2Capacity");
	public static final Property<String> FUEL_TYPE2SECOND = new Property<String>("fuelType2Second");
	public static final Property<Integer> GAS_CAPACITY = new Property<Integer>("gasCapacity");
	public static final Property<String> GEAR_DESCRIPTIVE_NARRATIVE = new Property<String>("gearDescriptiveNarrative");
	public static final Property<String> GEARLESS = new Property<String>("gearless");
	public static final Property<Integer> GRAIN_CAPACITY = new Property<Integer>("grainCapacity");
	public static final Property<Integer> GROSS_TONNAGE = new Property<Integer>("grossTonnage");
	public static final Property<String> GROUP_BENEFICIAL_OWNER = new Property<String>("groupBeneficialOwner");
	public static final Property<String> GRP_BENEFIT_OWNER_COUNTRY_DOMICILE = new Property<String>("grpBenefitOwnerCountryDomicile");
	public static final Property<String> I_MOCHEMICAL_CLASS_I = new Property<String>("iMOChemicalClassI");
	public static final Property<String> I_MOCHEMICAL_CLASS_II = new Property<String>("iMOChemicalClassII");
	public static final Property<String> I_MOCHEMICAL_CLASS_III = new Property<String>("iMOChemicalClassIII");
	public static final Property<String> ICE_CAPABILITY_DESC_NARRATIVE = new Property<String>("iceCapabilityDescNarrative");
	public static final Property<String> INMARSAT_NUMBER_SAT_COMM_ID = new Property<String>("inmarsatNumberSatCommID");
	public static final Property<String> L_RIMOSHIP_NO = new Property<String>("lRIMOShipNo");
	public static final Property<BigDecimal> LENGTH_BETWEEN_PERPENDICULARS_LBP = new Property<BigDecimal>("lengthBetweenPerpendicularsLBP");
	public static final Property<BigDecimal> LENGTH_OVERALL_LOA = new Property<BigDecimal>("lengthOverallLOA");
	public static final Property<Integer> LIQUID_CAPACITY = new Property<Integer>("liquidCapacity");
	public static final Property<String> MAIN_ENGINE_BUILDER = new Property<String>("mainEngineBuilder");
	public static final Property<String> MAIN_ENGINE_DESIGNER = new Property<String>("mainEngineDesigner");
	public static final Property<String> MAIN_ENGINE_MODEL = new Property<String>("mainEngineModel");
	public static final Property<String> MARITIME_MOBILE_SERV_ID_MMSINUMBER = new Property<String>("maritimeMobileServIdMMSINumber");
	public static final Property<Integer> NET_TONNAGE = new Property<Integer>("netTonnage");
	public static final Property<Integer> NUMBER_OF_ALL_ENGINES = new Property<Integer>("numberOfAllEngines");
	public static final Property<Integer> NUMBER_OF_AUXILIARY_ENGINES = new Property<Integer>("numberOfAuxiliaryEngines");
	public static final Property<Integer> NUMBER_OF_PROPULSION_UNITS = new Property<Integer>("numberOfPropulsionUnits");
	public static final Property<Integer> NUMBEROF_HATCHES = new Property<Integer>("numberofHatches");
	public static final Property<Integer> NUMBEROF_HOLDS = new Property<Integer>("numberofHolds");
	public static final Property<Integer> NUMBEROF_MAIN_ENGINES = new Property<Integer>("numberofMainEngines");
	public static final Property<Integer> NUMBEROF_TANKS = new Property<Integer>("numberofTanks");
	public static final Property<String> OFFICIAL_NUMBER = new Property<String>("officialNumber");
	public static final Property<String> OPERATION = new Property<String>("operation");
	public static final Property<String> OPERATOR = new Property<String>("operator");
	public static final Property<String> OPERATOR_COUNTRYOF_DOMICILE_NAME = new Property<String>("operatorCountryofDomicileName");
	public static final Property<Integer> PANAMA_CANAL_NET_TONNAGE_PCNT = new Property<Integer>("panamaCanalNetTonnagePCNT");
	public static final Property<String> PAND_ICLUB = new Property<String>("pandIClub");
	public static final Property<String> PORTOF_REGISTRY = new Property<String>("portofRegistry");
	public static final Property<Integer> POWERBHPIHPSHPMAX = new Property<Integer>("powerbhpihpshpmax");
	public static final Property<Integer> POWERBHPIHPSHPSERVICE = new Property<Integer>("powerbhpihpshpservice");
	public static final Property<Integer> POWERKWMAX = new Property<Integer>("powerkwmax");
	public static final Property<Integer> POWERKWSERVICE = new Property<Integer>("powerkwservice");
	public static final Property<String> REGISTERED_OWNER = new Property<String>("registeredOwner");
	public static final Property<String> REGISTERED_OWNER_COUNTRY_DOMICILE = new Property<String>("registeredOwnerCountryDomicile");
	public static final Property<String> SEGREGATED_BALLAST_TANKS = new Property<String>("segregatedBallastTanks");
	public static final Property<String> SHIP_MANAGER = new Property<String>("shipManager");
	public static final Property<String> SHIP_MANAGER_COUNTRY_DOMICILE_NAME = new Property<String>("shipManagerCountryDomicileName");
	public static final Property<String> SHIP_NAME = new Property<String>("shipName");
	public static final Property<String> SHIP_STATUS = new Property<String>("shipStatus");
	public static final Property<String> SHIP_STATUS_EFFECTIVE_DATE = new Property<String>("shipStatusEffectiveDate");
	public static final Property<String> SHIPBUILDER = new Property<String>("shipbuilder");
	public static final Property<String> SHIPTYPE_GROUP = new Property<String>("shiptypeGroup");
	public static final Property<String> SHIPTYPE_LEVEL5 = new Property<String>("shiptypeLevel5");
	public static final Property<BigDecimal> SPEED = new Property<BigDecimal>("speed");
	public static final Property<Integer> SUEZ_CANAL_NET_TONNAGE_SCNT = new Property<Integer>("suezCanalNetTonnageSCNT");
	public static final Property<String> TECH_MANAGER_COUNTRY_DOMICILE = new Property<String>("techManagerCountryDomicile");
	public static final Property<String> TECHNICAL_MANAGER = new Property<String>("technicalManager");
	public static final Property<Integer> TEU = new Property<Integer>("teu");
	public static final Property<String> USERID = new Property<String>("userid");
	public static final Property<String> YARD_NUMBER = new Property<String>("yardNumber");
	public static final Property<String> YEAR_OF_BUILD = new Property<String>("yearOfBuild");

	public void setBaleCapacity(Integer baleCapacity)
	{
		writeProperty("baleCapacity", baleCapacity);
	}

	public Integer getBaleCapacity()
	{
		return (Integer) readProperty("baleCapacity");
	}

	public void setBreadthExtreme(BigDecimal breadthExtreme)
	{
		writeProperty("breadthExtreme", breadthExtreme);
	}

	public BigDecimal getBreadthExtreme()
	{
		return (BigDecimal) readProperty("breadthExtreme");
	}

	public void setBreadthMoulded(BigDecimal breadthMoulded)
	{
		writeProperty("breadthMoulded", breadthMoulded);
	}

	public BigDecimal getBreadthMoulded()
	{
		return (BigDecimal) readProperty("breadthMoulded");
	}

	public void setCargoCapacitiesNarrative(String cargoCapacitiesNarrative)
	{
		writeProperty("cargoCapacitiesNarrative", cargoCapacitiesNarrative);
	}

	public String getCargoCapacitiesNarrative()
	{
		return (String) readProperty("cargoCapacitiesNarrative");
	}

	public void setClassNarrative(String classNarrative)
	{
		writeProperty("classNarrative", classNarrative);
	}

	public String getClassNarrative()
	{
		return (String) readProperty("classNarrative");
	}

	public void setClassificationSocietyCode(String classificationSocietyCode)
	{
		writeProperty("classificationSocietyCode", classificationSocietyCode);
	}

	public String getClassificationSocietyCode()
	{
		return (String) readProperty("classificationSocietyCode");
	}

	public void setCountryOfBuild(String countryOfBuild)
	{
		writeProperty("countryOfBuild", countryOfBuild);
	}

	public String getCountryOfBuild()
	{
		return (String) readProperty("countryOfBuild");
	}

	public void setDateOp(Date dateOp)
	{
		writeProperty("dateOp", dateOp);
	}

	public Date getDateOp()
	{
		return (Date) readProperty("dateOp");
	}

	public void setDeadweight(Integer deadweight)
	{
		writeProperty("deadweight", deadweight);
	}

	public Integer getDeadweight()
	{
		return (Integer) readProperty("deadweight");
	}

	public void setDepth(BigDecimal depth)
	{
		writeProperty("depth", depth);
	}

	public BigDecimal getDepth()
	{
		return (BigDecimal) readProperty("depth");
	}

	public void setDraught(BigDecimal draught)
	{
		writeProperty("draught", draught);
	}

	public BigDecimal getDraught()
	{
		return (BigDecimal) readProperty("draught");
	}

	public void setExName(String exName)
	{
		writeProperty("exName", exName);
	}

	public String getExName()
	{
		return (String) readProperty("exName");
	}

	public void setFlagName(String flagName)
	{
		writeProperty("flagName", flagName);
	}

	public String getFlagName()
	{
		return (String) readProperty("flagName");
	}

	public void setFuelConsumptionMainEnginesonly(BigDecimal fuelConsumptionMainEnginesonly)
	{
		writeProperty("fuelConsumptionMainEnginesonly", fuelConsumptionMainEnginesonly);
	}

	public BigDecimal getFuelConsumptionMainEnginesonly()
	{
		return (BigDecimal) readProperty("fuelConsumptionMainEnginesonly");
	}

	public void setFuelConsumptionTotal(BigDecimal fuelConsumptionTotal)
	{
		writeProperty("fuelConsumptionTotal", fuelConsumptionTotal);
	}

	public BigDecimal getFuelConsumptionTotal()
	{
		return (BigDecimal) readProperty("fuelConsumptionTotal");
	}

	public void setFuelType1Capacity(BigDecimal fuelType1Capacity)
	{
		writeProperty("fuelType1Capacity", fuelType1Capacity);
	}

	public BigDecimal getFuelType1Capacity()
	{
		return (BigDecimal) readProperty("fuelType1Capacity");
	}

	public void setFuelType1First(String fuelType1First)
	{
		writeProperty("fuelType1First", fuelType1First);
	}

	public String getFuelType1First()
	{
		return (String) readProperty("fuelType1First");
	}

	public void setFuelType2Capacity(BigDecimal fuelType2Capacity)
	{
		writeProperty("fuelType2Capacity", fuelType2Capacity);
	}

	public BigDecimal getFuelType2Capacity()
	{
		return (BigDecimal) readProperty("fuelType2Capacity");
	}

	public void setFuelType2Second(String fuelType2Second)
	{
		writeProperty("fuelType2Second", fuelType2Second);
	}

	public String getFuelType2Second()
	{
		return (String) readProperty("fuelType2Second");
	}

	public void setGasCapacity(Integer gasCapacity)
	{
		writeProperty("gasCapacity", gasCapacity);
	}

	public Integer getGasCapacity()
	{
		return (Integer) readProperty("gasCapacity");
	}

	public void setGearDescriptiveNarrative(String gearDescriptiveNarrative)
	{
		writeProperty("gearDescriptiveNarrative", gearDescriptiveNarrative);
	}

	public String getGearDescriptiveNarrative()
	{
		return (String) readProperty("gearDescriptiveNarrative");
	}

	public void setGearless(String gearless)
	{
		writeProperty("gearless", gearless);
	}

	public String getGearless()
	{
		return (String) readProperty("gearless");
	}

	public void setGrainCapacity(Integer grainCapacity)
	{
		writeProperty("grainCapacity", grainCapacity);
	}

	public Integer getGrainCapacity()
	{
		return (Integer) readProperty("grainCapacity");
	}

	public void setGrossTonnage(Integer grossTonnage)
	{
		writeProperty("grossTonnage", grossTonnage);
	}

	public Integer getGrossTonnage()
	{
		return (Integer) readProperty("grossTonnage");
	}

	public void setGroupBeneficialOwner(String groupBeneficialOwner)
	{
		writeProperty("groupBeneficialOwner", groupBeneficialOwner);
	}

	public String getGroupBeneficialOwner()
	{
		return (String) readProperty("groupBeneficialOwner");
	}

	public void setGrpBenefitOwnerCountryDomicile(String grpBenefitOwnerCountryDomicile)
	{
		writeProperty("grpBenefitOwnerCountryDomicile", grpBenefitOwnerCountryDomicile);
	}

	public String getGrpBenefitOwnerCountryDomicile()
	{
		return (String) readProperty("grpBenefitOwnerCountryDomicile");
	}

	public void setIMOChemicalClassI(String iMOChemicalClassI)
	{
		writeProperty("iMOChemicalClassI", iMOChemicalClassI);
	}

	public String getIMOChemicalClassI()
	{
		return (String) readProperty("iMOChemicalClassI");
	}

	public void setIMOChemicalClassII(String iMOChemicalClassII)
	{
		writeProperty("iMOChemicalClassII", iMOChemicalClassII);
	}

	public String getIMOChemicalClassII()
	{
		return (String) readProperty("iMOChemicalClassII");
	}

	public void setIMOChemicalClassIII(String iMOChemicalClassIII)
	{
		writeProperty("iMOChemicalClassIII", iMOChemicalClassIII);
	}

	public String getIMOChemicalClassIII()
	{
		return (String) readProperty("iMOChemicalClassIII");
	}

	public void setIceCapabilityDescNarrative(String iceCapabilityDescNarrative)
	{
		writeProperty("iceCapabilityDescNarrative", iceCapabilityDescNarrative);
	}

	public String getIceCapabilityDescNarrative()
	{
		return (String) readProperty("iceCapabilityDescNarrative");
	}

	public void setInmarsatNumberSatCommID(String inmarsatNumberSatCommID)
	{
		writeProperty("inmarsatNumberSatCommID", inmarsatNumberSatCommID);
	}

	public String getInmarsatNumberSatCommID()
	{
		return (String) readProperty("inmarsatNumberSatCommID");
	}

	public void setLRIMOShipNo(String lRIMOShipNo)
	{
		writeProperty("lRIMOShipNo", lRIMOShipNo);
	}

	public String getLRIMOShipNo()
	{
		return (String) readProperty("lRIMOShipNo");
	}

	public void setLengthBetweenPerpendicularsLBP(BigDecimal lengthBetweenPerpendicularsLBP)
	{
		writeProperty("lengthBetweenPerpendicularsLBP", lengthBetweenPerpendicularsLBP);
	}

	public BigDecimal getLengthBetweenPerpendicularsLBP()
	{
		return (BigDecimal) readProperty("lengthBetweenPerpendicularsLBP");
	}

	public void setLengthOverallLOA(BigDecimal lengthOverallLOA)
	{
		writeProperty("lengthOverallLOA", lengthOverallLOA);
	}

	public BigDecimal getLengthOverallLOA()
	{
		return (BigDecimal) readProperty("lengthOverallLOA");
	}

	public void setLiquidCapacity(Integer liquidCapacity)
	{
		writeProperty("liquidCapacity", liquidCapacity);
	}

	public Integer getLiquidCapacity()
	{
		return (Integer) readProperty("liquidCapacity");
	}

	public void setMainEngineBuilder(String mainEngineBuilder)
	{
		writeProperty("mainEngineBuilder", mainEngineBuilder);
	}

	public String getMainEngineBuilder()
	{
		return (String) readProperty("mainEngineBuilder");
	}

	public void setMainEngineDesigner(String mainEngineDesigner)
	{
		writeProperty("mainEngineDesigner", mainEngineDesigner);
	}

	public String getMainEngineDesigner()
	{
		return (String) readProperty("mainEngineDesigner");
	}

	public void setMainEngineModel(String mainEngineModel)
	{
		writeProperty("mainEngineModel", mainEngineModel);
	}

	public String getMainEngineModel()
	{
		return (String) readProperty("mainEngineModel");
	}

	public void setMaritimeMobileServIdMMSINumber(String maritimeMobileServIdMMSINumber)
	{
		writeProperty("maritimeMobileServIdMMSINumber", maritimeMobileServIdMMSINumber);
	}

	public String getMaritimeMobileServIdMMSINumber()
	{
		return (String) readProperty("maritimeMobileServIdMMSINumber");
	}

	public void setNetTonnage(Integer netTonnage)
	{
		writeProperty("netTonnage", netTonnage);
	}

	public Integer getNetTonnage()
	{
		return (Integer) readProperty("netTonnage");
	}

	public void setNumberOfAllEngines(Integer numberOfAllEngines)
	{
		writeProperty("numberOfAllEngines", numberOfAllEngines);
	}

	public Integer getNumberOfAllEngines()
	{
		return (Integer) readProperty("numberOfAllEngines");
	}

	public void setNumberOfAuxiliaryEngines(Integer numberOfAuxiliaryEngines)
	{
		writeProperty("numberOfAuxiliaryEngines", numberOfAuxiliaryEngines);
	}

	public Integer getNumberOfAuxiliaryEngines()
	{
		return (Integer) readProperty("numberOfAuxiliaryEngines");
	}

	public void setNumberOfPropulsionUnits(Integer numberOfPropulsionUnits)
	{
		writeProperty("numberOfPropulsionUnits", numberOfPropulsionUnits);
	}

	public Integer getNumberOfPropulsionUnits()
	{
		return (Integer) readProperty("numberOfPropulsionUnits");
	}

	public void setNumberofHatches(Integer numberofHatches)
	{
		writeProperty("numberofHatches", numberofHatches);
	}

	public Integer getNumberofHatches()
	{
		return (Integer) readProperty("numberofHatches");
	}

	public void setNumberofHolds(Integer numberofHolds)
	{
		writeProperty("numberofHolds", numberofHolds);
	}

	public Integer getNumberofHolds()
	{
		return (Integer) readProperty("numberofHolds");
	}

	public void setNumberofMainEngines(Integer numberofMainEngines)
	{
		writeProperty("numberofMainEngines", numberofMainEngines);
	}

	public Integer getNumberofMainEngines()
	{
		return (Integer) readProperty("numberofMainEngines");
	}

	public void setNumberofTanks(Integer numberofTanks)
	{
		writeProperty("numberofTanks", numberofTanks);
	}

	public Integer getNumberofTanks()
	{
		return (Integer) readProperty("numberofTanks");
	}

	public void setOfficialNumber(String officialNumber)
	{
		writeProperty("officialNumber", officialNumber);
	}

	public String getOfficialNumber()
	{
		return (String) readProperty("officialNumber");
	}

	public void setOperation(String operation)
	{
		writeProperty("operation", operation);
	}

	public String getOperation()
	{
		return (String) readProperty("operation");
	}

	public void setOperator(String operator)
	{
		writeProperty("operator", operator);
	}

	public String getOperator()
	{
		return (String) readProperty("operator");
	}

	public void setOperatorCountryofDomicileName(String operatorCountryofDomicileName)
	{
		writeProperty("operatorCountryofDomicileName", operatorCountryofDomicileName);
	}

	public String getOperatorCountryofDomicileName()
	{
		return (String) readProperty("operatorCountryofDomicileName");
	}

	public void setPanamaCanalNetTonnagePCNT(Integer panamaCanalNetTonnagePCNT)
	{
		writeProperty("panamaCanalNetTonnagePCNT", panamaCanalNetTonnagePCNT);
	}

	public Integer getPanamaCanalNetTonnagePCNT()
	{
		return (Integer) readProperty("panamaCanalNetTonnagePCNT");
	}

	public void setPandIClub(String pandIClub)
	{
		writeProperty("pandIClub", pandIClub);
	}

	public String getPandIClub()
	{
		return (String) readProperty("pandIClub");
	}

	public void setPortofRegistry(String portofRegistry)
	{
		writeProperty("portofRegistry", portofRegistry);
	}

	public String getPortofRegistry()
	{
		return (String) readProperty("portofRegistry");
	}

	public void setPowerbhpihpshpmax(Integer powerbhpihpshpmax)
	{
		writeProperty("powerbhpihpshpmax", powerbhpihpshpmax);
	}

	public Integer getPowerbhpihpshpmax()
	{
		return (Integer) readProperty("powerbhpihpshpmax");
	}

	public void setPowerbhpihpshpservice(Integer powerbhpihpshpservice)
	{
		writeProperty("powerbhpihpshpservice", powerbhpihpshpservice);
	}

	public Integer getPowerbhpihpshpservice()
	{
		return (Integer) readProperty("powerbhpihpshpservice");
	}

	public void setPowerkwmax(Integer powerkwmax)
	{
		writeProperty("powerkwmax", powerkwmax);
	}

	public Integer getPowerkwmax()
	{
		return (Integer) readProperty("powerkwmax");
	}

	public void setPowerkwservice(Integer powerkwservice)
	{
		writeProperty("powerkwservice", powerkwservice);
	}

	public Integer getPowerkwservice()
	{
		return (Integer) readProperty("powerkwservice");
	}

	public void setRegisteredOwner(String registeredOwner)
	{
		writeProperty("registeredOwner", registeredOwner);
	}

	public String getRegisteredOwner()
	{
		return (String) readProperty("registeredOwner");
	}

	public void setRegisteredOwnerCountryDomicile(String registeredOwnerCountryDomicile)
	{
		writeProperty("registeredOwnerCountryDomicile", registeredOwnerCountryDomicile);
	}

	public String getRegisteredOwnerCountryDomicile()
	{
		return (String) readProperty("registeredOwnerCountryDomicile");
	}

	public void setSegregatedBallastTanks(String segregatedBallastTanks)
	{
		writeProperty("segregatedBallastTanks", segregatedBallastTanks);
	}

	public String getSegregatedBallastTanks()
	{
		return (String) readProperty("segregatedBallastTanks");
	}

	public void setShipManager(String shipManager)
	{
		writeProperty("shipManager", shipManager);
	}

	public String getShipManager()
	{
		return (String) readProperty("shipManager");
	}

	public void setShipManagerCountryDomicileName(String shipManagerCountryDomicileName)
	{
		writeProperty("shipManagerCountryDomicileName", shipManagerCountryDomicileName);
	}

	public String getShipManagerCountryDomicileName()
	{
		return (String) readProperty("shipManagerCountryDomicileName");
	}

	public void setShipName(String shipName)
	{
		writeProperty("shipName", shipName);
	}

	public String getShipName()
	{
		return (String) readProperty("shipName");
	}

	public void setShipStatus(String shipStatus)
	{
		writeProperty("shipStatus", shipStatus);
	}

	public String getShipStatus()
	{
		return (String) readProperty("shipStatus");
	}

	public void setShipStatusEffectiveDate(String shipStatusEffectiveDate)
	{
		writeProperty("shipStatusEffectiveDate", shipStatusEffectiveDate);
	}

	public String getShipStatusEffectiveDate()
	{
		return (String) readProperty("shipStatusEffectiveDate");
	}

	public void setShipbuilder(String shipbuilder)
	{
		writeProperty("shipbuilder", shipbuilder);
	}

	public String getShipbuilder()
	{
		return (String) readProperty("shipbuilder");
	}

	public void setShiptypeGroup(String shiptypeGroup)
	{
		writeProperty("shiptypeGroup", shiptypeGroup);
	}

	public String getShiptypeGroup()
	{
		return (String) readProperty("shiptypeGroup");
	}

	public void setShiptypeLevel5(String shiptypeLevel5)
	{
		writeProperty("shiptypeLevel5", shiptypeLevel5);
	}

	public String getShiptypeLevel5()
	{
		return (String) readProperty("shiptypeLevel5");
	}

	public void setSpeed(BigDecimal speed)
	{
		writeProperty("speed", speed);
	}

	public BigDecimal getSpeed()
	{
		return (BigDecimal) readProperty("speed");
	}

	public void setSuezCanalNetTonnageSCNT(Integer suezCanalNetTonnageSCNT)
	{
		writeProperty("suezCanalNetTonnageSCNT", suezCanalNetTonnageSCNT);
	}

	public Integer getSuezCanalNetTonnageSCNT()
	{
		return (Integer) readProperty("suezCanalNetTonnageSCNT");
	}

	public void setTechManagerCountryDomicile(String techManagerCountryDomicile)
	{
		writeProperty("techManagerCountryDomicile", techManagerCountryDomicile);
	}

	public String getTechManagerCountryDomicile()
	{
		return (String) readProperty("techManagerCountryDomicile");
	}

	public void setTechnicalManager(String technicalManager)
	{
		writeProperty("technicalManager", technicalManager);
	}

	public String getTechnicalManager()
	{
		return (String) readProperty("technicalManager");
	}

	public void setTeu(Integer teu)
	{
		writeProperty("teu", teu);
	}

	public Integer getTeu()
	{
		return (Integer) readProperty("teu");
	}

	public void setUserid(String userid)
	{
		writeProperty("userid", userid);
	}

	public String getUserid()
	{
		return (String) readProperty("userid");
	}

	public void setYardNumber(String yardNumber)
	{
		writeProperty("yardNumber", yardNumber);
	}

	public String getYardNumber()
	{
		return (String) readProperty("yardNumber");
	}

	public void setYearOfBuild(String yearOfBuild)
	{
		writeProperty("yearOfBuild", yearOfBuild);
	}

	public String getYearOfBuild()
	{
		return (String) readProperty("yearOfBuild");
	}

}
