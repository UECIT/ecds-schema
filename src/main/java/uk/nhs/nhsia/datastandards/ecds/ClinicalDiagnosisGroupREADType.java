/*
 * XML Type:  ClinicalDiagnosisGroupREAD_Type
 * Namespace: http://www.nhsia.nhs.uk/DataStandards/XMLschema/CDS/ns
 * Java type: uk.nhs.nhsia.datastandards.ecds.ClinicalDiagnosisGroupREADType
 *
 * Automatically generated - do not modify.
 */
package uk.nhs.nhsia.datastandards.ecds;


/**
 * An XML ClinicalDiagnosisGroupREAD_Type(@http://www.nhsia.nhs.uk/DataStandards/XMLschema/CDS/ns).
 *
 * This is a complex type.
 */
public interface ClinicalDiagnosisGroupREADType extends org.apache.xmlbeans.XmlObject
{
    public static final org.apache.xmlbeans.SchemaType type = (org.apache.xmlbeans.SchemaType)
        org.apache.xmlbeans.XmlBeans.typeSystemForClassLoader(ClinicalDiagnosisGroupREADType.class.getClassLoader(), "schemaorg_apache_xmlbeans.system.s30C1180FF47174E0C8A992A2D657328B").resolveHandle("clinicaldiagnosisgroupreadtype1621type");
    
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
     * Gets the "PrimaryDiagnosisGroupREAD" element
     */
    uk.nhs.nhsia.datastandards.ecds.ClinicalDiagnosisGroupREADType.PrimaryDiagnosisGroupREAD getPrimaryDiagnosisGroupREAD();
    
    /**
     * Sets the "PrimaryDiagnosisGroupREAD" element
     */
    void setPrimaryDiagnosisGroupREAD(uk.nhs.nhsia.datastandards.ecds.ClinicalDiagnosisGroupREADType.PrimaryDiagnosisGroupREAD primaryDiagnosisGroupREAD);
    
    /**
     * Appends and returns a new empty "PrimaryDiagnosisGroupREAD" element
     */
    uk.nhs.nhsia.datastandards.ecds.ClinicalDiagnosisGroupREADType.PrimaryDiagnosisGroupREAD addNewPrimaryDiagnosisGroupREAD();
    
    /**
     * Gets array of all "SecondaryDiagnosisGroupREAD" elements
     */
    uk.nhs.nhsia.datastandards.ecds.ClinicalDiagnosisGroupREADType.SecondaryDiagnosisGroupREAD[] getSecondaryDiagnosisGroupREADArray();
    
    /**
     * Gets ith "SecondaryDiagnosisGroupREAD" element
     */
    uk.nhs.nhsia.datastandards.ecds.ClinicalDiagnosisGroupREADType.SecondaryDiagnosisGroupREAD getSecondaryDiagnosisGroupREADArray(int i);
    
    /**
     * Returns number of "SecondaryDiagnosisGroupREAD" element
     */
    int sizeOfSecondaryDiagnosisGroupREADArray();
    
    /**
     * Sets array of all "SecondaryDiagnosisGroupREAD" element
     */
    void setSecondaryDiagnosisGroupREADArray(uk.nhs.nhsia.datastandards.ecds.ClinicalDiagnosisGroupREADType.SecondaryDiagnosisGroupREAD[] secondaryDiagnosisGroupREADArray);
    
    /**
     * Sets ith "SecondaryDiagnosisGroupREAD" element
     */
    void setSecondaryDiagnosisGroupREADArray(int i, uk.nhs.nhsia.datastandards.ecds.ClinicalDiagnosisGroupREADType.SecondaryDiagnosisGroupREAD secondaryDiagnosisGroupREAD);
    
    /**
     * Inserts and returns a new empty value (as xml) as the ith "SecondaryDiagnosisGroupREAD" element
     */
    uk.nhs.nhsia.datastandards.ecds.ClinicalDiagnosisGroupREADType.SecondaryDiagnosisGroupREAD insertNewSecondaryDiagnosisGroupREAD(int i);
    
    /**
     * Appends and returns a new empty value (as xml) as the last "SecondaryDiagnosisGroupREAD" element
     */
    uk.nhs.nhsia.datastandards.ecds.ClinicalDiagnosisGroupREADType.SecondaryDiagnosisGroupREAD addNewSecondaryDiagnosisGroupREAD();
    
    /**
     * Removes the ith "SecondaryDiagnosisGroupREAD" element
     */
    void removeSecondaryDiagnosisGroupREAD(int i);
    
