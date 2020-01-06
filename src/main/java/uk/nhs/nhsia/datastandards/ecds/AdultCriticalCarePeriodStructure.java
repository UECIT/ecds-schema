/*
 * XML Type:  AdultCriticalCarePeriod_Structure
 * Namespace: http://www.nhsia.nhs.uk/DataStandards/XMLschema/CDS/ns
 * Java type: uk.nhs.nhsia.datastandards.ecds.AdultCriticalCarePeriodStructure
 *
 * Automatically generated - do not modify.
 */
package uk.nhs.nhsia.datastandards.ecds;


/**
 * An XML AdultCriticalCarePeriod_Structure(@http://www.nhsia.nhs.uk/DataStandards/XMLschema/CDS/ns).
 *
 * This is a complex type.
 */
public interface AdultCriticalCarePeriodStructure extends org.apache.xmlbeans.XmlObject
{
    public static final org.apache.xmlbeans.SchemaType type = (org.apache.xmlbeans.SchemaType)
        org.apache.xmlbeans.XmlBeans.typeSystemForClassLoader(AdultCriticalCarePeriodStructure.class.getClassLoader(), "schemaorg_apache_xmlbeans.system.s30C1180FF47174E0C8A992A2D657328B").resolveHandle("adultcriticalcareperiodstructure5624type");
    
    /**
     * Gets the "ACC_AdmissionCharacteristics" element
     */
    uk.nhs.nhsia.datastandards.ecds.AdultCriticalCarePeriodStructure.ACCAdmissionCharacteristics getACCAdmissionCharacteristics();
    
    /**
     * Sets the "ACC_AdmissionCharacteristics" element
     */
    void setACCAdmissionCharacteristics(uk.nhs.nhsia.datastandards.ecds.AdultCriticalCarePeriodStructure.ACCAdmissionCharacteristics accAdmissionCharacteristics);
    
    /**
     * Appends and returns a new empty "ACC_AdmissionCharacteristics" element
     */
    uk.nhs.nhsia.datastandards.ecds.AdultCriticalCarePeriodStructure.ACCAdmissionCharacteristics addNewACCAdmissionCharacteristics();
    
    /**
     * Gets the "ACC_CareActivityGroup" element
     */
    uk.nhs.nhsia.datastandards.ecds.AdultCriticalCarePeriodStructure.ACCCareActivityGroup getACCCareActivityGroup();
    
    /**
     * Sets the "ACC_CareActivityGroup" element
     */
    void setACCCareActivityGroup(uk.nhs.nhsia.datastandards.ecds.AdultCriticalCarePeriodStructure.ACCCareActivityGroup accCareActivityGroup);
    
    /**
     * Appends and returns a new empty "ACC_CareActivityGroup" element
     */
    uk.nhs.nhsia.datastandards.ecds.AdultCriticalCarePeriodStructure.ACCCareActivityGroup addNewACCCareActivityGroup();
    
    /**
     * Gets the "ACC_DischargeCharacteristics" element
     */
    uk.nhs.nhsia.datastandards.ecds.AdultCriticalCarePeriodStructure.ACCDischargeCharacteristics getACCDischargeCharacteristics();
    
    /**
     * True if has "ACC_DischargeCharacteristics" element
     */
    boolean isSetACCDischargeCharacteristics();
    
    /**
     * Sets the "ACC_DischargeCharacteristics" element
     */
    void setACCDischargeCharacteristics(uk.nhs.nhsia.datastandards.ecds.AdultCriticalCarePeriodStructure.ACCDischargeCharacteristics accDischargeCharacteristics);
    
    /**
     * Appends and returns a new empty "ACC_DischargeCharacteristics" element
     */
    uk.nhs.nhsia.datastandards.ecds.AdultCriticalCarePeriodStructure.ACCDischargeCharacteristics addNewACCDischargeCharacteristics();
    
    /**
     * Unsets the "ACC_DischargeCharacteristics" element
     */
    void unsetACCDischargeCharacteristics();
    
    /**
     * Gets the "AdultCriticalCareStructure" attribute
     */
    uk.nhs.nhsia.datastandards.ecds.CriticalCareUnitFunctionAdultType.Enum getAdultCriticalCareStructure();
    
    /**
     * Gets (as xml) the "AdultCriticalCareStructure" attribute
     */
    uk.nhs.nhsia.datastandards.ecds.CriticalCareUnitFunctionAdultType xgetAdultCriticalCareStructure();
    
    /**
     * Sets the "AdultCriticalCareStructure" attribute
     */
    void setAdultCriticalCareStructure(uk.nhs.nhsia.datastandards.ecds.CriticalCareUnitFunctionAdultType.Enum adultCriticalCareStructure);
    
    /**
     * Sets (as xml) the "AdultCriticalCareStructure" attribute
     */
    void xsetAdultCriticalCareStructure(uk.nhs.nhsia.datastandards.ecds.CriticalCareUnitFunctionAdultType adultCriticalCareStructure);
    
    /**
     * An XML ACC_AdmissionCharacteristics(@http://www.nhsia.nhs.uk/DataStandards/XMLschema/CDS/ns).
     *
     * This is a complex type.
     */
    public interface ACCAdmissionCharacteristics extends org.apache.xmlbeans.XmlObject
    {
        public static final org.apache.xmlbeans.SchemaType type = (org.apache.xmlbeans.SchemaType)
            org.apache.xmlbeans.XmlBeans.typeSystemForClassLoader(ACCAdmissionCharacteristics.class.getClassLoader(), "schemaorg_apache_xmlbeans.system.s30C1180FF47174E0C8A992A2D657328B").resolveHandle("accadmissioncharacteristics3abbelemtype");
        
        /**
         * Gets the "CriticalCareLocalIdentifier" element
         */
        java.lang.String getCriticalCareLocalIdentifier();
        
