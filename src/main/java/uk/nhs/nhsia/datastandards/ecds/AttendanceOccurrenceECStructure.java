/*
 * XML Type:  AttendanceOccurrence_EC_Structure
 * Namespace: http://www.nhsia.nhs.uk/DataStandards/XMLschema/CDS/ns
 * Java type: uk.nhs.nhsia.datastandards.ecds.AttendanceOccurrenceECStructure
 *
 * Automatically generated - do not modify.
 */
package uk.nhs.nhsia.datastandards.ecds;


/**
 * An XML AttendanceOccurrence_EC_Structure(@http://www.nhsia.nhs.uk/DataStandards/XMLschema/CDS/ns).
 *
 * This is a complex type.
 */
public interface AttendanceOccurrenceECStructure extends org.apache.xmlbeans.XmlObject
{
    public static final org.apache.xmlbeans.SchemaType type = (org.apache.xmlbeans.SchemaType)
        org.apache.xmlbeans.XmlBeans.typeSystemForClassLoader(AttendanceOccurrenceECStructure.class.getClassLoader(), "schemaorg_apache_xmlbeans.system.s30C1180FF47174E0C8A992A2D657328B").resolveHandle("attendanceoccurrenceecstructure844ctype");
    
    /**
     * Gets the "AmbulanceDetails" element
     */
    uk.nhs.nhsia.datastandards.ecds.AttendanceOccurrenceECStructure.AmbulanceDetails getAmbulanceDetails();
    
    /**
     * True if has "AmbulanceDetails" element
     */
    boolean isSetAmbulanceDetails();
    
    /**
     * Sets the "AmbulanceDetails" element
     */
    void setAmbulanceDetails(uk.nhs.nhsia.datastandards.ecds.AttendanceOccurrenceECStructure.AmbulanceDetails ambulanceDetails);
    
    /**
     * Appends and returns a new empty "AmbulanceDetails" element
     */
    uk.nhs.nhsia.datastandards.ecds.AttendanceOccurrenceECStructure.AmbulanceDetails addNewAmbulanceDetails();
    
    /**
     * Unsets the "AmbulanceDetails" element
     */
    void unsetAmbulanceDetails();
    
    /**
     * Gets the "EmergencyCareAttendanceActivityCharacteristics" element
     */
    uk.nhs.nhsia.datastandards.ecds.AttendanceOccurrenceECStructure.EmergencyCareAttendanceActivityCharacteristics getEmergencyCareAttendanceActivityCharacteristics();
    
    /**
     * Sets the "EmergencyCareAttendanceActivityCharacteristics" element
     */
    void setEmergencyCareAttendanceActivityCharacteristics(uk.nhs.nhsia.datastandards.ecds.AttendanceOccurrenceECStructure.EmergencyCareAttendanceActivityCharacteristics emergencyCareAttendanceActivityCharacteristics);
    
    /**
     * Appends and returns a new empty "EmergencyCareAttendanceActivityCharacteristics" element
     */
    uk.nhs.nhsia.datastandards.ecds.AttendanceOccurrenceECStructure.EmergencyCareAttendanceActivityCharacteristics addNewEmergencyCareAttendanceActivityCharacteristics();
    
    /**
     * Gets the "InjuryCharacteristics" element
     */
    uk.nhs.nhsia.datastandards.ecds.AttendanceOccurrenceECStructure.InjuryCharacteristics getInjuryCharacteristics();
    
    /**
     * True if has "InjuryCharacteristics" element
     */
    boolean isSetInjuryCharacteristics();
    
    /**
     * Sets the "InjuryCharacteristics" element
     */
    void setInjuryCharacteristics(uk.nhs.nhsia.datastandards.ecds.AttendanceOccurrenceECStructure.InjuryCharacteristics injuryCharacteristics);
    
    /**
     * Appends and returns a new empty "InjuryCharacteristics" element
     */
    uk.nhs.nhsia.datastandards.ecds.AttendanceOccurrenceECStructure.InjuryCharacteristics addNewInjuryCharacteristics();
    
    /**
     * Unsets the "InjuryCharacteristics" element
     */
    void unsetInjuryCharacteristics();
    
    /**
     * Gets the "PatientClinicalHistory" element
     */
    uk.nhs.nhsia.datastandards.ecds.AttendanceOccurrenceECStructure.PatientClinicalHistory getPatientClinicalHistory();
    
    /**
     * True if has "PatientClinicalHistory" element
     */
    boolean isSetPatientClinicalHistory();
    
    /**
     * Sets the "PatientClinicalHistory" element
     */
    void setPatientClinicalHistory(uk.nhs.nhsia.datastandards.ecds.AttendanceOccurrenceECStructure.PatientClinicalHistory patientClinicalHistory);
    
    /**
     * Appends and returns a new empty "PatientClinicalHistory" element
     */
    uk.nhs.nhsia.datastandards.ecds.AttendanceOccurrenceECStructure.PatientClinicalHistory addNewPatientClinicalHistory();
    
    /**
     * Unsets the "PatientClinicalHistory" element
     */
    void unsetPatientClinicalHistory();
    
    /**
     * Gets the "ServiceAgreementDetails" element
     */
    uk.nhs.nhsia.datastandards.ecds.AttendanceOccurrenceECStructure.ServiceAgreementDetails getServiceAgreementDetails();
    
    /**
     * Sets the "ServiceAgreementDetails" element
     */
    void setServiceAgreementDetails(uk.nhs.nhsia.datastandards.ecds.AttendanceOccurrenceECStructure.ServiceAgreementDetails serviceAgreementDetails);
    
    /**
     * Appends and returns a new empty "ServiceAgreementDetails" element
     */
    uk.nhs.nhsia.datastandards.ecds.AttendanceOccurrenceECStructure.ServiceAgreementDetails addNewServiceAgreementDetails();
    
    /**
     * Gets array of all "CareProfessionals_EmergencyCare" elements
     */
    uk.nhs.nhsia.datastandards.ecds.AttendanceOccurrenceECStructure.CareProfessionalsEmergencyCare[] getCareProfessionalsEmergencyCareArray();
    
    /**
     * Gets ith "CareProfessionals_EmergencyCare" element
     */
    uk.nhs.nhsia.datastandards.ecds.AttendanceOccurrenceECStructure.CareProfessionalsEmergencyCare getCareProfessionalsEmergencyCareArray(int i);
    
    /**
     * Returns number of "CareProfessionals_EmergencyCare" element
     */
    int sizeOfCareProfessionalsEmergencyCareArray();
    
    /**
     * Sets array of all "CareProfessionals_EmergencyCare" element
     */
    void setCareProfessionalsEmergencyCareArray(uk.nhs.nhsia.datastandards.ecds.AttendanceOccurrenceECStructure.CareProfessionalsEmergencyCare[] careProfessionalsEmergencyCareArray);
    
    /**
     * Sets ith "CareProfessionals_EmergencyCare" element
     */
    void setCareProfessionalsEmergencyCareArray(int i, uk.nhs.nhsia.datastandards.ecds.AttendanceOccurrenceECStructure.CareProfessionalsEmergencyCare careProfessionalsEmergencyCare);
    
    /**
     * Inserts and returns a new empty value (as xml) as the ith "CareProfessionals_EmergencyCare" element
     */
    uk.nhs.nhsia.datastandards.ecds.AttendanceOccurrenceECStructure.CareProfessionalsEmergencyCare insertNewCareProfessionalsEmergencyCare(int i);
    
    /**
     * Appends and returns a new empty value (as xml) as the last "CareProfessionals_EmergencyCare" element
     */
    uk.nhs.nhsia.datastandards.ecds.AttendanceOccurrenceECStructure.CareProfessionalsEmergencyCare addNewCareProfessionalsEmergencyCare();
    
    /**
     * Removes the ith "CareProfessionals_EmergencyCare" element
     */
    void removeCareProfessionalsEmergencyCare(int i);
    
    /**
     * Gets array of all "EmergencyCareDiagnoses_SnomedCt" elements
     */
    uk.nhs.nhsia.datastandards.ecds.AttendanceOccurrenceECStructure.EmergencyCareDiagnosesSnomedCt[] getEmergencyCareDiagnosesSnomedCtArray();
    
    /**
     * Gets ith "EmergencyCareDiagnoses_SnomedCt" element
     */
    uk.nhs.nhsia.datastandards.ecds.AttendanceOccurrenceECStructure.EmergencyCareDiagnosesSnomedCt getEmergencyCareDiagnosesSnomedCtArray(int i);
    
    /**
     * Returns number of "EmergencyCareDiagnoses_SnomedCt" element
     */
    int sizeOfEmergencyCareDiagnosesSnomedCtArray();
    
    /**
     * Sets array of all "EmergencyCareDiagnoses_SnomedCt" element
     */
    void setEmergencyCareDiagnosesSnomedCtArray(uk.nhs.nhsia.datastandards.ecds.AttendanceOccurrenceECStructure.EmergencyCareDiagnosesSnomedCt[] emergencyCareDiagnosesSnomedCtArray);
    
    /**
     * Sets ith "EmergencyCareDiagnoses_SnomedCt" element
     */
    void setEmergencyCareDiagnosesSnomedCtArray(int i, uk.nhs.nhsia.datastandards.ecds.AttendanceOccurrenceECStructure.EmergencyCareDiagnosesSnomedCt emergencyCareDiagnosesSnomedCt);
    
    /**
     * Inserts and returns a new empty value (as xml) as the ith "EmergencyCareDiagnoses_SnomedCt" element
     */
    uk.nhs.nhsia.datastandards.ecds.AttendanceOccurrenceECStructure.EmergencyCareDiagnosesSnomedCt insertNewEmergencyCareDiagnosesSnomedCt(int i);
    
    /**
     * Appends and returns a new empty value (as xml) as the last "EmergencyCareDiagnoses_SnomedCt" element
     */
    uk.nhs.nhsia.datastandards.ecds.AttendanceOccurrenceECStructure.EmergencyCareDiagnosesSnomedCt addNewEmergencyCareDiagnosesSnomedCt();
    
    /**
     * Removes the ith "EmergencyCareDiagnoses_SnomedCt" element
     */
    void removeEmergencyCareDiagnosesSnomedCt(int i);
    
    /**
     * Gets array of all "EmergencyCareInvestigations_SnomedCt" elements
     */
    uk.nhs.nhsia.datastandards.ecds.AttendanceOccurrenceECStructure.EmergencyCareInvestigationsSnomedCt[] getEmergencyCareInvestigationsSnomedCtArray();
    
    /**
     * Gets ith "EmergencyCareInvestigations_SnomedCt" element
     */
    uk.nhs.nhsia.datastandards.ecds.AttendanceOccurrenceECStructure.EmergencyCareInvestigationsSnomedCt getEmergencyCareInvestigationsSnomedCtArray(int i);
    
    /**
     * Returns number of "EmergencyCareInvestigations_SnomedCt" element
     */
    int sizeOfEmergencyCareInvestigationsSnomedCtArray();
    
    /**
     * Sets array of all "EmergencyCareInvestigations_SnomedCt" element
     */
    void setEmergencyCareInvestigationsSnomedCtArray(uk.nhs.nhsia.datastandards.ecds.AttendanceOccurrenceECStructure.EmergencyCareInvestigationsSnomedCt[] emergencyCareInvestigationsSnomedCtArray);
    
    /**
     * Sets ith "EmergencyCareInvestigations_SnomedCt" element
     */
    void setEmergencyCareInvestigationsSnomedCtArray(int i, uk.nhs.nhsia.datastandards.ecds.AttendanceOccurrenceECStructure.EmergencyCareInvestigationsSnomedCt emergencyCareInvestigationsSnomedCt);
    
    /**
     * Inserts and returns a new empty value (as xml) as the ith "EmergencyCareInvestigations_SnomedCt" element
     */
    uk.nhs.nhsia.datastandards.ecds.AttendanceOccurrenceECStructure.EmergencyCareInvestigationsSnomedCt insertNewEmergencyCareInvestigationsSnomedCt(int i);
    
    /**
     * Appends and returns a new empty value (as xml) as the last "EmergencyCareInvestigations_SnomedCt" element
     */
    uk.nhs.nhsia.datastandards.ecds.AttendanceOccurrenceECStructure.EmergencyCareInvestigationsSnomedCt addNewEmergencyCareInvestigationsSnomedCt();
    
    /**
     * Removes the ith "EmergencyCareInvestigations_SnomedCt" element
     */
    void removeEmergencyCareInvestigationsSnomedCt(int i);
    
    /**
     * Gets array of all "EmergencyCareTreatments_SnomedCt" elements
     */
    uk.nhs.nhsia.datastandards.ecds.AttendanceOccurrenceECStructure.EmergencyCareTreatmentsSnomedCt[] getEmergencyCareTreatmentsSnomedCtArray();
    
    /**
     * Gets ith "EmergencyCareTreatments_SnomedCt" element
     */
    uk.nhs.nhsia.datastandards.ecds.AttendanceOccurrenceECStructure.EmergencyCareTreatmentsSnomedCt getEmergencyCareTreatmentsSnomedCtArray(int i);
    
    /**
     * Returns number of "EmergencyCareTreatments_SnomedCt" element
     */
    int sizeOfEmergencyCareTreatmentsSnomedCtArray();
    
    /**
     * Sets array of all "EmergencyCareTreatments_SnomedCt" element
     */
    void setEmergencyCareTreatmentsSnomedCtArray(uk.nhs.nhsia.datastandards.ecds.AttendanceOccurrenceECStructure.EmergencyCareTreatmentsSnomedCt[] emergencyCareTreatmentsSnomedCtArray);
    
    /**
     * Sets ith "EmergencyCareTreatments_SnomedCt" element
     */
    void setEmergencyCareTreatmentsSnomedCtArray(int i, uk.nhs.nhsia.datastandards.ecds.AttendanceOccurrenceECStructure.EmergencyCareTreatmentsSnomedCt emergencyCareTreatmentsSnomedCt);
    
    /**
     * Inserts and returns a new empty value (as xml) as the ith "EmergencyCareTreatments_SnomedCt" element
     */
    uk.nhs.nhsia.datastandards.ecds.AttendanceOccurrenceECStructure.EmergencyCareTreatmentsSnomedCt insertNewEmergencyCareTreatmentsSnomedCt(int i);
    
    /**
     * Appends and returns a new empty value (as xml) as the last "EmergencyCareTreatments_SnomedCt" element
     */
    uk.nhs.nhsia.datastandards.ecds.AttendanceOccurrenceECStructure.EmergencyCareTreatmentsSnomedCt addNewEmergencyCareTreatmentsSnomedCt();
    
    /**
     * Removes the ith "EmergencyCareTreatments_SnomedCt" element
     */
    void removeEmergencyCareTreatmentsSnomedCt(int i);
    
    /**
     * Gets array of all "ReferralsToOtherServices" elements
     */
    uk.nhs.nhsia.datastandards.ecds.AttendanceOccurrenceECStructure.ReferralsToOtherServices[] getReferralsToOtherServicesArray();
    
    /**
     * Gets ith "ReferralsToOtherServices" element
     */
    uk.nhs.nhsia.datastandards.ecds.AttendanceOccurrenceECStructure.ReferralsToOtherServices getReferralsToOtherServicesArray(int i);
    
    /**
     * Returns number of "ReferralsToOtherServices" element
     */
    int sizeOfReferralsToOtherServicesArray();
    
    /**
     * Sets array of all "ReferralsToOtherServices" element
     */
    void setReferralsToOtherServicesArray(uk.nhs.nhsia.datastandards.ecds.AttendanceOccurrenceECStructure.ReferralsToOtherServices[] referralsToOtherServicesArray);
    
    /**
     * Sets ith "ReferralsToOtherServices" element
     */
    void setReferralsToOtherServicesArray(int i, uk.nhs.nhsia.datastandards.ecds.AttendanceOccurrenceECStructure.ReferralsToOtherServices referralsToOtherServices);
    
    /**
     * Inserts and returns a new empty value (as xml) as the ith "ReferralsToOtherServices" element
     */
    uk.nhs.nhsia.datastandards.ecds.AttendanceOccurrenceECStructure.ReferralsToOtherServices insertNewReferralsToOtherServices(int i);
    
    /**
     * Appends and returns a new empty value (as xml) as the last "ReferralsToOtherServices" element
     */
    uk.nhs.nhsia.datastandards.ecds.AttendanceOccurrenceECStructure.ReferralsToOtherServices addNewReferralsToOtherServices();
    
    /**
     * Removes the ith "ReferralsToOtherServices" element
     */
    void removeReferralsToOtherServices(int i);
    
    /**
     * Gets the "DischargeFromEmergencyCare" element
     */
    uk.nhs.nhsia.datastandards.ecds.AttendanceOccurrenceECStructure.DischargeFromEmergencyCare getDischargeFromEmergencyCare();
    
