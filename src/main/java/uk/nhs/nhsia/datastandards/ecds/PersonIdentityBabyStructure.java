/*
 * XML Type:  PersonIdentity_Baby_Structure
 * Namespace: http://www.nhsia.nhs.uk/DataStandards/XMLschema/CDS/ns
 * Java type: uk.nhs.nhsia.datastandards.ecds.PersonIdentityBabyStructure
 *
 * Automatically generated - do not modify.
 */
package uk.nhs.nhsia.datastandards.ecds;


/**
 * An XML PersonIdentity_Baby_Structure(@http://www.nhsia.nhs.uk/DataStandards/XMLschema/CDS/ns).
 *
 * This is a complex type.
 */
public interface PersonIdentityBabyStructure extends org.apache.xmlbeans.XmlObject
{
    public static final org.apache.xmlbeans.SchemaType type = (org.apache.xmlbeans.SchemaType)
        org.apache.xmlbeans.XmlBeans.typeSystemForClassLoader(PersonIdentityBabyStructure.class.getClassLoader(), "schemaorg_apache_xmlbeans.system.s30C1180FF47174E0C8A992A2D657328B").resolveHandle("personidentitybabystructure538dtype");
    
    /**
     * Gets the "WithheldIdentity_Structure_Baby" element
     */
    uk.nhs.nhsia.datastandards.ecds.PersonIdentityBabyStructure.WithheldIdentityStructureBaby getWithheldIdentityStructureBaby();
    
    /**
     * True if has "WithheldIdentity_Structure_Baby" element
     */
    boolean isSetWithheldIdentityStructureBaby();
    
    /**
     * Sets the "WithheldIdentity_Structure_Baby" element
     */
    void setWithheldIdentityStructureBaby(uk.nhs.nhsia.datastandards.ecds.PersonIdentityBabyStructure.WithheldIdentityStructureBaby withheldIdentityStructureBaby);
    
    /**
     * Appends and returns a new empty "WithheldIdentity_Structure_Baby" element
     */
    uk.nhs.nhsia.datastandards.ecds.PersonIdentityBabyStructure.WithheldIdentityStructureBaby addNewWithheldIdentityStructureBaby();
    
    /**
     * Unsets the "WithheldIdentity_Structure_Baby" element
     */
    void unsetWithheldIdentityStructureBaby();
    
    /**
     * Gets the "VerifiedIdentity_Structure_Baby" element
     */
    uk.nhs.nhsia.datastandards.ecds.PersonIdentityBabyStructure.VerifiedIdentityStructureBaby getVerifiedIdentityStructureBaby();
    
    /**
     * True if has "VerifiedIdentity_Structure_Baby" element
     */
    boolean isSetVerifiedIdentityStructureBaby();
    
    /**
     * Sets the "VerifiedIdentity_Structure_Baby" element
     */
    void setVerifiedIdentityStructureBaby(uk.nhs.nhsia.datastandards.ecds.PersonIdentityBabyStructure.VerifiedIdentityStructureBaby verifiedIdentityStructureBaby);
    
    /**
     * Appends and returns a new empty "VerifiedIdentity_Structure_Baby" element
     */
    uk.nhs.nhsia.datastandards.ecds.PersonIdentityBabyStructure.VerifiedIdentityStructureBaby addNewVerifiedIdentityStructureBaby();
    
    /**
     * Unsets the "VerifiedIdentity_Structure_Baby" element
     */
    void unsetVerifiedIdentityStructureBaby();
    
    /**
     * Gets the "UnverifiedIdentity_Structure_Baby" element
     */
    uk.nhs.nhsia.datastandards.ecds.PersonIdentityBabyStructure.UnverifiedIdentityStructureBaby getUnverifiedIdentityStructureBaby();
    
    /**
     * True if has "UnverifiedIdentity_Structure_Baby" element
     */
    boolean isSetUnverifiedIdentityStructureBaby();
    
    /**
     * Sets the "UnverifiedIdentity_Structure_Baby" element
     */
    void setUnverifiedIdentityStructureBaby(uk.nhs.nhsia.datastandards.ecds.PersonIdentityBabyStructure.UnverifiedIdentityStructureBaby unverifiedIdentityStructureBaby);
    
