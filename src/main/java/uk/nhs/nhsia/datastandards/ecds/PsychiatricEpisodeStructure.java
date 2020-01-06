/*
 * XML Type:  PsychiatricEpisode_Structure
 * Namespace: http://www.nhsia.nhs.uk/DataStandards/XMLschema/CDS/ns
 * Java type: uk.nhs.nhsia.datastandards.ecds.PsychiatricEpisodeStructure
 *
 * Automatically generated - do not modify.
 */
package uk.nhs.nhsia.datastandards.ecds;


/**
 * An XML PsychiatricEpisode_Structure(@http://www.nhsia.nhs.uk/DataStandards/XMLschema/CDS/ns).
 *
 * This is a complex type.
 */
public interface PsychiatricEpisodeStructure extends org.apache.xmlbeans.XmlObject
{
    public static final org.apache.xmlbeans.SchemaType type = (org.apache.xmlbeans.SchemaType)
        org.apache.xmlbeans.XmlBeans.typeSystemForClassLoader(PsychiatricEpisodeStructure.class.getClassLoader(), "schemaorg_apache_xmlbeans.system.s30C1180FF47174E0C8A992A2D657328B").resolveHandle("psychiatricepisodestructure95cdtype");
    
    /**
     * Gets the "EpisodeCharacteristics" element
     */
    uk.nhs.nhsia.datastandards.ecds.PsychiatricEpisodeStructure.EpisodeCharacteristics getEpisodeCharacteristics();
    
    /**
     * Sets the "EpisodeCharacteristics" element
     */
    void setEpisodeCharacteristics(uk.nhs.nhsia.datastandards.ecds.PsychiatricEpisodeStructure.EpisodeCharacteristics episodeCharacteristics);
    
    /**
     * Appends and returns a new empty "EpisodeCharacteristics" element
     */
    uk.nhs.nhsia.datastandards.ecds.PsychiatricEpisodeStructure.EpisodeCharacteristics addNewEpisodeCharacteristics();
    
    /**
     * Gets the "ServiceAgreementDetails" element
     */
    uk.nhs.nhsia.datastandards.ecds.ServiceAgreementDetailsStructure getServiceAgreementDetails();
    
    /**
     * Sets the "ServiceAgreementDetails" element
     */
    void setServiceAgreementDetails(uk.nhs.nhsia.datastandards.ecds.ServiceAgreementDetailsStructure serviceAgreementDetails);
    
    /**
     * Appends and returns a new empty "ServiceAgreementDetails" element
     */
    uk.nhs.nhsia.datastandards.ecds.ServiceAgreementDetailsStructure addNewServiceAgreementDetails();
    
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
     * Gets the "ClinicalDiagnosisDetails" element
     */
    uk.nhs.nhsia.datastandards.ecds.ClinicalDiagnosisStructure getClinicalDiagnosisDetails();
    
    /**
     * True if has "ClinicalDiagnosisDetails" element
     */
    boolean isSetClinicalDiagnosisDetails();
    
    /**
     * Sets the "ClinicalDiagnosisDetails" element
     */
    void setClinicalDiagnosisDetails(uk.nhs.nhsia.datastandards.ecds.ClinicalDiagnosisStructure clinicalDiagnosisDetails);
    
    /**
     * Appends and returns a new empty "ClinicalDiagnosisDetails" element
     */
    uk.nhs.nhsia.datastandards.ecds.ClinicalDiagnosisStructure addNewClinicalDiagnosisDetails();
    
    /**
     * Unsets the "ClinicalDiagnosisDetails" element
     */
    void unsetClinicalDiagnosisDetails();
    
    /**
     * Gets the "LocationGroup" element
     */
    uk.nhs.nhsia.datastandards.ecds.PsychiatricEpisodeStructure.LocationGroup getLocationGroup();
    
    /**
     * True if has "LocationGroup" element
     */
    boolean isSetLocationGroup();
    
    /**
     * Sets the "LocationGroup" element
     */
    void setLocationGroup(uk.nhs.nhsia.datastandards.ecds.PsychiatricEpisodeStructure.LocationGroup locationGroup);
    
    /**
     * Appends and returns a new empty "LocationGroup" element
     */
    uk.nhs.nhsia.datastandards.ecds.PsychiatricEpisodeStructure.LocationGroup addNewLocationGroup();
    
    /**
     * Unsets the "LocationGroup" element
     */
    void unsetLocationGroup();
    
    /**
     * An XML EpisodeCharacteristics(@http://www.nhsia.nhs.uk/DataStandards/XMLschema/CDS/ns).
     *
     * This is a complex type.
     */
    public interface EpisodeCharacteristics extends org.apache.xmlbeans.XmlObject
    {
        public static final org.apache.xmlbeans.SchemaType type = (org.apache.xmlbeans.SchemaType)
            org.apache.xmlbeans.XmlBeans.typeSystemForClassLoader(EpisodeCharacteristics.class.getClassLoader(), "schemaorg_apache_xmlbeans.system.s30C1180FF47174E0C8A992A2D657328B").resolveHandle("episodecharacteristics4686elemtype");
        
        /**
         * Gets the "EpisodeNumber" element
         */
        int getEpisodeNumber();
        
        /**
         * Gets (as xml) the "EpisodeNumber" element
         */
        uk.nhs.nhsia.datastandards.ecds.EpisodeNumberType xgetEpisodeNumber();
        
        /**
         * True if has "EpisodeNumber" element
         */
        boolean isSetEpisodeNumber();
        
        /**
         * Sets the "EpisodeNumber" element
         */
        void setEpisodeNumber(int episodeNumber);
        
        /**
         * Sets (as xml) the "EpisodeNumber" element
         */
        void xsetEpisodeNumber(uk.nhs.nhsia.datastandards.ecds.EpisodeNumberType episodeNumber);
        
