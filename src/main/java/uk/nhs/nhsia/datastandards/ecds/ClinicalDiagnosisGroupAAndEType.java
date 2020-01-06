/*
 * XML Type:  ClinicalDiagnosisGroupAAndE_Type
 * Namespace: http://www.nhsia.nhs.uk/DataStandards/XMLschema/CDS/ns
 * Java type: uk.nhs.nhsia.datastandards.ecds.ClinicalDiagnosisGroupAAndEType
 *
 * Automatically generated - do not modify.
 */
package uk.nhs.nhsia.datastandards.ecds;


/**
 * An XML ClinicalDiagnosisGroupAAndE_Type(@http://www.nhsia.nhs.uk/DataStandards/XMLschema/CDS/ns).
 *
 * This is a complex type.
 */
public interface ClinicalDiagnosisGroupAAndEType extends org.apache.xmlbeans.XmlObject
{
    public static final org.apache.xmlbeans.SchemaType type = (org.apache.xmlbeans.SchemaType)
        org.apache.xmlbeans.XmlBeans.typeSystemForClassLoader(ClinicalDiagnosisGroupAAndEType.class.getClassLoader(), "schemaorg_apache_xmlbeans.system.s30C1180FF47174E0C8A992A2D657328B").resolveHandle("clinicaldiagnosisgroupaandetype13e6type");
    
    /**
     * Gets the "DiagnosisSchemeInUse" element
     */
    uk.nhs.nhsia.datastandards.ecds.DiagnosisSchemeInUseType.Enum getDiagnosisSchemeInUse();
    
    /**
     * Gets (as xml) the "DiagnosisSchemeInUse" element
     */
    uk.nhs.nhsia.datastandards.ecds.DiagnosisSchemeInUseType xgetDiagnosisSchemeInUse();
    
    /**
     * Sets the "DiagnosisSchemeInUse" element
     */
    void setDiagnosisSchemeInUse(uk.nhs.nhsia.datastandards.ecds.DiagnosisSchemeInUseType.Enum diagnosisSchemeInUse);
    
    /**
     * Sets (as xml) the "DiagnosisSchemeInUse" element
     */
    void xsetDiagnosisSchemeInUse(uk.nhs.nhsia.datastandards.ecds.DiagnosisSchemeInUseType diagnosisSchemeInUse);
    
    /**
     * Gets the "PrimaryDiagnosisGroupAAndE" element
     */
    uk.nhs.nhsia.datastandards.ecds.ClinicalDiagnosisGroupAAndEType.PrimaryDiagnosisGroupAAndE getPrimaryDiagnosisGroupAAndE();
    
    /**
     * Sets the "PrimaryDiagnosisGroupAAndE" element
     */
    void setPrimaryDiagnosisGroupAAndE(uk.nhs.nhsia.datastandards.ecds.ClinicalDiagnosisGroupAAndEType.PrimaryDiagnosisGroupAAndE primaryDiagnosisGroupAAndE);
    
    /**
     * Appends and returns a new empty "PrimaryDiagnosisGroupAAndE" element
     */
    uk.nhs.nhsia.datastandards.ecds.ClinicalDiagnosisGroupAAndEType.PrimaryDiagnosisGroupAAndE addNewPrimaryDiagnosisGroupAAndE();
    
    /**
     * Gets array of all "SecondaryDiagnosisGroupAAndE" elements
     */
    uk.nhs.nhsia.datastandards.ecds.ClinicalDiagnosisGroupAAndEType.SecondaryDiagnosisGroupAAndE[] getSecondaryDiagnosisGroupAAndEArray();
    
    /**
     * Gets ith "SecondaryDiagnosisGroupAAndE" element
     */
    uk.nhs.nhsia.datastandards.ecds.ClinicalDiagnosisGroupAAndEType.SecondaryDiagnosisGroupAAndE getSecondaryDiagnosisGroupAAndEArray(int i);
    
    /**
     * Returns number of "SecondaryDiagnosisGroupAAndE" element
     */
    int sizeOfSecondaryDiagnosisGroupAAndEArray();
    
    /**
     * Sets array of all "SecondaryDiagnosisGroupAAndE" element
     */
    void setSecondaryDiagnosisGroupAAndEArray(uk.nhs.nhsia.datastandards.ecds.ClinicalDiagnosisGroupAAndEType.SecondaryDiagnosisGroupAAndE[] secondaryDiagnosisGroupAAndEArray);
    
    /**
     * Sets ith "SecondaryDiagnosisGroupAAndE" element
     */
    void setSecondaryDiagnosisGroupAAndEArray(int i, uk.nhs.nhsia.datastandards.ecds.ClinicalDiagnosisGroupAAndEType.SecondaryDiagnosisGroupAAndE secondaryDiagnosisGroupAAndE);
    
