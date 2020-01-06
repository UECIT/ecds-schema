/*
 * XML Type:  ClinicalDiagnosis_AE_Structure
 * Namespace: http://www.nhsia.nhs.uk/DataStandards/XMLschema/CDS/ns
 * Java type: uk.nhs.nhsia.datastandards.ecds.ClinicalDiagnosisAEStructure
 *
 * Automatically generated - do not modify.
 */
package uk.nhs.nhsia.datastandards.ecds;


/**
 * An XML ClinicalDiagnosis_AE_Structure(@http://www.nhsia.nhs.uk/DataStandards/XMLschema/CDS/ns).
 *
 * This is a complex type.
 */
public interface ClinicalDiagnosisAEStructure extends org.apache.xmlbeans.XmlObject
{
    public static final org.apache.xmlbeans.SchemaType type = (org.apache.xmlbeans.SchemaType)
        org.apache.xmlbeans.XmlBeans.typeSystemForClassLoader(ClinicalDiagnosisAEStructure.class.getClassLoader(), "schemaorg_apache_xmlbeans.system.s30C1180FF47174E0C8A992A2D657328B").resolveHandle("clinicaldiagnosisaestructureb098type");
    
    /**
     * Gets the "ClinicalDiagnosisGroupICD" element
     */
    uk.nhs.nhsia.datastandards.ecds.ClinicalDiagnosisGroupICDType getClinicalDiagnosisGroupICD();
    
    /**
     * True if has "ClinicalDiagnosisGroupICD" element
     */
    boolean isSetClinicalDiagnosisGroupICD();
    
    /**
     * Sets the "ClinicalDiagnosisGroupICD" element
     */
    void setClinicalDiagnosisGroupICD(uk.nhs.nhsia.datastandards.ecds.ClinicalDiagnosisGroupICDType clinicalDiagnosisGroupICD);
    
    /**
     * Appends and returns a new empty "ClinicalDiagnosisGroupICD" element
     */
    uk.nhs.nhsia.datastandards.ecds.ClinicalDiagnosisGroupICDType addNewClinicalDiagnosisGroupICD();
    
    /**
     * Unsets the "ClinicalDiagnosisGroupICD" element
     */
    void unsetClinicalDiagnosisGroupICD();
    
    /**
     * Gets the "ClinicalDiagnosisGroupREAD" element
     */
    uk.nhs.nhsia.datastandards.ecds.ClinicalDiagnosisGroupREADType getClinicalDiagnosisGroupREAD();
    
    /**
     * True if has "ClinicalDiagnosisGroupREAD" element
     */
    boolean isSetClinicalDiagnosisGroupREAD();
    
    /**
     * Sets the "ClinicalDiagnosisGroupREAD" element
     */
    void setClinicalDiagnosisGroupREAD(uk.nhs.nhsia.datastandards.ecds.ClinicalDiagnosisGroupREADType clinicalDiagnosisGroupREAD);
    
    /**
     * Appends and returns a new empty "ClinicalDiagnosisGroupREAD" element
     */
    uk.nhs.nhsia.datastandards.ecds.ClinicalDiagnosisGroupREADType addNewClinicalDiagnosisGroupREAD();
    
    /**
     * Unsets the "ClinicalDiagnosisGroupREAD" element
     */
    void unsetClinicalDiagnosisGroupREAD();
    
    /**
     * Gets the "ClinicalDiagnosisGroupAAndE" element
     */
    uk.nhs.nhsia.datastandards.ecds.ClinicalDiagnosisGroupAAndEType getClinicalDiagnosisGroupAAndE();
    
    /**
     * True if has "ClinicalDiagnosisGroupAAndE" element
     */
    boolean isSetClinicalDiagnosisGroupAAndE();
    
    /**
     * Sets the "ClinicalDiagnosisGroupAAndE" element
     */
    void setClinicalDiagnosisGroupAAndE(uk.nhs.nhsia.datastandards.ecds.ClinicalDiagnosisGroupAAndEType clinicalDiagnosisGroupAAndE);
    
    /**
     * Appends and returns a new empty "ClinicalDiagnosisGroupAAndE" element
     */
    uk.nhs.nhsia.datastandards.ecds.ClinicalDiagnosisGroupAAndEType addNewClinicalDiagnosisGroupAAndE();
    
