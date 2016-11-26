package com.tc.app.exchangemonitor.model.cayenne.persistent.auto;

import java.util.Date;
import java.util.List;

import org.apache.cayenne.CayenneDataObject;
import org.apache.cayenne.exp.Property;

import com.tc.app.exchangemonitor.model.cayenne.persistent.CommodityMarket;
import com.tc.app.exchangemonitor.model.cayenne.persistent.CommodityMarketFormula;
import com.tc.app.exchangemonitor.model.cayenne.persistent.FifoGroup;
import com.tc.app.exchangemonitor.model.cayenne.persistent.ForecastValue;
import com.tc.app.exchangemonitor.model.cayenne.persistent.FormulaComponent;
import com.tc.app.exchangemonitor.model.cayenne.persistent.FormulaCondition;
import com.tc.app.exchangemonitor.model.cayenne.persistent.FxHedgeRate;
import com.tc.app.exchangemonitor.model.cayenne.persistent.ImpliedPrCurve;
import com.tc.app.exchangemonitor.model.cayenne.persistent.ImpliedPrDifferential;
import com.tc.app.exchangemonitor.model.cayenne.persistent.OptionSkew;
import com.tc.app.exchangemonitor.model.cayenne.persistent.OptionStrike;
import com.tc.app.exchangemonitor.model.cayenne.persistent.PosLimitDefinition;
import com.tc.app.exchangemonitor.model.cayenne.persistent.Price;
import com.tc.app.exchangemonitor.model.cayenne.persistent.SimpleFormula;
import com.tc.app.exchangemonitor.model.cayenne.persistent.TradeItemDist;
import com.tc.app.exchangemonitor.model.cayenne.persistent.TradingPeriodAlias;
import com.tc.app.exchangemonitor.model.cayenne.persistent.VesselDist;

/**
 * Class _TradingPeriod was generated by Cayenne.
 * It is probably a good idea to avoid changing this class manually,
 * since it may be overwritten next time code is regenerated.
 * If you need to make any customizations, please use subclass.
 */
public abstract class _TradingPeriod extends CayenneDataObject
{

	private static final long serialVersionUID = 1L;

	public static final String COMMKT_KEY_PK_COLUMN = "commkt_key";
	public static final String TRADING_PRD_PK_COLUMN = "trading_prd";

