/*
 * XML Type:  ClinicalDiagnosisGroupICD_Type
 * Namespace: http://www.nhsia.nhs.uk/DataStandards/XMLschema/CDS/ns
 * Java type: uk.nhs.nhsia.datastandards.ecds.ClinicalDiagnosisGroupICDType
 *
 * Automatically generated - do not modify.
 */
package uk.nhs.nhsia.datastandards.ecds;


/**
 * An XML ClinicalDiagnosisGroupICD_Type(@http://www.nhsia.nhs.uk/DataStandards/XMLschema/CDS/ns).
 *
 * This is a complex type.
 */
public interface ClinicalDiagnosisGroupICDType extends org.apache.xmlbeans.XmlObject
{
    public static final org.apache.xmlbeans.SchemaType type = (org.apache.xmlbeans.SchemaType)
        org.apache.xmlbeans.XmlBeans.typeSystemForClassLoader(ClinicalDiagnosisGroupICDType.class.getClassLoader(), "schemaorg_apache_xmlbeans.system.s30C1180FF47174E0C8A992A2D657328B").resolveHandle("clinicaldiagnosisgroupicdtypee421type");
    
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
     * Gets the "PrimaryDiagnosisGroupICD" element
     */
    uk.nhs.nhsia.datastandards.ecds.ClinicalDiagnosisGroupICDType.PrimaryDiagnosisGroupICD getPrimaryDiagnosisGroupICD();
    
    /**
     * Sets the "PrimaryDiagnosisGroupICD" element
     */
    void setPrimaryDiagnosisGroupICD(uk.nhs.nhsia.datastandards.ecds.ClinicalDiagnosisGroupICDType.PrimaryDiagnosisGroupICD primaryDiagnosisGroupICD);
    
    /**
     * Appends and returns a new empty "PrimaryDiagnosisGroupICD" element
     */
    uk.nhs.nhsia.datastandards.ecds.ClinicalDiagnosisGroupICDType.PrimaryDiagnosisGroupICD addNewPrimaryDiagnosisGroupICD();
    
    /**
     * Gets array of all "SecondaryDiagnosisGroupICD" elements
     */
    uk.nhs.nhsia.datastandards.ecds.ClinicalDiagnosisGroupICDType.SecondaryDiagnosisGroupICD[] getSecondaryDiagnosisGroupICDArray();
    
    /**
     * Gets ith "SecondaryDiagnosisGroupICD" element
     */
    uk.nhs.nhsia.datastandards.ecds.ClinicalDiagnosisGroupICDType.SecondaryDiagnosisGroupICD getSecondaryDiagnosisGroupICDArray(int i);
    
    /**
     * Returns number of "SecondaryDiagnosisGroupICD" element
     */
    int sizeOfSecondaryDiagnosisGroupICDArray();
    
    /**
     * Sets array of all "SecondaryDiagnosisGroupICD" element
     */
    void setSecondaryDiagnosisGroupICDArray(uk.nhs.nhsia.datastandards.ecds.ClinicalDiagnosisGroupICDType.SecondaryDiagnosisGroupICD[] secondaryDiagnosisGroupICDArray);
    
    /**
     * Sets ith "SecondaryDiagnosisGroupICD" element
     */
    void setSecondaryDiagnosisGroupICDArray(int i, uk.nhs.nhsia.datastandards.ecds.ClinicalDiagnosisGroupICDType.SecondaryDiagnosisGroupICD secondaryDiagnosisGroupICD);
    
    /**
     * Inserts and returns a new empty value (as xml) as the ith "SecondaryDiagnosisGroupICD" element
     */
    uk.nhs.nhsia.datastandards.ecds.ClinicalDiagnosisGroupICDType.SecondaryDiagnosisGroupICD insertNewSecondaryDiagnosisGroupICD(int i);
    
    /**
     * Appends and returns a new empty value (as xml) as the last "SecondaryDiagnosisGroupICD" element
     */
    uk.nhs.nhsia.datastandards.ecds.ClinicalDiagnosisGroupICDType.SecondaryDiagnosisGroupICD addNewSecondaryDiagnosisGroupICD();
    
