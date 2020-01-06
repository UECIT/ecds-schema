/*
 * XML Type:  BirthOccurrence_Structure
 * Namespace: http://www.nhsia.nhs.uk/DataStandards/XMLschema/CDS/ns
 * Java type: uk.nhs.nhsia.datastandards.ecds.BirthOccurrenceStructure
 *
 * Automatically generated - do not modify.
 */
package uk.nhs.nhsia.datastandards.ecds.impl;
/**
 * An XML BirthOccurrence_Structure(@http://www.nhsia.nhs.uk/DataStandards/XMLschema/CDS/ns).
 *
 * This is a complex type.
 */
public class BirthOccurrenceStructureImpl extends org.apache.xmlbeans.impl.values.XmlComplexContentImpl implements uk.nhs.nhsia.datastandards.ecds.BirthOccurrenceStructure
{
    private static final long serialVersionUID = 1L;
    
    public BirthOccurrenceStructureImpl(org.apache.xmlbeans.SchemaType sType)
    {
        super(sType);
    }
    
    private static final javax.xml.namespace.QName ACTIVITYCHARACTERISTICS$0 = 
        new javax.xml.namespace.QName("http://www.nhsia.nhs.uk/DataStandards/XMLschema/CDS/ns", "ActivityCharacteristics");
    private static final javax.xml.namespace.QName PERSONGROUPBABY$2 = 
        new javax.xml.namespace.QName("http://www.nhsia.nhs.uk/DataStandards/XMLschema/CDS/ns", "PersonGroup_Baby");
    private static final javax.xml.namespace.QName LOCATIONGROUP$4 = 
        new javax.xml.namespace.QName("http://www.nhsia.nhs.uk/DataStandards/XMLschema/CDS/ns", "LocationGroup");
    
    
    /**
     * Gets the "ActivityCharacteristics" element
     */
    public uk.nhs.nhsia.datastandards.ecds.BirthOccurrenceStructure.ActivityCharacteristics getActivityCharacteristics()
    {
        synchronized (monitor())
        {
            check_orphaned();
            uk.nhs.nhsia.datastandards.ecds.BirthOccurrenceStructure.ActivityCharacteristics target = null;
            target = (uk.nhs.nhsia.datastandards.ecds.BirthOccurrenceStructure.ActivityCharacteristics)get_store().find_element_user(ACTIVITYCHARACTERISTICS$0, 0);
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
    public void setActivityCharacteristics(uk.nhs.nhsia.datastandards.ecds.BirthOccurrenceStructure.ActivityCharacteristics activityCharacteristics)
    {
        generatedSetterHelperImpl(activityCharacteristics, ACTIVITYCHARACTERISTICS$0, 0, org.apache.xmlbeans.impl.values.XmlObjectBase.KIND_SETTERHELPER_SINGLETON);
    }
    
    /**
     * Appends and returns a new empty "ActivityCharacteristics" element
     */
    public uk.nhs.nhsia.datastandards.ecds.BirthOccurrenceStructure.ActivityCharacteristics addNewActivityCharacteristics()
    {
        synchronized (monitor())
        {
            check_orphaned();
            uk.nhs.nhsia.datastandards.ecds.BirthOccurrenceStructure.ActivityCharacteristics target = null;
            target = (uk.nhs.nhsia.datastandards.ecds.BirthOccurrenceStructure.ActivityCharacteristics)get_store().add_element_user(ACTIVITYCHARACTERISTICS$0);
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
     * Gets the "PersonGroup_Baby" element
     */
    public uk.nhs.nhsia.datastandards.ecds.PersonGroupBabyStructure getPersonGroupBaby()
    {
        synchronized (monitor())
        {
            check_orphaned();
            uk.nhs.nhsia.datastandards.ecds.PersonGroupBabyStructure target = null;
            target = (uk.nhs.nhsia.datastandards.ecds.PersonGroupBabyStructure)get_store().find_element_user(PERSONGROUPBABY$2, 0);
            if (target == null)
            {
                return null;
            }
            return target;
        }
    }
    
    /**
     * True if has "PersonGroup_Baby" element
     */
    public boolean isSetPersonGroupBaby()
    {
        synchronized (monitor())
        {
            check_orphaned();
            return get_store().count_elements(PERSONGROUPBABY$2) != 0;
        }
    }
    
    /**
     * Sets the "PersonGroup_Baby" element
     */
    public void setPersonGroupBaby(uk.nhs.nhsia.datastandards.ecds.PersonGroupBabyStructure personGroupBaby)
    {
        generatedSetterHelperImpl(personGroupBaby, PERSONGROUPBABY$2, 0, org.apache.xmlbeans.impl.values.XmlObjectBase.KIND_SETTERHELPER_SINGLETON);
    }
    
    /**
     * Appends and returns a new empty "PersonGroup_Baby" element
     */
    public uk.nhs.nhsia.datastandards.ecds.PersonGroupBabyStructure addNewPersonGroupBaby()
    {
        synchronized (monitor())
        {
            check_orphaned();
            uk.nhs.nhsia.datastandards.ecds.PersonGroupBabyStructure target = null;
            target = (uk.nhs.nhsia.datastandards.ecds.PersonGroupBabyStructure)get_store().add_element_user(PERSONGROUPBABY$2);
            return target;
        }
    }
    
    /**
     * Unsets the "PersonGroup_Baby" element
     */
    public void unsetPersonGroupBaby()
    {
        synchronized (monitor())
        {
            check_orphaned();
            get_store().remove_element(PERSONGROUPBABY$2, 0);
        }
    }
    
    /**
     * Gets the "LocationGroup" element
     */
    public uk.nhs.nhsia.datastandards.ecds.BirthOccurrenceStructure.LocationGroup getLocationGroup()
    {
        synchronized (monitor())
        {
            check_orphaned();
            uk.nhs.nhsia.datastandards.ecds.BirthOccurrenceStructure.LocationGroup target = null;
            target = (uk.nhs.nhsia.datastandards.ecds.BirthOccurrenceStructure.LocationGroup)get_store().find_element_user(LOCATIONGROUP$4, 0);
            if (target == null)
            {
                return null;
            }
            return target;
        }
    }
    
    /**
     * True if has "LocationGroup" element
     */
    public boolean isSetLocationGroup()
    {
        synchronized (monitor())
        {
            check_orphaned();
            return get_store().count_elements(LOCATIONGROUP$4) != 0;
        }
    }
    
    /**
     * Sets the "LocationGroup" element
     */
    public void setLocationGroup(uk.nhs.nhsia.datastandards.ecds.BirthOccurrenceStructure.LocationGroup locationGroup)
    {
        generatedSetterHelperImpl(locationGroup, LOCATIONGROUP$4, 0, org.apache.xmlbeans.impl.values.XmlObjectBase.KIND_SETTERHELPER_SINGLETON);
    }
    
    /**
     * Appends and returns a new empty "LocationGroup" element
     */
    public uk.nhs.nhsia.datastandards.ecds.BirthOccurrenceStructure.LocationGroup addNewLocationGroup()
    {
        synchronized (monitor())
        {
            check_orphaned();
            uk.nhs.nhsia.datastandards.ecds.BirthOccurrenceStructure.LocationGroup target = null;
            target = (uk.nhs.nhsia.datastandards.ecds.BirthOccurrenceStructure.LocationGroup)get_store().add_element_user(LOCATIONGROUP$4);
            return target;
        }
    }
    
    /**
     * Unsets the "LocationGroup" element
     */
    public void unsetLocationGroup()
    {
        synchronized (monitor())
        {
            check_orphaned();
            get_store().remove_element(LOCATIONGROUP$4, 0);
        }
    }
    /**
     * An XML ActivityCharacteristics(@http://www.nhsia.nhs.uk/DataStandards/XMLschema/CDS/ns).
     *
     * This is a complex type.
     */
    public static class ActivityCharacteristicsImpl extends org.apache.xmlbeans.impl.values.XmlComplexContentImpl implements uk.nhs.nhsia.datastandards.ecds.BirthOccurrenceStructure.ActivityCharacteristics
    {
        private static final long serialVersionUID = 1L;
        
        public ActivityCharacteristicsImpl(org.apache.xmlbeans.SchemaType sType)
        {
            super(sType);
        }
        
        private static final javax.xml.namespace.QName BIRTHORDER$0 = 
            new javax.xml.namespace.QName("http://www.nhsia.nhs.uk/DataStandards/XMLschema/CDS/ns", "BirthOrder");
        private static final javax.xml.namespace.QName DELIVERYMETHODCODE$2 = 
            new javax.xml.namespace.QName("http://www.nhsia.nhs.uk/DataStandards/XMLschema/CDS/ns", "DeliveryMethodCode");
        private static final javax.xml.namespace.QName GESTATIONLENGTHASSESSMENT$4 = 
            new javax.xml.namespace.QName("http://www.nhsia.nhs.uk/DataStandards/XMLschema/CDS/ns", "GestationLength_Assessment");
        private static final javax.xml.namespace.QName RESUSCITATIONMETHODCODE$6 = 
            new javax.xml.namespace.QName("http://www.nhsia.nhs.uk/DataStandards/XMLschema/CDS/ns", "ResuscitationMethodCode");
        private static final javax.xml.namespace.QName STATUSOFPERSONCONDUCTINGDELIVERYCODE$8 = 
            new javax.xml.namespace.QName("http://www.nhsia.nhs.uk/DataStandards/XMLschema/CDS/ns", "StatusOfPersonConductingDeliveryCode");
        
        
        /**
         * Gets the "BirthOrder" element
         */
        public int getBirthOrder()
        {
            synchronized (monitor())
            {
                check_orphaned();
                org.apache.xmlbeans.SimpleValue target = null;
                target = (org.apache.xmlbeans.SimpleValue)get_store().find_element_user(BIRTHORDER$0, 0);
                if (target == null)
                {
                    return 0;
                }
                return target.getIntValue();
            }
        }
        
        /**
         * Gets (as xml) the "BirthOrder" element
         */
        public uk.nhs.nhsia.datastandards.ecds.BirthOrderType xgetBirthOrder()
        {
            synchronized (monitor())
            {
                check_orphaned();
                uk.nhs.nhsia.datastandards.ecds.BirthOrderType target = null;
                target = (uk.nhs.nhsia.datastandards.ecds.BirthOrderType)get_store().find_element_user(BIRTHORDER$0, 0);
                return target;
            }
        }
        
        /**
         * True if has "BirthOrder" element
         */
        public boolean isSetBirthOrder()
        {
            synchronized (monitor())
            {
                check_orphaned();
                return get_store().count_elements(BIRTHORDER$0) != 0;
            }
        }
        
        /**
         * Sets the "BirthOrder" element
         */
        public void setBirthOrder(int birthOrder)
        {
            synchronized (monitor())
            {
                check_orphaned();
                org.apache.xmlbeans.SimpleValue target = null;
                target = (org.apache.xmlbeans.SimpleValue)get_store().find_element_user(BIRTHORDER$0, 0);
                if (target == null)
                {
                    target = (org.apache.xmlbeans.SimpleValue)get_store().add_element_user(BIRTHORDER$0);
                }
                target.setIntValue(birthOrder);
            }
        }
        
        /**
         * Sets (as xml) the "BirthOrder" element
         */
        public void xsetBirthOrder(uk.nhs.nhsia.datastandards.ecds.BirthOrderType birthOrder)
        {
            synchronized (monitor())
            {
                check_orphaned();
                uk.nhs.nhsia.datastandards.ecds.BirthOrderType target = null;
                target = (uk.nhs.nhsia.datastandards.ecds.BirthOrderType)get_store().find_element_user(BIRTHORDER$0, 0);
                if (target == null)
                {
                    target = (uk.nhs.nhsia.datastandards.ecds.BirthOrderType)get_store().add_element_user(BIRTHORDER$0);
                }
                target.set(birthOrder);
            }
        }
        
        /**
         * Unsets the "BirthOrder" element
         */
        public void unsetBirthOrder()
        {
            synchronized (monitor())
            {
                check_orphaned();
                get_store().remove_element(BIRTHORDER$0, 0);
            }
        }
        
        /**
         * Gets the "DeliveryMethodCode" element
         */
        public java.lang.String getDeliveryMethodCode()
        {
            synchronized (monitor())
            {
                check_orphaned();
                org.apache.xmlbeans.SimpleValue target = null;
                target = (org.apache.xmlbeans.SimpleValue)get_store().find_element_user(DELIVERYMETHODCODE$2, 0);
                if (target == null)
                {
                    return null;
                }
                return target.getStringValue();
            }
        }
        
        /**
         * Gets (as xml) the "DeliveryMethodCode" element
         */
        public uk.nhs.nhsia.datastandards.ecds.DeliveryMethodCodeType xgetDeliveryMethodCode()
        {
            synchronized (monitor())
            {
                check_orphaned();
                uk.nhs.nhsia.datastandards.ecds.DeliveryMethodCodeType target = null;
                target = (uk.nhs.nhsia.datastandards.ecds.DeliveryMethodCodeType)get_store().find_element_user(DELIVERYMETHODCODE$2, 0);
                return target;
            }
        }
        
        /**
         * True if has "DeliveryMethodCode" element
         */
        public boolean isSetDeliveryMethodCode()
        {
            synchronized (monitor())
            {
                check_orphaned();
                return get_store().count_elements(DELIVERYMETHODCODE$2) != 0;
            }
        }
        
        /**
         * Sets the "DeliveryMethodCode" element
         */
        public void setDeliveryMethodCode(java.lang.String deliveryMethodCode)
        {
            synchronized (monitor())
            {
                check_orphaned();
                org.apache.xmlbeans.SimpleValue target = null;
                target = (org.apache.xmlbeans.SimpleValue)get_store().find_element_user(DELIVERYMETHODCODE$2, 0);
                if (target == null)
                {
                    target = (org.apache.xmlbeans.SimpleValue)get_store().add_element_user(DELIVERYMETHODCODE$2);
                }
                target.setStringValue(deliveryMethodCode);
            }
        }
        
        /**
         * Sets (as xml) the "DeliveryMethodCode" element
         */
        public void xsetDeliveryMethodCode(uk.nhs.nhsia.datastandards.ecds.DeliveryMethodCodeType deliveryMethodCode)
        {
            synchronized (monitor())
            {
                check_orphaned();
                uk.nhs.nhsia.datastandards.ecds.DeliveryMethodCodeType target = null;
                target = (uk.nhs.nhsia.datastandards.ecds.DeliveryMethodCodeType)get_store().find_element_user(DELIVERYMETHODCODE$2, 0);
                if (target == null)
                {
                    target = (uk.nhs.nhsia.datastandards.ecds.DeliveryMethodCodeType)get_store().add_element_user(DELIVERYMETHODCODE$2);
                }
                target.set(deliveryMethodCode);
            }
        }
        
        /**
         * Unsets the "DeliveryMethodCode" element
         */
        public void unsetDeliveryMethodCode()
        {
            synchronized (monitor())
            {
                check_orphaned();
                get_store().remove_element(DELIVERYMETHODCODE$2, 0);
            }
        }
        
        /**
         * Gets the "GestationLength_Assessment" element
         */
        public int getGestationLengthAssessment()
        {
            synchronized (monitor())
            {
                check_orphaned();
                org.apache.xmlbeans.SimpleValue target = null;
                target = (org.apache.xmlbeans.SimpleValue)get_store().find_element_user(GESTATIONLENGTHASSESSMENT$4, 0);
                if (target == null)
                {
                    return 0;
                }
                return target.getIntValue();
            }
        }
        
        /**
         * Gets (as xml) the "GestationLength_Assessment" element
         */
        public uk.nhs.nhsia.datastandards.ecds.GestationLengthAssessmentType xgetGestationLengthAssessment()
        {
            synchronized (monitor())
            {
                check_orphaned();
                uk.nhs.nhsia.datastandards.ecds.GestationLengthAssessmentType target = null;
                target = (uk.nhs.nhsia.datastandards.ecds.GestationLengthAssessmentType)get_store().find_element_user(GESTATIONLENGTHASSESSMENT$4, 0);
                return target;
            }
        }
        
        /**
         * True if has "GestationLength_Assessment" element
         */
        public boolean isSetGestationLengthAssessment()
        {
            synchronized (monitor())
            {
                check_orphaned();
                return get_store().count_elements(GESTATIONLENGTHASSESSMENT$4) != 0;
            }
        }
        
        /**
         * Sets the "GestationLength_Assessment" element
         */
        public void setGestationLengthAssessment(int gestationLengthAssessment)
        {
            synchronized (monitor())
            {
                check_orphaned();
                org.apache.xmlbeans.SimpleValue target = null;
                target = (org.apache.xmlbeans.SimpleValue)get_store().find_element_user(GESTATIONLENGTHASSESSMENT$4, 0);
                if (target == null)
                {
                    target = (org.apache.xmlbeans.SimpleValue)get_store().add_element_user(GESTATIONLENGTHASSESSMENT$4);
                }
                target.setIntValue(gestationLengthAssessment);
            }
        }
        
        /**
         * Sets (as xml) the "GestationLength_Assessment" element
         */
        public void xsetGestationLengthAssessment(uk.nhs.nhsia.datastandards.ecds.GestationLengthAssessmentType gestationLengthAssessment)
        {
            synchronized (monitor())
            {
                check_orphaned();
                uk.nhs.nhsia.datastandards.ecds.GestationLengthAssessmentType target = null;
                target = (uk.nhs.nhsia.datastandards.ecds.GestationLengthAssessmentType)get_store().find_element_user(GESTATIONLENGTHASSESSMENT$4, 0);
                if (target == null)
                {
                    target = (uk.nhs.nhsia.datastandards.ecds.GestationLengthAssessmentType)get_store().add_element_user(GESTATIONLENGTHASSESSMENT$4);
                }
                target.set(gestationLengthAssessment);
            }
        }
        
        /**
         * Unsets the "GestationLength_Assessment" element
         */
        public void unsetGestationLengthAssessment()
        {
            synchronized (monitor())
            {
                check_orphaned();
                get_store().remove_element(GESTATIONLENGTHASSESSMENT$4, 0);
            }
        }
        
        /**
         * Gets the "ResuscitationMethodCode" element
         */
        public uk.nhs.nhsia.datastandards.ecds.ResuscitationMethodCodeType.Enum getResuscitationMethodCode()
        {
            synchronized (monitor())
            {
                check_orphaned();
                org.apache.xmlbeans.SimpleValue target = null;
                target = (org.apache.xmlbeans.SimpleValue)get_store().find_element_user(RESUSCITATIONMETHODCODE$6, 0);
                if (target == null)
                {
                    return null;
                }
                return (uk.nhs.nhsia.datastandards.ecds.ResuscitationMethodCodeType.Enum)target.getEnumValue();
            }
        }
        
        /**
         * Gets (as xml) the "ResuscitationMethodCode" element
         */
        public uk.nhs.nhsia.datastandards.ecds.ResuscitationMethodCodeType xgetResuscitationMethodCode()
        {
            synchronized (monitor())
            {
                check_orphaned();
                uk.nhs.nhsia.datastandards.ecds.ResuscitationMethodCodeType target = null;
                target = (uk.nhs.nhsia.datastandards.ecds.ResuscitationMethodCodeType)get_store().find_element_user(RESUSCITATIONMETHODCODE$6, 0);
                return target;
            }
        }
        
        /**
         * True if has "ResuscitationMethodCode" element
         */
        public boolean isSetResuscitationMethodCode()
        {
            synchronized (monitor())
            {
                check_orphaned();
                return get_store().count_elements(RESUSCITATIONMETHODCODE$6) != 0;
            }
        }
        
        /**
         * Sets the "ResuscitationMethodCode" element
         */
        public void setResuscitationMethodCode(uk.nhs.nhsia.datastandards.ecds.ResuscitationMethodCodeType.Enum resuscitationMethodCode)
        {
            synchronized (monitor())
            {
                check_orphaned();
                org.apache.xmlbeans.SimpleValue target = null;
                target = (org.apache.xmlbeans.SimpleValue)get_store().find_element_user(RESUSCITATIONMETHODCODE$6, 0);
                if (target == null)
                {
                    target = (org.apache.xmlbeans.SimpleValue)get_store().add_element_user(RESUSCITATIONMETHODCODE$6);
                }
                target.setEnumValue(resuscitationMethodCode);
            }
        }
        
        /**
         * Sets (as xml) the "ResuscitationMethodCode" element
         */
        public void xsetResuscitationMethodCode(uk.nhs.nhsia.datastandards.ecds.ResuscitationMethodCodeType resuscitationMethodCode)
        {
            synchronized (monitor())
            {
                check_orphaned();
                uk.nhs.nhsia.datastandards.ecds.ResuscitationMethodCodeType target = null;
                target = (uk.nhs.nhsia.datastandards.ecds.ResuscitationMethodCodeType)get_store().find_element_user(RESUSCITATIONMETHODCODE$6, 0);
                if (target == null)
                {
                    target = (uk.nhs.nhsia.datastandards.ecds.ResuscitationMethodCodeType)get_store().add_element_user(RESUSCITATIONMETHODCODE$6);
                }
                target.set(resuscitationMethodCode);
            }
        }
        
        /**
         * Unsets the "ResuscitationMethodCode" element
         */
        public void unsetResuscitationMethodCode()
        {
            synchronized (monitor())
            {
                check_orphaned();
                get_store().remove_element(RESUSCITATIONMETHODCODE$6, 0);
            }
        }
        
        /**
         * Gets the "StatusOfPersonConductingDeliveryCode" element
         */
        public uk.nhs.nhsia.datastandards.ecds.StatusOfPersonConductingDeliveryCodeType.Enum getStatusOfPersonConductingDeliveryCode()
        {
            synchronized (monitor())
            {
                check_orphaned();
                org.apache.xmlbeans.SimpleValue target = null;
                target = (org.apache.xmlbeans.SimpleValue)get_store().find_element_user(STATUSOFPERSONCONDUCTINGDELIVERYCODE$8, 0);
                if (target == null)
                {
                    return null;
                }
                return (uk.nhs.nhsia.datastandards.ecds.StatusOfPersonConductingDeliveryCodeType.Enum)target.getEnumValue();
            }
        }
        
        /**
         * Gets (as xml) the "StatusOfPersonConductingDeliveryCode" element
         */
        public uk.nhs.nhsia.datastandards.ecds.StatusOfPersonConductingDeliveryCodeType xgetStatusOfPersonConductingDeliveryCode()
        {
            synchronized (monitor())
            {
                check_orphaned();
                uk.nhs.nhsia.datastandards.ecds.StatusOfPersonConductingDeliveryCodeType target = null;
                target = (uk.nhs.nhsia.datastandards.ecds.StatusOfPersonConductingDeliveryCodeType)get_store().find_element_user(STATUSOFPERSONCONDUCTINGDELIVERYCODE$8, 0);
                return target;
            }
        }
        
        /**
         * True if has "StatusOfPersonConductingDeliveryCode" element
         */
        public boolean isSetStatusOfPersonConductingDeliveryCode()
        {
            synchronized (monitor())
            {
                check_orphaned();
                return get_store().count_elements(STATUSOFPERSONCONDUCTINGDELIVERYCODE$8) != 0;
            }
        }
        
        /**
         * Sets the "StatusOfPersonConductingDeliveryCode" element
         */
        public void setStatusOfPersonConductingDeliveryCode(uk.nhs.nhsia.datastandards.ecds.StatusOfPersonConductingDeliveryCodeType.Enum statusOfPersonConductingDeliveryCode)
        {
            synchronized (monitor())
            {
                check_orphaned();
                org.apache.xmlbeans.SimpleValue target = null;
                target = (org.apache.xmlbeans.SimpleValue)get_store().find_element_user(STATUSOFPERSONCONDUCTINGDELIVERYCODE$8, 0);
                if (target == null)
                {
                    target = (org.apache.xmlbeans.SimpleValue)get_store().add_element_user(STATUSOFPERSONCONDUCTINGDELIVERYCODE$8);
                }
                target.setEnumValue(statusOfPersonConductingDeliveryCode);
            }
        }
        
        /**
         * Sets (as xml) the "StatusOfPersonConductingDeliveryCode" element
         */
        public void xsetStatusOfPersonConductingDeliveryCode(uk.nhs.nhsia.datastandards.ecds.StatusOfPersonConductingDeliveryCodeType statusOfPersonConductingDeliveryCode)
        {
            synchronized (monitor())
            {
                check_orphaned();
                uk.nhs.nhsia.datastandards.ecds.StatusOfPersonConductingDeliveryCodeType target = null;
                target = (uk.nhs.nhsia.datastandards.ecds.StatusOfPersonConductingDeliveryCodeType)get_store().find_element_user(STATUSOFPERSONCONDUCTINGDELIVERYCODE$8, 0);
                if (target == null)
                {
                    target = (uk.nhs.nhsia.datastandards.ecds.StatusOfPersonConductingDeliveryCodeType)get_store().add_element_user(STATUSOFPERSONCONDUCTINGDELIVERYCODE$8);
                }
                target.set(statusOfPersonConductingDeliveryCode);
            }
        }
        
        /**
         * Unsets the "StatusOfPersonConductingDeliveryCode" element
         */
        public void unsetStatusOfPersonConductingDeliveryCode()
        {
            synchronized (monitor())
            {
                check_orphaned();
                get_store().remove_element(STATUSOFPERSONCONDUCTINGDELIVERYCODE$8, 0);
            }
        }
    }
    /**
     * An XML LocationGroup(@http://www.nhsia.nhs.uk/DataStandards/XMLschema/CDS/ns).
     *
     * This is a complex type.
     */
    public static class LocationGroupImpl extends org.apache.xmlbeans.impl.values.XmlComplexContentImpl implements uk.nhs.nhsia.datastandards.ecds.BirthOccurrenceStructure.LocationGroup
    {
        private static final long serialVersionUID = 1L;
        
        public LocationGroupImpl(org.apache.xmlbeans.SchemaType sType)
        {
            super(sType);
        }
        
        private static final javax.xml.namespace.QName DELIVERYPLACEACTUAL$0 = 
            new javax.xml.namespace.QName("http://www.nhsia.nhs.uk/DataStandards/XMLschema/CDS/ns", "DeliveryPlaceActual");
        
        
        /**
         * Gets the "DeliveryPlaceActual" element
         */
        public uk.nhs.nhsia.datastandards.ecds.BirthOccurrenceStructure.LocationGroup.DeliveryPlaceActual getDeliveryPlaceActual()
        {
            synchronized (monitor())
            {
                check_orphaned();
                uk.nhs.nhsia.datastandards.ecds.BirthOccurrenceStructure.LocationGroup.DeliveryPlaceActual target = null;
                target = (uk.nhs.nhsia.datastandards.ecds.BirthOccurrenceStructure.LocationGroup.DeliveryPlaceActual)get_store().find_element_user(DELIVERYPLACEACTUAL$0, 0);
                if (target == null)
                {
                    return null;
                }
                return target;
            }
        }
        
        /**
         * True if has "DeliveryPlaceActual" element
         */
        public boolean isSetDeliveryPlaceActual()
        {
            synchronized (monitor())
            {
                check_orphaned();
                return get_store().count_elements(DELIVERYPLACEACTUAL$0) != 0;
            }
        }
        
        /**
         * Sets the "DeliveryPlaceActual" element
         */
        public void setDeliveryPlaceActual(uk.nhs.nhsia.datastandards.ecds.BirthOccurrenceStructure.LocationGroup.DeliveryPlaceActual deliveryPlaceActual)
        {
            generatedSetterHelperImpl(deliveryPlaceActual, DELIVERYPLACEACTUAL$0, 0, org.apache.xmlbeans.impl.values.XmlObjectBase.KIND_SETTERHELPER_SINGLETON);
        }
        
        /**
         * Appends and returns a new empty "DeliveryPlaceActual" element
         */
        public uk.nhs.nhsia.datastandards.ecds.BirthOccurrenceStructure.LocationGroup.DeliveryPlaceActual addNewDeliveryPlaceActual()
        {
            synchronized (monitor())
            {
                check_orphaned();
                uk.nhs.nhsia.datastandards.ecds.BirthOccurrenceStructure.LocationGroup.DeliveryPlaceActual target = null;
                target = (uk.nhs.nhsia.datastandards.ecds.BirthOccurrenceStructure.LocationGroup.DeliveryPlaceActual)get_store().add_element_user(DELIVERYPLACEACTUAL$0);
                return target;
            }
        }
        
        /**
         * Unsets the "DeliveryPlaceActual" element
         */
        public void unsetDeliveryPlaceActual()
        {
            synchronized (monitor())
            {
                check_orphaned();
                get_store().remove_element(DELIVERYPLACEACTUAL$0, 0);
            }
        }
        /**
         * An XML DeliveryPlaceActual(@http://www.nhsia.nhs.uk/DataStandards/XMLschema/CDS/ns).
         *
         * This is a complex type.
         */
        public static class DeliveryPlaceActualImpl extends org.apache.xmlbeans.impl.values.XmlComplexContentImpl implements uk.nhs.nhsia.datastandards.ecds.BirthOccurrenceStructure.LocationGroup.DeliveryPlaceActual
        {
            private static final long serialVersionUID = 1L;
            
            public DeliveryPlaceActualImpl(org.apache.xmlbeans.SchemaType sType)
            {
                super(sType);
            }
            
            private static final javax.xml.namespace.QName LOCATIONCLASS$0 = 
                new javax.xml.namespace.QName("http://www.nhsia.nhs.uk/DataStandards/XMLschema/CDS/ns", "LocationClass");
            private static final javax.xml.namespace.QName ACTIVITYLOCATIONTYPE$2 = 
                new javax.xml.namespace.QName("http://www.nhsia.nhs.uk/DataStandards/XMLschema/CDS/ns", "ActivityLocationType");
            private static final javax.xml.namespace.QName DELIVERYPLACETYPECODEACTUAL$4 = 
                new javax.xml.namespace.QName("http://www.nhsia.nhs.uk/DataStandards/XMLschema/CDS/ns", "DeliveryPlaceTypeCode_Actual");
            
            
            /**
             * Gets the "LocationClass" element
             */
            public uk.nhs.nhsia.datastandards.ecds.LocationClassType.Enum getLocationClass()
            {
                synchronized (monitor())
                {
                    check_orphaned();
                    org.apache.xmlbeans.SimpleValue target = null;
                    target = (org.apache.xmlbeans.SimpleValue)get_store().find_element_user(LOCATIONCLASS$0, 0);
                    if (target == null)
                    {
                      return null;
                    }
                    return (uk.nhs.nhsia.datastandards.ecds.LocationClassType.Enum)target.getEnumValue();
                }
            }
            
            /**
             * Gets (as xml) the "LocationClass" element
             */
            public uk.nhs.nhsia.datastandards.ecds.LocationClassType xgetLocationClass()
            {
                synchronized (monitor())
                {
                    check_orphaned();
                    uk.nhs.nhsia.datastandards.ecds.LocationClassType target = null;
                    target = (uk.nhs.nhsia.datastandards.ecds.LocationClassType)get_store().find_element_user(LOCATIONCLASS$0, 0);
                    return target;
                }
            }
            
            /**
             * True if has "LocationClass" element
             */
            public boolean isSetLocationClass()
            {
                synchronized (monitor())
                {
                    check_orphaned();
                    return get_store().count_elements(LOCATIONCLASS$0) != 0;
                }
            }
            
            /**
             * Sets the "LocationClass" element
             */
            public void setLocationClass(uk.nhs.nhsia.datastandards.ecds.LocationClassType.Enum locationClass)
            {
                synchronized (monitor())
                {
                    check_orphaned();
                    org.apache.xmlbeans.SimpleValue target = null;
                    target = (org.apache.xmlbeans.SimpleValue)get_store().find_element_user(LOCATIONCLASS$0, 0);
                    if (target == null)
                    {
                      target = (org.apache.xmlbeans.SimpleValue)get_store().add_element_user(LOCATIONCLASS$0);
                    }
                    target.setEnumValue(locationClass);
                }
            }
            
            /**
             * Sets (as xml) the "LocationClass" element
             */
            public void xsetLocationClass(uk.nhs.nhsia.datastandards.ecds.LocationClassType locationClass)
            {
                synchronized (monitor())
                {
                    check_orphaned();
                    uk.nhs.nhsia.datastandards.ecds.LocationClassType target = null;
                    target = (uk.nhs.nhsia.datastandards.ecds.LocationClassType)get_store().find_element_user(LOCATIONCLASS$0, 0);
                    if (target == null)
                    {
                      target = (uk.nhs.nhsia.datastandards.ecds.LocationClassType)get_store().add_element_user(LOCATIONCLASS$0);
                    }
                    target.set(locationClass);
                }
            }
            
            /**
             * Unsets the "LocationClass" element
             */
            public void unsetLocationClass()
            {
                synchronized (monitor())
                {
                    check_orphaned();
                    get_store().remove_element(LOCATIONCLASS$0, 0);
                }
            }
            
            /**
             * Gets the "ActivityLocationType" element
             */
            public uk.nhs.nhsia.datastandards.ecds.ActivityLocationTypeType.Enum getActivityLocationType()
            {
                synchronized (monitor())
                {
                    check_orphaned();
                    org.apache.xmlbeans.SimpleValue target = null;
                    target = (org.apache.xmlbeans.SimpleValue)get_store().find_element_user(ACTIVITYLOCATIONTYPE$2, 0);
                    if (target == null)
                    {
                      return null;
                    }
                    return (uk.nhs.nhsia.datastandards.ecds.ActivityLocationTypeType.Enum)target.getEnumValue();
                }
            }
            
            /**
             * Gets (as xml) the "ActivityLocationType" element
             */
            public uk.nhs.nhsia.datastandards.ecds.ActivityLocationTypeType xgetActivityLocationType()
            {
                synchronized (monitor())
                {
                    check_orphaned();
                    uk.nhs.nhsia.datastandards.ecds.ActivityLocationTypeType target = null;
                    target = (uk.nhs.nhsia.datastandards.ecds.ActivityLocationTypeType)get_store().find_element_user(ACTIVITYLOCATIONTYPE$2, 0);
                    return target;
                }
            }
            
            /**
             * True if has "ActivityLocationType" element
             */
            public boolean isSetActivityLocationType()
            {
                synchronized (monitor())
                {
                    check_orphaned();
                    return get_store().count_elements(ACTIVITYLOCATIONTYPE$2) != 0;
                }
            }
            
            /**
             * Sets the "ActivityLocationType" element
             */
            public void setActivityLocationType(uk.nhs.nhsia.datastandards.ecds.ActivityLocationTypeType.Enum activityLocationType)
            {
                synchronized (monitor())
                {
                    check_orphaned();
                    org.apache.xmlbeans.SimpleValue target = null;
                    target = (org.apache.xmlbeans.SimpleValue)get_store().find_element_user(ACTIVITYLOCATIONTYPE$2, 0);
                    if (target == null)
                    {
                      target = (org.apache.xmlbeans.SimpleValue)get_store().add_element_user(ACTIVITYLOCATIONTYPE$2);
                    }
                    target.setEnumValue(activityLocationType);
                }
            }
            
            /**
             * Sets (as xml) the "ActivityLocationType" element
             */
            public void xsetActivityLocationType(uk.nhs.nhsia.datastandards.ecds.ActivityLocationTypeType activityLocationType)
            {
                synchronized (monitor())
                {
                    check_orphaned();
                    uk.nhs.nhsia.datastandards.ecds.ActivityLocationTypeType target = null;
                    target = (uk.nhs.nhsia.datastandards.ecds.ActivityLocationTypeType)get_store().find_element_user(ACTIVITYLOCATIONTYPE$2, 0);
                    if (target == null)
                    {
                      target = (uk.nhs.nhsia.datastandards.ecds.ActivityLocationTypeType)get_store().add_element_user(ACTIVITYLOCATIONTYPE$2);
                    }
                    target.set(activityLocationType);
                }
            }
            
            /**
             * Unsets the "ActivityLocationType" element
             */
            public void unsetActivityLocationType()
            {
                synchronized (monitor())
                {
                    check_orphaned();
                    get_store().remove_element(ACTIVITYLOCATIONTYPE$2, 0);
                }
            }
            
            /**
             * Gets the "DeliveryPlaceTypeCode_Actual" element
             */
            public java.lang.String getDeliveryPlaceTypeCodeActual()
            {
                synchronized (monitor())
                {
                    check_orphaned();
                    org.apache.xmlbeans.SimpleValue target = null;
                    target = (org.apache.xmlbeans.SimpleValue)get_store().find_element_user(DELIVERYPLACETYPECODEACTUAL$4, 0);
                    if (target == null)
                    {
                      return null;
                    }
                    return target.getStringValue();
                }
            }
            
            /**
             * Gets (as xml) the "DeliveryPlaceTypeCode_Actual" element
             */
            public uk.nhs.nhsia.datastandards.ecds.DeliveryPlaceTypeCodeActualType xgetDeliveryPlaceTypeCodeActual()
            {
                synchronized (monitor())
                {
                    check_orphaned();
                    uk.nhs.nhsia.datastandards.ecds.DeliveryPlaceTypeCodeActualType target = null;
                    target = (uk.nhs.nhsia.datastandards.ecds.DeliveryPlaceTypeCodeActualType)get_store().find_element_user(DELIVERYPLACETYPECODEACTUAL$4, 0);
                    return target;
                }
            }
            
            /**
             * True if has "DeliveryPlaceTypeCode_Actual" element
             */
            public boolean isSetDeliveryPlaceTypeCodeActual()
            {
                synchronized (monitor())
                {
                    check_orphaned();
                    return get_store().count_elements(DELIVERYPLACETYPECODEACTUAL$4) != 0;
                }
            }
            
            /**
             * Sets the "DeliveryPlaceTypeCode_Actual" element
             */
            public void setDeliveryPlaceTypeCodeActual(java.lang.String deliveryPlaceTypeCodeActual)
            {
                synchronized (monitor())
                {
                    check_orphaned();
                    org.apache.xmlbeans.SimpleValue target = null;
                    target = (org.apache.xmlbeans.SimpleValue)get_store().find_element_user(DELIVERYPLACETYPECODEACTUAL$4, 0);
                    if (target == null)
                    {
                      target = (org.apache.xmlbeans.SimpleValue)get_store().add_element_user(DELIVERYPLACETYPECODEACTUAL$4);
                    }
                    target.setStringValue(deliveryPlaceTypeCodeActual);
                }
            }
            
            /**
             * Sets (as xml) the "DeliveryPlaceTypeCode_Actual" element
             */
            public void xsetDeliveryPlaceTypeCodeActual(uk.nhs.nhsia.datastandards.ecds.DeliveryPlaceTypeCodeActualType deliveryPlaceTypeCodeActual)
            {
                synchronized (monitor())
                {
                    check_orphaned();
                    uk.nhs.nhsia.datastandards.ecds.DeliveryPlaceTypeCodeActualType target = null;
                    target = (uk.nhs.nhsia.datastandards.ecds.DeliveryPlaceTypeCodeActualType)get_store().find_element_user(DELIVERYPLACETYPECODEACTUAL$4, 0);
                    if (target == null)
                    {
                      target = (uk.nhs.nhsia.datastandards.ecds.DeliveryPlaceTypeCodeActualType)get_store().add_element_user(DELIVERYPLACETYPECODEACTUAL$4);
                    }
                    target.set(deliveryPlaceTypeCodeActual);
                }
            }
            
            /**
             * Unsets the "DeliveryPlaceTypeCode_Actual" element
             */
            public void unsetDeliveryPlaceTypeCodeActual()
            {
                synchronized (monitor())
                {
                    check_orphaned();
                    get_store().remove_element(DELIVERYPLACETYPECODEACTUAL$4, 0);
                }
            }
        }
    }
}
