/*
 * XML Type:  PersonIdentity_Mother_Structure
 * Namespace: http://www.nhsia.nhs.uk/DataStandards/XMLschema/CDS/ns
 * Java type: uk.nhs.nhsia.datastandards.ecds.PersonIdentityMotherStructure
 *
 * Automatically generated - do not modify.
 */
package uk.nhs.nhsia.datastandards.ecds.impl;
/**
 * An XML PersonIdentity_Mother_Structure(@http://www.nhsia.nhs.uk/DataStandards/XMLschema/CDS/ns).
 *
 * This is a complex type.
 */
public class PersonIdentityMotherStructureImpl extends org.apache.xmlbeans.impl.values.XmlComplexContentImpl implements uk.nhs.nhsia.datastandards.ecds.PersonIdentityMotherStructure
{
    private static final long serialVersionUID = 1L;
    
    public PersonIdentityMotherStructureImpl(org.apache.xmlbeans.SchemaType sType)
    {
        super(sType);
    }
    
    private static final javax.xml.namespace.QName WITHHELDIDENTITYSTRUCTUREMOTHER$0 = 
        new javax.xml.namespace.QName("http://www.nhsia.nhs.uk/DataStandards/XMLschema/CDS/ns", "WithheldIdentity_Structure_Mother");
    private static final javax.xml.namespace.QName VERIFIEDIDENTITYSTRUCTUREMOTHER$2 = 
        new javax.xml.namespace.QName("http://www.nhsia.nhs.uk/DataStandards/XMLschema/CDS/ns", "VerifiedIdentity_Structure_Mother");
    private static final javax.xml.namespace.QName UNVERIFIEDIDENTITYSTRUCTUREMOTHER$4 = 
        new javax.xml.namespace.QName("http://www.nhsia.nhs.uk/DataStandards/XMLschema/CDS/ns", "UnverifiedIdentity_Structure_Mother");
    
    
    /**
     * Gets the "WithheldIdentity_Structure_Mother" element
     */
    public uk.nhs.nhsia.datastandards.ecds.PersonIdentityMotherStructure.WithheldIdentityStructureMother getWithheldIdentityStructureMother()
    {
        synchronized (monitor())
        {
            check_orphaned();
            uk.nhs.nhsia.datastandards.ecds.PersonIdentityMotherStructure.WithheldIdentityStructureMother target = null;
            target = (uk.nhs.nhsia.datastandards.ecds.PersonIdentityMotherStructure.WithheldIdentityStructureMother)get_store().find_element_user(WITHHELDIDENTITYSTRUCTUREMOTHER$0, 0);
            if (target == null)
            {
                return null;
            }
            return target;
        }
    }
    
    /**
     * True if has "WithheldIdentity_Structure_Mother" element
     */
    public boolean isSetWithheldIdentityStructureMother()
    {
        synchronized (monitor())
        {
            check_orphaned();
            return get_store().count_elements(WITHHELDIDENTITYSTRUCTUREMOTHER$0) != 0;
        }
    }
    
    /**
     * Sets the "WithheldIdentity_Structure_Mother" element
     */
    public void setWithheldIdentityStructureMother(uk.nhs.nhsia.datastandards.ecds.PersonIdentityMotherStructure.WithheldIdentityStructureMother withheldIdentityStructureMother)
    {
        generatedSetterHelperImpl(withheldIdentityStructureMother, WITHHELDIDENTITYSTRUCTUREMOTHER$0, 0, org.apache.xmlbeans.impl.values.XmlObjectBase.KIND_SETTERHELPER_SINGLETON);
    }
    
    /**
     * Appends and returns a new empty "WithheldIdentity_Structure_Mother" element
     */
    public uk.nhs.nhsia.datastandards.ecds.PersonIdentityMotherStructure.WithheldIdentityStructureMother addNewWithheldIdentityStructureMother()
    {
        synchronized (monitor())
        {
            check_orphaned();
            uk.nhs.nhsia.datastandards.ecds.PersonIdentityMotherStructure.WithheldIdentityStructureMother target = null;
            target = (uk.nhs.nhsia.datastandards.ecds.PersonIdentityMotherStructure.WithheldIdentityStructureMother)get_store().add_element_user(WITHHELDIDENTITYSTRUCTUREMOTHER$0);
            return target;
        }
    }
    
    /**
     * Unsets the "WithheldIdentity_Structure_Mother" element
     */
    public void unsetWithheldIdentityStructureMother()
    {
        synchronized (monitor())
        {
            check_orphaned();
            get_store().remove_element(WITHHELDIDENTITYSTRUCTUREMOTHER$0, 0);
        }
    }
    
    /**
     * Gets the "VerifiedIdentity_Structure_Mother" element
     */
    public uk.nhs.nhsia.datastandards.ecds.PersonIdentityMotherStructure.VerifiedIdentityStructureMother getVerifiedIdentityStructureMother()
    {
        synchronized (monitor())
        {
            check_orphaned();
            uk.nhs.nhsia.datastandards.ecds.PersonIdentityMotherStructure.VerifiedIdentityStructureMother target = null;
            target = (uk.nhs.nhsia.datastandards.ecds.PersonIdentityMotherStructure.VerifiedIdentityStructureMother)get_store().find_element_user(VERIFIEDIDENTITYSTRUCTUREMOTHER$2, 0);
            if (target == null)
            {
                return null;
            }
            return target;
        }
    }
    
    /**
     * True if has "VerifiedIdentity_Structure_Mother" element
     */
    public boolean isSetVerifiedIdentityStructureMother()
    {
        synchronized (monitor())
        {
            check_orphaned();
            return get_store().count_elements(VERIFIEDIDENTITYSTRUCTUREMOTHER$2) != 0;
        }
    }
    
    /**
     * Sets the "VerifiedIdentity_Structure_Mother" element
     */
    public void setVerifiedIdentityStructureMother(uk.nhs.nhsia.datastandards.ecds.PersonIdentityMotherStructure.VerifiedIdentityStructureMother verifiedIdentityStructureMother)
    {
        generatedSetterHelperImpl(verifiedIdentityStructureMother, VERIFIEDIDENTITYSTRUCTUREMOTHER$2, 0, org.apache.xmlbeans.impl.values.XmlObjectBase.KIND_SETTERHELPER_SINGLETON);
    }
    
    /**
     * Appends and returns a new empty "VerifiedIdentity_Structure_Mother" element
     */
    public uk.nhs.nhsia.datastandards.ecds.PersonIdentityMotherStructure.VerifiedIdentityStructureMother addNewVerifiedIdentityStructureMother()
    {
        synchronized (monitor())
        {
            check_orphaned();
            uk.nhs.nhsia.datastandards.ecds.PersonIdentityMotherStructure.VerifiedIdentityStructureMother target = null;
            target = (uk.nhs.nhsia.datastandards.ecds.PersonIdentityMotherStructure.VerifiedIdentityStructureMother)get_store().add_element_user(VERIFIEDIDENTITYSTRUCTUREMOTHER$2);
            return target;
        }
    }
    
    /**
     * Unsets the "VerifiedIdentity_Structure_Mother" element
     */
    public void unsetVerifiedIdentityStructureMother()
    {
        synchronized (monitor())
        {
            check_orphaned();
            get_store().remove_element(VERIFIEDIDENTITYSTRUCTUREMOTHER$2, 0);
        }
    }
    
    /**
     * Gets the "UnverifiedIdentity_Structure_Mother" element
     */
    public uk.nhs.nhsia.datastandards.ecds.PersonIdentityMotherStructure.UnverifiedIdentityStructureMother getUnverifiedIdentityStructureMother()
    {
        synchronized (monitor())
        {
            check_orphaned();
            uk.nhs.nhsia.datastandards.ecds.PersonIdentityMotherStructure.UnverifiedIdentityStructureMother target = null;
            target = (uk.nhs.nhsia.datastandards.ecds.PersonIdentityMotherStructure.UnverifiedIdentityStructureMother)get_store().find_element_user(UNVERIFIEDIDENTITYSTRUCTUREMOTHER$4, 0);
            if (target == null)
            {
                return null;
            }
            return target;
        }
    }
    
    /**
     * True if has "UnverifiedIdentity_Structure_Mother" element
     */
    public boolean isSetUnverifiedIdentityStructureMother()
    {
        synchronized (monitor())
        {
            check_orphaned();
            return get_store().count_elements(UNVERIFIEDIDENTITYSTRUCTUREMOTHER$4) != 0;
        }
    }
    
    /**
     * Sets the "UnverifiedIdentity_Structure_Mother" element
     */
    public void setUnverifiedIdentityStructureMother(uk.nhs.nhsia.datastandards.ecds.PersonIdentityMotherStructure.UnverifiedIdentityStructureMother unverifiedIdentityStructureMother)
    {
        generatedSetterHelperImpl(unverifiedIdentityStructureMother, UNVERIFIEDIDENTITYSTRUCTUREMOTHER$4, 0, org.apache.xmlbeans.impl.values.XmlObjectBase.KIND_SETTERHELPER_SINGLETON);
    }
    
    /**
     * Appends and returns a new empty "UnverifiedIdentity_Structure_Mother" element
     */
    public uk.nhs.nhsia.datastandards.ecds.PersonIdentityMotherStructure.UnverifiedIdentityStructureMother addNewUnverifiedIdentityStructureMother()
    {
        synchronized (monitor())
        {
            check_orphaned();
            uk.nhs.nhsia.datastandards.ecds.PersonIdentityMotherStructure.UnverifiedIdentityStructureMother target = null;
            target = (uk.nhs.nhsia.datastandards.ecds.PersonIdentityMotherStructure.UnverifiedIdentityStructureMother)get_store().add_element_user(UNVERIFIEDIDENTITYSTRUCTUREMOTHER$4);
            return target;
        }
    }
    
    /**
     * Unsets the "UnverifiedIdentity_Structure_Mother" element
     */
    public void unsetUnverifiedIdentityStructureMother()
    {
        synchronized (monitor())
        {
            check_orphaned();
            get_store().remove_element(UNVERIFIEDIDENTITYSTRUCTUREMOTHER$4, 0);
        }
    }
    /**
     * An XML WithheldIdentity_Structure_Mother(@http://www.nhsia.nhs.uk/DataStandards/XMLschema/CDS/ns).
     *
     * This is a complex type.
     */
    public static class WithheldIdentityStructureMotherImpl extends org.apache.xmlbeans.impl.values.XmlComplexContentImpl implements uk.nhs.nhsia.datastandards.ecds.PersonIdentityMotherStructure.WithheldIdentityStructureMother
    {
        private static final long serialVersionUID = 1L;
        
        public WithheldIdentityStructureMotherImpl(org.apache.xmlbeans.SchemaType sType)
        {
            super(sType);
        }
        
