/*
 * XML Type:  NeonatalCriticalCarePeriod_Structure
 * Namespace: http://www.nhsia.nhs.uk/DataStandards/XMLschema/CDS/ns
 * Java type: uk.nhs.nhsia.datastandards.ecds.NeonatalCriticalCarePeriodStructure
 *
 * Automatically generated - do not modify.
 */
package uk.nhs.nhsia.datastandards.ecds;


/**
 * An XML NeonatalCriticalCarePeriod_Structure(@http://www.nhsia.nhs.uk/DataStandards/XMLschema/CDS/ns).
 *
 * This is a complex type.
 */
public interface NeonatalCriticalCarePeriodStructure extends org.apache.xmlbeans.XmlObject
{
    public static final org.apache.xmlbeans.SchemaType type = (org.apache.xmlbeans.SchemaType)
        org.apache.xmlbeans.XmlBeans.typeSystemForClassLoader(NeonatalCriticalCarePeriodStructure.class.getClassLoader(), "schemaorg_apache_xmlbeans.system.s30C1180FF47174E0C8A992A2D657328B").resolveHandle("neonatalcriticalcareperiodstructure7378type");
    
    /**
     * Gets the "NCC_AdmissionCharacteristics" element
     */
    uk.nhs.nhsia.datastandards.ecds.NeonatalCriticalCarePeriodStructure.NCCAdmissionCharacteristics getNCCAdmissionCharacteristics();
    
    /**
     * Sets the "NCC_AdmissionCharacteristics" element
     */
    void setNCCAdmissionCharacteristics(uk.nhs.nhsia.datastandards.ecds.NeonatalCriticalCarePeriodStructure.NCCAdmissionCharacteristics nccAdmissionCharacteristics);
    
    /**
     * Appends and returns a new empty "NCC_AdmissionCharacteristics" element
     */
    uk.nhs.nhsia.datastandards.ecds.NeonatalCriticalCarePeriodStructure.NCCAdmissionCharacteristics addNewNCCAdmissionCharacteristics();
    
    /**
     * Gets array of all "NCC_CareActivityGroup" elements
     */
    uk.nhs.nhsia.datastandards.ecds.NeonatalCriticalCarePeriodStructure.NCCCareActivityGroup[] getNCCCareActivityGroupArray();
    
    /**
     * Gets ith "NCC_CareActivityGroup" element
     */
    uk.nhs.nhsia.datastandards.ecds.NeonatalCriticalCarePeriodStructure.NCCCareActivityGroup getNCCCareActivityGroupArray(int i);
    
    /**
     * Returns number of "NCC_CareActivityGroup" element
     */
    int sizeOfNCCCareActivityGroupArray();
    
    /**
     * Sets array of all "NCC_CareActivityGroup" element
     */
    void setNCCCareActivityGroupArray(uk.nhs.nhsia.datastandards.ecds.NeonatalCriticalCarePeriodStructure.NCCCareActivityGroup[] nccCareActivityGroupArray);
    
    /**
     * Sets ith "NCC_CareActivityGroup" element
     */
    void setNCCCareActivityGroupArray(int i, uk.nhs.nhsia.datastandards.ecds.NeonatalCriticalCarePeriodStructure.NCCCareActivityGroup nccCareActivityGroup);
    
    /**
     * Inserts and returns a new empty value (as xml) as the ith "NCC_CareActivityGroup" element
     */
    uk.nhs.nhsia.datastandards.ecds.NeonatalCriticalCarePeriodStructure.NCCCareActivityGroup insertNewNCCCareActivityGroup(int i);
    
    /**
     * Appends and returns a new empty value (as xml) as the last "NCC_CareActivityGroup" element
     */
    uk.nhs.nhsia.datastandards.ecds.NeonatalCriticalCarePeriodStructure.NCCCareActivityGroup addNewNCCCareActivityGroup();
    
    /**
     * Removes the ith "NCC_CareActivityGroup" element
     */
    void removeNCCCareActivityGroup(int i);
    
