/*
 * XML Type:  PatientCharacteristics_Psychiatric_Structure
 * Namespace: http://www.nhsia.nhs.uk/DataStandards/XMLschema/CDS/ns
 * Java type: uk.nhs.nhsia.datastandards.ecds.PatientCharacteristicsPsychiatricStructure
 *
 * Automatically generated - do not modify.
 */
package uk.nhs.nhsia.datastandards.ecds;


/**
 * An XML PatientCharacteristics_Psychiatric_Structure(@http://www.nhsia.nhs.uk/DataStandards/XMLschema/CDS/ns).
 *
 * This is a complex type.
 */
public interface PatientCharacteristicsPsychiatricStructure extends org.apache.xmlbeans.XmlObject
{
    public static final org.apache.xmlbeans.SchemaType type = (org.apache.xmlbeans.SchemaType)
        org.apache.xmlbeans.XmlBeans.typeSystemForClassLoader(PatientCharacteristicsPsychiatricStructure.class.getClassLoader(), "schemaorg_apache_xmlbeans.system.s30C1180FF47174E0C8A992A2D657328B").resolveHandle("patientcharacteristicspsychiatricstructure69betype");
    
    /**
     * Gets the "MentalHealthActLegalStatusClassificationCode_AtCensusDate" element
     */
    uk.nhs.nhsia.datastandards.ecds.MentalHealthActLegalStatusClassificationCodeType.Enum getMentalHealthActLegalStatusClassificationCodeAtCensusDate();
    
    /**
     * Gets (as xml) the "MentalHealthActLegalStatusClassificationCode_AtCensusDate" element
     */
    uk.nhs.nhsia.datastandards.ecds.MentalHealthActLegalStatusClassificationCodeAtCensusDateType xgetMentalHealthActLegalStatusClassificationCodeAtCensusDate();
    
    /**
     * True if has "MentalHealthActLegalStatusClassificationCode_AtCensusDate" element
     */
    boolean isSetMentalHealthActLegalStatusClassificationCodeAtCensusDate();
    
    /**
     * Sets the "MentalHealthActLegalStatusClassificationCode_AtCensusDate" element
     */
    void setMentalHealthActLegalStatusClassificationCodeAtCensusDate(uk.nhs.nhsia.datastandards.ecds.MentalHealthActLegalStatusClassificationCodeType.Enum mentalHealthActLegalStatusClassificationCodeAtCensusDate);
    
    /**
     * Sets (as xml) the "MentalHealthActLegalStatusClassificationCode_AtCensusDate" element
     */
    void xsetMentalHealthActLegalStatusClassificationCodeAtCensusDate(uk.nhs.nhsia.datastandards.ecds.MentalHealthActLegalStatusClassificationCodeAtCensusDateType mentalHealthActLegalStatusClassificationCodeAtCensusDate);
    
    /**
     * Unsets the "MentalHealthActLegalStatusClassificationCode_AtCensusDate" element
     */
    void unsetMentalHealthActLegalStatusClassificationCodeAtCensusDate();
    
    /**
     * Gets the "DateDetentionCommenced" element
     */
    java.util.Calendar getDateDetentionCommenced();
    
    /**
     * Gets (as xml) the "DateDetentionCommenced" element
     */
    uk.nhs.nhsia.datastandards.ecds.DateDetentionCommencedType xgetDateDetentionCommenced();
    
    /**
     * True if has "DateDetentionCommenced" element
     */
    boolean isSetDateDetentionCommenced();
    
    /**
     * Sets the "DateDetentionCommenced" element
     */
    void setDateDetentionCommenced(java.util.Calendar dateDetentionCommenced);
    
    /**
     * Sets (as xml) the "DateDetentionCommenced" element
     */
    void xsetDateDetentionCommenced(uk.nhs.nhsia.datastandards.ecds.DateDetentionCommencedType dateDetentionCommenced);
    
    /**
     * Unsets the "DateDetentionCommenced" element
     */
    void unsetDateDetentionCommenced();
    
    /**
     * Gets the "AgeAtCensus" element
     */
    int getAgeAtCensus();
    
    /**
     * Gets (as xml) the "AgeAtCensus" element
     */
    uk.nhs.nhsia.datastandards.ecds.AgeAtCensusType xgetAgeAtCensus();
    
    /**
     * Sets the "AgeAtCensus" element
     */
    void setAgeAtCensus(int ageAtCensus);
    
    /**
     * Sets (as xml) the "AgeAtCensus" element
     */
    void xsetAgeAtCensus(uk.nhs.nhsia.datastandards.ecds.AgeAtCensusType ageAtCensus);
    