        private static final javax.xml.namespace.QName NHSNUMBERSTATUSINDICATORCODEMOTHER$0 = 
            new javax.xml.namespace.QName("http://www.nhsia.nhs.uk/DataStandards/XMLschema/CDS/ns", "NHSNumberStatusIndicatorCode_Mother");
        private static final javax.xml.namespace.QName ORGANISATIONCODERESIDENCERESPONSIBILITY$2 = 
            new javax.xml.namespace.QName("http://www.nhsia.nhs.uk/DataStandards/XMLschema/CDS/ns", "OrganisationCode_ResidenceResponsibility");
        private static final javax.xml.namespace.QName WITHHELDIDENTITYREASON$4 = 
            new javax.xml.namespace.QName("http://www.nhsia.nhs.uk/DataStandards/XMLschema/CDS/ns", "WithheldIdentityReason");
        private static final javax.xml.namespace.QName NHSNUMBERSTATUSINDICATORCODEMOTHER2$6 = 
            new javax.xml.namespace.QName("", "NHSNumberStatusIndicatorCode_Mother");
        
        
        /**
         * Gets the "NHSNumberStatusIndicatorCode_Mother" element
         */
        public uk.nhs.nhsia.datastandards.ecds.NHSNumberStatusIndicatorCodeWithheldType.Enum getNHSNumberStatusIndicatorCodeMother()
        {
            synchronized (monitor())
            {
                check_orphaned();
                org.apache.xmlbeans.SimpleValue target = null;
                target = (org.apache.xmlbeans.SimpleValue)get_store().find_element_user(NHSNUMBERSTATUSINDICATORCODEMOTHER$0, 0);
                if (target == null)
                {
                    return null;
                }
                return (uk.nhs.nhsia.datastandards.ecds.NHSNumberStatusIndicatorCodeWithheldType.Enum)target.getEnumValue();
            }
        }
        
        /**
         * Gets (as xml) the "NHSNumberStatusIndicatorCode_Mother" element
         */
        public uk.nhs.nhsia.datastandards.ecds.NHSNumberStatusIndicatorCodeWithheldType xgetNHSNumberStatusIndicatorCodeMother()
        {
            synchronized (monitor())
            {
                check_orphaned();
                uk.nhs.nhsia.datastandards.ecds.NHSNumberStatusIndicatorCodeWithheldType target = null;
                target = (uk.nhs.nhsia.datastandards.ecds.NHSNumberStatusIndicatorCodeWithheldType)get_store().find_element_user(NHSNUMBERSTATUSINDICATORCODEMOTHER$0, 0);
                return target;
            }
        }
        
        /**
         * Sets the "NHSNumberStatusIndicatorCode_Mother" element
         */
        public void setNHSNumberStatusIndicatorCodeMother(uk.nhs.nhsia.datastandards.ecds.NHSNumberStatusIndicatorCodeWithheldType.Enum nhsNumberStatusIndicatorCodeMother)
        {
            synchronized (monitor())
            {
                check_orphaned();
                org.apache.xmlbeans.SimpleValue target = null;
                target = (org.apache.xmlbeans.SimpleValue)get_store().find_element_user(NHSNUMBERSTATUSINDICATORCODEMOTHER$0, 0);
                if (target == null)
                {
                    target = (org.apache.xmlbeans.SimpleValue)get_store().add_element_user(NHSNUMBERSTATUSINDICATORCODEMOTHER$0);
                }
                target.setEnumValue(nhsNumberStatusIndicatorCodeMother);
            }
        }
        
        /**
         * Sets (as xml) the "NHSNumberStatusIndicatorCode_Mother" element
         */
        public void xsetNHSNumberStatusIndicatorCodeMother(uk.nhs.nhsia.datastandards.ecds.NHSNumberStatusIndicatorCodeWithheldType nhsNumberStatusIndicatorCodeMother)
        {
            synchronized (monitor())
            {
                check_orphaned();
                uk.nhs.nhsia.datastandards.ecds.NHSNumberStatusIndicatorCodeWithheldType target = null;
                target = (uk.nhs.nhsia.datastandards.ecds.NHSNumberStatusIndicatorCodeWithheldType)get_store().find_element_user(NHSNUMBERSTATUSINDICATORCODEMOTHER$0, 0);
                if (target == null)
                {
                    target = (uk.nhs.nhsia.datastandards.ecds.NHSNumberStatusIndicatorCodeWithheldType)get_store().add_element_user(NHSNUMBERSTATUSINDICATORCODEMOTHER$0);
                }
                target.set(nhsNumberStatusIndicatorCodeMother);
            }
        }
        
        /**
         * Gets the "OrganisationCode_ResidenceResponsibility" element
         */
        public java.lang.String getOrganisationCodeResidenceResponsibility()
        {
            synchronized (monitor())
            {
                check_orphaned();
                org.apache.xmlbeans.SimpleValue target = null;
                target = (org.apache.xmlbeans.SimpleValue)get_store().find_element_user(ORGANISATIONCODERESIDENCERESPONSIBILITY$2, 0);
                if (target == null)
                {
                    return null;
                }
                return target.getStringValue();
            }
        }
        
        /**
         * Gets (as xml) the "OrganisationCode_ResidenceResponsibility" element
         */
        public uk.nhs.nhsia.datastandards.ecds.OrgCodeType xgetOrganisationCodeResidenceResponsibility()
        {
            synchronized (monitor())
            {
                check_orphaned();
                uk.nhs.nhsia.datastandards.ecds.OrgCodeType target = null;
                target = (uk.nhs.nhsia.datastandards.ecds.OrgCodeType)get_store().find_element_user(ORGANISATIONCODERESIDENCERESPONSIBILITY$2, 0);
                return target;
            }
        }
        
        /**
         * True if has "OrganisationCode_ResidenceResponsibility" element
         */
        public boolean isSetOrganisationCodeResidenceResponsibility()
        {
            synchronized (monitor())
            {
                check_orphaned();
                return get_store().count_elements(ORGANISATIONCODERESIDENCERESPONSIBILITY$2) != 0;
            }
        }
        
        /**
         * Sets the "OrganisationCode_ResidenceResponsibility" element
         */
        public void setOrganisationCodeResidenceResponsibility(java.lang.String organisationCodeResidenceResponsibility)
        {
            synchronized (monitor())
            {
                check_orphaned();
                org.apache.xmlbeans.SimpleValue target = null;
                target = (org.apache.xmlbeans.SimpleValue)get_store().find_element_user(ORGANISATIONCODERESIDENCERESPONSIBILITY$2, 0);
                if (target == null)
                {
                    target = (org.apache.xmlbeans.SimpleValue)get_store().add_element_user(ORGANISATIONCODERESIDENCERESPONSIBILITY$2);
                }
                target.setStringValue(organisationCodeResidenceResponsibility);
            }
        }
        
        /**
         * Sets (as xml) the "OrganisationCode_ResidenceResponsibility" element
         */
        public void xsetOrganisationCodeResidenceResponsibility(uk.nhs.nhsia.datastandards.ecds.OrgCodeType organisationCodeResidenceResponsibility)
        {
            synchronized (monitor())
            {
                check_orphaned();
                uk.nhs.nhsia.datastandards.ecds.OrgCodeType target = null;
                target = (uk.nhs.nhsia.datastandards.ecds.OrgCodeType)get_store().find_element_user(ORGANISATIONCODERESIDENCERESPONSIBILITY$2, 0);
                if (target == null)
                {
                    target = (uk.nhs.nhsia.datastandards.ecds.OrgCodeType)get_store().add_element_user(ORGANISATIONCODERESIDENCERESPONSIBILITY$2);
                }
                target.set(organisationCodeResidenceResponsibility);
            }
        }
        
        /**
         * Unsets the "OrganisationCode_ResidenceResponsibility" element
         */
        public void unsetOrganisationCodeResidenceResponsibility()
        {
            synchronized (monitor())
            {
                check_orphaned();
                get_store().remove_element(ORGANISATIONCODERESIDENCERESPONSIBILITY$2, 0);
            }
        }
        
        /**
         * Gets the "WithheldIdentityReason" element
         */
        public uk.nhs.nhsia.datastandards.ecds.WithheldIdentityReasonType.Enum getWithheldIdentityReason()
        {
            synchronized (monitor())
            {
                check_orphaned();
                org.apache.xmlbeans.SimpleValue target = null;
                target = (org.apache.xmlbeans.SimpleValue)get_store().find_element_user(WITHHELDIDENTITYREASON$4, 0);
                if (target == null)
                {
                    return null;
                }
                return (uk.nhs.nhsia.datastandards.ecds.WithheldIdentityReasonType.Enum)target.getEnumValue();
            }
        }
        
        /**
         * Gets (as xml) the "WithheldIdentityReason" element
         */
        public uk.nhs.nhsia.datastandards.ecds.WithheldIdentityReasonType xgetWithheldIdentityReason()
        {
            synchronized (monitor())
            {
                check_orphaned();
                uk.nhs.nhsia.datastandards.ecds.WithheldIdentityReasonType target = null;
                target = (uk.nhs.nhsia.datastandards.ecds.WithheldIdentityReasonType)get_store().find_element_user(WITHHELDIDENTITYREASON$4, 0);
                return target;
            }
        }
        
        /**
         * True if has "WithheldIdentityReason" element
         */
        public boolean isSetWithheldIdentityReason()
        {
            synchronized (monitor())
            {
                check_orphaned();
                return get_store().count_elements(WITHHELDIDENTITYREASON$4) != 0;
            }
        }
        
        /**
         * Sets the "WithheldIdentityReason" element
         */
        public void setWithheldIdentityReason(uk.nhs.nhsia.datastandards.ecds.WithheldIdentityReasonType.Enum withheldIdentityReason)
        {
            synchronized (monitor())
            {
                check_orphaned();
                org.apache.xmlbeans.SimpleValue target = null;
                target = (org.apache.xmlbeans.SimpleValue)get_store().find_element_user(WITHHELDIDENTITYREASON$4, 0);
                if (target == null)
                {
                    target = (org.apache.xmlbeans.SimpleValue)get_store().add_element_user(WITHHELDIDENTITYREASON$4);
                }
                target.setEnumValue(withheldIdentityReason);
            }
        }
        
        /**
         * Sets (as xml) the "WithheldIdentityReason" element
         */
        public void xsetWithheldIdentityReason(uk.nhs.nhsia.datastandards.ecds.WithheldIdentityReasonType withheldIdentityReason)
        {
            synchronized (monitor())
            {
                check_orphaned();
                uk.nhs.nhsia.datastandards.ecds.WithheldIdentityReasonType target = null;
                target = (uk.nhs.nhsia.datastandards.ecds.WithheldIdentityReasonType)get_store().find_element_user(WITHHELDIDENTITYREASON$4, 0);
                if (target == null)
                {
                    target = (uk.nhs.nhsia.datastandards.ecds.WithheldIdentityReasonType)get_store().add_element_user(WITHHELDIDENTITYREASON$4);
                }
                target.set(withheldIdentityReason);
            }
        }
        
