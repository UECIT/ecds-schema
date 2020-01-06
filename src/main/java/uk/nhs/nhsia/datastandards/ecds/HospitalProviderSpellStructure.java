/*
 * XML Type:  HospitalProviderSpell_Structure
 * Namespace: http://www.nhsia.nhs.uk/DataStandards/XMLschema/CDS/ns
 * Java type: uk.nhs.nhsia.datastandards.ecds.HospitalProviderSpellStructure
 *
 * Automatically generated - do not modify.
 */
package uk.nhs.nhsia.datastandards.ecds;


/**
 * An XML HospitalProviderSpell_Structure(@http://www.nhsia.nhs.uk/DataStandards/XMLschema/CDS/ns).
 *
 * This is a complex type.
 */
public interface HospitalProviderSpellStructure extends org.apache.xmlbeans.XmlObject
{
    public static final org.apache.xmlbeans.SchemaType type = (org.apache.xmlbeans.SchemaType)
        org.apache.xmlbeans.XmlBeans.typeSystemForClassLoader(HospitalProviderSpellStructure.class.getClassLoader(), "schemaorg_apache_xmlbeans.system.s30C1180FF47174E0C8A992A2D657328B").resolveHandle("hospitalproviderspellstructure6592type");
    
    /**
     * Gets the "AdmissionCharacteristics" element
     */
    uk.nhs.nhsia.datastandards.ecds.HospitalProviderSpellStructure.AdmissionCharacteristics getAdmissionCharacteristics();
    
    /**
     * Sets the "AdmissionCharacteristics" element
     */
    void setAdmissionCharacteristics(uk.nhs.nhsia.datastandards.ecds.HospitalProviderSpellStructure.AdmissionCharacteristics admissionCharacteristics);
    
    /**
     * Appends and returns a new empty "AdmissionCharacteristics" element
     */
    uk.nhs.nhsia.datastandards.ecds.HospitalProviderSpellStructure.AdmissionCharacteristics addNewAdmissionCharacteristics();
    
    /**
     * Gets the "DischargeCharacteristics" element
     */
    uk.nhs.nhsia.datastandards.ecds.HospitalProviderSpellStructure.DischargeCharacteristics getDischargeCharacteristics();
    
    /**
     * True if has "DischargeCharacteristics" element
     */
    boolean isSetDischargeCharacteristics();
    
    /**
     * Sets the "DischargeCharacteristics" element
     */
    void setDischargeCharacteristics(uk.nhs.nhsia.datastandards.ecds.HospitalProviderSpellStructure.DischargeCharacteristics dischargeCharacteristics);
    
    /**
     * Appends and returns a new empty "DischargeCharacteristics" element
     */
    uk.nhs.nhsia.datastandards.ecds.HospitalProviderSpellStructure.DischargeCharacteristics addNewDischargeCharacteristics();
    
    /**
     * Unsets the "DischargeCharacteristics" element
     */
    void unsetDischargeCharacteristics();
    
    /**
     * An XML AdmissionCharacteristics(@http://www.nhsia.nhs.uk/DataStandards/XMLschema/CDS/ns).
     *
     * This is a complex type.
     */
    public interface AdmissionCharacteristics extends org.apache.xmlbeans.XmlObject
    {
        public static final org.apache.xmlbeans.SchemaType type = (org.apache.xmlbeans.SchemaType)
            org.apache.xmlbeans.XmlBeans.typeSystemForClassLoader(AdmissionCharacteristics.class.getClassLoader(), "schemaorg_apache_xmlbeans.system.s30C1180FF47174E0C8A992A2D657328B").resolveHandle("admissioncharacteristics2047elemtype");
        
        /**
         * Gets the "HospitalProviderSpellNumber" element
         */
        java.lang.String getHospitalProviderSpellNumber();
        
        /**
         * Gets (as xml) the "HospitalProviderSpellNumber" element
         */
        uk.nhs.nhsia.datastandards.ecds.HospitalProviderSpellNumberType xgetHospitalProviderSpellNumber();
        
        /**
         * True if has "HospitalProviderSpellNumber" element
         */
        boolean isSetHospitalProviderSpellNumber();
        
        /**
         * Sets the "HospitalProviderSpellNumber" element
         */
        void setHospitalProviderSpellNumber(java.lang.String hospitalProviderSpellNumber);
        
