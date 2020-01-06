/*
 * XML Type:  PersonIdentity_Mother_Structure
 * Namespace: http://www.nhsia.nhs.uk/DataStandards/XMLschema/CDS/ns
 * Java type: uk.nhs.nhsia.datastandards.ecds.PersonIdentityMotherStructure
 *
 * Automatically generated - do not modify.
 */
package uk.nhs.nhsia.datastandards.ecds;


/**
 * An XML PersonIdentity_Mother_Structure(@http://www.nhsia.nhs.uk/DataStandards/XMLschema/CDS/ns).
 *
 * This is a complex type.
 */
public interface PersonIdentityMotherStructure extends org.apache.xmlbeans.XmlObject
{
    public static final org.apache.xmlbeans.SchemaType type = (org.apache.xmlbeans.SchemaType)
        org.apache.xmlbeans.XmlBeans.typeSystemForClassLoader(PersonIdentityMotherStructure.class.getClassLoader(), "schemaorg_apache_xmlbeans.system.s30C1180FF47174E0C8A992A2D657328B").resolveHandle("personidentitymotherstructurec000type");
    
    /**
     * Gets the "WithheldIdentity_Structure_Mother" element
     */
    uk.nhs.nhsia.datastandards.ecds.PersonIdentityMotherStructure.WithheldIdentityStructureMother getWithheldIdentityStructureMother();
    
    /**
     * True if has "WithheldIdentity_Structure_Mother" element
     */
    boolean isSetWithheldIdentityStructureMother();
    
    /**
     * Sets the "WithheldIdentity_Structure_Mother" element
     */
    void setWithheldIdentityStructureMother(uk.nhs.nhsia.datastandards.ecds.PersonIdentityMotherStructure.WithheldIdentityStructureMother withheldIdentityStructureMother);
    
    /**
     * Appends and returns a new empty "WithheldIdentity_Structure_Mother" element
     */
    uk.nhs.nhsia.datastandards.ecds.PersonIdentityMotherStructure.WithheldIdentityStructureMother addNewWithheldIdentityStructureMother();
    
    /**
     * Unsets the "WithheldIdentity_Structure_Mother" element
     */
    void unsetWithheldIdentityStructureMother();
    
    /**
     * Gets the "VerifiedIdentity_Structure_Mother" element
     */
    uk.nhs.nhsia.datastandards.ecds.PersonIdentityMotherStructure.VerifiedIdentityStructureMother getVerifiedIdentityStructureMother();
    
    /**
     * True if has "VerifiedIdentity_Structure_Mother" element
     */
    boolean isSetVerifiedIdentityStructureMother();
    
    /**
     * Sets the "VerifiedIdentity_Structure_Mother" element
     */
    void setVerifiedIdentityStructureMother(uk.nhs.nhsia.datastandards.ecds.PersonIdentityMotherStructure.VerifiedIdentityStructureMother verifiedIdentityStructureMother);
    
    /**
     * Appends and returns a new empty "VerifiedIdentity_Structure_Mother" element
     */
    uk.nhs.nhsia.datastandards.ecds.PersonIdentityMotherStructure.VerifiedIdentityStructureMother addNewVerifiedIdentityStructureMother();
    
    /**
     * Unsets the "VerifiedIdentity_Structure_Mother" element
     */
    void unsetVerifiedIdentityStructureMother();
    
    /**
     * Gets the "UnverifiedIdentity_Structure_Mother" element
     */
    uk.nhs.nhsia.datastandards.ecds.PersonIdentityMotherStructure.UnverifiedIdentityStructureMother getUnverifiedIdentityStructureMother();
    
    /**
     * True if has "UnverifiedIdentity_Structure_Mother" element
     */
    boolean isSetUnverifiedIdentityStructureMother();
    
    /**
     * Sets the "UnverifiedIdentity_Structure_Mother" element
     */
    void setUnverifiedIdentityStructureMother(uk.nhs.nhsia.datastandards.ecds.PersonIdentityMotherStructure.UnverifiedIdentityStructureMother unverifiedIdentityStructureMother);
    
    /**
     * Appends and returns a new empty "UnverifiedIdentity_Structure_Mother" element
     */
    uk.nhs.nhsia.datastandards.ecds.PersonIdentityMotherStructure.UnverifiedIdentityStructureMother addNewUnverifiedIdentityStructureMother();
    
    /**
     * Unsets the "UnverifiedIdentity_Structure_Mother" element
     */
    void unsetUnverifiedIdentityStructureMother();
    
    /**
     * An XML WithheldIdentity_Structure_Mother(@http://www.nhsia.nhs.uk/DataStandards/XMLschema/CDS/ns).
     *
     * This is a complex type.
     */
    public interface WithheldIdentityStructureMother extends org.apache.xmlbeans.XmlObject
    {
        public static final org.apache.xmlbeans.SchemaType type = (org.apache.xmlbeans.SchemaType)
            org.apache.xmlbeans.XmlBeans.typeSystemForClassLoader(WithheldIdentityStructureMother.class.getClassLoader(), "schemaorg_apache_xmlbeans.system.s30C1180FF47174E0C8A992A2D657328B").resolveHandle("withheldidentitystructuremother7cdfelemtype");
        
