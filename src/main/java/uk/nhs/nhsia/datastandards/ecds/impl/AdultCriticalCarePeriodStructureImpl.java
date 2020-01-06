/*
 * XML Type:  AdultCriticalCarePeriod_Structure
 * Namespace: http://www.nhsia.nhs.uk/DataStandards/XMLschema/CDS/ns
 * Java type: uk.nhs.nhsia.datastandards.ecds.AdultCriticalCarePeriodStructure
 *
 * Automatically generated - do not modify.
 */
package uk.nhs.nhsia.datastandards.ecds.impl;
/**
 * An XML AdultCriticalCarePeriod_Structure(@http://www.nhsia.nhs.uk/DataStandards/XMLschema/CDS/ns).
 *
 * This is a complex type.
 */
public class AdultCriticalCarePeriodStructureImpl extends org.apache.xmlbeans.impl.values.XmlComplexContentImpl implements uk.nhs.nhsia.datastandards.ecds.AdultCriticalCarePeriodStructure
{
    private static final long serialVersionUID = 1L;
    
    public AdultCriticalCarePeriodStructureImpl(org.apache.xmlbeans.SchemaType sType)
    {
        super(sType);
    }
    
    private static final javax.xml.namespace.QName ACCADMISSIONCHARACTERISTICS$0 = 
        new javax.xml.namespace.QName("http://www.nhsia.nhs.uk/DataStandards/XMLschema/CDS/ns", "ACC_AdmissionCharacteristics");
    private static final javax.xml.namespace.QName ACCCAREACTIVITYGROUP$2 = 
        new javax.xml.namespace.QName("http://www.nhsia.nhs.uk/DataStandards/XMLschema/CDS/ns", "ACC_CareActivityGroup");
    private static final javax.xml.namespace.QName ACCDISCHARGECHARACTERISTICS$4 = 
        new javax.xml.namespace.QName("http://www.nhsia.nhs.uk/DataStandards/XMLschema/CDS/ns", "ACC_DischargeCharacteristics");
    private static final javax.xml.namespace.QName ADULTCRITICALCARESTRUCTURE$6 = 
        new javax.xml.namespace.QName("", "AdultCriticalCareStructure");
    
    
    /**
     * Gets the "ACC_AdmissionCharacteristics" element
     */
    public uk.nhs.nhsia.datastandards.ecds.AdultCriticalCarePeriodStructure.ACCAdmissionCharacteristics getACCAdmissionCharacteristics()
    {
        synchronized (monitor())
        {
            check_orphaned();
            uk.nhs.nhsia.datastandards.ecds.AdultCriticalCarePeriodStructure.ACCAdmissionCharacteristics target = null;
            target = (uk.nhs.nhsia.datastandards.ecds.AdultCriticalCarePeriodStructure.ACCAdmissionCharacteristics)get_store().find_element_user(ACCADMISSIONCHARACTERISTICS$0, 0);
            if (target == null)
            {
                return null;
            }
            return target;
        }
    }
    
    /**
     * Sets the "ACC_AdmissionCharacteristics" element
     */
    public void setACCAdmissionCharacteristics(uk.nhs.nhsia.datastandards.ecds.AdultCriticalCarePeriodStructure.ACCAdmissionCharacteristics accAdmissionCharacteristics)
    {
        generatedSetterHelperImpl(accAdmissionCharacteristics, ACCADMISSIONCHARACTERISTICS$0, 0, org.apache.xmlbeans.impl.values.XmlObjectBase.KIND_SETTERHELPER_SINGLETON);
    }
    
    /**
     * Appends and returns a new empty "ACC_AdmissionCharacteristics" element
     */
    public uk.nhs.nhsia.datastandards.ecds.AdultCriticalCarePeriodStructure.ACCAdmissionCharacteristics addNewACCAdmissionCharacteristics()
    {
        synchronized (monitor())
        {
            check_orphaned();
            uk.nhs.nhsia.datastandards.ecds.AdultCriticalCarePeriodStructure.ACCAdmissionCharacteristics target = null;
            target = (uk.nhs.nhsia.datastandards.ecds.AdultCriticalCarePeriodStructure.ACCAdmissionCharacteristics)get_store().add_element_user(ACCADMISSIONCHARACTERISTICS$0);
            return target;
        }
    }
    
    /**
     * Gets the "ACC_CareActivityGroup" element
     */
    public uk.nhs.nhsia.datastandards.ecds.AdultCriticalCarePeriodStructure.ACCCareActivityGroup getACCCareActivityGroup()
    {
        synchronized (monitor())
        {
            check_orphaned();
            uk.nhs.nhsia.datastandards.ecds.AdultCriticalCarePeriodStructure.ACCCareActivityGroup target = null;
            target = (uk.nhs.nhsia.datastandards.ecds.AdultCriticalCarePeriodStructure.ACCCareActivityGroup)get_store().find_element_user(ACCCAREACTIVITYGROUP$2, 0);
            if (target == null)
            {
                return null;
            }
            return target;
        }
    }
    
    /**
     * Sets the "ACC_CareActivityGroup" element
     */
    public void setACCCareActivityGroup(uk.nhs.nhsia.datastandards.ecds.AdultCriticalCarePeriodStructure.ACCCareActivityGroup accCareActivityGroup)
    {
        generatedSetterHelperImpl(accCareActivityGroup, ACCCAREACTIVITYGROUP$2, 0, org.apache.xmlbeans.impl.values.XmlObjectBase.KIND_SETTERHELPER_SINGLETON);
    }
    
    /**
     * Appends and returns a new empty "ACC_CareActivityGroup" element
     */
    public uk.nhs.nhsia.datastandards.ecds.AdultCriticalCarePeriodStructure.ACCCareActivityGroup addNewACCCareActivityGroup()
    {
        synchronized (monitor())
        {
            check_orphaned();
            uk.nhs.nhsia.datastandards.ecds.AdultCriticalCarePeriodStructure.ACCCareActivityGroup target = null;
            target = (uk.nhs.nhsia.datastandards.ecds.AdultCriticalCarePeriodStructure.ACCCareActivityGroup)get_store().add_element_user(ACCCAREACTIVITYGROUP$2);
            return target;
        }
    }
    
    /**
     * Gets the "ACC_DischargeCharacteristics" element
     */
    public uk.nhs.nhsia.datastandards.ecds.AdultCriticalCarePeriodStructure.ACCDischargeCharacteristics getACCDischargeCharacteristics()
    {
        synchronized (monitor())
        {
            check_orphaned();
            uk.nhs.nhsia.datastandards.ecds.AdultCriticalCarePeriodStructure.ACCDischargeCharacteristics target = null;
            target = (uk.nhs.nhsia.datastandards.ecds.AdultCriticalCarePeriodStructure.ACCDischargeCharacteristics)get_store().find_element_user(ACCDISCHARGECHARACTERISTICS$4, 0);
            if (target == null)
            {
                return null;
            }
            return target;
        }
    }
    
    /**
     * True if has "ACC_DischargeCharacteristics" element
     */
    public boolean isSetACCDischargeCharacteristics()
    {
        synchronized (monitor())
        {
            check_orphaned();
            return get_store().count_elements(ACCDISCHARGECHARACTERISTICS$4) != 0;
        }
    }
    
    /**
     * Sets the "ACC_DischargeCharacteristics" element
     */
    public void setACCDischargeCharacteristics(uk.nhs.nhsia.datastandards.ecds.AdultCriticalCarePeriodStructure.ACCDischargeCharacteristics accDischargeCharacteristics)
    {
        generatedSetterHelperImpl(accDischargeCharacteristics, ACCDISCHARGECHARACTERISTICS$4, 0, org.apache.xmlbeans.impl.values.XmlObjectBase.KIND_SETTERHELPER_SINGLETON);
    }
    
    /**
     * Appends and returns a new empty "ACC_DischargeCharacteristics" element
     */
    public uk.nhs.nhsia.datastandards.ecds.AdultCriticalCarePeriodStructure.ACCDischargeCharacteristics addNewACCDischargeCharacteristics()
    {
        synchronized (monitor())
        {
            check_orphaned();
            uk.nhs.nhsia.datastandards.ecds.AdultCriticalCarePeriodStructure.ACCDischargeCharacteristics target = null;
            target = (uk.nhs.nhsia.datastandards.ecds.AdultCriticalCarePeriodStructure.ACCDischargeCharacteristics)get_store().add_element_user(ACCDISCHARGECHARACTERISTICS$4);
            return target;
        }
    }
    
    /**
     * Unsets the "ACC_DischargeCharacteristics" element
     */
    public void unsetACCDischargeCharacteristics()
    {
        synchronized (monitor())
        {
            check_orphaned();
            get_store().remove_element(ACCDISCHARGECHARACTERISTICS$4, 0);
        }
    }
    
