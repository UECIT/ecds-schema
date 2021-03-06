/*
 * XML Type:  PatientIdentity_Birth_Structure
 * Namespace: http://www.nhsia.nhs.uk/DataStandards/XMLschema/CDS/ns
 * Java type: uk.nhs.nhsia.datastandards.ecds.PatientIdentityBirthStructure
 *
 * Automatically generated - do not modify.
 */
package uk.nhs.nhsia.datastandards.ecds;


/**
 * An XML PatientIdentity_Birth_Structure(@http://www.nhsia.nhs.uk/DataStandards/XMLschema/CDS/ns).
 *
 * This is a complex type.
 */
public interface PatientIdentityBirthStructure extends org.apache.xmlbeans.XmlObject
{
    public static final org.apache.xmlbeans.SchemaType type = (org.apache.xmlbeans.SchemaType)
        org.apache.xmlbeans.XmlBeans.typeSystemForClassLoader(PatientIdentityBirthStructure.class.getClassLoader(), "schemaorg_apache_xmlbeans.system.s30C1180FF47174E0C8A992A2D657328B").resolveHandle("patientidentitybirthstructurec7actype");
    
    /**
     * Gets the "WithheldIdentity_Structure" element
     */
    uk.nhs.nhsia.datastandards.ecds.PatientIdentityBirthStructure.WithheldIdentityStructure getWithheldIdentityStructure();
    
    /**
     * True if has "WithheldIdentity_Structure" element
     */
    boolean isSetWithheldIdentityStructure();
    
    /**
     * Sets the "WithheldIdentity_Structure" element
     */
    void setWithheldIdentityStructure(uk.nhs.nhsia.datastandards.ecds.PatientIdentityBirthStructure.WithheldIdentityStructure withheldIdentityStructure);
    
    /**
     * Appends and returns a new empty "WithheldIdentity_Structure" element
     */
    uk.nhs.nhsia.datastandards.ecds.PatientIdentityBirthStructure.WithheldIdentityStructure addNewWithheldIdentityStructure();
    
    /**
     * Unsets the "WithheldIdentity_Structure" element
     */
    void unsetWithheldIdentityStructure();
    
    /**
     * Gets the "VerifiedIdentity_Structure" element
     */
    uk.nhs.nhsia.datastandards.ecds.PatientIdentityBirthStructure.VerifiedIdentityStructure getVerifiedIdentityStructure();
    
    /**
     * True if has "VerifiedIdentity_Structure" element
     */
    boolean isSetVerifiedIdentityStructure();
    
    /**
     * Sets the "VerifiedIdentity_Structure" element
     */
    void setVerifiedIdentityStructure(uk.nhs.nhsia.datastandards.ecds.PatientIdentityBirthStructure.VerifiedIdentityStructure verifiedIdentityStructure);
    
    /**
     * Appends and returns a new empty "VerifiedIdentity_Structure" element
     */
    uk.nhs.nhsia.datastandards.ecds.PatientIdentityBirthStructure.VerifiedIdentityStructure addNewVerifiedIdentityStructure();
    
    /**
     * Unsets the "VerifiedIdentity_Structure" element
     */
    void unsetVerifiedIdentityStructure();
    
    /**
     * Gets the "UnverifiedIdentity_Structure" element
     */
    uk.nhs.nhsia.datastandards.ecds.PatientIdentityBirthStructure.UnverifiedIdentityStructure getUnverifiedIdentityStructure();
    
    /**
     * True if has "UnverifiedIdentity_Structure" element
     */
    boolean isSetUnverifiedIdentityStructure();
    
    /**
     * Sets the "UnverifiedIdentity_Structure" element
     */
    void setUnverifiedIdentityStructure(uk.nhs.nhsia.datastandards.ecds.PatientIdentityBirthStructure.UnverifiedIdentityStructure unverifiedIdentityStructure);
    
    /**
     * Appends and returns a new empty "UnverifiedIdentity_Structure" element
     */
    uk.nhs.nhsia.datastandards.ecds.PatientIdentityBirthStructure.UnverifiedIdentityStructure addNewUnverifiedIdentityStructure();
    
    /**
     * Unsets the "UnverifiedIdentity_Structure" element
     */
    void unsetUnverifiedIdentityStructure();
    
