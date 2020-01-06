/*
 * XML Type:  PersonGroupPatient_EC_Structure
 * Namespace: http://www.nhsia.nhs.uk/DataStandards/XMLschema/CDS/ns
 * Java type: uk.nhs.nhsia.datastandards.ecds.PersonGroupPatientECStructure
 *
 * Automatically generated - do not modify.
 */
package uk.nhs.nhsia.datastandards.ecds;


/**
 * An XML PersonGroupPatient_EC_Structure(@http://www.nhsia.nhs.uk/DataStandards/XMLschema/CDS/ns).
 *
 * This is a complex type.
 */
public interface PersonGroupPatientECStructure extends org.apache.xmlbeans.XmlObject
{
    public static final org.apache.xmlbeans.SchemaType type = (org.apache.xmlbeans.SchemaType)
        org.apache.xmlbeans.XmlBeans.typeSystemForClassLoader(PersonGroupPatientECStructure.class.getClassLoader(), "schemaorg_apache_xmlbeans.system.s30C1180FF47174E0C8A992A2D657328B").resolveHandle("persongrouppatientecstructure3fedtype");
    
    /**
     * Gets the "PatientIdentity" element
     */
    uk.nhs.nhsia.datastandards.ecds.PatientIdentity getPatientIdentity();
    
    /**
     * Sets the "PatientIdentity" element
     */
    void setPatientIdentity(uk.nhs.nhsia.datastandards.ecds.PatientIdentity patientIdentity);
    
    /**
     * Appends and returns a new empty "PatientIdentity" element
     */
    uk.nhs.nhsia.datastandards.ecds.PatientIdentity addNewPatientIdentity();
    
    /**
     * Gets the "PatientCharacteristics_EmergencyCare" element
     */
    uk.nhs.nhsia.datastandards.ecds.PatientCharacteristicsEmergencyCareStructure getPatientCharacteristicsEmergencyCare();
    
    /**
     * True if has "PatientCharacteristics_EmergencyCare" element
     */
    boolean isSetPatientCharacteristicsEmergencyCare();
    
    /**
     * Sets the "PatientCharacteristics_EmergencyCare" element
     */
    void setPatientCharacteristicsEmergencyCare(uk.nhs.nhsia.datastandards.ecds.PatientCharacteristicsEmergencyCareStructure patientCharacteristicsEmergencyCare);
    
    /**
     * Appends and returns a new empty "PatientCharacteristics_EmergencyCare" element
     */
    uk.nhs.nhsia.datastandards.ecds.PatientCharacteristicsEmergencyCareStructure addNewPatientCharacteristicsEmergencyCare();
    
    /**
     * Unsets the "PatientCharacteristics_EmergencyCare" element
     */
    void unsetPatientCharacteristicsEmergencyCare();
    
    /**
     * Gets array of all "MentalHealthActLegalStatus" elements
     */
    uk.nhs.nhsia.datastandards.ecds.PersonGroupPatientECStructure.MentalHealthActLegalStatus[] getMentalHealthActLegalStatusArray();
    
    /**
     * Gets ith "MentalHealthActLegalStatus" element
     */
    uk.nhs.nhsia.datastandards.ecds.PersonGroupPatientECStructure.MentalHealthActLegalStatus getMentalHealthActLegalStatusArray(int i);
    
    /**
     * Returns number of "MentalHealthActLegalStatus" element
     */
    int sizeOfMentalHealthActLegalStatusArray();
    
    /**
     * Sets array of all "MentalHealthActLegalStatus" element
     */
    void setMentalHealthActLegalStatusArray(uk.nhs.nhsia.datastandards.ecds.PersonGroupPatientECStructure.MentalHealthActLegalStatus[] mentalHealthActLegalStatusArray);
    
    /**
     * Sets ith "MentalHealthActLegalStatus" element
     */
    void setMentalHealthActLegalStatusArray(int i, uk.nhs.nhsia.datastandards.ecds.PersonGroupPatientECStructure.MentalHealthActLegalStatus mentalHealthActLegalStatus);
    
    /**
     * Inserts and returns a new empty value (as xml) as the ith "MentalHealthActLegalStatus" element
     */
    uk.nhs.nhsia.datastandards.ecds.PersonGroupPatientECStructure.MentalHealthActLegalStatus insertNewMentalHealthActLegalStatus(int i);
    
