package com.tc.app.exchangemonitor.model.cayenne.persistent.auto;

import java.util.List;

import org.apache.cayenne.CayenneDataObject;
import org.apache.cayenne.exp.Property;

import com.tc.app.exchangemonitor.model.cayenne.persistent.Mot;
import com.tc.app.exchangemonitor.model.cayenne.persistent.PipelineTerminals;
import com.tc.app.exchangemonitor.model.cayenne.persistent.PlContract;

/**
 * Class _Pipeline was generated by Cayenne.
 * It is probably a good idea to avoid changing this class manually,
 * since it may be overwritten next time code is regenerated.
 * If you need to make any customizations, please use subclass.
 */
public abstract class _Pipeline extends CayenneDataObject
{

	private static final long serialVersionUID = 1L;

	public static final String FLDCHR_PLCODE_PK_COLUMN = "fldchrPLCode";

	public static final Property<String> FLDVCH_PLDESC = new Property<String>("fldvchPLDesc");
	public static final Property<Integer> TRANS_ID = new Property<Integer>("transId");
	public static final Property<Mot> MOT = new Property<Mot>("mot");
	public static final Property<List<PipelineTerminals>> PIPELINE_TERMINALSS = new Property<List<PipelineTerminals>>("pipelineTerminalss");
	public static final Property<List<PlContract>> PL_CONTRACTS = new Property<List<PlContract>>("plContracts");

	public void setFldvchPLDesc(String fldvchPLDesc)
	{
		writeProperty("fldvchPLDesc", fldvchPLDesc);
	}

	public String getFldvchPLDesc()
	{
		return (String) readProperty("fldvchPLDesc");
	}

	public void setTransId(Integer transId)
	{
		writeProperty("transId", transId);
	}

	public Integer getTransId()
	{
		return (Integer) readProperty("transId");
	}

	public void setMot(Mot mot)
	{
		setToOneTarget("mot", mot, true);
	}

	public Mot getMot()
	{
		return (Mot) readProperty("mot");
	}

	public void addToPipelineTerminalss(PipelineTerminals obj)
	{
		addToManyTarget("pipelineTerminalss", obj, true);
	}

	public void removeFromPipelineTerminalss(PipelineTerminals obj)
	{
		removeToManyTarget("pipelineTerminalss", obj, true);
	}

	@SuppressWarnings("unchecked")
	public List<PipelineTerminals> getPipelineTerminalss()
	{
		return (List<PipelineTerminals>) readProperty("pipelineTerminalss");
	}

	public void addToPlContracts(PlContract obj)
	{
		addToManyTarget("plContracts", obj, true);
	}

	public void removeFromPlContracts(PlContract obj)
	{
		removeToManyTarget("plContracts", obj, true);
	}

	@SuppressWarnings("unchecked")
	public List<PlContract> getPlContracts()
	{
		return (List<PlContract>) readProperty("plContracts");
	}

}