    /**
     * An XML WithheldIdentity_Structure(@http://www.nhsia.nhs.uk/DataStandards/XMLschema/CDS/ns).
     *
     * This is a complex type.
     */
    public interface WithheldIdentityStructure extends org.apache.xmlbeans.XmlObject
    {
        public static final org.apache.xmlbeans.SchemaType type = (org.apache.xmlbeans.SchemaType)
            org.apache.xmlbeans.XmlBeans.typeSystemForClassLoader(WithheldIdentityStructure.class.getClassLoader(), "schemaorg_apache_xmlbeans.system.s30C1180FF47174E0C8A992A2D657328B").resolveHandle("withheldidentitystructuree5a3elemtype");
        
        /**
         * Gets the "NHSNumberStatusIndicatorCode" element
         */
        uk.nhs.nhsia.datastandards.ecds.NHSNumberStatusIndicatorCodeWithheldType.Enum getNHSNumberStatusIndicatorCode();
        
        /**
         * Gets (as xml) the "NHSNumberStatusIndicatorCode" element
         */
        uk.nhs.nhsia.datastandards.ecds.NHSNumberStatusIndicatorCodeWithheldType xgetNHSNumberStatusIndicatorCode();
        
        /**
         * Sets the "NHSNumberStatusIndicatorCode" element
         */
        void setNHSNumberStatusIndicatorCode(uk.nhs.nhsia.datastandards.ecds.NHSNumberStatusIndicatorCodeWithheldType.Enum nhsNumberStatusIndicatorCode);
        
        /**
         * Sets (as xml) the "NHSNumberStatusIndicatorCode" element
         */
        void xsetNHSNumberStatusIndicatorCode(uk.nhs.nhsia.datastandards.ecds.NHSNumberStatusIndicatorCodeWithheldType nhsNumberStatusIndicatorCode);
        
        /**
         * Gets the "PersonBirthDate" element
         */
        java.util.Calendar getPersonBirthDate();
        
        /**
         * Gets (as xml) the "PersonBirthDate" element
         */
        uk.nhs.nhsia.datastandards.ecds.PersonBirthDateType xgetPersonBirthDate();
        
        /**
         * True if has "PersonBirthDate" element
         */
        boolean isSetPersonBirthDate();
        
        /**
         * Sets the "PersonBirthDate" element
         */
        void setPersonBirthDate(java.util.Calendar personBirthDate);
        
        /**
         * Sets (as xml) the "PersonBirthDate" element
         */
        void xsetPersonBirthDate(uk.nhs.nhsia.datastandards.ecds.PersonBirthDateType personBirthDate);
        
        /**
         * Unsets the "PersonBirthDate" element
         */
        void unsetPersonBirthDate();
        
        /**
         * Gets the "WithheldIdentityReason" element
         */
        uk.nhs.nhsia.datastandards.ecds.WithheldIdentityReasonType.Enum getWithheldIdentityReason();
        
        /**
         * Gets (as xml) the "WithheldIdentityReason" element
         */
        uk.nhs.nhsia.datastandards.ecds.WithheldIdentityReasonType xgetWithheldIdentityReason();
        
        /**
         * True if has "WithheldIdentityReason" element
         */
        boolean isSetWithheldIdentityReason();
        
        /**
         * Sets the "WithheldIdentityReason" element
         */
        void setWithheldIdentityReason(uk.nhs.nhsia.datastandards.ecds.WithheldIdentityReasonType.Enum withheldIdentityReason);
        
        /**
         * Sets (as xml) the "WithheldIdentityReason" element
         */
        void xsetWithheldIdentityReason(uk.nhs.nhsia.datastandards.ecds.WithheldIdentityReasonType withheldIdentityReason);
        
        /**
         * Unsets the "WithheldIdentityReason" element
         */
        void unsetWithheldIdentityReason();
        
        /**
         * Gets the "NHSNumberStatusIndicatorCode" attribute
         */
        uk.nhs.nhsia.datastandards.ecds.NHSNumberStatusIndicatorCodeWithheldType.Enum getNHSNumberStatusIndicatorCode2();
        
        /**
         * Gets (as xml) the "NHSNumberStatusIndicatorCode" attribute
         */
        uk.nhs.nhsia.datastandards.ecds.NHSNumberStatusIndicatorCodeWithheldType xgetNHSNumberStatusIndicatorCode2();
        