    /**
     * True if has "DischargeFromEmergencyCare" element
     */
    boolean isSetDischargeFromEmergencyCare();
    
    /**
     * Sets the "DischargeFromEmergencyCare" element
     */
    void setDischargeFromEmergencyCare(uk.nhs.nhsia.datastandards.ecds.AttendanceOccurrenceECStructure.DischargeFromEmergencyCare dischargeFromEmergencyCare);
    
    /**
     * Appends and returns a new empty "DischargeFromEmergencyCare" element
     */
    uk.nhs.nhsia.datastandards.ecds.AttendanceOccurrenceECStructure.DischargeFromEmergencyCare addNewDischargeFromEmergencyCare();
    
    /**
     * Unsets the "DischargeFromEmergencyCare" element
     */
    void unsetDischargeFromEmergencyCare();
    
    /**
     * Gets the "ResearchAndDiseaseOutbreakNotification" element
     */
    uk.nhs.nhsia.datastandards.ecds.AttendanceOccurrenceECStructure.ResearchAndDiseaseOutbreakNotification getResearchAndDiseaseOutbreakNotification();
    
    /**
     * True if has "ResearchAndDiseaseOutbreakNotification" element
     */
    boolean isSetResearchAndDiseaseOutbreakNotification();
    
    /**
     * Sets the "ResearchAndDiseaseOutbreakNotification" element
     */
    void setResearchAndDiseaseOutbreakNotification(uk.nhs.nhsia.datastandards.ecds.AttendanceOccurrenceECStructure.ResearchAndDiseaseOutbreakNotification researchAndDiseaseOutbreakNotification);
    
    /**
     * Appends and returns a new empty "ResearchAndDiseaseOutbreakNotification" element
     */
    uk.nhs.nhsia.datastandards.ecds.AttendanceOccurrenceECStructure.ResearchAndDiseaseOutbreakNotification addNewResearchAndDiseaseOutbreakNotification();
    
    /**
     * Unsets the "ResearchAndDiseaseOutbreakNotification" element
     */
    void unsetResearchAndDiseaseOutbreakNotification();
    
    /**
     * An XML AmbulanceDetails(@http://www.nhsia.nhs.uk/DataStandards/XMLschema/CDS/ns).
     *
     * This is a complex type.
     */
    public interface AmbulanceDetails extends org.apache.xmlbeans.XmlObject
    {
        public static final org.apache.xmlbeans.SchemaType type = (org.apache.xmlbeans.SchemaType)
            org.apache.xmlbeans.XmlBeans.typeSystemForClassLoader(AmbulanceDetails.class.getClassLoader(), "schemaorg_apache_xmlbeans.system.s30C1180FF47174E0C8A992A2D657328B").resolveHandle("ambulancedetailsb14aelemtype");
        
        /**
         * Gets the "AmbulanceIncidentNumber" element
         */
        java.lang.String getAmbulanceIncidentNumber();
        
        /**
         * Gets (as xml) the "AmbulanceIncidentNumber" element
         */
        uk.nhs.nhsia.datastandards.ecds.ANMax20ECType xgetAmbulanceIncidentNumber();
        
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
        void xsetAmbulanceIncidentNumber(uk.nhs.nhsia.datastandards.ecds.ANMax20ECType ambulanceIncidentNumber);
        
        /**
         * Unsets the "AmbulanceIncidentNumber" element
         */
        void unsetAmbulanceIncidentNumber();
        
        /**
         * Gets the "OrganisationIdentifier_ConveyingAmbulanceTrust" element
         */
        java.lang.String getOrganisationIdentifierConveyingAmbulanceTrust();
        
        /**
         * Gets (as xml) the "OrganisationIdentifier_ConveyingAmbulanceTrust" element
         */
        uk.nhs.nhsia.datastandards.ecds.AN35ECType xgetOrganisationIdentifierConveyingAmbulanceTrust();
        
        /**
         * True if has "OrganisationIdentifier_ConveyingAmbulanceTrust" element
         */
        boolean isSetOrganisationIdentifierConveyingAmbulanceTrust();
        
        /**
         * Sets the "OrganisationIdentifier_ConveyingAmbulanceTrust" element
         */
        void setOrganisationIdentifierConveyingAmbulanceTrust(java.lang.String organisationIdentifierConveyingAmbulanceTrust);
        
        /**
         * Sets (as xml) the "OrganisationIdentifier_ConveyingAmbulanceTrust" element
         */
        void xsetOrganisationIdentifierConveyingAmbulanceTrust(uk.nhs.nhsia.datastandards.ecds.AN35ECType organisationIdentifierConveyingAmbulanceTrust);
        
        /**
         * Unsets the "OrganisationIdentifier_ConveyingAmbulanceTrust" element
         */
        void unsetOrganisationIdentifierConveyingAmbulanceTrust();
        
        /**
         * A factory class with static methods for creating instances
         * of this type.
         */
        
        public static final class Factory
        {
            public static uk.nhs.nhsia.datastandards.ecds.AttendanceOccurrenceECStructure.AmbulanceDetails newInstance() {
              return (uk.nhs.nhsia.datastandards.ecds.AttendanceOccurrenceECStructure.AmbulanceDetails) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().newInstance( type, null ); }
            
            public static uk.nhs.nhsia.datastandards.ecds.AttendanceOccurrenceECStructure.AmbulanceDetails newInstance(org.apache.xmlbeans.XmlOptions options) {
              return (uk.nhs.nhsia.datastandards.ecds.AttendanceOccurrenceECStructure.AmbulanceDetails) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().newInstance( type, options ); }
            
            private Factory() { } // No instance of this class allowed
        }
    }
    
    /**
     * An XML EmergencyCareAttendanceActivityCharacteristics(@http://www.nhsia.nhs.uk/DataStandards/XMLschema/CDS/ns).
     *
     * This is a complex type.
     */
    public interface EmergencyCareAttendanceActivityCharacteristics extends org.apache.xmlbeans.XmlObject
    {
        public static final org.apache.xmlbeans.SchemaType type = (org.apache.xmlbeans.SchemaType)
            org.apache.xmlbeans.XmlBeans.typeSystemForClassLoader(EmergencyCareAttendanceActivityCharacteristics.class.getClassLoader(), "schemaorg_apache_xmlbeans.system.s30C1180FF47174E0C8A992A2D657328B").resolveHandle("emergencycareattendanceactivitycharacteristics5772elemtype");
        
        /**
         * Gets the "EmergencyCareAttendanceIdentifier" element
         */
        java.lang.String getEmergencyCareAttendanceIdentifier();
        
        /**
         * Gets (as xml) the "EmergencyCareAttendanceIdentifier" element
         */
        uk.nhs.nhsia.datastandards.ecds.ANMin1Max12ECType xgetEmergencyCareAttendanceIdentifier();
        
        /**
         * Sets the "EmergencyCareAttendanceIdentifier" element
         */
        void setEmergencyCareAttendanceIdentifier(java.lang.String emergencyCareAttendanceIdentifier);
        
        /**
         * Sets (as xml) the "EmergencyCareAttendanceIdentifier" element
         */
        void xsetEmergencyCareAttendanceIdentifier(uk.nhs.nhsia.datastandards.ecds.ANMin1Max12ECType emergencyCareAttendanceIdentifier);
        
        /**
         * Gets the "EmergencyCareArrivalMode_SnomedCt" element
         */
        java.lang.String getEmergencyCareArrivalModeSnomedCt();
        
        /**
         * Gets (as xml) the "EmergencyCareArrivalMode_SnomedCt" element
         */
        uk.nhs.nhsia.datastandards.ecds.N618ECType xgetEmergencyCareArrivalModeSnomedCt();
        
        /**
         * True if has "EmergencyCareArrivalMode_SnomedCt" element
         */
        boolean isSetEmergencyCareArrivalModeSnomedCt();
        
        /**
         * Sets the "EmergencyCareArrivalMode_SnomedCt" element
         */
        void setEmergencyCareArrivalModeSnomedCt(java.lang.String emergencyCareArrivalModeSnomedCt);
        
        /**
         * Sets (as xml) the "EmergencyCareArrivalMode_SnomedCt" element
         */
        void xsetEmergencyCareArrivalModeSnomedCt(uk.nhs.nhsia.datastandards.ecds.N618ECType emergencyCareArrivalModeSnomedCt);
        
        /**
         * Unsets the "EmergencyCareArrivalMode_SnomedCt" element
         */
        void unsetEmergencyCareArrivalModeSnomedCt();
        
        /**
         * Gets the "EmergencyCareAttendanceCategory" element
         */
        uk.nhs.nhsia.datastandards.ecds.AttendCatECType.Enum getEmergencyCareAttendanceCategory();
        
        /**
         * Gets (as xml) the "EmergencyCareAttendanceCategory" element
         */
        uk.nhs.nhsia.datastandards.ecds.AttendCatECType xgetEmergencyCareAttendanceCategory();
        
        /**
         * True if has "EmergencyCareAttendanceCategory" element
         */
        boolean isSetEmergencyCareAttendanceCategory();
        
        /**
         * Sets the "EmergencyCareAttendanceCategory" element
         */
        void setEmergencyCareAttendanceCategory(uk.nhs.nhsia.datastandards.ecds.AttendCatECType.Enum emergencyCareAttendanceCategory);
        
        /**
         * Sets (as xml) the "EmergencyCareAttendanceCategory" element
         */
        void xsetEmergencyCareAttendanceCategory(uk.nhs.nhsia.datastandards.ecds.AttendCatECType emergencyCareAttendanceCategory);
        
        /**
         * Unsets the "EmergencyCareAttendanceCategory" element
         */
        void unsetEmergencyCareAttendanceCategory();
        
        /**
         * Gets the "EmergencyCareAttendanceSource_SnomedCt" element
         */
        java.lang.String getEmergencyCareAttendanceSourceSnomedCt();
        
        /**
         * Gets (as xml) the "EmergencyCareAttendanceSource_SnomedCt" element
         */
        uk.nhs.nhsia.datastandards.ecds.N618ECType xgetEmergencyCareAttendanceSourceSnomedCt();
        
        /**
         * True if has "EmergencyCareAttendanceSource_SnomedCt" element
         */
        boolean isSetEmergencyCareAttendanceSourceSnomedCt();
        
        /**
         * Sets the "EmergencyCareAttendanceSource_SnomedCt" element
         */
        void setEmergencyCareAttendanceSourceSnomedCt(java.lang.String emergencyCareAttendanceSourceSnomedCt);
        
        /**
         * Sets (as xml) the "EmergencyCareAttendanceSource_SnomedCt" element
         */
        void xsetEmergencyCareAttendanceSourceSnomedCt(uk.nhs.nhsia.datastandards.ecds.N618ECType emergencyCareAttendanceSourceSnomedCt);
        
        /**
         * Unsets the "EmergencyCareAttendanceSource_SnomedCt" element
         */
        void unsetEmergencyCareAttendanceSourceSnomedCt();
        
        /**
         * Gets the "OrganisationSiteIdentifier_EmergencyCareAttendanceSource" element
         */
        java.lang.String getOrganisationSiteIdentifierEmergencyCareAttendanceSource();
        
        /**
         * Gets (as xml) the "OrganisationSiteIdentifier_EmergencyCareAttendanceSource" element
         */
        uk.nhs.nhsia.datastandards.ecds.AN59ECType xgetOrganisationSiteIdentifierEmergencyCareAttendanceSource();
        
        /**
         * True if has "OrganisationSiteIdentifier_EmergencyCareAttendanceSource" element
         */
        boolean isSetOrganisationSiteIdentifierEmergencyCareAttendanceSource();
        
        /**
         * Sets the "OrganisationSiteIdentifier_EmergencyCareAttendanceSource" element
         */
        void setOrganisationSiteIdentifierEmergencyCareAttendanceSource(java.lang.String organisationSiteIdentifierEmergencyCareAttendanceSource);
        
        /**
         * Sets (as xml) the "OrganisationSiteIdentifier_EmergencyCareAttendanceSource" element
         */
        void xsetOrganisationSiteIdentifierEmergencyCareAttendanceSource(uk.nhs.nhsia.datastandards.ecds.AN59ECType organisationSiteIdentifierEmergencyCareAttendanceSource);
        
        /**
         * Unsets the "OrganisationSiteIdentifier_EmergencyCareAttendanceSource" element
         */
        void unsetOrganisationSiteIdentifierEmergencyCareAttendanceSource();
        
        /**
         * Gets the "EmergencyCareArrivalDate" element
         */
        java.util.Calendar getEmergencyCareArrivalDate();
        
        /**
         * Gets (as xml) the "EmergencyCareArrivalDate" element
         */
        uk.nhs.nhsia.datastandards.ecds.DateType xgetEmergencyCareArrivalDate();
        
        /**
         * Sets the "EmergencyCareArrivalDate" element
         */
        void setEmergencyCareArrivalDate(java.util.Calendar emergencyCareArrivalDate);
        
        /**
         * Sets (as xml) the "EmergencyCareArrivalDate" element
         */
        void xsetEmergencyCareArrivalDate(uk.nhs.nhsia.datastandards.ecds.DateType emergencyCareArrivalDate);
        
        /**
         * Gets the "EmergencyCareArrivalTime" element
         */
        java.util.Calendar getEmergencyCareArrivalTime();
        
        /**
         * Gets (as xml) the "EmergencyCareArrivalTime" element
         */
        uk.nhs.nhsia.datastandards.ecds.TimeType xgetEmergencyCareArrivalTime();
        
        /**
         * Sets the "EmergencyCareArrivalTime" element
         */
        void setEmergencyCareArrivalTime(java.util.Calendar emergencyCareArrivalTime);
        
        /**
         * Sets (as xml) the "EmergencyCareArrivalTime" element
         */
        void xsetEmergencyCareArrivalTime(uk.nhs.nhsia.datastandards.ecds.TimeType emergencyCareArrivalTime);
        
        /**
         * Gets the "AgeAtCdsActivityDate" element
         */
        int getAgeAtCdsActivityDate();
        
        /**
         * Gets (as xml) the "AgeAtCdsActivityDate" element
         */
        uk.nhs.nhsia.datastandards.ecds.AgeAtCDSActivityDateType xgetAgeAtCdsActivityDate();
        
        /**
         * Sets the "AgeAtCdsActivityDate" element
         */
        void setAgeAtCdsActivityDate(int ageAtCdsActivityDate);
        
        /**
         * Sets (as xml) the "AgeAtCdsActivityDate" element
         */
        void xsetAgeAtCdsActivityDate(uk.nhs.nhsia.datastandards.ecds.AgeAtCDSActivityDateType ageAtCdsActivityDate);
        
        /**
         * Gets the "EmergencyCareInitialAssessmentDate" element
         */
        java.util.Calendar getEmergencyCareInitialAssessmentDate();
        
        /**
         * Gets (as xml) the "EmergencyCareInitialAssessmentDate" element
         */
        uk.nhs.nhsia.datastandards.ecds.DateType xgetEmergencyCareInitialAssessmentDate();
        
        /**
         * True if has "EmergencyCareInitialAssessmentDate" element
         */
        boolean isSetEmergencyCareInitialAssessmentDate();
        
        /**
         * Sets the "EmergencyCareInitialAssessmentDate" element
         */
        void setEmergencyCareInitialAssessmentDate(java.util.Calendar emergencyCareInitialAssessmentDate);
        
        /**
         * Sets (as xml) the "EmergencyCareInitialAssessmentDate" element
         */
        void xsetEmergencyCareInitialAssessmentDate(uk.nhs.nhsia.datastandards.ecds.DateType emergencyCareInitialAssessmentDate);
        
        /**
         * Unsets the "EmergencyCareInitialAssessmentDate" element
         */
        void unsetEmergencyCareInitialAssessmentDate();
        
        /**
         * Gets the "EmergencyCareInitialAssessmentTime" element
         */
        java.util.Calendar getEmergencyCareInitialAssessmentTime();
        
        /**
         * Gets (as xml) the "EmergencyCareInitialAssessmentTime" element
         */
        uk.nhs.nhsia.datastandards.ecds.TimeType xgetEmergencyCareInitialAssessmentTime();
        
        /**
         * True if has "EmergencyCareInitialAssessmentTime" element
         */
        boolean isSetEmergencyCareInitialAssessmentTime();
        
        /**
         * Sets the "EmergencyCareInitialAssessmentTime" element
         */
        void setEmergencyCareInitialAssessmentTime(java.util.Calendar emergencyCareInitialAssessmentTime);
        
        /**
         * Sets (as xml) the "EmergencyCareInitialAssessmentTime" element
         */
        void xsetEmergencyCareInitialAssessmentTime(uk.nhs.nhsia.datastandards.ecds.TimeType emergencyCareInitialAssessmentTime);
        
        /**
         * Unsets the "EmergencyCareInitialAssessmentTime" element
         */
        void unsetEmergencyCareInitialAssessmentTime();
        
