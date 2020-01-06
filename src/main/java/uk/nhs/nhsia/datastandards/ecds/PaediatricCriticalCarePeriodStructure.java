/*
 * XML Type:  PaediatricCriticalCarePeriod_Structure
 * Namespace: http://www.nhsia.nhs.uk/DataStandards/XMLschema/CDS/ns
 * Java type: uk.nhs.nhsia.datastandards.ecds.PaediatricCriticalCarePeriodStructure
 *
 * Automatically generated - do not modify.
 */
package uk.nhs.nhsia.datastandards.ecds;


/**
 * An XML PaediatricCriticalCarePeriod_Structure(@http://www.nhsia.nhs.uk/DataStandards/XMLschema/CDS/ns).
 *
 * This is a complex type.
 */
public interface PaediatricCriticalCarePeriodStructure extends org.apache.xmlbeans.XmlObject
{
    public static final org.apache.xmlbeans.SchemaType type = (org.apache.xmlbeans.SchemaType)
        org.apache.xmlbeans.XmlBeans.typeSystemForClassLoader(PaediatricCriticalCarePeriodStructure.class.getClassLoader(), "schemaorg_apache_xmlbeans.system.s30C1180FF47174E0C8A992A2D657328B").resolveHandle("paediatriccriticalcareperiodstructure112ctype");
    
    /**
     * Gets the "PCC_AdmissionCharacteristics" element
     */
    uk.nhs.nhsia.datastandards.ecds.PaediatricCriticalCarePeriodStructure.PCCAdmissionCharacteristics getPCCAdmissionCharacteristics();
    
    /**
     * Sets the "PCC_AdmissionCharacteristics" element
     */
    void setPCCAdmissionCharacteristics(uk.nhs.nhsia.datastandards.ecds.PaediatricCriticalCarePeriodStructure.PCCAdmissionCharacteristics pccAdmissionCharacteristics);
    
    /**
     * Appends and returns a new empty "PCC_AdmissionCharacteristics" element
     */
    uk.nhs.nhsia.datastandards.ecds.PaediatricCriticalCarePeriodStructure.PCCAdmissionCharacteristics addNewPCCAdmissionCharacteristics();
    
    /**
     * Gets array of all "PCC_CareActivityGroup" elements
     */
    uk.nhs.nhsia.datastandards.ecds.PaediatricCriticalCarePeriodStructure.PCCCareActivityGroup[] getPCCCareActivityGroupArray();
    
    /**
     * Gets ith "PCC_CareActivityGroup" element
     */
    uk.nhs.nhsia.datastandards.ecds.PaediatricCriticalCarePeriodStructure.PCCCareActivityGroup getPCCCareActivityGroupArray(int i);
    
    /**
     * Returns number of "PCC_CareActivityGroup" element
     */
    int sizeOfPCCCareActivityGroupArray();
    
    /**
     * Sets array of all "PCC_CareActivityGroup" element
     */
    void setPCCCareActivityGroupArray(uk.nhs.nhsia.datastandards.ecds.PaediatricCriticalCarePeriodStructure.PCCCareActivityGroup[] pccCareActivityGroupArray);
    
    /**
     * Sets ith "PCC_CareActivityGroup" element
     */
    void setPCCCareActivityGroupArray(int i, uk.nhs.nhsia.datastandards.ecds.PaediatricCriticalCarePeriodStructure.PCCCareActivityGroup pccCareActivityGroup);
    
    /**
     * Inserts and returns a new empty value (as xml) as the ith "PCC_CareActivityGroup" element
     */
    uk.nhs.nhsia.datastandards.ecds.PaediatricCriticalCarePeriodStructure.PCCCareActivityGroup insertNewPCCCareActivityGroup(int i);
    
    /**
     * Appends and returns a new empty value (as xml) as the last "PCC_CareActivityGroup" element
     */
    uk.nhs.nhsia.datastandards.ecds.PaediatricCriticalCarePeriodStructure.PCCCareActivityGroup addNewPCCCareActivityGroup();
    
