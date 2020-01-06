/*
 * XML Type:  PersonIdentity_Baby_Structure
 * Namespace: http://www.nhsia.nhs.uk/DataStandards/XMLschema/CDS/ns
 * Java type: uk.nhs.nhsia.datastandards.ecds.PersonIdentityBabyStructure
 *
 * Automatically generated - do not modify.
 */
package uk.nhs.nhsia.datastandards.ecds.impl;
/**
 * An XML PersonIdentity_Baby_Structure(@http://www.nhsia.nhs.uk/DataStandards/XMLschema/CDS/ns).
 *
 * This is a complex type.
 */
public class PersonIdentityBabyStructureImpl extends org.apache.xmlbeans.impl.values.XmlComplexContentImpl implements uk.nhs.nhsia.datastandards.ecds.PersonIdentityBabyStructure
{
    private static final long serialVersionUID = 1L;
    
    public PersonIdentityBabyStructureImpl(org.apache.xmlbeans.SchemaType sType)
    {
        super(sType);
    }
    
    private static final javax.xml.namespace.QName WITHHELDIDENTITYSTRUCTUREBABY$0 = 
        new javax.xml.namespace.QName("http://www.nhsia.nhs.uk/DataStandards/XMLschema/CDS/ns", "WithheldIdentity_Structure_Baby");
    private static final javax.xml.namespace.QName VERIFIEDIDENTITYSTRUCTUREBABY$2 = 
        new javax.xml.namespace.QName("http://www.nhsia.nhs.uk/DataStandards/XMLschema/CDS/ns", "VerifiedIdentity_Structure_Baby");
    private static final javax.xml.namespace.QName UNVERIFIEDIDENTITYSTRUCTUREBABY$4 = 
        new javax.xml.namespace.QName("http://www.nhsia.nhs.uk/DataStandards/XMLschema/CDS/ns", "UnverifiedIdentity_Structure_Baby");
    
    
    /**
     * Gets the "WithheldIdentity_Structure_Baby" element
     */
    public uk.nhs.nhsia.datastandards.ecds.PersonIdentityBabyStructure.WithheldIdentityStructureBaby getWithheldIdentityStructureBaby()
    {
        synchronized (monitor())
        {
            check_orphaned();
            uk.nhs.nhsia.datastandards.ecds.PersonIdentityBabyStructure.WithheldIdentityStructureBaby target = null;
            target = (uk.nhs.nhsia.datastandards.ecds.PersonIdentityBabyStructure.WithheldIdentityStructureBaby)get_store().find_element_user(WITHHELDIDENTITYSTRUCTUREBABY$0, 0);
            if (target == null)
            {
                return null;
            }
            return target;
        }
    }
    
    /**
     * True if has "WithheldIdentity_Structure_Baby" element
     */
    public boolean isSetWithheldIdentityStructureBaby()
    {
        synchronized (monitor())
        {
            check_orphaned();
            return get_store().count_elements(WITHHELDIDENTITYSTRUCTUREBABY$0) != 0;
        }
    }
    
    /**
     * Sets the "WithheldIdentity_Structure_Baby" element
     */
    public void setWithheldIdentityStructureBaby(uk.nhs.nhsia.datastandards.ecds.PersonIdentityBabyStructure.WithheldIdentityStructureBaby withheldIdentityStructureBaby)
    {
        generatedSetterHelperImpl(withheldIdentityStructureBaby, WITHHELDIDENTITYSTRUCTUREBABY$0, 0, org.apache.xmlbeans.impl.values.XmlObjectBase.KIND_SETTERHELPER_SINGLETON);
    }
    
    /**
     * Appends and returns a new empty "WithheldIdentity_Structure_Baby" element
     */
    public uk.nhs.nhsia.datastandards.ecds.PersonIdentityBabyStructure.WithheldIdentityStructureBaby addNewWithheldIdentityStructureBaby()
    {
        synchronized (monitor())
        {
            check_orphaned();
            uk.nhs.nhsia.datastandards.ecds.PersonIdentityBabyStructure.WithheldIdentityStructureBaby target = null;
            target = (uk.nhs.nhsia.datastandards.ecds.PersonIdentityBabyStructure.WithheldIdentityStructureBaby)get_store().add_element_user(WITHHELDIDENTITYSTRUCTUREBABY$0);
            return target;
        }
    }
    
    /**
     * Unsets the "WithheldIdentity_Structure_Baby" element
     */
    public void unsetWithheldIdentityStructureBaby()
    {
        synchronized (monitor())
        {
            check_orphaned();
            get_store().remove_element(WITHHELDIDENTITYSTRUCTUREBABY$0, 0);
        }
    }
    
    /**
     * Gets the "VerifiedIdentity_Structure_Baby" element
     */
    public uk.nhs.nhsia.datastandards.ecds.PersonIdentityBabyStructure.VerifiedIdentityStructureBaby getVerifiedIdentityStructureBaby()
    {
        synchronized (monitor())
        {
            check_orphaned();
            uk.nhs.nhsia.datastandards.ecds.PersonIdentityBabyStructure.VerifiedIdentityStructureBaby target = null;
            target = (uk.nhs.nhsia.datastandards.ecds.PersonIdentityBabyStructure.VerifiedIdentityStructureBaby)get_store().find_element_user(VERIFIEDIDENTITYSTRUCTUREBABY$2, 0);
            if (target == null)
            {
                return null;
            }
            return target;
        }
    }
    
    /**
     * True if has "VerifiedIdentity_Structure_Baby" element
     */
    public boolean isSetVerifiedIdentityStructureBaby()
    {
        synchronized (monitor())
        {
            check_orphaned();
            return get_store().count_elements(VERIFIEDIDENTITYSTRUCTUREBABY$2) != 0;
        }
    }
    
    /**
     * Sets the "VerifiedIdentity_Structure_Baby" element
     */
    public void setVerifiedIdentityStructureBaby(uk.nhs.nhsia.datastandards.ecds.PersonIdentityBabyStructure.VerifiedIdentityStructureBaby verifiedIdentityStructureBaby)
    {
        generatedSetterHelperImpl(verifiedIdentityStructureBaby, VERIFIEDIDENTITYSTRUCTUREBABY$2, 0, org.apache.xmlbeans.impl.values.XmlObjectBase.KIND_SETTERHELPER_SINGLETON);
    }
    
    /**
     * Appends and returns a new empty "VerifiedIdentity_Structure_Baby" element
     */
    public uk.nhs.nhsia.datastandards.ecds.PersonIdentityBabyStructure.VerifiedIdentityStructureBaby addNewVerifiedIdentityStructureBaby()
    {
        synchronized (monitor())
        {
            check_orphaned();
            uk.nhs.nhsia.datastandards.ecds.PersonIdentityBabyStructure.VerifiedIdentityStructureBaby target = null;
            target = (uk.nhs.nhsia.datastandards.ecds.PersonIdentityBabyStructure.VerifiedIdentityStructureBaby)get_store().add_element_user(VERIFIEDIDENTITYSTRUCTUREBABY$2);
            return target;
        }
    }
    
    /**
     * Unsets the "VerifiedIdentity_Structure_Baby" element
     */
    public void unsetVerifiedIdentityStructureBaby()
    {
        synchronized (monitor())
        {
            check_orphaned();
            get_store().remove_element(VERIFIEDIDENTITYSTRUCTUREBABY$2, 0);
        }
    }
    
    /**
     * Gets the "UnverifiedIdentity_Structure_Baby" element
     */
    public uk.nhs.nhsia.datastandards.ecds.PersonIdentityBabyStructure.UnverifiedIdentityStructureBaby getUnverifiedIdentityStructureBaby()
    {
        synchronized (monitor())
        {
            check_orphaned();
            uk.nhs.nhsia.datastandards.ecds.PersonIdentityBabyStructure.UnverifiedIdentityStructureBaby target = null;
            target = (uk.nhs.nhsia.datastandards.ecds.PersonIdentityBabyStructure.UnverifiedIdentityStructureBaby)get_store().find_element_user(UNVERIFIEDIDENTITYSTRUCTUREBABY$4, 0);
            if (target == null)
            {
                return null;
            }
            return target;
        }
    }
    
