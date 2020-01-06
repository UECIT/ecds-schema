/*
 * XML Type:  PatientCharacteristics_General_Structure
 * Namespace: http://www.nhsia.nhs.uk/DataStandards/XMLschema/CDS/ns
 * Java type: uk.nhs.nhsia.datastandards.ecds.PatientCharacteristicsGeneralStructure
 *
 * Automatically generated - do not modify.
 */
package uk.nhs.nhsia.datastandards.ecds;


/**
 * An XML PatientCharacteristics_General_Structure(@http://www.nhsia.nhs.uk/DataStandards/XMLschema/CDS/ns).
 *
 * This is a complex type.
 */
public interface PatientCharacteristicsGeneralStructure extends org.apache.xmlbeans.XmlObject
{
    public static final org.apache.xmlbeans.SchemaType type = (org.apache.xmlbeans.SchemaType)
        org.apache.xmlbeans.XmlBeans.typeSystemForClassLoader(PatientCharacteristicsGeneralStructure.class.getClassLoader(), "schemaorg_apache_xmlbeans.system.s30C1180FF47174E0C8A992A2D657328B").resolveHandle("patientcharacteristicsgeneralstructure48a1type");
    
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
     * Gets the "CarerSupportIndicator" element
     */
    uk.nhs.nhsia.datastandards.ecds.CarerSupportIndicatorType.Enum getCarerSupportIndicator();
    
    /**
     * Gets (as xml) the "CarerSupportIndicator" element
     */
    uk.nhs.nhsia.datastandards.ecds.CarerSupportIndicatorType xgetCarerSupportIndicator();
    
    /**
     * True if has "CarerSupportIndicator" element
     */
    boolean isSetCarerSupportIndicator();
    
    /**
     * Sets the "CarerSupportIndicator" element
     */
    void setCarerSupportIndicator(uk.nhs.nhsia.datastandards.ecds.CarerSupportIndicatorType.Enum carerSupportIndicator);
    
    /**
     * Sets (as xml) the "CarerSupportIndicator" element
     */
    void xsetCarerSupportIndicator(uk.nhs.nhsia.datastandards.ecds.CarerSupportIndicatorType carerSupportIndicator);
    
    /**
     * Unsets the "CarerSupportIndicator" element
     */
    void unsetCarerSupportIndicator();
    
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
     * Gets the "PersonMaritalStatus" element
     */
    uk.nhs.nhsia.datastandards.ecds.PersonMaritalStatusType.Enum getPersonMaritalStatus();
    
    /**
     * Gets (as xml) the "PersonMaritalStatus" element
     */
    uk.nhs.nhsia.datastandards.ecds.PersonMaritalStatusType xgetPersonMaritalStatus();
    
    /**
     * True if has "PersonMaritalStatus" element
     */
    boolean isSetPersonMaritalStatus();
    
    /**
     * Sets the "PersonMaritalStatus" element
     */
    void setPersonMaritalStatus(uk.nhs.nhsia.datastandards.ecds.PersonMaritalStatusType.Enum personMaritalStatus);
    
    /**
     * Sets (as xml) the "PersonMaritalStatus" element
     */
    void xsetPersonMaritalStatus(uk.nhs.nhsia.datastandards.ecds.PersonMaritalStatusType personMaritalStatus);
    
    /**
     * Unsets the "PersonMaritalStatus" element
     */
    void unsetPersonMaritalStatus();
    
    /**
     * Gets the "MentalHealthActLegalStatusClassificationCode_OnAdmission" element
     */
    uk.nhs.nhsia.datastandards.ecds.MentalHealthActLegalStatusClassificationCodeType.Enum getMentalHealthActLegalStatusClassificationCodeOnAdmission();
    
    /**
     * Gets (as xml) the "MentalHealthActLegalStatusClassificationCode_OnAdmission" element
     */
    uk.nhs.nhsia.datastandards.ecds.MentalHealthActLegalStatusClassificationCodeOnAdmissionType xgetMentalHealthActLegalStatusClassificationCodeOnAdmission();
    
    /**
     * True if has "MentalHealthActLegalStatusClassificationCode_OnAdmission" element
     */
    boolean isSetMentalHealthActLegalStatusClassificationCodeOnAdmission();
    
    /**
     * Sets the "MentalHealthActLegalStatusClassificationCode_OnAdmission" element
     */
    void setMentalHealthActLegalStatusClassificationCodeOnAdmission(uk.nhs.nhsia.datastandards.ecds.MentalHealthActLegalStatusClassificationCodeType.Enum mentalHealthActLegalStatusClassificationCodeOnAdmission);
    
