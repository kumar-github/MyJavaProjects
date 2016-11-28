package com.tc.app.exchangemonitor.model.cayenne.persistent.auto;

import java.util.List;

import org.apache.cayenne.CayenneDataObject;
import org.apache.cayenne.exp.Property;

import com.tc.app.exchangemonitor.model.cayenne.persistent.Cost;
import com.tc.app.exchangemonitor.model.cayenne.persistent.EomPostingBatch;
import com.tc.app.exchangemonitor.model.cayenne.persistent.FxCostDrawDownHist;

/**
 * Class _CostType was generated by Cayenne.
 * It is probably a good idea to avoid changing this class manually,
 * since it may be overwritten next time code is regenerated.
 * If you need to make any customizations, please use subclass.
 */
public abstract class _CostType extends CayenneDataObject
{

	private static final long serialVersionUID = 1L;

	public static final String COST_TYPE_CODE_PK_COLUMN = "cost_type_code";

	public static final Property<String> COST_TYPE_DESC = new Property<String>("costTypeDesc");
	public static final Property<String> IS_PRIN_PRIM_IND = new Property<String>("isPrinPrimInd");
	public static final Property<Integer> TRANS_ID = new Property<Integer>("transId");
	public static final Property<List<Cost>> COSTS = new Property<List<Cost>>("costs");
	public static final Property<List<EomPostingBatch>> EOM_POSTING_BATCHES = new Property<List<EomPostingBatch>>("eomPostingBatches");
	public static final Property<List<FxCostDrawDownHist>> FX_COST_DRAW_DOWN_HISTS = new Property<List<FxCostDrawDownHist>>("fxCostDrawDownHists");

	public void setCostTypeDesc(String costTypeDesc)
	{
		writeProperty("costTypeDesc", costTypeDesc);
	}

	public String getCostTypeDesc()
	{
		return (String) readProperty("costTypeDesc");
	}

	public void setIsPrinPrimInd(String isPrinPrimInd)
	{
		writeProperty("isPrinPrimInd", isPrinPrimInd);
	}

	public String getIsPrinPrimInd()
	{
		return (String) readProperty("isPrinPrimInd");
	}

	public void setTransId(Integer transId)
	{
		writeProperty("transId", transId);
	}

	public Integer getTransId()
	{
		return (Integer) readProperty("transId");
	}

	public void addToCosts(Cost obj)
	{
		addToManyTarget("costs", obj, true);
	}

	public void removeFromCosts(Cost obj)
	{
		removeToManyTarget("costs", obj, true);
	}

	@SuppressWarnings("unchecked")
	public List<Cost> getCosts()
	{
		return (List<Cost>) readProperty("costs");
	}

	public void addToEomPostingBatches(EomPostingBatch obj)
	{
		addToManyTarget("eomPostingBatches", obj, true);
	}

	public void removeFromEomPostingBatches(EomPostingBatch obj)
	{
		removeToManyTarget("eomPostingBatches", obj, true);
	}

	@SuppressWarnings("unchecked")
	public List<EomPostingBatch> getEomPostingBatches()
	{
		return (List<EomPostingBatch>) readProperty("eomPostingBatches");
	}

	public void addToFxCostDrawDownHists(FxCostDrawDownHist obj)
	{
		addToManyTarget("fxCostDrawDownHists", obj, true);
	}

	public void removeFromFxCostDrawDownHists(FxCostDrawDownHist obj)
	{
		removeToManyTarget("fxCostDrawDownHists", obj, true);
	}

	@SuppressWarnings("unchecked")
	public List<FxCostDrawDownHist> getFxCostDrawDownHists()
	{
		return (List<FxCostDrawDownHist>) readProperty("fxCostDrawDownHists");
	}

}