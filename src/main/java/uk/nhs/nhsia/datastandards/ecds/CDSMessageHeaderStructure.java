/*
 * XML Type:  CDSMessageHeader_Structure
 * Namespace: http://www.nhsia.nhs.uk/DataStandards/XMLschema/CDS/ns
 * Java type: uk.nhs.nhsia.datastandards.ecds.CDSMessageHeaderStructure
 *
 * Automatically generated - do not modify.
 */
package uk.nhs.nhsia.datastandards.ecds;


/**
 * An XML CDSMessageHeader_Structure(@http://www.nhsia.nhs.uk/DataStandards/XMLschema/CDS/ns).
 *
 * This is a complex type.
 */
public interface CDSMessageHeaderStructure extends org.apache.xmlbeans.XmlObject
{
    public static final org.apache.xmlbeans.SchemaType type = (org.apache.xmlbeans.SchemaType)
        org.apache.xmlbeans.XmlBeans.typeSystemForClassLoader(CDSMessageHeaderStructure.class.getClassLoader(), "schemaorg_apache_xmlbeans.system.s30C1180FF47174E0C8A992A2D657328B").resolveHandle("cdsmessageheaderstructure903btype");
    
    /**
     * Gets the "CDSMessageType" element
     */
    uk.nhs.nhsia.datastandards.ecds.CDSMessageTypeType.Enum getCDSMessageType();
    
    /**
     * Gets (as xml) the "CDSMessageType" element
     */
    uk.nhs.nhsia.datastandards.ecds.CDSMessageTypeType xgetCDSMessageType();
    
    /**
     * Sets the "CDSMessageType" element
     */
    void setCDSMessageType(uk.nhs.nhsia.datastandards.ecds.CDSMessageTypeType.Enum cdsMessageType);
    
    /**
     * Sets (as xml) the "CDSMessageType" element
     */
    void xsetCDSMessageType(uk.nhs.nhsia.datastandards.ecds.CDSMessageTypeType cdsMessageType);
    
    /**
     * Gets the "CDSMessageVersionNumber" element
     */
    uk.nhs.nhsia.datastandards.ecds.CDSMessageVersionNumberType.Enum getCDSMessageVersionNumber();
    
    /**
     * Gets (as xml) the "CDSMessageVersionNumber" element
     */
    uk.nhs.nhsia.datastandards.ecds.CDSMessageVersionNumberType xgetCDSMessageVersionNumber();
    
    /**
     * Sets the "CDSMessageVersionNumber" element
     */
    void setCDSMessageVersionNumber(uk.nhs.nhsia.datastandards.ecds.CDSMessageVersionNumberType.Enum cdsMessageVersionNumber);
    
    /**
     * Sets (as xml) the "CDSMessageVersionNumber" element
     */
    void xsetCDSMessageVersionNumber(uk.nhs.nhsia.datastandards.ecds.CDSMessageVersionNumberType cdsMessageVersionNumber);
    
    /**
     * Gets the "CDSMessageReferenceNumber" element
     */
    long getCDSMessageReferenceNumber();
    
    /**
     * Gets (as xml) the "CDSMessageReferenceNumber" element
     */
    uk.nhs.nhsia.datastandards.ecds.CDSMessageReferenceNumberType xgetCDSMessageReferenceNumber();
    
    /**
     * Sets the "CDSMessageReferenceNumber" element
     */
    void setCDSMessageReferenceNumber(long cdsMessageReferenceNumber);
    
    /**
     * Sets (as xml) the "CDSMessageReferenceNumber" element
     */
    void xsetCDSMessageReferenceNumber(uk.nhs.nhsia.datastandards.ecds.CDSMessageReferenceNumberType cdsMessageReferenceNumber);
    
    /**
     * Gets the "CDSMessageRecordIdentifier" element
     */
    java.lang.String getCDSMessageRecordIdentifier();
    
    /**
     * Gets (as xml) the "CDSMessageRecordIdentifier" element
     */
    uk.nhs.nhsia.datastandards.ecds.CDSMessageRecordIdentifierType xgetCDSMessageRecordIdentifier();
    
    /**
     * True if has "CDSMessageRecordIdentifier" element
     */
    boolean isSetCDSMessageRecordIdentifier();
    