        /**
         * Sets (as xml) the "HospitalProviderSpellNumber" element
         */
        void xsetHospitalProviderSpellNumber(uk.nhs.nhsia.datastandards.ecds.HospitalProviderSpellNumberType hospitalProviderSpellNumber);
        
        /**
         * Unsets the "HospitalProviderSpellNumber" element
         */
        void unsetHospitalProviderSpellNumber();
        
        /**
         * Gets the "AdministrativeCategoryCodeOnAdmission" element
         */
        uk.nhs.nhsia.datastandards.ecds.AdministrativeCategoryCodeType.Enum getAdministrativeCategoryCodeOnAdmission();
        
        /**
         * Gets (as xml) the "AdministrativeCategoryCodeOnAdmission" element
         */
        uk.nhs.nhsia.datastandards.ecds.AdministrativeCategoryCodeHospitalProviderSpellType xgetAdministrativeCategoryCodeOnAdmission();
        
        /**
         * True if has "AdministrativeCategoryCodeOnAdmission" element
         */
        boolean isSetAdministrativeCategoryCodeOnAdmission();
        
        /**
         * Sets the "AdministrativeCategoryCodeOnAdmission" element
         */
        void setAdministrativeCategoryCodeOnAdmission(uk.nhs.nhsia.datastandards.ecds.AdministrativeCategoryCodeType.Enum administrativeCategoryCodeOnAdmission);
        
        /**
         * Sets (as xml) the "AdministrativeCategoryCodeOnAdmission" element
         */
        void xsetAdministrativeCategoryCodeOnAdmission(uk.nhs.nhsia.datastandards.ecds.AdministrativeCategoryCodeHospitalProviderSpellType administrativeCategoryCodeOnAdmission);
        
        /**
         * Unsets the "AdministrativeCategoryCodeOnAdmission" element
         */
        void unsetAdministrativeCategoryCodeOnAdmission();
        
        /**
         * Gets the "PatientClassificationCode" element
         */
        uk.nhs.nhsia.datastandards.ecds.PatientClassificationCodeType.Enum getPatientClassificationCode();
        
        /**
         * Gets (as xml) the "PatientClassificationCode" element
         */
        uk.nhs.nhsia.datastandards.ecds.PatientClassificationCodeType xgetPatientClassificationCode();
        
        /**
         * True if has "PatientClassificationCode" element
         */
        boolean isSetPatientClassificationCode();
        
        /**
         * Sets the "PatientClassificationCode" element
         */
        void setPatientClassificationCode(uk.nhs.nhsia.datastandards.ecds.PatientClassificationCodeType.Enum patientClassificationCode);
        
        /**
         * Sets (as xml) the "PatientClassificationCode" element
         */
        void xsetPatientClassificationCode(uk.nhs.nhsia.datastandards.ecds.PatientClassificationCodeType patientClassificationCode);
        
        /**
         * Unsets the "PatientClassificationCode" element
         */
        void unsetPatientClassificationCode();
        
        /**
         * Gets the "AdmissionMethodCode_HospitalProviderSpell" element
         */
        uk.nhs.nhsia.datastandards.ecds.AdmissionMethodCodeHospitalProviderSpellType.Enum getAdmissionMethodCodeHospitalProviderSpell();
        
        /**
         * Gets (as xml) the "AdmissionMethodCode_HospitalProviderSpell" element
         */
        uk.nhs.nhsia.datastandards.ecds.AdmissionMethodCodeHospitalProviderSpellType xgetAdmissionMethodCodeHospitalProviderSpell();
        
        /**
         * True if has "AdmissionMethodCode_HospitalProviderSpell" element
         */
        boolean isSetAdmissionMethodCodeHospitalProviderSpell();
        
        /**
         * Sets the "AdmissionMethodCode_HospitalProviderSpell" element
         */
        void setAdmissionMethodCodeHospitalProviderSpell(uk.nhs.nhsia.datastandards.ecds.AdmissionMethodCodeHospitalProviderSpellType.Enum admissionMethodCodeHospitalProviderSpell);
        
        /**
         * Sets (as xml) the "AdmissionMethodCode_HospitalProviderSpell" element
         */
        void xsetAdmissionMethodCodeHospitalProviderSpell(uk.nhs.nhsia.datastandards.ecds.AdmissionMethodCodeHospitalProviderSpellType admissionMethodCodeHospitalProviderSpell);
        
