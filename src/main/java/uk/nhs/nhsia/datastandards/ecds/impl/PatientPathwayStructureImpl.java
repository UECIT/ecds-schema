/*
 * XML Type:  PatientPathway_Structure
 * Namespace: http://www.nhsia.nhs.uk/DataStandards/XMLschema/CDS/ns
 * Java type: uk.nhs.nhsia.datastandards.ecds.PatientPathwayStructure
 *
 * Automatically generated - do not modify.
 */
package uk.nhs.nhsia.datastandards.ecds.impl;
/**
 * An XML PatientPathway_Structure(@http://www.nhsia.nhs.uk/DataStandards/XMLschema/CDS/ns).
 *
 * This is a complex type.
 */
public class PatientPathwayStructureImpl extends org.apache.xmlbeans.impl.values.XmlComplexContentImpl implements uk.nhs.nhsia.datastandards.ecds.PatientPathwayStructure
{
    private static final long serialVersionUID = 1L;
    
    public PatientPathwayStructureImpl(org.apache.xmlbeans.SchemaType sType)
    {
        super(sType);
    }
    
    private static final javax.xml.namespace.QName PATIENTPATHWAYIDENTITY$0 = 
        new javax.xml.namespace.QName("http://www.nhsia.nhs.uk/DataStandards/XMLschema/CDS/ns", "PatientPathwayIdentity");
    private static final javax.xml.namespace.QName RTTPERIODCHARACTERISTICS$2 = 
        new javax.xml.namespace.QName("http://www.nhsia.nhs.uk/DataStandards/XMLschema/CDS/ns", "RTTPeriodCharacteristics");
    
    
    /**
     * Gets the "PatientPathwayIdentity" element
     */
    public uk.nhs.nhsia.datastandards.ecds.PatientPathwayStructure.PatientPathwayIdentity getPatientPathwayIdentity()
    {
        synchronized (monitor())
        {
            check_orphaned();
            uk.nhs.nhsia.datastandards.ecds.PatientPathwayStructure.PatientPathwayIdentity target = null;
            target = (uk.nhs.nhsia.datastandards.ecds.PatientPathwayStructure.PatientPathwayIdentity)get_store().find_element_user(PATIENTPATHWAYIDENTITY$0, 0);
            if (target == null)
            {
                return null;
            }
            return target;
        }
    }
    
    /**
     * Sets the "PatientPathwayIdentity" element
     */
    public void setPatientPathwayIdentity(uk.nhs.nhsia.datastandards.ecds.PatientPathwayStructure.PatientPathwayIdentity patientPathwayIdentity)
    {
        generatedSetterHelperImpl(patientPathwayIdentity, PATIENTPATHWAYIDENTITY$0, 0, org.apache.xmlbeans.impl.values.XmlObjectBase.KIND_SETTERHELPER_SINGLETON);
    }
    
    /**
     * Appends and returns a new empty "PatientPathwayIdentity" element
     */
    public uk.nhs.nhsia.datastandards.ecds.PatientPathwayStructure.PatientPathwayIdentity addNewPatientPathwayIdentity()
    {
        synchronized (monitor())
        {
            check_orphaned();
            uk.nhs.nhsia.datastandards.ecds.PatientPathwayStructure.PatientPathwayIdentity target = null;
            target = (uk.nhs.nhsia.datastandards.ecds.PatientPathwayStructure.PatientPathwayIdentity)get_store().add_element_user(PATIENTPATHWAYIDENTITY$0);
            return target;
        }
    }
    
    /**
     * Gets the "RTTPeriodCharacteristics" element
     */
    public uk.nhs.nhsia.datastandards.ecds.PatientPathwayStructure.RTTPeriodCharacteristics getRTTPeriodCharacteristics()
    {
        synchronized (monitor())
        {
            check_orphaned();
            uk.nhs.nhsia.datastandards.ecds.PatientPathwayStructure.RTTPeriodCharacteristics target = null;
            target = (uk.nhs.nhsia.datastandards.ecds.PatientPathwayStructure.RTTPeriodCharacteristics)get_store().find_element_user(RTTPERIODCHARACTERISTICS$2, 0);
            if (target == null)
            {
                return null;
            }
            return target;
        }
    }
    
