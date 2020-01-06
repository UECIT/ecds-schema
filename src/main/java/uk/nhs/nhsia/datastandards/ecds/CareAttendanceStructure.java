/*
 * XML Type:  CareAttendance_Structure
 * Namespace: http://www.nhsia.nhs.uk/DataStandards/XMLschema/CDS/ns
 * Java type: uk.nhs.nhsia.datastandards.ecds.CareAttendanceStructure
 *
 * Automatically generated - do not modify.
 */
package uk.nhs.nhsia.datastandards.ecds;


/**
 * An XML CareAttendance_Structure(@http://www.nhsia.nhs.uk/DataStandards/XMLschema/CDS/ns).
 *
 * This is a complex type.
 */
public interface CareAttendanceStructure extends org.apache.xmlbeans.XmlObject
{
    public static final org.apache.xmlbeans.SchemaType type = (org.apache.xmlbeans.SchemaType)
        org.apache.xmlbeans.XmlBeans.typeSystemForClassLoader(CareAttendanceStructure.class.getClassLoader(), "schemaorg_apache_xmlbeans.system.s30C1180FF47174E0C8A992A2D657328B").resolveHandle("careattendancestructure0283type");
    
    /**
     * Gets the "ActivityCharacteristics" element
     */
    uk.nhs.nhsia.datastandards.ecds.CareAttendanceStructure.ActivityCharacteristics getActivityCharacteristics();
    
    /**
     * Sets the "ActivityCharacteristics" element
     */
    void setActivityCharacteristics(uk.nhs.nhsia.datastandards.ecds.CareAttendanceStructure.ActivityCharacteristics activityCharacteristics);
    
    /**
     * Appends and returns a new empty "ActivityCharacteristics" element
     */
    uk.nhs.nhsia.datastandards.ecds.CareAttendanceStructure.ActivityCharacteristics addNewActivityCharacteristics();
    
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
     * Gets the "ClinicalActivityDetails" element
     */
    uk.nhs.nhsia.datastandards.ecds.ClinicalActivityStructure getClinicalActivityDetails();
    
    /**
     * True if has "ClinicalActivityDetails" element
     */
    boolean isSetClinicalActivityDetails();
    
    /**
     * Sets the "ClinicalActivityDetails" element
     */
    void setClinicalActivityDetails(uk.nhs.nhsia.datastandards.ecds.ClinicalActivityStructure clinicalActivityDetails);
    
    /**
     * Appends and returns a new empty "ClinicalActivityDetails" element
     */
    uk.nhs.nhsia.datastandards.ecds.ClinicalActivityStructure addNewClinicalActivityDetails();
    
    /**
     * Unsets the "ClinicalActivityDetails" element
     */
    void unsetClinicalActivityDetails();
    
    /**
     * Gets the "AttendanceLocationGroup" element
     */
    uk.nhs.nhsia.datastandards.ecds.AttendanceLocationGroupStructure getAttendanceLocationGroup();
    
    /**
     * True if has "AttendanceLocationGroup" element
     */
    boolean isSetAttendanceLocationGroup();
    
    /**
     * Sets the "AttendanceLocationGroup" element
     */
    void setAttendanceLocationGroup(uk.nhs.nhsia.datastandards.ecds.AttendanceLocationGroupStructure attendanceLocationGroup);
    
    /**
     * Appends and returns a new empty "AttendanceLocationGroup" element
     */
    uk.nhs.nhsia.datastandards.ecds.AttendanceLocationGroupStructure addNewAttendanceLocationGroup();
    
    /**
     * Unsets the "AttendanceLocationGroup" element
     */
    void unsetAttendanceLocationGroup();
    
    /**
     * An XML ActivityCharacteristics(@http://www.nhsia.nhs.uk/DataStandards/XMLschema/CDS/ns).
     *
     * This is a complex type.
     */
    public interface ActivityCharacteristics extends org.apache.xmlbeans.XmlObject
    {
        public static final org.apache.xmlbeans.SchemaType type = (org.apache.xmlbeans.SchemaType)
            org.apache.xmlbeans.XmlBeans.typeSystemForClassLoader(ActivityCharacteristics.class.getClassLoader(), "schemaorg_apache_xmlbeans.system.s30C1180FF47174E0C8A992A2D657328B").resolveHandle("activitycharacteristics82b8elemtype");
        
