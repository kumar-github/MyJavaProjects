package com.tc.app.exchangemonitor.model.cayenne.persistent.auto;

import java.math.BigDecimal;
import java.util.Date;

import org.apache.cayenne.CayenneDataObject;
import org.apache.cayenne.exp.Property;

/**
 * Class _TiPSMVolSpot was generated by Cayenne.
 * It is probably a good idea to avoid changing this class manually,
 * since it may be overwritten next time code is regenerated.
 * If you need to make any customizations, please use subclass.
 */
public abstract class _TiPSMVolSpot extends CayenneDataObject
{

	private static final long serialVersionUID = 1L;

	public static final String OID_PK_COLUMN = "oid";

	public static final Property<String> COMP_MATERIAL1 = new Property<String>("compMaterial1");
	public static final Property<String> COMP_MATERIAL10 = new Property<String>("compMaterial10");
	public static final Property<BigDecimal> COMP_MATERIAL10QTY = new Property<BigDecimal>("compMaterial10Qty");
	public static final Property<BigDecimal> COMP_MATERIAL1QTY = new Property<BigDecimal>("compMaterial1Qty");
	public static final Property<String> COMP_MATERIAL2 = new Property<String>("compMaterial2");
	public static final Property<BigDecimal> COMP_MATERIAL2QTY = new Property<BigDecimal>("compMaterial2Qty");
	public static final Property<String> COMP_MATERIAL3 = new Property<String>("compMaterial3");
	public static final Property<BigDecimal> COMP_MATERIAL3QTY = new Property<BigDecimal>("compMaterial3Qty");
	public static final Property<String> COMP_MATERIAL4 = new Property<String>("compMaterial4");
	public static final Property<BigDecimal> COMP_MATERIAL4QTY = new Property<BigDecimal>("compMaterial4Qty");
	public static final Property<String> COMP_MATERIAL5 = new Property<String>("compMaterial5");
	public static final Property<BigDecimal> COMP_MATERIAL5QTY = new Property<BigDecimal>("compMaterial5Qty");
	public static final Property<String> COMP_MATERIAL6 = new Property<String>("compMaterial6");
	public static final Property<BigDecimal> COMP_MATERIAL6QTY = new Property<BigDecimal>("compMaterial6Qty");
	public static final Property<String> COMP_MATERIAL7 = new Property<String>("compMaterial7");
	public static final Property<BigDecimal> COMP_MATERIAL7QTY = new Property<BigDecimal>("compMaterial7Qty");
	public static final Property<String> COMP_MATERIAL8 = new Property<String>("compMaterial8");
	public static final Property<BigDecimal> COMP_MATERIAL8QTY = new Property<BigDecimal>("compMaterial8Qty");
	public static final Property<String> COMP_MATERIAL9 = new Property<String>("compMaterial9");
	public static final Property<BigDecimal> COMP_MATERIAL9QTY = new Property<BigDecimal>("compMaterial9Qty");
	public static final Property<String> CONTRACT_ITEM = new Property<String>("contractItem");
	public static final Property<String> CONTRACT_NUMBER = new Property<String>("contractNumber");
	public static final Property<Date> DELIVERY_DATE = new Property<Date>("deliveryDate");
	public static final Property<String> DOCUMENT_INDICATOR = new Property<String>("documentIndicator");
	public static final Property<Date> ETL_TIMESTAMP = new Property<Date>("etlTimestamp");
	public static final Property<String> ISSUE_LOCATION = new Property<String>("issueLocation");
	public static final Property<String> MATERIAL = new Property<String>("material");
	public static final Property<String> MATERIAL_DOC_ITEM = new Property<String>("materialDocItem");
	public static final Property<String> MATERIAL_DOC_NUMBER = new Property<String>("materialDocNumber");
	public static final Property<Integer> MATERIAL_DOC_YEAR = new Property<Integer>("materialDocYear");
	public static final Property<String> MOT = new Property<String>("mot");
	public static final Property<String> MOVEMENT_TYPE = new Property<String>("movementType");
	public static final Property<String> MOVEMENT_VOLUME_TYPE = new Property<String>("movementVolumeType");
	public static final Property<String> NOMIN_KEY = new Property<String>("nominKey");
	public static final Property<String> NOMIN_KEY_ITEM = new Property<String>("nominKeyItem");
	public static final Property<String> PW_ISSUE_LOCATION = new Property<String>("pwIssueLocation");
	public static final Property<String> PW_MATERIAL = new Property<String>("pwMaterial");
	public static final Property<String> PW_RECEIVE_LOCATION = new Property<String>("pwReceiveLocation");
	public static final Property<String> RECEIVE_LOCATION = new Property<String>("receiveLocation");
	public static final Property<String> REFERENCE_DOCUMENT_TYPE = new Property<String>("referenceDocumentType");
	public static final Property<String> REVERSAL_MATERIAL_DOC_ITEM = new Property<String>("reversalMaterialDocItem");
	public static final Property<String> REVERSAL_MATERIAL_DOC_NUMBER = new Property<String>("reversalMaterialDocNumber");
	public static final Property<Integer> REVERSAL_MATERIAL_DOC_YEAR = new Property<Integer>("reversalMaterialDocYear");
	public static final Property<String> SCHEDULE_TYPE = new Property<String>("scheduleType");
	public static final Property<String> UOM = new Property<String>("uom");
	public static final Property<BigDecimal> VOLUME = new Property<BigDecimal>("volume");

