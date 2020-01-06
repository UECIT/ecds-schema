/*
 * XML Type:  PatientPathway_EC_Structure
 * Namespace: http://www.nhsia.nhs.uk/DataStandards/XMLschema/CDS/ns
 * Java type: uk.nhs.nhsia.datastandards.ecds.PatientPathwayECStructure
 *
 * Automatically generated - do not modify.
 */
package uk.nhs.nhsia.datastandards.ecds;


/**
 * An XML PatientPathway_EC_Structure(@http://www.nhsia.nhs.uk/DataStandards/XMLschema/CDS/ns).
 *
 * This is a complex type.
 */
public interface PatientPathwayECStructure extends org.apache.xmlbeans.XmlObject
{
    public static final org.apache.xmlbeans.SchemaType type = (org.apache.xmlbeans.SchemaType)
        org.apache.xmlbeans.XmlBeans.typeSystemForClassLoader(PatientPathwayECStructure.class.getClassLoader(), "schemaorg_apache_xmlbeans.system.s30C1180FF47174E0C8A992A2D657328B").resolveHandle("patientpathwayecstructure35d7type");
    
    /**
     * Gets the "PatientPathwayIdentity" element
     */
    uk.nhs.nhsia.datastandards.ecds.PatientPathwayECStructure.PatientPathwayIdentity getPatientPathwayIdentity();
    
    /**
     * Sets the "PatientPathwayIdentity" element
     */
    void setPatientPathwayIdentity(uk.nhs.nhsia.datastandards.ecds.PatientPathwayECStructure.PatientPathwayIdentity patientPathwayIdentity);
    
    /**
     * Appends and returns a new empty "PatientPathwayIdentity" element
     */
    uk.nhs.nhsia.datastandards.ecds.PatientPathwayECStructure.PatientPathwayIdentity addNewPatientPathwayIdentity();
    
    /**
     * Gets the "RTTPeriodCharacteristics" element
     */
    uk.nhs.nhsia.datastandards.ecds.PatientPathwayECStructure.RTTPeriodCharacteristics getRTTPeriodCharacteristics();
    
    /**
     * Sets the "RTTPeriodCharacteristics" element
     */
    void setRTTPeriodCharacteristics(uk.nhs.nhsia.datastandards.ecds.PatientPathwayECStructure.RTTPeriodCharacteristics rttPeriodCharacteristics);
    
    /**
     * Appends and returns a new empty "RTTPeriodCharacteristics" element
     */
    uk.nhs.nhsia.datastandards.ecds.PatientPathwayECStructure.RTTPeriodCharacteristics addNewRTTPeriodCharacteristics();
    
    /**
     * An XML PatientPathwayIdentity(@http://www.nhsia.nhs.uk/DataStandards/XMLschema/CDS/ns).
     *
     * This is a complex type.
     */
    public interface PatientPathwayIdentity extends org.apache.xmlbeans.XmlObject
    {
        public static final org.apache.xmlbeans.SchemaType type = (org.apache.xmlbeans.SchemaType)
            org.apache.xmlbeans.XmlBeans.typeSystemForClassLoader(PatientPathwayIdentity.class.getClassLoader(), "schemaorg_apache_xmlbeans.system.s30C1180FF47174E0C8A992A2D657328B").resolveHandle("patientpathwayidentity8ab8elemtype");
        
        /**
         * Gets the "UniqueBookingReferenceNumber_Converted" element
         */
        java.lang.String getUniqueBookingReferenceNumberConverted();
        
        /**
         * Gets (as xml) the "UniqueBookingReferenceNumber_Converted" element
         */
        uk.nhs.nhsia.datastandards.ecds.UBRNConvertedType xgetUniqueBookingReferenceNumberConverted();
        
        /**
         * True if has "UniqueBookingReferenceNumber_Converted" element
         */
        boolean isSetUniqueBookingReferenceNumberConverted();
        
        /**
         * Sets the "UniqueBookingReferenceNumber_Converted" element
         */
        void setUniqueBookingReferenceNumberConverted(java.lang.String uniqueBookingReferenceNumberConverted);
        
        /**
         * Sets (as xml) the "UniqueBookingReferenceNumber_Converted" element
         */
        void xsetUniqueBookingReferenceNumberConverted(uk.nhs.nhsia.datastandards.ecds.UBRNConvertedType uniqueBookingReferenceNumberConverted);
        