    /**
     * Inserts and returns a new empty value (as xml) as the ith "SecondaryDiagnosisGroupAAndE" element
     */
    uk.nhs.nhsia.datastandards.ecds.ClinicalDiagnosisGroupAAndEType.SecondaryDiagnosisGroupAAndE insertNewSecondaryDiagnosisGroupAAndE(int i);
    
    /**
     * Appends and returns a new empty value (as xml) as the last "SecondaryDiagnosisGroupAAndE" element
     */
    uk.nhs.nhsia.datastandards.ecds.ClinicalDiagnosisGroupAAndEType.SecondaryDiagnosisGroupAAndE addNewSecondaryDiagnosisGroupAAndE();
    
    /**
     * Removes the ith "SecondaryDiagnosisGroupAAndE" element
     */
    void removeSecondaryDiagnosisGroupAAndE(int i);
    
    /**
     * An XML PrimaryDiagnosisGroupAAndE(@http://www.nhsia.nhs.uk/DataStandards/XMLschema/CDS/ns).
     *
     * This is a complex type.
     */
    public interface PrimaryDiagnosisGroupAAndE extends org.apache.xmlbeans.XmlObject
    {
        public static final org.apache.xmlbeans.SchemaType type = (org.apache.xmlbeans.SchemaType)
            org.apache.xmlbeans.XmlBeans.typeSystemForClassLoader(PrimaryDiagnosisGroupAAndE.class.getClassLoader(), "schemaorg_apache_xmlbeans.system.s30C1180FF47174E0C8A992A2D657328B").resolveHandle("primarydiagnosisgroupaande5161elemtype");
        
        /**
         * Gets the "PrimaryDiagnosis_AAndE" element
         */
        java.lang.String getPrimaryDiagnosisAAndE();
        
        /**
         * Gets (as xml) the "PrimaryDiagnosis_AAndE" element
         */
        uk.nhs.nhsia.datastandards.ecds.AAndEDiagnosisType xgetPrimaryDiagnosisAAndE();
        
        /**
         * Sets the "PrimaryDiagnosis_AAndE" element
         */
        void setPrimaryDiagnosisAAndE(java.lang.String primaryDiagnosisAAndE);
        
        /**
         * Sets (as xml) the "PrimaryDiagnosis_AAndE" element
         */
        void xsetPrimaryDiagnosisAAndE(uk.nhs.nhsia.datastandards.ecds.AAndEDiagnosisType primaryDiagnosisAAndE);
        
        /**
         * A factory class with static methods for creating instances
         * of this type.
         */
        
        public static final class Factory
        {
            public static uk.nhs.nhsia.datastandards.ecds.ClinicalDiagnosisGroupAAndEType.PrimaryDiagnosisGroupAAndE newInstance() {
              return (uk.nhs.nhsia.datastandards.ecds.ClinicalDiagnosisGroupAAndEType.PrimaryDiagnosisGroupAAndE) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().newInstance( type, null ); }
            
            public static uk.nhs.nhsia.datastandards.ecds.ClinicalDiagnosisGroupAAndEType.PrimaryDiagnosisGroupAAndE newInstance(org.apache.xmlbeans.XmlOptions options) {
              return (uk.nhs.nhsia.datastandards.ecds.ClinicalDiagnosisGroupAAndEType.PrimaryDiagnosisGroupAAndE) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().newInstance( type, options ); }
            
            private Factory() { } // No instance of this class allowed
        }
    }
    
    /**
     * An XML SecondaryDiagnosisGroupAAndE(@http://www.nhsia.nhs.uk/DataStandards/XMLschema/CDS/ns).
     *
     * This is a complex type.
     */
    public interface SecondaryDiagnosisGroupAAndE extends org.apache.xmlbeans.XmlObject
    {
        public static final org.apache.xmlbeans.SchemaType type = (org.apache.xmlbeans.SchemaType)
            org.apache.xmlbeans.XmlBeans.typeSystemForClassLoader(SecondaryDiagnosisGroupAAndE.class.getClassLoader(), "schemaorg_apache_xmlbeans.system.s30C1180FF47174E0C8A992A2D657328B").resolveHandle("secondarydiagnosisgroupaande212felemtype");
        
        /**
         * Gets the "SecondaryDiagnosis_AandE" element
         */
        java.lang.String getSecondaryDiagnosisAandE();
        
        /**
         * Gets (as xml) the "SecondaryDiagnosis_AandE" element
         */
        uk.nhs.nhsia.datastandards.ecds.AAndEDiagnosisType xgetSecondaryDiagnosisAandE();
        
        /**
         * Sets the "SecondaryDiagnosis_AandE" element
         */
        void setSecondaryDiagnosisAandE(java.lang.String secondaryDiagnosisAandE);
        
