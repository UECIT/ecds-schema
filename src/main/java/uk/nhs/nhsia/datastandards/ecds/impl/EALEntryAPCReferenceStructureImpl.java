/*
 * XML Type:  EALEntry_APCReference_Structure
 * Namespace: http://www.nhsia.nhs.uk/DataStandards/XMLschema/CDS/ns
 * Java type: uk.nhs.nhsia.datastandards.ecds.EALEntryAPCReferenceStructure
 *
 * Automatically generated - do not modify.
 */
package uk.nhs.nhsia.datastandards.ecds.impl;
/**
 * An XML EALEntry_APCReference_Structure(@http://www.nhsia.nhs.uk/DataStandards/XMLschema/CDS/ns).
 *
 * This is a complex type.
 */
public class EALEntryAPCReferenceStructureImpl extends org.apache.xmlbeans.impl.values.XmlComplexContentImpl implements uk.nhs.nhsia.datastandards.ecds.EALEntryAPCReferenceStructure
{
    private static final long serialVersionUID = 1L;
    
    public EALEntryAPCReferenceStructureImpl(org.apache.xmlbeans.SchemaType sType)
    {
        super(sType);
    }
    
    private static final javax.xml.namespace.QName DURATIONOFELECTIVEWAIT$0 = 
        new javax.xml.namespace.QName("http://www.nhsia.nhs.uk/DataStandards/XMLschema/CDS/ns", "DurationOfElectiveWait");
    private static final javax.xml.namespace.QName INTENDEDMANAGEMENTCODE$2 = 
        new javax.xml.namespace.QName("http://www.nhsia.nhs.uk/DataStandards/XMLschema/CDS/ns", "IntendedManagementCode");
    private static final javax.xml.namespace.QName DECIDEDTOADMITDATE$4 = 
        new javax.xml.namespace.QName("http://www.nhsia.nhs.uk/DataStandards/XMLschema/CDS/ns", "DecidedToAdmitDate");
    private static final javax.xml.namespace.QName EARLIESTREASONABLEOFFERDATE$6 = 
        new javax.xml.namespace.QName("http://www.nhsia.nhs.uk/DataStandards/XMLschema/CDS/ns", "EarliestReasonableOfferDate");
    
    
    /**
     * Gets the "DurationOfElectiveWait" element
     */
    public int getDurationOfElectiveWait()
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.SimpleValue target = null;
            target = (org.apache.xmlbeans.SimpleValue)get_store().find_element_user(DURATIONOFELECTIVEWAIT$0, 0);
            if (target == null)
            {
                return 0;
            }
            return target.getIntValue();
        }
    }
    
    /**
     * Gets (as xml) the "DurationOfElectiveWait" element
     */
    public uk.nhs.nhsia.datastandards.ecds.DurationOfElectiveWaitType xgetDurationOfElectiveWait()
    {
        synchronized (monitor())
        {
            check_orphaned();
            uk.nhs.nhsia.datastandards.ecds.DurationOfElectiveWaitType target = null;
            target = (uk.nhs.nhsia.datastandards.ecds.DurationOfElectiveWaitType)get_store().find_element_user(DURATIONOFELECTIVEWAIT$0, 0);
            return target;
        }
    }
    
    /**
     * True if has "DurationOfElectiveWait" element
     */
    public boolean isSetDurationOfElectiveWait()
    {
        synchronized (monitor())
        {
            check_orphaned();
            return get_store().count_elements(DURATIONOFELECTIVEWAIT$0) != 0;
        }
    }
    
    /**
     * Sets the "DurationOfElectiveWait" element
     */
    public void setDurationOfElectiveWait(int durationOfElectiveWait)
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.SimpleValue target = null;
            target = (org.apache.xmlbeans.SimpleValue)get_store().find_element_user(DURATIONOFELECTIVEWAIT$0, 0);
            if (target == null)
            {
                target = (org.apache.xmlbeans.SimpleValue)get_store().add_element_user(DURATIONOFELECTIVEWAIT$0);
            }
            target.setIntValue(durationOfElectiveWait);
        }
    }
    
    /**
     * Sets (as xml) the "DurationOfElectiveWait" element
     */
    public void xsetDurationOfElectiveWait(uk.nhs.nhsia.datastandards.ecds.DurationOfElectiveWaitType durationOfElectiveWait)
    {
        synchronized (monitor())
        {
            check_orphaned();
            uk.nhs.nhsia.datastandards.ecds.DurationOfElectiveWaitType target = null;
            target = (uk.nhs.nhsia.datastandards.ecds.DurationOfElectiveWaitType)get_store().find_element_user(DURATIONOFELECTIVEWAIT$0, 0);
            if (target == null)
            {
                target = (uk.nhs.nhsia.datastandards.ecds.DurationOfElectiveWaitType)get_store().add_element_user(DURATIONOFELECTIVEWAIT$0);
            }
            target.set(durationOfElectiveWait);
        }
    }
    
    /**
     * Unsets the "DurationOfElectiveWait" element
     */
    public void unsetDurationOfElectiveWait()
    {
        synchronized (monitor())
        {
            check_orphaned();
            get_store().remove_element(DURATIONOFELECTIVEWAIT$0, 0);
        }
    }
    
    /**
     * Gets the "IntendedManagementCode" element
     */
    public uk.nhs.nhsia.datastandards.ecds.IntendedManagementCodeType.Enum getIntendedManagementCode()
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.SimpleValue target = null;
            target = (org.apache.xmlbeans.SimpleValue)get_store().find_element_user(INTENDEDMANAGEMENTCODE$2, 0);
            if (target == null)
            {
                return null;
            }
            return (uk.nhs.nhsia.datastandards.ecds.IntendedManagementCodeType.Enum)target.getEnumValue();
        }
    }
    
    /**
     * Gets (as xml) the "IntendedManagementCode" element
     */
    public uk.nhs.nhsia.datastandards.ecds.IntendedManagementCodeType xgetIntendedManagementCode()
    {
        synchronized (monitor())
        {
            check_orphaned();
            uk.nhs.nhsia.datastandards.ecds.IntendedManagementCodeType target = null;
            target = (uk.nhs.nhsia.datastandards.ecds.IntendedManagementCodeType)get_store().find_element_user(INTENDEDMANAGEMENTCODE$2, 0);
            return target;
        }
    }
    
    /**
     * True if has "IntendedManagementCode" element
     */
    public boolean isSetIntendedManagementCode()
    {
        synchronized (monitor())
        {
            check_orphaned();
            return get_store().count_elements(INTENDEDMANAGEMENTCODE$2) != 0;
        }
    }
    
    /**
     * Sets the "IntendedManagementCode" element
     */
    public void setIntendedManagementCode(uk.nhs.nhsia.datastandards.ecds.IntendedManagementCodeType.Enum intendedManagementCode)
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.SimpleValue target = null;
            target = (org.apache.xmlbeans.SimpleValue)get_store().find_element_user(INTENDEDMANAGEMENTCODE$2, 0);
            if (target == null)
            {
                target = (org.apache.xmlbeans.SimpleValue)get_store().add_element_user(INTENDEDMANAGEMENTCODE$2);
            }
            target.setEnumValue(intendedManagementCode);
        }
    }
    
    /**
     * Sets (as xml) the "IntendedManagementCode" element
     */
    public void xsetIntendedManagementCode(uk.nhs.nhsia.datastandards.ecds.IntendedManagementCodeType intendedManagementCode)
    {
        synchronized (monitor())
        {
            check_orphaned();
            uk.nhs.nhsia.datastandards.ecds.IntendedManagementCodeType target = null;
            target = (uk.nhs.nhsia.datastandards.ecds.IntendedManagementCodeType)get_store().find_element_user(INTENDEDMANAGEMENTCODE$2, 0);
            if (target == null)
            {
                target = (uk.nhs.nhsia.datastandards.ecds.IntendedManagementCodeType)get_store().add_element_user(INTENDEDMANAGEMENTCODE$2);
            }
            target.set(intendedManagementCode);
        }
    }
    
    /**
     * Unsets the "IntendedManagementCode" element
     */
    public void unsetIntendedManagementCode()
    {
        synchronized (monitor())
        {
            check_orphaned();
            get_store().remove_element(INTENDEDMANAGEMENTCODE$2, 0);
        }
    }
    
    /**
     * Gets the "DecidedToAdmitDate" element
     */
    public java.util.Calendar getDecidedToAdmitDate()
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.SimpleValue target = null;
            target = (org.apache.xmlbeans.SimpleValue)get_store().find_element_user(DECIDEDTOADMITDATE$4, 0);
            if (target == null)
            {
                return null;
            }
            return target.getCalendarValue();
        }
    }
    
    /**
     * Gets (as xml) the "DecidedToAdmitDate" element
     */
    public uk.nhs.nhsia.datastandards.ecds.DecidedToAdmitDateType xgetDecidedToAdmitDate()
    {
        synchronized (monitor())
        {
            check_orphaned();
            uk.nhs.nhsia.datastandards.ecds.DecidedToAdmitDateType target = null;
            target = (uk.nhs.nhsia.datastandards.ecds.DecidedToAdmitDateType)get_store().find_element_user(DECIDEDTOADMITDATE$4, 0);
            return target;
        }
    }
    
    /**
     * True if has "DecidedToAdmitDate" element
     */
    public boolean isSetDecidedToAdmitDate()
    {
        synchronized (monitor())
        {
            check_orphaned();
            return get_store().count_elements(DECIDEDTOADMITDATE$4) != 0;
        }
    }
    
    /**
     * Sets the "DecidedToAdmitDate" element
     */
    public void setDecidedToAdmitDate(java.util.Calendar decidedToAdmitDate)
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.SimpleValue target = null;
            target = (org.apache.xmlbeans.SimpleValue)get_store().find_element_user(DECIDEDTOADMITDATE$4, 0);
            if (target == null)
            {
                target = (org.apache.xmlbeans.SimpleValue)get_store().add_element_user(DECIDEDTOADMITDATE$4);
            }
            target.setCalendarValue(decidedToAdmitDate);
        }
    }
    
    /**
     * Sets (as xml) the "DecidedToAdmitDate" element
     */
    public void xsetDecidedToAdmitDate(uk.nhs.nhsia.datastandards.ecds.DecidedToAdmitDateType decidedToAdmitDate)
    {
        synchronized (monitor())
        {
            check_orphaned();
            uk.nhs.nhsia.datastandards.ecds.DecidedToAdmitDateType target = null;
            target = (uk.nhs.nhsia.datastandards.ecds.DecidedToAdmitDateType)get_store().find_element_user(DECIDEDTOADMITDATE$4, 0);
            if (target == null)
            {
                target = (uk.nhs.nhsia.datastandards.ecds.DecidedToAdmitDateType)get_store().add_element_user(DECIDEDTOADMITDATE$4);
            }
            target.set(decidedToAdmitDate);
        }
    }
    
    /**
     * Unsets the "DecidedToAdmitDate" element
     */
    public void unsetDecidedToAdmitDate()
    {
        synchronized (monitor())
        {
            check_orphaned();
            get_store().remove_element(DECIDEDTOADMITDATE$4, 0);
        }
    }
    
    /**
     * Gets the "EarliestReasonableOfferDate" element
     */
    public java.util.Calendar getEarliestReasonableOfferDate()
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.SimpleValue target = null;
            target = (org.apache.xmlbeans.SimpleValue)get_store().find_element_user(EARLIESTREASONABLEOFFERDATE$6, 0);
            if (target == null)
            {
                return null;
            }
            return target.getCalendarValue();
        }
    }
    
    /**
     * Gets (as xml) the "EarliestReasonableOfferDate" element
     */
    public uk.nhs.nhsia.datastandards.ecds.EarliestReasonableOfferDateType xgetEarliestReasonableOfferDate()
    {
        synchronized (monitor())
        {
            check_orphaned();
            uk.nhs.nhsia.datastandards.ecds.EarliestReasonableOfferDateType target = null;
            target = (uk.nhs.nhsia.datastandards.ecds.EarliestReasonableOfferDateType)get_store().find_element_user(EARLIESTREASONABLEOFFERDATE$6, 0);
            return target;
        }
    }
    
    /**
     * True if has "EarliestReasonableOfferDate" element
     */
    public boolean isSetEarliestReasonableOfferDate()
    {
        synchronized (monitor())
        {
            check_orphaned();
            return get_store().count_elements(EARLIESTREASONABLEOFFERDATE$6) != 0;
        }
    }
    
    /**
     * Sets the "EarliestReasonableOfferDate" element
     */
    public void setEarliestReasonableOfferDate(java.util.Calendar earliestReasonableOfferDate)
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.SimpleValue target = null;
            target = (org.apache.xmlbeans.SimpleValue)get_store().find_element_user(EARLIESTREASONABLEOFFERDATE$6, 0);
            if (target == null)
            {
                target = (org.apache.xmlbeans.SimpleValue)get_store().add_element_user(EARLIESTREASONABLEOFFERDATE$6);
            }
            target.setCalendarValue(earliestReasonableOfferDate);
        }
    }
    
    /**
     * Sets (as xml) the "EarliestReasonableOfferDate" element
     */
    public void xsetEarliestReasonableOfferDate(uk.nhs.nhsia.datastandards.ecds.EarliestReasonableOfferDateType earliestReasonableOfferDate)
    {
        synchronized (monitor())
        {
            check_orphaned();
            uk.nhs.nhsia.datastandards.ecds.EarliestReasonableOfferDateType target = null;
            target = (uk.nhs.nhsia.datastandards.ecds.EarliestReasonableOfferDateType)get_store().find_element_user(EARLIESTREASONABLEOFFERDATE$6, 0);
            if (target == null)
            {
                target = (uk.nhs.nhsia.datastandards.ecds.EarliestReasonableOfferDateType)get_store().add_element_user(EARLIESTREASONABLEOFFERDATE$6);
            }
            target.set(earliestReasonableOfferDate);
        }
    }
    
    /**
     * Unsets the "EarliestReasonableOfferDate" element
     */
    public void unsetEarliestReasonableOfferDate()
    {
        synchronized (monitor())
        {
            check_orphaned();
            get_store().remove_element(EARLIESTREASONABLEOFFERDATE$6, 0);
        }
    }
}
