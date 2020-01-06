/*
 * XML Type:  PersonName_Structure
 * Namespace: http://www.nhsia.nhs.uk/DataStandards/XMLschema/CDS/ns
 * Java type: uk.nhs.nhsia.datastandards.ecds.PersonNameStructure
 *
 * Automatically generated - do not modify.
 */
package uk.nhs.nhsia.datastandards.ecds;


/**
 * An XML PersonName_Structure(@http://www.nhsia.nhs.uk/DataStandards/XMLschema/CDS/ns).
 *
 * This is a complex type.
 */
public interface PersonNameStructure extends org.apache.xmlbeans.XmlObject
{
    public static final org.apache.xmlbeans.SchemaType type = (org.apache.xmlbeans.SchemaType)
        org.apache.xmlbeans.XmlBeans.typeSystemForClassLoader(PersonNameStructure.class.getClassLoader(), "schemaorg_apache_xmlbeans.system.s30C1180FF47174E0C8A992A2D657328B").resolveHandle("personnamestructure4c1dtype");
    
    /**
     * Gets the "PersonFullName" element
     */
    java.lang.String getPersonFullName();
    
    /**
     * Gets (as xml) the "PersonFullName" element
     */
    uk.nhs.nhsia.datastandards.ecds.PersonNameUnstructuredTextType xgetPersonFullName();
    
    /**
     * True if has "PersonFullName" element
     */
    boolean isSetPersonFullName();
    
    /**
     * Sets the "PersonFullName" element
     */
    void setPersonFullName(java.lang.String personFullName);
    
    /**
     * Sets (as xml) the "PersonFullName" element
     */
    void xsetPersonFullName(uk.nhs.nhsia.datastandards.ecds.PersonNameUnstructuredTextType personFullName);
    
    /**
     * Unsets the "PersonFullName" element
     */
    void unsetPersonFullName();
    
    /**
     * Gets the "PersonName_Structured" element
     */
    uk.nhs.nhsia.datastandards.ecds.PersonNameStructure.PersonNameStructured getPersonNameStructured();
    
    /**
     * True if has "PersonName_Structured" element
     */
    boolean isSetPersonNameStructured();
    
    /**
     * Sets the "PersonName_Structured" element
     */
    void setPersonNameStructured(uk.nhs.nhsia.datastandards.ecds.PersonNameStructure.PersonNameStructured personNameStructured);
    
    /**
     * Appends and returns a new empty "PersonName_Structured" element
     */
    uk.nhs.nhsia.datastandards.ecds.PersonNameStructure.PersonNameStructured addNewPersonNameStructured();
    
    /**
     * Unsets the "PersonName_Structured" element
     */
    void unsetPersonNameStructured();
    
    /**
     * Gets the "PersonRequestedName" element
     */
    java.lang.String getPersonRequestedName();
    
    /**
     * Gets (as xml) the "PersonRequestedName" element
     */
    uk.nhs.nhsia.datastandards.ecds.PersonNameUnstructuredTextType xgetPersonRequestedName();
    
    /**
     * True if has "PersonRequestedName" element
     */
    boolean isSetPersonRequestedName();
    
    /**
     * Sets the "PersonRequestedName" element
     */
    void setPersonRequestedName(java.lang.String personRequestedName);
    
    /**
     * Sets (as xml) the "PersonRequestedName" element
     */
    void xsetPersonRequestedName(uk.nhs.nhsia.datastandards.ecds.PersonNameUnstructuredTextType personRequestedName);
    
    /**
     * Unsets the "PersonRequestedName" element
     */
    void unsetPersonRequestedName();
    
    /**
     * An XML PersonName_Structured(@http://www.nhsia.nhs.uk/DataStandards/XMLschema/CDS/ns).
     *
     * This is a complex type.
     */
    public interface PersonNameStructured extends org.apache.xmlbeans.XmlObject
    {
        public static final org.apache.xmlbeans.SchemaType type = (org.apache.xmlbeans.SchemaType)
            org.apache.xmlbeans.XmlBeans.typeSystemForClassLoader(PersonNameStructured.class.getClassLoader(), "schemaorg_apache_xmlbeans.system.s30C1180FF47174E0C8A992A2D657328B").resolveHandle("personnamestructured3cf9elemtype");
        
