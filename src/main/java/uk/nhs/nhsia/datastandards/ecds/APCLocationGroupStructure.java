/*
 * XML Type:  APCLocationGroup_Structure
 * Namespace: http://www.nhsia.nhs.uk/DataStandards/XMLschema/CDS/ns
 * Java type: uk.nhs.nhsia.datastandards.ecds.APCLocationGroupStructure
 *
 * Automatically generated - do not modify.
 */
package uk.nhs.nhsia.datastandards.ecds;


/**
 * An XML APCLocationGroup_Structure(@http://www.nhsia.nhs.uk/DataStandards/XMLschema/CDS/ns).
 *
 * This is a complex type.
 */
public interface APCLocationGroupStructure extends org.apache.xmlbeans.XmlObject
{
    public static final org.apache.xmlbeans.SchemaType type = (org.apache.xmlbeans.SchemaType)
        org.apache.xmlbeans.XmlBeans.typeSystemForClassLoader(APCLocationGroupStructure.class.getClassLoader(), "schemaorg_apache_xmlbeans.system.s30C1180FF47174E0C8A992A2D657328B").resolveHandle("apclocationgroupstructureff07type");
    
    /**
     * Gets the "StartOfEpisode" element
     */
    uk.nhs.nhsia.datastandards.ecds.APCLocationGroupStructure.StartOfEpisode getStartOfEpisode();
    
    /**
     * True if has "StartOfEpisode" element
     */
    boolean isSetStartOfEpisode();
    
    /**
     * Sets the "StartOfEpisode" element
     */
    void setStartOfEpisode(uk.nhs.nhsia.datastandards.ecds.APCLocationGroupStructure.StartOfEpisode startOfEpisode);
    
    /**
     * Appends and returns a new empty "StartOfEpisode" element
     */
    uk.nhs.nhsia.datastandards.ecds.APCLocationGroupStructure.StartOfEpisode addNewStartOfEpisode();
    
    /**
     * Unsets the "StartOfEpisode" element
     */
    void unsetStartOfEpisode();
    
    /**
     * Gets array of all "WardStay" elements
     */
    uk.nhs.nhsia.datastandards.ecds.APCLocationGroupStructure.WardStay[] getWardStayArray();
    
    /**
     * Gets ith "WardStay" element
     */
    uk.nhs.nhsia.datastandards.ecds.APCLocationGroupStructure.WardStay getWardStayArray(int i);
    
    /**
     * Returns number of "WardStay" element
     */
    int sizeOfWardStayArray();
    
    /**
     * Sets array of all "WardStay" element
     */
    void setWardStayArray(uk.nhs.nhsia.datastandards.ecds.APCLocationGroupStructure.WardStay[] wardStayArray);
    
    /**
     * Sets ith "WardStay" element
     */
    void setWardStayArray(int i, uk.nhs.nhsia.datastandards.ecds.APCLocationGroupStructure.WardStay wardStay);
    
    /**
     * Inserts and returns a new empty value (as xml) as the ith "WardStay" element
     */
    uk.nhs.nhsia.datastandards.ecds.APCLocationGroupStructure.WardStay insertNewWardStay(int i);
    
    /**
     * Appends and returns a new empty value (as xml) as the last "WardStay" element
     */
    uk.nhs.nhsia.datastandards.ecds.APCLocationGroupStructure.WardStay addNewWardStay();
    
    /**
     * Removes the ith "WardStay" element
     */
    void removeWardStay(int i);
    
    /**
     * Gets the "EndOfEpisode" element
     */
    uk.nhs.nhsia.datastandards.ecds.APCLocationGroupStructure.EndOfEpisode getEndOfEpisode();
    
    /**
     * True if has "EndOfEpisode" element
     */
    boolean isSetEndOfEpisode();
    
    /**
     * Sets the "EndOfEpisode" element
     */
    void setEndOfEpisode(uk.nhs.nhsia.datastandards.ecds.APCLocationGroupStructure.EndOfEpisode endOfEpisode);
    
    /**
     * Appends and returns a new empty "EndOfEpisode" element
     */
    uk.nhs.nhsia.datastandards.ecds.APCLocationGroupStructure.EndOfEpisode addNewEndOfEpisode();
    
    /**
     * Unsets the "EndOfEpisode" element
     */
    void unsetEndOfEpisode();
    
    /**
     * An XML StartOfEpisode(@http://www.nhsia.nhs.uk/DataStandards/XMLschema/CDS/ns).
     *
     * This is a complex type.
     */
    public interface StartOfEpisode extends org.apache.xmlbeans.XmlObject
    {
        public static final org.apache.xmlbeans.SchemaType type = (org.apache.xmlbeans.SchemaType)
            org.apache.xmlbeans.XmlBeans.typeSystemForClassLoader(StartOfEpisode.class.getClassLoader(), "schemaorg_apache_xmlbeans.system.s30C1180FF47174E0C8A992A2D657328B").resolveHandle("startofepisode00a5elemtype");
        
        /**
         * Gets the "LocationClass" element
         */
        uk.nhs.nhsia.datastandards.ecds.LocationClassType.Enum getLocationClass();
        
        /**
         * Gets (as xml) the "LocationClass" element
         */
        uk.nhs.nhsia.datastandards.ecds.LocationClassType xgetLocationClass();
        
        /**
         * True if has "LocationClass" element
         */
        boolean isSetLocationClass();
        
        /**
         * Sets the "LocationClass" element
         */
        void setLocationClass(uk.nhs.nhsia.datastandards.ecds.LocationClassType.Enum locationClass);
        
        /**
         * Sets (as xml) the "LocationClass" element
         */
        void xsetLocationClass(uk.nhs.nhsia.datastandards.ecds.LocationClassType locationClass);
        
        /**
         * Unsets the "LocationClass" element
         */
        void unsetLocationClass();
        
        /**
         * Gets the "SiteCodeOfTreatment" element
         */
        java.lang.String getSiteCodeOfTreatment();
        
        /**
         * Gets (as xml) the "SiteCodeOfTreatment" element
         */
        uk.nhs.nhsia.datastandards.ecds.SiteCodeOfTreatmentType xgetSiteCodeOfTreatment();
        
        /**
         * True if has "SiteCodeOfTreatment" element
         */
        boolean isSetSiteCodeOfTreatment();
        
        /**
         * Sets the "SiteCodeOfTreatment" element
         */
        void setSiteCodeOfTreatment(java.lang.String siteCodeOfTreatment);
        
