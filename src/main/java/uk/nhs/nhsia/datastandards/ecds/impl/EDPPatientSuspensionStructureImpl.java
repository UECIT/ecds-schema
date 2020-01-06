/*
 * XML Type:  EDPPatientSuspension_Structure
 * Namespace: http://www.nhsia.nhs.uk/DataStandards/XMLschema/CDS/ns
 * Java type: uk.nhs.nhsia.datastandards.ecds.EDPPatientSuspensionStructure
 *
 * Automatically generated - do not modify.
 */
package uk.nhs.nhsia.datastandards.ecds.impl;
/**
 * An XML EDPPatientSuspension_Structure(@http://www.nhsia.nhs.uk/DataStandards/XMLschema/CDS/ns).
 *
 * This is a complex type.
 */
public class EDPPatientSuspensionStructureImpl extends org.apache.xmlbeans.impl.values.XmlComplexContentImpl implements uk.nhs.nhsia.datastandards.ecds.EDPPatientSuspensionStructure
{
    private static final long serialVersionUID = 1L;
    
    public EDPPatientSuspensionStructureImpl(org.apache.xmlbeans.SchemaType sType)
    {
        super(sType);
    }
    
    private static final javax.xml.namespace.QName SUSPENSIONSTARTDATE$0 = 
        new javax.xml.namespace.QName("http://www.nhsia.nhs.uk/DataStandards/XMLschema/CDS/ns", "SuspensionStartDate");
    private static final javax.xml.namespace.QName SUSPENSIONENDDATE$2 = 
        new javax.xml.namespace.QName("http://www.nhsia.nhs.uk/DataStandards/XMLschema/CDS/ns", "SuspensionEndDate");
    
    
    /**
     * Gets the "SuspensionStartDate" element
     */
    public java.util.Calendar getSuspensionStartDate()
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.SimpleValue target = null;
            target = (org.apache.xmlbeans.SimpleValue)get_store().find_element_user(SUSPENSIONSTARTDATE$0, 0);
            if (target == null)
            {
                return null;
            }
            return target.getCalendarValue();
        }
    }
    
    /**
     * Gets (as xml) the "SuspensionStartDate" element
     */
    public uk.nhs.nhsia.datastandards.ecds.SuspensionStartDateType xgetSuspensionStartDate()
    {
        synchronized (monitor())
        {
            check_orphaned();
            uk.nhs.nhsia.datastandards.ecds.SuspensionStartDateType target = null;
            target = (uk.nhs.nhsia.datastandards.ecds.SuspensionStartDateType)get_store().find_element_user(SUSPENSIONSTARTDATE$0, 0);
            return target;
        }
    }
    
    /**
     * Sets the "SuspensionStartDate" element
     */
    public void setSuspensionStartDate(java.util.Calendar suspensionStartDate)
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.SimpleValue target = null;
            target = (org.apache.xmlbeans.SimpleValue)get_store().find_element_user(SUSPENSIONSTARTDATE$0, 0);
            if (target == null)
            {
                target = (org.apache.xmlbeans.SimpleValue)get_store().add_element_user(SUSPENSIONSTARTDATE$0);
            }
            target.setCalendarValue(suspensionStartDate);
        }
    }
    
    /**
     * Sets (as xml) the "SuspensionStartDate" element
     */
    public void xsetSuspensionStartDate(uk.nhs.nhsia.datastandards.ecds.SuspensionStartDateType suspensionStartDate)
    {
        synchronized (monitor())
        {
            check_orphaned();
            uk.nhs.nhsia.datastandards.ecds.SuspensionStartDateType target = null;
            target = (uk.nhs.nhsia.datastandards.ecds.SuspensionStartDateType)get_store().find_element_user(SUSPENSIONSTARTDATE$0, 0);
            if (target == null)
            {
                target = (uk.nhs.nhsia.datastandards.ecds.SuspensionStartDateType)get_store().add_element_user(SUSPENSIONSTARTDATE$0);
            }
            target.set(suspensionStartDate);
        }
    }
    
    /**
     * Gets the "SuspensionEndDate" element
     */
    public java.util.Calendar getSuspensionEndDate()
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.SimpleValue target = null;
            target = (org.apache.xmlbeans.SimpleValue)get_store().find_element_user(SUSPENSIONENDDATE$2, 0);
            if (target == null)
            {
                return null;
            }
            return target.getCalendarValue();
        }
    }
    
    /**
     * Gets (as xml) the "SuspensionEndDate" element
     */
    public uk.nhs.nhsia.datastandards.ecds.SuspensionEndDateType xgetSuspensionEndDate()
    {
        synchronized (monitor())
        {
            check_orphaned();
            uk.nhs.nhsia.datastandards.ecds.SuspensionEndDateType target = null;
            target = (uk.nhs.nhsia.datastandards.ecds.SuspensionEndDateType)get_store().find_element_user(SUSPENSIONENDDATE$2, 0);
            return target;
        }
    }
    
    /**
     * True if has "SuspensionEndDate" element
     */
    public boolean isSetSuspensionEndDate()
    {
        synchronized (monitor())
        {
            check_orphaned();
            return get_store().count_elements(SUSPENSIONENDDATE$2) != 0;
        }
    }
    
    /**
     * Sets the "SuspensionEndDate" element
     */
    public void setSuspensionEndDate(java.util.Calendar suspensionEndDate)
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.SimpleValue target = null;
            target = (org.apache.xmlbeans.SimpleValue)get_store().find_element_user(SUSPENSIONENDDATE$2, 0);
            if (target == null)
            {
                target = (org.apache.xmlbeans.SimpleValue)get_store().add_element_user(SUSPENSIONENDDATE$2);
            }
            target.setCalendarValue(suspensionEndDate);
        }
    }
    
    /**
     * Sets (as xml) the "SuspensionEndDate" element
     */
    public void xsetSuspensionEndDate(uk.nhs.nhsia.datastandards.ecds.SuspensionEndDateType suspensionEndDate)
    {
        synchronized (monitor())
        {
            check_orphaned();
            uk.nhs.nhsia.datastandards.ecds.SuspensionEndDateType target = null;
            target = (uk.nhs.nhsia.datastandards.ecds.SuspensionEndDateType)get_store().find_element_user(SUSPENSIONENDDATE$2, 0);
            if (target == null)
            {
                target = (uk.nhs.nhsia.datastandards.ecds.SuspensionEndDateType)get_store().add_element_user(SUSPENSIONENDDATE$2);
            }
            target.set(suspensionEndDate);
        }
    }
    
    /**
     * Unsets the "SuspensionEndDate" element
     */
    public void unsetSuspensionEndDate()
    {
        synchronized (monitor())
        {
            check_orphaned();
            get_store().remove_element(SUSPENSIONENDDATE$2, 0);
        }
    }
}
