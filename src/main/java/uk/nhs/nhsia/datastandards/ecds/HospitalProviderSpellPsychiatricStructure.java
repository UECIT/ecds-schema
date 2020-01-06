/*
 * XML Type:  HospitalProviderSpellPsychiatric_Structure
 * Namespace: http://www.nhsia.nhs.uk/DataStandards/XMLschema/CDS/ns
 * Java type: uk.nhs.nhsia.datastandards.ecds.HospitalProviderSpellPsychiatricStructure
 *
 * Automatically generated - do not modify.
 */
package uk.nhs.nhsia.datastandards.ecds;


/**
 * An XML HospitalProviderSpellPsychiatric_Structure(@http://www.nhsia.nhs.uk/DataStandards/XMLschema/CDS/ns).
 *
 * This is a complex type.
 */
public interface HospitalProviderSpellPsychiatricStructure extends org.apache.xmlbeans.XmlObject
{
    public static final org.apache.xmlbeans.SchemaType type = (org.apache.xmlbeans.SchemaType)
        org.apache.xmlbeans.XmlBeans.typeSystemForClassLoader(HospitalProviderSpellPsychiatricStructure.class.getClassLoader(), "schemaorg_apache_xmlbeans.system.s30C1180FF47174E0C8A992A2D657328B").resolveHandle("hospitalproviderspellpsychiatricstructured94ftype");
    
    /**
     * Gets the "AdmissionCharacteristics" element
     */
    uk.nhs.nhsia.datastandards.ecds.HospitalProviderSpellPsychiatricStructure.AdmissionCharacteristics getAdmissionCharacteristics();
    
    /**
     * Sets the "AdmissionCharacteristics" element
     */
    void setAdmissionCharacteristics(uk.nhs.nhsia.datastandards.ecds.HospitalProviderSpellPsychiatricStructure.AdmissionCharacteristics admissionCharacteristics);
    
    /**
     * Appends and returns a new empty "AdmissionCharacteristics" element
     */
    uk.nhs.nhsia.datastandards.ecds.HospitalProviderSpellPsychiatricStructure.AdmissionCharacteristics addNewAdmissionCharacteristics();
    
    /**
     * An XML AdmissionCharacteristics(@http://www.nhsia.nhs.uk/DataStandards/XMLschema/CDS/ns).
     *
     * This is a complex type.
     */
    public interface AdmissionCharacteristics extends org.apache.xmlbeans.XmlObject
    {
        public static final org.apache.xmlbeans.SchemaType type = (org.apache.xmlbeans.SchemaType)
            org.apache.xmlbeans.XmlBeans.typeSystemForClassLoader(AdmissionCharacteristics.class.getClassLoader(), "schemaorg_apache_xmlbeans.system.s30C1180FF47174E0C8A992A2D657328B").resolveHandle("admissioncharacteristicscb7aelemtype");
        
        /**
         * Gets the "HospitalProviderSpellNumber" element
         */
        java.lang.String getHospitalProviderSpellNumber();
        
        /**
         * Gets (as xml) the "HospitalProviderSpellNumber" element
         */
        uk.nhs.nhsia.datastandards.ecds.HospitalProviderSpellNumberType xgetHospitalProviderSpellNumber();
        
        /**
         * True if has "HospitalProviderSpellNumber" element
         */
        boolean isSetHospitalProviderSpellNumber();
        
        /**
         * Sets the "HospitalProviderSpellNumber" element
         */
        void setHospitalProviderSpellNumber(java.lang.String hospitalProviderSpellNumber);
        
        /**
         * Sets (as xml) the "HospitalProviderSpellNumber" element
         */
        void xsetHospitalProviderSpellNumber(uk.nhs.nhsia.datastandards.ecds.HospitalProviderSpellNumberType hospitalProviderSpellNumber);
        
        /**
         * Unsets the "HospitalProviderSpellNumber" element
         */
        void unsetHospitalProviderSpellNumber();
        
        /**
         * Gets the "AdministrativeCategoryCodeOnAdmission" element
         */
        uk.nhs.nhsia.datastandards.ecds.AdministrativeCategoryCodeType.Enum getAdministrativeCategoryCodeOnAdmission();
        
        /**
         * Gets (as xml) the "AdministrativeCategoryCodeOnAdmission" element
         */
        uk.nhs.nhsia.datastandards.ecds.AdministrativeCategoryCodeHospitalProviderSpellType xgetAdministrativeCategoryCodeOnAdmission();
        
