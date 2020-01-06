/*
 * XML Type:  OverseasVisitorStatus_Structure
 * Namespace: http://www.nhsia.nhs.uk/DataStandards/XMLschema/CDS/ns
 * Java type: uk.nhs.nhsia.datastandards.ecds.OverseasVisitorStatusStructure
 *
 * Automatically generated - do not modify.
 */
package uk.nhs.nhsia.datastandards.ecds.impl;
/**
 * An XML OverseasVisitorStatus_Structure(@http://www.nhsia.nhs.uk/DataStandards/XMLschema/CDS/ns).
 *
 * This is a complex type.
 */
public class OverseasVisitorStatusStructureImpl extends org.apache.xmlbeans.impl.values.XmlComplexContentImpl implements uk.nhs.nhsia.datastandards.ecds.OverseasVisitorStatusStructure
{
    private static final long serialVersionUID = 1L;
    
    public OverseasVisitorStatusStructureImpl(org.apache.xmlbeans.SchemaType sType)
    {
        super(sType);
    }
    
    private static final javax.xml.namespace.QName OVERSEASVISITORCLASSIFICATION$0 = 
        new javax.xml.namespace.QName("http://www.nhsia.nhs.uk/DataStandards/XMLschema/CDS/ns", "OverseasVisitorClassification");
    private static final javax.xml.namespace.QName OVERSEASVISITORSTATUSSTARTDATE$2 = 
        new javax.xml.namespace.QName("http://www.nhsia.nhs.uk/DataStandards/XMLschema/CDS/ns", "OverseasVisitorStatusStartDate");
    private static final javax.xml.namespace.QName OVERSEASVISITORSTATUSENDDATE$4 = 
        new javax.xml.namespace.QName("http://www.nhsia.nhs.uk/DataStandards/XMLschema/CDS/ns", "OverseasVisitorStatusEndDate");
    
    
    /**
     * Gets the "OverseasVisitorClassification" element
     */
    public uk.nhs.nhsia.datastandards.ecds.OverseasVisitorClassificationType.Enum getOverseasVisitorClassification()
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.SimpleValue target = null;
            target = (org.apache.xmlbeans.SimpleValue)get_store().find_element_user(OVERSEASVISITORCLASSIFICATION$0, 0);
            if (target == null)
            {
                return null;
            }
            return (uk.nhs.nhsia.datastandards.ecds.OverseasVisitorClassificationType.Enum)target.getEnumValue();
        }
    }
    
    /**
     * Gets (as xml) the "OverseasVisitorClassification" element
     */
    public uk.nhs.nhsia.datastandards.ecds.OverseasVisitorClassificationType xgetOverseasVisitorClassification()
    {
        synchronized (monitor())
        {
            check_orphaned();
            uk.nhs.nhsia.datastandards.ecds.OverseasVisitorClassificationType target = null;
            target = (uk.nhs.nhsia.datastandards.ecds.OverseasVisitorClassificationType)get_store().find_element_user(OVERSEASVISITORCLASSIFICATION$0, 0);
            return target;
        }
    }
    
    /**
     * Sets the "OverseasVisitorClassification" element
     */
    public void setOverseasVisitorClassification(uk.nhs.nhsia.datastandards.ecds.OverseasVisitorClassificationType.Enum overseasVisitorClassification)
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.SimpleValue target = null;
            target = (org.apache.xmlbeans.SimpleValue)get_store().find_element_user(OVERSEASVISITORCLASSIFICATION$0, 0);
            if (target == null)
            {
                target = (org.apache.xmlbeans.SimpleValue)get_store().add_element_user(OVERSEASVISITORCLASSIFICATION$0);
            }
            target.setEnumValue(overseasVisitorClassification);
        }
    }
    
    /**
     * Sets (as xml) the "OverseasVisitorClassification" element
     */
    public void xsetOverseasVisitorClassification(uk.nhs.nhsia.datastandards.ecds.OverseasVisitorClassificationType overseasVisitorClassification)
    {
        synchronized (monitor())
        {
            check_orphaned();
            uk.nhs.nhsia.datastandards.ecds.OverseasVisitorClassificationType target = null;
            target = (uk.nhs.nhsia.datastandards.ecds.OverseasVisitorClassificationType)get_store().find_element_user(OVERSEASVISITORCLASSIFICATION$0, 0);
            if (target == null)
            {
                target = (uk.nhs.nhsia.datastandards.ecds.OverseasVisitorClassificationType)get_store().add_element_user(OVERSEASVISITORCLASSIFICATION$0);
            }
            target.set(overseasVisitorClassification);
        }
    }
    
    /**
     * Gets the "OverseasVisitorStatusStartDate" element
     */
    public java.util.Calendar getOverseasVisitorStatusStartDate()
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.SimpleValue target = null;
            target = (org.apache.xmlbeans.SimpleValue)get_store().find_element_user(OVERSEASVISITORSTATUSSTARTDATE$2, 0);
            if (target == null)
            {
                return null;
            }
            return target.getCalendarValue();
        }
    }
    
    /**
     * Gets (as xml) the "OverseasVisitorStatusStartDate" element
     */
    public uk.nhs.nhsia.datastandards.ecds.OverseasVisitorStatusStartDateType xgetOverseasVisitorStatusStartDate()
    {
        synchronized (monitor())
        {
            check_orphaned();
            uk.nhs.nhsia.datastandards.ecds.OverseasVisitorStatusStartDateType target = null;
            target = (uk.nhs.nhsia.datastandards.ecds.OverseasVisitorStatusStartDateType)get_store().find_element_user(OVERSEASVISITORSTATUSSTARTDATE$2, 0);
            return target;
        }
    }
    
    /**
     * Sets the "OverseasVisitorStatusStartDate" element
     */
    public void setOverseasVisitorStatusStartDate(java.util.Calendar overseasVisitorStatusStartDate)
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.SimpleValue target = null;
            target = (org.apache.xmlbeans.SimpleValue)get_store().find_element_user(OVERSEASVISITORSTATUSSTARTDATE$2, 0);
            if (target == null)
            {
                target = (org.apache.xmlbeans.SimpleValue)get_store().add_element_user(OVERSEASVISITORSTATUSSTARTDATE$2);
            }
            target.setCalendarValue(overseasVisitorStatusStartDate);
        }
    }
    
    /**
     * Sets (as xml) the "OverseasVisitorStatusStartDate" element
     */
    public void xsetOverseasVisitorStatusStartDate(uk.nhs.nhsia.datastandards.ecds.OverseasVisitorStatusStartDateType overseasVisitorStatusStartDate)
    {
        synchronized (monitor())
        {
            check_orphaned();
            uk.nhs.nhsia.datastandards.ecds.OverseasVisitorStatusStartDateType target = null;
            target = (uk.nhs.nhsia.datastandards.ecds.OverseasVisitorStatusStartDateType)get_store().find_element_user(OVERSEASVISITORSTATUSSTARTDATE$2, 0);
            if (target == null)
            {
                target = (uk.nhs.nhsia.datastandards.ecds.OverseasVisitorStatusStartDateType)get_store().add_element_user(OVERSEASVISITORSTATUSSTARTDATE$2);
            }
            target.set(overseasVisitorStatusStartDate);
        }
    }
    
    /**
     * Gets the "OverseasVisitorStatusEndDate" element
     */
    public java.util.Calendar getOverseasVisitorStatusEndDate()
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.SimpleValue target = null;
            target = (org.apache.xmlbeans.SimpleValue)get_store().find_element_user(OVERSEASVISITORSTATUSENDDATE$4, 0);
            if (target == null)
            {
                return null;
            }
            return target.getCalendarValue();
        }
    }
    
    /**
     * Gets (as xml) the "OverseasVisitorStatusEndDate" element
     */
    public uk.nhs.nhsia.datastandards.ecds.OverseasVisitorStatusEndDateType xgetOverseasVisitorStatusEndDate()
    {
        synchronized (monitor())
        {
            check_orphaned();
            uk.nhs.nhsia.datastandards.ecds.OverseasVisitorStatusEndDateType target = null;
            target = (uk.nhs.nhsia.datastandards.ecds.OverseasVisitorStatusEndDateType)get_store().find_element_user(OVERSEASVISITORSTATUSENDDATE$4, 0);
            return target;
        }
    }
    
    /**
     * True if has "OverseasVisitorStatusEndDate" element
     */
    public boolean isSetOverseasVisitorStatusEndDate()
    {
        synchronized (monitor())
        {
            check_orphaned();
            return get_store().count_elements(OVERSEASVISITORSTATUSENDDATE$4) != 0;
        }
    }
    
    /**
     * Sets the "OverseasVisitorStatusEndDate" element
     */
    public void setOverseasVisitorStatusEndDate(java.util.Calendar overseasVisitorStatusEndDate)
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.SimpleValue target = null;
            target = (org.apache.xmlbeans.SimpleValue)get_store().find_element_user(OVERSEASVISITORSTATUSENDDATE$4, 0);
            if (target == null)
            {
                target = (org.apache.xmlbeans.SimpleValue)get_store().add_element_user(OVERSEASVISITORSTATUSENDDATE$4);
            }
            target.setCalendarValue(overseasVisitorStatusEndDate);
        }
    }
    
    /**
     * Sets (as xml) the "OverseasVisitorStatusEndDate" element
     */
    public void xsetOverseasVisitorStatusEndDate(uk.nhs.nhsia.datastandards.ecds.OverseasVisitorStatusEndDateType overseasVisitorStatusEndDate)
    {
        synchronized (monitor())
        {
            check_orphaned();
            uk.nhs.nhsia.datastandards.ecds.OverseasVisitorStatusEndDateType target = null;
            target = (uk.nhs.nhsia.datastandards.ecds.OverseasVisitorStatusEndDateType)get_store().find_element_user(OVERSEASVISITORSTATUSENDDATE$4, 0);
            if (target == null)
            {
                target = (uk.nhs.nhsia.datastandards.ecds.OverseasVisitorStatusEndDateType)get_store().add_element_user(OVERSEASVISITORSTATUSENDDATE$4);
            }
            target.set(overseasVisitorStatusEndDate);
        }
    }
    
    /**
     * Unsets the "OverseasVisitorStatusEndDate" element
     */
    public void unsetOverseasVisitorStatusEndDate()
    {
        synchronized (monitor())
        {
            check_orphaned();
            get_store().remove_element(OVERSEASVISITORSTATUSENDDATE$4, 0);
        }
    }
}
