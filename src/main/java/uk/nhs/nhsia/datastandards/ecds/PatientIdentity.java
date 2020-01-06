/*
 * XML Type:  PatientIdentity
 * Namespace: http://www.nhsia.nhs.uk/DataStandards/XMLschema/CDS/ns
 * Java type: uk.nhs.nhsia.datastandards.ecds.PatientIdentity
 *
 * Automatically generated - do not modify.
 */
package uk.nhs.nhsia.datastandards.ecds;


/**
 * An XML PatientIdentity(@http://www.nhsia.nhs.uk/DataStandards/XMLschema/CDS/ns).
 *
 * This is a complex type.
 */
public interface PatientIdentity extends org.apache.xmlbeans.XmlObject
{
    public static final org.apache.xmlbeans.SchemaType type = (org.apache.xmlbeans.SchemaType)
        org.apache.xmlbeans.XmlBeans.typeSystemForClassLoader(PatientIdentity.class.getClassLoader(), "schemaorg_apache_xmlbeans.system.s30C1180FF47174E0C8A992A2D657328B").resolveHandle("patientidentity0da0type");
    
    /**
     * Gets the "WithheldIdentity_Structure" element
     */
    uk.nhs.nhsia.datastandards.ecds.PatientIdentity.WithheldIdentityStructure getWithheldIdentityStructure();
    
    /**
     * True if has "WithheldIdentity_Structure" element
     */
    boolean isSetWithheldIdentityStructure();
    
    /**
     * Sets the "WithheldIdentity_Structure" element
     */
    void setWithheldIdentityStructure(uk.nhs.nhsia.datastandards.ecds.PatientIdentity.WithheldIdentityStructure withheldIdentityStructure);
    
    /**
     * Appends and returns a new empty "WithheldIdentity_Structure" element
     */
    uk.nhs.nhsia.datastandards.ecds.PatientIdentity.WithheldIdentityStructure addNewWithheldIdentityStructure();
    
    /**
     * Unsets the "WithheldIdentity_Structure" element
     */
    void unsetWithheldIdentityStructure();
    
    /**
     * Gets the "VerifiedIdentity_Structure" element
     */
    uk.nhs.nhsia.datastandards.ecds.PatientIdentity.VerifiedIdentityStructure getVerifiedIdentityStructure();
    
    /**
     * True if has "VerifiedIdentity_Structure" element
     */
    boolean isSetVerifiedIdentityStructure();
    
    /**
     * Sets the "VerifiedIdentity_Structure" element
     */
    void setVerifiedIdentityStructure(uk.nhs.nhsia.datastandards.ecds.PatientIdentity.VerifiedIdentityStructure verifiedIdentityStructure);
    
    /**
     * Appends and returns a new empty "VerifiedIdentity_Structure" element
     */
    uk.nhs.nhsia.datastandards.ecds.PatientIdentity.VerifiedIdentityStructure addNewVerifiedIdentityStructure();
    
    /**
     * Unsets the "VerifiedIdentity_Structure" element
     */
    void unsetVerifiedIdentityStructure();
    
    /**
     * Gets the "UnverifiedIdentity_Structure" element
     */
    uk.nhs.nhsia.datastandards.ecds.PatientIdentity.UnverifiedIdentityStructure getUnverifiedIdentityStructure();
    
    /**
     * True if has "UnverifiedIdentity_Structure" element
     */
    boolean isSetUnverifiedIdentityStructure();
    
    /**
     * Sets the "UnverifiedIdentity_Structure" element
     */
    void setUnverifiedIdentityStructure(uk.nhs.nhsia.datastandards.ecds.PatientIdentity.UnverifiedIdentityStructure unverifiedIdentityStructure);
    
    /**
     * Appends and returns a new empty "UnverifiedIdentity_Structure" element
     */
    uk.nhs.nhsia.datastandards.ecds.PatientIdentity.UnverifiedIdentityStructure addNewUnverifiedIdentityStructure();
    
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
            org.apache.xmlbeans.XmlBeans.typeSystemForClassLoader(WithheldIdentityStructure.class.getClassLoader(), "schemaorg_apache_xmlbeans.system.s30C1180FF47174E0C8A992A2D657328B").resolveHandle("withheldidentitystructuref997elemtype");
        
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
         * Gets the "OrganisationIdentifier_ResidenceResponsibility" element
         */
        java.lang.String getOrganisationIdentifierResidenceResponsibility();
        
        /**
         * Gets (as xml) the "OrganisationIdentifier_ResidenceResponsibility" element
         */
        uk.nhs.nhsia.datastandards.ecds.OrgIdenECType xgetOrganisationIdentifierResidenceResponsibility();
        
        /**
         * True if has "OrganisationIdentifier_ResidenceResponsibility" element
         */
        boolean isSetOrganisationIdentifierResidenceResponsibility();
        
        /**
         * Sets the "OrganisationIdentifier_ResidenceResponsibility" element
         */
        void setOrganisationIdentifierResidenceResponsibility(java.lang.String organisationIdentifierResidenceResponsibility);
        