	public static final Property<Date> FIRST_DEL_DATE = new Property<Date>("firstDelDate");
	public static final Property<Date> FIRST_ISSUE_DATE = new Property<Date>("firstIssueDate");
	public static final Property<Date> LAST_DEL_DATE = new Property<Date>("lastDelDate");
	public static final Property<Date> LAST_ISSUE_DATE = new Property<Date>("lastIssueDate");
	public static final Property<Date> LAST_QUOTE_DATE = new Property<Date>("lastQuoteDate");
	public static final Property<Date> LAST_TRADE_DATE = new Property<Date>("lastTradeDate");
	public static final Property<String> OPT_EVAL_METHOD = new Property<String>("optEvalMethod");
	public static final Property<Date> OPT_EXP_DATE = new Property<Date>("optExpDate");
	public static final Property<String> TRADING_PRD_DESC = new Property<String>("tradingPrdDesc");
	public static final Property<Integer> TRANS_ID = new Property<Integer>("transId");
	public static final Property<CommodityMarket> COMMODITY_MARKET = new Property<CommodityMarket>("commodityMarket");
	public static final Property<List<CommodityMarketFormula>> COMMODITY_MARKET_FORMULAS = new Property<List<CommodityMarketFormula>>("commodityMarketFormulas");
	public static final Property<List<CommodityMarketFormula>> COMMODITY_MARKET_FORMULAS1 = new Property<List<CommodityMarketFormula>>("commodityMarketFormulas1");
	public static final Property<List<FifoGroup>> FIFO_GROUPS = new Property<List<FifoGroup>>("fifoGroups");
	public static final Property<List<FifoGroup>> FIFO_GROUPS1 = new Property<List<FifoGroup>>("fifoGroups1");
	public static final Property<List<ForecastValue>> FORECAST_VALUES = new Property<List<ForecastValue>>("forecastValues");
	public static final Property<List<ForecastValue>> FORECAST_VALUES1 = new Property<List<ForecastValue>>("forecastValues1");
	public static final Property<List<FormulaComponent>> FORMULA_COMPONENTS = new Property<List<FormulaComponent>>("formulaComponents");
	public static final Property<List<FormulaComponent>> FORMULA_COMPONENTS1 = new Property<List<FormulaComponent>>("formulaComponents1");
	public static final Property<List<FormulaCondition>> FORMULA_CONDITIONS = new Property<List<FormulaCondition>>("formulaConditions");
	public static final Property<List<FormulaCondition>> FORMULA_CONDITIONS1 = new Property<List<FormulaCondition>>("formulaConditions1");
	public static final Property<List<FormulaCondition>> FORMULA_CONDITIONS2 = new Property<List<FormulaCondition>>("formulaConditions2");
	public static final Property<List<FormulaCondition>> FORMULA_CONDITIONS3 = new Property<List<FormulaCondition>>("formulaConditions3");
	public static final Property<List<FxHedgeRate>> FX_HEDGE_RATES = new Property<List<FxHedgeRate>>("fxHedgeRates");
	public static final Property<List<FxHedgeRate>> FX_HEDGE_RATES1 = new Property<List<FxHedgeRate>>("fxHedgeRates1");
	public static final Property<List<ImpliedPrCurve>> IMPLIED_PR_CURVES = new Property<List<ImpliedPrCurve>>("impliedPrCurves");
	public static final Property<List<ImpliedPrCurve>> IMPLIED_PR_CURVES1 = new Property<List<ImpliedPrCurve>>("impliedPrCurves1");
	public static final Property<List<ImpliedPrDifferential>> IMPLIED_PR_DIFFERENTIALS = new Property<List<ImpliedPrDifferential>>("impliedPrDifferentials");
	public static final Property<List<ImpliedPrDifferential>> IMPLIED_PR_DIFFERENTIALS1 = new Property<List<ImpliedPrDifferential>>("impliedPrDifferentials1");
	public static final Property<List<ImpliedPrDifferential>> IMPLIED_PR_DIFFERENTIALS2 = new Property<List<ImpliedPrDifferential>>("impliedPrDifferentials2");
	public static final Property<List<ImpliedPrDifferential>> IMPLIED_PR_DIFFERENTIALS3 = new Property<List<ImpliedPrDifferential>>("impliedPrDifferentials3");
	public static final Property<List<OptionSkew>> OPTION_SKEWS = new Property<List<OptionSkew>>("optionSkews");
	public static final Property<List<OptionSkew>> OPTION_SKEWS1 = new Property<List<OptionSkew>>("optionSkews1");
	public static final Property<List<OptionStrike>> OPTION_STRIKES = new Property<List<OptionStrike>>("optionStrikes");
	public static final Property<List<OptionStrike>> OPTION_STRIKES1 = new Property<List<OptionStrike>>("optionStrikes1");
	public static final Property<List<PosLimitDefinition>> POS_LIMIT_DEFINITIONS = new Property<List<PosLimitDefinition>>("posLimitDefinitions");
	public static final Property<List<PosLimitDefinition>> POS_LIMIT_DEFINITIONS1 = new Property<List<PosLimitDefinition>>("posLimitDefinitions1");
	public static final Property<List<Price>> PRICES = new Property<List<Price>>("prices");
	public static final Property<List<Price>> PRICES1 = new Property<List<Price>>("prices1");
	public static final Property<List<SimpleFormula>> SIMPLE_FORMULAS = new Property<List<SimpleFormula>>("simpleFormulas");
	public static final Property<List<SimpleFormula>> SIMPLE_FORMULAS1 = new Property<List<SimpleFormula>>("simpleFormulas1");
	public static final Property<List<TradeItemDist>> TRADE_ITEM_DISTS = new Property<List<TradeItemDist>>("tradeItemDists");
	public static final Property<List<TradeItemDist>> TRADE_ITEM_DISTS1 = new Property<List<TradeItemDist>>("tradeItemDists1");
	public static final Property<List<TradingPeriodAlias>> TRADING_PERIOD_ALIASS = new Property<List<TradingPeriodAlias>>("tradingPeriodAliass");
	public static final Property<List<TradingPeriodAlias>> TRADING_PERIOD_ALIASS1 = new Property<List<TradingPeriodAlias>>("tradingPeriodAliass1");
	public static final Property<List<VesselDist>> VESSEL_DISTS = new Property<List<VesselDist>>("vesselDists");
	public static final Property<List<VesselDist>> VESSEL_DISTS1 = new Property<List<VesselDist>>("vesselDists1");