    /**
     * Gets the "NCC_DischargeCharacteristics" element
     */
    uk.nhs.nhsia.datastandards.ecds.NeonatalCriticalCarePeriodStructure.NCCDischargeCharacteristics getNCCDischargeCharacteristics();
    
    /**
     * True if has "NCC_DischargeCharacteristics" element
     */
    boolean isSetNCCDischargeCharacteristics();
    
    /**
     * Sets the "NCC_DischargeCharacteristics" element
     */
    void setNCCDischargeCharacteristics(uk.nhs.nhsia.datastandards.ecds.NeonatalCriticalCarePeriodStructure.NCCDischargeCharacteristics nccDischargeCharacteristics);
    
    /**
     * Appends and returns a new empty "NCC_DischargeCharacteristics" element
     */
    uk.nhs.nhsia.datastandards.ecds.NeonatalCriticalCarePeriodStructure.NCCDischargeCharacteristics addNewNCCDischargeCharacteristics();
    
    /**
     * Unsets the "NCC_DischargeCharacteristics" element
     */
    void unsetNCCDischargeCharacteristics();
    
    /**
     * Gets the "NeonatalCriticalCareStructure" attribute
     */
    uk.nhs.nhsia.datastandards.ecds.CriticalCareUnitFunctionNeonatalType.Enum getNeonatalCriticalCareStructure();
    
    /**
     * Gets (as xml) the "NeonatalCriticalCareStructure" attribute
     */
    uk.nhs.nhsia.datastandards.ecds.CriticalCareUnitFunctionNeonatalType xgetNeonatalCriticalCareStructure();
    
    /**
     * Sets the "NeonatalCriticalCareStructure" attribute
     */
    void setNeonatalCriticalCareStructure(uk.nhs.nhsia.datastandards.ecds.CriticalCareUnitFunctionNeonatalType.Enum neonatalCriticalCareStructure);
    
    /**
     * Sets (as xml) the "NeonatalCriticalCareStructure" attribute
     */
    void xsetNeonatalCriticalCareStructure(uk.nhs.nhsia.datastandards.ecds.CriticalCareUnitFunctionNeonatalType neonatalCriticalCareStructure);
    
    /**
     * An XML NCC_AdmissionCharacteristics(@http://www.nhsia.nhs.uk/DataStandards/XMLschema/CDS/ns).
     *
     * This is a complex type.
     */
    public interface NCCAdmissionCharacteristics extends org.apache.xmlbeans.XmlObject
    {
        public static final org.apache.xmlbeans.SchemaType type = (org.apache.xmlbeans.SchemaType)
            org.apache.xmlbeans.XmlBeans.typeSystemForClassLoader(NCCAdmissionCharacteristics.class.getClassLoader(), "schemaorg_apache_xmlbeans.system.s30C1180FF47174E0C8A992A2D657328B").resolveHandle("nccadmissioncharacteristicsc814elemtype");
        
        /**
         * Gets the "CriticalCareLocalIdentifier" element
         */
        java.lang.String getCriticalCareLocalIdentifier();
        
        /**
         * Gets (as xml) the "CriticalCareLocalIdentifier" element
         */
        uk.nhs.nhsia.datastandards.ecds.CriticalCareLocalIdentifierType xgetCriticalCareLocalIdentifier();
        
        /**
         * Sets the "CriticalCareLocalIdentifier" element
         */
        void setCriticalCareLocalIdentifier(java.lang.String criticalCareLocalIdentifier);
        
        /**
         * Sets (as xml) the "CriticalCareLocalIdentifier" element
         */
        void xsetCriticalCareLocalIdentifier(uk.nhs.nhsia.datastandards.ecds.CriticalCareLocalIdentifierType criticalCareLocalIdentifier);
        
        /**
         * Gets the "CriticalCareStartDate" element
         */
        java.util.Calendar getCriticalCareStartDate();
        
        /**
         * Gets (as xml) the "CriticalCareStartDate" element
         */
        uk.nhs.nhsia.datastandards.ecds.CriticalCareStartDateType xgetCriticalCareStartDate();
        
        /**
         * Sets the "CriticalCareStartDate" element
         */
        void setCriticalCareStartDate(java.util.Calendar criticalCareStartDate);
        
