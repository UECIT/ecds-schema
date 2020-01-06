/*
 * XML Type:  ElectiveAdmissionListEntry_Structure
 * Namespace: http://www.nhsia.nhs.uk/DataStandards/XMLschema/CDS/ns
 * Java type: uk.nhs.nhsia.datastandards.ecds.ElectiveAdmissionListEntryStructure
 *
 * Automatically generated - do not modify.
 */
package uk.nhs.nhsia.datastandards.ecds;


/**
 * An XML ElectiveAdmissionListEntry_Structure(@http://www.nhsia.nhs.uk/DataStandards/XMLschema/CDS/ns).
 *
 * This is a complex type.
 */
public interface ElectiveAdmissionListEntryStructure extends org.apache.xmlbeans.XmlObject
{
    public static final org.apache.xmlbeans.SchemaType type = (org.apache.xmlbeans.SchemaType)
        org.apache.xmlbeans.XmlBeans.typeSystemForClassLoader(ElectiveAdmissionListEntryStructure.class.getClassLoader(), "schemaorg_apache_xmlbeans.system.s30C1180FF47174E0C8A992A2D657328B").resolveHandle("electiveadmissionlistentrystructure86e9type");
    
    /**
     * Gets the "ActivityCharacteristics" element
     */
    uk.nhs.nhsia.datastandards.ecds.ElectiveAdmissionListEntryStructure.ActivityCharacteristics getActivityCharacteristics();
    
    /**
     * Sets the "ActivityCharacteristics" element
     */
    void setActivityCharacteristics(uk.nhs.nhsia.datastandards.ecds.ElectiveAdmissionListEntryStructure.ActivityCharacteristics activityCharacteristics);
    
    /**
     * Appends and returns a new empty "ActivityCharacteristics" element
     */
    uk.nhs.nhsia.datastandards.ecds.ElectiveAdmissionListEntryStructure.ActivityCharacteristics addNewActivityCharacteristics();
    
    /**
     * Gets the "PersonGroup_Consultant" element
     */
    uk.nhs.nhsia.datastandards.ecds.PersonGroupConsultantStructure getPersonGroupConsultant();
    
    /**
     * True if has "PersonGroup_Consultant" element
     */
    boolean isSetPersonGroupConsultant();
    
    /**
     * Sets the "PersonGroup_Consultant" element
     */
    void setPersonGroupConsultant(uk.nhs.nhsia.datastandards.ecds.PersonGroupConsultantStructure personGroupConsultant);
    
    /**
     * Appends and returns a new empty "PersonGroup_Consultant" element
     */
    uk.nhs.nhsia.datastandards.ecds.PersonGroupConsultantStructure addNewPersonGroupConsultant();
    
    /**
     * Unsets the "PersonGroup_Consultant" element
     */
    void unsetPersonGroupConsultant();
    
    /**
     * Gets the "IntendedProcedureDetails" element
     */
    uk.nhs.nhsia.datastandards.ecds.ClinicalActivityStructure getIntendedProcedureDetails();
    
    /**
     * True if has "IntendedProcedureDetails" element
     */
    boolean isSetIntendedProcedureDetails();
    
    /**
     * Sets the "IntendedProcedureDetails" element
     */
    void setIntendedProcedureDetails(uk.nhs.nhsia.datastandards.ecds.ClinicalActivityStructure intendedProcedureDetails);
    
    /**
     * Appends and returns a new empty "IntendedProcedureDetails" element
     */
    uk.nhs.nhsia.datastandards.ecds.ClinicalActivityStructure addNewIntendedProcedureDetails();
    
    /**
     * Unsets the "IntendedProcedureDetails" element
     */
    void unsetIntendedProcedureDetails();
    
    /**
     * Gets the "LocationGroup" element
     */
    uk.nhs.nhsia.datastandards.ecds.ElectiveAdmissionListEntryStructure.LocationGroup getLocationGroup();
    
    /**
     * True if has "LocationGroup" element
     */
    boolean isSetLocationGroup();
    
    /**
     * Sets the "LocationGroup" element
     */
    void setLocationGroup(uk.nhs.nhsia.datastandards.ecds.ElectiveAdmissionListEntryStructure.LocationGroup locationGroup);
    
    /**
     * Appends and returns a new empty "LocationGroup" element
     */
    uk.nhs.nhsia.datastandards.ecds.ElectiveAdmissionListEntryStructure.LocationGroup addNewLocationGroup();
    
    /**
     * Unsets the "LocationGroup" element
     */
    void unsetLocationGroup();
    
