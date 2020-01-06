/*
 * XML Type:  AttendanceOccurrence_Structure
 * Namespace: http://www.nhsia.nhs.uk/DataStandards/XMLschema/CDS/ns
 * Java type: uk.nhs.nhsia.datastandards.ecds.AttendanceOccurrenceStructure
 *
 * Automatically generated - do not modify.
 */
package uk.nhs.nhsia.datastandards.ecds;


/**
 * An XML AttendanceOccurrence_Structure(@http://www.nhsia.nhs.uk/DataStandards/XMLschema/CDS/ns).
 *
 * This is a complex type.
 */
public interface AttendanceOccurrenceStructure extends org.apache.xmlbeans.XmlObject
{
    public static final org.apache.xmlbeans.SchemaType type = (org.apache.xmlbeans.SchemaType)
        org.apache.xmlbeans.XmlBeans.typeSystemForClassLoader(AttendanceOccurrenceStructure.class.getClassLoader(), "schemaorg_apache_xmlbeans.system.s30C1180FF47174E0C8A992A2D657328B").resolveHandle("attendanceoccurrencestructure3c83type");
    
    /**
     * Gets the "ActivityCharacteristics" element
     */
    uk.nhs.nhsia.datastandards.ecds.AttendanceOccurrenceStructure.ActivityCharacteristics getActivityCharacteristics();
    
    /**
     * Sets the "ActivityCharacteristics" element
     */
    void setActivityCharacteristics(uk.nhs.nhsia.datastandards.ecds.AttendanceOccurrenceStructure.ActivityCharacteristics activityCharacteristics);
    
    /**
     * Appends and returns a new empty "ActivityCharacteristics" element
     */
    uk.nhs.nhsia.datastandards.ecds.AttendanceOccurrenceStructure.ActivityCharacteristics addNewActivityCharacteristics();
    
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
     * Gets the "PersonGroupAAndEConsultant" element
     */
    uk.nhs.nhsia.datastandards.ecds.PersonGroupAAndEConsultantStructure getPersonGroupAAndEConsultant();
    
    /**
     * True if has "PersonGroupAAndEConsultant" element
     */
    boolean isSetPersonGroupAAndEConsultant();
    
    /**
     * Sets the "PersonGroupAAndEConsultant" element
     */
    void setPersonGroupAAndEConsultant(uk.nhs.nhsia.datastandards.ecds.PersonGroupAAndEConsultantStructure personGroupAAndEConsultant);
    
    /**
     * Appends and returns a new empty "PersonGroupAAndEConsultant" element
     */
    uk.nhs.nhsia.datastandards.ecds.PersonGroupAAndEConsultantStructure addNewPersonGroupAAndEConsultant();
    
    /**
     * Unsets the "PersonGroupAAndEConsultant" element
     */
    void unsetPersonGroupAAndEConsultant();
    
    /**
     * Gets the "ClinicalDiagnosisDetails" element
     */
    uk.nhs.nhsia.datastandards.ecds.ClinicalDiagnosisAEStructure getClinicalDiagnosisDetails();
    
    /**
     * True if has "ClinicalDiagnosisDetails" element
     */
    boolean isSetClinicalDiagnosisDetails();
    
    /**
     * Sets the "ClinicalDiagnosisDetails" element
     */
    void setClinicalDiagnosisDetails(uk.nhs.nhsia.datastandards.ecds.ClinicalDiagnosisAEStructure clinicalDiagnosisDetails);
    
    /**
     * Appends and returns a new empty "ClinicalDiagnosisDetails" element
     */
    uk.nhs.nhsia.datastandards.ecds.ClinicalDiagnosisAEStructure addNewClinicalDiagnosisDetails();
    
    /**
     * Unsets the "ClinicalDiagnosisDetails" element
     */
    void unsetClinicalDiagnosisDetails();
    
    /**
     * Gets the "ClinicalInvestigationDetails" element
     */
    uk.nhs.nhsia.datastandards.ecds.ClinicalInvestigationStructure getClinicalInvestigationDetails();
    
    /**
     * True if has "ClinicalInvestigationDetails" element
     */
    boolean isSetClinicalInvestigationDetails();
    
    /**
     * Sets the "ClinicalInvestigationDetails" element
     */
    void setClinicalInvestigationDetails(uk.nhs.nhsia.datastandards.ecds.ClinicalInvestigationStructure clinicalInvestigationDetails);
    
