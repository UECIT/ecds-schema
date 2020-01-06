/*
 * XML Type:  AttendanceOccurrence_EC_Structure
 * Namespace: http://www.nhsia.nhs.uk/DataStandards/XMLschema/CDS/ns
 * Java type: uk.nhs.nhsia.datastandards.ecds.AttendanceOccurrenceECStructure
 *
 * Automatically generated - do not modify.
 */
package uk.nhs.nhsia.datastandards.ecds.impl;
/**
 * An XML AttendanceOccurrence_EC_Structure(@http://www.nhsia.nhs.uk/DataStandards/XMLschema/CDS/ns).
 *
 * This is a complex type.
 */
public class AttendanceOccurrenceECStructureImpl extends org.apache.xmlbeans.impl.values.XmlComplexContentImpl implements uk.nhs.nhsia.datastandards.ecds.AttendanceOccurrenceECStructure
{
    private static final long serialVersionUID = 1L;
    
    public AttendanceOccurrenceECStructureImpl(org.apache.xmlbeans.SchemaType sType)
    {
        super(sType);
    }
    
    private static final javax.xml.namespace.QName AMBULANCEDETAILS$0 = 
        new javax.xml.namespace.QName("http://www.nhsia.nhs.uk/DataStandards/XMLschema/CDS/ns", "AmbulanceDetails");
    private static final javax.xml.namespace.QName EMERGENCYCAREATTENDANCEACTIVITYCHARACTERISTICS$2 = 
        new javax.xml.namespace.QName("http://www.nhsia.nhs.uk/DataStandards/XMLschema/CDS/ns", "EmergencyCareAttendanceActivityCharacteristics");
    private static final javax.xml.namespace.QName INJURYCHARACTERISTICS$4 = 
        new javax.xml.namespace.QName("http://www.nhsia.nhs.uk/DataStandards/XMLschema/CDS/ns", "InjuryCharacteristics");
    private static final javax.xml.namespace.QName PATIENTCLINICALHISTORY$6 = 
        new javax.xml.namespace.QName("http://www.nhsia.nhs.uk/DataStandards/XMLschema/CDS/ns", "PatientClinicalHistory");
    private static final javax.xml.namespace.QName SERVICEAGREEMENTDETAILS$8 = 
        new javax.xml.namespace.QName("http://www.nhsia.nhs.uk/DataStandards/XMLschema/CDS/ns", "ServiceAgreementDetails");
    private static final javax.xml.namespace.QName CAREPROFESSIONALSEMERGENCYCARE$10 = 
        new javax.xml.namespace.QName("http://www.nhsia.nhs.uk/DataStandards/XMLschema/CDS/ns", "CareProfessionals_EmergencyCare");
    private static final javax.xml.namespace.QName EMERGENCYCAREDIAGNOSESSNOMEDCT$12 = 
        new javax.xml.namespace.QName("http://www.nhsia.nhs.uk/DataStandards/XMLschema/CDS/ns", "EmergencyCareDiagnoses_SnomedCt");
    private static final javax.xml.namespace.QName EMERGENCYCAREINVESTIGATIONSSNOMEDCT$14 = 
        new javax.xml.namespace.QName("http://www.nhsia.nhs.uk/DataStandards/XMLschema/CDS/ns", "EmergencyCareInvestigations_SnomedCt");
    private static final javax.xml.namespace.QName EMERGENCYCARETREATMENTSSNOMEDCT$16 = 
        new javax.xml.namespace.QName("http://www.nhsia.nhs.uk/DataStandards/XMLschema/CDS/ns", "EmergencyCareTreatments_SnomedCt");
    private static final javax.xml.namespace.QName REFERRALSTOOTHERSERVICES$18 = 
        new javax.xml.namespace.QName("http://www.nhsia.nhs.uk/DataStandards/XMLschema/CDS/ns", "ReferralsToOtherServices");
    private static final javax.xml.namespace.QName DISCHARGEFROMEMERGENCYCARE$20 = 
        new javax.xml.namespace.QName("http://www.nhsia.nhs.uk/DataStandards/XMLschema/CDS/ns", "DischargeFromEmergencyCare");
    private static final javax.xml.namespace.QName RESEARCHANDDISEASEOUTBREAKNOTIFICATION$22 = 
        new javax.xml.namespace.QName("http://www.nhsia.nhs.uk/DataStandards/XMLschema/CDS/ns", "ResearchAndDiseaseOutbreakNotification");
    
    
    /**
     * Gets the "AmbulanceDetails" element
     */
    public uk.nhs.nhsia.datastandards.ecds.AttendanceOccurrenceECStructure.AmbulanceDetails getAmbulanceDetails()
    {
        synchronized (monitor())
        {
            check_orphaned();
            uk.nhs.nhsia.datastandards.ecds.AttendanceOccurrenceECStructure.AmbulanceDetails target = null;
            target = (uk.nhs.nhsia.datastandards.ecds.AttendanceOccurrenceECStructure.AmbulanceDetails)get_store().find_element_user(AMBULANCEDETAILS$0, 0);
            if (target == null)
            {
                return null;
            }
            return target;
        }
    }
    
    /**
     * True if has "AmbulanceDetails" element
     */
    public boolean isSetAmbulanceDetails()
    {
        synchronized (monitor())
        {
            check_orphaned();
            return get_store().count_elements(AMBULANCEDETAILS$0) != 0;
        }
    }
    
    /**
     * Sets the "AmbulanceDetails" element
     */
    public void setAmbulanceDetails(uk.nhs.nhsia.datastandards.ecds.AttendanceOccurrenceECStructure.AmbulanceDetails ambulanceDetails)
    {
        generatedSetterHelperImpl(ambulanceDetails, AMBULANCEDETAILS$0, 0, org.apache.xmlbeans.impl.values.XmlObjectBase.KIND_SETTERHELPER_SINGLETON);
    }
    
    /**
     * Appends and returns a new empty "AmbulanceDetails" element
     */
    public uk.nhs.nhsia.datastandards.ecds.AttendanceOccurrenceECStructure.AmbulanceDetails addNewAmbulanceDetails()
    {
        synchronized (monitor())
        {
            check_orphaned();
            uk.nhs.nhsia.datastandards.ecds.AttendanceOccurrenceECStructure.AmbulanceDetails target = null;
            target = (uk.nhs.nhsia.datastandards.ecds.AttendanceOccurrenceECStructure.AmbulanceDetails)get_store().add_element_user(AMBULANCEDETAILS$0);
            return target;
        }
    }
    
    /**
     * Unsets the "AmbulanceDetails" element
     */
    public void unsetAmbulanceDetails()
    {
        synchronized (monitor())
        {
            check_orphaned();
            get_store().remove_element(AMBULANCEDETAILS$0, 0);
        }
    }
    
    /**
     * Gets the "EmergencyCareAttendanceActivityCharacteristics" element
     */
    public uk.nhs.nhsia.datastandards.ecds.AttendanceOccurrenceECStructure.EmergencyCareAttendanceActivityCharacteristics getEmergencyCareAttendanceActivityCharacteristics()
    {
        synchronized (monitor())
        {
            check_orphaned();
            uk.nhs.nhsia.datastandards.ecds.AttendanceOccurrenceECStructure.EmergencyCareAttendanceActivityCharacteristics target = null;
            target = (uk.nhs.nhsia.datastandards.ecds.AttendanceOccurrenceECStructure.EmergencyCareAttendanceActivityCharacteristics)get_store().find_element_user(EMERGENCYCAREATTENDANCEACTIVITYCHARACTERISTICS$2, 0);
            if (target == null)
            {
                return null;
            }
            return target;
        }
    }
    
    /**
     * Sets the "EmergencyCareAttendanceActivityCharacteristics" element
     */
    public void setEmergencyCareAttendanceActivityCharacteristics(uk.nhs.nhsia.datastandards.ecds.AttendanceOccurrenceECStructure.EmergencyCareAttendanceActivityCharacteristics emergencyCareAttendanceActivityCharacteristics)
    {
        generatedSetterHelperImpl(emergencyCareAttendanceActivityCharacteristics, EMERGENCYCAREATTENDANCEACTIVITYCHARACTERISTICS$2, 0, org.apache.xmlbeans.impl.values.XmlObjectBase.KIND_SETTERHELPER_SINGLETON);
    }
    
    /**
     * Appends and returns a new empty "EmergencyCareAttendanceActivityCharacteristics" element
     */
    public uk.nhs.nhsia.datastandards.ecds.AttendanceOccurrenceECStructure.EmergencyCareAttendanceActivityCharacteristics addNewEmergencyCareAttendanceActivityCharacteristics()
    {
        synchronized (monitor())
        {
            check_orphaned();
            uk.nhs.nhsia.datastandards.ecds.AttendanceOccurrenceECStructure.EmergencyCareAttendanceActivityCharacteristics target = null;
            target = (uk.nhs.nhsia.datastandards.ecds.AttendanceOccurrenceECStructure.EmergencyCareAttendanceActivityCharacteristics)get_store().add_element_user(EMERGENCYCAREATTENDANCEACTIVITYCHARACTERISTICS$2);
            return target;
        }
    }
    
    /**
     * Gets the "InjuryCharacteristics" element
     */
    public uk.nhs.nhsia.datastandards.ecds.AttendanceOccurrenceECStructure.InjuryCharacteristics getInjuryCharacteristics()
    {
        synchronized (monitor())
        {
            check_orphaned();
            uk.nhs.nhsia.datastandards.ecds.AttendanceOccurrenceECStructure.InjuryCharacteristics target = null;
            target = (uk.nhs.nhsia.datastandards.ecds.AttendanceOccurrenceECStructure.InjuryCharacteristics)get_store().find_element_user(INJURYCHARACTERISTICS$4, 0);
            if (target == null)
            {
                return null;
            }
            return target;
        }
    }
    
    /**
     * True if has "InjuryCharacteristics" element
     */
    public boolean isSetInjuryCharacteristics()
    {
        synchronized (monitor())
        {
            check_orphaned();
            return get_store().count_elements(INJURYCHARACTERISTICS$4) != 0;
        }
    }
    
    /**
     * Sets the "InjuryCharacteristics" element
     */
    public void setInjuryCharacteristics(uk.nhs.nhsia.datastandards.ecds.AttendanceOccurrenceECStructure.InjuryCharacteristics injuryCharacteristics)
    {
        generatedSetterHelperImpl(injuryCharacteristics, INJURYCHARACTERISTICS$4, 0, org.apache.xmlbeans.impl.values.XmlObjectBase.KIND_SETTERHELPER_SINGLETON);
    }
    
    /**
     * Appends and returns a new empty "InjuryCharacteristics" element
     */
    public uk.nhs.nhsia.datastandards.ecds.AttendanceOccurrenceECStructure.InjuryCharacteristics addNewInjuryCharacteristics()
    {
        synchronized (monitor())
        {
            check_orphaned();
            uk.nhs.nhsia.datastandards.ecds.AttendanceOccurrenceECStructure.InjuryCharacteristics target = null;
            target = (uk.nhs.nhsia.datastandards.ecds.AttendanceOccurrenceECStructure.InjuryCharacteristics)get_store().add_element_user(INJURYCHARACTERISTICS$4);
            return target;
        }
    }
    
    /**
     * Unsets the "InjuryCharacteristics" element
     */
    public void unsetInjuryCharacteristics()
    {
        synchronized (monitor())
        {
            check_orphaned();
            get_store().remove_element(INJURYCHARACTERISTICS$4, 0);
        }
    }
    
    /**
     * Gets the "PatientClinicalHistory" element
     */
    public uk.nhs.nhsia.datastandards.ecds.AttendanceOccurrenceECStructure.PatientClinicalHistory getPatientClinicalHistory()
    {
        synchronized (monitor())
        {
            check_orphaned();
            uk.nhs.nhsia.datastandards.ecds.AttendanceOccurrenceECStructure.PatientClinicalHistory target = null;
            target = (uk.nhs.nhsia.datastandards.ecds.AttendanceOccurrenceECStructure.PatientClinicalHistory)get_store().find_element_user(PATIENTCLINICALHISTORY$6, 0);
            if (target == null)
            {
                return null;
            }
            return target;
        }
    }
    
    /**
     * True if has "PatientClinicalHistory" element
     */
    public boolean isSetPatientClinicalHistory()
    {
        synchronized (monitor())
        {
            check_orphaned();
            return get_store().count_elements(PATIENTCLINICALHISTORY$6) != 0;
        }
    }
    
    /**
     * Sets the "PatientClinicalHistory" element
     */
    public void setPatientClinicalHistory(uk.nhs.nhsia.datastandards.ecds.AttendanceOccurrenceECStructure.PatientClinicalHistory patientClinicalHistory)
    {
        generatedSetterHelperImpl(patientClinicalHistory, PATIENTCLINICALHISTORY$6, 0, org.apache.xmlbeans.impl.values.XmlObjectBase.KIND_SETTERHELPER_SINGLETON);
    }
    
    /**
     * Appends and returns a new empty "PatientClinicalHistory" element
     */
    public uk.nhs.nhsia.datastandards.ecds.AttendanceOccurrenceECStructure.PatientClinicalHistory addNewPatientClinicalHistory()
    {
        synchronized (monitor())
        {
            check_orphaned();
            uk.nhs.nhsia.datastandards.ecds.AttendanceOccurrenceECStructure.PatientClinicalHistory target = null;
            target = (uk.nhs.nhsia.datastandards.ecds.AttendanceOccurrenceECStructure.PatientClinicalHistory)get_store().add_element_user(PATIENTCLINICALHISTORY$6);
            return target;
        }
    }
    
    /**
     * Unsets the "PatientClinicalHistory" element
     */
    public void unsetPatientClinicalHistory()
    {
        synchronized (monitor())
        {
            check_orphaned();
            get_store().remove_element(PATIENTCLINICALHISTORY$6, 0);
        }
    }
    
    /**
     * Gets the "ServiceAgreementDetails" element
     */
    public uk.nhs.nhsia.datastandards.ecds.AttendanceOccurrenceECStructure.ServiceAgreementDetails getServiceAgreementDetails()
    {
        synchronized (monitor())
        {
            check_orphaned();
            uk.nhs.nhsia.datastandards.ecds.AttendanceOccurrenceECStructure.ServiceAgreementDetails target = null;
            target = (uk.nhs.nhsia.datastandards.ecds.AttendanceOccurrenceECStructure.ServiceAgreementDetails)get_store().find_element_user(SERVICEAGREEMENTDETAILS$8, 0);
            if (target == null)
            {
                return null;
            }
            return target;
        }
    }
    
    /**
     * Sets the "ServiceAgreementDetails" element
     */
    public void setServiceAgreementDetails(uk.nhs.nhsia.datastandards.ecds.AttendanceOccurrenceECStructure.ServiceAgreementDetails serviceAgreementDetails)
    {
        generatedSetterHelperImpl(serviceAgreementDetails, SERVICEAGREEMENTDETAILS$8, 0, org.apache.xmlbeans.impl.values.XmlObjectBase.KIND_SETTERHELPER_SINGLETON);
    }
    
    /**
     * Appends and returns a new empty "ServiceAgreementDetails" element
     */
    public uk.nhs.nhsia.datastandards.ecds.AttendanceOccurrenceECStructure.ServiceAgreementDetails addNewServiceAgreementDetails()
    {
        synchronized (monitor())
        {
            check_orphaned();
            uk.nhs.nhsia.datastandards.ecds.AttendanceOccurrenceECStructure.ServiceAgreementDetails target = null;
            target = (uk.nhs.nhsia.datastandards.ecds.AttendanceOccurrenceECStructure.ServiceAgreementDetails)get_store().add_element_user(SERVICEAGREEMENTDETAILS$8);
            return target;
        }
    }
    
    /**
     * Gets array of all "CareProfessionals_EmergencyCare" elements
     */
    public uk.nhs.nhsia.datastandards.ecds.AttendanceOccurrenceECStructure.CareProfessionalsEmergencyCare[] getCareProfessionalsEmergencyCareArray()
    {
        synchronized (monitor())
        {
            check_orphaned();
            java.util.List targetList = new java.util.ArrayList();
            get_store().find_all_element_users(CAREPROFESSIONALSEMERGENCYCARE$10, targetList);
            uk.nhs.nhsia.datastandards.ecds.AttendanceOccurrenceECStructure.CareProfessionalsEmergencyCare[] result = new uk.nhs.nhsia.datastandards.ecds.AttendanceOccurrenceECStructure.CareProfessionalsEmergencyCare[targetList.size()];
            targetList.toArray(result);
            return result;
        }
    }
    
    /**
     * Gets ith "CareProfessionals_EmergencyCare" element
     */
    public uk.nhs.nhsia.datastandards.ecds.AttendanceOccurrenceECStructure.CareProfessionalsEmergencyCare getCareProfessionalsEmergencyCareArray(int i)
    {
        synchronized (monitor())
        {
            check_orphaned();
            uk.nhs.nhsia.datastandards.ecds.AttendanceOccurrenceECStructure.CareProfessionalsEmergencyCare target = null;
            target = (uk.nhs.nhsia.datastandards.ecds.AttendanceOccurrenceECStructure.CareProfessionalsEmergencyCare)get_store().find_element_user(CAREPROFESSIONALSEMERGENCYCARE$10, i);
            if (target == null)
            {
                throw new IndexOutOfBoundsException();
            }
            return target;
        }
    }
    
    /**
     * Returns number of "CareProfessionals_EmergencyCare" element
     */
    public int sizeOfCareProfessionalsEmergencyCareArray()
    {
        synchronized (monitor())
        {
            check_orphaned();
            return get_store().count_elements(CAREPROFESSIONALSEMERGENCYCARE$10);
        }
    }
    
    /**
     * Sets array of all "CareProfessionals_EmergencyCare" element  WARNING: This method is not atomicaly synchronized.
     */
    public void setCareProfessionalsEmergencyCareArray(uk.nhs.nhsia.datastandards.ecds.AttendanceOccurrenceECStructure.CareProfessionalsEmergencyCare[] careProfessionalsEmergencyCareArray)
    {
        check_orphaned();
        arraySetterHelper(careProfessionalsEmergencyCareArray, CAREPROFESSIONALSEMERGENCYCARE$10);
    }
    
    /**
     * Sets ith "CareProfessionals_EmergencyCare" element
     */
    public void setCareProfessionalsEmergencyCareArray(int i, uk.nhs.nhsia.datastandards.ecds.AttendanceOccurrenceECStructure.CareProfessionalsEmergencyCare careProfessionalsEmergencyCare)
    {
        generatedSetterHelperImpl(careProfessionalsEmergencyCare, CAREPROFESSIONALSEMERGENCYCARE$10, i, org.apache.xmlbeans.impl.values.XmlObjectBase.KIND_SETTERHELPER_ARRAYITEM);
    }
    
    /**
     * Inserts and returns a new empty value (as xml) as the ith "CareProfessionals_EmergencyCare" element
     */
    public uk.nhs.nhsia.datastandards.ecds.AttendanceOccurrenceECStructure.CareProfessionalsEmergencyCare insertNewCareProfessionalsEmergencyCare(int i)
    {
        synchronized (monitor())
        {
            check_orphaned();
            uk.nhs.nhsia.datastandards.ecds.AttendanceOccurrenceECStructure.CareProfessionalsEmergencyCare target = null;
            target = (uk.nhs.nhsia.datastandards.ecds.AttendanceOccurrenceECStructure.CareProfessionalsEmergencyCare)get_store().insert_element_user(CAREPROFESSIONALSEMERGENCYCARE$10, i);
            return target;
        }
    }
    
    /**
     * Appends and returns a new empty value (as xml) as the last "CareProfessionals_EmergencyCare" element
     */
    public uk.nhs.nhsia.datastandards.ecds.AttendanceOccurrenceECStructure.CareProfessionalsEmergencyCare addNewCareProfessionalsEmergencyCare()
    {
        synchronized (monitor())
        {
            check_orphaned();
            uk.nhs.nhsia.datastandards.ecds.AttendanceOccurrenceECStructure.CareProfessionalsEmergencyCare target = null;
            target = (uk.nhs.nhsia.datastandards.ecds.AttendanceOccurrenceECStructure.CareProfessionalsEmergencyCare)get_store().add_element_user(CAREPROFESSIONALSEMERGENCYCARE$10);
            return target;
        }
    }
    
    /**
     * Removes the ith "CareProfessionals_EmergencyCare" element
     */
    public void removeCareProfessionalsEmergencyCare(int i)
    {
        synchronized (monitor())
        {
            check_orphaned();
            get_store().remove_element(CAREPROFESSIONALSEMERGENCYCARE$10, i);
        }
    }
    
    /**
     * Gets array of all "EmergencyCareDiagnoses_SnomedCt" elements
     */
    public uk.nhs.nhsia.datastandards.ecds.AttendanceOccurrenceECStructure.EmergencyCareDiagnosesSnomedCt[] getEmergencyCareDiagnosesSnomedCtArray()
    {
        synchronized (monitor())
        {
            check_orphaned();
            java.util.List targetList = new java.util.ArrayList();
            get_store().find_all_element_users(EMERGENCYCAREDIAGNOSESSNOMEDCT$12, targetList);
            uk.nhs.nhsia.datastandards.ecds.AttendanceOccurrenceECStructure.EmergencyCareDiagnosesSnomedCt[] result = new uk.nhs.nhsia.datastandards.ecds.AttendanceOccurrenceECStructure.EmergencyCareDiagnosesSnomedCt[targetList.size()];
            targetList.toArray(result);
            return result;
        }
    }
    
    /**
     * Gets ith "EmergencyCareDiagnoses_SnomedCt" element
     */
    public uk.nhs.nhsia.datastandards.ecds.AttendanceOccurrenceECStructure.EmergencyCareDiagnosesSnomedCt getEmergencyCareDiagnosesSnomedCtArray(int i)
    {
        synchronized (monitor())
        {
            check_orphaned();
            uk.nhs.nhsia.datastandards.ecds.AttendanceOccurrenceECStructure.EmergencyCareDiagnosesSnomedCt target = null;
            target = (uk.nhs.nhsia.datastandards.ecds.AttendanceOccurrenceECStructure.EmergencyCareDiagnosesSnomedCt)get_store().find_element_user(EMERGENCYCAREDIAGNOSESSNOMEDCT$12, i);
            if (target == null)
            {
                throw new IndexOutOfBoundsException();
            }
            return target;
        }
    }
    
    /**
     * Returns number of "EmergencyCareDiagnoses_SnomedCt" element
     */
    public int sizeOfEmergencyCareDiagnosesSnomedCtArray()
    {
        synchronized (monitor())
        {
            check_orphaned();
            return get_store().count_elements(EMERGENCYCAREDIAGNOSESSNOMEDCT$12);
        }
    }
    
    /**
     * Sets array of all "EmergencyCareDiagnoses_SnomedCt" element  WARNING: This method is not atomicaly synchronized.
     */
    public void setEmergencyCareDiagnosesSnomedCtArray(uk.nhs.nhsia.datastandards.ecds.AttendanceOccurrenceECStructure.EmergencyCareDiagnosesSnomedCt[] emergencyCareDiagnosesSnomedCtArray)
    {
        check_orphaned();
        arraySetterHelper(emergencyCareDiagnosesSnomedCtArray, EMERGENCYCAREDIAGNOSESSNOMEDCT$12);
    }
    
    /**
     * Sets ith "EmergencyCareDiagnoses_SnomedCt" element
     */
    public void setEmergencyCareDiagnosesSnomedCtArray(int i, uk.nhs.nhsia.datastandards.ecds.AttendanceOccurrenceECStructure.EmergencyCareDiagnosesSnomedCt emergencyCareDiagnosesSnomedCt)
    {
        generatedSetterHelperImpl(emergencyCareDiagnosesSnomedCt, EMERGENCYCAREDIAGNOSESSNOMEDCT$12, i, org.apache.xmlbeans.impl.values.XmlObjectBase.KIND_SETTERHELPER_ARRAYITEM);
    }
    
    /**
     * Inserts and returns a new empty value (as xml) as the ith "EmergencyCareDiagnoses_SnomedCt" element
     */
    public uk.nhs.nhsia.datastandards.ecds.AttendanceOccurrenceECStructure.EmergencyCareDiagnosesSnomedCt insertNewEmergencyCareDiagnosesSnomedCt(int i)
    {
        synchronized (monitor())
        {
            check_orphaned();
            uk.nhs.nhsia.datastandards.ecds.AttendanceOccurrenceECStructure.EmergencyCareDiagnosesSnomedCt target = null;
            target = (uk.nhs.nhsia.datastandards.ecds.AttendanceOccurrenceECStructure.EmergencyCareDiagnosesSnomedCt)get_store().insert_element_user(EMERGENCYCAREDIAGNOSESSNOMEDCT$12, i);
            return target;
        }
    }
    
    /**
     * Appends and returns a new empty value (as xml) as the last "EmergencyCareDiagnoses_SnomedCt" element
     */
    public uk.nhs.nhsia.datastandards.ecds.AttendanceOccurrenceECStructure.EmergencyCareDiagnosesSnomedCt addNewEmergencyCareDiagnosesSnomedCt()
    {
        synchronized (monitor())
        {
            check_orphaned();
            uk.nhs.nhsia.datastandards.ecds.AttendanceOccurrenceECStructure.EmergencyCareDiagnosesSnomedCt target = null;
            target = (uk.nhs.nhsia.datastandards.ecds.AttendanceOccurrenceECStructure.EmergencyCareDiagnosesSnomedCt)get_store().add_element_user(EMERGENCYCAREDIAGNOSESSNOMEDCT$12);
            return target;
        }
    }
    
    /**
     * Removes the ith "EmergencyCareDiagnoses_SnomedCt" element
     */
    public void removeEmergencyCareDiagnosesSnomedCt(int i)
    {
        synchronized (monitor())
        {
            check_orphaned();
            get_store().remove_element(EMERGENCYCAREDIAGNOSESSNOMEDCT$12, i);
        }
    }
    
    /**
     * Gets array of all "EmergencyCareInvestigations_SnomedCt" elements
     */
    public uk.nhs.nhsia.datastandards.ecds.AttendanceOccurrenceECStructure.EmergencyCareInvestigationsSnomedCt[] getEmergencyCareInvestigationsSnomedCtArray()
    {
        synchronized (monitor())
        {
            check_orphaned();
            java.util.List targetList = new java.util.ArrayList();
            get_store().find_all_element_users(EMERGENCYCAREINVESTIGATIONSSNOMEDCT$14, targetList);
            uk.nhs.nhsia.datastandards.ecds.AttendanceOccurrenceECStructure.EmergencyCareInvestigationsSnomedCt[] result = new uk.nhs.nhsia.datastandards.ecds.AttendanceOccurrenceECStructure.EmergencyCareInvestigationsSnomedCt[targetList.size()];
            targetList.toArray(result);
            return result;
        }
    }
    
    /**
     * Gets ith "EmergencyCareInvestigations_SnomedCt" element
     */
    public uk.nhs.nhsia.datastandards.ecds.AttendanceOccurrenceECStructure.EmergencyCareInvestigationsSnomedCt getEmergencyCareInvestigationsSnomedCtArray(int i)
    {
        synchronized (monitor())
        {
            check_orphaned();
            uk.nhs.nhsia.datastandards.ecds.AttendanceOccurrenceECStructure.EmergencyCareInvestigationsSnomedCt target = null;
            target = (uk.nhs.nhsia.datastandards.ecds.AttendanceOccurrenceECStructure.EmergencyCareInvestigationsSnomedCt)get_store().find_element_user(EMERGENCYCAREINVESTIGATIONSSNOMEDCT$14, i);
            if (target == null)
            {
                throw new IndexOutOfBoundsException();
            }
            return target;
        }
    }
    
    /**
     * Returns number of "EmergencyCareInvestigations_SnomedCt" element
     */
    public int sizeOfEmergencyCareInvestigationsSnomedCtArray()
    {
        synchronized (monitor())
        {
            check_orphaned();
            return get_store().count_elements(EMERGENCYCAREINVESTIGATIONSSNOMEDCT$14);
        }
    }
    
    /**
     * Sets array of all "EmergencyCareInvestigations_SnomedCt" element  WARNING: This method is not atomicaly synchronized.
     */
    public void setEmergencyCareInvestigationsSnomedCtArray(uk.nhs.nhsia.datastandards.ecds.AttendanceOccurrenceECStructure.EmergencyCareInvestigationsSnomedCt[] emergencyCareInvestigationsSnomedCtArray)
    {
        check_orphaned();
        arraySetterHelper(emergencyCareInvestigationsSnomedCtArray, EMERGENCYCAREINVESTIGATIONSSNOMEDCT$14);
    }
    
    /**
     * Sets ith "EmergencyCareInvestigations_SnomedCt" element
     */
    public void setEmergencyCareInvestigationsSnomedCtArray(int i, uk.nhs.nhsia.datastandards.ecds.AttendanceOccurrenceECStructure.EmergencyCareInvestigationsSnomedCt emergencyCareInvestigationsSnomedCt)
    {
        generatedSetterHelperImpl(emergencyCareInvestigationsSnomedCt, EMERGENCYCAREINVESTIGATIONSSNOMEDCT$14, i, org.apache.xmlbeans.impl.values.XmlObjectBase.KIND_SETTERHELPER_ARRAYITEM);
    }
    
    /**
     * Inserts and returns a new empty value (as xml) as the ith "EmergencyCareInvestigations_SnomedCt" element
     */
    public uk.nhs.nhsia.datastandards.ecds.AttendanceOccurrenceECStructure.EmergencyCareInvestigationsSnomedCt insertNewEmergencyCareInvestigationsSnomedCt(int i)
    {
        synchronized (monitor())
        {
            check_orphaned();
            uk.nhs.nhsia.datastandards.ecds.AttendanceOccurrenceECStructure.EmergencyCareInvestigationsSnomedCt target = null;
            target = (uk.nhs.nhsia.datastandards.ecds.AttendanceOccurrenceECStructure.EmergencyCareInvestigationsSnomedCt)get_store().insert_element_user(EMERGENCYCAREINVESTIGATIONSSNOMEDCT$14, i);
            return target;
        }
    }
    
    /**
     * Appends and returns a new empty value (as xml) as the last "EmergencyCareInvestigations_SnomedCt" element
     */
    public uk.nhs.nhsia.datastandards.ecds.AttendanceOccurrenceECStructure.EmergencyCareInvestigationsSnomedCt addNewEmergencyCareInvestigationsSnomedCt()
    {
        synchronized (monitor())
        {
            check_orphaned();
            uk.nhs.nhsia.datastandards.ecds.AttendanceOccurrenceECStructure.EmergencyCareInvestigationsSnomedCt target = null;
            target = (uk.nhs.nhsia.datastandards.ecds.AttendanceOccurrenceECStructure.EmergencyCareInvestigationsSnomedCt)get_store().add_element_user(EMERGENCYCAREINVESTIGATIONSSNOMEDCT$14);
            return target;
        }
    }
    
    /**
     * Removes the ith "EmergencyCareInvestigations_SnomedCt" element
     */
    public void removeEmergencyCareInvestigationsSnomedCt(int i)
    {
        synchronized (monitor())
        {
            check_orphaned();
            get_store().remove_element(EMERGENCYCAREINVESTIGATIONSSNOMEDCT$14, i);
        }
    }
    
    /**
     * Gets array of all "EmergencyCareTreatments_SnomedCt" elements
     */
    public uk.nhs.nhsia.datastandards.ecds.AttendanceOccurrenceECStructure.EmergencyCareTreatmentsSnomedCt[] getEmergencyCareTreatmentsSnomedCtArray()
    {
        synchronized (monitor())
        {
            check_orphaned();
            java.util.List targetList = new java.util.ArrayList();
            get_store().find_all_element_users(EMERGENCYCARETREATMENTSSNOMEDCT$16, targetList);
            uk.nhs.nhsia.datastandards.ecds.AttendanceOccurrenceECStructure.EmergencyCareTreatmentsSnomedCt[] result = new uk.nhs.nhsia.datastandards.ecds.AttendanceOccurrenceECStructure.EmergencyCareTreatmentsSnomedCt[targetList.size()];
            targetList.toArray(result);
            return result;
        }
    }
    
    /**
     * Gets ith "EmergencyCareTreatments_SnomedCt" element
     */
    public uk.nhs.nhsia.datastandards.ecds.AttendanceOccurrenceECStructure.EmergencyCareTreatmentsSnomedCt getEmergencyCareTreatmentsSnomedCtArray(int i)
    {
        synchronized (monitor())
        {
            check_orphaned();
            uk.nhs.nhsia.datastandards.ecds.AttendanceOccurrenceECStructure.EmergencyCareTreatmentsSnomedCt target = null;
            target = (uk.nhs.nhsia.datastandards.ecds.AttendanceOccurrenceECStructure.EmergencyCareTreatmentsSnomedCt)get_store().find_element_user(EMERGENCYCARETREATMENTSSNOMEDCT$16, i);
            if (target == null)
            {
                throw new IndexOutOfBoundsException();
            }
            return target;
        }
    }
    
    /**
     * Returns number of "EmergencyCareTreatments_SnomedCt" element
     */
    public int sizeOfEmergencyCareTreatmentsSnomedCtArray()
    {
        synchronized (monitor())
        {
            check_orphaned();
            return get_store().count_elements(EMERGENCYCARETREATMENTSSNOMEDCT$16);
        }
    }
    
    /**
     * Sets array of all "EmergencyCareTreatments_SnomedCt" element  WARNING: This method is not atomicaly synchronized.
     */
    public void setEmergencyCareTreatmentsSnomedCtArray(uk.nhs.nhsia.datastandards.ecds.AttendanceOccurrenceECStructure.EmergencyCareTreatmentsSnomedCt[] emergencyCareTreatmentsSnomedCtArray)
    {
        check_orphaned();
        arraySetterHelper(emergencyCareTreatmentsSnomedCtArray, EMERGENCYCARETREATMENTSSNOMEDCT$16);
    }
    
    /**
     * Sets ith "EmergencyCareTreatments_SnomedCt" element
     */
    public void setEmergencyCareTreatmentsSnomedCtArray(int i, uk.nhs.nhsia.datastandards.ecds.AttendanceOccurrenceECStructure.EmergencyCareTreatmentsSnomedCt emergencyCareTreatmentsSnomedCt)
    {
        generatedSetterHelperImpl(emergencyCareTreatmentsSnomedCt, EMERGENCYCARETREATMENTSSNOMEDCT$16, i, org.apache.xmlbeans.impl.values.XmlObjectBase.KIND_SETTERHELPER_ARRAYITEM);
    }
    
    /**
     * Inserts and returns a new empty value (as xml) as the ith "EmergencyCareTreatments_SnomedCt" element
     */
    public uk.nhs.nhsia.datastandards.ecds.AttendanceOccurrenceECStructure.EmergencyCareTreatmentsSnomedCt insertNewEmergencyCareTreatmentsSnomedCt(int i)
    {
        synchronized (monitor())
        {
            check_orphaned();
            uk.nhs.nhsia.datastandards.ecds.AttendanceOccurrenceECStructure.EmergencyCareTreatmentsSnomedCt target = null;
            target = (uk.nhs.nhsia.datastandards.ecds.AttendanceOccurrenceECStructure.EmergencyCareTreatmentsSnomedCt)get_store().insert_element_user(EMERGENCYCARETREATMENTSSNOMEDCT$16, i);
            return target;
        }
    }
    
    /**
     * Appends and returns a new empty value (as xml) as the last "EmergencyCareTreatments_SnomedCt" element
     */
    public uk.nhs.nhsia.datastandards.ecds.AttendanceOccurrenceECStructure.EmergencyCareTreatmentsSnomedCt addNewEmergencyCareTreatmentsSnomedCt()
    {
        synchronized (monitor())
        {
            check_orphaned();
            uk.nhs.nhsia.datastandards.ecds.AttendanceOccurrenceECStructure.EmergencyCareTreatmentsSnomedCt target = null;
            target = (uk.nhs.nhsia.datastandards.ecds.AttendanceOccurrenceECStructure.EmergencyCareTreatmentsSnomedCt)get_store().add_element_user(EMERGENCYCARETREATMENTSSNOMEDCT$16);
            return target;
        }
    }
    
    /**
     * Removes the ith "EmergencyCareTreatments_SnomedCt" element
     */
    public void removeEmergencyCareTreatmentsSnomedCt(int i)
    {
        synchronized (monitor())
        {
            check_orphaned();
            get_store().remove_element(EMERGENCYCARETREATMENTSSNOMEDCT$16, i);
        }
    }
    
    /**
     * Gets array of all "ReferralsToOtherServices" elements
     */
    public uk.nhs.nhsia.datastandards.ecds.AttendanceOccurrenceECStructure.ReferralsToOtherServices[] getReferralsToOtherServicesArray()
    {
        synchronized (monitor())
        {
            check_orphaned();
            java.util.List targetList = new java.util.ArrayList();
            get_store().find_all_element_users(REFERRALSTOOTHERSERVICES$18, targetList);
            uk.nhs.nhsia.datastandards.ecds.AttendanceOccurrenceECStructure.ReferralsToOtherServices[] result = new uk.nhs.nhsia.datastandards.ecds.AttendanceOccurrenceECStructure.ReferralsToOtherServices[targetList.size()];
            targetList.toArray(result);
            return result;
        }
    }
    
    /**
     * Gets ith "ReferralsToOtherServices" element
     */
    public uk.nhs.nhsia.datastandards.ecds.AttendanceOccurrenceECStructure.ReferralsToOtherServices getReferralsToOtherServicesArray(int i)
    {
        synchronized (monitor())
        {
            check_orphaned();
            uk.nhs.nhsia.datastandards.ecds.AttendanceOccurrenceECStructure.ReferralsToOtherServices target = null;
            target = (uk.nhs.nhsia.datastandards.ecds.AttendanceOccurrenceECStructure.ReferralsToOtherServices)get_store().find_element_user(REFERRALSTOOTHERSERVICES$18, i);
            if (target == null)
            {
                throw new IndexOutOfBoundsException();
            }
            return target;
        }
    }
    
    /**
     * Returns number of "ReferralsToOtherServices" element
     */
    public int sizeOfReferralsToOtherServicesArray()
    {
        synchronized (monitor())
        {
            check_orphaned();
            return get_store().count_elements(REFERRALSTOOTHERSERVICES$18);
        }
    }
    
    /**
     * Sets array of all "ReferralsToOtherServices" element  WARNING: This method is not atomicaly synchronized.
     */
    public void setReferralsToOtherServicesArray(uk.nhs.nhsia.datastandards.ecds.AttendanceOccurrenceECStructure.ReferralsToOtherServices[] referralsToOtherServicesArray)
    {
        check_orphaned();
        arraySetterHelper(referralsToOtherServicesArray, REFERRALSTOOTHERSERVICES$18);
    }
    