        /**
         * Unsets the "WithheldIdentityReason" element
         */
        public void unsetWithheldIdentityReason()
        {
            synchronized (monitor())
            {
                check_orphaned();
                get_store().remove_element(WITHHELDIDENTITYREASON$4, 0);
            }
        }
        
        /**
         * Gets the "NHSNumberStatusIndicatorCode_Mother" attribute
         */
        public uk.nhs.nhsia.datastandards.ecds.NHSNumberStatusIndicatorCodeWithheldType.Enum getNHSNumberStatusIndicatorCodeMother2()
        {
            synchronized (monitor())
            {
                check_orphaned();
                org.apache.xmlbeans.SimpleValue target = null;
                target = (org.apache.xmlbeans.SimpleValue)get_store().find_attribute_user(NHSNUMBERSTATUSINDICATORCODEMOTHER2$6);
                if (target == null)
                {
                    return null;
                }
                return (uk.nhs.nhsia.datastandards.ecds.NHSNumberStatusIndicatorCodeWithheldType.Enum)target.getEnumValue();
            }
        }
        
        /**
         * Gets (as xml) the "NHSNumberStatusIndicatorCode_Mother" attribute
         */
        public uk.nhs.nhsia.datastandards.ecds.NHSNumberStatusIndicatorCodeWithheldType xgetNHSNumberStatusIndicatorCodeMother2()
        {
            synchronized (monitor())
            {
                check_orphaned();
                uk.nhs.nhsia.datastandards.ecds.NHSNumberStatusIndicatorCodeWithheldType target = null;
                target = (uk.nhs.nhsia.datastandards.ecds.NHSNumberStatusIndicatorCodeWithheldType)get_store().find_attribute_user(NHSNUMBERSTATUSINDICATORCODEMOTHER2$6);
                return target;
            }
        }
        
        /**
         * Sets the "NHSNumberStatusIndicatorCode_Mother" attribute
         */
        public void setNHSNumberStatusIndicatorCodeMother2(uk.nhs.nhsia.datastandards.ecds.NHSNumberStatusIndicatorCodeWithheldType.Enum nhsNumberStatusIndicatorCodeMother2)
        {
            synchronized (monitor())
            {
                check_orphaned();
                org.apache.xmlbeans.SimpleValue target = null;
                target = (org.apache.xmlbeans.SimpleValue)get_store().find_attribute_user(NHSNUMBERSTATUSINDICATORCODEMOTHER2$6);
                if (target == null)
                {
                    target = (org.apache.xmlbeans.SimpleValue)get_store().add_attribute_user(NHSNUMBERSTATUSINDICATORCODEMOTHER2$6);
                }
                target.setEnumValue(nhsNumberStatusIndicatorCodeMother2);
            }
        }
        
        /**
         * Sets (as xml) the "NHSNumberStatusIndicatorCode_Mother" attribute
         */
        public void xsetNHSNumberStatusIndicatorCodeMother2(uk.nhs.nhsia.datastandards.ecds.NHSNumberStatusIndicatorCodeWithheldType nhsNumberStatusIndicatorCodeMother2)
        {
            synchronized (monitor())
            {
                check_orphaned();
                uk.nhs.nhsia.datastandards.ecds.NHSNumberStatusIndicatorCodeWithheldType target = null;
                target = (uk.nhs.nhsia.datastandards.ecds.NHSNumberStatusIndicatorCodeWithheldType)get_store().find_attribute_user(NHSNUMBERSTATUSINDICATORCODEMOTHER2$6);
                if (target == null)
                {
                    target = (uk.nhs.nhsia.datastandards.ecds.NHSNumberStatusIndicatorCodeWithheldType)get_store().add_attribute_user(NHSNUMBERSTATUSINDICATORCODEMOTHER2$6);
                }
                target.set(nhsNumberStatusIndicatorCodeMother2);
            }
        }
    }
    /**
     * An XML VerifiedIdentity_Structure_Mother(@http://www.nhsia.nhs.uk/DataStandards/XMLschema/CDS/ns).
     *
     * This is a complex type.
     */
    public static class VerifiedIdentityStructureMotherImpl extends org.apache.xmlbeans.impl.values.XmlComplexContentImpl implements uk.nhs.nhsia.datastandards.ecds.PersonIdentityMotherStructure.VerifiedIdentityStructureMother
    {
        private static final long serialVersionUID = 1L;
        
        public VerifiedIdentityStructureMotherImpl(org.apache.xmlbeans.SchemaType sType)
        {
            super(sType);
        }
        
        private static final javax.xml.namespace.QName LOCALPATIENTIDENTIFIERMOTHER$0 = 
            new javax.xml.namespace.QName("http://www.nhsia.nhs.uk/DataStandards/XMLschema/CDS/ns", "LocalPatientIdentifier_Mother");
        private static final javax.xml.namespace.QName ORGANISATIONCODELOCALPATIENTIDENTIFIERMOTHER$2 = 
            new javax.xml.namespace.QName("http://www.nhsia.nhs.uk/DataStandards/XMLschema/CDS/ns", "OrganisationCode_LocalPatientIdentifier_Mother");
        private static final javax.xml.namespace.QName NHSNUMBERMOTHER$4 = 
            new javax.xml.namespace.QName("http://www.nhsia.nhs.uk/DataStandards/XMLschema/CDS/ns", "NHSNumber_Mother");
        private static final javax.xml.namespace.QName NHSNUMBERSTATUSINDICATORCODEMOTHER$6 = 
            new javax.xml.namespace.QName("http://www.nhsia.nhs.uk/DataStandards/XMLschema/CDS/ns", "NHSNumberStatusIndicatorCode_Mother");
        private static final javax.xml.namespace.QName POSTCODEOFUSUALADDRESSMOTHER$8 = 
            new javax.xml.namespace.QName("http://www.nhsia.nhs.uk/DataStandards/XMLschema/CDS/ns", "PostcodeOfUsualAddress_Mother");
        private static final javax.xml.namespace.QName ORGANISATIONCODERESIDENCERESPONSIBILITY$10 = 
            new javax.xml.namespace.QName("http://www.nhsia.nhs.uk/DataStandards/XMLschema/CDS/ns", "OrganisationCode_ResidenceResponsibility");
        private static final javax.xml.namespace.QName PERSONBIRTHDATEMOTHER$12 = 
            new javax.xml.namespace.QName("http://www.nhsia.nhs.uk/DataStandards/XMLschema/CDS/ns", "PersonBirthDate_Mother");
        private static final javax.xml.namespace.QName NHSNUMBERSTATUSINDICATORCODEMOTHER2$14 = 
            new javax.xml.namespace.QName("", "NHSNumberStatusIndicatorCode_Mother");
        
        
        /**
         * Gets the "LocalPatientIdentifier_Mother" element
         */
        public java.lang.String getLocalPatientIdentifierMother()
        {
            synchronized (monitor())
            {
                check_orphaned();
                org.apache.xmlbeans.SimpleValue target = null;
                target = (org.apache.xmlbeans.SimpleValue)get_store().find_element_user(LOCALPATIENTIDENTIFIERMOTHER$0, 0);
                if (target == null)
                {
                    return null;
                }
                return target.getStringValue();
            }
        }
        
        /**
         * Gets (as xml) the "LocalPatientIdentifier_Mother" element
         */
        public uk.nhs.nhsia.datastandards.ecds.LocalPatientIdentifierType xgetLocalPatientIdentifierMother()
        {
            synchronized (monitor())
            {
                check_orphaned();
                uk.nhs.nhsia.datastandards.ecds.LocalPatientIdentifierType target = null;
                target = (uk.nhs.nhsia.datastandards.ecds.LocalPatientIdentifierType)get_store().find_element_user(LOCALPATIENTIDENTIFIERMOTHER$0, 0);
                return target;
            }
        }
        
        /**
         * True if has "LocalPatientIdentifier_Mother" element
         */
        public boolean isSetLocalPatientIdentifierMother()
        {
            synchronized (monitor())
            {
                check_orphaned();
                return get_store().count_elements(LOCALPATIENTIDENTIFIERMOTHER$0) != 0;
            }
        }
        
        /**
         * Sets the "LocalPatientIdentifier_Mother" element
         */
        public void setLocalPatientIdentifierMother(java.lang.String localPatientIdentifierMother)
        {
            synchronized (monitor())
            {
                check_orphaned();
                org.apache.xmlbeans.SimpleValue target = null;
                target = (org.apache.xmlbeans.SimpleValue)get_store().find_element_user(LOCALPATIENTIDENTIFIERMOTHER$0, 0);
                if (target == null)
                {
                    target = (org.apache.xmlbeans.SimpleValue)get_store().add_element_user(LOCALPATIENTIDENTIFIERMOTHER$0);
                }
                target.setStringValue(localPatientIdentifierMother);
            }
        }
        
        /**
         * Sets (as xml) the "LocalPatientIdentifier_Mother" element
         */
        public void xsetLocalPatientIdentifierMother(uk.nhs.nhsia.datastandards.ecds.LocalPatientIdentifierType localPatientIdentifierMother)
        {
            synchronized (monitor())
            {
                check_orphaned();
                uk.nhs.nhsia.datastandards.ecds.LocalPatientIdentifierType target = null;
                target = (uk.nhs.nhsia.datastandards.ecds.LocalPatientIdentifierType)get_store().find_element_user(LOCALPATIENTIDENTIFIERMOTHER$0, 0);
                if (target == null)
                {
                    target = (uk.nhs.nhsia.datastandards.ecds.LocalPatientIdentifierType)get_store().add_element_user(LOCALPATIENTIDENTIFIERMOTHER$0);
                }
                target.set(localPatientIdentifierMother);
            }
        }
        
        /**
         * Unsets the "LocalPatientIdentifier_Mother" element
         */
        public void unsetLocalPatientIdentifierMother()
        {
            synchronized (monitor())
            {
                check_orphaned();
                get_store().remove_element(LOCALPATIENTIDENTIFIERMOTHER$0, 0);
            }
        }
        
        /**
         * Gets the "OrganisationCode_LocalPatientIdentifier_Mother" element
         */
        public java.lang.String getOrganisationCodeLocalPatientIdentifierMother()
        {
            synchronized (monitor())
            {
                check_orphaned();
                org.apache.xmlbeans.SimpleValue target = null;
                target = (org.apache.xmlbeans.SimpleValue)get_store().find_element_user(ORGANISATIONCODELOCALPATIENTIDENTIFIERMOTHER$2, 0);
                if (target == null)
                {
                    return null;
                }
                return target.getStringValue();
            }
        }
        
