/*
 * XML Type:  EALEntry_APCReference_Structure
 * Namespace: http://www.nhsia.nhs.uk/DataStandards/XMLschema/CDS/ns
 * Java type: uk.nhs.nhsia.datastandards.ecds.EALEntryAPCReferenceStructure
 *
 * Automatically generated - do not modify.
 */
package uk.nhs.nhsia.datastandards.ecds;


/**
 * An XML EALEntry_APCReference_Structure(@http://www.nhsia.nhs.uk/DataStandards/XMLschema/CDS/ns).
 *
 * This is a complex type.
 */
public interface EALEntryAPCReferenceStructure extends org.apache.xmlbeans.XmlObject
{
    public static final org.apache.xmlbeans.SchemaType type = (org.apache.xmlbeans.SchemaType)
        org.apache.xmlbeans.XmlBeans.typeSystemForClassLoader(EALEntryAPCReferenceStructure.class.getClassLoader(), "schemaorg_apache_xmlbeans.system.s30C1180FF47174E0C8A992A2D657328B").resolveHandle("ealentryapcreferencestructure543btype");
    
    /**
     * Gets the "DurationOfElectiveWait" element
     */
    int getDurationOfElectiveWait();
    
    /**
     * Gets (as xml) the "DurationOfElectiveWait" element
     */
    uk.nhs.nhsia.datastandards.ecds.DurationOfElectiveWaitType xgetDurationOfElectiveWait();
    
    /**
     * True if has "DurationOfElectiveWait" element
     */
    boolean isSetDurationOfElectiveWait();
    
    /**
     * Sets the "DurationOfElectiveWait" element
     */
    void setDurationOfElectiveWait(int durationOfElectiveWait);
    
    /**
     * Sets (as xml) the "DurationOfElectiveWait" element
     */
    void xsetDurationOfElectiveWait(uk.nhs.nhsia.datastandards.ecds.DurationOfElectiveWaitType durationOfElectiveWait);
    
    /**
     * Unsets the "DurationOfElectiveWait" element
     */
    void unsetDurationOfElectiveWait();
    
    /**
     * Gets the "IntendedManagementCode" element
     */
    uk.nhs.nhsia.datastandards.ecds.IntendedManagementCodeType.Enum getIntendedManagementCode();
    
    /**
     * Gets (as xml) the "IntendedManagementCode" element
     */
    uk.nhs.nhsia.datastandards.ecds.IntendedManagementCodeType xgetIntendedManagementCode();
    
    /**
     * True if has "IntendedManagementCode" element
     */
    boolean isSetIntendedManagementCode();
    
    /**
     * Sets the "IntendedManagementCode" element
     */
    void setIntendedManagementCode(uk.nhs.nhsia.datastandards.ecds.IntendedManagementCodeType.Enum intendedManagementCode);
    
    /**
     * Sets (as xml) the "IntendedManagementCode" element
     */
    void xsetIntendedManagementCode(uk.nhs.nhsia.datastandards.ecds.IntendedManagementCodeType intendedManagementCode);
    
    /**
     * Unsets the "IntendedManagementCode" element
     */
    void unsetIntendedManagementCode();
    
    /**
     * Gets the "DecidedToAdmitDate" element
     */
    java.util.Calendar getDecidedToAdmitDate();
    
    /**
     * Gets (as xml) the "DecidedToAdmitDate" element
     */
    uk.nhs.nhsia.datastandards.ecds.DecidedToAdmitDateType xgetDecidedToAdmitDate();
    
    /**
     * True if has "DecidedToAdmitDate" element
     */
    boolean isSetDecidedToAdmitDate();
    
    /**
     * Sets the "DecidedToAdmitDate" element
     */
    void setDecidedToAdmitDate(java.util.Calendar decidedToAdmitDate);
    
    /**
     * Sets (as xml) the "DecidedToAdmitDate" element
     */
    void xsetDecidedToAdmitDate(uk.nhs.nhsia.datastandards.ecds.DecidedToAdmitDateType decidedToAdmitDate);
    
    /**
     * Unsets the "DecidedToAdmitDate" element
     */
    void unsetDecidedToAdmitDate();
    
    /**
     * Gets the "EarliestReasonableOfferDate" element
     */
    java.util.Calendar getEarliestReasonableOfferDate();
    
    /**
     * Gets (as xml) the "EarliestReasonableOfferDate" element
     */
    uk.nhs.nhsia.datastandards.ecds.EarliestReasonableOfferDateType xgetEarliestReasonableOfferDate();
    