        /**
         * Sets (as xml) the "OrganisationIdentifier_ResidenceResponsibility" element
         */
        void xsetOrganisationIdentifierResidenceResponsibility(uk.nhs.nhsia.datastandards.ecds.OrgIdenECType organisationIdentifierResidenceResponsibility);
        
        /**
         * Unsets the "OrganisationIdentifier_ResidenceResponsibility" element
         */
        void unsetOrganisationIdentifierResidenceResponsibility();
        
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
            public static uk.nhs.nhsia.datastandards.ecds.PatientIdentity.WithheldIdentityStructure newInstance() {
              return (uk.nhs.nhsia.datastandards.ecds.PatientIdentity.WithheldIdentityStructure) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().newInstance( type, null ); }
            
            public static uk.nhs.nhsia.datastandards.ecds.PatientIdentity.WithheldIdentityStructure newInstance(org.apache.xmlbeans.XmlOptions options) {
              return (uk.nhs.nhsia.datastandards.ecds.PatientIdentity.WithheldIdentityStructure) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().newInstance( type, options ); }
            
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
            org.apache.xmlbeans.XmlBeans.typeSystemForClassLoader(VerifiedIdentityStructure.class.getClassLoader(), "schemaorg_apache_xmlbeans.system.s30C1180FF47174E0C8A992A2D657328B").resolveHandle("verifiedidentitystructureb7aaelemtype");
        
        /**
         * Gets the "LocalIdentifierStructure" element
         */
        uk.nhs.nhsia.datastandards.ecds.PatientIdentity.VerifiedIdentityStructure.LocalIdentifierStructure getLocalIdentifierStructure();
        
        /**
         * True if has "LocalIdentifierStructure" element
         */
        boolean isSetLocalIdentifierStructure();
        
        /**
         * Sets the "LocalIdentifierStructure" element
         */
        void setLocalIdentifierStructure(uk.nhs.nhsia.datastandards.ecds.PatientIdentity.VerifiedIdentityStructure.LocalIdentifierStructure localIdentifierStructure);
        
        /**
         * Appends and returns a new empty "LocalIdentifierStructure" element
         */
        uk.nhs.nhsia.datastandards.ecds.PatientIdentity.VerifiedIdentityStructure.LocalIdentifierStructure addNewLocalIdentifierStructure();
        
        /**
         * Unsets the "LocalIdentifierStructure" element
         */
        void unsetLocalIdentifierStructure();
        
        /**
         * Gets the "DataElementStructure" element
         */
        uk.nhs.nhsia.datastandards.ecds.PatientIdentity.VerifiedIdentityStructure.DataElementStructure getDataElementStructure();
        
        /**
         * Sets the "DataElementStructure" element
         */
        void setDataElementStructure(uk.nhs.nhsia.datastandards.ecds.PatientIdentity.VerifiedIdentityStructure.DataElementStructure dataElementStructure);
        
        /**
         * Appends and returns a new empty "DataElementStructure" element
         */
        uk.nhs.nhsia.datastandards.ecds.PatientIdentity.VerifiedIdentityStructure.DataElementStructure addNewDataElementStructure();
        
        /**
         * Gets the "NHSNumberStatusIndicatorCode" attribute
         */
        uk.nhs.nhsia.datastandards.ecds.NHSNumberStatusIndicatorCodeVerifiedType.Enum getNHSNumberStatusIndicatorCode();
        
        /**
         * Gets (as xml) the "NHSNumberStatusIndicatorCode" attribute
         */
        uk.nhs.nhsia.datastandards.ecds.NHSNumberStatusIndicatorCodeVerifiedType xgetNHSNumberStatusIndicatorCode();
        
        /**
         * Sets the "NHSNumberStatusIndicatorCode" attribute
         */
        void setNHSNumberStatusIndicatorCode(uk.nhs.nhsia.datastandards.ecds.NHSNumberStatusIndicatorCodeVerifiedType.Enum nhsNumberStatusIndicatorCode);
        
        /**
         * Sets (as xml) the "NHSNumberStatusIndicatorCode" attribute
         */
        void xsetNHSNumberStatusIndicatorCode(uk.nhs.nhsia.datastandards.ecds.NHSNumberStatusIndicatorCodeVerifiedType nhsNumberStatusIndicatorCode);
        
        /**
         * An XML LocalIdentifierStructure(@http://www.nhsia.nhs.uk/DataStandards/XMLschema/CDS/ns).
         *
         * This is a complex type.
         */
        public interface LocalIdentifierStructure extends org.apache.xmlbeans.XmlObject
        {
            public static final org.apache.xmlbeans.SchemaType type = (org.apache.xmlbeans.SchemaType)
                org.apache.xmlbeans.XmlBeans.typeSystemForClassLoader(LocalIdentifierStructure.class.getClassLoader(), "schemaorg_apache_xmlbeans.system.s30C1180FF47174E0C8A992A2D657328B").resolveHandle("localidentifierstructurec985elemtype");
            