        /**
         * Gets (as xml) the "OrganisationCode_LocalPatientIdentifier_Mother" element
         */
        public uk.nhs.nhsia.datastandards.ecds.OrganisationCodeType xgetOrganisationCodeLocalPatientIdentifierMother()
        {
            synchronized (monitor())
            {
                check_orphaned();
                uk.nhs.nhsia.datastandards.ecds.OrganisationCodeType target = null;
                target = (uk.nhs.nhsia.datastandards.ecds.OrganisationCodeType)get_store().find_element_user(ORGANISATIONCODELOCALPATIENTIDENTIFIERMOTHER$2, 0);
                return target;
            }
        }
        
        /**
         * True if has "OrganisationCode_LocalPatientIdentifier_Mother" element
         */
        public boolean isSetOrganisationCodeLocalPatientIdentifierMother()
        {
            synchronized (monitor())
            {
                check_orphaned();
                return get_store().count_elements(ORGANISATIONCODELOCALPATIENTIDENTIFIERMOTHER$2) != 0;
            }
        }
        
        /**
         * Sets the "OrganisationCode_LocalPatientIdentifier_Mother" element
         */
        public void setOrganisationCodeLocalPatientIdentifierMother(java.lang.String organisationCodeLocalPatientIdentifierMother)
        {
            synchronized (monitor())
            {
                check_orphaned();
                org.apache.xmlbeans.SimpleValue target = null;
                target = (org.apache.xmlbeans.SimpleValue)get_store().find_element_user(ORGANISATIONCODELOCALPATIENTIDENTIFIERMOTHER$2, 0);
                if (target == null)
                {
                    target = (org.apache.xmlbeans.SimpleValue)get_store().add_element_user(ORGANISATIONCODELOCALPATIENTIDENTIFIERMOTHER$2);
                }
                target.setStringValue(organisationCodeLocalPatientIdentifierMother);
            }
        }
        
        /**
         * Sets (as xml) the "OrganisationCode_LocalPatientIdentifier_Mother" element
         */
        public void xsetOrganisationCodeLocalPatientIdentifierMother(uk.nhs.nhsia.datastandards.ecds.OrganisationCodeType organisationCodeLocalPatientIdentifierMother)
        {
            synchronized (monitor())
            {
                check_orphaned();
                uk.nhs.nhsia.datastandards.ecds.OrganisationCodeType target = null;
                target = (uk.nhs.nhsia.datastandards.ecds.OrganisationCodeType)get_store().find_element_user(ORGANISATIONCODELOCALPATIENTIDENTIFIERMOTHER$2, 0);
                if (target == null)
                {
                    target = (uk.nhs.nhsia.datastandards.ecds.OrganisationCodeType)get_store().add_element_user(ORGANISATIONCODELOCALPATIENTIDENTIFIERMOTHER$2);
                }
                target.set(organisationCodeLocalPatientIdentifierMother);
            }
        }
        
        /**
         * Unsets the "OrganisationCode_LocalPatientIdentifier_Mother" element
         */
        public void unsetOrganisationCodeLocalPatientIdentifierMother()
        {
            synchronized (monitor())
            {
                check_orphaned();
                get_store().remove_element(ORGANISATIONCODELOCALPATIENTIDENTIFIERMOTHER$2, 0);
            }
        }
        
        /**
         * Gets the "NHSNumber_Mother" element
         */
        public java.lang.String getNHSNumberMother()
        {
            synchronized (monitor())
            {
                check_orphaned();
                org.apache.xmlbeans.SimpleValue target = null;
                target = (org.apache.xmlbeans.SimpleValue)get_store().find_element_user(NHSNUMBERMOTHER$4, 0);
                if (target == null)
                {
                    return null;
                }
                return target.getStringValue();
            }
        }
        
        /**
         * Gets (as xml) the "NHSNumber_Mother" element
         */
        public uk.nhs.nhsia.datastandards.ecds.NHSNumberType xgetNHSNumberMother()
        {
            synchronized (monitor())
            {
                check_orphaned();
                uk.nhs.nhsia.datastandards.ecds.NHSNumberType target = null;
                target = (uk.nhs.nhsia.datastandards.ecds.NHSNumberType)get_store().find_element_user(NHSNUMBERMOTHER$4, 0);
                return target;
            }
        }
        
        /**
         * Sets the "NHSNumber_Mother" element
         */
        public void setNHSNumberMother(java.lang.String nhsNumberMother)
        {
            synchronized (monitor())
            {
                check_orphaned();
                org.apache.xmlbeans.SimpleValue target = null;
                target = (org.apache.xmlbeans.SimpleValue)get_store().find_element_user(NHSNUMBERMOTHER$4, 0);
                if (target == null)
                {
                    target = (org.apache.xmlbeans.SimpleValue)get_store().add_element_user(NHSNUMBERMOTHER$4);
                }
                target.setStringValue(nhsNumberMother);
            }
        }
        
        /**
         * Sets (as xml) the "NHSNumber_Mother" element
         */
        public void xsetNHSNumberMother(uk.nhs.nhsia.datastandards.ecds.NHSNumberType nhsNumberMother)
        {
            synchronized (monitor())
            {
                check_orphaned();
                uk.nhs.nhsia.datastandards.ecds.NHSNumberType target = null;
                target = (uk.nhs.nhsia.datastandards.ecds.NHSNumberType)get_store().find_element_user(NHSNUMBERMOTHER$4, 0);
                if (target == null)
                {
                    target = (uk.nhs.nhsia.datastandards.ecds.NHSNumberType)get_store().add_element_user(NHSNUMBERMOTHER$4);
                }
                target.set(nhsNumberMother);
            }
        }
        
        /**
         * Gets the "NHSNumberStatusIndicatorCode_Mother" element
         */
        public uk.nhs.nhsia.datastandards.ecds.NHSNumberStatusIndicatorCodeVerifiedType.Enum getNHSNumberStatusIndicatorCodeMother()
        {
            synchronized (monitor())
            {
                check_orphaned();
                org.apache.xmlbeans.SimpleValue target = null;
                target = (org.apache.xmlbeans.SimpleValue)get_store().find_element_user(NHSNUMBERSTATUSINDICATORCODEMOTHER$6, 0);
                if (target == null)
                {
                    return null;
                }
                return (uk.nhs.nhsia.datastandards.ecds.NHSNumberStatusIndicatorCodeVerifiedType.Enum)target.getEnumValue();
            }
        }
        
        /**
         * Gets (as xml) the "NHSNumberStatusIndicatorCode_Mother" element
         */
        public uk.nhs.nhsia.datastandards.ecds.NHSNumberStatusIndicatorCodeVerifiedType xgetNHSNumberStatusIndicatorCodeMother()
        {
            synchronized (monitor())
            {
                check_orphaned();
                uk.nhs.nhsia.datastandards.ecds.NHSNumberStatusIndicatorCodeVerifiedType target = null;
                target = (uk.nhs.nhsia.datastandards.ecds.NHSNumberStatusIndicatorCodeVerifiedType)get_store().find_element_user(NHSNUMBERSTATUSINDICATORCODEMOTHER$6, 0);
                return target;
            }
        }
        
        /**
         * Sets the "NHSNumberStatusIndicatorCode_Mother" element
         */
        public void setNHSNumberStatusIndicatorCodeMother(uk.nhs.nhsia.datastandards.ecds.NHSNumberStatusIndicatorCodeVerifiedType.Enum nhsNumberStatusIndicatorCodeMother)
        {
            synchronized (monitor())
            {
                check_orphaned();
                org.apache.xmlbeans.SimpleValue target = null;
                target = (org.apache.xmlbeans.SimpleValue)get_store().find_element_user(NHSNUMBERSTATUSINDICATORCODEMOTHER$6, 0);
                if (target == null)
                {
                    target = (org.apache.xmlbeans.SimpleValue)get_store().add_element_user(NHSNUMBERSTATUSINDICATORCODEMOTHER$6);
                }
                target.setEnumValue(nhsNumberStatusIndicatorCodeMother);
            }
        }
        
        /**
         * Sets (as xml) the "NHSNumberStatusIndicatorCode_Mother" element
         */
        public void xsetNHSNumberStatusIndicatorCodeMother(uk.nhs.nhsia.datastandards.ecds.NHSNumberStatusIndicatorCodeVerifiedType nhsNumberStatusIndicatorCodeMother)
        {
            synchronized (monitor())
            {
                check_orphaned();
                uk.nhs.nhsia.datastandards.ecds.NHSNumberStatusIndicatorCodeVerifiedType target = null;
                target = (uk.nhs.nhsia.datastandards.ecds.NHSNumberStatusIndicatorCodeVerifiedType)get_store().find_element_user(NHSNUMBERSTATUSINDICATORCODEMOTHER$6, 0);
                if (target == null)
                {
                    target = (uk.nhs.nhsia.datastandards.ecds.NHSNumberStatusIndicatorCodeVerifiedType)get_store().add_element_user(NHSNUMBERSTATUSINDICATORCODEMOTHER$6);
                }
                target.set(nhsNumberStatusIndicatorCodeMother);
            }
        }
        
        /**
         * Gets the "PostcodeOfUsualAddress_Mother" element
         */
        public java.lang.String getPostcodeOfUsualAddressMother()
        {
            synchronized (monitor())
            {
                check_orphaned();
                org.apache.xmlbeans.SimpleValue target = null;
                target = (org.apache.xmlbeans.SimpleValue)get_store().find_element_user(POSTCODEOFUSUALADDRESSMOTHER$8, 0);
                if (target == null)
                {
                    return null;
                }
                return target.getStringValue();
            }
        }
        
        /**
         * Gets (as xml) the "PostcodeOfUsualAddress_Mother" element
         */
        public uk.nhs.nhsia.datastandards.ecds.PostcodeOfUsualAddressType xgetPostcodeOfUsualAddressMother()
        {
            synchronized (monitor())
            {
                check_orphaned();
                uk.nhs.nhsia.datastandards.ecds.PostcodeOfUsualAddressType target = null;
                target = (uk.nhs.nhsia.datastandards.ecds.PostcodeOfUsualAddressType)get_store().find_element_user(POSTCODEOFUSUALADDRESSMOTHER$8, 0);
                return target;
            }
        }
        
        /**
         * Sets the "PostcodeOfUsualAddress_Mother" element
         */
        public void setPostcodeOfUsualAddressMother(java.lang.String postcodeOfUsualAddressMother)
        {
            synchronized (monitor())
            {
                check_orphaned();
                org.apache.xmlbeans.SimpleValue target = null;
                target = (org.apache.xmlbeans.SimpleValue)get_store().find_element_user(POSTCODEOFUSUALADDRESSMOTHER$8, 0);
                if (target == null)
                {
                    target = (org.apache.xmlbeans.SimpleValue)get_store().add_element_user(POSTCODEOFUSUALADDRESSMOTHER$8);
                }
                target.setStringValue(postcodeOfUsualAddressMother);
            }
        }
        
