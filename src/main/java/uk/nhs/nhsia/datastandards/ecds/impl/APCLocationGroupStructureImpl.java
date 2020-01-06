/*
 * XML Type:  APCLocationGroup_Structure
 * Namespace: http://www.nhsia.nhs.uk/DataStandards/XMLschema/CDS/ns
 * Java type: uk.nhs.nhsia.datastandards.ecds.APCLocationGroupStructure
 *
 * Automatically generated - do not modify.
 */
package uk.nhs.nhsia.datastandards.ecds.impl;
/**
 * An XML APCLocationGroup_Structure(@http://www.nhsia.nhs.uk/DataStandards/XMLschema/CDS/ns).
 *
 * This is a complex type.
 */
public class APCLocationGroupStructureImpl extends org.apache.xmlbeans.impl.values.XmlComplexContentImpl implements uk.nhs.nhsia.datastandards.ecds.APCLocationGroupStructure
{
    private static final long serialVersionUID = 1L;
    
    public APCLocationGroupStructureImpl(org.apache.xmlbeans.SchemaType sType)
    {
        super(sType);
    }
    
    private static final javax.xml.namespace.QName STARTOFEPISODE$0 = 
        new javax.xml.namespace.QName("http://www.nhsia.nhs.uk/DataStandards/XMLschema/CDS/ns", "StartOfEpisode");
    private static final javax.xml.namespace.QName WARDSTAY$2 = 
        new javax.xml.namespace.QName("http://www.nhsia.nhs.uk/DataStandards/XMLschema/CDS/ns", "WardStay");
    private static final javax.xml.namespace.QName ENDOFEPISODE$4 = 
        new javax.xml.namespace.QName("http://www.nhsia.nhs.uk/DataStandards/XMLschema/CDS/ns", "EndOfEpisode");
    
    
    /**
     * Gets the "StartOfEpisode" element
     */
    public uk.nhs.nhsia.datastandards.ecds.APCLocationGroupStructure.StartOfEpisode getStartOfEpisode()
    {
        synchronized (monitor())
        {
            check_orphaned();
            uk.nhs.nhsia.datastandards.ecds.APCLocationGroupStructure.StartOfEpisode target = null;
            target = (uk.nhs.nhsia.datastandards.ecds.APCLocationGroupStructure.StartOfEpisode)get_store().find_element_user(STARTOFEPISODE$0, 0);
            if (target == null)
            {
                return null;
            }
            return target;
        }
    }
    
    /**
     * True if has "StartOfEpisode" element
     */
    public boolean isSetStartOfEpisode()
    {
        synchronized (monitor())
        {
            check_orphaned();
            return get_store().count_elements(STARTOFEPISODE$0) != 0;
        }
    }
    
    /**
     * Sets the "StartOfEpisode" element
     */
    public void setStartOfEpisode(uk.nhs.nhsia.datastandards.ecds.APCLocationGroupStructure.StartOfEpisode startOfEpisode)
    {
        generatedSetterHelperImpl(startOfEpisode, STARTOFEPISODE$0, 0, org.apache.xmlbeans.impl.values.XmlObjectBase.KIND_SETTERHELPER_SINGLETON);
    }
    
    /**
     * Appends and returns a new empty "StartOfEpisode" element
     */
    public uk.nhs.nhsia.datastandards.ecds.APCLocationGroupStructure.StartOfEpisode addNewStartOfEpisode()
    {
        synchronized (monitor())
        {
            check_orphaned();
            uk.nhs.nhsia.datastandards.ecds.APCLocationGroupStructure.StartOfEpisode target = null;
            target = (uk.nhs.nhsia.datastandards.ecds.APCLocationGroupStructure.StartOfEpisode)get_store().add_element_user(STARTOFEPISODE$0);
            return target;
        }
    }
    
    /**
     * Unsets the "StartOfEpisode" element
     */
    public void unsetStartOfEpisode()
    {
        synchronized (monitor())
        {
            check_orphaned();
            get_store().remove_element(STARTOFEPISODE$0, 0);
        }
    }
    
    /**
     * Gets array of all "WardStay" elements
     */
    public uk.nhs.nhsia.datastandards.ecds.APCLocationGroupStructure.WardStay[] getWardStayArray()
    {
        synchronized (monitor())
        {
            check_orphaned();
            java.util.List targetList = new java.util.ArrayList();
            get_store().find_all_element_users(WARDSTAY$2, targetList);
            uk.nhs.nhsia.datastandards.ecds.APCLocationGroupStructure.WardStay[] result = new uk.nhs.nhsia.datastandards.ecds.APCLocationGroupStructure.WardStay[targetList.size()];
            targetList.toArray(result);
            return result;
        }
    }
    
    /**
     * Gets ith "WardStay" element
     */
    public uk.nhs.nhsia.datastandards.ecds.APCLocationGroupStructure.WardStay getWardStayArray(int i)
    {
        synchronized (monitor())
        {
            check_orphaned();
            uk.nhs.nhsia.datastandards.ecds.APCLocationGroupStructure.WardStay target = null;
            target = (uk.nhs.nhsia.datastandards.ecds.APCLocationGroupStructure.WardStay)get_store().find_element_user(WARDSTAY$2, i);
            if (target == null)
            {
                throw new IndexOutOfBoundsException();
            }
            return target;
        }
    }
    
    /**
     * Returns number of "WardStay" element
     */
    public int sizeOfWardStayArray()
    {
        synchronized (monitor())
        {
            check_orphaned();
            return get_store().count_elements(WARDSTAY$2);
        }
    }
    
    /**
     * Sets array of all "WardStay" element  WARNING: This method is not atomicaly synchronized.
     */
    public void setWardStayArray(uk.nhs.nhsia.datastandards.ecds.APCLocationGroupStructure.WardStay[] wardStayArray)
    {
        check_orphaned();
        arraySetterHelper(wardStayArray, WARDSTAY$2);
    }
    
    /**
     * Sets ith "WardStay" element
     */
    public void setWardStayArray(int i, uk.nhs.nhsia.datastandards.ecds.APCLocationGroupStructure.WardStay wardStay)
    {
        generatedSetterHelperImpl(wardStay, WARDSTAY$2, i, org.apache.xmlbeans.impl.values.XmlObjectBase.KIND_SETTERHELPER_ARRAYITEM);
    }
    
    /**
     * Inserts and returns a new empty value (as xml) as the ith "WardStay" element
     */
    public uk.nhs.nhsia.datastandards.ecds.APCLocationGroupStructure.WardStay insertNewWardStay(int i)
    {
        synchronized (monitor())
        {
            check_orphaned();
            uk.nhs.nhsia.datastandards.ecds.APCLocationGroupStructure.WardStay target = null;
            target = (uk.nhs.nhsia.datastandards.ecds.APCLocationGroupStructure.WardStay)get_store().insert_element_user(WARDSTAY$2, i);
            return target;
        }
    }
    
    /**
     * Appends and returns a new empty value (as xml) as the last "WardStay" element
     */
    public uk.nhs.nhsia.datastandards.ecds.APCLocationGroupStructure.WardStay addNewWardStay()
    {
        synchronized (monitor())
        {
            check_orphaned();
            uk.nhs.nhsia.datastandards.ecds.APCLocationGroupStructure.WardStay target = null;
            target = (uk.nhs.nhsia.datastandards.ecds.APCLocationGroupStructure.WardStay)get_store().add_element_user(WARDSTAY$2);
            return target;
        }
    }
    
    /**
     * Removes the ith "WardStay" element
     */
    public void removeWardStay(int i)
    {
        synchronized (monitor())
        {
            check_orphaned();
            get_store().remove_element(WARDSTAY$2, i);
        }
    }
    
    /**
     * Gets the "EndOfEpisode" element
     */
    public uk.nhs.nhsia.datastandards.ecds.APCLocationGroupStructure.EndOfEpisode getEndOfEpisode()
    {
        synchronized (monitor())
        {
            check_orphaned();
            uk.nhs.nhsia.datastandards.ecds.APCLocationGroupStructure.EndOfEpisode target = null;
            target = (uk.nhs.nhsia.datastandards.ecds.APCLocationGroupStructure.EndOfEpisode)get_store().find_element_user(ENDOFEPISODE$4, 0);
            if (target == null)
            {
                return null;
            }
            return target;
        }
    }
    
    /**
     * True if has "EndOfEpisode" element
     */
    public boolean isSetEndOfEpisode()
    {
        synchronized (monitor())
        {
            check_orphaned();
            return get_store().count_elements(ENDOFEPISODE$4) != 0;
        }
    }
    
    /**
     * Sets the "EndOfEpisode" element
     */
    public void setEndOfEpisode(uk.nhs.nhsia.datastandards.ecds.APCLocationGroupStructure.EndOfEpisode endOfEpisode)
    {
        generatedSetterHelperImpl(endOfEpisode, ENDOFEPISODE$4, 0, org.apache.xmlbeans.impl.values.XmlObjectBase.KIND_SETTERHELPER_SINGLETON);
    }
    
    /**
     * Appends and returns a new empty "EndOfEpisode" element
     */
    public uk.nhs.nhsia.datastandards.ecds.APCLocationGroupStructure.EndOfEpisode addNewEndOfEpisode()
    {
        synchronized (monitor())
        {
            check_orphaned();
            uk.nhs.nhsia.datastandards.ecds.APCLocationGroupStructure.EndOfEpisode target = null;
            target = (uk.nhs.nhsia.datastandards.ecds.APCLocationGroupStructure.EndOfEpisode)get_store().add_element_user(ENDOFEPISODE$4);
            return target;
        }
    }
    
    /**
     * Unsets the "EndOfEpisode" element
     */
    public void unsetEndOfEpisode()
    {
        synchronized (monitor())
        {
            check_orphaned();
            get_store().remove_element(ENDOFEPISODE$4, 0);
        }
    }
    /**
     * An XML StartOfEpisode(@http://www.nhsia.nhs.uk/DataStandards/XMLschema/CDS/ns).
     *
     * This is a complex type.
     */
    public static class StartOfEpisodeImpl extends org.apache.xmlbeans.impl.values.XmlComplexContentImpl implements uk.nhs.nhsia.datastandards.ecds.APCLocationGroupStructure.StartOfEpisode
    {
        private static final long serialVersionUID = 1L;
        
        public StartOfEpisodeImpl(org.apache.xmlbeans.SchemaType sType)
        {
            super(sType);
        }
        
        private static final javax.xml.namespace.QName LOCATIONCLASS$0 = 
            new javax.xml.namespace.QName("http://www.nhsia.nhs.uk/DataStandards/XMLschema/CDS/ns", "LocationClass");
        private static final javax.xml.namespace.QName SITECODEOFTREATMENT$2 = 
            new javax.xml.namespace.QName("http://www.nhsia.nhs.uk/DataStandards/XMLschema/CDS/ns", "SiteCodeOfTreatment");
        private static final javax.xml.namespace.QName ACTIVITYLOCATIONTYPE$4 = 
            new javax.xml.namespace.QName("http://www.nhsia.nhs.uk/DataStandards/XMLschema/CDS/ns", "ActivityLocationType");
        private static final javax.xml.namespace.QName INTENDEDCLINICALCAREINTENSITYCODE$6 = 
            new javax.xml.namespace.QName("http://www.nhsia.nhs.uk/DataStandards/XMLschema/CDS/ns", "IntendedClinicalCareIntensityCode");
        private static final javax.xml.namespace.QName INTENDEDAGEGROUP$8 = 
            new javax.xml.namespace.QName("http://www.nhsia.nhs.uk/DataStandards/XMLschema/CDS/ns", "IntendedAgeGroup");
        private static final javax.xml.namespace.QName SEXOFPATIENTSCODE$10 = 
            new javax.xml.namespace.QName("http://www.nhsia.nhs.uk/DataStandards/XMLschema/CDS/ns", "SexOfPatientsCode");
        private static final javax.xml.namespace.QName WARDDAYPERIODAVAILABILITYCODE$12 = 
            new javax.xml.namespace.QName("http://www.nhsia.nhs.uk/DataStandards/XMLschema/CDS/ns", "WardDayPeriodAvailabilityCode");
        private static final javax.xml.namespace.QName WARDNIGHTPERIODAVAILABILITYCODE$14 = 
            new javax.xml.namespace.QName("http://www.nhsia.nhs.uk/DataStandards/XMLschema/CDS/ns", "WardNightPeriodAvailabilityCode");
        private static final javax.xml.namespace.QName WARDSECURITYLEVEL$16 = 
            new javax.xml.namespace.QName("http://www.nhsia.nhs.uk/DataStandards/XMLschema/CDS/ns", "WardSecurityLevel");
        private static final javax.xml.namespace.QName WARDCODE$18 = 
            new javax.xml.namespace.QName("http://www.nhsia.nhs.uk/DataStandards/XMLschema/CDS/ns", "WardCode");
        
        
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
         * Gets the "IntendedClinicalCareIntensityCode" element
         */
        public uk.nhs.nhsia.datastandards.ecds.IntendedClinicalCareIntensityCodeType.Enum getIntendedClinicalCareIntensityCode()
        {
            synchronized (monitor())
            {
                check_orphaned();
                org.apache.xmlbeans.SimpleValue target = null;
                target = (org.apache.xmlbeans.SimpleValue)get_store().find_element_user(INTENDEDCLINICALCAREINTENSITYCODE$6, 0);
                if (target == null)
                {
                    return null;
                }
                return (uk.nhs.nhsia.datastandards.ecds.IntendedClinicalCareIntensityCodeType.Enum)target.getEnumValue();
            }
        }
        