    /**
     * Sets the "RTTPeriodCharacteristics" element
     */
    public void setRTTPeriodCharacteristics(uk.nhs.nhsia.datastandards.ecds.PatientPathwayStructure.RTTPeriodCharacteristics rttPeriodCharacteristics)
    {
        generatedSetterHelperImpl(rttPeriodCharacteristics, RTTPERIODCHARACTERISTICS$2, 0, org.apache.xmlbeans.impl.values.XmlObjectBase.KIND_SETTERHELPER_SINGLETON);
    }
    
    /**
     * Appends and returns a new empty "RTTPeriodCharacteristics" element
     */
    public uk.nhs.nhsia.datastandards.ecds.PatientPathwayStructure.RTTPeriodCharacteristics addNewRTTPeriodCharacteristics()
    {
        synchronized (monitor())
        {
            check_orphaned();
            uk.nhs.nhsia.datastandards.ecds.PatientPathwayStructure.RTTPeriodCharacteristics target = null;
            target = (uk.nhs.nhsia.datastandards.ecds.PatientPathwayStructure.RTTPeriodCharacteristics)get_store().add_element_user(RTTPERIODCHARACTERISTICS$2);
            return target;
        }
    }
    /**
     * An XML PatientPathwayIdentity(@http://www.nhsia.nhs.uk/DataStandards/XMLschema/CDS/ns).
     *
     * This is a complex type.
     */
    public static class PatientPathwayIdentityImpl extends org.apache.xmlbeans.impl.values.XmlComplexContentImpl implements uk.nhs.nhsia.datastandards.ecds.PatientPathwayStructure.PatientPathwayIdentity
    {
        private static final long serialVersionUID = 1L;
        
        public PatientPathwayIdentityImpl(org.apache.xmlbeans.SchemaType sType)
        {
            super(sType);
        }
        
        private static final javax.xml.namespace.QName UNIQUEBOOKINGREFERENCENUMBERCONVERTED$0 = 
            new javax.xml.namespace.QName("http://www.nhsia.nhs.uk/DataStandards/XMLschema/CDS/ns", "UniqueBookingReferenceNumber_Converted");
        private static final javax.xml.namespace.QName PATIENTPATHWAYIDENTIFIER$2 = 
            new javax.xml.namespace.QName("http://www.nhsia.nhs.uk/DataStandards/XMLschema/CDS/ns", "PatientPathwayIdentifier");
        private static final javax.xml.namespace.QName ORGANISATIONCODEPATIENTPATHWAYIDENTIFIERISSUER$4 = 
            new javax.xml.namespace.QName("http://www.nhsia.nhs.uk/DataStandards/XMLschema/CDS/ns", "OrganisationCode_PatientPathwayIdentifierIssuer");
        
        
        /**
         * Gets the "UniqueBookingReferenceNumber_Converted" element
         */
        public java.lang.String getUniqueBookingReferenceNumberConverted()
        {
            synchronized (monitor())
            {
                check_orphaned();
                org.apache.xmlbeans.SimpleValue target = null;
                target = (org.apache.xmlbeans.SimpleValue)get_store().find_element_user(UNIQUEBOOKINGREFERENCENUMBERCONVERTED$0, 0);
                if (target == null)
                {
                    return null;
                }
                return target.getStringValue();
            }
        }
        
        /**
         * Gets (as xml) the "UniqueBookingReferenceNumber_Converted" element
         */
        public uk.nhs.nhsia.datastandards.ecds.UBRNConvertedType xgetUniqueBookingReferenceNumberConverted()
        {
            synchronized (monitor())
            {
                check_orphaned();
                uk.nhs.nhsia.datastandards.ecds.UBRNConvertedType target = null;
                target = (uk.nhs.nhsia.datastandards.ecds.UBRNConvertedType)get_store().find_element_user(UNIQUEBOOKINGREFERENCENUMBERCONVERTED$0, 0);
                return target;
            }
        }
        