    /**
     * Appends and returns a new empty "ClinicalInvestigationDetails" element
     */
    uk.nhs.nhsia.datastandards.ecds.ClinicalInvestigationStructure addNewClinicalInvestigationDetails();
    
    /**
     * Unsets the "ClinicalInvestigationDetails" element
     */
    void unsetClinicalInvestigationDetails();
    
    /**
     * Gets the "ClinicalTreatmentDetails" element
     */
    uk.nhs.nhsia.datastandards.ecds.ClinicalActivityAEStructure getClinicalTreatmentDetails();
    
    /**
     * True if has "ClinicalTreatmentDetails" element
     */
    boolean isSetClinicalTreatmentDetails();
    
    /**
     * Sets the "ClinicalTreatmentDetails" element
     */
    void setClinicalTreatmentDetails(uk.nhs.nhsia.datastandards.ecds.ClinicalActivityAEStructure clinicalTreatmentDetails);
    
    /**
     * Appends and returns a new empty "ClinicalTreatmentDetails" element
     */
    uk.nhs.nhsia.datastandards.ecds.ClinicalActivityAEStructure addNewClinicalTreatmentDetails();
    
    /**
     * Unsets the "ClinicalTreatmentDetails" element
     */
    void unsetClinicalTreatmentDetails();
    
    /**
     * An XML ActivityCharacteristics(@http://www.nhsia.nhs.uk/DataStandards/XMLschema/CDS/ns).
     *
     * This is a complex type.
     */
    public interface ActivityCharacteristics extends org.apache.xmlbeans.XmlObject
    {
        public static final org.apache.xmlbeans.SchemaType type = (org.apache.xmlbeans.SchemaType)
            org.apache.xmlbeans.XmlBeans.typeSystemForClassLoader(ActivityCharacteristics.class.getClassLoader(), "schemaorg_apache_xmlbeans.system.s30C1180FF47174E0C8A992A2D657328B").resolveHandle("activitycharacteristics00f8elemtype");
        
        /**
         * Gets the "AAndEAttendanceNumber" element
         */
        java.lang.String getAAndEAttendanceNumber();
        
        /**
         * Gets (as xml) the "AAndEAttendanceNumber" element
         */
        uk.nhs.nhsia.datastandards.ecds.AAndEAttendanceNumberType xgetAAndEAttendanceNumber();
        
        /**
         * True if has "AAndEAttendanceNumber" element
         */
        boolean isSetAAndEAttendanceNumber();
        
        /**
         * Sets the "AAndEAttendanceNumber" element
         */
        void setAAndEAttendanceNumber(java.lang.String aAndEAttendanceNumber);
        
        /**
         * Sets (as xml) the "AAndEAttendanceNumber" element
         */
        void xsetAAndEAttendanceNumber(uk.nhs.nhsia.datastandards.ecds.AAndEAttendanceNumberType aAndEAttendanceNumber);
        
        /**
         * Unsets the "AAndEAttendanceNumber" element
         */
        void unsetAAndEAttendanceNumber();
        
        /**
         * Gets the "AAndEArrivalModeCode" element
         */
        uk.nhs.nhsia.datastandards.ecds.AAndEArrivalModeCodeType.Enum getAAndEArrivalModeCode();
        
        /**
         * Gets (as xml) the "AAndEArrivalModeCode" element
         */
        uk.nhs.nhsia.datastandards.ecds.AAndEArrivalModeCodeType xgetAAndEArrivalModeCode();
        
        /**
         * True if has "AAndEArrivalModeCode" element
         */
        boolean isSetAAndEArrivalModeCode();
        
        /**
         * Sets the "AAndEArrivalModeCode" element
         */
        void setAAndEArrivalModeCode(uk.nhs.nhsia.datastandards.ecds.AAndEArrivalModeCodeType.Enum aAndEArrivalModeCode);
        
        /**
         * Sets (as xml) the "AAndEArrivalModeCode" element
         */
        void xsetAAndEArrivalModeCode(uk.nhs.nhsia.datastandards.ecds.AAndEArrivalModeCodeType aAndEArrivalModeCode);
        
        /**
         * Unsets the "AAndEArrivalModeCode" element
         */
        void unsetAAndEArrivalModeCode();
        
