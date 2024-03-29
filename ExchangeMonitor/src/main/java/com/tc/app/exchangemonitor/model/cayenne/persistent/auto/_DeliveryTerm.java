package com.tc.app.exchangemonitor.model.cayenne.persistent.auto;

import java.util.List;

import org.apache.cayenne.CayenneDataObject;
import org.apache.cayenne.exp.Property;

import com.tc.app.exchangemonitor.model.cayenne.persistent.AccountInstruction;
import com.tc.app.exchangemonitor.model.cayenne.persistent.AllocationItem;
import com.tc.app.exchangemonitor.model.cayenne.persistent.DeliveryTermAlias;
import com.tc.app.exchangemonitor.model.cayenne.persistent.TradeItemBunker;
import com.tc.app.exchangemonitor.model.cayenne.persistent.TradeItemComposite;
import com.tc.app.exchangemonitor.model.cayenne.persistent.TradeItemDryPhy;
import com.tc.app.exchangemonitor.model.cayenne.persistent.TradeItemStorage;
import com.tc.app.exchangemonitor.model.cayenne.persistent.TradeItemWetPhy;

/**
 * Class _DeliveryTerm was generated by Cayenne.
 * It is probably a good idea to avoid changing this class manually,
 * since it may be overwritten next time code is regenerated.
 * If you need to make any customizations, please use subclass.
 */
public abstract class _DeliveryTerm extends CayenneDataObject
{

	private static final long serialVersionUID = 1L;

	public static final String DEL_TERM_CODE_PK_COLUMN = "del_term_code";

	public static final Property<String> DEL_TERM_DESC = new Property<String>("delTermDesc");
	public static final Property<Integer> TRANS_ID = new Property<Integer>("transId");
	public static final Property<List<AccountInstruction>> ACCOUNT_INSTRUCTIONS = new Property<List<AccountInstruction>>("accountInstructions");
	public static final Property<List<AllocationItem>> ALLOCATION_ITEMS = new Property<List<AllocationItem>>("allocationItems");
	public static final Property<List<DeliveryTermAlias>> DELIVERY_TERM_ALIASS = new Property<List<DeliveryTermAlias>>("deliveryTermAliass");
	public static final Property<List<TradeItemBunker>> TRADE_ITEM_BUNKERS = new Property<List<TradeItemBunker>>("tradeItemBunkers");
	public static final Property<List<TradeItemComposite>> TRADE_ITEM_COMPOSITES = new Property<List<TradeItemComposite>>("tradeItemComposites");
	public static final Property<List<TradeItemDryPhy>> TRADE_ITEM_DRY_PHIES = new Property<List<TradeItemDryPhy>>("tradeItemDryPhies");
	public static final Property<List<TradeItemStorage>> TRADE_ITEM_STORAGES = new Property<List<TradeItemStorage>>("tradeItemStorages");
	public static final Property<List<TradeItemWetPhy>> TRADE_ITEM_WET_PHIES = new Property<List<TradeItemWetPhy>>("tradeItemWetPhies");

	public void setDelTermDesc(String delTermDesc)
	{
		writeProperty("delTermDesc", delTermDesc);
	}

	public String getDelTermDesc()
	{
		return (String) readProperty("delTermDesc");
	}

	public void setTransId(Integer transId)
	{
		writeProperty("transId", transId);
	}

	public Integer getTransId()
	{
		return (Integer) readProperty("transId");
	}

	public void addToAccountInstructions(AccountInstruction obj)
	{
		addToManyTarget("accountInstructions", obj, true);
	}

	public void removeFromAccountInstructions(AccountInstruction obj)
	{
		removeToManyTarget("accountInstructions", obj, true);
	}

	@SuppressWarnings("unchecked")
	public List<AccountInstruction> getAccountInstructions()
	{
		return (List<AccountInstruction>) readProperty("accountInstructions");
	}

	public void addToAllocationItems(AllocationItem obj)
	{
		addToManyTarget("allocationItems", obj, true);
	}

	public void removeFromAllocationItems(AllocationItem obj)
	{
		removeToManyTarget("allocationItems", obj, true);
	}

	@SuppressWarnings("unchecked")
	public List<AllocationItem> getAllocationItems()
	{
		return (List<AllocationItem>) readProperty("allocationItems");
	}

	public void addToDeliveryTermAliass(DeliveryTermAlias obj)
	{
		addToManyTarget("deliveryTermAliass", obj, true);
	}

	public void removeFromDeliveryTermAliass(DeliveryTermAlias obj)
	{
		removeToManyTarget("deliveryTermAliass", obj, true);
	}

	@SuppressWarnings("unchecked")
	public List<DeliveryTermAlias> getDeliveryTermAliass()
	{
		return (List<DeliveryTermAlias>) readProperty("deliveryTermAliass");
	}

	public void addToTradeItemBunkers(TradeItemBunker obj)
	{
		addToManyTarget("tradeItemBunkers", obj, true);
	}

	public void removeFromTradeItemBunkers(TradeItemBunker obj)
	{
		removeToManyTarget("tradeItemBunkers", obj, true);
	}

	@SuppressWarnings("unchecked")
	public List<TradeItemBunker> getTradeItemBunkers()
	{
		return (List<TradeItemBunker>) readProperty("tradeItemBunkers");
	}

	public void addToTradeItemComposites(TradeItemComposite obj)
	{
		addToManyTarget("tradeItemComposites", obj, true);
	}

	public void removeFromTradeItemComposites(TradeItemComposite obj)
	{
		removeToManyTarget("tradeItemComposites", obj, true);
	}

	@SuppressWarnings("unchecked")
	public List<TradeItemComposite> getTradeItemComposites()
	{
		return (List<TradeItemComposite>) readProperty("tradeItemComposites");
	}

	public void addToTradeItemDryPhies(TradeItemDryPhy obj)
	{
		addToManyTarget("tradeItemDryPhies", obj, true);
	}

	public void removeFromTradeItemDryPhies(TradeItemDryPhy obj)
	{
		removeToManyTarget("tradeItemDryPhies", obj, true);
	}

	@SuppressWarnings("unchecked")
	public List<TradeItemDryPhy> getTradeItemDryPhies()
	{
		return (List<TradeItemDryPhy>) readProperty("tradeItemDryPhies");
	}

	public void addToTradeItemStorages(TradeItemStorage obj)
	{
		addToManyTarget("tradeItemStorages", obj, true);
	}

	public void removeFromTradeItemStorages(TradeItemStorage obj)
	{
		removeToManyTarget("tradeItemStorages", obj, true);
	}

	@SuppressWarnings("unchecked")
	public List<TradeItemStorage> getTradeItemStorages()
	{
		return (List<TradeItemStorage>) readProperty("tradeItemStorages");
	}

	public void addToTradeItemWetPhies(TradeItemWetPhy obj)
	{
		addToManyTarget("tradeItemWetPhies", obj, true);
	}

	public void removeFromTradeItemWetPhies(TradeItemWetPhy obj)
	{
		removeToManyTarget("tradeItemWetPhies", obj, true);
	}

	@SuppressWarnings("unchecked")
	public List<TradeItemWetPhy> getTradeItemWetPhies()
	{
		return (List<TradeItemWetPhy>) readProperty("tradeItemWetPhies");
	}

}