    /**
     * Sets (as xml) the "MentalHealthActLegalStatusClassificationCode_OnAdmission" element
     */
    void xsetMentalHealthActLegalStatusClassificationCodeOnAdmission(uk.nhs.nhsia.datastandards.ecds.MentalHealthActLegalStatusClassificationCodeOnAdmissionType mentalHealthActLegalStatusClassificationCodeOnAdmission);
    
    /**
     * Unsets the "MentalHealthActLegalStatusClassificationCode_OnAdmission" element
     */
    void unsetMentalHealthActLegalStatusClassificationCodeOnAdmission();
    
    /**
     * A factory class with static methods for creating instances
     * of this type.
     */
    
    public static final class Factory
    {
        public static uk.nhs.nhsia.datastandards.ecds.PatientCharacteristicsGeneralStructure newInstance() {
          return (uk.nhs.nhsia.datastandards.ecds.PatientCharacteristicsGeneralStructure) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().newInstance( type, null ); }
        
        public static uk.nhs.nhsia.datastandards.ecds.PatientCharacteristicsGeneralStructure newInstance(org.apache.xmlbeans.XmlOptions options) {
          return (uk.nhs.nhsia.datastandards.ecds.PatientCharacteristicsGeneralStructure) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().newInstance( type, options ); }
        
        /** @param xmlAsString the string value to parse */
        public static uk.nhs.nhsia.datastandards.ecds.PatientCharacteristicsGeneralStructure parse(java.lang.String xmlAsString) throws org.apache.xmlbeans.XmlException {
          return (uk.nhs.nhsia.datastandards.ecds.PatientCharacteristicsGeneralStructure) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( xmlAsString, type, null ); }
        
        public static uk.nhs.nhsia.datastandards.ecds.PatientCharacteristicsGeneralStructure parse(java.lang.String xmlAsString, org.apache.xmlbeans.XmlOptions options) throws org.apache.xmlbeans.XmlException {
          return (uk.nhs.nhsia.datastandards.ecds.PatientCharacteristicsGeneralStructure) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( xmlAsString, type, options ); }
        
        /** @param file the file from which to load an xml document */
        public static uk.nhs.nhsia.datastandards.ecds.PatientCharacteristicsGeneralStructure parse(java.io.File file) throws org.apache.xmlbeans.XmlException, java.io.IOException {
          return (uk.nhs.nhsia.datastandards.ecds.PatientCharacteristicsGeneralStructure) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( file, type, null ); }
        
        public static uk.nhs.nhsia.datastandards.ecds.PatientCharacteristicsGeneralStructure parse(java.io.File file, org.apache.xmlbeans.XmlOptions options) throws org.apache.xmlbeans.XmlException, java.io.IOException {
          return (uk.nhs.nhsia.datastandards.ecds.PatientCharacteristicsGeneralStructure) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( file, type, options ); }
        
        public static uk.nhs.nhsia.datastandards.ecds.PatientCharacteristicsGeneralStructure parse(java.net.URL u) throws org.apache.xmlbeans.XmlException, java.io.IOException {
          return (uk.nhs.nhsia.datastandards.ecds.PatientCharacteristicsGeneralStructure) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( u, type, null ); }
        
        public static uk.nhs.nhsia.datastandards.ecds.PatientCharacteristicsGeneralStructure parse(java.net.URL u, org.apache.xmlbeans.XmlOptions options) throws org.apache.xmlbeans.XmlException, java.io.IOException {
          return (uk.nhs.nhsia.datastandards.ecds.PatientCharacteristicsGeneralStructure) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( u, type, options ); }
        
        public static uk.nhs.nhsia.datastandards.ecds.PatientCharacteristicsGeneralStructure parse(java.io.InputStream is) throws org.apache.xmlbeans.XmlException, java.io.IOException {
          return (uk.nhs.nhsia.datastandards.ecds.PatientCharacteristicsGeneralStructure) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( is, type, null ); }
        
        public static uk.nhs.nhsia.datastandards.ecds.PatientCharacteristicsGeneralStructure parse(java.io.InputStream is, org.apache.xmlbeans.XmlOptions options) throws org.apache.xmlbeans.XmlException, java.io.IOException {
          return (uk.nhs.nhsia.datastandards.ecds.PatientCharacteristicsGeneralStructure) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( is, type, options ); }
        
