/*
 * XML Type:  PaediatricCriticalCarePeriod_Structure
 * Namespace: http://www.nhsia.nhs.uk/DataStandards/XMLschema/CDS/ns
 * Java type: uk.nhs.nhsia.datastandards.ecds.PaediatricCriticalCarePeriodStructure
 *
 * Automatically generated - do not modify.
 */
package uk.nhs.nhsia.datastandards.ecds.impl;
/**
 * An XML PaediatricCriticalCarePeriod_Structure(@http://www.nhsia.nhs.uk/DataStandards/XMLschema/CDS/ns).
 *
 * This is a complex type.
 */
public class PaediatricCriticalCarePeriodStructureImpl extends org.apache.xmlbeans.impl.values.XmlComplexContentImpl implements uk.nhs.nhsia.datastandards.ecds.PaediatricCriticalCarePeriodStructure
{
    private static final long serialVersionUID = 1L;
    
    public PaediatricCriticalCarePeriodStructureImpl(org.apache.xmlbeans.SchemaType sType)
    {
        super(sType);
    }
    
    private static final javax.xml.namespace.QName PCCADMISSIONCHARACTERISTICS$0 = 
        new javax.xml.namespace.QName("http://www.nhsia.nhs.uk/DataStandards/XMLschema/CDS/ns", "PCC_AdmissionCharacteristics");
    private static final javax.xml.namespace.QName PCCCAREACTIVITYGROUP$2 = 
        new javax.xml.namespace.QName("http://www.nhsia.nhs.uk/DataStandards/XMLschema/CDS/ns", "PCC_CareActivityGroup");
    private static final javax.xml.namespace.QName PCCDISCHARGECHARACTERISTICS$4 = 
        new javax.xml.namespace.QName("http://www.nhsia.nhs.uk/DataStandards/XMLschema/CDS/ns", "PCC_DischargeCharacteristics");
    private static final javax.xml.namespace.QName PAEDIATRICCRITICALCARESTRUCTURE$6 = 
        new javax.xml.namespace.QName("", "PaediatricCriticalCareStructure");
    
    
    /**
     * Gets the "PCC_AdmissionCharacteristics" element
     */
    public uk.nhs.nhsia.datastandards.ecds.PaediatricCriticalCarePeriodStructure.PCCAdmissionCharacteristics getPCCAdmissionCharacteristics()
    {
        synchronized (monitor())
        {
            check_orphaned();
            uk.nhs.nhsia.datastandards.ecds.PaediatricCriticalCarePeriodStructure.PCCAdmissionCharacteristics target = null;
            target = (uk.nhs.nhsia.datastandards.ecds.PaediatricCriticalCarePeriodStructure.PCCAdmissionCharacteristics)get_store().find_element_user(PCCADMISSIONCHARACTERISTICS$0, 0);
            if (target == null)
            {
                return null;
            }
            return target;
        }
    }
    
    /**
     * Sets the "PCC_AdmissionCharacteristics" element
     */
    public void setPCCAdmissionCharacteristics(uk.nhs.nhsia.datastandards.ecds.PaediatricCriticalCarePeriodStructure.PCCAdmissionCharacteristics pccAdmissionCharacteristics)
    {
        generatedSetterHelperImpl(pccAdmissionCharacteristics, PCCADMISSIONCHARACTERISTICS$0, 0, org.apache.xmlbeans.impl.values.XmlObjectBase.KIND_SETTERHELPER_SINGLETON);
    }
    
    /**
     * Appends and returns a new empty "PCC_AdmissionCharacteristics" element
     */
    public uk.nhs.nhsia.datastandards.ecds.PaediatricCriticalCarePeriodStructure.PCCAdmissionCharacteristics addNewPCCAdmissionCharacteristics()
    {
        synchronized (monitor())
        {
            check_orphaned();
            uk.nhs.nhsia.datastandards.ecds.PaediatricCriticalCarePeriodStructure.PCCAdmissionCharacteristics target = null;
            target = (uk.nhs.nhsia.datastandards.ecds.PaediatricCriticalCarePeriodStructure.PCCAdmissionCharacteristics)get_store().add_element_user(PCCADMISSIONCHARACTERISTICS$0);
            return target;
        }
    }
    
    /**
     * Gets array of all "PCC_CareActivityGroup" elements
     */
    public uk.nhs.nhsia.datastandards.ecds.PaediatricCriticalCarePeriodStructure.PCCCareActivityGroup[] getPCCCareActivityGroupArray()
    {
        synchronized (monitor())
        {
            check_orphaned();
            java.util.List targetList = new java.util.ArrayList();
            get_store().find_all_element_users(PCCCAREACTIVITYGROUP$2, targetList);
            uk.nhs.nhsia.datastandards.ecds.PaediatricCriticalCarePeriodStructure.PCCCareActivityGroup[] result = new uk.nhs.nhsia.datastandards.ecds.PaediatricCriticalCarePeriodStructure.PCCCareActivityGroup[targetList.size()];
            targetList.toArray(result);
            return result;
        }
    }
    
    /**
     * Gets ith "PCC_CareActivityGroup" element
     */
    public uk.nhs.nhsia.datastandards.ecds.PaediatricCriticalCarePeriodStructure.PCCCareActivityGroup getPCCCareActivityGroupArray(int i)
    {
        synchronized (monitor())
        {
            check_orphaned();
            uk.nhs.nhsia.datastandards.ecds.PaediatricCriticalCarePeriodStructure.PCCCareActivityGroup target = null;
            target = (uk.nhs.nhsia.datastandards.ecds.PaediatricCriticalCarePeriodStructure.PCCCareActivityGroup)get_store().find_element_user(PCCCAREACTIVITYGROUP$2, i);
            if (target == null)
            {
                throw new IndexOutOfBoundsException();
            }
            return target;
        }
    }
    
    /**
     * Returns number of "PCC_CareActivityGroup" element
     */
    public int sizeOfPCCCareActivityGroupArray()
    {
        synchronized (monitor())
        {
            check_orphaned();
            return get_store().count_elements(PCCCAREACTIVITYGROUP$2);
        }
    }
    
    /**
     * Sets array of all "PCC_CareActivityGroup" element  WARNING: This method is not atomicaly synchronized.
     */
    public void setPCCCareActivityGroupArray(uk.nhs.nhsia.datastandards.ecds.PaediatricCriticalCarePeriodStructure.PCCCareActivityGroup[] pccCareActivityGroupArray)
    {
        check_orphaned();
        arraySetterHelper(pccCareActivityGroupArray, PCCCAREACTIVITYGROUP$2);
    }
    