        /**
         * Sets (as xml) the "SecondaryDiagnosis_AandE" element
         */
        void xsetSecondaryDiagnosisAandE(uk.nhs.nhsia.datastandards.ecds.AAndEDiagnosisType secondaryDiagnosisAandE);
        
        /**
         * A factory class with static methods for creating instances
         * of this type.
         */
        
        public static final class Factory
        {
            public static uk.nhs.nhsia.datastandards.ecds.ClinicalDiagnosisGroupAAndEType.SecondaryDiagnosisGroupAAndE newInstance() {
              return (uk.nhs.nhsia.datastandards.ecds.ClinicalDiagnosisGroupAAndEType.SecondaryDiagnosisGroupAAndE) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().newInstance( type, null ); }
            
            public static uk.nhs.nhsia.datastandards.ecds.ClinicalDiagnosisGroupAAndEType.SecondaryDiagnosisGroupAAndE newInstance(org.apache.xmlbeans.XmlOptions options) {
              return (uk.nhs.nhsia.datastandards.ecds.ClinicalDiagnosisGroupAAndEType.SecondaryDiagnosisGroupAAndE) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().newInstance( type, options ); }
            
            private Factory() { } // No instance of this class allowed
        }
    }
    
    /**
     * A factory class with static methods for creating instances
     * of this type.
     */
    
    public static final class Factory
    {
        public static uk.nhs.nhsia.datastandards.ecds.ClinicalDiagnosisGroupAAndEType newInstance() {
          return (uk.nhs.nhsia.datastandards.ecds.ClinicalDiagnosisGroupAAndEType) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().newInstance( type, null ); }
        
        public static uk.nhs.nhsia.datastandards.ecds.ClinicalDiagnosisGroupAAndEType newInstance(org.apache.xmlbeans.XmlOptions options) {
          return (uk.nhs.nhsia.datastandards.ecds.ClinicalDiagnosisGroupAAndEType) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().newInstance( type, options ); }
        
        /** @param xmlAsString the string value to parse */
        public static uk.nhs.nhsia.datastandards.ecds.ClinicalDiagnosisGroupAAndEType parse(java.lang.String xmlAsString) throws org.apache.xmlbeans.XmlException {
          return (uk.nhs.nhsia.datastandards.ecds.ClinicalDiagnosisGroupAAndEType) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( xmlAsString, type, null ); }
        
        public static uk.nhs.nhsia.datastandards.ecds.ClinicalDiagnosisGroupAAndEType parse(java.lang.String xmlAsString, org.apache.xmlbeans.XmlOptions options) throws org.apache.xmlbeans.XmlException {
          return (uk.nhs.nhsia.datastandards.ecds.ClinicalDiagnosisGroupAAndEType) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( xmlAsString, type, options ); }
        
        /** @param file the file from which to load an xml document */
        public static uk.nhs.nhsia.datastandards.ecds.ClinicalDiagnosisGroupAAndEType parse(java.io.File file) throws org.apache.xmlbeans.XmlException, java.io.IOException {
          return (uk.nhs.nhsia.datastandards.ecds.ClinicalDiagnosisGroupAAndEType) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( file, type, null ); }
        
        public static uk.nhs.nhsia.datastandards.ecds.ClinicalDiagnosisGroupAAndEType parse(java.io.File file, org.apache.xmlbeans.XmlOptions options) throws org.apache.xmlbeans.XmlException, java.io.IOException {
          return (uk.nhs.nhsia.datastandards.ecds.ClinicalDiagnosisGroupAAndEType) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( file, type, options ); }
        
        public static uk.nhs.nhsia.datastandards.ecds.ClinicalDiagnosisGroupAAndEType parse(java.net.URL u) throws org.apache.xmlbeans.XmlException, java.io.IOException {
          return (uk.nhs.nhsia.datastandards.ecds.ClinicalDiagnosisGroupAAndEType) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( u, type, null ); }
        
        public static uk.nhs.nhsia.datastandards.ecds.ClinicalDiagnosisGroupAAndEType parse(java.net.URL u, org.apache.xmlbeans.XmlOptions options) throws org.apache.xmlbeans.XmlException, java.io.IOException {
          return (uk.nhs.nhsia.datastandards.ecds.ClinicalDiagnosisGroupAAndEType) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( u, type, options ); }
        
        public static uk.nhs.nhsia.datastandards.ecds.ClinicalDiagnosisGroupAAndEType parse(java.io.InputStream is) throws org.apache.xmlbeans.XmlException, java.io.IOException {
          return (uk.nhs.nhsia.datastandards.ecds.ClinicalDiagnosisGroupAAndEType) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( is, type, null ); }
        
