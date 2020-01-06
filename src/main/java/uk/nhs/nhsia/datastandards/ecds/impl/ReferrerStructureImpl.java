/*
 * XML Type:  Referrer_Structure
 * Namespace: http://www.nhsia.nhs.uk/DataStandards/XMLschema/CDS/ns
 * Java type: uk.nhs.nhsia.datastandards.ecds.ReferrerStructure
 *
 * Automatically generated - do not modify.
 */
package uk.nhs.nhsia.datastandards.ecds.impl;
/**
 * An XML Referrer_Structure(@http://www.nhsia.nhs.uk/DataStandards/XMLschema/CDS/ns).
 *
 * This is a complex type.
 */
public class ReferrerStructureImpl extends org.apache.xmlbeans.impl.values.XmlComplexContentImpl implements uk.nhs.nhsia.datastandards.ecds.ReferrerStructure
{
    private static final long serialVersionUID = 1L;
    
    public ReferrerStructureImpl(org.apache.xmlbeans.SchemaType sType)
    {
        super(sType);
    }
    
    private static final javax.xml.namespace.QName REFERRERCODE$0 = 
        new javax.xml.namespace.QName("http://www.nhsia.nhs.uk/DataStandards/XMLschema/CDS/ns", "ReferrerCode");
    private static final javax.xml.namespace.QName REFERRINGORGANISATIONCODE$2 = 
        new javax.xml.namespace.QName("http://www.nhsia.nhs.uk/DataStandards/XMLschema/CDS/ns", "ReferringOrganisationCode");
    
    
    /**
     * Gets the "ReferrerCode" element
     */
    public java.lang.String getReferrerCode()
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.SimpleValue target = null;
            target = (org.apache.xmlbeans.SimpleValue)get_store().find_element_user(REFERRERCODE$0, 0);
            if (target == null)
            {
                return null;
            }
            return target.getStringValue();
        }
    }
    
    /**
     * Gets (as xml) the "ReferrerCode" element
     */
    public uk.nhs.nhsia.datastandards.ecds.ReferrerCodeType xgetReferrerCode()
    {
        synchronized (monitor())
        {
            check_orphaned();
            uk.nhs.nhsia.datastandards.ecds.ReferrerCodeType target = null;
            target = (uk.nhs.nhsia.datastandards.ecds.ReferrerCodeType)get_store().find_element_user(REFERRERCODE$0, 0);
            return target;
        }
    }
    
    /**
     * True if has "ReferrerCode" element
     */
    public boolean isSetReferrerCode()
    {
        synchronized (monitor())
        {
            check_orphaned();
            return get_store().count_elements(REFERRERCODE$0) != 0;
        }
    }
    
    /**
     * Sets the "ReferrerCode" element
     */
    public void setReferrerCode(java.lang.String referrerCode)
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.SimpleValue target = null;
            target = (org.apache.xmlbeans.SimpleValue)get_store().find_element_user(REFERRERCODE$0, 0);
            if (target == null)
            {
                target = (org.apache.xmlbeans.SimpleValue)get_store().add_element_user(REFERRERCODE$0);
            }
            target.setStringValue(referrerCode);
        }
    }
    
    /**
     * Sets (as xml) the "ReferrerCode" element
     */
    public void xsetReferrerCode(uk.nhs.nhsia.datastandards.ecds.ReferrerCodeType referrerCode)
    {
        synchronized (monitor())
        {
            check_orphaned();
            uk.nhs.nhsia.datastandards.ecds.ReferrerCodeType target = null;
            target = (uk.nhs.nhsia.datastandards.ecds.ReferrerCodeType)get_store().find_element_user(REFERRERCODE$0, 0);
            if (target == null)
            {
                target = (uk.nhs.nhsia.datastandards.ecds.ReferrerCodeType)get_store().add_element_user(REFERRERCODE$0);
            }
            target.set(referrerCode);
        }
    }
    
    /**
     * Unsets the "ReferrerCode" element
     */
    public void unsetReferrerCode()
    {
        synchronized (monitor())
        {
            check_orphaned();
            get_store().remove_element(REFERRERCODE$0, 0);
        }
    }
    
    /**
     * Gets the "ReferringOrganisationCode" element
     */
    public java.lang.String getReferringOrganisationCode()
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.SimpleValue target = null;
            target = (org.apache.xmlbeans.SimpleValue)get_store().find_element_user(REFERRINGORGANISATIONCODE$2, 0);
            if (target == null)
            {
                return null;
            }
            return target.getStringValue();
        }
    }
    
    /**
     * Gets (as xml) the "ReferringOrganisationCode" element
     */
    public uk.nhs.nhsia.datastandards.ecds.ReferringOrganisationCodeType xgetReferringOrganisationCode()
    {
        synchronized (monitor())
        {
            check_orphaned();
            uk.nhs.nhsia.datastandards.ecds.ReferringOrganisationCodeType target = null;
            target = (uk.nhs.nhsia.datastandards.ecds.ReferringOrganisationCodeType)get_store().find_element_user(REFERRINGORGANISATIONCODE$2, 0);
            return target;
        }
    }
    
    /**
     * True if has "ReferringOrganisationCode" element
     */
    public boolean isSetReferringOrganisationCode()
    {
        synchronized (monitor())
        {
            check_orphaned();
            return get_store().count_elements(REFERRINGORGANISATIONCODE$2) != 0;
        }
    }
    
    /**
     * Sets the "ReferringOrganisationCode" element
     */
    public void setReferringOrganisationCode(java.lang.String referringOrganisationCode)
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.SimpleValue target = null;
            target = (org.apache.xmlbeans.SimpleValue)get_store().find_element_user(REFERRINGORGANISATIONCODE$2, 0);
            if (target == null)
            {
                target = (org.apache.xmlbeans.SimpleValue)get_store().add_element_user(REFERRINGORGANISATIONCODE$2);
            }
            target.setStringValue(referringOrganisationCode);
        }
    }
    
    /**
     * Sets (as xml) the "ReferringOrganisationCode" element
     */
    public void xsetReferringOrganisationCode(uk.nhs.nhsia.datastandards.ecds.ReferringOrganisationCodeType referringOrganisationCode)
    {
        synchronized (monitor())
        {
            check_orphaned();
            uk.nhs.nhsia.datastandards.ecds.ReferringOrganisationCodeType target = null;
            target = (uk.nhs.nhsia.datastandards.ecds.ReferringOrganisationCodeType)get_store().find_element_user(REFERRINGORGANISATIONCODE$2, 0);
            if (target == null)
            {
                target = (uk.nhs.nhsia.datastandards.ecds.ReferringOrganisationCodeType)get_store().add_element_user(REFERRINGORGANISATIONCODE$2);
            }
            target.set(referringOrganisationCode);
        }
    }
    
    /**
     * Unsets the "ReferringOrganisationCode" element
     */
    public void unsetReferringOrganisationCode()
    {
        synchronized (monitor())
        {
            check_orphaned();
            get_store().remove_element(REFERRINGORGANISATIONCODE$2, 0);
        }
    }
}