    /**
     * Sets ith "PCC_CareActivityGroup" element
     */
    public void setPCCCareActivityGroupArray(int i, uk.nhs.nhsia.datastandards.ecds.PaediatricCriticalCarePeriodStructure.PCCCareActivityGroup pccCareActivityGroup)
    {
        generatedSetterHelperImpl(pccCareActivityGroup, PCCCAREACTIVITYGROUP$2, i, org.apache.xmlbeans.impl.values.XmlObjectBase.KIND_SETTERHELPER_ARRAYITEM);
    }
    
    /**
     * Inserts and returns a new empty value (as xml) as the ith "PCC_CareActivityGroup" element
     */
    public uk.nhs.nhsia.datastandards.ecds.PaediatricCriticalCarePeriodStructure.PCCCareActivityGroup insertNewPCCCareActivityGroup(int i)
    {
        synchronized (monitor())
        {
            check_orphaned();
            uk.nhs.nhsia.datastandards.ecds.PaediatricCriticalCarePeriodStructure.PCCCareActivityGroup target = null;
            target = (uk.nhs.nhsia.datastandards.ecds.PaediatricCriticalCarePeriodStructure.PCCCareActivityGroup)get_store().insert_element_user(PCCCAREACTIVITYGROUP$2, i);
            return target;
        }
    }
    
    /**
     * Appends and returns a new empty value (as xml) as the last "PCC_CareActivityGroup" element
     */
    public uk.nhs.nhsia.datastandards.ecds.PaediatricCriticalCarePeriodStructure.PCCCareActivityGroup addNewPCCCareActivityGroup()
    {
        synchronized (monitor())
        {
            check_orphaned();
            uk.nhs.nhsia.datastandards.ecds.PaediatricCriticalCarePeriodStructure.PCCCareActivityGroup target = null;
            target = (uk.nhs.nhsia.datastandards.ecds.PaediatricCriticalCarePeriodStructure.PCCCareActivityGroup)get_store().add_element_user(PCCCAREACTIVITYGROUP$2);
            return target;
        }
    }
    
    /**
     * Removes the ith "PCC_CareActivityGroup" element
     */
    public void removePCCCareActivityGroup(int i)
    {
        synchronized (monitor())
        {
            check_orphaned();
            get_store().remove_element(PCCCAREACTIVITYGROUP$2, i);
        }
    }
    
    /**
     * Gets the "PCC_DischargeCharacteristics" element
     */
    public uk.nhs.nhsia.datastandards.ecds.PaediatricCriticalCarePeriodStructure.PCCDischargeCharacteristics getPCCDischargeCharacteristics()
    {
        synchronized (monitor())
        {
            check_orphaned();
            uk.nhs.nhsia.datastandards.ecds.PaediatricCriticalCarePeriodStructure.PCCDischargeCharacteristics target = null;
            target = (uk.nhs.nhsia.datastandards.ecds.PaediatricCriticalCarePeriodStructure.PCCDischargeCharacteristics)get_store().find_element_user(PCCDISCHARGECHARACTERISTICS$4, 0);
            if (target == null)
            {
                return null;
            }
            return target;
        }
    }
    
    /**
     * True if has "PCC_DischargeCharacteristics" element
     */
    public boolean isSetPCCDischargeCharacteristics()
    {
        synchronized (monitor())
        {
            check_orphaned();
            return get_store().count_elements(PCCDISCHARGECHARACTERISTICS$4) != 0;
        }
    }
    
    /**
     * Sets the "PCC_DischargeCharacteristics" element
     */
    public void setPCCDischargeCharacteristics(uk.nhs.nhsia.datastandards.ecds.PaediatricCriticalCarePeriodStructure.PCCDischargeCharacteristics pccDischargeCharacteristics)
    {
        generatedSetterHelperImpl(pccDischargeCharacteristics, PCCDISCHARGECHARACTERISTICS$4, 0, org.apache.xmlbeans.impl.values.XmlObjectBase.KIND_SETTERHELPER_SINGLETON);
    }
    
    /**
     * Appends and returns a new empty "PCC_DischargeCharacteristics" element
     */
    public uk.nhs.nhsia.datastandards.ecds.PaediatricCriticalCarePeriodStructure.PCCDischargeCharacteristics addNewPCCDischargeCharacteristics()
    {
        synchronized (monitor())
        {
            check_orphaned();
            uk.nhs.nhsia.datastandards.ecds.PaediatricCriticalCarePeriodStructure.PCCDischargeCharacteristics target = null;
            target = (uk.nhs.nhsia.datastandards.ecds.PaediatricCriticalCarePeriodStructure.PCCDischargeCharacteristics)get_store().add_element_user(PCCDISCHARGECHARACTERISTICS$4);
            return target;
        }
    }
    
    /**
     * Unsets the "PCC_DischargeCharacteristics" element
     */
    public void unsetPCCDischargeCharacteristics()
    {
        synchronized (monitor())
        {
            check_orphaned();
            get_store().remove_element(PCCDISCHARGECHARACTERISTICS$4, 0);
        }
    }
    
