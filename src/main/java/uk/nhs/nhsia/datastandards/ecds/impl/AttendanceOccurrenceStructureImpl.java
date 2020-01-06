/*
 * XML Type:  AttendanceOccurrence_Structure
 * Namespace: http://www.nhsia.nhs.uk/DataStandards/XMLschema/CDS/ns
 * Java type: uk.nhs.nhsia.datastandards.ecds.AttendanceOccurrenceStructure
 *
 * Automatically generated - do not modify.
 */
package uk.nhs.nhsia.datastandards.ecds.impl;
/**
 * An XML AttendanceOccurrence_Structure(@http://www.nhsia.nhs.uk/DataStandards/XMLschema/CDS/ns).
 *
 * This is a complex type.
 */
public class AttendanceOccurrenceStructureImpl extends org.apache.xmlbeans.impl.values.XmlComplexContentImpl implements uk.nhs.nhsia.datastandards.ecds.AttendanceOccurrenceStructure
{
    private static final long serialVersionUID = 1L;
    
    public AttendanceOccurrenceStructureImpl(org.apache.xmlbeans.SchemaType sType)
    {
        super(sType);
    }
    
    private static final javax.xml.namespace.QName ACTIVITYCHARACTERISTICS$0 = 
        new javax.xml.namespace.QName("http://www.nhsia.nhs.uk/DataStandards/XMLschema/CDS/ns", "ActivityCharacteristics");
    private static final javax.xml.namespace.QName SERVICEAGREEMENTDETAILS$2 = 
        new javax.xml.namespace.QName("http://www.nhsia.nhs.uk/DataStandards/XMLschema/CDS/ns", "ServiceAgreementDetails");
    private static final javax.xml.namespace.QName PERSONGROUPAANDECONSULTANT$4 = 
        new javax.xml.namespace.QName("http://www.nhsia.nhs.uk/DataStandards/XMLschema/CDS/ns", "PersonGroupAAndEConsultant");
    private static final javax.xml.namespace.QName CLINICALDIAGNOSISDETAILS$6 = 
        new javax.xml.namespace.QName("http://www.nhsia.nhs.uk/DataStandards/XMLschema/CDS/ns", "ClinicalDiagnosisDetails");
    private static final javax.xml.namespace.QName CLINICALINVESTIGATIONDETAILS$8 = 
        new javax.xml.namespace.QName("http://www.nhsia.nhs.uk/DataStandards/XMLschema/CDS/ns", "ClinicalInvestigationDetails");
    private static final javax.xml.namespace.QName CLINICALTREATMENTDETAILS$10 = 
        new javax.xml.namespace.QName("http://www.nhsia.nhs.uk/DataStandards/XMLschema/CDS/ns", "ClinicalTreatmentDetails");
    
    
    /**
     * Gets the "ActivityCharacteristics" element
     */
    public uk.nhs.nhsia.datastandards.ecds.AttendanceOccurrenceStructure.ActivityCharacteristics getActivityCharacteristics()
    {
        synchronized (monitor())
        {
            check_orphaned();
            uk.nhs.nhsia.datastandards.ecds.AttendanceOccurrenceStructure.ActivityCharacteristics target = null;
            target = (uk.nhs.nhsia.datastandards.ecds.AttendanceOccurrenceStructure.ActivityCharacteristics)get_store().find_element_user(ACTIVITYCHARACTERISTICS$0, 0);
            if (target == null)
            {
                return null;
            }
            return target;
        }
    }
    
    /**
     * Sets the "ActivityCharacteristics" element
     */
    public void setActivityCharacteristics(uk.nhs.nhsia.datastandards.ecds.AttendanceOccurrenceStructure.ActivityCharacteristics activityCharacteristics)
    {
        generatedSetterHelperImpl(activityCharacteristics, ACTIVITYCHARACTERISTICS$0, 0, org.apache.xmlbeans.impl.values.XmlObjectBase.KIND_SETTERHELPER_SINGLETON);
    }
    
    /**
     * Appends and returns a new empty "ActivityCharacteristics" element
     */
    public uk.nhs.nhsia.datastandards.ecds.AttendanceOccurrenceStructure.ActivityCharacteristics addNewActivityCharacteristics()
    {
        synchronized (monitor())
        {
            check_orphaned();
            uk.nhs.nhsia.datastandards.ecds.AttendanceOccurrenceStructure.ActivityCharacteristics target = null;
            target = (uk.nhs.nhsia.datastandards.ecds.AttendanceOccurrenceStructure.ActivityCharacteristics)get_store().add_element_user(ACTIVITYCHARACTERISTICS$0);
            return target;
        }
    }
    