        /**
         * Sets (as xml) the "SiteCodeOfTreatment" element
         */
        void xsetSiteCodeOfTreatment(uk.nhs.nhsia.datastandards.ecds.SiteCodeOfTreatmentType siteCodeOfTreatment);
        
        /**
         * Unsets the "SiteCodeOfTreatment" element
         */
        void unsetSiteCodeOfTreatment();
        
        /**
         * Gets the "ActivityLocationType" element
         */
        uk.nhs.nhsia.datastandards.ecds.ActivityLocationTypeType.Enum getActivityLocationType();
        
        /**
         * Gets (as xml) the "ActivityLocationType" element
         */
        uk.nhs.nhsia.datastandards.ecds.ActivityLocationTypeType xgetActivityLocationType();
        
        /**
         * True if has "ActivityLocationType" element
         */
        boolean isSetActivityLocationType();
        
        /**
         * Sets the "ActivityLocationType" element
         */
        void setActivityLocationType(uk.nhs.nhsia.datastandards.ecds.ActivityLocationTypeType.Enum activityLocationType);
        
        /**
         * Sets (as xml) the "ActivityLocationType" element
         */
        void xsetActivityLocationType(uk.nhs.nhsia.datastandards.ecds.ActivityLocationTypeType activityLocationType);
        
        /**
         * Unsets the "ActivityLocationType" element
         */
        void unsetActivityLocationType();
        
        /**
         * Gets the "IntendedClinicalCareIntensityCode" element
         */
        uk.nhs.nhsia.datastandards.ecds.IntendedClinicalCareIntensityCodeType.Enum getIntendedClinicalCareIntensityCode();
        
        /**
         * Gets (as xml) the "IntendedClinicalCareIntensityCode" element
         */
        uk.nhs.nhsia.datastandards.ecds.IntendedClinicalCareIntensityCodeType xgetIntendedClinicalCareIntensityCode();
        
        /**
         * True if has "IntendedClinicalCareIntensityCode" element
         */
        boolean isSetIntendedClinicalCareIntensityCode();
        
        /**
         * Sets the "IntendedClinicalCareIntensityCode" element
         */
        void setIntendedClinicalCareIntensityCode(uk.nhs.nhsia.datastandards.ecds.IntendedClinicalCareIntensityCodeType.Enum intendedClinicalCareIntensityCode);
        
        /**
         * Sets (as xml) the "IntendedClinicalCareIntensityCode" element
         */
        void xsetIntendedClinicalCareIntensityCode(uk.nhs.nhsia.datastandards.ecds.IntendedClinicalCareIntensityCodeType intendedClinicalCareIntensityCode);
        
        /**
         * Unsets the "IntendedClinicalCareIntensityCode" element
         */
        void unsetIntendedClinicalCareIntensityCode();
        
        /**
         * Gets the "IntendedAgeGroup" element
         */
        uk.nhs.nhsia.datastandards.ecds.IntendedAgeGroupType.Enum getIntendedAgeGroup();
        
        /**
         * Gets (as xml) the "IntendedAgeGroup" element
         */
        uk.nhs.nhsia.datastandards.ecds.IntendedAgeGroupType xgetIntendedAgeGroup();
        
        /**
         * True if has "IntendedAgeGroup" element
         */
        boolean isSetIntendedAgeGroup();
        
        /**
         * Sets the "IntendedAgeGroup" element
         */
        void setIntendedAgeGroup(uk.nhs.nhsia.datastandards.ecds.IntendedAgeGroupType.Enum intendedAgeGroup);
        
        /**
         * Sets (as xml) the "IntendedAgeGroup" element
         */
        void xsetIntendedAgeGroup(uk.nhs.nhsia.datastandards.ecds.IntendedAgeGroupType intendedAgeGroup);
        
        /**
         * Unsets the "IntendedAgeGroup" element
         */
        void unsetIntendedAgeGroup();
        
        /**
         * Gets the "SexOfPatientsCode" element
         */
        uk.nhs.nhsia.datastandards.ecds.SexOfPatientsCodeType.Enum getSexOfPatientsCode();
        
        /**
         * Gets (as xml) the "SexOfPatientsCode" element
         */
        uk.nhs.nhsia.datastandards.ecds.SexOfPatientsCodeType xgetSexOfPatientsCode();
        
        /**
         * True if has "SexOfPatientsCode" element
         */
        boolean isSetSexOfPatientsCode();
        
        /**
         * Sets the "SexOfPatientsCode" element
         */
        void setSexOfPatientsCode(uk.nhs.nhsia.datastandards.ecds.SexOfPatientsCodeType.Enum sexOfPatientsCode);
        
        /**
         * Sets (as xml) the "SexOfPatientsCode" element
         */
        void xsetSexOfPatientsCode(uk.nhs.nhsia.datastandards.ecds.SexOfPatientsCodeType sexOfPatientsCode);
        
        /**
         * Unsets the "SexOfPatientsCode" element
         */
        void unsetSexOfPatientsCode();
        
        /**
         * Gets the "WardDayPeriodAvailabilityCode" element
         */
        uk.nhs.nhsia.datastandards.ecds.WardDayPeriodAvailabilityCodeType.Enum getWardDayPeriodAvailabilityCode();
        
        /**
         * Gets (as xml) the "WardDayPeriodAvailabilityCode" element
         */
        uk.nhs.nhsia.datastandards.ecds.WardDayPeriodAvailabilityCodeType xgetWardDayPeriodAvailabilityCode();
        
        /**
         * True if has "WardDayPeriodAvailabilityCode" element
         */
        boolean isSetWardDayPeriodAvailabilityCode();
        
        /**
         * Sets the "WardDayPeriodAvailabilityCode" element
         */
        void setWardDayPeriodAvailabilityCode(uk.nhs.nhsia.datastandards.ecds.WardDayPeriodAvailabilityCodeType.Enum wardDayPeriodAvailabilityCode);
        
        /**
         * Sets (as xml) the "WardDayPeriodAvailabilityCode" element
         */
        void xsetWardDayPeriodAvailabilityCode(uk.nhs.nhsia.datastandards.ecds.WardDayPeriodAvailabilityCodeType wardDayPeriodAvailabilityCode);
        
        /**
         * Unsets the "WardDayPeriodAvailabilityCode" element
         */
        void unsetWardDayPeriodAvailabilityCode();
        
        /**
         * Gets the "WardNightPeriodAvailabilityCode" element
         */
        uk.nhs.nhsia.datastandards.ecds.WardNightPeriodAvailabilityCodeType.Enum getWardNightPeriodAvailabilityCode();
        
