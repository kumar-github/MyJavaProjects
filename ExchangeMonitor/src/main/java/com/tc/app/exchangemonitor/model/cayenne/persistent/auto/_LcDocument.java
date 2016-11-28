package com.tc.app.exchangemonitor.model.cayenne.persistent.auto;

import org.apache.cayenne.CayenneDataObject;
import org.apache.cayenne.exp.Property;

import com.tc.app.exchangemonitor.model.cayenne.persistent.LcDocType;

/**
 * Class _LcDocument was generated by Cayenne.
 * It is probably a good idea to avoid changing this class manually,
 * since it may be overwritten next time code is regenerated.
 * If you need to make any customizations, please use subclass.
 */
public abstract class _LcDocument extends CayenneDataObject
{

	private static final long serialVersionUID = 1L;

	public static final String LC_DOC_CODE_PK_COLUMN = "lc_doc_code";
	public static final String LC_NUM_PK_COLUMN = "lc_num";

	public static final Property<Short> LC_DOC_COPY_NUM = new Property<Short>("lcDocCopyNum");
	public static final Property<Short> LC_NO_OF_ORIG_DOC_REQD = new Property<Short>("lcNoOfOrigDocReqd");
	public static final Property<Integer> TRANS_ID = new Property<Integer>("transId");
	public static final Property<LcDocType> LC_DOC_TYPE = new Property<LcDocType>("lcDocType");

	public void setLcDocCopyNum(Short lcDocCopyNum)
	{
		writeProperty("lcDocCopyNum", lcDocCopyNum);
	}

	public Short getLcDocCopyNum()
	{
		return (Short) readProperty("lcDocCopyNum");
	}

	public void setLcNoOfOrigDocReqd(Short lcNoOfOrigDocReqd)
	{
		writeProperty("lcNoOfOrigDocReqd", lcNoOfOrigDocReqd);
	}

	public Short getLcNoOfOrigDocReqd()
	{
		return (Short) readProperty("lcNoOfOrigDocReqd");
	}

	public void setTransId(Integer transId)
	{
		writeProperty("transId", transId);
	}

	public Integer getTransId()
	{
		return (Integer) readProperty("transId");
	}

	public void setLcDocType(LcDocType lcDocType)
	{
		setToOneTarget("lcDocType", lcDocType, true);
	}

	public LcDocType getLcDocType()
	{
		return (LcDocType) readProperty("lcDocType");
	}

}