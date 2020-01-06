/*
 * XML Type:  OverseasVisitorStatus_Structure
 * Namespace: http://www.nhsia.nhs.uk/DataStandards/XMLschema/CDS/ns
 * Java type: uk.nhs.nhsia.datastandards.ecds.OverseasVisitorStatusStructure
 *
 * Automatically generated - do not modify.
 */
package uk.nhs.nhsia.datastandards.ecds;


/**
 * An XML OverseasVisitorStatus_Structure(@http://www.nhsia.nhs.uk/DataStandards/XMLschema/CDS/ns).
 *
 * This is a complex type.
 */
public interface OverseasVisitorStatusStructure extends org.apache.xmlbeans.XmlObject
{
    public static final org.apache.xmlbeans.SchemaType type = (org.apache.xmlbeans.SchemaType)
        org.apache.xmlbeans.XmlBeans.typeSystemForClassLoader(OverseasVisitorStatusStructure.class.getClassLoader(), "schemaorg_apache_xmlbeans.system.s30C1180FF47174E0C8A992A2D657328B").resolveHandle("overseasvisitorstatusstructure1087type");
    
    /**
     * Gets the "OverseasVisitorClassification" element
     */
    uk.nhs.nhsia.datastandards.ecds.OverseasVisitorClassificationType.Enum getOverseasVisitorClassification();
    
    /**
     * Gets (as xml) the "OverseasVisitorClassification" element
     */
    uk.nhs.nhsia.datastandards.ecds.OverseasVisitorClassificationType xgetOverseasVisitorClassification();
    
    /**
     * Sets the "OverseasVisitorClassification" element
     */
    void setOverseasVisitorClassification(uk.nhs.nhsia.datastandards.ecds.OverseasVisitorClassificationType.Enum overseasVisitorClassification);
    
    /**
     * Sets (as xml) the "OverseasVisitorClassification" element
     */
    void xsetOverseasVisitorClassification(uk.nhs.nhsia.datastandards.ecds.OverseasVisitorClassificationType overseasVisitorClassification);
    
    /**
     * Gets the "OverseasVisitorStatusStartDate" element
     */
    java.util.Calendar getOverseasVisitorStatusStartDate();
    
    /**
     * Gets (as xml) the "OverseasVisitorStatusStartDate" element
     */
    uk.nhs.nhsia.datastandards.ecds.OverseasVisitorStatusStartDateType xgetOverseasVisitorStatusStartDate();
    
    /**
     * Sets the "OverseasVisitorStatusStartDate" element
     */
    void setOverseasVisitorStatusStartDate(java.util.Calendar overseasVisitorStatusStartDate);
    
    /**
     * Sets (as xml) the "OverseasVisitorStatusStartDate" element
     */
    void xsetOverseasVisitorStatusStartDate(uk.nhs.nhsia.datastandards.ecds.OverseasVisitorStatusStartDateType overseasVisitorStatusStartDate);
    
    /**
     * Gets the "OverseasVisitorStatusEndDate" element
     */
    java.util.Calendar getOverseasVisitorStatusEndDate();
    
    /**
     * Gets (as xml) the "OverseasVisitorStatusEndDate" element
     */
    uk.nhs.nhsia.datastandards.ecds.OverseasVisitorStatusEndDateType xgetOverseasVisitorStatusEndDate();
    
    /**
     * True if has "OverseasVisitorStatusEndDate" element
     */
    boolean isSetOverseasVisitorStatusEndDate();
    
    /**
     * Sets the "OverseasVisitorStatusEndDate" element
     */
    void setOverseasVisitorStatusEndDate(java.util.Calendar overseasVisitorStatusEndDate);
    
    /**
     * Sets (as xml) the "OverseasVisitorStatusEndDate" element
     */
    void xsetOverseasVisitorStatusEndDate(uk.nhs.nhsia.datastandards.ecds.OverseasVisitorStatusEndDateType overseasVisitorStatusEndDate);
    
    /**
     * Unsets the "OverseasVisitorStatusEndDate" element
     */
    void unsetOverseasVisitorStatusEndDate();
    