    /**
     * Gets the "ServiceAgreementDetails" element
     */
    public uk.nhs.nhsia.datastandards.ecds.ServiceAgreementDetailsStructure getServiceAgreementDetails()
    {
        synchronized (monitor())
        {
            check_orphaned();
            uk.nhs.nhsia.datastandards.ecds.ServiceAgreementDetailsStructure target = null;
            target = (uk.nhs.nhsia.datastandards.ecds.ServiceAgreementDetailsStructure)get_store().find_element_user(SERVICEAGREEMENTDETAILS$2, 0);
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
    public void setServiceAgreementDetails(uk.nhs.nhsia.datastandards.ecds.ServiceAgreementDetailsStructure serviceAgreementDetails)
    {
        generatedSetterHelperImpl(serviceAgreementDetails, SERVICEAGREEMENTDETAILS$2, 0, org.apache.xmlbeans.impl.values.XmlObjectBase.KIND_SETTERHELPER_SINGLETON);
    }
    
    /**
     * Appends and returns a new empty "ServiceAgreementDetails" element
     */
    public uk.nhs.nhsia.datastandards.ecds.ServiceAgreementDetailsStructure addNewServiceAgreementDetails()
    {
        synchronized (monitor())
        {
            check_orphaned();
            uk.nhs.nhsia.datastandards.ecds.ServiceAgreementDetailsStructure target = null;
            target = (uk.nhs.nhsia.datastandards.ecds.ServiceAgreementDetailsStructure)get_store().add_element_user(SERVICEAGREEMENTDETAILS$2);
            return target;
        }
    }
    
    /**
     * Gets the "PersonGroupAAndEConsultant" element
     */
    public uk.nhs.nhsia.datastandards.ecds.PersonGroupAAndEConsultantStructure getPersonGroupAAndEConsultant()
    {
        synchronized (monitor())
        {
            check_orphaned();
            uk.nhs.nhsia.datastandards.ecds.PersonGroupAAndEConsultantStructure target = null;
            target = (uk.nhs.nhsia.datastandards.ecds.PersonGroupAAndEConsultantStructure)get_store().find_element_user(PERSONGROUPAANDECONSULTANT$4, 0);
            if (target == null)
            {
                return null;
            }
            return target;
        }
    }
    
    /**
     * True if has "PersonGroupAAndEConsultant" element
     */
    public boolean isSetPersonGroupAAndEConsultant()
    {
        synchronized (monitor())
        {
            check_orphaned();
            return get_store().count_elements(PERSONGROUPAANDECONSULTANT$4) != 0;
        }
    }
    
    /**
     * Sets the "PersonGroupAAndEConsultant" element
     */
    public void setPersonGroupAAndEConsultant(uk.nhs.nhsia.datastandards.ecds.PersonGroupAAndEConsultantStructure personGroupAAndEConsultant)
    {
        generatedSetterHelperImpl(personGroupAAndEConsultant, PERSONGROUPAANDECONSULTANT$4, 0, org.apache.xmlbeans.impl.values.XmlObjectBase.KIND_SETTERHELPER_SINGLETON);
    }
    
    /**
     * Appends and returns a new empty "PersonGroupAAndEConsultant" element
     */
    public uk.nhs.nhsia.datastandards.ecds.PersonGroupAAndEConsultantStructure addNewPersonGroupAAndEConsultant()
    {
        synchronized (monitor())
        {
            check_orphaned();
            uk.nhs.nhsia.datastandards.ecds.PersonGroupAAndEConsultantStructure target = null;
            target = (uk.nhs.nhsia.datastandards.ecds.PersonGroupAAndEConsultantStructure)get_store().add_element_user(PERSONGROUPAANDECONSULTANT$4);
            return target;
        }
    }
    
    /**
     * Unsets the "PersonGroupAAndEConsultant" element
     */
    public void unsetPersonGroupAAndEConsultant()
    {
        synchronized (monitor())
        {
            check_orphaned();
            get_store().remove_element(PERSONGROUPAANDECONSULTANT$4, 0);
        }
    }
    
    /**
     * Gets the "ClinicalDiagnosisDetails" element
     */
    public uk.nhs.nhsia.datastandards.ecds.ClinicalDiagnosisAEStructure getClinicalDiagnosisDetails()
    {
        synchronized (monitor())
        {
            check_orphaned();
            uk.nhs.nhsia.datastandards.ecds.ClinicalDiagnosisAEStructure target = null;
            target = (uk.nhs.nhsia.datastandards.ecds.ClinicalDiagnosisAEStructure)get_store().find_element_user(CLINICALDIAGNOSISDETAILS$6, 0);
            if (target == null)
            {
                return null;
            }
            return target;
        }
    }
    
    /**
     * True if has "ClinicalDiagnosisDetails" element
     */
    public boolean isSetClinicalDiagnosisDetails()
    {
        synchronized (monitor())
        {
            check_orphaned();
            return get_store().count_elements(CLINICALDIAGNOSISDETAILS$6) != 0;
        }
    }
    
    /**
     * Sets the "ClinicalDiagnosisDetails" element
     */
    public void setClinicalDiagnosisDetails(uk.nhs.nhsia.datastandards.ecds.ClinicalDiagnosisAEStructure clinicalDiagnosisDetails)
    {
        generatedSetterHelperImpl(clinicalDiagnosisDetails, CLINICALDIAGNOSISDETAILS$6, 0, org.apache.xmlbeans.impl.values.XmlObjectBase.KIND_SETTERHELPER_SINGLETON);
    }
    
    /**
     * Appends and returns a new empty "ClinicalDiagnosisDetails" element
     */
    public uk.nhs.nhsia.datastandards.ecds.ClinicalDiagnosisAEStructure addNewClinicalDiagnosisDetails()
    {
        synchronized (monitor())
        {
            check_orphaned();
            uk.nhs.nhsia.datastandards.ecds.ClinicalDiagnosisAEStructure target = null;
            target = (uk.nhs.nhsia.datastandards.ecds.ClinicalDiagnosisAEStructure)get_store().add_element_user(CLINICALDIAGNOSISDETAILS$6);
            return target;
        }
    }
    
    /**
     * Unsets the "ClinicalDiagnosisDetails" element
     */
    public void unsetClinicalDiagnosisDetails()
    {
        synchronized (monitor())
        {
            check_orphaned();
            get_store().remove_element(CLINICALDIAGNOSISDETAILS$6, 0);
        }
    }
    
    /**
     * Gets the "ClinicalInvestigationDetails" element
     */
    public uk.nhs.nhsia.datastandards.ecds.ClinicalInvestigationStructure getClinicalInvestigationDetails()
    {
        synchronized (monitor())
        {
            check_orphaned();
            uk.nhs.nhsia.datastandards.ecds.ClinicalInvestigationStructure target = null;
            target = (uk.nhs.nhsia.datastandards.ecds.ClinicalInvestigationStructure)get_store().find_element_user(CLINICALINVESTIGATIONDETAILS$8, 0);
            if (target == null)
            {
                return null;
            }
            return target;
        }
    }
    
    /**
     * True if has "ClinicalInvestigationDetails" element
     */
    public boolean isSetClinicalInvestigationDetails()
    {
        synchronized (monitor())
        {
            check_orphaned();
            return get_store().count_elements(CLINICALINVESTIGATIONDETAILS$8) != 0;
        }
    }
    
    /**
     * Sets the "ClinicalInvestigationDetails" element
     */
    public void setClinicalInvestigationDetails(uk.nhs.nhsia.datastandards.ecds.ClinicalInvestigationStructure clinicalInvestigationDetails)
    {
        generatedSetterHelperImpl(clinicalInvestigationDetails, CLINICALINVESTIGATIONDETAILS$8, 0, org.apache.xmlbeans.impl.values.XmlObjectBase.KIND_SETTERHELPER_SINGLETON);
    }
    
    /**
     * Appends and returns a new empty "ClinicalInvestigationDetails" element
     */
    public uk.nhs.nhsia.datastandards.ecds.ClinicalInvestigationStructure addNewClinicalInvestigationDetails()
    {
        synchronized (monitor())
        {
            check_orphaned();
            uk.nhs.nhsia.datastandards.ecds.ClinicalInvestigationStructure target = null;
            target = (uk.nhs.nhsia.datastandards.ecds.ClinicalInvestigationStructure)get_store().add_element_user(CLINICALINVESTIGATIONDETAILS$8);
            return target;
        }
    }
    
    /**
     * Unsets the "ClinicalInvestigationDetails" element
     */
    public void unsetClinicalInvestigationDetails()
    {
        synchronized (monitor())
        {
            check_orphaned();
            get_store().remove_element(CLINICALINVESTIGATIONDETAILS$8, 0);
        }
    }
    
    /**
     * Gets the "ClinicalTreatmentDetails" element
     */
    public uk.nhs.nhsia.datastandards.ecds.ClinicalActivityAEStructure getClinicalTreatmentDetails()
    {
        synchronized (monitor())
        {
            check_orphaned();
            uk.nhs.nhsia.datastandards.ecds.ClinicalActivityAEStructure target = null;
            target = (uk.nhs.nhsia.datastandards.ecds.ClinicalActivityAEStructure)get_store().find_element_user(CLINICALTREATMENTDETAILS$10, 0);
            if (target == null)
            {
                return null;
            }
            return target;
        }
    }
    
    /**
     * True if has "ClinicalTreatmentDetails" element
     */
    public boolean isSetClinicalTreatmentDetails()
    {
        synchronized (monitor())
        {
            check_orphaned();
            return get_store().count_elements(CLINICALTREATMENTDETAILS$10) != 0;
        }
    }
    
    /**
     * Sets the "ClinicalTreatmentDetails" element
     */
    public void setClinicalTreatmentDetails(uk.nhs.nhsia.datastandards.ecds.ClinicalActivityAEStructure clinicalTreatmentDetails)
    {
        generatedSetterHelperImpl(clinicalTreatmentDetails, CLINICALTREATMENTDETAILS$10, 0, org.apache.xmlbeans.impl.values.XmlObjectBase.KIND_SETTERHELPER_SINGLETON);
    }
    
    /**
     * Appends and returns a new empty "ClinicalTreatmentDetails" element
     */
    public uk.nhs.nhsia.datastandards.ecds.ClinicalActivityAEStructure addNewClinicalTreatmentDetails()
    {
        synchronized (monitor())
        {
            check_orphaned();
            uk.nhs.nhsia.datastandards.ecds.ClinicalActivityAEStructure target = null;
            target = (uk.nhs.nhsia.datastandards.ecds.ClinicalActivityAEStructure)get_store().add_element_user(CLINICALTREATMENTDETAILS$10);
            return target;
        }
    }
    
    /**
     * Unsets the "ClinicalTreatmentDetails" element
     */
    public void unsetClinicalTreatmentDetails()
    {
        synchronized (monitor())
        {
            check_orphaned();
            get_store().remove_element(CLINICALTREATMENTDETAILS$10, 0);
        }
    }
    /**
     * An XML ActivityCharacteristics(@http://www.nhsia.nhs.uk/DataStandards/XMLschema/CDS/ns).
     *
     * This is a complex type.
     */
    public static class ActivityCharacteristicsImpl extends org.apache.xmlbeans.impl.values.XmlComplexContentImpl implements uk.nhs.nhsia.datastandards.ecds.AttendanceOccurrenceStructure.ActivityCharacteristics
    {
        private static final long serialVersionUID = 1L;
        
        public ActivityCharacteristicsImpl(org.apache.xmlbeans.SchemaType sType)
        {
            super(sType);
        }
        
        private static final javax.xml.namespace.QName AANDEATTENDANCENUMBER$0 = 
            new javax.xml.namespace.QName("http://www.nhsia.nhs.uk/DataStandards/XMLschema/CDS/ns", "AAndEAttendanceNumber");
        private static final javax.xml.namespace.QName AANDEARRIVALMODECODE$2 = 
            new javax.xml.namespace.QName("http://www.nhsia.nhs.uk/DataStandards/XMLschema/CDS/ns", "AAndEArrivalModeCode");
        private static final javax.xml.namespace.QName AANDEATTENDANCECATEGORYCODE$4 = 
            new javax.xml.namespace.QName("http://www.nhsia.nhs.uk/DataStandards/XMLschema/CDS/ns", "AAndEAttendanceCategoryCode");
        private static final javax.xml.namespace.QName AANDEATTENDANCEDISPOSALCODE$6 = 
            new javax.xml.namespace.QName("http://www.nhsia.nhs.uk/DataStandards/XMLschema/CDS/ns", "AAndEAttendanceDisposalCode");
        private static final javax.xml.namespace.QName AANDEINCIDENTLOCATIONTYPE$8 = 
            new javax.xml.namespace.QName("http://www.nhsia.nhs.uk/DataStandards/XMLschema/CDS/ns", "AAndEIncidentLocationType");
        private static final javax.xml.namespace.QName AANDEPATIENTGROUP$10 = 
            new javax.xml.namespace.QName("http://www.nhsia.nhs.uk/DataStandards/XMLschema/CDS/ns", "AAndEPatientGroup");
        private static final javax.xml.namespace.QName SOURCEOFREFERRALFORAANDE$12 = 
            new javax.xml.namespace.QName("http://www.nhsia.nhs.uk/DataStandards/XMLschema/CDS/ns", "SourceOfReferralForAAndE");
        private static final javax.xml.namespace.QName AANDEDEPARTMENTTYPE$14 = 
            new javax.xml.namespace.QName("http://www.nhsia.nhs.uk/DataStandards/XMLschema/CDS/ns", "AAndEDepartmentType");
        private static final javax.xml.namespace.QName ARRIVALDATE$16 = 
            new javax.xml.namespace.QName("http://www.nhsia.nhs.uk/DataStandards/XMLschema/CDS/ns", "ArrivalDate");
        private static final javax.xml.namespace.QName ARRIVALTIMEATAANDE$18 = 
            new javax.xml.namespace.QName("http://www.nhsia.nhs.uk/DataStandards/XMLschema/CDS/ns", "ArrivalTimeAtAAndE");
        private static final javax.xml.namespace.QName AGEATCDSACTIVITYDATE$20 = 
            new javax.xml.namespace.QName("http://www.nhsia.nhs.uk/DataStandards/XMLschema/CDS/ns", "AgeAtCDSActivityDate");
        private static final javax.xml.namespace.QName OVERSEASVISITORSTATUSCLASSIFICATIONATCDSACTIVITYDATE$22 = 
            new javax.xml.namespace.QName("http://www.nhsia.nhs.uk/DataStandards/XMLschema/CDS/ns", "OverseasVisitorStatusClassificationAtCDSActivityDate");
        private static final javax.xml.namespace.QName AANDEINITIALASSESSMENTDATE$24 = 
            new javax.xml.namespace.QName("http://www.nhsia.nhs.uk/DataStandards/XMLschema/CDS/ns", "AAndEInitialAssessmentDate");
        private static final javax.xml.namespace.QName AANDEINITIALASSESSMENTTIME$26 = 
            new javax.xml.namespace.QName("http://www.nhsia.nhs.uk/DataStandards/XMLschema/CDS/ns", "AAndEInitialAssessmentTime");
        private static final javax.xml.namespace.QName AANDEDATESEENFORTREATMENT$28 = 
            new javax.xml.namespace.QName("http://www.nhsia.nhs.uk/DataStandards/XMLschema/CDS/ns", "AAndEDateSeenForTreatment");
        private static final javax.xml.namespace.QName AANDETIMESEENFORTREATMENT$30 = 
            new javax.xml.namespace.QName("http://www.nhsia.nhs.uk/DataStandards/XMLschema/CDS/ns", "AAndETimeSeenForTreatment");
        private static final javax.xml.namespace.QName AANDEATTENDANCECONCLUSIONDATE$32 = 
            new javax.xml.namespace.QName("http://www.nhsia.nhs.uk/DataStandards/XMLschema/CDS/ns", "AAndEAttendanceConclusionDate");
        private static final javax.xml.namespace.QName AANDEATTENDANCECONCLUSIONTIME$34 = 
            new javax.xml.namespace.QName("http://www.nhsia.nhs.uk/DataStandards/XMLschema/CDS/ns", "AAndEAttendanceConclusionTime");
        private static final javax.xml.namespace.QName AANDEDEPARTUREDATE$36 = 
            new javax.xml.namespace.QName("http://www.nhsia.nhs.uk/DataStandards/XMLschema/CDS/ns", "AAndEDepartureDate");
        private static final javax.xml.namespace.QName AANDEDEPARTURETIME$38 = 
            new javax.xml.namespace.QName("http://www.nhsia.nhs.uk/DataStandards/XMLschema/CDS/ns", "AAndEDepartureTime");
        private static final javax.xml.namespace.QName AMBULANCEINCIDENTNUMBER$40 = 
            new javax.xml.namespace.QName("http://www.nhsia.nhs.uk/DataStandards/XMLschema/CDS/ns", "AmbulanceIncidentNumber");
        private static final javax.xml.namespace.QName ORGANISATIONCODECONVEYINGAMBULANCETRUST$42 = 
            new javax.xml.namespace.QName("http://www.nhsia.nhs.uk/DataStandards/XMLschema/CDS/ns", "OrganisationCodeConveyingAmbulanceTrust");
        
        
        /**
         * Gets the "AAndEAttendanceNumber" element
         */
        public java.lang.String getAAndEAttendanceNumber()
        {
            synchronized (monitor())
            {
                check_orphaned();
                org.apache.xmlbeans.SimpleValue target = null;
                target = (org.apache.xmlbeans.SimpleValue)get_store().find_element_user(AANDEATTENDANCENUMBER$0, 0);
                if (target == null)
                {
                    return null;
                }
                return target.getStringValue();
            }
        }
        
        /**
         * Gets (as xml) the "AAndEAttendanceNumber" element
         */
        public uk.nhs.nhsia.datastandards.ecds.AAndEAttendanceNumberType xgetAAndEAttendanceNumber()
        {
            synchronized (monitor())
            {
                check_orphaned();
                uk.nhs.nhsia.datastandards.ecds.AAndEAttendanceNumberType target = null;
                target = (uk.nhs.nhsia.datastandards.ecds.AAndEAttendanceNumberType)get_store().find_element_user(AANDEATTENDANCENUMBER$0, 0);
                return target;
            }
        }
        
        /**
         * True if has "AAndEAttendanceNumber" element
         */
        public boolean isSetAAndEAttendanceNumber()
        {
            synchronized (monitor())
            {
                check_orphaned();
                return get_store().count_elements(AANDEATTENDANCENUMBER$0) != 0;
            }
        }
        
        /**
         * Sets the "AAndEAttendanceNumber" element
         */
        public void setAAndEAttendanceNumber(java.lang.String aAndEAttendanceNumber)
        {
            synchronized (monitor())
            {
                check_orphaned();
                org.apache.xmlbeans.SimpleValue target = null;
                target = (org.apache.xmlbeans.SimpleValue)get_store().find_element_user(AANDEATTENDANCENUMBER$0, 0);
                if (target == null)
                {
                    target = (org.apache.xmlbeans.SimpleValue)get_store().add_element_user(AANDEATTENDANCENUMBER$0);
                }
                target.setStringValue(aAndEAttendanceNumber);
            }
        }
        
        /**
         * Sets (as xml) the "AAndEAttendanceNumber" element
         */
        public void xsetAAndEAttendanceNumber(uk.nhs.nhsia.datastandards.ecds.AAndEAttendanceNumberType aAndEAttendanceNumber)
        {
            synchronized (monitor())
            {
                check_orphaned();
                uk.nhs.nhsia.datastandards.ecds.AAndEAttendanceNumberType target = null;
                target = (uk.nhs.nhsia.datastandards.ecds.AAndEAttendanceNumberType)get_store().find_element_user(AANDEATTENDANCENUMBER$0, 0);
                if (target == null)
                {
                    target = (uk.nhs.nhsia.datastandards.ecds.AAndEAttendanceNumberType)get_store().add_element_user(AANDEATTENDANCENUMBER$0);
                }
                target.set(aAndEAttendanceNumber);
            }
        }
        
        /**
         * Unsets the "AAndEAttendanceNumber" element
         */
        public void unsetAAndEAttendanceNumber()
        {
            synchronized (monitor())
            {
                check_orphaned();
                get_store().remove_element(AANDEATTENDANCENUMBER$0, 0);
            }
        }
        
        /**
         * Gets the "AAndEArrivalModeCode" element
         */
        public uk.nhs.nhsia.datastandards.ecds.AAndEArrivalModeCodeType.Enum getAAndEArrivalModeCode()
        {
            synchronized (monitor())
            {
                check_orphaned();
                org.apache.xmlbeans.SimpleValue target = null;
                target = (org.apache.xmlbeans.SimpleValue)get_store().find_element_user(AANDEARRIVALMODECODE$2, 0);
                if (target == null)
                {
                    return null;
                }
                return (uk.nhs.nhsia.datastandards.ecds.AAndEArrivalModeCodeType.Enum)target.getEnumValue();
            }
        }
        
        /**
         * Gets (as xml) the "AAndEArrivalModeCode" element
         */
        public uk.nhs.nhsia.datastandards.ecds.AAndEArrivalModeCodeType xgetAAndEArrivalModeCode()
        {
            synchronized (monitor())
            {
                check_orphaned();
                uk.nhs.nhsia.datastandards.ecds.AAndEArrivalModeCodeType target = null;
                target = (uk.nhs.nhsia.datastandards.ecds.AAndEArrivalModeCodeType)get_store().find_element_user(AANDEARRIVALMODECODE$2, 0);
                return target;
            }
        }
        
        /**
         * True if has "AAndEArrivalModeCode" element
         */
        public boolean isSetAAndEArrivalModeCode()
        {
            synchronized (monitor())
            {
                check_orphaned();
                return get_store().count_elements(AANDEARRIVALMODECODE$2) != 0;
            }
        }
        
        /**
         * Sets the "AAndEArrivalModeCode" element
         */
        public void setAAndEArrivalModeCode(uk.nhs.nhsia.datastandards.ecds.AAndEArrivalModeCodeType.Enum aAndEArrivalModeCode)
        {
            synchronized (monitor())
            {
                check_orphaned();
                org.apache.xmlbeans.SimpleValue target = null;
                target = (org.apache.xmlbeans.SimpleValue)get_store().find_element_user(AANDEARRIVALMODECODE$2, 0);
                if (target == null)
                {
                    target = (org.apache.xmlbeans.SimpleValue)get_store().add_element_user(AANDEARRIVALMODECODE$2);
                }
                target.setEnumValue(aAndEArrivalModeCode);
            }
        }
        
        /**
         * Sets (as xml) the "AAndEArrivalModeCode" element
         */
        public void xsetAAndEArrivalModeCode(uk.nhs.nhsia.datastandards.ecds.AAndEArrivalModeCodeType aAndEArrivalModeCode)
        {
            synchronized (monitor())
            {
                check_orphaned();
                uk.nhs.nhsia.datastandards.ecds.AAndEArrivalModeCodeType target = null;
                target = (uk.nhs.nhsia.datastandards.ecds.AAndEArrivalModeCodeType)get_store().find_element_user(AANDEARRIVALMODECODE$2, 0);
                if (target == null)
                {
                    target = (uk.nhs.nhsia.datastandards.ecds.AAndEArrivalModeCodeType)get_store().add_element_user(AANDEARRIVALMODECODE$2);
                }
                target.set(aAndEArrivalModeCode);
            }
        }
        
        /**
         * Unsets the "AAndEArrivalModeCode" element
         */
        public void unsetAAndEArrivalModeCode()
        {
            synchronized (monitor())
            {
                check_orphaned();
                get_store().remove_element(AANDEARRIVALMODECODE$2, 0);
            }
        }
        
        /**
         * Gets the "AAndEAttendanceCategoryCode" element
         */
        public uk.nhs.nhsia.datastandards.ecds.AAndEAttendanceCategoryCodeType.Enum getAAndEAttendanceCategoryCode()
        {
            synchronized (monitor())
            {
                check_orphaned();
                org.apache.xmlbeans.SimpleValue target = null;
                target = (org.apache.xmlbeans.SimpleValue)get_store().find_element_user(AANDEATTENDANCECATEGORYCODE$4, 0);
                if (target == null)
                {
                    return null;
                }
                return (uk.nhs.nhsia.datastandards.ecds.AAndEAttendanceCategoryCodeType.Enum)target.getEnumValue();
            }
        }
        
        /**
         * Gets (as xml) the "AAndEAttendanceCategoryCode" element
         */
        public uk.nhs.nhsia.datastandards.ecds.AAndEAttendanceCategoryCodeType xgetAAndEAttendanceCategoryCode()
        {
            synchronized (monitor())
            {
                check_orphaned();
                uk.nhs.nhsia.datastandards.ecds.AAndEAttendanceCategoryCodeType target = null;
                target = (uk.nhs.nhsia.datastandards.ecds.AAndEAttendanceCategoryCodeType)get_store().find_element_user(AANDEATTENDANCECATEGORYCODE$4, 0);
                return target;
            }
        }
        
        /**
         * True if has "AAndEAttendanceCategoryCode" element
         */
        public boolean isSetAAndEAttendanceCategoryCode()
        {
            synchronized (monitor())
            {
                check_orphaned();
                return get_store().count_elements(AANDEATTENDANCECATEGORYCODE$4) != 0;
            }
        }
        
        /**
         * Sets the "AAndEAttendanceCategoryCode" element
         */
        public void setAAndEAttendanceCategoryCode(uk.nhs.nhsia.datastandards.ecds.AAndEAttendanceCategoryCodeType.Enum aAndEAttendanceCategoryCode)
        {
            synchronized (monitor())
            {
                check_orphaned();
                org.apache.xmlbeans.SimpleValue target = null;
                target = (org.apache.xmlbeans.SimpleValue)get_store().find_element_user(AANDEATTENDANCECATEGORYCODE$4, 0);
                if (target == null)
                {
                    target = (org.apache.xmlbeans.SimpleValue)get_store().add_element_user(AANDEATTENDANCECATEGORYCODE$4);
                }
                target.setEnumValue(aAndEAttendanceCategoryCode);
            }
        }
        
        /**
         * Sets (as xml) the "AAndEAttendanceCategoryCode" element
         */
        public void xsetAAndEAttendanceCategoryCode(uk.nhs.nhsia.datastandards.ecds.AAndEAttendanceCategoryCodeType aAndEAttendanceCategoryCode)
        {
            synchronized (monitor())
            {
                check_orphaned();
                uk.nhs.nhsia.datastandards.ecds.AAndEAttendanceCategoryCodeType target = null;
                target = (uk.nhs.nhsia.datastandards.ecds.AAndEAttendanceCategoryCodeType)get_store().find_element_user(AANDEATTENDANCECATEGORYCODE$4, 0);
                if (target == null)
                {
                    target = (uk.nhs.nhsia.datastandards.ecds.AAndEAttendanceCategoryCodeType)get_store().add_element_user(AANDEATTENDANCECATEGORYCODE$4);
                }
                target.set(aAndEAttendanceCategoryCode);
            }
        }
        
        /**
         * Unsets the "AAndEAttendanceCategoryCode" element
         */
        public void unsetAAndEAttendanceCategoryCode()
        {
            synchronized (monitor())
            {
                check_orphaned();
                get_store().remove_element(AANDEATTENDANCECATEGORYCODE$4, 0);
            }
        }
        
        /**
         * Gets the "AAndEAttendanceDisposalCode" element
         */
        public uk.nhs.nhsia.datastandards.ecds.AAndEAttendanceDisposalCodeType.Enum getAAndEAttendanceDisposalCode()
        {
            synchronized (monitor())
            {
                check_orphaned();
                org.apache.xmlbeans.SimpleValue target = null;
                target = (org.apache.xmlbeans.SimpleValue)get_store().find_element_user(AANDEATTENDANCEDISPOSALCODE$6, 0);
                if (target == null)
                {
                    return null;
                }
                return (uk.nhs.nhsia.datastandards.ecds.AAndEAttendanceDisposalCodeType.Enum)target.getEnumValue();
            }
        }
        
        /**
         * Gets (as xml) the "AAndEAttendanceDisposalCode" element
         */
        public uk.nhs.nhsia.datastandards.ecds.AAndEAttendanceDisposalCodeType xgetAAndEAttendanceDisposalCode()
        {
            synchronized (monitor())
            {
                check_orphaned();
                uk.nhs.nhsia.datastandards.ecds.AAndEAttendanceDisposalCodeType target = null;
                target = (uk.nhs.nhsia.datastandards.ecds.AAndEAttendanceDisposalCodeType)get_store().find_element_user(AANDEATTENDANCEDISPOSALCODE$6, 0);
                return target;
            }
        }
        
        /**
         * True if has "AAndEAttendanceDisposalCode" element
         */
        public boolean isSetAAndEAttendanceDisposalCode()
        {
            synchronized (monitor())
            {
                check_orphaned();
                return get_store().count_elements(AANDEATTENDANCEDISPOSALCODE$6) != 0;
            }
        }
        
        /**
         * Sets the "AAndEAttendanceDisposalCode" element
         */
        public void setAAndEAttendanceDisposalCode(uk.nhs.nhsia.datastandards.ecds.AAndEAttendanceDisposalCodeType.Enum aAndEAttendanceDisposalCode)
        {
            synchronized (monitor())
            {
                check_orphaned();
                org.apache.xmlbeans.SimpleValue target = null;
                target = (org.apache.xmlbeans.SimpleValue)get_store().find_element_user(AANDEATTENDANCEDISPOSALCODE$6, 0);
                if (target == null)
                {
                    target = (org.apache.xmlbeans.SimpleValue)get_store().add_element_user(AANDEATTENDANCEDISPOSALCODE$6);
                }
                target.setEnumValue(aAndEAttendanceDisposalCode);
            }
        }
        
        /**
         * Sets (as xml) the "AAndEAttendanceDisposalCode" element
         */
        public void xsetAAndEAttendanceDisposalCode(uk.nhs.nhsia.datastandards.ecds.AAndEAttendanceDisposalCodeType aAndEAttendanceDisposalCode)
        {
            synchronized (monitor())
            {
                check_orphaned();
                uk.nhs.nhsia.datastandards.ecds.AAndEAttendanceDisposalCodeType target = null;
                target = (uk.nhs.nhsia.datastandards.ecds.AAndEAttendanceDisposalCodeType)get_store().find_element_user(AANDEATTENDANCEDISPOSALCODE$6, 0);
                if (target == null)
                {
                    target = (uk.nhs.nhsia.datastandards.ecds.AAndEAttendanceDisposalCodeType)get_store().add_element_user(AANDEATTENDANCEDISPOSALCODE$6);
                }
                target.set(aAndEAttendanceDisposalCode);
            }
        }
        
        /**
         * Unsets the "AAndEAttendanceDisposalCode" element
         */
        public void unsetAAndEAttendanceDisposalCode()
        {
            synchronized (monitor())
            {
                check_orphaned();
                get_store().remove_element(AANDEATTENDANCEDISPOSALCODE$6, 0);
            }
        }
        
        /**
         * Gets the "AAndEIncidentLocationType" element
         */
        public uk.nhs.nhsia.datastandards.ecds.AAndEIncidentLocationTypeType.Enum getAAndEIncidentLocationType()
        {
            synchronized (monitor())
            {
                check_orphaned();
                org.apache.xmlbeans.SimpleValue target = null;
                target = (org.apache.xmlbeans.SimpleValue)get_store().find_element_user(AANDEINCIDENTLOCATIONTYPE$8, 0);
                if (target == null)
                {
                    return null;
                }
                return (uk.nhs.nhsia.datastandards.ecds.AAndEIncidentLocationTypeType.Enum)target.getEnumValue();
            }
        }
        
        /**
         * Gets (as xml) the "AAndEIncidentLocationType" element
         */
        public uk.nhs.nhsia.datastandards.ecds.AAndEIncidentLocationTypeType xgetAAndEIncidentLocationType()
        {
            synchronized (monitor())
            {
                check_orphaned();
                uk.nhs.nhsia.datastandards.ecds.AAndEIncidentLocationTypeType target = null;
                target = (uk.nhs.nhsia.datastandards.ecds.AAndEIncidentLocationTypeType)get_store().find_element_user(AANDEINCIDENTLOCATIONTYPE$8, 0);
                return target;
            }
        }
        
        /**
         * True if has "AAndEIncidentLocationType" element
         */
        public boolean isSetAAndEIncidentLocationType()
        {
            synchronized (monitor())
            {
                check_orphaned();
                return get_store().count_elements(AANDEINCIDENTLOCATIONTYPE$8) != 0;
            }
        }
        
        /**
         * Sets the "AAndEIncidentLocationType" element
         */
        public void setAAndEIncidentLocationType(uk.nhs.nhsia.datastandards.ecds.AAndEIncidentLocationTypeType.Enum aAndEIncidentLocationType)
        {
            synchronized (monitor())
            {
                check_orphaned();
                org.apache.xmlbeans.SimpleValue target = null;
                target = (org.apache.xmlbeans.SimpleValue)get_store().find_element_user(AANDEINCIDENTLOCATIONTYPE$8, 0);
                if (target == null)
                {
                    target = (org.apache.xmlbeans.SimpleValue)get_store().add_element_user(AANDEINCIDENTLOCATIONTYPE$8);
                }
                target.setEnumValue(aAndEIncidentLocationType);
            }
        }
        
        /**
         * Sets (as xml) the "AAndEIncidentLocationType" element
         */
        public void xsetAAndEIncidentLocationType(uk.nhs.nhsia.datastandards.ecds.AAndEIncidentLocationTypeType aAndEIncidentLocationType)
        {
            synchronized (monitor())
            {
                check_orphaned();
                uk.nhs.nhsia.datastandards.ecds.AAndEIncidentLocationTypeType target = null;
                target = (uk.nhs.nhsia.datastandards.ecds.AAndEIncidentLocationTypeType)get_store().find_element_user(AANDEINCIDENTLOCATIONTYPE$8, 0);
                if (target == null)
                {
                    target = (uk.nhs.nhsia.datastandards.ecds.AAndEIncidentLocationTypeType)get_store().add_element_user(AANDEINCIDENTLOCATIONTYPE$8);
                }
                target.set(aAndEIncidentLocationType);
            }
        }
        
        /**
         * Unsets the "AAndEIncidentLocationType" element
         */
        public void unsetAAndEIncidentLocationType()
        {
            synchronized (monitor())
            {
                check_orphaned();
                get_store().remove_element(AANDEINCIDENTLOCATIONTYPE$8, 0);
            }
        }
        
        /**
         * Gets the "AAndEPatientGroup" element
         */
        public uk.nhs.nhsia.datastandards.ecds.AAndEPatientGroupType.Enum getAAndEPatientGroup()
        {
            synchronized (monitor())
            {
                check_orphaned();
                org.apache.xmlbeans.SimpleValue target = null;
                target = (org.apache.xmlbeans.SimpleValue)get_store().find_element_user(AANDEPATIENTGROUP$10, 0);
                if (target == null)
                {
                    return null;
                }
                return (uk.nhs.nhsia.datastandards.ecds.AAndEPatientGroupType.Enum)target.getEnumValue();
            }
        }
        
        /**
         * Gets (as xml) the "AAndEPatientGroup" element
         */
        public uk.nhs.nhsia.datastandards.ecds.AAndEPatientGroupType xgetAAndEPatientGroup()
        {
            synchronized (monitor())
            {
                check_orphaned();
                uk.nhs.nhsia.datastandards.ecds.AAndEPatientGroupType target = null;
                target = (uk.nhs.nhsia.datastandards.ecds.AAndEPatientGroupType)get_store().find_element_user(AANDEPATIENTGROUP$10, 0);
                return target;
            }
        }
        
        /**
         * True if has "AAndEPatientGroup" element
         */
        public boolean isSetAAndEPatientGroup()
        {
            synchronized (monitor())
            {
                check_orphaned();
                return get_store().count_elements(AANDEPATIENTGROUP$10) != 0;
            }
        }
        
        /**
         * Sets the "AAndEPatientGroup" element
         */
        public void setAAndEPatientGroup(uk.nhs.nhsia.datastandards.ecds.AAndEPatientGroupType.Enum aAndEPatientGroup)
        {
            synchronized (monitor())
            {
                check_orphaned();
                org.apache.xmlbeans.SimpleValue target = null;
                target = (org.apache.xmlbeans.SimpleValue)get_store().find_element_user(AANDEPATIENTGROUP$10, 0);
                if (target == null)
                {
                    target = (org.apache.xmlbeans.SimpleValue)get_store().add_element_user(AANDEPATIENTGROUP$10);
                }
                target.setEnumValue(aAndEPatientGroup);
            }
        }
        
        /**
         * Sets (as xml) the "AAndEPatientGroup" element
         */
        public void xsetAAndEPatientGroup(uk.nhs.nhsia.datastandards.ecds.AAndEPatientGroupType aAndEPatientGroup)
        {
            synchronized (monitor())
            {
                check_orphaned();
                uk.nhs.nhsia.datastandards.ecds.AAndEPatientGroupType target = null;
                target = (uk.nhs.nhsia.datastandards.ecds.AAndEPatientGroupType)get_store().find_element_user(AANDEPATIENTGROUP$10, 0);
                if (target == null)
                {
                    target = (uk.nhs.nhsia.datastandards.ecds.AAndEPatientGroupType)get_store().add_element_user(AANDEPATIENTGROUP$10);
                }
                target.set(aAndEPatientGroup);
            }
        }
        
        /**
         * Unsets the "AAndEPatientGroup" element
         */
        public void unsetAAndEPatientGroup()
        {
            synchronized (monitor())
            {
                check_orphaned();
                get_store().remove_element(AANDEPATIENTGROUP$10, 0);
            }
        }
        
        /**
         * Gets the "SourceOfReferralForAAndE" element
         */
        public uk.nhs.nhsia.datastandards.ecds.SourceOfReferralForAAndEType.Enum getSourceOfReferralForAAndE()
        {
            synchronized (monitor())
            {
                check_orphaned();
                org.apache.xmlbeans.SimpleValue target = null;
                target = (org.apache.xmlbeans.SimpleValue)get_store().find_element_user(SOURCEOFREFERRALFORAANDE$12, 0);
                if (target == null)
                {
                    return null;
                }
                return (uk.nhs.nhsia.datastandards.ecds.SourceOfReferralForAAndEType.Enum)target.getEnumValue();
            }
        }
        
        /**
         * Gets (as xml) the "SourceOfReferralForAAndE" element
         */
        public uk.nhs.nhsia.datastandards.ecds.SourceOfReferralForAAndEType xgetSourceOfReferralForAAndE()
        {
            synchronized (monitor())
            {
                check_orphaned();
                uk.nhs.nhsia.datastandards.ecds.SourceOfReferralForAAndEType target = null;
                target = (uk.nhs.nhsia.datastandards.ecds.SourceOfReferralForAAndEType)get_store().find_element_user(SOURCEOFREFERRALFORAANDE$12, 0);
                return target;
            }
        }
        
        /**
         * True if has "SourceOfReferralForAAndE" element
         */
        public boolean isSetSourceOfReferralForAAndE()
        {
            synchronized (monitor())
            {
                check_orphaned();
                return get_store().count_elements(SOURCEOFREFERRALFORAANDE$12) != 0;
            }
        }
        
        /**
         * Sets the "SourceOfReferralForAAndE" element
         */
        public void setSourceOfReferralForAAndE(uk.nhs.nhsia.datastandards.ecds.SourceOfReferralForAAndEType.Enum sourceOfReferralForAAndE)
        {
            synchronized (monitor())
            {
                check_orphaned();
                org.apache.xmlbeans.SimpleValue target = null;
                target = (org.apache.xmlbeans.SimpleValue)get_store().find_element_user(SOURCEOFREFERRALFORAANDE$12, 0);
                if (target == null)
                {
                    target = (org.apache.xmlbeans.SimpleValue)get_store().add_element_user(SOURCEOFREFERRALFORAANDE$12);
                }
                target.setEnumValue(sourceOfReferralForAAndE);
            }
        }
        
        /**
         * Sets (as xml) the "SourceOfReferralForAAndE" element
         */
        public void xsetSourceOfReferralForAAndE(uk.nhs.nhsia.datastandards.ecds.SourceOfReferralForAAndEType sourceOfReferralForAAndE)
        {
            synchronized (monitor())
            {
                check_orphaned();
                uk.nhs.nhsia.datastandards.ecds.SourceOfReferralForAAndEType target = null;
                target = (uk.nhs.nhsia.datastandards.ecds.SourceOfReferralForAAndEType)get_store().find_element_user(SOURCEOFREFERRALFORAANDE$12, 0);
                if (target == null)
                {
                    target = (uk.nhs.nhsia.datastandards.ecds.SourceOfReferralForAAndEType)get_store().add_element_user(SOURCEOFREFERRALFORAANDE$12);
                }
                target.set(sourceOfReferralForAAndE);
            }
        }
        
        /**
         * Unsets the "SourceOfReferralForAAndE" element
         */
        public void unsetSourceOfReferralForAAndE()
        {
            synchronized (monitor())
            {
                check_orphaned();
                get_store().remove_element(SOURCEOFREFERRALFORAANDE$12, 0);
            }
        }
        
        /**
         * Gets the "AAndEDepartmentType" element
         */
        public uk.nhs.nhsia.datastandards.ecds.AAndEDepartmentTypeType.Enum getAAndEDepartmentType()
        {
            synchronized (monitor())
            {
                check_orphaned();
                org.apache.xmlbeans.SimpleValue target = null;
                target = (org.apache.xmlbeans.SimpleValue)get_store().find_element_user(AANDEDEPARTMENTTYPE$14, 0);
                if (target == null)
                {
                    return null;
                }
                return (uk.nhs.nhsia.datastandards.ecds.AAndEDepartmentTypeType.Enum)target.getEnumValue();
            }
        }
        
        /**
         * Gets (as xml) the "AAndEDepartmentType" element
         */
        public uk.nhs.nhsia.datastandards.ecds.AAndEDepartmentTypeType xgetAAndEDepartmentType()
        {
            synchronized (monitor())
            {
                check_orphaned();
                uk.nhs.nhsia.datastandards.ecds.AAndEDepartmentTypeType target = null;
                target = (uk.nhs.nhsia.datastandards.ecds.AAndEDepartmentTypeType)get_store().find_element_user(AANDEDEPARTMENTTYPE$14, 0);
                return target;
            }
        }
        
        /**
         * True if has "AAndEDepartmentType" element
         */
        public boolean isSetAAndEDepartmentType()
        {
            synchronized (monitor())
            {
                check_orphaned();
                return get_store().count_elements(AANDEDEPARTMENTTYPE$14) != 0;
            }
        }
        
        /**
         * Sets the "AAndEDepartmentType" element
         */
        public void setAAndEDepartmentType(uk.nhs.nhsia.datastandards.ecds.AAndEDepartmentTypeType.Enum aAndEDepartmentType)
        {
            synchronized (monitor())
            {
                check_orphaned();
                org.apache.xmlbeans.SimpleValue target = null;
                target = (org.apache.xmlbeans.SimpleValue)get_store().find_element_user(AANDEDEPARTMENTTYPE$14, 0);
                if (target == null)
                {
                    target = (org.apache.xmlbeans.SimpleValue)get_store().add_element_user(AANDEDEPARTMENTTYPE$14);
                }
                target.setEnumValue(aAndEDepartmentType);
            }
        }
        
        /**
         * Sets (as xml) the "AAndEDepartmentType" element
         */
        public void xsetAAndEDepartmentType(uk.nhs.nhsia.datastandards.ecds.AAndEDepartmentTypeType aAndEDepartmentType)
        {
            synchronized (monitor())
            {
                check_orphaned();
                uk.nhs.nhsia.datastandards.ecds.AAndEDepartmentTypeType target = null;
                target = (uk.nhs.nhsia.datastandards.ecds.AAndEDepartmentTypeType)get_store().find_element_user(AANDEDEPARTMENTTYPE$14, 0);
                if (target == null)
                {
                    target = (uk.nhs.nhsia.datastandards.ecds.AAndEDepartmentTypeType)get_store().add_element_user(AANDEDEPARTMENTTYPE$14);
                }
                target.set(aAndEDepartmentType);
            }
        }
        
        /**
         * Unsets the "AAndEDepartmentType" element
         */
        public void unsetAAndEDepartmentType()
        {
            synchronized (monitor())
            {
                check_orphaned();
                get_store().remove_element(AANDEDEPARTMENTTYPE$14, 0);
            }
        }
        
        /**
         * Gets the "ArrivalDate" element
         */
        public java.util.Calendar getArrivalDate()
        {
            synchronized (monitor())
            {
                check_orphaned();
                org.apache.xmlbeans.SimpleValue target = null;
                target = (org.apache.xmlbeans.SimpleValue)get_store().find_element_user(ARRIVALDATE$16, 0);
                if (target == null)
                {
                    return null;
                }
                return target.getCalendarValue();
            }
        }
        
        /**
         * Gets (as xml) the "ArrivalDate" element
         */
        public uk.nhs.nhsia.datastandards.ecds.ArrivalDateType xgetArrivalDate()
        {
            synchronized (monitor())
            {
                check_orphaned();
                uk.nhs.nhsia.datastandards.ecds.ArrivalDateType target = null;
                target = (uk.nhs.nhsia.datastandards.ecds.ArrivalDateType)get_store().find_element_user(ARRIVALDATE$16, 0);
                return target;
            }
        }
        
        /**
         * Sets the "ArrivalDate" element
         */
        public void setArrivalDate(java.util.Calendar arrivalDate)
        {
            synchronized (monitor())
            {
                check_orphaned();
                org.apache.xmlbeans.SimpleValue target = null;
                target = (org.apache.xmlbeans.SimpleValue)get_store().find_element_user(ARRIVALDATE$16, 0);
                if (target == null)
                {
                    target = (org.apache.xmlbeans.SimpleValue)get_store().add_element_user(ARRIVALDATE$16);
                }
                target.setCalendarValue(arrivalDate);
            }
        }
        
        /**
         * Sets (as xml) the "ArrivalDate" element
         */
        public void xsetArrivalDate(uk.nhs.nhsia.datastandards.ecds.ArrivalDateType arrivalDate)
        {
            synchronized (monitor())
            {
                check_orphaned();
                uk.nhs.nhsia.datastandards.ecds.ArrivalDateType target = null;
                target = (uk.nhs.nhsia.datastandards.ecds.ArrivalDateType)get_store().find_element_user(ARRIVALDATE$16, 0);
                if (target == null)
                {
                    target = (uk.nhs.nhsia.datastandards.ecds.ArrivalDateType)get_store().add_element_user(ARRIVALDATE$16);
                }
                target.set(arrivalDate);
            }
        }
        
        /**
         * Gets the "ArrivalTimeAtAAndE" element
         */
        public java.util.Calendar getArrivalTimeAtAAndE()
        {
            synchronized (monitor())
            {
                check_orphaned();
                org.apache.xmlbeans.SimpleValue target = null;
                target = (org.apache.xmlbeans.SimpleValue)get_store().find_element_user(ARRIVALTIMEATAANDE$18, 0);
                if (target == null)
                {
                    return null;
                }
                return target.getCalendarValue();
            }
        }
        
        /**
         * Gets (as xml) the "ArrivalTimeAtAAndE" element
         */
        public uk.nhs.nhsia.datastandards.ecds.ArrivalTimeAtAAndEType xgetArrivalTimeAtAAndE()
        {
            synchronized (monitor())
            {
                check_orphaned();
                uk.nhs.nhsia.datastandards.ecds.ArrivalTimeAtAAndEType target = null;
                target = (uk.nhs.nhsia.datastandards.ecds.ArrivalTimeAtAAndEType)get_store().find_element_user(ARRIVALTIMEATAANDE$18, 0);
                return target;
            }
        }
        
        /**
         * Sets the "ArrivalTimeAtAAndE" element
         */
        public void setArrivalTimeAtAAndE(java.util.Calendar arrivalTimeAtAAndE)
        {
            synchronized (monitor())
            {
                check_orphaned();
                org.apache.xmlbeans.SimpleValue target = null;
                target = (org.apache.xmlbeans.SimpleValue)get_store().find_element_user(ARRIVALTIMEATAANDE$18, 0);
                if (target == null)
                {
                    target = (org.apache.xmlbeans.SimpleValue)get_store().add_element_user(ARRIVALTIMEATAANDE$18);
                }
                target.setCalendarValue(arrivalTimeAtAAndE);
            }
        }
        
        /**
         * Sets (as xml) the "ArrivalTimeAtAAndE" element
         */
        public void xsetArrivalTimeAtAAndE(uk.nhs.nhsia.datastandards.ecds.ArrivalTimeAtAAndEType arrivalTimeAtAAndE)
        {
            synchronized (monitor())
            {
                check_orphaned();
                uk.nhs.nhsia.datastandards.ecds.ArrivalTimeAtAAndEType target = null;
                target = (uk.nhs.nhsia.datastandards.ecds.ArrivalTimeAtAAndEType)get_store().find_element_user(ARRIVALTIMEATAANDE$18, 0);
                if (target == null)
                {
                    target = (uk.nhs.nhsia.datastandards.ecds.ArrivalTimeAtAAndEType)get_store().add_element_user(ARRIVALTIMEATAANDE$18);
                }
                target.set(arrivalTimeAtAAndE);
            }
        }
        
        /**
         * Gets the "AgeAtCDSActivityDate" element
         */
        public int getAgeAtCDSActivityDate()
        {
            synchronized (monitor())
            {
                check_orphaned();
                org.apache.xmlbeans.SimpleValue target = null;
                target = (org.apache.xmlbeans.SimpleValue)get_store().find_element_user(AGEATCDSACTIVITYDATE$20, 0);
                if (target == null)
                {
                    return 0;
                }
                return target.getIntValue();
            }
        }
        
        /**
         * Gets (as xml) the "AgeAtCDSActivityDate" element
         */
        public uk.nhs.nhsia.datastandards.ecds.AgeAtCDSActivityDateType xgetAgeAtCDSActivityDate()
        {
            synchronized (monitor())
            {
                check_orphaned();
                uk.nhs.nhsia.datastandards.ecds.AgeAtCDSActivityDateType target = null;
                target = (uk.nhs.nhsia.datastandards.ecds.AgeAtCDSActivityDateType)get_store().find_element_user(AGEATCDSACTIVITYDATE$20, 0);
                return target;
            }
        }
        
        /**
         * Sets the "AgeAtCDSActivityDate" element
         */
        public void setAgeAtCDSActivityDate(int ageAtCDSActivityDate)
        {
            synchronized (monitor())
            {
                check_orphaned();
                org.apache.xmlbeans.SimpleValue target = null;
                target = (org.apache.xmlbeans.SimpleValue)get_store().find_element_user(AGEATCDSACTIVITYDATE$20, 0);
                if (target == null)
                {
                    target = (org.apache.xmlbeans.SimpleValue)get_store().add_element_user(AGEATCDSACTIVITYDATE$20);
                }
                target.setIntValue(ageAtCDSActivityDate);
            }
        }
        
        /**
         * Sets (as xml) the "AgeAtCDSActivityDate" element
         */
        public void xsetAgeAtCDSActivityDate(uk.nhs.nhsia.datastandards.ecds.AgeAtCDSActivityDateType ageAtCDSActivityDate)
        {
            synchronized (monitor())
            {
                check_orphaned();
                uk.nhs.nhsia.datastandards.ecds.AgeAtCDSActivityDateType target = null;
                target = (uk.nhs.nhsia.datastandards.ecds.AgeAtCDSActivityDateType)get_store().find_element_user(AGEATCDSACTIVITYDATE$20, 0);
                if (target == null)
                {
                    target = (uk.nhs.nhsia.datastandards.ecds.AgeAtCDSActivityDateType)get_store().add_element_user(AGEATCDSACTIVITYDATE$20);
                }
                target.set(ageAtCDSActivityDate);
            }
        }
        
        /**
         * Gets the "OverseasVisitorStatusClassificationAtCDSActivityDate" element
         */
        public uk.nhs.nhsia.datastandards.ecds.OverseasVisitorClassificationType.Enum getOverseasVisitorStatusClassificationAtCDSActivityDate()
        {
            synchronized (monitor())
            {
                check_orphaned();
                org.apache.xmlbeans.SimpleValue target = null;
                target = (org.apache.xmlbeans.SimpleValue)get_store().find_element_user(OVERSEASVISITORSTATUSCLASSIFICATIONATCDSACTIVITYDATE$22, 0);
                if (target == null)
                {
                    return null;
                }
                return (uk.nhs.nhsia.datastandards.ecds.OverseasVisitorClassificationType.Enum)target.getEnumValue();
            }
        }
        
        /**
         * Gets (as xml) the "OverseasVisitorStatusClassificationAtCDSActivityDate" element
         */
        public uk.nhs.nhsia.datastandards.ecds.OverseasVisitorStatusClassificationAtCDSActivityDateType xgetOverseasVisitorStatusClassificationAtCDSActivityDate()
        {
            synchronized (monitor())
            {
                check_orphaned();
                uk.nhs.nhsia.datastandards.ecds.OverseasVisitorStatusClassificationAtCDSActivityDateType target = null;
                target = (uk.nhs.nhsia.datastandards.ecds.OverseasVisitorStatusClassificationAtCDSActivityDateType)get_store().find_element_user(OVERSEASVISITORSTATUSCLASSIFICATIONATCDSACTIVITYDATE$22, 0);
                return target;
            }
        }
        
        /**
         * True if has "OverseasVisitorStatusClassificationAtCDSActivityDate" element
         */
        public boolean isSetOverseasVisitorStatusClassificationAtCDSActivityDate()
        {
            synchronized (monitor())
            {
                check_orphaned();
                return get_store().count_elements(OVERSEASVISITORSTATUSCLASSIFICATIONATCDSACTIVITYDATE$22) != 0;
            }
        }
        
        /**
         * Sets the "OverseasVisitorStatusClassificationAtCDSActivityDate" element
         */
        public void setOverseasVisitorStatusClassificationAtCDSActivityDate(uk.nhs.nhsia.datastandards.ecds.OverseasVisitorClassificationType.Enum overseasVisitorStatusClassificationAtCDSActivityDate)
        {
            synchronized (monitor())
            {
                check_orphaned();
                org.apache.xmlbeans.SimpleValue target = null;
                target = (org.apache.xmlbeans.SimpleValue)get_store().find_element_user(OVERSEASVISITORSTATUSCLASSIFICATIONATCDSACTIVITYDATE$22, 0);
                if (target == null)
                {
                    target = (org.apache.xmlbeans.SimpleValue)get_store().add_element_user(OVERSEASVISITORSTATUSCLASSIFICATIONATCDSACTIVITYDATE$22);
                }
                target.setEnumValue(overseasVisitorStatusClassificationAtCDSActivityDate);
            }
        }
        
        /**
         * Sets (as xml) the "OverseasVisitorStatusClassificationAtCDSActivityDate" element
         */
        public void xsetOverseasVisitorStatusClassificationAtCDSActivityDate(uk.nhs.nhsia.datastandards.ecds.OverseasVisitorStatusClassificationAtCDSActivityDateType overseasVisitorStatusClassificationAtCDSActivityDate)
        {
            synchronized (monitor())
            {
                check_orphaned();
                uk.nhs.nhsia.datastandards.ecds.OverseasVisitorStatusClassificationAtCDSActivityDateType target = null;
                target = (uk.nhs.nhsia.datastandards.ecds.OverseasVisitorStatusClassificationAtCDSActivityDateType)get_store().find_element_user(OVERSEASVISITORSTATUSCLASSIFICATIONATCDSACTIVITYDATE$22, 0);
                if (target == null)
                {
                    target = (uk.nhs.nhsia.datastandards.ecds.OverseasVisitorStatusClassificationAtCDSActivityDateType)get_store().add_element_user(OVERSEASVISITORSTATUSCLASSIFICATIONATCDSACTIVITYDATE$22);
                }
                target.set(overseasVisitorStatusClassificationAtCDSActivityDate);
            }
        }
        
        /**
         * Unsets the "OverseasVisitorStatusClassificationAtCDSActivityDate" element
         */
        public void unsetOverseasVisitorStatusClassificationAtCDSActivityDate()
        {
            synchronized (monitor())
            {
                check_orphaned();
                get_store().remove_element(OVERSEASVISITORSTATUSCLASSIFICATIONATCDSACTIVITYDATE$22, 0);
            }
        }
        
        /**
         * Gets the "AAndEInitialAssessmentDate" element
         */
        public java.util.Calendar getAAndEInitialAssessmentDate()
        {
            synchronized (monitor())
            {
                check_orphaned();
                org.apache.xmlbeans.SimpleValue target = null;
                target = (org.apache.xmlbeans.SimpleValue)get_store().find_element_user(AANDEINITIALASSESSMENTDATE$24, 0);
                if (target == null)
                {
                    return null;
                }
                return target.getCalendarValue();
            }
        }
        
        /**
         * Gets (as xml) the "AAndEInitialAssessmentDate" element
         */
        public uk.nhs.nhsia.datastandards.ecds.AAndEInitialAssessmentDateType xgetAAndEInitialAssessmentDate()
        {
            synchronized (monitor())
            {
                check_orphaned();
                uk.nhs.nhsia.datastandards.ecds.AAndEInitialAssessmentDateType target = null;
                target = (uk.nhs.nhsia.datastandards.ecds.AAndEInitialAssessmentDateType)get_store().find_element_user(AANDEINITIALASSESSMENTDATE$24, 0);
                return target;
            }
        }
        
        /**
         * True if has "AAndEInitialAssessmentDate" element
         */
        public boolean isSetAAndEInitialAssessmentDate()
        {
            synchronized (monitor())
            {
                check_orphaned();
                return get_store().count_elements(AANDEINITIALASSESSMENTDATE$24) != 0;
            }
        }
        
        /**
         * Sets the "AAndEInitialAssessmentDate" element
         */
        public void setAAndEInitialAssessmentDate(java.util.Calendar aAndEInitialAssessmentDate)
        {
            synchronized (monitor())
            {
                check_orphaned();
                org.apache.xmlbeans.SimpleValue target = null;
                target = (org.apache.xmlbeans.SimpleValue)get_store().find_element_user(AANDEINITIALASSESSMENTDATE$24, 0);
                if (target == null)
                {
                    target = (org.apache.xmlbeans.SimpleValue)get_store().add_element_user(AANDEINITIALASSESSMENTDATE$24);
                }
                target.setCalendarValue(aAndEInitialAssessmentDate);
            }
        }
        
        /**
         * Sets (as xml) the "AAndEInitialAssessmentDate" element
         */
        public void xsetAAndEInitialAssessmentDate(uk.nhs.nhsia.datastandards.ecds.AAndEInitialAssessmentDateType aAndEInitialAssessmentDate)
        {
            synchronized (monitor())
            {
                check_orphaned();
                uk.nhs.nhsia.datastandards.ecds.AAndEInitialAssessmentDateType target = null;
                target = (uk.nhs.nhsia.datastandards.ecds.AAndEInitialAssessmentDateType)get_store().find_element_user(AANDEINITIALASSESSMENTDATE$24, 0);
                if (target == null)
                {
                    target = (uk.nhs.nhsia.datastandards.ecds.AAndEInitialAssessmentDateType)get_store().add_element_user(AANDEINITIALASSESSMENTDATE$24);
                }
                target.set(aAndEInitialAssessmentDate);
            }
        }
        
        /**
         * Unsets the "AAndEInitialAssessmentDate" element
         */
        public void unsetAAndEInitialAssessmentDate()
        {
            synchronized (monitor())
            {
                check_orphaned();
                get_store().remove_element(AANDEINITIALASSESSMENTDATE$24, 0);
            }
        }
        
        /**
         * Gets the "AAndEInitialAssessmentTime" element
         */
        public java.util.Calendar getAAndEInitialAssessmentTime()
        {
            synchronized (monitor())
            {
                check_orphaned();
                org.apache.xmlbeans.SimpleValue target = null;
                target = (org.apache.xmlbeans.SimpleValue)get_store().find_element_user(AANDEINITIALASSESSMENTTIME$26, 0);
                if (target == null)
                {
                    return null;
                }
                return target.getCalendarValue();
            }
        }
        
        /**
         * Gets (as xml) the "AAndEInitialAssessmentTime" element
         */
        public uk.nhs.nhsia.datastandards.ecds.AAndEInitialAssessmentTimeType xgetAAndEInitialAssessmentTime()
        {
            synchronized (monitor())
            {
                check_orphaned();
                uk.nhs.nhsia.datastandards.ecds.AAndEInitialAssessmentTimeType target = null;
                target = (uk.nhs.nhsia.datastandards.ecds.AAndEInitialAssessmentTimeType)get_store().find_element_user(AANDEINITIALASSESSMENTTIME$26, 0);
                return target;
            }
        }
        
        /**
         * True if has "AAndEInitialAssessmentTime" element
         */
        public boolean isSetAAndEInitialAssessmentTime()
        {
            synchronized (monitor())
            {
                check_orphaned();
                return get_store().count_elements(AANDEINITIALASSESSMENTTIME$26) != 0;
            }
        }
        
        /**
         * Sets the "AAndEInitialAssessmentTime" element
         */
        public void setAAndEInitialAssessmentTime(java.util.Calendar aAndEInitialAssessmentTime)
        {
            synchronized (monitor())
            {
                check_orphaned();
                org.apache.xmlbeans.SimpleValue target = null;
                target = (org.apache.xmlbeans.SimpleValue)get_store().find_element_user(AANDEINITIALASSESSMENTTIME$26, 0);
                if (target == null)
                {
                    target = (org.apache.xmlbeans.SimpleValue)get_store().add_element_user(AANDEINITIALASSESSMENTTIME$26);
                }
                target.setCalendarValue(aAndEInitialAssessmentTime);
            }
        }
        
        /**
         * Sets (as xml) the "AAndEInitialAssessmentTime" element
         */
        public void xsetAAndEInitialAssessmentTime(uk.nhs.nhsia.datastandards.ecds.AAndEInitialAssessmentTimeType aAndEInitialAssessmentTime)
        {
            synchronized (monitor())
            {
                check_orphaned();
                uk.nhs.nhsia.datastandards.ecds.AAndEInitialAssessmentTimeType target = null;
                target = (uk.nhs.nhsia.datastandards.ecds.AAndEInitialAssessmentTimeType)get_store().find_element_user(AANDEINITIALASSESSMENTTIME$26, 0);
                if (target == null)
                {
                    target = (uk.nhs.nhsia.datastandards.ecds.AAndEInitialAssessmentTimeType)get_store().add_element_user(AANDEINITIALASSESSMENTTIME$26);
                }
                target.set(aAndEInitialAssessmentTime);
            }
        }
        
        /**
         * Unsets the "AAndEInitialAssessmentTime" element
         */
        public void unsetAAndEInitialAssessmentTime()
        {
            synchronized (monitor())
            {
                check_orphaned();
                get_store().remove_element(AANDEINITIALASSESSMENTTIME$26, 0);
            }
        }
        
        /**
         * Gets the "AAndEDateSeenForTreatment" element
         */
        public java.util.Calendar getAAndEDateSeenForTreatment()
        {
            synchronized (monitor())
            {
                check_orphaned();
                org.apache.xmlbeans.SimpleValue target = null;
                target = (org.apache.xmlbeans.SimpleValue)get_store().find_element_user(AANDEDATESEENFORTREATMENT$28, 0);
                if (target == null)
                {
                    return null;
                }
                return target.getCalendarValue();
            }
        }
        
        /**
         * Gets (as xml) the "AAndEDateSeenForTreatment" element
         */
        public uk.nhs.nhsia.datastandards.ecds.AAndEDateSeenForTreatmentType xgetAAndEDateSeenForTreatment()
        {
            synchronized (monitor())
            {
                check_orphaned();
                uk.nhs.nhsia.datastandards.ecds.AAndEDateSeenForTreatmentType target = null;
                target = (uk.nhs.nhsia.datastandards.ecds.AAndEDateSeenForTreatmentType)get_store().find_element_user(AANDEDATESEENFORTREATMENT$28, 0);
                return target;
            }
        }
        
        /**
         * True if has "AAndEDateSeenForTreatment" element
         */
        public boolean isSetAAndEDateSeenForTreatment()
        {
            synchronized (monitor())
            {
                check_orphaned();
                return get_store().count_elements(AANDEDATESEENFORTREATMENT$28) != 0;
            }
        }
        
        /**
         * Sets the "AAndEDateSeenForTreatment" element
         */
        public void setAAndEDateSeenForTreatment(java.util.Calendar aAndEDateSeenForTreatment)
        {
            synchronized (monitor())
            {
                check_orphaned();
                org.apache.xmlbeans.SimpleValue target = null;
                target = (org.apache.xmlbeans.SimpleValue)get_store().find_element_user(AANDEDATESEENFORTREATMENT$28, 0);
                if (target == null)
                {
                    target = (org.apache.xmlbeans.SimpleValue)get_store().add_element_user(AANDEDATESEENFORTREATMENT$28);
                }
                target.setCalendarValue(aAndEDateSeenForTreatment);
            }
        }
        
        /**
         * Sets (as xml) the "AAndEDateSeenForTreatment" element
         */
        public void xsetAAndEDateSeenForTreatment(uk.nhs.nhsia.datastandards.ecds.AAndEDateSeenForTreatmentType aAndEDateSeenForTreatment)
        {
            synchronized (monitor())
            {
                check_orphaned();
                uk.nhs.nhsia.datastandards.ecds.AAndEDateSeenForTreatmentType target = null;
                target = (uk.nhs.nhsia.datastandards.ecds.AAndEDateSeenForTreatmentType)get_store().find_element_user(AANDEDATESEENFORTREATMENT$28, 0);
                if (target == null)
                {
                    target = (uk.nhs.nhsia.datastandards.ecds.AAndEDateSeenForTreatmentType)get_store().add_element_user(AANDEDATESEENFORTREATMENT$28);
                }
                target.set(aAndEDateSeenForTreatment);
            }
        }
        
        /**
         * Unsets the "AAndEDateSeenForTreatment" element
         */
        public void unsetAAndEDateSeenForTreatment()
        {
            synchronized (monitor())
            {
                check_orphaned();
                get_store().remove_element(AANDEDATESEENFORTREATMENT$28, 0);
            }
        }
        
        /**
         * Gets the "AAndETimeSeenForTreatment" element
         */
        public java.util.Calendar getAAndETimeSeenForTreatment()
        {
            synchronized (monitor())
            {
                check_orphaned();
                org.apache.xmlbeans.SimpleValue target = null;
                target = (org.apache.xmlbeans.SimpleValue)get_store().find_element_user(AANDETIMESEENFORTREATMENT$30, 0);
                if (target == null)
                {
                    return null;
                }
                return target.getCalendarValue();
            }
        }
        
        /**
         * Gets (as xml) the "AAndETimeSeenForTreatment" element
         */
        public uk.nhs.nhsia.datastandards.ecds.AAndETimeSeenForTreatmentType xgetAAndETimeSeenForTreatment()
        {
            synchronized (monitor())
            {
                check_orphaned();
                uk.nhs.nhsia.datastandards.ecds.AAndETimeSeenForTreatmentType target = null;
                target = (uk.nhs.nhsia.datastandards.ecds.AAndETimeSeenForTreatmentType)get_store().find_element_user(AANDETIMESEENFORTREATMENT$30, 0);
                return target;
            }
        }
        
        /**
         * True if has "AAndETimeSeenForTreatment" element
         */
        public boolean isSetAAndETimeSeenForTreatment()
        {
            synchronized (monitor())
            {
                check_orphaned();
                return get_store().count_elements(AANDETIMESEENFORTREATMENT$30) != 0;
            }
        }
        
        /**
         * Sets the "AAndETimeSeenForTreatment" element
         */
        public void setAAndETimeSeenForTreatment(java.util.Calendar aAndETimeSeenForTreatment)
        {
            synchronized (monitor())
            {
                check_orphaned();
                org.apache.xmlbeans.SimpleValue target = null;
                target = (org.apache.xmlbeans.SimpleValue)get_store().find_element_user(AANDETIMESEENFORTREATMENT$30, 0);
                if (target == null)
                {
                    target = (org.apache.xmlbeans.SimpleValue)get_store().add_element_user(AANDETIMESEENFORTREATMENT$30);
                }
                target.setCalendarValue(aAndETimeSeenForTreatment);
            }
        }
        
        /**
         * Sets (as xml) the "AAndETimeSeenForTreatment" element
         */
        public void xsetAAndETimeSeenForTreatment(uk.nhs.nhsia.datastandards.ecds.AAndETimeSeenForTreatmentType aAndETimeSeenForTreatment)
        {
            synchronized (monitor())
            {
                check_orphaned();
                uk.nhs.nhsia.datastandards.ecds.AAndETimeSeenForTreatmentType target = null;
                target = (uk.nhs.nhsia.datastandards.ecds.AAndETimeSeenForTreatmentType)get_store().find_element_user(AANDETIMESEENFORTREATMENT$30, 0);
                if (target == null)
                {
                    target = (uk.nhs.nhsia.datastandards.ecds.AAndETimeSeenForTreatmentType)get_store().add_element_user(AANDETIMESEENFORTREATMENT$30);
                }
                target.set(aAndETimeSeenForTreatment);
            }
        }
        
        /**
         * Unsets the "AAndETimeSeenForTreatment" element
         */
        public void unsetAAndETimeSeenForTreatment()
        {
            synchronized (monitor())
            {
                check_orphaned();
                get_store().remove_element(AANDETIMESEENFORTREATMENT$30, 0);
            }
        }
        
        /**
         * Gets the "AAndEAttendanceConclusionDate" element
         */
        public java.util.Calendar getAAndEAttendanceConclusionDate()
        {
            synchronized (monitor())
            {
                check_orphaned();
                org.apache.xmlbeans.SimpleValue target = null;
                target = (org.apache.xmlbeans.SimpleValue)get_store().find_element_user(AANDEATTENDANCECONCLUSIONDATE$32, 0);
                if (target == null)
                {
                    return null;
                }
                return target.getCalendarValue();
            }
        }
        
        /**
         * Gets (as xml) the "AAndEAttendanceConclusionDate" element
         */
        public uk.nhs.nhsia.datastandards.ecds.AAndEAttendanceConclusionDateType xgetAAndEAttendanceConclusionDate()
        {
            synchronized (monitor())
            {
                check_orphaned();
                uk.nhs.nhsia.datastandards.ecds.AAndEAttendanceConclusionDateType target = null;
                target = (uk.nhs.nhsia.datastandards.ecds.AAndEAttendanceConclusionDateType)get_store().find_element_user(AANDEATTENDANCECONCLUSIONDATE$32, 0);
                return target;
            }
        }
        
        /**
         * True if has "AAndEAttendanceConclusionDate" element
         */
        public boolean isSetAAndEAttendanceConclusionDate()
        {
            synchronized (monitor())
            {
                check_orphaned();
                return get_store().count_elements(AANDEATTENDANCECONCLUSIONDATE$32) != 0;
            }
        }
        
        /**
         * Sets the "AAndEAttendanceConclusionDate" element
         */
        public void setAAndEAttendanceConclusionDate(java.util.Calendar aAndEAttendanceConclusionDate)
        {
            synchronized (monitor())
            {
                check_orphaned();
                org.apache.xmlbeans.SimpleValue target = null;
                target = (org.apache.xmlbeans.SimpleValue)get_store().find_element_user(AANDEATTENDANCECONCLUSIONDATE$32, 0);
                if (target == null)
                {
                    target = (org.apache.xmlbeans.SimpleValue)get_store().add_element_user(AANDEATTENDANCECONCLUSIONDATE$32);
                }
                target.setCalendarValue(aAndEAttendanceConclusionDate);
            }
        }
        
        /**
         * Sets (as xml) the "AAndEAttendanceConclusionDate" element
         */
        public void xsetAAndEAttendanceConclusionDate(uk.nhs.nhsia.datastandards.ecds.AAndEAttendanceConclusionDateType aAndEAttendanceConclusionDate)
        {
            synchronized (monitor())
            {
                check_orphaned();
                uk.nhs.nhsia.datastandards.ecds.AAndEAttendanceConclusionDateType target = null;
                target = (uk.nhs.nhsia.datastandards.ecds.AAndEAttendanceConclusionDateType)get_store().find_element_user(AANDEATTENDANCECONCLUSIONDATE$32, 0);
                if (target == null)
                {
                    target = (uk.nhs.nhsia.datastandards.ecds.AAndEAttendanceConclusionDateType)get_store().add_element_user(AANDEATTENDANCECONCLUSIONDATE$32);
                }
                target.set(aAndEAttendanceConclusionDate);
            }
        }
        
        /**
         * Unsets the "AAndEAttendanceConclusionDate" element
         */
        public void unsetAAndEAttendanceConclusionDate()
        {
            synchronized (monitor())
            {
                check_orphaned();
                get_store().remove_element(AANDEATTENDANCECONCLUSIONDATE$32, 0);
            }
        }
        
        /**
         * Gets the "AAndEAttendanceConclusionTime" element
         */
        public java.util.Calendar getAAndEAttendanceConclusionTime()
        {
            synchronized (monitor())
            {
                check_orphaned();
                org.apache.xmlbeans.SimpleValue target = null;
                target = (org.apache.xmlbeans.SimpleValue)get_store().find_element_user(AANDEATTENDANCECONCLUSIONTIME$34, 0);
                if (target == null)
                {
                    return null;
                }
                return target.getCalendarValue();
            }
        }
        
        /**
         * Gets (as xml) the "AAndEAttendanceConclusionTime" element
         */
        public uk.nhs.nhsia.datastandards.ecds.AAndEAttendanceConclusionTimeType xgetAAndEAttendanceConclusionTime()
        {
            synchronized (monitor())
            {
                check_orphaned();
                uk.nhs.nhsia.datastandards.ecds.AAndEAttendanceConclusionTimeType target = null;
                target = (uk.nhs.nhsia.datastandards.ecds.AAndEAttendanceConclusionTimeType)get_store().find_element_user(AANDEATTENDANCECONCLUSIONTIME$34, 0);
                return target;
            }
        }
        
        /**
         * True if has "AAndEAttendanceConclusionTime" element
         */
        public boolean isSetAAndEAttendanceConclusionTime()
        {
            synchronized (monitor())
            {
                check_orphaned();
                return get_store().count_elements(AANDEATTENDANCECONCLUSIONTIME$34) != 0;
            }
        }
        
        /**
         * Sets the "AAndEAttendanceConclusionTime" element
         */
        public void setAAndEAttendanceConclusionTime(java.util.Calendar aAndEAttendanceConclusionTime)
        {
            synchronized (monitor())
            {
                check_orphaned();
                org.apache.xmlbeans.SimpleValue target = null;
                target = (org.apache.xmlbeans.SimpleValue)get_store().find_element_user(AANDEATTENDANCECONCLUSIONTIME$34, 0);
                if (target == null)
                {
                    target = (org.apache.xmlbeans.SimpleValue)get_store().add_element_user(AANDEATTENDANCECONCLUSIONTIME$34);
                }
                target.setCalendarValue(aAndEAttendanceConclusionTime);
            }
        }
        
        /**
         * Sets (as xml) the "AAndEAttendanceConclusionTime" element
         */
        public void xsetAAndEAttendanceConclusionTime(uk.nhs.nhsia.datastandards.ecds.AAndEAttendanceConclusionTimeType aAndEAttendanceConclusionTime)
        {
            synchronized (monitor())
            {
                check_orphaned();
                uk.nhs.nhsia.datastandards.ecds.AAndEAttendanceConclusionTimeType target = null;
                target = (uk.nhs.nhsia.datastandards.ecds.AAndEAttendanceConclusionTimeType)get_store().find_element_user(AANDEATTENDANCECONCLUSIONTIME$34, 0);
                if (target == null)
                {
                    target = (uk.nhs.nhsia.datastandards.ecds.AAndEAttendanceConclusionTimeType)get_store().add_element_user(AANDEATTENDANCECONCLUSIONTIME$34);
                }
                target.set(aAndEAttendanceConclusionTime);
            }
        }
        
        /**
         * Unsets the "AAndEAttendanceConclusionTime" element
         */
        public void unsetAAndEAttendanceConclusionTime()
        {
            synchronized (monitor())
            {
                check_orphaned();
                get_store().remove_element(AANDEATTENDANCECONCLUSIONTIME$34, 0);
            }
        }
        
        /**
         * Gets the "AAndEDepartureDate" element
         */
        public java.util.Calendar getAAndEDepartureDate()
        {
            synchronized (monitor())
            {
                check_orphaned();
                org.apache.xmlbeans.SimpleValue target = null;
                target = (org.apache.xmlbeans.SimpleValue)get_store().find_element_user(AANDEDEPARTUREDATE$36, 0);
                if (target == null)
                {
                    return null;
                }
                return target.getCalendarValue();
            }
        }
        
        /**
         * Gets (as xml) the "AAndEDepartureDate" element
         */
        public uk.nhs.nhsia.datastandards.ecds.AAndEDepartureDateType xgetAAndEDepartureDate()
        {
            synchronized (monitor())
            {
                check_orphaned();
                uk.nhs.nhsia.datastandards.ecds.AAndEDepartureDateType target = null;
                target = (uk.nhs.nhsia.datastandards.ecds.AAndEDepartureDateType)get_store().find_element_user(AANDEDEPARTUREDATE$36, 0);
                return target;
            }
        }
        
        /**
         * True if has "AAndEDepartureDate" element
         */
        public boolean isSetAAndEDepartureDate()
        {
            synchronized (monitor())
            {
                check_orphaned();
                return get_store().count_elements(AANDEDEPARTUREDATE$36) != 0;
            }
        }
        
        /**
         * Sets the "AAndEDepartureDate" element
         */
        public void setAAndEDepartureDate(java.util.Calendar aAndEDepartureDate)
        {
            synchronized (monitor())
            {
                check_orphaned();
                org.apache.xmlbeans.SimpleValue target = null;
                target = (org.apache.xmlbeans.SimpleValue)get_store().find_element_user(AANDEDEPARTUREDATE$36, 0);
                if (target == null)
                {
                    target = (org.apache.xmlbeans.SimpleValue)get_store().add_element_user(AANDEDEPARTUREDATE$36);
                }
                target.setCalendarValue(aAndEDepartureDate);
            }
        }
        
        /**
         * Sets (as xml) the "AAndEDepartureDate" element
         */
        public void xsetAAndEDepartureDate(uk.nhs.nhsia.datastandards.ecds.AAndEDepartureDateType aAndEDepartureDate)
        {
            synchronized (monitor())
            {
                check_orphaned();
                uk.nhs.nhsia.datastandards.ecds.AAndEDepartureDateType target = null;
                target = (uk.nhs.nhsia.datastandards.ecds.AAndEDepartureDateType)get_store().find_element_user(AANDEDEPARTUREDATE$36, 0);
                if (target == null)
                {
                    target = (uk.nhs.nhsia.datastandards.ecds.AAndEDepartureDateType)get_store().add_element_user(AANDEDEPARTUREDATE$36);
                }
                target.set(aAndEDepartureDate);
            }
        }
        
        /**
         * Unsets the "AAndEDepartureDate" element
         */
        public void unsetAAndEDepartureDate()
        {
            synchronized (monitor())
            {
                check_orphaned();
                get_store().remove_element(AANDEDEPARTUREDATE$36, 0);
            }
        }
        
        /**
         * Gets the "AAndEDepartureTime" element
         */
        public java.util.Calendar getAAndEDepartureTime()
        {
            synchronized (monitor())
            {
                check_orphaned();
                org.apache.xmlbeans.SimpleValue target = null;
                target = (org.apache.xmlbeans.SimpleValue)get_store().find_element_user(AANDEDEPARTURETIME$38, 0);
                if (target == null)
                {
                    return null;
                }
                return target.getCalendarValue();
            }
        }
        
        /**
         * Gets (as xml) the "AAndEDepartureTime" element
         */
        public uk.nhs.nhsia.datastandards.ecds.AAndEDepartureTimeType xgetAAndEDepartureTime()
        {
            synchronized (monitor())
            {
                check_orphaned();
                uk.nhs.nhsia.datastandards.ecds.AAndEDepartureTimeType target = null;
                target = (uk.nhs.nhsia.datastandards.ecds.AAndEDepartureTimeType)get_store().find_element_user(AANDEDEPARTURETIME$38, 0);
                return target;
            }
        }
        
        /**
         * True if has "AAndEDepartureTime" element
         */
        public boolean isSetAAndEDepartureTime()
        {
            synchronized (monitor())
            {
                check_orphaned();
                return get_store().count_elements(AANDEDEPARTURETIME$38) != 0;
            }
        }
        
        /**
         * Sets the "AAndEDepartureTime" element
         */
        public void setAAndEDepartureTime(java.util.Calendar aAndEDepartureTime)
        {
            synchronized (monitor())
            {
                check_orphaned();
                org.apache.xmlbeans.SimpleValue target = null;
                target = (org.apache.xmlbeans.SimpleValue)get_store().find_element_user(AANDEDEPARTURETIME$38, 0);
                if (target == null)
                {
                    target = (org.apache.xmlbeans.SimpleValue)get_store().add_element_user(AANDEDEPARTURETIME$38);
                }
                target.setCalendarValue(aAndEDepartureTime);
            }
        }
        
        /**
         * Sets (as xml) the "AAndEDepartureTime" element
         */
        public void xsetAAndEDepartureTime(uk.nhs.nhsia.datastandards.ecds.AAndEDepartureTimeType aAndEDepartureTime)
        {
            synchronized (monitor())
            {
                check_orphaned();
                uk.nhs.nhsia.datastandards.ecds.AAndEDepartureTimeType target = null;
                target = (uk.nhs.nhsia.datastandards.ecds.AAndEDepartureTimeType)get_store().find_element_user(AANDEDEPARTURETIME$38, 0);
                if (target == null)
                {
                    target = (uk.nhs.nhsia.datastandards.ecds.AAndEDepartureTimeType)get_store().add_element_user(AANDEDEPARTURETIME$38);
                }
                target.set(aAndEDepartureTime);
            }
        }
        
        /**
         * Unsets the "AAndEDepartureTime" element
         */
        public void unsetAAndEDepartureTime()
        {
            synchronized (monitor())
            {
                check_orphaned();
                get_store().remove_element(AANDEDEPARTURETIME$38, 0);
            }
        }
        
        /**
         * Gets the "AmbulanceIncidentNumber" element
         */
        public java.lang.String getAmbulanceIncidentNumber()
        {
            synchronized (monitor())
            {
                check_orphaned();
                org.apache.xmlbeans.SimpleValue target = null;
                target = (org.apache.xmlbeans.SimpleValue)get_store().find_element_user(AMBULANCEINCIDENTNUMBER$40, 0);
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
        public uk.nhs.nhsia.datastandards.ecds.AmbulanceIncidentNumberType xgetAmbulanceIncidentNumber()
        {
            synchronized (monitor())
            {
                check_orphaned();
                uk.nhs.nhsia.datastandards.ecds.AmbulanceIncidentNumberType target = null;
                target = (uk.nhs.nhsia.datastandards.ecds.AmbulanceIncidentNumberType)get_store().find_element_user(AMBULANCEINCIDENTNUMBER$40, 0);
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
                return get_store().count_elements(AMBULANCEINCIDENTNUMBER$40) != 0;
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
                target = (org.apache.xmlbeans.SimpleValue)get_store().find_element_user(AMBULANCEINCIDENTNUMBER$40, 0);
                if (target == null)
                {
                    target = (org.apache.xmlbeans.SimpleValue)get_store().add_element_user(AMBULANCEINCIDENTNUMBER$40);
                }
                target.setStringValue(ambulanceIncidentNumber);
            }
        }
        
        /**
         * Sets (as xml) the "AmbulanceIncidentNumber" element
         */
        public void xsetAmbulanceIncidentNumber(uk.nhs.nhsia.datastandards.ecds.AmbulanceIncidentNumberType ambulanceIncidentNumber)
        {
            synchronized (monitor())
            {
                check_orphaned();
                uk.nhs.nhsia.datastandards.ecds.AmbulanceIncidentNumberType target = null;
                target = (uk.nhs.nhsia.datastandards.ecds.AmbulanceIncidentNumberType)get_store().find_element_user(AMBULANCEINCIDENTNUMBER$40, 0);
                if (target == null)
                {
                    target = (uk.nhs.nhsia.datastandards.ecds.AmbulanceIncidentNumberType)get_store().add_element_user(AMBULANCEINCIDENTNUMBER$40);
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
                get_store().remove_element(AMBULANCEINCIDENTNUMBER$40, 0);
            }
        }
        
        /**
         * Gets the "OrganisationCodeConveyingAmbulanceTrust" element
         */
        public java.lang.String getOrganisationCodeConveyingAmbulanceTrust()
        {
            synchronized (monitor())
            {
                check_orphaned();
                org.apache.xmlbeans.SimpleValue target = null;
                target = (org.apache.xmlbeans.SimpleValue)get_store().find_element_user(ORGANISATIONCODECONVEYINGAMBULANCETRUST$42, 0);
                if (target == null)
                {
                    return null;
                }
                return target.getStringValue();
            }
        }
        
        /**
         * Gets (as xml) the "OrganisationCodeConveyingAmbulanceTrust" element
         */
        public uk.nhs.nhsia.datastandards.ecds.OrganisationCodeConveyingAmbulanceTrustType xgetOrganisationCodeConveyingAmbulanceTrust()
        {
            synchronized (monitor())
            {
                check_orphaned();
                uk.nhs.nhsia.datastandards.ecds.OrganisationCodeConveyingAmbulanceTrustType target = null;
                target = (uk.nhs.nhsia.datastandards.ecds.OrganisationCodeConveyingAmbulanceTrustType)get_store().find_element_user(ORGANISATIONCODECONVEYINGAMBULANCETRUST$42, 0);
                return target;
            }
        }
        
        /**
         * True if has "OrganisationCodeConveyingAmbulanceTrust" element
         */
        public boolean isSetOrganisationCodeConveyingAmbulanceTrust()
        {
            synchronized (monitor())
            {
                check_orphaned();
                return get_store().count_elements(ORGANISATIONCODECONVEYINGAMBULANCETRUST$42) != 0;
            }
        }
        
        /**
         * Sets the "OrganisationCodeConveyingAmbulanceTrust" element
         */
        public void setOrganisationCodeConveyingAmbulanceTrust(java.lang.String organisationCodeConveyingAmbulanceTrust)
        {
            synchronized (monitor())
            {
                check_orphaned();
                org.apache.xmlbeans.SimpleValue target = null;
                target = (org.apache.xmlbeans.SimpleValue)get_store().find_element_user(ORGANISATIONCODECONVEYINGAMBULANCETRUST$42, 0);
                if (target == null)
                {
                    target = (org.apache.xmlbeans.SimpleValue)get_store().add_element_user(ORGANISATIONCODECONVEYINGAMBULANCETRUST$42);
                }
                target.setStringValue(organisationCodeConveyingAmbulanceTrust);
            }
        }
        
        /**
         * Sets (as xml) the "OrganisationCodeConveyingAmbulanceTrust" element
         */
        public void xsetOrganisationCodeConveyingAmbulanceTrust(uk.nhs.nhsia.datastandards.ecds.OrganisationCodeConveyingAmbulanceTrustType organisationCodeConveyingAmbulanceTrust)
        {
            synchronized (monitor())
            {
                check_orphaned();
                uk.nhs.nhsia.datastandards.ecds.OrganisationCodeConveyingAmbulanceTrustType target = null;
                target = (uk.nhs.nhsia.datastandards.ecds.OrganisationCodeConveyingAmbulanceTrustType)get_store().find_element_user(ORGANISATIONCODECONVEYINGAMBULANCETRUST$42, 0);
                if (target == null)
                {
                    target = (uk.nhs.nhsia.datastandards.ecds.OrganisationCodeConveyingAmbulanceTrustType)get_store().add_element_user(ORGANISATIONCODECONVEYINGAMBULANCETRUST$42);
                }
                target.set(organisationCodeConveyingAmbulanceTrust);
            }
        }
        
        /**
         * Unsets the "OrganisationCodeConveyingAmbulanceTrust" element
         */
        public void unsetOrganisationCodeConveyingAmbulanceTrust()
        {
            synchronized (monitor())
            {
                check_orphaned();
                get_store().remove_element(ORGANISATIONCODECONVEYINGAMBULANCETRUST$42, 0);
            }
        }
    }
}
