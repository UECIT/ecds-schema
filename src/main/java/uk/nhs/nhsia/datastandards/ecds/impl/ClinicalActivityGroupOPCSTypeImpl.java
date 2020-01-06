/*
 * XML Type:  ClinicalActivityGroupOPCS_Type
 * Namespace: http://www.nhsia.nhs.uk/DataStandards/XMLschema/CDS/ns
 * Java type: uk.nhs.nhsia.datastandards.ecds.ClinicalActivityGroupOPCSType
 *
 * Automatically generated - do not modify.
 */
package uk.nhs.nhsia.datastandards.ecds.impl;
/**
 * An XML ClinicalActivityGroupOPCS_Type(@http://www.nhsia.nhs.uk/DataStandards/XMLschema/CDS/ns).
 *
 * This is a complex type.
 */
public class ClinicalActivityGroupOPCSTypeImpl extends org.apache.xmlbeans.impl.values.XmlComplexContentImpl implements uk.nhs.nhsia.datastandards.ecds.ClinicalActivityGroupOPCSType
{
    private static final long serialVersionUID = 1L;
    
    public ClinicalActivityGroupOPCSTypeImpl(org.apache.xmlbeans.SchemaType sType)
    {
        super(sType);
    }
    
    private static final javax.xml.namespace.QName PROCEDURESCHEMEINUSE$0 = 
        new javax.xml.namespace.QName("http://www.nhsia.nhs.uk/DataStandards/XMLschema/CDS/ns", "ProcedureSchemeInUse");
    private static final javax.xml.namespace.QName PRIMARYPROCEDUREGROUPOPCS$2 = 
        new javax.xml.namespace.QName("http://www.nhsia.nhs.uk/DataStandards/XMLschema/CDS/ns", "PrimaryProcedureGroupOPCS");
    private static final javax.xml.namespace.QName SECONDARYPROCEDUREGROUPOPCS$4 = 
        new javax.xml.namespace.QName("http://www.nhsia.nhs.uk/DataStandards/XMLschema/CDS/ns", "SecondaryProcedureGroupOPCS");
    
    
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
     * Gets the "PrimaryProcedureGroupOPCS" element
     */
    public uk.nhs.nhsia.datastandards.ecds.ClinicalActivityGroupOPCSType.PrimaryProcedureGroupOPCS getPrimaryProcedureGroupOPCS()
    {
        synchronized (monitor())
        {
            check_orphaned();
            uk.nhs.nhsia.datastandards.ecds.ClinicalActivityGroupOPCSType.PrimaryProcedureGroupOPCS target = null;
            target = (uk.nhs.nhsia.datastandards.ecds.ClinicalActivityGroupOPCSType.PrimaryProcedureGroupOPCS)get_store().find_element_user(PRIMARYPROCEDUREGROUPOPCS$2, 0);
            if (target == null)
            {
                return null;
            }
            return target;
        }
    }
    
    /**
     * Sets the "PrimaryProcedureGroupOPCS" element
     */
    public void setPrimaryProcedureGroupOPCS(uk.nhs.nhsia.datastandards.ecds.ClinicalActivityGroupOPCSType.PrimaryProcedureGroupOPCS primaryProcedureGroupOPCS)
    {
        generatedSetterHelperImpl(primaryProcedureGroupOPCS, PRIMARYPROCEDUREGROUPOPCS$2, 0, org.apache.xmlbeans.impl.values.XmlObjectBase.KIND_SETTERHELPER_SINGLETON);
    }
    
    /**
     * Appends and returns a new empty "PrimaryProcedureGroupOPCS" element
     */
    public uk.nhs.nhsia.datastandards.ecds.ClinicalActivityGroupOPCSType.PrimaryProcedureGroupOPCS addNewPrimaryProcedureGroupOPCS()
    {
        synchronized (monitor())
        {
            check_orphaned();
            uk.nhs.nhsia.datastandards.ecds.ClinicalActivityGroupOPCSType.PrimaryProcedureGroupOPCS target = null;
            target = (uk.nhs.nhsia.datastandards.ecds.ClinicalActivityGroupOPCSType.PrimaryProcedureGroupOPCS)get_store().add_element_user(PRIMARYPROCEDUREGROUPOPCS$2);
            return target;
        }
    }
    
