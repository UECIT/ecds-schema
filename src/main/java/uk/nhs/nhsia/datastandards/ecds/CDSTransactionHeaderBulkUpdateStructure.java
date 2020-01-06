/*
 * XML Type:  CDSTransactionHeader_BulkUpdate_Structure
 * Namespace: http://www.nhsia.nhs.uk/DataStandards/XMLschema/CDS/ns
 * Java type: uk.nhs.nhsia.datastandards.ecds.CDSTransactionHeaderBulkUpdateStructure
 *
 * Automatically generated - do not modify.
 */
package uk.nhs.nhsia.datastandards.ecds;


/**
 * An XML CDSTransactionHeader_BulkUpdate_Structure(@http://www.nhsia.nhs.uk/DataStandards/XMLschema/CDS/ns).
 *
 * This is a complex type.
 */
public interface CDSTransactionHeaderBulkUpdateStructure extends org.apache.xmlbeans.XmlObject
{
    public static final org.apache.xmlbeans.SchemaType type = (org.apache.xmlbeans.SchemaType)
        org.apache.xmlbeans.XmlBeans.typeSystemForClassLoader(CDSTransactionHeaderBulkUpdateStructure.class.getClassLoader(), "schemaorg_apache_xmlbeans.system.s30C1180FF47174E0C8A992A2D657328B").resolveHandle("cdstransactionheaderbulkupdatestructure9ccetype");
    
    /**
     * Gets the "CDSTypeCode" element
     */
    uk.nhs.nhsia.datastandards.ecds.CDSTypeCodeType.Enum getCDSTypeCode();
    
    /**
     * Gets (as xml) the "CDSTypeCode" element
     */
    uk.nhs.nhsia.datastandards.ecds.CDSTypeCodeType xgetCDSTypeCode();
    
    /**
     * Sets the "CDSTypeCode" element
     */
    void setCDSTypeCode(uk.nhs.nhsia.datastandards.ecds.CDSTypeCodeType.Enum cdsTypeCode);
    
    /**
     * Sets (as xml) the "CDSTypeCode" element
     */
    void xsetCDSTypeCode(uk.nhs.nhsia.datastandards.ecds.CDSTypeCodeType cdsTypeCode);
    
    /**
     * Gets the "CDSProtocolIdentifierCode" element
     */
    uk.nhs.nhsia.datastandards.ecds.CDSProtocolIdentifierCodeType.Enum getCDSProtocolIdentifierCode();
    
    /**
     * Gets (as xml) the "CDSProtocolIdentifierCode" element
     */
    uk.nhs.nhsia.datastandards.ecds.CDSProtocolIdentifierCodeType xgetCDSProtocolIdentifierCode();
    
    /**
     * Sets the "CDSProtocolIdentifierCode" element
     */
    void setCDSProtocolIdentifierCode(uk.nhs.nhsia.datastandards.ecds.CDSProtocolIdentifierCodeType.Enum cdsProtocolIdentifierCode);
    
    /**
     * Sets (as xml) the "CDSProtocolIdentifierCode" element
     */
    void xsetCDSProtocolIdentifierCode(uk.nhs.nhsia.datastandards.ecds.CDSProtocolIdentifierCodeType cdsProtocolIdentifierCode);
    
    /**
     * Gets the "CDSUniqueIdentifier" element
     */
    java.lang.String getCDSUniqueIdentifier();
    
    /**
     * Gets (as xml) the "CDSUniqueIdentifier" element
     */
    uk.nhs.nhsia.datastandards.ecds.CDSUniqueIdentifierType xgetCDSUniqueIdentifier();
    
    /**
     * True if has "CDSUniqueIdentifier" element
     */
    boolean isSetCDSUniqueIdentifier();
    
    /**
     * Sets the "CDSUniqueIdentifier" element
     */
    void setCDSUniqueIdentifier(java.lang.String cdsUniqueIdentifier);
    
