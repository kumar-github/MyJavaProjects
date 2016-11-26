package com.tc.app.exchangemonitor.model.cayenne.persistent.auto;

import java.util.List;

import org.apache.cayenne.CayenneDataObject;
import org.apache.cayenne.exp.Property;

import com.tc.app.exchangemonitor.model.cayenne.persistent.TsOpsCargo;
import com.tc.app.exchangemonitor.model.cayenne.persistent.WorkArea;

/**
 * Class _TsFolder was generated by Cayenne.
 * It is probably a good idea to avoid changing this class manually,
 * since it may be overwritten next time code is regenerated.
 * If you need to make any customizations, please use subclass.
 */
public abstract class _TsFolder extends CayenneDataObject
{

	private static final long serialVersionUID = 1L;

	public static final String FLDCHR_LOT_ID_PK_COLUMN = "fldchrLotId";
	public static final String FLDCHR_LOT_YEAR_PK_COLUMN = "fldchrLotYear";

	public static final Property<Short> FLDSMI_OP_COUNTER = new Property<Short>("fldsmiOpCounter");
	public static final Property<Integer> TRANS_ID = new Property<Integer>("transId");
	public static final Property<List<TsOpsCargo>> TS_OPS_CARGOES = new Property<List<TsOpsCargo>>("tsOpsCargoes");
	public static final Property<WorkArea> WORK_AREA = new Property<WorkArea>("workArea");

	public void setFldsmiOpCounter(Short fldsmiOpCounter)
	{
		writeProperty("fldsmiOpCounter", fldsmiOpCounter);
	}

	public Short getFldsmiOpCounter()
	{
		return (Short) readProperty("fldsmiOpCounter");
	}

	public void setTransId(Integer transId)
	{
		writeProperty("transId", transId);
	}

	public Integer getTransId()
	{
		return (Integer) readProperty("transId");
	}

	public void addToTsOpsCargoes(TsOpsCargo obj)
	{
		addToManyTarget("tsOpsCargoes", obj, true);
	}

	public void removeFromTsOpsCargoes(TsOpsCargo obj)
	{
		removeToManyTarget("tsOpsCargoes", obj, true);
	}

	@SuppressWarnings("unchecked")
	public List<TsOpsCargo> getTsOpsCargoes()
	{
		return (List<TsOpsCargo>) readProperty("tsOpsCargoes");
	}

	public void setWorkArea(WorkArea workArea)
	{
		setToOneTarget("workArea", workArea, true);
	}

	public WorkArea getWorkArea()
	{
		return (WorkArea) readProperty("workArea");
	}

}
