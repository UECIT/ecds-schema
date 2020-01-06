/*
 * XML Type:  ClinicalActivity_AE_Structure
 * Namespace: http://www.nhsia.nhs.uk/DataStandards/XMLschema/CDS/ns
 * Java type: uk.nhs.nhsia.datastandards.ecds.ClinicalActivityAEStructure
 *
 * Automatically generated - do not modify.
 */
package uk.nhs.nhsia.datastandards.ecds;


/**
 * An XML ClinicalActivity_AE_Structure(@http://www.nhsia.nhs.uk/DataStandards/XMLschema/CDS/ns).
 *
 * This is a complex type.
 */
public interface ClinicalActivityAEStructure extends org.apache.xmlbeans.XmlObject
{
    public static final org.apache.xmlbeans.SchemaType type = (org.apache.xmlbeans.SchemaType)
        org.apache.xmlbeans.XmlBeans.typeSystemForClassLoader(ClinicalActivityAEStructure.class.getClassLoader(), "schemaorg_apache_xmlbeans.system.s30C1180FF47174E0C8A992A2D657328B").resolveHandle("clinicalactivityaestructurebfaetype");
    
    /**
     * Gets the "ClinicalActivityGroupOPCS" element
     */
    uk.nhs.nhsia.datastandards.ecds.ClinicalActivityGroupOPCSType getClinicalActivityGroupOPCS();
    
    /**
     * True if has "ClinicalActivityGroupOPCS" element
     */
    boolean isSetClinicalActivityGroupOPCS();
    
    /**
     * Sets the "ClinicalActivityGroupOPCS" element
     */
    void setClinicalActivityGroupOPCS(uk.nhs.nhsia.datastandards.ecds.ClinicalActivityGroupOPCSType clinicalActivityGroupOPCS);
    
    /**
     * Appends and returns a new empty "ClinicalActivityGroupOPCS" element
     */
    uk.nhs.nhsia.datastandards.ecds.ClinicalActivityGroupOPCSType addNewClinicalActivityGroupOPCS();
    
    /**
     * Unsets the "ClinicalActivityGroupOPCS" element
     */
    void unsetClinicalActivityGroupOPCS();
    
    /**
     * Gets the "ClinicalActivityGroupREAD" element
     */
    uk.nhs.nhsia.datastandards.ecds.ClinicalActivityGroupREADType getClinicalActivityGroupREAD();
    
    /**
     * True if has "ClinicalActivityGroupREAD" element
     */
    boolean isSetClinicalActivityGroupREAD();
    
    /**
     * Sets the "ClinicalActivityGroupREAD" element
     */
    void setClinicalActivityGroupREAD(uk.nhs.nhsia.datastandards.ecds.ClinicalActivityGroupREADType clinicalActivityGroupREAD);
    
    /**
     * Appends and returns a new empty "ClinicalActivityGroupREAD" element
     */
    uk.nhs.nhsia.datastandards.ecds.ClinicalActivityGroupREADType addNewClinicalActivityGroupREAD();
    
    /**
     * Unsets the "ClinicalActivityGroupREAD" element
     */
    void unsetClinicalActivityGroupREAD();
    
    /**
     * Gets the "ClinicalTreatmentGroupAandE" element
     */
    uk.nhs.nhsia.datastandards.ecds.ClinicalTreatmentGroupAAndEType getClinicalTreatmentGroupAandE();
    
    /**
     * True if has "ClinicalTreatmentGroupAandE" element
     */
    boolean isSetClinicalTreatmentGroupAandE();
    
    /**
     * Sets the "ClinicalTreatmentGroupAandE" element
     */
    void setClinicalTreatmentGroupAandE(uk.nhs.nhsia.datastandards.ecds.ClinicalTreatmentGroupAAndEType clinicalTreatmentGroupAandE);
    
    /**
     * Appends and returns a new empty "ClinicalTreatmentGroupAandE" element
     */
    uk.nhs.nhsia.datastandards.ecds.ClinicalTreatmentGroupAAndEType addNewClinicalTreatmentGroupAandE();
    