        /**
         * Gets (as xml) the "IntendedClinicalCareIntensityCode" element
         */
        public uk.nhs.nhsia.datastandards.ecds.IntendedClinicalCareIntensityCodeType xgetIntendedClinicalCareIntensityCode()
        {
            synchronized (monitor())
            {
                check_orphaned();
                uk.nhs.nhsia.datastandards.ecds.IntendedClinicalCareIntensityCodeType target = null;
                target = (uk.nhs.nhsia.datastandards.ecds.IntendedClinicalCareIntensityCodeType)get_store().find_element_user(INTENDEDCLINICALCAREINTENSITYCODE$6, 0);
                return target;
            }
        }
        
        /**
         * True if has "IntendedClinicalCareIntensityCode" element
         */
        public boolean isSetIntendedClinicalCareIntensityCode()
        {
            synchronized (monitor())
            {
                check_orphaned();
                return get_store().count_elements(INTENDEDCLINICALCAREINTENSITYCODE$6) != 0;
            }
        }
        
        /**
         * Sets the "IntendedClinicalCareIntensityCode" element
         */
        public void setIntendedClinicalCareIntensityCode(uk.nhs.nhsia.datastandards.ecds.IntendedClinicalCareIntensityCodeType.Enum intendedClinicalCareIntensityCode)
        {
            synchronized (monitor())
            {
                check_orphaned();
                org.apache.xmlbeans.SimpleValue target = null;
                target = (org.apache.xmlbeans.SimpleValue)get_store().find_element_user(INTENDEDCLINICALCAREINTENSITYCODE$6, 0);
                if (target == null)
                {
                    target = (org.apache.xmlbeans.SimpleValue)get_store().add_element_user(INTENDEDCLINICALCAREINTENSITYCODE$6);
                }
                target.setEnumValue(intendedClinicalCareIntensityCode);
            }
        }
        
        /**
         * Sets (as xml) the "IntendedClinicalCareIntensityCode" element
         */
        public void xsetIntendedClinicalCareIntensityCode(uk.nhs.nhsia.datastandards.ecds.IntendedClinicalCareIntensityCodeType intendedClinicalCareIntensityCode)
        {
            synchronized (monitor())
            {
                check_orphaned();
                uk.nhs.nhsia.datastandards.ecds.IntendedClinicalCareIntensityCodeType target = null;
                target = (uk.nhs.nhsia.datastandards.ecds.IntendedClinicalCareIntensityCodeType)get_store().find_element_user(INTENDEDCLINICALCAREINTENSITYCODE$6, 0);
                if (target == null)
                {
                    target = (uk.nhs.nhsia.datastandards.ecds.IntendedClinicalCareIntensityCodeType)get_store().add_element_user(INTENDEDCLINICALCAREINTENSITYCODE$6);
                }
                target.set(intendedClinicalCareIntensityCode);
            }
        }
        
        /**
         * Unsets the "IntendedClinicalCareIntensityCode" element
         */
        public void unsetIntendedClinicalCareIntensityCode()
        {
            synchronized (monitor())
            {
                check_orphaned();
                get_store().remove_element(INTENDEDCLINICALCAREINTENSITYCODE$6, 0);
            }
        }
        
        /**
         * Gets the "IntendedAgeGroup" element
         */
        public uk.nhs.nhsia.datastandards.ecds.IntendedAgeGroupType.Enum getIntendedAgeGroup()
        {
            synchronized (monitor())
            {
                check_orphaned();
                org.apache.xmlbeans.SimpleValue target = null;
                target = (org.apache.xmlbeans.SimpleValue)get_store().find_element_user(INTENDEDAGEGROUP$8, 0);
                if (target == null)
                {
                    return null;
                }
                return (uk.nhs.nhsia.datastandards.ecds.IntendedAgeGroupType.Enum)target.getEnumValue();
            }
        }
        
        /**
         * Gets (as xml) the "IntendedAgeGroup" element
         */
        public uk.nhs.nhsia.datastandards.ecds.IntendedAgeGroupType xgetIntendedAgeGroup()
        {
            synchronized (monitor())
            {
                check_orphaned();
                uk.nhs.nhsia.datastandards.ecds.IntendedAgeGroupType target = null;
                target = (uk.nhs.nhsia.datastandards.ecds.IntendedAgeGroupType)get_store().find_element_user(INTENDEDAGEGROUP$8, 0);
                return target;
            }
        }
        
        /**
         * True if has "IntendedAgeGroup" element
         */
        public boolean isSetIntendedAgeGroup()
        {
            synchronized (monitor())
            {
                check_orphaned();
                return get_store().count_elements(INTENDEDAGEGROUP$8) != 0;
            }
        }
        
        /**
         * Sets the "IntendedAgeGroup" element
         */
        public void setIntendedAgeGroup(uk.nhs.nhsia.datastandards.ecds.IntendedAgeGroupType.Enum intendedAgeGroup)
        {
            synchronized (monitor())
            {
                check_orphaned();
                org.apache.xmlbeans.SimpleValue target = null;
                target = (org.apache.xmlbeans.SimpleValue)get_store().find_element_user(INTENDEDAGEGROUP$8, 0);
                if (target == null)
                {
                    target = (org.apache.xmlbeans.SimpleValue)get_store().add_element_user(INTENDEDAGEGROUP$8);
                }
                target.setEnumValue(intendedAgeGroup);
            }
        }
        
        /**
         * Sets (as xml) the "IntendedAgeGroup" element
         */
        public void xsetIntendedAgeGroup(uk.nhs.nhsia.datastandards.ecds.IntendedAgeGroupType intendedAgeGroup)
        {
            synchronized (monitor())
            {
                check_orphaned();
                uk.nhs.nhsia.datastandards.ecds.IntendedAgeGroupType target = null;
                target = (uk.nhs.nhsia.datastandards.ecds.IntendedAgeGroupType)get_store().find_element_user(INTENDEDAGEGROUP$8, 0);
                if (target == null)
                {
                    target = (uk.nhs.nhsia.datastandards.ecds.IntendedAgeGroupType)get_store().add_element_user(INTENDEDAGEGROUP$8);
                }
                target.set(intendedAgeGroup);
            }
        }
        
        /**
         * Unsets the "IntendedAgeGroup" element
         */
        public void unsetIntendedAgeGroup()
        {
            synchronized (monitor())
            {
                check_orphaned();
                get_store().remove_element(INTENDEDAGEGROUP$8, 0);
            }
        }
        
        /**
         * Gets the "SexOfPatientsCode" element
         */
        public uk.nhs.nhsia.datastandards.ecds.SexOfPatientsCodeType.Enum getSexOfPatientsCode()
        {
            synchronized (monitor())
            {
                check_orphaned();
                org.apache.xmlbeans.SimpleValue target = null;
                target = (org.apache.xmlbeans.SimpleValue)get_store().find_element_user(SEXOFPATIENTSCODE$10, 0);
                if (target == null)
                {
                    return null;
                }
                return (uk.nhs.nhsia.datastandards.ecds.SexOfPatientsCodeType.Enum)target.getEnumValue();
            }
        }
        
        /**
         * Gets (as xml) the "SexOfPatientsCode" element
         */
        public uk.nhs.nhsia.datastandards.ecds.SexOfPatientsCodeType xgetSexOfPatientsCode()
        {
            synchronized (monitor())
            {
                check_orphaned();
                uk.nhs.nhsia.datastandards.ecds.SexOfPatientsCodeType target = null;
                target = (uk.nhs.nhsia.datastandards.ecds.SexOfPatientsCodeType)get_store().find_element_user(SEXOFPATIENTSCODE$10, 0);
                return target;
            }
        }
        
        /**
         * True if has "SexOfPatientsCode" element
         */
        public boolean isSetSexOfPatientsCode()
        {
            synchronized (monitor())
            {
                check_orphaned();
                return get_store().count_elements(SEXOFPATIENTSCODE$10) != 0;
            }
        }
        
        /**
         * Sets the "SexOfPatientsCode" element
         */
        public void setSexOfPatientsCode(uk.nhs.nhsia.datastandards.ecds.SexOfPatientsCodeType.Enum sexOfPatientsCode)
        {
            synchronized (monitor())
            {
                check_orphaned();
                org.apache.xmlbeans.SimpleValue target = null;
                target = (org.apache.xmlbeans.SimpleValue)get_store().find_element_user(SEXOFPATIENTSCODE$10, 0);
                if (target == null)
                {
                    target = (org.apache.xmlbeans.SimpleValue)get_store().add_element_user(SEXOFPATIENTSCODE$10);
                }
                target.setEnumValue(sexOfPatientsCode);
            }
        }
        
        /**
         * Sets (as xml) the "SexOfPatientsCode" element
         */
        public void xsetSexOfPatientsCode(uk.nhs.nhsia.datastandards.ecds.SexOfPatientsCodeType sexOfPatientsCode)
        {
            synchronized (monitor())
            {
                check_orphaned();
                uk.nhs.nhsia.datastandards.ecds.SexOfPatientsCodeType target = null;
                target = (uk.nhs.nhsia.datastandards.ecds.SexOfPatientsCodeType)get_store().find_element_user(SEXOFPATIENTSCODE$10, 0);
                if (target == null)
                {
                    target = (uk.nhs.nhsia.datastandards.ecds.SexOfPatientsCodeType)get_store().add_element_user(SEXOFPATIENTSCODE$10);
                }
                target.set(sexOfPatientsCode);
            }
        }
        
        /**
         * Unsets the "SexOfPatientsCode" element
         */
        public void unsetSexOfPatientsCode()
        {
            synchronized (monitor())
            {
                check_orphaned();
                get_store().remove_element(SEXOFPATIENTSCODE$10, 0);
            }
        }
        
        /**
         * Gets the "WardDayPeriodAvailabilityCode" element
         */
        public uk.nhs.nhsia.datastandards.ecds.WardDayPeriodAvailabilityCodeType.Enum getWardDayPeriodAvailabilityCode()
        {
            synchronized (monitor())
            {
                check_orphaned();
                org.apache.xmlbeans.SimpleValue target = null;
                target = (org.apache.xmlbeans.SimpleValue)get_store().find_element_user(WARDDAYPERIODAVAILABILITYCODE$12, 0);
                if (target == null)
                {
                    return null;
                }
                return (uk.nhs.nhsia.datastandards.ecds.WardDayPeriodAvailabilityCodeType.Enum)target.getEnumValue();
            }
        }
        
        /**
         * Gets (as xml) the "WardDayPeriodAvailabilityCode" element
         */
        public uk.nhs.nhsia.datastandards.ecds.WardDayPeriodAvailabilityCodeType xgetWardDayPeriodAvailabilityCode()
        {
            synchronized (monitor())
            {
                check_orphaned();
                uk.nhs.nhsia.datastandards.ecds.WardDayPeriodAvailabilityCodeType target = null;
                target = (uk.nhs.nhsia.datastandards.ecds.WardDayPeriodAvailabilityCodeType)get_store().find_element_user(WARDDAYPERIODAVAILABILITYCODE$12, 0);
                return target;
            }
        }
        
        /**
         * True if has "WardDayPeriodAvailabilityCode" element
         */
        public boolean isSetWardDayPeriodAvailabilityCode()
        {
            synchronized (monitor())
            {
                check_orphaned();
                return get_store().count_elements(WARDDAYPERIODAVAILABILITYCODE$12) != 0;
            }
        }
        
