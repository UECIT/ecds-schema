/*
 * XML Type:  ClinicalActivityGroupREAD_Type
 * Namespace: http://www.nhsia.nhs.uk/DataStandards/XMLschema/CDS/ns
 * Java type: uk.nhs.nhsia.datastandards.ecds.ClinicalActivityGroupREADType
 *
 * Automatically generated - do not modify.
 */
package uk.nhs.nhsia.datastandards.ecds.impl;
/**
 * An XML ClinicalActivityGroupREAD_Type(@http://www.nhsia.nhs.uk/DataStandards/XMLschema/CDS/ns).
 *
 * This is a complex type.
 */
public class ClinicalActivityGroupREADTypeImpl extends org.apache.xmlbeans.impl.values.XmlComplexContentImpl implements uk.nhs.nhsia.datastandards.ecds.ClinicalActivityGroupREADType
{
    private static final long serialVersionUID = 1L;
    
    public ClinicalActivityGroupREADTypeImpl(org.apache.xmlbeans.SchemaType sType)
    {
        super(sType);
    }
    
    private static final javax.xml.namespace.QName PROCEDURESCHEMEINUSE$0 = 
        new javax.xml.namespace.QName("http://www.nhsia.nhs.uk/DataStandards/XMLschema/CDS/ns", "ProcedureSchemeInUse");
    private static final javax.xml.namespace.QName PRIMARYPROCEDUREGROUPREAD$2 = 
        new javax.xml.namespace.QName("http://www.nhsia.nhs.uk/DataStandards/XMLschema/CDS/ns", "PrimaryProcedureGroupREAD");
    private static final javax.xml.namespace.QName SECONDARYPROCEDUREGROUPREAD$4 = 
        new javax.xml.namespace.QName("http://www.nhsia.nhs.uk/DataStandards/XMLschema/CDS/ns", "SecondaryProcedureGroupREAD");
    
    
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
     * Gets the "PrimaryProcedureGroupREAD" element
     */
    public uk.nhs.nhsia.datastandards.ecds.ClinicalActivityGroupREADType.PrimaryProcedureGroupREAD getPrimaryProcedureGroupREAD()
    {
        synchronized (monitor())
        {
            check_orphaned();
            uk.nhs.nhsia.datastandards.ecds.ClinicalActivityGroupREADType.PrimaryProcedureGroupREAD target = null;
            target = (uk.nhs.nhsia.datastandards.ecds.ClinicalActivityGroupREADType.PrimaryProcedureGroupREAD)get_store().find_element_user(PRIMARYPROCEDUREGROUPREAD$2, 0);
            if (target == null)
            {
                return null;
            }
            return target;
        }
    }
    
    /**
     * Sets the "PrimaryProcedureGroupREAD" element
     */
    public void setPrimaryProcedureGroupREAD(uk.nhs.nhsia.datastandards.ecds.ClinicalActivityGroupREADType.PrimaryProcedureGroupREAD primaryProcedureGroupREAD)
    {
        generatedSetterHelperImpl(primaryProcedureGroupREAD, PRIMARYPROCEDUREGROUPREAD$2, 0, org.apache.xmlbeans.impl.values.XmlObjectBase.KIND_SETTERHELPER_SINGLETON);
    }
    
    /**
     * Appends and returns a new empty "PrimaryProcedureGroupREAD" element
     */
    public uk.nhs.nhsia.datastandards.ecds.ClinicalActivityGroupREADType.PrimaryProcedureGroupREAD addNewPrimaryProcedureGroupREAD()
    {
        synchronized (monitor())
        {
            check_orphaned();
            uk.nhs.nhsia.datastandards.ecds.ClinicalActivityGroupREADType.PrimaryProcedureGroupREAD target = null;
            target = (uk.nhs.nhsia.datastandards.ecds.ClinicalActivityGroupREADType.PrimaryProcedureGroupREAD)get_store().add_element_user(PRIMARYPROCEDUREGROUPREAD$2);
            return target;
        }
    }
    
