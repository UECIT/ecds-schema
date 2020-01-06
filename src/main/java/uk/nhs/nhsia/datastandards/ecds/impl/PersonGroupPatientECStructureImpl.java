/*
 * XML Type:  PersonGroupPatient_EC_Structure
 * Namespace: http://www.nhsia.nhs.uk/DataStandards/XMLschema/CDS/ns
 * Java type: uk.nhs.nhsia.datastandards.ecds.PersonGroupPatientECStructure
 *
 * Automatically generated - do not modify.
 */
package uk.nhs.nhsia.datastandards.ecds.impl;
/**
 * An XML PersonGroupPatient_EC_Structure(@http://www.nhsia.nhs.uk/DataStandards/XMLschema/CDS/ns).
 *
 * This is a complex type.
 */
public class PersonGroupPatientECStructureImpl extends org.apache.xmlbeans.impl.values.XmlComplexContentImpl implements uk.nhs.nhsia.datastandards.ecds.PersonGroupPatientECStructure
{
    private static final long serialVersionUID = 1L;
    
    public PersonGroupPatientECStructureImpl(org.apache.xmlbeans.SchemaType sType)
    {
        super(sType);
    }
    
    private static final javax.xml.namespace.QName PATIENTIDENTITY$0 = 
        new javax.xml.namespace.QName("http://www.nhsia.nhs.uk/DataStandards/XMLschema/CDS/ns", "PatientIdentity");
    private static final javax.xml.namespace.QName PATIENTCHARACTERISTICSEMERGENCYCARE$2 = 
        new javax.xml.namespace.QName("http://www.nhsia.nhs.uk/DataStandards/XMLschema/CDS/ns", "PatientCharacteristics_EmergencyCare");
    private static final javax.xml.namespace.QName MENTALHEALTHACTLEGALSTATUS$4 = 
        new javax.xml.namespace.QName("http://www.nhsia.nhs.uk/DataStandards/XMLschema/CDS/ns", "MentalHealthActLegalStatus");
    
    
    /**
     * Gets the "PatientIdentity" element
     */
    public uk.nhs.nhsia.datastandards.ecds.PatientIdentity getPatientIdentity()
    {
        synchronized (monitor())
        {
            check_orphaned();
            uk.nhs.nhsia.datastandards.ecds.PatientIdentity target = null;
            target = (uk.nhs.nhsia.datastandards.ecds.PatientIdentity)get_store().find_element_user(PATIENTIDENTITY$0, 0);
            if (target == null)
            {
                return null;
            }
            return target;
        }
    }
    
    /**
     * Sets the "PatientIdentity" element
     */
    public void setPatientIdentity(uk.nhs.nhsia.datastandards.ecds.PatientIdentity patientIdentity)
    {
        generatedSetterHelperImpl(patientIdentity, PATIENTIDENTITY$0, 0, org.apache.xmlbeans.impl.values.XmlObjectBase.KIND_SETTERHELPER_SINGLETON);
    }
    
    /**
     * Appends and returns a new empty "PatientIdentity" element
     */
    public uk.nhs.nhsia.datastandards.ecds.PatientIdentity addNewPatientIdentity()
    {
        synchronized (monitor())
        {
            check_orphaned();
            uk.nhs.nhsia.datastandards.ecds.PatientIdentity target = null;
            target = (uk.nhs.nhsia.datastandards.ecds.PatientIdentity)get_store().add_element_user(PATIENTIDENTITY$0);
            return target;
        }
    }
    
    /**
     * Gets the "PatientCharacteristics_EmergencyCare" element
     */
    public uk.nhs.nhsia.datastandards.ecds.PatientCharacteristicsEmergencyCareStructure getPatientCharacteristicsEmergencyCare()
    {
        synchronized (monitor())
        {
            check_orphaned();
            uk.nhs.nhsia.datastandards.ecds.PatientCharacteristicsEmergencyCareStructure target = null;
            target = (uk.nhs.nhsia.datastandards.ecds.PatientCharacteristicsEmergencyCareStructure)get_store().find_element_user(PATIENTCHARACTERISTICSEMERGENCYCARE$2, 0);
            if (target == null)
            {
                return null;
            }
            return target;
        }
    }
    