        /**
         * Sets (as xml) the "CriticalCareStartDate" element
         */
        void xsetCriticalCareStartDate(uk.nhs.nhsia.datastandards.ecds.CriticalCareStartDateType criticalCareStartDate);
        
        /**
         * Gets the "CriticalCareStartTime" element
         */
        java.util.Calendar getCriticalCareStartTime();
        
        /**
         * Gets (as xml) the "CriticalCareStartTime" element
         */
        uk.nhs.nhsia.datastandards.ecds.CriticalCareStartTimeType xgetCriticalCareStartTime();
        
        /**
         * Sets the "CriticalCareStartTime" element
         */
        void setCriticalCareStartTime(java.util.Calendar criticalCareStartTime);
        
        /**
         * Sets (as xml) the "CriticalCareStartTime" element
         */
        void xsetCriticalCareStartTime(uk.nhs.nhsia.datastandards.ecds.CriticalCareStartTimeType criticalCareStartTime);
        
        /**
         * Gets the "CriticalCareUnitFunction" element
         */
        uk.nhs.nhsia.datastandards.ecds.CriticalCareUnitFunctionNeonatalType.Enum getCriticalCareUnitFunction();
        
        /**
         * Gets (as xml) the "CriticalCareUnitFunction" element
         */
        uk.nhs.nhsia.datastandards.ecds.CriticalCareUnitFunctionNeonatalType xgetCriticalCareUnitFunction();
        
        /**
         * Sets the "CriticalCareUnitFunction" element
         */
        void setCriticalCareUnitFunction(uk.nhs.nhsia.datastandards.ecds.CriticalCareUnitFunctionNeonatalType.Enum criticalCareUnitFunction);
        
        /**
         * Sets (as xml) the "CriticalCareUnitFunction" element
         */
        void xsetCriticalCareUnitFunction(uk.nhs.nhsia.datastandards.ecds.CriticalCareUnitFunctionNeonatalType criticalCareUnitFunction);
        
        /**
         * Gets the "GestationLength_AtDelivery" element
         */
        int getGestationLengthAtDelivery();
        
        /**
         * Gets (as xml) the "GestationLength_AtDelivery" element
         */
        uk.nhs.nhsia.datastandards.ecds.GestationLengthType xgetGestationLengthAtDelivery();
        
        /**
         * Sets the "GestationLength_AtDelivery" element
         */
        void setGestationLengthAtDelivery(int gestationLengthAtDelivery);
        
        /**
         * Sets (as xml) the "GestationLength_AtDelivery" element
         */
        void xsetGestationLengthAtDelivery(uk.nhs.nhsia.datastandards.ecds.GestationLengthType gestationLengthAtDelivery);
        
        /**
         * A factory class with static methods for creating instances
         * of this type.
         */
        
        public static final class Factory
        {
            public static uk.nhs.nhsia.datastandards.ecds.NeonatalCriticalCarePeriodStructure.NCCAdmissionCharacteristics newInstance() {
              return (uk.nhs.nhsia.datastandards.ecds.NeonatalCriticalCarePeriodStructure.NCCAdmissionCharacteristics) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().newInstance( type, null ); }
            
            public static uk.nhs.nhsia.datastandards.ecds.NeonatalCriticalCarePeriodStructure.NCCAdmissionCharacteristics newInstance(org.apache.xmlbeans.XmlOptions options) {
              return (uk.nhs.nhsia.datastandards.ecds.NeonatalCriticalCarePeriodStructure.NCCAdmissionCharacteristics) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().newInstance( type, options ); }
            
            private Factory() { } // No instance of this class allowed
        }
    }
    
    /**
     * An XML NCC_CareActivityGroup(@http://www.nhsia.nhs.uk/DataStandards/XMLschema/CDS/ns).
     *
     * This is a complex type.
     */
    public interface NCCCareActivityGroup extends org.apache.xmlbeans.XmlObject
    {
        public static final org.apache.xmlbeans.SchemaType type = (org.apache.xmlbeans.SchemaType)
            org.apache.xmlbeans.XmlBeans.typeSystemForClassLoader(NCCCareActivityGroup.class.getClassLoader(), "schemaorg_apache_xmlbeans.system.s30C1180FF47174E0C8A992A2D657328B").resolveHandle("ncccareactivitygroupa492elemtype");
        