        /**
         * Gets (as xml) the "WardNightPeriodAvailabilityCode" element
         */
        uk.nhs.nhsia.datastandards.ecds.WardNightPeriodAvailabilityCodeType xgetWardNightPeriodAvailabilityCode();
        
        /**
         * True if has "WardNightPeriodAvailabilityCode" element
         */
        boolean isSetWardNightPeriodAvailabilityCode();
        
        /**
         * Sets the "WardNightPeriodAvailabilityCode" element
         */
        void setWardNightPeriodAvailabilityCode(uk.nhs.nhsia.datastandards.ecds.WardNightPeriodAvailabilityCodeType.Enum wardNightPeriodAvailabilityCode);
        
        /**
         * Sets (as xml) the "WardNightPeriodAvailabilityCode" element
         */
        void xsetWardNightPeriodAvailabilityCode(uk.nhs.nhsia.datastandards.ecds.WardNightPeriodAvailabilityCodeType wardNightPeriodAvailabilityCode);
        
        /**
         * Unsets the "WardNightPeriodAvailabilityCode" element
         */
        void unsetWardNightPeriodAvailabilityCode();
        
        /**
         * Gets the "WardSecurityLevel" element
         */
        uk.nhs.nhsia.datastandards.ecds.WardSecurityLevelType.Enum getWardSecurityLevel();
        
        /**
         * Gets (as xml) the "WardSecurityLevel" element
         */
        uk.nhs.nhsia.datastandards.ecds.WardSecurityLevelType xgetWardSecurityLevel();
        
        /**
         * True if has "WardSecurityLevel" element
         */
        boolean isSetWardSecurityLevel();
        
        /**
         * Sets the "WardSecurityLevel" element
         */
        void setWardSecurityLevel(uk.nhs.nhsia.datastandards.ecds.WardSecurityLevelType.Enum wardSecurityLevel);
        
        /**
         * Sets (as xml) the "WardSecurityLevel" element
         */
        void xsetWardSecurityLevel(uk.nhs.nhsia.datastandards.ecds.WardSecurityLevelType wardSecurityLevel);
        
        /**
         * Unsets the "WardSecurityLevel" element
         */
        void unsetWardSecurityLevel();
        
        /**
         * Gets the "WardCode" element
         */
        java.lang.String getWardCode();
        
        /**
         * Gets (as xml) the "WardCode" element
         */
        uk.nhs.nhsia.datastandards.ecds.WardCodeType xgetWardCode();
        
        /**
         * True if has "WardCode" element
         */
        boolean isSetWardCode();
        
        /**
         * Sets the "WardCode" element
         */
        void setWardCode(java.lang.String wardCode);
        
        /**
         * Sets (as xml) the "WardCode" element
         */
        void xsetWardCode(uk.nhs.nhsia.datastandards.ecds.WardCodeType wardCode);
        
        /**
         * Unsets the "WardCode" element
         */
        void unsetWardCode();
        
        /**
         * A factory class with static methods for creating instances
         * of this type.
         */
        
        public static final class Factory
        {
            public static uk.nhs.nhsia.datastandards.ecds.APCLocationGroupStructure.StartOfEpisode newInstance() {
              return (uk.nhs.nhsia.datastandards.ecds.APCLocationGroupStructure.StartOfEpisode) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().newInstance( type, null ); }
            
            public static uk.nhs.nhsia.datastandards.ecds.APCLocationGroupStructure.StartOfEpisode newInstance(org.apache.xmlbeans.XmlOptions options) {
              return (uk.nhs.nhsia.datastandards.ecds.APCLocationGroupStructure.StartOfEpisode) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().newInstance( type, options ); }
            
            private Factory() { } // No instance of this class allowed
        }
    }
    
    /**
     * An XML WardStay(@http://www.nhsia.nhs.uk/DataStandards/XMLschema/CDS/ns).
     *
     * This is a complex type.
     */
    public interface WardStay extends org.apache.xmlbeans.XmlObject
    {
        public static final org.apache.xmlbeans.SchemaType type = (org.apache.xmlbeans.SchemaType)
            org.apache.xmlbeans.XmlBeans.typeSystemForClassLoader(WardStay.class.getClassLoader(), "schemaorg_apache_xmlbeans.system.s30C1180FF47174E0C8A992A2D657328B").resolveHandle("wardstayf838elemtype");
        
        /**
         * Gets the "LocationClass" element
         */
        uk.nhs.nhsia.datastandards.ecds.LocationClassType.Enum getLocationClass();
        
        /**
         * Gets (as xml) the "LocationClass" element
         */
        uk.nhs.nhsia.datastandards.ecds.LocationClassType xgetLocationClass();
        
        /**
         * True if has "LocationClass" element
         */
        boolean isSetLocationClass();
        
        /**
         * Sets the "LocationClass" element
         */
        void setLocationClass(uk.nhs.nhsia.datastandards.ecds.LocationClassType.Enum locationClass);
        
        /**
         * Sets (as xml) the "LocationClass" element
         */
        void xsetLocationClass(uk.nhs.nhsia.datastandards.ecds.LocationClassType locationClass);
        
        /**
         * Unsets the "LocationClass" element
         */
        void unsetLocationClass();
        
        /**
         * Gets the "SiteCodeOfTreatment" element
         */
        java.lang.String getSiteCodeOfTreatment();
        
        /**
         * Gets (as xml) the "SiteCodeOfTreatment" element
         */
        uk.nhs.nhsia.datastandards.ecds.SiteCodeOfTreatmentType xgetSiteCodeOfTreatment();
        
        /**
         * True if has "SiteCodeOfTreatment" element
         */
        boolean isSetSiteCodeOfTreatment();
        
        /**
         * Sets the "SiteCodeOfTreatment" element
         */
        void setSiteCodeOfTreatment(java.lang.String siteCodeOfTreatment);
        
        /**
         * Sets (as xml) the "SiteCodeOfTreatment" element
         */
        void xsetSiteCodeOfTreatment(uk.nhs.nhsia.datastandards.ecds.SiteCodeOfTreatmentType siteCodeOfTreatment);
        
        /**
         * Unsets the "SiteCodeOfTreatment" element
         */
        void unsetSiteCodeOfTreatment();
        
        /**
         * Gets the "ActivityLocationType" element
         */
        uk.nhs.nhsia.datastandards.ecds.ActivityLocationTypeType.Enum getActivityLocationType();
        
