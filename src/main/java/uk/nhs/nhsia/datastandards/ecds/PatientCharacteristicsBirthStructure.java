/*
 * XML Type:  PatientCharacteristics_Birth_Structure
 * Namespace: http://www.nhsia.nhs.uk/DataStandards/XMLschema/CDS/ns
 * Java type: uk.nhs.nhsia.datastandards.ecds.PatientCharacteristicsBirthStructure
 *
 * Automatically generated - do not modify.
 */
package uk.nhs.nhsia.datastandards.ecds;


/**
 * An XML PatientCharacteristics_Birth_Structure(@http://www.nhsia.nhs.uk/DataStandards/XMLschema/CDS/ns).
 *
 * This is a complex type.
 */
public interface PatientCharacteristicsBirthStructure extends org.apache.xmlbeans.XmlObject
{
    public static final org.apache.xmlbeans.SchemaType type = (org.apache.xmlbeans.SchemaType)
        org.apache.xmlbeans.XmlBeans.typeSystemForClassLoader(PatientCharacteristicsBirthStructure.class.getClassLoader(), "schemaorg_apache_xmlbeans.system.s30C1180FF47174E0C8A992A2D657328B").resolveHandle("patientcharacteristicsbirthstructure646atype");
    
    /**
     * Gets the "PersonGenderCodeCurrent" element
     */
    uk.nhs.nhsia.datastandards.ecds.PersonGenderCodeType.Enum getPersonGenderCodeCurrent();
    
    /**
     * Gets (as xml) the "PersonGenderCodeCurrent" element
     */
    uk.nhs.nhsia.datastandards.ecds.PersonGenderCodeCurrentType xgetPersonGenderCodeCurrent();
    
    /**
     * True if has "PersonGenderCodeCurrent" element
     */
    boolean isSetPersonGenderCodeCurrent();
    
    /**
     * Sets the "PersonGenderCodeCurrent" element
     */
    void setPersonGenderCodeCurrent(uk.nhs.nhsia.datastandards.ecds.PersonGenderCodeType.Enum personGenderCodeCurrent);
    
    /**
     * Sets (as xml) the "PersonGenderCodeCurrent" element
     */
    void xsetPersonGenderCodeCurrent(uk.nhs.nhsia.datastandards.ecds.PersonGenderCodeCurrentType personGenderCodeCurrent);
    
    /**
     * Unsets the "PersonGenderCodeCurrent" element
     */
    void unsetPersonGenderCodeCurrent();
    
    /**
     * Gets the "EthnicCategory" element
     */
    java.lang.String getEthnicCategory();
    
    /**
     * Gets (as xml) the "EthnicCategory" element
     */
    uk.nhs.nhsia.datastandards.ecds.EthnicCategoryType xgetEthnicCategory();
    
    /**
     * True if has "EthnicCategory" element
     */
    boolean isSetEthnicCategory();
    
    /**
     * Sets the "EthnicCategory" element
     */
    void setEthnicCategory(java.lang.String ethnicCategory);
    
    /**
     * Sets (as xml) the "EthnicCategory" element
     */
    void xsetEthnicCategory(uk.nhs.nhsia.datastandards.ecds.EthnicCategoryType ethnicCategory);
    
    /**
     * Unsets the "EthnicCategory" element
     */
    void unsetEthnicCategory();
    
    /**
     * Gets the "LiveOrStillBirthCode" element
     */
    uk.nhs.nhsia.datastandards.ecds.LiveOrStillBirthCodeType.Enum getLiveOrStillBirthCode();
    
    /**
     * Gets (as xml) the "LiveOrStillBirthCode" element
     */
    uk.nhs.nhsia.datastandards.ecds.LiveOrStillBirthCodeType xgetLiveOrStillBirthCode();
    
    /**
     * True if has "LiveOrStillBirthCode" element
     */
    boolean isSetLiveOrStillBirthCode();
    
    /**
     * Sets the "LiveOrStillBirthCode" element
     */
    void setLiveOrStillBirthCode(uk.nhs.nhsia.datastandards.ecds.LiveOrStillBirthCodeType.Enum liveOrStillBirthCode);
    
    /**
     * Sets (as xml) the "LiveOrStillBirthCode" element
     */
    void xsetLiveOrStillBirthCode(uk.nhs.nhsia.datastandards.ecds.LiveOrStillBirthCodeType liveOrStillBirthCode);
    
    /**
     * Unsets the "LiveOrStillBirthCode" element
     */
    void unsetLiveOrStillBirthCode();
    