    /**
     * Appends and returns a new empty value (as xml) as the last "MentalHealthActLegalStatus" element
     */
    uk.nhs.nhsia.datastandards.ecds.PersonGroupPatientECStructure.MentalHealthActLegalStatus addNewMentalHealthActLegalStatus();
    
    /**
     * Removes the ith "MentalHealthActLegalStatus" element
     */
    void removeMentalHealthActLegalStatus(int i);
    
    /**
     * An XML MentalHealthActLegalStatus(@http://www.nhsia.nhs.uk/DataStandards/XMLschema/CDS/ns).
     *
     * This is a complex type.
     */
    public interface MentalHealthActLegalStatus extends org.apache.xmlbeans.XmlObject
    {
        public static final org.apache.xmlbeans.SchemaType type = (org.apache.xmlbeans.SchemaType)
            org.apache.xmlbeans.XmlBeans.typeSystemForClassLoader(MentalHealthActLegalStatus.class.getClassLoader(), "schemaorg_apache_xmlbeans.system.s30C1180FF47174E0C8A992A2D657328B").resolveHandle("mentalhealthactlegalstatus8133elemtype");
        
        /**
         * Gets the "StartDate_MentalHealthActLegalStatusClassificationAssignmentPeriod" element
         */
        java.util.Calendar getStartDateMentalHealthActLegalStatusClassificationAssignmentPeriod();
        
        /**
         * Gets (as xml) the "StartDate_MentalHealthActLegalStatusClassificationAssignmentPeriod" element
         */
        uk.nhs.nhsia.datastandards.ecds.DateType xgetStartDateMentalHealthActLegalStatusClassificationAssignmentPeriod();
        
        /**
         * True if has "StartDate_MentalHealthActLegalStatusClassificationAssignmentPeriod" element
         */
        boolean isSetStartDateMentalHealthActLegalStatusClassificationAssignmentPeriod();
        
        /**
         * Sets the "StartDate_MentalHealthActLegalStatusClassificationAssignmentPeriod" element
         */
        void setStartDateMentalHealthActLegalStatusClassificationAssignmentPeriod(java.util.Calendar startDateMentalHealthActLegalStatusClassificationAssignmentPeriod);
        
        /**
         * Sets (as xml) the "StartDate_MentalHealthActLegalStatusClassificationAssignmentPeriod" element
         */
        void xsetStartDateMentalHealthActLegalStatusClassificationAssignmentPeriod(uk.nhs.nhsia.datastandards.ecds.DateType startDateMentalHealthActLegalStatusClassificationAssignmentPeriod);
        
        /**
         * Unsets the "StartDate_MentalHealthActLegalStatusClassificationAssignmentPeriod" element
         */
        void unsetStartDateMentalHealthActLegalStatusClassificationAssignmentPeriod();
        
        /**
         * Gets the "StartTime_MentalHealthActLegalStatusClassificationAssignmentPeriod" element
         */
        java.util.Calendar getStartTimeMentalHealthActLegalStatusClassificationAssignmentPeriod();
        
        /**
         * Gets (as xml) the "StartTime_MentalHealthActLegalStatusClassificationAssignmentPeriod" element
         */
        uk.nhs.nhsia.datastandards.ecds.TimeType xgetStartTimeMentalHealthActLegalStatusClassificationAssignmentPeriod();
        
        /**
         * True if has "StartTime_MentalHealthActLegalStatusClassificationAssignmentPeriod" element
         */
        boolean isSetStartTimeMentalHealthActLegalStatusClassificationAssignmentPeriod();
        
        /**
         * Sets the "StartTime_MentalHealthActLegalStatusClassificationAssignmentPeriod" element
         */
        void setStartTimeMentalHealthActLegalStatusClassificationAssignmentPeriod(java.util.Calendar startTimeMentalHealthActLegalStatusClassificationAssignmentPeriod);
        
        /**
         * Sets (as xml) the "StartTime_MentalHealthActLegalStatusClassificationAssignmentPeriod" element
         */
        void xsetStartTimeMentalHealthActLegalStatusClassificationAssignmentPeriod(uk.nhs.nhsia.datastandards.ecds.TimeType startTimeMentalHealthActLegalStatusClassificationAssignmentPeriod);
        
