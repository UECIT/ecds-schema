/*
 * XML Type:  PsychiatricEpisode_Structure
 * Namespace: http://www.nhsia.nhs.uk/DataStandards/XMLschema/CDS/ns
 * Java type: uk.nhs.nhsia.datastandards.ecds.PsychiatricEpisodeStructure
 *
 * Automatically generated - do not modify.
 */
package uk.nhs.nhsia.datastandards.ecds.impl;
/**
 * An XML PsychiatricEpisode_Structure(@http://www.nhsia.nhs.uk/DataStandards/XMLschema/CDS/ns).
 *
 * This is a complex type.
 */
public class PsychiatricEpisodeStructureImpl extends org.apache.xmlbeans.impl.values.XmlComplexContentImpl implements uk.nhs.nhsia.datastandards.ecds.PsychiatricEpisodeStructure
{
    private static final long serialVersionUID = 1L;
    
    public PsychiatricEpisodeStructureImpl(org.apache.xmlbeans.SchemaType sType)
    {
        super(sType);
    }
    
    private static final javax.xml.namespace.QName EPISODECHARACTERISTICS$0 = 
        new javax.xml.namespace.QName("http://www.nhsia.nhs.uk/DataStandards/XMLschema/CDS/ns", "EpisodeCharacteristics");
    private static final javax.xml.namespace.QName SERVICEAGREEMENTDETAILS$2 = 
        new javax.xml.namespace.QName("http://www.nhsia.nhs.uk/DataStandards/XMLschema/CDS/ns", "ServiceAgreementDetails");
    private static final javax.xml.namespace.QName PERSONGROUPCONSULTANT$4 = 
        new javax.xml.namespace.QName("http://www.nhsia.nhs.uk/DataStandards/XMLschema/CDS/ns", "PersonGroup_Consultant");
    private static final javax.xml.namespace.QName CLINICALDIAGNOSISDETAILS$6 = 
        new javax.xml.namespace.QName("http://www.nhsia.nhs.uk/DataStandards/XMLschema/CDS/ns", "ClinicalDiagnosisDetails");
    private static final javax.xml.namespace.QName LOCATIONGROUP$8 = 
        new javax.xml.namespace.QName("http://www.nhsia.nhs.uk/DataStandards/XMLschema/CDS/ns", "LocationGroup");
    
    
    /**
     * Gets the "EpisodeCharacteristics" element
     */
    public uk.nhs.nhsia.datastandards.ecds.PsychiatricEpisodeStructure.EpisodeCharacteristics getEpisodeCharacteristics()
    {
        synchronized (monitor())
        {
            check_orphaned();
            uk.nhs.nhsia.datastandards.ecds.PsychiatricEpisodeStructure.EpisodeCharacteristics target = null;
            target = (uk.nhs.nhsia.datastandards.ecds.PsychiatricEpisodeStructure.EpisodeCharacteristics)get_store().find_element_user(EPISODECHARACTERISTICS$0, 0);
            if (target == null)
            {
                return null;
            }
            return target;
        }
    }
    
    /**
     * Sets the "EpisodeCharacteristics" element
     */
    public void setEpisodeCharacteristics(uk.nhs.nhsia.datastandards.ecds.PsychiatricEpisodeStructure.EpisodeCharacteristics episodeCharacteristics)
    {
        generatedSetterHelperImpl(episodeCharacteristics, EPISODECHARACTERISTICS$0, 0, org.apache.xmlbeans.impl.values.XmlObjectBase.KIND_SETTERHELPER_SINGLETON);
    }
    
    /**
     * Appends and returns a new empty "EpisodeCharacteristics" element
     */
    public uk.nhs.nhsia.datastandards.ecds.PsychiatricEpisodeStructure.EpisodeCharacteristics addNewEpisodeCharacteristics()
    {
        synchronized (monitor())
        {
            check_orphaned();
            uk.nhs.nhsia.datastandards.ecds.PsychiatricEpisodeStructure.EpisodeCharacteristics target = null;
            target = (uk.nhs.nhsia.datastandards.ecds.PsychiatricEpisodeStructure.EpisodeCharacteristics)get_store().add_element_user(EPISODECHARACTERISTICS$0);
            return target;
        }
    }
    
    /**
     * Gets the "ServiceAgreementDetails" element
     */
    public uk.nhs.nhsia.datastandards.ecds.ServiceAgreementDetailsStructure getServiceAgreementDetails()
    {
        synchronized (monitor())
        {
            check_orphaned();
            uk.nhs.nhsia.datastandards.ecds.ServiceAgreementDetailsStructure target = null;
            target = (uk.nhs.nhsia.datastandards.ecds.ServiceAgreementDetailsStructure)get_store().find_element_user(SERVICEAGREEMENTDETAILS$2, 0);
            if (target == null)
            {
                return null;
            }
            return target;
        }
    }
    
    /**
     * Sets the "ServiceAgreementDetails" element
     */
    public void setServiceAgreementDetails(uk.nhs.nhsia.datastandards.ecds.ServiceAgreementDetailsStructure serviceAgreementDetails)
    {
        generatedSetterHelperImpl(serviceAgreementDetails, SERVICEAGREEMENTDETAILS$2, 0, org.apache.xmlbeans.impl.values.XmlObjectBase.KIND_SETTERHELPER_SINGLETON);
    }
    
    /**
     * Appends and returns a new empty "ServiceAgreementDetails" element
     */
    public uk.nhs.nhsia.datastandards.ecds.ServiceAgreementDetailsStructure addNewServiceAgreementDetails()
    {
        synchronized (monitor())
        {
            check_orphaned();
            uk.nhs.nhsia.datastandards.ecds.ServiceAgreementDetailsStructure target = null;
            target = (uk.nhs.nhsia.datastandards.ecds.ServiceAgreementDetailsStructure)get_store().add_element_user(SERVICEAGREEMENTDETAILS$2);
            return target;
        }
    }
    
    /**
     * Gets the "PersonGroup_Consultant" element
     */
    public uk.nhs.nhsia.datastandards.ecds.PersonGroupConsultantStructure getPersonGroupConsultant()
    {
        synchronized (monitor())
        {
            check_orphaned();
            uk.nhs.nhsia.datastandards.ecds.PersonGroupConsultantStructure target = null;
            target = (uk.nhs.nhsia.datastandards.ecds.PersonGroupConsultantStructure)get_store().find_element_user(PERSONGROUPCONSULTANT$4, 0);
            if (target == null)
            {
                return null;
            }
            return target;
        }
    }
    
    /**
     * True if has "PersonGroup_Consultant" element
     */
    public boolean isSetPersonGroupConsultant()
    {
        synchronized (monitor())
        {
            check_orphaned();
            return get_store().count_elements(PERSONGROUPCONSULTANT$4) != 0;
        }
    }
    
    /**
     * Sets the "PersonGroup_Consultant" element
     */
    public void setPersonGroupConsultant(uk.nhs.nhsia.datastandards.ecds.PersonGroupConsultantStructure personGroupConsultant)
    {
        generatedSetterHelperImpl(personGroupConsultant, PERSONGROUPCONSULTANT$4, 0, org.apache.xmlbeans.impl.values.XmlObjectBase.KIND_SETTERHELPER_SINGLETON);
    }
    
    /**
     * Appends and returns a new empty "PersonGroup_Consultant" element
     */
    public uk.nhs.nhsia.datastandards.ecds.PersonGroupConsultantStructure addNewPersonGroupConsultant()
    {
        synchronized (monitor())
        {
            check_orphaned();
            uk.nhs.nhsia.datastandards.ecds.PersonGroupConsultantStructure target = null;
            target = (uk.nhs.nhsia.datastandards.ecds.PersonGroupConsultantStructure)get_store().add_element_user(PERSONGROUPCONSULTANT$4);
            return target;
        }
    }
    
    /**
     * Unsets the "PersonGroup_Consultant" element
     */
    public void unsetPersonGroupConsultant()
    {
        synchronized (monitor())
        {
            check_orphaned();
            get_store().remove_element(PERSONGROUPCONSULTANT$4, 0);
        }
    }
    
    /**
     * Gets the "ClinicalDiagnosisDetails" element
     */
    public uk.nhs.nhsia.datastandards.ecds.ClinicalDiagnosisStructure getClinicalDiagnosisDetails()
    {
        synchronized (monitor())
        {
            check_orphaned();
            uk.nhs.nhsia.datastandards.ecds.ClinicalDiagnosisStructure target = null;
            target = (uk.nhs.nhsia.datastandards.ecds.ClinicalDiagnosisStructure)get_store().find_element_user(CLINICALDIAGNOSISDETAILS$6, 0);
            if (target == null)
            {
                return null;
            }
            return target;
        }
    }
    
    /**
     * True if has "ClinicalDiagnosisDetails" element
     */
    public boolean isSetClinicalDiagnosisDetails()
    {
        synchronized (monitor())
        {
            check_orphaned();
            return get_store().count_elements(CLINICALDIAGNOSISDETAILS$6) != 0;
        }
    }
    
    /**
     * Sets the "ClinicalDiagnosisDetails" element
     */
    public void setClinicalDiagnosisDetails(uk.nhs.nhsia.datastandards.ecds.ClinicalDiagnosisStructure clinicalDiagnosisDetails)
    {
        generatedSetterHelperImpl(clinicalDiagnosisDetails, CLINICALDIAGNOSISDETAILS$6, 0, org.apache.xmlbeans.impl.values.XmlObjectBase.KIND_SETTERHELPER_SINGLETON);
    }
    
    /**
     * Appends and returns a new empty "ClinicalDiagnosisDetails" element
     */
    public uk.nhs.nhsia.datastandards.ecds.ClinicalDiagnosisStructure addNewClinicalDiagnosisDetails()
    {
        synchronized (monitor())
        {
            check_orphaned();
            uk.nhs.nhsia.datastandards.ecds.ClinicalDiagnosisStructure target = null;
            target = (uk.nhs.nhsia.datastandards.ecds.ClinicalDiagnosisStructure)get_store().add_element_user(CLINICALDIAGNOSISDETAILS$6);
            return target;
        }
    }
    
    /**
     * Unsets the "ClinicalDiagnosisDetails" element
     */
    public void unsetClinicalDiagnosisDetails()
    {
        synchronized (monitor())
        {
            check_orphaned();
            get_store().remove_element(CLINICALDIAGNOSISDETAILS$6, 0);
        }
    }
    
    /**
     * Gets the "LocationGroup" element
     */
    public uk.nhs.nhsia.datastandards.ecds.PsychiatricEpisodeStructure.LocationGroup getLocationGroup()
    {
        synchronized (monitor())
        {
            check_orphaned();
            uk.nhs.nhsia.datastandards.ecds.PsychiatricEpisodeStructure.LocationGroup target = null;
            target = (uk.nhs.nhsia.datastandards.ecds.PsychiatricEpisodeStructure.LocationGroup)get_store().find_element_user(LOCATIONGROUP$8, 0);
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
            return get_store().count_elements(LOCATIONGROUP$8) != 0;
        }
    }
    
    /**
     * Sets the "LocationGroup" element
     */
    public void setLocationGroup(uk.nhs.nhsia.datastandards.ecds.PsychiatricEpisodeStructure.LocationGroup locationGroup)
    {
        generatedSetterHelperImpl(locationGroup, LOCATIONGROUP$8, 0, org.apache.xmlbeans.impl.values.XmlObjectBase.KIND_SETTERHELPER_SINGLETON);
    }
    
    /**
     * Appends and returns a new empty "LocationGroup" element
     */
    public uk.nhs.nhsia.datastandards.ecds.PsychiatricEpisodeStructure.LocationGroup addNewLocationGroup()
    {
        synchronized (monitor())
        {
            check_orphaned();
            uk.nhs.nhsia.datastandards.ecds.PsychiatricEpisodeStructure.LocationGroup target = null;
            target = (uk.nhs.nhsia.datastandards.ecds.PsychiatricEpisodeStructure.LocationGroup)get_store().add_element_user(LOCATIONGROUP$8);
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
            get_store().remove_element(LOCATIONGROUP$8, 0);
        }
    }
    /**
     * An XML EpisodeCharacteristics(@http://www.nhsia.nhs.uk/DataStandards/XMLschema/CDS/ns).
     *
     * This is a complex type.
     */
    public static class EpisodeCharacteristicsImpl extends org.apache.xmlbeans.impl.values.XmlComplexContentImpl implements uk.nhs.nhsia.datastandards.ecds.PsychiatricEpisodeStructure.EpisodeCharacteristics
    {
        private static final long serialVersionUID = 1L;
        
        public EpisodeCharacteristicsImpl(org.apache.xmlbeans.SchemaType sType)
        {
            super(sType);
        }
        