    /**
     * Gets array of all "SecondaryProcedureGroupOPCS" elements
     */
    public uk.nhs.nhsia.datastandards.ecds.ClinicalActivityGroupOPCSType.SecondaryProcedureGroupOPCS[] getSecondaryProcedureGroupOPCSArray()
    {
        synchronized (monitor())
        {
            check_orphaned();
            java.util.List targetList = new java.util.ArrayList();
            get_store().find_all_element_users(SECONDARYPROCEDUREGROUPOPCS$4, targetList);
            uk.nhs.nhsia.datastandards.ecds.ClinicalActivityGroupOPCSType.SecondaryProcedureGroupOPCS[] result = new uk.nhs.nhsia.datastandards.ecds.ClinicalActivityGroupOPCSType.SecondaryProcedureGroupOPCS[targetList.size()];
            targetList.toArray(result);
            return result;
        }
    }
    
    /**
     * Gets ith "SecondaryProcedureGroupOPCS" element
     */
    public uk.nhs.nhsia.datastandards.ecds.ClinicalActivityGroupOPCSType.SecondaryProcedureGroupOPCS getSecondaryProcedureGroupOPCSArray(int i)
    {
        synchronized (monitor())
        {
            check_orphaned();
            uk.nhs.nhsia.datastandards.ecds.ClinicalActivityGroupOPCSType.SecondaryProcedureGroupOPCS target = null;
            target = (uk.nhs.nhsia.datastandards.ecds.ClinicalActivityGroupOPCSType.SecondaryProcedureGroupOPCS)get_store().find_element_user(SECONDARYPROCEDUREGROUPOPCS$4, i);
            if (target == null)
            {
                throw new IndexOutOfBoundsException();
            }
            return target;
        }
    }
    
    /**
     * Returns number of "SecondaryProcedureGroupOPCS" element
     */
    public int sizeOfSecondaryProcedureGroupOPCSArray()
    {
        synchronized (monitor())
        {
            check_orphaned();
            return get_store().count_elements(SECONDARYPROCEDUREGROUPOPCS$4);
        }
    }
    
    /**
     * Sets array of all "SecondaryProcedureGroupOPCS" element  WARNING: This method is not atomicaly synchronized.
     */
    public void setSecondaryProcedureGroupOPCSArray(uk.nhs.nhsia.datastandards.ecds.ClinicalActivityGroupOPCSType.SecondaryProcedureGroupOPCS[] secondaryProcedureGroupOPCSArray)
    {
        check_orphaned();
        arraySetterHelper(secondaryProcedureGroupOPCSArray, SECONDARYPROCEDUREGROUPOPCS$4);
    }
    
    /**
     * Sets ith "SecondaryProcedureGroupOPCS" element
     */
    public void setSecondaryProcedureGroupOPCSArray(int i, uk.nhs.nhsia.datastandards.ecds.ClinicalActivityGroupOPCSType.SecondaryProcedureGroupOPCS secondaryProcedureGroupOPCS)
    {
        generatedSetterHelperImpl(secondaryProcedureGroupOPCS, SECONDARYPROCEDUREGROUPOPCS$4, i, org.apache.xmlbeans.impl.values.XmlObjectBase.KIND_SETTERHELPER_ARRAYITEM);
    }
    