    /**
     * Gets the "DurationOfCareToPsychiatricCensusDate" element
     */
    int getDurationOfCareToPsychiatricCensusDate();
    
    /**
     * Gets (as xml) the "DurationOfCareToPsychiatricCensusDate" element
     */
    uk.nhs.nhsia.datastandards.ecds.DurationOfCareToPsychiatricCensusDateType xgetDurationOfCareToPsychiatricCensusDate();
    
    /**
     * True if has "DurationOfCareToPsychiatricCensusDate" element
     */
    boolean isSetDurationOfCareToPsychiatricCensusDate();
    
    /**
     * Sets the "DurationOfCareToPsychiatricCensusDate" element
     */
    void setDurationOfCareToPsychiatricCensusDate(int durationOfCareToPsychiatricCensusDate);
    
    /**
     * Sets (as xml) the "DurationOfCareToPsychiatricCensusDate" element
     */
    void xsetDurationOfCareToPsychiatricCensusDate(uk.nhs.nhsia.datastandards.ecds.DurationOfCareToPsychiatricCensusDateType durationOfCareToPsychiatricCensusDate);
    
    /**
     * Unsets the "DurationOfCareToPsychiatricCensusDate" element
     */
    void unsetDurationOfCareToPsychiatricCensusDate();
    
    /**
     * Gets the "DurationOfDetention" element
     */
    int getDurationOfDetention();
    
    /**
     * Gets (as xml) the "DurationOfDetention" element
     */
    uk.nhs.nhsia.datastandards.ecds.DurationOfDetentionType xgetDurationOfDetention();
    
    /**
     * True if has "DurationOfDetention" element
     */
    boolean isSetDurationOfDetention();
    
    /**
     * Sets the "DurationOfDetention" element
     */
    void setDurationOfDetention(int durationOfDetention);
    
    /**
     * Sets (as xml) the "DurationOfDetention" element
     */
    void xsetDurationOfDetention(uk.nhs.nhsia.datastandards.ecds.DurationOfDetentionType durationOfDetention);
    
    /**
     * Unsets the "DurationOfDetention" element
     */
    void unsetDurationOfDetention();
    
    /**
     * Gets the "MentalHealthAct2007_MentalCategory" element
     */
    uk.nhs.nhsia.datastandards.ecds.MentalHealthAct2007MentalCategoryType.Enum getMentalHealthAct2007MentalCategory();
    
    /**
     * Gets (as xml) the "MentalHealthAct2007_MentalCategory" element
     */
    uk.nhs.nhsia.datastandards.ecds.MentalHealthAct2007MentalCategoryType xgetMentalHealthAct2007MentalCategory();
    
    /**
     * True if has "MentalHealthAct2007_MentalCategory" element
     */
    boolean isSetMentalHealthAct2007MentalCategory();
    
    /**
     * Sets the "MentalHealthAct2007_MentalCategory" element
     */
    void setMentalHealthAct2007MentalCategory(uk.nhs.nhsia.datastandards.ecds.MentalHealthAct2007MentalCategoryType.Enum mentalHealthAct2007MentalCategory);
    
    /**
     * Sets (as xml) the "MentalHealthAct2007_MentalCategory" element
     */
    void xsetMentalHealthAct2007MentalCategory(uk.nhs.nhsia.datastandards.ecds.MentalHealthAct2007MentalCategoryType mentalHealthAct2007MentalCategory);
    
    /**
     * Unsets the "MentalHealthAct2007_MentalCategory" element
     */
    void unsetMentalHealthAct2007MentalCategory();
    
    /**
     * Gets the "StatusOfPatientIncludedInThePsychiatricCensusCode" element
     */
    uk.nhs.nhsia.datastandards.ecds.StatusOfPatientIncludedInThePsychiatricCensusCodeType.Enum getStatusOfPatientIncludedInThePsychiatricCensusCode();
    
    /**
     * Gets (as xml) the "StatusOfPatientIncludedInThePsychiatricCensusCode" element
     */
    uk.nhs.nhsia.datastandards.ecds.StatusOfPatientIncludedInThePsychiatricCensusCodeType xgetStatusOfPatientIncludedInThePsychiatricCensusCode();
    
    /**
     * True if has "StatusOfPatientIncludedInThePsychiatricCensusCode" element
     */
    boolean isSetStatusOfPatientIncludedInThePsychiatricCensusCode();
    