    /**
     * An XML PrimaryDiagnosisGroupREAD(@http://www.nhsia.nhs.uk/DataStandards/XMLschema/CDS/ns).
     *
     * This is a complex type.
     */
    public interface PrimaryDiagnosisGroupREAD extends org.apache.xmlbeans.XmlObject
    {
        public static final org.apache.xmlbeans.SchemaType type = (org.apache.xmlbeans.SchemaType)
            org.apache.xmlbeans.XmlBeans.typeSystemForClassLoader(PrimaryDiagnosisGroupREAD.class.getClassLoader(), "schemaorg_apache_xmlbeans.system.s30C1180FF47174E0C8A992A2D657328B").resolveHandle("primarydiagnosisgroupreada9cfelemtype");
        
        /**
         * Gets the "PrimaryDiagnosis_READ" element
         */
        java.lang.String getPrimaryDiagnosisREAD();
        
        /**
         * Gets (as xml) the "PrimaryDiagnosis_READ" element
         */
        uk.nhs.nhsia.datastandards.ecds.PrimaryDiagnosisREADType xgetPrimaryDiagnosisREAD();
        
        /**
         * Sets the "PrimaryDiagnosis_READ" element
         */
        void setPrimaryDiagnosisREAD(java.lang.String primaryDiagnosisREAD);
        
        /**
         * Sets (as xml) the "PrimaryDiagnosis_READ" element
         */
        void xsetPrimaryDiagnosisREAD(uk.nhs.nhsia.datastandards.ecds.PrimaryDiagnosisREADType primaryDiagnosisREAD);
        
        /**
         * A factory class with static methods for creating instances
         * of this type.
         */
        
        public static final class Factory
        {
            public static uk.nhs.nhsia.datastandards.ecds.ClinicalDiagnosisGroupREADType.PrimaryDiagnosisGroupREAD newInstance() {
              return (uk.nhs.nhsia.datastandards.ecds.ClinicalDiagnosisGroupREADType.PrimaryDiagnosisGroupREAD) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().newInstance( type, null ); }
            
            public static uk.nhs.nhsia.datastandards.ecds.ClinicalDiagnosisGroupREADType.PrimaryDiagnosisGroupREAD newInstance(org.apache.xmlbeans.XmlOptions options) {
              return (uk.nhs.nhsia.datastandards.ecds.ClinicalDiagnosisGroupREADType.PrimaryDiagnosisGroupREAD) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().newInstance( type, options ); }
            
            private Factory() { } // No instance of this class allowed
        }
    }
    
    /**
     * An XML SecondaryDiagnosisGroupREAD(@http://www.nhsia.nhs.uk/DataStandards/XMLschema/CDS/ns).
     *
     * This is a complex type.
     */
    public interface SecondaryDiagnosisGroupREAD extends org.apache.xmlbeans.XmlObject
    {
        public static final org.apache.xmlbeans.SchemaType type = (org.apache.xmlbeans.SchemaType)
            org.apache.xmlbeans.XmlBeans.typeSystemForClassLoader(SecondaryDiagnosisGroupREAD.class.getClassLoader(), "schemaorg_apache_xmlbeans.system.s30C1180FF47174E0C8A992A2D657328B").resolveHandle("secondarydiagnosisgroupread151delemtype");
        
        /**
         * Gets the "SecondaryDiagnosis_READ" element
         */
        java.lang.String getSecondaryDiagnosisREAD();
        
        /**
         * Gets (as xml) the "SecondaryDiagnosis_READ" element
         */
        uk.nhs.nhsia.datastandards.ecds.SecondaryDiagnosisREADType xgetSecondaryDiagnosisREAD();
        
        /**
         * Sets the "SecondaryDiagnosis_READ" element
         */
        void setSecondaryDiagnosisREAD(java.lang.String secondaryDiagnosisREAD);
        
        /**
         * Sets (as xml) the "SecondaryDiagnosis_READ" element
         */
        void xsetSecondaryDiagnosisREAD(uk.nhs.nhsia.datastandards.ecds.SecondaryDiagnosisREADType secondaryDiagnosisREAD);
        
        /**
         * A factory class with static methods for creating instances
         * of this type.
         */
        
        public static final class Factory
        {
            public static uk.nhs.nhsia.datastandards.ecds.ClinicalDiagnosisGroupREADType.SecondaryDiagnosisGroupREAD newInstance() {
              return (uk.nhs.nhsia.datastandards.ecds.ClinicalDiagnosisGroupREADType.SecondaryDiagnosisGroupREAD) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().newInstance( type, null ); }
            
