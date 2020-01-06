/*
 * XML Type:  ClinicalInvestigationGroupAAndE_Type
 * Namespace: http://www.nhsia.nhs.uk/DataStandards/XMLschema/CDS/ns
 * Java type: uk.nhs.nhsia.datastandards.ecds.ClinicalInvestigationGroupAAndEType
 *
 * Automatically generated - do not modify.
 */
package uk.nhs.nhsia.datastandards.ecds;


/**
 * An XML ClinicalInvestigationGroupAAndE_Type(@http://www.nhsia.nhs.uk/DataStandards/XMLschema/CDS/ns).
 *
 * This is a complex type.
 */
public interface ClinicalInvestigationGroupAAndEType extends org.apache.xmlbeans.XmlObject
{
    public static final org.apache.xmlbeans.SchemaType type = (org.apache.xmlbeans.SchemaType)
        org.apache.xmlbeans.XmlBeans.typeSystemForClassLoader(ClinicalInvestigationGroupAAndEType.class.getClassLoader(), "schemaorg_apache_xmlbeans.system.s30C1180FF47174E0C8A992A2D657328B").resolveHandle("clinicalinvestigationgroupaandetype7137type");
    
    /**
     * Gets the "InvestigationSchemeInUse" element
     */
    uk.nhs.nhsia.datastandards.ecds.InvestigationSchemeInUseType.Enum getInvestigationSchemeInUse();
    
    /**
     * Gets (as xml) the "InvestigationSchemeInUse" element
     */
    uk.nhs.nhsia.datastandards.ecds.InvestigationSchemeInUseType xgetInvestigationSchemeInUse();
    
    /**
     * Sets the "InvestigationSchemeInUse" element
     */
    void setInvestigationSchemeInUse(uk.nhs.nhsia.datastandards.ecds.InvestigationSchemeInUseType.Enum investigationSchemeInUse);
    
    /**
     * Sets (as xml) the "InvestigationSchemeInUse" element
     */
    void xsetInvestigationSchemeInUse(uk.nhs.nhsia.datastandards.ecds.InvestigationSchemeInUseType investigationSchemeInUse);
    
    /**
     * Gets the "PrimaryInvestigationGroupAAndE" element
     */
    uk.nhs.nhsia.datastandards.ecds.ClinicalInvestigationGroupAAndEType.PrimaryInvestigationGroupAAndE getPrimaryInvestigationGroupAAndE();
    
    /**
     * Sets the "PrimaryInvestigationGroupAAndE" element
     */
    void setPrimaryInvestigationGroupAAndE(uk.nhs.nhsia.datastandards.ecds.ClinicalInvestigationGroupAAndEType.PrimaryInvestigationGroupAAndE primaryInvestigationGroupAAndE);
    
    /**
     * Appends and returns a new empty "PrimaryInvestigationGroupAAndE" element
     */
    uk.nhs.nhsia.datastandards.ecds.ClinicalInvestigationGroupAAndEType.PrimaryInvestigationGroupAAndE addNewPrimaryInvestigationGroupAAndE();
    
    /**
     * Gets array of all "SecondaryInvestigationGroupAAndE" elements
     */
    uk.nhs.nhsia.datastandards.ecds.ClinicalInvestigationGroupAAndEType.SecondaryInvestigationGroupAAndE[] getSecondaryInvestigationGroupAAndEArray();
    
    /**
     * Gets ith "SecondaryInvestigationGroupAAndE" element
     */
    uk.nhs.nhsia.datastandards.ecds.ClinicalInvestigationGroupAAndEType.SecondaryInvestigationGroupAAndE getSecondaryInvestigationGroupAAndEArray(int i);
    
    /**
     * Returns number of "SecondaryInvestigationGroupAAndE" element
     */
    int sizeOfSecondaryInvestigationGroupAAndEArray();
    
    /**
     * Sets array of all "SecondaryInvestigationGroupAAndE" element
     */
    void setSecondaryInvestigationGroupAAndEArray(uk.nhs.nhsia.datastandards.ecds.ClinicalInvestigationGroupAAndEType.SecondaryInvestigationGroupAAndE[] secondaryInvestigationGroupAAndEArray);
    
    /**
     * Sets ith "SecondaryInvestigationGroupAAndE" element
     */
    void setSecondaryInvestigationGroupAAndEArray(int i, uk.nhs.nhsia.datastandards.ecds.ClinicalInvestigationGroupAAndEType.SecondaryInvestigationGroupAAndE secondaryInvestigationGroupAAndE);
    