        /**
         * Gets the "NHSNumberStatusIndicatorCode_Mother" element
         */
        uk.nhs.nhsia.datastandards.ecds.NHSNumberStatusIndicatorCodeWithheldType.Enum getNHSNumberStatusIndicatorCodeMother();
        
        /**
         * Gets (as xml) the "NHSNumberStatusIndicatorCode_Mother" element
         */
        uk.nhs.nhsia.datastandards.ecds.NHSNumberStatusIndicatorCodeWithheldType xgetNHSNumberStatusIndicatorCodeMother();
        
        /**
         * Sets the "NHSNumberStatusIndicatorCode_Mother" element
         */
        void setNHSNumberStatusIndicatorCodeMother(uk.nhs.nhsia.datastandards.ecds.NHSNumberStatusIndicatorCodeWithheldType.Enum nhsNumberStatusIndicatorCodeMother);
        
        /**
         * Sets (as xml) the "NHSNumberStatusIndicatorCode_Mother" element
         */
        void xsetNHSNumberStatusIndicatorCodeMother(uk.nhs.nhsia.datastandards.ecds.NHSNumberStatusIndicatorCodeWithheldType nhsNumberStatusIndicatorCodeMother);
        
        /**
         * Gets the "OrganisationCode_ResidenceResponsibility" element
         */
        java.lang.String getOrganisationCodeResidenceResponsibility();
        
        /**
         * Gets (as xml) the "OrganisationCode_ResidenceResponsibility" element
         */
        uk.nhs.nhsia.datastandards.ecds.OrgCodeType xgetOrganisationCodeResidenceResponsibility();
        
        /**
         * True if has "OrganisationCode_ResidenceResponsibility" element
         */
        boolean isSetOrganisationCodeResidenceResponsibility();
        
        /**
         * Sets the "OrganisationCode_ResidenceResponsibility" element
         */
        void setOrganisationCodeResidenceResponsibility(java.lang.String organisationCodeResidenceResponsibility);
        
        /**
         * Sets (as xml) the "OrganisationCode_ResidenceResponsibility" element
         */
        void xsetOrganisationCodeResidenceResponsibility(uk.nhs.nhsia.datastandards.ecds.OrgCodeType organisationCodeResidenceResponsibility);
        
        /**
         * Unsets the "OrganisationCode_ResidenceResponsibility" element
         */
        void unsetOrganisationCodeResidenceResponsibility();
        
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
         * Gets the "NHSNumberStatusIndicatorCode_Mother" attribute
         */
        uk.nhs.nhsia.datastandards.ecds.NHSNumberStatusIndicatorCodeWithheldType.Enum getNHSNumberStatusIndicatorCodeMother2();
        
        /**
         * Gets (as xml) the "NHSNumberStatusIndicatorCode_Mother" attribute
         */
        uk.nhs.nhsia.datastandards.ecds.NHSNumberStatusIndicatorCodeWithheldType xgetNHSNumberStatusIndicatorCodeMother2();
        
        /**
         * Sets the "NHSNumberStatusIndicatorCode_Mother" attribute
         */
        void setNHSNumberStatusIndicatorCodeMother2(uk.nhs.nhsia.datastandards.ecds.NHSNumberStatusIndicatorCodeWithheldType.Enum nhsNumberStatusIndicatorCodeMother2);
        
        /**
         * Sets (as xml) the "NHSNumberStatusIndicatorCode_Mother" attribute
         */
        void xsetNHSNumberStatusIndicatorCodeMother2(uk.nhs.nhsia.datastandards.ecds.NHSNumberStatusIndicatorCodeWithheldType nhsNumberStatusIndicatorCodeMother2);
        
        /**
         * A factory class with static methods for creating instances
         * of this type.
         */
        
        public static final class Factory
        {
            public static uk.nhs.nhsia.datastandards.ecds.PersonIdentityMotherStructure.WithheldIdentityStructureMother newInstance() {
              return (uk.nhs.nhsia.datastandards.ecds.PersonIdentityMotherStructure.WithheldIdentityStructureMother) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().newInstance( type, null ); }
            
            public static uk.nhs.nhsia.datastandards.ecds.PersonIdentityMotherStructure.WithheldIdentityStructureMother newInstance(org.apache.xmlbeans.XmlOptions options) {
              return (uk.nhs.nhsia.datastandards.ecds.PersonIdentityMotherStructure.WithheldIdentityStructureMother) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().newInstance( type, options ); }
            
            private Factory() { } // No instance of this class allowed
        }
    }
    