    /**
     * True if has "UnverifiedIdentity_Structure_Baby" element
     */
    public boolean isSetUnverifiedIdentityStructureBaby()
    {
        synchronized (monitor())
        {
            check_orphaned();
            return get_store().count_elements(UNVERIFIEDIDENTITYSTRUCTUREBABY$4) != 0;
        }
    }
    
    /**
     * Sets the "UnverifiedIdentity_Structure_Baby" element
     */
    public void setUnverifiedIdentityStructureBaby(uk.nhs.nhsia.datastandards.ecds.PersonIdentityBabyStructure.UnverifiedIdentityStructureBaby unverifiedIdentityStructureBaby)
    {
        generatedSetterHelperImpl(unverifiedIdentityStructureBaby, UNVERIFIEDIDENTITYSTRUCTUREBABY$4, 0, org.apache.xmlbeans.impl.values.XmlObjectBase.KIND_SETTERHELPER_SINGLETON);
    }
    
    /**
     * Appends and returns a new empty "UnverifiedIdentity_Structure_Baby" element
     */
    public uk.nhs.nhsia.datastandards.ecds.PersonIdentityBabyStructure.UnverifiedIdentityStructureBaby addNewUnverifiedIdentityStructureBaby()
    {
        synchronized (monitor())
        {
            check_orphaned();
            uk.nhs.nhsia.datastandards.ecds.PersonIdentityBabyStructure.UnverifiedIdentityStructureBaby target = null;
            target = (uk.nhs.nhsia.datastandards.ecds.PersonIdentityBabyStructure.UnverifiedIdentityStructureBaby)get_store().add_element_user(UNVERIFIEDIDENTITYSTRUCTUREBABY$4);
            return target;
        }
    }
    
    /**
     * Unsets the "UnverifiedIdentity_Structure_Baby" element
     */
    public void unsetUnverifiedIdentityStructureBaby()
    {
        synchronized (monitor())
        {
            check_orphaned();
            get_store().remove_element(UNVERIFIEDIDENTITYSTRUCTUREBABY$4, 0);
        }
    }
    /**
     * An XML WithheldIdentity_Structure_Baby(@http://www.nhsia.nhs.uk/DataStandards/XMLschema/CDS/ns).
     *
     * This is a complex type.
     */
    public static class WithheldIdentityStructureBabyImpl extends org.apache.xmlbeans.impl.values.XmlComplexContentImpl implements uk.nhs.nhsia.datastandards.ecds.PersonIdentityBabyStructure.WithheldIdentityStructureBaby
    {
        private static final long serialVersionUID = 1L;
        
        public WithheldIdentityStructureBabyImpl(org.apache.xmlbeans.SchemaType sType)
        {
            super(sType);
        }
        
        private static final javax.xml.namespace.QName NHSNUMBERSTATUSINDICATORCODEBABY$0 = 
            new javax.xml.namespace.QName("http://www.nhsia.nhs.uk/DataStandards/XMLschema/CDS/ns", "NHSNumberStatusIndicatorCode_Baby");
        private static final javax.xml.namespace.QName PERSONBIRTHDATEBABY$2 = 
            new javax.xml.namespace.QName("http://www.nhsia.nhs.uk/DataStandards/XMLschema/CDS/ns", "PersonBirthDate_Baby");
        private static final javax.xml.namespace.QName WITHHELDIDENTITYREASON$4 = 
            new javax.xml.namespace.QName("http://www.nhsia.nhs.uk/DataStandards/XMLschema/CDS/ns", "WithheldIdentityReason");
        private static final javax.xml.namespace.QName NHSNUMBERSTATUSINDICATORCODEBABY2$6 = 
            new javax.xml.namespace.QName("", "NHSNumberStatusIndicatorCode_Baby");
        
        
        /**
         * Gets the "NHSNumberStatusIndicatorCode_Baby" element
         */
        public uk.nhs.nhsia.datastandards.ecds.NHSNumberStatusIndicatorCodeWithheldType.Enum getNHSNumberStatusIndicatorCodeBaby()
        {
            synchronized (monitor())
            {
                check_orphaned();
                org.apache.xmlbeans.SimpleValue target = null;
                target = (org.apache.xmlbeans.SimpleValue)get_store().find_element_user(NHSNUMBERSTATUSINDICATORCODEBABY$0, 0);
                if (target == null)
                {
                    return null;
                }
                return (uk.nhs.nhsia.datastandards.ecds.NHSNumberStatusIndicatorCodeWithheldType.Enum)target.getEnumValue();
            }
        }
        
        /**
         * Gets (as xml) the "NHSNumberStatusIndicatorCode_Baby" element
         */
        public uk.nhs.nhsia.datastandards.ecds.NHSNumberStatusIndicatorCodeWithheldType xgetNHSNumberStatusIndicatorCodeBaby()
        {
            synchronized (monitor())
            {
                check_orphaned();
                uk.nhs.nhsia.datastandards.ecds.NHSNumberStatusIndicatorCodeWithheldType target = null;
                target = (uk.nhs.nhsia.datastandards.ecds.NHSNumberStatusIndicatorCodeWithheldType)get_store().find_element_user(NHSNUMBERSTATUSINDICATORCODEBABY$0, 0);
                return target;
            }
        }
        
        /**
         * Sets the "NHSNumberStatusIndicatorCode_Baby" element
         */
        public void setNHSNumberStatusIndicatorCodeBaby(uk.nhs.nhsia.datastandards.ecds.NHSNumberStatusIndicatorCodeWithheldType.Enum nhsNumberStatusIndicatorCodeBaby)
        {
            synchronized (monitor())
            {
                check_orphaned();
                org.apache.xmlbeans.SimpleValue target = null;
                target = (org.apache.xmlbeans.SimpleValue)get_store().find_element_user(NHSNUMBERSTATUSINDICATORCODEBABY$0, 0);
                if (target == null)
                {
                    target = (org.apache.xmlbeans.SimpleValue)get_store().add_element_user(NHSNUMBERSTATUSINDICATORCODEBABY$0);
                }
                target.setEnumValue(nhsNumberStatusIndicatorCodeBaby);
            }
        }
        
        /**
         * Sets (as xml) the "NHSNumberStatusIndicatorCode_Baby" element
         */
        public void xsetNHSNumberStatusIndicatorCodeBaby(uk.nhs.nhsia.datastandards.ecds.NHSNumberStatusIndicatorCodeWithheldType nhsNumberStatusIndicatorCodeBaby)
        {
            synchronized (monitor())
            {
                check_orphaned();
                uk.nhs.nhsia.datastandards.ecds.NHSNumberStatusIndicatorCodeWithheldType target = null;
                target = (uk.nhs.nhsia.datastandards.ecds.NHSNumberStatusIndicatorCodeWithheldType)get_store().find_element_user(NHSNUMBERSTATUSINDICATORCODEBABY$0, 0);
                if (target == null)
                {
                    target = (uk.nhs.nhsia.datastandards.ecds.NHSNumberStatusIndicatorCodeWithheldType)get_store().add_element_user(NHSNUMBERSTATUSINDICATORCODEBABY$0);
                }
                target.set(nhsNumberStatusIndicatorCodeBaby);
            }
        }
        
        /**
         * Gets the "PersonBirthDate_Baby" element
         */
        public java.util.Calendar getPersonBirthDateBaby()
        {
            synchronized (monitor())
            {
                check_orphaned();
                org.apache.xmlbeans.SimpleValue target = null;
                target = (org.apache.xmlbeans.SimpleValue)get_store().find_element_user(PERSONBIRTHDATEBABY$2, 0);
                if (target == null)
                {
                    return null;
                }
                return target.getCalendarValue();
            }
        }
        
        /**
         * Gets (as xml) the "PersonBirthDate_Baby" element
         */
        public uk.nhs.nhsia.datastandards.ecds.PersonBirthDateType xgetPersonBirthDateBaby()
        {
            synchronized (monitor())
            {
                check_orphaned();
                uk.nhs.nhsia.datastandards.ecds.PersonBirthDateType target = null;
                target = (uk.nhs.nhsia.datastandards.ecds.PersonBirthDateType)get_store().find_element_user(PERSONBIRTHDATEBABY$2, 0);
                return target;
            }
        }
        
        /**
         * True if has "PersonBirthDate_Baby" element
         */
        public boolean isSetPersonBirthDateBaby()
        {
            synchronized (monitor())
            {
                check_orphaned();
                return get_store().count_elements(PERSONBIRTHDATEBABY$2) != 0;
            }
        }
        