    /**
     * An XML ActivityCharacteristics(@http://www.nhsia.nhs.uk/DataStandards/XMLschema/CDS/ns).
     *
     * This is a complex type.
     */
    public interface ActivityCharacteristics extends org.apache.xmlbeans.XmlObject
    {
        public static final org.apache.xmlbeans.SchemaType type = (org.apache.xmlbeans.SchemaType)
            org.apache.xmlbeans.XmlBeans.typeSystemForClassLoader(ActivityCharacteristics.class.getClassLoader(), "schemaorg_apache_xmlbeans.system.s30C1180FF47174E0C8A992A2D657328B").resolveHandle("activitycharacteristics5f9eelemtype");
        
        /**
         * Gets the "ElectiveAdmissionListEntryNumber" element
         */
        java.lang.String getElectiveAdmissionListEntryNumber();
        
        /**
         * Gets (as xml) the "ElectiveAdmissionListEntryNumber" element
         */
        uk.nhs.nhsia.datastandards.ecds.ElectiveAdmissionListEntryNumberType xgetElectiveAdmissionListEntryNumber();
        
        /**
         * True if has "ElectiveAdmissionListEntryNumber" element
         */
        boolean isSetElectiveAdmissionListEntryNumber();
        
        /**
         * Sets the "ElectiveAdmissionListEntryNumber" element
         */
        void setElectiveAdmissionListEntryNumber(java.lang.String electiveAdmissionListEntryNumber);
        
        /**
         * Sets (as xml) the "ElectiveAdmissionListEntryNumber" element
         */
        void xsetElectiveAdmissionListEntryNumber(uk.nhs.nhsia.datastandards.ecds.ElectiveAdmissionListEntryNumberType electiveAdmissionListEntryNumber);
        
        /**
         * Unsets the "ElectiveAdmissionListEntryNumber" element
         */
        void unsetElectiveAdmissionListEntryNumber();
        
        /**
         * Gets the "AdministrativeCategoryCode" element
         */
        uk.nhs.nhsia.datastandards.ecds.AdministrativeCategoryCodeType.Enum getAdministrativeCategoryCode();
        
        /**
         * Gets (as xml) the "AdministrativeCategoryCode" element
         */
        uk.nhs.nhsia.datastandards.ecds.AdministrativeCategoryCodeType xgetAdministrativeCategoryCode();
        
        /**
         * True if has "AdministrativeCategoryCode" element
         */
        boolean isSetAdministrativeCategoryCode();
        
        /**
         * Sets the "AdministrativeCategoryCode" element
         */
        void setAdministrativeCategoryCode(uk.nhs.nhsia.datastandards.ecds.AdministrativeCategoryCodeType.Enum administrativeCategoryCode);
        
        /**
         * Sets (as xml) the "AdministrativeCategoryCode" element
         */
        void xsetAdministrativeCategoryCode(uk.nhs.nhsia.datastandards.ecds.AdministrativeCategoryCodeType administrativeCategoryCode);
        
        /**
         * Unsets the "AdministrativeCategoryCode" element
         */
        void unsetAdministrativeCategoryCode();
        
        /**
         * Gets the "CountOfDaysSuspended" element
         */
        int getCountOfDaysSuspended();
        
        /**
         * Gets (as xml) the "CountOfDaysSuspended" element
         */
        uk.nhs.nhsia.datastandards.ecds.CountOfDaysSuspendedType xgetCountOfDaysSuspended();
        
        /**
         * True if has "CountOfDaysSuspended" element
         */
        boolean isSetCountOfDaysSuspended();
        
        /**
         * Sets the "CountOfDaysSuspended" element
         */
        void setCountOfDaysSuspended(int countOfDaysSuspended);
        
        /**
         * Sets (as xml) the "CountOfDaysSuspended" element
         */
        void xsetCountOfDaysSuspended(uk.nhs.nhsia.datastandards.ecds.CountOfDaysSuspendedType countOfDaysSuspended);
        
        /**
         * Unsets the "CountOfDaysSuspended" element
         */
        void unsetCountOfDaysSuspended();
        
        /**
         * Gets the "ElectiveAdmissionListStatus" element
         */
        uk.nhs.nhsia.datastandards.ecds.ElectiveAdmissionListStatusType.Enum getElectiveAdmissionListStatus();
        
        /**
         * Gets (as xml) the "ElectiveAdmissionListStatus" element
         */
        uk.nhs.nhsia.datastandards.ecds.ElectiveAdmissionListStatusType xgetElectiveAdmissionListStatus();
        
        /**
         * True if has "ElectiveAdmissionListStatus" element
         */
        boolean isSetElectiveAdmissionListStatus();
        
        /**
         * Sets the "ElectiveAdmissionListStatus" element
         */
        void setElectiveAdmissionListStatus(uk.nhs.nhsia.datastandards.ecds.ElectiveAdmissionListStatusType.Enum electiveAdmissionListStatus);
        