        /**
         * True if has "UniqueBookingReferenceNumber_Converted" element
         */
        public boolean isSetUniqueBookingReferenceNumberConverted()
        {
            synchronized (monitor())
            {
                check_orphaned();
                return get_store().count_elements(UNIQUEBOOKINGREFERENCENUMBERCONVERTED$0) != 0;
            }
        }
        
        /**
         * Sets the "UniqueBookingReferenceNumber_Converted" element
         */
        public void setUniqueBookingReferenceNumberConverted(java.lang.String uniqueBookingReferenceNumberConverted)
        {
            synchronized (monitor())
            {
                check_orphaned();
                org.apache.xmlbeans.SimpleValue target = null;
                target = (org.apache.xmlbeans.SimpleValue)get_store().find_element_user(UNIQUEBOOKINGREFERENCENUMBERCONVERTED$0, 0);
                if (target == null)
                {
                    target = (org.apache.xmlbeans.SimpleValue)get_store().add_element_user(UNIQUEBOOKINGREFERENCENUMBERCONVERTED$0);
                }
                target.setStringValue(uniqueBookingReferenceNumberConverted);
            }
        }
        
        /**
         * Sets (as xml) the "UniqueBookingReferenceNumber_Converted" element
         */
        public void xsetUniqueBookingReferenceNumberConverted(uk.nhs.nhsia.datastandards.ecds.UBRNConvertedType uniqueBookingReferenceNumberConverted)
        {
            synchronized (monitor())
            {
                check_orphaned();
                uk.nhs.nhsia.datastandards.ecds.UBRNConvertedType target = null;
                target = (uk.nhs.nhsia.datastandards.ecds.UBRNConvertedType)get_store().find_element_user(UNIQUEBOOKINGREFERENCENUMBERCONVERTED$0, 0);
                if (target == null)
                {
                    target = (uk.nhs.nhsia.datastandards.ecds.UBRNConvertedType)get_store().add_element_user(UNIQUEBOOKINGREFERENCENUMBERCONVERTED$0);
                }
                target.set(uniqueBookingReferenceNumberConverted);
            }
        }
        
        /**
         * Unsets the "UniqueBookingReferenceNumber_Converted" element
         */
        public void unsetUniqueBookingReferenceNumberConverted()
        {
            synchronized (monitor())
            {
                check_orphaned();
                get_store().remove_element(UNIQUEBOOKINGREFERENCENUMBERCONVERTED$0, 0);
            }
        }
        
        /**
         * Gets the "PatientPathwayIdentifier" element
         */
        public java.lang.String getPatientPathwayIdentifier()
        {
            synchronized (monitor())
            {
                check_orphaned();
                org.apache.xmlbeans.SimpleValue target = null;
                target = (org.apache.xmlbeans.SimpleValue)get_store().find_element_user(PATIENTPATHWAYIDENTIFIER$2, 0);
                if (target == null)
                {
                    return null;
                }
                return target.getStringValue();
            }
        }
        
        /**
         * Gets (as xml) the "PatientPathwayIdentifier" element
         */
        public uk.nhs.nhsia.datastandards.ecds.PatientPathwayIdentifierType xgetPatientPathwayIdentifier()
        {
            synchronized (monitor())
            {
                check_orphaned();
                uk.nhs.nhsia.datastandards.ecds.PatientPathwayIdentifierType target = null;
                target = (uk.nhs.nhsia.datastandards.ecds.PatientPathwayIdentifierType)get_store().find_element_user(PATIENTPATHWAYIDENTIFIER$2, 0);
                return target;
            }
        }
        
        /**
         * True if has "PatientPathwayIdentifier" element
         */
        public boolean isSetPatientPathwayIdentifier()
        {
            synchronized (monitor())
            {
                check_orphaned();
                return get_store().count_elements(PATIENTPATHWAYIDENTIFIER$2) != 0;
            }
        }
        
        /**
         * Sets the "PatientPathwayIdentifier" element
         */
        public void setPatientPathwayIdentifier(java.lang.String patientPathwayIdentifier)
        {
            synchronized (monitor())
            {
                check_orphaned();
                org.apache.xmlbeans.SimpleValue target = null;
                target = (org.apache.xmlbeans.SimpleValue)get_store().find_element_user(PATIENTPATHWAYIDENTIFIER$2, 0);
                if (target == null)
                {
                    target = (org.apache.xmlbeans.SimpleValue)get_store().add_element_user(PATIENTPATHWAYIDENTIFIER$2);
                }
                target.setStringValue(patientPathwayIdentifier);
            }
        }
        