    /**
     * Gets the "BirthWeight" element
     */
    int getBirthWeight();
    
    /**
     * Gets (as xml) the "BirthWeight" element
     */
    uk.nhs.nhsia.datastandards.ecds.BirthWeightType xgetBirthWeight();
    
    /**
     * True if has "BirthWeight" element
     */
    boolean isSetBirthWeight();
    
    /**
     * Sets the "BirthWeight" element
     */
    void setBirthWeight(int birthWeight);
    
    /**
     * Sets (as xml) the "BirthWeight" element
     */
    void xsetBirthWeight(uk.nhs.nhsia.datastandards.ecds.BirthWeightType birthWeight);
    
    /**
     * Unsets the "BirthWeight" element
     */
    void unsetBirthWeight();
    
    /**
     * A factory class with static methods for creating instances
     * of this type.
     */
    
    public static final class Factory
    {
        public static uk.nhs.nhsia.datastandards.ecds.PatientCharacteristicsBirthStructure newInstance() {
          return (uk.nhs.nhsia.datastandards.ecds.PatientCharacteristicsBirthStructure) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().newInstance( type, null ); }
        
        public static uk.nhs.nhsia.datastandards.ecds.PatientCharacteristicsBirthStructure newInstance(org.apache.xmlbeans.XmlOptions options) {
          return (uk.nhs.nhsia.datastandards.ecds.PatientCharacteristicsBirthStructure) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().newInstance( type, options ); }
        
        /** @param xmlAsString the string value to parse */
        public static uk.nhs.nhsia.datastandards.ecds.PatientCharacteristicsBirthStructure parse(java.lang.String xmlAsString) throws org.apache.xmlbeans.XmlException {
          return (uk.nhs.nhsia.datastandards.ecds.PatientCharacteristicsBirthStructure) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( xmlAsString, type, null ); }
        
        public static uk.nhs.nhsia.datastandards.ecds.PatientCharacteristicsBirthStructure parse(java.lang.String xmlAsString, org.apache.xmlbeans.XmlOptions options) throws org.apache.xmlbeans.XmlException {
          return (uk.nhs.nhsia.datastandards.ecds.PatientCharacteristicsBirthStructure) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( xmlAsString, type, options ); }
        
        /** @param file the file from which to load an xml document */
        public static uk.nhs.nhsia.datastandards.ecds.PatientCharacteristicsBirthStructure parse(java.io.File file) throws org.apache.xmlbeans.XmlException, java.io.IOException {
          return (uk.nhs.nhsia.datastandards.ecds.PatientCharacteristicsBirthStructure) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( file, type, null ); }
        
        public static uk.nhs.nhsia.datastandards.ecds.PatientCharacteristicsBirthStructure parse(java.io.File file, org.apache.xmlbeans.XmlOptions options) throws org.apache.xmlbeans.XmlException, java.io.IOException {
          return (uk.nhs.nhsia.datastandards.ecds.PatientCharacteristicsBirthStructure) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( file, type, options ); }
        
        public static uk.nhs.nhsia.datastandards.ecds.PatientCharacteristicsBirthStructure parse(java.net.URL u) throws org.apache.xmlbeans.XmlException, java.io.IOException {
          return (uk.nhs.nhsia.datastandards.ecds.PatientCharacteristicsBirthStructure) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( u, type, null ); }
        
        public static uk.nhs.nhsia.datastandards.ecds.PatientCharacteristicsBirthStructure parse(java.net.URL u, org.apache.xmlbeans.XmlOptions options) throws org.apache.xmlbeans.XmlException, java.io.IOException {
          return (uk.nhs.nhsia.datastandards.ecds.PatientCharacteristicsBirthStructure) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( u, type, options ); }
        
        public static uk.nhs.nhsia.datastandards.ecds.PatientCharacteristicsBirthStructure parse(java.io.InputStream is) throws org.apache.xmlbeans.XmlException, java.io.IOException {
          return (uk.nhs.nhsia.datastandards.ecds.PatientCharacteristicsBirthStructure) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( is, type, null ); }
        
        public static uk.nhs.nhsia.datastandards.ecds.PatientCharacteristicsBirthStructure parse(java.io.InputStream is, org.apache.xmlbeans.XmlOptions options) throws org.apache.xmlbeans.XmlException, java.io.IOException {
          return (uk.nhs.nhsia.datastandards.ecds.PatientCharacteristicsBirthStructure) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( is, type, options ); }
        
