/*
 * XML Type:  CareAttendance_Structure
 * Namespace: http://www.nhsia.nhs.uk/DataStandards/XMLschema/CDS/ns
 * Java type: uk.nhs.nhsia.datastandards.ecds.CareAttendanceStructure
 *
 * Automatically generated - do not modify.
 */
package uk.nhs.nhsia.datastandards.ecds.impl;
/**
 * An XML CareAttendance_Structure(@http://www.nhsia.nhs.uk/DataStandards/XMLschema/CDS/ns).
 *
 * This is a complex type.
 */
public class CareAttendanceStructureImpl extends org.apache.xmlbeans.impl.values.XmlComplexContentImpl implements uk.nhs.nhsia.datastandards.ecds.CareAttendanceStructure
{
    private static final long serialVersionUID = 1L;
    
    public CareAttendanceStructureImpl(org.apache.xmlbeans.SchemaType sType)
    {
        super(sType);
    }
    
    private static final javax.xml.namespace.QName ACTIVITYCHARACTERISTICS$0 = 
        new javax.xml.namespace.QName("http://www.nhsia.nhs.uk/DataStandards/XMLschema/CDS/ns", "ActivityCharacteristics");
    private static final javax.xml.namespace.QName SERVICEAGREEMENTDETAILS$2 = 
        new javax.xml.namespace.QName("http://www.nhsia.nhs.uk/DataStandards/XMLschema/CDS/ns", "ServiceAgreementDetails");
    private static final javax.xml.namespace.QName CLINICALACTIVITYDETAILS$4 = 
        new javax.xml.namespace.QName("http://www.nhsia.nhs.uk/DataStandards/XMLschema/CDS/ns", "ClinicalActivityDetails");
    private static final javax.xml.namespace.QName ATTENDANCELOCATIONGROUP$6 = 
        new javax.xml.namespace.QName("http://www.nhsia.nhs.uk/DataStandards/XMLschema/CDS/ns", "AttendanceLocationGroup");
    
    
    /**
     * Gets the "ActivityCharacteristics" element
     */
    public uk.nhs.nhsia.datastandards.ecds.CareAttendanceStructure.ActivityCharacteristics getActivityCharacteristics()
    {
        synchronized (monitor())
        {
            check_orphaned();
            uk.nhs.nhsia.datastandards.ecds.CareAttendanceStructure.ActivityCharacteristics target = null;
            target = (uk.nhs.nhsia.datastandards.ecds.CareAttendanceStructure.ActivityCharacteristics)get_store().find_element_user(ACTIVITYCHARACTERISTICS$0, 0);
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
    public void setActivityCharacteristics(uk.nhs.nhsia.datastandards.ecds.CareAttendanceStructure.ActivityCharacteristics activityCharacteristics)
    {
        generatedSetterHelperImpl(activityCharacteristics, ACTIVITYCHARACTERISTICS$0, 0, org.apache.xmlbeans.impl.values.XmlObjectBase.KIND_SETTERHELPER_SINGLETON);
    }
    
    /**
     * Appends and returns a new empty "ActivityCharacteristics" element
     */
    public uk.nhs.nhsia.datastandards.ecds.CareAttendanceStructure.ActivityCharacteristics addNewActivityCharacteristics()
    {
        synchronized (monitor())
        {
            check_orphaned();
            uk.nhs.nhsia.datastandards.ecds.CareAttendanceStructure.ActivityCharacteristics target = null;
            target = (uk.nhs.nhsia.datastandards.ecds.CareAttendanceStructure.ActivityCharacteristics)get_store().add_element_user(ACTIVITYCHARACTERISTICS$0);
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
     * Gets the "ClinicalActivityDetails" element
     */
    public uk.nhs.nhsia.datastandards.ecds.ClinicalActivityStructure getClinicalActivityDetails()
    {
        synchronized (monitor())
        {
            check_orphaned();
            uk.nhs.nhsia.datastandards.ecds.ClinicalActivityStructure target = null;
            target = (uk.nhs.nhsia.datastandards.ecds.ClinicalActivityStructure)get_store().find_element_user(CLINICALACTIVITYDETAILS$4, 0);
            if (target == null)
            {
                return null;
            }
            return target;
        }
    }
    
    /**
     * True if has "ClinicalActivityDetails" element
     */
    public boolean isSetClinicalActivityDetails()
    {
        synchronized (monitor())
        {
            check_orphaned();
            return get_store().count_elements(CLINICALACTIVITYDETAILS$4) != 0;
        }
    }
    
    /**
     * Sets the "ClinicalActivityDetails" element
     */
    public void setClinicalActivityDetails(uk.nhs.nhsia.datastandards.ecds.ClinicalActivityStructure clinicalActivityDetails)
    {
        generatedSetterHelperImpl(clinicalActivityDetails, CLINICALACTIVITYDETAILS$4, 0, org.apache.xmlbeans.impl.values.XmlObjectBase.KIND_SETTERHELPER_SINGLETON);
    }
    
    /**
     * Appends and returns a new empty "ClinicalActivityDetails" element
     */
    public uk.nhs.nhsia.datastandards.ecds.ClinicalActivityStructure addNewClinicalActivityDetails()
    {
        synchronized (monitor())
        {
            check_orphaned();
            uk.nhs.nhsia.datastandards.ecds.ClinicalActivityStructure target = null;
            target = (uk.nhs.nhsia.datastandards.ecds.ClinicalActivityStructure)get_store().add_element_user(CLINICALACTIVITYDETAILS$4);
            return target;
        }
    }
    
    /**
     * Unsets the "ClinicalActivityDetails" element
     */
    public void unsetClinicalActivityDetails()
    {
        synchronized (monitor())
        {
            check_orphaned();
            get_store().remove_element(CLINICALACTIVITYDETAILS$4, 0);
        }
    }
    
    /**
     * Gets the "AttendanceLocationGroup" element
     */
    public uk.nhs.nhsia.datastandards.ecds.AttendanceLocationGroupStructure getAttendanceLocationGroup()
    {
        synchronized (monitor())
        {
            check_orphaned();
            uk.nhs.nhsia.datastandards.ecds.AttendanceLocationGroupStructure target = null;
            target = (uk.nhs.nhsia.datastandards.ecds.AttendanceLocationGroupStructure)get_store().find_element_user(ATTENDANCELOCATIONGROUP$6, 0);
            if (target == null)
            {
                return null;
            }
            return target;
        }
    }
    
    /**
     * True if has "AttendanceLocationGroup" element
     */
    public boolean isSetAttendanceLocationGroup()
    {
        synchronized (monitor())
        {
            check_orphaned();
            return get_store().count_elements(ATTENDANCELOCATIONGROUP$6) != 0;
        }
    }
    
    /**
     * Sets the "AttendanceLocationGroup" element
     */
    public void setAttendanceLocationGroup(uk.nhs.nhsia.datastandards.ecds.AttendanceLocationGroupStructure attendanceLocationGroup)
    {
        generatedSetterHelperImpl(attendanceLocationGroup, ATTENDANCELOCATIONGROUP$6, 0, org.apache.xmlbeans.impl.values.XmlObjectBase.KIND_SETTERHELPER_SINGLETON);
    }
    
    /**
     * Appends and returns a new empty "AttendanceLocationGroup" element
     */
    public uk.nhs.nhsia.datastandards.ecds.AttendanceLocationGroupStructure addNewAttendanceLocationGroup()
    {
        synchronized (monitor())
        {
            check_orphaned();
            uk.nhs.nhsia.datastandards.ecds.AttendanceLocationGroupStructure target = null;
            target = (uk.nhs.nhsia.datastandards.ecds.AttendanceLocationGroupStructure)get_store().add_element_user(ATTENDANCELOCATIONGROUP$6);
            return target;
        }
    }
    
    /**
     * Unsets the "AttendanceLocationGroup" element
     */
    public void unsetAttendanceLocationGroup()
    {
        synchronized (monitor())
        {
            check_orphaned();
            get_store().remove_element(ATTENDANCELOCATIONGROUP$6, 0);
        }
    }
    /**
     * An XML ActivityCharacteristics(@http://www.nhsia.nhs.uk/DataStandards/XMLschema/CDS/ns).
     *
     * This is a complex type.
     */
    public static class ActivityCharacteristicsImpl extends org.apache.xmlbeans.impl.values.XmlComplexContentImpl implements uk.nhs.nhsia.datastandards.ecds.CareAttendanceStructure.ActivityCharacteristics
    {
        private static final long serialVersionUID = 1L;
        
        public ActivityCharacteristicsImpl(org.apache.xmlbeans.SchemaType sType)
        {
            super(sType);
        }
        
        private static final javax.xml.namespace.QName ATTENDANCEIDENTIFIER$0 = 
            new javax.xml.namespace.QName("http://www.nhsia.nhs.uk/DataStandards/XMLschema/CDS/ns", "AttendanceIdentifier");
        private static final javax.xml.namespace.QName ADMINISTRATIVECATEGORYCODE$2 = 
            new javax.xml.namespace.QName("http://www.nhsia.nhs.uk/DataStandards/XMLschema/CDS/ns", "AdministrativeCategoryCode");
        private static final javax.xml.namespace.QName ATTENDEDORDIDNOTATTENDCODE$4 = 
            new javax.xml.namespace.QName("http://www.nhsia.nhs.uk/DataStandards/XMLschema/CDS/ns", "AttendedOrDidNotAttendCode");
        private static final javax.xml.namespace.QName FIRSTATTENDANCECODE$6 = 
            new javax.xml.namespace.QName("http://www.nhsia.nhs.uk/DataStandards/XMLschema/CDS/ns", "FirstAttendanceCode");
        private static final javax.xml.namespace.QName MEDICALSTAFFTYPESEEINGPATIENT$8 = 
            new javax.xml.namespace.QName("http://www.nhsia.nhs.uk/DataStandards/XMLschema/CDS/ns", "MedicalStaffTypeSeeingPatient");
        private static final javax.xml.namespace.QName OPERATIONSTATUSCODE$10 = 
            new javax.xml.namespace.QName("http://www.nhsia.nhs.uk/DataStandards/XMLschema/CDS/ns", "OperationStatusCode");
        private static final javax.xml.namespace.QName OUTCOMEOFATTENDANCECODE$12 = 
            new javax.xml.namespace.QName("http://www.nhsia.nhs.uk/DataStandards/XMLschema/CDS/ns", "OutcomeOfAttendanceCode");
        private static final javax.xml.namespace.QName APPOINTMENTDATE$14 = 
            new javax.xml.namespace.QName("http://www.nhsia.nhs.uk/DataStandards/XMLschema/CDS/ns", "AppointmentDate");
        private static final javax.xml.namespace.QName APPOINTMENTTIME$16 = 
            new javax.xml.namespace.QName("http://www.nhsia.nhs.uk/DataStandards/XMLschema/CDS/ns", "AppointmentTime");
        private static final javax.xml.namespace.QName EXPECTEDDURATIONOFAPPOINTMENT$18 = 
            new javax.xml.namespace.QName("http://www.nhsia.nhs.uk/DataStandards/XMLschema/CDS/ns", "ExpectedDurationOfAppointment");
        private static final javax.xml.namespace.QName AGEATCDSACTIVITYDATE$20 = 
            new javax.xml.namespace.QName("http://www.nhsia.nhs.uk/DataStandards/XMLschema/CDS/ns", "AgeAtCDSActivityDate");
        private static final javax.xml.namespace.QName OVERSEASVISITORSTATUSCLASSIFICATIONATCDSACTIVITYDATE$22 = 
            new javax.xml.namespace.QName("http://www.nhsia.nhs.uk/DataStandards/XMLschema/CDS/ns", "OverseasVisitorStatusClassificationAtCDSActivityDate");
        private static final javax.xml.namespace.QName EARLIESTREASONABLEOFFERDATE$24 = 
            new javax.xml.namespace.QName("http://www.nhsia.nhs.uk/DataStandards/XMLschema/CDS/ns", "EarliestReasonableOfferDate");
        private static final javax.xml.namespace.QName EARLIESTCLINICALLYAPPROPRIATEDATE$26 = 
            new javax.xml.namespace.QName("http://www.nhsia.nhs.uk/DataStandards/XMLschema/CDS/ns", "EarliestClinicallyAppropriateDate");
        private static final javax.xml.namespace.QName CONSULTATIONMEDIUMUSED$28 = 
            new javax.xml.namespace.QName("http://www.nhsia.nhs.uk/DataStandards/XMLschema/CDS/ns", "ConsultationMediumUsed");
        private static final javax.xml.namespace.QName MULTIPROFORDISCINDCODE$30 = 
            new javax.xml.namespace.QName("http://www.nhsia.nhs.uk/DataStandards/XMLschema/CDS/ns", "MultiProfOrDiscIndCode");
        private static final javax.xml.namespace.QName REHABILITATIONASSESSMENTTEAMTYPE$32 = 
            new javax.xml.namespace.QName("http://www.nhsia.nhs.uk/DataStandards/XMLschema/CDS/ns", "RehabilitationAssessmentTeamType");
        
        
        /**
         * Gets the "AttendanceIdentifier" element
         */
        public java.lang.String getAttendanceIdentifier()
        {
            synchronized (monitor())
            {
                check_orphaned();
                org.apache.xmlbeans.SimpleValue target = null;
                target = (org.apache.xmlbeans.SimpleValue)get_store().find_element_user(ATTENDANCEIDENTIFIER$0, 0);
                if (target == null)
                {
                    return null;
                }
                return target.getStringValue();
            }
        }
        
        /**
         * Gets (as xml) the "AttendanceIdentifier" element
         */
        public uk.nhs.nhsia.datastandards.ecds.AttendanceIdentifierType xgetAttendanceIdentifier()
        {
            synchronized (monitor())
            {
                check_orphaned();
                uk.nhs.nhsia.datastandards.ecds.AttendanceIdentifierType target = null;
                target = (uk.nhs.nhsia.datastandards.ecds.AttendanceIdentifierType)get_store().find_element_user(ATTENDANCEIDENTIFIER$0, 0);
                return target;
            }
        }
        
        /**
         * True if has "AttendanceIdentifier" element
         */
        public boolean isSetAttendanceIdentifier()
        {
            synchronized (monitor())
            {
                check_orphaned();
                return get_store().count_elements(ATTENDANCEIDENTIFIER$0) != 0;
            }
        }
        
        /**
         * Sets the "AttendanceIdentifier" element
         */
        public void setAttendanceIdentifier(java.lang.String attendanceIdentifier)
        {
            synchronized (monitor())
            {
                check_orphaned();
                org.apache.xmlbeans.SimpleValue target = null;
                target = (org.apache.xmlbeans.SimpleValue)get_store().find_element_user(ATTENDANCEIDENTIFIER$0, 0);
                if (target == null)
                {
                    target = (org.apache.xmlbeans.SimpleValue)get_store().add_element_user(ATTENDANCEIDENTIFIER$0);
                }
                target.setStringValue(attendanceIdentifier);
            }
        }
        
        /**
         * Sets (as xml) the "AttendanceIdentifier" element
         */
        public void xsetAttendanceIdentifier(uk.nhs.nhsia.datastandards.ecds.AttendanceIdentifierType attendanceIdentifier)
        {
            synchronized (monitor())
            {
                check_orphaned();
                uk.nhs.nhsia.datastandards.ecds.AttendanceIdentifierType target = null;
                target = (uk.nhs.nhsia.datastandards.ecds.AttendanceIdentifierType)get_store().find_element_user(ATTENDANCEIDENTIFIER$0, 0);
                if (target == null)
                {
                    target = (uk.nhs.nhsia.datastandards.ecds.AttendanceIdentifierType)get_store().add_element_user(ATTENDANCEIDENTIFIER$0);
                }
                target.set(attendanceIdentifier);
            }
        }
        
        /**
         * Unsets the "AttendanceIdentifier" element
         */
        public void unsetAttendanceIdentifier()
        {
            synchronized (monitor())
            {
                check_orphaned();
                get_store().remove_element(ATTENDANCEIDENTIFIER$0, 0);
            }
        }
        
        /**
         * Gets the "AdministrativeCategoryCode" element
         */
        public uk.nhs.nhsia.datastandards.ecds.AdministrativeCategoryCodeType.Enum getAdministrativeCategoryCode()
        {
            synchronized (monitor())
            {
                check_orphaned();
                org.apache.xmlbeans.SimpleValue target = null;
                target = (org.apache.xmlbeans.SimpleValue)get_store().find_element_user(ADMINISTRATIVECATEGORYCODE$2, 0);
                if (target == null)
                {
                    return null;
                }
                return (uk.nhs.nhsia.datastandards.ecds.AdministrativeCategoryCodeType.Enum)target.getEnumValue();
            }
        }
        
        /**
         * Gets (as xml) the "AdministrativeCategoryCode" element
         */
        public uk.nhs.nhsia.datastandards.ecds.AdministrativeCategoryCodeType xgetAdministrativeCategoryCode()
        {
            synchronized (monitor())
            {
                check_orphaned();
                uk.nhs.nhsia.datastandards.ecds.AdministrativeCategoryCodeType target = null;
                target = (uk.nhs.nhsia.datastandards.ecds.AdministrativeCategoryCodeType)get_store().find_element_user(ADMINISTRATIVECATEGORYCODE$2, 0);
                return target;
            }
        }
        
        /**
         * True if has "AdministrativeCategoryCode" element
         */
        public boolean isSetAdministrativeCategoryCode()
        {
            synchronized (monitor())
            {
                check_orphaned();
                return get_store().count_elements(ADMINISTRATIVECATEGORYCODE$2) != 0;
            }
        }
        
        /**
         * Sets the "AdministrativeCategoryCode" element
         */
        public void setAdministrativeCategoryCode(uk.nhs.nhsia.datastandards.ecds.AdministrativeCategoryCodeType.Enum administrativeCategoryCode)
        {
            synchronized (monitor())
            {
                check_orphaned();
                org.apache.xmlbeans.SimpleValue target = null;
                target = (org.apache.xmlbeans.SimpleValue)get_store().find_element_user(ADMINISTRATIVECATEGORYCODE$2, 0);
                if (target == null)
                {
                    target = (org.apache.xmlbeans.SimpleValue)get_store().add_element_user(ADMINISTRATIVECATEGORYCODE$2);
                }
                target.setEnumValue(administrativeCategoryCode);
            }
        }
        
        /**
         * Sets (as xml) the "AdministrativeCategoryCode" element
         */
        public void xsetAdministrativeCategoryCode(uk.nhs.nhsia.datastandards.ecds.AdministrativeCategoryCodeType administrativeCategoryCode)
        {
            synchronized (monitor())
            {
                check_orphaned();
                uk.nhs.nhsia.datastandards.ecds.AdministrativeCategoryCodeType target = null;
                target = (uk.nhs.nhsia.datastandards.ecds.AdministrativeCategoryCodeType)get_store().find_element_user(ADMINISTRATIVECATEGORYCODE$2, 0);
                if (target == null)
                {
                    target = (uk.nhs.nhsia.datastandards.ecds.AdministrativeCategoryCodeType)get_store().add_element_user(ADMINISTRATIVECATEGORYCODE$2);
                }
                target.set(administrativeCategoryCode);
            }
        }
        
        /**
         * Unsets the "AdministrativeCategoryCode" element
         */
        public void unsetAdministrativeCategoryCode()
        {
            synchronized (monitor())
            {
                check_orphaned();
                get_store().remove_element(ADMINISTRATIVECATEGORYCODE$2, 0);
            }
        }
        
        /**
         * Gets the "AttendedOrDidNotAttendCode" element
         */
        public uk.nhs.nhsia.datastandards.ecds.AttendedOrDidNotAttendCodeType.Enum getAttendedOrDidNotAttendCode()
        {
            synchronized (monitor())
            {
                check_orphaned();
                org.apache.xmlbeans.SimpleValue target = null;
                target = (org.apache.xmlbeans.SimpleValue)get_store().find_element_user(ATTENDEDORDIDNOTATTENDCODE$4, 0);
                if (target == null)
                {
                    return null;
                }
                return (uk.nhs.nhsia.datastandards.ecds.AttendedOrDidNotAttendCodeType.Enum)target.getEnumValue();
            }
        }
        
        /**
         * Gets (as xml) the "AttendedOrDidNotAttendCode" element
         */
        public uk.nhs.nhsia.datastandards.ecds.AttendedOrDidNotAttendCodeType xgetAttendedOrDidNotAttendCode()
        {
            synchronized (monitor())
            {
                check_orphaned();
                uk.nhs.nhsia.datastandards.ecds.AttendedOrDidNotAttendCodeType target = null;
                target = (uk.nhs.nhsia.datastandards.ecds.AttendedOrDidNotAttendCodeType)get_store().find_element_user(ATTENDEDORDIDNOTATTENDCODE$4, 0);
                return target;
            }
        }
        
        /**
         * True if has "AttendedOrDidNotAttendCode" element
         */
        public boolean isSetAttendedOrDidNotAttendCode()
        {
            synchronized (monitor())
            {
                check_orphaned();
                return get_store().count_elements(ATTENDEDORDIDNOTATTENDCODE$4) != 0;
            }
        }
        
        /**
         * Sets the "AttendedOrDidNotAttendCode" element
         */
        public void setAttendedOrDidNotAttendCode(uk.nhs.nhsia.datastandards.ecds.AttendedOrDidNotAttendCodeType.Enum attendedOrDidNotAttendCode)
        {
            synchronized (monitor())
            {
                check_orphaned();
                org.apache.xmlbeans.SimpleValue target = null;
                target = (org.apache.xmlbeans.SimpleValue)get_store().find_element_user(ATTENDEDORDIDNOTATTENDCODE$4, 0);
                if (target == null)
                {
                    target = (org.apache.xmlbeans.SimpleValue)get_store().add_element_user(ATTENDEDORDIDNOTATTENDCODE$4);
                }
                target.setEnumValue(attendedOrDidNotAttendCode);
            }
        }
        
        /**
         * Sets (as xml) the "AttendedOrDidNotAttendCode" element
         */
        public void xsetAttendedOrDidNotAttendCode(uk.nhs.nhsia.datastandards.ecds.AttendedOrDidNotAttendCodeType attendedOrDidNotAttendCode)
        {
            synchronized (monitor())
            {
                check_orphaned();
                uk.nhs.nhsia.datastandards.ecds.AttendedOrDidNotAttendCodeType target = null;
                target = (uk.nhs.nhsia.datastandards.ecds.AttendedOrDidNotAttendCodeType)get_store().find_element_user(ATTENDEDORDIDNOTATTENDCODE$4, 0);
                if (target == null)
                {
                    target = (uk.nhs.nhsia.datastandards.ecds.AttendedOrDidNotAttendCodeType)get_store().add_element_user(ATTENDEDORDIDNOTATTENDCODE$4);
                }
                target.set(attendedOrDidNotAttendCode);
            }
        }
        
        /**
         * Unsets the "AttendedOrDidNotAttendCode" element
         */
        public void unsetAttendedOrDidNotAttendCode()
        {
            synchronized (monitor())
            {
                check_orphaned();
                get_store().remove_element(ATTENDEDORDIDNOTATTENDCODE$4, 0);
            }
        }
        
        /**
         * Gets the "FirstAttendanceCode" element
         */
        public uk.nhs.nhsia.datastandards.ecds.FirstAttendanceCodeType.Enum getFirstAttendanceCode()
        {
            synchronized (monitor())
            {
                check_orphaned();
                org.apache.xmlbeans.SimpleValue target = null;
                target = (org.apache.xmlbeans.SimpleValue)get_store().find_element_user(FIRSTATTENDANCECODE$6, 0);
                if (target == null)
                {
                    return null;
                }
                return (uk.nhs.nhsia.datastandards.ecds.FirstAttendanceCodeType.Enum)target.getEnumValue();
            }
        }
        
        /**
         * Gets (as xml) the "FirstAttendanceCode" element
         */
        public uk.nhs.nhsia.datastandards.ecds.FirstAttendanceCodeType xgetFirstAttendanceCode()
        {
            synchronized (monitor())
            {
                check_orphaned();
                uk.nhs.nhsia.datastandards.ecds.FirstAttendanceCodeType target = null;
                target = (uk.nhs.nhsia.datastandards.ecds.FirstAttendanceCodeType)get_store().find_element_user(FIRSTATTENDANCECODE$6, 0);
                return target;
            }
        }
        
        /**
         * True if has "FirstAttendanceCode" element
         */
        public boolean isSetFirstAttendanceCode()
        {
            synchronized (monitor())
            {
                check_orphaned();
                return get_store().count_elements(FIRSTATTENDANCECODE$6) != 0;
            }
        }
        
        /**
         * Sets the "FirstAttendanceCode" element
         */
        public void setFirstAttendanceCode(uk.nhs.nhsia.datastandards.ecds.FirstAttendanceCodeType.Enum firstAttendanceCode)
        {
            synchronized (monitor())
            {
                check_orphaned();
                org.apache.xmlbeans.SimpleValue target = null;
                target = (org.apache.xmlbeans.SimpleValue)get_store().find_element_user(FIRSTATTENDANCECODE$6, 0);
                if (target == null)
                {
                    target = (org.apache.xmlbeans.SimpleValue)get_store().add_element_user(FIRSTATTENDANCECODE$6);
                }
                target.setEnumValue(firstAttendanceCode);
            }
        }
        
        /**
         * Sets (as xml) the "FirstAttendanceCode" element
         */
        public void xsetFirstAttendanceCode(uk.nhs.nhsia.datastandards.ecds.FirstAttendanceCodeType firstAttendanceCode)
        {
            synchronized (monitor())
            {
                check_orphaned();
                uk.nhs.nhsia.datastandards.ecds.FirstAttendanceCodeType target = null;
                target = (uk.nhs.nhsia.datastandards.ecds.FirstAttendanceCodeType)get_store().find_element_user(FIRSTATTENDANCECODE$6, 0);
                if (target == null)
                {
                    target = (uk.nhs.nhsia.datastandards.ecds.FirstAttendanceCodeType)get_store().add_element_user(FIRSTATTENDANCECODE$6);
                }
                target.set(firstAttendanceCode);
            }
        }
        
        /**
         * Unsets the "FirstAttendanceCode" element
         */
        public void unsetFirstAttendanceCode()
        {
            synchronized (monitor())
            {
                check_orphaned();
                get_store().remove_element(FIRSTATTENDANCECODE$6, 0);
            }
        }
        
        /**
         * Gets the "MedicalStaffTypeSeeingPatient" element
         */
        public uk.nhs.nhsia.datastandards.ecds.MedicalStaffTypeSeeingPatientType.Enum getMedicalStaffTypeSeeingPatient()
        {
            synchronized (monitor())
            {
                check_orphaned();
                org.apache.xmlbeans.SimpleValue target = null;
                target = (org.apache.xmlbeans.SimpleValue)get_store().find_element_user(MEDICALSTAFFTYPESEEINGPATIENT$8, 0);
                if (target == null)
                {
                    return null;
                }
                return (uk.nhs.nhsia.datastandards.ecds.MedicalStaffTypeSeeingPatientType.Enum)target.getEnumValue();
            }
        }
        
        /**
         * Gets (as xml) the "MedicalStaffTypeSeeingPatient" element
         */
        public uk.nhs.nhsia.datastandards.ecds.MedicalStaffTypeSeeingPatientType xgetMedicalStaffTypeSeeingPatient()
        {
            synchronized (monitor())
            {
                check_orphaned();
                uk.nhs.nhsia.datastandards.ecds.MedicalStaffTypeSeeingPatientType target = null;
                target = (uk.nhs.nhsia.datastandards.ecds.MedicalStaffTypeSeeingPatientType)get_store().find_element_user(MEDICALSTAFFTYPESEEINGPATIENT$8, 0);
                return target;
            }
        }
        
        /**
         * True if has "MedicalStaffTypeSeeingPatient" element
         */
        public boolean isSetMedicalStaffTypeSeeingPatient()
        {
            synchronized (monitor())
            {
                check_orphaned();
                return get_store().count_elements(MEDICALSTAFFTYPESEEINGPATIENT$8) != 0;
            }
        }
        
        /**
         * Sets the "MedicalStaffTypeSeeingPatient" element
         */
        public void setMedicalStaffTypeSeeingPatient(uk.nhs.nhsia.datastandards.ecds.MedicalStaffTypeSeeingPatientType.Enum medicalStaffTypeSeeingPatient)
        {
            synchronized (monitor())
            {
                check_orphaned();
                org.apache.xmlbeans.SimpleValue target = null;
                target = (org.apache.xmlbeans.SimpleValue)get_store().find_element_user(MEDICALSTAFFTYPESEEINGPATIENT$8, 0);
                if (target == null)
                {
                    target = (org.apache.xmlbeans.SimpleValue)get_store().add_element_user(MEDICALSTAFFTYPESEEINGPATIENT$8);
                }
                target.setEnumValue(medicalStaffTypeSeeingPatient);
            }
        }
        
        /**
         * Sets (as xml) the "MedicalStaffTypeSeeingPatient" element
         */
        public void xsetMedicalStaffTypeSeeingPatient(uk.nhs.nhsia.datastandards.ecds.MedicalStaffTypeSeeingPatientType medicalStaffTypeSeeingPatient)
        {
            synchronized (monitor())
            {
                check_orphaned();
                uk.nhs.nhsia.datastandards.ecds.MedicalStaffTypeSeeingPatientType target = null;
                target = (uk.nhs.nhsia.datastandards.ecds.MedicalStaffTypeSeeingPatientType)get_store().find_element_user(MEDICALSTAFFTYPESEEINGPATIENT$8, 0);
                if (target == null)
                {
                    target = (uk.nhs.nhsia.datastandards.ecds.MedicalStaffTypeSeeingPatientType)get_store().add_element_user(MEDICALSTAFFTYPESEEINGPATIENT$8);
                }
                target.set(medicalStaffTypeSeeingPatient);
            }
        }
        
        /**
         * Unsets the "MedicalStaffTypeSeeingPatient" element
         */
        public void unsetMedicalStaffTypeSeeingPatient()
        {
            synchronized (monitor())
            {
                check_orphaned();
                get_store().remove_element(MEDICALSTAFFTYPESEEINGPATIENT$8, 0);
            }
        }
        
        /**
         * Gets the "OperationStatusCode" element
         */
        public uk.nhs.nhsia.datastandards.ecds.OperationStatusCodeType.Enum getOperationStatusCode()
        {
            synchronized (monitor())
            {
                check_orphaned();
                org.apache.xmlbeans.SimpleValue target = null;
                target = (org.apache.xmlbeans.SimpleValue)get_store().find_element_user(OPERATIONSTATUSCODE$10, 0);
                if (target == null)
                {
                    return null;
                }
                return (uk.nhs.nhsia.datastandards.ecds.OperationStatusCodeType.Enum)target.getEnumValue();
            }
        }
        
        /**
         * Gets (as xml) the "OperationStatusCode" element
         */
        public uk.nhs.nhsia.datastandards.ecds.OperationStatusCodeType xgetOperationStatusCode()
        {
            synchronized (monitor())
            {
                check_orphaned();
                uk.nhs.nhsia.datastandards.ecds.OperationStatusCodeType target = null;
                target = (uk.nhs.nhsia.datastandards.ecds.OperationStatusCodeType)get_store().find_element_user(OPERATIONSTATUSCODE$10, 0);
                return target;
            }
        }
        
        /**
         * True if has "OperationStatusCode" element
         */
        public boolean isSetOperationStatusCode()
        {
            synchronized (monitor())
            {
                check_orphaned();
                return get_store().count_elements(OPERATIONSTATUSCODE$10) != 0;
            }
        }
        
        /**
         * Sets the "OperationStatusCode" element
         */
        public void setOperationStatusCode(uk.nhs.nhsia.datastandards.ecds.OperationStatusCodeType.Enum operationStatusCode)
        {
            synchronized (monitor())
            {
                check_orphaned();
                org.apache.xmlbeans.SimpleValue target = null;
                target = (org.apache.xmlbeans.SimpleValue)get_store().find_element_user(OPERATIONSTATUSCODE$10, 0);
                if (target == null)
                {
                    target = (org.apache.xmlbeans.SimpleValue)get_store().add_element_user(OPERATIONSTATUSCODE$10);
                }
                target.setEnumValue(operationStatusCode);
            }
        }
        
        /**
         * Sets (as xml) the "OperationStatusCode" element
         */
        public void xsetOperationStatusCode(uk.nhs.nhsia.datastandards.ecds.OperationStatusCodeType operationStatusCode)
        {
            synchronized (monitor())
            {
                check_orphaned();
                uk.nhs.nhsia.datastandards.ecds.OperationStatusCodeType target = null;
                target = (uk.nhs.nhsia.datastandards.ecds.OperationStatusCodeType)get_store().find_element_user(OPERATIONSTATUSCODE$10, 0);
                if (target == null)
                {
                    target = (uk.nhs.nhsia.datastandards.ecds.OperationStatusCodeType)get_store().add_element_user(OPERATIONSTATUSCODE$10);
                }
                target.set(operationStatusCode);
            }
        }
        
        /**
         * Unsets the "OperationStatusCode" element
         */
        public void unsetOperationStatusCode()
        {
            synchronized (monitor())
            {
                check_orphaned();
                get_store().remove_element(OPERATIONSTATUSCODE$10, 0);
            }
        }
        
        /**
         * Gets the "OutcomeOfAttendanceCode" element
         */
        public uk.nhs.nhsia.datastandards.ecds.OutcomeOfAttendanceCodeType.Enum getOutcomeOfAttendanceCode()
        {
            synchronized (monitor())
            {
                check_orphaned();
                org.apache.xmlbeans.SimpleValue target = null;
                target = (org.apache.xmlbeans.SimpleValue)get_store().find_element_user(OUTCOMEOFATTENDANCECODE$12, 0);
                if (target == null)
                {
                    return null;
                }
                return (uk.nhs.nhsia.datastandards.ecds.OutcomeOfAttendanceCodeType.Enum)target.getEnumValue();
            }
        }
        
        /**
         * Gets (as xml) the "OutcomeOfAttendanceCode" element
         */
        public uk.nhs.nhsia.datastandards.ecds.OutcomeOfAttendanceCodeType xgetOutcomeOfAttendanceCode()
        {
            synchronized (monitor())
            {
                check_orphaned();
                uk.nhs.nhsia.datastandards.ecds.OutcomeOfAttendanceCodeType target = null;
                target = (uk.nhs.nhsia.datastandards.ecds.OutcomeOfAttendanceCodeType)get_store().find_element_user(OUTCOMEOFATTENDANCECODE$12, 0);
                return target;
            }
        }
        
        /**
         * True if has "OutcomeOfAttendanceCode" element
         */
        public boolean isSetOutcomeOfAttendanceCode()
        {
            synchronized (monitor())
            {
                check_orphaned();
                return get_store().count_elements(OUTCOMEOFATTENDANCECODE$12) != 0;
            }
        }
        
        /**
         * Sets the "OutcomeOfAttendanceCode" element
         */
        public void setOutcomeOfAttendanceCode(uk.nhs.nhsia.datastandards.ecds.OutcomeOfAttendanceCodeType.Enum outcomeOfAttendanceCode)
        {
            synchronized (monitor())
            {
                check_orphaned();
                org.apache.xmlbeans.SimpleValue target = null;
                target = (org.apache.xmlbeans.SimpleValue)get_store().find_element_user(OUTCOMEOFATTENDANCECODE$12, 0);
                if (target == null)
                {
                    target = (org.apache.xmlbeans.SimpleValue)get_store().add_element_user(OUTCOMEOFATTENDANCECODE$12);
                }
                target.setEnumValue(outcomeOfAttendanceCode);
            }
        }
        
        /**
         * Sets (as xml) the "OutcomeOfAttendanceCode" element
         */
        public void xsetOutcomeOfAttendanceCode(uk.nhs.nhsia.datastandards.ecds.OutcomeOfAttendanceCodeType outcomeOfAttendanceCode)
        {
            synchronized (monitor())
            {
                check_orphaned();
                uk.nhs.nhsia.datastandards.ecds.OutcomeOfAttendanceCodeType target = null;
                target = (uk.nhs.nhsia.datastandards.ecds.OutcomeOfAttendanceCodeType)get_store().find_element_user(OUTCOMEOFATTENDANCECODE$12, 0);
                if (target == null)
                {
                    target = (uk.nhs.nhsia.datastandards.ecds.OutcomeOfAttendanceCodeType)get_store().add_element_user(OUTCOMEOFATTENDANCECODE$12);
                }
                target.set(outcomeOfAttendanceCode);
            }
        }
        
        /**
         * Unsets the "OutcomeOfAttendanceCode" element
         */
        public void unsetOutcomeOfAttendanceCode()
        {
            synchronized (monitor())
            {
                check_orphaned();
                get_store().remove_element(OUTCOMEOFATTENDANCECODE$12, 0);
            }
        }
        
        /**
         * Gets the "AppointmentDate" element
         */
        public java.util.Calendar getAppointmentDate()
        {
            synchronized (monitor())
            {
                check_orphaned();
                org.apache.xmlbeans.SimpleValue target = null;
                target = (org.apache.xmlbeans.SimpleValue)get_store().find_element_user(APPOINTMENTDATE$14, 0);
                if (target == null)
                {
                    return null;
                }
                return target.getCalendarValue();
            }
        }
        
        /**
         * Gets (as xml) the "AppointmentDate" element
         */
        public uk.nhs.nhsia.datastandards.ecds.AppointmentDateType xgetAppointmentDate()
        {
            synchronized (monitor())
            {
                check_orphaned();
                uk.nhs.nhsia.datastandards.ecds.AppointmentDateType target = null;
                target = (uk.nhs.nhsia.datastandards.ecds.AppointmentDateType)get_store().find_element_user(APPOINTMENTDATE$14, 0);
                return target;
            }
        }
        
        /**
         * Sets the "AppointmentDate" element
         */
        public void setAppointmentDate(java.util.Calendar appointmentDate)
        {
            synchronized (monitor())
            {
                check_orphaned();
                org.apache.xmlbeans.SimpleValue target = null;
                target = (org.apache.xmlbeans.SimpleValue)get_store().find_element_user(APPOINTMENTDATE$14, 0);
                if (target == null)
                {
                    target = (org.apache.xmlbeans.SimpleValue)get_store().add_element_user(APPOINTMENTDATE$14);
                }
                target.setCalendarValue(appointmentDate);
            }
        }
        
        /**
         * Sets (as xml) the "AppointmentDate" element
         */
        public void xsetAppointmentDate(uk.nhs.nhsia.datastandards.ecds.AppointmentDateType appointmentDate)
        {
            synchronized (monitor())
            {
                check_orphaned();
                uk.nhs.nhsia.datastandards.ecds.AppointmentDateType target = null;
                target = (uk.nhs.nhsia.datastandards.ecds.AppointmentDateType)get_store().find_element_user(APPOINTMENTDATE$14, 0);
                if (target == null)
                {
                    target = (uk.nhs.nhsia.datastandards.ecds.AppointmentDateType)get_store().add_element_user(APPOINTMENTDATE$14);
                }
                target.set(appointmentDate);
            }
        }
        
        /**
         * Gets the "AppointmentTime" element
         */
        public java.util.Calendar getAppointmentTime()
        {
            synchronized (monitor())
            {
                check_orphaned();
                org.apache.xmlbeans.SimpleValue target = null;
                target = (org.apache.xmlbeans.SimpleValue)get_store().find_element_user(APPOINTMENTTIME$16, 0);
                if (target == null)
                {
                    return null;
                }
                return target.getCalendarValue();
            }
        }
        
        /**
         * Gets (as xml) the "AppointmentTime" element
         */
        public uk.nhs.nhsia.datastandards.ecds.AppointmentTimeType xgetAppointmentTime()
        {
            synchronized (monitor())
            {
                check_orphaned();
                uk.nhs.nhsia.datastandards.ecds.AppointmentTimeType target = null;
                target = (uk.nhs.nhsia.datastandards.ecds.AppointmentTimeType)get_store().find_element_user(APPOINTMENTTIME$16, 0);
                return target;
            }
        }
        
        /**
         * True if has "AppointmentTime" element
         */
        public boolean isSetAppointmentTime()
        {
            synchronized (monitor())
            {
                check_orphaned();
                return get_store().count_elements(APPOINTMENTTIME$16) != 0;
            }
        }
        
        /**
         * Sets the "AppointmentTime" element
         */
        public void setAppointmentTime(java.util.Calendar appointmentTime)
        {
            synchronized (monitor())
            {
                check_orphaned();
                org.apache.xmlbeans.SimpleValue target = null;
                target = (org.apache.xmlbeans.SimpleValue)get_store().find_element_user(APPOINTMENTTIME$16, 0);
                if (target == null)
                {
                    target = (org.apache.xmlbeans.SimpleValue)get_store().add_element_user(APPOINTMENTTIME$16);
                }
                target.setCalendarValue(appointmentTime);
            }
        }
        
        /**
         * Sets (as xml) the "AppointmentTime" element
         */
        public void xsetAppointmentTime(uk.nhs.nhsia.datastandards.ecds.AppointmentTimeType appointmentTime)
        {
            synchronized (monitor())
            {
                check_orphaned();
                uk.nhs.nhsia.datastandards.ecds.AppointmentTimeType target = null;
                target = (uk.nhs.nhsia.datastandards.ecds.AppointmentTimeType)get_store().find_element_user(APPOINTMENTTIME$16, 0);
                if (target == null)
                {
                    target = (uk.nhs.nhsia.datastandards.ecds.AppointmentTimeType)get_store().add_element_user(APPOINTMENTTIME$16);
                }
                target.set(appointmentTime);
            }
        }
        
        /**
         * Unsets the "AppointmentTime" element
         */
        public void unsetAppointmentTime()
        {
            synchronized (monitor())
            {
                check_orphaned();
                get_store().remove_element(APPOINTMENTTIME$16, 0);
            }
        }
        
        /**
         * Gets the "ExpectedDurationOfAppointment" element
         */
        public int getExpectedDurationOfAppointment()
        {
            synchronized (monitor())
            {
                check_orphaned();
                org.apache.xmlbeans.SimpleValue target = null;
                target = (org.apache.xmlbeans.SimpleValue)get_store().find_element_user(EXPECTEDDURATIONOFAPPOINTMENT$18, 0);
                if (target == null)
                {
                    return 0;
                }
                return target.getIntValue();
            }
        }
        
        /**
         * Gets (as xml) the "ExpectedDurationOfAppointment" element
         */
        public uk.nhs.nhsia.datastandards.ecds.ExpectedDurationOfAppointmentType xgetExpectedDurationOfAppointment()
        {
            synchronized (monitor())
            {
                check_orphaned();
                uk.nhs.nhsia.datastandards.ecds.ExpectedDurationOfAppointmentType target = null;
                target = (uk.nhs.nhsia.datastandards.ecds.ExpectedDurationOfAppointmentType)get_store().find_element_user(EXPECTEDDURATIONOFAPPOINTMENT$18, 0);
                return target;
            }
        }
        
        /**
         * True if has "ExpectedDurationOfAppointment" element
         */
        public boolean isSetExpectedDurationOfAppointment()
        {
            synchronized (monitor())
            {
                check_orphaned();
                return get_store().count_elements(EXPECTEDDURATIONOFAPPOINTMENT$18) != 0;
            }
        }
        
        /**
         * Sets the "ExpectedDurationOfAppointment" element
         */
        public void setExpectedDurationOfAppointment(int expectedDurationOfAppointment)
        {
            synchronized (monitor())
            {
                check_orphaned();
                org.apache.xmlbeans.SimpleValue target = null;
                target = (org.apache.xmlbeans.SimpleValue)get_store().find_element_user(EXPECTEDDURATIONOFAPPOINTMENT$18, 0);
                if (target == null)
                {
                    target = (org.apache.xmlbeans.SimpleValue)get_store().add_element_user(EXPECTEDDURATIONOFAPPOINTMENT$18);
                }
                target.setIntValue(expectedDurationOfAppointment);
            }
        }
        
        /**
         * Sets (as xml) the "ExpectedDurationOfAppointment" element
         */
        public void xsetExpectedDurationOfAppointment(uk.nhs.nhsia.datastandards.ecds.ExpectedDurationOfAppointmentType expectedDurationOfAppointment)
        {
            synchronized (monitor())
            {
                check_orphaned();
                uk.nhs.nhsia.datastandards.ecds.ExpectedDurationOfAppointmentType target = null;
                target = (uk.nhs.nhsia.datastandards.ecds.ExpectedDurationOfAppointmentType)get_store().find_element_user(EXPECTEDDURATIONOFAPPOINTMENT$18, 0);
                if (target == null)
                {
                    target = (uk.nhs.nhsia.datastandards.ecds.ExpectedDurationOfAppointmentType)get_store().add_element_user(EXPECTEDDURATIONOFAPPOINTMENT$18);
                }
                target.set(expectedDurationOfAppointment);
            }
        }
        
        /**
         * Unsets the "ExpectedDurationOfAppointment" element
         */
        public void unsetExpectedDurationOfAppointment()
        {
            synchronized (monitor())
            {
                check_orphaned();
                get_store().remove_element(EXPECTEDDURATIONOFAPPOINTMENT$18, 0);
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
         * Gets the "EarliestReasonableOfferDate" element
         */
        public java.util.Calendar getEarliestReasonableOfferDate()
        {
            synchronized (monitor())
            {
                check_orphaned();
                org.apache.xmlbeans.SimpleValue target = null;
                target = (org.apache.xmlbeans.SimpleValue)get_store().find_element_user(EARLIESTREASONABLEOFFERDATE$24, 0);
                if (target == null)
                {
                    return null;
                }
                return target.getCalendarValue();
            }
        }
        
        /**
         * Gets (as xml) the "EarliestReasonableOfferDate" element
         */
        public uk.nhs.nhsia.datastandards.ecds.EarliestReasonableOfferDateType xgetEarliestReasonableOfferDate()
        {
            synchronized (monitor())
            {
                check_orphaned();
                uk.nhs.nhsia.datastandards.ecds.EarliestReasonableOfferDateType target = null;
                target = (uk.nhs.nhsia.datastandards.ecds.EarliestReasonableOfferDateType)get_store().find_element_user(EARLIESTREASONABLEOFFERDATE$24, 0);
                return target;
            }
        }
        
        /**
         * True if has "EarliestReasonableOfferDate" element
         */
        public boolean isSetEarliestReasonableOfferDate()
        {
            synchronized (monitor())
            {
                check_orphaned();
                return get_store().count_elements(EARLIESTREASONABLEOFFERDATE$24) != 0;
            }
        }
        
        /**
         * Sets the "EarliestReasonableOfferDate" element
         */
        public void setEarliestReasonableOfferDate(java.util.Calendar earliestReasonableOfferDate)
        {
            synchronized (monitor())
            {
                check_orphaned();
                org.apache.xmlbeans.SimpleValue target = null;
                target = (org.apache.xmlbeans.SimpleValue)get_store().find_element_user(EARLIESTREASONABLEOFFERDATE$24, 0);
                if (target == null)
                {
                    target = (org.apache.xmlbeans.SimpleValue)get_store().add_element_user(EARLIESTREASONABLEOFFERDATE$24);
                }
                target.setCalendarValue(earliestReasonableOfferDate);
            }
        }
        
        /**
         * Sets (as xml) the "EarliestReasonableOfferDate" element
         */
        public void xsetEarliestReasonableOfferDate(uk.nhs.nhsia.datastandards.ecds.EarliestReasonableOfferDateType earliestReasonableOfferDate)
        {
            synchronized (monitor())
            {
                check_orphaned();
                uk.nhs.nhsia.datastandards.ecds.EarliestReasonableOfferDateType target = null;
                target = (uk.nhs.nhsia.datastandards.ecds.EarliestReasonableOfferDateType)get_store().find_element_user(EARLIESTREASONABLEOFFERDATE$24, 0);
                if (target == null)
                {
                    target = (uk.nhs.nhsia.datastandards.ecds.EarliestReasonableOfferDateType)get_store().add_element_user(EARLIESTREASONABLEOFFERDATE$24);
                }
                target.set(earliestReasonableOfferDate);
            }
        }
        
        /**
         * Unsets the "EarliestReasonableOfferDate" element
         */
        public void unsetEarliestReasonableOfferDate()
        {
            synchronized (monitor())
            {
                check_orphaned();
                get_store().remove_element(EARLIESTREASONABLEOFFERDATE$24, 0);
            }
        }
        
        /**
         * Gets the "EarliestClinicallyAppropriateDate" element
         */
        public java.util.Calendar getEarliestClinicallyAppropriateDate()
        {
            synchronized (monitor())
            {
                check_orphaned();
                org.apache.xmlbeans.SimpleValue target = null;
                target = (org.apache.xmlbeans.SimpleValue)get_store().find_element_user(EARLIESTCLINICALLYAPPROPRIATEDATE$26, 0);
                if (target == null)
                {
                    return null;
                }
                return target.getCalendarValue();
            }
        }
        
        /**
         * Gets (as xml) the "EarliestClinicallyAppropriateDate" element
         */
        public uk.nhs.nhsia.datastandards.ecds.EarliestClinicallyAppropriateDateType xgetEarliestClinicallyAppropriateDate()
        {
            synchronized (monitor())
            {
                check_orphaned();
                uk.nhs.nhsia.datastandards.ecds.EarliestClinicallyAppropriateDateType target = null;
                target = (uk.nhs.nhsia.datastandards.ecds.EarliestClinicallyAppropriateDateType)get_store().find_element_user(EARLIESTCLINICALLYAPPROPRIATEDATE$26, 0);
                return target;
            }
        }
        
        /**
         * True if has "EarliestClinicallyAppropriateDate" element
         */
        public boolean isSetEarliestClinicallyAppropriateDate()
        {
            synchronized (monitor())
            {
                check_orphaned();
                return get_store().count_elements(EARLIESTCLINICALLYAPPROPRIATEDATE$26) != 0;
            }
        }
        
        /**
         * Sets the "EarliestClinicallyAppropriateDate" element
         */
        public void setEarliestClinicallyAppropriateDate(java.util.Calendar earliestClinicallyAppropriateDate)
        {
            synchronized (monitor())
            {
                check_orphaned();
                org.apache.xmlbeans.SimpleValue target = null;
                target = (org.apache.xmlbeans.SimpleValue)get_store().find_element_user(EARLIESTCLINICALLYAPPROPRIATEDATE$26, 0);
                if (target == null)
                {
                    target = (org.apache.xmlbeans.SimpleValue)get_store().add_element_user(EARLIESTCLINICALLYAPPROPRIATEDATE$26);
                }
                target.setCalendarValue(earliestClinicallyAppropriateDate);
            }
        }
        
        /**
         * Sets (as xml) the "EarliestClinicallyAppropriateDate" element
         */
        public void xsetEarliestClinicallyAppropriateDate(uk.nhs.nhsia.datastandards.ecds.EarliestClinicallyAppropriateDateType earliestClinicallyAppropriateDate)
        {
            synchronized (monitor())
            {
                check_orphaned();
                uk.nhs.nhsia.datastandards.ecds.EarliestClinicallyAppropriateDateType target = null;
                target = (uk.nhs.nhsia.datastandards.ecds.EarliestClinicallyAppropriateDateType)get_store().find_element_user(EARLIESTCLINICALLYAPPROPRIATEDATE$26, 0);
                if (target == null)
                {
                    target = (uk.nhs.nhsia.datastandards.ecds.EarliestClinicallyAppropriateDateType)get_store().add_element_user(EARLIESTCLINICALLYAPPROPRIATEDATE$26);
                }
                target.set(earliestClinicallyAppropriateDate);
            }
        }
        
        /**
         * Unsets the "EarliestClinicallyAppropriateDate" element
         */
        public void unsetEarliestClinicallyAppropriateDate()
        {
            synchronized (monitor())
            {
                check_orphaned();
                get_store().remove_element(EARLIESTCLINICALLYAPPROPRIATEDATE$26, 0);
            }
        }
        
        /**
         * Gets the "ConsultationMediumUsed" element
         */
        public uk.nhs.nhsia.datastandards.ecds.ConsultationMediumUsedType.Enum getConsultationMediumUsed()
        {
            synchronized (monitor())
            {
                check_orphaned();
                org.apache.xmlbeans.SimpleValue target = null;
                target = (org.apache.xmlbeans.SimpleValue)get_store().find_element_user(CONSULTATIONMEDIUMUSED$28, 0);
                if (target == null)
                {
                    return null;
                }
                return (uk.nhs.nhsia.datastandards.ecds.ConsultationMediumUsedType.Enum)target.getEnumValue();
            }
        }
        
        /**
         * Gets (as xml) the "ConsultationMediumUsed" element
         */
        public uk.nhs.nhsia.datastandards.ecds.ConsultationMediumUsedType xgetConsultationMediumUsed()
        {
            synchronized (monitor())
            {
                check_orphaned();
                uk.nhs.nhsia.datastandards.ecds.ConsultationMediumUsedType target = null;
                target = (uk.nhs.nhsia.datastandards.ecds.ConsultationMediumUsedType)get_store().find_element_user(CONSULTATIONMEDIUMUSED$28, 0);
                return target;
            }
        }
        
        /**
         * True if has "ConsultationMediumUsed" element
         */
        public boolean isSetConsultationMediumUsed()
        {
            synchronized (monitor())
            {
                check_orphaned();
                return get_store().count_elements(CONSULTATIONMEDIUMUSED$28) != 0;
            }
        }
        
        /**
         * Sets the "ConsultationMediumUsed" element
         */
        public void setConsultationMediumUsed(uk.nhs.nhsia.datastandards.ecds.ConsultationMediumUsedType.Enum consultationMediumUsed)
        {
            synchronized (monitor())
            {
                check_orphaned();
                org.apache.xmlbeans.SimpleValue target = null;
                target = (org.apache.xmlbeans.SimpleValue)get_store().find_element_user(CONSULTATIONMEDIUMUSED$28, 0);
                if (target == null)
                {
                    target = (org.apache.xmlbeans.SimpleValue)get_store().add_element_user(CONSULTATIONMEDIUMUSED$28);
                }
                target.setEnumValue(consultationMediumUsed);
            }
        }
        
        /**
         * Sets (as xml) the "ConsultationMediumUsed" element
         */
        public void xsetConsultationMediumUsed(uk.nhs.nhsia.datastandards.ecds.ConsultationMediumUsedType consultationMediumUsed)
        {
            synchronized (monitor())
            {
                check_orphaned();
                uk.nhs.nhsia.datastandards.ecds.ConsultationMediumUsedType target = null;
                target = (uk.nhs.nhsia.datastandards.ecds.ConsultationMediumUsedType)get_store().find_element_user(CONSULTATIONMEDIUMUSED$28, 0);
                if (target == null)
                {
                    target = (uk.nhs.nhsia.datastandards.ecds.ConsultationMediumUsedType)get_store().add_element_user(CONSULTATIONMEDIUMUSED$28);
                }
                target.set(consultationMediumUsed);
            }
        }
        
        /**
         * Unsets the "ConsultationMediumUsed" element
         */
        public void unsetConsultationMediumUsed()
        {
            synchronized (monitor())
            {
                check_orphaned();
                get_store().remove_element(CONSULTATIONMEDIUMUSED$28, 0);
            }
        }
        
        /**
         * Gets the "MultiProfOrDiscIndCode" element
         */
        public uk.nhs.nhsia.datastandards.ecds.MultiProfOrDiscIndCodeType.Enum getMultiProfOrDiscIndCode()
        {
            synchronized (monitor())
            {
                check_orphaned();
                org.apache.xmlbeans.SimpleValue target = null;
                target = (org.apache.xmlbeans.SimpleValue)get_store().find_element_user(MULTIPROFORDISCINDCODE$30, 0);
                if (target == null)
                {
                    return null;
                }
                return (uk.nhs.nhsia.datastandards.ecds.MultiProfOrDiscIndCodeType.Enum)target.getEnumValue();
            }
        }
        
        /**
         * Gets (as xml) the "MultiProfOrDiscIndCode" element
         */
        public uk.nhs.nhsia.datastandards.ecds.MultiProfOrDiscIndCodeType xgetMultiProfOrDiscIndCode()
        {
            synchronized (monitor())
            {
                check_orphaned();
                uk.nhs.nhsia.datastandards.ecds.MultiProfOrDiscIndCodeType target = null;
                target = (uk.nhs.nhsia.datastandards.ecds.MultiProfOrDiscIndCodeType)get_store().find_element_user(MULTIPROFORDISCINDCODE$30, 0);
                return target;
            }
        }
        
        /**
         * True if has "MultiProfOrDiscIndCode" element
         */
        public boolean isSetMultiProfOrDiscIndCode()
        {
            synchronized (monitor())
            {
                check_orphaned();
                return get_store().count_elements(MULTIPROFORDISCINDCODE$30) != 0;
            }
        }
        
        /**
         * Sets the "MultiProfOrDiscIndCode" element
         */
        public void setMultiProfOrDiscIndCode(uk.nhs.nhsia.datastandards.ecds.MultiProfOrDiscIndCodeType.Enum multiProfOrDiscIndCode)
        {
            synchronized (monitor())
            {
                check_orphaned();
                org.apache.xmlbeans.SimpleValue target = null;
                target = (org.apache.xmlbeans.SimpleValue)get_store().find_element_user(MULTIPROFORDISCINDCODE$30, 0);
                if (target == null)
                {
                    target = (org.apache.xmlbeans.SimpleValue)get_store().add_element_user(MULTIPROFORDISCINDCODE$30);
                }
                target.setEnumValue(multiProfOrDiscIndCode);
            }
        }
        
        /**
         * Sets (as xml) the "MultiProfOrDiscIndCode" element
         */
        public void xsetMultiProfOrDiscIndCode(uk.nhs.nhsia.datastandards.ecds.MultiProfOrDiscIndCodeType multiProfOrDiscIndCode)
        {
            synchronized (monitor())
            {
                check_orphaned();
                uk.nhs.nhsia.datastandards.ecds.MultiProfOrDiscIndCodeType target = null;
                target = (uk.nhs.nhsia.datastandards.ecds.MultiProfOrDiscIndCodeType)get_store().find_element_user(MULTIPROFORDISCINDCODE$30, 0);
                if (target == null)
                {
                    target = (uk.nhs.nhsia.datastandards.ecds.MultiProfOrDiscIndCodeType)get_store().add_element_user(MULTIPROFORDISCINDCODE$30);
                }
                target.set(multiProfOrDiscIndCode);
            }
        }
        
        /**
         * Unsets the "MultiProfOrDiscIndCode" element
         */
        public void unsetMultiProfOrDiscIndCode()
        {
            synchronized (monitor())
            {
                check_orphaned();
                get_store().remove_element(MULTIPROFORDISCINDCODE$30, 0);
            }
        }
        
        /**
         * Gets the "RehabilitationAssessmentTeamType" element
         */
        public uk.nhs.nhsia.datastandards.ecds.RehabilitationAssessmentTeamTypeType.Enum getRehabilitationAssessmentTeamType()
        {
            synchronized (monitor())
            {
                check_orphaned();
                org.apache.xmlbeans.SimpleValue target = null;
                target = (org.apache.xmlbeans.SimpleValue)get_store().find_element_user(REHABILITATIONASSESSMENTTEAMTYPE$32, 0);
                if (target == null)
                {
                    return null;
                }
                return (uk.nhs.nhsia.datastandards.ecds.RehabilitationAssessmentTeamTypeType.Enum)target.getEnumValue();
            }
        }
        
        /**
         * Gets (as xml) the "RehabilitationAssessmentTeamType" element
         */
        public uk.nhs.nhsia.datastandards.ecds.RehabilitationAssessmentTeamTypeType xgetRehabilitationAssessmentTeamType()
        {
            synchronized (monitor())
            {
                check_orphaned();
                uk.nhs.nhsia.datastandards.ecds.RehabilitationAssessmentTeamTypeType target = null;
                target = (uk.nhs.nhsia.datastandards.ecds.RehabilitationAssessmentTeamTypeType)get_store().find_element_user(REHABILITATIONASSESSMENTTEAMTYPE$32, 0);
                return target;
            }
        }
        
        /**
         * True if has "RehabilitationAssessmentTeamType" element
         */
        public boolean isSetRehabilitationAssessmentTeamType()
        {
            synchronized (monitor())
            {
                check_orphaned();
                return get_store().count_elements(REHABILITATIONASSESSMENTTEAMTYPE$32) != 0;
            }
        }
        
        /**
         * Sets the "RehabilitationAssessmentTeamType" element
         */
        public void setRehabilitationAssessmentTeamType(uk.nhs.nhsia.datastandards.ecds.RehabilitationAssessmentTeamTypeType.Enum rehabilitationAssessmentTeamType)
        {
            synchronized (monitor())
            {
                check_orphaned();
                org.apache.xmlbeans.SimpleValue target = null;
                target = (org.apache.xmlbeans.SimpleValue)get_store().find_element_user(REHABILITATIONASSESSMENTTEAMTYPE$32, 0);
                if (target == null)
                {
                    target = (org.apache.xmlbeans.SimpleValue)get_store().add_element_user(REHABILITATIONASSESSMENTTEAMTYPE$32);
                }
                target.setEnumValue(rehabilitationAssessmentTeamType);
            }
        }
        
        /**
         * Sets (as xml) the "RehabilitationAssessmentTeamType" element
         */
        public void xsetRehabilitationAssessmentTeamType(uk.nhs.nhsia.datastandards.ecds.RehabilitationAssessmentTeamTypeType rehabilitationAssessmentTeamType)
        {
            synchronized (monitor())
            {
                check_orphaned();
                uk.nhs.nhsia.datastandards.ecds.RehabilitationAssessmentTeamTypeType target = null;
                target = (uk.nhs.nhsia.datastandards.ecds.RehabilitationAssessmentTeamTypeType)get_store().find_element_user(REHABILITATIONASSESSMENTTEAMTYPE$32, 0);
                if (target == null)
                {
                    target = (uk.nhs.nhsia.datastandards.ecds.RehabilitationAssessmentTeamTypeType)get_store().add_element_user(REHABILITATIONASSESSMENTTEAMTYPE$32);
                }
                target.set(rehabilitationAssessmentTeamType);
            }
        }
        
        /**
         * Unsets the "RehabilitationAssessmentTeamType" element
         */
        public void unsetRehabilitationAssessmentTeamType()
        {
            synchronized (monitor())
            {
                check_orphaned();
                get_store().remove_element(REHABILITATIONASSESSMENTTEAMTYPE$32, 0);
            }
        }
    }
}