        /**
         * Unsets the "EpisodeNumber" element
         */
        void unsetEpisodeNumber();
        
        /**
         * Gets the "PsychiatricPatientStatusCode" element
         */
        uk.nhs.nhsia.datastandards.ecds.PsychiatricPatientStatusCodeType.Enum getPsychiatricPatientStatusCode();
        
        /**
         * Gets (as xml) the "PsychiatricPatientStatusCode" element
         */
        uk.nhs.nhsia.datastandards.ecds.PsychiatricPatientStatusCodeType xgetPsychiatricPatientStatusCode();
        
        /**
         * True if has "PsychiatricPatientStatusCode" element
         */
        boolean isSetPsychiatricPatientStatusCode();
        
        /**
         * Sets the "PsychiatricPatientStatusCode" element
         */
        void setPsychiatricPatientStatusCode(uk.nhs.nhsia.datastandards.ecds.PsychiatricPatientStatusCodeType.Enum psychiatricPatientStatusCode);
        
        /**
         * Sets (as xml) the "PsychiatricPatientStatusCode" element
         */
        void xsetPsychiatricPatientStatusCode(uk.nhs.nhsia.datastandards.ecds.PsychiatricPatientStatusCodeType psychiatricPatientStatusCode);
        
        /**
         * Unsets the "PsychiatricPatientStatusCode" element
         */
        void unsetPsychiatricPatientStatusCode();
        
        /**
         * Gets the "StartDate_Episode" element
         */
        java.util.Calendar getStartDateEpisode();
        
        /**
         * Gets (as xml) the "StartDate_Episode" element
         */
        uk.nhs.nhsia.datastandards.ecds.StartDateEpisodeType xgetStartDateEpisode();
        
        /**
         * Sets the "StartDate_Episode" element
         */
        void setStartDateEpisode(java.util.Calendar startDateEpisode);
        
        /**
         * Sets (as xml) the "StartDate_Episode" element
         */
        void xsetStartDateEpisode(uk.nhs.nhsia.datastandards.ecds.StartDateEpisodeType startDateEpisode);
        
        /**
         * Gets the "StartTime_Episode" element
         */
        java.util.Calendar getStartTimeEpisode();
        
        /**
         * Gets (as xml) the "StartTime_Episode" element
         */
        uk.nhs.nhsia.datastandards.ecds.StartTimeEpisodeType xgetStartTimeEpisode();
        
        /**
         * True if has "StartTime_Episode" element
         */
        boolean isSetStartTimeEpisode();
        
        /**
         * Sets the "StartTime_Episode" element
         */
        void setStartTimeEpisode(java.util.Calendar startTimeEpisode);
        
        /**
         * Sets (as xml) the "StartTime_Episode" element
         */
        void xsetStartTimeEpisode(uk.nhs.nhsia.datastandards.ecds.StartTimeEpisodeType startTimeEpisode);
        
        /**
         * Unsets the "StartTime_Episode" element
         */
        void unsetStartTimeEpisode();
        
        /**
         * Gets the "DetainedAndOrLongTermPsychiatricCensusDate" element
         */
        java.util.Calendar getDetainedAndOrLongTermPsychiatricCensusDate();
        
        /**
         * Gets (as xml) the "DetainedAndOrLongTermPsychiatricCensusDate" element
         */
        uk.nhs.nhsia.datastandards.ecds.DetainedAndOrLongTermPsychiatricCensusDateType xgetDetainedAndOrLongTermPsychiatricCensusDate();
        
        /**
         * Sets the "DetainedAndOrLongTermPsychiatricCensusDate" element
         */
        void setDetainedAndOrLongTermPsychiatricCensusDate(java.util.Calendar detainedAndOrLongTermPsychiatricCensusDate);
        
        /**
         * Sets (as xml) the "DetainedAndOrLongTermPsychiatricCensusDate" element
         */
        void xsetDetainedAndOrLongTermPsychiatricCensusDate(uk.nhs.nhsia.datastandards.ecds.DetainedAndOrLongTermPsychiatricCensusDateType detainedAndOrLongTermPsychiatricCensusDate);
        
        /**
         * Gets array of all "OverseasVisitorStatus" elements
         */
        uk.nhs.nhsia.datastandards.ecds.OverseasVisitorStatusStructure[] getOverseasVisitorStatusArray();
        
        /**
         * Gets ith "OverseasVisitorStatus" element
         */
        uk.nhs.nhsia.datastandards.ecds.OverseasVisitorStatusStructure getOverseasVisitorStatusArray(int i);
        
        /**
         * Returns number of "OverseasVisitorStatus" element
         */
        int sizeOfOverseasVisitorStatusArray();
        
        /**
         * Sets array of all "OverseasVisitorStatus" element
         */
        void setOverseasVisitorStatusArray(uk.nhs.nhsia.datastandards.ecds.OverseasVisitorStatusStructure[] overseasVisitorStatusArray);
        
        /**
         * Sets ith "OverseasVisitorStatus" element
         */
        void setOverseasVisitorStatusArray(int i, uk.nhs.nhsia.datastandards.ecds.OverseasVisitorStatusStructure overseasVisitorStatus);
        
        /**
         * Inserts and returns a new empty value (as xml) as the ith "OverseasVisitorStatus" element
         */
        uk.nhs.nhsia.datastandards.ecds.OverseasVisitorStatusStructure insertNewOverseasVisitorStatus(int i);
        
        /**
         * Appends and returns a new empty value (as xml) as the last "OverseasVisitorStatus" element
         */
        uk.nhs.nhsia.datastandards.ecds.OverseasVisitorStatusStructure addNewOverseasVisitorStatus();
        
        /**
         * Removes the ith "OverseasVisitorStatus" element
         */
        void removeOverseasVisitorStatus(int i);
        
        /**
         * A factory class with static methods for creating instances
         * of this type.
         */
        
