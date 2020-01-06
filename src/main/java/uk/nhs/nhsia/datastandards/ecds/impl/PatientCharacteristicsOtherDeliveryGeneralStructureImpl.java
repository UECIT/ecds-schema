/*
 * XML Type:  PatientCharacteristics_OtherDelivery_General_Structure
 * Namespace: http://www.nhsia.nhs.uk/DataStandards/XMLschema/CDS/ns
 * Java type: uk.nhs.nhsia.datastandards.ecds.PatientCharacteristicsOtherDeliveryGeneralStructure
 *
 * Automatically generated - do not modify.
 */
package uk.nhs.nhsia.datastandards.ecds.impl;
/**
 * An XML PatientCharacteristics_OtherDelivery_General_Structure(@http://www.nhsia.nhs.uk/DataStandards/XMLschema/CDS/ns).
 *
 * This is a complex type.
 */
public class PatientCharacteristicsOtherDeliveryGeneralStructureImpl extends org.apache.xmlbeans.impl.values.XmlComplexContentImpl implements uk.nhs.nhsia.datastandards.ecds.PatientCharacteristicsOtherDeliveryGeneralStructure
{
    private static final long serialVersionUID = 1L;
    
    public PatientCharacteristicsOtherDeliveryGeneralStructureImpl(org.apache.xmlbeans.SchemaType sType)
    {
        super(sType);
    }
    