        /**
         * Sets the "WardDayPeriodAvailabilityCode" element
         */
        public void setWardDayPeriodAvailabilityCode(uk.nhs.nhsia.datastandards.ecds.WardDayPeriodAvailabilityCodeType.Enum wardDayPeriodAvailabilityCode)
        {
            synchronized (monitor())
            {
                check_orphaned();
                org.apache.xmlbeans.SimpleValue target = null;
                target = (org.apache.xmlbeans.SimpleValue)get_store().find_element_user(WARDDAYPERIODAVAILABILITYCODE$12, 0);
                if (target == null)
                {
                    target = (org.apache.xmlbeans.SimpleValue)get_store().add_element_user(WARDDAYPERIODAVAILABILITYCODE$12);
                }
                target.setEnumValue(wardDayPeriodAvailabilityCode);
            }
        }
        
        /**
         * Sets (as xml) the "WardDayPeriodAvailabilityCode" element
         */
        public void xsetWardDayPeriodAvailabilityCode(uk.nhs.nhsia.datastandards.ecds.WardDayPeriodAvailabilityCodeType wardDayPeriodAvailabilityCode)
        {
            synchronized (monitor())
            {
                check_orphaned();
                uk.nhs.nhsia.datastandards.ecds.WardDayPeriodAvailabilityCodeType target = null;
                target = (uk.nhs.nhsia.datastandards.ecds.WardDayPeriodAvailabilityCodeType)get_store().find_element_user(WARDDAYPERIODAVAILABILITYCODE$12, 0);
                if (target == null)
                {
                    target = (uk.nhs.nhsia.datastandards.ecds.WardDayPeriodAvailabilityCodeType)get_store().add_element_user(WARDDAYPERIODAVAILABILITYCODE$12);
                }
                target.set(wardDayPeriodAvailabilityCode);
            }
        }
        
        /**
         * Unsets the "WardDayPeriodAvailabilityCode" element
         */
        public void unsetWardDayPeriodAvailabilityCode()
        {
            synchronized (monitor())
            {
                check_orphaned();
                get_store().remove_element(WARDDAYPERIODAVAILABILITYCODE$12, 0);
            }
        }
        
        /**
         * Gets the "WardNightPeriodAvailabilityCode" element
         */
        public uk.nhs.nhsia.datastandards.ecds.WardNightPeriodAvailabilityCodeType.Enum getWardNightPeriodAvailabilityCode()
        {
            synchronized (monitor())
            {
                check_orphaned();
                org.apache.xmlbeans.SimpleValue target = null;
                target = (org.apache.xmlbeans.SimpleValue)get_store().find_element_user(WARDNIGHTPERIODAVAILABILITYCODE$14, 0);
                if (target == null)
                {
                    return null;
                }
                return (uk.nhs.nhsia.datastandards.ecds.WardNightPeriodAvailabilityCodeType.Enum)target.getEnumValue();
            }
        }
        
        /**
         * Gets (as xml) the "WardNightPeriodAvailabilityCode" element
         */
        public uk.nhs.nhsia.datastandards.ecds.WardNightPeriodAvailabilityCodeType xgetWardNightPeriodAvailabilityCode()
        {
            synchronized (monitor())
            {
                check_orphaned();
                uk.nhs.nhsia.datastandards.ecds.WardNightPeriodAvailabilityCodeType target = null;
                target = (uk.nhs.nhsia.datastandards.ecds.WardNightPeriodAvailabilityCodeType)get_store().find_element_user(WARDNIGHTPERIODAVAILABILITYCODE$14, 0);
                return target;
            }
        }
        
        /**
         * True if has "WardNightPeriodAvailabilityCode" element
         */
        public boolean isSetWardNightPeriodAvailabilityCode()
        {
            synchronized (monitor())
            {
                check_orphaned();
                return get_store().count_elements(WARDNIGHTPERIODAVAILABILITYCODE$14) != 0;
            }
        }
        
        /**
         * Sets the "WardNightPeriodAvailabilityCode" element
         */
        public void setWardNightPeriodAvailabilityCode(uk.nhs.nhsia.datastandards.ecds.WardNightPeriodAvailabilityCodeType.Enum wardNightPeriodAvailabilityCode)
        {
            synchronized (monitor())
            {
                check_orphaned();
                org.apache.xmlbeans.SimpleValue target = null;
                target = (org.apache.xmlbeans.SimpleValue)get_store().find_element_user(WARDNIGHTPERIODAVAILABILITYCODE$14, 0);
                if (target == null)
                {
                    target = (org.apache.xmlbeans.SimpleValue)get_store().add_element_user(WARDNIGHTPERIODAVAILABILITYCODE$14);
                }
                target.setEnumValue(wardNightPeriodAvailabilityCode);
            }
        }
        
        /**
         * Sets (as xml) the "WardNightPeriodAvailabilityCode" element
         */
        public void xsetWardNightPeriodAvailabilityCode(uk.nhs.nhsia.datastandards.ecds.WardNightPeriodAvailabilityCodeType wardNightPeriodAvailabilityCode)
        {
            synchronized (monitor())
            {
                check_orphaned();
                uk.nhs.nhsia.datastandards.ecds.WardNightPeriodAvailabilityCodeType target = null;
                target = (uk.nhs.nhsia.datastandards.ecds.WardNightPeriodAvailabilityCodeType)get_store().find_element_user(WARDNIGHTPERIODAVAILABILITYCODE$14, 0);
                if (target == null)
                {
                    target = (uk.nhs.nhsia.datastandards.ecds.WardNightPeriodAvailabilityCodeType)get_store().add_element_user(WARDNIGHTPERIODAVAILABILITYCODE$14);
                }
                target.set(wardNightPeriodAvailabilityCode);
            }
        }
        
        /**
         * Unsets the "WardNightPeriodAvailabilityCode" element
         */
        public void unsetWardNightPeriodAvailabilityCode()
        {
            synchronized (monitor())
            {
                check_orphaned();
                get_store().remove_element(WARDNIGHTPERIODAVAILABILITYCODE$14, 0);
            }
        }
        
        /**
         * Gets the "WardSecurityLevel" element
         */
        public uk.nhs.nhsia.datastandards.ecds.WardSecurityLevelType.Enum getWardSecurityLevel()
        {
            synchronized (monitor())
            {
                check_orphaned();
                org.apache.xmlbeans.SimpleValue target = null;
                target = (org.apache.xmlbeans.SimpleValue)get_store().find_element_user(WARDSECURITYLEVEL$16, 0);
                if (target == null)
                {
                    return null;
                }
                return (uk.nhs.nhsia.datastandards.ecds.WardSecurityLevelType.Enum)target.getEnumValue();
            }
        }
        
        /**
         * Gets (as xml) the "WardSecurityLevel" element
         */
        public uk.nhs.nhsia.datastandards.ecds.WardSecurityLevelType xgetWardSecurityLevel()
        {
            synchronized (monitor())
            {
                check_orphaned();
                uk.nhs.nhsia.datastandards.ecds.WardSecurityLevelType target = null;
                target = (uk.nhs.nhsia.datastandards.ecds.WardSecurityLevelType)get_store().find_element_user(WARDSECURITYLEVEL$16, 0);
                return target;
            }
        }
        
        /**
         * True if has "WardSecurityLevel" element
         */
        public boolean isSetWardSecurityLevel()
        {
            synchronized (monitor())
            {
                check_orphaned();
                return get_store().count_elements(WARDSECURITYLEVEL$16) != 0;
            }
        }
        
        /**
         * Sets the "WardSecurityLevel" element
         */
        public void setWardSecurityLevel(uk.nhs.nhsia.datastandards.ecds.WardSecurityLevelType.Enum wardSecurityLevel)
        {
            synchronized (monitor())
            {
                check_orphaned();
                org.apache.xmlbeans.SimpleValue target = null;
                target = (org.apache.xmlbeans.SimpleValue)get_store().find_element_user(WARDSECURITYLEVEL$16, 0);
                if (target == null)
                {
                    target = (org.apache.xmlbeans.SimpleValue)get_store().add_element_user(WARDSECURITYLEVEL$16);
                }
                target.setEnumValue(wardSecurityLevel);
            }
        }
        
        /**
         * Sets (as xml) the "WardSecurityLevel" element
         */
        public void xsetWardSecurityLevel(uk.nhs.nhsia.datastandards.ecds.WardSecurityLevelType wardSecurityLevel)
        {
            synchronized (monitor())
            {
                check_orphaned();
                uk.nhs.nhsia.datastandards.ecds.WardSecurityLevelType target = null;
                target = (uk.nhs.nhsia.datastandards.ecds.WardSecurityLevelType)get_store().find_element_user(WARDSECURITYLEVEL$16, 0);
                if (target == null)
                {
                    target = (uk.nhs.nhsia.datastandards.ecds.WardSecurityLevelType)get_store().add_element_user(WARDSECURITYLEVEL$16);
                }
                target.set(wardSecurityLevel);
            }
        }
        
        /**
         * Unsets the "WardSecurityLevel" element
         */
        public void unsetWardSecurityLevel()
        {
            synchronized (monitor())
            {
                check_orphaned();
                get_store().remove_element(WARDSECURITYLEVEL$16, 0);
            }
        }
        
        /**
         * Gets the "WardCode" element
         */
        public java.lang.String getWardCode()
        {
            synchronized (monitor())
            {
                check_orphaned();
                org.apache.xmlbeans.SimpleValue target = null;
                target = (org.apache.xmlbeans.SimpleValue)get_store().find_element_user(WARDCODE$18, 0);
                if (target == null)
                {
                    return null;
                }
                return target.getStringValue();
            }
        }
        
        /**
         * Gets (as xml) the "WardCode" element
         */
        public uk.nhs.nhsia.datastandards.ecds.WardCodeType xgetWardCode()
        {
            synchronized (monitor())
            {
                check_orphaned();
                uk.nhs.nhsia.datastandards.ecds.WardCodeType target = null;
                target = (uk.nhs.nhsia.datastandards.ecds.WardCodeType)get_store().find_element_user(WARDCODE$18, 0);
                return target;
            }
        }
        
        /**
         * True if has "WardCode" element
         */
        public boolean isSetWardCode()
        {
            synchronized (monitor())
            {
                check_orphaned();
                return get_store().count_elements(WARDCODE$18) != 0;
            }
        }
        
        /**
         * Sets the "WardCode" element
         */
        public void setWardCode(java.lang.String wardCode)
        {
            synchronized (monitor())
            {
                check_orphaned();
                org.apache.xmlbeans.SimpleValue target = null;
                target = (org.apache.xmlbeans.SimpleValue)get_store().find_element_user(WARDCODE$18, 0);
                if (target == null)
                {
                    target = (org.apache.xmlbeans.SimpleValue)get_store().add_element_user(WARDCODE$18);
                }
                target.setStringValue(wardCode);
            }
        }
        
        /**
         * Sets (as xml) the "WardCode" element
         */
        public void xsetWardCode(uk.nhs.nhsia.datastandards.ecds.WardCodeType wardCode)
        {
            synchronized (monitor())
            {
                check_orphaned();
                uk.nhs.nhsia.datastandards.ecds.WardCodeType target = null;
                target = (uk.nhs.nhsia.datastandards.ecds.WardCodeType)get_store().find_element_user(WARDCODE$18, 0);
                if (target == null)
                {
                    target = (uk.nhs.nhsia.datastandards.ecds.WardCodeType)get_store().add_element_user(WARDCODE$18);
                }
                target.set(wardCode);
            }
        }
        
        /**
         * Unsets the "WardCode" element
         */
        public void unsetWardCode()
        {
            synchronized (monitor())
            {
                check_orphaned();
                get_store().remove_element(WARDCODE$18, 0);
            }
        }
    }
    /**
     * An XML WardStay(@http://www.nhsia.nhs.uk/DataStandards/XMLschema/CDS/ns).
     *
     * This is a complex type.
     */
    public static class WardStayImpl extends org.apache.xmlbeans.impl.values.XmlComplexContentImpl implements uk.nhs.nhsia.datastandards.ecds.APCLocationGroupStructure.WardStay
    {
        private static final long serialVersionUID = 1L;
        
        public WardStayImpl(org.apache.xmlbeans.SchemaType sType)
        {
            super(sType);
        }
        