    /**
     * True if has "PatientCharacteristics_EmergencyCare" element
     */
    public boolean isSetPatientCharacteristicsEmergencyCare()
    {
        synchronized (monitor())
        {
            check_orphaned();
            return get_store().count_elements(PATIENTCHARACTERISTICSEMERGENCYCARE$2) != 0;
        }
    }
    
    /**
     * Sets the "PatientCharacteristics_EmergencyCare" element
     */
    public void setPatientCharacteristicsEmergencyCare(uk.nhs.nhsia.datastandards.ecds.PatientCharacteristicsEmergencyCareStructure patientCharacteristicsEmergencyCare)
    {
        generatedSetterHelperImpl(patientCharacteristicsEmergencyCare, PATIENTCHARACTERISTICSEMERGENCYCARE$2, 0, org.apache.xmlbeans.impl.values.XmlObjectBase.KIND_SETTERHELPER_SINGLETON);
    }
    
    /**
     * Appends and returns a new empty "PatientCharacteristics_EmergencyCare" element
     */
    public uk.nhs.nhsia.datastandards.ecds.PatientCharacteristicsEmergencyCareStructure addNewPatientCharacteristicsEmergencyCare()
    {
        synchronized (monitor())
        {
            check_orphaned();
            uk.nhs.nhsia.datastandards.ecds.PatientCharacteristicsEmergencyCareStructure target = null;
            target = (uk.nhs.nhsia.datastandards.ecds.PatientCharacteristicsEmergencyCareStructure)get_store().add_element_user(PATIENTCHARACTERISTICSEMERGENCYCARE$2);
            return target;
        }
    }
    
    /**
     * Unsets the "PatientCharacteristics_EmergencyCare" element
     */
    public void unsetPatientCharacteristicsEmergencyCare()
    {
        synchronized (monitor())
        {
            check_orphaned();
            get_store().remove_element(PATIENTCHARACTERISTICSEMERGENCYCARE$2, 0);
        }
    }
    
    /**
     * Gets array of all "MentalHealthActLegalStatus" elements
     */
    public uk.nhs.nhsia.datastandards.ecds.PersonGroupPatientECStructure.MentalHealthActLegalStatus[] getMentalHealthActLegalStatusArray()
    {
        synchronized (monitor())
        {
            check_orphaned();
            java.util.List targetList = new java.util.ArrayList();
            get_store().find_all_element_users(MENTALHEALTHACTLEGALSTATUS$4, targetList);
            uk.nhs.nhsia.datastandards.ecds.PersonGroupPatientECStructure.MentalHealthActLegalStatus[] result = new uk.nhs.nhsia.datastandards.ecds.PersonGroupPatientECStructure.MentalHealthActLegalStatus[targetList.size()];
            targetList.toArray(result);
            return result;
        }
    }
    
    /**
     * Gets ith "MentalHealthActLegalStatus" element
     */
    public uk.nhs.nhsia.datastandards.ecds.PersonGroupPatientECStructure.MentalHealthActLegalStatus getMentalHealthActLegalStatusArray(int i)
    {
        synchronized (monitor())
        {
            check_orphaned();
            uk.nhs.nhsia.datastandards.ecds.PersonGroupPatientECStructure.MentalHealthActLegalStatus target = null;
            target = (uk.nhs.nhsia.datastandards.ecds.PersonGroupPatientECStructure.MentalHealthActLegalStatus)get_store().find_element_user(MENTALHEALTHACTLEGALSTATUS$4, i);
            if (target == null)
            {
                throw new IndexOutOfBoundsException();
            }
            return target;
        }
    }
    
    /**
     * Returns number of "MentalHealthActLegalStatus" element
     */
    public int sizeOfMentalHealthActLegalStatusArray()
    {
        synchronized (monitor())
        {
            check_orphaned();
            return get_store().count_elements(MENTALHEALTHACTLEGALSTATUS$4);
        }
    }
    
    /**
     * Sets array of all "MentalHealthActLegalStatus" element  WARNING: This method is not atomicaly synchronized.
     */
    public void setMentalHealthActLegalStatusArray(uk.nhs.nhsia.datastandards.ecds.PersonGroupPatientECStructure.MentalHealthActLegalStatus[] mentalHealthActLegalStatusArray)
    {
        check_orphaned();
        arraySetterHelper(mentalHealthActLegalStatusArray, MENTALHEALTHACTLEGALSTATUS$4);
    }
    