        /**
         * Sets (as xml) the "ElectiveAdmissionListStatus" element
         */
        void xsetElectiveAdmissionListStatus(uk.nhs.nhsia.datastandards.ecds.ElectiveAdmissionListStatusType electiveAdmissionListStatus);
        
        /**
         * Unsets the "ElectiveAdmissionListStatus" element
         */
        void unsetElectiveAdmissionListStatus();
        
        /**
         * Gets the "ElectiveAdmissionTypeCode" element
         */
        uk.nhs.nhsia.datastandards.ecds.ElectiveAdmissionTypeCodeType.Enum getElectiveAdmissionTypeCode();
        
        /**
         * Gets (as xml) the "ElectiveAdmissionTypeCode" element
         */
        uk.nhs.nhsia.datastandards.ecds.ElectiveAdmissionTypeCodeType xgetElectiveAdmissionTypeCode();
        
        /**
         * True if has "ElectiveAdmissionTypeCode" element
         */
        boolean isSetElectiveAdmissionTypeCode();
        
        /**
         * Sets the "ElectiveAdmissionTypeCode" element
         */
        void setElectiveAdmissionTypeCode(uk.nhs.nhsia.datastandards.ecds.ElectiveAdmissionTypeCodeType.Enum electiveAdmissionTypeCode);
        
        /**
         * Sets (as xml) the "ElectiveAdmissionTypeCode" element
         */
        void xsetElectiveAdmissionTypeCode(uk.nhs.nhsia.datastandards.ecds.ElectiveAdmissionTypeCodeType electiveAdmissionTypeCode);
        
        /**
         * Unsets the "ElectiveAdmissionTypeCode" element
         */
        void unsetElectiveAdmissionTypeCode();
        
        /**
         * Gets the "IntendedManagementCode" element
         */
        uk.nhs.nhsia.datastandards.ecds.IntendedManagementCodeType.Enum getIntendedManagementCode();
        
        /**
         * Gets (as xml) the "IntendedManagementCode" element
         */
        uk.nhs.nhsia.datastandards.ecds.IntendedManagementCodeType xgetIntendedManagementCode();
        
        /**
         * True if has "IntendedManagementCode" element
         */
        boolean isSetIntendedManagementCode();
        
        /**
         * Sets the "IntendedManagementCode" element
         */
        void setIntendedManagementCode(uk.nhs.nhsia.datastandards.ecds.IntendedManagementCodeType.Enum intendedManagementCode);
        
        /**
         * Sets (as xml) the "IntendedManagementCode" element
         */
        void xsetIntendedManagementCode(uk.nhs.nhsia.datastandards.ecds.IntendedManagementCodeType intendedManagementCode);
        
        /**
         * Unsets the "IntendedManagementCode" element
         */
        void unsetIntendedManagementCode();
        
        /**
         * Gets the "IntendedProcedureStatusCode" element
         */
        uk.nhs.nhsia.datastandards.ecds.IntendedProcedureStatusCodeType.Enum getIntendedProcedureStatusCode();
        
        /**
         * Gets (as xml) the "IntendedProcedureStatusCode" element
         */
        uk.nhs.nhsia.datastandards.ecds.IntendedProcedureStatusCodeType xgetIntendedProcedureStatusCode();
        
        /**
         * True if has "IntendedProcedureStatusCode" element
         */
        boolean isSetIntendedProcedureStatusCode();
        
        /**
         * Sets the "IntendedProcedureStatusCode" element
         */
        void setIntendedProcedureStatusCode(uk.nhs.nhsia.datastandards.ecds.IntendedProcedureStatusCodeType.Enum intendedProcedureStatusCode);
        
        /**
         * Sets (as xml) the "IntendedProcedureStatusCode" element
         */
        void xsetIntendedProcedureStatusCode(uk.nhs.nhsia.datastandards.ecds.IntendedProcedureStatusCodeType intendedProcedureStatusCode);
        
        /**
         * Unsets the "IntendedProcedureStatusCode" element
         */
        void unsetIntendedProcedureStatusCode();
        
        /**
         * Gets the "PriorityTypeCode" element
         */
        uk.nhs.nhsia.datastandards.ecds.PriorityTypeCodeType.Enum getPriorityTypeCode();
        
        /**
         * Gets (as xml) the "PriorityTypeCode" element
         */
        uk.nhs.nhsia.datastandards.ecds.PriorityTypeCodeType xgetPriorityTypeCode();
        
        /**
         * True if has "PriorityTypeCode" element
         */
        boolean isSetPriorityTypeCode();
        
        /**
         * Sets the "PriorityTypeCode" element
         */
        void setPriorityTypeCode(uk.nhs.nhsia.datastandards.ecds.PriorityTypeCodeType.Enum priorityTypeCode);
        