    /**
     * Sets (as xml) the "CDSUniqueIdentifier" element
     */
    void xsetCDSUniqueIdentifier(uk.nhs.nhsia.datastandards.ecds.CDSUniqueIdentifierType cdsUniqueIdentifier);
    
    /**
     * Unsets the "CDSUniqueIdentifier" element
     */
    void unsetCDSUniqueIdentifier();
    
    /**
     * Gets the "CDSBulkReplacementGroupCode" element
     */
    uk.nhs.nhsia.datastandards.ecds.CDSBulkReplacementGroupCodeType.Enum getCDSBulkReplacementGroupCode();
    
    /**
     * Gets (as xml) the "CDSBulkReplacementGroupCode" element
     */
    uk.nhs.nhsia.datastandards.ecds.CDSBulkReplacementGroupCodeType xgetCDSBulkReplacementGroupCode();
    
    /**
     * Sets the "CDSBulkReplacementGroupCode" element
     */
    void setCDSBulkReplacementGroupCode(uk.nhs.nhsia.datastandards.ecds.CDSBulkReplacementGroupCodeType.Enum cdsBulkReplacementGroupCode);
    
    /**
     * Sets (as xml) the "CDSBulkReplacementGroupCode" element
     */
    void xsetCDSBulkReplacementGroupCode(uk.nhs.nhsia.datastandards.ecds.CDSBulkReplacementGroupCodeType cdsBulkReplacementGroupCode);
    
    /**
     * Gets the "CDSExtractDate" element
     */
    java.util.Calendar getCDSExtractDate();
    
    /**
     * Gets (as xml) the "CDSExtractDate" element
     */
    uk.nhs.nhsia.datastandards.ecds.CDSExtractDateType xgetCDSExtractDate();
    
    /**
     * Sets the "CDSExtractDate" element
     */
    void setCDSExtractDate(java.util.Calendar cdsExtractDate);
    
    /**
     * Sets (as xml) the "CDSExtractDate" element
     */
    void xsetCDSExtractDate(uk.nhs.nhsia.datastandards.ecds.CDSExtractDateType cdsExtractDate);
    
    /**
     * Gets the "CDSExtractTime" element
     */
    java.util.Calendar getCDSExtractTime();
    
    /**
     * Gets (as xml) the "CDSExtractTime" element
     */
    uk.nhs.nhsia.datastandards.ecds.CDSExtractTimeType xgetCDSExtractTime();
    
    /**
     * Sets the "CDSExtractTime" element
     */
    void setCDSExtractTime(java.util.Calendar cdsExtractTime);
    
    /**
     * Sets (as xml) the "CDSExtractTime" element
     */
    void xsetCDSExtractTime(uk.nhs.nhsia.datastandards.ecds.CDSExtractTimeType cdsExtractTime);
    
    /**
     * Gets the "CDSReportPeriodStartDate" element
     */
    java.util.Calendar getCDSReportPeriodStartDate();
    
    /**
     * Gets (as xml) the "CDSReportPeriodStartDate" element
     */
    uk.nhs.nhsia.datastandards.ecds.CDSReportPeriodStartDateType xgetCDSReportPeriodStartDate();
    
    /**
     * Sets the "CDSReportPeriodStartDate" element
     */
    void setCDSReportPeriodStartDate(java.util.Calendar cdsReportPeriodStartDate);
    
    /**
     * Sets (as xml) the "CDSReportPeriodStartDate" element
     */
    void xsetCDSReportPeriodStartDate(uk.nhs.nhsia.datastandards.ecds.CDSReportPeriodStartDateType cdsReportPeriodStartDate);
    
    /**
     * Gets the "CDSReportPeriodEndDate" element
     */
    java.util.Calendar getCDSReportPeriodEndDate();
    