    /**
     * Appends and returns a new empty "UnverifiedIdentity_Structure_Baby" element
     */
    uk.nhs.nhsia.datastandards.ecds.PersonIdentityBabyStructure.UnverifiedIdentityStructureBaby addNewUnverifiedIdentityStructureBaby();
    
    /**
     * Unsets the "UnverifiedIdentity_Structure_Baby" element
     */
    void unsetUnverifiedIdentityStructureBaby();
    
    /**
     * An XML WithheldIdentity_Structure_Baby(@http://www.nhsia.nhs.uk/DataStandards/XMLschema/CDS/ns).
     *
     * This is a complex type.
     */
    public interface WithheldIdentityStructureBaby extends org.apache.xmlbeans.XmlObject
    {
        public static final org.apache.xmlbeans.SchemaType type = (org.apache.xmlbeans.SchemaType)
            org.apache.xmlbeans.XmlBeans.typeSystemForClassLoader(WithheldIdentityStructureBaby.class.getClassLoader(), "schemaorg_apache_xmlbeans.system.s30C1180FF47174E0C8A992A2D657328B").resolveHandle("withheldidentitystructurebabyfe39elemtype");
        
        /**
         * Gets the "NHSNumberStatusIndicatorCode_Baby" element
         */
        uk.nhs.nhsia.datastandards.ecds.NHSNumberStatusIndicatorCodeWithheldType.Enum getNHSNumberStatusIndicatorCodeBaby();
        
        /**
         * Gets (as xml) the "NHSNumberStatusIndicatorCode_Baby" element
         */
        uk.nhs.nhsia.datastandards.ecds.NHSNumberStatusIndicatorCodeWithheldType xgetNHSNumberStatusIndicatorCodeBaby();
        
        /**
         * Sets the "NHSNumberStatusIndicatorCode_Baby" element
         */
        void setNHSNumberStatusIndicatorCodeBaby(uk.nhs.nhsia.datastandards.ecds.NHSNumberStatusIndicatorCodeWithheldType.Enum nhsNumberStatusIndicatorCodeBaby);
        
        /**
         * Sets (as xml) the "NHSNumberStatusIndicatorCode_Baby" element
         */
        void xsetNHSNumberStatusIndicatorCodeBaby(uk.nhs.nhsia.datastandards.ecds.NHSNumberStatusIndicatorCodeWithheldType nhsNumberStatusIndicatorCodeBaby);
        
        /**
         * Gets the "PersonBirthDate_Baby" element
         */
        java.util.Calendar getPersonBirthDateBaby();
        
        /**
         * Gets (as xml) the "PersonBirthDate_Baby" element
         */
        uk.nhs.nhsia.datastandards.ecds.PersonBirthDateType xgetPersonBirthDateBaby();
        
        /**
         * True if has "PersonBirthDate_Baby" element
         */
        boolean isSetPersonBirthDateBaby();
        
        /**
         * Sets the "PersonBirthDate_Baby" element
         */
        void setPersonBirthDateBaby(java.util.Calendar personBirthDateBaby);
        
        /**
         * Sets (as xml) the "PersonBirthDate_Baby" element
         */
        void xsetPersonBirthDateBaby(uk.nhs.nhsia.datastandards.ecds.PersonBirthDateType personBirthDateBaby);
        
        /**
         * Unsets the "PersonBirthDate_Baby" element
         */
        void unsetPersonBirthDateBaby();
        
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
         * Gets the "NHSNumberStatusIndicatorCode_Baby" attribute
         */
        uk.nhs.nhsia.datastandards.ecds.NHSNumberStatusIndicatorCodeWithheldType.Enum getNHSNumberStatusIndicatorCodeBaby2();
        
        /**
         * Gets (as xml) the "NHSNumberStatusIndicatorCode_Baby" attribute
         */
        uk.nhs.nhsia.datastandards.ecds.NHSNumberStatusIndicatorCodeWithheldType xgetNHSNumberStatusIndicatorCodeBaby2();
        
        /**
         * Sets the "NHSNumberStatusIndicatorCode_Baby" attribute
         */
        void setNHSNumberStatusIndicatorCodeBaby2(uk.nhs.nhsia.datastandards.ecds.NHSNumberStatusIndicatorCodeWithheldType.Enum nhsNumberStatusIndicatorCodeBaby2);
        
