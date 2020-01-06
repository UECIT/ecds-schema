/*
 * XML Type:  PersonGroupConsultant_Structure
 * Namespace: http://www.nhsia.nhs.uk/DataStandards/XMLschema/CDS/ns
 * Java type: uk.nhs.nhsia.datastandards.ecds.PersonGroupConsultantStructure
 *
 * Automatically generated - do not modify.
 */
package uk.nhs.nhsia.datastandards.ecds;


/**
 * An XML PersonGroupConsultant_Structure(@http://www.nhsia.nhs.uk/DataStandards/XMLschema/CDS/ns).
 *
 * This is a complex type.
 */
public interface PersonGroupConsultantStructure extends org.apache.xmlbeans.XmlObject
{
    public static final org.apache.xmlbeans.SchemaType type = (org.apache.xmlbeans.SchemaType)
        org.apache.xmlbeans.XmlBeans.typeSystemForClassLoader(PersonGroupConsultantStructure.class.getClassLoader(), "schemaorg_apache_xmlbeans.system.s30C1180FF47174E0C8A992A2D657328B").resolveHandle("persongroupconsultantstructurea5eatype");
    
    /**
     * Gets the "ConsultantCode" element
     */
    java.lang.String getConsultantCode();
    
    /**
     * Gets (as xml) the "ConsultantCode" element
     */
    uk.nhs.nhsia.datastandards.ecds.ConsultantCodeType xgetConsultantCode();
    
    /**
     * True if has "ConsultantCode" element
     */
    boolean isSetConsultantCode();
    
    /**
     * Sets the "ConsultantCode" element
     */
    void setConsultantCode(java.lang.String consultantCode);
    
    /**
     * Sets (as xml) the "ConsultantCode" element
     */
    void xsetConsultantCode(uk.nhs.nhsia.datastandards.ecds.ConsultantCodeType consultantCode);
    
    /**
     * Unsets the "ConsultantCode" element
     */
    void unsetConsultantCode();
    
    /**
     * Gets the "CareProfessionalMainSpecialtyCode" element
     */
    uk.nhs.nhsia.datastandards.ecds.CareProfessionalMainSpecialtyCodeType.Enum getCareProfessionalMainSpecialtyCode();
    
    /**
     * Gets (as xml) the "CareProfessionalMainSpecialtyCode" element
     */
    uk.nhs.nhsia.datastandards.ecds.CareProfessionalMainSpecialtyCodeType xgetCareProfessionalMainSpecialtyCode();
    
    /**
     * True if has "CareProfessionalMainSpecialtyCode" element
     */
    boolean isSetCareProfessionalMainSpecialtyCode();
    
    /**
     * Sets the "CareProfessionalMainSpecialtyCode" element
     */
    void setCareProfessionalMainSpecialtyCode(uk.nhs.nhsia.datastandards.ecds.CareProfessionalMainSpecialtyCodeType.Enum careProfessionalMainSpecialtyCode);
    
    /**
     * Sets (as xml) the "CareProfessionalMainSpecialtyCode" element
     */
    void xsetCareProfessionalMainSpecialtyCode(uk.nhs.nhsia.datastandards.ecds.CareProfessionalMainSpecialtyCodeType careProfessionalMainSpecialtyCode);
    
    /**
     * Unsets the "CareProfessionalMainSpecialtyCode" element
     */
    void unsetCareProfessionalMainSpecialtyCode();
    
    /**
     * Gets the "ActivityTreatmentFunctionCode" element
     */
    uk.nhs.nhsia.datastandards.ecds.ActivityTreatmentFunctionCodeType.Enum getActivityTreatmentFunctionCode();
    
    /**
     * Gets (as xml) the "ActivityTreatmentFunctionCode" element
     */
    uk.nhs.nhsia.datastandards.ecds.ActivityTreatmentFunctionCodeType xgetActivityTreatmentFunctionCode();
    
    /**
     * True if has "ActivityTreatmentFunctionCode" element
     */
    boolean isSetActivityTreatmentFunctionCode();
    
    /**
     * Sets the "ActivityTreatmentFunctionCode" element
     */
    void setActivityTreatmentFunctionCode(uk.nhs.nhsia.datastandards.ecds.ActivityTreatmentFunctionCodeType.Enum activityTreatmentFunctionCode);
    
    /**
     * Sets (as xml) the "ActivityTreatmentFunctionCode" element
     */
    void xsetActivityTreatmentFunctionCode(uk.nhs.nhsia.datastandards.ecds.ActivityTreatmentFunctionCodeType activityTreatmentFunctionCode);
    