        private static final javax.xml.namespace.QName EPISODENUMBER$0 = 
            new javax.xml.namespace.QName("http://www.nhsia.nhs.uk/DataStandards/XMLschema/CDS/ns", "EpisodeNumber");
        private static final javax.xml.namespace.QName PSYCHIATRICPATIENTSTATUSCODE$2 = 
            new javax.xml.namespace.QName("http://www.nhsia.nhs.uk/DataStandards/XMLschema/CDS/ns", "PsychiatricPatientStatusCode");
        private static final javax.xml.namespace.QName STARTDATEEPISODE$4 = 
            new javax.xml.namespace.QName("http://www.nhsia.nhs.uk/DataStandards/XMLschema/CDS/ns", "StartDate_Episode");
        private static final javax.xml.namespace.QName STARTTIMEEPISODE$6 = 
            new javax.xml.namespace.QName("http://www.nhsia.nhs.uk/DataStandards/XMLschema/CDS/ns", "StartTime_Episode");
        private static final javax.xml.namespace.QName DETAINEDANDORLONGTERMPSYCHIATRICCENSUSDATE$8 = 
            new javax.xml.namespace.QName("http://www.nhsia.nhs.uk/DataStandards/XMLschema/CDS/ns", "DetainedAndOrLongTermPsychiatricCensusDate");
        private static final javax.xml.namespace.QName OVERSEASVISITORSTATUS$10 = 
            new javax.xml.namespace.QName("http://www.nhsia.nhs.uk/DataStandards/XMLschema/CDS/ns", "OverseasVisitorStatus");
        
        
        /**
         * Gets the "EpisodeNumber" element
         */
        public int getEpisodeNumber()
        {
            synchronized (monitor())
            {
                check_orphaned();
                org.apache.xmlbeans.SimpleValue target = null;
                target = (org.apache.xmlbeans.SimpleValue)get_store().find_element_user(EPISODENUMBER$0, 0);
                if (target == null)
                {
                    return 0;
                }
                return target.getIntValue();
            }
        }
        
        /**
         * Gets (as xml) the "EpisodeNumber" element
         */
        public uk.nhs.nhsia.datastandards.ecds.EpisodeNumberType xgetEpisodeNumber()
        {
            synchronized (monitor())
            {
                check_orphaned();
                uk.nhs.nhsia.datastandards.ecds.EpisodeNumberType target = null;
                target = (uk.nhs.nhsia.datastandards.ecds.EpisodeNumberType)get_store().find_element_user(EPISODENUMBER$0, 0);
                return target;
            }
        }
        
        /**
         * True if has "EpisodeNumber" element
         */
        public boolean isSetEpisodeNumber()
        {
            synchronized (monitor())
            {
                check_orphaned();
                return get_store().count_elements(EPISODENUMBER$0) != 0;
            }
        }
        
        /**
         * Sets the "EpisodeNumber" element
         */
        public void setEpisodeNumber(int episodeNumber)
        {
            synchronized (monitor())
            {
                check_orphaned();
                org.apache.xmlbeans.SimpleValue target = null;
                target = (org.apache.xmlbeans.SimpleValue)get_store().find_element_user(EPISODENUMBER$0, 0);
                if (target == null)
                {
                    target = (org.apache.xmlbeans.SimpleValue)get_store().add_element_user(EPISODENUMBER$0);
                }
                target.setIntValue(episodeNumber);
            }
        }
        
        /**
         * Sets (as xml) the "EpisodeNumber" element
         */
        public void xsetEpisodeNumber(uk.nhs.nhsia.datastandards.ecds.EpisodeNumberType episodeNumber)
        {
            synchronized (monitor())
            {
                check_orphaned();
                uk.nhs.nhsia.datastandards.ecds.EpisodeNumberType target = null;
                target = (uk.nhs.nhsia.datastandards.ecds.EpisodeNumberType)get_store().find_element_user(EPISODENUMBER$0, 0);
                if (target == null)
                {
                    target = (uk.nhs.nhsia.datastandards.ecds.EpisodeNumberType)get_store().add_element_user(EPISODENUMBER$0);
                }
                target.set(episodeNumber);
            }
        }
        
        /**
         * Unsets the "EpisodeNumber" element
         */
        public void unsetEpisodeNumber()
        {
            synchronized (monitor())
            {
                check_orphaned();
                get_store().remove_element(EPISODENUMBER$0, 0);
            }
        }
        
        /**
         * Gets the "PsychiatricPatientStatusCode" element
         */
        public uk.nhs.nhsia.datastandards.ecds.PsychiatricPatientStatusCodeType.Enum getPsychiatricPatientStatusCode()
        {
            synchronized (monitor())
            {
                check_orphaned();
                org.apache.xmlbeans.SimpleValue target = null;
                target = (org.apache.xmlbeans.SimpleValue)get_store().find_element_user(PSYCHIATRICPATIENTSTATUSCODE$2, 0);
                if (target == null)
                {
                    return null;
                }
                return (uk.nhs.nhsia.datastandards.ecds.PsychiatricPatientStatusCodeType.Enum)target.getEnumValue();
            }
        }
        
        /**
         * Gets (as xml) the "PsychiatricPatientStatusCode" element
         */
        public uk.nhs.nhsia.datastandards.ecds.PsychiatricPatientStatusCodeType xgetPsychiatricPatientStatusCode()
        {
            synchronized (monitor())
            {
                check_orphaned();
                uk.nhs.nhsia.datastandards.ecds.PsychiatricPatientStatusCodeType target = null;
                target = (uk.nhs.nhsia.datastandards.ecds.PsychiatricPatientStatusCodeType)get_store().find_element_user(PSYCHIATRICPATIENTSTATUSCODE$2, 0);
                return target;
            }
        }
        
        /**
         * True if has "PsychiatricPatientStatusCode" element
         */
        public boolean isSetPsychiatricPatientStatusCode()
        {
            synchronized (monitor())
            {
                check_orphaned();
                return get_store().count_elements(PSYCHIATRICPATIENTSTATUSCODE$2) != 0;
            }
        }
        
        /**
         * Sets the "PsychiatricPatientStatusCode" element
         */
        public void setPsychiatricPatientStatusCode(uk.nhs.nhsia.datastandards.ecds.PsychiatricPatientStatusCodeType.Enum psychiatricPatientStatusCode)
        {
            synchronized (monitor())
            {
                check_orphaned();
                org.apache.xmlbeans.SimpleValue target = null;
                target = (org.apache.xmlbeans.SimpleValue)get_store().find_element_user(PSYCHIATRICPATIENTSTATUSCODE$2, 0);
                if (target == null)
                {
                    target = (org.apache.xmlbeans.SimpleValue)get_store().add_element_user(PSYCHIATRICPATIENTSTATUSCODE$2);
                }
                target.setEnumValue(psychiatricPatientStatusCode);
            }
        }
        
        /**
         * Sets (as xml) the "PsychiatricPatientStatusCode" element
         */
        public void xsetPsychiatricPatientStatusCode(uk.nhs.nhsia.datastandards.ecds.PsychiatricPatientStatusCodeType psychiatricPatientStatusCode)
        {
            synchronized (monitor())
            {
                check_orphaned();
                uk.nhs.nhsia.datastandards.ecds.PsychiatricPatientStatusCodeType target = null;
                target = (uk.nhs.nhsia.datastandards.ecds.PsychiatricPatientStatusCodeType)get_store().find_element_user(PSYCHIATRICPATIENTSTATUSCODE$2, 0);
                if (target == null)
                {
                    target = (uk.nhs.nhsia.datastandards.ecds.PsychiatricPatientStatusCodeType)get_store().add_element_user(PSYCHIATRICPATIENTSTATUSCODE$2);
                }
                target.set(psychiatricPatientStatusCode);
            }
        }
        
        /**
         * Unsets the "PsychiatricPatientStatusCode" element
         */
        public void unsetPsychiatricPatientStatusCode()
        {
            synchronized (monitor())
            {
                check_orphaned();
                get_store().remove_element(PSYCHIATRICPATIENTSTATUSCODE$2, 0);
            }
        }
        
        /**
         * Gets the "StartDate_Episode" element
         */
        public java.util.Calendar getStartDateEpisode()
        {
            synchronized (monitor())
            {
                check_orphaned();
                org.apache.xmlbeans.SimpleValue target = null;
                target = (org.apache.xmlbeans.SimpleValue)get_store().find_element_user(STARTDATEEPISODE$4, 0);
                if (target == null)
                {
                    return null;
                }
                return target.getCalendarValue();
            }
        }
        
        /**
         * Gets (as xml) the "StartDate_Episode" element
         */
        public uk.nhs.nhsia.datastandards.ecds.StartDateEpisodeType xgetStartDateEpisode()
        {
            synchronized (monitor())
            {
                check_orphaned();
                uk.nhs.nhsia.datastandards.ecds.StartDateEpisodeType target = null;
                target = (uk.nhs.nhsia.datastandards.ecds.StartDateEpisodeType)get_store().find_element_user(STARTDATEEPISODE$4, 0);
                return target;
            }
        }
        
        /**
         * Sets the "StartDate_Episode" element
         */
        public void setStartDateEpisode(java.util.Calendar startDateEpisode)
        {
            synchronized (monitor())
            {
                check_orphaned();
                org.apache.xmlbeans.SimpleValue target = null;
                target = (org.apache.xmlbeans.SimpleValue)get_store().find_element_user(STARTDATEEPISODE$4, 0);
                if (target == null)
                {
                    target = (org.apache.xmlbeans.SimpleValue)get_store().add_element_user(STARTDATEEPISODE$4);
                }
                target.setCalendarValue(startDateEpisode);
            }
        }
        
        /**
         * Sets (as xml) the "StartDate_Episode" element
         */
        public void xsetStartDateEpisode(uk.nhs.nhsia.datastandards.ecds.StartDateEpisodeType startDateEpisode)
        {
            synchronized (monitor())
            {
                check_orphaned();
                uk.nhs.nhsia.datastandards.ecds.StartDateEpisodeType target = null;
                target = (uk.nhs.nhsia.datastandards.ecds.StartDateEpisodeType)get_store().find_element_user(STARTDATEEPISODE$4, 0);
                if (target == null)
                {
                    target = (uk.nhs.nhsia.datastandards.ecds.StartDateEpisodeType)get_store().add_element_user(STARTDATEEPISODE$4);
                }
                target.set(startDateEpisode);
            }
        }
        
        /**
         * Gets the "StartTime_Episode" element
         */
        public java.util.Calendar getStartTimeEpisode()
        {
            synchronized (monitor())
            {
                check_orphaned();
                org.apache.xmlbeans.SimpleValue target = null;
                target = (org.apache.xmlbeans.SimpleValue)get_store().find_element_user(STARTTIMEEPISODE$6, 0);
                if (target == null)
                {
                    return null;
                }
                return target.getCalendarValue();
            }
        }
        
        /**
         * Gets (as xml) the "StartTime_Episode" element
         */
        public uk.nhs.nhsia.datastandards.ecds.StartTimeEpisodeType xgetStartTimeEpisode()
        {
            synchronized (monitor())
            {
                check_orphaned();
                uk.nhs.nhsia.datastandards.ecds.StartTimeEpisodeType target = null;
                target = (uk.nhs.nhsia.datastandards.ecds.StartTimeEpisodeType)get_store().find_element_user(STARTTIMEEPISODE$6, 0);
                return target;
            }
        }
        
        /**
         * True if has "StartTime_Episode" element
         */
        public boolean isSetStartTimeEpisode()
        {
            synchronized (monitor())
            {
                check_orphaned();
                return get_store().count_elements(STARTTIMEEPISODE$6) != 0;
            }
        }
        
        /**
         * Sets the "StartTime_Episode" element
         */
        public void setStartTimeEpisode(java.util.Calendar startTimeEpisode)
        {
            synchronized (monitor())
            {
                check_orphaned();
                org.apache.xmlbeans.SimpleValue target = null;
                target = (org.apache.xmlbeans.SimpleValue)get_store().find_element_user(STARTTIMEEPISODE$6, 0);
                if (target == null)
                {
                    target = (org.apache.xmlbeans.SimpleValue)get_store().add_element_user(STARTTIMEEPISODE$6);
                }
                target.setCalendarValue(startTimeEpisode);
            }
        }
        
        /**
         * Sets (as xml) the "StartTime_Episode" element
         */
        public void xsetStartTimeEpisode(uk.nhs.nhsia.datastandards.ecds.StartTimeEpisodeType startTimeEpisode)
        {
            synchronized (monitor())
            {
                check_orphaned();
                uk.nhs.nhsia.datastandards.ecds.StartTimeEpisodeType target = null;
                target = (uk.nhs.nhsia.datastandards.ecds.StartTimeEpisodeType)get_store().find_element_user(STARTTIMEEPISODE$6, 0);
                if (target == null)
                {
                    target = (uk.nhs.nhsia.datastandards.ecds.StartTimeEpisodeType)get_store().add_element_user(STARTTIMEEPISODE$6);
                }
                target.set(startTimeEpisode);
            }
        }
        
        /**
         * Unsets the "StartTime_Episode" element
         */
        public void unsetStartTimeEpisode()
        {
            synchronized (monitor())
            {
                check_orphaned();
                get_store().remove_element(STARTTIMEEPISODE$6, 0);
            }
        }
        
        /**
         * Gets the "DetainedAndOrLongTermPsychiatricCensusDate" element
         */
        public java.util.Calendar getDetainedAndOrLongTermPsychiatricCensusDate()
        {
            synchronized (monitor())
            {
                check_orphaned();
                org.apache.xmlbeans.SimpleValue target = null;
                target = (org.apache.xmlbeans.SimpleValue)get_store().find_element_user(DETAINEDANDORLONGTERMPSYCHIATRICCENSUSDATE$8, 0);
                if (target == null)
                {
                    return null;
                }
                return target.getCalendarValue();
            }
        }
        
        /**
         * Gets (as xml) the "DetainedAndOrLongTermPsychiatricCensusDate" element
         */
        public uk.nhs.nhsia.datastandards.ecds.DetainedAndOrLongTermPsychiatricCensusDateType xgetDetainedAndOrLongTermPsychiatricCensusDate()
        {
            synchronized (monitor())
            {
                check_orphaned();
                uk.nhs.nhsia.datastandards.ecds.DetainedAndOrLongTermPsychiatricCensusDateType target = null;
                target = (uk.nhs.nhsia.datastandards.ecds.DetainedAndOrLongTermPsychiatricCensusDateType)get_store().find_element_user(DETAINEDANDORLONGTERMPSYCHIATRICCENSUSDATE$8, 0);
                return target;
            }
        }
        