        /**
         * Sets the "NHSNumberStatusIndicatorCode" attribute
         */
        void setNHSNumberStatusIndicatorCode2(uk.nhs.nhsia.datastandards.ecds.NHSNumberStatusIndicatorCodeWithheldType.Enum nhsNumberStatusIndicatorCode2);
        
        /**
         * Sets (as xml) the "NHSNumberStatusIndicatorCode" attribute
         */
        void xsetNHSNumberStatusIndicatorCode2(uk.nhs.nhsia.datastandards.ecds.NHSNumberStatusIndicatorCodeWithheldType nhsNumberStatusIndicatorCode2);
        
        /**
         * A factory class with static methods for creating instances
         * of this type.
         */
        
        public static final class Factory
        {
            public static uk.nhs.nhsia.datastandards.ecds.PatientIdentityBirthStructure.WithheldIdentityStructure newInstance() {
              return (uk.nhs.nhsia.datastandards.ecds.PatientIdentityBirthStructure.WithheldIdentityStructure) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().newInstance( type, null ); }
            
            public static uk.nhs.nhsia.datastandards.ecds.PatientIdentityBirthStructure.WithheldIdentityStructure newInstance(org.apache.xmlbeans.XmlOptions options) {
              return (uk.nhs.nhsia.datastandards.ecds.PatientIdentityBirthStructure.WithheldIdentityStructure) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().newInstance( type, options ); }
            
            private Factory() { } // No instance of this class allowed
        }
    }
    
    /**
     * An XML VerifiedIdentity_Structure(@http://www.nhsia.nhs.uk/DataStandards/XMLschema/CDS/ns).
     *
     * This is a complex type.
     */
    public interface VerifiedIdentityStructure extends org.apache.xmlbeans.XmlObject
    {
        public static final org.apache.xmlbeans.SchemaType type = (org.apache.xmlbeans.SchemaType)
            org.apache.xmlbeans.XmlBeans.typeSystemForClassLoader(VerifiedIdentityStructure.class.getClassLoader(), "schemaorg_apache_xmlbeans.system.s30C1180FF47174E0C8A992A2D657328B").resolveHandle("verifiedidentitystructure1db6elemtype");
        
        /**
         * Gets the "LocalPatientIdentifier" element
         */
        java.lang.String getLocalPatientIdentifier();
        
        /**
         * Gets (as xml) the "LocalPatientIdentifier" element
         */
        uk.nhs.nhsia.datastandards.ecds.LocalPatientIdentifierType xgetLocalPatientIdentifier();
        
        /**
         * True if has "LocalPatientIdentifier" element
         */
        boolean isSetLocalPatientIdentifier();
        
        /**
         * Sets the "LocalPatientIdentifier" element
         */
        void setLocalPatientIdentifier(java.lang.String localPatientIdentifier);
        
        /**
         * Sets (as xml) the "LocalPatientIdentifier" element
         */
        void xsetLocalPatientIdentifier(uk.nhs.nhsia.datastandards.ecds.LocalPatientIdentifierType localPatientIdentifier);
        
        /**
         * Unsets the "LocalPatientIdentifier" element
         */
        void unsetLocalPatientIdentifier();
        
        /**
         * Gets the "OrganisationCode_LocalPatientIdentifier" element
         */
        java.lang.String getOrganisationCodeLocalPatientIdentifier();
        
        /**
         * Gets (as xml) the "OrganisationCode_LocalPatientIdentifier" element
         */
        uk.nhs.nhsia.datastandards.ecds.OrganisationCodeType xgetOrganisationCodeLocalPatientIdentifier();
        
        /**
         * True if has "OrganisationCode_LocalPatientIdentifier" element
         */
        boolean isSetOrganisationCodeLocalPatientIdentifier();
        
        /**
         * Sets the "OrganisationCode_LocalPatientIdentifier" element
         */
        void setOrganisationCodeLocalPatientIdentifier(java.lang.String organisationCodeLocalPatientIdentifier);
        
        /**
         * Sets (as xml) the "OrganisationCode_LocalPatientIdentifier" element
         */
        void xsetOrganisationCodeLocalPatientIdentifier(uk.nhs.nhsia.datastandards.ecds.OrganisationCodeType organisationCodeLocalPatientIdentifier);
        