    /**
     * Sets ith "MentalHealthActLegalStatus" element
     */
    public void setMentalHealthActLegalStatusArray(int i, uk.nhs.nhsia.datastandards.ecds.PersonGroupPatientECStructure.MentalHealthActLegalStatus mentalHealthActLegalStatus)
    {
        generatedSetterHelperImpl(mentalHealthActLegalStatus, MENTALHEALTHACTLEGALSTATUS$4, i, org.apache.xmlbeans.impl.values.XmlObjectBase.KIND_SETTERHELPER_ARRAYITEM);
    }
    
    /**
     * Inserts and returns a new empty value (as xml) as the ith "MentalHealthActLegalStatus" element
     */
    public uk.nhs.nhsia.datastandards.ecds.PersonGroupPatientECStructure.MentalHealthActLegalStatus insertNewMentalHealthActLegalStatus(int i)
    {
        synchronized (monitor())
        {
            check_orphaned();
            uk.nhs.nhsia.datastandards.ecds.PersonGroupPatientECStructure.MentalHealthActLegalStatus target = null;
            target = (uk.nhs.nhsia.datastandards.ecds.PersonGroupPatientECStructure.MentalHealthActLegalStatus)get_store().insert_element_user(MENTALHEALTHACTLEGALSTATUS$4, i);
            return target;
        }
    }
    
    /**
     * Appends and returns a new empty value (as xml) as the last "MentalHealthActLegalStatus" element
     */
    public uk.nhs.nhsia.datastandards.ecds.PersonGroupPatientECStructure.MentalHealthActLegalStatus addNewMentalHealthActLegalStatus()
    {
        synchronized (monitor())
        {
            check_orphaned();
            uk.nhs.nhsia.datastandards.ecds.PersonGroupPatientECStructure.MentalHealthActLegalStatus target = null;
            target = (uk.nhs.nhsia.datastandards.ecds.PersonGroupPatientECStructure.MentalHealthActLegalStatus)get_store().add_element_user(MENTALHEALTHACTLEGALSTATUS$4);
            return target;
        }
    }
    
    /**
     * Removes the ith "MentalHealthActLegalStatus" element
     */
    public void removeMentalHealthActLegalStatus(int i)
    {
        synchronized (monitor())
        {
            check_orphaned();
            get_store().remove_element(MENTALHEALTHACTLEGALSTATUS$4, i);
        }
    }
    /**
     * An XML MentalHealthActLegalStatus(@http://www.nhsia.nhs.uk/DataStandards/XMLschema/CDS/ns).
     *
     * This is a complex type.
     */
    public static class MentalHealthActLegalStatusImpl extends org.apache.xmlbeans.impl.values.XmlComplexContentImpl implements uk.nhs.nhsia.datastandards.ecds.PersonGroupPatientECStructure.MentalHealthActLegalStatus
    {
        private static final long serialVersionUID = 1L;
        
        public MentalHealthActLegalStatusImpl(org.apache.xmlbeans.SchemaType sType)
        {
            super(sType);
        }
        