    /**
     * Unsets the "ActivityTreatmentFunctionCode" element
     */
    void unsetActivityTreatmentFunctionCode();
    
    /**
     * Gets the "LocalSubSpecialtyCode" element
     */
    java.lang.String getLocalSubSpecialtyCode();
    
    /**
     * Gets (as xml) the "LocalSubSpecialtyCode" element
     */
    uk.nhs.nhsia.datastandards.ecds.LocalSubSpecialtyCodeType xgetLocalSubSpecialtyCode();
    
    /**
     * True if has "LocalSubSpecialtyCode" element
     */
    boolean isSetLocalSubSpecialtyCode();
    
    /**
     * Sets the "LocalSubSpecialtyCode" element
     */
    void setLocalSubSpecialtyCode(java.lang.String localSubSpecialtyCode);
    
    /**
     * Sets (as xml) the "LocalSubSpecialtyCode" element
     */
    void xsetLocalSubSpecialtyCode(uk.nhs.nhsia.datastandards.ecds.LocalSubSpecialtyCodeType localSubSpecialtyCode);
    
    /**
     * Unsets the "LocalSubSpecialtyCode" element
     */
    void unsetLocalSubSpecialtyCode();
    
    /**
     * A factory class with static methods for creating instances
     * of this type.
     */
    
    public static final class Factory
    {
        public static uk.nhs.nhsia.datastandards.ecds.PersonGroupConsultantStructure newInstance() {
          return (uk.nhs.nhsia.datastandards.ecds.PersonGroupConsultantStructure) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().newInstance( type, null ); }
        
        public static uk.nhs.nhsia.datastandards.ecds.PersonGroupConsultantStructure newInstance(org.apache.xmlbeans.XmlOptions options) {
          return (uk.nhs.nhsia.datastandards.ecds.PersonGroupConsultantStructure) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().newInstance( type, options ); }
        
        /** @param xmlAsString the string value to parse */
        public static uk.nhs.nhsia.datastandards.ecds.PersonGroupConsultantStructure parse(java.lang.String xmlAsString) throws org.apache.xmlbeans.XmlException {
          return (uk.nhs.nhsia.datastandards.ecds.PersonGroupConsultantStructure) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( xmlAsString, type, null ); }
        
        public static uk.nhs.nhsia.datastandards.ecds.PersonGroupConsultantStructure parse(java.lang.String xmlAsString, org.apache.xmlbeans.XmlOptions options) throws org.apache.xmlbeans.XmlException {
          return (uk.nhs.nhsia.datastandards.ecds.PersonGroupConsultantStructure) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( xmlAsString, type, options ); }
        
        /** @param file the file from which to load an xml document */
        public static uk.nhs.nhsia.datastandards.ecds.PersonGroupConsultantStructure parse(java.io.File file) throws org.apache.xmlbeans.XmlException, java.io.IOException {
          return (uk.nhs.nhsia.datastandards.ecds.PersonGroupConsultantStructure) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( file, type, null ); }
        
        public static uk.nhs.nhsia.datastandards.ecds.PersonGroupConsultantStructure parse(java.io.File file, org.apache.xmlbeans.XmlOptions options) throws org.apache.xmlbeans.XmlException, java.io.IOException {
          return (uk.nhs.nhsia.datastandards.ecds.PersonGroupConsultantStructure) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( file, type, options ); }
        
        public static uk.nhs.nhsia.datastandards.ecds.PersonGroupConsultantStructure parse(java.net.URL u) throws org.apache.xmlbeans.XmlException, java.io.IOException {
          return (uk.nhs.nhsia.datastandards.ecds.PersonGroupConsultantStructure) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( u, type, null ); }
        
        public static uk.nhs.nhsia.datastandards.ecds.PersonGroupConsultantStructure parse(java.net.URL u, org.apache.xmlbeans.XmlOptions options) throws org.apache.xmlbeans.XmlException, java.io.IOException {
          return (uk.nhs.nhsia.datastandards.ecds.PersonGroupConsultantStructure) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( u, type, options ); }
        
        public static uk.nhs.nhsia.datastandards.ecds.PersonGroupConsultantStructure parse(java.io.InputStream is) throws org.apache.xmlbeans.XmlException, java.io.IOException {
          return (uk.nhs.nhsia.datastandards.ecds.PersonGroupConsultantStructure) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( is, type, null ); }
        