    /**
     * Gets array of all "SecondaryProcedureGroupREAD" elements
     */
    public uk.nhs.nhsia.datastandards.ecds.ClinicalActivityGroupREADType.SecondaryProcedureGroupREAD[] getSecondaryProcedureGroupREADArray()
    {
        synchronized (monitor())
        {
            check_orphaned();
            java.util.List targetList = new java.util.ArrayList();
            get_store().find_all_element_users(SECONDARYPROCEDUREGROUPREAD$4, targetList);
            uk.nhs.nhsia.datastandards.ecds.ClinicalActivityGroupREADType.SecondaryProcedureGroupREAD[] result = new uk.nhs.nhsia.datastandards.ecds.ClinicalActivityGroupREADType.SecondaryProcedureGroupREAD[targetList.size()];
            targetList.toArray(result);
            return result;
        }
    }
    
    /**
     * Gets ith "SecondaryProcedureGroupREAD" element
     */
    public uk.nhs.nhsia.datastandards.ecds.ClinicalActivityGroupREADType.SecondaryProcedureGroupREAD getSecondaryProcedureGroupREADArray(int i)
    {
        synchronized (monitor())
        {
            check_orphaned();
            uk.nhs.nhsia.datastandards.ecds.ClinicalActivityGroupREADType.SecondaryProcedureGroupREAD target = null;
            target = (uk.nhs.nhsia.datastandards.ecds.ClinicalActivityGroupREADType.SecondaryProcedureGroupREAD)get_store().find_element_user(SECONDARYPROCEDUREGROUPREAD$4, i);
            if (target == null)
            {
                throw new IndexOutOfBoundsException();
            }
            return target;
        }
    }
    
    /**
     * Returns number of "SecondaryProcedureGroupREAD" element
     */
    public int sizeOfSecondaryProcedureGroupREADArray()
    {
        synchronized (monitor())
        {
            check_orphaned();
            return get_store().count_elements(SECONDARYPROCEDUREGROUPREAD$4);
        }
    }
    
    /**
     * Sets array of all "SecondaryProcedureGroupREAD" element  WARNING: This method is not atomicaly synchronized.
     */
    public void setSecondaryProcedureGroupREADArray(uk.nhs.nhsia.datastandards.ecds.ClinicalActivityGroupREADType.SecondaryProcedureGroupREAD[] secondaryProcedureGroupREADArray)
    {
        check_orphaned();
        arraySetterHelper(secondaryProcedureGroupREADArray, SECONDARYPROCEDUREGROUPREAD$4);
    }
    
    /**
     * Sets ith "SecondaryProcedureGroupREAD" element
     */
    public void setSecondaryProcedureGroupREADArray(int i, uk.nhs.nhsia.datastandards.ecds.ClinicalActivityGroupREADType.SecondaryProcedureGroupREAD secondaryProcedureGroupREAD)
    {
        generatedSetterHelperImpl(secondaryProcedureGroupREAD, SECONDARYPROCEDUREGROUPREAD$4, i, org.apache.xmlbeans.impl.values.XmlObjectBase.KIND_SETTERHELPER_ARRAYITEM);
    }
    
    /**
     * Inserts and returns a new empty value (as xml) as the ith "SecondaryProcedureGroupREAD" element
     */
    public uk.nhs.nhsia.datastandards.ecds.ClinicalActivityGroupREADType.SecondaryProcedureGroupREAD insertNewSecondaryProcedureGroupREAD(int i)
    {
        synchronized (monitor())
        {
            check_orphaned();
            uk.nhs.nhsia.datastandards.ecds.ClinicalActivityGroupREADType.SecondaryProcedureGroupREAD target = null;
            target = (uk.nhs.nhsia.datastandards.ecds.ClinicalActivityGroupREADType.SecondaryProcedureGroupREAD)get_store().insert_element_user(SECONDARYPROCEDUREGROUPREAD$4, i);
            return target;
        }
    }
    