	public void setCompMaterial1(String compMaterial1)
	{
		writeProperty("compMaterial1", compMaterial1);
	}

	public String getCompMaterial1()
	{
		return (String) readProperty("compMaterial1");
	}

	public void setCompMaterial10(String compMaterial10)
	{
		writeProperty("compMaterial10", compMaterial10);
	}

	public String getCompMaterial10()
	{
		return (String) readProperty("compMaterial10");
	}

	public void setCompMaterial10Qty(BigDecimal compMaterial10Qty)
	{
		writeProperty("compMaterial10Qty", compMaterial10Qty);
	}

	public BigDecimal getCompMaterial10Qty()
	{
		return (BigDecimal) readProperty("compMaterial10Qty");
	}

	public void setCompMaterial1Qty(BigDecimal compMaterial1Qty)
	{
		writeProperty("compMaterial1Qty", compMaterial1Qty);
	}

	public BigDecimal getCompMaterial1Qty()
	{
		return (BigDecimal) readProperty("compMaterial1Qty");
	}

	public void setCompMaterial2(String compMaterial2)
	{
		writeProperty("compMaterial2", compMaterial2);
	}

	public String getCompMaterial2()
	{
		return (String) readProperty("compMaterial2");
	}

	public void setCompMaterial2Qty(BigDecimal compMaterial2Qty)
	{
		writeProperty("compMaterial2Qty", compMaterial2Qty);
	}

	public BigDecimal getCompMaterial2Qty()
	{
		return (BigDecimal) readProperty("compMaterial2Qty");
	}

	public void setCompMaterial3(String compMaterial3)
	{
		writeProperty("compMaterial3", compMaterial3);
	}

	public String getCompMaterial3()
	{
		return (String) readProperty("compMaterial3");
	}

	public void setCompMaterial3Qty(BigDecimal compMaterial3Qty)
	{
		writeProperty("compMaterial3Qty", compMaterial3Qty);
	}

	public BigDecimal getCompMaterial3Qty()
	{
		return (BigDecimal) readProperty("compMaterial3Qty");
	}

	public void setCompMaterial4(String compMaterial4)
	{
		writeProperty("compMaterial4", compMaterial4);
	}

	public String getCompMaterial4()
	{
		return (String) readProperty("compMaterial4");
	}

	public void setCompMaterial4Qty(BigDecimal compMaterial4Qty)
	{
		writeProperty("compMaterial4Qty", compMaterial4Qty);
	}

	public BigDecimal getCompMaterial4Qty()
	{
		return (BigDecimal) readProperty("compMaterial4Qty");
	}

	public void setCompMaterial5(String compMaterial5)
	{
		writeProperty("compMaterial5", compMaterial5);
	}