        /**
         * Gets the "AAndEAttendanceCategoryCode" element
         */
        uk.nhs.nhsia.datastandards.ecds.AAndEAttendanceCategoryCodeType.Enum getAAndEAttendanceCategoryCode();
        
        /**
         * Gets (as xml) the "AAndEAttendanceCategoryCode" element
         */
        uk.nhs.nhsia.datastandards.ecds.AAndEAttendanceCategoryCodeType xgetAAndEAttendanceCategoryCode();
        
        /**
         * True if has "AAndEAttendanceCategoryCode" element
         */
        boolean isSetAAndEAttendanceCategoryCode();
        
        /**
         * Sets the "AAndEAttendanceCategoryCode" element
         */
        void setAAndEAttendanceCategoryCode(uk.nhs.nhsia.datastandards.ecds.AAndEAttendanceCategoryCodeType.Enum aAndEAttendanceCategoryCode);
        
        /**
         * Sets (as xml) the "AAndEAttendanceCategoryCode" element
         */
        void xsetAAndEAttendanceCategoryCode(uk.nhs.nhsia.datastandards.ecds.AAndEAttendanceCategoryCodeType aAndEAttendanceCategoryCode);
        
        /**
         * Unsets the "AAndEAttendanceCategoryCode" element
         */
        void unsetAAndEAttendanceCategoryCode();
        
        /**
         * Gets the "AAndEAttendanceDisposalCode" element
         */
        uk.nhs.nhsia.datastandards.ecds.AAndEAttendanceDisposalCodeType.Enum getAAndEAttendanceDisposalCode();
        
        /**
         * Gets (as xml) the "AAndEAttendanceDisposalCode" element
         */
        uk.nhs.nhsia.datastandards.ecds.AAndEAttendanceDisposalCodeType xgetAAndEAttendanceDisposalCode();
        
        /**
         * True if has "AAndEAttendanceDisposalCode" element
         */
        boolean isSetAAndEAttendanceDisposalCode();
        
        /**
         * Sets the "AAndEAttendanceDisposalCode" element
         */
        void setAAndEAttendanceDisposalCode(uk.nhs.nhsia.datastandards.ecds.AAndEAttendanceDisposalCodeType.Enum aAndEAttendanceDisposalCode);
        
        /**
         * Sets (as xml) the "AAndEAttendanceDisposalCode" element
         */
        void xsetAAndEAttendanceDisposalCode(uk.nhs.nhsia.datastandards.ecds.AAndEAttendanceDisposalCodeType aAndEAttendanceDisposalCode);
        
        /**
         * Unsets the "AAndEAttendanceDisposalCode" element
         */
        void unsetAAndEAttendanceDisposalCode();
        
        /**
         * Gets the "AAndEIncidentLocationType" element
         */
        uk.nhs.nhsia.datastandards.ecds.AAndEIncidentLocationTypeType.Enum getAAndEIncidentLocationType();
        
        /**
         * Gets (as xml) the "AAndEIncidentLocationType" element
         */
        uk.nhs.nhsia.datastandards.ecds.AAndEIncidentLocationTypeType xgetAAndEIncidentLocationType();
        
        /**
         * True if has "AAndEIncidentLocationType" element
         */
        boolean isSetAAndEIncidentLocationType();
        
        /**
         * Sets the "AAndEIncidentLocationType" element
         */
        void setAAndEIncidentLocationType(uk.nhs.nhsia.datastandards.ecds.AAndEIncidentLocationTypeType.Enum aAndEIncidentLocationType);
        
        /**
         * Sets (as xml) the "AAndEIncidentLocationType" element
         */
        void xsetAAndEIncidentLocationType(uk.nhs.nhsia.datastandards.ecds.AAndEIncidentLocationTypeType aAndEIncidentLocationType);
        
        /**
         * Unsets the "AAndEIncidentLocationType" element
         */
        void unsetAAndEIncidentLocationType();
        
        /**
         * Gets the "AAndEPatientGroup" element
         */
        uk.nhs.nhsia.datastandards.ecds.AAndEPatientGroupType.Enum getAAndEPatientGroup();
        
        /**
         * Gets (as xml) the "AAndEPatientGroup" element
         */
        uk.nhs.nhsia.datastandards.ecds.AAndEPatientGroupType xgetAAndEPatientGroup();
        
        /**
         * True if has "AAndEPatientGroup" element
         */
        boolean isSetAAndEPatientGroup();
        
