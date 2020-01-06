/*
 * XML Type:  PatientCharacteristics_EmergencyCare_Structure
 * Namespace: http://www.nhsia.nhs.uk/DataStandards/XMLschema/CDS/ns
 * Java type: uk.nhs.nhsia.datastandards.ecds.PatientCharacteristicsEmergencyCareStructure
 *
 * Automatically generated - do not modify.
 */
package uk.nhs.nhsia.datastandards.ecds;


/**
 * An XML PatientCharacteristics_EmergencyCare_Structure(@http://www.nhsia.nhs.uk/DataStandards/XMLschema/CDS/ns).
 *
 * This is a complex type.
 */
public interface PatientCharacteristicsEmergencyCareStructure extends org.apache.xmlbeans.XmlObject
{
    public static final org.apache.xmlbeans.SchemaType type = (org.apache.xmlbeans.SchemaType)
        org.apache.xmlbeans.XmlBeans.typeSystemForClassLoader(PatientCharacteristicsEmergencyCareStructure.class.getClassLoader(), "schemaorg_apache_xmlbeans.system.s30C1180FF47174E0C8A992A2D657328B").resolveHandle("patientcharacteristicsemergencycarestructureaa47type");
    
    /**
     * Gets the "PersonStatedGenderCode" element
     */
    uk.nhs.nhsia.datastandards.ecds.PersonStatedGenderCodeECType.Enum getPersonStatedGenderCode();
    
    /**
     * Gets (as xml) the "PersonStatedGenderCode" element
     */
    uk.nhs.nhsia.datastandards.ecds.PersonStatedGenderCodeECType xgetPersonStatedGenderCode();
    
    /**
     * True if has "PersonStatedGenderCode" element
     */
    boolean isSetPersonStatedGenderCode();
    
    /**
     * Sets the "PersonStatedGenderCode" element
     */
    void setPersonStatedGenderCode(uk.nhs.nhsia.datastandards.ecds.PersonStatedGenderCodeECType.Enum personStatedGenderCode);
    
    /**
     * Sets (as xml) the "PersonStatedGenderCode" element
     */
    void xsetPersonStatedGenderCode(uk.nhs.nhsia.datastandards.ecds.PersonStatedGenderCodeECType personStatedGenderCode);
    
    /**
     * Unsets the "PersonStatedGenderCode" element
     */
    void unsetPersonStatedGenderCode();
    
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
     * Gets the "AccommodationStatus_SnomedCt" element
     */
    java.lang.String getAccommodationStatusSnomedCt();
    
    /**
     * Gets (as xml) the "AccommodationStatus_SnomedCt" element
     */
    uk.nhs.nhsia.datastandards.ecds.N618ECType xgetAccommodationStatusSnomedCt();
    
    /**
     * True if has "AccommodationStatus_SnomedCt" element
     */
    boolean isSetAccommodationStatusSnomedCt();
    
    /**
     * Sets the "AccommodationStatus_SnomedCt" element
     */
    void setAccommodationStatusSnomedCt(java.lang.String accommodationStatusSnomedCt);
    
    /**
     * Sets (as xml) the "AccommodationStatus_SnomedCt" element
     */
    void xsetAccommodationStatusSnomedCt(uk.nhs.nhsia.datastandards.ecds.N618ECType accommodationStatusSnomedCt);
    
    /**
     * Unsets the "AccommodationStatus_SnomedCt" element
     */
    void unsetAccommodationStatusSnomedCt();
    
    /**
     * Gets the "PreferredSpokenLanguage_SnomedCt" element
     */
    java.lang.String getPreferredSpokenLanguageSnomedCt();
    
    /**
     * Gets (as xml) the "PreferredSpokenLanguage_SnomedCt" element
     */
    uk.nhs.nhsia.datastandards.ecds.N618ECType xgetPreferredSpokenLanguageSnomedCt();
    
    /**
     * True if has "PreferredSpokenLanguage_SnomedCt" element
     */
    boolean isSetPreferredSpokenLanguageSnomedCt();
    
    /**
     * Sets the "PreferredSpokenLanguage_SnomedCt" element
     */
    void setPreferredSpokenLanguageSnomedCt(java.lang.String preferredSpokenLanguageSnomedCt);
    
