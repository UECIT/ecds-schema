/*
 * XML Type:  OutpatientReferral_Structure
 * Namespace: http://www.nhsia.nhs.uk/DataStandards/XMLschema/CDS/ns
 * Java type: uk.nhs.nhsia.datastandards.ecds.OutpatientReferralStructure
 *
 * Automatically generated - do not modify.
 */
package uk.nhs.nhsia.datastandards.ecds;


/**
 * An XML OutpatientReferral_Structure(@http://www.nhsia.nhs.uk/DataStandards/XMLschema/CDS/ns).
 *
 * This is a complex type.
 */
public interface OutpatientReferralStructure extends org.apache.xmlbeans.XmlObject
{
    public static final org.apache.xmlbeans.SchemaType type = (org.apache.xmlbeans.SchemaType)
        org.apache.xmlbeans.XmlBeans.typeSystemForClassLoader(OutpatientReferralStructure.class.getClassLoader(), "schemaorg_apache_xmlbeans.system.s30C1180FF47174E0C8A992A2D657328B").resolveHandle("outpatientreferralstructure2269type");
    
    /**
     * Gets the "ActivityCharacteristics" element
     */
    uk.nhs.nhsia.datastandards.ecds.OutpatientReferralStructure.ActivityCharacteristics getActivityCharacteristics();
    
    /**
     * True if has "ActivityCharacteristics" element
     */
    boolean isSetActivityCharacteristics();
    
    /**
     * Sets the "ActivityCharacteristics" element
     */
    void setActivityCharacteristics(uk.nhs.nhsia.datastandards.ecds.OutpatientReferralStructure.ActivityCharacteristics activityCharacteristics);
    
    /**
     * Appends and returns a new empty "ActivityCharacteristics" element
     */
    uk.nhs.nhsia.datastandards.ecds.OutpatientReferralStructure.ActivityCharacteristics addNewActivityCharacteristics();
    
    /**
     * Unsets the "ActivityCharacteristics" element
     */
    void unsetActivityCharacteristics();
    
    /**
     * Gets the "Referrer" element
     */
    uk.nhs.nhsia.datastandards.ecds.ReferrerStructure getReferrer();
    
    /**
     * True if has "Referrer" element
     */
    boolean isSetReferrer();
    
    /**
     * Sets the "Referrer" element
     */
    void setReferrer(uk.nhs.nhsia.datastandards.ecds.ReferrerStructure referrer);
    
    /**
     * Appends and returns a new empty "Referrer" element
     */
    uk.nhs.nhsia.datastandards.ecds.ReferrerStructure addNewReferrer();
    
    /**
     * Unsets the "Referrer" element
     */
    void unsetReferrer();
    
    /**
     * An XML ActivityCharacteristics(@http://www.nhsia.nhs.uk/DataStandards/XMLschema/CDS/ns).
     *
     * This is a complex type.
     */
    public interface ActivityCharacteristics extends org.apache.xmlbeans.XmlObject
    {
        public static final org.apache.xmlbeans.SchemaType type = (org.apache.xmlbeans.SchemaType)
            org.apache.xmlbeans.XmlBeans.typeSystemForClassLoader(ActivityCharacteristics.class.getClassLoader(), "schemaorg_apache_xmlbeans.system.s30C1180FF47174E0C8A992A2D657328B").resolveHandle("activitycharacteristics801eelemtype");
        
        /**
         * Gets the "PriorityTypeCode" element
         */
        uk.nhs.nhsia.datastandards.ecds.PriorityTypeCodeType.Enum getPriorityTypeCode();
        
        /**
         * Gets (as xml) the "PriorityTypeCode" element
         */
        uk.nhs.nhsia.datastandards.ecds.PriorityTypeCodeType xgetPriorityTypeCode();
        
        /**
         * True if has "PriorityTypeCode" element
         */
        boolean isSetPriorityTypeCode();
        
        /**
         * Sets the "PriorityTypeCode" element
         */
        void setPriorityTypeCode(uk.nhs.nhsia.datastandards.ecds.PriorityTypeCodeType.Enum priorityTypeCode);
        
        /**
         * Sets (as xml) the "PriorityTypeCode" element
         */
        void xsetPriorityTypeCode(uk.nhs.nhsia.datastandards.ecds.PriorityTypeCodeType priorityTypeCode);
        
        /**
         * Unsets the "PriorityTypeCode" element
         */
        void unsetPriorityTypeCode();
        