    /**
     * Sets ith "ReferralsToOtherServices" element
     */
    public void setReferralsToOtherServicesArray(int i, uk.nhs.nhsia.datastandards.ecds.AttendanceOccurrenceECStructure.ReferralsToOtherServices referralsToOtherServices)
    {
        generatedSetterHelperImpl(referralsToOtherServices, REFERRALSTOOTHERSERVICES$18, i, org.apache.xmlbeans.impl.values.XmlObjectBase.KIND_SETTERHELPER_ARRAYITEM);
    }
    
    /**
     * Inserts and returns a new empty value (as xml) as the ith "ReferralsToOtherServices" element
     */
    public uk.nhs.nhsia.datastandards.ecds.AttendanceOccurrenceECStructure.ReferralsToOtherServices insertNewReferralsToOtherServices(int i)
    {
        synchronized (monitor())
        {
            check_orphaned();
            uk.nhs.nhsia.datastandards.ecds.AttendanceOccurrenceECStructure.ReferralsToOtherServices target = null;
            target = (uk.nhs.nhsia.datastandards.ecds.AttendanceOccurrenceECStructure.ReferralsToOtherServices)get_store().insert_element_user(REFERRALSTOOTHERSERVICES$18, i);
            return target;
        }
    }
    
    /**
     * Appends and returns a new empty value (as xml) as the last "ReferralsToOtherServices" element
     */
    public uk.nhs.nhsia.datastandards.ecds.AttendanceOccurrenceECStructure.ReferralsToOtherServices addNewReferralsToOtherServices()
    {
        synchronized (monitor())
        {
            check_orphaned();
            uk.nhs.nhsia.datastandards.ecds.AttendanceOccurrenceECStructure.ReferralsToOtherServices target = null;
            target = (uk.nhs.nhsia.datastandards.ecds.AttendanceOccurrenceECStructure.ReferralsToOtherServices)get_store().add_element_user(REFERRALSTOOTHERSERVICES$18);
            return target;
        }
    }
    
    /**
     * Removes the ith "ReferralsToOtherServices" element
     */
    public void removeReferralsToOtherServices(int i)
    {
        synchronized (monitor())
        {
            check_orphaned();
            get_store().remove_element(REFERRALSTOOTHERSERVICES$18, i);
        }
    }
    
    /**
     * Gets the "DischargeFromEmergencyCare" element
     */
    public uk.nhs.nhsia.datastandards.ecds.AttendanceOccurrenceECStructure.DischargeFromEmergencyCare getDischargeFromEmergencyCare()
    {
        synchronized (monitor())
        {
            check_orphaned();
            uk.nhs.nhsia.datastandards.ecds.AttendanceOccurrenceECStructure.DischargeFromEmergencyCare target = null;
            target = (uk.nhs.nhsia.datastandards.ecds.AttendanceOccurrenceECStructure.DischargeFromEmergencyCare)get_store().find_element_user(DISCHARGEFROMEMERGENCYCARE$20, 0);
            if (target == null)
            {
                return null;
            }
            return target;
        }
    }
    
    /**
     * True if has "DischargeFromEmergencyCare" element
     */
    public boolean isSetDischargeFromEmergencyCare()
    {
        synchronized (monitor())
        {
            check_orphaned();
            return get_store().count_elements(DISCHARGEFROMEMERGENCYCARE$20) != 0;
        }
    }
    
    /**
     * Sets the "DischargeFromEmergencyCare" element
     */
    public void setDischargeFromEmergencyCare(uk.nhs.nhsia.datastandards.ecds.AttendanceOccurrenceECStructure.DischargeFromEmergencyCare dischargeFromEmergencyCare)
    {
        generatedSetterHelperImpl(dischargeFromEmergencyCare, DISCHARGEFROMEMERGENCYCARE$20, 0, org.apache.xmlbeans.impl.values.XmlObjectBase.KIND_SETTERHELPER_SINGLETON);
    }
    
    /**
     * Appends and returns a new empty "DischargeFromEmergencyCare" element
     */
    public uk.nhs.nhsia.datastandards.ecds.AttendanceOccurrenceECStructure.DischargeFromEmergencyCare addNewDischargeFromEmergencyCare()
    {
        synchronized (monitor())
        {
            check_orphaned();
            uk.nhs.nhsia.datastandards.ecds.AttendanceOccurrenceECStructure.DischargeFromEmergencyCare target = null;
            target = (uk.nhs.nhsia.datastandards.ecds.AttendanceOccurrenceECStructure.DischargeFromEmergencyCare)get_store().add_element_user(DISCHARGEFROMEMERGENCYCARE$20);
            return target;
        }
    }
    
    /**
     * Unsets the "DischargeFromEmergencyCare" element
     */
    public void unsetDischargeFromEmergencyCare()
    {
        synchronized (monitor())
        {
            check_orphaned();
            get_store().remove_element(DISCHARGEFROMEMERGENCYCARE$20, 0);
        }
    }
    
    /**
     * Gets the "ResearchAndDiseaseOutbreakNotification" element
     */
    public uk.nhs.nhsia.datastandards.ecds.AttendanceOccurrenceECStructure.ResearchAndDiseaseOutbreakNotification getResearchAndDiseaseOutbreakNotification()
    {
        synchronized (monitor())
        {
            check_orphaned();
            uk.nhs.nhsia.datastandards.ecds.AttendanceOccurrenceECStructure.ResearchAndDiseaseOutbreakNotification target = null;
            target = (uk.nhs.nhsia.datastandards.ecds.AttendanceOccurrenceECStructure.ResearchAndDiseaseOutbreakNotification)get_store().find_element_user(RESEARCHANDDISEASEOUTBREAKNOTIFICATION$22, 0);
            if (target == null)
            {
                return null;
            }
            return target;
        }
    }
    
    /**
     * True if has "ResearchAndDiseaseOutbreakNotification" element
     */
    public boolean isSetResearchAndDiseaseOutbreakNotification()
    {
        synchronized (monitor())
        {
            check_orphaned();
            return get_store().count_elements(RESEARCHANDDISEASEOUTBREAKNOTIFICATION$22) != 0;
        }
    }
    
    /**
     * Sets the "ResearchAndDiseaseOutbreakNotification" element
     */
    public void setResearchAndDiseaseOutbreakNotification(uk.nhs.nhsia.datastandards.ecds.AttendanceOccurrenceECStructure.ResearchAndDiseaseOutbreakNotification researchAndDiseaseOutbreakNotification)
    {
        generatedSetterHelperImpl(researchAndDiseaseOutbreakNotification, RESEARCHANDDISEASEOUTBREAKNOTIFICATION$22, 0, org.apache.xmlbeans.impl.values.XmlObjectBase.KIND_SETTERHELPER_SINGLETON);
    }
    
    /**
     * Appends and returns a new empty "ResearchAndDiseaseOutbreakNotification" element
     */
    public uk.nhs.nhsia.datastandards.ecds.AttendanceOccurrenceECStructure.ResearchAndDiseaseOutbreakNotification addNewResearchAndDiseaseOutbreakNotification()
    {
        synchronized (monitor())
        {
            check_orphaned();
            uk.nhs.nhsia.datastandards.ecds.AttendanceOccurrenceECStructure.ResearchAndDiseaseOutbreakNotification target = null;
            target = (uk.nhs.nhsia.datastandards.ecds.AttendanceOccurrenceECStructure.ResearchAndDiseaseOutbreakNotification)get_store().add_element_user(RESEARCHANDDISEASEOUTBREAKNOTIFICATION$22);
            return target;
        }
    }
    
    /**
     * Unsets the "ResearchAndDiseaseOutbreakNotification" element
     */
    public void unsetResearchAndDiseaseOutbreakNotification()
    {
        synchronized (monitor())
        {
            check_orphaned();
            get_store().remove_element(RESEARCHANDDISEASEOUTBREAKNOTIFICATION$22, 0);
        }
    }
    /**
     * An XML AmbulanceDetails(@http://www.nhsia.nhs.uk/DataStandards/XMLschema/CDS/ns).
     *
     * This is a complex type.
     */
    public static class AmbulanceDetailsImpl extends org.apache.xmlbeans.impl.values.XmlComplexContentImpl implements uk.nhs.nhsia.datastandards.ecds.AttendanceOccurrenceECStructure.AmbulanceDetails
    {
        private static final long serialVersionUID = 1L;
        
        public AmbulanceDetailsImpl(org.apache.xmlbeans.SchemaType sType)
        {
            super(sType);
        }
        
        private static final javax.xml.namespace.QName AMBULANCEINCIDENTNUMBER$0 = 
            new javax.xml.namespace.QName("http://www.nhsia.nhs.uk/DataStandards/XMLschema/CDS/ns", "AmbulanceIncidentNumber");
        private static final javax.xml.namespace.QName ORGANISATIONIDENTIFIERCONVEYINGAMBULANCETRUST$2 = 
            new javax.xml.namespace.QName("http://www.nhsia.nhs.uk/DataStandards/XMLschema/CDS/ns", "OrganisationIdentifier_ConveyingAmbulanceTrust");
        
        
        /**
         * Gets the "AmbulanceIncidentNumber" element
         */
        public java.lang.String getAmbulanceIncidentNumber()
        {
            synchronized (monitor())
            {
                check_orphaned();
                org.apache.xmlbeans.SimpleValue target = null;
                target = (org.apache.xmlbeans.SimpleValue)get_store().find_element_user(AMBULANCEINCIDENTNUMBER$0, 0);
                if (target == null)
                {
                    return null;
                }
                return target.getStringValue();
            }
        }
        
        /**
         * Gets (as xml) the "AmbulanceIncidentNumber" element
         */
        public uk.nhs.nhsia.datastandards.ecds.ANMax20ECType xgetAmbulanceIncidentNumber()
        {
            synchronized (monitor())
            {
                check_orphaned();
                uk.nhs.nhsia.datastandards.ecds.ANMax20ECType target = null;
                target = (uk.nhs.nhsia.datastandards.ecds.ANMax20ECType)get_store().find_element_user(AMBULANCEINCIDENTNUMBER$0, 0);
                return target;
            }
        }
        
        /**
         * True if has "AmbulanceIncidentNumber" element
         */
        public boolean isSetAmbulanceIncidentNumber()
        {
            synchronized (monitor())
            {
                check_orphaned();
                return get_store().count_elements(AMBULANCEINCIDENTNUMBER$0) != 0;
            }
        }
        
        /**
         * Sets the "AmbulanceIncidentNumber" element
         */
        public void setAmbulanceIncidentNumber(java.lang.String ambulanceIncidentNumber)
        {
            synchronized (monitor())
            {
                check_orphaned();
                org.apache.xmlbeans.SimpleValue target = null;
                target = (org.apache.xmlbeans.SimpleValue)get_store().find_element_user(AMBULANCEINCIDENTNUMBER$0, 0);
                if (target == null)
                {
                    target = (org.apache.xmlbeans.SimpleValue)get_store().add_element_user(AMBULANCEINCIDENTNUMBER$0);
                }
                target.setStringValue(ambulanceIncidentNumber);
            }
        }
        
        /**
         * Sets (as xml) the "AmbulanceIncidentNumber" element
         */
        public void xsetAmbulanceIncidentNumber(uk.nhs.nhsia.datastandards.ecds.ANMax20ECType ambulanceIncidentNumber)
        {
            synchronized (monitor())
            {
                check_orphaned();
                uk.nhs.nhsia.datastandards.ecds.ANMax20ECType target = null;
                target = (uk.nhs.nhsia.datastandards.ecds.ANMax20ECType)get_store().find_element_user(AMBULANCEINCIDENTNUMBER$0, 0);
                if (target == null)
                {
                    target = (uk.nhs.nhsia.datastandards.ecds.ANMax20ECType)get_store().add_element_user(AMBULANCEINCIDENTNUMBER$0);
                }
                target.set(ambulanceIncidentNumber);
            }
        }
        
        /**
         * Unsets the "AmbulanceIncidentNumber" element
         */
        public void unsetAmbulanceIncidentNumber()
        {
            synchronized (monitor())
            {
                check_orphaned();
                get_store().remove_element(AMBULANCEINCIDENTNUMBER$0, 0);
            }
        }
        
        /**
         * Gets the "OrganisationIdentifier_ConveyingAmbulanceTrust" element
         */
        public java.lang.String getOrganisationIdentifierConveyingAmbulanceTrust()
        {
            synchronized (monitor())
            {
                check_orphaned();
                org.apache.xmlbeans.SimpleValue target = null;
                target = (org.apache.xmlbeans.SimpleValue)get_store().find_element_user(ORGANISATIONIDENTIFIERCONVEYINGAMBULANCETRUST$2, 0);
                if (target == null)
                {
                    return null;
                }
                return target.getStringValue();
            }
        }
        
        /**
         * Gets (as xml) the "OrganisationIdentifier_ConveyingAmbulanceTrust" element
         */
        public uk.nhs.nhsia.datastandards.ecds.AN35ECType xgetOrganisationIdentifierConveyingAmbulanceTrust()
        {
            synchronized (monitor())
            {
                check_orphaned();
                uk.nhs.nhsia.datastandards.ecds.AN35ECType target = null;
                target = (uk.nhs.nhsia.datastandards.ecds.AN35ECType)get_store().find_element_user(ORGANISATIONIDENTIFIERCONVEYINGAMBULANCETRUST$2, 0);
                return target;
            }
        }
        
        /**
         * True if has "OrganisationIdentifier_ConveyingAmbulanceTrust" element
         */
        public boolean isSetOrganisationIdentifierConveyingAmbulanceTrust()
        {
            synchronized (monitor())
            {
                check_orphaned();
                return get_store().count_elements(ORGANISATIONIDENTIFIERCONVEYINGAMBULANCETRUST$2) != 0;
            }
        }
        
        /**
         * Sets the "OrganisationIdentifier_ConveyingAmbulanceTrust" element
         */
        public void setOrganisationIdentifierConveyingAmbulanceTrust(java.lang.String organisationIdentifierConveyingAmbulanceTrust)
        {
            synchronized (monitor())
            {
                check_orphaned();
                org.apache.xmlbeans.SimpleValue target = null;
                target = (org.apache.xmlbeans.SimpleValue)get_store().find_element_user(ORGANISATIONIDENTIFIERCONVEYINGAMBULANCETRUST$2, 0);
                if (target == null)
                {
                    target = (org.apache.xmlbeans.SimpleValue)get_store().add_element_user(ORGANISATIONIDENTIFIERCONVEYINGAMBULANCETRUST$2);
                }
                target.setStringValue(organisationIdentifierConveyingAmbulanceTrust);
            }
        }
        
        /**
         * Sets (as xml) the "OrganisationIdentifier_ConveyingAmbulanceTrust" element
         */
        public void xsetOrganisationIdentifierConveyingAmbulanceTrust(uk.nhs.nhsia.datastandards.ecds.AN35ECType organisationIdentifierConveyingAmbulanceTrust)
        {
            synchronized (monitor())
            {
                check_orphaned();
                uk.nhs.nhsia.datastandards.ecds.AN35ECType target = null;
                target = (uk.nhs.nhsia.datastandards.ecds.AN35ECType)get_store().find_element_user(ORGANISATIONIDENTIFIERCONVEYINGAMBULANCETRUST$2, 0);
                if (target == null)
                {
                    target = (uk.nhs.nhsia.datastandards.ecds.AN35ECType)get_store().add_element_user(ORGANISATIONIDENTIFIERCONVEYINGAMBULANCETRUST$2);
                }
                target.set(organisationIdentifierConveyingAmbulanceTrust);
            }
        }
        
        /**
         * Unsets the "OrganisationIdentifier_ConveyingAmbulanceTrust" element
         */
        public void unsetOrganisationIdentifierConveyingAmbulanceTrust()
        {
            synchronized (monitor())
            {
                check_orphaned();
                get_store().remove_element(ORGANISATIONIDENTIFIERCONVEYINGAMBULANCETRUST$2, 0);
            }
        }
    }
    /**
     * An XML EmergencyCareAttendanceActivityCharacteristics(@http://www.nhsia.nhs.uk/DataStandards/XMLschema/CDS/ns).
     *
     * This is a complex type.
     */
    public static class EmergencyCareAttendanceActivityCharacteristicsImpl extends org.apache.xmlbeans.impl.values.XmlComplexContentImpl implements uk.nhs.nhsia.datastandards.ecds.AttendanceOccurrenceECStructure.EmergencyCareAttendanceActivityCharacteristics
    {
        private static final long serialVersionUID = 1L;
        
        public EmergencyCareAttendanceActivityCharacteristicsImpl(org.apache.xmlbeans.SchemaType sType)
        {
            super(sType);
        }
        
        private static final javax.xml.namespace.QName EMERGENCYCAREATTENDANCEIDENTIFIER$0 = 
            new javax.xml.namespace.QName("http://www.nhsia.nhs.uk/DataStandards/XMLschema/CDS/ns", "EmergencyCareAttendanceIdentifier");
        private static final javax.xml.namespace.QName EMERGENCYCAREARRIVALMODESNOMEDCT$2 = 
            new javax.xml.namespace.QName("http://www.nhsia.nhs.uk/DataStandards/XMLschema/CDS/ns", "EmergencyCareArrivalMode_SnomedCt");
        private static final javax.xml.namespace.QName EMERGENCYCAREATTENDANCECATEGORY$4 = 
            new javax.xml.namespace.QName("http://www.nhsia.nhs.uk/DataStandards/XMLschema/CDS/ns", "EmergencyCareAttendanceCategory");
        private static final javax.xml.namespace.QName EMERGENCYCAREATTENDANCESOURCESNOMEDCT$6 = 
            new javax.xml.namespace.QName("http://www.nhsia.nhs.uk/DataStandards/XMLschema/CDS/ns", "EmergencyCareAttendanceSource_SnomedCt");
        private static final javax.xml.namespace.QName ORGANISATIONSITEIDENTIFIEREMERGENCYCAREATTENDANCESOURCE$8 = 
            new javax.xml.namespace.QName("http://www.nhsia.nhs.uk/DataStandards/XMLschema/CDS/ns", "OrganisationSiteIdentifier_EmergencyCareAttendanceSource");
        private static final javax.xml.namespace.QName EMERGENCYCAREARRIVALDATE$10 = 
            new javax.xml.namespace.QName("http://www.nhsia.nhs.uk/DataStandards/XMLschema/CDS/ns", "EmergencyCareArrivalDate");
        private static final javax.xml.namespace.QName EMERGENCYCAREARRIVALTIME$12 = 
            new javax.xml.namespace.QName("http://www.nhsia.nhs.uk/DataStandards/XMLschema/CDS/ns", "EmergencyCareArrivalTime");
        private static final javax.xml.namespace.QName AGEATCDSACTIVITYDATE$14 = 
            new javax.xml.namespace.QName("http://www.nhsia.nhs.uk/DataStandards/XMLschema/CDS/ns", "AgeAtCdsActivityDate");
        private static final javax.xml.namespace.QName EMERGENCYCAREINITIALASSESSMENTDATE$16 = 
            new javax.xml.namespace.QName("http://www.nhsia.nhs.uk/DataStandards/XMLschema/CDS/ns", "EmergencyCareInitialAssessmentDate");
        private static final javax.xml.namespace.QName EMERGENCYCAREINITIALASSESSMENTTIME$18 = 
            new javax.xml.namespace.QName("http://www.nhsia.nhs.uk/DataStandards/XMLschema/CDS/ns", "EmergencyCareInitialAssessmentTime");
        private static final javax.xml.namespace.QName EMERGENCYCAREACUITYSNOMEDCT$20 = 
            new javax.xml.namespace.QName("http://www.nhsia.nhs.uk/DataStandards/XMLschema/CDS/ns", "EmergencyCareAcuity_SnomedCt");
        private static final javax.xml.namespace.QName EMERGENCYCARECHIEFCOMPLAINTSNOMEDCT$22 = 
            new javax.xml.namespace.QName("http://www.nhsia.nhs.uk/DataStandards/XMLschema/CDS/ns", "EmergencyCareChiefComplaint_SnomedCt");
        private static final javax.xml.namespace.QName EMERGENCYCAREDATESEENFORTREATMENT$24 = 
            new javax.xml.namespace.QName("http://www.nhsia.nhs.uk/DataStandards/XMLschema/CDS/ns", "EmergencyCareDateSeenForTreatment");
        private static final javax.xml.namespace.QName EMERGENCYCARETIMESEENFORTREATMENT$26 = 
            new javax.xml.namespace.QName("http://www.nhsia.nhs.uk/DataStandards/XMLschema/CDS/ns", "EmergencyCareTimeSeenForTreatment");
        
        
        /**
         * Gets the "EmergencyCareAttendanceIdentifier" element
         */
        public java.lang.String getEmergencyCareAttendanceIdentifier()
        {
            synchronized (monitor())
            {
                check_orphaned();
                org.apache.xmlbeans.SimpleValue target = null;
                target = (org.apache.xmlbeans.SimpleValue)get_store().find_element_user(EMERGENCYCAREATTENDANCEIDENTIFIER$0, 0);
                if (target == null)
                {
                    return null;
                }
                return target.getStringValue();
            }
        }
        
        /**
         * Gets (as xml) the "EmergencyCareAttendanceIdentifier" element
         */
        public uk.nhs.nhsia.datastandards.ecds.ANMin1Max12ECType xgetEmergencyCareAttendanceIdentifier()
        {
            synchronized (monitor())
            {
                check_orphaned();
                uk.nhs.nhsia.datastandards.ecds.ANMin1Max12ECType target = null;
                target = (uk.nhs.nhsia.datastandards.ecds.ANMin1Max12ECType)get_store().find_element_user(EMERGENCYCAREATTENDANCEIDENTIFIER$0, 0);
                return target;
            }
        }
        
        /**
         * Sets the "EmergencyCareAttendanceIdentifier" element
         */
        public void setEmergencyCareAttendanceIdentifier(java.lang.String emergencyCareAttendanceIdentifier)
        {
            synchronized (monitor())
            {
                check_orphaned();
                org.apache.xmlbeans.SimpleValue target = null;
                target = (org.apache.xmlbeans.SimpleValue)get_store().find_element_user(EMERGENCYCAREATTENDANCEIDENTIFIER$0, 0);
                if (target == null)
                {
                    target = (org.apache.xmlbeans.SimpleValue)get_store().add_element_user(EMERGENCYCAREATTENDANCEIDENTIFIER$0);
                }
                target.setStringValue(emergencyCareAttendanceIdentifier);
            }
        }
        
        /**
         * Sets (as xml) the "EmergencyCareAttendanceIdentifier" element
         */
        public void xsetEmergencyCareAttendanceIdentifier(uk.nhs.nhsia.datastandards.ecds.ANMin1Max12ECType emergencyCareAttendanceIdentifier)
        {
            synchronized (monitor())
            {
                check_orphaned();
                uk.nhs.nhsia.datastandards.ecds.ANMin1Max12ECType target = null;
                target = (uk.nhs.nhsia.datastandards.ecds.ANMin1Max12ECType)get_store().find_element_user(EMERGENCYCAREATTENDANCEIDENTIFIER$0, 0);
                if (target == null)
                {
                    target = (uk.nhs.nhsia.datastandards.ecds.ANMin1Max12ECType)get_store().add_element_user(EMERGENCYCAREATTENDANCEIDENTIFIER$0);
                }
                target.set(emergencyCareAttendanceIdentifier);
            }
        }
        
        /**
         * Gets the "EmergencyCareArrivalMode_SnomedCt" element
         */
        public java.lang.String getEmergencyCareArrivalModeSnomedCt()
        {
            synchronized (monitor())
            {
                check_orphaned();
                org.apache.xmlbeans.SimpleValue target = null;
                target = (org.apache.xmlbeans.SimpleValue)get_store().find_element_user(EMERGENCYCAREARRIVALMODESNOMEDCT$2, 0);
                if (target == null)
                {
                    return null;
                }
                return target.getStringValue();
            }
        }
        
        /**
         * Gets (as xml) the "EmergencyCareArrivalMode_SnomedCt" element
         */
        public uk.nhs.nhsia.datastandards.ecds.N618ECType xgetEmergencyCareArrivalModeSnomedCt()
        {
            synchronized (monitor())
            {
                check_orphaned();
                uk.nhs.nhsia.datastandards.ecds.N618ECType target = null;
                target = (uk.nhs.nhsia.datastandards.ecds.N618ECType)get_store().find_element_user(EMERGENCYCAREARRIVALMODESNOMEDCT$2, 0);
                return target;
            }
        }
        
        /**
         * True if has "EmergencyCareArrivalMode_SnomedCt" element
         */
        public boolean isSetEmergencyCareArrivalModeSnomedCt()
        {
            synchronized (monitor())
            {
                check_orphaned();
                return get_store().count_elements(EMERGENCYCAREARRIVALMODESNOMEDCT$2) != 0;
            }
        }
        
        /**
         * Sets the "EmergencyCareArrivalMode_SnomedCt" element
         */
        public void setEmergencyCareArrivalModeSnomedCt(java.lang.String emergencyCareArrivalModeSnomedCt)
        {
            synchronized (monitor())
            {
                check_orphaned();
                org.apache.xmlbeans.SimpleValue target = null;
                target = (org.apache.xmlbeans.SimpleValue)get_store().find_element_user(EMERGENCYCAREARRIVALMODESNOMEDCT$2, 0);
                if (target == null)
                {
                    target = (org.apache.xmlbeans.SimpleValue)get_store().add_element_user(EMERGENCYCAREARRIVALMODESNOMEDCT$2);
                }
                target.setStringValue(emergencyCareArrivalModeSnomedCt);
            }
        }
        
        /**
         * Sets (as xml) the "EmergencyCareArrivalMode_SnomedCt" element
         */
        public void xsetEmergencyCareArrivalModeSnomedCt(uk.nhs.nhsia.datastandards.ecds.N618ECType emergencyCareArrivalModeSnomedCt)
        {
            synchronized (monitor())
            {
                check_orphaned();
                uk.nhs.nhsia.datastandards.ecds.N618ECType target = null;
                target = (uk.nhs.nhsia.datastandards.ecds.N618ECType)get_store().find_element_user(EMERGENCYCAREARRIVALMODESNOMEDCT$2, 0);
                if (target == null)
                {
                    target = (uk.nhs.nhsia.datastandards.ecds.N618ECType)get_store().add_element_user(EMERGENCYCAREARRIVALMODESNOMEDCT$2);
                }
                target.set(emergencyCareArrivalModeSnomedCt);
            }
        }
        
        /**
         * Unsets the "EmergencyCareArrivalMode_SnomedCt" element
         */
        public void unsetEmergencyCareArrivalModeSnomedCt()
        {
            synchronized (monitor())
            {
                check_orphaned();
                get_store().remove_element(EMERGENCYCAREARRIVALMODESNOMEDCT$2, 0);
            }
        }
        
        /**
         * Gets the "EmergencyCareAttendanceCategory" element
         */
        public uk.nhs.nhsia.datastandards.ecds.AttendCatECType.Enum getEmergencyCareAttendanceCategory()
        {
            synchronized (monitor())
            {
                check_orphaned();
                org.apache.xmlbeans.SimpleValue target = null;
                target = (org.apache.xmlbeans.SimpleValue)get_store().find_element_user(EMERGENCYCAREATTENDANCECATEGORY$4, 0);
                if (target == null)
                {
                    return null;
                }
                return (uk.nhs.nhsia.datastandards.ecds.AttendCatECType.Enum)target.getEnumValue();
            }
        }
        
        /**
         * Gets (as xml) the "EmergencyCareAttendanceCategory" element
         */
        public uk.nhs.nhsia.datastandards.ecds.AttendCatECType xgetEmergencyCareAttendanceCategory()
        {
            synchronized (monitor())
            {
                check_orphaned();
                uk.nhs.nhsia.datastandards.ecds.AttendCatECType target = null;
                target = (uk.nhs.nhsia.datastandards.ecds.AttendCatECType)get_store().find_element_user(EMERGENCYCAREATTENDANCECATEGORY$4, 0);
                return target;
            }
        }
        
        /**
         * True if has "EmergencyCareAttendanceCategory" element
         */
        public boolean isSetEmergencyCareAttendanceCategory()
        {
            synchronized (monitor())
            {
                check_orphaned();
                return get_store().count_elements(EMERGENCYCAREATTENDANCECATEGORY$4) != 0;
            }
        }
        
        /**
         * Sets the "EmergencyCareAttendanceCategory" element
         */
        public void setEmergencyCareAttendanceCategory(uk.nhs.nhsia.datastandards.ecds.AttendCatECType.Enum emergencyCareAttendanceCategory)
        {
            synchronized (monitor())
            {
                check_orphaned();
                org.apache.xmlbeans.SimpleValue target = null;
                target = (org.apache.xmlbeans.SimpleValue)get_store().find_element_user(EMERGENCYCAREATTENDANCECATEGORY$4, 0);
                if (target == null)
                {
                    target = (org.apache.xmlbeans.SimpleValue)get_store().add_element_user(EMERGENCYCAREATTENDANCECATEGORY$4);
                }
                target.setEnumValue(emergencyCareAttendanceCategory);
            }
        }
        
        /**
         * Sets (as xml) the "EmergencyCareAttendanceCategory" element
         */
        public void xsetEmergencyCareAttendanceCategory(uk.nhs.nhsia.datastandards.ecds.AttendCatECType emergencyCareAttendanceCategory)
        {
            synchronized (monitor())
            {
                check_orphaned();
                uk.nhs.nhsia.datastandards.ecds.AttendCatECType target = null;
                target = (uk.nhs.nhsia.datastandards.ecds.AttendCatECType)get_store().find_element_user(EMERGENCYCAREATTENDANCECATEGORY$4, 0);
                if (target == null)
                {
                    target = (uk.nhs.nhsia.datastandards.ecds.AttendCatECType)get_store().add_element_user(EMERGENCYCAREATTENDANCECATEGORY$4);
                }
                target.set(emergencyCareAttendanceCategory);
            }
        }
        
        /**
         * Unsets the "EmergencyCareAttendanceCategory" element
         */
        public void unsetEmergencyCareAttendanceCategory()
        {
            synchronized (monitor())
            {
                check_orphaned();
                get_store().remove_element(EMERGENCYCAREATTENDANCECATEGORY$4, 0);
            }
        }
        
        /**
         * Gets the "EmergencyCareAttendanceSource_SnomedCt" element
         */
        public java.lang.String getEmergencyCareAttendanceSourceSnomedCt()
        {
            synchronized (monitor())
            {
                check_orphaned();
                org.apache.xmlbeans.SimpleValue target = null;
                target = (org.apache.xmlbeans.SimpleValue)get_store().find_element_user(EMERGENCYCAREATTENDANCESOURCESNOMEDCT$6, 0);
                if (target == null)
                {
                    return null;
                }
                return target.getStringValue();
            }
        }
        
        /**
         * Gets (as xml) the "EmergencyCareAttendanceSource_SnomedCt" element
         */
        public uk.nhs.nhsia.datastandards.ecds.N618ECType xgetEmergencyCareAttendanceSourceSnomedCt()
        {
            synchronized (monitor())
            {
                check_orphaned();
                uk.nhs.nhsia.datastandards.ecds.N618ECType target = null;
                target = (uk.nhs.nhsia.datastandards.ecds.N618ECType)get_store().find_element_user(EMERGENCYCAREATTENDANCESOURCESNOMEDCT$6, 0);
                return target;
            }
        }
        
        /**
         * True if has "EmergencyCareAttendanceSource_SnomedCt" element
         */
        public boolean isSetEmergencyCareAttendanceSourceSnomedCt()
        {
            synchronized (monitor())
            {
                check_orphaned();
                return get_store().count_elements(EMERGENCYCAREATTENDANCESOURCESNOMEDCT$6) != 0;
            }
        }
        
        /**
         * Sets the "EmergencyCareAttendanceSource_SnomedCt" element
         */
        public void setEmergencyCareAttendanceSourceSnomedCt(java.lang.String emergencyCareAttendanceSourceSnomedCt)
        {
            synchronized (monitor())
            {
                check_orphaned();
                org.apache.xmlbeans.SimpleValue target = null;
                target = (org.apache.xmlbeans.SimpleValue)get_store().find_element_user(EMERGENCYCAREATTENDANCESOURCESNOMEDCT$6, 0);
                if (target == null)
                {
                    target = (org.apache.xmlbeans.SimpleValue)get_store().add_element_user(EMERGENCYCAREATTENDANCESOURCESNOMEDCT$6);
                }
                target.setStringValue(emergencyCareAttendanceSourceSnomedCt);
            }
        }
        
        /**
         * Sets (as xml) the "EmergencyCareAttendanceSource_SnomedCt" element
         */
        public void xsetEmergencyCareAttendanceSourceSnomedCt(uk.nhs.nhsia.datastandards.ecds.N618ECType emergencyCareAttendanceSourceSnomedCt)
        {
            synchronized (monitor())
            {
                check_orphaned();
                uk.nhs.nhsia.datastandards.ecds.N618ECType target = null;
                target = (uk.nhs.nhsia.datastandards.ecds.N618ECType)get_store().find_element_user(EMERGENCYCAREATTENDANCESOURCESNOMEDCT$6, 0);
                if (target == null)
                {
                    target = (uk.nhs.nhsia.datastandards.ecds.N618ECType)get_store().add_element_user(EMERGENCYCAREATTENDANCESOURCESNOMEDCT$6);
                }
                target.set(emergencyCareAttendanceSourceSnomedCt);
            }
        }
        
        /**
         * Unsets the "EmergencyCareAttendanceSource_SnomedCt" element
         */
        public void unsetEmergencyCareAttendanceSourceSnomedCt()
        {
            synchronized (monitor())
            {
                check_orphaned();
                get_store().remove_element(EMERGENCYCAREATTENDANCESOURCESNOMEDCT$6, 0);
            }
        }
        
        /**
         * Gets the "OrganisationSiteIdentifier_EmergencyCareAttendanceSource" element
         */
        public java.lang.String getOrganisationSiteIdentifierEmergencyCareAttendanceSource()
        {
            synchronized (monitor())
            {
                check_orphaned();
                org.apache.xmlbeans.SimpleValue target = null;
                target = (org.apache.xmlbeans.SimpleValue)get_store().find_element_user(ORGANISATIONSITEIDENTIFIEREMERGENCYCAREATTENDANCESOURCE$8, 0);
                if (target == null)
                {
                    return null;
                }
                return target.getStringValue();
            }
        }
        
        /**
         * Gets (as xml) the "OrganisationSiteIdentifier_EmergencyCareAttendanceSource" element
         */
        public uk.nhs.nhsia.datastandards.ecds.AN59ECType xgetOrganisationSiteIdentifierEmergencyCareAttendanceSource()
        {
            synchronized (monitor())
            {
                check_orphaned();
                uk.nhs.nhsia.datastandards.ecds.AN59ECType target = null;
                target = (uk.nhs.nhsia.datastandards.ecds.AN59ECType)get_store().find_element_user(ORGANISATIONSITEIDENTIFIEREMERGENCYCAREATTENDANCESOURCE$8, 0);
                return target;
            }
        }
        
        /**
         * True if has "OrganisationSiteIdentifier_EmergencyCareAttendanceSource" element
         */
        public boolean isSetOrganisationSiteIdentifierEmergencyCareAttendanceSource()
        {
            synchronized (monitor())
            {
                check_orphaned();
                return get_store().count_elements(ORGANISATIONSITEIDENTIFIEREMERGENCYCAREATTENDANCESOURCE$8) != 0;
            }
        }
        
        /**
         * Sets the "OrganisationSiteIdentifier_EmergencyCareAttendanceSource" element
         */
        public void setOrganisationSiteIdentifierEmergencyCareAttendanceSource(java.lang.String organisationSiteIdentifierEmergencyCareAttendanceSource)
        {
            synchronized (monitor())
            {
                check_orphaned();
                org.apache.xmlbeans.SimpleValue target = null;
                target = (org.apache.xmlbeans.SimpleValue)get_store().find_element_user(ORGANISATIONSITEIDENTIFIEREMERGENCYCAREATTENDANCESOURCE$8, 0);
                if (target == null)
                {
                    target = (org.apache.xmlbeans.SimpleValue)get_store().add_element_user(ORGANISATIONSITEIDENTIFIEREMERGENCYCAREATTENDANCESOURCE$8);
                }
                target.setStringValue(organisationSiteIdentifierEmergencyCareAttendanceSource);
            }
        }
        
        /**
         * Sets (as xml) the "OrganisationSiteIdentifier_EmergencyCareAttendanceSource" element
         */
        public void xsetOrganisationSiteIdentifierEmergencyCareAttendanceSource(uk.nhs.nhsia.datastandards.ecds.AN59ECType organisationSiteIdentifierEmergencyCareAttendanceSource)
        {
            synchronized (monitor())
            {
                check_orphaned();
                uk.nhs.nhsia.datastandards.ecds.AN59ECType target = null;
                target = (uk.nhs.nhsia.datastandards.ecds.AN59ECType)get_store().find_element_user(ORGANISATIONSITEIDENTIFIEREMERGENCYCAREATTENDANCESOURCE$8, 0);
                if (target == null)
                {
                    target = (uk.nhs.nhsia.datastandards.ecds.AN59ECType)get_store().add_element_user(ORGANISATIONSITEIDENTIFIEREMERGENCYCAREATTENDANCESOURCE$8);
                }
                target.set(organisationSiteIdentifierEmergencyCareAttendanceSource);
            }
        }
        
        /**
         * Unsets the "OrganisationSiteIdentifier_EmergencyCareAttendanceSource" element
         */
        public void unsetOrganisationSiteIdentifierEmergencyCareAttendanceSource()
        {
            synchronized (monitor())
            {
                check_orphaned();
                get_store().remove_element(ORGANISATIONSITEIDENTIFIEREMERGENCYCAREATTENDANCESOURCE$8, 0);
            }
        }
        
        /**
         * Gets the "EmergencyCareArrivalDate" element
         */
        public java.util.Calendar getEmergencyCareArrivalDate()
        {
            synchronized (monitor())
            {
                check_orphaned();
                org.apache.xmlbeans.SimpleValue target = null;
                target = (org.apache.xmlbeans.SimpleValue)get_store().find_element_user(EMERGENCYCAREARRIVALDATE$10, 0);
                if (target == null)
                {
                    return null;
                }
                return target.getCalendarValue();
            }
        }
        
        /**
         * Gets (as xml) the "EmergencyCareArrivalDate" element
         */
        public uk.nhs.nhsia.datastandards.ecds.DateType xgetEmergencyCareArrivalDate()
        {
            synchronized (monitor())
            {
                check_orphaned();
                uk.nhs.nhsia.datastandards.ecds.DateType target = null;
                target = (uk.nhs.nhsia.datastandards.ecds.DateType)get_store().find_element_user(EMERGENCYCAREARRIVALDATE$10, 0);
                return target;
            }
        }
        