        /**
         * Gets the "AttendanceIdentifier" element
         */
        java.lang.String getAttendanceIdentifier();
        
        /**
         * Gets (as xml) the "AttendanceIdentifier" element
         */
        uk.nhs.nhsia.datastandards.ecds.AttendanceIdentifierType xgetAttendanceIdentifier();
        
        /**
         * True if has "AttendanceIdentifier" element
         */
        boolean isSetAttendanceIdentifier();
        
        /**
         * Sets the "AttendanceIdentifier" element
         */
        void setAttendanceIdentifier(java.lang.String attendanceIdentifier);
        
        /**
         * Sets (as xml) the "AttendanceIdentifier" element
         */
        void xsetAttendanceIdentifier(uk.nhs.nhsia.datastandards.ecds.AttendanceIdentifierType attendanceIdentifier);
        
        /**
         * Unsets the "AttendanceIdentifier" element
         */
        void unsetAttendanceIdentifier();
        
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
         * Gets the "AttendedOrDidNotAttendCode" element
         */
        uk.nhs.nhsia.datastandards.ecds.AttendedOrDidNotAttendCodeType.Enum getAttendedOrDidNotAttendCode();
        
        /**
         * Gets (as xml) the "AttendedOrDidNotAttendCode" element
         */
        uk.nhs.nhsia.datastandards.ecds.AttendedOrDidNotAttendCodeType xgetAttendedOrDidNotAttendCode();
        
        /**
         * True if has "AttendedOrDidNotAttendCode" element
         */
        boolean isSetAttendedOrDidNotAttendCode();
        
        /**
         * Sets the "AttendedOrDidNotAttendCode" element
         */
        void setAttendedOrDidNotAttendCode(uk.nhs.nhsia.datastandards.ecds.AttendedOrDidNotAttendCodeType.Enum attendedOrDidNotAttendCode);
        
        /**
         * Sets (as xml) the "AttendedOrDidNotAttendCode" element
         */
        void xsetAttendedOrDidNotAttendCode(uk.nhs.nhsia.datastandards.ecds.AttendedOrDidNotAttendCodeType attendedOrDidNotAttendCode);
        
        /**
         * Unsets the "AttendedOrDidNotAttendCode" element
         */
        void unsetAttendedOrDidNotAttendCode();
        
        /**
         * Gets the "FirstAttendanceCode" element
         */
        uk.nhs.nhsia.datastandards.ecds.FirstAttendanceCodeType.Enum getFirstAttendanceCode();
        
        /**
         * Gets (as xml) the "FirstAttendanceCode" element
         */
        uk.nhs.nhsia.datastandards.ecds.FirstAttendanceCodeType xgetFirstAttendanceCode();
        
        /**
         * True if has "FirstAttendanceCode" element
         */
        boolean isSetFirstAttendanceCode();
        
        /**
         * Sets the "FirstAttendanceCode" element
         */
        void setFirstAttendanceCode(uk.nhs.nhsia.datastandards.ecds.FirstAttendanceCodeType.Enum firstAttendanceCode);
        
        /**
         * Sets (as xml) the "FirstAttendanceCode" element
         */
        void xsetFirstAttendanceCode(uk.nhs.nhsia.datastandards.ecds.FirstAttendanceCodeType firstAttendanceCode);
        
        /**
         * Unsets the "FirstAttendanceCode" element
         */
        void unsetFirstAttendanceCode();
        
        /**
         * Gets the "MedicalStaffTypeSeeingPatient" element
         */
        uk.nhs.nhsia.datastandards.ecds.MedicalStaffTypeSeeingPatientType.Enum getMedicalStaffTypeSeeingPatient();
        
        /**
         * Gets (as xml) the "MedicalStaffTypeSeeingPatient" element
         */
        uk.nhs.nhsia.datastandards.ecds.MedicalStaffTypeSeeingPatientType xgetMedicalStaffTypeSeeingPatient();
        