        /**
         * Sets (as xml) the "NHSNumberStatusIndicatorCode_Baby" attribute
         */
        void xsetNHSNumberStatusIndicatorCodeBaby2(uk.nhs.nhsia.datastandards.ecds.NHSNumberStatusIndicatorCodeWithheldType nhsNumberStatusIndicatorCodeBaby2);
        
        /**
         * A factory class with static methods for creating instances
         * of this type.
         */
        
        public static final class Factory
        {
            public static uk.nhs.nhsia.datastandards.ecds.PersonIdentityBabyStructure.WithheldIdentityStructureBaby newInstance() {
              return (uk.nhs.nhsia.datastandards.ecds.PersonIdentityBabyStructure.WithheldIdentityStructureBaby) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().newInstance( type, null ); }
            
            public static uk.nhs.nhsia.datastandards.ecds.PersonIdentityBabyStructure.WithheldIdentityStructureBaby newInstance(org.apache.xmlbeans.XmlOptions options) {
              return (uk.nhs.nhsia.datastandards.ecds.PersonIdentityBabyStructure.WithheldIdentityStructureBaby) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().newInstance( type, options ); }
            
            private Factory() { } // No instance of this class allowed
        }
    }
    
    /**
     * An XML VerifiedIdentity_Structure_Baby(@http://www.nhsia.nhs.uk/DataStandards/XMLschema/CDS/ns).
     *
     * This is a complex type.
     */
    public interface VerifiedIdentityStructureBaby extends org.apache.xmlbeans.XmlObject
    {
        public static final org.apache.xmlbeans.SchemaType type = (org.apache.xmlbeans.SchemaType)
            org.apache.xmlbeans.XmlBeans.typeSystemForClassLoader(VerifiedIdentityStructureBaby.class.getClassLoader(), "schemaorg_apache_xmlbeans.system.s30C1180FF47174E0C8A992A2D657328B").resolveHandle("verifiedidentitystructurebaby6946elemtype");
        
        /**
         * Gets the "LocalPatientIdentifier_Baby" element
         */
        java.lang.String getLocalPatientIdentifierBaby();
        
        /**
         * Gets (as xml) the "LocalPatientIdentifier_Baby" element
         */
        uk.nhs.nhsia.datastandards.ecds.LocalPatientIdentifierType xgetLocalPatientIdentifierBaby();
        
        /**
         * True if has "LocalPatientIdentifier_Baby" element
         */
        boolean isSetLocalPatientIdentifierBaby();
        
        /**
         * Sets the "LocalPatientIdentifier_Baby" element
         */
        void setLocalPatientIdentifierBaby(java.lang.String localPatientIdentifierBaby);
        
        /**
         * Sets (as xml) the "LocalPatientIdentifier_Baby" element
         */
        void xsetLocalPatientIdentifierBaby(uk.nhs.nhsia.datastandards.ecds.LocalPatientIdentifierType localPatientIdentifierBaby);
        
        /**
         * Unsets the "LocalPatientIdentifier_Baby" element
         */
        void unsetLocalPatientIdentifierBaby();
        
        /**
         * Gets the "OrganisationCode_LocalPatientIdentifier_Baby" element
         */
        java.lang.String getOrganisationCodeLocalPatientIdentifierBaby();
        
        /**
         * Gets (as xml) the "OrganisationCode_LocalPatientIdentifier_Baby" element
         */
        uk.nhs.nhsia.datastandards.ecds.OrganisationCodeType xgetOrganisationCodeLocalPatientIdentifierBaby();
        
        /**
         * True if has "OrganisationCode_LocalPatientIdentifier_Baby" element
         */
        boolean isSetOrganisationCodeLocalPatientIdentifierBaby();
        
        /**
         * Sets the "OrganisationCode_LocalPatientIdentifier_Baby" element
         */
        void setOrganisationCodeLocalPatientIdentifierBaby(java.lang.String organisationCodeLocalPatientIdentifierBaby);
        
        /**
         * Sets (as xml) the "OrganisationCode_LocalPatientIdentifier_Baby" element
         */
        void xsetOrganisationCodeLocalPatientIdentifierBaby(uk.nhs.nhsia.datastandards.ecds.OrganisationCodeType organisationCodeLocalPatientIdentifierBaby);
        
        /**
         * Unsets the "OrganisationCode_LocalPatientIdentifier_Baby" element
         */
        void unsetOrganisationCodeLocalPatientIdentifierBaby();
        