    /**
     * An XML VerifiedIdentity_Structure_Mother(@http://www.nhsia.nhs.uk/DataStandards/XMLschema/CDS/ns).
     *
     * This is a complex type.
     */
    public interface VerifiedIdentityStructureMother extends org.apache.xmlbeans.XmlObject
    {
        public static final org.apache.xmlbeans.SchemaType type = (org.apache.xmlbeans.SchemaType)
            org.apache.xmlbeans.XmlBeans.typeSystemForClassLoader(VerifiedIdentityStructureMother.class.getClassLoader(), "schemaorg_apache_xmlbeans.system.s30C1180FF47174E0C8A992A2D657328B").resolveHandle("verifiedidentitystructuremother996celemtype");
        
        /**
         * Gets the "LocalPatientIdentifier_Mother" element
         */
        java.lang.String getLocalPatientIdentifierMother();
        
        /**
         * Gets (as xml) the "LocalPatientIdentifier_Mother" element
         */
        uk.nhs.nhsia.datastandards.ecds.LocalPatientIdentifierType xgetLocalPatientIdentifierMother();
        
        /**
         * True if has "LocalPatientIdentifier_Mother" element
         */
        boolean isSetLocalPatientIdentifierMother();
        
        /**
         * Sets the "LocalPatientIdentifier_Mother" element
         */
        void setLocalPatientIdentifierMother(java.lang.String localPatientIdentifierMother);
        
        /**
         * Sets (as xml) the "LocalPatientIdentifier_Mother" element
         */
        void xsetLocalPatientIdentifierMother(uk.nhs.nhsia.datastandards.ecds.LocalPatientIdentifierType localPatientIdentifierMother);
        
        /**
         * Unsets the "LocalPatientIdentifier_Mother" element
         */
        void unsetLocalPatientIdentifierMother();
        
        /**
         * Gets the "OrganisationCode_LocalPatientIdentifier_Mother" element
         */
        java.lang.String getOrganisationCodeLocalPatientIdentifierMother();
        
        /**
         * Gets (as xml) the "OrganisationCode_LocalPatientIdentifier_Mother" element
         */
        uk.nhs.nhsia.datastandards.ecds.OrganisationCodeType xgetOrganisationCodeLocalPatientIdentifierMother();
        
        /**
         * True if has "OrganisationCode_LocalPatientIdentifier_Mother" element
         */
        boolean isSetOrganisationCodeLocalPatientIdentifierMother();
        
        /**
         * Sets the "OrganisationCode_LocalPatientIdentifier_Mother" element
         */
        void setOrganisationCodeLocalPatientIdentifierMother(java.lang.String organisationCodeLocalPatientIdentifierMother);
        
        /**
         * Sets (as xml) the "OrganisationCode_LocalPatientIdentifier_Mother" element
         */
        void xsetOrganisationCodeLocalPatientIdentifierMother(uk.nhs.nhsia.datastandards.ecds.OrganisationCodeType organisationCodeLocalPatientIdentifierMother);
        
        /**
         * Unsets the "OrganisationCode_LocalPatientIdentifier_Mother" element
         */
        void unsetOrganisationCodeLocalPatientIdentifierMother();
        
        /**
         * Gets the "NHSNumber_Mother" element
         */
        java.lang.String getNHSNumberMother();
        
        /**
         * Gets (as xml) the "NHSNumber_Mother" element
         */
        uk.nhs.nhsia.datastandards.ecds.NHSNumberType xgetNHSNumberMother();
        
        /**
         * Sets the "NHSNumber_Mother" element
         */
        void setNHSNumberMother(java.lang.String nhsNumberMother);
        
        /**
         * Sets (as xml) the "NHSNumber_Mother" element
         */
        void xsetNHSNumberMother(uk.nhs.nhsia.datastandards.ecds.NHSNumberType nhsNumberMother);
        
        /**
         * Gets the "NHSNumberStatusIndicatorCode_Mother" element
         */
        uk.nhs.nhsia.datastandards.ecds.NHSNumberStatusIndicatorCodeVerifiedType.Enum getNHSNumberStatusIndicatorCodeMother();
        
        /**
         * Gets (as xml) the "NHSNumberStatusIndicatorCode_Mother" element
         */
        uk.nhs.nhsia.datastandards.ecds.NHSNumberStatusIndicatorCodeVerifiedType xgetNHSNumberStatusIndicatorCodeMother();
        
        /**
         * Sets the "NHSNumberStatusIndicatorCode_Mother" element
         */
        void setNHSNumberStatusIndicatorCodeMother(uk.nhs.nhsia.datastandards.ecds.NHSNumberStatusIndicatorCodeVerifiedType.Enum nhsNumberStatusIndicatorCodeMother);
        
        /**
         * Sets (as xml) the "NHSNumberStatusIndicatorCode_Mother" element
         */
        void xsetNHSNumberStatusIndicatorCodeMother(uk.nhs.nhsia.datastandards.ecds.NHSNumberStatusIndicatorCodeVerifiedType nhsNumberStatusIndicatorCodeMother);
        