        /**
         * True if has "MedicalStaffTypeSeeingPatient" element
         */
        boolean isSetMedicalStaffTypeSeeingPatient();
        
        /**
         * Sets the "MedicalStaffTypeSeeingPatient" element
         */
        void setMedicalStaffTypeSeeingPatient(uk.nhs.nhsia.datastandards.ecds.MedicalStaffTypeSeeingPatientType.Enum medicalStaffTypeSeeingPatient);
        
        /**
         * Sets (as xml) the "MedicalStaffTypeSeeingPatient" element
         */
        void xsetMedicalStaffTypeSeeingPatient(uk.nhs.nhsia.datastandards.ecds.MedicalStaffTypeSeeingPatientType medicalStaffTypeSeeingPatient);
        
        /**
         * Unsets the "MedicalStaffTypeSeeingPatient" element
         */
        void unsetMedicalStaffTypeSeeingPatient();
        
        /**
         * Gets the "OperationStatusCode" element
         */
        uk.nhs.nhsia.datastandards.ecds.OperationStatusCodeType.Enum getOperationStatusCode();
        
        /**
         * Gets (as xml) the "OperationStatusCode" element
         */
        uk.nhs.nhsia.datastandards.ecds.OperationStatusCodeType xgetOperationStatusCode();
        
        /**
         * True if has "OperationStatusCode" element
         */
        boolean isSetOperationStatusCode();
        
        /**
         * Sets the "OperationStatusCode" element
         */
        void setOperationStatusCode(uk.nhs.nhsia.datastandards.ecds.OperationStatusCodeType.Enum operationStatusCode);
        
        /**
         * Sets (as xml) the "OperationStatusCode" element
         */
        void xsetOperationStatusCode(uk.nhs.nhsia.datastandards.ecds.OperationStatusCodeType operationStatusCode);
        
        /**
         * Unsets the "OperationStatusCode" element
         */
        void unsetOperationStatusCode();
        
        /**
         * Gets the "OutcomeOfAttendanceCode" element
         */
        uk.nhs.nhsia.datastandards.ecds.OutcomeOfAttendanceCodeType.Enum getOutcomeOfAttendanceCode();
        
        /**
         * Gets (as xml) the "OutcomeOfAttendanceCode" element
         */
        uk.nhs.nhsia.datastandards.ecds.OutcomeOfAttendanceCodeType xgetOutcomeOfAttendanceCode();
        
        /**
         * True if has "OutcomeOfAttendanceCode" element
         */
        boolean isSetOutcomeOfAttendanceCode();
        
        /**
         * Sets the "OutcomeOfAttendanceCode" element
         */
        void setOutcomeOfAttendanceCode(uk.nhs.nhsia.datastandards.ecds.OutcomeOfAttendanceCodeType.Enum outcomeOfAttendanceCode);
        
        /**
         * Sets (as xml) the "OutcomeOfAttendanceCode" element
         */
        void xsetOutcomeOfAttendanceCode(uk.nhs.nhsia.datastandards.ecds.OutcomeOfAttendanceCodeType outcomeOfAttendanceCode);
        
        /**
         * Unsets the "OutcomeOfAttendanceCode" element
         */
        void unsetOutcomeOfAttendanceCode();
        
        /**
         * Gets the "AppointmentDate" element
         */
        java.util.Calendar getAppointmentDate();
        
        /**
         * Gets (as xml) the "AppointmentDate" element
         */
        uk.nhs.nhsia.datastandards.ecds.AppointmentDateType xgetAppointmentDate();
        
        /**
         * Sets the "AppointmentDate" element
         */
        void setAppointmentDate(java.util.Calendar appointmentDate);
        
        /**
         * Sets (as xml) the "AppointmentDate" element
         */
        void xsetAppointmentDate(uk.nhs.nhsia.datastandards.ecds.AppointmentDateType appointmentDate);
        
        /**
         * Gets the "AppointmentTime" element
         */
        java.util.Calendar getAppointmentTime();
        
