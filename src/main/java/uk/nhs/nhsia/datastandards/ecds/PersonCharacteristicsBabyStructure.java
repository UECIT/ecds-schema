/*
 * XML Type:  PersonCharacteristics_Baby_Structure
 * Namespace: http://www.nhsia.nhs.uk/DataStandards/XMLschema/CDS/ns
 * Java type: uk.nhs.nhsia.datastandards.ecds.PersonCharacteristicsBabyStructure
 *
 * Automatically generated - do not modify.
 */
package uk.nhs.nhsia.datastandards.ecds;


/**
 * An XML PersonCharacteristics_Baby_Structure(@http://www.nhsia.nhs.uk/DataStandards/XMLschema/CDS/ns).
 *
 * This is a complex type.
 */
public interface PersonCharacteristicsBabyStructure extends org.apache.xmlbeans.XmlObject
{
    public static final org.apache.xmlbeans.SchemaType type = (org.apache.xmlbeans.SchemaType)
        org.apache.xmlbeans.XmlBeans.typeSystemForClassLoader(PersonCharacteristicsBabyStructure.class.getClassLoader(), "schemaorg_apache_xmlbeans.system.s30C1180FF47174E0C8A992A2D657328B").resolveHandle("personcharacteristicsbabystructuref24btype");
    
    /**
     * Gets the "PersonGenderCodeCurrent_Baby" element
     */
    uk.nhs.nhsia.datastandards.ecds.PersonGenderCodeType.Enum getPersonGenderCodeCurrentBaby();
    
    /**
     * Gets (as xml) the "PersonGenderCodeCurrent_Baby" element
     */
    uk.nhs.nhsia.datastandards.ecds.PersonGenderCodeCurrentBabyType xgetPersonGenderCodeCurrentBaby();
    
    /**
     * True if has "PersonGenderCodeCurrent_Baby" element
     */
    boolean isSetPersonGenderCodeCurrentBaby();
    
    /**
     * Sets the "PersonGenderCodeCurrent_Baby" element
     */
    void setPersonGenderCodeCurrentBaby(uk.nhs.nhsia.datastandards.ecds.PersonGenderCodeType.Enum personGenderCodeCurrentBaby);
    
    /**
     * Sets (as xml) the "PersonGenderCodeCurrent_Baby" element
     */
    void xsetPersonGenderCodeCurrentBaby(uk.nhs.nhsia.datastandards.ecds.PersonGenderCodeCurrentBabyType personGenderCodeCurrentBaby);
    
    /**
     * Unsets the "PersonGenderCodeCurrent_Baby" element
     */
    void unsetPersonGenderCodeCurrentBaby();
    
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
     * Gets the "OverseasVisitorStatusClassificationAtCDSActivityDate" element
     */
    uk.nhs.nhsia.datastandards.ecds.OverseasVisitorClassificationType.Enum getOverseasVisitorStatusClassificationAtCDSActivityDate();
    
    /**
     * Gets (as xml) the "OverseasVisitorStatusClassificationAtCDSActivityDate" element
     */
    uk.nhs.nhsia.datastandards.ecds.OverseasVisitorStatusClassificationAtCDSActivityDateType xgetOverseasVisitorStatusClassificationAtCDSActivityDate();
    
    /**
     * True if has "OverseasVisitorStatusClassificationAtCDSActivityDate" element
     */
    boolean isSetOverseasVisitorStatusClassificationAtCDSActivityDate();
    
    /**
     * Sets the "OverseasVisitorStatusClassificationAtCDSActivityDate" element
     */
    void setOverseasVisitorStatusClassificationAtCDSActivityDate(uk.nhs.nhsia.datastandards.ecds.OverseasVisitorClassificationType.Enum overseasVisitorStatusClassificationAtCDSActivityDate);
    
    /**
     * Sets (as xml) the "OverseasVisitorStatusClassificationAtCDSActivityDate" element
     */
    void xsetOverseasVisitorStatusClassificationAtCDSActivityDate(uk.nhs.nhsia.datastandards.ecds.OverseasVisitorStatusClassificationAtCDSActivityDateType overseasVisitorStatusClassificationAtCDSActivityDate);
    