        /**
         * Gets the "PersonTitle" element
         */
        java.lang.String getPersonTitle();
        
        /**
         * Gets (as xml) the "PersonTitle" element
         */
        uk.nhs.nhsia.datastandards.ecds.PersonNameStructuredWordType xgetPersonTitle();
        
        /**
         * True if has "PersonTitle" element
         */
        boolean isSetPersonTitle();
        
        /**
         * Sets the "PersonTitle" element
         */
        void setPersonTitle(java.lang.String personTitle);
        
        /**
         * Sets (as xml) the "PersonTitle" element
         */
        void xsetPersonTitle(uk.nhs.nhsia.datastandards.ecds.PersonNameStructuredWordType personTitle);
        
        /**
         * Unsets the "PersonTitle" element
         */
        void unsetPersonTitle();
        
        /**
         * Gets the "PersonGivenName" element
         */
        java.lang.String getPersonGivenName();
        
        /**
         * Gets (as xml) the "PersonGivenName" element
         */
        uk.nhs.nhsia.datastandards.ecds.PersonNameStructuredWordType xgetPersonGivenName();
        
        /**
         * Sets the "PersonGivenName" element
         */
        void setPersonGivenName(java.lang.String personGivenName);
        
        /**
         * Sets (as xml) the "PersonGivenName" element
         */
        void xsetPersonGivenName(uk.nhs.nhsia.datastandards.ecds.PersonNameStructuredWordType personGivenName);
        
        /**
         * Gets the "PersonFamilyName" element
         */
        java.lang.String getPersonFamilyName();
        
        /**
         * Gets (as xml) the "PersonFamilyName" element
         */
        uk.nhs.nhsia.datastandards.ecds.PersonNameStructuredWordType xgetPersonFamilyName();
        
        /**
         * Sets the "PersonFamilyName" element
         */
        void setPersonFamilyName(java.lang.String personFamilyName);
        
        /**
         * Sets (as xml) the "PersonFamilyName" element
         */
        void xsetPersonFamilyName(uk.nhs.nhsia.datastandards.ecds.PersonNameStructuredWordType personFamilyName);
        
        /**
         * Gets the "PersonNameSuffix" element
         */
        java.lang.String getPersonNameSuffix();
        
        /**
         * Gets (as xml) the "PersonNameSuffix" element
         */
        uk.nhs.nhsia.datastandards.ecds.PersonNameStructuredWordType xgetPersonNameSuffix();
        
        /**
         * True if has "PersonNameSuffix" element
         */
        boolean isSetPersonNameSuffix();
        
        /**
         * Sets the "PersonNameSuffix" element
         */
        void setPersonNameSuffix(java.lang.String personNameSuffix);
        
        /**
         * Sets (as xml) the "PersonNameSuffix" element
         */
        void xsetPersonNameSuffix(uk.nhs.nhsia.datastandards.ecds.PersonNameStructuredWordType personNameSuffix);
        
        /**
         * Unsets the "PersonNameSuffix" element
         */
        void unsetPersonNameSuffix();
        
        /**
         * Gets the "PersonInitials" element
         */
        java.lang.String getPersonInitials();
        
        /**
         * Gets (as xml) the "PersonInitials" element
         */
        uk.nhs.nhsia.datastandards.ecds.PersonNameStructuredWordType xgetPersonInitials();
        
        /**
         * True if has "PersonInitials" element
         */
        boolean isSetPersonInitials();
        
        /**
         * Sets the "PersonInitials" element
         */
        void setPersonInitials(java.lang.String personInitials);
        
        /**
         * Sets (as xml) the "PersonInitials" element
         */
        void xsetPersonInitials(uk.nhs.nhsia.datastandards.ecds.PersonNameStructuredWordType personInitials);
        
        /**
         * Unsets the "PersonInitials" element
         */
        void unsetPersonInitials();
        
