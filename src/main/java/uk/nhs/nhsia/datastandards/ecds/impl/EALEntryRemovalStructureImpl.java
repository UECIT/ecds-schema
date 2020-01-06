/*
 * XML Type:  EALEntryRemoval_Structure
 * Namespace: http://www.nhsia.nhs.uk/DataStandards/XMLschema/CDS/ns
 * Java type: uk.nhs.nhsia.datastandards.ecds.EALEntryRemovalStructure
 *
 * Automatically generated - do not modify.
 */
package uk.nhs.nhsia.datastandards.ecds.impl;
/**
 * An XML EALEntryRemoval_Structure(@http://www.nhsia.nhs.uk/DataStandards/XMLschema/CDS/ns).
 *
 * This is a complex type.
 */
public class EALEntryRemovalStructureImpl extends org.apache.xmlbeans.impl.values.XmlComplexContentImpl implements uk.nhs.nhsia.datastandards.ecds.EALEntryRemovalStructure
{
    private static final long serialVersionUID = 1L;
    
    public EALEntryRemovalStructureImpl(org.apache.xmlbeans.SchemaType sType)
    {
        super(sType);
    }
    
    private static final javax.xml.namespace.QName ELECTIVEADMISSIONLISTREMOVALREASONCODE$0 = 
        new javax.xml.namespace.QName("http://www.nhsia.nhs.uk/DataStandards/XMLschema/CDS/ns", "ElectiveAdmissionListRemovalReasonCode");
    private static final javax.xml.namespace.QName ELECTIVEADMISSIONLISTREMOVALDATE$2 = 
        new javax.xml.namespace.QName("http://www.nhsia.nhs.uk/DataStandards/XMLschema/CDS/ns", "ElectiveAdmissionListRemovalDate");
    
    
    /**
     * Gets the "ElectiveAdmissionListRemovalReasonCode" element
     */
    public uk.nhs.nhsia.datastandards.ecds.ElectiveAdmissionListRemovalReasonCodeType.Enum getElectiveAdmissionListRemovalReasonCode()
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.SimpleValue target = null;
            target = (org.apache.xmlbeans.SimpleValue)get_store().find_element_user(ELECTIVEADMISSIONLISTREMOVALREASONCODE$0, 0);
            if (target == null)
            {
                return null;
            }
            return (uk.nhs.nhsia.datastandards.ecds.ElectiveAdmissionListRemovalReasonCodeType.Enum)target.getEnumValue();
        }
    }
    
    /**
     * Gets (as xml) the "ElectiveAdmissionListRemovalReasonCode" element
     */
    public uk.nhs.nhsia.datastandards.ecds.ElectiveAdmissionListRemovalReasonCodeType xgetElectiveAdmissionListRemovalReasonCode()
    {
        synchronized (monitor())
        {
            check_orphaned();
            uk.nhs.nhsia.datastandards.ecds.ElectiveAdmissionListRemovalReasonCodeType target = null;
            target = (uk.nhs.nhsia.datastandards.ecds.ElectiveAdmissionListRemovalReasonCodeType)get_store().find_element_user(ELECTIVEADMISSIONLISTREMOVALREASONCODE$0, 0);
            return target;
        }
    }
    
    /**
     * True if has "ElectiveAdmissionListRemovalReasonCode" element
     */
    public boolean isSetElectiveAdmissionListRemovalReasonCode()
    {
        synchronized (monitor())
        {
            check_orphaned();
            return get_store().count_elements(ELECTIVEADMISSIONLISTREMOVALREASONCODE$0) != 0;
        }
    }
    
    /**
     * Sets the "ElectiveAdmissionListRemovalReasonCode" element
     */
    public void setElectiveAdmissionListRemovalReasonCode(uk.nhs.nhsia.datastandards.ecds.ElectiveAdmissionListRemovalReasonCodeType.Enum electiveAdmissionListRemovalReasonCode)
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.SimpleValue target = null;
            target = (org.apache.xmlbeans.SimpleValue)get_store().find_element_user(ELECTIVEADMISSIONLISTREMOVALREASONCODE$0, 0);
            if (target == null)
            {
                target = (org.apache.xmlbeans.SimpleValue)get_store().add_element_user(ELECTIVEADMISSIONLISTREMOVALREASONCODE$0);
            }
            target.setEnumValue(electiveAdmissionListRemovalReasonCode);
        }
    }
    
    /**
     * Sets (as xml) the "ElectiveAdmissionListRemovalReasonCode" element
     */
    public void xsetElectiveAdmissionListRemovalReasonCode(uk.nhs.nhsia.datastandards.ecds.ElectiveAdmissionListRemovalReasonCodeType electiveAdmissionListRemovalReasonCode)
    {
        synchronized (monitor())
        {
            check_orphaned();
            uk.nhs.nhsia.datastandards.ecds.ElectiveAdmissionListRemovalReasonCodeType target = null;
            target = (uk.nhs.nhsia.datastandards.ecds.ElectiveAdmissionListRemovalReasonCodeType)get_store().find_element_user(ELECTIVEADMISSIONLISTREMOVALREASONCODE$0, 0);
            if (target == null)
            {
                target = (uk.nhs.nhsia.datastandards.ecds.ElectiveAdmissionListRemovalReasonCodeType)get_store().add_element_user(ELECTIVEADMISSIONLISTREMOVALREASONCODE$0);
            }
            target.set(electiveAdmissionListRemovalReasonCode);
        }
    }
    
    /**
     * Unsets the "ElectiveAdmissionListRemovalReasonCode" element
     */
    public void unsetElectiveAdmissionListRemovalReasonCode()
    {
        synchronized (monitor())
        {
            check_orphaned();
            get_store().remove_element(ELECTIVEADMISSIONLISTREMOVALREASONCODE$0, 0);
        }
    }
    
    /**
     * Gets the "ElectiveAdmissionListRemovalDate" element
     */
    public java.util.Calendar getElectiveAdmissionListRemovalDate()
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.SimpleValue target = null;
            target = (org.apache.xmlbeans.SimpleValue)get_store().find_element_user(ELECTIVEADMISSIONLISTREMOVALDATE$2, 0);
            if (target == null)
            {
                return null;
            }
            return target.getCalendarValue();
        }
    }
    
    /**
     * Gets (as xml) the "ElectiveAdmissionListRemovalDate" element
     */
    public uk.nhs.nhsia.datastandards.ecds.ElectiveAdmissionListRemovalDateType xgetElectiveAdmissionListRemovalDate()
    {
        synchronized (monitor())
        {
            check_orphaned();
            uk.nhs.nhsia.datastandards.ecds.ElectiveAdmissionListRemovalDateType target = null;
            target = (uk.nhs.nhsia.datastandards.ecds.ElectiveAdmissionListRemovalDateType)get_store().find_element_user(ELECTIVEADMISSIONLISTREMOVALDATE$2, 0);
            return target;
        }
    }
    
    /**
     * True if has "ElectiveAdmissionListRemovalDate" element
     */
    public boolean isSetElectiveAdmissionListRemovalDate()
    {
        synchronized (monitor())
        {
            check_orphaned();
            return get_store().count_elements(ELECTIVEADMISSIONLISTREMOVALDATE$2) != 0;
        }
    }
    
    /**
     * Sets the "ElectiveAdmissionListRemovalDate" element
     */
    public void setElectiveAdmissionListRemovalDate(java.util.Calendar electiveAdmissionListRemovalDate)
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.SimpleValue target = null;
            target = (org.apache.xmlbeans.SimpleValue)get_store().find_element_user(ELECTIVEADMISSIONLISTREMOVALDATE$2, 0);
            if (target == null)
            {
                target = (org.apache.xmlbeans.SimpleValue)get_store().add_element_user(ELECTIVEADMISSIONLISTREMOVALDATE$2);
            }
            target.setCalendarValue(electiveAdmissionListRemovalDate);
        }
    }
    
    /**
     * Sets (as xml) the "ElectiveAdmissionListRemovalDate" element
     */
    public void xsetElectiveAdmissionListRemovalDate(uk.nhs.nhsia.datastandards.ecds.ElectiveAdmissionListRemovalDateType electiveAdmissionListRemovalDate)
    {
        synchronized (monitor())
        {
            check_orphaned();
            uk.nhs.nhsia.datastandards.ecds.ElectiveAdmissionListRemovalDateType target = null;
            target = (uk.nhs.nhsia.datastandards.ecds.ElectiveAdmissionListRemovalDateType)get_store().find_element_user(ELECTIVEADMISSIONLISTREMOVALDATE$2, 0);
            if (target == null)
            {
                target = (uk.nhs.nhsia.datastandards.ecds.ElectiveAdmissionListRemovalDateType)get_store().add_element_user(ELECTIVEADMISSIONLISTREMOVALDATE$2);
            }
            target.set(electiveAdmissionListRemovalDate);
        }
    }
    
    /**
     * Unsets the "ElectiveAdmissionListRemovalDate" element
     */
    public void unsetElectiveAdmissionListRemovalDate()
    {
        synchronized (monitor())
        {
            check_orphaned();
            get_store().remove_element(ELECTIVEADMISSIONLISTREMOVALDATE$2, 0);
        }
    }
}
