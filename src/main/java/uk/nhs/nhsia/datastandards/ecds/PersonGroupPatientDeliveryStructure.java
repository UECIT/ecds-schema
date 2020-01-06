/*
 * XML Type:  PersonGroupPatient_Delivery_Structure
 * Namespace: http://www.nhsia.nhs.uk/DataStandards/XMLschema/CDS/ns
 * Java type: uk.nhs.nhsia.datastandards.ecds.PersonGroupPatientDeliveryStructure
 *
 * Automatically generated - do not modify.
 */
package uk.nhs.nhsia.datastandards.ecds;


/**
 * An XML PersonGroupPatient_Delivery_Structure(@http://www.nhsia.nhs.uk/DataStandards/XMLschema/CDS/ns).
 *
 * This is a complex type.
 */
public interface PersonGroupPatientDeliveryStructure extends org.apache.xmlbeans.XmlObject
{
    public static final org.apache.xmlbeans.SchemaType type = (org.apache.xmlbeans.SchemaType)
        org.apache.xmlbeans.XmlBeans.typeSystemForClassLoader(PersonGroupPatientDeliveryStructure.class.getClassLoader(), "schemaorg_apache_xmlbeans.system.s30C1180FF47174E0C8A992A2D657328B").resolveHandle("persongrouppatientdeliverystructure4f77type");
    
    /**
     * Gets the "PatientIdentity_Delivery_Structure" element
     */
    uk.nhs.nhsia.datastandards.ecds.PatientIdentityDeliveryStructure getPatientIdentityDeliveryStructure();
    
    /**
     * Sets the "PatientIdentity_Delivery_Structure" element
     */
    void setPatientIdentityDeliveryStructure(uk.nhs.nhsia.datastandards.ecds.PatientIdentityDeliveryStructure patientIdentityDeliveryStructure);
    
    /**
     * Appends and returns a new empty "PatientIdentity_Delivery_Structure" element
     */
    uk.nhs.nhsia.datastandards.ecds.PatientIdentityDeliveryStructure addNewPatientIdentityDeliveryStructure();
    
    /**
     * Gets the "PatientCharacteristics_General_Structure" element
     */
    uk.nhs.nhsia.datastandards.ecds.PatientCharacteristicsGeneralStructure getPatientCharacteristicsGeneralStructure();
    
    /**
     * True if has "PatientCharacteristics_General_Structure" element
     */
    boolean isSetPatientCharacteristicsGeneralStructure();
    
    /**
     * Sets the "PatientCharacteristics_General_Structure" element
     */
    void setPatientCharacteristicsGeneralStructure(uk.nhs.nhsia.datastandards.ecds.PatientCharacteristicsGeneralStructure patientCharacteristicsGeneralStructure);
    
    /**
     * Appends and returns a new empty "PatientCharacteristics_General_Structure" element
     */
    uk.nhs.nhsia.datastandards.ecds.PatientCharacteristicsGeneralStructure addNewPatientCharacteristicsGeneralStructure();
    
    /**
     * Unsets the "PatientCharacteristics_General_Structure" element
     */
    void unsetPatientCharacteristicsGeneralStructure();
    
    /**
     * Gets the "PatientCharacteristics_Delivery_Structure" element
     */
    uk.nhs.nhsia.datastandards.ecds.PatientCharacteristicsDeliveryStructure getPatientCharacteristicsDeliveryStructure();
    
    /**
     * True if has "PatientCharacteristics_Delivery_Structure" element
     */
    boolean isSetPatientCharacteristicsDeliveryStructure();
    
    /**
     * Sets the "PatientCharacteristics_Delivery_Structure" element
     */
    void setPatientCharacteristicsDeliveryStructure(uk.nhs.nhsia.datastandards.ecds.PatientCharacteristicsDeliveryStructure patientCharacteristicsDeliveryStructure);
    
    /**
     * Appends and returns a new empty "PatientCharacteristics_Delivery_Structure" element
     */
    uk.nhs.nhsia.datastandards.ecds.PatientCharacteristicsDeliveryStructure addNewPatientCharacteristicsDeliveryStructure();
    