        /**
         * Sets (as xml) the "PostcodeOfUsualAddress_Mother" element
         */
        public void xsetPostcodeOfUsualAddressMother(uk.nhs.nhsia.datastandards.ecds.PostcodeOfUsualAddressType postcodeOfUsualAddressMother)
        {
            synchronized (monitor())
            {
                check_orphaned();
                uk.nhs.nhsia.datastandards.ecds.PostcodeOfUsualAddressType target = null;
                target = (uk.nhs.nhsia.datastandards.ecds.PostcodeOfUsualAddressType)get_store().find_element_user(POSTCODEOFUSUALADDRESSMOTHER$8, 0);
                if (target == null)
                {
                    target = (uk.nhs.nhsia.datastandards.ecds.PostcodeOfUsualAddressType)get_store().add_element_user(POSTCODEOFUSUALADDRESSMOTHER$8);
                }
                target.set(postcodeOfUsualAddressMother);
            }
        }
        
        /**
         * Gets the "OrganisationCode_ResidenceResponsibility" element
         */
        public java.lang.String getOrganisationCodeResidenceResponsibility()
        {
            synchronized (monitor())
            {
                check_orphaned();
                org.apache.xmlbeans.SimpleValue target = null;
                target = (org.apache.xmlbeans.SimpleValue)get_store().find_element_user(ORGANISATIONCODERESIDENCERESPONSIBILITY$10, 0);
                if (target == null)
                {
                    return null;
                }
                return target.getStringValue();
            }
        }
        
        /**
         * Gets (as xml) the "OrganisationCode_ResidenceResponsibility" element
         */
        public uk.nhs.nhsia.datastandards.ecds.OrgCodeType xgetOrganisationCodeResidenceResponsibility()
        {
            synchronized (monitor())
            {
                check_orphaned();
                uk.nhs.nhsia.datastandards.ecds.OrgCodeType target = null;
                target = (uk.nhs.nhsia.datastandards.ecds.OrgCodeType)get_store().find_element_user(ORGANISATIONCODERESIDENCERESPONSIBILITY$10, 0);
                return target;
            }
        }
        
        /**
         * True if has "OrganisationCode_ResidenceResponsibility" element
         */
        public boolean isSetOrganisationCodeResidenceResponsibility()
        {
            synchronized (monitor())
            {
                check_orphaned();
                return get_store().count_elements(ORGANISATIONCODERESIDENCERESPONSIBILITY$10) != 0;
            }
        }
        
        /**
         * Sets the "OrganisationCode_ResidenceResponsibility" element
         */
        public void setOrganisationCodeResidenceResponsibility(java.lang.String organisationCodeResidenceResponsibility)
        {
            synchronized (monitor())
            {
                check_orphaned();
                org.apache.xmlbeans.SimpleValue target = null;
                target = (org.apache.xmlbeans.SimpleValue)get_store().find_element_user(ORGANISATIONCODERESIDENCERESPONSIBILITY$10, 0);
                if (target == null)
                {
                    target = (org.apache.xmlbeans.SimpleValue)get_store().add_element_user(ORGANISATIONCODERESIDENCERESPONSIBILITY$10);
                }
                target.setStringValue(organisationCodeResidenceResponsibility);
            }
        }
        
        /**
         * Sets (as xml) the "OrganisationCode_ResidenceResponsibility" element
         */
        public void xsetOrganisationCodeResidenceResponsibility(uk.nhs.nhsia.datastandards.ecds.OrgCodeType organisationCodeResidenceResponsibility)
        {
            synchronized (monitor())
            {
                check_orphaned();
                uk.nhs.nhsia.datastandards.ecds.OrgCodeType target = null;
                target = (uk.nhs.nhsia.datastandards.ecds.OrgCodeType)get_store().find_element_user(ORGANISATIONCODERESIDENCERESPONSIBILITY$10, 0);
                if (target == null)
                {
                    target = (uk.nhs.nhsia.datastandards.ecds.OrgCodeType)get_store().add_element_user(ORGANISATIONCODERESIDENCERESPONSIBILITY$10);
                }
                target.set(organisationCodeResidenceResponsibility);
            }
        }
        
        /**
         * Unsets the "OrganisationCode_ResidenceResponsibility" element
         */
        public void unsetOrganisationCodeResidenceResponsibility()
        {
            synchronized (monitor())
            {
                check_orphaned();
                get_store().remove_element(ORGANISATIONCODERESIDENCERESPONSIBILITY$10, 0);
            }
        }
        
        /**
         * Gets the "PersonBirthDate_Mother" element
         */
        public java.util.Calendar getPersonBirthDateMother()
        {
            synchronized (monitor())
            {
                check_orphaned();
                org.apache.xmlbeans.SimpleValue target = null;
                target = (org.apache.xmlbeans.SimpleValue)get_store().find_element_user(PERSONBIRTHDATEMOTHER$12, 0);
                if (target == null)
                {
                    return null;
                }
                return target.getCalendarValue();
            }
        }
        
        /**
         * Gets (as xml) the "PersonBirthDate_Mother" element
         */
        public uk.nhs.nhsia.datastandards.ecds.PersonBirthDateType xgetPersonBirthDateMother()
        {
            synchronized (monitor())
            {
                check_orphaned();
                uk.nhs.nhsia.datastandards.ecds.PersonBirthDateType target = null;
                target = (uk.nhs.nhsia.datastandards.ecds.PersonBirthDateType)get_store().find_element_user(PERSONBIRTHDATEMOTHER$12, 0);
                return target;
            }
        }
        
        /**
         * True if has "PersonBirthDate_Mother" element
         */
        public boolean isSetPersonBirthDateMother()
        {
            synchronized (monitor())
            {
                check_orphaned();
                return get_store().count_elements(PERSONBIRTHDATEMOTHER$12) != 0;
            }
        }
        
        /**
         * Sets the "PersonBirthDate_Mother" element
         */
        public void setPersonBirthDateMother(java.util.Calendar personBirthDateMother)
        {
            synchronized (monitor())
            {
                check_orphaned();
                org.apache.xmlbeans.SimpleValue target = null;
                target = (org.apache.xmlbeans.SimpleValue)get_store().find_element_user(PERSONBIRTHDATEMOTHER$12, 0);
                if (target == null)
                {
                    target = (org.apache.xmlbeans.SimpleValue)get_store().add_element_user(PERSONBIRTHDATEMOTHER$12);
                }
                target.setCalendarValue(personBirthDateMother);
            }
        }
        
        /**
         * Sets (as xml) the "PersonBirthDate_Mother" element
         */
        public void xsetPersonBirthDateMother(uk.nhs.nhsia.datastandards.ecds.PersonBirthDateType personBirthDateMother)
        {
            synchronized (monitor())
            {
                check_orphaned();
                uk.nhs.nhsia.datastandards.ecds.PersonBirthDateType target = null;
                target = (uk.nhs.nhsia.datastandards.ecds.PersonBirthDateType)get_store().find_element_user(PERSONBIRTHDATEMOTHER$12, 0);
                if (target == null)
                {
                    target = (uk.nhs.nhsia.datastandards.ecds.PersonBirthDateType)get_store().add_element_user(PERSONBIRTHDATEMOTHER$12);
                }
                target.set(personBirthDateMother);
            }
        }
        
        /**
         * Unsets the "PersonBirthDate_Mother" element
         */
        public void unsetPersonBirthDateMother()
        {
            synchronized (monitor())
            {
                check_orphaned();
                get_store().remove_element(PERSONBIRTHDATEMOTHER$12, 0);
            }
        }
        
        /**
         * Gets the "NHSNumberStatusIndicatorCode_Mother" attribute
         */
        public uk.nhs.nhsia.datastandards.ecds.NHSNumberStatusIndicatorCodeVerifiedType.Enum getNHSNumberStatusIndicatorCodeMother2()
        {
            synchronized (monitor())
            {
                check_orphaned();
                org.apache.xmlbeans.SimpleValue target = null;
                target = (org.apache.xmlbeans.SimpleValue)get_store().find_attribute_user(NHSNUMBERSTATUSINDICATORCODEMOTHER2$14);
                if (target == null)
                {
                    return null;
                }
                return (uk.nhs.nhsia.datastandards.ecds.NHSNumberStatusIndicatorCodeVerifiedType.Enum)target.getEnumValue();
            }
        }
        
        /**
         * Gets (as xml) the "NHSNumberStatusIndicatorCode_Mother" attribute
         */
        public uk.nhs.nhsia.datastandards.ecds.NHSNumberStatusIndicatorCodeVerifiedType xgetNHSNumberStatusIndicatorCodeMother2()
        {
            synchronized (monitor())
            {
                check_orphaned();
                uk.nhs.nhsia.datastandards.ecds.NHSNumberStatusIndicatorCodeVerifiedType target = null;
                target = (uk.nhs.nhsia.datastandards.ecds.NHSNumberStatusIndicatorCodeVerifiedType)get_store().find_attribute_user(NHSNUMBERSTATUSINDICATORCODEMOTHER2$14);
                return target;
            }
        }
        
        /**
         * Sets the "NHSNumberStatusIndicatorCode_Mother" attribute
         */
        public void setNHSNumberStatusIndicatorCodeMother2(uk.nhs.nhsia.datastandards.ecds.NHSNumberStatusIndicatorCodeVerifiedType.Enum nhsNumberStatusIndicatorCodeMother2)
        {
            synchronized (monitor())
            {
                check_orphaned();
                org.apache.xmlbeans.SimpleValue target = null;
                target = (org.apache.xmlbeans.SimpleValue)get_store().find_attribute_user(NHSNUMBERSTATUSINDICATORCODEMOTHER2$14);
                if (target == null)
                {
                    target = (org.apache.xmlbeans.SimpleValue)get_store().add_attribute_user(NHSNUMBERSTATUSINDICATORCODEMOTHER2$14);
                }
                target.setEnumValue(nhsNumberStatusIndicatorCodeMother2);
            }
        }
        
        /**
         * Sets (as xml) the "NHSNumberStatusIndicatorCode_Mother" attribute
         */
        public void xsetNHSNumberStatusIndicatorCodeMother2(uk.nhs.nhsia.datastandards.ecds.NHSNumberStatusIndicatorCodeVerifiedType nhsNumberStatusIndicatorCodeMother2)
        {
            synchronized (monitor())
            {
                check_orphaned();
                uk.nhs.nhsia.datastandards.ecds.NHSNumberStatusIndicatorCodeVerifiedType target = null;
                target = (uk.nhs.nhsia.datastandards.ecds.NHSNumberStatusIndicatorCodeVerifiedType)get_store().find_attribute_user(NHSNUMBERSTATUSINDICATORCODEMOTHER2$14);
                if (target == null)
                {
                    target = (uk.nhs.nhsia.datastandards.ecds.NHSNumberStatusIndicatorCodeVerifiedType)get_store().add_attribute_user(NHSNUMBERSTATUSINDICATORCODEMOTHER2$14);
                }
                target.set(nhsNumberStatusIndicatorCodeMother2);
            }
        }
    }
    /**
     * An XML UnverifiedIdentity_Structure_Mother(@http://www.nhsia.nhs.uk/DataStandards/XMLschema/CDS/ns).
     *
     * This is a complex type.
     */
    public static class UnverifiedIdentityStructureMotherImpl extends org.apache.xmlbeans.impl.values.XmlComplexContentImpl implements uk.nhs.nhsia.datastandards.ecds.PersonIdentityMotherStructure.UnverifiedIdentityStructureMother
    {
        private static final long serialVersionUID = 1L;
        