        /**
         * Gets (as xml) the "CriticalCareLocalIdentifier" element
         */
        uk.nhs.nhsia.datastandards.ecds.CriticalCareLocalIdentifierType xgetCriticalCareLocalIdentifier();
        
        /**
         * Sets the "CriticalCareLocalIdentifier" element
         */
        void setCriticalCareLocalIdentifier(java.lang.String criticalCareLocalIdentifier);
        
        /**
         * Sets (as xml) the "CriticalCareLocalIdentifier" element
         */
        void xsetCriticalCareLocalIdentifier(uk.nhs.nhsia.datastandards.ecds.CriticalCareLocalIdentifierType criticalCareLocalIdentifier);
        
        /**
         * Gets the "CriticalCareStartDate" element
         */
        java.util.Calendar getCriticalCareStartDate();
        
        /**
         * Gets (as xml) the "CriticalCareStartDate" element
         */
        uk.nhs.nhsia.datastandards.ecds.CriticalCareStartDateType xgetCriticalCareStartDate();
        
        /**
         * Sets the "CriticalCareStartDate" element
         */
        void setCriticalCareStartDate(java.util.Calendar criticalCareStartDate);
        
        /**
         * Sets (as xml) the "CriticalCareStartDate" element
         */
        void xsetCriticalCareStartDate(uk.nhs.nhsia.datastandards.ecds.CriticalCareStartDateType criticalCareStartDate);
        
        /**
         * Gets the "CriticalCareStartTime" element
         */
        java.util.Calendar getCriticalCareStartTime();
        
        /**
         * Gets (as xml) the "CriticalCareStartTime" element
         */
        uk.nhs.nhsia.datastandards.ecds.CriticalCareStartTimeType xgetCriticalCareStartTime();
        
        /**
         * True if has "CriticalCareStartTime" element
         */
        boolean isSetCriticalCareStartTime();
        
        /**
         * Sets the "CriticalCareStartTime" element
         */
        void setCriticalCareStartTime(java.util.Calendar criticalCareStartTime);
        
        /**
         * Sets (as xml) the "CriticalCareStartTime" element
         */
        void xsetCriticalCareStartTime(uk.nhs.nhsia.datastandards.ecds.CriticalCareStartTimeType criticalCareStartTime);
        
        /**
         * Unsets the "CriticalCareStartTime" element
         */
        void unsetCriticalCareStartTime();
        
        /**
         * Gets the "CriticalCareUnitFunction" element
         */
        uk.nhs.nhsia.datastandards.ecds.CriticalCareUnitFunctionAdultType.Enum getCriticalCareUnitFunction();
        
        /**
         * Gets (as xml) the "CriticalCareUnitFunction" element
         */
        uk.nhs.nhsia.datastandards.ecds.CriticalCareUnitFunctionAdultType xgetCriticalCareUnitFunction();
        
        /**
         * Sets the "CriticalCareUnitFunction" element
         */
        void setCriticalCareUnitFunction(uk.nhs.nhsia.datastandards.ecds.CriticalCareUnitFunctionAdultType.Enum criticalCareUnitFunction);
        
        /**
         * Sets (as xml) the "CriticalCareUnitFunction" element
         */
        void xsetCriticalCareUnitFunction(uk.nhs.nhsia.datastandards.ecds.CriticalCareUnitFunctionAdultType criticalCareUnitFunction);
        
        /**
         * Gets the "CriticalCareUnitBedConfiguration" element
         */
        uk.nhs.nhsia.datastandards.ecds.CriticalCareUnitBedConfigurationType.Enum getCriticalCareUnitBedConfiguration();
        
        /**
         * Gets (as xml) the "CriticalCareUnitBedConfiguration" element
         */
        uk.nhs.nhsia.datastandards.ecds.CriticalCareUnitBedConfigurationType xgetCriticalCareUnitBedConfiguration();
        
        /**
         * True if has "CriticalCareUnitBedConfiguration" element
         */
        boolean isSetCriticalCareUnitBedConfiguration();
        
        /**
         * Sets the "CriticalCareUnitBedConfiguration" element
         */
        void setCriticalCareUnitBedConfiguration(uk.nhs.nhsia.datastandards.ecds.CriticalCareUnitBedConfigurationType.Enum criticalCareUnitBedConfiguration);
        
        /**
         * Sets (as xml) the "CriticalCareUnitBedConfiguration" element
         */
        void xsetCriticalCareUnitBedConfiguration(uk.nhs.nhsia.datastandards.ecds.CriticalCareUnitBedConfigurationType criticalCareUnitBedConfiguration);
        
        /**
         * Unsets the "CriticalCareUnitBedConfiguration" element
         */
        void unsetCriticalCareUnitBedConfiguration();
        
        /**
         * Gets the "CriticalCareAdmissionSource" element
         */
        uk.nhs.nhsia.datastandards.ecds.CriticalCareAdmissionSourceType.Enum getCriticalCareAdmissionSource();
        
        /**
         * Gets (as xml) the "CriticalCareAdmissionSource" element
         */
        uk.nhs.nhsia.datastandards.ecds.CriticalCareAdmissionSourceType xgetCriticalCareAdmissionSource();
        
        /**
         * True if has "CriticalCareAdmissionSource" element
         */
        boolean isSetCriticalCareAdmissionSource();
        
        /**
         * Sets the "CriticalCareAdmissionSource" element
         */
        void setCriticalCareAdmissionSource(uk.nhs.nhsia.datastandards.ecds.CriticalCareAdmissionSourceType.Enum criticalCareAdmissionSource);
        
        /**
         * Sets (as xml) the "CriticalCareAdmissionSource" element
         */
        void xsetCriticalCareAdmissionSource(uk.nhs.nhsia.datastandards.ecds.CriticalCareAdmissionSourceType criticalCareAdmissionSource);
        
