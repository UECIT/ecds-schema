/*
 * XML Type:  PersonGroup_Mother_Structure
 * Namespace: http://www.nhsia.nhs.uk/DataStandards/XMLschema/CDS/ns
 * Java type: uk.nhs.nhsia.datastandards.ecds.PersonGroupMotherStructure
 *
 * Automatically generated - do not modify.
 */
package uk.nhs.nhsia.datastandards.ecds.impl;
/**
 * An XML PersonGroup_Mother_Structure(@http://www.nhsia.nhs.uk/DataStandards/XMLschema/CDS/ns).
 *
 * This is a complex type.
 */
public class PersonGroupMotherStructureImpl extends org.apache.xmlbeans.impl.values.XmlComplexContentImpl implements uk.nhs.nhsia.datastandards.ecds.PersonGroupMotherStructure
{
    private static final long serialVersionUID = 1L;
    
    public PersonGroupMotherStructureImpl(org.apache.xmlbeans.SchemaType sType)
    {
        super(sType);
    }
    
    private static final javax.xml.namespace.QName PERSONIDENTITYMOTHERSTRUCTURE$0 = 
        new javax.xml.namespace.QName("http://www.nhsia.nhs.uk/DataStandards/XMLschema/CDS/ns", "PersonIdentity_Mother_Structure");
    private static final javax.xml.namespace.QName OVERSEASVISITORSTATUSCLASSIFICATIONATCDSACTIVITYDATEGROUP$2 = 
        new javax.xml.namespace.QName("http://www.nhsia.nhs.uk/DataStandards/XMLschema/CDS/ns", "OverseasVisitorStatusClassificationAtCDSActivityDate_Group");
    
    
    /**
     * Gets the "PersonIdentity_Mother_Structure" element
     */
    public uk.nhs.nhsia.datastandards.ecds.PersonIdentityMotherStructure getPersonIdentityMotherStructure()
    {
        synchronized (monitor())
        {
            check_orphaned();
            uk.nhs.nhsia.datastandards.ecds.PersonIdentityMotherStructure target = null;
            target = (uk.nhs.nhsia.datastandards.ecds.PersonIdentityMotherStructure)get_store().find_element_user(PERSONIDENTITYMOTHERSTRUCTURE$0, 0);
            if (target == null)
            {
                return null;
            }
            return target;
        }
    }
    
    /**
     * Sets the "PersonIdentity_Mother_Structure" element
     */
    public void setPersonIdentityMotherStructure(uk.nhs.nhsia.datastandards.ecds.PersonIdentityMotherStructure personIdentityMotherStructure)
    {
        generatedSetterHelperImpl(personIdentityMotherStructure, PERSONIDENTITYMOTHERSTRUCTURE$0, 0, org.apache.xmlbeans.impl.values.XmlObjectBase.KIND_SETTERHELPER_SINGLETON);
    }
    
    /**
     * Appends and returns a new empty "PersonIdentity_Mother_Structure" element
     */
    public uk.nhs.nhsia.datastandards.ecds.PersonIdentityMotherStructure addNewPersonIdentityMotherStructure()
    {
        synchronized (monitor())
        {
            check_orphaned();
            uk.nhs.nhsia.datastandards.ecds.PersonIdentityMotherStructure target = null;
            target = (uk.nhs.nhsia.datastandards.ecds.PersonIdentityMotherStructure)get_store().add_element_user(PERSONIDENTITYMOTHERSTRUCTURE$0);
            return target;
        }
    }
    
    /**
     * Gets the "OverseasVisitorStatusClassificationAtCDSActivityDate_Group" element
     */
    public uk.nhs.nhsia.datastandards.ecds.OverseasVisitorStatusClassificationAtCDSActivityDateGroupStructure getOverseasVisitorStatusClassificationAtCDSActivityDateGroup()
    {
        synchronized (monitor())
        {
            check_orphaned();
            uk.nhs.nhsia.datastandards.ecds.OverseasVisitorStatusClassificationAtCDSActivityDateGroupStructure target = null;
            target = (uk.nhs.nhsia.datastandards.ecds.OverseasVisitorStatusClassificationAtCDSActivityDateGroupStructure)get_store().find_element_user(OVERSEASVISITORSTATUSCLASSIFICATIONATCDSACTIVITYDATEGROUP$2, 0);
            if (target == null)
            {
                return null;
            }
            return target;
        }
    }
    
    /**
     * True if has "OverseasVisitorStatusClassificationAtCDSActivityDate_Group" element
     */
    public boolean isSetOverseasVisitorStatusClassificationAtCDSActivityDateGroup()
    {
        synchronized (monitor())
        {
            check_orphaned();
            return get_store().count_elements(OVERSEASVISITORSTATUSCLASSIFICATIONATCDSACTIVITYDATEGROUP$2) != 0;
        }
    }
    
    /**
     * Sets the "OverseasVisitorStatusClassificationAtCDSActivityDate_Group" element
     */
    public void setOverseasVisitorStatusClassificationAtCDSActivityDateGroup(uk.nhs.nhsia.datastandards.ecds.OverseasVisitorStatusClassificationAtCDSActivityDateGroupStructure overseasVisitorStatusClassificationAtCDSActivityDateGroup)
    {
        generatedSetterHelperImpl(overseasVisitorStatusClassificationAtCDSActivityDateGroup, OVERSEASVISITORSTATUSCLASSIFICATIONATCDSACTIVITYDATEGROUP$2, 0, org.apache.xmlbeans.impl.values.XmlObjectBase.KIND_SETTERHELPER_SINGLETON);
    }
    
    /**
     * Appends and returns a new empty "OverseasVisitorStatusClassificationAtCDSActivityDate_Group" element
     */
    public uk.nhs.nhsia.datastandards.ecds.OverseasVisitorStatusClassificationAtCDSActivityDateGroupStructure addNewOverseasVisitorStatusClassificationAtCDSActivityDateGroup()
    {
        synchronized (monitor())
        {
            check_orphaned();
            uk.nhs.nhsia.datastandards.ecds.OverseasVisitorStatusClassificationAtCDSActivityDateGroupStructure target = null;
            target = (uk.nhs.nhsia.datastandards.ecds.OverseasVisitorStatusClassificationAtCDSActivityDateGroupStructure)get_store().add_element_user(OVERSEASVISITORSTATUSCLASSIFICATIONATCDSACTIVITYDATEGROUP$2);
            return target;
        }
    }
    
    /**
     * Unsets the "OverseasVisitorStatusClassificationAtCDSActivityDate_Group" element
     */
    public void unsetOverseasVisitorStatusClassificationAtCDSActivityDateGroup()
    {
        synchronized (monitor())
        {
            check_orphaned();
            get_store().remove_element(OVERSEASVISITORSTATUSCLASSIFICATIONATCDSACTIVITYDATEGROUP$2, 0);
        }
    }
}