        private static final javax.xml.namespace.QName STARTDATEMENTALHEALTHACTLEGALSTATUSCLASSIFICATIONASSIGNMENTPERIOD$0 = 
            new javax.xml.namespace.QName("http://www.nhsia.nhs.uk/DataStandards/XMLschema/CDS/ns", "StartDate_MentalHealthActLegalStatusClassificationAssignmentPeriod");
        private static final javax.xml.namespace.QName STARTTIMEMENTALHEALTHACTLEGALSTATUSCLASSIFICATIONASSIGNMENTPERIOD$2 = 
            new javax.xml.namespace.QName("http://www.nhsia.nhs.uk/DataStandards/XMLschema/CDS/ns", "StartTime_MentalHealthActLegalStatusClassificationAssignmentPeriod");
        private static final javax.xml.namespace.QName EXPIRYDATEMENTALHEALTHACTLEGALSTATUSCLASSIFICATION$4 = 
            new javax.xml.namespace.QName("http://www.nhsia.nhs.uk/DataStandards/XMLschema/CDS/ns", "ExpiryDate_MentalHealthActLegalStatusClassification");
        private static final javax.xml.namespace.QName EXPIRYTIMEMENTALHEALTHACTLEGALSTATUSCLASSIFICATION$6 = 
            new javax.xml.namespace.QName("http://www.nhsia.nhs.uk/DataStandards/XMLschema/CDS/ns", "ExpiryTime_MentalHealthActLegalStatusClassification");
        private static final javax.xml.namespace.QName MENTALHEALTHACTLEGALSTATUSCLASSIFICATIONCODE$8 = 
            new javax.xml.namespace.QName("http://www.nhsia.nhs.uk/DataStandards/XMLschema/CDS/ns", "MentalHealthActLegalStatusClassificationCode");
        
        
        /**
         * Gets the "StartDate_MentalHealthActLegalStatusClassificationAssignmentPeriod" element
         */
        public java.util.Calendar getStartDateMentalHealthActLegalStatusClassificationAssignmentPeriod()
        {
            synchronized (monitor())
            {
                check_orphaned();
                org.apache.xmlbeans.SimpleValue target = null;
                target = (org.apache.xmlbeans.SimpleValue)get_store().find_element_user(STARTDATEMENTALHEALTHACTLEGALSTATUSCLASSIFICATIONASSIGNMENTPERIOD$0, 0);
                if (target == null)
                {
                    return null;
                }
                return target.getCalendarValue();
            }
        }
        
        /**
         * Gets (as xml) the "StartDate_MentalHealthActLegalStatusClassificationAssignmentPeriod" element
         */
        public uk.nhs.nhsia.datastandards.ecds.DateType xgetStartDateMentalHealthActLegalStatusClassificationAssignmentPeriod()
        {
            synchronized (monitor())
            {
                check_orphaned();
                uk.nhs.nhsia.datastandards.ecds.DateType target = null;
                target = (uk.nhs.nhsia.datastandards.ecds.DateType)get_store().find_element_user(STARTDATEMENTALHEALTHACTLEGALSTATUSCLASSIFICATIONASSIGNMENTPERIOD$0, 0);
                return target;
            }
        }
        
        /**
         * True if has "StartDate_MentalHealthActLegalStatusClassificationAssignmentPeriod" element
         */
        public boolean isSetStartDateMentalHealthActLegalStatusClassificationAssignmentPeriod()
        {
            synchronized (monitor())
            {
                check_orphaned();
                return get_store().count_elements(STARTDATEMENTALHEALTHACTLEGALSTATUSCLASSIFICATIONASSIGNMENTPERIOD$0) != 0;
            }
        }
        
        /**
         * Sets the "StartDate_MentalHealthActLegalStatusClassificationAssignmentPeriod" element
         */
        public void setStartDateMentalHealthActLegalStatusClassificationAssignmentPeriod(java.util.Calendar startDateMentalHealthActLegalStatusClassificationAssignmentPeriod)
        {
            synchronized (monitor())
            {
                check_orphaned();
                org.apache.xmlbeans.SimpleValue target = null;
                target = (org.apache.xmlbeans.SimpleValue)get_store().find_element_user(STARTDATEMENTALHEALTHACTLEGALSTATUSCLASSIFICATIONASSIGNMENTPERIOD$0, 0);
                if (target == null)
                {
                    target = (org.apache.xmlbeans.SimpleValue)get_store().add_element_user(STARTDATEMENTALHEALTHACTLEGALSTATUSCLASSIFICATIONASSIGNMENTPERIOD$0);
                }
                target.setCalendarValue(startDateMentalHealthActLegalStatusClassificationAssignmentPeriod);
            }
        }
        