        /**
         * Unsets the "CriticalCareAdmissionSource" element
         */
        void unsetCriticalCareAdmissionSource();
        
        /**
         * Gets the "CriticalCareSourceLocation" element
         */
        uk.nhs.nhsia.datastandards.ecds.CriticalCareSourceLocationType.Enum getCriticalCareSourceLocation();
        
        /**
         * Gets (as xml) the "CriticalCareSourceLocation" element
         */
        uk.nhs.nhsia.datastandards.ecds.CriticalCareSourceLocationType xgetCriticalCareSourceLocation();
        
        /**
         * True if has "CriticalCareSourceLocation" element
         */
        boolean isSetCriticalCareSourceLocation();
        
        /**
         * Sets the "CriticalCareSourceLocation" element
         */
        void setCriticalCareSourceLocation(uk.nhs.nhsia.datastandards.ecds.CriticalCareSourceLocationType.Enum criticalCareSourceLocation);
        
        /**
         * Sets (as xml) the "CriticalCareSourceLocation" element
         */
        void xsetCriticalCareSourceLocation(uk.nhs.nhsia.datastandards.ecds.CriticalCareSourceLocationType criticalCareSourceLocation);
        
        /**
         * Unsets the "CriticalCareSourceLocation" element
         */
        void unsetCriticalCareSourceLocation();
        
        /**
         * Gets the "CriticalCareAdmissionType" element
         */
        uk.nhs.nhsia.datastandards.ecds.CriticalCareAdmissionTypeType.Enum getCriticalCareAdmissionType();
        
        /**
         * Gets (as xml) the "CriticalCareAdmissionType" element
         */
        uk.nhs.nhsia.datastandards.ecds.CriticalCareAdmissionTypeType xgetCriticalCareAdmissionType();
        
        /**
         * True if has "CriticalCareAdmissionType" element
         */
        boolean isSetCriticalCareAdmissionType();
        
        /**
         * Sets the "CriticalCareAdmissionType" element
         */
        void setCriticalCareAdmissionType(uk.nhs.nhsia.datastandards.ecds.CriticalCareAdmissionTypeType.Enum criticalCareAdmissionType);
        
        /**
         * Sets (as xml) the "CriticalCareAdmissionType" element
         */
        void xsetCriticalCareAdmissionType(uk.nhs.nhsia.datastandards.ecds.CriticalCareAdmissionTypeType criticalCareAdmissionType);
        
        /**
         * Unsets the "CriticalCareAdmissionType" element
         */
        void unsetCriticalCareAdmissionType();
        
        /**
         * A factory class with static methods for creating instances
         * of this type.
         */
        
        public static final class Factory
        {
            public static uk.nhs.nhsia.datastandards.ecds.AdultCriticalCarePeriodStructure.ACCAdmissionCharacteristics newInstance() {
              return (uk.nhs.nhsia.datastandards.ecds.AdultCriticalCarePeriodStructure.ACCAdmissionCharacteristics) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().newInstance( type, null ); }
            
            public static uk.nhs.nhsia.datastandards.ecds.AdultCriticalCarePeriodStructure.ACCAdmissionCharacteristics newInstance(org.apache.xmlbeans.XmlOptions options) {
              return (uk.nhs.nhsia.datastandards.ecds.AdultCriticalCarePeriodStructure.ACCAdmissionCharacteristics) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().newInstance( type, options ); }
            
            private Factory() { } // No instance of this class allowed
        }
    }
    
    /**
     * An XML ACC_CareActivityGroup(@http://www.nhsia.nhs.uk/DataStandards/XMLschema/CDS/ns).
     *
     * This is a complex type.
     */
    public interface ACCCareActivityGroup extends org.apache.xmlbeans.XmlObject
    {
        public static final org.apache.xmlbeans.SchemaType type = (org.apache.xmlbeans.SchemaType)
            org.apache.xmlbeans.XmlBeans.typeSystemForClassLoader(ACCCareActivityGroup.class.getClassLoader(), "schemaorg_apache_xmlbeans.system.s30C1180FF47174E0C8A992A2D657328B").resolveHandle("acccareactivitygroup2af7elemtype");
        
        /**
         * Gets the "AdvancedRespiratorySupportDays" element
         */
        int getAdvancedRespiratorySupportDays();
        
        /**
         * Gets (as xml) the "AdvancedRespiratorySupportDays" element
         */
        uk.nhs.nhsia.datastandards.ecds.AdvancedRespiratorySupportDaysType xgetAdvancedRespiratorySupportDays();
        
        /**
         * True if has "AdvancedRespiratorySupportDays" element
         */
        boolean isSetAdvancedRespiratorySupportDays();
        
        /**
         * Sets the "AdvancedRespiratorySupportDays" element
         */
        void setAdvancedRespiratorySupportDays(int advancedRespiratorySupportDays);
        
        /**
         * Sets (as xml) the "AdvancedRespiratorySupportDays" element
         */
        void xsetAdvancedRespiratorySupportDays(uk.nhs.nhsia.datastandards.ecds.AdvancedRespiratorySupportDaysType advancedRespiratorySupportDays);
        
        /**
         * Unsets the "AdvancedRespiratorySupportDays" element
         */
        void unsetAdvancedRespiratorySupportDays();
        
        /**
         * Gets the "BasicRespiratorySupportDays" element
         */
        int getBasicRespiratorySupportDays();
        
        /**
         * Gets (as xml) the "BasicRespiratorySupportDays" element
         */
        uk.nhs.nhsia.datastandards.ecds.BasicRespiratorySupportDaysType xgetBasicRespiratorySupportDays();
        