        /**
         * Gets (as xml) the "ActivityLocationType" element
         */
        uk.nhs.nhsia.datastandards.ecds.ActivityLocationTypeType xgetActivityLocationType();
        
        /**
         * True if has "ActivityLocationType" element
         */
        boolean isSetActivityLocationType();
        
        /**
         * Sets the "ActivityLocationType" element
         */
        void setActivityLocationType(uk.nhs.nhsia.datastandards.ecds.ActivityLocationTypeType.Enum activityLocationType);
        
        /**
         * Sets (as xml) the "ActivityLocationType" element
         */
        void xsetActivityLocationType(uk.nhs.nhsia.datastandards.ecds.ActivityLocationTypeType activityLocationType);
        
        /**
         * Unsets the "ActivityLocationType" element
         */
        void unsetActivityLocationType();
        
        /**
         * Gets the "IntendedClinicalCareIntensityCode" element
         */
        uk.nhs.nhsia.datastandards.ecds.IntendedClinicalCareIntensityCodeType.Enum getIntendedClinicalCareIntensityCode();
        
        /**
         * Gets (as xml) the "IntendedClinicalCareIntensityCode" element
         */
        uk.nhs.nhsia.datastandards.ecds.IntendedClinicalCareIntensityCodeType xgetIntendedClinicalCareIntensityCode();
        
        /**
         * True if has "IntendedClinicalCareIntensityCode" element
         */
        boolean isSetIntendedClinicalCareIntensityCode();
        
        /**
         * Sets the "IntendedClinicalCareIntensityCode" element
         */
        void setIntendedClinicalCareIntensityCode(uk.nhs.nhsia.datastandards.ecds.IntendedClinicalCareIntensityCodeType.Enum intendedClinicalCareIntensityCode);
        
        /**
         * Sets (as xml) the "IntendedClinicalCareIntensityCode" element
         */
        void xsetIntendedClinicalCareIntensityCode(uk.nhs.nhsia.datastandards.ecds.IntendedClinicalCareIntensityCodeType intendedClinicalCareIntensityCode);
        
        /**
         * Unsets the "IntendedClinicalCareIntensityCode" element
         */
        void unsetIntendedClinicalCareIntensityCode();
        
        /**
         * Gets the "IntendedAgeGroup" element
         */
        uk.nhs.nhsia.datastandards.ecds.IntendedAgeGroupType.Enum getIntendedAgeGroup();
        
        /**
         * Gets (as xml) the "IntendedAgeGroup" element
         */
        uk.nhs.nhsia.datastandards.ecds.IntendedAgeGroupType xgetIntendedAgeGroup();
        
        /**
         * True if has "IntendedAgeGroup" element
         */
        boolean isSetIntendedAgeGroup();
        
        /**
         * Sets the "IntendedAgeGroup" element
         */
        void setIntendedAgeGroup(uk.nhs.nhsia.datastandards.ecds.IntendedAgeGroupType.Enum intendedAgeGroup);
        
        /**
         * Sets (as xml) the "IntendedAgeGroup" element
         */
        void xsetIntendedAgeGroup(uk.nhs.nhsia.datastandards.ecds.IntendedAgeGroupType intendedAgeGroup);
        
        /**
         * Unsets the "IntendedAgeGroup" element
         */
        void unsetIntendedAgeGroup();
        
        /**
         * Gets the "SexOfPatientsCode" element
         */
        uk.nhs.nhsia.datastandards.ecds.SexOfPatientsCodeType.Enum getSexOfPatientsCode();
        
        /**
         * Gets (as xml) the "SexOfPatientsCode" element
         */
        uk.nhs.nhsia.datastandards.ecds.SexOfPatientsCodeType xgetSexOfPatientsCode();
        
        /**
         * True if has "SexOfPatientsCode" element
         */
        boolean isSetSexOfPatientsCode();
        
        /**
         * Sets the "SexOfPatientsCode" element
         */
        void setSexOfPatientsCode(uk.nhs.nhsia.datastandards.ecds.SexOfPatientsCodeType.Enum sexOfPatientsCode);
        
        /**
         * Sets (as xml) the "SexOfPatientsCode" element
         */
        void xsetSexOfPatientsCode(uk.nhs.nhsia.datastandards.ecds.SexOfPatientsCodeType sexOfPatientsCode);
        
        /**
         * Unsets the "SexOfPatientsCode" element
         */
        void unsetSexOfPatientsCode();
        
        /**
         * Gets the "WardDayPeriodAvailabilityCode" element
         */
        uk.nhs.nhsia.datastandards.ecds.WardDayPeriodAvailabilityCodeType.Enum getWardDayPeriodAvailabilityCode();
        
        /**
         * Gets (as xml) the "WardDayPeriodAvailabilityCode" element
         */
        uk.nhs.nhsia.datastandards.ecds.WardDayPeriodAvailabilityCodeType xgetWardDayPeriodAvailabilityCode();
        
        /**
         * True if has "WardDayPeriodAvailabilityCode" element
         */
        boolean isSetWardDayPeriodAvailabilityCode();
        
        /**
         * Sets the "WardDayPeriodAvailabilityCode" element
         */
        void setWardDayPeriodAvailabilityCode(uk.nhs.nhsia.datastandards.ecds.WardDayPeriodAvailabilityCodeType.Enum wardDayPeriodAvailabilityCode);
        
        /**
         * Sets (as xml) the "WardDayPeriodAvailabilityCode" element
         */
        void xsetWardDayPeriodAvailabilityCode(uk.nhs.nhsia.datastandards.ecds.WardDayPeriodAvailabilityCodeType wardDayPeriodAvailabilityCode);
        
        /**
         * Unsets the "WardDayPeriodAvailabilityCode" element
         */
        void unsetWardDayPeriodAvailabilityCode();
        
        /**
         * Gets the "WardNightPeriodAvailabilityCode" element
         */
        uk.nhs.nhsia.datastandards.ecds.WardNightPeriodAvailabilityCodeType.Enum getWardNightPeriodAvailabilityCode();
        
        /**
         * Gets (as xml) the "WardNightPeriodAvailabilityCode" element
         */
        uk.nhs.nhsia.datastandards.ecds.WardNightPeriodAvailabilityCodeType xgetWardNightPeriodAvailabilityCode();
        
        /**
         * True if has "WardNightPeriodAvailabilityCode" element
         */
        boolean isSetWardNightPeriodAvailabilityCode();
        
        /**
         * Sets the "WardNightPeriodAvailabilityCode" element
         */
        void setWardNightPeriodAvailabilityCode(uk.nhs.nhsia.datastandards.ecds.WardNightPeriodAvailabilityCodeType.Enum wardNightPeriodAvailabilityCode);
        
