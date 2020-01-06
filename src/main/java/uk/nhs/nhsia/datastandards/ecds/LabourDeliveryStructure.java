/*
 * XML Type:  LabourDelivery_Structure
 * Namespace: http://www.nhsia.nhs.uk/DataStandards/XMLschema/CDS/ns
 * Java type: uk.nhs.nhsia.datastandards.ecds.LabourDeliveryStructure
 *
 * Automatically generated - do not modify.
 */
package uk.nhs.nhsia.datastandards.ecds;


/**
 * An XML LabourDelivery_Structure(@http://www.nhsia.nhs.uk/DataStandards/XMLschema/CDS/ns).
 *
 * This is a complex type.
 */
public interface LabourDeliveryStructure extends org.apache.xmlbeans.XmlObject
{
    public static final org.apache.xmlbeans.SchemaType type = (org.apache.xmlbeans.SchemaType)
        org.apache.xmlbeans.XmlBeans.typeSystemForClassLoader(LabourDeliveryStructure.class.getClassLoader(), "schemaorg_apache_xmlbeans.system.s30C1180FF47174E0C8A992A2D657328B").resolveHandle("labourdeliverystructure86catype");
    
    /**
     * Gets the "ActivityCharacteristics" element
     */
    uk.nhs.nhsia.datastandards.ecds.LabourDeliveryStructure.ActivityCharacteristics getActivityCharacteristics();
    
    /**
     * True if has "ActivityCharacteristics" element
     */
    boolean isSetActivityCharacteristics();
    
    /**
     * Sets the "ActivityCharacteristics" element
     */
    void setActivityCharacteristics(uk.nhs.nhsia.datastandards.ecds.LabourDeliveryStructure.ActivityCharacteristics activityCharacteristics);
    
    /**
     * Appends and returns a new empty "ActivityCharacteristics" element
     */
    uk.nhs.nhsia.datastandards.ecds.LabourDeliveryStructure.ActivityCharacteristics addNewActivityCharacteristics();
    
    /**
     * Unsets the "ActivityCharacteristics" element
     */
    void unsetActivityCharacteristics();
    
    /**
     * An XML ActivityCharacteristics(@http://www.nhsia.nhs.uk/DataStandards/XMLschema/CDS/ns).
     *
     * This is a complex type.
     */
    public interface ActivityCharacteristics extends org.apache.xmlbeans.XmlObject
    {
        public static final org.apache.xmlbeans.SchemaType type = (org.apache.xmlbeans.SchemaType)
            org.apache.xmlbeans.XmlBeans.typeSystemForClassLoader(ActivityCharacteristics.class.getClassLoader(), "schemaorg_apache_xmlbeans.system.s30C1180FF47174E0C8A992A2D657328B").resolveHandle("activitycharacteristics06ffelemtype");
        
        /**
         * Gets the "AnaestheticGivenDuringLabourOrDeliveryCode" element
         */
        uk.nhs.nhsia.datastandards.ecds.AnaestheticGivenDuringLabourOrDeliveryCodeType.Enum getAnaestheticGivenDuringLabourOrDeliveryCode();
        
        /**
         * Gets (as xml) the "AnaestheticGivenDuringLabourOrDeliveryCode" element
         */
        uk.nhs.nhsia.datastandards.ecds.AnaestheticGivenDuringLabourOrDeliveryCodeType xgetAnaestheticGivenDuringLabourOrDeliveryCode();
        
        /**
         * True if has "AnaestheticGivenDuringLabourOrDeliveryCode" element
         */
        boolean isSetAnaestheticGivenDuringLabourOrDeliveryCode();
        
        /**
         * Sets the "AnaestheticGivenDuringLabourOrDeliveryCode" element
         */
        void setAnaestheticGivenDuringLabourOrDeliveryCode(uk.nhs.nhsia.datastandards.ecds.AnaestheticGivenDuringLabourOrDeliveryCodeType.Enum anaestheticGivenDuringLabourOrDeliveryCode);
        
        /**
         * Sets (as xml) the "AnaestheticGivenDuringLabourOrDeliveryCode" element
         */
        void xsetAnaestheticGivenDuringLabourOrDeliveryCode(uk.nhs.nhsia.datastandards.ecds.AnaestheticGivenDuringLabourOrDeliveryCodeType anaestheticGivenDuringLabourOrDeliveryCode);
        
        /**
         * Unsets the "AnaestheticGivenDuringLabourOrDeliveryCode" element
         */
        void unsetAnaestheticGivenDuringLabourOrDeliveryCode();
        