        /**
         * Gets the "ActivityDate_CriticalCare" element
         */
        java.util.Calendar getActivityDateCriticalCare();
        
        /**
         * Gets (as xml) the "ActivityDate_CriticalCare" element
         */
        uk.nhs.nhsia.datastandards.ecds.ActivityDateCriticalCareType xgetActivityDateCriticalCare();
        
        /**
         * Sets the "ActivityDate_CriticalCare" element
         */
        void setActivityDateCriticalCare(java.util.Calendar activityDateCriticalCare);
        
        /**
         * Sets (as xml) the "ActivityDate_CriticalCare" element
         */
        void xsetActivityDateCriticalCare(uk.nhs.nhsia.datastandards.ecds.ActivityDateCriticalCareType activityDateCriticalCare);
        
        /**
         * Gets the "PersonWeight" element
         */
        java.math.BigDecimal getPersonWeight();
        
        /**
         * Gets (as xml) the "PersonWeight" element
         */
        uk.nhs.nhsia.datastandards.ecds.PersonWeightType xgetPersonWeight();
        
        /**
         * True if has "PersonWeight" element
         */
        boolean isSetPersonWeight();
        
        /**
         * Sets the "PersonWeight" element
         */
        void setPersonWeight(java.math.BigDecimal personWeight);
        
        /**
         * Sets (as xml) the "PersonWeight" element
         */
        void xsetPersonWeight(uk.nhs.nhsia.datastandards.ecds.PersonWeightType personWeight);
        
        /**
         * Unsets the "PersonWeight" element
         */
        void unsetPersonWeight();
        
        /**
         * Gets array of all "CriticalCareActivityCode" elements
         */
        uk.nhs.nhsia.datastandards.ecds.CriticalCareActivityCodeType.Enum[] getCriticalCareActivityCodeArray();
        
        /**
         * Gets ith "CriticalCareActivityCode" element
         */
        uk.nhs.nhsia.datastandards.ecds.CriticalCareActivityCodeType.Enum getCriticalCareActivityCodeArray(int i);
        
        /**
         * Gets (as xml) array of all "CriticalCareActivityCode" elements
         */
        uk.nhs.nhsia.datastandards.ecds.CriticalCareActivityCodeType[] xgetCriticalCareActivityCodeArray();
        
        /**
         * Gets (as xml) ith "CriticalCareActivityCode" element
         */
        uk.nhs.nhsia.datastandards.ecds.CriticalCareActivityCodeType xgetCriticalCareActivityCodeArray(int i);
        
        /**
         * Returns number of "CriticalCareActivityCode" element
         */
        int sizeOfCriticalCareActivityCodeArray();
        
        /**
         * Sets array of all "CriticalCareActivityCode" element
         */
        void setCriticalCareActivityCodeArray(uk.nhs.nhsia.datastandards.ecds.CriticalCareActivityCodeType.Enum[] criticalCareActivityCodeArray);
        
        /**
         * Sets ith "CriticalCareActivityCode" element
         */
        void setCriticalCareActivityCodeArray(int i, uk.nhs.nhsia.datastandards.ecds.CriticalCareActivityCodeType.Enum criticalCareActivityCode);
        
        /**
         * Sets (as xml) array of all "CriticalCareActivityCode" element
         */
        void xsetCriticalCareActivityCodeArray(uk.nhs.nhsia.datastandards.ecds.CriticalCareActivityCodeType[] criticalCareActivityCodeArray);
        
        /**
         * Sets (as xml) ith "CriticalCareActivityCode" element
         */
        void xsetCriticalCareActivityCodeArray(int i, uk.nhs.nhsia.datastandards.ecds.CriticalCareActivityCodeType criticalCareActivityCode);
        