        /**
         * Gets the "EmergencyCareAcuity_SnomedCt" element
         */
        java.lang.String getEmergencyCareAcuitySnomedCt();
        
        /**
         * Gets (as xml) the "EmergencyCareAcuity_SnomedCt" element
         */
        uk.nhs.nhsia.datastandards.ecds.N618ECType xgetEmergencyCareAcuitySnomedCt();
        
        /**
         * True if has "EmergencyCareAcuity_SnomedCt" element
         */
        boolean isSetEmergencyCareAcuitySnomedCt();
        
        /**
         * Sets the "EmergencyCareAcuity_SnomedCt" element
         */
        void setEmergencyCareAcuitySnomedCt(java.lang.String emergencyCareAcuitySnomedCt);
        
        /**
         * Sets (as xml) the "EmergencyCareAcuity_SnomedCt" element
         */
        void xsetEmergencyCareAcuitySnomedCt(uk.nhs.nhsia.datastandards.ecds.N618ECType emergencyCareAcuitySnomedCt);
        
        /**
         * Unsets the "EmergencyCareAcuity_SnomedCt" element
         */
        void unsetEmergencyCareAcuitySnomedCt();
        
        /**
         * Gets the "EmergencyCareChiefComplaint_SnomedCt" element
         */
        java.lang.String getEmergencyCareChiefComplaintSnomedCt();
        
        /**
         * Gets (as xml) the "EmergencyCareChiefComplaint_SnomedCt" element
         */
        uk.nhs.nhsia.datastandards.ecds.N618ECType xgetEmergencyCareChiefComplaintSnomedCt();
        
        /**
         * True if has "EmergencyCareChiefComplaint_SnomedCt" element
         */
        boolean isSetEmergencyCareChiefComplaintSnomedCt();
        
        /**
         * Sets the "EmergencyCareChiefComplaint_SnomedCt" element
         */
        void setEmergencyCareChiefComplaintSnomedCt(java.lang.String emergencyCareChiefComplaintSnomedCt);
        
        /**
         * Sets (as xml) the "EmergencyCareChiefComplaint_SnomedCt" element
         */
        void xsetEmergencyCareChiefComplaintSnomedCt(uk.nhs.nhsia.datastandards.ecds.N618ECType emergencyCareChiefComplaintSnomedCt);
        
        /**
         * Unsets the "EmergencyCareChiefComplaint_SnomedCt" element
         */
        void unsetEmergencyCareChiefComplaintSnomedCt();
        
        /**
         * Gets the "EmergencyCareDateSeenForTreatment" element
         */
        java.util.Calendar getEmergencyCareDateSeenForTreatment();
        
        /**
         * Gets (as xml) the "EmergencyCareDateSeenForTreatment" element
         */
        uk.nhs.nhsia.datastandards.ecds.DateType xgetEmergencyCareDateSeenForTreatment();
        
        /**
         * True if has "EmergencyCareDateSeenForTreatment" element
         */
        boolean isSetEmergencyCareDateSeenForTreatment();
        
        /**
         * Sets the "EmergencyCareDateSeenForTreatment" element
         */
        void setEmergencyCareDateSeenForTreatment(java.util.Calendar emergencyCareDateSeenForTreatment);
        
        /**
         * Sets (as xml) the "EmergencyCareDateSeenForTreatment" element
         */
        void xsetEmergencyCareDateSeenForTreatment(uk.nhs.nhsia.datastandards.ecds.DateType emergencyCareDateSeenForTreatment);
        
        /**
         * Unsets the "EmergencyCareDateSeenForTreatment" element
         */
        void unsetEmergencyCareDateSeenForTreatment();
        
        /**
         * Gets the "EmergencyCareTimeSeenForTreatment" element
         */
        java.util.Calendar getEmergencyCareTimeSeenForTreatment();
        
        /**
         * Gets (as xml) the "EmergencyCareTimeSeenForTreatment" element
         */
        uk.nhs.nhsia.datastandards.ecds.TimeType xgetEmergencyCareTimeSeenForTreatment();
        
        /**
         * True if has "EmergencyCareTimeSeenForTreatment" element
         */
        boolean isSetEmergencyCareTimeSeenForTreatment();
        
        /**
         * Sets the "EmergencyCareTimeSeenForTreatment" element
         */
        void setEmergencyCareTimeSeenForTreatment(java.util.Calendar emergencyCareTimeSeenForTreatment);
        
        /**
         * Sets (as xml) the "EmergencyCareTimeSeenForTreatment" element
         */
        void xsetEmergencyCareTimeSeenForTreatment(uk.nhs.nhsia.datastandards.ecds.TimeType emergencyCareTimeSeenForTreatment);
        
        /**
         * Unsets the "EmergencyCareTimeSeenForTreatment" element
         */
        void unsetEmergencyCareTimeSeenForTreatment();
        
        /**
         * A factory class with static methods for creating instances
         * of this type.
         */
        
        public static final class Factory
        {
            public static uk.nhs.nhsia.datastandards.ecds.AttendanceOccurrenceECStructure.EmergencyCareAttendanceActivityCharacteristics newInstance() {
              return (uk.nhs.nhsia.datastandards.ecds.AttendanceOccurrenceECStructure.EmergencyCareAttendanceActivityCharacteristics) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().newInstance( type, null ); }
            
            public static uk.nhs.nhsia.datastandards.ecds.AttendanceOccurrenceECStructure.EmergencyCareAttendanceActivityCharacteristics newInstance(org.apache.xmlbeans.XmlOptions options) {
              return (uk.nhs.nhsia.datastandards.ecds.AttendanceOccurrenceECStructure.EmergencyCareAttendanceActivityCharacteristics) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().newInstance( type, options ); }
            
            private Factory() { } // No instance of this class allowed
        }
    }
    
    /**
     * An XML InjuryCharacteristics(@http://www.nhsia.nhs.uk/DataStandards/XMLschema/CDS/ns).
     *
     * This is a complex type.
     */
    public interface InjuryCharacteristics extends org.apache.xmlbeans.XmlObject
    {
        public static final org.apache.xmlbeans.SchemaType type = (org.apache.xmlbeans.SchemaType)
            org.apache.xmlbeans.XmlBeans.typeSystemForClassLoader(InjuryCharacteristics.class.getClassLoader(), "schemaorg_apache_xmlbeans.system.s30C1180FF47174E0C8A992A2D657328B").resolveHandle("injurycharacteristics701felemtype");
        
        /**
         * Gets the "InjuryDate" element
         */
        java.util.Calendar getInjuryDate();
        
        /**
         * Gets (as xml) the "InjuryDate" element
         */
        uk.nhs.nhsia.datastandards.ecds.DateType xgetInjuryDate();
        
        /**
         * Sets the "InjuryDate" element
         */
        void setInjuryDate(java.util.Calendar injuryDate);
        
        /**
         * Sets (as xml) the "InjuryDate" element
         */
        void xsetInjuryDate(uk.nhs.nhsia.datastandards.ecds.DateType injuryDate);
        
        /**
         * Gets the "InjuryTime" element
         */
        java.util.Calendar getInjuryTime();
        
        /**
         * Gets (as xml) the "InjuryTime" element
         */
        uk.nhs.nhsia.datastandards.ecds.TimeType xgetInjuryTime();
        
        /**
         * Sets the "InjuryTime" element
         */
        void setInjuryTime(java.util.Calendar injuryTime);
        
        /**
         * Sets (as xml) the "InjuryTime" element
         */
        void xsetInjuryTime(uk.nhs.nhsia.datastandards.ecds.TimeType injuryTime);
        
        /**
         * Gets the "EmergencyCarePlaceOfInjury_SnomedCt" element
         */
        java.lang.String getEmergencyCarePlaceOfInjurySnomedCt();
        
        /**
         * Gets (as xml) the "EmergencyCarePlaceOfInjury_SnomedCt" element
         */
        uk.nhs.nhsia.datastandards.ecds.N618ECType xgetEmergencyCarePlaceOfInjurySnomedCt();
        
        /**
         * True if has "EmergencyCarePlaceOfInjury_SnomedCt" element
         */
        boolean isSetEmergencyCarePlaceOfInjurySnomedCt();
        
        /**
         * Sets the "EmergencyCarePlaceOfInjury_SnomedCt" element
         */
        void setEmergencyCarePlaceOfInjurySnomedCt(java.lang.String emergencyCarePlaceOfInjurySnomedCt);
        
        /**
         * Sets (as xml) the "EmergencyCarePlaceOfInjury_SnomedCt" element
         */
        void xsetEmergencyCarePlaceOfInjurySnomedCt(uk.nhs.nhsia.datastandards.ecds.N618ECType emergencyCarePlaceOfInjurySnomedCt);
        
        /**
         * Unsets the "EmergencyCarePlaceOfInjury_SnomedCt" element
         */
        void unsetEmergencyCarePlaceOfInjurySnomedCt();
        
        /**
         * Gets the "EmergencyCarePlaceOfInjury_LatitudeAndLongitude" element
         */
        uk.nhs.nhsia.datastandards.ecds.AttendanceOccurrenceECStructure.InjuryCharacteristics.EmergencyCarePlaceOfInjuryLatitudeAndLongitude getEmergencyCarePlaceOfInjuryLatitudeAndLongitude();
        
        /**
         * True if has "EmergencyCarePlaceOfInjury_LatitudeAndLongitude" element
         */
        boolean isSetEmergencyCarePlaceOfInjuryLatitudeAndLongitude();
        
        /**
         * Sets the "EmergencyCarePlaceOfInjury_LatitudeAndLongitude" element
         */
        void setEmergencyCarePlaceOfInjuryLatitudeAndLongitude(uk.nhs.nhsia.datastandards.ecds.AttendanceOccurrenceECStructure.InjuryCharacteristics.EmergencyCarePlaceOfInjuryLatitudeAndLongitude emergencyCarePlaceOfInjuryLatitudeAndLongitude);
        
        /**
         * Appends and returns a new empty "EmergencyCarePlaceOfInjury_LatitudeAndLongitude" element
         */
        uk.nhs.nhsia.datastandards.ecds.AttendanceOccurrenceECStructure.InjuryCharacteristics.EmergencyCarePlaceOfInjuryLatitudeAndLongitude addNewEmergencyCarePlaceOfInjuryLatitudeAndLongitude();
        
        /**
         * Unsets the "EmergencyCarePlaceOfInjury_LatitudeAndLongitude" element
         */
        void unsetEmergencyCarePlaceOfInjuryLatitudeAndLongitude();
        
        /**
         * Gets the "EmergencyCareInjuryIntent_SnomedCt" element
         */
        java.lang.String getEmergencyCareInjuryIntentSnomedCt();
        
        /**
         * Gets (as xml) the "EmergencyCareInjuryIntent_SnomedCt" element
         */
        uk.nhs.nhsia.datastandards.ecds.N618ECType xgetEmergencyCareInjuryIntentSnomedCt();
        
        /**
         * True if has "EmergencyCareInjuryIntent_SnomedCt" element
         */
        boolean isSetEmergencyCareInjuryIntentSnomedCt();
        
        /**
         * Sets the "EmergencyCareInjuryIntent_SnomedCt" element
         */
        void setEmergencyCareInjuryIntentSnomedCt(java.lang.String emergencyCareInjuryIntentSnomedCt);
        
        /**
         * Sets (as xml) the "EmergencyCareInjuryIntent_SnomedCt" element
         */
        void xsetEmergencyCareInjuryIntentSnomedCt(uk.nhs.nhsia.datastandards.ecds.N618ECType emergencyCareInjuryIntentSnomedCt);
        
        /**
         * Unsets the "EmergencyCareInjuryIntent_SnomedCt" element
         */
        void unsetEmergencyCareInjuryIntentSnomedCt();
        
        /**
         * Gets the "EmergencyCareInjuryActivityStatus_SnomedCt" element
         */
        java.lang.String getEmergencyCareInjuryActivityStatusSnomedCt();
        
        /**
         * Gets (as xml) the "EmergencyCareInjuryActivityStatus_SnomedCt" element
         */
        uk.nhs.nhsia.datastandards.ecds.N618ECType xgetEmergencyCareInjuryActivityStatusSnomedCt();
        
        /**
         * True if has "EmergencyCareInjuryActivityStatus_SnomedCt" element
         */
        boolean isSetEmergencyCareInjuryActivityStatusSnomedCt();
        
        /**
         * Sets the "EmergencyCareInjuryActivityStatus_SnomedCt" element
         */
        void setEmergencyCareInjuryActivityStatusSnomedCt(java.lang.String emergencyCareInjuryActivityStatusSnomedCt);
        
        /**
         * Sets (as xml) the "EmergencyCareInjuryActivityStatus_SnomedCt" element
         */
        void xsetEmergencyCareInjuryActivityStatusSnomedCt(uk.nhs.nhsia.datastandards.ecds.N618ECType emergencyCareInjuryActivityStatusSnomedCt);
        
        /**
         * Unsets the "EmergencyCareInjuryActivityStatus_SnomedCt" element
         */
        void unsetEmergencyCareInjuryActivityStatusSnomedCt();
        
        /**
         * Gets the "EmergencyCareInjuryActivityType_SnomedCt" element
         */
        java.lang.String getEmergencyCareInjuryActivityTypeSnomedCt();
        
        /**
         * Gets (as xml) the "EmergencyCareInjuryActivityType_SnomedCt" element
         */
        uk.nhs.nhsia.datastandards.ecds.N618ECType xgetEmergencyCareInjuryActivityTypeSnomedCt();
        
        /**
         * True if has "EmergencyCareInjuryActivityType_SnomedCt" element
         */
        boolean isSetEmergencyCareInjuryActivityTypeSnomedCt();
        
        /**
         * Sets the "EmergencyCareInjuryActivityType_SnomedCt" element
         */
        void setEmergencyCareInjuryActivityTypeSnomedCt(java.lang.String emergencyCareInjuryActivityTypeSnomedCt);
        
        /**
         * Sets (as xml) the "EmergencyCareInjuryActivityType_SnomedCt" element
         */
        void xsetEmergencyCareInjuryActivityTypeSnomedCt(uk.nhs.nhsia.datastandards.ecds.N618ECType emergencyCareInjuryActivityTypeSnomedCt);
        
        /**
         * Unsets the "EmergencyCareInjuryActivityType_SnomedCt" element
         */
        void unsetEmergencyCareInjuryActivityTypeSnomedCt();
        
        /**
         * Gets the "EmergencyCareInjuryMechanism_SnomedCt" element
         */
        java.lang.String getEmergencyCareInjuryMechanismSnomedCt();
        
        /**
         * Gets (as xml) the "EmergencyCareInjuryMechanism_SnomedCt" element
         */
        uk.nhs.nhsia.datastandards.ecds.N618ECType xgetEmergencyCareInjuryMechanismSnomedCt();
        
        /**
         * True if has "EmergencyCareInjuryMechanism_SnomedCt" element
         */
        boolean isSetEmergencyCareInjuryMechanismSnomedCt();
        
        /**
         * Sets the "EmergencyCareInjuryMechanism_SnomedCt" element
         */
        void setEmergencyCareInjuryMechanismSnomedCt(java.lang.String emergencyCareInjuryMechanismSnomedCt);
        
        /**
         * Sets (as xml) the "EmergencyCareInjuryMechanism_SnomedCt" element
         */
        void xsetEmergencyCareInjuryMechanismSnomedCt(uk.nhs.nhsia.datastandards.ecds.N618ECType emergencyCareInjuryMechanismSnomedCt);
        
        /**
         * Unsets the "EmergencyCareInjuryMechanism_SnomedCt" element
         */
        void unsetEmergencyCareInjuryMechanismSnomedCt();
        
        /**
         * Gets array of all "EmergencyCareInjuryAlcoholOrDrugInvolvement_SnomedCt" elements
         */
        java.lang.String[] getEmergencyCareInjuryAlcoholOrDrugInvolvementSnomedCtArray();
        
        /**
         * Gets ith "EmergencyCareInjuryAlcoholOrDrugInvolvement_SnomedCt" element
         */
        java.lang.String getEmergencyCareInjuryAlcoholOrDrugInvolvementSnomedCtArray(int i);
        
        /**
         * Gets (as xml) array of all "EmergencyCareInjuryAlcoholOrDrugInvolvement_SnomedCt" elements
         */
        uk.nhs.nhsia.datastandards.ecds.N618ECType[] xgetEmergencyCareInjuryAlcoholOrDrugInvolvementSnomedCtArray();
        
        /**
         * Gets (as xml) ith "EmergencyCareInjuryAlcoholOrDrugInvolvement_SnomedCt" element
         */
        uk.nhs.nhsia.datastandards.ecds.N618ECType xgetEmergencyCareInjuryAlcoholOrDrugInvolvementSnomedCtArray(int i);
        