        public UnverifiedIdentityStructureMotherImpl(org.apache.xmlbeans.SchemaType sType)
        {
            super(sType);
        }
        
        private static final javax.xml.namespace.QName LOCALPATIENTIDENTIFIERMOTHER$0 = 
            new javax.xml.namespace.QName("http://www.nhsia.nhs.uk/DataStandards/XMLschema/CDS/ns", "LocalPatientIdentifier_Mother");
        private static final javax.xml.namespace.QName ORGANISATIONCODELOCALPATIENTIDENTIFIERMOTHER$2 = 
            new javax.xml.namespace.QName("http://www.nhsia.nhs.uk/DataStandards/XMLschema/CDS/ns", "OrganisationCode_LocalPatientIdentifier_Mother");
        private static final javax.xml.namespace.QName NHSNUMBERMOTHER$4 = 
            new javax.xml.namespace.QName("http://www.nhsia.nhs.uk/DataStandards/XMLschema/CDS/ns", "NHSNumber_Mother");
        private static final javax.xml.namespace.QName NHSNUMBERSTATUSINDICATORCODEMOTHER$6 = 
            new javax.xml.namespace.QName("http://www.nhsia.nhs.uk/DataStandards/XMLschema/CDS/ns", "NHSNumberStatusIndicatorCode_Mother");
        private static final javax.xml.namespace.QName PATIENTUSUALADDRESSMOTHER$8 = 
            new javax.xml.namespace.QName("http://www.nhsia.nhs.uk/DataStandards/XMLschema/CDS/ns", "PatientUsualAddress_Mother");
        private static final javax.xml.namespace.QName POSTCODEOFUSUALADDRESSMOTHER$10 = 
            new javax.xml.namespace.QName("http://www.nhsia.nhs.uk/DataStandards/XMLschema/CDS/ns", "PostcodeOfUsualAddress_Mother");
        private static final javax.xml.namespace.QName ORGANISATIONCODERESIDENCERESPONSIBILITY$12 = 
            new javax.xml.namespace.QName("http://www.nhsia.nhs.uk/DataStandards/XMLschema/CDS/ns", "OrganisationCode_ResidenceResponsibility");
        private static final javax.xml.namespace.QName PERSONBIRTHDATEMOTHER$14 = 
            new javax.xml.namespace.QName("http://www.nhsia.nhs.uk/DataStandards/XMLschema/CDS/ns", "PersonBirthDate_Mother");
        private static final javax.xml.namespace.QName NHSNUMBERSTATUSINDICATORCODEMOTHER2$16 = 
            new javax.xml.namespace.QName("", "NHSNumberStatusIndicatorCode_Mother");
        
        
        /**
         * Gets the "LocalPatientIdentifier_Mother" element
         */
        public java.lang.String getLocalPatientIdentifierMother()
        {
            synchronized (monitor())
            {
                check_orphaned();
                org.apache.xmlbeans.SimpleValue target = null;
                target = (org.apache.xmlbeans.SimpleValue)get_store().find_element_user(LOCALPATIENTIDENTIFIERMOTHER$0, 0);
                if (target == null)
                {
                    return null;
                }
                return target.getStringValue();
            }
        }
        
        /**
         * Gets (as xml) the "LocalPatientIdentifier_Mother" element
         */
        public uk.nhs.nhsia.datastandards.ecds.LocalPatientIdentifierType xgetLocalPatientIdentifierMother()
        {
            synchronized (monitor())
            {
                check_orphaned();
                uk.nhs.nhsia.datastandards.ecds.LocalPatientIdentifierType target = null;
                target = (uk.nhs.nhsia.datastandards.ecds.LocalPatientIdentifierType)get_store().find_element_user(LOCALPATIENTIDENTIFIERMOTHER$0, 0);
                return target;
            }
        }
        
        /**
         * True if has "LocalPatientIdentifier_Mother" element
         */
        public boolean isSetLocalPatientIdentifierMother()
        {
            synchronized (monitor())
            {
                check_orphaned();
                return get_store().count_elements(LOCALPATIENTIDENTIFIERMOTHER$0) != 0;
            }
        }
        
        /**
         * Sets the "LocalPatientIdentifier_Mother" element
         */
        public void setLocalPatientIdentifierMother(java.lang.String localPatientIdentifierMother)
        {
            synchronized (monitor())
            {
                check_orphaned();
                org.apache.xmlbeans.SimpleValue target = null;
                target = (org.apache.xmlbeans.SimpleValue)get_store().find_element_user(LOCALPATIENTIDENTIFIERMOTHER$0, 0);
                if (target == null)
                {
                    target = (org.apache.xmlbeans.SimpleValue)get_store().add_element_user(LOCALPATIENTIDENTIFIERMOTHER$0);
                }
                target.setStringValue(localPatientIdentifierMother);
            }
        }
        
        /**
         * Sets (as xml) the "LocalPatientIdentifier_Mother" element
         */
        public void xsetLocalPatientIdentifierMother(uk.nhs.nhsia.datastandards.ecds.LocalPatientIdentifierType localPatientIdentifierMother)
        {
            synchronized (monitor())
            {
                check_orphaned();
                uk.nhs.nhsia.datastandards.ecds.LocalPatientIdentifierType target = null;
                target = (uk.nhs.nhsia.datastandards.ecds.LocalPatientIdentifierType)get_store().find_element_user(LOCALPATIENTIDENTIFIERMOTHER$0, 0);
                if (target == null)
                {
                    target = (uk.nhs.nhsia.datastandards.ecds.LocalPatientIdentifierType)get_store().add_element_user(LOCALPATIENTIDENTIFIERMOTHER$0);
                }
                target.set(localPatientIdentifierMother);
            }
        }
        
        /**
         * Unsets the "LocalPatientIdentifier_Mother" element
         */
        public void unsetLocalPatientIdentifierMother()
        {
            synchronized (monitor())
            {
                check_orphaned();
                get_store().remove_element(LOCALPATIENTIDENTIFIERMOTHER$0, 0);
            }
        }
        
        /**
         * Gets the "OrganisationCode_LocalPatientIdentifier_Mother" element
         */
        public java.lang.String getOrganisationCodeLocalPatientIdentifierMother()
        {
            synchronized (monitor())
            {
                check_orphaned();
                org.apache.xmlbeans.SimpleValue target = null;
                target = (org.apache.xmlbeans.SimpleValue)get_store().find_element_user(ORGANISATIONCODELOCALPATIENTIDENTIFIERMOTHER$2, 0);
                if (target == null)
                {
                    return null;
                }
                return target.getStringValue();
            }
        }
        
        /**
         * Gets (as xml) the "OrganisationCode_LocalPatientIdentifier_Mother" element
         */
        public uk.nhs.nhsia.datastandards.ecds.OrganisationCodeType xgetOrganisationCodeLocalPatientIdentifierMother()
        {
            synchronized (monitor())
            {
                check_orphaned();
                uk.nhs.nhsia.datastandards.ecds.OrganisationCodeType target = null;
                target = (uk.nhs.nhsia.datastandards.ecds.OrganisationCodeType)get_store().find_element_user(ORGANISATIONCODELOCALPATIENTIDENTIFIERMOTHER$2, 0);
                return target;
            }
        }
        
        /**
         * True if has "OrganisationCode_LocalPatientIdentifier_Mother" element
         */
        public boolean isSetOrganisationCodeLocalPatientIdentifierMother()
        {
            synchronized (monitor())
            {
                check_orphaned();
                return get_store().count_elements(ORGANISATIONCODELOCALPATIENTIDENTIFIERMOTHER$2) != 0;
            }
        }
        
        /**
         * Sets the "OrganisationCode_LocalPatientIdentifier_Mother" element
         */
        public void setOrganisationCodeLocalPatientIdentifierMother(java.lang.String organisationCodeLocalPatientIdentifierMother)
        {
            synchronized (monitor())
            {
                check_orphaned();
                org.apache.xmlbeans.SimpleValue target = null;
                target = (org.apache.xmlbeans.SimpleValue)get_store().find_element_user(ORGANISATIONCODELOCALPATIENTIDENTIFIERMOTHER$2, 0);
                if (target == null)
                {
                    target = (org.apache.xmlbeans.SimpleValue)get_store().add_element_user(ORGANISATIONCODELOCALPATIENTIDENTIFIERMOTHER$2);
                }
                target.setStringValue(organisationCodeLocalPatientIdentifierMother);
            }
        }
        
        /**
         * Sets (as xml) the "OrganisationCode_LocalPatientIdentifier_Mother" element
         */
        public void xsetOrganisationCodeLocalPatientIdentifierMother(uk.nhs.nhsia.datastandards.ecds.OrganisationCodeType organisationCodeLocalPatientIdentifierMother)
        {
            synchronized (monitor())
            {
                check_orphaned();
                uk.nhs.nhsia.datastandards.ecds.OrganisationCodeType target = null;
                target = (uk.nhs.nhsia.datastandards.ecds.OrganisationCodeType)get_store().find_element_user(ORGANISATIONCODELOCALPATIENTIDENTIFIERMOTHER$2, 0);
                if (target == null)
                {
                    target = (uk.nhs.nhsia.datastandards.ecds.OrganisationCodeType)get_store().add_element_user(ORGANISATIONCODELOCALPATIENTIDENTIFIERMOTHER$2);
                }
                target.set(organisationCodeLocalPatientIdentifierMother);
            }
        }
        
        /**
         * Unsets the "OrganisationCode_LocalPatientIdentifier_Mother" element
         */
        public void unsetOrganisationCodeLocalPatientIdentifierMother()
        {
            synchronized (monitor())
            {
                check_orphaned();
                get_store().remove_element(ORGANISATIONCODELOCALPATIENTIDENTIFIERMOTHER$2, 0);
            }
        }
        
        /**
         * Gets the "NHSNumber_Mother" element
         */
        public java.lang.String getNHSNumberMother()
        {
            synchronized (monitor())
            {
                check_orphaned();
                org.apache.xmlbeans.SimpleValue target = null;
                target = (org.apache.xmlbeans.SimpleValue)get_store().find_element_user(NHSNUMBERMOTHER$4, 0);
                if (target == null)
                {
                    return null;
                }
                return target.getStringValue();
            }
        }
        