        /**
         * True if has "AdministrativeCategoryCodeOnAdmission" element
         */
        boolean isSetAdministrativeCategoryCodeOnAdmission();
        
        /**
         * Sets the "AdministrativeCategoryCodeOnAdmission" element
         */
        void setAdministrativeCategoryCodeOnAdmission(uk.nhs.nhsia.datastandards.ecds.AdministrativeCategoryCodeType.Enum administrativeCategoryCodeOnAdmission);
        
        /**
         * Sets (as xml) the "AdministrativeCategoryCodeOnAdmission" element
         */
        void xsetAdministrativeCategoryCodeOnAdmission(uk.nhs.nhsia.datastandards.ecds.AdministrativeCategoryCodeHospitalProviderSpellType administrativeCategoryCodeOnAdmission);
        
        /**
         * Unsets the "AdministrativeCategoryCodeOnAdmission" element
         */
        void unsetAdministrativeCategoryCodeOnAdmission();
        
        /**
         * Gets the "PatientClassificationCode" element
         */
        uk.nhs.nhsia.datastandards.ecds.PatientClassificationCodeType.Enum getPatientClassificationCode();
        
        /**
         * Gets (as xml) the "PatientClassificationCode" element
         */
        uk.nhs.nhsia.datastandards.ecds.PatientClassificationCodeType xgetPatientClassificationCode();
        
        /**
         * True if has "PatientClassificationCode" element
         */
        boolean isSetPatientClassificationCode();
        
        /**
         * Sets the "PatientClassificationCode" element
         */
        void setPatientClassificationCode(uk.nhs.nhsia.datastandards.ecds.PatientClassificationCodeType.Enum patientClassificationCode);
        
        /**
         * Sets (as xml) the "PatientClassificationCode" element
         */
        void xsetPatientClassificationCode(uk.nhs.nhsia.datastandards.ecds.PatientClassificationCodeType patientClassificationCode);
        
        /**
         * Unsets the "PatientClassificationCode" element
         */
        void unsetPatientClassificationCode();
        
        /**
         * Gets the "AdmissionMethodCode_HospitalProviderSpell" element
         */
        uk.nhs.nhsia.datastandards.ecds.AdmissionMethodCodeHospitalProviderSpellType.Enum getAdmissionMethodCodeHospitalProviderSpell();
        
        /**
         * Gets (as xml) the "AdmissionMethodCode_HospitalProviderSpell" element
         */
        uk.nhs.nhsia.datastandards.ecds.AdmissionMethodCodeHospitalProviderSpellType xgetAdmissionMethodCodeHospitalProviderSpell();
        
        /**
         * True if has "AdmissionMethodCode_HospitalProviderSpell" element
         */
        boolean isSetAdmissionMethodCodeHospitalProviderSpell();
        
        /**
         * Sets the "AdmissionMethodCode_HospitalProviderSpell" element
         */
        void setAdmissionMethodCodeHospitalProviderSpell(uk.nhs.nhsia.datastandards.ecds.AdmissionMethodCodeHospitalProviderSpellType.Enum admissionMethodCodeHospitalProviderSpell);
        
        /**
         * Sets (as xml) the "AdmissionMethodCode_HospitalProviderSpell" element
         */
        void xsetAdmissionMethodCodeHospitalProviderSpell(uk.nhs.nhsia.datastandards.ecds.AdmissionMethodCodeHospitalProviderSpellType admissionMethodCodeHospitalProviderSpell);
        
        /**
         * Unsets the "AdmissionMethodCode_HospitalProviderSpell" element
         */
        void unsetAdmissionMethodCodeHospitalProviderSpell();
        
        /**
         * Gets the "SourceOfAdmissionCode_HospitalProviderSpell" element
         */
        uk.nhs.nhsia.datastandards.ecds.SourceOfAdmissionCodeHospitalProviderSpellType.Enum getSourceOfAdmissionCodeHospitalProviderSpell();
        
        /**
         * Gets (as xml) the "SourceOfAdmissionCode_HospitalProviderSpell" element
         */
        uk.nhs.nhsia.datastandards.ecds.SourceOfAdmissionCodeHospitalProviderSpellType xgetSourceOfAdmissionCodeHospitalProviderSpell();
        
