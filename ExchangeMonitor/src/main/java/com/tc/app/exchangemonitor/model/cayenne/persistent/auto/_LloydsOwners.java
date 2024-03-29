package com.tc.app.exchangemonitor.model.cayenne.persistent.auto;

import java.util.List;

import org.apache.cayenne.CayenneDataObject;
import org.apache.cayenne.exp.Property;

import com.tc.app.exchangemonitor.model.cayenne.persistent.LloydsShipParticulars;

/**
 * Class _LloydsOwners was generated by Cayenne.
 * It is probably a good idea to avoid changing this class manually,
 * since it may be overwritten next time code is regenerated.
 * If you need to make any customizations, please use subclass.
 */
public abstract class _LloydsOwners extends CayenneDataObject
{

	private static final long serialVersionUID = 1L;

	public static final String FLDCHR_OWN_LLOYDS_CODE_PK_COLUMN = "fldchrOwnLloydsCode";

	public static final Property<String> FLDCHR_LLOYDS_CARE_CODE = new Property<String>("fldchrLloydsCareCode");
	public static final Property<String> FLDCHR_LLOYDS_PARENT_CODE = new Property<String>("fldchrLloydsParentCode");
	public static final Property<String> FLDCHR_NATION1ST_CODE = new Property<String>("fldchrNation1stCode");
	public static final Property<String> FLDCHR_NATION2ND_CODE = new Property<String>("fldchrNation2ndCode");
	public static final Property<String> FLDVCH_HEAD_OFFICE_FAX = new Property<String>("fldvchHeadOfficeFax");
	public static final Property<String> FLDVCH_HEAD_OFFICE_PHONE = new Property<String>("fldvchHeadOfficePhone");
	public static final Property<String> FLDVCH_HEAD_OFFICE_TELEX = new Property<String>("fldvchHeadOfficeTelex");
	public static final Property<String> FLDVCH_HEAD_OFFICE_TOWN = new Property<String>("fldvchHeadOfficeTown");
	public static final Property<String> FLDVCH_OWN_ADRS1ST_LINE = new Property<String>("fldvchOwnAdrs1stLine");
	public static final Property<String> FLDVCH_OWN_ADRS2ND_LINE = new Property<String>("fldvchOwnAdrs2ndLine");
	public static final Property<String> FLDVCH_OWN_ADRS3RD_LINE = new Property<String>("fldvchOwnAdrs3rdLine");
	public static final Property<String> FLDVCH_OWN_ADRS4TH_LINE = new Property<String>("fldvchOwnAdrs4thLine");
	public static final Property<String> FLDVCH_OWN_ADRS5TH_LINE = new Property<String>("fldvchOwnAdrs5thLine");
	public static final Property<String> FLDVCH_OWN_ADRS6TH_LINE = new Property<String>("fldvchOwnAdrs6thLine");
	public static final Property<String> FLDVCH_OWN_ADRS7TH_LINE = new Property<String>("fldvchOwnAdrs7thLine");
	public static final Property<String> FLDVCH_OWN_DESC = new Property<String>("fldvchOwnDesc");
	public static final Property<Integer> TRANS_ID = new Property<Integer>("transId");
	public static final Property<List<LloydsShipParticulars>> LLOYDS_SHIP_PARTICULARSS = new Property<List<LloydsShipParticulars>>("lloydsShipParticularss");
	public static final Property<List<LloydsShipParticulars>> LLOYDS_SHIP_PARTICULARSS1 = new Property<List<LloydsShipParticulars>>("lloydsShipParticularss1");
	public static final Property<List<LloydsShipParticulars>> LLOYDS_SHIP_PARTICULARSS2 = new Property<List<LloydsShipParticulars>>("lloydsShipParticularss2");

	public void setFldchrLloydsCareCode(String fldchrLloydsCareCode)
	{
		writeProperty("fldchrLloydsCareCode", fldchrLloydsCareCode);
	}

	public String getFldchrLloydsCareCode()
	{
		return (String) readProperty("fldchrLloydsCareCode");
	}

	public void setFldchrLloydsParentCode(String fldchrLloydsParentCode)
	{
		writeProperty("fldchrLloydsParentCode", fldchrLloydsParentCode);
	}

	public String getFldchrLloydsParentCode()
	{
		return (String) readProperty("fldchrLloydsParentCode");
	}

	public void setFldchrNation1stCode(String fldchrNation1stCode)
	{
		writeProperty("fldchrNation1stCode", fldchrNation1stCode);
	}

	public String getFldchrNation1stCode()
	{
		return (String) readProperty("fldchrNation1stCode");
	}

	public void setFldchrNation2ndCode(String fldchrNation2ndCode)
	{
		writeProperty("fldchrNation2ndCode", fldchrNation2ndCode);
	}

	public String getFldchrNation2ndCode()
	{
		return (String) readProperty("fldchrNation2ndCode");
	}

	public void setFldvchHeadOfficeFax(String fldvchHeadOfficeFax)
	{
		writeProperty("fldvchHeadOfficeFax", fldvchHeadOfficeFax);
	}

	public String getFldvchHeadOfficeFax()
	{
		return (String) readProperty("fldvchHeadOfficeFax");
	}

	public void setFldvchHeadOfficePhone(String fldvchHeadOfficePhone)
	{
		writeProperty("fldvchHeadOfficePhone", fldvchHeadOfficePhone);
	}