        /**
         * Sets the "EmergencyCareArrivalDate" element
         */
        public void setEmergencyCareArrivalDate(java.util.Calendar emergencyCareArrivalDate)
        {
            synchronized (monitor())
            {
                check_orphaned();
                org.apache.xmlbeans.SimpleValue target = null;
                target = (org.apache.xmlbeans.SimpleValue)get_store().find_element_user(EMERGENCYCAREARRIVALDATE$10, 0);
                if (target == null)
                {
                    target = (org.apache.xmlbeans.SimpleValue)get_store().add_element_user(EMERGENCYCAREARRIVALDATE$10);
                }
                target.setCalendarValue(emergencyCareArrivalDate);
            }
        }
        
        /**
         * Sets (as xml) the "EmergencyCareArrivalDate" element
         */
        public void xsetEmergencyCareArrivalDate(uk.nhs.nhsia.datastandards.ecds.DateType emergencyCareArrivalDate)
        {
            synchronized (monitor())
            {
                check_orphaned();
                uk.nhs.nhsia.datastandards.ecds.DateType target = null;
                target = (uk.nhs.nhsia.datastandards.ecds.DateType)get_store().find_element_user(EMERGENCYCAREARRIVALDATE$10, 0);
                if (target == null)
                {
                    target = (uk.nhs.nhsia.datastandards.ecds.DateType)get_store().add_element_user(EMERGENCYCAREARRIVALDATE$10);
                }
                target.set(emergencyCareArrivalDate);
            }
        }
        
        /**
         * Gets the "EmergencyCareArrivalTime" element
         */
        public java.util.Calendar getEmergencyCareArrivalTime()
        {
            synchronized (monitor())
            {
                check_orphaned();
                org.apache.xmlbeans.SimpleValue target = null;
                target = (org.apache.xmlbeans.SimpleValue)get_store().find_element_user(EMERGENCYCAREARRIVALTIME$12, 0);
                if (target == null)
                {
                    return null;
                }
                return target.getCalendarValue();
            }
        }
        
        /**
         * Gets (as xml) the "EmergencyCareArrivalTime" element
         */
        public uk.nhs.nhsia.datastandards.ecds.TimeType xgetEmergencyCareArrivalTime()
        {
            synchronized (monitor())
            {
                check_orphaned();
                uk.nhs.nhsia.datastandards.ecds.TimeType target = null;
                target = (uk.nhs.nhsia.datastandards.ecds.TimeType)get_store().find_element_user(EMERGENCYCAREARRIVALTIME$12, 0);
                return target;
            }
        }
        
        /**
         * Sets the "EmergencyCareArrivalTime" element
         */
        public void setEmergencyCareArrivalTime(java.util.Calendar emergencyCareArrivalTime)
        {
            synchronized (monitor())
            {
                check_orphaned();
                org.apache.xmlbeans.SimpleValue target = null;
                target = (org.apache.xmlbeans.SimpleValue)get_store().find_element_user(EMERGENCYCAREARRIVALTIME$12, 0);
                if (target == null)
                {
                    target = (org.apache.xmlbeans.SimpleValue)get_store().add_element_user(EMERGENCYCAREARRIVALTIME$12);
                }
                target.setCalendarValue(emergencyCareArrivalTime);
            }
        }
        
        /**
         * Sets (as xml) the "EmergencyCareArrivalTime" element
         */
        public void xsetEmergencyCareArrivalTime(uk.nhs.nhsia.datastandards.ecds.TimeType emergencyCareArrivalTime)
        {
            synchronized (monitor())
            {
                check_orphaned();
                uk.nhs.nhsia.datastandards.ecds.TimeType target = null;
                target = (uk.nhs.nhsia.datastandards.ecds.TimeType)get_store().find_element_user(EMERGENCYCAREARRIVALTIME$12, 0);
                if (target == null)
                {
                    target = (uk.nhs.nhsia.datastandards.ecds.TimeType)get_store().add_element_user(EMERGENCYCAREARRIVALTIME$12);
                }
                target.set(emergencyCareArrivalTime);
            }
        }
        
        /**
         * Gets the "AgeAtCdsActivityDate" element
         */
        public int getAgeAtCdsActivityDate()
        {
            synchronized (monitor())
            {
                check_orphaned();
                org.apache.xmlbeans.SimpleValue target = null;
                target = (org.apache.xmlbeans.SimpleValue)get_store().find_element_user(AGEATCDSACTIVITYDATE$14, 0);
                if (target == null)
                {
                    return 0;
                }
                return target.getIntValue();
            }
        }
        
        /**
         * Gets (as xml) the "AgeAtCdsActivityDate" element
         */
        public uk.nhs.nhsia.datastandards.ecds.AgeAtCDSActivityDateType xgetAgeAtCdsActivityDate()
        {
            synchronized (monitor())
            {
                check_orphaned();
                uk.nhs.nhsia.datastandards.ecds.AgeAtCDSActivityDateType target = null;
                target = (uk.nhs.nhsia.datastandards.ecds.AgeAtCDSActivityDateType)get_store().find_element_user(AGEATCDSACTIVITYDATE$14, 0);
                return target;
            }
        }
        
        /**
         * Sets the "AgeAtCdsActivityDate" element
         */
        public void setAgeAtCdsActivityDate(int ageAtCdsActivityDate)
        {
            synchronized (monitor())
            {
                check_orphaned();
                org.apache.xmlbeans.SimpleValue target = null;
                target = (org.apache.xmlbeans.SimpleValue)get_store().find_element_user(AGEATCDSACTIVITYDATE$14, 0);
                if (target == null)
                {
                    target = (org.apache.xmlbeans.SimpleValue)get_store().add_element_user(AGEATCDSACTIVITYDATE$14);
                }
                target.setIntValue(ageAtCdsActivityDate);
            }
        }
        
        /**
         * Sets (as xml) the "AgeAtCdsActivityDate" element
         */
        public void xsetAgeAtCdsActivityDate(uk.nhs.nhsia.datastandards.ecds.AgeAtCDSActivityDateType ageAtCdsActivityDate)
        {
            synchronized (monitor())
            {
                check_orphaned();
                uk.nhs.nhsia.datastandards.ecds.AgeAtCDSActivityDateType target = null;
                target = (uk.nhs.nhsia.datastandards.ecds.AgeAtCDSActivityDateType)get_store().find_element_user(AGEATCDSACTIVITYDATE$14, 0);
                if (target == null)
                {
                    target = (uk.nhs.nhsia.datastandards.ecds.AgeAtCDSActivityDateType)get_store().add_element_user(AGEATCDSACTIVITYDATE$14);
                }
                target.set(ageAtCdsActivityDate);
            }
        }
        
        /**
         * Gets the "EmergencyCareInitialAssessmentDate" element
         */
        public java.util.Calendar getEmergencyCareInitialAssessmentDate()
        {
            synchronized (monitor())
            {
                check_orphaned();
                org.apache.xmlbeans.SimpleValue target = null;
                target = (org.apache.xmlbeans.SimpleValue)get_store().find_element_user(EMERGENCYCAREINITIALASSESSMENTDATE$16, 0);
                if (target == null)
                {
                    return null;
                }
                return target.getCalendarValue();
            }
        }
        
        /**
         * Gets (as xml) the "EmergencyCareInitialAssessmentDate" element
         */
        public uk.nhs.nhsia.datastandards.ecds.DateType xgetEmergencyCareInitialAssessmentDate()
        {
            synchronized (monitor())
            {
                check_orphaned();
                uk.nhs.nhsia.datastandards.ecds.DateType target = null;
                target = (uk.nhs.nhsia.datastandards.ecds.DateType)get_store().find_element_user(EMERGENCYCAREINITIALASSESSMENTDATE$16, 0);
                return target;
            }
        }
        
        /**
         * True if has "EmergencyCareInitialAssessmentDate" element
         */
        public boolean isSetEmergencyCareInitialAssessmentDate()
        {
            synchronized (monitor())
            {
                check_orphaned();
                return get_store().count_elements(EMERGENCYCAREINITIALASSESSMENTDATE$16) != 0;
            }
        }
        
        /**
         * Sets the "EmergencyCareInitialAssessmentDate" element
         */
        public void setEmergencyCareInitialAssessmentDate(java.util.Calendar emergencyCareInitialAssessmentDate)
        {
            synchronized (monitor())
            {
                check_orphaned();
                org.apache.xmlbeans.SimpleValue target = null;
                target = (org.apache.xmlbeans.SimpleValue)get_store().find_element_user(EMERGENCYCAREINITIALASSESSMENTDATE$16, 0);
                if (target == null)
                {
                    target = (org.apache.xmlbeans.SimpleValue)get_store().add_element_user(EMERGENCYCAREINITIALASSESSMENTDATE$16);
                }
                target.setCalendarValue(emergencyCareInitialAssessmentDate);
            }
        }
        
        /**
         * Sets (as xml) the "EmergencyCareInitialAssessmentDate" element
         */
        public void xsetEmergencyCareInitialAssessmentDate(uk.nhs.nhsia.datastandards.ecds.DateType emergencyCareInitialAssessmentDate)
        {
            synchronized (monitor())
            {
                check_orphaned();
                uk.nhs.nhsia.datastandards.ecds.DateType target = null;
                target = (uk.nhs.nhsia.datastandards.ecds.DateType)get_store().find_element_user(EMERGENCYCAREINITIALASSESSMENTDATE$16, 0);
                if (target == null)
                {
                    target = (uk.nhs.nhsia.datastandards.ecds.DateType)get_store().add_element_user(EMERGENCYCAREINITIALASSESSMENTDATE$16);
                }
                target.set(emergencyCareInitialAssessmentDate);
            }
        }
        
        /**
         * Unsets the "EmergencyCareInitialAssessmentDate" element
         */
        public void unsetEmergencyCareInitialAssessmentDate()
        {
            synchronized (monitor())
            {
                check_orphaned();
                get_store().remove_element(EMERGENCYCAREINITIALASSESSMENTDATE$16, 0);
            }
        }
        
        /**
         * Gets the "EmergencyCareInitialAssessmentTime" element
         */
        public java.util.Calendar getEmergencyCareInitialAssessmentTime()
        {
            synchronized (monitor())
            {
                check_orphaned();
                org.apache.xmlbeans.SimpleValue target = null;
                target = (org.apache.xmlbeans.SimpleValue)get_store().find_element_user(EMERGENCYCAREINITIALASSESSMENTTIME$18, 0);
                if (target == null)
                {
                    return null;
                }
                return target.getCalendarValue();
            }
        }
        
        /**
         * Gets (as xml) the "EmergencyCareInitialAssessmentTime" element
         */
        public uk.nhs.nhsia.datastandards.ecds.TimeType xgetEmergencyCareInitialAssessmentTime()
        {
            synchronized (monitor())
            {
                check_orphaned();
                uk.nhs.nhsia.datastandards.ecds.TimeType target = null;
                target = (uk.nhs.nhsia.datastandards.ecds.TimeType)get_store().find_element_user(EMERGENCYCAREINITIALASSESSMENTTIME$18, 0);
                return target;
            }
        }
        
        /**
         * True if has "EmergencyCareInitialAssessmentTime" element
         */
        public boolean isSetEmergencyCareInitialAssessmentTime()
        {
            synchronized (monitor())
            {
                check_orphaned();
                return get_store().count_elements(EMERGENCYCAREINITIALASSESSMENTTIME$18) != 0;
            }
        }
        
        /**
         * Sets the "EmergencyCareInitialAssessmentTime" element
         */
        public void setEmergencyCareInitialAssessmentTime(java.util.Calendar emergencyCareInitialAssessmentTime)
        {
            synchronized (monitor())
            {
                check_orphaned();
                org.apache.xmlbeans.SimpleValue target = null;
                target = (org.apache.xmlbeans.SimpleValue)get_store().find_element_user(EMERGENCYCAREINITIALASSESSMENTTIME$18, 0);
                if (target == null)
                {
                    target = (org.apache.xmlbeans.SimpleValue)get_store().add_element_user(EMERGENCYCAREINITIALASSESSMENTTIME$18);
                }
                target.setCalendarValue(emergencyCareInitialAssessmentTime);
            }
        }
        
        /**
         * Sets (as xml) the "EmergencyCareInitialAssessmentTime" element
         */
        public void xsetEmergencyCareInitialAssessmentTime(uk.nhs.nhsia.datastandards.ecds.TimeType emergencyCareInitialAssessmentTime)
        {
            synchronized (monitor())
            {
                check_orphaned();
                uk.nhs.nhsia.datastandards.ecds.TimeType target = null;
                target = (uk.nhs.nhsia.datastandards.ecds.TimeType)get_store().find_element_user(EMERGENCYCAREINITIALASSESSMENTTIME$18, 0);
                if (target == null)
                {
                    target = (uk.nhs.nhsia.datastandards.ecds.TimeType)get_store().add_element_user(EMERGENCYCAREINITIALASSESSMENTTIME$18);
                }
                target.set(emergencyCareInitialAssessmentTime);
            }
        }
        
        /**
         * Unsets the "EmergencyCareInitialAssessmentTime" element
         */
        public void unsetEmergencyCareInitialAssessmentTime()
        {
            synchronized (monitor())
            {
                check_orphaned();
                get_store().remove_element(EMERGENCYCAREINITIALASSESSMENTTIME$18, 0);
            }
        }
        
        /**
         * Gets the "EmergencyCareAcuity_SnomedCt" element
         */
        public java.lang.String getEmergencyCareAcuitySnomedCt()
        {
            synchronized (monitor())
            {
                check_orphaned();
                org.apache.xmlbeans.SimpleValue target = null;
                target = (org.apache.xmlbeans.SimpleValue)get_store().find_element_user(EMERGENCYCAREACUITYSNOMEDCT$20, 0);
                if (target == null)
                {
                    return null;
                }
                return target.getStringValue();
            }
        }
        
        /**
         * Gets (as xml) the "EmergencyCareAcuity_SnomedCt" element
         */
        public uk.nhs.nhsia.datastandards.ecds.N618ECType xgetEmergencyCareAcuitySnomedCt()
        {
            synchronized (monitor())
            {
                check_orphaned();
                uk.nhs.nhsia.datastandards.ecds.N618ECType target = null;
                target = (uk.nhs.nhsia.datastandards.ecds.N618ECType)get_store().find_element_user(EMERGENCYCAREACUITYSNOMEDCT$20, 0);
                return target;
            }
        }
        
        /**
         * True if has "EmergencyCareAcuity_SnomedCt" element
         */
        public boolean isSetEmergencyCareAcuitySnomedCt()
        {
            synchronized (monitor())
            {
                check_orphaned();
                return get_store().count_elements(EMERGENCYCAREACUITYSNOMEDCT$20) != 0;
            }
        }
        
        /**
         * Sets the "EmergencyCareAcuity_SnomedCt" element
         */
        public void setEmergencyCareAcuitySnomedCt(java.lang.String emergencyCareAcuitySnomedCt)
        {
            synchronized (monitor())
            {
                check_orphaned();
                org.apache.xmlbeans.SimpleValue target = null;
                target = (org.apache.xmlbeans.SimpleValue)get_store().find_element_user(EMERGENCYCAREACUITYSNOMEDCT$20, 0);
                if (target == null)
                {
                    target = (org.apache.xmlbeans.SimpleValue)get_store().add_element_user(EMERGENCYCAREACUITYSNOMEDCT$20);
                }
                target.setStringValue(emergencyCareAcuitySnomedCt);
            }
        }
        
        /**
         * Sets (as xml) the "EmergencyCareAcuity_SnomedCt" element
         */
        public void xsetEmergencyCareAcuitySnomedCt(uk.nhs.nhsia.datastandards.ecds.N618ECType emergencyCareAcuitySnomedCt)
        {
            synchronized (monitor())
            {
                check_orphaned();
                uk.nhs.nhsia.datastandards.ecds.N618ECType target = null;
                target = (uk.nhs.nhsia.datastandards.ecds.N618ECType)get_store().find_element_user(EMERGENCYCAREACUITYSNOMEDCT$20, 0);
                if (target == null)
                {
                    target = (uk.nhs.nhsia.datastandards.ecds.N618ECType)get_store().add_element_user(EMERGENCYCAREACUITYSNOMEDCT$20);
                }
                target.set(emergencyCareAcuitySnomedCt);
            }
        }
        
        /**
         * Unsets the "EmergencyCareAcuity_SnomedCt" element
         */
        public void unsetEmergencyCareAcuitySnomedCt()
        {
            synchronized (monitor())
            {
                check_orphaned();
                get_store().remove_element(EMERGENCYCAREACUITYSNOMEDCT$20, 0);
            }
        }
        
        /**
         * Gets the "EmergencyCareChiefComplaint_SnomedCt" element
         */
        public java.lang.String getEmergencyCareChiefComplaintSnomedCt()
        {
            synchronized (monitor())
            {
                check_orphaned();
                org.apache.xmlbeans.SimpleValue target = null;
                target = (org.apache.xmlbeans.SimpleValue)get_store().find_element_user(EMERGENCYCARECHIEFCOMPLAINTSNOMEDCT$22, 0);
                if (target == null)
                {
                    return null;
                }
                return target.getStringValue();
            }
        }
        
        /**
         * Gets (as xml) the "EmergencyCareChiefComplaint_SnomedCt" element
         */
        public uk.nhs.nhsia.datastandards.ecds.N618ECType xgetEmergencyCareChiefComplaintSnomedCt()
        {
            synchronized (monitor())
            {
                check_orphaned();
                uk.nhs.nhsia.datastandards.ecds.N618ECType target = null;
                target = (uk.nhs.nhsia.datastandards.ecds.N618ECType)get_store().find_element_user(EMERGENCYCARECHIEFCOMPLAINTSNOMEDCT$22, 0);
                return target;
            }
        }
        
        /**
         * True if has "EmergencyCareChiefComplaint_SnomedCt" element
         */
        public boolean isSetEmergencyCareChiefComplaintSnomedCt()
        {
            synchronized (monitor())
            {
                check_orphaned();
                return get_store().count_elements(EMERGENCYCARECHIEFCOMPLAINTSNOMEDCT$22) != 0;
            }
        }
        
        /**
         * Sets the "EmergencyCareChiefComplaint_SnomedCt" element
         */
        public void setEmergencyCareChiefComplaintSnomedCt(java.lang.String emergencyCareChiefComplaintSnomedCt)
        {
            synchronized (monitor())
            {
                check_orphaned();
                org.apache.xmlbeans.SimpleValue target = null;
                target = (org.apache.xmlbeans.SimpleValue)get_store().find_element_user(EMERGENCYCARECHIEFCOMPLAINTSNOMEDCT$22, 0);
                if (target == null)
                {
                    target = (org.apache.xmlbeans.SimpleValue)get_store().add_element_user(EMERGENCYCARECHIEFCOMPLAINTSNOMEDCT$22);
                }
                target.setStringValue(emergencyCareChiefComplaintSnomedCt);
            }
        }
        
        /**
         * Sets (as xml) the "EmergencyCareChiefComplaint_SnomedCt" element
         */
        public void xsetEmergencyCareChiefComplaintSnomedCt(uk.nhs.nhsia.datastandards.ecds.N618ECType emergencyCareChiefComplaintSnomedCt)
        {
            synchronized (monitor())
            {
                check_orphaned();
                uk.nhs.nhsia.datastandards.ecds.N618ECType target = null;
                target = (uk.nhs.nhsia.datastandards.ecds.N618ECType)get_store().find_element_user(EMERGENCYCARECHIEFCOMPLAINTSNOMEDCT$22, 0);
                if (target == null)
                {
                    target = (uk.nhs.nhsia.datastandards.ecds.N618ECType)get_store().add_element_user(EMERGENCYCARECHIEFCOMPLAINTSNOMEDCT$22);
                }
                target.set(emergencyCareChiefComplaintSnomedCt);
            }
        }
        
        /**
         * Unsets the "EmergencyCareChiefComplaint_SnomedCt" element
         */
        public void unsetEmergencyCareChiefComplaintSnomedCt()
        {
            synchronized (monitor())
            {
                check_orphaned();
                get_store().remove_element(EMERGENCYCARECHIEFCOMPLAINTSNOMEDCT$22, 0);
            }
        }
        
        /**
         * Gets the "EmergencyCareDateSeenForTreatment" element
         */
        public java.util.Calendar getEmergencyCareDateSeenForTreatment()
        {
            synchronized (monitor())
            {
                check_orphaned();
                org.apache.xmlbeans.SimpleValue target = null;
                target = (org.apache.xmlbeans.SimpleValue)get_store().find_element_user(EMERGENCYCAREDATESEENFORTREATMENT$24, 0);
                if (target == null)
                {
                    return null;
                }
                return target.getCalendarValue();
            }
        }
        
        /**
         * Gets (as xml) the "EmergencyCareDateSeenForTreatment" element
         */
        public uk.nhs.nhsia.datastandards.ecds.DateType xgetEmergencyCareDateSeenForTreatment()
        {
            synchronized (monitor())
            {
                check_orphaned();
                uk.nhs.nhsia.datastandards.ecds.DateType target = null;
                target = (uk.nhs.nhsia.datastandards.ecds.DateType)get_store().find_element_user(EMERGENCYCAREDATESEENFORTREATMENT$24, 0);
                return target;
            }
        }
        
        /**
         * True if has "EmergencyCareDateSeenForTreatment" element
         */
        public boolean isSetEmergencyCareDateSeenForTreatment()
        {
            synchronized (monitor())
            {
                check_orphaned();
                return get_store().count_elements(EMERGENCYCAREDATESEENFORTREATMENT$24) != 0;
            }
        }
        
        /**
         * Sets the "EmergencyCareDateSeenForTreatment" element
         */
        public void setEmergencyCareDateSeenForTreatment(java.util.Calendar emergencyCareDateSeenForTreatment)
        {
            synchronized (monitor())
            {
                check_orphaned();
                org.apache.xmlbeans.SimpleValue target = null;
                target = (org.apache.xmlbeans.SimpleValue)get_store().find_element_user(EMERGENCYCAREDATESEENFORTREATMENT$24, 0);
                if (target == null)
                {
                    target = (org.apache.xmlbeans.SimpleValue)get_store().add_element_user(EMERGENCYCAREDATESEENFORTREATMENT$24);
                }
                target.setCalendarValue(emergencyCareDateSeenForTreatment);
            }
        }
        
        /**
         * Sets (as xml) the "EmergencyCareDateSeenForTreatment" element
         */
        public void xsetEmergencyCareDateSeenForTreatment(uk.nhs.nhsia.datastandards.ecds.DateType emergencyCareDateSeenForTreatment)
        {
            synchronized (monitor())
            {
                check_orphaned();
                uk.nhs.nhsia.datastandards.ecds.DateType target = null;
                target = (uk.nhs.nhsia.datastandards.ecds.DateType)get_store().find_element_user(EMERGENCYCAREDATESEENFORTREATMENT$24, 0);
                if (target == null)
                {
                    target = (uk.nhs.nhsia.datastandards.ecds.DateType)get_store().add_element_user(EMERGENCYCAREDATESEENFORTREATMENT$24);
                }
                target.set(emergencyCareDateSeenForTreatment);
            }
        }
        
        /**
         * Unsets the "EmergencyCareDateSeenForTreatment" element
         */
        public void unsetEmergencyCareDateSeenForTreatment()
        {
            synchronized (monitor())
            {
                check_orphaned();
                get_store().remove_element(EMERGENCYCAREDATESEENFORTREATMENT$24, 0);
            }
        }
        
        /**
         * Gets the "EmergencyCareTimeSeenForTreatment" element
         */
        public java.util.Calendar getEmergencyCareTimeSeenForTreatment()
        {
            synchronized (monitor())
            {
                check_orphaned();
                org.apache.xmlbeans.SimpleValue target = null;
                target = (org.apache.xmlbeans.SimpleValue)get_store().find_element_user(EMERGENCYCARETIMESEENFORTREATMENT$26, 0);
                if (target == null)
                {
                    return null;
                }
                return target.getCalendarValue();
            }
        }
        
        /**
         * Gets (as xml) the "EmergencyCareTimeSeenForTreatment" element
         */
        public uk.nhs.nhsia.datastandards.ecds.TimeType xgetEmergencyCareTimeSeenForTreatment()
        {
            synchronized (monitor())
            {
                check_orphaned();
                uk.nhs.nhsia.datastandards.ecds.TimeType target = null;
                target = (uk.nhs.nhsia.datastandards.ecds.TimeType)get_store().find_element_user(EMERGENCYCARETIMESEENFORTREATMENT$26, 0);
                return target;
            }
        }
        
        /**
         * True if has "EmergencyCareTimeSeenForTreatment" element
         */
        public boolean isSetEmergencyCareTimeSeenForTreatment()
        {
            synchronized (monitor())
            {
                check_orphaned();
                return get_store().count_elements(EMERGENCYCARETIMESEENFORTREATMENT$26) != 0;
            }
        }
        
        /**
         * Sets the "EmergencyCareTimeSeenForTreatment" element
         */
        public void setEmergencyCareTimeSeenForTreatment(java.util.Calendar emergencyCareTimeSeenForTreatment)
        {
            synchronized (monitor())
            {
                check_orphaned();
                org.apache.xmlbeans.SimpleValue target = null;
                target = (org.apache.xmlbeans.SimpleValue)get_store().find_element_user(EMERGENCYCARETIMESEENFORTREATMENT$26, 0);
                if (target == null)
                {
                    target = (org.apache.xmlbeans.SimpleValue)get_store().add_element_user(EMERGENCYCARETIMESEENFORTREATMENT$26);
                }
                target.setCalendarValue(emergencyCareTimeSeenForTreatment);
            }
        }
        
        /**
         * Sets (as xml) the "EmergencyCareTimeSeenForTreatment" element
         */
        public void xsetEmergencyCareTimeSeenForTreatment(uk.nhs.nhsia.datastandards.ecds.TimeType emergencyCareTimeSeenForTreatment)
        {
            synchronized (monitor())
            {
                check_orphaned();
                uk.nhs.nhsia.datastandards.ecds.TimeType target = null;
                target = (uk.nhs.nhsia.datastandards.ecds.TimeType)get_store().find_element_user(EMERGENCYCARETIMESEENFORTREATMENT$26, 0);
                if (target == null)
                {
                    target = (uk.nhs.nhsia.datastandards.ecds.TimeType)get_store().add_element_user(EMERGENCYCARETIMESEENFORTREATMENT$26);
                }
                target.set(emergencyCareTimeSeenForTreatment);
            }
        }
        
        /**
         * Unsets the "EmergencyCareTimeSeenForTreatment" element
         */
        public void unsetEmergencyCareTimeSeenForTreatment()
        {
            synchronized (monitor())
            {
                check_orphaned();
                get_store().remove_element(EMERGENCYCARETIMESEENFORTREATMENT$26, 0);
            }
        }
    }
    /**
     * An XML InjuryCharacteristics(@http://www.nhsia.nhs.uk/DataStandards/XMLschema/CDS/ns).
     *
     * This is a complex type.
     */
    public static class InjuryCharacteristicsImpl extends org.apache.xmlbeans.impl.values.XmlComplexContentImpl implements uk.nhs.nhsia.datastandards.ecds.AttendanceOccurrenceECStructure.InjuryCharacteristics
    {
        private static final long serialVersionUID = 1L;
        
        public InjuryCharacteristicsImpl(org.apache.xmlbeans.SchemaType sType)
        {
            super(sType);
        }
        
        private static final javax.xml.namespace.QName INJURYDATE$0 = 
            new javax.xml.namespace.QName("http://www.nhsia.nhs.uk/DataStandards/XMLschema/CDS/ns", "InjuryDate");
        private static final javax.xml.namespace.QName INJURYTIME$2 = 
            new javax.xml.namespace.QName("http://www.nhsia.nhs.uk/DataStandards/XMLschema/CDS/ns", "InjuryTime");
        private static final javax.xml.namespace.QName EMERGENCYCAREPLACEOFINJURYSNOMEDCT$4 = 
            new javax.xml.namespace.QName("http://www.nhsia.nhs.uk/DataStandards/XMLschema/CDS/ns", "EmergencyCarePlaceOfInjury_SnomedCt");
        private static final javax.xml.namespace.QName EMERGENCYCAREPLACEOFINJURYLATITUDEANDLONGITUDE$6 = 
            new javax.xml.namespace.QName("http://www.nhsia.nhs.uk/DataStandards/XMLschema/CDS/ns", "EmergencyCarePlaceOfInjury_LatitudeAndLongitude");
        private static final javax.xml.namespace.QName EMERGENCYCAREINJURYINTENTSNOMEDCT$8 = 
            new javax.xml.namespace.QName("http://www.nhsia.nhs.uk/DataStandards/XMLschema/CDS/ns", "EmergencyCareInjuryIntent_SnomedCt");
        private static final javax.xml.namespace.QName EMERGENCYCAREINJURYACTIVITYSTATUSSNOMEDCT$10 = 
            new javax.xml.namespace.QName("http://www.nhsia.nhs.uk/DataStandards/XMLschema/CDS/ns", "EmergencyCareInjuryActivityStatus_SnomedCt");
        private static final javax.xml.namespace.QName EMERGENCYCAREINJURYACTIVITYTYPESNOMEDCT$12 = 
            new javax.xml.namespace.QName("http://www.nhsia.nhs.uk/DataStandards/XMLschema/CDS/ns", "EmergencyCareInjuryActivityType_SnomedCt");
        private static final javax.xml.namespace.QName EMERGENCYCAREINJURYMECHANISMSNOMEDCT$14 = 
            new javax.xml.namespace.QName("http://www.nhsia.nhs.uk/DataStandards/XMLschema/CDS/ns", "EmergencyCareInjuryMechanism_SnomedCt");
        private static final javax.xml.namespace.QName EMERGENCYCAREINJURYALCOHOLORDRUGINVOLVEMENTSNOMEDCT$16 = 
            new javax.xml.namespace.QName("http://www.nhsia.nhs.uk/DataStandards/XMLschema/CDS/ns", "EmergencyCareInjuryAlcoholOrDrugInvolvement_SnomedCt");
        
        
        /**
         * Gets the "InjuryDate" element
         */
        public java.util.Calendar getInjuryDate()
        {
            synchronized (monitor())
            {
                check_orphaned();
                org.apache.xmlbeans.SimpleValue target = null;
                target = (org.apache.xmlbeans.SimpleValue)get_store().find_element_user(INJURYDATE$0, 0);
                if (target == null)
                {
                    return null;
                }
                return target.getCalendarValue();
            }
        }
        
        /**
         * Gets (as xml) the "InjuryDate" element
         */
        public uk.nhs.nhsia.datastandards.ecds.DateType xgetInjuryDate()
        {
            synchronized (monitor())
            {
                check_orphaned();
                uk.nhs.nhsia.datastandards.ecds.DateType target = null;
                target = (uk.nhs.nhsia.datastandards.ecds.DateType)get_store().find_element_user(INJURYDATE$0, 0);
                return target;
            }
        }
        
        /**
         * Sets the "InjuryDate" element
         */
        public void setInjuryDate(java.util.Calendar injuryDate)
        {
            synchronized (monitor())
            {
                check_orphaned();
                org.apache.xmlbeans.SimpleValue target = null;
                target = (org.apache.xmlbeans.SimpleValue)get_store().find_element_user(INJURYDATE$0, 0);
                if (target == null)
                {
                    target = (org.apache.xmlbeans.SimpleValue)get_store().add_element_user(INJURYDATE$0);
                }
                target.setCalendarValue(injuryDate);
            }
        }
        
        /**
         * Sets (as xml) the "InjuryDate" element
         */
        public void xsetInjuryDate(uk.nhs.nhsia.datastandards.ecds.DateType injuryDate)
        {
            synchronized (monitor())
            {
                check_orphaned();
                uk.nhs.nhsia.datastandards.ecds.DateType target = null;
                target = (uk.nhs.nhsia.datastandards.ecds.DateType)get_store().find_element_user(INJURYDATE$0, 0);
                if (target == null)
                {
                    target = (uk.nhs.nhsia.datastandards.ecds.DateType)get_store().add_element_user(INJURYDATE$0);
                }
                target.set(injuryDate);
            }
        }
        
        /**
         * Gets the "InjuryTime" element
         */
        public java.util.Calendar getInjuryTime()
        {
            synchronized (monitor())
            {
                check_orphaned();
                org.apache.xmlbeans.SimpleValue target = null;
                target = (org.apache.xmlbeans.SimpleValue)get_store().find_element_user(INJURYTIME$2, 0);
                if (target == null)
                {
                    return null;
                }
                return target.getCalendarValue();
            }
        }
        
        /**
         * Gets (as xml) the "InjuryTime" element
         */
        public uk.nhs.nhsia.datastandards.ecds.TimeType xgetInjuryTime()
        {
            synchronized (monitor())
            {
                check_orphaned();
                uk.nhs.nhsia.datastandards.ecds.TimeType target = null;
                target = (uk.nhs.nhsia.datastandards.ecds.TimeType)get_store().find_element_user(INJURYTIME$2, 0);
                return target;
            }
        }
        
        /**
         * Sets the "InjuryTime" element
         */
        public void setInjuryTime(java.util.Calendar injuryTime)
        {
            synchronized (monitor())
            {
                check_orphaned();
                org.apache.xmlbeans.SimpleValue target = null;
                target = (org.apache.xmlbeans.SimpleValue)get_store().find_element_user(INJURYTIME$2, 0);
                if (target == null)
                {
                    target = (org.apache.xmlbeans.SimpleValue)get_store().add_element_user(INJURYTIME$2);
                }
                target.setCalendarValue(injuryTime);
            }
        }
        
        /**
         * Sets (as xml) the "InjuryTime" element
         */
        public void xsetInjuryTime(uk.nhs.nhsia.datastandards.ecds.TimeType injuryTime)
        {
            synchronized (monitor())
            {
                check_orphaned();
                uk.nhs.nhsia.datastandards.ecds.TimeType target = null;
                target = (uk.nhs.nhsia.datastandards.ecds.TimeType)get_store().find_element_user(INJURYTIME$2, 0);
                if (target == null)
                {
                    target = (uk.nhs.nhsia.datastandards.ecds.TimeType)get_store().add_element_user(INJURYTIME$2);
                }
                target.set(injuryTime);
            }
        }
        
        /**
         * Gets the "EmergencyCarePlaceOfInjury_SnomedCt" element
         */
        public java.lang.String getEmergencyCarePlaceOfInjurySnomedCt()
        {
            synchronized (monitor())
            {
                check_orphaned();
                org.apache.xmlbeans.SimpleValue target = null;
                target = (org.apache.xmlbeans.SimpleValue)get_store().find_element_user(EMERGENCYCAREPLACEOFINJURYSNOMEDCT$4, 0);
                if (target == null)
                {
                    return null;
                }
                return target.getStringValue();
            }
        }
        
        /**
         * Gets (as xml) the "EmergencyCarePlaceOfInjury_SnomedCt" element
         */
        public uk.nhs.nhsia.datastandards.ecds.N618ECType xgetEmergencyCarePlaceOfInjurySnomedCt()
        {
            synchronized (monitor())
            {
                check_orphaned();
                uk.nhs.nhsia.datastandards.ecds.N618ECType target = null;
                target = (uk.nhs.nhsia.datastandards.ecds.N618ECType)get_store().find_element_user(EMERGENCYCAREPLACEOFINJURYSNOMEDCT$4, 0);
                return target;
            }
        }
        
        /**
         * True if has "EmergencyCarePlaceOfInjury_SnomedCt" element
         */
        public boolean isSetEmergencyCarePlaceOfInjurySnomedCt()
        {
            synchronized (monitor())
            {
                check_orphaned();
                return get_store().count_elements(EMERGENCYCAREPLACEOFINJURYSNOMEDCT$4) != 0;
            }
        }
        
        /**
         * Sets the "EmergencyCarePlaceOfInjury_SnomedCt" element
         */
        public void setEmergencyCarePlaceOfInjurySnomedCt(java.lang.String emergencyCarePlaceOfInjurySnomedCt)
        {
            synchronized (monitor())
            {
                check_orphaned();
                org.apache.xmlbeans.SimpleValue target = null;
                target = (org.apache.xmlbeans.SimpleValue)get_store().find_element_user(EMERGENCYCAREPLACEOFINJURYSNOMEDCT$4, 0);
                if (target == null)
                {
                    target = (org.apache.xmlbeans.SimpleValue)get_store().add_element_user(EMERGENCYCAREPLACEOFINJURYSNOMEDCT$4);
                }
                target.setStringValue(emergencyCarePlaceOfInjurySnomedCt);
            }
        }
        
        /**
         * Sets (as xml) the "EmergencyCarePlaceOfInjury_SnomedCt" element
         */
        public void xsetEmergencyCarePlaceOfInjurySnomedCt(uk.nhs.nhsia.datastandards.ecds.N618ECType emergencyCarePlaceOfInjurySnomedCt)
        {
            synchronized (monitor())
            {
                check_orphaned();
                uk.nhs.nhsia.datastandards.ecds.N618ECType target = null;
                target = (uk.nhs.nhsia.datastandards.ecds.N618ECType)get_store().find_element_user(EMERGENCYCAREPLACEOFINJURYSNOMEDCT$4, 0);
                if (target == null)
                {
                    target = (uk.nhs.nhsia.datastandards.ecds.N618ECType)get_store().add_element_user(EMERGENCYCAREPLACEOFINJURYSNOMEDCT$4);
                }
                target.set(emergencyCarePlaceOfInjurySnomedCt);
            }
        }
        
        /**
         * Unsets the "EmergencyCarePlaceOfInjury_SnomedCt" element
         */
        public void unsetEmergencyCarePlaceOfInjurySnomedCt()
        {
            synchronized (monitor())
            {
                check_orphaned();
                get_store().remove_element(EMERGENCYCAREPLACEOFINJURYSNOMEDCT$4, 0);
            }
        }
        
        /**
         * Gets the "EmergencyCarePlaceOfInjury_LatitudeAndLongitude" element
         */
        public uk.nhs.nhsia.datastandards.ecds.AttendanceOccurrenceECStructure.InjuryCharacteristics.EmergencyCarePlaceOfInjuryLatitudeAndLongitude getEmergencyCarePlaceOfInjuryLatitudeAndLongitude()
        {
            synchronized (monitor())
            {
                check_orphaned();
                uk.nhs.nhsia.datastandards.ecds.AttendanceOccurrenceECStructure.InjuryCharacteristics.EmergencyCarePlaceOfInjuryLatitudeAndLongitude target = null;
                target = (uk.nhs.nhsia.datastandards.ecds.AttendanceOccurrenceECStructure.InjuryCharacteristics.EmergencyCarePlaceOfInjuryLatitudeAndLongitude)get_store().find_element_user(EMERGENCYCAREPLACEOFINJURYLATITUDEANDLONGITUDE$6, 0);
                if (target == null)
                {
                    return null;
                }
                return target;
            }
        }
        
