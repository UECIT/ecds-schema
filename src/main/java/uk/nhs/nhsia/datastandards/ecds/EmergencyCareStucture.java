/*
 * XML Type:  EmergencyCare_Stucture
 * Namespace: http://www.nhsia.nhs.uk/DataStandards/XMLschema/CDS/ns
 * Java type: uk.nhs.nhsia.datastandards.ecds.EmergencyCareStucture
 *
 * Automatically generated - do not modify.
 */
package uk.nhs.nhsia.datastandards.ecds;


/**
 * An XML EmergencyCare_Stucture(@http://www.nhsia.nhs.uk/DataStandards/XMLschema/CDS/ns).
 *
 * This is a complex type.
 */
public interface EmergencyCareStucture extends org.apache.xmlbeans.XmlObject
{
    public static final org.apache.xmlbeans.SchemaType type = (org.apache.xmlbeans.SchemaType)
        org.apache.xmlbeans.XmlBeans.typeSystemForClassLoader(EmergencyCareStucture.class.getClassLoader(), "schemaorg_apache_xmlbeans.system.s30C1180FF47174E0C8A992A2D657328B").resolveHandle("emergencycarestucture0711type");
    
    /**
     * Gets the "PatientPathway" element
     */
    uk.nhs.nhsia.datastandards.ecds.PatientPathwayECStructure getPatientPathway();
    
    /**
     * True if has "PatientPathway" element
     */
    boolean isSetPatientPathway();
    
    /**
     * Sets the "PatientPathway" element
     */
    void setPatientPathway(uk.nhs.nhsia.datastandards.ecds.PatientPathwayECStructure patientPathway);
    
    /**
     * Appends and returns a new empty "PatientPathway" element
     */
    uk.nhs.nhsia.datastandards.ecds.PatientPathwayECStructure addNewPatientPathway();
    
    /**
     * Unsets the "PatientPathway" element
     */
    void unsetPatientPathway();
    
    /**
     * Gets the "PersonGroupPatient" element
     */
    uk.nhs.nhsia.datastandards.ecds.PersonGroupPatientECStructure getPersonGroupPatient();
    
    /**
     * Sets the "PersonGroupPatient" element
     */
    void setPersonGroupPatient(uk.nhs.nhsia.datastandards.ecds.PersonGroupPatientECStructure personGroupPatient);
    
    /**
     * Appends and returns a new empty "PersonGroupPatient" element
     */
    uk.nhs.nhsia.datastandards.ecds.PersonGroupPatientECStructure addNewPersonGroupPatient();
    
    /**
     * Gets the "GPRegistration" element
     */
    uk.nhs.nhsia.datastandards.ecds.GPRegistrationStructure getGPRegistration();
    
    /**
     * True if has "GPRegistration" element
     */
    boolean isSetGPRegistration();
    
    /**
     * Sets the "GPRegistration" element
     */
    void setGPRegistration(uk.nhs.nhsia.datastandards.ecds.GPRegistrationStructure gpRegistration);
    
    /**
     * Appends and returns a new empty "GPRegistration" element
     */
    uk.nhs.nhsia.datastandards.ecds.GPRegistrationStructure addNewGPRegistration();
    
    /**
     * Unsets the "GPRegistration" element
     */
    void unsetGPRegistration();
    
    /**
     * Gets the "EmergencyCareAttendanceLocation" element
     */
    uk.nhs.nhsia.datastandards.ecds.EmergencyCareStucture.EmergencyCareAttendanceLocation getEmergencyCareAttendanceLocation();
    
    /**
     * Sets the "EmergencyCareAttendanceLocation" element
     */
    void setEmergencyCareAttendanceLocation(uk.nhs.nhsia.datastandards.ecds.EmergencyCareStucture.EmergencyCareAttendanceLocation emergencyCareAttendanceLocation);
    