        /**
         * Unsets the "AdmissionMethodCode_HospitalProviderSpell" element
         */
        void unsetAdmissionMethodCodeHospitalProviderSpell();
        
        /**
         * Gets the "SourceOfAdmissionCode_HospitalProviderSpell" element
         */
        uk.nhs.nhsia.datastandards.ecds.SourceOfAdmissionCodeHospitalProviderSpellType.Enum getSourceOfAdmissionCodeHospitalProviderSpell();
        
        /**
         * Gets (as xml) the "SourceOfAdmissionCode_HospitalProviderSpell" element
         */
        uk.nhs.nhsia.datastandards.ecds.SourceOfAdmissionCodeHospitalProviderSpellType xgetSourceOfAdmissionCodeHospitalProviderSpell();
        
        /**
         * True if has "SourceOfAdmissionCode_HospitalProviderSpell" element
         */
        boolean isSetSourceOfAdmissionCodeHospitalProviderSpell();
        
        /**
         * Sets the "SourceOfAdmissionCode_HospitalProviderSpell" element
         */
        void setSourceOfAdmissionCodeHospitalProviderSpell(uk.nhs.nhsia.datastandards.ecds.SourceOfAdmissionCodeHospitalProviderSpellType.Enum sourceOfAdmissionCodeHospitalProviderSpell);
        
        /**
         * Sets (as xml) the "SourceOfAdmissionCode_HospitalProviderSpell" element
         */
        void xsetSourceOfAdmissionCodeHospitalProviderSpell(uk.nhs.nhsia.datastandards.ecds.SourceOfAdmissionCodeHospitalProviderSpellType sourceOfAdmissionCodeHospitalProviderSpell);
        
        /**
         * Unsets the "SourceOfAdmissionCode_HospitalProviderSpell" element
         */
        void unsetSourceOfAdmissionCodeHospitalProviderSpell();
        
        /**
         * Gets the "StartDate_HospitalProviderSpell" element
         */
        java.util.Calendar getStartDateHospitalProviderSpell();
        
        /**
         * Gets (as xml) the "StartDate_HospitalProviderSpell" element
         */
        uk.nhs.nhsia.datastandards.ecds.StartDateHospitalProviderSpellType xgetStartDateHospitalProviderSpell();
        
        /**
         * Sets the "StartDate_HospitalProviderSpell" element
         */
        void setStartDateHospitalProviderSpell(java.util.Calendar startDateHospitalProviderSpell);
        
        /**
         * Sets (as xml) the "StartDate_HospitalProviderSpell" element
         */
        void xsetStartDateHospitalProviderSpell(uk.nhs.nhsia.datastandards.ecds.StartDateHospitalProviderSpellType startDateHospitalProviderSpell);
        
        /**
         * Gets the "StartTime_HospitalProviderSpell" element
         */
        java.util.Calendar getStartTimeHospitalProviderSpell();
        
        /**
         * Gets (as xml) the "StartTime_HospitalProviderSpell" element
         */
        uk.nhs.nhsia.datastandards.ecds.StartTimeHospitalProviderSpellType xgetStartTimeHospitalProviderSpell();
        
        /**
         * True if has "StartTime_HospitalProviderSpell" element
         */
        boolean isSetStartTimeHospitalProviderSpell();
        
        /**
         * Sets the "StartTime_HospitalProviderSpell" element
         */
        void setStartTimeHospitalProviderSpell(java.util.Calendar startTimeHospitalProviderSpell);
        
        /**
         * Sets (as xml) the "StartTime_HospitalProviderSpell" element
         */
        void xsetStartTimeHospitalProviderSpell(uk.nhs.nhsia.datastandards.ecds.StartTimeHospitalProviderSpellType startTimeHospitalProviderSpell);
        
        /**
         * Unsets the "StartTime_HospitalProviderSpell" element
         */
        void unsetStartTimeHospitalProviderSpell();
        
        /**
         * Gets the "AgeOnAdmission" element
         */
        int getAgeOnAdmission();
        
        /**
         * Gets (as xml) the "AgeOnAdmission" element
         */
        uk.nhs.nhsia.datastandards.ecds.AgeOnAdmissionType xgetAgeOnAdmission();
        