        /**
         * Sets the "AAndEPatientGroup" element
         */
        void setAAndEPatientGroup(uk.nhs.nhsia.datastandards.ecds.AAndEPatientGroupType.Enum aAndEPatientGroup);
        
        /**
         * Sets (as xml) the "AAndEPatientGroup" element
         */
        void xsetAAndEPatientGroup(uk.nhs.nhsia.datastandards.ecds.AAndEPatientGroupType aAndEPatientGroup);
        
        /**
         * Unsets the "AAndEPatientGroup" element
         */
        void unsetAAndEPatientGroup();
        
        /**
         * Gets the "SourceOfReferralForAAndE" element
         */
        uk.nhs.nhsia.datastandards.ecds.SourceOfReferralForAAndEType.Enum getSourceOfReferralForAAndE();
        
        /**
         * Gets (as xml) the "SourceOfReferralForAAndE" element
         */
        uk.nhs.nhsia.datastandards.ecds.SourceOfReferralForAAndEType xgetSourceOfReferralForAAndE();
        
        /**
         * True if has "SourceOfReferralForAAndE" element
         */
        boolean isSetSourceOfReferralForAAndE();
        
        /**
         * Sets the "SourceOfReferralForAAndE" element
         */
        void setSourceOfReferralForAAndE(uk.nhs.nhsia.datastandards.ecds.SourceOfReferralForAAndEType.Enum sourceOfReferralForAAndE);
        
        /**
         * Sets (as xml) the "SourceOfReferralForAAndE" element
         */
        void xsetSourceOfReferralForAAndE(uk.nhs.nhsia.datastandards.ecds.SourceOfReferralForAAndEType sourceOfReferralForAAndE);
        
        /**
         * Unsets the "SourceOfReferralForAAndE" element
         */
        void unsetSourceOfReferralForAAndE();
        
        /**
         * Gets the "AAndEDepartmentType" element
         */
        uk.nhs.nhsia.datastandards.ecds.AAndEDepartmentTypeType.Enum getAAndEDepartmentType();
        
        /**
         * Gets (as xml) the "AAndEDepartmentType" element
         */
        uk.nhs.nhsia.datastandards.ecds.AAndEDepartmentTypeType xgetAAndEDepartmentType();
        
        /**
         * True if has "AAndEDepartmentType" element
         */
        boolean isSetAAndEDepartmentType();
        
        /**
         * Sets the "AAndEDepartmentType" element
         */
        void setAAndEDepartmentType(uk.nhs.nhsia.datastandards.ecds.AAndEDepartmentTypeType.Enum aAndEDepartmentType);
        
        /**
         * Sets (as xml) the "AAndEDepartmentType" element
         */
        void xsetAAndEDepartmentType(uk.nhs.nhsia.datastandards.ecds.AAndEDepartmentTypeType aAndEDepartmentType);
        
        /**
         * Unsets the "AAndEDepartmentType" element
         */
        void unsetAAndEDepartmentType();
        
        /**
         * Gets the "ArrivalDate" element
         */
        java.util.Calendar getArrivalDate();
        
        /**
         * Gets (as xml) the "ArrivalDate" element
         */
        uk.nhs.nhsia.datastandards.ecds.ArrivalDateType xgetArrivalDate();
        
        /**
         * Sets the "ArrivalDate" element
         */
        void setArrivalDate(java.util.Calendar arrivalDate);
        
        /**
         * Sets (as xml) the "ArrivalDate" element
         */
        void xsetArrivalDate(uk.nhs.nhsia.datastandards.ecds.ArrivalDateType arrivalDate);
        
        /**
         * Gets the "ArrivalTimeAtAAndE" element
         */
        java.util.Calendar getArrivalTimeAtAAndE();
        
        /**
         * Gets (as xml) the "ArrivalTimeAtAAndE" element
         */
        uk.nhs.nhsia.datastandards.ecds.ArrivalTimeAtAAndEType xgetArrivalTimeAtAAndE();
        
        /**
         * Sets the "ArrivalTimeAtAAndE" element
         */
        void setArrivalTimeAtAAndE(java.util.Calendar arrivalTimeAtAAndE);
        
        /**
         * Sets (as xml) the "ArrivalTimeAtAAndE" element
         */
        void xsetArrivalTimeAtAAndE(uk.nhs.nhsia.datastandards.ecds.ArrivalTimeAtAAndEType arrivalTimeAtAAndE);
        
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
         * Gets the "AAndEInitialAssessmentDate" element
         */
        java.util.Calendar getAAndEInitialAssessmentDate();
        
