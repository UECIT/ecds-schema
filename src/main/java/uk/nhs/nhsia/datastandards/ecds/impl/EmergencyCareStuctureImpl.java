/*
 * XML Type:  EmergencyCare_Stucture
 * Namespace: http://www.nhsia.nhs.uk/DataStandards/XMLschema/CDS/ns
 * Java type: uk.nhs.nhsia.datastandards.ecds.EmergencyCareStucture
 *
 * Automatically generated - do not modify.
 */
package uk.nhs.nhsia.datastandards.ecds.impl;
/**
 * An XML EmergencyCare_Stucture(@http://www.nhsia.nhs.uk/DataStandards/XMLschema/CDS/ns).
 *
 * This is a complex type.
 */
public class EmergencyCareStuctureImpl extends org.apache.xmlbeans.impl.values.XmlComplexContentImpl implements uk.nhs.nhsia.datastandards.ecds.EmergencyCareStucture
{
    private static final long serialVersionUID = 1L;
    
    public EmergencyCareStuctureImpl(org.apache.xmlbeans.SchemaType sType)
    {
        super(sType);
    }
    
    private static final javax.xml.namespace.QName PATIENTPATHWAY$0 = 
        new javax.xml.namespace.QName("http://www.nhsia.nhs.uk/DataStandards/XMLschema/CDS/ns", "PatientPathway");
    private static final javax.xml.namespace.QName PERSONGROUPPATIENT$2 = 
        new javax.xml.namespace.QName("http://www.nhsia.nhs.uk/DataStandards/XMLschema/CDS/ns", "PersonGroupPatient");
    private static final javax.xml.namespace.QName GPREGISTRATION$4 = 
        new javax.xml.namespace.QName("http://www.nhsia.nhs.uk/DataStandards/XMLschema/CDS/ns", "GPRegistration");
    private static final javax.xml.namespace.QName EMERGENCYCAREATTENDANCELOCATION$6 = 
        new javax.xml.namespace.QName("http://www.nhsia.nhs.uk/DataStandards/XMLschema/CDS/ns", "EmergencyCareAttendanceLocation");
    private static final javax.xml.namespace.QName ATTENDANCEOCCURRENCE$8 = 
        new javax.xml.namespace.QName("http://www.nhsia.nhs.uk/DataStandards/XMLschema/CDS/ns", "AttendanceOccurrence");
    
    
    /**
     * Gets the "PatientPathway" element
     */
    public uk.nhs.nhsia.datastandards.ecds.PatientPathwayECStructure getPatientPathway()
    {
        synchronized (monitor())
        {
            check_orphaned();
            uk.nhs.nhsia.datastandards.ecds.PatientPathwayECStructure target = null;
            target = (uk.nhs.nhsia.datastandards.ecds.PatientPathwayECStructure)get_store().find_element_user(PATIENTPATHWAY$0, 0);
            if (target == null)
            {
                return null;
            }
            return target;
        }
    }
    
    /**
     * True if has "PatientPathway" element
     */
    public boolean isSetPatientPathway()
    {
        synchronized (monitor())
        {
            check_orphaned();
            return get_store().count_elements(PATIENTPATHWAY$0) != 0;
        }
    }
    
    /**
     * Sets the "PatientPathway" element
     */
    public void setPatientPathway(uk.nhs.nhsia.datastandards.ecds.PatientPathwayECStructure patientPathway)
    {
        generatedSetterHelperImpl(patientPathway, PATIENTPATHWAY$0, 0, org.apache.xmlbeans.impl.values.XmlObjectBase.KIND_SETTERHELPER_SINGLETON);
    }
    
    /**
     * Appends and returns a new empty "PatientPathway" element
     */
    public uk.nhs.nhsia.datastandards.ecds.PatientPathwayECStructure addNewPatientPathway()
    {
        synchronized (monitor())
        {
            check_orphaned();
            uk.nhs.nhsia.datastandards.ecds.PatientPathwayECStructure target = null;
            target = (uk.nhs.nhsia.datastandards.ecds.PatientPathwayECStructure)get_store().add_element_user(PATIENTPATHWAY$0);
            return target;
        }
    }
    
    /**
     * Unsets the "PatientPathway" element
     */
    public void unsetPatientPathway()
    {
        synchronized (monitor())
        {
            check_orphaned();
            get_store().remove_element(PATIENTPATHWAY$0, 0);
        }
    }
    