        /**
         * Returns number of "EmergencyCareInjuryAlcoholOrDrugInvolvement_SnomedCt" element
         */
        int sizeOfEmergencyCareInjuryAlcoholOrDrugInvolvementSnomedCtArray();
        
        /**
         * Sets array of all "EmergencyCareInjuryAlcoholOrDrugInvolvement_SnomedCt" element
         */
        void setEmergencyCareInjuryAlcoholOrDrugInvolvementSnomedCtArray(java.lang.String[] emergencyCareInjuryAlcoholOrDrugInvolvementSnomedCtArray);
        
        /**
         * Sets ith "EmergencyCareInjuryAlcoholOrDrugInvolvement_SnomedCt" element
         */
        void setEmergencyCareInjuryAlcoholOrDrugInvolvementSnomedCtArray(int i, java.lang.String emergencyCareInjuryAlcoholOrDrugInvolvementSnomedCt);
        
        /**
         * Sets (as xml) array of all "EmergencyCareInjuryAlcoholOrDrugInvolvement_SnomedCt" element
         */
        void xsetEmergencyCareInjuryAlcoholOrDrugInvolvementSnomedCtArray(uk.nhs.nhsia.datastandards.ecds.N618ECType[] emergencyCareInjuryAlcoholOrDrugInvolvementSnomedCtArray);
        
        /**
         * Sets (as xml) ith "EmergencyCareInjuryAlcoholOrDrugInvolvement_SnomedCt" element
         */
        void xsetEmergencyCareInjuryAlcoholOrDrugInvolvementSnomedCtArray(int i, uk.nhs.nhsia.datastandards.ecds.N618ECType emergencyCareInjuryAlcoholOrDrugInvolvementSnomedCt);
        
        /**
         * Inserts the value as the ith "EmergencyCareInjuryAlcoholOrDrugInvolvement_SnomedCt" element
         */
        void insertEmergencyCareInjuryAlcoholOrDrugInvolvementSnomedCt(int i, java.lang.String emergencyCareInjuryAlcoholOrDrugInvolvementSnomedCt);
        
        /**
         * Appends the value as the last "EmergencyCareInjuryAlcoholOrDrugInvolvement_SnomedCt" element
         */
        void addEmergencyCareInjuryAlcoholOrDrugInvolvementSnomedCt(java.lang.String emergencyCareInjuryAlcoholOrDrugInvolvementSnomedCt);
        
        /**
         * Inserts and returns a new empty value (as xml) as the ith "EmergencyCareInjuryAlcoholOrDrugInvolvement_SnomedCt" element
         */
        uk.nhs.nhsia.datastandards.ecds.N618ECType insertNewEmergencyCareInjuryAlcoholOrDrugInvolvementSnomedCt(int i);
        
        /**
         * Appends and returns a new empty value (as xml) as the last "EmergencyCareInjuryAlcoholOrDrugInvolvement_SnomedCt" element
         */
        uk.nhs.nhsia.datastandards.ecds.N618ECType addNewEmergencyCareInjuryAlcoholOrDrugInvolvementSnomedCt();
        
        /**
         * Removes the ith "EmergencyCareInjuryAlcoholOrDrugInvolvement_SnomedCt" element
         */
        void removeEmergencyCareInjuryAlcoholOrDrugInvolvementSnomedCt(int i);
        
        /**
         * An XML EmergencyCarePlaceOfInjury_LatitudeAndLongitude(@http://www.nhsia.nhs.uk/DataStandards/XMLschema/CDS/ns).
         *
         * This is a complex type.
         */
        public interface EmergencyCarePlaceOfInjuryLatitudeAndLongitude extends org.apache.xmlbeans.XmlObject
        {
            public static final org.apache.xmlbeans.SchemaType type = (org.apache.xmlbeans.SchemaType)
                org.apache.xmlbeans.XmlBeans.typeSystemForClassLoader(EmergencyCarePlaceOfInjuryLatitudeAndLongitude.class.getClassLoader(), "schemaorg_apache_xmlbeans.system.s30C1180FF47174E0C8A992A2D657328B").resolveHandle("emergencycareplaceofinjurylatitudeandlongitude8a83elemtype");
            
            /**
             * Gets the "Latitude" element
             */
            java.math.BigDecimal getLatitude();
            
            /**
             * Gets (as xml) the "Latitude" element
             */
            uk.nhs.nhsia.datastandards.ecds.AttendanceOccurrenceECStructure.InjuryCharacteristics.EmergencyCarePlaceOfInjuryLatitudeAndLongitude.Latitude xgetLatitude();
            
            /**
             * Sets the "Latitude" element
             */
            void setLatitude(java.math.BigDecimal latitude);
            
            /**
             * Sets (as xml) the "Latitude" element
             */
            void xsetLatitude(uk.nhs.nhsia.datastandards.ecds.AttendanceOccurrenceECStructure.InjuryCharacteristics.EmergencyCarePlaceOfInjuryLatitudeAndLongitude.Latitude latitude);
            
            /**
             * Gets the "Longitude" element
             */
            java.math.BigDecimal getLongitude();
            
            /**
             * Gets (as xml) the "Longitude" element
             */
            uk.nhs.nhsia.datastandards.ecds.AttendanceOccurrenceECStructure.InjuryCharacteristics.EmergencyCarePlaceOfInjuryLatitudeAndLongitude.Longitude xgetLongitude();
            
            /**
             * Sets the "Longitude" element
             */
            void setLongitude(java.math.BigDecimal longitude);
            
            /**
             * Sets (as xml) the "Longitude" element
             */
            void xsetLongitude(uk.nhs.nhsia.datastandards.ecds.AttendanceOccurrenceECStructure.InjuryCharacteristics.EmergencyCarePlaceOfInjuryLatitudeAndLongitude.Longitude longitude);
            
            /**
             * An XML Latitude(@http://www.nhsia.nhs.uk/DataStandards/XMLschema/CDS/ns).
             *
             * This is an atomic type that is a restriction of uk.nhs.nhsia.datastandards.ecds.AttendanceOccurrenceECStructure$InjuryCharacteristics$EmergencyCarePlaceOfInjuryLatitudeAndLongitude$Latitude.
             */
            public interface Latitude extends org.apache.xmlbeans.XmlDecimal
            {
                public static final org.apache.xmlbeans.SchemaType type = (org.apache.xmlbeans.SchemaType)
                    org.apache.xmlbeans.XmlBeans.typeSystemForClassLoader(Latitude.class.getClassLoader(), "schemaorg_apache_xmlbeans.system.s30C1180FF47174E0C8A992A2D657328B").resolveHandle("latitude225belemtype");
                
                /**
                 * A factory class with static methods for creating instances
                 * of this type.
                 */
                
                public static final class Factory
                {
                    public static uk.nhs.nhsia.datastandards.ecds.AttendanceOccurrenceECStructure.InjuryCharacteristics.EmergencyCarePlaceOfInjuryLatitudeAndLongitude.Latitude newValue(java.lang.Object obj) {
                      return (uk.nhs.nhsia.datastandards.ecds.AttendanceOccurrenceECStructure.InjuryCharacteristics.EmergencyCarePlaceOfInjuryLatitudeAndLongitude.Latitude) type.newValue( obj ); }
                    
                    public static uk.nhs.nhsia.datastandards.ecds.AttendanceOccurrenceECStructure.InjuryCharacteristics.EmergencyCarePlaceOfInjuryLatitudeAndLongitude.Latitude newInstance() {
                      return (uk.nhs.nhsia.datastandards.ecds.AttendanceOccurrenceECStructure.InjuryCharacteristics.EmergencyCarePlaceOfInjuryLatitudeAndLongitude.Latitude) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().newInstance( type, null ); }
                    
                    public static uk.nhs.nhsia.datastandards.ecds.AttendanceOccurrenceECStructure.InjuryCharacteristics.EmergencyCarePlaceOfInjuryLatitudeAndLongitude.Latitude newInstance(org.apache.xmlbeans.XmlOptions options) {
                      return (uk.nhs.nhsia.datastandards.ecds.AttendanceOccurrenceECStructure.InjuryCharacteristics.EmergencyCarePlaceOfInjuryLatitudeAndLongitude.Latitude) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().newInstance( type, options ); }
                    
                    private Factory() { } // No instance of this class allowed
                }
            }
            
            /**
             * An XML Longitude(@http://www.nhsia.nhs.uk/DataStandards/XMLschema/CDS/ns).
             *
             * This is an atomic type that is a restriction of uk.nhs.nhsia.datastandards.ecds.AttendanceOccurrenceECStructure$InjuryCharacteristics$EmergencyCarePlaceOfInjuryLatitudeAndLongitude$Longitude.
             */
            public interface Longitude extends org.apache.xmlbeans.XmlDecimal
            {
                public static final org.apache.xmlbeans.SchemaType type = (org.apache.xmlbeans.SchemaType)
                    org.apache.xmlbeans.XmlBeans.typeSystemForClassLoader(Longitude.class.getClassLoader(), "schemaorg_apache_xmlbeans.system.s30C1180FF47174E0C8A992A2D657328B").resolveHandle("longitude5f68elemtype");
                
                /**
                 * A factory class with static methods for creating instances
                 * of this type.
                 */
                
                public static final class Factory
                {
                    public static uk.nhs.nhsia.datastandards.ecds.AttendanceOccurrenceECStructure.InjuryCharacteristics.EmergencyCarePlaceOfInjuryLatitudeAndLongitude.Longitude newValue(java.lang.Object obj) {
                      return (uk.nhs.nhsia.datastandards.ecds.AttendanceOccurrenceECStructure.InjuryCharacteristics.EmergencyCarePlaceOfInjuryLatitudeAndLongitude.Longitude) type.newValue( obj ); }
                    
                    public static uk.nhs.nhsia.datastandards.ecds.AttendanceOccurrenceECStructure.InjuryCharacteristics.EmergencyCarePlaceOfInjuryLatitudeAndLongitude.Longitude newInstance() {
                      return (uk.nhs.nhsia.datastandards.ecds.AttendanceOccurrenceECStructure.InjuryCharacteristics.EmergencyCarePlaceOfInjuryLatitudeAndLongitude.Longitude) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().newInstance( type, null ); }
                    
                    public static uk.nhs.nhsia.datastandards.ecds.AttendanceOccurrenceECStructure.InjuryCharacteristics.EmergencyCarePlaceOfInjuryLatitudeAndLongitude.Longitude newInstance(org.apache.xmlbeans.XmlOptions options) {
                      return (uk.nhs.nhsia.datastandards.ecds.AttendanceOccurrenceECStructure.InjuryCharacteristics.EmergencyCarePlaceOfInjuryLatitudeAndLongitude.Longitude) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().newInstance( type, options ); }
                    
                    private Factory() { } // No instance of this class allowed
                }
            }
            
            /**
             * A factory class with static methods for creating instances
             * of this type.
             */
            
            public static final class Factory
            {
                public static uk.nhs.nhsia.datastandards.ecds.AttendanceOccurrenceECStructure.InjuryCharacteristics.EmergencyCarePlaceOfInjuryLatitudeAndLongitude newInstance() {
                  return (uk.nhs.nhsia.datastandards.ecds.AttendanceOccurrenceECStructure.InjuryCharacteristics.EmergencyCarePlaceOfInjuryLatitudeAndLongitude) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().newInstance( type, null ); }
                
                public static uk.nhs.nhsia.datastandards.ecds.AttendanceOccurrenceECStructure.InjuryCharacteristics.EmergencyCarePlaceOfInjuryLatitudeAndLongitude newInstance(org.apache.xmlbeans.XmlOptions options) {
                  return (uk.nhs.nhsia.datastandards.ecds.AttendanceOccurrenceECStructure.InjuryCharacteristics.EmergencyCarePlaceOfInjuryLatitudeAndLongitude) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().newInstance( type, options ); }
                
                private Factory() { } // No instance of this class allowed
            }
        }
        
        /**
         * A factory class with static methods for creating instances
         * of this type.
         */
        
        public static final class Factory
        {
            public static uk.nhs.nhsia.datastandards.ecds.AttendanceOccurrenceECStructure.InjuryCharacteristics newInstance() {
              return (uk.nhs.nhsia.datastandards.ecds.AttendanceOccurrenceECStructure.InjuryCharacteristics) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().newInstance( type, null ); }
            
            public static uk.nhs.nhsia.datastandards.ecds.AttendanceOccurrenceECStructure.InjuryCharacteristics newInstance(org.apache.xmlbeans.XmlOptions options) {
              return (uk.nhs.nhsia.datastandards.ecds.AttendanceOccurrenceECStructure.InjuryCharacteristics) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().newInstance( type, options ); }
            
            private Factory() { } // No instance of this class allowed
        }
    }
    
    /**
     * An XML PatientClinicalHistory(@http://www.nhsia.nhs.uk/DataStandards/XMLschema/CDS/ns).
     *
     * This is a complex type.
     */
    public interface PatientClinicalHistory extends org.apache.xmlbeans.XmlObject
    {
        public static final org.apache.xmlbeans.SchemaType type = (org.apache.xmlbeans.SchemaType)
            org.apache.xmlbeans.XmlBeans.typeSystemForClassLoader(PatientClinicalHistory.class.getClassLoader(), "schemaorg_apache_xmlbeans.system.s30C1180FF47174E0C8A992A2D657328B").resolveHandle("patientclinicalhistoryca54elemtype");
        
        /**
         * Gets array of all "Comorbidity_SnomedCt" elements
         */
        java.lang.String[] getComorbiditySnomedCtArray();
        
        /**
         * Gets ith "Comorbidity_SnomedCt" element
         */
        java.lang.String getComorbiditySnomedCtArray(int i);
        
        /**
         * Gets (as xml) array of all "Comorbidity_SnomedCt" elements
         */
        uk.nhs.nhsia.datastandards.ecds.N618ECType[] xgetComorbiditySnomedCtArray();
        
        /**
         * Gets (as xml) ith "Comorbidity_SnomedCt" element
         */
        uk.nhs.nhsia.datastandards.ecds.N618ECType xgetComorbiditySnomedCtArray(int i);
        
        /**
         * Returns number of "Comorbidity_SnomedCt" element
         */
        int sizeOfComorbiditySnomedCtArray();
        
        /**
         * Sets array of all "Comorbidity_SnomedCt" element
         */
        void setComorbiditySnomedCtArray(java.lang.String[] comorbiditySnomedCtArray);
        
        /**
         * Sets ith "Comorbidity_SnomedCt" element
         */
        void setComorbiditySnomedCtArray(int i, java.lang.String comorbiditySnomedCt);
        
        /**
         * Sets (as xml) array of all "Comorbidity_SnomedCt" element
         */
        void xsetComorbiditySnomedCtArray(uk.nhs.nhsia.datastandards.ecds.N618ECType[] comorbiditySnomedCtArray);
        
        /**
         * Sets (as xml) ith "Comorbidity_SnomedCt" element
         */
        void xsetComorbiditySnomedCtArray(int i, uk.nhs.nhsia.datastandards.ecds.N618ECType comorbiditySnomedCt);
        
        /**
         * Inserts the value as the ith "Comorbidity_SnomedCt" element
         */
        void insertComorbiditySnomedCt(int i, java.lang.String comorbiditySnomedCt);
        
        /**
         * Appends the value as the last "Comorbidity_SnomedCt" element
         */
        void addComorbiditySnomedCt(java.lang.String comorbiditySnomedCt);
        
        /**
         * Inserts and returns a new empty value (as xml) as the ith "Comorbidity_SnomedCt" element
         */
        uk.nhs.nhsia.datastandards.ecds.N618ECType insertNewComorbiditySnomedCt(int i);
        
        /**
         * Appends and returns a new empty value (as xml) as the last "Comorbidity_SnomedCt" element
         */
        uk.nhs.nhsia.datastandards.ecds.N618ECType addNewComorbiditySnomedCt();
        
        /**
         * Removes the ith "Comorbidity_SnomedCt" element
         */
        void removeComorbiditySnomedCt(int i);
        
        /**
         * A factory class with static methods for creating instances
         * of this type.
         */
        
        public static final class Factory
        {
            public static uk.nhs.nhsia.datastandards.ecds.AttendanceOccurrenceECStructure.PatientClinicalHistory newInstance() {
              return (uk.nhs.nhsia.datastandards.ecds.AttendanceOccurrenceECStructure.PatientClinicalHistory) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().newInstance( type, null ); }
            
            public static uk.nhs.nhsia.datastandards.ecds.AttendanceOccurrenceECStructure.PatientClinicalHistory newInstance(org.apache.xmlbeans.XmlOptions options) {
              return (uk.nhs.nhsia.datastandards.ecds.AttendanceOccurrenceECStructure.PatientClinicalHistory) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().newInstance( type, options ); }
            
            private Factory() { } // No instance of this class allowed
        }
    }
    
