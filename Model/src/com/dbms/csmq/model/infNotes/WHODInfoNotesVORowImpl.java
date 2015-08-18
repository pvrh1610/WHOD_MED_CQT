package com.dbms.csmq.model.infNotes;

import oracle.jbo.domain.Date;
import oracle.jbo.domain.Number;
import oracle.jbo.server.AttributeDefImpl;
import oracle.jbo.server.ViewRowImpl;
// ---------------------------------------------------------------------
// ---    File generated by Oracle ADF Business Components Design Time.
// ---    Wed Aug 19 00:35:45 IST 2015
// ---    Custom code may be added to this class.
// ---    Warning: Do not modify method signatures of generated methods.
// ---------------------------------------------------------------------
public class WHODInfoNotesVORowImpl extends ViewRowImpl {
    /**
     * AttributesEnum: generated enum for identifying attributes and accessors. Do not modify.
     */
    public enum AttributesEnum {
        ReleaseStatus {
            public Object get(WHODInfoNotesVORowImpl obj) {
                return obj.getReleaseStatus();
            }

            public void put(WHODInfoNotesVORowImpl obj, Object value) {
                obj.setReleaseStatus((String)value);
            }
        }
        ,
        ReleaseType {
            public Object get(WHODInfoNotesVORowImpl obj) {
                return obj.getReleaseType();
            }

            public void put(WHODInfoNotesVORowImpl obj, Object value) {
                obj.setReleaseType((String)value);
            }
        }
        ,
        DictContentId {
            public Object get(WHODInfoNotesVORowImpl obj) {
                return obj.getDictContentId();
            }

            public void put(WHODInfoNotesVORowImpl obj, Object value) {
                obj.setDictContentId((Number)value);
            }
        }
        ,
        DictInfoHdrId {
            public Object get(WHODInfoNotesVORowImpl obj) {
                return obj.getDictInfoHdrId();
            }

            public void put(WHODInfoNotesVORowImpl obj, Object value) {
                obj.setDictInfoHdrId((Number)value);
            }
        }
        ,
        InfoNoteType {
            public Object get(WHODInfoNotesVORowImpl obj) {
                return obj.getInfoNoteType();
            }

            public void put(WHODInfoNotesVORowImpl obj, Object value) {
                obj.setInfoNoteType((String)value);
            }
        }
        ,
        InfoNoteName {
            public Object get(WHODInfoNotesVORowImpl obj) {
                return obj.getInfoNoteName();
            }

            public void put(WHODInfoNotesVORowImpl obj, Object value) {
                obj.setInfoNoteName((String)value);
            }
        }
        ,
        InfoNoteValue {
            public Object get(WHODInfoNotesVORowImpl obj) {
                return obj.getInfoNoteValue();
            }

            public void put(WHODInfoNotesVORowImpl obj, Object value) {
                obj.setInfoNoteValue((String)value);
            }
        }
        ,
        DictInfoClobEntryTs {
            public Object get(WHODInfoNotesVORowImpl obj) {
                return obj.getDictInfoClobEntryTs();
            }

            public void put(WHODInfoNotesVORowImpl obj, Object value) {
                obj.setDictInfoClobEntryTs((Date)value);
            }
        }
        ,
        EndTs {
            public Object get(WHODInfoNotesVORowImpl obj) {
                return obj.getEndTs();
            }

            public void put(WHODInfoNotesVORowImpl obj, Object value) {
                obj.setEndTs((Date)value);
            }
        }
        ,
        CreatedBy {
            public Object get(WHODInfoNotesVORowImpl obj) {
                return obj.getCreatedBy();
            }

            public void put(WHODInfoNotesVORowImpl obj, Object value) {
                obj.setCreatedBy((String)value);
            }
        }
        ,
        ActivationGroupName {
            public Object get(WHODInfoNotesVORowImpl obj) {
                return obj.getActivationGroupName();
            }

            public void put(WHODInfoNotesVORowImpl obj, Object value) {
                obj.setActivationGroupName((String)value);
            }
        }
        ,
        Dml {
            public Object get(WHODInfoNotesVORowImpl obj) {
                return obj.getDml();
            }

            public void put(WHODInfoNotesVORowImpl obj, Object value) {
                obj.setDml((String)value);
            }
        }
        ,
        ActivationGroupId {
            public Object get(WHODInfoNotesVORowImpl obj) {
                return obj.getActivationGroupId();
            }

            public void put(WHODInfoNotesVORowImpl obj, Object value) {
                obj.setActivationGroupId((Number)value);
            }
        }
        ;
        private static AttributesEnum[] vals = null;
        private static int firstIndex = 0;