        /**
         * True if has "SourceOfAdmissionCode_HospitalProviderSpell" element
         */
        boolean isSetSourceOfAdmissionCodeHospitalProviderSpell();
        
        /**
         * Sets the "SourceOfAdmissionCode_HospitalProviderSpell" element
         */
        void setSourceOfAdmissionCodeHospitalProviderSpell(uk.nhs.nhsia.datastandards.ecds.SourceOfAdmissionCodeHospitalProviderSpellType.Enum sourceOfAdmissionCodeHospitalProviderSpell);
        
        /**
         * Sets (as xml) the "SourceOfAdmissionCode_HospitalProviderSpell" element
         */
        void xsetSourceOfAdmissionCodeHospitalProviderSpell(uk.nhs.nhsia.datastandards.ecds.SourceOfAdmissionCodeHospitalProviderSpellType sourceOfAdmissionCodeHospitalProviderSpell);
        
        /**
         * Unsets the "SourceOfAdmissionCode_HospitalProviderSpell" element
         */
        void unsetSourceOfAdmissionCodeHospitalProviderSpell();
        
        /**
         * Gets the "StartDate_HospitalProviderSpell" element
         */
        java.util.Calendar getStartDateHospitalProviderSpell();
        
        /**
         * Gets (as xml) the "StartDate_HospitalProviderSpell" element
         */
        uk.nhs.nhsia.datastandards.ecds.StartDateHospitalProviderSpellType xgetStartDateHospitalProviderSpell();
        
        /**
         * Sets the "StartDate_HospitalProviderSpell" element
         */
        void setStartDateHospitalProviderSpell(java.util.Calendar startDateHospitalProviderSpell);
        
        /**
         * Sets (as xml) the "StartDate_HospitalProviderSpell" element
         */
        void xsetStartDateHospitalProviderSpell(uk.nhs.nhsia.datastandards.ecds.StartDateHospitalProviderSpellType startDateHospitalProviderSpell);
        
        /**
         * Gets the "StartTime_HospitalProviderSpell" element
         */
        java.util.Calendar getStartTimeHospitalProviderSpell();
        
        /**
         * Gets (as xml) the "StartTime_HospitalProviderSpell" element
         */
        uk.nhs.nhsia.datastandards.ecds.StartTimeHospitalProviderSpellType xgetStartTimeHospitalProviderSpell();
        
        /**
         * True if has "StartTime_HospitalProviderSpell" element
         */
        boolean isSetStartTimeHospitalProviderSpell();
        
        /**
         * Sets the "StartTime_HospitalProviderSpell" element
         */
        void setStartTimeHospitalProviderSpell(java.util.Calendar startTimeHospitalProviderSpell);
        
        /**
         * Sets (as xml) the "StartTime_HospitalProviderSpell" element
         */
        void xsetStartTimeHospitalProviderSpell(uk.nhs.nhsia.datastandards.ecds.StartTimeHospitalProviderSpellType startTimeHospitalProviderSpell);
        
        /**
         * Unsets the "StartTime_HospitalProviderSpell" element
         */
        void unsetStartTimeHospitalProviderSpell();
        
        /**
         * Gets the "AgeOnAdmission" element
         */
        int getAgeOnAdmission();
        
        /**
         * Gets (as xml) the "AgeOnAdmission" element
         */
        uk.nhs.nhsia.datastandards.ecds.AgeOnAdmissionType xgetAgeOnAdmission();
        
        /**
         * Sets the "AgeOnAdmission" element
         */
        void setAgeOnAdmission(int ageOnAdmission);
        
        /**
         * Sets (as xml) the "AgeOnAdmission" element
         */
        void xsetAgeOnAdmission(uk.nhs.nhsia.datastandards.ecds.AgeOnAdmissionType ageOnAdmission);
        
        /**
         * A factory class with static methods for creating instances
         * of this type.
         */
        
        public static final class Factory
        {
            public static uk.nhs.nhsia.datastandards.ecds.HospitalProviderSpellPsychiatricStructure.AdmissionCharacteristics newInstance() {
              return (uk.nhs.nhsia.datastandards.ecds.HospitalProviderSpellPsychiatricStructure.AdmissionCharacteristics) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().newInstance( type, null ); }
            