            public static uk.nhs.nhsia.datastandards.ecds.ClinicalDiagnosisGroupREADType.SecondaryDiagnosisGroupREAD newInstance(org.apache.xmlbeans.XmlOptions options) {
              return (uk.nhs.nhsia.datastandards.ecds.ClinicalDiagnosisGroupREADType.SecondaryDiagnosisGroupREAD) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().newInstance( type, options ); }
            
            private Factory() { } // No instance of this class allowed
        }
    }
    
    /**
     * A factory class with static methods for creating instances
     * of this type.
     */
    
    public static final class Factory
    {
        public static uk.nhs.nhsia.datastandards.ecds.ClinicalDiagnosisGroupREADType newInstance() {
          return (uk.nhs.nhsia.datastandards.ecds.ClinicalDiagnosisGroupREADType) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().newInstance( type, null ); }
        
        public static uk.nhs.nhsia.datastandards.ecds.ClinicalDiagnosisGroupREADType newInstance(org.apache.xmlbeans.XmlOptions options) {
          return (uk.nhs.nhsia.datastandards.ecds.ClinicalDiagnosisGroupREADType) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().newInstance( type, options ); }
        
        /** @param xmlAsString the string value to parse */
        public static uk.nhs.nhsia.datastandards.ecds.ClinicalDiagnosisGroupREADType parse(java.lang.String xmlAsString) throws org.apache.xmlbeans.XmlException {
          return (uk.nhs.nhsia.datastandards.ecds.ClinicalDiagnosisGroupREADType) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( xmlAsString, type, null ); }
        
        public static uk.nhs.nhsia.datastandards.ecds.ClinicalDiagnosisGroupREADType parse(java.lang.String xmlAsString, org.apache.xmlbeans.XmlOptions options) throws org.apache.xmlbeans.XmlException {
          return (uk.nhs.nhsia.datastandards.ecds.ClinicalDiagnosisGroupREADType) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( xmlAsString, type, options ); }
        
        /** @param file the file from which to load an xml document */
        public static uk.nhs.nhsia.datastandards.ecds.ClinicalDiagnosisGroupREADType parse(java.io.File file) throws org.apache.xmlbeans.XmlException, java.io.IOException {
          return (uk.nhs.nhsia.datastandards.ecds.ClinicalDiagnosisGroupREADType) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( file, type, null ); }
        
        public static uk.nhs.nhsia.datastandards.ecds.ClinicalDiagnosisGroupREADType parse(java.io.File file, org.apache.xmlbeans.XmlOptions options) throws org.apache.xmlbeans.XmlException, java.io.IOException {
          return (uk.nhs.nhsia.datastandards.ecds.ClinicalDiagnosisGroupREADType) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( file, type, options ); }
        
        public static uk.nhs.nhsia.datastandards.ecds.ClinicalDiagnosisGroupREADType parse(java.net.URL u) throws org.apache.xmlbeans.XmlException, java.io.IOException {
          return (uk.nhs.nhsia.datastandards.ecds.ClinicalDiagnosisGroupREADType) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( u, type, null ); }
        
        public static uk.nhs.nhsia.datastandards.ecds.ClinicalDiagnosisGroupREADType parse(java.net.URL u, org.apache.xmlbeans.XmlOptions options) throws org.apache.xmlbeans.XmlException, java.io.IOException {
          return (uk.nhs.nhsia.datastandards.ecds.ClinicalDiagnosisGroupREADType) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( u, type, options ); }
        
        public static uk.nhs.nhsia.datastandards.ecds.ClinicalDiagnosisGroupREADType parse(java.io.InputStream is) throws org.apache.xmlbeans.XmlException, java.io.IOException {
          return (uk.nhs.nhsia.datastandards.ecds.ClinicalDiagnosisGroupREADType) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( is, type, null ); }
        
        public static uk.nhs.nhsia.datastandards.ecds.ClinicalDiagnosisGroupREADType parse(java.io.InputStream is, org.apache.xmlbeans.XmlOptions options) throws org.apache.xmlbeans.XmlException, java.io.IOException {
          return (uk.nhs.nhsia.datastandards.ecds.ClinicalDiagnosisGroupREADType) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( is, type, options ); }
        
