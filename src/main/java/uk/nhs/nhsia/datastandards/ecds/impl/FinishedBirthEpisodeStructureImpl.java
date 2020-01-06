/*
 * XML Type:  FinishedBirthEpisode_Structure
 * Namespace: http://www.nhsia.nhs.uk/DataStandards/XMLschema/CDS/ns
 * Java type: uk.nhs.nhsia.datastandards.ecds.FinishedBirthEpisodeStructure
 *
 * Automatically generated - do not modify.
 */
package uk.nhs.nhsia.datastandards.ecds.impl;
/**
 * An XML FinishedBirthEpisode_Structure(@http://www.nhsia.nhs.uk/DataStandards/XMLschema/CDS/ns).
 *
 * This is a complex type.
 */
public class FinishedBirthEpisodeStructureImpl extends org.apache.xmlbeans.impl.values.XmlComplexContentImpl implements uk.nhs.nhsia.datastandards.ecds.FinishedBirthEpisodeStructure
{
    private static final long serialVersionUID = 1L;
    
    public FinishedBirthEpisodeStructureImpl(org.apache.xmlbeans.SchemaType sType)
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
    private static final javax.xml.namespace.QName CLINICALTREATMENTDETAILS$8 = 
        new javax.xml.namespace.QName("http://www.nhsia.nhs.uk/DataStandards/XMLschema/CDS/ns", "ClinicalTreatmentDetails");
    private static final javax.xml.namespace.QName APCLOCATIONGROUP$10 = 
        new javax.xml.namespace.QName("http://www.nhsia.nhs.uk/DataStandards/XMLschema/CDS/ns", "APCLocationGroup");
    
    
    /**
     * Gets the "EpisodeCharacteristics" element
     */
    public uk.nhs.nhsia.datastandards.ecds.FinishedBirthEpisodeStructure.EpisodeCharacteristics getEpisodeCharacteristics()
    {
        synchronized (monitor())
        {
            check_orphaned();
            uk.nhs.nhsia.datastandards.ecds.FinishedBirthEpisodeStructure.EpisodeCharacteristics target = null;
            target = (uk.nhs.nhsia.datastandards.ecds.FinishedBirthEpisodeStructure.EpisodeCharacteristics)get_store().find_element_user(EPISODECHARACTERISTICS$0, 0);
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
    public void setEpisodeCharacteristics(uk.nhs.nhsia.datastandards.ecds.FinishedBirthEpisodeStructure.EpisodeCharacteristics episodeCharacteristics)
    {
        generatedSetterHelperImpl(episodeCharacteristics, EPISODECHARACTERISTICS$0, 0, org.apache.xmlbeans.impl.values.XmlObjectBase.KIND_SETTERHELPER_SINGLETON);
    }
    
    /**
     * Appends and returns a new empty "EpisodeCharacteristics" element
     */
    public uk.nhs.nhsia.datastandards.ecds.FinishedBirthEpisodeStructure.EpisodeCharacteristics addNewEpisodeCharacteristics()
    {
        synchronized (monitor())
        {
            check_orphaned();
            uk.nhs.nhsia.datastandards.ecds.FinishedBirthEpisodeStructure.EpisodeCharacteristics target = null;
            target = (uk.nhs.nhsia.datastandards.ecds.FinishedBirthEpisodeStructure.EpisodeCharacteristics)get_store().add_element_user(EPISODECHARACTERISTICS$0);
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
     * Gets the "ClinicalTreatmentDetails" element
     */
    public uk.nhs.nhsia.datastandards.ecds.ClinicalActivityStructure getClinicalTreatmentDetails()
    {
        synchronized (monitor())
        {
            check_orphaned();
            uk.nhs.nhsia.datastandards.ecds.ClinicalActivityStructure target = null;
            target = (uk.nhs.nhsia.datastandards.ecds.ClinicalActivityStructure)get_store().find_element_user(CLINICALTREATMENTDETAILS$8, 0);
            if (target == null)
            {
                return null;
            }
            return target;
        }
    }
    
    /**
     * True if has "ClinicalTreatmentDetails" element
     */
    public boolean isSetClinicalTreatmentDetails()
    {
        synchronized (monitor())
        {
            check_orphaned();
            return get_store().count_elements(CLINICALTREATMENTDETAILS$8) != 0;
        }
    }
    
    /**
     * Sets the "ClinicalTreatmentDetails" element
     */
    public void setClinicalTreatmentDetails(uk.nhs.nhsia.datastandards.ecds.ClinicalActivityStructure clinicalTreatmentDetails)
    {
        generatedSetterHelperImpl(clinicalTreatmentDetails, CLINICALTREATMENTDETAILS$8, 0, org.apache.xmlbeans.impl.values.XmlObjectBase.KIND_SETTERHELPER_SINGLETON);
    }
    
    /**
     * Appends and returns a new empty "ClinicalTreatmentDetails" element
     */
    public uk.nhs.nhsia.datastandards.ecds.ClinicalActivityStructure addNewClinicalTreatmentDetails()
    {
        synchronized (monitor())
        {
            check_orphaned();
            uk.nhs.nhsia.datastandards.ecds.ClinicalActivityStructure target = null;
            target = (uk.nhs.nhsia.datastandards.ecds.ClinicalActivityStructure)get_store().add_element_user(CLINICALTREATMENTDETAILS$8);
            return target;
        }
    }
    
    /**
     * Unsets the "ClinicalTreatmentDetails" element
     */
    public void unsetClinicalTreatmentDetails()
    {
        synchronized (monitor())
        {
            check_orphaned();
            get_store().remove_element(CLINICALTREATMENTDETAILS$8, 0);
        }
    }
    
    /**
     * Gets the "APCLocationGroup" element
     */
    public uk.nhs.nhsia.datastandards.ecds.APCLocationGroupStructure getAPCLocationGroup()
    {
        synchronized (monitor())
        {
            check_orphaned();
            uk.nhs.nhsia.datastandards.ecds.APCLocationGroupStructure target = null;
            target = (uk.nhs.nhsia.datastandards.ecds.APCLocationGroupStructure)get_store().find_element_user(APCLOCATIONGROUP$10, 0);
            if (target == null)
            {
                return null;
            }
            return target;
        }
    }
    
    /**
     * True if has "APCLocationGroup" element
     */
    public boolean isSetAPCLocationGroup()
    {
        synchronized (monitor())
        {
            check_orphaned();
            return get_store().count_elements(APCLOCATIONGROUP$10) != 0;
        }
    }
    
    /**
     * Sets the "APCLocationGroup" element
     */
    public void setAPCLocationGroup(uk.nhs.nhsia.datastandards.ecds.APCLocationGroupStructure apcLocationGroup)
    {
        generatedSetterHelperImpl(apcLocationGroup, APCLOCATIONGROUP$10, 0, org.apache.xmlbeans.impl.values.XmlObjectBase.KIND_SETTERHELPER_SINGLETON);
    }
    
    /**
     * Appends and returns a new empty "APCLocationGroup" element
     */
    public uk.nhs.nhsia.datastandards.ecds.APCLocationGroupStructure addNewAPCLocationGroup()
    {
        synchronized (monitor())
        {
            check_orphaned();
            uk.nhs.nhsia.datastandards.ecds.APCLocationGroupStructure target = null;
            target = (uk.nhs.nhsia.datastandards.ecds.APCLocationGroupStructure)get_store().add_element_user(APCLOCATIONGROUP$10);
            return target;
        }
    }
    
    /**
     * Unsets the "APCLocationGroup" element
     */
    public void unsetAPCLocationGroup()
    {
        synchronized (monitor())
        {
            check_orphaned();
            get_store().remove_element(APCLOCATIONGROUP$10, 0);
        }
    }
    /**
     * An XML EpisodeCharacteristics(@http://www.nhsia.nhs.uk/DataStandards/XMLschema/CDS/ns).
     *
     * This is a complex type.
     */
    public static class EpisodeCharacteristicsImpl extends org.apache.xmlbeans.impl.values.XmlComplexContentImpl implements uk.nhs.nhsia.datastandards.ecds.FinishedBirthEpisodeStructure.EpisodeCharacteristics
    {
        private static final long serialVersionUID = 1L;
        
        public EpisodeCharacteristicsImpl(org.apache.xmlbeans.SchemaType sType)
        {
            super(sType);
        }
        
        private static final javax.xml.namespace.QName EPISODENUMBER$0 = 
            new javax.xml.namespace.QName("http://www.nhsia.nhs.uk/DataStandards/XMLschema/CDS/ns", "EpisodeNumber");
        private static final javax.xml.namespace.QName LASTEPISODEINSPELLINDICATORCODE$2 = 
            new javax.xml.namespace.QName("http://www.nhsia.nhs.uk/DataStandards/XMLschema/CDS/ns", "LastEpisodeInSpellIndicatorCode");
        private static final javax.xml.namespace.QName OPERATIONSTATUSCODE$4 = 
            new javax.xml.namespace.QName("http://www.nhsia.nhs.uk/DataStandards/XMLschema/CDS/ns", "OperationStatusCode");
        private static final javax.xml.namespace.QName NEONATALLEVELOFCARECODE$6 = 
            new javax.xml.namespace.QName("http://www.nhsia.nhs.uk/DataStandards/XMLschema/CDS/ns", "NeonatalLevelOfCareCode");
        private static final javax.xml.namespace.QName STARTDATEEPISODE$8 = 
            new javax.xml.namespace.QName("http://www.nhsia.nhs.uk/DataStandards/XMLschema/CDS/ns", "StartDate_Episode");
        private static final javax.xml.namespace.QName STARTTIMEEPISODE$10 = 
            new javax.xml.namespace.QName("http://www.nhsia.nhs.uk/DataStandards/XMLschema/CDS/ns", "StartTime_Episode");
        private static final javax.xml.namespace.QName ENDDATEEPISODE$12 = 
            new javax.xml.namespace.QName("http://www.nhsia.nhs.uk/DataStandards/XMLschema/CDS/ns", "EndDate_Episode");
        private static final javax.xml.namespace.QName ENDTIMEEPISODE$14 = 
            new javax.xml.namespace.QName("http://www.nhsia.nhs.uk/DataStandards/XMLschema/CDS/ns", "EndTime_Episode");
        private static final javax.xml.namespace.QName AGEATCDSACTIVITYDATE$16 = 
            new javax.xml.namespace.QName("http://www.nhsia.nhs.uk/DataStandards/XMLschema/CDS/ns", "AgeAtCDSActivityDate");
        private static final javax.xml.namespace.QName OVERSEASVISITORSTATUS$18 = 
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
         * Gets the "LastEpisodeInSpellIndicatorCode" element
         */
        public uk.nhs.nhsia.datastandards.ecds.LastEpisodeInSpellIndicatorCodeType.Enum getLastEpisodeInSpellIndicatorCode()
        {
            synchronized (monitor())
            {
                check_orphaned();
                org.apache.xmlbeans.SimpleValue target = null;
                target = (org.apache.xmlbeans.SimpleValue)get_store().find_element_user(LASTEPISODEINSPELLINDICATORCODE$2, 0);
                if (target == null)
                {
                    return null;
                }
                return (uk.nhs.nhsia.datastandards.ecds.LastEpisodeInSpellIndicatorCodeType.Enum)target.getEnumValue();
            }
        }
        
        /**
         * Gets (as xml) the "LastEpisodeInSpellIndicatorCode" element
         */
        public uk.nhs.nhsia.datastandards.ecds.LastEpisodeInSpellIndicatorCodeType xgetLastEpisodeInSpellIndicatorCode()
        {
            synchronized (monitor())
            {
                check_orphaned();
                uk.nhs.nhsia.datastandards.ecds.LastEpisodeInSpellIndicatorCodeType target = null;
                target = (uk.nhs.nhsia.datastandards.ecds.LastEpisodeInSpellIndicatorCodeType)get_store().find_element_user(LASTEPISODEINSPELLINDICATORCODE$2, 0);
                return target;
            }
        }
        
        /**
         * True if has "LastEpisodeInSpellIndicatorCode" element
         */
        public boolean isSetLastEpisodeInSpellIndicatorCode()
        {
            synchronized (monitor())
            {
                check_orphaned();
                return get_store().count_elements(LASTEPISODEINSPELLINDICATORCODE$2) != 0;
            }
        }
        
        /**
         * Sets the "LastEpisodeInSpellIndicatorCode" element
         */
        public void setLastEpisodeInSpellIndicatorCode(uk.nhs.nhsia.datastandards.ecds.LastEpisodeInSpellIndicatorCodeType.Enum lastEpisodeInSpellIndicatorCode)
        {
            synchronized (monitor())
            {
                check_orphaned();
                org.apache.xmlbeans.SimpleValue target = null;
                target = (org.apache.xmlbeans.SimpleValue)get_store().find_element_user(LASTEPISODEINSPELLINDICATORCODE$2, 0);
                if (target == null)
                {
                    target = (org.apache.xmlbeans.SimpleValue)get_store().add_element_user(LASTEPISODEINSPELLINDICATORCODE$2);
                }
                target.setEnumValue(lastEpisodeInSpellIndicatorCode);
            }
        }
        
        /**
         * Sets (as xml) the "LastEpisodeInSpellIndicatorCode" element
         */
        public void xsetLastEpisodeInSpellIndicatorCode(uk.nhs.nhsia.datastandards.ecds.LastEpisodeInSpellIndicatorCodeType lastEpisodeInSpellIndicatorCode)
        {
            synchronized (monitor())
            {
                check_orphaned();
                uk.nhs.nhsia.datastandards.ecds.LastEpisodeInSpellIndicatorCodeType target = null;
                target = (uk.nhs.nhsia.datastandards.ecds.LastEpisodeInSpellIndicatorCodeType)get_store().find_element_user(LASTEPISODEINSPELLINDICATORCODE$2, 0);
                if (target == null)
                {
                    target = (uk.nhs.nhsia.datastandards.ecds.LastEpisodeInSpellIndicatorCodeType)get_store().add_element_user(LASTEPISODEINSPELLINDICATORCODE$2);
                }
                target.set(lastEpisodeInSpellIndicatorCode);
            }
        }
        
        /**
         * Unsets the "LastEpisodeInSpellIndicatorCode" element
         */
        public void unsetLastEpisodeInSpellIndicatorCode()
        {
            synchronized (monitor())
            {
                check_orphaned();
                get_store().remove_element(LASTEPISODEINSPELLINDICATORCODE$2, 0);
            }
        }
        
        /**
         * Gets the "OperationStatusCode" element
         */
        public uk.nhs.nhsia.datastandards.ecds.OperationStatusCodeType.Enum getOperationStatusCode()
        {
            synchronized (monitor())
            {
                check_orphaned();
                org.apache.xmlbeans.SimpleValue target = null;
                target = (org.apache.xmlbeans.SimpleValue)get_store().find_element_user(OPERATIONSTATUSCODE$4, 0);
                if (target == null)
                {
                    return null;
                }
                return (uk.nhs.nhsia.datastandards.ecds.OperationStatusCodeType.Enum)target.getEnumValue();
            }
        }
        
        /**
         * Gets (as xml) the "OperationStatusCode" element
         */
        public uk.nhs.nhsia.datastandards.ecds.OperationStatusCodeType xgetOperationStatusCode()
        {
            synchronized (monitor())
            {
                check_orphaned();
                uk.nhs.nhsia.datastandards.ecds.OperationStatusCodeType target = null;
                target = (uk.nhs.nhsia.datastandards.ecds.OperationStatusCodeType)get_store().find_element_user(OPERATIONSTATUSCODE$4, 0);
                return target;
            }
        }
        
        /**
         * True if has "OperationStatusCode" element
         */
        public boolean isSetOperationStatusCode()
        {
            synchronized (monitor())
            {
                check_orphaned();
                return get_store().count_elements(OPERATIONSTATUSCODE$4) != 0;
            }
        }
        
        /**
         * Sets the "OperationStatusCode" element
         */
        public void setOperationStatusCode(uk.nhs.nhsia.datastandards.ecds.OperationStatusCodeType.Enum operationStatusCode)
        {
            synchronized (monitor())
            {
                check_orphaned();
                org.apache.xmlbeans.SimpleValue target = null;
                target = (org.apache.xmlbeans.SimpleValue)get_store().find_element_user(OPERATIONSTATUSCODE$4, 0);
                if (target == null)
                {
                    target = (org.apache.xmlbeans.SimpleValue)get_store().add_element_user(OPERATIONSTATUSCODE$4);
                }
                target.setEnumValue(operationStatusCode);
            }
        }
        
        /**
         * Sets (as xml) the "OperationStatusCode" element
         */
        public void xsetOperationStatusCode(uk.nhs.nhsia.datastandards.ecds.OperationStatusCodeType operationStatusCode)
        {
            synchronized (monitor())
            {
                check_orphaned();
                uk.nhs.nhsia.datastandards.ecds.OperationStatusCodeType target = null;
                target = (uk.nhs.nhsia.datastandards.ecds.OperationStatusCodeType)get_store().find_element_user(OPERATIONSTATUSCODE$4, 0);
                if (target == null)
                {
                    target = (uk.nhs.nhsia.datastandards.ecds.OperationStatusCodeType)get_store().add_element_user(OPERATIONSTATUSCODE$4);
                }
                target.set(operationStatusCode);
            }
        }
        
        /**
         * Unsets the "OperationStatusCode" element
         */
        public void unsetOperationStatusCode()
        {
            synchronized (monitor())
            {
                check_orphaned();
                get_store().remove_element(OPERATIONSTATUSCODE$4, 0);
            }
        }
        
        /**
         * Gets the "NeonatalLevelOfCareCode" element
         */
        public uk.nhs.nhsia.datastandards.ecds.NeonatalLevelOfCareCodeType.Enum getNeonatalLevelOfCareCode()
        {
            synchronized (monitor())
            {
                check_orphaned();
                org.apache.xmlbeans.SimpleValue target = null;
                target = (org.apache.xmlbeans.SimpleValue)get_store().find_element_user(NEONATALLEVELOFCARECODE$6, 0);
                if (target == null)
                {
                    return null;
                }
                return (uk.nhs.nhsia.datastandards.ecds.NeonatalLevelOfCareCodeType.Enum)target.getEnumValue();
            }
        }
        
        /**
         * Gets (as xml) the "NeonatalLevelOfCareCode" element
         */
        public uk.nhs.nhsia.datastandards.ecds.NeonatalLevelOfCareCodeType xgetNeonatalLevelOfCareCode()
        {
            synchronized (monitor())
            {
                check_orphaned();
                uk.nhs.nhsia.datastandards.ecds.NeonatalLevelOfCareCodeType target = null;
                target = (uk.nhs.nhsia.datastandards.ecds.NeonatalLevelOfCareCodeType)get_store().find_element_user(NEONATALLEVELOFCARECODE$6, 0);
                return target;
            }
        }
        
        /**
         * True if has "NeonatalLevelOfCareCode" element
         */
        public boolean isSetNeonatalLevelOfCareCode()
        {
            synchronized (monitor())
            {
                check_orphaned();
                return get_store().count_elements(NEONATALLEVELOFCARECODE$6) != 0;
            }
        }
        
        /**
         * Sets the "NeonatalLevelOfCareCode" element
         */
        public void setNeonatalLevelOfCareCode(uk.nhs.nhsia.datastandards.ecds.NeonatalLevelOfCareCodeType.Enum neonatalLevelOfCareCode)
        {
            synchronized (monitor())
            {
                check_orphaned();
                org.apache.xmlbeans.SimpleValue target = null;
                target = (org.apache.xmlbeans.SimpleValue)get_store().find_element_user(NEONATALLEVELOFCARECODE$6, 0);
                if (target == null)
                {
                    target = (org.apache.xmlbeans.SimpleValue)get_store().add_element_user(NEONATALLEVELOFCARECODE$6);
                }
                target.setEnumValue(neonatalLevelOfCareCode);
            }
        }
        
        /**
         * Sets (as xml) the "NeonatalLevelOfCareCode" element
         */
        public void xsetNeonatalLevelOfCareCode(uk.nhs.nhsia.datastandards.ecds.NeonatalLevelOfCareCodeType neonatalLevelOfCareCode)
        {
            synchronized (monitor())
            {
                check_orphaned();
                uk.nhs.nhsia.datastandards.ecds.NeonatalLevelOfCareCodeType target = null;
                target = (uk.nhs.nhsia.datastandards.ecds.NeonatalLevelOfCareCodeType)get_store().find_element_user(NEONATALLEVELOFCARECODE$6, 0);
                if (target == null)
                {
                    target = (uk.nhs.nhsia.datastandards.ecds.NeonatalLevelOfCareCodeType)get_store().add_element_user(NEONATALLEVELOFCARECODE$6);
                }
                target.set(neonatalLevelOfCareCode);
            }
        }
        
        /**
         * Unsets the "NeonatalLevelOfCareCode" element
         */
        public void unsetNeonatalLevelOfCareCode()
        {
            synchronized (monitor())
            {
                check_orphaned();
                get_store().remove_element(NEONATALLEVELOFCARECODE$6, 0);
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
                target = (org.apache.xmlbeans.SimpleValue)get_store().find_element_user(STARTDATEEPISODE$8, 0);
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
                target = (uk.nhs.nhsia.datastandards.ecds.StartDateEpisodeType)get_store().find_element_user(STARTDATEEPISODE$8, 0);
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
                target = (org.apache.xmlbeans.SimpleValue)get_store().find_element_user(STARTDATEEPISODE$8, 0);
                if (target == null)
                {
                    target = (org.apache.xmlbeans.SimpleValue)get_store().add_element_user(STARTDATEEPISODE$8);
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
                target = (uk.nhs.nhsia.datastandards.ecds.StartDateEpisodeType)get_store().find_element_user(STARTDATEEPISODE$8, 0);
                if (target == null)
                {
                    target = (uk.nhs.nhsia.datastandards.ecds.StartDateEpisodeType)get_store().add_element_user(STARTDATEEPISODE$8);
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
                target = (org.apache.xmlbeans.SimpleValue)get_store().find_element_user(STARTTIMEEPISODE$10, 0);
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
                target = (uk.nhs.nhsia.datastandards.ecds.StartTimeEpisodeType)get_store().find_element_user(STARTTIMEEPISODE$10, 0);
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
                return get_store().count_elements(STARTTIMEEPISODE$10) != 0;
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
                target = (org.apache.xmlbeans.SimpleValue)get_store().find_element_user(STARTTIMEEPISODE$10, 0);
                if (target == null)
                {
                    target = (org.apache.xmlbeans.SimpleValue)get_store().add_element_user(STARTTIMEEPISODE$10);
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
                target = (uk.nhs.nhsia.datastandards.ecds.StartTimeEpisodeType)get_store().find_element_user(STARTTIMEEPISODE$10, 0);
                if (target == null)
                {
                    target = (uk.nhs.nhsia.datastandards.ecds.StartTimeEpisodeType)get_store().add_element_user(STARTTIMEEPISODE$10);
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
                get_store().remove_element(STARTTIMEEPISODE$10, 0);
            }
        }
        
        /**
         * Gets the "EndDate_Episode" element
         */
        public java.util.Calendar getEndDateEpisode()
        {
            synchronized (monitor())
            {
                check_orphaned();
                org.apache.xmlbeans.SimpleValue target = null;
                target = (org.apache.xmlbeans.SimpleValue)get_store().find_element_user(ENDDATEEPISODE$12, 0);
                if (target == null)
                {
                    return null;
                }
                return target.getCalendarValue();
            }
        }
        
        /**
         * Gets (as xml) the "EndDate_Episode" element
         */
        public uk.nhs.nhsia.datastandards.ecds.EndDateEpisodeType xgetEndDateEpisode()
        {
            synchronized (monitor())
            {
                check_orphaned();
                uk.nhs.nhsia.datastandards.ecds.EndDateEpisodeType target = null;
                target = (uk.nhs.nhsia.datastandards.ecds.EndDateEpisodeType)get_store().find_element_user(ENDDATEEPISODE$12, 0);
                return target;
            }
        }
        
        /**
         * Sets the "EndDate_Episode" element
         */
        public void setEndDateEpisode(java.util.Calendar endDateEpisode)
        {
            synchronized (monitor())
            {
                check_orphaned();
                org.apache.xmlbeans.SimpleValue target = null;
                target = (org.apache.xmlbeans.SimpleValue)get_store().find_element_user(ENDDATEEPISODE$12, 0);
                if (target == null)
                {
                    target = (org.apache.xmlbeans.SimpleValue)get_store().add_element_user(ENDDATEEPISODE$12);
                }
                target.setCalendarValue(endDateEpisode);
            }
        }
        
        /**
         * Sets (as xml) the "EndDate_Episode" element
         */
        public void xsetEndDateEpisode(uk.nhs.nhsia.datastandards.ecds.EndDateEpisodeType endDateEpisode)
        {
            synchronized (monitor())
            {
                check_orphaned();
                uk.nhs.nhsia.datastandards.ecds.EndDateEpisodeType target = null;
                target = (uk.nhs.nhsia.datastandards.ecds.EndDateEpisodeType)get_store().find_element_user(ENDDATEEPISODE$12, 0);
                if (target == null)
                {
                    target = (uk.nhs.nhsia.datastandards.ecds.EndDateEpisodeType)get_store().add_element_user(ENDDATEEPISODE$12);
                }
                target.set(endDateEpisode);
            }
        }
        
        /**
         * Gets the "EndTime_Episode" element
         */
        public java.util.Calendar getEndTimeEpisode()
        {
            synchronized (monitor())
            {
                check_orphaned();
                org.apache.xmlbeans.SimpleValue target = null;
                target = (org.apache.xmlbeans.SimpleValue)get_store().find_element_user(ENDTIMEEPISODE$14, 0);
                if (target == null)
                {
                    return null;
                }
                return target.getCalendarValue();
            }
        }
        
        /**
         * Gets (as xml) the "EndTime_Episode" element
         */
        public uk.nhs.nhsia.datastandards.ecds.EndTimeEpisodeType xgetEndTimeEpisode()
        {
            synchronized (monitor())
            {
                check_orphaned();
                uk.nhs.nhsia.datastandards.ecds.EndTimeEpisodeType target = null;
                target = (uk.nhs.nhsia.datastandards.ecds.EndTimeEpisodeType)get_store().find_element_user(ENDTIMEEPISODE$14, 0);
                return target;
            }
        }
        
        /**
         * True if has "EndTime_Episode" element
         */
        public boolean isSetEndTimeEpisode()
        {
            synchronized (monitor())
            {
                check_orphaned();
                return get_store().count_elements(ENDTIMEEPISODE$14) != 0;
            }
        }
        
        /**
         * Sets the "EndTime_Episode" element
         */
        public void setEndTimeEpisode(java.util.Calendar endTimeEpisode)
        {
            synchronized (monitor())
            {
                check_orphaned();
                org.apache.xmlbeans.SimpleValue target = null;
                target = (org.apache.xmlbeans.SimpleValue)get_store().find_element_user(ENDTIMEEPISODE$14, 0);
                if (target == null)
                {
                    target = (org.apache.xmlbeans.SimpleValue)get_store().add_element_user(ENDTIMEEPISODE$14);
                }
                target.setCalendarValue(endTimeEpisode);
            }
        }
        
        /**
         * Sets (as xml) the "EndTime_Episode" element
         */
        public void xsetEndTimeEpisode(uk.nhs.nhsia.datastandards.ecds.EndTimeEpisodeType endTimeEpisode)
        {
            synchronized (monitor())
            {
                check_orphaned();
                uk.nhs.nhsia.datastandards.ecds.EndTimeEpisodeType target = null;
                target = (uk.nhs.nhsia.datastandards.ecds.EndTimeEpisodeType)get_store().find_element_user(ENDTIMEEPISODE$14, 0);
                if (target == null)
                {
                    target = (uk.nhs.nhsia.datastandards.ecds.EndTimeEpisodeType)get_store().add_element_user(ENDTIMEEPISODE$14);
                }
                target.set(endTimeEpisode);
            }
        }
        
        /**
         * Unsets the "EndTime_Episode" element
         */
        public void unsetEndTimeEpisode()
        {
            synchronized (monitor())
            {
                check_orphaned();
                get_store().remove_element(ENDTIMEEPISODE$14, 0);
            }
        }
        
        /**
         * Gets the "AgeAtCDSActivityDate" element
         */
        public int getAgeAtCDSActivityDate()
        {
            synchronized (monitor())
            {
                check_orphaned();
                org.apache.xmlbeans.SimpleValue target = null;
                target = (org.apache.xmlbeans.SimpleValue)get_store().find_element_user(AGEATCDSACTIVITYDATE$16, 0);
                if (target == null)
                {
                    return 0;
                }
                return target.getIntValue();
            }
        }
        
        /**
         * Gets (as xml) the "AgeAtCDSActivityDate" element
         */
        public uk.nhs.nhsia.datastandards.ecds.AgeAtCDSActivityDateType xgetAgeAtCDSActivityDate()
        {
            synchronized (monitor())
            {
                check_orphaned();
                uk.nhs.nhsia.datastandards.ecds.AgeAtCDSActivityDateType target = null;
                target = (uk.nhs.nhsia.datastandards.ecds.AgeAtCDSActivityDateType)get_store().find_element_user(AGEATCDSACTIVITYDATE$16, 0);
                return target;
            }
        }
        
        /**
         * Sets the "AgeAtCDSActivityDate" element
         */
        public void setAgeAtCDSActivityDate(int ageAtCDSActivityDate)
        {
            synchronized (monitor())
            {
                check_orphaned();
                org.apache.xmlbeans.SimpleValue target = null;
                target = (org.apache.xmlbeans.SimpleValue)get_store().find_element_user(AGEATCDSACTIVITYDATE$16, 0);
                if (target == null)
                {
                    target = (org.apache.xmlbeans.SimpleValue)get_store().add_element_user(AGEATCDSACTIVITYDATE$16);
                }
                target.setIntValue(ageAtCDSActivityDate);
            }
        }
        
        /**
         * Sets (as xml) the "AgeAtCDSActivityDate" element
         */
        public void xsetAgeAtCDSActivityDate(uk.nhs.nhsia.datastandards.ecds.AgeAtCDSActivityDateType ageAtCDSActivityDate)
        {
            synchronized (monitor())
            {
                check_orphaned();
                uk.nhs.nhsia.datastandards.ecds.AgeAtCDSActivityDateType target = null;
                target = (uk.nhs.nhsia.datastandards.ecds.AgeAtCDSActivityDateType)get_store().find_element_user(AGEATCDSACTIVITYDATE$16, 0);
                if (target == null)
                {
                    target = (uk.nhs.nhsia.datastandards.ecds.AgeAtCDSActivityDateType)get_store().add_element_user(AGEATCDSACTIVITYDATE$16);
                }
                target.set(ageAtCDSActivityDate);
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
                get_store().find_all_element_users(OVERSEASVISITORSTATUS$18, targetList);
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
                target = (uk.nhs.nhsia.datastandards.ecds.OverseasVisitorStatusStructure)get_store().find_element_user(OVERSEASVISITORSTATUS$18, i);
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
                return get_store().count_elements(OVERSEASVISITORSTATUS$18);
            }
        }
        
        /**
         * Sets array of all "OverseasVisitorStatus" element  WARNING: This method is not atomicaly synchronized.
         */
        public void setOverseasVisitorStatusArray(uk.nhs.nhsia.datastandards.ecds.OverseasVisitorStatusStructure[] overseasVisitorStatusArray)
        {
            check_orphaned();
            arraySetterHelper(overseasVisitorStatusArray, OVERSEASVISITORSTATUS$18);
        }
        
        /**
         * Sets ith "OverseasVisitorStatus" element
         */
        public void setOverseasVisitorStatusArray(int i, uk.nhs.nhsia.datastandards.ecds.OverseasVisitorStatusStructure overseasVisitorStatus)
        {
            generatedSetterHelperImpl(overseasVisitorStatus, OVERSEASVISITORSTATUS$18, i, org.apache.xmlbeans.impl.values.XmlObjectBase.KIND_SETTERHELPER_ARRAYITEM);
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
                target = (uk.nhs.nhsia.datastandards.ecds.OverseasVisitorStatusStructure)get_store().insert_element_user(OVERSEASVISITORSTATUS$18, i);
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
                target = (uk.nhs.nhsia.datastandards.ecds.OverseasVisitorStatusStructure)get_store().add_element_user(OVERSEASVISITORSTATUS$18);
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
                get_store().remove_element(OVERSEASVISITORSTATUS$18, i);
            }
        }
    }
}
