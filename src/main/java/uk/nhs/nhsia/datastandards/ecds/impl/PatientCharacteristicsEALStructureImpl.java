/*
 * XML Type:  PatientCharacteristics_EAL_Structure
 * Namespace: http://www.nhsia.nhs.uk/DataStandards/XMLschema/CDS/ns
 * Java type: uk.nhs.nhsia.datastandards.ecds.PatientCharacteristicsEALStructure
 *
 * Automatically generated - do not modify.
 */
package uk.nhs.nhsia.datastandards.ecds.impl;
/**
 * An XML PatientCharacteristics_EAL_Structure(@http://www.nhsia.nhs.uk/DataStandards/XMLschema/CDS/ns).
 *
 * This is a complex type.
 */
public class PatientCharacteristicsEALStructureImpl extends org.apache.xmlbeans.impl.values.XmlComplexContentImpl implements uk.nhs.nhsia.datastandards.ecds.PatientCharacteristicsEALStructure
{
    private static final long serialVersionUID = 1L;
    
    public PatientCharacteristicsEALStructureImpl(org.apache.xmlbeans.SchemaType sType)
    {
        super(sType);
    }
    
    private static final javax.xml.namespace.QName PERSONGENDERCODECURRENT$0 = 
        new javax.xml.namespace.QName("http://www.nhsia.nhs.uk/DataStandards/XMLschema/CDS/ns", "PersonGenderCodeCurrent");
    private static final javax.xml.namespace.QName CARERSUPPORTINDICATOR$2 = 
        new javax.xml.namespace.QName("http://www.nhsia.nhs.uk/DataStandards/XMLschema/CDS/ns", "CarerSupportIndicator");
    
    
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
}