        private static final javax.xml.namespace.QName LOCATIONCLASS$0 = 
            new javax.xml.namespace.QName("http://www.nhsia.nhs.uk/DataStandards/XMLschema/CDS/ns", "LocationClass");
        private static final javax.xml.namespace.QName SITECODEOFTREATMENT$2 = 
            new javax.xml.namespace.QName("http://www.nhsia.nhs.uk/DataStandards/XMLschema/CDS/ns", "SiteCodeOfTreatment");
        private static final javax.xml.namespace.QName ACTIVITYLOCATIONTYPE$4 = 
            new javax.xml.namespace.QName("http://www.nhsia.nhs.uk/DataStandards/XMLschema/CDS/ns", "ActivityLocationType");
        private static final javax.xml.namespace.QName INTENDEDCLINICALCAREINTENSITYCODE$6 = 
            new javax.xml.namespace.QName("http://www.nhsia.nhs.uk/DataStandards/XMLschema/CDS/ns", "IntendedClinicalCareIntensityCode");
        private static final javax.xml.namespace.QName INTENDEDAGEGROUP$8 = 
            new javax.xml.namespace.QName("http://www.nhsia.nhs.uk/DataStandards/XMLschema/CDS/ns", "IntendedAgeGroup");
        private static final javax.xml.namespace.QName SEXOFPATIENTSCODE$10 = 
            new javax.xml.namespace.QName("http://www.nhsia.nhs.uk/DataStandards/XMLschema/CDS/ns", "SexOfPatientsCode");
        private static final javax.xml.namespace.QName WARDDAYPERIODAVAILABILITYCODE$12 = 
            new javax.xml.namespace.QName("http://www.nhsia.nhs.uk/DataStandards/XMLschema/CDS/ns", "WardDayPeriodAvailabilityCode");
        private static final javax.xml.namespace.QName WARDNIGHTPERIODAVAILABILITYCODE$14 = 
            new javax.xml.namespace.QName("http://www.nhsia.nhs.uk/DataStandards/XMLschema/CDS/ns", "WardNightPeriodAvailabilityCode");
        private static final javax.xml.namespace.QName STARTDATE$16 = 
            new javax.xml.namespace.QName("http://www.nhsia.nhs.uk/DataStandards/XMLschema/CDS/ns", "StartDate");
        private static final javax.xml.namespace.QName STARTTIME$18 = 
            new javax.xml.namespace.QName("http://www.nhsia.nhs.uk/DataStandards/XMLschema/CDS/ns", "StartTime");
        private static final javax.xml.namespace.QName ENDDATE$20 = 
            new javax.xml.namespace.QName("http://www.nhsia.nhs.uk/DataStandards/XMLschema/CDS/ns", "EndDate");
        private static final javax.xml.namespace.QName ENDTIME$22 = 
            new javax.xml.namespace.QName("http://www.nhsia.nhs.uk/DataStandards/XMLschema/CDS/ns", "EndTime");
        private static final javax.xml.namespace.QName WARDSECURITYLEVEL$24 = 
            new javax.xml.namespace.QName("http://www.nhsia.nhs.uk/DataStandards/XMLschema/CDS/ns", "WardSecurityLevel");
        private static final javax.xml.namespace.QName WARDCODE$26 = 
            new javax.xml.namespace.QName("http://www.nhsia.nhs.uk/DataStandards/XMLschema/CDS/ns", "WardCode");
        
        
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
         * Gets the "IntendedClinicalCareIntensityCode" element
         */
        public uk.nhs.nhsia.datastandards.ecds.IntendedClinicalCareIntensityCodeType.Enum getIntendedClinicalCareIntensityCode()
        {
            synchronized (monitor())
            {
                check_orphaned();
                org.apache.xmlbeans.SimpleValue target = null;
                target = (org.apache.xmlbeans.SimpleValue)get_store().find_element_user(INTENDEDCLINICALCAREINTENSITYCODE$6, 0);
                if (target == null)
                {
                    return null;
                }
                return (uk.nhs.nhsia.datastandards.ecds.IntendedClinicalCareIntensityCodeType.Enum)target.getEnumValue();
            }
        }
        
        /**
         * Gets (as xml) the "IntendedClinicalCareIntensityCode" element
         */
        public uk.nhs.nhsia.datastandards.ecds.IntendedClinicalCareIntensityCodeType xgetIntendedClinicalCareIntensityCode()
        {
            synchronized (monitor())
            {
                check_orphaned();
                uk.nhs.nhsia.datastandards.ecds.IntendedClinicalCareIntensityCodeType target = null;
                target = (uk.nhs.nhsia.datastandards.ecds.IntendedClinicalCareIntensityCodeType)get_store().find_element_user(INTENDEDCLINICALCAREINTENSITYCODE$6, 0);
                return target;
            }
        }
        
        /**
         * True if has "IntendedClinicalCareIntensityCode" element
         */
        public boolean isSetIntendedClinicalCareIntensityCode()
        {
            synchronized (monitor())
            {
                check_orphaned();
                return get_store().count_elements(INTENDEDCLINICALCAREINTENSITYCODE$6) != 0;
            }
        }
        
        /**
         * Sets the "IntendedClinicalCareIntensityCode" element
         */
        public void setIntendedClinicalCareIntensityCode(uk.nhs.nhsia.datastandards.ecds.IntendedClinicalCareIntensityCodeType.Enum intendedClinicalCareIntensityCode)
        {
            synchronized (monitor())
            {
                check_orphaned();
                org.apache.xmlbeans.SimpleValue target = null;
                target = (org.apache.xmlbeans.SimpleValue)get_store().find_element_user(INTENDEDCLINICALCAREINTENSITYCODE$6, 0);
                if (target == null)
                {
                    target = (org.apache.xmlbeans.SimpleValue)get_store().add_element_user(INTENDEDCLINICALCAREINTENSITYCODE$6);
                }
                target.setEnumValue(intendedClinicalCareIntensityCode);
            }
        }
        
        /**
         * Sets (as xml) the "IntendedClinicalCareIntensityCode" element
         */
        public void xsetIntendedClinicalCareIntensityCode(uk.nhs.nhsia.datastandards.ecds.IntendedClinicalCareIntensityCodeType intendedClinicalCareIntensityCode)
        {
            synchronized (monitor())
            {
                check_orphaned();
                uk.nhs.nhsia.datastandards.ecds.IntendedClinicalCareIntensityCodeType target = null;
                target = (uk.nhs.nhsia.datastandards.ecds.IntendedClinicalCareIntensityCodeType)get_store().find_element_user(INTENDEDCLINICALCAREINTENSITYCODE$6, 0);
                if (target == null)
                {
                    target = (uk.nhs.nhsia.datastandards.ecds.IntendedClinicalCareIntensityCodeType)get_store().add_element_user(INTENDEDCLINICALCAREINTENSITYCODE$6);
                }
                target.set(intendedClinicalCareIntensityCode);
            }
        }
        
        /**
         * Unsets the "IntendedClinicalCareIntensityCode" element
         */
        public void unsetIntendedClinicalCareIntensityCode()
        {
            synchronized (monitor())
            {
                check_orphaned();
                get_store().remove_element(INTENDEDCLINICALCAREINTENSITYCODE$6, 0);
            }
        }
        
        /**
         * Gets the "IntendedAgeGroup" element
         */
        public uk.nhs.nhsia.datastandards.ecds.IntendedAgeGroupType.Enum getIntendedAgeGroup()
        {
            synchronized (monitor())
            {
                check_orphaned();
                org.apache.xmlbeans.SimpleValue target = null;
                target = (org.apache.xmlbeans.SimpleValue)get_store().find_element_user(INTENDEDAGEGROUP$8, 0);
                if (target == null)
                {
                    return null;
                }
                return (uk.nhs.nhsia.datastandards.ecds.IntendedAgeGroupType.Enum)target.getEnumValue();
            }
        }
        
        /**
         * Gets (as xml) the "IntendedAgeGroup" element
         */
        public uk.nhs.nhsia.datastandards.ecds.IntendedAgeGroupType xgetIntendedAgeGroup()
        {
            synchronized (monitor())
            {
                check_orphaned();
                uk.nhs.nhsia.datastandards.ecds.IntendedAgeGroupType target = null;
                target = (uk.nhs.nhsia.datastandards.ecds.IntendedAgeGroupType)get_store().find_element_user(INTENDEDAGEGROUP$8, 0);
                return target;
            }
        }
        
        /**
         * True if has "IntendedAgeGroup" element
         */
        public boolean isSetIntendedAgeGroup()
        {
            synchronized (monitor())
            {
                check_orphaned();
                return get_store().count_elements(INTENDEDAGEGROUP$8) != 0;
            }
        }
        
        /**
         * Sets the "IntendedAgeGroup" element
         */
        public void setIntendedAgeGroup(uk.nhs.nhsia.datastandards.ecds.IntendedAgeGroupType.Enum intendedAgeGroup)
        {
            synchronized (monitor())
            {
                check_orphaned();
                org.apache.xmlbeans.SimpleValue target = null;
                target = (org.apache.xmlbeans.SimpleValue)get_store().find_element_user(INTENDEDAGEGROUP$8, 0);
                if (target == null)
                {
                    target = (org.apache.xmlbeans.SimpleValue)get_store().add_element_user(INTENDEDAGEGROUP$8);
                }
                target.setEnumValue(intendedAgeGroup);
            }
        }
        
        /**
         * Sets (as xml) the "IntendedAgeGroup" element
         */
        public void xsetIntendedAgeGroup(uk.nhs.nhsia.datastandards.ecds.IntendedAgeGroupType intendedAgeGroup)
        {
            synchronized (monitor())
            {
                check_orphaned();
                uk.nhs.nhsia.datastandards.ecds.IntendedAgeGroupType target = null;
                target = (uk.nhs.nhsia.datastandards.ecds.IntendedAgeGroupType)get_store().find_element_user(INTENDEDAGEGROUP$8, 0);
                if (target == null)
                {
                    target = (uk.nhs.nhsia.datastandards.ecds.IntendedAgeGroupType)get_store().add_element_user(INTENDEDAGEGROUP$8);
                }
                target.set(intendedAgeGroup);
            }
        }
        
        /**
         * Unsets the "IntendedAgeGroup" element
         */
        public void unsetIntendedAgeGroup()
        {
            synchronized (monitor())
            {
                check_orphaned();
                get_store().remove_element(INTENDEDAGEGROUP$8, 0);
            }
        }
        
        /**
         * Gets the "SexOfPatientsCode" element
         */
        public uk.nhs.nhsia.datastandards.ecds.SexOfPatientsCodeType.Enum getSexOfPatientsCode()
        {
            synchronized (monitor())
            {
                check_orphaned();
                org.apache.xmlbeans.SimpleValue target = null;
                target = (org.apache.xmlbeans.SimpleValue)get_store().find_element_user(SEXOFPATIENTSCODE$10, 0);
                if (target == null)
                {
                    return null;
                }
                return (uk.nhs.nhsia.datastandards.ecds.SexOfPatientsCodeType.Enum)target.getEnumValue();
            }
        }
        
        /**
         * Gets (as xml) the "SexOfPatientsCode" element
         */
        public uk.nhs.nhsia.datastandards.ecds.SexOfPatientsCodeType xgetSexOfPatientsCode()
        {
            synchronized (monitor())
            {
                check_orphaned();
                uk.nhs.nhsia.datastandards.ecds.SexOfPatientsCodeType target = null;
                target = (uk.nhs.nhsia.datastandards.ecds.SexOfPatientsCodeType)get_store().find_element_user(SEXOFPATIENTSCODE$10, 0);
                return target;
            }
        }
        
        /**
         * True if has "SexOfPatientsCode" element
         */
        public boolean isSetSexOfPatientsCode()
        {
            synchronized (monitor())
            {
                check_orphaned();
                return get_store().count_elements(SEXOFPATIENTSCODE$10) != 0;
            }
        }
        
        /**
         * Sets the "SexOfPatientsCode" element
         */
        public void setSexOfPatientsCode(uk.nhs.nhsia.datastandards.ecds.SexOfPatientsCodeType.Enum sexOfPatientsCode)
        {
            synchronized (monitor())
            {
                check_orphaned();
                org.apache.xmlbeans.SimpleValue target = null;
                target = (org.apache.xmlbeans.SimpleValue)get_store().find_element_user(SEXOFPATIENTSCODE$10, 0);
                if (target == null)
                {
                    target = (org.apache.xmlbeans.SimpleValue)get_store().add_element_user(SEXOFPATIENTSCODE$10);
                }
                target.setEnumValue(sexOfPatientsCode);
            }
        }
        
        /**
         * Sets (as xml) the "SexOfPatientsCode" element
         */
        public void xsetSexOfPatientsCode(uk.nhs.nhsia.datastandards.ecds.SexOfPatientsCodeType sexOfPatientsCode)
        {
            synchronized (monitor())
            {
                check_orphaned();
                uk.nhs.nhsia.datastandards.ecds.SexOfPatientsCodeType target = null;
                target = (uk.nhs.nhsia.datastandards.ecds.SexOfPatientsCodeType)get_store().find_element_user(SEXOFPATIENTSCODE$10, 0);
                if (target == null)
                {
                    target = (uk.nhs.nhsia.datastandards.ecds.SexOfPatientsCodeType)get_store().add_element_user(SEXOFPATIENTSCODE$10);
                }
                target.set(sexOfPatientsCode);
            }
        }
        