        /**
         * Gets (as xml) the "AAndEInitialAssessmentDate" element
         */
        uk.nhs.nhsia.datastandards.ecds.AAndEInitialAssessmentDateType xgetAAndEInitialAssessmentDate();
        
        /**
         * True if has "AAndEInitialAssessmentDate" element
         */
        boolean isSetAAndEInitialAssessmentDate();
        
        /**
         * Sets the "AAndEInitialAssessmentDate" element
         */
        void setAAndEInitialAssessmentDate(java.util.Calendar aAndEInitialAssessmentDate);
        
        /**
         * Sets (as xml) the "AAndEInitialAssessmentDate" element
         */
        void xsetAAndEInitialAssessmentDate(uk.nhs.nhsia.datastandards.ecds.AAndEInitialAssessmentDateType aAndEInitialAssessmentDate);
        
        /**
         * Unsets the "AAndEInitialAssessmentDate" element
         */
        void unsetAAndEInitialAssessmentDate();
        
        /**
         * Gets the "AAndEInitialAssessmentTime" element
         */
        java.util.Calendar getAAndEInitialAssessmentTime();
        
        /**
         * Gets (as xml) the "AAndEInitialAssessmentTime" element
         */
        uk.nhs.nhsia.datastandards.ecds.AAndEInitialAssessmentTimeType xgetAAndEInitialAssessmentTime();
        
        /**
         * True if has "AAndEInitialAssessmentTime" element
         */
        boolean isSetAAndEInitialAssessmentTime();
        
        /**
         * Sets the "AAndEInitialAssessmentTime" element
         */
        void setAAndEInitialAssessmentTime(java.util.Calendar aAndEInitialAssessmentTime);
        
        /**
         * Sets (as xml) the "AAndEInitialAssessmentTime" element
         */
        void xsetAAndEInitialAssessmentTime(uk.nhs.nhsia.datastandards.ecds.AAndEInitialAssessmentTimeType aAndEInitialAssessmentTime);
        
        /**
         * Unsets the "AAndEInitialAssessmentTime" element
         */
        void unsetAAndEInitialAssessmentTime();
        
        /**
         * Gets the "AAndEDateSeenForTreatment" element
         */
        java.util.Calendar getAAndEDateSeenForTreatment();
        
        /**
         * Gets (as xml) the "AAndEDateSeenForTreatment" element
         */
        uk.nhs.nhsia.datastandards.ecds.AAndEDateSeenForTreatmentType xgetAAndEDateSeenForTreatment();
        
        /**
         * True if has "AAndEDateSeenForTreatment" element
         */
        boolean isSetAAndEDateSeenForTreatment();
        
        /**
         * Sets the "AAndEDateSeenForTreatment" element
         */
        void setAAndEDateSeenForTreatment(java.util.Calendar aAndEDateSeenForTreatment);
        
        /**
         * Sets (as xml) the "AAndEDateSeenForTreatment" element
         */
        void xsetAAndEDateSeenForTreatment(uk.nhs.nhsia.datastandards.ecds.AAndEDateSeenForTreatmentType aAndEDateSeenForTreatment);
        
        /**
         * Unsets the "AAndEDateSeenForTreatment" element
         */
        void unsetAAndEDateSeenForTreatment();
        
        /**
         * Gets the "AAndETimeSeenForTreatment" element
         */
        java.util.Calendar getAAndETimeSeenForTreatment();
        
        /**
         * Gets (as xml) the "AAndETimeSeenForTreatment" element
         */
        uk.nhs.nhsia.datastandards.ecds.AAndETimeSeenForTreatmentType xgetAAndETimeSeenForTreatment();
        
        /**
         * True if has "AAndETimeSeenForTreatment" element
         */
        boolean isSetAAndETimeSeenForTreatment();
        
        /**
         * Sets the "AAndETimeSeenForTreatment" element
         */
        void setAAndETimeSeenForTreatment(java.util.Calendar aAndETimeSeenForTreatment);
        
        /**
         * Sets (as xml) the "AAndETimeSeenForTreatment" element
         */
        void xsetAAndETimeSeenForTreatment(uk.nhs.nhsia.datastandards.ecds.AAndETimeSeenForTreatmentType aAndETimeSeenForTreatment);
        