        /**
         * Sets the "DetainedAndOrLongTermPsychiatricCensusDate" element
         */
        public void setDetainedAndOrLongTermPsychiatricCensusDate(java.util.Calendar detainedAndOrLongTermPsychiatricCensusDate)
        {
            synchronized (monitor())
            {
                check_orphaned();
                org.apache.xmlbeans.SimpleValue target = null;
                target = (org.apache.xmlbeans.SimpleValue)get_store().find_element_user(DETAINEDANDORLONGTERMPSYCHIATRICCENSUSDATE$8, 0);
                if (target == null)
                {
                    target = (org.apache.xmlbeans.SimpleValue)get_store().add_element_user(DETAINEDANDORLONGTERMPSYCHIATRICCENSUSDATE$8);
                }
                target.setCalendarValue(detainedAndOrLongTermPsychiatricCensusDate);
            }
        }
        
        /**
         * Sets (as xml) the "DetainedAndOrLongTermPsychiatricCensusDate" element
         */
        public void xsetDetainedAndOrLongTermPsychiatricCensusDate(uk.nhs.nhsia.datastandards.ecds.DetainedAndOrLongTermPsychiatricCensusDateType detainedAndOrLongTermPsychiatricCensusDate)
        {
            synchronized (monitor())
            {
                check_orphaned();
                uk.nhs.nhsia.datastandards.ecds.DetainedAndOrLongTermPsychiatricCensusDateType target = null;
                target = (uk.nhs.nhsia.datastandards.ecds.DetainedAndOrLongTermPsychiatricCensusDateType)get_store().find_element_user(DETAINEDANDORLONGTERMPSYCHIATRICCENSUSDATE$8, 0);
                if (target == null)
                {
                    target = (uk.nhs.nhsia.datastandards.ecds.DetainedAndOrLongTermPsychiatricCensusDateType)get_store().add_element_user(DETAINEDANDORLONGTERMPSYCHIATRICCENSUSDATE$8);
                }
                target.set(detainedAndOrLongTermPsychiatricCensusDate);
            }
        }
        
        /**
         * Gets array of all "OverseasVisitorStatus" elements
         */
        public uk.nhs.nhsia.datastandards.ecds.OverseasVisitorStatusStructure[] getOverseasVisitorStatusArray()
        {
            synchronized (monitor())
            {
                check_orphaned();
                java.util.List targetList = new java.util.ArrayList();
                get_store().find_all_element_users(OVERSEASVISITORSTATUS$10, targetList);
                uk.nhs.nhsia.datastandards.ecds.OverseasVisitorStatusStructure[] result = new uk.nhs.nhsia.datastandards.ecds.OverseasVisitorStatusStructure[targetList.size()];
                targetList.toArray(result);
                return result;
            }
        }
        
        /**
         * Gets ith "OverseasVisitorStatus" element
         */
        public uk.nhs.nhsia.datastandards.ecds.OverseasVisitorStatusStructure getOverseasVisitorStatusArray(int i)
        {
            synchronized (monitor())
            {
                check_orphaned();
                uk.nhs.nhsia.datastandards.ecds.OverseasVisitorStatusStructure target = null;
                target = (uk.nhs.nhsia.datastandards.ecds.OverseasVisitorStatusStructure)get_store().find_element_user(OVERSEASVISITORSTATUS$10, i);
                if (target == null)
                {
                    throw new IndexOutOfBoundsException();
                }
                return target;
            }
        }
        
        /**
         * Returns number of "OverseasVisitorStatus" element
         */
        public int sizeOfOverseasVisitorStatusArray()
        {
            synchronized (monitor())
            {
                check_orphaned();
                return get_store().count_elements(OVERSEASVISITORSTATUS$10);
            }
        }
        
        /**
         * Sets array of all "OverseasVisitorStatus" element  WARNING: This method is not atomicaly synchronized.
         */
        public void setOverseasVisitorStatusArray(uk.nhs.nhsia.datastandards.ecds.OverseasVisitorStatusStructure[] overseasVisitorStatusArray)
        {
            check_orphaned();
            arraySetterHelper(overseasVisitorStatusArray, OVERSEASVISITORSTATUS$10);
        }
        
        /**
         * Sets ith "OverseasVisitorStatus" element
         */
        public void setOverseasVisitorStatusArray(int i, uk.nhs.nhsia.datastandards.ecds.OverseasVisitorStatusStructure overseasVisitorStatus)
        {
            generatedSetterHelperImpl(overseasVisitorStatus, OVERSEASVISITORSTATUS$10, i, org.apache.xmlbeans.impl.values.XmlObjectBase.KIND_SETTERHELPER_ARRAYITEM);
        }
        
        /**
         * Inserts and returns a new empty value (as xml) as the ith "OverseasVisitorStatus" element
         */
        public uk.nhs.nhsia.datastandards.ecds.OverseasVisitorStatusStructure insertNewOverseasVisitorStatus(int i)
        {
            synchronized (monitor())
            {
                check_orphaned();
                uk.nhs.nhsia.datastandards.ecds.OverseasVisitorStatusStructure target = null;
                target = (uk.nhs.nhsia.datastandards.ecds.OverseasVisitorStatusStructure)get_store().insert_element_user(OVERSEASVISITORSTATUS$10, i);
                return target;
            }
        }
        
        /**
         * Appends and returns a new empty value (as xml) as the last "OverseasVisitorStatus" element
         */
        public uk.nhs.nhsia.datastandards.ecds.OverseasVisitorStatusStructure addNewOverseasVisitorStatus()
        {
            synchronized (monitor())
            {
                check_orphaned();
                uk.nhs.nhsia.datastandards.ecds.OverseasVisitorStatusStructure target = null;
                target = (uk.nhs.nhsia.datastandards.ecds.OverseasVisitorStatusStructure)get_store().add_element_user(OVERSEASVISITORSTATUS$10);
                return target;
            }
        }
        
        /**
         * Removes the ith "OverseasVisitorStatus" element
         */
        public void removeOverseasVisitorStatus(int i)
        {
            synchronized (monitor())
            {
                check_orphaned();
                get_store().remove_element(OVERSEASVISITORSTATUS$10, i);
            }
        }
    }
    /**
     * An XML LocationGroup(@http://www.nhsia.nhs.uk/DataStandards/XMLschema/CDS/ns).
     *
     * This is a complex type.
     */
    public static class LocationGroupImpl extends org.apache.xmlbeans.impl.values.XmlComplexContentImpl implements uk.nhs.nhsia.datastandards.ecds.PsychiatricEpisodeStructure.LocationGroup
    {
        private static final long serialVersionUID = 1L;
        
        public LocationGroupImpl(org.apache.xmlbeans.SchemaType sType)
        {
            super(sType);
        }
        
        private static final javax.xml.namespace.QName STARTOFEPISODE$0 = 
            new javax.xml.namespace.QName("http://www.nhsia.nhs.uk/DataStandards/XMLschema/CDS/ns", "StartOfEpisode");
        private static final javax.xml.namespace.QName WARDSTAYATPSYCHIATRICCENSUSDATE$2 = 
            new javax.xml.namespace.QName("http://www.nhsia.nhs.uk/DataStandards/XMLschema/CDS/ns", "WardStayAtPsychiatricCensusDate");
        
        
        /**
         * Gets the "StartOfEpisode" element
         */
        public uk.nhs.nhsia.datastandards.ecds.PsychiatricEpisodeStructure.LocationGroup.StartOfEpisode getStartOfEpisode()
        {
            synchronized (monitor())
            {
                check_orphaned();
                uk.nhs.nhsia.datastandards.ecds.PsychiatricEpisodeStructure.LocationGroup.StartOfEpisode target = null;
                target = (uk.nhs.nhsia.datastandards.ecds.PsychiatricEpisodeStructure.LocationGroup.StartOfEpisode)get_store().find_element_user(STARTOFEPISODE$0, 0);
                if (target == null)
                {
                    return null;
                }
                return target;
            }
        }
        
        /**
         * True if has "StartOfEpisode" element
         */
        public boolean isSetStartOfEpisode()
        {
            synchronized (monitor())
            {
                check_orphaned();
                return get_store().count_elements(STARTOFEPISODE$0) != 0;
            }
        }
        
        /**
         * Sets the "StartOfEpisode" element
         */
        public void setStartOfEpisode(uk.nhs.nhsia.datastandards.ecds.PsychiatricEpisodeStructure.LocationGroup.StartOfEpisode startOfEpisode)
        {
            generatedSetterHelperImpl(startOfEpisode, STARTOFEPISODE$0, 0, org.apache.xmlbeans.impl.values.XmlObjectBase.KIND_SETTERHELPER_SINGLETON);
        }
        
        /**
         * Appends and returns a new empty "StartOfEpisode" element
         */
        public uk.nhs.nhsia.datastandards.ecds.PsychiatricEpisodeStructure.LocationGroup.StartOfEpisode addNewStartOfEpisode()
        {
            synchronized (monitor())
            {
                check_orphaned();
                uk.nhs.nhsia.datastandards.ecds.PsychiatricEpisodeStructure.LocationGroup.StartOfEpisode target = null;
                target = (uk.nhs.nhsia.datastandards.ecds.PsychiatricEpisodeStructure.LocationGroup.StartOfEpisode)get_store().add_element_user(STARTOFEPISODE$0);
                return target;
            }
        }
        
        /**
         * Unsets the "StartOfEpisode" element
         */
        public void unsetStartOfEpisode()
        {
            synchronized (monitor())
            {
                check_orphaned();
                get_store().remove_element(STARTOFEPISODE$0, 0);
            }
        }
        
        /**
         * Gets the "WardStayAtPsychiatricCensusDate" element
         */
        public uk.nhs.nhsia.datastandards.ecds.PsychiatricEpisodeStructure.LocationGroup.WardStayAtPsychiatricCensusDate getWardStayAtPsychiatricCensusDate()
        {
            synchronized (monitor())
            {
                check_orphaned();
                uk.nhs.nhsia.datastandards.ecds.PsychiatricEpisodeStructure.LocationGroup.WardStayAtPsychiatricCensusDate target = null;
                target = (uk.nhs.nhsia.datastandards.ecds.PsychiatricEpisodeStructure.LocationGroup.WardStayAtPsychiatricCensusDate)get_store().find_element_user(WARDSTAYATPSYCHIATRICCENSUSDATE$2, 0);
                if (target == null)
                {
                    return null;
                }
                return target;
            }
        }
        
        /**
         * True if has "WardStayAtPsychiatricCensusDate" element
         */
        public boolean isSetWardStayAtPsychiatricCensusDate()
        {
            synchronized (monitor())
            {
                check_orphaned();
                return get_store().count_elements(WARDSTAYATPSYCHIATRICCENSUSDATE$2) != 0;
            }
        }
        
        /**
         * Sets the "WardStayAtPsychiatricCensusDate" element
         */
        public void setWardStayAtPsychiatricCensusDate(uk.nhs.nhsia.datastandards.ecds.PsychiatricEpisodeStructure.LocationGroup.WardStayAtPsychiatricCensusDate wardStayAtPsychiatricCensusDate)
        {
            generatedSetterHelperImpl(wardStayAtPsychiatricCensusDate, WARDSTAYATPSYCHIATRICCENSUSDATE$2, 0, org.apache.xmlbeans.impl.values.XmlObjectBase.KIND_SETTERHELPER_SINGLETON);
        }
        
        /**
         * Appends and returns a new empty "WardStayAtPsychiatricCensusDate" element
         */
        public uk.nhs.nhsia.datastandards.ecds.PsychiatricEpisodeStructure.LocationGroup.WardStayAtPsychiatricCensusDate addNewWardStayAtPsychiatricCensusDate()
        {
            synchronized (monitor())
            {
                check_orphaned();
                uk.nhs.nhsia.datastandards.ecds.PsychiatricEpisodeStructure.LocationGroup.WardStayAtPsychiatricCensusDate target = null;
                target = (uk.nhs.nhsia.datastandards.ecds.PsychiatricEpisodeStructure.LocationGroup.WardStayAtPsychiatricCensusDate)get_store().add_element_user(WARDSTAYATPSYCHIATRICCENSUSDATE$2);
                return target;
            }
        }
        
        /**
         * Unsets the "WardStayAtPsychiatricCensusDate" element
         */
        public void unsetWardStayAtPsychiatricCensusDate()
        {
            synchronized (monitor())
            {
                check_orphaned();
                get_store().remove_element(WARDSTAYATPSYCHIATRICCENSUSDATE$2, 0);
            }
        }
        /**
         * An XML StartOfEpisode(@http://www.nhsia.nhs.uk/DataStandards/XMLschema/CDS/ns).
         *
         * This is a complex type.
         */
        public static class StartOfEpisodeImpl extends org.apache.xmlbeans.impl.values.XmlComplexContentImpl implements uk.nhs.nhsia.datastandards.ecds.PsychiatricEpisodeStructure.LocationGroup.StartOfEpisode
        {
            private static final long serialVersionUID = 1L;
            
            public StartOfEpisodeImpl(org.apache.xmlbeans.SchemaType sType)
            {
                super(sType);
            }
            