    /**
     * Sets (as xml) the "PreferredSpokenLanguage_SnomedCt" element
     */
    void xsetPreferredSpokenLanguageSnomedCt(uk.nhs.nhsia.datastandards.ecds.N618ECType preferredSpokenLanguageSnomedCt);
    
    /**
     * Unsets the "PreferredSpokenLanguage_SnomedCt" element
     */
    void unsetPreferredSpokenLanguageSnomedCt();
    
    /**
     * Gets the "AccessibleInformationProfessionalRequiredCode_SnomedCt" element
     */
    java.lang.String getAccessibleInformationProfessionalRequiredCodeSnomedCt();
    
    /**
     * Gets (as xml) the "AccessibleInformationProfessionalRequiredCode_SnomedCt" element
     */
    uk.nhs.nhsia.datastandards.ecds.N618ECType xgetAccessibleInformationProfessionalRequiredCodeSnomedCt();
    
    /**
     * True if has "AccessibleInformationProfessionalRequiredCode_SnomedCt" element
     */
    boolean isSetAccessibleInformationProfessionalRequiredCodeSnomedCt();
    
    /**
     * Sets the "AccessibleInformationProfessionalRequiredCode_SnomedCt" element
     */
    void setAccessibleInformationProfessionalRequiredCodeSnomedCt(java.lang.String accessibleInformationProfessionalRequiredCodeSnomedCt);
    
    /**
     * Sets (as xml) the "AccessibleInformationProfessionalRequiredCode_SnomedCt" element
     */
    void xsetAccessibleInformationProfessionalRequiredCodeSnomedCt(uk.nhs.nhsia.datastandards.ecds.N618ECType accessibleInformationProfessionalRequiredCodeSnomedCt);
    
    /**
     * Unsets the "AccessibleInformationProfessionalRequiredCode_SnomedCt" element
     */
    void unsetAccessibleInformationProfessionalRequiredCodeSnomedCt();
    
    /**
     * Gets the "InterpreterLanguage_SnomedCt" element
     */
    java.lang.String getInterpreterLanguageSnomedCt();
    
    /**
     * Gets (as xml) the "InterpreterLanguage_SnomedCt" element
     */
    uk.nhs.nhsia.datastandards.ecds.N618ECType xgetInterpreterLanguageSnomedCt();
    
    /**
     * True if has "InterpreterLanguage_SnomedCt" element
     */
    boolean isSetInterpreterLanguageSnomedCt();
    
    /**
     * Sets the "InterpreterLanguage_SnomedCt" element
     */
    void setInterpreterLanguageSnomedCt(java.lang.String interpreterLanguageSnomedCt);
    
    /**
     * Sets (as xml) the "InterpreterLanguage_SnomedCt" element
     */
    void xsetInterpreterLanguageSnomedCt(uk.nhs.nhsia.datastandards.ecds.N618ECType interpreterLanguageSnomedCt);
    
    /**
     * Unsets the "InterpreterLanguage_SnomedCt" element
     */
    void unsetInterpreterLanguageSnomedCt();
    
    /**
     * Gets the "OverseasVisitorChargingCategoryAtCdsActivityDate" element
     */
    uk.nhs.nhsia.datastandards.ecds.OverseasECType.Enum getOverseasVisitorChargingCategoryAtCdsActivityDate();
    
    /**
     * Gets (as xml) the "OverseasVisitorChargingCategoryAtCdsActivityDate" element
     */
    uk.nhs.nhsia.datastandards.ecds.OverseasECType xgetOverseasVisitorChargingCategoryAtCdsActivityDate();
    
    /**
     * True if has "OverseasVisitorChargingCategoryAtCdsActivityDate" element
     */
    boolean isSetOverseasVisitorChargingCategoryAtCdsActivityDate();
    
    /**
     * Sets the "OverseasVisitorChargingCategoryAtCdsActivityDate" element
     */
    void setOverseasVisitorChargingCategoryAtCdsActivityDate(uk.nhs.nhsia.datastandards.ecds.OverseasECType.Enum overseasVisitorChargingCategoryAtCdsActivityDate);
    
    /**
     * Sets (as xml) the "OverseasVisitorChargingCategoryAtCdsActivityDate" element
     */
    void xsetOverseasVisitorChargingCategoryAtCdsActivityDate(uk.nhs.nhsia.datastandards.ecds.OverseasECType overseasVisitorChargingCategoryAtCdsActivityDate);
    