        /**
         * Unsets the "OrganisationCode_LocalPatientIdentifier" element
         */
        void unsetOrganisationCodeLocalPatientIdentifier();
        
        /**
         * Gets the "NHSNumber" element
         */
        java.lang.String getNHSNumber();
        
        /**
         * Gets (as xml) the "NHSNumber" element
         */
        uk.nhs.nhsia.datastandards.ecds.NHSNumberType xgetNHSNumber();
        
        /**
         * Sets the "NHSNumber" element
         */
        void setNHSNumber(java.lang.String nhsNumber);
        
        /**
         * Sets (as xml) the "NHSNumber" element
         */
        void xsetNHSNumber(uk.nhs.nhsia.datastandards.ecds.NHSNumberType nhsNumber);
        
        /**
         * Gets the "NHSNumberStatusIndicatorCode" element
         */
        uk.nhs.nhsia.datastandards.ecds.NHSNumberStatusIndicatorCodeVerifiedType.Enum getNHSNumberStatusIndicatorCode();
        
        /**
         * Gets (as xml) the "NHSNumberStatusIndicatorCode" element
         */
        uk.nhs.nhsia.datastandards.ecds.NHSNumberStatusIndicatorCodeVerifiedType xgetNHSNumberStatusIndicatorCode();
        
        /**
         * Sets the "NHSNumberStatusIndicatorCode" element
         */
        void setNHSNumberStatusIndicatorCode(uk.nhs.nhsia.datastandards.ecds.NHSNumberStatusIndicatorCodeVerifiedType.Enum nhsNumberStatusIndicatorCode);
        
        /**
         * Sets (as xml) the "NHSNumberStatusIndicatorCode" element
         */
        void xsetNHSNumberStatusIndicatorCode(uk.nhs.nhsia.datastandards.ecds.NHSNumberStatusIndicatorCodeVerifiedType nhsNumberStatusIndicatorCode);
        
        /**
         * Gets the "PersonBirthDate" element
         */
        java.util.Calendar getPersonBirthDate();
        
        /**
         * Gets (as xml) the "PersonBirthDate" element
         */
        uk.nhs.nhsia.datastandards.ecds.PersonBirthDateType xgetPersonBirthDate();
        
        /**
         * True if has "PersonBirthDate" element
         */
        boolean isSetPersonBirthDate();
        
        /**
         * Sets the "PersonBirthDate" element
         */
        void setPersonBirthDate(java.util.Calendar personBirthDate);
        
        /**
         * Sets (as xml) the "PersonBirthDate" element
         */
        void xsetPersonBirthDate(uk.nhs.nhsia.datastandards.ecds.PersonBirthDateType personBirthDate);
        
        /**
         * Unsets the "PersonBirthDate" element
         */
        void unsetPersonBirthDate();
        
        /**
         * Gets the "NHSNumberStatusIndicatorCode" attribute
         */
        uk.nhs.nhsia.datastandards.ecds.NHSNumberStatusIndicatorCodeVerifiedType.Enum getNHSNumberStatusIndicatorCode2();
        
        /**
         * Gets (as xml) the "NHSNumberStatusIndicatorCode" attribute
         */
        uk.nhs.nhsia.datastandards.ecds.NHSNumberStatusIndicatorCodeVerifiedType xgetNHSNumberStatusIndicatorCode2();
        
        /**
         * Sets the "NHSNumberStatusIndicatorCode" attribute
         */
        void setNHSNumberStatusIndicatorCode2(uk.nhs.nhsia.datastandards.ecds.NHSNumberStatusIndicatorCodeVerifiedType.Enum nhsNumberStatusIndicatorCode2);
        
        /**
         * Sets (as xml) the "NHSNumberStatusIndicatorCode" attribute
         */
        void xsetNHSNumberStatusIndicatorCode2(uk.nhs.nhsia.datastandards.ecds.NHSNumberStatusIndicatorCodeVerifiedType nhsNumberStatusIndicatorCode2);
        
        /**
         * A factory class with static methods for creating instances
         * of this type.
         */
        
