/*
 * XML Type:  PatientIdentity
 * Namespace: http://www.nhsia.nhs.uk/DataStandards/XMLschema/CDS/ns
 * Java type: uk.nhs.nhsia.datastandards.ecds.PatientIdentity
 *
 * Automatically generated - do not modify.
 */
package uk.nhs.nhsia.datastandards.ecds.impl;
/**
 * An XML PatientIdentity(@http://www.nhsia.nhs.uk/DataStandards/XMLschema/CDS/ns).
 *
 * This is a complex type.
 */
public class PatientIdentityImpl extends org.apache.xmlbeans.impl.values.XmlComplexContentImpl implements uk.nhs.nhsia.datastandards.ecds.PatientIdentity
{
    private static final long serialVersionUID = 1L;
    
    public PatientIdentityImpl(org.apache.xmlbeans.SchemaType sType)
    {
        super(sType);
    }
    
    private static final javax.xml.namespace.QName WITHHELDIDENTITYSTRUCTURE$0 = 
        new javax.xml.namespace.QName("http://www.nhsia.nhs.uk/DataStandards/XMLschema/CDS/ns", "WithheldIdentity_Structure");
    private static final javax.xml.namespace.QName VERIFIEDIDENTITYSTRUCTURE$2 = 
        new javax.xml.namespace.QName("http://www.nhsia.nhs.uk/DataStandards/XMLschema/CDS/ns", "VerifiedIdentity_Structure");
    private static final javax.xml.namespace.QName UNVERIFIEDIDENTITYSTRUCTURE$4 = 
        new javax.xml.namespace.QName("http://www.nhsia.nhs.uk/DataStandards/XMLschema/CDS/ns", "UnverifiedIdentity_Structure");
    
    
    /**
     * Gets the "WithheldIdentity_Structure" element
     */
    public uk.nhs.nhsia.datastandards.ecds.PatientIdentity.WithheldIdentityStructure getWithheldIdentityStructure()
    {
        synchronized (monitor())
        {
            check_orphaned();
            uk.nhs.nhsia.datastandards.ecds.PatientIdentity.WithheldIdentityStructure target = null;
            target = (uk.nhs.nhsia.datastandards.ecds.PatientIdentity.WithheldIdentityStructure)get_store().find_element_user(WITHHELDIDENTITYSTRUCTURE$0, 0);
            if (target == null)
            {
                return null;
            }
            return target;
        }
    }
    
    /**
     * True if has "WithheldIdentity_Structure" element
     */
    public boolean isSetWithheldIdentityStructure()
    {
        synchronized (monitor())
        {
            check_orphaned();
            return get_store().count_elements(WITHHELDIDENTITYSTRUCTURE$0) != 0;
        }
    }
    
    /**
     * Sets the "WithheldIdentity_Structure" element
     */
    public void setWithheldIdentityStructure(uk.nhs.nhsia.datastandards.ecds.PatientIdentity.WithheldIdentityStructure withheldIdentityStructure)
    {
        generatedSetterHelperImpl(withheldIdentityStructure, WITHHELDIDENTITYSTRUCTURE$0, 0, org.apache.xmlbeans.impl.values.XmlObjectBase.KIND_SETTERHELPER_SINGLETON);
    }
    
    /**
     * Appends and returns a new empty "WithheldIdentity_Structure" element
     */
    public uk.nhs.nhsia.datastandards.ecds.PatientIdentity.WithheldIdentityStructure addNewWithheldIdentityStructure()
    {
        synchronized (monitor())
        {
            check_orphaned();
            uk.nhs.nhsia.datastandards.ecds.PatientIdentity.WithheldIdentityStructure target = null;
            target = (uk.nhs.nhsia.datastandards.ecds.PatientIdentity.WithheldIdentityStructure)get_store().add_element_user(WITHHELDIDENTITYSTRUCTURE$0);
            return target;
        }
    }
    
    /**
     * Unsets the "WithheldIdentity_Structure" element
     */
    public void unsetWithheldIdentityStructure()
    {
        synchronized (monitor())
        {
            check_orphaned();
            get_store().remove_element(WITHHELDIDENTITYSTRUCTURE$0, 0);
        }
    }
    
    /**
     * Gets the "VerifiedIdentity_Structure" element
     */
    public uk.nhs.nhsia.datastandards.ecds.PatientIdentity.VerifiedIdentityStructure getVerifiedIdentityStructure()
    {
        synchronized (monitor())
        {
            check_orphaned();
            uk.nhs.nhsia.datastandards.ecds.PatientIdentity.VerifiedIdentityStructure target = null;
            target = (uk.nhs.nhsia.datastandards.ecds.PatientIdentity.VerifiedIdentityStructure)get_store().find_element_user(VERIFIEDIDENTITYSTRUCTURE$2, 0);
            if (target == null)
            {
                return null;
            }
            return target;
        }
    }
    
    /**
     * True if has "VerifiedIdentity_Structure" element
     */
    public boolean isSetVerifiedIdentityStructure()
    {
        synchronized (monitor())
        {
            check_orphaned();
            return get_store().count_elements(VERIFIEDIDENTITYSTRUCTURE$2) != 0;
        }
    }
    
    /**
     * Sets the "VerifiedIdentity_Structure" element
     */
    public void setVerifiedIdentityStructure(uk.nhs.nhsia.datastandards.ecds.PatientIdentity.VerifiedIdentityStructure verifiedIdentityStructure)
    {
        generatedSetterHelperImpl(verifiedIdentityStructure, VERIFIEDIDENTITYSTRUCTURE$2, 0, org.apache.xmlbeans.impl.values.XmlObjectBase.KIND_SETTERHELPER_SINGLETON);
    }
    
    /**
     * Appends and returns a new empty "VerifiedIdentity_Structure" element
     */
    public uk.nhs.nhsia.datastandards.ecds.PatientIdentity.VerifiedIdentityStructure addNewVerifiedIdentityStructure()
    {
        synchronized (monitor())
        {
            check_orphaned();
            uk.nhs.nhsia.datastandards.ecds.PatientIdentity.VerifiedIdentityStructure target = null;
            target = (uk.nhs.nhsia.datastandards.ecds.PatientIdentity.VerifiedIdentityStructure)get_store().add_element_user(VERIFIEDIDENTITYSTRUCTURE$2);
            return target;
        }
    }
    
    /**
     * Unsets the "VerifiedIdentity_Structure" element
     */
    public void unsetVerifiedIdentityStructure()
    {
        synchronized (monitor())
        {
            check_orphaned();
            get_store().remove_element(VERIFIEDIDENTITYSTRUCTURE$2, 0);
        }
    }
    
    /**
     * Gets the "UnverifiedIdentity_Structure" element
     */
    public uk.nhs.nhsia.datastandards.ecds.PatientIdentity.UnverifiedIdentityStructure getUnverifiedIdentityStructure()
    {
        synchronized (monitor())
        {
            check_orphaned();
            uk.nhs.nhsia.datastandards.ecds.PatientIdentity.UnverifiedIdentityStructure target = null;
            target = (uk.nhs.nhsia.datastandards.ecds.PatientIdentity.UnverifiedIdentityStructure)get_store().find_element_user(UNVERIFIEDIDENTITYSTRUCTURE$4, 0);
            if (target == null)
            {
                return null;
            }
            return target;
        }
    }
    
    /**
     * True if has "UnverifiedIdentity_Structure" element
     */
    public boolean isSetUnverifiedIdentityStructure()
    {
        synchronized (monitor())
        {
            check_orphaned();
            return get_store().count_elements(UNVERIFIEDIDENTITYSTRUCTURE$4) != 0;
        }
    }
    
    /**
     * Sets the "UnverifiedIdentity_Structure" element
     */
    public void setUnverifiedIdentityStructure(uk.nhs.nhsia.datastandards.ecds.PatientIdentity.UnverifiedIdentityStructure unverifiedIdentityStructure)
    {
        generatedSetterHelperImpl(unverifiedIdentityStructure, UNVERIFIEDIDENTITYSTRUCTURE$4, 0, org.apache.xmlbeans.impl.values.XmlObjectBase.KIND_SETTERHELPER_SINGLETON);
    }
    
    /**
     * Appends and returns a new empty "UnverifiedIdentity_Structure" element
     */
    public uk.nhs.nhsia.datastandards.ecds.PatientIdentity.UnverifiedIdentityStructure addNewUnverifiedIdentityStructure()
    {
        synchronized (monitor())
        {
            check_orphaned();
            uk.nhs.nhsia.datastandards.ecds.PatientIdentity.UnverifiedIdentityStructure target = null;
            target = (uk.nhs.nhsia.datastandards.ecds.PatientIdentity.UnverifiedIdentityStructure)get_store().add_element_user(UNVERIFIEDIDENTITYSTRUCTURE$4);
            return target;
        }
    }
    
    /**
     * Unsets the "UnverifiedIdentity_Structure" element
     */
    public void unsetUnverifiedIdentityStructure()
    {
        synchronized (monitor())
        {
            check_orphaned();
            get_store().remove_element(UNVERIFIEDIDENTITYSTRUCTURE$4, 0);
        }
    }
    /**
     * An XML WithheldIdentity_Structure(@http://www.nhsia.nhs.uk/DataStandards/XMLschema/CDS/ns).
     *
     * This is a complex type.
     */
    public static class WithheldIdentityStructureImpl extends org.apache.xmlbeans.impl.values.XmlComplexContentImpl implements uk.nhs.nhsia.datastandards.ecds.PatientIdentity.WithheldIdentityStructure
    {
        private static final long serialVersionUID = 1L;
        
        public WithheldIdentityStructureImpl(org.apache.xmlbeans.SchemaType sType)
        {
            super(sType);
        }
        
        private static final javax.xml.namespace.QName NHSNUMBERSTATUSINDICATORCODE$0 = 
            new javax.xml.namespace.QName("http://www.nhsia.nhs.uk/DataStandards/XMLschema/CDS/ns", "NHSNumberStatusIndicatorCode");
        private static final javax.xml.namespace.QName ORGANISATIONIDENTIFIERRESIDENCERESPONSIBILITY$2 = 
            new javax.xml.namespace.QName("http://www.nhsia.nhs.uk/DataStandards/XMLschema/CDS/ns", "OrganisationIdentifier_ResidenceResponsibility");
        private static final javax.xml.namespace.QName WITHHELDIDENTITYREASON$4 = 
            new javax.xml.namespace.QName("http://www.nhsia.nhs.uk/DataStandards/XMLschema/CDS/ns", "WithheldIdentityReason");
        private static final javax.xml.namespace.QName NHSNUMBERSTATUSINDICATORCODE2$6 = 
            new javax.xml.namespace.QName("", "NHSNumberStatusIndicatorCode");
        
        
        /**
         * Gets the "NHSNumberStatusIndicatorCode" element
         */
        public uk.nhs.nhsia.datastandards.ecds.NHSNumberStatusIndicatorCodeWithheldType.Enum getNHSNumberStatusIndicatorCode()
        {
            synchronized (monitor())
            {
                check_orphaned();
                org.apache.xmlbeans.SimpleValue target = null;
                target = (org.apache.xmlbeans.SimpleValue)get_store().find_element_user(NHSNUMBERSTATUSINDICATORCODE$0, 0);
                if (target == null)
                {
                    return null;
                }
                return (uk.nhs.nhsia.datastandards.ecds.NHSNumberStatusIndicatorCodeWithheldType.Enum)target.getEnumValue();
            }
        }
        
        /**
         * Gets (as xml) the "NHSNumberStatusIndicatorCode" element
         */
        public uk.nhs.nhsia.datastandards.ecds.NHSNumberStatusIndicatorCodeWithheldType xgetNHSNumberStatusIndicatorCode()
        {
            synchronized (monitor())
            {
                check_orphaned();
                uk.nhs.nhsia.datastandards.ecds.NHSNumberStatusIndicatorCodeWithheldType target = null;
                target = (uk.nhs.nhsia.datastandards.ecds.NHSNumberStatusIndicatorCodeWithheldType)get_store().find_element_user(NHSNUMBERSTATUSINDICATORCODE$0, 0);
                return target;
            }
        }
        