        /**
         * Gets the "AnaestheticGivenPostLabourOrDeliveryCode" element
         */
        uk.nhs.nhsia.datastandards.ecds.AnaestheticGivenPostLabourOrDeliveryCodeType.Enum getAnaestheticGivenPostLabourOrDeliveryCode();
        
        /**
         * Gets (as xml) the "AnaestheticGivenPostLabourOrDeliveryCode" element
         */
        uk.nhs.nhsia.datastandards.ecds.AnaestheticGivenPostLabourOrDeliveryCodeType xgetAnaestheticGivenPostLabourOrDeliveryCode();
        
        /**
         * True if has "AnaestheticGivenPostLabourOrDeliveryCode" element
         */
        boolean isSetAnaestheticGivenPostLabourOrDeliveryCode();
        
        /**
         * Sets the "AnaestheticGivenPostLabourOrDeliveryCode" element
         */
        void setAnaestheticGivenPostLabourOrDeliveryCode(uk.nhs.nhsia.datastandards.ecds.AnaestheticGivenPostLabourOrDeliveryCodeType.Enum anaestheticGivenPostLabourOrDeliveryCode);
        
        /**
         * Sets (as xml) the "AnaestheticGivenPostLabourOrDeliveryCode" element
         */
        void xsetAnaestheticGivenPostLabourOrDeliveryCode(uk.nhs.nhsia.datastandards.ecds.AnaestheticGivenPostLabourOrDeliveryCodeType anaestheticGivenPostLabourOrDeliveryCode);
        
        /**
         * Unsets the "AnaestheticGivenPostLabourOrDeliveryCode" element
         */
        void unsetAnaestheticGivenPostLabourOrDeliveryCode();
        
        /**
         * Gets the "GestationLength_LabourOnset" element
         */
        int getGestationLengthLabourOnset();
        
        /**
         * Gets (as xml) the "GestationLength_LabourOnset" element
         */
        uk.nhs.nhsia.datastandards.ecds.GestationLengthLabourOnsetType xgetGestationLengthLabourOnset();
        
        /**
         * True if has "GestationLength_LabourOnset" element
         */
        boolean isSetGestationLengthLabourOnset();
        
        /**
         * Sets the "GestationLength_LabourOnset" element
         */
        void setGestationLengthLabourOnset(int gestationLengthLabourOnset);
        
        /**
         * Sets (as xml) the "GestationLength_LabourOnset" element
         */
        void xsetGestationLengthLabourOnset(uk.nhs.nhsia.datastandards.ecds.GestationLengthLabourOnsetType gestationLengthLabourOnset);
        
        /**
         * Unsets the "GestationLength_LabourOnset" element
         */
        void unsetGestationLengthLabourOnset();
        
        /**
         * Gets the "LabourOrDeliveryOnsetMethodCode" element
         */
        uk.nhs.nhsia.datastandards.ecds.LabourOrDeliveryOnsetMethodCodeType.Enum getLabourOrDeliveryOnsetMethodCode();
        
        /**
         * Gets (as xml) the "LabourOrDeliveryOnsetMethodCode" element
         */
        uk.nhs.nhsia.datastandards.ecds.LabourOrDeliveryOnsetMethodCodeType xgetLabourOrDeliveryOnsetMethodCode();
        
        /**
         * True if has "LabourOrDeliveryOnsetMethodCode" element
         */
        boolean isSetLabourOrDeliveryOnsetMethodCode();
        
        /**
         * Sets the "LabourOrDeliveryOnsetMethodCode" element
         */
        void setLabourOrDeliveryOnsetMethodCode(uk.nhs.nhsia.datastandards.ecds.LabourOrDeliveryOnsetMethodCodeType.Enum labourOrDeliveryOnsetMethodCode);
        
        /**
         * Sets (as xml) the "LabourOrDeliveryOnsetMethodCode" element
         */
        void xsetLabourOrDeliveryOnsetMethodCode(uk.nhs.nhsia.datastandards.ecds.LabourOrDeliveryOnsetMethodCodeType labourOrDeliveryOnsetMethodCode);
        
        /**
         * Unsets the "LabourOrDeliveryOnsetMethodCode" element
         */
        void unsetLabourOrDeliveryOnsetMethodCode();
        
        /**
         * Gets the "DeliveryDate" element
         */
        java.util.Calendar getDeliveryDate();
        
        /**
         * Gets (as xml) the "DeliveryDate" element
         */
        uk.nhs.nhsia.datastandards.ecds.DeliveryDateType xgetDeliveryDate();
        