    /**
     * Gets (as xml) the "CDSReportPeriodEndDate" element
     */
    uk.nhs.nhsia.datastandards.ecds.CDSReportPeriodEndDateType xgetCDSReportPeriodEndDate();
    
    /**
     * Sets the "CDSReportPeriodEndDate" element
     */
    void setCDSReportPeriodEndDate(java.util.Calendar cdsReportPeriodEndDate);
    
    /**
     * Sets (as xml) the "CDSReportPeriodEndDate" element
     */
    void xsetCDSReportPeriodEndDate(uk.nhs.nhsia.datastandards.ecds.CDSReportPeriodEndDateType cdsReportPeriodEndDate);
    
    /**
     * Gets the "CDSActivityDate" element
     */
    java.util.Calendar getCDSActivityDate();
    
    /**
     * Gets (as xml) the "CDSActivityDate" element
     */
    uk.nhs.nhsia.datastandards.ecds.CDSActivityDateType xgetCDSActivityDate();
    
    /**
     * Sets the "CDSActivityDate" element
     */
    void setCDSActivityDate(java.util.Calendar cdsActivityDate);
    
    /**
     * Sets (as xml) the "CDSActivityDate" element
     */
    void xsetCDSActivityDate(uk.nhs.nhsia.datastandards.ecds.CDSActivityDateType cdsActivityDate);
    
    /**
     * Gets the "OrganisationCode_CDSSenderIdentity" element
     */
    java.lang.String getOrganisationCodeCDSSenderIdentity();
    
    /**
     * Gets (as xml) the "OrganisationCode_CDSSenderIdentity" element
     */
    uk.nhs.nhsia.datastandards.ecds.CDSSenderCodeType xgetOrganisationCodeCDSSenderIdentity();
    
    /**
     * Sets the "OrganisationCode_CDSSenderIdentity" element
     */
    void setOrganisationCodeCDSSenderIdentity(java.lang.String organisationCodeCDSSenderIdentity);
    
    /**
     * Sets (as xml) the "OrganisationCode_CDSSenderIdentity" element
     */
    void xsetOrganisationCodeCDSSenderIdentity(uk.nhs.nhsia.datastandards.ecds.CDSSenderCodeType organisationCodeCDSSenderIdentity);
    
    /**
     * Gets the "OrganisationCode_CDSPrimeRecipientIdentity" element
     */
    java.lang.String getOrganisationCodeCDSPrimeRecipientIdentity();
    
    /**
     * Gets (as xml) the "OrganisationCode_CDSPrimeRecipientIdentity" element
     */
    uk.nhs.nhsia.datastandards.ecds.CDSPrimeRecipientCodeType xgetOrganisationCodeCDSPrimeRecipientIdentity();
    
    /**
     * Sets the "OrganisationCode_CDSPrimeRecipientIdentity" element
     */
    void setOrganisationCodeCDSPrimeRecipientIdentity(java.lang.String organisationCodeCDSPrimeRecipientIdentity);
    
    /**
     * Sets (as xml) the "OrganisationCode_CDSPrimeRecipientIdentity" element
     */
    void xsetOrganisationCodeCDSPrimeRecipientIdentity(uk.nhs.nhsia.datastandards.ecds.CDSPrimeRecipientCodeType organisationCodeCDSPrimeRecipientIdentity);
    
    /**
     * Gets array of all "OrganisationCode_CDSCopyRecipientIdentity" elements
     */
    java.lang.String[] getOrganisationCodeCDSCopyRecipientIdentityArray();
    
    /**
     * Gets ith "OrganisationCode_CDSCopyRecipientIdentity" element
     */
    java.lang.String getOrganisationCodeCDSCopyRecipientIdentityArray(int i);
    
    /**
     * Gets (as xml) array of all "OrganisationCode_CDSCopyRecipientIdentity" elements
     */
    uk.nhs.nhsia.datastandards.ecds.CDSCopyRecipientCodeType[] xgetOrganisationCodeCDSCopyRecipientIdentityArray();
    