        /**
         * Gets the "NHSNumber_Baby" element
         */
        java.lang.String getNHSNumberBaby();
        
        /**
         * Gets (as xml) the "NHSNumber_Baby" element
         */
        uk.nhs.nhsia.datastandards.ecds.NHSNumberType xgetNHSNumberBaby();
        
        /**
         * Sets the "NHSNumber_Baby" element
         */
        void setNHSNumberBaby(java.lang.String nhsNumberBaby);
        
        /**
         * Sets (as xml) the "NHSNumber_Baby" element
         */
        void xsetNHSNumberBaby(uk.nhs.nhsia.datastandards.ecds.NHSNumberType nhsNumberBaby);
        
        /**
         * Gets the "NHSNumberStatusIndicatorCode_Baby" element
         */
        uk.nhs.nhsia.datastandards.ecds.NHSNumberStatusIndicatorCodeVerifiedType.Enum getNHSNumberStatusIndicatorCodeBaby();
        
        /**
         * Gets (as xml) the "NHSNumberStatusIndicatorCode_Baby" element
         */
        uk.nhs.nhsia.datastandards.ecds.NHSNumberStatusIndicatorCodeVerifiedType xgetNHSNumberStatusIndicatorCodeBaby();
        
        /**
         * Sets the "NHSNumberStatusIndicatorCode_Baby" element
         */
        void setNHSNumberStatusIndicatorCodeBaby(uk.nhs.nhsia.datastandards.ecds.NHSNumberStatusIndicatorCodeVerifiedType.Enum nhsNumberStatusIndicatorCodeBaby);
        
        /**
         * Sets (as xml) the "NHSNumberStatusIndicatorCode_Baby" element
         */
        void xsetNHSNumberStatusIndicatorCodeBaby(uk.nhs.nhsia.datastandards.ecds.NHSNumberStatusIndicatorCodeVerifiedType nhsNumberStatusIndicatorCodeBaby);
        
        /**
         * Gets the "PersonBirthDate_Baby" element
         */
        java.util.Calendar getPersonBirthDateBaby();
        
        /**
         * Gets (as xml) the "PersonBirthDate_Baby" element
         */
        uk.nhs.nhsia.datastandards.ecds.PersonBirthDateType xgetPersonBirthDateBaby();
        
        /**
         * True if has "PersonBirthDate_Baby" element
         */
        boolean isSetPersonBirthDateBaby();
        
        /**
         * Sets the "PersonBirthDate_Baby" element
         */
        void setPersonBirthDateBaby(java.util.Calendar personBirthDateBaby);
        
        /**
         * Sets (as xml) the "PersonBirthDate_Baby" element
         */
        void xsetPersonBirthDateBaby(uk.nhs.nhsia.datastandards.ecds.PersonBirthDateType personBirthDateBaby);
        
        /**
         * Unsets the "PersonBirthDate_Baby" element
         */
        void unsetPersonBirthDateBaby();
        
        /**
         * Gets the "NHSNumberStatusIndicatorCode_Baby" attribute
         */
        uk.nhs.nhsia.datastandards.ecds.NHSNumberStatusIndicatorCodeVerifiedType.Enum getNHSNumberStatusIndicatorCodeBaby2();
        
        /**
         * Gets (as xml) the "NHSNumberStatusIndicatorCode_Baby" attribute
         */
        uk.nhs.nhsia.datastandards.ecds.NHSNumberStatusIndicatorCodeVerifiedType xgetNHSNumberStatusIndicatorCodeBaby2();
        
        /**
         * Sets the "NHSNumberStatusIndicatorCode_Baby" attribute
         */
        void setNHSNumberStatusIndicatorCodeBaby2(uk.nhs.nhsia.datastandards.ecds.NHSNumberStatusIndicatorCodeVerifiedType.Enum nhsNumberStatusIndicatorCodeBaby2);
        
        /**
         * Sets (as xml) the "NHSNumberStatusIndicatorCode_Baby" attribute
         */
        void xsetNHSNumberStatusIndicatorCodeBaby2(uk.nhs.nhsia.datastandards.ecds.NHSNumberStatusIndicatorCodeVerifiedType nhsNumberStatusIndicatorCodeBaby2);
        
        /**
         * A factory class with static methods for creating instances
         * of this type.
         */
        