        public static uk.nhs.nhsia.datastandards.ecds.PatientCharacteristicsGeneralStructure parse(java.io.Reader r) throws org.apache.xmlbeans.XmlException, java.io.IOException {
          return (uk.nhs.nhsia.datastandards.ecds.PatientCharacteristicsGeneralStructure) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( r, type, null ); }
        
        public static uk.nhs.nhsia.datastandards.ecds.PatientCharacteristicsGeneralStructure parse(java.io.Reader r, org.apache.xmlbeans.XmlOptions options) throws org.apache.xmlbeans.XmlException, java.io.IOException {
          return (uk.nhs.nhsia.datastandards.ecds.PatientCharacteristicsGeneralStructure) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( r, type, options ); }
        
        public static uk.nhs.nhsia.datastandards.ecds.PatientCharacteristicsGeneralStructure parse(javax.xml.stream.XMLStreamReader sr) throws org.apache.xmlbeans.XmlException {
          return (uk.nhs.nhsia.datastandards.ecds.PatientCharacteristicsGeneralStructure) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( sr, type, null ); }
        
        public static uk.nhs.nhsia.datastandards.ecds.PatientCharacteristicsGeneralStructure parse(javax.xml.stream.XMLStreamReader sr, org.apache.xmlbeans.XmlOptions options) throws org.apache.xmlbeans.XmlException {
          return (uk.nhs.nhsia.datastandards.ecds.PatientCharacteristicsGeneralStructure) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( sr, type, options ); }
        
        public static uk.nhs.nhsia.datastandards.ecds.PatientCharacteristicsGeneralStructure parse(org.w3c.dom.Node node) throws org.apache.xmlbeans.XmlException {
          return (uk.nhs.nhsia.datastandards.ecds.PatientCharacteristicsGeneralStructure) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( node, type, null ); }
        
        public static uk.nhs.nhsia.datastandards.ecds.PatientCharacteristicsGeneralStructure parse(org.w3c.dom.Node node, org.apache.xmlbeans.XmlOptions options) throws org.apache.xmlbeans.XmlException {
          return (uk.nhs.nhsia.datastandards.ecds.PatientCharacteristicsGeneralStructure) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( node, type, options ); }
        
        /** @deprecated {@link org.apache.xmlbeans.xml.stream.XMLInputStream} */
        public static uk.nhs.nhsia.datastandards.ecds.PatientCharacteristicsGeneralStructure parse(org.apache.xmlbeans.xml.stream.XMLInputStream xis) throws org.apache.xmlbeans.XmlException, org.apache.xmlbeans.xml.stream.XMLStreamException {
          return (uk.nhs.nhsia.datastandards.ecds.PatientCharacteristicsGeneralStructure) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( xis, type, null ); }
        
        /** @deprecated {@link org.apache.xmlbeans.xml.stream.XMLInputStream} */
        public static uk.nhs.nhsia.datastandards.ecds.PatientCharacteristicsGeneralStructure parse(org.apache.xmlbeans.xml.stream.XMLInputStream xis, org.apache.xmlbeans.XmlOptions options) throws org.apache.xmlbeans.XmlException, org.apache.xmlbeans.xml.stream.XMLStreamException {
          return (uk.nhs.nhsia.datastandards.ecds.PatientCharacteristicsGeneralStructure) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( xis, type, options ); }
        
        /** @deprecated {@link org.apache.xmlbeans.xml.stream.XMLInputStream} */
        public static org.apache.xmlbeans.xml.stream.XMLInputStream newValidatingXMLInputStream(org.apache.xmlbeans.xml.stream.XMLInputStream xis) throws org.apache.xmlbeans.XmlException, org.apache.xmlbeans.xml.stream.XMLStreamException {
          return org.apache.xmlbeans.XmlBeans.getContextTypeLoader().newValidatingXMLInputStream( xis, type, null ); }
        
        /** @deprecated {@link org.apache.xmlbeans.xml.stream.XMLInputStream} */
        public static org.apache.xmlbeans.xml.stream.XMLInputStream newValidatingXMLInputStream(org.apache.xmlbeans.xml.stream.XMLInputStream xis, org.apache.xmlbeans.XmlOptions options) throws org.apache.xmlbeans.XmlException, org.apache.xmlbeans.xml.stream.XMLStreamException {
          return org.apache.xmlbeans.XmlBeans.getContextTypeLoader().newValidatingXMLInputStream( xis, type, options ); }
        
        private Factory() { } // No instance of this class allowed
    }
}