    /**
     * Unsets the "OverseasVisitorChargingCategoryAtCdsActivityDate" element
     */
    void unsetOverseasVisitorChargingCategoryAtCdsActivityDate();
    
    /**
     * A factory class with static methods for creating instances
     * of this type.
     */
    
    public static final class Factory
    {
        public static uk.nhs.nhsia.datastandards.ecds.PatientCharacteristicsEmergencyCareStructure newInstance() {
          return (uk.nhs.nhsia.datastandards.ecds.PatientCharacteristicsEmergencyCareStructure) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().newInstance( type, null ); }
        
        public static uk.nhs.nhsia.datastandards.ecds.PatientCharacteristicsEmergencyCareStructure newInstance(org.apache.xmlbeans.XmlOptions options) {
          return (uk.nhs.nhsia.datastandards.ecds.PatientCharacteristicsEmergencyCareStructure) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().newInstance( type, options ); }
        
        /** @param xmlAsString the string value to parse */
        public static uk.nhs.nhsia.datastandards.ecds.PatientCharacteristicsEmergencyCareStructure parse(java.lang.String xmlAsString) throws org.apache.xmlbeans.XmlException {
          return (uk.nhs.nhsia.datastandards.ecds.PatientCharacteristicsEmergencyCareStructure) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( xmlAsString, type, null ); }
        
        public static uk.nhs.nhsia.datastandards.ecds.PatientCharacteristicsEmergencyCareStructure parse(java.lang.String xmlAsString, org.apache.xmlbeans.XmlOptions options) throws org.apache.xmlbeans.XmlException {
          return (uk.nhs.nhsia.datastandards.ecds.PatientCharacteristicsEmergencyCareStructure) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( xmlAsString, type, options ); }
        
        /** @param file the file from which to load an xml document */
        public static uk.nhs.nhsia.datastandards.ecds.PatientCharacteristicsEmergencyCareStructure parse(java.io.File file) throws org.apache.xmlbeans.XmlException, java.io.IOException {
          return (uk.nhs.nhsia.datastandards.ecds.PatientCharacteristicsEmergencyCareStructure) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( file, type, null ); }
        
        public static uk.nhs.nhsia.datastandards.ecds.PatientCharacteristicsEmergencyCareStructure parse(java.io.File file, org.apache.xmlbeans.XmlOptions options) throws org.apache.xmlbeans.XmlException, java.io.IOException {
          return (uk.nhs.nhsia.datastandards.ecds.PatientCharacteristicsEmergencyCareStructure) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( file, type, options ); }
        
        public static uk.nhs.nhsia.datastandards.ecds.PatientCharacteristicsEmergencyCareStructure parse(java.net.URL u) throws org.apache.xmlbeans.XmlException, java.io.IOException {
          return (uk.nhs.nhsia.datastandards.ecds.PatientCharacteristicsEmergencyCareStructure) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( u, type, null ); }
        
        public static uk.nhs.nhsia.datastandards.ecds.PatientCharacteristicsEmergencyCareStructure parse(java.net.URL u, org.apache.xmlbeans.XmlOptions options) throws org.apache.xmlbeans.XmlException, java.io.IOException {
          return (uk.nhs.nhsia.datastandards.ecds.PatientCharacteristicsEmergencyCareStructure) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( u, type, options ); }
        
        public static uk.nhs.nhsia.datastandards.ecds.PatientCharacteristicsEmergencyCareStructure parse(java.io.InputStream is) throws org.apache.xmlbeans.XmlException, java.io.IOException {
          return (uk.nhs.nhsia.datastandards.ecds.PatientCharacteristicsEmergencyCareStructure) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( is, type, null ); }
        
        public static uk.nhs.nhsia.datastandards.ecds.PatientCharacteristicsEmergencyCareStructure parse(java.io.InputStream is, org.apache.xmlbeans.XmlOptions options) throws org.apache.xmlbeans.XmlException, java.io.IOException {
          return (uk.nhs.nhsia.datastandards.ecds.PatientCharacteristicsEmergencyCareStructure) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( is, type, options ); }
        
        public static uk.nhs.nhsia.datastandards.ecds.PatientCharacteristicsEmergencyCareStructure parse(java.io.Reader r) throws org.apache.xmlbeans.XmlException, java.io.IOException {
          return (uk.nhs.nhsia.datastandards.ecds.PatientCharacteristicsEmergencyCareStructure) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( r, type, null ); }
        