        public static final class Factory
        {
            public static uk.nhs.nhsia.datastandards.ecds.PsychiatricEpisodeStructure.EpisodeCharacteristics newInstance() {
              return (uk.nhs.nhsia.datastandards.ecds.PsychiatricEpisodeStructure.EpisodeCharacteristics) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().newInstance( type, null ); }
            
            public static uk.nhs.nhsia.datastandards.ecds.PsychiatricEpisodeStructure.EpisodeCharacteristics newInstance(org.apache.xmlbeans.XmlOptions options) {
              return (uk.nhs.nhsia.datastandards.ecds.PsychiatricEpisodeStructure.EpisodeCharacteristics) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().newInstance( type, options ); }
            
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
            org.apache.xmlbeans.XmlBeans.typeSystemForClassLoader(LocationGroup.class.getClassLoader(), "schemaorg_apache_xmlbeans.system.s30C1180FF47174E0C8A992A2D657328B").resolveHandle("locationgroup5f63elemtype");
        
        /**
         * Gets the "StartOfEpisode" element
         */
        uk.nhs.nhsia.datastandards.ecds.PsychiatricEpisodeStructure.LocationGroup.StartOfEpisode getStartOfEpisode();
        
        /**
         * True if has "StartOfEpisode" element
         */
        boolean isSetStartOfEpisode();
        
        /**
         * Sets the "StartOfEpisode" element
         */
        void setStartOfEpisode(uk.nhs.nhsia.datastandards.ecds.PsychiatricEpisodeStructure.LocationGroup.StartOfEpisode startOfEpisode);
        
        /**
         * Appends and returns a new empty "StartOfEpisode" element
         */
        uk.nhs.nhsia.datastandards.ecds.PsychiatricEpisodeStructure.LocationGroup.StartOfEpisode addNewStartOfEpisode();
        
        /**
         * Unsets the "StartOfEpisode" element
         */
        void unsetStartOfEpisode();
        
        /**
         * Gets the "WardStayAtPsychiatricCensusDate" element
         */
        uk.nhs.nhsia.datastandards.ecds.PsychiatricEpisodeStructure.LocationGroup.WardStayAtPsychiatricCensusDate getWardStayAtPsychiatricCensusDate();
        
        /**
         * True if has "WardStayAtPsychiatricCensusDate" element
         */
        boolean isSetWardStayAtPsychiatricCensusDate();
        
        /**
         * Sets the "WardStayAtPsychiatricCensusDate" element
         */
        void setWardStayAtPsychiatricCensusDate(uk.nhs.nhsia.datastandards.ecds.PsychiatricEpisodeStructure.LocationGroup.WardStayAtPsychiatricCensusDate wardStayAtPsychiatricCensusDate);
        
        /**
         * Appends and returns a new empty "WardStayAtPsychiatricCensusDate" element
         */
        uk.nhs.nhsia.datastandards.ecds.PsychiatricEpisodeStructure.LocationGroup.WardStayAtPsychiatricCensusDate addNewWardStayAtPsychiatricCensusDate();
        
        /**
         * Unsets the "WardStayAtPsychiatricCensusDate" element
         */
        void unsetWardStayAtPsychiatricCensusDate();
        
        /**
         * An XML StartOfEpisode(@http://www.nhsia.nhs.uk/DataStandards/XMLschema/CDS/ns).
         *
         * This is a complex type.
         */
        public interface StartOfEpisode extends org.apache.xmlbeans.XmlObject
        {
            public static final org.apache.xmlbeans.SchemaType type = (org.apache.xmlbeans.SchemaType)
                org.apache.xmlbeans.XmlBeans.typeSystemForClassLoader(StartOfEpisode.class.getClassLoader(), "schemaorg_apache_xmlbeans.system.s30C1180FF47174E0C8A992A2D657328B").resolveHandle("startofepisode7581elemtype");
            
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
             * Gets the "SiteCodeOfTreatment" element
             */
            java.lang.String getSiteCodeOfTreatment();
            
            /**
             * Gets (as xml) the "SiteCodeOfTreatment" element
             */
            uk.nhs.nhsia.datastandards.ecds.SiteCodeOfTreatmentType xgetSiteCodeOfTreatment();
            
            /**
             * True if has "SiteCodeOfTreatment" element
             */
            boolean isSetSiteCodeOfTreatment();
            
            /**
             * Sets the "SiteCodeOfTreatment" element
             */
            void setSiteCodeOfTreatment(java.lang.String siteCodeOfTreatment);
            
            /**
             * Sets (as xml) the "SiteCodeOfTreatment" element
             */
            void xsetSiteCodeOfTreatment(uk.nhs.nhsia.datastandards.ecds.SiteCodeOfTreatmentType siteCodeOfTreatment);
            
            /**
             * Unsets the "SiteCodeOfTreatment" element
             */
            void unsetSiteCodeOfTreatment();
            
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
             * Gets the "IntendedClinicalCareIntensityCode" element
             */
            uk.nhs.nhsia.datastandards.ecds.IntendedClinicalCareIntensityCodeType.Enum getIntendedClinicalCareIntensityCode();
            
            /**
             * Gets (as xml) the "IntendedClinicalCareIntensityCode" element
             */
            uk.nhs.nhsia.datastandards.ecds.IntendedClinicalCareIntensityCodeType xgetIntendedClinicalCareIntensityCode();
            
            /**
             * True if has "IntendedClinicalCareIntensityCode" element
             */
            boolean isSetIntendedClinicalCareIntensityCode();
            
            /**
             * Sets the "IntendedClinicalCareIntensityCode" element
             */
            void setIntendedClinicalCareIntensityCode(uk.nhs.nhsia.datastandards.ecds.IntendedClinicalCareIntensityCodeType.Enum intendedClinicalCareIntensityCode);
            