        /**
         * Gets (as xml) the "AppointmentTime" element
         */
        uk.nhs.nhsia.datastandards.ecds.AppointmentTimeType xgetAppointmentTime();
        
        /**
         * True if has "AppointmentTime" element
         */
        boolean isSetAppointmentTime();
        
        /**
         * Sets the "AppointmentTime" element
         */
        void setAppointmentTime(java.util.Calendar appointmentTime);
        
        /**
         * Sets (as xml) the "AppointmentTime" element
         */
        void xsetAppointmentTime(uk.nhs.nhsia.datastandards.ecds.AppointmentTimeType appointmentTime);
        
        /**
         * Unsets the "AppointmentTime" element
         */
        void unsetAppointmentTime();
        
        /**
         * Gets the "ExpectedDurationOfAppointment" element
         */
        int getExpectedDurationOfAppointment();
        
        /**
         * Gets (as xml) the "ExpectedDurationOfAppointment" element
         */
        uk.nhs.nhsia.datastandards.ecds.ExpectedDurationOfAppointmentType xgetExpectedDurationOfAppointment();
        
        /**
         * True if has "ExpectedDurationOfAppointment" element
         */
        boolean isSetExpectedDurationOfAppointment();
        
        /**
         * Sets the "ExpectedDurationOfAppointment" element
         */
        void setExpectedDurationOfAppointment(int expectedDurationOfAppointment);
        
        /**
         * Sets (as xml) the "ExpectedDurationOfAppointment" element
         */
        void xsetExpectedDurationOfAppointment(uk.nhs.nhsia.datastandards.ecds.ExpectedDurationOfAppointmentType expectedDurationOfAppointment);
        
        /**
         * Unsets the "ExpectedDurationOfAppointment" element
         */
        void unsetExpectedDurationOfAppointment();
        
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
         * Gets the "EarliestReasonableOfferDate" element
         */
        java.util.Calendar getEarliestReasonableOfferDate();
        
        /**
         * Gets (as xml) the "EarliestReasonableOfferDate" element
         */
        uk.nhs.nhsia.datastandards.ecds.EarliestReasonableOfferDateType xgetEarliestReasonableOfferDate();
        
        /**
         * True if has "EarliestReasonableOfferDate" element
         */
        boolean isSetEarliestReasonableOfferDate();
        
        /**
         * Sets the "EarliestReasonableOfferDate" element
         */
        void setEarliestReasonableOfferDate(java.util.Calendar earliestReasonableOfferDate);
        
        /**
         * Sets (as xml) the "EarliestReasonableOfferDate" element
         */
        void xsetEarliestReasonableOfferDate(uk.nhs.nhsia.datastandards.ecds.EarliestReasonableOfferDateType earliestReasonableOfferDate);
        
        /**
         * Unsets the "EarliestReasonableOfferDate" element
         */
        void unsetEarliestReasonableOfferDate();
        
        /**
         * Gets the "EarliestClinicallyAppropriateDate" element
         */
        java.util.Calendar getEarliestClinicallyAppropriateDate();
        
        /**
         * Gets (as xml) the "EarliestClinicallyAppropriateDate" element
         */
        uk.nhs.nhsia.datastandards.ecds.EarliestClinicallyAppropriateDateType xgetEarliestClinicallyAppropriateDate();
        
        /**
         * True if has "EarliestClinicallyAppropriateDate" element
         */
        boolean isSetEarliestClinicallyAppropriateDate();
        
        /**
         * Sets the "EarliestClinicallyAppropriateDate" element
         */
        void setEarliestClinicallyAppropriateDate(java.util.Calendar earliestClinicallyAppropriateDate);
        
        /**
         * Sets (as xml) the "EarliestClinicallyAppropriateDate" element
         */
        void xsetEarliestClinicallyAppropriateDate(uk.nhs.nhsia.datastandards.ecds.EarliestClinicallyAppropriateDateType earliestClinicallyAppropriateDate);
        
        /**
         * Unsets the "EarliestClinicallyAppropriateDate" element
         */
        void unsetEarliestClinicallyAppropriateDate();
        
