/*
 * XML Type:  ProfessionalsInvolved_Structure
 * Namespace: http://www.nhsia.nhs.uk/DataStandards/XMLschema/CDS/ns
 * Java type: uk.nhs.nhsia.datastandards.ecds.ProfessionalsInvolvedStructure
 *
 * Automatically generated - do not modify.
 */
package uk.nhs.nhsia.datastandards.ecds.impl;
/**
 * An XML ProfessionalsInvolved_Structure(@http://www.nhsia.nhs.uk/DataStandards/XMLschema/CDS/ns).
 *
 * This is a complex type.
 */
public class ProfessionalsInvolvedStructureImpl extends org.apache.xmlbeans.impl.values.XmlComplexContentImpl implements uk.nhs.nhsia.datastandards.ecds.ProfessionalsInvolvedStructure
{
    private static final long serialVersionUID = 1L;
    
    public ProfessionalsInvolvedStructureImpl(org.apache.xmlbeans.SchemaType sType)
    {
        super(sType);
    }
    
    private static final javax.xml.namespace.QName PROFESSIONALREGISTRATIONISSUERCODE$0 = 
        new javax.xml.namespace.QName("http://www.nhsia.nhs.uk/DataStandards/XMLschema/CDS/ns", "ProfessionalRegistrationIssuerCode");
    private static final javax.xml.namespace.QName PROFESSIONALREGISTRATIONENTRYIDENTIFIER$2 = 
        new javax.xml.namespace.QName("http://www.nhsia.nhs.uk/DataStandards/XMLschema/CDS/ns", "ProfessionalRegistrationEntryIdentifier");
    
    
    /**
     * Gets the "ProfessionalRegistrationIssuerCode" element
     */
    public uk.nhs.nhsia.datastandards.ecds.ProfessionalRegistrationIssuerCodeType.Enum getProfessionalRegistrationIssuerCode()
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.SimpleValue target = null;
            target = (org.apache.xmlbeans.SimpleValue)get_store().find_element_user(PROFESSIONALREGISTRATIONISSUERCODE$0, 0);
            if (target == null)
            {
                return null;
            }
            return (uk.nhs.nhsia.datastandards.ecds.ProfessionalRegistrationIssuerCodeType.Enum)target.getEnumValue();
        }
    }
    
    /**
     * Gets (as xml) the "ProfessionalRegistrationIssuerCode" element
     */
    public uk.nhs.nhsia.datastandards.ecds.ProfessionalRegistrationIssuerCodeType xgetProfessionalRegistrationIssuerCode()
    {
        synchronized (monitor())
        {
            check_orphaned();
            uk.nhs.nhsia.datastandards.ecds.ProfessionalRegistrationIssuerCodeType target = null;
            target = (uk.nhs.nhsia.datastandards.ecds.ProfessionalRegistrationIssuerCodeType)get_store().find_element_user(PROFESSIONALREGISTRATIONISSUERCODE$0, 0);
            return target;
        }
    }
    
    /**
     * Sets the "ProfessionalRegistrationIssuerCode" element
     */
    public void setProfessionalRegistrationIssuerCode(uk.nhs.nhsia.datastandards.ecds.ProfessionalRegistrationIssuerCodeType.Enum professionalRegistrationIssuerCode)
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.SimpleValue target = null;
            target = (org.apache.xmlbeans.SimpleValue)get_store().find_element_user(PROFESSIONALREGISTRATIONISSUERCODE$0, 0);
            if (target == null)
            {
                target = (org.apache.xmlbeans.SimpleValue)get_store().add_element_user(PROFESSIONALREGISTRATIONISSUERCODE$0);
            }
            target.setEnumValue(professionalRegistrationIssuerCode);
        }
    }
    
    /**
     * Sets (as xml) the "ProfessionalRegistrationIssuerCode" element
     */
    public void xsetProfessionalRegistrationIssuerCode(uk.nhs.nhsia.datastandards.ecds.ProfessionalRegistrationIssuerCodeType professionalRegistrationIssuerCode)
    {
        synchronized (monitor())
        {
            check_orphaned();
            uk.nhs.nhsia.datastandards.ecds.ProfessionalRegistrationIssuerCodeType target = null;
            target = (uk.nhs.nhsia.datastandards.ecds.ProfessionalRegistrationIssuerCodeType)get_store().find_element_user(PROFESSIONALREGISTRATIONISSUERCODE$0, 0);
            if (target == null)
            {
                target = (uk.nhs.nhsia.datastandards.ecds.ProfessionalRegistrationIssuerCodeType)get_store().add_element_user(PROFESSIONALREGISTRATIONISSUERCODE$0);
            }
            target.set(professionalRegistrationIssuerCode);
        }
    }
    
    /**
     * Gets the "ProfessionalRegistrationEntryIdentifier" element
     */
    public java.lang.String getProfessionalRegistrationEntryIdentifier()
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.SimpleValue target = null;
            target = (org.apache.xmlbeans.SimpleValue)get_store().find_element_user(PROFESSIONALREGISTRATIONENTRYIDENTIFIER$2, 0);
            if (target == null)
            {
                return null;
            }
            return target.getStringValue();
        }
    }
    
    /**
     * Gets (as xml) the "ProfessionalRegistrationEntryIdentifier" element
     */
    public uk.nhs.nhsia.datastandards.ecds.ProfessionalRegistrationEntryIdentifierType xgetProfessionalRegistrationEntryIdentifier()
    {
        synchronized (monitor())
        {
            check_orphaned();
            uk.nhs.nhsia.datastandards.ecds.ProfessionalRegistrationEntryIdentifierType target = null;
            target = (uk.nhs.nhsia.datastandards.ecds.ProfessionalRegistrationEntryIdentifierType)get_store().find_element_user(PROFESSIONALREGISTRATIONENTRYIDENTIFIER$2, 0);
            return target;
        }
    }
    
    /**
     * Sets the "ProfessionalRegistrationEntryIdentifier" element
     */
    public void setProfessionalRegistrationEntryIdentifier(java.lang.String professionalRegistrationEntryIdentifier)
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.SimpleValue target = null;
            target = (org.apache.xmlbeans.SimpleValue)get_store().find_element_user(PROFESSIONALREGISTRATIONENTRYIDENTIFIER$2, 0);
            if (target == null)
            {
                target = (org.apache.xmlbeans.SimpleValue)get_store().add_element_user(PROFESSIONALREGISTRATIONENTRYIDENTIFIER$2);
            }
            target.setStringValue(professionalRegistrationEntryIdentifier);
        }
    }
    
    /**
     * Sets (as xml) the "ProfessionalRegistrationEntryIdentifier" element
     */
    public void xsetProfessionalRegistrationEntryIdentifier(uk.nhs.nhsia.datastandards.ecds.ProfessionalRegistrationEntryIdentifierType professionalRegistrationEntryIdentifier)
    {
        synchronized (monitor())
        {
            check_orphaned();
            uk.nhs.nhsia.datastandards.ecds.ProfessionalRegistrationEntryIdentifierType target = null;
            target = (uk.nhs.nhsia.datastandards.ecds.ProfessionalRegistrationEntryIdentifierType)get_store().find_element_user(PROFESSIONALREGISTRATIONENTRYIDENTIFIER$2, 0);
            if (target == null)
            {
                target = (uk.nhs.nhsia.datastandards.ecds.ProfessionalRegistrationEntryIdentifierType)get_store().add_element_user(PROFESSIONALREGISTRATIONENTRYIDENTIFIER$2);
            }
            target.set(professionalRegistrationEntryIdentifier);
        }
    }
}