            /**
             * Sets (as xml) the "IntendedClinicalCareIntensityCode" element
             */
            void xsetIntendedClinicalCareIntensityCode(uk.nhs.nhsia.datastandards.ecds.IntendedClinicalCareIntensityCodeType intendedClinicalCareIntensityCode);
            
            /**
             * Unsets the "IntendedClinicalCareIntensityCode" element
             */
            void unsetIntendedClinicalCareIntensityCode();
            
            /**
             * Gets the "IntendedAgeGroup" element
             */
            uk.nhs.nhsia.datastandards.ecds.IntendedAgeGroupType.Enum getIntendedAgeGroup();
            
            /**
             * Gets (as xml) the "IntendedAgeGroup" element
             */
            uk.nhs.nhsia.datastandards.ecds.IntendedAgeGroupType xgetIntendedAgeGroup();
            
            /**
             * True if has "IntendedAgeGroup" element
             */
            boolean isSetIntendedAgeGroup();
            
            /**
             * Sets the "IntendedAgeGroup" element
             */
            void setIntendedAgeGroup(uk.nhs.nhsia.datastandards.ecds.IntendedAgeGroupType.Enum intendedAgeGroup);
            
            /**
             * Sets (as xml) the "IntendedAgeGroup" element
             */
            void xsetIntendedAgeGroup(uk.nhs.nhsia.datastandards.ecds.IntendedAgeGroupType intendedAgeGroup);
            
            /**
             * Unsets the "IntendedAgeGroup" element
             */
            void unsetIntendedAgeGroup();
            
            /**
             * Gets the "SexOfPatientsCode" element
             */
            uk.nhs.nhsia.datastandards.ecds.SexOfPatientsCodeType.Enum getSexOfPatientsCode();
            
            /**
             * Gets (as xml) the "SexOfPatientsCode" element
             */
            uk.nhs.nhsia.datastandards.ecds.SexOfPatientsCodeType xgetSexOfPatientsCode();
            
            /**
             * True if has "SexOfPatientsCode" element
             */
            boolean isSetSexOfPatientsCode();
            
            /**
             * Sets the "SexOfPatientsCode" element
             */
            void setSexOfPatientsCode(uk.nhs.nhsia.datastandards.ecds.SexOfPatientsCodeType.Enum sexOfPatientsCode);
            
            /**
             * Sets (as xml) the "SexOfPatientsCode" element
             */
            void xsetSexOfPatientsCode(uk.nhs.nhsia.datastandards.ecds.SexOfPatientsCodeType sexOfPatientsCode);
            
            /**
             * Unsets the "SexOfPatientsCode" element
             */
            void unsetSexOfPatientsCode();
            
            /**
             * Gets the "WardDayPeriodAvailabilityCode" element
             */
            uk.nhs.nhsia.datastandards.ecds.WardDayPeriodAvailabilityCodeType.Enum getWardDayPeriodAvailabilityCode();
            
            /**
             * Gets (as xml) the "WardDayPeriodAvailabilityCode" element
             */
            uk.nhs.nhsia.datastandards.ecds.WardDayPeriodAvailabilityCodeType xgetWardDayPeriodAvailabilityCode();
            
            /**
             * True if has "WardDayPeriodAvailabilityCode" element
             */
            boolean isSetWardDayPeriodAvailabilityCode();
            
            /**
             * Sets the "WardDayPeriodAvailabilityCode" element
             */
            void setWardDayPeriodAvailabilityCode(uk.nhs.nhsia.datastandards.ecds.WardDayPeriodAvailabilityCodeType.Enum wardDayPeriodAvailabilityCode);
            
            /**
             * Sets (as xml) the "WardDayPeriodAvailabilityCode" element
             */
            void xsetWardDayPeriodAvailabilityCode(uk.nhs.nhsia.datastandards.ecds.WardDayPeriodAvailabilityCodeType wardDayPeriodAvailabilityCode);
            
            /**
             * Unsets the "WardDayPeriodAvailabilityCode" element
             */
            void unsetWardDayPeriodAvailabilityCode();
            
            /**
             * Gets the "WardNightPeriodAvailabilityCode" element
             */
            uk.nhs.nhsia.datastandards.ecds.WardNightPeriodAvailabilityCodeType.Enum getWardNightPeriodAvailabilityCode();
            
            /**
             * Gets (as xml) the "WardNightPeriodAvailabilityCode" element
             */
            uk.nhs.nhsia.datastandards.ecds.WardNightPeriodAvailabilityCodeType xgetWardNightPeriodAvailabilityCode();
            
            /**
             * True if has "WardNightPeriodAvailabilityCode" element
             */
            boolean isSetWardNightPeriodAvailabilityCode();
            
            /**
             * Sets the "WardNightPeriodAvailabilityCode" element
             */
            void setWardNightPeriodAvailabilityCode(uk.nhs.nhsia.datastandards.ecds.WardNightPeriodAvailabilityCodeType.Enum wardNightPeriodAvailabilityCode);
            
            /**
             * Sets (as xml) the "WardNightPeriodAvailabilityCode" element
             */
            void xsetWardNightPeriodAvailabilityCode(uk.nhs.nhsia.datastandards.ecds.WardNightPeriodAvailabilityCodeType wardNightPeriodAvailabilityCode);
            
            /**
             * Unsets the "WardNightPeriodAvailabilityCode" element
             */
            void unsetWardNightPeriodAvailabilityCode();
            
            /**
             * Gets the "WardSecurityLevel" element
             */
            uk.nhs.nhsia.datastandards.ecds.WardSecurityLevelType.Enum getWardSecurityLevel();
            
            /**
             * Gets (as xml) the "WardSecurityLevel" element
             */
            uk.nhs.nhsia.datastandards.ecds.WardSecurityLevelType xgetWardSecurityLevel();
            
