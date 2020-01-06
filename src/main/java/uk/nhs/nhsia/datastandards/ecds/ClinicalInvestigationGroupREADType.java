/*
 * XML Type:  ClinicalInvestigationGroupREAD_Type
 * Namespace: http://www.nhsia.nhs.uk/DataStandards/XMLschema/CDS/ns
 * Java type: uk.nhs.nhsia.datastandards.ecds.ClinicalInvestigationGroupREADType
 *
 * Automatically generated - do not modify.
 */
package uk.nhs.nhsia.datastandards.ecds;


/**
 * An XML ClinicalInvestigationGroupREAD_Type(@http://www.nhsia.nhs.uk/DataStandards/XMLschema/CDS/ns).
 *
 * This is a complex type.
 */
public interface ClinicalInvestigationGroupREADType extends org.apache.xmlbeans.XmlObject
{
    public static final org.apache.xmlbeans.SchemaType type = (org.apache.xmlbeans.SchemaType)
        org.apache.xmlbeans.XmlBeans.typeSystemForClassLoader(ClinicalInvestigationGroupREADType.class.getClassLoader(), "schemaorg_apache_xmlbeans.system.s30C1180FF47174E0C8A992A2D657328B").resolveHandle("clinicalinvestigationgroupreadtype4ab0type");
    
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
     * Gets the "PrimaryInvestigationGroupREAD" element
     */
    uk.nhs.nhsia.datastandards.ecds.ClinicalInvestigationGroupREADType.PrimaryInvestigationGroupREAD getPrimaryInvestigationGroupREAD();
    
    /**
     * Sets the "PrimaryInvestigationGroupREAD" element
     */
    void setPrimaryInvestigationGroupREAD(uk.nhs.nhsia.datastandards.ecds.ClinicalInvestigationGroupREADType.PrimaryInvestigationGroupREAD primaryInvestigationGroupREAD);
    
    /**
     * Appends and returns a new empty "PrimaryInvestigationGroupREAD" element
     */
    uk.nhs.nhsia.datastandards.ecds.ClinicalInvestigationGroupREADType.PrimaryInvestigationGroupREAD addNewPrimaryInvestigationGroupREAD();
    
    /**
     * Gets array of all "SecondaryInvestigationGroupREAD" elements
     */
    uk.nhs.nhsia.datastandards.ecds.ClinicalInvestigationGroupREADType.SecondaryInvestigationGroupREAD[] getSecondaryInvestigationGroupREADArray();
    
    /**
     * Gets ith "SecondaryInvestigationGroupREAD" element
     */
    uk.nhs.nhsia.datastandards.ecds.ClinicalInvestigationGroupREADType.SecondaryInvestigationGroupREAD getSecondaryInvestigationGroupREADArray(int i);
    
    /**
     * Returns number of "SecondaryInvestigationGroupREAD" element
     */
    int sizeOfSecondaryInvestigationGroupREADArray();
    
    /**
     * Sets array of all "SecondaryInvestigationGroupREAD" element
     */
    void setSecondaryInvestigationGroupREADArray(uk.nhs.nhsia.datastandards.ecds.ClinicalInvestigationGroupREADType.SecondaryInvestigationGroupREAD[] secondaryInvestigationGroupREADArray);
    
    /**
     * Sets ith "SecondaryInvestigationGroupREAD" element
     */
    void setSecondaryInvestigationGroupREADArray(int i, uk.nhs.nhsia.datastandards.ecds.ClinicalInvestigationGroupREADType.SecondaryInvestigationGroupREAD secondaryInvestigationGroupREAD);
    
    /**
     * Inserts and returns a new empty value (as xml) as the ith "SecondaryInvestigationGroupREAD" element
     */
    uk.nhs.nhsia.datastandards.ecds.ClinicalInvestigationGroupREADType.SecondaryInvestigationGroupREAD insertNewSecondaryInvestigationGroupREAD(int i);
    
    /**
     * Appends and returns a new empty value (as xml) as the last "SecondaryInvestigationGroupREAD" element
     */
    uk.nhs.nhsia.datastandards.ecds.ClinicalInvestigationGroupREADType.SecondaryInvestigationGroupREAD addNewSecondaryInvestigationGroupREAD();
    
    /**
     * Removes the ith "SecondaryInvestigationGroupREAD" element
     */
    void removeSecondaryInvestigationGroupREAD(int i);
    
