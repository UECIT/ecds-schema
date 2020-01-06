/*
 * XML Type:  MissedAppointmentOccurrence_Structure
 * Namespace: http://www.nhsia.nhs.uk/DataStandards/XMLschema/CDS/ns
 * Java type: uk.nhs.nhsia.datastandards.ecds.MissedAppointmentOccurrenceStructure
 *
 * Automatically generated - do not modify.
 */
package uk.nhs.nhsia.datastandards.ecds.impl;
/**
 * An XML MissedAppointmentOccurrence_Structure(@http://www.nhsia.nhs.uk/DataStandards/XMLschema/CDS/ns).
 *
 * This is a complex type.
 */
public class MissedAppointmentOccurrenceStructureImpl extends org.apache.xmlbeans.impl.values.XmlComplexContentImpl implements uk.nhs.nhsia.datastandards.ecds.MissedAppointmentOccurrenceStructure
{
    private static final long serialVersionUID = 1L;
    
    public MissedAppointmentOccurrenceStructureImpl(org.apache.xmlbeans.SchemaType sType)
    {
        super(sType);
    }
    
    private static final javax.xml.namespace.QName LASTDNAORPATIENTCANCELLEDDATE$0 = 
        new javax.xml.namespace.QName("http://www.nhsia.nhs.uk/DataStandards/XMLschema/CDS/ns", "LastDNAOrPatientCancelledDate");
    
    
    /**
     * Gets the "LastDNAOrPatientCancelledDate" element
     */
    public java.util.Calendar getLastDNAOrPatientCancelledDate()
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.SimpleValue target = null;
            target = (org.apache.xmlbeans.SimpleValue)get_store().find_element_user(LASTDNAORPATIENTCANCELLEDDATE$0, 0);
            if (target == null)
            {
                return null;
            }
            return target.getCalendarValue();
        }
    }
    
    /**
     * Gets (as xml) the "LastDNAOrPatientCancelledDate" element
     */
    public uk.nhs.nhsia.datastandards.ecds.LastDNAOrPatientCancelledDateType xgetLastDNAOrPatientCancelledDate()
    {
        synchronized (monitor())
        {
            check_orphaned();
            uk.nhs.nhsia.datastandards.ecds.LastDNAOrPatientCancelledDateType target = null;
            target = (uk.nhs.nhsia.datastandards.ecds.LastDNAOrPatientCancelledDateType)get_store().find_element_user(LASTDNAORPATIENTCANCELLEDDATE$0, 0);
            return target;
        }
    }
    
    /**
     * True if has "LastDNAOrPatientCancelledDate" element
     */
    public boolean isSetLastDNAOrPatientCancelledDate()
    {
        synchronized (monitor())
        {
            check_orphaned();
            return get_store().count_elements(LASTDNAORPATIENTCANCELLEDDATE$0) != 0;
        }
    }
    
    /**
     * Sets the "LastDNAOrPatientCancelledDate" element
     */
    public void setLastDNAOrPatientCancelledDate(java.util.Calendar lastDNAOrPatientCancelledDate)
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.SimpleValue target = null;
            target = (org.apache.xmlbeans.SimpleValue)get_store().find_element_user(LASTDNAORPATIENTCANCELLEDDATE$0, 0);
            if (target == null)
            {
                target = (org.apache.xmlbeans.SimpleValue)get_store().add_element_user(LASTDNAORPATIENTCANCELLEDDATE$0);
            }
            target.setCalendarValue(lastDNAOrPatientCancelledDate);
        }
    }
    
    /**
     * Sets (as xml) the "LastDNAOrPatientCancelledDate" element
     */
    public void xsetLastDNAOrPatientCancelledDate(uk.nhs.nhsia.datastandards.ecds.LastDNAOrPatientCancelledDateType lastDNAOrPatientCancelledDate)
    {
        synchronized (monitor())
        {
            check_orphaned();
            uk.nhs.nhsia.datastandards.ecds.LastDNAOrPatientCancelledDateType target = null;
            target = (uk.nhs.nhsia.datastandards.ecds.LastDNAOrPatientCancelledDateType)get_store().find_element_user(LASTDNAORPATIENTCANCELLEDDATE$0, 0);
            if (target == null)
            {
                target = (uk.nhs.nhsia.datastandards.ecds.LastDNAOrPatientCancelledDateType)get_store().add_element_user(LASTDNAORPATIENTCANCELLEDDATE$0);
            }
            target.set(lastDNAOrPatientCancelledDate);
        }
    }
    
    /**
     * Unsets the "LastDNAOrPatientCancelledDate" element
     */
    public void unsetLastDNAOrPatientCancelledDate()
    {
        synchronized (monitor())
        {
            check_orphaned();
            get_store().remove_element(LASTDNAORPATIENTCANCELLEDDATE$0, 0);
        }
    }
}