    /**
     * An XML ServiceAgreementDetails(@http://www.nhsia.nhs.uk/DataStandards/XMLschema/CDS/ns).
     *
     * This is a complex type.
     */
    public interface ServiceAgreementDetails extends org.apache.xmlbeans.XmlObject
    {
        public static final org.apache.xmlbeans.SchemaType type = (org.apache.xmlbeans.SchemaType)
            org.apache.xmlbeans.XmlBeans.typeSystemForClassLoader(ServiceAgreementDetails.class.getClassLoader(), "schemaorg_apache_xmlbeans.system.s30C1180FF47174E0C8A992A2D657328B").resolveHandle("serviceagreementdetails7ab3elemtype");
        
        /**
         * Gets the "CommissioningSerialNumber" element
         */
        java.lang.String getCommissioningSerialNumber();
        
        /**
         * Gets (as xml) the "CommissioningSerialNumber" element
         */
        uk.nhs.nhsia.datastandards.ecds.CommissioningSerialNumberType xgetCommissioningSerialNumber();
        
        /**
         * True if has "CommissioningSerialNumber" element
         */
        boolean isSetCommissioningSerialNumber();
        
        /**
         * Sets the "CommissioningSerialNumber" element
         */
        void setCommissioningSerialNumber(java.lang.String commissioningSerialNumber);
        
        /**
         * Sets (as xml) the "CommissioningSerialNumber" element
         */
        void xsetCommissioningSerialNumber(uk.nhs.nhsia.datastandards.ecds.CommissioningSerialNumberType commissioningSerialNumber);
        
        /**
         * Unsets the "CommissioningSerialNumber" element
         */
        void unsetCommissioningSerialNumber();
        
        /**
         * Gets the "NhsServiceAgreementLineNumber" element
         */
        java.lang.String getNhsServiceAgreementLineNumber();
        
        /**
         * Gets (as xml) the "NhsServiceAgreementLineNumber" element
         */
        uk.nhs.nhsia.datastandards.ecds.NHSServiceAgreementLineNumberType xgetNhsServiceAgreementLineNumber();
        
        /**
         * True if has "NhsServiceAgreementLineNumber" element
         */
        boolean isSetNhsServiceAgreementLineNumber();
        
        /**
         * Sets the "NhsServiceAgreementLineNumber" element
         */
        void setNhsServiceAgreementLineNumber(java.lang.String nhsServiceAgreementLineNumber);
        
        /**
         * Sets (as xml) the "NhsServiceAgreementLineNumber" element
         */
        void xsetNhsServiceAgreementLineNumber(uk.nhs.nhsia.datastandards.ecds.NHSServiceAgreementLineNumberType nhsServiceAgreementLineNumber);
        
        /**
         * Unsets the "NhsServiceAgreementLineNumber" element
         */
        void unsetNhsServiceAgreementLineNumber();
        
        /**
         * Gets the "ProviderReferenceNumber" element
         */
        java.lang.String getProviderReferenceNumber();
        
        /**
         * Gets (as xml) the "ProviderReferenceNumber" element
         */
        uk.nhs.nhsia.datastandards.ecds.ProviderReferenceNumberType xgetProviderReferenceNumber();
        
        /**
         * True if has "ProviderReferenceNumber" element
         */
        boolean isSetProviderReferenceNumber();
        
        /**
         * Sets the "ProviderReferenceNumber" element
         */
        void setProviderReferenceNumber(java.lang.String providerReferenceNumber);
        
        /**
         * Sets (as xml) the "ProviderReferenceNumber" element
         */
        void xsetProviderReferenceNumber(uk.nhs.nhsia.datastandards.ecds.ProviderReferenceNumberType providerReferenceNumber);
        
        /**
         * Unsets the "ProviderReferenceNumber" element
         */
        void unsetProviderReferenceNumber();
        
        /**
         * Gets the "CommissionerReferenceNumber" element
         */
        java.lang.String getCommissionerReferenceNumber();
        
        /**
         * Gets (as xml) the "CommissionerReferenceNumber" element
         */
        uk.nhs.nhsia.datastandards.ecds.CommissionerReferenceNumberType xgetCommissionerReferenceNumber();
        
        /**
         * True if has "CommissionerReferenceNumber" element
         */
        boolean isSetCommissionerReferenceNumber();
        
        /**
         * Sets the "CommissionerReferenceNumber" element
         */
        void setCommissionerReferenceNumber(java.lang.String commissionerReferenceNumber);
        
        /**
         * Sets (as xml) the "CommissionerReferenceNumber" element
         */
        void xsetCommissionerReferenceNumber(uk.nhs.nhsia.datastandards.ecds.CommissionerReferenceNumberType commissionerReferenceNumber);
        
        /**
         * Unsets the "CommissionerReferenceNumber" element
         */
        void unsetCommissionerReferenceNumber();
        
        /**
         * Gets the "OrganisationIdentifier_CodeOfProvider" element
         */
        java.lang.String getOrganisationIdentifierCodeOfProvider();
        
        /**
         * Gets (as xml) the "OrganisationIdentifier_CodeOfProvider" element
         */
        uk.nhs.nhsia.datastandards.ecds.AN35ECType xgetOrganisationIdentifierCodeOfProvider();
        
        /**
         * Sets the "OrganisationIdentifier_CodeOfProvider" element
         */
        void setOrganisationIdentifierCodeOfProvider(java.lang.String organisationIdentifierCodeOfProvider);
        
        /**
         * Sets (as xml) the "OrganisationIdentifier_CodeOfProvider" element
         */
        void xsetOrganisationIdentifierCodeOfProvider(uk.nhs.nhsia.datastandards.ecds.AN35ECType organisationIdentifierCodeOfProvider);
        
        /**
         * Gets the "OrganisationIdentifier_CodeOfCommissioner" element
         */
        java.lang.String getOrganisationIdentifierCodeOfCommissioner();
        
        /**
         * Gets (as xml) the "OrganisationIdentifier_CodeOfCommissioner" element
         */
        uk.nhs.nhsia.datastandards.ecds.AN35ECType xgetOrganisationIdentifierCodeOfCommissioner();
        
        /**
         * Sets the "OrganisationIdentifier_CodeOfCommissioner" element
         */
        void setOrganisationIdentifierCodeOfCommissioner(java.lang.String organisationIdentifierCodeOfCommissioner);
        
        /**
         * Sets (as xml) the "OrganisationIdentifier_CodeOfCommissioner" element
         */
        void xsetOrganisationIdentifierCodeOfCommissioner(uk.nhs.nhsia.datastandards.ecds.AN35ECType organisationIdentifierCodeOfCommissioner);
        
        /**
         * A factory class with static methods for creating instances
         * of this type.
         */
        
        public static final class Factory
        {
            public static uk.nhs.nhsia.datastandards.ecds.AttendanceOccurrenceECStructure.ServiceAgreementDetails newInstance() {
              return (uk.nhs.nhsia.datastandards.ecds.AttendanceOccurrenceECStructure.ServiceAgreementDetails) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().newInstance( type, null ); }
            
            public static uk.nhs.nhsia.datastandards.ecds.AttendanceOccurrenceECStructure.ServiceAgreementDetails newInstance(org.apache.xmlbeans.XmlOptions options) {
              return (uk.nhs.nhsia.datastandards.ecds.AttendanceOccurrenceECStructure.ServiceAgreementDetails) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().newInstance( type, options ); }
            
            private Factory() { } // No instance of this class allowed
        }
    }
    
    /**
     * An XML CareProfessionals_EmergencyCare(@http://www.nhsia.nhs.uk/DataStandards/XMLschema/CDS/ns).
     *
     * This is a complex type.
     */
    public interface CareProfessionalsEmergencyCare extends org.apache.xmlbeans.XmlObject
    {
        public static final org.apache.xmlbeans.SchemaType type = (org.apache.xmlbeans.SchemaType)
            org.apache.xmlbeans.XmlBeans.typeSystemForClassLoader(CareProfessionalsEmergencyCare.class.getClassLoader(), "schemaorg_apache_xmlbeans.system.s30C1180FF47174E0C8A992A2D657328B").resolveHandle("careprofessionalsemergencycare4f42elemtype");
        
        /**
         * Gets the "ProfessionalRegistrationIssuerCode" element
         */
        uk.nhs.nhsia.datastandards.ecds.ProfessionalRegistrationIssuerCodeECType.Enum getProfessionalRegistrationIssuerCode();
        
        /**
         * Gets (as xml) the "ProfessionalRegistrationIssuerCode" element
         */
        uk.nhs.nhsia.datastandards.ecds.ProfessionalRegistrationIssuerCodeECType xgetProfessionalRegistrationIssuerCode();
        
        /**
         * Sets the "ProfessionalRegistrationIssuerCode" element
         */
        void setProfessionalRegistrationIssuerCode(uk.nhs.nhsia.datastandards.ecds.ProfessionalRegistrationIssuerCodeECType.Enum professionalRegistrationIssuerCode);
        
        /**
         * Sets (as xml) the "ProfessionalRegistrationIssuerCode" element
         */
        void xsetProfessionalRegistrationIssuerCode(uk.nhs.nhsia.datastandards.ecds.ProfessionalRegistrationIssuerCodeECType professionalRegistrationIssuerCode);
        
        /**
         * Gets the "ProfessionalRegistrationEntryIdentifier" element
         */
        java.lang.String getProfessionalRegistrationEntryIdentifier();
        
        /**
         * Gets (as xml) the "ProfessionalRegistrationEntryIdentifier" element
         */
        uk.nhs.nhsia.datastandards.ecds.ANMin1Max32ECType xgetProfessionalRegistrationEntryIdentifier();
        
        /**
         * Sets the "ProfessionalRegistrationEntryIdentifier" element
         */
        void setProfessionalRegistrationEntryIdentifier(java.lang.String professionalRegistrationEntryIdentifier);
        
        /**
         * Sets (as xml) the "ProfessionalRegistrationEntryIdentifier" element
         */
        void xsetProfessionalRegistrationEntryIdentifier(uk.nhs.nhsia.datastandards.ecds.ANMin1Max32ECType professionalRegistrationEntryIdentifier);
        
        /**
         * Gets the "CareProfessionalTier_EmergencyCare" element
         */
        uk.nhs.nhsia.datastandards.ecds.CareProfessionalTierECType.Enum getCareProfessionalTierEmergencyCare();
        
        /**
         * Gets (as xml) the "CareProfessionalTier_EmergencyCare" element
         */
        uk.nhs.nhsia.datastandards.ecds.CareProfessionalTierECType xgetCareProfessionalTierEmergencyCare();
        
        /**
         * Sets the "CareProfessionalTier_EmergencyCare" element
         */
        void setCareProfessionalTierEmergencyCare(uk.nhs.nhsia.datastandards.ecds.CareProfessionalTierECType.Enum careProfessionalTierEmergencyCare);
        
        /**
         * Sets (as xml) the "CareProfessionalTier_EmergencyCare" element
         */
        void xsetCareProfessionalTierEmergencyCare(uk.nhs.nhsia.datastandards.ecds.CareProfessionalTierECType careProfessionalTierEmergencyCare);
        
        /**
         * Gets the "CareProfessionalDischargeResponsibilityIndicator_EmergencyCare" element
         */
        uk.nhs.nhsia.datastandards.ecds.YesNoECType.Enum getCareProfessionalDischargeResponsibilityIndicatorEmergencyCare();
        
        /**
         * Gets (as xml) the "CareProfessionalDischargeResponsibilityIndicator_EmergencyCare" element
         */
        uk.nhs.nhsia.datastandards.ecds.YesNoECType xgetCareProfessionalDischargeResponsibilityIndicatorEmergencyCare();
        
        /**
         * Sets the "CareProfessionalDischargeResponsibilityIndicator_EmergencyCare" element
         */
        void setCareProfessionalDischargeResponsibilityIndicatorEmergencyCare(uk.nhs.nhsia.datastandards.ecds.YesNoECType.Enum careProfessionalDischargeResponsibilityIndicatorEmergencyCare);
        
        /**
         * Sets (as xml) the "CareProfessionalDischargeResponsibilityIndicator_EmergencyCare" element
         */
        void xsetCareProfessionalDischargeResponsibilityIndicatorEmergencyCare(uk.nhs.nhsia.datastandards.ecds.YesNoECType careProfessionalDischargeResponsibilityIndicatorEmergencyCare);
        
        /**
         * A factory class with static methods for creating instances
         * of this type.
         */
        
        public static final class Factory
        {
            public static uk.nhs.nhsia.datastandards.ecds.AttendanceOccurrenceECStructure.CareProfessionalsEmergencyCare newInstance() {
              return (uk.nhs.nhsia.datastandards.ecds.AttendanceOccurrenceECStructure.CareProfessionalsEmergencyCare) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().newInstance( type, null ); }
            
            public static uk.nhs.nhsia.datastandards.ecds.AttendanceOccurrenceECStructure.CareProfessionalsEmergencyCare newInstance(org.apache.xmlbeans.XmlOptions options) {
              return (uk.nhs.nhsia.datastandards.ecds.AttendanceOccurrenceECStructure.CareProfessionalsEmergencyCare) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().newInstance( type, options ); }
            
            private Factory() { } // No instance of this class allowed
        }
    }
    
    /**
     * An XML EmergencyCareDiagnoses_SnomedCt(@http://www.nhsia.nhs.uk/DataStandards/XMLschema/CDS/ns).
     *
     * This is a complex type.
     */
    public interface EmergencyCareDiagnosesSnomedCt extends org.apache.xmlbeans.XmlObject
    {
        public static final org.apache.xmlbeans.SchemaType type = (org.apache.xmlbeans.SchemaType)
            org.apache.xmlbeans.XmlBeans.typeSystemForClassLoader(EmergencyCareDiagnosesSnomedCt.class.getClassLoader(), "schemaorg_apache_xmlbeans.system.s30C1180FF47174E0C8A992A2D657328B").resolveHandle("emergencycarediagnosessnomedcta66belemtype");
        
        /**
         * Gets the "EmergencyCareDiagnosis_SnomedCt" element
         */
        java.lang.String getEmergencyCareDiagnosisSnomedCt();
        
        /**
         * Gets (as xml) the "EmergencyCareDiagnosis_SnomedCt" element
         */
        uk.nhs.nhsia.datastandards.ecds.N618ECType xgetEmergencyCareDiagnosisSnomedCt();
        
        /**
         * Sets the "EmergencyCareDiagnosis_SnomedCt" element
         */
        void setEmergencyCareDiagnosisSnomedCt(java.lang.String emergencyCareDiagnosisSnomedCt);
        
        /**
         * Sets (as xml) the "EmergencyCareDiagnosis_SnomedCt" element
         */
        void xsetEmergencyCareDiagnosisSnomedCt(uk.nhs.nhsia.datastandards.ecds.N618ECType emergencyCareDiagnosisSnomedCt);
        
        /**
         * Gets the "CodedClinicalEntrySequenceNumber" element
         */
        java.lang.String getCodedClinicalEntrySequenceNumber();
        
        /**
         * Gets (as xml) the "CodedClinicalEntrySequenceNumber" element
         */
        uk.nhs.nhsia.datastandards.ecds.N1N5ECType xgetCodedClinicalEntrySequenceNumber();
        
        /**
         * Sets the "CodedClinicalEntrySequenceNumber" element
         */
        void setCodedClinicalEntrySequenceNumber(java.lang.String codedClinicalEntrySequenceNumber);
        
        /**
         * Sets (as xml) the "CodedClinicalEntrySequenceNumber" element
         */
        void xsetCodedClinicalEntrySequenceNumber(uk.nhs.nhsia.datastandards.ecds.N1N5ECType codedClinicalEntrySequenceNumber);
        
        /**
         * Gets the "EmergencyCareDiagnosisQualifier_SnomedCt" element
         */
        java.lang.String getEmergencyCareDiagnosisQualifierSnomedCt();
        
        /**
         * Gets (as xml) the "EmergencyCareDiagnosisQualifier_SnomedCt" element
         */
        uk.nhs.nhsia.datastandards.ecds.N618ECType xgetEmergencyCareDiagnosisQualifierSnomedCt();
        
        /**
         * Sets the "EmergencyCareDiagnosisQualifier_SnomedCt" element
         */
        void setEmergencyCareDiagnosisQualifierSnomedCt(java.lang.String emergencyCareDiagnosisQualifierSnomedCt);
        
        /**
         * Sets (as xml) the "EmergencyCareDiagnosisQualifier_SnomedCt" element
         */
        void xsetEmergencyCareDiagnosisQualifierSnomedCt(uk.nhs.nhsia.datastandards.ecds.N618ECType emergencyCareDiagnosisQualifierSnomedCt);
        
        /**
         * A factory class with static methods for creating instances
         * of this type.
         */
        
