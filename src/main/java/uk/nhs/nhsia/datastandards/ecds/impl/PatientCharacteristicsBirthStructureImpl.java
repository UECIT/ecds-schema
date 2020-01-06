/*
 * XML Type:  PatientCharacteristics_Birth_Structure
 * Namespace: http://www.nhsia.nhs.uk/DataStandards/XMLschema/CDS/ns
 * Java type: uk.nhs.nhsia.datastandards.ecds.PatientCharacteristicsBirthStructure
 *
 * Automatically generated - do not modify.
 */
package uk.nhs.nhsia.datastandards.ecds.impl;
/**
 * An XML PatientCharacteristics_Birth_Structure(@http://www.nhsia.nhs.uk/DataStandards/XMLschema/CDS/ns).
 *
 * This is a complex type.
 */
public class PatientCharacteristicsBirthStructureImpl extends org.apache.xmlbeans.impl.values.XmlComplexContentImpl implements uk.nhs.nhsia.datastandards.ecds.PatientCharacteristicsBirthStructure
{
    private static final long serialVersionUID = 1L;
    
    public PatientCharacteristicsBirthStructureImpl(org.apache.xmlbeans.SchemaType sType)
    {
        super(sType);
    }
    
    private static final javax.xml.namespace.QName PERSONGENDERCODECURRENT$0 = 
        new javax.xml.namespace.QName("http://www.nhsia.nhs.uk/DataStandards/XMLschema/CDS/ns", "PersonGenderCodeCurrent");
    private static final javax.xml.namespace.QName ETHNICCATEGORY$2 = 
        new javax.xml.namespace.QName("http://www.nhsia.nhs.uk/DataStandards/XMLschema/CDS/ns", "EthnicCategory");
    private static final javax.xml.namespace.QName LIVEORSTILLBIRTHCODE$4 = 
        new javax.xml.namespace.QName("http://www.nhsia.nhs.uk/DataStandards/XMLschema/CDS/ns", "LiveOrStillBirthCode");
    private static final javax.xml.namespace.QName BIRTHWEIGHT$6 = 
        new javax.xml.namespace.QName("http://www.nhsia.nhs.uk/DataStandards/XMLschema/CDS/ns", "BirthWeight");
    
    
    /**
     * Gets the "PersonGenderCodeCurrent" element
     */
    public uk.nhs.nhsia.datastandards.ecds.PersonGenderCodeType.Enum getPersonGenderCodeCurrent()
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.SimpleValue target = null;
            target = (org.apache.xmlbeans.SimpleValue)get_store().find_element_user(PERSONGENDERCODECURRENT$0, 0);
            if (target == null)
            {
                return null;
            }
            return (uk.nhs.nhsia.datastandards.ecds.PersonGenderCodeType.Enum)target.getEnumValue();
        }
    }
    
    /**
     * Gets (as xml) the "PersonGenderCodeCurrent" element
     */
    public uk.nhs.nhsia.datastandards.ecds.PersonGenderCodeCurrentType xgetPersonGenderCodeCurrent()
    {
        synchronized (monitor())
        {
            check_orphaned();
            uk.nhs.nhsia.datastandards.ecds.PersonGenderCodeCurrentType target = null;
            target = (uk.nhs.nhsia.datastandards.ecds.PersonGenderCodeCurrentType)get_store().find_element_user(PERSONGENDERCODECURRENT$0, 0);
            return target;
        }
    }
    
    /**
     * True if has "PersonGenderCodeCurrent" element
     */
    public boolean isSetPersonGenderCodeCurrent()
    {
        synchronized (monitor())
        {
            check_orphaned();
            return get_store().count_elements(PERSONGENDERCODECURRENT$0) != 0;
        }
    }
    
    /**
     * Sets the "PersonGenderCodeCurrent" element
     */
    public void setPersonGenderCodeCurrent(uk.nhs.nhsia.datastandards.ecds.PersonGenderCodeType.Enum personGenderCodeCurrent)
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.SimpleValue target = null;
            target = (org.apache.xmlbeans.SimpleValue)get_store().find_element_user(PERSONGENDERCODECURRENT$0, 0);
            if (target == null)
            {
                target = (org.apache.xmlbeans.SimpleValue)get_store().add_element_user(PERSONGENDERCODECURRENT$0);
            }
            target.setEnumValue(personGenderCodeCurrent);
        }
    }
    
    /**
     * Sets (as xml) the "PersonGenderCodeCurrent" element
     */
    public void xsetPersonGenderCodeCurrent(uk.nhs.nhsia.datastandards.ecds.PersonGenderCodeCurrentType personGenderCodeCurrent)
    {
        synchronized (monitor())
        {
            check_orphaned();
            uk.nhs.nhsia.datastandards.ecds.PersonGenderCodeCurrentType target = null;
            target = (uk.nhs.nhsia.datastandards.ecds.PersonGenderCodeCurrentType)get_store().find_element_user(PERSONGENDERCODECURRENT$0, 0);
            if (target == null)
            {
                target = (uk.nhs.nhsia.datastandards.ecds.PersonGenderCodeCurrentType)get_store().add_element_user(PERSONGENDERCODECURRENT$0);
            }
            target.set(personGenderCodeCurrent);
        }
    }
    
    /**
     * Unsets the "PersonGenderCodeCurrent" element
     */
    public void unsetPersonGenderCodeCurrent()
    {
        synchronized (monitor())
        {
            check_orphaned();
            get_store().remove_element(PERSONGENDERCODECURRENT$0, 0);
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
     * Gets the "LiveOrStillBirthCode" element
     */
    public uk.nhs.nhsia.datastandards.ecds.LiveOrStillBirthCodeType.Enum getLiveOrStillBirthCode()
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.SimpleValue target = null;
            target = (org.apache.xmlbeans.SimpleValue)get_store().find_element_user(LIVEORSTILLBIRTHCODE$4, 0);
            if (target == null)
            {
                return null;
            }
            return (uk.nhs.nhsia.datastandards.ecds.LiveOrStillBirthCodeType.Enum)target.getEnumValue();
        }
    }
    
    /**
     * Gets (as xml) the "LiveOrStillBirthCode" element
     */
    public uk.nhs.nhsia.datastandards.ecds.LiveOrStillBirthCodeType xgetLiveOrStillBirthCode()
    {
        synchronized (monitor())
        {
            check_orphaned();
            uk.nhs.nhsia.datastandards.ecds.LiveOrStillBirthCodeType target = null;
            target = (uk.nhs.nhsia.datastandards.ecds.LiveOrStillBirthCodeType)get_store().find_element_user(LIVEORSTILLBIRTHCODE$4, 0);
            return target;
        }
    }
    
    /**
     * True if has "LiveOrStillBirthCode" element
     */
    public boolean isSetLiveOrStillBirthCode()
    {
        synchronized (monitor())
        {
            check_orphaned();
            return get_store().count_elements(LIVEORSTILLBIRTHCODE$4) != 0;
        }
    }
    
    /**
     * Sets the "LiveOrStillBirthCode" element
     */
    public void setLiveOrStillBirthCode(uk.nhs.nhsia.datastandards.ecds.LiveOrStillBirthCodeType.Enum liveOrStillBirthCode)
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.SimpleValue target = null;
            target = (org.apache.xmlbeans.SimpleValue)get_store().find_element_user(LIVEORSTILLBIRTHCODE$4, 0);
            if (target == null)
            {
                target = (org.apache.xmlbeans.SimpleValue)get_store().add_element_user(LIVEORSTILLBIRTHCODE$4);
            }
            target.setEnumValue(liveOrStillBirthCode);
        }
    }
    
    /**
     * Sets (as xml) the "LiveOrStillBirthCode" element
     */
    public void xsetLiveOrStillBirthCode(uk.nhs.nhsia.datastandards.ecds.LiveOrStillBirthCodeType liveOrStillBirthCode)
    {
        synchronized (monitor())
        {
            check_orphaned();
            uk.nhs.nhsia.datastandards.ecds.LiveOrStillBirthCodeType target = null;
            target = (uk.nhs.nhsia.datastandards.ecds.LiveOrStillBirthCodeType)get_store().find_element_user(LIVEORSTILLBIRTHCODE$4, 0);
            if (target == null)
            {
                target = (uk.nhs.nhsia.datastandards.ecds.LiveOrStillBirthCodeType)get_store().add_element_user(LIVEORSTILLBIRTHCODE$4);
            }
            target.set(liveOrStillBirthCode);
        }
    }
    
    /**
     * Unsets the "LiveOrStillBirthCode" element
     */
    public void unsetLiveOrStillBirthCode()
    {
        synchronized (monitor())
        {
            check_orphaned();
            get_store().remove_element(LIVEORSTILLBIRTHCODE$4, 0);
        }
    }
    
    /**
     * Gets the "BirthWeight" element
     */
    public int getBirthWeight()
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.SimpleValue target = null;
            target = (org.apache.xmlbeans.SimpleValue)get_store().find_element_user(BIRTHWEIGHT$6, 0);
            if (target == null)
            {
                return 0;
            }
            return target.getIntValue();
        }
    }
    
    /**
     * Gets (as xml) the "BirthWeight" element
     */
    public uk.nhs.nhsia.datastandards.ecds.BirthWeightType xgetBirthWeight()
    {
        synchronized (monitor())
        {
            check_orphaned();
            uk.nhs.nhsia.datastandards.ecds.BirthWeightType target = null;
            target = (uk.nhs.nhsia.datastandards.ecds.BirthWeightType)get_store().find_element_user(BIRTHWEIGHT$6, 0);
            return target;
        }
    }
    
    /**
     * True if has "BirthWeight" element
     */
    public boolean isSetBirthWeight()
    {
        synchronized (monitor())
        {
            check_orphaned();
            return get_store().count_elements(BIRTHWEIGHT$6) != 0;
        }
    }
    
    /**
     * Sets the "BirthWeight" element
     */
    public void setBirthWeight(int birthWeight)
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.SimpleValue target = null;
            target = (org.apache.xmlbeans.SimpleValue)get_store().find_element_user(BIRTHWEIGHT$6, 0);
            if (target == null)
            {
                target = (org.apache.xmlbeans.SimpleValue)get_store().add_element_user(BIRTHWEIGHT$6);
            }
            target.setIntValue(birthWeight);
        }
    }
    
    /**
     * Sets (as xml) the "BirthWeight" element
     */
    public void xsetBirthWeight(uk.nhs.nhsia.datastandards.ecds.BirthWeightType birthWeight)
    {
        synchronized (monitor())
        {
            check_orphaned();
            uk.nhs.nhsia.datastandards.ecds.BirthWeightType target = null;
            target = (uk.nhs.nhsia.datastandards.ecds.BirthWeightType)get_store().find_element_user(BIRTHWEIGHT$6, 0);
            if (target == null)
            {
                target = (uk.nhs.nhsia.datastandards.ecds.BirthWeightType)get_store().add_element_user(BIRTHWEIGHT$6);
            }
            target.set(birthWeight);
        }
    }
    
    /**
     * Unsets the "BirthWeight" element
     */
    public void unsetBirthWeight()
    {
        synchronized (monitor())
        {
            check_orphaned();
            get_store().remove_element(BIRTHWEIGHT$6, 0);
        }
    }
}