        /**
         * Sets the "PersonBirthDate_Baby" element
         */
        public void setPersonBirthDateBaby(java.util.Calendar personBirthDateBaby)
        {
            synchronized (monitor())
            {
                check_orphaned();
                org.apache.xmlbeans.SimpleValue target = null;
                target = (org.apache.xmlbeans.SimpleValue)get_store().find_element_user(PERSONBIRTHDATEBABY$2, 0);
                if (target == null)
                {
                    target = (org.apache.xmlbeans.SimpleValue)get_store().add_element_user(PERSONBIRTHDATEBABY$2);
                }
                target.setCalendarValue(personBirthDateBaby);
            }
        }
        
        /**
         * Sets (as xml) the "PersonBirthDate_Baby" element
         */
        public void xsetPersonBirthDateBaby(uk.nhs.nhsia.datastandards.ecds.PersonBirthDateType personBirthDateBaby)
        {
            synchronized (monitor())
            {
                check_orphaned();
                uk.nhs.nhsia.datastandards.ecds.PersonBirthDateType target = null;
                target = (uk.nhs.nhsia.datastandards.ecds.PersonBirthDateType)get_store().find_element_user(PERSONBIRTHDATEBABY$2, 0);
                if (target == null)
                {
                    target = (uk.nhs.nhsia.datastandards.ecds.PersonBirthDateType)get_store().add_element_user(PERSONBIRTHDATEBABY$2);
                }
                target.set(personBirthDateBaby);
            }
        }
        
