/*
 * XML Type:  CDSInterchangeTrailer_Structure
 * Namespace: http://www.nhsia.nhs.uk/DataStandards/XMLschema/CDS/ns
 * Java type: uk.nhs.nhsia.datastandards.ecds.CDSInterchangeTrailerStructure
 *
 * Automatically generated - do not modify.
 */
package uk.nhs.nhsia.datastandards.ecds;


/**
 * An XML CDSInterchangeTrailer_Structure(@http://www.nhsia.nhs.uk/DataStandards/XMLschema/CDS/ns).
 *
 * This is a complex type.
 */
public interface CDSInterchangeTrailerStructure extends org.apache.xmlbeans.XmlObject
{
    public static final org.apache.xmlbeans.SchemaType type = (org.apache.xmlbeans.SchemaType)
        org.apache.xmlbeans.XmlBeans.typeSystemForClassLoader(CDSInterchangeTrailerStructure.class.getClassLoader(), "schemaorg_apache_xmlbeans.system.s30C1180FF47174E0C8A992A2D657328B").resolveHandle("cdsinterchangetrailerstructure02d6type");
    
    /**
     * Gets the "CDSInterchangeControlReference" element
     */
    java.lang.String getCDSInterchangeControlReference();
    
    /**
     * Gets (as xml) the "CDSInterchangeControlReference" element
     */
    uk.nhs.nhsia.datastandards.ecds.CDSInterchangeControlReferenceType xgetCDSInterchangeControlReference();
    
    /**
     * Sets the "CDSInterchangeControlReference" element
     */
    void setCDSInterchangeControlReference(java.lang.String cdsInterchangeControlReference);
    
    /**
     * Sets (as xml) the "CDSInterchangeControlReference" element
     */
    void xsetCDSInterchangeControlReference(uk.nhs.nhsia.datastandards.ecds.CDSInterchangeControlReferenceType cdsInterchangeControlReference);
    
    /**
     * Gets the "CDSInterchangeControlCount" element
     */
    long getCDSInterchangeControlCount();
    
    /**
     * Gets (as xml) the "CDSInterchangeControlCount" element
     */
    uk.nhs.nhsia.datastandards.ecds.CDSInterchangeControlCountType xgetCDSInterchangeControlCount();
    
    /**
     * Sets the "CDSInterchangeControlCount" element
     */
    void setCDSInterchangeControlCount(long cdsInterchangeControlCount);
    
    /**
     * Sets (as xml) the "CDSInterchangeControlCount" element
     */
    void xsetCDSInterchangeControlCount(uk.nhs.nhsia.datastandards.ecds.CDSInterchangeControlCountType cdsInterchangeControlCount);
    
    /**
     * Gets the "CDSInterchangeSenderIdentity" element
     */
    java.lang.String getCDSInterchangeSenderIdentity();
    
    /**
     * Gets (as xml) the "CDSInterchangeSenderIdentity" element
     */
    uk.nhs.nhsia.datastandards.ecds.CDSInterchangeSenderIdentityType xgetCDSInterchangeSenderIdentity();
    
    /**
     * True if has "CDSInterchangeSenderIdentity" element
     */
    boolean isSetCDSInterchangeSenderIdentity();
    
    /**
     * Sets the "CDSInterchangeSenderIdentity" element
     */
    void setCDSInterchangeSenderIdentity(java.lang.String cdsInterchangeSenderIdentity);
    
    /**
     * Sets (as xml) the "CDSInterchangeSenderIdentity" element
     */
    void xsetCDSInterchangeSenderIdentity(uk.nhs.nhsia.datastandards.ecds.CDSInterchangeSenderIdentityType cdsInterchangeSenderIdentity);
    
    /**
     * Unsets the "CDSInterchangeSenderIdentity" element
     */
    void unsetCDSInterchangeSenderIdentity();
    
    /**
     * Gets the "CDSInterchangeReceiverIdentity" element
     */
    java.lang.String getCDSInterchangeReceiverIdentity();
    
    /**
     * Gets (as xml) the "CDSInterchangeReceiverIdentity" element
     */
    uk.nhs.nhsia.datastandards.ecds.CDSInterchangeReceiverIdentityType xgetCDSInterchangeReceiverIdentity();
    
    /**
     * True if has "CDSInterchangeReceiverIdentity" element
     */
    boolean isSetCDSInterchangeReceiverIdentity();
    
