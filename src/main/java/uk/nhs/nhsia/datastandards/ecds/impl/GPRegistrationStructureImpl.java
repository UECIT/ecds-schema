/*
 * XML Type:  GPRegistration_Structure
 * Namespace: http://www.nhsia.nhs.uk/DataStandards/XMLschema/CDS/ns
 * Java type: uk.nhs.nhsia.datastandards.ecds.GPRegistrationStructure
 *
 * Automatically generated - do not modify.
 */
package uk.nhs.nhsia.datastandards.ecds.impl;
/**
 * An XML GPRegistration_Structure(@http://www.nhsia.nhs.uk/DataStandards/XMLschema/CDS/ns).
 *
 * This is a complex type.
 */
public class GPRegistrationStructureImpl extends org.apache.xmlbeans.impl.values.XmlComplexContentImpl implements uk.nhs.nhsia.datastandards.ecds.GPRegistrationStructure
{
    private static final long serialVersionUID = 1L;
    
    public GPRegistrationStructureImpl(org.apache.xmlbeans.SchemaType sType)
    {
        super(sType);
    }
    
    private static final javax.xml.namespace.QName GENERALMEDICALPRACTITIONERSPECIFIED$0 = 
        new javax.xml.namespace.QName("http://www.nhsia.nhs.uk/DataStandards/XMLschema/CDS/ns", "GeneralMedicalPractitioner_Specified");
    private static final javax.xml.namespace.QName GENERALPRACTICEPATIENTREGISTRATION$2 = 
        new javax.xml.namespace.QName("http://www.nhsia.nhs.uk/DataStandards/XMLschema/CDS/ns", "GeneralPractice_PatientRegistration");
    
    
    /**
     * Gets the "GeneralMedicalPractitioner_Specified" element
     */
    public java.lang.String getGeneralMedicalPractitionerSpecified()
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.SimpleValue target = null;
            target = (org.apache.xmlbeans.SimpleValue)get_store().find_element_user(GENERALMEDICALPRACTITIONERSPECIFIED$0, 0);
            if (target == null)
            {
                return null;
            }
            return target.getStringValue();
        }
    }
    
    /**
     * Gets (as xml) the "GeneralMedicalPractitioner_Specified" element
     */
    public uk.nhs.nhsia.datastandards.ecds.GeneralMedicalPractitionerSpecifiedType xgetGeneralMedicalPractitionerSpecified()
    {
        synchronized (monitor())
        {
            check_orphaned();
            uk.nhs.nhsia.datastandards.ecds.GeneralMedicalPractitionerSpecifiedType target = null;
            target = (uk.nhs.nhsia.datastandards.ecds.GeneralMedicalPractitionerSpecifiedType)get_store().find_element_user(GENERALMEDICALPRACTITIONERSPECIFIED$0, 0);
            return target;
        }
    }
    
    /**
     * True if has "GeneralMedicalPractitioner_Specified" element
     */
    public boolean isSetGeneralMedicalPractitionerSpecified()
    {
        synchronized (monitor())
        {
            check_orphaned();
            return get_store().count_elements(GENERALMEDICALPRACTITIONERSPECIFIED$0) != 0;
        }
    }
    
    /**
     * Sets the "GeneralMedicalPractitioner_Specified" element
     */
    public void setGeneralMedicalPractitionerSpecified(java.lang.String generalMedicalPractitionerSpecified)
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.SimpleValue target = null;
            target = (org.apache.xmlbeans.SimpleValue)get_store().find_element_user(GENERALMEDICALPRACTITIONERSPECIFIED$0, 0);
            if (target == null)
            {
                target = (org.apache.xmlbeans.SimpleValue)get_store().add_element_user(GENERALMEDICALPRACTITIONERSPECIFIED$0);
            }
            target.setStringValue(generalMedicalPractitionerSpecified);
        }
    }
    
    /**
     * Sets (as xml) the "GeneralMedicalPractitioner_Specified" element
     */
    public void xsetGeneralMedicalPractitionerSpecified(uk.nhs.nhsia.datastandards.ecds.GeneralMedicalPractitionerSpecifiedType generalMedicalPractitionerSpecified)
    {
        synchronized (monitor())
        {
            check_orphaned();
            uk.nhs.nhsia.datastandards.ecds.GeneralMedicalPractitionerSpecifiedType target = null;
            target = (uk.nhs.nhsia.datastandards.ecds.GeneralMedicalPractitionerSpecifiedType)get_store().find_element_user(GENERALMEDICALPRACTITIONERSPECIFIED$0, 0);
            if (target == null)
            {
                target = (uk.nhs.nhsia.datastandards.ecds.GeneralMedicalPractitionerSpecifiedType)get_store().add_element_user(GENERALMEDICALPRACTITIONERSPECIFIED$0);
            }
            target.set(generalMedicalPractitionerSpecified);
        }
    }
    
    /**
     * Unsets the "GeneralMedicalPractitioner_Specified" element
     */
    public void unsetGeneralMedicalPractitionerSpecified()
    {
        synchronized (monitor())
        {
            check_orphaned();
            get_store().remove_element(GENERALMEDICALPRACTITIONERSPECIFIED$0, 0);
        }
    }
    
    /**
     * Gets the "GeneralPractice_PatientRegistration" element
     */
    public java.lang.String getGeneralPracticePatientRegistration()
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.SimpleValue target = null;
            target = (org.apache.xmlbeans.SimpleValue)get_store().find_element_user(GENERALPRACTICEPATIENTREGISTRATION$2, 0);
            if (target == null)
            {
                return null;
            }
            return target.getStringValue();
        }
    }
    
    /**
     * Gets (as xml) the "GeneralPractice_PatientRegistration" element
     */
    public uk.nhs.nhsia.datastandards.ecds.GPRegistrationStructure.GeneralPracticePatientRegistration xgetGeneralPracticePatientRegistration()
    {
        synchronized (monitor())
        {
            check_orphaned();
            uk.nhs.nhsia.datastandards.ecds.GPRegistrationStructure.GeneralPracticePatientRegistration target = null;
            target = (uk.nhs.nhsia.datastandards.ecds.GPRegistrationStructure.GeneralPracticePatientRegistration)get_store().find_element_user(GENERALPRACTICEPATIENTREGISTRATION$2, 0);
            return target;
        }
    }
    
    /**
     * True if has "GeneralPractice_PatientRegistration" element
     */
    public boolean isSetGeneralPracticePatientRegistration()
    {
        synchronized (monitor())
        {
            check_orphaned();
            return get_store().count_elements(GENERALPRACTICEPATIENTREGISTRATION$2) != 0;
        }
    }
    
    /**
     * Sets the "GeneralPractice_PatientRegistration" element
     */
    public void setGeneralPracticePatientRegistration(java.lang.String generalPracticePatientRegistration)
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.SimpleValue target = null;
            target = (org.apache.xmlbeans.SimpleValue)get_store().find_element_user(GENERALPRACTICEPATIENTREGISTRATION$2, 0);
            if (target == null)
            {
                target = (org.apache.xmlbeans.SimpleValue)get_store().add_element_user(GENERALPRACTICEPATIENTREGISTRATION$2);
            }
            target.setStringValue(generalPracticePatientRegistration);
        }
    }
    
    /**
     * Sets (as xml) the "GeneralPractice_PatientRegistration" element
     */
    public void xsetGeneralPracticePatientRegistration(uk.nhs.nhsia.datastandards.ecds.GPRegistrationStructure.GeneralPracticePatientRegistration generalPracticePatientRegistration)
    {
        synchronized (monitor())
        {
            check_orphaned();
            uk.nhs.nhsia.datastandards.ecds.GPRegistrationStructure.GeneralPracticePatientRegistration target = null;
            target = (uk.nhs.nhsia.datastandards.ecds.GPRegistrationStructure.GeneralPracticePatientRegistration)get_store().find_element_user(GENERALPRACTICEPATIENTREGISTRATION$2, 0);
            if (target == null)
            {
                target = (uk.nhs.nhsia.datastandards.ecds.GPRegistrationStructure.GeneralPracticePatientRegistration)get_store().add_element_user(GENERALPRACTICEPATIENTREGISTRATION$2);
            }
            target.set(generalPracticePatientRegistration);
        }
    }
    
    /**
     * Unsets the "GeneralPractice_PatientRegistration" element
     */
    public void unsetGeneralPracticePatientRegistration()
    {
        synchronized (monitor())
        {
            check_orphaned();
            get_store().remove_element(GENERALPRACTICEPATIENTREGISTRATION$2, 0);
        }
    }
    /**
     * An XML GeneralPractice_PatientRegistration(@http://www.nhsia.nhs.uk/DataStandards/XMLschema/CDS/ns).
     *
     * This is an atomic type that is a restriction of uk.nhs.nhsia.datastandards.ecds.GPRegistrationStructure$GeneralPracticePatientRegistration.
     */
    public static class GeneralPracticePatientRegistrationImpl extends org.apache.xmlbeans.impl.values.JavaStringHolderEx implements uk.nhs.nhsia.datastandards.ecds.GPRegistrationStructure.GeneralPracticePatientRegistration
    {
        private static final long serialVersionUID = 1L;
        
        public GeneralPracticePatientRegistrationImpl(org.apache.xmlbeans.SchemaType sType)
        {
            super(sType, false);
        }
        
        protected GeneralPracticePatientRegistrationImpl(org.apache.xmlbeans.SchemaType sType, boolean b)
        {
            super(sType, b);
        }
    }
}