        /**
         * Gets the "PostcodeOfUsualAddress_Mother" element
         */
        java.lang.String getPostcodeOfUsualAddressMother();
        
        /**
         * Gets (as xml) the "PostcodeOfUsualAddress_Mother" element
         */
        uk.nhs.nhsia.datastandards.ecds.PostcodeOfUsualAddressType xgetPostcodeOfUsualAddressMother();
        
        /**
         * Sets the "PostcodeOfUsualAddress_Mother" element
         */
        void setPostcodeOfUsualAddressMother(java.lang.String postcodeOfUsualAddressMother);
        
        /**
         * Sets (as xml) the "PostcodeOfUsualAddress_Mother" element
         */
        void xsetPostcodeOfUsualAddressMother(uk.nhs.nhsia.datastandards.ecds.PostcodeOfUsualAddressType postcodeOfUsualAddressMother);
        
        /**
         * Gets the "OrganisationCode_ResidenceResponsibility" element
         */
        java.lang.String getOrganisationCodeResidenceResponsibility();
        
        /**
         * Gets (as xml) the "OrganisationCode_ResidenceResponsibility" element
         */
        uk.nhs.nhsia.datastandards.ecds.OrgCodeType xgetOrganisationCodeResidenceResponsibility();
        
        /**
         * True if has "OrganisationCode_ResidenceResponsibility" element
         */
        boolean isSetOrganisationCodeResidenceResponsibility();
        
        /**
         * Sets the "OrganisationCode_ResidenceResponsibility" element
         */
        void setOrganisationCodeResidenceResponsibility(java.lang.String organisationCodeResidenceResponsibility);
        
        /**
         * Sets (as xml) the "OrganisationCode_ResidenceResponsibility" element
         */
        void xsetOrganisationCodeResidenceResponsibility(uk.nhs.nhsia.datastandards.ecds.OrgCodeType organisationCodeResidenceResponsibility);
        
        /**
         * Unsets the "OrganisationCode_ResidenceResponsibility" element
         */
        void unsetOrganisationCodeResidenceResponsibility();
        
        /**
         * Gets the "PersonBirthDate_Mother" element
         */
        java.util.Calendar getPersonBirthDateMother();
        
        /**
         * Gets (as xml) the "PersonBirthDate_Mother" element
         */
        uk.nhs.nhsia.datastandards.ecds.PersonBirthDateType xgetPersonBirthDateMother();
        
        /**
         * True if has "PersonBirthDate_Mother" element
         */
        boolean isSetPersonBirthDateMother();
        
        /**
         * Sets the "PersonBirthDate_Mother" element
         */
        void setPersonBirthDateMother(java.util.Calendar personBirthDateMother);
        
        /**
         * Sets (as xml) the "PersonBirthDate_Mother" element
         */
        void xsetPersonBirthDateMother(uk.nhs.nhsia.datastandards.ecds.PersonBirthDateType personBirthDateMother);
        
        /**
         * Unsets the "PersonBirthDate_Mother" element
         */
        void unsetPersonBirthDateMother();
        
        /**
         * Gets the "NHSNumberStatusIndicatorCode_Mother" attribute
         */
        uk.nhs.nhsia.datastandards.ecds.NHSNumberStatusIndicatorCodeVerifiedType.Enum getNHSNumberStatusIndicatorCodeMother2();
        
        /**
         * Gets (as xml) the "NHSNumberStatusIndicatorCode_Mother" attribute
         */
        uk.nhs.nhsia.datastandards.ecds.NHSNumberStatusIndicatorCodeVerifiedType xgetNHSNumberStatusIndicatorCodeMother2();
        
        /**
         * Sets the "NHSNumberStatusIndicatorCode_Mother" attribute
         */
        void setNHSNumberStatusIndicatorCodeMother2(uk.nhs.nhsia.datastandards.ecds.NHSNumberStatusIndicatorCodeVerifiedType.Enum nhsNumberStatusIndicatorCodeMother2);
        
        /**
         * Sets (as xml) the "NHSNumberStatusIndicatorCode_Mother" attribute
         */
        void xsetNHSNumberStatusIndicatorCodeMother2(uk.nhs.nhsia.datastandards.ecds.NHSNumberStatusIndicatorCodeVerifiedType nhsNumberStatusIndicatorCodeMother2);
        
        /**
         * A factory class with static methods for creating instances
         * of this type.
         */
        
        public static final class Factory
        {
            public static uk.nhs.nhsia.datastandards.ecds.PersonIdentityMotherStructure.VerifiedIdentityStructureMother newInstance() {
              return (uk.nhs.nhsia.datastandards.ecds.PersonIdentityMotherStructure.VerifiedIdentityStructureMother) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().newInstance( type, null ); }
            
            public static uk.nhs.nhsia.datastandards.ecds.PersonIdentityMotherStructure.VerifiedIdentityStructureMother newInstance(org.apache.xmlbeans.XmlOptions options) {
              return (uk.nhs.nhsia.datastandards.ecds.PersonIdentityMotherStructure.VerifiedIdentityStructureMother) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().newInstance( type, options ); }
            