        /**
         * Sets (as xml) the "WardNightPeriodAvailabilityCode" element
         */
        void xsetWardNightPeriodAvailabilityCode(uk.nhs.nhsia.datastandards.ecds.WardNightPeriodAvailabilityCodeType wardNightPeriodAvailabilityCode);
        
        /**
         * Unsets the "WardNightPeriodAvailabilityCode" element
         */
        void unsetWardNightPeriodAvailabilityCode();
        
        /**
         * Gets the "StartDate" element
         */
        java.util.Calendar getStartDate();
        
        /**
         * Gets (as xml) the "StartDate" element
         */
        uk.nhs.nhsia.datastandards.ecds.StartDateType xgetStartDate();
        
        /**
         * True if has "StartDate" element
         */
        boolean isSetStartDate();
        
        /**
         * Sets the "StartDate" element
         */
        void setStartDate(java.util.Calendar startDate);
        
        /**
         * Sets (as xml) the "StartDate" element
         */
        void xsetStartDate(uk.nhs.nhsia.datastandards.ecds.StartDateType startDate);
        
        /**
         * Unsets the "StartDate" element
         */
        void unsetStartDate();
        
        /**
         * Gets the "StartTime" element
         */
        java.util.Calendar getStartTime();
        
        /**
         * Gets (as xml) the "StartTime" element
         */
        uk.nhs.nhsia.datastandards.ecds.StartTimeType xgetStartTime();
        
        /**
         * True if has "StartTime" element
         */
        boolean isSetStartTime();
        
        /**
         * Sets the "StartTime" element
         */
        void setStartTime(java.util.Calendar startTime);
        
        /**
         * Sets (as xml) the "StartTime" element
         */
        void xsetStartTime(uk.nhs.nhsia.datastandards.ecds.StartTimeType startTime);
        
        /**
         * Unsets the "StartTime" element
         */
        void unsetStartTime();
        
        /**
         * Gets the "EndDate" element
         */
        java.util.Calendar getEndDate();
        
        /**
         * Gets (as xml) the "EndDate" element
         */
        uk.nhs.nhsia.datastandards.ecds.EndDateType xgetEndDate();
        
        /**
         * True if has "EndDate" element
         */
        boolean isSetEndDate();
        
        /**
         * Sets the "EndDate" element
         */
        void setEndDate(java.util.Calendar endDate);
        
        /**
         * Sets (as xml) the "EndDate" element
         */
        void xsetEndDate(uk.nhs.nhsia.datastandards.ecds.EndDateType endDate);
        
        /**
         * Unsets the "EndDate" element
         */
        void unsetEndDate();
        
        /**
         * Gets the "EndTime" element
         */
        java.util.Calendar getEndTime();
        
        /**
         * Gets (as xml) the "EndTime" element
         */
        uk.nhs.nhsia.datastandards.ecds.EndTimeType xgetEndTime();
        
        /**
         * True if has "EndTime" element
         */
        boolean isSetEndTime();
        
        /**
         * Sets the "EndTime" element
         */
        void setEndTime(java.util.Calendar endTime);
        
        /**
         * Sets (as xml) the "EndTime" element
         */
        void xsetEndTime(uk.nhs.nhsia.datastandards.ecds.EndTimeType endTime);
        
        /**
         * Unsets the "EndTime" element
         */
        void unsetEndTime();
        
        /**
         * Gets the "WardSecurityLevel" element
         */
        uk.nhs.nhsia.datastandards.ecds.WardSecurityLevelType.Enum getWardSecurityLevel();
        
        /**
         * Gets (as xml) the "WardSecurityLevel" element
         */
        uk.nhs.nhsia.datastandards.ecds.WardSecurityLevelType xgetWardSecurityLevel();
        
        /**
         * True if has "WardSecurityLevel" element
         */
        boolean isSetWardSecurityLevel();
        
        /**
         * Sets the "WardSecurityLevel" element
         */
        void setWardSecurityLevel(uk.nhs.nhsia.datastandards.ecds.WardSecurityLevelType.Enum wardSecurityLevel);
        
        /**
         * Sets (as xml) the "WardSecurityLevel" element
         */
        void xsetWardSecurityLevel(uk.nhs.nhsia.datastandards.ecds.WardSecurityLevelType wardSecurityLevel);
        
        /**
         * Unsets the "WardSecurityLevel" element
         */
        void unsetWardSecurityLevel();
        
        /**
         * Gets the "WardCode" element
         */
        java.lang.String getWardCode();
        
        /**
         * Gets (as xml) the "WardCode" element
         */
        uk.nhs.nhsia.datastandards.ecds.WardCodeType xgetWardCode();
        
        /**
         * True if has "WardCode" element
         */
        boolean isSetWardCode();
        
        /**
         * Sets the "WardCode" element
         */
        void setWardCode(java.lang.String wardCode);
        
        /**
         * Sets (as xml) the "WardCode" element
         */
        void xsetWardCode(uk.nhs.nhsia.datastandards.ecds.WardCodeType wardCode);
        
        /**
         * Unsets the "WardCode" element
         */
        void unsetWardCode();
        
        /**
         * A factory class with static methods for creating instances
         * of this type.
         */
        
        public static final class Factory
        {
            public static uk.nhs.nhsia.datastandards.ecds.APCLocationGroupStructure.WardStay newInstance() {
              return (uk.nhs.nhsia.datastandards.ecds.APCLocationGroupStructure.WardStay) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().newInstance( type, null ); }
            
            public static uk.nhs.nhsia.datastandards.ecds.APCLocationGroupStructure.WardStay newInstance(org.apache.xmlbeans.XmlOptions options) {
              return (uk.nhs.nhsia.datastandards.ecds.APCLocationGroupStructure.WardStay) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().newInstance( type, options ); }
            
            private Factory() { } // No instance of this class allowed
        }
    }
    
    /**
     * An XML EndOfEpisode(@http://www.nhsia.nhs.uk/DataStandards/XMLschema/CDS/ns).
     *
     * This is a complex type.
     */
    public interface EndOfEpisode extends org.apache.xmlbeans.XmlObject
    {
        public static final org.apache.xmlbeans.SchemaType type = (org.apache.xmlbeans.SchemaType)
            org.apache.xmlbeans.XmlBeans.typeSystemForClassLoader(EndOfEpisode.class.getClassLoader(), "schemaorg_apache_xmlbeans.system.s30C1180FF47174E0C8A992A2D657328B").resolveHandle("endofepisode70ccelemtype");
        