        /**
         * Sets (as xml) the "StartDate_MentalHealthActLegalStatusClassificationAssignmentPeriod" element
         */
        public void xsetStartDateMentalHealthActLegalStatusClassificationAssignmentPeriod(uk.nhs.nhsia.datastandards.ecds.DateType startDateMentalHealthActLegalStatusClassificationAssignmentPeriod)
        {
            synchronized (monitor())
            {
                check_orphaned();
                uk.nhs.nhsia.datastandards.ecds.DateType target = null;
                target = (uk.nhs.nhsia.datastandards.ecds.DateType)get_store().find_element_user(STARTDATEMENTALHEALTHACTLEGALSTATUSCLASSIFICATIONASSIGNMENTPERIOD$0, 0);
                if (target == null)
                {
                    target = (uk.nhs.nhsia.datastandards.ecds.DateType)get_store().add_element_user(STARTDATEMENTALHEALTHACTLEGALSTATUSCLASSIFICATIONASSIGNMENTPERIOD$0);
                }
                target.set(startDateMentalHealthActLegalStatusClassificationAssignmentPeriod);
            }
        }
        
        /**
         * Unsets the "StartDate_MentalHealthActLegalStatusClassificationAssignmentPeriod" element
         */
        public void unsetStartDateMentalHealthActLegalStatusClassificationAssignmentPeriod()
        {
            synchronized (monitor())
            {
                check_orphaned();
                get_store().remove_element(STARTDATEMENTALHEALTHACTLEGALSTATUSCLASSIFICATIONASSIGNMENTPERIOD$0, 0);
            }
        }
        
        /**
         * Gets the "StartTime_MentalHealthActLegalStatusClassificationAssignmentPeriod" element
         */
        public java.util.Calendar getStartTimeMentalHealthActLegalStatusClassificationAssignmentPeriod()
        {
            synchronized (monitor())
            {
                check_orphaned();
                org.apache.xmlbeans.SimpleValue target = null;
                target = (org.apache.xmlbeans.SimpleValue)get_store().find_element_user(STARTTIMEMENTALHEALTHACTLEGALSTATUSCLASSIFICATIONASSIGNMENTPERIOD$2, 0);
                if (target == null)
                {
                    return null;
                }
                return target.getCalendarValue();
            }
        }
        
        /**
         * Gets (as xml) the "StartTime_MentalHealthActLegalStatusClassificationAssignmentPeriod" element
         */
        public uk.nhs.nhsia.datastandards.ecds.TimeType xgetStartTimeMentalHealthActLegalStatusClassificationAssignmentPeriod()
        {
            synchronized (monitor())
            {
                check_orphaned();
                uk.nhs.nhsia.datastandards.ecds.TimeType target = null;
                target = (uk.nhs.nhsia.datastandards.ecds.TimeType)get_store().find_element_user(STARTTIMEMENTALHEALTHACTLEGALSTATUSCLASSIFICATIONASSIGNMENTPERIOD$2, 0);
                return target;
            }
        }
        
        /**
         * True if has "StartTime_MentalHealthActLegalStatusClassificationAssignmentPeriod" element
         */
        public boolean isSetStartTimeMentalHealthActLegalStatusClassificationAssignmentPeriod()
        {
            synchronized (monitor())
            {
                check_orphaned();
                return get_store().count_elements(STARTTIMEMENTALHEALTHACTLEGALSTATUSCLASSIFICATIONASSIGNMENTPERIOD$2) != 0;
            }
        }
        
        /**
         * Sets the "StartTime_MentalHealthActLegalStatusClassificationAssignmentPeriod" element
         */
        public void setStartTimeMentalHealthActLegalStatusClassificationAssignmentPeriod(java.util.Calendar startTimeMentalHealthActLegalStatusClassificationAssignmentPeriod)
        {
            synchronized (monitor())
            {
                check_orphaned();
                org.apache.xmlbeans.SimpleValue target = null;
                target = (org.apache.xmlbeans.SimpleValue)get_store().find_element_user(STARTTIMEMENTALHEALTHACTLEGALSTATUSCLASSIFICATIONASSIGNMENTPERIOD$2, 0);
                if (target == null)
                {
                    target = (org.apache.xmlbeans.SimpleValue)get_store().add_element_user(STARTTIMEMENTALHEALTHACTLEGALSTATUSCLASSIFICATIONASSIGNMENTPERIOD$2);
                }
                target.setCalendarValue(startTimeMentalHealthActLegalStatusClassificationAssignmentPeriod);
            }
        }
        