    /**
     * A factory class with static methods for creating instances
     * of this type.
     */
    
    public static final class Factory
    {
        public static uk.nhs.nhsia.datastandards.ecds.OverseasVisitorStatusStructure newInstance() {
          return (uk.nhs.nhsia.datastandards.ecds.OverseasVisitorStatusStructure) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().newInstance( type, null ); }
        
        public static uk.nhs.nhsia.datastandards.ecds.OverseasVisitorStatusStructure newInstance(org.apache.xmlbeans.XmlOptions options) {
          return (uk.nhs.nhsia.datastandards.ecds.OverseasVisitorStatusStructure) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().newInstance( type, options ); }
        
        /** @param xmlAsString the string value to parse */
        public static uk.nhs.nhsia.datastandards.ecds.OverseasVisitorStatusStructure parse(java.lang.String xmlAsString) throws org.apache.xmlbeans.XmlException {
          return (uk.nhs.nhsia.datastandards.ecds.OverseasVisitorStatusStructure) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( xmlAsString, type, null ); }
        
        public static uk.nhs.nhsia.datastandards.ecds.OverseasVisitorStatusStructure parse(java.lang.String xmlAsString, org.apache.xmlbeans.XmlOptions options) throws org.apache.xmlbeans.XmlException {
          return (uk.nhs.nhsia.datastandards.ecds.OverseasVisitorStatusStructure) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( xmlAsString, type, options ); }
        
        /** @param file the file from which to load an xml document */
        public static uk.nhs.nhsia.datastandards.ecds.OverseasVisitorStatusStructure parse(java.io.File file) throws org.apache.xmlbeans.XmlException, java.io.IOException {
          return (uk.nhs.nhsia.datastandards.ecds.OverseasVisitorStatusStructure) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( file, type, null ); }
        
        public static uk.nhs.nhsia.datastandards.ecds.OverseasVisitorStatusStructure parse(java.io.File file, org.apache.xmlbeans.XmlOptions options) throws org.apache.xmlbeans.XmlException, java.io.IOException {
          return (uk.nhs.nhsia.datastandards.ecds.OverseasVisitorStatusStructure) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( file, type, options ); }
        
        public static uk.nhs.nhsia.datastandards.ecds.OverseasVisitorStatusStructure parse(java.net.URL u) throws org.apache.xmlbeans.XmlException, java.io.IOException {
          return (uk.nhs.nhsia.datastandards.ecds.OverseasVisitorStatusStructure) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( u, type, null ); }
        
        public static uk.nhs.nhsia.datastandards.ecds.OverseasVisitorStatusStructure parse(java.net.URL u, org.apache.xmlbeans.XmlOptions options) throws org.apache.xmlbeans.XmlException, java.io.IOException {
          return (uk.nhs.nhsia.datastandards.ecds.OverseasVisitorStatusStructure) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( u, type, options ); }
        
        public static uk.nhs.nhsia.datastandards.ecds.OverseasVisitorStatusStructure parse(java.io.InputStream is) throws org.apache.xmlbeans.XmlException, java.io.IOException {
          return (uk.nhs.nhsia.datastandards.ecds.OverseasVisitorStatusStructure) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( is, type, null ); }
        
        public static uk.nhs.nhsia.datastandards.ecds.OverseasVisitorStatusStructure parse(java.io.InputStream is, org.apache.xmlbeans.XmlOptions options) throws org.apache.xmlbeans.XmlException, java.io.IOException {
          return (uk.nhs.nhsia.datastandards.ecds.OverseasVisitorStatusStructure) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( is, type, options ); }
        
        public static uk.nhs.nhsia.datastandards.ecds.OverseasVisitorStatusStructure parse(java.io.Reader r) throws org.apache.xmlbeans.XmlException, java.io.IOException {
          return (uk.nhs.nhsia.datastandards.ecds.OverseasVisitorStatusStructure) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( r, type, null ); }
        
