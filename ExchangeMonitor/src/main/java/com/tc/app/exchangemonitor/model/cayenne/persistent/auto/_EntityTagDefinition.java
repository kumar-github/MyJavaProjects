package com.tc.app.exchangemonitor.model.cayenne.persistent.auto;

import java.util.List;

import org.apache.cayenne.CayenneDataObject;
import org.apache.cayenne.exp.Property;

import com.tc.app.exchangemonitor.model.cayenne.persistent.EntityTag;
import com.tc.app.exchangemonitor.model.cayenne.persistent.EntityTagInspAttr;
import com.tc.app.exchangemonitor.model.cayenne.persistent.EntityTagOption;
import com.tc.app.exchangemonitor.model.cayenne.persistent.IctsEntityName;

/**
 * Class _EntityTagDefinition was generated by Cayenne.
 * It is probably a good idea to avoid changing this class manually,
 * since it may be overwritten next time code is regenerated.
 * If you need to make any customizations, please use subclass.
 */
public abstract class _EntityTagDefinition extends CayenneDataObject
{

	private static final long serialVersionUID = 1L;

	public static final String OID_PK_COLUMN = "oid";

	public static final Property<String> ENTITY_TAG_DESC = new Property<String>("entityTagDesc");
	public static final Property<String> ENTITY_TAG_NAME = new Property<String>("entityTagName");
	public static final Property<String> TAG_REQUIRED_IND = new Property<String>("tagRequiredInd");
	public static final Property<String> TAG_STATUS = new Property<String>("tagStatus");
	public static final Property<Integer> TRANS_ID = new Property<Integer>("transId");
	public static final Property<IctsEntityName> ENTITY = new Property<IctsEntityName>("entity");
	public static final Property<List<EntityTagInspAttr>> ENTITY_TAG_INSP_ATTRS = new Property<List<EntityTagInspAttr>>("entityTagInspAttrs");
	public static final Property<List<EntityTagOption>> ENTITY_TAG_OPTIONS = new Property<List<EntityTagOption>>("entityTagOptions");
	public static final Property<List<EntityTag>> ENTITY_TAGS = new Property<List<EntityTag>>("entityTags");
	public static final Property<IctsEntityName> TARGET_ENTITY = new Property<IctsEntityName>("targetEntity");

	public void setEntityTagDesc(String entityTagDesc)
	{
		writeProperty("entityTagDesc", entityTagDesc);
	}

	public String getEntityTagDesc()
	{
		return (String) readProperty("entityTagDesc");
	}

	public void setEntityTagName(String entityTagName)
	{
		writeProperty("entityTagName", entityTagName);
	}

	public String getEntityTagName()
	{
		return (String) readProperty("entityTagName");
	}

	public void setTagRequiredInd(String tagRequiredInd)
	{
		writeProperty("tagRequiredInd", tagRequiredInd);
	}

	public String getTagRequiredInd()
	{
		return (String) readProperty("tagRequiredInd");
	}

	public void setTagStatus(String tagStatus)
	{
		writeProperty("tagStatus", tagStatus);
	}

	public String getTagStatus()
	{
		return (String) readProperty("tagStatus");
	}

	public void setTransId(Integer transId)
	{
		writeProperty("transId", transId);
	}

	public Integer getTransId()
	{
		return (Integer) readProperty("transId");
	}

	public void setEntity(IctsEntityName entity)
	{
		setToOneTarget("entity", entity, true);
	}

	public IctsEntityName getEntity()
	{
		return (IctsEntityName) readProperty("entity");
	}

	public void addToEntityTagInspAttrs(EntityTagInspAttr obj)
	{
		addToManyTarget("entityTagInspAttrs", obj, true);
	}

	public void removeFromEntityTagInspAttrs(EntityTagInspAttr obj)
	{
		removeToManyTarget("entityTagInspAttrs", obj, true);
	}

	@SuppressWarnings("unchecked")
	public List<EntityTagInspAttr> getEntityTagInspAttrs()
	{
		return (List<EntityTagInspAttr>) readProperty("entityTagInspAttrs");
	}

	public void addToEntityTagOptions(EntityTagOption obj)
	{
		addToManyTarget("entityTagOptions", obj, true);
	}

	public void removeFromEntityTagOptions(EntityTagOption obj)
	{
		removeToManyTarget("entityTagOptions", obj, true);
	}

	@SuppressWarnings("unchecked")
	public List<EntityTagOption> getEntityTagOptions()
	{
		return (List<EntityTagOption>) readProperty("entityTagOptions");
	}

	public void addToEntityTags(EntityTag obj)
	{
		addToManyTarget("entityTags", obj, true);
	}

	public void removeFromEntityTags(EntityTag obj)
	{
		removeToManyTarget("entityTags", obj, true);
	}

	@SuppressWarnings("unchecked")
	public List<EntityTag> getEntityTags()
	{
		return (List<EntityTag>) readProperty("entityTags");
	}

	public void setTargetEntity(IctsEntityName targetEntity)
	{
		setToOneTarget("targetEntity", targetEntity, true);
	}

	public IctsEntityName getTargetEntity()
	{
		return (IctsEntityName) readProperty("targetEntity");
	}

}