        /**
         * Sets (as xml) the "StartTime_MentalHealthActLegalStatusClassificationAssignmentPeriod" element
         */
        public void xsetStartTimeMentalHealthActLegalStatusClassificationAssignmentPeriod(uk.nhs.nhsia.datastandards.ecds.TimeType startTimeMentalHealthActLegalStatusClassificationAssignmentPeriod)
        {
            synchronized (monitor())
            {
                check_orphaned();
                uk.nhs.nhsia.datastandards.ecds.TimeType target = null;
                target = (uk.nhs.nhsia.datastandards.ecds.TimeType)get_store().find_element_user(STARTTIMEMENTALHEALTHACTLEGALSTATUSCLASSIFICATIONASSIGNMENTPERIOD$2, 0);
                if (target == null)
                {
                    target = (uk.nhs.nhsia.datastandards.ecds.TimeType)get_store().add_element_user(STARTTIMEMENTALHEALTHACTLEGALSTATUSCLASSIFICATIONASSIGNMENTPERIOD$2);
                }
                target.set(startTimeMentalHealthActLegalStatusClassificationAssignmentPeriod);
            }
        }
        
        /**
         * Unsets the "StartTime_MentalHealthActLegalStatusClassificationAssignmentPeriod" element
         */
        public void unsetStartTimeMentalHealthActLegalStatusClassificationAssignmentPeriod()
        {
            synchronized (monitor())
            {
                check_orphaned();
                get_store().remove_element(STARTTIMEMENTALHEALTHACTLEGALSTATUSCLASSIFICATIONASSIGNMENTPERIOD$2, 0);
            }
        }
        
        /**
         * Gets the "ExpiryDate_MentalHealthActLegalStatusClassification" element
         */
        public java.util.Calendar getExpiryDateMentalHealthActLegalStatusClassification()
        {
            synchronized (monitor())
            {
                check_orphaned();
                org.apache.xmlbeans.SimpleValue target = null;
                target = (org.apache.xmlbeans.SimpleValue)get_store().find_element_user(EXPIRYDATEMENTALHEALTHACTLEGALSTATUSCLASSIFICATION$4, 0);
                if (target == null)
                {
                    return null;
                }
                return target.getCalendarValue();
            }
        }
        
        /**
         * Gets (as xml) the "ExpiryDate_MentalHealthActLegalStatusClassification" element
         */
        public uk.nhs.nhsia.datastandards.ecds.DateType xgetExpiryDateMentalHealthActLegalStatusClassification()
        {
            synchronized (monitor())
            {
                check_orphaned();
                uk.nhs.nhsia.datastandards.ecds.DateType target = null;
                target = (uk.nhs.nhsia.datastandards.ecds.DateType)get_store().find_element_user(EXPIRYDATEMENTALHEALTHACTLEGALSTATUSCLASSIFICATION$4, 0);
                return target;
            }
        }
        
        /**
         * True if has "ExpiryDate_MentalHealthActLegalStatusClassification" element
         */
        public boolean isSetExpiryDateMentalHealthActLegalStatusClassification()
        {
            synchronized (monitor())
            {
                check_orphaned();
                return get_store().count_elements(EXPIRYDATEMENTALHEALTHACTLEGALSTATUSCLASSIFICATION$4) != 0;
            }
        }
        
        /**
         * Sets the "ExpiryDate_MentalHealthActLegalStatusClassification" element
         */
        public void setExpiryDateMentalHealthActLegalStatusClassification(java.util.Calendar expiryDateMentalHealthActLegalStatusClassification)
        {
            synchronized (monitor())
            {
                check_orphaned();
                org.apache.xmlbeans.SimpleValue target = null;
                target = (org.apache.xmlbeans.SimpleValue)get_store().find_element_user(EXPIRYDATEMENTALHEALTHACTLEGALSTATUSCLASSIFICATION$4, 0);
                if (target == null)
                {
                    target = (org.apache.xmlbeans.SimpleValue)get_store().add_element_user(EXPIRYDATEMENTALHEALTHACTLEGALSTATUSCLASSIFICATION$4);
                }
                target.setCalendarValue(expiryDateMentalHealthActLegalStatusClassification);
            }
        }
        