            /**
             * True if has "WardSecurityLevel" element
             */
            boolean isSetWardSecurityLevel();
            
            /**
             * Sets the "WardSecurityLevel" element
             */
            void setWardSecurityLevel(uk.nhs.nhsia.datastandards.ecds.WardSecurityLevelType.Enum wardSecurityLevel);
            
            /**
             * Sets (as xml) the "WardSecurityLevel" element
             */
            void xsetWardSecurityLevel(uk.nhs.nhsia.datastandards.ecds.WardSecurityLevelType wardSecurityLevel);
            
            /**
             * Unsets the "WardSecurityLevel" element
             */
            void unsetWardSecurityLevel();
            
            /**
             * Gets the "WardCode" element
             */
            java.lang.String getWardCode();
            
            /**
             * Gets (as xml) the "WardCode" element
             */
            uk.nhs.nhsia.datastandards.ecds.WardCodeType xgetWardCode();
            
            /**
             * True if has "WardCode" element
             */
            boolean isSetWardCode();
            
            /**
             * Sets the "WardCode" element
             */
            void setWardCode(java.lang.String wardCode);
            
            /**
             * Sets (as xml) the "WardCode" element
             */
            void xsetWardCode(uk.nhs.nhsia.datastandards.ecds.WardCodeType wardCode);
            
            /**
             * Unsets the "WardCode" element
             */
            void unsetWardCode();
            
            /**
             * A factory class with static methods for creating instances
             * of this type.
             */
            
            public static final class Factory
            {
                public static uk.nhs.nhsia.datastandards.ecds.PsychiatricEpisodeStructure.LocationGroup.StartOfEpisode newInstance() {
                  return (uk.nhs.nhsia.datastandards.ecds.PsychiatricEpisodeStructure.LocationGroup.StartOfEpisode) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().newInstance( type, null ); }
                
                public static uk.nhs.nhsia.datastandards.ecds.PsychiatricEpisodeStructure.LocationGroup.StartOfEpisode newInstance(org.apache.xmlbeans.XmlOptions options) {
                  return (uk.nhs.nhsia.datastandards.ecds.PsychiatricEpisodeStructure.LocationGroup.StartOfEpisode) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().newInstance( type, options ); }
                
                private Factory() { } // No instance of this class allowed
            }
        }
        
        /**
         * An XML WardStayAtPsychiatricCensusDate(@http://www.nhsia.nhs.uk/DataStandards/XMLschema/CDS/ns).
         *
         * This is a complex type.
         */
        public interface WardStayAtPsychiatricCensusDate extends org.apache.xmlbeans.XmlObject
        {
            public static final org.apache.xmlbeans.SchemaType type = (org.apache.xmlbeans.SchemaType)
                org.apache.xmlbeans.XmlBeans.typeSystemForClassLoader(WardStayAtPsychiatricCensusDate.class.getClassLoader(), "schemaorg_apache_xmlbeans.system.s30C1180FF47174E0C8A992A2D657328B").resolveHandle("wardstayatpsychiatriccensusdateb5e5elemtype");
            
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
             * Gets the "SiteCodeOfTreatment" element
             */
            java.lang.String getSiteCodeOfTreatment();
            
            /**
             * Gets (as xml) the "SiteCodeOfTreatment" element
             */
            uk.nhs.nhsia.datastandards.ecds.SiteCodeOfTreatmentType xgetSiteCodeOfTreatment();
            
            /**
             * True if has "SiteCodeOfTreatment" element
             */
            boolean isSetSiteCodeOfTreatment();
            
            /**
             * Sets the "SiteCodeOfTreatment" element
             */
            void setSiteCodeOfTreatment(java.lang.String siteCodeOfTreatment);
            
            /**
             * Sets (as xml) the "SiteCodeOfTreatment" element
             */
            void xsetSiteCodeOfTreatment(uk.nhs.nhsia.datastandards.ecds.SiteCodeOfTreatmentType siteCodeOfTreatment);
            
            /**
             * Unsets the "SiteCodeOfTreatment" element
             */
            void unsetSiteCodeOfTreatment();
            
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
             * Gets the "IntendedClinicalCareIntensityCode" element
             */
            uk.nhs.nhsia.datastandards.ecds.IntendedClinicalCareIntensityCodeType.Enum getIntendedClinicalCareIntensityCode();
            
            /**
             * Gets (as xml) the "IntendedClinicalCareIntensityCode" element
             */
            uk.nhs.nhsia.datastandards.ecds.IntendedClinicalCareIntensityCodeType xgetIntendedClinicalCareIntensityCode();
            
            /**
             * True if has "IntendedClinicalCareIntensityCode" element
             */
            boolean isSetIntendedClinicalCareIntensityCode();
            
            /**
             * Sets the "IntendedClinicalCareIntensityCode" element
             */
            void setIntendedClinicalCareIntensityCode(uk.nhs.nhsia.datastandards.ecds.IntendedClinicalCareIntensityCodeType.Enum intendedClinicalCareIntensityCode);
            
            /**
             * Sets (as xml) the "IntendedClinicalCareIntensityCode" element
             */
            void xsetIntendedClinicalCareIntensityCode(uk.nhs.nhsia.datastandards.ecds.IntendedClinicalCareIntensityCodeType intendedClinicalCareIntensityCode);
            
            /**
             * Unsets the "IntendedClinicalCareIntensityCode" element
             */
            void unsetIntendedClinicalCareIntensityCode();
            
            /**
             * Gets the "IntendedAgeGroup" element
             */
            uk.nhs.nhsia.datastandards.ecds.IntendedAgeGroupType.Enum getIntendedAgeGroup();
            
            /**
             * Gets (as xml) the "IntendedAgeGroup" element
             */
            uk.nhs.nhsia.datastandards.ecds.IntendedAgeGroupType xgetIntendedAgeGroup();
            