    /**
     * Gets the "AdultCriticalCareStructure" attribute
     */
    public uk.nhs.nhsia.datastandards.ecds.CriticalCareUnitFunctionAdultType.Enum getAdultCriticalCareStructure()
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.SimpleValue target = null;
            target = (org.apache.xmlbeans.SimpleValue)get_store().find_attribute_user(ADULTCRITICALCARESTRUCTURE$6);
            if (target == null)
            {
                return null;
            }
            return (uk.nhs.nhsia.datastandards.ecds.CriticalCareUnitFunctionAdultType.Enum)target.getEnumValue();
        }
    }
    
    /**
     * Gets (as xml) the "AdultCriticalCareStructure" attribute
     */
    public uk.nhs.nhsia.datastandards.ecds.CriticalCareUnitFunctionAdultType xgetAdultCriticalCareStructure()
    {
        synchronized (monitor())
        {
            check_orphaned();
            uk.nhs.nhsia.datastandards.ecds.CriticalCareUnitFunctionAdultType target = null;
            target = (uk.nhs.nhsia.datastandards.ecds.CriticalCareUnitFunctionAdultType)get_store().find_attribute_user(ADULTCRITICALCARESTRUCTURE$6);
            return target;
        }
    }
    
    /**
     * Sets the "AdultCriticalCareStructure" attribute
     */
    public void setAdultCriticalCareStructure(uk.nhs.nhsia.datastandards.ecds.CriticalCareUnitFunctionAdultType.Enum adultCriticalCareStructure)
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.SimpleValue target = null;
            target = (org.apache.xmlbeans.SimpleValue)get_store().find_attribute_user(ADULTCRITICALCARESTRUCTURE$6);
            if (target == null)
            {
                target = (org.apache.xmlbeans.SimpleValue)get_store().add_attribute_user(ADULTCRITICALCARESTRUCTURE$6);
            }
            target.setEnumValue(adultCriticalCareStructure);
        }
    }
    
    /**
     * Sets (as xml) the "AdultCriticalCareStructure" attribute
     */
    public void xsetAdultCriticalCareStructure(uk.nhs.nhsia.datastandards.ecds.CriticalCareUnitFunctionAdultType adultCriticalCareStructure)
    {
        synchronized (monitor())
        {
            check_orphaned();
            uk.nhs.nhsia.datastandards.ecds.CriticalCareUnitFunctionAdultType target = null;
            target = (uk.nhs.nhsia.datastandards.ecds.CriticalCareUnitFunctionAdultType)get_store().find_attribute_user(ADULTCRITICALCARESTRUCTURE$6);
            if (target == null)
            {
                target = (uk.nhs.nhsia.datastandards.ecds.CriticalCareUnitFunctionAdultType)get_store().add_attribute_user(ADULTCRITICALCARESTRUCTURE$6);
            }
            target.set(adultCriticalCareStructure);
        }
    }
    /**
     * An XML ACC_AdmissionCharacteristics(@http://www.nhsia.nhs.uk/DataStandards/XMLschema/CDS/ns).
     *
     * This is a complex type.
     */
    public static class ACCAdmissionCharacteristicsImpl extends org.apache.xmlbeans.impl.values.XmlComplexContentImpl implements uk.nhs.nhsia.datastandards.ecds.AdultCriticalCarePeriodStructure.ACCAdmissionCharacteristics
    {
        private static final long serialVersionUID = 1L;
        
        public ACCAdmissionCharacteristicsImpl(org.apache.xmlbeans.SchemaType sType)
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
        private static final javax.xml.namespace.QName CRITICALCAREUNITBEDCONFIGURATION$8 = 
            new javax.xml.namespace.QName("http://www.nhsia.nhs.uk/DataStandards/XMLschema/CDS/ns", "CriticalCareUnitBedConfiguration");
        private static final javax.xml.namespace.QName CRITICALCAREADMISSIONSOURCE$10 = 
            new javax.xml.namespace.QName("http://www.nhsia.nhs.uk/DataStandards/XMLschema/CDS/ns", "CriticalCareAdmissionSource");
        private static final javax.xml.namespace.QName CRITICALCARESOURCELOCATION$12 = 
            new javax.xml.namespace.QName("http://www.nhsia.nhs.uk/DataStandards/XMLschema/CDS/ns", "CriticalCareSourceLocation");
        private static final javax.xml.namespace.QName CRITICALCAREADMISSIONTYPE$14 = 
            new javax.xml.namespace.QName("http://www.nhsia.nhs.uk/DataStandards/XMLschema/CDS/ns", "CriticalCareAdmissionType");
        
        
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
         * True if has "CriticalCareStartTime" element
         */
        public boolean isSetCriticalCareStartTime()
        {
            synchronized (monitor())
            {
                check_orphaned();
                return get_store().count_elements(CRITICALCARESTARTTIME$4) != 0;
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
         * Unsets the "CriticalCareStartTime" element
         */
        public void unsetCriticalCareStartTime()
        {
            synchronized (monitor())
            {
                check_orphaned();
                get_store().remove_element(CRITICALCARESTARTTIME$4, 0);
            }
        }
        
        /**
         * Gets the "CriticalCareUnitFunction" element
         */
        public uk.nhs.nhsia.datastandards.ecds.CriticalCareUnitFunctionAdultType.Enum getCriticalCareUnitFunction()
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
                return (uk.nhs.nhsia.datastandards.ecds.CriticalCareUnitFunctionAdultType.Enum)target.getEnumValue();
            }
        }
        
        /**
         * Gets (as xml) the "CriticalCareUnitFunction" element
         */
        public uk.nhs.nhsia.datastandards.ecds.CriticalCareUnitFunctionAdultType xgetCriticalCareUnitFunction()
        {
            synchronized (monitor())
            {
                check_orphaned();
                uk.nhs.nhsia.datastandards.ecds.CriticalCareUnitFunctionAdultType target = null;
                target = (uk.nhs.nhsia.datastandards.ecds.CriticalCareUnitFunctionAdultType)get_store().find_element_user(CRITICALCAREUNITFUNCTION$6, 0);
                return target;
            }
        }
        
        /**
         * Sets the "CriticalCareUnitFunction" element
         */
        public void setCriticalCareUnitFunction(uk.nhs.nhsia.datastandards.ecds.CriticalCareUnitFunctionAdultType.Enum criticalCareUnitFunction)
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
        public void xsetCriticalCareUnitFunction(uk.nhs.nhsia.datastandards.ecds.CriticalCareUnitFunctionAdultType criticalCareUnitFunction)
        {
            synchronized (monitor())
            {
                check_orphaned();
                uk.nhs.nhsia.datastandards.ecds.CriticalCareUnitFunctionAdultType target = null;
                target = (uk.nhs.nhsia.datastandards.ecds.CriticalCareUnitFunctionAdultType)get_store().find_element_user(CRITICALCAREUNITFUNCTION$6, 0);
                if (target == null)
                {
                    target = (uk.nhs.nhsia.datastandards.ecds.CriticalCareUnitFunctionAdultType)get_store().add_element_user(CRITICALCAREUNITFUNCTION$6);
                }
                target.set(criticalCareUnitFunction);
            }
        }
        
        /**
         * Gets the "CriticalCareUnitBedConfiguration" element
         */
        public uk.nhs.nhsia.datastandards.ecds.CriticalCareUnitBedConfigurationType.Enum getCriticalCareUnitBedConfiguration()
        {
            synchronized (monitor())
            {
                check_orphaned();
                org.apache.xmlbeans.SimpleValue target = null;
                target = (org.apache.xmlbeans.SimpleValue)get_store().find_element_user(CRITICALCAREUNITBEDCONFIGURATION$8, 0);
                if (target == null)
                {
                    return null;
                }
                return (uk.nhs.nhsia.datastandards.ecds.CriticalCareUnitBedConfigurationType.Enum)target.getEnumValue();
            }
        }
        
        /**
         * Gets (as xml) the "CriticalCareUnitBedConfiguration" element
         */
        public uk.nhs.nhsia.datastandards.ecds.CriticalCareUnitBedConfigurationType xgetCriticalCareUnitBedConfiguration()
        {
            synchronized (monitor())
            {
                check_orphaned();
                uk.nhs.nhsia.datastandards.ecds.CriticalCareUnitBedConfigurationType target = null;
                target = (uk.nhs.nhsia.datastandards.ecds.CriticalCareUnitBedConfigurationType)get_store().find_element_user(CRITICALCAREUNITBEDCONFIGURATION$8, 0);
                return target;
            }
        }
        
        /**
         * True if has "CriticalCareUnitBedConfiguration" element
         */
        public boolean isSetCriticalCareUnitBedConfiguration()
        {
            synchronized (monitor())
            {
                check_orphaned();
                return get_store().count_elements(CRITICALCAREUNITBEDCONFIGURATION$8) != 0;
            }
        }
        
        /**
         * Sets the "CriticalCareUnitBedConfiguration" element
         */
        public void setCriticalCareUnitBedConfiguration(uk.nhs.nhsia.datastandards.ecds.CriticalCareUnitBedConfigurationType.Enum criticalCareUnitBedConfiguration)
        {
            synchronized (monitor())
            {
                check_orphaned();
                org.apache.xmlbeans.SimpleValue target = null;
                target = (org.apache.xmlbeans.SimpleValue)get_store().find_element_user(CRITICALCAREUNITBEDCONFIGURATION$8, 0);
                if (target == null)
                {
                    target = (org.apache.xmlbeans.SimpleValue)get_store().add_element_user(CRITICALCAREUNITBEDCONFIGURATION$8);
                }
                target.setEnumValue(criticalCareUnitBedConfiguration);
            }
        }
        
        /**
         * Sets (as xml) the "CriticalCareUnitBedConfiguration" element
         */
        public void xsetCriticalCareUnitBedConfiguration(uk.nhs.nhsia.datastandards.ecds.CriticalCareUnitBedConfigurationType criticalCareUnitBedConfiguration)
        {
            synchronized (monitor())
            {
                check_orphaned();
                uk.nhs.nhsia.datastandards.ecds.CriticalCareUnitBedConfigurationType target = null;
                target = (uk.nhs.nhsia.datastandards.ecds.CriticalCareUnitBedConfigurationType)get_store().find_element_user(CRITICALCAREUNITBEDCONFIGURATION$8, 0);
                if (target == null)
                {
                    target = (uk.nhs.nhsia.datastandards.ecds.CriticalCareUnitBedConfigurationType)get_store().add_element_user(CRITICALCAREUNITBEDCONFIGURATION$8);
                }
                target.set(criticalCareUnitBedConfiguration);
            }
        }
        
        /**
         * Unsets the "CriticalCareUnitBedConfiguration" element
         */
        public void unsetCriticalCareUnitBedConfiguration()
        {
            synchronized (monitor())
            {
                check_orphaned();
                get_store().remove_element(CRITICALCAREUNITBEDCONFIGURATION$8, 0);
            }
        }
        
        /**
         * Gets the "CriticalCareAdmissionSource" element
         */
        public uk.nhs.nhsia.datastandards.ecds.CriticalCareAdmissionSourceType.Enum getCriticalCareAdmissionSource()
        {
            synchronized (monitor())
            {
                check_orphaned();
                org.apache.xmlbeans.SimpleValue target = null;
                target = (org.apache.xmlbeans.SimpleValue)get_store().find_element_user(CRITICALCAREADMISSIONSOURCE$10, 0);
                if (target == null)
                {
                    return null;
                }
                return (uk.nhs.nhsia.datastandards.ecds.CriticalCareAdmissionSourceType.Enum)target.getEnumValue();
            }
        }
        
        /**
         * Gets (as xml) the "CriticalCareAdmissionSource" element
         */
        public uk.nhs.nhsia.datastandards.ecds.CriticalCareAdmissionSourceType xgetCriticalCareAdmissionSource()
        {
            synchronized (monitor())
            {
                check_orphaned();
                uk.nhs.nhsia.datastandards.ecds.CriticalCareAdmissionSourceType target = null;
                target = (uk.nhs.nhsia.datastandards.ecds.CriticalCareAdmissionSourceType)get_store().find_element_user(CRITICALCAREADMISSIONSOURCE$10, 0);
                return target;
            }
        }
        
        /**
         * True if has "CriticalCareAdmissionSource" element
         */
        public boolean isSetCriticalCareAdmissionSource()
        {
            synchronized (monitor())
            {
                check_orphaned();
                return get_store().count_elements(CRITICALCAREADMISSIONSOURCE$10) != 0;
            }
        }
        
        /**
         * Sets the "CriticalCareAdmissionSource" element
         */
        public void setCriticalCareAdmissionSource(uk.nhs.nhsia.datastandards.ecds.CriticalCareAdmissionSourceType.Enum criticalCareAdmissionSource)
        {
            synchronized (monitor())
            {
                check_orphaned();
                org.apache.xmlbeans.SimpleValue target = null;
                target = (org.apache.xmlbeans.SimpleValue)get_store().find_element_user(CRITICALCAREADMISSIONSOURCE$10, 0);
                if (target == null)
                {
                    target = (org.apache.xmlbeans.SimpleValue)get_store().add_element_user(CRITICALCAREADMISSIONSOURCE$10);
                }
                target.setEnumValue(criticalCareAdmissionSource);
            }
        }
        
        /**
         * Sets (as xml) the "CriticalCareAdmissionSource" element
         */
        public void xsetCriticalCareAdmissionSource(uk.nhs.nhsia.datastandards.ecds.CriticalCareAdmissionSourceType criticalCareAdmissionSource)
        {
            synchronized (monitor())
            {
                check_orphaned();
                uk.nhs.nhsia.datastandards.ecds.CriticalCareAdmissionSourceType target = null;
                target = (uk.nhs.nhsia.datastandards.ecds.CriticalCareAdmissionSourceType)get_store().find_element_user(CRITICALCAREADMISSIONSOURCE$10, 0);
                if (target == null)
                {
                    target = (uk.nhs.nhsia.datastandards.ecds.CriticalCareAdmissionSourceType)get_store().add_element_user(CRITICALCAREADMISSIONSOURCE$10);
                }
                target.set(criticalCareAdmissionSource);
            }
        }
        
        /**
         * Unsets the "CriticalCareAdmissionSource" element
         */
        public void unsetCriticalCareAdmissionSource()
        {
            synchronized (monitor())
            {
                check_orphaned();
                get_store().remove_element(CRITICALCAREADMISSIONSOURCE$10, 0);
            }
        }
        
        /**
         * Gets the "CriticalCareSourceLocation" element
         */
        public uk.nhs.nhsia.datastandards.ecds.CriticalCareSourceLocationType.Enum getCriticalCareSourceLocation()
        {
            synchronized (monitor())
            {
                check_orphaned();
                org.apache.xmlbeans.SimpleValue target = null;
                target = (org.apache.xmlbeans.SimpleValue)get_store().find_element_user(CRITICALCARESOURCELOCATION$12, 0);
                if (target == null)
                {
                    return null;
                }
                return (uk.nhs.nhsia.datastandards.ecds.CriticalCareSourceLocationType.Enum)target.getEnumValue();
            }
        }
        
        /**
         * Gets (as xml) the "CriticalCareSourceLocation" element
         */
        public uk.nhs.nhsia.datastandards.ecds.CriticalCareSourceLocationType xgetCriticalCareSourceLocation()
        {
            synchronized (monitor())
            {
                check_orphaned();
                uk.nhs.nhsia.datastandards.ecds.CriticalCareSourceLocationType target = null;
                target = (uk.nhs.nhsia.datastandards.ecds.CriticalCareSourceLocationType)get_store().find_element_user(CRITICALCARESOURCELOCATION$12, 0);
                return target;
            }
        }
        
        /**
         * True if has "CriticalCareSourceLocation" element
         */
        public boolean isSetCriticalCareSourceLocation()
        {
            synchronized (monitor())
            {
                check_orphaned();
                return get_store().count_elements(CRITICALCARESOURCELOCATION$12) != 0;
            }
        }
        
        /**
         * Sets the "CriticalCareSourceLocation" element
         */
        public void setCriticalCareSourceLocation(uk.nhs.nhsia.datastandards.ecds.CriticalCareSourceLocationType.Enum criticalCareSourceLocation)
        {
            synchronized (monitor())
            {
                check_orphaned();
                org.apache.xmlbeans.SimpleValue target = null;
                target = (org.apache.xmlbeans.SimpleValue)get_store().find_element_user(CRITICALCARESOURCELOCATION$12, 0);
                if (target == null)
                {
                    target = (org.apache.xmlbeans.SimpleValue)get_store().add_element_user(CRITICALCARESOURCELOCATION$12);
                }
                target.setEnumValue(criticalCareSourceLocation);
            }
        }
        
        /**
         * Sets (as xml) the "CriticalCareSourceLocation" element
         */
        public void xsetCriticalCareSourceLocation(uk.nhs.nhsia.datastandards.ecds.CriticalCareSourceLocationType criticalCareSourceLocation)
        {
            synchronized (monitor())
            {
                check_orphaned();
                uk.nhs.nhsia.datastandards.ecds.CriticalCareSourceLocationType target = null;
                target = (uk.nhs.nhsia.datastandards.ecds.CriticalCareSourceLocationType)get_store().find_element_user(CRITICALCARESOURCELOCATION$12, 0);
                if (target == null)
                {
                    target = (uk.nhs.nhsia.datastandards.ecds.CriticalCareSourceLocationType)get_store().add_element_user(CRITICALCARESOURCELOCATION$12);
                }
                target.set(criticalCareSourceLocation);
            }
        }
        
        /**
         * Unsets the "CriticalCareSourceLocation" element
         */
        public void unsetCriticalCareSourceLocation()
        {
            synchronized (monitor())
            {
                check_orphaned();
                get_store().remove_element(CRITICALCARESOURCELOCATION$12, 0);
            }
        }
        
        /**
         * Gets the "CriticalCareAdmissionType" element
         */
        public uk.nhs.nhsia.datastandards.ecds.CriticalCareAdmissionTypeType.Enum getCriticalCareAdmissionType()
        {
            synchronized (monitor())
            {
                check_orphaned();
                org.apache.xmlbeans.SimpleValue target = null;
                target = (org.apache.xmlbeans.SimpleValue)get_store().find_element_user(CRITICALCAREADMISSIONTYPE$14, 0);
                if (target == null)
                {
                    return null;
                }
                return (uk.nhs.nhsia.datastandards.ecds.CriticalCareAdmissionTypeType.Enum)target.getEnumValue();
            }
        }
        
        /**
         * Gets (as xml) the "CriticalCareAdmissionType" element
         */
        public uk.nhs.nhsia.datastandards.ecds.CriticalCareAdmissionTypeType xgetCriticalCareAdmissionType()
        {
            synchronized (monitor())
            {
                check_orphaned();
                uk.nhs.nhsia.datastandards.ecds.CriticalCareAdmissionTypeType target = null;
                target = (uk.nhs.nhsia.datastandards.ecds.CriticalCareAdmissionTypeType)get_store().find_element_user(CRITICALCAREADMISSIONTYPE$14, 0);
                return target;
            }
        }
        
        /**
         * True if has "CriticalCareAdmissionType" element
         */
        public boolean isSetCriticalCareAdmissionType()
        {
            synchronized (monitor())
            {
                check_orphaned();
                return get_store().count_elements(CRITICALCAREADMISSIONTYPE$14) != 0;
            }
        }
        
        /**
         * Sets the "CriticalCareAdmissionType" element
         */
        public void setCriticalCareAdmissionType(uk.nhs.nhsia.datastandards.ecds.CriticalCareAdmissionTypeType.Enum criticalCareAdmissionType)
        {
            synchronized (monitor())
            {
                check_orphaned();
                org.apache.xmlbeans.SimpleValue target = null;
                target = (org.apache.xmlbeans.SimpleValue)get_store().find_element_user(CRITICALCAREADMISSIONTYPE$14, 0);
                if (target == null)
                {
                    target = (org.apache.xmlbeans.SimpleValue)get_store().add_element_user(CRITICALCAREADMISSIONTYPE$14);
                }
                target.setEnumValue(criticalCareAdmissionType);
            }
        }
        
        /**
         * Sets (as xml) the "CriticalCareAdmissionType" element
         */
        public void xsetCriticalCareAdmissionType(uk.nhs.nhsia.datastandards.ecds.CriticalCareAdmissionTypeType criticalCareAdmissionType)
        {
            synchronized (monitor())
            {
                check_orphaned();
                uk.nhs.nhsia.datastandards.ecds.CriticalCareAdmissionTypeType target = null;
                target = (uk.nhs.nhsia.datastandards.ecds.CriticalCareAdmissionTypeType)get_store().find_element_user(CRITICALCAREADMISSIONTYPE$14, 0);
                if (target == null)
                {
                    target = (uk.nhs.nhsia.datastandards.ecds.CriticalCareAdmissionTypeType)get_store().add_element_user(CRITICALCAREADMISSIONTYPE$14);
                }
                target.set(criticalCareAdmissionType);
            }
        }
        
        /**
         * Unsets the "CriticalCareAdmissionType" element
         */
        public void unsetCriticalCareAdmissionType()
        {
            synchronized (monitor())
            {
                check_orphaned();
                get_store().remove_element(CRITICALCAREADMISSIONTYPE$14, 0);
            }
        }
    }
    /**
     * An XML ACC_CareActivityGroup(@http://www.nhsia.nhs.uk/DataStandards/XMLschema/CDS/ns).
     *
     * This is a complex type.
     */
    public static class ACCCareActivityGroupImpl extends org.apache.xmlbeans.impl.values.XmlComplexContentImpl implements uk.nhs.nhsia.datastandards.ecds.AdultCriticalCarePeriodStructure.ACCCareActivityGroup
    {
        private static final long serialVersionUID = 1L;
        
        public ACCCareActivityGroupImpl(org.apache.xmlbeans.SchemaType sType)
        {
            super(sType);
        }
        
        private static final javax.xml.namespace.QName ADVANCEDRESPIRATORYSUPPORTDAYS$0 = 
            new javax.xml.namespace.QName("http://www.nhsia.nhs.uk/DataStandards/XMLschema/CDS/ns", "AdvancedRespiratorySupportDays");
        private static final javax.xml.namespace.QName BASICRESPIRATORYSUPPORTDAYS$2 = 
            new javax.xml.namespace.QName("http://www.nhsia.nhs.uk/DataStandards/XMLschema/CDS/ns", "BasicRespiratorySupportDays");
        private static final javax.xml.namespace.QName ADVANCEDCARDIOVASCULARSUPPORTDAYS$4 = 
            new javax.xml.namespace.QName("http://www.nhsia.nhs.uk/DataStandards/XMLschema/CDS/ns", "AdvancedCardiovascularSupportDays");
        private static final javax.xml.namespace.QName BASICCARDIOVASCULARSUPPORTDAYS$6 = 
            new javax.xml.namespace.QName("http://www.nhsia.nhs.uk/DataStandards/XMLschema/CDS/ns", "BasicCardiovascularSupportDays");
        private static final javax.xml.namespace.QName RENALSUPPORTDAYS$8 = 
            new javax.xml.namespace.QName("http://www.nhsia.nhs.uk/DataStandards/XMLschema/CDS/ns", "RenalSupportDays");
        private static final javax.xml.namespace.QName NEUROLOGICALSUPPORTDAYS$10 = 
            new javax.xml.namespace.QName("http://www.nhsia.nhs.uk/DataStandards/XMLschema/CDS/ns", "NeurologicalSupportDays");
        private static final javax.xml.namespace.QName GASTROINTESTINALSUPPORTDAYS$12 = 
            new javax.xml.namespace.QName("http://www.nhsia.nhs.uk/DataStandards/XMLschema/CDS/ns", "GastroIntestinalSupportDays");
        private static final javax.xml.namespace.QName DERMATOLOGICALSUPPORTDAYS$14 = 
            new javax.xml.namespace.QName("http://www.nhsia.nhs.uk/DataStandards/XMLschema/CDS/ns", "DermatologicalSupportDays");
        private static final javax.xml.namespace.QName LIVERSUPPORTDAYS$16 = 
            new javax.xml.namespace.QName("http://www.nhsia.nhs.uk/DataStandards/XMLschema/CDS/ns", "LiverSupportDays");
        private static final javax.xml.namespace.QName ORGANSUPPORTMAXIMUM$18 = 
            new javax.xml.namespace.QName("http://www.nhsia.nhs.uk/DataStandards/XMLschema/CDS/ns", "OrganSupportMaximum");
        private static final javax.xml.namespace.QName CRITICALCARELEVEL2DAYS$20 = 
            new javax.xml.namespace.QName("http://www.nhsia.nhs.uk/DataStandards/XMLschema/CDS/ns", "CriticalCareLevel2Days");
        private static final javax.xml.namespace.QName CRITICALCARELEVEL3DAYS$22 = 
            new javax.xml.namespace.QName("http://www.nhsia.nhs.uk/DataStandards/XMLschema/CDS/ns", "CriticalCareLevel3Days");
        
        
        /**
         * Gets the "AdvancedRespiratorySupportDays" element
         */
        public int getAdvancedRespiratorySupportDays()
        {
            synchronized (monitor())
            {
                check_orphaned();
                org.apache.xmlbeans.SimpleValue target = null;
                target = (org.apache.xmlbeans.SimpleValue)get_store().find_element_user(ADVANCEDRESPIRATORYSUPPORTDAYS$0, 0);
                if (target == null)
                {
                    return 0;
                }
                return target.getIntValue();
            }
        }
        
        /**
         * Gets (as xml) the "AdvancedRespiratorySupportDays" element
         */
        public uk.nhs.nhsia.datastandards.ecds.AdvancedRespiratorySupportDaysType xgetAdvancedRespiratorySupportDays()
        {
            synchronized (monitor())
            {
                check_orphaned();
                uk.nhs.nhsia.datastandards.ecds.AdvancedRespiratorySupportDaysType target = null;
                target = (uk.nhs.nhsia.datastandards.ecds.AdvancedRespiratorySupportDaysType)get_store().find_element_user(ADVANCEDRESPIRATORYSUPPORTDAYS$0, 0);
                return target;
            }
        }
        
        /**
         * True if has "AdvancedRespiratorySupportDays" element
         */
        public boolean isSetAdvancedRespiratorySupportDays()
        {
            synchronized (monitor())
            {
                check_orphaned();
                return get_store().count_elements(ADVANCEDRESPIRATORYSUPPORTDAYS$0) != 0;
            }
        }
        
        /**
         * Sets the "AdvancedRespiratorySupportDays" element
         */
        public void setAdvancedRespiratorySupportDays(int advancedRespiratorySupportDays)
        {
            synchronized (monitor())
            {
                check_orphaned();
                org.apache.xmlbeans.SimpleValue target = null;
                target = (org.apache.xmlbeans.SimpleValue)get_store().find_element_user(ADVANCEDRESPIRATORYSUPPORTDAYS$0, 0);
                if (target == null)
                {
                    target = (org.apache.xmlbeans.SimpleValue)get_store().add_element_user(ADVANCEDRESPIRATORYSUPPORTDAYS$0);
                }
                target.setIntValue(advancedRespiratorySupportDays);
            }
        }
        
        /**
         * Sets (as xml) the "AdvancedRespiratorySupportDays" element
         */
        public void xsetAdvancedRespiratorySupportDays(uk.nhs.nhsia.datastandards.ecds.AdvancedRespiratorySupportDaysType advancedRespiratorySupportDays)
        {
            synchronized (monitor())
            {
                check_orphaned();
                uk.nhs.nhsia.datastandards.ecds.AdvancedRespiratorySupportDaysType target = null;
                target = (uk.nhs.nhsia.datastandards.ecds.AdvancedRespiratorySupportDaysType)get_store().find_element_user(ADVANCEDRESPIRATORYSUPPORTDAYS$0, 0);
                if (target == null)
                {
                    target = (uk.nhs.nhsia.datastandards.ecds.AdvancedRespiratorySupportDaysType)get_store().add_element_user(ADVANCEDRESPIRATORYSUPPORTDAYS$0);
                }
                target.set(advancedRespiratorySupportDays);
            }
        }
        
        /**
         * Unsets the "AdvancedRespiratorySupportDays" element
         */
        public void unsetAdvancedRespiratorySupportDays()
        {
            synchronized (monitor())
            {
                check_orphaned();
                get_store().remove_element(ADVANCEDRESPIRATORYSUPPORTDAYS$0, 0);
            }
        }
        
        /**
         * Gets the "BasicRespiratorySupportDays" element
         */
        public int getBasicRespiratorySupportDays()
        {
            synchronized (monitor())
            {
                check_orphaned();
                org.apache.xmlbeans.SimpleValue target = null;
                target = (org.apache.xmlbeans.SimpleValue)get_store().find_element_user(BASICRESPIRATORYSUPPORTDAYS$2, 0);
                if (target == null)
                {
                    return 0;
                }
                return target.getIntValue();
            }
        }
        
        /**
         * Gets (as xml) the "BasicRespiratorySupportDays" element
         */
        public uk.nhs.nhsia.datastandards.ecds.BasicRespiratorySupportDaysType xgetBasicRespiratorySupportDays()
        {
            synchronized (monitor())
            {
                check_orphaned();
                uk.nhs.nhsia.datastandards.ecds.BasicRespiratorySupportDaysType target = null;
                target = (uk.nhs.nhsia.datastandards.ecds.BasicRespiratorySupportDaysType)get_store().find_element_user(BASICRESPIRATORYSUPPORTDAYS$2, 0);
                return target;
            }
        }
        
        /**
         * True if has "BasicRespiratorySupportDays" element
         */
        public boolean isSetBasicRespiratorySupportDays()
        {
            synchronized (monitor())
            {
                check_orphaned();
                return get_store().count_elements(BASICRESPIRATORYSUPPORTDAYS$2) != 0;
            }
        }
        
        /**
         * Sets the "BasicRespiratorySupportDays" element
         */
        public void setBasicRespiratorySupportDays(int basicRespiratorySupportDays)
        {
            synchronized (monitor())
            {
                check_orphaned();
                org.apache.xmlbeans.SimpleValue target = null;
                target = (org.apache.xmlbeans.SimpleValue)get_store().find_element_user(BASICRESPIRATORYSUPPORTDAYS$2, 0);
                if (target == null)
                {
                    target = (org.apache.xmlbeans.SimpleValue)get_store().add_element_user(BASICRESPIRATORYSUPPORTDAYS$2);
                }
                target.setIntValue(basicRespiratorySupportDays);
            }
        }
        
        /**
         * Sets (as xml) the "BasicRespiratorySupportDays" element
         */
        public void xsetBasicRespiratorySupportDays(uk.nhs.nhsia.datastandards.ecds.BasicRespiratorySupportDaysType basicRespiratorySupportDays)
        {
            synchronized (monitor())
            {
                check_orphaned();
                uk.nhs.nhsia.datastandards.ecds.BasicRespiratorySupportDaysType target = null;
                target = (uk.nhs.nhsia.datastandards.ecds.BasicRespiratorySupportDaysType)get_store().find_element_user(BASICRESPIRATORYSUPPORTDAYS$2, 0);
                if (target == null)
                {
                    target = (uk.nhs.nhsia.datastandards.ecds.BasicRespiratorySupportDaysType)get_store().add_element_user(BASICRESPIRATORYSUPPORTDAYS$2);
                }
                target.set(basicRespiratorySupportDays);
            }
        }
        
        /**
         * Unsets the "BasicRespiratorySupportDays" element
         */
        public void unsetBasicRespiratorySupportDays()
        {
            synchronized (monitor())
            {
                check_orphaned();
                get_store().remove_element(BASICRESPIRATORYSUPPORTDAYS$2, 0);
            }
        }
        
        /**
         * Gets the "AdvancedCardiovascularSupportDays" element
         */
        public int getAdvancedCardiovascularSupportDays()
        {
            synchronized (monitor())
            {
                check_orphaned();
                org.apache.xmlbeans.SimpleValue target = null;
                target = (org.apache.xmlbeans.SimpleValue)get_store().find_element_user(ADVANCEDCARDIOVASCULARSUPPORTDAYS$4, 0);
                if (target == null)
                {
                    return 0;
                }
                return target.getIntValue();
            }
        }
        
        /**
         * Gets (as xml) the "AdvancedCardiovascularSupportDays" element
         */
        public uk.nhs.nhsia.datastandards.ecds.AdvancedCardiovascularSupportDaysType xgetAdvancedCardiovascularSupportDays()
        {
            synchronized (monitor())
            {
                check_orphaned();
                uk.nhs.nhsia.datastandards.ecds.AdvancedCardiovascularSupportDaysType target = null;
                target = (uk.nhs.nhsia.datastandards.ecds.AdvancedCardiovascularSupportDaysType)get_store().find_element_user(ADVANCEDCARDIOVASCULARSUPPORTDAYS$4, 0);
                return target;
            }
        }
        
        /**
         * True if has "AdvancedCardiovascularSupportDays" element
         */
        public boolean isSetAdvancedCardiovascularSupportDays()
        {
            synchronized (monitor())
            {
                check_orphaned();
                return get_store().count_elements(ADVANCEDCARDIOVASCULARSUPPORTDAYS$4) != 0;
            }
        }
        
        /**
         * Sets the "AdvancedCardiovascularSupportDays" element
         */
        public void setAdvancedCardiovascularSupportDays(int advancedCardiovascularSupportDays)
        {
            synchronized (monitor())
            {
                check_orphaned();
                org.apache.xmlbeans.SimpleValue target = null;
                target = (org.apache.xmlbeans.SimpleValue)get_store().find_element_user(ADVANCEDCARDIOVASCULARSUPPORTDAYS$4, 0);
                if (target == null)
                {
                    target = (org.apache.xmlbeans.SimpleValue)get_store().add_element_user(ADVANCEDCARDIOVASCULARSUPPORTDAYS$4);
                }
                target.setIntValue(advancedCardiovascularSupportDays);
            }
        }
        
        /**
         * Sets (as xml) the "AdvancedCardiovascularSupportDays" element
         */
        public void xsetAdvancedCardiovascularSupportDays(uk.nhs.nhsia.datastandards.ecds.AdvancedCardiovascularSupportDaysType advancedCardiovascularSupportDays)
        {
            synchronized (monitor())
            {
                check_orphaned();
                uk.nhs.nhsia.datastandards.ecds.AdvancedCardiovascularSupportDaysType target = null;
                target = (uk.nhs.nhsia.datastandards.ecds.AdvancedCardiovascularSupportDaysType)get_store().find_element_user(ADVANCEDCARDIOVASCULARSUPPORTDAYS$4, 0);
                if (target == null)
                {
                    target = (uk.nhs.nhsia.datastandards.ecds.AdvancedCardiovascularSupportDaysType)get_store().add_element_user(ADVANCEDCARDIOVASCULARSUPPORTDAYS$4);
                }
                target.set(advancedCardiovascularSupportDays);
            }
        }
        
        /**
         * Unsets the "AdvancedCardiovascularSupportDays" element
         */
        public void unsetAdvancedCardiovascularSupportDays()
        {
            synchronized (monitor())
            {
                check_orphaned();
                get_store().remove_element(ADVANCEDCARDIOVASCULARSUPPORTDAYS$4, 0);
            }
        }
        
        /**
         * Gets the "BasicCardiovascularSupportDays" element
         */
        public int getBasicCardiovascularSupportDays()
        {
            synchronized (monitor())
            {
                check_orphaned();
                org.apache.xmlbeans.SimpleValue target = null;
                target = (org.apache.xmlbeans.SimpleValue)get_store().find_element_user(BASICCARDIOVASCULARSUPPORTDAYS$6, 0);
                if (target == null)
                {
                    return 0;
                }
                return target.getIntValue();
            }
        }
        
        /**
         * Gets (as xml) the "BasicCardiovascularSupportDays" element
         */
        public uk.nhs.nhsia.datastandards.ecds.BasicCardiovascularSupportDaysType xgetBasicCardiovascularSupportDays()
        {
            synchronized (monitor())
            {
                check_orphaned();
                uk.nhs.nhsia.datastandards.ecds.BasicCardiovascularSupportDaysType target = null;
                target = (uk.nhs.nhsia.datastandards.ecds.BasicCardiovascularSupportDaysType)get_store().find_element_user(BASICCARDIOVASCULARSUPPORTDAYS$6, 0);
                return target;
            }
        }
        
        /**
         * True if has "BasicCardiovascularSupportDays" element
         */
        public boolean isSetBasicCardiovascularSupportDays()
        {
            synchronized (monitor())
            {
                check_orphaned();
                return get_store().count_elements(BASICCARDIOVASCULARSUPPORTDAYS$6) != 0;
            }
        }
        
        /**
         * Sets the "BasicCardiovascularSupportDays" element
         */
        public void setBasicCardiovascularSupportDays(int basicCardiovascularSupportDays)
        {
            synchronized (monitor())
            {
                check_orphaned();
                org.apache.xmlbeans.SimpleValue target = null;
                target = (org.apache.xmlbeans.SimpleValue)get_store().find_element_user(BASICCARDIOVASCULARSUPPORTDAYS$6, 0);
                if (target == null)
                {
                    target = (org.apache.xmlbeans.SimpleValue)get_store().add_element_user(BASICCARDIOVASCULARSUPPORTDAYS$6);
                }
                target.setIntValue(basicCardiovascularSupportDays);
            }
        }
        
        /**
         * Sets (as xml) the "BasicCardiovascularSupportDays" element
         */
        public void xsetBasicCardiovascularSupportDays(uk.nhs.nhsia.datastandards.ecds.BasicCardiovascularSupportDaysType basicCardiovascularSupportDays)
        {
            synchronized (monitor())
            {
                check_orphaned();
                uk.nhs.nhsia.datastandards.ecds.BasicCardiovascularSupportDaysType target = null;
                target = (uk.nhs.nhsia.datastandards.ecds.BasicCardiovascularSupportDaysType)get_store().find_element_user(BASICCARDIOVASCULARSUPPORTDAYS$6, 0);
                if (target == null)
                {
                    target = (uk.nhs.nhsia.datastandards.ecds.BasicCardiovascularSupportDaysType)get_store().add_element_user(BASICCARDIOVASCULARSUPPORTDAYS$6);
                }
                target.set(basicCardiovascularSupportDays);
            }
        }
        
        /**
         * Unsets the "BasicCardiovascularSupportDays" element
         */
        public void unsetBasicCardiovascularSupportDays()
        {
            synchronized (monitor())
            {
                check_orphaned();
                get_store().remove_element(BASICCARDIOVASCULARSUPPORTDAYS$6, 0);
            }
        }
        
        /**
         * Gets the "RenalSupportDays" element
         */
        public int getRenalSupportDays()
        {
            synchronized (monitor())
            {
                check_orphaned();
                org.apache.xmlbeans.SimpleValue target = null;
                target = (org.apache.xmlbeans.SimpleValue)get_store().find_element_user(RENALSUPPORTDAYS$8, 0);
                if (target == null)
                {
                    return 0;
                }
                return target.getIntValue();
            }
        }
        
        /**
         * Gets (as xml) the "RenalSupportDays" element
         */
        public uk.nhs.nhsia.datastandards.ecds.RenalSupportDaysType xgetRenalSupportDays()
        {
            synchronized (monitor())
            {
                check_orphaned();
                uk.nhs.nhsia.datastandards.ecds.RenalSupportDaysType target = null;
                target = (uk.nhs.nhsia.datastandards.ecds.RenalSupportDaysType)get_store().find_element_user(RENALSUPPORTDAYS$8, 0);
                return target;
            }
        }
        
        /**
         * True if has "RenalSupportDays" element
         */
        public boolean isSetRenalSupportDays()
        {
            synchronized (monitor())
            {
                check_orphaned();
                return get_store().count_elements(RENALSUPPORTDAYS$8) != 0;
            }
        }
        
        /**
         * Sets the "RenalSupportDays" element
         */
        public void setRenalSupportDays(int renalSupportDays)
        {
            synchronized (monitor())
            {
                check_orphaned();
                org.apache.xmlbeans.SimpleValue target = null;
                target = (org.apache.xmlbeans.SimpleValue)get_store().find_element_user(RENALSUPPORTDAYS$8, 0);
                if (target == null)
                {
                    target = (org.apache.xmlbeans.SimpleValue)get_store().add_element_user(RENALSUPPORTDAYS$8);
                }
                target.setIntValue(renalSupportDays);
            }
        }
        
        /**
         * Sets (as xml) the "RenalSupportDays" element
         */
        public void xsetRenalSupportDays(uk.nhs.nhsia.datastandards.ecds.RenalSupportDaysType renalSupportDays)
        {
            synchronized (monitor())
            {
                check_orphaned();
                uk.nhs.nhsia.datastandards.ecds.RenalSupportDaysType target = null;
                target = (uk.nhs.nhsia.datastandards.ecds.RenalSupportDaysType)get_store().find_element_user(RENALSUPPORTDAYS$8, 0);
                if (target == null)
                {
                    target = (uk.nhs.nhsia.datastandards.ecds.RenalSupportDaysType)get_store().add_element_user(RENALSUPPORTDAYS$8);
                }
                target.set(renalSupportDays);
            }
        }
        
        /**
         * Unsets the "RenalSupportDays" element
         */
        public void unsetRenalSupportDays()
        {
            synchronized (monitor())
            {
                check_orphaned();
                get_store().remove_element(RENALSUPPORTDAYS$8, 0);
            }
        }
        
        /**
         * Gets the "NeurologicalSupportDays" element
         */
        public int getNeurologicalSupportDays()
        {
            synchronized (monitor())
            {
                check_orphaned();
                org.apache.xmlbeans.SimpleValue target = null;
                target = (org.apache.xmlbeans.SimpleValue)get_store().find_element_user(NEUROLOGICALSUPPORTDAYS$10, 0);
                if (target == null)
                {
                    return 0;
                }
                return target.getIntValue();
            }
        }
        
        /**
         * Gets (as xml) the "NeurologicalSupportDays" element
         */
        public uk.nhs.nhsia.datastandards.ecds.NeurologicalSupportDaysType xgetNeurologicalSupportDays()
        {
            synchronized (monitor())
            {
                check_orphaned();
                uk.nhs.nhsia.datastandards.ecds.NeurologicalSupportDaysType target = null;
                target = (uk.nhs.nhsia.datastandards.ecds.NeurologicalSupportDaysType)get_store().find_element_user(NEUROLOGICALSUPPORTDAYS$10, 0);
                return target;
            }
        }
        
        /**
         * True if has "NeurologicalSupportDays" element
         */
        public boolean isSetNeurologicalSupportDays()
        {
            synchronized (monitor())
            {
                check_orphaned();
                return get_store().count_elements(NEUROLOGICALSUPPORTDAYS$10) != 0;
            }
        }
        
        /**
         * Sets the "NeurologicalSupportDays" element
         */
        public void setNeurologicalSupportDays(int neurologicalSupportDays)
        {
            synchronized (monitor())
            {
                check_orphaned();
                org.apache.xmlbeans.SimpleValue target = null;
                target = (org.apache.xmlbeans.SimpleValue)get_store().find_element_user(NEUROLOGICALSUPPORTDAYS$10, 0);
                if (target == null)
                {
                    target = (org.apache.xmlbeans.SimpleValue)get_store().add_element_user(NEUROLOGICALSUPPORTDAYS$10);
                }
                target.setIntValue(neurologicalSupportDays);
            }
        }
        
        /**
         * Sets (as xml) the "NeurologicalSupportDays" element
         */
        public void xsetNeurologicalSupportDays(uk.nhs.nhsia.datastandards.ecds.NeurologicalSupportDaysType neurologicalSupportDays)
        {
            synchronized (monitor())
            {
                check_orphaned();
                uk.nhs.nhsia.datastandards.ecds.NeurologicalSupportDaysType target = null;
                target = (uk.nhs.nhsia.datastandards.ecds.NeurologicalSupportDaysType)get_store().find_element_user(NEUROLOGICALSUPPORTDAYS$10, 0);
                if (target == null)
                {
                    target = (uk.nhs.nhsia.datastandards.ecds.NeurologicalSupportDaysType)get_store().add_element_user(NEUROLOGICALSUPPORTDAYS$10);
                }
                target.set(neurologicalSupportDays);
            }
        }
        
        /**
         * Unsets the "NeurologicalSupportDays" element
         */
        public void unsetNeurologicalSupportDays()
        {
            synchronized (monitor())
            {
                check_orphaned();
                get_store().remove_element(NEUROLOGICALSUPPORTDAYS$10, 0);
            }
        }
        
        /**
         * Gets the "GastroIntestinalSupportDays" element
         */
        public int getGastroIntestinalSupportDays()
        {
            synchronized (monitor())
            {
                check_orphaned();
                org.apache.xmlbeans.SimpleValue target = null;
                target = (org.apache.xmlbeans.SimpleValue)get_store().find_element_user(GASTROINTESTINALSUPPORTDAYS$12, 0);
                if (target == null)
                {
                    return 0;
                }
                return target.getIntValue();
            }
        }
        
        /**
         * Gets (as xml) the "GastroIntestinalSupportDays" element
         */
        public uk.nhs.nhsia.datastandards.ecds.GastroIntestinalSupportDaysType xgetGastroIntestinalSupportDays()
        {
            synchronized (monitor())
            {
                check_orphaned();
                uk.nhs.nhsia.datastandards.ecds.GastroIntestinalSupportDaysType target = null;
                target = (uk.nhs.nhsia.datastandards.ecds.GastroIntestinalSupportDaysType)get_store().find_element_user(GASTROINTESTINALSUPPORTDAYS$12, 0);
                return target;
            }
        }
        
        /**
         * True if has "GastroIntestinalSupportDays" element
         */
        public boolean isSetGastroIntestinalSupportDays()
        {
            synchronized (monitor())
            {
                check_orphaned();
                return get_store().count_elements(GASTROINTESTINALSUPPORTDAYS$12) != 0;
            }
        }
        
        /**
         * Sets the "GastroIntestinalSupportDays" element
         */
        public void setGastroIntestinalSupportDays(int gastroIntestinalSupportDays)
        {
            synchronized (monitor())
            {
                check_orphaned();
                org.apache.xmlbeans.SimpleValue target = null;
                target = (org.apache.xmlbeans.SimpleValue)get_store().find_element_user(GASTROINTESTINALSUPPORTDAYS$12, 0);
                if (target == null)
                {
                    target = (org.apache.xmlbeans.SimpleValue)get_store().add_element_user(GASTROINTESTINALSUPPORTDAYS$12);
                }
                target.setIntValue(gastroIntestinalSupportDays);
            }
        }
        
        /**
         * Sets (as xml) the "GastroIntestinalSupportDays" element
         */
        public void xsetGastroIntestinalSupportDays(uk.nhs.nhsia.datastandards.ecds.GastroIntestinalSupportDaysType gastroIntestinalSupportDays)
        {
            synchronized (monitor())
            {
                check_orphaned();
                uk.nhs.nhsia.datastandards.ecds.GastroIntestinalSupportDaysType target = null;
                target = (uk.nhs.nhsia.datastandards.ecds.GastroIntestinalSupportDaysType)get_store().find_element_user(GASTROINTESTINALSUPPORTDAYS$12, 0);
                if (target == null)
                {
                    target = (uk.nhs.nhsia.datastandards.ecds.GastroIntestinalSupportDaysType)get_store().add_element_user(GASTROINTESTINALSUPPORTDAYS$12);
                }
                target.set(gastroIntestinalSupportDays);
            }
        }
        
        /**
         * Unsets the "GastroIntestinalSupportDays" element
         */
        public void unsetGastroIntestinalSupportDays()
        {
            synchronized (monitor())
            {
                check_orphaned();
                get_store().remove_element(GASTROINTESTINALSUPPORTDAYS$12, 0);
            }
        }
        
        /**
         * Gets the "DermatologicalSupportDays" element
         */
        public int getDermatologicalSupportDays()
        {
            synchronized (monitor())
            {
                check_orphaned();
                org.apache.xmlbeans.SimpleValue target = null;
                target = (org.apache.xmlbeans.SimpleValue)get_store().find_element_user(DERMATOLOGICALSUPPORTDAYS$14, 0);
                if (target == null)
                {
                    return 0;
                }
                return target.getIntValue();
            }
        }
        
        /**
         * Gets (as xml) the "DermatologicalSupportDays" element
         */
        public uk.nhs.nhsia.datastandards.ecds.DermatologicalSupportDaysType xgetDermatologicalSupportDays()
        {
            synchronized (monitor())
            {
                check_orphaned();
                uk.nhs.nhsia.datastandards.ecds.DermatologicalSupportDaysType target = null;
                target = (uk.nhs.nhsia.datastandards.ecds.DermatologicalSupportDaysType)get_store().find_element_user(DERMATOLOGICALSUPPORTDAYS$14, 0);
                return target;
            }
        }
        
        /**
         * True if has "DermatologicalSupportDays" element
         */
        public boolean isSetDermatologicalSupportDays()
        {
            synchronized (monitor())
            {
                check_orphaned();
                return get_store().count_elements(DERMATOLOGICALSUPPORTDAYS$14) != 0;
            }
        }
        
        /**
         * Sets the "DermatologicalSupportDays" element
         */
        public void setDermatologicalSupportDays(int dermatologicalSupportDays)
        {
            synchronized (monitor())
            {
                check_orphaned();
                org.apache.xmlbeans.SimpleValue target = null;
                target = (org.apache.xmlbeans.SimpleValue)get_store().find_element_user(DERMATOLOGICALSUPPORTDAYS$14, 0);
                if (target == null)
                {
                    target = (org.apache.xmlbeans.SimpleValue)get_store().add_element_user(DERMATOLOGICALSUPPORTDAYS$14);
                }
                target.setIntValue(dermatologicalSupportDays);
            }
        }
        
        /**
         * Sets (as xml) the "DermatologicalSupportDays" element
         */
        public void xsetDermatologicalSupportDays(uk.nhs.nhsia.datastandards.ecds.DermatologicalSupportDaysType dermatologicalSupportDays)
        {
            synchronized (monitor())
            {
                check_orphaned();
                uk.nhs.nhsia.datastandards.ecds.DermatologicalSupportDaysType target = null;
                target = (uk.nhs.nhsia.datastandards.ecds.DermatologicalSupportDaysType)get_store().find_element_user(DERMATOLOGICALSUPPORTDAYS$14, 0);
                if (target == null)
                {
                    target = (uk.nhs.nhsia.datastandards.ecds.DermatologicalSupportDaysType)get_store().add_element_user(DERMATOLOGICALSUPPORTDAYS$14);
                }
                target.set(dermatologicalSupportDays);
            }
        }
        
        /**
         * Unsets the "DermatologicalSupportDays" element
         */
        public void unsetDermatologicalSupportDays()
        {
            synchronized (monitor())
            {
                check_orphaned();
                get_store().remove_element(DERMATOLOGICALSUPPORTDAYS$14, 0);
            }
        }
        
        /**
         * Gets the "LiverSupportDays" element
         */
        public int getLiverSupportDays()
        {
            synchronized (monitor())
            {
                check_orphaned();
                org.apache.xmlbeans.SimpleValue target = null;
                target = (org.apache.xmlbeans.SimpleValue)get_store().find_element_user(LIVERSUPPORTDAYS$16, 0);
                if (target == null)
                {
                    return 0;
                }
                return target.getIntValue();
            }
        }
        
        /**
         * Gets (as xml) the "LiverSupportDays" element
         */
        public uk.nhs.nhsia.datastandards.ecds.LiverSupportDaysType xgetLiverSupportDays()
        {
            synchronized (monitor())
            {
                check_orphaned();
                uk.nhs.nhsia.datastandards.ecds.LiverSupportDaysType target = null;
                target = (uk.nhs.nhsia.datastandards.ecds.LiverSupportDaysType)get_store().find_element_user(LIVERSUPPORTDAYS$16, 0);
                return target;
            }
        }
        
        /**
         * True if has "LiverSupportDays" element
         */
        public boolean isSetLiverSupportDays()
        {
            synchronized (monitor())
            {
                check_orphaned();
                return get_store().count_elements(LIVERSUPPORTDAYS$16) != 0;
            }
        }
        
        /**
         * Sets the "LiverSupportDays" element
         */
        public void setLiverSupportDays(int liverSupportDays)
        {
            synchronized (monitor())
            {
                check_orphaned();
                org.apache.xmlbeans.SimpleValue target = null;
                target = (org.apache.xmlbeans.SimpleValue)get_store().find_element_user(LIVERSUPPORTDAYS$16, 0);
                if (target == null)
                {
                    target = (org.apache.xmlbeans.SimpleValue)get_store().add_element_user(LIVERSUPPORTDAYS$16);
                }
                target.setIntValue(liverSupportDays);
            }
        }
        
        /**
         * Sets (as xml) the "LiverSupportDays" element
         */
        public void xsetLiverSupportDays(uk.nhs.nhsia.datastandards.ecds.LiverSupportDaysType liverSupportDays)
        {
            synchronized (monitor())
            {
                check_orphaned();
                uk.nhs.nhsia.datastandards.ecds.LiverSupportDaysType target = null;
                target = (uk.nhs.nhsia.datastandards.ecds.LiverSupportDaysType)get_store().find_element_user(LIVERSUPPORTDAYS$16, 0);
                if (target == null)
                {
                    target = (uk.nhs.nhsia.datastandards.ecds.LiverSupportDaysType)get_store().add_element_user(LIVERSUPPORTDAYS$16);
                }
                target.set(liverSupportDays);
            }
        }
        
        /**
         * Unsets the "LiverSupportDays" element
         */
        public void unsetLiverSupportDays()
        {
            synchronized (monitor())
            {
                check_orphaned();
                get_store().remove_element(LIVERSUPPORTDAYS$16, 0);
            }
        }
        
        /**
         * Gets the "OrganSupportMaximum" element
         */
        public uk.nhs.nhsia.datastandards.ecds.OrganSupportMaximumType.Enum getOrganSupportMaximum()
        {
            synchronized (monitor())
            {
                check_orphaned();
                org.apache.xmlbeans.SimpleValue target = null;
                target = (org.apache.xmlbeans.SimpleValue)get_store().find_element_user(ORGANSUPPORTMAXIMUM$18, 0);
                if (target == null)
                {
                    return null;
                }
                return (uk.nhs.nhsia.datastandards.ecds.OrganSupportMaximumType.Enum)target.getEnumValue();
            }
        }
        
        /**
         * Gets (as xml) the "OrganSupportMaximum" element
         */
        public uk.nhs.nhsia.datastandards.ecds.OrganSupportMaximumType xgetOrganSupportMaximum()
        {
            synchronized (monitor())
            {
                check_orphaned();
                uk.nhs.nhsia.datastandards.ecds.OrganSupportMaximumType target = null;
                target = (uk.nhs.nhsia.datastandards.ecds.OrganSupportMaximumType)get_store().find_element_user(ORGANSUPPORTMAXIMUM$18, 0);
                return target;
            }
        }
        
        /**
         * True if has "OrganSupportMaximum" element
         */
        public boolean isSetOrganSupportMaximum()
        {
            synchronized (monitor())
            {
                check_orphaned();
                return get_store().count_elements(ORGANSUPPORTMAXIMUM$18) != 0;
            }
        }
        
        /**
         * Sets the "OrganSupportMaximum" element
         */
        public void setOrganSupportMaximum(uk.nhs.nhsia.datastandards.ecds.OrganSupportMaximumType.Enum organSupportMaximum)
        {
            synchronized (monitor())
            {
                check_orphaned();
                org.apache.xmlbeans.SimpleValue target = null;
                target = (org.apache.xmlbeans.SimpleValue)get_store().find_element_user(ORGANSUPPORTMAXIMUM$18, 0);
                if (target == null)
                {
                    target = (org.apache.xmlbeans.SimpleValue)get_store().add_element_user(ORGANSUPPORTMAXIMUM$18);
                }
                target.setEnumValue(organSupportMaximum);
            }
        }
        
        /**
         * Sets (as xml) the "OrganSupportMaximum" element
         */
        public void xsetOrganSupportMaximum(uk.nhs.nhsia.datastandards.ecds.OrganSupportMaximumType organSupportMaximum)
        {
            synchronized (monitor())
            {
                check_orphaned();
                uk.nhs.nhsia.datastandards.ecds.OrganSupportMaximumType target = null;
                target = (uk.nhs.nhsia.datastandards.ecds.OrganSupportMaximumType)get_store().find_element_user(ORGANSUPPORTMAXIMUM$18, 0);
                if (target == null)
                {
                    target = (uk.nhs.nhsia.datastandards.ecds.OrganSupportMaximumType)get_store().add_element_user(ORGANSUPPORTMAXIMUM$18);
                }
                target.set(organSupportMaximum);
            }
        }
        
        /**
         * Unsets the "OrganSupportMaximum" element
         */
        public void unsetOrganSupportMaximum()
        {
            synchronized (monitor())
            {
                check_orphaned();
                get_store().remove_element(ORGANSUPPORTMAXIMUM$18, 0);
            }
        }
        
        /**
         * Gets the "CriticalCareLevel2Days" element
         */
        public int getCriticalCareLevel2Days()
        {
            synchronized (monitor())
            {
                check_orphaned();
                org.apache.xmlbeans.SimpleValue target = null;
                target = (org.apache.xmlbeans.SimpleValue)get_store().find_element_user(CRITICALCARELEVEL2DAYS$20, 0);
                if (target == null)
                {
                    return 0;
                }
                return target.getIntValue();
            }
        }
        
        /**
         * Gets (as xml) the "CriticalCareLevel2Days" element
         */
        public uk.nhs.nhsia.datastandards.ecds.CriticalCareLevel2DaysType xgetCriticalCareLevel2Days()
        {
            synchronized (monitor())
            {
                check_orphaned();
                uk.nhs.nhsia.datastandards.ecds.CriticalCareLevel2DaysType target = null;
                target = (uk.nhs.nhsia.datastandards.ecds.CriticalCareLevel2DaysType)get_store().find_element_user(CRITICALCARELEVEL2DAYS$20, 0);
                return target;
            }
        }
        
        /**
         * True if has "CriticalCareLevel2Days" element
         */
        public boolean isSetCriticalCareLevel2Days()
        {
            synchronized (monitor())
            {
                check_orphaned();
                return get_store().count_elements(CRITICALCARELEVEL2DAYS$20) != 0;
            }
        }
        
        /**
         * Sets the "CriticalCareLevel2Days" element
         */
        public void setCriticalCareLevel2Days(int criticalCareLevel2Days)
        {
            synchronized (monitor())
            {
                check_orphaned();
                org.apache.xmlbeans.SimpleValue target = null;
                target = (org.apache.xmlbeans.SimpleValue)get_store().find_element_user(CRITICALCARELEVEL2DAYS$20, 0);
                if (target == null)
                {
                    target = (org.apache.xmlbeans.SimpleValue)get_store().add_element_user(CRITICALCARELEVEL2DAYS$20);
                }
                target.setIntValue(criticalCareLevel2Days);
            }
        }
        
        /**
         * Sets (as xml) the "CriticalCareLevel2Days" element
         */
        public void xsetCriticalCareLevel2Days(uk.nhs.nhsia.datastandards.ecds.CriticalCareLevel2DaysType criticalCareLevel2Days)
        {
            synchronized (monitor())
            {
                check_orphaned();
                uk.nhs.nhsia.datastandards.ecds.CriticalCareLevel2DaysType target = null;
                target = (uk.nhs.nhsia.datastandards.ecds.CriticalCareLevel2DaysType)get_store().find_element_user(CRITICALCARELEVEL2DAYS$20, 0);
                if (target == null)
                {
                    target = (uk.nhs.nhsia.datastandards.ecds.CriticalCareLevel2DaysType)get_store().add_element_user(CRITICALCARELEVEL2DAYS$20);
                }
                target.set(criticalCareLevel2Days);
            }
        }
        
        /**
         * Unsets the "CriticalCareLevel2Days" element
         */
        public void unsetCriticalCareLevel2Days()
        {
            synchronized (monitor())
            {
                check_orphaned();
                get_store().remove_element(CRITICALCARELEVEL2DAYS$20, 0);
            }
        }
        
        /**
         * Gets the "CriticalCareLevel3Days" element
         */
        public int getCriticalCareLevel3Days()
        {
            synchronized (monitor())
            {
                check_orphaned();
                org.apache.xmlbeans.SimpleValue target = null;
                target = (org.apache.xmlbeans.SimpleValue)get_store().find_element_user(CRITICALCARELEVEL3DAYS$22, 0);
                if (target == null)
                {
                    return 0;
                }
                return target.getIntValue();
            }
        }
        
        /**
         * Gets (as xml) the "CriticalCareLevel3Days" element
         */
        public uk.nhs.nhsia.datastandards.ecds.CriticalCareLevel3DaysType xgetCriticalCareLevel3Days()
        {
            synchronized (monitor())
            {
                check_orphaned();
                uk.nhs.nhsia.datastandards.ecds.CriticalCareLevel3DaysType target = null;
                target = (uk.nhs.nhsia.datastandards.ecds.CriticalCareLevel3DaysType)get_store().find_element_user(CRITICALCARELEVEL3DAYS$22, 0);
                return target;
            }
        }
        
        /**
         * True if has "CriticalCareLevel3Days" element
         */
        public boolean isSetCriticalCareLevel3Days()
        {
            synchronized (monitor())
            {
                check_orphaned();
                return get_store().count_elements(CRITICALCARELEVEL3DAYS$22) != 0;
            }
        }
        
        /**
         * Sets the "CriticalCareLevel3Days" element
         */
        public void setCriticalCareLevel3Days(int criticalCareLevel3Days)
        {
            synchronized (monitor())
            {
                check_orphaned();
                org.apache.xmlbeans.SimpleValue target = null;
                target = (org.apache.xmlbeans.SimpleValue)get_store().find_element_user(CRITICALCARELEVEL3DAYS$22, 0);
                if (target == null)
                {
                    target = (org.apache.xmlbeans.SimpleValue)get_store().add_element_user(CRITICALCARELEVEL3DAYS$22);
                }
                target.setIntValue(criticalCareLevel3Days);
            }
        }
        
        /**
         * Sets (as xml) the "CriticalCareLevel3Days" element
         */
        public void xsetCriticalCareLevel3Days(uk.nhs.nhsia.datastandards.ecds.CriticalCareLevel3DaysType criticalCareLevel3Days)
        {
            synchronized (monitor())
            {
                check_orphaned();
                uk.nhs.nhsia.datastandards.ecds.CriticalCareLevel3DaysType target = null;
                target = (uk.nhs.nhsia.datastandards.ecds.CriticalCareLevel3DaysType)get_store().find_element_user(CRITICALCARELEVEL3DAYS$22, 0);
                if (target == null)
                {
                    target = (uk.nhs.nhsia.datastandards.ecds.CriticalCareLevel3DaysType)get_store().add_element_user(CRITICALCARELEVEL3DAYS$22);
                }
                target.set(criticalCareLevel3Days);
            }
        }
        
        /**
         * Unsets the "CriticalCareLevel3Days" element
         */
        public void unsetCriticalCareLevel3Days()
        {
            synchronized (monitor())
            {
                check_orphaned();
                get_store().remove_element(CRITICALCARELEVEL3DAYS$22, 0);
            }
        }
    }
    /**
     * An XML ACC_DischargeCharacteristics(@http://www.nhsia.nhs.uk/DataStandards/XMLschema/CDS/ns).
     *
     * This is a complex type.
     */
    public static class ACCDischargeCharacteristicsImpl extends org.apache.xmlbeans.impl.values.XmlComplexContentImpl implements uk.nhs.nhsia.datastandards.ecds.AdultCriticalCarePeriodStructure.ACCDischargeCharacteristics
    {
        private static final long serialVersionUID = 1L;
        
        public ACCDischargeCharacteristicsImpl(org.apache.xmlbeans.SchemaType sType)
        {
            super(sType);
        }
        
        private static final javax.xml.namespace.QName CRITICALCAREDISCHARGEDATE$0 = 
            new javax.xml.namespace.QName("http://www.nhsia.nhs.uk/DataStandards/XMLschema/CDS/ns", "CriticalCareDischargeDate");
        private static final javax.xml.namespace.QName CRITICALCAREDISCHARGETIME$2 = 
            new javax.xml.namespace.QName("http://www.nhsia.nhs.uk/DataStandards/XMLschema/CDS/ns", "CriticalCareDischargeTime");
        private static final javax.xml.namespace.QName CRITICALCAREDISCHARGEREADYDATE$4 = 
            new javax.xml.namespace.QName("http://www.nhsia.nhs.uk/DataStandards/XMLschema/CDS/ns", "CriticalCareDischargeReadyDate");
        private static final javax.xml.namespace.QName CRITICALCAREDISCHARGEREADYTIME$6 = 
            new javax.xml.namespace.QName("http://www.nhsia.nhs.uk/DataStandards/XMLschema/CDS/ns", "CriticalCareDischargeReadyTime");
        private static final javax.xml.namespace.QName CRITICALCAREDISCHARGESTATUS$8 = 
            new javax.xml.namespace.QName("http://www.nhsia.nhs.uk/DataStandards/XMLschema/CDS/ns", "CriticalCareDischargeStatus");
        private static final javax.xml.namespace.QName CRITICALCAREDISCHARGEDESTINATION$10 = 
            new javax.xml.namespace.QName("http://www.nhsia.nhs.uk/DataStandards/XMLschema/CDS/ns", "CriticalCareDischargeDestination");
        private static final javax.xml.namespace.QName CRITICALCAREDISCHARGELOCATION$12 = 
            new javax.xml.namespace.QName("http://www.nhsia.nhs.uk/DataStandards/XMLschema/CDS/ns", "CriticalCareDischargeLocation");
        
        
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
        
        /**
         * Gets the "CriticalCareDischargeReadyDate" element
         */
        public java.util.Calendar getCriticalCareDischargeReadyDate()
        {
            synchronized (monitor())
            {
                check_orphaned();
                org.apache.xmlbeans.SimpleValue target = null;
                target = (org.apache.xmlbeans.SimpleValue)get_store().find_element_user(CRITICALCAREDISCHARGEREADYDATE$4, 0);
                if (target == null)
                {
                    return null;
                }
                return target.getCalendarValue();
            }
        }
        
        /**
         * Gets (as xml) the "CriticalCareDischargeReadyDate" element
         */
        public uk.nhs.nhsia.datastandards.ecds.CriticalCareDischargeReadyDateType xgetCriticalCareDischargeReadyDate()
        {
            synchronized (monitor())
            {
                check_orphaned();
                uk.nhs.nhsia.datastandards.ecds.CriticalCareDischargeReadyDateType target = null;
                target = (uk.nhs.nhsia.datastandards.ecds.CriticalCareDischargeReadyDateType)get_store().find_element_user(CRITICALCAREDISCHARGEREADYDATE$4, 0);
                return target;
            }
        }
        
        /**
         * True if has "CriticalCareDischargeReadyDate" element
         */
        public boolean isSetCriticalCareDischargeReadyDate()
        {
            synchronized (monitor())
            {
                check_orphaned();
                return get_store().count_elements(CRITICALCAREDISCHARGEREADYDATE$4) != 0;
            }
        }
        
        /**
         * Sets the "CriticalCareDischargeReadyDate" element
         */
        public void setCriticalCareDischargeReadyDate(java.util.Calendar criticalCareDischargeReadyDate)
        {
            synchronized (monitor())
            {
                check_orphaned();
                org.apache.xmlbeans.SimpleValue target = null;
                target = (org.apache.xmlbeans.SimpleValue)get_store().find_element_user(CRITICALCAREDISCHARGEREADYDATE$4, 0);
                if (target == null)
                {
                    target = (org.apache.xmlbeans.SimpleValue)get_store().add_element_user(CRITICALCAREDISCHARGEREADYDATE$4);
                }
                target.setCalendarValue(criticalCareDischargeReadyDate);
            }
        }
        
        /**
         * Sets (as xml) the "CriticalCareDischargeReadyDate" element
         */
        public void xsetCriticalCareDischargeReadyDate(uk.nhs.nhsia.datastandards.ecds.CriticalCareDischargeReadyDateType criticalCareDischargeReadyDate)
        {
            synchronized (monitor())
            {
                check_orphaned();
                uk.nhs.nhsia.datastandards.ecds.CriticalCareDischargeReadyDateType target = null;
                target = (uk.nhs.nhsia.datastandards.ecds.CriticalCareDischargeReadyDateType)get_store().find_element_user(CRITICALCAREDISCHARGEREADYDATE$4, 0);
                if (target == null)
                {
                    target = (uk.nhs.nhsia.datastandards.ecds.CriticalCareDischargeReadyDateType)get_store().add_element_user(CRITICALCAREDISCHARGEREADYDATE$4);
                }
                target.set(criticalCareDischargeReadyDate);
            }
        }
        
        /**
         * Unsets the "CriticalCareDischargeReadyDate" element
         */
        public void unsetCriticalCareDischargeReadyDate()
        {
            synchronized (monitor())
            {
                check_orphaned();
                get_store().remove_element(CRITICALCAREDISCHARGEREADYDATE$4, 0);
            }
        }
        
        /**
         * Gets the "CriticalCareDischargeReadyTime" element
         */
        public java.util.Calendar getCriticalCareDischargeReadyTime()
        {
            synchronized (monitor())
            {
                check_orphaned();
                org.apache.xmlbeans.SimpleValue target = null;
                target = (org.apache.xmlbeans.SimpleValue)get_store().find_element_user(CRITICALCAREDISCHARGEREADYTIME$6, 0);
                if (target == null)
                {
                    return null;
                }
                return target.getCalendarValue();
            }
        }
        
        /**
         * Gets (as xml) the "CriticalCareDischargeReadyTime" element
         */
        public uk.nhs.nhsia.datastandards.ecds.CriticalCareDischargeReadyTimeType xgetCriticalCareDischargeReadyTime()
        {
            synchronized (monitor())
            {
                check_orphaned();
                uk.nhs.nhsia.datastandards.ecds.CriticalCareDischargeReadyTimeType target = null;
                target = (uk.nhs.nhsia.datastandards.ecds.CriticalCareDischargeReadyTimeType)get_store().find_element_user(CRITICALCAREDISCHARGEREADYTIME$6, 0);
                return target;
            }
        }
        
        /**
         * True if has "CriticalCareDischargeReadyTime" element
         */
        public boolean isSetCriticalCareDischargeReadyTime()
        {
            synchronized (monitor())
            {
                check_orphaned();
                return get_store().count_elements(CRITICALCAREDISCHARGEREADYTIME$6) != 0;
            }
        }
        
        /**
         * Sets the "CriticalCareDischargeReadyTime" element
         */
        public void setCriticalCareDischargeReadyTime(java.util.Calendar criticalCareDischargeReadyTime)
        {
            synchronized (monitor())
            {
                check_orphaned();
                org.apache.xmlbeans.SimpleValue target = null;
                target = (org.apache.xmlbeans.SimpleValue)get_store().find_element_user(CRITICALCAREDISCHARGEREADYTIME$6, 0);
                if (target == null)
                {
                    target = (org.apache.xmlbeans.SimpleValue)get_store().add_element_user(CRITICALCAREDISCHARGEREADYTIME$6);
                }
                target.setCalendarValue(criticalCareDischargeReadyTime);
            }
        }
        
        /**
         * Sets (as xml) the "CriticalCareDischargeReadyTime" element
         */
        public void xsetCriticalCareDischargeReadyTime(uk.nhs.nhsia.datastandards.ecds.CriticalCareDischargeReadyTimeType criticalCareDischargeReadyTime)
        {
            synchronized (monitor())
            {
                check_orphaned();
                uk.nhs.nhsia.datastandards.ecds.CriticalCareDischargeReadyTimeType target = null;
                target = (uk.nhs.nhsia.datastandards.ecds.CriticalCareDischargeReadyTimeType)get_store().find_element_user(CRITICALCAREDISCHARGEREADYTIME$6, 0);
                if (target == null)
                {
                    target = (uk.nhs.nhsia.datastandards.ecds.CriticalCareDischargeReadyTimeType)get_store().add_element_user(CRITICALCAREDISCHARGEREADYTIME$6);
                }
                target.set(criticalCareDischargeReadyTime);
            }
        }
        
        /**
         * Unsets the "CriticalCareDischargeReadyTime" element
         */
        public void unsetCriticalCareDischargeReadyTime()
        {
            synchronized (monitor())
            {
                check_orphaned();
                get_store().remove_element(CRITICALCAREDISCHARGEREADYTIME$6, 0);
            }
        }
        
        /**
         * Gets the "CriticalCareDischargeStatus" element
         */
        public uk.nhs.nhsia.datastandards.ecds.CriticalCareDischargeStatusType.Enum getCriticalCareDischargeStatus()
        {
            synchronized (monitor())
            {
                check_orphaned();
                org.apache.xmlbeans.SimpleValue target = null;
                target = (org.apache.xmlbeans.SimpleValue)get_store().find_element_user(CRITICALCAREDISCHARGESTATUS$8, 0);
                if (target == null)
                {
                    return null;
                }
                return (uk.nhs.nhsia.datastandards.ecds.CriticalCareDischargeStatusType.Enum)target.getEnumValue();
            }
        }
        
        /**
         * Gets (as xml) the "CriticalCareDischargeStatus" element
         */
        public uk.nhs.nhsia.datastandards.ecds.CriticalCareDischargeStatusType xgetCriticalCareDischargeStatus()
        {
            synchronized (monitor())
            {
                check_orphaned();
                uk.nhs.nhsia.datastandards.ecds.CriticalCareDischargeStatusType target = null;
                target = (uk.nhs.nhsia.datastandards.ecds.CriticalCareDischargeStatusType)get_store().find_element_user(CRITICALCAREDISCHARGESTATUS$8, 0);
                return target;
            }
        }
        
        /**
         * True if has "CriticalCareDischargeStatus" element
         */
        public boolean isSetCriticalCareDischargeStatus()
        {
            synchronized (monitor())
            {
                check_orphaned();
                return get_store().count_elements(CRITICALCAREDISCHARGESTATUS$8) != 0;
            }
        }
        
        /**
         * Sets the "CriticalCareDischargeStatus" element
         */
        public void setCriticalCareDischargeStatus(uk.nhs.nhsia.datastandards.ecds.CriticalCareDischargeStatusType.Enum criticalCareDischargeStatus)
        {
            synchronized (monitor())
            {
                check_orphaned();
                org.apache.xmlbeans.SimpleValue target = null;
                target = (org.apache.xmlbeans.SimpleValue)get_store().find_element_user(CRITICALCAREDISCHARGESTATUS$8, 0);
                if (target == null)
                {
                    target = (org.apache.xmlbeans.SimpleValue)get_store().add_element_user(CRITICALCAREDISCHARGESTATUS$8);
                }
                target.setEnumValue(criticalCareDischargeStatus);
            }
        }
        
        /**
         * Sets (as xml) the "CriticalCareDischargeStatus" element
         */
        public void xsetCriticalCareDischargeStatus(uk.nhs.nhsia.datastandards.ecds.CriticalCareDischargeStatusType criticalCareDischargeStatus)
        {
            synchronized (monitor())
            {
                check_orphaned();
                uk.nhs.nhsia.datastandards.ecds.CriticalCareDischargeStatusType target = null;
                target = (uk.nhs.nhsia.datastandards.ecds.CriticalCareDischargeStatusType)get_store().find_element_user(CRITICALCAREDISCHARGESTATUS$8, 0);
                if (target == null)
                {
                    target = (uk.nhs.nhsia.datastandards.ecds.CriticalCareDischargeStatusType)get_store().add_element_user(CRITICALCAREDISCHARGESTATUS$8);
                }
                target.set(criticalCareDischargeStatus);
            }
        }
        
        /**
         * Unsets the "CriticalCareDischargeStatus" element
         */
        public void unsetCriticalCareDischargeStatus()
        {
            synchronized (monitor())
            {
                check_orphaned();
                get_store().remove_element(CRITICALCAREDISCHARGESTATUS$8, 0);
            }
        }
        
        /**
         * Gets the "CriticalCareDischargeDestination" element
         */
        public uk.nhs.nhsia.datastandards.ecds.CriticalCareDischargeDestinationType.Enum getCriticalCareDischargeDestination()
        {
            synchronized (monitor())
            {
                check_orphaned();
                org.apache.xmlbeans.SimpleValue target = null;
                target = (org.apache.xmlbeans.SimpleValue)get_store().find_element_user(CRITICALCAREDISCHARGEDESTINATION$10, 0);
                if (target == null)
                {
                    return null;
                }
                return (uk.nhs.nhsia.datastandards.ecds.CriticalCareDischargeDestinationType.Enum)target.getEnumValue();
            }
        }
        
        /**
         * Gets (as xml) the "CriticalCareDischargeDestination" element
         */
        public uk.nhs.nhsia.datastandards.ecds.CriticalCareDischargeDestinationType xgetCriticalCareDischargeDestination()
        {
            synchronized (monitor())
            {
                check_orphaned();
                uk.nhs.nhsia.datastandards.ecds.CriticalCareDischargeDestinationType target = null;
                target = (uk.nhs.nhsia.datastandards.ecds.CriticalCareDischargeDestinationType)get_store().find_element_user(CRITICALCAREDISCHARGEDESTINATION$10, 0);
                return target;
            }
        }
        
        /**
         * True if has "CriticalCareDischargeDestination" element
         */
        public boolean isSetCriticalCareDischargeDestination()
        {
            synchronized (monitor())
            {
                check_orphaned();
                return get_store().count_elements(CRITICALCAREDISCHARGEDESTINATION$10) != 0;
            }
        }
        
        /**
         * Sets the "CriticalCareDischargeDestination" element
         */
        public void setCriticalCareDischargeDestination(uk.nhs.nhsia.datastandards.ecds.CriticalCareDischargeDestinationType.Enum criticalCareDischargeDestination)
        {
            synchronized (monitor())
            {
                check_orphaned();
                org.apache.xmlbeans.SimpleValue target = null;
                target = (org.apache.xmlbeans.SimpleValue)get_store().find_element_user(CRITICALCAREDISCHARGEDESTINATION$10, 0);
                if (target == null)
                {
                    target = (org.apache.xmlbeans.SimpleValue)get_store().add_element_user(CRITICALCAREDISCHARGEDESTINATION$10);
                }
                target.setEnumValue(criticalCareDischargeDestination);
            }
        }
        
        /**
         * Sets (as xml) the "CriticalCareDischargeDestination" element
         */
        public void xsetCriticalCareDischargeDestination(uk.nhs.nhsia.datastandards.ecds.CriticalCareDischargeDestinationType criticalCareDischargeDestination)
        {
            synchronized (monitor())
            {
                check_orphaned();
                uk.nhs.nhsia.datastandards.ecds.CriticalCareDischargeDestinationType target = null;
                target = (uk.nhs.nhsia.datastandards.ecds.CriticalCareDischargeDestinationType)get_store().find_element_user(CRITICALCAREDISCHARGEDESTINATION$10, 0);
                if (target == null)
                {
                    target = (uk.nhs.nhsia.datastandards.ecds.CriticalCareDischargeDestinationType)get_store().add_element_user(CRITICALCAREDISCHARGEDESTINATION$10);
                }
                target.set(criticalCareDischargeDestination);
            }
        }
        
        /**
         * Unsets the "CriticalCareDischargeDestination" element
         */
        public void unsetCriticalCareDischargeDestination()
        {
            synchronized (monitor())
            {
                check_orphaned();
                get_store().remove_element(CRITICALCAREDISCHARGEDESTINATION$10, 0);
            }
        }
        
        /**
         * Gets the "CriticalCareDischargeLocation" element
         */
        public uk.nhs.nhsia.datastandards.ecds.CriticalCareDischargeLocationType.Enum getCriticalCareDischargeLocation()
        {
            synchronized (monitor())
            {
                check_orphaned();
                org.apache.xmlbeans.SimpleValue target = null;
                target = (org.apache.xmlbeans.SimpleValue)get_store().find_element_user(CRITICALCAREDISCHARGELOCATION$12, 0);
                if (target == null)
                {
                    return null;
                }
                return (uk.nhs.nhsia.datastandards.ecds.CriticalCareDischargeLocationType.Enum)target.getEnumValue();
            }
        }
        
        /**
         * Gets (as xml) the "CriticalCareDischargeLocation" element
         */
        public uk.nhs.nhsia.datastandards.ecds.CriticalCareDischargeLocationType xgetCriticalCareDischargeLocation()
        {
            synchronized (monitor())
            {
                check_orphaned();
                uk.nhs.nhsia.datastandards.ecds.CriticalCareDischargeLocationType target = null;
                target = (uk.nhs.nhsia.datastandards.ecds.CriticalCareDischargeLocationType)get_store().find_element_user(CRITICALCAREDISCHARGELOCATION$12, 0);
                return target;
            }
        }
        
        /**
         * True if has "CriticalCareDischargeLocation" element
         */
        public boolean isSetCriticalCareDischargeLocation()
        {
            synchronized (monitor())
            {
                check_orphaned();
                return get_store().count_elements(CRITICALCAREDISCHARGELOCATION$12) != 0;
            }
        }
        
        /**
         * Sets the "CriticalCareDischargeLocation" element
         */
        public void setCriticalCareDischargeLocation(uk.nhs.nhsia.datastandards.ecds.CriticalCareDischargeLocationType.Enum criticalCareDischargeLocation)
        {
            synchronized (monitor())
            {
                check_orphaned();
                org.apache.xmlbeans.SimpleValue target = null;
                target = (org.apache.xmlbeans.SimpleValue)get_store().find_element_user(CRITICALCAREDISCHARGELOCATION$12, 0);
                if (target == null)
                {
                    target = (org.apache.xmlbeans.SimpleValue)get_store().add_element_user(CRITICALCAREDISCHARGELOCATION$12);
                }
                target.setEnumValue(criticalCareDischargeLocation);
            }
        }
        
        /**
         * Sets (as xml) the "CriticalCareDischargeLocation" element
         */
        public void xsetCriticalCareDischargeLocation(uk.nhs.nhsia.datastandards.ecds.CriticalCareDischargeLocationType criticalCareDischargeLocation)
        {
            synchronized (monitor())
            {
                check_orphaned();
                uk.nhs.nhsia.datastandards.ecds.CriticalCareDischargeLocationType target = null;
                target = (uk.nhs.nhsia.datastandards.ecds.CriticalCareDischargeLocationType)get_store().find_element_user(CRITICALCAREDISCHARGELOCATION$12, 0);
                if (target == null)
                {
                    target = (uk.nhs.nhsia.datastandards.ecds.CriticalCareDischargeLocationType)get_store().add_element_user(CRITICALCAREDISCHARGELOCATION$12);
                }
                target.set(criticalCareDischargeLocation);
            }
        }
        
        /**
         * Unsets the "CriticalCareDischargeLocation" element
         */
        public void unsetCriticalCareDischargeLocation()
        {
            synchronized (monitor())
            {
                check_orphaned();
                get_store().remove_element(CRITICALCAREDISCHARGELOCATION$12, 0);
            }
        }
    }
}