    /**
     * Unsets the "ClinicalDiagnosisGroupAAndE" element
     */
    void unsetClinicalDiagnosisGroupAAndE();
    
    /**
     * A factory class with static methods for creating instances
     * of this type.
     */
    
    public static final class Factory
    {
        public static uk.nhs.nhsia.datastandards.ecds.ClinicalDiagnosisAEStructure newInstance() {
          return (uk.nhs.nhsia.datastandards.ecds.ClinicalDiagnosisAEStructure) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().newInstance( type, null ); }
        
        public static uk.nhs.nhsia.datastandards.ecds.ClinicalDiagnosisAEStructure newInstance(org.apache.xmlbeans.XmlOptions options) {
          return (uk.nhs.nhsia.datastandards.ecds.ClinicalDiagnosisAEStructure) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().newInstance( type, options ); }
        
        /** @param xmlAsString the string value to parse */
        public static uk.nhs.nhsia.datastandards.ecds.ClinicalDiagnosisAEStructure parse(java.lang.String xmlAsString) throws org.apache.xmlbeans.XmlException {
          return (uk.nhs.nhsia.datastandards.ecds.ClinicalDiagnosisAEStructure) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( xmlAsString, type, null ); }
        
        public static uk.nhs.nhsia.datastandards.ecds.ClinicalDiagnosisAEStructure parse(java.lang.String xmlAsString, org.apache.xmlbeans.XmlOptions options) throws org.apache.xmlbeans.XmlException {
          return (uk.nhs.nhsia.datastandards.ecds.ClinicalDiagnosisAEStructure) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( xmlAsString, type, options ); }
        
        /** @param file the file from which to load an xml document */
        public static uk.nhs.nhsia.datastandards.ecds.ClinicalDiagnosisAEStructure parse(java.io.File file) throws org.apache.xmlbeans.XmlException, java.io.IOException {
          return (uk.nhs.nhsia.datastandards.ecds.ClinicalDiagnosisAEStructure) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( file, type, null ); }
        
        public static uk.nhs.nhsia.datastandards.ecds.ClinicalDiagnosisAEStructure parse(java.io.File file, org.apache.xmlbeans.XmlOptions options) throws org.apache.xmlbeans.XmlException, java.io.IOException {
          return (uk.nhs.nhsia.datastandards.ecds.ClinicalDiagnosisAEStructure) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( file, type, options ); }
        
        public static uk.nhs.nhsia.datastandards.ecds.ClinicalDiagnosisAEStructure parse(java.net.URL u) throws org.apache.xmlbeans.XmlException, java.io.IOException {
          return (uk.nhs.nhsia.datastandards.ecds.ClinicalDiagnosisAEStructure) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( u, type, null ); }
        
        public static uk.nhs.nhsia.datastandards.ecds.ClinicalDiagnosisAEStructure parse(java.net.URL u, org.apache.xmlbeans.XmlOptions options) throws org.apache.xmlbeans.XmlException, java.io.IOException {
          return (uk.nhs.nhsia.datastandards.ecds.ClinicalDiagnosisAEStructure) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( u, type, options ); }
        
        public static uk.nhs.nhsia.datastandards.ecds.ClinicalDiagnosisAEStructure parse(java.io.InputStream is) throws org.apache.xmlbeans.XmlException, java.io.IOException {
          return (uk.nhs.nhsia.datastandards.ecds.ClinicalDiagnosisAEStructure) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( is, type, null ); }
        
        public static uk.nhs.nhsia.datastandards.ecds.ClinicalDiagnosisAEStructure parse(java.io.InputStream is, org.apache.xmlbeans.XmlOptions options) throws org.apache.xmlbeans.XmlException, java.io.IOException {
          return (uk.nhs.nhsia.datastandards.ecds.ClinicalDiagnosisAEStructure) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( is, type, options ); }
        
        public static uk.nhs.nhsia.datastandards.ecds.ClinicalDiagnosisAEStructure parse(java.io.Reader r) throws org.apache.xmlbeans.XmlException, java.io.IOException {
          return (uk.nhs.nhsia.datastandards.ecds.ClinicalDiagnosisAEStructure) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( r, type, null ); }
        