    /**
     * Inserts and returns a new empty value (as xml) as the ith "SecondaryProcedureGroupOPCS" element
     */
    public uk.nhs.nhsia.datastandards.ecds.ClinicalActivityGroupOPCSType.SecondaryProcedureGroupOPCS insertNewSecondaryProcedureGroupOPCS(int i)
    {
        synchronized (monitor())
        {
            check_orphaned();
            uk.nhs.nhsia.datastandards.ecds.ClinicalActivityGroupOPCSType.SecondaryProcedureGroupOPCS target = null;
            target = (uk.nhs.nhsia.datastandards.ecds.ClinicalActivityGroupOPCSType.SecondaryProcedureGroupOPCS)get_store().insert_element_user(SECONDARYPROCEDUREGROUPOPCS$4, i);
            return target;
        }
    }
    
    /**
     * Appends and returns a new empty value (as xml) as the last "SecondaryProcedureGroupOPCS" element
     */
    public uk.nhs.nhsia.datastandards.ecds.ClinicalActivityGroupOPCSType.SecondaryProcedureGroupOPCS addNewSecondaryProcedureGroupOPCS()
    {
        synchronized (monitor())
        {
            check_orphaned();
            uk.nhs.nhsia.datastandards.ecds.ClinicalActivityGroupOPCSType.SecondaryProcedureGroupOPCS target = null;
            target = (uk.nhs.nhsia.datastandards.ecds.ClinicalActivityGroupOPCSType.SecondaryProcedureGroupOPCS)get_store().add_element_user(SECONDARYPROCEDUREGROUPOPCS$4);
            return target;
        }
    }
    
    /**
     * Removes the ith "SecondaryProcedureGroupOPCS" element
     */
    public void removeSecondaryProcedureGroupOPCS(int i)
    {
        synchronized (monitor())
        {
            check_orphaned();
            get_store().remove_element(SECONDARYPROCEDUREGROUPOPCS$4, i);
        }
    }
    /**
     * An XML PrimaryProcedureGroupOPCS(@http://www.nhsia.nhs.uk/DataStandards/XMLschema/CDS/ns).
     *
     * This is a complex type.
     */
    public static class PrimaryProcedureGroupOPCSImpl extends org.apache.xmlbeans.impl.values.XmlComplexContentImpl implements uk.nhs.nhsia.datastandards.ecds.ClinicalActivityGroupOPCSType.PrimaryProcedureGroupOPCS
    {
        private static final long serialVersionUID = 1L;
        
        public PrimaryProcedureGroupOPCSImpl(org.apache.xmlbeans.SchemaType sType)
        {
            super(sType);
        }
        
        private static final javax.xml.namespace.QName PRIMARYPROCEDUREOPCS$0 = 
            new javax.xml.namespace.QName("http://www.nhsia.nhs.uk/DataStandards/XMLschema/CDS/ns", "PrimaryProcedure_OPCS");
        private static final javax.xml.namespace.QName PROCEDUREDATE$2 = 
            new javax.xml.namespace.QName("http://www.nhsia.nhs.uk/DataStandards/XMLschema/CDS/ns", "ProcedureDate");
        private static final javax.xml.namespace.QName MAINOPERATINGHCP$4 = 
            new javax.xml.namespace.QName("http://www.nhsia.nhs.uk/DataStandards/XMLschema/CDS/ns", "MainOperatingHCP");
        private static final javax.xml.namespace.QName RESPONSIBLEANAESTHETIST$6 = 
            new javax.xml.namespace.QName("http://www.nhsia.nhs.uk/DataStandards/XMLschema/CDS/ns", "ResponsibleAnaesthetist");
        
        
        /**
         * Gets the "PrimaryProcedure_OPCS" element
         */
        public java.lang.String getPrimaryProcedureOPCS()
        {
            synchronized (monitor())
            {
                check_orphaned();
                org.apache.xmlbeans.SimpleValue target = null;
                target = (org.apache.xmlbeans.SimpleValue)get_store().find_element_user(PRIMARYPROCEDUREOPCS$0, 0);
                if (target == null)
                {
                    return null;
                }
                return target.getStringValue();
            }
        }
        
