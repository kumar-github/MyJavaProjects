package com.tc.app.exchangemonitor.model.cayenne.persistent.auto;

import java.util.List;

import org.apache.cayenne.CayenneDataObject;
import org.apache.cayenne.exp.Property;

import com.tc.app.exchangemonitor.model.cayenne.persistent.AliasSource;
import com.tc.app.exchangemonitor.model.cayenne.persistent.ExtTradeLoadingSched;
import com.tc.app.exchangemonitor.model.cayenne.persistent.ExternalMapping;
import com.tc.app.exchangemonitor.model.cayenne.persistent.ExternalTrade;
import com.tc.app.exchangemonitor.model.cayenne.persistent.ExternalTradeSystem;
import com.tc.app.exchangemonitor.model.cayenne.persistent.ExternalTradeType;

/**
 * Class _ExternalTradeSource was generated by Cayenne.
 * It is probably a good idea to avoid changing this class manually,
 * since it may be overwritten next time code is regenerated.
 * If you need to make any customizations, please use subclass.
 */
public abstract class _ExternalTradeSource extends CayenneDataObject
{

	private static final long serialVersionUID = 1L;

	public static final String OID_PK_COLUMN = "oid";

	public static final Property<String> EXTERNAL_TRADE_SRC_NAME = new Property<String>("externalTradeSrcName");
	public static final Property<Integer> TRANS_ID = new Property<Integer>("transId");
	public static final Property<AliasSource> ALIAS_SOURCE = new Property<AliasSource>("aliasSource");
	public static final Property<List<ExtTradeLoadingSched>> EXT_TRADE_LOADING_SCHEDS = new Property<List<ExtTradeLoadingSched>>("extTradeLoadingScheds");
	public static final Property<List<ExternalMapping>> EXTERNAL_MAPPINGS = new Property<List<ExternalMapping>>("externalMappings");
	public static final Property<ExternalTradeSystem> EXTERNAL_TRADE_SYSTEM_O = new Property<ExternalTradeSystem>("externalTradeSystemO");
	public static final Property<List<ExternalTradeType>> EXTERNAL_TRADE_TYPES = new Property<List<ExternalTradeType>>("externalTradeTypes");
	public static final Property<List<ExternalTrade>> EXTERNAL_TRADES = new Property<List<ExternalTrade>>("externalTrades");

	public void setExternalTradeSrcName(String externalTradeSrcName)
	{
		writeProperty("externalTradeSrcName", externalTradeSrcName);
	}

	public String getExternalTradeSrcName()
	{
		return (String) readProperty("externalTradeSrcName");
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

	public void addToExtTradeLoadingScheds(ExtTradeLoadingSched obj)
	{
		addToManyTarget("extTradeLoadingScheds", obj, true);
	}

	public void removeFromExtTradeLoadingScheds(ExtTradeLoadingSched obj)
	{
		removeToManyTarget("extTradeLoadingScheds", obj, true);
	}

	@SuppressWarnings("unchecked")
	public List<ExtTradeLoadingSched> getExtTradeLoadingScheds()
	{
		return (List<ExtTradeLoadingSched>) readProperty("extTradeLoadingScheds");
	}

	public void addToExternalMappings(ExternalMapping obj)
	{
		addToManyTarget("externalMappings", obj, true);
	}

	public void removeFromExternalMappings(ExternalMapping obj)
	{
		removeToManyTarget("externalMappings", obj, true);
	}

	@SuppressWarnings("unchecked")
	public List<ExternalMapping> getExternalMappings()
	{
		return (List<ExternalMapping>) readProperty("externalMappings");
	}

	public void setExternalTradeSystemO(ExternalTradeSystem externalTradeSystemO)
	{
		setToOneTarget("externalTradeSystemO", externalTradeSystemO, true);
	}

	public ExternalTradeSystem getExternalTradeSystemO()
	{
		return (ExternalTradeSystem) readProperty("externalTradeSystemO");
	}

	public void addToExternalTradeTypes(ExternalTradeType obj)
	{
		addToManyTarget("externalTradeTypes", obj, true);
	}

	public void removeFromExternalTradeTypes(ExternalTradeType obj)
	{
		removeToManyTarget("externalTradeTypes", obj, true);
	}

	@SuppressWarnings("unchecked")
	public List<ExternalTradeType> getExternalTradeTypes()
	{
		return (List<ExternalTradeType>) readProperty("externalTradeTypes");
	}

	public void addToExternalTrades(ExternalTrade obj)
	{
		addToManyTarget("externalTrades", obj, true);
	}

	public void removeFromExternalTrades(ExternalTrade obj)
	{
		removeToManyTarget("externalTrades", obj, true);
	}

	@SuppressWarnings("unchecked")
	public List<ExternalTrade> getExternalTrades()
	{
		return (List<ExternalTrade>) readProperty("externalTrades");
	}

}
