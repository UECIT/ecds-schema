/*
 * XML Type:  PersonCharacteristics_Baby_Structure
 * Namespace: http://www.nhsia.nhs.uk/DataStandards/XMLschema/CDS/ns
 * Java type: uk.nhs.nhsia.datastandards.ecds.PersonCharacteristicsBabyStructure
 *
 * Automatically generated - do not modify.
 */
package uk.nhs.nhsia.datastandards.ecds.impl;
/**
 * An XML PersonCharacteristics_Baby_Structure(@http://www.nhsia.nhs.uk/DataStandards/XMLschema/CDS/ns).
 *
 * This is a complex type.
 */
public class PersonCharacteristicsBabyStructureImpl extends org.apache.xmlbeans.impl.values.XmlComplexContentImpl implements uk.nhs.nhsia.datastandards.ecds.PersonCharacteristicsBabyStructure
{
    private static final long serialVersionUID = 1L;
    
    public PersonCharacteristicsBabyStructureImpl(org.apache.xmlbeans.SchemaType sType)
    {
        super(sType);
    }
    
    private static final javax.xml.namespace.QName PERSONGENDERCODECURRENTBABY$0 = 
        new javax.xml.namespace.QName("http://www.nhsia.nhs.uk/DataStandards/XMLschema/CDS/ns", "PersonGenderCodeCurrent_Baby");
    private static final javax.xml.namespace.QName LIVEORSTILLBIRTHCODE$2 = 
        new javax.xml.namespace.QName("http://www.nhsia.nhs.uk/DataStandards/XMLschema/CDS/ns", "LiveOrStillBirthCode");
    private static final javax.xml.namespace.QName BIRTHWEIGHT$4 = 
        new javax.xml.namespace.QName("http://www.nhsia.nhs.uk/DataStandards/XMLschema/CDS/ns", "BirthWeight");
    private static final javax.xml.namespace.QName OVERSEASVISITORSTATUSCLASSIFICATIONATCDSACTIVITYDATE$6 = 
        new javax.xml.namespace.QName("http://www.nhsia.nhs.uk/DataStandards/XMLschema/CDS/ns", "OverseasVisitorStatusClassificationAtCDSActivityDate");
    
    
    /**
     * Gets the "PersonGenderCodeCurrent_Baby" element
     */
    public uk.nhs.nhsia.datastandards.ecds.PersonGenderCodeType.Enum getPersonGenderCodeCurrentBaby()
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.SimpleValue target = null;
            target = (org.apache.xmlbeans.SimpleValue)get_store().find_element_user(PERSONGENDERCODECURRENTBABY$0, 0);
            if (target == null)
            {
                return null;
            }
            return (uk.nhs.nhsia.datastandards.ecds.PersonGenderCodeType.Enum)target.getEnumValue();
        }
    }
    
    /**
     * Gets (as xml) the "PersonGenderCodeCurrent_Baby" element
     */
    public uk.nhs.nhsia.datastandards.ecds.PersonGenderCodeCurrentBabyType xgetPersonGenderCodeCurrentBaby()
    {
        synchronized (monitor())
        {
            check_orphaned();
            uk.nhs.nhsia.datastandards.ecds.PersonGenderCodeCurrentBabyType target = null;
            target = (uk.nhs.nhsia.datastandards.ecds.PersonGenderCodeCurrentBabyType)get_store().find_element_user(PERSONGENDERCODECURRENTBABY$0, 0);
            return target;
        }
    }
    
    /**
     * True if has "PersonGenderCodeCurrent_Baby" element
     */
    public boolean isSetPersonGenderCodeCurrentBaby()
    {
        synchronized (monitor())
        {
            check_orphaned();
            return get_store().count_elements(PERSONGENDERCODECURRENTBABY$0) != 0;
        }
    }
    
    /**
     * Sets the "PersonGenderCodeCurrent_Baby" element
     */
    public void setPersonGenderCodeCurrentBaby(uk.nhs.nhsia.datastandards.ecds.PersonGenderCodeType.Enum personGenderCodeCurrentBaby)
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.SimpleValue target = null;
            target = (org.apache.xmlbeans.SimpleValue)get_store().find_element_user(PERSONGENDERCODECURRENTBABY$0, 0);
            if (target == null)
            {
                target = (org.apache.xmlbeans.SimpleValue)get_store().add_element_user(PERSONGENDERCODECURRENTBABY$0);
            }
            target.setEnumValue(personGenderCodeCurrentBaby);
        }
    }
    
    /**
     * Sets (as xml) the "PersonGenderCodeCurrent_Baby" element
     */
    public void xsetPersonGenderCodeCurrentBaby(uk.nhs.nhsia.datastandards.ecds.PersonGenderCodeCurrentBabyType personGenderCodeCurrentBaby)
    {
        synchronized (monitor())
        {
            check_orphaned();
            uk.nhs.nhsia.datastandards.ecds.PersonGenderCodeCurrentBabyType target = null;
            target = (uk.nhs.nhsia.datastandards.ecds.PersonGenderCodeCurrentBabyType)get_store().find_element_user(PERSONGENDERCODECURRENTBABY$0, 0);
            if (target == null)
            {
                target = (uk.nhs.nhsia.datastandards.ecds.PersonGenderCodeCurrentBabyType)get_store().add_element_user(PERSONGENDERCODECURRENTBABY$0);
            }
            target.set(personGenderCodeCurrentBaby);
        }
    }
    
    /**
     * Unsets the "PersonGenderCodeCurrent_Baby" element
     */
    public void unsetPersonGenderCodeCurrentBaby()
    {
        synchronized (monitor())
        {
            check_orphaned();
            get_store().remove_element(PERSONGENDERCODECURRENTBABY$0, 0);
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
            target = (org.apache.xmlbeans.SimpleValue)get_store().find_element_user(LIVEORSTILLBIRTHCODE$2, 0);
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
            target = (uk.nhs.nhsia.datastandards.ecds.LiveOrStillBirthCodeType)get_store().find_element_user(LIVEORSTILLBIRTHCODE$2, 0);
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
            return get_store().count_elements(LIVEORSTILLBIRTHCODE$2) != 0;
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
            target = (org.apache.xmlbeans.SimpleValue)get_store().find_element_user(LIVEORSTILLBIRTHCODE$2, 0);
            if (target == null)
            {
                target = (org.apache.xmlbeans.SimpleValue)get_store().add_element_user(LIVEORSTILLBIRTHCODE$2);
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
            target = (uk.nhs.nhsia.datastandards.ecds.LiveOrStillBirthCodeType)get_store().find_element_user(LIVEORSTILLBIRTHCODE$2, 0);
            if (target == null)
            {
                target = (uk.nhs.nhsia.datastandards.ecds.LiveOrStillBirthCodeType)get_store().add_element_user(LIVEORSTILLBIRTHCODE$2);
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
            get_store().remove_element(LIVEORSTILLBIRTHCODE$2, 0);
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
            target = (org.apache.xmlbeans.SimpleValue)get_store().find_element_user(BIRTHWEIGHT$4, 0);
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
            target = (uk.nhs.nhsia.datastandards.ecds.BirthWeightType)get_store().find_element_user(BIRTHWEIGHT$4, 0);
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
            return get_store().count_elements(BIRTHWEIGHT$4) != 0;
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
            target = (org.apache.xmlbeans.SimpleValue)get_store().find_element_user(BIRTHWEIGHT$4, 0);
            if (target == null)
            {
                target = (org.apache.xmlbeans.SimpleValue)get_store().add_element_user(BIRTHWEIGHT$4);
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
            target = (uk.nhs.nhsia.datastandards.ecds.BirthWeightType)get_store().find_element_user(BIRTHWEIGHT$4, 0);
            if (target == null)
            {
                target = (uk.nhs.nhsia.datastandards.ecds.BirthWeightType)get_store().add_element_user(BIRTHWEIGHT$4);
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
            get_store().remove_element(BIRTHWEIGHT$4, 0);
        }
    }
    
    /**
     * Gets the "OverseasVisitorStatusClassificationAtCDSActivityDate" element
     */
    public uk.nhs.nhsia.datastandards.ecds.OverseasVisitorClassificationType.Enum getOverseasVisitorStatusClassificationAtCDSActivityDate()
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.SimpleValue target = null;
            target = (org.apache.xmlbeans.SimpleValue)get_store().find_element_user(OVERSEASVISITORSTATUSCLASSIFICATIONATCDSACTIVITYDATE$6, 0);
            if (target == null)
            {
                return null;
            }
            return (uk.nhs.nhsia.datastandards.ecds.OverseasVisitorClassificationType.Enum)target.getEnumValue();
        }
    }
    
    /**
     * Gets (as xml) the "OverseasVisitorStatusClassificationAtCDSActivityDate" element
     */
    public uk.nhs.nhsia.datastandards.ecds.OverseasVisitorStatusClassificationAtCDSActivityDateType xgetOverseasVisitorStatusClassificationAtCDSActivityDate()
    {
        synchronized (monitor())
        {
            check_orphaned();
            uk.nhs.nhsia.datastandards.ecds.OverseasVisitorStatusClassificationAtCDSActivityDateType target = null;
            target = (uk.nhs.nhsia.datastandards.ecds.OverseasVisitorStatusClassificationAtCDSActivityDateType)get_store().find_element_user(OVERSEASVISITORSTATUSCLASSIFICATIONATCDSACTIVITYDATE$6, 0);
            return target;
        }
    }
    
    /**
     * True if has "OverseasVisitorStatusClassificationAtCDSActivityDate" element
     */
    public boolean isSetOverseasVisitorStatusClassificationAtCDSActivityDate()
    {
        synchronized (monitor())
        {
            check_orphaned();
            return get_store().count_elements(OVERSEASVISITORSTATUSCLASSIFICATIONATCDSACTIVITYDATE$6) != 0;
        }
    }
    
    /**
     * Sets the "OverseasVisitorStatusClassificationAtCDSActivityDate" element
     */
    public void setOverseasVisitorStatusClassificationAtCDSActivityDate(uk.nhs.nhsia.datastandards.ecds.OverseasVisitorClassificationType.Enum overseasVisitorStatusClassificationAtCDSActivityDate)
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.SimpleValue target = null;
            target = (org.apache.xmlbeans.SimpleValue)get_store().find_element_user(OVERSEASVISITORSTATUSCLASSIFICATIONATCDSACTIVITYDATE$6, 0);
            if (target == null)
            {
                target = (org.apache.xmlbeans.SimpleValue)get_store().add_element_user(OVERSEASVISITORSTATUSCLASSIFICATIONATCDSACTIVITYDATE$6);
            }
            target.setEnumValue(overseasVisitorStatusClassificationAtCDSActivityDate);
        }
    }
    
    /**
     * Sets (as xml) the "OverseasVisitorStatusClassificationAtCDSActivityDate" element
     */
    public void xsetOverseasVisitorStatusClassificationAtCDSActivityDate(uk.nhs.nhsia.datastandards.ecds.OverseasVisitorStatusClassificationAtCDSActivityDateType overseasVisitorStatusClassificationAtCDSActivityDate)
    {
        synchronized (monitor())
        {
            check_orphaned();
            uk.nhs.nhsia.datastandards.ecds.OverseasVisitorStatusClassificationAtCDSActivityDateType target = null;
            target = (uk.nhs.nhsia.datastandards.ecds.OverseasVisitorStatusClassificationAtCDSActivityDateType)get_store().find_element_user(OVERSEASVISITORSTATUSCLASSIFICATIONATCDSACTIVITYDATE$6, 0);
            if (target == null)
            {
                target = (uk.nhs.nhsia.datastandards.ecds.OverseasVisitorStatusClassificationAtCDSActivityDateType)get_store().add_element_user(OVERSEASVISITORSTATUSCLASSIFICATIONATCDSACTIVITYDATE$6);
            }
            target.set(overseasVisitorStatusClassificationAtCDSActivityDate);
        }
    }
    
    /**
     * Unsets the "OverseasVisitorStatusClassificationAtCDSActivityDate" element
     */
    public void unsetOverseasVisitorStatusClassificationAtCDSActivityDate()
    {
        synchronized (monitor())
        {
            check_orphaned();
            get_store().remove_element(OVERSEASVISITORSTATUSCLASSIFICATIONATCDSACTIVITYDATE$6, 0);
        }
    }
}