        /**
         * Unsets the "AAndETimeSeenForTreatment" element
         */
        void unsetAAndETimeSeenForTreatment();
        
        /**
         * Gets the "AAndEAttendanceConclusionDate" element
         */
        java.util.Calendar getAAndEAttendanceConclusionDate();
        
        /**
         * Gets (as xml) the "AAndEAttendanceConclusionDate" element
         */
        uk.nhs.nhsia.datastandards.ecds.AAndEAttendanceConclusionDateType xgetAAndEAttendanceConclusionDate();
        
        /**
         * True if has "AAndEAttendanceConclusionDate" element
         */
        boolean isSetAAndEAttendanceConclusionDate();
        
        /**
         * Sets the "AAndEAttendanceConclusionDate" element
         */
        void setAAndEAttendanceConclusionDate(java.util.Calendar aAndEAttendanceConclusionDate);
        
        /**
         * Sets (as xml) the "AAndEAttendanceConclusionDate" element
         */
        void xsetAAndEAttendanceConclusionDate(uk.nhs.nhsia.datastandards.ecds.AAndEAttendanceConclusionDateType aAndEAttendanceConclusionDate);
        
        /**
         * Unsets the "AAndEAttendanceConclusionDate" element
         */
        void unsetAAndEAttendanceConclusionDate();
        
        /**
         * Gets the "AAndEAttendanceConclusionTime" element
         */
        java.util.Calendar getAAndEAttendanceConclusionTime();
        
        /**
         * Gets (as xml) the "AAndEAttendanceConclusionTime" element
         */
        uk.nhs.nhsia.datastandards.ecds.AAndEAttendanceConclusionTimeType xgetAAndEAttendanceConclusionTime();
        
        /**
         * True if has "AAndEAttendanceConclusionTime" element
         */
        boolean isSetAAndEAttendanceConclusionTime();
        
        /**
         * Sets the "AAndEAttendanceConclusionTime" element
         */
        void setAAndEAttendanceConclusionTime(java.util.Calendar aAndEAttendanceConclusionTime);
        
        /**
         * Sets (as xml) the "AAndEAttendanceConclusionTime" element
         */
        void xsetAAndEAttendanceConclusionTime(uk.nhs.nhsia.datastandards.ecds.AAndEAttendanceConclusionTimeType aAndEAttendanceConclusionTime);
        
        /**
         * Unsets the "AAndEAttendanceConclusionTime" element
         */
        void unsetAAndEAttendanceConclusionTime();
        
        /**
         * Gets the "AAndEDepartureDate" element
         */
        java.util.Calendar getAAndEDepartureDate();
        
        /**
         * Gets (as xml) the "AAndEDepartureDate" element
         */
        uk.nhs.nhsia.datastandards.ecds.AAndEDepartureDateType xgetAAndEDepartureDate();
        
        /**
         * True if has "AAndEDepartureDate" element
         */
        boolean isSetAAndEDepartureDate();
        
        /**
         * Sets the "AAndEDepartureDate" element
         */
        void setAAndEDepartureDate(java.util.Calendar aAndEDepartureDate);
        
        /**
         * Sets (as xml) the "AAndEDepartureDate" element
         */
        void xsetAAndEDepartureDate(uk.nhs.nhsia.datastandards.ecds.AAndEDepartureDateType aAndEDepartureDate);
        
        /**
         * Unsets the "AAndEDepartureDate" element
         */
        void unsetAAndEDepartureDate();
        
        /**
         * Gets the "AAndEDepartureTime" element
         */
        java.util.Calendar getAAndEDepartureTime();
        
        /**
         * Gets (as xml) the "AAndEDepartureTime" element
         */
        uk.nhs.nhsia.datastandards.ecds.AAndEDepartureTimeType xgetAAndEDepartureTime();
        
        /**
         * True if has "AAndEDepartureTime" element
         */
        boolean isSetAAndEDepartureTime();
        
        /**
         * Sets the "AAndEDepartureTime" element
         */
        void setAAndEDepartureTime(java.util.Calendar aAndEDepartureTime);
        
        /**
         * Sets (as xml) the "AAndEDepartureTime" element
         */
        void xsetAAndEDepartureTime(uk.nhs.nhsia.datastandards.ecds.AAndEDepartureTimeType aAndEDepartureTime);
        