            /**
             * Gets the "LocalPatientIdentifier_Extended" element
             */
            java.lang.String getLocalPatientIdentifierExtended();
            
            /**
             * Gets (as xml) the "LocalPatientIdentifier_Extended" element
             */
            uk.nhs.nhsia.datastandards.ecds.LocalPatientIdentifierECType xgetLocalPatientIdentifierExtended();
            
            /**
             * True if has "LocalPatientIdentifier_Extended" element
             */
            boolean isSetLocalPatientIdentifierExtended();
            
            /**
             * Sets the "LocalPatientIdentifier_Extended" element
             */
            void setLocalPatientIdentifierExtended(java.lang.String localPatientIdentifierExtended);
            
            /**
             * Sets (as xml) the "LocalPatientIdentifier_Extended" element
             */
            void xsetLocalPatientIdentifierExtended(uk.nhs.nhsia.datastandards.ecds.LocalPatientIdentifierECType localPatientIdentifierExtended);
            
            /**
             * Unsets the "LocalPatientIdentifier_Extended" element
             */
            void unsetLocalPatientIdentifierExtended();
            
            /**
             * Gets the "OrganisationIdentifier_LocalPatientIdentifier" element
             */
            java.lang.String getOrganisationIdentifierLocalPatientIdentifier();
            
            /**
             * Gets (as xml) the "OrganisationIdentifier_LocalPatientIdentifier" element
             */
            uk.nhs.nhsia.datastandards.ecds.OrgIdenECType xgetOrganisationIdentifierLocalPatientIdentifier();
            
            /**
             * True if has "OrganisationIdentifier_LocalPatientIdentifier" element
             */
            boolean isSetOrganisationIdentifierLocalPatientIdentifier();
            
            /**
             * Sets the "OrganisationIdentifier_LocalPatientIdentifier" element
             */
            void setOrganisationIdentifierLocalPatientIdentifier(java.lang.String organisationIdentifierLocalPatientIdentifier);
            
            /**
             * Sets (as xml) the "OrganisationIdentifier_LocalPatientIdentifier" element
             */
            void xsetOrganisationIdentifierLocalPatientIdentifier(uk.nhs.nhsia.datastandards.ecds.OrgIdenECType organisationIdentifierLocalPatientIdentifier);
            
            /**
             * Unsets the "OrganisationIdentifier_LocalPatientIdentifier" element
             */
            void unsetOrganisationIdentifierLocalPatientIdentifier();
            
            /**
             * A factory class with static methods for creating instances
             * of this type.
             */
            
            public static final class Factory
            {
                public static uk.nhs.nhsia.datastandards.ecds.PatientIdentity.VerifiedIdentityStructure.LocalIdentifierStructure newInstance() {
                  return (uk.nhs.nhsia.datastandards.ecds.PatientIdentity.VerifiedIdentityStructure.LocalIdentifierStructure) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().newInstance( type, null ); }
                
                public static uk.nhs.nhsia.datastandards.ecds.PatientIdentity.VerifiedIdentityStructure.LocalIdentifierStructure newInstance(org.apache.xmlbeans.XmlOptions options) {
                  return (uk.nhs.nhsia.datastandards.ecds.PatientIdentity.VerifiedIdentityStructure.LocalIdentifierStructure) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().newInstance( type, options ); }
                
                private Factory() { } // No instance of this class allowed
            }
        }
        
        /**
         * An XML DataElementStructure(@http://www.nhsia.nhs.uk/DataStandards/XMLschema/CDS/ns).
         *
         * This is a complex type.
         */
        public interface DataElementStructure extends org.apache.xmlbeans.XmlObject
        {
            public static final org.apache.xmlbeans.SchemaType type = (org.apache.xmlbeans.SchemaType)
                org.apache.xmlbeans.XmlBeans.typeSystemForClassLoader(DataElementStructure.class.getClassLoader(), "schemaorg_apache_xmlbeans.system.s30C1180FF47174E0C8A992A2D657328B").resolveHandle("dataelementstructure8c47elemtype");
            
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
             * Gets the "PostcodeOfUsualAddress" element
             */
            java.lang.String getPostcodeOfUsualAddress();
            
            /**
             * Gets (as xml) the "PostcodeOfUsualAddress" element
             */
            uk.nhs.nhsia.datastandards.ecds.PostcodeOfUsualAddressType xgetPostcodeOfUsualAddress();
            
            /**
             * Sets the "PostcodeOfUsualAddress" element
             */
            void setPostcodeOfUsualAddress(java.lang.String postcodeOfUsualAddress);
            
            /**
             * Sets (as xml) the "PostcodeOfUsualAddress" element
             */
            void xsetPostcodeOfUsualAddress(uk.nhs.nhsia.datastandards.ecds.PostcodeOfUsualAddressType postcodeOfUsualAddress);
            
            /**
             * Gets the "OrganisationIdentifier_ResidenceResponsibility" element
             */
            java.lang.String getOrganisationIdentifierResidenceResponsibility();
            