        public static uk.nhs.nhsia.datastandards.ecds.PatientCharacteristicsBirthStructure parse(java.io.Reader r) throws org.apache.xmlbeans.XmlException, java.io.IOException {
          return (uk.nhs.nhsia.datastandards.ecds.PatientCharacteristicsBirthStructure) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( r, type, null ); }
        
        public static uk.nhs.nhsia.datastandards.ecds.PatientCharacteristicsBirthStructure parse(java.io.Reader r, org.apache.xmlbeans.XmlOptions options) throws org.apache.xmlbeans.XmlException, java.io.IOException {
          return (uk.nhs.nhsia.datastandards.ecds.PatientCharacteristicsBirthStructure) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( r, type, options ); }
        
        public static uk.nhs.nhsia.datastandards.ecds.PatientCharacteristicsBirthStructure parse(javax.xml.stream.XMLStreamReader sr) throws org.apache.xmlbeans.XmlException {
          return (uk.nhs.nhsia.datastandards.ecds.PatientCharacteristicsBirthStructure) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( sr, type, null ); }
        
        public static uk.nhs.nhsia.datastandards.ecds.PatientCharacteristicsBirthStructure parse(javax.xml.stream.XMLStreamReader sr, org.apache.xmlbeans.XmlOptions options) throws org.apache.xmlbeans.XmlException {
          return (uk.nhs.nhsia.datastandards.ecds.PatientCharacteristicsBirthStructure) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( sr, type, options ); }
        
        public static uk.nhs.nhsia.datastandards.ecds.PatientCharacteristicsBirthStructure parse(org.w3c.dom.Node node) throws org.apache.xmlbeans.XmlException {
          return (uk.nhs.nhsia.datastandards.ecds.PatientCharacteristicsBirthStructure) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( node, type, null ); }
        
        public static uk.nhs.nhsia.datastandards.ecds.PatientCharacteristicsBirthStructure parse(org.w3c.dom.Node node, org.apache.xmlbeans.XmlOptions options) throws org.apache.xmlbeans.XmlException {
          return (uk.nhs.nhsia.datastandards.ecds.PatientCharacteristicsBirthStructure) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( node, type, options ); }
        
        /** @deprecated {@link org.apache.xmlbeans.xml.stream.XMLInputStream} */
        public static uk.nhs.nhsia.datastandards.ecds.PatientCharacteristicsBirthStructure parse(org.apache.xmlbeans.xml.stream.XMLInputStream xis) throws org.apache.xmlbeans.XmlException, org.apache.xmlbeans.xml.stream.XMLStreamException {
          return (uk.nhs.nhsia.datastandards.ecds.PatientCharacteristicsBirthStructure) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( xis, type, null ); }
        
        /** @deprecated {@link org.apache.xmlbeans.xml.stream.XMLInputStream} */
        public static uk.nhs.nhsia.datastandards.ecds.PatientCharacteristicsBirthStructure parse(org.apache.xmlbeans.xml.stream.XMLInputStream xis, org.apache.xmlbeans.XmlOptions options) throws org.apache.xmlbeans.XmlException, org.apache.xmlbeans.xml.stream.XMLStreamException {
          return (uk.nhs.nhsia.datastandards.ecds.PatientCharacteristicsBirthStructure) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( xis, type, options ); }
        
        /** @deprecated {@link org.apache.xmlbeans.xml.stream.XMLInputStream} */
        public static org.apache.xmlbeans.xml.stream.XMLInputStream newValidatingXMLInputStream(org.apache.xmlbeans.xml.stream.XMLInputStream xis) throws org.apache.xmlbeans.XmlException, org.apache.xmlbeans.xml.stream.XMLStreamException {
          return org.apache.xmlbeans.XmlBeans.getContextTypeLoader().newValidatingXMLInputStream( xis, type, null ); }
        
        /** @deprecated {@link org.apache.xmlbeans.xml.stream.XMLInputStream} */
        public static org.apache.xmlbeans.xml.stream.XMLInputStream newValidatingXMLInputStream(org.apache.xmlbeans.xml.stream.XMLInputStream xis, org.apache.xmlbeans.XmlOptions options) throws org.apache.xmlbeans.XmlException, org.apache.xmlbeans.xml.stream.XMLStreamException {
          return org.apache.xmlbeans.XmlBeans.getContextTypeLoader().newValidatingXMLInputStream( xis, type, options ); }
        
        private Factory() { } // No instance of this class allowed
    }
}