    /**
     * Sets the "CDSInterchangeReceiverIdentity" element
     */
    void setCDSInterchangeReceiverIdentity(java.lang.String cdsInterchangeReceiverIdentity);
    
    /**
     * Sets (as xml) the "CDSInterchangeReceiverIdentity" element
     */
    void xsetCDSInterchangeReceiverIdentity(uk.nhs.nhsia.datastandards.ecds.CDSInterchangeReceiverIdentityType cdsInterchangeReceiverIdentity);
    
    /**
     * Unsets the "CDSInterchangeReceiverIdentity" element
     */
    void unsetCDSInterchangeReceiverIdentity();
    
    /**
     * A factory class with static methods for creating instances
     * of this type.
     */
    
    public static final class Factory
    {
        public static uk.nhs.nhsia.datastandards.ecds.CDSInterchangeTrailerStructure newInstance() {
          return (uk.nhs.nhsia.datastandards.ecds.CDSInterchangeTrailerStructure) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().newInstance( type, null ); }
        
        public static uk.nhs.nhsia.datastandards.ecds.CDSInterchangeTrailerStructure newInstance(org.apache.xmlbeans.XmlOptions options) {
          return (uk.nhs.nhsia.datastandards.ecds.CDSInterchangeTrailerStructure) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().newInstance( type, options ); }
        
        /** @param xmlAsString the string value to parse */
        public static uk.nhs.nhsia.datastandards.ecds.CDSInterchangeTrailerStructure parse(java.lang.String xmlAsString) throws org.apache.xmlbeans.XmlException {
          return (uk.nhs.nhsia.datastandards.ecds.CDSInterchangeTrailerStructure) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( xmlAsString, type, null ); }
        
        public static uk.nhs.nhsia.datastandards.ecds.CDSInterchangeTrailerStructure parse(java.lang.String xmlAsString, org.apache.xmlbeans.XmlOptions options) throws org.apache.xmlbeans.XmlException {
          return (uk.nhs.nhsia.datastandards.ecds.CDSInterchangeTrailerStructure) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( xmlAsString, type, options ); }
        
        /** @param file the file from which to load an xml document */
        public static uk.nhs.nhsia.datastandards.ecds.CDSInterchangeTrailerStructure parse(java.io.File file) throws org.apache.xmlbeans.XmlException, java.io.IOException {
          return (uk.nhs.nhsia.datastandards.ecds.CDSInterchangeTrailerStructure) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( file, type, null ); }
        
        public static uk.nhs.nhsia.datastandards.ecds.CDSInterchangeTrailerStructure parse(java.io.File file, org.apache.xmlbeans.XmlOptions options) throws org.apache.xmlbeans.XmlException, java.io.IOException {
          return (uk.nhs.nhsia.datastandards.ecds.CDSInterchangeTrailerStructure) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( file, type, options ); }
        
        public static uk.nhs.nhsia.datastandards.ecds.CDSInterchangeTrailerStructure parse(java.net.URL u) throws org.apache.xmlbeans.XmlException, java.io.IOException {
          return (uk.nhs.nhsia.datastandards.ecds.CDSInterchangeTrailerStructure) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( u, type, null ); }
        
        public static uk.nhs.nhsia.datastandards.ecds.CDSInterchangeTrailerStructure parse(java.net.URL u, org.apache.xmlbeans.XmlOptions options) throws org.apache.xmlbeans.XmlException, java.io.IOException {
          return (uk.nhs.nhsia.datastandards.ecds.CDSInterchangeTrailerStructure) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( u, type, options ); }
        
        public static uk.nhs.nhsia.datastandards.ecds.CDSInterchangeTrailerStructure parse(java.io.InputStream is) throws org.apache.xmlbeans.XmlException, java.io.IOException {
          return (uk.nhs.nhsia.datastandards.ecds.CDSInterchangeTrailerStructure) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( is, type, null ); }
        
        public static uk.nhs.nhsia.datastandards.ecds.CDSInterchangeTrailerStructure parse(java.io.InputStream is, org.apache.xmlbeans.XmlOptions options) throws org.apache.xmlbeans.XmlException, java.io.IOException {
          return (uk.nhs.nhsia.datastandards.ecds.CDSInterchangeTrailerStructure) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( is, type, options ); }
        