            /**
             * Gets (as xml) the "OrganisationIdentifier_ResidenceResponsibility" element
             */
            uk.nhs.nhsia.datastandards.ecds.OrgIdenECType xgetOrganisationIdentifierResidenceResponsibility();
            
            /**
             * True if has "OrganisationIdentifier_ResidenceResponsibility" element
             */
            boolean isSetOrganisationIdentifierResidenceResponsibility();
            
            /**
             * Sets the "OrganisationIdentifier_ResidenceResponsibility" element
             */
            void setOrganisationIdentifierResidenceResponsibility(java.lang.String organisationIdentifierResidenceResponsibility);
            
            /**
             * Sets (as xml) the "OrganisationIdentifier_ResidenceResponsibility" element
             */
            void xsetOrganisationIdentifierResidenceResponsibility(uk.nhs.nhsia.datastandards.ecds.OrgIdenECType organisationIdentifierResidenceResponsibility);
            
            /**
             * Unsets the "OrganisationIdentifier_ResidenceResponsibility" element
             */
            void unsetOrganisationIdentifierResidenceResponsibility();
            
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
             * A factory class with static methods for creating instances
             * of this type.
             */
            
            public static final class Factory
            {
                public static uk.nhs.nhsia.datastandards.ecds.PatientIdentity.VerifiedIdentityStructure.DataElementStructure newInstance() {
                  return (uk.nhs.nhsia.datastandards.ecds.PatientIdentity.VerifiedIdentityStructure.DataElementStructure) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().newInstance( type, null ); }
                
                public static uk.nhs.nhsia.datastandards.ecds.PatientIdentity.VerifiedIdentityStructure.DataElementStructure newInstance(org.apache.xmlbeans.XmlOptions options) {
                  return (uk.nhs.nhsia.datastandards.ecds.PatientIdentity.VerifiedIdentityStructure.DataElementStructure) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().newInstance( type, options ); }
                
                private Factory() { } // No instance of this class allowed
            }
        }
        
        /**
         * A factory class with static methods for creating instances
         * of this type.
         */
        
        public static final class Factory
        {
            public static uk.nhs.nhsia.datastandards.ecds.PatientIdentity.VerifiedIdentityStructure newInstance() {
              return (uk.nhs.nhsia.datastandards.ecds.PatientIdentity.VerifiedIdentityStructure) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().newInstance( type, null ); }
            
            public static uk.nhs.nhsia.datastandards.ecds.PatientIdentity.VerifiedIdentityStructure newInstance(org.apache.xmlbeans.XmlOptions options) {
              return (uk.nhs.nhsia.datastandards.ecds.PatientIdentity.VerifiedIdentityStructure) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().newInstance( type, options ); }
            
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
            org.apache.xmlbeans.XmlBeans.typeSystemForClassLoader(UnverifiedIdentityStructure.class.getClassLoader(), "schemaorg_apache_xmlbeans.system.s30C1180FF47174E0C8A992A2D657328B").resolveHandle("unverifiedidentitystructuref071elemtype");
        
        /**
         * Gets the "LocalIdentifierStructure" element
         */
        uk.nhs.nhsia.datastandards.ecds.PatientIdentity.UnverifiedIdentityStructure.LocalIdentifierStructure getLocalIdentifierStructure();
        
        /**
         * True if has "LocalIdentifierStructure" element
         */
        boolean isSetLocalIdentifierStructure();
        
        /**
         * Sets the "LocalIdentifierStructure" element
         */
        void setLocalIdentifierStructure(uk.nhs.nhsia.datastandards.ecds.PatientIdentity.UnverifiedIdentityStructure.LocalIdentifierStructure localIdentifierStructure);
        
        /**
         * Appends and returns a new empty "LocalIdentifierStructure" element
         */
        uk.nhs.nhsia.datastandards.ecds.PatientIdentity.UnverifiedIdentityStructure.LocalIdentifierStructure addNewLocalIdentifierStructure();
        
        /**
         * Unsets the "LocalIdentifierStructure" element
         */
        void unsetLocalIdentifierStructure();
        
        /**
         * Gets the "DataElementStructure" element
         */
        uk.nhs.nhsia.datastandards.ecds.PatientIdentity.UnverifiedIdentityStructure.DataElementStructure getDataElementStructure();
        
        /**
         * True if has "DataElementStructure" element
         */
        boolean isSetDataElementStructure();
        
        /**
         * Sets the "DataElementStructure" element
         */
        void setDataElementStructure(uk.nhs.nhsia.datastandards.ecds.PatientIdentity.UnverifiedIdentityStructure.DataElementStructure dataElementStructure);
        
        /**
         * Appends and returns a new empty "DataElementStructure" element
         */
        uk.nhs.nhsia.datastandards.ecds.PatientIdentity.UnverifiedIdentityStructure.DataElementStructure addNewDataElementStructure();
        
        /**
         * Unsets the "DataElementStructure" element
         */
        void unsetDataElementStructure();
        