    /**
     * An XML PrimaryInvestigationGroupREAD(@http://www.nhsia.nhs.uk/DataStandards/XMLschema/CDS/ns).
     *
     * This is a complex type.
     */
    public interface PrimaryInvestigationGroupREAD extends org.apache.xmlbeans.XmlObject
    {
        public static final org.apache.xmlbeans.SchemaType type = (org.apache.xmlbeans.SchemaType)
            org.apache.xmlbeans.XmlBeans.typeSystemForClassLoader(PrimaryInvestigationGroupREAD.class.getClassLoader(), "schemaorg_apache_xmlbeans.system.s30C1180FF47174E0C8A992A2D657328B").resolveHandle("primaryinvestigationgroupread97afelemtype");
        
        /**
         * Gets the "PrimaryInvestigation_READ" element
         */
        java.lang.String getPrimaryInvestigationREAD();
        
        /**
         * Gets (as xml) the "PrimaryInvestigation_READ" element
         */
        uk.nhs.nhsia.datastandards.ecds.PrimaryDiagnosisREADType xgetPrimaryInvestigationREAD();
        
        /**
         * Sets the "PrimaryInvestigation_READ" element
         */
        void setPrimaryInvestigationREAD(java.lang.String primaryInvestigationREAD);
        
        /**
         * Sets (as xml) the "PrimaryInvestigation_READ" element
         */
        void xsetPrimaryInvestigationREAD(uk.nhs.nhsia.datastandards.ecds.PrimaryDiagnosisREADType primaryInvestigationREAD);
        
        /**
         * A factory class with static methods for creating instances
         * of this type.
         */
        
        public static final class Factory
        {
            public static uk.nhs.nhsia.datastandards.ecds.ClinicalInvestigationGroupREADType.PrimaryInvestigationGroupREAD newInstance() {
              return (uk.nhs.nhsia.datastandards.ecds.ClinicalInvestigationGroupREADType.PrimaryInvestigationGroupREAD) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().newInstance( type, null ); }
            
            public static uk.nhs.nhsia.datastandards.ecds.ClinicalInvestigationGroupREADType.PrimaryInvestigationGroupREAD newInstance(org.apache.xmlbeans.XmlOptions options) {
              return (uk.nhs.nhsia.datastandards.ecds.ClinicalInvestigationGroupREADType.PrimaryInvestigationGroupREAD) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().newInstance( type, options ); }
            
            private Factory() { } // No instance of this class allowed
        }
    }
    
    /**
     * An XML SecondaryInvestigationGroupREAD(@http://www.nhsia.nhs.uk/DataStandards/XMLschema/CDS/ns).
     *
     * This is a complex type.
     */
    public interface SecondaryInvestigationGroupREAD extends org.apache.xmlbeans.XmlObject
    {
        public static final org.apache.xmlbeans.SchemaType type = (org.apache.xmlbeans.SchemaType)
            org.apache.xmlbeans.XmlBeans.typeSystemForClassLoader(SecondaryInvestigationGroupREAD.class.getClassLoader(), "schemaorg_apache_xmlbeans.system.s30C1180FF47174E0C8A992A2D657328B").resolveHandle("secondaryinvestigationgroupreadd4fdelemtype");
        
        /**
         * Gets the "SecondaryInvestigation_READ" element
         */
        java.lang.String getSecondaryInvestigationREAD();
        
        /**
         * Gets (as xml) the "SecondaryInvestigation_READ" element
         */
        uk.nhs.nhsia.datastandards.ecds.PrimaryDiagnosisREADType xgetSecondaryInvestigationREAD();
        
        /**
         * Sets the "SecondaryInvestigation_READ" element
         */
        void setSecondaryInvestigationREAD(java.lang.String secondaryInvestigationREAD);
        
        /**
         * Sets (as xml) the "SecondaryInvestigation_READ" element
         */
        void xsetSecondaryInvestigationREAD(uk.nhs.nhsia.datastandards.ecds.PrimaryDiagnosisREADType secondaryInvestigationREAD);
        
        /**
         * A factory class with static methods for creating instances
         * of this type.
         */
        
        public static final class Factory
        {
            public static uk.nhs.nhsia.datastandards.ecds.ClinicalInvestigationGroupREADType.SecondaryInvestigationGroupREAD newInstance() {
              return (uk.nhs.nhsia.datastandards.ecds.ClinicalInvestigationGroupREADType.SecondaryInvestigationGroupREAD) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().newInstance( type, null ); }
            
