/*
 * XML Type:  OfferOfAdmission_Structure
 * Namespace: http://www.nhsia.nhs.uk/DataStandards/XMLschema/CDS/ns
 * Java type: uk.nhs.nhsia.datastandards.ecds.OfferOfAdmissionStructure
 *
 * Automatically generated - do not modify.
 */
package uk.nhs.nhsia.datastandards.ecds.impl;
/**
 * An XML OfferOfAdmission_Structure(@http://www.nhsia.nhs.uk/DataStandards/XMLschema/CDS/ns).
 *
 * This is a complex type.
 */
public class OfferOfAdmissionStructureImpl extends org.apache.xmlbeans.impl.values.XmlComplexContentImpl implements uk.nhs.nhsia.datastandards.ecds.OfferOfAdmissionStructure
{
    private static final long serialVersionUID = 1L;
    
    public OfferOfAdmissionStructureImpl(org.apache.xmlbeans.SchemaType sType)
    {
        super(sType);
    }
    
    private static final javax.xml.namespace.QName ADMISSIONOFFEROUTCOMECODE$0 = 
        new javax.xml.namespace.QName("http://www.nhsia.nhs.uk/DataStandards/XMLschema/CDS/ns", "AdmissionOfferOutcomeCode");
    private static final javax.xml.namespace.QName OFFEREDFORADMISSIONDATE$2 = 
        new javax.xml.namespace.QName("http://www.nhsia.nhs.uk/DataStandards/XMLschema/CDS/ns", "OfferedForAdmissionDate");
    private static final javax.xml.namespace.QName EARLIESTREASONABLEOFFERDATE$4 = 
        new javax.xml.namespace.QName("http://www.nhsia.nhs.uk/DataStandards/XMLschema/CDS/ns", "EarliestReasonableOfferDate");
    
    
    /**
     * Gets the "AdmissionOfferOutcomeCode" element
     */
    public uk.nhs.nhsia.datastandards.ecds.AdmissionOfferOutcomeCodeType.Enum getAdmissionOfferOutcomeCode()
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.SimpleValue target = null;
            target = (org.apache.xmlbeans.SimpleValue)get_store().find_element_user(ADMISSIONOFFEROUTCOMECODE$0, 0);
            if (target == null)
            {
                return null;
            }
            return (uk.nhs.nhsia.datastandards.ecds.AdmissionOfferOutcomeCodeType.Enum)target.getEnumValue();
        }
    }
    
    /**
     * Gets (as xml) the "AdmissionOfferOutcomeCode" element
     */
    public uk.nhs.nhsia.datastandards.ecds.AdmissionOfferOutcomeCodeType xgetAdmissionOfferOutcomeCode()
    {
        synchronized (monitor())
        {
            check_orphaned();
            uk.nhs.nhsia.datastandards.ecds.AdmissionOfferOutcomeCodeType target = null;
            target = (uk.nhs.nhsia.datastandards.ecds.AdmissionOfferOutcomeCodeType)get_store().find_element_user(ADMISSIONOFFEROUTCOMECODE$0, 0);
            return target;
        }
    }
    
    /**
     * True if has "AdmissionOfferOutcomeCode" element
     */
    public boolean isSetAdmissionOfferOutcomeCode()
    {
        synchronized (monitor())
        {
            check_orphaned();
            return get_store().count_elements(ADMISSIONOFFEROUTCOMECODE$0) != 0;
        }
    }
    
    /**
     * Sets the "AdmissionOfferOutcomeCode" element
     */
    public void setAdmissionOfferOutcomeCode(uk.nhs.nhsia.datastandards.ecds.AdmissionOfferOutcomeCodeType.Enum admissionOfferOutcomeCode)
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.SimpleValue target = null;
            target = (org.apache.xmlbeans.SimpleValue)get_store().find_element_user(ADMISSIONOFFEROUTCOMECODE$0, 0);
            if (target == null)
            {
                target = (org.apache.xmlbeans.SimpleValue)get_store().add_element_user(ADMISSIONOFFEROUTCOMECODE$0);
            }
            target.setEnumValue(admissionOfferOutcomeCode);
        }
    }
    
    /**
     * Sets (as xml) the "AdmissionOfferOutcomeCode" element
     */
    public void xsetAdmissionOfferOutcomeCode(uk.nhs.nhsia.datastandards.ecds.AdmissionOfferOutcomeCodeType admissionOfferOutcomeCode)
    {
        synchronized (monitor())
        {
            check_orphaned();
            uk.nhs.nhsia.datastandards.ecds.AdmissionOfferOutcomeCodeType target = null;
            target = (uk.nhs.nhsia.datastandards.ecds.AdmissionOfferOutcomeCodeType)get_store().find_element_user(ADMISSIONOFFEROUTCOMECODE$0, 0);
            if (target == null)
            {
                target = (uk.nhs.nhsia.datastandards.ecds.AdmissionOfferOutcomeCodeType)get_store().add_element_user(ADMISSIONOFFEROUTCOMECODE$0);
            }
            target.set(admissionOfferOutcomeCode);
        }
    }
    
    /**
     * Unsets the "AdmissionOfferOutcomeCode" element
     */
    public void unsetAdmissionOfferOutcomeCode()
    {
        synchronized (monitor())
        {
            check_orphaned();
            get_store().remove_element(ADMISSIONOFFEROUTCOMECODE$0, 0);
        }
    }
    
    /**
     * Gets the "OfferedForAdmissionDate" element
     */
    public java.util.Calendar getOfferedForAdmissionDate()
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.SimpleValue target = null;
            target = (org.apache.xmlbeans.SimpleValue)get_store().find_element_user(OFFEREDFORADMISSIONDATE$2, 0);
            if (target == null)
            {
                return null;
            }
            return target.getCalendarValue();
        }
    }
    
    /**
     * Gets (as xml) the "OfferedForAdmissionDate" element
     */
    public uk.nhs.nhsia.datastandards.ecds.OfferedForAdmissionDateType xgetOfferedForAdmissionDate()
    {
        synchronized (monitor())
        {
            check_orphaned();
            uk.nhs.nhsia.datastandards.ecds.OfferedForAdmissionDateType target = null;
            target = (uk.nhs.nhsia.datastandards.ecds.OfferedForAdmissionDateType)get_store().find_element_user(OFFEREDFORADMISSIONDATE$2, 0);
            return target;
        }
    }
    
    /**
     * True if has "OfferedForAdmissionDate" element
     */
    public boolean isSetOfferedForAdmissionDate()
    {
        synchronized (monitor())
        {
            check_orphaned();
            return get_store().count_elements(OFFEREDFORADMISSIONDATE$2) != 0;
        }
    }
    
    /**
     * Sets the "OfferedForAdmissionDate" element
     */
    public void setOfferedForAdmissionDate(java.util.Calendar offeredForAdmissionDate)
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.SimpleValue target = null;
            target = (org.apache.xmlbeans.SimpleValue)get_store().find_element_user(OFFEREDFORADMISSIONDATE$2, 0);
            if (target == null)
            {
                target = (org.apache.xmlbeans.SimpleValue)get_store().add_element_user(OFFEREDFORADMISSIONDATE$2);
            }
            target.setCalendarValue(offeredForAdmissionDate);
        }
    }
    
    /**
     * Sets (as xml) the "OfferedForAdmissionDate" element
     */
    public void xsetOfferedForAdmissionDate(uk.nhs.nhsia.datastandards.ecds.OfferedForAdmissionDateType offeredForAdmissionDate)
    {
        synchronized (monitor())
        {
            check_orphaned();
            uk.nhs.nhsia.datastandards.ecds.OfferedForAdmissionDateType target = null;
            target = (uk.nhs.nhsia.datastandards.ecds.OfferedForAdmissionDateType)get_store().find_element_user(OFFEREDFORADMISSIONDATE$2, 0);
            if (target == null)
            {
                target = (uk.nhs.nhsia.datastandards.ecds.OfferedForAdmissionDateType)get_store().add_element_user(OFFEREDFORADMISSIONDATE$2);
            }
            target.set(offeredForAdmissionDate);
        }
    }
    
    /**
     * Unsets the "OfferedForAdmissionDate" element
     */
    public void unsetOfferedForAdmissionDate()
    {
        synchronized (monitor())
        {
            check_orphaned();
            get_store().remove_element(OFFEREDFORADMISSIONDATE$2, 0);
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
            target = (org.apache.xmlbeans.SimpleValue)get_store().find_element_user(EARLIESTREASONABLEOFFERDATE$4, 0);
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
            target = (uk.nhs.nhsia.datastandards.ecds.EarliestReasonableOfferDateType)get_store().find_element_user(EARLIESTREASONABLEOFFERDATE$4, 0);
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
            return get_store().count_elements(EARLIESTREASONABLEOFFERDATE$4) != 0;
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
            target = (org.apache.xmlbeans.SimpleValue)get_store().find_element_user(EARLIESTREASONABLEOFFERDATE$4, 0);
            if (target == null)
            {
                target = (org.apache.xmlbeans.SimpleValue)get_store().add_element_user(EARLIESTREASONABLEOFFERDATE$4);
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
            target = (uk.nhs.nhsia.datastandards.ecds.EarliestReasonableOfferDateType)get_store().find_element_user(EARLIESTREASONABLEOFFERDATE$4, 0);
            if (target == null)
            {
                target = (uk.nhs.nhsia.datastandards.ecds.EarliestReasonableOfferDateType)get_store().add_element_user(EARLIESTREASONABLEOFFERDATE$4);
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
            get_store().remove_element(EARLIESTREASONABLEOFFERDATE$4, 0);
        }
    }
}