    /**
     * Gets (as xml) ith "OrganisationCode_CDSCopyRecipientIdentity" element
     */
    uk.nhs.nhsia.datastandards.ecds.CDSCopyRecipientCodeType xgetOrganisationCodeCDSCopyRecipientIdentityArray(int i);
    
    /**
     * Returns number of "OrganisationCode_CDSCopyRecipientIdentity" element
     */
    int sizeOfOrganisationCodeCDSCopyRecipientIdentityArray();
    
    /**
     * Sets array of all "OrganisationCode_CDSCopyRecipientIdentity" element
     */
    void setOrganisationCodeCDSCopyRecipientIdentityArray(java.lang.String[] organisationCodeCDSCopyRecipientIdentityArray);
    
    /**
     * Sets ith "OrganisationCode_CDSCopyRecipientIdentity" element
     */
    void setOrganisationCodeCDSCopyRecipientIdentityArray(int i, java.lang.String organisationCodeCDSCopyRecipientIdentity);
    
    /**
     * Sets (as xml) array of all "OrganisationCode_CDSCopyRecipientIdentity" element
     */
    void xsetOrganisationCodeCDSCopyRecipientIdentityArray(uk.nhs.nhsia.datastandards.ecds.CDSCopyRecipientCodeType[] organisationCodeCDSCopyRecipientIdentityArray);
    
    /**
     * Sets (as xml) ith "OrganisationCode_CDSCopyRecipientIdentity" element
     */
    void xsetOrganisationCodeCDSCopyRecipientIdentityArray(int i, uk.nhs.nhsia.datastandards.ecds.CDSCopyRecipientCodeType organisationCodeCDSCopyRecipientIdentity);
    
    /**
     * Inserts the value as the ith "OrganisationCode_CDSCopyRecipientIdentity" element
     */
    void insertOrganisationCodeCDSCopyRecipientIdentity(int i, java.lang.String organisationCodeCDSCopyRecipientIdentity);
    
    /**
     * Appends the value as the last "OrganisationCode_CDSCopyRecipientIdentity" element
     */
    void addOrganisationCodeCDSCopyRecipientIdentity(java.lang.String organisationCodeCDSCopyRecipientIdentity);
    
    /**
     * Inserts and returns a new empty value (as xml) as the ith "OrganisationCode_CDSCopyRecipientIdentity" element
     */
    uk.nhs.nhsia.datastandards.ecds.CDSCopyRecipientCodeType insertNewOrganisationCodeCDSCopyRecipientIdentity(int i);
    
    /**
     * Appends and returns a new empty value (as xml) as the last "OrganisationCode_CDSCopyRecipientIdentity" element
     */
    uk.nhs.nhsia.datastandards.ecds.CDSCopyRecipientCodeType addNewOrganisationCodeCDSCopyRecipientIdentity();
    
    /**
     * Removes the ith "OrganisationCode_CDSCopyRecipientIdentity" element
     */
    void removeOrganisationCodeCDSCopyRecipientIdentity(int i);
    
    /**
     * A factory class with static methods for creating instances
     * of this type.
     */
    
    public static final class Factory
    {
        public static uk.nhs.nhsia.datastandards.ecds.CDSTransactionHeaderBulkUpdateStructure newInstance() {
          return (uk.nhs.nhsia.datastandards.ecds.CDSTransactionHeaderBulkUpdateStructure) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().newInstance( type, null ); }
        
        public static uk.nhs.nhsia.datastandards.ecds.CDSTransactionHeaderBulkUpdateStructure newInstance(org.apache.xmlbeans.XmlOptions options) {
          return (uk.nhs.nhsia.datastandards.ecds.CDSTransactionHeaderBulkUpdateStructure) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().newInstance( type, options ); }
        