        public static uk.nhs.nhsia.datastandards.ecds.ClinicalDiagnosisGroupREADType parse(java.io.Reader r) throws org.apache.xmlbeans.XmlException, java.io.IOException {
          return (uk.nhs.nhsia.datastandards.ecds.ClinicalDiagnosisGroupREADType) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( r, type, null ); }
        
        public static uk.nhs.nhsia.datastandards.ecds.ClinicalDiagnosisGroupREADType parse(java.io.Reader r, org.apache.xmlbeans.XmlOptions options) throws org.apache.xmlbeans.XmlException, java.io.IOException {
          return (uk.nhs.nhsia.datastandards.ecds.ClinicalDiagnosisGroupREADType) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( r, type, options ); }
        
        public static uk.nhs.nhsia.datastandards.ecds.ClinicalDiagnosisGroupREADType parse(javax.xml.stream.XMLStreamReader sr) throws org.apache.xmlbeans.XmlException {
          return (uk.nhs.nhsia.datastandards.ecds.ClinicalDiagnosisGroupREADType) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( sr, type, null ); }
        
        public static uk.nhs.nhsia.datastandards.ecds.ClinicalDiagnosisGroupREADType parse(javax.xml.stream.XMLStreamReader sr, org.apache.xmlbeans.XmlOptions options) throws org.apache.xmlbeans.XmlException {
          return (uk.nhs.nhsia.datastandards.ecds.ClinicalDiagnosisGroupREADType) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( sr, type, options ); }
        
        public static uk.nhs.nhsia.datastandards.ecds.ClinicalDiagnosisGroupREADType parse(org.w3c.dom.Node node) throws org.apache.xmlbeans.XmlException {
          return (uk.nhs.nhsia.datastandards.ecds.ClinicalDiagnosisGroupREADType) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( node, type, null ); }
        
        public static uk.nhs.nhsia.datastandards.ecds.ClinicalDiagnosisGroupREADType parse(org.w3c.dom.Node node, org.apache.xmlbeans.XmlOptions options) throws org.apache.xmlbeans.XmlException {
          return (uk.nhs.nhsia.datastandards.ecds.ClinicalDiagnosisGroupREADType) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( node, type, options ); }
        
        /** @deprecated {@link org.apache.xmlbeans.xml.stream.XMLInputStream} */
        public static uk.nhs.nhsia.datastandards.ecds.ClinicalDiagnosisGroupREADType parse(org.apache.xmlbeans.xml.stream.XMLInputStream xis) throws org.apache.xmlbeans.XmlException, org.apache.xmlbeans.xml.stream.XMLStreamException {
          return (uk.nhs.nhsia.datastandards.ecds.ClinicalDiagnosisGroupREADType) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( xis, type, null ); }
        
        /** @deprecated {@link org.apache.xmlbeans.xml.stream.XMLInputStream} */
        public static uk.nhs.nhsia.datastandards.ecds.ClinicalDiagnosisGroupREADType parse(org.apache.xmlbeans.xml.stream.XMLInputStream xis, org.apache.xmlbeans.XmlOptions options) throws org.apache.xmlbeans.XmlException, org.apache.xmlbeans.xml.stream.XMLStreamException {
          return (uk.nhs.nhsia.datastandards.ecds.ClinicalDiagnosisGroupREADType) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( xis, type, options ); }
        
        /** @deprecated {@link org.apache.xmlbeans.xml.stream.XMLInputStream} */
        public static org.apache.xmlbeans.xml.stream.XMLInputStream newValidatingXMLInputStream(org.apache.xmlbeans.xml.stream.XMLInputStream xis) throws org.apache.xmlbeans.XmlException, org.apache.xmlbeans.xml.stream.XMLStreamException {
          return org.apache.xmlbeans.XmlBeans.getContextTypeLoader().newValidatingXMLInputStream( xis, type, null ); }
        
        /** @deprecated {@link org.apache.xmlbeans.xml.stream.XMLInputStream} */
        public static org.apache.xmlbeans.xml.stream.XMLInputStream newValidatingXMLInputStream(org.apache.xmlbeans.xml.stream.XMLInputStream xis, org.apache.xmlbeans.XmlOptions options) throws org.apache.xmlbeans.XmlException, org.apache.xmlbeans.xml.stream.XMLStreamException {
          return org.apache.xmlbeans.XmlBeans.getContextTypeLoader().newValidatingXMLInputStream( xis, type, options ); }
        
        private Factory() { } // No instance of this class allowed
    }
}
