/*
 * XML Type:  PersonGroupPatient_Psychiatric_Structure
 * Namespace: http://www.nhsia.nhs.uk/DataStandards/XMLschema/CDS/ns
 * Java type: uk.nhs.nhsia.datastandards.ecds.PersonGroupPatientPsychiatricStructure
 *
 * Automatically generated - do not modify.
 */
package uk.nhs.nhsia.datastandards.ecds.impl;
/**
 * An XML PersonGroupPatient_Psychiatric_Structure(@http://www.nhsia.nhs.uk/DataStandards/XMLschema/CDS/ns).
 *
 * This is a complex type.
 */
public class PersonGroupPatientPsychiatricStructureImpl extends org.apache.xmlbeans.impl.values.XmlComplexContentImpl implements uk.nhs.nhsia.datastandards.ecds.PersonGroupPatientPsychiatricStructure
{
    private static final long serialVersionUID = 1L;
    
    public PersonGroupPatientPsychiatricStructureImpl(org.apache.xmlbeans.SchemaType sType)
    {
        super(sType);
    }
    
    private static final javax.xml.namespace.QName PATIENTIDENTITYGENERALSTRUCTURE$0 = 
        new javax.xml.namespace.QName("http://www.nhsia.nhs.uk/DataStandards/XMLschema/CDS/ns", "PatientIdentity_General_Structure");
    private static final javax.xml.namespace.QName PATIENTCHARACTERISTICSGENERALSTRUCTURE$2 = 
        new javax.xml.namespace.QName("http://www.nhsia.nhs.uk/DataStandards/XMLschema/CDS/ns", "PatientCharacteristics_General_Structure");
    private static final javax.xml.namespace.QName PATIENTCHARACTERISTICSPSYCHIATRICSTRUCTURE$4 = 
        new javax.xml.namespace.QName("http://www.nhsia.nhs.uk/DataStandards/XMLschema/CDS/ns", "PatientCharacteristics_Psychiatric_Structure");
    
    
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
     * Gets the "PatientCharacteristics_General_Structure" element
     */
    public uk.nhs.nhsia.datastandards.ecds.PatientCharacteristicsGeneralStructure getPatientCharacteristicsGeneralStructure()
    {
        synchronized (monitor())
        {
            check_orphaned();
            uk.nhs.nhsia.datastandards.ecds.PatientCharacteristicsGeneralStructure target = null;
            target = (uk.nhs.nhsia.datastandards.ecds.PatientCharacteristicsGeneralStructure)get_store().find_element_user(PATIENTCHARACTERISTICSGENERALSTRUCTURE$2, 0);
            if (target == null)
            {
                return null;
            }
            return target;
        }
    }
    
    /**
     * True if has "PatientCharacteristics_General_Structure" element
     */
    public boolean isSetPatientCharacteristicsGeneralStructure()
    {
        synchronized (monitor())
        {
            check_orphaned();
            return get_store().count_elements(PATIENTCHARACTERISTICSGENERALSTRUCTURE$2) != 0;
        }
    }
    
    /**
     * Sets the "PatientCharacteristics_General_Structure" element
     */
    public void setPatientCharacteristicsGeneralStructure(uk.nhs.nhsia.datastandards.ecds.PatientCharacteristicsGeneralStructure patientCharacteristicsGeneralStructure)
    {
        generatedSetterHelperImpl(patientCharacteristicsGeneralStructure, PATIENTCHARACTERISTICSGENERALSTRUCTURE$2, 0, org.apache.xmlbeans.impl.values.XmlObjectBase.KIND_SETTERHELPER_SINGLETON);
    }
    
    /**
     * Appends and returns a new empty "PatientCharacteristics_General_Structure" element
     */
    public uk.nhs.nhsia.datastandards.ecds.PatientCharacteristicsGeneralStructure addNewPatientCharacteristicsGeneralStructure()
    {
        synchronized (monitor())
        {
            check_orphaned();
            uk.nhs.nhsia.datastandards.ecds.PatientCharacteristicsGeneralStructure target = null;
            target = (uk.nhs.nhsia.datastandards.ecds.PatientCharacteristicsGeneralStructure)get_store().add_element_user(PATIENTCHARACTERISTICSGENERALSTRUCTURE$2);
            return target;
        }
    }
    
    /**
     * Unsets the "PatientCharacteristics_General_Structure" element
     */
    public void unsetPatientCharacteristicsGeneralStructure()
    {
        synchronized (monitor())
        {
            check_orphaned();
            get_store().remove_element(PATIENTCHARACTERISTICSGENERALSTRUCTURE$2, 0);
        }
    }
    
    /**
     * Gets the "PatientCharacteristics_Psychiatric_Structure" element
     */
    public uk.nhs.nhsia.datastandards.ecds.PatientCharacteristicsPsychiatricStructure getPatientCharacteristicsPsychiatricStructure()
    {
        synchronized (monitor())
        {
            check_orphaned();
            uk.nhs.nhsia.datastandards.ecds.PatientCharacteristicsPsychiatricStructure target = null;
            target = (uk.nhs.nhsia.datastandards.ecds.PatientCharacteristicsPsychiatricStructure)get_store().find_element_user(PATIENTCHARACTERISTICSPSYCHIATRICSTRUCTURE$4, 0);
            if (target == null)
            {
                return null;
            }
            return target;
        }
    }
    
    /**
     * True if has "PatientCharacteristics_Psychiatric_Structure" element
     */
    public boolean isSetPatientCharacteristicsPsychiatricStructure()
    {
        synchronized (monitor())
        {
            check_orphaned();
            return get_store().count_elements(PATIENTCHARACTERISTICSPSYCHIATRICSTRUCTURE$4) != 0;
        }
    }
    
    /**
     * Sets the "PatientCharacteristics_Psychiatric_Structure" element
     */
    public void setPatientCharacteristicsPsychiatricStructure(uk.nhs.nhsia.datastandards.ecds.PatientCharacteristicsPsychiatricStructure patientCharacteristicsPsychiatricStructure)
    {
        generatedSetterHelperImpl(patientCharacteristicsPsychiatricStructure, PATIENTCHARACTERISTICSPSYCHIATRICSTRUCTURE$4, 0, org.apache.xmlbeans.impl.values.XmlObjectBase.KIND_SETTERHELPER_SINGLETON);
    }
    
    /**
     * Appends and returns a new empty "PatientCharacteristics_Psychiatric_Structure" element
     */
    public uk.nhs.nhsia.datastandards.ecds.PatientCharacteristicsPsychiatricStructure addNewPatientCharacteristicsPsychiatricStructure()
    {
        synchronized (monitor())
        {
            check_orphaned();
            uk.nhs.nhsia.datastandards.ecds.PatientCharacteristicsPsychiatricStructure target = null;
            target = (uk.nhs.nhsia.datastandards.ecds.PatientCharacteristicsPsychiatricStructure)get_store().add_element_user(PATIENTCHARACTERISTICSPSYCHIATRICSTRUCTURE$4);
            return target;
        }
    }
    
    /**
     * Unsets the "PatientCharacteristics_Psychiatric_Structure" element
     */
    public void unsetPatientCharacteristicsPsychiatricStructure()
    {
        synchronized (monitor())
        {
            check_orphaned();
            get_store().remove_element(PATIENTCHARACTERISTICSPSYCHIATRICSTRUCTURE$4, 0);
        }
    }
}