        public static final class Factory
        {
            public static uk.nhs.nhsia.datastandards.ecds.PersonIdentityBabyStructure.VerifiedIdentityStructureBaby newInstance() {
              return (uk.nhs.nhsia.datastandards.ecds.PersonIdentityBabyStructure.VerifiedIdentityStructureBaby) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().newInstance( type, null ); }
            
            public static uk.nhs.nhsia.datastandards.ecds.PersonIdentityBabyStructure.VerifiedIdentityStructureBaby newInstance(org.apache.xmlbeans.XmlOptions options) {
              return (uk.nhs.nhsia.datastandards.ecds.PersonIdentityBabyStructure.VerifiedIdentityStructureBaby) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().newInstance( type, options ); }
            
            private Factory() { } // No instance of this class allowed
        }
    }
    
    /**
     * An XML UnverifiedIdentity_Structure_Baby(@http://www.nhsia.nhs.uk/DataStandards/XMLschema/CDS/ns).
     *
     * This is a complex type.
     */
    public interface UnverifiedIdentityStructureBaby extends org.apache.xmlbeans.XmlObject
    {
        public static final org.apache.xmlbeans.SchemaType type = (org.apache.xmlbeans.SchemaType)
            org.apache.xmlbeans.XmlBeans.typeSystemForClassLoader(UnverifiedIdentityStructureBaby.class.getClassLoader(), "schemaorg_apache_xmlbeans.system.s30C1180FF47174E0C8A992A2D657328B").resolveHandle("unverifiedidentitystructurebabyd51felemtype");
        
        /**
         * Gets the "LocalPatientIdentifier_Baby" element
         */
        java.lang.String getLocalPatientIdentifierBaby();
        
        /**
         * Gets (as xml) the "LocalPatientIdentifier_Baby" element
         */
        uk.nhs.nhsia.datastandards.ecds.LocalPatientIdentifierType xgetLocalPatientIdentifierBaby();
        
        /**
         * True if has "LocalPatientIdentifier_Baby" element
         */
        boolean isSetLocalPatientIdentifierBaby();
        
        /**
         * Sets the "LocalPatientIdentifier_Baby" element
         */
        void setLocalPatientIdentifierBaby(java.lang.String localPatientIdentifierBaby);
        
        /**
         * Sets (as xml) the "LocalPatientIdentifier_Baby" element
         */
        void xsetLocalPatientIdentifierBaby(uk.nhs.nhsia.datastandards.ecds.LocalPatientIdentifierType localPatientIdentifierBaby);
        
        /**
         * Unsets the "LocalPatientIdentifier_Baby" element
         */
        void unsetLocalPatientIdentifierBaby();
        
        /**
         * Gets the "OrganisationCode_LocalPatientIdentifier_Baby" element
         */
        java.lang.String getOrganisationCodeLocalPatientIdentifierBaby();
        
        /**
         * Gets (as xml) the "OrganisationCode_LocalPatientIdentifier_Baby" element
         */
        uk.nhs.nhsia.datastandards.ecds.OrganisationCodeType xgetOrganisationCodeLocalPatientIdentifierBaby();
        
        /**
         * True if has "OrganisationCode_LocalPatientIdentifier_Baby" element
         */
        boolean isSetOrganisationCodeLocalPatientIdentifierBaby();
        
        /**
         * Sets the "OrganisationCode_LocalPatientIdentifier_Baby" element
         */
        void setOrganisationCodeLocalPatientIdentifierBaby(java.lang.String organisationCodeLocalPatientIdentifierBaby);
        
        /**
         * Sets (as xml) the "OrganisationCode_LocalPatientIdentifier_Baby" element
         */
        void xsetOrganisationCodeLocalPatientIdentifierBaby(uk.nhs.nhsia.datastandards.ecds.OrganisationCodeType organisationCodeLocalPatientIdentifierBaby);
        
        /**
         * Unsets the "OrganisationCode_LocalPatientIdentifier_Baby" element
         */
        void unsetOrganisationCodeLocalPatientIdentifierBaby();
        
        /**
         * Gets the "NHSNumber_Baby" element
         */
        java.lang.String getNHSNumberBaby();
        
        /**
         * Gets (as xml) the "NHSNumber_Baby" element
         */
        uk.nhs.nhsia.datastandards.ecds.NHSNumberType xgetNHSNumberBaby();
        