        /**
         * True if has "BasicRespiratorySupportDays" element
         */
        boolean isSetBasicRespiratorySupportDays();
        
        /**
         * Sets the "BasicRespiratorySupportDays" element
         */
        void setBasicRespiratorySupportDays(int basicRespiratorySupportDays);
        
        /**
         * Sets (as xml) the "BasicRespiratorySupportDays" element
         */
        void xsetBasicRespiratorySupportDays(uk.nhs.nhsia.datastandards.ecds.BasicRespiratorySupportDaysType basicRespiratorySupportDays);
        
        /**
         * Unsets the "BasicRespiratorySupportDays" element
         */
        void unsetBasicRespiratorySupportDays();
        
        /**
         * Gets the "AdvancedCardiovascularSupportDays" element
         */
        int getAdvancedCardiovascularSupportDays();
        
        /**
         * Gets (as xml) the "AdvancedCardiovascularSupportDays" element
         */
        uk.nhs.nhsia.datastandards.ecds.AdvancedCardiovascularSupportDaysType xgetAdvancedCardiovascularSupportDays();
        
        /**
         * True if has "AdvancedCardiovascularSupportDays" element
         */
        boolean isSetAdvancedCardiovascularSupportDays();
        
        /**
         * Sets the "AdvancedCardiovascularSupportDays" element
         */
        void setAdvancedCardiovascularSupportDays(int advancedCardiovascularSupportDays);
        
        /**
         * Sets (as xml) the "AdvancedCardiovascularSupportDays" element
         */
        void xsetAdvancedCardiovascularSupportDays(uk.nhs.nhsia.datastandards.ecds.AdvancedCardiovascularSupportDaysType advancedCardiovascularSupportDays);
        
        /**
         * Unsets the "AdvancedCardiovascularSupportDays" element
         */
        void unsetAdvancedCardiovascularSupportDays();
        
        /**
         * Gets the "BasicCardiovascularSupportDays" element
         */
        int getBasicCardiovascularSupportDays();
        
        /**
         * Gets (as xml) the "BasicCardiovascularSupportDays" element
         */
        uk.nhs.nhsia.datastandards.ecds.BasicCardiovascularSupportDaysType xgetBasicCardiovascularSupportDays();
        
        /**
         * True if has "BasicCardiovascularSupportDays" element
         */
        boolean isSetBasicCardiovascularSupportDays();
        
        /**
         * Sets the "BasicCardiovascularSupportDays" element
         */
        void setBasicCardiovascularSupportDays(int basicCardiovascularSupportDays);
        
        /**
         * Sets (as xml) the "BasicCardiovascularSupportDays" element
         */
        void xsetBasicCardiovascularSupportDays(uk.nhs.nhsia.datastandards.ecds.BasicCardiovascularSupportDaysType basicCardiovascularSupportDays);
        
        /**
         * Unsets the "BasicCardiovascularSupportDays" element
         */
        void unsetBasicCardiovascularSupportDays();
        
        /**
         * Gets the "RenalSupportDays" element
         */
        int getRenalSupportDays();
        
        /**
         * Gets (as xml) the "RenalSupportDays" element
         */
        uk.nhs.nhsia.datastandards.ecds.RenalSupportDaysType xgetRenalSupportDays();
        
        /**
         * True if has "RenalSupportDays" element
         */
        boolean isSetRenalSupportDays();
        
        /**
         * Sets the "RenalSupportDays" element
         */
        void setRenalSupportDays(int renalSupportDays);
        
        /**
         * Sets (as xml) the "RenalSupportDays" element
         */
        void xsetRenalSupportDays(uk.nhs.nhsia.datastandards.ecds.RenalSupportDaysType renalSupportDays);
        
        /**
         * Unsets the "RenalSupportDays" element
         */
        void unsetRenalSupportDays();
        
        /**
         * Gets the "NeurologicalSupportDays" element
         */
        int getNeurologicalSupportDays();
        
        /**
         * Gets (as xml) the "NeurologicalSupportDays" element
         */
        uk.nhs.nhsia.datastandards.ecds.NeurologicalSupportDaysType xgetNeurologicalSupportDays();
        
        /**
         * True if has "NeurologicalSupportDays" element
         */
        boolean isSetNeurologicalSupportDays();
        
        /**
         * Sets the "NeurologicalSupportDays" element
         */
        void setNeurologicalSupportDays(int neurologicalSupportDays);
        
        /**
         * Sets (as xml) the "NeurologicalSupportDays" element
         */
        void xsetNeurologicalSupportDays(uk.nhs.nhsia.datastandards.ecds.NeurologicalSupportDaysType neurologicalSupportDays);
        
        /**
         * Unsets the "NeurologicalSupportDays" element
         */
        void unsetNeurologicalSupportDays();
        
        /**
         * Gets the "GastroIntestinalSupportDays" element
         */
        int getGastroIntestinalSupportDays();
        
        /**
         * Gets (as xml) the "GastroIntestinalSupportDays" element
         */
        uk.nhs.nhsia.datastandards.ecds.GastroIntestinalSupportDaysType xgetGastroIntestinalSupportDays();
        
        /**
         * True if has "GastroIntestinalSupportDays" element
         */
        boolean isSetGastroIntestinalSupportDays();
        
        /**
         * Sets the "GastroIntestinalSupportDays" element
         */
        void setGastroIntestinalSupportDays(int gastroIntestinalSupportDays);
        
        /**
         * Sets (as xml) the "GastroIntestinalSupportDays" element
         */
        void xsetGastroIntestinalSupportDays(uk.nhs.nhsia.datastandards.ecds.GastroIntestinalSupportDaysType gastroIntestinalSupportDays);
        
        /**
         * Unsets the "GastroIntestinalSupportDays" element
         */
        void unsetGastroIntestinalSupportDays();
        