        /**
         * Unsets the "UniqueBookingReferenceNumber_Converted" element
         */
        void unsetUniqueBookingReferenceNumberConverted();
        
        /**
         * Gets the "PatientPathwayIdentifier" element
         */
        java.lang.String getPatientPathwayIdentifier();
        
        /**
         * Gets (as xml) the "PatientPathwayIdentifier" element
         */
        uk.nhs.nhsia.datastandards.ecds.PatientPathwayIdentifierType xgetPatientPathwayIdentifier();
        
        /**
         * True if has "PatientPathwayIdentifier" element
         */
        boolean isSetPatientPathwayIdentifier();
        
        /**
         * Sets the "PatientPathwayIdentifier" element
         */
        void setPatientPathwayIdentifier(java.lang.String patientPathwayIdentifier);
        
        /**
         * Sets (as xml) the "PatientPathwayIdentifier" element
         */
        void xsetPatientPathwayIdentifier(uk.nhs.nhsia.datastandards.ecds.PatientPathwayIdentifierType patientPathwayIdentifier);
        
        /**
         * Unsets the "PatientPathwayIdentifier" element
         */
        void unsetPatientPathwayIdentifier();
        
        /**
         * Gets the "OrganisationIdentifier_PatientPathwayIdentifierIssuer" element
         */
        java.lang.String getOrganisationIdentifierPatientPathwayIdentifierIssuer();
        
        /**
         * Gets (as xml) the "OrganisationIdentifier_PatientPathwayIdentifierIssuer" element
         */
        uk.nhs.nhsia.datastandards.ecds.OrgIdenECType xgetOrganisationIdentifierPatientPathwayIdentifierIssuer();
        
        /**
         * Sets the "OrganisationIdentifier_PatientPathwayIdentifierIssuer" element
         */
        void setOrganisationIdentifierPatientPathwayIdentifierIssuer(java.lang.String organisationIdentifierPatientPathwayIdentifierIssuer);
        
        /**
         * Sets (as xml) the "OrganisationIdentifier_PatientPathwayIdentifierIssuer" element
         */
        void xsetOrganisationIdentifierPatientPathwayIdentifierIssuer(uk.nhs.nhsia.datastandards.ecds.OrgIdenECType organisationIdentifierPatientPathwayIdentifierIssuer);
        
        /**
         * A factory class with static methods for creating instances
         * of this type.
         */
        
        public static final class Factory
        {
            public static uk.nhs.nhsia.datastandards.ecds.PatientPathwayECStructure.PatientPathwayIdentity newInstance() {
              return (uk.nhs.nhsia.datastandards.ecds.PatientPathwayECStructure.PatientPathwayIdentity) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().newInstance( type, null ); }
            
            public static uk.nhs.nhsia.datastandards.ecds.PatientPathwayECStructure.PatientPathwayIdentity newInstance(org.apache.xmlbeans.XmlOptions options) {
              return (uk.nhs.nhsia.datastandards.ecds.PatientPathwayECStructure.PatientPathwayIdentity) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().newInstance( type, options ); }
            
            private Factory() { } // No instance of this class allowed
        }
    }
    
    /**
     * An XML RTTPeriodCharacteristics(@http://www.nhsia.nhs.uk/DataStandards/XMLschema/CDS/ns).
     *
     * This is a complex type.
     */
    public interface RTTPeriodCharacteristics extends org.apache.xmlbeans.XmlObject
    {
        public static final org.apache.xmlbeans.SchemaType type = (org.apache.xmlbeans.SchemaType)
            org.apache.xmlbeans.XmlBeans.typeSystemForClassLoader(RTTPeriodCharacteristics.class.getClassLoader(), "schemaorg_apache_xmlbeans.system.s30C1180FF47174E0C8A992A2D657328B").resolveHandle("rttperiodcharacteristics08d6elemtype");
        
        /**
         * Gets the "ReferralToTreatmentPeriod_Status" element
         */
        uk.nhs.nhsia.datastandards.ecds.ReferralToTreatmentPeriodStatusType.Enum getReferralToTreatmentPeriodStatus();
        