        /**
         * Gets the "DataElementStructure2" element
         */
        uk.nhs.nhsia.datastandards.ecds.PatientIdentity.UnverifiedIdentityStructure.DataElementStructure2 getDataElementStructure2();
        
        /**
         * True if has "DataElementStructure2" element
         */
        boolean isSetDataElementStructure2();
        
        /**
         * Sets the "DataElementStructure2" element
         */
        void setDataElementStructure2(uk.nhs.nhsia.datastandards.ecds.PatientIdentity.UnverifiedIdentityStructure.DataElementStructure2 dataElementStructure2);
        
        /**
         * Appends and returns a new empty "DataElementStructure2" element
         */
        uk.nhs.nhsia.datastandards.ecds.PatientIdentity.UnverifiedIdentityStructure.DataElementStructure2 addNewDataElementStructure2();
        
        /**
         * Unsets the "DataElementStructure2" element
         */
        void unsetDataElementStructure2();
        
        /**
         * Gets the "NHSNumberStatusIndicatorCode" attribute
         */
        uk.nhs.nhsia.datastandards.ecds.NHSNumberStatusIndicatorCodeUnverifiedType.Enum getNHSNumberStatusIndicatorCode();
        
        /**
         * Gets (as xml) the "NHSNumberStatusIndicatorCode" attribute
         */
        uk.nhs.nhsia.datastandards.ecds.NHSNumberStatusIndicatorCodeUnverifiedType xgetNHSNumberStatusIndicatorCode();
        
        /**
         * Sets the "NHSNumberStatusIndicatorCode" attribute
         */
        void setNHSNumberStatusIndicatorCode(uk.nhs.nhsia.datastandards.ecds.NHSNumberStatusIndicatorCodeUnverifiedType.Enum nhsNumberStatusIndicatorCode);
        
        /**
         * Sets (as xml) the "NHSNumberStatusIndicatorCode" attribute
         */
        void xsetNHSNumberStatusIndicatorCode(uk.nhs.nhsia.datastandards.ecds.NHSNumberStatusIndicatorCodeUnverifiedType nhsNumberStatusIndicatorCode);
        
        /**
         * An XML LocalIdentifierStructure(@http://www.nhsia.nhs.uk/DataStandards/XMLschema/CDS/ns).
         *
         * This is a complex type.
         */
        public interface LocalIdentifierStructure extends org.apache.xmlbeans.XmlObject
        {
            public static final org.apache.xmlbeans.SchemaType type = (org.apache.xmlbeans.SchemaType)
                org.apache.xmlbeans.XmlBeans.typeSystemForClassLoader(LocalIdentifierStructure.class.getClassLoader(), "schemaorg_apache_xmlbeans.system.s30C1180FF47174E0C8A992A2D657328B").resolveHandle("localidentifierstructuref78celemtype");
            
            /**
             * Gets the "LocalPatientIdentifier_Extended" element
             */
            java.lang.String getLocalPatientIdentifierExtended();
            
            /**
             * Gets (as xml) the "LocalPatientIdentifier_Extended" element
             */
            uk.nhs.nhsia.datastandards.ecds.LocalPatientIdentifierECType xgetLocalPatientIdentifierExtended();
            
            /**
             * Sets the "LocalPatientIdentifier_Extended" element
             */
            void setLocalPatientIdentifierExtended(java.lang.String localPatientIdentifierExtended);
            
            /**
             * Sets (as xml) the "LocalPatientIdentifier_Extended" element
             */
            void xsetLocalPatientIdentifierExtended(uk.nhs.nhsia.datastandards.ecds.LocalPatientIdentifierECType localPatientIdentifierExtended);
            
            /**
             * Gets the "OrganisationIdentifier_LocalPatientIdentifier" element
             */
            java.lang.String getOrganisationIdentifierLocalPatientIdentifier();
            
            /**
             * Gets (as xml) the "OrganisationIdentifier_LocalPatientIdentifier" element
             */
            uk.nhs.nhsia.datastandards.ecds.OrgIdenECType xgetOrganisationIdentifierLocalPatientIdentifier();
            
            /**
             * Sets the "OrganisationIdentifier_LocalPatientIdentifier" element
             */
            void setOrganisationIdentifierLocalPatientIdentifier(java.lang.String organisationIdentifierLocalPatientIdentifier);
            
            /**
             * Sets (as xml) the "OrganisationIdentifier_LocalPatientIdentifier" element
             */
            void xsetOrganisationIdentifierLocalPatientIdentifier(uk.nhs.nhsia.datastandards.ecds.OrgIdenECType organisationIdentifierLocalPatientIdentifier);
            
            /**
             * A factory class with static methods for creating instances
             * of this type.
             */
            
            public static final class Factory
            {
                public static uk.nhs.nhsia.datastandards.ecds.PatientIdentity.UnverifiedIdentityStructure.LocalIdentifierStructure newInstance() {
                  return (uk.nhs.nhsia.datastandards.ecds.PatientIdentity.UnverifiedIdentityStructure.LocalIdentifierStructure) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().newInstance( type, null ); }
                
