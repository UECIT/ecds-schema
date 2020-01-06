/*
 * XML Type:  Pregnancy_Structure
 * Namespace: http://www.nhsia.nhs.uk/DataStandards/XMLschema/CDS/ns
 * Java type: uk.nhs.nhsia.datastandards.ecds.PregnancyStructure
 *
 * Automatically generated - do not modify.
 */
package uk.nhs.nhsia.datastandards.ecds.impl;
/**
 * An XML Pregnancy_Structure(@http://www.nhsia.nhs.uk/DataStandards/XMLschema/CDS/ns).
 *
 * This is a complex type.
 */
public class PregnancyStructureImpl extends org.apache.xmlbeans.impl.values.XmlComplexContentImpl implements uk.nhs.nhsia.datastandards.ecds.PregnancyStructure
{
    private static final long serialVersionUID = 1L;
    
    public PregnancyStructureImpl(org.apache.xmlbeans.SchemaType sType)
    {
        super(sType);
    }
    
    private static final javax.xml.namespace.QName ACTIVITYCHARACTERISTICS$0 = 
        new javax.xml.namespace.QName("http://www.nhsia.nhs.uk/DataStandards/XMLschema/CDS/ns", "ActivityCharacteristics");
    
    
    /**
     * Gets the "ActivityCharacteristics" element
     */
    public uk.nhs.nhsia.datastandards.ecds.PregnancyStructure.ActivityCharacteristics getActivityCharacteristics()
    {
        synchronized (monitor())
        {
            check_orphaned();
            uk.nhs.nhsia.datastandards.ecds.PregnancyStructure.ActivityCharacteristics target = null;
            target = (uk.nhs.nhsia.datastandards.ecds.PregnancyStructure.ActivityCharacteristics)get_store().find_element_user(ACTIVITYCHARACTERISTICS$0, 0);
            if (target == null)
            {
                return null;
            }
            return target;
        }
    }
    
    /**
     * True if has "ActivityCharacteristics" element
     */
    public boolean isSetActivityCharacteristics()
    {
        synchronized (monitor())
        {
            check_orphaned();
            return get_store().count_elements(ACTIVITYCHARACTERISTICS$0) != 0;
        }
    }
    
    /**
     * Sets the "ActivityCharacteristics" element
     */
    public void setActivityCharacteristics(uk.nhs.nhsia.datastandards.ecds.PregnancyStructure.ActivityCharacteristics activityCharacteristics)
    {
        generatedSetterHelperImpl(activityCharacteristics, ACTIVITYCHARACTERISTICS$0, 0, org.apache.xmlbeans.impl.values.XmlObjectBase.KIND_SETTERHELPER_SINGLETON);
    }
    
    /**
     * Appends and returns a new empty "ActivityCharacteristics" element
     */
    public uk.nhs.nhsia.datastandards.ecds.PregnancyStructure.ActivityCharacteristics addNewActivityCharacteristics()
    {
        synchronized (monitor())
        {
            check_orphaned();
            uk.nhs.nhsia.datastandards.ecds.PregnancyStructure.ActivityCharacteristics target = null;
            target = (uk.nhs.nhsia.datastandards.ecds.PregnancyStructure.ActivityCharacteristics)get_store().add_element_user(ACTIVITYCHARACTERISTICS$0);
            return target;
        }
    }
    
    /**
     * Unsets the "ActivityCharacteristics" element
     */
    public void unsetActivityCharacteristics()
    {
        synchronized (monitor())
        {
            check_orphaned();
            get_store().remove_element(ACTIVITYCHARACTERISTICS$0, 0);
        }
    }
    /**
     * An XML ActivityCharacteristics(@http://www.nhsia.nhs.uk/DataStandards/XMLschema/CDS/ns).
     *
     * This is a complex type.
     */
    public static class ActivityCharacteristicsImpl extends org.apache.xmlbeans.impl.values.XmlComplexContentImpl implements uk.nhs.nhsia.datastandards.ecds.PregnancyStructure.ActivityCharacteristics
    {
        private static final long serialVersionUID = 1L;
        
        public ActivityCharacteristicsImpl(org.apache.xmlbeans.SchemaType sType)
        {
            super(sType);
        }
        