        /**
         * Sets (as xml) the "PatientPathwayIdentifier" element
         */
        public void xsetPatientPathwayIdentifier(uk.nhs.nhsia.datastandards.ecds.PatientPathwayIdentifierType patientPathwayIdentifier)
        {
            synchronized (monitor())
            {
                check_orphaned();
                uk.nhs.nhsia.datastandards.ecds.PatientPathwayIdentifierType target = null;
                target = (uk.nhs.nhsia.datastandards.ecds.PatientPathwayIdentifierType)get_store().find_element_user(PATIENTPATHWAYIDENTIFIER$2, 0);
                if (target == null)
                {
                    target = (uk.nhs.nhsia.datastandards.ecds.PatientPathwayIdentifierType)get_store().add_element_user(PATIENTPATHWAYIDENTIFIER$2);
                }
                target.set(patientPathwayIdentifier);
            }
        }
        
        /**
         * Unsets the "PatientPathwayIdentifier" element
         */
        public void unsetPatientPathwayIdentifier()
        {
            synchronized (monitor())
            {
                check_orphaned();
                get_store().remove_element(PATIENTPATHWAYIDENTIFIER$2, 0);
            }
        }
        
        /**
         * Gets the "OrganisationCode_PatientPathwayIdentifierIssuer" element
         */
        public java.lang.String getOrganisationCodePatientPathwayIdentifierIssuer()
        {
            synchronized (monitor())
            {
                check_orphaned();
                org.apache.xmlbeans.SimpleValue target = null;
                target = (org.apache.xmlbeans.SimpleValue)get_store().find_element_user(ORGANISATIONCODEPATIENTPATHWAYIDENTIFIERISSUER$4, 0);
                if (target == null)
                {
                    return null;
                }
                return target.getStringValue();
            }
        }
        
        /**
         * Gets (as xml) the "OrganisationCode_PatientPathwayIdentifierIssuer" element
         */
        public uk.nhs.nhsia.datastandards.ecds.OrganisationCodePatientPathwayIdentifierIssuerType xgetOrganisationCodePatientPathwayIdentifierIssuer()
        {
            synchronized (monitor())
            {
                check_orphaned();
                uk.nhs.nhsia.datastandards.ecds.OrganisationCodePatientPathwayIdentifierIssuerType target = null;
                target = (uk.nhs.nhsia.datastandards.ecds.OrganisationCodePatientPathwayIdentifierIssuerType)get_store().find_element_user(ORGANISATIONCODEPATIENTPATHWAYIDENTIFIERISSUER$4, 0);
                return target;
            }
        }
        
        /**
         * Sets the "OrganisationCode_PatientPathwayIdentifierIssuer" element
         */
        public void setOrganisationCodePatientPathwayIdentifierIssuer(java.lang.String organisationCodePatientPathwayIdentifierIssuer)
        {
            synchronized (monitor())
            {
                check_orphaned();
                org.apache.xmlbeans.SimpleValue target = null;
                target = (org.apache.xmlbeans.SimpleValue)get_store().find_element_user(ORGANISATIONCODEPATIENTPATHWAYIDENTIFIERISSUER$4, 0);
                if (target == null)
                {
                    target = (org.apache.xmlbeans.SimpleValue)get_store().add_element_user(ORGANISATIONCODEPATIENTPATHWAYIDENTIFIERISSUER$4);
                }
                target.setStringValue(organisationCodePatientPathwayIdentifierIssuer);
            }
        }
        