    /**
     * Unsets the "PatientCharacteristics_Delivery_Structure" element
     */
    void unsetPatientCharacteristicsDeliveryStructure();
    
    /**
     * A factory class with static methods for creating instances
     * of this type.
     */
    
    public static final class Factory
    {
        public static uk.nhs.nhsia.datastandards.ecds.PersonGroupPatientDeliveryStructure newInstance() {
          return (uk.nhs.nhsia.datastandards.ecds.PersonGroupPatientDeliveryStructure) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().newInstance( type, null ); }
        
        public static uk.nhs.nhsia.datastandards.ecds.PersonGroupPatientDeliveryStructure newInstance(org.apache.xmlbeans.XmlOptions options) {
          return (uk.nhs.nhsia.datastandards.ecds.PersonGroupPatientDeliveryStructure) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().newInstance( type, options ); }
        
        /** @param xmlAsString the string value to parse */
        public static uk.nhs.nhsia.datastandards.ecds.PersonGroupPatientDeliveryStructure parse(java.lang.String xmlAsString) throws org.apache.xmlbeans.XmlException {
          return (uk.nhs.nhsia.datastandards.ecds.PersonGroupPatientDeliveryStructure) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( xmlAsString, type, null ); }
        
        public static uk.nhs.nhsia.datastandards.ecds.PersonGroupPatientDeliveryStructure parse(java.lang.String xmlAsString, org.apache.xmlbeans.XmlOptions options) throws org.apache.xmlbeans.XmlException {
          return (uk.nhs.nhsia.datastandards.ecds.PersonGroupPatientDeliveryStructure) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( xmlAsString, type, options ); }
        
        /** @param file the file from which to load an xml document */
        public static uk.nhs.nhsia.datastandards.ecds.PersonGroupPatientDeliveryStructure parse(java.io.File file) throws org.apache.xmlbeans.XmlException, java.io.IOException {
          return (uk.nhs.nhsia.datastandards.ecds.PersonGroupPatientDeliveryStructure) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( file, type, null ); }
        
        public static uk.nhs.nhsia.datastandards.ecds.PersonGroupPatientDeliveryStructure parse(java.io.File file, org.apache.xmlbeans.XmlOptions options) throws org.apache.xmlbeans.XmlException, java.io.IOException {
          return (uk.nhs.nhsia.datastandards.ecds.PersonGroupPatientDeliveryStructure) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( file, type, options ); }
        
        public static uk.nhs.nhsia.datastandards.ecds.PersonGroupPatientDeliveryStructure parse(java.net.URL u) throws org.apache.xmlbeans.XmlException, java.io.IOException {
          return (uk.nhs.nhsia.datastandards.ecds.PersonGroupPatientDeliveryStructure) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( u, type, null ); }
        
        public static uk.nhs.nhsia.datastandards.ecds.PersonGroupPatientDeliveryStructure parse(java.net.URL u, org.apache.xmlbeans.XmlOptions options) throws org.apache.xmlbeans.XmlException, java.io.IOException {
          return (uk.nhs.nhsia.datastandards.ecds.PersonGroupPatientDeliveryStructure) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( u, type, options ); }
        
        public static uk.nhs.nhsia.datastandards.ecds.PersonGroupPatientDeliveryStructure parse(java.io.InputStream is) throws org.apache.xmlbeans.XmlException, java.io.IOException {
          return (uk.nhs.nhsia.datastandards.ecds.PersonGroupPatientDeliveryStructure) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( is, type, null ); }
        
        public static uk.nhs.nhsia.datastandards.ecds.PersonGroupPatientDeliveryStructure parse(java.io.InputStream is, org.apache.xmlbeans.XmlOptions options) throws org.apache.xmlbeans.XmlException, java.io.IOException {
          return (uk.nhs.nhsia.datastandards.ecds.PersonGroupPatientDeliveryStructure) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( is, type, options ); }
        
        public static uk.nhs.nhsia.datastandards.ecds.PersonGroupPatientDeliveryStructure parse(java.io.Reader r) throws org.apache.xmlbeans.XmlException, java.io.IOException {
          return (uk.nhs.nhsia.datastandards.ecds.PersonGroupPatientDeliveryStructure) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( r, type, null ); }
        