    /**
     * Inserts and returns a new empty value (as xml) as the ith "SecondaryInvestigationGroupAAndE" element
     */
    uk.nhs.nhsia.datastandards.ecds.ClinicalInvestigationGroupAAndEType.SecondaryInvestigationGroupAAndE insertNewSecondaryInvestigationGroupAAndE(int i);
    
    /**
     * Appends and returns a new empty value (as xml) as the last "SecondaryInvestigationGroupAAndE" element
     */
    uk.nhs.nhsia.datastandards.ecds.ClinicalInvestigationGroupAAndEType.SecondaryInvestigationGroupAAndE addNewSecondaryInvestigationGroupAAndE();
    
    /**
     * Removes the ith "SecondaryInvestigationGroupAAndE" element
     */
    void removeSecondaryInvestigationGroupAAndE(int i);
    
    /**
     * An XML PrimaryInvestigationGroupAAndE(@http://www.nhsia.nhs.uk/DataStandards/XMLschema/CDS/ns).
     *
     * This is a complex type.
     */
    public interface PrimaryInvestigationGroupAAndE extends org.apache.xmlbeans.XmlObject
    {
        public static final org.apache.xmlbeans.SchemaType type = (org.apache.xmlbeans.SchemaType)
            org.apache.xmlbeans.XmlBeans.typeSystemForClassLoader(PrimaryInvestigationGroupAAndE.class.getClassLoader(), "schemaorg_apache_xmlbeans.system.s30C1180FF47174E0C8A992A2D657328B").resolveHandle("primaryinvestigationgroupaandee943elemtype");
        
        /**
         * Gets the "PrimaryInvestigation_AAndE" element
         */
        java.lang.String getPrimaryInvestigationAAndE();
        
        /**
         * Gets (as xml) the "PrimaryInvestigation_AAndE" element
         */
        uk.nhs.nhsia.datastandards.ecds.AAndEInvestigationType xgetPrimaryInvestigationAAndE();
        
        /**
         * Sets the "PrimaryInvestigation_AAndE" element
         */
        void setPrimaryInvestigationAAndE(java.lang.String primaryInvestigationAAndE);
        
        /**
         * Sets (as xml) the "PrimaryInvestigation_AAndE" element
         */
        void xsetPrimaryInvestigationAAndE(uk.nhs.nhsia.datastandards.ecds.AAndEInvestigationType primaryInvestigationAAndE);
        
        /**
         * A factory class with static methods for creating instances
         * of this type.
         */
        
        public static final class Factory
        {
            public static uk.nhs.nhsia.datastandards.ecds.ClinicalInvestigationGroupAAndEType.PrimaryInvestigationGroupAAndE newInstance() {
              return (uk.nhs.nhsia.datastandards.ecds.ClinicalInvestigationGroupAAndEType.PrimaryInvestigationGroupAAndE) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().newInstance( type, null ); }
            
            public static uk.nhs.nhsia.datastandards.ecds.ClinicalInvestigationGroupAAndEType.PrimaryInvestigationGroupAAndE newInstance(org.apache.xmlbeans.XmlOptions options) {
              return (uk.nhs.nhsia.datastandards.ecds.ClinicalInvestigationGroupAAndEType.PrimaryInvestigationGroupAAndE) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().newInstance( type, options ); }
            
            private Factory() { } // No instance of this class allowed
        }
    }
    
    /**
     * An XML SecondaryInvestigationGroupAAndE(@http://www.nhsia.nhs.uk/DataStandards/XMLschema/CDS/ns).
     *
     * This is a complex type.
     */
    public interface SecondaryInvestigationGroupAAndE extends org.apache.xmlbeans.XmlObject
    {
        public static final org.apache.xmlbeans.SchemaType type = (org.apache.xmlbeans.SchemaType)
            org.apache.xmlbeans.XmlBeans.typeSystemForClassLoader(SecondaryInvestigationGroupAAndE.class.getClassLoader(), "schemaorg_apache_xmlbeans.system.s30C1180FF47174E0C8A992A2D657328B").resolveHandle("secondaryinvestigationgroupaande0b11elemtype");
        
        /**
         * Gets the "SecondaryInvestigation_AAndE" element
         */
        java.lang.String getSecondaryInvestigationAAndE();
        
        /**
         * Gets (as xml) the "SecondaryInvestigation_AAndE" element
         */
        uk.nhs.nhsia.datastandards.ecds.AAndEInvestigationType xgetSecondaryInvestigationAAndE();
        
        /**
         * Sets the "SecondaryInvestigation_AAndE" element
         */
        void setSecondaryInvestigationAAndE(java.lang.String secondaryInvestigationAAndE);
        
        /**
         * Sets (as xml) the "SecondaryInvestigation_AAndE" element
         */
        void xsetSecondaryInvestigationAAndE(uk.nhs.nhsia.datastandards.ecds.AAndEInvestigationType secondaryInvestigationAAndE);
        