    /**
     * Appends and returns a new empty "EmergencyCareAttendanceLocation" element
     */
    uk.nhs.nhsia.datastandards.ecds.EmergencyCareStucture.EmergencyCareAttendanceLocation addNewEmergencyCareAttendanceLocation();
    
    /**
     * Gets the "AttendanceOccurrence" element
     */
    uk.nhs.nhsia.datastandards.ecds.AttendanceOccurrenceECStructure getAttendanceOccurrence();
    
    /**
     * Sets the "AttendanceOccurrence" element
     */
    void setAttendanceOccurrence(uk.nhs.nhsia.datastandards.ecds.AttendanceOccurrenceECStructure attendanceOccurrence);
    
    /**
     * Appends and returns a new empty "AttendanceOccurrence" element
     */
    uk.nhs.nhsia.datastandards.ecds.AttendanceOccurrenceECStructure addNewAttendanceOccurrence();
    
    /**
     * An XML EmergencyCareAttendanceLocation(@http://www.nhsia.nhs.uk/DataStandards/XMLschema/CDS/ns).
     *
     * This is a complex type.
     */
    public interface EmergencyCareAttendanceLocation extends org.apache.xmlbeans.XmlObject
    {
        public static final org.apache.xmlbeans.SchemaType type = (org.apache.xmlbeans.SchemaType)
            org.apache.xmlbeans.XmlBeans.typeSystemForClassLoader(EmergencyCareAttendanceLocation.class.getClassLoader(), "schemaorg_apache_xmlbeans.system.s30C1180FF47174E0C8A992A2D657328B").resolveHandle("emergencycareattendancelocation8cfdelemtype");
        
        /**
         * Gets the "OrganisationSiteIdentifier_OfTreatment" element
         */
        java.lang.String getOrganisationSiteIdentifierOfTreatment();
        
        /**
         * Gets (as xml) the "OrganisationSiteIdentifier_OfTreatment" element
         */
        uk.nhs.nhsia.datastandards.ecds.AN59ECType xgetOrganisationSiteIdentifierOfTreatment();
        
        /**
         * Sets the "OrganisationSiteIdentifier_OfTreatment" element
         */
        void setOrganisationSiteIdentifierOfTreatment(java.lang.String organisationSiteIdentifierOfTreatment);
        
        /**
         * Sets (as xml) the "OrganisationSiteIdentifier_OfTreatment" element
         */
        void xsetOrganisationSiteIdentifierOfTreatment(uk.nhs.nhsia.datastandards.ecds.AN59ECType organisationSiteIdentifierOfTreatment);
        
        /**
         * Gets the "EmergencyCareDepartmentType" element
         */
        uk.nhs.nhsia.datastandards.ecds.AN2ECType.Enum getEmergencyCareDepartmentType();
        
        /**
         * Gets (as xml) the "EmergencyCareDepartmentType" element
         */
        uk.nhs.nhsia.datastandards.ecds.AN2ECType xgetEmergencyCareDepartmentType();
        
        /**
         * Sets the "EmergencyCareDepartmentType" element
         */
        void setEmergencyCareDepartmentType(uk.nhs.nhsia.datastandards.ecds.AN2ECType.Enum emergencyCareDepartmentType);
        
        /**
         * Sets (as xml) the "EmergencyCareDepartmentType" element
         */
        void xsetEmergencyCareDepartmentType(uk.nhs.nhsia.datastandards.ecds.AN2ECType emergencyCareDepartmentType);
        
        /**
         * A factory class with static methods for creating instances
         * of this type.
         */
        
        public static final class Factory
        {
            public static uk.nhs.nhsia.datastandards.ecds.EmergencyCareStucture.EmergencyCareAttendanceLocation newInstance() {
              return (uk.nhs.nhsia.datastandards.ecds.EmergencyCareStucture.EmergencyCareAttendanceLocation) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().newInstance( type, null ); }
            