        /**
         * True if has "DeliveryDate" element
         */
        boolean isSetDeliveryDate();
        
        /**
         * Sets the "DeliveryDate" element
         */
        void setDeliveryDate(java.util.Calendar deliveryDate);
        
        /**
         * Sets (as xml) the "DeliveryDate" element
         */
        void xsetDeliveryDate(uk.nhs.nhsia.datastandards.ecds.DeliveryDateType deliveryDate);
        
        /**
         * Unsets the "DeliveryDate" element
         */
        void unsetDeliveryDate();
        
        /**
         * A factory class with static methods for creating instances
         * of this type.
         */
        
        public static final class Factory
        {
            public static uk.nhs.nhsia.datastandards.ecds.LabourDeliveryStructure.ActivityCharacteristics newInstance() {
              return (uk.nhs.nhsia.datastandards.ecds.LabourDeliveryStructure.ActivityCharacteristics) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().newInstance( type, null ); }
            
            public static uk.nhs.nhsia.datastandards.ecds.LabourDeliveryStructure.ActivityCharacteristics newInstance(org.apache.xmlbeans.XmlOptions options) {
              return (uk.nhs.nhsia.datastandards.ecds.LabourDeliveryStructure.ActivityCharacteristics) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().newInstance( type, options ); }
            
            private Factory() { } // No instance of this class allowed
        }
    }
    
    /**
     * A factory class with static methods for creating instances
     * of this type.
     */
    
    public static final class Factory
    {
        public static uk.nhs.nhsia.datastandards.ecds.LabourDeliveryStructure newInstance() {
          return (uk.nhs.nhsia.datastandards.ecds.LabourDeliveryStructure) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().newInstance( type, null ); }
        
        public static uk.nhs.nhsia.datastandards.ecds.LabourDeliveryStructure newInstance(org.apache.xmlbeans.XmlOptions options) {
          return (uk.nhs.nhsia.datastandards.ecds.LabourDeliveryStructure) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().newInstance( type, options ); }
        
        /** @param xmlAsString the string value to parse */
        public static uk.nhs.nhsia.datastandards.ecds.LabourDeliveryStructure parse(java.lang.String xmlAsString) throws org.apache.xmlbeans.XmlException {
          return (uk.nhs.nhsia.datastandards.ecds.LabourDeliveryStructure) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( xmlAsString, type, null ); }
        
        public static uk.nhs.nhsia.datastandards.ecds.LabourDeliveryStructure parse(java.lang.String xmlAsString, org.apache.xmlbeans.XmlOptions options) throws org.apache.xmlbeans.XmlException {
          return (uk.nhs.nhsia.datastandards.ecds.LabourDeliveryStructure) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( xmlAsString, type, options ); }
        
        /** @param file the file from which to load an xml document */
        public static uk.nhs.nhsia.datastandards.ecds.LabourDeliveryStructure parse(java.io.File file) throws org.apache.xmlbeans.XmlException, java.io.IOException {
          return (uk.nhs.nhsia.datastandards.ecds.LabourDeliveryStructure) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( file, type, null ); }
        
        public static uk.nhs.nhsia.datastandards.ecds.LabourDeliveryStructure parse(java.io.File file, org.apache.xmlbeans.XmlOptions options) throws org.apache.xmlbeans.XmlException, java.io.IOException {
          return (uk.nhs.nhsia.datastandards.ecds.LabourDeliveryStructure) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( file, type, options ); }
        
        public static uk.nhs.nhsia.datastandards.ecds.LabourDeliveryStructure parse(java.net.URL u) throws org.apache.xmlbeans.XmlException, java.io.IOException {
          return (uk.nhs.nhsia.datastandards.ecds.LabourDeliveryStructure) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( u, type, null ); }
        
        public static uk.nhs.nhsia.datastandards.ecds.LabourDeliveryStructure parse(java.net.URL u, org.apache.xmlbeans.XmlOptions options) throws org.apache.xmlbeans.XmlException, java.io.IOException {
          return (uk.nhs.nhsia.datastandards.ecds.LabourDeliveryStructure) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( u, type, options ); }
        
        public static uk.nhs.nhsia.datastandards.ecds.LabourDeliveryStructure parse(java.io.InputStream is) throws org.apache.xmlbeans.XmlException, java.io.IOException {
          return (uk.nhs.nhsia.datastandards.ecds.LabourDeliveryStructure) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( is, type, null ); }
        