            public static uk.nhs.nhsia.datastandards.ecds.ClinicalInvestigationGroupREADType.SecondaryInvestigationGroupREAD newInstance(org.apache.xmlbeans.XmlOptions options) {
              return (uk.nhs.nhsia.datastandards.ecds.ClinicalInvestigationGroupREADType.SecondaryInvestigationGroupREAD) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().newInstance( type, options ); }
            
            private Factory() { } // No instance of this class allowed
        }
    }
    
    /**
     * A factory class with static methods for creating instances
     * of this type.
     */
    
    public static final class Factory
    {
        public static uk.nhs.nhsia.datastandards.ecds.ClinicalInvestigationGroupREADType newInstance() {
          return (uk.nhs.nhsia.datastandards.ecds.ClinicalInvestigationGroupREADType) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().newInstance( type, null ); }
        
        public static uk.nhs.nhsia.datastandards.ecds.ClinicalInvestigationGroupREADType newInstance(org.apache.xmlbeans.XmlOptions options) {
          return (uk.nhs.nhsia.datastandards.ecds.ClinicalInvestigationGroupREADType) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().newInstance( type, options ); }
        
        /** @param xmlAsString the string value to parse */
        public static uk.nhs.nhsia.datastandards.ecds.ClinicalInvestigationGroupREADType parse(java.lang.String xmlAsString) throws org.apache.xmlbeans.XmlException {
          return (uk.nhs.nhsia.datastandards.ecds.ClinicalInvestigationGroupREADType) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( xmlAsString, type, null ); }
        
        public static uk.nhs.nhsia.datastandards.ecds.ClinicalInvestigationGroupREADType parse(java.lang.String xmlAsString, org.apache.xmlbeans.XmlOptions options) throws org.apache.xmlbeans.XmlException {
          return (uk.nhs.nhsia.datastandards.ecds.ClinicalInvestigationGroupREADType) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( xmlAsString, type, options ); }
        
        /** @param file the file from which to load an xml document */
        public static uk.nhs.nhsia.datastandards.ecds.ClinicalInvestigationGroupREADType parse(java.io.File file) throws org.apache.xmlbeans.XmlException, java.io.IOException {
          return (uk.nhs.nhsia.datastandards.ecds.ClinicalInvestigationGroupREADType) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( file, type, null ); }
        
        public static uk.nhs.nhsia.datastandards.ecds.ClinicalInvestigationGroupREADType parse(java.io.File file, org.apache.xmlbeans.XmlOptions options) throws org.apache.xmlbeans.XmlException, java.io.IOException {
          return (uk.nhs.nhsia.datastandards.ecds.ClinicalInvestigationGroupREADType) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( file, type, options ); }
        
        public static uk.nhs.nhsia.datastandards.ecds.ClinicalInvestigationGroupREADType parse(java.net.URL u) throws org.apache.xmlbeans.XmlException, java.io.IOException {
          return (uk.nhs.nhsia.datastandards.ecds.ClinicalInvestigationGroupREADType) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( u, type, null ); }
        
        public static uk.nhs.nhsia.datastandards.ecds.ClinicalInvestigationGroupREADType parse(java.net.URL u, org.apache.xmlbeans.XmlOptions options) throws org.apache.xmlbeans.XmlException, java.io.IOException {
          return (uk.nhs.nhsia.datastandards.ecds.ClinicalInvestigationGroupREADType) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( u, type, options ); }
        
        public static uk.nhs.nhsia.datastandards.ecds.ClinicalInvestigationGroupREADType parse(java.io.InputStream is) throws org.apache.xmlbeans.XmlException, java.io.IOException {
          return (uk.nhs.nhsia.datastandards.ecds.ClinicalInvestigationGroupREADType) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( is, type, null ); }
        
        public static uk.nhs.nhsia.datastandards.ecds.ClinicalInvestigationGroupREADType parse(java.io.InputStream is, org.apache.xmlbeans.XmlOptions options) throws org.apache.xmlbeans.XmlException, java.io.IOException {
          return (uk.nhs.nhsia.datastandards.ecds.ClinicalInvestigationGroupREADType) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( is, type, options ); }
        