        public abstract Object get(WHODInfoNotesVORowImpl object);

        public abstract void put(WHODInfoNotesVORowImpl object, Object value);

        public int index() {
            return AttributesEnum.firstIndex() + ordinal();
        }

        public static int firstIndex() {
            return firstIndex;
        }

        public static int count() {
            return AttributesEnum.firstIndex() + AttributesEnum.staticValues().length;
        }

        public static AttributesEnum[] staticValues() {
            if (vals == null) {
                vals = AttributesEnum.values();
            }
            return vals;
        }
    }
    public static final int RELEASESTATUS = AttributesEnum.ReleaseStatus.index();
    public static final int RELEASETYPE = AttributesEnum.ReleaseType.index();
    public static final int DICTCONTENTID = AttributesEnum.DictContentId.index();
    public static final int DICTINFOHDRID = AttributesEnum.DictInfoHdrId.index();
    public static final int INFONOTETYPE = AttributesEnum.InfoNoteType.index();
    public static final int INFONOTENAME = AttributesEnum.InfoNoteName.index();
    public static final int INFONOTEVALUE = AttributesEnum.InfoNoteValue.index();
    public static final int DICTINFOCLOBENTRYTS = AttributesEnum.DictInfoClobEntryTs.index();
    public static final int ENDTS = AttributesEnum.EndTs.index();
    public static final int CREATEDBY = AttributesEnum.CreatedBy.index();
    public static final int ACTIVATIONGROUPNAME = AttributesEnum.ActivationGroupName.index();
    public static final int DML = AttributesEnum.Dml.index();
    public static final int ACTIVATIONGROUPID = AttributesEnum.ActivationGroupId.index();

    /**
     * This is the default constructor (do not remove).
     */
    public WHODInfoNotesVORowImpl() {
    }

    /**
     * Gets the attribute value for the calculated attribute ReleaseStatus.
     * @return the ReleaseStatus
     */
    public String getReleaseStatus() {
        return (String) getAttributeInternal(RELEASESTATUS);
    }

    /**
     * Sets <code>value</code> as the attribute value for the calculated attribute ReleaseStatus.
     * @param value value to set the  ReleaseStatus
     */
    public void setReleaseStatus(String value) {
        setAttributeInternal(RELEASESTATUS, value);
    }

    /**
     * Gets the attribute value for the calculated attribute ReleaseType.
     * @return the ReleaseType
     */
    public String getReleaseType() {
        return (String) getAttributeInternal(RELEASETYPE);
    }

    /**
     * Sets <code>value</code> as the attribute value for the calculated attribute ReleaseType.
     * @param value value to set the  ReleaseType
     */
    public void setReleaseType(String value) {
        setAttributeInternal(RELEASETYPE, value);
    }

    /**
     * Gets the attribute value for the calculated attribute DictContentId.
     * @return the DictContentId
     */
    public Number getDictContentId() {
        return (Number) getAttributeInternal(DICTCONTENTID);
    }

    /**
     * Sets <code>value</code> as the attribute value for the calculated attribute DictContentId.
     * @param value value to set the  DictContentId
     */
    public void setDictContentId(Number value) {
        setAttributeInternal(DICTCONTENTID, value);
    }

    /**
     * Gets the attribute value for the calculated attribute DictInfoHdrId.
     * @return the DictInfoHdrId
     */
    public Number getDictInfoHdrId() {
        return (Number) getAttributeInternal(DICTINFOHDRID);
    }

    /**
     * Sets <code>value</code> as the attribute value for the calculated attribute DictInfoHdrId.
     * @param value value to set the  DictInfoHdrId
     */
    public void setDictInfoHdrId(Number value) {
        setAttributeInternal(DICTINFOHDRID, value);
    }

    /**
     * Gets the attribute value for the calculated attribute InfoNoteType.
     * @return the InfoNoteType
     */
    public String getInfoNoteType() {
        return (String) getAttributeInternal(INFONOTETYPE);
    }

    /**
     * Sets <code>value</code> as the attribute value for the calculated attribute InfoNoteType.
     * @param value value to set the  InfoNoteType
     */
    public void setInfoNoteType(String value) {
        setAttributeInternal(INFONOTETYPE, value);
    }

    /**
     * Gets the attribute value for the calculated attribute InfoNoteName.
     * @return the InfoNoteName
     */
    public String getInfoNoteName() {
        return (String) getAttributeInternal(INFONOTENAME);
    }

    /**
     * Sets <code>value</code> as the attribute value for the calculated attribute InfoNoteName.
     * @param value value to set the  InfoNoteName
     */
    public void setInfoNoteName(String value) {
        setAttributeInternal(INFONOTENAME, value);
    }