    /**
     * Unsets the "OverseasVisitorStatusClassificationAtCDSActivityDate" element
     */
    void unsetOverseasVisitorStatusClassificationAtCDSActivityDate();
    
    /**
     * A factory class with static methods for creating instances
     * of this type.
     */
    
    public static final class Factory
    {
        public static uk.nhs.nhsia.datastandards.ecds.PersonCharacteristicsBabyStructure newInstance() {
          return (uk.nhs.nhsia.datastandards.ecds.PersonCharacteristicsBabyStructure) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().newInstance( type, null ); }
        
        public static uk.nhs.nhsia.datastandards.ecds.PersonCharacteristicsBabyStructure newInstance(org.apache.xmlbeans.XmlOptions options) {
          return (uk.nhs.nhsia.datastandards.ecds.PersonCharacteristicsBabyStructure) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().newInstance( type, options ); }
        
        /** @param xmlAsString the string value to parse */
        public static uk.nhs.nhsia.datastandards.ecds.PersonCharacteristicsBabyStructure parse(java.lang.String xmlAsString) throws org.apache.xmlbeans.XmlException {
          return (uk.nhs.nhsia.datastandards.ecds.PersonCharacteristicsBabyStructure) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( xmlAsString, type, null ); }
        
        public static uk.nhs.nhsia.datastandards.ecds.PersonCharacteristicsBabyStructure parse(java.lang.String xmlAsString, org.apache.xmlbeans.XmlOptions options) throws org.apache.xmlbeans.XmlException {
          return (uk.nhs.nhsia.datastandards.ecds.PersonCharacteristicsBabyStructure) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( xmlAsString, type, options ); }
        
        /** @param file the file from which to load an xml document */
        public static uk.nhs.nhsia.datastandards.ecds.PersonCharacteristicsBabyStructure parse(java.io.File file) throws org.apache.xmlbeans.XmlException, java.io.IOException {
          return (uk.nhs.nhsia.datastandards.ecds.PersonCharacteristicsBabyStructure) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( file, type, null ); }
        
        public static uk.nhs.nhsia.datastandards.ecds.PersonCharacteristicsBabyStructure parse(java.io.File file, org.apache.xmlbeans.XmlOptions options) throws org.apache.xmlbeans.XmlException, java.io.IOException {
          return (uk.nhs.nhsia.datastandards.ecds.PersonCharacteristicsBabyStructure) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( file, type, options ); }
        
        public static uk.nhs.nhsia.datastandards.ecds.PersonCharacteristicsBabyStructure parse(java.net.URL u) throws org.apache.xmlbeans.XmlException, java.io.IOException {
          return (uk.nhs.nhsia.datastandards.ecds.PersonCharacteristicsBabyStructure) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( u, type, null ); }
        
        public static uk.nhs.nhsia.datastandards.ecds.PersonCharacteristicsBabyStructure parse(java.net.URL u, org.apache.xmlbeans.XmlOptions options) throws org.apache.xmlbeans.XmlException, java.io.IOException {
          return (uk.nhs.nhsia.datastandards.ecds.PersonCharacteristicsBabyStructure) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( u, type, options ); }
        
        public static uk.nhs.nhsia.datastandards.ecds.PersonCharacteristicsBabyStructure parse(java.io.InputStream is) throws org.apache.xmlbeans.XmlException, java.io.IOException {
          return (uk.nhs.nhsia.datastandards.ecds.PersonCharacteristicsBabyStructure) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( is, type, null ); }
        
        public static uk.nhs.nhsia.datastandards.ecds.PersonCharacteristicsBabyStructure parse(java.io.InputStream is, org.apache.xmlbeans.XmlOptions options) throws org.apache.xmlbeans.XmlException, java.io.IOException {
          return (uk.nhs.nhsia.datastandards.ecds.PersonCharacteristicsBabyStructure) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( is, type, options ); }
        
        public static uk.nhs.nhsia.datastandards.ecds.PersonCharacteristicsBabyStructure parse(java.io.Reader r) throws org.apache.xmlbeans.XmlException, java.io.IOException {
          return (uk.nhs.nhsia.datastandards.ecds.PersonCharacteristicsBabyStructure) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( r, type, null ); }
        