    /**
     * Appends and returns a new empty value (as xml) as the last "SecondaryProcedureGroupREAD" element
     */
    public uk.nhs.nhsia.datastandards.ecds.ClinicalActivityGroupREADType.SecondaryProcedureGroupREAD addNewSecondaryProcedureGroupREAD()
    {
        synchronized (monitor())
        {
            check_orphaned();
            uk.nhs.nhsia.datastandards.ecds.ClinicalActivityGroupREADType.SecondaryProcedureGroupREAD target = null;
            target = (uk.nhs.nhsia.datastandards.ecds.ClinicalActivityGroupREADType.SecondaryProcedureGroupREAD)get_store().add_element_user(SECONDARYPROCEDUREGROUPREAD$4);
            return target;
        }
    }
    
    /**
     * Removes the ith "SecondaryProcedureGroupREAD" element
     */
    public void removeSecondaryProcedureGroupREAD(int i)
    {
        synchronized (monitor())
        {
            check_orphaned();
            get_store().remove_element(SECONDARYPROCEDUREGROUPREAD$4, i);
        }
    }
    /**
     * An XML PrimaryProcedureGroupREAD(@http://www.nhsia.nhs.uk/DataStandards/XMLschema/CDS/ns).
     *
     * This is a complex type.
     */
    public static class PrimaryProcedureGroupREADImpl extends org.apache.xmlbeans.impl.values.XmlComplexContentImpl implements uk.nhs.nhsia.datastandards.ecds.ClinicalActivityGroupREADType.PrimaryProcedureGroupREAD
    {
        private static final long serialVersionUID = 1L;
        
        public PrimaryProcedureGroupREADImpl(org.apache.xmlbeans.SchemaType sType)
        {
            super(sType);
        }
        
        private static final javax.xml.namespace.QName PRIMARYPROCEDUREREAD$0 = 
            new javax.xml.namespace.QName("http://www.nhsia.nhs.uk/DataStandards/XMLschema/CDS/ns", "PrimaryProcedure_READ");
        private static final javax.xml.namespace.QName PROCEDUREDATE$2 = 
            new javax.xml.namespace.QName("http://www.nhsia.nhs.uk/DataStandards/XMLschema/CDS/ns", "ProcedureDate");
        
        
        /**
         * Gets the "PrimaryProcedure_READ" element
         */
        public java.lang.String getPrimaryProcedureREAD()
        {
            synchronized (monitor())
            {
                check_orphaned();
                org.apache.xmlbeans.SimpleValue target = null;
                target = (org.apache.xmlbeans.SimpleValue)get_store().find_element_user(PRIMARYPROCEDUREREAD$0, 0);
                if (target == null)
                {
                    return null;
                }
                return target.getStringValue();
            }
        }
        
        /**
         * Gets (as xml) the "PrimaryProcedure_READ" element
         */
        public uk.nhs.nhsia.datastandards.ecds.PrimaryProcedureREADType xgetPrimaryProcedureREAD()
        {
            synchronized (monitor())
            {
                check_orphaned();
                uk.nhs.nhsia.datastandards.ecds.PrimaryProcedureREADType target = null;
                target = (uk.nhs.nhsia.datastandards.ecds.PrimaryProcedureREADType)get_store().find_element_user(PRIMARYPROCEDUREREAD$0, 0);
                return target;
            }
        }
        
        /**
         * Sets the "PrimaryProcedure_READ" element
         */
        public void setPrimaryProcedureREAD(java.lang.String primaryProcedureREAD)
        {
            synchronized (monitor())
            {
                check_orphaned();
                org.apache.xmlbeans.SimpleValue target = null;
                target = (org.apache.xmlbeans.SimpleValue)get_store().find_element_user(PRIMARYPROCEDUREREAD$0, 0);
                if (target == null)
                {
                    target = (org.apache.xmlbeans.SimpleValue)get_store().add_element_user(PRIMARYPROCEDUREREAD$0);
                }
                target.setStringValue(primaryProcedureREAD);
            }
        }
        