        /**
         * Unsets the "SexOfPatientsCode" element
         */
        public void unsetSexOfPatientsCode()
        {
            synchronized (monitor())
            {
                check_orphaned();
                get_store().remove_element(SEXOFPATIENTSCODE$10, 0);
            }
        }
        
        /**
         * Gets the "WardDayPeriodAvailabilityCode" element
         */
        public uk.nhs.nhsia.datastandards.ecds.WardDayPeriodAvailabilityCodeType.Enum getWardDayPeriodAvailabilityCode()
        {
            synchronized (monitor())
            {
                check_orphaned();
                org.apache.xmlbeans.SimpleValue target = null;
                target = (org.apache.xmlbeans.SimpleValue)get_store().find_element_user(WARDDAYPERIODAVAILABILITYCODE$12, 0);
                if (target == null)
                {
                    return null;
                }
                return (uk.nhs.nhsia.datastandards.ecds.WardDayPeriodAvailabilityCodeType.Enum)target.getEnumValue();
            }
        }
        
        /**
         * Gets (as xml) the "WardDayPeriodAvailabilityCode" element
         */
        public uk.nhs.nhsia.datastandards.ecds.WardDayPeriodAvailabilityCodeType xgetWardDayPeriodAvailabilityCode()
        {
            synchronized (monitor())
            {
                check_orphaned();
                uk.nhs.nhsia.datastandards.ecds.WardDayPeriodAvailabilityCodeType target = null;
                target = (uk.nhs.nhsia.datastandards.ecds.WardDayPeriodAvailabilityCodeType)get_store().find_element_user(WARDDAYPERIODAVAILABILITYCODE$12, 0);
                return target;
            }
        }
        
        /**
         * True if has "WardDayPeriodAvailabilityCode" element
         */
        public boolean isSetWardDayPeriodAvailabilityCode()
        {
            synchronized (monitor())
            {
                check_orphaned();
                return get_store().count_elements(WARDDAYPERIODAVAILABILITYCODE$12) != 0;
            }
        }
        
        /**
         * Sets the "WardDayPeriodAvailabilityCode" element
         */
        public void setWardDayPeriodAvailabilityCode(uk.nhs.nhsia.datastandards.ecds.WardDayPeriodAvailabilityCodeType.Enum wardDayPeriodAvailabilityCode)
        {
            synchronized (monitor())
            {
                check_orphaned();
                org.apache.xmlbeans.SimpleValue target = null;
                target = (org.apache.xmlbeans.SimpleValue)get_store().find_element_user(WARDDAYPERIODAVAILABILITYCODE$12, 0);
                if (target == null)
                {
                    target = (org.apache.xmlbeans.SimpleValue)get_store().add_element_user(WARDDAYPERIODAVAILABILITYCODE$12);
                }
                target.setEnumValue(wardDayPeriodAvailabilityCode);
            }
        }
        
        /**
         * Sets (as xml) the "WardDayPeriodAvailabilityCode" element
         */
        public void xsetWardDayPeriodAvailabilityCode(uk.nhs.nhsia.datastandards.ecds.WardDayPeriodAvailabilityCodeType wardDayPeriodAvailabilityCode)
        {
            synchronized (monitor())
            {
                check_orphaned();
                uk.nhs.nhsia.datastandards.ecds.WardDayPeriodAvailabilityCodeType target = null;
                target = (uk.nhs.nhsia.datastandards.ecds.WardDayPeriodAvailabilityCodeType)get_store().find_element_user(WARDDAYPERIODAVAILABILITYCODE$12, 0);
                if (target == null)
                {
                    target = (uk.nhs.nhsia.datastandards.ecds.WardDayPeriodAvailabilityCodeType)get_store().add_element_user(WARDDAYPERIODAVAILABILITYCODE$12);
                }
                target.set(wardDayPeriodAvailabilityCode);
            }
        }
        
        /**
         * Unsets the "WardDayPeriodAvailabilityCode" element
         */
        public void unsetWardDayPeriodAvailabilityCode()
        {
            synchronized (monitor())
            {
                check_orphaned();
                get_store().remove_element(WARDDAYPERIODAVAILABILITYCODE$12, 0);
            }
        }
        
        /**
         * Gets the "WardNightPeriodAvailabilityCode" element
         */
        public uk.nhs.nhsia.datastandards.ecds.WardNightPeriodAvailabilityCodeType.Enum getWardNightPeriodAvailabilityCode()
        {
            synchronized (monitor())
            {
                check_orphaned();
                org.apache.xmlbeans.SimpleValue target = null;
                target = (org.apache.xmlbeans.SimpleValue)get_store().find_element_user(WARDNIGHTPERIODAVAILABILITYCODE$14, 0);
                if (target == null)
                {
                    return null;
                }
                return (uk.nhs.nhsia.datastandards.ecds.WardNightPeriodAvailabilityCodeType.Enum)target.getEnumValue();
            }
        }
        
        /**
         * Gets (as xml) the "WardNightPeriodAvailabilityCode" element
         */
        public uk.nhs.nhsia.datastandards.ecds.WardNightPeriodAvailabilityCodeType xgetWardNightPeriodAvailabilityCode()
        {
            synchronized (monitor())
            {
                check_orphaned();
                uk.nhs.nhsia.datastandards.ecds.WardNightPeriodAvailabilityCodeType target = null;
                target = (uk.nhs.nhsia.datastandards.ecds.WardNightPeriodAvailabilityCodeType)get_store().find_element_user(WARDNIGHTPERIODAVAILABILITYCODE$14, 0);
                return target;
            }
        }
        
        /**
         * True if has "WardNightPeriodAvailabilityCode" element
         */
        public boolean isSetWardNightPeriodAvailabilityCode()
        {
            synchronized (monitor())
            {
                check_orphaned();
                return get_store().count_elements(WARDNIGHTPERIODAVAILABILITYCODE$14) != 0;
            }
        }
        
        /**
         * Sets the "WardNightPeriodAvailabilityCode" element
         */
        public void setWardNightPeriodAvailabilityCode(uk.nhs.nhsia.datastandards.ecds.WardNightPeriodAvailabilityCodeType.Enum wardNightPeriodAvailabilityCode)
        {
            synchronized (monitor())
            {
                check_orphaned();
                org.apache.xmlbeans.SimpleValue target = null;
                target = (org.apache.xmlbeans.SimpleValue)get_store().find_element_user(WARDNIGHTPERIODAVAILABILITYCODE$14, 0);
                if (target == null)
                {
                    target = (org.apache.xmlbeans.SimpleValue)get_store().add_element_user(WARDNIGHTPERIODAVAILABILITYCODE$14);
                }
                target.setEnumValue(wardNightPeriodAvailabilityCode);
            }
        }
        
        /**
         * Sets (as xml) the "WardNightPeriodAvailabilityCode" element
         */
        public void xsetWardNightPeriodAvailabilityCode(uk.nhs.nhsia.datastandards.ecds.WardNightPeriodAvailabilityCodeType wardNightPeriodAvailabilityCode)
        {
            synchronized (monitor())
            {
                check_orphaned();
                uk.nhs.nhsia.datastandards.ecds.WardNightPeriodAvailabilityCodeType target = null;
                target = (uk.nhs.nhsia.datastandards.ecds.WardNightPeriodAvailabilityCodeType)get_store().find_element_user(WARDNIGHTPERIODAVAILABILITYCODE$14, 0);
                if (target == null)
                {
                    target = (uk.nhs.nhsia.datastandards.ecds.WardNightPeriodAvailabilityCodeType)get_store().add_element_user(WARDNIGHTPERIODAVAILABILITYCODE$14);
                }
                target.set(wardNightPeriodAvailabilityCode);
            }
        }
        
        /**
         * Unsets the "WardNightPeriodAvailabilityCode" element
         */
        public void unsetWardNightPeriodAvailabilityCode()
        {
            synchronized (monitor())
            {
                check_orphaned();
                get_store().remove_element(WARDNIGHTPERIODAVAILABILITYCODE$14, 0);
            }
        }
        
        /**
         * Gets the "StartDate" element
         */
        public java.util.Calendar getStartDate()
        {
            synchronized (monitor())
            {
                check_orphaned();
                org.apache.xmlbeans.SimpleValue target = null;
                target = (org.apache.xmlbeans.SimpleValue)get_store().find_element_user(STARTDATE$16, 0);
                if (target == null)
                {
                    return null;
                }
                return target.getCalendarValue();
            }
        }
        
        /**
         * Gets (as xml) the "StartDate" element
         */
        public uk.nhs.nhsia.datastandards.ecds.StartDateType xgetStartDate()
        {
            synchronized (monitor())
            {
                check_orphaned();
                uk.nhs.nhsia.datastandards.ecds.StartDateType target = null;
                target = (uk.nhs.nhsia.datastandards.ecds.StartDateType)get_store().find_element_user(STARTDATE$16, 0);
                return target;
            }
        }
        
        /**
         * True if has "StartDate" element
         */
        public boolean isSetStartDate()
        {
            synchronized (monitor())
            {
                check_orphaned();
                return get_store().count_elements(STARTDATE$16) != 0;
            }
        }
        
        /**
         * Sets the "StartDate" element
         */
        public void setStartDate(java.util.Calendar startDate)
        {
            synchronized (monitor())
            {
                check_orphaned();
                org.apache.xmlbeans.SimpleValue target = null;
                target = (org.apache.xmlbeans.SimpleValue)get_store().find_element_user(STARTDATE$16, 0);
                if (target == null)
                {
                    target = (org.apache.xmlbeans.SimpleValue)get_store().add_element_user(STARTDATE$16);
                }
                target.setCalendarValue(startDate);
            }
        }
        
        /**
         * Sets (as xml) the "StartDate" element
         */
        public void xsetStartDate(uk.nhs.nhsia.datastandards.ecds.StartDateType startDate)
        {
            synchronized (monitor())
            {
                check_orphaned();
                uk.nhs.nhsia.datastandards.ecds.StartDateType target = null;
                target = (uk.nhs.nhsia.datastandards.ecds.StartDateType)get_store().find_element_user(STARTDATE$16, 0);
                if (target == null)
                {
                    target = (uk.nhs.nhsia.datastandards.ecds.StartDateType)get_store().add_element_user(STARTDATE$16);
                }
                target.set(startDate);
            }
        }
        
        /**
         * Unsets the "StartDate" element
         */
        public void unsetStartDate()
        {
            synchronized (monitor())
            {
                check_orphaned();
                get_store().remove_element(STARTDATE$16, 0);
            }
        }
        
        /**
         * Gets the "StartTime" element
         */
        public java.util.Calendar getStartTime()
        {
            synchronized (monitor())
            {
                check_orphaned();
                org.apache.xmlbeans.SimpleValue target = null;
                target = (org.apache.xmlbeans.SimpleValue)get_store().find_element_user(STARTTIME$18, 0);
                if (target == null)
                {
                    return null;
                }
                return target.getCalendarValue();
            }
        }
        
        /**
         * Gets (as xml) the "StartTime" element
         */
        public uk.nhs.nhsia.datastandards.ecds.StartTimeType xgetStartTime()
        {
            synchronized (monitor())
            {
                check_orphaned();
                uk.nhs.nhsia.datastandards.ecds.StartTimeType target = null;
                target = (uk.nhs.nhsia.datastandards.ecds.StartTimeType)get_store().find_element_user(STARTTIME$18, 0);
                return target;
            }
        }
        
        /**
         * True if has "StartTime" element
         */
        public boolean isSetStartTime()
        {
            synchronized (monitor())
            {
                check_orphaned();
                return get_store().count_elements(STARTTIME$18) != 0;
            }
        }
        
        /**
         * Sets the "StartTime" element
         */
        public void setStartTime(java.util.Calendar startTime)
        {
            synchronized (monitor())
            {
                check_orphaned();
                org.apache.xmlbeans.SimpleValue target = null;
                target = (org.apache.xmlbeans.SimpleValue)get_store().find_element_user(STARTTIME$18, 0);
                if (target == null)
                {
                    target = (org.apache.xmlbeans.SimpleValue)get_store().add_element_user(STARTTIME$18);
                }
                target.setCalendarValue(startTime);
            }
        }
        
        /**
         * Sets (as xml) the "StartTime" element
         */
        public void xsetStartTime(uk.nhs.nhsia.datastandards.ecds.StartTimeType startTime)
        {
            synchronized (monitor())
            {
                check_orphaned();
                uk.nhs.nhsia.datastandards.ecds.StartTimeType target = null;
                target = (uk.nhs.nhsia.datastandards.ecds.StartTimeType)get_store().find_element_user(STARTTIME$18, 0);
                if (target == null)
                {
                    target = (uk.nhs.nhsia.datastandards.ecds.StartTimeType)get_store().add_element_user(STARTTIME$18);
                }
                target.set(startTime);
            }
        }
        