	public void setFirstDelDate(Date firstDelDate)
	{
		writeProperty("firstDelDate", firstDelDate);
	}

	public Date getFirstDelDate()
	{
		return (Date) readProperty("firstDelDate");
	}

	public void setFirstIssueDate(Date firstIssueDate)
	{
		writeProperty("firstIssueDate", firstIssueDate);
	}

	public Date getFirstIssueDate()
	{
		return (Date) readProperty("firstIssueDate");
	}

	public void setLastDelDate(Date lastDelDate)
	{
		writeProperty("lastDelDate", lastDelDate);
	}

	public Date getLastDelDate()
	{
		return (Date) readProperty("lastDelDate");
	}

	public void setLastIssueDate(Date lastIssueDate)
	{
		writeProperty("lastIssueDate", lastIssueDate);
	}

	public Date getLastIssueDate()
	{
		return (Date) readProperty("lastIssueDate");
	}

	public void setLastQuoteDate(Date lastQuoteDate)
	{
		writeProperty("lastQuoteDate", lastQuoteDate);
	}

	public Date getLastQuoteDate()
	{
		return (Date) readProperty("lastQuoteDate");
	}

	public void setLastTradeDate(Date lastTradeDate)
	{
		writeProperty("lastTradeDate", lastTradeDate);
	}

	public Date getLastTradeDate()
	{
		return (Date) readProperty("lastTradeDate");
	}

	public void setOptEvalMethod(String optEvalMethod)
	{
		writeProperty("optEvalMethod", optEvalMethod);
	}

	public String getOptEvalMethod()
	{
		return (String) readProperty("optEvalMethod");
	}

	public void setOptExpDate(Date optExpDate)
	{
		writeProperty("optExpDate", optExpDate);
	}

	public Date getOptExpDate()
	{
		return (Date) readProperty("optExpDate");
	}

	public void setTradingPrdDesc(String tradingPrdDesc)
	{
		writeProperty("tradingPrdDesc", tradingPrdDesc);
	}

	public String getTradingPrdDesc()
	{
		return (String) readProperty("tradingPrdDesc");
	}

	public void setTransId(Integer transId)
	{
		writeProperty("transId", transId);
	}

	public Integer getTransId()
	{
		return (Integer) readProperty("transId");
	}

	public void setCommodityMarket(CommodityMarket commodityMarket)
	{
		setToOneTarget("commodityMarket", commodityMarket, true);
	}

	public CommodityMarket getCommodityMarket()
	{
		return (CommodityMarket) readProperty("commodityMarket");
	}

	public void addToCommodityMarketFormulas(CommodityMarketFormula obj)
	{
		addToManyTarget("commodityMarketFormulas", obj, true);
	}

	public void removeFromCommodityMarketFormulas(CommodityMarketFormula obj)
	{
		removeToManyTarget("commodityMarketFormulas", obj, true);
	}

	@SuppressWarnings("unchecked")
	public List<CommodityMarketFormula> getCommodityMarketFormulas()
	{
		return (List<CommodityMarketFormula>) readProperty("commodityMarketFormulas");
	}

	public void addToCommodityMarketFormulas1(CommodityMarketFormula obj)
	{
		addToManyTarget("commodityMarketFormulas1", obj, true);
	}

	public void removeFromCommodityMarketFormulas1(CommodityMarketFormula obj)
	{
		removeToManyTarget("commodityMarketFormulas1", obj, true);
	}