    private static final javax.xml.namespace.QName PERSONGENDERCODECURRENT$0 = 
        new javax.xml.namespace.QName("http://www.nhsia.nhs.uk/DataStandards/XMLschema/CDS/ns", "PersonGenderCodeCurrent");
    private static final javax.xml.namespace.QName CARERSUPPORTINDICATOR$2 = 
        new javax.xml.namespace.QName("http://www.nhsia.nhs.uk/DataStandards/XMLschema/CDS/ns", "CarerSupportIndicator");
    private static final javax.xml.namespace.QName ETHNICCATEGORY$4 = 
        new javax.xml.namespace.QName("http://www.nhsia.nhs.uk/DataStandards/XMLschema/CDS/ns", "EthnicCategory");
    private static final javax.xml.namespace.QName PERSONMARITALSTATUS$6 = 
        new javax.xml.namespace.QName("http://www.nhsia.nhs.uk/DataStandards/XMLschema/CDS/ns", "PersonMaritalStatus");
    
    
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
     * Gets the "CarerSupportIndicator" element
     */
    public uk.nhs.nhsia.datastandards.ecds.CarerSupportIndicatorType.Enum getCarerSupportIndicator()
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.SimpleValue target = null;
            target = (org.apache.xmlbeans.SimpleValue)get_store().find_element_user(CARERSUPPORTINDICATOR$2, 0);
            if (target == null)
            {
                return null;
            }
            return (uk.nhs.nhsia.datastandards.ecds.CarerSupportIndicatorType.Enum)target.getEnumValue();
        }
    }
    
    /**
     * Gets (as xml) the "CarerSupportIndicator" element
     */
    public uk.nhs.nhsia.datastandards.ecds.CarerSupportIndicatorType xgetCarerSupportIndicator()
    {
        synchronized (monitor())
        {
            check_orphaned();
            uk.nhs.nhsia.datastandards.ecds.CarerSupportIndicatorType target = null;
            target = (uk.nhs.nhsia.datastandards.ecds.CarerSupportIndicatorType)get_store().find_element_user(CARERSUPPORTINDICATOR$2, 0);
            return target;
        }
    }
    
    /**
     * True if has "CarerSupportIndicator" element
     */
    public boolean isSetCarerSupportIndicator()
    {
        synchronized (monitor())
        {
            check_orphaned();
            return get_store().count_elements(CARERSUPPORTINDICATOR$2) != 0;
        }
    }
    
    /**
     * Sets the "CarerSupportIndicator" element
     */
    public void setCarerSupportIndicator(uk.nhs.nhsia.datastandards.ecds.CarerSupportIndicatorType.Enum carerSupportIndicator)
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.SimpleValue target = null;
            target = (org.apache.xmlbeans.SimpleValue)get_store().find_element_user(CARERSUPPORTINDICATOR$2, 0);
            if (target == null)
            {
                target = (org.apache.xmlbeans.SimpleValue)get_store().add_element_user(CARERSUPPORTINDICATOR$2);
            }
            target.setEnumValue(carerSupportIndicator);
        }
    }
    
    /**
     * Sets (as xml) the "CarerSupportIndicator" element
     */
    public void xsetCarerSupportIndicator(uk.nhs.nhsia.datastandards.ecds.CarerSupportIndicatorType carerSupportIndicator)
    {
        synchronized (monitor())
        {
            check_orphaned();
            uk.nhs.nhsia.datastandards.ecds.CarerSupportIndicatorType target = null;
            target = (uk.nhs.nhsia.datastandards.ecds.CarerSupportIndicatorType)get_store().find_element_user(CARERSUPPORTINDICATOR$2, 0);
            if (target == null)
            {
                target = (uk.nhs.nhsia.datastandards.ecds.CarerSupportIndicatorType)get_store().add_element_user(CARERSUPPORTINDICATOR$2);
            }
            target.set(carerSupportIndicator);
        }
    }
    
    /**
     * Unsets the "CarerSupportIndicator" element
     */
    public void unsetCarerSupportIndicator()
    {
        synchronized (monitor())
        {
            check_orphaned();
            get_store().remove_element(CARERSUPPORTINDICATOR$2, 0);
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
            target = (org.apache.xmlbeans.SimpleValue)get_store().find_element_user(ETHNICCATEGORY$4, 0);
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
            target = (uk.nhs.nhsia.datastandards.ecds.EthnicCategoryType)get_store().find_element_user(ETHNICCATEGORY$4, 0);
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
            return get_store().count_elements(ETHNICCATEGORY$4) != 0;
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
            target = (org.apache.xmlbeans.SimpleValue)get_store().find_element_user(ETHNICCATEGORY$4, 0);
            if (target == null)
            {
                target = (org.apache.xmlbeans.SimpleValue)get_store().add_element_user(ETHNICCATEGORY$4);
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
            target = (uk.nhs.nhsia.datastandards.ecds.EthnicCategoryType)get_store().find_element_user(ETHNICCATEGORY$4, 0);
            if (target == null)
            {
                target = (uk.nhs.nhsia.datastandards.ecds.EthnicCategoryType)get_store().add_element_user(ETHNICCATEGORY$4);
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
            get_store().remove_element(ETHNICCATEGORY$4, 0);
        }
    }
    
    /**
     * Gets the "PersonMaritalStatus" element
     */
    public uk.nhs.nhsia.datastandards.ecds.PersonMaritalStatusType.Enum getPersonMaritalStatus()
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.SimpleValue target = null;
            target = (org.apache.xmlbeans.SimpleValue)get_store().find_element_user(PERSONMARITALSTATUS$6, 0);
            if (target == null)
            {
                return null;
            }
            return (uk.nhs.nhsia.datastandards.ecds.PersonMaritalStatusType.Enum)target.getEnumValue();
        }
    }
    
    /**
     * Gets (as xml) the "PersonMaritalStatus" element
     */
    public uk.nhs.nhsia.datastandards.ecds.PersonMaritalStatusType xgetPersonMaritalStatus()
    {
        synchronized (monitor())
        {
            check_orphaned();
            uk.nhs.nhsia.datastandards.ecds.PersonMaritalStatusType target = null;
            target = (uk.nhs.nhsia.datastandards.ecds.PersonMaritalStatusType)get_store().find_element_user(PERSONMARITALSTATUS$6, 0);
            return target;
        }
    }
    
    /**
     * True if has "PersonMaritalStatus" element
     */
    public boolean isSetPersonMaritalStatus()
    {
        synchronized (monitor())
        {
            check_orphaned();
            return get_store().count_elements(PERSONMARITALSTATUS$6) != 0;
        }
    }
    
    /**
     * Sets the "PersonMaritalStatus" element
     */
    public void setPersonMaritalStatus(uk.nhs.nhsia.datastandards.ecds.PersonMaritalStatusType.Enum personMaritalStatus)
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.SimpleValue target = null;
            target = (org.apache.xmlbeans.SimpleValue)get_store().find_element_user(PERSONMARITALSTATUS$6, 0);
            if (target == null)
            {
                target = (org.apache.xmlbeans.SimpleValue)get_store().add_element_user(PERSONMARITALSTATUS$6);
            }
            target.setEnumValue(personMaritalStatus);
        }
    }
    
    /**
     * Sets (as xml) the "PersonMaritalStatus" element
     */
    public void xsetPersonMaritalStatus(uk.nhs.nhsia.datastandards.ecds.PersonMaritalStatusType personMaritalStatus)
    {
        synchronized (monitor())
        {
            check_orphaned();
            uk.nhs.nhsia.datastandards.ecds.PersonMaritalStatusType target = null;
            target = (uk.nhs.nhsia.datastandards.ecds.PersonMaritalStatusType)get_store().find_element_user(PERSONMARITALSTATUS$6, 0);
            if (target == null)
            {
                target = (uk.nhs.nhsia.datastandards.ecds.PersonMaritalStatusType)get_store().add_element_user(PERSONMARITALSTATUS$6);
            }
            target.set(personMaritalStatus);
        }
    }
    
    /**
     * Unsets the "PersonMaritalStatus" element
     */
    public void unsetPersonMaritalStatus()
    {
        synchronized (monitor())
        {
            check_orphaned();
            get_store().remove_element(PERSONMARITALSTATUS$6, 0);
        }
    }
}