        /**
         * Sets the "NHSNumberStatusIndicatorCode" element
         */
        public void setNHSNumberStatusIndicatorCode(uk.nhs.nhsia.datastandards.ecds.NHSNumberStatusIndicatorCodeWithheldType.Enum nhsNumberStatusIndicatorCode)
        {
            synchronized (monitor())
            {
                check_orphaned();
                org.apache.xmlbeans.SimpleValue target = null;
                target = (org.apache.xmlbeans.SimpleValue)get_store().find_element_user(NHSNUMBERSTATUSINDICATORCODE$0, 0);
                if (target == null)
                {
                    target = (org.apache.xmlbeans.SimpleValue)get_store().add_element_user(NHSNUMBERSTATUSINDICATORCODE$0);
                }
                target.setEnumValue(nhsNumberStatusIndicatorCode);
            }
        }
        
        /**
         * Sets (as xml) the "NHSNumberStatusIndicatorCode" element
         */
        public void xsetNHSNumberStatusIndicatorCode(uk.nhs.nhsia.datastandards.ecds.NHSNumberStatusIndicatorCodeWithheldType nhsNumberStatusIndicatorCode)
        {
            synchronized (monitor())
            {
                check_orphaned();
                uk.nhs.nhsia.datastandards.ecds.NHSNumberStatusIndicatorCodeWithheldType target = null;
                target = (uk.nhs.nhsia.datastandards.ecds.NHSNumberStatusIndicatorCodeWithheldType)get_store().find_element_user(NHSNUMBERSTATUSINDICATORCODE$0, 0);
                if (target == null)
                {
                    target = (uk.nhs.nhsia.datastandards.ecds.NHSNumberStatusIndicatorCodeWithheldType)get_store().add_element_user(NHSNUMBERSTATUSINDICATORCODE$0);
                }
                target.set(nhsNumberStatusIndicatorCode);
            }
        }
        
        /**
         * Gets the "OrganisationIdentifier_ResidenceResponsibility" element
         */
        public java.lang.String getOrganisationIdentifierResidenceResponsibility()
        {
            synchronized (monitor())
            {
                check_orphaned();
                org.apache.xmlbeans.SimpleValue target = null;
                target = (org.apache.xmlbeans.SimpleValue)get_store().find_element_user(ORGANISATIONIDENTIFIERRESIDENCERESPONSIBILITY$2, 0);
                if (target == null)
                {
                    return null;
                }
                return target.getStringValue();
            }
        }
        
        /**
         * Gets (as xml) the "OrganisationIdentifier_ResidenceResponsibility" element
         */
        public uk.nhs.nhsia.datastandards.ecds.OrgIdenECType xgetOrganisationIdentifierResidenceResponsibility()
        {
            synchronized (monitor())
            {
                check_orphaned();
                uk.nhs.nhsia.datastandards.ecds.OrgIdenECType target = null;
                target = (uk.nhs.nhsia.datastandards.ecds.OrgIdenECType)get_store().find_element_user(ORGANISATIONIDENTIFIERRESIDENCERESPONSIBILITY$2, 0);
                return target;
            }
        }
        
        /**
         * True if has "OrganisationIdentifier_ResidenceResponsibility" element
         */
        public boolean isSetOrganisationIdentifierResidenceResponsibility()
        {
            synchronized (monitor())
            {
                check_orphaned();
                return get_store().count_elements(ORGANISATIONIDENTIFIERRESIDENCERESPONSIBILITY$2) != 0;
            }
        }
        
        /**
         * Sets the "OrganisationIdentifier_ResidenceResponsibility" element
         */
        public void setOrganisationIdentifierResidenceResponsibility(java.lang.String organisationIdentifierResidenceResponsibility)
        {
            synchronized (monitor())
            {
                check_orphaned();
                org.apache.xmlbeans.SimpleValue target = null;
                target = (org.apache.xmlbeans.SimpleValue)get_store().find_element_user(ORGANISATIONIDENTIFIERRESIDENCERESPONSIBILITY$2, 0);
                if (target == null)
                {
                    target = (org.apache.xmlbeans.SimpleValue)get_store().add_element_user(ORGANISATIONIDENTIFIERRESIDENCERESPONSIBILITY$2);
                }
                target.setStringValue(organisationIdentifierResidenceResponsibility);
            }
        }
        
        /**
         * Sets (as xml) the "OrganisationIdentifier_ResidenceResponsibility" element
         */
        public void xsetOrganisationIdentifierResidenceResponsibility(uk.nhs.nhsia.datastandards.ecds.OrgIdenECType organisationIdentifierResidenceResponsibility)
        {
            synchronized (monitor())
            {
                check_orphaned();
                uk.nhs.nhsia.datastandards.ecds.OrgIdenECType target = null;
                target = (uk.nhs.nhsia.datastandards.ecds.OrgIdenECType)get_store().find_element_user(ORGANISATIONIDENTIFIERRESIDENCERESPONSIBILITY$2, 0);
                if (target == null)
                {
                    target = (uk.nhs.nhsia.datastandards.ecds.OrgIdenECType)get_store().add_element_user(ORGANISATIONIDENTIFIERRESIDENCERESPONSIBILITY$2);
                }
                target.set(organisationIdentifierResidenceResponsibility);
            }
        }
        