        /**
         * Unsets the "AAndEDepartureTime" element
         */
        void unsetAAndEDepartureTime();
        
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
            public static uk.nhs.nhsia.datastandards.ecds.AttendanceOccurrenceStructure.ActivityCharacteristics newInstance() {
              return (uk.nhs.nhsia.datastandards.ecds.AttendanceOccurrenceStructure.ActivityCharacteristics) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().newInstance( type, null ); }
            
            public static uk.nhs.nhsia.datastandards.ecds.AttendanceOccurrenceStructure.ActivityCharacteristics newInstance(org.apache.xmlbeans.XmlOptions options) {
              return (uk.nhs.nhsia.datastandards.ecds.AttendanceOccurrenceStructure.ActivityCharacteristics) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().newInstance( type, options ); }
            
            private Factory() { } // No instance of this class allowed
        }
    }
    
    /**
     * A factory class with static methods for creating instances
     * of this type.
     */
    
    public static final class Factory
    {
        public static uk.nhs.nhsia.datastandards.ecds.AttendanceOccurrenceStructure newInstance() {
          return (uk.nhs.nhsia.datastandards.ecds.AttendanceOccurrenceStructure) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().newInstance( type, null ); }
        
        public static uk.nhs.nhsia.datastandards.ecds.AttendanceOccurrenceStructure newInstance(org.apache.xmlbeans.XmlOptions options) {
          return (uk.nhs.nhsia.datastandards.ecds.AttendanceOccurrenceStructure) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().newInstance( type, options ); }
        
        /** @param xmlAsString the string value to parse */
        public static uk.nhs.nhsia.datastandards.ecds.AttendanceOccurrenceStructure parse(java.lang.String xmlAsString) throws org.apache.xmlbeans.XmlException {
          return (uk.nhs.nhsia.datastandards.ecds.AttendanceOccurrenceStructure) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( xmlAsString, type, null ); }
        
        public static uk.nhs.nhsia.datastandards.ecds.AttendanceOccurrenceStructure parse(java.lang.String xmlAsString, org.apache.xmlbeans.XmlOptions options) throws org.apache.xmlbeans.XmlException {
          return (uk.nhs.nhsia.datastandards.ecds.AttendanceOccurrenceStructure) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( xmlAsString, type, options ); }
        
        /** @param file the file from which to load an xml document */
        public static uk.nhs.nhsia.datastandards.ecds.AttendanceOccurrenceStructure parse(java.io.File file) throws org.apache.xmlbeans.XmlException, java.io.IOException {
          return (uk.nhs.nhsia.datastandards.ecds.AttendanceOccurrenceStructure) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( file, type, null ); }
        
        public static uk.nhs.nhsia.datastandards.ecds.AttendanceOccurrenceStructure parse(java.io.File file, org.apache.xmlbeans.XmlOptions options) throws org.apache.xmlbeans.XmlException, java.io.IOException {
          return (uk.nhs.nhsia.datastandards.ecds.AttendanceOccurrenceStructure) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( file, type, options ); }
        
        public static uk.nhs.nhsia.datastandards.ecds.AttendanceOccurrenceStructure parse(java.net.URL u) throws org.apache.xmlbeans.XmlException, java.io.IOException {
          return (uk.nhs.nhsia.datastandards.ecds.AttendanceOccurrenceStructure) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( u, type, null ); }
        
        public static uk.nhs.nhsia.datastandards.ecds.AttendanceOccurrenceStructure parse(java.net.URL u, org.apache.xmlbeans.XmlOptions options) throws org.apache.xmlbeans.XmlException, java.io.IOException {
          return (uk.nhs.nhsia.datastandards.ecds.AttendanceOccurrenceStructure) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( u, type, options ); }
        
        public static uk.nhs.nhsia.datastandards.ecds.AttendanceOccurrenceStructure parse(java.io.InputStream is) throws org.apache.xmlbeans.XmlException, java.io.IOException {
          return (uk.nhs.nhsia.datastandards.ecds.AttendanceOccurrenceStructure) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( is, type, null ); }
        
        public static uk.nhs.nhsia.datastandards.ecds.AttendanceOccurrenceStructure parse(java.io.InputStream is, org.apache.xmlbeans.XmlOptions options) throws org.apache.xmlbeans.XmlException, java.io.IOException {
          return (uk.nhs.nhsia.datastandards.ecds.AttendanceOccurrenceStructure) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( is, type, options ); }
        
        public static uk.nhs.nhsia.datastandards.ecds.AttendanceOccurrenceStructure parse(java.io.Reader r) throws org.apache.xmlbeans.XmlException, java.io.IOException {
          return (uk.nhs.nhsia.datastandards.ecds.AttendanceOccurrenceStructure) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( r, type, null ); }
        
        public static uk.nhs.nhsia.datastandards.ecds.AttendanceOccurrenceStructure parse(java.io.Reader r, org.apache.xmlbeans.XmlOptions options) throws org.apache.xmlbeans.XmlException, java.io.IOException {
          return (uk.nhs.nhsia.datastandards.ecds.AttendanceOccurrenceStructure) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( r, type, options ); }
        
        public static uk.nhs.nhsia.datastandards.ecds.AttendanceOccurrenceStructure parse(javax.xml.stream.XMLStreamReader sr) throws org.apache.xmlbeans.XmlException {
          return (uk.nhs.nhsia.datastandards.ecds.AttendanceOccurrenceStructure) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( sr, type, null ); }
        
        public static uk.nhs.nhsia.datastandards.ecds.AttendanceOccurrenceStructure parse(javax.xml.stream.XMLStreamReader sr, org.apache.xmlbeans.XmlOptions options) throws org.apache.xmlbeans.XmlException {
          return (uk.nhs.nhsia.datastandards.ecds.AttendanceOccurrenceStructure) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( sr, type, options ); }
        
        public static uk.nhs.nhsia.datastandards.ecds.AttendanceOccurrenceStructure parse(org.w3c.dom.Node node) throws org.apache.xmlbeans.XmlException {
          return (uk.nhs.nhsia.datastandards.ecds.AttendanceOccurrenceStructure) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( node, type, null ); }
        
        public static uk.nhs.nhsia.datastandards.ecds.AttendanceOccurrenceStructure parse(org.w3c.dom.Node node, org.apache.xmlbeans.XmlOptions options) throws org.apache.xmlbeans.XmlException {
          return (uk.nhs.nhsia.datastandards.ecds.AttendanceOccurrenceStructure) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( node, type, options ); }
        
        /** @deprecated {@link org.apache.xmlbeans.xml.stream.XMLInputStream} */
        public static uk.nhs.nhsia.datastandards.ecds.AttendanceOccurrenceStructure parse(org.apache.xmlbeans.xml.stream.XMLInputStream xis) throws org.apache.xmlbeans.XmlException, org.apache.xmlbeans.xml.stream.XMLStreamException {
          return (uk.nhs.nhsia.datastandards.ecds.AttendanceOccurrenceStructure) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( xis, type, null ); }
        
        /** @deprecated {@link org.apache.xmlbeans.xml.stream.XMLInputStream} */
        public static uk.nhs.nhsia.datastandards.ecds.AttendanceOccurrenceStructure parse(org.apache.xmlbeans.xml.stream.XMLInputStream xis, org.apache.xmlbeans.XmlOptions options) throws org.apache.xmlbeans.XmlException, org.apache.xmlbeans.xml.stream.XMLStreamException {
          return (uk.nhs.nhsia.datastandards.ecds.AttendanceOccurrenceStructure) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( xis, type, options ); }
        
        /** @deprecated {@link org.apache.xmlbeans.xml.stream.XMLInputStream} */
        public static org.apache.xmlbeans.xml.stream.XMLInputStream newValidatingXMLInputStream(org.apache.xmlbeans.xml.stream.XMLInputStream xis) throws org.apache.xmlbeans.XmlException, org.apache.xmlbeans.xml.stream.XMLStreamException {
          return org.apache.xmlbeans.XmlBeans.getContextTypeLoader().newValidatingXMLInputStream( xis, type, null ); }
        
        /** @deprecated {@link org.apache.xmlbeans.xml.stream.XMLInputStream} */
        public static org.apache.xmlbeans.xml.stream.XMLInputStream newValidatingXMLInputStream(org.apache.xmlbeans.xml.stream.XMLInputStream xis, org.apache.xmlbeans.XmlOptions options) throws org.apache.xmlbeans.XmlException, org.apache.xmlbeans.xml.stream.XMLStreamException {
          return org.apache.xmlbeans.XmlBeans.getContextTypeLoader().newValidatingXMLInputStream( xis, type, options ); }
        
        private Factory() { } // No instance of this class allowed
    }
}