    /**
     * True if has "EarliestReasonableOfferDate" element
     */
    boolean isSetEarliestReasonableOfferDate();
    
    /**
     * Sets the "EarliestReasonableOfferDate" element
     */
    void setEarliestReasonableOfferDate(java.util.Calendar earliestReasonableOfferDate);
    
    /**
     * Sets (as xml) the "EarliestReasonableOfferDate" element
     */
    void xsetEarliestReasonableOfferDate(uk.nhs.nhsia.datastandards.ecds.EarliestReasonableOfferDateType earliestReasonableOfferDate);
    
    /**
     * Unsets the "EarliestReasonableOfferDate" element
     */
    void unsetEarliestReasonableOfferDate();
    
    /**
     * A factory class with static methods for creating instances
     * of this type.
     */
    
    public static final class Factory
    {
        public static uk.nhs.nhsia.datastandards.ecds.EALEntryAPCReferenceStructure newInstance() {
          return (uk.nhs.nhsia.datastandards.ecds.EALEntryAPCReferenceStructure) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().newInstance( type, null ); }
        
        public static uk.nhs.nhsia.datastandards.ecds.EALEntryAPCReferenceStructure newInstance(org.apache.xmlbeans.XmlOptions options) {
          return (uk.nhs.nhsia.datastandards.ecds.EALEntryAPCReferenceStructure) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().newInstance( type, options ); }
        
        /** @param xmlAsString the string value to parse */
        public static uk.nhs.nhsia.datastandards.ecds.EALEntryAPCReferenceStructure parse(java.lang.String xmlAsString) throws org.apache.xmlbeans.XmlException {
          return (uk.nhs.nhsia.datastandards.ecds.EALEntryAPCReferenceStructure) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( xmlAsString, type, null ); }
        
        public static uk.nhs.nhsia.datastandards.ecds.EALEntryAPCReferenceStructure parse(java.lang.String xmlAsString, org.apache.xmlbeans.XmlOptions options) throws org.apache.xmlbeans.XmlException {
          return (uk.nhs.nhsia.datastandards.ecds.EALEntryAPCReferenceStructure) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( xmlAsString, type, options ); }
        
        /** @param file the file from which to load an xml document */
        public static uk.nhs.nhsia.datastandards.ecds.EALEntryAPCReferenceStructure parse(java.io.File file) throws org.apache.xmlbeans.XmlException, java.io.IOException {
          return (uk.nhs.nhsia.datastandards.ecds.EALEntryAPCReferenceStructure) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( file, type, null ); }
        
        public static uk.nhs.nhsia.datastandards.ecds.EALEntryAPCReferenceStructure parse(java.io.File file, org.apache.xmlbeans.XmlOptions options) throws org.apache.xmlbeans.XmlException, java.io.IOException {
          return (uk.nhs.nhsia.datastandards.ecds.EALEntryAPCReferenceStructure) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( file, type, options ); }
        
        public static uk.nhs.nhsia.datastandards.ecds.EALEntryAPCReferenceStructure parse(java.net.URL u) throws org.apache.xmlbeans.XmlException, java.io.IOException {
          return (uk.nhs.nhsia.datastandards.ecds.EALEntryAPCReferenceStructure) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( u, type, null ); }
        
        public static uk.nhs.nhsia.datastandards.ecds.EALEntryAPCReferenceStructure parse(java.net.URL u, org.apache.xmlbeans.XmlOptions options) throws org.apache.xmlbeans.XmlException, java.io.IOException {
          return (uk.nhs.nhsia.datastandards.ecds.EALEntryAPCReferenceStructure) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( u, type, options ); }
        
        public static uk.nhs.nhsia.datastandards.ecds.EALEntryAPCReferenceStructure parse(java.io.InputStream is) throws org.apache.xmlbeans.XmlException, java.io.IOException {
          return (uk.nhs.nhsia.datastandards.ecds.EALEntryAPCReferenceStructure) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( is, type, null ); }
        
        public static uk.nhs.nhsia.datastandards.ecds.EALEntryAPCReferenceStructure parse(java.io.InputStream is, org.apache.xmlbeans.XmlOptions options) throws org.apache.xmlbeans.XmlException, java.io.IOException {
          return (uk.nhs.nhsia.datastandards.ecds.EALEntryAPCReferenceStructure) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( is, type, options ); }
        