    /**
     * Sets the "CDSMessageRecordIdentifier" element
     */
    void setCDSMessageRecordIdentifier(java.lang.String cdsMessageRecordIdentifier);
    
    /**
     * Sets (as xml) the "CDSMessageRecordIdentifier" element
     */
    void xsetCDSMessageRecordIdentifier(uk.nhs.nhsia.datastandards.ecds.CDSMessageRecordIdentifierType cdsMessageRecordIdentifier);
    
    /**
     * Unsets the "CDSMessageRecordIdentifier" element
     */
    void unsetCDSMessageRecordIdentifier();
    
    /**
     * A factory class with static methods for creating instances
     * of this type.
     */
    
    public static final class Factory
    {
        public static uk.nhs.nhsia.datastandards.ecds.CDSMessageHeaderStructure newInstance() {
          return (uk.nhs.nhsia.datastandards.ecds.CDSMessageHeaderStructure) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().newInstance( type, null ); }
        
        public static uk.nhs.nhsia.datastandards.ecds.CDSMessageHeaderStructure newInstance(org.apache.xmlbeans.XmlOptions options) {
          return (uk.nhs.nhsia.datastandards.ecds.CDSMessageHeaderStructure) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().newInstance( type, options ); }
        
        /** @param xmlAsString the string value to parse */
        public static uk.nhs.nhsia.datastandards.ecds.CDSMessageHeaderStructure parse(java.lang.String xmlAsString) throws org.apache.xmlbeans.XmlException {
          return (uk.nhs.nhsia.datastandards.ecds.CDSMessageHeaderStructure) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( xmlAsString, type, null ); }
        
        public static uk.nhs.nhsia.datastandards.ecds.CDSMessageHeaderStructure parse(java.lang.String xmlAsString, org.apache.xmlbeans.XmlOptions options) throws org.apache.xmlbeans.XmlException {
          return (uk.nhs.nhsia.datastandards.ecds.CDSMessageHeaderStructure) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( xmlAsString, type, options ); }
        
        /** @param file the file from which to load an xml document */
        public static uk.nhs.nhsia.datastandards.ecds.CDSMessageHeaderStructure parse(java.io.File file) throws org.apache.xmlbeans.XmlException, java.io.IOException {
          return (uk.nhs.nhsia.datastandards.ecds.CDSMessageHeaderStructure) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( file, type, null ); }
        
        public static uk.nhs.nhsia.datastandards.ecds.CDSMessageHeaderStructure parse(java.io.File file, org.apache.xmlbeans.XmlOptions options) throws org.apache.xmlbeans.XmlException, java.io.IOException {
          return (uk.nhs.nhsia.datastandards.ecds.CDSMessageHeaderStructure) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( file, type, options ); }
        
        public static uk.nhs.nhsia.datastandards.ecds.CDSMessageHeaderStructure parse(java.net.URL u) throws org.apache.xmlbeans.XmlException, java.io.IOException {
          return (uk.nhs.nhsia.datastandards.ecds.CDSMessageHeaderStructure) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( u, type, null ); }
        
        public static uk.nhs.nhsia.datastandards.ecds.CDSMessageHeaderStructure parse(java.net.URL u, org.apache.xmlbeans.XmlOptions options) throws org.apache.xmlbeans.XmlException, java.io.IOException {
          return (uk.nhs.nhsia.datastandards.ecds.CDSMessageHeaderStructure) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( u, type, options ); }
        
        public static uk.nhs.nhsia.datastandards.ecds.CDSMessageHeaderStructure parse(java.io.InputStream is) throws org.apache.xmlbeans.XmlException, java.io.IOException {
          return (uk.nhs.nhsia.datastandards.ecds.CDSMessageHeaderStructure) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( is, type, null ); }
        
        public static uk.nhs.nhsia.datastandards.ecds.CDSMessageHeaderStructure parse(java.io.InputStream is, org.apache.xmlbeans.XmlOptions options) throws org.apache.xmlbeans.XmlException, java.io.IOException {
          return (uk.nhs.nhsia.datastandards.ecds.CDSMessageHeaderStructure) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( is, type, options ); }
        
