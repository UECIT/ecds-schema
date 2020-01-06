/*
 * XML Type:  OriginalEALEntry_Structure
 * Namespace: http://www.nhsia.nhs.uk/DataStandards/XMLschema/CDS/ns
 * Java type: uk.nhs.nhsia.datastandards.ecds.OriginalEALEntryStructure
 *
 * Automatically generated - do not modify.
 */
package uk.nhs.nhsia.datastandards.ecds.impl;
/**
 * An XML OriginalEALEntry_Structure(@http://www.nhsia.nhs.uk/DataStandards/XMLschema/CDS/ns).
 *
 * This is a complex type.
 */
public class OriginalEALEntryStructureImpl extends org.apache.xmlbeans.impl.values.XmlComplexContentImpl implements uk.nhs.nhsia.datastandards.ecds.OriginalEALEntryStructure
{
    private static final long serialVersionUID = 1L;
    
    public OriginalEALEntryStructureImpl(org.apache.xmlbeans.SchemaType sType)
    {
        super(sType);
    }
    
    private static final javax.xml.namespace.QName ORIGINALDECIDEDTOADMITDATE$0 = 
        new javax.xml.namespace.QName("http://www.nhsia.nhs.uk/DataStandards/XMLschema/CDS/ns", "OriginalDecidedToAdmitDate");
    
    
    /**
     * Gets the "OriginalDecidedToAdmitDate" element
     */
    public java.util.Calendar getOriginalDecidedToAdmitDate()
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.SimpleValue target = null;
            target = (org.apache.xmlbeans.SimpleValue)get_store().find_element_user(ORIGINALDECIDEDTOADMITDATE$0, 0);
            if (target == null)
            {
                return null;
            }
            return target.getCalendarValue();
        }
    }
    
    /**
     * Gets (as xml) the "OriginalDecidedToAdmitDate" element
     */
    public uk.nhs.nhsia.datastandards.ecds.OriginalDecidedToAdmitDateType xgetOriginalDecidedToAdmitDate()
    {
        synchronized (monitor())
        {
            check_orphaned();
            uk.nhs.nhsia.datastandards.ecds.OriginalDecidedToAdmitDateType target = null;
            target = (uk.nhs.nhsia.datastandards.ecds.OriginalDecidedToAdmitDateType)get_store().find_element_user(ORIGINALDECIDEDTOADMITDATE$0, 0);
            return target;
        }
    }
    
    /**
     * True if has "OriginalDecidedToAdmitDate" element
     */
    public boolean isSetOriginalDecidedToAdmitDate()
    {
        synchronized (monitor())
        {
            check_orphaned();
            return get_store().count_elements(ORIGINALDECIDEDTOADMITDATE$0) != 0;
        }
    }
    
    /**
     * Sets the "OriginalDecidedToAdmitDate" element
     */
    public void setOriginalDecidedToAdmitDate(java.util.Calendar originalDecidedToAdmitDate)
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.SimpleValue target = null;
            target = (org.apache.xmlbeans.SimpleValue)get_store().find_element_user(ORIGINALDECIDEDTOADMITDATE$0, 0);
            if (target == null)
            {
                target = (org.apache.xmlbeans.SimpleValue)get_store().add_element_user(ORIGINALDECIDEDTOADMITDATE$0);
            }
            target.setCalendarValue(originalDecidedToAdmitDate);
        }
    }
    
    /**
     * Sets (as xml) the "OriginalDecidedToAdmitDate" element
     */
    public void xsetOriginalDecidedToAdmitDate(uk.nhs.nhsia.datastandards.ecds.OriginalDecidedToAdmitDateType originalDecidedToAdmitDate)
    {
        synchronized (monitor())
        {
            check_orphaned();
            uk.nhs.nhsia.datastandards.ecds.OriginalDecidedToAdmitDateType target = null;
            target = (uk.nhs.nhsia.datastandards.ecds.OriginalDecidedToAdmitDateType)get_store().find_element_user(ORIGINALDECIDEDTOADMITDATE$0, 0);
            if (target == null)
            {
                target = (uk.nhs.nhsia.datastandards.ecds.OriginalDecidedToAdmitDateType)get_store().add_element_user(ORIGINALDECIDEDTOADMITDATE$0);
            }
            target.set(originalDecidedToAdmitDate);
        }
    }
    
    /**
     * Unsets the "OriginalDecidedToAdmitDate" element
     */
    public void unsetOriginalDecidedToAdmitDate()
    {
        synchronized (monitor())
        {
            check_orphaned();
            get_store().remove_element(ORIGINALDECIDEDTOADMITDATE$0, 0);
        }
    }
}