        public static final class Factory
        {
            public static uk.nhs.nhsia.datastandards.ecds.PatientIdentityBirthStructure.VerifiedIdentityStructure newInstance() {
              return (uk.nhs.nhsia.datastandards.ecds.PatientIdentityBirthStructure.VerifiedIdentityStructure) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().newInstance( type, null ); }
            
            public static uk.nhs.nhsia.datastandards.ecds.PatientIdentityBirthStructure.VerifiedIdentityStructure newInstance(org.apache.xmlbeans.XmlOptions options) {
              return (uk.nhs.nhsia.datastandards.ecds.PatientIdentityBirthStructure.VerifiedIdentityStructure) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().newInstance( type, options ); }
            
            private Factory() { } // No instance of this class allowed
        }
    }
    
    /**
     * An XML UnverifiedIdentity_Structure(@http://www.nhsia.nhs.uk/DataStandards/XMLschema/CDS/ns).
     *
     * This is a complex type.
     */
    public interface UnverifiedIdentityStructure extends org.apache.xmlbeans.XmlObject
    {
        public static final org.apache.xmlbeans.SchemaType type = (org.apache.xmlbeans.SchemaType)
            org.apache.xmlbeans.XmlBeans.typeSystemForClassLoader(UnverifiedIdentityStructure.class.getClassLoader(), "schemaorg_apache_xmlbeans.system.s30C1180FF47174E0C8A992A2D657328B").resolveHandle("unverifiedidentitystructuree87delemtype");
        
        /**
         * Gets the "LocalPatientIdentifier" element
         */
        java.lang.String getLocalPatientIdentifier();
        
        /**
         * Gets (as xml) the "LocalPatientIdentifier" element
         */
        uk.nhs.nhsia.datastandards.ecds.LocalPatientIdentifierType xgetLocalPatientIdentifier();
        
        /**
         * True if has "LocalPatientIdentifier" element
         */
        boolean isSetLocalPatientIdentifier();
        
        /**
         * Sets the "LocalPatientIdentifier" element
         */
        void setLocalPatientIdentifier(java.lang.String localPatientIdentifier);
        
        /**
         * Sets (as xml) the "LocalPatientIdentifier" element
         */
        void xsetLocalPatientIdentifier(uk.nhs.nhsia.datastandards.ecds.LocalPatientIdentifierType localPatientIdentifier);
        
        /**
         * Unsets the "LocalPatientIdentifier" element
         */
        void unsetLocalPatientIdentifier();
        
        /**
         * Gets the "OrganisationCode_LocalPatientIdentifier" element
         */
        java.lang.String getOrganisationCodeLocalPatientIdentifier();
        
        /**
         * Gets (as xml) the "OrganisationCode_LocalPatientIdentifier" element
         */
        uk.nhs.nhsia.datastandards.ecds.OrganisationCodeType xgetOrganisationCodeLocalPatientIdentifier();
        
        /**
         * True if has "OrganisationCode_LocalPatientIdentifier" element
         */
        boolean isSetOrganisationCodeLocalPatientIdentifier();
        
        /**
         * Sets the "OrganisationCode_LocalPatientIdentifier" element
         */
        void setOrganisationCodeLocalPatientIdentifier(java.lang.String organisationCodeLocalPatientIdentifier);
        
        /**
         * Sets (as xml) the "OrganisationCode_LocalPatientIdentifier" element
         */
        void xsetOrganisationCodeLocalPatientIdentifier(uk.nhs.nhsia.datastandards.ecds.OrganisationCodeType organisationCodeLocalPatientIdentifier);
        
        /**
         * Unsets the "OrganisationCode_LocalPatientIdentifier" element
         */
        void unsetOrganisationCodeLocalPatientIdentifier();
        
        /**
         * Gets the "NHSNumber" element
         */
        java.lang.String getNHSNumber();
        
        /**
         * Gets (as xml) the "NHSNumber" element
         */
        uk.nhs.nhsia.datastandards.ecds.NHSNumberType xgetNHSNumber();
        
        /**
         * True if has "NHSNumber" element
         */
        boolean isSetNHSNumber();
        
        /**
         * Sets the "NHSNumber" element
         */
        void setNHSNumber(java.lang.String nhsNumber);
        
        /**
         * Sets (as xml) the "NHSNumber" element
         */
        void xsetNHSNumber(uk.nhs.nhsia.datastandards.ecds.NHSNumberType nhsNumber);
        