        /**
         * Sets (as xml) the "PriorityTypeCode" element
         */
        void xsetPriorityTypeCode(uk.nhs.nhsia.datastandards.ecds.PriorityTypeCodeType priorityTypeCode);
        
        /**
         * Unsets the "PriorityTypeCode" element
         */
        void unsetPriorityTypeCode();
        
        /**
         * Gets the "DecidedToAdmitDate" element
         */
        java.util.Calendar getDecidedToAdmitDate();
        
        /**
         * Gets (as xml) the "DecidedToAdmitDate" element
         */
        uk.nhs.nhsia.datastandards.ecds.DecidedToAdmitDateType xgetDecidedToAdmitDate();
        
        /**
         * Sets the "DecidedToAdmitDate" element
         */
        void setDecidedToAdmitDate(java.util.Calendar decidedToAdmitDate);
        
        /**
         * Sets (as xml) the "DecidedToAdmitDate" element
         */
        void xsetDecidedToAdmitDate(uk.nhs.nhsia.datastandards.ecds.DecidedToAdmitDateType decidedToAdmitDate);
        
        /**
         * Gets the "AgeAtCDSActivityDate" element
         */
        int getAgeAtCDSActivityDate();
        
        /**
         * Gets (as xml) the "AgeAtCDSActivityDate" element
         */
        uk.nhs.nhsia.datastandards.ecds.AgeAtCDSActivityDateType xgetAgeAtCDSActivityDate();
        
        /**
         * Sets the "AgeAtCDSActivityDate" element
         */
        void setAgeAtCDSActivityDate(int ageAtCDSActivityDate);
        
        /**
         * Sets (as xml) the "AgeAtCDSActivityDate" element
         */
        void xsetAgeAtCDSActivityDate(uk.nhs.nhsia.datastandards.ecds.AgeAtCDSActivityDateType ageAtCDSActivityDate);
        
        /**
         * Gets the "OverseasVisitorStatusClassificationAtCDSActivityDate" element
         */
        uk.nhs.nhsia.datastandards.ecds.OverseasVisitorClassificationType.Enum getOverseasVisitorStatusClassificationAtCDSActivityDate();
        
        /**
         * Gets (as xml) the "OverseasVisitorStatusClassificationAtCDSActivityDate" element
         */
        uk.nhs.nhsia.datastandards.ecds.OverseasVisitorStatusClassificationAtCDSActivityDateType xgetOverseasVisitorStatusClassificationAtCDSActivityDate();
        
        /**
         * True if has "OverseasVisitorStatusClassificationAtCDSActivityDate" element
         */
        boolean isSetOverseasVisitorStatusClassificationAtCDSActivityDate();
        
        /**
         * Sets the "OverseasVisitorStatusClassificationAtCDSActivityDate" element
         */
        void setOverseasVisitorStatusClassificationAtCDSActivityDate(uk.nhs.nhsia.datastandards.ecds.OverseasVisitorClassificationType.Enum overseasVisitorStatusClassificationAtCDSActivityDate);
        
        /**
         * Sets (as xml) the "OverseasVisitorStatusClassificationAtCDSActivityDate" element
         */
        void xsetOverseasVisitorStatusClassificationAtCDSActivityDate(uk.nhs.nhsia.datastandards.ecds.OverseasVisitorStatusClassificationAtCDSActivityDateType overseasVisitorStatusClassificationAtCDSActivityDate);
        
        /**
         * Unsets the "OverseasVisitorStatusClassificationAtCDSActivityDate" element
         */
        void unsetOverseasVisitorStatusClassificationAtCDSActivityDate();
        
        /**
         * Gets the "GuaranteedAdmissionDate" element
         */
        java.util.Calendar getGuaranteedAdmissionDate();
        
        /**
         * Gets (as xml) the "GuaranteedAdmissionDate" element
         */
        uk.nhs.nhsia.datastandards.ecds.GuaranteedAdmissionDateType xgetGuaranteedAdmissionDate();
        
        /**
         * True if has "GuaranteedAdmissionDate" element
         */
        boolean isSetGuaranteedAdmissionDate();
        
        /**
         * Sets the "GuaranteedAdmissionDate" element
         */
        void setGuaranteedAdmissionDate(java.util.Calendar guaranteedAdmissionDate);
        
        /**
         * Sets (as xml) the "GuaranteedAdmissionDate" element
         */
        void xsetGuaranteedAdmissionDate(uk.nhs.nhsia.datastandards.ecds.GuaranteedAdmissionDateType guaranteedAdmissionDate);
        
        /**
         * Unsets the "GuaranteedAdmissionDate" element
         */
        void unsetGuaranteedAdmissionDate();
        
