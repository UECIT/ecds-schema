/*
 * XML Type:  PatientIdentity_Birth_Structure
 * Namespace: http://www.nhsia.nhs.uk/DataStandards/XMLschema/CDS/ns
 * Java type: uk.nhs.nhsia.datastandards.ecds.PatientIdentityBirthStructure
 *
 * Automatically generated - do not modify.
 */
package uk.nhs.nhsia.datastandards.ecds.impl;
/**
 * An XML PatientIdentity_Birth_Structure(@http://www.nhsia.nhs.uk/DataStandards/XMLschema/CDS/ns).
 *
 * This is a complex type.
 */
public class PatientIdentityBirthStructureImpl extends org.apache.xmlbeans.impl.values.XmlComplexContentImpl implements uk.nhs.nhsia.datastandards.ecds.PatientIdentityBirthStructure
{
    private static final long serialVersionUID = 1L;
    
    public PatientIdentityBirthStructureImpl(org.apache.xmlbeans.SchemaType sType)
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
    public uk.nhs.nhsia.datastandards.ecds.PatientIdentityBirthStructure.WithheldIdentityStructure getWithheldIdentityStructure()
    {
        synchronized (monitor())
        {
            check_orphaned();
            uk.nhs.nhsia.datastandards.ecds.PatientIdentityBirthStructure.WithheldIdentityStructure target = null;
            target = (uk.nhs.nhsia.datastandards.ecds.PatientIdentityBirthStructure.WithheldIdentityStructure)get_store().find_element_user(WITHHELDIDENTITYSTRUCTURE$0, 0);
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
    public void setWithheldIdentityStructure(uk.nhs.nhsia.datastandards.ecds.PatientIdentityBirthStructure.WithheldIdentityStructure withheldIdentityStructure)
    {
        generatedSetterHelperImpl(withheldIdentityStructure, WITHHELDIDENTITYSTRUCTURE$0, 0, org.apache.xmlbeans.impl.values.XmlObjectBase.KIND_SETTERHELPER_SINGLETON);
    }
    
    /**
     * Appends and returns a new empty "WithheldIdentity_Structure" element
     */
    public uk.nhs.nhsia.datastandards.ecds.PatientIdentityBirthStructure.WithheldIdentityStructure addNewWithheldIdentityStructure()
    {
        synchronized (monitor())
        {
            check_orphaned();
            uk.nhs.nhsia.datastandards.ecds.PatientIdentityBirthStructure.WithheldIdentityStructure target = null;
            target = (uk.nhs.nhsia.datastandards.ecds.PatientIdentityBirthStructure.WithheldIdentityStructure)get_store().add_element_user(WITHHELDIDENTITYSTRUCTURE$0);
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
    public uk.nhs.nhsia.datastandards.ecds.PatientIdentityBirthStructure.VerifiedIdentityStructure getVerifiedIdentityStructure()
    {
        synchronized (monitor())
        {
            check_orphaned();
            uk.nhs.nhsia.datastandards.ecds.PatientIdentityBirthStructure.VerifiedIdentityStructure target = null;
            target = (uk.nhs.nhsia.datastandards.ecds.PatientIdentityBirthStructure.VerifiedIdentityStructure)get_store().find_element_user(VERIFIEDIDENTITYSTRUCTURE$2, 0);
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
    public void setVerifiedIdentityStructure(uk.nhs.nhsia.datastandards.ecds.PatientIdentityBirthStructure.VerifiedIdentityStructure verifiedIdentityStructure)
    {
        generatedSetterHelperImpl(verifiedIdentityStructure, VERIFIEDIDENTITYSTRUCTURE$2, 0, org.apache.xmlbeans.impl.values.XmlObjectBase.KIND_SETTERHELPER_SINGLETON);
    }
    
    /**
     * Appends and returns a new empty "VerifiedIdentity_Structure" element
     */
    public uk.nhs.nhsia.datastandards.ecds.PatientIdentityBirthStructure.VerifiedIdentityStructure addNewVerifiedIdentityStructure()
    {
        synchronized (monitor())
        {
            check_orphaned();
            uk.nhs.nhsia.datastandards.ecds.PatientIdentityBirthStructure.VerifiedIdentityStructure target = null;
            target = (uk.nhs.nhsia.datastandards.ecds.PatientIdentityBirthStructure.VerifiedIdentityStructure)get_store().add_element_user(VERIFIEDIDENTITYSTRUCTURE$2);
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
    public uk.nhs.nhsia.datastandards.ecds.PatientIdentityBirthStructure.UnverifiedIdentityStructure getUnverifiedIdentityStructure()
    {
        synchronized (monitor())
        {
            check_orphaned();
            uk.nhs.nhsia.datastandards.ecds.PatientIdentityBirthStructure.UnverifiedIdentityStructure target = null;
            target = (uk.nhs.nhsia.datastandards.ecds.PatientIdentityBirthStructure.UnverifiedIdentityStructure)get_store().find_element_user(UNVERIFIEDIDENTITYSTRUCTURE$4, 0);
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
    public void setUnverifiedIdentityStructure(uk.nhs.nhsia.datastandards.ecds.PatientIdentityBirthStructure.UnverifiedIdentityStructure unverifiedIdentityStructure)
    {
        generatedSetterHelperImpl(unverifiedIdentityStructure, UNVERIFIEDIDENTITYSTRUCTURE$4, 0, org.apache.xmlbeans.impl.values.XmlObjectBase.KIND_SETTERHELPER_SINGLETON);
    }
    
    /**
     * Appends and returns a new empty "UnverifiedIdentity_Structure" element
     */
    public uk.nhs.nhsia.datastandards.ecds.PatientIdentityBirthStructure.UnverifiedIdentityStructure addNewUnverifiedIdentityStructure()
    {
        synchronized (monitor())
        {
            check_orphaned();
            uk.nhs.nhsia.datastandards.ecds.PatientIdentityBirthStructure.UnverifiedIdentityStructure target = null;
            target = (uk.nhs.nhsia.datastandards.ecds.PatientIdentityBirthStructure.UnverifiedIdentityStructure)get_store().add_element_user(UNVERIFIEDIDENTITYSTRUCTURE$4);
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
    public static class WithheldIdentityStructureImpl extends org.apache.xmlbeans.impl.values.XmlComplexContentImpl implements uk.nhs.nhsia.datastandards.ecds.PatientIdentityBirthStructure.WithheldIdentityStructure
    {
        private static final long serialVersionUID = 1L;
        
        public WithheldIdentityStructureImpl(org.apache.xmlbeans.SchemaType sType)
        {
            super(sType);
        }
        
        private static final javax.xml.namespace.QName NHSNUMBERSTATUSINDICATORCODE$0 = 
            new javax.xml.namespace.QName("http://www.nhsia.nhs.uk/DataStandards/XMLschema/CDS/ns", "NHSNumberStatusIndicatorCode");
        private static final javax.xml.namespace.QName PERSONBIRTHDATE$2 = 
            new javax.xml.namespace.QName("http://www.nhsia.nhs.uk/DataStandards/XMLschema/CDS/ns", "PersonBirthDate");
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
         * Gets the "PersonBirthDate" element
         */
        public java.util.Calendar getPersonBirthDate()
        {
            synchronized (monitor())
            {
                check_orphaned();
                org.apache.xmlbeans.SimpleValue target = null;
                target = (org.apache.xmlbeans.SimpleValue)get_store().find_element_user(PERSONBIRTHDATE$2, 0);
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
                target = (uk.nhs.nhsia.datastandards.ecds.PersonBirthDateType)get_store().find_element_user(PERSONBIRTHDATE$2, 0);
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
                return get_store().count_elements(PERSONBIRTHDATE$2) != 0;
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
                target = (org.apache.xmlbeans.SimpleValue)get_store().find_element_user(PERSONBIRTHDATE$2, 0);
                if (target == null)
                {
                    target = (org.apache.xmlbeans.SimpleValue)get_store().add_element_user(PERSONBIRTHDATE$2);
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
                target = (uk.nhs.nhsia.datastandards.ecds.PersonBirthDateType)get_store().find_element_user(PERSONBIRTHDATE$2, 0);
                if (target == null)
                {
                    target = (uk.nhs.nhsia.datastandards.ecds.PersonBirthDateType)get_store().add_element_user(PERSONBIRTHDATE$2);
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
                get_store().remove_element(PERSONBIRTHDATE$2, 0);
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
    public static class VerifiedIdentityStructureImpl extends org.apache.xmlbeans.impl.values.XmlComplexContentImpl implements uk.nhs.nhsia.datastandards.ecds.PatientIdentityBirthStructure.VerifiedIdentityStructure
    {
        private static final long serialVersionUID = 1L;
        
        public VerifiedIdentityStructureImpl(org.apache.xmlbeans.SchemaType sType)
        {
            super(sType);
        }
        
        private static final javax.xml.namespace.QName LOCALPATIENTIDENTIFIER$0 = 
            new javax.xml.namespace.QName("http://www.nhsia.nhs.uk/DataStandards/XMLschema/CDS/ns", "LocalPatientIdentifier");
        private static final javax.xml.namespace.QName ORGANISATIONCODELOCALPATIENTIDENTIFIER$2 = 
            new javax.xml.namespace.QName("http://www.nhsia.nhs.uk/DataStandards/XMLschema/CDS/ns", "OrganisationCode_LocalPatientIdentifier");
        private static final javax.xml.namespace.QName NHSNUMBER$4 = 
            new javax.xml.namespace.QName("http://www.nhsia.nhs.uk/DataStandards/XMLschema/CDS/ns", "NHSNumber");
        private static final javax.xml.namespace.QName NHSNUMBERSTATUSINDICATORCODE$6 = 
            new javax.xml.namespace.QName("http://www.nhsia.nhs.uk/DataStandards/XMLschema/CDS/ns", "NHSNumberStatusIndicatorCode");
        private static final javax.xml.namespace.QName PERSONBIRTHDATE$8 = 
            new javax.xml.namespace.QName("http://www.nhsia.nhs.uk/DataStandards/XMLschema/CDS/ns", "PersonBirthDate");
        private static final javax.xml.namespace.QName NHSNUMBERSTATUSINDICATORCODE2$10 = 
            new javax.xml.namespace.QName("", "NHSNumberStatusIndicatorCode");
        
        
        /**
         * Gets the "LocalPatientIdentifier" element
         */
        public java.lang.String getLocalPatientIdentifier()
        {
            synchronized (monitor())
            {
                check_orphaned();
                org.apache.xmlbeans.SimpleValue target = null;
                target = (org.apache.xmlbeans.SimpleValue)get_store().find_element_user(LOCALPATIENTIDENTIFIER$0, 0);
                if (target == null)
                {
                    return null;
                }
                return target.getStringValue();
            }
        }
        
        /**
         * Gets (as xml) the "LocalPatientIdentifier" element
         */
        public uk.nhs.nhsia.datastandards.ecds.LocalPatientIdentifierType xgetLocalPatientIdentifier()
        {
            synchronized (monitor())
            {
                check_orphaned();
                uk.nhs.nhsia.datastandards.ecds.LocalPatientIdentifierType target = null;
                target = (uk.nhs.nhsia.datastandards.ecds.LocalPatientIdentifierType)get_store().find_element_user(LOCALPATIENTIDENTIFIER$0, 0);
                return target;
            }
        }
        
        /**
         * True if has "LocalPatientIdentifier" element
         */
        public boolean isSetLocalPatientIdentifier()
        {
            synchronized (monitor())
            {
                check_orphaned();
                return get_store().count_elements(LOCALPATIENTIDENTIFIER$0) != 0;
            }
        }
        
        /**
         * Sets the "LocalPatientIdentifier" element
         */
        public void setLocalPatientIdentifier(java.lang.String localPatientIdentifier)
        {
            synchronized (monitor())
            {
                check_orphaned();
                org.apache.xmlbeans.SimpleValue target = null;
                target = (org.apache.xmlbeans.SimpleValue)get_store().find_element_user(LOCALPATIENTIDENTIFIER$0, 0);
                if (target == null)
                {
                    target = (org.apache.xmlbeans.SimpleValue)get_store().add_element_user(LOCALPATIENTIDENTIFIER$0);
                }
                target.setStringValue(localPatientIdentifier);
            }
        }
        
        /**
         * Sets (as xml) the "LocalPatientIdentifier" element
         */
        public void xsetLocalPatientIdentifier(uk.nhs.nhsia.datastandards.ecds.LocalPatientIdentifierType localPatientIdentifier)
        {
            synchronized (monitor())
            {
                check_orphaned();
                uk.nhs.nhsia.datastandards.ecds.LocalPatientIdentifierType target = null;
                target = (uk.nhs.nhsia.datastandards.ecds.LocalPatientIdentifierType)get_store().find_element_user(LOCALPATIENTIDENTIFIER$0, 0);
                if (target == null)
                {
                    target = (uk.nhs.nhsia.datastandards.ecds.LocalPatientIdentifierType)get_store().add_element_user(LOCALPATIENTIDENTIFIER$0);
                }
                target.set(localPatientIdentifier);
            }
        }
        
        /**
         * Unsets the "LocalPatientIdentifier" element
         */
        public void unsetLocalPatientIdentifier()
        {
            synchronized (monitor())
            {
                check_orphaned();
                get_store().remove_element(LOCALPATIENTIDENTIFIER$0, 0);
            }
        }
        
        /**
         * Gets the "OrganisationCode_LocalPatientIdentifier" element
         */
        public java.lang.String getOrganisationCodeLocalPatientIdentifier()
        {
            synchronized (monitor())
            {
                check_orphaned();
                org.apache.xmlbeans.SimpleValue target = null;
                target = (org.apache.xmlbeans.SimpleValue)get_store().find_element_user(ORGANISATIONCODELOCALPATIENTIDENTIFIER$2, 0);
                if (target == null)
                {
                    return null;
                }
                return target.getStringValue();
            }
        }
        
        /**
         * Gets (as xml) the "OrganisationCode_LocalPatientIdentifier" element
         */
        public uk.nhs.nhsia.datastandards.ecds.OrganisationCodeType xgetOrganisationCodeLocalPatientIdentifier()
        {
            synchronized (monitor())
            {
                check_orphaned();
                uk.nhs.nhsia.datastandards.ecds.OrganisationCodeType target = null;
                target = (uk.nhs.nhsia.datastandards.ecds.OrganisationCodeType)get_store().find_element_user(ORGANISATIONCODELOCALPATIENTIDENTIFIER$2, 0);
                return target;
            }
        }
        
        /**
         * True if has "OrganisationCode_LocalPatientIdentifier" element
         */
        public boolean isSetOrganisationCodeLocalPatientIdentifier()
        {
            synchronized (monitor())
            {
                check_orphaned();
                return get_store().count_elements(ORGANISATIONCODELOCALPATIENTIDENTIFIER$2) != 0;
            }
        }
        
        /**
         * Sets the "OrganisationCode_LocalPatientIdentifier" element
         */
        public void setOrganisationCodeLocalPatientIdentifier(java.lang.String organisationCodeLocalPatientIdentifier)
        {
            synchronized (monitor())
            {
                check_orphaned();
                org.apache.xmlbeans.SimpleValue target = null;
                target = (org.apache.xmlbeans.SimpleValue)get_store().find_element_user(ORGANISATIONCODELOCALPATIENTIDENTIFIER$2, 0);
                if (target == null)
                {
                    target = (org.apache.xmlbeans.SimpleValue)get_store().add_element_user(ORGANISATIONCODELOCALPATIENTIDENTIFIER$2);
                }
                target.setStringValue(organisationCodeLocalPatientIdentifier);
            }
        }
        
        /**
         * Sets (as xml) the "OrganisationCode_LocalPatientIdentifier" element
         */
        public void xsetOrganisationCodeLocalPatientIdentifier(uk.nhs.nhsia.datastandards.ecds.OrganisationCodeType organisationCodeLocalPatientIdentifier)
        {
            synchronized (monitor())
            {
                check_orphaned();
                uk.nhs.nhsia.datastandards.ecds.OrganisationCodeType target = null;
                target = (uk.nhs.nhsia.datastandards.ecds.OrganisationCodeType)get_store().find_element_user(ORGANISATIONCODELOCALPATIENTIDENTIFIER$2, 0);
                if (target == null)
                {
                    target = (uk.nhs.nhsia.datastandards.ecds.OrganisationCodeType)get_store().add_element_user(ORGANISATIONCODELOCALPATIENTIDENTIFIER$2);
                }
                target.set(organisationCodeLocalPatientIdentifier);
            }
        }
        
        /**
         * Unsets the "OrganisationCode_LocalPatientIdentifier" element
         */
        public void unsetOrganisationCodeLocalPatientIdentifier()
        {
            synchronized (monitor())
            {
                check_orphaned();
                get_store().remove_element(ORGANISATIONCODELOCALPATIENTIDENTIFIER$2, 0);
            }
        }
        
        /**
         * Gets the "NHSNumber" element
         */
        public java.lang.String getNHSNumber()
        {
            synchronized (monitor())
            {
                check_orphaned();
                org.apache.xmlbeans.SimpleValue target = null;
                target = (org.apache.xmlbeans.SimpleValue)get_store().find_element_user(NHSNUMBER$4, 0);
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
                target = (uk.nhs.nhsia.datastandards.ecds.NHSNumberType)get_store().find_element_user(NHSNUMBER$4, 0);
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
                target = (org.apache.xmlbeans.SimpleValue)get_store().find_element_user(NHSNUMBER$4, 0);
                if (target == null)
                {
                    target = (org.apache.xmlbeans.SimpleValue)get_store().add_element_user(NHSNUMBER$4);
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
                target = (uk.nhs.nhsia.datastandards.ecds.NHSNumberType)get_store().find_element_user(NHSNUMBER$4, 0);
                if (target == null)
                {
                    target = (uk.nhs.nhsia.datastandards.ecds.NHSNumberType)get_store().add_element_user(NHSNUMBER$4);
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
                target = (org.apache.xmlbeans.SimpleValue)get_store().find_element_user(NHSNUMBERSTATUSINDICATORCODE$6, 0);
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
                target = (uk.nhs.nhsia.datastandards.ecds.NHSNumberStatusIndicatorCodeVerifiedType)get_store().find_element_user(NHSNUMBERSTATUSINDICATORCODE$6, 0);
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
                target = (org.apache.xmlbeans.SimpleValue)get_store().find_element_user(NHSNUMBERSTATUSINDICATORCODE$6, 0);
                if (target == null)
                {
                    target = (org.apache.xmlbeans.SimpleValue)get_store().add_element_user(NHSNUMBERSTATUSINDICATORCODE$6);
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
                target = (uk.nhs.nhsia.datastandards.ecds.NHSNumberStatusIndicatorCodeVerifiedType)get_store().find_element_user(NHSNUMBERSTATUSINDICATORCODE$6, 0);
                if (target == null)
                {
                    target = (uk.nhs.nhsia.datastandards.ecds.NHSNumberStatusIndicatorCodeVerifiedType)get_store().add_element_user(NHSNUMBERSTATUSINDICATORCODE$6);
                }
                target.set(nhsNumberStatusIndicatorCode);
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
        
        /**
         * Gets the "NHSNumberStatusIndicatorCode" attribute
         */
        public uk.nhs.nhsia.datastandards.ecds.NHSNumberStatusIndicatorCodeVerifiedType.Enum getNHSNumberStatusIndicatorCode2()
        {
            synchronized (monitor())
            {
                check_orphaned();
                org.apache.xmlbeans.SimpleValue target = null;
                target = (org.apache.xmlbeans.SimpleValue)get_store().find_attribute_user(NHSNUMBERSTATUSINDICATORCODE2$10);
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
        public uk.nhs.nhsia.datastandards.ecds.NHSNumberStatusIndicatorCodeVerifiedType xgetNHSNumberStatusIndicatorCode2()
        {
            synchronized (monitor())
            {
                check_orphaned();
                uk.nhs.nhsia.datastandards.ecds.NHSNumberStatusIndicatorCodeVerifiedType target = null;
                target = (uk.nhs.nhsia.datastandards.ecds.NHSNumberStatusIndicatorCodeVerifiedType)get_store().find_attribute_user(NHSNUMBERSTATUSINDICATORCODE2$10);
                return target;
            }
        }
        
        /**
         * Sets the "NHSNumberStatusIndicatorCode" attribute
         */
        public void setNHSNumberStatusIndicatorCode2(uk.nhs.nhsia.datastandards.ecds.NHSNumberStatusIndicatorCodeVerifiedType.Enum nhsNumberStatusIndicatorCode2)
        {
            synchronized (monitor())
            {
                check_orphaned();
                org.apache.xmlbeans.SimpleValue target = null;
                target = (org.apache.xmlbeans.SimpleValue)get_store().find_attribute_user(NHSNUMBERSTATUSINDICATORCODE2$10);
                if (target == null)
                {
                    target = (org.apache.xmlbeans.SimpleValue)get_store().add_attribute_user(NHSNUMBERSTATUSINDICATORCODE2$10);
                }
                target.setEnumValue(nhsNumberStatusIndicatorCode2);
            }
        }
        
        /**
         * Sets (as xml) the "NHSNumberStatusIndicatorCode" attribute
         */
        public void xsetNHSNumberStatusIndicatorCode2(uk.nhs.nhsia.datastandards.ecds.NHSNumberStatusIndicatorCodeVerifiedType nhsNumberStatusIndicatorCode2)
        {
            synchronized (monitor())
            {
                check_orphaned();
                uk.nhs.nhsia.datastandards.ecds.NHSNumberStatusIndicatorCodeVerifiedType target = null;
                target = (uk.nhs.nhsia.datastandards.ecds.NHSNumberStatusIndicatorCodeVerifiedType)get_store().find_attribute_user(NHSNUMBERSTATUSINDICATORCODE2$10);
                if (target == null)
                {
                    target = (uk.nhs.nhsia.datastandards.ecds.NHSNumberStatusIndicatorCodeVerifiedType)get_store().add_attribute_user(NHSNUMBERSTATUSINDICATORCODE2$10);
                }
                target.set(nhsNumberStatusIndicatorCode2);
            }
        }
    }
    /**
     * An XML UnverifiedIdentity_Structure(@http://www.nhsia.nhs.uk/DataStandards/XMLschema/CDS/ns).
     *
     * This is a complex type.
     */
    public static class UnverifiedIdentityStructureImpl extends org.apache.xmlbeans.impl.values.XmlComplexContentImpl implements uk.nhs.nhsia.datastandards.ecds.PatientIdentityBirthStructure.UnverifiedIdentityStructure
    {
        private static final long serialVersionUID = 1L;
        
        public UnverifiedIdentityStructureImpl(org.apache.xmlbeans.SchemaType sType)
        {
            super(sType);
        }
        
        private static final javax.xml.namespace.QName LOCALPATIENTIDENTIFIER$0 = 
            new javax.xml.namespace.QName("http://www.nhsia.nhs.uk/DataStandards/XMLschema/CDS/ns", "LocalPatientIdentifier");
        private static final javax.xml.namespace.QName ORGANISATIONCODELOCALPATIENTIDENTIFIER$2 = 
            new javax.xml.namespace.QName("http://www.nhsia.nhs.uk/DataStandards/XMLschema/CDS/ns", "OrganisationCode_LocalPatientIdentifier");
        private static final javax.xml.namespace.QName NHSNUMBER$4 = 
            new javax.xml.namespace.QName("http://www.nhsia.nhs.uk/DataStandards/XMLschema/CDS/ns", "NHSNumber");
        private static final javax.xml.namespace.QName NHSNUMBERSTATUSINDICATORCODE$6 = 
            new javax.xml.namespace.QName("http://www.nhsia.nhs.uk/DataStandards/XMLschema/CDS/ns", "NHSNumberStatusIndicatorCode");
        private static final javax.xml.namespace.QName PATIENTNAME$8 = 
            new javax.xml.namespace.QName("http://www.nhsia.nhs.uk/DataStandards/XMLschema/CDS/ns", "PatientName");
        private static final javax.xml.namespace.QName PERSONBIRTHDATE$10 = 
            new javax.xml.namespace.QName("http://www.nhsia.nhs.uk/DataStandards/XMLschema/CDS/ns", "PersonBirthDate");
        private static final javax.xml.namespace.QName NHSNUMBERSTATUSINDICATORCODE2$12 = 
            new javax.xml.namespace.QName("", "NHSNumberStatusIndicatorCode");
        
        
        /**
         * Gets the "LocalPatientIdentifier" element
         */
        public java.lang.String getLocalPatientIdentifier()
        {
            synchronized (monitor())
            {
                check_orphaned();
                org.apache.xmlbeans.SimpleValue target = null;
                target = (org.apache.xmlbeans.SimpleValue)get_store().find_element_user(LOCALPATIENTIDENTIFIER$0, 0);
                if (target == null)
                {
                    return null;
                }
                return target.getStringValue();
            }
        }
        
        /**
         * Gets (as xml) the "LocalPatientIdentifier" element
         */
        public uk.nhs.nhsia.datastandards.ecds.LocalPatientIdentifierType xgetLocalPatientIdentifier()
        {
            synchronized (monitor())
            {
                check_orphaned();
                uk.nhs.nhsia.datastandards.ecds.LocalPatientIdentifierType target = null;
                target = (uk.nhs.nhsia.datastandards.ecds.LocalPatientIdentifierType)get_store().find_element_user(LOCALPATIENTIDENTIFIER$0, 0);
                return target;
            }
        }
        
        /**
         * True if has "LocalPatientIdentifier" element
         */
        public boolean isSetLocalPatientIdentifier()
        {
            synchronized (monitor())
            {
                check_orphaned();
                return get_store().count_elements(LOCALPATIENTIDENTIFIER$0) != 0;
            }
        }
        
        /**
         * Sets the "LocalPatientIdentifier" element
         */
        public void setLocalPatientIdentifier(java.lang.String localPatientIdentifier)
        {
            synchronized (monitor())
            {
                check_orphaned();
                org.apache.xmlbeans.SimpleValue target = null;
                target = (org.apache.xmlbeans.SimpleValue)get_store().find_element_user(LOCALPATIENTIDENTIFIER$0, 0);
                if (target == null)
                {
                    target = (org.apache.xmlbeans.SimpleValue)get_store().add_element_user(LOCALPATIENTIDENTIFIER$0);
                }
                target.setStringValue(localPatientIdentifier);
            }
        }
        
        /**
         * Sets (as xml) the "LocalPatientIdentifier" element
         */
        public void xsetLocalPatientIdentifier(uk.nhs.nhsia.datastandards.ecds.LocalPatientIdentifierType localPatientIdentifier)
        {
            synchronized (monitor())
            {
                check_orphaned();
                uk.nhs.nhsia.datastandards.ecds.LocalPatientIdentifierType target = null;
                target = (uk.nhs.nhsia.datastandards.ecds.LocalPatientIdentifierType)get_store().find_element_user(LOCALPATIENTIDENTIFIER$0, 0);
                if (target == null)
                {
                    target = (uk.nhs.nhsia.datastandards.ecds.LocalPatientIdentifierType)get_store().add_element_user(LOCALPATIENTIDENTIFIER$0);
                }
                target.set(localPatientIdentifier);
            }
        }
        
        /**
         * Unsets the "LocalPatientIdentifier" element
         */
        public void unsetLocalPatientIdentifier()
        {
            synchronized (monitor())
            {
                check_orphaned();
                get_store().remove_element(LOCALPATIENTIDENTIFIER$0, 0);
            }
        }
        
        /**
         * Gets the "OrganisationCode_LocalPatientIdentifier" element
         */
        public java.lang.String getOrganisationCodeLocalPatientIdentifier()
        {
            synchronized (monitor())
            {
                check_orphaned();
                org.apache.xmlbeans.SimpleValue target = null;
                target = (org.apache.xmlbeans.SimpleValue)get_store().find_element_user(ORGANISATIONCODELOCALPATIENTIDENTIFIER$2, 0);
                if (target == null)
                {
                    return null;
                }
                return target.getStringValue();
            }
        }
        
        /**
         * Gets (as xml) the "OrganisationCode_LocalPatientIdentifier" element
         */
        public uk.nhs.nhsia.datastandards.ecds.OrganisationCodeType xgetOrganisationCodeLocalPatientIdentifier()
        {
            synchronized (monitor())
            {
                check_orphaned();
                uk.nhs.nhsia.datastandards.ecds.OrganisationCodeType target = null;
                target = (uk.nhs.nhsia.datastandards.ecds.OrganisationCodeType)get_store().find_element_user(ORGANISATIONCODELOCALPATIENTIDENTIFIER$2, 0);
                return target;
            }
        }
        
        /**
         * True if has "OrganisationCode_LocalPatientIdentifier" element
         */
        public boolean isSetOrganisationCodeLocalPatientIdentifier()
        {
            synchronized (monitor())
            {
                check_orphaned();
                return get_store().count_elements(ORGANISATIONCODELOCALPATIENTIDENTIFIER$2) != 0;
            }
        }
        
        /**
         * Sets the "OrganisationCode_LocalPatientIdentifier" element
         */
        public void setOrganisationCodeLocalPatientIdentifier(java.lang.String organisationCodeLocalPatientIdentifier)
        {
            synchronized (monitor())
            {
                check_orphaned();
                org.apache.xmlbeans.SimpleValue target = null;
                target = (org.apache.xmlbeans.SimpleValue)get_store().find_element_user(ORGANISATIONCODELOCALPATIENTIDENTIFIER$2, 0);
                if (target == null)
                {
                    target = (org.apache.xmlbeans.SimpleValue)get_store().add_element_user(ORGANISATIONCODELOCALPATIENTIDENTIFIER$2);
                }
                target.setStringValue(organisationCodeLocalPatientIdentifier);
            }
        }
        
        /**
         * Sets (as xml) the "OrganisationCode_LocalPatientIdentifier" element
         */
        public void xsetOrganisationCodeLocalPatientIdentifier(uk.nhs.nhsia.datastandards.ecds.OrganisationCodeType organisationCodeLocalPatientIdentifier)
        {
            synchronized (monitor())
            {
                check_orphaned();
                uk.nhs.nhsia.datastandards.ecds.OrganisationCodeType target = null;
                target = (uk.nhs.nhsia.datastandards.ecds.OrganisationCodeType)get_store().find_element_user(ORGANISATIONCODELOCALPATIENTIDENTIFIER$2, 0);
                if (target == null)
                {
                    target = (uk.nhs.nhsia.datastandards.ecds.OrganisationCodeType)get_store().add_element_user(ORGANISATIONCODELOCALPATIENTIDENTIFIER$2);
                }
                target.set(organisationCodeLocalPatientIdentifier);
            }
        }
        
        /**
         * Unsets the "OrganisationCode_LocalPatientIdentifier" element
         */
        public void unsetOrganisationCodeLocalPatientIdentifier()
        {
            synchronized (monitor())
            {
                check_orphaned();
                get_store().remove_element(ORGANISATIONCODELOCALPATIENTIDENTIFIER$2, 0);
            }
        }
        
        /**
         * Gets the "NHSNumber" element
         */
        public java.lang.String getNHSNumber()
        {
            synchronized (monitor())
            {
                check_orphaned();
                org.apache.xmlbeans.SimpleValue target = null;
                target = (org.apache.xmlbeans.SimpleValue)get_store().find_element_user(NHSNUMBER$4, 0);
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
                target = (uk.nhs.nhsia.datastandards.ecds.NHSNumberType)get_store().find_element_user(NHSNUMBER$4, 0);
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
                return get_store().count_elements(NHSNUMBER$4) != 0;
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
                target = (org.apache.xmlbeans.SimpleValue)get_store().find_element_user(NHSNUMBER$4, 0);
                if (target == null)
                {
                    target = (org.apache.xmlbeans.SimpleValue)get_store().add_element_user(NHSNUMBER$4);
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
                target = (uk.nhs.nhsia.datastandards.ecds.NHSNumberType)get_store().find_element_user(NHSNUMBER$4, 0);
                if (target == null)
                {
                    target = (uk.nhs.nhsia.datastandards.ecds.NHSNumberType)get_store().add_element_user(NHSNUMBER$4);
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
                get_store().remove_element(NHSNUMBER$4, 0);
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
                target = (org.apache.xmlbeans.SimpleValue)get_store().find_element_user(NHSNUMBERSTATUSINDICATORCODE$6, 0);
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
                target = (uk.nhs.nhsia.datastandards.ecds.NHSNumberStatusIndicatorCodeUnverifiedType)get_store().find_element_user(NHSNUMBERSTATUSINDICATORCODE$6, 0);
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
                target = (org.apache.xmlbeans.SimpleValue)get_store().find_element_user(NHSNUMBERSTATUSINDICATORCODE$6, 0);
                if (target == null)
                {
                    target = (org.apache.xmlbeans.SimpleValue)get_store().add_element_user(NHSNUMBERSTATUSINDICATORCODE$6);
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
                target = (uk.nhs.nhsia.datastandards.ecds.NHSNumberStatusIndicatorCodeUnverifiedType)get_store().find_element_user(NHSNUMBERSTATUSINDICATORCODE$6, 0);
                if (target == null)
                {
                    target = (uk.nhs.nhsia.datastandards.ecds.NHSNumberStatusIndicatorCodeUnverifiedType)get_store().add_element_user(NHSNUMBERSTATUSINDICATORCODE$6);
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
                target = (uk.nhs.nhsia.datastandards.ecds.PersonNameStructure)get_store().find_element_user(PATIENTNAME$8, 0);
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
                return get_store().count_elements(PATIENTNAME$8) != 0;
            }
        }
        
        /**
         * Sets the "PatientName" element
         */
        public void setPatientName(uk.nhs.nhsia.datastandards.ecds.PersonNameStructure patientName)
        {
            generatedSetterHelperImpl(patientName, PATIENTNAME$8, 0, org.apache.xmlbeans.impl.values.XmlObjectBase.KIND_SETTERHELPER_SINGLETON);
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
                target = (uk.nhs.nhsia.datastandards.ecds.PersonNameStructure)get_store().add_element_user(PATIENTNAME$8);
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
                get_store().remove_element(PATIENTNAME$8, 0);
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
                target = (org.apache.xmlbeans.SimpleValue)get_store().find_element_user(PERSONBIRTHDATE$10, 0);
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
                target = (uk.nhs.nhsia.datastandards.ecds.PersonBirthDateType)get_store().find_element_user(PERSONBIRTHDATE$10, 0);
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
                return get_store().count_elements(PERSONBIRTHDATE$10) != 0;
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
                target = (org.apache.xmlbeans.SimpleValue)get_store().find_element_user(PERSONBIRTHDATE$10, 0);
                if (target == null)
                {
                    target = (org.apache.xmlbeans.SimpleValue)get_store().add_element_user(PERSONBIRTHDATE$10);
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
                target = (uk.nhs.nhsia.datastandards.ecds.PersonBirthDateType)get_store().find_element_user(PERSONBIRTHDATE$10, 0);
                if (target == null)
                {
                    target = (uk.nhs.nhsia.datastandards.ecds.PersonBirthDateType)get_store().add_element_user(PERSONBIRTHDATE$10);
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
                get_store().remove_element(PERSONBIRTHDATE$10, 0);
            }
        }
        
        /**
         * Gets the "NHSNumberStatusIndicatorCode" attribute
         */
        public uk.nhs.nhsia.datastandards.ecds.NHSNumberStatusIndicatorCodeUnverifiedType.Enum getNHSNumberStatusIndicatorCode2()
        {
            synchronized (monitor())
            {
                check_orphaned();
                org.apache.xmlbeans.SimpleValue target = null;
                target = (org.apache.xmlbeans.SimpleValue)get_store().find_attribute_user(NHSNUMBERSTATUSINDICATORCODE2$12);
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
        public uk.nhs.nhsia.datastandards.ecds.NHSNumberStatusIndicatorCodeUnverifiedType xgetNHSNumberStatusIndicatorCode2()
        {
            synchronized (monitor())
            {
                check_orphaned();
                uk.nhs.nhsia.datastandards.ecds.NHSNumberStatusIndicatorCodeUnverifiedType target = null;
                target = (uk.nhs.nhsia.datastandards.ecds.NHSNumberStatusIndicatorCodeUnverifiedType)get_store().find_attribute_user(NHSNUMBERSTATUSINDICATORCODE2$12);
                return target;
            }
        }
        
        /**
         * Sets the "NHSNumberStatusIndicatorCode" attribute
         */
        public void setNHSNumberStatusIndicatorCode2(uk.nhs.nhsia.datastandards.ecds.NHSNumberStatusIndicatorCodeUnverifiedType.Enum nhsNumberStatusIndicatorCode2)
        {
            synchronized (monitor())
            {
                check_orphaned();
                org.apache.xmlbeans.SimpleValue target = null;
                target = (org.apache.xmlbeans.SimpleValue)get_store().find_attribute_user(NHSNUMBERSTATUSINDICATORCODE2$12);
                if (target == null)
                {
                    target = (org.apache.xmlbeans.SimpleValue)get_store().add_attribute_user(NHSNUMBERSTATUSINDICATORCODE2$12);
                }
                target.setEnumValue(nhsNumberStatusIndicatorCode2);
            }
        }
        
        /**
         * Sets (as xml) the "NHSNumberStatusIndicatorCode" attribute
         */
        public void xsetNHSNumberStatusIndicatorCode2(uk.nhs.nhsia.datastandards.ecds.NHSNumberStatusIndicatorCodeUnverifiedType nhsNumberStatusIndicatorCode2)
        {
            synchronized (monitor())
            {
                check_orphaned();
                uk.nhs.nhsia.datastandards.ecds.NHSNumberStatusIndicatorCodeUnverifiedType target = null;
                target = (uk.nhs.nhsia.datastandards.ecds.NHSNumberStatusIndicatorCodeUnverifiedType)get_store().find_attribute_user(NHSNUMBERSTATUSINDICATORCODE2$12);
                if (target == null)
                {
                    target = (uk.nhs.nhsia.datastandards.ecds.NHSNumberStatusIndicatorCodeUnverifiedType)get_store().add_attribute_user(NHSNUMBERSTATUSINDICATORCODE2$12);
                }
                target.set(nhsNumberStatusIndicatorCode2);
            }
        }
    }
}