        /**
         * Gets the "LocationClass" element
         */
        uk.nhs.nhsia.datastandards.ecds.LocationClassType.Enum getLocationClass();
        
        /**
         * Gets (as xml) the "LocationClass" element
         */
        uk.nhs.nhsia.datastandards.ecds.LocationClassType xgetLocationClass();
        
        /**
         * True if has "LocationClass" element
         */
        boolean isSetLocationClass();
        
        /**
         * Sets the "LocationClass" element
         */
        void setLocationClass(uk.nhs.nhsia.datastandards.ecds.LocationClassType.Enum locationClass);
        
        /**
         * Sets (as xml) the "LocationClass" element
         */
        void xsetLocationClass(uk.nhs.nhsia.datastandards.ecds.LocationClassType locationClass);
        
        /**
         * Unsets the "LocationClass" element
         */
        void unsetLocationClass();
        
        /**
         * Gets the "SiteCodeOfTreatment" element
         */
        java.lang.String getSiteCodeOfTreatment();
        
        /**
         * Gets (as xml) the "SiteCodeOfTreatment" element
         */
        uk.nhs.nhsia.datastandards.ecds.SiteCodeOfTreatmentType xgetSiteCodeOfTreatment();
        
        /**
         * True if has "SiteCodeOfTreatment" element
         */
        boolean isSetSiteCodeOfTreatment();
        
        /**
         * Sets the "SiteCodeOfTreatment" element
         */
        void setSiteCodeOfTreatment(java.lang.String siteCodeOfTreatment);
        
        /**
         * Sets (as xml) the "SiteCodeOfTreatment" element
         */
        void xsetSiteCodeOfTreatment(uk.nhs.nhsia.datastandards.ecds.SiteCodeOfTreatmentType siteCodeOfTreatment);
        
        /**
         * Unsets the "SiteCodeOfTreatment" element
         */
        void unsetSiteCodeOfTreatment();
        
        /**
         * Gets the "ActivityLocationType" element
         */
        uk.nhs.nhsia.datastandards.ecds.ActivityLocationTypeType.Enum getActivityLocationType();
        
        /**
         * Gets (as xml) the "ActivityLocationType" element
         */
        uk.nhs.nhsia.datastandards.ecds.ActivityLocationTypeType xgetActivityLocationType();
        
        /**
         * True if has "ActivityLocationType" element
         */
        boolean isSetActivityLocationType();
        
        /**
         * Sets the "ActivityLocationType" element
         */
        void setActivityLocationType(uk.nhs.nhsia.datastandards.ecds.ActivityLocationTypeType.Enum activityLocationType);
        
        /**
         * Sets (as xml) the "ActivityLocationType" element
         */
        void xsetActivityLocationType(uk.nhs.nhsia.datastandards.ecds.ActivityLocationTypeType activityLocationType);
        
        /**
         * Unsets the "ActivityLocationType" element
         */
        void unsetActivityLocationType();
        
        /**
         * Gets the "IntendedClinicalCareIntensityCode" element
         */
        uk.nhs.nhsia.datastandards.ecds.IntendedClinicalCareIntensityCodeType.Enum getIntendedClinicalCareIntensityCode();
        
        /**
         * Gets (as xml) the "IntendedClinicalCareIntensityCode" element
         */
        uk.nhs.nhsia.datastandards.ecds.IntendedClinicalCareIntensityCodeType xgetIntendedClinicalCareIntensityCode();
        
        /**
         * True if has "IntendedClinicalCareIntensityCode" element
         */
        boolean isSetIntendedClinicalCareIntensityCode();
        
        /**
         * Sets the "IntendedClinicalCareIntensityCode" element
         */
        void setIntendedClinicalCareIntensityCode(uk.nhs.nhsia.datastandards.ecds.IntendedClinicalCareIntensityCodeType.Enum intendedClinicalCareIntensityCode);
        
        /**
         * Sets (as xml) the "IntendedClinicalCareIntensityCode" element
         */
        void xsetIntendedClinicalCareIntensityCode(uk.nhs.nhsia.datastandards.ecds.IntendedClinicalCareIntensityCodeType intendedClinicalCareIntensityCode);
        
        /**
         * Unsets the "IntendedClinicalCareIntensityCode" element
         */
        void unsetIntendedClinicalCareIntensityCode();
        
        /**
         * Gets the "IntendedAgeGroup" element
         */
        uk.nhs.nhsia.datastandards.ecds.IntendedAgeGroupType.Enum getIntendedAgeGroup();
        
        /**
         * Gets (as xml) the "IntendedAgeGroup" element
         */
        uk.nhs.nhsia.datastandards.ecds.IntendedAgeGroupType xgetIntendedAgeGroup();
        
        /**
         * True if has "IntendedAgeGroup" element
         */
        boolean isSetIntendedAgeGroup();
        
        /**
         * Sets the "IntendedAgeGroup" element
         */
        void setIntendedAgeGroup(uk.nhs.nhsia.datastandards.ecds.IntendedAgeGroupType.Enum intendedAgeGroup);
        
        /**
         * Sets (as xml) the "IntendedAgeGroup" element
         */
        void xsetIntendedAgeGroup(uk.nhs.nhsia.datastandards.ecds.IntendedAgeGroupType intendedAgeGroup);
        
        /**
         * Unsets the "IntendedAgeGroup" element
         */
        void unsetIntendedAgeGroup();
        
        /**
         * Gets the "SexOfPatientsCode" element
         */
        uk.nhs.nhsia.datastandards.ecds.SexOfPatientsCodeType.Enum getSexOfPatientsCode();
        
        /**
         * Gets (as xml) the "SexOfPatientsCode" element
         */
        uk.nhs.nhsia.datastandards.ecds.SexOfPatientsCodeType xgetSexOfPatientsCode();
        
        /**
         * True if has "SexOfPatientsCode" element
         */
        boolean isSetSexOfPatientsCode();
        
        /**
         * Sets the "SexOfPatientsCode" element
         */
        void setSexOfPatientsCode(uk.nhs.nhsia.datastandards.ecds.SexOfPatientsCodeType.Enum sexOfPatientsCode);
        
        /**
         * Sets (as xml) the "SexOfPatientsCode" element
         */
        void xsetSexOfPatientsCode(uk.nhs.nhsia.datastandards.ecds.SexOfPatientsCodeType sexOfPatientsCode);
        