    /**
     * Removes the ith "SecondaryDiagnosisGroupICD" element
     */
    void removeSecondaryDiagnosisGroupICD(int i);
    
    /**
     * An XML PrimaryDiagnosisGroupICD(@http://www.nhsia.nhs.uk/DataStandards/XMLschema/CDS/ns).
     *
     * This is a complex type.
     */
    public interface PrimaryDiagnosisGroupICD extends org.apache.xmlbeans.XmlObject
    {
        public static final org.apache.xmlbeans.SchemaType type = (org.apache.xmlbeans.SchemaType)
            org.apache.xmlbeans.XmlBeans.typeSystemForClassLoader(PrimaryDiagnosisGroupICD.class.getClassLoader(), "schemaorg_apache_xmlbeans.system.s30C1180FF47174E0C8A992A2D657328B").resolveHandle("primarydiagnosisgroupicdfa97elemtype");
        
        /**
         * Gets the "PrimaryDiagnosis_ICD" element
         */
        java.lang.String getPrimaryDiagnosisICD();
        
        /**
         * Gets (as xml) the "PrimaryDiagnosis_ICD" element
         */
        uk.nhs.nhsia.datastandards.ecds.PrimaryDiagnosisICDType xgetPrimaryDiagnosisICD();
        
        /**
         * Sets the "PrimaryDiagnosis_ICD" element
         */
        void setPrimaryDiagnosisICD(java.lang.String primaryDiagnosisICD);
        
        /**
         * Sets (as xml) the "PrimaryDiagnosis_ICD" element
         */
        void xsetPrimaryDiagnosisICD(uk.nhs.nhsia.datastandards.ecds.PrimaryDiagnosisICDType primaryDiagnosisICD);
        
        /**
         * Gets the "PresentOnAdmissionIndicator" element
         */
        uk.nhs.nhsia.datastandards.ecds.PresentOnAdmissionIndicatorType.Enum getPresentOnAdmissionIndicator();
        
        /**
         * Gets (as xml) the "PresentOnAdmissionIndicator" element
         */
        uk.nhs.nhsia.datastandards.ecds.PresentOnAdmissionIndicatorType xgetPresentOnAdmissionIndicator();
        
        /**
         * True if has "PresentOnAdmissionIndicator" element
         */
        boolean isSetPresentOnAdmissionIndicator();
        
        /**
         * Sets the "PresentOnAdmissionIndicator" element
         */
        void setPresentOnAdmissionIndicator(uk.nhs.nhsia.datastandards.ecds.PresentOnAdmissionIndicatorType.Enum presentOnAdmissionIndicator);
        
        /**
         * Sets (as xml) the "PresentOnAdmissionIndicator" element
         */
        void xsetPresentOnAdmissionIndicator(uk.nhs.nhsia.datastandards.ecds.PresentOnAdmissionIndicatorType presentOnAdmissionIndicator);
        
        /**
         * Unsets the "PresentOnAdmissionIndicator" element
         */
        void unsetPresentOnAdmissionIndicator();
        
        /**
         * A factory class with static methods for creating instances
         * of this type.
         */
        
        public static final class Factory
        {
            public static uk.nhs.nhsia.datastandards.ecds.ClinicalDiagnosisGroupICDType.PrimaryDiagnosisGroupICD newInstance() {
              return (uk.nhs.nhsia.datastandards.ecds.ClinicalDiagnosisGroupICDType.PrimaryDiagnosisGroupICD) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().newInstance( type, null ); }
            
            public static uk.nhs.nhsia.datastandards.ecds.ClinicalDiagnosisGroupICDType.PrimaryDiagnosisGroupICD newInstance(org.apache.xmlbeans.XmlOptions options) {
              return (uk.nhs.nhsia.datastandards.ecds.ClinicalDiagnosisGroupICDType.PrimaryDiagnosisGroupICD) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().newInstance( type, options ); }
            
