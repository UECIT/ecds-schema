/*
 * XML Type:  AttendanceLocationGroup_Structure
 * Namespace: http://www.nhsia.nhs.uk/DataStandards/XMLschema/CDS/ns
 * Java type: uk.nhs.nhsia.datastandards.ecds.AttendanceLocationGroupStructure
 *
 * Automatically generated - do not modify.
 */
package uk.nhs.nhsia.datastandards.ecds.impl;
/**
 * An XML AttendanceLocationGroup_Structure(@http://www.nhsia.nhs.uk/DataStandards/XMLschema/CDS/ns).
 *
 * This is a complex type.
 */
public class AttendanceLocationGroupStructureImpl extends org.apache.xmlbeans.impl.values.XmlComplexContentImpl implements uk.nhs.nhsia.datastandards.ecds.AttendanceLocationGroupStructure
{
    private static final long serialVersionUID = 1L;
    
    public AttendanceLocationGroupStructureImpl(org.apache.xmlbeans.SchemaType sType)
    {
        super(sType);
    }
    
    private static final javax.xml.namespace.QName LOCATIONCLASS$0 = 
        new javax.xml.namespace.QName("http://www.nhsia.nhs.uk/DataStandards/XMLschema/CDS/ns", "LocationClass");
    private static final javax.xml.namespace.QName SITECODEOFTREATMENT$2 = 
        new javax.xml.namespace.QName("http://www.nhsia.nhs.uk/DataStandards/XMLschema/CDS/ns", "SiteCodeOfTreatment");
    private static final javax.xml.namespace.QName ACTIVITYLOCATIONTYPE$4 = 
        new javax.xml.namespace.QName("http://www.nhsia.nhs.uk/DataStandards/XMLschema/CDS/ns", "ActivityLocationType");
    private static final javax.xml.namespace.QName CLINICCODE$6 = 
        new javax.xml.namespace.QName("http://www.nhsia.nhs.uk/DataStandards/XMLschema/CDS/ns", "ClinicCode");
    
    
    /**
     * Gets the "LocationClass" element
     */
    public uk.nhs.nhsia.datastandards.ecds.LocationClassType.Enum getLocationClass()
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.SimpleValue target = null;
            target = (org.apache.xmlbeans.SimpleValue)get_store().find_element_user(LOCATIONCLASS$0, 0);
            if (target == null)
            {
                return null;
            }
            return (uk.nhs.nhsia.datastandards.ecds.LocationClassType.Enum)target.getEnumValue();
        }
    }
    
    /**
     * Gets (as xml) the "LocationClass" element
     */
    public uk.nhs.nhsia.datastandards.ecds.LocationClassType xgetLocationClass()
    {
        synchronized (monitor())
        {
            check_orphaned();
            uk.nhs.nhsia.datastandards.ecds.LocationClassType target = null;
            target = (uk.nhs.nhsia.datastandards.ecds.LocationClassType)get_store().find_element_user(LOCATIONCLASS$0, 0);
            return target;
        }
    }
    
    /**
     * True if has "LocationClass" element
     */
    public boolean isSetLocationClass()
    {
        synchronized (monitor())
        {
            check_orphaned();
            return get_store().count_elements(LOCATIONCLASS$0) != 0;
        }
    }
    
    /**
     * Sets the "LocationClass" element
     */
    public void setLocationClass(uk.nhs.nhsia.datastandards.ecds.LocationClassType.Enum locationClass)
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.SimpleValue target = null;
            target = (org.apache.xmlbeans.SimpleValue)get_store().find_element_user(LOCATIONCLASS$0, 0);
            if (target == null)
            {
                target = (org.apache.xmlbeans.SimpleValue)get_store().add_element_user(LOCATIONCLASS$0);
            }
            target.setEnumValue(locationClass);
        }
    }
    
    /**
     * Sets (as xml) the "LocationClass" element
     */
    public void xsetLocationClass(uk.nhs.nhsia.datastandards.ecds.LocationClassType locationClass)
    {
        synchronized (monitor())
        {
            check_orphaned();
            uk.nhs.nhsia.datastandards.ecds.LocationClassType target = null;
            target = (uk.nhs.nhsia.datastandards.ecds.LocationClassType)get_store().find_element_user(LOCATIONCLASS$0, 0);
            if (target == null)
            {
                target = (uk.nhs.nhsia.datastandards.ecds.LocationClassType)get_store().add_element_user(LOCATIONCLASS$0);
            }
            target.set(locationClass);
        }
    }
    
    /**
     * Unsets the "LocationClass" element
     */
    public void unsetLocationClass()
    {
        synchronized (monitor())
        {
            check_orphaned();
            get_store().remove_element(LOCATIONCLASS$0, 0);
        }
    }
    
    /**
     * Gets the "SiteCodeOfTreatment" element
     */
    public java.lang.String getSiteCodeOfTreatment()
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.SimpleValue target = null;
            target = (org.apache.xmlbeans.SimpleValue)get_store().find_element_user(SITECODEOFTREATMENT$2, 0);
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
            target = (uk.nhs.nhsia.datastandards.ecds.SiteCodeOfTreatmentType)get_store().find_element_user(SITECODEOFTREATMENT$2, 0);
            return target;
        }
    }
    
    /**
     * True if has "SiteCodeOfTreatment" element
     */
    public boolean isSetSiteCodeOfTreatment()
    {
        synchronized (monitor())
        {
            check_orphaned();
            return get_store().count_elements(SITECODEOFTREATMENT$2) != 0;
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
            target = (org.apache.xmlbeans.SimpleValue)get_store().find_element_user(SITECODEOFTREATMENT$2, 0);
            if (target == null)
            {
                target = (org.apache.xmlbeans.SimpleValue)get_store().add_element_user(SITECODEOFTREATMENT$2);
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
            target = (uk.nhs.nhsia.datastandards.ecds.SiteCodeOfTreatmentType)get_store().find_element_user(SITECODEOFTREATMENT$2, 0);
            if (target == null)
            {
                target = (uk.nhs.nhsia.datastandards.ecds.SiteCodeOfTreatmentType)get_store().add_element_user(SITECODEOFTREATMENT$2);
            }
            target.set(siteCodeOfTreatment);
        }
    }
    
    /**
     * Unsets the "SiteCodeOfTreatment" element
     */
    public void unsetSiteCodeOfTreatment()
    {
        synchronized (monitor())
        {
            check_orphaned();
            get_store().remove_element(SITECODEOFTREATMENT$2, 0);
        }
    }
    
    /**
     * Gets the "ActivityLocationType" element
     */
    public uk.nhs.nhsia.datastandards.ecds.ActivityLocationTypeType.Enum getActivityLocationType()
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.SimpleValue target = null;
            target = (org.apache.xmlbeans.SimpleValue)get_store().find_element_user(ACTIVITYLOCATIONTYPE$4, 0);
            if (target == null)
            {
                return null;
            }
            return (uk.nhs.nhsia.datastandards.ecds.ActivityLocationTypeType.Enum)target.getEnumValue();
        }
    }
    
    /**
     * Gets (as xml) the "ActivityLocationType" element
     */
    public uk.nhs.nhsia.datastandards.ecds.ActivityLocationTypeType xgetActivityLocationType()
    {
        synchronized (monitor())
        {
            check_orphaned();
            uk.nhs.nhsia.datastandards.ecds.ActivityLocationTypeType target = null;
            target = (uk.nhs.nhsia.datastandards.ecds.ActivityLocationTypeType)get_store().find_element_user(ACTIVITYLOCATIONTYPE$4, 0);
            return target;
        }
    }
    
    /**
     * True if has "ActivityLocationType" element
     */
    public boolean isSetActivityLocationType()
    {
        synchronized (monitor())
        {
            check_orphaned();
            return get_store().count_elements(ACTIVITYLOCATIONTYPE$4) != 0;
        }
    }
    
    /**
     * Sets the "ActivityLocationType" element
     */
    public void setActivityLocationType(uk.nhs.nhsia.datastandards.ecds.ActivityLocationTypeType.Enum activityLocationType)
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.SimpleValue target = null;
            target = (org.apache.xmlbeans.SimpleValue)get_store().find_element_user(ACTIVITYLOCATIONTYPE$4, 0);
            if (target == null)
            {
                target = (org.apache.xmlbeans.SimpleValue)get_store().add_element_user(ACTIVITYLOCATIONTYPE$4);
            }
            target.setEnumValue(activityLocationType);
        }
    }
    
    /**
     * Sets (as xml) the "ActivityLocationType" element
     */
    public void xsetActivityLocationType(uk.nhs.nhsia.datastandards.ecds.ActivityLocationTypeType activityLocationType)
    {
        synchronized (monitor())
        {
            check_orphaned();
            uk.nhs.nhsia.datastandards.ecds.ActivityLocationTypeType target = null;
            target = (uk.nhs.nhsia.datastandards.ecds.ActivityLocationTypeType)get_store().find_element_user(ACTIVITYLOCATIONTYPE$4, 0);
            if (target == null)
            {
                target = (uk.nhs.nhsia.datastandards.ecds.ActivityLocationTypeType)get_store().add_element_user(ACTIVITYLOCATIONTYPE$4);
            }
            target.set(activityLocationType);
        }
    }
    
    /**
     * Unsets the "ActivityLocationType" element
     */
    public void unsetActivityLocationType()
    {
        synchronized (monitor())
        {
            check_orphaned();
            get_store().remove_element(ACTIVITYLOCATIONTYPE$4, 0);
        }
    }
    
    /**
     * Gets the "ClinicCode" element
     */
    public java.lang.String getClinicCode()
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.SimpleValue target = null;
            target = (org.apache.xmlbeans.SimpleValue)get_store().find_element_user(CLINICCODE$6, 0);
            if (target == null)
            {
                return null;
            }
            return target.getStringValue();
        }
    }
    
    /**
     * Gets (as xml) the "ClinicCode" element
     */
    public uk.nhs.nhsia.datastandards.ecds.ClinicCodeType xgetClinicCode()
    {
        synchronized (monitor())
        {
            check_orphaned();
            uk.nhs.nhsia.datastandards.ecds.ClinicCodeType target = null;
            target = (uk.nhs.nhsia.datastandards.ecds.ClinicCodeType)get_store().find_element_user(CLINICCODE$6, 0);
            return target;
        }
    }
    
    /**
     * True if has "ClinicCode" element
     */
    public boolean isSetClinicCode()
    {
        synchronized (monitor())
        {
            check_orphaned();
            return get_store().count_elements(CLINICCODE$6) != 0;
        }
    }
    
    /**
     * Sets the "ClinicCode" element
     */
    public void setClinicCode(java.lang.String clinicCode)
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.SimpleValue target = null;
            target = (org.apache.xmlbeans.SimpleValue)get_store().find_element_user(CLINICCODE$6, 0);
            if (target == null)
            {
                target = (org.apache.xmlbeans.SimpleValue)get_store().add_element_user(CLINICCODE$6);
            }
            target.setStringValue(clinicCode);
        }
    }
    
    /**
     * Sets (as xml) the "ClinicCode" element
     */
    public void xsetClinicCode(uk.nhs.nhsia.datastandards.ecds.ClinicCodeType clinicCode)
    {
        synchronized (monitor())
        {
            check_orphaned();
            uk.nhs.nhsia.datastandards.ecds.ClinicCodeType target = null;
            target = (uk.nhs.nhsia.datastandards.ecds.ClinicCodeType)get_store().find_element_user(CLINICCODE$6, 0);
            if (target == null)
            {
                target = (uk.nhs.nhsia.datastandards.ecds.ClinicCodeType)get_store().add_element_user(CLINICCODE$6);
            }
            target.set(clinicCode);
        }
    }
    
    /**
     * Unsets the "ClinicCode" element
     */
    public void unsetClinicCode()
    {
        synchronized (monitor())
        {
            check_orphaned();
            get_store().remove_element(CLINICCODE$6, 0);
        }
    }
}