        /**
         * Unsets the "SexOfPatientsCode" element
         */
        void unsetSexOfPatientsCode();
        
        /**
         * Gets the "WardDayPeriodAvailabilityCode" element
         */
        uk.nhs.nhsia.datastandards.ecds.WardDayPeriodAvailabilityCodeType.Enum getWardDayPeriodAvailabilityCode();
        
        /**
         * Gets (as xml) the "WardDayPeriodAvailabilityCode" element
         */
        uk.nhs.nhsia.datastandards.ecds.WardDayPeriodAvailabilityCodeType xgetWardDayPeriodAvailabilityCode();
        
        /**
         * True if has "WardDayPeriodAvailabilityCode" element
         */
        boolean isSetWardDayPeriodAvailabilityCode();
        
        /**
         * Sets the "WardDayPeriodAvailabilityCode" element
         */
        void setWardDayPeriodAvailabilityCode(uk.nhs.nhsia.datastandards.ecds.WardDayPeriodAvailabilityCodeType.Enum wardDayPeriodAvailabilityCode);
        
        /**
         * Sets (as xml) the "WardDayPeriodAvailabilityCode" element
         */
        void xsetWardDayPeriodAvailabilityCode(uk.nhs.nhsia.datastandards.ecds.WardDayPeriodAvailabilityCodeType wardDayPeriodAvailabilityCode);
        
        /**
         * Unsets the "WardDayPeriodAvailabilityCode" element
         */
        void unsetWardDayPeriodAvailabilityCode();
        
        /**
         * Gets the "WardNightPeriodAvailabilityCode" element
         */
        uk.nhs.nhsia.datastandards.ecds.WardNightPeriodAvailabilityCodeType.Enum getWardNightPeriodAvailabilityCode();
        
        /**
         * Gets (as xml) the "WardNightPeriodAvailabilityCode" element
         */
        uk.nhs.nhsia.datastandards.ecds.WardNightPeriodAvailabilityCodeType xgetWardNightPeriodAvailabilityCode();
        
        /**
         * True if has "WardNightPeriodAvailabilityCode" element
         */
        boolean isSetWardNightPeriodAvailabilityCode();
        
        /**
         * Sets the "WardNightPeriodAvailabilityCode" element
         */
        void setWardNightPeriodAvailabilityCode(uk.nhs.nhsia.datastandards.ecds.WardNightPeriodAvailabilityCodeType.Enum wardNightPeriodAvailabilityCode);
        
        /**
         * Sets (as xml) the "WardNightPeriodAvailabilityCode" element
         */
        void xsetWardNightPeriodAvailabilityCode(uk.nhs.nhsia.datastandards.ecds.WardNightPeriodAvailabilityCodeType wardNightPeriodAvailabilityCode);
        
        /**
         * Unsets the "WardNightPeriodAvailabilityCode" element
         */
        void unsetWardNightPeriodAvailabilityCode();
        
        /**
         * Gets the "WardSecurityLevel" element
         */
        uk.nhs.nhsia.datastandards.ecds.WardSecurityLevelType.Enum getWardSecurityLevel();
        
        /**
         * Gets (as xml) the "WardSecurityLevel" element
         */
        uk.nhs.nhsia.datastandards.ecds.WardSecurityLevelType xgetWardSecurityLevel();
        
        /**
         * True if has "WardSecurityLevel" element
         */
        boolean isSetWardSecurityLevel();
        
        /**
         * Sets the "WardSecurityLevel" element
         */
        void setWardSecurityLevel(uk.nhs.nhsia.datastandards.ecds.WardSecurityLevelType.Enum wardSecurityLevel);
        
        /**
         * Sets (as xml) the "WardSecurityLevel" element
         */
        void xsetWardSecurityLevel(uk.nhs.nhsia.datastandards.ecds.WardSecurityLevelType wardSecurityLevel);
        
        /**
         * Unsets the "WardSecurityLevel" element
         */
        void unsetWardSecurityLevel();
        
        /**
         * Gets the "WardCode" element
         */
        java.lang.String getWardCode();
        
        /**
         * Gets (as xml) the "WardCode" element
         */
        uk.nhs.nhsia.datastandards.ecds.WardCodeType xgetWardCode();
        
        /**
         * True if has "WardCode" element
         */
        boolean isSetWardCode();
        
        /**
         * Sets the "WardCode" element
         */
        void setWardCode(java.lang.String wardCode);
        
        /**
         * Sets (as xml) the "WardCode" element
         */
        void xsetWardCode(uk.nhs.nhsia.datastandards.ecds.WardCodeType wardCode);
        
        /**
         * Unsets the "WardCode" element
         */
        void unsetWardCode();
        
        /**
         * A factory class with static methods for creating instances
         * of this type.
         */
        
        public static final class Factory
        {
            public static uk.nhs.nhsia.datastandards.ecds.APCLocationGroupStructure.EndOfEpisode newInstance() {
              return (uk.nhs.nhsia.datastandards.ecds.APCLocationGroupStructure.EndOfEpisode) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().newInstance( type, null ); }
            
            public static uk.nhs.nhsia.datastandards.ecds.APCLocationGroupStructure.EndOfEpisode newInstance(org.apache.xmlbeans.XmlOptions options) {
              return (uk.nhs.nhsia.datastandards.ecds.APCLocationGroupStructure.EndOfEpisode) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().newInstance( type, options ); }
            
            private Factory() { } // No instance of this class allowed
        }
    }
    
    /**
     * A factory class with static methods for creating instances
     * of this type.
     */
    
    public static final class Factory
    {
        public static uk.nhs.nhsia.datastandards.ecds.APCLocationGroupStructure newInstance() {
          return (uk.nhs.nhsia.datastandards.ecds.APCLocationGroupStructure) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().newInstance( type, null ); }
        
        public static uk.nhs.nhsia.datastandards.ecds.APCLocationGroupStructure newInstance(org.apache.xmlbeans.XmlOptions options) {
          return (uk.nhs.nhsia.datastandards.ecds.APCLocationGroupStructure) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().newInstance( type, options ); }
        
        /** @param xmlAsString the string value to parse */
        public static uk.nhs.nhsia.datastandards.ecds.APCLocationGroupStructure parse(java.lang.String xmlAsString) throws org.apache.xmlbeans.XmlException {
          return (uk.nhs.nhsia.datastandards.ecds.APCLocationGroupStructure) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( xmlAsString, type, null ); }
        