        /**
         * True if has "NHSNumber_Baby" element
         */
        boolean isSetNHSNumberBaby();
        
        /**
         * Sets the "NHSNumber_Baby" element
         */
        void setNHSNumberBaby(java.lang.String nhsNumberBaby);
        
        /**
         * Sets (as xml) the "NHSNumber_Baby" element
         */
        void xsetNHSNumberBaby(uk.nhs.nhsia.datastandards.ecds.NHSNumberType nhsNumberBaby);
        
        /**
         * Unsets the "NHSNumber_Baby" element
         */
        void unsetNHSNumberBaby();
        
        /**
         * Gets the "NHSNumberStatusIndicatorCode_Baby" element
         */
        uk.nhs.nhsia.datastandards.ecds.NHSNumberStatusIndicatorCodeUnverifiedType.Enum getNHSNumberStatusIndicatorCodeBaby();
        
        /**
         * Gets (as xml) the "NHSNumberStatusIndicatorCode_Baby" element
         */
        uk.nhs.nhsia.datastandards.ecds.NHSNumberStatusIndicatorCodeUnverifiedType xgetNHSNumberStatusIndicatorCodeBaby();
        
        /**
         * Sets the "NHSNumberStatusIndicatorCode_Baby" element
         */
        void setNHSNumberStatusIndicatorCodeBaby(uk.nhs.nhsia.datastandards.ecds.NHSNumberStatusIndicatorCodeUnverifiedType.Enum nhsNumberStatusIndicatorCodeBaby);
        
        /**
         * Sets (as xml) the "NHSNumberStatusIndicatorCode_Baby" element
         */
        void xsetNHSNumberStatusIndicatorCodeBaby(uk.nhs.nhsia.datastandards.ecds.NHSNumberStatusIndicatorCodeUnverifiedType nhsNumberStatusIndicatorCodeBaby);
        
        /**
         * Gets the "PersonBirthDate_Baby" element
         */
        java.util.Calendar getPersonBirthDateBaby();
        
        /**
         * Gets (as xml) the "PersonBirthDate_Baby" element
         */
        uk.nhs.nhsia.datastandards.ecds.PersonBirthDateType xgetPersonBirthDateBaby();
        
        /**
         * True if has "PersonBirthDate_Baby" element
         */
        boolean isSetPersonBirthDateBaby();
        
        /**
         * Sets the "PersonBirthDate_Baby" element
         */
        void setPersonBirthDateBaby(java.util.Calendar personBirthDateBaby);
        
        /**
         * Sets (as xml) the "PersonBirthDate_Baby" element
         */
        void xsetPersonBirthDateBaby(uk.nhs.nhsia.datastandards.ecds.PersonBirthDateType personBirthDateBaby);
        
        /**
         * Unsets the "PersonBirthDate_Baby" element
         */
        void unsetPersonBirthDateBaby();
        
        /**
         * Gets the "NHSNumberStatusIndicatorCode_Baby" attribute
         */
        uk.nhs.nhsia.datastandards.ecds.NHSNumberStatusIndicatorCodeUnverifiedType.Enum getNHSNumberStatusIndicatorCodeBaby2();
        
        /**
         * Gets (as xml) the "NHSNumberStatusIndicatorCode_Baby" attribute
         */
        uk.nhs.nhsia.datastandards.ecds.NHSNumberStatusIndicatorCodeUnverifiedType xgetNHSNumberStatusIndicatorCodeBaby2();
        
        /**
         * Sets the "NHSNumberStatusIndicatorCode_Baby" attribute
         */
        void setNHSNumberStatusIndicatorCodeBaby2(uk.nhs.nhsia.datastandards.ecds.NHSNumberStatusIndicatorCodeUnverifiedType.Enum nhsNumberStatusIndicatorCodeBaby2);
        
        /**
         * Sets (as xml) the "NHSNumberStatusIndicatorCode_Baby" attribute
         */
        void xsetNHSNumberStatusIndicatorCodeBaby2(uk.nhs.nhsia.datastandards.ecds.NHSNumberStatusIndicatorCodeUnverifiedType nhsNumberStatusIndicatorCodeBaby2);
        
        /**
         * A factory class with static methods for creating instances
         * of this type.
         */
        