        /**
         * Gets the "LastDNAOrPatientCancelledDate" element
         */
        java.util.Calendar getLastDNAOrPatientCancelledDate();
        
        /**
         * Gets (as xml) the "LastDNAOrPatientCancelledDate" element
         */
        uk.nhs.nhsia.datastandards.ecds.LastDNAOrPatientCancelledDateType xgetLastDNAOrPatientCancelledDate();
        
        /**
         * True if has "LastDNAOrPatientCancelledDate" element
         */
        boolean isSetLastDNAOrPatientCancelledDate();
        
        /**
         * Sets the "LastDNAOrPatientCancelledDate" element
         */
        void setLastDNAOrPatientCancelledDate(java.util.Calendar lastDNAOrPatientCancelledDate);
        
        /**
         * Sets (as xml) the "LastDNAOrPatientCancelledDate" element
         */
        void xsetLastDNAOrPatientCancelledDate(uk.nhs.nhsia.datastandards.ecds.LastDNAOrPatientCancelledDateType lastDNAOrPatientCancelledDate);
        
        /**
         * Unsets the "LastDNAOrPatientCancelledDate" element
         */
        void unsetLastDNAOrPatientCancelledDate();
        
        /**
         * Gets the "WaitingListEntryLastReviewedDate" element
         */
        java.util.Calendar getWaitingListEntryLastReviewedDate();
        
        /**
         * Gets (as xml) the "WaitingListEntryLastReviewedDate" element
         */
        uk.nhs.nhsia.datastandards.ecds.WaitingListEntryLastReviewedDateType xgetWaitingListEntryLastReviewedDate();
        
        /**
         * True if has "WaitingListEntryLastReviewedDate" element
         */
        boolean isSetWaitingListEntryLastReviewedDate();
        
        /**
         * Sets the "WaitingListEntryLastReviewedDate" element
         */
        void setWaitingListEntryLastReviewedDate(java.util.Calendar waitingListEntryLastReviewedDate);
        
        /**
         * Sets (as xml) the "WaitingListEntryLastReviewedDate" element
         */
        void xsetWaitingListEntryLastReviewedDate(uk.nhs.nhsia.datastandards.ecds.WaitingListEntryLastReviewedDateType waitingListEntryLastReviewedDate);
        
        /**
         * Unsets the "WaitingListEntryLastReviewedDate" element
         */
        void unsetWaitingListEntryLastReviewedDate();
        
        /**
         * A factory class with static methods for creating instances
         * of this type.
         */
        
        public static final class Factory
        {
            public static uk.nhs.nhsia.datastandards.ecds.ElectiveAdmissionListEntryStructure.ActivityCharacteristics newInstance() {
              return (uk.nhs.nhsia.datastandards.ecds.ElectiveAdmissionListEntryStructure.ActivityCharacteristics) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().newInstance( type, null ); }
            
            public static uk.nhs.nhsia.datastandards.ecds.ElectiveAdmissionListEntryStructure.ActivityCharacteristics newInstance(org.apache.xmlbeans.XmlOptions options) {
              return (uk.nhs.nhsia.datastandards.ecds.ElectiveAdmissionListEntryStructure.ActivityCharacteristics) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().newInstance( type, options ); }
            
            private Factory() { } // No instance of this class allowed
        }
    }
    
    /**
     * An XML LocationGroup(@http://www.nhsia.nhs.uk/DataStandards/XMLschema/CDS/ns).
     *
     * This is a complex type.
     */
    public interface LocationGroup extends org.apache.xmlbeans.XmlObject
    {
        public static final org.apache.xmlbeans.SchemaType type = (org.apache.xmlbeans.SchemaType)
            org.apache.xmlbeans.XmlBeans.typeSystemForClassLoader(LocationGroup.class.getClassLoader(), "schemaorg_apache_xmlbeans.system.s30C1180FF47174E0C8A992A2D657328B").resolveHandle("locationgroup5a7felemtype");
        
        /**
         * Gets the "IntendedSiteOfTreatment" element
         */
        uk.nhs.nhsia.datastandards.ecds.ElectiveAdmissionListEntryStructure.LocationGroup.IntendedSiteOfTreatment getIntendedSiteOfTreatment();
        
        /**
         * True if has "IntendedSiteOfTreatment" element
         */
        boolean isSetIntendedSiteOfTreatment();
        
        /**
         * Sets the "IntendedSiteOfTreatment" element
         */
        void setIntendedSiteOfTreatment(uk.nhs.nhsia.datastandards.ecds.ElectiveAdmissionListEntryStructure.LocationGroup.IntendedSiteOfTreatment intendedSiteOfTreatment);
        