        /**
         * Gets the "DermatologicalSupportDays" element
         */
        int getDermatologicalSupportDays();
        
        /**
         * Gets (as xml) the "DermatologicalSupportDays" element
         */
        uk.nhs.nhsia.datastandards.ecds.DermatologicalSupportDaysType xgetDermatologicalSupportDays();
        
        /**
         * True if has "DermatologicalSupportDays" element
         */
        boolean isSetDermatologicalSupportDays();
        
        /**
         * Sets the "DermatologicalSupportDays" element
         */
        void setDermatologicalSupportDays(int dermatologicalSupportDays);
        
        /**
         * Sets (as xml) the "DermatologicalSupportDays" element
         */
        void xsetDermatologicalSupportDays(uk.nhs.nhsia.datastandards.ecds.DermatologicalSupportDaysType dermatologicalSupportDays);
        
        /**
         * Unsets the "DermatologicalSupportDays" element
         */
        void unsetDermatologicalSupportDays();
        
        /**
         * Gets the "LiverSupportDays" element
         */
        int getLiverSupportDays();
        
        /**
         * Gets (as xml) the "LiverSupportDays" element
         */
        uk.nhs.nhsia.datastandards.ecds.LiverSupportDaysType xgetLiverSupportDays();
        
        /**
         * True if has "LiverSupportDays" element
         */
        boolean isSetLiverSupportDays();
        
        /**
         * Sets the "LiverSupportDays" element
         */
        void setLiverSupportDays(int liverSupportDays);
        
        /**
         * Sets (as xml) the "LiverSupportDays" element
         */
        void xsetLiverSupportDays(uk.nhs.nhsia.datastandards.ecds.LiverSupportDaysType liverSupportDays);
        
        /**
         * Unsets the "LiverSupportDays" element
         */
        void unsetLiverSupportDays();
        
        /**
         * Gets the "OrganSupportMaximum" element
         */
        uk.nhs.nhsia.datastandards.ecds.OrganSupportMaximumType.Enum getOrganSupportMaximum();
        
        /**
         * Gets (as xml) the "OrganSupportMaximum" element
         */
        uk.nhs.nhsia.datastandards.ecds.OrganSupportMaximumType xgetOrganSupportMaximum();
        
        /**
         * True if has "OrganSupportMaximum" element
         */
        boolean isSetOrganSupportMaximum();
        
        /**
         * Sets the "OrganSupportMaximum" element
         */
        void setOrganSupportMaximum(uk.nhs.nhsia.datastandards.ecds.OrganSupportMaximumType.Enum organSupportMaximum);
        
        /**
         * Sets (as xml) the "OrganSupportMaximum" element
         */
        void xsetOrganSupportMaximum(uk.nhs.nhsia.datastandards.ecds.OrganSupportMaximumType organSupportMaximum);
        
        /**
         * Unsets the "OrganSupportMaximum" element
         */
        void unsetOrganSupportMaximum();
        
        /**
         * Gets the "CriticalCareLevel2Days" element
         */
        int getCriticalCareLevel2Days();
        
        /**
         * Gets (as xml) the "CriticalCareLevel2Days" element
         */
        uk.nhs.nhsia.datastandards.ecds.CriticalCareLevel2DaysType xgetCriticalCareLevel2Days();
        
        /**
         * True if has "CriticalCareLevel2Days" element
         */
        boolean isSetCriticalCareLevel2Days();
        
        /**
         * Sets the "CriticalCareLevel2Days" element
         */
        void setCriticalCareLevel2Days(int criticalCareLevel2Days);
        
        /**
         * Sets (as xml) the "CriticalCareLevel2Days" element
         */
        void xsetCriticalCareLevel2Days(uk.nhs.nhsia.datastandards.ecds.CriticalCareLevel2DaysType criticalCareLevel2Days);
        
        /**
         * Unsets the "CriticalCareLevel2Days" element
         */
        void unsetCriticalCareLevel2Days();
        
        /**
         * Gets the "CriticalCareLevel3Days" element
         */
        int getCriticalCareLevel3Days();
        
        /**
         * Gets (as xml) the "CriticalCareLevel3Days" element
         */
        uk.nhs.nhsia.datastandards.ecds.CriticalCareLevel3DaysType xgetCriticalCareLevel3Days();
        
        /**
         * True if has "CriticalCareLevel3Days" element
         */
        boolean isSetCriticalCareLevel3Days();
        
        /**
         * Sets the "CriticalCareLevel3Days" element
         */
        void setCriticalCareLevel3Days(int criticalCareLevel3Days);
        
        /**
         * Sets (as xml) the "CriticalCareLevel3Days" element
         */
        void xsetCriticalCareLevel3Days(uk.nhs.nhsia.datastandards.ecds.CriticalCareLevel3DaysType criticalCareLevel3Days);
        
        /**
         * Unsets the "CriticalCareLevel3Days" element
         */
        void unsetCriticalCareLevel3Days();
        
        /**
         * A factory class with static methods for creating instances
         * of this type.
         */
        
        public static final class Factory
        {
            public static uk.nhs.nhsia.datastandards.ecds.AdultCriticalCarePeriodStructure.ACCCareActivityGroup newInstance() {
              return (uk.nhs.nhsia.datastandards.ecds.AdultCriticalCarePeriodStructure.ACCCareActivityGroup) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().newInstance( type, null ); }
            
            public static uk.nhs.nhsia.datastandards.ecds.AdultCriticalCarePeriodStructure.ACCCareActivityGroup newInstance(org.apache.xmlbeans.XmlOptions options) {
              return (uk.nhs.nhsia.datastandards.ecds.AdultCriticalCarePeriodStructure.ACCCareActivityGroup) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().newInstance( type, options ); }
            
            private Factory() { } // No instance of this class allowed
        }
    }
    