        /**
         * Gets (as xml) the "ReferralToTreatmentPeriod_Status" element
         */
        uk.nhs.nhsia.datastandards.ecds.ReferralToTreatmentPeriodStatusType xgetReferralToTreatmentPeriodStatus();
        
        /**
         * Sets the "ReferralToTreatmentPeriod_Status" element
         */
        void setReferralToTreatmentPeriodStatus(uk.nhs.nhsia.datastandards.ecds.ReferralToTreatmentPeriodStatusType.Enum referralToTreatmentPeriodStatus);
        
        /**
         * Sets (as xml) the "ReferralToTreatmentPeriod_Status" element
         */
        void xsetReferralToTreatmentPeriodStatus(uk.nhs.nhsia.datastandards.ecds.ReferralToTreatmentPeriodStatusType referralToTreatmentPeriodStatus);
        
        /**
         * Gets the "WaitingTimeMeasurementType" element
         */
        uk.nhs.nhsia.datastandards.ecds.WaitingTimeMeasurementTypeType.Enum getWaitingTimeMeasurementType();
        
        /**
         * Gets (as xml) the "WaitingTimeMeasurementType" element
         */
        uk.nhs.nhsia.datastandards.ecds.WaitingTimeMeasurementTypeType xgetWaitingTimeMeasurementType();
        
        /**
         * Sets the "WaitingTimeMeasurementType" element
         */
        void setWaitingTimeMeasurementType(uk.nhs.nhsia.datastandards.ecds.WaitingTimeMeasurementTypeType.Enum waitingTimeMeasurementType);
        
        /**
         * Sets (as xml) the "WaitingTimeMeasurementType" element
         */
        void xsetWaitingTimeMeasurementType(uk.nhs.nhsia.datastandards.ecds.WaitingTimeMeasurementTypeType waitingTimeMeasurementType);
        
        /**
         * Gets the "ReferralToTreatmentPeriod_StartDate" element
         */
        java.util.Calendar getReferralToTreatmentPeriodStartDate();
        
        /**
         * Gets (as xml) the "ReferralToTreatmentPeriod_StartDate" element
         */
        uk.nhs.nhsia.datastandards.ecds.ReferralToTreatmentPeriodStartDateType xgetReferralToTreatmentPeriodStartDate();
        
        /**
         * True if has "ReferralToTreatmentPeriod_StartDate" element
         */
        boolean isSetReferralToTreatmentPeriodStartDate();
        
        /**
         * Sets the "ReferralToTreatmentPeriod_StartDate" element
         */
        void setReferralToTreatmentPeriodStartDate(java.util.Calendar referralToTreatmentPeriodStartDate);
        
        /**
         * Sets (as xml) the "ReferralToTreatmentPeriod_StartDate" element
         */
        void xsetReferralToTreatmentPeriodStartDate(uk.nhs.nhsia.datastandards.ecds.ReferralToTreatmentPeriodStartDateType referralToTreatmentPeriodStartDate);
        
        /**
         * Unsets the "ReferralToTreatmentPeriod_StartDate" element
         */
        void unsetReferralToTreatmentPeriodStartDate();
        
        /**
         * Gets the "ReferralToTreatmentPeriod_EndDate" element
         */
        java.util.Calendar getReferralToTreatmentPeriodEndDate();
        
        /**
         * Gets (as xml) the "ReferralToTreatmentPeriod_EndDate" element
         */
        uk.nhs.nhsia.datastandards.ecds.ReferralToTreatmentPeriodEndDateType xgetReferralToTreatmentPeriodEndDate();
        
        /**
         * True if has "ReferralToTreatmentPeriod_EndDate" element
         */
        boolean isSetReferralToTreatmentPeriodEndDate();
        
        /**
         * Sets the "ReferralToTreatmentPeriod_EndDate" element
         */
        void setReferralToTreatmentPeriodEndDate(java.util.Calendar referralToTreatmentPeriodEndDate);
        
        /**
         * Sets (as xml) the "ReferralToTreatmentPeriod_EndDate" element
         */
        void xsetReferralToTreatmentPeriodEndDate(uk.nhs.nhsia.datastandards.ecds.ReferralToTreatmentPeriodEndDateType referralToTreatmentPeriodEndDate);
        
        /**
         * Unsets the "ReferralToTreatmentPeriod_EndDate" element
         */
        void unsetReferralToTreatmentPeriodEndDate();
        