        /**
         * Gets the "ConsultationMediumUsed" element
         */
        uk.nhs.nhsia.datastandards.ecds.ConsultationMediumUsedType.Enum getConsultationMediumUsed();
        
        /**
         * Gets (as xml) the "ConsultationMediumUsed" element
         */
        uk.nhs.nhsia.datastandards.ecds.ConsultationMediumUsedType xgetConsultationMediumUsed();
        
        /**
         * True if has "ConsultationMediumUsed" element
         */
        boolean isSetConsultationMediumUsed();
        
        /**
         * Sets the "ConsultationMediumUsed" element
         */
        void setConsultationMediumUsed(uk.nhs.nhsia.datastandards.ecds.ConsultationMediumUsedType.Enum consultationMediumUsed);
        
        /**
         * Sets (as xml) the "ConsultationMediumUsed" element
         */
        void xsetConsultationMediumUsed(uk.nhs.nhsia.datastandards.ecds.ConsultationMediumUsedType consultationMediumUsed);
        
        /**
         * Unsets the "ConsultationMediumUsed" element
         */
        void unsetConsultationMediumUsed();
        
        /**
         * Gets the "MultiProfOrDiscIndCode" element
         */
        uk.nhs.nhsia.datastandards.ecds.MultiProfOrDiscIndCodeType.Enum getMultiProfOrDiscIndCode();
        
        /**
         * Gets (as xml) the "MultiProfOrDiscIndCode" element
         */
        uk.nhs.nhsia.datastandards.ecds.MultiProfOrDiscIndCodeType xgetMultiProfOrDiscIndCode();
        
        /**
         * True if has "MultiProfOrDiscIndCode" element
         */
        boolean isSetMultiProfOrDiscIndCode();
        
        /**
         * Sets the "MultiProfOrDiscIndCode" element
         */
        void setMultiProfOrDiscIndCode(uk.nhs.nhsia.datastandards.ecds.MultiProfOrDiscIndCodeType.Enum multiProfOrDiscIndCode);
        
        /**
         * Sets (as xml) the "MultiProfOrDiscIndCode" element
         */
        void xsetMultiProfOrDiscIndCode(uk.nhs.nhsia.datastandards.ecds.MultiProfOrDiscIndCodeType multiProfOrDiscIndCode);
        
        /**
         * Unsets the "MultiProfOrDiscIndCode" element
         */
        void unsetMultiProfOrDiscIndCode();
        
        /**
         * Gets the "RehabilitationAssessmentTeamType" element
         */
        uk.nhs.nhsia.datastandards.ecds.RehabilitationAssessmentTeamTypeType.Enum getRehabilitationAssessmentTeamType();
        
        /**
         * Gets (as xml) the "RehabilitationAssessmentTeamType" element
         */
        uk.nhs.nhsia.datastandards.ecds.RehabilitationAssessmentTeamTypeType xgetRehabilitationAssessmentTeamType();
        
        /**
         * True if has "RehabilitationAssessmentTeamType" element
         */
        boolean isSetRehabilitationAssessmentTeamType();
        
        /**
         * Sets the "RehabilitationAssessmentTeamType" element
         */
        void setRehabilitationAssessmentTeamType(uk.nhs.nhsia.datastandards.ecds.RehabilitationAssessmentTeamTypeType.Enum rehabilitationAssessmentTeamType);
        
        /**
         * Sets (as xml) the "RehabilitationAssessmentTeamType" element
         */
        void xsetRehabilitationAssessmentTeamType(uk.nhs.nhsia.datastandards.ecds.RehabilitationAssessmentTeamTypeType rehabilitationAssessmentTeamType);
        
        /**
         * Unsets the "RehabilitationAssessmentTeamType" element
         */
        void unsetRehabilitationAssessmentTeamType();
        
        /**
         * A factory class with static methods for creating instances
         * of this type.
         */
        
        public static final class Factory
        {
            public static uk.nhs.nhsia.datastandards.ecds.CareAttendanceStructure.ActivityCharacteristics newInstance() {
              return (uk.nhs.nhsia.datastandards.ecds.CareAttendanceStructure.ActivityCharacteristics) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().newInstance( type, null ); }
            