    /**
     * Gets the attribute value for the calculated attribute InfoNoteValue.
     * @return the InfoNoteValue
     */
    public String getInfoNoteValue() {
        return (String) getAttributeInternal(INFONOTEVALUE);
    }

    /**
     * Sets <code>value</code> as the attribute value for the calculated attribute InfoNoteValue.
     * @param value value to set the  InfoNoteValue
     */
    public void setInfoNoteValue(String value) {
        setAttributeInternal(INFONOTEVALUE, value);
    }

    /**
     * Gets the attribute value for the calculated attribute DictInfoClobEntryTs.
     * @return the DictInfoClobEntryTs
     */
    public Date getDictInfoClobEntryTs() {
        return (Date) getAttributeInternal(DICTINFOCLOBENTRYTS);
    }

    /**
     * Sets <code>value</code> as the attribute value for the calculated attribute DictInfoClobEntryTs.
     * @param value value to set the  DictInfoClobEntryTs
     */
    public void setDictInfoClobEntryTs(Date value) {
        setAttributeInternal(DICTINFOCLOBENTRYTS, value);
    }

    /**
     * Gets the attribute value for the calculated attribute EndTs.
     * @return the EndTs
     */
    public Date getEndTs() {
        return (Date) getAttributeInternal(ENDTS);
    }

    /**
     * Sets <code>value</code> as the attribute value for the calculated attribute EndTs.
     * @param value value to set the  EndTs
     */
    public void setEndTs(Date value) {
        setAttributeInternal(ENDTS, value);
    }

    /**
     * Gets the attribute value for the calculated attribute CreatedBy.
     * @return the CreatedBy
     */
    public String getCreatedBy() {
        return (String) getAttributeInternal(CREATEDBY);
    }

    /**
     * Sets <code>value</code> as the attribute value for the calculated attribute CreatedBy.
     * @param value value to set the  CreatedBy
     */
    public void setCreatedBy(String value) {
        setAttributeInternal(CREATEDBY, value);
    }

    /**
     * Gets the attribute value for the calculated attribute ActivationGroupName.
     * @return the ActivationGroupName
     */
    public String getActivationGroupName() {
        return (String) getAttributeInternal(ACTIVATIONGROUPNAME);
    }

    /**
     * Sets <code>value</code> as the attribute value for the calculated attribute ActivationGroupName.
     * @param value value to set the  ActivationGroupName
     */
    public void setActivationGroupName(String value) {
        setAttributeInternal(ACTIVATIONGROUPNAME, value);
    }

    /**
     * Gets the attribute value for the calculated attribute Dml.
     * @return the Dml
     */
    public String getDml() {
        return (String) getAttributeInternal(DML);
    }

    /**
     * Sets <code>value</code> as the attribute value for the calculated attribute Dml.
     * @param value value to set the  Dml
     */
    public void setDml(String value) {
        setAttributeInternal(DML, value);
    }

    /**
     * Gets the attribute value for the calculated attribute ActivationGroupId.
     * @return the ActivationGroupId
     */
    public Number getActivationGroupId() {
        return (Number) getAttributeInternal(ACTIVATIONGROUPID);
    }

    /**
     * Sets <code>value</code> as the attribute value for the calculated attribute ActivationGroupId.
     * @param value value to set the  ActivationGroupId
     */
    public void setActivationGroupId(Number value) {
        setAttributeInternal(ACTIVATIONGROUPID, value);
    }

    /**
     * getAttrInvokeAccessor: generated method. Do not modify.
     * @param index the index identifying the attribute
     * @param attrDef the attribute

     * @return the attribute value
     * @throws Exception
     */
    protected Object getAttrInvokeAccessor(int index, AttributeDefImpl attrDef) throws Exception {
        if ((index >= AttributesEnum.firstIndex()) && (index < AttributesEnum.count())) {
            return AttributesEnum.staticValues()[index - AttributesEnum.firstIndex()].get(this);
        }
        return super.getAttrInvokeAccessor(index, attrDef);
    }

    /**
     * setAttrInvokeAccessor: generated method. Do not modify.
     * @param index the index identifying the attribute
     * @param value the value to assign to the attribute
     * @param attrDef the attribute

     * @throws Exception
     */
    protected void setAttrInvokeAccessor(int index, Object value, AttributeDefImpl attrDef) throws Exception {
        if ((index >= AttributesEnum.firstIndex()) && (index < AttributesEnum.count())) {
            AttributesEnum.staticValues()[index - AttributesEnum.firstIndex()].put(this, value);
            return;
        }
        super.setAttrInvokeAccessor(index, value, attrDef);
    }
}