        public static final class Factory
        {
            public static uk.nhs.nhsia.datastandards.ecds.PersonIdentityBabyStructure.UnverifiedIdentityStructureBaby newInstance() {
              return (uk.nhs.nhsia.datastandards.ecds.PersonIdentityBabyStructure.UnverifiedIdentityStructureBaby) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().newInstance( type, null ); }
            
            public static uk.nhs.nhsia.datastandards.ecds.PersonIdentityBabyStructure.UnverifiedIdentityStructureBaby newInstance(org.apache.xmlbeans.XmlOptions options) {
              return (uk.nhs.nhsia.datastandards.ecds.PersonIdentityBabyStructure.UnverifiedIdentityStructureBaby) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().newInstance( type, options ); }
            
            private Factory() { } // No instance of this class allowed
        }
    }
    
    /**
     * A factory class with static methods for creating instances
     * of this type.
     */
    
    public static final class Factory
    {
        public static uk.nhs.nhsia.datastandards.ecds.PersonIdentityBabyStructure newInstance() {
          return (uk.nhs.nhsia.datastandards.ecds.PersonIdentityBabyStructure) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().newInstance( type, null ); }
        
        public static uk.nhs.nhsia.datastandards.ecds.PersonIdentityBabyStructure newInstance(org.apache.xmlbeans.XmlOptions options) {
          return (uk.nhs.nhsia.datastandards.ecds.PersonIdentityBabyStructure) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().newInstance( type, options ); }
        
        /** @param xmlAsString the string value to parse */
        public static uk.nhs.nhsia.datastandards.ecds.PersonIdentityBabyStructure parse(java.lang.String xmlAsString) throws org.apache.xmlbeans.XmlException {
          return (uk.nhs.nhsia.datastandards.ecds.PersonIdentityBabyStructure) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( xmlAsString, type, null ); }
        
        public static uk.nhs.nhsia.datastandards.ecds.PersonIdentityBabyStructure parse(java.lang.String xmlAsString, org.apache.xmlbeans.XmlOptions options) throws org.apache.xmlbeans.XmlException {
          return (uk.nhs.nhsia.datastandards.ecds.PersonIdentityBabyStructure) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( xmlAsString, type, options ); }
        
        /** @param file the file from which to load an xml document */
        public static uk.nhs.nhsia.datastandards.ecds.PersonIdentityBabyStructure parse(java.io.File file) throws org.apache.xmlbeans.XmlException, java.io.IOException {
          return (uk.nhs.nhsia.datastandards.ecds.PersonIdentityBabyStructure) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( file, type, null ); }
        
        public static uk.nhs.nhsia.datastandards.ecds.PersonIdentityBabyStructure parse(java.io.File file, org.apache.xmlbeans.XmlOptions options) throws org.apache.xmlbeans.XmlException, java.io.IOException {
          return (uk.nhs.nhsia.datastandards.ecds.PersonIdentityBabyStructure) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( file, type, options ); }
        
        public static uk.nhs.nhsia.datastandards.ecds.PersonIdentityBabyStructure parse(java.net.URL u) throws org.apache.xmlbeans.XmlException, java.io.IOException {
          return (uk.nhs.nhsia.datastandards.ecds.PersonIdentityBabyStructure) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( u, type, null ); }
        
        public static uk.nhs.nhsia.datastandards.ecds.PersonIdentityBabyStructure parse(java.net.URL u, org.apache.xmlbeans.XmlOptions options) throws org.apache.xmlbeans.XmlException, java.io.IOException {
          return (uk.nhs.nhsia.datastandards.ecds.PersonIdentityBabyStructure) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( u, type, options ); }
        
        public static uk.nhs.nhsia.datastandards.ecds.PersonIdentityBabyStructure parse(java.io.InputStream is) throws org.apache.xmlbeans.XmlException, java.io.IOException {
          return (uk.nhs.nhsia.datastandards.ecds.PersonIdentityBabyStructure) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( is, type, null ); }
        
        public static uk.nhs.nhsia.datastandards.ecds.PersonIdentityBabyStructure parse(java.io.InputStream is, org.apache.xmlbeans.XmlOptions options) throws org.apache.xmlbeans.XmlException, java.io.IOException {
          return (uk.nhs.nhsia.datastandards.ecds.PersonIdentityBabyStructure) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( is, type, options ); }
        