        private static final javax.xml.namespace.QName NUMBEROFBABIESINDICATIONCODE$0 = 
            new javax.xml.namespace.QName("http://www.nhsia.nhs.uk/DataStandards/XMLschema/CDS/ns", "NumberOfBabiesIndicationCode");
        
        
        /**
         * Gets the "NumberOfBabiesIndicationCode" element
         */
        public uk.nhs.nhsia.datastandards.ecds.NumberOfBabiesIndicationCodeType.Enum getNumberOfBabiesIndicationCode()
        {
            synchronized (monitor())
            {
                check_orphaned();
                org.apache.xmlbeans.SimpleValue target = null;
                target = (org.apache.xmlbeans.SimpleValue)get_store().find_element_user(NUMBEROFBABIESINDICATIONCODE$0, 0);
                if (target == null)
                {
                    return null;
                }
                return (uk.nhs.nhsia.datastandards.ecds.NumberOfBabiesIndicationCodeType.Enum)target.getEnumValue();
            }
        }
        
        /**
         * Gets (as xml) the "NumberOfBabiesIndicationCode" element
         */
        public uk.nhs.nhsia.datastandards.ecds.NumberOfBabiesIndicationCodeType xgetNumberOfBabiesIndicationCode()
        {
            synchronized (monitor())
            {
                check_orphaned();
                uk.nhs.nhsia.datastandards.ecds.NumberOfBabiesIndicationCodeType target = null;
                target = (uk.nhs.nhsia.datastandards.ecds.NumberOfBabiesIndicationCodeType)get_store().find_element_user(NUMBEROFBABIESINDICATIONCODE$0, 0);
                return target;
            }
        }
        
        /**
         * True if has "NumberOfBabiesIndicationCode" element
         */
        public boolean isSetNumberOfBabiesIndicationCode()
        {
            synchronized (monitor())
            {
                check_orphaned();
                return get_store().count_elements(NUMBEROFBABIESINDICATIONCODE$0) != 0;
            }
        }
        
        /**
         * Sets the "NumberOfBabiesIndicationCode" element
         */
        public void setNumberOfBabiesIndicationCode(uk.nhs.nhsia.datastandards.ecds.NumberOfBabiesIndicationCodeType.Enum numberOfBabiesIndicationCode)
        {
            synchronized (monitor())
            {
                check_orphaned();
                org.apache.xmlbeans.SimpleValue target = null;
                target = (org.apache.xmlbeans.SimpleValue)get_store().find_element_user(NUMBEROFBABIESINDICATIONCODE$0, 0);
                if (target == null)
                {
                    target = (org.apache.xmlbeans.SimpleValue)get_store().add_element_user(NUMBEROFBABIESINDICATIONCODE$0);
                }
                target.setEnumValue(numberOfBabiesIndicationCode);
            }
        }
        
        /**
         * Sets (as xml) the "NumberOfBabiesIndicationCode" element
         */
        public void xsetNumberOfBabiesIndicationCode(uk.nhs.nhsia.datastandards.ecds.NumberOfBabiesIndicationCodeType numberOfBabiesIndicationCode)
        {
            synchronized (monitor())
            {
                check_orphaned();
                uk.nhs.nhsia.datastandards.ecds.NumberOfBabiesIndicationCodeType target = null;
                target = (uk.nhs.nhsia.datastandards.ecds.NumberOfBabiesIndicationCodeType)get_store().find_element_user(NUMBEROFBABIESINDICATIONCODE$0, 0);
                if (target == null)
                {
                    target = (uk.nhs.nhsia.datastandards.ecds.NumberOfBabiesIndicationCodeType)get_store().add_element_user(NUMBEROFBABIESINDICATIONCODE$0);
                }
                target.set(numberOfBabiesIndicationCode);
            }
        }
        
        /**
         * Unsets the "NumberOfBabiesIndicationCode" element
         */
        public void unsetNumberOfBabiesIndicationCode()
        {
            synchronized (monitor())
            {
                check_orphaned();
                get_store().remove_element(NUMBEROFBABIESINDICATIONCODE$0, 0);
            }
        }
    }
}