        public static uk.nhs.nhsia.datastandards.ecds.APCLocationGroupStructure parse(java.lang.String xmlAsString, org.apache.xmlbeans.XmlOptions options) throws org.apache.xmlbeans.XmlException {
          return (uk.nhs.nhsia.datastandards.ecds.APCLocationGroupStructure) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( xmlAsString, type, options ); }
        
        /** @param file the file from which to load an xml document */
        public static uk.nhs.nhsia.datastandards.ecds.APCLocationGroupStructure parse(java.io.File file) throws org.apache.xmlbeans.XmlException, java.io.IOException {
          return (uk.nhs.nhsia.datastandards.ecds.APCLocationGroupStructure) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( file, type, null ); }
        
        public static uk.nhs.nhsia.datastandards.ecds.APCLocationGroupStructure parse(java.io.File file, org.apache.xmlbeans.XmlOptions options) throws org.apache.xmlbeans.XmlException, java.io.IOException {
          return (uk.nhs.nhsia.datastandards.ecds.APCLocationGroupStructure) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( file, type, options ); }
        
        public static uk.nhs.nhsia.datastandards.ecds.APCLocationGroupStructure parse(java.net.URL u) throws org.apache.xmlbeans.XmlException, java.io.IOException {
          return (uk.nhs.nhsia.datastandards.ecds.APCLocationGroupStructure) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( u, type, null ); }
        
        public static uk.nhs.nhsia.datastandards.ecds.APCLocationGroupStructure parse(java.net.URL u, org.apache.xmlbeans.XmlOptions options) throws org.apache.xmlbeans.XmlException, java.io.IOException {
          return (uk.nhs.nhsia.datastandards.ecds.APCLocationGroupStructure) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( u, type, options ); }
        
        public static uk.nhs.nhsia.datastandards.ecds.APCLocationGroupStructure parse(java.io.InputStream is) throws org.apache.xmlbeans.XmlException, java.io.IOException {
          return (uk.nhs.nhsia.datastandards.ecds.APCLocationGroupStructure) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( is, type, null ); }
        
        public static uk.nhs.nhsia.datastandards.ecds.APCLocationGroupStructure parse(java.io.InputStream is, org.apache.xmlbeans.XmlOptions options) throws org.apache.xmlbeans.XmlException, java.io.IOException {
          return (uk.nhs.nhsia.datastandards.ecds.APCLocationGroupStructure) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( is, type, options ); }
        
        public static uk.nhs.nhsia.datastandards.ecds.APCLocationGroupStructure parse(java.io.Reader r) throws org.apache.xmlbeans.XmlException, java.io.IOException {
          return (uk.nhs.nhsia.datastandards.ecds.APCLocationGroupStructure) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( r, type, null ); }
        
        public static uk.nhs.nhsia.datastandards.ecds.APCLocationGroupStructure parse(java.io.Reader r, org.apache.xmlbeans.XmlOptions options) throws org.apache.xmlbeans.XmlException, java.io.IOException {
          return (uk.nhs.nhsia.datastandards.ecds.APCLocationGroupStructure) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( r, type, options ); }
        
        public static uk.nhs.nhsia.datastandards.ecds.APCLocationGroupStructure parse(javax.xml.stream.XMLStreamReader sr) throws org.apache.xmlbeans.XmlException {
          return (uk.nhs.nhsia.datastandards.ecds.APCLocationGroupStructure) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( sr, type, null ); }
        
        public static uk.nhs.nhsia.datastandards.ecds.APCLocationGroupStructure parse(javax.xml.stream.XMLStreamReader sr, org.apache.xmlbeans.XmlOptions options) throws org.apache.xmlbeans.XmlException {
          return (uk.nhs.nhsia.datastandards.ecds.APCLocationGroupStructure) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( sr, type, options ); }
        
        public static uk.nhs.nhsia.datastandards.ecds.APCLocationGroupStructure parse(org.w3c.dom.Node node) throws org.apache.xmlbeans.XmlException {
          return (uk.nhs.nhsia.datastandards.ecds.APCLocationGroupStructure) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( node, type, null ); }
        
        public static uk.nhs.nhsia.datastandards.ecds.APCLocationGroupStructure parse(org.w3c.dom.Node node, org.apache.xmlbeans.XmlOptions options) throws org.apache.xmlbeans.XmlException {
          return (uk.nhs.nhsia.datastandards.ecds.APCLocationGroupStructure) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( node, type, options ); }
        
        /** @deprecated {@link org.apache.xmlbeans.xml.stream.XMLInputStream} */
        public static uk.nhs.nhsia.datastandards.ecds.APCLocationGroupStructure parse(org.apache.xmlbeans.xml.stream.XMLInputStream xis) throws org.apache.xmlbeans.XmlException, org.apache.xmlbeans.xml.stream.XMLStreamException {
          return (uk.nhs.nhsia.datastandards.ecds.APCLocationGroupStructure) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( xis, type, null ); }
        
        /** @deprecated {@link org.apache.xmlbeans.xml.stream.XMLInputStream} */
        public static uk.nhs.nhsia.datastandards.ecds.APCLocationGroupStructure parse(org.apache.xmlbeans.xml.stream.XMLInputStream xis, org.apache.xmlbeans.XmlOptions options) throws org.apache.xmlbeans.XmlException, org.apache.xmlbeans.xml.stream.XMLStreamException {
          return (uk.nhs.nhsia.datastandards.ecds.APCLocationGroupStructure) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( xis, type, options ); }
        
        /** @deprecated {@link org.apache.xmlbeans.xml.stream.XMLInputStream} */
        public static org.apache.xmlbeans.xml.stream.XMLInputStream newValidatingXMLInputStream(org.apache.xmlbeans.xml.stream.XMLInputStream xis) throws org.apache.xmlbeans.XmlException, org.apache.xmlbeans.xml.stream.XMLStreamException {
          return org.apache.xmlbeans.XmlBeans.getContextTypeLoader().newValidatingXMLInputStream( xis, type, null ); }
        
        /** @deprecated {@link org.apache.xmlbeans.xml.stream.XMLInputStream} */
        public static org.apache.xmlbeans.xml.stream.XMLInputStream newValidatingXMLInputStream(org.apache.xmlbeans.xml.stream.XMLInputStream xis, org.apache.xmlbeans.XmlOptions options) throws org.apache.xmlbeans.XmlException, org.apache.xmlbeans.xml.stream.XMLStreamException {
          return org.apache.xmlbeans.XmlBeans.getContextTypeLoader().newValidatingXMLInputStream( xis, type, options ); }
        
        private Factory() { } // No instance of this class allowed
    }
}
