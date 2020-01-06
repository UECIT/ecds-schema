/*
 * XML Type:  ClinicalTreatmentGroupAAndE_Type
 * Namespace: http://www.nhsia.nhs.uk/DataStandards/XMLschema/CDS/ns
 * Java type: uk.nhs.nhsia.datastandards.ecds.ClinicalTreatmentGroupAAndEType
 *
 * Automatically generated - do not modify.
 */
package uk.nhs.nhsia.datastandards.ecds.impl;
/**
 * An XML ClinicalTreatmentGroupAAndE_Type(@http://www.nhsia.nhs.uk/DataStandards/XMLschema/CDS/ns).
 *
 * This is a complex type.
 */
public class ClinicalTreatmentGroupAAndETypeImpl extends org.apache.xmlbeans.impl.values.XmlComplexContentImpl implements uk.nhs.nhsia.datastandards.ecds.ClinicalTreatmentGroupAAndEType
{
    private static final long serialVersionUID = 1L;
    
    public ClinicalTreatmentGroupAAndETypeImpl(org.apache.xmlbeans.SchemaType sType)
    {
        super(sType);
    }
    
    private static final javax.xml.namespace.QName PROCEDURESCHEMEINUSE$0 = 
        new javax.xml.namespace.QName("http://www.nhsia.nhs.uk/DataStandards/XMLschema/CDS/ns", "ProcedureSchemeInUse");
    private static final javax.xml.namespace.QName PRIMARYTREATMENTGROUPAANDE$2 = 
        new javax.xml.namespace.QName("http://www.nhsia.nhs.uk/DataStandards/XMLschema/CDS/ns", "PrimaryTreatmentGroupAAndE");
    private static final javax.xml.namespace.QName SECONDARYTREATMENTGROUPAANDE$4 = 
        new javax.xml.namespace.QName("http://www.nhsia.nhs.uk/DataStandards/XMLschema/CDS/ns", "SecondaryTreatmentGroupAAndE");
    
    
    /**
     * Gets the "ProcedureSchemeInUse" element
     */
    public uk.nhs.nhsia.datastandards.ecds.ProcedureSchemeInUseType.Enum getProcedureSchemeInUse()
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.SimpleValue target = null;
            target = (org.apache.xmlbeans.SimpleValue)get_store().find_element_user(PROCEDURESCHEMEINUSE$0, 0);
            if (target == null)
            {
                return null;
            }
            return (uk.nhs.nhsia.datastandards.ecds.ProcedureSchemeInUseType.Enum)target.getEnumValue();
        }
    }
    
    /**
     * Gets (as xml) the "ProcedureSchemeInUse" element
     */
    public uk.nhs.nhsia.datastandards.ecds.ProcedureSchemeInUseType xgetProcedureSchemeInUse()
    {
        synchronized (monitor())
        {
            check_orphaned();
            uk.nhs.nhsia.datastandards.ecds.ProcedureSchemeInUseType target = null;
            target = (uk.nhs.nhsia.datastandards.ecds.ProcedureSchemeInUseType)get_store().find_element_user(PROCEDURESCHEMEINUSE$0, 0);
            return target;
        }
    }
    
    /**
     * Sets the "ProcedureSchemeInUse" element
     */
    public void setProcedureSchemeInUse(uk.nhs.nhsia.datastandards.ecds.ProcedureSchemeInUseType.Enum procedureSchemeInUse)
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.SimpleValue target = null;
            target = (org.apache.xmlbeans.SimpleValue)get_store().find_element_user(PROCEDURESCHEMEINUSE$0, 0);
            if (target == null)
            {
                target = (org.apache.xmlbeans.SimpleValue)get_store().add_element_user(PROCEDURESCHEMEINUSE$0);
            }
            target.setEnumValue(procedureSchemeInUse);
        }
    }
    
    /**
     * Sets (as xml) the "ProcedureSchemeInUse" element
     */
    public void xsetProcedureSchemeInUse(uk.nhs.nhsia.datastandards.ecds.ProcedureSchemeInUseType procedureSchemeInUse)
    {
        synchronized (monitor())
        {
            check_orphaned();
            uk.nhs.nhsia.datastandards.ecds.ProcedureSchemeInUseType target = null;
            target = (uk.nhs.nhsia.datastandards.ecds.ProcedureSchemeInUseType)get_store().find_element_user(PROCEDURESCHEMEINUSE$0, 0);
            if (target == null)
            {
                target = (uk.nhs.nhsia.datastandards.ecds.ProcedureSchemeInUseType)get_store().add_element_user(PROCEDURESCHEMEINUSE$0);
            }
            target.set(procedureSchemeInUse);
        }
    }
    
    /**
     * Gets the "PrimaryTreatmentGroupAAndE" element
     */
    public uk.nhs.nhsia.datastandards.ecds.ClinicalTreatmentGroupAAndEType.PrimaryTreatmentGroupAAndE getPrimaryTreatmentGroupAAndE()
    {
        synchronized (monitor())
        {
            check_orphaned();
            uk.nhs.nhsia.datastandards.ecds.ClinicalTreatmentGroupAAndEType.PrimaryTreatmentGroupAAndE target = null;
            target = (uk.nhs.nhsia.datastandards.ecds.ClinicalTreatmentGroupAAndEType.PrimaryTreatmentGroupAAndE)get_store().find_element_user(PRIMARYTREATMENTGROUPAANDE$2, 0);
            if (target == null)
            {
                return null;
            }
            return target;
        }
    }
    
    /**
     * Sets the "PrimaryTreatmentGroupAAndE" element
     */
    public void setPrimaryTreatmentGroupAAndE(uk.nhs.nhsia.datastandards.ecds.ClinicalTreatmentGroupAAndEType.PrimaryTreatmentGroupAAndE primaryTreatmentGroupAAndE)
    {
        generatedSetterHelperImpl(primaryTreatmentGroupAAndE, PRIMARYTREATMENTGROUPAANDE$2, 0, org.apache.xmlbeans.impl.values.XmlObjectBase.KIND_SETTERHELPER_SINGLETON);
    }
    
    /**
     * Appends and returns a new empty "PrimaryTreatmentGroupAAndE" element
     */
    public uk.nhs.nhsia.datastandards.ecds.ClinicalTreatmentGroupAAndEType.PrimaryTreatmentGroupAAndE addNewPrimaryTreatmentGroupAAndE()
    {
        synchronized (monitor())
        {
            check_orphaned();
            uk.nhs.nhsia.datastandards.ecds.ClinicalTreatmentGroupAAndEType.PrimaryTreatmentGroupAAndE target = null;
            target = (uk.nhs.nhsia.datastandards.ecds.ClinicalTreatmentGroupAAndEType.PrimaryTreatmentGroupAAndE)get_store().add_element_user(PRIMARYTREATMENTGROUPAANDE$2);
            return target;
        }
    }
    
    /**
     * Gets array of all "SecondaryTreatmentGroupAAndE" elements
     */
    public uk.nhs.nhsia.datastandards.ecds.ClinicalTreatmentGroupAAndEType.SecondaryTreatmentGroupAAndE[] getSecondaryTreatmentGroupAAndEArray()
    {
        synchronized (monitor())
        {
            check_orphaned();
            java.util.List targetList = new java.util.ArrayList();
            get_store().find_all_element_users(SECONDARYTREATMENTGROUPAANDE$4, targetList);
            uk.nhs.nhsia.datastandards.ecds.ClinicalTreatmentGroupAAndEType.SecondaryTreatmentGroupAAndE[] result = new uk.nhs.nhsia.datastandards.ecds.ClinicalTreatmentGroupAAndEType.SecondaryTreatmentGroupAAndE[targetList.size()];
            targetList.toArray(result);
            return result;
        }
    }
    
    /**
     * Gets ith "SecondaryTreatmentGroupAAndE" element
     */
    public uk.nhs.nhsia.datastandards.ecds.ClinicalTreatmentGroupAAndEType.SecondaryTreatmentGroupAAndE getSecondaryTreatmentGroupAAndEArray(int i)
    {
        synchronized (monitor())
        {
            check_orphaned();
            uk.nhs.nhsia.datastandards.ecds.ClinicalTreatmentGroupAAndEType.SecondaryTreatmentGroupAAndE target = null;
            target = (uk.nhs.nhsia.datastandards.ecds.ClinicalTreatmentGroupAAndEType.SecondaryTreatmentGroupAAndE)get_store().find_element_user(SECONDARYTREATMENTGROUPAANDE$4, i);
            if (target == null)
            {
                throw new IndexOutOfBoundsException();
            }
            return target;
        }
    }
    
    /**
     * Returns number of "SecondaryTreatmentGroupAAndE" element
     */
    public int sizeOfSecondaryTreatmentGroupAAndEArray()
    {
        synchronized (monitor())
        {
            check_orphaned();
            return get_store().count_elements(SECONDARYTREATMENTGROUPAANDE$4);
        }
    }
    
    /**
     * Sets array of all "SecondaryTreatmentGroupAAndE" element  WARNING: This method is not atomicaly synchronized.
     */
    public void setSecondaryTreatmentGroupAAndEArray(uk.nhs.nhsia.datastandards.ecds.ClinicalTreatmentGroupAAndEType.SecondaryTreatmentGroupAAndE[] secondaryTreatmentGroupAAndEArray)
    {
        check_orphaned();
        arraySetterHelper(secondaryTreatmentGroupAAndEArray, SECONDARYTREATMENTGROUPAANDE$4);
    }
    
    /**
     * Sets ith "SecondaryTreatmentGroupAAndE" element
     */
    public void setSecondaryTreatmentGroupAAndEArray(int i, uk.nhs.nhsia.datastandards.ecds.ClinicalTreatmentGroupAAndEType.SecondaryTreatmentGroupAAndE secondaryTreatmentGroupAAndE)
    {
        generatedSetterHelperImpl(secondaryTreatmentGroupAAndE, SECONDARYTREATMENTGROUPAANDE$4, i, org.apache.xmlbeans.impl.values.XmlObjectBase.KIND_SETTERHELPER_ARRAYITEM);
    }
    
    /**
     * Inserts and returns a new empty value (as xml) as the ith "SecondaryTreatmentGroupAAndE" element
     */
    public uk.nhs.nhsia.datastandards.ecds.ClinicalTreatmentGroupAAndEType.SecondaryTreatmentGroupAAndE insertNewSecondaryTreatmentGroupAAndE(int i)
    {
        synchronized (monitor())
        {
            check_orphaned();
            uk.nhs.nhsia.datastandards.ecds.ClinicalTreatmentGroupAAndEType.SecondaryTreatmentGroupAAndE target = null;
            target = (uk.nhs.nhsia.datastandards.ecds.ClinicalTreatmentGroupAAndEType.SecondaryTreatmentGroupAAndE)get_store().insert_element_user(SECONDARYTREATMENTGROUPAANDE$4, i);
            return target;
        }
    }
    
    /**
     * Appends and returns a new empty value (as xml) as the last "SecondaryTreatmentGroupAAndE" element
     */
    public uk.nhs.nhsia.datastandards.ecds.ClinicalTreatmentGroupAAndEType.SecondaryTreatmentGroupAAndE addNewSecondaryTreatmentGroupAAndE()
    {
        synchronized (monitor())
        {
            check_orphaned();
            uk.nhs.nhsia.datastandards.ecds.ClinicalTreatmentGroupAAndEType.SecondaryTreatmentGroupAAndE target = null;
            target = (uk.nhs.nhsia.datastandards.ecds.ClinicalTreatmentGroupAAndEType.SecondaryTreatmentGroupAAndE)get_store().add_element_user(SECONDARYTREATMENTGROUPAANDE$4);
            return target;
        }
    }
    
    /**
     * Removes the ith "SecondaryTreatmentGroupAAndE" element
     */
    public void removeSecondaryTreatmentGroupAAndE(int i)
    {
        synchronized (monitor())
        {
            check_orphaned();
            get_store().remove_element(SECONDARYTREATMENTGROUPAANDE$4, i);
        }
    }
    /**
     * An XML PrimaryTreatmentGroupAAndE(@http://www.nhsia.nhs.uk/DataStandards/XMLschema/CDS/ns).
     *
     * This is a complex type.
     */
    public static class PrimaryTreatmentGroupAAndEImpl extends org.apache.xmlbeans.impl.values.XmlComplexContentImpl implements uk.nhs.nhsia.datastandards.ecds.ClinicalTreatmentGroupAAndEType.PrimaryTreatmentGroupAAndE
    {
        private static final long serialVersionUID = 1L;
        
        public PrimaryTreatmentGroupAAndEImpl(org.apache.xmlbeans.SchemaType sType)
        {
            super(sType);
        }
        
        private static final javax.xml.namespace.QName PRIMARYTREATMENTAANDE$0 = 
            new javax.xml.namespace.QName("http://www.nhsia.nhs.uk/DataStandards/XMLschema/CDS/ns", "PrimaryTreatment_AAndE");
        private static final javax.xml.namespace.QName PROCEDUREDATE$2 = 
            new javax.xml.namespace.QName("http://www.nhsia.nhs.uk/DataStandards/XMLschema/CDS/ns", "ProcedureDate");
        
        
        /**
         * Gets the "PrimaryTreatment_AAndE" element
         */
        public java.lang.String getPrimaryTreatmentAAndE()
        {
            synchronized (monitor())
            {
                check_orphaned();
                org.apache.xmlbeans.SimpleValue target = null;
                target = (org.apache.xmlbeans.SimpleValue)get_store().find_element_user(PRIMARYTREATMENTAANDE$0, 0);
                if (target == null)
                {
                    return null;
                }
                return target.getStringValue();
            }
        }
        
        /**
         * Gets (as xml) the "PrimaryTreatment_AAndE" element
         */
        public uk.nhs.nhsia.datastandards.ecds.AAndETreatmentType xgetPrimaryTreatmentAAndE()
        {
            synchronized (monitor())
            {
                check_orphaned();
                uk.nhs.nhsia.datastandards.ecds.AAndETreatmentType target = null;
                target = (uk.nhs.nhsia.datastandards.ecds.AAndETreatmentType)get_store().find_element_user(PRIMARYTREATMENTAANDE$0, 0);
                return target;
            }
        }
        
        /**
         * Sets the "PrimaryTreatment_AAndE" element
         */
        public void setPrimaryTreatmentAAndE(java.lang.String primaryTreatmentAAndE)
        {
            synchronized (monitor())
            {
                check_orphaned();
                org.apache.xmlbeans.SimpleValue target = null;
                target = (org.apache.xmlbeans.SimpleValue)get_store().find_element_user(PRIMARYTREATMENTAANDE$0, 0);
                if (target == null)
                {
                    target = (org.apache.xmlbeans.SimpleValue)get_store().add_element_user(PRIMARYTREATMENTAANDE$0);
                }
                target.setStringValue(primaryTreatmentAAndE);
            }
        }
        
        /**
         * Sets (as xml) the "PrimaryTreatment_AAndE" element
         */
        public void xsetPrimaryTreatmentAAndE(uk.nhs.nhsia.datastandards.ecds.AAndETreatmentType primaryTreatmentAAndE)
        {
            synchronized (monitor())
            {
                check_orphaned();
                uk.nhs.nhsia.datastandards.ecds.AAndETreatmentType target = null;
                target = (uk.nhs.nhsia.datastandards.ecds.AAndETreatmentType)get_store().find_element_user(PRIMARYTREATMENTAANDE$0, 0);
                if (target == null)
                {
                    target = (uk.nhs.nhsia.datastandards.ecds.AAndETreatmentType)get_store().add_element_user(PRIMARYTREATMENTAANDE$0);
                }
                target.set(primaryTreatmentAAndE);
            }
        }
        
        /**
         * Gets the "ProcedureDate" element
         */
        public java.util.Calendar getProcedureDate()
        {
            synchronized (monitor())
            {
                check_orphaned();
                org.apache.xmlbeans.SimpleValue target = null;
                target = (org.apache.xmlbeans.SimpleValue)get_store().find_element_user(PROCEDUREDATE$2, 0);
                if (target == null)
                {
                    return null;
                }
                return target.getCalendarValue();
            }
        }
        
        /**
         * Gets (as xml) the "ProcedureDate" element
         */
        public uk.nhs.nhsia.datastandards.ecds.ProcedureDateType xgetProcedureDate()
        {
            synchronized (monitor())
            {
                check_orphaned();
                uk.nhs.nhsia.datastandards.ecds.ProcedureDateType target = null;
                target = (uk.nhs.nhsia.datastandards.ecds.ProcedureDateType)get_store().find_element_user(PROCEDUREDATE$2, 0);
                return target;
            }
        }
        
        /**
         * True if has "ProcedureDate" element
         */
        public boolean isSetProcedureDate()
        {
            synchronized (monitor())
            {
                check_orphaned();
                return get_store().count_elements(PROCEDUREDATE$2) != 0;
            }
        }
        
        /**
         * Sets the "ProcedureDate" element
         */
        public void setProcedureDate(java.util.Calendar procedureDate)
        {
            synchronized (monitor())
            {
                check_orphaned();
                org.apache.xmlbeans.SimpleValue target = null;
                target = (org.apache.xmlbeans.SimpleValue)get_store().find_element_user(PROCEDUREDATE$2, 0);
                if (target == null)
                {
                    target = (org.apache.xmlbeans.SimpleValue)get_store().add_element_user(PROCEDUREDATE$2);
                }
                target.setCalendarValue(procedureDate);
            }
        }
        
        /**
         * Sets (as xml) the "ProcedureDate" element
         */
        public void xsetProcedureDate(uk.nhs.nhsia.datastandards.ecds.ProcedureDateType procedureDate)
        {
            synchronized (monitor())
            {
                check_orphaned();
                uk.nhs.nhsia.datastandards.ecds.ProcedureDateType target = null;
                target = (uk.nhs.nhsia.datastandards.ecds.ProcedureDateType)get_store().find_element_user(PROCEDUREDATE$2, 0);
                if (target == null)
                {
                    target = (uk.nhs.nhsia.datastandards.ecds.ProcedureDateType)get_store().add_element_user(PROCEDUREDATE$2);
                }
                target.set(procedureDate);
            }
        }
        
        /**
         * Unsets the "ProcedureDate" element
         */
        public void unsetProcedureDate()
        {
            synchronized (monitor())
            {
                check_orphaned();
                get_store().remove_element(PROCEDUREDATE$2, 0);
            }
        }
    }
    /**
     * An XML SecondaryTreatmentGroupAAndE(@http://www.nhsia.nhs.uk/DataStandards/XMLschema/CDS/ns).
     *
     * This is a complex type.
     */
    public static class SecondaryTreatmentGroupAAndEImpl extends org.apache.xmlbeans.impl.values.XmlComplexContentImpl implements uk.nhs.nhsia.datastandards.ecds.ClinicalTreatmentGroupAAndEType.SecondaryTreatmentGroupAAndE
    {
        private static final long serialVersionUID = 1L;
        
        public SecondaryTreatmentGroupAAndEImpl(org.apache.xmlbeans.SchemaType sType)
        {
            super(sType);
        }
        
        private static final javax.xml.namespace.QName SECONDARYTREATMENTAANDE$0 = 
            new javax.xml.namespace.QName("http://www.nhsia.nhs.uk/DataStandards/XMLschema/CDS/ns", "SecondaryTreatment_AAndE");
        private static final javax.xml.namespace.QName PROCEDUREDATE$2 = 
            new javax.xml.namespace.QName("http://www.nhsia.nhs.uk/DataStandards/XMLschema/CDS/ns", "ProcedureDate");
        
        
        /**
         * Gets the "SecondaryTreatment_AAndE" element
         */
        public java.lang.String getSecondaryTreatmentAAndE()
        {
            synchronized (monitor())
            {
                check_orphaned();
                org.apache.xmlbeans.SimpleValue target = null;
                target = (org.apache.xmlbeans.SimpleValue)get_store().find_element_user(SECONDARYTREATMENTAANDE$0, 0);
                if (target == null)
                {
                    return null;
                }
                return target.getStringValue();
            }
        }
        
        /**
         * Gets (as xml) the "SecondaryTreatment_AAndE" element
         */
        public uk.nhs.nhsia.datastandards.ecds.AAndETreatmentType xgetSecondaryTreatmentAAndE()
        {
            synchronized (monitor())
            {
                check_orphaned();
                uk.nhs.nhsia.datastandards.ecds.AAndETreatmentType target = null;
                target = (uk.nhs.nhsia.datastandards.ecds.AAndETreatmentType)get_store().find_element_user(SECONDARYTREATMENTAANDE$0, 0);
                return target;
            }
        }
        
        /**
         * Sets the "SecondaryTreatment_AAndE" element
         */
        public void setSecondaryTreatmentAAndE(java.lang.String secondaryTreatmentAAndE)
        {
            synchronized (monitor())
            {
                check_orphaned();
                org.apache.xmlbeans.SimpleValue target = null;
                target = (org.apache.xmlbeans.SimpleValue)get_store().find_element_user(SECONDARYTREATMENTAANDE$0, 0);
                if (target == null)
                {
                    target = (org.apache.xmlbeans.SimpleValue)get_store().add_element_user(SECONDARYTREATMENTAANDE$0);
                }
                target.setStringValue(secondaryTreatmentAAndE);
            }
        }
        
        /**
         * Sets (as xml) the "SecondaryTreatment_AAndE" element
         */
        public void xsetSecondaryTreatmentAAndE(uk.nhs.nhsia.datastandards.ecds.AAndETreatmentType secondaryTreatmentAAndE)
        {
            synchronized (monitor())
            {
                check_orphaned();
                uk.nhs.nhsia.datastandards.ecds.AAndETreatmentType target = null;
                target = (uk.nhs.nhsia.datastandards.ecds.AAndETreatmentType)get_store().find_element_user(SECONDARYTREATMENTAANDE$0, 0);
                if (target == null)
                {
                    target = (uk.nhs.nhsia.datastandards.ecds.AAndETreatmentType)get_store().add_element_user(SECONDARYTREATMENTAANDE$0);
                }
                target.set(secondaryTreatmentAAndE);
            }
        }
        
        /**
         * Gets the "ProcedureDate" element
         */
        public java.util.Calendar getProcedureDate()
        {
            synchronized (monitor())
            {
                check_orphaned();
                org.apache.xmlbeans.SimpleValue target = null;
                target = (org.apache.xmlbeans.SimpleValue)get_store().find_element_user(PROCEDUREDATE$2, 0);
                if (target == null)
                {
                    return null;
                }
                return target.getCalendarValue();
            }
        }
        
        /**
         * Gets (as xml) the "ProcedureDate" element
         */
        public uk.nhs.nhsia.datastandards.ecds.ProcedureDateType xgetProcedureDate()
        {
            synchronized (monitor())
            {
                check_orphaned();
                uk.nhs.nhsia.datastandards.ecds.ProcedureDateType target = null;
                target = (uk.nhs.nhsia.datastandards.ecds.ProcedureDateType)get_store().find_element_user(PROCEDUREDATE$2, 0);
                return target;
            }
        }
        
        /**
         * True if has "ProcedureDate" element
         */
        public boolean isSetProcedureDate()
        {
            synchronized (monitor())
            {
                check_orphaned();
                return get_store().count_elements(PROCEDUREDATE$2) != 0;
            }
        }
        
        /**
         * Sets the "ProcedureDate" element
         */
        public void setProcedureDate(java.util.Calendar procedureDate)
        {
            synchronized (monitor())
            {
                check_orphaned();
                org.apache.xmlbeans.SimpleValue target = null;
                target = (org.apache.xmlbeans.SimpleValue)get_store().find_element_user(PROCEDUREDATE$2, 0);
                if (target == null)
                {
                    target = (org.apache.xmlbeans.SimpleValue)get_store().add_element_user(PROCEDUREDATE$2);
                }
                target.setCalendarValue(procedureDate);
            }
        }
        
        /**
         * Sets (as xml) the "ProcedureDate" element
         */
        public void xsetProcedureDate(uk.nhs.nhsia.datastandards.ecds.ProcedureDateType procedureDate)
        {
            synchronized (monitor())
            {
                check_orphaned();
                uk.nhs.nhsia.datastandards.ecds.ProcedureDateType target = null;
                target = (uk.nhs.nhsia.datastandards.ecds.ProcedureDateType)get_store().find_element_user(PROCEDUREDATE$2, 0);
                if (target == null)
                {
                    target = (uk.nhs.nhsia.datastandards.ecds.ProcedureDateType)get_store().add_element_user(PROCEDUREDATE$2);
                }
                target.set(procedureDate);
            }
        }
        
        /**
         * Unsets the "ProcedureDate" element
         */
        public void unsetProcedureDate()
        {
            synchronized (monitor())
            {
                check_orphaned();
                get_store().remove_element(PROCEDUREDATE$2, 0);
            }
        }
    }
}