    /**
     * Removes the ith "PCC_CareActivityGroup" element
     */
    void removePCCCareActivityGroup(int i);
    
    /**
     * Gets the "PCC_DischargeCharacteristics" element
     */
    uk.nhs.nhsia.datastandards.ecds.PaediatricCriticalCarePeriodStructure.PCCDischargeCharacteristics getPCCDischargeCharacteristics();
    
    /**
     * True if has "PCC_DischargeCharacteristics" element
     */
    boolean isSetPCCDischargeCharacteristics();
    
    /**
     * Sets the "PCC_DischargeCharacteristics" element
     */
    void setPCCDischargeCharacteristics(uk.nhs.nhsia.datastandards.ecds.PaediatricCriticalCarePeriodStructure.PCCDischargeCharacteristics pccDischargeCharacteristics);
    
    /**
     * Appends and returns a new empty "PCC_DischargeCharacteristics" element
     */
    uk.nhs.nhsia.datastandards.ecds.PaediatricCriticalCarePeriodStructure.PCCDischargeCharacteristics addNewPCCDischargeCharacteristics();
    
    /**
     * Unsets the "PCC_DischargeCharacteristics" element
     */
    void unsetPCCDischargeCharacteristics();
    
    /**
     * Gets the "PaediatricCriticalCareStructure" attribute
     */
    uk.nhs.nhsia.datastandards.ecds.CriticalCareUnitFunctionPaediatricType.Enum getPaediatricCriticalCareStructure();
    
    /**
     * Gets (as xml) the "PaediatricCriticalCareStructure" attribute
     */
    uk.nhs.nhsia.datastandards.ecds.CriticalCareUnitFunctionPaediatricType xgetPaediatricCriticalCareStructure();
    
    /**
     * Sets the "PaediatricCriticalCareStructure" attribute
     */
    void setPaediatricCriticalCareStructure(uk.nhs.nhsia.datastandards.ecds.CriticalCareUnitFunctionPaediatricType.Enum paediatricCriticalCareStructure);
    
    /**
     * Sets (as xml) the "PaediatricCriticalCareStructure" attribute
     */
    void xsetPaediatricCriticalCareStructure(uk.nhs.nhsia.datastandards.ecds.CriticalCareUnitFunctionPaediatricType paediatricCriticalCareStructure);
    
    /**
     * An XML PCC_AdmissionCharacteristics(@http://www.nhsia.nhs.uk/DataStandards/XMLschema/CDS/ns).
     *
     * This is a complex type.
     */
    public interface PCCAdmissionCharacteristics extends org.apache.xmlbeans.XmlObject
    {
        public static final org.apache.xmlbeans.SchemaType type = (org.apache.xmlbeans.SchemaType)
            org.apache.xmlbeans.XmlBeans.typeSystemForClassLoader(PCCAdmissionCharacteristics.class.getClassLoader(), "schemaorg_apache_xmlbeans.system.s30C1180FF47174E0C8A992A2D657328B").resolveHandle("pccadmissioncharacteristics5586elemtype");
        
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
        uk.nhs.nhsia.datastandards.ecds.CriticalCareUnitFunctionPaediatricType.Enum getCriticalCareUnitFunction();
        
        /**
         * Gets (as xml) the "CriticalCareUnitFunction" element
         */
        uk.nhs.nhsia.datastandards.ecds.CriticalCareUnitFunctionPaediatricType xgetCriticalCareUnitFunction();
        
        /**
         * Sets the "CriticalCareUnitFunction" element
         */
        void setCriticalCareUnitFunction(uk.nhs.nhsia.datastandards.ecds.CriticalCareUnitFunctionPaediatricType.Enum criticalCareUnitFunction);
        
        /**
         * Sets (as xml) the "CriticalCareUnitFunction" element
         */
        void xsetCriticalCareUnitFunction(uk.nhs.nhsia.datastandards.ecds.CriticalCareUnitFunctionPaediatricType criticalCareUnitFunction);
        
        /**
         * A factory class with static methods for creating instances
         * of this type.
         */
        