        /**
         * Gets the "ServiceTypeRequestedCode" element
         */
        uk.nhs.nhsia.datastandards.ecds.ServiceTypeRequestedCodeType.Enum getServiceTypeRequestedCode();
        
        /**
         * Gets (as xml) the "ServiceTypeRequestedCode" element
         */
        uk.nhs.nhsia.datastandards.ecds.ServiceTypeRequestedCodeType xgetServiceTypeRequestedCode();
        
        /**
         * True if has "ServiceTypeRequestedCode" element
         */
        boolean isSetServiceTypeRequestedCode();
        
        /**
         * Sets the "ServiceTypeRequestedCode" element
         */
        void setServiceTypeRequestedCode(uk.nhs.nhsia.datastandards.ecds.ServiceTypeRequestedCodeType.Enum serviceTypeRequestedCode);
        
        /**
         * Sets (as xml) the "ServiceTypeRequestedCode" element
         */
        void xsetServiceTypeRequestedCode(uk.nhs.nhsia.datastandards.ecds.ServiceTypeRequestedCodeType serviceTypeRequestedCode);
        
        /**
         * Unsets the "ServiceTypeRequestedCode" element
         */
        void unsetServiceTypeRequestedCode();
        
        /**
         * Gets the "SourceOfReferralForOut_Patients" element
         */
        uk.nhs.nhsia.datastandards.ecds.SourceOfReferralForOutPatientsType.Enum getSourceOfReferralForOutPatients();
        
        /**
         * Gets (as xml) the "SourceOfReferralForOut_Patients" element
         */
        uk.nhs.nhsia.datastandards.ecds.SourceOfReferralForOutPatientsType xgetSourceOfReferralForOutPatients();
        
        /**
         * True if has "SourceOfReferralForOut_Patients" element
         */
        boolean isSetSourceOfReferralForOutPatients();
        
        /**
         * Sets the "SourceOfReferralForOut_Patients" element
         */
        void setSourceOfReferralForOutPatients(uk.nhs.nhsia.datastandards.ecds.SourceOfReferralForOutPatientsType.Enum sourceOfReferralForOutPatients);
        
        /**
         * Sets (as xml) the "SourceOfReferralForOut_Patients" element
         */
        void xsetSourceOfReferralForOutPatients(uk.nhs.nhsia.datastandards.ecds.SourceOfReferralForOutPatientsType sourceOfReferralForOutPatients);
        
        /**
         * Unsets the "SourceOfReferralForOut_Patients" element
         */
        void unsetSourceOfReferralForOutPatients();
        
        /**
         * Gets the "ReferralRequestReceivedDate" element
         */
        java.util.Calendar getReferralRequestReceivedDate();
        
        /**
         * Gets (as xml) the "ReferralRequestReceivedDate" element
         */
        uk.nhs.nhsia.datastandards.ecds.ReferralRequestReceivedDateType xgetReferralRequestReceivedDate();
        
        /**
         * True if has "ReferralRequestReceivedDate" element
         */
        boolean isSetReferralRequestReceivedDate();
        
        /**
         * Sets the "ReferralRequestReceivedDate" element
         */
        void setReferralRequestReceivedDate(java.util.Calendar referralRequestReceivedDate);
        
        /**
         * Sets (as xml) the "ReferralRequestReceivedDate" element
         */
        void xsetReferralRequestReceivedDate(uk.nhs.nhsia.datastandards.ecds.ReferralRequestReceivedDateType referralRequestReceivedDate);
        
        /**
         * Unsets the "ReferralRequestReceivedDate" element
         */
        void unsetReferralRequestReceivedDate();
        
        /**
         * Gets the "DirectAccessReferralIndicator" element
         */
        uk.nhs.nhsia.datastandards.ecds.DirectAccessReferralIndicatorType.Enum getDirectAccessReferralIndicator();
        
        /**
         * Gets (as xml) the "DirectAccessReferralIndicator" element
         */
        uk.nhs.nhsia.datastandards.ecds.DirectAccessReferralIndicatorType xgetDirectAccessReferralIndicator();
        
        /**
         * True if has "DirectAccessReferralIndicator" element
         */
        boolean isSetDirectAccessReferralIndicator();
        
        /**
         * Sets the "DirectAccessReferralIndicator" element
         */
        void setDirectAccessReferralIndicator(uk.nhs.nhsia.datastandards.ecds.DirectAccessReferralIndicatorType.Enum directAccessReferralIndicator);
        