        /**
         * Sets the "AgeOnAdmission" element
         */
        void setAgeOnAdmission(int ageOnAdmission);
        
        /**
         * Sets (as xml) the "AgeOnAdmission" element
         */
        void xsetAgeOnAdmission(uk.nhs.nhsia.datastandards.ecds.AgeOnAdmissionType ageOnAdmission);
        
        /**
         * Gets the "AmbulanceIncidentNumber" element
         */
        java.lang.String getAmbulanceIncidentNumber();
        
        /**
         * Gets (as xml) the "AmbulanceIncidentNumber" element
         */
        uk.nhs.nhsia.datastandards.ecds.AmbulanceIncidentNumberType xgetAmbulanceIncidentNumber();
        
        /**
         * True if has "AmbulanceIncidentNumber" element
         */
        boolean isSetAmbulanceIncidentNumber();
        
        /**
         * Sets the "AmbulanceIncidentNumber" element
         */
        void setAmbulanceIncidentNumber(java.lang.String ambulanceIncidentNumber);
        
        /**
         * Sets (as xml) the "AmbulanceIncidentNumber" element
         */
        void xsetAmbulanceIncidentNumber(uk.nhs.nhsia.datastandards.ecds.AmbulanceIncidentNumberType ambulanceIncidentNumber);
        
        /**
         * Unsets the "AmbulanceIncidentNumber" element
         */
        void unsetAmbulanceIncidentNumber();
        
        /**
         * Gets the "OrganisationCodeConveyingAmbulanceTrust" element
         */
        java.lang.String getOrganisationCodeConveyingAmbulanceTrust();
        
        /**
         * Gets (as xml) the "OrganisationCodeConveyingAmbulanceTrust" element
         */
        uk.nhs.nhsia.datastandards.ecds.OrganisationCodeConveyingAmbulanceTrustType xgetOrganisationCodeConveyingAmbulanceTrust();
        
        /**
         * True if has "OrganisationCodeConveyingAmbulanceTrust" element
         */
        boolean isSetOrganisationCodeConveyingAmbulanceTrust();
        
        /**
         * Sets the "OrganisationCodeConveyingAmbulanceTrust" element
         */
        void setOrganisationCodeConveyingAmbulanceTrust(java.lang.String organisationCodeConveyingAmbulanceTrust);
        
        /**
         * Sets (as xml) the "OrganisationCodeConveyingAmbulanceTrust" element
         */
        void xsetOrganisationCodeConveyingAmbulanceTrust(uk.nhs.nhsia.datastandards.ecds.OrganisationCodeConveyingAmbulanceTrustType organisationCodeConveyingAmbulanceTrust);
        
        /**
         * Unsets the "OrganisationCodeConveyingAmbulanceTrust" element
         */
        void unsetOrganisationCodeConveyingAmbulanceTrust();
        
        /**
         * A factory class with static methods for creating instances
         * of this type.
         */
        
        public static final class Factory
        {
            public static uk.nhs.nhsia.datastandards.ecds.HospitalProviderSpellStructure.AdmissionCharacteristics newInstance() {
              return (uk.nhs.nhsia.datastandards.ecds.HospitalProviderSpellStructure.AdmissionCharacteristics) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().newInstance( type, null ); }
            
            public static uk.nhs.nhsia.datastandards.ecds.HospitalProviderSpellStructure.AdmissionCharacteristics newInstance(org.apache.xmlbeans.XmlOptions options) {
              return (uk.nhs.nhsia.datastandards.ecds.HospitalProviderSpellStructure.AdmissionCharacteristics) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().newInstance( type, options ); }
            
            private Factory() { } // No instance of this class allowed
        }
    }
    
    /**
     * An XML DischargeCharacteristics(@http://www.nhsia.nhs.uk/DataStandards/XMLschema/CDS/ns).
     *
     * This is a complex type.
     */
    public interface DischargeCharacteristics extends org.apache.xmlbeans.XmlObject
    {
        public static final org.apache.xmlbeans.SchemaType type = (org.apache.xmlbeans.SchemaType)
            org.apache.xmlbeans.XmlBeans.typeSystemForClassLoader(DischargeCharacteristics.class.getClassLoader(), "schemaorg_apache_xmlbeans.system.s30C1180FF47174E0C8A992A2D657328B").resolveHandle("dischargecharacteristics5800elemtype");
        