        public static final class Factory
        {
            public static uk.nhs.nhsia.datastandards.ecds.AttendanceOccurrenceECStructure.EmergencyCareDiagnosesSnomedCt newInstance() {
              return (uk.nhs.nhsia.datastandards.ecds.AttendanceOccurrenceECStructure.EmergencyCareDiagnosesSnomedCt) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().newInstance( type, null ); }
            
            public static uk.nhs.nhsia.datastandards.ecds.AttendanceOccurrenceECStructure.EmergencyCareDiagnosesSnomedCt newInstance(org.apache.xmlbeans.XmlOptions options) {
              return (uk.nhs.nhsia.datastandards.ecds.AttendanceOccurrenceECStructure.EmergencyCareDiagnosesSnomedCt) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().newInstance( type, options ); }
            
            private Factory() { } // No instance of this class allowed
        }
    }
    
    /**
     * An XML EmergencyCareInvestigations_SnomedCt(@http://www.nhsia.nhs.uk/DataStandards/XMLschema/CDS/ns).
     *
     * This is a complex type.
     */
    public interface EmergencyCareInvestigationsSnomedCt extends org.apache.xmlbeans.XmlObject
    {
        public static final org.apache.xmlbeans.SchemaType type = (org.apache.xmlbeans.SchemaType)
            org.apache.xmlbeans.XmlBeans.typeSystemForClassLoader(EmergencyCareInvestigationsSnomedCt.class.getClassLoader(), "schemaorg_apache_xmlbeans.system.s30C1180FF47174E0C8A992A2D657328B").resolveHandle("emergencycareinvestigationssnomedct8e3belemtype");
        
        /**
         * Gets the "EmergencyCareClinicalInvestigation_SnomedCt" element
         */
        java.lang.String getEmergencyCareClinicalInvestigationSnomedCt();
        
        /**
         * Gets (as xml) the "EmergencyCareClinicalInvestigation_SnomedCt" element
         */
        uk.nhs.nhsia.datastandards.ecds.N618ECType xgetEmergencyCareClinicalInvestigationSnomedCt();
        
        /**
         * Sets the "EmergencyCareClinicalInvestigation_SnomedCt" element
         */
        void setEmergencyCareClinicalInvestigationSnomedCt(java.lang.String emergencyCareClinicalInvestigationSnomedCt);
        
        /**
         * Sets (as xml) the "EmergencyCareClinicalInvestigation_SnomedCt" element
         */
        void xsetEmergencyCareClinicalInvestigationSnomedCt(uk.nhs.nhsia.datastandards.ecds.N618ECType emergencyCareClinicalInvestigationSnomedCt);
        
        /**
         * Gets the "ProcedureDate_EmergencyCareClinicalInvestigation" element
         */
        java.util.Calendar getProcedureDateEmergencyCareClinicalInvestigation();
        
        /**
         * Gets (as xml) the "ProcedureDate_EmergencyCareClinicalInvestigation" element
         */
        uk.nhs.nhsia.datastandards.ecds.DateType xgetProcedureDateEmergencyCareClinicalInvestigation();
        
        /**
         * True if has "ProcedureDate_EmergencyCareClinicalInvestigation" element
         */
        boolean isSetProcedureDateEmergencyCareClinicalInvestigation();
        
        /**
         * Sets the "ProcedureDate_EmergencyCareClinicalInvestigation" element
         */
        void setProcedureDateEmergencyCareClinicalInvestigation(java.util.Calendar procedureDateEmergencyCareClinicalInvestigation);
        
        /**
         * Sets (as xml) the "ProcedureDate_EmergencyCareClinicalInvestigation" element
         */
        void xsetProcedureDateEmergencyCareClinicalInvestigation(uk.nhs.nhsia.datastandards.ecds.DateType procedureDateEmergencyCareClinicalInvestigation);
        
        /**
         * Unsets the "ProcedureDate_EmergencyCareClinicalInvestigation" element
         */
        void unsetProcedureDateEmergencyCareClinicalInvestigation();
        
        /**
         * Gets the "ProcedureTime_EmergencyCareClinicalInvestigation" element
         */
        java.util.Calendar getProcedureTimeEmergencyCareClinicalInvestigation();
        
        /**
         * Gets (as xml) the "ProcedureTime_EmergencyCareClinicalInvestigation" element
         */
        uk.nhs.nhsia.datastandards.ecds.TimeType xgetProcedureTimeEmergencyCareClinicalInvestigation();
        
        /**
         * True if has "ProcedureTime_EmergencyCareClinicalInvestigation" element
         */
        boolean isSetProcedureTimeEmergencyCareClinicalInvestigation();
        
        /**
         * Sets the "ProcedureTime_EmergencyCareClinicalInvestigation" element
         */
        void setProcedureTimeEmergencyCareClinicalInvestigation(java.util.Calendar procedureTimeEmergencyCareClinicalInvestigation);
        
        /**
         * Sets (as xml) the "ProcedureTime_EmergencyCareClinicalInvestigation" element
         */
        void xsetProcedureTimeEmergencyCareClinicalInvestigation(uk.nhs.nhsia.datastandards.ecds.TimeType procedureTimeEmergencyCareClinicalInvestigation);
        
        /**
         * Unsets the "ProcedureTime_EmergencyCareClinicalInvestigation" element
         */
        void unsetProcedureTimeEmergencyCareClinicalInvestigation();
        
        /**
         * A factory class with static methods for creating instances
         * of this type.
         */
        
        public static final class Factory
        {
            public static uk.nhs.nhsia.datastandards.ecds.AttendanceOccurrenceECStructure.EmergencyCareInvestigationsSnomedCt newInstance() {
              return (uk.nhs.nhsia.datastandards.ecds.AttendanceOccurrenceECStructure.EmergencyCareInvestigationsSnomedCt) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().newInstance( type, null ); }
            
            public static uk.nhs.nhsia.datastandards.ecds.AttendanceOccurrenceECStructure.EmergencyCareInvestigationsSnomedCt newInstance(org.apache.xmlbeans.XmlOptions options) {
              return (uk.nhs.nhsia.datastandards.ecds.AttendanceOccurrenceECStructure.EmergencyCareInvestigationsSnomedCt) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().newInstance( type, options ); }
            
            private Factory() { } // No instance of this class allowed
        }
    }
    
    /**
     * An XML EmergencyCareTreatments_SnomedCt(@http://www.nhsia.nhs.uk/DataStandards/XMLschema/CDS/ns).
     *
     * This is a complex type.
     */
    public interface EmergencyCareTreatmentsSnomedCt extends org.apache.xmlbeans.XmlObject
    {
        public static final org.apache.xmlbeans.SchemaType type = (org.apache.xmlbeans.SchemaType)
            org.apache.xmlbeans.XmlBeans.typeSystemForClassLoader(EmergencyCareTreatmentsSnomedCt.class.getClassLoader(), "schemaorg_apache_xmlbeans.system.s30C1180FF47174E0C8A992A2D657328B").resolveHandle("emergencycaretreatmentssnomedct5f85elemtype");
        
        /**
         * Gets the "EmergencyCareProcedure_SnomedCt" element
         */
        java.lang.String getEmergencyCareProcedureSnomedCt();
        
        /**
         * Gets (as xml) the "EmergencyCareProcedure_SnomedCt" element
         */
        uk.nhs.nhsia.datastandards.ecds.N618ECType xgetEmergencyCareProcedureSnomedCt();
        
        /**
         * Sets the "EmergencyCareProcedure_SnomedCt" element
         */
        void setEmergencyCareProcedureSnomedCt(java.lang.String emergencyCareProcedureSnomedCt);
        
        /**
         * Sets (as xml) the "EmergencyCareProcedure_SnomedCt" element
         */
        void xsetEmergencyCareProcedureSnomedCt(uk.nhs.nhsia.datastandards.ecds.N618ECType emergencyCareProcedureSnomedCt);
        
        /**
         * Gets the "ProcedureDate_EmergencyCareProcedure" element
         */
        java.util.Calendar getProcedureDateEmergencyCareProcedure();
        
        /**
         * Gets (as xml) the "ProcedureDate_EmergencyCareProcedure" element
         */
        uk.nhs.nhsia.datastandards.ecds.DateType xgetProcedureDateEmergencyCareProcedure();
        
        /**
         * True if has "ProcedureDate_EmergencyCareProcedure" element
         */
        boolean isSetProcedureDateEmergencyCareProcedure();
        
        /**
         * Sets the "ProcedureDate_EmergencyCareProcedure" element
         */
        void setProcedureDateEmergencyCareProcedure(java.util.Calendar procedureDateEmergencyCareProcedure);
        
        /**
         * Sets (as xml) the "ProcedureDate_EmergencyCareProcedure" element
         */
        void xsetProcedureDateEmergencyCareProcedure(uk.nhs.nhsia.datastandards.ecds.DateType procedureDateEmergencyCareProcedure);
        
        /**
         * Unsets the "ProcedureDate_EmergencyCareProcedure" element
         */
        void unsetProcedureDateEmergencyCareProcedure();
        
        /**
         * Gets the "ProcedureTime_EmergencyCareProcedure" element
         */
        java.util.Calendar getProcedureTimeEmergencyCareProcedure();
        
        /**
         * Gets (as xml) the "ProcedureTime_EmergencyCareProcedure" element
         */
        uk.nhs.nhsia.datastandards.ecds.TimeType xgetProcedureTimeEmergencyCareProcedure();
        
        /**
         * True if has "ProcedureTime_EmergencyCareProcedure" element
         */
        boolean isSetProcedureTimeEmergencyCareProcedure();
        
        /**
         * Sets the "ProcedureTime_EmergencyCareProcedure" element
         */
        void setProcedureTimeEmergencyCareProcedure(java.util.Calendar procedureTimeEmergencyCareProcedure);
        
        /**
         * Sets (as xml) the "ProcedureTime_EmergencyCareProcedure" element
         */
        void xsetProcedureTimeEmergencyCareProcedure(uk.nhs.nhsia.datastandards.ecds.TimeType procedureTimeEmergencyCareProcedure);
        
        /**
         * Unsets the "ProcedureTime_EmergencyCareProcedure" element
         */
        void unsetProcedureTimeEmergencyCareProcedure();
        
        /**
         * A factory class with static methods for creating instances
         * of this type.
         */
        
        public static final class Factory
        {
            public static uk.nhs.nhsia.datastandards.ecds.AttendanceOccurrenceECStructure.EmergencyCareTreatmentsSnomedCt newInstance() {
              return (uk.nhs.nhsia.datastandards.ecds.AttendanceOccurrenceECStructure.EmergencyCareTreatmentsSnomedCt) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().newInstance( type, null ); }
            
            public static uk.nhs.nhsia.datastandards.ecds.AttendanceOccurrenceECStructure.EmergencyCareTreatmentsSnomedCt newInstance(org.apache.xmlbeans.XmlOptions options) {
              return (uk.nhs.nhsia.datastandards.ecds.AttendanceOccurrenceECStructure.EmergencyCareTreatmentsSnomedCt) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().newInstance( type, options ); }
            
            private Factory() { } // No instance of this class allowed
        }
    }
    
    /**
     * An XML ReferralsToOtherServices(@http://www.nhsia.nhs.uk/DataStandards/XMLschema/CDS/ns).
     *
     * This is a complex type.
     */
    public interface ReferralsToOtherServices extends org.apache.xmlbeans.XmlObject
    {
        public static final org.apache.xmlbeans.SchemaType type = (org.apache.xmlbeans.SchemaType)
            org.apache.xmlbeans.XmlBeans.typeSystemForClassLoader(ReferralsToOtherServices.class.getClassLoader(), "schemaorg_apache_xmlbeans.system.s30C1180FF47174E0C8A992A2D657328B").resolveHandle("referralstootherservices2273elemtype");
        
        /**
         * Gets the "ReferredToService_SnomedCt" element
         */
        java.lang.String getReferredToServiceSnomedCt();
        
        /**
         * Gets (as xml) the "ReferredToService_SnomedCt" element
         */
        uk.nhs.nhsia.datastandards.ecds.N618ECType xgetReferredToServiceSnomedCt();
        
        /**
         * True if has "ReferredToService_SnomedCt" element
         */
        boolean isSetReferredToServiceSnomedCt();
        
        /**
         * Sets the "ReferredToService_SnomedCt" element
         */
        void setReferredToServiceSnomedCt(java.lang.String referredToServiceSnomedCt);
        
        /**
         * Sets (as xml) the "ReferredToService_SnomedCt" element
         */
        void xsetReferredToServiceSnomedCt(uk.nhs.nhsia.datastandards.ecds.N618ECType referredToServiceSnomedCt);
        
        /**
         * Unsets the "ReferredToService_SnomedCt" element
         */
        void unsetReferredToServiceSnomedCt();
        
        /**
         * Gets the "ActivityServiceRequestDate_EmergencyCare" element
         */
        java.util.Calendar getActivityServiceRequestDateEmergencyCare();
        
        /**
         * Gets (as xml) the "ActivityServiceRequestDate_EmergencyCare" element
         */
        uk.nhs.nhsia.datastandards.ecds.DateType xgetActivityServiceRequestDateEmergencyCare();
        
        /**
         * Sets the "ActivityServiceRequestDate_EmergencyCare" element
         */
        void setActivityServiceRequestDateEmergencyCare(java.util.Calendar activityServiceRequestDateEmergencyCare);
        
        /**
         * Sets (as xml) the "ActivityServiceRequestDate_EmergencyCare" element
         */
        void xsetActivityServiceRequestDateEmergencyCare(uk.nhs.nhsia.datastandards.ecds.DateType activityServiceRequestDateEmergencyCare);
        
        /**
         * Gets the "ActivityServiceRequestTime_EmergencyCare" element
         */
        java.util.Calendar getActivityServiceRequestTimeEmergencyCare();
        
        /**
         * Gets (as xml) the "ActivityServiceRequestTime_EmergencyCare" element
         */
        uk.nhs.nhsia.datastandards.ecds.TimeType xgetActivityServiceRequestTimeEmergencyCare();
        
        /**
         * Sets the "ActivityServiceRequestTime_EmergencyCare" element
         */
        void setActivityServiceRequestTimeEmergencyCare(java.util.Calendar activityServiceRequestTimeEmergencyCare);
        
        /**
         * Sets (as xml) the "ActivityServiceRequestTime_EmergencyCare" element
         */
        void xsetActivityServiceRequestTimeEmergencyCare(uk.nhs.nhsia.datastandards.ecds.TimeType activityServiceRequestTimeEmergencyCare);
        
        /**
         * Gets the "ReferredToServiceAssessmentDate" element
         */
        java.util.Calendar getReferredToServiceAssessmentDate();
        
        /**
         * Gets (as xml) the "ReferredToServiceAssessmentDate" element
         */
        uk.nhs.nhsia.datastandards.ecds.DateType xgetReferredToServiceAssessmentDate();
        
        /**
         * True if has "ReferredToServiceAssessmentDate" element
         */
        boolean isSetReferredToServiceAssessmentDate();
        
        /**
         * Sets the "ReferredToServiceAssessmentDate" element
         */
        void setReferredToServiceAssessmentDate(java.util.Calendar referredToServiceAssessmentDate);
        
        /**
         * Sets (as xml) the "ReferredToServiceAssessmentDate" element
         */
        void xsetReferredToServiceAssessmentDate(uk.nhs.nhsia.datastandards.ecds.DateType referredToServiceAssessmentDate);
        
        /**
         * Unsets the "ReferredToServiceAssessmentDate" element
         */
        void unsetReferredToServiceAssessmentDate();
        
        /**
         * Gets the "ReferredToServiceAssessmentTime" element
         */
        java.util.Calendar getReferredToServiceAssessmentTime();
        
        /**
         * Gets (as xml) the "ReferredToServiceAssessmentTime" element
         */
        uk.nhs.nhsia.datastandards.ecds.TimeType xgetReferredToServiceAssessmentTime();
        
        /**
         * True if has "ReferredToServiceAssessmentTime" element
         */
        boolean isSetReferredToServiceAssessmentTime();
        
        /**
         * Sets the "ReferredToServiceAssessmentTime" element
         */
        void setReferredToServiceAssessmentTime(java.util.Calendar referredToServiceAssessmentTime);
        
        /**
         * Sets (as xml) the "ReferredToServiceAssessmentTime" element
         */
        void xsetReferredToServiceAssessmentTime(uk.nhs.nhsia.datastandards.ecds.TimeType referredToServiceAssessmentTime);
        
        /**
         * Unsets the "ReferredToServiceAssessmentTime" element
         */
        void unsetReferredToServiceAssessmentTime();
        
        /**
         * A factory class with static methods for creating instances
         * of this type.
         */
        
        public static final class Factory
        {
            public static uk.nhs.nhsia.datastandards.ecds.AttendanceOccurrenceECStructure.ReferralsToOtherServices newInstance() {
              return (uk.nhs.nhsia.datastandards.ecds.AttendanceOccurrenceECStructure.ReferralsToOtherServices) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().newInstance( type, null ); }
            