	@SuppressWarnings("unchecked")
	public List<CommodityMarketFormula> getCommodityMarketFormulas1()
	{
		return (List<CommodityMarketFormula>) readProperty("commodityMarketFormulas1");
	}

	public void addToFifoGroups(FifoGroup obj)
	{
		addToManyTarget("fifoGroups", obj, true);
	}

	public void removeFromFifoGroups(FifoGroup obj)
	{
		removeToManyTarget("fifoGroups", obj, true);
	}

	@SuppressWarnings("unchecked")
	public List<FifoGroup> getFifoGroups()
	{
		return (List<FifoGroup>) readProperty("fifoGroups");
	}

	public void addToFifoGroups1(FifoGroup obj)
	{
		addToManyTarget("fifoGroups1", obj, true);
	}

	public void removeFromFifoGroups1(FifoGroup obj)
	{
		removeToManyTarget("fifoGroups1", obj, true);
	}

	@SuppressWarnings("unchecked")
	public List<FifoGroup> getFifoGroups1()
	{
		return (List<FifoGroup>) readProperty("fifoGroups1");
	}

	public void addToForecastValues(ForecastValue obj)
	{
		addToManyTarget("forecastValues", obj, true);
	}

	public void removeFromForecastValues(ForecastValue obj)
	{
		removeToManyTarget("forecastValues", obj, true);
	}

	@SuppressWarnings("unchecked")
	public List<ForecastValue> getForecastValues()
	{
		return (List<ForecastValue>) readProperty("forecastValues");
	}

	public void addToForecastValues1(ForecastValue obj)
	{
		addToManyTarget("forecastValues1", obj, true);
	}

	public void removeFromForecastValues1(ForecastValue obj)
	{
		removeToManyTarget("forecastValues1", obj, true);
	}

	@SuppressWarnings("unchecked")
	public List<ForecastValue> getForecastValues1()
	{
		return (List<ForecastValue>) readProperty("forecastValues1");
	}

	public void addToFormulaComponents(FormulaComponent obj)
	{
		addToManyTarget("formulaComponents", obj, true);
	}

	public void removeFromFormulaComponents(FormulaComponent obj)
	{
		removeToManyTarget("formulaComponents", obj, true);
	}

	@SuppressWarnings("unchecked")
	public List<FormulaComponent> getFormulaComponents()
	{
		return (List<FormulaComponent>) readProperty("formulaComponents");
	}

	public void addToFormulaComponents1(FormulaComponent obj)
	{
		addToManyTarget("formulaComponents1", obj, true);
	}

	public void removeFromFormulaComponents1(FormulaComponent obj)
	{
		removeToManyTarget("formulaComponents1", obj, true);
	}

	@SuppressWarnings("unchecked")
	public List<FormulaComponent> getFormulaComponents1()
	{
		return (List<FormulaComponent>) readProperty("formulaComponents1");
	}

	public void addToFormulaConditions(FormulaCondition obj)
	{
		addToManyTarget("formulaConditions", obj, true);
	}

	public void removeFromFormulaConditions(FormulaCondition obj)
	{
		removeToManyTarget("formulaConditions", obj, true);
	}

	@SuppressWarnings("unchecked")
	public List<FormulaCondition> getFormulaConditions()
	{
		return (List<FormulaCondition>) readProperty("formulaConditions");
	}

	public void addToFormulaConditions1(FormulaCondition obj)
	{
		addToManyTarget("formulaConditions1", obj, true);
	}

	public void removeFromFormulaConditions1(FormulaCondition obj)
	{
		removeToManyTarget("formulaConditions1", obj, true);
	}

	@SuppressWarnings("unchecked")
	public List<FormulaCondition> getFormulaConditions1()
	{
		return (List<FormulaCondition>) readProperty("formulaConditions1");
	}

	public void addToFormulaConditions2(FormulaCondition obj)
	{
		addToManyTarget("formulaConditions2", obj, true);
	}

	public void removeFromFormulaConditions2(FormulaCondition obj)
	{
		removeToManyTarget("formulaConditions2", obj, true);
	}