        /**
         * Inserts the value as the ith "CriticalCareActivityCode" element
         */
        void insertCriticalCareActivityCode(int i, uk.nhs.nhsia.datastandards.ecds.CriticalCareActivityCodeType.Enum criticalCareActivityCode);
        
        /**
         * Appends the value as the last "CriticalCareActivityCode" element
         */
        void addCriticalCareActivityCode(uk.nhs.nhsia.datastandards.ecds.CriticalCareActivityCodeType.Enum criticalCareActivityCode);
        
        /**
         * Inserts and returns a new empty value (as xml) as the ith "CriticalCareActivityCode" element
         */
        uk.nhs.nhsia.datastandards.ecds.CriticalCareActivityCodeType insertNewCriticalCareActivityCode(int i);
        
        /**
         * Appends and returns a new empty value (as xml) as the last "CriticalCareActivityCode" element
         */
        uk.nhs.nhsia.datastandards.ecds.CriticalCareActivityCodeType addNewCriticalCareActivityCode();
        
        /**
         * Removes the ith "CriticalCareActivityCode" element
         */
        void removeCriticalCareActivityCode(int i);
        
        /**
         * Gets array of all "HighCostDrugs_OPCS" elements
         */
        java.lang.String[] getHighCostDrugsOPCSArray();
        
        /**
         * Gets ith "HighCostDrugs_OPCS" element
         */
        java.lang.String getHighCostDrugsOPCSArray(int i);
        
        /**
         * Gets (as xml) array of all "HighCostDrugs_OPCS" elements
         */
        uk.nhs.nhsia.datastandards.ecds.HighCostDrugsOPCSType[] xgetHighCostDrugsOPCSArray();
        
        /**
         * Gets (as xml) ith "HighCostDrugs_OPCS" element
         */
        uk.nhs.nhsia.datastandards.ecds.HighCostDrugsOPCSType xgetHighCostDrugsOPCSArray(int i);
        
        /**
         * Returns number of "HighCostDrugs_OPCS" element
         */
        int sizeOfHighCostDrugsOPCSArray();
        
        /**
         * Sets array of all "HighCostDrugs_OPCS" element
         */
        void setHighCostDrugsOPCSArray(java.lang.String[] highCostDrugsOPCSArray);
        
        /**
         * Sets ith "HighCostDrugs_OPCS" element
         */
        void setHighCostDrugsOPCSArray(int i, java.lang.String highCostDrugsOPCS);
        
        /**
         * Sets (as xml) array of all "HighCostDrugs_OPCS" element
         */
        void xsetHighCostDrugsOPCSArray(uk.nhs.nhsia.datastandards.ecds.HighCostDrugsOPCSType[] highCostDrugsOPCSArray);
        
        /**
         * Sets (as xml) ith "HighCostDrugs_OPCS" element
         */
        void xsetHighCostDrugsOPCSArray(int i, uk.nhs.nhsia.datastandards.ecds.HighCostDrugsOPCSType highCostDrugsOPCS);
        
        /**
         * Inserts the value as the ith "HighCostDrugs_OPCS" element
         */
        void insertHighCostDrugsOPCS(int i, java.lang.String highCostDrugsOPCS);
        
        /**
         * Appends the value as the last "HighCostDrugs_OPCS" element
         */
        void addHighCostDrugsOPCS(java.lang.String highCostDrugsOPCS);
        
        /**
         * Inserts and returns a new empty value (as xml) as the ith "HighCostDrugs_OPCS" element
         */
        uk.nhs.nhsia.datastandards.ecds.HighCostDrugsOPCSType insertNewHighCostDrugsOPCS(int i);
        
        /**
         * Appends and returns a new empty value (as xml) as the last "HighCostDrugs_OPCS" element
         */
        uk.nhs.nhsia.datastandards.ecds.HighCostDrugsOPCSType addNewHighCostDrugsOPCS();
        
        /**
         * Removes the ith "HighCostDrugs_OPCS" element
         */
        void removeHighCostDrugsOPCS(int i);
        
        /**
         * A factory class with static methods for creating instances
         * of this type.
         */
        