        public static uk.nhs.nhsia.datastandards.ecds.ClinicalDiagnosisAEStructure parse(java.io.Reader r, org.apache.xmlbeans.XmlOptions options) throws org.apache.xmlbeans.XmlException, java.io.IOException {
          return (uk.nhs.nhsia.datastandards.ecds.ClinicalDiagnosisAEStructure) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( r, type, options ); }
        
        public static uk.nhs.nhsia.datastandards.ecds.ClinicalDiagnosisAEStructure parse(javax.xml.stream.XMLStreamReader sr) throws org.apache.xmlbeans.XmlException {
          return (uk.nhs.nhsia.datastandards.ecds.ClinicalDiagnosisAEStructure) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( sr, type, null ); }
        
        public static uk.nhs.nhsia.datastandards.ecds.ClinicalDiagnosisAEStructure parse(javax.xml.stream.XMLStreamReader sr, org.apache.xmlbeans.XmlOptions options) throws org.apache.xmlbeans.XmlException {
          return (uk.nhs.nhsia.datastandards.ecds.ClinicalDiagnosisAEStructure) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( sr, type, options ); }
        
        public static uk.nhs.nhsia.datastandards.ecds.ClinicalDiagnosisAEStructure parse(org.w3c.dom.Node node) throws org.apache.xmlbeans.XmlException {
          return (uk.nhs.nhsia.datastandards.ecds.ClinicalDiagnosisAEStructure) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( node, type, null ); }
        
        public static uk.nhs.nhsia.datastandards.ecds.ClinicalDiagnosisAEStructure parse(org.w3c.dom.Node node, org.apache.xmlbeans.XmlOptions options) throws org.apache.xmlbeans.XmlException {
          return (uk.nhs.nhsia.datastandards.ecds.ClinicalDiagnosisAEStructure) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( node, type, options ); }
        
        /** @deprecated {@link org.apache.xmlbeans.xml.stream.XMLInputStream} */
        public static uk.nhs.nhsia.datastandards.ecds.ClinicalDiagnosisAEStructure parse(org.apache.xmlbeans.xml.stream.XMLInputStream xis) throws org.apache.xmlbeans.XmlException, org.apache.xmlbeans.xml.stream.XMLStreamException {
          return (uk.nhs.nhsia.datastandards.ecds.ClinicalDiagnosisAEStructure) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( xis, type, null ); }
        
        /** @deprecated {@link org.apache.xmlbeans.xml.stream.XMLInputStream} */
        public static uk.nhs.nhsia.datastandards.ecds.ClinicalDiagnosisAEStructure parse(org.apache.xmlbeans.xml.stream.XMLInputStream xis, org.apache.xmlbeans.XmlOptions options) throws org.apache.xmlbeans.XmlException, org.apache.xmlbeans.xml.stream.XMLStreamException {
          return (uk.nhs.nhsia.datastandards.ecds.ClinicalDiagnosisAEStructure) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( xis, type, options ); }
        
        /** @deprecated {@link org.apache.xmlbeans.xml.stream.XMLInputStream} */
        public static org.apache.xmlbeans.xml.stream.XMLInputStream newValidatingXMLInputStream(org.apache.xmlbeans.xml.stream.XMLInputStream xis) throws org.apache.xmlbeans.XmlException, org.apache.xmlbeans.xml.stream.XMLStreamException {
          return org.apache.xmlbeans.XmlBeans.getContextTypeLoader().newValidatingXMLInputStream( xis, type, null ); }
        
        /** @deprecated {@link org.apache.xmlbeans.xml.stream.XMLInputStream} */
        public static org.apache.xmlbeans.xml.stream.XMLInputStream newValidatingXMLInputStream(org.apache.xmlbeans.xml.stream.XMLInputStream xis, org.apache.xmlbeans.XmlOptions options) throws org.apache.xmlbeans.XmlException, org.apache.xmlbeans.xml.stream.XMLStreamException {
          return org.apache.xmlbeans.XmlBeans.getContextTypeLoader().newValidatingXMLInputStream( xis, type, options ); }
        
        private Factory() { } // No instance of this class allowed
    }
}