            private Factory() { } // No instance of this class allowed
        }
    }
    
    /**
     * An XML UnverifiedIdentity_Structure_Mother(@http://www.nhsia.nhs.uk/DataStandards/XMLschema/CDS/ns).
     *
     * This is a complex type.
     */
    public interface UnverifiedIdentityStructureMother extends org.apache.xmlbeans.XmlObject
    {
        public static final org.apache.xmlbeans.SchemaType type = (org.apache.xmlbeans.SchemaType)
            org.apache.xmlbeans.XmlBeans.typeSystemForClassLoader(UnverifiedIdentityStructureMother.class.getClassLoader(), "schemaorg_apache_xmlbeans.system.s30C1180FF47174E0C8A992A2D657328B").resolveHandle("unverifiedidentitystructuremother70c5elemtype");
        
        /**
         * Gets the "LocalPatientIdentifier_Mother" element
         */
        java.lang.String getLocalPatientIdentifierMother();
        
        /**
         * Gets (as xml) the "LocalPatientIdentifier_Mother" element
         */
        uk.nhs.nhsia.datastandards.ecds.LocalPatientIdentifierType xgetLocalPatientIdentifierMother();
        
        /**
         * True if has "LocalPatientIdentifier_Mother" element
         */
        boolean isSetLocalPatientIdentifierMother();
        
        /**
         * Sets the "LocalPatientIdentifier_Mother" element
         */
        void setLocalPatientIdentifierMother(java.lang.String localPatientIdentifierMother);
        
        /**
         * Sets (as xml) the "LocalPatientIdentifier_Mother" element
         */
        void xsetLocalPatientIdentifierMother(uk.nhs.nhsia.datastandards.ecds.LocalPatientIdentifierType localPatientIdentifierMother);
        
        /**
         * Unsets the "LocalPatientIdentifier_Mother" element
         */
        void unsetLocalPatientIdentifierMother();
        
        /**
         * Gets the "OrganisationCode_LocalPatientIdentifier_Mother" element
         */
        java.lang.String getOrganisationCodeLocalPatientIdentifierMother();
        
        /**
         * Gets (as xml) the "OrganisationCode_LocalPatientIdentifier_Mother" element
         */
        uk.nhs.nhsia.datastandards.ecds.OrganisationCodeType xgetOrganisationCodeLocalPatientIdentifierMother();
        
        /**
         * True if has "OrganisationCode_LocalPatientIdentifier_Mother" element
         */
        boolean isSetOrganisationCodeLocalPatientIdentifierMother();
        
        /**
         * Sets the "OrganisationCode_LocalPatientIdentifier_Mother" element
         */
        void setOrganisationCodeLocalPatientIdentifierMother(java.lang.String organisationCodeLocalPatientIdentifierMother);
        
        /**
         * Sets (as xml) the "OrganisationCode_LocalPatientIdentifier_Mother" element
         */
        void xsetOrganisationCodeLocalPatientIdentifierMother(uk.nhs.nhsia.datastandards.ecds.OrganisationCodeType organisationCodeLocalPatientIdentifierMother);
        
        /**
         * Unsets the "OrganisationCode_LocalPatientIdentifier_Mother" element
         */
        void unsetOrganisationCodeLocalPatientIdentifierMother();
        
        /**
         * Gets the "NHSNumber_Mother" element
         */
        java.lang.String getNHSNumberMother();
        
        /**
         * Gets (as xml) the "NHSNumber_Mother" element
         */
        uk.nhs.nhsia.datastandards.ecds.NHSNumberType xgetNHSNumberMother();
        
        /**
         * True if has "NHSNumber_Mother" element
         */
        boolean isSetNHSNumberMother();
        
        /**
         * Sets the "NHSNumber_Mother" element
         */
        void setNHSNumberMother(java.lang.String nhsNumberMother);
        
        /**
         * Sets (as xml) the "NHSNumber_Mother" element
         */
        void xsetNHSNumberMother(uk.nhs.nhsia.datastandards.ecds.NHSNumberType nhsNumberMother);
        
        /**
         * Unsets the "NHSNumber_Mother" element
         */
        void unsetNHSNumberMother();
        
        /**
         * Gets the "NHSNumberStatusIndicatorCode_Mother" element
         */
        uk.nhs.nhsia.datastandards.ecds.NHSNumberStatusIndicatorCodeUnverifiedType.Enum getNHSNumberStatusIndicatorCodeMother();
        
        /**
         * Gets (as xml) the "NHSNumberStatusIndicatorCode_Mother" element
         */
        uk.nhs.nhsia.datastandards.ecds.NHSNumberStatusIndicatorCodeUnverifiedType xgetNHSNumberStatusIndicatorCodeMother();
        