        /**
         * Gets the "DischargeDestinationCode_HospitalProviderSpell" element
         */
        uk.nhs.nhsia.datastandards.ecds.DischargeDestinationCodeHospitalProviderSpellType.Enum getDischargeDestinationCodeHospitalProviderSpell();
        
        /**
         * Gets (as xml) the "DischargeDestinationCode_HospitalProviderSpell" element
         */
        uk.nhs.nhsia.datastandards.ecds.DischargeDestinationCodeHospitalProviderSpellType xgetDischargeDestinationCodeHospitalProviderSpell();
        
        /**
         * True if has "DischargeDestinationCode_HospitalProviderSpell" element
         */
        boolean isSetDischargeDestinationCodeHospitalProviderSpell();
        
        /**
         * Sets the "DischargeDestinationCode_HospitalProviderSpell" element
         */
        void setDischargeDestinationCodeHospitalProviderSpell(uk.nhs.nhsia.datastandards.ecds.DischargeDestinationCodeHospitalProviderSpellType.Enum dischargeDestinationCodeHospitalProviderSpell);
        
        /**
         * Sets (as xml) the "DischargeDestinationCode_HospitalProviderSpell" element
         */
        void xsetDischargeDestinationCodeHospitalProviderSpell(uk.nhs.nhsia.datastandards.ecds.DischargeDestinationCodeHospitalProviderSpellType dischargeDestinationCodeHospitalProviderSpell);
        
        /**
         * Unsets the "DischargeDestinationCode_HospitalProviderSpell" element
         */
        void unsetDischargeDestinationCodeHospitalProviderSpell();
        
        /**
         * Gets the "DischargeMethodCode_HospitalProviderSpell" element
         */
        uk.nhs.nhsia.datastandards.ecds.DischargeMethodCodeHospitalProviderSpellType.Enum getDischargeMethodCodeHospitalProviderSpell();
        
        /**
         * Gets (as xml) the "DischargeMethodCode_HospitalProviderSpell" element
         */
        uk.nhs.nhsia.datastandards.ecds.DischargeMethodCodeHospitalProviderSpellType xgetDischargeMethodCodeHospitalProviderSpell();
        
        /**
         * True if has "DischargeMethodCode_HospitalProviderSpell" element
         */
        boolean isSetDischargeMethodCodeHospitalProviderSpell();
        
        /**
         * Sets the "DischargeMethodCode_HospitalProviderSpell" element
         */
        void setDischargeMethodCodeHospitalProviderSpell(uk.nhs.nhsia.datastandards.ecds.DischargeMethodCodeHospitalProviderSpellType.Enum dischargeMethodCodeHospitalProviderSpell);
        
        /**
         * Sets (as xml) the "DischargeMethodCode_HospitalProviderSpell" element
         */
        void xsetDischargeMethodCodeHospitalProviderSpell(uk.nhs.nhsia.datastandards.ecds.DischargeMethodCodeHospitalProviderSpellType dischargeMethodCodeHospitalProviderSpell);
        
        /**
         * Unsets the "DischargeMethodCode_HospitalProviderSpell" element
         */
        void unsetDischargeMethodCodeHospitalProviderSpell();
        
        /**
         * Gets the "DischargeReadyDate_HospitalProviderSpell" element
         */
        java.util.Calendar getDischargeReadyDateHospitalProviderSpell();
        
        /**
         * Gets (as xml) the "DischargeReadyDate_HospitalProviderSpell" element
         */
        uk.nhs.nhsia.datastandards.ecds.DischargeReadyDateHospitalProviderSpellType xgetDischargeReadyDateHospitalProviderSpell();
        
        /**
         * True if has "DischargeReadyDate_HospitalProviderSpell" element
         */
        boolean isSetDischargeReadyDateHospitalProviderSpell();
        
        /**
         * Sets the "DischargeReadyDate_HospitalProviderSpell" element
         */
        void setDischargeReadyDateHospitalProviderSpell(java.util.Calendar dischargeReadyDateHospitalProviderSpell);
        
        /**
         * Sets (as xml) the "DischargeReadyDate_HospitalProviderSpell" element
         */
        void xsetDischargeReadyDateHospitalProviderSpell(uk.nhs.nhsia.datastandards.ecds.DischargeReadyDateHospitalProviderSpellType dischargeReadyDateHospitalProviderSpell);
        