        /**
         * True if has "EmergencyCarePlaceOfInjury_LatitudeAndLongitude" element
         */
        public boolean isSetEmergencyCarePlaceOfInjuryLatitudeAndLongitude()
        {
            synchronized (monitor())
            {
                check_orphaned();
                return get_store().count_elements(EMERGENCYCAREPLACEOFINJURYLATITUDEANDLONGITUDE$6) != 0;
            }
        }
        
        /**
         * Sets the "EmergencyCarePlaceOfInjury_LatitudeAndLongitude" element
         */
        public void setEmergencyCarePlaceOfInjuryLatitudeAndLongitude(uk.nhs.nhsia.datastandards.ecds.AttendanceOccurrenceECStructure.InjuryCharacteristics.EmergencyCarePlaceOfInjuryLatitudeAndLongitude emergencyCarePlaceOfInjuryLatitudeAndLongitude)
        {
            generatedSetterHelperImpl(emergencyCarePlaceOfInjuryLatitudeAndLongitude, EMERGENCYCAREPLACEOFINJURYLATITUDEANDLONGITUDE$6, 0, org.apache.xmlbeans.impl.values.XmlObjectBase.KIND_SETTERHELPER_SINGLETON);
        }
        
        /**
         * Appends and returns a new empty "EmergencyCarePlaceOfInjury_LatitudeAndLongitude" element
         */
        public uk.nhs.nhsia.datastandards.ecds.AttendanceOccurrenceECStructure.InjuryCharacteristics.EmergencyCarePlaceOfInjuryLatitudeAndLongitude addNewEmergencyCarePlaceOfInjuryLatitudeAndLongitude()
        {
            synchronized (monitor())
            {
                check_orphaned();
                uk.nhs.nhsia.datastandards.ecds.AttendanceOccurrenceECStructure.InjuryCharacteristics.EmergencyCarePlaceOfInjuryLatitudeAndLongitude target = null;
                target = (uk.nhs.nhsia.datastandards.ecds.AttendanceOccurrenceECStructure.InjuryCharacteristics.EmergencyCarePlaceOfInjuryLatitudeAndLongitude)get_store().add_element_user(EMERGENCYCAREPLACEOFINJURYLATITUDEANDLONGITUDE$6);
                return target;
            }
        }
        
        /**
         * Unsets the "EmergencyCarePlaceOfInjury_LatitudeAndLongitude" element
         */
        public void unsetEmergencyCarePlaceOfInjuryLatitudeAndLongitude()
        {
            synchronized (monitor())
            {
                check_orphaned();
                get_store().remove_element(EMERGENCYCAREPLACEOFINJURYLATITUDEANDLONGITUDE$6, 0);
            }
        }
        
        /**
         * Gets the "EmergencyCareInjuryIntent_SnomedCt" element
         */
        public java.lang.String getEmergencyCareInjuryIntentSnomedCt()
        {
            synchronized (monitor())
            {
                check_orphaned();
                org.apache.xmlbeans.SimpleValue target = null;
                target = (org.apache.xmlbeans.SimpleValue)get_store().find_element_user(EMERGENCYCAREINJURYINTENTSNOMEDCT$8, 0);
                if (target == null)
                {
                    return null;
                }
                return target.getStringValue();
            }
        }
        
        /**
         * Gets (as xml) the "EmergencyCareInjuryIntent_SnomedCt" element
         */
        public uk.nhs.nhsia.datastandards.ecds.N618ECType xgetEmergencyCareInjuryIntentSnomedCt()
        {
            synchronized (monitor())
            {
                check_orphaned();
                uk.nhs.nhsia.datastandards.ecds.N618ECType target = null;
                target = (uk.nhs.nhsia.datastandards.ecds.N618ECType)get_store().find_element_user(EMERGENCYCAREINJURYINTENTSNOMEDCT$8, 0);
                return target;
            }
        }
        
        /**
         * True if has "EmergencyCareInjuryIntent_SnomedCt" element
         */
        public boolean isSetEmergencyCareInjuryIntentSnomedCt()
        {
            synchronized (monitor())
            {
                check_orphaned();
                return get_store().count_elements(EMERGENCYCAREINJURYINTENTSNOMEDCT$8) != 0;
            }
        }
        
        /**
         * Sets the "EmergencyCareInjuryIntent_SnomedCt" element
         */
        public void setEmergencyCareInjuryIntentSnomedCt(java.lang.String emergencyCareInjuryIntentSnomedCt)
        {
            synchronized (monitor())
            {
                check_orphaned();
                org.apache.xmlbeans.SimpleValue target = null;
                target = (org.apache.xmlbeans.SimpleValue)get_store().find_element_user(EMERGENCYCAREINJURYINTENTSNOMEDCT$8, 0);
                if (target == null)
                {
                    target = (org.apache.xmlbeans.SimpleValue)get_store().add_element_user(EMERGENCYCAREINJURYINTENTSNOMEDCT$8);
                }
                target.setStringValue(emergencyCareInjuryIntentSnomedCt);
            }
        }
        
        /**
         * Sets (as xml) the "EmergencyCareInjuryIntent_SnomedCt" element
         */
        public void xsetEmergencyCareInjuryIntentSnomedCt(uk.nhs.nhsia.datastandards.ecds.N618ECType emergencyCareInjuryIntentSnomedCt)
        {
            synchronized (monitor())
            {
                check_orphaned();
                uk.nhs.nhsia.datastandards.ecds.N618ECType target = null;
                target = (uk.nhs.nhsia.datastandards.ecds.N618ECType)get_store().find_element_user(EMERGENCYCAREINJURYINTENTSNOMEDCT$8, 0);
                if (target == null)
                {
                    target = (uk.nhs.nhsia.datastandards.ecds.N618ECType)get_store().add_element_user(EMERGENCYCAREINJURYINTENTSNOMEDCT$8);
                }
                target.set(emergencyCareInjuryIntentSnomedCt);
            }
        }
        
        /**
         * Unsets the "EmergencyCareInjuryIntent_SnomedCt" element
         */
        public void unsetEmergencyCareInjuryIntentSnomedCt()
        {
            synchronized (monitor())
            {
                check_orphaned();
                get_store().remove_element(EMERGENCYCAREINJURYINTENTSNOMEDCT$8, 0);
            }
        }
        
        /**
         * Gets the "EmergencyCareInjuryActivityStatus_SnomedCt" element
         */
        public java.lang.String getEmergencyCareInjuryActivityStatusSnomedCt()
        {
            synchronized (monitor())
            {
                check_orphaned();
                org.apache.xmlbeans.SimpleValue target = null;
                target = (org.apache.xmlbeans.SimpleValue)get_store().find_element_user(EMERGENCYCAREINJURYACTIVITYSTATUSSNOMEDCT$10, 0);
                if (target == null)
                {
                    return null;
                }
                return target.getStringValue();
            }
        }
        
        /**
         * Gets (as xml) the "EmergencyCareInjuryActivityStatus_SnomedCt" element
         */
        public uk.nhs.nhsia.datastandards.ecds.N618ECType xgetEmergencyCareInjuryActivityStatusSnomedCt()
        {
            synchronized (monitor())
            {
                check_orphaned();
                uk.nhs.nhsia.datastandards.ecds.N618ECType target = null;
                target = (uk.nhs.nhsia.datastandards.ecds.N618ECType)get_store().find_element_user(EMERGENCYCAREINJURYACTIVITYSTATUSSNOMEDCT$10, 0);
                return target;
            }
        }
        
        /**
         * True if has "EmergencyCareInjuryActivityStatus_SnomedCt" element
         */
        public boolean isSetEmergencyCareInjuryActivityStatusSnomedCt()
        {
            synchronized (monitor())
            {
                check_orphaned();
                return get_store().count_elements(EMERGENCYCAREINJURYACTIVITYSTATUSSNOMEDCT$10) != 0;
            }
        }
        
        /**
         * Sets the "EmergencyCareInjuryActivityStatus_SnomedCt" element
         */
        public void setEmergencyCareInjuryActivityStatusSnomedCt(java.lang.String emergencyCareInjuryActivityStatusSnomedCt)
        {
            synchronized (monitor())
            {
                check_orphaned();
                org.apache.xmlbeans.SimpleValue target = null;
                target = (org.apache.xmlbeans.SimpleValue)get_store().find_element_user(EMERGENCYCAREINJURYACTIVITYSTATUSSNOMEDCT$10, 0);
                if (target == null)
                {
                    target = (org.apache.xmlbeans.SimpleValue)get_store().add_element_user(EMERGENCYCAREINJURYACTIVITYSTATUSSNOMEDCT$10);
                }
                target.setStringValue(emergencyCareInjuryActivityStatusSnomedCt);
            }
        }
        
        /**
         * Sets (as xml) the "EmergencyCareInjuryActivityStatus_SnomedCt" element
         */
        public void xsetEmergencyCareInjuryActivityStatusSnomedCt(uk.nhs.nhsia.datastandards.ecds.N618ECType emergencyCareInjuryActivityStatusSnomedCt)
        {
            synchronized (monitor())
            {
                check_orphaned();
                uk.nhs.nhsia.datastandards.ecds.N618ECType target = null;
                target = (uk.nhs.nhsia.datastandards.ecds.N618ECType)get_store().find_element_user(EMERGENCYCAREINJURYACTIVITYSTATUSSNOMEDCT$10, 0);
                if (target == null)
                {
                    target = (uk.nhs.nhsia.datastandards.ecds.N618ECType)get_store().add_element_user(EMERGENCYCAREINJURYACTIVITYSTATUSSNOMEDCT$10);
                }
                target.set(emergencyCareInjuryActivityStatusSnomedCt);
            }
        }
        
        /**
         * Unsets the "EmergencyCareInjuryActivityStatus_SnomedCt" element
         */
        public void unsetEmergencyCareInjuryActivityStatusSnomedCt()
        {
            synchronized (monitor())
            {
                check_orphaned();
                get_store().remove_element(EMERGENCYCAREINJURYACTIVITYSTATUSSNOMEDCT$10, 0);
            }
        }
        
        /**
         * Gets the "EmergencyCareInjuryActivityType_SnomedCt" element
         */
        public java.lang.String getEmergencyCareInjuryActivityTypeSnomedCt()
        {
            synchronized (monitor())
            {
                check_orphaned();
                org.apache.xmlbeans.SimpleValue target = null;
                target = (org.apache.xmlbeans.SimpleValue)get_store().find_element_user(EMERGENCYCAREINJURYACTIVITYTYPESNOMEDCT$12, 0);
                if (target == null)
                {
                    return null;
                }
                return target.getStringValue();
            }
        }
        
        /**
         * Gets (as xml) the "EmergencyCareInjuryActivityType_SnomedCt" element
         */
        public uk.nhs.nhsia.datastandards.ecds.N618ECType xgetEmergencyCareInjuryActivityTypeSnomedCt()
        {
            synchronized (monitor())
            {
                check_orphaned();
                uk.nhs.nhsia.datastandards.ecds.N618ECType target = null;
                target = (uk.nhs.nhsia.datastandards.ecds.N618ECType)get_store().find_element_user(EMERGENCYCAREINJURYACTIVITYTYPESNOMEDCT$12, 0);
                return target;
            }
        }
        
        /**
         * True if has "EmergencyCareInjuryActivityType_SnomedCt" element
         */
        public boolean isSetEmergencyCareInjuryActivityTypeSnomedCt()
        {
            synchronized (monitor())
            {
                check_orphaned();
                return get_store().count_elements(EMERGENCYCAREINJURYACTIVITYTYPESNOMEDCT$12) != 0;
            }
        }
        
        /**
         * Sets the "EmergencyCareInjuryActivityType_SnomedCt" element
         */
        public void setEmergencyCareInjuryActivityTypeSnomedCt(java.lang.String emergencyCareInjuryActivityTypeSnomedCt)
        {
            synchronized (monitor())
            {
                check_orphaned();
                org.apache.xmlbeans.SimpleValue target = null;
                target = (org.apache.xmlbeans.SimpleValue)get_store().find_element_user(EMERGENCYCAREINJURYACTIVITYTYPESNOMEDCT$12, 0);
                if (target == null)
                {
                    target = (org.apache.xmlbeans.SimpleValue)get_store().add_element_user(EMERGENCYCAREINJURYACTIVITYTYPESNOMEDCT$12);
                }
                target.setStringValue(emergencyCareInjuryActivityTypeSnomedCt);
            }
        }
        
        /**
         * Sets (as xml) the "EmergencyCareInjuryActivityType_SnomedCt" element
         */
        public void xsetEmergencyCareInjuryActivityTypeSnomedCt(uk.nhs.nhsia.datastandards.ecds.N618ECType emergencyCareInjuryActivityTypeSnomedCt)
        {
            synchronized (monitor())
            {
                check_orphaned();
                uk.nhs.nhsia.datastandards.ecds.N618ECType target = null;
                target = (uk.nhs.nhsia.datastandards.ecds.N618ECType)get_store().find_element_user(EMERGENCYCAREINJURYACTIVITYTYPESNOMEDCT$12, 0);
                if (target == null)
                {
                    target = (uk.nhs.nhsia.datastandards.ecds.N618ECType)get_store().add_element_user(EMERGENCYCAREINJURYACTIVITYTYPESNOMEDCT$12);
                }
                target.set(emergencyCareInjuryActivityTypeSnomedCt);
            }
        }
        
        /**
         * Unsets the "EmergencyCareInjuryActivityType_SnomedCt" element
         */
        public void unsetEmergencyCareInjuryActivityTypeSnomedCt()
        {
            synchronized (monitor())
            {
                check_orphaned();
                get_store().remove_element(EMERGENCYCAREINJURYACTIVITYTYPESNOMEDCT$12, 0);
            }
        }
        
        /**
         * Gets the "EmergencyCareInjuryMechanism_SnomedCt" element
         */
        public java.lang.String getEmergencyCareInjuryMechanismSnomedCt()
        {
            synchronized (monitor())
            {
                check_orphaned();
                org.apache.xmlbeans.SimpleValue target = null;
                target = (org.apache.xmlbeans.SimpleValue)get_store().find_element_user(EMERGENCYCAREINJURYMECHANISMSNOMEDCT$14, 0);
                if (target == null)
                {
                    return null;
                }
                return target.getStringValue();
            }
        }
        
        /**
         * Gets (as xml) the "EmergencyCareInjuryMechanism_SnomedCt" element
         */
        public uk.nhs.nhsia.datastandards.ecds.N618ECType xgetEmergencyCareInjuryMechanismSnomedCt()
        {
            synchronized (monitor())
            {
                check_orphaned();
                uk.nhs.nhsia.datastandards.ecds.N618ECType target = null;
                target = (uk.nhs.nhsia.datastandards.ecds.N618ECType)get_store().find_element_user(EMERGENCYCAREINJURYMECHANISMSNOMEDCT$14, 0);
                return target;
            }
        }
        
        /**
         * True if has "EmergencyCareInjuryMechanism_SnomedCt" element
         */
        public boolean isSetEmergencyCareInjuryMechanismSnomedCt()
        {
            synchronized (monitor())
            {
                check_orphaned();
                return get_store().count_elements(EMERGENCYCAREINJURYMECHANISMSNOMEDCT$14) != 0;
            }
        }
        
        /**
         * Sets the "EmergencyCareInjuryMechanism_SnomedCt" element
         */
        public void setEmergencyCareInjuryMechanismSnomedCt(java.lang.String emergencyCareInjuryMechanismSnomedCt)
        {
            synchronized (monitor())
            {
                check_orphaned();
                org.apache.xmlbeans.SimpleValue target = null;
                target = (org.apache.xmlbeans.SimpleValue)get_store().find_element_user(EMERGENCYCAREINJURYMECHANISMSNOMEDCT$14, 0);
                if (target == null)
                {
                    target = (org.apache.xmlbeans.SimpleValue)get_store().add_element_user(EMERGENCYCAREINJURYMECHANISMSNOMEDCT$14);
                }
                target.setStringValue(emergencyCareInjuryMechanismSnomedCt);
            }
        }
        
        /**
         * Sets (as xml) the "EmergencyCareInjuryMechanism_SnomedCt" element
         */
        public void xsetEmergencyCareInjuryMechanismSnomedCt(uk.nhs.nhsia.datastandards.ecds.N618ECType emergencyCareInjuryMechanismSnomedCt)
        {
            synchronized (monitor())
            {
                check_orphaned();
                uk.nhs.nhsia.datastandards.ecds.N618ECType target = null;
                target = (uk.nhs.nhsia.datastandards.ecds.N618ECType)get_store().find_element_user(EMERGENCYCAREINJURYMECHANISMSNOMEDCT$14, 0);
                if (target == null)
                {
                    target = (uk.nhs.nhsia.datastandards.ecds.N618ECType)get_store().add_element_user(EMERGENCYCAREINJURYMECHANISMSNOMEDCT$14);
                }
                target.set(emergencyCareInjuryMechanismSnomedCt);
            }
        }
        
        /**
         * Unsets the "EmergencyCareInjuryMechanism_SnomedCt" element
         */
        public void unsetEmergencyCareInjuryMechanismSnomedCt()
        {
            synchronized (monitor())
            {
                check_orphaned();
                get_store().remove_element(EMERGENCYCAREINJURYMECHANISMSNOMEDCT$14, 0);
            }
        }
        
        /**
         * Gets array of all "EmergencyCareInjuryAlcoholOrDrugInvolvement_SnomedCt" elements
         */
        public java.lang.String[] getEmergencyCareInjuryAlcoholOrDrugInvolvementSnomedCtArray()
        {
            synchronized (monitor())
            {
                check_orphaned();
                java.util.List targetList = new java.util.ArrayList();
                get_store().find_all_element_users(EMERGENCYCAREINJURYALCOHOLORDRUGINVOLVEMENTSNOMEDCT$16, targetList);
                java.lang.String[] result = new java.lang.String[targetList.size()];
                for (int i = 0, len = targetList.size() ; i < len ; i++)
                    result[i] = ((org.apache.xmlbeans.SimpleValue)targetList.get(i)).getStringValue();
                return result;
            }
        }
        
        /**
         * Gets ith "EmergencyCareInjuryAlcoholOrDrugInvolvement_SnomedCt" element
         */
        public java.lang.String getEmergencyCareInjuryAlcoholOrDrugInvolvementSnomedCtArray(int i)
        {
            synchronized (monitor())
            {
                check_orphaned();
                org.apache.xmlbeans.SimpleValue target = null;
                target = (org.apache.xmlbeans.SimpleValue)get_store().find_element_user(EMERGENCYCAREINJURYALCOHOLORDRUGINVOLVEMENTSNOMEDCT$16, i);
                if (target == null)
                {
                    throw new IndexOutOfBoundsException();
                }
                return target.getStringValue();
            }
        }
        
        /**
         * Gets (as xml) array of all "EmergencyCareInjuryAlcoholOrDrugInvolvement_SnomedCt" elements
         */
        public uk.nhs.nhsia.datastandards.ecds.N618ECType[] xgetEmergencyCareInjuryAlcoholOrDrugInvolvementSnomedCtArray()
        {
            synchronized (monitor())
            {
                check_orphaned();
                java.util.List targetList = new java.util.ArrayList();
                get_store().find_all_element_users(EMERGENCYCAREINJURYALCOHOLORDRUGINVOLVEMENTSNOMEDCT$16, targetList);
                uk.nhs.nhsia.datastandards.ecds.N618ECType[] result = new uk.nhs.nhsia.datastandards.ecds.N618ECType[targetList.size()];
                targetList.toArray(result);
                return result;
            }
        }
        
        /**
         * Gets (as xml) ith "EmergencyCareInjuryAlcoholOrDrugInvolvement_SnomedCt" element
         */
        public uk.nhs.nhsia.datastandards.ecds.N618ECType xgetEmergencyCareInjuryAlcoholOrDrugInvolvementSnomedCtArray(int i)
        {
            synchronized (monitor())
            {
                check_orphaned();
                uk.nhs.nhsia.datastandards.ecds.N618ECType target = null;
                target = (uk.nhs.nhsia.datastandards.ecds.N618ECType)get_store().find_element_user(EMERGENCYCAREINJURYALCOHOLORDRUGINVOLVEMENTSNOMEDCT$16, i);
                if (target == null)
                {
                    throw new IndexOutOfBoundsException();
                }
                return target;
            }
        }
        
        /**
         * Returns number of "EmergencyCareInjuryAlcoholOrDrugInvolvement_SnomedCt" element
         */
        public int sizeOfEmergencyCareInjuryAlcoholOrDrugInvolvementSnomedCtArray()
        {
            synchronized (monitor())
            {
                check_orphaned();
                return get_store().count_elements(EMERGENCYCAREINJURYALCOHOLORDRUGINVOLVEMENTSNOMEDCT$16);
            }
        }
        
        /**
         * Sets array of all "EmergencyCareInjuryAlcoholOrDrugInvolvement_SnomedCt" element
         */
        public void setEmergencyCareInjuryAlcoholOrDrugInvolvementSnomedCtArray(java.lang.String[] emergencyCareInjuryAlcoholOrDrugInvolvementSnomedCtArray)
        {
            synchronized (monitor())
            {
                check_orphaned();
                arraySetterHelper(emergencyCareInjuryAlcoholOrDrugInvolvementSnomedCtArray, EMERGENCYCAREINJURYALCOHOLORDRUGINVOLVEMENTSNOMEDCT$16);
            }
        }
        
        /**
         * Sets ith "EmergencyCareInjuryAlcoholOrDrugInvolvement_SnomedCt" element
         */
        public void setEmergencyCareInjuryAlcoholOrDrugInvolvementSnomedCtArray(int i, java.lang.String emergencyCareInjuryAlcoholOrDrugInvolvementSnomedCt)
        {
            synchronized (monitor())
            {
                check_orphaned();
                org.apache.xmlbeans.SimpleValue target = null;
                target = (org.apache.xmlbeans.SimpleValue)get_store().find_element_user(EMERGENCYCAREINJURYALCOHOLORDRUGINVOLVEMENTSNOMEDCT$16, i);
                if (target == null)
                {
                    throw new IndexOutOfBoundsException();
                }
                target.setStringValue(emergencyCareInjuryAlcoholOrDrugInvolvementSnomedCt);
            }
        }
        
        /**
         * Sets (as xml) array of all "EmergencyCareInjuryAlcoholOrDrugInvolvement_SnomedCt" element
         */
        public void xsetEmergencyCareInjuryAlcoholOrDrugInvolvementSnomedCtArray(uk.nhs.nhsia.datastandards.ecds.N618ECType[]emergencyCareInjuryAlcoholOrDrugInvolvementSnomedCtArray)
        {
            synchronized (monitor())
            {
                check_orphaned();
                arraySetterHelper(emergencyCareInjuryAlcoholOrDrugInvolvementSnomedCtArray, EMERGENCYCAREINJURYALCOHOLORDRUGINVOLVEMENTSNOMEDCT$16);
            }
        }
        
        /**
         * Sets (as xml) ith "EmergencyCareInjuryAlcoholOrDrugInvolvement_SnomedCt" element
         */
        public void xsetEmergencyCareInjuryAlcoholOrDrugInvolvementSnomedCtArray(int i, uk.nhs.nhsia.datastandards.ecds.N618ECType emergencyCareInjuryAlcoholOrDrugInvolvementSnomedCt)
        {
            synchronized (monitor())
            {
                check_orphaned();
                uk.nhs.nhsia.datastandards.ecds.N618ECType target = null;
                target = (uk.nhs.nhsia.datastandards.ecds.N618ECType)get_store().find_element_user(EMERGENCYCAREINJURYALCOHOLORDRUGINVOLVEMENTSNOMEDCT$16, i);
                if (target == null)
                {
                    throw new IndexOutOfBoundsException();
                }
                target.set(emergencyCareInjuryAlcoholOrDrugInvolvementSnomedCt);
            }
        }
        
        /**
         * Inserts the value as the ith "EmergencyCareInjuryAlcoholOrDrugInvolvement_SnomedCt" element
         */
        public void insertEmergencyCareInjuryAlcoholOrDrugInvolvementSnomedCt(int i, java.lang.String emergencyCareInjuryAlcoholOrDrugInvolvementSnomedCt)
        {
            synchronized (monitor())
            {
                check_orphaned();
                org.apache.xmlbeans.SimpleValue target = 
                    (org.apache.xmlbeans.SimpleValue)get_store().insert_element_user(EMERGENCYCAREINJURYALCOHOLORDRUGINVOLVEMENTSNOMEDCT$16, i);
                target.setStringValue(emergencyCareInjuryAlcoholOrDrugInvolvementSnomedCt);
            }
        }
        
        /**
         * Appends the value as the last "EmergencyCareInjuryAlcoholOrDrugInvolvement_SnomedCt" element
         */
        public void addEmergencyCareInjuryAlcoholOrDrugInvolvementSnomedCt(java.lang.String emergencyCareInjuryAlcoholOrDrugInvolvementSnomedCt)
        {
            synchronized (monitor())
            {
                check_orphaned();
                org.apache.xmlbeans.SimpleValue target = null;
                target = (org.apache.xmlbeans.SimpleValue)get_store().add_element_user(EMERGENCYCAREINJURYALCOHOLORDRUGINVOLVEMENTSNOMEDCT$16);
                target.setStringValue(emergencyCareInjuryAlcoholOrDrugInvolvementSnomedCt);
            }
        }
        
        /**
         * Inserts and returns a new empty value (as xml) as the ith "EmergencyCareInjuryAlcoholOrDrugInvolvement_SnomedCt" element
         */
        public uk.nhs.nhsia.datastandards.ecds.N618ECType insertNewEmergencyCareInjuryAlcoholOrDrugInvolvementSnomedCt(int i)
        {
            synchronized (monitor())
            {
                check_orphaned();
                uk.nhs.nhsia.datastandards.ecds.N618ECType target = null;
                target = (uk.nhs.nhsia.datastandards.ecds.N618ECType)get_store().insert_element_user(EMERGENCYCAREINJURYALCOHOLORDRUGINVOLVEMENTSNOMEDCT$16, i);
                return target;
            }
        }
        
        /**
         * Appends and returns a new empty value (as xml) as the last "EmergencyCareInjuryAlcoholOrDrugInvolvement_SnomedCt" element
         */
        public uk.nhs.nhsia.datastandards.ecds.N618ECType addNewEmergencyCareInjuryAlcoholOrDrugInvolvementSnomedCt()
        {
            synchronized (monitor())
            {
                check_orphaned();
                uk.nhs.nhsia.datastandards.ecds.N618ECType target = null;
                target = (uk.nhs.nhsia.datastandards.ecds.N618ECType)get_store().add_element_user(EMERGENCYCAREINJURYALCOHOLORDRUGINVOLVEMENTSNOMEDCT$16);
                return target;
            }
        }
        
        /**
         * Removes the ith "EmergencyCareInjuryAlcoholOrDrugInvolvement_SnomedCt" element
         */
        public void removeEmergencyCareInjuryAlcoholOrDrugInvolvementSnomedCt(int i)
        {
            synchronized (monitor())
            {
                check_orphaned();
                get_store().remove_element(EMERGENCYCAREINJURYALCOHOLORDRUGINVOLVEMENTSNOMEDCT$16, i);
            }
        }
        /**
         * An XML EmergencyCarePlaceOfInjury_LatitudeAndLongitude(@http://www.nhsia.nhs.uk/DataStandards/XMLschema/CDS/ns).
         *
         * This is a complex type.
         */
        public static class EmergencyCarePlaceOfInjuryLatitudeAndLongitudeImpl extends org.apache.xmlbeans.impl.values.XmlComplexContentImpl implements uk.nhs.nhsia.datastandards.ecds.AttendanceOccurrenceECStructure.InjuryCharacteristics.EmergencyCarePlaceOfInjuryLatitudeAndLongitude
        {
            private static final long serialVersionUID = 1L;
            
            public EmergencyCarePlaceOfInjuryLatitudeAndLongitudeImpl(org.apache.xmlbeans.SchemaType sType)
            {
                super(sType);
            }
            
            private static final javax.xml.namespace.QName LATITUDE$0 = 
                new javax.xml.namespace.QName("http://www.nhsia.nhs.uk/DataStandards/XMLschema/CDS/ns", "Latitude");
            private static final javax.xml.namespace.QName LONGITUDE$2 = 
                new javax.xml.namespace.QName("http://www.nhsia.nhs.uk/DataStandards/XMLschema/CDS/ns", "Longitude");
            
            
            /**
             * Gets the "Latitude" element
             */
            public java.math.BigDecimal getLatitude()
            {
                synchronized (monitor())
                {
                    check_orphaned();
                    org.apache.xmlbeans.SimpleValue target = null;
                    target = (org.apache.xmlbeans.SimpleValue)get_store().find_element_user(LATITUDE$0, 0);
                    if (target == null)
                    {
                      return null;
                    }
                    return target.getBigDecimalValue();
                }
            }
            
            /**
             * Gets (as xml) the "Latitude" element
             */
            public uk.nhs.nhsia.datastandards.ecds.AttendanceOccurrenceECStructure.InjuryCharacteristics.EmergencyCarePlaceOfInjuryLatitudeAndLongitude.Latitude xgetLatitude()
            {
                synchronized (monitor())
                {
                    check_orphaned();
                    uk.nhs.nhsia.datastandards.ecds.AttendanceOccurrenceECStructure.InjuryCharacteristics.EmergencyCarePlaceOfInjuryLatitudeAndLongitude.Latitude target = null;
                    target = (uk.nhs.nhsia.datastandards.ecds.AttendanceOccurrenceECStructure.InjuryCharacteristics.EmergencyCarePlaceOfInjuryLatitudeAndLongitude.Latitude)get_store().find_element_user(LATITUDE$0, 0);
                    return target;
                }
            }
            
            /**
             * Sets the "Latitude" element
             */
            public void setLatitude(java.math.BigDecimal latitude)
            {
                synchronized (monitor())
                {
                    check_orphaned();
                    org.apache.xmlbeans.SimpleValue target = null;
                    target = (org.apache.xmlbeans.SimpleValue)get_store().find_element_user(LATITUDE$0, 0);
                    if (target == null)
                    {
                      target = (org.apache.xmlbeans.SimpleValue)get_store().add_element_user(LATITUDE$0);
                    }
                    target.setBigDecimalValue(latitude);
                }
            }
            
            /**
             * Sets (as xml) the "Latitude" element
             */
            public void xsetLatitude(uk.nhs.nhsia.datastandards.ecds.AttendanceOccurrenceECStructure.InjuryCharacteristics.EmergencyCarePlaceOfInjuryLatitudeAndLongitude.Latitude latitude)
            {
                synchronized (monitor())
                {
                    check_orphaned();
                    uk.nhs.nhsia.datastandards.ecds.AttendanceOccurrenceECStructure.InjuryCharacteristics.EmergencyCarePlaceOfInjuryLatitudeAndLongitude.Latitude target = null;
                    target = (uk.nhs.nhsia.datastandards.ecds.AttendanceOccurrenceECStructure.InjuryCharacteristics.EmergencyCarePlaceOfInjuryLatitudeAndLongitude.Latitude)get_store().find_element_user(LATITUDE$0, 0);
                    if (target == null)
                    {
                      target = (uk.nhs.nhsia.datastandards.ecds.AttendanceOccurrenceECStructure.InjuryCharacteristics.EmergencyCarePlaceOfInjuryLatitudeAndLongitude.Latitude)get_store().add_element_user(LATITUDE$0);
                    }
                    target.set(latitude);
                }
            }
            
            /**
             * Gets the "Longitude" element
             */
            public java.math.BigDecimal getLongitude()
            {
                synchronized (monitor())
                {
                    check_orphaned();
                    org.apache.xmlbeans.SimpleValue target = null;
                    target = (org.apache.xmlbeans.SimpleValue)get_store().find_element_user(LONGITUDE$2, 0);
                    if (target == null)
                    {
                      return null;
                    }
                    return target.getBigDecimalValue();
                }
            }
            
            /**
             * Gets (as xml) the "Longitude" element
             */
            public uk.nhs.nhsia.datastandards.ecds.AttendanceOccurrenceECStructure.InjuryCharacteristics.EmergencyCarePlaceOfInjuryLatitudeAndLongitude.Longitude xgetLongitude()
            {
                synchronized (monitor())
                {
                    check_orphaned();
                    uk.nhs.nhsia.datastandards.ecds.AttendanceOccurrenceECStructure.InjuryCharacteristics.EmergencyCarePlaceOfInjuryLatitudeAndLongitude.Longitude target = null;
                    target = (uk.nhs.nhsia.datastandards.ecds.AttendanceOccurrenceECStructure.InjuryCharacteristics.EmergencyCarePlaceOfInjuryLatitudeAndLongitude.Longitude)get_store().find_element_user(LONGITUDE$2, 0);
                    return target;
                }
            }
            
            /**
             * Sets the "Longitude" element
             */
            public void setLongitude(java.math.BigDecimal longitude)
            {
                synchronized (monitor())
                {
                    check_orphaned();
                    org.apache.xmlbeans.SimpleValue target = null;
                    target = (org.apache.xmlbeans.SimpleValue)get_store().find_element_user(LONGITUDE$2, 0);
                    if (target == null)
                    {
                      target = (org.apache.xmlbeans.SimpleValue)get_store().add_element_user(LONGITUDE$2);
                    }
                    target.setBigDecimalValue(longitude);
                }
            }
            
            /**
             * Sets (as xml) the "Longitude" element
             */
            public void xsetLongitude(uk.nhs.nhsia.datastandards.ecds.AttendanceOccurrenceECStructure.InjuryCharacteristics.EmergencyCarePlaceOfInjuryLatitudeAndLongitude.Longitude longitude)
            {
                synchronized (monitor())
                {
                    check_orphaned();
                    uk.nhs.nhsia.datastandards.ecds.AttendanceOccurrenceECStructure.InjuryCharacteristics.EmergencyCarePlaceOfInjuryLatitudeAndLongitude.Longitude target = null;
                    target = (uk.nhs.nhsia.datastandards.ecds.AttendanceOccurrenceECStructure.InjuryCharacteristics.EmergencyCarePlaceOfInjuryLatitudeAndLongitude.Longitude)get_store().find_element_user(LONGITUDE$2, 0);
                    if (target == null)
                    {
                      target = (uk.nhs.nhsia.datastandards.ecds.AttendanceOccurrenceECStructure.InjuryCharacteristics.EmergencyCarePlaceOfInjuryLatitudeAndLongitude.Longitude)get_store().add_element_user(LONGITUDE$2);
                    }
                    target.set(longitude);
                }
            }
            /**
             * An XML Latitude(@http://www.nhsia.nhs.uk/DataStandards/XMLschema/CDS/ns).
             *
             * This is an atomic type that is a restriction of uk.nhs.nhsia.datastandards.ecds.AttendanceOccurrenceECStructure$InjuryCharacteristics$EmergencyCarePlaceOfInjuryLatitudeAndLongitude$Latitude.
             */
            public static class LatitudeImpl extends org.apache.xmlbeans.impl.values.JavaDecimalHolderEx implements uk.nhs.nhsia.datastandards.ecds.AttendanceOccurrenceECStructure.InjuryCharacteristics.EmergencyCarePlaceOfInjuryLatitudeAndLongitude.Latitude
            {
                private static final long serialVersionUID = 1L;
                
                public LatitudeImpl(org.apache.xmlbeans.SchemaType sType)
                {
                    super(sType, false);
                }
                
                protected LatitudeImpl(org.apache.xmlbeans.SchemaType sType, boolean b)
                {
                    super(sType, b);
                }
            }
            /**
             * An XML Longitude(@http://www.nhsia.nhs.uk/DataStandards/XMLschema/CDS/ns).
             *
             * This is an atomic type that is a restriction of uk.nhs.nhsia.datastandards.ecds.AttendanceOccurrenceECStructure$InjuryCharacteristics$EmergencyCarePlaceOfInjuryLatitudeAndLongitude$Longitude.
             */
            public static class LongitudeImpl extends org.apache.xmlbeans.impl.values.JavaDecimalHolderEx implements uk.nhs.nhsia.datastandards.ecds.AttendanceOccurrenceECStructure.InjuryCharacteristics.EmergencyCarePlaceOfInjuryLatitudeAndLongitude.Longitude
            {
                private static final long serialVersionUID = 1L;
                
                public LongitudeImpl(org.apache.xmlbeans.SchemaType sType)
                {
                    super(sType, false);
                }
                
                protected LongitudeImpl(org.apache.xmlbeans.SchemaType sType, boolean b)
                {
                    super(sType, b);
                }
            }
        }
    }
    /**
     * An XML PatientClinicalHistory(@http://www.nhsia.nhs.uk/DataStandards/XMLschema/CDS/ns).
     *
     * This is a complex type.
     */
    public static class PatientClinicalHistoryImpl extends org.apache.xmlbeans.impl.values.XmlComplexContentImpl implements uk.nhs.nhsia.datastandards.ecds.AttendanceOccurrenceECStructure.PatientClinicalHistory
    {
        private static final long serialVersionUID = 1L;
        
        public PatientClinicalHistoryImpl(org.apache.xmlbeans.SchemaType sType)
        {
            super(sType);
        }
        
        private static final javax.xml.namespace.QName COMORBIDITYSNOMEDCT$0 = 
            new javax.xml.namespace.QName("http://www.nhsia.nhs.uk/DataStandards/XMLschema/CDS/ns", "Comorbidity_SnomedCt");
        
        
        /**
         * Gets array of all "Comorbidity_SnomedCt" elements
         */
        public java.lang.String[] getComorbiditySnomedCtArray()
        {
            synchronized (monitor())
            {
                check_orphaned();
                java.util.List targetList = new java.util.ArrayList();
                get_store().find_all_element_users(COMORBIDITYSNOMEDCT$0, targetList);
                java.lang.String[] result = new java.lang.String[targetList.size()];
                for (int i = 0, len = targetList.size() ; i < len ; i++)
                    result[i] = ((org.apache.xmlbeans.SimpleValue)targetList.get(i)).getStringValue();
                return result;
            }
        }
        