        /**
         * Gets (as xml) the "PrimaryProcedure_OPCS" element
         */
        public uk.nhs.nhsia.datastandards.ecds.PrimaryProcedureOPCSType xgetPrimaryProcedureOPCS()
        {
            synchronized (monitor())
            {
                check_orphaned();
                uk.nhs.nhsia.datastandards.ecds.PrimaryProcedureOPCSType target = null;
                target = (uk.nhs.nhsia.datastandards.ecds.PrimaryProcedureOPCSType)get_store().find_element_user(PRIMARYPROCEDUREOPCS$0, 0);
                return target;
            }
        }
        
        /**
         * Sets the "PrimaryProcedure_OPCS" element
         */
        public void setPrimaryProcedureOPCS(java.lang.String primaryProcedureOPCS)
        {
            synchronized (monitor())
            {
                check_orphaned();
                org.apache.xmlbeans.SimpleValue target = null;
                target = (org.apache.xmlbeans.SimpleValue)get_store().find_element_user(PRIMARYPROCEDUREOPCS$0, 0);
                if (target == null)
                {
                    target = (org.apache.xmlbeans.SimpleValue)get_store().add_element_user(PRIMARYPROCEDUREOPCS$0);
                }
                target.setStringValue(primaryProcedureOPCS);
            }
        }
        
