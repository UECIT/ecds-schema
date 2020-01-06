/*
 * XML Type:  ConsultantEpisodeLengthOfStayAdjustment_Structure
 * Namespace: http://www.nhsia.nhs.uk/DataStandards/XMLschema/CDS/ns
 * Java type: uk.nhs.nhsia.datastandards.ecds.ConsultantEpisodeLengthOfStayAdjustmentStructure
 *
 * Automatically generated - do not modify.
 */
package uk.nhs.nhsia.datastandards.ecds;


/**
 * An XML ConsultantEpisodeLengthOfStayAdjustment_Structure(@http://www.nhsia.nhs.uk/DataStandards/XMLschema/CDS/ns).
 *
 * This is a complex type.
 */
public interface ConsultantEpisodeLengthOfStayAdjustmentStructure extends org.apache.xmlbeans.XmlObject
{
    public static final org.apache.xmlbeans.SchemaType type = (org.apache.xmlbeans.SchemaType)
        org.apache.xmlbeans.XmlBeans.typeSystemForClassLoader(ConsultantEpisodeLengthOfStayAdjustmentStructure.class.getClassLoader(), "schemaorg_apache_xmlbeans.system.s30C1180FF47174E0C8A992A2D657328B").resolveHandle("consultantepisodelengthofstayadjustmentstructure432ctype");
    
    /**
     * Gets the "LengthOfStayAdjustmentRehab" element
     */
    int getLengthOfStayAdjustmentRehab();
    
    /**
     * Gets (as xml) the "LengthOfStayAdjustmentRehab" element
     */
    uk.nhs.nhsia.datastandards.ecds.LengthOfStayAdjustmentType xgetLengthOfStayAdjustmentRehab();
    
    /**
     * True if has "LengthOfStayAdjustmentRehab" element
     */
    boolean isSetLengthOfStayAdjustmentRehab();
    
    /**
     * Sets the "LengthOfStayAdjustmentRehab" element
     */
    void setLengthOfStayAdjustmentRehab(int lengthOfStayAdjustmentRehab);
    
    /**
     * Sets (as xml) the "LengthOfStayAdjustmentRehab" element
     */
    void xsetLengthOfStayAdjustmentRehab(uk.nhs.nhsia.datastandards.ecds.LengthOfStayAdjustmentType lengthOfStayAdjustmentRehab);
    
    /**
     * Unsets the "LengthOfStayAdjustmentRehab" element
     */
    void unsetLengthOfStayAdjustmentRehab();
    
    /**
     * Gets the "LengthOfStayAdjustmentSpecialistPalliativeCare" element
     */
    int getLengthOfStayAdjustmentSpecialistPalliativeCare();
    
    /**
     * Gets (as xml) the "LengthOfStayAdjustmentSpecialistPalliativeCare" element
     */
    uk.nhs.nhsia.datastandards.ecds.LengthOfStayAdjustmentType xgetLengthOfStayAdjustmentSpecialistPalliativeCare();
    
    /**
     * True if has "LengthOfStayAdjustmentSpecialistPalliativeCare" element
     */
    boolean isSetLengthOfStayAdjustmentSpecialistPalliativeCare();
    
    /**
     * Sets the "LengthOfStayAdjustmentSpecialistPalliativeCare" element
     */
    void setLengthOfStayAdjustmentSpecialistPalliativeCare(int lengthOfStayAdjustmentSpecialistPalliativeCare);
    
    /**
     * Sets (as xml) the "LengthOfStayAdjustmentSpecialistPalliativeCare" element
     */
    void xsetLengthOfStayAdjustmentSpecialistPalliativeCare(uk.nhs.nhsia.datastandards.ecds.LengthOfStayAdjustmentType lengthOfStayAdjustmentSpecialistPalliativeCare);
    
    /**
     * Unsets the "LengthOfStayAdjustmentSpecialistPalliativeCare" element
     */
    void unsetLengthOfStayAdjustmentSpecialistPalliativeCare();
    
    /**
     * A factory class with static methods for creating instances
     * of this type.
     */
    
    public static final class Factory
    {
        public static uk.nhs.nhsia.datastandards.ecds.ConsultantEpisodeLengthOfStayAdjustmentStructure newInstance() {
          return (uk.nhs.nhsia.datastandards.ecds.ConsultantEpisodeLengthOfStayAdjustmentStructure) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().newInstance( type, null ); }
        