            /**
             * True if has "IntendedAgeGroup" element
             */
            boolean isSetIntendedAgeGroup();
            
            /**
             * Sets the "IntendedAgeGroup" element
             */
            void setIntendedAgeGroup(uk.nhs.nhsia.datastandards.ecds.IntendedAgeGroupType.Enum intendedAgeGroup);
            
            /**
             * Sets (as xml) the "IntendedAgeGroup" element
             */
            void xsetIntendedAgeGroup(uk.nhs.nhsia.datastandards.ecds.IntendedAgeGroupType intendedAgeGroup);
            
            /**
             * Unsets the "IntendedAgeGroup" element
             */
            void unsetIntendedAgeGroup();
            
            /**
             * Gets the "SexOfPatientsCode" element
             */
            uk.nhs.nhsia.datastandards.ecds.SexOfPatientsCodeType.Enum getSexOfPatientsCode();
            
            /**
             * Gets (as xml) the "SexOfPatientsCode" element
             */
            uk.nhs.nhsia.datastandards.ecds.SexOfPatientsCodeType xgetSexOfPatientsCode();
            
            /**
             * True if has "SexOfPatientsCode" element
             */
            boolean isSetSexOfPatientsCode();
            
            /**
             * Sets the "SexOfPatientsCode" element
             */
            void setSexOfPatientsCode(uk.nhs.nhsia.datastandards.ecds.SexOfPatientsCodeType.Enum sexOfPatientsCode);
            
            /**
             * Sets (as xml) the "SexOfPatientsCode" element
             */
            void xsetSexOfPatientsCode(uk.nhs.nhsia.datastandards.ecds.SexOfPatientsCodeType sexOfPatientsCode);
            
            /**
             * Unsets the "SexOfPatientsCode" element
             */
            void unsetSexOfPatientsCode();
            
            /**
             * Gets the "WardDayPeriodAvailabilityCode" element
             */
            uk.nhs.nhsia.datastandards.ecds.WardDayPeriodAvailabilityCodeType.Enum getWardDayPeriodAvailabilityCode();
            
            /**
             * Gets (as xml) the "WardDayPeriodAvailabilityCode" element
             */
            uk.nhs.nhsia.datastandards.ecds.WardDayPeriodAvailabilityCodeType xgetWardDayPeriodAvailabilityCode();
            
            /**
             * True if has "WardDayPeriodAvailabilityCode" element
             */
            boolean isSetWardDayPeriodAvailabilityCode();
            
            /**
             * Sets the "WardDayPeriodAvailabilityCode" element
             */
            void setWardDayPeriodAvailabilityCode(uk.nhs.nhsia.datastandards.ecds.WardDayPeriodAvailabilityCodeType.Enum wardDayPeriodAvailabilityCode);
            
            /**
             * Sets (as xml) the "WardDayPeriodAvailabilityCode" element
             */
            void xsetWardDayPeriodAvailabilityCode(uk.nhs.nhsia.datastandards.ecds.WardDayPeriodAvailabilityCodeType wardDayPeriodAvailabilityCode);
            
            /**
             * Unsets the "WardDayPeriodAvailabilityCode" element
             */
            void unsetWardDayPeriodAvailabilityCode();
            
            /**
             * Gets the "WardNightPeriodAvailabilityCode" element
             */
            uk.nhs.nhsia.datastandards.ecds.WardNightPeriodAvailabilityCodeType.Enum getWardNightPeriodAvailabilityCode();
            
            /**
             * Gets (as xml) the "WardNightPeriodAvailabilityCode" element
             */
            uk.nhs.nhsia.datastandards.ecds.WardNightPeriodAvailabilityCodeType xgetWardNightPeriodAvailabilityCode();
            
            /**
             * True if has "WardNightPeriodAvailabilityCode" element
             */
            boolean isSetWardNightPeriodAvailabilityCode();
            
            /**
             * Sets the "WardNightPeriodAvailabilityCode" element
             */
            void setWardNightPeriodAvailabilityCode(uk.nhs.nhsia.datastandards.ecds.WardNightPeriodAvailabilityCodeType.Enum wardNightPeriodAvailabilityCode);
            
            /**
             * Sets (as xml) the "WardNightPeriodAvailabilityCode" element
             */
            void xsetWardNightPeriodAvailabilityCode(uk.nhs.nhsia.datastandards.ecds.WardNightPeriodAvailabilityCodeType wardNightPeriodAvailabilityCode);
            
            /**
             * Unsets the "WardNightPeriodAvailabilityCode" element
             */
            void unsetWardNightPeriodAvailabilityCode();
            
            /**
             * Gets the "DetainedAndOrLongTermPsychiatricCensusDate" element
             */
            java.util.Calendar getDetainedAndOrLongTermPsychiatricCensusDate();
            
            /**
             * Gets (as xml) the "DetainedAndOrLongTermPsychiatricCensusDate" element
             */
            uk.nhs.nhsia.datastandards.ecds.DetainedAndOrLongTermPsychiatricCensusDateType xgetDetainedAndOrLongTermPsychiatricCensusDate();
            
            /**
             * True if has "DetainedAndOrLongTermPsychiatricCensusDate" element
             */
            boolean isSetDetainedAndOrLongTermPsychiatricCensusDate();
            
            /**
             * Sets the "DetainedAndOrLongTermPsychiatricCensusDate" element
             */
            void setDetainedAndOrLongTermPsychiatricCensusDate(java.util.Calendar detainedAndOrLongTermPsychiatricCensusDate);
            
            /**
             * Sets (as xml) the "DetainedAndOrLongTermPsychiatricCensusDate" element
             */
            void xsetDetainedAndOrLongTermPsychiatricCensusDate(uk.nhs.nhsia.datastandards.ecds.DetainedAndOrLongTermPsychiatricCensusDateType detainedAndOrLongTermPsychiatricCensusDate);
            