        /**
         * Unsets the "NHSNumber" element
         */
        void unsetNHSNumber();
        
        /**
         * Gets the "NHSNumberStatusIndicatorCode" element
         */
        uk.nhs.nhsia.datastandards.ecds.NHSNumberStatusIndicatorCodeUnverifiedType.Enum getNHSNumberStatusIndicatorCode();
        
        /**
         * Gets (as xml) the "NHSNumberStatusIndicatorCode" element
         */
        uk.nhs.nhsia.datastandards.ecds.NHSNumberStatusIndicatorCodeUnverifiedType xgetNHSNumberStatusIndicatorCode();
        
        /**
         * Sets the "NHSNumberStatusIndicatorCode" element
         */
        void setNHSNumberStatusIndicatorCode(uk.nhs.nhsia.datastandards.ecds.NHSNumberStatusIndicatorCodeUnverifiedType.Enum nhsNumberStatusIndicatorCode);
        
        /**
         * Sets (as xml) the "NHSNumberStatusIndicatorCode" element
         */
        void xsetNHSNumberStatusIndicatorCode(uk.nhs.nhsia.datastandards.ecds.NHSNumberStatusIndicatorCodeUnverifiedType nhsNumberStatusIndicatorCode);
        
        /**
         * Gets the "PatientName" element
         */
        uk.nhs.nhsia.datastandards.ecds.PersonNameStructure getPatientName();
        
        /**
         * True if has "PatientName" element
         */
        boolean isSetPatientName();
        
        /**
         * Sets the "PatientName" element
         */
        void setPatientName(uk.nhs.nhsia.datastandards.ecds.PersonNameStructure patientName);
        
        /**
         * Appends and returns a new empty "PatientName" element
         */
        uk.nhs.nhsia.datastandards.ecds.PersonNameStructure addNewPatientName();
        
        /**
         * Unsets the "PatientName" element
         */
        void unsetPatientName();
        
        /**
         * Gets the "PersonBirthDate" element
         */
        java.util.Calendar getPersonBirthDate();
        
        /**
         * Gets (as xml) the "PersonBirthDate" element
         */
        uk.nhs.nhsia.datastandards.ecds.PersonBirthDateType xgetPersonBirthDate();
        
        /**
         * True if has "PersonBirthDate" element
         */
        boolean isSetPersonBirthDate();
        
        /**
         * Sets the "PersonBirthDate" element
         */
        void setPersonBirthDate(java.util.Calendar personBirthDate);
        
        /**
         * Sets (as xml) the "PersonBirthDate" element
         */
        void xsetPersonBirthDate(uk.nhs.nhsia.datastandards.ecds.PersonBirthDateType personBirthDate);
        
        /**
         * Unsets the "PersonBirthDate" element
         */
        void unsetPersonBirthDate();
        
        /**
         * Gets the "NHSNumberStatusIndicatorCode" attribute
         */
        uk.nhs.nhsia.datastandards.ecds.NHSNumberStatusIndicatorCodeUnverifiedType.Enum getNHSNumberStatusIndicatorCode2();
        
        /**
         * Gets (as xml) the "NHSNumberStatusIndicatorCode" attribute
         */
        uk.nhs.nhsia.datastandards.ecds.NHSNumberStatusIndicatorCodeUnverifiedType xgetNHSNumberStatusIndicatorCode2();
        
        /**
         * Sets the "NHSNumberStatusIndicatorCode" attribute
         */
        void setNHSNumberStatusIndicatorCode2(uk.nhs.nhsia.datastandards.ecds.NHSNumberStatusIndicatorCodeUnverifiedType.Enum nhsNumberStatusIndicatorCode2);
        
        /**
         * Sets (as xml) the "NHSNumberStatusIndicatorCode" attribute
         */
        void xsetNHSNumberStatusIndicatorCode2(uk.nhs.nhsia.datastandards.ecds.NHSNumberStatusIndicatorCodeUnverifiedType nhsNumberStatusIndicatorCode2);
        
        /**
         * A factory class with static methods for creating instances
         * of this type.
         */
        