        /**
         * Gets ith "Comorbidity_SnomedCt" element
         */
        public java.lang.String getComorbiditySnomedCtArray(int i)
        {
            synchronized (monitor())
            {
                check_orphaned();
                org.apache.xmlbeans.SimpleValue target = null;
                target = (org.apache.xmlbeans.SimpleValue)get_store().find_element_user(COMORBIDITYSNOMEDCT$0, i);
                if (target == null)
                {
                    throw new IndexOutOfBoundsException();
                }
                return target.getStringValue();
            }
        }
        
        /**
         * Gets (as xml) array of all "Comorbidity_SnomedCt" elements
         */
        public uk.nhs.nhsia.datastandards.ecds.N618ECType[] xgetComorbiditySnomedCtArray()
        {
            synchronized (monitor())
            {
                check_orphaned();
                java.util.List targetList = new java.util.ArrayList();
                get_store().find_all_element_users(COMORBIDITYSNOMEDCT$0, targetList);
                uk.nhs.nhsia.datastandards.ecds.N618ECType[] result = new uk.nhs.nhsia.datastandards.ecds.N618ECType[targetList.size()];
                targetList.toArray(result);
                return result;
            }
        }
        
        /**
         * Gets (as xml) ith "Comorbidity_SnomedCt" element
         */
        public uk.nhs.nhsia.datastandards.ecds.N618ECType xgetComorbiditySnomedCtArray(int i)
        {
            synchronized (monitor())
            {
                check_orphaned();
                uk.nhs.nhsia.datastandards.ecds.N618ECType target = null;
                target = (uk.nhs.nhsia.datastandards.ecds.N618ECType)get_store().find_element_user(COMORBIDITYSNOMEDCT$0, i);
                if (target == null)
                {
                    throw new IndexOutOfBoundsException();
                }
                return target;
            }
        }
        
        /**
         * Returns number of "Comorbidity_SnomedCt" element
         */
        public int sizeOfComorbiditySnomedCtArray()
        {
            synchronized (monitor())
            {
                check_orphaned();
                return get_store().count_elements(COMORBIDITYSNOMEDCT$0);
            }
        }
        
        /**
         * Sets array of all "Comorbidity_SnomedCt" element
         */
        public void setComorbiditySnomedCtArray(java.lang.String[] comorbiditySnomedCtArray)
        {
            synchronized (monitor())
            {
                check_orphaned();
                arraySetterHelper(comorbiditySnomedCtArray, COMORBIDITYSNOMEDCT$0);
            }
        }
        
        /**
         * Sets ith "Comorbidity_SnomedCt" element
         */
        public void setComorbiditySnomedCtArray(int i, java.lang.String comorbiditySnomedCt)
        {
            synchronized (monitor())
            {
                check_orphaned();
                org.apache.xmlbeans.SimpleValue target = null;
                target = (org.apache.xmlbeans.SimpleValue)get_store().find_element_user(COMORBIDITYSNOMEDCT$0, i);
                if (target == null)
                {
                    throw new IndexOutOfBoundsException();
                }
                target.setStringValue(comorbiditySnomedCt);
            }
        }
        
        /**
         * Sets (as xml) array of all "Comorbidity_SnomedCt" element
         */
        public void xsetComorbiditySnomedCtArray(uk.nhs.nhsia.datastandards.ecds.N618ECType[]comorbiditySnomedCtArray)
        {
            synchronized (monitor())
            {
                check_orphaned();
                arraySetterHelper(comorbiditySnomedCtArray, COMORBIDITYSNOMEDCT$0);
            }
        }
        
        /**
         * Sets (as xml) ith "Comorbidity_SnomedCt" element
         */
        public void xsetComorbiditySnomedCtArray(int i, uk.nhs.nhsia.datastandards.ecds.N618ECType comorbiditySnomedCt)
        {
            synchronized (monitor())
            {
                check_orphaned();
                uk.nhs.nhsia.datastandards.ecds.N618ECType target = null;
                target = (uk.nhs.nhsia.datastandards.ecds.N618ECType)get_store().find_element_user(COMORBIDITYSNOMEDCT$0, i);
                if (target == null)
                {
                    throw new IndexOutOfBoundsException();
                }
                target.set(comorbiditySnomedCt);
            }
        }
        
        /**
         * Inserts the value as the ith "Comorbidity_SnomedCt" element
         */
        public void insertComorbiditySnomedCt(int i, java.lang.String comorbiditySnomedCt)
        {
            synchronized (monitor())
            {
                check_orphaned();
                org.apache.xmlbeans.SimpleValue target = 
                    (org.apache.xmlbeans.SimpleValue)get_store().insert_element_user(COMORBIDITYSNOMEDCT$0, i);
                target.setStringValue(comorbiditySnomedCt);
            }
        }
        
        /**
         * Appends the value as the last "Comorbidity_SnomedCt" element
         */
        public void addComorbiditySnomedCt(java.lang.String comorbiditySnomedCt)
        {
            synchronized (monitor())
            {
                check_orphaned();
                org.apache.xmlbeans.SimpleValue target = null;
                target = (org.apache.xmlbeans.SimpleValue)get_store().add_element_user(COMORBIDITYSNOMEDCT$0);
                target.setStringValue(comorbiditySnomedCt);
            }
        }
        
        /**
         * Inserts and returns a new empty value (as xml) as the ith "Comorbidity_SnomedCt" element
         */
        public uk.nhs.nhsia.datastandards.ecds.N618ECType insertNewComorbiditySnomedCt(int i)
        {
            synchronized (monitor())
            {
                check_orphaned();
                uk.nhs.nhsia.datastandards.ecds.N618ECType target = null;
                target = (uk.nhs.nhsia.datastandards.ecds.N618ECType)get_store().insert_element_user(COMORBIDITYSNOMEDCT$0, i);
                return target;
            }
        }
        
        /**
         * Appends and returns a new empty value (as xml) as the last "Comorbidity_SnomedCt" element
         */
        public uk.nhs.nhsia.datastandards.ecds.N618ECType addNewComorbiditySnomedCt()
        {
            synchronized (monitor())
            {
                check_orphaned();
                uk.nhs.nhsia.datastandards.ecds.N618ECType target = null;
                target = (uk.nhs.nhsia.datastandards.ecds.N618ECType)get_store().add_element_user(COMORBIDITYSNOMEDCT$0);
                return target;
            }
        }
        
        /**
         * Removes the ith "Comorbidity_SnomedCt" element
         */
        public void removeComorbiditySnomedCt(int i)
        {
            synchronized (monitor())
            {
                check_orphaned();
                get_store().remove_element(COMORBIDITYSNOMEDCT$0, i);
            }
        }
    }
    /**
     * An XML ServiceAgreementDetails(@http://www.nhsia.nhs.uk/DataStandards/XMLschema/CDS/ns).
     *
     * This is a complex type.
     */
    public static class ServiceAgreementDetailsImpl extends org.apache.xmlbeans.impl.values.XmlComplexContentImpl implements uk.nhs.nhsia.datastandards.ecds.AttendanceOccurrenceECStructure.ServiceAgreementDetails
    {
        private static final long serialVersionUID = 1L;
        
        public ServiceAgreementDetailsImpl(org.apache.xmlbeans.SchemaType sType)
        {
            super(sType);
        }
        
        private static final javax.xml.namespace.QName COMMISSIONINGSERIALNUMBER$0 = 
            new javax.xml.namespace.QName("http://www.nhsia.nhs.uk/DataStandards/XMLschema/CDS/ns", "CommissioningSerialNumber");
        private static final javax.xml.namespace.QName NHSSERVICEAGREEMENTLINENUMBER$2 = 
            new javax.xml.namespace.QName("http://www.nhsia.nhs.uk/DataStandards/XMLschema/CDS/ns", "NhsServiceAgreementLineNumber");
        private static final javax.xml.namespace.QName PROVIDERREFERENCENUMBER$4 = 
            new javax.xml.namespace.QName("http://www.nhsia.nhs.uk/DataStandards/XMLschema/CDS/ns", "ProviderReferenceNumber");
        private static final javax.xml.namespace.QName COMMISSIONERREFERENCENUMBER$6 = 
            new javax.xml.namespace.QName("http://www.nhsia.nhs.uk/DataStandards/XMLschema/CDS/ns", "CommissionerReferenceNumber");
        private static final javax.xml.namespace.QName ORGANISATIONIDENTIFIERCODEOFPROVIDER$8 = 
            new javax.xml.namespace.QName("http://www.nhsia.nhs.uk/DataStandards/XMLschema/CDS/ns", "OrganisationIdentifier_CodeOfProvider");
        private static final javax.xml.namespace.QName ORGANISATIONIDENTIFIERCODEOFCOMMISSIONER$10 = 
            new javax.xml.namespace.QName("http://www.nhsia.nhs.uk/DataStandards/XMLschema/CDS/ns", "OrganisationIdentifier_CodeOfCommissioner");
        
        
        /**
         * Gets the "CommissioningSerialNumber" element
         */
        public java.lang.String getCommissioningSerialNumber()
        {
            synchronized (monitor())
            {
                check_orphaned();
                org.apache.xmlbeans.SimpleValue target = null;
                target = (org.apache.xmlbeans.SimpleValue)get_store().find_element_user(COMMISSIONINGSERIALNUMBER$0, 0);
                if (target == null)
                {
                    return null;
                }
                return target.getStringValue();
            }
        }
        
        /**
         * Gets (as xml) the "CommissioningSerialNumber" element
         */
        public uk.nhs.nhsia.datastandards.ecds.CommissioningSerialNumberType xgetCommissioningSerialNumber()
        {
            synchronized (monitor())
            {
                check_orphaned();
                uk.nhs.nhsia.datastandards.ecds.CommissioningSerialNumberType target = null;
                target = (uk.nhs.nhsia.datastandards.ecds.CommissioningSerialNumberType)get_store().find_element_user(COMMISSIONINGSERIALNUMBER$0, 0);
                return target;
            }
        }
        
        /**
         * True if has "CommissioningSerialNumber" element
         */
        public boolean isSetCommissioningSerialNumber()
        {
            synchronized (monitor())
            {
                check_orphaned();
                return get_store().count_elements(COMMISSIONINGSERIALNUMBER$0) != 0;
            }
        }
        
        /**
         * Sets the "CommissioningSerialNumber" element
         */
        public void setCommissioningSerialNumber(java.lang.String commissioningSerialNumber)
        {
            synchronized (monitor())
            {
                check_orphaned();
                org.apache.xmlbeans.SimpleValue target = null;
                target = (org.apache.xmlbeans.SimpleValue)get_store().find_element_user(COMMISSIONINGSERIALNUMBER$0, 0);
                if (target == null)
                {
                    target = (org.apache.xmlbeans.SimpleValue)get_store().add_element_user(COMMISSIONINGSERIALNUMBER$0);
                }
                target.setStringValue(commissioningSerialNumber);
            }
        }
        
        /**
         * Sets (as xml) the "CommissioningSerialNumber" element
         */
        public void xsetCommissioningSerialNumber(uk.nhs.nhsia.datastandards.ecds.CommissioningSerialNumberType commissioningSerialNumber)
        {
            synchronized (monitor())
            {
                check_orphaned();
                uk.nhs.nhsia.datastandards.ecds.CommissioningSerialNumberType target = null;
                target = (uk.nhs.nhsia.datastandards.ecds.CommissioningSerialNumberType)get_store().find_element_user(COMMISSIONINGSERIALNUMBER$0, 0);
                if (target == null)
                {
                    target = (uk.nhs.nhsia.datastandards.ecds.CommissioningSerialNumberType)get_store().add_element_user(COMMISSIONINGSERIALNUMBER$0);
                }
                target.set(commissioningSerialNumber);
            }
        }
        
        /**
         * Unsets the "CommissioningSerialNumber" element
         */
        public void unsetCommissioningSerialNumber()
        {
            synchronized (monitor())
            {
                check_orphaned();
                get_store().remove_element(COMMISSIONINGSERIALNUMBER$0, 0);
            }
        }
        
        /**
         * Gets the "NhsServiceAgreementLineNumber" element
         */
        public java.lang.String getNhsServiceAgreementLineNumber()
        {
            synchronized (monitor())
            {
                check_orphaned();
                org.apache.xmlbeans.SimpleValue target = null;
                target = (org.apache.xmlbeans.SimpleValue)get_store().find_element_user(NHSSERVICEAGREEMENTLINENUMBER$2, 0);
                if (target == null)
                {
                    return null;
                }
                return target.getStringValue();
            }
        }
        
        /**
         * Gets (as xml) the "NhsServiceAgreementLineNumber" element
         */
        public uk.nhs.nhsia.datastandards.ecds.NHSServiceAgreementLineNumberType xgetNhsServiceAgreementLineNumber()
        {
            synchronized (monitor())
            {
                check_orphaned();
                uk.nhs.nhsia.datastandards.ecds.NHSServiceAgreementLineNumberType target = null;
                target = (uk.nhs.nhsia.datastandards.ecds.NHSServiceAgreementLineNumberType)get_store().find_element_user(NHSSERVICEAGREEMENTLINENUMBER$2, 0);
                return target;
            }
        }
        
        /**
         * True if has "NhsServiceAgreementLineNumber" element
         */
        public boolean isSetNhsServiceAgreementLineNumber()
        {
            synchronized (monitor())
            {
                check_orphaned();
                return get_store().count_elements(NHSSERVICEAGREEMENTLINENUMBER$2) != 0;
            }
        }
        
        /**
         * Sets the "NhsServiceAgreementLineNumber" element
         */
        public void setNhsServiceAgreementLineNumber(java.lang.String nhsServiceAgreementLineNumber)
        {
            synchronized (monitor())
            {
                check_orphaned();
                org.apache.xmlbeans.SimpleValue target = null;
                target = (org.apache.xmlbeans.SimpleValue)get_store().find_element_user(NHSSERVICEAGREEMENTLINENUMBER$2, 0);
                if (target == null)
                {
                    target = (org.apache.xmlbeans.SimpleValue)get_store().add_element_user(NHSSERVICEAGREEMENTLINENUMBER$2);
                }
                target.setStringValue(nhsServiceAgreementLineNumber);
            }
        }
        
        /**
         * Sets (as xml) the "NhsServiceAgreementLineNumber" element
         */
        public void xsetNhsServiceAgreementLineNumber(uk.nhs.nhsia.datastandards.ecds.NHSServiceAgreementLineNumberType nhsServiceAgreementLineNumber)
        {
            synchronized (monitor())
            {
                check_orphaned();
                uk.nhs.nhsia.datastandards.ecds.NHSServiceAgreementLineNumberType target = null;
                target = (uk.nhs.nhsia.datastandards.ecds.NHSServiceAgreementLineNumberType)get_store().find_element_user(NHSSERVICEAGREEMENTLINENUMBER$2, 0);
                if (target == null)
                {
                    target = (uk.nhs.nhsia.datastandards.ecds.NHSServiceAgreementLineNumberType)get_store().add_element_user(NHSSERVICEAGREEMENTLINENUMBER$2);
                }
                target.set(nhsServiceAgreementLineNumber);
            }
        }
        
        /**
         * Unsets the "NhsServiceAgreementLineNumber" element
         */
        public void unsetNhsServiceAgreementLineNumber()
        {
            synchronized (monitor())
            {
                check_orphaned();
                get_store().remove_element(NHSSERVICEAGREEMENTLINENUMBER$2, 0);
            }
        }
        
        /**
         * Gets the "ProviderReferenceNumber" element
         */
        public java.lang.String getProviderReferenceNumber()
        {
            synchronized (monitor())
            {
                check_orphaned();
                org.apache.xmlbeans.SimpleValue target = null;
                target = (org.apache.xmlbeans.SimpleValue)get_store().find_element_user(PROVIDERREFERENCENUMBER$4, 0);
                if (target == null)
                {
                    return null;
                }
                return target.getStringValue();
            }
        }
        
        /**
         * Gets (as xml) the "ProviderReferenceNumber" element
         */
        public uk.nhs.nhsia.datastandards.ecds.ProviderReferenceNumberType xgetProviderReferenceNumber()
        {
            synchronized (monitor())
            {
                check_orphaned();
                uk.nhs.nhsia.datastandards.ecds.ProviderReferenceNumberType target = null;
                target = (uk.nhs.nhsia.datastandards.ecds.ProviderReferenceNumberType)get_store().find_element_user(PROVIDERREFERENCENUMBER$4, 0);
                return target;
            }
        }
        
        /**
         * True if has "ProviderReferenceNumber" element
         */
        public boolean isSetProviderReferenceNumber()
        {
            synchronized (monitor())
            {
                check_orphaned();
                return get_store().count_elements(PROVIDERREFERENCENUMBER$4) != 0;
            }
        }
        
        /**
         * Sets the "ProviderReferenceNumber" element
         */
        public void setProviderReferenceNumber(java.lang.String providerReferenceNumber)
        {
            synchronized (monitor())
            {
                check_orphaned();
                org.apache.xmlbeans.SimpleValue target = null;
                target = (org.apache.xmlbeans.SimpleValue)get_store().find_element_user(PROVIDERREFERENCENUMBER$4, 0);
                if (target == null)
                {
                    target = (org.apache.xmlbeans.SimpleValue)get_store().add_element_user(PROVIDERREFERENCENUMBER$4);
                }
                target.setStringValue(providerReferenceNumber);
            }
        }
        
        /**
         * Sets (as xml) the "ProviderReferenceNumber" element
         */
        public void xsetProviderReferenceNumber(uk.nhs.nhsia.datastandards.ecds.ProviderReferenceNumberType providerReferenceNumber)
        {
            synchronized (monitor())
            {
                check_orphaned();
                uk.nhs.nhsia.datastandards.ecds.ProviderReferenceNumberType target = null;
                target = (uk.nhs.nhsia.datastandards.ecds.ProviderReferenceNumberType)get_store().find_element_user(PROVIDERREFERENCENUMBER$4, 0);
                if (target == null)
                {
                    target = (uk.nhs.nhsia.datastandards.ecds.ProviderReferenceNumberType)get_store().add_element_user(PROVIDERREFERENCENUMBER$4);
                }
                target.set(providerReferenceNumber);
            }
        }
        
        /**
         * Unsets the "ProviderReferenceNumber" element
         */
        public void unsetProviderReferenceNumber()
        {
            synchronized (monitor())
            {
                check_orphaned();
                get_store().remove_element(PROVIDERREFERENCENUMBER$4, 0);
            }
        }
        
        /**
         * Gets the "CommissionerReferenceNumber" element
         */
        public java.lang.String getCommissionerReferenceNumber()
        {
            synchronized (monitor())
            {
                check_orphaned();
                org.apache.xmlbeans.SimpleValue target = null;
                target = (org.apache.xmlbeans.SimpleValue)get_store().find_element_user(COMMISSIONERREFERENCENUMBER$6, 0);
                if (target == null)
                {
                    return null;
                }
                return target.getStringValue();
            }
        }
        
        /**
         * Gets (as xml) the "CommissionerReferenceNumber" element
         */
        public uk.nhs.nhsia.datastandards.ecds.CommissionerReferenceNumberType xgetCommissionerReferenceNumber()
        {
            synchronized (monitor())
            {
                check_orphaned();
                uk.nhs.nhsia.datastandards.ecds.CommissionerReferenceNumberType target = null;
                target = (uk.nhs.nhsia.datastandards.ecds.CommissionerReferenceNumberType)get_store().find_element_user(COMMISSIONERREFERENCENUMBER$6, 0);
                return target;
            }
        }
        
        /**
         * True if has "CommissionerReferenceNumber" element
         */
        public boolean isSetCommissionerReferenceNumber()
        {
            synchronized (monitor())
            {
                check_orphaned();
                return get_store().count_elements(COMMISSIONERREFERENCENUMBER$6) != 0;
            }
        }
        
        /**
         * Sets the "CommissionerReferenceNumber" element
         */
        public void setCommissionerReferenceNumber(java.lang.String commissionerReferenceNumber)
        {
            synchronized (monitor())
            {
                check_orphaned();
                org.apache.xmlbeans.SimpleValue target = null;
                target = (org.apache.xmlbeans.SimpleValue)get_store().find_element_user(COMMISSIONERREFERENCENUMBER$6, 0);
                if (target == null)
                {
                    target = (org.apache.xmlbeans.SimpleValue)get_store().add_element_user(COMMISSIONERREFERENCENUMBER$6);
                }
                target.setStringValue(commissionerReferenceNumber);
            }
        }
        
        /**
         * Sets (as xml) the "CommissionerReferenceNumber" element
         */
        public void xsetCommissionerReferenceNumber(uk.nhs.nhsia.datastandards.ecds.CommissionerReferenceNumberType commissionerReferenceNumber)
        {
            synchronized (monitor())
            {
                check_orphaned();
                uk.nhs.nhsia.datastandards.ecds.CommissionerReferenceNumberType target = null;
                target = (uk.nhs.nhsia.datastandards.ecds.CommissionerReferenceNumberType)get_store().find_element_user(COMMISSIONERREFERENCENUMBER$6, 0);
                if (target == null)
                {
                    target = (uk.nhs.nhsia.datastandards.ecds.CommissionerReferenceNumberType)get_store().add_element_user(COMMISSIONERREFERENCENUMBER$6);
                }
                target.set(commissionerReferenceNumber);
            }
        }
        
        /**
         * Unsets the "CommissionerReferenceNumber" element
         */
        public void unsetCommissionerReferenceNumber()
        {
            synchronized (monitor())
            {
                check_orphaned();
                get_store().remove_element(COMMISSIONERREFERENCENUMBER$6, 0);
            }
        }
        
        /**
         * Gets the "OrganisationIdentifier_CodeOfProvider" element
         */
        public java.lang.String getOrganisationIdentifierCodeOfProvider()
        {
            synchronized (monitor())
            {
                check_orphaned();
                org.apache.xmlbeans.SimpleValue target = null;
                target = (org.apache.xmlbeans.SimpleValue)get_store().find_element_user(ORGANISATIONIDENTIFIERCODEOFPROVIDER$8, 0);
                if (target == null)
                {
                    return null;
                }
                return target.getStringValue();
            }
        }
        
        /**
         * Gets (as xml) the "OrganisationIdentifier_CodeOfProvider" element
         */
        public uk.nhs.nhsia.datastandards.ecds.AN35ECType xgetOrganisationIdentifierCodeOfProvider()
        {
            synchronized (monitor())
            {
                check_orphaned();
                uk.nhs.nhsia.datastandards.ecds.AN35ECType target = null;
                target = (uk.nhs.nhsia.datastandards.ecds.AN35ECType)get_store().find_element_user(ORGANISATIONIDENTIFIERCODEOFPROVIDER$8, 0);
                return target;
            }
        }
        
        /**
         * Sets the "OrganisationIdentifier_CodeOfProvider" element
         */
        public void setOrganisationIdentifierCodeOfProvider(java.lang.String organisationIdentifierCodeOfProvider)
        {
            synchronized (monitor())
            {
                check_orphaned();
                org.apache.xmlbeans.SimpleValue target = null;
                target = (org.apache.xmlbeans.SimpleValue)get_store().find_element_user(ORGANISATIONIDENTIFIERCODEOFPROVIDER$8, 0);
                if (target == null)
                {
                    target = (org.apache.xmlbeans.SimpleValue)get_store().add_element_user(ORGANISATIONIDENTIFIERCODEOFPROVIDER$8);
                }
                target.setStringValue(organisationIdentifierCodeOfProvider);
            }
        }
        
        /**
         * Sets (as xml) the "OrganisationIdentifier_CodeOfProvider" element
         */
        public void xsetOrganisationIdentifierCodeOfProvider(uk.nhs.nhsia.datastandards.ecds.AN35ECType organisationIdentifierCodeOfProvider)
        {
            synchronized (monitor())
            {
                check_orphaned();
                uk.nhs.nhsia.datastandards.ecds.AN35ECType target = null;
                target = (uk.nhs.nhsia.datastandards.ecds.AN35ECType)get_store().find_element_user(ORGANISATIONIDENTIFIERCODEOFPROVIDER$8, 0);
                if (target == null)
                {
                    target = (uk.nhs.nhsia.datastandards.ecds.AN35ECType)get_store().add_element_user(ORGANISATIONIDENTIFIERCODEOFPROVIDER$8);
                }
                target.set(organisationIdentifierCodeOfProvider);
            }
        }
        
        /**
         * Gets the "OrganisationIdentifier_CodeOfCommissioner" element
         */
        public java.lang.String getOrganisationIdentifierCodeOfCommissioner()
        {
            synchronized (monitor())
            {
                check_orphaned();
                org.apache.xmlbeans.SimpleValue target = null;
                target = (org.apache.xmlbeans.SimpleValue)get_store().find_element_user(ORGANISATIONIDENTIFIERCODEOFCOMMISSIONER$10, 0);
                if (target == null)
                {
                    return null;
                }
                return target.getStringValue();
            }
        }
        
        /**
         * Gets (as xml) the "OrganisationIdentifier_CodeOfCommissioner" element
         */
        public uk.nhs.nhsia.datastandards.ecds.AN35ECType xgetOrganisationIdentifierCodeOfCommissioner()
        {
            synchronized (monitor())
            {
                check_orphaned();
                uk.nhs.nhsia.datastandards.ecds.AN35ECType target = null;
                target = (uk.nhs.nhsia.datastandards.ecds.AN35ECType)get_store().find_element_user(ORGANISATIONIDENTIFIERCODEOFCOMMISSIONER$10, 0);
                return target;
            }
        }
        
        /**
         * Sets the "OrganisationIdentifier_CodeOfCommissioner" element
         */
        public void setOrganisationIdentifierCodeOfCommissioner(java.lang.String organisationIdentifierCodeOfCommissioner)
        {
            synchronized (monitor())
            {
                check_orphaned();
                org.apache.xmlbeans.SimpleValue target = null;
                target = (org.apache.xmlbeans.SimpleValue)get_store().find_element_user(ORGANISATIONIDENTIFIERCODEOFCOMMISSIONER$10, 0);
                if (target == null)
                {
                    target = (org.apache.xmlbeans.SimpleValue)get_store().add_element_user(ORGANISATIONIDENTIFIERCODEOFCOMMISSIONER$10);
                }
                target.setStringValue(organisationIdentifierCodeOfCommissioner);
            }
        }
        
        /**
         * Sets (as xml) the "OrganisationIdentifier_CodeOfCommissioner" element
         */
        public void xsetOrganisationIdentifierCodeOfCommissioner(uk.nhs.nhsia.datastandards.ecds.AN35ECType organisationIdentifierCodeOfCommissioner)
        {
            synchronized (monitor())
            {
                check_orphaned();
                uk.nhs.nhsia.datastandards.ecds.AN35ECType target = null;
                target = (uk.nhs.nhsia.datastandards.ecds.AN35ECType)get_store().find_element_user(ORGANISATIONIDENTIFIERCODEOFCOMMISSIONER$10, 0);
                if (target == null)
                {
                    target = (uk.nhs.nhsia.datastandards.ecds.AN35ECType)get_store().add_element_user(ORGANISATIONIDENTIFIERCODEOFCOMMISSIONER$10);
                }
                target.set(organisationIdentifierCodeOfCommissioner);
            }
        }
    }
    /**
     * An XML CareProfessionals_EmergencyCare(@http://www.nhsia.nhs.uk/DataStandards/XMLschema/CDS/ns).
     *
     * This is a complex type.
     */
    public static class CareProfessionalsEmergencyCareImpl extends org.apache.xmlbeans.impl.values.XmlComplexContentImpl implements uk.nhs.nhsia.datastandards.ecds.AttendanceOccurrenceECStructure.CareProfessionalsEmergencyCare
    {
        private static final long serialVersionUID = 1L;
        
        public CareProfessionalsEmergencyCareImpl(org.apache.xmlbeans.SchemaType sType)
        {
            super(sType);
        }
        
        private static final javax.xml.namespace.QName PROFESSIONALREGISTRATIONISSUERCODE$0 = 
            new javax.xml.namespace.QName("http://www.nhsia.nhs.uk/DataStandards/XMLschema/CDS/ns", "ProfessionalRegistrationIssuerCode");
        private static final javax.xml.namespace.QName PROFESSIONALREGISTRATIONENTRYIDENTIFIER$2 = 
            new javax.xml.namespace.QName("http://www.nhsia.nhs.uk/DataStandards/XMLschema/CDS/ns", "ProfessionalRegistrationEntryIdentifier");
        private static final javax.xml.namespace.QName CAREPROFESSIONALTIEREMERGENCYCARE$4 = 
            new javax.xml.namespace.QName("http://www.nhsia.nhs.uk/DataStandards/XMLschema/CDS/ns", "CareProfessionalTier_EmergencyCare");
        private static final javax.xml.namespace.QName CAREPROFESSIONALDISCHARGERESPONSIBILITYINDICATOREMERGENCYCARE$6 = 
            new javax.xml.namespace.QName("http://www.nhsia.nhs.uk/DataStandards/XMLschema/CDS/ns", "CareProfessionalDischargeResponsibilityIndicator_EmergencyCare");
        
        
        /**
         * Gets the "ProfessionalRegistrationIssuerCode" element
         */
        public uk.nhs.nhsia.datastandards.ecds.ProfessionalRegistrationIssuerCodeECType.Enum getProfessionalRegistrationIssuerCode()
        {
            synchronized (monitor())
            {
                check_orphaned();
                org.apache.xmlbeans.SimpleValue target = null;
                target = (org.apache.xmlbeans.SimpleValue)get_store().find_element_user(PROFESSIONALREGISTRATIONISSUERCODE$0, 0);
                if (target == null)
                {
                    return null;
                }
                return (uk.nhs.nhsia.datastandards.ecds.ProfessionalRegistrationIssuerCodeECType.Enum)target.getEnumValue();
            }
        }
        
        /**
         * Gets (as xml) the "ProfessionalRegistrationIssuerCode" element
         */
        public uk.nhs.nhsia.datastandards.ecds.ProfessionalRegistrationIssuerCodeECType xgetProfessionalRegistrationIssuerCode()
        {
            synchronized (monitor())
            {
                check_orphaned();
                uk.nhs.nhsia.datastandards.ecds.ProfessionalRegistrationIssuerCodeECType target = null;
                target = (uk.nhs.nhsia.datastandards.ecds.ProfessionalRegistrationIssuerCodeECType)get_store().find_element_user(PROFESSIONALREGISTRATIONISSUERCODE$0, 0);
                return target;
            }
        }
        
        /**
         * Sets the "ProfessionalRegistrationIssuerCode" element
         */
        public void setProfessionalRegistrationIssuerCode(uk.nhs.nhsia.datastandards.ecds.ProfessionalRegistrationIssuerCodeECType.Enum professionalRegistrationIssuerCode)
        {
            synchronized (monitor())
            {
                check_orphaned();
                org.apache.xmlbeans.SimpleValue target = null;
                target = (org.apache.xmlbeans.SimpleValue)get_store().find_element_user(PROFESSIONALREGISTRATIONISSUERCODE$0, 0);
                if (target == null)
                {
                    target = (org.apache.xmlbeans.SimpleValue)get_store().add_element_user(PROFESSIONALREGISTRATIONISSUERCODE$0);
                }
                target.setEnumValue(professionalRegistrationIssuerCode);
            }
        }
        
        /**
         * Sets (as xml) the "ProfessionalRegistrationIssuerCode" element
         */
        public void xsetProfessionalRegistrationIssuerCode(uk.nhs.nhsia.datastandards.ecds.ProfessionalRegistrationIssuerCodeECType professionalRegistrationIssuerCode)
        {
            synchronized (monitor())
            {
                check_orphaned();
                uk.nhs.nhsia.datastandards.ecds.ProfessionalRegistrationIssuerCodeECType target = null;
                target = (uk.nhs.nhsia.datastandards.ecds.ProfessionalRegistrationIssuerCodeECType)get_store().find_element_user(PROFESSIONALREGISTRATIONISSUERCODE$0, 0);
                if (target == null)
                {
                    target = (uk.nhs.nhsia.datastandards.ecds.ProfessionalRegistrationIssuerCodeECType)get_store().add_element_user(PROFESSIONALREGISTRATIONISSUERCODE$0);
                }
                target.set(professionalRegistrationIssuerCode);
            }
        }
        
        /**
         * Gets the "ProfessionalRegistrationEntryIdentifier" element
         */
        public java.lang.String getProfessionalRegistrationEntryIdentifier()
        {
            synchronized (monitor())
            {
                check_orphaned();
                org.apache.xmlbeans.SimpleValue target = null;
                target = (org.apache.xmlbeans.SimpleValue)get_store().find_element_user(PROFESSIONALREGISTRATIONENTRYIDENTIFIER$2, 0);
                if (target == null)
                {
                    return null;
                }
                return target.getStringValue();
            }
        }
        
        /**
         * Gets (as xml) the "ProfessionalRegistrationEntryIdentifier" element
         */
        public uk.nhs.nhsia.datastandards.ecds.ANMin1Max32ECType xgetProfessionalRegistrationEntryIdentifier()
        {
            synchronized (monitor())
            {
                check_orphaned();
                uk.nhs.nhsia.datastandards.ecds.ANMin1Max32ECType target = null;
                target = (uk.nhs.nhsia.datastandards.ecds.ANMin1Max32ECType)get_store().find_element_user(PROFESSIONALREGISTRATIONENTRYIDENTIFIER$2, 0);
                return target;
            }
        }
        
        /**
         * Sets the "ProfessionalRegistrationEntryIdentifier" element
         */
        public void setProfessionalRegistrationEntryIdentifier(java.lang.String professionalRegistrationEntryIdentifier)
        {
            synchronized (monitor())
            {
                check_orphaned();
                org.apache.xmlbeans.SimpleValue target = null;
                target = (org.apache.xmlbeans.SimpleValue)get_store().find_element_user(PROFESSIONALREGISTRATIONENTRYIDENTIFIER$2, 0);
                if (target == null)
                {
                    target = (org.apache.xmlbeans.SimpleValue)get_store().add_element_user(PROFESSIONALREGISTRATIONENTRYIDENTIFIER$2);
                }
                target.setStringValue(professionalRegistrationEntryIdentifier);
            }
        }
        
        /**
         * Sets (as xml) the "ProfessionalRegistrationEntryIdentifier" element
         */
        public void xsetProfessionalRegistrationEntryIdentifier(uk.nhs.nhsia.datastandards.ecds.ANMin1Max32ECType professionalRegistrationEntryIdentifier)
        {
            synchronized (monitor())
            {
                check_orphaned();
                uk.nhs.nhsia.datastandards.ecds.ANMin1Max32ECType target = null;
                target = (uk.nhs.nhsia.datastandards.ecds.ANMin1Max32ECType)get_store().find_element_user(PROFESSIONALREGISTRATIONENTRYIDENTIFIER$2, 0);
                if (target == null)
                {
                    target = (uk.nhs.nhsia.datastandards.ecds.ANMin1Max32ECType)get_store().add_element_user(PROFESSIONALREGISTRATIONENTRYIDENTIFIER$2);
                }
                target.set(professionalRegistrationEntryIdentifier);
            }
        }
        
        /**
         * Gets the "CareProfessionalTier_EmergencyCare" element
         */
        public uk.nhs.nhsia.datastandards.ecds.CareProfessionalTierECType.Enum getCareProfessionalTierEmergencyCare()
        {
            synchronized (monitor())
            {
                check_orphaned();
                org.apache.xmlbeans.SimpleValue target = null;
                target = (org.apache.xmlbeans.SimpleValue)get_store().find_element_user(CAREPROFESSIONALTIEREMERGENCYCARE$4, 0);
                if (target == null)
                {
                    return null;
                }
                return (uk.nhs.nhsia.datastandards.ecds.CareProfessionalTierECType.Enum)target.getEnumValue();
            }
        }
        
        /**
         * Gets (as xml) the "CareProfessionalTier_EmergencyCare" element
         */
        public uk.nhs.nhsia.datastandards.ecds.CareProfessionalTierECType xgetCareProfessionalTierEmergencyCare()
        {
            synchronized (monitor())
            {
                check_orphaned();
                uk.nhs.nhsia.datastandards.ecds.CareProfessionalTierECType target = null;
                target = (uk.nhs.nhsia.datastandards.ecds.CareProfessionalTierECType)get_store().find_element_user(CAREPROFESSIONALTIEREMERGENCYCARE$4, 0);
                return target;
            }
        }
        
        /**
         * Sets the "CareProfessionalTier_EmergencyCare" element
         */
        public void setCareProfessionalTierEmergencyCare(uk.nhs.nhsia.datastandards.ecds.CareProfessionalTierECType.Enum careProfessionalTierEmergencyCare)
        {
            synchronized (monitor())
            {
                check_orphaned();
                org.apache.xmlbeans.SimpleValue target = null;
                target = (org.apache.xmlbeans.SimpleValue)get_store().find_element_user(CAREPROFESSIONALTIEREMERGENCYCARE$4, 0);
                if (target == null)
                {
                    target = (org.apache.xmlbeans.SimpleValue)get_store().add_element_user(CAREPROFESSIONALTIEREMERGENCYCARE$4);
                }
                target.setEnumValue(careProfessionalTierEmergencyCare);
            }
        }
        
        /**
         * Sets (as xml) the "CareProfessionalTier_EmergencyCare" element
         */
        public void xsetCareProfessionalTierEmergencyCare(uk.nhs.nhsia.datastandards.ecds.CareProfessionalTierECType careProfessionalTierEmergencyCare)
        {
            synchronized (monitor())
            {
                check_orphaned();
                uk.nhs.nhsia.datastandards.ecds.CareProfessionalTierECType target = null;
                target = (uk.nhs.nhsia.datastandards.ecds.CareProfessionalTierECType)get_store().find_element_user(CAREPROFESSIONALTIEREMERGENCYCARE$4, 0);
                if (target == null)
                {
                    target = (uk.nhs.nhsia.datastandards.ecds.CareProfessionalTierECType)get_store().add_element_user(CAREPROFESSIONALTIEREMERGENCYCARE$4);
                }
                target.set(careProfessionalTierEmergencyCare);
            }
        }
        
        /**
         * Gets the "CareProfessionalDischargeResponsibilityIndicator_EmergencyCare" element
         */
        public uk.nhs.nhsia.datastandards.ecds.YesNoECType.Enum getCareProfessionalDischargeResponsibilityIndicatorEmergencyCare()
        {
            synchronized (monitor())
            {
                check_orphaned();
                org.apache.xmlbeans.SimpleValue target = null;
                target = (org.apache.xmlbeans.SimpleValue)get_store().find_element_user(CAREPROFESSIONALDISCHARGERESPONSIBILITYINDICATOREMERGENCYCARE$6, 0);
                if (target == null)
                {
                    return null;
                }
                return (uk.nhs.nhsia.datastandards.ecds.YesNoECType.Enum)target.getEnumValue();
            }
        }
        
