/*
 * XML Type:  PersonGroupPatient_Delivery_Structure
 * Namespace: http://www.nhsia.nhs.uk/DataStandards/XMLschema/CDS/ns
 * Java type: uk.nhs.nhsia.datastandards.ecds.PersonGroupPatientDeliveryStructure
 *
 * Automatically generated - do not modify.
 */
package uk.nhs.nhsia.datastandards.ecds.impl;
/**
 * An XML PersonGroupPatient_Delivery_Structure(@http://www.nhsia.nhs.uk/DataStandards/XMLschema/CDS/ns).
 *
 * This is a complex type.
 */
public class PersonGroupPatientDeliveryStructureImpl extends org.apache.xmlbeans.impl.values.XmlComplexContentImpl implements uk.nhs.nhsia.datastandards.ecds.PersonGroupPatientDeliveryStructure
{
    private static final long serialVersionUID = 1L;
    
    public PersonGroupPatientDeliveryStructureImpl(org.apache.xmlbeans.SchemaType sType)
    {
        super(sType);
    }
    
    private static final javax.xml.namespace.QName PATIENTIDENTITYDELIVERYSTRUCTURE$0 = 
        new javax.xml.namespace.QName("http://www.nhsia.nhs.uk/DataStandards/XMLschema/CDS/ns", "PatientIdentity_Delivery_Structure");
    private static final javax.xml.namespace.QName PATIENTCHARACTERISTICSGENERALSTRUCTURE$2 = 
        new javax.xml.namespace.QName("http://www.nhsia.nhs.uk/DataStandards/XMLschema/CDS/ns", "PatientCharacteristics_General_Structure");
    private static final javax.xml.namespace.QName PATIENTCHARACTERISTICSDELIVERYSTRUCTURE$4 = 
        new javax.xml.namespace.QName("http://www.nhsia.nhs.uk/DataStandards/XMLschema/CDS/ns", "PatientCharacteristics_Delivery_Structure");
    
    
    /**
     * Gets the "PatientIdentity_Delivery_Structure" element
     */
    public uk.nhs.nhsia.datastandards.ecds.PatientIdentityDeliveryStructure getPatientIdentityDeliveryStructure()
    {
        synchronized (monitor())
        {
            check_orphaned();
            uk.nhs.nhsia.datastandards.ecds.PatientIdentityDeliveryStructure target = null;
            target = (uk.nhs.nhsia.datastandards.ecds.PatientIdentityDeliveryStructure)get_store().find_element_user(PATIENTIDENTITYDELIVERYSTRUCTURE$0, 0);
            if (target == null)
            {
                return null;
            }
            return target;
        }
    }
    
    /**
     * Sets the "PatientIdentity_Delivery_Structure" element
     */
    public void setPatientIdentityDeliveryStructure(uk.nhs.nhsia.datastandards.ecds.PatientIdentityDeliveryStructure patientIdentityDeliveryStructure)
    {
        generatedSetterHelperImpl(patientIdentityDeliveryStructure, PATIENTIDENTITYDELIVERYSTRUCTURE$0, 0, org.apache.xmlbeans.impl.values.XmlObjectBase.KIND_SETTERHELPER_SINGLETON);
    }
    
    /**
     * Appends and returns a new empty "PatientIdentity_Delivery_Structure" element
     */
    public uk.nhs.nhsia.datastandards.ecds.PatientIdentityDeliveryStructure addNewPatientIdentityDeliveryStructure()
    {
        synchronized (monitor())
        {
            check_orphaned();
            uk.nhs.nhsia.datastandards.ecds.PatientIdentityDeliveryStructure target = null;
            target = (uk.nhs.nhsia.datastandards.ecds.PatientIdentityDeliveryStructure)get_store().add_element_user(PATIENTIDENTITYDELIVERYSTRUCTURE$0);
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
     * Gets the "PatientCharacteristics_Delivery_Structure" element
     */
    public uk.nhs.nhsia.datastandards.ecds.PatientCharacteristicsDeliveryStructure getPatientCharacteristicsDeliveryStructure()
    {
        synchronized (monitor())
        {
            check_orphaned();
            uk.nhs.nhsia.datastandards.ecds.PatientCharacteristicsDeliveryStructure target = null;
            target = (uk.nhs.nhsia.datastandards.ecds.PatientCharacteristicsDeliveryStructure)get_store().find_element_user(PATIENTCHARACTERISTICSDELIVERYSTRUCTURE$4, 0);
            if (target == null)
            {
                return null;
            }
            return target;
        }
    }
    
    /**
     * True if has "PatientCharacteristics_Delivery_Structure" element
     */
    public boolean isSetPatientCharacteristicsDeliveryStructure()
    {
        synchronized (monitor())
        {
            check_orphaned();
            return get_store().count_elements(PATIENTCHARACTERISTICSDELIVERYSTRUCTURE$4) != 0;
        }
    }
    
    /**
     * Sets the "PatientCharacteristics_Delivery_Structure" element
     */
    public void setPatientCharacteristicsDeliveryStructure(uk.nhs.nhsia.datastandards.ecds.PatientCharacteristicsDeliveryStructure patientCharacteristicsDeliveryStructure)
    {
        generatedSetterHelperImpl(patientCharacteristicsDeliveryStructure, PATIENTCHARACTERISTICSDELIVERYSTRUCTURE$4, 0, org.apache.xmlbeans.impl.values.XmlObjectBase.KIND_SETTERHELPER_SINGLETON);
    }
    
    /**
     * Appends and returns a new empty "PatientCharacteristics_Delivery_Structure" element
     */
    public uk.nhs.nhsia.datastandards.ecds.PatientCharacteristicsDeliveryStructure addNewPatientCharacteristicsDeliveryStructure()
    {
        synchronized (monitor())
        {
            check_orphaned();
            uk.nhs.nhsia.datastandards.ecds.PatientCharacteristicsDeliveryStructure target = null;
            target = (uk.nhs.nhsia.datastandards.ecds.PatientCharacteristicsDeliveryStructure)get_store().add_element_user(PATIENTCHARACTERISTICSDELIVERYSTRUCTURE$4);
            return target;
        }
    }
    
    /**
     * Unsets the "PatientCharacteristics_Delivery_Structure" element
     */
    public void unsetPatientCharacteristicsDeliveryStructure()
    {
        synchronized (monitor())
        {
            check_orphaned();
            get_store().remove_element(PATIENTCHARACTERISTICSDELIVERYSTRUCTURE$4, 0);
        }
    }
}