        /**
         * A factory class with static methods for creating instances
         * of this type.
         */
        
        public static final class Factory
        {
            public static uk.nhs.nhsia.datastandards.ecds.PersonNameStructure.PersonNameStructured newInstance() {
              return (uk.nhs.nhsia.datastandards.ecds.PersonNameStructure.PersonNameStructured) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().newInstance( type, null ); }
            
            public static uk.nhs.nhsia.datastandards.ecds.PersonNameStructure.PersonNameStructured newInstance(org.apache.xmlbeans.XmlOptions options) {
              return (uk.nhs.nhsia.datastandards.ecds.PersonNameStructure.PersonNameStructured) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().newInstance( type, options ); }
            
            private Factory() { } // No instance of this class allowed
        }
    }
    
    /**
     * A factory class with static methods for creating instances
     * of this type.
     */
    
    public static final class Factory
    {
        public static uk.nhs.nhsia.datastandards.ecds.PersonNameStructure newInstance() {
          return (uk.nhs.nhsia.datastandards.ecds.PersonNameStructure) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().newInstance( type, null ); }
        
        public static uk.nhs.nhsia.datastandards.ecds.PersonNameStructure newInstance(org.apache.xmlbeans.XmlOptions options) {
          return (uk.nhs.nhsia.datastandards.ecds.PersonNameStructure) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().newInstance( type, options ); }
        
        /** @param xmlAsString the string value to parse */
        public static uk.nhs.nhsia.datastandards.ecds.PersonNameStructure parse(java.lang.String xmlAsString) throws org.apache.xmlbeans.XmlException {
          return (uk.nhs.nhsia.datastandards.ecds.PersonNameStructure) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( xmlAsString, type, null ); }
        
        public static uk.nhs.nhsia.datastandards.ecds.PersonNameStructure parse(java.lang.String xmlAsString, org.apache.xmlbeans.XmlOptions options) throws org.apache.xmlbeans.XmlException {
          return (uk.nhs.nhsia.datastandards.ecds.PersonNameStructure) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( xmlAsString, type, options ); }
        
        /** @param file the file from which to load an xml document */
        public static uk.nhs.nhsia.datastandards.ecds.PersonNameStructure parse(java.io.File file) throws org.apache.xmlbeans.XmlException, java.io.IOException {
          return (uk.nhs.nhsia.datastandards.ecds.PersonNameStructure) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( file, type, null ); }
        
        public static uk.nhs.nhsia.datastandards.ecds.PersonNameStructure parse(java.io.File file, org.apache.xmlbeans.XmlOptions options) throws org.apache.xmlbeans.XmlException, java.io.IOException {
          return (uk.nhs.nhsia.datastandards.ecds.PersonNameStructure) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( file, type, options ); }
        
        public static uk.nhs.nhsia.datastandards.ecds.PersonNameStructure parse(java.net.URL u) throws org.apache.xmlbeans.XmlException, java.io.IOException {
          return (uk.nhs.nhsia.datastandards.ecds.PersonNameStructure) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( u, type, null ); }
        
        public static uk.nhs.nhsia.datastandards.ecds.PersonNameStructure parse(java.net.URL u, org.apache.xmlbeans.XmlOptions options) throws org.apache.xmlbeans.XmlException, java.io.IOException {
          return (uk.nhs.nhsia.datastandards.ecds.PersonNameStructure) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( u, type, options ); }
        
        public static uk.nhs.nhsia.datastandards.ecds.PersonNameStructure parse(java.io.InputStream is) throws org.apache.xmlbeans.XmlException, java.io.IOException {
          return (uk.nhs.nhsia.datastandards.ecds.PersonNameStructure) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( is, type, null ); }
        
        public static uk.nhs.nhsia.datastandards.ecds.PersonNameStructure parse(java.io.InputStream is, org.apache.xmlbeans.XmlOptions options) throws org.apache.xmlbeans.XmlException, java.io.IOException {
          return (uk.nhs.nhsia.datastandards.ecds.PersonNameStructure) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( is, type, options ); }
        
