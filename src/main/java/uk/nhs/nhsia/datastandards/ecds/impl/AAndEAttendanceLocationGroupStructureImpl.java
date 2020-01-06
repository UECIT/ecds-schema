/*
 * XML Type:  AAndEAttendanceLocationGroup_Structure
 * Namespace: http://www.nhsia.nhs.uk/DataStandards/XMLschema/CDS/ns
 * Java type: uk.nhs.nhsia.datastandards.ecds.AAndEAttendanceLocationGroupStructure
 *
 * Automatically generated - do not modify.
 */
package uk.nhs.nhsia.datastandards.ecds.impl;
/**
 * An XML AAndEAttendanceLocationGroup_Structure(@http://www.nhsia.nhs.uk/DataStandards/XMLschema/CDS/ns).
 *
 * This is a complex type.
 */
public class AAndEAttendanceLocationGroupStructureImpl extends org.apache.xmlbeans.impl.values.XmlComplexContentImpl implements uk.nhs.nhsia.datastandards.ecds.AAndEAttendanceLocationGroupStructure
{
    private static final long serialVersionUID = 1L;
    
    public AAndEAttendanceLocationGroupStructureImpl(org.apache.xmlbeans.SchemaType sType)
    {
        super(sType);
    }
    
    private static final javax.xml.namespace.QName SITECODEOFTREATMENT$0 = 
        new javax.xml.namespace.QName("http://www.nhsia.nhs.uk/DataStandards/XMLschema/CDS/ns", "SiteCodeOfTreatment");
    
    
    /**
     * Gets the "SiteCodeOfTreatment" element
     */
    public java.lang.String getSiteCodeOfTreatment()
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.SimpleValue target = null;
            target = (org.apache.xmlbeans.SimpleValue)get_store().find_element_user(SITECODEOFTREATMENT$0, 0);
            if (target == null)
            {
                return null;
            }
            return target.getStringValue();
        }
    }
    
    /**
     * Gets (as xml) the "SiteCodeOfTreatment" element
     */
    public uk.nhs.nhsia.datastandards.ecds.SiteCodeOfTreatmentType xgetSiteCodeOfTreatment()
    {
        synchronized (monitor())
        {
            check_orphaned();
            uk.nhs.nhsia.datastandards.ecds.SiteCodeOfTreatmentType target = null;
            target = (uk.nhs.nhsia.datastandards.ecds.SiteCodeOfTreatmentType)get_store().find_element_user(SITECODEOFTREATMENT$0, 0);
            return target;
        }
    }
    
    /**
     * Sets the "SiteCodeOfTreatment" element
     */
    public void setSiteCodeOfTreatment(java.lang.String siteCodeOfTreatment)
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.SimpleValue target = null;
            target = (org.apache.xmlbeans.SimpleValue)get_store().find_element_user(SITECODEOFTREATMENT$0, 0);
            if (target == null)
            {
                target = (org.apache.xmlbeans.SimpleValue)get_store().add_element_user(SITECODEOFTREATMENT$0);
            }
            target.setStringValue(siteCodeOfTreatment);
        }
    }
    
    /**
     * Sets (as xml) the "SiteCodeOfTreatment" element
     */
    public void xsetSiteCodeOfTreatment(uk.nhs.nhsia.datastandards.ecds.SiteCodeOfTreatmentType siteCodeOfTreatment)
    {
        synchronized (monitor())
        {
            check_orphaned();
            uk.nhs.nhsia.datastandards.ecds.SiteCodeOfTreatmentType target = null;
            target = (uk.nhs.nhsia.datastandards.ecds.SiteCodeOfTreatmentType)get_store().find_element_user(SITECODEOFTREATMENT$0, 0);
            if (target == null)
            {
                target = (uk.nhs.nhsia.datastandards.ecds.SiteCodeOfTreatmentType)get_store().add_element_user(SITECODEOFTREATMENT$0);
            }
            target.set(siteCodeOfTreatment);
        }
    }
}