        public static uk.nhs.nhsia.datastandards.ecds.ConsultantEpisodeLengthOfStayAdjustmentStructure newInstance(org.apache.xmlbeans.XmlOptions options) {
          return (uk.nhs.nhsia.datastandards.ecds.ConsultantEpisodeLengthOfStayAdjustmentStructure) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().newInstance( type, options ); }
        
        /** @param xmlAsString the string value to parse */
        public static uk.nhs.nhsia.datastandards.ecds.ConsultantEpisodeLengthOfStayAdjustmentStructure parse(java.lang.String xmlAsString) throws org.apache.xmlbeans.XmlException {
          return (uk.nhs.nhsia.datastandards.ecds.ConsultantEpisodeLengthOfStayAdjustmentStructure) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( xmlAsString, type, null ); }
        
        public static uk.nhs.nhsia.datastandards.ecds.ConsultantEpisodeLengthOfStayAdjustmentStructure parse(java.lang.String xmlAsString, org.apache.xmlbeans.XmlOptions options) throws org.apache.xmlbeans.XmlException {
          return (uk.nhs.nhsia.datastandards.ecds.ConsultantEpisodeLengthOfStayAdjustmentStructure) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( xmlAsString, type, options ); }
        
        /** @param file the file from which to load an xml document */
        public static uk.nhs.nhsia.datastandards.ecds.ConsultantEpisodeLengthOfStayAdjustmentStructure parse(java.io.File file) throws org.apache.xmlbeans.XmlException, java.io.IOException {
          return (uk.nhs.nhsia.datastandards.ecds.ConsultantEpisodeLengthOfStayAdjustmentStructure) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( file, type, null ); }
        
        public static uk.nhs.nhsia.datastandards.ecds.ConsultantEpisodeLengthOfStayAdjustmentStructure parse(java.io.File file, org.apache.xmlbeans.XmlOptions options) throws org.apache.xmlbeans.XmlException, java.io.IOException {
          return (uk.nhs.nhsia.datastandards.ecds.ConsultantEpisodeLengthOfStayAdjustmentStructure) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( file, type, options ); }
        
        public static uk.nhs.nhsia.datastandards.ecds.ConsultantEpisodeLengthOfStayAdjustmentStructure parse(java.net.URL u) throws org.apache.xmlbeans.XmlException, java.io.IOException {
          return (uk.nhs.nhsia.datastandards.ecds.ConsultantEpisodeLengthOfStayAdjustmentStructure) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( u, type, null ); }
        
        public static uk.nhs.nhsia.datastandards.ecds.ConsultantEpisodeLengthOfStayAdjustmentStructure parse(java.net.URL u, org.apache.xmlbeans.XmlOptions options) throws org.apache.xmlbeans.XmlException, java.io.IOException {
          return (uk.nhs.nhsia.datastandards.ecds.ConsultantEpisodeLengthOfStayAdjustmentStructure) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( u, type, options ); }
        
        public static uk.nhs.nhsia.datastandards.ecds.ConsultantEpisodeLengthOfStayAdjustmentStructure parse(java.io.InputStream is) throws org.apache.xmlbeans.XmlException, java.io.IOException {
          return (uk.nhs.nhsia.datastandards.ecds.ConsultantEpisodeLengthOfStayAdjustmentStructure) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( is, type, null ); }
        
        public static uk.nhs.nhsia.datastandards.ecds.ConsultantEpisodeLengthOfStayAdjustmentStructure parse(java.io.InputStream is, org.apache.xmlbeans.XmlOptions options) throws org.apache.xmlbeans.XmlException, java.io.IOException {
          return (uk.nhs.nhsia.datastandards.ecds.ConsultantEpisodeLengthOfStayAdjustmentStructure) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( is, type, options ); }
        
        public static uk.nhs.nhsia.datastandards.ecds.ConsultantEpisodeLengthOfStayAdjustmentStructure parse(java.io.Reader r) throws org.apache.xmlbeans.XmlException, java.io.IOException {
          return (uk.nhs.nhsia.datastandards.ecds.ConsultantEpisodeLengthOfStayAdjustmentStructure) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( r, type, null ); }
        