            public static uk.nhs.nhsia.datastandards.ecds.AttendanceOccurrenceECStructure.ReferralsToOtherServices newInstance(org.apache.xmlbeans.XmlOptions options) {
              return (uk.nhs.nhsia.datastandards.ecds.AttendanceOccurrenceECStructure.ReferralsToOtherServices) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().newInstance( type, options ); }
            
            private Factory() { } // No instance of this class allowed
        }
    }
    
    /**
     * An XML DischargeFromEmergencyCare(@http://www.nhsia.nhs.uk/DataStandards/XMLschema/CDS/ns).
     *
     * This is a complex type.
     */
    public interface DischargeFromEmergencyCare extends org.apache.xmlbeans.XmlObject
    {
        public static final org.apache.xmlbeans.SchemaType type = (org.apache.xmlbeans.SchemaType)
            org.apache.xmlbeans.XmlBeans.typeSystemForClassLoader(DischargeFromEmergencyCare.class.getClassLoader(), "schemaorg_apache_xmlbeans.system.s30C1180FF47174E0C8A992A2D657328B").resolveHandle("dischargefromemergencycare523aelemtype");
        
        /**
         * Gets the "DecidedToAdmitDate" element
         */
        java.util.Calendar getDecidedToAdmitDate();
        
        /**
         * Gets (as xml) the "DecidedToAdmitDate" element
         */
        uk.nhs.nhsia.datastandards.ecds.DateType xgetDecidedToAdmitDate();
        
        /**
         * True if has "DecidedToAdmitDate" element
         */
        boolean isSetDecidedToAdmitDate();
        
        /**
         * Sets the "DecidedToAdmitDate" element
         */
        void setDecidedToAdmitDate(java.util.Calendar decidedToAdmitDate);
        
        /**
         * Sets (as xml) the "DecidedToAdmitDate" element
         */
        void xsetDecidedToAdmitDate(uk.nhs.nhsia.datastandards.ecds.DateType decidedToAdmitDate);
        
        /**
         * Unsets the "DecidedToAdmitDate" element
         */
        void unsetDecidedToAdmitDate();
        
        /**
         * Gets the "DecidedToAdmitTime" element
         */
        java.util.Calendar getDecidedToAdmitTime();
        
        /**
         * Gets (as xml) the "DecidedToAdmitTime" element
         */
        uk.nhs.nhsia.datastandards.ecds.TimeType xgetDecidedToAdmitTime();
        
        /**
         * True if has "DecidedToAdmitTime" element
         */
        boolean isSetDecidedToAdmitTime();
        
        /**
         * Sets the "DecidedToAdmitTime" element
         */
        void setDecidedToAdmitTime(java.util.Calendar decidedToAdmitTime);
        
        /**
         * Sets (as xml) the "DecidedToAdmitTime" element
         */
        void xsetDecidedToAdmitTime(uk.nhs.nhsia.datastandards.ecds.TimeType decidedToAdmitTime);
        
        /**
         * Unsets the "DecidedToAdmitTime" element
         */
        void unsetDecidedToAdmitTime();
        
        /**
         * Gets the "ActivityTreatmentFunctionCode_DecisionToAdmit" element
         */
        java.lang.String getActivityTreatmentFunctionCodeDecisionToAdmit();
        
        /**
         * Gets (as xml) the "ActivityTreatmentFunctionCode_DecisionToAdmit" element
         */
        uk.nhs.nhsia.datastandards.ecds.AttendanceOccurrenceECStructure.DischargeFromEmergencyCare.ActivityTreatmentFunctionCodeDecisionToAdmit xgetActivityTreatmentFunctionCodeDecisionToAdmit();
        
        /**
         * True if has "ActivityTreatmentFunctionCode_DecisionToAdmit" element
         */
        boolean isSetActivityTreatmentFunctionCodeDecisionToAdmit();
        
        /**
         * Sets the "ActivityTreatmentFunctionCode_DecisionToAdmit" element
         */
        void setActivityTreatmentFunctionCodeDecisionToAdmit(java.lang.String activityTreatmentFunctionCodeDecisionToAdmit);
        
        /**
         * Sets (as xml) the "ActivityTreatmentFunctionCode_DecisionToAdmit" element
         */
        void xsetActivityTreatmentFunctionCodeDecisionToAdmit(uk.nhs.nhsia.datastandards.ecds.AttendanceOccurrenceECStructure.DischargeFromEmergencyCare.ActivityTreatmentFunctionCodeDecisionToAdmit activityTreatmentFunctionCodeDecisionToAdmit);
        
        /**
         * Unsets the "ActivityTreatmentFunctionCode_DecisionToAdmit" element
         */
        void unsetActivityTreatmentFunctionCodeDecisionToAdmit();
        
        /**
         * Gets the "EmergencyCareDischargeStatus_SnomedCt" element
         */
        java.lang.String getEmergencyCareDischargeStatusSnomedCt();
        
        /**
         * Gets (as xml) the "EmergencyCareDischargeStatus_SnomedCt" element
         */
        uk.nhs.nhsia.datastandards.ecds.N618ECType xgetEmergencyCareDischargeStatusSnomedCt();
        
        /**
         * True if has "EmergencyCareDischargeStatus_SnomedCt" element
         */
        boolean isSetEmergencyCareDischargeStatusSnomedCt();
        
        /**
         * Sets the "EmergencyCareDischargeStatus_SnomedCt" element
         */
        void setEmergencyCareDischargeStatusSnomedCt(java.lang.String emergencyCareDischargeStatusSnomedCt);
        
        /**
         * Sets (as xml) the "EmergencyCareDischargeStatus_SnomedCt" element
         */
        void xsetEmergencyCareDischargeStatusSnomedCt(uk.nhs.nhsia.datastandards.ecds.N618ECType emergencyCareDischargeStatusSnomedCt);
        
        /**
         * Unsets the "EmergencyCareDischargeStatus_SnomedCt" element
         */
        void unsetEmergencyCareDischargeStatusSnomedCt();
        
        /**
         * Gets the "EmergencyCareAttendanceConclusionDate" element
         */
        java.util.Calendar getEmergencyCareAttendanceConclusionDate();
        
        /**
         * Gets (as xml) the "EmergencyCareAttendanceConclusionDate" element
         */
        uk.nhs.nhsia.datastandards.ecds.DateType xgetEmergencyCareAttendanceConclusionDate();
        
        /**
         * True if has "EmergencyCareAttendanceConclusionDate" element
         */
        boolean isSetEmergencyCareAttendanceConclusionDate();
        
        /**
         * Sets the "EmergencyCareAttendanceConclusionDate" element
         */
        void setEmergencyCareAttendanceConclusionDate(java.util.Calendar emergencyCareAttendanceConclusionDate);
        
        /**
         * Sets (as xml) the "EmergencyCareAttendanceConclusionDate" element
         */
        void xsetEmergencyCareAttendanceConclusionDate(uk.nhs.nhsia.datastandards.ecds.DateType emergencyCareAttendanceConclusionDate);
        
        /**
         * Unsets the "EmergencyCareAttendanceConclusionDate" element
         */
        void unsetEmergencyCareAttendanceConclusionDate();
        
        /**
         * Gets the "EmergencyCareAttendanceConclusionTime" element
         */
        java.util.Calendar getEmergencyCareAttendanceConclusionTime();
        
        /**
         * Gets (as xml) the "EmergencyCareAttendanceConclusionTime" element
         */
        uk.nhs.nhsia.datastandards.ecds.TimeType xgetEmergencyCareAttendanceConclusionTime();
        
        /**
         * True if has "EmergencyCareAttendanceConclusionTime" element
         */
        boolean isSetEmergencyCareAttendanceConclusionTime();
        
        /**
         * Sets the "EmergencyCareAttendanceConclusionTime" element
         */
        void setEmergencyCareAttendanceConclusionTime(java.util.Calendar emergencyCareAttendanceConclusionTime);
        
        /**
         * Sets (as xml) the "EmergencyCareAttendanceConclusionTime" element
         */
        void xsetEmergencyCareAttendanceConclusionTime(uk.nhs.nhsia.datastandards.ecds.TimeType emergencyCareAttendanceConclusionTime);
        
        /**
         * Unsets the "EmergencyCareAttendanceConclusionTime" element
         */
        void unsetEmergencyCareAttendanceConclusionTime();
        
        /**
         * Gets the "EmergencyCareDepartureDate" element
         */
        java.util.Calendar getEmergencyCareDepartureDate();
        
        /**
         * Gets (as xml) the "EmergencyCareDepartureDate" element
         */
        uk.nhs.nhsia.datastandards.ecds.DateType xgetEmergencyCareDepartureDate();
        
        /**
         * True if has "EmergencyCareDepartureDate" element
         */
        boolean isSetEmergencyCareDepartureDate();
        
        /**
         * Sets the "EmergencyCareDepartureDate" element
         */
        void setEmergencyCareDepartureDate(java.util.Calendar emergencyCareDepartureDate);
        
        /**
         * Sets (as xml) the "EmergencyCareDepartureDate" element
         */
        void xsetEmergencyCareDepartureDate(uk.nhs.nhsia.datastandards.ecds.DateType emergencyCareDepartureDate);
        
        /**
         * Unsets the "EmergencyCareDepartureDate" element
         */
        void unsetEmergencyCareDepartureDate();
        
        /**
         * Gets the "EmergencyCareDepartureTime" element
         */
        java.util.Calendar getEmergencyCareDepartureTime();
        
        /**
         * Gets (as xml) the "EmergencyCareDepartureTime" element
         */
        uk.nhs.nhsia.datastandards.ecds.TimeType xgetEmergencyCareDepartureTime();
        
        /**
         * True if has "EmergencyCareDepartureTime" element
         */
        boolean isSetEmergencyCareDepartureTime();
        
        /**
         * Sets the "EmergencyCareDepartureTime" element
         */
        void setEmergencyCareDepartureTime(java.util.Calendar emergencyCareDepartureTime);
        
        /**
         * Sets (as xml) the "EmergencyCareDepartureTime" element
         */
        void xsetEmergencyCareDepartureTime(uk.nhs.nhsia.datastandards.ecds.TimeType emergencyCareDepartureTime);
        
        /**
         * Unsets the "EmergencyCareDepartureTime" element
         */
        void unsetEmergencyCareDepartureTime();
        
        /**
         * Gets array of all "SafeguardingConcern_SnomedCt" elements
         */
        java.lang.String[] getSafeguardingConcernSnomedCtArray();
        
        /**
         * Gets ith "SafeguardingConcern_SnomedCt" element
         */
        java.lang.String getSafeguardingConcernSnomedCtArray(int i);
        
        /**
         * Gets (as xml) array of all "SafeguardingConcern_SnomedCt" elements
         */
        uk.nhs.nhsia.datastandards.ecds.N618ECType[] xgetSafeguardingConcernSnomedCtArray();
        
        /**
         * Gets (as xml) ith "SafeguardingConcern_SnomedCt" element
         */
        uk.nhs.nhsia.datastandards.ecds.N618ECType xgetSafeguardingConcernSnomedCtArray(int i);
        
        /**
         * Returns number of "SafeguardingConcern_SnomedCt" element
         */
        int sizeOfSafeguardingConcernSnomedCtArray();
        
        /**
         * Sets array of all "SafeguardingConcern_SnomedCt" element
         */
        void setSafeguardingConcernSnomedCtArray(java.lang.String[] safeguardingConcernSnomedCtArray);
        
        /**
         * Sets ith "SafeguardingConcern_SnomedCt" element
         */
        void setSafeguardingConcernSnomedCtArray(int i, java.lang.String safeguardingConcernSnomedCt);
        
        /**
         * Sets (as xml) array of all "SafeguardingConcern_SnomedCt" element
         */
        void xsetSafeguardingConcernSnomedCtArray(uk.nhs.nhsia.datastandards.ecds.N618ECType[] safeguardingConcernSnomedCtArray);
        
        /**
         * Sets (as xml) ith "SafeguardingConcern_SnomedCt" element
         */
        void xsetSafeguardingConcernSnomedCtArray(int i, uk.nhs.nhsia.datastandards.ecds.N618ECType safeguardingConcernSnomedCt);
        
        /**
         * Inserts the value as the ith "SafeguardingConcern_SnomedCt" element
         */
        void insertSafeguardingConcernSnomedCt(int i, java.lang.String safeguardingConcernSnomedCt);
        
        /**
         * Appends the value as the last "SafeguardingConcern_SnomedCt" element
         */
        void addSafeguardingConcernSnomedCt(java.lang.String safeguardingConcernSnomedCt);
        
        /**
         * Inserts and returns a new empty value (as xml) as the ith "SafeguardingConcern_SnomedCt" element
         */
        uk.nhs.nhsia.datastandards.ecds.N618ECType insertNewSafeguardingConcernSnomedCt(int i);
        
        /**
         * Appends and returns a new empty value (as xml) as the last "SafeguardingConcern_SnomedCt" element
         */
        uk.nhs.nhsia.datastandards.ecds.N618ECType addNewSafeguardingConcernSnomedCt();
        
        /**
         * Removes the ith "SafeguardingConcern_SnomedCt" element
         */
        void removeSafeguardingConcernSnomedCt(int i);
        
        /**
         * Gets the "EmergencyCareDischargeDestination_SnomedCt" element
         */
        java.lang.String getEmergencyCareDischargeDestinationSnomedCt();
        
        /**
         * Gets (as xml) the "EmergencyCareDischargeDestination_SnomedCt" element
         */
        uk.nhs.nhsia.datastandards.ecds.N618ECType xgetEmergencyCareDischargeDestinationSnomedCt();
        
        /**
         * True if has "EmergencyCareDischargeDestination_SnomedCt" element
         */
        boolean isSetEmergencyCareDischargeDestinationSnomedCt();
        
        /**
         * Sets the "EmergencyCareDischargeDestination_SnomedCt" element
         */
        void setEmergencyCareDischargeDestinationSnomedCt(java.lang.String emergencyCareDischargeDestinationSnomedCt);
        
        /**
         * Sets (as xml) the "EmergencyCareDischargeDestination_SnomedCt" element
         */
        void xsetEmergencyCareDischargeDestinationSnomedCt(uk.nhs.nhsia.datastandards.ecds.N618ECType emergencyCareDischargeDestinationSnomedCt);
        
        /**
         * Unsets the "EmergencyCareDischargeDestination_SnomedCt" element
         */
        void unsetEmergencyCareDischargeDestinationSnomedCt();
        
        /**
         * Gets the "OrganisationSiteIdentifier_DischargeFromEmergencyCare" element
         */
        java.lang.String getOrganisationSiteIdentifierDischargeFromEmergencyCare();
        
        /**
         * Gets (as xml) the "OrganisationSiteIdentifier_DischargeFromEmergencyCare" element
         */
        uk.nhs.nhsia.datastandards.ecds.AN59ECType xgetOrganisationSiteIdentifierDischargeFromEmergencyCare();
        
        /**
         * True if has "OrganisationSiteIdentifier_DischargeFromEmergencyCare" element
         */
        boolean isSetOrganisationSiteIdentifierDischargeFromEmergencyCare();
        
        /**
         * Sets the "OrganisationSiteIdentifier_DischargeFromEmergencyCare" element
         */
        void setOrganisationSiteIdentifierDischargeFromEmergencyCare(java.lang.String organisationSiteIdentifierDischargeFromEmergencyCare);
        
        /**
         * Sets (as xml) the "OrganisationSiteIdentifier_DischargeFromEmergencyCare" element
         */
        void xsetOrganisationSiteIdentifierDischargeFromEmergencyCare(uk.nhs.nhsia.datastandards.ecds.AN59ECType organisationSiteIdentifierDischargeFromEmergencyCare);
        
        /**
         * Unsets the "OrganisationSiteIdentifier_DischargeFromEmergencyCare" element
         */
        void unsetOrganisationSiteIdentifierDischargeFromEmergencyCare();
        
        /**
         * Gets the "EmergencyCareDischargeFollowUp_SnomedCt" element
         */
        java.lang.String getEmergencyCareDischargeFollowUpSnomedCt();
        
        /**
         * Gets (as xml) the "EmergencyCareDischargeFollowUp_SnomedCt" element
         */
        uk.nhs.nhsia.datastandards.ecds.N618ECType xgetEmergencyCareDischargeFollowUpSnomedCt();
        
        /**
         * True if has "EmergencyCareDischargeFollowUp_SnomedCt" element
         */
        boolean isSetEmergencyCareDischargeFollowUpSnomedCt();
        
        /**
         * Sets the "EmergencyCareDischargeFollowUp_SnomedCt" element
         */
        void setEmergencyCareDischargeFollowUpSnomedCt(java.lang.String emergencyCareDischargeFollowUpSnomedCt);
        