        public static uk.nhs.nhsia.datastandards.ecds.CDSInterchangeTrailerStructure parse(java.io.Reader r) throws org.apache.xmlbeans.XmlException, java.io.IOException {
          return (uk.nhs.nhsia.datastandards.ecds.CDSInterchangeTrailerStructure) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( r, type, null ); }
        
        public static uk.nhs.nhsia.datastandards.ecds.CDSInterchangeTrailerStructure parse(java.io.Reader r, org.apache.xmlbeans.XmlOptions options) throws org.apache.xmlbeans.XmlException, java.io.IOException {
          return (uk.nhs.nhsia.datastandards.ecds.CDSInterchangeTrailerStructure) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( r, type, options ); }
        
        public static uk.nhs.nhsia.datastandards.ecds.CDSInterchangeTrailerStructure parse(javax.xml.stream.XMLStreamReader sr) throws org.apache.xmlbeans.XmlException {
          return (uk.nhs.nhsia.datastandards.ecds.CDSInterchangeTrailerStructure) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( sr, type, null ); }
        
        public static uk.nhs.nhsia.datastandards.ecds.CDSInterchangeTrailerStructure parse(javax.xml.stream.XMLStreamReader sr, org.apache.xmlbeans.XmlOptions options) throws org.apache.xmlbeans.XmlException {
          return (uk.nhs.nhsia.datastandards.ecds.CDSInterchangeTrailerStructure) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( sr, type, options ); }
        
        public static uk.nhs.nhsia.datastandards.ecds.CDSInterchangeTrailerStructure parse(org.w3c.dom.Node node) throws org.apache.xmlbeans.XmlException {
          return (uk.nhs.nhsia.datastandards.ecds.CDSInterchangeTrailerStructure) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( node, type, null ); }
        
        public static uk.nhs.nhsia.datastandards.ecds.CDSInterchangeTrailerStructure parse(org.w3c.dom.Node node, org.apache.xmlbeans.XmlOptions options) throws org.apache.xmlbeans.XmlException {
          return (uk.nhs.nhsia.datastandards.ecds.CDSInterchangeTrailerStructure) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( node, type, options ); }
        
        /** @deprecated {@link org.apache.xmlbeans.xml.stream.XMLInputStream} */
        public static uk.nhs.nhsia.datastandards.ecds.CDSInterchangeTrailerStructure parse(org.apache.xmlbeans.xml.stream.XMLInputStream xis) throws org.apache.xmlbeans.XmlException, org.apache.xmlbeans.xml.stream.XMLStreamException {
          return (uk.nhs.nhsia.datastandards.ecds.CDSInterchangeTrailerStructure) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( xis, type, null ); }
        
        /** @deprecated {@link org.apache.xmlbeans.xml.stream.XMLInputStream} */
        public static uk.nhs.nhsia.datastandards.ecds.CDSInterchangeTrailerStructure parse(org.apache.xmlbeans.xml.stream.XMLInputStream xis, org.apache.xmlbeans.XmlOptions options) throws org.apache.xmlbeans.XmlException, org.apache.xmlbeans.xml.stream.XMLStreamException {
          return (uk.nhs.nhsia.datastandards.ecds.CDSInterchangeTrailerStructure) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( xis, type, options ); }
        
        /** @deprecated {@link org.apache.xmlbeans.xml.stream.XMLInputStream} */
        public static org.apache.xmlbeans.xml.stream.XMLInputStream newValidatingXMLInputStream(org.apache.xmlbeans.xml.stream.XMLInputStream xis) throws org.apache.xmlbeans.XmlException, org.apache.xmlbeans.xml.stream.XMLStreamException {
          return org.apache.xmlbeans.XmlBeans.getContextTypeLoader().newValidatingXMLInputStream( xis, type, null ); }
        
        /** @deprecated {@link org.apache.xmlbeans.xml.stream.XMLInputStream} */
        public static org.apache.xmlbeans.xml.stream.XMLInputStream newValidatingXMLInputStream(org.apache.xmlbeans.xml.stream.XMLInputStream xis, org.apache.xmlbeans.XmlOptions options) throws org.apache.xmlbeans.XmlException, org.apache.xmlbeans.xml.stream.XMLStreamException {
          return org.apache.xmlbeans.XmlBeans.getContextTypeLoader().newValidatingXMLInputStream( xis, type, options ); }
        
        private Factory() { } // No instance of this class allowed
    }
}