        /**
         * Sets (as xml) the "PrimaryProcedure_OPCS" element
         */
        public void xsetPrimaryProcedureOPCS(uk.nhs.nhsia.datastandards.ecds.PrimaryProcedureOPCSType primaryProcedureOPCS)
        {
            synchronized (monitor())
            {
                check_orphaned();
                uk.nhs.nhsia.datastandards.ecds.PrimaryProcedureOPCSType target = null;
                target = (uk.nhs.nhsia.datastandards.ecds.PrimaryProcedureOPCSType)get_store().find_element_user(PRIMARYPROCEDUREOPCS$0, 0);
                if (target == null)
                {
                    target = (uk.nhs.nhsia.datastandards.ecds.PrimaryProcedureOPCSType)get_store().add_element_user(PRIMARYPROCEDUREOPCS$0);
                }
                target.set(primaryProcedureOPCS);
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
        
        /**
         * Gets the "MainOperatingHCP" element
         */
        public uk.nhs.nhsia.datastandards.ecds.ProfessionalsInvolvedStructure getMainOperatingHCP()
        {
            synchronized (monitor())
            {
                check_orphaned();
                uk.nhs.nhsia.datastandards.ecds.ProfessionalsInvolvedStructure target = null;
                target = (uk.nhs.nhsia.datastandards.ecds.ProfessionalsInvolvedStructure)get_store().find_element_user(MAINOPERATINGHCP$4, 0);
                if (target == null)
                {
                    return null;
                }
                return target;
            }
        }
        
        /**
         * True if has "MainOperatingHCP" element
         */
        public boolean isSetMainOperatingHCP()
        {
            synchronized (monitor())
            {
                check_orphaned();
                return get_store().count_elements(MAINOPERATINGHCP$4) != 0;
            }
        }
        
        /**
         * Sets the "MainOperatingHCP" element
         */
        public void setMainOperatingHCP(uk.nhs.nhsia.datastandards.ecds.ProfessionalsInvolvedStructure mainOperatingHCP)
        {
            generatedSetterHelperImpl(mainOperatingHCP, MAINOPERATINGHCP$4, 0, org.apache.xmlbeans.impl.values.XmlObjectBase.KIND_SETTERHELPER_SINGLETON);
        }
        
        /**
         * Appends and returns a new empty "MainOperatingHCP" element
         */
        public uk.nhs.nhsia.datastandards.ecds.ProfessionalsInvolvedStructure addNewMainOperatingHCP()
        {
            synchronized (monitor())
            {
                check_orphaned();
                uk.nhs.nhsia.datastandards.ecds.ProfessionalsInvolvedStructure target = null;
                target = (uk.nhs.nhsia.datastandards.ecds.ProfessionalsInvolvedStructure)get_store().add_element_user(MAINOPERATINGHCP$4);
                return target;
            }
        }
        
        /**
         * Unsets the "MainOperatingHCP" element
         */
        public void unsetMainOperatingHCP()
        {
            synchronized (monitor())
            {
                check_orphaned();
                get_store().remove_element(MAINOPERATINGHCP$4, 0);
            }
        }
        
        /**
         * Gets the "ResponsibleAnaesthetist" element
         */
        public uk.nhs.nhsia.datastandards.ecds.ProfessionalsInvolvedStructure getResponsibleAnaesthetist()
        {
            synchronized (monitor())
            {
                check_orphaned();
                uk.nhs.nhsia.datastandards.ecds.ProfessionalsInvolvedStructure target = null;
                target = (uk.nhs.nhsia.datastandards.ecds.ProfessionalsInvolvedStructure)get_store().find_element_user(RESPONSIBLEANAESTHETIST$6, 0);
                if (target == null)
                {
                    return null;
                }
                return target;
            }
        }
        
        /**
         * True if has "ResponsibleAnaesthetist" element
         */
        public boolean isSetResponsibleAnaesthetist()
        {
            synchronized (monitor())
            {
                check_orphaned();
                return get_store().count_elements(RESPONSIBLEANAESTHETIST$6) != 0;
            }
        }
        
        /**
         * Sets the "ResponsibleAnaesthetist" element
         */
        public void setResponsibleAnaesthetist(uk.nhs.nhsia.datastandards.ecds.ProfessionalsInvolvedStructure responsibleAnaesthetist)
        {
            generatedSetterHelperImpl(responsibleAnaesthetist, RESPONSIBLEANAESTHETIST$6, 0, org.apache.xmlbeans.impl.values.XmlObjectBase.KIND_SETTERHELPER_SINGLETON);
        }
        
        /**
         * Appends and returns a new empty "ResponsibleAnaesthetist" element
         */
        public uk.nhs.nhsia.datastandards.ecds.ProfessionalsInvolvedStructure addNewResponsibleAnaesthetist()
        {
            synchronized (monitor())
            {
                check_orphaned();
                uk.nhs.nhsia.datastandards.ecds.ProfessionalsInvolvedStructure target = null;
                target = (uk.nhs.nhsia.datastandards.ecds.ProfessionalsInvolvedStructure)get_store().add_element_user(RESPONSIBLEANAESTHETIST$6);
                return target;
            }
        }
        
        /**
         * Unsets the "ResponsibleAnaesthetist" element
         */
        public void unsetResponsibleAnaesthetist()
        {
            synchronized (monitor())
            {
                check_orphaned();
                get_store().remove_element(RESPONSIBLEANAESTHETIST$6, 0);
            }
        }
    }
    /**
     * An XML SecondaryProcedureGroupOPCS(@http://www.nhsia.nhs.uk/DataStandards/XMLschema/CDS/ns).
     *
     * This is a complex type.
     */
    public static class SecondaryProcedureGroupOPCSImpl extends org.apache.xmlbeans.impl.values.XmlComplexContentImpl implements uk.nhs.nhsia.datastandards.ecds.ClinicalActivityGroupOPCSType.SecondaryProcedureGroupOPCS
    {
        private static final long serialVersionUID = 1L;
        
        public SecondaryProcedureGroupOPCSImpl(org.apache.xmlbeans.SchemaType sType)
        {
            super(sType);
        }
        
        private static final javax.xml.namespace.QName SECONDARYPROCEDUREOPCS$0 = 
            new javax.xml.namespace.QName("http://www.nhsia.nhs.uk/DataStandards/XMLschema/CDS/ns", "SecondaryProcedure_OPCS");
        private static final javax.xml.namespace.QName PROCEDUREDATE$2 = 
            new javax.xml.namespace.QName("http://www.nhsia.nhs.uk/DataStandards/XMLschema/CDS/ns", "ProcedureDate");
        private static final javax.xml.namespace.QName MAINOPERATINGHCP$4 = 
            new javax.xml.namespace.QName("http://www.nhsia.nhs.uk/DataStandards/XMLschema/CDS/ns", "MainOperatingHCP");
        private static final javax.xml.namespace.QName RESPONSIBLEANAESTHETIST$6 = 
            new javax.xml.namespace.QName("http://www.nhsia.nhs.uk/DataStandards/XMLschema/CDS/ns", "ResponsibleAnaesthetist");
        
        
        /**
         * Gets the "SecondaryProcedure_OPCS" element
         */
        public java.lang.String getSecondaryProcedureOPCS()
        {
            synchronized (monitor())
            {
                check_orphaned();
                org.apache.xmlbeans.SimpleValue target = null;
                target = (org.apache.xmlbeans.SimpleValue)get_store().find_element_user(SECONDARYPROCEDUREOPCS$0, 0);
                if (target == null)
                {
                    return null;
                }
                return target.getStringValue();
            }
        }
        
        /**
         * Gets (as xml) the "SecondaryProcedure_OPCS" element
         */
        public uk.nhs.nhsia.datastandards.ecds.ProcedureOPCSType xgetSecondaryProcedureOPCS()
        {
            synchronized (monitor())
            {
                check_orphaned();
                uk.nhs.nhsia.datastandards.ecds.ProcedureOPCSType target = null;
                target = (uk.nhs.nhsia.datastandards.ecds.ProcedureOPCSType)get_store().find_element_user(SECONDARYPROCEDUREOPCS$0, 0);
                return target;
            }
        }
        
        /**
         * Sets the "SecondaryProcedure_OPCS" element
         */
        public void setSecondaryProcedureOPCS(java.lang.String secondaryProcedureOPCS)
        {
            synchronized (monitor())
            {
                check_orphaned();
                org.apache.xmlbeans.SimpleValue target = null;
                target = (org.apache.xmlbeans.SimpleValue)get_store().find_element_user(SECONDARYPROCEDUREOPCS$0, 0);
                if (target == null)
                {
                    target = (org.apache.xmlbeans.SimpleValue)get_store().add_element_user(SECONDARYPROCEDUREOPCS$0);
                }
                target.setStringValue(secondaryProcedureOPCS);
            }
        }
        
        /**
         * Sets (as xml) the "SecondaryProcedure_OPCS" element
         */
        public void xsetSecondaryProcedureOPCS(uk.nhs.nhsia.datastandards.ecds.ProcedureOPCSType secondaryProcedureOPCS)
        {
            synchronized (monitor())
            {
                check_orphaned();
                uk.nhs.nhsia.datastandards.ecds.ProcedureOPCSType target = null;
                target = (uk.nhs.nhsia.datastandards.ecds.ProcedureOPCSType)get_store().find_element_user(SECONDARYPROCEDUREOPCS$0, 0);
                if (target == null)
                {
                    target = (uk.nhs.nhsia.datastandards.ecds.ProcedureOPCSType)get_store().add_element_user(SECONDARYPROCEDUREOPCS$0);
                }
                target.set(secondaryProcedureOPCS);
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
        
        /**
         * Gets the "MainOperatingHCP" element
         */
        public uk.nhs.nhsia.datastandards.ecds.ProfessionalsInvolvedStructure getMainOperatingHCP()
        {
            synchronized (monitor())
            {
                check_orphaned();
                uk.nhs.nhsia.datastandards.ecds.ProfessionalsInvolvedStructure target = null;
                target = (uk.nhs.nhsia.datastandards.ecds.ProfessionalsInvolvedStructure)get_store().find_element_user(MAINOPERATINGHCP$4, 0);
                if (target == null)
                {
                    return null;
                }
                return target;
            }
        }
        
        /**
         * True if has "MainOperatingHCP" element
         */
        public boolean isSetMainOperatingHCP()
        {
            synchronized (monitor())
            {
                check_orphaned();
                return get_store().count_elements(MAINOPERATINGHCP$4) != 0;
            }
        }
        
        /**
         * Sets the "MainOperatingHCP" element
         */
        public void setMainOperatingHCP(uk.nhs.nhsia.datastandards.ecds.ProfessionalsInvolvedStructure mainOperatingHCP)
        {
            generatedSetterHelperImpl(mainOperatingHCP, MAINOPERATINGHCP$4, 0, org.apache.xmlbeans.impl.values.XmlObjectBase.KIND_SETTERHELPER_SINGLETON);
        }
        
        /**
         * Appends and returns a new empty "MainOperatingHCP" element
         */
        public uk.nhs.nhsia.datastandards.ecds.ProfessionalsInvolvedStructure addNewMainOperatingHCP()
        {
            synchronized (monitor())
            {
                check_orphaned();
                uk.nhs.nhsia.datastandards.ecds.ProfessionalsInvolvedStructure target = null;
                target = (uk.nhs.nhsia.datastandards.ecds.ProfessionalsInvolvedStructure)get_store().add_element_user(MAINOPERATINGHCP$4);
                return target;
            }
        }
        
        /**
         * Unsets the "MainOperatingHCP" element
         */
        public void unsetMainOperatingHCP()
        {
            synchronized (monitor())
            {
                check_orphaned();
                get_store().remove_element(MAINOPERATINGHCP$4, 0);
            }
        }
        
        /**
         * Gets the "ResponsibleAnaesthetist" element
         */
        public uk.nhs.nhsia.datastandards.ecds.ProfessionalsInvolvedStructure getResponsibleAnaesthetist()
        {
            synchronized (monitor())
            {
                check_orphaned();
                uk.nhs.nhsia.datastandards.ecds.ProfessionalsInvolvedStructure target = null;
                target = (uk.nhs.nhsia.datastandards.ecds.ProfessionalsInvolvedStructure)get_store().find_element_user(RESPONSIBLEANAESTHETIST$6, 0);
                if (target == null)
                {
                    return null;
                }
                return target;
            }
        }
        
        /**
         * True if has "ResponsibleAnaesthetist" element
         */
        public boolean isSetResponsibleAnaesthetist()
        {
            synchronized (monitor())
            {
                check_orphaned();
                return get_store().count_elements(RESPONSIBLEANAESTHETIST$6) != 0;
            }
        }
        
        /**
         * Sets the "ResponsibleAnaesthetist" element
         */
        public void setResponsibleAnaesthetist(uk.nhs.nhsia.datastandards.ecds.ProfessionalsInvolvedStructure responsibleAnaesthetist)
        {
            generatedSetterHelperImpl(responsibleAnaesthetist, RESPONSIBLEANAESTHETIST$6, 0, org.apache.xmlbeans.impl.values.XmlObjectBase.KIND_SETTERHELPER_SINGLETON);
        }
        
        /**
         * Appends and returns a new empty "ResponsibleAnaesthetist" element
         */
        public uk.nhs.nhsia.datastandards.ecds.ProfessionalsInvolvedStructure addNewResponsibleAnaesthetist()
        {
            synchronized (monitor())
            {
                check_orphaned();
                uk.nhs.nhsia.datastandards.ecds.ProfessionalsInvolvedStructure target = null;
                target = (uk.nhs.nhsia.datastandards.ecds.ProfessionalsInvolvedStructure)get_store().add_element_user(RESPONSIBLEANAESTHETIST$6);
                return target;
            }
        }
        
        /**
         * Unsets the "ResponsibleAnaesthetist" element
         */
        public void unsetResponsibleAnaesthetist()
        {
            synchronized (monitor())
            {
                check_orphaned();
                get_store().remove_element(RESPONSIBLEANAESTHETIST$6, 0);
            }
        }
    }
}