        /**
         * Appends and returns a new empty "IntendedSiteOfTreatment" element
         */
        uk.nhs.nhsia.datastandards.ecds.ElectiveAdmissionListEntryStructure.LocationGroup.IntendedSiteOfTreatment addNewIntendedSiteOfTreatment();
        
        /**
         * Unsets the "IntendedSiteOfTreatment" element
         */
        void unsetIntendedSiteOfTreatment();
        
        /**
         * An XML IntendedSiteOfTreatment(@http://www.nhsia.nhs.uk/DataStandards/XMLschema/CDS/ns).
         *
         * This is a complex type.
         */
        public interface IntendedSiteOfTreatment extends org.apache.xmlbeans.XmlObject
        {
            public static final org.apache.xmlbeans.SchemaType type = (org.apache.xmlbeans.SchemaType)
                org.apache.xmlbeans.XmlBeans.typeSystemForClassLoader(IntendedSiteOfTreatment.class.getClassLoader(), "schemaorg_apache_xmlbeans.system.s30C1180FF47174E0C8A992A2D657328B").resolveHandle("intendedsiteoftreatmentd67aelemtype");
            
            /**
             * Gets the "LocationClass" element
             */
            uk.nhs.nhsia.datastandards.ecds.LocationClassType.Enum getLocationClass();
            
            /**
             * Gets (as xml) the "LocationClass" element
             */
            uk.nhs.nhsia.datastandards.ecds.LocationClassType xgetLocationClass();
            
            /**
             * True if has "LocationClass" element
             */
            boolean isSetLocationClass();
            
            /**
             * Sets the "LocationClass" element
             */
            void setLocationClass(uk.nhs.nhsia.datastandards.ecds.LocationClassType.Enum locationClass);
            
            /**
             * Sets (as xml) the "LocationClass" element
             */
            void xsetLocationClass(uk.nhs.nhsia.datastandards.ecds.LocationClassType locationClass);
            
            /**
             * Unsets the "LocationClass" element
             */
            void unsetLocationClass();
            
            /**
             * Gets the "IntendedSiteCode_OfTreatment" element
             */
            java.lang.String getIntendedSiteCodeOfTreatment();
            
            /**
             * Gets (as xml) the "IntendedSiteCode_OfTreatment" element
             */
            uk.nhs.nhsia.datastandards.ecds.IntendedSiteCodeOfTreatmentType xgetIntendedSiteCodeOfTreatment();
            
            /**
             * True if has "IntendedSiteCode_OfTreatment" element
             */
            boolean isSetIntendedSiteCodeOfTreatment();
            
            /**
             * Sets the "IntendedSiteCode_OfTreatment" element
             */
            void setIntendedSiteCodeOfTreatment(java.lang.String intendedSiteCodeOfTreatment);
            
            /**
             * Sets (as xml) the "IntendedSiteCode_OfTreatment" element
             */
            void xsetIntendedSiteCodeOfTreatment(uk.nhs.nhsia.datastandards.ecds.IntendedSiteCodeOfTreatmentType intendedSiteCodeOfTreatment);
            
            /**
             * Unsets the "IntendedSiteCode_OfTreatment" element
             */
            void unsetIntendedSiteCodeOfTreatment();
            
            /**
             * Gets the "ActivityLocationType" element
             */
            uk.nhs.nhsia.datastandards.ecds.ActivityLocationTypeType.Enum getActivityLocationType();
            
            /**
             * Gets (as xml) the "ActivityLocationType" element
             */
            uk.nhs.nhsia.datastandards.ecds.ActivityLocationTypeType xgetActivityLocationType();
            
            /**
             * True if has "ActivityLocationType" element
             */
            boolean isSetActivityLocationType();
            
            /**
             * Sets the "ActivityLocationType" element
             */
            void setActivityLocationType(uk.nhs.nhsia.datastandards.ecds.ActivityLocationTypeType.Enum activityLocationType);
            
            /**
             * Sets (as xml) the "ActivityLocationType" element
             */
            void xsetActivityLocationType(uk.nhs.nhsia.datastandards.ecds.ActivityLocationTypeType activityLocationType);
            
            /**
             * Unsets the "ActivityLocationType" element
             */
            void unsetActivityLocationType();
            
            /**
             * A factory class with static methods for creating instances
             * of this type.
             */
            
            public static final class Factory
            {
                public static uk.nhs.nhsia.datastandards.ecds.ElectiveAdmissionListEntryStructure.LocationGroup.IntendedSiteOfTreatment newInstance() {
                  return (uk.nhs.nhsia.datastandards.ecds.ElectiveAdmissionListEntryStructure.LocationGroup.IntendedSiteOfTreatment) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().newInstance( type, null ); }
                