            private Factory() { } // No instance of this class allowed
        }
    }
    
    /**
     * An XML SecondaryDiagnosisGroupICD(@http://www.nhsia.nhs.uk/DataStandards/XMLschema/CDS/ns).
     *
     * This is a complex type.
     */
    public interface SecondaryDiagnosisGroupICD extends org.apache.xmlbeans.XmlObject
    {
        public static final org.apache.xmlbeans.SchemaType type = (org.apache.xmlbeans.SchemaType)
            org.apache.xmlbeans.XmlBeans.typeSystemForClassLoader(SecondaryDiagnosisGroupICD.class.getClassLoader(), "schemaorg_apache_xmlbeans.system.s30C1180FF47174E0C8A992A2D657328B").resolveHandle("secondarydiagnosisgroupicde165elemtype");
        
        /**
         * Gets the "SecondaryDiagnosis_ICD" element
         */
        java.lang.String getSecondaryDiagnosisICD();
        
        /**
         * Gets (as xml) the "SecondaryDiagnosis_ICD" element
         */
        uk.nhs.nhsia.datastandards.ecds.SecondaryDiagnosisICDType xgetSecondaryDiagnosisICD();
        
        /**
         * Sets the "SecondaryDiagnosis_ICD" element
         */
        void setSecondaryDiagnosisICD(java.lang.String secondaryDiagnosisICD);
        
        /**
         * Sets (as xml) the "SecondaryDiagnosis_ICD" element
         */
        void xsetSecondaryDiagnosisICD(uk.nhs.nhsia.datastandards.ecds.SecondaryDiagnosisICDType secondaryDiagnosisICD);
        
        /**
         * Gets the "PresentOnAdmissionIndicator" element
         */
        uk.nhs.nhsia.datastandards.ecds.PresentOnAdmissionIndicatorType.Enum getPresentOnAdmissionIndicator();
        
        /**
         * Gets (as xml) the "PresentOnAdmissionIndicator" element
         */
        uk.nhs.nhsia.datastandards.ecds.PresentOnAdmissionIndicatorType xgetPresentOnAdmissionIndicator();
        
        /**
         * True if has "PresentOnAdmissionIndicator" element
         */
        boolean isSetPresentOnAdmissionIndicator();
        
        /**
         * Sets the "PresentOnAdmissionIndicator" element
         */
        void setPresentOnAdmissionIndicator(uk.nhs.nhsia.datastandards.ecds.PresentOnAdmissionIndicatorType.Enum presentOnAdmissionIndicator);
        
        /**
         * Sets (as xml) the "PresentOnAdmissionIndicator" element
         */
        void xsetPresentOnAdmissionIndicator(uk.nhs.nhsia.datastandards.ecds.PresentOnAdmissionIndicatorType presentOnAdmissionIndicator);
        
        /**
         * Unsets the "PresentOnAdmissionIndicator" element
         */
        void unsetPresentOnAdmissionIndicator();
        
        /**
         * A factory class with static methods for creating instances
         * of this type.
         */
        
        public static final class Factory
        {
            public static uk.nhs.nhsia.datastandards.ecds.ClinicalDiagnosisGroupICDType.SecondaryDiagnosisGroupICD newInstance() {
              return (uk.nhs.nhsia.datastandards.ecds.ClinicalDiagnosisGroupICDType.SecondaryDiagnosisGroupICD) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().newInstance( type, null ); }
            
            public static uk.nhs.nhsia.datastandards.ecds.ClinicalDiagnosisGroupICDType.SecondaryDiagnosisGroupICD newInstance(org.apache.xmlbeans.XmlOptions options) {
              return (uk.nhs.nhsia.datastandards.ecds.ClinicalDiagnosisGroupICDType.SecondaryDiagnosisGroupICD) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().newInstance( type, options ); }
            
            private Factory() { } // No instance of this class allowed
        }
    }
    
    /**
     * A factory class with static methods for creating instances
     * of this type.
     */
    