        /**
         * Sets (as xml) the "DirectAccessReferralIndicator" element
         */
        void xsetDirectAccessReferralIndicator(uk.nhs.nhsia.datastandards.ecds.DirectAccessReferralIndicatorType directAccessReferralIndicator);
        
        /**
         * Unsets the "DirectAccessReferralIndicator" element
         */
        void unsetDirectAccessReferralIndicator();
        
        /**
         * A factory class with static methods for creating instances
         * of this type.
         */
        
        public static final class Factory
        {
            public static uk.nhs.nhsia.datastandards.ecds.OutpatientReferralStructure.ActivityCharacteristics newInstance() {
              return (uk.nhs.nhsia.datastandards.ecds.OutpatientReferralStructure.ActivityCharacteristics) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().newInstance( type, null ); }
            
            public static uk.nhs.nhsia.datastandards.ecds.OutpatientReferralStructure.ActivityCharacteristics newInstance(org.apache.xmlbeans.XmlOptions options) {
              return (uk.nhs.nhsia.datastandards.ecds.OutpatientReferralStructure.ActivityCharacteristics) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().newInstance( type, options ); }
            
            private Factory() { } // No instance of this class allowed
        }
    }
    
    /**
     * A factory class with static methods for creating instances
     * of this type.
     */
    
    public static final class Factory
    {
        public static uk.nhs.nhsia.datastandards.ecds.OutpatientReferralStructure newInstance() {
          return (uk.nhs.nhsia.datastandards.ecds.OutpatientReferralStructure) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().newInstance( type, null ); }
        
        public static uk.nhs.nhsia.datastandards.ecds.OutpatientReferralStructure newInstance(org.apache.xmlbeans.XmlOptions options) {
          return (uk.nhs.nhsia.datastandards.ecds.OutpatientReferralStructure) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().newInstance( type, options ); }
        
        /** @param xmlAsString the string value to parse */
        public static uk.nhs.nhsia.datastandards.ecds.OutpatientReferralStructure parse(java.lang.String xmlAsString) throws org.apache.xmlbeans.XmlException {
          return (uk.nhs.nhsia.datastandards.ecds.OutpatientReferralStructure) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( xmlAsString, type, null ); }
        
        public static uk.nhs.nhsia.datastandards.ecds.OutpatientReferralStructure parse(java.lang.String xmlAsString, org.apache.xmlbeans.XmlOptions options) throws org.apache.xmlbeans.XmlException {
          return (uk.nhs.nhsia.datastandards.ecds.OutpatientReferralStructure) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( xmlAsString, type, options ); }
        
        /** @param file the file from which to load an xml document */
        public static uk.nhs.nhsia.datastandards.ecds.OutpatientReferralStructure parse(java.io.File file) throws org.apache.xmlbeans.XmlException, java.io.IOException {
          return (uk.nhs.nhsia.datastandards.ecds.OutpatientReferralStructure) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( file, type, null ); }
        
        public static uk.nhs.nhsia.datastandards.ecds.OutpatientReferralStructure parse(java.io.File file, org.apache.xmlbeans.XmlOptions options) throws org.apache.xmlbeans.XmlException, java.io.IOException {
          return (uk.nhs.nhsia.datastandards.ecds.OutpatientReferralStructure) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( file, type, options ); }
        
        public static uk.nhs.nhsia.datastandards.ecds.OutpatientReferralStructure parse(java.net.URL u) throws org.apache.xmlbeans.XmlException, java.io.IOException {
          return (uk.nhs.nhsia.datastandards.ecds.OutpatientReferralStructure) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( u, type, null ); }
        
        public static uk.nhs.nhsia.datastandards.ecds.OutpatientReferralStructure parse(java.net.URL u, org.apache.xmlbeans.XmlOptions options) throws org.apache.xmlbeans.XmlException, java.io.IOException {
          return (uk.nhs.nhsia.datastandards.ecds.OutpatientReferralStructure) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( u, type, options ); }
        
        public static uk.nhs.nhsia.datastandards.ecds.OutpatientReferralStructure parse(java.io.InputStream is) throws org.apache.xmlbeans.XmlException, java.io.IOException {
          return (uk.nhs.nhsia.datastandards.ecds.OutpatientReferralStructure) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( is, type, null ); }
        