        public static uk.nhs.nhsia.datastandards.ecds.PersonGroupPatientDeliveryStructure parse(java.io.Reader r, org.apache.xmlbeans.XmlOptions options) throws org.apache.xmlbeans.XmlException, java.io.IOException {
          return (uk.nhs.nhsia.datastandards.ecds.PersonGroupPatientDeliveryStructure) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( r, type, options ); }
        
        public static uk.nhs.nhsia.datastandards.ecds.PersonGroupPatientDeliveryStructure parse(javax.xml.stream.XMLStreamReader sr) throws org.apache.xmlbeans.XmlException {
          return (uk.nhs.nhsia.datastandards.ecds.PersonGroupPatientDeliveryStructure) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( sr, type, null ); }
        
        public static uk.nhs.nhsia.datastandards.ecds.PersonGroupPatientDeliveryStructure parse(javax.xml.stream.XMLStreamReader sr, org.apache.xmlbeans.XmlOptions options) throws org.apache.xmlbeans.XmlException {
          return (uk.nhs.nhsia.datastandards.ecds.PersonGroupPatientDeliveryStructure) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( sr, type, options ); }
        
        public static uk.nhs.nhsia.datastandards.ecds.PersonGroupPatientDeliveryStructure parse(org.w3c.dom.Node node) throws org.apache.xmlbeans.XmlException {
          return (uk.nhs.nhsia.datastandards.ecds.PersonGroupPatientDeliveryStructure) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( node, type, null ); }
        
        public static uk.nhs.nhsia.datastandards.ecds.PersonGroupPatientDeliveryStructure parse(org.w3c.dom.Node node, org.apache.xmlbeans.XmlOptions options) throws org.apache.xmlbeans.XmlException {
          return (uk.nhs.nhsia.datastandards.ecds.PersonGroupPatientDeliveryStructure) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( node, type, options ); }
        
        /** @deprecated {@link org.apache.xmlbeans.xml.stream.XMLInputStream} */
        public static uk.nhs.nhsia.datastandards.ecds.PersonGroupPatientDeliveryStructure parse(org.apache.xmlbeans.xml.stream.XMLInputStream xis) throws org.apache.xmlbeans.XmlException, org.apache.xmlbeans.xml.stream.XMLStreamException {
          return (uk.nhs.nhsia.datastandards.ecds.PersonGroupPatientDeliveryStructure) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( xis, type, null ); }
        
        /** @deprecated {@link org.apache.xmlbeans.xml.stream.XMLInputStream} */
        public static uk.nhs.nhsia.datastandards.ecds.PersonGroupPatientDeliveryStructure parse(org.apache.xmlbeans.xml.stream.XMLInputStream xis, org.apache.xmlbeans.XmlOptions options) throws org.apache.xmlbeans.XmlException, org.apache.xmlbeans.xml.stream.XMLStreamException {
          return (uk.nhs.nhsia.datastandards.ecds.PersonGroupPatientDeliveryStructure) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( xis, type, options ); }
        
        /** @deprecated {@link org.apache.xmlbeans.xml.stream.XMLInputStream} */
        public static org.apache.xmlbeans.xml.stream.XMLInputStream newValidatingXMLInputStream(org.apache.xmlbeans.xml.stream.XMLInputStream xis) throws org.apache.xmlbeans.XmlException, org.apache.xmlbeans.xml.stream.XMLStreamException {
          return org.apache.xmlbeans.XmlBeans.getContextTypeLoader().newValidatingXMLInputStream( xis, type, null ); }
        
        /** @deprecated {@link org.apache.xmlbeans.xml.stream.XMLInputStream} */
        public static org.apache.xmlbeans.xml.stream.XMLInputStream newValidatingXMLInputStream(org.apache.xmlbeans.xml.stream.XMLInputStream xis, org.apache.xmlbeans.XmlOptions options) throws org.apache.xmlbeans.XmlException, org.apache.xmlbeans.xml.stream.XMLStreamException {
          return org.apache.xmlbeans.XmlBeans.getContextTypeLoader().newValidatingXMLInputStream( xis, type, options ); }
        
        private Factory() { } // No instance of this class allowed
    }
}