        /**
         * Sets (as xml) the "ExpiryDate_MentalHealthActLegalStatusClassification" element
         */
        public void xsetExpiryDateMentalHealthActLegalStatusClassification(uk.nhs.nhsia.datastandards.ecds.DateType expiryDateMentalHealthActLegalStatusClassification)
        {
            synchronized (monitor())
            {
                check_orphaned();
                uk.nhs.nhsia.datastandards.ecds.DateType target = null;
                target = (uk.nhs.nhsia.datastandards.ecds.DateType)get_store().find_element_user(EXPIRYDATEMENTALHEALTHACTLEGALSTATUSCLASSIFICATION$4, 0);
                if (target == null)
                {
                    target = (uk.nhs.nhsia.datastandards.ecds.DateType)get_store().add_element_user(EXPIRYDATEMENTALHEALTHACTLEGALSTATUSCLASSIFICATION$4);
                }
                target.set(expiryDateMentalHealthActLegalStatusClassification);
            }
        }
        
        /**
         * Unsets the "ExpiryDate_MentalHealthActLegalStatusClassification" element
         */
        public void unsetExpiryDateMentalHealthActLegalStatusClassification()
        {
            synchronized (monitor())
            {
                check_orphaned();
                get_store().remove_element(EXPIRYDATEMENTALHEALTHACTLEGALSTATUSCLASSIFICATION$4, 0);
            }
        }
        
        /**
         * Gets the "ExpiryTime_MentalHealthActLegalStatusClassification" element
         */
        public java.util.Calendar getExpiryTimeMentalHealthActLegalStatusClassification()
        {
            synchronized (monitor())
            {
                check_orphaned();
                org.apache.xmlbeans.SimpleValue target = null;
                target = (org.apache.xmlbeans.SimpleValue)get_store().find_element_user(EXPIRYTIMEMENTALHEALTHACTLEGALSTATUSCLASSIFICATION$6, 0);
                if (target == null)
                {
                    return null;
                }
                return target.getCalendarValue();
            }
        }
        
        /**
         * Gets (as xml) the "ExpiryTime_MentalHealthActLegalStatusClassification" element
         */
        public uk.nhs.nhsia.datastandards.ecds.TimeType xgetExpiryTimeMentalHealthActLegalStatusClassification()
        {
            synchronized (monitor())
            {
                check_orphaned();
                uk.nhs.nhsia.datastandards.ecds.TimeType target = null;
                target = (uk.nhs.nhsia.datastandards.ecds.TimeType)get_store().find_element_user(EXPIRYTIMEMENTALHEALTHACTLEGALSTATUSCLASSIFICATION$6, 0);
                return target;
            }
        }
        
        /**
         * True if has "ExpiryTime_MentalHealthActLegalStatusClassification" element
         */
        public boolean isSetExpiryTimeMentalHealthActLegalStatusClassification()
        {
            synchronized (monitor())
            {
                check_orphaned();
                return get_store().count_elements(EXPIRYTIMEMENTALHEALTHACTLEGALSTATUSCLASSIFICATION$6) != 0;
            }
        }
        
        /**
         * Sets the "ExpiryTime_MentalHealthActLegalStatusClassification" element
         */
        public void setExpiryTimeMentalHealthActLegalStatusClassification(java.util.Calendar expiryTimeMentalHealthActLegalStatusClassification)
        {
            synchronized (monitor())
            {
                check_orphaned();
                org.apache.xmlbeans.SimpleValue target = null;
                target = (org.apache.xmlbeans.SimpleValue)get_store().find_element_user(EXPIRYTIMEMENTALHEALTHACTLEGALSTATUSCLASSIFICATION$6, 0);
                if (target == null)
                {
                    target = (org.apache.xmlbeans.SimpleValue)get_store().add_element_user(EXPIRYTIMEMENTALHEALTHACTLEGALSTATUSCLASSIFICATION$6);
                }
                target.setCalendarValue(expiryTimeMentalHealthActLegalStatusClassification);
            }
        }
        