        /**
         * Unsets the "PersonBirthDate_Baby" element
         */
        public void unsetPersonBirthDateBaby()
        {
            synchronized (monitor())
            {
                check_orphaned();
                get_store().remove_element(PERSONBIRTHDATEBABY$2, 0);
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
         * Gets the "NHSNumberStatusIndicatorCode_Baby" attribute
         */
        public uk.nhs.nhsia.datastandards.ecds.NHSNumberStatusIndicatorCodeWithheldType.Enum getNHSNumberStatusIndicatorCodeBaby2()
        {
            synchronized (monitor())
            {
                check_orphaned();
                org.apache.xmlbeans.SimpleValue target = null;
                target = (org.apache.xmlbeans.SimpleValue)get_store().find_attribute_user(NHSNUMBERSTATUSINDICATORCODEBABY2$6);
                if (target == null)
                {
                    return null;
                }
                return (uk.nhs.nhsia.datastandards.ecds.NHSNumberStatusIndicatorCodeWithheldType.Enum)target.getEnumValue();
            }
        }
        
        /**
         * Gets (as xml) the "NHSNumberStatusIndicatorCode_Baby" attribute
         */
        public uk.nhs.nhsia.datastandards.ecds.NHSNumberStatusIndicatorCodeWithheldType xgetNHSNumberStatusIndicatorCodeBaby2()
        {
            synchronized (monitor())
            {
                check_orphaned();
                uk.nhs.nhsia.datastandards.ecds.NHSNumberStatusIndicatorCodeWithheldType target = null;
                target = (uk.nhs.nhsia.datastandards.ecds.NHSNumberStatusIndicatorCodeWithheldType)get_store().find_attribute_user(NHSNUMBERSTATUSINDICATORCODEBABY2$6);
                return target;
            }
        }
        
        /**
         * Sets the "NHSNumberStatusIndicatorCode_Baby" attribute
         */
        public void setNHSNumberStatusIndicatorCodeBaby2(uk.nhs.nhsia.datastandards.ecds.NHSNumberStatusIndicatorCodeWithheldType.Enum nhsNumberStatusIndicatorCodeBaby2)
        {
            synchronized (monitor())
            {
                check_orphaned();
                org.apache.xmlbeans.SimpleValue target = null;
                target = (org.apache.xmlbeans.SimpleValue)get_store().find_attribute_user(NHSNUMBERSTATUSINDICATORCODEBABY2$6);
                if (target == null)
                {
                    target = (org.apache.xmlbeans.SimpleValue)get_store().add_attribute_user(NHSNUMBERSTATUSINDICATORCODEBABY2$6);
                }
                target.setEnumValue(nhsNumberStatusIndicatorCodeBaby2);
            }
        }
        
        /**
         * Sets (as xml) the "NHSNumberStatusIndicatorCode_Baby" attribute
         */
        public void xsetNHSNumberStatusIndicatorCodeBaby2(uk.nhs.nhsia.datastandards.ecds.NHSNumberStatusIndicatorCodeWithheldType nhsNumberStatusIndicatorCodeBaby2)
        {
            synchronized (monitor())
            {
                check_orphaned();
                uk.nhs.nhsia.datastandards.ecds.NHSNumberStatusIndicatorCodeWithheldType target = null;
                target = (uk.nhs.nhsia.datastandards.ecds.NHSNumberStatusIndicatorCodeWithheldType)get_store().find_attribute_user(NHSNUMBERSTATUSINDICATORCODEBABY2$6);
                if (target == null)
                {
                    target = (uk.nhs.nhsia.datastandards.ecds.NHSNumberStatusIndicatorCodeWithheldType)get_store().add_attribute_user(NHSNUMBERSTATUSINDICATORCODEBABY2$6);
                }
                target.set(nhsNumberStatusIndicatorCodeBaby2);
            }
        }
    }
    /**
     * An XML VerifiedIdentity_Structure_Baby(@http://www.nhsia.nhs.uk/DataStandards/XMLschema/CDS/ns).
     *
     * This is a complex type.
     */
    public static class VerifiedIdentityStructureBabyImpl extends org.apache.xmlbeans.impl.values.XmlComplexContentImpl implements uk.nhs.nhsia.datastandards.ecds.PersonIdentityBabyStructure.VerifiedIdentityStructureBaby
    {
        private static final long serialVersionUID = 1L;
        
        public VerifiedIdentityStructureBabyImpl(org.apache.xmlbeans.SchemaType sType)
        {
            super(sType);
        }
        
        private static final javax.xml.namespace.QName LOCALPATIENTIDENTIFIERBABY$0 = 
            new javax.xml.namespace.QName("http://www.nhsia.nhs.uk/DataStandards/XMLschema/CDS/ns", "LocalPatientIdentifier_Baby");
        private static final javax.xml.namespace.QName ORGANISATIONCODELOCALPATIENTIDENTIFIERBABY$2 = 
            new javax.xml.namespace.QName("http://www.nhsia.nhs.uk/DataStandards/XMLschema/CDS/ns", "OrganisationCode_LocalPatientIdentifier_Baby");
        private static final javax.xml.namespace.QName NHSNUMBERBABY$4 = 
            new javax.xml.namespace.QName("http://www.nhsia.nhs.uk/DataStandards/XMLschema/CDS/ns", "NHSNumber_Baby");
        private static final javax.xml.namespace.QName NHSNUMBERSTATUSINDICATORCODEBABY$6 = 
            new javax.xml.namespace.QName("http://www.nhsia.nhs.uk/DataStandards/XMLschema/CDS/ns", "NHSNumberStatusIndicatorCode_Baby");
        private static final javax.xml.namespace.QName PERSONBIRTHDATEBABY$8 = 
            new javax.xml.namespace.QName("http://www.nhsia.nhs.uk/DataStandards/XMLschema/CDS/ns", "PersonBirthDate_Baby");
        private static final javax.xml.namespace.QName NHSNUMBERSTATUSINDICATORCODEBABY2$10 = 
            new javax.xml.namespace.QName("", "NHSNumberStatusIndicatorCode_Baby");
        
        
        /**
         * Gets the "LocalPatientIdentifier_Baby" element
         */
        public java.lang.String getLocalPatientIdentifierBaby()
        {
            synchronized (monitor())
            {
                check_orphaned();
                org.apache.xmlbeans.SimpleValue target = null;
                target = (org.apache.xmlbeans.SimpleValue)get_store().find_element_user(LOCALPATIENTIDENTIFIERBABY$0, 0);
                if (target == null)
                {
                    return null;
                }
                return target.getStringValue();
            }
        }
        
        /**
         * Gets (as xml) the "LocalPatientIdentifier_Baby" element
         */
        public uk.nhs.nhsia.datastandards.ecds.LocalPatientIdentifierType xgetLocalPatientIdentifierBaby()
        {
            synchronized (monitor())
            {
                check_orphaned();
                uk.nhs.nhsia.datastandards.ecds.LocalPatientIdentifierType target = null;
                target = (uk.nhs.nhsia.datastandards.ecds.LocalPatientIdentifierType)get_store().find_element_user(LOCALPATIENTIDENTIFIERBABY$0, 0);
                return target;
            }
        }
        
        /**
         * True if has "LocalPatientIdentifier_Baby" element
         */
        public boolean isSetLocalPatientIdentifierBaby()
        {
            synchronized (monitor())
            {
                check_orphaned();
                return get_store().count_elements(LOCALPATIENTIDENTIFIERBABY$0) != 0;
            }
        }
        
        /**
         * Sets the "LocalPatientIdentifier_Baby" element
         */
        public void setLocalPatientIdentifierBaby(java.lang.String localPatientIdentifierBaby)
        {
            synchronized (monitor())
            {
                check_orphaned();
                org.apache.xmlbeans.SimpleValue target = null;
                target = (org.apache.xmlbeans.SimpleValue)get_store().find_element_user(LOCALPATIENTIDENTIFIERBABY$0, 0);
                if (target == null)
                {
                    target = (org.apache.xmlbeans.SimpleValue)get_store().add_element_user(LOCALPATIENTIDENTIFIERBABY$0);
                }
                target.setStringValue(localPatientIdentifierBaby);
            }
        }
        
        /**
         * Sets (as xml) the "LocalPatientIdentifier_Baby" element
         */
        public void xsetLocalPatientIdentifierBaby(uk.nhs.nhsia.datastandards.ecds.LocalPatientIdentifierType localPatientIdentifierBaby)
        {
            synchronized (monitor())
            {
                check_orphaned();
                uk.nhs.nhsia.datastandards.ecds.LocalPatientIdentifierType target = null;
                target = (uk.nhs.nhsia.datastandards.ecds.LocalPatientIdentifierType)get_store().find_element_user(LOCALPATIENTIDENTIFIERBABY$0, 0);
                if (target == null)
                {
                    target = (uk.nhs.nhsia.datastandards.ecds.LocalPatientIdentifierType)get_store().add_element_user(LOCALPATIENTIDENTIFIERBABY$0);
                }
                target.set(localPatientIdentifierBaby);
            }
        }
        
        /**
         * Unsets the "LocalPatientIdentifier_Baby" element
         */
        public void unsetLocalPatientIdentifierBaby()
        {
            synchronized (monitor())
            {
                check_orphaned();
                get_store().remove_element(LOCALPATIENTIDENTIFIERBABY$0, 0);
            }
        }
        
        /**
         * Gets the "OrganisationCode_LocalPatientIdentifier_Baby" element
         */
        public java.lang.String getOrganisationCodeLocalPatientIdentifierBaby()
        {
            synchronized (monitor())
            {
                check_orphaned();
                org.apache.xmlbeans.SimpleValue target = null;
                target = (org.apache.xmlbeans.SimpleValue)get_store().find_element_user(ORGANISATIONCODELOCALPATIENTIDENTIFIERBABY$2, 0);
                if (target == null)
                {
                    return null;
                }
                return target.getStringValue();
            }
        }
        
        /**
         * Gets (as xml) the "OrganisationCode_LocalPatientIdentifier_Baby" element
         */
        public uk.nhs.nhsia.datastandards.ecds.OrganisationCodeType xgetOrganisationCodeLocalPatientIdentifierBaby()
        {
            synchronized (monitor())
            {
                check_orphaned();
                uk.nhs.nhsia.datastandards.ecds.OrganisationCodeType target = null;
                target = (uk.nhs.nhsia.datastandards.ecds.OrganisationCodeType)get_store().find_element_user(ORGANISATIONCODELOCALPATIENTIDENTIFIERBABY$2, 0);
                return target;
            }
        }
        
        /**
         * True if has "OrganisationCode_LocalPatientIdentifier_Baby" element
         */
        public boolean isSetOrganisationCodeLocalPatientIdentifierBaby()
        {
            synchronized (monitor())
            {
                check_orphaned();
                return get_store().count_elements(ORGANISATIONCODELOCALPATIENTIDENTIFIERBABY$2) != 0;
            }
        }
        
        /**
         * Sets the "OrganisationCode_LocalPatientIdentifier_Baby" element
         */
        public void setOrganisationCodeLocalPatientIdentifierBaby(java.lang.String organisationCodeLocalPatientIdentifierBaby)
        {
            synchronized (monitor())
            {
                check_orphaned();
                org.apache.xmlbeans.SimpleValue target = null;
                target = (org.apache.xmlbeans.SimpleValue)get_store().find_element_user(ORGANISATIONCODELOCALPATIENTIDENTIFIERBABY$2, 0);
                if (target == null)
                {
                    target = (org.apache.xmlbeans.SimpleValue)get_store().add_element_user(ORGANISATIONCODELOCALPATIENTIDENTIFIERBABY$2);
                }
                target.setStringValue(organisationCodeLocalPatientIdentifierBaby);
            }
        }
        
        /**
         * Sets (as xml) the "OrganisationCode_LocalPatientIdentifier_Baby" element
         */
        public void xsetOrganisationCodeLocalPatientIdentifierBaby(uk.nhs.nhsia.datastandards.ecds.OrganisationCodeType organisationCodeLocalPatientIdentifierBaby)
        {
            synchronized (monitor())
            {
                check_orphaned();
                uk.nhs.nhsia.datastandards.ecds.OrganisationCodeType target = null;
                target = (uk.nhs.nhsia.datastandards.ecds.OrganisationCodeType)get_store().find_element_user(ORGANISATIONCODELOCALPATIENTIDENTIFIERBABY$2, 0);
                if (target == null)
                {
                    target = (uk.nhs.nhsia.datastandards.ecds.OrganisationCodeType)get_store().add_element_user(ORGANISATIONCODELOCALPATIENTIDENTIFIERBABY$2);
                }
                target.set(organisationCodeLocalPatientIdentifierBaby);
            }
        }
        
        /**
         * Unsets the "OrganisationCode_LocalPatientIdentifier_Baby" element
         */
        public void unsetOrganisationCodeLocalPatientIdentifierBaby()
        {
            synchronized (monitor())
            {
                check_orphaned();
                get_store().remove_element(ORGANISATIONCODELOCALPATIENTIDENTIFIERBABY$2, 0);
            }
        }
        
        /**
         * Gets the "NHSNumber_Baby" element
         */
        public java.lang.String getNHSNumberBaby()
        {
            synchronized (monitor())
            {
                check_orphaned();
                org.apache.xmlbeans.SimpleValue target = null;
                target = (org.apache.xmlbeans.SimpleValue)get_store().find_element_user(NHSNUMBERBABY$4, 0);
                if (target == null)
                {
                    return null;
                }
                return target.getStringValue();
            }
        }
        
        /**
         * Gets (as xml) the "NHSNumber_Baby" element
         */
        public uk.nhs.nhsia.datastandards.ecds.NHSNumberType xgetNHSNumberBaby()
        {
            synchronized (monitor())
            {
                check_orphaned();
                uk.nhs.nhsia.datastandards.ecds.NHSNumberType target = null;
                target = (uk.nhs.nhsia.datastandards.ecds.NHSNumberType)get_store().find_element_user(NHSNUMBERBABY$4, 0);
                return target;
            }
        }
        
        /**
         * Sets the "NHSNumber_Baby" element
         */
        public void setNHSNumberBaby(java.lang.String nhsNumberBaby)
        {
            synchronized (monitor())
            {
                check_orphaned();
                org.apache.xmlbeans.SimpleValue target = null;
                target = (org.apache.xmlbeans.SimpleValue)get_store().find_element_user(NHSNUMBERBABY$4, 0);
                if (target == null)
                {
                    target = (org.apache.xmlbeans.SimpleValue)get_store().add_element_user(NHSNUMBERBABY$4);
                }
                target.setStringValue(nhsNumberBaby);
            }
        }
        
        /**
         * Sets (as xml) the "NHSNumber_Baby" element
         */
        public void xsetNHSNumberBaby(uk.nhs.nhsia.datastandards.ecds.NHSNumberType nhsNumberBaby)
        {
            synchronized (monitor())
            {
                check_orphaned();
                uk.nhs.nhsia.datastandards.ecds.NHSNumberType target = null;
                target = (uk.nhs.nhsia.datastandards.ecds.NHSNumberType)get_store().find_element_user(NHSNUMBERBABY$4, 0);
                if (target == null)
                {
                    target = (uk.nhs.nhsia.datastandards.ecds.NHSNumberType)get_store().add_element_user(NHSNUMBERBABY$4);
                }
                target.set(nhsNumberBaby);
            }
        }
        
        /**
         * Gets the "NHSNumberStatusIndicatorCode_Baby" element
         */
        public uk.nhs.nhsia.datastandards.ecds.NHSNumberStatusIndicatorCodeVerifiedType.Enum getNHSNumberStatusIndicatorCodeBaby()
        {
            synchronized (monitor())
            {
                check_orphaned();
                org.apache.xmlbeans.SimpleValue target = null;
                target = (org.apache.xmlbeans.SimpleValue)get_store().find_element_user(NHSNUMBERSTATUSINDICATORCODEBABY$6, 0);
                if (target == null)
                {
                    return null;
                }
                return (uk.nhs.nhsia.datastandards.ecds.NHSNumberStatusIndicatorCodeVerifiedType.Enum)target.getEnumValue();
            }
        }
        
        /**
         * Gets (as xml) the "NHSNumberStatusIndicatorCode_Baby" element
         */
        public uk.nhs.nhsia.datastandards.ecds.NHSNumberStatusIndicatorCodeVerifiedType xgetNHSNumberStatusIndicatorCodeBaby()
        {
            synchronized (monitor())
            {
                check_orphaned();
                uk.nhs.nhsia.datastandards.ecds.NHSNumberStatusIndicatorCodeVerifiedType target = null;
                target = (uk.nhs.nhsia.datastandards.ecds.NHSNumberStatusIndicatorCodeVerifiedType)get_store().find_element_user(NHSNUMBERSTATUSINDICATORCODEBABY$6, 0);
                return target;
            }
        }
        
        /**
         * Sets the "NHSNumberStatusIndicatorCode_Baby" element
         */
        public void setNHSNumberStatusIndicatorCodeBaby(uk.nhs.nhsia.datastandards.ecds.NHSNumberStatusIndicatorCodeVerifiedType.Enum nhsNumberStatusIndicatorCodeBaby)
        {
            synchronized (monitor())
            {
                check_orphaned();
                org.apache.xmlbeans.SimpleValue target = null;
                target = (org.apache.xmlbeans.SimpleValue)get_store().find_element_user(NHSNUMBERSTATUSINDICATORCODEBABY$6, 0);
                if (target == null)
                {
                    target = (org.apache.xmlbeans.SimpleValue)get_store().add_element_user(NHSNUMBERSTATUSINDICATORCODEBABY$6);
                }
                target.setEnumValue(nhsNumberStatusIndicatorCodeBaby);
            }
        }
        
        /**
         * Sets (as xml) the "NHSNumberStatusIndicatorCode_Baby" element
         */
        public void xsetNHSNumberStatusIndicatorCodeBaby(uk.nhs.nhsia.datastandards.ecds.NHSNumberStatusIndicatorCodeVerifiedType nhsNumberStatusIndicatorCodeBaby)
        {
            synchronized (monitor())
            {
                check_orphaned();
                uk.nhs.nhsia.datastandards.ecds.NHSNumberStatusIndicatorCodeVerifiedType target = null;
                target = (uk.nhs.nhsia.datastandards.ecds.NHSNumberStatusIndicatorCodeVerifiedType)get_store().find_element_user(NHSNUMBERSTATUSINDICATORCODEBABY$6, 0);
                if (target == null)
                {
                    target = (uk.nhs.nhsia.datastandards.ecds.NHSNumberStatusIndicatorCodeVerifiedType)get_store().add_element_user(NHSNUMBERSTATUSINDICATORCODEBABY$6);
                }
                target.set(nhsNumberStatusIndicatorCodeBaby);
            }
        }
        
        /**
         * Gets the "PersonBirthDate_Baby" element
         */
        public java.util.Calendar getPersonBirthDateBaby()
        {
            synchronized (monitor())
            {
                check_orphaned();
                org.apache.xmlbeans.SimpleValue target = null;
                target = (org.apache.xmlbeans.SimpleValue)get_store().find_element_user(PERSONBIRTHDATEBABY$8, 0);
                if (target == null)
                {
                    return null;
                }
                return target.getCalendarValue();
            }
        }
        
        /**
         * Gets (as xml) the "PersonBirthDate_Baby" element
         */
        public uk.nhs.nhsia.datastandards.ecds.PersonBirthDateType xgetPersonBirthDateBaby()
        {
            synchronized (monitor())
            {
                check_orphaned();
                uk.nhs.nhsia.datastandards.ecds.PersonBirthDateType target = null;
                target = (uk.nhs.nhsia.datastandards.ecds.PersonBirthDateType)get_store().find_element_user(PERSONBIRTHDATEBABY$8, 0);
                return target;
            }
        }
        
        /**
         * True if has "PersonBirthDate_Baby" element
         */
        public boolean isSetPersonBirthDateBaby()
        {
            synchronized (monitor())
            {
                check_orphaned();
                return get_store().count_elements(PERSONBIRTHDATEBABY$8) != 0;
            }
        }
        
        /**
         * Sets the "PersonBirthDate_Baby" element
         */
        public void setPersonBirthDateBaby(java.util.Calendar personBirthDateBaby)
        {
            synchronized (monitor())
            {
                check_orphaned();
                org.apache.xmlbeans.SimpleValue target = null;
                target = (org.apache.xmlbeans.SimpleValue)get_store().find_element_user(PERSONBIRTHDATEBABY$8, 0);
                if (target == null)
                {
                    target = (org.apache.xmlbeans.SimpleValue)get_store().add_element_user(PERSONBIRTHDATEBABY$8);
                }
                target.setCalendarValue(personBirthDateBaby);
            }
        }
        
        /**
         * Sets (as xml) the "PersonBirthDate_Baby" element
         */
        public void xsetPersonBirthDateBaby(uk.nhs.nhsia.datastandards.ecds.PersonBirthDateType personBirthDateBaby)
        {
            synchronized (monitor())
            {
                check_orphaned();
                uk.nhs.nhsia.datastandards.ecds.PersonBirthDateType target = null;
                target = (uk.nhs.nhsia.datastandards.ecds.PersonBirthDateType)get_store().find_element_user(PERSONBIRTHDATEBABY$8, 0);
                if (target == null)
                {
                    target = (uk.nhs.nhsia.datastandards.ecds.PersonBirthDateType)get_store().add_element_user(PERSONBIRTHDATEBABY$8);
                }
                target.set(personBirthDateBaby);
            }
        }
        
        /**
         * Unsets the "PersonBirthDate_Baby" element
         */
        public void unsetPersonBirthDateBaby()
        {
            synchronized (monitor())
            {
                check_orphaned();
                get_store().remove_element(PERSONBIRTHDATEBABY$8, 0);
            }
        }
        
        /**
         * Gets the "NHSNumberStatusIndicatorCode_Baby" attribute
         */
        public uk.nhs.nhsia.datastandards.ecds.NHSNumberStatusIndicatorCodeVerifiedType.Enum getNHSNumberStatusIndicatorCodeBaby2()
        {
            synchronized (monitor())
            {
                check_orphaned();
                org.apache.xmlbeans.SimpleValue target = null;
                target = (org.apache.xmlbeans.SimpleValue)get_store().find_attribute_user(NHSNUMBERSTATUSINDICATORCODEBABY2$10);
                if (target == null)
                {
                    return null;
                }
                return (uk.nhs.nhsia.datastandards.ecds.NHSNumberStatusIndicatorCodeVerifiedType.Enum)target.getEnumValue();
            }
        }
        
        /**
         * Gets (as xml) the "NHSNumberStatusIndicatorCode_Baby" attribute
         */
        public uk.nhs.nhsia.datastandards.ecds.NHSNumberStatusIndicatorCodeVerifiedType xgetNHSNumberStatusIndicatorCodeBaby2()
        {
            synchronized (monitor())
            {
                check_orphaned();
                uk.nhs.nhsia.datastandards.ecds.NHSNumberStatusIndicatorCodeVerifiedType target = null;
                target = (uk.nhs.nhsia.datastandards.ecds.NHSNumberStatusIndicatorCodeVerifiedType)get_store().find_attribute_user(NHSNUMBERSTATUSINDICATORCODEBABY2$10);
                return target;
            }
        }
        
        /**
         * Sets the "NHSNumberStatusIndicatorCode_Baby" attribute
         */
        public void setNHSNumberStatusIndicatorCodeBaby2(uk.nhs.nhsia.datastandards.ecds.NHSNumberStatusIndicatorCodeVerifiedType.Enum nhsNumberStatusIndicatorCodeBaby2)
        {
            synchronized (monitor())
            {
                check_orphaned();
                org.apache.xmlbeans.SimpleValue target = null;
                target = (org.apache.xmlbeans.SimpleValue)get_store().find_attribute_user(NHSNUMBERSTATUSINDICATORCODEBABY2$10);
                if (target == null)
                {
                    target = (org.apache.xmlbeans.SimpleValue)get_store().add_attribute_user(NHSNUMBERSTATUSINDICATORCODEBABY2$10);
                }
                target.setEnumValue(nhsNumberStatusIndicatorCodeBaby2);
            }
        }
        
        /**
         * Sets (as xml) the "NHSNumberStatusIndicatorCode_Baby" attribute
         */
        public void xsetNHSNumberStatusIndicatorCodeBaby2(uk.nhs.nhsia.datastandards.ecds.NHSNumberStatusIndicatorCodeVerifiedType nhsNumberStatusIndicatorCodeBaby2)
        {
            synchronized (monitor())
            {
                check_orphaned();
                uk.nhs.nhsia.datastandards.ecds.NHSNumberStatusIndicatorCodeVerifiedType target = null;
                target = (uk.nhs.nhsia.datastandards.ecds.NHSNumberStatusIndicatorCodeVerifiedType)get_store().find_attribute_user(NHSNUMBERSTATUSINDICATORCODEBABY2$10);
                if (target == null)
                {
                    target = (uk.nhs.nhsia.datastandards.ecds.NHSNumberStatusIndicatorCodeVerifiedType)get_store().add_attribute_user(NHSNUMBERSTATUSINDICATORCODEBABY2$10);
                }
                target.set(nhsNumberStatusIndicatorCodeBaby2);
            }
        }
    }
    /**
     * An XML UnverifiedIdentity_Structure_Baby(@http://www.nhsia.nhs.uk/DataStandards/XMLschema/CDS/ns).
     *
     * This is a complex type.
     */
    public static class UnverifiedIdentityStructureBabyImpl extends org.apache.xmlbeans.impl.values.XmlComplexContentImpl implements uk.nhs.nhsia.datastandards.ecds.PersonIdentityBabyStructure.UnverifiedIdentityStructureBaby
    {
        private static final long serialVersionUID = 1L;
        
        public UnverifiedIdentityStructureBabyImpl(org.apache.xmlbeans.SchemaType sType)
        {
            super(sType);
        }
        
        private static final javax.xml.namespace.QName LOCALPATIENTIDENTIFIERBABY$0 = 
            new javax.xml.namespace.QName("http://www.nhsia.nhs.uk/DataStandards/XMLschema/CDS/ns", "LocalPatientIdentifier_Baby");
        private static final javax.xml.namespace.QName ORGANISATIONCODELOCALPATIENTIDENTIFIERBABY$2 = 
            new javax.xml.namespace.QName("http://www.nhsia.nhs.uk/DataStandards/XMLschema/CDS/ns", "OrganisationCode_LocalPatientIdentifier_Baby");
        private static final javax.xml.namespace.QName NHSNUMBERBABY$4 = 
            new javax.xml.namespace.QName("http://www.nhsia.nhs.uk/DataStandards/XMLschema/CDS/ns", "NHSNumber_Baby");
        private static final javax.xml.namespace.QName NHSNUMBERSTATUSINDICATORCODEBABY$6 = 
            new javax.xml.namespace.QName("http://www.nhsia.nhs.uk/DataStandards/XMLschema/CDS/ns", "NHSNumberStatusIndicatorCode_Baby");
        private static final javax.xml.namespace.QName PERSONBIRTHDATEBABY$8 = 
            new javax.xml.namespace.QName("http://www.nhsia.nhs.uk/DataStandards/XMLschema/CDS/ns", "PersonBirthDate_Baby");
        private static final javax.xml.namespace.QName NHSNUMBERSTATUSINDICATORCODEBABY2$10 = 
            new javax.xml.namespace.QName("", "NHSNumberStatusIndicatorCode_Baby");
        
        
        /**
         * Gets the "LocalPatientIdentifier_Baby" element
         */
        public java.lang.String getLocalPatientIdentifierBaby()
        {
            synchronized (monitor())
            {
                check_orphaned();
                org.apache.xmlbeans.SimpleValue target = null;
                target = (org.apache.xmlbeans.SimpleValue)get_store().find_element_user(LOCALPATIENTIDENTIFIERBABY$0, 0);
                if (target == null)
                {
                    return null;
                }
                return target.getStringValue();
            }
        }
        
        /**
         * Gets (as xml) the "LocalPatientIdentifier_Baby" element
         */
        public uk.nhs.nhsia.datastandards.ecds.LocalPatientIdentifierType xgetLocalPatientIdentifierBaby()
        {
            synchronized (monitor())
            {
                check_orphaned();
                uk.nhs.nhsia.datastandards.ecds.LocalPatientIdentifierType target = null;
                target = (uk.nhs.nhsia.datastandards.ecds.LocalPatientIdentifierType)get_store().find_element_user(LOCALPATIENTIDENTIFIERBABY$0, 0);
                return target;
            }
        }
        
        /**
         * True if has "LocalPatientIdentifier_Baby" element
         */
        public boolean isSetLocalPatientIdentifierBaby()
        {
            synchronized (monitor())
            {
                check_orphaned();
                return get_store().count_elements(LOCALPATIENTIDENTIFIERBABY$0) != 0;
            }
        }
        
        /**
         * Sets the "LocalPatientIdentifier_Baby" element
         */
        public void setLocalPatientIdentifierBaby(java.lang.String localPatientIdentifierBaby)
        {
            synchronized (monitor())
            {
                check_orphaned();
                org.apache.xmlbeans.SimpleValue target = null;
                target = (org.apache.xmlbeans.SimpleValue)get_store().find_element_user(LOCALPATIENTIDENTIFIERBABY$0, 0);
                if (target == null)
                {
                    target = (org.apache.xmlbeans.SimpleValue)get_store().add_element_user(LOCALPATIENTIDENTIFIERBABY$0);
                }
                target.setStringValue(localPatientIdentifierBaby);
            }
        }
        
        /**
         * Sets (as xml) the "LocalPatientIdentifier_Baby" element
         */
        public void xsetLocalPatientIdentifierBaby(uk.nhs.nhsia.datastandards.ecds.LocalPatientIdentifierType localPatientIdentifierBaby)
        {
            synchronized (monitor())
            {
                check_orphaned();
                uk.nhs.nhsia.datastandards.ecds.LocalPatientIdentifierType target = null;
                target = (uk.nhs.nhsia.datastandards.ecds.LocalPatientIdentifierType)get_store().find_element_user(LOCALPATIENTIDENTIFIERBABY$0, 0);
                if (target == null)
                {
                    target = (uk.nhs.nhsia.datastandards.ecds.LocalPatientIdentifierType)get_store().add_element_user(LOCALPATIENTIDENTIFIERBABY$0);
                }
                target.set(localPatientIdentifierBaby);
            }
        }
        
        /**
         * Unsets the "LocalPatientIdentifier_Baby" element
         */
        public void unsetLocalPatientIdentifierBaby()
        {
            synchronized (monitor())
            {
                check_orphaned();
                get_store().remove_element(LOCALPATIENTIDENTIFIERBABY$0, 0);
            }
        }
        
        /**
         * Gets the "OrganisationCode_LocalPatientIdentifier_Baby" element
         */
        public java.lang.String getOrganisationCodeLocalPatientIdentifierBaby()
        {
            synchronized (monitor())
            {
                check_orphaned();
                org.apache.xmlbeans.SimpleValue target = null;
                target = (org.apache.xmlbeans.SimpleValue)get_store().find_element_user(ORGANISATIONCODELOCALPATIENTIDENTIFIERBABY$2, 0);
                if (target == null)
                {
                    return null;
                }
                return target.getStringValue();
            }
        }
        
        /**
         * Gets (as xml) the "OrganisationCode_LocalPatientIdentifier_Baby" element
         */
        public uk.nhs.nhsia.datastandards.ecds.OrganisationCodeType xgetOrganisationCodeLocalPatientIdentifierBaby()
        {
            synchronized (monitor())
            {
                check_orphaned();
                uk.nhs.nhsia.datastandards.ecds.OrganisationCodeType target = null;
                target = (uk.nhs.nhsia.datastandards.ecds.OrganisationCodeType)get_store().find_element_user(ORGANISATIONCODELOCALPATIENTIDENTIFIERBABY$2, 0);
                return target;
            }
        }
        
        /**
         * True if has "OrganisationCode_LocalPatientIdentifier_Baby" element
         */
        public boolean isSetOrganisationCodeLocalPatientIdentifierBaby()
        {
            synchronized (monitor())
            {
                check_orphaned();
                return get_store().count_elements(ORGANISATIONCODELOCALPATIENTIDENTIFIERBABY$2) != 0;
            }
        }
        
        /**
         * Sets the "OrganisationCode_LocalPatientIdentifier_Baby" element
         */
        public void setOrganisationCodeLocalPatientIdentifierBaby(java.lang.String organisationCodeLocalPatientIdentifierBaby)
        {
            synchronized (monitor())
            {
                check_orphaned();
                org.apache.xmlbeans.SimpleValue target = null;
                target = (org.apache.xmlbeans.SimpleValue)get_store().find_element_user(ORGANISATIONCODELOCALPATIENTIDENTIFIERBABY$2, 0);
                if (target == null)
                {
                    target = (org.apache.xmlbeans.SimpleValue)get_store().add_element_user(ORGANISATIONCODELOCALPATIENTIDENTIFIERBABY$2);
                }
                target.setStringValue(organisationCodeLocalPatientIdentifierBaby);
            }
        }
        
        /**
         * Sets (as xml) the "OrganisationCode_LocalPatientIdentifier_Baby" element
         */
        public void xsetOrganisationCodeLocalPatientIdentifierBaby(uk.nhs.nhsia.datastandards.ecds.OrganisationCodeType organisationCodeLocalPatientIdentifierBaby)
        {
            synchronized (monitor())
            {
                check_orphaned();
                uk.nhs.nhsia.datastandards.ecds.OrganisationCodeType target = null;
                target = (uk.nhs.nhsia.datastandards.ecds.OrganisationCodeType)get_store().find_element_user(ORGANISATIONCODELOCALPATIENTIDENTIFIERBABY$2, 0);
                if (target == null)
                {
                    target = (uk.nhs.nhsia.datastandards.ecds.OrganisationCodeType)get_store().add_element_user(ORGANISATIONCODELOCALPATIENTIDENTIFIERBABY$2);
                }
                target.set(organisationCodeLocalPatientIdentifierBaby);
            }
        }
        
        /**
         * Unsets the "OrganisationCode_LocalPatientIdentifier_Baby" element
         */
        public void unsetOrganisationCodeLocalPatientIdentifierBaby()
        {
            synchronized (monitor())
            {
                check_orphaned();
                get_store().remove_element(ORGANISATIONCODELOCALPATIENTIDENTIFIERBABY$2, 0);
            }
        }
        
        /**
         * Gets the "NHSNumber_Baby" element
         */
        public java.lang.String getNHSNumberBaby()
        {
            synchronized (monitor())
            {
                check_orphaned();
                org.apache.xmlbeans.SimpleValue target = null;
                target = (org.apache.xmlbeans.SimpleValue)get_store().find_element_user(NHSNUMBERBABY$4, 0);
                if (target == null)
                {
                    return null;
                }
                return target.getStringValue();
            }
        }
        
        /**
         * Gets (as xml) the "NHSNumber_Baby" element
         */
        public uk.nhs.nhsia.datastandards.ecds.NHSNumberType xgetNHSNumberBaby()
        {
            synchronized (monitor())
            {
                check_orphaned();
                uk.nhs.nhsia.datastandards.ecds.NHSNumberType target = null;
                target = (uk.nhs.nhsia.datastandards.ecds.NHSNumberType)get_store().find_element_user(NHSNUMBERBABY$4, 0);
                return target;
            }
        }
        
        /**
         * True if has "NHSNumber_Baby" element
         */
        public boolean isSetNHSNumberBaby()
        {
            synchronized (monitor())
            {
                check_orphaned();
                return get_store().count_elements(NHSNUMBERBABY$4) != 0;
            }
        }
        
        /**
         * Sets the "NHSNumber_Baby" element
         */
        public void setNHSNumberBaby(java.lang.String nhsNumberBaby)
        {
            synchronized (monitor())
            {
                check_orphaned();
                org.apache.xmlbeans.SimpleValue target = null;
                target = (org.apache.xmlbeans.SimpleValue)get_store().find_element_user(NHSNUMBERBABY$4, 0);
                if (target == null)
                {
                    target = (org.apache.xmlbeans.SimpleValue)get_store().add_element_user(NHSNUMBERBABY$4);
                }
                target.setStringValue(nhsNumberBaby);
            }
        }
        
        /**
         * Sets (as xml) the "NHSNumber_Baby" element
         */
        public void xsetNHSNumberBaby(uk.nhs.nhsia.datastandards.ecds.NHSNumberType nhsNumberBaby)
        {
            synchronized (monitor())
            {
                check_orphaned();
                uk.nhs.nhsia.datastandards.ecds.NHSNumberType target = null;
                target = (uk.nhs.nhsia.datastandards.ecds.NHSNumberType)get_store().find_element_user(NHSNUMBERBABY$4, 0);
                if (target == null)
                {
                    target = (uk.nhs.nhsia.datastandards.ecds.NHSNumberType)get_store().add_element_user(NHSNUMBERBABY$4);
                }
                target.set(nhsNumberBaby);
            }
        }
        
        /**
         * Unsets the "NHSNumber_Baby" element
         */
        public void unsetNHSNumberBaby()
        {
            synchronized (monitor())
            {
                check_orphaned();
                get_store().remove_element(NHSNUMBERBABY$4, 0);
            }
        }
        
        /**
         * Gets the "NHSNumberStatusIndicatorCode_Baby" element
         */
        public uk.nhs.nhsia.datastandards.ecds.NHSNumberStatusIndicatorCodeUnverifiedType.Enum getNHSNumberStatusIndicatorCodeBaby()
        {
            synchronized (monitor())
            {
                check_orphaned();
                org.apache.xmlbeans.SimpleValue target = null;
                target = (org.apache.xmlbeans.SimpleValue)get_store().find_element_user(NHSNUMBERSTATUSINDICATORCODEBABY$6, 0);
                if (target == null)
                {
                    return null;
                }
                return (uk.nhs.nhsia.datastandards.ecds.NHSNumberStatusIndicatorCodeUnverifiedType.Enum)target.getEnumValue();
            }
        }
        
        /**
         * Gets (as xml) the "NHSNumberStatusIndicatorCode_Baby" element
         */
        public uk.nhs.nhsia.datastandards.ecds.NHSNumberStatusIndicatorCodeUnverifiedType xgetNHSNumberStatusIndicatorCodeBaby()
        {
            synchronized (monitor())
            {
                check_orphaned();
                uk.nhs.nhsia.datastandards.ecds.NHSNumberStatusIndicatorCodeUnverifiedType target = null;
                target = (uk.nhs.nhsia.datastandards.ecds.NHSNumberStatusIndicatorCodeUnverifiedType)get_store().find_element_user(NHSNUMBERSTATUSINDICATORCODEBABY$6, 0);
                return target;
            }
        }
        
        /**
         * Sets the "NHSNumberStatusIndicatorCode_Baby" element
         */
        public void setNHSNumberStatusIndicatorCodeBaby(uk.nhs.nhsia.datastandards.ecds.NHSNumberStatusIndicatorCodeUnverifiedType.Enum nhsNumberStatusIndicatorCodeBaby)
        {
            synchronized (monitor())
            {
                check_orphaned();
                org.apache.xmlbeans.SimpleValue target = null;
                target = (org.apache.xmlbeans.SimpleValue)get_store().find_element_user(NHSNUMBERSTATUSINDICATORCODEBABY$6, 0);
                if (target == null)
                {
                    target = (org.apache.xmlbeans.SimpleValue)get_store().add_element_user(NHSNUMBERSTATUSINDICATORCODEBABY$6);
                }
                target.setEnumValue(nhsNumberStatusIndicatorCodeBaby);
            }
        }
        
        /**
         * Sets (as xml) the "NHSNumberStatusIndicatorCode_Baby" element
         */
        public void xsetNHSNumberStatusIndicatorCodeBaby(uk.nhs.nhsia.datastandards.ecds.NHSNumberStatusIndicatorCodeUnverifiedType nhsNumberStatusIndicatorCodeBaby)
        {
            synchronized (monitor())
            {
                check_orphaned();
                uk.nhs.nhsia.datastandards.ecds.NHSNumberStatusIndicatorCodeUnverifiedType target = null;
                target = (uk.nhs.nhsia.datastandards.ecds.NHSNumberStatusIndicatorCodeUnverifiedType)get_store().find_element_user(NHSNUMBERSTATUSINDICATORCODEBABY$6, 0);
                if (target == null)
                {
                    target = (uk.nhs.nhsia.datastandards.ecds.NHSNumberStatusIndicatorCodeUnverifiedType)get_store().add_element_user(NHSNUMBERSTATUSINDICATORCODEBABY$6);
                }
                target.set(nhsNumberStatusIndicatorCodeBaby);
            }
        }
        
        /**
         * Gets the "PersonBirthDate_Baby" element
         */
        public java.util.Calendar getPersonBirthDateBaby()
        {
            synchronized (monitor())
            {
                check_orphaned();
                org.apache.xmlbeans.SimpleValue target = null;
                target = (org.apache.xmlbeans.SimpleValue)get_store().find_element_user(PERSONBIRTHDATEBABY$8, 0);
                if (target == null)
                {
                    return null;
                }
                return target.getCalendarValue();
            }
        }
        
        /**
         * Gets (as xml) the "PersonBirthDate_Baby" element
         */
        public uk.nhs.nhsia.datastandards.ecds.PersonBirthDateType xgetPersonBirthDateBaby()
        {
            synchronized (monitor())
            {
                check_orphaned();
                uk.nhs.nhsia.datastandards.ecds.PersonBirthDateType target = null;
                target = (uk.nhs.nhsia.datastandards.ecds.PersonBirthDateType)get_store().find_element_user(PERSONBIRTHDATEBABY$8, 0);
                return target;
            }
        }
        
        /**
         * True if has "PersonBirthDate_Baby" element
         */
        public boolean isSetPersonBirthDateBaby()
        {
            synchronized (monitor())
            {
                check_orphaned();
                return get_store().count_elements(PERSONBIRTHDATEBABY$8) != 0;
            }
        }
        
        /**
         * Sets the "PersonBirthDate_Baby" element
         */
        public void setPersonBirthDateBaby(java.util.Calendar personBirthDateBaby)
        {
            synchronized (monitor())
            {
                check_orphaned();
                org.apache.xmlbeans.SimpleValue target = null;
                target = (org.apache.xmlbeans.SimpleValue)get_store().find_element_user(PERSONBIRTHDATEBABY$8, 0);
                if (target == null)
                {
                    target = (org.apache.xmlbeans.SimpleValue)get_store().add_element_user(PERSONBIRTHDATEBABY$8);
                }
                target.setCalendarValue(personBirthDateBaby);
            }
        }
        
        /**
         * Sets (as xml) the "PersonBirthDate_Baby" element
         */
        public void xsetPersonBirthDateBaby(uk.nhs.nhsia.datastandards.ecds.PersonBirthDateType personBirthDateBaby)
        {
            synchronized (monitor())
            {
                check_orphaned();
                uk.nhs.nhsia.datastandards.ecds.PersonBirthDateType target = null;
                target = (uk.nhs.nhsia.datastandards.ecds.PersonBirthDateType)get_store().find_element_user(PERSONBIRTHDATEBABY$8, 0);
                if (target == null)
                {
                    target = (uk.nhs.nhsia.datastandards.ecds.PersonBirthDateType)get_store().add_element_user(PERSONBIRTHDATEBABY$8);
                }
                target.set(personBirthDateBaby);
            }
        }
        
        /**
         * Unsets the "PersonBirthDate_Baby" element
         */
        public void unsetPersonBirthDateBaby()
        {
            synchronized (monitor())
            {
                check_orphaned();
                get_store().remove_element(PERSONBIRTHDATEBABY$8, 0);
            }
        }
        
        /**
         * Gets the "NHSNumberStatusIndicatorCode_Baby" attribute
         */
        public uk.nhs.nhsia.datastandards.ecds.NHSNumberStatusIndicatorCodeUnverifiedType.Enum getNHSNumberStatusIndicatorCodeBaby2()
        {
            synchronized (monitor())
            {
                check_orphaned();
                org.apache.xmlbeans.SimpleValue target = null;
                target = (org.apache.xmlbeans.SimpleValue)get_store().find_attribute_user(NHSNUMBERSTATUSINDICATORCODEBABY2$10);
                if (target == null)
                {
                    return null;
                }
                return (uk.nhs.nhsia.datastandards.ecds.NHSNumberStatusIndicatorCodeUnverifiedType.Enum)target.getEnumValue();
            }
        }
        
        /**
         * Gets (as xml) the "NHSNumberStatusIndicatorCode_Baby" attribute
         */
        public uk.nhs.nhsia.datastandards.ecds.NHSNumberStatusIndicatorCodeUnverifiedType xgetNHSNumberStatusIndicatorCodeBaby2()
        {
            synchronized (monitor())
            {
                check_orphaned();
                uk.nhs.nhsia.datastandards.ecds.NHSNumberStatusIndicatorCodeUnverifiedType target = null;
                target = (uk.nhs.nhsia.datastandards.ecds.NHSNumberStatusIndicatorCodeUnverifiedType)get_store().find_attribute_user(NHSNUMBERSTATUSINDICATORCODEBABY2$10);
                return target;
            }
        }
        
        /**
         * Sets the "NHSNumberStatusIndicatorCode_Baby" attribute
         */
        public void setNHSNumberStatusIndicatorCodeBaby2(uk.nhs.nhsia.datastandards.ecds.NHSNumberStatusIndicatorCodeUnverifiedType.Enum nhsNumberStatusIndicatorCodeBaby2)
        {
            synchronized (monitor())
            {
                check_orphaned();
                org.apache.xmlbeans.SimpleValue target = null;
                target = (org.apache.xmlbeans.SimpleValue)get_store().find_attribute_user(NHSNUMBERSTATUSINDICATORCODEBABY2$10);
                if (target == null)
                {
                    target = (org.apache.xmlbeans.SimpleValue)get_store().add_attribute_user(NHSNUMBERSTATUSINDICATORCODEBABY2$10);
                }
                target.setEnumValue(nhsNumberStatusIndicatorCodeBaby2);
            }
        }
        
        /**
         * Sets (as xml) the "NHSNumberStatusIndicatorCode_Baby" attribute
         */
        public void xsetNHSNumberStatusIndicatorCodeBaby2(uk.nhs.nhsia.datastandards.ecds.NHSNumberStatusIndicatorCodeUnverifiedType nhsNumberStatusIndicatorCodeBaby2)
        {
            synchronized (monitor())
            {
                check_orphaned();
                uk.nhs.nhsia.datastandards.ecds.NHSNumberStatusIndicatorCodeUnverifiedType target = null;
                target = (uk.nhs.nhsia.datastandards.ecds.NHSNumberStatusIndicatorCodeUnverifiedType)get_store().find_attribute_user(NHSNUMBERSTATUSINDICATORCODEBABY2$10);
                if (target == null)
                {
                    target = (uk.nhs.nhsia.datastandards.ecds.NHSNumberStatusIndicatorCodeUnverifiedType)get_store().add_attribute_user(NHSNUMBERSTATUSINDICATORCODEBABY2$10);
                }
                target.set(nhsNumberStatusIndicatorCodeBaby2);
            }
        }
    }
}