        /**
         * Unsets the "DischargeReadyDate_HospitalProviderSpell" element
         */
        void unsetDischargeReadyDateHospitalProviderSpell();
        
        /**
         * Gets the "DischargeDate_HospitalProviderSpell" element
         */
        java.util.Calendar getDischargeDateHospitalProviderSpell();
        
        /**
         * Gets (as xml) the "DischargeDate_HospitalProviderSpell" element
         */
        uk.nhs.nhsia.datastandards.ecds.DischargeDateHospitalProviderSpellType xgetDischargeDateHospitalProviderSpell();
        
        /**
         * True if has "DischargeDate_HospitalProviderSpell" element
         */
        boolean isSetDischargeDateHospitalProviderSpell();
        
        /**
         * Sets the "DischargeDate_HospitalProviderSpell" element
         */
        void setDischargeDateHospitalProviderSpell(java.util.Calendar dischargeDateHospitalProviderSpell);
        
        /**
         * Sets (as xml) the "DischargeDate_HospitalProviderSpell" element
         */
        void xsetDischargeDateHospitalProviderSpell(uk.nhs.nhsia.datastandards.ecds.DischargeDateHospitalProviderSpellType dischargeDateHospitalProviderSpell);
        
        /**
         * Unsets the "DischargeDate_HospitalProviderSpell" element
         */
        void unsetDischargeDateHospitalProviderSpell();
        
        /**
         * Gets the "DischargeTime_HospitalProviderSpell" element
         */
        java.util.Calendar getDischargeTimeHospitalProviderSpell();
        
        /**
         * Gets (as xml) the "DischargeTime_HospitalProviderSpell" element
         */
        uk.nhs.nhsia.datastandards.ecds.DischargeTimeHospitalProviderSpellType xgetDischargeTimeHospitalProviderSpell();
        
        /**
         * True if has "DischargeTime_HospitalProviderSpell" element
         */
        boolean isSetDischargeTimeHospitalProviderSpell();
        
        /**
         * Sets the "DischargeTime_HospitalProviderSpell" element
         */
        void setDischargeTimeHospitalProviderSpell(java.util.Calendar dischargeTimeHospitalProviderSpell);
        
        /**
         * Sets (as xml) the "DischargeTime_HospitalProviderSpell" element
         */
        void xsetDischargeTimeHospitalProviderSpell(uk.nhs.nhsia.datastandards.ecds.DischargeTimeHospitalProviderSpellType dischargeTimeHospitalProviderSpell);
        
        /**
         * Unsets the "DischargeTime_HospitalProviderSpell" element
         */
        void unsetDischargeTimeHospitalProviderSpell();
        
        /**
         * Gets the "DischargedToHospitalAtHomeServiceIndicator" element
         */
        uk.nhs.nhsia.datastandards.ecds.DischargedToHospitalAtHomeServiceIndicatorType.Enum getDischargedToHospitalAtHomeServiceIndicator();
        
        /**
         * Gets (as xml) the "DischargedToHospitalAtHomeServiceIndicator" element
         */
        uk.nhs.nhsia.datastandards.ecds.DischargedToHospitalAtHomeServiceIndicatorType xgetDischargedToHospitalAtHomeServiceIndicator();
        
        /**
         * True if has "DischargedToHospitalAtHomeServiceIndicator" element
         */
        boolean isSetDischargedToHospitalAtHomeServiceIndicator();
        
        /**
         * Sets the "DischargedToHospitalAtHomeServiceIndicator" element
         */
        void setDischargedToHospitalAtHomeServiceIndicator(uk.nhs.nhsia.datastandards.ecds.DischargedToHospitalAtHomeServiceIndicatorType.Enum dischargedToHospitalAtHomeServiceIndicator);
        
        /**
         * Sets (as xml) the "DischargedToHospitalAtHomeServiceIndicator" element
         */
        void xsetDischargedToHospitalAtHomeServiceIndicator(uk.nhs.nhsia.datastandards.ecds.DischargedToHospitalAtHomeServiceIndicatorType dischargedToHospitalAtHomeServiceIndicator);
        
        /**
         * Unsets the "DischargedToHospitalAtHomeServiceIndicator" element
         */
        void unsetDischargedToHospitalAtHomeServiceIndicator();
        
        /**
         * A factory class with static methods for creating instances
         * of this type.
         */
        