        public static final class Factory
        {
            public static uk.nhs.nhsia.datastandards.ecds.PatientIdentityBirthStructure.UnverifiedIdentityStructure newInstance() {
              return (uk.nhs.nhsia.datastandards.ecds.PatientIdentityBirthStructure.UnverifiedIdentityStructure) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().newInstance( type, null ); }
            
            public static uk.nhs.nhsia.datastandards.ecds.PatientIdentityBirthStructure.UnverifiedIdentityStructure newInstance(org.apache.xmlbeans.XmlOptions options) {
              return (uk.nhs.nhsia.datastandards.ecds.PatientIdentityBirthStructure.UnverifiedIdentityStructure) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().newInstance( type, options ); }
            
            private Factory() { } // No instance of this class allowed
        }
    }
    
    /**
     * A factory class with static methods for creating instances
     * of this type.
     */
    
    public static final class Factory
    {
        public static uk.nhs.nhsia.datastandards.ecds.PatientIdentityBirthStructure newInstance() {
          return (uk.nhs.nhsia.datastandards.ecds.PatientIdentityBirthStructure) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().newInstance( type, null ); }
        
        public static uk.nhs.nhsia.datastandards.ecds.PatientIdentityBirthStructure newInstance(org.apache.xmlbeans.XmlOptions options) {
          return (uk.nhs.nhsia.datastandards.ecds.PatientIdentityBirthStructure) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().newInstance( type, options ); }
        
        /** @param xmlAsString the string value to parse */
        public static uk.nhs.nhsia.datastandards.ecds.PatientIdentityBirthStructure parse(java.lang.String xmlAsString) throws org.apache.xmlbeans.XmlException {
          return (uk.nhs.nhsia.datastandards.ecds.PatientIdentityBirthStructure) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( xmlAsString, type, null ); }
        
        public static uk.nhs.nhsia.datastandards.ecds.PatientIdentityBirthStructure parse(java.lang.String xmlAsString, org.apache.xmlbeans.XmlOptions options) throws org.apache.xmlbeans.XmlException {
          return (uk.nhs.nhsia.datastandards.ecds.PatientIdentityBirthStructure) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( xmlAsString, type, options ); }
        
        /** @param file the file from which to load an xml document */
        public static uk.nhs.nhsia.datastandards.ecds.PatientIdentityBirthStructure parse(java.io.File file) throws org.apache.xmlbeans.XmlException, java.io.IOException {
          return (uk.nhs.nhsia.datastandards.ecds.PatientIdentityBirthStructure) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( file, type, null ); }
        
        public static uk.nhs.nhsia.datastandards.ecds.PatientIdentityBirthStructure parse(java.io.File file, org.apache.xmlbeans.XmlOptions options) throws org.apache.xmlbeans.XmlException, java.io.IOException {
          return (uk.nhs.nhsia.datastandards.ecds.PatientIdentityBirthStructure) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( file, type, options ); }
        
        public static uk.nhs.nhsia.datastandards.ecds.PatientIdentityBirthStructure parse(java.net.URL u) throws org.apache.xmlbeans.XmlException, java.io.IOException {
          return (uk.nhs.nhsia.datastandards.ecds.PatientIdentityBirthStructure) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( u, type, null ); }
        
        public static uk.nhs.nhsia.datastandards.ecds.PatientIdentityBirthStructure parse(java.net.URL u, org.apache.xmlbeans.XmlOptions options) throws org.apache.xmlbeans.XmlException, java.io.IOException {
          return (uk.nhs.nhsia.datastandards.ecds.PatientIdentityBirthStructure) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( u, type, options ); }
        
        public static uk.nhs.nhsia.datastandards.ecds.PatientIdentityBirthStructure parse(java.io.InputStream is) throws org.apache.xmlbeans.XmlException, java.io.IOException {
          return (uk.nhs.nhsia.datastandards.ecds.PatientIdentityBirthStructure) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( is, type, null ); }
        
        public static uk.nhs.nhsia.datastandards.ecds.PatientIdentityBirthStructure parse(java.io.InputStream is, org.apache.xmlbeans.XmlOptions options) throws org.apache.xmlbeans.XmlException, java.io.IOException {
          return (uk.nhs.nhsia.datastandards.ecds.PatientIdentityBirthStructure) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( is, type, options ); }
        
