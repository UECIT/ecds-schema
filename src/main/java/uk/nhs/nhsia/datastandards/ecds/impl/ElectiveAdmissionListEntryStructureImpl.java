/*
 * XML Type:  ElectiveAdmissionListEntry_Structure
 * Namespace: http://www.nhsia.nhs.uk/DataStandards/XMLschema/CDS/ns
 * Java type: uk.nhs.nhsia.datastandards.ecds.ElectiveAdmissionListEntryStructure
 *
 * Automatically generated - do not modify.
 */
package uk.nhs.nhsia.datastandards.ecds.impl;
/**
 * An XML ElectiveAdmissionListEntry_Structure(@http://www.nhsia.nhs.uk/DataStandards/XMLschema/CDS/ns).
 *
 * This is a complex type.
 */
public class ElectiveAdmissionListEntryStructureImpl extends org.apache.xmlbeans.impl.values.XmlComplexContentImpl implements uk.nhs.nhsia.datastandards.ecds.ElectiveAdmissionListEntryStructure
{
    private static final long serialVersionUID = 1L;
    
    public ElectiveAdmissionListEntryStructureImpl(org.apache.xmlbeans.SchemaType sType)
    {
        super(sType);
    }
    
    private static final javax.xml.namespace.QName ACTIVITYCHARACTERISTICS$0 = 
        new javax.xml.namespace.QName("http://www.nhsia.nhs.uk/DataStandards/XMLschema/CDS/ns", "ActivityCharacteristics");
    private static final javax.xml.namespace.QName PERSONGROUPCONSULTANT$2 = 
        new javax.xml.namespace.QName("http://www.nhsia.nhs.uk/DataStandards/XMLschema/CDS/ns", "PersonGroup_Consultant");
    private static final javax.xml.namespace.QName INTENDEDPROCEDUREDETAILS$4 = 
        new javax.xml.namespace.QName("http://www.nhsia.nhs.uk/DataStandards/XMLschema/CDS/ns", "IntendedProcedureDetails");
    private static final javax.xml.namespace.QName LOCATIONGROUP$6 = 
        new javax.xml.namespace.QName("http://www.nhsia.nhs.uk/DataStandards/XMLschema/CDS/ns", "LocationGroup");
    
    
    /**
     * Gets the "ActivityCharacteristics" element
     */
    public uk.nhs.nhsia.datastandards.ecds.ElectiveAdmissionListEntryStructure.ActivityCharacteristics getActivityCharacteristics()
    {
        synchronized (monitor())
        {
            check_orphaned();
            uk.nhs.nhsia.datastandards.ecds.ElectiveAdmissionListEntryStructure.ActivityCharacteristics target = null;
            target = (uk.nhs.nhsia.datastandards.ecds.ElectiveAdmissionListEntryStructure.ActivityCharacteristics)get_store().find_element_user(ACTIVITYCHARACTERISTICS$0, 0);
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
    public void setActivityCharacteristics(uk.nhs.nhsia.datastandards.ecds.ElectiveAdmissionListEntryStructure.ActivityCharacteristics activityCharacteristics)
    {
        generatedSetterHelperImpl(activityCharacteristics, ACTIVITYCHARACTERISTICS$0, 0, org.apache.xmlbeans.impl.values.XmlObjectBase.KIND_SETTERHELPER_SINGLETON);
    }
    
    /**
     * Appends and returns a new empty "ActivityCharacteristics" element
     */
    public uk.nhs.nhsia.datastandards.ecds.ElectiveAdmissionListEntryStructure.ActivityCharacteristics addNewActivityCharacteristics()
    {
        synchronized (monitor())
        {
            check_orphaned();
            uk.nhs.nhsia.datastandards.ecds.ElectiveAdmissionListEntryStructure.ActivityCharacteristics target = null;
            target = (uk.nhs.nhsia.datastandards.ecds.ElectiveAdmissionListEntryStructure.ActivityCharacteristics)get_store().add_element_user(ACTIVITYCHARACTERISTICS$0);
            return target;
        }
    }
    
    /**
     * Gets the "PersonGroup_Consultant" element
     */
    public uk.nhs.nhsia.datastandards.ecds.PersonGroupConsultantStructure getPersonGroupConsultant()
    {
        synchronized (monitor())
        {
            check_orphaned();
            uk.nhs.nhsia.datastandards.ecds.PersonGroupConsultantStructure target = null;
            target = (uk.nhs.nhsia.datastandards.ecds.PersonGroupConsultantStructure)get_store().find_element_user(PERSONGROUPCONSULTANT$2, 0);
            if (target == null)
            {
                return null;
            }
            return target;
        }
    }
    
    /**
     * True if has "PersonGroup_Consultant" element
     */
    public boolean isSetPersonGroupConsultant()
    {
        synchronized (monitor())
        {
            check_orphaned();
            return get_store().count_elements(PERSONGROUPCONSULTANT$2) != 0;
        }
    }
    
    /**
     * Sets the "PersonGroup_Consultant" element
     */
    public void setPersonGroupConsultant(uk.nhs.nhsia.datastandards.ecds.PersonGroupConsultantStructure personGroupConsultant)
    {
        generatedSetterHelperImpl(personGroupConsultant, PERSONGROUPCONSULTANT$2, 0, org.apache.xmlbeans.impl.values.XmlObjectBase.KIND_SETTERHELPER_SINGLETON);
    }
    
    /**
     * Appends and returns a new empty "PersonGroup_Consultant" element
     */
    public uk.nhs.nhsia.datastandards.ecds.PersonGroupConsultantStructure addNewPersonGroupConsultant()
    {
        synchronized (monitor())
        {
            check_orphaned();
            uk.nhs.nhsia.datastandards.ecds.PersonGroupConsultantStructure target = null;
            target = (uk.nhs.nhsia.datastandards.ecds.PersonGroupConsultantStructure)get_store().add_element_user(PERSONGROUPCONSULTANT$2);
            return target;
        }
    }
    
    /**
     * Unsets the "PersonGroup_Consultant" element
     */
    public void unsetPersonGroupConsultant()
    {
        synchronized (monitor())
        {
            check_orphaned();
            get_store().remove_element(PERSONGROUPCONSULTANT$2, 0);
        }
    }
    
    /**
     * Gets the "IntendedProcedureDetails" element
     */
    public uk.nhs.nhsia.datastandards.ecds.ClinicalActivityStructure getIntendedProcedureDetails()
    {
        synchronized (monitor())
        {
            check_orphaned();
            uk.nhs.nhsia.datastandards.ecds.ClinicalActivityStructure target = null;
            target = (uk.nhs.nhsia.datastandards.ecds.ClinicalActivityStructure)get_store().find_element_user(INTENDEDPROCEDUREDETAILS$4, 0);
            if (target == null)
            {
                return null;
            }
            return target;
        }
    }
    
    /**
     * True if has "IntendedProcedureDetails" element
     */
    public boolean isSetIntendedProcedureDetails()
    {
        synchronized (monitor())
        {
            check_orphaned();
            return get_store().count_elements(INTENDEDPROCEDUREDETAILS$4) != 0;
        }
    }
    
    /**
     * Sets the "IntendedProcedureDetails" element
     */
    public void setIntendedProcedureDetails(uk.nhs.nhsia.datastandards.ecds.ClinicalActivityStructure intendedProcedureDetails)
    {
        generatedSetterHelperImpl(intendedProcedureDetails, INTENDEDPROCEDUREDETAILS$4, 0, org.apache.xmlbeans.impl.values.XmlObjectBase.KIND_SETTERHELPER_SINGLETON);
    }
    
    /**
     * Appends and returns a new empty "IntendedProcedureDetails" element
     */
    public uk.nhs.nhsia.datastandards.ecds.ClinicalActivityStructure addNewIntendedProcedureDetails()
    {
        synchronized (monitor())
        {
            check_orphaned();
            uk.nhs.nhsia.datastandards.ecds.ClinicalActivityStructure target = null;
            target = (uk.nhs.nhsia.datastandards.ecds.ClinicalActivityStructure)get_store().add_element_user(INTENDEDPROCEDUREDETAILS$4);
            return target;
        }
    }
    
    /**
     * Unsets the "IntendedProcedureDetails" element
     */
    public void unsetIntendedProcedureDetails()
    {
        synchronized (monitor())
        {
            check_orphaned();
            get_store().remove_element(INTENDEDPROCEDUREDETAILS$4, 0);
        }
    }
    
    /**
     * Gets the "LocationGroup" element
     */
    public uk.nhs.nhsia.datastandards.ecds.ElectiveAdmissionListEntryStructure.LocationGroup getLocationGroup()
    {
        synchronized (monitor())
        {
            check_orphaned();
            uk.nhs.nhsia.datastandards.ecds.ElectiveAdmissionListEntryStructure.LocationGroup target = null;
            target = (uk.nhs.nhsia.datastandards.ecds.ElectiveAdmissionListEntryStructure.LocationGroup)get_store().find_element_user(LOCATIONGROUP$6, 0);
            if (target == null)
            {
                return null;
            }
            return target;
        }
    }
    
    /**
     * True if has "LocationGroup" element
     */
    public boolean isSetLocationGroup()
    {
        synchronized (monitor())
        {
            check_orphaned();
            return get_store().count_elements(LOCATIONGROUP$6) != 0;
        }
    }
    
    /**
     * Sets the "LocationGroup" element
     */
    public void setLocationGroup(uk.nhs.nhsia.datastandards.ecds.ElectiveAdmissionListEntryStructure.LocationGroup locationGroup)
    {
        generatedSetterHelperImpl(locationGroup, LOCATIONGROUP$6, 0, org.apache.xmlbeans.impl.values.XmlObjectBase.KIND_SETTERHELPER_SINGLETON);
    }
    
    /**
     * Appends and returns a new empty "LocationGroup" element
     */
    public uk.nhs.nhsia.datastandards.ecds.ElectiveAdmissionListEntryStructure.LocationGroup addNewLocationGroup()
    {
        synchronized (monitor())
        {
            check_orphaned();
            uk.nhs.nhsia.datastandards.ecds.ElectiveAdmissionListEntryStructure.LocationGroup target = null;
            target = (uk.nhs.nhsia.datastandards.ecds.ElectiveAdmissionListEntryStructure.LocationGroup)get_store().add_element_user(LOCATIONGROUP$6);
            return target;
        }
    }
    
    /**
     * Unsets the "LocationGroup" element
     */
    public void unsetLocationGroup()
    {
        synchronized (monitor())
        {
            check_orphaned();
            get_store().remove_element(LOCATIONGROUP$6, 0);
        }
    }
    /**
     * An XML ActivityCharacteristics(@http://www.nhsia.nhs.uk/DataStandards/XMLschema/CDS/ns).
     *
     * This is a complex type.
     */
    public static class ActivityCharacteristicsImpl extends org.apache.xmlbeans.impl.values.XmlComplexContentImpl implements uk.nhs.nhsia.datastandards.ecds.ElectiveAdmissionListEntryStructure.ActivityCharacteristics
    {
        private static final long serialVersionUID = 1L;
        
        public ActivityCharacteristicsImpl(org.apache.xmlbeans.SchemaType sType)
        {
            super(sType);
        }
        
        private static final javax.xml.namespace.QName ELECTIVEADMISSIONLISTENTRYNUMBER$0 = 
            new javax.xml.namespace.QName("http://www.nhsia.nhs.uk/DataStandards/XMLschema/CDS/ns", "ElectiveAdmissionListEntryNumber");
        private static final javax.xml.namespace.QName ADMINISTRATIVECATEGORYCODE$2 = 
            new javax.xml.namespace.QName("http://www.nhsia.nhs.uk/DataStandards/XMLschema/CDS/ns", "AdministrativeCategoryCode");
        private static final javax.xml.namespace.QName COUNTOFDAYSSUSPENDED$4 = 
            new javax.xml.namespace.QName("http://www.nhsia.nhs.uk/DataStandards/XMLschema/CDS/ns", "CountOfDaysSuspended");
        private static final javax.xml.namespace.QName ELECTIVEADMISSIONLISTSTATUS$6 = 
            new javax.xml.namespace.QName("http://www.nhsia.nhs.uk/DataStandards/XMLschema/CDS/ns", "ElectiveAdmissionListStatus");
        private static final javax.xml.namespace.QName ELECTIVEADMISSIONTYPECODE$8 = 
            new javax.xml.namespace.QName("http://www.nhsia.nhs.uk/DataStandards/XMLschema/CDS/ns", "ElectiveAdmissionTypeCode");
        private static final javax.xml.namespace.QName INTENDEDMANAGEMENTCODE$10 = 
            new javax.xml.namespace.QName("http://www.nhsia.nhs.uk/DataStandards/XMLschema/CDS/ns", "IntendedManagementCode");
        private static final javax.xml.namespace.QName INTENDEDPROCEDURESTATUSCODE$12 = 
            new javax.xml.namespace.QName("http://www.nhsia.nhs.uk/DataStandards/XMLschema/CDS/ns", "IntendedProcedureStatusCode");
        private static final javax.xml.namespace.QName PRIORITYTYPECODE$14 = 
            new javax.xml.namespace.QName("http://www.nhsia.nhs.uk/DataStandards/XMLschema/CDS/ns", "PriorityTypeCode");
        private static final javax.xml.namespace.QName DECIDEDTOADMITDATE$16 = 
            new javax.xml.namespace.QName("http://www.nhsia.nhs.uk/DataStandards/XMLschema/CDS/ns", "DecidedToAdmitDate");
        private static final javax.xml.namespace.QName AGEATCDSACTIVITYDATE$18 = 
            new javax.xml.namespace.QName("http://www.nhsia.nhs.uk/DataStandards/XMLschema/CDS/ns", "AgeAtCDSActivityDate");
        private static final javax.xml.namespace.QName OVERSEASVISITORSTATUSCLASSIFICATIONATCDSACTIVITYDATE$20 = 
            new javax.xml.namespace.QName("http://www.nhsia.nhs.uk/DataStandards/XMLschema/CDS/ns", "OverseasVisitorStatusClassificationAtCDSActivityDate");
        private static final javax.xml.namespace.QName GUARANTEEDADMISSIONDATE$22 = 
            new javax.xml.namespace.QName("http://www.nhsia.nhs.uk/DataStandards/XMLschema/CDS/ns", "GuaranteedAdmissionDate");
        private static final javax.xml.namespace.QName LASTDNAORPATIENTCANCELLEDDATE$24 = 
            new javax.xml.namespace.QName("http://www.nhsia.nhs.uk/DataStandards/XMLschema/CDS/ns", "LastDNAOrPatientCancelledDate");
        private static final javax.xml.namespace.QName WAITINGLISTENTRYLASTREVIEWEDDATE$26 = 
            new javax.xml.namespace.QName("http://www.nhsia.nhs.uk/DataStandards/XMLschema/CDS/ns", "WaitingListEntryLastReviewedDate");
        
        
        /**
         * Gets the "ElectiveAdmissionListEntryNumber" element
         */
        public java.lang.String getElectiveAdmissionListEntryNumber()
        {
            synchronized (monitor())
            {
                check_orphaned();
                org.apache.xmlbeans.SimpleValue target = null;
                target = (org.apache.xmlbeans.SimpleValue)get_store().find_element_user(ELECTIVEADMISSIONLISTENTRYNUMBER$0, 0);
                if (target == null)
                {
                    return null;
                }
                return target.getStringValue();
            }
        }
        
        /**
         * Gets (as xml) the "ElectiveAdmissionListEntryNumber" element
         */
        public uk.nhs.nhsia.datastandards.ecds.ElectiveAdmissionListEntryNumberType xgetElectiveAdmissionListEntryNumber()
        {
            synchronized (monitor())
            {
                check_orphaned();
                uk.nhs.nhsia.datastandards.ecds.ElectiveAdmissionListEntryNumberType target = null;
                target = (uk.nhs.nhsia.datastandards.ecds.ElectiveAdmissionListEntryNumberType)get_store().find_element_user(ELECTIVEADMISSIONLISTENTRYNUMBER$0, 0);
                return target;
            }
        }
        
        /**
         * True if has "ElectiveAdmissionListEntryNumber" element
         */
        public boolean isSetElectiveAdmissionListEntryNumber()
        {
            synchronized (monitor())
            {
                check_orphaned();
                return get_store().count_elements(ELECTIVEADMISSIONLISTENTRYNUMBER$0) != 0;
            }
        }
        
        /**
         * Sets the "ElectiveAdmissionListEntryNumber" element
         */
        public void setElectiveAdmissionListEntryNumber(java.lang.String electiveAdmissionListEntryNumber)
        {
            synchronized (monitor())
            {
                check_orphaned();
                org.apache.xmlbeans.SimpleValue target = null;
                target = (org.apache.xmlbeans.SimpleValue)get_store().find_element_user(ELECTIVEADMISSIONLISTENTRYNUMBER$0, 0);
                if (target == null)
                {
                    target = (org.apache.xmlbeans.SimpleValue)get_store().add_element_user(ELECTIVEADMISSIONLISTENTRYNUMBER$0);
                }
                target.setStringValue(electiveAdmissionListEntryNumber);
            }
        }
        
        /**
         * Sets (as xml) the "ElectiveAdmissionListEntryNumber" element
         */
        public void xsetElectiveAdmissionListEntryNumber(uk.nhs.nhsia.datastandards.ecds.ElectiveAdmissionListEntryNumberType electiveAdmissionListEntryNumber)
        {
            synchronized (monitor())
            {
                check_orphaned();
                uk.nhs.nhsia.datastandards.ecds.ElectiveAdmissionListEntryNumberType target = null;
                target = (uk.nhs.nhsia.datastandards.ecds.ElectiveAdmissionListEntryNumberType)get_store().find_element_user(ELECTIVEADMISSIONLISTENTRYNUMBER$0, 0);
                if (target == null)
                {
                    target = (uk.nhs.nhsia.datastandards.ecds.ElectiveAdmissionListEntryNumberType)get_store().add_element_user(ELECTIVEADMISSIONLISTENTRYNUMBER$0);
                }
                target.set(electiveAdmissionListEntryNumber);
            }
        }
        
        /**
         * Unsets the "ElectiveAdmissionListEntryNumber" element
         */
        public void unsetElectiveAdmissionListEntryNumber()
        {
            synchronized (monitor())
            {
                check_orphaned();
                get_store().remove_element(ELECTIVEADMISSIONLISTENTRYNUMBER$0, 0);
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
         * Gets the "CountOfDaysSuspended" element
         */
        public int getCountOfDaysSuspended()
        {
            synchronized (monitor())
            {
                check_orphaned();
                org.apache.xmlbeans.SimpleValue target = null;
                target = (org.apache.xmlbeans.SimpleValue)get_store().find_element_user(COUNTOFDAYSSUSPENDED$4, 0);
                if (target == null)
                {
                    return 0;
                }
                return target.getIntValue();
            }
        }
        
        /**
         * Gets (as xml) the "CountOfDaysSuspended" element
         */
        public uk.nhs.nhsia.datastandards.ecds.CountOfDaysSuspendedType xgetCountOfDaysSuspended()
        {
            synchronized (monitor())
            {
                check_orphaned();
                uk.nhs.nhsia.datastandards.ecds.CountOfDaysSuspendedType target = null;
                target = (uk.nhs.nhsia.datastandards.ecds.CountOfDaysSuspendedType)get_store().find_element_user(COUNTOFDAYSSUSPENDED$4, 0);
                return target;
            }
        }
        
        /**
         * True if has "CountOfDaysSuspended" element
         */
        public boolean isSetCountOfDaysSuspended()
        {
            synchronized (monitor())
            {
                check_orphaned();
                return get_store().count_elements(COUNTOFDAYSSUSPENDED$4) != 0;
            }
        }
        
        /**
         * Sets the "CountOfDaysSuspended" element
         */
        public void setCountOfDaysSuspended(int countOfDaysSuspended)
        {
            synchronized (monitor())
            {
                check_orphaned();
                org.apache.xmlbeans.SimpleValue target = null;
                target = (org.apache.xmlbeans.SimpleValue)get_store().find_element_user(COUNTOFDAYSSUSPENDED$4, 0);
                if (target == null)
                {
                    target = (org.apache.xmlbeans.SimpleValue)get_store().add_element_user(COUNTOFDAYSSUSPENDED$4);
                }
                target.setIntValue(countOfDaysSuspended);
            }
        }
        
        /**
         * Sets (as xml) the "CountOfDaysSuspended" element
         */
        public void xsetCountOfDaysSuspended(uk.nhs.nhsia.datastandards.ecds.CountOfDaysSuspendedType countOfDaysSuspended)
        {
            synchronized (monitor())
            {
                check_orphaned();
                uk.nhs.nhsia.datastandards.ecds.CountOfDaysSuspendedType target = null;
                target = (uk.nhs.nhsia.datastandards.ecds.CountOfDaysSuspendedType)get_store().find_element_user(COUNTOFDAYSSUSPENDED$4, 0);
                if (target == null)
                {
                    target = (uk.nhs.nhsia.datastandards.ecds.CountOfDaysSuspendedType)get_store().add_element_user(COUNTOFDAYSSUSPENDED$4);
                }
                target.set(countOfDaysSuspended);
            }
        }
        
        /**
         * Unsets the "CountOfDaysSuspended" element
         */
        public void unsetCountOfDaysSuspended()
        {
            synchronized (monitor())
            {
                check_orphaned();
                get_store().remove_element(COUNTOFDAYSSUSPENDED$4, 0);
            }
        }
        
        /**
         * Gets the "ElectiveAdmissionListStatus" element
         */
        public uk.nhs.nhsia.datastandards.ecds.ElectiveAdmissionListStatusType.Enum getElectiveAdmissionListStatus()
        {
            synchronized (monitor())
            {
                check_orphaned();
                org.apache.xmlbeans.SimpleValue target = null;
                target = (org.apache.xmlbeans.SimpleValue)get_store().find_element_user(ELECTIVEADMISSIONLISTSTATUS$6, 0);
                if (target == null)
                {
                    return null;
                }
                return (uk.nhs.nhsia.datastandards.ecds.ElectiveAdmissionListStatusType.Enum)target.getEnumValue();
            }
        }
        
        /**
         * Gets (as xml) the "ElectiveAdmissionListStatus" element
         */
        public uk.nhs.nhsia.datastandards.ecds.ElectiveAdmissionListStatusType xgetElectiveAdmissionListStatus()
        {
            synchronized (monitor())
            {
                check_orphaned();
                uk.nhs.nhsia.datastandards.ecds.ElectiveAdmissionListStatusType target = null;
                target = (uk.nhs.nhsia.datastandards.ecds.ElectiveAdmissionListStatusType)get_store().find_element_user(ELECTIVEADMISSIONLISTSTATUS$6, 0);
                return target;
            }
        }
        
        /**
         * True if has "ElectiveAdmissionListStatus" element
         */
        public boolean isSetElectiveAdmissionListStatus()
        {
            synchronized (monitor())
            {
                check_orphaned();
                return get_store().count_elements(ELECTIVEADMISSIONLISTSTATUS$6) != 0;
            }
        }
        
        /**
         * Sets the "ElectiveAdmissionListStatus" element
         */
        public void setElectiveAdmissionListStatus(uk.nhs.nhsia.datastandards.ecds.ElectiveAdmissionListStatusType.Enum electiveAdmissionListStatus)
        {
            synchronized (monitor())
            {
                check_orphaned();
                org.apache.xmlbeans.SimpleValue target = null;
                target = (org.apache.xmlbeans.SimpleValue)get_store().find_element_user(ELECTIVEADMISSIONLISTSTATUS$6, 0);
                if (target == null)
                {
                    target = (org.apache.xmlbeans.SimpleValue)get_store().add_element_user(ELECTIVEADMISSIONLISTSTATUS$6);
                }
                target.setEnumValue(electiveAdmissionListStatus);
            }
        }
        
        /**
         * Sets (as xml) the "ElectiveAdmissionListStatus" element
         */
        public void xsetElectiveAdmissionListStatus(uk.nhs.nhsia.datastandards.ecds.ElectiveAdmissionListStatusType electiveAdmissionListStatus)
        {
            synchronized (monitor())
            {
                check_orphaned();
                uk.nhs.nhsia.datastandards.ecds.ElectiveAdmissionListStatusType target = null;
                target = (uk.nhs.nhsia.datastandards.ecds.ElectiveAdmissionListStatusType)get_store().find_element_user(ELECTIVEADMISSIONLISTSTATUS$6, 0);
                if (target == null)
                {
                    target = (uk.nhs.nhsia.datastandards.ecds.ElectiveAdmissionListStatusType)get_store().add_element_user(ELECTIVEADMISSIONLISTSTATUS$6);
                }
                target.set(electiveAdmissionListStatus);
            }
        }
        
        /**
         * Unsets the "ElectiveAdmissionListStatus" element
         */
        public void unsetElectiveAdmissionListStatus()
        {
            synchronized (monitor())
            {
                check_orphaned();
                get_store().remove_element(ELECTIVEADMISSIONLISTSTATUS$6, 0);
            }
        }
        
        /**
         * Gets the "ElectiveAdmissionTypeCode" element
         */
        public uk.nhs.nhsia.datastandards.ecds.ElectiveAdmissionTypeCodeType.Enum getElectiveAdmissionTypeCode()
        {
            synchronized (monitor())
            {
                check_orphaned();
                org.apache.xmlbeans.SimpleValue target = null;
                target = (org.apache.xmlbeans.SimpleValue)get_store().find_element_user(ELECTIVEADMISSIONTYPECODE$8, 0);
                if (target == null)
                {
                    return null;
                }
                return (uk.nhs.nhsia.datastandards.ecds.ElectiveAdmissionTypeCodeType.Enum)target.getEnumValue();
            }
        }
        
        /**
         * Gets (as xml) the "ElectiveAdmissionTypeCode" element
         */
        public uk.nhs.nhsia.datastandards.ecds.ElectiveAdmissionTypeCodeType xgetElectiveAdmissionTypeCode()
        {
            synchronized (monitor())
            {
                check_orphaned();
                uk.nhs.nhsia.datastandards.ecds.ElectiveAdmissionTypeCodeType target = null;
                target = (uk.nhs.nhsia.datastandards.ecds.ElectiveAdmissionTypeCodeType)get_store().find_element_user(ELECTIVEADMISSIONTYPECODE$8, 0);
                return target;
            }
        }
        
        /**
         * True if has "ElectiveAdmissionTypeCode" element
         */
        public boolean isSetElectiveAdmissionTypeCode()
        {
            synchronized (monitor())
            {
                check_orphaned();
                return get_store().count_elements(ELECTIVEADMISSIONTYPECODE$8) != 0;
            }
        }
        
        /**
         * Sets the "ElectiveAdmissionTypeCode" element
         */
        public void setElectiveAdmissionTypeCode(uk.nhs.nhsia.datastandards.ecds.ElectiveAdmissionTypeCodeType.Enum electiveAdmissionTypeCode)
        {
            synchronized (monitor())
            {
                check_orphaned();
                org.apache.xmlbeans.SimpleValue target = null;
                target = (org.apache.xmlbeans.SimpleValue)get_store().find_element_user(ELECTIVEADMISSIONTYPECODE$8, 0);
                if (target == null)
                {
                    target = (org.apache.xmlbeans.SimpleValue)get_store().add_element_user(ELECTIVEADMISSIONTYPECODE$8);
                }
                target.setEnumValue(electiveAdmissionTypeCode);
            }
        }
        
        /**
         * Sets (as xml) the "ElectiveAdmissionTypeCode" element
         */
        public void xsetElectiveAdmissionTypeCode(uk.nhs.nhsia.datastandards.ecds.ElectiveAdmissionTypeCodeType electiveAdmissionTypeCode)
        {
            synchronized (monitor())
            {
                check_orphaned();
                uk.nhs.nhsia.datastandards.ecds.ElectiveAdmissionTypeCodeType target = null;
                target = (uk.nhs.nhsia.datastandards.ecds.ElectiveAdmissionTypeCodeType)get_store().find_element_user(ELECTIVEADMISSIONTYPECODE$8, 0);
                if (target == null)
                {
                    target = (uk.nhs.nhsia.datastandards.ecds.ElectiveAdmissionTypeCodeType)get_store().add_element_user(ELECTIVEADMISSIONTYPECODE$8);
                }
                target.set(electiveAdmissionTypeCode);
            }
        }
        
        /**
         * Unsets the "ElectiveAdmissionTypeCode" element
         */
        public void unsetElectiveAdmissionTypeCode()
        {
            synchronized (monitor())
            {
                check_orphaned();
                get_store().remove_element(ELECTIVEADMISSIONTYPECODE$8, 0);
            }
        }
        
        /**
         * Gets the "IntendedManagementCode" element
         */
        public uk.nhs.nhsia.datastandards.ecds.IntendedManagementCodeType.Enum getIntendedManagementCode()
        {
            synchronized (monitor())
            {
                check_orphaned();
                org.apache.xmlbeans.SimpleValue target = null;
                target = (org.apache.xmlbeans.SimpleValue)get_store().find_element_user(INTENDEDMANAGEMENTCODE$10, 0);
                if (target == null)
                {
                    return null;
                }
                return (uk.nhs.nhsia.datastandards.ecds.IntendedManagementCodeType.Enum)target.getEnumValue();
            }
        }
        
        /**
         * Gets (as xml) the "IntendedManagementCode" element
         */
        public uk.nhs.nhsia.datastandards.ecds.IntendedManagementCodeType xgetIntendedManagementCode()
        {
            synchronized (monitor())
            {
                check_orphaned();
                uk.nhs.nhsia.datastandards.ecds.IntendedManagementCodeType target = null;
                target = (uk.nhs.nhsia.datastandards.ecds.IntendedManagementCodeType)get_store().find_element_user(INTENDEDMANAGEMENTCODE$10, 0);
                return target;
            }
        }
        
        /**
         * True if has "IntendedManagementCode" element
         */
        public boolean isSetIntendedManagementCode()
        {
            synchronized (monitor())
            {
                check_orphaned();
                return get_store().count_elements(INTENDEDMANAGEMENTCODE$10) != 0;
            }
        }
        
        /**
         * Sets the "IntendedManagementCode" element
         */
        public void setIntendedManagementCode(uk.nhs.nhsia.datastandards.ecds.IntendedManagementCodeType.Enum intendedManagementCode)
        {
            synchronized (monitor())
            {
                check_orphaned();
                org.apache.xmlbeans.SimpleValue target = null;
                target = (org.apache.xmlbeans.SimpleValue)get_store().find_element_user(INTENDEDMANAGEMENTCODE$10, 0);
                if (target == null)
                {
                    target = (org.apache.xmlbeans.SimpleValue)get_store().add_element_user(INTENDEDMANAGEMENTCODE$10);
                }
                target.setEnumValue(intendedManagementCode);
            }
        }
        
        /**
         * Sets (as xml) the "IntendedManagementCode" element
         */
        public void xsetIntendedManagementCode(uk.nhs.nhsia.datastandards.ecds.IntendedManagementCodeType intendedManagementCode)
        {
            synchronized (monitor())
            {
                check_orphaned();
                uk.nhs.nhsia.datastandards.ecds.IntendedManagementCodeType target = null;
                target = (uk.nhs.nhsia.datastandards.ecds.IntendedManagementCodeType)get_store().find_element_user(INTENDEDMANAGEMENTCODE$10, 0);
                if (target == null)
                {
                    target = (uk.nhs.nhsia.datastandards.ecds.IntendedManagementCodeType)get_store().add_element_user(INTENDEDMANAGEMENTCODE$10);
                }
                target.set(intendedManagementCode);
            }
        }
        
        /**
         * Unsets the "IntendedManagementCode" element
         */
        public void unsetIntendedManagementCode()
        {
            synchronized (monitor())
            {
                check_orphaned();
                get_store().remove_element(INTENDEDMANAGEMENTCODE$10, 0);
            }
        }
        
        /**
         * Gets the "IntendedProcedureStatusCode" element
         */
        public uk.nhs.nhsia.datastandards.ecds.IntendedProcedureStatusCodeType.Enum getIntendedProcedureStatusCode()
        {
            synchronized (monitor())
            {
                check_orphaned();
                org.apache.xmlbeans.SimpleValue target = null;
                target = (org.apache.xmlbeans.SimpleValue)get_store().find_element_user(INTENDEDPROCEDURESTATUSCODE$12, 0);
                if (target == null)
                {
                    return null;
                }
                return (uk.nhs.nhsia.datastandards.ecds.IntendedProcedureStatusCodeType.Enum)target.getEnumValue();
            }
        }
        
        /**
         * Gets (as xml) the "IntendedProcedureStatusCode" element
         */
        public uk.nhs.nhsia.datastandards.ecds.IntendedProcedureStatusCodeType xgetIntendedProcedureStatusCode()
        {
            synchronized (monitor())
            {
                check_orphaned();
                uk.nhs.nhsia.datastandards.ecds.IntendedProcedureStatusCodeType target = null;
                target = (uk.nhs.nhsia.datastandards.ecds.IntendedProcedureStatusCodeType)get_store().find_element_user(INTENDEDPROCEDURESTATUSCODE$12, 0);
                return target;
            }
        }
        
        /**
         * True if has "IntendedProcedureStatusCode" element
         */
        public boolean isSetIntendedProcedureStatusCode()
        {
            synchronized (monitor())
            {
                check_orphaned();
                return get_store().count_elements(INTENDEDPROCEDURESTATUSCODE$12) != 0;
            }
        }
        
        /**
         * Sets the "IntendedProcedureStatusCode" element
         */
        public void setIntendedProcedureStatusCode(uk.nhs.nhsia.datastandards.ecds.IntendedProcedureStatusCodeType.Enum intendedProcedureStatusCode)
        {
            synchronized (monitor())
            {
                check_orphaned();
                org.apache.xmlbeans.SimpleValue target = null;
                target = (org.apache.xmlbeans.SimpleValue)get_store().find_element_user(INTENDEDPROCEDURESTATUSCODE$12, 0);
                if (target == null)
                {
                    target = (org.apache.xmlbeans.SimpleValue)get_store().add_element_user(INTENDEDPROCEDURESTATUSCODE$12);
                }
                target.setEnumValue(intendedProcedureStatusCode);
            }
        }
        
        /**
         * Sets (as xml) the "IntendedProcedureStatusCode" element
         */
        public void xsetIntendedProcedureStatusCode(uk.nhs.nhsia.datastandards.ecds.IntendedProcedureStatusCodeType intendedProcedureStatusCode)
        {
            synchronized (monitor())
            {
                check_orphaned();
                uk.nhs.nhsia.datastandards.ecds.IntendedProcedureStatusCodeType target = null;
                target = (uk.nhs.nhsia.datastandards.ecds.IntendedProcedureStatusCodeType)get_store().find_element_user(INTENDEDPROCEDURESTATUSCODE$12, 0);
                if (target == null)
                {
                    target = (uk.nhs.nhsia.datastandards.ecds.IntendedProcedureStatusCodeType)get_store().add_element_user(INTENDEDPROCEDURESTATUSCODE$12);
                }
                target.set(intendedProcedureStatusCode);
            }
        }
        
        /**
         * Unsets the "IntendedProcedureStatusCode" element
         */
        public void unsetIntendedProcedureStatusCode()
        {
            synchronized (monitor())
            {
                check_orphaned();
                get_store().remove_element(INTENDEDPROCEDURESTATUSCODE$12, 0);
            }
        }
        
        /**
         * Gets the "PriorityTypeCode" element
         */
        public uk.nhs.nhsia.datastandards.ecds.PriorityTypeCodeType.Enum getPriorityTypeCode()
        {
            synchronized (monitor())
            {
                check_orphaned();
                org.apache.xmlbeans.SimpleValue target = null;
                target = (org.apache.xmlbeans.SimpleValue)get_store().find_element_user(PRIORITYTYPECODE$14, 0);
                if (target == null)
                {
                    return null;
                }
                return (uk.nhs.nhsia.datastandards.ecds.PriorityTypeCodeType.Enum)target.getEnumValue();
            }
        }
        
        /**
         * Gets (as xml) the "PriorityTypeCode" element
         */
        public uk.nhs.nhsia.datastandards.ecds.PriorityTypeCodeType xgetPriorityTypeCode()
        {
            synchronized (monitor())
            {
                check_orphaned();
                uk.nhs.nhsia.datastandards.ecds.PriorityTypeCodeType target = null;
                target = (uk.nhs.nhsia.datastandards.ecds.PriorityTypeCodeType)get_store().find_element_user(PRIORITYTYPECODE$14, 0);
                return target;
            }
        }
        
        /**
         * True if has "PriorityTypeCode" element
         */
        public boolean isSetPriorityTypeCode()
        {
            synchronized (monitor())
            {
                check_orphaned();
                return get_store().count_elements(PRIORITYTYPECODE$14) != 0;
            }
        }
        
        /**
         * Sets the "PriorityTypeCode" element
         */
        public void setPriorityTypeCode(uk.nhs.nhsia.datastandards.ecds.PriorityTypeCodeType.Enum priorityTypeCode)
        {
            synchronized (monitor())
            {
                check_orphaned();
                org.apache.xmlbeans.SimpleValue target = null;
                target = (org.apache.xmlbeans.SimpleValue)get_store().find_element_user(PRIORITYTYPECODE$14, 0);
                if (target == null)
                {
                    target = (org.apache.xmlbeans.SimpleValue)get_store().add_element_user(PRIORITYTYPECODE$14);
                }
                target.setEnumValue(priorityTypeCode);
            }
        }
        
        /**
         * Sets (as xml) the "PriorityTypeCode" element
         */
        public void xsetPriorityTypeCode(uk.nhs.nhsia.datastandards.ecds.PriorityTypeCodeType priorityTypeCode)
        {
            synchronized (monitor())
            {
                check_orphaned();
                uk.nhs.nhsia.datastandards.ecds.PriorityTypeCodeType target = null;
                target = (uk.nhs.nhsia.datastandards.ecds.PriorityTypeCodeType)get_store().find_element_user(PRIORITYTYPECODE$14, 0);
                if (target == null)
                {
                    target = (uk.nhs.nhsia.datastandards.ecds.PriorityTypeCodeType)get_store().add_element_user(PRIORITYTYPECODE$14);
                }
                target.set(priorityTypeCode);
            }
        }
        
        /**
         * Unsets the "PriorityTypeCode" element
         */
        public void unsetPriorityTypeCode()
        {
            synchronized (monitor())
            {
                check_orphaned();
                get_store().remove_element(PRIORITYTYPECODE$14, 0);
            }
        }
        
        /**
         * Gets the "DecidedToAdmitDate" element
         */
        public java.util.Calendar getDecidedToAdmitDate()
        {
            synchronized (monitor())
            {
                check_orphaned();
                org.apache.xmlbeans.SimpleValue target = null;
                target = (org.apache.xmlbeans.SimpleValue)get_store().find_element_user(DECIDEDTOADMITDATE$16, 0);
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
        public uk.nhs.nhsia.datastandards.ecds.DecidedToAdmitDateType xgetDecidedToAdmitDate()
        {
            synchronized (monitor())
            {
                check_orphaned();
                uk.nhs.nhsia.datastandards.ecds.DecidedToAdmitDateType target = null;
                target = (uk.nhs.nhsia.datastandards.ecds.DecidedToAdmitDateType)get_store().find_element_user(DECIDEDTOADMITDATE$16, 0);
                return target;
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
                target = (org.apache.xmlbeans.SimpleValue)get_store().find_element_user(DECIDEDTOADMITDATE$16, 0);
                if (target == null)
                {
                    target = (org.apache.xmlbeans.SimpleValue)get_store().add_element_user(DECIDEDTOADMITDATE$16);
                }
                target.setCalendarValue(decidedToAdmitDate);
            }
        }
        
        /**
         * Sets (as xml) the "DecidedToAdmitDate" element
         */
        public void xsetDecidedToAdmitDate(uk.nhs.nhsia.datastandards.ecds.DecidedToAdmitDateType decidedToAdmitDate)
        {
            synchronized (monitor())
            {
                check_orphaned();
                uk.nhs.nhsia.datastandards.ecds.DecidedToAdmitDateType target = null;
                target = (uk.nhs.nhsia.datastandards.ecds.DecidedToAdmitDateType)get_store().find_element_user(DECIDEDTOADMITDATE$16, 0);
                if (target == null)
                {
                    target = (uk.nhs.nhsia.datastandards.ecds.DecidedToAdmitDateType)get_store().add_element_user(DECIDEDTOADMITDATE$16);
                }
                target.set(decidedToAdmitDate);
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
                target = (org.apache.xmlbeans.SimpleValue)get_store().find_element_user(AGEATCDSACTIVITYDATE$18, 0);
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
                target = (uk.nhs.nhsia.datastandards.ecds.AgeAtCDSActivityDateType)get_store().find_element_user(AGEATCDSACTIVITYDATE$18, 0);
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
                target = (org.apache.xmlbeans.SimpleValue)get_store().find_element_user(AGEATCDSACTIVITYDATE$18, 0);
                if (target == null)
                {
                    target = (org.apache.xmlbeans.SimpleValue)get_store().add_element_user(AGEATCDSACTIVITYDATE$18);
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
                target = (uk.nhs.nhsia.datastandards.ecds.AgeAtCDSActivityDateType)get_store().find_element_user(AGEATCDSACTIVITYDATE$18, 0);
                if (target == null)
                {
                    target = (uk.nhs.nhsia.datastandards.ecds.AgeAtCDSActivityDateType)get_store().add_element_user(AGEATCDSACTIVITYDATE$18);
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
                target = (org.apache.xmlbeans.SimpleValue)get_store().find_element_user(OVERSEASVISITORSTATUSCLASSIFICATIONATCDSACTIVITYDATE$20, 0);
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
                target = (uk.nhs.nhsia.datastandards.ecds.OverseasVisitorStatusClassificationAtCDSActivityDateType)get_store().find_element_user(OVERSEASVISITORSTATUSCLASSIFICATIONATCDSACTIVITYDATE$20, 0);
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
                return get_store().count_elements(OVERSEASVISITORSTATUSCLASSIFICATIONATCDSACTIVITYDATE$20) != 0;
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
                target = (org.apache.xmlbeans.SimpleValue)get_store().find_element_user(OVERSEASVISITORSTATUSCLASSIFICATIONATCDSACTIVITYDATE$20, 0);
                if (target == null)
                {
                    target = (org.apache.xmlbeans.SimpleValue)get_store().add_element_user(OVERSEASVISITORSTATUSCLASSIFICATIONATCDSACTIVITYDATE$20);
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
                target = (uk.nhs.nhsia.datastandards.ecds.OverseasVisitorStatusClassificationAtCDSActivityDateType)get_store().find_element_user(OVERSEASVISITORSTATUSCLASSIFICATIONATCDSACTIVITYDATE$20, 0);
                if (target == null)
                {
                    target = (uk.nhs.nhsia.datastandards.ecds.OverseasVisitorStatusClassificationAtCDSActivityDateType)get_store().add_element_user(OVERSEASVISITORSTATUSCLASSIFICATIONATCDSACTIVITYDATE$20);
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
                get_store().remove_element(OVERSEASVISITORSTATUSCLASSIFICATIONATCDSACTIVITYDATE$20, 0);
            }
        }
        
        /**
         * Gets the "GuaranteedAdmissionDate" element
         */
        public java.util.Calendar getGuaranteedAdmissionDate()
        {
            synchronized (monitor())
            {
                check_orphaned();
                org.apache.xmlbeans.SimpleValue target = null;
                target = (org.apache.xmlbeans.SimpleValue)get_store().find_element_user(GUARANTEEDADMISSIONDATE$22, 0);
                if (target == null)
                {
                    return null;
                }
                return target.getCalendarValue();
            }
        }
        
        /**
         * Gets (as xml) the "GuaranteedAdmissionDate" element
         */
        public uk.nhs.nhsia.datastandards.ecds.GuaranteedAdmissionDateType xgetGuaranteedAdmissionDate()
        {
            synchronized (monitor())
            {
                check_orphaned();
                uk.nhs.nhsia.datastandards.ecds.GuaranteedAdmissionDateType target = null;
                target = (uk.nhs.nhsia.datastandards.ecds.GuaranteedAdmissionDateType)get_store().find_element_user(GUARANTEEDADMISSIONDATE$22, 0);
                return target;
            }
        }
        
        /**
         * True if has "GuaranteedAdmissionDate" element
         */
        public boolean isSetGuaranteedAdmissionDate()
        {
            synchronized (monitor())
            {
                check_orphaned();
                return get_store().count_elements(GUARANTEEDADMISSIONDATE$22) != 0;
            }
        }
        
        /**
         * Sets the "GuaranteedAdmissionDate" element
         */
        public void setGuaranteedAdmissionDate(java.util.Calendar guaranteedAdmissionDate)
        {
            synchronized (monitor())
            {
                check_orphaned();
                org.apache.xmlbeans.SimpleValue target = null;
                target = (org.apache.xmlbeans.SimpleValue)get_store().find_element_user(GUARANTEEDADMISSIONDATE$22, 0);
                if (target == null)
                {
                    target = (org.apache.xmlbeans.SimpleValue)get_store().add_element_user(GUARANTEEDADMISSIONDATE$22);
                }
                target.setCalendarValue(guaranteedAdmissionDate);
            }
        }
        
        /**
         * Sets (as xml) the "GuaranteedAdmissionDate" element
         */
        public void xsetGuaranteedAdmissionDate(uk.nhs.nhsia.datastandards.ecds.GuaranteedAdmissionDateType guaranteedAdmissionDate)
        {
            synchronized (monitor())
            {
                check_orphaned();
                uk.nhs.nhsia.datastandards.ecds.GuaranteedAdmissionDateType target = null;
                target = (uk.nhs.nhsia.datastandards.ecds.GuaranteedAdmissionDateType)get_store().find_element_user(GUARANTEEDADMISSIONDATE$22, 0);
                if (target == null)
                {
                    target = (uk.nhs.nhsia.datastandards.ecds.GuaranteedAdmissionDateType)get_store().add_element_user(GUARANTEEDADMISSIONDATE$22);
                }
                target.set(guaranteedAdmissionDate);
            }
        }
        
        /**
         * Unsets the "GuaranteedAdmissionDate" element
         */
        public void unsetGuaranteedAdmissionDate()
        {
            synchronized (monitor())
            {
                check_orphaned();
                get_store().remove_element(GUARANTEEDADMISSIONDATE$22, 0);
            }
        }
        
        /**
         * Gets the "LastDNAOrPatientCancelledDate" element
         */
        public java.util.Calendar getLastDNAOrPatientCancelledDate()
        {
            synchronized (monitor())
            {
                check_orphaned();
                org.apache.xmlbeans.SimpleValue target = null;
                target = (org.apache.xmlbeans.SimpleValue)get_store().find_element_user(LASTDNAORPATIENTCANCELLEDDATE$24, 0);
                if (target == null)
                {
                    return null;
                }
                return target.getCalendarValue();
            }
        }
        
        /**
         * Gets (as xml) the "LastDNAOrPatientCancelledDate" element
         */
        public uk.nhs.nhsia.datastandards.ecds.LastDNAOrPatientCancelledDateType xgetLastDNAOrPatientCancelledDate()
        {
            synchronized (monitor())
            {
                check_orphaned();
                uk.nhs.nhsia.datastandards.ecds.LastDNAOrPatientCancelledDateType target = null;
                target = (uk.nhs.nhsia.datastandards.ecds.LastDNAOrPatientCancelledDateType)get_store().find_element_user(LASTDNAORPATIENTCANCELLEDDATE$24, 0);
                return target;
            }
        }
        
        /**
         * True if has "LastDNAOrPatientCancelledDate" element
         */
        public boolean isSetLastDNAOrPatientCancelledDate()
        {
            synchronized (monitor())
            {
                check_orphaned();
                return get_store().count_elements(LASTDNAORPATIENTCANCELLEDDATE$24) != 0;
            }
        }
        
        /**
         * Sets the "LastDNAOrPatientCancelledDate" element
         */
        public void setLastDNAOrPatientCancelledDate(java.util.Calendar lastDNAOrPatientCancelledDate)
        {
            synchronized (monitor())
            {
                check_orphaned();
                org.apache.xmlbeans.SimpleValue target = null;
                target = (org.apache.xmlbeans.SimpleValue)get_store().find_element_user(LASTDNAORPATIENTCANCELLEDDATE$24, 0);
                if (target == null)
                {
                    target = (org.apache.xmlbeans.SimpleValue)get_store().add_element_user(LASTDNAORPATIENTCANCELLEDDATE$24);
                }
                target.setCalendarValue(lastDNAOrPatientCancelledDate);
            }
        }
        
        /**
         * Sets (as xml) the "LastDNAOrPatientCancelledDate" element
         */
        public void xsetLastDNAOrPatientCancelledDate(uk.nhs.nhsia.datastandards.ecds.LastDNAOrPatientCancelledDateType lastDNAOrPatientCancelledDate)
        {
            synchronized (monitor())
            {
                check_orphaned();
                uk.nhs.nhsia.datastandards.ecds.LastDNAOrPatientCancelledDateType target = null;
                target = (uk.nhs.nhsia.datastandards.ecds.LastDNAOrPatientCancelledDateType)get_store().find_element_user(LASTDNAORPATIENTCANCELLEDDATE$24, 0);
                if (target == null)
                {
                    target = (uk.nhs.nhsia.datastandards.ecds.LastDNAOrPatientCancelledDateType)get_store().add_element_user(LASTDNAORPATIENTCANCELLEDDATE$24);
                }
                target.set(lastDNAOrPatientCancelledDate);
            }
        }
        
        /**
         * Unsets the "LastDNAOrPatientCancelledDate" element
         */
        public void unsetLastDNAOrPatientCancelledDate()
        {
            synchronized (monitor())
            {
                check_orphaned();
                get_store().remove_element(LASTDNAORPATIENTCANCELLEDDATE$24, 0);
            }
        }
        
        /**
         * Gets the "WaitingListEntryLastReviewedDate" element
         */
        public java.util.Calendar getWaitingListEntryLastReviewedDate()
        {
            synchronized (monitor())
            {
                check_orphaned();
                org.apache.xmlbeans.SimpleValue target = null;
                target = (org.apache.xmlbeans.SimpleValue)get_store().find_element_user(WAITINGLISTENTRYLASTREVIEWEDDATE$26, 0);
                if (target == null)
                {
                    return null;
                }
                return target.getCalendarValue();
            }
        }
        
        /**
         * Gets (as xml) the "WaitingListEntryLastReviewedDate" element
         */
        public uk.nhs.nhsia.datastandards.ecds.WaitingListEntryLastReviewedDateType xgetWaitingListEntryLastReviewedDate()
        {
            synchronized (monitor())
            {
                check_orphaned();
                uk.nhs.nhsia.datastandards.ecds.WaitingListEntryLastReviewedDateType target = null;
                target = (uk.nhs.nhsia.datastandards.ecds.WaitingListEntryLastReviewedDateType)get_store().find_element_user(WAITINGLISTENTRYLASTREVIEWEDDATE$26, 0);
                return target;
            }
        }
        
        /**
         * True if has "WaitingListEntryLastReviewedDate" element
         */
        public boolean isSetWaitingListEntryLastReviewedDate()
        {
            synchronized (monitor())
            {
                check_orphaned();
                return get_store().count_elements(WAITINGLISTENTRYLASTREVIEWEDDATE$26) != 0;
            }
        }
        
        /**
         * Sets the "WaitingListEntryLastReviewedDate" element
         */
        public void setWaitingListEntryLastReviewedDate(java.util.Calendar waitingListEntryLastReviewedDate)
        {
            synchronized (monitor())
            {
                check_orphaned();
                org.apache.xmlbeans.SimpleValue target = null;
                target = (org.apache.xmlbeans.SimpleValue)get_store().find_element_user(WAITINGLISTENTRYLASTREVIEWEDDATE$26, 0);
                if (target == null)
                {
                    target = (org.apache.xmlbeans.SimpleValue)get_store().add_element_user(WAITINGLISTENTRYLASTREVIEWEDDATE$26);
                }
                target.setCalendarValue(waitingListEntryLastReviewedDate);
            }
        }
        
        /**
         * Sets (as xml) the "WaitingListEntryLastReviewedDate" element
         */
        public void xsetWaitingListEntryLastReviewedDate(uk.nhs.nhsia.datastandards.ecds.WaitingListEntryLastReviewedDateType waitingListEntryLastReviewedDate)
        {
            synchronized (monitor())
            {
                check_orphaned();
                uk.nhs.nhsia.datastandards.ecds.WaitingListEntryLastReviewedDateType target = null;
                target = (uk.nhs.nhsia.datastandards.ecds.WaitingListEntryLastReviewedDateType)get_store().find_element_user(WAITINGLISTENTRYLASTREVIEWEDDATE$26, 0);
                if (target == null)
                {
                    target = (uk.nhs.nhsia.datastandards.ecds.WaitingListEntryLastReviewedDateType)get_store().add_element_user(WAITINGLISTENTRYLASTREVIEWEDDATE$26);
                }
                target.set(waitingListEntryLastReviewedDate);
            }
        }
        
        /**
         * Unsets the "WaitingListEntryLastReviewedDate" element
         */
        public void unsetWaitingListEntryLastReviewedDate()
        {
            synchronized (monitor())
            {
                check_orphaned();
                get_store().remove_element(WAITINGLISTENTRYLASTREVIEWEDDATE$26, 0);
            }
        }
    }
    /**
     * An XML LocationGroup(@http://www.nhsia.nhs.uk/DataStandards/XMLschema/CDS/ns).
     *
     * This is a complex type.
     */
    public static class LocationGroupImpl extends org.apache.xmlbeans.impl.values.XmlComplexContentImpl implements uk.nhs.nhsia.datastandards.ecds.ElectiveAdmissionListEntryStructure.LocationGroup
    {
        private static final long serialVersionUID = 1L;
        
        public LocationGroupImpl(org.apache.xmlbeans.SchemaType sType)
        {
            super(sType);
        }
        
        private static final javax.xml.namespace.QName INTENDEDSITEOFTREATMENT$0 = 
            new javax.xml.namespace.QName("http://www.nhsia.nhs.uk/DataStandards/XMLschema/CDS/ns", "IntendedSiteOfTreatment");
        
        
        /**
         * Gets the "IntendedSiteOfTreatment" element
         */
        public uk.nhs.nhsia.datastandards.ecds.ElectiveAdmissionListEntryStructure.LocationGroup.IntendedSiteOfTreatment getIntendedSiteOfTreatment()
        {
            synchronized (monitor())
            {
                check_orphaned();
                uk.nhs.nhsia.datastandards.ecds.ElectiveAdmissionListEntryStructure.LocationGroup.IntendedSiteOfTreatment target = null;
                target = (uk.nhs.nhsia.datastandards.ecds.ElectiveAdmissionListEntryStructure.LocationGroup.IntendedSiteOfTreatment)get_store().find_element_user(INTENDEDSITEOFTREATMENT$0, 0);
                if (target == null)
                {
                    return null;
                }
                return target;
            }
        }
        
        /**
         * True if has "IntendedSiteOfTreatment" element
         */
        public boolean isSetIntendedSiteOfTreatment()
        {
            synchronized (monitor())
            {
                check_orphaned();
                return get_store().count_elements(INTENDEDSITEOFTREATMENT$0) != 0;
            }
        }
        
        /**
         * Sets the "IntendedSiteOfTreatment" element
         */
        public void setIntendedSiteOfTreatment(uk.nhs.nhsia.datastandards.ecds.ElectiveAdmissionListEntryStructure.LocationGroup.IntendedSiteOfTreatment intendedSiteOfTreatment)
        {
            generatedSetterHelperImpl(intendedSiteOfTreatment, INTENDEDSITEOFTREATMENT$0, 0, org.apache.xmlbeans.impl.values.XmlObjectBase.KIND_SETTERHELPER_SINGLETON);
        }
        
        /**
         * Appends and returns a new empty "IntendedSiteOfTreatment" element
         */
        public uk.nhs.nhsia.datastandards.ecds.ElectiveAdmissionListEntryStructure.LocationGroup.IntendedSiteOfTreatment addNewIntendedSiteOfTreatment()
        {
            synchronized (monitor())
            {
                check_orphaned();
                uk.nhs.nhsia.datastandards.ecds.ElectiveAdmissionListEntryStructure.LocationGroup.IntendedSiteOfTreatment target = null;
                target = (uk.nhs.nhsia.datastandards.ecds.ElectiveAdmissionListEntryStructure.LocationGroup.IntendedSiteOfTreatment)get_store().add_element_user(INTENDEDSITEOFTREATMENT$0);
                return target;
            }
        }
        
        /**
         * Unsets the "IntendedSiteOfTreatment" element
         */
        public void unsetIntendedSiteOfTreatment()
        {
            synchronized (monitor())
            {
                check_orphaned();
                get_store().remove_element(INTENDEDSITEOFTREATMENT$0, 0);
            }
        }
        /**
         * An XML IntendedSiteOfTreatment(@http://www.nhsia.nhs.uk/DataStandards/XMLschema/CDS/ns).
         *
         * This is a complex type.
         */
        public static class IntendedSiteOfTreatmentImpl extends org.apache.xmlbeans.impl.values.XmlComplexContentImpl implements uk.nhs.nhsia.datastandards.ecds.ElectiveAdmissionListEntryStructure.LocationGroup.IntendedSiteOfTreatment
        {
            private static final long serialVersionUID = 1L;
            
            public IntendedSiteOfTreatmentImpl(org.apache.xmlbeans.SchemaType sType)
            {
                super(sType);
            }
            
            private static final javax.xml.namespace.QName LOCATIONCLASS$0 = 
                new javax.xml.namespace.QName("http://www.nhsia.nhs.uk/DataStandards/XMLschema/CDS/ns", "LocationClass");
            private static final javax.xml.namespace.QName INTENDEDSITECODEOFTREATMENT$2 = 
                new javax.xml.namespace.QName("http://www.nhsia.nhs.uk/DataStandards/XMLschema/CDS/ns", "IntendedSiteCode_OfTreatment");
            private static final javax.xml.namespace.QName ACTIVITYLOCATIONTYPE$4 = 
                new javax.xml.namespace.QName("http://www.nhsia.nhs.uk/DataStandards/XMLschema/CDS/ns", "ActivityLocationType");
            
            
            /**
             * Gets the "LocationClass" element
             */
            public uk.nhs.nhsia.datastandards.ecds.LocationClassType.Enum getLocationClass()
            {
                synchronized (monitor())
                {
                    check_orphaned();
                    org.apache.xmlbeans.SimpleValue target = null;
                    target = (org.apache.xmlbeans.SimpleValue)get_store().find_element_user(LOCATIONCLASS$0, 0);
                    if (target == null)
                    {
                      return null;
                    }
                    return (uk.nhs.nhsia.datastandards.ecds.LocationClassType.Enum)target.getEnumValue();
                }
            }
            
            /**
             * Gets (as xml) the "LocationClass" element
             */
            public uk.nhs.nhsia.datastandards.ecds.LocationClassType xgetLocationClass()
            {
                synchronized (monitor())
                {
                    check_orphaned();
                    uk.nhs.nhsia.datastandards.ecds.LocationClassType target = null;
                    target = (uk.nhs.nhsia.datastandards.ecds.LocationClassType)get_store().find_element_user(LOCATIONCLASS$0, 0);
                    return target;
                }
            }
            
            /**
             * True if has "LocationClass" element
             */
            public boolean isSetLocationClass()
            {
                synchronized (monitor())
                {
                    check_orphaned();
                    return get_store().count_elements(LOCATIONCLASS$0) != 0;
                }
            }
            
            /**
             * Sets the "LocationClass" element
             */
            public void setLocationClass(uk.nhs.nhsia.datastandards.ecds.LocationClassType.Enum locationClass)
            {
                synchronized (monitor())
                {
                    check_orphaned();
                    org.apache.xmlbeans.SimpleValue target = null;
                    target = (org.apache.xmlbeans.SimpleValue)get_store().find_element_user(LOCATIONCLASS$0, 0);
                    if (target == null)
                    {
                      target = (org.apache.xmlbeans.SimpleValue)get_store().add_element_user(LOCATIONCLASS$0);
                    }
                    target.setEnumValue(locationClass);
                }
            }
            
            /**
             * Sets (as xml) the "LocationClass" element
             */
            public void xsetLocationClass(uk.nhs.nhsia.datastandards.ecds.LocationClassType locationClass)
            {
                synchronized (monitor())
                {
                    check_orphaned();
                    uk.nhs.nhsia.datastandards.ecds.LocationClassType target = null;
                    target = (uk.nhs.nhsia.datastandards.ecds.LocationClassType)get_store().find_element_user(LOCATIONCLASS$0, 0);
                    if (target == null)
                    {
                      target = (uk.nhs.nhsia.datastandards.ecds.LocationClassType)get_store().add_element_user(LOCATIONCLASS$0);
                    }
                    target.set(locationClass);
                }
            }
            
            /**
             * Unsets the "LocationClass" element
             */
            public void unsetLocationClass()
            {
                synchronized (monitor())
                {
                    check_orphaned();
                    get_store().remove_element(LOCATIONCLASS$0, 0);
                }
            }
            
            /**
             * Gets the "IntendedSiteCode_OfTreatment" element
             */
            public java.lang.String getIntendedSiteCodeOfTreatment()
            {
                synchronized (monitor())
                {
                    check_orphaned();
                    org.apache.xmlbeans.SimpleValue target = null;
                    target = (org.apache.xmlbeans.SimpleValue)get_store().find_element_user(INTENDEDSITECODEOFTREATMENT$2, 0);
                    if (target == null)
                    {
                      return null;
                    }
                    return target.getStringValue();
                }
            }
            
            /**
             * Gets (as xml) the "IntendedSiteCode_OfTreatment" element
             */
            public uk.nhs.nhsia.datastandards.ecds.IntendedSiteCodeOfTreatmentType xgetIntendedSiteCodeOfTreatment()
            {
                synchronized (monitor())
                {
                    check_orphaned();
                    uk.nhs.nhsia.datastandards.ecds.IntendedSiteCodeOfTreatmentType target = null;
                    target = (uk.nhs.nhsia.datastandards.ecds.IntendedSiteCodeOfTreatmentType)get_store().find_element_user(INTENDEDSITECODEOFTREATMENT$2, 0);
                    return target;
                }
            }
            
            /**
             * True if has "IntendedSiteCode_OfTreatment" element
             */
            public boolean isSetIntendedSiteCodeOfTreatment()
            {
                synchronized (monitor())
                {
                    check_orphaned();
                    return get_store().count_elements(INTENDEDSITECODEOFTREATMENT$2) != 0;
                }
            }
            
            /**
             * Sets the "IntendedSiteCode_OfTreatment" element
             */
            public void setIntendedSiteCodeOfTreatment(java.lang.String intendedSiteCodeOfTreatment)
            {
                synchronized (monitor())
                {
                    check_orphaned();
                    org.apache.xmlbeans.SimpleValue target = null;
                    target = (org.apache.xmlbeans.SimpleValue)get_store().find_element_user(INTENDEDSITECODEOFTREATMENT$2, 0);
                    if (target == null)
                    {
                      target = (org.apache.xmlbeans.SimpleValue)get_store().add_element_user(INTENDEDSITECODEOFTREATMENT$2);
                    }
                    target.setStringValue(intendedSiteCodeOfTreatment);
                }
            }
            
            /**
             * Sets (as xml) the "IntendedSiteCode_OfTreatment" element
             */
            public void xsetIntendedSiteCodeOfTreatment(uk.nhs.nhsia.datastandards.ecds.IntendedSiteCodeOfTreatmentType intendedSiteCodeOfTreatment)
            {
                synchronized (monitor())
                {
                    check_orphaned();
                    uk.nhs.nhsia.datastandards.ecds.IntendedSiteCodeOfTreatmentType target = null;
                    target = (uk.nhs.nhsia.datastandards.ecds.IntendedSiteCodeOfTreatmentType)get_store().find_element_user(INTENDEDSITECODEOFTREATMENT$2, 0);
                    if (target == null)
                    {
                      target = (uk.nhs.nhsia.datastandards.ecds.IntendedSiteCodeOfTreatmentType)get_store().add_element_user(INTENDEDSITECODEOFTREATMENT$2);
                    }
                    target.set(intendedSiteCodeOfTreatment);
                }
            }
            
            /**
             * Unsets the "IntendedSiteCode_OfTreatment" element
             */
            public void unsetIntendedSiteCodeOfTreatment()
            {
                synchronized (monitor())
                {
                    check_orphaned();
                    get_store().remove_element(INTENDEDSITECODEOFTREATMENT$2, 0);
                }
            }
            
            /**
             * Gets the "ActivityLocationType" element
             */
            public uk.nhs.nhsia.datastandards.ecds.ActivityLocationTypeType.Enum getActivityLocationType()
            {
                synchronized (monitor())
                {
                    check_orphaned();
                    org.apache.xmlbeans.SimpleValue target = null;
                    target = (org.apache.xmlbeans.SimpleValue)get_store().find_element_user(ACTIVITYLOCATIONTYPE$4, 0);
                    if (target == null)
                    {
                      return null;
                    }
                    return (uk.nhs.nhsia.datastandards.ecds.ActivityLocationTypeType.Enum)target.getEnumValue();
                }
            }
            
            /**
             * Gets (as xml) the "ActivityLocationType" element
             */
            public uk.nhs.nhsia.datastandards.ecds.ActivityLocationTypeType xgetActivityLocationType()
            {
                synchronized (monitor())
                {
                    check_orphaned();
                    uk.nhs.nhsia.datastandards.ecds.ActivityLocationTypeType target = null;
                    target = (uk.nhs.nhsia.datastandards.ecds.ActivityLocationTypeType)get_store().find_element_user(ACTIVITYLOCATIONTYPE$4, 0);
                    return target;
                }
            }
            
            /**
             * True if has "ActivityLocationType" element
             */
            public boolean isSetActivityLocationType()
            {
                synchronized (monitor())
                {
                    check_orphaned();
                    return get_store().count_elements(ACTIVITYLOCATIONTYPE$4) != 0;
                }
            }
            
            /**
             * Sets the "ActivityLocationType" element
             */
            public void setActivityLocationType(uk.nhs.nhsia.datastandards.ecds.ActivityLocationTypeType.Enum activityLocationType)
            {
                synchronized (monitor())
                {
                    check_orphaned();
                    org.apache.xmlbeans.SimpleValue target = null;
                    target = (org.apache.xmlbeans.SimpleValue)get_store().find_element_user(ACTIVITYLOCATIONTYPE$4, 0);
                    if (target == null)
                    {
                      target = (org.apache.xmlbeans.SimpleValue)get_store().add_element_user(ACTIVITYLOCATIONTYPE$4);
                    }
                    target.setEnumValue(activityLocationType);
                }
            }
            
            /**
             * Sets (as xml) the "ActivityLocationType" element
             */
            public void xsetActivityLocationType(uk.nhs.nhsia.datastandards.ecds.ActivityLocationTypeType activityLocationType)
            {
                synchronized (monitor())
                {
                    check_orphaned();
                    uk.nhs.nhsia.datastandards.ecds.ActivityLocationTypeType target = null;
                    target = (uk.nhs.nhsia.datastandards.ecds.ActivityLocationTypeType)get_store().find_element_user(ACTIVITYLOCATIONTYPE$4, 0);
                    if (target == null)
                    {
                      target = (uk.nhs.nhsia.datastandards.ecds.ActivityLocationTypeType)get_store().add_element_user(ACTIVITYLOCATIONTYPE$4);
                    }
                    target.set(activityLocationType);
                }
            }
            
            /**
             * Unsets the "ActivityLocationType" element
             */
            public void unsetActivityLocationType()
            {
                synchronized (monitor())
                {
                    check_orphaned();
                    get_store().remove_element(ACTIVITYLOCATIONTYPE$4, 0);
                }
            }
        }
    }
}