        /**
         * Sets the "NHSNumberStatusIndicatorCode_Mother" element
         */
        void setNHSNumberStatusIndicatorCodeMother(uk.nhs.nhsia.datastandards.ecds.NHSNumberStatusIndicatorCodeUnverifiedType.Enum nhsNumberStatusIndicatorCodeMother);
        
        /**
         * Sets (as xml) the "NHSNumberStatusIndicatorCode_Mother" element
         */
        void xsetNHSNumberStatusIndicatorCodeMother(uk.nhs.nhsia.datastandards.ecds.NHSNumberStatusIndicatorCodeUnverifiedType nhsNumberStatusIndicatorCodeMother);
        
        /**
         * Gets the "PatientUsualAddress_Mother" element
         */
        uk.nhs.nhsia.datastandards.ecds.AddressStructure getPatientUsualAddressMother();
        
        /**
         * True if has "PatientUsualAddress_Mother" element
         */
        boolean isSetPatientUsualAddressMother();
        
        /**
         * Sets the "PatientUsualAddress_Mother" element
         */
        void setPatientUsualAddressMother(uk.nhs.nhsia.datastandards.ecds.AddressStructure patientUsualAddressMother);
        
        /**
         * Appends and returns a new empty "PatientUsualAddress_Mother" element
         */
        uk.nhs.nhsia.datastandards.ecds.AddressStructure addNewPatientUsualAddressMother();
        
        /**
         * Unsets the "PatientUsualAddress_Mother" element
         */
        void unsetPatientUsualAddressMother();
        
        /**
         * Gets the "PostcodeOfUsualAddress_Mother" element
         */
        java.lang.String getPostcodeOfUsualAddressMother();
        
        /**
         * Gets (as xml) the "PostcodeOfUsualAddress_Mother" element
         */
        uk.nhs.nhsia.datastandards.ecds.PostcodeOfUsualAddressType xgetPostcodeOfUsualAddressMother();
        
        /**
         * True if has "PostcodeOfUsualAddress_Mother" element
         */
        boolean isSetPostcodeOfUsualAddressMother();
        
        /**
         * Sets the "PostcodeOfUsualAddress_Mother" element
         */
        void setPostcodeOfUsualAddressMother(java.lang.String postcodeOfUsualAddressMother);
        
        /**
         * Sets (as xml) the "PostcodeOfUsualAddress_Mother" element
         */
        void xsetPostcodeOfUsualAddressMother(uk.nhs.nhsia.datastandards.ecds.PostcodeOfUsualAddressType postcodeOfUsualAddressMother);
        
        /**
         * Unsets the "PostcodeOfUsualAddress_Mother" element
         */
        void unsetPostcodeOfUsualAddressMother();
        
        /**
         * Gets the "OrganisationCode_ResidenceResponsibility" element
         */
        java.lang.String getOrganisationCodeResidenceResponsibility();
        
        /**
         * Gets (as xml) the "OrganisationCode_ResidenceResponsibility" element
         */
        uk.nhs.nhsia.datastandards.ecds.OrgCodeType xgetOrganisationCodeResidenceResponsibility();
        
        /**
         * True if has "OrganisationCode_ResidenceResponsibility" element
         */
        boolean isSetOrganisationCodeResidenceResponsibility();
        
        /**
         * Sets the "OrganisationCode_ResidenceResponsibility" element
         */
        void setOrganisationCodeResidenceResponsibility(java.lang.String organisationCodeResidenceResponsibility);
        
        /**
         * Sets (as xml) the "OrganisationCode_ResidenceResponsibility" element
         */
        void xsetOrganisationCodeResidenceResponsibility(uk.nhs.nhsia.datastandards.ecds.OrgCodeType organisationCodeResidenceResponsibility);
        
        /**
         * Unsets the "OrganisationCode_ResidenceResponsibility" element
         */
        void unsetOrganisationCodeResidenceResponsibility();
        
        /**
         * Gets the "PersonBirthDate_Mother" element
         */
        java.util.Calendar getPersonBirthDateMother();
        
        /**
         * Gets (as xml) the "PersonBirthDate_Mother" element
         */
        uk.nhs.nhsia.datastandards.ecds.PersonBirthDateType xgetPersonBirthDateMother();
        
        /**
         * True if has "PersonBirthDate_Mother" element
         */
        boolean isSetPersonBirthDateMother();
        
        /**
         * Sets the "PersonBirthDate_Mother" element
         */
        void setPersonBirthDateMother(java.util.Calendar personBirthDateMother);
        
        /**
         * Sets (as xml) the "PersonBirthDate_Mother" element
         */
        void xsetPersonBirthDateMother(uk.nhs.nhsia.datastandards.ecds.PersonBirthDateType personBirthDateMother);
        
        /**
         * Unsets the "PersonBirthDate_Mother" element
         */
        void unsetPersonBirthDateMother();
        