            /**
             * Unsets the "DetainedAndOrLongTermPsychiatricCensusDate" element
             */
            void unsetDetainedAndOrLongTermPsychiatricCensusDate();
            
            /**
             * Gets the "WardSecurityLevel" element
             */
            uk.nhs.nhsia.datastandards.ecds.WardSecurityLevelType.Enum getWardSecurityLevel();
            
            /**
             * Gets (as xml) the "WardSecurityLevel" element
             */
            uk.nhs.nhsia.datastandards.ecds.WardSecurityLevelType xgetWardSecurityLevel();
            
            /**
             * True if has "WardSecurityLevel" element
             */
            boolean isSetWardSecurityLevel();
            
            /**
             * Sets the "WardSecurityLevel" element
             */
            void setWardSecurityLevel(uk.nhs.nhsia.datastandards.ecds.WardSecurityLevelType.Enum wardSecurityLevel);
            
            /**
             * Sets (as xml) the "WardSecurityLevel" element
             */
            void xsetWardSecurityLevel(uk.nhs.nhsia.datastandards.ecds.WardSecurityLevelType wardSecurityLevel);
            
            /**
             * Unsets the "WardSecurityLevel" element
             */
            void unsetWardSecurityLevel();
            
            /**
             * Gets the "WardCode" element
             */
            java.lang.String getWardCode();
            
            /**
             * Gets (as xml) the "WardCode" element
             */
            uk.nhs.nhsia.datastandards.ecds.WardCodeType xgetWardCode();
            
            /**
             * True if has "WardCode" element
             */
            boolean isSetWardCode();
            
            /**
             * Sets the "WardCode" element
             */
            void setWardCode(java.lang.String wardCode);
            
            /**
             * Sets (as xml) the "WardCode" element
             */
            void xsetWardCode(uk.nhs.nhsia.datastandards.ecds.WardCodeType wardCode);
            
            /**
             * Unsets the "WardCode" element
             */
            void unsetWardCode();
            
            /**
             * A factory class with static methods for creating instances
             * of this type.
             */
            
            public static final class Factory
            {
                public static uk.nhs.nhsia.datastandards.ecds.PsychiatricEpisodeStructure.LocationGroup.WardStayAtPsychiatricCensusDate newInstance() {
                  return (uk.nhs.nhsia.datastandards.ecds.PsychiatricEpisodeStructure.LocationGroup.WardStayAtPsychiatricCensusDate) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().newInstance( type, null ); }
                
                public static uk.nhs.nhsia.datastandards.ecds.PsychiatricEpisodeStructure.LocationGroup.WardStayAtPsychiatricCensusDate newInstance(org.apache.xmlbeans.XmlOptions options) {
                  return (uk.nhs.nhsia.datastandards.ecds.PsychiatricEpisodeStructure.LocationGroup.WardStayAtPsychiatricCensusDate) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().newInstance( type, options ); }
                
                private Factory() { } // No instance of this class allowed
            }
        }
        
        /**
         * A factory class with static methods for creating instances
         * of this type.
         */
        
        public static final class Factory
        {
            public static uk.nhs.nhsia.datastandards.ecds.PsychiatricEpisodeStructure.LocationGroup newInstance() {
              return (uk.nhs.nhsia.datastandards.ecds.PsychiatricEpisodeStructure.LocationGroup) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().newInstance( type, null ); }
            
            public static uk.nhs.nhsia.datastandards.ecds.PsychiatricEpisodeStructure.LocationGroup newInstance(org.apache.xmlbeans.XmlOptions options) {
              return (uk.nhs.nhsia.datastandards.ecds.PsychiatricEpisodeStructure.LocationGroup) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().newInstance( type, options ); }
            
            private Factory() { } // No instance of this class allowed
        }
    }
    
    /**
     * A factory class with static methods for creating instances
     * of this type.
     */
    
    public static final class Factory
    {
        public static uk.nhs.nhsia.datastandards.ecds.PsychiatricEpisodeStructure newInstance() {
          return (uk.nhs.nhsia.datastandards.ecds.PsychiatricEpisodeStructure) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().newInstance( type, null ); }
        
        public static uk.nhs.nhsia.datastandards.ecds.PsychiatricEpisodeStructure newInstance(org.apache.xmlbeans.XmlOptions options) {
          return (uk.nhs.nhsia.datastandards.ecds.PsychiatricEpisodeStructure) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().newInstance( type, options ); }
        
        /** @param xmlAsString the string value to parse */
        public static uk.nhs.nhsia.datastandards.ecds.PsychiatricEpisodeStructure parse(java.lang.String xmlAsString) throws org.apache.xmlbeans.XmlException {
          return (uk.nhs.nhsia.datastandards.ecds.PsychiatricEpisodeStructure) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( xmlAsString, type, null ); }
        
        public static uk.nhs.nhsia.datastandards.ecds.PsychiatricEpisodeStructure parse(java.lang.String xmlAsString, org.apache.xmlbeans.XmlOptions options) throws org.apache.xmlbeans.XmlException {
          return (uk.nhs.nhsia.datastandards.ecds.PsychiatricEpisodeStructure) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( xmlAsString, type, options ); }
        
        /** @param file the file from which to load an xml document */
        public static uk.nhs.nhsia.datastandards.ecds.PsychiatricEpisodeStructure parse(java.io.File file) throws org.apache.xmlbeans.XmlException, java.io.IOException {
          return (uk.nhs.nhsia.datastandards.ecds.PsychiatricEpisodeStructure) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( file, type, null ); }
        
        public static uk.nhs.nhsia.datastandards.ecds.PsychiatricEpisodeStructure parse(java.io.File file, org.apache.xmlbeans.XmlOptions options) throws org.apache.xmlbeans.XmlException, java.io.IOException {
          return (uk.nhs.nhsia.datastandards.ecds.PsychiatricEpisodeStructure) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( file, type, options ); }
        
