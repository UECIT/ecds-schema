/*
 * XML Type:  ClinicalInvestigationGroupICD_Type
 * Namespace: http://www.nhsia.nhs.uk/DataStandards/XMLschema/CDS/ns
 * Java type: uk.nhs.nhsia.datastandards.ecds.ClinicalInvestigationGroupICDType
 *
 * Automatically generated - do not modify.
 */
package uk.nhs.nhsia.datastandards.ecds;


/**
 * An XML ClinicalInvestigationGroupICD_Type(@http://www.nhsia.nhs.uk/DataStandards/XMLschema/CDS/ns).
 *
 * This is a complex type.
 */
public interface ClinicalInvestigationGroupICDType extends org.apache.xmlbeans.XmlObject
{
    public static final org.apache.xmlbeans.SchemaType type = (org.apache.xmlbeans.SchemaType)
        org.apache.xmlbeans.XmlBeans.typeSystemForClassLoader(ClinicalInvestigationGroupICDType.class.getClassLoader(), "schemaorg_apache_xmlbeans.system.s30C1180FF47174E0C8A992A2D657328B").resolveHandle("clinicalinvestigationgroupicdtype61b2type");
    
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
     * Gets the "PrimaryInvestigationGroupICD" element
     */
    uk.nhs.nhsia.datastandards.ecds.ClinicalInvestigationGroupICDType.PrimaryInvestigationGroupICD getPrimaryInvestigationGroupICD();
    
    /**
     * Sets the "PrimaryInvestigationGroupICD" element
     */
    void setPrimaryInvestigationGroupICD(uk.nhs.nhsia.datastandards.ecds.ClinicalInvestigationGroupICDType.PrimaryInvestigationGroupICD primaryInvestigationGroupICD);
    
    /**
     * Appends and returns a new empty "PrimaryInvestigationGroupICD" element
     */
    uk.nhs.nhsia.datastandards.ecds.ClinicalInvestigationGroupICDType.PrimaryInvestigationGroupICD addNewPrimaryInvestigationGroupICD();
    
    /**
     * Gets array of all "SecondaryInvestigationGroupICD" elements
     */
    uk.nhs.nhsia.datastandards.ecds.ClinicalInvestigationGroupICDType.SecondaryInvestigationGroupICD[] getSecondaryInvestigationGroupICDArray();
    
    /**
     * Gets ith "SecondaryInvestigationGroupICD" element
     */
    uk.nhs.nhsia.datastandards.ecds.ClinicalInvestigationGroupICDType.SecondaryInvestigationGroupICD getSecondaryInvestigationGroupICDArray(int i);
    
    /**
     * Returns number of "SecondaryInvestigationGroupICD" element
     */
    int sizeOfSecondaryInvestigationGroupICDArray();
    
    /**
     * Sets array of all "SecondaryInvestigationGroupICD" element
     */
    void setSecondaryInvestigationGroupICDArray(uk.nhs.nhsia.datastandards.ecds.ClinicalInvestigationGroupICDType.SecondaryInvestigationGroupICD[] secondaryInvestigationGroupICDArray);
    
    /**
     * Sets ith "SecondaryInvestigationGroupICD" element
     */
    void setSecondaryInvestigationGroupICDArray(int i, uk.nhs.nhsia.datastandards.ecds.ClinicalInvestigationGroupICDType.SecondaryInvestigationGroupICD secondaryInvestigationGroupICD);
    
    /**
     * Inserts and returns a new empty value (as xml) as the ith "SecondaryInvestigationGroupICD" element
     */
    uk.nhs.nhsia.datastandards.ecds.ClinicalInvestigationGroupICDType.SecondaryInvestigationGroupICD insertNewSecondaryInvestigationGroupICD(int i);
    
    /**
     * Appends and returns a new empty value (as xml) as the last "SecondaryInvestigationGroupICD" element
     */
    uk.nhs.nhsia.datastandards.ecds.ClinicalInvestigationGroupICDType.SecondaryInvestigationGroupICD addNewSecondaryInvestigationGroupICD();
    
    /**
     * Removes the ith "SecondaryInvestigationGroupICD" element
     */
    void removeSecondaryInvestigationGroupICD(int i);
    