        public static final class Factory
        {
            public static uk.nhs.nhsia.datastandards.ecds.NeonatalCriticalCarePeriodStructure.NCCCareActivityGroup newInstance() {
              return (uk.nhs.nhsia.datastandards.ecds.NeonatalCriticalCarePeriodStructure.NCCCareActivityGroup) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().newInstance( type, null ); }
            
            public static uk.nhs.nhsia.datastandards.ecds.NeonatalCriticalCarePeriodStructure.NCCCareActivityGroup newInstance(org.apache.xmlbeans.XmlOptions options) {
              return (uk.nhs.nhsia.datastandards.ecds.NeonatalCriticalCarePeriodStructure.NCCCareActivityGroup) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().newInstance( type, options ); }
            
            private Factory() { } // No instance of this class allowed
        }
    }
    
    /**
     * An XML NCC_DischargeCharacteristics(@http://www.nhsia.nhs.uk/DataStandards/XMLschema/CDS/ns).
     *
     * This is a complex type.
     */
    public interface NCCDischargeCharacteristics extends org.apache.xmlbeans.XmlObject
    {
        public static final org.apache.xmlbeans.SchemaType type = (org.apache.xmlbeans.SchemaType)
            org.apache.xmlbeans.XmlBeans.typeSystemForClassLoader(NCCDischargeCharacteristics.class.getClassLoader(), "schemaorg_apache_xmlbeans.system.s30C1180FF47174E0C8A992A2D657328B").resolveHandle("nccdischargecharacteristics7bfbelemtype");
        
        /**
         * Gets the "CriticalCareDischargeDate" element
         */
        java.util.Calendar getCriticalCareDischargeDate();
        
        /**
         * Gets (as xml) the "CriticalCareDischargeDate" element
         */
        uk.nhs.nhsia.datastandards.ecds.CriticalCareDischargeDateType xgetCriticalCareDischargeDate();
        
        /**
         * Sets the "CriticalCareDischargeDate" element
         */
        void setCriticalCareDischargeDate(java.util.Calendar criticalCareDischargeDate);
        
        /**
         * Sets (as xml) the "CriticalCareDischargeDate" element
         */
        void xsetCriticalCareDischargeDate(uk.nhs.nhsia.datastandards.ecds.CriticalCareDischargeDateType criticalCareDischargeDate);
        
        /**
         * Gets the "CriticalCareDischargeTime" element
         */
        java.util.Calendar getCriticalCareDischargeTime();
        
        /**
         * Gets (as xml) the "CriticalCareDischargeTime" element
         */
        uk.nhs.nhsia.datastandards.ecds.CriticalCareDischargeTimeType xgetCriticalCareDischargeTime();
        
        /**
         * Sets the "CriticalCareDischargeTime" element
         */
        void setCriticalCareDischargeTime(java.util.Calendar criticalCareDischargeTime);
        
        /**
         * Sets (as xml) the "CriticalCareDischargeTime" element
         */
        void xsetCriticalCareDischargeTime(uk.nhs.nhsia.datastandards.ecds.CriticalCareDischargeTimeType criticalCareDischargeTime);
        
        /**
         * A factory class with static methods for creating instances
         * of this type.
         */
        
        public static final class Factory
        {
            public static uk.nhs.nhsia.datastandards.ecds.NeonatalCriticalCarePeriodStructure.NCCDischargeCharacteristics newInstance() {
              return (uk.nhs.nhsia.datastandards.ecds.NeonatalCriticalCarePeriodStructure.NCCDischargeCharacteristics) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().newInstance( type, null ); }
            
            public static uk.nhs.nhsia.datastandards.ecds.NeonatalCriticalCarePeriodStructure.NCCDischargeCharacteristics newInstance(org.apache.xmlbeans.XmlOptions options) {
              return (uk.nhs.nhsia.datastandards.ecds.NeonatalCriticalCarePeriodStructure.NCCDischargeCharacteristics) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().newInstance( type, options ); }
            
            private Factory() { } // No instance of this class allowed
        }
    }
    
    /**
     * A factory class with static methods for creating instances
     * of this type.
     */
    