    /**
     * Gets the "PersonGroupPatient" element
     */
    public uk.nhs.nhsia.datastandards.ecds.PersonGroupPatientECStructure getPersonGroupPatient()
    {
        synchronized (monitor())
        {
            check_orphaned();
            uk.nhs.nhsia.datastandards.ecds.PersonGroupPatientECStructure target = null;
            target = (uk.nhs.nhsia.datastandards.ecds.PersonGroupPatientECStructure)get_store().find_element_user(PERSONGROUPPATIENT$2, 0);
            if (target == null)
            {
                return null;
            }
            return target;
        }
    }
    
    /**
     * Sets the "PersonGroupPatient" element
     */
    public void setPersonGroupPatient(uk.nhs.nhsia.datastandards.ecds.PersonGroupPatientECStructure personGroupPatient)
    {
        generatedSetterHelperImpl(personGroupPatient, PERSONGROUPPATIENT$2, 0, org.apache.xmlbeans.impl.values.XmlObjectBase.KIND_SETTERHELPER_SINGLETON);
    }
    
    /**
     * Appends and returns a new empty "PersonGroupPatient" element
     */
    public uk.nhs.nhsia.datastandards.ecds.PersonGroupPatientECStructure addNewPersonGroupPatient()
    {
        synchronized (monitor())
        {
            check_orphaned();
            uk.nhs.nhsia.datastandards.ecds.PersonGroupPatientECStructure target = null;
            target = (uk.nhs.nhsia.datastandards.ecds.PersonGroupPatientECStructure)get_store().add_element_user(PERSONGROUPPATIENT$2);
            return target;
        }
    }
    
    /**
     * Gets the "GPRegistration" element
     */
    public uk.nhs.nhsia.datastandards.ecds.GPRegistrationStructure getGPRegistration()
    {
        synchronized (monitor())
        {
            check_orphaned();
            uk.nhs.nhsia.datastandards.ecds.GPRegistrationStructure target = null;
            target = (uk.nhs.nhsia.datastandards.ecds.GPRegistrationStructure)get_store().find_element_user(GPREGISTRATION$4, 0);
            if (target == null)
            {
                return null;
            }
            return target;
        }
    }
    
    /**
     * True if has "GPRegistration" element
     */
    public boolean isSetGPRegistration()
    {
        synchronized (monitor())
        {
            check_orphaned();
            return get_store().count_elements(GPREGISTRATION$4) != 0;
        }
    }
    
    /**
     * Sets the "GPRegistration" element
     */
    public void setGPRegistration(uk.nhs.nhsia.datastandards.ecds.GPRegistrationStructure gpRegistration)
    {
        generatedSetterHelperImpl(gpRegistration, GPREGISTRATION$4, 0, org.apache.xmlbeans.impl.values.XmlObjectBase.KIND_SETTERHELPER_SINGLETON);
    }
    
    /**
     * Appends and returns a new empty "GPRegistration" element
     */
    public uk.nhs.nhsia.datastandards.ecds.GPRegistrationStructure addNewGPRegistration()
    {
        synchronized (monitor())
        {
            check_orphaned();
            uk.nhs.nhsia.datastandards.ecds.GPRegistrationStructure target = null;
            target = (uk.nhs.nhsia.datastandards.ecds.GPRegistrationStructure)get_store().add_element_user(GPREGISTRATION$4);
            return target;
        }
    }
    
    /**
     * Unsets the "GPRegistration" element
     */
    public void unsetGPRegistration()
    {
        synchronized (monitor())
        {
            check_orphaned();
            get_store().remove_element(GPREGISTRATION$4, 0);
        }
    }
    
    /**
     * Gets the "EmergencyCareAttendanceLocation" element
     */
    public uk.nhs.nhsia.datastandards.ecds.EmergencyCareStucture.EmergencyCareAttendanceLocation getEmergencyCareAttendanceLocation()
    {
        synchronized (monitor())
        {
            check_orphaned();
            uk.nhs.nhsia.datastandards.ecds.EmergencyCareStucture.EmergencyCareAttendanceLocation target = null;
            target = (uk.nhs.nhsia.datastandards.ecds.EmergencyCareStucture.EmergencyCareAttendanceLocation)get_store().find_element_user(EMERGENCYCAREATTENDANCELOCATION$6, 0);
            if (target == null)
            {
                return null;
            }
            return target;
        }
    }
    
    /**
     * Sets the "EmergencyCareAttendanceLocation" element
     */
    public void setEmergencyCareAttendanceLocation(uk.nhs.nhsia.datastandards.ecds.EmergencyCareStucture.EmergencyCareAttendanceLocation emergencyCareAttendanceLocation)
    {
        generatedSetterHelperImpl(emergencyCareAttendanceLocation, EMERGENCYCAREATTENDANCELOCATION$6, 0, org.apache.xmlbeans.impl.values.XmlObjectBase.KIND_SETTERHELPER_SINGLETON);
    }
    