	@SuppressWarnings("unchecked")
	public List<FormulaCondition> getFormulaConditions2()
	{
		return (List<FormulaCondition>) readProperty("formulaConditions2");
	}

	public void addToFormulaConditions3(FormulaCondition obj)
	{
		addToManyTarget("formulaConditions3", obj, true);
	}

	public void removeFromFormulaConditions3(FormulaCondition obj)
	{
		removeToManyTarget("formulaConditions3", obj, true);
	}

	@SuppressWarnings("unchecked")
	public List<FormulaCondition> getFormulaConditions3()
	{
		return (List<FormulaCondition>) readProperty("formulaConditions3");
	}

	public void addToFxHedgeRates(FxHedgeRate obj)
	{
		addToManyTarget("fxHedgeRates", obj, true);
	}

	public void removeFromFxHedgeRates(FxHedgeRate obj)
	{
		removeToManyTarget("fxHedgeRates", obj, true);
	}

	@SuppressWarnings("unchecked")
	public List<FxHedgeRate> getFxHedgeRates()
	{
		return (List<FxHedgeRate>) readProperty("fxHedgeRates");
	}

	public void addToFxHedgeRates1(FxHedgeRate obj)
	{
		addToManyTarget("fxHedgeRates1", obj, true);
	}

	public void removeFromFxHedgeRates1(FxHedgeRate obj)
	{
		removeToManyTarget("fxHedgeRates1", obj, true);
	}

	@SuppressWarnings("unchecked")
	public List<FxHedgeRate> getFxHedgeRates1()
	{
		return (List<FxHedgeRate>) readProperty("fxHedgeRates1");
	}

	public void addToImpliedPrCurves(ImpliedPrCurve obj)
	{
		addToManyTarget("impliedPrCurves", obj, true);
	}

	public void removeFromImpliedPrCurves(ImpliedPrCurve obj)
	{
		removeToManyTarget("impliedPrCurves", obj, true);
	}

	@SuppressWarnings("unchecked")
	public List<ImpliedPrCurve> getImpliedPrCurves()
	{
		return (List<ImpliedPrCurve>) readProperty("impliedPrCurves");
	}

	public void addToImpliedPrCurves1(ImpliedPrCurve obj)
	{
		addToManyTarget("impliedPrCurves1", obj, true);
	}

	public void removeFromImpliedPrCurves1(ImpliedPrCurve obj)
	{
		removeToManyTarget("impliedPrCurves1", obj, true);
	}

	@SuppressWarnings("unchecked")
	public List<ImpliedPrCurve> getImpliedPrCurves1()
	{
		return (List<ImpliedPrCurve>) readProperty("impliedPrCurves1");
	}

	public void addToImpliedPrDifferentials(ImpliedPrDifferential obj)
	{
		addToManyTarget("impliedPrDifferentials", obj, true);
	}

	public void removeFromImpliedPrDifferentials(ImpliedPrDifferential obj)
	{
		removeToManyTarget("impliedPrDifferentials", obj, true);
	}

	@SuppressWarnings("unchecked")
	public List<ImpliedPrDifferential> getImpliedPrDifferentials()
	{
		return (List<ImpliedPrDifferential>) readProperty("impliedPrDifferentials");
	}

	public void addToImpliedPrDifferentials1(ImpliedPrDifferential obj)
	{
		addToManyTarget("impliedPrDifferentials1", obj, true);
	}

	public void removeFromImpliedPrDifferentials1(ImpliedPrDifferential obj)
	{
		removeToManyTarget("impliedPrDifferentials1", obj, true);
	}

	@SuppressWarnings("unchecked")
	public List<ImpliedPrDifferential> getImpliedPrDifferentials1()
	{
		return (List<ImpliedPrDifferential>) readProperty("impliedPrDifferentials1");
	}

	public void addToImpliedPrDifferentials2(ImpliedPrDifferential obj)
	{
		addToManyTarget("impliedPrDifferentials2", obj, true);
	}

	public void removeFromImpliedPrDifferentials2(ImpliedPrDifferential obj)
	{
		removeToManyTarget("impliedPrDifferentials2", obj, true);
	}

