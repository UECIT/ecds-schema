/*
 * XML Type:  OutpatientReferral_Structure
 * Namespace: http://www.nhsia.nhs.uk/DataStandards/XMLschema/CDS/ns
 * Java type: uk.nhs.nhsia.datastandards.ecds.OutpatientReferralStructure
 *
 * Automatically generated - do not modify.
 */
package uk.nhs.nhsia.datastandards.ecds.impl;
/**
 * An XML OutpatientReferral_Structure(@http://www.nhsia.nhs.uk/DataStandards/XMLschema/CDS/ns).
 *
 * This is a complex type.
 */
public class OutpatientReferralStructureImpl extends org.apache.xmlbeans.impl.values.XmlComplexContentImpl implements uk.nhs.nhsia.datastandards.ecds.OutpatientReferralStructure
{
    private static final long serialVersionUID = 1L;
    
    public OutpatientReferralStructureImpl(org.apache.xmlbeans.SchemaType sType)
    {
        super(sType);
    }
    
    private static final javax.xml.namespace.QName ACTIVITYCHARACTERISTICS$0 = 
        new javax.xml.namespace.QName("http://www.nhsia.nhs.uk/DataStandards/XMLschema/CDS/ns", "ActivityCharacteristics");
    private static final javax.xml.namespace.QName REFERRER$2 = 
        new javax.xml.namespace.QName("http://www.nhsia.nhs.uk/DataStandards/XMLschema/CDS/ns", "Referrer");
    
    
    /**
     * Gets the "ActivityCharacteristics" element
     */
    public uk.nhs.nhsia.datastandards.ecds.OutpatientReferralStructure.ActivityCharacteristics getActivityCharacteristics()
    {
        synchronized (monitor())
        {
            check_orphaned();
            uk.nhs.nhsia.datastandards.ecds.OutpatientReferralStructure.ActivityCharacteristics target = null;
            target = (uk.nhs.nhsia.datastandards.ecds.OutpatientReferralStructure.ActivityCharacteristics)get_store().find_element_user(ACTIVITYCHARACTERISTICS$0, 0);
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
    public void setActivityCharacteristics(uk.nhs.nhsia.datastandards.ecds.OutpatientReferralStructure.ActivityCharacteristics activityCharacteristics)
    {
        generatedSetterHelperImpl(activityCharacteristics, ACTIVITYCHARACTERISTICS$0, 0, org.apache.xmlbeans.impl.values.XmlObjectBase.KIND_SETTERHELPER_SINGLETON);
    }
    
    /**
     * Appends and returns a new empty "ActivityCharacteristics" element
     */
    public uk.nhs.nhsia.datastandards.ecds.OutpatientReferralStructure.ActivityCharacteristics addNewActivityCharacteristics()
    {
        synchronized (monitor())
        {
            check_orphaned();
            uk.nhs.nhsia.datastandards.ecds.OutpatientReferralStructure.ActivityCharacteristics target = null;
            target = (uk.nhs.nhsia.datastandards.ecds.OutpatientReferralStructure.ActivityCharacteristics)get_store().add_element_user(ACTIVITYCHARACTERISTICS$0);
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
     * Gets the "Referrer" element
     */
    public uk.nhs.nhsia.datastandards.ecds.ReferrerStructure getReferrer()
    {
        synchronized (monitor())
        {
            check_orphaned();
            uk.nhs.nhsia.datastandards.ecds.ReferrerStructure target = null;
            target = (uk.nhs.nhsia.datastandards.ecds.ReferrerStructure)get_store().find_element_user(REFERRER$2, 0);
            if (target == null)
            {
                return null;
            }
            return target;
        }
    }
    
    /**
     * True if has "Referrer" element
     */
    public boolean isSetReferrer()
    {
        synchronized (monitor())
        {
            check_orphaned();
            return get_store().count_elements(REFERRER$2) != 0;
        }
    }
    
    /**
     * Sets the "Referrer" element
     */
    public void setReferrer(uk.nhs.nhsia.datastandards.ecds.ReferrerStructure referrer)
    {
        generatedSetterHelperImpl(referrer, REFERRER$2, 0, org.apache.xmlbeans.impl.values.XmlObjectBase.KIND_SETTERHELPER_SINGLETON);
    }
    
    /**
     * Appends and returns a new empty "Referrer" element
     */
    public uk.nhs.nhsia.datastandards.ecds.ReferrerStructure addNewReferrer()
    {
        synchronized (monitor())
        {
            check_orphaned();
            uk.nhs.nhsia.datastandards.ecds.ReferrerStructure target = null;
            target = (uk.nhs.nhsia.datastandards.ecds.ReferrerStructure)get_store().add_element_user(REFERRER$2);
            return target;
        }
    }
    
    /**
     * Unsets the "Referrer" element
     */
    public void unsetReferrer()
    {
        synchronized (monitor())
        {
            check_orphaned();
            get_store().remove_element(REFERRER$2, 0);
        }
    }
    /**
     * An XML ActivityCharacteristics(@http://www.nhsia.nhs.uk/DataStandards/XMLschema/CDS/ns).
     *
     * This is a complex type.
     */
    public static class ActivityCharacteristicsImpl extends org.apache.xmlbeans.impl.values.XmlComplexContentImpl implements uk.nhs.nhsia.datastandards.ecds.OutpatientReferralStructure.ActivityCharacteristics
    {
        private static final long serialVersionUID = 1L;
        
        public ActivityCharacteristicsImpl(org.apache.xmlbeans.SchemaType sType)
        {
            super(sType);
        }
        
        private static final javax.xml.namespace.QName PRIORITYTYPECODE$0 = 
            new javax.xml.namespace.QName("http://www.nhsia.nhs.uk/DataStandards/XMLschema/CDS/ns", "PriorityTypeCode");
        private static final javax.xml.namespace.QName SERVICETYPEREQUESTEDCODE$2 = 
            new javax.xml.namespace.QName("http://www.nhsia.nhs.uk/DataStandards/XMLschema/CDS/ns", "ServiceTypeRequestedCode");
        private static final javax.xml.namespace.QName SOURCEOFREFERRALFOROUTPATIENTS$4 = 
            new javax.xml.namespace.QName("http://www.nhsia.nhs.uk/DataStandards/XMLschema/CDS/ns", "SourceOfReferralForOut_Patients");
        private static final javax.xml.namespace.QName REFERRALREQUESTRECEIVEDDATE$6 = 
            new javax.xml.namespace.QName("http://www.nhsia.nhs.uk/DataStandards/XMLschema/CDS/ns", "ReferralRequestReceivedDate");
        private static final javax.xml.namespace.QName DIRECTACCESSREFERRALINDICATOR$8 = 
            new javax.xml.namespace.QName("http://www.nhsia.nhs.uk/DataStandards/XMLschema/CDS/ns", "DirectAccessReferralIndicator");
        
        
        /**
         * Gets the "PriorityTypeCode" element
         */
        public uk.nhs.nhsia.datastandards.ecds.PriorityTypeCodeType.Enum getPriorityTypeCode()
        {
            synchronized (monitor())
            {
                check_orphaned();
                org.apache.xmlbeans.SimpleValue target = null;
                target = (org.apache.xmlbeans.SimpleValue)get_store().find_element_user(PRIORITYTYPECODE$0, 0);
                if (target == null)
                {
                    return null;
                }
                return (uk.nhs.nhsia.datastandards.ecds.PriorityTypeCodeType.Enum)target.getEnumValue();
            }
        }
        
        /**
         * Gets (as xml) the "PriorityTypeCode" element
         */
        public uk.nhs.nhsia.datastandards.ecds.PriorityTypeCodeType xgetPriorityTypeCode()
        {
            synchronized (monitor())
            {
                check_orphaned();
                uk.nhs.nhsia.datastandards.ecds.PriorityTypeCodeType target = null;
                target = (uk.nhs.nhsia.datastandards.ecds.PriorityTypeCodeType)get_store().find_element_user(PRIORITYTYPECODE$0, 0);
                return target;
            }
        }
        
        /**
         * True if has "PriorityTypeCode" element
         */
        public boolean isSetPriorityTypeCode()
        {
            synchronized (monitor())
            {
                check_orphaned();
                return get_store().count_elements(PRIORITYTYPECODE$0) != 0;
            }
        }
        
        /**
         * Sets the "PriorityTypeCode" element
         */
        public void setPriorityTypeCode(uk.nhs.nhsia.datastandards.ecds.PriorityTypeCodeType.Enum priorityTypeCode)
        {
            synchronized (monitor())
            {
                check_orphaned();
                org.apache.xmlbeans.SimpleValue target = null;
                target = (org.apache.xmlbeans.SimpleValue)get_store().find_element_user(PRIORITYTYPECODE$0, 0);
                if (target == null)
                {
                    target = (org.apache.xmlbeans.SimpleValue)get_store().add_element_user(PRIORITYTYPECODE$0);
                }
                target.setEnumValue(priorityTypeCode);
            }
        }
        
        /**
         * Sets (as xml) the "PriorityTypeCode" element
         */
        public void xsetPriorityTypeCode(uk.nhs.nhsia.datastandards.ecds.PriorityTypeCodeType priorityTypeCode)
        {
            synchronized (monitor())
            {
                check_orphaned();
                uk.nhs.nhsia.datastandards.ecds.PriorityTypeCodeType target = null;
                target = (uk.nhs.nhsia.datastandards.ecds.PriorityTypeCodeType)get_store().find_element_user(PRIORITYTYPECODE$0, 0);
                if (target == null)
                {
                    target = (uk.nhs.nhsia.datastandards.ecds.PriorityTypeCodeType)get_store().add_element_user(PRIORITYTYPECODE$0);
                }
                target.set(priorityTypeCode);
            }
        }
        
        /**
         * Unsets the "PriorityTypeCode" element
         */
        public void unsetPriorityTypeCode()
        {
            synchronized (monitor())
            {
                check_orphaned();
                get_store().remove_element(PRIORITYTYPECODE$0, 0);
            }
        }
        
        /**
         * Gets the "ServiceTypeRequestedCode" element
         */
        public uk.nhs.nhsia.datastandards.ecds.ServiceTypeRequestedCodeType.Enum getServiceTypeRequestedCode()
        {
            synchronized (monitor())
            {
                check_orphaned();
                org.apache.xmlbeans.SimpleValue target = null;
                target = (org.apache.xmlbeans.SimpleValue)get_store().find_element_user(SERVICETYPEREQUESTEDCODE$2, 0);
                if (target == null)
                {
                    return null;
                }
                return (uk.nhs.nhsia.datastandards.ecds.ServiceTypeRequestedCodeType.Enum)target.getEnumValue();
            }
        }
        
        /**
         * Gets (as xml) the "ServiceTypeRequestedCode" element
         */
        public uk.nhs.nhsia.datastandards.ecds.ServiceTypeRequestedCodeType xgetServiceTypeRequestedCode()
        {
            synchronized (monitor())
            {
                check_orphaned();
                uk.nhs.nhsia.datastandards.ecds.ServiceTypeRequestedCodeType target = null;
                target = (uk.nhs.nhsia.datastandards.ecds.ServiceTypeRequestedCodeType)get_store().find_element_user(SERVICETYPEREQUESTEDCODE$2, 0);
                return target;
            }
        }
        
        /**
         * True if has "ServiceTypeRequestedCode" element
         */
        public boolean isSetServiceTypeRequestedCode()
        {
            synchronized (monitor())
            {
                check_orphaned();
                return get_store().count_elements(SERVICETYPEREQUESTEDCODE$2) != 0;
            }
        }
        
        /**
         * Sets the "ServiceTypeRequestedCode" element
         */
        public void setServiceTypeRequestedCode(uk.nhs.nhsia.datastandards.ecds.ServiceTypeRequestedCodeType.Enum serviceTypeRequestedCode)
        {
            synchronized (monitor())
            {
                check_orphaned();
                org.apache.xmlbeans.SimpleValue target = null;
                target = (org.apache.xmlbeans.SimpleValue)get_store().find_element_user(SERVICETYPEREQUESTEDCODE$2, 0);
                if (target == null)
                {
                    target = (org.apache.xmlbeans.SimpleValue)get_store().add_element_user(SERVICETYPEREQUESTEDCODE$2);
                }
                target.setEnumValue(serviceTypeRequestedCode);
            }
        }
        
        /**
         * Sets (as xml) the "ServiceTypeRequestedCode" element
         */
        public void xsetServiceTypeRequestedCode(uk.nhs.nhsia.datastandards.ecds.ServiceTypeRequestedCodeType serviceTypeRequestedCode)
        {
            synchronized (monitor())
            {
                check_orphaned();
                uk.nhs.nhsia.datastandards.ecds.ServiceTypeRequestedCodeType target = null;
                target = (uk.nhs.nhsia.datastandards.ecds.ServiceTypeRequestedCodeType)get_store().find_element_user(SERVICETYPEREQUESTEDCODE$2, 0);
                if (target == null)
                {
                    target = (uk.nhs.nhsia.datastandards.ecds.ServiceTypeRequestedCodeType)get_store().add_element_user(SERVICETYPEREQUESTEDCODE$2);
                }
                target.set(serviceTypeRequestedCode);
            }
        }
        
        /**
         * Unsets the "ServiceTypeRequestedCode" element
         */
        public void unsetServiceTypeRequestedCode()
        {
            synchronized (monitor())
            {
                check_orphaned();
                get_store().remove_element(SERVICETYPEREQUESTEDCODE$2, 0);
            }
        }
        
        /**
         * Gets the "SourceOfReferralForOut_Patients" element
         */
        public uk.nhs.nhsia.datastandards.ecds.SourceOfReferralForOutPatientsType.Enum getSourceOfReferralForOutPatients()
        {
            synchronized (monitor())
            {
                check_orphaned();
                org.apache.xmlbeans.SimpleValue target = null;
                target = (org.apache.xmlbeans.SimpleValue)get_store().find_element_user(SOURCEOFREFERRALFOROUTPATIENTS$4, 0);
                if (target == null)
                {
                    return null;
                }
                return (uk.nhs.nhsia.datastandards.ecds.SourceOfReferralForOutPatientsType.Enum)target.getEnumValue();
            }
        }
        
        /**
         * Gets (as xml) the "SourceOfReferralForOut_Patients" element
         */
        public uk.nhs.nhsia.datastandards.ecds.SourceOfReferralForOutPatientsType xgetSourceOfReferralForOutPatients()
        {
            synchronized (monitor())
            {
                check_orphaned();
                uk.nhs.nhsia.datastandards.ecds.SourceOfReferralForOutPatientsType target = null;
                target = (uk.nhs.nhsia.datastandards.ecds.SourceOfReferralForOutPatientsType)get_store().find_element_user(SOURCEOFREFERRALFOROUTPATIENTS$4, 0);
                return target;
            }
        }
        
        /**
         * True if has "SourceOfReferralForOut_Patients" element
         */
        public boolean isSetSourceOfReferralForOutPatients()
        {
            synchronized (monitor())
            {
                check_orphaned();
                return get_store().count_elements(SOURCEOFREFERRALFOROUTPATIENTS$4) != 0;
            }
        }
        
        /**
         * Sets the "SourceOfReferralForOut_Patients" element
         */
        public void setSourceOfReferralForOutPatients(uk.nhs.nhsia.datastandards.ecds.SourceOfReferralForOutPatientsType.Enum sourceOfReferralForOutPatients)
        {
            synchronized (monitor())
            {
                check_orphaned();
                org.apache.xmlbeans.SimpleValue target = null;
                target = (org.apache.xmlbeans.SimpleValue)get_store().find_element_user(SOURCEOFREFERRALFOROUTPATIENTS$4, 0);
                if (target == null)
                {
                    target = (org.apache.xmlbeans.SimpleValue)get_store().add_element_user(SOURCEOFREFERRALFOROUTPATIENTS$4);
                }
                target.setEnumValue(sourceOfReferralForOutPatients);
            }
        }
        
        /**
         * Sets (as xml) the "SourceOfReferralForOut_Patients" element
         */
        public void xsetSourceOfReferralForOutPatients(uk.nhs.nhsia.datastandards.ecds.SourceOfReferralForOutPatientsType sourceOfReferralForOutPatients)
        {
            synchronized (monitor())
            {
                check_orphaned();
                uk.nhs.nhsia.datastandards.ecds.SourceOfReferralForOutPatientsType target = null;
                target = (uk.nhs.nhsia.datastandards.ecds.SourceOfReferralForOutPatientsType)get_store().find_element_user(SOURCEOFREFERRALFOROUTPATIENTS$4, 0);
                if (target == null)
                {
                    target = (uk.nhs.nhsia.datastandards.ecds.SourceOfReferralForOutPatientsType)get_store().add_element_user(SOURCEOFREFERRALFOROUTPATIENTS$4);
                }
                target.set(sourceOfReferralForOutPatients);
            }
        }
        
        /**
         * Unsets the "SourceOfReferralForOut_Patients" element
         */
        public void unsetSourceOfReferralForOutPatients()
        {
            synchronized (monitor())
            {
                check_orphaned();
                get_store().remove_element(SOURCEOFREFERRALFOROUTPATIENTS$4, 0);
            }
        }
        
        /**
         * Gets the "ReferralRequestReceivedDate" element
         */
        public java.util.Calendar getReferralRequestReceivedDate()
        {
            synchronized (monitor())
            {
                check_orphaned();
                org.apache.xmlbeans.SimpleValue target = null;
                target = (org.apache.xmlbeans.SimpleValue)get_store().find_element_user(REFERRALREQUESTRECEIVEDDATE$6, 0);
                if (target == null)
                {
                    return null;
                }
                return target.getCalendarValue();
            }
        }
        
        /**
         * Gets (as xml) the "ReferralRequestReceivedDate" element
         */
        public uk.nhs.nhsia.datastandards.ecds.ReferralRequestReceivedDateType xgetReferralRequestReceivedDate()
        {
            synchronized (monitor())
            {
                check_orphaned();
                uk.nhs.nhsia.datastandards.ecds.ReferralRequestReceivedDateType target = null;
                target = (uk.nhs.nhsia.datastandards.ecds.ReferralRequestReceivedDateType)get_store().find_element_user(REFERRALREQUESTRECEIVEDDATE$6, 0);
                return target;
            }
        }
        
        /**
         * True if has "ReferralRequestReceivedDate" element
         */
        public boolean isSetReferralRequestReceivedDate()
        {
            synchronized (monitor())
            {
                check_orphaned();
                return get_store().count_elements(REFERRALREQUESTRECEIVEDDATE$6) != 0;
            }
        }
        
        /**
         * Sets the "ReferralRequestReceivedDate" element
         */
        public void setReferralRequestReceivedDate(java.util.Calendar referralRequestReceivedDate)
        {
            synchronized (monitor())
            {
                check_orphaned();
                org.apache.xmlbeans.SimpleValue target = null;
                target = (org.apache.xmlbeans.SimpleValue)get_store().find_element_user(REFERRALREQUESTRECEIVEDDATE$6, 0);
                if (target == null)
                {
                    target = (org.apache.xmlbeans.SimpleValue)get_store().add_element_user(REFERRALREQUESTRECEIVEDDATE$6);
                }
                target.setCalendarValue(referralRequestReceivedDate);
            }
        }
        
        /**
         * Sets (as xml) the "ReferralRequestReceivedDate" element
         */
        public void xsetReferralRequestReceivedDate(uk.nhs.nhsia.datastandards.ecds.ReferralRequestReceivedDateType referralRequestReceivedDate)
        {
            synchronized (monitor())
            {
                check_orphaned();
                uk.nhs.nhsia.datastandards.ecds.ReferralRequestReceivedDateType target = null;
                target = (uk.nhs.nhsia.datastandards.ecds.ReferralRequestReceivedDateType)get_store().find_element_user(REFERRALREQUESTRECEIVEDDATE$6, 0);
                if (target == null)
                {
                    target = (uk.nhs.nhsia.datastandards.ecds.ReferralRequestReceivedDateType)get_store().add_element_user(REFERRALREQUESTRECEIVEDDATE$6);
                }
                target.set(referralRequestReceivedDate);
            }
        }
        
        /**
         * Unsets the "ReferralRequestReceivedDate" element
         */
        public void unsetReferralRequestReceivedDate()
        {
            synchronized (monitor())
            {
                check_orphaned();
                get_store().remove_element(REFERRALREQUESTRECEIVEDDATE$6, 0);
            }
        }
        
        /**
         * Gets the "DirectAccessReferralIndicator" element
         */
        public uk.nhs.nhsia.datastandards.ecds.DirectAccessReferralIndicatorType.Enum getDirectAccessReferralIndicator()
        {
            synchronized (monitor())
            {
                check_orphaned();
                org.apache.xmlbeans.SimpleValue target = null;
                target = (org.apache.xmlbeans.SimpleValue)get_store().find_element_user(DIRECTACCESSREFERRALINDICATOR$8, 0);
                if (target == null)
                {
                    return null;
                }
                return (uk.nhs.nhsia.datastandards.ecds.DirectAccessReferralIndicatorType.Enum)target.getEnumValue();
            }
        }
        
        /**
         * Gets (as xml) the "DirectAccessReferralIndicator" element
         */
        public uk.nhs.nhsia.datastandards.ecds.DirectAccessReferralIndicatorType xgetDirectAccessReferralIndicator()
        {
            synchronized (monitor())
            {
                check_orphaned();
                uk.nhs.nhsia.datastandards.ecds.DirectAccessReferralIndicatorType target = null;
                target = (uk.nhs.nhsia.datastandards.ecds.DirectAccessReferralIndicatorType)get_store().find_element_user(DIRECTACCESSREFERRALINDICATOR$8, 0);
                return target;
            }
        }
        
        /**
         * True if has "DirectAccessReferralIndicator" element
         */
        public boolean isSetDirectAccessReferralIndicator()
        {
            synchronized (monitor())
            {
                check_orphaned();
                return get_store().count_elements(DIRECTACCESSREFERRALINDICATOR$8) != 0;
            }
        }
        
        /**
         * Sets the "DirectAccessReferralIndicator" element
         */
        public void setDirectAccessReferralIndicator(uk.nhs.nhsia.datastandards.ecds.DirectAccessReferralIndicatorType.Enum directAccessReferralIndicator)
        {
            synchronized (monitor())
            {
                check_orphaned();
                org.apache.xmlbeans.SimpleValue target = null;
                target = (org.apache.xmlbeans.SimpleValue)get_store().find_element_user(DIRECTACCESSREFERRALINDICATOR$8, 0);
                if (target == null)
                {
                    target = (org.apache.xmlbeans.SimpleValue)get_store().add_element_user(DIRECTACCESSREFERRALINDICATOR$8);
                }
                target.setEnumValue(directAccessReferralIndicator);
            }
        }
        
        /**
         * Sets (as xml) the "DirectAccessReferralIndicator" element
         */
        public void xsetDirectAccessReferralIndicator(uk.nhs.nhsia.datastandards.ecds.DirectAccessReferralIndicatorType directAccessReferralIndicator)
        {
            synchronized (monitor())
            {
                check_orphaned();
                uk.nhs.nhsia.datastandards.ecds.DirectAccessReferralIndicatorType target = null;
                target = (uk.nhs.nhsia.datastandards.ecds.DirectAccessReferralIndicatorType)get_store().find_element_user(DIRECTACCESSREFERRALINDICATOR$8, 0);
                if (target == null)
                {
                    target = (uk.nhs.nhsia.datastandards.ecds.DirectAccessReferralIndicatorType)get_store().add_element_user(DIRECTACCESSREFERRALINDICATOR$8);
                }
                target.set(directAccessReferralIndicator);
            }
        }
        
        /**
         * Unsets the "DirectAccessReferralIndicator" element
         */
        public void unsetDirectAccessReferralIndicator()
        {
            synchronized (monitor())
            {
                check_orphaned();
                get_store().remove_element(DIRECTACCESSREFERRALINDICATOR$8, 0);
            }
        }
    }
}