        /**
         * Gets (as xml) the "NHSNumber_Mother" element
         */
        public uk.nhs.nhsia.datastandards.ecds.NHSNumberType xgetNHSNumberMother()
        {
            synchronized (monitor())
            {
                check_orphaned();
                uk.nhs.nhsia.datastandards.ecds.NHSNumberType target = null;
                target = (uk.nhs.nhsia.datastandards.ecds.NHSNumberType)get_store().find_element_user(NHSNUMBERMOTHER$4, 0);
                return target;
            }
        }
        
        /**
         * True if has "NHSNumber_Mother" element
         */
        public boolean isSetNHSNumberMother()
        {
            synchronized (monitor())
            {
                check_orphaned();
                return get_store().count_elements(NHSNUMBERMOTHER$4) != 0;
            }
        }
        
        /**
         * Sets the "NHSNumber_Mother" element
         */
        public void setNHSNumberMother(java.lang.String nhsNumberMother)
        {
            synchronized (monitor())
            {
                check_orphaned();
                org.apache.xmlbeans.SimpleValue target = null;
                target = (org.apache.xmlbeans.SimpleValue)get_store().find_element_user(NHSNUMBERMOTHER$4, 0);
                if (target == null)
                {
                    target = (org.apache.xmlbeans.SimpleValue)get_store().add_element_user(NHSNUMBERMOTHER$4);
                }
                target.setStringValue(nhsNumberMother);
            }
        }
        
        /**
         * Sets (as xml) the "NHSNumber_Mother" element
         */
        public void xsetNHSNumberMother(uk.nhs.nhsia.datastandards.ecds.NHSNumberType nhsNumberMother)
        {
            synchronized (monitor())
            {
                check_orphaned();
                uk.nhs.nhsia.datastandards.ecds.NHSNumberType target = null;
                target = (uk.nhs.nhsia.datastandards.ecds.NHSNumberType)get_store().find_element_user(NHSNUMBERMOTHER$4, 0);
                if (target == null)
                {
                    target = (uk.nhs.nhsia.datastandards.ecds.NHSNumberType)get_store().add_element_user(NHSNUMBERMOTHER$4);
                }
                target.set(nhsNumberMother);
            }
        }
        
        /**
         * Unsets the "NHSNumber_Mother" element
         */
        public void unsetNHSNumberMother()
        {
            synchronized (monitor())
            {
                check_orphaned();
                get_store().remove_element(NHSNUMBERMOTHER$4, 0);
            }
        }
        
        /**
         * Gets the "NHSNumberStatusIndicatorCode_Mother" element
         */
        public uk.nhs.nhsia.datastandards.ecds.NHSNumberStatusIndicatorCodeUnverifiedType.Enum getNHSNumberStatusIndicatorCodeMother()
        {
            synchronized (monitor())
            {
                check_orphaned();
                org.apache.xmlbeans.SimpleValue target = null;
                target = (org.apache.xmlbeans.SimpleValue)get_store().find_element_user(NHSNUMBERSTATUSINDICATORCODEMOTHER$6, 0);
                if (target == null)
                {
                    return null;
                }
                return (uk.nhs.nhsia.datastandards.ecds.NHSNumberStatusIndicatorCodeUnverifiedType.Enum)target.getEnumValue();
            }
        }
        
        /**
         * Gets (as xml) the "NHSNumberStatusIndicatorCode_Mother" element
         */
        public uk.nhs.nhsia.datastandards.ecds.NHSNumberStatusIndicatorCodeUnverifiedType xgetNHSNumberStatusIndicatorCodeMother()
        {
            synchronized (monitor())
            {
                check_orphaned();
                uk.nhs.nhsia.datastandards.ecds.NHSNumberStatusIndicatorCodeUnverifiedType target = null;
                target = (uk.nhs.nhsia.datastandards.ecds.NHSNumberStatusIndicatorCodeUnverifiedType)get_store().find_element_user(NHSNUMBERSTATUSINDICATORCODEMOTHER$6, 0);
                return target;
            }
        }
        
        /**
         * Sets the "NHSNumberStatusIndicatorCode_Mother" element
         */
        public void setNHSNumberStatusIndicatorCodeMother(uk.nhs.nhsia.datastandards.ecds.NHSNumberStatusIndicatorCodeUnverifiedType.Enum nhsNumberStatusIndicatorCodeMother)
        {
            synchronized (monitor())
            {
                check_orphaned();
                org.apache.xmlbeans.SimpleValue target = null;
                target = (org.apache.xmlbeans.SimpleValue)get_store().find_element_user(NHSNUMBERSTATUSINDICATORCODEMOTHER$6, 0);
                if (target == null)
                {
                    target = (org.apache.xmlbeans.SimpleValue)get_store().add_element_user(NHSNUMBERSTATUSINDICATORCODEMOTHER$6);
                }
                target.setEnumValue(nhsNumberStatusIndicatorCodeMother);
            }
        }
        
        /**
         * Sets (as xml) the "NHSNumberStatusIndicatorCode_Mother" element
         */
        public void xsetNHSNumberStatusIndicatorCodeMother(uk.nhs.nhsia.datastandards.ecds.NHSNumberStatusIndicatorCodeUnverifiedType nhsNumberStatusIndicatorCodeMother)
        {
            synchronized (monitor())
            {
                check_orphaned();
                uk.nhs.nhsia.datastandards.ecds.NHSNumberStatusIndicatorCodeUnverifiedType target = null;
                target = (uk.nhs.nhsia.datastandards.ecds.NHSNumberStatusIndicatorCodeUnverifiedType)get_store().find_element_user(NHSNUMBERSTATUSINDICATORCODEMOTHER$6, 0);
                if (target == null)
                {
                    target = (uk.nhs.nhsia.datastandards.ecds.NHSNumberStatusIndicatorCodeUnverifiedType)get_store().add_element_user(NHSNUMBERSTATUSINDICATORCODEMOTHER$6);
                }
                target.set(nhsNumberStatusIndicatorCodeMother);
            }
        }
        
        /**
         * Gets the "PatientUsualAddress_Mother" element
         */
        public uk.nhs.nhsia.datastandards.ecds.AddressStructure getPatientUsualAddressMother()
        {
            synchronized (monitor())
            {
                check_orphaned();
                uk.nhs.nhsia.datastandards.ecds.AddressStructure target = null;
                target = (uk.nhs.nhsia.datastandards.ecds.AddressStructure)get_store().find_element_user(PATIENTUSUALADDRESSMOTHER$8, 0);
                if (target == null)
                {
                    return null;
                }
                return target;
            }
        }
        
        /**
         * True if has "PatientUsualAddress_Mother" element
         */
        public boolean isSetPatientUsualAddressMother()
        {
            synchronized (monitor())
            {
                check_orphaned();
                return get_store().count_elements(PATIENTUSUALADDRESSMOTHER$8) != 0;
            }
        }
        
        /**
         * Sets the "PatientUsualAddress_Mother" element
         */
        public void setPatientUsualAddressMother(uk.nhs.nhsia.datastandards.ecds.AddressStructure patientUsualAddressMother)
        {
            generatedSetterHelperImpl(patientUsualAddressMother, PATIENTUSUALADDRESSMOTHER$8, 0, org.apache.xmlbeans.impl.values.XmlObjectBase.KIND_SETTERHELPER_SINGLETON);
        }
        
        /**
         * Appends and returns a new empty "PatientUsualAddress_Mother" element
         */
        public uk.nhs.nhsia.datastandards.ecds.AddressStructure addNewPatientUsualAddressMother()
        {
            synchronized (monitor())
            {
                check_orphaned();
                uk.nhs.nhsia.datastandards.ecds.AddressStructure target = null;
                target = (uk.nhs.nhsia.datastandards.ecds.AddressStructure)get_store().add_element_user(PATIENTUSUALADDRESSMOTHER$8);
                return target;
            }
        }
        
        /**
         * Unsets the "PatientUsualAddress_Mother" element
         */
        public void unsetPatientUsualAddressMother()
        {
            synchronized (monitor())
            {
                check_orphaned();
                get_store().remove_element(PATIENTUSUALADDRESSMOTHER$8, 0);
            }
        }
        
        /**
         * Gets the "PostcodeOfUsualAddress_Mother" element
         */
        public java.lang.String getPostcodeOfUsualAddressMother()
        {
            synchronized (monitor())
            {
                check_orphaned();
                org.apache.xmlbeans.SimpleValue target = null;
                target = (org.apache.xmlbeans.SimpleValue)get_store().find_element_user(POSTCODEOFUSUALADDRESSMOTHER$10, 0);
                if (target == null)
                {
                    return null;
                }
                return target.getStringValue();
            }
        }
        
        /**
         * Gets (as xml) the "PostcodeOfUsualAddress_Mother" element
         */
        public uk.nhs.nhsia.datastandards.ecds.PostcodeOfUsualAddressType xgetPostcodeOfUsualAddressMother()
        {
            synchronized (monitor())
            {
                check_orphaned();
                uk.nhs.nhsia.datastandards.ecds.PostcodeOfUsualAddressType target = null;
                target = (uk.nhs.nhsia.datastandards.ecds.PostcodeOfUsualAddressType)get_store().find_element_user(POSTCODEOFUSUALADDRESSMOTHER$10, 0);
                return target;
            }
        }
        
        /**
         * True if has "PostcodeOfUsualAddress_Mother" element
         */
        public boolean isSetPostcodeOfUsualAddressMother()
        {
            synchronized (monitor())
            {
                check_orphaned();
                return get_store().count_elements(POSTCODEOFUSUALADDRESSMOTHER$10) != 0;
            }
        }
        
        /**
         * Sets the "PostcodeOfUsualAddress_Mother" element
         */
        public void setPostcodeOfUsualAddressMother(java.lang.String postcodeOfUsualAddressMother)
        {
            synchronized (monitor())
            {
                check_orphaned();
                org.apache.xmlbeans.SimpleValue target = null;
                target = (org.apache.xmlbeans.SimpleValue)get_store().find_element_user(POSTCODEOFUSUALADDRESSMOTHER$10, 0);
                if (target == null)
                {
                    target = (org.apache.xmlbeans.SimpleValue)get_store().add_element_user(POSTCODEOFUSUALADDRESSMOTHER$10);
                }
                target.setStringValue(postcodeOfUsualAddressMother);
            }
        }
        
        /**
         * Sets (as xml) the "PostcodeOfUsualAddress_Mother" element
         */
        public void xsetPostcodeOfUsualAddressMother(uk.nhs.nhsia.datastandards.ecds.PostcodeOfUsualAddressType postcodeOfUsualAddressMother)
        {
            synchronized (monitor())
            {
                check_orphaned();
                uk.nhs.nhsia.datastandards.ecds.PostcodeOfUsualAddressType target = null;
                target = (uk.nhs.nhsia.datastandards.ecds.PostcodeOfUsualAddressType)get_store().find_element_user(POSTCODEOFUSUALADDRESSMOTHER$10, 0);
                if (target == null)
                {
                    target = (uk.nhs.nhsia.datastandards.ecds.PostcodeOfUsualAddressType)get_store().add_element_user(POSTCODEOFUSUALADDRESSMOTHER$10);
                }
                target.set(postcodeOfUsualAddressMother);
            }
        }
        