        /**
         * Gets (as xml) the "CareProfessionalDischargeResponsibilityIndicator_EmergencyCare" element
         */
        public uk.nhs.nhsia.datastandards.ecds.YesNoECType xgetCareProfessionalDischargeResponsibilityIndicatorEmergencyCare()
        {
            synchronized (monitor())
            {
                check_orphaned();
                uk.nhs.nhsia.datastandards.ecds.YesNoECType target = null;
                target = (uk.nhs.nhsia.datastandards.ecds.YesNoECType)get_store().find_element_user(CAREPROFESSIONALDISCHARGERESPONSIBILITYINDICATOREMERGENCYCARE$6, 0);
                return target;
            }
        }
        
        /**
         * Sets the "CareProfessionalDischargeResponsibilityIndicator_EmergencyCare" element
         */
        public void setCareProfessionalDischargeResponsibilityIndicatorEmergencyCare(uk.nhs.nhsia.datastandards.ecds.YesNoECType.Enum careProfessionalDischargeResponsibilityIndicatorEmergencyCare)
        {
            synchronized (monitor())
            {
                check_orphaned();
                org.apache.xmlbeans.SimpleValue target = null;
                target = (org.apache.xmlbeans.SimpleValue)get_store().find_element_user(CAREPROFESSIONALDISCHARGERESPONSIBILITYINDICATOREMERGENCYCARE$6, 0);
                if (target == null)
                {
                    target = (org.apache.xmlbeans.SimpleValue)get_store().add_element_user(CAREPROFESSIONALDISCHARGERESPONSIBILITYINDICATOREMERGENCYCARE$6);
                }
                target.setEnumValue(careProfessionalDischargeResponsibilityIndicatorEmergencyCare);
            }
        }
        
        /**
         * Sets (as xml) the "CareProfessionalDischargeResponsibilityIndicator_EmergencyCare" element
         */
        public void xsetCareProfessionalDischargeResponsibilityIndicatorEmergencyCare(uk.nhs.nhsia.datastandards.ecds.YesNoECType careProfessionalDischargeResponsibilityIndicatorEmergencyCare)
        {
            synchronized (monitor())
            {
                check_orphaned();
                uk.nhs.nhsia.datastandards.ecds.YesNoECType target = null;
                target = (uk.nhs.nhsia.datastandards.ecds.YesNoECType)get_store().find_element_user(CAREPROFESSIONALDISCHARGERESPONSIBILITYINDICATOREMERGENCYCARE$6, 0);
                if (target == null)
                {
                    target = (uk.nhs.nhsia.datastandards.ecds.YesNoECType)get_store().add_element_user(CAREPROFESSIONALDISCHARGERESPONSIBILITYINDICATOREMERGENCYCARE$6);
                }
                target.set(careProfessionalDischargeResponsibilityIndicatorEmergencyCare);
            }
        }
    }
    /**
     * An XML EmergencyCareDiagnoses_SnomedCt(@http://www.nhsia.nhs.uk/DataStandards/XMLschema/CDS/ns).
     *
     * This is a complex type.
     */
    public static class EmergencyCareDiagnosesSnomedCtImpl extends org.apache.xmlbeans.impl.values.XmlComplexContentImpl implements uk.nhs.nhsia.datastandards.ecds.AttendanceOccurrenceECStructure.EmergencyCareDiagnosesSnomedCt
    {
        private static final long serialVersionUID = 1L;
        
        public EmergencyCareDiagnosesSnomedCtImpl(org.apache.xmlbeans.SchemaType sType)
        {
            super(sType);
        }
        
        private static final javax.xml.namespace.QName EMERGENCYCAREDIAGNOSISSNOMEDCT$0 = 
            new javax.xml.namespace.QName("http://www.nhsia.nhs.uk/DataStandards/XMLschema/CDS/ns", "EmergencyCareDiagnosis_SnomedCt");
        private static final javax.xml.namespace.QName CODEDCLINICALENTRYSEQUENCENUMBER$2 = 
            new javax.xml.namespace.QName("http://www.nhsia.nhs.uk/DataStandards/XMLschema/CDS/ns", "CodedClinicalEntrySequenceNumber");
        private static final javax.xml.namespace.QName EMERGENCYCAREDIAGNOSISQUALIFIERSNOMEDCT$4 = 
            new javax.xml.namespace.QName("http://www.nhsia.nhs.uk/DataStandards/XMLschema/CDS/ns", "EmergencyCareDiagnosisQualifier_SnomedCt");
        
        
        /**
         * Gets the "EmergencyCareDiagnosis_SnomedCt" element
         */
        public java.lang.String getEmergencyCareDiagnosisSnomedCt()
        {
            synchronized (monitor())
            {
                check_orphaned();
                org.apache.xmlbeans.SimpleValue target = null;
                target = (org.apache.xmlbeans.SimpleValue)get_store().find_element_user(EMERGENCYCAREDIAGNOSISSNOMEDCT$0, 0);
                if (target == null)
                {
                    return null;
                }
                return target.getStringValue();
            }
        }
        
        /**
         * Gets (as xml) the "EmergencyCareDiagnosis_SnomedCt" element
         */
        public uk.nhs.nhsia.datastandards.ecds.N618ECType xgetEmergencyCareDiagnosisSnomedCt()
        {
            synchronized (monitor())
            {
                check_orphaned();
                uk.nhs.nhsia.datastandards.ecds.N618ECType target = null;
                target = (uk.nhs.nhsia.datastandards.ecds.N618ECType)get_store().find_element_user(EMERGENCYCAREDIAGNOSISSNOMEDCT$0, 0);
                return target;
            }
        }
        
        /**
         * Sets the "EmergencyCareDiagnosis_SnomedCt" element
         */
        public void setEmergencyCareDiagnosisSnomedCt(java.lang.String emergencyCareDiagnosisSnomedCt)
        {
            synchronized (monitor())
            {
                check_orphaned();
                org.apache.xmlbeans.SimpleValue target = null;
                target = (org.apache.xmlbeans.SimpleValue)get_store().find_element_user(EMERGENCYCAREDIAGNOSISSNOMEDCT$0, 0);
                if (target == null)
                {
                    target = (org.apache.xmlbeans.SimpleValue)get_store().add_element_user(EMERGENCYCAREDIAGNOSISSNOMEDCT$0);
                }
                target.setStringValue(emergencyCareDiagnosisSnomedCt);
            }
        }
        
        /**
         * Sets (as xml) the "EmergencyCareDiagnosis_SnomedCt" element
         */
        public void xsetEmergencyCareDiagnosisSnomedCt(uk.nhs.nhsia.datastandards.ecds.N618ECType emergencyCareDiagnosisSnomedCt)
        {
            synchronized (monitor())
            {
                check_orphaned();
                uk.nhs.nhsia.datastandards.ecds.N618ECType target = null;
                target = (uk.nhs.nhsia.datastandards.ecds.N618ECType)get_store().find_element_user(EMERGENCYCAREDIAGNOSISSNOMEDCT$0, 0);
                if (target == null)
                {
                    target = (uk.nhs.nhsia.datastandards.ecds.N618ECType)get_store().add_element_user(EMERGENCYCAREDIAGNOSISSNOMEDCT$0);
                }
                target.set(emergencyCareDiagnosisSnomedCt);
            }
        }
        
        /**
         * Gets the "CodedClinicalEntrySequenceNumber" element
         */
        public java.lang.String getCodedClinicalEntrySequenceNumber()
        {
            synchronized (monitor())
            {
                check_orphaned();
                org.apache.xmlbeans.SimpleValue target = null;
                target = (org.apache.xmlbeans.SimpleValue)get_store().find_element_user(CODEDCLINICALENTRYSEQUENCENUMBER$2, 0);
                if (target == null)
                {
                    return null;
                }
                return target.getStringValue();
            }
        }
        
        /**
         * Gets (as xml) the "CodedClinicalEntrySequenceNumber" element
         */
        public uk.nhs.nhsia.datastandards.ecds.N1N5ECType xgetCodedClinicalEntrySequenceNumber()
        {
            synchronized (monitor())
            {
                check_orphaned();
                uk.nhs.nhsia.datastandards.ecds.N1N5ECType target = null;
                target = (uk.nhs.nhsia.datastandards.ecds.N1N5ECType)get_store().find_element_user(CODEDCLINICALENTRYSEQUENCENUMBER$2, 0);
                return target;
            }
        }
        
        /**
         * Sets the "CodedClinicalEntrySequenceNumber" element
         */
        public void setCodedClinicalEntrySequenceNumber(java.lang.String codedClinicalEntrySequenceNumber)
        {
            synchronized (monitor())
            {
                check_orphaned();
                org.apache.xmlbeans.SimpleValue target = null;
                target = (org.apache.xmlbeans.SimpleValue)get_store().find_element_user(CODEDCLINICALENTRYSEQUENCENUMBER$2, 0);
                if (target == null)
                {
                    target = (org.apache.xmlbeans.SimpleValue)get_store().add_element_user(CODEDCLINICALENTRYSEQUENCENUMBER$2);
                }
                target.setStringValue(codedClinicalEntrySequenceNumber);
            }
        }
        
        /**
         * Sets (as xml) the "CodedClinicalEntrySequenceNumber" element
         */
        public void xsetCodedClinicalEntrySequenceNumber(uk.nhs.nhsia.datastandards.ecds.N1N5ECType codedClinicalEntrySequenceNumber)
        {
            synchronized (monitor())
            {
                check_orphaned();
                uk.nhs.nhsia.datastandards.ecds.N1N5ECType target = null;
                target = (uk.nhs.nhsia.datastandards.ecds.N1N5ECType)get_store().find_element_user(CODEDCLINICALENTRYSEQUENCENUMBER$2, 0);
                if (target == null)
                {
                    target = (uk.nhs.nhsia.datastandards.ecds.N1N5ECType)get_store().add_element_user(CODEDCLINICALENTRYSEQUENCENUMBER$2);
                }
                target.set(codedClinicalEntrySequenceNumber);
            }
        }
        
        /**
         * Gets the "EmergencyCareDiagnosisQualifier_SnomedCt" element
         */
        public java.lang.String getEmergencyCareDiagnosisQualifierSnomedCt()
        {
            synchronized (monitor())
            {
                check_orphaned();
                org.apache.xmlbeans.SimpleValue target = null;
                target = (org.apache.xmlbeans.SimpleValue)get_store().find_element_user(EMERGENCYCAREDIAGNOSISQUALIFIERSNOMEDCT$4, 0);
                if (target == null)
                {
                    return null;
                }
                return target.getStringValue();
            }
        }
        
        /**
         * Gets (as xml) the "EmergencyCareDiagnosisQualifier_SnomedCt" element
         */
        public uk.nhs.nhsia.datastandards.ecds.N618ECType xgetEmergencyCareDiagnosisQualifierSnomedCt()
        {
            synchronized (monitor())
            {
                check_orphaned();
                uk.nhs.nhsia.datastandards.ecds.N618ECType target = null;
                target = (uk.nhs.nhsia.datastandards.ecds.N618ECType)get_store().find_element_user(EMERGENCYCAREDIAGNOSISQUALIFIERSNOMEDCT$4, 0);
                return target;
            }
        }
        
        /**
         * Sets the "EmergencyCareDiagnosisQualifier_SnomedCt" element
         */
        public void setEmergencyCareDiagnosisQualifierSnomedCt(java.lang.String emergencyCareDiagnosisQualifierSnomedCt)
        {
            synchronized (monitor())
            {
                check_orphaned();
                org.apache.xmlbeans.SimpleValue target = null;
                target = (org.apache.xmlbeans.SimpleValue)get_store().find_element_user(EMERGENCYCAREDIAGNOSISQUALIFIERSNOMEDCT$4, 0);
                if (target == null)
                {
                    target = (org.apache.xmlbeans.SimpleValue)get_store().add_element_user(EMERGENCYCAREDIAGNOSISQUALIFIERSNOMEDCT$4);
                }
                target.setStringValue(emergencyCareDiagnosisQualifierSnomedCt);
            }
        }
        
        /**
         * Sets (as xml) the "EmergencyCareDiagnosisQualifier_SnomedCt" element
         */
        public void xsetEmergencyCareDiagnosisQualifierSnomedCt(uk.nhs.nhsia.datastandards.ecds.N618ECType emergencyCareDiagnosisQualifierSnomedCt)
        {
            synchronized (monitor())
            {
                check_orphaned();
                uk.nhs.nhsia.datastandards.ecds.N618ECType target = null;
                target = (uk.nhs.nhsia.datastandards.ecds.N618ECType)get_store().find_element_user(EMERGENCYCAREDIAGNOSISQUALIFIERSNOMEDCT$4, 0);
                if (target == null)
                {
                    target = (uk.nhs.nhsia.datastandards.ecds.N618ECType)get_store().add_element_user(EMERGENCYCAREDIAGNOSISQUALIFIERSNOMEDCT$4);
                }
                target.set(emergencyCareDiagnosisQualifierSnomedCt);
            }
        }
    }
    /**
     * An XML EmergencyCareInvestigations_SnomedCt(@http://www.nhsia.nhs.uk/DataStandards/XMLschema/CDS/ns).
     *
     * This is a complex type.
     */
    public static class EmergencyCareInvestigationsSnomedCtImpl extends org.apache.xmlbeans.impl.values.XmlComplexContentImpl implements uk.nhs.nhsia.datastandards.ecds.AttendanceOccurrenceECStructure.EmergencyCareInvestigationsSnomedCt
    {
        private static final long serialVersionUID = 1L;
        
        public EmergencyCareInvestigationsSnomedCtImpl(org.apache.xmlbeans.SchemaType sType)
        {
            super(sType);
        }
        
        private static final javax.xml.namespace.QName EMERGENCYCARECLINICALINVESTIGATIONSNOMEDCT$0 = 
            new javax.xml.namespace.QName("http://www.nhsia.nhs.uk/DataStandards/XMLschema/CDS/ns", "EmergencyCareClinicalInvestigation_SnomedCt");
        private static final javax.xml.namespace.QName PROCEDUREDATEEMERGENCYCARECLINICALINVESTIGATION$2 = 
            new javax.xml.namespace.QName("http://www.nhsia.nhs.uk/DataStandards/XMLschema/CDS/ns", "ProcedureDate_EmergencyCareClinicalInvestigation");
        private static final javax.xml.namespace.QName PROCEDURETIMEEMERGENCYCARECLINICALINVESTIGATION$4 = 
            new javax.xml.namespace.QName("http://www.nhsia.nhs.uk/DataStandards/XMLschema/CDS/ns", "ProcedureTime_EmergencyCareClinicalInvestigation");
        
        
        /**
         * Gets the "EmergencyCareClinicalInvestigation_SnomedCt" element
         */
        public java.lang.String getEmergencyCareClinicalInvestigationSnomedCt()
        {
            synchronized (monitor())
            {
                check_orphaned();
                org.apache.xmlbeans.SimpleValue target = null;
                target = (org.apache.xmlbeans.SimpleValue)get_store().find_element_user(EMERGENCYCARECLINICALINVESTIGATIONSNOMEDCT$0, 0);
                if (target == null)
                {
                    return null;
                }
                return target.getStringValue();
            }
        }
        
        /**
         * Gets (as xml) the "EmergencyCareClinicalInvestigation_SnomedCt" element
         */
        public uk.nhs.nhsia.datastandards.ecds.N618ECType xgetEmergencyCareClinicalInvestigationSnomedCt()
        {
            synchronized (monitor())
            {
                check_orphaned();
                uk.nhs.nhsia.datastandards.ecds.N618ECType target = null;
                target = (uk.nhs.nhsia.datastandards.ecds.N618ECType)get_store().find_element_user(EMERGENCYCARECLINICALINVESTIGATIONSNOMEDCT$0, 0);
                return target;
            }
        }
        
        /**
         * Sets the "EmergencyCareClinicalInvestigation_SnomedCt" element
         */
        public void setEmergencyCareClinicalInvestigationSnomedCt(java.lang.String emergencyCareClinicalInvestigationSnomedCt)
        {
            synchronized (monitor())
            {
                check_orphaned();
                org.apache.xmlbeans.SimpleValue target = null;
                target = (org.apache.xmlbeans.SimpleValue)get_store().find_element_user(EMERGENCYCARECLINICALINVESTIGATIONSNOMEDCT$0, 0);
                if (target == null)
                {
                    target = (org.apache.xmlbeans.SimpleValue)get_store().add_element_user(EMERGENCYCARECLINICALINVESTIGATIONSNOMEDCT$0);
                }
                target.setStringValue(emergencyCareClinicalInvestigationSnomedCt);
            }
        }
        
        /**
         * Sets (as xml) the "EmergencyCareClinicalInvestigation_SnomedCt" element
         */
        public void xsetEmergencyCareClinicalInvestigationSnomedCt(uk.nhs.nhsia.datastandards.ecds.N618ECType emergencyCareClinicalInvestigationSnomedCt)
        {
            synchronized (monitor())
            {
                check_orphaned();
                uk.nhs.nhsia.datastandards.ecds.N618ECType target = null;
                target = (uk.nhs.nhsia.datastandards.ecds.N618ECType)get_store().find_element_user(EMERGENCYCARECLINICALINVESTIGATIONSNOMEDCT$0, 0);
                if (target == null)
                {
                    target = (uk.nhs.nhsia.datastandards.ecds.N618ECType)get_store().add_element_user(EMERGENCYCARECLINICALINVESTIGATIONSNOMEDCT$0);
                }
                target.set(emergencyCareClinicalInvestigationSnomedCt);
            }
        }
        
        /**
         * Gets the "ProcedureDate_EmergencyCareClinicalInvestigation" element
         */
        public java.util.Calendar getProcedureDateEmergencyCareClinicalInvestigation()
        {
            synchronized (monitor())
            {
                check_orphaned();
                org.apache.xmlbeans.SimpleValue target = null;
                target = (org.apache.xmlbeans.SimpleValue)get_store().find_element_user(PROCEDUREDATEEMERGENCYCARECLINICALINVESTIGATION$2, 0);
                if (target == null)
                {
                    return null;
                }
                return target.getCalendarValue();
            }
        }
        
        /**
         * Gets (as xml) the "ProcedureDate_EmergencyCareClinicalInvestigation" element
         */
        public uk.nhs.nhsia.datastandards.ecds.DateType xgetProcedureDateEmergencyCareClinicalInvestigation()
        {
            synchronized (monitor())
            {
                check_orphaned();
                uk.nhs.nhsia.datastandards.ecds.DateType target = null;
                target = (uk.nhs.nhsia.datastandards.ecds.DateType)get_store().find_element_user(PROCEDUREDATEEMERGENCYCARECLINICALINVESTIGATION$2, 0);
                return target;
            }
        }
        
        /**
         * True if has "ProcedureDate_EmergencyCareClinicalInvestigation" element
         */
        public boolean isSetProcedureDateEmergencyCareClinicalInvestigation()
        {
            synchronized (monitor())
            {
                check_orphaned();
                return get_store().count_elements(PROCEDUREDATEEMERGENCYCARECLINICALINVESTIGATION$2) != 0;
            }
        }
        
        /**
         * Sets the "ProcedureDate_EmergencyCareClinicalInvestigation" element
         */
        public void setProcedureDateEmergencyCareClinicalInvestigation(java.util.Calendar procedureDateEmergencyCareClinicalInvestigation)
        {
            synchronized (monitor())
            {
                check_orphaned();
                org.apache.xmlbeans.SimpleValue target = null;
                target = (org.apache.xmlbeans.SimpleValue)get_store().find_element_user(PROCEDUREDATEEMERGENCYCARECLINICALINVESTIGATION$2, 0);
                if (target == null)
                {
                    target = (org.apache.xmlbeans.SimpleValue)get_store().add_element_user(PROCEDUREDATEEMERGENCYCARECLINICALINVESTIGATION$2);
                }
                target.setCalendarValue(procedureDateEmergencyCareClinicalInvestigation);
            }
        }
        
        /**
         * Sets (as xml) the "ProcedureDate_EmergencyCareClinicalInvestigation" element
         */
        public void xsetProcedureDateEmergencyCareClinicalInvestigation(uk.nhs.nhsia.datastandards.ecds.DateType procedureDateEmergencyCareClinicalInvestigation)
        {
            synchronized (monitor())
            {
                check_orphaned();
                uk.nhs.nhsia.datastandards.ecds.DateType target = null;
                target = (uk.nhs.nhsia.datastandards.ecds.DateType)get_store().find_element_user(PROCEDUREDATEEMERGENCYCARECLINICALINVESTIGATION$2, 0);
                if (target == null)
                {
                    target = (uk.nhs.nhsia.datastandards.ecds.DateType)get_store().add_element_user(PROCEDUREDATEEMERGENCYCARECLINICALINVESTIGATION$2);
                }
                target.set(procedureDateEmergencyCareClinicalInvestigation);
            }
        }
        
        /**
         * Unsets the "ProcedureDate_EmergencyCareClinicalInvestigation" element
         */
        public void unsetProcedureDateEmergencyCareClinicalInvestigation()
        {
            synchronized (monitor())
            {
                check_orphaned();
                get_store().remove_element(PROCEDUREDATEEMERGENCYCARECLINICALINVESTIGATION$2, 0);
            }
        }
        
        /**
         * Gets the "ProcedureTime_EmergencyCareClinicalInvestigation" element
         */
        public java.util.Calendar getProcedureTimeEmergencyCareClinicalInvestigation()
        {
            synchronized (monitor())
            {
                check_orphaned();
                org.apache.xmlbeans.SimpleValue target = null;
                target = (org.apache.xmlbeans.SimpleValue)get_store().find_element_user(PROCEDURETIMEEMERGENCYCARECLINICALINVESTIGATION$4, 0);
                if (target == null)
                {
                    return null;
                }
                return target.getCalendarValue();
            }
        }
        
        /**
         * Gets (as xml) the "ProcedureTime_EmergencyCareClinicalInvestigation" element
         */
        public uk.nhs.nhsia.datastandards.ecds.TimeType xgetProcedureTimeEmergencyCareClinicalInvestigation()
        {
            synchronized (monitor())
            {
                check_orphaned();
                uk.nhs.nhsia.datastandards.ecds.TimeType target = null;
                target = (uk.nhs.nhsia.datastandards.ecds.TimeType)get_store().find_element_user(PROCEDURETIMEEMERGENCYCARECLINICALINVESTIGATION$4, 0);
                return target;
            }
        }
        
        /**
         * True if has "ProcedureTime_EmergencyCareClinicalInvestigation" element
         */
        public boolean isSetProcedureTimeEmergencyCareClinicalInvestigation()
        {
            synchronized (monitor())
            {
                check_orphaned();
                return get_store().count_elements(PROCEDURETIMEEMERGENCYCARECLINICALINVESTIGATION$4) != 0;
            }
        }
        
        /**
         * Sets the "ProcedureTime_EmergencyCareClinicalInvestigation" element
         */
        public void setProcedureTimeEmergencyCareClinicalInvestigation(java.util.Calendar procedureTimeEmergencyCareClinicalInvestigation)
        {
            synchronized (monitor())
            {
                check_orphaned();
                org.apache.xmlbeans.SimpleValue target = null;
                target = (org.apache.xmlbeans.SimpleValue)get_store().find_element_user(PROCEDURETIMEEMERGENCYCARECLINICALINVESTIGATION$4, 0);
                if (target == null)
                {
                    target = (org.apache.xmlbeans.SimpleValue)get_store().add_element_user(PROCEDURETIMEEMERGENCYCARECLINICALINVESTIGATION$4);
                }
                target.setCalendarValue(procedureTimeEmergencyCareClinicalInvestigation);
            }
        }
        
        /**
         * Sets (as xml) the "ProcedureTime_EmergencyCareClinicalInvestigation" element
         */
        public void xsetProcedureTimeEmergencyCareClinicalInvestigation(uk.nhs.nhsia.datastandards.ecds.TimeType procedureTimeEmergencyCareClinicalInvestigation)
        {
            synchronized (monitor())
            {
                check_orphaned();
                uk.nhs.nhsia.datastandards.ecds.TimeType target = null;
                target = (uk.nhs.nhsia.datastandards.ecds.TimeType)get_store().find_element_user(PROCEDURETIMEEMERGENCYCARECLINICALINVESTIGATION$4, 0);
                if (target == null)
                {
                    target = (uk.nhs.nhsia.datastandards.ecds.TimeType)get_store().add_element_user(PROCEDURETIMEEMERGENCYCARECLINICALINVESTIGATION$4);
                }
                target.set(procedureTimeEmergencyCareClinicalInvestigation);
            }
        }
        
        /**
         * Unsets the "ProcedureTime_EmergencyCareClinicalInvestigation" element
         */
        public void unsetProcedureTimeEmergencyCareClinicalInvestigation()
        {
            synchronized (monitor())
            {
                check_orphaned();
                get_store().remove_element(PROCEDURETIMEEMERGENCYCARECLINICALINVESTIGATION$4, 0);
            }
        }
    }
    /**
     * An XML EmergencyCareTreatments_SnomedCt(@http://www.nhsia.nhs.uk/DataStandards/XMLschema/CDS/ns).
     *
     * This is a complex type.
     */
    public static class EmergencyCareTreatmentsSnomedCtImpl extends org.apache.xmlbeans.impl.values.XmlComplexContentImpl implements uk.nhs.nhsia.datastandards.ecds.AttendanceOccurrenceECStructure.EmergencyCareTreatmentsSnomedCt
    {
        private static final long serialVersionUID = 1L;
        
        public EmergencyCareTreatmentsSnomedCtImpl(org.apache.xmlbeans.SchemaType sType)
        {
            super(sType);
        }
        
        private static final javax.xml.namespace.QName EMERGENCYCAREPROCEDURESNOMEDCT$0 = 
            new javax.xml.namespace.QName("http://www.nhsia.nhs.uk/DataStandards/XMLschema/CDS/ns", "EmergencyCareProcedure_SnomedCt");
        private static final javax.xml.namespace.QName PROCEDUREDATEEMERGENCYCAREPROCEDURE$2 = 
            new javax.xml.namespace.QName("http://www.nhsia.nhs.uk/DataStandards/XMLschema/CDS/ns", "ProcedureDate_EmergencyCareProcedure");
        private static final javax.xml.namespace.QName PROCEDURETIMEEMERGENCYCAREPROCEDURE$4 = 
            new javax.xml.namespace.QName("http://www.nhsia.nhs.uk/DataStandards/XMLschema/CDS/ns", "ProcedureTime_EmergencyCareProcedure");
        
        
        /**
         * Gets the "EmergencyCareProcedure_SnomedCt" element
         */
        public java.lang.String getEmergencyCareProcedureSnomedCt()
        {
            synchronized (monitor())
            {
                check_orphaned();
                org.apache.xmlbeans.SimpleValue target = null;
                target = (org.apache.xmlbeans.SimpleValue)get_store().find_element_user(EMERGENCYCAREPROCEDURESNOMEDCT$0, 0);
                if (target == null)
                {
                    return null;
                }
                return target.getStringValue();
            }
        }
        
        /**
         * Gets (as xml) the "EmergencyCareProcedure_SnomedCt" element
         */
        public uk.nhs.nhsia.datastandards.ecds.N618ECType xgetEmergencyCareProcedureSnomedCt()
        {
            synchronized (monitor())
            {
                check_orphaned();
                uk.nhs.nhsia.datastandards.ecds.N618ECType target = null;
                target = (uk.nhs.nhsia.datastandards.ecds.N618ECType)get_store().find_element_user(EMERGENCYCAREPROCEDURESNOMEDCT$0, 0);
                return target;
            }
        }
        
        /**
         * Sets the "EmergencyCareProcedure_SnomedCt" element
         */
        public void setEmergencyCareProcedureSnomedCt(java.lang.String emergencyCareProcedureSnomedCt)
        {
            synchronized (monitor())
            {
                check_orphaned();
                org.apache.xmlbeans.SimpleValue target = null;
                target = (org.apache.xmlbeans.SimpleValue)get_store().find_element_user(EMERGENCYCAREPROCEDURESNOMEDCT$0, 0);
                if (target == null)
                {
                    target = (org.apache.xmlbeans.SimpleValue)get_store().add_element_user(EMERGENCYCAREPROCEDURESNOMEDCT$0);
                }
                target.setStringValue(emergencyCareProcedureSnomedCt);
            }
        }
        
        /**
         * Sets (as xml) the "EmergencyCareProcedure_SnomedCt" element
         */
        public void xsetEmergencyCareProcedureSnomedCt(uk.nhs.nhsia.datastandards.ecds.N618ECType emergencyCareProcedureSnomedCt)
        {
            synchronized (monitor())
            {
                check_orphaned();
                uk.nhs.nhsia.datastandards.ecds.N618ECType target = null;
                target = (uk.nhs.nhsia.datastandards.ecds.N618ECType)get_store().find_element_user(EMERGENCYCAREPROCEDURESNOMEDCT$0, 0);
                if (target == null)
                {
                    target = (uk.nhs.nhsia.datastandards.ecds.N618ECType)get_store().add_element_user(EMERGENCYCAREPROCEDURESNOMEDCT$0);
                }
                target.set(emergencyCareProcedureSnomedCt);
            }
        }
        
        /**
         * Gets the "ProcedureDate_EmergencyCareProcedure" element
         */
        public java.util.Calendar getProcedureDateEmergencyCareProcedure()
        {
            synchronized (monitor())
            {
                check_orphaned();
                org.apache.xmlbeans.SimpleValue target = null;
                target = (org.apache.xmlbeans.SimpleValue)get_store().find_element_user(PROCEDUREDATEEMERGENCYCAREPROCEDURE$2, 0);
                if (target == null)
                {
                    return null;
                }
                return target.getCalendarValue();
            }
        }
        
        /**
         * Gets (as xml) the "ProcedureDate_EmergencyCareProcedure" element
         */
        public uk.nhs.nhsia.datastandards.ecds.DateType xgetProcedureDateEmergencyCareProcedure()
        {
            synchronized (monitor())
            {
                check_orphaned();
                uk.nhs.nhsia.datastandards.ecds.DateType target = null;
                target = (uk.nhs.nhsia.datastandards.ecds.DateType)get_store().find_element_user(PROCEDUREDATEEMERGENCYCAREPROCEDURE$2, 0);
                return target;
            }
        }
        
        /**
         * True if has "ProcedureDate_EmergencyCareProcedure" element
         */
        public boolean isSetProcedureDateEmergencyCareProcedure()
        {
            synchronized (monitor())
            {
                check_orphaned();
                return get_store().count_elements(PROCEDUREDATEEMERGENCYCAREPROCEDURE$2) != 0;
            }
        }
        
        /**
         * Sets the "ProcedureDate_EmergencyCareProcedure" element
         */
        public void setProcedureDateEmergencyCareProcedure(java.util.Calendar procedureDateEmergencyCareProcedure)
        {
            synchronized (monitor())
            {
                check_orphaned();
                org.apache.xmlbeans.SimpleValue target = null;
                target = (org.apache.xmlbeans.SimpleValue)get_store().find_element_user(PROCEDUREDATEEMERGENCYCAREPROCEDURE$2, 0);
                if (target == null)
                {
                    target = (org.apache.xmlbeans.SimpleValue)get_store().add_element_user(PROCEDUREDATEEMERGENCYCAREPROCEDURE$2);
                }
                target.setCalendarValue(procedureDateEmergencyCareProcedure);
            }
        }
        
        /**
         * Sets (as xml) the "ProcedureDate_EmergencyCareProcedure" element
         */
        public void xsetProcedureDateEmergencyCareProcedure(uk.nhs.nhsia.datastandards.ecds.DateType procedureDateEmergencyCareProcedure)
        {
            synchronized (monitor())
            {
                check_orphaned();
                uk.nhs.nhsia.datastandards.ecds.DateType target = null;
                target = (uk.nhs.nhsia.datastandards.ecds.DateType)get_store().find_element_user(PROCEDUREDATEEMERGENCYCAREPROCEDURE$2, 0);
                if (target == null)
                {
                    target = (uk.nhs.nhsia.datastandards.ecds.DateType)get_store().add_element_user(PROCEDUREDATEEMERGENCYCAREPROCEDURE$2);
                }
                target.set(procedureDateEmergencyCareProcedure);
            }
        }
        
        /**
         * Unsets the "ProcedureDate_EmergencyCareProcedure" element
         */
        public void unsetProcedureDateEmergencyCareProcedure()
        {
            synchronized (monitor())
            {
                check_orphaned();
                get_store().remove_element(PROCEDUREDATEEMERGENCYCAREPROCEDURE$2, 0);
            }
        }
        
        /**
         * Gets the "ProcedureTime_EmergencyCareProcedure" element
         */
        public java.util.Calendar getProcedureTimeEmergencyCareProcedure()
        {
            synchronized (monitor())
            {
                check_orphaned();
                org.apache.xmlbeans.SimpleValue target = null;
                target = (org.apache.xmlbeans.SimpleValue)get_store().find_element_user(PROCEDURETIMEEMERGENCYCAREPROCEDURE$4, 0);
                if (target == null)
                {
                    return null;
                }
                return target.getCalendarValue();
            }
        }
        
        /**
         * Gets (as xml) the "ProcedureTime_EmergencyCareProcedure" element
         */
        public uk.nhs.nhsia.datastandards.ecds.TimeType xgetProcedureTimeEmergencyCareProcedure()
        {
            synchronized (monitor())
            {
                check_orphaned();
                uk.nhs.nhsia.datastandards.ecds.TimeType target = null;
                target = (uk.nhs.nhsia.datastandards.ecds.TimeType)get_store().find_element_user(PROCEDURETIMEEMERGENCYCAREPROCEDURE$4, 0);
                return target;
            }
        }
        
        /**
         * True if has "ProcedureTime_EmergencyCareProcedure" element
         */
        public boolean isSetProcedureTimeEmergencyCareProcedure()
        {
            synchronized (monitor())
            {
                check_orphaned();
                return get_store().count_elements(PROCEDURETIMEEMERGENCYCAREPROCEDURE$4) != 0;
            }
        }
        
        /**
         * Sets the "ProcedureTime_EmergencyCareProcedure" element
         */
        public void setProcedureTimeEmergencyCareProcedure(java.util.Calendar procedureTimeEmergencyCareProcedure)
        {
            synchronized (monitor())
            {
                check_orphaned();
                org.apache.xmlbeans.SimpleValue target = null;
                target = (org.apache.xmlbeans.SimpleValue)get_store().find_element_user(PROCEDURETIMEEMERGENCYCAREPROCEDURE$4, 0);
                if (target == null)
                {
                    target = (org.apache.xmlbeans.SimpleValue)get_store().add_element_user(PROCEDURETIMEEMERGENCYCAREPROCEDURE$4);
                }
                target.setCalendarValue(procedureTimeEmergencyCareProcedure);
            }
        }
        
        /**
         * Sets (as xml) the "ProcedureTime_EmergencyCareProcedure" element
         */
        public void xsetProcedureTimeEmergencyCareProcedure(uk.nhs.nhsia.datastandards.ecds.TimeType procedureTimeEmergencyCareProcedure)
        {
            synchronized (monitor())
            {
                check_orphaned();
                uk.nhs.nhsia.datastandards.ecds.TimeType target = null;
                target = (uk.nhs.nhsia.datastandards.ecds.TimeType)get_store().find_element_user(PROCEDURETIMEEMERGENCYCAREPROCEDURE$4, 0);
                if (target == null)
                {
                    target = (uk.nhs.nhsia.datastandards.ecds.TimeType)get_store().add_element_user(PROCEDURETIMEEMERGENCYCAREPROCEDURE$4);
                }
                target.set(procedureTimeEmergencyCareProcedure);
            }
        }
        
        /**
         * Unsets the "ProcedureTime_EmergencyCareProcedure" element
         */
        public void unsetProcedureTimeEmergencyCareProcedure()
        {
            synchronized (monitor())
            {
                check_orphaned();
                get_store().remove_element(PROCEDURETIMEEMERGENCYCAREPROCEDURE$4, 0);
            }
        }
    }
    /**
     * An XML ReferralsToOtherServices(@http://www.nhsia.nhs.uk/DataStandards/XMLschema/CDS/ns).
     *
     * This is a complex type.
     */
    public static class ReferralsToOtherServicesImpl extends org.apache.xmlbeans.impl.values.XmlComplexContentImpl implements uk.nhs.nhsia.datastandards.ecds.AttendanceOccurrenceECStructure.ReferralsToOtherServices
    {
        private static final long serialVersionUID = 1L;
        
        public ReferralsToOtherServicesImpl(org.apache.xmlbeans.SchemaType sType)
        {
            super(sType);
        }
        
        private static final javax.xml.namespace.QName REFERREDTOSERVICESNOMEDCT$0 = 
            new javax.xml.namespace.QName("http://www.nhsia.nhs.uk/DataStandards/XMLschema/CDS/ns", "ReferredToService_SnomedCt");
        private static final javax.xml.namespace.QName ACTIVITYSERVICEREQUESTDATEEMERGENCYCARE$2 = 
            new javax.xml.namespace.QName("http://www.nhsia.nhs.uk/DataStandards/XMLschema/CDS/ns", "ActivityServiceRequestDate_EmergencyCare");
        private static final javax.xml.namespace.QName ACTIVITYSERVICEREQUESTTIMEEMERGENCYCARE$4 = 
            new javax.xml.namespace.QName("http://www.nhsia.nhs.uk/DataStandards/XMLschema/CDS/ns", "ActivityServiceRequestTime_EmergencyCare");
        private static final javax.xml.namespace.QName REFERREDTOSERVICEASSESSMENTDATE$6 = 
            new javax.xml.namespace.QName("http://www.nhsia.nhs.uk/DataStandards/XMLschema/CDS/ns", "ReferredToServiceAssessmentDate");
        private static final javax.xml.namespace.QName REFERREDTOSERVICEASSESSMENTTIME$8 = 
            new javax.xml.namespace.QName("http://www.nhsia.nhs.uk/DataStandards/XMLschema/CDS/ns", "ReferredToServiceAssessmentTime");
        
        
        /**
         * Gets the "ReferredToService_SnomedCt" element
         */
        public java.lang.String getReferredToServiceSnomedCt()
        {
            synchronized (monitor())
            {
                check_orphaned();
                org.apache.xmlbeans.SimpleValue target = null;
                target = (org.apache.xmlbeans.SimpleValue)get_store().find_element_user(REFERREDTOSERVICESNOMEDCT$0, 0);
                if (target == null)
                {
                    return null;
                }
                return target.getStringValue();
            }
        }
        
        /**
         * Gets (as xml) the "ReferredToService_SnomedCt" element
         */
        public uk.nhs.nhsia.datastandards.ecds.N618ECType xgetReferredToServiceSnomedCt()
        {
            synchronized (monitor())
            {
                check_orphaned();
                uk.nhs.nhsia.datastandards.ecds.N618ECType target = null;
                target = (uk.nhs.nhsia.datastandards.ecds.N618ECType)get_store().find_element_user(REFERREDTOSERVICESNOMEDCT$0, 0);
                return target;
            }
        }
        