    /**
     * Appends and returns a new empty "EmergencyCareAttendanceLocation" element
     */
    public uk.nhs.nhsia.datastandards.ecds.EmergencyCareStucture.EmergencyCareAttendanceLocation addNewEmergencyCareAttendanceLocation()
    {
        synchronized (monitor())
        {
            check_orphaned();
            uk.nhs.nhsia.datastandards.ecds.EmergencyCareStucture.EmergencyCareAttendanceLocation target = null;
            target = (uk.nhs.nhsia.datastandards.ecds.EmergencyCareStucture.EmergencyCareAttendanceLocation)get_store().add_element_user(EMERGENCYCAREATTENDANCELOCATION$6);
            return target;
        }
    }
    
    /**
     * Gets the "AttendanceOccurrence" element
     */
    public uk.nhs.nhsia.datastandards.ecds.AttendanceOccurrenceECStructure getAttendanceOccurrence()
    {
        synchronized (monitor())
        {
            check_orphaned();
            uk.nhs.nhsia.datastandards.ecds.AttendanceOccurrenceECStructure target = null;
            target = (uk.nhs.nhsia.datastandards.ecds.AttendanceOccurrenceECStructure)get_store().find_element_user(ATTENDANCEOCCURRENCE$8, 0);
            if (target == null)
            {
                return null;
            }
            return target;
        }
    }
    
    /**
     * Sets the "AttendanceOccurrence" element
     */
    public void setAttendanceOccurrence(uk.nhs.nhsia.datastandards.ecds.AttendanceOccurrenceECStructure attendanceOccurrence)
    {
        generatedSetterHelperImpl(attendanceOccurrence, ATTENDANCEOCCURRENCE$8, 0, org.apache.xmlbeans.impl.values.XmlObjectBase.KIND_SETTERHELPER_SINGLETON);
    }
    
    /**
     * Appends and returns a new empty "AttendanceOccurrence" element
     */
    public uk.nhs.nhsia.datastandards.ecds.AttendanceOccurrenceECStructure addNewAttendanceOccurrence()
    {
        synchronized (monitor())
        {
            check_orphaned();
            uk.nhs.nhsia.datastandards.ecds.AttendanceOccurrenceECStructure target = null;
            target = (uk.nhs.nhsia.datastandards.ecds.AttendanceOccurrenceECStructure)get_store().add_element_user(ATTENDANCEOCCURRENCE$8);
            return target;
        }
    }
    /**
     * An XML EmergencyCareAttendanceLocation(@http://www.nhsia.nhs.uk/DataStandards/XMLschema/CDS/ns).
     *
     * This is a complex type.
     */
    public static class EmergencyCareAttendanceLocationImpl extends org.apache.xmlbeans.impl.values.XmlComplexContentImpl implements uk.nhs.nhsia.datastandards.ecds.EmergencyCareStucture.EmergencyCareAttendanceLocation
    {
        private static final long serialVersionUID = 1L;
        
        public EmergencyCareAttendanceLocationImpl(org.apache.xmlbeans.SchemaType sType)
        {
            super(sType);
        }
        
        private static final javax.xml.namespace.QName ORGANISATIONSITEIDENTIFIEROFTREATMENT$0 = 
            new javax.xml.namespace.QName("http://www.nhsia.nhs.uk/DataStandards/XMLschema/CDS/ns", "OrganisationSiteIdentifier_OfTreatment");
        private static final javax.xml.namespace.QName EMERGENCYCAREDEPARTMENTTYPE$2 = 
            new javax.xml.namespace.QName("http://www.nhsia.nhs.uk/DataStandards/XMLschema/CDS/ns", "EmergencyCareDepartmentType");
        
        
        /**
         * Gets the "OrganisationSiteIdentifier_OfTreatment" element
         */
        public java.lang.String getOrganisationSiteIdentifierOfTreatment()
        {
            synchronized (monitor())
            {
                check_orphaned();
                org.apache.xmlbeans.SimpleValue target = null;
                target = (org.apache.xmlbeans.SimpleValue)get_store().find_element_user(ORGANISATIONSITEIDENTIFIEROFTREATMENT$0, 0);
                if (target == null)
                {
                    return null;
                }
                return target.getStringValue();
            }
        }
        
        /**
         * Gets (as xml) the "OrganisationSiteIdentifier_OfTreatment" element
         */
        public uk.nhs.nhsia.datastandards.ecds.AN59ECType xgetOrganisationSiteIdentifierOfTreatment()
        {
            synchronized (monitor())
            {
                check_orphaned();
                uk.nhs.nhsia.datastandards.ecds.AN59ECType target = null;
                target = (uk.nhs.nhsia.datastandards.ecds.AN59ECType)get_store().find_element_user(ORGANISATIONSITEIDENTIFIEROFTREATMENT$0, 0);
                return target;
            }
        }
        