	public String getCompMaterial5()
	{
		return (String) readProperty("compMaterial5");
	}

	public void setCompMaterial5Qty(BigDecimal compMaterial5Qty)
	{
		writeProperty("compMaterial5Qty", compMaterial5Qty);
	}

	public BigDecimal getCompMaterial5Qty()
	{
		return (BigDecimal) readProperty("compMaterial5Qty");
	}

	public void setCompMaterial6(String compMaterial6)
	{
		writeProperty("compMaterial6", compMaterial6);
	}

	public String getCompMaterial6()
	{
		return (String) readProperty("compMaterial6");
	}

	public void setCompMaterial6Qty(BigDecimal compMaterial6Qty)
	{
		writeProperty("compMaterial6Qty", compMaterial6Qty);
	}

	public BigDecimal getCompMaterial6Qty()
	{
		return (BigDecimal) readProperty("compMaterial6Qty");
	}

	public void setCompMaterial7(String compMaterial7)
	{
		writeProperty("compMaterial7", compMaterial7);
	}

	public String getCompMaterial7()
	{
		return (String) readProperty("compMaterial7");
	}

	public void setCompMaterial7Qty(BigDecimal compMaterial7Qty)
	{
		writeProperty("compMaterial7Qty", compMaterial7Qty);
	}

	public BigDecimal getCompMaterial7Qty()
	{
		return (BigDecimal) readProperty("compMaterial7Qty");
	}

	public void setCompMaterial8(String compMaterial8)
	{
		writeProperty("compMaterial8", compMaterial8);
	}

	public String getCompMaterial8()
	{
		return (String) readProperty("compMaterial8");
	}

	public void setCompMaterial8Qty(BigDecimal compMaterial8Qty)
	{
		writeProperty("compMaterial8Qty", compMaterial8Qty);
	}

	public BigDecimal getCompMaterial8Qty()
	{
		return (BigDecimal) readProperty("compMaterial8Qty");
	}

	public void setCompMaterial9(String compMaterial9)
	{
		writeProperty("compMaterial9", compMaterial9);
	}

	public String getCompMaterial9()
	{
		return (String) readProperty("compMaterial9");
	}

	public void setCompMaterial9Qty(BigDecimal compMaterial9Qty)
	{
		writeProperty("compMaterial9Qty", compMaterial9Qty);
	}

	public BigDecimal getCompMaterial9Qty()
	{
		return (BigDecimal) readProperty("compMaterial9Qty");
	}

	public void setContractItem(String contractItem)
	{
		writeProperty("contractItem", contractItem);
	}

	public String getContractItem()
	{
		return (String) readProperty("contractItem");
	}

	public void setContractNumber(String contractNumber)
	{
		writeProperty("contractNumber", contractNumber);
	}

	public String getContractNumber()
	{
		return (String) readProperty("contractNumber");
	}

	public void setDeliveryDate(Date deliveryDate)
	{
		writeProperty("deliveryDate", deliveryDate);
	}

	public Date getDeliveryDate()
	{
		return (Date) readProperty("deliveryDate");
	}

	public void setDocumentIndicator(String documentIndicator)
	{
		writeProperty("documentIndicator", documentIndicator);
	}

	public String getDocumentIndicator()
	{
		return (String) readProperty("documentIndicator");
	}

	public void setEtlTimestamp(Date etlTimestamp)
	{
		writeProperty("etlTimestamp", etlTimestamp);
	}

	public Date getEtlTimestamp()
	{
		return (Date) readProperty("etlTimestamp");
	}

	public void setIssueLocation(String issueLocation)
	{
		writeProperty("issueLocation", issueLocation);
	}

	public String getIssueLocation()
	{
		return (String) readProperty("issueLocation");
	}

	public void setMaterial(String material)
	{
		writeProperty("material", material);
	}

	public String getMaterial()
	{
		return (String) readProperty("material");
	}

	public void setMaterialDocItem(String materialDocItem)
	{
		writeProperty("materialDocItem", materialDocItem);
	}

	public String getMaterialDocItem()
	{
		return (String) readProperty("materialDocItem");
	}

