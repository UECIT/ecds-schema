/*
 * XML Type:  PersonGroupAAndEConsultant_Structure
 * Namespace: http://www.nhsia.nhs.uk/DataStandards/XMLschema/CDS/ns
 * Java type: uk.nhs.nhsia.datastandards.ecds.PersonGroupAAndEConsultantStructure
 *
 * Automatically generated - do not modify.
 */
package uk.nhs.nhsia.datastandards.ecds.impl;
/**
 * An XML PersonGroupAAndEConsultant_Structure(@http://www.nhsia.nhs.uk/DataStandards/XMLschema/CDS/ns).
 *
 * This is a complex type.
 */
public class PersonGroupAAndEConsultantStructureImpl extends org.apache.xmlbeans.impl.values.XmlComplexContentImpl implements uk.nhs.nhsia.datastandards.ecds.PersonGroupAAndEConsultantStructure
{
    private static final long serialVersionUID = 1L;
    
    public PersonGroupAAndEConsultantStructureImpl(org.apache.xmlbeans.SchemaType sType)
    {
        super(sType);
    }
    
    private static final javax.xml.namespace.QName AANDESTAFFMEMBERCODE$0 = 
        new javax.xml.namespace.QName("http://www.nhsia.nhs.uk/DataStandards/XMLschema/CDS/ns", "AAndEStaffMemberCode");
    
    
    /**
     * Gets the "AAndEStaffMemberCode" element
     */
    public java.lang.String getAAndEStaffMemberCode()
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.SimpleValue target = null;
            target = (org.apache.xmlbeans.SimpleValue)get_store().find_element_user(AANDESTAFFMEMBERCODE$0, 0);
            if (target == null)
            {
                return null;
            }
            return target.getStringValue();
        }
    }
    
    /**
     * Gets (as xml) the "AAndEStaffMemberCode" element
     */
    public uk.nhs.nhsia.datastandards.ecds.AAndEStaffMemberCodeType xgetAAndEStaffMemberCode()
    {
        synchronized (monitor())
        {
            check_orphaned();
            uk.nhs.nhsia.datastandards.ecds.AAndEStaffMemberCodeType target = null;
            target = (uk.nhs.nhsia.datastandards.ecds.AAndEStaffMemberCodeType)get_store().find_element_user(AANDESTAFFMEMBERCODE$0, 0);
            return target;
        }
    }
    
    /**
     * True if has "AAndEStaffMemberCode" element
     */
    public boolean isSetAAndEStaffMemberCode()
    {
        synchronized (monitor())
        {
            check_orphaned();
            return get_store().count_elements(AANDESTAFFMEMBERCODE$0) != 0;
        }
    }
    
    /**
     * Sets the "AAndEStaffMemberCode" element
     */
    public void setAAndEStaffMemberCode(java.lang.String aAndEStaffMemberCode)
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.SimpleValue target = null;
            target = (org.apache.xmlbeans.SimpleValue)get_store().find_element_user(AANDESTAFFMEMBERCODE$0, 0);
            if (target == null)
            {
                target = (org.apache.xmlbeans.SimpleValue)get_store().add_element_user(AANDESTAFFMEMBERCODE$0);
            }
            target.setStringValue(aAndEStaffMemberCode);
        }
    }
    
    /**
     * Sets (as xml) the "AAndEStaffMemberCode" element
     */
    public void xsetAAndEStaffMemberCode(uk.nhs.nhsia.datastandards.ecds.AAndEStaffMemberCodeType aAndEStaffMemberCode)
    {
        synchronized (monitor())
        {
            check_orphaned();
            uk.nhs.nhsia.datastandards.ecds.AAndEStaffMemberCodeType target = null;
            target = (uk.nhs.nhsia.datastandards.ecds.AAndEStaffMemberCodeType)get_store().find_element_user(AANDESTAFFMEMBERCODE$0, 0);
            if (target == null)
            {
                target = (uk.nhs.nhsia.datastandards.ecds.AAndEStaffMemberCodeType)get_store().add_element_user(AANDESTAFFMEMBERCODE$0);
            }
            target.set(aAndEStaffMemberCode);
        }
    }
    
    /**
     * Unsets the "AAndEStaffMemberCode" element
     */
    public void unsetAAndEStaffMemberCode()
    {
        synchronized (monitor())
        {
            check_orphaned();
            get_store().remove_element(AANDESTAFFMEMBERCODE$0, 0);
        }
    }
}
