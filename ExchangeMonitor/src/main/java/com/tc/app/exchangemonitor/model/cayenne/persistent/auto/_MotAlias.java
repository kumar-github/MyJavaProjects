package com.tc.app.exchangemonitor.model.cayenne.persistent.auto;

import org.apache.cayenne.CayenneDataObject;
import org.apache.cayenne.exp.Property;

import com.tc.app.exchangemonitor.model.cayenne.persistent.AliasSource;
import com.tc.app.exchangemonitor.model.cayenne.persistent.Mot;

/**
 * Class _MotAlias was generated by Cayenne.
 * It is probably a good idea to avoid changing this class manually,
 * since it may be overwritten next time code is regenerated.
 * If you need to make any customizations, please use subclass.
 */
public abstract class _MotAlias extends CayenneDataObject
{

	private static final long serialVersionUID = 1L;

	public static final String ALIAS_SOURCE_CODE_PK_COLUMN = "alias_source_code";
	public static final String MOT_CODE_PK_COLUMN = "mot_code";

	public static final Property<String> MOT_ALIAS_NAME = new Property<String>("motAliasName");
	public static final Property<Integer> TRANS_ID = new Property<Integer>("transId");
	public static final Property<AliasSource> ALIAS_SOURCE = new Property<AliasSource>("aliasSource");
	public static final Property<Mot> MOT = new Property<Mot>("mot");

	public void setMotAliasName(String motAliasName)
	{
		writeProperty("motAliasName", motAliasName);
	}

	public String getMotAliasName()
	{
		return (String) readProperty("motAliasName");
	}

	public void setTransId(Integer transId)
	{
		writeProperty("transId", transId);
	}

	public Integer getTransId()
	{
		return (Integer) readProperty("transId");
	}

	public void setAliasSource(AliasSource aliasSource)
	{
		setToOneTarget("aliasSource", aliasSource, true);
	}

	public AliasSource getAliasSource()
	{
		return (AliasSource) readProperty("aliasSource");
	}

	public void setMot(Mot mot)
	{
		setToOneTarget("mot", mot, true);
	}

	public Mot getMot()
	{
		return (Mot) readProperty("mot");
	}

}