                public static uk.nhs.nhsia.datastandards.ecds.ElectiveAdmissionListEntryStructure.LocationGroup.IntendedSiteOfTreatment newInstance(org.apache.xmlbeans.XmlOptions options) {
                  return (uk.nhs.nhsia.datastandards.ecds.ElectiveAdmissionListEntryStructure.LocationGroup.IntendedSiteOfTreatment) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().newInstance( type, options ); }
                
                private Factory() { } // No instance of this class allowed
            }
        }
        
        /**
         * A factory class with static methods for creating instances
         * of this type.
         */
        
        public static final class Factory
        {
            public static uk.nhs.nhsia.datastandards.ecds.ElectiveAdmissionListEntryStructure.LocationGroup newInstance() {
              return (uk.nhs.nhsia.datastandards.ecds.ElectiveAdmissionListEntryStructure.LocationGroup) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().newInstance( type, null ); }
            
            public static uk.nhs.nhsia.datastandards.ecds.ElectiveAdmissionListEntryStructure.LocationGroup newInstance(org.apache.xmlbeans.XmlOptions options) {
              return (uk.nhs.nhsia.datastandards.ecds.ElectiveAdmissionListEntryStructure.LocationGroup) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().newInstance( type, options ); }
            
            private Factory() { } // No instance of this class allowed
        }
    }
    
    /**
     * A factory class with static methods for creating instances
     * of this type.
     */
    
    public static final class Factory
    {
        public static uk.nhs.nhsia.datastandards.ecds.ElectiveAdmissionListEntryStructure newInstance() {
          return (uk.nhs.nhsia.datastandards.ecds.ElectiveAdmissionListEntryStructure) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().newInstance( type, null ); }
        
        public static uk.nhs.nhsia.datastandards.ecds.ElectiveAdmissionListEntryStructure newInstance(org.apache.xmlbeans.XmlOptions options) {
          return (uk.nhs.nhsia.datastandards.ecds.ElectiveAdmissionListEntryStructure) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().newInstance( type, options ); }
        
        /** @param xmlAsString the string value to parse */
        public static uk.nhs.nhsia.datastandards.ecds.ElectiveAdmissionListEntryStructure parse(java.lang.String xmlAsString) throws org.apache.xmlbeans.XmlException {
          return (uk.nhs.nhsia.datastandards.ecds.ElectiveAdmissionListEntryStructure) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( xmlAsString, type, null ); }
        
        public static uk.nhs.nhsia.datastandards.ecds.ElectiveAdmissionListEntryStructure parse(java.lang.String xmlAsString, org.apache.xmlbeans.XmlOptions options) throws org.apache.xmlbeans.XmlException {
          return (uk.nhs.nhsia.datastandards.ecds.ElectiveAdmissionListEntryStructure) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( xmlAsString, type, options ); }
        
        /** @param file the file from which to load an xml document */
        public static uk.nhs.nhsia.datastandards.ecds.ElectiveAdmissionListEntryStructure parse(java.io.File file) throws org.apache.xmlbeans.XmlException, java.io.IOException {
          return (uk.nhs.nhsia.datastandards.ecds.ElectiveAdmissionListEntryStructure) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( file, type, null ); }
        
        public static uk.nhs.nhsia.datastandards.ecds.ElectiveAdmissionListEntryStructure parse(java.io.File file, org.apache.xmlbeans.XmlOptions options) throws org.apache.xmlbeans.XmlException, java.io.IOException {
          return (uk.nhs.nhsia.datastandards.ecds.ElectiveAdmissionListEntryStructure) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( file, type, options ); }
        
        public static uk.nhs.nhsia.datastandards.ecds.ElectiveAdmissionListEntryStructure parse(java.net.URL u) throws org.apache.xmlbeans.XmlException, java.io.IOException {
          return (uk.nhs.nhsia.datastandards.ecds.ElectiveAdmissionListEntryStructure) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( u, type, null ); }
        
        public static uk.nhs.nhsia.datastandards.ecds.ElectiveAdmissionListEntryStructure parse(java.net.URL u, org.apache.xmlbeans.XmlOptions options) throws org.apache.xmlbeans.XmlException, java.io.IOException {
          return (uk.nhs.nhsia.datastandards.ecds.ElectiveAdmissionListEntryStructure) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( u, type, options ); }
        
        public static uk.nhs.nhsia.datastandards.ecds.ElectiveAdmissionListEntryStructure parse(java.io.InputStream is) throws org.apache.xmlbeans.XmlException, java.io.IOException {
          return (uk.nhs.nhsia.datastandards.ecds.ElectiveAdmissionListEntryStructure) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( is, type, null ); }
        