            public static uk.nhs.nhsia.datastandards.ecds.HospitalProviderSpellPsychiatricStructure.AdmissionCharacteristics newInstance(org.apache.xmlbeans.XmlOptions options) {
              return (uk.nhs.nhsia.datastandards.ecds.HospitalProviderSpellPsychiatricStructure.AdmissionCharacteristics) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().newInstance( type, options ); }
            
            private Factory() { } // No instance of this class allowed
        }
    }
    
    /**
     * A factory class with static methods for creating instances
     * of this type.
     */
    
    public static final class Factory
    {
        public static uk.nhs.nhsia.datastandards.ecds.HospitalProviderSpellPsychiatricStructure newInstance() {
          return (uk.nhs.nhsia.datastandards.ecds.HospitalProviderSpellPsychiatricStructure) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().newInstance( type, null ); }
        
        public static uk.nhs.nhsia.datastandards.ecds.HospitalProviderSpellPsychiatricStructure newInstance(org.apache.xmlbeans.XmlOptions options) {
          return (uk.nhs.nhsia.datastandards.ecds.HospitalProviderSpellPsychiatricStructure) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().newInstance( type, options ); }
        
        /** @param xmlAsString the string value to parse */
        public static uk.nhs.nhsia.datastandards.ecds.HospitalProviderSpellPsychiatricStructure parse(java.lang.String xmlAsString) throws org.apache.xmlbeans.XmlException {
          return (uk.nhs.nhsia.datastandards.ecds.HospitalProviderSpellPsychiatricStructure) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( xmlAsString, type, null ); }
        
        public static uk.nhs.nhsia.datastandards.ecds.HospitalProviderSpellPsychiatricStructure parse(java.lang.String xmlAsString, org.apache.xmlbeans.XmlOptions options) throws org.apache.xmlbeans.XmlException {
          return (uk.nhs.nhsia.datastandards.ecds.HospitalProviderSpellPsychiatricStructure) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( xmlAsString, type, options ); }
        
        /** @param file the file from which to load an xml document */
        public static uk.nhs.nhsia.datastandards.ecds.HospitalProviderSpellPsychiatricStructure parse(java.io.File file) throws org.apache.xmlbeans.XmlException, java.io.IOException {
          return (uk.nhs.nhsia.datastandards.ecds.HospitalProviderSpellPsychiatricStructure) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( file, type, null ); }
        
        public static uk.nhs.nhsia.datastandards.ecds.HospitalProviderSpellPsychiatricStructure parse(java.io.File file, org.apache.xmlbeans.XmlOptions options) throws org.apache.xmlbeans.XmlException, java.io.IOException {
          return (uk.nhs.nhsia.datastandards.ecds.HospitalProviderSpellPsychiatricStructure) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( file, type, options ); }
        
        public static uk.nhs.nhsia.datastandards.ecds.HospitalProviderSpellPsychiatricStructure parse(java.net.URL u) throws org.apache.xmlbeans.XmlException, java.io.IOException {
          return (uk.nhs.nhsia.datastandards.ecds.HospitalProviderSpellPsychiatricStructure) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( u, type, null ); }
        
        public static uk.nhs.nhsia.datastandards.ecds.HospitalProviderSpellPsychiatricStructure parse(java.net.URL u, org.apache.xmlbeans.XmlOptions options) throws org.apache.xmlbeans.XmlException, java.io.IOException {
          return (uk.nhs.nhsia.datastandards.ecds.HospitalProviderSpellPsychiatricStructure) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( u, type, options ); }
        
        public static uk.nhs.nhsia.datastandards.ecds.HospitalProviderSpellPsychiatricStructure parse(java.io.InputStream is) throws org.apache.xmlbeans.XmlException, java.io.IOException {
          return (uk.nhs.nhsia.datastandards.ecds.HospitalProviderSpellPsychiatricStructure) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( is, type, null ); }
        
        public static uk.nhs.nhsia.datastandards.ecds.HospitalProviderSpellPsychiatricStructure parse(java.io.InputStream is, org.apache.xmlbeans.XmlOptions options) throws org.apache.xmlbeans.XmlException, java.io.IOException {
          return (uk.nhs.nhsia.datastandards.ecds.HospitalProviderSpellPsychiatricStructure) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( is, type, options ); }
        
        public static uk.nhs.nhsia.datastandards.ecds.HospitalProviderSpellPsychiatricStructure parse(java.io.Reader r) throws org.apache.xmlbeans.XmlException, java.io.IOException {
          return (uk.nhs.nhsia.datastandards.ecds.HospitalProviderSpellPsychiatricStructure) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( r, type, null ); }
        