        public static final class Factory
        {
            public static uk.nhs.nhsia.datastandards.ecds.HospitalProviderSpellStructure.DischargeCharacteristics newInstance() {
              return (uk.nhs.nhsia.datastandards.ecds.HospitalProviderSpellStructure.DischargeCharacteristics) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().newInstance( type, null ); }
            
            public static uk.nhs.nhsia.datastandards.ecds.HospitalProviderSpellStructure.DischargeCharacteristics newInstance(org.apache.xmlbeans.XmlOptions options) {
              return (uk.nhs.nhsia.datastandards.ecds.HospitalProviderSpellStructure.DischargeCharacteristics) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().newInstance( type, options ); }
            
            private Factory() { } // No instance of this class allowed
        }
    }
    
    /**
     * A factory class with static methods for creating instances
     * of this type.
     */
    
    public static final class Factory
    {
        public static uk.nhs.nhsia.datastandards.ecds.HospitalProviderSpellStructure newInstance() {
          return (uk.nhs.nhsia.datastandards.ecds.HospitalProviderSpellStructure) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().newInstance( type, null ); }
        
        public static uk.nhs.nhsia.datastandards.ecds.HospitalProviderSpellStructure newInstance(org.apache.xmlbeans.XmlOptions options) {
          return (uk.nhs.nhsia.datastandards.ecds.HospitalProviderSpellStructure) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().newInstance( type, options ); }
        
        /** @param xmlAsString the string value to parse */
        public static uk.nhs.nhsia.datastandards.ecds.HospitalProviderSpellStructure parse(java.lang.String xmlAsString) throws org.apache.xmlbeans.XmlException {
          return (uk.nhs.nhsia.datastandards.ecds.HospitalProviderSpellStructure) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( xmlAsString, type, null ); }
        
        public static uk.nhs.nhsia.datastandards.ecds.HospitalProviderSpellStructure parse(java.lang.String xmlAsString, org.apache.xmlbeans.XmlOptions options) throws org.apache.xmlbeans.XmlException {
          return (uk.nhs.nhsia.datastandards.ecds.HospitalProviderSpellStructure) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( xmlAsString, type, options ); }
        
        /** @param file the file from which to load an xml document */
        public static uk.nhs.nhsia.datastandards.ecds.HospitalProviderSpellStructure parse(java.io.File file) throws org.apache.xmlbeans.XmlException, java.io.IOException {
          return (uk.nhs.nhsia.datastandards.ecds.HospitalProviderSpellStructure) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( file, type, null ); }
        
        public static uk.nhs.nhsia.datastandards.ecds.HospitalProviderSpellStructure parse(java.io.File file, org.apache.xmlbeans.XmlOptions options) throws org.apache.xmlbeans.XmlException, java.io.IOException {
          return (uk.nhs.nhsia.datastandards.ecds.HospitalProviderSpellStructure) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( file, type, options ); }
        
        public static uk.nhs.nhsia.datastandards.ecds.HospitalProviderSpellStructure parse(java.net.URL u) throws org.apache.xmlbeans.XmlException, java.io.IOException {
          return (uk.nhs.nhsia.datastandards.ecds.HospitalProviderSpellStructure) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( u, type, null ); }
        
        public static uk.nhs.nhsia.datastandards.ecds.HospitalProviderSpellStructure parse(java.net.URL u, org.apache.xmlbeans.XmlOptions options) throws org.apache.xmlbeans.XmlException, java.io.IOException {
          return (uk.nhs.nhsia.datastandards.ecds.HospitalProviderSpellStructure) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( u, type, options ); }
        
        public static uk.nhs.nhsia.datastandards.ecds.HospitalProviderSpellStructure parse(java.io.InputStream is) throws org.apache.xmlbeans.XmlException, java.io.IOException {
          return (uk.nhs.nhsia.datastandards.ecds.HospitalProviderSpellStructure) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( is, type, null ); }
        
        public static uk.nhs.nhsia.datastandards.ecds.HospitalProviderSpellStructure parse(java.io.InputStream is, org.apache.xmlbeans.XmlOptions options) throws org.apache.xmlbeans.XmlException, java.io.IOException {
          return (uk.nhs.nhsia.datastandards.ecds.HospitalProviderSpellStructure) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( is, type, options ); }
        