            public static uk.nhs.nhsia.datastandards.ecds.CareAttendanceStructure.ActivityCharacteristics newInstance(org.apache.xmlbeans.XmlOptions options) {
              return (uk.nhs.nhsia.datastandards.ecds.CareAttendanceStructure.ActivityCharacteristics) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().newInstance( type, options ); }
            
            private Factory() { } // No instance of this class allowed
        }
    }
    
    /**
     * A factory class with static methods for creating instances
     * of this type.
     */
    
    public static final class Factory
    {
        public static uk.nhs.nhsia.datastandards.ecds.CareAttendanceStructure newInstance() {
          return (uk.nhs.nhsia.datastandards.ecds.CareAttendanceStructure) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().newInstance( type, null ); }
        
        public static uk.nhs.nhsia.datastandards.ecds.CareAttendanceStructure newInstance(org.apache.xmlbeans.XmlOptions options) {
          return (uk.nhs.nhsia.datastandards.ecds.CareAttendanceStructure) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().newInstance( type, options ); }
        
        /** @param xmlAsString the string value to parse */
        public static uk.nhs.nhsia.datastandards.ecds.CareAttendanceStructure parse(java.lang.String xmlAsString) throws org.apache.xmlbeans.XmlException {
          return (uk.nhs.nhsia.datastandards.ecds.CareAttendanceStructure) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( xmlAsString, type, null ); }
        
        public static uk.nhs.nhsia.datastandards.ecds.CareAttendanceStructure parse(java.lang.String xmlAsString, org.apache.xmlbeans.XmlOptions options) throws org.apache.xmlbeans.XmlException {
          return (uk.nhs.nhsia.datastandards.ecds.CareAttendanceStructure) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( xmlAsString, type, options ); }
        
        /** @param file the file from which to load an xml document */
        public static uk.nhs.nhsia.datastandards.ecds.CareAttendanceStructure parse(java.io.File file) throws org.apache.xmlbeans.XmlException, java.io.IOException {
          return (uk.nhs.nhsia.datastandards.ecds.CareAttendanceStructure) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( file, type, null ); }
        
        public static uk.nhs.nhsia.datastandards.ecds.CareAttendanceStructure parse(java.io.File file, org.apache.xmlbeans.XmlOptions options) throws org.apache.xmlbeans.XmlException, java.io.IOException {
          return (uk.nhs.nhsia.datastandards.ecds.CareAttendanceStructure) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( file, type, options ); }
        
        public static uk.nhs.nhsia.datastandards.ecds.CareAttendanceStructure parse(java.net.URL u) throws org.apache.xmlbeans.XmlException, java.io.IOException {
          return (uk.nhs.nhsia.datastandards.ecds.CareAttendanceStructure) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( u, type, null ); }
        
        public static uk.nhs.nhsia.datastandards.ecds.CareAttendanceStructure parse(java.net.URL u, org.apache.xmlbeans.XmlOptions options) throws org.apache.xmlbeans.XmlException, java.io.IOException {
          return (uk.nhs.nhsia.datastandards.ecds.CareAttendanceStructure) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( u, type, options ); }
        
        public static uk.nhs.nhsia.datastandards.ecds.CareAttendanceStructure parse(java.io.InputStream is) throws org.apache.xmlbeans.XmlException, java.io.IOException {
          return (uk.nhs.nhsia.datastandards.ecds.CareAttendanceStructure) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( is, type, null ); }
        
        public static uk.nhs.nhsia.datastandards.ecds.CareAttendanceStructure parse(java.io.InputStream is, org.apache.xmlbeans.XmlOptions options) throws org.apache.xmlbeans.XmlException, java.io.IOException {
          return (uk.nhs.nhsia.datastandards.ecds.CareAttendanceStructure) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( is, type, options ); }
        