        public static uk.nhs.nhsia.datastandards.ecds.PsychiatricEpisodeStructure parse(java.net.URL u) throws org.apache.xmlbeans.XmlException, java.io.IOException {
          return (uk.nhs.nhsia.datastandards.ecds.PsychiatricEpisodeStructure) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( u, type, null ); }
        
        public static uk.nhs.nhsia.datastandards.ecds.PsychiatricEpisodeStructure parse(java.net.URL u, org.apache.xmlbeans.XmlOptions options) throws org.apache.xmlbeans.XmlException, java.io.IOException {
          return (uk.nhs.nhsia.datastandards.ecds.PsychiatricEpisodeStructure) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( u, type, options ); }
        
        public static uk.nhs.nhsia.datastandards.ecds.PsychiatricEpisodeStructure parse(java.io.InputStream is) throws org.apache.xmlbeans.XmlException, java.io.IOException {
          return (uk.nhs.nhsia.datastandards.ecds.PsychiatricEpisodeStructure) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( is, type, null ); }
        
        public static uk.nhs.nhsia.datastandards.ecds.PsychiatricEpisodeStructure parse(java.io.InputStream is, org.apache.xmlbeans.XmlOptions options) throws org.apache.xmlbeans.XmlException, java.io.IOException {
          return (uk.nhs.nhsia.datastandards.ecds.PsychiatricEpisodeStructure) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( is, type, options ); }
        
        public static uk.nhs.nhsia.datastandards.ecds.PsychiatricEpisodeStructure parse(java.io.Reader r) throws org.apache.xmlbeans.XmlException, java.io.IOException {
          return (uk.nhs.nhsia.datastandards.ecds.PsychiatricEpisodeStructure) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( r, type, null ); }
        
        public static uk.nhs.nhsia.datastandards.ecds.PsychiatricEpisodeStructure parse(java.io.Reader r, org.apache.xmlbeans.XmlOptions options) throws org.apache.xmlbeans.XmlException, java.io.IOException {
          return (uk.nhs.nhsia.datastandards.ecds.PsychiatricEpisodeStructure) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( r, type, options ); }
        
        public static uk.nhs.nhsia.datastandards.ecds.PsychiatricEpisodeStructure parse(javax.xml.stream.XMLStreamReader sr) throws org.apache.xmlbeans.XmlException {
          return (uk.nhs.nhsia.datastandards.ecds.PsychiatricEpisodeStructure) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( sr, type, null ); }
        
        public static uk.nhs.nhsia.datastandards.ecds.PsychiatricEpisodeStructure parse(javax.xml.stream.XMLStreamReader sr, org.apache.xmlbeans.XmlOptions options) throws org.apache.xmlbeans.XmlException {
          return (uk.nhs.nhsia.datastandards.ecds.PsychiatricEpisodeStructure) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( sr, type, options ); }
        
        public static uk.nhs.nhsia.datastandards.ecds.PsychiatricEpisodeStructure parse(org.w3c.dom.Node node) throws org.apache.xmlbeans.XmlException {
          return (uk.nhs.nhsia.datastandards.ecds.PsychiatricEpisodeStructure) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( node, type, null ); }
        
        public static uk.nhs.nhsia.datastandards.ecds.PsychiatricEpisodeStructure parse(org.w3c.dom.Node node, org.apache.xmlbeans.XmlOptions options) throws org.apache.xmlbeans.XmlException {
          return (uk.nhs.nhsia.datastandards.ecds.PsychiatricEpisodeStructure) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( node, type, options ); }
        
        /** @deprecated {@link org.apache.xmlbeans.xml.stream.XMLInputStream} */
        public static uk.nhs.nhsia.datastandards.ecds.PsychiatricEpisodeStructure parse(org.apache.xmlbeans.xml.stream.XMLInputStream xis) throws org.apache.xmlbeans.XmlException, org.apache.xmlbeans.xml.stream.XMLStreamException {
          return (uk.nhs.nhsia.datastandards.ecds.PsychiatricEpisodeStructure) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( xis, type, null ); }
        
        /** @deprecated {@link org.apache.xmlbeans.xml.stream.XMLInputStream} */
        public static uk.nhs.nhsia.datastandards.ecds.PsychiatricEpisodeStructure parse(org.apache.xmlbeans.xml.stream.XMLInputStream xis, org.apache.xmlbeans.XmlOptions options) throws org.apache.xmlbeans.XmlException, org.apache.xmlbeans.xml.stream.XMLStreamException {
          return (uk.nhs.nhsia.datastandards.ecds.PsychiatricEpisodeStructure) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( xis, type, options ); }
        
        /** @deprecated {@link org.apache.xmlbeans.xml.stream.XMLInputStream} */
        public static org.apache.xmlbeans.xml.stream.XMLInputStream newValidatingXMLInputStream(org.apache.xmlbeans.xml.stream.XMLInputStream xis) throws org.apache.xmlbeans.XmlException, org.apache.xmlbeans.xml.stream.XMLStreamException {
          return org.apache.xmlbeans.XmlBeans.getContextTypeLoader().newValidatingXMLInputStream( xis, type, null ); }
        
        /** @deprecated {@link org.apache.xmlbeans.xml.stream.XMLInputStream} */
        public static org.apache.xmlbeans.xml.stream.XMLInputStream newValidatingXMLInputStream(org.apache.xmlbeans.xml.stream.XMLInputStream xis, org.apache.xmlbeans.XmlOptions options) throws org.apache.xmlbeans.XmlException, org.apache.xmlbeans.xml.stream.XMLStreamException {
          return org.apache.xmlbeans.XmlBeans.getContextTypeLoader().newValidatingXMLInputStream( xis, type, options ); }
        
        private Factory() { } // No instance of this class allowed
    }
}