	public String getFldvchHeadOfficePhone()
	{
		return (String) readProperty("fldvchHeadOfficePhone");
	}

	public void setFldvchHeadOfficeTelex(String fldvchHeadOfficeTelex)
	{
		writeProperty("fldvchHeadOfficeTelex", fldvchHeadOfficeTelex);
	}

	public String getFldvchHeadOfficeTelex()
	{
		return (String) readProperty("fldvchHeadOfficeTelex");
	}

	public void setFldvchHeadOfficeTown(String fldvchHeadOfficeTown)
	{
		writeProperty("fldvchHeadOfficeTown", fldvchHeadOfficeTown);
	}

	public String getFldvchHeadOfficeTown()
	{
		return (String) readProperty("fldvchHeadOfficeTown");
	}

	public void setFldvchOwnAdrs1stLine(String fldvchOwnAdrs1stLine)
	{
		writeProperty("fldvchOwnAdrs1stLine", fldvchOwnAdrs1stLine);
	}

	public String getFldvchOwnAdrs1stLine()
	{
		return (String) readProperty("fldvchOwnAdrs1stLine");
	}

	public void setFldvchOwnAdrs2ndLine(String fldvchOwnAdrs2ndLine)
	{
		writeProperty("fldvchOwnAdrs2ndLine", fldvchOwnAdrs2ndLine);
	}

	public String getFldvchOwnAdrs2ndLine()
	{
		return (String) readProperty("fldvchOwnAdrs2ndLine");
	}

	public void setFldvchOwnAdrs3rdLine(String fldvchOwnAdrs3rdLine)
	{
		writeProperty("fldvchOwnAdrs3rdLine", fldvchOwnAdrs3rdLine);
	}

	public String getFldvchOwnAdrs3rdLine()
	{
		return (String) readProperty("fldvchOwnAdrs3rdLine");
	}

	public void setFldvchOwnAdrs4thLine(String fldvchOwnAdrs4thLine)
	{
		writeProperty("fldvchOwnAdrs4thLine", fldvchOwnAdrs4thLine);
	}

	public String getFldvchOwnAdrs4thLine()
	{
		return (String) readProperty("fldvchOwnAdrs4thLine");
	}

	public void setFldvchOwnAdrs5thLine(String fldvchOwnAdrs5thLine)
	{
		writeProperty("fldvchOwnAdrs5thLine", fldvchOwnAdrs5thLine);
	}

	public String getFldvchOwnAdrs5thLine()
	{
		return (String) readProperty("fldvchOwnAdrs5thLine");
	}

	public void setFldvchOwnAdrs6thLine(String fldvchOwnAdrs6thLine)
	{
		writeProperty("fldvchOwnAdrs6thLine", fldvchOwnAdrs6thLine);
	}

	public String getFldvchOwnAdrs6thLine()
	{
		return (String) readProperty("fldvchOwnAdrs6thLine");
	}

	public void setFldvchOwnAdrs7thLine(String fldvchOwnAdrs7thLine)
	{
		writeProperty("fldvchOwnAdrs7thLine", fldvchOwnAdrs7thLine);
	}

	public String getFldvchOwnAdrs7thLine()
	{
		return (String) readProperty("fldvchOwnAdrs7thLine");
	}

	public void setFldvchOwnDesc(String fldvchOwnDesc)
	{
		writeProperty("fldvchOwnDesc", fldvchOwnDesc);
	}

	public String getFldvchOwnDesc()
	{
		return (String) readProperty("fldvchOwnDesc");
	}

	public void setTransId(Integer transId)
	{
		writeProperty("transId", transId);
	}

	public Integer getTransId()
	{
		return (Integer) readProperty("transId");
	}

	public void addToLloydsShipParticularss(LloydsShipParticulars obj)
	{
		addToManyTarget("lloydsShipParticularss", obj, true);
	}

	public void removeFromLloydsShipParticularss(LloydsShipParticulars obj)
	{
		removeToManyTarget("lloydsShipParticularss", obj, true);
	}

	@SuppressWarnings("unchecked")
	public List<LloydsShipParticulars> getLloydsShipParticularss()
	{
		return (List<LloydsShipParticulars>) readProperty("lloydsShipParticularss");
	}

	public void addToLloydsShipParticularss1(LloydsShipParticulars obj)
	{
		addToManyTarget("lloydsShipParticularss1", obj, true);
	}

	public void removeFromLloydsShipParticularss1(LloydsShipParticulars obj)
	{
		removeToManyTarget("lloydsShipParticularss1", obj, true);
	}

	@SuppressWarnings("unchecked")
	public List<LloydsShipParticulars> getLloydsShipParticularss1()
	{
		return (List<LloydsShipParticulars>) readProperty("lloydsShipParticularss1");
	}

	public void addToLloydsShipParticularss2(LloydsShipParticulars obj)
	{
		addToManyTarget("lloydsShipParticularss2", obj, true);
	}

	public void removeFromLloydsShipParticularss2(LloydsShipParticulars obj)
	{
		removeToManyTarget("lloydsShipParticularss2", obj, true);
	}

	@SuppressWarnings("unchecked")
	public List<LloydsShipParticulars> getLloydsShipParticularss2()
	{
		return (List<LloydsShipParticulars>) readProperty("lloydsShipParticularss2");
	}

}