    public static final class Factory
    {
        public static uk.nhs.nhsia.datastandards.ecds.NeonatalCriticalCarePeriodStructure newInstance() {
          return (uk.nhs.nhsia.datastandards.ecds.NeonatalCriticalCarePeriodStructure) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().newInstance( type, null ); }
        
        public static uk.nhs.nhsia.datastandards.ecds.NeonatalCriticalCarePeriodStructure newInstance(org.apache.xmlbeans.XmlOptions options) {
          return (uk.nhs.nhsia.datastandards.ecds.NeonatalCriticalCarePeriodStructure) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().newInstance( type, options ); }
        
        /** @param xmlAsString the string value to parse */
        public static uk.nhs.nhsia.datastandards.ecds.NeonatalCriticalCarePeriodStructure parse(java.lang.String xmlAsString) throws org.apache.xmlbeans.XmlException {
          return (uk.nhs.nhsia.datastandards.ecds.NeonatalCriticalCarePeriodStructure) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( xmlAsString, type, null ); }
        
        public static uk.nhs.nhsia.datastandards.ecds.NeonatalCriticalCarePeriodStructure parse(java.lang.String xmlAsString, org.apache.xmlbeans.XmlOptions options) throws org.apache.xmlbeans.XmlException {
          return (uk.nhs.nhsia.datastandards.ecds.NeonatalCriticalCarePeriodStructure) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( xmlAsString, type, options ); }
        
        /** @param file the file from which to load an xml document */
        public static uk.nhs.nhsia.datastandards.ecds.NeonatalCriticalCarePeriodStructure parse(java.io.File file) throws org.apache.xmlbeans.XmlException, java.io.IOException {
          return (uk.nhs.nhsia.datastandards.ecds.NeonatalCriticalCarePeriodStructure) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( file, type, null ); }
        
        public static uk.nhs.nhsia.datastandards.ecds.NeonatalCriticalCarePeriodStructure parse(java.io.File file, org.apache.xmlbeans.XmlOptions options) throws org.apache.xmlbeans.XmlException, java.io.IOException {
          return (uk.nhs.nhsia.datastandards.ecds.NeonatalCriticalCarePeriodStructure) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( file, type, options ); }
        
        public static uk.nhs.nhsia.datastandards.ecds.NeonatalCriticalCarePeriodStructure parse(java.net.URL u) throws org.apache.xmlbeans.XmlException, java.io.IOException {
          return (uk.nhs.nhsia.datastandards.ecds.NeonatalCriticalCarePeriodStructure) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( u, type, null ); }
        
        public static uk.nhs.nhsia.datastandards.ecds.NeonatalCriticalCarePeriodStructure parse(java.net.URL u, org.apache.xmlbeans.XmlOptions options) throws org.apache.xmlbeans.XmlException, java.io.IOException {
          return (uk.nhs.nhsia.datastandards.ecds.NeonatalCriticalCarePeriodStructure) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( u, type, options ); }
        
        public static uk.nhs.nhsia.datastandards.ecds.NeonatalCriticalCarePeriodStructure parse(java.io.InputStream is) throws org.apache.xmlbeans.XmlException, java.io.IOException {
          return (uk.nhs.nhsia.datastandards.ecds.NeonatalCriticalCarePeriodStructure) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( is, type, null ); }
        
        public static uk.nhs.nhsia.datastandards.ecds.NeonatalCriticalCarePeriodStructure parse(java.io.InputStream is, org.apache.xmlbeans.XmlOptions options) throws org.apache.xmlbeans.XmlException, java.io.IOException {
          return (uk.nhs.nhsia.datastandards.ecds.NeonatalCriticalCarePeriodStructure) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( is, type, options ); }
        
        public static uk.nhs.nhsia.datastandards.ecds.NeonatalCriticalCarePeriodStructure parse(java.io.Reader r) throws org.apache.xmlbeans.XmlException, java.io.IOException {
          return (uk.nhs.nhsia.datastandards.ecds.NeonatalCriticalCarePeriodStructure) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( r, type, null ); }
        