        /**
         * Unsets the "StartTime_MentalHealthActLegalStatusClassificationAssignmentPeriod" element
         */
        void unsetStartTimeMentalHealthActLegalStatusClassificationAssignmentPeriod();
        
        /**
         * Gets the "ExpiryDate_MentalHealthActLegalStatusClassification" element
         */
        java.util.Calendar getExpiryDateMentalHealthActLegalStatusClassification();
        
        /**
         * Gets (as xml) the "ExpiryDate_MentalHealthActLegalStatusClassification" element
         */
        uk.nhs.nhsia.datastandards.ecds.DateType xgetExpiryDateMentalHealthActLegalStatusClassification();
        
        /**
         * True if has "ExpiryDate_MentalHealthActLegalStatusClassification" element
         */
        boolean isSetExpiryDateMentalHealthActLegalStatusClassification();
        
        /**
         * Sets the "ExpiryDate_MentalHealthActLegalStatusClassification" element
         */
        void setExpiryDateMentalHealthActLegalStatusClassification(java.util.Calendar expiryDateMentalHealthActLegalStatusClassification);
        
        /**
         * Sets (as xml) the "ExpiryDate_MentalHealthActLegalStatusClassification" element
         */
        void xsetExpiryDateMentalHealthActLegalStatusClassification(uk.nhs.nhsia.datastandards.ecds.DateType expiryDateMentalHealthActLegalStatusClassification);
        
        /**
         * Unsets the "ExpiryDate_MentalHealthActLegalStatusClassification" element
         */
        void unsetExpiryDateMentalHealthActLegalStatusClassification();
        
        /**
         * Gets the "ExpiryTime_MentalHealthActLegalStatusClassification" element
         */
        java.util.Calendar getExpiryTimeMentalHealthActLegalStatusClassification();
        
        /**
         * Gets (as xml) the "ExpiryTime_MentalHealthActLegalStatusClassification" element
         */
        uk.nhs.nhsia.datastandards.ecds.TimeType xgetExpiryTimeMentalHealthActLegalStatusClassification();
        
        /**
         * True if has "ExpiryTime_MentalHealthActLegalStatusClassification" element
         */
        boolean isSetExpiryTimeMentalHealthActLegalStatusClassification();
        
        /**
         * Sets the "ExpiryTime_MentalHealthActLegalStatusClassification" element
         */
        void setExpiryTimeMentalHealthActLegalStatusClassification(java.util.Calendar expiryTimeMentalHealthActLegalStatusClassification);
        
        /**
         * Sets (as xml) the "ExpiryTime_MentalHealthActLegalStatusClassification" element
         */
        void xsetExpiryTimeMentalHealthActLegalStatusClassification(uk.nhs.nhsia.datastandards.ecds.TimeType expiryTimeMentalHealthActLegalStatusClassification);
        
        /**
         * Unsets the "ExpiryTime_MentalHealthActLegalStatusClassification" element
         */
        void unsetExpiryTimeMentalHealthActLegalStatusClassification();
        
        /**
         * Gets the "MentalHealthActLegalStatusClassificationCode" element
         */
        uk.nhs.nhsia.datastandards.ecds.MHStatusECType.Enum getMentalHealthActLegalStatusClassificationCode();
        
        /**
         * Gets (as xml) the "MentalHealthActLegalStatusClassificationCode" element
         */
        uk.nhs.nhsia.datastandards.ecds.MHStatusECType xgetMentalHealthActLegalStatusClassificationCode();
        
        /**
         * Sets the "MentalHealthActLegalStatusClassificationCode" element
         */
        void setMentalHealthActLegalStatusClassificationCode(uk.nhs.nhsia.datastandards.ecds.MHStatusECType.Enum mentalHealthActLegalStatusClassificationCode);
        
        /**
         * Sets (as xml) the "MentalHealthActLegalStatusClassificationCode" element
         */
        void xsetMentalHealthActLegalStatusClassificationCode(uk.nhs.nhsia.datastandards.ecds.MHStatusECType mentalHealthActLegalStatusClassificationCode);
        
        /**
         * A factory class with static methods for creating instances
         * of this type.
         */
        