    /**
     * Gets the "PaediatricCriticalCareStructure" attribute
     */
    public uk.nhs.nhsia.datastandards.ecds.CriticalCareUnitFunctionPaediatricType.Enum getPaediatricCriticalCareStructure()
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.SimpleValue target = null;
            target = (org.apache.xmlbeans.SimpleValue)get_store().find_attribute_user(PAEDIATRICCRITICALCARESTRUCTURE$6);
            if (target == null)
            {
                return null;
            }
            return (uk.nhs.nhsia.datastandards.ecds.CriticalCareUnitFunctionPaediatricType.Enum)target.getEnumValue();
        }
    }
    
    /**
     * Gets (as xml) the "PaediatricCriticalCareStructure" attribute
     */
    public uk.nhs.nhsia.datastandards.ecds.CriticalCareUnitFunctionPaediatricType xgetPaediatricCriticalCareStructure()
    {
        synchronized (monitor())
        {
            check_orphaned();
            uk.nhs.nhsia.datastandards.ecds.CriticalCareUnitFunctionPaediatricType target = null;
            target = (uk.nhs.nhsia.datastandards.ecds.CriticalCareUnitFunctionPaediatricType)get_store().find_attribute_user(PAEDIATRICCRITICALCARESTRUCTURE$6);
            return target;
        }
    }
    
    /**
     * Sets the "PaediatricCriticalCareStructure" attribute
     */
    public void setPaediatricCriticalCareStructure(uk.nhs.nhsia.datastandards.ecds.CriticalCareUnitFunctionPaediatricType.Enum paediatricCriticalCareStructure)
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.SimpleValue target = null;
            target = (org.apache.xmlbeans.SimpleValue)get_store().find_attribute_user(PAEDIATRICCRITICALCARESTRUCTURE$6);
            if (target == null)
            {
                target = (org.apache.xmlbeans.SimpleValue)get_store().add_attribute_user(PAEDIATRICCRITICALCARESTRUCTURE$6);
            }
            target.setEnumValue(paediatricCriticalCareStructure);
        }
    }
    
    /**
     * Sets (as xml) the "PaediatricCriticalCareStructure" attribute
     */
    public void xsetPaediatricCriticalCareStructure(uk.nhs.nhsia.datastandards.ecds.CriticalCareUnitFunctionPaediatricType paediatricCriticalCareStructure)
    {
        synchronized (monitor())
        {
            check_orphaned();
            uk.nhs.nhsia.datastandards.ecds.CriticalCareUnitFunctionPaediatricType target = null;
            target = (uk.nhs.nhsia.datastandards.ecds.CriticalCareUnitFunctionPaediatricType)get_store().find_attribute_user(PAEDIATRICCRITICALCARESTRUCTURE$6);
            if (target == null)
            {
                target = (uk.nhs.nhsia.datastandards.ecds.CriticalCareUnitFunctionPaediatricType)get_store().add_attribute_user(PAEDIATRICCRITICALCARESTRUCTURE$6);
            }
            target.set(paediatricCriticalCareStructure);
        }
    }
    /**
     * An XML PCC_AdmissionCharacteristics(@http://www.nhsia.nhs.uk/DataStandards/XMLschema/CDS/ns).
     *
     * This is a complex type.
     */
    public static class PCCAdmissionCharacteristicsImpl extends org.apache.xmlbeans.impl.values.XmlComplexContentImpl implements uk.nhs.nhsia.datastandards.ecds.PaediatricCriticalCarePeriodStructure.PCCAdmissionCharacteristics
    {
        private static final long serialVersionUID = 1L;
        
        public PCCAdmissionCharacteristicsImpl(org.apache.xmlbeans.SchemaType sType)
        {
            super(sType);
        }
        
        private static final javax.xml.namespace.QName CRITICALCARELOCALIDENTIFIER$0 = 
            new javax.xml.namespace.QName("http://www.nhsia.nhs.uk/DataStandards/XMLschema/CDS/ns", "CriticalCareLocalIdentifier");
        private static final javax.xml.namespace.QName CRITICALCARESTARTDATE$2 = 
            new javax.xml.namespace.QName("http://www.nhsia.nhs.uk/DataStandards/XMLschema/CDS/ns", "CriticalCareStartDate");
        private static final javax.xml.namespace.QName CRITICALCARESTARTTIME$4 = 
            new javax.xml.namespace.QName("http://www.nhsia.nhs.uk/DataStandards/XMLschema/CDS/ns", "CriticalCareStartTime");
        private static final javax.xml.namespace.QName CRITICALCAREUNITFUNCTION$6 = 
            new javax.xml.namespace.QName("http://www.nhsia.nhs.uk/DataStandards/XMLschema/CDS/ns", "CriticalCareUnitFunction");
        
        
        /**
         * Gets the "CriticalCareLocalIdentifier" element
         */
        public java.lang.String getCriticalCareLocalIdentifier()
        {
            synchronized (monitor())
            {
                check_orphaned();
                org.apache.xmlbeans.SimpleValue target = null;
                target = (org.apache.xmlbeans.SimpleValue)get_store().find_element_user(CRITICALCARELOCALIDENTIFIER$0, 0);
                if (target == null)
                {
                    return null;
                }
                return target.getStringValue();
            }
        }
        
        /**
         * Gets (as xml) the "CriticalCareLocalIdentifier" element
         */
        public uk.nhs.nhsia.datastandards.ecds.CriticalCareLocalIdentifierType xgetCriticalCareLocalIdentifier()
        {
            synchronized (monitor())
            {
                check_orphaned();
                uk.nhs.nhsia.datastandards.ecds.CriticalCareLocalIdentifierType target = null;
                target = (uk.nhs.nhsia.datastandards.ecds.CriticalCareLocalIdentifierType)get_store().find_element_user(CRITICALCARELOCALIDENTIFIER$0, 0);
                return target;
            }
        }
        
        /**
         * Sets the "CriticalCareLocalIdentifier" element
         */
        public void setCriticalCareLocalIdentifier(java.lang.String criticalCareLocalIdentifier)
        {
            synchronized (monitor())
            {
                check_orphaned();
                org.apache.xmlbeans.SimpleValue target = null;
                target = (org.apache.xmlbeans.SimpleValue)get_store().find_element_user(CRITICALCARELOCALIDENTIFIER$0, 0);
                if (target == null)
                {
                    target = (org.apache.xmlbeans.SimpleValue)get_store().add_element_user(CRITICALCARELOCALIDENTIFIER$0);
                }
                target.setStringValue(criticalCareLocalIdentifier);
            }
        }
        
        /**
         * Sets (as xml) the "CriticalCareLocalIdentifier" element
         */
        public void xsetCriticalCareLocalIdentifier(uk.nhs.nhsia.datastandards.ecds.CriticalCareLocalIdentifierType criticalCareLocalIdentifier)
        {
            synchronized (monitor())
            {
                check_orphaned();
                uk.nhs.nhsia.datastandards.ecds.CriticalCareLocalIdentifierType target = null;
                target = (uk.nhs.nhsia.datastandards.ecds.CriticalCareLocalIdentifierType)get_store().find_element_user(CRITICALCARELOCALIDENTIFIER$0, 0);
                if (target == null)
                {
                    target = (uk.nhs.nhsia.datastandards.ecds.CriticalCareLocalIdentifierType)get_store().add_element_user(CRITICALCARELOCALIDENTIFIER$0);
                }
                target.set(criticalCareLocalIdentifier);
            }
        }
        
        /**
         * Gets the "CriticalCareStartDate" element
         */
        public java.util.Calendar getCriticalCareStartDate()
        {
            synchronized (monitor())
            {
                check_orphaned();
                org.apache.xmlbeans.SimpleValue target = null;
                target = (org.apache.xmlbeans.SimpleValue)get_store().find_element_user(CRITICALCARESTARTDATE$2, 0);
                if (target == null)
                {
                    return null;
                }
                return target.getCalendarValue();
            }
        }
        
        /**
         * Gets (as xml) the "CriticalCareStartDate" element
         */
        public uk.nhs.nhsia.datastandards.ecds.CriticalCareStartDateType xgetCriticalCareStartDate()
        {
            synchronized (monitor())
            {
                check_orphaned();
                uk.nhs.nhsia.datastandards.ecds.CriticalCareStartDateType target = null;
                target = (uk.nhs.nhsia.datastandards.ecds.CriticalCareStartDateType)get_store().find_element_user(CRITICALCARESTARTDATE$2, 0);
                return target;
            }
        }
        
        /**
         * Sets the "CriticalCareStartDate" element
         */
        public void setCriticalCareStartDate(java.util.Calendar criticalCareStartDate)
        {
            synchronized (monitor())
            {
                check_orphaned();
                org.apache.xmlbeans.SimpleValue target = null;
                target = (org.apache.xmlbeans.SimpleValue)get_store().find_element_user(CRITICALCARESTARTDATE$2, 0);
                if (target == null)
                {
                    target = (org.apache.xmlbeans.SimpleValue)get_store().add_element_user(CRITICALCARESTARTDATE$2);
                }
                target.setCalendarValue(criticalCareStartDate);
            }
        }
        
        /**
         * Sets (as xml) the "CriticalCareStartDate" element
         */
        public void xsetCriticalCareStartDate(uk.nhs.nhsia.datastandards.ecds.CriticalCareStartDateType criticalCareStartDate)
        {
            synchronized (monitor())
            {
                check_orphaned();
                uk.nhs.nhsia.datastandards.ecds.CriticalCareStartDateType target = null;
                target = (uk.nhs.nhsia.datastandards.ecds.CriticalCareStartDateType)get_store().find_element_user(CRITICALCARESTARTDATE$2, 0);
                if (target == null)
                {
                    target = (uk.nhs.nhsia.datastandards.ecds.CriticalCareStartDateType)get_store().add_element_user(CRITICALCARESTARTDATE$2);
                }
                target.set(criticalCareStartDate);
            }
        }
        
        /**
         * Gets the "CriticalCareStartTime" element
         */
        public java.util.Calendar getCriticalCareStartTime()
        {
            synchronized (monitor())
            {
                check_orphaned();
                org.apache.xmlbeans.SimpleValue target = null;
                target = (org.apache.xmlbeans.SimpleValue)get_store().find_element_user(CRITICALCARESTARTTIME$4, 0);
                if (target == null)
                {
                    return null;
                }
                return target.getCalendarValue();
            }
        }
        
        /**
         * Gets (as xml) the "CriticalCareStartTime" element
         */
        public uk.nhs.nhsia.datastandards.ecds.CriticalCareStartTimeType xgetCriticalCareStartTime()
        {
            synchronized (monitor())
            {
                check_orphaned();
                uk.nhs.nhsia.datastandards.ecds.CriticalCareStartTimeType target = null;
                target = (uk.nhs.nhsia.datastandards.ecds.CriticalCareStartTimeType)get_store().find_element_user(CRITICALCARESTARTTIME$4, 0);
                return target;
            }
        }
        
        /**
         * Sets the "CriticalCareStartTime" element
         */
        public void setCriticalCareStartTime(java.util.Calendar criticalCareStartTime)
        {
            synchronized (monitor())
            {
                check_orphaned();
                org.apache.xmlbeans.SimpleValue target = null;
                target = (org.apache.xmlbeans.SimpleValue)get_store().find_element_user(CRITICALCARESTARTTIME$4, 0);
                if (target == null)
                {
                    target = (org.apache.xmlbeans.SimpleValue)get_store().add_element_user(CRITICALCARESTARTTIME$4);
                }
                target.setCalendarValue(criticalCareStartTime);
            }
        }
        
        /**
         * Sets (as xml) the "CriticalCareStartTime" element
         */
        public void xsetCriticalCareStartTime(uk.nhs.nhsia.datastandards.ecds.CriticalCareStartTimeType criticalCareStartTime)
        {
            synchronized (monitor())
            {
                check_orphaned();
                uk.nhs.nhsia.datastandards.ecds.CriticalCareStartTimeType target = null;
                target = (uk.nhs.nhsia.datastandards.ecds.CriticalCareStartTimeType)get_store().find_element_user(CRITICALCARESTARTTIME$4, 0);
                if (target == null)
                {
                    target = (uk.nhs.nhsia.datastandards.ecds.CriticalCareStartTimeType)get_store().add_element_user(CRITICALCARESTARTTIME$4);
                }
                target.set(criticalCareStartTime);
            }
        }
        
        /**
         * Gets the "CriticalCareUnitFunction" element
         */
        public uk.nhs.nhsia.datastandards.ecds.CriticalCareUnitFunctionPaediatricType.Enum getCriticalCareUnitFunction()
        {
            synchronized (monitor())
            {
                check_orphaned();
                org.apache.xmlbeans.SimpleValue target = null;
                target = (org.apache.xmlbeans.SimpleValue)get_store().find_element_user(CRITICALCAREUNITFUNCTION$6, 0);
                if (target == null)
                {
                    return null;
                }
                return (uk.nhs.nhsia.datastandards.ecds.CriticalCareUnitFunctionPaediatricType.Enum)target.getEnumValue();
            }
        }
        
        /**
         * Gets (as xml) the "CriticalCareUnitFunction" element
         */
        public uk.nhs.nhsia.datastandards.ecds.CriticalCareUnitFunctionPaediatricType xgetCriticalCareUnitFunction()
        {
            synchronized (monitor())
            {
                check_orphaned();
                uk.nhs.nhsia.datastandards.ecds.CriticalCareUnitFunctionPaediatricType target = null;
                target = (uk.nhs.nhsia.datastandards.ecds.CriticalCareUnitFunctionPaediatricType)get_store().find_element_user(CRITICALCAREUNITFUNCTION$6, 0);
                return target;
            }
        }
        
        /**
         * Sets the "CriticalCareUnitFunction" element
         */
        public void setCriticalCareUnitFunction(uk.nhs.nhsia.datastandards.ecds.CriticalCareUnitFunctionPaediatricType.Enum criticalCareUnitFunction)
        {
            synchronized (monitor())
            {
                check_orphaned();
                org.apache.xmlbeans.SimpleValue target = null;
                target = (org.apache.xmlbeans.SimpleValue)get_store().find_element_user(CRITICALCAREUNITFUNCTION$6, 0);
                if (target == null)
                {
                    target = (org.apache.xmlbeans.SimpleValue)get_store().add_element_user(CRITICALCAREUNITFUNCTION$6);
                }
                target.setEnumValue(criticalCareUnitFunction);
            }
        }
        
        /**
         * Sets (as xml) the "CriticalCareUnitFunction" element
         */
        public void xsetCriticalCareUnitFunction(uk.nhs.nhsia.datastandards.ecds.CriticalCareUnitFunctionPaediatricType criticalCareUnitFunction)
        {
            synchronized (monitor())
            {
                check_orphaned();
                uk.nhs.nhsia.datastandards.ecds.CriticalCareUnitFunctionPaediatricType target = null;
                target = (uk.nhs.nhsia.datastandards.ecds.CriticalCareUnitFunctionPaediatricType)get_store().find_element_user(CRITICALCAREUNITFUNCTION$6, 0);
                if (target == null)
                {
                    target = (uk.nhs.nhsia.datastandards.ecds.CriticalCareUnitFunctionPaediatricType)get_store().add_element_user(CRITICALCAREUNITFUNCTION$6);
                }
                target.set(criticalCareUnitFunction);
            }
        }
    }
    /**
     * An XML PCC_CareActivityGroup(@http://www.nhsia.nhs.uk/DataStandards/XMLschema/CDS/ns).
     *
     * This is a complex type.
     */
    public static class PCCCareActivityGroupImpl extends org.apache.xmlbeans.impl.values.XmlComplexContentImpl implements uk.nhs.nhsia.datastandards.ecds.PaediatricCriticalCarePeriodStructure.PCCCareActivityGroup
    {
        private static final long serialVersionUID = 1L;
        
        public PCCCareActivityGroupImpl(org.apache.xmlbeans.SchemaType sType)
        {
            super(sType);
        }
        
        private static final javax.xml.namespace.QName ACTIVITYDATECRITICALCARE$0 = 
            new javax.xml.namespace.QName("http://www.nhsia.nhs.uk/DataStandards/XMLschema/CDS/ns", "ActivityDate_CriticalCare");
        private static final javax.xml.namespace.QName CRITICALCAREACTIVITYCODE$2 = 
            new javax.xml.namespace.QName("http://www.nhsia.nhs.uk/DataStandards/XMLschema/CDS/ns", "CriticalCareActivityCode");
        private static final javax.xml.namespace.QName HIGHCOSTDRUGSOPCS$4 = 
            new javax.xml.namespace.QName("http://www.nhsia.nhs.uk/DataStandards/XMLschema/CDS/ns", "HighCostDrugs_OPCS");
        
        
        /**
         * Gets the "ActivityDate_CriticalCare" element
         */
        public java.util.Calendar getActivityDateCriticalCare()
        {
            synchronized (monitor())
            {
                check_orphaned();
                org.apache.xmlbeans.SimpleValue target = null;
                target = (org.apache.xmlbeans.SimpleValue)get_store().find_element_user(ACTIVITYDATECRITICALCARE$0, 0);
                if (target == null)
                {
                    return null;
                }
                return target.getCalendarValue();
            }
        }
        
        /**
         * Gets (as xml) the "ActivityDate_CriticalCare" element
         */
        public uk.nhs.nhsia.datastandards.ecds.ActivityDateCriticalCareType xgetActivityDateCriticalCare()
        {
            synchronized (monitor())
            {
                check_orphaned();
                uk.nhs.nhsia.datastandards.ecds.ActivityDateCriticalCareType target = null;
                target = (uk.nhs.nhsia.datastandards.ecds.ActivityDateCriticalCareType)get_store().find_element_user(ACTIVITYDATECRITICALCARE$0, 0);
                return target;
            }
        }
        
        /**
         * Sets the "ActivityDate_CriticalCare" element
         */
        public void setActivityDateCriticalCare(java.util.Calendar activityDateCriticalCare)
        {
            synchronized (monitor())
            {
                check_orphaned();
                org.apache.xmlbeans.SimpleValue target = null;
                target = (org.apache.xmlbeans.SimpleValue)get_store().find_element_user(ACTIVITYDATECRITICALCARE$0, 0);
                if (target == null)
                {
                    target = (org.apache.xmlbeans.SimpleValue)get_store().add_element_user(ACTIVITYDATECRITICALCARE$0);
                }
                target.setCalendarValue(activityDateCriticalCare);
            }
        }
        
        /**
         * Sets (as xml) the "ActivityDate_CriticalCare" element
         */
        public void xsetActivityDateCriticalCare(uk.nhs.nhsia.datastandards.ecds.ActivityDateCriticalCareType activityDateCriticalCare)
        {
            synchronized (monitor())
            {
                check_orphaned();
                uk.nhs.nhsia.datastandards.ecds.ActivityDateCriticalCareType target = null;
                target = (uk.nhs.nhsia.datastandards.ecds.ActivityDateCriticalCareType)get_store().find_element_user(ACTIVITYDATECRITICALCARE$0, 0);
                if (target == null)
                {
                    target = (uk.nhs.nhsia.datastandards.ecds.ActivityDateCriticalCareType)get_store().add_element_user(ACTIVITYDATECRITICALCARE$0);
                }
                target.set(activityDateCriticalCare);
            }
        }
        
        /**
         * Gets array of all "CriticalCareActivityCode" elements
         */
        public uk.nhs.nhsia.datastandards.ecds.CriticalCareActivityCodeType.Enum[] getCriticalCareActivityCodeArray()
        {
            synchronized (monitor())
            {
                check_orphaned();
                java.util.List targetList = new java.util.ArrayList();
                get_store().find_all_element_users(CRITICALCAREACTIVITYCODE$2, targetList);
                uk.nhs.nhsia.datastandards.ecds.CriticalCareActivityCodeType.Enum[] result = new uk.nhs.nhsia.datastandards.ecds.CriticalCareActivityCodeType.Enum[targetList.size()];
                for (int i = 0, len = targetList.size() ; i < len ; i++)
                    result[i] = (uk.nhs.nhsia.datastandards.ecds.CriticalCareActivityCodeType.Enum)((org.apache.xmlbeans.SimpleValue)targetList.get(i)).getEnumValue();
                return result;
            }
        }
        
        /**
         * Gets ith "CriticalCareActivityCode" element
         */
        public uk.nhs.nhsia.datastandards.ecds.CriticalCareActivityCodeType.Enum getCriticalCareActivityCodeArray(int i)
        {
            synchronized (monitor())
            {
                check_orphaned();
                org.apache.xmlbeans.SimpleValue target = null;
                target = (org.apache.xmlbeans.SimpleValue)get_store().find_element_user(CRITICALCAREACTIVITYCODE$2, i);
                if (target == null)
                {
                    throw new IndexOutOfBoundsException();
                }
                return (uk.nhs.nhsia.datastandards.ecds.CriticalCareActivityCodeType.Enum)target.getEnumValue();
            }
        }
        
        /**
         * Gets (as xml) array of all "CriticalCareActivityCode" elements
         */
        public uk.nhs.nhsia.datastandards.ecds.CriticalCareActivityCodeType[] xgetCriticalCareActivityCodeArray()
        {
            synchronized (monitor())
            {
                check_orphaned();
                java.util.List targetList = new java.util.ArrayList();
                get_store().find_all_element_users(CRITICALCAREACTIVITYCODE$2, targetList);
                uk.nhs.nhsia.datastandards.ecds.CriticalCareActivityCodeType[] result = new uk.nhs.nhsia.datastandards.ecds.CriticalCareActivityCodeType[targetList.size()];
                targetList.toArray(result);
                return result;
            }
        }
        
        /**
         * Gets (as xml) ith "CriticalCareActivityCode" element
         */
        public uk.nhs.nhsia.datastandards.ecds.CriticalCareActivityCodeType xgetCriticalCareActivityCodeArray(int i)
        {
            synchronized (monitor())
            {
                check_orphaned();
                uk.nhs.nhsia.datastandards.ecds.CriticalCareActivityCodeType target = null;
                target = (uk.nhs.nhsia.datastandards.ecds.CriticalCareActivityCodeType)get_store().find_element_user(CRITICALCAREACTIVITYCODE$2, i);
                if (target == null)
                {
                    throw new IndexOutOfBoundsException();
                }
                return target;
            }
        }
        
        /**
         * Returns number of "CriticalCareActivityCode" element
         */
        public int sizeOfCriticalCareActivityCodeArray()
        {
            synchronized (monitor())
            {
                check_orphaned();
                return get_store().count_elements(CRITICALCAREACTIVITYCODE$2);
            }
        }
        
        /**
         * Sets array of all "CriticalCareActivityCode" element
         */
        public void setCriticalCareActivityCodeArray(uk.nhs.nhsia.datastandards.ecds.CriticalCareActivityCodeType.Enum[] criticalCareActivityCodeArray)
        {
            synchronized (monitor())
            {
                check_orphaned();
                arraySetterHelper(criticalCareActivityCodeArray, CRITICALCAREACTIVITYCODE$2);
            }
        }
        
        /**
         * Sets ith "CriticalCareActivityCode" element
         */
        public void setCriticalCareActivityCodeArray(int i, uk.nhs.nhsia.datastandards.ecds.CriticalCareActivityCodeType.Enum criticalCareActivityCode)
        {
            synchronized (monitor())
            {
                check_orphaned();
                org.apache.xmlbeans.SimpleValue target = null;
                target = (org.apache.xmlbeans.SimpleValue)get_store().find_element_user(CRITICALCAREACTIVITYCODE$2, i);
                if (target == null)
                {
                    throw new IndexOutOfBoundsException();
                }
                target.setEnumValue(criticalCareActivityCode);
            }
        }
        
        /**
         * Sets (as xml) array of all "CriticalCareActivityCode" element
         */
        public void xsetCriticalCareActivityCodeArray(uk.nhs.nhsia.datastandards.ecds.CriticalCareActivityCodeType[]criticalCareActivityCodeArray)
        {
            synchronized (monitor())
            {
                check_orphaned();
                arraySetterHelper(criticalCareActivityCodeArray, CRITICALCAREACTIVITYCODE$2);
            }
        }
        
        /**
         * Sets (as xml) ith "CriticalCareActivityCode" element
         */
        public void xsetCriticalCareActivityCodeArray(int i, uk.nhs.nhsia.datastandards.ecds.CriticalCareActivityCodeType criticalCareActivityCode)
        {
            synchronized (monitor())
            {
                check_orphaned();
                uk.nhs.nhsia.datastandards.ecds.CriticalCareActivityCodeType target = null;
                target = (uk.nhs.nhsia.datastandards.ecds.CriticalCareActivityCodeType)get_store().find_element_user(CRITICALCAREACTIVITYCODE$2, i);
                if (target == null)
                {
                    throw new IndexOutOfBoundsException();
                }
                target.set(criticalCareActivityCode);
            }
        }
        
        /**
         * Inserts the value as the ith "CriticalCareActivityCode" element
         */
        public void insertCriticalCareActivityCode(int i, uk.nhs.nhsia.datastandards.ecds.CriticalCareActivityCodeType.Enum criticalCareActivityCode)
        {
            synchronized (monitor())
            {
                check_orphaned();
                org.apache.xmlbeans.SimpleValue target = 
                    (org.apache.xmlbeans.SimpleValue)get_store().insert_element_user(CRITICALCAREACTIVITYCODE$2, i);
                target.setEnumValue(criticalCareActivityCode);
            }
        }
        
        /**
         * Appends the value as the last "CriticalCareActivityCode" element
         */
        public void addCriticalCareActivityCode(uk.nhs.nhsia.datastandards.ecds.CriticalCareActivityCodeType.Enum criticalCareActivityCode)
        {
            synchronized (monitor())
            {
                check_orphaned();
                org.apache.xmlbeans.SimpleValue target = null;
                target = (org.apache.xmlbeans.SimpleValue)get_store().add_element_user(CRITICALCAREACTIVITYCODE$2);
                target.setEnumValue(criticalCareActivityCode);
            }
        }
        
        /**
         * Inserts and returns a new empty value (as xml) as the ith "CriticalCareActivityCode" element
         */
        public uk.nhs.nhsia.datastandards.ecds.CriticalCareActivityCodeType insertNewCriticalCareActivityCode(int i)
        {
            synchronized (monitor())
            {
                check_orphaned();
                uk.nhs.nhsia.datastandards.ecds.CriticalCareActivityCodeType target = null;
                target = (uk.nhs.nhsia.datastandards.ecds.CriticalCareActivityCodeType)get_store().insert_element_user(CRITICALCAREACTIVITYCODE$2, i);
                return target;
            }
        }
        
        /**
         * Appends and returns a new empty value (as xml) as the last "CriticalCareActivityCode" element
         */
        public uk.nhs.nhsia.datastandards.ecds.CriticalCareActivityCodeType addNewCriticalCareActivityCode()
        {
            synchronized (monitor())
            {
                check_orphaned();
                uk.nhs.nhsia.datastandards.ecds.CriticalCareActivityCodeType target = null;
                target = (uk.nhs.nhsia.datastandards.ecds.CriticalCareActivityCodeType)get_store().add_element_user(CRITICALCAREACTIVITYCODE$2);
                return target;
            }
        }
        
        /**
         * Removes the ith "CriticalCareActivityCode" element
         */
        public void removeCriticalCareActivityCode(int i)
        {
            synchronized (monitor())
            {
                check_orphaned();
                get_store().remove_element(CRITICALCAREACTIVITYCODE$2, i);
            }
        }
        
        /**
         * Gets array of all "HighCostDrugs_OPCS" elements
         */
        public java.lang.String[] getHighCostDrugsOPCSArray()
        {
            synchronized (monitor())
            {
                check_orphaned();
                java.util.List targetList = new java.util.ArrayList();
                get_store().find_all_element_users(HIGHCOSTDRUGSOPCS$4, targetList);
                java.lang.String[] result = new java.lang.String[targetList.size()];
                for (int i = 0, len = targetList.size() ; i < len ; i++)
                    result[i] = ((org.apache.xmlbeans.SimpleValue)targetList.get(i)).getStringValue();
                return result;
            }
        }
        
        /**
         * Gets ith "HighCostDrugs_OPCS" element
         */
        public java.lang.String getHighCostDrugsOPCSArray(int i)
        {
            synchronized (monitor())
            {
                check_orphaned();
                org.apache.xmlbeans.SimpleValue target = null;
                target = (org.apache.xmlbeans.SimpleValue)get_store().find_element_user(HIGHCOSTDRUGSOPCS$4, i);
                if (target == null)
                {
                    throw new IndexOutOfBoundsException();
                }
                return target.getStringValue();
            }
        }
        
        /**
         * Gets (as xml) array of all "HighCostDrugs_OPCS" elements
         */
        public uk.nhs.nhsia.datastandards.ecds.HighCostDrugsOPCSType[] xgetHighCostDrugsOPCSArray()
        {
            synchronized (monitor())
            {
                check_orphaned();
                java.util.List targetList = new java.util.ArrayList();
                get_store().find_all_element_users(HIGHCOSTDRUGSOPCS$4, targetList);
                uk.nhs.nhsia.datastandards.ecds.HighCostDrugsOPCSType[] result = new uk.nhs.nhsia.datastandards.ecds.HighCostDrugsOPCSType[targetList.size()];
                targetList.toArray(result);
                return result;
            }
        }
        
        /**
         * Gets (as xml) ith "HighCostDrugs_OPCS" element
         */
        public uk.nhs.nhsia.datastandards.ecds.HighCostDrugsOPCSType xgetHighCostDrugsOPCSArray(int i)
        {
            synchronized (monitor())
            {
                check_orphaned();
                uk.nhs.nhsia.datastandards.ecds.HighCostDrugsOPCSType target = null;
                target = (uk.nhs.nhsia.datastandards.ecds.HighCostDrugsOPCSType)get_store().find_element_user(HIGHCOSTDRUGSOPCS$4, i);
                if (target == null)
                {
                    throw new IndexOutOfBoundsException();
                }
                return target;
            }
        }
        
        /**
         * Returns number of "HighCostDrugs_OPCS" element
         */
        public int sizeOfHighCostDrugsOPCSArray()
        {
            synchronized (monitor())
            {
                check_orphaned();
                return get_store().count_elements(HIGHCOSTDRUGSOPCS$4);
            }
        }
        
        /**
         * Sets array of all "HighCostDrugs_OPCS" element
         */
        public void setHighCostDrugsOPCSArray(java.lang.String[] highCostDrugsOPCSArray)
        {
            synchronized (monitor())
            {
                check_orphaned();
                arraySetterHelper(highCostDrugsOPCSArray, HIGHCOSTDRUGSOPCS$4);
            }
        }
        
        /**
         * Sets ith "HighCostDrugs_OPCS" element
         */
        public void setHighCostDrugsOPCSArray(int i, java.lang.String highCostDrugsOPCS)
        {
            synchronized (monitor())
            {
                check_orphaned();
                org.apache.xmlbeans.SimpleValue target = null;
                target = (org.apache.xmlbeans.SimpleValue)get_store().find_element_user(HIGHCOSTDRUGSOPCS$4, i);
                if (target == null)
                {
                    throw new IndexOutOfBoundsException();
                }
                target.setStringValue(highCostDrugsOPCS);
            }
        }
        
        /**
         * Sets (as xml) array of all "HighCostDrugs_OPCS" element
         */
        public void xsetHighCostDrugsOPCSArray(uk.nhs.nhsia.datastandards.ecds.HighCostDrugsOPCSType[]highCostDrugsOPCSArray)
        {
            synchronized (monitor())
            {
                check_orphaned();
                arraySetterHelper(highCostDrugsOPCSArray, HIGHCOSTDRUGSOPCS$4);
            }
        }
        
        /**
         * Sets (as xml) ith "HighCostDrugs_OPCS" element
         */
        public void xsetHighCostDrugsOPCSArray(int i, uk.nhs.nhsia.datastandards.ecds.HighCostDrugsOPCSType highCostDrugsOPCS)
        {
            synchronized (monitor())
            {
                check_orphaned();
                uk.nhs.nhsia.datastandards.ecds.HighCostDrugsOPCSType target = null;
                target = (uk.nhs.nhsia.datastandards.ecds.HighCostDrugsOPCSType)get_store().find_element_user(HIGHCOSTDRUGSOPCS$4, i);
                if (target == null)
                {
                    throw new IndexOutOfBoundsException();
                }
                target.set(highCostDrugsOPCS);
            }
        }
        
        /**
         * Inserts the value as the ith "HighCostDrugs_OPCS" element
         */
        public void insertHighCostDrugsOPCS(int i, java.lang.String highCostDrugsOPCS)
        {
            synchronized (monitor())
            {
                check_orphaned();
                org.apache.xmlbeans.SimpleValue target = 
                    (org.apache.xmlbeans.SimpleValue)get_store().insert_element_user(HIGHCOSTDRUGSOPCS$4, i);
                target.setStringValue(highCostDrugsOPCS);
            }
        }
        
        /**
         * Appends the value as the last "HighCostDrugs_OPCS" element
         */
        public void addHighCostDrugsOPCS(java.lang.String highCostDrugsOPCS)
        {
            synchronized (monitor())
            {
                check_orphaned();
                org.apache.xmlbeans.SimpleValue target = null;
                target = (org.apache.xmlbeans.SimpleValue)get_store().add_element_user(HIGHCOSTDRUGSOPCS$4);
                target.setStringValue(highCostDrugsOPCS);
            }
        }
        
        /**
         * Inserts and returns a new empty value (as xml) as the ith "HighCostDrugs_OPCS" element
         */
        public uk.nhs.nhsia.datastandards.ecds.HighCostDrugsOPCSType insertNewHighCostDrugsOPCS(int i)
        {
            synchronized (monitor())
            {
                check_orphaned();
                uk.nhs.nhsia.datastandards.ecds.HighCostDrugsOPCSType target = null;
                target = (uk.nhs.nhsia.datastandards.ecds.HighCostDrugsOPCSType)get_store().insert_element_user(HIGHCOSTDRUGSOPCS$4, i);
                return target;
            }
        }
        
        /**
         * Appends and returns a new empty value (as xml) as the last "HighCostDrugs_OPCS" element
         */
        public uk.nhs.nhsia.datastandards.ecds.HighCostDrugsOPCSType addNewHighCostDrugsOPCS()
        {
            synchronized (monitor())
            {
                check_orphaned();
                uk.nhs.nhsia.datastandards.ecds.HighCostDrugsOPCSType target = null;
                target = (uk.nhs.nhsia.datastandards.ecds.HighCostDrugsOPCSType)get_store().add_element_user(HIGHCOSTDRUGSOPCS$4);
                return target;
            }
        }
        
        /**
         * Removes the ith "HighCostDrugs_OPCS" element
         */
        public void removeHighCostDrugsOPCS(int i)
        {
            synchronized (monitor())
            {
                check_orphaned();
                get_store().remove_element(HIGHCOSTDRUGSOPCS$4, i);
            }
        }
    }
    /**
     * An XML PCC_DischargeCharacteristics(@http://www.nhsia.nhs.uk/DataStandards/XMLschema/CDS/ns).
     *
     * This is a complex type.
     */
    public static class PCCDischargeCharacteristicsImpl extends org.apache.xmlbeans.impl.values.XmlComplexContentImpl implements uk.nhs.nhsia.datastandards.ecds.PaediatricCriticalCarePeriodStructure.PCCDischargeCharacteristics
    {
        private static final long serialVersionUID = 1L;
        
        public PCCDischargeCharacteristicsImpl(org.apache.xmlbeans.SchemaType sType)
        {
            super(sType);
        }
        
        private static final javax.xml.namespace.QName CRITICALCAREDISCHARGEDATE$0 = 
            new javax.xml.namespace.QName("http://www.nhsia.nhs.uk/DataStandards/XMLschema/CDS/ns", "CriticalCareDischargeDate");
        private static final javax.xml.namespace.QName CRITICALCAREDISCHARGETIME$2 = 
            new javax.xml.namespace.QName("http://www.nhsia.nhs.uk/DataStandards/XMLschema/CDS/ns", "CriticalCareDischargeTime");
        
        
        /**
         * Gets the "CriticalCareDischargeDate" element
         */
        public java.util.Calendar getCriticalCareDischargeDate()
        {
            synchronized (monitor())
            {
                check_orphaned();
                org.apache.xmlbeans.SimpleValue target = null;
                target = (org.apache.xmlbeans.SimpleValue)get_store().find_element_user(CRITICALCAREDISCHARGEDATE$0, 0);
                if (target == null)
                {
                    return null;
                }
                return target.getCalendarValue();
            }
        }
        
        /**
         * Gets (as xml) the "CriticalCareDischargeDate" element
         */
        public uk.nhs.nhsia.datastandards.ecds.CriticalCareDischargeDateType xgetCriticalCareDischargeDate()
        {
            synchronized (monitor())
            {
                check_orphaned();
                uk.nhs.nhsia.datastandards.ecds.CriticalCareDischargeDateType target = null;
                target = (uk.nhs.nhsia.datastandards.ecds.CriticalCareDischargeDateType)get_store().find_element_user(CRITICALCAREDISCHARGEDATE$0, 0);
                return target;
            }
        }
        
        /**
         * Sets the "CriticalCareDischargeDate" element
         */
        public void setCriticalCareDischargeDate(java.util.Calendar criticalCareDischargeDate)
        {
            synchronized (monitor())
            {
                check_orphaned();
                org.apache.xmlbeans.SimpleValue target = null;
                target = (org.apache.xmlbeans.SimpleValue)get_store().find_element_user(CRITICALCAREDISCHARGEDATE$0, 0);
                if (target == null)
                {
                    target = (org.apache.xmlbeans.SimpleValue)get_store().add_element_user(CRITICALCAREDISCHARGEDATE$0);
                }
                target.setCalendarValue(criticalCareDischargeDate);
            }
        }
        
        /**
         * Sets (as xml) the "CriticalCareDischargeDate" element
         */
        public void xsetCriticalCareDischargeDate(uk.nhs.nhsia.datastandards.ecds.CriticalCareDischargeDateType criticalCareDischargeDate)
        {
            synchronized (monitor())
            {
                check_orphaned();
                uk.nhs.nhsia.datastandards.ecds.CriticalCareDischargeDateType target = null;
                target = (uk.nhs.nhsia.datastandards.ecds.CriticalCareDischargeDateType)get_store().find_element_user(CRITICALCAREDISCHARGEDATE$0, 0);
                if (target == null)
                {
                    target = (uk.nhs.nhsia.datastandards.ecds.CriticalCareDischargeDateType)get_store().add_element_user(CRITICALCAREDISCHARGEDATE$0);
                }
                target.set(criticalCareDischargeDate);
            }
        }
        
        /**
         * Gets the "CriticalCareDischargeTime" element
         */
        public java.util.Calendar getCriticalCareDischargeTime()
        {
            synchronized (monitor())
            {
                check_orphaned();
                org.apache.xmlbeans.SimpleValue target = null;
                target = (org.apache.xmlbeans.SimpleValue)get_store().find_element_user(CRITICALCAREDISCHARGETIME$2, 0);
                if (target == null)
                {
                    return null;
                }
                return target.getCalendarValue();
            }
        }
        
        /**
         * Gets (as xml) the "CriticalCareDischargeTime" element
         */
        public uk.nhs.nhsia.datastandards.ecds.CriticalCareDischargeTimeType xgetCriticalCareDischargeTime()
        {
            synchronized (monitor())
            {
                check_orphaned();
                uk.nhs.nhsia.datastandards.ecds.CriticalCareDischargeTimeType target = null;
                target = (uk.nhs.nhsia.datastandards.ecds.CriticalCareDischargeTimeType)get_store().find_element_user(CRITICALCAREDISCHARGETIME$2, 0);
                return target;
            }
        }
        
        /**
         * Sets the "CriticalCareDischargeTime" element
         */
        public void setCriticalCareDischargeTime(java.util.Calendar criticalCareDischargeTime)
        {
            synchronized (monitor())
            {
                check_orphaned();
                org.apache.xmlbeans.SimpleValue target = null;
                target = (org.apache.xmlbeans.SimpleValue)get_store().find_element_user(CRITICALCAREDISCHARGETIME$2, 0);
                if (target == null)
                {
                    target = (org.apache.xmlbeans.SimpleValue)get_store().add_element_user(CRITICALCAREDISCHARGETIME$2);
                }
                target.setCalendarValue(criticalCareDischargeTime);
            }
        }
        
        /**
         * Sets (as xml) the "CriticalCareDischargeTime" element
         */
        public void xsetCriticalCareDischargeTime(uk.nhs.nhsia.datastandards.ecds.CriticalCareDischargeTimeType criticalCareDischargeTime)
        {
            synchronized (monitor())
            {
                check_orphaned();
                uk.nhs.nhsia.datastandards.ecds.CriticalCareDischargeTimeType target = null;
                target = (uk.nhs.nhsia.datastandards.ecds.CriticalCareDischargeTimeType)get_store().find_element_user(CRITICALCAREDISCHARGETIME$2, 0);
                if (target == null)
                {
                    target = (uk.nhs.nhsia.datastandards.ecds.CriticalCareDischargeTimeType)get_store().add_element_user(CRITICALCAREDISCHARGETIME$2);
                }
                target.set(criticalCareDischargeTime);
            }
        }
    }
}