        public static final class Factory
        {
            public static uk.nhs.nhsia.datastandards.ecds.PaediatricCriticalCarePeriodStructure.PCCAdmissionCharacteristics newInstance() {
              return (uk.nhs.nhsia.datastandards.ecds.PaediatricCriticalCarePeriodStructure.PCCAdmissionCharacteristics) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().newInstance( type, null ); }
            
            public static uk.nhs.nhsia.datastandards.ecds.PaediatricCriticalCarePeriodStructure.PCCAdmissionCharacteristics newInstance(org.apache.xmlbeans.XmlOptions options) {
              return (uk.nhs.nhsia.datastandards.ecds.PaediatricCriticalCarePeriodStructure.PCCAdmissionCharacteristics) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().newInstance( type, options ); }
            
            private Factory() { } // No instance of this class allowed
        }
    }
    
    /**
     * An XML PCC_CareActivityGroup(@http://www.nhsia.nhs.uk/DataStandards/XMLschema/CDS/ns).
     *
     * This is a complex type.
     */
    public interface PCCCareActivityGroup extends org.apache.xmlbeans.XmlObject
    {
        public static final org.apache.xmlbeans.SchemaType type = (org.apache.xmlbeans.SchemaType)
            org.apache.xmlbeans.XmlBeans.typeSystemForClassLoader(PCCCareActivityGroup.class.getClassLoader(), "schemaorg_apache_xmlbeans.system.s30C1180FF47174E0C8A992A2D657328B").resolveHandle("pcccareactivitygroupb6c8elemtype");
        
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
            public static uk.nhs.nhsia.datastandards.ecds.PaediatricCriticalCarePeriodStructure.PCCCareActivityGroup newInstance() {
              return (uk.nhs.nhsia.datastandards.ecds.PaediatricCriticalCarePeriodStructure.PCCCareActivityGroup) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().newInstance( type, null ); }
            
            public static uk.nhs.nhsia.datastandards.ecds.PaediatricCriticalCarePeriodStructure.PCCCareActivityGroup newInstance(org.apache.xmlbeans.XmlOptions options) {
              return (uk.nhs.nhsia.datastandards.ecds.PaediatricCriticalCarePeriodStructure.PCCCareActivityGroup) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().newInstance( type, options ); }
            