        public static uk.nhs.nhsia.datastandards.ecds.OverseasVisitorStatusStructure parse(java.io.Reader r, org.apache.xmlbeans.XmlOptions options) throws org.apache.xmlbeans.XmlException, java.io.IOException {
          return (uk.nhs.nhsia.datastandards.ecds.OverseasVisitorStatusStructure) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( r, type, options ); }
        
        public static uk.nhs.nhsia.datastandards.ecds.OverseasVisitorStatusStructure parse(javax.xml.stream.XMLStreamReader sr) throws org.apache.xmlbeans.XmlException {
          return (uk.nhs.nhsia.datastandards.ecds.OverseasVisitorStatusStructure) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( sr, type, null ); }
        
        public static uk.nhs.nhsia.datastandards.ecds.OverseasVisitorStatusStructure parse(javax.xml.stream.XMLStreamReader sr, org.apache.xmlbeans.XmlOptions options) throws org.apache.xmlbeans.XmlException {
          return (uk.nhs.nhsia.datastandards.ecds.OverseasVisitorStatusStructure) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( sr, type, options ); }
        
        public static uk.nhs.nhsia.datastandards.ecds.OverseasVisitorStatusStructure parse(org.w3c.dom.Node node) throws org.apache.xmlbeans.XmlException {
          return (uk.nhs.nhsia.datastandards.ecds.OverseasVisitorStatusStructure) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( node, type, null ); }
        
        public static uk.nhs.nhsia.datastandards.ecds.OverseasVisitorStatusStructure parse(org.w3c.dom.Node node, org.apache.xmlbeans.XmlOptions options) throws org.apache.xmlbeans.XmlException {
          return (uk.nhs.nhsia.datastandards.ecds.OverseasVisitorStatusStructure) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( node, type, options ); }
        
        /** @deprecated {@link org.apache.xmlbeans.xml.stream.XMLInputStream} */
        public static uk.nhs.nhsia.datastandards.ecds.OverseasVisitorStatusStructure parse(org.apache.xmlbeans.xml.stream.XMLInputStream xis) throws org.apache.xmlbeans.XmlException, org.apache.xmlbeans.xml.stream.XMLStreamException {
          return (uk.nhs.nhsia.datastandards.ecds.OverseasVisitorStatusStructure) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( xis, type, null ); }
        
        /** @deprecated {@link org.apache.xmlbeans.xml.stream.XMLInputStream} */
        public static uk.nhs.nhsia.datastandards.ecds.OverseasVisitorStatusStructure parse(org.apache.xmlbeans.xml.stream.XMLInputStream xis, org.apache.xmlbeans.XmlOptions options) throws org.apache.xmlbeans.XmlException, org.apache.xmlbeans.xml.stream.XMLStreamException {
          return (uk.nhs.nhsia.datastandards.ecds.OverseasVisitorStatusStructure) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( xis, type, options ); }
        
        /** @deprecated {@link org.apache.xmlbeans.xml.stream.XMLInputStream} */
        public static org.apache.xmlbeans.xml.stream.XMLInputStream newValidatingXMLInputStream(org.apache.xmlbeans.xml.stream.XMLInputStream xis) throws org.apache.xmlbeans.XmlException, org.apache.xmlbeans.xml.stream.XMLStreamException {
          return org.apache.xmlbeans.XmlBeans.getContextTypeLoader().newValidatingXMLInputStream( xis, type, null ); }
        
        /** @deprecated {@link org.apache.xmlbeans.xml.stream.XMLInputStream} */
        public static org.apache.xmlbeans.xml.stream.XMLInputStream newValidatingXMLInputStream(org.apache.xmlbeans.xml.stream.XMLInputStream xis, org.apache.xmlbeans.XmlOptions options) throws org.apache.xmlbeans.XmlException, org.apache.xmlbeans.xml.stream.XMLStreamException {
          return org.apache.xmlbeans.XmlBeans.getContextTypeLoader().newValidatingXMLInputStream( xis, type, options ); }
        
        private Factory() { } // No instance of this class allowed
    }
}