        /** @param xmlAsString the string value to parse */
        public static uk.nhs.nhsia.datastandards.ecds.CDSTransactionHeaderBulkUpdateStructure parse(java.lang.String xmlAsString) throws org.apache.xmlbeans.XmlException {
          return (uk.nhs.nhsia.datastandards.ecds.CDSTransactionHeaderBulkUpdateStructure) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( xmlAsString, type, null ); }
        
        public static uk.nhs.nhsia.datastandards.ecds.CDSTransactionHeaderBulkUpdateStructure parse(java.lang.String xmlAsString, org.apache.xmlbeans.XmlOptions options) throws org.apache.xmlbeans.XmlException {
          return (uk.nhs.nhsia.datastandards.ecds.CDSTransactionHeaderBulkUpdateStructure) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( xmlAsString, type, options ); }
        
        /** @param file the file from which to load an xml document */
        public static uk.nhs.nhsia.datastandards.ecds.CDSTransactionHeaderBulkUpdateStructure parse(java.io.File file) throws org.apache.xmlbeans.XmlException, java.io.IOException {
          return (uk.nhs.nhsia.datastandards.ecds.CDSTransactionHeaderBulkUpdateStructure) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( file, type, null ); }
        
        public static uk.nhs.nhsia.datastandards.ecds.CDSTransactionHeaderBulkUpdateStructure parse(java.io.File file, org.apache.xmlbeans.XmlOptions options) throws org.apache.xmlbeans.XmlException, java.io.IOException {
          return (uk.nhs.nhsia.datastandards.ecds.CDSTransactionHeaderBulkUpdateStructure) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( file, type, options ); }
        
        public static uk.nhs.nhsia.datastandards.ecds.CDSTransactionHeaderBulkUpdateStructure parse(java.net.URL u) throws org.apache.xmlbeans.XmlException, java.io.IOException {
          return (uk.nhs.nhsia.datastandards.ecds.CDSTransactionHeaderBulkUpdateStructure) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( u, type, null ); }
        
        public static uk.nhs.nhsia.datastandards.ecds.CDSTransactionHeaderBulkUpdateStructure parse(java.net.URL u, org.apache.xmlbeans.XmlOptions options) throws org.apache.xmlbeans.XmlException, java.io.IOException {
          return (uk.nhs.nhsia.datastandards.ecds.CDSTransactionHeaderBulkUpdateStructure) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( u, type, options ); }
        
        public static uk.nhs.nhsia.datastandards.ecds.CDSTransactionHeaderBulkUpdateStructure parse(java.io.InputStream is) throws org.apache.xmlbeans.XmlException, java.io.IOException {
          return (uk.nhs.nhsia.datastandards.ecds.CDSTransactionHeaderBulkUpdateStructure) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( is, type, null ); }
        
        public static uk.nhs.nhsia.datastandards.ecds.CDSTransactionHeaderBulkUpdateStructure parse(java.io.InputStream is, org.apache.xmlbeans.XmlOptions options) throws org.apache.xmlbeans.XmlException, java.io.IOException {
          return (uk.nhs.nhsia.datastandards.ecds.CDSTransactionHeaderBulkUpdateStructure) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( is, type, options ); }
        
        public static uk.nhs.nhsia.datastandards.ecds.CDSTransactionHeaderBulkUpdateStructure parse(java.io.Reader r) throws org.apache.xmlbeans.XmlException, java.io.IOException {
          return (uk.nhs.nhsia.datastandards.ecds.CDSTransactionHeaderBulkUpdateStructure) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( r, type, null ); }
        
        public static uk.nhs.nhsia.datastandards.ecds.CDSTransactionHeaderBulkUpdateStructure parse(java.io.Reader r, org.apache.xmlbeans.XmlOptions options) throws org.apache.xmlbeans.XmlException, java.io.IOException {
          return (uk.nhs.nhsia.datastandards.ecds.CDSTransactionHeaderBulkUpdateStructure) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( r, type, options ); }
        