                public static uk.nhs.nhsia.datastandards.ecds.PatientIdentity.UnverifiedIdentityStructure.LocalIdentifierStructure newInstance(org.apache.xmlbeans.XmlOptions options) {
                  return (uk.nhs.nhsia.datastandards.ecds.PatientIdentity.UnverifiedIdentityStructure.LocalIdentifierStructure) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().newInstance( type, options ); }
                
                private Factory() { } // No instance of this class allowed
            }
        }
        
        /**
         * An XML DataElementStructure(@http://www.nhsia.nhs.uk/DataStandards/XMLschema/CDS/ns).
         *
         * This is a complex type.
         */
        public interface DataElementStructure extends org.apache.xmlbeans.XmlObject
        {
            public static final org.apache.xmlbeans.SchemaType type = (org.apache.xmlbeans.SchemaType)
                org.apache.xmlbeans.XmlBeans.typeSystemForClassLoader(DataElementStructure.class.getClassLoader(), "schemaorg_apache_xmlbeans.system.s30C1180FF47174E0C8A992A2D657328B").resolveHandle("dataelementstructure11ceelemtype");
            
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
             * Gets the "PatientUsualAddress" element
             */
            uk.nhs.nhsia.datastandards.ecds.AddressStructure getPatientUsualAddress();
            
            /**
             * True if has "PatientUsualAddress" element
             */
            boolean isSetPatientUsualAddress();
            
            /**
             * Sets the "PatientUsualAddress" element
             */
            void setPatientUsualAddress(uk.nhs.nhsia.datastandards.ecds.AddressStructure patientUsualAddress);
            
            /**
             * Appends and returns a new empty "PatientUsualAddress" element
             */
            uk.nhs.nhsia.datastandards.ecds.AddressStructure addNewPatientUsualAddress();
            
            /**
             * Unsets the "PatientUsualAddress" element
             */
            void unsetPatientUsualAddress();
            
            /**
             * A factory class with static methods for creating instances
             * of this type.
             */
            
            public static final class Factory
            {
                public static uk.nhs.nhsia.datastandards.ecds.PatientIdentity.UnverifiedIdentityStructure.DataElementStructure newInstance() {
                  return (uk.nhs.nhsia.datastandards.ecds.PatientIdentity.UnverifiedIdentityStructure.DataElementStructure) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().newInstance( type, null ); }
                
                public static uk.nhs.nhsia.datastandards.ecds.PatientIdentity.UnverifiedIdentityStructure.DataElementStructure newInstance(org.apache.xmlbeans.XmlOptions options) {
                  return (uk.nhs.nhsia.datastandards.ecds.PatientIdentity.UnverifiedIdentityStructure.DataElementStructure) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().newInstance( type, options ); }
                
                private Factory() { } // No instance of this class allowed
            }
        }
        
        /**
         * An XML DataElementStructure2(@http://www.nhsia.nhs.uk/DataStandards/XMLschema/CDS/ns).
         *
         * This is a complex type.
         */
        public interface DataElementStructure2 extends org.apache.xmlbeans.XmlObject
        {
            public static final org.apache.xmlbeans.SchemaType type = (org.apache.xmlbeans.SchemaType)
                org.apache.xmlbeans.XmlBeans.typeSystemForClassLoader(DataElementStructure2.class.getClassLoader(), "schemaorg_apache_xmlbeans.system.s30C1180FF47174E0C8A992A2D657328B").resolveHandle("dataelementstructure2686eelemtype");
            
            /**
             * Gets the "PostcodeOfUsualAddress" element
             */
            java.lang.String getPostcodeOfUsualAddress();
            
            /**
             * Gets (as xml) the "PostcodeOfUsualAddress" element
             */
            uk.nhs.nhsia.datastandards.ecds.PostcodeOfUsualAddressType xgetPostcodeOfUsualAddress();
            
            /**
             * True if has "PostcodeOfUsualAddress" element
             */
            boolean isSetPostcodeOfUsualAddress();
            
            /**
             * Sets the "PostcodeOfUsualAddress" element
             */
            void setPostcodeOfUsualAddress(java.lang.String postcodeOfUsualAddress);
            
            /**
             * Sets (as xml) the "PostcodeOfUsualAddress" element
             */
            void xsetPostcodeOfUsualAddress(uk.nhs.nhsia.datastandards.ecds.PostcodeOfUsualAddressType postcodeOfUsualAddress);
            
            /**
             * Unsets the "PostcodeOfUsualAddress" element
             */
            void unsetPostcodeOfUsualAddress();
            
            /**
             * Gets the "OrganisationIdentifier_ResidenceResponsibility" element
             */
            java.lang.String getOrganisationIdentifierResidenceResponsibility();
            
            /**
             * Gets (as xml) the "OrganisationIdentifier_ResidenceResponsibility" element
             */
            uk.nhs.nhsia.datastandards.ecds.OrgIdenECType xgetOrganisationIdentifierResidenceResponsibility();
            
