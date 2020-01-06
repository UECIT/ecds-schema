/*
 * XML Type:  PersonGroupPatient_Outpatient_Structure
 * Namespace: http://www.nhsia.nhs.uk/DataStandards/XMLschema/CDS/ns
 * Java type: uk.nhs.nhsia.datastandards.ecds.PersonGroupPatientOutpatientStructure
 *
 * Automatically generated - do not modify.
 */
package uk.nhs.nhsia.datastandards.ecds.impl;
/**
 * An XML PersonGroupPatient_Outpatient_Structure(@http://www.nhsia.nhs.uk/DataStandards/XMLschema/CDS/ns).
 *
 * This is a complex type.
 */
public class PersonGroupPatientOutpatientStructureImpl extends org.apache.xmlbeans.impl.values.XmlComplexContentImpl implements uk.nhs.nhsia.datastandards.ecds.PersonGroupPatientOutpatientStructure
{
    private static final long serialVersionUID = 1L;
    
    public PersonGroupPatientOutpatientStructureImpl(org.apache.xmlbeans.SchemaType sType)
    {
        super(sType);
    }
    
    private static final javax.xml.namespace.QName PATIENTIDENTITYGENERALSTRUCTURE$0 = 
        new javax.xml.namespace.QName("http://www.nhsia.nhs.uk/DataStandards/XMLschema/CDS/ns", "PatientIdentity_General_Structure");
    private static final javax.xml.namespace.QName PATIENTCHARACTERISTICSCAREACTIVITYSTRUCTURE$2 = 
        new javax.xml.namespace.QName("http://www.nhsia.nhs.uk/DataStandards/XMLschema/CDS/ns", "PatientCharacteristics_CareActivity_Structure");
    
    
    /**
     * Gets the "PatientIdentity_General_Structure" element
     */
    public uk.nhs.nhsia.datastandards.ecds.PatientIdentityGeneralStructure getPatientIdentityGeneralStructure()
    {
        synchronized (monitor())
        {
            check_orphaned();
            uk.nhs.nhsia.datastandards.ecds.PatientIdentityGeneralStructure target = null;
            target = (uk.nhs.nhsia.datastandards.ecds.PatientIdentityGeneralStructure)get_store().find_element_user(PATIENTIDENTITYGENERALSTRUCTURE$0, 0);
            if (target == null)
            {
                return null;
            }
            return target;
        }
    }
    
    /**
     * Sets the "PatientIdentity_General_Structure" element
     */
    public void setPatientIdentityGeneralStructure(uk.nhs.nhsia.datastandards.ecds.PatientIdentityGeneralStructure patientIdentityGeneralStructure)
    {
        generatedSetterHelperImpl(patientIdentityGeneralStructure, PATIENTIDENTITYGENERALSTRUCTURE$0, 0, org.apache.xmlbeans.impl.values.XmlObjectBase.KIND_SETTERHELPER_SINGLETON);
    }
    
    /**
     * Appends and returns a new empty "PatientIdentity_General_Structure" element
     */
    public uk.nhs.nhsia.datastandards.ecds.PatientIdentityGeneralStructure addNewPatientIdentityGeneralStructure()
    {
        synchronized (monitor())
        {
            check_orphaned();
            uk.nhs.nhsia.datastandards.ecds.PatientIdentityGeneralStructure target = null;
            target = (uk.nhs.nhsia.datastandards.ecds.PatientIdentityGeneralStructure)get_store().add_element_user(PATIENTIDENTITYGENERALSTRUCTURE$0);
            return target;
        }
    }
    
    /**
     * Gets the "PatientCharacteristics_CareActivity_Structure" element
     */
    public uk.nhs.nhsia.datastandards.ecds.PatientCharacteristicsCareActivityStructure getPatientCharacteristicsCareActivityStructure()
    {
        synchronized (monitor())
        {
            check_orphaned();
            uk.nhs.nhsia.datastandards.ecds.PatientCharacteristicsCareActivityStructure target = null;
            target = (uk.nhs.nhsia.datastandards.ecds.PatientCharacteristicsCareActivityStructure)get_store().find_element_user(PATIENTCHARACTERISTICSCAREACTIVITYSTRUCTURE$2, 0);
            if (target == null)
            {
                return null;
            }
            return target;
        }
    }
    
    /**
     * True if has "PatientCharacteristics_CareActivity_Structure" element
     */
    public boolean isSetPatientCharacteristicsCareActivityStructure()
    {
        synchronized (monitor())
        {
            check_orphaned();
            return get_store().count_elements(PATIENTCHARACTERISTICSCAREACTIVITYSTRUCTURE$2) != 0;
        }
    }
    
    /**
     * Sets the "PatientCharacteristics_CareActivity_Structure" element
     */
    public void setPatientCharacteristicsCareActivityStructure(uk.nhs.nhsia.datastandards.ecds.PatientCharacteristicsCareActivityStructure patientCharacteristicsCareActivityStructure)
    {
        generatedSetterHelperImpl(patientCharacteristicsCareActivityStructure, PATIENTCHARACTERISTICSCAREACTIVITYSTRUCTURE$2, 0, org.apache.xmlbeans.impl.values.XmlObjectBase.KIND_SETTERHELPER_SINGLETON);
    }
    
    /**
     * Appends and returns a new empty "PatientCharacteristics_CareActivity_Structure" element
     */
    public uk.nhs.nhsia.datastandards.ecds.PatientCharacteristicsCareActivityStructure addNewPatientCharacteristicsCareActivityStructure()
    {
        synchronized (monitor())
        {
            check_orphaned();
            uk.nhs.nhsia.datastandards.ecds.PatientCharacteristicsCareActivityStructure target = null;
            target = (uk.nhs.nhsia.datastandards.ecds.PatientCharacteristicsCareActivityStructure)get_store().add_element_user(PATIENTCHARACTERISTICSCAREACTIVITYSTRUCTURE$2);
            return target;
        }
    }
    
    /**
     * Unsets the "PatientCharacteristics_CareActivity_Structure" element
     */
    public void unsetPatientCharacteristicsCareActivityStructure()
    {
        synchronized (monitor())
        {
            check_orphaned();
            get_store().remove_element(PATIENTCHARACTERISTICSCAREACTIVITYSTRUCTURE$2, 0);
        }
    }
}