	@SuppressWarnings("unchecked")
	public List<ImpliedPrDifferential> getImpliedPrDifferentials2()
	{
		return (List<ImpliedPrDifferential>) readProperty("impliedPrDifferentials2");
	}

	public void addToImpliedPrDifferentials3(ImpliedPrDifferential obj)
	{
		addToManyTarget("impliedPrDifferentials3", obj, true);
	}

	public void removeFromImpliedPrDifferentials3(ImpliedPrDifferential obj)
	{
		removeToManyTarget("impliedPrDifferentials3", obj, true);
	}

	@SuppressWarnings("unchecked")
	public List<ImpliedPrDifferential> getImpliedPrDifferentials3()
	{
		return (List<ImpliedPrDifferential>) readProperty("impliedPrDifferentials3");
	}

	public void addToOptionSkews(OptionSkew obj)
	{
		addToManyTarget("optionSkews", obj, true);
	}

	public void removeFromOptionSkews(OptionSkew obj)
	{
		removeToManyTarget("optionSkews", obj, true);
	}

	@SuppressWarnings("unchecked")
	public List<OptionSkew> getOptionSkews()
	{
		return (List<OptionSkew>) readProperty("optionSkews");
	}

	public void addToOptionSkews1(OptionSkew obj)
	{
		addToManyTarget("optionSkews1", obj, true);
	}

	public void removeFromOptionSkews1(OptionSkew obj)
	{
		removeToManyTarget("optionSkews1", obj, true);
	}

	@SuppressWarnings("unchecked")
	public List<OptionSkew> getOptionSkews1()
	{
		return (List<OptionSkew>) readProperty("optionSkews1");
	}

	public void addToOptionStrikes(OptionStrike obj)
	{
		addToManyTarget("optionStrikes", obj, true);
	}

	public void removeFromOptionStrikes(OptionStrike obj)
	{
		removeToManyTarget("optionStrikes", obj, true);
	}

	@SuppressWarnings("unchecked")
	public List<OptionStrike> getOptionStrikes()
	{
		return (List<OptionStrike>) readProperty("optionStrikes");
	}

	public void addToOptionStrikes1(OptionStrike obj)
	{
		addToManyTarget("optionStrikes1", obj, true);
	}

	public void removeFromOptionStrikes1(OptionStrike obj)
	{
		removeToManyTarget("optionStrikes1", obj, true);
	}

	@SuppressWarnings("unchecked")
	public List<OptionStrike> getOptionStrikes1()
	{
		return (List<OptionStrike>) readProperty("optionStrikes1");
	}

	public void addToPosLimitDefinitions(PosLimitDefinition obj)
	{
		addToManyTarget("posLimitDefinitions", obj, true);
	}

	public void removeFromPosLimitDefinitions(PosLimitDefinition obj)
	{
		removeToManyTarget("posLimitDefinitions", obj, true);
	}

	@SuppressWarnings("unchecked")
	public List<PosLimitDefinition> getPosLimitDefinitions()
	{
		return (List<PosLimitDefinition>) readProperty("posLimitDefinitions");
	}

	public void addToPosLimitDefinitions1(PosLimitDefinition obj)
	{
		addToManyTarget("posLimitDefinitions1", obj, true);
	}

	public void removeFromPosLimitDefinitions1(PosLimitDefinition obj)
	{
		removeToManyTarget("posLimitDefinitions1", obj, true);
	}

	@SuppressWarnings("unchecked")
	public List<PosLimitDefinition> getPosLimitDefinitions1()
	{
		return (List<PosLimitDefinition>) readProperty("posLimitDefinitions1");
	}

	public void addToPrices(Price obj)
	{
		addToManyTarget("prices", obj, true);
	}

	public void removeFromPrices(Price obj)
	{
		removeToManyTarget("prices", obj, true);
	}

	@SuppressWarnings("unchecked")
	public List<Price> getPrices()
	{
		return (List<Price>) readProperty("prices");
	}

	public void addToPrices1(Price obj)
	{
		addToManyTarget("prices1", obj, true);
	}