        /**
         * Unsets the "StartTime" element
         */
        public void unsetStartTime()
        {
            synchronized (monitor())
            {
                check_orphaned();
                get_store().remove_element(STARTTIME$18, 0);
            }
        }
        
        /**
         * Gets the "EndDate" element
         */
        public java.util.Calendar getEndDate()
        {
            synchronized (monitor())
            {
                check_orphaned();
                org.apache.xmlbeans.SimpleValue target = null;
                target = (org.apache.xmlbeans.SimpleValue)get_store().find_element_user(ENDDATE$20, 0);
                if (target == null)
                {
                    return null;
                }
                return target.getCalendarValue();
            }
        }
        
        /**
         * Gets (as xml) the "EndDate" element
         */
        public uk.nhs.nhsia.datastandards.ecds.EndDateType xgetEndDate()
        {
            synchronized (monitor())
            {
                check_orphaned();
                uk.nhs.nhsia.datastandards.ecds.EndDateType target = null;
                target = (uk.nhs.nhsia.datastandards.ecds.EndDateType)get_store().find_element_user(ENDDATE$20, 0);
                return target;
            }
        }
        
        /**
         * True if has "EndDate" element
         */
        public boolean isSetEndDate()
        {
            synchronized (monitor())
            {
                check_orphaned();
                return get_store().count_elements(ENDDATE$20) != 0;
            }
        }
        
        /**
         * Sets the "EndDate" element
         */
        public void setEndDate(java.util.Calendar endDate)
        {
            synchronized (monitor())
            {
                check_orphaned();
                org.apache.xmlbeans.SimpleValue target = null;
                target = (org.apache.xmlbeans.SimpleValue)get_store().find_element_user(ENDDATE$20, 0);
                if (target == null)
                {
                    target = (org.apache.xmlbeans.SimpleValue)get_store().add_element_user(ENDDATE$20);
                }
                target.setCalendarValue(endDate);
            }
        }
        
        /**
         * Sets (as xml) the "EndDate" element
         */
        public void xsetEndDate(uk.nhs.nhsia.datastandards.ecds.EndDateType endDate)
        {
            synchronized (monitor())
            {
                check_orphaned();
                uk.nhs.nhsia.datastandards.ecds.EndDateType target = null;
                target = (uk.nhs.nhsia.datastandards.ecds.EndDateType)get_store().find_element_user(ENDDATE$20, 0);
                if (target == null)
                {
                    target = (uk.nhs.nhsia.datastandards.ecds.EndDateType)get_store().add_element_user(ENDDATE$20);
                }
                target.set(endDate);
            }
        }
        
        /**
         * Unsets the "EndDate" element
         */
        public void unsetEndDate()
        {
            synchronized (monitor())
            {
                check_orphaned();
                get_store().remove_element(ENDDATE$20, 0);
            }
        }
        
        /**
         * Gets the "EndTime" element
         */
        public java.util.Calendar getEndTime()
        {
            synchronized (monitor())
            {
                check_orphaned();
                org.apache.xmlbeans.SimpleValue target = null;
                target = (org.apache.xmlbeans.SimpleValue)get_store().find_element_user(ENDTIME$22, 0);
                if (target == null)
                {
                    return null;
                }
                return target.getCalendarValue();
            }
        }
        
        /**
         * Gets (as xml) the "EndTime" element
         */
        public uk.nhs.nhsia.datastandards.ecds.EndTimeType xgetEndTime()
        {
            synchronized (monitor())
            {
                check_orphaned();
                uk.nhs.nhsia.datastandards.ecds.EndTimeType target = null;
                target = (uk.nhs.nhsia.datastandards.ecds.EndTimeType)get_store().find_element_user(ENDTIME$22, 0);
                return target;
            }
        }
        
        /**
         * True if has "EndTime" element
         */
        public boolean isSetEndTime()
        {
            synchronized (monitor())
            {
                check_orphaned();
                return get_store().count_elements(ENDTIME$22) != 0;
            }
        }
        
        /**
         * Sets the "EndTime" element
         */
        public void setEndTime(java.util.Calendar endTime)
        {
            synchronized (monitor())
            {
                check_orphaned();
                org.apache.xmlbeans.SimpleValue target = null;
                target = (org.apache.xmlbeans.SimpleValue)get_store().find_element_user(ENDTIME$22, 0);
                if (target == null)
                {
                    target = (org.apache.xmlbeans.SimpleValue)get_store().add_element_user(ENDTIME$22);
                }
                target.setCalendarValue(endTime);
            }
        }
        
        /**
         * Sets (as xml) the "EndTime" element
         */
        public void xsetEndTime(uk.nhs.nhsia.datastandards.ecds.EndTimeType endTime)
        {
            synchronized (monitor())
            {
                check_orphaned();
                uk.nhs.nhsia.datastandards.ecds.EndTimeType target = null;
                target = (uk.nhs.nhsia.datastandards.ecds.EndTimeType)get_store().find_element_user(ENDTIME$22, 0);
                if (target == null)
                {
                    target = (uk.nhs.nhsia.datastandards.ecds.EndTimeType)get_store().add_element_user(ENDTIME$22);
                }
                target.set(endTime);
            }
        }
        
        /**
         * Unsets the "EndTime" element
         */
        public void unsetEndTime()
        {
            synchronized (monitor())
            {
                check_orphaned();
                get_store().remove_element(ENDTIME$22, 0);
            }
        }
        
        /**
         * Gets the "WardSecurityLevel" element
         */
        public uk.nhs.nhsia.datastandards.ecds.WardSecurityLevelType.Enum getWardSecurityLevel()
        {
            synchronized (monitor())
            {
                check_orphaned();
                org.apache.xmlbeans.SimpleValue target = null;
                target = (org.apache.xmlbeans.SimpleValue)get_store().find_element_user(WARDSECURITYLEVEL$24, 0);
                if (target == null)
                {
                    return null;
                }
                return (uk.nhs.nhsia.datastandards.ecds.WardSecurityLevelType.Enum)target.getEnumValue();
            }
        }
        
        /**
         * Gets (as xml) the "WardSecurityLevel" element
         */
        public uk.nhs.nhsia.datastandards.ecds.WardSecurityLevelType xgetWardSecurityLevel()
        {
            synchronized (monitor())
            {
                check_orphaned();
                uk.nhs.nhsia.datastandards.ecds.WardSecurityLevelType target = null;
                target = (uk.nhs.nhsia.datastandards.ecds.WardSecurityLevelType)get_store().find_element_user(WARDSECURITYLEVEL$24, 0);
                return target;
            }
        }
        
        /**
         * True if has "WardSecurityLevel" element
         */
        public boolean isSetWardSecurityLevel()
        {
            synchronized (monitor())
            {
                check_orphaned();
                return get_store().count_elements(WARDSECURITYLEVEL$24) != 0;
            }
        }
        
        /**
         * Sets the "WardSecurityLevel" element
         */
        public void setWardSecurityLevel(uk.nhs.nhsia.datastandards.ecds.WardSecurityLevelType.Enum wardSecurityLevel)
        {
            synchronized (monitor())
            {
                check_orphaned();
                org.apache.xmlbeans.SimpleValue target = null;
                target = (org.apache.xmlbeans.SimpleValue)get_store().find_element_user(WARDSECURITYLEVEL$24, 0);
                if (target == null)
                {
                    target = (org.apache.xmlbeans.SimpleValue)get_store().add_element_user(WARDSECURITYLEVEL$24);
                }
                target.setEnumValue(wardSecurityLevel);
            }
        }
        
        /**
         * Sets (as xml) the "WardSecurityLevel" element
         */
        public void xsetWardSecurityLevel(uk.nhs.nhsia.datastandards.ecds.WardSecurityLevelType wardSecurityLevel)
        {
            synchronized (monitor())
            {
                check_orphaned();
                uk.nhs.nhsia.datastandards.ecds.WardSecurityLevelType target = null;
                target = (uk.nhs.nhsia.datastandards.ecds.WardSecurityLevelType)get_store().find_element_user(WARDSECURITYLEVEL$24, 0);
                if (target == null)
                {
                    target = (uk.nhs.nhsia.datastandards.ecds.WardSecurityLevelType)get_store().add_element_user(WARDSECURITYLEVEL$24);
                }
                target.set(wardSecurityLevel);
            }
        }
        
        /**
         * Unsets the "WardSecurityLevel" element
         */
        public void unsetWardSecurityLevel()
        {
            synchronized (monitor())
            {
                check_orphaned();
                get_store().remove_element(WARDSECURITYLEVEL$24, 0);
            }
        }
        
        /**
         * Gets the "WardCode" element
         */
        public java.lang.String getWardCode()
        {
            synchronized (monitor())
            {
                check_orphaned();
                org.apache.xmlbeans.SimpleValue target = null;
                target = (org.apache.xmlbeans.SimpleValue)get_store().find_element_user(WARDCODE$26, 0);
                if (target == null)
                {
                    return null;
                }
                return target.getStringValue();
            }
        }
        
        /**
         * Gets (as xml) the "WardCode" element
         */
        public uk.nhs.nhsia.datastandards.ecds.WardCodeType xgetWardCode()
        {
            synchronized (monitor())
            {
                check_orphaned();
                uk.nhs.nhsia.datastandards.ecds.WardCodeType target = null;
                target = (uk.nhs.nhsia.datastandards.ecds.WardCodeType)get_store().find_element_user(WARDCODE$26, 0);
                return target;
            }
        }
        
        /**
         * True if has "WardCode" element
         */
        public boolean isSetWardCode()
        {
            synchronized (monitor())
            {
                check_orphaned();
                return get_store().count_elements(WARDCODE$26) != 0;
            }
        }
        
        /**
         * Sets the "WardCode" element
         */
        public void setWardCode(java.lang.String wardCode)
        {
            synchronized (monitor())
            {
                check_orphaned();
                org.apache.xmlbeans.SimpleValue target = null;
                target = (org.apache.xmlbeans.SimpleValue)get_store().find_element_user(WARDCODE$26, 0);
                if (target == null)
                {
                    target = (org.apache.xmlbeans.SimpleValue)get_store().add_element_user(WARDCODE$26);
                }
                target.setStringValue(wardCode);
            }
        }
        
        /**
         * Sets (as xml) the "WardCode" element
         */
        public void xsetWardCode(uk.nhs.nhsia.datastandards.ecds.WardCodeType wardCode)
        {
            synchronized (monitor())
            {
                check_orphaned();
                uk.nhs.nhsia.datastandards.ecds.WardCodeType target = null;
                target = (uk.nhs.nhsia.datastandards.ecds.WardCodeType)get_store().find_element_user(WARDCODE$26, 0);
                if (target == null)
                {
                    target = (uk.nhs.nhsia.datastandards.ecds.WardCodeType)get_store().add_element_user(WARDCODE$26);
                }
                target.set(wardCode);
            }
        }
        
        /**
         * Unsets the "WardCode" element
         */
        public void unsetWardCode()
        {
            synchronized (monitor())
            {
                check_orphaned();
                get_store().remove_element(WARDCODE$26, 0);
            }
        }
    }
    /**
     * An XML EndOfEpisode(@http://www.nhsia.nhs.uk/DataStandards/XMLschema/CDS/ns).
     *
     * This is a complex type.
     */
    public static class EndOfEpisodeImpl extends org.apache.xmlbeans.impl.values.XmlComplexContentImpl implements uk.nhs.nhsia.datastandards.ecds.APCLocationGroupStructure.EndOfEpisode
    {
        private static final long serialVersionUID = 1L;
        
        public EndOfEpisodeImpl(org.apache.xmlbeans.SchemaType sType)
        {
            super(sType);
        }
        