    /**
     * An XML PrimaryInvestigationGroupICD(@http://www.nhsia.nhs.uk/DataStandards/XMLschema/CDS/ns).
     *
     * This is a complex type.
     */
    public interface PrimaryInvestigationGroupICD extends org.apache.xmlbeans.XmlObject
    {
        public static final org.apache.xmlbeans.SchemaType type = (org.apache.xmlbeans.SchemaType)
            org.apache.xmlbeans.XmlBeans.typeSystemForClassLoader(PrimaryInvestigationGroupICD.class.getClassLoader(), "schemaorg_apache_xmlbeans.system.s30C1180FF47174E0C8A992A2D657328B").resolveHandle("primaryinvestigationgroupicd6db9elemtype");
        
        /**
         * Gets the "PrimaryInvestigation_ICD" element
         */
        java.lang.String getPrimaryInvestigationICD();
        
        /**
         * Gets (as xml) the "PrimaryInvestigation_ICD" element
         */
        uk.nhs.nhsia.datastandards.ecds.PrimaryDiagnosisICDType xgetPrimaryInvestigationICD();
        
        /**
         * Sets the "PrimaryInvestigation_ICD" element
         */
        void setPrimaryInvestigationICD(java.lang.String primaryInvestigationICD);
        
        /**
         * Sets (as xml) the "PrimaryInvestigation_ICD" element
         */
        void xsetPrimaryInvestigationICD(uk.nhs.nhsia.datastandards.ecds.PrimaryDiagnosisICDType primaryInvestigationICD);
        
        /**
         * A factory class with static methods for creating instances
         * of this type.
         */
        
        public static final class Factory
        {
            public static uk.nhs.nhsia.datastandards.ecds.ClinicalInvestigationGroupICDType.PrimaryInvestigationGroupICD newInstance() {
              return (uk.nhs.nhsia.datastandards.ecds.ClinicalInvestigationGroupICDType.PrimaryInvestigationGroupICD) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().newInstance( type, null ); }
            
            public static uk.nhs.nhsia.datastandards.ecds.ClinicalInvestigationGroupICDType.PrimaryInvestigationGroupICD newInstance(org.apache.xmlbeans.XmlOptions options) {
              return (uk.nhs.nhsia.datastandards.ecds.ClinicalInvestigationGroupICDType.PrimaryInvestigationGroupICD) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().newInstance( type, options ); }
            
            private Factory() { } // No instance of this class allowed
        }
    }
    
    /**
     * An XML SecondaryInvestigationGroupICD(@http://www.nhsia.nhs.uk/DataStandards/XMLschema/CDS/ns).
     *
     * This is a complex type.
     */
    public interface SecondaryInvestigationGroupICD extends org.apache.xmlbeans.XmlObject
    {
        public static final org.apache.xmlbeans.SchemaType type = (org.apache.xmlbeans.SchemaType)
            org.apache.xmlbeans.XmlBeans.typeSystemForClassLoader(SecondaryInvestigationGroupICD.class.getClassLoader(), "schemaorg_apache_xmlbeans.system.s30C1180FF47174E0C8A992A2D657328B").resolveHandle("secondaryinvestigationgroupicda687elemtype");
        
        /**
         * Gets the "SecondaryInvestigation_ICD" element
         */
        java.lang.String getSecondaryInvestigationICD();
        
        /**
         * Gets (as xml) the "SecondaryInvestigation_ICD" element
         */
        uk.nhs.nhsia.datastandards.ecds.PrimaryDiagnosisICDType xgetSecondaryInvestigationICD();
        
        /**
         * Sets the "SecondaryInvestigation_ICD" element
         */
        void setSecondaryInvestigationICD(java.lang.String secondaryInvestigationICD);
        
        /**
         * Sets (as xml) the "SecondaryInvestigation_ICD" element
         */
        void xsetSecondaryInvestigationICD(uk.nhs.nhsia.datastandards.ecds.PrimaryDiagnosisICDType secondaryInvestigationICD);
        
        /**
         * A factory class with static methods for creating instances
         * of this type.
         */
        
        public static final class Factory
        {
            public static uk.nhs.nhsia.datastandards.ecds.ClinicalInvestigationGroupICDType.SecondaryInvestigationGroupICD newInstance() {
              return (uk.nhs.nhsia.datastandards.ecds.ClinicalInvestigationGroupICDType.SecondaryInvestigationGroupICD) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().newInstance( type, null ); }
            