        /**
         * A factory class with static methods for creating instances
         * of this type.
         */
        
        public static final class Factory
        {
            public static uk.nhs.nhsia.datastandards.ecds.PatientPathwayECStructure.RTTPeriodCharacteristics newInstance() {
              return (uk.nhs.nhsia.datastandards.ecds.PatientPathwayECStructure.RTTPeriodCharacteristics) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().newInstance( type, null ); }
            
            public static uk.nhs.nhsia.datastandards.ecds.PatientPathwayECStructure.RTTPeriodCharacteristics newInstance(org.apache.xmlbeans.XmlOptions options) {
              return (uk.nhs.nhsia.datastandards.ecds.PatientPathwayECStructure.RTTPeriodCharacteristics) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().newInstance( type, options ); }
            
            private Factory() { } // No instance of this class allowed
        }
    }
    
    /**
     * A factory class with static methods for creating instances
     * of this type.
     */
    
    public static final class Factory
    {
        public static uk.nhs.nhsia.datastandards.ecds.PatientPathwayECStructure newInstance() {
          return (uk.nhs.nhsia.datastandards.ecds.PatientPathwayECStructure) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().newInstance( type, null ); }
        
        public static uk.nhs.nhsia.datastandards.ecds.PatientPathwayECStructure newInstance(org.apache.xmlbeans.XmlOptions options) {
          return (uk.nhs.nhsia.datastandards.ecds.PatientPathwayECStructure) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().newInstance( type, options ); }
        
        /** @param xmlAsString the string value to parse */
        public static uk.nhs.nhsia.datastandards.ecds.PatientPathwayECStructure parse(java.lang.String xmlAsString) throws org.apache.xmlbeans.XmlException {
          return (uk.nhs.nhsia.datastandards.ecds.PatientPathwayECStructure) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( xmlAsString, type, null ); }
        
        public static uk.nhs.nhsia.datastandards.ecds.PatientPathwayECStructure parse(java.lang.String xmlAsString, org.apache.xmlbeans.XmlOptions options) throws org.apache.xmlbeans.XmlException {
          return (uk.nhs.nhsia.datastandards.ecds.PatientPathwayECStructure) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( xmlAsString, type, options ); }
        
        /** @param file the file from which to load an xml document */
        public static uk.nhs.nhsia.datastandards.ecds.PatientPathwayECStructure parse(java.io.File file) throws org.apache.xmlbeans.XmlException, java.io.IOException {
          return (uk.nhs.nhsia.datastandards.ecds.PatientPathwayECStructure) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( file, type, null ); }
        
        public static uk.nhs.nhsia.datastandards.ecds.PatientPathwayECStructure parse(java.io.File file, org.apache.xmlbeans.XmlOptions options) throws org.apache.xmlbeans.XmlException, java.io.IOException {
          return (uk.nhs.nhsia.datastandards.ecds.PatientPathwayECStructure) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( file, type, options ); }
        
        public static uk.nhs.nhsia.datastandards.ecds.PatientPathwayECStructure parse(java.net.URL u) throws org.apache.xmlbeans.XmlException, java.io.IOException {
          return (uk.nhs.nhsia.datastandards.ecds.PatientPathwayECStructure) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( u, type, null ); }
        
        public static uk.nhs.nhsia.datastandards.ecds.PatientPathwayECStructure parse(java.net.URL u, org.apache.xmlbeans.XmlOptions options) throws org.apache.xmlbeans.XmlException, java.io.IOException {
          return (uk.nhs.nhsia.datastandards.ecds.PatientPathwayECStructure) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( u, type, options ); }
        
        public static uk.nhs.nhsia.datastandards.ecds.PatientPathwayECStructure parse(java.io.InputStream is) throws org.apache.xmlbeans.XmlException, java.io.IOException {
          return (uk.nhs.nhsia.datastandards.ecds.PatientPathwayECStructure) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( is, type, null ); }
        
        public static uk.nhs.nhsia.datastandards.ecds.PatientPathwayECStructure parse(java.io.InputStream is, org.apache.xmlbeans.XmlOptions options) throws org.apache.xmlbeans.XmlException, java.io.IOException {
          return (uk.nhs.nhsia.datastandards.ecds.PatientPathwayECStructure) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( is, type, options ); }
        