        public static uk.nhs.nhsia.datastandards.ecds.NeonatalCriticalCarePeriodStructure parse(java.io.Reader r, org.apache.xmlbeans.XmlOptions options) throws org.apache.xmlbeans.XmlException, java.io.IOException {
          return (uk.nhs.nhsia.datastandards.ecds.NeonatalCriticalCarePeriodStructure) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( r, type, options ); }
        
        public static uk.nhs.nhsia.datastandards.ecds.NeonatalCriticalCarePeriodStructure parse(javax.xml.stream.XMLStreamReader sr) throws org.apache.xmlbeans.XmlException {
          return (uk.nhs.nhsia.datastandards.ecds.NeonatalCriticalCarePeriodStructure) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( sr, type, null ); }
        
        public static uk.nhs.nhsia.datastandards.ecds.NeonatalCriticalCarePeriodStructure parse(javax.xml.stream.XMLStreamReader sr, org.apache.xmlbeans.XmlOptions options) throws org.apache.xmlbeans.XmlException {
          return (uk.nhs.nhsia.datastandards.ecds.NeonatalCriticalCarePeriodStructure) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( sr, type, options ); }
        
        public static uk.nhs.nhsia.datastandards.ecds.NeonatalCriticalCarePeriodStructure parse(org.w3c.dom.Node node) throws org.apache.xmlbeans.XmlException {
          return (uk.nhs.nhsia.datastandards.ecds.NeonatalCriticalCarePeriodStructure) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( node, type, null ); }
        
        public static uk.nhs.nhsia.datastandards.ecds.NeonatalCriticalCarePeriodStructure parse(org.w3c.dom.Node node, org.apache.xmlbeans.XmlOptions options) throws org.apache.xmlbeans.XmlException {
          return (uk.nhs.nhsia.datastandards.ecds.NeonatalCriticalCarePeriodStructure) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( node, type, options ); }
        
        /** @deprecated {@link org.apache.xmlbeans.xml.stream.XMLInputStream} */
        public static uk.nhs.nhsia.datastandards.ecds.NeonatalCriticalCarePeriodStructure parse(org.apache.xmlbeans.xml.stream.XMLInputStream xis) throws org.apache.xmlbeans.XmlException, org.apache.xmlbeans.xml.stream.XMLStreamException {
          return (uk.nhs.nhsia.datastandards.ecds.NeonatalCriticalCarePeriodStructure) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( xis, type, null ); }
        
        /** @deprecated {@link org.apache.xmlbeans.xml.stream.XMLInputStream} */
        public static uk.nhs.nhsia.datastandards.ecds.NeonatalCriticalCarePeriodStructure parse(org.apache.xmlbeans.xml.stream.XMLInputStream xis, org.apache.xmlbeans.XmlOptions options) throws org.apache.xmlbeans.XmlException, org.apache.xmlbeans.xml.stream.XMLStreamException {
          return (uk.nhs.nhsia.datastandards.ecds.NeonatalCriticalCarePeriodStructure) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( xis, type, options ); }
        
        /** @deprecated {@link org.apache.xmlbeans.xml.stream.XMLInputStream} */
        public static org.apache.xmlbeans.xml.stream.XMLInputStream newValidatingXMLInputStream(org.apache.xmlbeans.xml.stream.XMLInputStream xis) throws org.apache.xmlbeans.XmlException, org.apache.xmlbeans.xml.stream.XMLStreamException {
          return org.apache.xmlbeans.XmlBeans.getContextTypeLoader().newValidatingXMLInputStream( xis, type, null ); }
        
        /** @deprecated {@link org.apache.xmlbeans.xml.stream.XMLInputStream} */
        public static org.apache.xmlbeans.xml.stream.XMLInputStream newValidatingXMLInputStream(org.apache.xmlbeans.xml.stream.XMLInputStream xis, org.apache.xmlbeans.XmlOptions options) throws org.apache.xmlbeans.XmlException, org.apache.xmlbeans.xml.stream.XMLStreamException {
          return org.apache.xmlbeans.XmlBeans.getContextTypeLoader().newValidatingXMLInputStream( xis, type, options ); }
        
        private Factory() { } // No instance of this class allowed
    }
}