    /**
     * Sets the "StatusOfPatientIncludedInThePsychiatricCensusCode" element
     */
    void setStatusOfPatientIncludedInThePsychiatricCensusCode(uk.nhs.nhsia.datastandards.ecds.StatusOfPatientIncludedInThePsychiatricCensusCodeType.Enum statusOfPatientIncludedInThePsychiatricCensusCode);
    
    /**
     * Sets (as xml) the "StatusOfPatientIncludedInThePsychiatricCensusCode" element
     */
    void xsetStatusOfPatientIncludedInThePsychiatricCensusCode(uk.nhs.nhsia.datastandards.ecds.StatusOfPatientIncludedInThePsychiatricCensusCodeType statusOfPatientIncludedInThePsychiatricCensusCode);
    
    /**
     * Unsets the "StatusOfPatientIncludedInThePsychiatricCensusCode" element
     */
    void unsetStatusOfPatientIncludedInThePsychiatricCensusCode();
    
    /**
     * A factory class with static methods for creating instances
     * of this type.
     */
    
    public static final class Factory
    {
        public static uk.nhs.nhsia.datastandards.ecds.PatientCharacteristicsPsychiatricStructure newInstance() {
          return (uk.nhs.nhsia.datastandards.ecds.PatientCharacteristicsPsychiatricStructure) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().newInstance( type, null ); }
        
        public static uk.nhs.nhsia.datastandards.ecds.PatientCharacteristicsPsychiatricStructure newInstance(org.apache.xmlbeans.XmlOptions options) {
          return (uk.nhs.nhsia.datastandards.ecds.PatientCharacteristicsPsychiatricStructure) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().newInstance( type, options ); }
        
        /** @param xmlAsString the string value to parse */
        public static uk.nhs.nhsia.datastandards.ecds.PatientCharacteristicsPsychiatricStructure parse(java.lang.String xmlAsString) throws org.apache.xmlbeans.XmlException {
          return (uk.nhs.nhsia.datastandards.ecds.PatientCharacteristicsPsychiatricStructure) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( xmlAsString, type, null ); }
        
        public static uk.nhs.nhsia.datastandards.ecds.PatientCharacteristicsPsychiatricStructure parse(java.lang.String xmlAsString, org.apache.xmlbeans.XmlOptions options) throws org.apache.xmlbeans.XmlException {
          return (uk.nhs.nhsia.datastandards.ecds.PatientCharacteristicsPsychiatricStructure) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( xmlAsString, type, options ); }
        
        /** @param file the file from which to load an xml document */
        public static uk.nhs.nhsia.datastandards.ecds.PatientCharacteristicsPsychiatricStructure parse(java.io.File file) throws org.apache.xmlbeans.XmlException, java.io.IOException {
          return (uk.nhs.nhsia.datastandards.ecds.PatientCharacteristicsPsychiatricStructure) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( file, type, null ); }
        
        public static uk.nhs.nhsia.datastandards.ecds.PatientCharacteristicsPsychiatricStructure parse(java.io.File file, org.apache.xmlbeans.XmlOptions options) throws org.apache.xmlbeans.XmlException, java.io.IOException {
          return (uk.nhs.nhsia.datastandards.ecds.PatientCharacteristicsPsychiatricStructure) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( file, type, options ); }
        
        public static uk.nhs.nhsia.datastandards.ecds.PatientCharacteristicsPsychiatricStructure parse(java.net.URL u) throws org.apache.xmlbeans.XmlException, java.io.IOException {
          return (uk.nhs.nhsia.datastandards.ecds.PatientCharacteristicsPsychiatricStructure) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( u, type, null ); }
        
        public static uk.nhs.nhsia.datastandards.ecds.PatientCharacteristicsPsychiatricStructure parse(java.net.URL u, org.apache.xmlbeans.XmlOptions options) throws org.apache.xmlbeans.XmlException, java.io.IOException {
          return (uk.nhs.nhsia.datastandards.ecds.PatientCharacteristicsPsychiatricStructure) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( u, type, options ); }
        
        public static uk.nhs.nhsia.datastandards.ecds.PatientCharacteristicsPsychiatricStructure parse(java.io.InputStream is) throws org.apache.xmlbeans.XmlException, java.io.IOException {
          return (uk.nhs.nhsia.datastandards.ecds.PatientCharacteristicsPsychiatricStructure) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( is, type, null ); }
        
        public static uk.nhs.nhsia.datastandards.ecds.PatientCharacteristicsPsychiatricStructure parse(java.io.InputStream is, org.apache.xmlbeans.XmlOptions options) throws org.apache.xmlbeans.XmlException, java.io.IOException {
          return (uk.nhs.nhsia.datastandards.ecds.PatientCharacteristicsPsychiatricStructure) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( is, type, options ); }
        