        /**
         * Sets the "OrganisationSiteIdentifier_OfTreatment" element
         */
        public void setOrganisationSiteIdentifierOfTreatment(java.lang.String organisationSiteIdentifierOfTreatment)
        {
            synchronized (monitor())
            {
                check_orphaned();
                org.apache.xmlbeans.SimpleValue target = null;
                target = (org.apache.xmlbeans.SimpleValue)get_store().find_element_user(ORGANISATIONSITEIDENTIFIEROFTREATMENT$0, 0);
                if (target == null)
                {
                    target = (org.apache.xmlbeans.SimpleValue)get_store().add_element_user(ORGANISATIONSITEIDENTIFIEROFTREATMENT$0);
                }
                target.setStringValue(organisationSiteIdentifierOfTreatment);
            }
        }
        
        /**
         * Sets (as xml) the "OrganisationSiteIdentifier_OfTreatment" element
         */
        public void xsetOrganisationSiteIdentifierOfTreatment(uk.nhs.nhsia.datastandards.ecds.AN59ECType organisationSiteIdentifierOfTreatment)
        {
            synchronized (monitor())
            {
                check_orphaned();
                uk.nhs.nhsia.datastandards.ecds.AN59ECType target = null;
                target = (uk.nhs.nhsia.datastandards.ecds.AN59ECType)get_store().find_element_user(ORGANISATIONSITEIDENTIFIEROFTREATMENT$0, 0);
                if (target == null)
                {
                    target = (uk.nhs.nhsia.datastandards.ecds.AN59ECType)get_store().add_element_user(ORGANISATIONSITEIDENTIFIEROFTREATMENT$0);
                }
                target.set(organisationSiteIdentifierOfTreatment);
            }
        }
        
        /**
         * Gets the "EmergencyCareDepartmentType" element
         */
        public uk.nhs.nhsia.datastandards.ecds.AN2ECType.Enum getEmergencyCareDepartmentType()
        {
            synchronized (monitor())
            {
                check_orphaned();
                org.apache.xmlbeans.SimpleValue target = null;
                target = (org.apache.xmlbeans.SimpleValue)get_store().find_element_user(EMERGENCYCAREDEPARTMENTTYPE$2, 0);
                if (target == null)
                {
                    return null;
                }
                return (uk.nhs.nhsia.datastandards.ecds.AN2ECType.Enum)target.getEnumValue();
            }
        }
        
        /**
         * Gets (as xml) the "EmergencyCareDepartmentType" element
         */
        public uk.nhs.nhsia.datastandards.ecds.AN2ECType xgetEmergencyCareDepartmentType()
        {
            synchronized (monitor())
            {
                check_orphaned();
                uk.nhs.nhsia.datastandards.ecds.AN2ECType target = null;
                target = (uk.nhs.nhsia.datastandards.ecds.AN2ECType)get_store().find_element_user(EMERGENCYCAREDEPARTMENTTYPE$2, 0);
                return target;
            }
        }
        
        /**
         * Sets the "EmergencyCareDepartmentType" element
         */
        public void setEmergencyCareDepartmentType(uk.nhs.nhsia.datastandards.ecds.AN2ECType.Enum emergencyCareDepartmentType)
        {
            synchronized (monitor())
            {
                check_orphaned();
                org.apache.xmlbeans.SimpleValue target = null;
                target = (org.apache.xmlbeans.SimpleValue)get_store().find_element_user(EMERGENCYCAREDEPARTMENTTYPE$2, 0);
                if (target == null)
                {
                    target = (org.apache.xmlbeans.SimpleValue)get_store().add_element_user(EMERGENCYCAREDEPARTMENTTYPE$2);
                }
                target.setEnumValue(emergencyCareDepartmentType);
            }
        }
        
        /**
         * Sets (as xml) the "EmergencyCareDepartmentType" element
         */
        public void xsetEmergencyCareDepartmentType(uk.nhs.nhsia.datastandards.ecds.AN2ECType emergencyCareDepartmentType)
        {
            synchronized (monitor())
            {
                check_orphaned();
                uk.nhs.nhsia.datastandards.ecds.AN2ECType target = null;
                target = (uk.nhs.nhsia.datastandards.ecds.AN2ECType)get_store().find_element_user(EMERGENCYCAREDEPARTMENTTYPE$2, 0);
                if (target == null)
                {
                    target = (uk.nhs.nhsia.datastandards.ecds.AN2ECType)get_store().add_element_user(EMERGENCYCAREDEPARTMENTTYPE$2);
                }
                target.set(emergencyCareDepartmentType);
            }
        }
    }
}