    public static final class Factory
    {
        public static uk.nhs.nhsia.datastandards.ecds.ClinicalDiagnosisGroupICDType newInstance() {
          return (uk.nhs.nhsia.datastandards.ecds.ClinicalDiagnosisGroupICDType) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().newInstance( type, null ); }
        
        public static uk.nhs.nhsia.datastandards.ecds.ClinicalDiagnosisGroupICDType newInstance(org.apache.xmlbeans.XmlOptions options) {
          return (uk.nhs.nhsia.datastandards.ecds.ClinicalDiagnosisGroupICDType) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().newInstance( type, options ); }
        
        /** @param xmlAsString the string value to parse */
        public static uk.nhs.nhsia.datastandards.ecds.ClinicalDiagnosisGroupICDType parse(java.lang.String xmlAsString) throws org.apache.xmlbeans.XmlException {
          return (uk.nhs.nhsia.datastandards.ecds.ClinicalDiagnosisGroupICDType) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( xmlAsString, type, null ); }
        
        public static uk.nhs.nhsia.datastandards.ecds.ClinicalDiagnosisGroupICDType parse(java.lang.String xmlAsString, org.apache.xmlbeans.XmlOptions options) throws org.apache.xmlbeans.XmlException {
          return (uk.nhs.nhsia.datastandards.ecds.ClinicalDiagnosisGroupICDType) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( xmlAsString, type, options ); }
        
        /** @param file the file from which to load an xml document */
        public static uk.nhs.nhsia.datastandards.ecds.ClinicalDiagnosisGroupICDType parse(java.io.File file) throws org.apache.xmlbeans.XmlException, java.io.IOException {
          return (uk.nhs.nhsia.datastandards.ecds.ClinicalDiagnosisGroupICDType) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( file, type, null ); }
        
        public static uk.nhs.nhsia.datastandards.ecds.ClinicalDiagnosisGroupICDType parse(java.io.File file, org.apache.xmlbeans.XmlOptions options) throws org.apache.xmlbeans.XmlException, java.io.IOException {
          return (uk.nhs.nhsia.datastandards.ecds.ClinicalDiagnosisGroupICDType) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( file, type, options ); }
        
        public static uk.nhs.nhsia.datastandards.ecds.ClinicalDiagnosisGroupICDType parse(java.net.URL u) throws org.apache.xmlbeans.XmlException, java.io.IOException {
          return (uk.nhs.nhsia.datastandards.ecds.ClinicalDiagnosisGroupICDType) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( u, type, null ); }
        
        public static uk.nhs.nhsia.datastandards.ecds.ClinicalDiagnosisGroupICDType parse(java.net.URL u, org.apache.xmlbeans.XmlOptions options) throws org.apache.xmlbeans.XmlException, java.io.IOException {
          return (uk.nhs.nhsia.datastandards.ecds.ClinicalDiagnosisGroupICDType) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( u, type, options ); }
        
        public static uk.nhs.nhsia.datastandards.ecds.ClinicalDiagnosisGroupICDType parse(java.io.InputStream is) throws org.apache.xmlbeans.XmlException, java.io.IOException {
          return (uk.nhs.nhsia.datastandards.ecds.ClinicalDiagnosisGroupICDType) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( is, type, null ); }
        
        public static uk.nhs.nhsia.datastandards.ecds.ClinicalDiagnosisGroupICDType parse(java.io.InputStream is, org.apache.xmlbeans.XmlOptions options) throws org.apache.xmlbeans.XmlException, java.io.IOException {
          return (uk.nhs.nhsia.datastandards.ecds.ClinicalDiagnosisGroupICDType) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( is, type, options ); }
        
        public static uk.nhs.nhsia.datastandards.ecds.ClinicalDiagnosisGroupICDType parse(java.io.Reader r) throws org.apache.xmlbeans.XmlException, java.io.IOException {
          return (uk.nhs.nhsia.datastandards.ecds.ClinicalDiagnosisGroupICDType) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( r, type, null ); }
        