        /**
         * Sets (as xml) the "OrganisationCode_PatientPathwayIdentifierIssuer" element
         */
        public void xsetOrganisationCodePatientPathwayIdentifierIssuer(uk.nhs.nhsia.datastandards.ecds.OrganisationCodePatientPathwayIdentifierIssuerType organisationCodePatientPathwayIdentifierIssuer)
        {
            synchronized (monitor())
            {
                check_orphaned();
                uk.nhs.nhsia.datastandards.ecds.OrganisationCodePatientPathwayIdentifierIssuerType target = null;
                target = (uk.nhs.nhsia.datastandards.ecds.OrganisationCodePatientPathwayIdentifierIssuerType)get_store().find_element_user(ORGANISATIONCODEPATIENTPATHWAYIDENTIFIERISSUER$4, 0);
                if (target == null)
                {
                    target = (uk.nhs.nhsia.datastandards.ecds.OrganisationCodePatientPathwayIdentifierIssuerType)get_store().add_element_user(ORGANISATIONCODEPATIENTPATHWAYIDENTIFIERISSUER$4);
                }
                target.set(organisationCodePatientPathwayIdentifierIssuer);
            }
        }
    }
    /**
     * An XML RTTPeriodCharacteristics(@http://www.nhsia.nhs.uk/DataStandards/XMLschema/CDS/ns).
     *
     * This is a complex type.
     */
    public static class RTTPeriodCharacteristicsImpl extends org.apache.xmlbeans.impl.values.XmlComplexContentImpl implements uk.nhs.nhsia.datastandards.ecds.PatientPathwayStructure.RTTPeriodCharacteristics
    {
        private static final long serialVersionUID = 1L;
        
        public RTTPeriodCharacteristicsImpl(org.apache.xmlbeans.SchemaType sType)
        {
            super(sType);
        }
        
        private static final javax.xml.namespace.QName REFERRALTOTREATMENTPERIODSTATUS$0 = 
            new javax.xml.namespace.QName("http://www.nhsia.nhs.uk/DataStandards/XMLschema/CDS/ns", "ReferralToTreatmentPeriod_Status");
        private static final javax.xml.namespace.QName WAITINGTIMEMEASUREMENTTYPE$2 = 
            new javax.xml.namespace.QName("http://www.nhsia.nhs.uk/DataStandards/XMLschema/CDS/ns", "WaitingTimeMeasurementType");
        private static final javax.xml.namespace.QName REFERRALTOTREATMENTPERIODSTARTDATE$4 = 
            new javax.xml.namespace.QName("http://www.nhsia.nhs.uk/DataStandards/XMLschema/CDS/ns", "ReferralToTreatmentPeriod_StartDate");
        private static final javax.xml.namespace.QName REFERRALTOTREATMENTPERIODENDDATE$6 = 
            new javax.xml.namespace.QName("http://www.nhsia.nhs.uk/DataStandards/XMLschema/CDS/ns", "ReferralToTreatmentPeriod_EndDate");
        
        
        /**
         * Gets the "ReferralToTreatmentPeriod_Status" element
         */
        public uk.nhs.nhsia.datastandards.ecds.ReferralToTreatmentPeriodStatusType.Enum getReferralToTreatmentPeriodStatus()
        {
            synchronized (monitor())
            {
                check_orphaned();
                org.apache.xmlbeans.SimpleValue target = null;
                target = (org.apache.xmlbeans.SimpleValue)get_store().find_element_user(REFERRALTOTREATMENTPERIODSTATUS$0, 0);
                if (target == null)
                {
                    return null;
                }
                return (uk.nhs.nhsia.datastandards.ecds.ReferralToTreatmentPeriodStatusType.Enum)target.getEnumValue();
            }
        }
        
        /**
         * Gets (as xml) the "ReferralToTreatmentPeriod_Status" element
         */
        public uk.nhs.nhsia.datastandards.ecds.ReferralToTreatmentPeriodStatusType xgetReferralToTreatmentPeriodStatus()
        {
            synchronized (monitor())
            {
                check_orphaned();
                uk.nhs.nhsia.datastandards.ecds.ReferralToTreatmentPeriodStatusType target = null;
                target = (uk.nhs.nhsia.datastandards.ecds.ReferralToTreatmentPeriodStatusType)get_store().find_element_user(REFERRALTOTREATMENTPERIODSTATUS$0, 0);
                return target;
            }
        }
        