            private static final javax.xml.namespace.QName LOCATIONCLASS$0 = 
                new javax.xml.namespace.QName("http://www.nhsia.nhs.uk/DataStandards/XMLschema/CDS/ns", "LocationClass");
            private static final javax.xml.namespace.QName SITECODEOFTREATMENT$2 = 
                new javax.xml.namespace.QName("http://www.nhsia.nhs.uk/DataStandards/XMLschema/CDS/ns", "SiteCodeOfTreatment");
            private static final javax.xml.namespace.QName ACTIVITYLOCATIONTYPE$4 = 
                new javax.xml.namespace.QName("http://www.nhsia.nhs.uk/DataStandards/XMLschema/CDS/ns", "ActivityLocationType");
            private static final javax.xml.namespace.QName INTENDEDCLINICALCAREINTENSITYCODE$6 = 
                new javax.xml.namespace.QName("http://www.nhsia.nhs.uk/DataStandards/XMLschema/CDS/ns", "IntendedClinicalCareIntensityCode");
            private static final javax.xml.namespace.QName INTENDEDAGEGROUP$8 = 
                new javax.xml.namespace.QName("http://www.nhsia.nhs.uk/DataStandards/XMLschema/CDS/ns", "IntendedAgeGroup");
            private static final javax.xml.namespace.QName SEXOFPATIENTSCODE$10 = 
                new javax.xml.namespace.QName("http://www.nhsia.nhs.uk/DataStandards/XMLschema/CDS/ns", "SexOfPatientsCode");
            private static final javax.xml.namespace.QName WARDDAYPERIODAVAILABILITYCODE$12 = 
                new javax.xml.namespace.QName("http://www.nhsia.nhs.uk/DataStandards/XMLschema/CDS/ns", "WardDayPeriodAvailabilityCode");
            private static final javax.xml.namespace.QName WARDNIGHTPERIODAVAILABILITYCODE$14 = 
                new javax.xml.namespace.QName("http://www.nhsia.nhs.uk/DataStandards/XMLschema/CDS/ns", "WardNightPeriodAvailabilityCode");
            private static final javax.xml.namespace.QName WARDSECURITYLEVEL$16 = 
                new javax.xml.namespace.QName("http://www.nhsia.nhs.uk/DataStandards/XMLschema/CDS/ns", "WardSecurityLevel");
            private static final javax.xml.namespace.QName WARDCODE$18 = 
                new javax.xml.namespace.QName("http://www.nhsia.nhs.uk/DataStandards/XMLschema/CDS/ns", "WardCode");
            
            
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
             * Gets the "SiteCodeOfTreatment" element
             */
            public java.lang.String getSiteCodeOfTreatment()
            {
                synchronized (monitor())
                {
                    check_orphaned();
                    org.apache.xmlbeans.SimpleValue target = null;
                    target = (org.apache.xmlbeans.SimpleValue)get_store().find_element_user(SITECODEOFTREATMENT$2, 0);
                    if (target == null)
                    {
                      return null;
                    }
                    return target.getStringValue();
                }
            }
            
            /**
             * Gets (as xml) the "SiteCodeOfTreatment" element
             */
            public uk.nhs.nhsia.datastandards.ecds.SiteCodeOfTreatmentType xgetSiteCodeOfTreatment()
            {
                synchronized (monitor())
                {
                    check_orphaned();
                    uk.nhs.nhsia.datastandards.ecds.SiteCodeOfTreatmentType target = null;
                    target = (uk.nhs.nhsia.datastandards.ecds.SiteCodeOfTreatmentType)get_store().find_element_user(SITECODEOFTREATMENT$2, 0);
                    return target;
                }
            }
            
            /**
             * True if has "SiteCodeOfTreatment" element
             */
            public boolean isSetSiteCodeOfTreatment()
            {
                synchronized (monitor())
                {
                    check_orphaned();
                    return get_store().count_elements(SITECODEOFTREATMENT$2) != 0;
                }
            }
            
            /**
             * Sets the "SiteCodeOfTreatment" element
             */
            public void setSiteCodeOfTreatment(java.lang.String siteCodeOfTreatment)
            {
                synchronized (monitor())
                {
                    check_orphaned();
                    org.apache.xmlbeans.SimpleValue target = null;
                    target = (org.apache.xmlbeans.SimpleValue)get_store().find_element_user(SITECODEOFTREATMENT$2, 0);
                    if (target == null)
                    {
                      target = (org.apache.xmlbeans.SimpleValue)get_store().add_element_user(SITECODEOFTREATMENT$2);
                    }
                    target.setStringValue(siteCodeOfTreatment);
                }
            }
            
            /**
             * Sets (as xml) the "SiteCodeOfTreatment" element
             */
            public void xsetSiteCodeOfTreatment(uk.nhs.nhsia.datastandards.ecds.SiteCodeOfTreatmentType siteCodeOfTreatment)
            {
                synchronized (monitor())
                {
                    check_orphaned();
                    uk.nhs.nhsia.datastandards.ecds.SiteCodeOfTreatmentType target = null;
                    target = (uk.nhs.nhsia.datastandards.ecds.SiteCodeOfTreatmentType)get_store().find_element_user(SITECODEOFTREATMENT$2, 0);
                    if (target == null)
                    {
                      target = (uk.nhs.nhsia.datastandards.ecds.SiteCodeOfTreatmentType)get_store().add_element_user(SITECODEOFTREATMENT$2);
                    }
                    target.set(siteCodeOfTreatment);
                }
            }
            