            public static uk.nhs.nhsia.datastandards.ecds.ClinicalInvestigationGroupICDType.SecondaryInvestigationGroupICD newInstance(org.apache.xmlbeans.XmlOptions options) {
              return (uk.nhs.nhsia.datastandards.ecds.ClinicalInvestigationGroupICDType.SecondaryInvestigationGroupICD) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().newInstance( type, options ); }
            
            private Factory() { } // No instance of this class allowed
        }
    }
    
    /**
     * A factory class with static methods for creating instances
     * of this type.
     */
    
    public static final class Factory
    {
        public static uk.nhs.nhsia.datastandards.ecds.ClinicalInvestigationGroupICDType newInstance() {
          return (uk.nhs.nhsia.datastandards.ecds.ClinicalInvestigationGroupICDType) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().newInstance( type, null ); }
        
        public static uk.nhs.nhsia.datastandards.ecds.ClinicalInvestigationGroupICDType newInstance(org.apache.xmlbeans.XmlOptions options) {
          return (uk.nhs.nhsia.datastandards.ecds.ClinicalInvestigationGroupICDType) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().newInstance( type, options ); }
        
        /** @param xmlAsString the string value to parse */
        public static uk.nhs.nhsia.datastandards.ecds.ClinicalInvestigationGroupICDType parse(java.lang.String xmlAsString) throws org.apache.xmlbeans.XmlException {
          return (uk.nhs.nhsia.datastandards.ecds.ClinicalInvestigationGroupICDType) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( xmlAsString, type, null ); }
        
        public static uk.nhs.nhsia.datastandards.ecds.ClinicalInvestigationGroupICDType parse(java.lang.String xmlAsString, org.apache.xmlbeans.XmlOptions options) throws org.apache.xmlbeans.XmlException {
          return (uk.nhs.nhsia.datastandards.ecds.ClinicalInvestigationGroupICDType) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( xmlAsString, type, options ); }
        
        /** @param file the file from which to load an xml document */
        public static uk.nhs.nhsia.datastandards.ecds.ClinicalInvestigationGroupICDType parse(java.io.File file) throws org.apache.xmlbeans.XmlException, java.io.IOException {
          return (uk.nhs.nhsia.datastandards.ecds.ClinicalInvestigationGroupICDType) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( file, type, null ); }
        
        public static uk.nhs.nhsia.datastandards.ecds.ClinicalInvestigationGroupICDType parse(java.io.File file, org.apache.xmlbeans.XmlOptions options) throws org.apache.xmlbeans.XmlException, java.io.IOException {
          return (uk.nhs.nhsia.datastandards.ecds.ClinicalInvestigationGroupICDType) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( file, type, options ); }
        
        public static uk.nhs.nhsia.datastandards.ecds.ClinicalInvestigationGroupICDType parse(java.net.URL u) throws org.apache.xmlbeans.XmlException, java.io.IOException {
          return (uk.nhs.nhsia.datastandards.ecds.ClinicalInvestigationGroupICDType) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( u, type, null ); }
        
        public static uk.nhs.nhsia.datastandards.ecds.ClinicalInvestigationGroupICDType parse(java.net.URL u, org.apache.xmlbeans.XmlOptions options) throws org.apache.xmlbeans.XmlException, java.io.IOException {
          return (uk.nhs.nhsia.datastandards.ecds.ClinicalInvestigationGroupICDType) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( u, type, options ); }
        
        public static uk.nhs.nhsia.datastandards.ecds.ClinicalInvestigationGroupICDType parse(java.io.InputStream is) throws org.apache.xmlbeans.XmlException, java.io.IOException {
          return (uk.nhs.nhsia.datastandards.ecds.ClinicalInvestigationGroupICDType) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( is, type, null ); }
        
        public static uk.nhs.nhsia.datastandards.ecds.ClinicalInvestigationGroupICDType parse(java.io.InputStream is, org.apache.xmlbeans.XmlOptions options) throws org.apache.xmlbeans.XmlException, java.io.IOException {
          return (uk.nhs.nhsia.datastandards.ecds.ClinicalInvestigationGroupICDType) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( is, type, options ); }
        