        /**
         * Sets the "ReferralToTreatmentPeriod_Status" element
         */
        public void setReferralToTreatmentPeriodStatus(uk.nhs.nhsia.datastandards.ecds.ReferralToTreatmentPeriodStatusType.Enum referralToTreatmentPeriodStatus)
        {
            synchronized (monitor())
            {
                check_orphaned();
                org.apache.xmlbeans.SimpleValue target = null;
                target = (org.apache.xmlbeans.SimpleValue)get_store().find_element_user(REFERRALTOTREATMENTPERIODSTATUS$0, 0);
                if (target == null)
                {
                    target = (org.apache.xmlbeans.SimpleValue)get_store().add_element_user(REFERRALTOTREATMENTPERIODSTATUS$0);
                }
                target.setEnumValue(referralToTreatmentPeriodStatus);
            }
        }
        
        /**
         * Sets (as xml) the "ReferralToTreatmentPeriod_Status" element
         */
        public void xsetReferralToTreatmentPeriodStatus(uk.nhs.nhsia.datastandards.ecds.ReferralToTreatmentPeriodStatusType referralToTreatmentPeriodStatus)
        {
            synchronized (monitor())
            {
                check_orphaned();
                uk.nhs.nhsia.datastandards.ecds.ReferralToTreatmentPeriodStatusType target = null;
                target = (uk.nhs.nhsia.datastandards.ecds.ReferralToTreatmentPeriodStatusType)get_store().find_element_user(REFERRALTOTREATMENTPERIODSTATUS$0, 0);
                if (target == null)
                {
                    target = (uk.nhs.nhsia.datastandards.ecds.ReferralToTreatmentPeriodStatusType)get_store().add_element_user(REFERRALTOTREATMENTPERIODSTATUS$0);
                }
                target.set(referralToTreatmentPeriodStatus);
            }
        }
        
        /**
         * Gets the "WaitingTimeMeasurementType" element
         */
        public uk.nhs.nhsia.datastandards.ecds.WaitingTimeMeasurementTypeType.Enum getWaitingTimeMeasurementType()
        {
            synchronized (monitor())
            {
                check_orphaned();
                org.apache.xmlbeans.SimpleValue target = null;
                target = (org.apache.xmlbeans.SimpleValue)get_store().find_element_user(WAITINGTIMEMEASUREMENTTYPE$2, 0);
                if (target == null)
                {
                    return null;
                }
                return (uk.nhs.nhsia.datastandards.ecds.WaitingTimeMeasurementTypeType.Enum)target.getEnumValue();
            }
        }
        
        /**
         * Gets (as xml) the "WaitingTimeMeasurementType" element
         */
        public uk.nhs.nhsia.datastandards.ecds.WaitingTimeMeasurementTypeType xgetWaitingTimeMeasurementType()
        {
            synchronized (monitor())
            {
                check_orphaned();
                uk.nhs.nhsia.datastandards.ecds.WaitingTimeMeasurementTypeType target = null;
                target = (uk.nhs.nhsia.datastandards.ecds.WaitingTimeMeasurementTypeType)get_store().find_element_user(WAITINGTIMEMEASUREMENTTYPE$2, 0);
                return target;
            }
        }
        
        /**
         * Sets the "WaitingTimeMeasurementType" element
         */
        public void setWaitingTimeMeasurementType(uk.nhs.nhsia.datastandards.ecds.WaitingTimeMeasurementTypeType.Enum waitingTimeMeasurementType)
        {
            synchronized (monitor())
            {
                check_orphaned();
                org.apache.xmlbeans.SimpleValue target = null;
                target = (org.apache.xmlbeans.SimpleValue)get_store().find_element_user(WAITINGTIMEMEASUREMENTTYPE$2, 0);
                if (target == null)
                {
                    target = (org.apache.xmlbeans.SimpleValue)get_store().add_element_user(WAITINGTIMEMEASUREMENTTYPE$2);
                }
                target.setEnumValue(waitingTimeMeasurementType);
            }
        }
        