        public static uk.nhs.nhsia.datastandards.ecds.PersonIdentityBabyStructure parse(java.io.Reader r) throws org.apache.xmlbeans.XmlException, java.io.IOException {
          return (uk.nhs.nhsia.datastandards.ecds.PersonIdentityBabyStructure) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( r, type, null ); }
        
        public static uk.nhs.nhsia.datastandards.ecds.PersonIdentityBabyStructure parse(java.io.Reader r, org.apache.xmlbeans.XmlOptions options) throws org.apache.xmlbeans.XmlException, java.io.IOException {
          return (uk.nhs.nhsia.datastandards.ecds.PersonIdentityBabyStructure) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( r, type, options ); }
        
        public static uk.nhs.nhsia.datastandards.ecds.PersonIdentityBabyStructure parse(javax.xml.stream.XMLStreamReader sr) throws org.apache.xmlbeans.XmlException {
          return (uk.nhs.nhsia.datastandards.ecds.PersonIdentityBabyStructure) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( sr, type, null ); }
        
        public static uk.nhs.nhsia.datastandards.ecds.PersonIdentityBabyStructure parse(javax.xml.stream.XMLStreamReader sr, org.apache.xmlbeans.XmlOptions options) throws org.apache.xmlbeans.XmlException {
          return (uk.nhs.nhsia.datastandards.ecds.PersonIdentityBabyStructure) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( sr, type, options ); }
        
        public static uk.nhs.nhsia.datastandards.ecds.PersonIdentityBabyStructure parse(org.w3c.dom.Node node) throws org.apache.xmlbeans.XmlException {
          return (uk.nhs.nhsia.datastandards.ecds.PersonIdentityBabyStructure) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( node, type, null ); }
        
        public static uk.nhs.nhsia.datastandards.ecds.PersonIdentityBabyStructure parse(org.w3c.dom.Node node, org.apache.xmlbeans.XmlOptions options) throws org.apache.xmlbeans.XmlException {
          return (uk.nhs.nhsia.datastandards.ecds.PersonIdentityBabyStructure) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( node, type, options ); }
        
        /** @deprecated {@link org.apache.xmlbeans.xml.stream.XMLInputStream} */
        public static uk.nhs.nhsia.datastandards.ecds.PersonIdentityBabyStructure parse(org.apache.xmlbeans.xml.stream.XMLInputStream xis) throws org.apache.xmlbeans.XmlException, org.apache.xmlbeans.xml.stream.XMLStreamException {
          return (uk.nhs.nhsia.datastandards.ecds.PersonIdentityBabyStructure) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( xis, type, null ); }
        
        /** @deprecated {@link org.apache.xmlbeans.xml.stream.XMLInputStream} */
        public static uk.nhs.nhsia.datastandards.ecds.PersonIdentityBabyStructure parse(org.apache.xmlbeans.xml.stream.XMLInputStream xis, org.apache.xmlbeans.XmlOptions options) throws org.apache.xmlbeans.XmlException, org.apache.xmlbeans.xml.stream.XMLStreamException {
          return (uk.nhs.nhsia.datastandards.ecds.PersonIdentityBabyStructure) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( xis, type, options ); }
        
        /** @deprecated {@link org.apache.xmlbeans.xml.stream.XMLInputStream} */
        public static org.apache.xmlbeans.xml.stream.XMLInputStream newValidatingXMLInputStream(org.apache.xmlbeans.xml.stream.XMLInputStream xis) throws org.apache.xmlbeans.XmlException, org.apache.xmlbeans.xml.stream.XMLStreamException {
          return org.apache.xmlbeans.XmlBeans.getContextTypeLoader().newValidatingXMLInputStream( xis, type, null ); }
        
        /** @deprecated {@link org.apache.xmlbeans.xml.stream.XMLInputStream} */
        public static org.apache.xmlbeans.xml.stream.XMLInputStream newValidatingXMLInputStream(org.apache.xmlbeans.xml.stream.XMLInputStream xis, org.apache.xmlbeans.XmlOptions options) throws org.apache.xmlbeans.XmlException, org.apache.xmlbeans.xml.stream.XMLStreamException {
          return org.apache.xmlbeans.XmlBeans.getContextTypeLoader().newValidatingXMLInputStream( xis, type, options ); }
        
        private Factory() { } // No instance of this class allowed
    }
}