        /**
         * True if has "ReferredToService_SnomedCt" element
         */
        public boolean isSetReferredToServiceSnomedCt()
        {
            synchronized (monitor())
            {
                check_orphaned();
                return get_store().count_elements(REFERREDTOSERVICESNOMEDCT$0) != 0;
            }
        }
        
        /**
         * Sets the "ReferredToService_SnomedCt" element
         */
        public void setReferredToServiceSnomedCt(java.lang.String referredToServiceSnomedCt)
        {
            synchronized (monitor())
            {
                check_orphaned();
                org.apache.xmlbeans.SimpleValue target = null;
                target = (org.apache.xmlbeans.SimpleValue)get_store().find_element_user(REFERREDTOSERVICESNOMEDCT$0, 0);
                if (target == null)
                {
                    target = (org.apache.xmlbeans.SimpleValue)get_store().add_element_user(REFERREDTOSERVICESNOMEDCT$0);
                }
                target.setStringValue(referredToServiceSnomedCt);
            }
        }
        
        /**
         * Sets (as xml) the "ReferredToService_SnomedCt" element
         */
        public void xsetReferredToServiceSnomedCt(uk.nhs.nhsia.datastandards.ecds.N618ECType referredToServiceSnomedCt)
        {
            synchronized (monitor())
            {
                check_orphaned();
                uk.nhs.nhsia.datastandards.ecds.N618ECType target = null;
                target = (uk.nhs.nhsia.datastandards.ecds.N618ECType)get_store().find_element_user(REFERREDTOSERVICESNOMEDCT$0, 0);
                if (target == null)
                {
                    target = (uk.nhs.nhsia.datastandards.ecds.N618ECType)get_store().add_element_user(REFERREDTOSERVICESNOMEDCT$0);
                }
                target.set(referredToServiceSnomedCt);
            }
        }
        
        /**
         * Unsets the "ReferredToService_SnomedCt" element
         */
        public void unsetReferredToServiceSnomedCt()
        {
            synchronized (monitor())
            {
                check_orphaned();
                get_store().remove_element(REFERREDTOSERVICESNOMEDCT$0, 0);
            }
        }
        
        /**
         * Gets the "ActivityServiceRequestDate_EmergencyCare" element
         */
        public java.util.Calendar getActivityServiceRequestDateEmergencyCare()
        {
            synchronized (monitor())
            {
                check_orphaned();
                org.apache.xmlbeans.SimpleValue target = null;
                target = (org.apache.xmlbeans.SimpleValue)get_store().find_element_user(ACTIVITYSERVICEREQUESTDATEEMERGENCYCARE$2, 0);
                if (target == null)
                {
                    return null;
                }
                return target.getCalendarValue();
            }
        }
        
        /**
         * Gets (as xml) the "ActivityServiceRequestDate_EmergencyCare" element
         */
        public uk.nhs.nhsia.datastandards.ecds.DateType xgetActivityServiceRequestDateEmergencyCare()
        {
            synchronized (monitor())
            {
                check_orphaned();
                uk.nhs.nhsia.datastandards.ecds.DateType target = null;
                target = (uk.nhs.nhsia.datastandards.ecds.DateType)get_store().find_element_user(ACTIVITYSERVICEREQUESTDATEEMERGENCYCARE$2, 0);
                return target;
            }
        }
        
        /**
         * Sets the "ActivityServiceRequestDate_EmergencyCare" element
         */
        public void setActivityServiceRequestDateEmergencyCare(java.util.Calendar activityServiceRequestDateEmergencyCare)
        {
            synchronized (monitor())
            {
                check_orphaned();
                org.apache.xmlbeans.SimpleValue target = null;
                target = (org.apache.xmlbeans.SimpleValue)get_store().find_element_user(ACTIVITYSERVICEREQUESTDATEEMERGENCYCARE$2, 0);
                if (target == null)
                {
                    target = (org.apache.xmlbeans.SimpleValue)get_store().add_element_user(ACTIVITYSERVICEREQUESTDATEEMERGENCYCARE$2);
                }
                target.setCalendarValue(activityServiceRequestDateEmergencyCare);
            }
        }
        
        /**
         * Sets (as xml) the "ActivityServiceRequestDate_EmergencyCare" element
         */
        public void xsetActivityServiceRequestDateEmergencyCare(uk.nhs.nhsia.datastandards.ecds.DateType activityServiceRequestDateEmergencyCare)
        {
            synchronized (monitor())
            {
                check_orphaned();
                uk.nhs.nhsia.datastandards.ecds.DateType target = null;
                target = (uk.nhs.nhsia.datastandards.ecds.DateType)get_store().find_element_user(ACTIVITYSERVICEREQUESTDATEEMERGENCYCARE$2, 0);
                if (target == null)
                {
                    target = (uk.nhs.nhsia.datastandards.ecds.DateType)get_store().add_element_user(ACTIVITYSERVICEREQUESTDATEEMERGENCYCARE$2);
                }
                target.set(activityServiceRequestDateEmergencyCare);
            }
        }
        
        /**
         * Gets the "ActivityServiceRequestTime_EmergencyCare" element
         */
        public java.util.Calendar getActivityServiceRequestTimeEmergencyCare()
        {
            synchronized (monitor())
            {
                check_orphaned();
                org.apache.xmlbeans.SimpleValue target = null;
                target = (org.apache.xmlbeans.SimpleValue)get_store().find_element_user(ACTIVITYSERVICEREQUESTTIMEEMERGENCYCARE$4, 0);
                if (target == null)
                {
                    return null;
                }
                return target.getCalendarValue();
            }
        }
        
        /**
         * Gets (as xml) the "ActivityServiceRequestTime_EmergencyCare" element
         */
        public uk.nhs.nhsia.datastandards.ecds.TimeType xgetActivityServiceRequestTimeEmergencyCare()
        {
            synchronized (monitor())
            {
                check_orphaned();
                uk.nhs.nhsia.datastandards.ecds.TimeType target = null;
                target = (uk.nhs.nhsia.datastandards.ecds.TimeType)get_store().find_element_user(ACTIVITYSERVICEREQUESTTIMEEMERGENCYCARE$4, 0);
                return target;
            }
        }
        
        /**
         * Sets the "ActivityServiceRequestTime_EmergencyCare" element
         */
        public void setActivityServiceRequestTimeEmergencyCare(java.util.Calendar activityServiceRequestTimeEmergencyCare)
        {
            synchronized (monitor())
            {
                check_orphaned();
                org.apache.xmlbeans.SimpleValue target = null;
                target = (org.apache.xmlbeans.SimpleValue)get_store().find_element_user(ACTIVITYSERVICEREQUESTTIMEEMERGENCYCARE$4, 0);
                if (target == null)
                {
                    target = (org.apache.xmlbeans.SimpleValue)get_store().add_element_user(ACTIVITYSERVICEREQUESTTIMEEMERGENCYCARE$4);
                }
                target.setCalendarValue(activityServiceRequestTimeEmergencyCare);
            }
        }
        
        /**
         * Sets (as xml) the "ActivityServiceRequestTime_EmergencyCare" element
         */
        public void xsetActivityServiceRequestTimeEmergencyCare(uk.nhs.nhsia.datastandards.ecds.TimeType activityServiceRequestTimeEmergencyCare)
        {
            synchronized (monitor())
            {
                check_orphaned();
                uk.nhs.nhsia.datastandards.ecds.TimeType target = null;
                target = (uk.nhs.nhsia.datastandards.ecds.TimeType)get_store().find_element_user(ACTIVITYSERVICEREQUESTTIMEEMERGENCYCARE$4, 0);
                if (target == null)
                {
                    target = (uk.nhs.nhsia.datastandards.ecds.TimeType)get_store().add_element_user(ACTIVITYSERVICEREQUESTTIMEEMERGENCYCARE$4);
                }
                target.set(activityServiceRequestTimeEmergencyCare);
            }
        }
        
        /**
         * Gets the "ReferredToServiceAssessmentDate" element
         */
        public java.util.Calendar getReferredToServiceAssessmentDate()
        {
            synchronized (monitor())
            {
                check_orphaned();
                org.apache.xmlbeans.SimpleValue target = null;
                target = (org.apache.xmlbeans.SimpleValue)get_store().find_element_user(REFERREDTOSERVICEASSESSMENTDATE$6, 0);
                if (target == null)
                {
                    return null;
                }
                return target.getCalendarValue();
            }
        }
        
        /**
         * Gets (as xml) the "ReferredToServiceAssessmentDate" element
         */
        public uk.nhs.nhsia.datastandards.ecds.DateType xgetReferredToServiceAssessmentDate()
        {
            synchronized (monitor())
            {
                check_orphaned();
                uk.nhs.nhsia.datastandards.ecds.DateType target = null;
                target = (uk.nhs.nhsia.datastandards.ecds.DateType)get_store().find_element_user(REFERREDTOSERVICEASSESSMENTDATE$6, 0);
                return target;
            }
        }
        
        /**
         * True if has "ReferredToServiceAssessmentDate" element
         */
        public boolean isSetReferredToServiceAssessmentDate()
        {
            synchronized (monitor())
            {
                check_orphaned();
                return get_store().count_elements(REFERREDTOSERVICEASSESSMENTDATE$6) != 0;
            }
        }
        
        /**
         * Sets the "ReferredToServiceAssessmentDate" element
         */
        public void setReferredToServiceAssessmentDate(java.util.Calendar referredToServiceAssessmentDate)
        {
            synchronized (monitor())
            {
                check_orphaned();
                org.apache.xmlbeans.SimpleValue target = null;
                target = (org.apache.xmlbeans.SimpleValue)get_store().find_element_user(REFERREDTOSERVICEASSESSMENTDATE$6, 0);
                if (target == null)
                {
                    target = (org.apache.xmlbeans.SimpleValue)get_store().add_element_user(REFERREDTOSERVICEASSESSMENTDATE$6);
                }
                target.setCalendarValue(referredToServiceAssessmentDate);
            }
        }
        
        /**
         * Sets (as xml) the "ReferredToServiceAssessmentDate" element
         */
        public void xsetReferredToServiceAssessmentDate(uk.nhs.nhsia.datastandards.ecds.DateType referredToServiceAssessmentDate)
        {
            synchronized (monitor())
            {
                check_orphaned();
                uk.nhs.nhsia.datastandards.ecds.DateType target = null;
                target = (uk.nhs.nhsia.datastandards.ecds.DateType)get_store().find_element_user(REFERREDTOSERVICEASSESSMENTDATE$6, 0);
                if (target == null)
                {
                    target = (uk.nhs.nhsia.datastandards.ecds.DateType)get_store().add_element_user(REFERREDTOSERVICEASSESSMENTDATE$6);
                }
                target.set(referredToServiceAssessmentDate);
            }
        }
        
        /**
         * Unsets the "ReferredToServiceAssessmentDate" element
         */
        public void unsetReferredToServiceAssessmentDate()
        {
            synchronized (monitor())
            {
                check_orphaned();
                get_store().remove_element(REFERREDTOSERVICEASSESSMENTDATE$6, 0);
            }
        }
        
        /**
         * Gets the "ReferredToServiceAssessmentTime" element
         */
        public java.util.Calendar getReferredToServiceAssessmentTime()
        {
            synchronized (monitor())
            {
                check_orphaned();
                org.apache.xmlbeans.SimpleValue target = null;
                target = (org.apache.xmlbeans.SimpleValue)get_store().find_element_user(REFERREDTOSERVICEASSESSMENTTIME$8, 0);
                if (target == null)
                {
                    return null;
                }
                return target.getCalendarValue();
            }
        }
        
        /**
         * Gets (as xml) the "ReferredToServiceAssessmentTime" element
         */
        public uk.nhs.nhsia.datastandards.ecds.TimeType xgetReferredToServiceAssessmentTime()
        {
            synchronized (monitor())
            {
                check_orphaned();
                uk.nhs.nhsia.datastandards.ecds.TimeType target = null;
                target = (uk.nhs.nhsia.datastandards.ecds.TimeType)get_store().find_element_user(REFERREDTOSERVICEASSESSMENTTIME$8, 0);
                return target;
            }
        }
        
        /**
         * True if has "ReferredToServiceAssessmentTime" element
         */
        public boolean isSetReferredToServiceAssessmentTime()
        {
            synchronized (monitor())
            {
                check_orphaned();
                return get_store().count_elements(REFERREDTOSERVICEASSESSMENTTIME$8) != 0;
            }
        }
        
        /**
         * Sets the "ReferredToServiceAssessmentTime" element
         */
        public void setReferredToServiceAssessmentTime(java.util.Calendar referredToServiceAssessmentTime)
        {
            synchronized (monitor())
            {
                check_orphaned();
                org.apache.xmlbeans.SimpleValue target = null;
                target = (org.apache.xmlbeans.SimpleValue)get_store().find_element_user(REFERREDTOSERVICEASSESSMENTTIME$8, 0);
                if (target == null)
                {
                    target = (org.apache.xmlbeans.SimpleValue)get_store().add_element_user(REFERREDTOSERVICEASSESSMENTTIME$8);
                }
                target.setCalendarValue(referredToServiceAssessmentTime);
            }
        }
        
        /**
         * Sets (as xml) the "ReferredToServiceAssessmentTime" element
         */
        public void xsetReferredToServiceAssessmentTime(uk.nhs.nhsia.datastandards.ecds.TimeType referredToServiceAssessmentTime)
        {
            synchronized (monitor())
            {
                check_orphaned();
                uk.nhs.nhsia.datastandards.ecds.TimeType target = null;
                target = (uk.nhs.nhsia.datastandards.ecds.TimeType)get_store().find_element_user(REFERREDTOSERVICEASSESSMENTTIME$8, 0);
                if (target == null)
                {
                    target = (uk.nhs.nhsia.datastandards.ecds.TimeType)get_store().add_element_user(REFERREDTOSERVICEASSESSMENTTIME$8);
                }
                target.set(referredToServiceAssessmentTime);
            }
        }
        
        /**
         * Unsets the "ReferredToServiceAssessmentTime" element
         */
        public void unsetReferredToServiceAssessmentTime()
        {
            synchronized (monitor())
            {
                check_orphaned();
                get_store().remove_element(REFERREDTOSERVICEASSESSMENTTIME$8, 0);
            }
        }
    }
    /**
     * An XML DischargeFromEmergencyCare(@http://www.nhsia.nhs.uk/DataStandards/XMLschema/CDS/ns).
     *
     * This is a complex type.
     */
    public static class DischargeFromEmergencyCareImpl extends org.apache.xmlbeans.impl.values.XmlComplexContentImpl implements uk.nhs.nhsia.datastandards.ecds.AttendanceOccurrenceECStructure.DischargeFromEmergencyCare
    {
        private static final long serialVersionUID = 1L;
        
        public DischargeFromEmergencyCareImpl(org.apache.xmlbeans.SchemaType sType)
        {
            super(sType);
        }
        
        private static final javax.xml.namespace.QName DECIDEDTOADMITDATE$0 = 
            new javax.xml.namespace.QName("http://www.nhsia.nhs.uk/DataStandards/XMLschema/CDS/ns", "DecidedToAdmitDate");
        private static final javax.xml.namespace.QName DECIDEDTOADMITTIME$2 = 
            new javax.xml.namespace.QName("http://www.nhsia.nhs.uk/DataStandards/XMLschema/CDS/ns", "DecidedToAdmitTime");
        private static final javax.xml.namespace.QName ACTIVITYTREATMENTFUNCTIONCODEDECISIONTOADMIT$4 = 
            new javax.xml.namespace.QName("http://www.nhsia.nhs.uk/DataStandards/XMLschema/CDS/ns", "ActivityTreatmentFunctionCode_DecisionToAdmit");
        private static final javax.xml.namespace.QName EMERGENCYCAREDISCHARGESTATUSSNOMEDCT$6 = 
            new javax.xml.namespace.QName("http://www.nhsia.nhs.uk/DataStandards/XMLschema/CDS/ns", "EmergencyCareDischargeStatus_SnomedCt");
        private static final javax.xml.namespace.QName EMERGENCYCAREATTENDANCECONCLUSIONDATE$8 = 
            new javax.xml.namespace.QName("http://www.nhsia.nhs.uk/DataStandards/XMLschema/CDS/ns", "EmergencyCareAttendanceConclusionDate");
        private static final javax.xml.namespace.QName EMERGENCYCAREATTENDANCECONCLUSIONTIME$10 = 
            new javax.xml.namespace.QName("http://www.nhsia.nhs.uk/DataStandards/XMLschema/CDS/ns", "EmergencyCareAttendanceConclusionTime");
        private static final javax.xml.namespace.QName EMERGENCYCAREDEPARTUREDATE$12 = 
            new javax.xml.namespace.QName("http://www.nhsia.nhs.uk/DataStandards/XMLschema/CDS/ns", "EmergencyCareDepartureDate");
        private static final javax.xml.namespace.QName EMERGENCYCAREDEPARTURETIME$14 = 
            new javax.xml.namespace.QName("http://www.nhsia.nhs.uk/DataStandards/XMLschema/CDS/ns", "EmergencyCareDepartureTime");
        private static final javax.xml.namespace.QName SAFEGUARDINGCONCERNSNOMEDCT$16 = 
            new javax.xml.namespace.QName("http://www.nhsia.nhs.uk/DataStandards/XMLschema/CDS/ns", "SafeguardingConcern_SnomedCt");
        private static final javax.xml.namespace.QName EMERGENCYCAREDISCHARGEDESTINATIONSNOMEDCT$18 = 
            new javax.xml.namespace.QName("http://www.nhsia.nhs.uk/DataStandards/XMLschema/CDS/ns", "EmergencyCareDischargeDestination_SnomedCt");
        private static final javax.xml.namespace.QName ORGANISATIONSITEIDENTIFIERDISCHARGEFROMEMERGENCYCARE$20 = 
            new javax.xml.namespace.QName("http://www.nhsia.nhs.uk/DataStandards/XMLschema/CDS/ns", "OrganisationSiteIdentifier_DischargeFromEmergencyCare");
        private static final javax.xml.namespace.QName EMERGENCYCAREDISCHARGEFOLLOWUPSNOMEDCT$22 = 
            new javax.xml.namespace.QName("http://www.nhsia.nhs.uk/DataStandards/XMLschema/CDS/ns", "EmergencyCareDischargeFollowUp_SnomedCt");
        private static final javax.xml.namespace.QName EMERGENCYCAREDISCHARGEINFORMATIONGIVENSNOMEDCT$24 = 
            new javax.xml.namespace.QName("http://www.nhsia.nhs.uk/DataStandards/XMLschema/CDS/ns", "EmergencyCareDischargeInformationGiven_SnomedCt");
        
        
        /**
         * Gets the "DecidedToAdmitDate" element
         */
        public java.util.Calendar getDecidedToAdmitDate()
        {
            synchronized (monitor())
            {
                check_orphaned();
                org.apache.xmlbeans.SimpleValue target = null;
                target = (org.apache.xmlbeans.SimpleValue)get_store().find_element_user(DECIDEDTOADMITDATE$0, 0);
                if (target == null)
                {
                    return null;
                }
                return target.getCalendarValue();
            }
        }
        
        /**
         * Gets (as xml) the "DecidedToAdmitDate" element
         */
        public uk.nhs.nhsia.datastandards.ecds.DateType xgetDecidedToAdmitDate()
        {
            synchronized (monitor())
            {
                check_orphaned();
                uk.nhs.nhsia.datastandards.ecds.DateType target = null;
                target = (uk.nhs.nhsia.datastandards.ecds.DateType)get_store().find_element_user(DECIDEDTOADMITDATE$0, 0);
                return target;
            }
        }
        
        /**
         * True if has "DecidedToAdmitDate" element
         */
        public boolean isSetDecidedToAdmitDate()
        {
            synchronized (monitor())
            {
                check_orphaned();
                return get_store().count_elements(DECIDEDTOADMITDATE$0) != 0;
            }
        }
        
        /**
         * Sets the "DecidedToAdmitDate" element
         */
        public void setDecidedToAdmitDate(java.util.Calendar decidedToAdmitDate)
        {
            synchronized (monitor())
            {
                check_orphaned();
                org.apache.xmlbeans.SimpleValue target = null;
                target = (org.apache.xmlbeans.SimpleValue)get_store().find_element_user(DECIDEDTOADMITDATE$0, 0);
                if (target == null)
                {
                    target = (org.apache.xmlbeans.SimpleValue)get_store().add_element_user(DECIDEDTOADMITDATE$0);
                }
                target.setCalendarValue(decidedToAdmitDate);
            }
        }
        
        /**
         * Sets (as xml) the "DecidedToAdmitDate" element
         */
        public void xsetDecidedToAdmitDate(uk.nhs.nhsia.datastandards.ecds.DateType decidedToAdmitDate)
        {
            synchronized (monitor())
            {
                check_orphaned();
                uk.nhs.nhsia.datastandards.ecds.DateType target = null;
                target = (uk.nhs.nhsia.datastandards.ecds.DateType)get_store().find_element_user(DECIDEDTOADMITDATE$0, 0);
                if (target == null)
                {
                    target = (uk.nhs.nhsia.datastandards.ecds.DateType)get_store().add_element_user(DECIDEDTOADMITDATE$0);
                }
                target.set(decidedToAdmitDate);
            }
        }
        
        /**
         * Unsets the "DecidedToAdmitDate" element
         */
        public void unsetDecidedToAdmitDate()
        {
            synchronized (monitor())
            {
                check_orphaned();
                get_store().remove_element(DECIDEDTOADMITDATE$0, 0);
            }
        }
        
        /**
         * Gets the "DecidedToAdmitTime" element
         */
        public java.util.Calendar getDecidedToAdmitTime()
        {
            synchronized (monitor())
            {
                check_orphaned();
                org.apache.xmlbeans.SimpleValue target = null;
                target = (org.apache.xmlbeans.SimpleValue)get_store().find_element_user(DECIDEDTOADMITTIME$2, 0);
                if (target == null)
                {
                    return null;
                }
                return target.getCalendarValue();
            }
        }
        
        /**
         * Gets (as xml) the "DecidedToAdmitTime" element
         */
        public uk.nhs.nhsia.datastandards.ecds.TimeType xgetDecidedToAdmitTime()
        {
            synchronized (monitor())
            {
                check_orphaned();
                uk.nhs.nhsia.datastandards.ecds.TimeType target = null;
                target = (uk.nhs.nhsia.datastandards.ecds.TimeType)get_store().find_element_user(DECIDEDTOADMITTIME$2, 0);
                return target;
            }
        }
        
        /**
         * True if has "DecidedToAdmitTime" element
         */
        public boolean isSetDecidedToAdmitTime()
        {
            synchronized (monitor())
            {
                check_orphaned();
                return get_store().count_elements(DECIDEDTOADMITTIME$2) != 0;
            }
        }
        
        /**
         * Sets the "DecidedToAdmitTime" element
         */
        public void setDecidedToAdmitTime(java.util.Calendar decidedToAdmitTime)
        {
            synchronized (monitor())
            {
                check_orphaned();
                org.apache.xmlbeans.SimpleValue target = null;
                target = (org.apache.xmlbeans.SimpleValue)get_store().find_element_user(DECIDEDTOADMITTIME$2, 0);
                if (target == null)
                {
                    target = (org.apache.xmlbeans.SimpleValue)get_store().add_element_user(DECIDEDTOADMITTIME$2);
                }
                target.setCalendarValue(decidedToAdmitTime);
            }
        }
        
        /**
         * Sets (as xml) the "DecidedToAdmitTime" element
         */
        public void xsetDecidedToAdmitTime(uk.nhs.nhsia.datastandards.ecds.TimeType decidedToAdmitTime)
        {
            synchronized (monitor())
            {
                check_orphaned();
                uk.nhs.nhsia.datastandards.ecds.TimeType target = null;
                target = (uk.nhs.nhsia.datastandards.ecds.TimeType)get_store().find_element_user(DECIDEDTOADMITTIME$2, 0);
                if (target == null)
                {
                    target = (uk.nhs.nhsia.datastandards.ecds.TimeType)get_store().add_element_user(DECIDEDTOADMITTIME$2);
                }
                target.set(decidedToAdmitTime);
            }
        }
        
        /**
         * Unsets the "DecidedToAdmitTime" element
         */
        public void unsetDecidedToAdmitTime()
        {
            synchronized (monitor())
            {
                check_orphaned();
                get_store().remove_element(DECIDEDTOADMITTIME$2, 0);
            }
        }
        
        /**
         * Gets the "ActivityTreatmentFunctionCode_DecisionToAdmit" element
         */
        public java.lang.String getActivityTreatmentFunctionCodeDecisionToAdmit()
        {
            synchronized (monitor())
            {
                check_orphaned();
                org.apache.xmlbeans.SimpleValue target = null;
                target = (org.apache.xmlbeans.SimpleValue)get_store().find_element_user(ACTIVITYTREATMENTFUNCTIONCODEDECISIONTOADMIT$4, 0);
                if (target == null)
                {
                    return null;
                }
                return target.getStringValue();
            }
        }
        
        /**
         * Gets (as xml) the "ActivityTreatmentFunctionCode_DecisionToAdmit" element
         */
        public uk.nhs.nhsia.datastandards.ecds.AttendanceOccurrenceECStructure.DischargeFromEmergencyCare.ActivityTreatmentFunctionCodeDecisionToAdmit xgetActivityTreatmentFunctionCodeDecisionToAdmit()
        {
            synchronized (monitor())
            {
                check_orphaned();
                uk.nhs.nhsia.datastandards.ecds.AttendanceOccurrenceECStructure.DischargeFromEmergencyCare.ActivityTreatmentFunctionCodeDecisionToAdmit target = null;
                target = (uk.nhs.nhsia.datastandards.ecds.AttendanceOccurrenceECStructure.DischargeFromEmergencyCare.ActivityTreatmentFunctionCodeDecisionToAdmit)get_store().find_element_user(ACTIVITYTREATMENTFUNCTIONCODEDECISIONTOADMIT$4, 0);
                return target;
            }
        }
        
        /**
         * True if has "ActivityTreatmentFunctionCode_DecisionToAdmit" element
         */
        public boolean isSetActivityTreatmentFunctionCodeDecisionToAdmit()
        {
            synchronized (monitor())
            {
                check_orphaned();
                return get_store().count_elements(ACTIVITYTREATMENTFUNCTIONCODEDECISIONTOADMIT$4) != 0;
            }
        }
        
        /**
         * Sets the "ActivityTreatmentFunctionCode_DecisionToAdmit" element
         */
        public void setActivityTreatmentFunctionCodeDecisionToAdmit(java.lang.String activityTreatmentFunctionCodeDecisionToAdmit)
        {
            synchronized (monitor())
            {
                check_orphaned();
                org.apache.xmlbeans.SimpleValue target = null;
                target = (org.apache.xmlbeans.SimpleValue)get_store().find_element_user(ACTIVITYTREATMENTFUNCTIONCODEDECISIONTOADMIT$4, 0);
                if (target == null)
                {
                    target = (org.apache.xmlbeans.SimpleValue)get_store().add_element_user(ACTIVITYTREATMENTFUNCTIONCODEDECISIONTOADMIT$4);
                }
                target.setStringValue(activityTreatmentFunctionCodeDecisionToAdmit);
            }
        }
        
        /**
         * Sets (as xml) the "ActivityTreatmentFunctionCode_DecisionToAdmit" element
         */
        public void xsetActivityTreatmentFunctionCodeDecisionToAdmit(uk.nhs.nhsia.datastandards.ecds.AttendanceOccurrenceECStructure.DischargeFromEmergencyCare.ActivityTreatmentFunctionCodeDecisionToAdmit activityTreatmentFunctionCodeDecisionToAdmit)
        {
            synchronized (monitor())
            {
                check_orphaned();
                uk.nhs.nhsia.datastandards.ecds.AttendanceOccurrenceECStructure.DischargeFromEmergencyCare.ActivityTreatmentFunctionCodeDecisionToAdmit target = null;
                target = (uk.nhs.nhsia.datastandards.ecds.AttendanceOccurrenceECStructure.DischargeFromEmergencyCare.ActivityTreatmentFunctionCodeDecisionToAdmit)get_store().find_element_user(ACTIVITYTREATMENTFUNCTIONCODEDECISIONTOADMIT$4, 0);
                if (target == null)
                {
                    target = (uk.nhs.nhsia.datastandards.ecds.AttendanceOccurrenceECStructure.DischargeFromEmergencyCare.ActivityTreatmentFunctionCodeDecisionToAdmit)get_store().add_element_user(ACTIVITYTREATMENTFUNCTIONCODEDECISIONTOADMIT$4);
                }
                target.set(activityTreatmentFunctionCodeDecisionToAdmit);
            }
        }
        
        /**
         * Unsets the "ActivityTreatmentFunctionCode_DecisionToAdmit" element
         */
        public void unsetActivityTreatmentFunctionCodeDecisionToAdmit()
        {
            synchronized (monitor())
            {
                check_orphaned();
                get_store().remove_element(ACTIVITYTREATMENTFUNCTIONCODEDECISIONTOADMIT$4, 0);
            }
        }
        
        /**
         * Gets the "EmergencyCareDischargeStatus_SnomedCt" element
         */
        public java.lang.String getEmergencyCareDischargeStatusSnomedCt()
        {
            synchronized (monitor())
            {
                check_orphaned();
                org.apache.xmlbeans.SimpleValue target = null;
                target = (org.apache.xmlbeans.SimpleValue)get_store().find_element_user(EMERGENCYCAREDISCHARGESTATUSSNOMEDCT$6, 0);
                if (target == null)
                {
                    return null;
                }
                return target.getStringValue();
            }
        }
        
        /**
         * Gets (as xml) the "EmergencyCareDischargeStatus_SnomedCt" element
         */
        public uk.nhs.nhsia.datastandards.ecds.N618ECType xgetEmergencyCareDischargeStatusSnomedCt()
        {
            synchronized (monitor())
            {
                check_orphaned();
                uk.nhs.nhsia.datastandards.ecds.N618ECType target = null;
                target = (uk.nhs.nhsia.datastandards.ecds.N618ECType)get_store().find_element_user(EMERGENCYCAREDISCHARGESTATUSSNOMEDCT$6, 0);
                return target;
            }
        }
        
        /**
         * True if has "EmergencyCareDischargeStatus_SnomedCt" element
         */
        public boolean isSetEmergencyCareDischargeStatusSnomedCt()
        {
            synchronized (monitor())
            {
                check_orphaned();
                return get_store().count_elements(EMERGENCYCAREDISCHARGESTATUSSNOMEDCT$6) != 0;
            }
        }
        
        /**
         * Sets the "EmergencyCareDischargeStatus_SnomedCt" element
         */
        public void setEmergencyCareDischargeStatusSnomedCt(java.lang.String emergencyCareDischargeStatusSnomedCt)
        {
            synchronized (monitor())
            {
                check_orphaned();
                org.apache.xmlbeans.SimpleValue target = null;
                target = (org.apache.xmlbeans.SimpleValue)get_store().find_element_user(EMERGENCYCAREDISCHARGESTATUSSNOMEDCT$6, 0);
                if (target == null)
                {
                    target = (org.apache.xmlbeans.SimpleValue)get_store().add_element_user(EMERGENCYCAREDISCHARGESTATUSSNOMEDCT$6);
                }
                target.setStringValue(emergencyCareDischargeStatusSnomedCt);
            }
        }
        
        /**
         * Sets (as xml) the "EmergencyCareDischargeStatus_SnomedCt" element
         */
        public void xsetEmergencyCareDischargeStatusSnomedCt(uk.nhs.nhsia.datastandards.ecds.N618ECType emergencyCareDischargeStatusSnomedCt)
        {
            synchronized (monitor())
            {
                check_orphaned();
                uk.nhs.nhsia.datastandards.ecds.N618ECType target = null;
                target = (uk.nhs.nhsia.datastandards.ecds.N618ECType)get_store().find_element_user(EMERGENCYCAREDISCHARGESTATUSSNOMEDCT$6, 0);
                if (target == null)
                {
                    target = (uk.nhs.nhsia.datastandards.ecds.N618ECType)get_store().add_element_user(EMERGENCYCAREDISCHARGESTATUSSNOMEDCT$6);
                }
                target.set(emergencyCareDischargeStatusSnomedCt);
            }
        }
        
        /**
         * Unsets the "EmergencyCareDischargeStatus_SnomedCt" element
         */
        public void unsetEmergencyCareDischargeStatusSnomedCt()
        {
            synchronized (monitor())
            {
                check_orphaned();
                get_store().remove_element(EMERGENCYCAREDISCHARGESTATUSSNOMEDCT$6, 0);
            }
        }
        
        /**
         * Gets the "EmergencyCareAttendanceConclusionDate" element
         */
        public java.util.Calendar getEmergencyCareAttendanceConclusionDate()
        {
            synchronized (monitor())
            {
                check_orphaned();
                org.apache.xmlbeans.SimpleValue target = null;
                target = (org.apache.xmlbeans.SimpleValue)get_store().find_element_user(EMERGENCYCAREATTENDANCECONCLUSIONDATE$8, 0);
                if (target == null)
                {
                    return null;
                }
                return target.getCalendarValue();
            }
        }
        
        /**
         * Gets (as xml) the "EmergencyCareAttendanceConclusionDate" element
         */
        public uk.nhs.nhsia.datastandards.ecds.DateType xgetEmergencyCareAttendanceConclusionDate()
        {
            synchronized (monitor())
            {
                check_orphaned();
                uk.nhs.nhsia.datastandards.ecds.DateType target = null;
                target = (uk.nhs.nhsia.datastandards.ecds.DateType)get_store().find_element_user(EMERGENCYCAREATTENDANCECONCLUSIONDATE$8, 0);
                return target;
            }
        }
        
        /**
         * True if has "EmergencyCareAttendanceConclusionDate" element
         */
        public boolean isSetEmergencyCareAttendanceConclusionDate()
        {
            synchronized (monitor())
            {
                check_orphaned();
                return get_store().count_elements(EMERGENCYCAREATTENDANCECONCLUSIONDATE$8) != 0;
            }
        }
        
        /**
         * Sets the "EmergencyCareAttendanceConclusionDate" element
         */
        public void setEmergencyCareAttendanceConclusionDate(java.util.Calendar emergencyCareAttendanceConclusionDate)
        {
            synchronized (monitor())
            {
                check_orphaned();
                org.apache.xmlbeans.SimpleValue target = null;
                target = (org.apache.xmlbeans.SimpleValue)get_store().find_element_user(EMERGENCYCAREATTENDANCECONCLUSIONDATE$8, 0);
                if (target == null)
                {
                    target = (org.apache.xmlbeans.SimpleValue)get_store().add_element_user(EMERGENCYCAREATTENDANCECONCLUSIONDATE$8);
                }
                target.setCalendarValue(emergencyCareAttendanceConclusionDate);
            }
        }
        
        /**
         * Sets (as xml) the "EmergencyCareAttendanceConclusionDate" element
         */
        public void xsetEmergencyCareAttendanceConclusionDate(uk.nhs.nhsia.datastandards.ecds.DateType emergencyCareAttendanceConclusionDate)
        {
            synchronized (monitor())
            {
                check_orphaned();
                uk.nhs.nhsia.datastandards.ecds.DateType target = null;
                target = (uk.nhs.nhsia.datastandards.ecds.DateType)get_store().find_element_user(EMERGENCYCAREATTENDANCECONCLUSIONDATE$8, 0);
                if (target == null)
                {
                    target = (uk.nhs.nhsia.datastandards.ecds.DateType)get_store().add_element_user(EMERGENCYCAREATTENDANCECONCLUSIONDATE$8);
                }
                target.set(emergencyCareAttendanceConclusionDate);
            }
        }
        
        /**
         * Unsets the "EmergencyCareAttendanceConclusionDate" element
         */
        public void unsetEmergencyCareAttendanceConclusionDate()
        {
            synchronized (monitor())
            {
                check_orphaned();
                get_store().remove_element(EMERGENCYCAREATTENDANCECONCLUSIONDATE$8, 0);
            }
        }
        
        /**
         * Gets the "EmergencyCareAttendanceConclusionTime" element
         */
        public java.util.Calendar getEmergencyCareAttendanceConclusionTime()
        {
            synchronized (monitor())
            {
                check_orphaned();
                org.apache.xmlbeans.SimpleValue target = null;
                target = (org.apache.xmlbeans.SimpleValue)get_store().find_element_user(EMERGENCYCAREATTENDANCECONCLUSIONTIME$10, 0);
                if (target == null)
                {
                    return null;
                }
                return target.getCalendarValue();
            }
        }
        
        /**
         * Gets (as xml) the "EmergencyCareAttendanceConclusionTime" element
         */
        public uk.nhs.nhsia.datastandards.ecds.TimeType xgetEmergencyCareAttendanceConclusionTime()
        {
            synchronized (monitor())
            {
                check_orphaned();
                uk.nhs.nhsia.datastandards.ecds.TimeType target = null;
                target = (uk.nhs.nhsia.datastandards.ecds.TimeType)get_store().find_element_user(EMERGENCYCAREATTENDANCECONCLUSIONTIME$10, 0);
                return target;
            }
        }
        
        /**
         * True if has "EmergencyCareAttendanceConclusionTime" element
         */
        public boolean isSetEmergencyCareAttendanceConclusionTime()
        {
            synchronized (monitor())
            {
                check_orphaned();
                return get_store().count_elements(EMERGENCYCAREATTENDANCECONCLUSIONTIME$10) != 0;
            }
        }
        
        /**
         * Sets the "EmergencyCareAttendanceConclusionTime" element
         */
        public void setEmergencyCareAttendanceConclusionTime(java.util.Calendar emergencyCareAttendanceConclusionTime)
        {
            synchronized (monitor())
            {
                check_orphaned();
                org.apache.xmlbeans.SimpleValue target = null;
                target = (org.apache.xmlbeans.SimpleValue)get_store().find_element_user(EMERGENCYCAREATTENDANCECONCLUSIONTIME$10, 0);
                if (target == null)
                {
                    target = (org.apache.xmlbeans.SimpleValue)get_store().add_element_user(EMERGENCYCAREATTENDANCECONCLUSIONTIME$10);
                }
                target.setCalendarValue(emergencyCareAttendanceConclusionTime);
            }
        }
        