        /**
         * Sets (as xml) the "WaitingTimeMeasurementType" element
         */
        public void xsetWaitingTimeMeasurementType(uk.nhs.nhsia.datastandards.ecds.WaitingTimeMeasurementTypeType waitingTimeMeasurementType)
        {
            synchronized (monitor())
            {
                check_orphaned();
                uk.nhs.nhsia.datastandards.ecds.WaitingTimeMeasurementTypeType target = null;
                target = (uk.nhs.nhsia.datastandards.ecds.WaitingTimeMeasurementTypeType)get_store().find_element_user(WAITINGTIMEMEASUREMENTTYPE$2, 0);
                if (target == null)
                {
                    target = (uk.nhs.nhsia.datastandards.ecds.WaitingTimeMeasurementTypeType)get_store().add_element_user(WAITINGTIMEMEASUREMENTTYPE$2);
                }
                target.set(waitingTimeMeasurementType);
            }
        }
        
        /**
         * Gets the "ReferralToTreatmentPeriod_StartDate" element
         */
        public java.util.Calendar getReferralToTreatmentPeriodStartDate()
        {
            synchronized (monitor())
            {
                check_orphaned();
                org.apache.xmlbeans.SimpleValue target = null;
                target = (org.apache.xmlbeans.SimpleValue)get_store().find_element_user(REFERRALTOTREATMENTPERIODSTARTDATE$4, 0);
                if (target == null)
                {
                    return null;
                }
                return target.getCalendarValue();
            }
        }
        
        /**
         * Gets (as xml) the "ReferralToTreatmentPeriod_StartDate" element
         */
        public uk.nhs.nhsia.datastandards.ecds.ReferralToTreatmentPeriodStartDateType xgetReferralToTreatmentPeriodStartDate()
        {
            synchronized (monitor())
            {
                check_orphaned();
                uk.nhs.nhsia.datastandards.ecds.ReferralToTreatmentPeriodStartDateType target = null;
                target = (uk.nhs.nhsia.datastandards.ecds.ReferralToTreatmentPeriodStartDateType)get_store().find_element_user(REFERRALTOTREATMENTPERIODSTARTDATE$4, 0);
                return target;
            }
        }
        
        /**
         * True if has "ReferralToTreatmentPeriod_StartDate" element
         */
        public boolean isSetReferralToTreatmentPeriodStartDate()
        {
            synchronized (monitor())
            {
                check_orphaned();
                return get_store().count_elements(REFERRALTOTREATMENTPERIODSTARTDATE$4) != 0;
            }
        }
        
        /**
         * Sets the "ReferralToTreatmentPeriod_StartDate" element
         */
        public void setReferralToTreatmentPeriodStartDate(java.util.Calendar referralToTreatmentPeriodStartDate)
        {
            synchronized (monitor())
            {
                check_orphaned();
                org.apache.xmlbeans.SimpleValue target = null;
                target = (org.apache.xmlbeans.SimpleValue)get_store().find_element_user(REFERRALTOTREATMENTPERIODSTARTDATE$4, 0);
                if (target == null)
                {
                    target = (org.apache.xmlbeans.SimpleValue)get_store().add_element_user(REFERRALTOTREATMENTPERIODSTARTDATE$4);
                }
                target.setCalendarValue(referralToTreatmentPeriodStartDate);
            }
        }
        
        /**
         * Sets (as xml) the "ReferralToTreatmentPeriod_StartDate" element
         */
        public void xsetReferralToTreatmentPeriodStartDate(uk.nhs.nhsia.datastandards.ecds.ReferralToTreatmentPeriodStartDateType referralToTreatmentPeriodStartDate)
        {
            synchronized (monitor())
            {
                check_orphaned();
                uk.nhs.nhsia.datastandards.ecds.ReferralToTreatmentPeriodStartDateType target = null;
                target = (uk.nhs.nhsia.datastandards.ecds.ReferralToTreatmentPeriodStartDateType)get_store().find_element_user(REFERRALTOTREATMENTPERIODSTARTDATE$4, 0);
                if (target == null)
                {
                    target = (uk.nhs.nhsia.datastandards.ecds.ReferralToTreatmentPeriodStartDateType)get_store().add_element_user(REFERRALTOTREATMENTPERIODSTARTDATE$4);
                }
                target.set(referralToTreatmentPeriodStartDate);
            }
        }
        