        public static uk.nhs.nhsia.datastandards.ecds.LabourDeliveryStructure parse(java.io.InputStream is, org.apache.xmlbeans.XmlOptions options) throws org.apache.xmlbeans.XmlException, java.io.IOException {
          return (uk.nhs.nhsia.datastandards.ecds.LabourDeliveryStructure) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( is, type, options ); }
        
        public static uk.nhs.nhsia.datastandards.ecds.LabourDeliveryStructure parse(java.io.Reader r) throws org.apache.xmlbeans.XmlException, java.io.IOException {
          return (uk.nhs.nhsia.datastandards.ecds.LabourDeliveryStructure) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( r, type, null ); }
        
        public static uk.nhs.nhsia.datastandards.ecds.LabourDeliveryStructure parse(java.io.Reader r, org.apache.xmlbeans.XmlOptions options) throws org.apache.xmlbeans.XmlException, java.io.IOException {
          return (uk.nhs.nhsia.datastandards.ecds.LabourDeliveryStructure) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( r, type, options ); }
        
        public static uk.nhs.nhsia.datastandards.ecds.LabourDeliveryStructure parse(javax.xml.stream.XMLStreamReader sr) throws org.apache.xmlbeans.XmlException {
          return (uk.nhs.nhsia.datastandards.ecds.LabourDeliveryStructure) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( sr, type, null ); }
        
        public static uk.nhs.nhsia.datastandards.ecds.LabourDeliveryStructure parse(javax.xml.stream.XMLStreamReader sr, org.apache.xmlbeans.XmlOptions options) throws org.apache.xmlbeans.XmlException {
          return (uk.nhs.nhsia.datastandards.ecds.LabourDeliveryStructure) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( sr, type, options ); }
        
        public static uk.nhs.nhsia.datastandards.ecds.LabourDeliveryStructure parse(org.w3c.dom.Node node) throws org.apache.xmlbeans.XmlException {
          return (uk.nhs.nhsia.datastandards.ecds.LabourDeliveryStructure) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( node, type, null ); }
        
        public static uk.nhs.nhsia.datastandards.ecds.LabourDeliveryStructure parse(org.w3c.dom.Node node, org.apache.xmlbeans.XmlOptions options) throws org.apache.xmlbeans.XmlException {
          return (uk.nhs.nhsia.datastandards.ecds.LabourDeliveryStructure) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( node, type, options ); }
        
        /** @deprecated {@link org.apache.xmlbeans.xml.stream.XMLInputStream} */
        public static uk.nhs.nhsia.datastandards.ecds.LabourDeliveryStructure parse(org.apache.xmlbeans.xml.stream.XMLInputStream xis) throws org.apache.xmlbeans.XmlException, org.apache.xmlbeans.xml.stream.XMLStreamException {
          return (uk.nhs.nhsia.datastandards.ecds.LabourDeliveryStructure) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( xis, type, null ); }
        
        /** @deprecated {@link org.apache.xmlbeans.xml.stream.XMLInputStream} */
        public static uk.nhs.nhsia.datastandards.ecds.LabourDeliveryStructure parse(org.apache.xmlbeans.xml.stream.XMLInputStream xis, org.apache.xmlbeans.XmlOptions options) throws org.apache.xmlbeans.XmlException, org.apache.xmlbeans.xml.stream.XMLStreamException {
          return (uk.nhs.nhsia.datastandards.ecds.LabourDeliveryStructure) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( xis, type, options ); }
        
        /** @deprecated {@link org.apache.xmlbeans.xml.stream.XMLInputStream} */
        public static org.apache.xmlbeans.xml.stream.XMLInputStream newValidatingXMLInputStream(org.apache.xmlbeans.xml.stream.XMLInputStream xis) throws org.apache.xmlbeans.XmlException, org.apache.xmlbeans.xml.stream.XMLStreamException {
          return org.apache.xmlbeans.XmlBeans.getContextTypeLoader().newValidatingXMLInputStream( xis, type, null ); }
        
        /** @deprecated {@link org.apache.xmlbeans.xml.stream.XMLInputStream} */
        public static org.apache.xmlbeans.xml.stream.XMLInputStream newValidatingXMLInputStream(org.apache.xmlbeans.xml.stream.XMLInputStream xis, org.apache.xmlbeans.XmlOptions options) throws org.apache.xmlbeans.XmlException, org.apache.xmlbeans.xml.stream.XMLStreamException {
          return org.apache.xmlbeans.XmlBeans.getContextTypeLoader().newValidatingXMLInputStream( xis, type, options ); }
        
        private Factory() { } // No instance of this class allowed
    }
}