        /**
         * Sets (as xml) the "PrimaryProcedure_READ" element
         */
        public void xsetPrimaryProcedureREAD(uk.nhs.nhsia.datastandards.ecds.PrimaryProcedureREADType primaryProcedureREAD)
        {
            synchronized (monitor())
            {
                check_orphaned();
                uk.nhs.nhsia.datastandards.ecds.PrimaryProcedureREADType target = null;
                target = (uk.nhs.nhsia.datastandards.ecds.PrimaryProcedureREADType)get_store().find_element_user(PRIMARYPROCEDUREREAD$0, 0);
                if (target == null)
                {
                    target = (uk.nhs.nhsia.datastandards.ecds.PrimaryProcedureREADType)get_store().add_element_user(PRIMARYPROCEDUREREAD$0);
                }
                target.set(primaryProcedureREAD);
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
     * An XML SecondaryProcedureGroupREAD(@http://www.nhsia.nhs.uk/DataStandards/XMLschema/CDS/ns).
     *
     * This is a complex type.
     */
    public static class SecondaryProcedureGroupREADImpl extends org.apache.xmlbeans.impl.values.XmlComplexContentImpl implements uk.nhs.nhsia.datastandards.ecds.ClinicalActivityGroupREADType.SecondaryProcedureGroupREAD
    {
        private static final long serialVersionUID = 1L;
        
        public SecondaryProcedureGroupREADImpl(org.apache.xmlbeans.SchemaType sType)
        {
            super(sType);
        }
        
        private static final javax.xml.namespace.QName SECONDARYPROCEDUREREAD$0 = 
            new javax.xml.namespace.QName("http://www.nhsia.nhs.uk/DataStandards/XMLschema/CDS/ns", "SecondaryProcedure_READ");
        private static final javax.xml.namespace.QName PROCEDUREDATE$2 = 
            new javax.xml.namespace.QName("http://www.nhsia.nhs.uk/DataStandards/XMLschema/CDS/ns", "ProcedureDate");
        
        
        /**
         * Gets the "SecondaryProcedure_READ" element
         */
        public java.lang.String getSecondaryProcedureREAD()
        {
            synchronized (monitor())
            {
                check_orphaned();
                org.apache.xmlbeans.SimpleValue target = null;
                target = (org.apache.xmlbeans.SimpleValue)get_store().find_element_user(SECONDARYPROCEDUREREAD$0, 0);
                if (target == null)
                {
                    return null;
                }
                return target.getStringValue();
            }
        }
        
        /**
         * Gets (as xml) the "SecondaryProcedure_READ" element
         */
        public uk.nhs.nhsia.datastandards.ecds.ProcedureREADType xgetSecondaryProcedureREAD()
        {
            synchronized (monitor())
            {
                check_orphaned();
                uk.nhs.nhsia.datastandards.ecds.ProcedureREADType target = null;
                target = (uk.nhs.nhsia.datastandards.ecds.ProcedureREADType)get_store().find_element_user(SECONDARYPROCEDUREREAD$0, 0);
                return target;
            }
        }
        
        /**
         * Sets the "SecondaryProcedure_READ" element
         */
        public void setSecondaryProcedureREAD(java.lang.String secondaryProcedureREAD)
        {
            synchronized (monitor())
            {
                check_orphaned();
                org.apache.xmlbeans.SimpleValue target = null;
                target = (org.apache.xmlbeans.SimpleValue)get_store().find_element_user(SECONDARYPROCEDUREREAD$0, 0);
                if (target == null)
                {
                    target = (org.apache.xmlbeans.SimpleValue)get_store().add_element_user(SECONDARYPROCEDUREREAD$0);
                }
                target.setStringValue(secondaryProcedureREAD);
            }
        }
        
        /**
         * Sets (as xml) the "SecondaryProcedure_READ" element
         */
        public void xsetSecondaryProcedureREAD(uk.nhs.nhsia.datastandards.ecds.ProcedureREADType secondaryProcedureREAD)
        {
            synchronized (monitor())
            {
                check_orphaned();
                uk.nhs.nhsia.datastandards.ecds.ProcedureREADType target = null;
                target = (uk.nhs.nhsia.datastandards.ecds.ProcedureREADType)get_store().find_element_user(SECONDARYPROCEDUREREAD$0, 0);
                if (target == null)
                {
                    target = (uk.nhs.nhsia.datastandards.ecds.ProcedureREADType)get_store().add_element_user(SECONDARYPROCEDUREREAD$0);
                }
                target.set(secondaryProcedureREAD);
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