        private static final javax.xml.namespace.QName LOCATIONCLASS$0 = 
            new javax.xml.namespace.QName("http://www.nhsia.nhs.uk/DataStandards/XMLschema/CDS/ns", "LocationClass");
        private static final javax.xml.namespace.QName SITECODEOFTREATMENT$2 = 
            new javax.xml.namespace.QName("http://www.nhsia.nhs.uk/DataStandards/XMLschema/CDS/ns", "SiteCodeOfTreatment");
        private static final javax.xml.namespace.QName ACTIVITYLOCATIONTYPE$4 = 
            new javax.xml.namespace.QName("http://www.nhsia.nhs.uk/DataStandards/XMLschema/CDS/ns", "ActivityLocationType");
        private static final javax.xml.namespace.QName INTENDEDCLINICALCAREINTENSITYCODE$6 = 
            new javax.xml.namespace.QName("http://www.nhsia.nhs.uk/DataStandards/XMLschema/CDS/ns", "IntendedClinicalCareIntensityCode");
        private static final javax.xml.namespace.QName INTENDEDAGEGROUP$8 = 
            new javax.xml.namespace.QName("http://www.nhsia.nhs.uk/DataStandards/XMLschema/CDS/ns", "IntendedAgeGroup");
        private static final javax.xml.namespace.QName SEXOFPATIENTSCODE$10 = 
            new javax.xml.namespace.QName("http://www.nhsia.nhs.uk/DataStandards/XMLschema/CDS/ns", "SexOfPatientsCode");
        private static final javax.xml.namespace.QName WARDDAYPERIODAVAILABILITYCODE$12 = 
            new javax.xml.namespace.QName("http://www.nhsia.nhs.uk/DataStandards/XMLschema/CDS/ns", "WardDayPeriodAvailabilityCode");
        private static final javax.xml.namespace.QName WARDNIGHTPERIODAVAILABILITYCODE$14 = 
            new javax.xml.namespace.QName("http://www.nhsia.nhs.uk/DataStandards/XMLschema/CDS/ns", "WardNightPeriodAvailabilityCode");
        private static final javax.xml.namespace.QName WARDSECURITYLEVEL$16 = 
            new javax.xml.namespace.QName("http://www.nhsia.nhs.uk/DataStandards/XMLschema/CDS/ns", "WardSecurityLevel");
        private static final javax.xml.namespace.QName WARDCODE$18 = 
            new javax.xml.namespace.QName("http://www.nhsia.nhs.uk/DataStandards/XMLschema/CDS/ns", "WardCode");
        
        
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
         * Gets the "IntendedClinicalCareIntensityCode" element
         */
        public uk.nhs.nhsia.datastandards.ecds.IntendedClinicalCareIntensityCodeType.Enum getIntendedClinicalCareIntensityCode()
        {
            synchronized (monitor())
            {
                check_orphaned();
                org.apache.xmlbeans.SimpleValue target = null;
                target = (org.apache.xmlbeans.SimpleValue)get_store().find_element_user(INTENDEDCLINICALCAREINTENSITYCODE$6, 0);
                if (target == null)
                {
                    return null;
                }
                return (uk.nhs.nhsia.datastandards.ecds.IntendedClinicalCareIntensityCodeType.Enum)target.getEnumValue();
            }
        }
        
        /**
         * Gets (as xml) the "IntendedClinicalCareIntensityCode" element
         */
        public uk.nhs.nhsia.datastandards.ecds.IntendedClinicalCareIntensityCodeType xgetIntendedClinicalCareIntensityCode()
        {
            synchronized (monitor())
            {
                check_orphaned();
                uk.nhs.nhsia.datastandards.ecds.IntendedClinicalCareIntensityCodeType target = null;
                target = (uk.nhs.nhsia.datastandards.ecds.IntendedClinicalCareIntensityCodeType)get_store().find_element_user(INTENDEDCLINICALCAREINTENSITYCODE$6, 0);
                return target;
            }
        }
        
        /**
         * True if has "IntendedClinicalCareIntensityCode" element
         */
        public boolean isSetIntendedClinicalCareIntensityCode()
        {
            synchronized (monitor())
            {
                check_orphaned();
                return get_store().count_elements(INTENDEDCLINICALCAREINTENSITYCODE$6) != 0;
            }
        }
        
        /**
         * Sets the "IntendedClinicalCareIntensityCode" element
         */
        public void setIntendedClinicalCareIntensityCode(uk.nhs.nhsia.datastandards.ecds.IntendedClinicalCareIntensityCodeType.Enum intendedClinicalCareIntensityCode)
        {
            synchronized (monitor())
            {
                check_orphaned();
                org.apache.xmlbeans.SimpleValue target = null;
                target = (org.apache.xmlbeans.SimpleValue)get_store().find_element_user(INTENDEDCLINICALCAREINTENSITYCODE$6, 0);
                if (target == null)
                {
                    target = (org.apache.xmlbeans.SimpleValue)get_store().add_element_user(INTENDEDCLINICALCAREINTENSITYCODE$6);
                }
                target.setEnumValue(intendedClinicalCareIntensityCode);
            }
        }
        
        /**
         * Sets (as xml) the "IntendedClinicalCareIntensityCode" element
         */
        public void xsetIntendedClinicalCareIntensityCode(uk.nhs.nhsia.datastandards.ecds.IntendedClinicalCareIntensityCodeType intendedClinicalCareIntensityCode)
        {
            synchronized (monitor())
            {
                check_orphaned();
                uk.nhs.nhsia.datastandards.ecds.IntendedClinicalCareIntensityCodeType target = null;
                target = (uk.nhs.nhsia.datastandards.ecds.IntendedClinicalCareIntensityCodeType)get_store().find_element_user(INTENDEDCLINICALCAREINTENSITYCODE$6, 0);
                if (target == null)
                {
                    target = (uk.nhs.nhsia.datastandards.ecds.IntendedClinicalCareIntensityCodeType)get_store().add_element_user(INTENDEDCLINICALCAREINTENSITYCODE$6);
                }
                target.set(intendedClinicalCareIntensityCode);
            }
        }
        
        /**
         * Unsets the "IntendedClinicalCareIntensityCode" element
         */
        public void unsetIntendedClinicalCareIntensityCode()
        {
            synchronized (monitor())
            {
                check_orphaned();
                get_store().remove_element(INTENDEDCLINICALCAREINTENSITYCODE$6, 0);
            }
        }
        
        /**
         * Gets the "IntendedAgeGroup" element
         */
        public uk.nhs.nhsia.datastandards.ecds.IntendedAgeGroupType.Enum getIntendedAgeGroup()
        {
            synchronized (monitor())
            {
                check_orphaned();
                org.apache.xmlbeans.SimpleValue target = null;
                target = (org.apache.xmlbeans.SimpleValue)get_store().find_element_user(INTENDEDAGEGROUP$8, 0);
                if (target == null)
                {
                    return null;
                }
                return (uk.nhs.nhsia.datastandards.ecds.IntendedAgeGroupType.Enum)target.getEnumValue();
            }
        }
        
        /**
         * Gets (as xml) the "IntendedAgeGroup" element
         */
        public uk.nhs.nhsia.datastandards.ecds.IntendedAgeGroupType xgetIntendedAgeGroup()
        {
            synchronized (monitor())
            {
                check_orphaned();
                uk.nhs.nhsia.datastandards.ecds.IntendedAgeGroupType target = null;
                target = (uk.nhs.nhsia.datastandards.ecds.IntendedAgeGroupType)get_store().find_element_user(INTENDEDAGEGROUP$8, 0);
                return target;
            }
        }
        
        /**
         * True if has "IntendedAgeGroup" element
         */
        public boolean isSetIntendedAgeGroup()
        {
            synchronized (monitor())
            {
                check_orphaned();
                return get_store().count_elements(INTENDEDAGEGROUP$8) != 0;
            }
        }
        
        /**
         * Sets the "IntendedAgeGroup" element
         */
        public void setIntendedAgeGroup(uk.nhs.nhsia.datastandards.ecds.IntendedAgeGroupType.Enum intendedAgeGroup)
        {
            synchronized (monitor())
            {
                check_orphaned();
                org.apache.xmlbeans.SimpleValue target = null;
                target = (org.apache.xmlbeans.SimpleValue)get_store().find_element_user(INTENDEDAGEGROUP$8, 0);
                if (target == null)
                {
                    target = (org.apache.xmlbeans.SimpleValue)get_store().add_element_user(INTENDEDAGEGROUP$8);
                }
                target.setEnumValue(intendedAgeGroup);
            }
        }
        
        /**
         * Sets (as xml) the "IntendedAgeGroup" element
         */
        public void xsetIntendedAgeGroup(uk.nhs.nhsia.datastandards.ecds.IntendedAgeGroupType intendedAgeGroup)
        {
            synchronized (monitor())
            {
                check_orphaned();
                uk.nhs.nhsia.datastandards.ecds.IntendedAgeGroupType target = null;
                target = (uk.nhs.nhsia.datastandards.ecds.IntendedAgeGroupType)get_store().find_element_user(INTENDEDAGEGROUP$8, 0);
                if (target == null)
                {
                    target = (uk.nhs.nhsia.datastandards.ecds.IntendedAgeGroupType)get_store().add_element_user(INTENDEDAGEGROUP$8);
                }
                target.set(intendedAgeGroup);
            }
        }
        
        /**
         * Unsets the "IntendedAgeGroup" element
         */
        public void unsetIntendedAgeGroup()
        {
            synchronized (monitor())
            {
                check_orphaned();
                get_store().remove_element(INTENDEDAGEGROUP$8, 0);
            }
        }
        
        /**
         * Gets the "SexOfPatientsCode" element
         */
        public uk.nhs.nhsia.datastandards.ecds.SexOfPatientsCodeType.Enum getSexOfPatientsCode()
        {
            synchronized (monitor())
            {
                check_orphaned();
                org.apache.xmlbeans.SimpleValue target = null;
                target = (org.apache.xmlbeans.SimpleValue)get_store().find_element_user(SEXOFPATIENTSCODE$10, 0);
                if (target == null)
                {
                    return null;
                }
                return (uk.nhs.nhsia.datastandards.ecds.SexOfPatientsCodeType.Enum)target.getEnumValue();
            }
        }
        
        /**
         * Gets (as xml) the "SexOfPatientsCode" element
         */
        public uk.nhs.nhsia.datastandards.ecds.SexOfPatientsCodeType xgetSexOfPatientsCode()
        {
            synchronized (monitor())
            {
                check_orphaned();
                uk.nhs.nhsia.datastandards.ecds.SexOfPatientsCodeType target = null;
                target = (uk.nhs.nhsia.datastandards.ecds.SexOfPatientsCodeType)get_store().find_element_user(SEXOFPATIENTSCODE$10, 0);
                return target;
            }
        }
        
        /**
         * True if has "SexOfPatientsCode" element
         */
        public boolean isSetSexOfPatientsCode()
        {
            synchronized (monitor())
            {
                check_orphaned();
                return get_store().count_elements(SEXOFPATIENTSCODE$10) != 0;
            }
        }
        
        /**
         * Sets the "SexOfPatientsCode" element
         */
        public void setSexOfPatientsCode(uk.nhs.nhsia.datastandards.ecds.SexOfPatientsCodeType.Enum sexOfPatientsCode)
        {
            synchronized (monitor())
            {
                check_orphaned();
                org.apache.xmlbeans.SimpleValue target = null;
                target = (org.apache.xmlbeans.SimpleValue)get_store().find_element_user(SEXOFPATIENTSCODE$10, 0);
                if (target == null)
                {
                    target = (org.apache.xmlbeans.SimpleValue)get_store().add_element_user(SEXOFPATIENTSCODE$10);
                }
                target.setEnumValue(sexOfPatientsCode);
            }
        }
        
        /**
         * Sets (as xml) the "SexOfPatientsCode" element
         */
        public void xsetSexOfPatientsCode(uk.nhs.nhsia.datastandards.ecds.SexOfPatientsCodeType sexOfPatientsCode)
        {
            synchronized (monitor())
            {
                check_orphaned();
                uk.nhs.nhsia.datastandards.ecds.SexOfPatientsCodeType target = null;
                target = (uk.nhs.nhsia.datastandards.ecds.SexOfPatientsCodeType)get_store().find_element_user(SEXOFPATIENTSCODE$10, 0);
                if (target == null)
                {
                    target = (uk.nhs.nhsia.datastandards.ecds.SexOfPatientsCodeType)get_store().add_element_user(SEXOFPATIENTSCODE$10);
                }
                target.set(sexOfPatientsCode);
            }
        }
        
        /**
         * Unsets the "SexOfPatientsCode" element
         */
        public void unsetSexOfPatientsCode()
        {
            synchronized (monitor())
            {
                check_orphaned();
                get_store().remove_element(SEXOFPATIENTSCODE$10, 0);
            }
        }
        
        /**
         * Gets the "WardDayPeriodAvailabilityCode" element
         */
        public uk.nhs.nhsia.datastandards.ecds.WardDayPeriodAvailabilityCodeType.Enum getWardDayPeriodAvailabilityCode()
        {
            synchronized (monitor())
            {
                check_orphaned();
                org.apache.xmlbeans.SimpleValue target = null;
                target = (org.apache.xmlbeans.SimpleValue)get_store().find_element_user(WARDDAYPERIODAVAILABILITYCODE$12, 0);
                if (target == null)
                {
                    return null;
                }
                return (uk.nhs.nhsia.datastandards.ecds.WardDayPeriodAvailabilityCodeType.Enum)target.getEnumValue();
            }
        }
        