            /**
             * Unsets the "SiteCodeOfTreatment" element
             */
            public void unsetSiteCodeOfTreatment()
            {
                synchronized (monitor())
                {
                    check_orphaned();
                    get_store().remove_element(SITECODEOFTREATMENT$2, 0);
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
                    target = (org.apache.xmlbeans.SimpleValue)get_store().find_element_user(ACTIVITYLOCATIONTYPE$4, 0);
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
                    target = (uk.nhs.nhsia.datastandards.ecds.ActivityLocationTypeType)get_store().find_element_user(ACTIVITYLOCATIONTYPE$4, 0);
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
                    return get_store().count_elements(ACTIVITYLOCATIONTYPE$4) != 0;
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
                    target = (org.apache.xmlbeans.SimpleValue)get_store().find_element_user(ACTIVITYLOCATIONTYPE$4, 0);
                    if (target == null)
                    {
                      target = (org.apache.xmlbeans.SimpleValue)get_store().add_element_user(ACTIVITYLOCATIONTYPE$4);
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
                    target = (uk.nhs.nhsia.datastandards.ecds.ActivityLocationTypeType)get_store().find_element_user(ACTIVITYLOCATIONTYPE$4, 0);
                    if (target == null)
                    {
                      target = (uk.nhs.nhsia.datastandards.ecds.ActivityLocationTypeType)get_store().add_element_user(ACTIVITYLOCATIONTYPE$4);
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
                    get_store().remove_element(ACTIVITYLOCATIONTYPE$4, 0);
                }
            }
            
            /**
             * Gets the "IntendedClinicalCareIntensityCode" element
             */
            public uk.nhs.nhsia.datastandards.ecds.IntendedClinicalCareIntensityCodeType.Enum getIntendedClinicalCareIntensityCode()
            {
                synchronized (monitor())
                {
                    check_orphaned();
                    org.apache.xmlbeans.SimpleValue target = null;
                    target = (org.apache.xmlbeans.SimpleValue)get_store().find_element_user(INTENDEDCLINICALCAREINTENSITYCODE$6, 0);
                    if (target == null)
                    {
                      return null;
                    }
                    return (uk.nhs.nhsia.datastandards.ecds.IntendedClinicalCareIntensityCodeType.Enum)target.getEnumValue();
                }
            }
            
            /**
             * Gets (as xml) the "IntendedClinicalCareIntensityCode" element
             */
            public uk.nhs.nhsia.datastandards.ecds.IntendedClinicalCareIntensityCodeType xgetIntendedClinicalCareIntensityCode()
            {
                synchronized (monitor())
                {
                    check_orphaned();
                    uk.nhs.nhsia.datastandards.ecds.IntendedClinicalCareIntensityCodeType target = null;
                    target = (uk.nhs.nhsia.datastandards.ecds.IntendedClinicalCareIntensityCodeType)get_store().find_element_user(INTENDEDCLINICALCAREINTENSITYCODE$6, 0);
                    return target;
                }
            }
            
            /**
             * True if has "IntendedClinicalCareIntensityCode" element
             */
            public boolean isSetIntendedClinicalCareIntensityCode()
            {
                synchronized (monitor())
                {
                    check_orphaned();
                    return get_store().count_elements(INTENDEDCLINICALCAREINTENSITYCODE$6) != 0;
                }
            }
            
            /**
             * Sets the "IntendedClinicalCareIntensityCode" element
             */
            public void setIntendedClinicalCareIntensityCode(uk.nhs.nhsia.datastandards.ecds.IntendedClinicalCareIntensityCodeType.Enum intendedClinicalCareIntensityCode)
            {
                synchronized (monitor())
                {
                    check_orphaned();
                    org.apache.xmlbeans.SimpleValue target = null;
                    target = (org.apache.xmlbeans.SimpleValue)get_store().find_element_user(INTENDEDCLINICALCAREINTENSITYCODE$6, 0);
                    if (target == null)
                    {
                      target = (org.apache.xmlbeans.SimpleValue)get_store().add_element_user(INTENDEDCLINICALCAREINTENSITYCODE$6);
                    }
                    target.setEnumValue(intendedClinicalCareIntensityCode);
                }
            }
            
            /**
             * Sets (as xml) the "IntendedClinicalCareIntensityCode" element
             */
            public void xsetIntendedClinicalCareIntensityCode(uk.nhs.nhsia.datastandards.ecds.IntendedClinicalCareIntensityCodeType intendedClinicalCareIntensityCode)
            {
                synchronized (monitor())
                {
                    check_orphaned();
                    uk.nhs.nhsia.datastandards.ecds.IntendedClinicalCareIntensityCodeType target = null;
                    target = (uk.nhs.nhsia.datastandards.ecds.IntendedClinicalCareIntensityCodeType)get_store().find_element_user(INTENDEDCLINICALCAREINTENSITYCODE$6, 0);
                    if (target == null)
                    {
                      target = (uk.nhs.nhsia.datastandards.ecds.IntendedClinicalCareIntensityCodeType)get_store().add_element_user(INTENDEDCLINICALCAREINTENSITYCODE$6);
                    }
                    target.set(intendedClinicalCareIntensityCode);
                }
            }
            
            /**
             * Unsets the "IntendedClinicalCareIntensityCode" element
             */
            public void unsetIntendedClinicalCareIntensityCode()
            {
                synchronized (monitor())
                {
                    check_orphaned();
                    get_store().remove_element(INTENDEDCLINICALCAREINTENSITYCODE$6, 0);
                }
            }
            
            /**
             * Gets the "IntendedAgeGroup" element
             */
            public uk.nhs.nhsia.datastandards.ecds.IntendedAgeGroupType.Enum getIntendedAgeGroup()
            {
                synchronized (monitor())
                {
                    check_orphaned();
                    org.apache.xmlbeans.SimpleValue target = null;
                    target = (org.apache.xmlbeans.SimpleValue)get_store().find_element_user(INTENDEDAGEGROUP$8, 0);
                    if (target == null)
                    {
                      return null;
                    }
                    return (uk.nhs.nhsia.datastandards.ecds.IntendedAgeGroupType.Enum)target.getEnumValue();
                }
            }
            
            /**
             * Gets (as xml) the "IntendedAgeGroup" element
             */
            public uk.nhs.nhsia.datastandards.ecds.IntendedAgeGroupType xgetIntendedAgeGroup()
            {
                synchronized (monitor())
                {
                    check_orphaned();
                    uk.nhs.nhsia.datastandards.ecds.IntendedAgeGroupType target = null;
                    target = (uk.nhs.nhsia.datastandards.ecds.IntendedAgeGroupType)get_store().find_element_user(INTENDEDAGEGROUP$8, 0);
                    return target;
                }
            }
            
            /**
             * True if has "IntendedAgeGroup" element
             */
            public boolean isSetIntendedAgeGroup()
            {
                synchronized (monitor())
                {
                    check_orphaned();
                    return get_store().count_elements(INTENDEDAGEGROUP$8) != 0;
                }
            }
            
            /**
             * Sets the "IntendedAgeGroup" element
             */
            public void setIntendedAgeGroup(uk.nhs.nhsia.datastandards.ecds.IntendedAgeGroupType.Enum intendedAgeGroup)
            {
                synchronized (monitor())
                {
                    check_orphaned();
                    org.apache.xmlbeans.SimpleValue target = null;
                    target = (org.apache.xmlbeans.SimpleValue)get_store().find_element_user(INTENDEDAGEGROUP$8, 0);
                    if (target == null)
                    {
                      target = (org.apache.xmlbeans.SimpleValue)get_store().add_element_user(INTENDEDAGEGROUP$8);
                    }
                    target.setEnumValue(intendedAgeGroup);
                }
            }
            
            /**
             * Sets (as xml) the "IntendedAgeGroup" element
             */
            public void xsetIntendedAgeGroup(uk.nhs.nhsia.datastandards.ecds.IntendedAgeGroupType intendedAgeGroup)
            {
                synchronized (monitor())
                {
                    check_orphaned();
                    uk.nhs.nhsia.datastandards.ecds.IntendedAgeGroupType target = null;
                    target = (uk.nhs.nhsia.datastandards.ecds.IntendedAgeGroupType)get_store().find_element_user(INTENDEDAGEGROUP$8, 0);
                    if (target == null)
                    {
                      target = (uk.nhs.nhsia.datastandards.ecds.IntendedAgeGroupType)get_store().add_element_user(INTENDEDAGEGROUP$8);
                    }
                    target.set(intendedAgeGroup);
                }
            }
            
            /**
             * Unsets the "IntendedAgeGroup" element
             */
            public void unsetIntendedAgeGroup()
            {
                synchronized (monitor())
                {
                    check_orphaned();
                    get_store().remove_element(INTENDEDAGEGROUP$8, 0);
                }
            }
            
            /**
             * Gets the "SexOfPatientsCode" element
             */
            public uk.nhs.nhsia.datastandards.ecds.SexOfPatientsCodeType.Enum getSexOfPatientsCode()
            {
                synchronized (monitor())
                {
                    check_orphaned();
                    org.apache.xmlbeans.SimpleValue target = null;
                    target = (org.apache.xmlbeans.SimpleValue)get_store().find_element_user(SEXOFPATIENTSCODE$10, 0);
                    if (target == null)
                    {
                      return null;
                    }
                    return (uk.nhs.nhsia.datastandards.ecds.SexOfPatientsCodeType.Enum)target.getEnumValue();
                }
            }
            
            /**
             * Gets (as xml) the "SexOfPatientsCode" element
             */
            public uk.nhs.nhsia.datastandards.ecds.SexOfPatientsCodeType xgetSexOfPatientsCode()
            {
                synchronized (monitor())
                {
                    check_orphaned();
                    uk.nhs.nhsia.datastandards.ecds.SexOfPatientsCodeType target = null;
                    target = (uk.nhs.nhsia.datastandards.ecds.SexOfPatientsCodeType)get_store().find_element_user(SEXOFPATIENTSCODE$10, 0);
                    return target;
                }
            }
            
            /**
             * True if has "SexOfPatientsCode" element
             */
            public boolean isSetSexOfPatientsCode()
            {
                synchronized (monitor())
                {
                    check_orphaned();
                    return get_store().count_elements(SEXOFPATIENTSCODE$10) != 0;
                }
            }
            
            /**
             * Sets the "SexOfPatientsCode" element
             */
            public void setSexOfPatientsCode(uk.nhs.nhsia.datastandards.ecds.SexOfPatientsCodeType.Enum sexOfPatientsCode)
            {
                synchronized (monitor())
                {
                    check_orphaned();
                    org.apache.xmlbeans.SimpleValue target = null;
                    target = (org.apache.xmlbeans.SimpleValue)get_store().find_element_user(SEXOFPATIENTSCODE$10, 0);
                    if (target == null)
                    {
                      target = (org.apache.xmlbeans.SimpleValue)get_store().add_element_user(SEXOFPATIENTSCODE$10);
                    }
                    target.setEnumValue(sexOfPatientsCode);
                }
            }
            
            /**
             * Sets (as xml) the "SexOfPatientsCode" element
             */
            public void xsetSexOfPatientsCode(uk.nhs.nhsia.datastandards.ecds.SexOfPatientsCodeType sexOfPatientsCode)
            {
                synchronized (monitor())
                {
                    check_orphaned();
                    uk.nhs.nhsia.datastandards.ecds.SexOfPatientsCodeType target = null;
                    target = (uk.nhs.nhsia.datastandards.ecds.SexOfPatientsCodeType)get_store().find_element_user(SEXOFPATIENTSCODE$10, 0);
                    if (target == null)
                    {
                      target = (uk.nhs.nhsia.datastandards.ecds.SexOfPatientsCodeType)get_store().add_element_user(SEXOFPATIENTSCODE$10);
                    }
                    target.set(sexOfPatientsCode);
                }
            }
            
            /**
             * Unsets the "SexOfPatientsCode" element
             */
            public void unsetSexOfPatientsCode()
            {
                synchronized (monitor())
                {
                    check_orphaned();
                    get_store().remove_element(SEXOFPATIENTSCODE$10, 0);
                }
            }
            
            /**
             * Gets the "WardDayPeriodAvailabilityCode" element
             */
            public uk.nhs.nhsia.datastandards.ecds.WardDayPeriodAvailabilityCodeType.Enum getWardDayPeriodAvailabilityCode()
            {
                synchronized (monitor())
                {
                    check_orphaned();
                    org.apache.xmlbeans.SimpleValue target = null;
                    target = (org.apache.xmlbeans.SimpleValue)get_store().find_element_user(WARDDAYPERIODAVAILABILITYCODE$12, 0);
                    if (target == null)
                    {
                      return null;
                    }
                    return (uk.nhs.nhsia.datastandards.ecds.WardDayPeriodAvailabilityCodeType.Enum)target.getEnumValue();
                }
            }
            
            /**
             * Gets (as xml) the "WardDayPeriodAvailabilityCode" element
             */
            public uk.nhs.nhsia.datastandards.ecds.WardDayPeriodAvailabilityCodeType xgetWardDayPeriodAvailabilityCode()
            {
                synchronized (monitor())
                {
                    check_orphaned();
                    uk.nhs.nhsia.datastandards.ecds.WardDayPeriodAvailabilityCodeType target = null;
                    target = (uk.nhs.nhsia.datastandards.ecds.WardDayPeriodAvailabilityCodeType)get_store().find_element_user(WARDDAYPERIODAVAILABILITYCODE$12, 0);
                    return target;
                }
            }
            
            /**
             * True if has "WardDayPeriodAvailabilityCode" element
             */
            public boolean isSetWardDayPeriodAvailabilityCode()
            {
                synchronized (monitor())
                {
                    check_orphaned();
                    return get_store().count_elements(WARDDAYPERIODAVAILABILITYCODE$12) != 0;
                }
            }
            
            /**
             * Sets the "WardDayPeriodAvailabilityCode" element
             */
            public void setWardDayPeriodAvailabilityCode(uk.nhs.nhsia.datastandards.ecds.WardDayPeriodAvailabilityCodeType.Enum wardDayPeriodAvailabilityCode)
            {
                synchronized (monitor())
                {
                    check_orphaned();
                    org.apache.xmlbeans.SimpleValue target = null;
                    target = (org.apache.xmlbeans.SimpleValue)get_store().find_element_user(WARDDAYPERIODAVAILABILITYCODE$12, 0);
                    if (target == null)
                    {
                      target = (org.apache.xmlbeans.SimpleValue)get_store().add_element_user(WARDDAYPERIODAVAILABILITYCODE$12);
                    }
                    target.setEnumValue(wardDayPeriodAvailabilityCode);
                }
            }
            
            /**
             * Sets (as xml) the "WardDayPeriodAvailabilityCode" element
             */
            public void xsetWardDayPeriodAvailabilityCode(uk.nhs.nhsia.datastandards.ecds.WardDayPeriodAvailabilityCodeType wardDayPeriodAvailabilityCode)
            {
                synchronized (monitor())
                {
                    check_orphaned();
                    uk.nhs.nhsia.datastandards.ecds.WardDayPeriodAvailabilityCodeType target = null;
                    target = (uk.nhs.nhsia.datastandards.ecds.WardDayPeriodAvailabilityCodeType)get_store().find_element_user(WARDDAYPERIODAVAILABILITYCODE$12, 0);
                    if (target == null)
                    {
                      target = (uk.nhs.nhsia.datastandards.ecds.WardDayPeriodAvailabilityCodeType)get_store().add_element_user(WARDDAYPERIODAVAILABILITYCODE$12);
                    }
                    target.set(wardDayPeriodAvailabilityCode);
                }
            }
            
            /**
             * Unsets the "WardDayPeriodAvailabilityCode" element
             */
            public void unsetWardDayPeriodAvailabilityCode()
            {
                synchronized (monitor())
                {
                    check_orphaned();
                    get_store().remove_element(WARDDAYPERIODAVAILABILITYCODE$12, 0);
                }
            }
            
            /**
             * Gets the "WardNightPeriodAvailabilityCode" element
             */
            public uk.nhs.nhsia.datastandards.ecds.WardNightPeriodAvailabilityCodeType.Enum getWardNightPeriodAvailabilityCode()
            {
                synchronized (monitor())
                {
                    check_orphaned();
                    org.apache.xmlbeans.SimpleValue target = null;
                    target = (org.apache.xmlbeans.SimpleValue)get_store().find_element_user(WARDNIGHTPERIODAVAILABILITYCODE$14, 0);
                    if (target == null)
                    {
                      return null;
                    }
                    return (uk.nhs.nhsia.datastandards.ecds.WardNightPeriodAvailabilityCodeType.Enum)target.getEnumValue();
                }
            }
            
            /**
             * Gets (as xml) the "WardNightPeriodAvailabilityCode" element
             */
            public uk.nhs.nhsia.datastandards.ecds.WardNightPeriodAvailabilityCodeType xgetWardNightPeriodAvailabilityCode()
            {
                synchronized (monitor())
                {
                    check_orphaned();
                    uk.nhs.nhsia.datastandards.ecds.WardNightPeriodAvailabilityCodeType target = null;
                    target = (uk.nhs.nhsia.datastandards.ecds.WardNightPeriodAvailabilityCodeType)get_store().find_element_user(WARDNIGHTPERIODAVAILABILITYCODE$14, 0);
                    return target;
                }
            }
            
            /**
             * True if has "WardNightPeriodAvailabilityCode" element
             */
            public boolean isSetWardNightPeriodAvailabilityCode()
            {
                synchronized (monitor())
                {
                    check_orphaned();
                    return get_store().count_elements(WARDNIGHTPERIODAVAILABILITYCODE$14) != 0;
                }
            }
            
            /**
             * Sets the "WardNightPeriodAvailabilityCode" element
             */
            public void setWardNightPeriodAvailabilityCode(uk.nhs.nhsia.datastandards.ecds.WardNightPeriodAvailabilityCodeType.Enum wardNightPeriodAvailabilityCode)
            {
                synchronized (monitor())
                {
                    check_orphaned();
                    org.apache.xmlbeans.SimpleValue target = null;
                    target = (org.apache.xmlbeans.SimpleValue)get_store().find_element_user(WARDNIGHTPERIODAVAILABILITYCODE$14, 0);
                    if (target == null)
                    {
                      target = (org.apache.xmlbeans.SimpleValue)get_store().add_element_user(WARDNIGHTPERIODAVAILABILITYCODE$14);
                    }
                    target.setEnumValue(wardNightPeriodAvailabilityCode);
                }
            }
            
            /**
             * Sets (as xml) the "WardNightPeriodAvailabilityCode" element
             */
            public void xsetWardNightPeriodAvailabilityCode(uk.nhs.nhsia.datastandards.ecds.WardNightPeriodAvailabilityCodeType wardNightPeriodAvailabilityCode)
            {
                synchronized (monitor())
                {
                    check_orphaned();
                    uk.nhs.nhsia.datastandards.ecds.WardNightPeriodAvailabilityCodeType target = null;
                    target = (uk.nhs.nhsia.datastandards.ecds.WardNightPeriodAvailabilityCodeType)get_store().find_element_user(WARDNIGHTPERIODAVAILABILITYCODE$14, 0);
                    if (target == null)
                    {
                      target = (uk.nhs.nhsia.datastandards.ecds.WardNightPeriodAvailabilityCodeType)get_store().add_element_user(WARDNIGHTPERIODAVAILABILITYCODE$14);
                    }
                    target.set(wardNightPeriodAvailabilityCode);
                }
            }
            
            /**
             * Unsets the "WardNightPeriodAvailabilityCode" element
             */
            public void unsetWardNightPeriodAvailabilityCode()
            {
                synchronized (monitor())
                {
                    check_orphaned();
                    get_store().remove_element(WARDNIGHTPERIODAVAILABILITYCODE$14, 0);
                }
            }
            
            /**
             * Gets the "WardSecurityLevel" element
             */
            public uk.nhs.nhsia.datastandards.ecds.WardSecurityLevelType.Enum getWardSecurityLevel()
            {
                synchronized (monitor())
                {
                    check_orphaned();
                    org.apache.xmlbeans.SimpleValue target = null;
                    target = (org.apache.xmlbeans.SimpleValue)get_store().find_element_user(WARDSECURITYLEVEL$16, 0);
                    if (target == null)
                    {
                      return null;
                    }
                    return (uk.nhs.nhsia.datastandards.ecds.WardSecurityLevelType.Enum)target.getEnumValue();
                }
            }
            
            /**
             * Gets (as xml) the "WardSecurityLevel" element
             */
            public uk.nhs.nhsia.datastandards.ecds.WardSecurityLevelType xgetWardSecurityLevel()
            {
                synchronized (monitor())
                {
                    check_orphaned();
                    uk.nhs.nhsia.datastandards.ecds.WardSecurityLevelType target = null;
                    target = (uk.nhs.nhsia.datastandards.ecds.WardSecurityLevelType)get_store().find_element_user(WARDSECURITYLEVEL$16, 0);
                    return target;
                }
            }
            
            /**
             * True if has "WardSecurityLevel" element
             */
            public boolean isSetWardSecurityLevel()
            {
                synchronized (monitor())
                {
                    check_orphaned();
                    return get_store().count_elements(WARDSECURITYLEVEL$16) != 0;
                }
            }
            
            /**
             * Sets the "WardSecurityLevel" element
             */
            public void setWardSecurityLevel(uk.nhs.nhsia.datastandards.ecds.WardSecurityLevelType.Enum wardSecurityLevel)
            {
                synchronized (monitor())
                {
                    check_orphaned();
                    org.apache.xmlbeans.SimpleValue target = null;
                    target = (org.apache.xmlbeans.SimpleValue)get_store().find_element_user(WARDSECURITYLEVEL$16, 0);
                    if (target == null)
                    {
                      target = (org.apache.xmlbeans.SimpleValue)get_store().add_element_user(WARDSECURITYLEVEL$16);
                    }
                    target.setEnumValue(wardSecurityLevel);
                }
            }
            
            /**
             * Sets (as xml) the "WardSecurityLevel" element
             */
            public void xsetWardSecurityLevel(uk.nhs.nhsia.datastandards.ecds.WardSecurityLevelType wardSecurityLevel)
            {
                synchronized (monitor())
                {
                    check_orphaned();
                    uk.nhs.nhsia.datastandards.ecds.WardSecurityLevelType target = null;
                    target = (uk.nhs.nhsia.datastandards.ecds.WardSecurityLevelType)get_store().find_element_user(WARDSECURITYLEVEL$16, 0);
                    if (target == null)
                    {
                      target = (uk.nhs.nhsia.datastandards.ecds.WardSecurityLevelType)get_store().add_element_user(WARDSECURITYLEVEL$16);
                    }
                    target.set(wardSecurityLevel);
                }
            }
            
            /**
             * Unsets the "WardSecurityLevel" element
             */
            public void unsetWardSecurityLevel()
            {
                synchronized (monitor())
                {
                    check_orphaned();
                    get_store().remove_element(WARDSECURITYLEVEL$16, 0);
                }
            }
            
            /**
             * Gets the "WardCode" element
             */
            public java.lang.String getWardCode()
            {
                synchronized (monitor())
                {
                    check_orphaned();
                    org.apache.xmlbeans.SimpleValue target = null;
                    target = (org.apache.xmlbeans.SimpleValue)get_store().find_element_user(WARDCODE$18, 0);
                    if (target == null)
                    {
                      return null;
                    }
                    return target.getStringValue();
                }
            }
            
            /**
             * Gets (as xml) the "WardCode" element
             */
            public uk.nhs.nhsia.datastandards.ecds.WardCodeType xgetWardCode()
            {
                synchronized (monitor())
                {
                    check_orphaned();
                    uk.nhs.nhsia.datastandards.ecds.WardCodeType target = null;
                    target = (uk.nhs.nhsia.datastandards.ecds.WardCodeType)get_store().find_element_user(WARDCODE$18, 0);
                    return target;
                }
            }
            
            /**
             * True if has "WardCode" element
             */
            public boolean isSetWardCode()
            {
                synchronized (monitor())
                {
                    check_orphaned();
                    return get_store().count_elements(WARDCODE$18) != 0;
                }
            }
            
            /**
             * Sets the "WardCode" element
             */
            public void setWardCode(java.lang.String wardCode)
            {
                synchronized (monitor())
                {
                    check_orphaned();
                    org.apache.xmlbeans.SimpleValue target = null;
                    target = (org.apache.xmlbeans.SimpleValue)get_store().find_element_user(WARDCODE$18, 0);
                    if (target == null)
                    {
                      target = (org.apache.xmlbeans.SimpleValue)get_store().add_element_user(WARDCODE$18);
                    }
                    target.setStringValue(wardCode);
                }
            }
            
            /**
             * Sets (as xml) the "WardCode" element
             */
            public void xsetWardCode(uk.nhs.nhsia.datastandards.ecds.WardCodeType wardCode)
            {
                synchronized (monitor())
                {
                    check_orphaned();
                    uk.nhs.nhsia.datastandards.ecds.WardCodeType target = null;
                    target = (uk.nhs.nhsia.datastandards.ecds.WardCodeType)get_store().find_element_user(WARDCODE$18, 0);
                    if (target == null)
                    {
                      target = (uk.nhs.nhsia.datastandards.ecds.WardCodeType)get_store().add_element_user(WARDCODE$18);
                    }
                    target.set(wardCode);
                }
            }
            
            /**
             * Unsets the "WardCode" element
             */
            public void unsetWardCode()
            {
                synchronized (monitor())
                {
                    check_orphaned();
                    get_store().remove_element(WARDCODE$18, 0);
                }
            }
        }
        /**
         * An XML WardStayAtPsychiatricCensusDate(@http://www.nhsia.nhs.uk/DataStandards/XMLschema/CDS/ns).
         *
         * This is a complex type.
         */
        public static class WardStayAtPsychiatricCensusDateImpl extends org.apache.xmlbeans.impl.values.XmlComplexContentImpl implements uk.nhs.nhsia.datastandards.ecds.PsychiatricEpisodeStructure.LocationGroup.WardStayAtPsychiatricCensusDate
        {
            private static final long serialVersionUID = 1L;
            
            public WardStayAtPsychiatricCensusDateImpl(org.apache.xmlbeans.SchemaType sType)
            {
                super(sType);
            }
            
            private static final javax.xml.namespace.QName LOCATIONCLASS$0 = 
                new javax.xml.namespace.QName("http://www.nhsia.nhs.uk/DataStandards/XMLschema/CDS/ns", "LocationClass");
            private static final javax.xml.namespace.QName SITECODEOFTREATMENT$2 = 
                new javax.xml.namespace.QName("http://www.nhsia.nhs.uk/DataStandards/XMLschema/CDS/ns", "SiteCodeOfTreatment");
            private static final javax.xml.namespace.QName ACTIVITYLOCATIONTYPE$4 = 
                new javax.xml.namespace.QName("http://www.nhsia.nhs.uk/DataStandards/XMLschema/CDS/ns", "ActivityLocationType");
            private static final javax.xml.namespace.QName INTENDEDCLINICALCAREINTENSITYCODE$6 = 
                new javax.xml.namespace.QName("http://www.nhsia.nhs.uk/DataStandards/XMLschema/CDS/ns", "IntendedClinicalCareIntensityCode");
            private static final javax.xml.namespace.QName INTENDEDAGEGROUP$8 = 
                new javax.xml.namespace.QName("http://www.nhsia.nhs.uk/DataStandards/XMLschema/CDS/ns", "IntendedAgeGroup");
            private static final javax.xml.namespace.QName SEXOFPATIENTSCODE$10 = 
                new javax.xml.namespace.QName("http://www.nhsia.nhs.uk/DataStandards/XMLschema/CDS/ns", "SexOfPatientsCode");
            private static final javax.xml.namespace.QName WARDDAYPERIODAVAILABILITYCODE$12 = 
                new javax.xml.namespace.QName("http://www.nhsia.nhs.uk/DataStandards/XMLschema/CDS/ns", "WardDayPeriodAvailabilityCode");
            private static final javax.xml.namespace.QName WARDNIGHTPERIODAVAILABILITYCODE$14 = 
                new javax.xml.namespace.QName("http://www.nhsia.nhs.uk/DataStandards/XMLschema/CDS/ns", "WardNightPeriodAvailabilityCode");
            private static final javax.xml.namespace.QName DETAINEDANDORLONGTERMPSYCHIATRICCENSUSDATE$16 = 
                new javax.xml.namespace.QName("http://www.nhsia.nhs.uk/DataStandards/XMLschema/CDS/ns", "DetainedAndOrLongTermPsychiatricCensusDate");
            private static final javax.xml.namespace.QName WARDSECURITYLEVEL$18 = 
                new javax.xml.namespace.QName("http://www.nhsia.nhs.uk/DataStandards/XMLschema/CDS/ns", "WardSecurityLevel");
            private static final javax.xml.namespace.QName WARDCODE$20 = 
                new javax.xml.namespace.QName("http://www.nhsia.nhs.uk/DataStandards/XMLschema/CDS/ns", "WardCode");
            
            
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
             * Gets the "SiteCodeOfTreatment" element
             */
            public java.lang.String getSiteCodeOfTreatment()
            {
                synchronized (monitor())
                {
                    check_orphaned();
                    org.apache.xmlbeans.SimpleValue target = null;
                    target = (org.apache.xmlbeans.SimpleValue)get_store().find_element_user(SITECODEOFTREATMENT$2, 0);
                    if (target == null)
                    {
                      return null;
                    }
                    return target.getStringValue();
                }
            }
            
            /**
             * Gets (as xml) the "SiteCodeOfTreatment" element
             */
            public uk.nhs.nhsia.datastandards.ecds.SiteCodeOfTreatmentType xgetSiteCodeOfTreatment()
            {
                synchronized (monitor())
                {
                    check_orphaned();
                    uk.nhs.nhsia.datastandards.ecds.SiteCodeOfTreatmentType target = null;
                    target = (uk.nhs.nhsia.datastandards.ecds.SiteCodeOfTreatmentType)get_store().find_element_user(SITECODEOFTREATMENT$2, 0);
                    return target;
                }
            }
            
            /**
             * True if has "SiteCodeOfTreatment" element
             */
            public boolean isSetSiteCodeOfTreatment()
            {
                synchronized (monitor())
                {
                    check_orphaned();
                    return get_store().count_elements(SITECODEOFTREATMENT$2) != 0;
                }
            }
            
            /**
             * Sets the "SiteCodeOfTreatment" element
             */
            public void setSiteCodeOfTreatment(java.lang.String siteCodeOfTreatment)
            {
                synchronized (monitor())
                {
                    check_orphaned();
                    org.apache.xmlbeans.SimpleValue target = null;
                    target = (org.apache.xmlbeans.SimpleValue)get_store().find_element_user(SITECODEOFTREATMENT$2, 0);
                    if (target == null)
                    {
                      target = (org.apache.xmlbeans.SimpleValue)get_store().add_element_user(SITECODEOFTREATMENT$2);
                    }
                    target.setStringValue(siteCodeOfTreatment);
                }
            }
            
            /**
             * Sets (as xml) the "SiteCodeOfTreatment" element
             */
            public void xsetSiteCodeOfTreatment(uk.nhs.nhsia.datastandards.ecds.SiteCodeOfTreatmentType siteCodeOfTreatment)
            {
                synchronized (monitor())
                {
                    check_orphaned();
                    uk.nhs.nhsia.datastandards.ecds.SiteCodeOfTreatmentType target = null;
                    target = (uk.nhs.nhsia.datastandards.ecds.SiteCodeOfTreatmentType)get_store().find_element_user(SITECODEOFTREATMENT$2, 0);
                    if (target == null)
                    {
                      target = (uk.nhs.nhsia.datastandards.ecds.SiteCodeOfTreatmentType)get_store().add_element_user(SITECODEOFTREATMENT$2);
                    }
                    target.set(siteCodeOfTreatment);
                }
            }
            
            /**
             * Unsets the "SiteCodeOfTreatment" element
             */
            public void unsetSiteCodeOfTreatment()
            {
                synchronized (monitor())
                {
                    check_orphaned();
                    get_store().remove_element(SITECODEOFTREATMENT$2, 0);
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
                    target = (org.apache.xmlbeans.SimpleValue)get_store().find_element_user(ACTIVITYLOCATIONTYPE$4, 0);
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
                    target = (uk.nhs.nhsia.datastandards.ecds.ActivityLocationTypeType)get_store().find_element_user(ACTIVITYLOCATIONTYPE$4, 0);
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
                    return get_store().count_elements(ACTIVITYLOCATIONTYPE$4) != 0;
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
                    target = (org.apache.xmlbeans.SimpleValue)get_store().find_element_user(ACTIVITYLOCATIONTYPE$4, 0);
                    if (target == null)
                    {
                      target = (org.apache.xmlbeans.SimpleValue)get_store().add_element_user(ACTIVITYLOCATIONTYPE$4);
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
                    target = (uk.nhs.nhsia.datastandards.ecds.ActivityLocationTypeType)get_store().find_element_user(ACTIVITYLOCATIONTYPE$4, 0);
                    if (target == null)
                    {
                      target = (uk.nhs.nhsia.datastandards.ecds.ActivityLocationTypeType)get_store().add_element_user(ACTIVITYLOCATIONTYPE$4);
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
                    get_store().remove_element(ACTIVITYLOCATIONTYPE$4, 0);
                }
            }
            
            /**
             * Gets the "IntendedClinicalCareIntensityCode" element
             */
            public uk.nhs.nhsia.datastandards.ecds.IntendedClinicalCareIntensityCodeType.Enum getIntendedClinicalCareIntensityCode()
            {
                synchronized (monitor())
                {
                    check_orphaned();
                    org.apache.xmlbeans.SimpleValue target = null;
                    target = (org.apache.xmlbeans.SimpleValue)get_store().find_element_user(INTENDEDCLINICALCAREINTENSITYCODE$6, 0);
                    if (target == null)
                    {
                      return null;
                    }
                    return (uk.nhs.nhsia.datastandards.ecds.IntendedClinicalCareIntensityCodeType.Enum)target.getEnumValue();
                }
            }
            
            /**
             * Gets (as xml) the "IntendedClinicalCareIntensityCode" element
             */
            public uk.nhs.nhsia.datastandards.ecds.IntendedClinicalCareIntensityCodeType xgetIntendedClinicalCareIntensityCode()
            {
                synchronized (monitor())
                {
                    check_orphaned();
                    uk.nhs.nhsia.datastandards.ecds.IntendedClinicalCareIntensityCodeType target = null;
                    target = (uk.nhs.nhsia.datastandards.ecds.IntendedClinicalCareIntensityCodeType)get_store().find_element_user(INTENDEDCLINICALCAREINTENSITYCODE$6, 0);
                    return target;
                }
            }
            
            /**
             * True if has "IntendedClinicalCareIntensityCode" element
             */
            public boolean isSetIntendedClinicalCareIntensityCode()
            {
                synchronized (monitor())
                {
                    check_orphaned();
                    return get_store().count_elements(INTENDEDCLINICALCAREINTENSITYCODE$6) != 0;
                }
            }
            
            /**
             * Sets the "IntendedClinicalCareIntensityCode" element
             */
            public void setIntendedClinicalCareIntensityCode(uk.nhs.nhsia.datastandards.ecds.IntendedClinicalCareIntensityCodeType.Enum intendedClinicalCareIntensityCode)
            {
                synchronized (monitor())
                {
                    check_orphaned();
                    org.apache.xmlbeans.SimpleValue target = null;
                    target = (org.apache.xmlbeans.SimpleValue)get_store().find_element_user(INTENDEDCLINICALCAREINTENSITYCODE$6, 0);
                    if (target == null)
                    {
                      target = (org.apache.xmlbeans.SimpleValue)get_store().add_element_user(INTENDEDCLINICALCAREINTENSITYCODE$6);
                    }
                    target.setEnumValue(intendedClinicalCareIntensityCode);
                }
            }
            
            /**
             * Sets (as xml) the "IntendedClinicalCareIntensityCode" element
             */
            public void xsetIntendedClinicalCareIntensityCode(uk.nhs.nhsia.datastandards.ecds.IntendedClinicalCareIntensityCodeType intendedClinicalCareIntensityCode)
            {
                synchronized (monitor())
                {
                    check_orphaned();
                    uk.nhs.nhsia.datastandards.ecds.IntendedClinicalCareIntensityCodeType target = null;
                    target = (uk.nhs.nhsia.datastandards.ecds.IntendedClinicalCareIntensityCodeType)get_store().find_element_user(INTENDEDCLINICALCAREINTENSITYCODE$6, 0);
                    if (target == null)
                    {
                      target = (uk.nhs.nhsia.datastandards.ecds.IntendedClinicalCareIntensityCodeType)get_store().add_element_user(INTENDEDCLINICALCAREINTENSITYCODE$6);
                    }
                    target.set(intendedClinicalCareIntensityCode);
                }
            }
            
            /**
             * Unsets the "IntendedClinicalCareIntensityCode" element
             */
            public void unsetIntendedClinicalCareIntensityCode()
            {
                synchronized (monitor())
                {
                    check_orphaned();
                    get_store().remove_element(INTENDEDCLINICALCAREINTENSITYCODE$6, 0);
                }
            }
            
            /**
             * Gets the "IntendedAgeGroup" element
             */
            public uk.nhs.nhsia.datastandards.ecds.IntendedAgeGroupType.Enum getIntendedAgeGroup()
            {
                synchronized (monitor())
                {
                    check_orphaned();
                    org.apache.xmlbeans.SimpleValue target = null;
                    target = (org.apache.xmlbeans.SimpleValue)get_store().find_element_user(INTENDEDAGEGROUP$8, 0);
                    if (target == null)
                    {
                      return null;
                    }
                    return (uk.nhs.nhsia.datastandards.ecds.IntendedAgeGroupType.Enum)target.getEnumValue();
                }
            }
            
            /**
             * Gets (as xml) the "IntendedAgeGroup" element
             */
            public uk.nhs.nhsia.datastandards.ecds.IntendedAgeGroupType xgetIntendedAgeGroup()
            {
                synchronized (monitor())
                {
                    check_orphaned();
                    uk.nhs.nhsia.datastandards.ecds.IntendedAgeGroupType target = null;
                    target = (uk.nhs.nhsia.datastandards.ecds.IntendedAgeGroupType)get_store().find_element_user(INTENDEDAGEGROUP$8, 0);
                    return target;
                }
            }
            
            /**
             * True if has "IntendedAgeGroup" element
             */
            public boolean isSetIntendedAgeGroup()
            {
                synchronized (monitor())
                {
                    check_orphaned();
                    return get_store().count_elements(INTENDEDAGEGROUP$8) != 0;
                }
            }
            
            /**
             * Sets the "IntendedAgeGroup" element
             */
            public void setIntendedAgeGroup(uk.nhs.nhsia.datastandards.ecds.IntendedAgeGroupType.Enum intendedAgeGroup)
            {
                synchronized (monitor())
                {
                    check_orphaned();
                    org.apache.xmlbeans.SimpleValue target = null;
                    target = (org.apache.xmlbeans.SimpleValue)get_store().find_element_user(INTENDEDAGEGROUP$8, 0);
                    if (target == null)
                    {
                      target = (org.apache.xmlbeans.SimpleValue)get_store().add_element_user(INTENDEDAGEGROUP$8);
                    }
                    target.setEnumValue(intendedAgeGroup);
                }
            }
            
            /**
             * Sets (as xml) the "IntendedAgeGroup" element
             */
            public void xsetIntendedAgeGroup(uk.nhs.nhsia.datastandards.ecds.IntendedAgeGroupType intendedAgeGroup)
            {
                synchronized (monitor())
                {
                    check_orphaned();
                    uk.nhs.nhsia.datastandards.ecds.IntendedAgeGroupType target = null;
                    target = (uk.nhs.nhsia.datastandards.ecds.IntendedAgeGroupType)get_store().find_element_user(INTENDEDAGEGROUP$8, 0);
                    if (target == null)
                    {
                      target = (uk.nhs.nhsia.datastandards.ecds.IntendedAgeGroupType)get_store().add_element_user(INTENDEDAGEGROUP$8);
                    }
                    target.set(intendedAgeGroup);
                }
            }
            
            /**
             * Unsets the "IntendedAgeGroup" element
             */
            public void unsetIntendedAgeGroup()
            {
                synchronized (monitor())
                {
                    check_orphaned();
                    get_store().remove_element(INTENDEDAGEGROUP$8, 0);
                }
            }
            
            /**
             * Gets the "SexOfPatientsCode" element
             */
            public uk.nhs.nhsia.datastandards.ecds.SexOfPatientsCodeType.Enum getSexOfPatientsCode()
            {
                synchronized (monitor())
                {
                    check_orphaned();
                    org.apache.xmlbeans.SimpleValue target = null;
                    target = (org.apache.xmlbeans.SimpleValue)get_store().find_element_user(SEXOFPATIENTSCODE$10, 0);
                    if (target == null)
                    {
                      return null;
                    }
                    return (uk.nhs.nhsia.datastandards.ecds.SexOfPatientsCodeType.Enum)target.getEnumValue();
                }
            }
            
            /**
             * Gets (as xml) the "SexOfPatientsCode" element
             */
            public uk.nhs.nhsia.datastandards.ecds.SexOfPatientsCodeType xgetSexOfPatientsCode()
            {
                synchronized (monitor())
                {
                    check_orphaned();
                    uk.nhs.nhsia.datastandards.ecds.SexOfPatientsCodeType target = null;
                    target = (uk.nhs.nhsia.datastandards.ecds.SexOfPatientsCodeType)get_store().find_element_user(SEXOFPATIENTSCODE$10, 0);
                    return target;
                }
            }
            
            /**
             * True if has "SexOfPatientsCode" element
             */
            public boolean isSetSexOfPatientsCode()
            {
                synchronized (monitor())
                {
                    check_orphaned();
                    return get_store().count_elements(SEXOFPATIENTSCODE$10) != 0;
                }
            }
            
            /**
             * Sets the "SexOfPatientsCode" element
             */
            public void setSexOfPatientsCode(uk.nhs.nhsia.datastandards.ecds.SexOfPatientsCodeType.Enum sexOfPatientsCode)
            {
                synchronized (monitor())
                {
                    check_orphaned();
                    org.apache.xmlbeans.SimpleValue target = null;
                    target = (org.apache.xmlbeans.SimpleValue)get_store().find_element_user(SEXOFPATIENTSCODE$10, 0);
                    if (target == null)
                    {
                      target = (org.apache.xmlbeans.SimpleValue)get_store().add_element_user(SEXOFPATIENTSCODE$10);
                    }
                    target.setEnumValue(sexOfPatientsCode);
                }
            }
            
            /**
             * Sets (as xml) the "SexOfPatientsCode" element
             */
            public void xsetSexOfPatientsCode(uk.nhs.nhsia.datastandards.ecds.SexOfPatientsCodeType sexOfPatientsCode)
            {
                synchronized (monitor())
                {
                    check_orphaned();
                    uk.nhs.nhsia.datastandards.ecds.SexOfPatientsCodeType target = null;
                    target = (uk.nhs.nhsia.datastandards.ecds.SexOfPatientsCodeType)get_store().find_element_user(SEXOFPATIENTSCODE$10, 0);
                    if (target == null)
                    {
                      target = (uk.nhs.nhsia.datastandards.ecds.SexOfPatientsCodeType)get_store().add_element_user(SEXOFPATIENTSCODE$10);
                    }
                    target.set(sexOfPatientsCode);
                }
            }
            
            /**
             * Unsets the "SexOfPatientsCode" element
             */
            public void unsetSexOfPatientsCode()
            {
                synchronized (monitor())
                {
                    check_orphaned();
                    get_store().remove_element(SEXOFPATIENTSCODE$10, 0);
                }
            }
            
            /**
             * Gets the "WardDayPeriodAvailabilityCode" element
             */
            public uk.nhs.nhsia.datastandards.ecds.WardDayPeriodAvailabilityCodeType.Enum getWardDayPeriodAvailabilityCode()
            {
                synchronized (monitor())
                {
                    check_orphaned();
                    org.apache.xmlbeans.SimpleValue target = null;
                    target = (org.apache.xmlbeans.SimpleValue)get_store().find_element_user(WARDDAYPERIODAVAILABILITYCODE$12, 0);
                    if (target == null)
                    {
                      return null;
                    }
                    return (uk.nhs.nhsia.datastandards.ecds.WardDayPeriodAvailabilityCodeType.Enum)target.getEnumValue();
                }
            }
            
            /**
             * Gets (as xml) the "WardDayPeriodAvailabilityCode" element
             */
            public uk.nhs.nhsia.datastandards.ecds.WardDayPeriodAvailabilityCodeType xgetWardDayPeriodAvailabilityCode()
            {
                synchronized (monitor())
                {
                    check_orphaned();
                    uk.nhs.nhsia.datastandards.ecds.WardDayPeriodAvailabilityCodeType target = null;
                    target = (uk.nhs.nhsia.datastandards.ecds.WardDayPeriodAvailabilityCodeType)get_store().find_element_user(WARDDAYPERIODAVAILABILITYCODE$12, 0);
                    return target;
                }
            }
            
            /**
             * True if has "WardDayPeriodAvailabilityCode" element
             */
            public boolean isSetWardDayPeriodAvailabilityCode()
            {
                synchronized (monitor())
                {
                    check_orphaned();
                    return get_store().count_elements(WARDDAYPERIODAVAILABILITYCODE$12) != 0;
                }
            }
            
            /**
             * Sets the "WardDayPeriodAvailabilityCode" element
             */
            public void setWardDayPeriodAvailabilityCode(uk.nhs.nhsia.datastandards.ecds.WardDayPeriodAvailabilityCodeType.Enum wardDayPeriodAvailabilityCode)
            {
                synchronized (monitor())
                {
                    check_orphaned();
                    org.apache.xmlbeans.SimpleValue target = null;
                    target = (org.apache.xmlbeans.SimpleValue)get_store().find_element_user(WARDDAYPERIODAVAILABILITYCODE$12, 0);
                    if (target == null)
                    {
                      target = (org.apache.xmlbeans.SimpleValue)get_store().add_element_user(WARDDAYPERIODAVAILABILITYCODE$12);
                    }
                    target.setEnumValue(wardDayPeriodAvailabilityCode);
                }
            }
            
            /**
             * Sets (as xml) the "WardDayPeriodAvailabilityCode" element
             */
            public void xsetWardDayPeriodAvailabilityCode(uk.nhs.nhsia.datastandards.ecds.WardDayPeriodAvailabilityCodeType wardDayPeriodAvailabilityCode)
            {
                synchronized (monitor())
                {
                    check_orphaned();
                    uk.nhs.nhsia.datastandards.ecds.WardDayPeriodAvailabilityCodeType target = null;
                    target = (uk.nhs.nhsia.datastandards.ecds.WardDayPeriodAvailabilityCodeType)get_store().find_element_user(WARDDAYPERIODAVAILABILITYCODE$12, 0);
                    if (target == null)
                    {
                      target = (uk.nhs.nhsia.datastandards.ecds.WardDayPeriodAvailabilityCodeType)get_store().add_element_user(WARDDAYPERIODAVAILABILITYCODE$12);
                    }
                    target.set(wardDayPeriodAvailabilityCode);
                }
            }
            
            /**
             * Unsets the "WardDayPeriodAvailabilityCode" element
             */
            public void unsetWardDayPeriodAvailabilityCode()
            {
                synchronized (monitor())
                {
                    check_orphaned();
                    get_store().remove_element(WARDDAYPERIODAVAILABILITYCODE$12, 0);
                }
            }
            
            /**
             * Gets the "WardNightPeriodAvailabilityCode" element
             */
            public uk.nhs.nhsia.datastandards.ecds.WardNightPeriodAvailabilityCodeType.Enum getWardNightPeriodAvailabilityCode()
            {
                synchronized (monitor())
                {
                    check_orphaned();
                    org.apache.xmlbeans.SimpleValue target = null;
                    target = (org.apache.xmlbeans.SimpleValue)get_store().find_element_user(WARDNIGHTPERIODAVAILABILITYCODE$14, 0);
                    if (target == null)
                    {
                      return null;
                    }
                    return (uk.nhs.nhsia.datastandards.ecds.WardNightPeriodAvailabilityCodeType.Enum)target.getEnumValue();
                }
            }
            
            /**
             * Gets (as xml) the "WardNightPeriodAvailabilityCode" element
             */
            public uk.nhs.nhsia.datastandards.ecds.WardNightPeriodAvailabilityCodeType xgetWardNightPeriodAvailabilityCode()
            {
                synchronized (monitor())
                {
                    check_orphaned();
                    uk.nhs.nhsia.datastandards.ecds.WardNightPeriodAvailabilityCodeType target = null;
                    target = (uk.nhs.nhsia.datastandards.ecds.WardNightPeriodAvailabilityCodeType)get_store().find_element_user(WARDNIGHTPERIODAVAILABILITYCODE$14, 0);
                    return target;
                }
            }
            
            /**
             * True if has "WardNightPeriodAvailabilityCode" element
             */
            public boolean isSetWardNightPeriodAvailabilityCode()
            {
                synchronized (monitor())
                {
                    check_orphaned();
                    return get_store().count_elements(WARDNIGHTPERIODAVAILABILITYCODE$14) != 0;
                }
            }
            
            /**
             * Sets the "WardNightPeriodAvailabilityCode" element
             */
            public void setWardNightPeriodAvailabilityCode(uk.nhs.nhsia.datastandards.ecds.WardNightPeriodAvailabilityCodeType.Enum wardNightPeriodAvailabilityCode)
            {
                synchronized (monitor())
                {
                    check_orphaned();
                    org.apache.xmlbeans.SimpleValue target = null;
                    target = (org.apache.xmlbeans.SimpleValue)get_store().find_element_user(WARDNIGHTPERIODAVAILABILITYCODE$14, 0);
                    if (target == null)
                    {
                      target = (org.apache.xmlbeans.SimpleValue)get_store().add_element_user(WARDNIGHTPERIODAVAILABILITYCODE$14);
                    }
                    target.setEnumValue(wardNightPeriodAvailabilityCode);
                }
            }
            
            /**
             * Sets (as xml) the "WardNightPeriodAvailabilityCode" element
             */
            public void xsetWardNightPeriodAvailabilityCode(uk.nhs.nhsia.datastandards.ecds.WardNightPeriodAvailabilityCodeType wardNightPeriodAvailabilityCode)
            {
                synchronized (monitor())
                {
                    check_orphaned();
                    uk.nhs.nhsia.datastandards.ecds.WardNightPeriodAvailabilityCodeType target = null;
                    target = (uk.nhs.nhsia.datastandards.ecds.WardNightPeriodAvailabilityCodeType)get_store().find_element_user(WARDNIGHTPERIODAVAILABILITYCODE$14, 0);
                    if (target == null)
                    {
                      target = (uk.nhs.nhsia.datastandards.ecds.WardNightPeriodAvailabilityCodeType)get_store().add_element_user(WARDNIGHTPERIODAVAILABILITYCODE$14);
                    }
                    target.set(wardNightPeriodAvailabilityCode);
                }
            }
            
            /**
             * Unsets the "WardNightPeriodAvailabilityCode" element
             */
            public void unsetWardNightPeriodAvailabilityCode()
            {
                synchronized (monitor())
                {
                    check_orphaned();
                    get_store().remove_element(WARDNIGHTPERIODAVAILABILITYCODE$14, 0);
                }
            }
            
            /**
             * Gets the "DetainedAndOrLongTermPsychiatricCensusDate" element
             */
            public java.util.Calendar getDetainedAndOrLongTermPsychiatricCensusDate()
            {
                synchronized (monitor())
                {
                    check_orphaned();
                    org.apache.xmlbeans.SimpleValue target = null;
                    target = (org.apache.xmlbeans.SimpleValue)get_store().find_element_user(DETAINEDANDORLONGTERMPSYCHIATRICCENSUSDATE$16, 0);
                    if (target == null)
                    {
                      return null;
                    }
                    return target.getCalendarValue();
                }
            }
            
            /**
             * Gets (as xml) the "DetainedAndOrLongTermPsychiatricCensusDate" element
             */
            public uk.nhs.nhsia.datastandards.ecds.DetainedAndOrLongTermPsychiatricCensusDateType xgetDetainedAndOrLongTermPsychiatricCensusDate()
            {
                synchronized (monitor())
                {
                    check_orphaned();
                    uk.nhs.nhsia.datastandards.ecds.DetainedAndOrLongTermPsychiatricCensusDateType target = null;
                    target = (uk.nhs.nhsia.datastandards.ecds.DetainedAndOrLongTermPsychiatricCensusDateType)get_store().find_element_user(DETAINEDANDORLONGTERMPSYCHIATRICCENSUSDATE$16, 0);
                    return target;
                }
            }
            
            /**
             * True if has "DetainedAndOrLongTermPsychiatricCensusDate" element
             */
            public boolean isSetDetainedAndOrLongTermPsychiatricCensusDate()
            {
                synchronized (monitor())
                {
                    check_orphaned();
                    return get_store().count_elements(DETAINEDANDORLONGTERMPSYCHIATRICCENSUSDATE$16) != 0;
                }
            }
            
            /**
             * Sets the "DetainedAndOrLongTermPsychiatricCensusDate" element
             */
            public void setDetainedAndOrLongTermPsychiatricCensusDate(java.util.Calendar detainedAndOrLongTermPsychiatricCensusDate)
            {
                synchronized (monitor())
                {
                    check_orphaned();
                    org.apache.xmlbeans.SimpleValue target = null;
                    target = (org.apache.xmlbeans.SimpleValue)get_store().find_element_user(DETAINEDANDORLONGTERMPSYCHIATRICCENSUSDATE$16, 0);
                    if (target == null)
                    {
                      target = (org.apache.xmlbeans.SimpleValue)get_store().add_element_user(DETAINEDANDORLONGTERMPSYCHIATRICCENSUSDATE$16);
                    }
                    target.setCalendarValue(detainedAndOrLongTermPsychiatricCensusDate);
                }
            }
            
            /**
             * Sets (as xml) the "DetainedAndOrLongTermPsychiatricCensusDate" element
             */
            public void xsetDetainedAndOrLongTermPsychiatricCensusDate(uk.nhs.nhsia.datastandards.ecds.DetainedAndOrLongTermPsychiatricCensusDateType detainedAndOrLongTermPsychiatricCensusDate)
            {
                synchronized (monitor())
                {
                    check_orphaned();
                    uk.nhs.nhsia.datastandards.ecds.DetainedAndOrLongTermPsychiatricCensusDateType target = null;
                    target = (uk.nhs.nhsia.datastandards.ecds.DetainedAndOrLongTermPsychiatricCensusDateType)get_store().find_element_user(DETAINEDANDORLONGTERMPSYCHIATRICCENSUSDATE$16, 0);
                    if (target == null)
                    {
                      target = (uk.nhs.nhsia.datastandards.ecds.DetainedAndOrLongTermPsychiatricCensusDateType)get_store().add_element_user(DETAINEDANDORLONGTERMPSYCHIATRICCENSUSDATE$16);
                    }
                    target.set(detainedAndOrLongTermPsychiatricCensusDate);
                }
            }
            
            /**
             * Unsets the "DetainedAndOrLongTermPsychiatricCensusDate" element
             */
            public void unsetDetainedAndOrLongTermPsychiatricCensusDate()
            {
                synchronized (monitor())
                {
                    check_orphaned();
                    get_store().remove_element(DETAINEDANDORLONGTERMPSYCHIATRICCENSUSDATE$16, 0);
                }
            }
            
            /**
             * Gets the "WardSecurityLevel" element
             */
            public uk.nhs.nhsia.datastandards.ecds.WardSecurityLevelType.Enum getWardSecurityLevel()
            {
                synchronized (monitor())
                {
                    check_orphaned();
                    org.apache.xmlbeans.SimpleValue target = null;
                    target = (org.apache.xmlbeans.SimpleValue)get_store().find_element_user(WARDSECURITYLEVEL$18, 0);
                    if (target == null)
                    {
                      return null;
                    }
                    return (uk.nhs.nhsia.datastandards.ecds.WardSecurityLevelType.Enum)target.getEnumValue();
                }
            }
            
            /**
             * Gets (as xml) the "WardSecurityLevel" element
             */
            public uk.nhs.nhsia.datastandards.ecds.WardSecurityLevelType xgetWardSecurityLevel()
            {
                synchronized (monitor())
                {
                    check_orphaned();
                    uk.nhs.nhsia.datastandards.ecds.WardSecurityLevelType target = null;
                    target = (uk.nhs.nhsia.datastandards.ecds.WardSecurityLevelType)get_store().find_element_user(WARDSECURITYLEVEL$18, 0);
                    return target;
                }
            }
            
            /**
             * True if has "WardSecurityLevel" element
             */
            public boolean isSetWardSecurityLevel()
            {
                synchronized (monitor())
                {
                    check_orphaned();
                    return get_store().count_elements(WARDSECURITYLEVEL$18) != 0;
                }
            }
            
            /**
             * Sets the "WardSecurityLevel" element
             */
            public void setWardSecurityLevel(uk.nhs.nhsia.datastandards.ecds.WardSecurityLevelType.Enum wardSecurityLevel)
            {
                synchronized (monitor())
                {
                    check_orphaned();
                    org.apache.xmlbeans.SimpleValue target = null;
                    target = (org.apache.xmlbeans.SimpleValue)get_store().find_element_user(WARDSECURITYLEVEL$18, 0);
                    if (target == null)
                    {
                      target = (org.apache.xmlbeans.SimpleValue)get_store().add_element_user(WARDSECURITYLEVEL$18);
                    }
                    target.setEnumValue(wardSecurityLevel);
                }
            }
            
            /**
             * Sets (as xml) the "WardSecurityLevel" element
             */
            public void xsetWardSecurityLevel(uk.nhs.nhsia.datastandards.ecds.WardSecurityLevelType wardSecurityLevel)
            {
                synchronized (monitor())
                {
                    check_orphaned();
                    uk.nhs.nhsia.datastandards.ecds.WardSecurityLevelType target = null;
                    target = (uk.nhs.nhsia.datastandards.ecds.WardSecurityLevelType)get_store().find_element_user(WARDSECURITYLEVEL$18, 0);
                    if (target == null)
                    {
                      target = (uk.nhs.nhsia.datastandards.ecds.WardSecurityLevelType)get_store().add_element_user(WARDSECURITYLEVEL$18);
                    }
                    target.set(wardSecurityLevel);
                }
            }
            
            /**
             * Unsets the "WardSecurityLevel" element
             */
            public void unsetWardSecurityLevel()
            {
                synchronized (monitor())
                {
                    check_orphaned();
                    get_store().remove_element(WARDSECURITYLEVEL$18, 0);
                }
            }
            
            /**
             * Gets the "WardCode" element
             */
            public java.lang.String getWardCode()
            {
                synchronized (monitor())
                {
                    check_orphaned();
                    org.apache.xmlbeans.SimpleValue target = null;
                    target = (org.apache.xmlbeans.SimpleValue)get_store().find_element_user(WARDCODE$20, 0);
                    if (target == null)
                    {
                      return null;
                    }
                    return target.getStringValue();
                }
            }
            
            /**
             * Gets (as xml) the "WardCode" element
             */
            public uk.nhs.nhsia.datastandards.ecds.WardCodeType xgetWardCode()
            {
                synchronized (monitor())
                {
                    check_orphaned();
                    uk.nhs.nhsia.datastandards.ecds.WardCodeType target = null;
                    target = (uk.nhs.nhsia.datastandards.ecds.WardCodeType)get_store().find_element_user(WARDCODE$20, 0);
                    return target;
                }
            }
            
            /**
             * True if has "WardCode" element
             */
            public boolean isSetWardCode()
            {
                synchronized (monitor())
                {
                    check_orphaned();
                    return get_store().count_elements(WARDCODE$20) != 0;
                }
            }
            
            /**
             * Sets the "WardCode" element
             */
            public void setWardCode(java.lang.String wardCode)
            {
                synchronized (monitor())
                {
                    check_orphaned();
                    org.apache.xmlbeans.SimpleValue target = null;
                    target = (org.apache.xmlbeans.SimpleValue)get_store().find_element_user(WARDCODE$20, 0);
                    if (target == null)
                    {
                      target = (org.apache.xmlbeans.SimpleValue)get_store().add_element_user(WARDCODE$20);
                    }
                    target.setStringValue(wardCode);
                }
            }
            
            /**
             * Sets (as xml) the "WardCode" element
             */
            public void xsetWardCode(uk.nhs.nhsia.datastandards.ecds.WardCodeType wardCode)
            {
                synchronized (monitor())
                {
                    check_orphaned();
                    uk.nhs.nhsia.datastandards.ecds.WardCodeType target = null;
                    target = (uk.nhs.nhsia.datastandards.ecds.WardCodeType)get_store().find_element_user(WARDCODE$20, 0);
                    if (target == null)
                    {
                      target = (uk.nhs.nhsia.datastandards.ecds.WardCodeType)get_store().add_element_user(WARDCODE$20);
                    }
                    target.set(wardCode);
                }
            }
            
            /**
             * Unsets the "WardCode" element
             */
            public void unsetWardCode()
            {
                synchronized (monitor())
                {
                    check_orphaned();
                    get_store().remove_element(WARDCODE$20, 0);
                }
            }
        }
    }
}