        public static uk.nhs.nhsia.datastandards.ecds.PersonCharacteristicsBabyStructure parse(java.io.Reader r, org.apache.xmlbeans.XmlOptions options) throws org.apache.xmlbeans.XmlException, java.io.IOException {
          return (uk.nhs.nhsia.datastandards.ecds.PersonCharacteristicsBabyStructure) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( r, type, options ); }
        
        public static uk.nhs.nhsia.datastandards.ecds.PersonCharacteristicsBabyStructure parse(javax.xml.stream.XMLStreamReader sr) throws org.apache.xmlbeans.XmlException {
          return (uk.nhs.nhsia.datastandards.ecds.PersonCharacteristicsBabyStructure) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( sr, type, null ); }
        
        public static uk.nhs.nhsia.datastandards.ecds.PersonCharacteristicsBabyStructure parse(javax.xml.stream.XMLStreamReader sr, org.apache.xmlbeans.XmlOptions options) throws org.apache.xmlbeans.XmlException {
          return (uk.nhs.nhsia.datastandards.ecds.PersonCharacteristicsBabyStructure) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( sr, type, options ); }
        
        public static uk.nhs.nhsia.datastandards.ecds.PersonCharacteristicsBabyStructure parse(org.w3c.dom.Node node) throws org.apache.xmlbeans.XmlException {
          return (uk.nhs.nhsia.datastandards.ecds.PersonCharacteristicsBabyStructure) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( node, type, null ); }
        
        public static uk.nhs.nhsia.datastandards.ecds.PersonCharacteristicsBabyStructure parse(org.w3c.dom.Node node, org.apache.xmlbeans.XmlOptions options) throws org.apache.xmlbeans.XmlException {
          return (uk.nhs.nhsia.datastandards.ecds.PersonCharacteristicsBabyStructure) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( node, type, options ); }
        
        /** @deprecated {@link org.apache.xmlbeans.xml.stream.XMLInputStream} */
        public static uk.nhs.nhsia.datastandards.ecds.PersonCharacteristicsBabyStructure parse(org.apache.xmlbeans.xml.stream.XMLInputStream xis) throws org.apache.xmlbeans.XmlException, org.apache.xmlbeans.xml.stream.XMLStreamException {
          return (uk.nhs.nhsia.datastandards.ecds.PersonCharacteristicsBabyStructure) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( xis, type, null ); }
        
        /** @deprecated {@link org.apache.xmlbeans.xml.stream.XMLInputStream} */
        public static uk.nhs.nhsia.datastandards.ecds.PersonCharacteristicsBabyStructure parse(org.apache.xmlbeans.xml.stream.XMLInputStream xis, org.apache.xmlbeans.XmlOptions options) throws org.apache.xmlbeans.XmlException, org.apache.xmlbeans.xml.stream.XMLStreamException {
          return (uk.nhs.nhsia.datastandards.ecds.PersonCharacteristicsBabyStructure) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( xis, type, options ); }
        
        /** @deprecated {@link org.apache.xmlbeans.xml.stream.XMLInputStream} */
        public static org.apache.xmlbeans.xml.stream.XMLInputStream newValidatingXMLInputStream(org.apache.xmlbeans.xml.stream.XMLInputStream xis) throws org.apache.xmlbeans.XmlException, org.apache.xmlbeans.xml.stream.XMLStreamException {
          return org.apache.xmlbeans.XmlBeans.getContextTypeLoader().newValidatingXMLInputStream( xis, type, null ); }
        
        /** @deprecated {@link org.apache.xmlbeans.xml.stream.XMLInputStream} */
        public static org.apache.xmlbeans.xml.stream.XMLInputStream newValidatingXMLInputStream(org.apache.xmlbeans.xml.stream.XMLInputStream xis, org.apache.xmlbeans.XmlOptions options) throws org.apache.xmlbeans.XmlException, org.apache.xmlbeans.xml.stream.XMLStreamException {
          return org.apache.xmlbeans.XmlBeans.getContextTypeLoader().newValidatingXMLInputStream( xis, type, options ); }
        
        private Factory() { } // No instance of this class allowed
    }
}