        public static final class Factory
        {
            public static uk.nhs.nhsia.datastandards.ecds.PersonGroupPatientECStructure.MentalHealthActLegalStatus newInstance() {
              return (uk.nhs.nhsia.datastandards.ecds.PersonGroupPatientECStructure.MentalHealthActLegalStatus) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().newInstance( type, null ); }
            
            public static uk.nhs.nhsia.datastandards.ecds.PersonGroupPatientECStructure.MentalHealthActLegalStatus newInstance(org.apache.xmlbeans.XmlOptions options) {
              return (uk.nhs.nhsia.datastandards.ecds.PersonGroupPatientECStructure.MentalHealthActLegalStatus) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().newInstance( type, options ); }
            
            private Factory() { } // No instance of this class allowed
        }
    }
    
    /**
     * A factory class with static methods for creating instances
     * of this type.
     */
    
    public static final class Factory
    {
        public static uk.nhs.nhsia.datastandards.ecds.PersonGroupPatientECStructure newInstance() {
          return (uk.nhs.nhsia.datastandards.ecds.PersonGroupPatientECStructure) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().newInstance( type, null ); }
        
        public static uk.nhs.nhsia.datastandards.ecds.PersonGroupPatientECStructure newInstance(org.apache.xmlbeans.XmlOptions options) {
          return (uk.nhs.nhsia.datastandards.ecds.PersonGroupPatientECStructure) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().newInstance( type, options ); }
        
        /** @param xmlAsString the string value to parse */
        public static uk.nhs.nhsia.datastandards.ecds.PersonGroupPatientECStructure parse(java.lang.String xmlAsString) throws org.apache.xmlbeans.XmlException {
          return (uk.nhs.nhsia.datastandards.ecds.PersonGroupPatientECStructure) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( xmlAsString, type, null ); }
        
        public static uk.nhs.nhsia.datastandards.ecds.PersonGroupPatientECStructure parse(java.lang.String xmlAsString, org.apache.xmlbeans.XmlOptions options) throws org.apache.xmlbeans.XmlException {
          return (uk.nhs.nhsia.datastandards.ecds.PersonGroupPatientECStructure) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( xmlAsString, type, options ); }
        
        /** @param file the file from which to load an xml document */
        public static uk.nhs.nhsia.datastandards.ecds.PersonGroupPatientECStructure parse(java.io.File file) throws org.apache.xmlbeans.XmlException, java.io.IOException {
          return (uk.nhs.nhsia.datastandards.ecds.PersonGroupPatientECStructure) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( file, type, null ); }
        
        public static uk.nhs.nhsia.datastandards.ecds.PersonGroupPatientECStructure parse(java.io.File file, org.apache.xmlbeans.XmlOptions options) throws org.apache.xmlbeans.XmlException, java.io.IOException {
          return (uk.nhs.nhsia.datastandards.ecds.PersonGroupPatientECStructure) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( file, type, options ); }
        
        public static uk.nhs.nhsia.datastandards.ecds.PersonGroupPatientECStructure parse(java.net.URL u) throws org.apache.xmlbeans.XmlException, java.io.IOException {
          return (uk.nhs.nhsia.datastandards.ecds.PersonGroupPatientECStructure) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( u, type, null ); }
        
        public static uk.nhs.nhsia.datastandards.ecds.PersonGroupPatientECStructure parse(java.net.URL u, org.apache.xmlbeans.XmlOptions options) throws org.apache.xmlbeans.XmlException, java.io.IOException {
          return (uk.nhs.nhsia.datastandards.ecds.PersonGroupPatientECStructure) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( u, type, options ); }
        
        public static uk.nhs.nhsia.datastandards.ecds.PersonGroupPatientECStructure parse(java.io.InputStream is) throws org.apache.xmlbeans.XmlException, java.io.IOException {
          return (uk.nhs.nhsia.datastandards.ecds.PersonGroupPatientECStructure) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( is, type, null ); }
        
        public static uk.nhs.nhsia.datastandards.ecds.PersonGroupPatientECStructure parse(java.io.InputStream is, org.apache.xmlbeans.XmlOptions options) throws org.apache.xmlbeans.XmlException, java.io.IOException {
          return (uk.nhs.nhsia.datastandards.ecds.PersonGroupPatientECStructure) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( is, type, options ); }
        