            private Factory() { } // No instance of this class allowed
        }
    }
    
    /**
     * An XML PCC_DischargeCharacteristics(@http://www.nhsia.nhs.uk/DataStandards/XMLschema/CDS/ns).
     *
     * This is a complex type.
     */
    public interface PCCDischargeCharacteristics extends org.apache.xmlbeans.XmlObject
    {
        public static final org.apache.xmlbeans.SchemaType type = (org.apache.xmlbeans.SchemaType)
            org.apache.xmlbeans.XmlBeans.typeSystemForClassLoader(PCCDischargeCharacteristics.class.getClassLoader(), "schemaorg_apache_xmlbeans.system.s30C1180FF47174E0C8A992A2D657328B").resolveHandle("pccdischargecharacteristicsabadelemtype");
        
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
            public static uk.nhs.nhsia.datastandards.ecds.PaediatricCriticalCarePeriodStructure.PCCDischargeCharacteristics newInstance() {
              return (uk.nhs.nhsia.datastandards.ecds.PaediatricCriticalCarePeriodStructure.PCCDischargeCharacteristics) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().newInstance( type, null ); }
            
            public static uk.nhs.nhsia.datastandards.ecds.PaediatricCriticalCarePeriodStructure.PCCDischargeCharacteristics newInstance(org.apache.xmlbeans.XmlOptions options) {
              return (uk.nhs.nhsia.datastandards.ecds.PaediatricCriticalCarePeriodStructure.PCCDischargeCharacteristics) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().newInstance( type, options ); }
            
            private Factory() { } // No instance of this class allowed
        }
    }
    
    /**
     * A factory class with static methods for creating instances
     * of this type.
     */
    
    public static final class Factory
    {
        public static uk.nhs.nhsia.datastandards.ecds.PaediatricCriticalCarePeriodStructure newInstance() {
          return (uk.nhs.nhsia.datastandards.ecds.PaediatricCriticalCarePeriodStructure) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().newInstance( type, null ); }
        
        public static uk.nhs.nhsia.datastandards.ecds.PaediatricCriticalCarePeriodStructure newInstance(org.apache.xmlbeans.XmlOptions options) {
          return (uk.nhs.nhsia.datastandards.ecds.PaediatricCriticalCarePeriodStructure) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().newInstance( type, options ); }
        
        /** @param xmlAsString the string value to parse */
        public static uk.nhs.nhsia.datastandards.ecds.PaediatricCriticalCarePeriodStructure parse(java.lang.String xmlAsString) throws org.apache.xmlbeans.XmlException {
          return (uk.nhs.nhsia.datastandards.ecds.PaediatricCriticalCarePeriodStructure) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( xmlAsString, type, null ); }
        
        public static uk.nhs.nhsia.datastandards.ecds.PaediatricCriticalCarePeriodStructure parse(java.lang.String xmlAsString, org.apache.xmlbeans.XmlOptions options) throws org.apache.xmlbeans.XmlException {
          return (uk.nhs.nhsia.datastandards.ecds.PaediatricCriticalCarePeriodStructure) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( xmlAsString, type, options ); }
        
        /** @param file the file from which to load an xml document */
        public static uk.nhs.nhsia.datastandards.ecds.PaediatricCriticalCarePeriodStructure parse(java.io.File file) throws org.apache.xmlbeans.XmlException, java.io.IOException {
          return (uk.nhs.nhsia.datastandards.ecds.PaediatricCriticalCarePeriodStructure) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( file, type, null ); }
        
        public static uk.nhs.nhsia.datastandards.ecds.PaediatricCriticalCarePeriodStructure parse(java.io.File file, org.apache.xmlbeans.XmlOptions options) throws org.apache.xmlbeans.XmlException, java.io.IOException {
          return (uk.nhs.nhsia.datastandards.ecds.PaediatricCriticalCarePeriodStructure) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( file, type, options ); }
        
        public static uk.nhs.nhsia.datastandards.ecds.PaediatricCriticalCarePeriodStructure parse(java.net.URL u) throws org.apache.xmlbeans.XmlException, java.io.IOException {
          return (uk.nhs.nhsia.datastandards.ecds.PaediatricCriticalCarePeriodStructure) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( u, type, null ); }
        
        public static uk.nhs.nhsia.datastandards.ecds.PaediatricCriticalCarePeriodStructure parse(java.net.URL u, org.apache.xmlbeans.XmlOptions options) throws org.apache.xmlbeans.XmlException, java.io.IOException {
          return (uk.nhs.nhsia.datastandards.ecds.PaediatricCriticalCarePeriodStructure) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( u, type, options ); }
        
        public static uk.nhs.nhsia.datastandards.ecds.PaediatricCriticalCarePeriodStructure parse(java.io.InputStream is) throws org.apache.xmlbeans.XmlException, java.io.IOException {
          return (uk.nhs.nhsia.datastandards.ecds.PaediatricCriticalCarePeriodStructure) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( is, type, null ); }
        
        public static uk.nhs.nhsia.datastandards.ecds.PaediatricCriticalCarePeriodStructure parse(java.io.InputStream is, org.apache.xmlbeans.XmlOptions options) throws org.apache.xmlbeans.XmlException, java.io.IOException {
          return (uk.nhs.nhsia.datastandards.ecds.PaediatricCriticalCarePeriodStructure) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( is, type, options ); }
        
        public static uk.nhs.nhsia.datastandards.ecds.PaediatricCriticalCarePeriodStructure parse(java.io.Reader r) throws org.apache.xmlbeans.XmlException, java.io.IOException {
          return (uk.nhs.nhsia.datastandards.ecds.PaediatricCriticalCarePeriodStructure) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( r, type, null ); }
        
        public static uk.nhs.nhsia.datastandards.ecds.PaediatricCriticalCarePeriodStructure parse(java.io.Reader r, org.apache.xmlbeans.XmlOptions options) throws org.apache.xmlbeans.XmlException, java.io.IOException {
          return (uk.nhs.nhsia.datastandards.ecds.PaediatricCriticalCarePeriodStructure) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( r, type, options ); }
        
        public static uk.nhs.nhsia.datastandards.ecds.PaediatricCriticalCarePeriodStructure parse(javax.xml.stream.XMLStreamReader sr) throws org.apache.xmlbeans.XmlException {
          return (uk.nhs.nhsia.datastandards.ecds.PaediatricCriticalCarePeriodStructure) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( sr, type, null ); }
        
        public static uk.nhs.nhsia.datastandards.ecds.PaediatricCriticalCarePeriodStructure parse(javax.xml.stream.XMLStreamReader sr, org.apache.xmlbeans.XmlOptions options) throws org.apache.xmlbeans.XmlException {
          return (uk.nhs.nhsia.datastandards.ecds.PaediatricCriticalCarePeriodStructure) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( sr, type, options ); }
        
        public static uk.nhs.nhsia.datastandards.ecds.PaediatricCriticalCarePeriodStructure parse(org.w3c.dom.Node node) throws org.apache.xmlbeans.XmlException {
          return (uk.nhs.nhsia.datastandards.ecds.PaediatricCriticalCarePeriodStructure) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( node, type, null ); }
        
        public static uk.nhs.nhsia.datastandards.ecds.PaediatricCriticalCarePeriodStructure parse(org.w3c.dom.Node node, org.apache.xmlbeans.XmlOptions options) throws org.apache.xmlbeans.XmlException {
          return (uk.nhs.nhsia.datastandards.ecds.PaediatricCriticalCarePeriodStructure) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( node, type, options ); }
        
        /** @deprecated {@link org.apache.xmlbeans.xml.stream.XMLInputStream} */
        public static uk.nhs.nhsia.datastandards.ecds.PaediatricCriticalCarePeriodStructure parse(org.apache.xmlbeans.xml.stream.XMLInputStream xis) throws org.apache.xmlbeans.XmlException, org.apache.xmlbeans.xml.stream.XMLStreamException {
          return (uk.nhs.nhsia.datastandards.ecds.PaediatricCriticalCarePeriodStructure) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( xis, type, null ); }
        
        /** @deprecated {@link org.apache.xmlbeans.xml.stream.XMLInputStream} */
        public static uk.nhs.nhsia.datastandards.ecds.PaediatricCriticalCarePeriodStructure parse(org.apache.xmlbeans.xml.stream.XMLInputStream xis, org.apache.xmlbeans.XmlOptions options) throws org.apache.xmlbeans.XmlException, org.apache.xmlbeans.xml.stream.XMLStreamException {
          return (uk.nhs.nhsia.datastandards.ecds.PaediatricCriticalCarePeriodStructure) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( xis, type, options ); }
        
        /** @deprecated {@link org.apache.xmlbeans.xml.stream.XMLInputStream} */
        public static org.apache.xmlbeans.xml.stream.XMLInputStream newValidatingXMLInputStream(org.apache.xmlbeans.xml.stream.XMLInputStream xis) throws org.apache.xmlbeans.XmlException, org.apache.xmlbeans.xml.stream.XMLStreamException {
          return org.apache.xmlbeans.XmlBeans.getContextTypeLoader().newValidatingXMLInputStream( xis, type, null ); }
        
        /** @deprecated {@link org.apache.xmlbeans.xml.stream.XMLInputStream} */
        public static org.apache.xmlbeans.xml.stream.XMLInputStream newValidatingXMLInputStream(org.apache.xmlbeans.xml.stream.XMLInputStream xis, org.apache.xmlbeans.XmlOptions options) throws org.apache.xmlbeans.XmlException, org.apache.xmlbeans.xml.stream.XMLStreamException {
          return org.apache.xmlbeans.XmlBeans.getContextTypeLoader().newValidatingXMLInputStream( xis, type, options ); }
        
        private Factory() { } // No instance of this class allowed
    }
}
