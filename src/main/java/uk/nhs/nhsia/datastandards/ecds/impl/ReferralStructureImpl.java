/*
 * XML Type:  Referral_Structure
 * Namespace: http://www.nhsia.nhs.uk/DataStandards/XMLschema/CDS/ns
 * Java type: uk.nhs.nhsia.datastandards.ecds.ReferralStructure
 *
 * Automatically generated - do not modify.
 */
package uk.nhs.nhsia.datastandards.ecds.impl;
/**
 * An XML Referral_Structure(@http://www.nhsia.nhs.uk/DataStandards/XMLschema/CDS/ns).
 *
 * This is a complex type.
 */
public class ReferralStructureImpl extends org.apache.xmlbeans.impl.values.XmlComplexContentImpl implements uk.nhs.nhsia.datastandards.ecds.ReferralStructure
{
    private static final long serialVersionUID = 1L;
    
    public ReferralStructureImpl(org.apache.xmlbeans.SchemaType sType)
    {
        super(sType);
    }
    
    private static final javax.xml.namespace.QName DIRECTACCESSREFERRALINDICATOR$0 = 
        new javax.xml.namespace.QName("http://www.nhsia.nhs.uk/DataStandards/XMLschema/CDS/ns", "DirectAccessReferralIndicator");
    
    
    /**
     * Gets the "DirectAccessReferralIndicator" element
     */
    public uk.nhs.nhsia.datastandards.ecds.DirectAccessReferralIndicatorType.Enum getDirectAccessReferralIndicator()
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.SimpleValue target = null;
            target = (org.apache.xmlbeans.SimpleValue)get_store().find_element_user(DIRECTACCESSREFERRALINDICATOR$0, 0);
            if (target == null)
            {
                return null;
            }
            return (uk.nhs.nhsia.datastandards.ecds.DirectAccessReferralIndicatorType.Enum)target.getEnumValue();
        }
    }
    
    /**
     * Gets (as xml) the "DirectAccessReferralIndicator" element
     */
    public uk.nhs.nhsia.datastandards.ecds.DirectAccessReferralIndicatorType xgetDirectAccessReferralIndicator()
    {
        synchronized (monitor())
        {
            check_orphaned();
            uk.nhs.nhsia.datastandards.ecds.DirectAccessReferralIndicatorType target = null;
            target = (uk.nhs.nhsia.datastandards.ecds.DirectAccessReferralIndicatorType)get_store().find_element_user(DIRECTACCESSREFERRALINDICATOR$0, 0);
            return target;
        }
    }
    
    /**
     * True if has "DirectAccessReferralIndicator" element
     */
    public boolean isSetDirectAccessReferralIndicator()
    {
        synchronized (monitor())
        {
            check_orphaned();
            return get_store().count_elements(DIRECTACCESSREFERRALINDICATOR$0) != 0;
        }
    }
    
    /**
     * Sets the "DirectAccessReferralIndicator" element
     */
    public void setDirectAccessReferralIndicator(uk.nhs.nhsia.datastandards.ecds.DirectAccessReferralIndicatorType.Enum directAccessReferralIndicator)
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.SimpleValue target = null;
            target = (org.apache.xmlbeans.SimpleValue)get_store().find_element_user(DIRECTACCESSREFERRALINDICATOR$0, 0);
            if (target == null)
            {
                target = (org.apache.xmlbeans.SimpleValue)get_store().add_element_user(DIRECTACCESSREFERRALINDICATOR$0);
            }
            target.setEnumValue(directAccessReferralIndicator);
        }
    }
    
    /**
     * Sets (as xml) the "DirectAccessReferralIndicator" element
     */
    public void xsetDirectAccessReferralIndicator(uk.nhs.nhsia.datastandards.ecds.DirectAccessReferralIndicatorType directAccessReferralIndicator)
    {
        synchronized (monitor())
        {
            check_orphaned();
            uk.nhs.nhsia.datastandards.ecds.DirectAccessReferralIndicatorType target = null;
            target = (uk.nhs.nhsia.datastandards.ecds.DirectAccessReferralIndicatorType)get_store().find_element_user(DIRECTACCESSREFERRALINDICATOR$0, 0);
            if (target == null)
            {
                target = (uk.nhs.nhsia.datastandards.ecds.DirectAccessReferralIndicatorType)get_store().add_element_user(DIRECTACCESSREFERRALINDICATOR$0);
            }
            target.set(directAccessReferralIndicator);
        }
    }
    
    /**
     * Unsets the "DirectAccessReferralIndicator" element
     */
    public void unsetDirectAccessReferralIndicator()
    {
        synchronized (monitor())
        {
            check_orphaned();
            get_store().remove_element(DIRECTACCESSREFERRALINDICATOR$0, 0);
        }
    }
}