	public void setMaterialDocNumber(String materialDocNumber)
	{
		writeProperty("materialDocNumber", materialDocNumber);
	}

	public String getMaterialDocNumber()
	{
		return (String) readProperty("materialDocNumber");
	}

	public void setMaterialDocYear(Integer materialDocYear)
	{
		writeProperty("materialDocYear", materialDocYear);
	}

	public Integer getMaterialDocYear()
	{
		return (Integer) readProperty("materialDocYear");
	}

	public void setMot(String mot)
	{
		writeProperty("mot", mot);
	}

	public String getMot()
	{
		return (String) readProperty("mot");
	}

	public void setMovementType(String movementType)
	{
		writeProperty("movementType", movementType);
	}

	public String getMovementType()
	{
		return (String) readProperty("movementType");
	}

	public void setMovementVolumeType(String movementVolumeType)
	{
		writeProperty("movementVolumeType", movementVolumeType);
	}

	public String getMovementVolumeType()
	{
		return (String) readProperty("movementVolumeType");
	}

	public void setNominKey(String nominKey)
	{
		writeProperty("nominKey", nominKey);
	}

	public String getNominKey()
	{
		return (String) readProperty("nominKey");
	}

	public void setNominKeyItem(String nominKeyItem)
	{
		writeProperty("nominKeyItem", nominKeyItem);
	}

	public String getNominKeyItem()
	{
		return (String) readProperty("nominKeyItem");
	}

	public void setPwIssueLocation(String pwIssueLocation)
	{
		writeProperty("pwIssueLocation", pwIssueLocation);
	}

	public String getPwIssueLocation()
	{
		return (String) readProperty("pwIssueLocation");
	}

	public void setPwMaterial(String pwMaterial)
	{
		writeProperty("pwMaterial", pwMaterial);
	}

	public String getPwMaterial()
	{
		return (String) readProperty("pwMaterial");
	}

	public void setPwReceiveLocation(String pwReceiveLocation)
	{
		writeProperty("pwReceiveLocation", pwReceiveLocation);
	}

	public String getPwReceiveLocation()
	{
		return (String) readProperty("pwReceiveLocation");
	}

	public void setReceiveLocation(String receiveLocation)
	{
		writeProperty("receiveLocation", receiveLocation);
	}

	public String getReceiveLocation()
	{
		return (String) readProperty("receiveLocation");
	}

	public void setReferenceDocumentType(String referenceDocumentType)
	{
		writeProperty("referenceDocumentType", referenceDocumentType);
	}

	public String getReferenceDocumentType()
	{
		return (String) readProperty("referenceDocumentType");
	}

	public void setReversalMaterialDocItem(String reversalMaterialDocItem)
	{
		writeProperty("reversalMaterialDocItem", reversalMaterialDocItem);
	}

	public String getReversalMaterialDocItem()
	{
		return (String) readProperty("reversalMaterialDocItem");
	}

	public void setReversalMaterialDocNumber(String reversalMaterialDocNumber)
	{
		writeProperty("reversalMaterialDocNumber", reversalMaterialDocNumber);
	}

	public String getReversalMaterialDocNumber()
	{
		return (String) readProperty("reversalMaterialDocNumber");
	}

	public void setReversalMaterialDocYear(Integer reversalMaterialDocYear)
	{
		writeProperty("reversalMaterialDocYear", reversalMaterialDocYear);
	}

	public Integer getReversalMaterialDocYear()
	{
		return (Integer) readProperty("reversalMaterialDocYear");
	}

	public void setScheduleType(String scheduleType)
	{
		writeProperty("scheduleType", scheduleType);
	}

	public String getScheduleType()
	{
		return (String) readProperty("scheduleType");
	}

	public void setUom(String uom)
	{
		writeProperty("uom", uom);
	}

	public String getUom()
	{
		return (String) readProperty("uom");
	}

	public void setVolume(BigDecimal volume)
	{
		writeProperty("volume", volume);
	}

	public BigDecimal getVolume()
	{
		return (BigDecimal) readProperty("volume");
	}

}