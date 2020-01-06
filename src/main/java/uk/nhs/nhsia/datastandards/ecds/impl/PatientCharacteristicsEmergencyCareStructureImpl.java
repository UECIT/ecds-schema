/*
 * XML Type:  PatientCharacteristics_EmergencyCare_Structure
 * Namespace: http://www.nhsia.nhs.uk/DataStandards/XMLschema/CDS/ns
 * Java type: uk.nhs.nhsia.datastandards.ecds.PatientCharacteristicsEmergencyCareStructure
 *
 * Automatically generated - do not modify.
 */
package uk.nhs.nhsia.datastandards.ecds.impl;
/**
 * An XML PatientCharacteristics_EmergencyCare_Structure(@http://www.nhsia.nhs.uk/DataStandards/XMLschema/CDS/ns).
 *
 * This is a complex type.
 */
public class PatientCharacteristicsEmergencyCareStructureImpl extends org.apache.xmlbeans.impl.values.XmlComplexContentImpl implements uk.nhs.nhsia.datastandards.ecds.PatientCharacteristicsEmergencyCareStructure
{
    private static final long serialVersionUID = 1L;
    
    public PatientCharacteristicsEmergencyCareStructureImpl(org.apache.xmlbeans.SchemaType sType)
    {
        super(sType);
    }
    