    /**
     * An XML ACC_DischargeCharacteristics(@http://www.nhsia.nhs.uk/DataStandards/XMLschema/CDS/ns).
     *
     * This is a complex type.
     */
    public interface ACCDischargeCharacteristics extends org.apache.xmlbeans.XmlObject
    {
        public static final org.apache.xmlbeans.SchemaType type = (org.apache.xmlbeans.SchemaType)
            org.apache.xmlbeans.XmlBeans.typeSystemForClassLoader(ACCDischargeCharacteristics.class.getClassLoader(), "schemaorg_apache_xmlbeans.system.s30C1180FF47174E0C8A992A2D657328B").resolveHandle("accdischargecharacteristics6834elemtype");
        
        /**
         * Gets the "CriticalCareDischargeDate" element
         */
        java.util.Calendar getCriticalCareDischargeDate();
        
        /**
         * Gets (as xml) the "CriticalCareDischargeDate" element
         */
        uk.nhs.nhsia.datastandards.ecds.CriticalCareDischargeDateType xgetCriticalCareDischargeDate();
        
        /**
         * Sets the "CriticalCareDischargeDate" element
         */
        void setCriticalCareDischargeDate(java.util.Calendar criticalCareDischargeDate);
        
        /**
         * Sets (as xml) the "CriticalCareDischargeDate" element
         */
        void xsetCriticalCareDischargeDate(uk.nhs.nhsia.datastandards.ecds.CriticalCareDischargeDateType criticalCareDischargeDate);
        
        /**
         * Gets the "CriticalCareDischargeTime" element
         */
        java.util.Calendar getCriticalCareDischargeTime();
        
        /**
         * Gets (as xml) the "CriticalCareDischargeTime" element
         */
        uk.nhs.nhsia.datastandards.ecds.CriticalCareDischargeTimeType xgetCriticalCareDischargeTime();
        
        /**
         * Sets the "CriticalCareDischargeTime" element
         */
        void setCriticalCareDischargeTime(java.util.Calendar criticalCareDischargeTime);
        
        /**
         * Sets (as xml) the "CriticalCareDischargeTime" element
         */
        void xsetCriticalCareDischargeTime(uk.nhs.nhsia.datastandards.ecds.CriticalCareDischargeTimeType criticalCareDischargeTime);
        
        /**
         * Gets the "CriticalCareDischargeReadyDate" element
         */
        java.util.Calendar getCriticalCareDischargeReadyDate();
        
        /**
         * Gets (as xml) the "CriticalCareDischargeReadyDate" element
         */
        uk.nhs.nhsia.datastandards.ecds.CriticalCareDischargeReadyDateType xgetCriticalCareDischargeReadyDate();
        
        /**
         * True if has "CriticalCareDischargeReadyDate" element
         */
        boolean isSetCriticalCareDischargeReadyDate();
        
        /**
         * Sets the "CriticalCareDischargeReadyDate" element
         */
        void setCriticalCareDischargeReadyDate(java.util.Calendar criticalCareDischargeReadyDate);
        
        /**
         * Sets (as xml) the "CriticalCareDischargeReadyDate" element
         */
        void xsetCriticalCareDischargeReadyDate(uk.nhs.nhsia.datastandards.ecds.CriticalCareDischargeReadyDateType criticalCareDischargeReadyDate);
        
        /**
         * Unsets the "CriticalCareDischargeReadyDate" element
         */
        void unsetCriticalCareDischargeReadyDate();
        
        /**
         * Gets the "CriticalCareDischargeReadyTime" element
         */
        java.util.Calendar getCriticalCareDischargeReadyTime();
        
        /**
         * Gets (as xml) the "CriticalCareDischargeReadyTime" element
         */
        uk.nhs.nhsia.datastandards.ecds.CriticalCareDischargeReadyTimeType xgetCriticalCareDischargeReadyTime();
        
        /**
         * True if has "CriticalCareDischargeReadyTime" element
         */
        boolean isSetCriticalCareDischargeReadyTime();
        
        /**
         * Sets the "CriticalCareDischargeReadyTime" element
         */
        void setCriticalCareDischargeReadyTime(java.util.Calendar criticalCareDischargeReadyTime);
        
        /**
         * Sets (as xml) the "CriticalCareDischargeReadyTime" element
         */
        void xsetCriticalCareDischargeReadyTime(uk.nhs.nhsia.datastandards.ecds.CriticalCareDischargeReadyTimeType criticalCareDischargeReadyTime);
        
        /**
         * Unsets the "CriticalCareDischargeReadyTime" element
         */
        void unsetCriticalCareDischargeReadyTime();
        
        /**
         * Gets the "CriticalCareDischargeStatus" element
         */
        uk.nhs.nhsia.datastandards.ecds.CriticalCareDischargeStatusType.Enum getCriticalCareDischargeStatus();
        
        /**
         * Gets (as xml) the "CriticalCareDischargeStatus" element
         */
        uk.nhs.nhsia.datastandards.ecds.CriticalCareDischargeStatusType xgetCriticalCareDischargeStatus();
        
        /**
         * True if has "CriticalCareDischargeStatus" element
         */
        boolean isSetCriticalCareDischargeStatus();
        
        /**
         * Sets the "CriticalCareDischargeStatus" element
         */
        void setCriticalCareDischargeStatus(uk.nhs.nhsia.datastandards.ecds.CriticalCareDischargeStatusType.Enum criticalCareDischargeStatus);
        
        /**
         * Sets (as xml) the "CriticalCareDischargeStatus" element
         */
        void xsetCriticalCareDischargeStatus(uk.nhs.nhsia.datastandards.ecds.CriticalCareDischargeStatusType criticalCareDischargeStatus);
        