        /**
         * Sets (as xml) the "EmergencyCareDischargeFollowUp_SnomedCt" element
         */
        void xsetEmergencyCareDischargeFollowUpSnomedCt(uk.nhs.nhsia.datastandards.ecds.N618ECType emergencyCareDischargeFollowUpSnomedCt);
        
        /**
         * Unsets the "EmergencyCareDischargeFollowUp_SnomedCt" element
         */
        void unsetEmergencyCareDischargeFollowUpSnomedCt();
        
        /**
         * Gets the "EmergencyCareDischargeInformationGiven_SnomedCt" element
         */
        java.lang.String getEmergencyCareDischargeInformationGivenSnomedCt();
        
        /**
         * Gets (as xml) the "EmergencyCareDischargeInformationGiven_SnomedCt" element
         */
        uk.nhs.nhsia.datastandards.ecds.N618ECType xgetEmergencyCareDischargeInformationGivenSnomedCt();
        
        /**
         * True if has "EmergencyCareDischargeInformationGiven_SnomedCt" element
         */
        boolean isSetEmergencyCareDischargeInformationGivenSnomedCt();
        
        /**
         * Sets the "EmergencyCareDischargeInformationGiven_SnomedCt" element
         */
        void setEmergencyCareDischargeInformationGivenSnomedCt(java.lang.String emergencyCareDischargeInformationGivenSnomedCt);
        
        /**
         * Sets (as xml) the "EmergencyCareDischargeInformationGiven_SnomedCt" element
         */
        void xsetEmergencyCareDischargeInformationGivenSnomedCt(uk.nhs.nhsia.datastandards.ecds.N618ECType emergencyCareDischargeInformationGivenSnomedCt);
        
        /**
         * Unsets the "EmergencyCareDischargeInformationGiven_SnomedCt" element
         */
        void unsetEmergencyCareDischargeInformationGivenSnomedCt();
        
        /**
         * An XML ActivityTreatmentFunctionCode_DecisionToAdmit(@http://www.nhsia.nhs.uk/DataStandards/XMLschema/CDS/ns).
         *
         * This is an atomic type that is a restriction of uk.nhs.nhsia.datastandards.ecds.AttendanceOccurrenceECStructure$DischargeFromEmergencyCare$ActivityTreatmentFunctionCodeDecisionToAdmit.
         */
        public interface ActivityTreatmentFunctionCodeDecisionToAdmit extends uk.nhs.nhsia.datastandards.ecds.AlphaNumericType
        {
            public static final org.apache.xmlbeans.SchemaType type = (org.apache.xmlbeans.SchemaType)
                org.apache.xmlbeans.XmlBeans.typeSystemForClassLoader(ActivityTreatmentFunctionCodeDecisionToAdmit.class.getClassLoader(), "schemaorg_apache_xmlbeans.system.s30C1180FF47174E0C8A992A2D657328B").resolveHandle("activitytreatmentfunctioncodedecisiontoadmit1bf3elemtype");
            
            /**
             * A factory class with static methods for creating instances
             * of this type.
             */
            
            public static final class Factory
            {
                public static uk.nhs.nhsia.datastandards.ecds.AttendanceOccurrenceECStructure.DischargeFromEmergencyCare.ActivityTreatmentFunctionCodeDecisionToAdmit newValue(java.lang.Object obj) {
                  return (uk.nhs.nhsia.datastandards.ecds.AttendanceOccurrenceECStructure.DischargeFromEmergencyCare.ActivityTreatmentFunctionCodeDecisionToAdmit) type.newValue( obj ); }
                
                public static uk.nhs.nhsia.datastandards.ecds.AttendanceOccurrenceECStructure.DischargeFromEmergencyCare.ActivityTreatmentFunctionCodeDecisionToAdmit newInstance() {
                  return (uk.nhs.nhsia.datastandards.ecds.AttendanceOccurrenceECStructure.DischargeFromEmergencyCare.ActivityTreatmentFunctionCodeDecisionToAdmit) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().newInstance( type, null ); }
                
                public static uk.nhs.nhsia.datastandards.ecds.AttendanceOccurrenceECStructure.DischargeFromEmergencyCare.ActivityTreatmentFunctionCodeDecisionToAdmit newInstance(org.apache.xmlbeans.XmlOptions options) {
                  return (uk.nhs.nhsia.datastandards.ecds.AttendanceOccurrenceECStructure.DischargeFromEmergencyCare.ActivityTreatmentFunctionCodeDecisionToAdmit) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().newInstance( type, options ); }
                
                private Factory() { } // No instance of this class allowed
            }
        }
        
        /**
         * A factory class with static methods for creating instances
         * of this type.
         */
        
        public static final class Factory
        {
            public static uk.nhs.nhsia.datastandards.ecds.AttendanceOccurrenceECStructure.DischargeFromEmergencyCare newInstance() {
              return (uk.nhs.nhsia.datastandards.ecds.AttendanceOccurrenceECStructure.DischargeFromEmergencyCare) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().newInstance( type, null ); }
            
            public static uk.nhs.nhsia.datastandards.ecds.AttendanceOccurrenceECStructure.DischargeFromEmergencyCare newInstance(org.apache.xmlbeans.XmlOptions options) {
              return (uk.nhs.nhsia.datastandards.ecds.AttendanceOccurrenceECStructure.DischargeFromEmergencyCare) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().newInstance( type, options ); }
            
            private Factory() { } // No instance of this class allowed
        }
    }
    
    /**
     * An XML ResearchAndDiseaseOutbreakNotification(@http://www.nhsia.nhs.uk/DataStandards/XMLschema/CDS/ns).
     *
     * This is a complex type.
     */
    public interface ResearchAndDiseaseOutbreakNotification extends org.apache.xmlbeans.XmlObject
    {
        public static final org.apache.xmlbeans.SchemaType type = (org.apache.xmlbeans.SchemaType)
            org.apache.xmlbeans.XmlBeans.typeSystemForClassLoader(ResearchAndDiseaseOutbreakNotification.class.getClassLoader(), "schemaorg_apache_xmlbeans.system.s30C1180FF47174E0C8A992A2D657328B").resolveHandle("researchanddiseaseoutbreaknotificationd4d4elemtype");
        
        /**
         * Gets the "ClinicalTrialIdentifier" element
         */
        java.lang.String getClinicalTrialIdentifier();
        
        /**
         * Gets (as xml) the "ClinicalTrialIdentifier" element
         */
        uk.nhs.nhsia.datastandards.ecds.ANMax20ECType xgetClinicalTrialIdentifier();
        
        /**
         * True if has "ClinicalTrialIdentifier" element
         */
        boolean isSetClinicalTrialIdentifier();
        
        /**
         * Sets the "ClinicalTrialIdentifier" element
         */
        void setClinicalTrialIdentifier(java.lang.String clinicalTrialIdentifier);
        
        /**
         * Sets (as xml) the "ClinicalTrialIdentifier" element
         */
        void xsetClinicalTrialIdentifier(uk.nhs.nhsia.datastandards.ecds.ANMax20ECType clinicalTrialIdentifier);
        
        /**
         * Unsets the "ClinicalTrialIdentifier" element
         */
        void unsetClinicalTrialIdentifier();
        
        /**
         * Gets the "DiseaseOutbreakNotification" element
         */
        java.lang.String getDiseaseOutbreakNotification();
        
        /**
         * Gets (as xml) the "DiseaseOutbreakNotification" element
         */
        uk.nhs.nhsia.datastandards.ecds.ANMax20ECType xgetDiseaseOutbreakNotification();
        
        /**
         * True if has "DiseaseOutbreakNotification" element
         */
        boolean isSetDiseaseOutbreakNotification();
        
        /**
         * Sets the "DiseaseOutbreakNotification" element
         */
        void setDiseaseOutbreakNotification(java.lang.String diseaseOutbreakNotification);
        
        /**
         * Sets (as xml) the "DiseaseOutbreakNotification" element
         */
        void xsetDiseaseOutbreakNotification(uk.nhs.nhsia.datastandards.ecds.ANMax20ECType diseaseOutbreakNotification);
        
        /**
         * Unsets the "DiseaseOutbreakNotification" element
         */
        void unsetDiseaseOutbreakNotification();
        
        /**
         * A factory class with static methods for creating instances
         * of this type.
         */
        
        public static final class Factory
        {
            public static uk.nhs.nhsia.datastandards.ecds.AttendanceOccurrenceECStructure.ResearchAndDiseaseOutbreakNotification newInstance() {
              return (uk.nhs.nhsia.datastandards.ecds.AttendanceOccurrenceECStructure.ResearchAndDiseaseOutbreakNotification) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().newInstance( type, null ); }
            
            public static uk.nhs.nhsia.datastandards.ecds.AttendanceOccurrenceECStructure.ResearchAndDiseaseOutbreakNotification newInstance(org.apache.xmlbeans.XmlOptions options) {
              return (uk.nhs.nhsia.datastandards.ecds.AttendanceOccurrenceECStructure.ResearchAndDiseaseOutbreakNotification) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().newInstance( type, options ); }
            
            private Factory() { } // No instance of this class allowed
        }
    }
    
    /**
     * A factory class with static methods for creating instances
     * of this type.
     */
    
    public static final class Factory
    {
        public static uk.nhs.nhsia.datastandards.ecds.AttendanceOccurrenceECStructure newInstance() {
          return (uk.nhs.nhsia.datastandards.ecds.AttendanceOccurrenceECStructure) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().newInstance( type, null ); }
        
        public static uk.nhs.nhsia.datastandards.ecds.AttendanceOccurrenceECStructure newInstance(org.apache.xmlbeans.XmlOptions options) {
          return (uk.nhs.nhsia.datastandards.ecds.AttendanceOccurrenceECStructure) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().newInstance( type, options ); }
        
        /** @param xmlAsString the string value to parse */
        public static uk.nhs.nhsia.datastandards.ecds.AttendanceOccurrenceECStructure parse(java.lang.String xmlAsString) throws org.apache.xmlbeans.XmlException {
          return (uk.nhs.nhsia.datastandards.ecds.AttendanceOccurrenceECStructure) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( xmlAsString, type, null ); }
        
        public static uk.nhs.nhsia.datastandards.ecds.AttendanceOccurrenceECStructure parse(java.lang.String xmlAsString, org.apache.xmlbeans.XmlOptions options) throws org.apache.xmlbeans.XmlException {
          return (uk.nhs.nhsia.datastandards.ecds.AttendanceOccurrenceECStructure) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( xmlAsString, type, options ); }
        
        /** @param file the file from which to load an xml document */
        public static uk.nhs.nhsia.datastandards.ecds.AttendanceOccurrenceECStructure parse(java.io.File file) throws org.apache.xmlbeans.XmlException, java.io.IOException {
          return (uk.nhs.nhsia.datastandards.ecds.AttendanceOccurrenceECStructure) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( file, type, null ); }
        
        public static uk.nhs.nhsia.datastandards.ecds.AttendanceOccurrenceECStructure parse(java.io.File file, org.apache.xmlbeans.XmlOptions options) throws org.apache.xmlbeans.XmlException, java.io.IOException {
          return (uk.nhs.nhsia.datastandards.ecds.AttendanceOccurrenceECStructure) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( file, type, options ); }
        
        public static uk.nhs.nhsia.datastandards.ecds.AttendanceOccurrenceECStructure parse(java.net.URL u) throws org.apache.xmlbeans.XmlException, java.io.IOException {
          return (uk.nhs.nhsia.datastandards.ecds.AttendanceOccurrenceECStructure) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( u, type, null ); }
        
        public static uk.nhs.nhsia.datastandards.ecds.AttendanceOccurrenceECStructure parse(java.net.URL u, org.apache.xmlbeans.XmlOptions options) throws org.apache.xmlbeans.XmlException, java.io.IOException {
          return (uk.nhs.nhsia.datastandards.ecds.AttendanceOccurrenceECStructure) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( u, type, options ); }
        
        public static uk.nhs.nhsia.datastandards.ecds.AttendanceOccurrenceECStructure parse(java.io.InputStream is) throws org.apache.xmlbeans.XmlException, java.io.IOException {
          return (uk.nhs.nhsia.datastandards.ecds.AttendanceOccurrenceECStructure) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( is, type, null ); }
        
        public static uk.nhs.nhsia.datastandards.ecds.AttendanceOccurrenceECStructure parse(java.io.InputStream is, org.apache.xmlbeans.XmlOptions options) throws org.apache.xmlbeans.XmlException, java.io.IOException {
          return (uk.nhs.nhsia.datastandards.ecds.AttendanceOccurrenceECStructure) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( is, type, options ); }
        
        public static uk.nhs.nhsia.datastandards.ecds.AttendanceOccurrenceECStructure parse(java.io.Reader r) throws org.apache.xmlbeans.XmlException, java.io.IOException {
          return (uk.nhs.nhsia.datastandards.ecds.AttendanceOccurrenceECStructure) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( r, type, null ); }
        
        public static uk.nhs.nhsia.datastandards.ecds.AttendanceOccurrenceECStructure parse(java.io.Reader r, org.apache.xmlbeans.XmlOptions options) throws org.apache.xmlbeans.XmlException, java.io.IOException {
          return (uk.nhs.nhsia.datastandards.ecds.AttendanceOccurrenceECStructure) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( r, type, options ); }
        
        public static uk.nhs.nhsia.datastandards.ecds.AttendanceOccurrenceECStructure parse(javax.xml.stream.XMLStreamReader sr) throws org.apache.xmlbeans.XmlException {
          return (uk.nhs.nhsia.datastandards.ecds.AttendanceOccurrenceECStructure) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( sr, type, null ); }
        
        public static uk.nhs.nhsia.datastandards.ecds.AttendanceOccurrenceECStructure parse(javax.xml.stream.XMLStreamReader sr, org.apache.xmlbeans.XmlOptions options) throws org.apache.xmlbeans.XmlException {
          return (uk.nhs.nhsia.datastandards.ecds.AttendanceOccurrenceECStructure) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( sr, type, options ); }
        
        public static uk.nhs.nhsia.datastandards.ecds.AttendanceOccurrenceECStructure parse(org.w3c.dom.Node node) throws org.apache.xmlbeans.XmlException {
          return (uk.nhs.nhsia.datastandards.ecds.AttendanceOccurrenceECStructure) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( node, type, null ); }
        
        public static uk.nhs.nhsia.datastandards.ecds.AttendanceOccurrenceECStructure parse(org.w3c.dom.Node node, org.apache.xmlbeans.XmlOptions options) throws org.apache.xmlbeans.XmlException {
          return (uk.nhs.nhsia.datastandards.ecds.AttendanceOccurrenceECStructure) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( node, type, options ); }
        
        /** @deprecated {@link org.apache.xmlbeans.xml.stream.XMLInputStream} */
        public static uk.nhs.nhsia.datastandards.ecds.AttendanceOccurrenceECStructure parse(org.apache.xmlbeans.xml.stream.XMLInputStream xis) throws org.apache.xmlbeans.XmlException, org.apache.xmlbeans.xml.stream.XMLStreamException {
          return (uk.nhs.nhsia.datastandards.ecds.AttendanceOccurrenceECStructure) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( xis, type, null ); }
        
        /** @deprecated {@link org.apache.xmlbeans.xml.stream.XMLInputStream} */
        public static uk.nhs.nhsia.datastandards.ecds.AttendanceOccurrenceECStructure parse(org.apache.xmlbeans.xml.stream.XMLInputStream xis, org.apache.xmlbeans.XmlOptions options) throws org.apache.xmlbeans.XmlException, org.apache.xmlbeans.xml.stream.XMLStreamException {
          return (uk.nhs.nhsia.datastandards.ecds.AttendanceOccurrenceECStructure) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( xis, type, options ); }
        
        /** @deprecated {@link org.apache.xmlbeans.xml.stream.XMLInputStream} */
        public static org.apache.xmlbeans.xml.stream.XMLInputStream newValidatingXMLInputStream(org.apache.xmlbeans.xml.stream.XMLInputStream xis) throws org.apache.xmlbeans.XmlException, org.apache.xmlbeans.xml.stream.XMLStreamException {
          return org.apache.xmlbeans.XmlBeans.getContextTypeLoader().newValidatingXMLInputStream( xis, type, null ); }
        
        /** @deprecated {@link org.apache.xmlbeans.xml.stream.XMLInputStream} */
        public static org.apache.xmlbeans.xml.stream.XMLInputStream newValidatingXMLInputStream(org.apache.xmlbeans.xml.stream.XMLInputStream xis, org.apache.xmlbeans.XmlOptions options) throws org.apache.xmlbeans.XmlException, org.apache.xmlbeans.xml.stream.XMLStreamException {
          return org.apache.xmlbeans.XmlBeans.getContextTypeLoader().newValidatingXMLInputStream( xis, type, options ); }
        
        private Factory() { } // No instance of this class allowed
    }
}