    private static final javax.xml.namespace.QName PERSONSTATEDGENDERCODE$0 = 
        new javax.xml.namespace.QName("http://www.nhsia.nhs.uk/DataStandards/XMLschema/CDS/ns", "PersonStatedGenderCode");
    private static final javax.xml.namespace.QName ETHNICCATEGORY$2 = 
        new javax.xml.namespace.QName("http://www.nhsia.nhs.uk/DataStandards/XMLschema/CDS/ns", "EthnicCategory");
    private static final javax.xml.namespace.QName ACCOMMODATIONSTATUSSNOMEDCT$4 = 
        new javax.xml.namespace.QName("http://www.nhsia.nhs.uk/DataStandards/XMLschema/CDS/ns", "AccommodationStatus_SnomedCt");
    private static final javax.xml.namespace.QName PREFERREDSPOKENLANGUAGESNOMEDCT$6 = 
        new javax.xml.namespace.QName("http://www.nhsia.nhs.uk/DataStandards/XMLschema/CDS/ns", "PreferredSpokenLanguage_SnomedCt");
    private static final javax.xml.namespace.QName ACCESSIBLEINFORMATIONPROFESSIONALREQUIREDCODESNOMEDCT$8 = 
        new javax.xml.namespace.QName("http://www.nhsia.nhs.uk/DataStandards/XMLschema/CDS/ns", "AccessibleInformationProfessionalRequiredCode_SnomedCt");
    private static final javax.xml.namespace.QName INTERPRETERLANGUAGESNOMEDCT$10 = 
        new javax.xml.namespace.QName("http://www.nhsia.nhs.uk/DataStandards/XMLschema/CDS/ns", "InterpreterLanguage_SnomedCt");
    private static final javax.xml.namespace.QName OVERSEASVISITORCHARGINGCATEGORYATCDSACTIVITYDATE$12 = 
        new javax.xml.namespace.QName("http://www.nhsia.nhs.uk/DataStandards/XMLschema/CDS/ns", "OverseasVisitorChargingCategoryAtCdsActivityDate");
    
    
    /**
     * Gets the "PersonStatedGenderCode" element
     */
    public uk.nhs.nhsia.datastandards.ecds.PersonStatedGenderCodeECType.Enum getPersonStatedGenderCode()
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.SimpleValue target = null;
            target = (org.apache.xmlbeans.SimpleValue)get_store().find_element_user(PERSONSTATEDGENDERCODE$0, 0);
            if (target == null)
            {
                return null;
            }
            return (uk.nhs.nhsia.datastandards.ecds.PersonStatedGenderCodeECType.Enum)target.getEnumValue();
        }
    }
    
    /**
     * Gets (as xml) the "PersonStatedGenderCode" element
     */
    public uk.nhs.nhsia.datastandards.ecds.PersonStatedGenderCodeECType xgetPersonStatedGenderCode()
    {
        synchronized (monitor())
        {
            check_orphaned();
            uk.nhs.nhsia.datastandards.ecds.PersonStatedGenderCodeECType target = null;
            target = (uk.nhs.nhsia.datastandards.ecds.PersonStatedGenderCodeECType)get_store().find_element_user(PERSONSTATEDGENDERCODE$0, 0);
            return target;
        }
    }
    
    /**
     * True if has "PersonStatedGenderCode" element
     */
    public boolean isSetPersonStatedGenderCode()
    {
        synchronized (monitor())
        {
            check_orphaned();
            return get_store().count_elements(PERSONSTATEDGENDERCODE$0) != 0;
        }
    }
    
    /**
     * Sets the "PersonStatedGenderCode" element
     */
    public void setPersonStatedGenderCode(uk.nhs.nhsia.datastandards.ecds.PersonStatedGenderCodeECType.Enum personStatedGenderCode)
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.SimpleValue target = null;
            target = (org.apache.xmlbeans.SimpleValue)get_store().find_element_user(PERSONSTATEDGENDERCODE$0, 0);
            if (target == null)
            {
                target = (org.apache.xmlbeans.SimpleValue)get_store().add_element_user(PERSONSTATEDGENDERCODE$0);
            }
            target.setEnumValue(personStatedGenderCode);
        }
    }
    
    /**
     * Sets (as xml) the "PersonStatedGenderCode" element
     */
    public void xsetPersonStatedGenderCode(uk.nhs.nhsia.datastandards.ecds.PersonStatedGenderCodeECType personStatedGenderCode)
    {
        synchronized (monitor())
        {
            check_orphaned();
            uk.nhs.nhsia.datastandards.ecds.PersonStatedGenderCodeECType target = null;
            target = (uk.nhs.nhsia.datastandards.ecds.PersonStatedGenderCodeECType)get_store().find_element_user(PERSONSTATEDGENDERCODE$0, 0);
            if (target == null)
            {
                target = (uk.nhs.nhsia.datastandards.ecds.PersonStatedGenderCodeECType)get_store().add_element_user(PERSONSTATEDGENDERCODE$0);
            }
            target.set(personStatedGenderCode);
        }
    }
    
    /**
     * Unsets the "PersonStatedGenderCode" element
     */
    public void unsetPersonStatedGenderCode()
    {
        synchronized (monitor())
        {
            check_orphaned();
            get_store().remove_element(PERSONSTATEDGENDERCODE$0, 0);
        }
    }
    
    /**
     * Gets the "EthnicCategory" element
     */
    public java.lang.String getEthnicCategory()
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.SimpleValue target = null;
            target = (org.apache.xmlbeans.SimpleValue)get_store().find_element_user(ETHNICCATEGORY$2, 0);
            if (target == null)
            {
                return null;
            }
            return target.getStringValue();
        }
    }
    
    /**
     * Gets (as xml) the "EthnicCategory" element
     */
    public uk.nhs.nhsia.datastandards.ecds.EthnicCategoryType xgetEthnicCategory()
    {
        synchronized (monitor())
        {
            check_orphaned();
            uk.nhs.nhsia.datastandards.ecds.EthnicCategoryType target = null;
            target = (uk.nhs.nhsia.datastandards.ecds.EthnicCategoryType)get_store().find_element_user(ETHNICCATEGORY$2, 0);
            return target;
        }
    }
    
    /**
     * True if has "EthnicCategory" element
     */
    public boolean isSetEthnicCategory()
    {
        synchronized (monitor())
        {
            check_orphaned();
            return get_store().count_elements(ETHNICCATEGORY$2) != 0;
        }
    }
    
    /**
     * Sets the "EthnicCategory" element
     */
    public void setEthnicCategory(java.lang.String ethnicCategory)
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.SimpleValue target = null;
            target = (org.apache.xmlbeans.SimpleValue)get_store().find_element_user(ETHNICCATEGORY$2, 0);
            if (target == null)
            {
                target = (org.apache.xmlbeans.SimpleValue)get_store().add_element_user(ETHNICCATEGORY$2);
            }
            target.setStringValue(ethnicCategory);
        }
    }
    
    /**
     * Sets (as xml) the "EthnicCategory" element
     */
    public void xsetEthnicCategory(uk.nhs.nhsia.datastandards.ecds.EthnicCategoryType ethnicCategory)
    {
        synchronized (monitor())
        {
            check_orphaned();
            uk.nhs.nhsia.datastandards.ecds.EthnicCategoryType target = null;
            target = (uk.nhs.nhsia.datastandards.ecds.EthnicCategoryType)get_store().find_element_user(ETHNICCATEGORY$2, 0);
            if (target == null)
            {
                target = (uk.nhs.nhsia.datastandards.ecds.EthnicCategoryType)get_store().add_element_user(ETHNICCATEGORY$2);
            }
            target.set(ethnicCategory);
        }
    }
    
    /**
     * Unsets the "EthnicCategory" element
     */
    public void unsetEthnicCategory()
    {
        synchronized (monitor())
        {
            check_orphaned();
            get_store().remove_element(ETHNICCATEGORY$2, 0);
        }
    }
    
    /**
     * Gets the "AccommodationStatus_SnomedCt" element
     */
    public java.lang.String getAccommodationStatusSnomedCt()
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.SimpleValue target = null;
            target = (org.apache.xmlbeans.SimpleValue)get_store().find_element_user(ACCOMMODATIONSTATUSSNOMEDCT$4, 0);
            if (target == null)
            {
                return null;
            }
            return target.getStringValue();
        }
    }
    
    /**
     * Gets (as xml) the "AccommodationStatus_SnomedCt" element
     */
    public uk.nhs.nhsia.datastandards.ecds.N618ECType xgetAccommodationStatusSnomedCt()
    {
        synchronized (monitor())
        {
            check_orphaned();
            uk.nhs.nhsia.datastandards.ecds.N618ECType target = null;
            target = (uk.nhs.nhsia.datastandards.ecds.N618ECType)get_store().find_element_user(ACCOMMODATIONSTATUSSNOMEDCT$4, 0);
            return target;
        }
    }
    
    /**
     * True if has "AccommodationStatus_SnomedCt" element
     */
    public boolean isSetAccommodationStatusSnomedCt()
    {
        synchronized (monitor())
        {
            check_orphaned();
            return get_store().count_elements(ACCOMMODATIONSTATUSSNOMEDCT$4) != 0;
        }
    }
    
    /**
     * Sets the "AccommodationStatus_SnomedCt" element
     */
    public void setAccommodationStatusSnomedCt(java.lang.String accommodationStatusSnomedCt)
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.SimpleValue target = null;
            target = (org.apache.xmlbeans.SimpleValue)get_store().find_element_user(ACCOMMODATIONSTATUSSNOMEDCT$4, 0);
            if (target == null)
            {
                target = (org.apache.xmlbeans.SimpleValue)get_store().add_element_user(ACCOMMODATIONSTATUSSNOMEDCT$4);
            }
            target.setStringValue(accommodationStatusSnomedCt);
        }
    }
    
    /**
     * Sets (as xml) the "AccommodationStatus_SnomedCt" element
     */
    public void xsetAccommodationStatusSnomedCt(uk.nhs.nhsia.datastandards.ecds.N618ECType accommodationStatusSnomedCt)
    {
        synchronized (monitor())
        {
            check_orphaned();
            uk.nhs.nhsia.datastandards.ecds.N618ECType target = null;
            target = (uk.nhs.nhsia.datastandards.ecds.N618ECType)get_store().find_element_user(ACCOMMODATIONSTATUSSNOMEDCT$4, 0);
            if (target == null)
            {
                target = (uk.nhs.nhsia.datastandards.ecds.N618ECType)get_store().add_element_user(ACCOMMODATIONSTATUSSNOMEDCT$4);
            }
            target.set(accommodationStatusSnomedCt);
        }
    }
    
    /**
     * Unsets the "AccommodationStatus_SnomedCt" element
     */
    public void unsetAccommodationStatusSnomedCt()
    {
        synchronized (monitor())
        {
            check_orphaned();
            get_store().remove_element(ACCOMMODATIONSTATUSSNOMEDCT$4, 0);
        }
    }
    
    /**
     * Gets the "PreferredSpokenLanguage_SnomedCt" element
     */
    public java.lang.String getPreferredSpokenLanguageSnomedCt()
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.SimpleValue target = null;
            target = (org.apache.xmlbeans.SimpleValue)get_store().find_element_user(PREFERREDSPOKENLANGUAGESNOMEDCT$6, 0);
            if (target == null)
            {
                return null;
            }
            return target.getStringValue();
        }
    }
    
    /**
     * Gets (as xml) the "PreferredSpokenLanguage_SnomedCt" element
     */
    public uk.nhs.nhsia.datastandards.ecds.N618ECType xgetPreferredSpokenLanguageSnomedCt()
    {
        synchronized (monitor())
        {
            check_orphaned();
            uk.nhs.nhsia.datastandards.ecds.N618ECType target = null;
            target = (uk.nhs.nhsia.datastandards.ecds.N618ECType)get_store().find_element_user(PREFERREDSPOKENLANGUAGESNOMEDCT$6, 0);
            return target;
        }
    }
    
    /**
     * True if has "PreferredSpokenLanguage_SnomedCt" element
     */
    public boolean isSetPreferredSpokenLanguageSnomedCt()
    {
        synchronized (monitor())
        {
            check_orphaned();
            return get_store().count_elements(PREFERREDSPOKENLANGUAGESNOMEDCT$6) != 0;
        }
    }
    
    /**
     * Sets the "PreferredSpokenLanguage_SnomedCt" element
     */
    public void setPreferredSpokenLanguageSnomedCt(java.lang.String preferredSpokenLanguageSnomedCt)
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.SimpleValue target = null;
            target = (org.apache.xmlbeans.SimpleValue)get_store().find_element_user(PREFERREDSPOKENLANGUAGESNOMEDCT$6, 0);
            if (target == null)
            {
                target = (org.apache.xmlbeans.SimpleValue)get_store().add_element_user(PREFERREDSPOKENLANGUAGESNOMEDCT$6);
            }
            target.setStringValue(preferredSpokenLanguageSnomedCt);
        }
    }
    
    /**
     * Sets (as xml) the "PreferredSpokenLanguage_SnomedCt" element
     */
    public void xsetPreferredSpokenLanguageSnomedCt(uk.nhs.nhsia.datastandards.ecds.N618ECType preferredSpokenLanguageSnomedCt)
    {
        synchronized (monitor())
        {
            check_orphaned();
            uk.nhs.nhsia.datastandards.ecds.N618ECType target = null;
            target = (uk.nhs.nhsia.datastandards.ecds.N618ECType)get_store().find_element_user(PREFERREDSPOKENLANGUAGESNOMEDCT$6, 0);
            if (target == null)
            {
                target = (uk.nhs.nhsia.datastandards.ecds.N618ECType)get_store().add_element_user(PREFERREDSPOKENLANGUAGESNOMEDCT$6);
            }
            target.set(preferredSpokenLanguageSnomedCt);
        }
    }
    
    /**
     * Unsets the "PreferredSpokenLanguage_SnomedCt" element
     */
    public void unsetPreferredSpokenLanguageSnomedCt()
    {
        synchronized (monitor())
        {
            check_orphaned();
            get_store().remove_element(PREFERREDSPOKENLANGUAGESNOMEDCT$6, 0);
        }
    }
    
    /**
     * Gets the "AccessibleInformationProfessionalRequiredCode_SnomedCt" element
     */
    public java.lang.String getAccessibleInformationProfessionalRequiredCodeSnomedCt()
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.SimpleValue target = null;
            target = (org.apache.xmlbeans.SimpleValue)get_store().find_element_user(ACCESSIBLEINFORMATIONPROFESSIONALREQUIREDCODESNOMEDCT$8, 0);
            if (target == null)
            {
                return null;
            }
            return target.getStringValue();
        }
    }
    
    /**
     * Gets (as xml) the "AccessibleInformationProfessionalRequiredCode_SnomedCt" element
     */
    public uk.nhs.nhsia.datastandards.ecds.N618ECType xgetAccessibleInformationProfessionalRequiredCodeSnomedCt()
    {
        synchronized (monitor())
        {
            check_orphaned();
            uk.nhs.nhsia.datastandards.ecds.N618ECType target = null;
            target = (uk.nhs.nhsia.datastandards.ecds.N618ECType)get_store().find_element_user(ACCESSIBLEINFORMATIONPROFESSIONALREQUIREDCODESNOMEDCT$8, 0);
            return target;
        }
    }
    
    /**
     * True if has "AccessibleInformationProfessionalRequiredCode_SnomedCt" element
     */
    public boolean isSetAccessibleInformationProfessionalRequiredCodeSnomedCt()
    {
        synchronized (monitor())
        {
            check_orphaned();
            return get_store().count_elements(ACCESSIBLEINFORMATIONPROFESSIONALREQUIREDCODESNOMEDCT$8) != 0;
        }
    }
    
    /**
     * Sets the "AccessibleInformationProfessionalRequiredCode_SnomedCt" element
     */
    public void setAccessibleInformationProfessionalRequiredCodeSnomedCt(java.lang.String accessibleInformationProfessionalRequiredCodeSnomedCt)
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.SimpleValue target = null;
            target = (org.apache.xmlbeans.SimpleValue)get_store().find_element_user(ACCESSIBLEINFORMATIONPROFESSIONALREQUIREDCODESNOMEDCT$8, 0);
            if (target == null)
            {
                target = (org.apache.xmlbeans.SimpleValue)get_store().add_element_user(ACCESSIBLEINFORMATIONPROFESSIONALREQUIREDCODESNOMEDCT$8);
            }
            target.setStringValue(accessibleInformationProfessionalRequiredCodeSnomedCt);
        }
    }
    
    /**
     * Sets (as xml) the "AccessibleInformationProfessionalRequiredCode_SnomedCt" element
     */
    public void xsetAccessibleInformationProfessionalRequiredCodeSnomedCt(uk.nhs.nhsia.datastandards.ecds.N618ECType accessibleInformationProfessionalRequiredCodeSnomedCt)
    {
        synchronized (monitor())
        {
            check_orphaned();
            uk.nhs.nhsia.datastandards.ecds.N618ECType target = null;
            target = (uk.nhs.nhsia.datastandards.ecds.N618ECType)get_store().find_element_user(ACCESSIBLEINFORMATIONPROFESSIONALREQUIREDCODESNOMEDCT$8, 0);
            if (target == null)
            {
                target = (uk.nhs.nhsia.datastandards.ecds.N618ECType)get_store().add_element_user(ACCESSIBLEINFORMATIONPROFESSIONALREQUIREDCODESNOMEDCT$8);
            }
            target.set(accessibleInformationProfessionalRequiredCodeSnomedCt);
        }
    }
    
    /**
     * Unsets the "AccessibleInformationProfessionalRequiredCode_SnomedCt" element
     */
    public void unsetAccessibleInformationProfessionalRequiredCodeSnomedCt()
    {
        synchronized (monitor())
        {
            check_orphaned();
            get_store().remove_element(ACCESSIBLEINFORMATIONPROFESSIONALREQUIREDCODESNOMEDCT$8, 0);
        }
    }
    
    /**
     * Gets the "InterpreterLanguage_SnomedCt" element
     */
    public java.lang.String getInterpreterLanguageSnomedCt()
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.SimpleValue target = null;
            target = (org.apache.xmlbeans.SimpleValue)get_store().find_element_user(INTERPRETERLANGUAGESNOMEDCT$10, 0);
            if (target == null)
            {
                return null;
            }
            return target.getStringValue();
        }
    }
    
    /**
     * Gets (as xml) the "InterpreterLanguage_SnomedCt" element
     */
    public uk.nhs.nhsia.datastandards.ecds.N618ECType xgetInterpreterLanguageSnomedCt()
    {
        synchronized (monitor())
        {
            check_orphaned();
            uk.nhs.nhsia.datastandards.ecds.N618ECType target = null;
            target = (uk.nhs.nhsia.datastandards.ecds.N618ECType)get_store().find_element_user(INTERPRETERLANGUAGESNOMEDCT$10, 0);
            return target;
        }
    }
    
    /**
     * True if has "InterpreterLanguage_SnomedCt" element
     */
    public boolean isSetInterpreterLanguageSnomedCt()
    {
        synchronized (monitor())
        {
            check_orphaned();
            return get_store().count_elements(INTERPRETERLANGUAGESNOMEDCT$10) != 0;
        }
    }
    
    /**
     * Sets the "InterpreterLanguage_SnomedCt" element
     */
    public void setInterpreterLanguageSnomedCt(java.lang.String interpreterLanguageSnomedCt)
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.SimpleValue target = null;
            target = (org.apache.xmlbeans.SimpleValue)get_store().find_element_user(INTERPRETERLANGUAGESNOMEDCT$10, 0);
            if (target == null)
            {
                target = (org.apache.xmlbeans.SimpleValue)get_store().add_element_user(INTERPRETERLANGUAGESNOMEDCT$10);
            }
            target.setStringValue(interpreterLanguageSnomedCt);
        }
    }
    
    /**
     * Sets (as xml) the "InterpreterLanguage_SnomedCt" element
     */
    public void xsetInterpreterLanguageSnomedCt(uk.nhs.nhsia.datastandards.ecds.N618ECType interpreterLanguageSnomedCt)
    {
        synchronized (monitor())
        {
            check_orphaned();
            uk.nhs.nhsia.datastandards.ecds.N618ECType target = null;
            target = (uk.nhs.nhsia.datastandards.ecds.N618ECType)get_store().find_element_user(INTERPRETERLANGUAGESNOMEDCT$10, 0);
            if (target == null)
            {
                target = (uk.nhs.nhsia.datastandards.ecds.N618ECType)get_store().add_element_user(INTERPRETERLANGUAGESNOMEDCT$10);
            }
            target.set(interpreterLanguageSnomedCt);
        }
    }
    
    /**
     * Unsets the "InterpreterLanguage_SnomedCt" element
     */
    public void unsetInterpreterLanguageSnomedCt()
    {
        synchronized (monitor())
        {
            check_orphaned();
            get_store().remove_element(INTERPRETERLANGUAGESNOMEDCT$10, 0);
        }
    }
    
    /**
     * Gets the "OverseasVisitorChargingCategoryAtCdsActivityDate" element
     */
    public uk.nhs.nhsia.datastandards.ecds.OverseasECType.Enum getOverseasVisitorChargingCategoryAtCdsActivityDate()
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.SimpleValue target = null;
            target = (org.apache.xmlbeans.SimpleValue)get_store().find_element_user(OVERSEASVISITORCHARGINGCATEGORYATCDSACTIVITYDATE$12, 0);
            if (target == null)
            {
                return null;
            }
            return (uk.nhs.nhsia.datastandards.ecds.OverseasECType.Enum)target.getEnumValue();
        }
    }
    
    /**
     * Gets (as xml) the "OverseasVisitorChargingCategoryAtCdsActivityDate" element
     */
    public uk.nhs.nhsia.datastandards.ecds.OverseasECType xgetOverseasVisitorChargingCategoryAtCdsActivityDate()
    {
        synchronized (monitor())
        {
            check_orphaned();
            uk.nhs.nhsia.datastandards.ecds.OverseasECType target = null;
            target = (uk.nhs.nhsia.datastandards.ecds.OverseasECType)get_store().find_element_user(OVERSEASVISITORCHARGINGCATEGORYATCDSACTIVITYDATE$12, 0);
            return target;
        }
    }
    
    /**
     * True if has "OverseasVisitorChargingCategoryAtCdsActivityDate" element
     */
    public boolean isSetOverseasVisitorChargingCategoryAtCdsActivityDate()
    {
        synchronized (monitor())
        {
            check_orphaned();
            return get_store().count_elements(OVERSEASVISITORCHARGINGCATEGORYATCDSACTIVITYDATE$12) != 0;
        }
    }
    
    /**
     * Sets the "OverseasVisitorChargingCategoryAtCdsActivityDate" element
     */
    public void setOverseasVisitorChargingCategoryAtCdsActivityDate(uk.nhs.nhsia.datastandards.ecds.OverseasECType.Enum overseasVisitorChargingCategoryAtCdsActivityDate)
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.SimpleValue target = null;
            target = (org.apache.xmlbeans.SimpleValue)get_store().find_element_user(OVERSEASVISITORCHARGINGCATEGORYATCDSACTIVITYDATE$12, 0);
            if (target == null)
            {
                target = (org.apache.xmlbeans.SimpleValue)get_store().add_element_user(OVERSEASVISITORCHARGINGCATEGORYATCDSACTIVITYDATE$12);
            }
            target.setEnumValue(overseasVisitorChargingCategoryAtCdsActivityDate);
        }
    }
    
    /**
     * Sets (as xml) the "OverseasVisitorChargingCategoryAtCdsActivityDate" element
     */
    public void xsetOverseasVisitorChargingCategoryAtCdsActivityDate(uk.nhs.nhsia.datastandards.ecds.OverseasECType overseasVisitorChargingCategoryAtCdsActivityDate)
    {
        synchronized (monitor())
        {
            check_orphaned();
            uk.nhs.nhsia.datastandards.ecds.OverseasECType target = null;
            target = (uk.nhs.nhsia.datastandards.ecds.OverseasECType)get_store().find_element_user(OVERSEASVISITORCHARGINGCATEGORYATCDSACTIVITYDATE$12, 0);
            if (target == null)
            {
                target = (uk.nhs.nhsia.datastandards.ecds.OverseasECType)get_store().add_element_user(OVERSEASVISITORCHARGINGCATEGORYATCDSACTIVITYDATE$12);
            }
            target.set(overseasVisitorChargingCategoryAtCdsActivityDate);
        }
    }
    
    /**
     * Unsets the "OverseasVisitorChargingCategoryAtCdsActivityDate" element
     */
    public void unsetOverseasVisitorChargingCategoryAtCdsActivityDate()
    {
        synchronized (monitor())
        {
            check_orphaned();
            get_store().remove_element(OVERSEASVISITORCHARGINGCATEGORYATCDSACTIVITYDATE$12, 0);
        }
    }
}