            /**
             * True if has "OrganisationIdentifier_ResidenceResponsibility" element
             */
            boolean isSetOrganisationIdentifierResidenceResponsibility();
            
            /**
             * Sets the "OrganisationIdentifier_ResidenceResponsibility" element
             */
            void setOrganisationIdentifierResidenceResponsibility(java.lang.String organisationIdentifierResidenceResponsibility);
            
            /**
             * Sets (as xml) the "OrganisationIdentifier_ResidenceResponsibility" element
             */
            void xsetOrganisationIdentifierResidenceResponsibility(uk.nhs.nhsia.datastandards.ecds.OrgIdenECType organisationIdentifierResidenceResponsibility);
            
            /**
             * Unsets the "OrganisationIdentifier_ResidenceResponsibility" element
             */
            void unsetOrganisationIdentifierResidenceResponsibility();
            
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
             * A factory class with static methods for creating instances
             * of this type.
             */
            
            public static final class Factory
            {
                public static uk.nhs.nhsia.datastandards.ecds.PatientIdentity.UnverifiedIdentityStructure.DataElementStructure2 newInstance() {
                  return (uk.nhs.nhsia.datastandards.ecds.PatientIdentity.UnverifiedIdentityStructure.DataElementStructure2) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().newInstance( type, null ); }
                
                public static uk.nhs.nhsia.datastandards.ecds.PatientIdentity.UnverifiedIdentityStructure.DataElementStructure2 newInstance(org.apache.xmlbeans.XmlOptions options) {
                  return (uk.nhs.nhsia.datastandards.ecds.PatientIdentity.UnverifiedIdentityStructure.DataElementStructure2) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().newInstance( type, options ); }
                
                private Factory() { } // No instance of this class allowed
            }
        }
        
        /**
         * A factory class with static methods for creating instances
         * of this type.
         */
        
        public static final class Factory
        {
            public static uk.nhs.nhsia.datastandards.ecds.PatientIdentity.UnverifiedIdentityStructure newInstance() {
              return (uk.nhs.nhsia.datastandards.ecds.PatientIdentity.UnverifiedIdentityStructure) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().newInstance( type, null ); }
            
            public static uk.nhs.nhsia.datastandards.ecds.PatientIdentity.UnverifiedIdentityStructure newInstance(org.apache.xmlbeans.XmlOptions options) {
              return (uk.nhs.nhsia.datastandards.ecds.PatientIdentity.UnverifiedIdentityStructure) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().newInstance( type, options ); }
            
            private Factory() { } // No instance of this class allowed
        }
    }
    
    /**
     * A factory class with static methods for creating instances
     * of this type.
     */
    
    public static final class Factory
    {
        public static uk.nhs.nhsia.datastandards.ecds.PatientIdentity newInstance() {
          return (uk.nhs.nhsia.datastandards.ecds.PatientIdentity) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().newInstance( type, null ); }
        
        public static uk.nhs.nhsia.datastandards.ecds.PatientIdentity newInstance(org.apache.xmlbeans.XmlOptions options) {
          return (uk.nhs.nhsia.datastandards.ecds.PatientIdentity) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().newInstance( type, options ); }
        
        /** @param xmlAsString the string value to parse */
        public static uk.nhs.nhsia.datastandards.ecds.PatientIdentity parse(java.lang.String xmlAsString) throws org.apache.xmlbeans.XmlException {
          return (uk.nhs.nhsia.datastandards.ecds.PatientIdentity) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( xmlAsString, type, null ); }
        
        public static uk.nhs.nhsia.datastandards.ecds.PatientIdentity parse(java.lang.String xmlAsString, org.apache.xmlbeans.XmlOptions options) throws org.apache.xmlbeans.XmlException {
          return (uk.nhs.nhsia.datastandards.ecds.PatientIdentity) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( xmlAsString, type, options ); }
        
        /** @param file the file from which to load an xml document */
        public static uk.nhs.nhsia.datastandards.ecds.PatientIdentity parse(java.io.File file) throws org.apache.xmlbeans.XmlException, java.io.IOException {
          return (uk.nhs.nhsia.datastandards.ecds.PatientIdentity) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( file, type, null ); }
        
        public static uk.nhs.nhsia.datastandards.ecds.PatientIdentity parse(java.io.File file, org.apache.xmlbeans.XmlOptions options) throws org.apache.xmlbeans.XmlException, java.io.IOException {
          return (uk.nhs.nhsia.datastandards.ecds.PatientIdentity) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( file, type, options ); }
        
        public static uk.nhs.nhsia.datastandards.ecds.PatientIdentity parse(java.net.URL u) throws org.apache.xmlbeans.XmlException, java.io.IOException {
          return (uk.nhs.nhsia.datastandards.ecds.PatientIdentity) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( u, type, null ); }
        