        public static uk.nhs.nhsia.datastandards.ecds.ClinicalInvestigationGroupICDType parse(java.io.Reader r) throws org.apache.xmlbeans.XmlException, java.io.IOException {
          return (uk.nhs.nhsia.datastandards.ecds.ClinicalInvestigationGroupICDType) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( r, type, null ); }
        
        public static uk.nhs.nhsia.datastandards.ecds.ClinicalInvestigationGroupICDType parse(java.io.Reader r, org.apache.xmlbeans.XmlOptions options) throws org.apache.xmlbeans.XmlException, java.io.IOException {
          return (uk.nhs.nhsia.datastandards.ecds.ClinicalInvestigationGroupICDType) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( r, type, options ); }
        
        public static uk.nhs.nhsia.datastandards.ecds.ClinicalInvestigationGroupICDType parse(javax.xml.stream.XMLStreamReader sr) throws org.apache.xmlbeans.XmlException {
          return (uk.nhs.nhsia.datastandards.ecds.ClinicalInvestigationGroupICDType) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( sr, type, null ); }
        
        public static uk.nhs.nhsia.datastandards.ecds.ClinicalInvestigationGroupICDType parse(javax.xml.stream.XMLStreamReader sr, org.apache.xmlbeans.XmlOptions options) throws org.apache.xmlbeans.XmlException {
          return (uk.nhs.nhsia.datastandards.ecds.ClinicalInvestigationGroupICDType) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( sr, type, options ); }
        
        public static uk.nhs.nhsia.datastandards.ecds.ClinicalInvestigationGroupICDType parse(org.w3c.dom.Node node) throws org.apache.xmlbeans.XmlException {
          return (uk.nhs.nhsia.datastandards.ecds.ClinicalInvestigationGroupICDType) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( node, type, null ); }
        
        public static uk.nhs.nhsia.datastandards.ecds.ClinicalInvestigationGroupICDType parse(org.w3c.dom.Node node, org.apache.xmlbeans.XmlOptions options) throws org.apache.xmlbeans.XmlException {
          return (uk.nhs.nhsia.datastandards.ecds.ClinicalInvestigationGroupICDType) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( node, type, options ); }
        
        /** @deprecated {@link org.apache.xmlbeans.xml.stream.XMLInputStream} */
        public static uk.nhs.nhsia.datastandards.ecds.ClinicalInvestigationGroupICDType parse(org.apache.xmlbeans.xml.stream.XMLInputStream xis) throws org.apache.xmlbeans.XmlException, org.apache.xmlbeans.xml.stream.XMLStreamException {
          return (uk.nhs.nhsia.datastandards.ecds.ClinicalInvestigationGroupICDType) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( xis, type, null ); }
        
        /** @deprecated {@link org.apache.xmlbeans.xml.stream.XMLInputStream} */
        public static uk.nhs.nhsia.datastandards.ecds.ClinicalInvestigationGroupICDType parse(org.apache.xmlbeans.xml.stream.XMLInputStream xis, org.apache.xmlbeans.XmlOptions options) throws org.apache.xmlbeans.XmlException, org.apache.xmlbeans.xml.stream.XMLStreamException {
          return (uk.nhs.nhsia.datastandards.ecds.ClinicalInvestigationGroupICDType) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( xis, type, options ); }
        
        /** @deprecated {@link org.apache.xmlbeans.xml.stream.XMLInputStream} */
        public static org.apache.xmlbeans.xml.stream.XMLInputStream newValidatingXMLInputStream(org.apache.xmlbeans.xml.stream.XMLInputStream xis) throws org.apache.xmlbeans.XmlException, org.apache.xmlbeans.xml.stream.XMLStreamException {
          return org.apache.xmlbeans.XmlBeans.getContextTypeLoader().newValidatingXMLInputStream( xis, type, null ); }
        
        /** @deprecated {@link org.apache.xmlbeans.xml.stream.XMLInputStream} */
        public static org.apache.xmlbeans.xml.stream.XMLInputStream newValidatingXMLInputStream(org.apache.xmlbeans.xml.stream.XMLInputStream xis, org.apache.xmlbeans.XmlOptions options) throws org.apache.xmlbeans.XmlException, org.apache.xmlbeans.xml.stream.XMLStreamException {
          return org.apache.xmlbeans.XmlBeans.getContextTypeLoader().newValidatingXMLInputStream( xis, type, options ); }
        
        private Factory() { } // No instance of this class allowed
    }
}