	public void removeFromPrices1(Price obj)
	{
		removeToManyTarget("prices1", obj, true);
	}

	@SuppressWarnings("unchecked")
	public List<Price> getPrices1()
	{
		return (List<Price>) readProperty("prices1");
	}

	public void addToSimpleFormulas(SimpleFormula obj)
	{
		addToManyTarget("simpleFormulas", obj, true);
	}

	public void removeFromSimpleFormulas(SimpleFormula obj)
	{
		removeToManyTarget("simpleFormulas", obj, true);
	}

	@SuppressWarnings("unchecked")
	public List<SimpleFormula> getSimpleFormulas()
	{
		return (List<SimpleFormula>) readProperty("simpleFormulas");
	}

	public void addToSimpleFormulas1(SimpleFormula obj)
	{
		addToManyTarget("simpleFormulas1", obj, true);
	}

	public void removeFromSimpleFormulas1(SimpleFormula obj)
	{
		removeToManyTarget("simpleFormulas1", obj, true);
	}

	@SuppressWarnings("unchecked")
	public List<SimpleFormula> getSimpleFormulas1()
	{
		return (List<SimpleFormula>) readProperty("simpleFormulas1");
	}

	public void addToTradeItemDists(TradeItemDist obj)
	{
		addToManyTarget("tradeItemDists", obj, true);
	}

	public void removeFromTradeItemDists(TradeItemDist obj)
	{
		removeToManyTarget("tradeItemDists", obj, true);
	}

	@SuppressWarnings("unchecked")
	public List<TradeItemDist> getTradeItemDists()
	{
		return (List<TradeItemDist>) readProperty("tradeItemDists");
	}

	public void addToTradeItemDists1(TradeItemDist obj)
	{
		addToManyTarget("tradeItemDists1", obj, true);
	}

	public void removeFromTradeItemDists1(TradeItemDist obj)
	{
		removeToManyTarget("tradeItemDists1", obj, true);
	}

	@SuppressWarnings("unchecked")
	public List<TradeItemDist> getTradeItemDists1()
	{
		return (List<TradeItemDist>) readProperty("tradeItemDists1");
	}

	public void addToTradingPeriodAliass(TradingPeriodAlias obj)
	{
		addToManyTarget("tradingPeriodAliass", obj, true);
	}

	public void removeFromTradingPeriodAliass(TradingPeriodAlias obj)
	{
		removeToManyTarget("tradingPeriodAliass", obj, true);
	}

	@SuppressWarnings("unchecked")
	public List<TradingPeriodAlias> getTradingPeriodAliass()
	{
		return (List<TradingPeriodAlias>) readProperty("tradingPeriodAliass");
	}

	public void addToTradingPeriodAliass1(TradingPeriodAlias obj)
	{
		addToManyTarget("tradingPeriodAliass1", obj, true);
	}

	public void removeFromTradingPeriodAliass1(TradingPeriodAlias obj)
	{
		removeToManyTarget("tradingPeriodAliass1", obj, true);
	}

	@SuppressWarnings("unchecked")
	public List<TradingPeriodAlias> getTradingPeriodAliass1()
	{
		return (List<TradingPeriodAlias>) readProperty("tradingPeriodAliass1");
	}

	public void addToVesselDists(VesselDist obj)
	{
		addToManyTarget("vesselDists", obj, true);
	}

	public void removeFromVesselDists(VesselDist obj)
	{
		removeToManyTarget("vesselDists", obj, true);
	}

	@SuppressWarnings("unchecked")
	public List<VesselDist> getVesselDists()
	{
		return (List<VesselDist>) readProperty("vesselDists");
	}

	public void addToVesselDists1(VesselDist obj)
	{
		addToManyTarget("vesselDists1", obj, true);
	}

	public void removeFromVesselDists1(VesselDist obj)
	{
		removeToManyTarget("vesselDists1", obj, true);
	}

	@SuppressWarnings("unchecked")
	public List<VesselDist> getVesselDists1()
	{
		return (List<VesselDist>) readProperty("vesselDists1");
	}

}