        public static uk.nhs.nhsia.datastandards.ecds.CDSMessageHeaderStructure parse(java.io.Reader r) throws org.apache.xmlbeans.XmlException, java.io.IOException {
          return (uk.nhs.nhsia.datastandards.ecds.CDSMessageHeaderStructure) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( r, type, null ); }
        
        public static uk.nhs.nhsia.datastandards.ecds.CDSMessageHeaderStructure parse(java.io.Reader r, org.apache.xmlbeans.XmlOptions options) throws org.apache.xmlbeans.XmlException, java.io.IOException {
          return (uk.nhs.nhsia.datastandards.ecds.CDSMessageHeaderStructure) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( r, type, options ); }
        
        public static uk.nhs.nhsia.datastandards.ecds.CDSMessageHeaderStructure parse(javax.xml.stream.XMLStreamReader sr) throws org.apache.xmlbeans.XmlException {
          return (uk.nhs.nhsia.datastandards.ecds.CDSMessageHeaderStructure) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( sr, type, null ); }
        
        public static uk.nhs.nhsia.datastandards.ecds.CDSMessageHeaderStructure parse(javax.xml.stream.XMLStreamReader sr, org.apache.xmlbeans.XmlOptions options) throws org.apache.xmlbeans.XmlException {
          return (uk.nhs.nhsia.datastandards.ecds.CDSMessageHeaderStructure) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( sr, type, options ); }
        
        public static uk.nhs.nhsia.datastandards.ecds.CDSMessageHeaderStructure parse(org.w3c.dom.Node node) throws org.apache.xmlbeans.XmlException {
          return (uk.nhs.nhsia.datastandards.ecds.CDSMessageHeaderStructure) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( node, type, null ); }
        
        public static uk.nhs.nhsia.datastandards.ecds.CDSMessageHeaderStructure parse(org.w3c.dom.Node node, org.apache.xmlbeans.XmlOptions options) throws org.apache.xmlbeans.XmlException {
          return (uk.nhs.nhsia.datastandards.ecds.CDSMessageHeaderStructure) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( node, type, options ); }
        
        /** @deprecated {@link org.apache.xmlbeans.xml.stream.XMLInputStream} */
        public static uk.nhs.nhsia.datastandards.ecds.CDSMessageHeaderStructure parse(org.apache.xmlbeans.xml.stream.XMLInputStream xis) throws org.apache.xmlbeans.XmlException, org.apache.xmlbeans.xml.stream.XMLStreamException {
          return (uk.nhs.nhsia.datastandards.ecds.CDSMessageHeaderStructure) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( xis, type, null ); }
        
        /** @deprecated {@link org.apache.xmlbeans.xml.stream.XMLInputStream} */
        public static uk.nhs.nhsia.datastandards.ecds.CDSMessageHeaderStructure parse(org.apache.xmlbeans.xml.stream.XMLInputStream xis, org.apache.xmlbeans.XmlOptions options) throws org.apache.xmlbeans.XmlException, org.apache.xmlbeans.xml.stream.XMLStreamException {
          return (uk.nhs.nhsia.datastandards.ecds.CDSMessageHeaderStructure) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( xis, type, options ); }
        
        /** @deprecated {@link org.apache.xmlbeans.xml.stream.XMLInputStream} */
        public static org.apache.xmlbeans.xml.stream.XMLInputStream newValidatingXMLInputStream(org.apache.xmlbeans.xml.stream.XMLInputStream xis) throws org.apache.xmlbeans.XmlException, org.apache.xmlbeans.xml.stream.XMLStreamException {
          return org.apache.xmlbeans.XmlBeans.getContextTypeLoader().newValidatingXMLInputStream( xis, type, null ); }
        
        /** @deprecated {@link org.apache.xmlbeans.xml.stream.XMLInputStream} */
        public static org.apache.xmlbeans.xml.stream.XMLInputStream newValidatingXMLInputStream(org.apache.xmlbeans.xml.stream.XMLInputStream xis, org.apache.xmlbeans.XmlOptions options) throws org.apache.xmlbeans.XmlException, org.apache.xmlbeans.xml.stream.XMLStreamException {
          return org.apache.xmlbeans.XmlBeans.getContextTypeLoader().newValidatingXMLInputStream( xis, type, options ); }
        
        private Factory() { } // No instance of this class allowed
    }
}