    /**
     * Unsets the "ClinicalTreatmentGroupAandE" element
     */
    void unsetClinicalTreatmentGroupAandE();
    
    /**
     * A factory class with static methods for creating instances
     * of this type.
     */
    
    public static final class Factory
    {
        public static uk.nhs.nhsia.datastandards.ecds.ClinicalActivityAEStructure newInstance() {
          return (uk.nhs.nhsia.datastandards.ecds.ClinicalActivityAEStructure) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().newInstance( type, null ); }
        
        public static uk.nhs.nhsia.datastandards.ecds.ClinicalActivityAEStructure newInstance(org.apache.xmlbeans.XmlOptions options) {
          return (uk.nhs.nhsia.datastandards.ecds.ClinicalActivityAEStructure) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().newInstance( type, options ); }
        
        /** @param xmlAsString the string value to parse */
        public static uk.nhs.nhsia.datastandards.ecds.ClinicalActivityAEStructure parse(java.lang.String xmlAsString) throws org.apache.xmlbeans.XmlException {
          return (uk.nhs.nhsia.datastandards.ecds.ClinicalActivityAEStructure) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( xmlAsString, type, null ); }
        
        public static uk.nhs.nhsia.datastandards.ecds.ClinicalActivityAEStructure parse(java.lang.String xmlAsString, org.apache.xmlbeans.XmlOptions options) throws org.apache.xmlbeans.XmlException {
          return (uk.nhs.nhsia.datastandards.ecds.ClinicalActivityAEStructure) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( xmlAsString, type, options ); }
        
        /** @param file the file from which to load an xml document */
        public static uk.nhs.nhsia.datastandards.ecds.ClinicalActivityAEStructure parse(java.io.File file) throws org.apache.xmlbeans.XmlException, java.io.IOException {
          return (uk.nhs.nhsia.datastandards.ecds.ClinicalActivityAEStructure) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( file, type, null ); }
        
        public static uk.nhs.nhsia.datastandards.ecds.ClinicalActivityAEStructure parse(java.io.File file, org.apache.xmlbeans.XmlOptions options) throws org.apache.xmlbeans.XmlException, java.io.IOException {
          return (uk.nhs.nhsia.datastandards.ecds.ClinicalActivityAEStructure) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( file, type, options ); }
        
        public static uk.nhs.nhsia.datastandards.ecds.ClinicalActivityAEStructure parse(java.net.URL u) throws org.apache.xmlbeans.XmlException, java.io.IOException {
          return (uk.nhs.nhsia.datastandards.ecds.ClinicalActivityAEStructure) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( u, type, null ); }
        
        public static uk.nhs.nhsia.datastandards.ecds.ClinicalActivityAEStructure parse(java.net.URL u, org.apache.xmlbeans.XmlOptions options) throws org.apache.xmlbeans.XmlException, java.io.IOException {
          return (uk.nhs.nhsia.datastandards.ecds.ClinicalActivityAEStructure) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( u, type, options ); }
        
        public static uk.nhs.nhsia.datastandards.ecds.ClinicalActivityAEStructure parse(java.io.InputStream is) throws org.apache.xmlbeans.XmlException, java.io.IOException {
          return (uk.nhs.nhsia.datastandards.ecds.ClinicalActivityAEStructure) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( is, type, null ); }
        
        public static uk.nhs.nhsia.datastandards.ecds.ClinicalActivityAEStructure parse(java.io.InputStream is, org.apache.xmlbeans.XmlOptions options) throws org.apache.xmlbeans.XmlException, java.io.IOException {
          return (uk.nhs.nhsia.datastandards.ecds.ClinicalActivityAEStructure) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( is, type, options ); }
        
        public static uk.nhs.nhsia.datastandards.ecds.ClinicalActivityAEStructure parse(java.io.Reader r) throws org.apache.xmlbeans.XmlException, java.io.IOException {
          return (uk.nhs.nhsia.datastandards.ecds.ClinicalActivityAEStructure) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( r, type, null ); }
        