        /**
         * Unsets the "CriticalCareDischargeStatus" element
         */
        void unsetCriticalCareDischargeStatus();
        
        /**
         * Gets the "CriticalCareDischargeDestination" element
         */
        uk.nhs.nhsia.datastandards.ecds.CriticalCareDischargeDestinationType.Enum getCriticalCareDischargeDestination();
        
        /**
         * Gets (as xml) the "CriticalCareDischargeDestination" element
         */
        uk.nhs.nhsia.datastandards.ecds.CriticalCareDischargeDestinationType xgetCriticalCareDischargeDestination();
        
        /**
         * True if has "CriticalCareDischargeDestination" element
         */
        boolean isSetCriticalCareDischargeDestination();
        
        /**
         * Sets the "CriticalCareDischargeDestination" element
         */
        void setCriticalCareDischargeDestination(uk.nhs.nhsia.datastandards.ecds.CriticalCareDischargeDestinationType.Enum criticalCareDischargeDestination);
        
        /**
         * Sets (as xml) the "CriticalCareDischargeDestination" element
         */
        void xsetCriticalCareDischargeDestination(uk.nhs.nhsia.datastandards.ecds.CriticalCareDischargeDestinationType criticalCareDischargeDestination);
        
        /**
         * Unsets the "CriticalCareDischargeDestination" element
         */
        void unsetCriticalCareDischargeDestination();
        
        /**
         * Gets the "CriticalCareDischargeLocation" element
         */
        uk.nhs.nhsia.datastandards.ecds.CriticalCareDischargeLocationType.Enum getCriticalCareDischargeLocation();
        
        /**
         * Gets (as xml) the "CriticalCareDischargeLocation" element
         */
        uk.nhs.nhsia.datastandards.ecds.CriticalCareDischargeLocationType xgetCriticalCareDischargeLocation();
        
        /**
         * True if has "CriticalCareDischargeLocation" element
         */
        boolean isSetCriticalCareDischargeLocation();
        
        /**
         * Sets the "CriticalCareDischargeLocation" element
         */
        void setCriticalCareDischargeLocation(uk.nhs.nhsia.datastandards.ecds.CriticalCareDischargeLocationType.Enum criticalCareDischargeLocation);
        
        /**
         * Sets (as xml) the "CriticalCareDischargeLocation" element
         */
        void xsetCriticalCareDischargeLocation(uk.nhs.nhsia.datastandards.ecds.CriticalCareDischargeLocationType criticalCareDischargeLocation);
        
        /**
         * Unsets the "CriticalCareDischargeLocation" element
         */
        void unsetCriticalCareDischargeLocation();
        
        /**
         * A factory class with static methods for creating instances
         * of this type.
         */
        
        public static final class Factory
        {
            public static uk.nhs.nhsia.datastandards.ecds.AdultCriticalCarePeriodStructure.ACCDischargeCharacteristics newInstance() {
              return (uk.nhs.nhsia.datastandards.ecds.AdultCriticalCarePeriodStructure.ACCDischargeCharacteristics) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().newInstance( type, null ); }
            
            public static uk.nhs.nhsia.datastandards.ecds.AdultCriticalCarePeriodStructure.ACCDischargeCharacteristics newInstance(org.apache.xmlbeans.XmlOptions options) {
              return (uk.nhs.nhsia.datastandards.ecds.AdultCriticalCarePeriodStructure.ACCDischargeCharacteristics) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().newInstance( type, options ); }
            
            private Factory() { } // No instance of this class allowed
        }
    }
    
    /**
     * A factory class with static methods for creating instances
     * of this type.
     */
    
    public static final class Factory
    {
        public static uk.nhs.nhsia.datastandards.ecds.AdultCriticalCarePeriodStructure newInstance() {
          return (uk.nhs.nhsia.datastandards.ecds.AdultCriticalCarePeriodStructure) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().newInstance( type, null ); }
        
        public static uk.nhs.nhsia.datastandards.ecds.AdultCriticalCarePeriodStructure newInstance(org.apache.xmlbeans.XmlOptions options) {
          return (uk.nhs.nhsia.datastandards.ecds.AdultCriticalCarePeriodStructure) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().newInstance( type, options ); }
        
        /** @param xmlAsString the string value to parse */
        public static uk.nhs.nhsia.datastandards.ecds.AdultCriticalCarePeriodStructure parse(java.lang.String xmlAsString) throws org.apache.xmlbeans.XmlException {
          return (uk.nhs.nhsia.datastandards.ecds.AdultCriticalCarePeriodStructure) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( xmlAsString, type, null ); }
        
        public static uk.nhs.nhsia.datastandards.ecds.AdultCriticalCarePeriodStructure parse(java.lang.String xmlAsString, org.apache.xmlbeans.XmlOptions options) throws org.apache.xmlbeans.XmlException {
          return (uk.nhs.nhsia.datastandards.ecds.AdultCriticalCarePeriodStructure) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( xmlAsString, type, options ); }
        
        /** @param file the file from which to load an xml document */
        public static uk.nhs.nhsia.datastandards.ecds.AdultCriticalCarePeriodStructure parse(java.io.File file) throws org.apache.xmlbeans.XmlException, java.io.IOException {
          return (uk.nhs.nhsia.datastandards.ecds.AdultCriticalCarePeriodStructure) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( file, type, null ); }
        
        public static uk.nhs.nhsia.datastandards.ecds.AdultCriticalCarePeriodStructure parse(java.io.File file, org.apache.xmlbeans.XmlOptions options) throws org.apache.xmlbeans.XmlException, java.io.IOException {
          return (uk.nhs.nhsia.datastandards.ecds.AdultCriticalCarePeriodStructure) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( file, type, options ); }
        