        /**
         * Sets (as xml) the "ExpiryTime_MentalHealthActLegalStatusClassification" element
         */
        public void xsetExpiryTimeMentalHealthActLegalStatusClassification(uk.nhs.nhsia.datastandards.ecds.TimeType expiryTimeMentalHealthActLegalStatusClassification)
        {
            synchronized (monitor())
            {
                check_orphaned();
                uk.nhs.nhsia.datastandards.ecds.TimeType target = null;
                target = (uk.nhs.nhsia.datastandards.ecds.TimeType)get_store().find_element_user(EXPIRYTIMEMENTALHEALTHACTLEGALSTATUSCLASSIFICATION$6, 0);
                if (target == null)
                {
                    target = (uk.nhs.nhsia.datastandards.ecds.TimeType)get_store().add_element_user(EXPIRYTIMEMENTALHEALTHACTLEGALSTATUSCLASSIFICATION$6);
                }
                target.set(expiryTimeMentalHealthActLegalStatusClassification);
            }
        }
        
        /**
         * Unsets the "ExpiryTime_MentalHealthActLegalStatusClassification" element
         */
        public void unsetExpiryTimeMentalHealthActLegalStatusClassification()
        {
            synchronized (monitor())
            {
                check_orphaned();
                get_store().remove_element(EXPIRYTIMEMENTALHEALTHACTLEGALSTATUSCLASSIFICATION$6, 0);
            }
        }
        
        /**
         * Gets the "MentalHealthActLegalStatusClassificationCode" element
         */
        public uk.nhs.nhsia.datastandards.ecds.MHStatusECType.Enum getMentalHealthActLegalStatusClassificationCode()
        {
            synchronized (monitor())
            {
                check_orphaned();
                org.apache.xmlbeans.SimpleValue target = null;
                target = (org.apache.xmlbeans.SimpleValue)get_store().find_element_user(MENTALHEALTHACTLEGALSTATUSCLASSIFICATIONCODE$8, 0);
                if (target == null)
                {
                    return null;
                }
                return (uk.nhs.nhsia.datastandards.ecds.MHStatusECType.Enum)target.getEnumValue();
            }
        }
        
        /**
         * Gets (as xml) the "MentalHealthActLegalStatusClassificationCode" element
         */
        public uk.nhs.nhsia.datastandards.ecds.MHStatusECType xgetMentalHealthActLegalStatusClassificationCode()
        {
            synchronized (monitor())
            {
                check_orphaned();
                uk.nhs.nhsia.datastandards.ecds.MHStatusECType target = null;
                target = (uk.nhs.nhsia.datastandards.ecds.MHStatusECType)get_store().find_element_user(MENTALHEALTHACTLEGALSTATUSCLASSIFICATIONCODE$8, 0);
                return target;
            }
        }
        
        /**
         * Sets the "MentalHealthActLegalStatusClassificationCode" element
         */
        public void setMentalHealthActLegalStatusClassificationCode(uk.nhs.nhsia.datastandards.ecds.MHStatusECType.Enum mentalHealthActLegalStatusClassificationCode)
        {
            synchronized (monitor())
            {
                check_orphaned();
                org.apache.xmlbeans.SimpleValue target = null;
                target = (org.apache.xmlbeans.SimpleValue)get_store().find_element_user(MENTALHEALTHACTLEGALSTATUSCLASSIFICATIONCODE$8, 0);
                if (target == null)
                {
                    target = (org.apache.xmlbeans.SimpleValue)get_store().add_element_user(MENTALHEALTHACTLEGALSTATUSCLASSIFICATIONCODE$8);
                }
                target.setEnumValue(mentalHealthActLegalStatusClassificationCode);
            }
        }
        
        /**
         * Sets (as xml) the "MentalHealthActLegalStatusClassificationCode" element
         */
        public void xsetMentalHealthActLegalStatusClassificationCode(uk.nhs.nhsia.datastandards.ecds.MHStatusECType mentalHealthActLegalStatusClassificationCode)
        {
            synchronized (monitor())
            {
                check_orphaned();
                uk.nhs.nhsia.datastandards.ecds.MHStatusECType target = null;
                target = (uk.nhs.nhsia.datastandards.ecds.MHStatusECType)get_store().find_element_user(MENTALHEALTHACTLEGALSTATUSCLASSIFICATIONCODE$8, 0);
                if (target == null)
                {
                    target = (uk.nhs.nhsia.datastandards.ecds.MHStatusECType)get_store().add_element_user(MENTALHEALTHACTLEGALSTATUSCLASSIFICATIONCODE$8);
                }
                target.set(mentalHealthActLegalStatusClassificationCode);
            }
        }
    }
}