        public static uk.nhs.nhsia.datastandards.ecds.PatientPathwayECStructure parse(java.io.Reader r) throws org.apache.xmlbeans.XmlException, java.io.IOException {
          return (uk.nhs.nhsia.datastandards.ecds.PatientPathwayECStructure) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( r, type, null ); }
        
        public static uk.nhs.nhsia.datastandards.ecds.PatientPathwayECStructure parse(java.io.Reader r, org.apache.xmlbeans.XmlOptions options) throws org.apache.xmlbeans.XmlException, java.io.IOException {
          return (uk.nhs.nhsia.datastandards.ecds.PatientPathwayECStructure) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( r, type, options ); }
        
        public static uk.nhs.nhsia.datastandards.ecds.PatientPathwayECStructure parse(javax.xml.stream.XMLStreamReader sr) throws org.apache.xmlbeans.XmlException {
          return (uk.nhs.nhsia.datastandards.ecds.PatientPathwayECStructure) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( sr, type, null ); }
        
        public static uk.nhs.nhsia.datastandards.ecds.PatientPathwayECStructure parse(javax.xml.stream.XMLStreamReader sr, org.apache.xmlbeans.XmlOptions options) throws org.apache.xmlbeans.XmlException {
          return (uk.nhs.nhsia.datastandards.ecds.PatientPathwayECStructure) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( sr, type, options ); }
        
        public static uk.nhs.nhsia.datastandards.ecds.PatientPathwayECStructure parse(org.w3c.dom.Node node) throws org.apache.xmlbeans.XmlException {
          return (uk.nhs.nhsia.datastandards.ecds.PatientPathwayECStructure) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( node, type, null ); }
        
        public static uk.nhs.nhsia.datastandards.ecds.PatientPathwayECStructure parse(org.w3c.dom.Node node, org.apache.xmlbeans.XmlOptions options) throws org.apache.xmlbeans.XmlException {
          return (uk.nhs.nhsia.datastandards.ecds.PatientPathwayECStructure) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( node, type, options ); }
        
        /** @deprecated {@link org.apache.xmlbeans.xml.stream.XMLInputStream} */
        public static uk.nhs.nhsia.datastandards.ecds.PatientPathwayECStructure parse(org.apache.xmlbeans.xml.stream.XMLInputStream xis) throws org.apache.xmlbeans.XmlException, org.apache.xmlbeans.xml.stream.XMLStreamException {
          return (uk.nhs.nhsia.datastandards.ecds.PatientPathwayECStructure) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( xis, type, null ); }
        
        /** @deprecated {@link org.apache.xmlbeans.xml.stream.XMLInputStream} */
        public static uk.nhs.nhsia.datastandards.ecds.PatientPathwayECStructure parse(org.apache.xmlbeans.xml.stream.XMLInputStream xis, org.apache.xmlbeans.XmlOptions options) throws org.apache.xmlbeans.XmlException, org.apache.xmlbeans.xml.stream.XMLStreamException {
          return (uk.nhs.nhsia.datastandards.ecds.PatientPathwayECStructure) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( xis, type, options ); }
        
        /** @deprecated {@link org.apache.xmlbeans.xml.stream.XMLInputStream} */
        public static org.apache.xmlbeans.xml.stream.XMLInputStream newValidatingXMLInputStream(org.apache.xmlbeans.xml.stream.XMLInputStream xis) throws org.apache.xmlbeans.XmlException, org.apache.xmlbeans.xml.stream.XMLStreamException {
          return org.apache.xmlbeans.XmlBeans.getContextTypeLoader().newValidatingXMLInputStream( xis, type, null ); }
        
        /** @deprecated {@link org.apache.xmlbeans.xml.stream.XMLInputStream} */
        public static org.apache.xmlbeans.xml.stream.XMLInputStream newValidatingXMLInputStream(org.apache.xmlbeans.xml.stream.XMLInputStream xis, org.apache.xmlbeans.XmlOptions options) throws org.apache.xmlbeans.XmlException, org.apache.xmlbeans.xml.stream.XMLStreamException {
          return org.apache.xmlbeans.XmlBeans.getContextTypeLoader().newValidatingXMLInputStream( xis, type, options ); }
        
        private Factory() { } // No instance of this class allowed
    }
}