        public static uk.nhs.nhsia.datastandards.ecds.PersonNameStructure parse(java.io.Reader r) throws org.apache.xmlbeans.XmlException, java.io.IOException {
          return (uk.nhs.nhsia.datastandards.ecds.PersonNameStructure) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( r, type, null ); }
        
        public static uk.nhs.nhsia.datastandards.ecds.PersonNameStructure parse(java.io.Reader r, org.apache.xmlbeans.XmlOptions options) throws org.apache.xmlbeans.XmlException, java.io.IOException {
          return (uk.nhs.nhsia.datastandards.ecds.PersonNameStructure) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( r, type, options ); }
        
        public static uk.nhs.nhsia.datastandards.ecds.PersonNameStructure parse(javax.xml.stream.XMLStreamReader sr) throws org.apache.xmlbeans.XmlException {
          return (uk.nhs.nhsia.datastandards.ecds.PersonNameStructure) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( sr, type, null ); }
        
        public static uk.nhs.nhsia.datastandards.ecds.PersonNameStructure parse(javax.xml.stream.XMLStreamReader sr, org.apache.xmlbeans.XmlOptions options) throws org.apache.xmlbeans.XmlException {
          return (uk.nhs.nhsia.datastandards.ecds.PersonNameStructure) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( sr, type, options ); }
        
        public static uk.nhs.nhsia.datastandards.ecds.PersonNameStructure parse(org.w3c.dom.Node node) throws org.apache.xmlbeans.XmlException {
          return (uk.nhs.nhsia.datastandards.ecds.PersonNameStructure) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( node, type, null ); }
        
        public static uk.nhs.nhsia.datastandards.ecds.PersonNameStructure parse(org.w3c.dom.Node node, org.apache.xmlbeans.XmlOptions options) throws org.apache.xmlbeans.XmlException {
          return (uk.nhs.nhsia.datastandards.ecds.PersonNameStructure) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( node, type, options ); }
        
        /** @deprecated {@link org.apache.xmlbeans.xml.stream.XMLInputStream} */
        public static uk.nhs.nhsia.datastandards.ecds.PersonNameStructure parse(org.apache.xmlbeans.xml.stream.XMLInputStream xis) throws org.apache.xmlbeans.XmlException, org.apache.xmlbeans.xml.stream.XMLStreamException {
          return (uk.nhs.nhsia.datastandards.ecds.PersonNameStructure) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( xis, type, null ); }
        
        /** @deprecated {@link org.apache.xmlbeans.xml.stream.XMLInputStream} */
        public static uk.nhs.nhsia.datastandards.ecds.PersonNameStructure parse(org.apache.xmlbeans.xml.stream.XMLInputStream xis, org.apache.xmlbeans.XmlOptions options) throws org.apache.xmlbeans.XmlException, org.apache.xmlbeans.xml.stream.XMLStreamException {
          return (uk.nhs.nhsia.datastandards.ecds.PersonNameStructure) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( xis, type, options ); }
        
        /** @deprecated {@link org.apache.xmlbeans.xml.stream.XMLInputStream} */
        public static org.apache.xmlbeans.xml.stream.XMLInputStream newValidatingXMLInputStream(org.apache.xmlbeans.xml.stream.XMLInputStream xis) throws org.apache.xmlbeans.XmlException, org.apache.xmlbeans.xml.stream.XMLStreamException {
          return org.apache.xmlbeans.XmlBeans.getContextTypeLoader().newValidatingXMLInputStream( xis, type, null ); }
        
        /** @deprecated {@link org.apache.xmlbeans.xml.stream.XMLInputStream} */
        public static org.apache.xmlbeans.xml.stream.XMLInputStream newValidatingXMLInputStream(org.apache.xmlbeans.xml.stream.XMLInputStream xis, org.apache.xmlbeans.XmlOptions options) throws org.apache.xmlbeans.XmlException, org.apache.xmlbeans.xml.stream.XMLStreamException {
          return org.apache.xmlbeans.XmlBeans.getContextTypeLoader().newValidatingXMLInputStream( xis, type, options ); }
        
        private Factory() { } // No instance of this class allowed
    }
}