        /**
         * A factory class with static methods for creating instances
         * of this type.
         */
        
        public static final class Factory
        {
            public static uk.nhs.nhsia.datastandards.ecds.ClinicalInvestigationGroupAAndEType.SecondaryInvestigationGroupAAndE newInstance() {
              return (uk.nhs.nhsia.datastandards.ecds.ClinicalInvestigationGroupAAndEType.SecondaryInvestigationGroupAAndE) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().newInstance( type, null ); }
            
            public static uk.nhs.nhsia.datastandards.ecds.ClinicalInvestigationGroupAAndEType.SecondaryInvestigationGroupAAndE newInstance(org.apache.xmlbeans.XmlOptions options) {
              return (uk.nhs.nhsia.datastandards.ecds.ClinicalInvestigationGroupAAndEType.SecondaryInvestigationGroupAAndE) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().newInstance( type, options ); }
            
            private Factory() { } // No instance of this class allowed
        }
    }
    
    /**
     * A factory class with static methods for creating instances
     * of this type.
     */
    
    public static final class Factory
    {
        public static uk.nhs.nhsia.datastandards.ecds.ClinicalInvestigationGroupAAndEType newInstance() {
          return (uk.nhs.nhsia.datastandards.ecds.ClinicalInvestigationGroupAAndEType) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().newInstance( type, null ); }
        
        public static uk.nhs.nhsia.datastandards.ecds.ClinicalInvestigationGroupAAndEType newInstance(org.apache.xmlbeans.XmlOptions options) {
          return (uk.nhs.nhsia.datastandards.ecds.ClinicalInvestigationGroupAAndEType) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().newInstance( type, options ); }
        
        /** @param xmlAsString the string value to parse */
        public static uk.nhs.nhsia.datastandards.ecds.ClinicalInvestigationGroupAAndEType parse(java.lang.String xmlAsString) throws org.apache.xmlbeans.XmlException {
          return (uk.nhs.nhsia.datastandards.ecds.ClinicalInvestigationGroupAAndEType) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( xmlAsString, type, null ); }
        
        public static uk.nhs.nhsia.datastandards.ecds.ClinicalInvestigationGroupAAndEType parse(java.lang.String xmlAsString, org.apache.xmlbeans.XmlOptions options) throws org.apache.xmlbeans.XmlException {
          return (uk.nhs.nhsia.datastandards.ecds.ClinicalInvestigationGroupAAndEType) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( xmlAsString, type, options ); }
        
        /** @param file the file from which to load an xml document */
        public static uk.nhs.nhsia.datastandards.ecds.ClinicalInvestigationGroupAAndEType parse(java.io.File file) throws org.apache.xmlbeans.XmlException, java.io.IOException {
          return (uk.nhs.nhsia.datastandards.ecds.ClinicalInvestigationGroupAAndEType) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( file, type, null ); }
        
        public static uk.nhs.nhsia.datastandards.ecds.ClinicalInvestigationGroupAAndEType parse(java.io.File file, org.apache.xmlbeans.XmlOptions options) throws org.apache.xmlbeans.XmlException, java.io.IOException {
          return (uk.nhs.nhsia.datastandards.ecds.ClinicalInvestigationGroupAAndEType) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( file, type, options ); }
        
        public static uk.nhs.nhsia.datastandards.ecds.ClinicalInvestigationGroupAAndEType parse(java.net.URL u) throws org.apache.xmlbeans.XmlException, java.io.IOException {
          return (uk.nhs.nhsia.datastandards.ecds.ClinicalInvestigationGroupAAndEType) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( u, type, null ); }
        
        public static uk.nhs.nhsia.datastandards.ecds.ClinicalInvestigationGroupAAndEType parse(java.net.URL u, org.apache.xmlbeans.XmlOptions options) throws org.apache.xmlbeans.XmlException, java.io.IOException {
          return (uk.nhs.nhsia.datastandards.ecds.ClinicalInvestigationGroupAAndEType) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( u, type, options ); }
        
        public static uk.nhs.nhsia.datastandards.ecds.ClinicalInvestigationGroupAAndEType parse(java.io.InputStream is) throws org.apache.xmlbeans.XmlException, java.io.IOException {
          return (uk.nhs.nhsia.datastandards.ecds.ClinicalInvestigationGroupAAndEType) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( is, type, null ); }
        
        public static uk.nhs.nhsia.datastandards.ecds.ClinicalInvestigationGroupAAndEType parse(java.io.InputStream is, org.apache.xmlbeans.XmlOptions options) throws org.apache.xmlbeans.XmlException, java.io.IOException {
          return (uk.nhs.nhsia.datastandards.ecds.ClinicalInvestigationGroupAAndEType) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( is, type, options ); }
        