        public static uk.nhs.nhsia.datastandards.ecds.PatientIdentity parse(java.net.URL u, org.apache.xmlbeans.XmlOptions options) throws org.apache.xmlbeans.XmlException, java.io.IOException {
          return (uk.nhs.nhsia.datastandards.ecds.PatientIdentity) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( u, type, options ); }
        
        public static uk.nhs.nhsia.datastandards.ecds.PatientIdentity parse(java.io.InputStream is) throws org.apache.xmlbeans.XmlException, java.io.IOException {
          return (uk.nhs.nhsia.datastandards.ecds.PatientIdentity) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( is, type, null ); }
        
        public static uk.nhs.nhsia.datastandards.ecds.PatientIdentity parse(java.io.InputStream is, org.apache.xmlbeans.XmlOptions options) throws org.apache.xmlbeans.XmlException, java.io.IOException {
          return (uk.nhs.nhsia.datastandards.ecds.PatientIdentity) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( is, type, options ); }
        
        public static uk.nhs.nhsia.datastandards.ecds.PatientIdentity parse(java.io.Reader r) throws org.apache.xmlbeans.XmlException, java.io.IOException {
          return (uk.nhs.nhsia.datastandards.ecds.PatientIdentity) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( r, type, null ); }
        
        public static uk.nhs.nhsia.datastandards.ecds.PatientIdentity parse(java.io.Reader r, org.apache.xmlbeans.XmlOptions options) throws org.apache.xmlbeans.XmlException, java.io.IOException {
          return (uk.nhs.nhsia.datastandards.ecds.PatientIdentity) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( r, type, options ); }
        
        public static uk.nhs.nhsia.datastandards.ecds.PatientIdentity parse(javax.xml.stream.XMLStreamReader sr) throws org.apache.xmlbeans.XmlException {
          return (uk.nhs.nhsia.datastandards.ecds.PatientIdentity) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( sr, type, null ); }
        
        public static uk.nhs.nhsia.datastandards.ecds.PatientIdentity parse(javax.xml.stream.XMLStreamReader sr, org.apache.xmlbeans.XmlOptions options) throws org.apache.xmlbeans.XmlException {
          return (uk.nhs.nhsia.datastandards.ecds.PatientIdentity) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( sr, type, options ); }
        
        public static uk.nhs.nhsia.datastandards.ecds.PatientIdentity parse(org.w3c.dom.Node node) throws org.apache.xmlbeans.XmlException {
          return (uk.nhs.nhsia.datastandards.ecds.PatientIdentity) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( node, type, null ); }
        
        public static uk.nhs.nhsia.datastandards.ecds.PatientIdentity parse(org.w3c.dom.Node node, org.apache.xmlbeans.XmlOptions options) throws org.apache.xmlbeans.XmlException {
          return (uk.nhs.nhsia.datastandards.ecds.PatientIdentity) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( node, type, options ); }
        
        /** @deprecated {@link org.apache.xmlbeans.xml.stream.XMLInputStream} */
        public static uk.nhs.nhsia.datastandards.ecds.PatientIdentity parse(org.apache.xmlbeans.xml.stream.XMLInputStream xis) throws org.apache.xmlbeans.XmlException, org.apache.xmlbeans.xml.stream.XMLStreamException {
          return (uk.nhs.nhsia.datastandards.ecds.PatientIdentity) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( xis, type, null ); }
        
        /** @deprecated {@link org.apache.xmlbeans.xml.stream.XMLInputStream} */
        public static uk.nhs.nhsia.datastandards.ecds.PatientIdentity parse(org.apache.xmlbeans.xml.stream.XMLInputStream xis, org.apache.xmlbeans.XmlOptions options) throws org.apache.xmlbeans.XmlException, org.apache.xmlbeans.xml.stream.XMLStreamException {
          return (uk.nhs.nhsia.datastandards.ecds.PatientIdentity) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( xis, type, options ); }
        
        /** @deprecated {@link org.apache.xmlbeans.xml.stream.XMLInputStream} */
        public static org.apache.xmlbeans.xml.stream.XMLInputStream newValidatingXMLInputStream(org.apache.xmlbeans.xml.stream.XMLInputStream xis) throws org.apache.xmlbeans.XmlException, org.apache.xmlbeans.xml.stream.XMLStreamException {
          return org.apache.xmlbeans.XmlBeans.getContextTypeLoader().newValidatingXMLInputStream( xis, type, null ); }
        
        /** @deprecated {@link org.apache.xmlbeans.xml.stream.XMLInputStream} */
        public static org.apache.xmlbeans.xml.stream.XMLInputStream newValidatingXMLInputStream(org.apache.xmlbeans.xml.stream.XMLInputStream xis, org.apache.xmlbeans.XmlOptions options) throws org.apache.xmlbeans.XmlException, org.apache.xmlbeans.xml.stream.XMLStreamException {
          return org.apache.xmlbeans.XmlBeans.getContextTypeLoader().newValidatingXMLInputStream( xis, type, options ); }
        
        private Factory() { } // No instance of this class allowed
    }
}