        /**
         * Unsets the "OrganisationIdentifier_ResidenceResponsibility" element
         */
        public void unsetOrganisationIdentifierResidenceResponsibility()
        {
            synchronized (monitor())
            {
                check_orphaned();
                get_store().remove_element(ORGANISATIONIDENTIFIERRESIDENCERESPONSIBILITY$2, 0);
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
         * Gets the "NHSNumberStatusIndicatorCode" attribute
         */
        public uk.nhs.nhsia.datastandards.ecds.NHSNumberStatusIndicatorCodeWithheldType.Enum getNHSNumberStatusIndicatorCode2()
        {
            synchronized (monitor())
            {
                check_orphaned();
                org.apache.xmlbeans.SimpleValue target = null;
                target = (org.apache.xmlbeans.SimpleValue)get_store().find_attribute_user(NHSNUMBERSTATUSINDICATORCODE2$6);
                if (target == null)
                {
                    return null;
                }
                return (uk.nhs.nhsia.datastandards.ecds.NHSNumberStatusIndicatorCodeWithheldType.Enum)target.getEnumValue();
            }
        }
        
        /**
         * Gets (as xml) the "NHSNumberStatusIndicatorCode" attribute
         */
        public uk.nhs.nhsia.datastandards.ecds.NHSNumberStatusIndicatorCodeWithheldType xgetNHSNumberStatusIndicatorCode2()
        {
            synchronized (monitor())
            {
                check_orphaned();
                uk.nhs.nhsia.datastandards.ecds.NHSNumberStatusIndicatorCodeWithheldType target = null;
                target = (uk.nhs.nhsia.datastandards.ecds.NHSNumberStatusIndicatorCodeWithheldType)get_store().find_attribute_user(NHSNUMBERSTATUSINDICATORCODE2$6);
                return target;
            }
        }
        
        /**
         * Sets the "NHSNumberStatusIndicatorCode" attribute
         */
        public void setNHSNumberStatusIndicatorCode2(uk.nhs.nhsia.datastandards.ecds.NHSNumberStatusIndicatorCodeWithheldType.Enum nhsNumberStatusIndicatorCode2)
        {
            synchronized (monitor())
            {
                check_orphaned();
                org.apache.xmlbeans.SimpleValue target = null;
                target = (org.apache.xmlbeans.SimpleValue)get_store().find_attribute_user(NHSNUMBERSTATUSINDICATORCODE2$6);
                if (target == null)
                {
                    target = (org.apache.xmlbeans.SimpleValue)get_store().add_attribute_user(NHSNUMBERSTATUSINDICATORCODE2$6);
                }
                target.setEnumValue(nhsNumberStatusIndicatorCode2);
            }
        }
        
        /**
         * Sets (as xml) the "NHSNumberStatusIndicatorCode" attribute
         */
        public void xsetNHSNumberStatusIndicatorCode2(uk.nhs.nhsia.datastandards.ecds.NHSNumberStatusIndicatorCodeWithheldType nhsNumberStatusIndicatorCode2)
        {
            synchronized (monitor())
            {
                check_orphaned();
                uk.nhs.nhsia.datastandards.ecds.NHSNumberStatusIndicatorCodeWithheldType target = null;
                target = (uk.nhs.nhsia.datastandards.ecds.NHSNumberStatusIndicatorCodeWithheldType)get_store().find_attribute_user(NHSNUMBERSTATUSINDICATORCODE2$6);
                if (target == null)
                {
                    target = (uk.nhs.nhsia.datastandards.ecds.NHSNumberStatusIndicatorCodeWithheldType)get_store().add_attribute_user(NHSNUMBERSTATUSINDICATORCODE2$6);
                }
                target.set(nhsNumberStatusIndicatorCode2);
            }
        }
    }
    /**
     * An XML VerifiedIdentity_Structure(@http://www.nhsia.nhs.uk/DataStandards/XMLschema/CDS/ns).
     *
     * This is a complex type.
     */
    public static class VerifiedIdentityStructureImpl extends org.apache.xmlbeans.impl.values.XmlComplexContentImpl implements uk.nhs.nhsia.datastandards.ecds.PatientIdentity.VerifiedIdentityStructure
    {
        private static final long serialVersionUID = 1L;
        
        public VerifiedIdentityStructureImpl(org.apache.xmlbeans.SchemaType sType)
        {
            super(sType);
        }
        
        private static final javax.xml.namespace.QName LOCALIDENTIFIERSTRUCTURE$0 = 
            new javax.xml.namespace.QName("http://www.nhsia.nhs.uk/DataStandards/XMLschema/CDS/ns", "LocalIdentifierStructure");
        private static final javax.xml.namespace.QName DATAELEMENTSTRUCTURE$2 = 
            new javax.xml.namespace.QName("http://www.nhsia.nhs.uk/DataStandards/XMLschema/CDS/ns", "DataElementStructure");
        private static final javax.xml.namespace.QName NHSNUMBERSTATUSINDICATORCODE$4 = 
            new javax.xml.namespace.QName("", "NHSNumberStatusIndicatorCode");
        
        
        /**
         * Gets the "LocalIdentifierStructure" element
         */
        public uk.nhs.nhsia.datastandards.ecds.PatientIdentity.VerifiedIdentityStructure.LocalIdentifierStructure getLocalIdentifierStructure()
        {
            synchronized (monitor())
            {
                check_orphaned();
                uk.nhs.nhsia.datastandards.ecds.PatientIdentity.VerifiedIdentityStructure.LocalIdentifierStructure target = null;
                target = (uk.nhs.nhsia.datastandards.ecds.PatientIdentity.VerifiedIdentityStructure.LocalIdentifierStructure)get_store().find_element_user(LOCALIDENTIFIERSTRUCTURE$0, 0);
                if (target == null)
                {
                    return null;
                }
                return target;
            }
        }
        
        /**
         * True if has "LocalIdentifierStructure" element
         */
        public boolean isSetLocalIdentifierStructure()
        {
            synchronized (monitor())
            {
                check_orphaned();
                return get_store().count_elements(LOCALIDENTIFIERSTRUCTURE$0) != 0;
            }
        }
        
        /**
         * Sets the "LocalIdentifierStructure" element
         */
        public void setLocalIdentifierStructure(uk.nhs.nhsia.datastandards.ecds.PatientIdentity.VerifiedIdentityStructure.LocalIdentifierStructure localIdentifierStructure)
        {
            generatedSetterHelperImpl(localIdentifierStructure, LOCALIDENTIFIERSTRUCTURE$0, 0, org.apache.xmlbeans.impl.values.XmlObjectBase.KIND_SETTERHELPER_SINGLETON);
        }
        
        /**
         * Appends and returns a new empty "LocalIdentifierStructure" element
         */
        public uk.nhs.nhsia.datastandards.ecds.PatientIdentity.VerifiedIdentityStructure.LocalIdentifierStructure addNewLocalIdentifierStructure()
        {
            synchronized (monitor())
            {
                check_orphaned();
                uk.nhs.nhsia.datastandards.ecds.PatientIdentity.VerifiedIdentityStructure.LocalIdentifierStructure target = null;
                target = (uk.nhs.nhsia.datastandards.ecds.PatientIdentity.VerifiedIdentityStructure.LocalIdentifierStructure)get_store().add_element_user(LOCALIDENTIFIERSTRUCTURE$0);
                return target;
            }
        }
        
        /**
         * Unsets the "LocalIdentifierStructure" element
         */
        public void unsetLocalIdentifierStructure()
        {
            synchronized (monitor())
            {
                check_orphaned();
                get_store().remove_element(LOCALIDENTIFIERSTRUCTURE$0, 0);
            }
        }
        
        /**
         * Gets the "DataElementStructure" element
         */
        public uk.nhs.nhsia.datastandards.ecds.PatientIdentity.VerifiedIdentityStructure.DataElementStructure getDataElementStructure()
        {
            synchronized (monitor())
            {
                check_orphaned();
                uk.nhs.nhsia.datastandards.ecds.PatientIdentity.VerifiedIdentityStructure.DataElementStructure target = null;
                target = (uk.nhs.nhsia.datastandards.ecds.PatientIdentity.VerifiedIdentityStructure.DataElementStructure)get_store().find_element_user(DATAELEMENTSTRUCTURE$2, 0);
                if (target == null)
                {
                    return null;
                }
                return target;
            }
        }
        
        /**
         * Sets the "DataElementStructure" element
         */
        public void setDataElementStructure(uk.nhs.nhsia.datastandards.ecds.PatientIdentity.VerifiedIdentityStructure.DataElementStructure dataElementStructure)
        {
            generatedSetterHelperImpl(dataElementStructure, DATAELEMENTSTRUCTURE$2, 0, org.apache.xmlbeans.impl.values.XmlObjectBase.KIND_SETTERHELPER_SINGLETON);
        }
        
        /**
         * Appends and returns a new empty "DataElementStructure" element
         */
        public uk.nhs.nhsia.datastandards.ecds.PatientIdentity.VerifiedIdentityStructure.DataElementStructure addNewDataElementStructure()
        {
            synchronized (monitor())
            {
                check_orphaned();
                uk.nhs.nhsia.datastandards.ecds.PatientIdentity.VerifiedIdentityStructure.DataElementStructure target = null;
                target = (uk.nhs.nhsia.datastandards.ecds.PatientIdentity.VerifiedIdentityStructure.DataElementStructure)get_store().add_element_user(DATAELEMENTSTRUCTURE$2);
                return target;
            }
        }
        
        /**
         * Gets the "NHSNumberStatusIndicatorCode" attribute
         */
        public uk.nhs.nhsia.datastandards.ecds.NHSNumberStatusIndicatorCodeVerifiedType.Enum getNHSNumberStatusIndicatorCode()
        {
            synchronized (monitor())
            {
                check_orphaned();
                org.apache.xmlbeans.SimpleValue target = null;
                target = (org.apache.xmlbeans.SimpleValue)get_store().find_attribute_user(NHSNUMBERSTATUSINDICATORCODE$4);
                if (target == null)
                {
                    return null;
                }
                return (uk.nhs.nhsia.datastandards.ecds.NHSNumberStatusIndicatorCodeVerifiedType.Enum)target.getEnumValue();
            }
        }
        
        /**
         * Gets (as xml) the "NHSNumberStatusIndicatorCode" attribute
         */
        public uk.nhs.nhsia.datastandards.ecds.NHSNumberStatusIndicatorCodeVerifiedType xgetNHSNumberStatusIndicatorCode()
        {
            synchronized (monitor())
            {
                check_orphaned();
                uk.nhs.nhsia.datastandards.ecds.NHSNumberStatusIndicatorCodeVerifiedType target = null;
                target = (uk.nhs.nhsia.datastandards.ecds.NHSNumberStatusIndicatorCodeVerifiedType)get_store().find_attribute_user(NHSNUMBERSTATUSINDICATORCODE$4);
                return target;
            }
        }
        
        /**
         * Sets the "NHSNumberStatusIndicatorCode" attribute
         */
        public void setNHSNumberStatusIndicatorCode(uk.nhs.nhsia.datastandards.ecds.NHSNumberStatusIndicatorCodeVerifiedType.Enum nhsNumberStatusIndicatorCode)
        {
            synchronized (monitor())
            {
                check_orphaned();
                org.apache.xmlbeans.SimpleValue target = null;
                target = (org.apache.xmlbeans.SimpleValue)get_store().find_attribute_user(NHSNUMBERSTATUSINDICATORCODE$4);
                if (target == null)
                {
                    target = (org.apache.xmlbeans.SimpleValue)get_store().add_attribute_user(NHSNUMBERSTATUSINDICATORCODE$4);
                }
                target.setEnumValue(nhsNumberStatusIndicatorCode);
            }
        }
        
        /**
         * Sets (as xml) the "NHSNumberStatusIndicatorCode" attribute
         */
        public void xsetNHSNumberStatusIndicatorCode(uk.nhs.nhsia.datastandards.ecds.NHSNumberStatusIndicatorCodeVerifiedType nhsNumberStatusIndicatorCode)
        {
            synchronized (monitor())
            {
                check_orphaned();
                uk.nhs.nhsia.datastandards.ecds.NHSNumberStatusIndicatorCodeVerifiedType target = null;
                target = (uk.nhs.nhsia.datastandards.ecds.NHSNumberStatusIndicatorCodeVerifiedType)get_store().find_attribute_user(NHSNUMBERSTATUSINDICATORCODE$4);
                if (target == null)
                {
                    target = (uk.nhs.nhsia.datastandards.ecds.NHSNumberStatusIndicatorCodeVerifiedType)get_store().add_attribute_user(NHSNUMBERSTATUSINDICATORCODE$4);
                }
                target.set(nhsNumberStatusIndicatorCode);
            }
        }
        /**
         * An XML LocalIdentifierStructure(@http://www.nhsia.nhs.uk/DataStandards/XMLschema/CDS/ns).
         *
         * This is a complex type.
         */
        public static class LocalIdentifierStructureImpl extends org.apache.xmlbeans.impl.values.XmlComplexContentImpl implements uk.nhs.nhsia.datastandards.ecds.PatientIdentity.VerifiedIdentityStructure.LocalIdentifierStructure
        {
            private static final long serialVersionUID = 1L;
            
            public LocalIdentifierStructureImpl(org.apache.xmlbeans.SchemaType sType)
            {
                super(sType);
            }
            
            private static final javax.xml.namespace.QName LOCALPATIENTIDENTIFIEREXTENDED$0 = 
                new javax.xml.namespace.QName("http://www.nhsia.nhs.uk/DataStandards/XMLschema/CDS/ns", "LocalPatientIdentifier_Extended");
            private static final javax.xml.namespace.QName ORGANISATIONIDENTIFIERLOCALPATIENTIDENTIFIER$2 = 
                new javax.xml.namespace.QName("http://www.nhsia.nhs.uk/DataStandards/XMLschema/CDS/ns", "OrganisationIdentifier_LocalPatientIdentifier");
            
            
            /**
             * Gets the "LocalPatientIdentifier_Extended" element
             */
            public java.lang.String getLocalPatientIdentifierExtended()
            {
                synchronized (monitor())
                {
                    check_orphaned();
                    org.apache.xmlbeans.SimpleValue target = null;
                    target = (org.apache.xmlbeans.SimpleValue)get_store().find_element_user(LOCALPATIENTIDENTIFIEREXTENDED$0, 0);
                    if (target == null)
                    {
                      return null;
                    }
                    return target.getStringValue();
                }
            }
            
            /**
             * Gets (as xml) the "LocalPatientIdentifier_Extended" element
             */
            public uk.nhs.nhsia.datastandards.ecds.LocalPatientIdentifierECType xgetLocalPatientIdentifierExtended()
            {
                synchronized (monitor())
                {
                    check_orphaned();
                    uk.nhs.nhsia.datastandards.ecds.LocalPatientIdentifierECType target = null;
                    target = (uk.nhs.nhsia.datastandards.ecds.LocalPatientIdentifierECType)get_store().find_element_user(LOCALPATIENTIDENTIFIEREXTENDED$0, 0);
                    return target;
                }
            }
            
            /**
             * True if has "LocalPatientIdentifier_Extended" element
             */
            public boolean isSetLocalPatientIdentifierExtended()
            {
                synchronized (monitor())
                {
                    check_orphaned();
                    return get_store().count_elements(LOCALPATIENTIDENTIFIEREXTENDED$0) != 0;
                }
            }
            
            /**
             * Sets the "LocalPatientIdentifier_Extended" element
             */
            public void setLocalPatientIdentifierExtended(java.lang.String localPatientIdentifierExtended)
            {
                synchronized (monitor())
                {
                    check_orphaned();
                    org.apache.xmlbeans.SimpleValue target = null;
                    target = (org.apache.xmlbeans.SimpleValue)get_store().find_element_user(LOCALPATIENTIDENTIFIEREXTENDED$0, 0);
                    if (target == null)
                    {
                      target = (org.apache.xmlbeans.SimpleValue)get_store().add_element_user(LOCALPATIENTIDENTIFIEREXTENDED$0);
                    }
                    target.setStringValue(localPatientIdentifierExtended);
                }
            }
            
            /**
             * Sets (as xml) the "LocalPatientIdentifier_Extended" element
             */
            public void xsetLocalPatientIdentifierExtended(uk.nhs.nhsia.datastandards.ecds.LocalPatientIdentifierECType localPatientIdentifierExtended)
            {
                synchronized (monitor())
                {
                    check_orphaned();
                    uk.nhs.nhsia.datastandards.ecds.LocalPatientIdentifierECType target = null;
                    target = (uk.nhs.nhsia.datastandards.ecds.LocalPatientIdentifierECType)get_store().find_element_user(LOCALPATIENTIDENTIFIEREXTENDED$0, 0);
                    if (target == null)
                    {
                      target = (uk.nhs.nhsia.datastandards.ecds.LocalPatientIdentifierECType)get_store().add_element_user(LOCALPATIENTIDENTIFIEREXTENDED$0);
                    }
                    target.set(localPatientIdentifierExtended);
                }
            }
            
            /**
             * Unsets the "LocalPatientIdentifier_Extended" element
             */
            public void unsetLocalPatientIdentifierExtended()
            {
                synchronized (monitor())
                {
                    check_orphaned();
                    get_store().remove_element(LOCALPATIENTIDENTIFIEREXTENDED$0, 0);
                }
            }
            
            /**
             * Gets the "OrganisationIdentifier_LocalPatientIdentifier" element
             */
            public java.lang.String getOrganisationIdentifierLocalPatientIdentifier()
            {
                synchronized (monitor())
                {
                    check_orphaned();
                    org.apache.xmlbeans.SimpleValue target = null;
                    target = (org.apache.xmlbeans.SimpleValue)get_store().find_element_user(ORGANISATIONIDENTIFIERLOCALPATIENTIDENTIFIER$2, 0);
                    if (target == null)
                    {
                      return null;
                    }
                    return target.getStringValue();
                }
            }
            
            /**
             * Gets (as xml) the "OrganisationIdentifier_LocalPatientIdentifier" element
             */
            public uk.nhs.nhsia.datastandards.ecds.OrgIdenECType xgetOrganisationIdentifierLocalPatientIdentifier()
            {
                synchronized (monitor())
                {
                    check_orphaned();
                    uk.nhs.nhsia.datastandards.ecds.OrgIdenECType target = null;
                    target = (uk.nhs.nhsia.datastandards.ecds.OrgIdenECType)get_store().find_element_user(ORGANISATIONIDENTIFIERLOCALPATIENTIDENTIFIER$2, 0);
                    return target;
                }
            }
            
            /**
             * True if has "OrganisationIdentifier_LocalPatientIdentifier" element
             */
            public boolean isSetOrganisationIdentifierLocalPatientIdentifier()
            {
                synchronized (monitor())
                {
                    check_orphaned();
                    return get_store().count_elements(ORGANISATIONIDENTIFIERLOCALPATIENTIDENTIFIER$2) != 0;
                }
            }
            
            /**
             * Sets the "OrganisationIdentifier_LocalPatientIdentifier" element
             */
            public void setOrganisationIdentifierLocalPatientIdentifier(java.lang.String organisationIdentifierLocalPatientIdentifier)
            {
                synchronized (monitor())
                {
                    check_orphaned();
                    org.apache.xmlbeans.SimpleValue target = null;
                    target = (org.apache.xmlbeans.SimpleValue)get_store().find_element_user(ORGANISATIONIDENTIFIERLOCALPATIENTIDENTIFIER$2, 0);
                    if (target == null)
                    {
                      target = (org.apache.xmlbeans.SimpleValue)get_store().add_element_user(ORGANISATIONIDENTIFIERLOCALPATIENTIDENTIFIER$2);
                    }
                    target.setStringValue(organisationIdentifierLocalPatientIdentifier);
                }
            }
            
            /**
             * Sets (as xml) the "OrganisationIdentifier_LocalPatientIdentifier" element
             */
            public void xsetOrganisationIdentifierLocalPatientIdentifier(uk.nhs.nhsia.datastandards.ecds.OrgIdenECType organisationIdentifierLocalPatientIdentifier)
            {
                synchronized (monitor())
                {
                    check_orphaned();
                    uk.nhs.nhsia.datastandards.ecds.OrgIdenECType target = null;
                    target = (uk.nhs.nhsia.datastandards.ecds.OrgIdenECType)get_store().find_element_user(ORGANISATIONIDENTIFIERLOCALPATIENTIDENTIFIER$2, 0);
                    if (target == null)
                    {
                      target = (uk.nhs.nhsia.datastandards.ecds.OrgIdenECType)get_store().add_element_user(ORGANISATIONIDENTIFIERLOCALPATIENTIDENTIFIER$2);
                    }
                    target.set(organisationIdentifierLocalPatientIdentifier);
                }
            }
            
            /**
             * Unsets the "OrganisationIdentifier_LocalPatientIdentifier" element
             */
            public void unsetOrganisationIdentifierLocalPatientIdentifier()
            {
                synchronized (monitor())
                {
                    check_orphaned();
                    get_store().remove_element(ORGANISATIONIDENTIFIERLOCALPATIENTIDENTIFIER$2, 0);
                }
            }
        }
        /**
         * An XML DataElementStructure(@http://www.nhsia.nhs.uk/DataStandards/XMLschema/CDS/ns).
         *
         * This is a complex type.
         */
        public static class DataElementStructureImpl extends org.apache.xmlbeans.impl.values.XmlComplexContentImpl implements uk.nhs.nhsia.datastandards.ecds.PatientIdentity.VerifiedIdentityStructure.DataElementStructure
        {
            private static final long serialVersionUID = 1L;
            
            public DataElementStructureImpl(org.apache.xmlbeans.SchemaType sType)
            {
                super(sType);
            }
            
            private static final javax.xml.namespace.QName NHSNUMBER$0 = 
                new javax.xml.namespace.QName("http://www.nhsia.nhs.uk/DataStandards/XMLschema/CDS/ns", "NHSNumber");
            private static final javax.xml.namespace.QName NHSNUMBERSTATUSINDICATORCODE$2 = 
                new javax.xml.namespace.QName("http://www.nhsia.nhs.uk/DataStandards/XMLschema/CDS/ns", "NHSNumberStatusIndicatorCode");
            private static final javax.xml.namespace.QName POSTCODEOFUSUALADDRESS$4 = 
                new javax.xml.namespace.QName("http://www.nhsia.nhs.uk/DataStandards/XMLschema/CDS/ns", "PostcodeOfUsualAddress");
            private static final javax.xml.namespace.QName ORGANISATIONIDENTIFIERRESIDENCERESPONSIBILITY$6 = 
                new javax.xml.namespace.QName("http://www.nhsia.nhs.uk/DataStandards/XMLschema/CDS/ns", "OrganisationIdentifier_ResidenceResponsibility");
            private static final javax.xml.namespace.QName PERSONBIRTHDATE$8 = 
                new javax.xml.namespace.QName("http://www.nhsia.nhs.uk/DataStandards/XMLschema/CDS/ns", "PersonBirthDate");
            
            
            /**
             * Gets the "NHSNumber" element
             */
            public java.lang.String getNHSNumber()
            {
                synchronized (monitor())
                {
                    check_orphaned();
                    org.apache.xmlbeans.SimpleValue target = null;
                    target = (org.apache.xmlbeans.SimpleValue)get_store().find_element_user(NHSNUMBER$0, 0);
                    if (target == null)
                    {
                      return null;
                    }
                    return target.getStringValue();
                }
            }
            
            /**
             * Gets (as xml) the "NHSNumber" element
             */
            public uk.nhs.nhsia.datastandards.ecds.NHSNumberType xgetNHSNumber()
            {
                synchronized (monitor())
                {
                    check_orphaned();
                    uk.nhs.nhsia.datastandards.ecds.NHSNumberType target = null;
                    target = (uk.nhs.nhsia.datastandards.ecds.NHSNumberType)get_store().find_element_user(NHSNUMBER$0, 0);
                    return target;
                }
            }
            
            /**
             * Sets the "NHSNumber" element
             */
            public void setNHSNumber(java.lang.String nhsNumber)
            {
                synchronized (monitor())
                {
                    check_orphaned();
                    org.apache.xmlbeans.SimpleValue target = null;
                    target = (org.apache.xmlbeans.SimpleValue)get_store().find_element_user(NHSNUMBER$0, 0);
                    if (target == null)
                    {
                      target = (org.apache.xmlbeans.SimpleValue)get_store().add_element_user(NHSNUMBER$0);
                    }
                    target.setStringValue(nhsNumber);
                }
            }
            
            /**
             * Sets (as xml) the "NHSNumber" element
             */
            public void xsetNHSNumber(uk.nhs.nhsia.datastandards.ecds.NHSNumberType nhsNumber)
            {
                synchronized (monitor())
                {
                    check_orphaned();
                    uk.nhs.nhsia.datastandards.ecds.NHSNumberType target = null;
                    target = (uk.nhs.nhsia.datastandards.ecds.NHSNumberType)get_store().find_element_user(NHSNUMBER$0, 0);
                    if (target == null)
                    {
                      target = (uk.nhs.nhsia.datastandards.ecds.NHSNumberType)get_store().add_element_user(NHSNUMBER$0);
                    }
                    target.set(nhsNumber);
                }
            }
            
            /**
             * Gets the "NHSNumberStatusIndicatorCode" element
             */
            public uk.nhs.nhsia.datastandards.ecds.NHSNumberStatusIndicatorCodeVerifiedType.Enum getNHSNumberStatusIndicatorCode()
            {
                synchronized (monitor())
                {
                    check_orphaned();
                    org.apache.xmlbeans.SimpleValue target = null;
                    target = (org.apache.xmlbeans.SimpleValue)get_store().find_element_user(NHSNUMBERSTATUSINDICATORCODE$2, 0);
                    if (target == null)
                    {
                      return null;
                    }
                    return (uk.nhs.nhsia.datastandards.ecds.NHSNumberStatusIndicatorCodeVerifiedType.Enum)target.getEnumValue();
                }
            }
            
            /**
             * Gets (as xml) the "NHSNumberStatusIndicatorCode" element
             */
            public uk.nhs.nhsia.datastandards.ecds.NHSNumberStatusIndicatorCodeVerifiedType xgetNHSNumberStatusIndicatorCode()
            {
                synchronized (monitor())
                {
                    check_orphaned();
                    uk.nhs.nhsia.datastandards.ecds.NHSNumberStatusIndicatorCodeVerifiedType target = null;
                    target = (uk.nhs.nhsia.datastandards.ecds.NHSNumberStatusIndicatorCodeVerifiedType)get_store().find_element_user(NHSNUMBERSTATUSINDICATORCODE$2, 0);
                    return target;
                }
            }
            
            /**
             * Sets the "NHSNumberStatusIndicatorCode" element
             */
            public void setNHSNumberStatusIndicatorCode(uk.nhs.nhsia.datastandards.ecds.NHSNumberStatusIndicatorCodeVerifiedType.Enum nhsNumberStatusIndicatorCode)
            {
                synchronized (monitor())
                {
                    check_orphaned();
                    org.apache.xmlbeans.SimpleValue target = null;
                    target = (org.apache.xmlbeans.SimpleValue)get_store().find_element_user(NHSNUMBERSTATUSINDICATORCODE$2, 0);
                    if (target == null)
                    {
                      target = (org.apache.xmlbeans.SimpleValue)get_store().add_element_user(NHSNUMBERSTATUSINDICATORCODE$2);
                    }
                    target.setEnumValue(nhsNumberStatusIndicatorCode);
                }
            }
            
            /**
             * Sets (as xml) the "NHSNumberStatusIndicatorCode" element
             */
            public void xsetNHSNumberStatusIndicatorCode(uk.nhs.nhsia.datastandards.ecds.NHSNumberStatusIndicatorCodeVerifiedType nhsNumberStatusIndicatorCode)
            {
                synchronized (monitor())
                {
                    check_orphaned();
                    uk.nhs.nhsia.datastandards.ecds.NHSNumberStatusIndicatorCodeVerifiedType target = null;
                    target = (uk.nhs.nhsia.datastandards.ecds.NHSNumberStatusIndicatorCodeVerifiedType)get_store().find_element_user(NHSNUMBERSTATUSINDICATORCODE$2, 0);
                    if (target == null)
                    {
                      target = (uk.nhs.nhsia.datastandards.ecds.NHSNumberStatusIndicatorCodeVerifiedType)get_store().add_element_user(NHSNUMBERSTATUSINDICATORCODE$2);
                    }
                    target.set(nhsNumberStatusIndicatorCode);
                }
            }
            
            /**
             * Gets the "PostcodeOfUsualAddress" element
             */
            public java.lang.String getPostcodeOfUsualAddress()
            {
                synchronized (monitor())
                {
                    check_orphaned();
                    org.apache.xmlbeans.SimpleValue target = null;
                    target = (org.apache.xmlbeans.SimpleValue)get_store().find_element_user(POSTCODEOFUSUALADDRESS$4, 0);
                    if (target == null)
                    {
                      return null;
                    }
                    return target.getStringValue();
                }
            }
            
            /**
             * Gets (as xml) the "PostcodeOfUsualAddress" element
             */
            public uk.nhs.nhsia.datastandards.ecds.PostcodeOfUsualAddressType xgetPostcodeOfUsualAddress()
            {
                synchronized (monitor())
                {
                    check_orphaned();
                    uk.nhs.nhsia.datastandards.ecds.PostcodeOfUsualAddressType target = null;
                    target = (uk.nhs.nhsia.datastandards.ecds.PostcodeOfUsualAddressType)get_store().find_element_user(POSTCODEOFUSUALADDRESS$4, 0);
                    return target;
                }
            }
            
            /**
             * Sets the "PostcodeOfUsualAddress" element
             */
            public void setPostcodeOfUsualAddress(java.lang.String postcodeOfUsualAddress)
            {
                synchronized (monitor())
                {
                    check_orphaned();
                    org.apache.xmlbeans.SimpleValue target = null;
                    target = (org.apache.xmlbeans.SimpleValue)get_store().find_element_user(POSTCODEOFUSUALADDRESS$4, 0);
                    if (target == null)
                    {
                      target = (org.apache.xmlbeans.SimpleValue)get_store().add_element_user(POSTCODEOFUSUALADDRESS$4);
                    }
                    target.setStringValue(postcodeOfUsualAddress);
                }
            }
            
            /**
             * Sets (as xml) the "PostcodeOfUsualAddress" element
             */
            public void xsetPostcodeOfUsualAddress(uk.nhs.nhsia.datastandards.ecds.PostcodeOfUsualAddressType postcodeOfUsualAddress)
            {
                synchronized (monitor())
                {
                    check_orphaned();
                    uk.nhs.nhsia.datastandards.ecds.PostcodeOfUsualAddressType target = null;
                    target = (uk.nhs.nhsia.datastandards.ecds.PostcodeOfUsualAddressType)get_store().find_element_user(POSTCODEOFUSUALADDRESS$4, 0);
                    if (target == null)
                    {
                      target = (uk.nhs.nhsia.datastandards.ecds.PostcodeOfUsualAddressType)get_store().add_element_user(POSTCODEOFUSUALADDRESS$4);
                    }
                    target.set(postcodeOfUsualAddress);
                }
            }
            
            /**
             * Gets the "OrganisationIdentifier_ResidenceResponsibility" element
             */
            public java.lang.String getOrganisationIdentifierResidenceResponsibility()
            {
                synchronized (monitor())
                {
                    check_orphaned();
                    org.apache.xmlbeans.SimpleValue target = null;
                    target = (org.apache.xmlbeans.SimpleValue)get_store().find_element_user(ORGANISATIONIDENTIFIERRESIDENCERESPONSIBILITY$6, 0);
                    if (target == null)
                    {
                      return null;
                    }
                    return target.getStringValue();
                }
            }
            
            /**
             * Gets (as xml) the "OrganisationIdentifier_ResidenceResponsibility" element
             */
            public uk.nhs.nhsia.datastandards.ecds.OrgIdenECType xgetOrganisationIdentifierResidenceResponsibility()
            {
                synchronized (monitor())
                {
                    check_orphaned();
                    uk.nhs.nhsia.datastandards.ecds.OrgIdenECType target = null;
                    target = (uk.nhs.nhsia.datastandards.ecds.OrgIdenECType)get_store().find_element_user(ORGANISATIONIDENTIFIERRESIDENCERESPONSIBILITY$6, 0);
                    return target;
                }
            }
            
            /**
             * True if has "OrganisationIdentifier_ResidenceResponsibility" element
             */
            public boolean isSetOrganisationIdentifierResidenceResponsibility()
            {
                synchronized (monitor())
                {
                    check_orphaned();
                    return get_store().count_elements(ORGANISATIONIDENTIFIERRESIDENCERESPONSIBILITY$6) != 0;
                }
            }
            
            /**
             * Sets the "OrganisationIdentifier_ResidenceResponsibility" element
             */
            public void setOrganisationIdentifierResidenceResponsibility(java.lang.String organisationIdentifierResidenceResponsibility)
            {
                synchronized (monitor())
                {
                    check_orphaned();
                    org.apache.xmlbeans.SimpleValue target = null;
                    target = (org.apache.xmlbeans.SimpleValue)get_store().find_element_user(ORGANISATIONIDENTIFIERRESIDENCERESPONSIBILITY$6, 0);
                    if (target == null)
                    {
                      target = (org.apache.xmlbeans.SimpleValue)get_store().add_element_user(ORGANISATIONIDENTIFIERRESIDENCERESPONSIBILITY$6);
                    }
                    target.setStringValue(organisationIdentifierResidenceResponsibility);
                }
            }
            
            /**
             * Sets (as xml) the "OrganisationIdentifier_ResidenceResponsibility" element
             */
            public void xsetOrganisationIdentifierResidenceResponsibility(uk.nhs.nhsia.datastandards.ecds.OrgIdenECType organisationIdentifierResidenceResponsibility)
            {
                synchronized (monitor())
                {
                    check_orphaned();
                    uk.nhs.nhsia.datastandards.ecds.OrgIdenECType target = null;
                    target = (uk.nhs.nhsia.datastandards.ecds.OrgIdenECType)get_store().find_element_user(ORGANISATIONIDENTIFIERRESIDENCERESPONSIBILITY$6, 0);
                    if (target == null)
                    {
                      target = (uk.nhs.nhsia.datastandards.ecds.OrgIdenECType)get_store().add_element_user(ORGANISATIONIDENTIFIERRESIDENCERESPONSIBILITY$6);
                    }
                    target.set(organisationIdentifierResidenceResponsibility);
                }
            }
            
            /**
             * Unsets the "OrganisationIdentifier_ResidenceResponsibility" element
             */
            public void unsetOrganisationIdentifierResidenceResponsibility()
            {
                synchronized (monitor())
                {
                    check_orphaned();
                    get_store().remove_element(ORGANISATIONIDENTIFIERRESIDENCERESPONSIBILITY$6, 0);
                }
            }
            
            /**
             * Gets the "PersonBirthDate" element
             */
            public java.util.Calendar getPersonBirthDate()
            {
                synchronized (monitor())
                {
                    check_orphaned();
                    org.apache.xmlbeans.SimpleValue target = null;
                    target = (org.apache.xmlbeans.SimpleValue)get_store().find_element_user(PERSONBIRTHDATE$8, 0);
                    if (target == null)
                    {
                      return null;
                    }
                    return target.getCalendarValue();
                }
            }
            
            /**
             * Gets (as xml) the "PersonBirthDate" element
             */
            public uk.nhs.nhsia.datastandards.ecds.PersonBirthDateType xgetPersonBirthDate()
            {
                synchronized (monitor())
                {
                    check_orphaned();
                    uk.nhs.nhsia.datastandards.ecds.PersonBirthDateType target = null;
                    target = (uk.nhs.nhsia.datastandards.ecds.PersonBirthDateType)get_store().find_element_user(PERSONBIRTHDATE$8, 0);
                    return target;
                }
            }
            
            /**
             * True if has "PersonBirthDate" element
             */
            public boolean isSetPersonBirthDate()
            {
                synchronized (monitor())
                {
                    check_orphaned();
                    return get_store().count_elements(PERSONBIRTHDATE$8) != 0;
                }
            }
            
            /**
             * Sets the "PersonBirthDate" element
             */
            public void setPersonBirthDate(java.util.Calendar personBirthDate)
            {
                synchronized (monitor())
                {
                    check_orphaned();
                    org.apache.xmlbeans.SimpleValue target = null;
                    target = (org.apache.xmlbeans.SimpleValue)get_store().find_element_user(PERSONBIRTHDATE$8, 0);
                    if (target == null)
                    {
                      target = (org.apache.xmlbeans.SimpleValue)get_store().add_element_user(PERSONBIRTHDATE$8);
                    }
                    target.setCalendarValue(personBirthDate);
                }
            }
            
            /**
             * Sets (as xml) the "PersonBirthDate" element
             */
            public void xsetPersonBirthDate(uk.nhs.nhsia.datastandards.ecds.PersonBirthDateType personBirthDate)
            {
                synchronized (monitor())
                {
                    check_orphaned();
                    uk.nhs.nhsia.datastandards.ecds.PersonBirthDateType target = null;
                    target = (uk.nhs.nhsia.datastandards.ecds.PersonBirthDateType)get_store().find_element_user(PERSONBIRTHDATE$8, 0);
                    if (target == null)
                    {
                      target = (uk.nhs.nhsia.datastandards.ecds.PersonBirthDateType)get_store().add_element_user(PERSONBIRTHDATE$8);
                    }
                    target.set(personBirthDate);
                }
            }
            
            /**
             * Unsets the "PersonBirthDate" element
             */
            public void unsetPersonBirthDate()
            {
                synchronized (monitor())
                {
                    check_orphaned();
                    get_store().remove_element(PERSONBIRTHDATE$8, 0);
                }
            }
        }
    }
    /**
     * An XML UnverifiedIdentity_Structure(@http://www.nhsia.nhs.uk/DataStandards/XMLschema/CDS/ns).
     *
     * This is a complex type.
     */
    public static class UnverifiedIdentityStructureImpl extends org.apache.xmlbeans.impl.values.XmlComplexContentImpl implements uk.nhs.nhsia.datastandards.ecds.PatientIdentity.UnverifiedIdentityStructure
    {
        private static final long serialVersionUID = 1L;
        
        public UnverifiedIdentityStructureImpl(org.apache.xmlbeans.SchemaType sType)
        {
            super(sType);
        }
        
        private static final javax.xml.namespace.QName LOCALIDENTIFIERSTRUCTURE$0 = 
            new javax.xml.namespace.QName("http://www.nhsia.nhs.uk/DataStandards/XMLschema/CDS/ns", "LocalIdentifierStructure");
        private static final javax.xml.namespace.QName DATAELEMENTSTRUCTURE$2 = 
            new javax.xml.namespace.QName("http://www.nhsia.nhs.uk/DataStandards/XMLschema/CDS/ns", "DataElementStructure");
        private static final javax.xml.namespace.QName DATAELEMENTSTRUCTURE2$4 = 
            new javax.xml.namespace.QName("http://www.nhsia.nhs.uk/DataStandards/XMLschema/CDS/ns", "DataElementStructure2");
        private static final javax.xml.namespace.QName NHSNUMBERSTATUSINDICATORCODE$6 = 
            new javax.xml.namespace.QName("", "NHSNumberStatusIndicatorCode");
        
        
        /**
         * Gets the "LocalIdentifierStructure" element
         */
        public uk.nhs.nhsia.datastandards.ecds.PatientIdentity.UnverifiedIdentityStructure.LocalIdentifierStructure getLocalIdentifierStructure()
        {
            synchronized (monitor())
            {
                check_orphaned();
                uk.nhs.nhsia.datastandards.ecds.PatientIdentity.UnverifiedIdentityStructure.LocalIdentifierStructure target = null;
                target = (uk.nhs.nhsia.datastandards.ecds.PatientIdentity.UnverifiedIdentityStructure.LocalIdentifierStructure)get_store().find_element_user(LOCALIDENTIFIERSTRUCTURE$0, 0);
                if (target == null)
                {
                    return null;
                }
                return target;
            }
        }
        
        /**
         * True if has "LocalIdentifierStructure" element
         */
        public boolean isSetLocalIdentifierStructure()
        {
            synchronized (monitor())
            {
                check_orphaned();
                return get_store().count_elements(LOCALIDENTIFIERSTRUCTURE$0) != 0;
            }
        }
        
        /**
         * Sets the "LocalIdentifierStructure" element
         */
        public void setLocalIdentifierStructure(uk.nhs.nhsia.datastandards.ecds.PatientIdentity.UnverifiedIdentityStructure.LocalIdentifierStructure localIdentifierStructure)
        {
            generatedSetterHelperImpl(localIdentifierStructure, LOCALIDENTIFIERSTRUCTURE$0, 0, org.apache.xmlbeans.impl.values.XmlObjectBase.KIND_SETTERHELPER_SINGLETON);
        }
        
        /**
         * Appends and returns a new empty "LocalIdentifierStructure" element
         */
        public uk.nhs.nhsia.datastandards.ecds.PatientIdentity.UnverifiedIdentityStructure.LocalIdentifierStructure addNewLocalIdentifierStructure()
        {
            synchronized (monitor())
            {
                check_orphaned();
                uk.nhs.nhsia.datastandards.ecds.PatientIdentity.UnverifiedIdentityStructure.LocalIdentifierStructure target = null;
                target = (uk.nhs.nhsia.datastandards.ecds.PatientIdentity.UnverifiedIdentityStructure.LocalIdentifierStructure)get_store().add_element_user(LOCALIDENTIFIERSTRUCTURE$0);
                return target;
            }
        }
        
        /**
         * Unsets the "LocalIdentifierStructure" element
         */
        public void unsetLocalIdentifierStructure()
        {
            synchronized (monitor())
            {
                check_orphaned();
                get_store().remove_element(LOCALIDENTIFIERSTRUCTURE$0, 0);
            }
        }
        
        /**
         * Gets the "DataElementStructure" element
         */
        public uk.nhs.nhsia.datastandards.ecds.PatientIdentity.UnverifiedIdentityStructure.DataElementStructure getDataElementStructure()
        {
            synchronized (monitor())
            {
                check_orphaned();
                uk.nhs.nhsia.datastandards.ecds.PatientIdentity.UnverifiedIdentityStructure.DataElementStructure target = null;
                target = (uk.nhs.nhsia.datastandards.ecds.PatientIdentity.UnverifiedIdentityStructure.DataElementStructure)get_store().find_element_user(DATAELEMENTSTRUCTURE$2, 0);
                if (target == null)
                {
                    return null;
                }
                return target;
            }
        }
        
        /**
         * True if has "DataElementStructure" element
         */
        public boolean isSetDataElementStructure()
        {
            synchronized (monitor())
            {
                check_orphaned();
                return get_store().count_elements(DATAELEMENTSTRUCTURE$2) != 0;
            }
        }
        
        /**
         * Sets the "DataElementStructure" element
         */
        public void setDataElementStructure(uk.nhs.nhsia.datastandards.ecds.PatientIdentity.UnverifiedIdentityStructure.DataElementStructure dataElementStructure)
        {
            generatedSetterHelperImpl(dataElementStructure, DATAELEMENTSTRUCTURE$2, 0, org.apache.xmlbeans.impl.values.XmlObjectBase.KIND_SETTERHELPER_SINGLETON);
        }
        
        /**
         * Appends and returns a new empty "DataElementStructure" element
         */
        public uk.nhs.nhsia.datastandards.ecds.PatientIdentity.UnverifiedIdentityStructure.DataElementStructure addNewDataElementStructure()
        {
            synchronized (monitor())
            {
                check_orphaned();
                uk.nhs.nhsia.datastandards.ecds.PatientIdentity.UnverifiedIdentityStructure.DataElementStructure target = null;
                target = (uk.nhs.nhsia.datastandards.ecds.PatientIdentity.UnverifiedIdentityStructure.DataElementStructure)get_store().add_element_user(DATAELEMENTSTRUCTURE$2);
                return target;
            }
        }
        
        /**
         * Unsets the "DataElementStructure" element
         */
        public void unsetDataElementStructure()
        {
            synchronized (monitor())
            {
                check_orphaned();
                get_store().remove_element(DATAELEMENTSTRUCTURE$2, 0);
            }
        }
        
        /**
         * Gets the "DataElementStructure2" element
         */
        public uk.nhs.nhsia.datastandards.ecds.PatientIdentity.UnverifiedIdentityStructure.DataElementStructure2 getDataElementStructure2()
        {
            synchronized (monitor())
            {
                check_orphaned();
                uk.nhs.nhsia.datastandards.ecds.PatientIdentity.UnverifiedIdentityStructure.DataElementStructure2 target = null;
                target = (uk.nhs.nhsia.datastandards.ecds.PatientIdentity.UnverifiedIdentityStructure.DataElementStructure2)get_store().find_element_user(DATAELEMENTSTRUCTURE2$4, 0);
                if (target == null)
                {
                    return null;
                }
                return target;
            }
        }
        
        /**
         * True if has "DataElementStructure2" element
         */
        public boolean isSetDataElementStructure2()
        {
            synchronized (monitor())
            {
                check_orphaned();
                return get_store().count_elements(DATAELEMENTSTRUCTURE2$4) != 0;
            }
        }
        
        /**
         * Sets the "DataElementStructure2" element
         */
        public void setDataElementStructure2(uk.nhs.nhsia.datastandards.ecds.PatientIdentity.UnverifiedIdentityStructure.DataElementStructure2 dataElementStructure2)
        {
            generatedSetterHelperImpl(dataElementStructure2, DATAELEMENTSTRUCTURE2$4, 0, org.apache.xmlbeans.impl.values.XmlObjectBase.KIND_SETTERHELPER_SINGLETON);
        }
        
        /**
         * Appends and returns a new empty "DataElementStructure2" element
         */
        public uk.nhs.nhsia.datastandards.ecds.PatientIdentity.UnverifiedIdentityStructure.DataElementStructure2 addNewDataElementStructure2()
        {
            synchronized (monitor())
            {
                check_orphaned();
                uk.nhs.nhsia.datastandards.ecds.PatientIdentity.UnverifiedIdentityStructure.DataElementStructure2 target = null;
                target = (uk.nhs.nhsia.datastandards.ecds.PatientIdentity.UnverifiedIdentityStructure.DataElementStructure2)get_store().add_element_user(DATAELEMENTSTRUCTURE2$4);
                return target;
            }
        }
        
        /**
         * Unsets the "DataElementStructure2" element
         */
        public void unsetDataElementStructure2()
        {
            synchronized (monitor())
            {
                check_orphaned();
                get_store().remove_element(DATAELEMENTSTRUCTURE2$4, 0);
            }
        }
        
        /**
         * Gets the "NHSNumberStatusIndicatorCode" attribute
         */
        public uk.nhs.nhsia.datastandards.ecds.NHSNumberStatusIndicatorCodeUnverifiedType.Enum getNHSNumberStatusIndicatorCode()
        {
            synchronized (monitor())
            {
                check_orphaned();
                org.apache.xmlbeans.SimpleValue target = null;
                target = (org.apache.xmlbeans.SimpleValue)get_store().find_attribute_user(NHSNUMBERSTATUSINDICATORCODE$6);
                if (target == null)
                {
                    return null;
                }
                return (uk.nhs.nhsia.datastandards.ecds.NHSNumberStatusIndicatorCodeUnverifiedType.Enum)target.getEnumValue();
            }
        }
        
        /**
         * Gets (as xml) the "NHSNumberStatusIndicatorCode" attribute
         */
        public uk.nhs.nhsia.datastandards.ecds.NHSNumberStatusIndicatorCodeUnverifiedType xgetNHSNumberStatusIndicatorCode()
        {
            synchronized (monitor())
            {
                check_orphaned();
                uk.nhs.nhsia.datastandards.ecds.NHSNumberStatusIndicatorCodeUnverifiedType target = null;
                target = (uk.nhs.nhsia.datastandards.ecds.NHSNumberStatusIndicatorCodeUnverifiedType)get_store().find_attribute_user(NHSNUMBERSTATUSINDICATORCODE$6);
                return target;
            }
        }
        
        /**
         * Sets the "NHSNumberStatusIndicatorCode" attribute
         */
        public void setNHSNumberStatusIndicatorCode(uk.nhs.nhsia.datastandards.ecds.NHSNumberStatusIndicatorCodeUnverifiedType.Enum nhsNumberStatusIndicatorCode)
        {
            synchronized (monitor())
            {
                check_orphaned();
                org.apache.xmlbeans.SimpleValue target = null;
                target = (org.apache.xmlbeans.SimpleValue)get_store().find_attribute_user(NHSNUMBERSTATUSINDICATORCODE$6);
                if (target == null)
                {
                    target = (org.apache.xmlbeans.SimpleValue)get_store().add_attribute_user(NHSNUMBERSTATUSINDICATORCODE$6);
                }
                target.setEnumValue(nhsNumberStatusIndicatorCode);
            }
        }
        
        /**
         * Sets (as xml) the "NHSNumberStatusIndicatorCode" attribute
         */
        public void xsetNHSNumberStatusIndicatorCode(uk.nhs.nhsia.datastandards.ecds.NHSNumberStatusIndicatorCodeUnverifiedType nhsNumberStatusIndicatorCode)
        {
            synchronized (monitor())
            {
                check_orphaned();
                uk.nhs.nhsia.datastandards.ecds.NHSNumberStatusIndicatorCodeUnverifiedType target = null;
                target = (uk.nhs.nhsia.datastandards.ecds.NHSNumberStatusIndicatorCodeUnverifiedType)get_store().find_attribute_user(NHSNUMBERSTATUSINDICATORCODE$6);
                if (target == null)
                {
                    target = (uk.nhs.nhsia.datastandards.ecds.NHSNumberStatusIndicatorCodeUnverifiedType)get_store().add_attribute_user(NHSNUMBERSTATUSINDICATORCODE$6);
                }
                target.set(nhsNumberStatusIndicatorCode);
            }
        }
        /**
         * An XML LocalIdentifierStructure(@http://www.nhsia.nhs.uk/DataStandards/XMLschema/CDS/ns).
         *
         * This is a complex type.
         */
        public static class LocalIdentifierStructureImpl extends org.apache.xmlbeans.impl.values.XmlComplexContentImpl implements uk.nhs.nhsia.datastandards.ecds.PatientIdentity.UnverifiedIdentityStructure.LocalIdentifierStructure
        {
            private static final long serialVersionUID = 1L;
            
            public LocalIdentifierStructureImpl(org.apache.xmlbeans.SchemaType sType)
            {
                super(sType);
            }
            
            private static final javax.xml.namespace.QName LOCALPATIENTIDENTIFIEREXTENDED$0 = 
                new javax.xml.namespace.QName("http://www.nhsia.nhs.uk/DataStandards/XMLschema/CDS/ns", "LocalPatientIdentifier_Extended");
            private static final javax.xml.namespace.QName ORGANISATIONIDENTIFIERLOCALPATIENTIDENTIFIER$2 = 
                new javax.xml.namespace.QName("http://www.nhsia.nhs.uk/DataStandards/XMLschema/CDS/ns", "OrganisationIdentifier_LocalPatientIdentifier");
            
            
            /**
             * Gets the "LocalPatientIdentifier_Extended" element
             */
            public java.lang.String getLocalPatientIdentifierExtended()
            {
                synchronized (monitor())
                {
                    check_orphaned();
                    org.apache.xmlbeans.SimpleValue target = null;
                    target = (org.apache.xmlbeans.SimpleValue)get_store().find_element_user(LOCALPATIENTIDENTIFIEREXTENDED$0, 0);
                    if (target == null)
                    {
                      return null;
                    }
                    return target.getStringValue();
                }
            }
            
            /**
             * Gets (as xml) the "LocalPatientIdentifier_Extended" element
             */
            public uk.nhs.nhsia.datastandards.ecds.LocalPatientIdentifierECType xgetLocalPatientIdentifierExtended()
            {
                synchronized (monitor())
                {
                    check_orphaned();
                    uk.nhs.nhsia.datastandards.ecds.LocalPatientIdentifierECType target = null;
                    target = (uk.nhs.nhsia.datastandards.ecds.LocalPatientIdentifierECType)get_store().find_element_user(LOCALPATIENTIDENTIFIEREXTENDED$0, 0);
                    return target;
                }
            }
            
            /**
             * Sets the "LocalPatientIdentifier_Extended" element
             */
            public void setLocalPatientIdentifierExtended(java.lang.String localPatientIdentifierExtended)
            {
                synchronized (monitor())
                {
                    check_orphaned();
                    org.apache.xmlbeans.SimpleValue target = null;
                    target = (org.apache.xmlbeans.SimpleValue)get_store().find_element_user(LOCALPATIENTIDENTIFIEREXTENDED$0, 0);
                    if (target == null)
                    {
                      target = (org.apache.xmlbeans.SimpleValue)get_store().add_element_user(LOCALPATIENTIDENTIFIEREXTENDED$0);
                    }
                    target.setStringValue(localPatientIdentifierExtended);
                }
            }
            
            /**
             * Sets (as xml) the "LocalPatientIdentifier_Extended" element
             */
            public void xsetLocalPatientIdentifierExtended(uk.nhs.nhsia.datastandards.ecds.LocalPatientIdentifierECType localPatientIdentifierExtended)
            {
                synchronized (monitor())
                {
                    check_orphaned();
                    uk.nhs.nhsia.datastandards.ecds.LocalPatientIdentifierECType target = null;
                    target = (uk.nhs.nhsia.datastandards.ecds.LocalPatientIdentifierECType)get_store().find_element_user(LOCALPATIENTIDENTIFIEREXTENDED$0, 0);
                    if (target == null)
                    {
                      target = (uk.nhs.nhsia.datastandards.ecds.LocalPatientIdentifierECType)get_store().add_element_user(LOCALPATIENTIDENTIFIEREXTENDED$0);
                    }
                    target.set(localPatientIdentifierExtended);
                }
            }
            
            /**
             * Gets the "OrganisationIdentifier_LocalPatientIdentifier" element
             */
            public java.lang.String getOrganisationIdentifierLocalPatientIdentifier()
            {
                synchronized (monitor())
                {
                    check_orphaned();
                    org.apache.xmlbeans.SimpleValue target = null;
                    target = (org.apache.xmlbeans.SimpleValue)get_store().find_element_user(ORGANISATIONIDENTIFIERLOCALPATIENTIDENTIFIER$2, 0);
                    if (target == null)
                    {
                      return null;
                    }
                    return target.getStringValue();
                }
            }
            
            /**
             * Gets (as xml) the "OrganisationIdentifier_LocalPatientIdentifier" element
             */
            public uk.nhs.nhsia.datastandards.ecds.OrgIdenECType xgetOrganisationIdentifierLocalPatientIdentifier()
            {
                synchronized (monitor())
                {
                    check_orphaned();
                    uk.nhs.nhsia.datastandards.ecds.OrgIdenECType target = null;
                    target = (uk.nhs.nhsia.datastandards.ecds.OrgIdenECType)get_store().find_element_user(ORGANISATIONIDENTIFIERLOCALPATIENTIDENTIFIER$2, 0);
                    return target;
                }
            }
            
            /**
             * Sets the "OrganisationIdentifier_LocalPatientIdentifier" element
             */
            public void setOrganisationIdentifierLocalPatientIdentifier(java.lang.String organisationIdentifierLocalPatientIdentifier)
            {
                synchronized (monitor())
                {
                    check_orphaned();
                    org.apache.xmlbeans.SimpleValue target = null;
                    target = (org.apache.xmlbeans.SimpleValue)get_store().find_element_user(ORGANISATIONIDENTIFIERLOCALPATIENTIDENTIFIER$2, 0);
                    if (target == null)
                    {
                      target = (org.apache.xmlbeans.SimpleValue)get_store().add_element_user(ORGANISATIONIDENTIFIERLOCALPATIENTIDENTIFIER$2);
                    }
                    target.setStringValue(organisationIdentifierLocalPatientIdentifier);
                }
            }
            
            /**
             * Sets (as xml) the "OrganisationIdentifier_LocalPatientIdentifier" element
             */
            public void xsetOrganisationIdentifierLocalPatientIdentifier(uk.nhs.nhsia.datastandards.ecds.OrgIdenECType organisationIdentifierLocalPatientIdentifier)
            {
                synchronized (monitor())
                {
                    check_orphaned();
                    uk.nhs.nhsia.datastandards.ecds.OrgIdenECType target = null;
                    target = (uk.nhs.nhsia.datastandards.ecds.OrgIdenECType)get_store().find_element_user(ORGANISATIONIDENTIFIERLOCALPATIENTIDENTIFIER$2, 0);
                    if (target == null)
                    {
                      target = (uk.nhs.nhsia.datastandards.ecds.OrgIdenECType)get_store().add_element_user(ORGANISATIONIDENTIFIERLOCALPATIENTIDENTIFIER$2);
                    }
                    target.set(organisationIdentifierLocalPatientIdentifier);
                }
            }
        }
        /**
         * An XML DataElementStructure(@http://www.nhsia.nhs.uk/DataStandards/XMLschema/CDS/ns).
         *
         * This is a complex type.
         */
        public static class DataElementStructureImpl extends org.apache.xmlbeans.impl.values.XmlComplexContentImpl implements uk.nhs.nhsia.datastandards.ecds.PatientIdentity.UnverifiedIdentityStructure.DataElementStructure
        {
            private static final long serialVersionUID = 1L;
            
            public DataElementStructureImpl(org.apache.xmlbeans.SchemaType sType)
            {
                super(sType);
            }
            
            private static final javax.xml.namespace.QName NHSNUMBER$0 = 
                new javax.xml.namespace.QName("http://www.nhsia.nhs.uk/DataStandards/XMLschema/CDS/ns", "NHSNumber");
            private static final javax.xml.namespace.QName NHSNUMBERSTATUSINDICATORCODE$2 = 
                new javax.xml.namespace.QName("http://www.nhsia.nhs.uk/DataStandards/XMLschema/CDS/ns", "NHSNumberStatusIndicatorCode");
            private static final javax.xml.namespace.QName PATIENTNAME$4 = 
                new javax.xml.namespace.QName("http://www.nhsia.nhs.uk/DataStandards/XMLschema/CDS/ns", "PatientName");
            private static final javax.xml.namespace.QName PATIENTUSUALADDRESS$6 = 
                new javax.xml.namespace.QName("http://www.nhsia.nhs.uk/DataStandards/XMLschema/CDS/ns", "PatientUsualAddress");
            
            
            /**
             * Gets the "NHSNumber" element
             */
            public java.lang.String getNHSNumber()
            {
                synchronized (monitor())
                {
                    check_orphaned();
                    org.apache.xmlbeans.SimpleValue target = null;
                    target = (org.apache.xmlbeans.SimpleValue)get_store().find_element_user(NHSNUMBER$0, 0);
                    if (target == null)
                    {
                      return null;
                    }
                    return target.getStringValue();
                }
            }
            
            /**
             * Gets (as xml) the "NHSNumber" element
             */
            public uk.nhs.nhsia.datastandards.ecds.NHSNumberType xgetNHSNumber()
            {
                synchronized (monitor())
                {
                    check_orphaned();
                    uk.nhs.nhsia.datastandards.ecds.NHSNumberType target = null;
                    target = (uk.nhs.nhsia.datastandards.ecds.NHSNumberType)get_store().find_element_user(NHSNUMBER$0, 0);
                    return target;
                }
            }
            
            /**
             * True if has "NHSNumber" element
             */
            public boolean isSetNHSNumber()
            {
                synchronized (monitor())
                {
                    check_orphaned();
                    return get_store().count_elements(NHSNUMBER$0) != 0;
                }
            }
            
            /**
             * Sets the "NHSNumber" element
             */
            public void setNHSNumber(java.lang.String nhsNumber)
            {
                synchronized (monitor())
                {
                    check_orphaned();
                    org.apache.xmlbeans.SimpleValue target = null;
                    target = (org.apache.xmlbeans.SimpleValue)get_store().find_element_user(NHSNUMBER$0, 0);
                    if (target == null)
                    {
                      target = (org.apache.xmlbeans.SimpleValue)get_store().add_element_user(NHSNUMBER$0);
                    }
                    target.setStringValue(nhsNumber);
                }
            }
            
            /**
             * Sets (as xml) the "NHSNumber" element
             */
            public void xsetNHSNumber(uk.nhs.nhsia.datastandards.ecds.NHSNumberType nhsNumber)
            {
                synchronized (monitor())
                {
                    check_orphaned();
                    uk.nhs.nhsia.datastandards.ecds.NHSNumberType target = null;
                    target = (uk.nhs.nhsia.datastandards.ecds.NHSNumberType)get_store().find_element_user(NHSNUMBER$0, 0);
                    if (target == null)
                    {
                      target = (uk.nhs.nhsia.datastandards.ecds.NHSNumberType)get_store().add_element_user(NHSNUMBER$0);
                    }
                    target.set(nhsNumber);
                }
            }
            
            /**
             * Unsets the "NHSNumber" element
             */
            public void unsetNHSNumber()
            {
                synchronized (monitor())
                {
                    check_orphaned();
                    get_store().remove_element(NHSNUMBER$0, 0);
                }
            }
            
            /**
             * Gets the "NHSNumberStatusIndicatorCode" element
             */
            public uk.nhs.nhsia.datastandards.ecds.NHSNumberStatusIndicatorCodeUnverifiedType.Enum getNHSNumberStatusIndicatorCode()
            {
                synchronized (monitor())
                {
                    check_orphaned();
                    org.apache.xmlbeans.SimpleValue target = null;
                    target = (org.apache.xmlbeans.SimpleValue)get_store().find_element_user(NHSNUMBERSTATUSINDICATORCODE$2, 0);
                    if (target == null)
                    {
                      return null;
                    }
                    return (uk.nhs.nhsia.datastandards.ecds.NHSNumberStatusIndicatorCodeUnverifiedType.Enum)target.getEnumValue();
                }
            }
            
            /**
             * Gets (as xml) the "NHSNumberStatusIndicatorCode" element
             */
            public uk.nhs.nhsia.datastandards.ecds.NHSNumberStatusIndicatorCodeUnverifiedType xgetNHSNumberStatusIndicatorCode()
            {
                synchronized (monitor())
                {
                    check_orphaned();
                    uk.nhs.nhsia.datastandards.ecds.NHSNumberStatusIndicatorCodeUnverifiedType target = null;
                    target = (uk.nhs.nhsia.datastandards.ecds.NHSNumberStatusIndicatorCodeUnverifiedType)get_store().find_element_user(NHSNUMBERSTATUSINDICATORCODE$2, 0);
                    return target;
                }
            }
            
            /**
             * Sets the "NHSNumberStatusIndicatorCode" element
             */
            public void setNHSNumberStatusIndicatorCode(uk.nhs.nhsia.datastandards.ecds.NHSNumberStatusIndicatorCodeUnverifiedType.Enum nhsNumberStatusIndicatorCode)
            {
                synchronized (monitor())
                {
                    check_orphaned();
                    org.apache.xmlbeans.SimpleValue target = null;
                    target = (org.apache.xmlbeans.SimpleValue)get_store().find_element_user(NHSNUMBERSTATUSINDICATORCODE$2, 0);
                    if (target == null)
                    {
                      target = (org.apache.xmlbeans.SimpleValue)get_store().add_element_user(NHSNUMBERSTATUSINDICATORCODE$2);
                    }
                    target.setEnumValue(nhsNumberStatusIndicatorCode);
                }
            }
            
            /**
             * Sets (as xml) the "NHSNumberStatusIndicatorCode" element
             */
            public void xsetNHSNumberStatusIndicatorCode(uk.nhs.nhsia.datastandards.ecds.NHSNumberStatusIndicatorCodeUnverifiedType nhsNumberStatusIndicatorCode)
            {
                synchronized (monitor())
                {
                    check_orphaned();
                    uk.nhs.nhsia.datastandards.ecds.NHSNumberStatusIndicatorCodeUnverifiedType target = null;
                    target = (uk.nhs.nhsia.datastandards.ecds.NHSNumberStatusIndicatorCodeUnverifiedType)get_store().find_element_user(NHSNUMBERSTATUSINDICATORCODE$2, 0);
                    if (target == null)
                    {
                      target = (uk.nhs.nhsia.datastandards.ecds.NHSNumberStatusIndicatorCodeUnverifiedType)get_store().add_element_user(NHSNUMBERSTATUSINDICATORCODE$2);
                    }
                    target.set(nhsNumberStatusIndicatorCode);
                }
            }
            
            /**
             * Gets the "PatientName" element
             */
            public uk.nhs.nhsia.datastandards.ecds.PersonNameStructure getPatientName()
            {
                synchronized (monitor())
                {
                    check_orphaned();
                    uk.nhs.nhsia.datastandards.ecds.PersonNameStructure target = null;
                    target = (uk.nhs.nhsia.datastandards.ecds.PersonNameStructure)get_store().find_element_user(PATIENTNAME$4, 0);
                    if (target == null)
                    {
                      return null;
                    }
                    return target;
                }
            }
            
            /**
             * True if has "PatientName" element
             */
            public boolean isSetPatientName()
            {
                synchronized (monitor())
                {
                    check_orphaned();
                    return get_store().count_elements(PATIENTNAME$4) != 0;
                }
            }
            
            /**
             * Sets the "PatientName" element
             */
            public void setPatientName(uk.nhs.nhsia.datastandards.ecds.PersonNameStructure patientName)
            {
                generatedSetterHelperImpl(patientName, PATIENTNAME$4, 0, org.apache.xmlbeans.impl.values.XmlObjectBase.KIND_SETTERHELPER_SINGLETON);
            }
            
            /**
             * Appends and returns a new empty "PatientName" element
             */
            public uk.nhs.nhsia.datastandards.ecds.PersonNameStructure addNewPatientName()
            {
                synchronized (monitor())
                {
                    check_orphaned();
                    uk.nhs.nhsia.datastandards.ecds.PersonNameStructure target = null;
                    target = (uk.nhs.nhsia.datastandards.ecds.PersonNameStructure)get_store().add_element_user(PATIENTNAME$4);
                    return target;
                }
            }
            
            /**
             * Unsets the "PatientName" element
             */
            public void unsetPatientName()
            {
                synchronized (monitor())
                {
                    check_orphaned();
                    get_store().remove_element(PATIENTNAME$4, 0);
                }
            }
            
            /**
             * Gets the "PatientUsualAddress" element
             */
            public uk.nhs.nhsia.datastandards.ecds.AddressStructure getPatientUsualAddress()
            {
                synchronized (monitor())
                {
                    check_orphaned();
                    uk.nhs.nhsia.datastandards.ecds.AddressStructure target = null;
                    target = (uk.nhs.nhsia.datastandards.ecds.AddressStructure)get_store().find_element_user(PATIENTUSUALADDRESS$6, 0);
                    if (target == null)
                    {
                      return null;
                    }
                    return target;
                }
            }
            
            /**
             * True if has "PatientUsualAddress" element
             */
            public boolean isSetPatientUsualAddress()
            {
                synchronized (monitor())
                {
                    check_orphaned();
                    return get_store().count_elements(PATIENTUSUALADDRESS$6) != 0;
                }
            }
            
            /**
             * Sets the "PatientUsualAddress" element
             */
            public void setPatientUsualAddress(uk.nhs.nhsia.datastandards.ecds.AddressStructure patientUsualAddress)
            {
                generatedSetterHelperImpl(patientUsualAddress, PATIENTUSUALADDRESS$6, 0, org.apache.xmlbeans.impl.values.XmlObjectBase.KIND_SETTERHELPER_SINGLETON);
            }
            
            /**
             * Appends and returns a new empty "PatientUsualAddress" element
             */
            public uk.nhs.nhsia.datastandards.ecds.AddressStructure addNewPatientUsualAddress()
            {
                synchronized (monitor())
                {
                    check_orphaned();
                    uk.nhs.nhsia.datastandards.ecds.AddressStructure target = null;
                    target = (uk.nhs.nhsia.datastandards.ecds.AddressStructure)get_store().add_element_user(PATIENTUSUALADDRESS$6);
                    return target;
                }
            }
            
            /**
             * Unsets the "PatientUsualAddress" element
             */
            public void unsetPatientUsualAddress()
            {
                synchronized (monitor())
                {
                    check_orphaned();
                    get_store().remove_element(PATIENTUSUALADDRESS$6, 0);
                }
            }
        }
        /**
         * An XML DataElementStructure2(@http://www.nhsia.nhs.uk/DataStandards/XMLschema/CDS/ns).
         *
         * This is a complex type.
         */
        public static class DataElementStructure2Impl extends org.apache.xmlbeans.impl.values.XmlComplexContentImpl implements uk.nhs.nhsia.datastandards.ecds.PatientIdentity.UnverifiedIdentityStructure.DataElementStructure2
        {
            private static final long serialVersionUID = 1L;
            
            public DataElementStructure2Impl(org.apache.xmlbeans.SchemaType sType)
            {
                super(sType);
            }
            
            private static final javax.xml.namespace.QName POSTCODEOFUSUALADDRESS$0 = 
                new javax.xml.namespace.QName("http://www.nhsia.nhs.uk/DataStandards/XMLschema/CDS/ns", "PostcodeOfUsualAddress");
            private static final javax.xml.namespace.QName ORGANISATIONIDENTIFIERRESIDENCERESPONSIBILITY$2 = 
                new javax.xml.namespace.QName("http://www.nhsia.nhs.uk/DataStandards/XMLschema/CDS/ns", "OrganisationIdentifier_ResidenceResponsibility");
            private static final javax.xml.namespace.QName PERSONBIRTHDATE$4 = 
                new javax.xml.namespace.QName("http://www.nhsia.nhs.uk/DataStandards/XMLschema/CDS/ns", "PersonBirthDate");
            
            
            /**
             * Gets the "PostcodeOfUsualAddress" element
             */
            public java.lang.String getPostcodeOfUsualAddress()
            {
                synchronized (monitor())
                {
                    check_orphaned();
                    org.apache.xmlbeans.SimpleValue target = null;
                    target = (org.apache.xmlbeans.SimpleValue)get_store().find_element_user(POSTCODEOFUSUALADDRESS$0, 0);
                    if (target == null)
                    {
                      return null;
                    }
                    return target.getStringValue();
                }
            }
            
            /**
             * Gets (as xml) the "PostcodeOfUsualAddress" element
             */
            public uk.nhs.nhsia.datastandards.ecds.PostcodeOfUsualAddressType xgetPostcodeOfUsualAddress()
            {
                synchronized (monitor())
                {
                    check_orphaned();
                    uk.nhs.nhsia.datastandards.ecds.PostcodeOfUsualAddressType target = null;
                    target = (uk.nhs.nhsia.datastandards.ecds.PostcodeOfUsualAddressType)get_store().find_element_user(POSTCODEOFUSUALADDRESS$0, 0);
                    return target;
                }
            }
            
            /**
             * True if has "PostcodeOfUsualAddress" element
             */
            public boolean isSetPostcodeOfUsualAddress()
            {
                synchronized (monitor())
                {
                    check_orphaned();
                    return get_store().count_elements(POSTCODEOFUSUALADDRESS$0) != 0;
                }
            }
            
            /**
             * Sets the "PostcodeOfUsualAddress" element
             */
            public void setPostcodeOfUsualAddress(java.lang.String postcodeOfUsualAddress)
            {
                synchronized (monitor())
                {
                    check_orphaned();
                    org.apache.xmlbeans.SimpleValue target = null;
                    target = (org.apache.xmlbeans.SimpleValue)get_store().find_element_user(POSTCODEOFUSUALADDRESS$0, 0);
                    if (target == null)
                    {
                      target = (org.apache.xmlbeans.SimpleValue)get_store().add_element_user(POSTCODEOFUSUALADDRESS$0);
                    }
                    target.setStringValue(postcodeOfUsualAddress);
                }
            }
            
            /**
             * Sets (as xml) the "PostcodeOfUsualAddress" element
             */
            public void xsetPostcodeOfUsualAddress(uk.nhs.nhsia.datastandards.ecds.PostcodeOfUsualAddressType postcodeOfUsualAddress)
            {
                synchronized (monitor())
                {
                    check_orphaned();
                    uk.nhs.nhsia.datastandards.ecds.PostcodeOfUsualAddressType target = null;
                    target = (uk.nhs.nhsia.datastandards.ecds.PostcodeOfUsualAddressType)get_store().find_element_user(POSTCODEOFUSUALADDRESS$0, 0);
                    if (target == null)
                    {
                      target = (uk.nhs.nhsia.datastandards.ecds.PostcodeOfUsualAddressType)get_store().add_element_user(POSTCODEOFUSUALADDRESS$0);
                    }
                    target.set(postcodeOfUsualAddress);
                }
            }
            
            /**
             * Unsets the "PostcodeOfUsualAddress" element
             */
            public void unsetPostcodeOfUsualAddress()
            {
                synchronized (monitor())
                {
                    check_orphaned();
                    get_store().remove_element(POSTCODEOFUSUALADDRESS$0, 0);
                }
            }
            
            /**
             * Gets the "OrganisationIdentifier_ResidenceResponsibility" element
             */
            public java.lang.String getOrganisationIdentifierResidenceResponsibility()
            {
                synchronized (monitor())
                {
                    check_orphaned();
                    org.apache.xmlbeans.SimpleValue target = null;
                    target = (org.apache.xmlbeans.SimpleValue)get_store().find_element_user(ORGANISATIONIDENTIFIERRESIDENCERESPONSIBILITY$2, 0);
                    if (target == null)
                    {
                      return null;
                    }
                    return target.getStringValue();
                }
            }
            
            /**
             * Gets (as xml) the "OrganisationIdentifier_ResidenceResponsibility" element
             */
            public uk.nhs.nhsia.datastandards.ecds.OrgIdenECType xgetOrganisationIdentifierResidenceResponsibility()
            {
                synchronized (monitor())
                {
                    check_orphaned();
                    uk.nhs.nhsia.datastandards.ecds.OrgIdenECType target = null;
                    target = (uk.nhs.nhsia.datastandards.ecds.OrgIdenECType)get_store().find_element_user(ORGANISATIONIDENTIFIERRESIDENCERESPONSIBILITY$2, 0);
                    return target;
                }
            }
            
            /**
             * True if has "OrganisationIdentifier_ResidenceResponsibility" element
             */
            public boolean isSetOrganisationIdentifierResidenceResponsibility()
            {
                synchronized (monitor())
                {
                    check_orphaned();
                    return get_store().count_elements(ORGANISATIONIDENTIFIERRESIDENCERESPONSIBILITY$2) != 0;
                }
            }
            
            /**
             * Sets the "OrganisationIdentifier_ResidenceResponsibility" element
             */
            public void setOrganisationIdentifierResidenceResponsibility(java.lang.String organisationIdentifierResidenceResponsibility)
            {
                synchronized (monitor())
                {
                    check_orphaned();
                    org.apache.xmlbeans.SimpleValue target = null;
                    target = (org.apache.xmlbeans.SimpleValue)get_store().find_element_user(ORGANISATIONIDENTIFIERRESIDENCERESPONSIBILITY$2, 0);
                    if (target == null)
                    {
                      target = (org.apache.xmlbeans.SimpleValue)get_store().add_element_user(ORGANISATIONIDENTIFIERRESIDENCERESPONSIBILITY$2);
                    }
                    target.setStringValue(organisationIdentifierResidenceResponsibility);
                }
            }
            
            /**
             * Sets (as xml) the "OrganisationIdentifier_ResidenceResponsibility" element
             */
            public void xsetOrganisationIdentifierResidenceResponsibility(uk.nhs.nhsia.datastandards.ecds.OrgIdenECType organisationIdentifierResidenceResponsibility)
            {
                synchronized (monitor())
                {
                    check_orphaned();
                    uk.nhs.nhsia.datastandards.ecds.OrgIdenECType target = null;
                    target = (uk.nhs.nhsia.datastandards.ecds.OrgIdenECType)get_store().find_element_user(ORGANISATIONIDENTIFIERRESIDENCERESPONSIBILITY$2, 0);
                    if (target == null)
                    {
                      target = (uk.nhs.nhsia.datastandards.ecds.OrgIdenECType)get_store().add_element_user(ORGANISATIONIDENTIFIERRESIDENCERESPONSIBILITY$2);
                    }
                    target.set(organisationIdentifierResidenceResponsibility);
                }
            }
            
            /**
             * Unsets the "OrganisationIdentifier_ResidenceResponsibility" element
             */
            public void unsetOrganisationIdentifierResidenceResponsibility()
            {
                synchronized (monitor())
                {
                    check_orphaned();
                    get_store().remove_element(ORGANISATIONIDENTIFIERRESIDENCERESPONSIBILITY$2, 0);
                }
            }
            
            /**
             * Gets the "PersonBirthDate" element
             */
            public java.util.Calendar getPersonBirthDate()
            {
                synchronized (monitor())
                {
                    check_orphaned();
                    org.apache.xmlbeans.SimpleValue target = null;
                    target = (org.apache.xmlbeans.SimpleValue)get_store().find_element_user(PERSONBIRTHDATE$4, 0);
                    if (target == null)
                    {
                      return null;
                    }
                    return target.getCalendarValue();
                }
            }
            
            /**
             * Gets (as xml) the "PersonBirthDate" element
             */
            public uk.nhs.nhsia.datastandards.ecds.PersonBirthDateType xgetPersonBirthDate()
            {
                synchronized (monitor())
                {
                    check_orphaned();
                    uk.nhs.nhsia.datastandards.ecds.PersonBirthDateType target = null;
                    target = (uk.nhs.nhsia.datastandards.ecds.PersonBirthDateType)get_store().find_element_user(PERSONBIRTHDATE$4, 0);
                    return target;
                }
            }
            
            /**
             * True if has "PersonBirthDate" element
             */
            public boolean isSetPersonBirthDate()
            {
                synchronized (monitor())
                {
                    check_orphaned();
                    return get_store().count_elements(PERSONBIRTHDATE$4) != 0;
                }
            }
            
            /**
             * Sets the "PersonBirthDate" element
             */
            public void setPersonBirthDate(java.util.Calendar personBirthDate)
            {
                synchronized (monitor())
                {
                    check_orphaned();
                    org.apache.xmlbeans.SimpleValue target = null;
                    target = (org.apache.xmlbeans.SimpleValue)get_store().find_element_user(PERSONBIRTHDATE$4, 0);
                    if (target == null)
                    {
                      target = (org.apache.xmlbeans.SimpleValue)get_store().add_element_user(PERSONBIRTHDATE$4);
                    }
                    target.setCalendarValue(personBirthDate);
                }
            }
            
            /**
             * Sets (as xml) the "PersonBirthDate" element
             */
            public void xsetPersonBirthDate(uk.nhs.nhsia.datastandards.ecds.PersonBirthDateType personBirthDate)
            {
                synchronized (monitor())
                {
                    check_orphaned();
                    uk.nhs.nhsia.datastandards.ecds.PersonBirthDateType target = null;
                    target = (uk.nhs.nhsia.datastandards.ecds.PersonBirthDateType)get_store().find_element_user(PERSONBIRTHDATE$4, 0);
                    if (target == null)
                    {
                      target = (uk.nhs.nhsia.datastandards.ecds.PersonBirthDateType)get_store().add_element_user(PERSONBIRTHDATE$4);
                    }
                    target.set(personBirthDate);
                }
            }
            
            /**
             * Unsets the "PersonBirthDate" element
             */
            public void unsetPersonBirthDate()
            {
                synchronized (monitor())
                {
                    check_orphaned();
                    get_store().remove_element(PERSONBIRTHDATE$4, 0);
                }
            }
        }
    }
}
