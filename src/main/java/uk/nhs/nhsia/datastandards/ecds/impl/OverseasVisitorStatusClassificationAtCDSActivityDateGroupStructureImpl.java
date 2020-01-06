/*
 * XML Type:  OverseasVisitorStatusClassificationAtCDSActivityDate_Group_Structure
 * Namespace: http://www.nhsia.nhs.uk/DataStandards/XMLschema/CDS/ns
 * Java type: uk.nhs.nhsia.datastandards.ecds.OverseasVisitorStatusClassificationAtCDSActivityDateGroupStructure
 *
 * Automatically generated - do not modify.
 */
package uk.nhs.nhsia.datastandards.ecds.impl;
/**
 * An XML OverseasVisitorStatusClassificationAtCDSActivityDate_Group_Structure(@http://www.nhsia.nhs.uk/DataStandards/XMLschema/CDS/ns).
 *
 * This is a complex type.
 */
public class OverseasVisitorStatusClassificationAtCDSActivityDateGroupStructureImpl extends org.apache.xmlbeans.impl.values.XmlComplexContentImpl implements uk.nhs.nhsia.datastandards.ecds.OverseasVisitorStatusClassificationAtCDSActivityDateGroupStructure
{
    private static final long serialVersionUID = 1L;
    
    public OverseasVisitorStatusClassificationAtCDSActivityDateGroupStructureImpl(org.apache.xmlbeans.SchemaType sType)
    {
        super(sType);
    }
    
    private static final javax.xml.namespace.QName OVERSEASVISITORSTATUSCLASSIFICATIONATCDSACTIVITYDATE$0 = 
        new javax.xml.namespace.QName("http://www.nhsia.nhs.uk/DataStandards/XMLschema/CDS/ns", "OverseasVisitorStatusClassificationAtCDSActivityDate");
    
    
    /**
     * Gets the "OverseasVisitorStatusClassificationAtCDSActivityDate" element
     */
    public uk.nhs.nhsia.datastandards.ecds.OverseasVisitorClassificationType.Enum getOverseasVisitorStatusClassificationAtCDSActivityDate()
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.SimpleValue target = null;
            target = (org.apache.xmlbeans.SimpleValue)get_store().find_element_user(OVERSEASVISITORSTATUSCLASSIFICATIONATCDSACTIVITYDATE$0, 0);
            if (target == null)
            {
                return null;
            }
            return (uk.nhs.nhsia.datastandards.ecds.OverseasVisitorClassificationType.Enum)target.getEnumValue();
        }
    }
    
    /**
     * Gets (as xml) the "OverseasVisitorStatusClassificationAtCDSActivityDate" element
     */
    public uk.nhs.nhsia.datastandards.ecds.OverseasVisitorStatusClassificationAtCDSActivityDateType xgetOverseasVisitorStatusClassificationAtCDSActivityDate()
    {
        synchronized (monitor())
        {
            check_orphaned();
            uk.nhs.nhsia.datastandards.ecds.OverseasVisitorStatusClassificationAtCDSActivityDateType target = null;
            target = (uk.nhs.nhsia.datastandards.ecds.OverseasVisitorStatusClassificationAtCDSActivityDateType)get_store().find_element_user(OVERSEASVISITORSTATUSCLASSIFICATIONATCDSACTIVITYDATE$0, 0);
            return target;
        }
    }
    
    /**
     * True if has "OverseasVisitorStatusClassificationAtCDSActivityDate" element
     */
    public boolean isSetOverseasVisitorStatusClassificationAtCDSActivityDate()
    {
        synchronized (monitor())
        {
            check_orphaned();
            return get_store().count_elements(OVERSEASVISITORSTATUSCLASSIFICATIONATCDSACTIVITYDATE$0) != 0;
        }
    }
    
    /**
     * Sets the "OverseasVisitorStatusClassificationAtCDSActivityDate" element
     */
    public void setOverseasVisitorStatusClassificationAtCDSActivityDate(uk.nhs.nhsia.datastandards.ecds.OverseasVisitorClassificationType.Enum overseasVisitorStatusClassificationAtCDSActivityDate)
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.SimpleValue target = null;
            target = (org.apache.xmlbeans.SimpleValue)get_store().find_element_user(OVERSEASVISITORSTATUSCLASSIFICATIONATCDSACTIVITYDATE$0, 0);
            if (target == null)
            {
                target = (org.apache.xmlbeans.SimpleValue)get_store().add_element_user(OVERSEASVISITORSTATUSCLASSIFICATIONATCDSACTIVITYDATE$0);
            }
            target.setEnumValue(overseasVisitorStatusClassificationAtCDSActivityDate);
        }
    }
    
    /**
     * Sets (as xml) the "OverseasVisitorStatusClassificationAtCDSActivityDate" element
     */
    public void xsetOverseasVisitorStatusClassificationAtCDSActivityDate(uk.nhs.nhsia.datastandards.ecds.OverseasVisitorStatusClassificationAtCDSActivityDateType overseasVisitorStatusClassificationAtCDSActivityDate)
    {
        synchronized (monitor())
        {
            check_orphaned();
            uk.nhs.nhsia.datastandards.ecds.OverseasVisitorStatusClassificationAtCDSActivityDateType target = null;
            target = (uk.nhs.nhsia.datastandards.ecds.OverseasVisitorStatusClassificationAtCDSActivityDateType)get_store().find_element_user(OVERSEASVISITORSTATUSCLASSIFICATIONATCDSACTIVITYDATE$0, 0);
            if (target == null)
            {
                target = (uk.nhs.nhsia.datastandards.ecds.OverseasVisitorStatusClassificationAtCDSActivityDateType)get_store().add_element_user(OVERSEASVISITORSTATUSCLASSIFICATIONATCDSACTIVITYDATE$0);
            }
            target.set(overseasVisitorStatusClassificationAtCDSActivityDate);
        }
    }
    
    /**
     * Unsets the "OverseasVisitorStatusClassificationAtCDSActivityDate" element
     */
    public void unsetOverseasVisitorStatusClassificationAtCDSActivityDate()
    {
        synchronized (monitor())
        {
            check_orphaned();
            get_store().remove_element(OVERSEASVISITORSTATUSCLASSIFICATIONATCDSACTIVITYDATE$0, 0);
        }
    }
}