        public static uk.nhs.nhsia.datastandards.ecds.PatientCharacteristicsPsychiatricStructure parse(java.io.Reader r) throws org.apache.xmlbeans.XmlException, java.io.IOException {
          return (uk.nhs.nhsia.datastandards.ecds.PatientCharacteristicsPsychiatricStructure) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( r, type, null ); }
        
        public static uk.nhs.nhsia.datastandards.ecds.PatientCharacteristicsPsychiatricStructure parse(java.io.Reader r, org.apache.xmlbeans.XmlOptions options) throws org.apache.xmlbeans.XmlException, java.io.IOException {
          return (uk.nhs.nhsia.datastandards.ecds.PatientCharacteristicsPsychiatricStructure) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( r, type, options ); }
        
        public static uk.nhs.nhsia.datastandards.ecds.PatientCharacteristicsPsychiatricStructure parse(javax.xml.stream.XMLStreamReader sr) throws org.apache.xmlbeans.XmlException {
          return (uk.nhs.nhsia.datastandards.ecds.PatientCharacteristicsPsychiatricStructure) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( sr, type, null ); }
        
        public static uk.nhs.nhsia.datastandards.ecds.PatientCharacteristicsPsychiatricStructure parse(javax.xml.stream.XMLStreamReader sr, org.apache.xmlbeans.XmlOptions options) throws org.apache.xmlbeans.XmlException {
          return (uk.nhs.nhsia.datastandards.ecds.PatientCharacteristicsPsychiatricStructure) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( sr, type, options ); }
        
        public static uk.nhs.nhsia.datastandards.ecds.PatientCharacteristicsPsychiatricStructure parse(org.w3c.dom.Node node) throws org.apache.xmlbeans.XmlException {
          return (uk.nhs.nhsia.datastandards.ecds.PatientCharacteristicsPsychiatricStructure) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( node, type, null ); }
        
        public static uk.nhs.nhsia.datastandards.ecds.PatientCharacteristicsPsychiatricStructure parse(org.w3c.dom.Node node, org.apache.xmlbeans.XmlOptions options) throws org.apache.xmlbeans.XmlException {
          return (uk.nhs.nhsia.datastandards.ecds.PatientCharacteristicsPsychiatricStructure) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( node, type, options ); }
        
        /** @deprecated {@link org.apache.xmlbeans.xml.stream.XMLInputStream} */
        public static uk.nhs.nhsia.datastandards.ecds.PatientCharacteristicsPsychiatricStructure parse(org.apache.xmlbeans.xml.stream.XMLInputStream xis) throws org.apache.xmlbeans.XmlException, org.apache.xmlbeans.xml.stream.XMLStreamException {
          return (uk.nhs.nhsia.datastandards.ecds.PatientCharacteristicsPsychiatricStructure) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( xis, type, null ); }
        
        /** @deprecated {@link org.apache.xmlbeans.xml.stream.XMLInputStream} */
        public static uk.nhs.nhsia.datastandards.ecds.PatientCharacteristicsPsychiatricStructure parse(org.apache.xmlbeans.xml.stream.XMLInputStream xis, org.apache.xmlbeans.XmlOptions options) throws org.apache.xmlbeans.XmlException, org.apache.xmlbeans.xml.stream.XMLStreamException {
          return (uk.nhs.nhsia.datastandards.ecds.PatientCharacteristicsPsychiatricStructure) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( xis, type, options ); }
        
        /** @deprecated {@link org.apache.xmlbeans.xml.stream.XMLInputStream} */
        public static org.apache.xmlbeans.xml.stream.XMLInputStream newValidatingXMLInputStream(org.apache.xmlbeans.xml.stream.XMLInputStream xis) throws org.apache.xmlbeans.XmlException, org.apache.xmlbeans.xml.stream.XMLStreamException {
          return org.apache.xmlbeans.XmlBeans.getContextTypeLoader().newValidatingXMLInputStream( xis, type, null ); }
        
        /** @deprecated {@link org.apache.xmlbeans.xml.stream.XMLInputStream} */
        public static org.apache.xmlbeans.xml.stream.XMLInputStream newValidatingXMLInputStream(org.apache.xmlbeans.xml.stream.XMLInputStream xis, org.apache.xmlbeans.XmlOptions options) throws org.apache.xmlbeans.XmlException, org.apache.xmlbeans.xml.stream.XMLStreamException {
          return org.apache.xmlbeans.XmlBeans.getContextTypeLoader().newValidatingXMLInputStream( xis, type, options ); }
        
        private Factory() { } // No instance of this class allowed
    }
}