        /**
         * Gets the "NHSNumberStatusIndicatorCode_Mother" attribute
         */
        uk.nhs.nhsia.datastandards.ecds.NHSNumberStatusIndicatorCodeUnverifiedType.Enum getNHSNumberStatusIndicatorCodeMother2();
        
        /**
         * Gets (as xml) the "NHSNumberStatusIndicatorCode_Mother" attribute
         */
        uk.nhs.nhsia.datastandards.ecds.NHSNumberStatusIndicatorCodeUnverifiedType xgetNHSNumberStatusIndicatorCodeMother2();
        
        /**
         * Sets the "NHSNumberStatusIndicatorCode_Mother" attribute
         */
        void setNHSNumberStatusIndicatorCodeMother2(uk.nhs.nhsia.datastandards.ecds.NHSNumberStatusIndicatorCodeUnverifiedType.Enum nhsNumberStatusIndicatorCodeMother2);
        
        /**
         * Sets (as xml) the "NHSNumberStatusIndicatorCode_Mother" attribute
         */
        void xsetNHSNumberStatusIndicatorCodeMother2(uk.nhs.nhsia.datastandards.ecds.NHSNumberStatusIndicatorCodeUnverifiedType nhsNumberStatusIndicatorCodeMother2);
        
        /**
         * A factory class with static methods for creating instances
         * of this type.
         */
        
        public static final class Factory
        {
            public static uk.nhs.nhsia.datastandards.ecds.PersonIdentityMotherStructure.UnverifiedIdentityStructureMother newInstance() {
              return (uk.nhs.nhsia.datastandards.ecds.PersonIdentityMotherStructure.UnverifiedIdentityStructureMother) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().newInstance( type, null ); }
            
            public static uk.nhs.nhsia.datastandards.ecds.PersonIdentityMotherStructure.UnverifiedIdentityStructureMother newInstance(org.apache.xmlbeans.XmlOptions options) {
              return (uk.nhs.nhsia.datastandards.ecds.PersonIdentityMotherStructure.UnverifiedIdentityStructureMother) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().newInstance( type, options ); }
            
            private Factory() { } // No instance of this class allowed
        }
    }
    
    /**
     * A factory class with static methods for creating instances
     * of this type.
     */
    
    public static final class Factory
    {
        public static uk.nhs.nhsia.datastandards.ecds.PersonIdentityMotherStructure newInstance() {
          return (uk.nhs.nhsia.datastandards.ecds.PersonIdentityMotherStructure) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().newInstance( type, null ); }
        
        public static uk.nhs.nhsia.datastandards.ecds.PersonIdentityMotherStructure newInstance(org.apache.xmlbeans.XmlOptions options) {
          return (uk.nhs.nhsia.datastandards.ecds.PersonIdentityMotherStructure) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().newInstance( type, options ); }
        
        /** @param xmlAsString the string value to parse */
        public static uk.nhs.nhsia.datastandards.ecds.PersonIdentityMotherStructure parse(java.lang.String xmlAsString) throws org.apache.xmlbeans.XmlException {
          return (uk.nhs.nhsia.datastandards.ecds.PersonIdentityMotherStructure) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( xmlAsString, type, null ); }
        
        public static uk.nhs.nhsia.datastandards.ecds.PersonIdentityMotherStructure parse(java.lang.String xmlAsString, org.apache.xmlbeans.XmlOptions options) throws org.apache.xmlbeans.XmlException {
          return (uk.nhs.nhsia.datastandards.ecds.PersonIdentityMotherStructure) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( xmlAsString, type, options ); }
        
        /** @param file the file from which to load an xml document */
        public static uk.nhs.nhsia.datastandards.ecds.PersonIdentityMotherStructure parse(java.io.File file) throws org.apache.xmlbeans.XmlException, java.io.IOException {
          return (uk.nhs.nhsia.datastandards.ecds.PersonIdentityMotherStructure) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( file, type, null ); }
        
        public static uk.nhs.nhsia.datastandards.ecds.PersonIdentityMotherStructure parse(java.io.File file, org.apache.xmlbeans.XmlOptions options) throws org.apache.xmlbeans.XmlException, java.io.IOException {
          return (uk.nhs.nhsia.datastandards.ecds.PersonIdentityMotherStructure) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( file, type, options ); }
        
        public static uk.nhs.nhsia.datastandards.ecds.PersonIdentityMotherStructure parse(java.net.URL u) throws org.apache.xmlbeans.XmlException, java.io.IOException {
          return (uk.nhs.nhsia.datastandards.ecds.PersonIdentityMotherStructure) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( u, type, null ); }
        
        public static uk.nhs.nhsia.datastandards.ecds.PersonIdentityMotherStructure parse(java.net.URL u, org.apache.xmlbeans.XmlOptions options) throws org.apache.xmlbeans.XmlException, java.io.IOException {
          return (uk.nhs.nhsia.datastandards.ecds.PersonIdentityMotherStructure) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( u, type, options ); }
        