        public static uk.nhs.nhsia.datastandards.ecds.ElectiveAdmissionListEntryStructure parse(java.io.InputStream is, org.apache.xmlbeans.XmlOptions options) throws org.apache.xmlbeans.XmlException, java.io.IOException {
          return (uk.nhs.nhsia.datastandards.ecds.ElectiveAdmissionListEntryStructure) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( is, type, options ); }
        
        public static uk.nhs.nhsia.datastandards.ecds.ElectiveAdmissionListEntryStructure parse(java.io.Reader r) throws org.apache.xmlbeans.XmlException, java.io.IOException {
          return (uk.nhs.nhsia.datastandards.ecds.ElectiveAdmissionListEntryStructure) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( r, type, null ); }
        
        public static uk.nhs.nhsia.datastandards.ecds.ElectiveAdmissionListEntryStructure parse(java.io.Reader r, org.apache.xmlbeans.XmlOptions options) throws org.apache.xmlbeans.XmlException, java.io.IOException {
          return (uk.nhs.nhsia.datastandards.ecds.ElectiveAdmissionListEntryStructure) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( r, type, options ); }
        
        public static uk.nhs.nhsia.datastandards.ecds.ElectiveAdmissionListEntryStructure parse(javax.xml.stream.XMLStreamReader sr) throws org.apache.xmlbeans.XmlException {
          return (uk.nhs.nhsia.datastandards.ecds.ElectiveAdmissionListEntryStructure) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( sr, type, null ); }
        
        public static uk.nhs.nhsia.datastandards.ecds.ElectiveAdmissionListEntryStructure parse(javax.xml.stream.XMLStreamReader sr, org.apache.xmlbeans.XmlOptions options) throws org.apache.xmlbeans.XmlException {
          return (uk.nhs.nhsia.datastandards.ecds.ElectiveAdmissionListEntryStructure) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( sr, type, options ); }
        
        public static uk.nhs.nhsia.datastandards.ecds.ElectiveAdmissionListEntryStructure parse(org.w3c.dom.Node node) throws org.apache.xmlbeans.XmlException {
          return (uk.nhs.nhsia.datastandards.ecds.ElectiveAdmissionListEntryStructure) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( node, type, null ); }
        
        public static uk.nhs.nhsia.datastandards.ecds.ElectiveAdmissionListEntryStructure parse(org.w3c.dom.Node node, org.apache.xmlbeans.XmlOptions options) throws org.apache.xmlbeans.XmlException {
          return (uk.nhs.nhsia.datastandards.ecds.ElectiveAdmissionListEntryStructure) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( node, type, options ); }
        
        /** @deprecated {@link org.apache.xmlbeans.xml.stream.XMLInputStream} */
        public static uk.nhs.nhsia.datastandards.ecds.ElectiveAdmissionListEntryStructure parse(org.apache.xmlbeans.xml.stream.XMLInputStream xis) throws org.apache.xmlbeans.XmlException, org.apache.xmlbeans.xml.stream.XMLStreamException {
          return (uk.nhs.nhsia.datastandards.ecds.ElectiveAdmissionListEntryStructure) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( xis, type, null ); }
        
        /** @deprecated {@link org.apache.xmlbeans.xml.stream.XMLInputStream} */
        public static uk.nhs.nhsia.datastandards.ecds.ElectiveAdmissionListEntryStructure parse(org.apache.xmlbeans.xml.stream.XMLInputStream xis, org.apache.xmlbeans.XmlOptions options) throws org.apache.xmlbeans.XmlException, org.apache.xmlbeans.xml.stream.XMLStreamException {
          return (uk.nhs.nhsia.datastandards.ecds.ElectiveAdmissionListEntryStructure) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( xis, type, options ); }
        
        /** @deprecated {@link org.apache.xmlbeans.xml.stream.XMLInputStream} */
        public static org.apache.xmlbeans.xml.stream.XMLInputStream newValidatingXMLInputStream(org.apache.xmlbeans.xml.stream.XMLInputStream xis) throws org.apache.xmlbeans.XmlException, org.apache.xmlbeans.xml.stream.XMLStreamException {
          return org.apache.xmlbeans.XmlBeans.getContextTypeLoader().newValidatingXMLInputStream( xis, type, null ); }
        
        /** @deprecated {@link org.apache.xmlbeans.xml.stream.XMLInputStream} */
        public static org.apache.xmlbeans.xml.stream.XMLInputStream newValidatingXMLInputStream(org.apache.xmlbeans.xml.stream.XMLInputStream xis, org.apache.xmlbeans.XmlOptions options) throws org.apache.xmlbeans.XmlException, org.apache.xmlbeans.xml.stream.XMLStreamException {
          return org.apache.xmlbeans.XmlBeans.getContextTypeLoader().newValidatingXMLInputStream( xis, type, options ); }
        
        private Factory() { } // No instance of this class allowed
    }
}