        public static uk.nhs.nhsia.datastandards.ecds.PatientIdentityBirthStructure parse(java.io.Reader r) throws org.apache.xmlbeans.XmlException, java.io.IOException {
          return (uk.nhs.nhsia.datastandards.ecds.PatientIdentityBirthStructure) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( r, type, null ); }
        
        public static uk.nhs.nhsia.datastandards.ecds.PatientIdentityBirthStructure parse(java.io.Reader r, org.apache.xmlbeans.XmlOptions options) throws org.apache.xmlbeans.XmlException, java.io.IOException {
          return (uk.nhs.nhsia.datastandards.ecds.PatientIdentityBirthStructure) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( r, type, options ); }
        
        public static uk.nhs.nhsia.datastandards.ecds.PatientIdentityBirthStructure parse(javax.xml.stream.XMLStreamReader sr) throws org.apache.xmlbeans.XmlException {
          return (uk.nhs.nhsia.datastandards.ecds.PatientIdentityBirthStructure) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( sr, type, null ); }
        
        public static uk.nhs.nhsia.datastandards.ecds.PatientIdentityBirthStructure parse(javax.xml.stream.XMLStreamReader sr, org.apache.xmlbeans.XmlOptions options) throws org.apache.xmlbeans.XmlException {
          return (uk.nhs.nhsia.datastandards.ecds.PatientIdentityBirthStructure) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( sr, type, options ); }
        
        public static uk.nhs.nhsia.datastandards.ecds.PatientIdentityBirthStructure parse(org.w3c.dom.Node node) throws org.apache.xmlbeans.XmlException {
          return (uk.nhs.nhsia.datastandards.ecds.PatientIdentityBirthStructure) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( node, type, null ); }
        
        public static uk.nhs.nhsia.datastandards.ecds.PatientIdentityBirthStructure parse(org.w3c.dom.Node node, org.apache.xmlbeans.XmlOptions options) throws org.apache.xmlbeans.XmlException {
          return (uk.nhs.nhsia.datastandards.ecds.PatientIdentityBirthStructure) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( node, type, options ); }
        
        /** @deprecated {@link org.apache.xmlbeans.xml.stream.XMLInputStream} */
        public static uk.nhs.nhsia.datastandards.ecds.PatientIdentityBirthStructure parse(org.apache.xmlbeans.xml.stream.XMLInputStream xis) throws org.apache.xmlbeans.XmlException, org.apache.xmlbeans.xml.stream.XMLStreamException {
          return (uk.nhs.nhsia.datastandards.ecds.PatientIdentityBirthStructure) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( xis, type, null ); }
        
        /** @deprecated {@link org.apache.xmlbeans.xml.stream.XMLInputStream} */
        public static uk.nhs.nhsia.datastandards.ecds.PatientIdentityBirthStructure parse(org.apache.xmlbeans.xml.stream.XMLInputStream xis, org.apache.xmlbeans.XmlOptions options) throws org.apache.xmlbeans.XmlException, org.apache.xmlbeans.xml.stream.XMLStreamException {
          return (uk.nhs.nhsia.datastandards.ecds.PatientIdentityBirthStructure) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( xis, type, options ); }
        
        /** @deprecated {@link org.apache.xmlbeans.xml.stream.XMLInputStream} */
        public static org.apache.xmlbeans.xml.stream.XMLInputStream newValidatingXMLInputStream(org.apache.xmlbeans.xml.stream.XMLInputStream xis) throws org.apache.xmlbeans.XmlException, org.apache.xmlbeans.xml.stream.XMLStreamException {
          return org.apache.xmlbeans.XmlBeans.getContextTypeLoader().newValidatingXMLInputStream( xis, type, null ); }
        
        /** @deprecated {@link org.apache.xmlbeans.xml.stream.XMLInputStream} */
        public static org.apache.xmlbeans.xml.stream.XMLInputStream newValidatingXMLInputStream(org.apache.xmlbeans.xml.stream.XMLInputStream xis, org.apache.xmlbeans.XmlOptions options) throws org.apache.xmlbeans.XmlException, org.apache.xmlbeans.xml.stream.XMLStreamException {
          return org.apache.xmlbeans.XmlBeans.getContextTypeLoader().newValidatingXMLInputStream( xis, type, options ); }
        
        private Factory() { } // No instance of this class allowed
    }
}