        public static uk.nhs.nhsia.datastandards.ecds.CareAttendanceStructure parse(java.io.Reader r) throws org.apache.xmlbeans.XmlException, java.io.IOException {
          return (uk.nhs.nhsia.datastandards.ecds.CareAttendanceStructure) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( r, type, null ); }
        
        public static uk.nhs.nhsia.datastandards.ecds.CareAttendanceStructure parse(java.io.Reader r, org.apache.xmlbeans.XmlOptions options) throws org.apache.xmlbeans.XmlException, java.io.IOException {
          return (uk.nhs.nhsia.datastandards.ecds.CareAttendanceStructure) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( r, type, options ); }
        
        public static uk.nhs.nhsia.datastandards.ecds.CareAttendanceStructure parse(javax.xml.stream.XMLStreamReader sr) throws org.apache.xmlbeans.XmlException {
          return (uk.nhs.nhsia.datastandards.ecds.CareAttendanceStructure) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( sr, type, null ); }
        
        public static uk.nhs.nhsia.datastandards.ecds.CareAttendanceStructure parse(javax.xml.stream.XMLStreamReader sr, org.apache.xmlbeans.XmlOptions options) throws org.apache.xmlbeans.XmlException {
          return (uk.nhs.nhsia.datastandards.ecds.CareAttendanceStructure) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( sr, type, options ); }
        
        public static uk.nhs.nhsia.datastandards.ecds.CareAttendanceStructure parse(org.w3c.dom.Node node) throws org.apache.xmlbeans.XmlException {
          return (uk.nhs.nhsia.datastandards.ecds.CareAttendanceStructure) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( node, type, null ); }
        
        public static uk.nhs.nhsia.datastandards.ecds.CareAttendanceStructure parse(org.w3c.dom.Node node, org.apache.xmlbeans.XmlOptions options) throws org.apache.xmlbeans.XmlException {
          return (uk.nhs.nhsia.datastandards.ecds.CareAttendanceStructure) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( node, type, options ); }
        
        /** @deprecated {@link org.apache.xmlbeans.xml.stream.XMLInputStream} */
        public static uk.nhs.nhsia.datastandards.ecds.CareAttendanceStructure parse(org.apache.xmlbeans.xml.stream.XMLInputStream xis) throws org.apache.xmlbeans.XmlException, org.apache.xmlbeans.xml.stream.XMLStreamException {
          return (uk.nhs.nhsia.datastandards.ecds.CareAttendanceStructure) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( xis, type, null ); }
        
        /** @deprecated {@link org.apache.xmlbeans.xml.stream.XMLInputStream} */
        public static uk.nhs.nhsia.datastandards.ecds.CareAttendanceStructure parse(org.apache.xmlbeans.xml.stream.XMLInputStream xis, org.apache.xmlbeans.XmlOptions options) throws org.apache.xmlbeans.XmlException, org.apache.xmlbeans.xml.stream.XMLStreamException {
          return (uk.nhs.nhsia.datastandards.ecds.CareAttendanceStructure) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( xis, type, options ); }
        
        /** @deprecated {@link org.apache.xmlbeans.xml.stream.XMLInputStream} */
        public static org.apache.xmlbeans.xml.stream.XMLInputStream newValidatingXMLInputStream(org.apache.xmlbeans.xml.stream.XMLInputStream xis) throws org.apache.xmlbeans.XmlException, org.apache.xmlbeans.xml.stream.XMLStreamException {
          return org.apache.xmlbeans.XmlBeans.getContextTypeLoader().newValidatingXMLInputStream( xis, type, null ); }
        
        /** @deprecated {@link org.apache.xmlbeans.xml.stream.XMLInputStream} */
        public static org.apache.xmlbeans.xml.stream.XMLInputStream newValidatingXMLInputStream(org.apache.xmlbeans.xml.stream.XMLInputStream xis, org.apache.xmlbeans.XmlOptions options) throws org.apache.xmlbeans.XmlException, org.apache.xmlbeans.xml.stream.XMLStreamException {
          return org.apache.xmlbeans.XmlBeans.getContextTypeLoader().newValidatingXMLInputStream( xis, type, options ); }
        
        private Factory() { } // No instance of this class allowed
    }
}