        public static uk.nhs.nhsia.datastandards.ecds.OutpatientReferralStructure parse(java.io.InputStream is, org.apache.xmlbeans.XmlOptions options) throws org.apache.xmlbeans.XmlException, java.io.IOException {
          return (uk.nhs.nhsia.datastandards.ecds.OutpatientReferralStructure) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( is, type, options ); }
        
        public static uk.nhs.nhsia.datastandards.ecds.OutpatientReferralStructure parse(java.io.Reader r) throws org.apache.xmlbeans.XmlException, java.io.IOException {
          return (uk.nhs.nhsia.datastandards.ecds.OutpatientReferralStructure) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( r, type, null ); }
        
        public static uk.nhs.nhsia.datastandards.ecds.OutpatientReferralStructure parse(java.io.Reader r, org.apache.xmlbeans.XmlOptions options) throws org.apache.xmlbeans.XmlException, java.io.IOException {
          return (uk.nhs.nhsia.datastandards.ecds.OutpatientReferralStructure) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( r, type, options ); }
        
        public static uk.nhs.nhsia.datastandards.ecds.OutpatientReferralStructure parse(javax.xml.stream.XMLStreamReader sr) throws org.apache.xmlbeans.XmlException {
          return (uk.nhs.nhsia.datastandards.ecds.OutpatientReferralStructure) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( sr, type, null ); }
        
        public static uk.nhs.nhsia.datastandards.ecds.OutpatientReferralStructure parse(javax.xml.stream.XMLStreamReader sr, org.apache.xmlbeans.XmlOptions options) throws org.apache.xmlbeans.XmlException {
          return (uk.nhs.nhsia.datastandards.ecds.OutpatientReferralStructure) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( sr, type, options ); }
        
        public static uk.nhs.nhsia.datastandards.ecds.OutpatientReferralStructure parse(org.w3c.dom.Node node) throws org.apache.xmlbeans.XmlException {
          return (uk.nhs.nhsia.datastandards.ecds.OutpatientReferralStructure) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( node, type, null ); }
        
        public static uk.nhs.nhsia.datastandards.ecds.OutpatientReferralStructure parse(org.w3c.dom.Node node, org.apache.xmlbeans.XmlOptions options) throws org.apache.xmlbeans.XmlException {
          return (uk.nhs.nhsia.datastandards.ecds.OutpatientReferralStructure) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( node, type, options ); }
        
        /** @deprecated {@link org.apache.xmlbeans.xml.stream.XMLInputStream} */
        public static uk.nhs.nhsia.datastandards.ecds.OutpatientReferralStructure parse(org.apache.xmlbeans.xml.stream.XMLInputStream xis) throws org.apache.xmlbeans.XmlException, org.apache.xmlbeans.xml.stream.XMLStreamException {
          return (uk.nhs.nhsia.datastandards.ecds.OutpatientReferralStructure) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( xis, type, null ); }
        
        /** @deprecated {@link org.apache.xmlbeans.xml.stream.XMLInputStream} */
        public static uk.nhs.nhsia.datastandards.ecds.OutpatientReferralStructure parse(org.apache.xmlbeans.xml.stream.XMLInputStream xis, org.apache.xmlbeans.XmlOptions options) throws org.apache.xmlbeans.XmlException, org.apache.xmlbeans.xml.stream.XMLStreamException {
          return (uk.nhs.nhsia.datastandards.ecds.OutpatientReferralStructure) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( xis, type, options ); }
        
        /** @deprecated {@link org.apache.xmlbeans.xml.stream.XMLInputStream} */
        public static org.apache.xmlbeans.xml.stream.XMLInputStream newValidatingXMLInputStream(org.apache.xmlbeans.xml.stream.XMLInputStream xis) throws org.apache.xmlbeans.XmlException, org.apache.xmlbeans.xml.stream.XMLStreamException {
          return org.apache.xmlbeans.XmlBeans.getContextTypeLoader().newValidatingXMLInputStream( xis, type, null ); }
        
        /** @deprecated {@link org.apache.xmlbeans.xml.stream.XMLInputStream} */
        public static org.apache.xmlbeans.xml.stream.XMLInputStream newValidatingXMLInputStream(org.apache.xmlbeans.xml.stream.XMLInputStream xis, org.apache.xmlbeans.XmlOptions options) throws org.apache.xmlbeans.XmlException, org.apache.xmlbeans.xml.stream.XMLStreamException {
          return org.apache.xmlbeans.XmlBeans.getContextTypeLoader().newValidatingXMLInputStream( xis, type, options ); }
        
        private Factory() { } // No instance of this class allowed
    }
}