        /**
         * Gets (as xml) the "WardDayPeriodAvailabilityCode" element
         */
        public uk.nhs.nhsia.datastandards.ecds.WardDayPeriodAvailabilityCodeType xgetWardDayPeriodAvailabilityCode()
        {
            synchronized (monitor())
            {
                check_orphaned();
                uk.nhs.nhsia.datastandards.ecds.WardDayPeriodAvailabilityCodeType target = null;
                target = (uk.nhs.nhsia.datastandards.ecds.WardDayPeriodAvailabilityCodeType)get_store().find_element_user(WARDDAYPERIODAVAILABILITYCODE$12, 0);
                return target;
            }
        }
        
        /**
         * True if has "WardDayPeriodAvailabilityCode" element
         */
        public boolean isSetWardDayPeriodAvailabilityCode()
        {
            synchronized (monitor())
            {
                check_orphaned();
                return get_store().count_elements(WARDDAYPERIODAVAILABILITYCODE$12) != 0;
            }
        }
        
        /**
         * Sets the "WardDayPeriodAvailabilityCode" element
         */
        public void setWardDayPeriodAvailabilityCode(uk.nhs.nhsia.datastandards.ecds.WardDayPeriodAvailabilityCodeType.Enum wardDayPeriodAvailabilityCode)
        {
            synchronized (monitor())
            {
                check_orphaned();
                org.apache.xmlbeans.SimpleValue target = null;
                target = (org.apache.xmlbeans.SimpleValue)get_store().find_element_user(WARDDAYPERIODAVAILABILITYCODE$12, 0);
                if (target == null)
                {
                    target = (org.apache.xmlbeans.SimpleValue)get_store().add_element_user(WARDDAYPERIODAVAILABILITYCODE$12);
                }
                target.setEnumValue(wardDayPeriodAvailabilityCode);
            }
        }
        
        /**
         * Sets (as xml) the "WardDayPeriodAvailabilityCode" element
         */
        public void xsetWardDayPeriodAvailabilityCode(uk.nhs.nhsia.datastandards.ecds.WardDayPeriodAvailabilityCodeType wardDayPeriodAvailabilityCode)
        {
            synchronized (monitor())
            {
                check_orphaned();
                uk.nhs.nhsia.datastandards.ecds.WardDayPeriodAvailabilityCodeType target = null;
                target = (uk.nhs.nhsia.datastandards.ecds.WardDayPeriodAvailabilityCodeType)get_store().find_element_user(WARDDAYPERIODAVAILABILITYCODE$12, 0);
                if (target == null)
                {
                    target = (uk.nhs.nhsia.datastandards.ecds.WardDayPeriodAvailabilityCodeType)get_store().add_element_user(WARDDAYPERIODAVAILABILITYCODE$12);
                }
                target.set(wardDayPeriodAvailabilityCode);
            }
        }
        
        /**
         * Unsets the "WardDayPeriodAvailabilityCode" element
         */
        public void unsetWardDayPeriodAvailabilityCode()
        {
            synchronized (monitor())
            {
                check_orphaned();
                get_store().remove_element(WARDDAYPERIODAVAILABILITYCODE$12, 0);
            }
        }
        
        /**
         * Gets the "WardNightPeriodAvailabilityCode" element
         */
        public uk.nhs.nhsia.datastandards.ecds.WardNightPeriodAvailabilityCodeType.Enum getWardNightPeriodAvailabilityCode()
        {
            synchronized (monitor())
            {
                check_orphaned();
                org.apache.xmlbeans.SimpleValue target = null;
                target = (org.apache.xmlbeans.SimpleValue)get_store().find_element_user(WARDNIGHTPERIODAVAILABILITYCODE$14, 0);
                if (target == null)
                {
                    return null;
                }
                return (uk.nhs.nhsia.datastandards.ecds.WardNightPeriodAvailabilityCodeType.Enum)target.getEnumValue();
            }
        }
        
        /**
         * Gets (as xml) the "WardNightPeriodAvailabilityCode" element
         */
        public uk.nhs.nhsia.datastandards.ecds.WardNightPeriodAvailabilityCodeType xgetWardNightPeriodAvailabilityCode()
        {
            synchronized (monitor())
            {
                check_orphaned();
                uk.nhs.nhsia.datastandards.ecds.WardNightPeriodAvailabilityCodeType target = null;
                target = (uk.nhs.nhsia.datastandards.ecds.WardNightPeriodAvailabilityCodeType)get_store().find_element_user(WARDNIGHTPERIODAVAILABILITYCODE$14, 0);
                return target;
            }
        }
        
        /**
         * True if has "WardNightPeriodAvailabilityCode" element
         */
        public boolean isSetWardNightPeriodAvailabilityCode()
        {
            synchronized (monitor())
            {
                check_orphaned();
                return get_store().count_elements(WARDNIGHTPERIODAVAILABILITYCODE$14) != 0;
            }
        }
        
        /**
         * Sets the "WardNightPeriodAvailabilityCode" element
         */
        public void setWardNightPeriodAvailabilityCode(uk.nhs.nhsia.datastandards.ecds.WardNightPeriodAvailabilityCodeType.Enum wardNightPeriodAvailabilityCode)
        {
            synchronized (monitor())
            {
                check_orphaned();
                org.apache.xmlbeans.SimpleValue target = null;
                target = (org.apache.xmlbeans.SimpleValue)get_store().find_element_user(WARDNIGHTPERIODAVAILABILITYCODE$14, 0);
                if (target == null)
                {
                    target = (org.apache.xmlbeans.SimpleValue)get_store().add_element_user(WARDNIGHTPERIODAVAILABILITYCODE$14);
                }
                target.setEnumValue(wardNightPeriodAvailabilityCode);
            }
        }
        
        /**
         * Sets (as xml) the "WardNightPeriodAvailabilityCode" element
         */
        public void xsetWardNightPeriodAvailabilityCode(uk.nhs.nhsia.datastandards.ecds.WardNightPeriodAvailabilityCodeType wardNightPeriodAvailabilityCode)
        {
            synchronized (monitor())
            {
                check_orphaned();
                uk.nhs.nhsia.datastandards.ecds.WardNightPeriodAvailabilityCodeType target = null;
                target = (uk.nhs.nhsia.datastandards.ecds.WardNightPeriodAvailabilityCodeType)get_store().find_element_user(WARDNIGHTPERIODAVAILABILITYCODE$14, 0);
                if (target == null)
                {
                    target = (uk.nhs.nhsia.datastandards.ecds.WardNightPeriodAvailabilityCodeType)get_store().add_element_user(WARDNIGHTPERIODAVAILABILITYCODE$14);
                }
                target.set(wardNightPeriodAvailabilityCode);
            }
        }
        
        /**
         * Unsets the "WardNightPeriodAvailabilityCode" element
         */
        public void unsetWardNightPeriodAvailabilityCode()
        {
            synchronized (monitor())
            {
                check_orphaned();
                get_store().remove_element(WARDNIGHTPERIODAVAILABILITYCODE$14, 0);
            }
        }
        
        /**
         * Gets the "WardSecurityLevel" element
         */
        public uk.nhs.nhsia.datastandards.ecds.WardSecurityLevelType.Enum getWardSecurityLevel()
        {
            synchronized (monitor())
            {
                check_orphaned();
                org.apache.xmlbeans.SimpleValue target = null;
                target = (org.apache.xmlbeans.SimpleValue)get_store().find_element_user(WARDSECURITYLEVEL$16, 0);
                if (target == null)
                {
                    return null;
                }
                return (uk.nhs.nhsia.datastandards.ecds.WardSecurityLevelType.Enum)target.getEnumValue();
            }
        }
        
        /**
         * Gets (as xml) the "WardSecurityLevel" element
         */
        public uk.nhs.nhsia.datastandards.ecds.WardSecurityLevelType xgetWardSecurityLevel()
        {
            synchronized (monitor())
            {
                check_orphaned();
                uk.nhs.nhsia.datastandards.ecds.WardSecurityLevelType target = null;
                target = (uk.nhs.nhsia.datastandards.ecds.WardSecurityLevelType)get_store().find_element_user(WARDSECURITYLEVEL$16, 0);
                return target;
            }
        }
        
        /**
         * True if has "WardSecurityLevel" element
         */
        public boolean isSetWardSecurityLevel()
        {
            synchronized (monitor())
            {
                check_orphaned();
                return get_store().count_elements(WARDSECURITYLEVEL$16) != 0;
            }
        }
        
        /**
         * Sets the "WardSecurityLevel" element
         */
        public void setWardSecurityLevel(uk.nhs.nhsia.datastandards.ecds.WardSecurityLevelType.Enum wardSecurityLevel)
        {
            synchronized (monitor())
            {
                check_orphaned();
                org.apache.xmlbeans.SimpleValue target = null;
                target = (org.apache.xmlbeans.SimpleValue)get_store().find_element_user(WARDSECURITYLEVEL$16, 0);
                if (target == null)
                {
                    target = (org.apache.xmlbeans.SimpleValue)get_store().add_element_user(WARDSECURITYLEVEL$16);
                }
                target.setEnumValue(wardSecurityLevel);
            }
        }
        
        /**
         * Sets (as xml) the "WardSecurityLevel" element
         */
        public void xsetWardSecurityLevel(uk.nhs.nhsia.datastandards.ecds.WardSecurityLevelType wardSecurityLevel)
        {
            synchronized (monitor())
            {
                check_orphaned();
                uk.nhs.nhsia.datastandards.ecds.WardSecurityLevelType target = null;
                target = (uk.nhs.nhsia.datastandards.ecds.WardSecurityLevelType)get_store().find_element_user(WARDSECURITYLEVEL$16, 0);
                if (target == null)
                {
                    target = (uk.nhs.nhsia.datastandards.ecds.WardSecurityLevelType)get_store().add_element_user(WARDSECURITYLEVEL$16);
                }
                target.set(wardSecurityLevel);
            }
        }
        
        /**
         * Unsets the "WardSecurityLevel" element
         */
        public void unsetWardSecurityLevel()
        {
            synchronized (monitor())
            {
                check_orphaned();
                get_store().remove_element(WARDSECURITYLEVEL$16, 0);
            }
        }
        
        /**
         * Gets the "WardCode" element
         */
        public java.lang.String getWardCode()
        {
            synchronized (monitor())
            {
                check_orphaned();
                org.apache.xmlbeans.SimpleValue target = null;
                target = (org.apache.xmlbeans.SimpleValue)get_store().find_element_user(WARDCODE$18, 0);
                if (target == null)
                {
                    return null;
                }
                return target.getStringValue();
            }
        }
        
        /**
         * Gets (as xml) the "WardCode" element
         */
        public uk.nhs.nhsia.datastandards.ecds.WardCodeType xgetWardCode()
        {
            synchronized (monitor())
            {
                check_orphaned();
                uk.nhs.nhsia.datastandards.ecds.WardCodeType target = null;
                target = (uk.nhs.nhsia.datastandards.ecds.WardCodeType)get_store().find_element_user(WARDCODE$18, 0);
                return target;
            }
        }
        
        /**
         * True if has "WardCode" element
         */
        public boolean isSetWardCode()
        {
            synchronized (monitor())
            {
                check_orphaned();
                return get_store().count_elements(WARDCODE$18) != 0;
            }
        }
        
        /**
         * Sets the "WardCode" element
         */
        public void setWardCode(java.lang.String wardCode)
        {
            synchronized (monitor())
            {
                check_orphaned();
                org.apache.xmlbeans.SimpleValue target = null;
                target = (org.apache.xmlbeans.SimpleValue)get_store().find_element_user(WARDCODE$18, 0);
                if (target == null)
                {
                    target = (org.apache.xmlbeans.SimpleValue)get_store().add_element_user(WARDCODE$18);
                }
                target.setStringValue(wardCode);
            }
        }
        
        /**
         * Sets (as xml) the "WardCode" element
         */
        public void xsetWardCode(uk.nhs.nhsia.datastandards.ecds.WardCodeType wardCode)
        {
            synchronized (monitor())
            {
                check_orphaned();
                uk.nhs.nhsia.datastandards.ecds.WardCodeType target = null;
                target = (uk.nhs.nhsia.datastandards.ecds.WardCodeType)get_store().find_element_user(WARDCODE$18, 0);
                if (target == null)
                {
                    target = (uk.nhs.nhsia.datastandards.ecds.WardCodeType)get_store().add_element_user(WARDCODE$18);
                }
                target.set(wardCode);
            }
        }
        
        /**
         * Unsets the "WardCode" element
         */
        public void unsetWardCode()
        {
            synchronized (monitor())
            {
                check_orphaned();
                get_store().remove_element(WARDCODE$18, 0);
            }
        }
    }
}