        /**
         * Sets (as xml) the "EmergencyCareAttendanceConclusionTime" element
         */
        public void xsetEmergencyCareAttendanceConclusionTime(uk.nhs.nhsia.datastandards.ecds.TimeType emergencyCareAttendanceConclusionTime)
        {
            synchronized (monitor())
            {
                check_orphaned();
                uk.nhs.nhsia.datastandards.ecds.TimeType target = null;
                target = (uk.nhs.nhsia.datastandards.ecds.TimeType)get_store().find_element_user(EMERGENCYCAREATTENDANCECONCLUSIONTIME$10, 0);
                if (target == null)
                {
                    target = (uk.nhs.nhsia.datastandards.ecds.TimeType)get_store().add_element_user(EMERGENCYCAREATTENDANCECONCLUSIONTIME$10);
                }
                target.set(emergencyCareAttendanceConclusionTime);
            }
        }
        
        /**
         * Unsets the "EmergencyCareAttendanceConclusionTime" element
         */
        public void unsetEmergencyCareAttendanceConclusionTime()
        {
            synchronized (monitor())
            {
                check_orphaned();
                get_store().remove_element(EMERGENCYCAREATTENDANCECONCLUSIONTIME$10, 0);
            }
        }
        
        /**
         * Gets the "EmergencyCareDepartureDate" element
         */
        public java.util.Calendar getEmergencyCareDepartureDate()
        {
            synchronized (monitor())
            {
                check_orphaned();
                org.apache.xmlbeans.SimpleValue target = null;
                target = (org.apache.xmlbeans.SimpleValue)get_store().find_element_user(EMERGENCYCAREDEPARTUREDATE$12, 0);
                if (target == null)
                {
                    return null;
                }
                return target.getCalendarValue();
            }
        }
        
        /**
         * Gets (as xml) the "EmergencyCareDepartureDate" element
         */
        public uk.nhs.nhsia.datastandards.ecds.DateType xgetEmergencyCareDepartureDate()
        {
            synchronized (monitor())
            {
                check_orphaned();
                uk.nhs.nhsia.datastandards.ecds.DateType target = null;
                target = (uk.nhs.nhsia.datastandards.ecds.DateType)get_store().find_element_user(EMERGENCYCAREDEPARTUREDATE$12, 0);
                return target;
            }
        }
        
        /**
         * True if has "EmergencyCareDepartureDate" element
         */
        public boolean isSetEmergencyCareDepartureDate()
        {
            synchronized (monitor())
            {
                check_orphaned();
                return get_store().count_elements(EMERGENCYCAREDEPARTUREDATE$12) != 0;
            }
        }
        
        /**
         * Sets the "EmergencyCareDepartureDate" element
         */
        public void setEmergencyCareDepartureDate(java.util.Calendar emergencyCareDepartureDate)
        {
            synchronized (monitor())
            {
                check_orphaned();
                org.apache.xmlbeans.SimpleValue target = null;
                target = (org.apache.xmlbeans.SimpleValue)get_store().find_element_user(EMERGENCYCAREDEPARTUREDATE$12, 0);
                if (target == null)
                {
                    target = (org.apache.xmlbeans.SimpleValue)get_store().add_element_user(EMERGENCYCAREDEPARTUREDATE$12);
                }
                target.setCalendarValue(emergencyCareDepartureDate);
            }
        }
        
        /**
         * Sets (as xml) the "EmergencyCareDepartureDate" element
         */
        public void xsetEmergencyCareDepartureDate(uk.nhs.nhsia.datastandards.ecds.DateType emergencyCareDepartureDate)
        {
            synchronized (monitor())
            {
                check_orphaned();
                uk.nhs.nhsia.datastandards.ecds.DateType target = null;
                target = (uk.nhs.nhsia.datastandards.ecds.DateType)get_store().find_element_user(EMERGENCYCAREDEPARTUREDATE$12, 0);
                if (target == null)
                {
                    target = (uk.nhs.nhsia.datastandards.ecds.DateType)get_store().add_element_user(EMERGENCYCAREDEPARTUREDATE$12);
                }
                target.set(emergencyCareDepartureDate);
            }
        }
        
        /**
         * Unsets the "EmergencyCareDepartureDate" element
         */
        public void unsetEmergencyCareDepartureDate()
        {
            synchronized (monitor())
            {
                check_orphaned();
                get_store().remove_element(EMERGENCYCAREDEPARTUREDATE$12, 0);
            }
        }
        
        /**
         * Gets the "EmergencyCareDepartureTime" element
         */
        public java.util.Calendar getEmergencyCareDepartureTime()
        {
            synchronized (monitor())
            {
                check_orphaned();
                org.apache.xmlbeans.SimpleValue target = null;
                target = (org.apache.xmlbeans.SimpleValue)get_store().find_element_user(EMERGENCYCAREDEPARTURETIME$14, 0);
                if (target == null)
                {
                    return null;
                }
                return target.getCalendarValue();
            }
        }
        
        /**
         * Gets (as xml) the "EmergencyCareDepartureTime" element
         */
        public uk.nhs.nhsia.datastandards.ecds.TimeType xgetEmergencyCareDepartureTime()
        {
            synchronized (monitor())
            {
                check_orphaned();
                uk.nhs.nhsia.datastandards.ecds.TimeType target = null;
                target = (uk.nhs.nhsia.datastandards.ecds.TimeType)get_store().find_element_user(EMERGENCYCAREDEPARTURETIME$14, 0);
                return target;
            }
        }
        
        /**
         * True if has "EmergencyCareDepartureTime" element
         */
        public boolean isSetEmergencyCareDepartureTime()
        {
            synchronized (monitor())
            {
                check_orphaned();
                return get_store().count_elements(EMERGENCYCAREDEPARTURETIME$14) != 0;
            }
        }
        
        /**
         * Sets the "EmergencyCareDepartureTime" element
         */
        public void setEmergencyCareDepartureTime(java.util.Calendar emergencyCareDepartureTime)
        {
            synchronized (monitor())
            {
                check_orphaned();
                org.apache.xmlbeans.SimpleValue target = null;
                target = (org.apache.xmlbeans.SimpleValue)get_store().find_element_user(EMERGENCYCAREDEPARTURETIME$14, 0);
                if (target == null)
                {
                    target = (org.apache.xmlbeans.SimpleValue)get_store().add_element_user(EMERGENCYCAREDEPARTURETIME$14);
                }
                target.setCalendarValue(emergencyCareDepartureTime);
            }
        }
        
        /**
         * Sets (as xml) the "EmergencyCareDepartureTime" element
         */
        public void xsetEmergencyCareDepartureTime(uk.nhs.nhsia.datastandards.ecds.TimeType emergencyCareDepartureTime)
        {
            synchronized (monitor())
            {
                check_orphaned();
                uk.nhs.nhsia.datastandards.ecds.TimeType target = null;
                target = (uk.nhs.nhsia.datastandards.ecds.TimeType)get_store().find_element_user(EMERGENCYCAREDEPARTURETIME$14, 0);
                if (target == null)
                {
                    target = (uk.nhs.nhsia.datastandards.ecds.TimeType)get_store().add_element_user(EMERGENCYCAREDEPARTURETIME$14);
                }
                target.set(emergencyCareDepartureTime);
            }
        }
        
        /**
         * Unsets the "EmergencyCareDepartureTime" element
         */
        public void unsetEmergencyCareDepartureTime()
        {
            synchronized (monitor())
            {
                check_orphaned();
                get_store().remove_element(EMERGENCYCAREDEPARTURETIME$14, 0);
            }
        }
        
        /**
         * Gets array of all "SafeguardingConcern_SnomedCt" elements
         */
        public java.lang.String[] getSafeguardingConcernSnomedCtArray()
        {
            synchronized (monitor())
            {
                check_orphaned();
                java.util.List targetList = new java.util.ArrayList();
                get_store().find_all_element_users(SAFEGUARDINGCONCERNSNOMEDCT$16, targetList);
                java.lang.String[] result = new java.lang.String[targetList.size()];
                for (int i = 0, len = targetList.size() ; i < len ; i++)
                    result[i] = ((org.apache.xmlbeans.SimpleValue)targetList.get(i)).getStringValue();
                return result;
            }
        }
        
        /**
         * Gets ith "SafeguardingConcern_SnomedCt" element
         */
        public java.lang.String getSafeguardingConcernSnomedCtArray(int i)
        {
            synchronized (monitor())
            {
                check_orphaned();
                org.apache.xmlbeans.SimpleValue target = null;
                target = (org.apache.xmlbeans.SimpleValue)get_store().find_element_user(SAFEGUARDINGCONCERNSNOMEDCT$16, i);
                if (target == null)
                {
                    throw new IndexOutOfBoundsException();
                }
                return target.getStringValue();
            }
        }
        
        /**
         * Gets (as xml) array of all "SafeguardingConcern_SnomedCt" elements
         */
        public uk.nhs.nhsia.datastandards.ecds.N618ECType[] xgetSafeguardingConcernSnomedCtArray()
        {
            synchronized (monitor())
            {
                check_orphaned();
                java.util.List targetList = new java.util.ArrayList();
                get_store().find_all_element_users(SAFEGUARDINGCONCERNSNOMEDCT$16, targetList);
                uk.nhs.nhsia.datastandards.ecds.N618ECType[] result = new uk.nhs.nhsia.datastandards.ecds.N618ECType[targetList.size()];
                targetList.toArray(result);
                return result;
            }
        }
        
        /**
         * Gets (as xml) ith "SafeguardingConcern_SnomedCt" element
         */
        public uk.nhs.nhsia.datastandards.ecds.N618ECType xgetSafeguardingConcernSnomedCtArray(int i)
        {
            synchronized (monitor())
            {
                check_orphaned();
                uk.nhs.nhsia.datastandards.ecds.N618ECType target = null;
                target = (uk.nhs.nhsia.datastandards.ecds.N618ECType)get_store().find_element_user(SAFEGUARDINGCONCERNSNOMEDCT$16, i);
                if (target == null)
                {
                    throw new IndexOutOfBoundsException();
                }
                return target;
            }
        }
        
        /**
         * Returns number of "SafeguardingConcern_SnomedCt" element
         */
        public int sizeOfSafeguardingConcernSnomedCtArray()
        {
            synchronized (monitor())
            {
                check_orphaned();
                return get_store().count_elements(SAFEGUARDINGCONCERNSNOMEDCT$16);
            }
        }
        
        /**
         * Sets array of all "SafeguardingConcern_SnomedCt" element
         */
        public void setSafeguardingConcernSnomedCtArray(java.lang.String[] safeguardingConcernSnomedCtArray)
        {
            synchronized (monitor())
            {
                check_orphaned();
                arraySetterHelper(safeguardingConcernSnomedCtArray, SAFEGUARDINGCONCERNSNOMEDCT$16);
            }
        }
        
        /**
         * Sets ith "SafeguardingConcern_SnomedCt" element
         */
        public void setSafeguardingConcernSnomedCtArray(int i, java.lang.String safeguardingConcernSnomedCt)
        {
            synchronized (monitor())
            {
                check_orphaned();
                org.apache.xmlbeans.SimpleValue target = null;
                target = (org.apache.xmlbeans.SimpleValue)get_store().find_element_user(SAFEGUARDINGCONCERNSNOMEDCT$16, i);
                if (target == null)
                {
                    throw new IndexOutOfBoundsException();
                }
                target.setStringValue(safeguardingConcernSnomedCt);
            }
        }
        
        /**
         * Sets (as xml) array of all "SafeguardingConcern_SnomedCt" element
         */
        public void xsetSafeguardingConcernSnomedCtArray(uk.nhs.nhsia.datastandards.ecds.N618ECType[]safeguardingConcernSnomedCtArray)
        {
            synchronized (monitor())
            {
                check_orphaned();
                arraySetterHelper(safeguardingConcernSnomedCtArray, SAFEGUARDINGCONCERNSNOMEDCT$16);
            }
        }
        
        /**
         * Sets (as xml) ith "SafeguardingConcern_SnomedCt" element
         */
        public void xsetSafeguardingConcernSnomedCtArray(int i, uk.nhs.nhsia.datastandards.ecds.N618ECType safeguardingConcernSnomedCt)
        {
            synchronized (monitor())
            {
                check_orphaned();
                uk.nhs.nhsia.datastandards.ecds.N618ECType target = null;
                target = (uk.nhs.nhsia.datastandards.ecds.N618ECType)get_store().find_element_user(SAFEGUARDINGCONCERNSNOMEDCT$16, i);
                if (target == null)
                {
                    throw new IndexOutOfBoundsException();
                }
                target.set(safeguardingConcernSnomedCt);
            }
        }
        
        /**
         * Inserts the value as the ith "SafeguardingConcern_SnomedCt" element
         */
        public void insertSafeguardingConcernSnomedCt(int i, java.lang.String safeguardingConcernSnomedCt)
        {
            synchronized (monitor())
            {
                check_orphaned();
                org.apache.xmlbeans.SimpleValue target = 
                    (org.apache.xmlbeans.SimpleValue)get_store().insert_element_user(SAFEGUARDINGCONCERNSNOMEDCT$16, i);
                target.setStringValue(safeguardingConcernSnomedCt);
            }
        }
        
        /**
         * Appends the value as the last "SafeguardingConcern_SnomedCt" element
         */
        public void addSafeguardingConcernSnomedCt(java.lang.String safeguardingConcernSnomedCt)
        {
            synchronized (monitor())
            {
                check_orphaned();
                org.apache.xmlbeans.SimpleValue target = null;
                target = (org.apache.xmlbeans.SimpleValue)get_store().add_element_user(SAFEGUARDINGCONCERNSNOMEDCT$16);
                target.setStringValue(safeguardingConcernSnomedCt);
            }
        }
        
        /**
         * Inserts and returns a new empty value (as xml) as the ith "SafeguardingConcern_SnomedCt" element
         */
        public uk.nhs.nhsia.datastandards.ecds.N618ECType insertNewSafeguardingConcernSnomedCt(int i)
        {
            synchronized (monitor())
            {
                check_orphaned();
                uk.nhs.nhsia.datastandards.ecds.N618ECType target = null;
                target = (uk.nhs.nhsia.datastandards.ecds.N618ECType)get_store().insert_element_user(SAFEGUARDINGCONCERNSNOMEDCT$16, i);
                return target;
            }
        }
        
        /**
         * Appends and returns a new empty value (as xml) as the last "SafeguardingConcern_SnomedCt" element
         */
        public uk.nhs.nhsia.datastandards.ecds.N618ECType addNewSafeguardingConcernSnomedCt()
        {
            synchronized (monitor())
            {
                check_orphaned();
                uk.nhs.nhsia.datastandards.ecds.N618ECType target = null;
                target = (uk.nhs.nhsia.datastandards.ecds.N618ECType)get_store().add_element_user(SAFEGUARDINGCONCERNSNOMEDCT$16);
                return target;
            }
        }
        
        /**
         * Removes the ith "SafeguardingConcern_SnomedCt" element
         */
        public void removeSafeguardingConcernSnomedCt(int i)
        {
            synchronized (monitor())
            {
                check_orphaned();
                get_store().remove_element(SAFEGUARDINGCONCERNSNOMEDCT$16, i);
            }
        }
        
        /**
         * Gets the "EmergencyCareDischargeDestination_SnomedCt" element
         */
        public java.lang.String getEmergencyCareDischargeDestinationSnomedCt()
        {
            synchronized (monitor())
            {
                check_orphaned();
                org.apache.xmlbeans.SimpleValue target = null;
                target = (org.apache.xmlbeans.SimpleValue)get_store().find_element_user(EMERGENCYCAREDISCHARGEDESTINATIONSNOMEDCT$18, 0);
                if (target == null)
                {
                    return null;
                }
                return target.getStringValue();
            }
        }
        
        /**
         * Gets (as xml) the "EmergencyCareDischargeDestination_SnomedCt" element
         */
        public uk.nhs.nhsia.datastandards.ecds.N618ECType xgetEmergencyCareDischargeDestinationSnomedCt()
        {
            synchronized (monitor())
            {
                check_orphaned();
                uk.nhs.nhsia.datastandards.ecds.N618ECType target = null;
                target = (uk.nhs.nhsia.datastandards.ecds.N618ECType)get_store().find_element_user(EMERGENCYCAREDISCHARGEDESTINATIONSNOMEDCT$18, 0);
                return target;
            }
        }
        
        /**
         * True if has "EmergencyCareDischargeDestination_SnomedCt" element
         */
        public boolean isSetEmergencyCareDischargeDestinationSnomedCt()
        {
            synchronized (monitor())
            {
                check_orphaned();
                return get_store().count_elements(EMERGENCYCAREDISCHARGEDESTINATIONSNOMEDCT$18) != 0;
            }
        }
        
        /**
         * Sets the "EmergencyCareDischargeDestination_SnomedCt" element
         */
        public void setEmergencyCareDischargeDestinationSnomedCt(java.lang.String emergencyCareDischargeDestinationSnomedCt)
        {
            synchronized (monitor())
            {
                check_orphaned();
                org.apache.xmlbeans.SimpleValue target = null;
                target = (org.apache.xmlbeans.SimpleValue)get_store().find_element_user(EMERGENCYCAREDISCHARGEDESTINATIONSNOMEDCT$18, 0);
                if (target == null)
                {
                    target = (org.apache.xmlbeans.SimpleValue)get_store().add_element_user(EMERGENCYCAREDISCHARGEDESTINATIONSNOMEDCT$18);
                }
                target.setStringValue(emergencyCareDischargeDestinationSnomedCt);
            }
        }
        
        /**
         * Sets (as xml) the "EmergencyCareDischargeDestination_SnomedCt" element
         */
        public void xsetEmergencyCareDischargeDestinationSnomedCt(uk.nhs.nhsia.datastandards.ecds.N618ECType emergencyCareDischargeDestinationSnomedCt)
        {
            synchronized (monitor())
            {
                check_orphaned();
                uk.nhs.nhsia.datastandards.ecds.N618ECType target = null;
                target = (uk.nhs.nhsia.datastandards.ecds.N618ECType)get_store().find_element_user(EMERGENCYCAREDISCHARGEDESTINATIONSNOMEDCT$18, 0);
                if (target == null)
                {
                    target = (uk.nhs.nhsia.datastandards.ecds.N618ECType)get_store().add_element_user(EMERGENCYCAREDISCHARGEDESTINATIONSNOMEDCT$18);
                }
                target.set(emergencyCareDischargeDestinationSnomedCt);
            }
        }
        
        /**
         * Unsets the "EmergencyCareDischargeDestination_SnomedCt" element
         */
        public void unsetEmergencyCareDischargeDestinationSnomedCt()
        {
            synchronized (monitor())
            {
                check_orphaned();
                get_store().remove_element(EMERGENCYCAREDISCHARGEDESTINATIONSNOMEDCT$18, 0);
            }
        }
        
        /**
         * Gets the "OrganisationSiteIdentifier_DischargeFromEmergencyCare" element
         */
        public java.lang.String getOrganisationSiteIdentifierDischargeFromEmergencyCare()
        {
            synchronized (monitor())
            {
                check_orphaned();
                org.apache.xmlbeans.SimpleValue target = null;
                target = (org.apache.xmlbeans.SimpleValue)get_store().find_element_user(ORGANISATIONSITEIDENTIFIERDISCHARGEFROMEMERGENCYCARE$20, 0);
                if (target == null)
                {
                    return null;
                }
                return target.getStringValue();
            }
        }
        
        /**
         * Gets (as xml) the "OrganisationSiteIdentifier_DischargeFromEmergencyCare" element
         */
        public uk.nhs.nhsia.datastandards.ecds.AN59ECType xgetOrganisationSiteIdentifierDischargeFromEmergencyCare()
        {
            synchronized (monitor())
            {
                check_orphaned();
                uk.nhs.nhsia.datastandards.ecds.AN59ECType target = null;
                target = (uk.nhs.nhsia.datastandards.ecds.AN59ECType)get_store().find_element_user(ORGANISATIONSITEIDENTIFIERDISCHARGEFROMEMERGENCYCARE$20, 0);
                return target;
            }
        }
        
        /**
         * True if has "OrganisationSiteIdentifier_DischargeFromEmergencyCare" element
         */
        public boolean isSetOrganisationSiteIdentifierDischargeFromEmergencyCare()
        {
            synchronized (monitor())
            {
                check_orphaned();
                return get_store().count_elements(ORGANISATIONSITEIDENTIFIERDISCHARGEFROMEMERGENCYCARE$20) != 0;
            }
        }
        
        /**
         * Sets the "OrganisationSiteIdentifier_DischargeFromEmergencyCare" element
         */
        public void setOrganisationSiteIdentifierDischargeFromEmergencyCare(java.lang.String organisationSiteIdentifierDischargeFromEmergencyCare)
        {
            synchronized (monitor())
            {
                check_orphaned();
                org.apache.xmlbeans.SimpleValue target = null;
                target = (org.apache.xmlbeans.SimpleValue)get_store().find_element_user(ORGANISATIONSITEIDENTIFIERDISCHARGEFROMEMERGENCYCARE$20, 0);
                if (target == null)
                {
                    target = (org.apache.xmlbeans.SimpleValue)get_store().add_element_user(ORGANISATIONSITEIDENTIFIERDISCHARGEFROMEMERGENCYCARE$20);
                }
                target.setStringValue(organisationSiteIdentifierDischargeFromEmergencyCare);
            }
        }
        
        /**
         * Sets (as xml) the "OrganisationSiteIdentifier_DischargeFromEmergencyCare" element
         */
        public void xsetOrganisationSiteIdentifierDischargeFromEmergencyCare(uk.nhs.nhsia.datastandards.ecds.AN59ECType organisationSiteIdentifierDischargeFromEmergencyCare)
        {
            synchronized (monitor())
            {
                check_orphaned();
                uk.nhs.nhsia.datastandards.ecds.AN59ECType target = null;
                target = (uk.nhs.nhsia.datastandards.ecds.AN59ECType)get_store().find_element_user(ORGANISATIONSITEIDENTIFIERDISCHARGEFROMEMERGENCYCARE$20, 0);
                if (target == null)
                {
                    target = (uk.nhs.nhsia.datastandards.ecds.AN59ECType)get_store().add_element_user(ORGANISATIONSITEIDENTIFIERDISCHARGEFROMEMERGENCYCARE$20);
                }
                target.set(organisationSiteIdentifierDischargeFromEmergencyCare);
            }
        }
        
        /**
         * Unsets the "OrganisationSiteIdentifier_DischargeFromEmergencyCare" element
         */
        public void unsetOrganisationSiteIdentifierDischargeFromEmergencyCare()
        {
            synchronized (monitor())
            {
                check_orphaned();
                get_store().remove_element(ORGANISATIONSITEIDENTIFIERDISCHARGEFROMEMERGENCYCARE$20, 0);
            }
        }
        
        /**
         * Gets the "EmergencyCareDischargeFollowUp_SnomedCt" element
         */
        public java.lang.String getEmergencyCareDischargeFollowUpSnomedCt()
        {
            synchronized (monitor())
            {
                check_orphaned();
                org.apache.xmlbeans.SimpleValue target = null;
                target = (org.apache.xmlbeans.SimpleValue)get_store().find_element_user(EMERGENCYCAREDISCHARGEFOLLOWUPSNOMEDCT$22, 0);
                if (target == null)
                {
                    return null;
                }
                return target.getStringValue();
            }
        }
        
        /**
         * Gets (as xml) the "EmergencyCareDischargeFollowUp_SnomedCt" element
         */
        public uk.nhs.nhsia.datastandards.ecds.N618ECType xgetEmergencyCareDischargeFollowUpSnomedCt()
        {
            synchronized (monitor())
            {
                check_orphaned();
                uk.nhs.nhsia.datastandards.ecds.N618ECType target = null;
                target = (uk.nhs.nhsia.datastandards.ecds.N618ECType)get_store().find_element_user(EMERGENCYCAREDISCHARGEFOLLOWUPSNOMEDCT$22, 0);
                return target;
            }
        }
        
        /**
         * True if has "EmergencyCareDischargeFollowUp_SnomedCt" element
         */
        public boolean isSetEmergencyCareDischargeFollowUpSnomedCt()
        {
            synchronized (monitor())
            {
                check_orphaned();
                return get_store().count_elements(EMERGENCYCAREDISCHARGEFOLLOWUPSNOMEDCT$22) != 0;
            }
        }
        
        /**
         * Sets the "EmergencyCareDischargeFollowUp_SnomedCt" element
         */
        public void setEmergencyCareDischargeFollowUpSnomedCt(java.lang.String emergencyCareDischargeFollowUpSnomedCt)
        {
            synchronized (monitor())
            {
                check_orphaned();
                org.apache.xmlbeans.SimpleValue target = null;
                target = (org.apache.xmlbeans.SimpleValue)get_store().find_element_user(EMERGENCYCAREDISCHARGEFOLLOWUPSNOMEDCT$22, 0);
                if (target == null)
                {
                    target = (org.apache.xmlbeans.SimpleValue)get_store().add_element_user(EMERGENCYCAREDISCHARGEFOLLOWUPSNOMEDCT$22);
                }
                target.setStringValue(emergencyCareDischargeFollowUpSnomedCt);
            }
        }
        
        /**
         * Sets (as xml) the "EmergencyCareDischargeFollowUp_SnomedCt" element
         */
        public void xsetEmergencyCareDischargeFollowUpSnomedCt(uk.nhs.nhsia.datastandards.ecds.N618ECType emergencyCareDischargeFollowUpSnomedCt)
        {
            synchronized (monitor())
            {
                check_orphaned();
                uk.nhs.nhsia.datastandards.ecds.N618ECType target = null;
                target = (uk.nhs.nhsia.datastandards.ecds.N618ECType)get_store().find_element_user(EMERGENCYCAREDISCHARGEFOLLOWUPSNOMEDCT$22, 0);
                if (target == null)
                {
                    target = (uk.nhs.nhsia.datastandards.ecds.N618ECType)get_store().add_element_user(EMERGENCYCAREDISCHARGEFOLLOWUPSNOMEDCT$22);
                }
                target.set(emergencyCareDischargeFollowUpSnomedCt);
            }
        }
        
        /**
         * Unsets the "EmergencyCareDischargeFollowUp_SnomedCt" element
         */
        public void unsetEmergencyCareDischargeFollowUpSnomedCt()
        {
            synchronized (monitor())
            {
                check_orphaned();
                get_store().remove_element(EMERGENCYCAREDISCHARGEFOLLOWUPSNOMEDCT$22, 0);
            }
        }
        
        /**
         * Gets the "EmergencyCareDischargeInformationGiven_SnomedCt" element
         */
        public java.lang.String getEmergencyCareDischargeInformationGivenSnomedCt()
        {
            synchronized (monitor())
            {
                check_orphaned();
                org.apache.xmlbeans.SimpleValue target = null;
                target = (org.apache.xmlbeans.SimpleValue)get_store().find_element_user(EMERGENCYCAREDISCHARGEINFORMATIONGIVENSNOMEDCT$24, 0);
                if (target == null)
                {
                    return null;
                }
                return target.getStringValue();
            }
        }
        
        /**
         * Gets (as xml) the "EmergencyCareDischargeInformationGiven_SnomedCt" element
         */
        public uk.nhs.nhsia.datastandards.ecds.N618ECType xgetEmergencyCareDischargeInformationGivenSnomedCt()
        {
            synchronized (monitor())
            {
                check_orphaned();
                uk.nhs.nhsia.datastandards.ecds.N618ECType target = null;
                target = (uk.nhs.nhsia.datastandards.ecds.N618ECType)get_store().find_element_user(EMERGENCYCAREDISCHARGEINFORMATIONGIVENSNOMEDCT$24, 0);
                return target;
            }
        }
        
        /**
         * True if has "EmergencyCareDischargeInformationGiven_SnomedCt" element
         */
        public boolean isSetEmergencyCareDischargeInformationGivenSnomedCt()
        {
            synchronized (monitor())
            {
                check_orphaned();
                return get_store().count_elements(EMERGENCYCAREDISCHARGEINFORMATIONGIVENSNOMEDCT$24) != 0;
            }
        }
        
        /**
         * Sets the "EmergencyCareDischargeInformationGiven_SnomedCt" element
         */
        public void setEmergencyCareDischargeInformationGivenSnomedCt(java.lang.String emergencyCareDischargeInformationGivenSnomedCt)
        {
            synchronized (monitor())
            {
                check_orphaned();
                org.apache.xmlbeans.SimpleValue target = null;
                target = (org.apache.xmlbeans.SimpleValue)get_store().find_element_user(EMERGENCYCAREDISCHARGEINFORMATIONGIVENSNOMEDCT$24, 0);
                if (target == null)
                {
                    target = (org.apache.xmlbeans.SimpleValue)get_store().add_element_user(EMERGENCYCAREDISCHARGEINFORMATIONGIVENSNOMEDCT$24);
                }
                target.setStringValue(emergencyCareDischargeInformationGivenSnomedCt);
            }
        }
        
        /**
         * Sets (as xml) the "EmergencyCareDischargeInformationGiven_SnomedCt" element
         */
        public void xsetEmergencyCareDischargeInformationGivenSnomedCt(uk.nhs.nhsia.datastandards.ecds.N618ECType emergencyCareDischargeInformationGivenSnomedCt)
        {
            synchronized (monitor())
            {
                check_orphaned();
                uk.nhs.nhsia.datastandards.ecds.N618ECType target = null;
                target = (uk.nhs.nhsia.datastandards.ecds.N618ECType)get_store().find_element_user(EMERGENCYCAREDISCHARGEINFORMATIONGIVENSNOMEDCT$24, 0);
                if (target == null)
                {
                    target = (uk.nhs.nhsia.datastandards.ecds.N618ECType)get_store().add_element_user(EMERGENCYCAREDISCHARGEINFORMATIONGIVENSNOMEDCT$24);
                }
                target.set(emergencyCareDischargeInformationGivenSnomedCt);
            }
        }
        
        /**
         * Unsets the "EmergencyCareDischargeInformationGiven_SnomedCt" element
         */
        public void unsetEmergencyCareDischargeInformationGivenSnomedCt()
        {
            synchronized (monitor())
            {
                check_orphaned();
                get_store().remove_element(EMERGENCYCAREDISCHARGEINFORMATIONGIVENSNOMEDCT$24, 0);
            }
        }
        /**
         * An XML ActivityTreatmentFunctionCode_DecisionToAdmit(@http://www.nhsia.nhs.uk/DataStandards/XMLschema/CDS/ns).
         *
         * This is an atomic type that is a restriction of uk.nhs.nhsia.datastandards.ecds.AttendanceOccurrenceECStructure$DischargeFromEmergencyCare$ActivityTreatmentFunctionCodeDecisionToAdmit.
         */
        public static class ActivityTreatmentFunctionCodeDecisionToAdmitImpl extends org.apache.xmlbeans.impl.values.JavaStringHolderEx implements uk.nhs.nhsia.datastandards.ecds.AttendanceOccurrenceECStructure.DischargeFromEmergencyCare.ActivityTreatmentFunctionCodeDecisionToAdmit
        {
            private static final long serialVersionUID = 1L;
            
            public ActivityTreatmentFunctionCodeDecisionToAdmitImpl(org.apache.xmlbeans.SchemaType sType)
            {
                super(sType, false);
            }
            
            protected ActivityTreatmentFunctionCodeDecisionToAdmitImpl(org.apache.xmlbeans.SchemaType sType, boolean b)
            {
                super(sType, b);
            }
        }
    }
    /**
     * An XML ResearchAndDiseaseOutbreakNotification(@http://www.nhsia.nhs.uk/DataStandards/XMLschema/CDS/ns).
     *
     * This is a complex type.
     */
    public static class ResearchAndDiseaseOutbreakNotificationImpl extends org.apache.xmlbeans.impl.values.XmlComplexContentImpl implements uk.nhs.nhsia.datastandards.ecds.AttendanceOccurrenceECStructure.ResearchAndDiseaseOutbreakNotification
    {
        private static final long serialVersionUID = 1L;
        
        public ResearchAndDiseaseOutbreakNotificationImpl(org.apache.xmlbeans.SchemaType sType)
        {
            super(sType);
        }
        
        private static final javax.xml.namespace.QName CLINICALTRIALIDENTIFIER$0 = 
            new javax.xml.namespace.QName("http://www.nhsia.nhs.uk/DataStandards/XMLschema/CDS/ns", "ClinicalTrialIdentifier");
        private static final javax.xml.namespace.QName DISEASEOUTBREAKNOTIFICATION$2 = 
            new javax.xml.namespace.QName("http://www.nhsia.nhs.uk/DataStandards/XMLschema/CDS/ns", "DiseaseOutbreakNotification");
        
        
        /**
         * Gets the "ClinicalTrialIdentifier" element
         */
        public java.lang.String getClinicalTrialIdentifier()
        {
            synchronized (monitor())
            {
                check_orphaned();
                org.apache.xmlbeans.SimpleValue target = null;
                target = (org.apache.xmlbeans.SimpleValue)get_store().find_element_user(CLINICALTRIALIDENTIFIER$0, 0);
                if (target == null)
                {
                    return null;
                }
                return target.getStringValue();
            }
        }
        
        /**
         * Gets (as xml) the "ClinicalTrialIdentifier" element
         */
        public uk.nhs.nhsia.datastandards.ecds.ANMax20ECType xgetClinicalTrialIdentifier()
        {
            synchronized (monitor())
            {
                check_orphaned();
                uk.nhs.nhsia.datastandards.ecds.ANMax20ECType target = null;
                target = (uk.nhs.nhsia.datastandards.ecds.ANMax20ECType)get_store().find_element_user(CLINICALTRIALIDENTIFIER$0, 0);
                return target;
            }
        }
        
        /**
         * True if has "ClinicalTrialIdentifier" element
         */
        public boolean isSetClinicalTrialIdentifier()
        {
            synchronized (monitor())
            {
                check_orphaned();
                return get_store().count_elements(CLINICALTRIALIDENTIFIER$0) != 0;
            }
        }
        
        /**
         * Sets the "ClinicalTrialIdentifier" element
         */
        public void setClinicalTrialIdentifier(java.lang.String clinicalTrialIdentifier)
        {
            synchronized (monitor())
            {
                check_orphaned();
                org.apache.xmlbeans.SimpleValue target = null;
                target = (org.apache.xmlbeans.SimpleValue)get_store().find_element_user(CLINICALTRIALIDENTIFIER$0, 0);
                if (target == null)
                {
                    target = (org.apache.xmlbeans.SimpleValue)get_store().add_element_user(CLINICALTRIALIDENTIFIER$0);
                }
                target.setStringValue(clinicalTrialIdentifier);
            }
        }
        
        /**
         * Sets (as xml) the "ClinicalTrialIdentifier" element
         */
        public void xsetClinicalTrialIdentifier(uk.nhs.nhsia.datastandards.ecds.ANMax20ECType clinicalTrialIdentifier)
        {
            synchronized (monitor())
            {
                check_orphaned();
                uk.nhs.nhsia.datastandards.ecds.ANMax20ECType target = null;
                target = (uk.nhs.nhsia.datastandards.ecds.ANMax20ECType)get_store().find_element_user(CLINICALTRIALIDENTIFIER$0, 0);
                if (target == null)
                {
                    target = (uk.nhs.nhsia.datastandards.ecds.ANMax20ECType)get_store().add_element_user(CLINICALTRIALIDENTIFIER$0);
                }
                target.set(clinicalTrialIdentifier);
            }
        }
        
        /**
         * Unsets the "ClinicalTrialIdentifier" element
         */
        public void unsetClinicalTrialIdentifier()
        {
            synchronized (monitor())
            {
                check_orphaned();
                get_store().remove_element(CLINICALTRIALIDENTIFIER$0, 0);
            }
        }
        
        /**
         * Gets the "DiseaseOutbreakNotification" element
         */
        public java.lang.String getDiseaseOutbreakNotification()
        {
            synchronized (monitor())
            {
                check_orphaned();
                org.apache.xmlbeans.SimpleValue target = null;
                target = (org.apache.xmlbeans.SimpleValue)get_store().find_element_user(DISEASEOUTBREAKNOTIFICATION$2, 0);
                if (target == null)
                {
                    return null;
                }
                return target.getStringValue();
            }
        }
        
        /**
         * Gets (as xml) the "DiseaseOutbreakNotification" element
         */
        public uk.nhs.nhsia.datastandards.ecds.ANMax20ECType xgetDiseaseOutbreakNotification()
        {
            synchronized (monitor())
            {
                check_orphaned();
                uk.nhs.nhsia.datastandards.ecds.ANMax20ECType target = null;
                target = (uk.nhs.nhsia.datastandards.ecds.ANMax20ECType)get_store().find_element_user(DISEASEOUTBREAKNOTIFICATION$2, 0);
                return target;
            }
        }
        
        /**
         * True if has "DiseaseOutbreakNotification" element
         */
        public boolean isSetDiseaseOutbreakNotification()
        {
            synchronized (monitor())
            {
                check_orphaned();
                return get_store().count_elements(DISEASEOUTBREAKNOTIFICATION$2) != 0;
            }
        }
        
        /**
         * Sets the "DiseaseOutbreakNotification" element
         */
        public void setDiseaseOutbreakNotification(java.lang.String diseaseOutbreakNotification)
        {
            synchronized (monitor())
            {
                check_orphaned();
                org.apache.xmlbeans.SimpleValue target = null;
                target = (org.apache.xmlbeans.SimpleValue)get_store().find_element_user(DISEASEOUTBREAKNOTIFICATION$2, 0);
                if (target == null)
                {
                    target = (org.apache.xmlbeans.SimpleValue)get_store().add_element_user(DISEASEOUTBREAKNOTIFICATION$2);
                }
                target.setStringValue(diseaseOutbreakNotification);
            }
        }
        
        /**
         * Sets (as xml) the "DiseaseOutbreakNotification" element
         */
        public void xsetDiseaseOutbreakNotification(uk.nhs.nhsia.datastandards.ecds.ANMax20ECType diseaseOutbreakNotification)
        {
            synchronized (monitor())
            {
                check_orphaned();
                uk.nhs.nhsia.datastandards.ecds.ANMax20ECType target = null;
                target = (uk.nhs.nhsia.datastandards.ecds.ANMax20ECType)get_store().find_element_user(DISEASEOUTBREAKNOTIFICATION$2, 0);
                if (target == null)
                {
                    target = (uk.nhs.nhsia.datastandards.ecds.ANMax20ECType)get_store().add_element_user(DISEASEOUTBREAKNOTIFICATION$2);
                }
                target.set(diseaseOutbreakNotification);
            }
        }
        
        /**
         * Unsets the "DiseaseOutbreakNotification" element
         */
        public void unsetDiseaseOutbreakNotification()
        {
            synchronized (monitor())
            {
                check_orphaned();
                get_store().remove_element(DISEASEOUTBREAKNOTIFICATION$2, 0);
            }
        }
    }
}