            public static uk.nhs.nhsia.datastandards.ecds.EmergencyCareStucture.EmergencyCareAttendanceLocation newInstance(org.apache.xmlbeans.XmlOptions options) {
              return (uk.nhs.nhsia.datastandards.ecds.EmergencyCareStucture.EmergencyCareAttendanceLocation) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().newInstance( type, options ); }
            
            private Factory() { } // No instance of this class allowed
        }
    }
    
    /**
     * A factory class with static methods for creating instances
     * of this type.
     */
    
    public static final class Factory
    {
        public static uk.nhs.nhsia.datastandards.ecds.EmergencyCareStucture newInstance() {
          return (uk.nhs.nhsia.datastandards.ecds.EmergencyCareStucture) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().newInstance( type, null ); }
        
        public static uk.nhs.nhsia.datastandards.ecds.EmergencyCareStucture newInstance(org.apache.xmlbeans.XmlOptions options) {
          return (uk.nhs.nhsia.datastandards.ecds.EmergencyCareStucture) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().newInstance( type, options ); }
        
        /** @param xmlAsString the string value to parse */
        public static uk.nhs.nhsia.datastandards.ecds.EmergencyCareStucture parse(java.lang.String xmlAsString) throws org.apache.xmlbeans.XmlException {
          return (uk.nhs.nhsia.datastandards.ecds.EmergencyCareStucture) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( xmlAsString, type, null ); }
        
        public static uk.nhs.nhsia.datastandards.ecds.EmergencyCareStucture parse(java.lang.String xmlAsString, org.apache.xmlbeans.XmlOptions options) throws org.apache.xmlbeans.XmlException {
          return (uk.nhs.nhsia.datastandards.ecds.EmergencyCareStucture) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( xmlAsString, type, options ); }
        
        /** @param file the file from which to load an xml document */
        public static uk.nhs.nhsia.datastandards.ecds.EmergencyCareStucture parse(java.io.File file) throws org.apache.xmlbeans.XmlException, java.io.IOException {
          return (uk.nhs.nhsia.datastandards.ecds.EmergencyCareStucture) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( file, type, null ); }
        
        public static uk.nhs.nhsia.datastandards.ecds.EmergencyCareStucture parse(java.io.File file, org.apache.xmlbeans.XmlOptions options) throws org.apache.xmlbeans.XmlException, java.io.IOException {
          return (uk.nhs.nhsia.datastandards.ecds.EmergencyCareStucture) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( file, type, options ); }
        
        public static uk.nhs.nhsia.datastandards.ecds.EmergencyCareStucture parse(java.net.URL u) throws org.apache.xmlbeans.XmlException, java.io.IOException {
          return (uk.nhs.nhsia.datastandards.ecds.EmergencyCareStucture) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( u, type, null ); }
        
        public static uk.nhs.nhsia.datastandards.ecds.EmergencyCareStucture parse(java.net.URL u, org.apache.xmlbeans.XmlOptions options) throws org.apache.xmlbeans.XmlException, java.io.IOException {
          return (uk.nhs.nhsia.datastandards.ecds.EmergencyCareStucture) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( u, type, options ); }
        
        public static uk.nhs.nhsia.datastandards.ecds.EmergencyCareStucture parse(java.io.InputStream is) throws org.apache.xmlbeans.XmlException, java.io.IOException {
          return (uk.nhs.nhsia.datastandards.ecds.EmergencyCareStucture) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( is, type, null ); }
        
        public static uk.nhs.nhsia.datastandards.ecds.EmergencyCareStucture parse(java.io.InputStream is, org.apache.xmlbeans.XmlOptions options) throws org.apache.xmlbeans.XmlException, java.io.IOException {
          return (uk.nhs.nhsia.datastandards.ecds.EmergencyCareStucture) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( is, type, options ); }
        
        public static uk.nhs.nhsia.datastandards.ecds.EmergencyCareStucture parse(java.io.Reader r) throws org.apache.xmlbeans.XmlException, java.io.IOException {
          return (uk.nhs.nhsia.datastandards.ecds.EmergencyCareStucture) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( r, type, null ); }
        
