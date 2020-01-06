/*
 * XML Type:  PersonGroup_Baby_Structure
 * Namespace: http://www.nhsia.nhs.uk/DataStandards/XMLschema/CDS/ns
 * Java type: uk.nhs.nhsia.datastandards.ecds.PersonGroupBabyStructure
 *
 * Automatically generated - do not modify.
 */
package uk.nhs.nhsia.datastandards.ecds.impl;
/**
 * An XML PersonGroup_Baby_Structure(@http://www.nhsia.nhs.uk/DataStandards/XMLschema/CDS/ns).
 *
 * This is a complex type.
 */
public class PersonGroupBabyStructureImpl extends org.apache.xmlbeans.impl.values.XmlComplexContentImpl implements uk.nhs.nhsia.datastandards.ecds.PersonGroupBabyStructure
{
    private static final long serialVersionUID = 1L;
    
    public PersonGroupBabyStructureImpl(org.apache.xmlbeans.SchemaType sType)
    {
        super(sType);
    }
    
    private static final javax.xml.namespace.QName PERSONIDENTITYBABYSTRUCTURE$0 = 
        new javax.xml.namespace.QName("http://www.nhsia.nhs.uk/DataStandards/XMLschema/CDS/ns", "PersonIdentity_Baby_Structure");
    private static final javax.xml.namespace.QName PERSONCHARACTERISTICSBABYSTRUCTURE$2 = 
        new javax.xml.namespace.QName("http://www.nhsia.nhs.uk/DataStandards/XMLschema/CDS/ns", "PersonCharacteristics_Baby_Structure");
    
    
    /**
     * Gets the "PersonIdentity_Baby_Structure" element
     */
    public uk.nhs.nhsia.datastandards.ecds.PersonIdentityBabyStructure getPersonIdentityBabyStructure()
    {
        synchronized (monitor())
        {
            check_orphaned();
            uk.nhs.nhsia.datastandards.ecds.PersonIdentityBabyStructure target = null;
            target = (uk.nhs.nhsia.datastandards.ecds.PersonIdentityBabyStructure)get_store().find_element_user(PERSONIDENTITYBABYSTRUCTURE$0, 0);
            if (target == null)
            {
                return null;
            }
            return target;
        }
    }
    
    /**
     * Sets the "PersonIdentity_Baby_Structure" element
     */
    public void setPersonIdentityBabyStructure(uk.nhs.nhsia.datastandards.ecds.PersonIdentityBabyStructure personIdentityBabyStructure)
    {
        generatedSetterHelperImpl(personIdentityBabyStructure, PERSONIDENTITYBABYSTRUCTURE$0, 0, org.apache.xmlbeans.impl.values.XmlObjectBase.KIND_SETTERHELPER_SINGLETON);
    }
    
    /**
     * Appends and returns a new empty "PersonIdentity_Baby_Structure" element
     */
    public uk.nhs.nhsia.datastandards.ecds.PersonIdentityBabyStructure addNewPersonIdentityBabyStructure()
    {
        synchronized (monitor())
        {
            check_orphaned();
            uk.nhs.nhsia.datastandards.ecds.PersonIdentityBabyStructure target = null;
            target = (uk.nhs.nhsia.datastandards.ecds.PersonIdentityBabyStructure)get_store().add_element_user(PERSONIDENTITYBABYSTRUCTURE$0);
            return target;
        }
    }
    
    /**
     * Gets the "PersonCharacteristics_Baby_Structure" element
     */
    public uk.nhs.nhsia.datastandards.ecds.PersonCharacteristicsBabyStructure getPersonCharacteristicsBabyStructure()
    {
        synchronized (monitor())
        {
            check_orphaned();
            uk.nhs.nhsia.datastandards.ecds.PersonCharacteristicsBabyStructure target = null;
            target = (uk.nhs.nhsia.datastandards.ecds.PersonCharacteristicsBabyStructure)get_store().find_element_user(PERSONCHARACTERISTICSBABYSTRUCTURE$2, 0);
            if (target == null)
            {
                return null;
            }
            return target;
        }
    }
    
    /**
     * True if has "PersonCharacteristics_Baby_Structure" element
     */
    public boolean isSetPersonCharacteristicsBabyStructure()
    {
        synchronized (monitor())
        {
            check_orphaned();
            return get_store().count_elements(PERSONCHARACTERISTICSBABYSTRUCTURE$2) != 0;
        }
    }
    
    /**
     * Sets the "PersonCharacteristics_Baby_Structure" element
     */
    public void setPersonCharacteristicsBabyStructure(uk.nhs.nhsia.datastandards.ecds.PersonCharacteristicsBabyStructure personCharacteristicsBabyStructure)
    {
        generatedSetterHelperImpl(personCharacteristicsBabyStructure, PERSONCHARACTERISTICSBABYSTRUCTURE$2, 0, org.apache.xmlbeans.impl.values.XmlObjectBase.KIND_SETTERHELPER_SINGLETON);
    }
    
    /**
     * Appends and returns a new empty "PersonCharacteristics_Baby_Structure" element
     */
    public uk.nhs.nhsia.datastandards.ecds.PersonCharacteristicsBabyStructure addNewPersonCharacteristicsBabyStructure()
    {
        synchronized (monitor())
        {
            check_orphaned();
            uk.nhs.nhsia.datastandards.ecds.PersonCharacteristicsBabyStructure target = null;
            target = (uk.nhs.nhsia.datastandards.ecds.PersonCharacteristicsBabyStructure)get_store().add_element_user(PERSONCHARACTERISTICSBABYSTRUCTURE$2);
            return target;
        }
    }
    
    /**
     * Unsets the "PersonCharacteristics_Baby_Structure" element
     */
    public void unsetPersonCharacteristicsBabyStructure()
    {
        synchronized (monitor())
        {
            check_orphaned();
            get_store().remove_element(PERSONCHARACTERISTICSBABYSTRUCTURE$2, 0);
        }
    }
}