        public static uk.nhs.nhsia.datastandards.ecds.PatientCharacteristicsEmergencyCareStructure parse(java.io.Reader r, org.apache.xmlbeans.XmlOptions options) throws org.apache.xmlbeans.XmlException, java.io.IOException {
          return (uk.nhs.nhsia.datastandards.ecds.PatientCharacteristicsEmergencyCareStructure) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( r, type, options ); }
        
        public static uk.nhs.nhsia.datastandards.ecds.PatientCharacteristicsEmergencyCareStructure parse(javax.xml.stream.XMLStreamReader sr) throws org.apache.xmlbeans.XmlException {
          return (uk.nhs.nhsia.datastandards.ecds.PatientCharacteristicsEmergencyCareStructure) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( sr, type, null ); }
        
        public static uk.nhs.nhsia.datastandards.ecds.PatientCharacteristicsEmergencyCareStructure parse(javax.xml.stream.XMLStreamReader sr, org.apache.xmlbeans.XmlOptions options) throws org.apache.xmlbeans.XmlException {
          return (uk.nhs.nhsia.datastandards.ecds.PatientCharacteristicsEmergencyCareStructure) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( sr, type, options ); }
        
        public static uk.nhs.nhsia.datastandards.ecds.PatientCharacteristicsEmergencyCareStructure parse(org.w3c.dom.Node node) throws org.apache.xmlbeans.XmlException {
          return (uk.nhs.nhsia.datastandards.ecds.PatientCharacteristicsEmergencyCareStructure) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( node, type, null ); }
        
        public static uk.nhs.nhsia.datastandards.ecds.PatientCharacteristicsEmergencyCareStructure parse(org.w3c.dom.Node node, org.apache.xmlbeans.XmlOptions options) throws org.apache.xmlbeans.XmlException {
          return (uk.nhs.nhsia.datastandards.ecds.PatientCharacteristicsEmergencyCareStructure) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( node, type, options ); }
        
        /** @deprecated {@link org.apache.xmlbeans.xml.stream.XMLInputStream} */
        public static uk.nhs.nhsia.datastandards.ecds.PatientCharacteristicsEmergencyCareStructure parse(org.apache.xmlbeans.xml.stream.XMLInputStream xis) throws org.apache.xmlbeans.XmlException, org.apache.xmlbeans.xml.stream.XMLStreamException {
          return (uk.nhs.nhsia.datastandards.ecds.PatientCharacteristicsEmergencyCareStructure) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( xis, type, null ); }
        
        /** @deprecated {@link org.apache.xmlbeans.xml.stream.XMLInputStream} */
        public static uk.nhs.nhsia.datastandards.ecds.PatientCharacteristicsEmergencyCareStructure parse(org.apache.xmlbeans.xml.stream.XMLInputStream xis, org.apache.xmlbeans.XmlOptions options) throws org.apache.xmlbeans.XmlException, org.apache.xmlbeans.xml.stream.XMLStreamException {
          return (uk.nhs.nhsia.datastandards.ecds.PatientCharacteristicsEmergencyCareStructure) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( xis, type, options ); }
        
        /** @deprecated {@link org.apache.xmlbeans.xml.stream.XMLInputStream} */
        public static org.apache.xmlbeans.xml.stream.XMLInputStream newValidatingXMLInputStream(org.apache.xmlbeans.xml.stream.XMLInputStream xis) throws org.apache.xmlbeans.XmlException, org.apache.xmlbeans.xml.stream.XMLStreamException {
          return org.apache.xmlbeans.XmlBeans.getContextTypeLoader().newValidatingXMLInputStream( xis, type, null ); }
        
        /** @deprecated {@link org.apache.xmlbeans.xml.stream.XMLInputStream} */
        public static org.apache.xmlbeans.xml.stream.XMLInputStream newValidatingXMLInputStream(org.apache.xmlbeans.xml.stream.XMLInputStream xis, org.apache.xmlbeans.XmlOptions options) throws org.apache.xmlbeans.XmlException, org.apache.xmlbeans.xml.stream.XMLStreamException {
          return org.apache.xmlbeans.XmlBeans.getContextTypeLoader().newValidatingXMLInputStream( xis, type, options ); }
        
        private Factory() { } // No instance of this class allowed
    }
}