        public static uk.nhs.nhsia.datastandards.ecds.PersonGroupConsultantStructure parse(java.io.InputStream is, org.apache.xmlbeans.XmlOptions options) throws org.apache.xmlbeans.XmlException, java.io.IOException {
          return (uk.nhs.nhsia.datastandards.ecds.PersonGroupConsultantStructure) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( is, type, options ); }
        
        public static uk.nhs.nhsia.datastandards.ecds.PersonGroupConsultantStructure parse(java.io.Reader r) throws org.apache.xmlbeans.XmlException, java.io.IOException {
          return (uk.nhs.nhsia.datastandards.ecds.PersonGroupConsultantStructure) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( r, type, null ); }
        
        public static uk.nhs.nhsia.datastandards.ecds.PersonGroupConsultantStructure parse(java.io.Reader r, org.apache.xmlbeans.XmlOptions options) throws org.apache.xmlbeans.XmlException, java.io.IOException {
          return (uk.nhs.nhsia.datastandards.ecds.PersonGroupConsultantStructure) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( r, type, options ); }
        
        public static uk.nhs.nhsia.datastandards.ecds.PersonGroupConsultantStructure parse(javax.xml.stream.XMLStreamReader sr) throws org.apache.xmlbeans.XmlException {
          return (uk.nhs.nhsia.datastandards.ecds.PersonGroupConsultantStructure) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( sr, type, null ); }
        
        public static uk.nhs.nhsia.datastandards.ecds.PersonGroupConsultantStructure parse(javax.xml.stream.XMLStreamReader sr, org.apache.xmlbeans.XmlOptions options) throws org.apache.xmlbeans.XmlException {
          return (uk.nhs.nhsia.datastandards.ecds.PersonGroupConsultantStructure) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( sr, type, options ); }
        
        public static uk.nhs.nhsia.datastandards.ecds.PersonGroupConsultantStructure parse(org.w3c.dom.Node node) throws org.apache.xmlbeans.XmlException {
          return (uk.nhs.nhsia.datastandards.ecds.PersonGroupConsultantStructure) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( node, type, null ); }
        
        public static uk.nhs.nhsia.datastandards.ecds.PersonGroupConsultantStructure parse(org.w3c.dom.Node node, org.apache.xmlbeans.XmlOptions options) throws org.apache.xmlbeans.XmlException {
          return (uk.nhs.nhsia.datastandards.ecds.PersonGroupConsultantStructure) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( node, type, options ); }
        
        /** @deprecated {@link org.apache.xmlbeans.xml.stream.XMLInputStream} */
        public static uk.nhs.nhsia.datastandards.ecds.PersonGroupConsultantStructure parse(org.apache.xmlbeans.xml.stream.XMLInputStream xis) throws org.apache.xmlbeans.XmlException, org.apache.xmlbeans.xml.stream.XMLStreamException {
          return (uk.nhs.nhsia.datastandards.ecds.PersonGroupConsultantStructure) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( xis, type, null ); }
        
        /** @deprecated {@link org.apache.xmlbeans.xml.stream.XMLInputStream} */
        public static uk.nhs.nhsia.datastandards.ecds.PersonGroupConsultantStructure parse(org.apache.xmlbeans.xml.stream.XMLInputStream xis, org.apache.xmlbeans.XmlOptions options) throws org.apache.xmlbeans.XmlException, org.apache.xmlbeans.xml.stream.XMLStreamException {
          return (uk.nhs.nhsia.datastandards.ecds.PersonGroupConsultantStructure) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( xis, type, options ); }
        
        /** @deprecated {@link org.apache.xmlbeans.xml.stream.XMLInputStream} */
        public static org.apache.xmlbeans.xml.stream.XMLInputStream newValidatingXMLInputStream(org.apache.xmlbeans.xml.stream.XMLInputStream xis) throws org.apache.xmlbeans.XmlException, org.apache.xmlbeans.xml.stream.XMLStreamException {
          return org.apache.xmlbeans.XmlBeans.getContextTypeLoader().newValidatingXMLInputStream( xis, type, null ); }
        
        /** @deprecated {@link org.apache.xmlbeans.xml.stream.XMLInputStream} */
        public static org.apache.xmlbeans.xml.stream.XMLInputStream newValidatingXMLInputStream(org.apache.xmlbeans.xml.stream.XMLInputStream xis, org.apache.xmlbeans.XmlOptions options) throws org.apache.xmlbeans.XmlException, org.apache.xmlbeans.xml.stream.XMLStreamException {
          return org.apache.xmlbeans.XmlBeans.getContextTypeLoader().newValidatingXMLInputStream( xis, type, options ); }
        
        private Factory() { } // No instance of this class allowed
    }
}