        public static uk.nhs.nhsia.datastandards.ecds.ClinicalInvestigationGroupAAndEType parse(java.io.Reader r) throws org.apache.xmlbeans.XmlException, java.io.IOException {
          return (uk.nhs.nhsia.datastandards.ecds.ClinicalInvestigationGroupAAndEType) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( r, type, null ); }
        
        public static uk.nhs.nhsia.datastandards.ecds.ClinicalInvestigationGroupAAndEType parse(java.io.Reader r, org.apache.xmlbeans.XmlOptions options) throws org.apache.xmlbeans.XmlException, java.io.IOException {
          return (uk.nhs.nhsia.datastandards.ecds.ClinicalInvestigationGroupAAndEType) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( r, type, options ); }
        
        public static uk.nhs.nhsia.datastandards.ecds.ClinicalInvestigationGroupAAndEType parse(javax.xml.stream.XMLStreamReader sr) throws org.apache.xmlbeans.XmlException {
          return (uk.nhs.nhsia.datastandards.ecds.ClinicalInvestigationGroupAAndEType) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( sr, type, null ); }
        
        public static uk.nhs.nhsia.datastandards.ecds.ClinicalInvestigationGroupAAndEType parse(javax.xml.stream.XMLStreamReader sr, org.apache.xmlbeans.XmlOptions options) throws org.apache.xmlbeans.XmlException {
          return (uk.nhs.nhsia.datastandards.ecds.ClinicalInvestigationGroupAAndEType) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( sr, type, options ); }
        
        public static uk.nhs.nhsia.datastandards.ecds.ClinicalInvestigationGroupAAndEType parse(org.w3c.dom.Node node) throws org.apache.xmlbeans.XmlException {
          return (uk.nhs.nhsia.datastandards.ecds.ClinicalInvestigationGroupAAndEType) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( node, type, null ); }
        
        public static uk.nhs.nhsia.datastandards.ecds.ClinicalInvestigationGroupAAndEType parse(org.w3c.dom.Node node, org.apache.xmlbeans.XmlOptions options) throws org.apache.xmlbeans.XmlException {
          return (uk.nhs.nhsia.datastandards.ecds.ClinicalInvestigationGroupAAndEType) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( node, type, options ); }
        
        /** @deprecated {@link org.apache.xmlbeans.xml.stream.XMLInputStream} */
        public static uk.nhs.nhsia.datastandards.ecds.ClinicalInvestigationGroupAAndEType parse(org.apache.xmlbeans.xml.stream.XMLInputStream xis) throws org.apache.xmlbeans.XmlException, org.apache.xmlbeans.xml.stream.XMLStreamException {
          return (uk.nhs.nhsia.datastandards.ecds.ClinicalInvestigationGroupAAndEType) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( xis, type, null ); }
        
        /** @deprecated {@link org.apache.xmlbeans.xml.stream.XMLInputStream} */
        public static uk.nhs.nhsia.datastandards.ecds.ClinicalInvestigationGroupAAndEType parse(org.apache.xmlbeans.xml.stream.XMLInputStream xis, org.apache.xmlbeans.XmlOptions options) throws org.apache.xmlbeans.XmlException, org.apache.xmlbeans.xml.stream.XMLStreamException {
          return (uk.nhs.nhsia.datastandards.ecds.ClinicalInvestigationGroupAAndEType) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( xis, type, options ); }
        
        /** @deprecated {@link org.apache.xmlbeans.xml.stream.XMLInputStream} */
        public static org.apache.xmlbeans.xml.stream.XMLInputStream newValidatingXMLInputStream(org.apache.xmlbeans.xml.stream.XMLInputStream xis) throws org.apache.xmlbeans.XmlException, org.apache.xmlbeans.xml.stream.XMLStreamException {
          return org.apache.xmlbeans.XmlBeans.getContextTypeLoader().newValidatingXMLInputStream( xis, type, null ); }
        
        /** @deprecated {@link org.apache.xmlbeans.xml.stream.XMLInputStream} */
        public static org.apache.xmlbeans.xml.stream.XMLInputStream newValidatingXMLInputStream(org.apache.xmlbeans.xml.stream.XMLInputStream xis, org.apache.xmlbeans.XmlOptions options) throws org.apache.xmlbeans.XmlException, org.apache.xmlbeans.xml.stream.XMLStreamException {
          return org.apache.xmlbeans.XmlBeans.getContextTypeLoader().newValidatingXMLInputStream( xis, type, options ); }
        
        private Factory() { } // No instance of this class allowed
    }
}