        public static uk.nhs.nhsia.datastandards.ecds.AdultCriticalCarePeriodStructure parse(java.net.URL u) throws org.apache.xmlbeans.XmlException, java.io.IOException {
          return (uk.nhs.nhsia.datastandards.ecds.AdultCriticalCarePeriodStructure) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( u, type, null ); }
        
        public static uk.nhs.nhsia.datastandards.ecds.AdultCriticalCarePeriodStructure parse(java.net.URL u, org.apache.xmlbeans.XmlOptions options) throws org.apache.xmlbeans.XmlException, java.io.IOException {
          return (uk.nhs.nhsia.datastandards.ecds.AdultCriticalCarePeriodStructure) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( u, type, options ); }
        
        public static uk.nhs.nhsia.datastandards.ecds.AdultCriticalCarePeriodStructure parse(java.io.InputStream is) throws org.apache.xmlbeans.XmlException, java.io.IOException {
          return (uk.nhs.nhsia.datastandards.ecds.AdultCriticalCarePeriodStructure) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( is, type, null ); }
        
        public static uk.nhs.nhsia.datastandards.ecds.AdultCriticalCarePeriodStructure parse(java.io.InputStream is, org.apache.xmlbeans.XmlOptions options) throws org.apache.xmlbeans.XmlException, java.io.IOException {
          return (uk.nhs.nhsia.datastandards.ecds.AdultCriticalCarePeriodStructure) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( is, type, options ); }
        
        public static uk.nhs.nhsia.datastandards.ecds.AdultCriticalCarePeriodStructure parse(java.io.Reader r) throws org.apache.xmlbeans.XmlException, java.io.IOException {
          return (uk.nhs.nhsia.datastandards.ecds.AdultCriticalCarePeriodStructure) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( r, type, null ); }
        
        public static uk.nhs.nhsia.datastandards.ecds.AdultCriticalCarePeriodStructure parse(java.io.Reader r, org.apache.xmlbeans.XmlOptions options) throws org.apache.xmlbeans.XmlException, java.io.IOException {
          return (uk.nhs.nhsia.datastandards.ecds.AdultCriticalCarePeriodStructure) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( r, type, options ); }
        
        public static uk.nhs.nhsia.datastandards.ecds.AdultCriticalCarePeriodStructure parse(javax.xml.stream.XMLStreamReader sr) throws org.apache.xmlbeans.XmlException {
          return (uk.nhs.nhsia.datastandards.ecds.AdultCriticalCarePeriodStructure) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( sr, type, null ); }
        
        public static uk.nhs.nhsia.datastandards.ecds.AdultCriticalCarePeriodStructure parse(javax.xml.stream.XMLStreamReader sr, org.apache.xmlbeans.XmlOptions options) throws org.apache.xmlbeans.XmlException {
          return (uk.nhs.nhsia.datastandards.ecds.AdultCriticalCarePeriodStructure) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( sr, type, options ); }
        
        public static uk.nhs.nhsia.datastandards.ecds.AdultCriticalCarePeriodStructure parse(org.w3c.dom.Node node) throws org.apache.xmlbeans.XmlException {
          return (uk.nhs.nhsia.datastandards.ecds.AdultCriticalCarePeriodStructure) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( node, type, null ); }
        
        public static uk.nhs.nhsia.datastandards.ecds.AdultCriticalCarePeriodStructure parse(org.w3c.dom.Node node, org.apache.xmlbeans.XmlOptions options) throws org.apache.xmlbeans.XmlException {
          return (uk.nhs.nhsia.datastandards.ecds.AdultCriticalCarePeriodStructure) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( node, type, options ); }
        
        /** @deprecated {@link org.apache.xmlbeans.xml.stream.XMLInputStream} */
        public static uk.nhs.nhsia.datastandards.ecds.AdultCriticalCarePeriodStructure parse(org.apache.xmlbeans.xml.stream.XMLInputStream xis) throws org.apache.xmlbeans.XmlException, org.apache.xmlbeans.xml.stream.XMLStreamException {
          return (uk.nhs.nhsia.datastandards.ecds.AdultCriticalCarePeriodStructure) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( xis, type, null ); }
        
        /** @deprecated {@link org.apache.xmlbeans.xml.stream.XMLInputStream} */
        public static uk.nhs.nhsia.datastandards.ecds.AdultCriticalCarePeriodStructure parse(org.apache.xmlbeans.xml.stream.XMLInputStream xis, org.apache.xmlbeans.XmlOptions options) throws org.apache.xmlbeans.XmlException, org.apache.xmlbeans.xml.stream.XMLStreamException {
          return (uk.nhs.nhsia.datastandards.ecds.AdultCriticalCarePeriodStructure) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( xis, type, options ); }
        
        /** @deprecated {@link org.apache.xmlbeans.xml.stream.XMLInputStream} */
        public static org.apache.xmlbeans.xml.stream.XMLInputStream newValidatingXMLInputStream(org.apache.xmlbeans.xml.stream.XMLInputStream xis) throws org.apache.xmlbeans.XmlException, org.apache.xmlbeans.xml.stream.XMLStreamException {
          return org.apache.xmlbeans.XmlBeans.getContextTypeLoader().newValidatingXMLInputStream( xis, type, null ); }
        
        /** @deprecated {@link org.apache.xmlbeans.xml.stream.XMLInputStream} */
        public static org.apache.xmlbeans.xml.stream.XMLInputStream newValidatingXMLInputStream(org.apache.xmlbeans.xml.stream.XMLInputStream xis, org.apache.xmlbeans.XmlOptions options) throws org.apache.xmlbeans.XmlException, org.apache.xmlbeans.xml.stream.XMLStreamException {
          return org.apache.xmlbeans.XmlBeans.getContextTypeLoader().newValidatingXMLInputStream( xis, type, options ); }
        
        private Factory() { } // No instance of this class allowed
    }
}