        public static uk.nhs.nhsia.datastandards.ecds.PersonIdentityMotherStructure parse(java.io.InputStream is) throws org.apache.xmlbeans.XmlException, java.io.IOException {
          return (uk.nhs.nhsia.datastandards.ecds.PersonIdentityMotherStructure) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( is, type, null ); }
        
        public static uk.nhs.nhsia.datastandards.ecds.PersonIdentityMotherStructure parse(java.io.InputStream is, org.apache.xmlbeans.XmlOptions options) throws org.apache.xmlbeans.XmlException, java.io.IOException {
          return (uk.nhs.nhsia.datastandards.ecds.PersonIdentityMotherStructure) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( is, type, options ); }
        
        public static uk.nhs.nhsia.datastandards.ecds.PersonIdentityMotherStructure parse(java.io.Reader r) throws org.apache.xmlbeans.XmlException, java.io.IOException {
          return (uk.nhs.nhsia.datastandards.ecds.PersonIdentityMotherStructure) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( r, type, null ); }
        
        public static uk.nhs.nhsia.datastandards.ecds.PersonIdentityMotherStructure parse(java.io.Reader r, org.apache.xmlbeans.XmlOptions options) throws org.apache.xmlbeans.XmlException, java.io.IOException {
          return (uk.nhs.nhsia.datastandards.ecds.PersonIdentityMotherStructure) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( r, type, options ); }
        
        public static uk.nhs.nhsia.datastandards.ecds.PersonIdentityMotherStructure parse(javax.xml.stream.XMLStreamReader sr) throws org.apache.xmlbeans.XmlException {
          return (uk.nhs.nhsia.datastandards.ecds.PersonIdentityMotherStructure) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( sr, type, null ); }
        
        public static uk.nhs.nhsia.datastandards.ecds.PersonIdentityMotherStructure parse(javax.xml.stream.XMLStreamReader sr, org.apache.xmlbeans.XmlOptions options) throws org.apache.xmlbeans.XmlException {
          return (uk.nhs.nhsia.datastandards.ecds.PersonIdentityMotherStructure) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( sr, type, options ); }
        
        public static uk.nhs.nhsia.datastandards.ecds.PersonIdentityMotherStructure parse(org.w3c.dom.Node node) throws org.apache.xmlbeans.XmlException {
          return (uk.nhs.nhsia.datastandards.ecds.PersonIdentityMotherStructure) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( node, type, null ); }
        
        public static uk.nhs.nhsia.datastandards.ecds.PersonIdentityMotherStructure parse(org.w3c.dom.Node node, org.apache.xmlbeans.XmlOptions options) throws org.apache.xmlbeans.XmlException {
          return (uk.nhs.nhsia.datastandards.ecds.PersonIdentityMotherStructure) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( node, type, options ); }
        
        /** @deprecated {@link org.apache.xmlbeans.xml.stream.XMLInputStream} */
        public static uk.nhs.nhsia.datastandards.ecds.PersonIdentityMotherStructure parse(org.apache.xmlbeans.xml.stream.XMLInputStream xis) throws org.apache.xmlbeans.XmlException, org.apache.xmlbeans.xml.stream.XMLStreamException {
          return (uk.nhs.nhsia.datastandards.ecds.PersonIdentityMotherStructure) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( xis, type, null ); }
        
        /** @deprecated {@link org.apache.xmlbeans.xml.stream.XMLInputStream} */
        public static uk.nhs.nhsia.datastandards.ecds.PersonIdentityMotherStructure parse(org.apache.xmlbeans.xml.stream.XMLInputStream xis, org.apache.xmlbeans.XmlOptions options) throws org.apache.xmlbeans.XmlException, org.apache.xmlbeans.xml.stream.XMLStreamException {
          return (uk.nhs.nhsia.datastandards.ecds.PersonIdentityMotherStructure) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( xis, type, options ); }
        
        /** @deprecated {@link org.apache.xmlbeans.xml.stream.XMLInputStream} */
        public static org.apache.xmlbeans.xml.stream.XMLInputStream newValidatingXMLInputStream(org.apache.xmlbeans.xml.stream.XMLInputStream xis) throws org.apache.xmlbeans.XmlException, org.apache.xmlbeans.xml.stream.XMLStreamException {
          return org.apache.xmlbeans.XmlBeans.getContextTypeLoader().newValidatingXMLInputStream( xis, type, null ); }
        
        /** @deprecated {@link org.apache.xmlbeans.xml.stream.XMLInputStream} */
        public static org.apache.xmlbeans.xml.stream.XMLInputStream newValidatingXMLInputStream(org.apache.xmlbeans.xml.stream.XMLInputStream xis, org.apache.xmlbeans.XmlOptions options) throws org.apache.xmlbeans.XmlException, org.apache.xmlbeans.xml.stream.XMLStreamException {
          return org.apache.xmlbeans.XmlBeans.getContextTypeLoader().newValidatingXMLInputStream( xis, type, options ); }
        
        private Factory() { } // No instance of this class allowed
    }
}