        public static uk.nhs.nhsia.datastandards.ecds.ClinicalInvestigationGroupREADType parse(java.io.Reader r) throws org.apache.xmlbeans.XmlException, java.io.IOException {
          return (uk.nhs.nhsia.datastandards.ecds.ClinicalInvestigationGroupREADType) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( r, type, null ); }
        
        public static uk.nhs.nhsia.datastandards.ecds.ClinicalInvestigationGroupREADType parse(java.io.Reader r, org.apache.xmlbeans.XmlOptions options) throws org.apache.xmlbeans.XmlException, java.io.IOException {
          return (uk.nhs.nhsia.datastandards.ecds.ClinicalInvestigationGroupREADType) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( r, type, options ); }
        
        public static uk.nhs.nhsia.datastandards.ecds.ClinicalInvestigationGroupREADType parse(javax.xml.stream.XMLStreamReader sr) throws org.apache.xmlbeans.XmlException {
          return (uk.nhs.nhsia.datastandards.ecds.ClinicalInvestigationGroupREADType) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( sr, type, null ); }
        
        public static uk.nhs.nhsia.datastandards.ecds.ClinicalInvestigationGroupREADType parse(javax.xml.stream.XMLStreamReader sr, org.apache.xmlbeans.XmlOptions options) throws org.apache.xmlbeans.XmlException {
          return (uk.nhs.nhsia.datastandards.ecds.ClinicalInvestigationGroupREADType) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( sr, type, options ); }
        
        public static uk.nhs.nhsia.datastandards.ecds.ClinicalInvestigationGroupREADType parse(org.w3c.dom.Node node) throws org.apache.xmlbeans.XmlException {
          return (uk.nhs.nhsia.datastandards.ecds.ClinicalInvestigationGroupREADType) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( node, type, null ); }
        
        public static uk.nhs.nhsia.datastandards.ecds.ClinicalInvestigationGroupREADType parse(org.w3c.dom.Node node, org.apache.xmlbeans.XmlOptions options) throws org.apache.xmlbeans.XmlException {
          return (uk.nhs.nhsia.datastandards.ecds.ClinicalInvestigationGroupREADType) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( node, type, options ); }
        
        /** @deprecated {@link org.apache.xmlbeans.xml.stream.XMLInputStream} */
        public static uk.nhs.nhsia.datastandards.ecds.ClinicalInvestigationGroupREADType parse(org.apache.xmlbeans.xml.stream.XMLInputStream xis) throws org.apache.xmlbeans.XmlException, org.apache.xmlbeans.xml.stream.XMLStreamException {
          return (uk.nhs.nhsia.datastandards.ecds.ClinicalInvestigationGroupREADType) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( xis, type, null ); }
        
        /** @deprecated {@link org.apache.xmlbeans.xml.stream.XMLInputStream} */
        public static uk.nhs.nhsia.datastandards.ecds.ClinicalInvestigationGroupREADType parse(org.apache.xmlbeans.xml.stream.XMLInputStream xis, org.apache.xmlbeans.XmlOptions options) throws org.apache.xmlbeans.XmlException, org.apache.xmlbeans.xml.stream.XMLStreamException {
          return (uk.nhs.nhsia.datastandards.ecds.ClinicalInvestigationGroupREADType) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( xis, type, options ); }
        
        /** @deprecated {@link org.apache.xmlbeans.xml.stream.XMLInputStream} */
        public static org.apache.xmlbeans.xml.stream.XMLInputStream newValidatingXMLInputStream(org.apache.xmlbeans.xml.stream.XMLInputStream xis) throws org.apache.xmlbeans.XmlException, org.apache.xmlbeans.xml.stream.XMLStreamException {
          return org.apache.xmlbeans.XmlBeans.getContextTypeLoader().newValidatingXMLInputStream( xis, type, null ); }
        
        /** @deprecated {@link org.apache.xmlbeans.xml.stream.XMLInputStream} */
        public static org.apache.xmlbeans.xml.stream.XMLInputStream newValidatingXMLInputStream(org.apache.xmlbeans.xml.stream.XMLInputStream xis, org.apache.xmlbeans.XmlOptions options) throws org.apache.xmlbeans.XmlException, org.apache.xmlbeans.xml.stream.XMLStreamException {
          return org.apache.xmlbeans.XmlBeans.getContextTypeLoader().newValidatingXMLInputStream( xis, type, options ); }
        
        private Factory() { } // No instance of this class allowed
    }
}