        public static uk.nhs.nhsia.datastandards.ecds.ConsultantEpisodeLengthOfStayAdjustmentStructure parse(java.io.Reader r, org.apache.xmlbeans.XmlOptions options) throws org.apache.xmlbeans.XmlException, java.io.IOException {
          return (uk.nhs.nhsia.datastandards.ecds.ConsultantEpisodeLengthOfStayAdjustmentStructure) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( r, type, options ); }
        
        public static uk.nhs.nhsia.datastandards.ecds.ConsultantEpisodeLengthOfStayAdjustmentStructure parse(javax.xml.stream.XMLStreamReader sr) throws org.apache.xmlbeans.XmlException {
          return (uk.nhs.nhsia.datastandards.ecds.ConsultantEpisodeLengthOfStayAdjustmentStructure) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( sr, type, null ); }
        
        public static uk.nhs.nhsia.datastandards.ecds.ConsultantEpisodeLengthOfStayAdjustmentStructure parse(javax.xml.stream.XMLStreamReader sr, org.apache.xmlbeans.XmlOptions options) throws org.apache.xmlbeans.XmlException {
          return (uk.nhs.nhsia.datastandards.ecds.ConsultantEpisodeLengthOfStayAdjustmentStructure) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( sr, type, options ); }
        
        public static uk.nhs.nhsia.datastandards.ecds.ConsultantEpisodeLengthOfStayAdjustmentStructure parse(org.w3c.dom.Node node) throws org.apache.xmlbeans.XmlException {
          return (uk.nhs.nhsia.datastandards.ecds.ConsultantEpisodeLengthOfStayAdjustmentStructure) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( node, type, null ); }
        
        public static uk.nhs.nhsia.datastandards.ecds.ConsultantEpisodeLengthOfStayAdjustmentStructure parse(org.w3c.dom.Node node, org.apache.xmlbeans.XmlOptions options) throws org.apache.xmlbeans.XmlException {
          return (uk.nhs.nhsia.datastandards.ecds.ConsultantEpisodeLengthOfStayAdjustmentStructure) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( node, type, options ); }
        
        /** @deprecated {@link org.apache.xmlbeans.xml.stream.XMLInputStream} */
        public static uk.nhs.nhsia.datastandards.ecds.ConsultantEpisodeLengthOfStayAdjustmentStructure parse(org.apache.xmlbeans.xml.stream.XMLInputStream xis) throws org.apache.xmlbeans.XmlException, org.apache.xmlbeans.xml.stream.XMLStreamException {
          return (uk.nhs.nhsia.datastandards.ecds.ConsultantEpisodeLengthOfStayAdjustmentStructure) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( xis, type, null ); }
        
        /** @deprecated {@link org.apache.xmlbeans.xml.stream.XMLInputStream} */
        public static uk.nhs.nhsia.datastandards.ecds.ConsultantEpisodeLengthOfStayAdjustmentStructure parse(org.apache.xmlbeans.xml.stream.XMLInputStream xis, org.apache.xmlbeans.XmlOptions options) throws org.apache.xmlbeans.XmlException, org.apache.xmlbeans.xml.stream.XMLStreamException {
          return (uk.nhs.nhsia.datastandards.ecds.ConsultantEpisodeLengthOfStayAdjustmentStructure) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( xis, type, options ); }
        
        /** @deprecated {@link org.apache.xmlbeans.xml.stream.XMLInputStream} */
        public static org.apache.xmlbeans.xml.stream.XMLInputStream newValidatingXMLInputStream(org.apache.xmlbeans.xml.stream.XMLInputStream xis) throws org.apache.xmlbeans.XmlException, org.apache.xmlbeans.xml.stream.XMLStreamException {
          return org.apache.xmlbeans.XmlBeans.getContextTypeLoader().newValidatingXMLInputStream( xis, type, null ); }
        
        /** @deprecated {@link org.apache.xmlbeans.xml.stream.XMLInputStream} */
        public static org.apache.xmlbeans.xml.stream.XMLInputStream newValidatingXMLInputStream(org.apache.xmlbeans.xml.stream.XMLInputStream xis, org.apache.xmlbeans.XmlOptions options) throws org.apache.xmlbeans.XmlException, org.apache.xmlbeans.xml.stream.XMLStreamException {
          return org.apache.xmlbeans.XmlBeans.getContextTypeLoader().newValidatingXMLInputStream( xis, type, options ); }
        
        private Factory() { } // No instance of this class allowed
    }
}