        public static uk.nhs.nhsia.datastandards.ecds.ClinicalDiagnosisGroupAAndEType parse(java.io.InputStream is, org.apache.xmlbeans.XmlOptions options) throws org.apache.xmlbeans.XmlException, java.io.IOException {
          return (uk.nhs.nhsia.datastandards.ecds.ClinicalDiagnosisGroupAAndEType) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( is, type, options ); }
        
        public static uk.nhs.nhsia.datastandards.ecds.ClinicalDiagnosisGroupAAndEType parse(java.io.Reader r) throws org.apache.xmlbeans.XmlException, java.io.IOException {
          return (uk.nhs.nhsia.datastandards.ecds.ClinicalDiagnosisGroupAAndEType) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( r, type, null ); }
        
        public static uk.nhs.nhsia.datastandards.ecds.ClinicalDiagnosisGroupAAndEType parse(java.io.Reader r, org.apache.xmlbeans.XmlOptions options) throws org.apache.xmlbeans.XmlException, java.io.IOException {
          return (uk.nhs.nhsia.datastandards.ecds.ClinicalDiagnosisGroupAAndEType) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( r, type, options ); }
        
        public static uk.nhs.nhsia.datastandards.ecds.ClinicalDiagnosisGroupAAndEType parse(javax.xml.stream.XMLStreamReader sr) throws org.apache.xmlbeans.XmlException {
          return (uk.nhs.nhsia.datastandards.ecds.ClinicalDiagnosisGroupAAndEType) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( sr, type, null ); }
        
        public static uk.nhs.nhsia.datastandards.ecds.ClinicalDiagnosisGroupAAndEType parse(javax.xml.stream.XMLStreamReader sr, org.apache.xmlbeans.XmlOptions options) throws org.apache.xmlbeans.XmlException {
          return (uk.nhs.nhsia.datastandards.ecds.ClinicalDiagnosisGroupAAndEType) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( sr, type, options ); }
        
        public static uk.nhs.nhsia.datastandards.ecds.ClinicalDiagnosisGroupAAndEType parse(org.w3c.dom.Node node) throws org.apache.xmlbeans.XmlException {
          return (uk.nhs.nhsia.datastandards.ecds.ClinicalDiagnosisGroupAAndEType) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( node, type, null ); }
        
        public static uk.nhs.nhsia.datastandards.ecds.ClinicalDiagnosisGroupAAndEType parse(org.w3c.dom.Node node, org.apache.xmlbeans.XmlOptions options) throws org.apache.xmlbeans.XmlException {
          return (uk.nhs.nhsia.datastandards.ecds.ClinicalDiagnosisGroupAAndEType) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( node, type, options ); }
        
        /** @deprecated {@link org.apache.xmlbeans.xml.stream.XMLInputStream} */
        public static uk.nhs.nhsia.datastandards.ecds.ClinicalDiagnosisGroupAAndEType parse(org.apache.xmlbeans.xml.stream.XMLInputStream xis) throws org.apache.xmlbeans.XmlException, org.apache.xmlbeans.xml.stream.XMLStreamException {
          return (uk.nhs.nhsia.datastandards.ecds.ClinicalDiagnosisGroupAAndEType) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( xis, type, null ); }
        
        /** @deprecated {@link org.apache.xmlbeans.xml.stream.XMLInputStream} */
        public static uk.nhs.nhsia.datastandards.ecds.ClinicalDiagnosisGroupAAndEType parse(org.apache.xmlbeans.xml.stream.XMLInputStream xis, org.apache.xmlbeans.XmlOptions options) throws org.apache.xmlbeans.XmlException, org.apache.xmlbeans.xml.stream.XMLStreamException {
          return (uk.nhs.nhsia.datastandards.ecds.ClinicalDiagnosisGroupAAndEType) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( xis, type, options ); }
        
        /** @deprecated {@link org.apache.xmlbeans.xml.stream.XMLInputStream} */
        public static org.apache.xmlbeans.xml.stream.XMLInputStream newValidatingXMLInputStream(org.apache.xmlbeans.xml.stream.XMLInputStream xis) throws org.apache.xmlbeans.XmlException, org.apache.xmlbeans.xml.stream.XMLStreamException {
          return org.apache.xmlbeans.XmlBeans.getContextTypeLoader().newValidatingXMLInputStream( xis, type, null ); }
        
        /** @deprecated {@link org.apache.xmlbeans.xml.stream.XMLInputStream} */
        public static org.apache.xmlbeans.xml.stream.XMLInputStream newValidatingXMLInputStream(org.apache.xmlbeans.xml.stream.XMLInputStream xis, org.apache.xmlbeans.XmlOptions options) throws org.apache.xmlbeans.XmlException, org.apache.xmlbeans.xml.stream.XMLStreamException {
          return org.apache.xmlbeans.XmlBeans.getContextTypeLoader().newValidatingXMLInputStream( xis, type, options ); }
        
        private Factory() { } // No instance of this class allowed
    }
}