        public static uk.nhs.nhsia.datastandards.ecds.HospitalProviderSpellStructure parse(java.io.Reader r) throws org.apache.xmlbeans.XmlException, java.io.IOException {
          return (uk.nhs.nhsia.datastandards.ecds.HospitalProviderSpellStructure) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( r, type, null ); }
        
        public static uk.nhs.nhsia.datastandards.ecds.HospitalProviderSpellStructure parse(java.io.Reader r, org.apache.xmlbeans.XmlOptions options) throws org.apache.xmlbeans.XmlException, java.io.IOException {
          return (uk.nhs.nhsia.datastandards.ecds.HospitalProviderSpellStructure) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( r, type, options ); }
        
        public static uk.nhs.nhsia.datastandards.ecds.HospitalProviderSpellStructure parse(javax.xml.stream.XMLStreamReader sr) throws org.apache.xmlbeans.XmlException {
          return (uk.nhs.nhsia.datastandards.ecds.HospitalProviderSpellStructure) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( sr, type, null ); }
        
        public static uk.nhs.nhsia.datastandards.ecds.HospitalProviderSpellStructure parse(javax.xml.stream.XMLStreamReader sr, org.apache.xmlbeans.XmlOptions options) throws org.apache.xmlbeans.XmlException {
          return (uk.nhs.nhsia.datastandards.ecds.HospitalProviderSpellStructure) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( sr, type, options ); }
        
        public static uk.nhs.nhsia.datastandards.ecds.HospitalProviderSpellStructure parse(org.w3c.dom.Node node) throws org.apache.xmlbeans.XmlException {
          return (uk.nhs.nhsia.datastandards.ecds.HospitalProviderSpellStructure) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( node, type, null ); }
        
        public static uk.nhs.nhsia.datastandards.ecds.HospitalProviderSpellStructure parse(org.w3c.dom.Node node, org.apache.xmlbeans.XmlOptions options) throws org.apache.xmlbeans.XmlException {
          return (uk.nhs.nhsia.datastandards.ecds.HospitalProviderSpellStructure) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( node, type, options ); }
        
        /** @deprecated {@link org.apache.xmlbeans.xml.stream.XMLInputStream} */
        public static uk.nhs.nhsia.datastandards.ecds.HospitalProviderSpellStructure parse(org.apache.xmlbeans.xml.stream.XMLInputStream xis) throws org.apache.xmlbeans.XmlException, org.apache.xmlbeans.xml.stream.XMLStreamException {
          return (uk.nhs.nhsia.datastandards.ecds.HospitalProviderSpellStructure) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( xis, type, null ); }
        
        /** @deprecated {@link org.apache.xmlbeans.xml.stream.XMLInputStream} */
        public static uk.nhs.nhsia.datastandards.ecds.HospitalProviderSpellStructure parse(org.apache.xmlbeans.xml.stream.XMLInputStream xis, org.apache.xmlbeans.XmlOptions options) throws org.apache.xmlbeans.XmlException, org.apache.xmlbeans.xml.stream.XMLStreamException {
          return (uk.nhs.nhsia.datastandards.ecds.HospitalProviderSpellStructure) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( xis, type, options ); }
        
        /** @deprecated {@link org.apache.xmlbeans.xml.stream.XMLInputStream} */
        public static org.apache.xmlbeans.xml.stream.XMLInputStream newValidatingXMLInputStream(org.apache.xmlbeans.xml.stream.XMLInputStream xis) throws org.apache.xmlbeans.XmlException, org.apache.xmlbeans.xml.stream.XMLStreamException {
          return org.apache.xmlbeans.XmlBeans.getContextTypeLoader().newValidatingXMLInputStream( xis, type, null ); }
        
        /** @deprecated {@link org.apache.xmlbeans.xml.stream.XMLInputStream} */
        public static org.apache.xmlbeans.xml.stream.XMLInputStream newValidatingXMLInputStream(org.apache.xmlbeans.xml.stream.XMLInputStream xis, org.apache.xmlbeans.XmlOptions options) throws org.apache.xmlbeans.XmlException, org.apache.xmlbeans.xml.stream.XMLStreamException {
          return org.apache.xmlbeans.XmlBeans.getContextTypeLoader().newValidatingXMLInputStream( xis, type, options ); }
        
        private Factory() { } // No instance of this class allowed
    }
}
