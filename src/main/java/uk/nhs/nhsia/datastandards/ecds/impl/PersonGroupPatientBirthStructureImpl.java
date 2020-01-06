/*
 * XML Type:  PersonGroupPatient_Birth_Structure
 * Namespace: http://www.nhsia.nhs.uk/DataStandards/XMLschema/CDS/ns
 * Java type: uk.nhs.nhsia.datastandards.ecds.PersonGroupPatientBirthStructure
 *
 * Automatically generated - do not modify.
 */
package uk.nhs.nhsia.datastandards.ecds.impl;
/**
 * An XML PersonGroupPatient_Birth_Structure(@http://www.nhsia.nhs.uk/DataStandards/XMLschema/CDS/ns).
 *
 * This is a complex type.
 */
public class PersonGroupPatientBirthStructureImpl extends org.apache.xmlbeans.impl.values.XmlComplexContentImpl implements uk.nhs.nhsia.datastandards.ecds.PersonGroupPatientBirthStructure
{
    private static final long serialVersionUID = 1L;
    
    public PersonGroupPatientBirthStructureImpl(org.apache.xmlbeans.SchemaType sType)
    {
        super(sType);
    }
    
    private static final javax.xml.namespace.QName PATIENTIDENTITYBIRTHSTRUCTURE$0 = 
        new javax.xml.namespace.QName("http://www.nhsia.nhs.uk/DataStandards/XMLschema/CDS/ns", "PatientIdentity_Birth_Structure");
    private static final javax.xml.namespace.QName PATIENTCHARACTERISTICSBIRTHSTRUCTURE$2 = 
        new javax.xml.namespace.QName("http://www.nhsia.nhs.uk/DataStandards/XMLschema/CDS/ns", "PatientCharacteristics_Birth_Structure");
    
    
    /**
     * Gets the "PatientIdentity_Birth_Structure" element
     */
    public uk.nhs.nhsia.datastandards.ecds.PatientIdentityBirthStructure getPatientIdentityBirthStructure()
    {
        synchronized (monitor())
        {
            check_orphaned();
            uk.nhs.nhsia.datastandards.ecds.PatientIdentityBirthStructure target = null;
            target = (uk.nhs.nhsia.datastandards.ecds.PatientIdentityBirthStructure)get_store().find_element_user(PATIENTIDENTITYBIRTHSTRUCTURE$0, 0);
            if (target == null)
            {
                return null;
            }
            return target;
        }
    }
    
    /**
     * Sets the "PatientIdentity_Birth_Structure" element
     */
    public void setPatientIdentityBirthStructure(uk.nhs.nhsia.datastandards.ecds.PatientIdentityBirthStructure patientIdentityBirthStructure)
    {
        generatedSetterHelperImpl(patientIdentityBirthStructure, PATIENTIDENTITYBIRTHSTRUCTURE$0, 0, org.apache.xmlbeans.impl.values.XmlObjectBase.KIND_SETTERHELPER_SINGLETON);
    }
    
    /**
     * Appends and returns a new empty "PatientIdentity_Birth_Structure" element
     */
    public uk.nhs.nhsia.datastandards.ecds.PatientIdentityBirthStructure addNewPatientIdentityBirthStructure()
    {
        synchronized (monitor())
        {
            check_orphaned();
            uk.nhs.nhsia.datastandards.ecds.PatientIdentityBirthStructure target = null;
            target = (uk.nhs.nhsia.datastandards.ecds.PatientIdentityBirthStructure)get_store().add_element_user(PATIENTIDENTITYBIRTHSTRUCTURE$0);
            return target;
        }
    }
    
    /**
     * Gets the "PatientCharacteristics_Birth_Structure" element
     */
    public uk.nhs.nhsia.datastandards.ecds.PatientCharacteristicsBirthStructure getPatientCharacteristicsBirthStructure()
    {
        synchronized (monitor())
        {
            check_orphaned();
            uk.nhs.nhsia.datastandards.ecds.PatientCharacteristicsBirthStructure target = null;
            target = (uk.nhs.nhsia.datastandards.ecds.PatientCharacteristicsBirthStructure)get_store().find_element_user(PATIENTCHARACTERISTICSBIRTHSTRUCTURE$2, 0);
            if (target == null)
            {
                return null;
            }
            return target;
        }
    }
    
    /**
     * True if has "PatientCharacteristics_Birth_Structure" element
     */
    public boolean isSetPatientCharacteristicsBirthStructure()
    {
        synchronized (monitor())
        {
            check_orphaned();
            return get_store().count_elements(PATIENTCHARACTERISTICSBIRTHSTRUCTURE$2) != 0;
        }
    }
    
    /**
     * Sets the "PatientCharacteristics_Birth_Structure" element
     */
    public void setPatientCharacteristicsBirthStructure(uk.nhs.nhsia.datastandards.ecds.PatientCharacteristicsBirthStructure patientCharacteristicsBirthStructure)
    {
        generatedSetterHelperImpl(patientCharacteristicsBirthStructure, PATIENTCHARACTERISTICSBIRTHSTRUCTURE$2, 0, org.apache.xmlbeans.impl.values.XmlObjectBase.KIND_SETTERHELPER_SINGLETON);
    }
    
    /**
     * Appends and returns a new empty "PatientCharacteristics_Birth_Structure" element
     */
    public uk.nhs.nhsia.datastandards.ecds.PatientCharacteristicsBirthStructure addNewPatientCharacteristicsBirthStructure()
    {
        synchronized (monitor())
        {
            check_orphaned();
            uk.nhs.nhsia.datastandards.ecds.PatientCharacteristicsBirthStructure target = null;
            target = (uk.nhs.nhsia.datastandards.ecds.PatientCharacteristicsBirthStructure)get_store().add_element_user(PATIENTCHARACTERISTICSBIRTHSTRUCTURE$2);
            return target;
        }
    }
    
    /**
     * Unsets the "PatientCharacteristics_Birth_Structure" element
     */
    public void unsetPatientCharacteristicsBirthStructure()
    {
        synchronized (monitor())
        {
            check_orphaned();
            get_store().remove_element(PATIENTCHARACTERISTICSBIRTHSTRUCTURE$2, 0);
        }
    }
}