        public static uk.nhs.nhsia.datastandards.ecds.EmergencyCareStucture parse(java.io.Reader r, org.apache.xmlbeans.XmlOptions options) throws org.apache.xmlbeans.XmlException, java.io.IOException {
          return (uk.nhs.nhsia.datastandards.ecds.EmergencyCareStucture) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( r, type, options ); }
        
        public static uk.nhs.nhsia.datastandards.ecds.EmergencyCareStucture parse(javax.xml.stream.XMLStreamReader sr) throws org.apache.xmlbeans.XmlException {
          return (uk.nhs.nhsia.datastandards.ecds.EmergencyCareStucture) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( sr, type, null ); }
        
        public static uk.nhs.nhsia.datastandards.ecds.EmergencyCareStucture parse(javax.xml.stream.XMLStreamReader sr, org.apache.xmlbeans.XmlOptions options) throws org.apache.xmlbeans.XmlException {
          return (uk.nhs.nhsia.datastandards.ecds.EmergencyCareStucture) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( sr, type, options ); }
        
        public static uk.nhs.nhsia.datastandards.ecds.EmergencyCareStucture parse(org.w3c.dom.Node node) throws org.apache.xmlbeans.XmlException {
          return (uk.nhs.nhsia.datastandards.ecds.EmergencyCareStucture) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( node, type, null ); }
        
        public static uk.nhs.nhsia.datastandards.ecds.EmergencyCareStucture parse(org.w3c.dom.Node node, org.apache.xmlbeans.XmlOptions options) throws org.apache.xmlbeans.XmlException {
          return (uk.nhs.nhsia.datastandards.ecds.EmergencyCareStucture) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( node, type, options ); }
        
        /** @deprecated {@link org.apache.xmlbeans.xml.stream.XMLInputStream} */
        public static uk.nhs.nhsia.datastandards.ecds.EmergencyCareStucture parse(org.apache.xmlbeans.xml.stream.XMLInputStream xis) throws org.apache.xmlbeans.XmlException, org.apache.xmlbeans.xml.stream.XMLStreamException {
          return (uk.nhs.nhsia.datastandards.ecds.EmergencyCareStucture) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( xis, type, null ); }
        
        /** @deprecated {@link org.apache.xmlbeans.xml.stream.XMLInputStream} */
        public static uk.nhs.nhsia.datastandards.ecds.EmergencyCareStucture parse(org.apache.xmlbeans.xml.stream.XMLInputStream xis, org.apache.xmlbeans.XmlOptions options) throws org.apache.xmlbeans.XmlException, org.apache.xmlbeans.xml.stream.XMLStreamException {
          return (uk.nhs.nhsia.datastandards.ecds.EmergencyCareStucture) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( xis, type, options ); }
        
        /** @deprecated {@link org.apache.xmlbeans.xml.stream.XMLInputStream} */
        public static org.apache.xmlbeans.xml.stream.XMLInputStream newValidatingXMLInputStream(org.apache.xmlbeans.xml.stream.XMLInputStream xis) throws org.apache.xmlbeans.XmlException, org.apache.xmlbeans.xml.stream.XMLStreamException {
          return org.apache.xmlbeans.XmlBeans.getContextTypeLoader().newValidatingXMLInputStream( xis, type, null ); }
        
        /** @deprecated {@link org.apache.xmlbeans.xml.stream.XMLInputStream} */
        public static org.apache.xmlbeans.xml.stream.XMLInputStream newValidatingXMLInputStream(org.apache.xmlbeans.xml.stream.XMLInputStream xis, org.apache.xmlbeans.XmlOptions options) throws org.apache.xmlbeans.XmlException, org.apache.xmlbeans.xml.stream.XMLStreamException {
          return org.apache.xmlbeans.XmlBeans.getContextTypeLoader().newValidatingXMLInputStream( xis, type, options ); }
        
        private Factory() { } // No instance of this class allowed
    }
}