        public static uk.nhs.nhsia.datastandards.ecds.ClinicalDiagnosisGroupICDType parse(java.io.Reader r, org.apache.xmlbeans.XmlOptions options) throws org.apache.xmlbeans.XmlException, java.io.IOException {
          return (uk.nhs.nhsia.datastandards.ecds.ClinicalDiagnosisGroupICDType) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( r, type, options ); }
        
        public static uk.nhs.nhsia.datastandards.ecds.ClinicalDiagnosisGroupICDType parse(javax.xml.stream.XMLStreamReader sr) throws org.apache.xmlbeans.XmlException {
          return (uk.nhs.nhsia.datastandards.ecds.ClinicalDiagnosisGroupICDType) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( sr, type, null ); }
        
        public static uk.nhs.nhsia.datastandards.ecds.ClinicalDiagnosisGroupICDType parse(javax.xml.stream.XMLStreamReader sr, org.apache.xmlbeans.XmlOptions options) throws org.apache.xmlbeans.XmlException {
          return (uk.nhs.nhsia.datastandards.ecds.ClinicalDiagnosisGroupICDType) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( sr, type, options ); }
        
        public static uk.nhs.nhsia.datastandards.ecds.ClinicalDiagnosisGroupICDType parse(org.w3c.dom.Node node) throws org.apache.xmlbeans.XmlException {
          return (uk.nhs.nhsia.datastandards.ecds.ClinicalDiagnosisGroupICDType) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( node, type, null ); }
        
        public static uk.nhs.nhsia.datastandards.ecds.ClinicalDiagnosisGroupICDType parse(org.w3c.dom.Node node, org.apache.xmlbeans.XmlOptions options) throws org.apache.xmlbeans.XmlException {
          return (uk.nhs.nhsia.datastandards.ecds.ClinicalDiagnosisGroupICDType) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( node, type, options ); }
        
        /** @deprecated {@link org.apache.xmlbeans.xml.stream.XMLInputStream} */
        public static uk.nhs.nhsia.datastandards.ecds.ClinicalDiagnosisGroupICDType parse(org.apache.xmlbeans.xml.stream.XMLInputStream xis) throws org.apache.xmlbeans.XmlException, org.apache.xmlbeans.xml.stream.XMLStreamException {
          return (uk.nhs.nhsia.datastandards.ecds.ClinicalDiagnosisGroupICDType) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( xis, type, null ); }
        
        /** @deprecated {@link org.apache.xmlbeans.xml.stream.XMLInputStream} */
        public static uk.nhs.nhsia.datastandards.ecds.ClinicalDiagnosisGroupICDType parse(org.apache.xmlbeans.xml.stream.XMLInputStream xis, org.apache.xmlbeans.XmlOptions options) throws org.apache.xmlbeans.XmlException, org.apache.xmlbeans.xml.stream.XMLStreamException {
          return (uk.nhs.nhsia.datastandards.ecds.ClinicalDiagnosisGroupICDType) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( xis, type, options ); }
        
        /** @deprecated {@link org.apache.xmlbeans.xml.stream.XMLInputStream} */
        public static org.apache.xmlbeans.xml.stream.XMLInputStream newValidatingXMLInputStream(org.apache.xmlbeans.xml.stream.XMLInputStream xis) throws org.apache.xmlbeans.XmlException, org.apache.xmlbeans.xml.stream.XMLStreamException {
          return org.apache.xmlbeans.XmlBeans.getContextTypeLoader().newValidatingXMLInputStream( xis, type, null ); }
        
        /** @deprecated {@link org.apache.xmlbeans.xml.stream.XMLInputStream} */
        public static org.apache.xmlbeans.xml.stream.XMLInputStream newValidatingXMLInputStream(org.apache.xmlbeans.xml.stream.XMLInputStream xis, org.apache.xmlbeans.XmlOptions options) throws org.apache.xmlbeans.XmlException, org.apache.xmlbeans.xml.stream.XMLStreamException {
          return org.apache.xmlbeans.XmlBeans.getContextTypeLoader().newValidatingXMLInputStream( xis, type, options ); }
        
        private Factory() { } // No instance of this class allowed
    }
}