        public static uk.nhs.nhsia.datastandards.ecds.EALEntryAPCReferenceStructure parse(java.io.Reader r) throws org.apache.xmlbeans.XmlException, java.io.IOException {
          return (uk.nhs.nhsia.datastandards.ecds.EALEntryAPCReferenceStructure) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( r, type, null ); }
        
        public static uk.nhs.nhsia.datastandards.ecds.EALEntryAPCReferenceStructure parse(java.io.Reader r, org.apache.xmlbeans.XmlOptions options) throws org.apache.xmlbeans.XmlException, java.io.IOException {
          return (uk.nhs.nhsia.datastandards.ecds.EALEntryAPCReferenceStructure) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( r, type, options ); }
        
        public static uk.nhs.nhsia.datastandards.ecds.EALEntryAPCReferenceStructure parse(javax.xml.stream.XMLStreamReader sr) throws org.apache.xmlbeans.XmlException {
          return (uk.nhs.nhsia.datastandards.ecds.EALEntryAPCReferenceStructure) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( sr, type, null ); }
        
        public static uk.nhs.nhsia.datastandards.ecds.EALEntryAPCReferenceStructure parse(javax.xml.stream.XMLStreamReader sr, org.apache.xmlbeans.XmlOptions options) throws org.apache.xmlbeans.XmlException {
          return (uk.nhs.nhsia.datastandards.ecds.EALEntryAPCReferenceStructure) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( sr, type, options ); }
        
        public static uk.nhs.nhsia.datastandards.ecds.EALEntryAPCReferenceStructure parse(org.w3c.dom.Node node) throws org.apache.xmlbeans.XmlException {
          return (uk.nhs.nhsia.datastandards.ecds.EALEntryAPCReferenceStructure) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( node, type, null ); }
        
        public static uk.nhs.nhsia.datastandards.ecds.EALEntryAPCReferenceStructure parse(org.w3c.dom.Node node, org.apache.xmlbeans.XmlOptions options) throws org.apache.xmlbeans.XmlException {
          return (uk.nhs.nhsia.datastandards.ecds.EALEntryAPCReferenceStructure) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( node, type, options ); }
        
        /** @deprecated {@link org.apache.xmlbeans.xml.stream.XMLInputStream} */
        public static uk.nhs.nhsia.datastandards.ecds.EALEntryAPCReferenceStructure parse(org.apache.xmlbeans.xml.stream.XMLInputStream xis) throws org.apache.xmlbeans.XmlException, org.apache.xmlbeans.xml.stream.XMLStreamException {
          return (uk.nhs.nhsia.datastandards.ecds.EALEntryAPCReferenceStructure) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( xis, type, null ); }
        
        /** @deprecated {@link org.apache.xmlbeans.xml.stream.XMLInputStream} */
        public static uk.nhs.nhsia.datastandards.ecds.EALEntryAPCReferenceStructure parse(org.apache.xmlbeans.xml.stream.XMLInputStream xis, org.apache.xmlbeans.XmlOptions options) throws org.apache.xmlbeans.XmlException, org.apache.xmlbeans.xml.stream.XMLStreamException {
          return (uk.nhs.nhsia.datastandards.ecds.EALEntryAPCReferenceStructure) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( xis, type, options ); }
        
        /** @deprecated {@link org.apache.xmlbeans.xml.stream.XMLInputStream} */
        public static org.apache.xmlbeans.xml.stream.XMLInputStream newValidatingXMLInputStream(org.apache.xmlbeans.xml.stream.XMLInputStream xis) throws org.apache.xmlbeans.XmlException, org.apache.xmlbeans.xml.stream.XMLStreamException {
          return org.apache.xmlbeans.XmlBeans.getContextTypeLoader().newValidatingXMLInputStream( xis, type, null ); }
        
        /** @deprecated {@link org.apache.xmlbeans.xml.stream.XMLInputStream} */
        public static org.apache.xmlbeans.xml.stream.XMLInputStream newValidatingXMLInputStream(org.apache.xmlbeans.xml.stream.XMLInputStream xis, org.apache.xmlbeans.XmlOptions options) throws org.apache.xmlbeans.XmlException, org.apache.xmlbeans.xml.stream.XMLStreamException {
          return org.apache.xmlbeans.XmlBeans.getContextTypeLoader().newValidatingXMLInputStream( xis, type, options ); }
        
        private Factory() { } // No instance of this class allowed
    }
}