        public static uk.nhs.nhsia.datastandards.ecds.ClinicalActivityAEStructure parse(java.io.Reader r, org.apache.xmlbeans.XmlOptions options) throws org.apache.xmlbeans.XmlException, java.io.IOException {
          return (uk.nhs.nhsia.datastandards.ecds.ClinicalActivityAEStructure) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( r, type, options ); }
        
        public static uk.nhs.nhsia.datastandards.ecds.ClinicalActivityAEStructure parse(javax.xml.stream.XMLStreamReader sr) throws org.apache.xmlbeans.XmlException {
          return (uk.nhs.nhsia.datastandards.ecds.ClinicalActivityAEStructure) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( sr, type, null ); }
        
        public static uk.nhs.nhsia.datastandards.ecds.ClinicalActivityAEStructure parse(javax.xml.stream.XMLStreamReader sr, org.apache.xmlbeans.XmlOptions options) throws org.apache.xmlbeans.XmlException {
          return (uk.nhs.nhsia.datastandards.ecds.ClinicalActivityAEStructure) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( sr, type, options ); }
        
        public static uk.nhs.nhsia.datastandards.ecds.ClinicalActivityAEStructure parse(org.w3c.dom.Node node) throws org.apache.xmlbeans.XmlException {
          return (uk.nhs.nhsia.datastandards.ecds.ClinicalActivityAEStructure) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( node, type, null ); }
        
        public static uk.nhs.nhsia.datastandards.ecds.ClinicalActivityAEStructure parse(org.w3c.dom.Node node, org.apache.xmlbeans.XmlOptions options) throws org.apache.xmlbeans.XmlException {
          return (uk.nhs.nhsia.datastandards.ecds.ClinicalActivityAEStructure) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( node, type, options ); }
        
        /** @deprecated {@link org.apache.xmlbeans.xml.stream.XMLInputStream} */
        public static uk.nhs.nhsia.datastandards.ecds.ClinicalActivityAEStructure parse(org.apache.xmlbeans.xml.stream.XMLInputStream xis) throws org.apache.xmlbeans.XmlException, org.apache.xmlbeans.xml.stream.XMLStreamException {
          return (uk.nhs.nhsia.datastandards.ecds.ClinicalActivityAEStructure) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( xis, type, null ); }
        
        /** @deprecated {@link org.apache.xmlbeans.xml.stream.XMLInputStream} */
        public static uk.nhs.nhsia.datastandards.ecds.ClinicalActivityAEStructure parse(org.apache.xmlbeans.xml.stream.XMLInputStream xis, org.apache.xmlbeans.XmlOptions options) throws org.apache.xmlbeans.XmlException, org.apache.xmlbeans.xml.stream.XMLStreamException {
          return (uk.nhs.nhsia.datastandards.ecds.ClinicalActivityAEStructure) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( xis, type, options ); }
        
        /** @deprecated {@link org.apache.xmlbeans.xml.stream.XMLInputStream} */
        public static org.apache.xmlbeans.xml.stream.XMLInputStream newValidatingXMLInputStream(org.apache.xmlbeans.xml.stream.XMLInputStream xis) throws org.apache.xmlbeans.XmlException, org.apache.xmlbeans.xml.stream.XMLStreamException {
          return org.apache.xmlbeans.XmlBeans.getContextTypeLoader().newValidatingXMLInputStream( xis, type, null ); }
        
        /** @deprecated {@link org.apache.xmlbeans.xml.stream.XMLInputStream} */
        public static org.apache.xmlbeans.xml.stream.XMLInputStream newValidatingXMLInputStream(org.apache.xmlbeans.xml.stream.XMLInputStream xis, org.apache.xmlbeans.XmlOptions options) throws org.apache.xmlbeans.XmlException, org.apache.xmlbeans.xml.stream.XMLStreamException {
          return org.apache.xmlbeans.XmlBeans.getContextTypeLoader().newValidatingXMLInputStream( xis, type, options ); }
        
        private Factory() { } // No instance of this class allowed
    }
}