        public static uk.nhs.nhsia.datastandards.ecds.PersonGroupPatientECStructure parse(java.io.Reader r) throws org.apache.xmlbeans.XmlException, java.io.IOException {
          return (uk.nhs.nhsia.datastandards.ecds.PersonGroupPatientECStructure) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( r, type, null ); }
        
        public static uk.nhs.nhsia.datastandards.ecds.PersonGroupPatientECStructure parse(java.io.Reader r, org.apache.xmlbeans.XmlOptions options) throws org.apache.xmlbeans.XmlException, java.io.IOException {
          return (uk.nhs.nhsia.datastandards.ecds.PersonGroupPatientECStructure) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( r, type, options ); }
        
        public static uk.nhs.nhsia.datastandards.ecds.PersonGroupPatientECStructure parse(javax.xml.stream.XMLStreamReader sr) throws org.apache.xmlbeans.XmlException {
          return (uk.nhs.nhsia.datastandards.ecds.PersonGroupPatientECStructure) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( sr, type, null ); }
        
        public static uk.nhs.nhsia.datastandards.ecds.PersonGroupPatientECStructure parse(javax.xml.stream.XMLStreamReader sr, org.apache.xmlbeans.XmlOptions options) throws org.apache.xmlbeans.XmlException {
          return (uk.nhs.nhsia.datastandards.ecds.PersonGroupPatientECStructure) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( sr, type, options ); }
        
        public static uk.nhs.nhsia.datastandards.ecds.PersonGroupPatientECStructure parse(org.w3c.dom.Node node) throws org.apache.xmlbeans.XmlException {
          return (uk.nhs.nhsia.datastandards.ecds.PersonGroupPatientECStructure) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( node, type, null ); }
        
        public static uk.nhs.nhsia.datastandards.ecds.PersonGroupPatientECStructure parse(org.w3c.dom.Node node, org.apache.xmlbeans.XmlOptions options) throws org.apache.xmlbeans.XmlException {
          return (uk.nhs.nhsia.datastandards.ecds.PersonGroupPatientECStructure) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( node, type, options ); }
        
        /** @deprecated {@link org.apache.xmlbeans.xml.stream.XMLInputStream} */
        public static uk.nhs.nhsia.datastandards.ecds.PersonGroupPatientECStructure parse(org.apache.xmlbeans.xml.stream.XMLInputStream xis) throws org.apache.xmlbeans.XmlException, org.apache.xmlbeans.xml.stream.XMLStreamException {
          return (uk.nhs.nhsia.datastandards.ecds.PersonGroupPatientECStructure) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( xis, type, null ); }
        
        /** @deprecated {@link org.apache.xmlbeans.xml.stream.XMLInputStream} */
        public static uk.nhs.nhsia.datastandards.ecds.PersonGroupPatientECStructure parse(org.apache.xmlbeans.xml.stream.XMLInputStream xis, org.apache.xmlbeans.XmlOptions options) throws org.apache.xmlbeans.XmlException, org.apache.xmlbeans.xml.stream.XMLStreamException {
          return (uk.nhs.nhsia.datastandards.ecds.PersonGroupPatientECStructure) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( xis, type, options ); }
        
        /** @deprecated {@link org.apache.xmlbeans.xml.stream.XMLInputStream} */
        public static org.apache.xmlbeans.xml.stream.XMLInputStream newValidatingXMLInputStream(org.apache.xmlbeans.xml.stream.XMLInputStream xis) throws org.apache.xmlbeans.XmlException, org.apache.xmlbeans.xml.stream.XMLStreamException {
          return org.apache.xmlbeans.XmlBeans.getContextTypeLoader().newValidatingXMLInputStream( xis, type, null ); }
        
        /** @deprecated {@link org.apache.xmlbeans.xml.stream.XMLInputStream} */
        public static org.apache.xmlbeans.xml.stream.XMLInputStream newValidatingXMLInputStream(org.apache.xmlbeans.xml.stream.XMLInputStream xis, org.apache.xmlbeans.XmlOptions options) throws org.apache.xmlbeans.XmlException, org.apache.xmlbeans.xml.stream.XMLStreamException {
          return org.apache.xmlbeans.XmlBeans.getContextTypeLoader().newValidatingXMLInputStream( xis, type, options ); }
        
        private Factory() { } // No instance of this class allowed
    }
}