        public static uk.nhs.nhsia.datastandards.ecds.CDSTransactionHeaderBulkUpdateStructure parse(javax.xml.stream.XMLStreamReader sr) throws org.apache.xmlbeans.XmlException {
          return (uk.nhs.nhsia.datastandards.ecds.CDSTransactionHeaderBulkUpdateStructure) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( sr, type, null ); }
        
        public static uk.nhs.nhsia.datastandards.ecds.CDSTransactionHeaderBulkUpdateStructure parse(javax.xml.stream.XMLStreamReader sr, org.apache.xmlbeans.XmlOptions options) throws org.apache.xmlbeans.XmlException {
          return (uk.nhs.nhsia.datastandards.ecds.CDSTransactionHeaderBulkUpdateStructure) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( sr, type, options ); }
        
        public static uk.nhs.nhsia.datastandards.ecds.CDSTransactionHeaderBulkUpdateStructure parse(org.w3c.dom.Node node) throws org.apache.xmlbeans.XmlException {
          return (uk.nhs.nhsia.datastandards.ecds.CDSTransactionHeaderBulkUpdateStructure) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( node, type, null ); }
        
        public static uk.nhs.nhsia.datastandards.ecds.CDSTransactionHeaderBulkUpdateStructure parse(org.w3c.dom.Node node, org.apache.xmlbeans.XmlOptions options) throws org.apache.xmlbeans.XmlException {
          return (uk.nhs.nhsia.datastandards.ecds.CDSTransactionHeaderBulkUpdateStructure) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( node, type, options ); }
        
        /** @deprecated {@link org.apache.xmlbeans.xml.stream.XMLInputStream} */
        public static uk.nhs.nhsia.datastandards.ecds.CDSTransactionHeaderBulkUpdateStructure parse(org.apache.xmlbeans.xml.stream.XMLInputStream xis) throws org.apache.xmlbeans.XmlException, org.apache.xmlbeans.xml.stream.XMLStreamException {
          return (uk.nhs.nhsia.datastandards.ecds.CDSTransactionHeaderBulkUpdateStructure) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( xis, type, null ); }
        
        /** @deprecated {@link org.apache.xmlbeans.xml.stream.XMLInputStream} */
        public static uk.nhs.nhsia.datastandards.ecds.CDSTransactionHeaderBulkUpdateStructure parse(org.apache.xmlbeans.xml.stream.XMLInputStream xis, org.apache.xmlbeans.XmlOptions options) throws org.apache.xmlbeans.XmlException, org.apache.xmlbeans.xml.stream.XMLStreamException {
          return (uk.nhs.nhsia.datastandards.ecds.CDSTransactionHeaderBulkUpdateStructure) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( xis, type, options ); }
        
        /** @deprecated {@link org.apache.xmlbeans.xml.stream.XMLInputStream} */
        public static org.apache.xmlbeans.xml.stream.XMLInputStream newValidatingXMLInputStream(org.apache.xmlbeans.xml.stream.XMLInputStream xis) throws org.apache.xmlbeans.XmlException, org.apache.xmlbeans.xml.stream.XMLStreamException {
          return org.apache.xmlbeans.XmlBeans.getContextTypeLoader().newValidatingXMLInputStream( xis, type, null ); }
        
        /** @deprecated {@link org.apache.xmlbeans.xml.stream.XMLInputStream} */
        public static org.apache.xmlbeans.xml.stream.XMLInputStream newValidatingXMLInputStream(org.apache.xmlbeans.xml.stream.XMLInputStream xis, org.apache.xmlbeans.XmlOptions options) throws org.apache.xmlbeans.XmlException, org.apache.xmlbeans.xml.stream.XMLStreamException {
          return org.apache.xmlbeans.XmlBeans.getContextTypeLoader().newValidatingXMLInputStream( xis, type, options ); }
        
        private Factory() { } // No instance of this class allowed
    }
}