        /**
         * Unsets the "ReferralToTreatmentPeriod_StartDate" element
         */
        public void unsetReferralToTreatmentPeriodStartDate()
        {
            synchronized (monitor())
            {
                check_orphaned();
                get_store().remove_element(REFERRALTOTREATMENTPERIODSTARTDATE$4, 0);
            }
        }
        
        /**
         * Gets the "ReferralToTreatmentPeriod_EndDate" element
         */
        public java.util.Calendar getReferralToTreatmentPeriodEndDate()
        {
            synchronized (monitor())
            {
                check_orphaned();
                org.apache.xmlbeans.SimpleValue target = null;
                target = (org.apache.xmlbeans.SimpleValue)get_store().find_element_user(REFERRALTOTREATMENTPERIODENDDATE$6, 0);
                if (target == null)
                {
                    return null;
                }
                return target.getCalendarValue();
            }
        }
        
        /**
         * Gets (as xml) the "ReferralToTreatmentPeriod_EndDate" element
         */
        public uk.nhs.nhsia.datastandards.ecds.ReferralToTreatmentPeriodEndDateType xgetReferralToTreatmentPeriodEndDate()
        {
            synchronized (monitor())
            {
                check_orphaned();
                uk.nhs.nhsia.datastandards.ecds.ReferralToTreatmentPeriodEndDateType target = null;
                target = (uk.nhs.nhsia.datastandards.ecds.ReferralToTreatmentPeriodEndDateType)get_store().find_element_user(REFERRALTOTREATMENTPERIODENDDATE$6, 0);
                return target;
            }
        }
        
        /**
         * True if has "ReferralToTreatmentPeriod_EndDate" element
         */
        public boolean isSetReferralToTreatmentPeriodEndDate()
        {
            synchronized (monitor())
            {
                check_orphaned();
                return get_store().count_elements(REFERRALTOTREATMENTPERIODENDDATE$6) != 0;
            }
        }
        
        /**
         * Sets the "ReferralToTreatmentPeriod_EndDate" element
         */
        public void setReferralToTreatmentPeriodEndDate(java.util.Calendar referralToTreatmentPeriodEndDate)
        {
            synchronized (monitor())
            {
                check_orphaned();
                org.apache.xmlbeans.SimpleValue target = null;
                target = (org.apache.xmlbeans.SimpleValue)get_store().find_element_user(REFERRALTOTREATMENTPERIODENDDATE$6, 0);
                if (target == null)
                {
                    target = (org.apache.xmlbeans.SimpleValue)get_store().add_element_user(REFERRALTOTREATMENTPERIODENDDATE$6);
                }
                target.setCalendarValue(referralToTreatmentPeriodEndDate);
            }
        }
        
        /**
         * Sets (as xml) the "ReferralToTreatmentPeriod_EndDate" element
         */
        public void xsetReferralToTreatmentPeriodEndDate(uk.nhs.nhsia.datastandards.ecds.ReferralToTreatmentPeriodEndDateType referralToTreatmentPeriodEndDate)
        {
            synchronized (monitor())
            {
                check_orphaned();
                uk.nhs.nhsia.datastandards.ecds.ReferralToTreatmentPeriodEndDateType target = null;
                target = (uk.nhs.nhsia.datastandards.ecds.ReferralToTreatmentPeriodEndDateType)get_store().find_element_user(REFERRALTOTREATMENTPERIODENDDATE$6, 0);
                if (target == null)
                {
                    target = (uk.nhs.nhsia.datastandards.ecds.ReferralToTreatmentPeriodEndDateType)get_store().add_element_user(REFERRALTOTREATMENTPERIODENDDATE$6);
                }
                target.set(referralToTreatmentPeriodEndDate);
            }
        }
        
        /**
         * Unsets the "ReferralToTreatmentPeriod_EndDate" element
         */
        public void unsetReferralToTreatmentPeriodEndDate()
        {
            synchronized (monitor())
            {
                check_orphaned();
                get_store().remove_element(REFERRALTOTREATMENTPERIODENDDATE$6, 0);
            }
        }
    }
}
