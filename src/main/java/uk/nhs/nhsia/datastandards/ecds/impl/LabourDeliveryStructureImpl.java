/*
 * XML Type:  LabourDelivery_Structure
 * Namespace: http://www.nhsia.nhs.uk/DataStandards/XMLschema/CDS/ns
 * Java type: uk.nhs.nhsia.datastandards.ecds.LabourDeliveryStructure
 *
 * Automatically generated - do not modify.
 */
package uk.nhs.nhsia.datastandards.ecds.impl;
/**
 * An XML LabourDelivery_Structure(@http://www.nhsia.nhs.uk/DataStandards/XMLschema/CDS/ns).
 *
 * This is a complex type.
 */
public class LabourDeliveryStructureImpl extends org.apache.xmlbeans.impl.values.XmlComplexContentImpl implements uk.nhs.nhsia.datastandards.ecds.LabourDeliveryStructure
{
    private static final long serialVersionUID = 1L;
    
    public LabourDeliveryStructureImpl(org.apache.xmlbeans.SchemaType sType)
    {
        super(sType);
    }
    
    private static final javax.xml.namespace.QName ACTIVITYCHARACTERISTICS$0 = 
        new javax.xml.namespace.QName("http://www.nhsia.nhs.uk/DataStandards/XMLschema/CDS/ns", "ActivityCharacteristics");
    
    
    /**
     * Gets the "ActivityCharacteristics" element
     */
    public uk.nhs.nhsia.datastandards.ecds.LabourDeliveryStructure.ActivityCharacteristics getActivityCharacteristics()
    {
        synchronized (monitor())
        {
            check_orphaned();
            uk.nhs.nhsia.datastandards.ecds.LabourDeliveryStructure.ActivityCharacteristics target = null;
            target = (uk.nhs.nhsia.datastandards.ecds.LabourDeliveryStructure.ActivityCharacteristics)get_store().find_element_user(ACTIVITYCHARACTERISTICS$0, 0);
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
    public void setActivityCharacteristics(uk.nhs.nhsia.datastandards.ecds.LabourDeliveryStructure.ActivityCharacteristics activityCharacteristics)
    {
        generatedSetterHelperImpl(activityCharacteristics, ACTIVITYCHARACTERISTICS$0, 0, org.apache.xmlbeans.impl.values.XmlObjectBase.KIND_SETTERHELPER_SINGLETON);
    }
    
    /**
     * Appends and returns a new empty "ActivityCharacteristics" element
     */
    public uk.nhs.nhsia.datastandards.ecds.LabourDeliveryStructure.ActivityCharacteristics addNewActivityCharacteristics()
    {
        synchronized (monitor())
        {
            check_orphaned();
            uk.nhs.nhsia.datastandards.ecds.LabourDeliveryStructure.ActivityCharacteristics target = null;
            target = (uk.nhs.nhsia.datastandards.ecds.LabourDeliveryStructure.ActivityCharacteristics)get_store().add_element_user(ACTIVITYCHARACTERISTICS$0);
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
    public static class ActivityCharacteristicsImpl extends org.apache.xmlbeans.impl.values.XmlComplexContentImpl implements uk.nhs.nhsia.datastandards.ecds.LabourDeliveryStructure.ActivityCharacteristics
    {
        private static final long serialVersionUID = 1L;
        
        public ActivityCharacteristicsImpl(org.apache.xmlbeans.SchemaType sType)
        {
            super(sType);
        }
        
        private static final javax.xml.namespace.QName ANAESTHETICGIVENDURINGLABOURORDELIVERYCODE$0 = 
            new javax.xml.namespace.QName("http://www.nhsia.nhs.uk/DataStandards/XMLschema/CDS/ns", "AnaestheticGivenDuringLabourOrDeliveryCode");
        private static final javax.xml.namespace.QName ANAESTHETICGIVENPOSTLABOURORDELIVERYCODE$2 = 
            new javax.xml.namespace.QName("http://www.nhsia.nhs.uk/DataStandards/XMLschema/CDS/ns", "AnaestheticGivenPostLabourOrDeliveryCode");
        private static final javax.xml.namespace.QName GESTATIONLENGTHLABOURONSET$4 = 
            new javax.xml.namespace.QName("http://www.nhsia.nhs.uk/DataStandards/XMLschema/CDS/ns", "GestationLength_LabourOnset");
        private static final javax.xml.namespace.QName LABOURORDELIVERYONSETMETHODCODE$6 = 
            new javax.xml.namespace.QName("http://www.nhsia.nhs.uk/DataStandards/XMLschema/CDS/ns", "LabourOrDeliveryOnsetMethodCode");
        private static final javax.xml.namespace.QName DELIVERYDATE$8 = 
            new javax.xml.namespace.QName("http://www.nhsia.nhs.uk/DataStandards/XMLschema/CDS/ns", "DeliveryDate");
        
        
        /**
         * Gets the "AnaestheticGivenDuringLabourOrDeliveryCode" element
         */
        public uk.nhs.nhsia.datastandards.ecds.AnaestheticGivenDuringLabourOrDeliveryCodeType.Enum getAnaestheticGivenDuringLabourOrDeliveryCode()
        {
            synchronized (monitor())
            {
                check_orphaned();
                org.apache.xmlbeans.SimpleValue target = null;
                target = (org.apache.xmlbeans.SimpleValue)get_store().find_element_user(ANAESTHETICGIVENDURINGLABOURORDELIVERYCODE$0, 0);
                if (target == null)
                {
                    return null;
                }
                return (uk.nhs.nhsia.datastandards.ecds.AnaestheticGivenDuringLabourOrDeliveryCodeType.Enum)target.getEnumValue();
            }
        }
        
        /**
         * Gets (as xml) the "AnaestheticGivenDuringLabourOrDeliveryCode" element
         */
        public uk.nhs.nhsia.datastandards.ecds.AnaestheticGivenDuringLabourOrDeliveryCodeType xgetAnaestheticGivenDuringLabourOrDeliveryCode()
        {
            synchronized (monitor())
            {
                check_orphaned();
                uk.nhs.nhsia.datastandards.ecds.AnaestheticGivenDuringLabourOrDeliveryCodeType target = null;
                target = (uk.nhs.nhsia.datastandards.ecds.AnaestheticGivenDuringLabourOrDeliveryCodeType)get_store().find_element_user(ANAESTHETICGIVENDURINGLABOURORDELIVERYCODE$0, 0);
                return target;
            }
        }
        
        /**
         * True if has "AnaestheticGivenDuringLabourOrDeliveryCode" element
         */
        public boolean isSetAnaestheticGivenDuringLabourOrDeliveryCode()
        {
            synchronized (monitor())
            {
                check_orphaned();
                return get_store().count_elements(ANAESTHETICGIVENDURINGLABOURORDELIVERYCODE$0) != 0;
            }
        }
        
        /**
         * Sets the "AnaestheticGivenDuringLabourOrDeliveryCode" element
         */
        public void setAnaestheticGivenDuringLabourOrDeliveryCode(uk.nhs.nhsia.datastandards.ecds.AnaestheticGivenDuringLabourOrDeliveryCodeType.Enum anaestheticGivenDuringLabourOrDeliveryCode)
        {
            synchronized (monitor())
            {
                check_orphaned();
                org.apache.xmlbeans.SimpleValue target = null;
                target = (org.apache.xmlbeans.SimpleValue)get_store().find_element_user(ANAESTHETICGIVENDURINGLABOURORDELIVERYCODE$0, 0);
                if (target == null)
                {
                    target = (org.apache.xmlbeans.SimpleValue)get_store().add_element_user(ANAESTHETICGIVENDURINGLABOURORDELIVERYCODE$0);
                }
                target.setEnumValue(anaestheticGivenDuringLabourOrDeliveryCode);
            }
        }
        
        /**
         * Sets (as xml) the "AnaestheticGivenDuringLabourOrDeliveryCode" element
         */
        public void xsetAnaestheticGivenDuringLabourOrDeliveryCode(uk.nhs.nhsia.datastandards.ecds.AnaestheticGivenDuringLabourOrDeliveryCodeType anaestheticGivenDuringLabourOrDeliveryCode)
        {
            synchronized (monitor())
            {
                check_orphaned();
                uk.nhs.nhsia.datastandards.ecds.AnaestheticGivenDuringLabourOrDeliveryCodeType target = null;
                target = (uk.nhs.nhsia.datastandards.ecds.AnaestheticGivenDuringLabourOrDeliveryCodeType)get_store().find_element_user(ANAESTHETICGIVENDURINGLABOURORDELIVERYCODE$0, 0);
                if (target == null)
                {
                    target = (uk.nhs.nhsia.datastandards.ecds.AnaestheticGivenDuringLabourOrDeliveryCodeType)get_store().add_element_user(ANAESTHETICGIVENDURINGLABOURORDELIVERYCODE$0);
                }
                target.set(anaestheticGivenDuringLabourOrDeliveryCode);
            }
        }
        
        /**
         * Unsets the "AnaestheticGivenDuringLabourOrDeliveryCode" element
         */
        public void unsetAnaestheticGivenDuringLabourOrDeliveryCode()
        {
            synchronized (monitor())
            {
                check_orphaned();
                get_store().remove_element(ANAESTHETICGIVENDURINGLABOURORDELIVERYCODE$0, 0);
            }
        }
        
        /**
         * Gets the "AnaestheticGivenPostLabourOrDeliveryCode" element
         */
        public uk.nhs.nhsia.datastandards.ecds.AnaestheticGivenPostLabourOrDeliveryCodeType.Enum getAnaestheticGivenPostLabourOrDeliveryCode()
        {
            synchronized (monitor())
            {
                check_orphaned();
                org.apache.xmlbeans.SimpleValue target = null;
                target = (org.apache.xmlbeans.SimpleValue)get_store().find_element_user(ANAESTHETICGIVENPOSTLABOURORDELIVERYCODE$2, 0);
                if (target == null)
                {
                    return null;
                }
                return (uk.nhs.nhsia.datastandards.ecds.AnaestheticGivenPostLabourOrDeliveryCodeType.Enum)target.getEnumValue();
            }
        }
        
        /**
         * Gets (as xml) the "AnaestheticGivenPostLabourOrDeliveryCode" element
         */
        public uk.nhs.nhsia.datastandards.ecds.AnaestheticGivenPostLabourOrDeliveryCodeType xgetAnaestheticGivenPostLabourOrDeliveryCode()
        {
            synchronized (monitor())
            {
                check_orphaned();
                uk.nhs.nhsia.datastandards.ecds.AnaestheticGivenPostLabourOrDeliveryCodeType target = null;
                target = (uk.nhs.nhsia.datastandards.ecds.AnaestheticGivenPostLabourOrDeliveryCodeType)get_store().find_element_user(ANAESTHETICGIVENPOSTLABOURORDELIVERYCODE$2, 0);
                return target;
            }
        }
        
        /**
         * True if has "AnaestheticGivenPostLabourOrDeliveryCode" element
         */
        public boolean isSetAnaestheticGivenPostLabourOrDeliveryCode()
        {
            synchronized (monitor())
            {
                check_orphaned();
                return get_store().count_elements(ANAESTHETICGIVENPOSTLABOURORDELIVERYCODE$2) != 0;
            }
        }
        
        /**
         * Sets the "AnaestheticGivenPostLabourOrDeliveryCode" element
         */
        public void setAnaestheticGivenPostLabourOrDeliveryCode(uk.nhs.nhsia.datastandards.ecds.AnaestheticGivenPostLabourOrDeliveryCodeType.Enum anaestheticGivenPostLabourOrDeliveryCode)
        {
            synchronized (monitor())
            {
                check_orphaned();
                org.apache.xmlbeans.SimpleValue target = null;
                target = (org.apache.xmlbeans.SimpleValue)get_store().find_element_user(ANAESTHETICGIVENPOSTLABOURORDELIVERYCODE$2, 0);
                if (target == null)
                {
                    target = (org.apache.xmlbeans.SimpleValue)get_store().add_element_user(ANAESTHETICGIVENPOSTLABOURORDELIVERYCODE$2);
                }
                target.setEnumValue(anaestheticGivenPostLabourOrDeliveryCode);
            }
        }
        
        /**
         * Sets (as xml) the "AnaestheticGivenPostLabourOrDeliveryCode" element
         */
        public void xsetAnaestheticGivenPostLabourOrDeliveryCode(uk.nhs.nhsia.datastandards.ecds.AnaestheticGivenPostLabourOrDeliveryCodeType anaestheticGivenPostLabourOrDeliveryCode)
        {
            synchronized (monitor())
            {
                check_orphaned();
                uk.nhs.nhsia.datastandards.ecds.AnaestheticGivenPostLabourOrDeliveryCodeType target = null;
                target = (uk.nhs.nhsia.datastandards.ecds.AnaestheticGivenPostLabourOrDeliveryCodeType)get_store().find_element_user(ANAESTHETICGIVENPOSTLABOURORDELIVERYCODE$2, 0);
                if (target == null)
                {
                    target = (uk.nhs.nhsia.datastandards.ecds.AnaestheticGivenPostLabourOrDeliveryCodeType)get_store().add_element_user(ANAESTHETICGIVENPOSTLABOURORDELIVERYCODE$2);
                }
                target.set(anaestheticGivenPostLabourOrDeliveryCode);
            }
        }
        
        /**
         * Unsets the "AnaestheticGivenPostLabourOrDeliveryCode" element
         */
        public void unsetAnaestheticGivenPostLabourOrDeliveryCode()
        {
            synchronized (monitor())
            {
                check_orphaned();
                get_store().remove_element(ANAESTHETICGIVENPOSTLABOURORDELIVERYCODE$2, 0);
            }
        }
        
        /**
         * Gets the "GestationLength_LabourOnset" element
         */
        public int getGestationLengthLabourOnset()
        {
            synchronized (monitor())
            {
                check_orphaned();
                org.apache.xmlbeans.SimpleValue target = null;
                target = (org.apache.xmlbeans.SimpleValue)get_store().find_element_user(GESTATIONLENGTHLABOURONSET$4, 0);
                if (target == null)
                {
                    return 0;
                }
                return target.getIntValue();
            }
        }
        
        /**
         * Gets (as xml) the "GestationLength_LabourOnset" element
         */
        public uk.nhs.nhsia.datastandards.ecds.GestationLengthLabourOnsetType xgetGestationLengthLabourOnset()
        {
            synchronized (monitor())
            {
                check_orphaned();
                uk.nhs.nhsia.datastandards.ecds.GestationLengthLabourOnsetType target = null;
                target = (uk.nhs.nhsia.datastandards.ecds.GestationLengthLabourOnsetType)get_store().find_element_user(GESTATIONLENGTHLABOURONSET$4, 0);
                return target;
            }
        }
        
        /**
         * True if has "GestationLength_LabourOnset" element
         */
        public boolean isSetGestationLengthLabourOnset()
        {
            synchronized (monitor())
            {
                check_orphaned();
                return get_store().count_elements(GESTATIONLENGTHLABOURONSET$4) != 0;
            }
        }
        
        /**
         * Sets the "GestationLength_LabourOnset" element
         */
        public void setGestationLengthLabourOnset(int gestationLengthLabourOnset)
        {
            synchronized (monitor())
            {
                check_orphaned();
                org.apache.xmlbeans.SimpleValue target = null;
                target = (org.apache.xmlbeans.SimpleValue)get_store().find_element_user(GESTATIONLENGTHLABOURONSET$4, 0);
                if (target == null)
                {
                    target = (org.apache.xmlbeans.SimpleValue)get_store().add_element_user(GESTATIONLENGTHLABOURONSET$4);
                }
                target.setIntValue(gestationLengthLabourOnset);
            }
        }
        
        /**
         * Sets (as xml) the "GestationLength_LabourOnset" element
         */
        public void xsetGestationLengthLabourOnset(uk.nhs.nhsia.datastandards.ecds.GestationLengthLabourOnsetType gestationLengthLabourOnset)
        {
            synchronized (monitor())
            {
                check_orphaned();
                uk.nhs.nhsia.datastandards.ecds.GestationLengthLabourOnsetType target = null;
                target = (uk.nhs.nhsia.datastandards.ecds.GestationLengthLabourOnsetType)get_store().find_element_user(GESTATIONLENGTHLABOURONSET$4, 0);
                if (target == null)
                {
                    target = (uk.nhs.nhsia.datastandards.ecds.GestationLengthLabourOnsetType)get_store().add_element_user(GESTATIONLENGTHLABOURONSET$4);
                }
                target.set(gestationLengthLabourOnset);
            }
        }
        
        /**
         * Unsets the "GestationLength_LabourOnset" element
         */
        public void unsetGestationLengthLabourOnset()
        {
            synchronized (monitor())
            {
                check_orphaned();
                get_store().remove_element(GESTATIONLENGTHLABOURONSET$4, 0);
            }
        }
        
        /**
         * Gets the "LabourOrDeliveryOnsetMethodCode" element
         */
        public uk.nhs.nhsia.datastandards.ecds.LabourOrDeliveryOnsetMethodCodeType.Enum getLabourOrDeliveryOnsetMethodCode()
        {
            synchronized (monitor())
            {
                check_orphaned();
                org.apache.xmlbeans.SimpleValue target = null;
                target = (org.apache.xmlbeans.SimpleValue)get_store().find_element_user(LABOURORDELIVERYONSETMETHODCODE$6, 0);
                if (target == null)
                {
                    return null;
                }
                return (uk.nhs.nhsia.datastandards.ecds.LabourOrDeliveryOnsetMethodCodeType.Enum)target.getEnumValue();
            }
        }
        
        /**
         * Gets (as xml) the "LabourOrDeliveryOnsetMethodCode" element
         */
        public uk.nhs.nhsia.datastandards.ecds.LabourOrDeliveryOnsetMethodCodeType xgetLabourOrDeliveryOnsetMethodCode()
        {
            synchronized (monitor())
            {
                check_orphaned();
                uk.nhs.nhsia.datastandards.ecds.LabourOrDeliveryOnsetMethodCodeType target = null;
                target = (uk.nhs.nhsia.datastandards.ecds.LabourOrDeliveryOnsetMethodCodeType)get_store().find_element_user(LABOURORDELIVERYONSETMETHODCODE$6, 0);
                return target;
            }
        }
        
        /**
         * True if has "LabourOrDeliveryOnsetMethodCode" element
         */
        public boolean isSetLabourOrDeliveryOnsetMethodCode()
        {
            synchronized (monitor())
            {
                check_orphaned();
                return get_store().count_elements(LABOURORDELIVERYONSETMETHODCODE$6) != 0;
            }
        }
        
        /**
         * Sets the "LabourOrDeliveryOnsetMethodCode" element
         */
        public void setLabourOrDeliveryOnsetMethodCode(uk.nhs.nhsia.datastandards.ecds.LabourOrDeliveryOnsetMethodCodeType.Enum labourOrDeliveryOnsetMethodCode)
        {
            synchronized (monitor())
            {
                check_orphaned();
                org.apache.xmlbeans.SimpleValue target = null;
                target = (org.apache.xmlbeans.SimpleValue)get_store().find_element_user(LABOURORDELIVERYONSETMETHODCODE$6, 0);
                if (target == null)
                {
                    target = (org.apache.xmlbeans.SimpleValue)get_store().add_element_user(LABOURORDELIVERYONSETMETHODCODE$6);
                }
                target.setEnumValue(labourOrDeliveryOnsetMethodCode);
            }
        }
        
        /**
         * Sets (as xml) the "LabourOrDeliveryOnsetMethodCode" element
         */
        public void xsetLabourOrDeliveryOnsetMethodCode(uk.nhs.nhsia.datastandards.ecds.LabourOrDeliveryOnsetMethodCodeType labourOrDeliveryOnsetMethodCode)
        {
            synchronized (monitor())
            {
                check_orphaned();
                uk.nhs.nhsia.datastandards.ecds.LabourOrDeliveryOnsetMethodCodeType target = null;
                target = (uk.nhs.nhsia.datastandards.ecds.LabourOrDeliveryOnsetMethodCodeType)get_store().find_element_user(LABOURORDELIVERYONSETMETHODCODE$6, 0);
                if (target == null)
                {
                    target = (uk.nhs.nhsia.datastandards.ecds.LabourOrDeliveryOnsetMethodCodeType)get_store().add_element_user(LABOURORDELIVERYONSETMETHODCODE$6);
                }
                target.set(labourOrDeliveryOnsetMethodCode);
            }
        }
        
        /**
         * Unsets the "LabourOrDeliveryOnsetMethodCode" element
         */
        public void unsetLabourOrDeliveryOnsetMethodCode()
        {
            synchronized (monitor())
            {
                check_orphaned();
                get_store().remove_element(LABOURORDELIVERYONSETMETHODCODE$6, 0);
            }
        }
        
        /**
         * Gets the "DeliveryDate" element
         */
        public java.util.Calendar getDeliveryDate()
        {
            synchronized (monitor())
            {
                check_orphaned();
                org.apache.xmlbeans.SimpleValue target = null;
                target = (org.apache.xmlbeans.SimpleValue)get_store().find_element_user(DELIVERYDATE$8, 0);
                if (target == null)
                {
                    return null;
                }
                return target.getCalendarValue();
            }
        }
        
        /**
         * Gets (as xml) the "DeliveryDate" element
         */
        public uk.nhs.nhsia.datastandards.ecds.DeliveryDateType xgetDeliveryDate()
        {
            synchronized (monitor())
            {
                check_orphaned();
                uk.nhs.nhsia.datastandards.ecds.DeliveryDateType target = null;
                target = (uk.nhs.nhsia.datastandards.ecds.DeliveryDateType)get_store().find_element_user(DELIVERYDATE$8, 0);
                return target;
            }
        }
        
        /**
         * True if has "DeliveryDate" element
         */
        public boolean isSetDeliveryDate()
        {
            synchronized (monitor())
            {
                check_orphaned();
                return get_store().count_elements(DELIVERYDATE$8) != 0;
            }
        }
        
        /**
         * Sets the "DeliveryDate" element
         */
        public void setDeliveryDate(java.util.Calendar deliveryDate)
        {
            synchronized (monitor())
            {
                check_orphaned();
                org.apache.xmlbeans.SimpleValue target = null;
                target = (org.apache.xmlbeans.SimpleValue)get_store().find_element_user(DELIVERYDATE$8, 0);
                if (target == null)
                {
                    target = (org.apache.xmlbeans.SimpleValue)get_store().add_element_user(DELIVERYDATE$8);
                }
                target.setCalendarValue(deliveryDate);
            }
        }
        
        /**
         * Sets (as xml) the "DeliveryDate" element
         */
        public void xsetDeliveryDate(uk.nhs.nhsia.datastandards.ecds.DeliveryDateType deliveryDate)
        {
            synchronized (monitor())
            {
                check_orphaned();
                uk.nhs.nhsia.datastandards.ecds.DeliveryDateType target = null;
                target = (uk.nhs.nhsia.datastandards.ecds.DeliveryDateType)get_store().find_element_user(DELIVERYDATE$8, 0);
                if (target == null)
                {
                    target = (uk.nhs.nhsia.datastandards.ecds.DeliveryDateType)get_store().add_element_user(DELIVERYDATE$8);
                }
                target.set(deliveryDate);
            }
        }
        
        /**
         * Unsets the "DeliveryDate" element
         */
        public void unsetDeliveryDate()
        {
            synchronized (monitor())
            {
                check_orphaned();
                get_store().remove_element(DELIVERYDATE$8, 0);
            }
        }
    }
}