        /**
         * Unsets the "PostcodeOfUsualAddress_Mother" element
         */
        public void unsetPostcodeOfUsualAddressMother()
        {
            synchronized (monitor())
            {
                check_orphaned();
                get_store().remove_element(POSTCODEOFUSUALADDRESSMOTHER$10, 0);
            }
        }
        
        /**
         * Gets the "OrganisationCode_ResidenceResponsibility" element
         */
        public java.lang.String getOrganisationCodeResidenceResponsibility()
        {
            synchronized (monitor())
            {
                check_orphaned();
                org.apache.xmlbeans.SimpleValue target = null;
                target = (org.apache.xmlbeans.SimpleValue)get_store().find_element_user(ORGANISATIONCODERESIDENCERESPONSIBILITY$12, 0);
                if (target == null)
                {
                    return null;
                }
                return target.getStringValue();
            }
        }
        
        /**
         * Gets (as xml) the "OrganisationCode_ResidenceResponsibility" element
         */
        public uk.nhs.nhsia.datastandards.ecds.OrgCodeType xgetOrganisationCodeResidenceResponsibility()
        {
            synchronized (monitor())
            {
                check_orphaned();
                uk.nhs.nhsia.datastandards.ecds.OrgCodeType target = null;
                target = (uk.nhs.nhsia.datastandards.ecds.OrgCodeType)get_store().find_element_user(ORGANISATIONCODERESIDENCERESPONSIBILITY$12, 0);
                return target;
            }
        }
        
        /**
         * True if has "OrganisationCode_ResidenceResponsibility" element
         */
        public boolean isSetOrganisationCodeResidenceResponsibility()
        {
            synchronized (monitor())
            {
                check_orphaned();
                return get_store().count_elements(ORGANISATIONCODERESIDENCERESPONSIBILITY$12) != 0;
            }
        }
        
        /**
         * Sets the "OrganisationCode_ResidenceResponsibility" element
         */
        public void setOrganisationCodeResidenceResponsibility(java.lang.String organisationCodeResidenceResponsibility)
        {
            synchronized (monitor())
            {
                check_orphaned();
                org.apache.xmlbeans.SimpleValue target = null;
                target = (org.apache.xmlbeans.SimpleValue)get_store().find_element_user(ORGANISATIONCODERESIDENCERESPONSIBILITY$12, 0);
                if (target == null)
                {
                    target = (org.apache.xmlbeans.SimpleValue)get_store().add_element_user(ORGANISATIONCODERESIDENCERESPONSIBILITY$12);
                }
                target.setStringValue(organisationCodeResidenceResponsibility);
            }
        }
        
        /**
         * Sets (as xml) the "OrganisationCode_ResidenceResponsibility" element
         */
        public void xsetOrganisationCodeResidenceResponsibility(uk.nhs.nhsia.datastandards.ecds.OrgCodeType organisationCodeResidenceResponsibility)
        {
            synchronized (monitor())
            {
                check_orphaned();
                uk.nhs.nhsia.datastandards.ecds.OrgCodeType target = null;
                target = (uk.nhs.nhsia.datastandards.ecds.OrgCodeType)get_store().find_element_user(ORGANISATIONCODERESIDENCERESPONSIBILITY$12, 0);
                if (target == null)
                {
                    target = (uk.nhs.nhsia.datastandards.ecds.OrgCodeType)get_store().add_element_user(ORGANISATIONCODERESIDENCERESPONSIBILITY$12);
                }
                target.set(organisationCodeResidenceResponsibility);
            }
        }
        
        /**
         * Unsets the "OrganisationCode_ResidenceResponsibility" element
         */
        public void unsetOrganisationCodeResidenceResponsibility()
        {
            synchronized (monitor())
            {
                check_orphaned();
                get_store().remove_element(ORGANISATIONCODERESIDENCERESPONSIBILITY$12, 0);
            }
        }
        
        /**
         * Gets the "PersonBirthDate_Mother" element
         */
        public java.util.Calendar getPersonBirthDateMother()
        {
            synchronized (monitor())
            {
                check_orphaned();
                org.apache.xmlbeans.SimpleValue target = null;
                target = (org.apache.xmlbeans.SimpleValue)get_store().find_element_user(PERSONBIRTHDATEMOTHER$14, 0);
                if (target == null)
                {
                    return null;
                }
                return target.getCalendarValue();
            }
        }
        
        /**
         * Gets (as xml) the "PersonBirthDate_Mother" element
         */
        public uk.nhs.nhsia.datastandards.ecds.PersonBirthDateType xgetPersonBirthDateMother()
        {
            synchronized (monitor())
            {
                check_orphaned();
                uk.nhs.nhsia.datastandards.ecds.PersonBirthDateType target = null;
                target = (uk.nhs.nhsia.datastandards.ecds.PersonBirthDateType)get_store().find_element_user(PERSONBIRTHDATEMOTHER$14, 0);
                return target;
            }
        }
        
        /**
         * True if has "PersonBirthDate_Mother" element
         */
        public boolean isSetPersonBirthDateMother()
        {
            synchronized (monitor())
            {
                check_orphaned();
                return get_store().count_elements(PERSONBIRTHDATEMOTHER$14) != 0;
            }
        }
        
        /**
         * Sets the "PersonBirthDate_Mother" element
         */
        public void setPersonBirthDateMother(java.util.Calendar personBirthDateMother)
        {
            synchronized (monitor())
            {
                check_orphaned();
                org.apache.xmlbeans.SimpleValue target = null;
                target = (org.apache.xmlbeans.SimpleValue)get_store().find_element_user(PERSONBIRTHDATEMOTHER$14, 0);
                if (target == null)
                {
                    target = (org.apache.xmlbeans.SimpleValue)get_store().add_element_user(PERSONBIRTHDATEMOTHER$14);
                }
                target.setCalendarValue(personBirthDateMother);
            }
        }
        
        /**
         * Sets (as xml) the "PersonBirthDate_Mother" element
         */
        public void xsetPersonBirthDateMother(uk.nhs.nhsia.datastandards.ecds.PersonBirthDateType personBirthDateMother)
        {
            synchronized (monitor())
            {
                check_orphaned();
                uk.nhs.nhsia.datastandards.ecds.PersonBirthDateType target = null;
                target = (uk.nhs.nhsia.datastandards.ecds.PersonBirthDateType)get_store().find_element_user(PERSONBIRTHDATEMOTHER$14, 0);
                if (target == null)
                {
                    target = (uk.nhs.nhsia.datastandards.ecds.PersonBirthDateType)get_store().add_element_user(PERSONBIRTHDATEMOTHER$14);
                }
                target.set(personBirthDateMother);
            }
        }
        
        /**
         * Unsets the "PersonBirthDate_Mother" element
         */
        public void unsetPersonBirthDateMother()
        {
            synchronized (monitor())
            {
                check_orphaned();
                get_store().remove_element(PERSONBIRTHDATEMOTHER$14, 0);
            }
        }
        
        /**
         * Gets the "NHSNumberStatusIndicatorCode_Mother" attribute
         */
        public uk.nhs.nhsia.datastandards.ecds.NHSNumberStatusIndicatorCodeUnverifiedType.Enum getNHSNumberStatusIndicatorCodeMother2()
        {
            synchronized (monitor())
            {
                check_orphaned();
                org.apache.xmlbeans.SimpleValue target = null;
                target = (org.apache.xmlbeans.SimpleValue)get_store().find_attribute_user(NHSNUMBERSTATUSINDICATORCODEMOTHER2$16);
                if (target == null)
                {
                    return null;
                }
                return (uk.nhs.nhsia.datastandards.ecds.NHSNumberStatusIndicatorCodeUnverifiedType.Enum)target.getEnumValue();
            }
        }
        
        /**
         * Gets (as xml) the "NHSNumberStatusIndicatorCode_Mother" attribute
         */
        public uk.nhs.nhsia.datastandards.ecds.NHSNumberStatusIndicatorCodeUnverifiedType xgetNHSNumberStatusIndicatorCodeMother2()
        {
            synchronized (monitor())
            {
                check_orphaned();
                uk.nhs.nhsia.datastandards.ecds.NHSNumberStatusIndicatorCodeUnverifiedType target = null;
                target = (uk.nhs.nhsia.datastandards.ecds.NHSNumberStatusIndicatorCodeUnverifiedType)get_store().find_attribute_user(NHSNUMBERSTATUSINDICATORCODEMOTHER2$16);
                return target;
            }
        }
        
        /**
         * Sets the "NHSNumberStatusIndicatorCode_Mother" attribute
         */
        public void setNHSNumberStatusIndicatorCodeMother2(uk.nhs.nhsia.datastandards.ecds.NHSNumberStatusIndicatorCodeUnverifiedType.Enum nhsNumberStatusIndicatorCodeMother2)
        {
            synchronized (monitor())
            {
                check_orphaned();
                org.apache.xmlbeans.SimpleValue target = null;
                target = (org.apache.xmlbeans.SimpleValue)get_store().find_attribute_user(NHSNUMBERSTATUSINDICATORCODEMOTHER2$16);
                if (target == null)
                {
                    target = (org.apache.xmlbeans.SimpleValue)get_store().add_attribute_user(NHSNUMBERSTATUSINDICATORCODEMOTHER2$16);
                }
                target.setEnumValue(nhsNumberStatusIndicatorCodeMother2);
            }
        }
        
        /**
         * Sets (as xml) the "NHSNumberStatusIndicatorCode_Mother" attribute
         */
        public void xsetNHSNumberStatusIndicatorCodeMother2(uk.nhs.nhsia.datastandards.ecds.NHSNumberStatusIndicatorCodeUnverifiedType nhsNumberStatusIndicatorCodeMother2)
        {
            synchronized (monitor())
            {
                check_orphaned();
                uk.nhs.nhsia.datastandards.ecds.NHSNumberStatusIndicatorCodeUnverifiedType target = null;
                target = (uk.nhs.nhsia.datastandards.ecds.NHSNumberStatusIndicatorCodeUnverifiedType)get_store().find_attribute_user(NHSNUMBERSTATUSINDICATORCODEMOTHER2$16);
                if (target == null)
                {
                    target = (uk.nhs.nhsia.datastandards.ecds.NHSNumberStatusIndicatorCodeUnverifiedType)get_store().add_attribute_user(NHSNUMBERSTATUSINDICATORCODEMOTHER2$16);
                }
                target.set(nhsNumberStatusIndicatorCodeMother2);
            }
        }
    }
}