        public static uk.nhs.nhsia.datastandards.ecds.HospitalProviderSpellPsychiatricStructure parse(java.io.Reader r, org.apache.xmlbeans.XmlOptions options) throws org.apache.xmlbeans.XmlException, java.io.IOException {
          return (uk.nhs.nhsia.datastandards.ecds.HospitalProviderSpellPsychiatricStructure) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( r, type, options ); }
        
        public static uk.nhs.nhsia.datastandards.ecds.HospitalProviderSpellPsychiatricStructure parse(javax.xml.stream.XMLStreamReader sr) throws org.apache.xmlbeans.XmlException {
          return (uk.nhs.nhsia.datastandards.ecds.HospitalProviderSpellPsychiatricStructure) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( sr, type, null ); }
        
        public static uk.nhs.nhsia.datastandards.ecds.HospitalProviderSpellPsychiatricStructure parse(javax.xml.stream.XMLStreamReader sr, org.apache.xmlbeans.XmlOptions options) throws org.apache.xmlbeans.XmlException {
          return (uk.nhs.nhsia.datastandards.ecds.HospitalProviderSpellPsychiatricStructure) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( sr, type, options ); }
        
        public static uk.nhs.nhsia.datastandards.ecds.HospitalProviderSpellPsychiatricStructure parse(org.w3c.dom.Node node) throws org.apache.xmlbeans.XmlException {
          return (uk.nhs.nhsia.datastandards.ecds.HospitalProviderSpellPsychiatricStructure) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( node, type, null ); }
        
        public static uk.nhs.nhsia.datastandards.ecds.HospitalProviderSpellPsychiatricStructure parse(org.w3c.dom.Node node, org.apache.xmlbeans.XmlOptions options) throws org.apache.xmlbeans.XmlException {
          return (uk.nhs.nhsia.datastandards.ecds.HospitalProviderSpellPsychiatricStructure) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( node, type, options ); }
        
        /** @deprecated {@link org.apache.xmlbeans.xml.stream.XMLInputStream} */
        public static uk.nhs.nhsia.datastandards.ecds.HospitalProviderSpellPsychiatricStructure parse(org.apache.xmlbeans.xml.stream.XMLInputStream xis) throws org.apache.xmlbeans.XmlException, org.apache.xmlbeans.xml.stream.XMLStreamException {
          return (uk.nhs.nhsia.datastandards.ecds.HospitalProviderSpellPsychiatricStructure) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( xis, type, null ); }
        
        /** @deprecated {@link org.apache.xmlbeans.xml.stream.XMLInputStream} */
        public static uk.nhs.nhsia.datastandards.ecds.HospitalProviderSpellPsychiatricStructure parse(org.apache.xmlbeans.xml.stream.XMLInputStream xis, org.apache.xmlbeans.XmlOptions options) throws org.apache.xmlbeans.XmlException, org.apache.xmlbeans.xml.stream.XMLStreamException {
          return (uk.nhs.nhsia.datastandards.ecds.HospitalProviderSpellPsychiatricStructure) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( xis, type, options ); }
        
        /** @deprecated {@link org.apache.xmlbeans.xml.stream.XMLInputStream} */
        public static org.apache.xmlbeans.xml.stream.XMLInputStream newValidatingXMLInputStream(org.apache.xmlbeans.xml.stream.XMLInputStream xis) throws org.apache.xmlbeans.XmlException, org.apache.xmlbeans.xml.stream.XMLStreamException {
          return org.apache.xmlbeans.XmlBeans.getContextTypeLoader().newValidatingXMLInputStream( xis, type, null ); }
        
        /** @deprecated {@link org.apache.xmlbeans.xml.stream.XMLInputStream} */
        public static org.apache.xmlbeans.xml.stream.XMLInputStream newValidatingXMLInputStream(org.apache.xmlbeans.xml.stream.XMLInputStream xis, org.apache.xmlbeans.XmlOptions options) throws org.apache.xmlbeans.XmlException, org.apache.xmlbeans.xml.stream.XMLStreamException {
          return org.apache.xmlbeans.XmlBeans.getContextTypeLoader().newValidatingXMLInputStream( xis, type, options ); }
        
        private Factory() { } // No instance of this class allowed
    }
}
