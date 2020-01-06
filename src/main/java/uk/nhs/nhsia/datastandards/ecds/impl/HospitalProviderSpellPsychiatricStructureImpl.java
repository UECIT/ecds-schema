/*
 * XML Type:  HospitalProviderSpellPsychiatric_Structure
 * Namespace: http://www.nhsia.nhs.uk/DataStandards/XMLschema/CDS/ns
 * Java type: uk.nhs.nhsia.datastandards.ecds.HospitalProviderSpellPsychiatricStructure
 *
 * Automatically generated - do not modify.
 */
package uk.nhs.nhsia.datastandards.ecds.impl;
/**
 * An XML HospitalProviderSpellPsychiatric_Structure(@http://www.nhsia.nhs.uk/DataStandards/XMLschema/CDS/ns).
 *
 * This is a complex type.
 */
public class HospitalProviderSpellPsychiatricStructureImpl extends org.apache.xmlbeans.impl.values.XmlComplexContentImpl implements uk.nhs.nhsia.datastandards.ecds.HospitalProviderSpellPsychiatricStructure
{
    private static final long serialVersionUID = 1L;
    
    public HospitalProviderSpellPsychiatricStructureImpl(org.apache.xmlbeans.SchemaType sType)
    {
        super(sType);
    }
    
    private static final javax.xml.namespace.QName ADMISSIONCHARACTERISTICS$0 = 
        new javax.xml.namespace.QName("http://www.nhsia.nhs.uk/DataStandards/XMLschema/CDS/ns", "AdmissionCharacteristics");
    
    
    /**
     * Gets the "AdmissionCharacteristics" element
     */
    public uk.nhs.nhsia.datastandards.ecds.HospitalProviderSpellPsychiatricStructure.AdmissionCharacteristics getAdmissionCharacteristics()
    {
        synchronized (monitor())
        {
            check_orphaned();
            uk.nhs.nhsia.datastandards.ecds.HospitalProviderSpellPsychiatricStructure.AdmissionCharacteristics target = null;
            target = (uk.nhs.nhsia.datastandards.ecds.HospitalProviderSpellPsychiatricStructure.AdmissionCharacteristics)get_store().find_element_user(ADMISSIONCHARACTERISTICS$0, 0);
            if (target == null)
            {
                return null;
            }
            return target;
        }
    }
    
    /**
     * Sets the "AdmissionCharacteristics" element
     */
    public void setAdmissionCharacteristics(uk.nhs.nhsia.datastandards.ecds.HospitalProviderSpellPsychiatricStructure.AdmissionCharacteristics admissionCharacteristics)
    {
        generatedSetterHelperImpl(admissionCharacteristics, ADMISSIONCHARACTERISTICS$0, 0, org.apache.xmlbeans.impl.values.XmlObjectBase.KIND_SETTERHELPER_SINGLETON);
    }
    
    /**
     * Appends and returns a new empty "AdmissionCharacteristics" element
     */
    public uk.nhs.nhsia.datastandards.ecds.HospitalProviderSpellPsychiatricStructure.AdmissionCharacteristics addNewAdmissionCharacteristics()
    {
        synchronized (monitor())
        {
            check_orphaned();
            uk.nhs.nhsia.datastandards.ecds.HospitalProviderSpellPsychiatricStructure.AdmissionCharacteristics target = null;
            target = (uk.nhs.nhsia.datastandards.ecds.HospitalProviderSpellPsychiatricStructure.AdmissionCharacteristics)get_store().add_element_user(ADMISSIONCHARACTERISTICS$0);
            return target;
        }
    }
    /**
     * An XML AdmissionCharacteristics(@http://www.nhsia.nhs.uk/DataStandards/XMLschema/CDS/ns).
     *
     * This is a complex type.
     */
    public static class AdmissionCharacteristicsImpl extends org.apache.xmlbeans.impl.values.XmlComplexContentImpl implements uk.nhs.nhsia.datastandards.ecds.HospitalProviderSpellPsychiatricStructure.AdmissionCharacteristics
    {
        private static final long serialVersionUID = 1L;
        
        public AdmissionCharacteristicsImpl(org.apache.xmlbeans.SchemaType sType)
        {
            super(sType);
        }
        
        private static final javax.xml.namespace.QName HOSPITALPROVIDERSPELLNUMBER$0 = 
            new javax.xml.namespace.QName("http://www.nhsia.nhs.uk/DataStandards/XMLschema/CDS/ns", "HospitalProviderSpellNumber");
        private static final javax.xml.namespace.QName ADMINISTRATIVECATEGORYCODEONADMISSION$2 = 
            new javax.xml.namespace.QName("http://www.nhsia.nhs.uk/DataStandards/XMLschema/CDS/ns", "AdministrativeCategoryCodeOnAdmission");
        private static final javax.xml.namespace.QName PATIENTCLASSIFICATIONCODE$4 = 
            new javax.xml.namespace.QName("http://www.nhsia.nhs.uk/DataStandards/XMLschema/CDS/ns", "PatientClassificationCode");
        private static final javax.xml.namespace.QName ADMISSIONMETHODCODEHOSPITALPROVIDERSPELL$6 = 
            new javax.xml.namespace.QName("http://www.nhsia.nhs.uk/DataStandards/XMLschema/CDS/ns", "AdmissionMethodCode_HospitalProviderSpell");
        private static final javax.xml.namespace.QName SOURCEOFADMISSIONCODEHOSPITALPROVIDERSPELL$8 = 
            new javax.xml.namespace.QName("http://www.nhsia.nhs.uk/DataStandards/XMLschema/CDS/ns", "SourceOfAdmissionCode_HospitalProviderSpell");
        private static final javax.xml.namespace.QName STARTDATEHOSPITALPROVIDERSPELL$10 = 
            new javax.xml.namespace.QName("http://www.nhsia.nhs.uk/DataStandards/XMLschema/CDS/ns", "StartDate_HospitalProviderSpell");
        private static final javax.xml.namespace.QName STARTTIMEHOSPITALPROVIDERSPELL$12 = 
            new javax.xml.namespace.QName("http://www.nhsia.nhs.uk/DataStandards/XMLschema/CDS/ns", "StartTime_HospitalProviderSpell");
        private static final javax.xml.namespace.QName AGEONADMISSION$14 = 
            new javax.xml.namespace.QName("http://www.nhsia.nhs.uk/DataStandards/XMLschema/CDS/ns", "AgeOnAdmission");
        
        
        /**
         * Gets the "HospitalProviderSpellNumber" element
         */
        public java.lang.String getHospitalProviderSpellNumber()
        {
            synchronized (monitor())
            {
                check_orphaned();
                org.apache.xmlbeans.SimpleValue target = null;
                target = (org.apache.xmlbeans.SimpleValue)get_store().find_element_user(HOSPITALPROVIDERSPELLNUMBER$0, 0);
                if (target == null)
                {
                    return null;
                }
                return target.getStringValue();
            }
        }
        
        /**
         * Gets (as xml) the "HospitalProviderSpellNumber" element
         */
        public uk.nhs.nhsia.datastandards.ecds.HospitalProviderSpellNumberType xgetHospitalProviderSpellNumber()
        {
            synchronized (monitor())
            {
                check_orphaned();
                uk.nhs.nhsia.datastandards.ecds.HospitalProviderSpellNumberType target = null;
                target = (uk.nhs.nhsia.datastandards.ecds.HospitalProviderSpellNumberType)get_store().find_element_user(HOSPITALPROVIDERSPELLNUMBER$0, 0);
                return target;
            }
        }
        
        /**
         * True if has "HospitalProviderSpellNumber" element
         */
        public boolean isSetHospitalProviderSpellNumber()
        {
            synchronized (monitor())
            {
                check_orphaned();
                return get_store().count_elements(HOSPITALPROVIDERSPELLNUMBER$0) != 0;
            }
        }
        
        /**
         * Sets the "HospitalProviderSpellNumber" element
         */
        public void setHospitalProviderSpellNumber(java.lang.String hospitalProviderSpellNumber)
        {
            synchronized (monitor())
            {
                check_orphaned();
                org.apache.xmlbeans.SimpleValue target = null;
                target = (org.apache.xmlbeans.SimpleValue)get_store().find_element_user(HOSPITALPROVIDERSPELLNUMBER$0, 0);
                if (target == null)
                {
                    target = (org.apache.xmlbeans.SimpleValue)get_store().add_element_user(HOSPITALPROVIDERSPELLNUMBER$0);
                }
                target.setStringValue(hospitalProviderSpellNumber);
            }
        }
        
        /**
         * Sets (as xml) the "HospitalProviderSpellNumber" element
         */
        public void xsetHospitalProviderSpellNumber(uk.nhs.nhsia.datastandards.ecds.HospitalProviderSpellNumberType hospitalProviderSpellNumber)
        {
            synchronized (monitor())
            {
                check_orphaned();
                uk.nhs.nhsia.datastandards.ecds.HospitalProviderSpellNumberType target = null;
                target = (uk.nhs.nhsia.datastandards.ecds.HospitalProviderSpellNumberType)get_store().find_element_user(HOSPITALPROVIDERSPELLNUMBER$0, 0);
                if (target == null)
                {
                    target = (uk.nhs.nhsia.datastandards.ecds.HospitalProviderSpellNumberType)get_store().add_element_user(HOSPITALPROVIDERSPELLNUMBER$0);
                }
                target.set(hospitalProviderSpellNumber);
            }
        }
        
        /**
         * Unsets the "HospitalProviderSpellNumber" element
         */
        public void unsetHospitalProviderSpellNumber()
        {
            synchronized (monitor())
            {
                check_orphaned();
                get_store().remove_element(HOSPITALPROVIDERSPELLNUMBER$0, 0);
            }
        }
        
        /**
         * Gets the "AdministrativeCategoryCodeOnAdmission" element
         */
        public uk.nhs.nhsia.datastandards.ecds.AdministrativeCategoryCodeType.Enum getAdministrativeCategoryCodeOnAdmission()
        {
            synchronized (monitor())
            {
                check_orphaned();
                org.apache.xmlbeans.SimpleValue target = null;
                target = (org.apache.xmlbeans.SimpleValue)get_store().find_element_user(ADMINISTRATIVECATEGORYCODEONADMISSION$2, 0);
                if (target == null)
                {
                    return null;
                }
                return (uk.nhs.nhsia.datastandards.ecds.AdministrativeCategoryCodeType.Enum)target.getEnumValue();
            }
        }
        
        /**
         * Gets (as xml) the "AdministrativeCategoryCodeOnAdmission" element
         */
        public uk.nhs.nhsia.datastandards.ecds.AdministrativeCategoryCodeHospitalProviderSpellType xgetAdministrativeCategoryCodeOnAdmission()
        {
            synchronized (monitor())
            {
                check_orphaned();
                uk.nhs.nhsia.datastandards.ecds.AdministrativeCategoryCodeHospitalProviderSpellType target = null;
                target = (uk.nhs.nhsia.datastandards.ecds.AdministrativeCategoryCodeHospitalProviderSpellType)get_store().find_element_user(ADMINISTRATIVECATEGORYCODEONADMISSION$2, 0);
                return target;
            }
        }
        
        /**
         * True if has "AdministrativeCategoryCodeOnAdmission" element
         */
        public boolean isSetAdministrativeCategoryCodeOnAdmission()
        {
            synchronized (monitor())
            {
                check_orphaned();
                return get_store().count_elements(ADMINISTRATIVECATEGORYCODEONADMISSION$2) != 0;
            }
        }
        
        /**
         * Sets the "AdministrativeCategoryCodeOnAdmission" element
         */
        public void setAdministrativeCategoryCodeOnAdmission(uk.nhs.nhsia.datastandards.ecds.AdministrativeCategoryCodeType.Enum administrativeCategoryCodeOnAdmission)
        {
            synchronized (monitor())
            {
                check_orphaned();
                org.apache.xmlbeans.SimpleValue target = null;
                target = (org.apache.xmlbeans.SimpleValue)get_store().find_element_user(ADMINISTRATIVECATEGORYCODEONADMISSION$2, 0);
                if (target == null)
                {
                    target = (org.apache.xmlbeans.SimpleValue)get_store().add_element_user(ADMINISTRATIVECATEGORYCODEONADMISSION$2);
                }
                target.setEnumValue(administrativeCategoryCodeOnAdmission);
            }
        }
        
        /**
         * Sets (as xml) the "AdministrativeCategoryCodeOnAdmission" element
         */
        public void xsetAdministrativeCategoryCodeOnAdmission(uk.nhs.nhsia.datastandards.ecds.AdministrativeCategoryCodeHospitalProviderSpellType administrativeCategoryCodeOnAdmission)
        {
            synchronized (monitor())
            {
                check_orphaned();
                uk.nhs.nhsia.datastandards.ecds.AdministrativeCategoryCodeHospitalProviderSpellType target = null;
                target = (uk.nhs.nhsia.datastandards.ecds.AdministrativeCategoryCodeHospitalProviderSpellType)get_store().find_element_user(ADMINISTRATIVECATEGORYCODEONADMISSION$2, 0);
                if (target == null)
                {
                    target = (uk.nhs.nhsia.datastandards.ecds.AdministrativeCategoryCodeHospitalProviderSpellType)get_store().add_element_user(ADMINISTRATIVECATEGORYCODEONADMISSION$2);
                }
                target.set(administrativeCategoryCodeOnAdmission);
            }
        }
        
        /**
         * Unsets the "AdministrativeCategoryCodeOnAdmission" element
         */
        public void unsetAdministrativeCategoryCodeOnAdmission()
        {
            synchronized (monitor())
            {
                check_orphaned();
                get_store().remove_element(ADMINISTRATIVECATEGORYCODEONADMISSION$2, 0);
            }
        }
        
        /**
         * Gets the "PatientClassificationCode" element
         */
        public uk.nhs.nhsia.datastandards.ecds.PatientClassificationCodeType.Enum getPatientClassificationCode()
        {
            synchronized (monitor())
            {
                check_orphaned();
                org.apache.xmlbeans.SimpleValue target = null;
                target = (org.apache.xmlbeans.SimpleValue)get_store().find_element_user(PATIENTCLASSIFICATIONCODE$4, 0);
                if (target == null)
                {
                    return null;
                }
                return (uk.nhs.nhsia.datastandards.ecds.PatientClassificationCodeType.Enum)target.getEnumValue();
            }
        }
        
        /**
         * Gets (as xml) the "PatientClassificationCode" element
         */
        public uk.nhs.nhsia.datastandards.ecds.PatientClassificationCodeType xgetPatientClassificationCode()
        {
            synchronized (monitor())
            {
                check_orphaned();
                uk.nhs.nhsia.datastandards.ecds.PatientClassificationCodeType target = null;
                target = (uk.nhs.nhsia.datastandards.ecds.PatientClassificationCodeType)get_store().find_element_user(PATIENTCLASSIFICATIONCODE$4, 0);
                return target;
            }
        }
        
        /**
         * True if has "PatientClassificationCode" element
         */
        public boolean isSetPatientClassificationCode()
        {
            synchronized (monitor())
            {
                check_orphaned();
                return get_store().count_elements(PATIENTCLASSIFICATIONCODE$4) != 0;
            }
        }
        
        /**
         * Sets the "PatientClassificationCode" element
         */
        public void setPatientClassificationCode(uk.nhs.nhsia.datastandards.ecds.PatientClassificationCodeType.Enum patientClassificationCode)
        {
            synchronized (monitor())
            {
                check_orphaned();
                org.apache.xmlbeans.SimpleValue target = null;
                target = (org.apache.xmlbeans.SimpleValue)get_store().find_element_user(PATIENTCLASSIFICATIONCODE$4, 0);
                if (target == null)
                {
                    target = (org.apache.xmlbeans.SimpleValue)get_store().add_element_user(PATIENTCLASSIFICATIONCODE$4);
                }
                target.setEnumValue(patientClassificationCode);
            }
        }
        
        /**
         * Sets (as xml) the "PatientClassificationCode" element
         */
        public void xsetPatientClassificationCode(uk.nhs.nhsia.datastandards.ecds.PatientClassificationCodeType patientClassificationCode)
        {
            synchronized (monitor())
            {
                check_orphaned();
                uk.nhs.nhsia.datastandards.ecds.PatientClassificationCodeType target = null;
                target = (uk.nhs.nhsia.datastandards.ecds.PatientClassificationCodeType)get_store().find_element_user(PATIENTCLASSIFICATIONCODE$4, 0);
                if (target == null)
                {
                    target = (uk.nhs.nhsia.datastandards.ecds.PatientClassificationCodeType)get_store().add_element_user(PATIENTCLASSIFICATIONCODE$4);
                }
                target.set(patientClassificationCode);
            }
        }
        
        /**
         * Unsets the "PatientClassificationCode" element
         */
        public void unsetPatientClassificationCode()
        {
            synchronized (monitor())
            {
                check_orphaned();
                get_store().remove_element(PATIENTCLASSIFICATIONCODE$4, 0);
            }
        }
        
        /**
         * Gets the "AdmissionMethodCode_HospitalProviderSpell" element
         */
        public uk.nhs.nhsia.datastandards.ecds.AdmissionMethodCodeHospitalProviderSpellType.Enum getAdmissionMethodCodeHospitalProviderSpell()
        {
            synchronized (monitor())
            {
                check_orphaned();
                org.apache.xmlbeans.SimpleValue target = null;
                target = (org.apache.xmlbeans.SimpleValue)get_store().find_element_user(ADMISSIONMETHODCODEHOSPITALPROVIDERSPELL$6, 0);
                if (target == null)
                {
                    return null;
                }
                return (uk.nhs.nhsia.datastandards.ecds.AdmissionMethodCodeHospitalProviderSpellType.Enum)target.getEnumValue();
            }
        }
        
        /**
         * Gets (as xml) the "AdmissionMethodCode_HospitalProviderSpell" element
         */
        public uk.nhs.nhsia.datastandards.ecds.AdmissionMethodCodeHospitalProviderSpellType xgetAdmissionMethodCodeHospitalProviderSpell()
        {
            synchronized (monitor())
            {
                check_orphaned();
                uk.nhs.nhsia.datastandards.ecds.AdmissionMethodCodeHospitalProviderSpellType target = null;
                target = (uk.nhs.nhsia.datastandards.ecds.AdmissionMethodCodeHospitalProviderSpellType)get_store().find_element_user(ADMISSIONMETHODCODEHOSPITALPROVIDERSPELL$6, 0);
                return target;
            }
        }
        
        /**
         * True if has "AdmissionMethodCode_HospitalProviderSpell" element
         */
        public boolean isSetAdmissionMethodCodeHospitalProviderSpell()
        {
            synchronized (monitor())
            {
                check_orphaned();
                return get_store().count_elements(ADMISSIONMETHODCODEHOSPITALPROVIDERSPELL$6) != 0;
            }
        }
        
        /**
         * Sets the "AdmissionMethodCode_HospitalProviderSpell" element
         */
        public void setAdmissionMethodCodeHospitalProviderSpell(uk.nhs.nhsia.datastandards.ecds.AdmissionMethodCodeHospitalProviderSpellType.Enum admissionMethodCodeHospitalProviderSpell)
        {
            synchronized (monitor())
            {
                check_orphaned();
                org.apache.xmlbeans.SimpleValue target = null;
                target = (org.apache.xmlbeans.SimpleValue)get_store().find_element_user(ADMISSIONMETHODCODEHOSPITALPROVIDERSPELL$6, 0);
                if (target == null)
                {
                    target = (org.apache.xmlbeans.SimpleValue)get_store().add_element_user(ADMISSIONMETHODCODEHOSPITALPROVIDERSPELL$6);
                }
                target.setEnumValue(admissionMethodCodeHospitalProviderSpell);
            }
        }
        
        /**
         * Sets (as xml) the "AdmissionMethodCode_HospitalProviderSpell" element
         */
        public void xsetAdmissionMethodCodeHospitalProviderSpell(uk.nhs.nhsia.datastandards.ecds.AdmissionMethodCodeHospitalProviderSpellType admissionMethodCodeHospitalProviderSpell)
        {
            synchronized (monitor())
            {
                check_orphaned();
                uk.nhs.nhsia.datastandards.ecds.AdmissionMethodCodeHospitalProviderSpellType target = null;
                target = (uk.nhs.nhsia.datastandards.ecds.AdmissionMethodCodeHospitalProviderSpellType)get_store().find_element_user(ADMISSIONMETHODCODEHOSPITALPROVIDERSPELL$6, 0);
                if (target == null)
                {
                    target = (uk.nhs.nhsia.datastandards.ecds.AdmissionMethodCodeHospitalProviderSpellType)get_store().add_element_user(ADMISSIONMETHODCODEHOSPITALPROVIDERSPELL$6);
                }
                target.set(admissionMethodCodeHospitalProviderSpell);
            }
        }
        
        /**
         * Unsets the "AdmissionMethodCode_HospitalProviderSpell" element
         */
        public void unsetAdmissionMethodCodeHospitalProviderSpell()
        {
            synchronized (monitor())
            {
                check_orphaned();
                get_store().remove_element(ADMISSIONMETHODCODEHOSPITALPROVIDERSPELL$6, 0);
            }
        }
        
        /**
         * Gets the "SourceOfAdmissionCode_HospitalProviderSpell" element
         */
        public uk.nhs.nhsia.datastandards.ecds.SourceOfAdmissionCodeHospitalProviderSpellType.Enum getSourceOfAdmissionCodeHospitalProviderSpell()
        {
            synchronized (monitor())
            {
                check_orphaned();
                org.apache.xmlbeans.SimpleValue target = null;
                target = (org.apache.xmlbeans.SimpleValue)get_store().find_element_user(SOURCEOFADMISSIONCODEHOSPITALPROVIDERSPELL$8, 0);
                if (target == null)
                {
                    return null;
                }
                return (uk.nhs.nhsia.datastandards.ecds.SourceOfAdmissionCodeHospitalProviderSpellType.Enum)target.getEnumValue();
            }
        }
        
        /**
         * Gets (as xml) the "SourceOfAdmissionCode_HospitalProviderSpell" element
         */
        public uk.nhs.nhsia.datastandards.ecds.SourceOfAdmissionCodeHospitalProviderSpellType xgetSourceOfAdmissionCodeHospitalProviderSpell()
        {
            synchronized (monitor())
            {
                check_orphaned();
                uk.nhs.nhsia.datastandards.ecds.SourceOfAdmissionCodeHospitalProviderSpellType target = null;
                target = (uk.nhs.nhsia.datastandards.ecds.SourceOfAdmissionCodeHospitalProviderSpellType)get_store().find_element_user(SOURCEOFADMISSIONCODEHOSPITALPROVIDERSPELL$8, 0);
                return target;
            }
        }
        
        /**
         * True if has "SourceOfAdmissionCode_HospitalProviderSpell" element
         */
        public boolean isSetSourceOfAdmissionCodeHospitalProviderSpell()
        {
            synchronized (monitor())
            {
                check_orphaned();
                return get_store().count_elements(SOURCEOFADMISSIONCODEHOSPITALPROVIDERSPELL$8) != 0;
            }
        }
        
        /**
         * Sets the "SourceOfAdmissionCode_HospitalProviderSpell" element
         */
        public void setSourceOfAdmissionCodeHospitalProviderSpell(uk.nhs.nhsia.datastandards.ecds.SourceOfAdmissionCodeHospitalProviderSpellType.Enum sourceOfAdmissionCodeHospitalProviderSpell)
        {
            synchronized (monitor())
            {
                check_orphaned();
                org.apache.xmlbeans.SimpleValue target = null;
                target = (org.apache.xmlbeans.SimpleValue)get_store().find_element_user(SOURCEOFADMISSIONCODEHOSPITALPROVIDERSPELL$8, 0);
                if (target == null)
                {
                    target = (org.apache.xmlbeans.SimpleValue)get_store().add_element_user(SOURCEOFADMISSIONCODEHOSPITALPROVIDERSPELL$8);
                }
                target.setEnumValue(sourceOfAdmissionCodeHospitalProviderSpell);
            }
        }
        
        /**
         * Sets (as xml) the "SourceOfAdmissionCode_HospitalProviderSpell" element
         */
        public void xsetSourceOfAdmissionCodeHospitalProviderSpell(uk.nhs.nhsia.datastandards.ecds.SourceOfAdmissionCodeHospitalProviderSpellType sourceOfAdmissionCodeHospitalProviderSpell)
        {
            synchronized (monitor())
            {
                check_orphaned();
                uk.nhs.nhsia.datastandards.ecds.SourceOfAdmissionCodeHospitalProviderSpellType target = null;
                target = (uk.nhs.nhsia.datastandards.ecds.SourceOfAdmissionCodeHospitalProviderSpellType)get_store().find_element_user(SOURCEOFADMISSIONCODEHOSPITALPROVIDERSPELL$8, 0);
                if (target == null)
                {
                    target = (uk.nhs.nhsia.datastandards.ecds.SourceOfAdmissionCodeHospitalProviderSpellType)get_store().add_element_user(SOURCEOFADMISSIONCODEHOSPITALPROVIDERSPELL$8);
                }
                target.set(sourceOfAdmissionCodeHospitalProviderSpell);
            }
        }
        
        /**
         * Unsets the "SourceOfAdmissionCode_HospitalProviderSpell" element
         */
        public void unsetSourceOfAdmissionCodeHospitalProviderSpell()
        {
            synchronized (monitor())
            {
                check_orphaned();
                get_store().remove_element(SOURCEOFADMISSIONCODEHOSPITALPROVIDERSPELL$8, 0);
            }
        }
        
        /**
         * Gets the "StartDate_HospitalProviderSpell" element
         */
        public java.util.Calendar getStartDateHospitalProviderSpell()
        {
            synchronized (monitor())
            {
                check_orphaned();
                org.apache.xmlbeans.SimpleValue target = null;
                target = (org.apache.xmlbeans.SimpleValue)get_store().find_element_user(STARTDATEHOSPITALPROVIDERSPELL$10, 0);
                if (target == null)
                {
                    return null;
                }
                return target.getCalendarValue();
            }
        }
        
        /**
         * Gets (as xml) the "StartDate_HospitalProviderSpell" element
         */
        public uk.nhs.nhsia.datastandards.ecds.StartDateHospitalProviderSpellType xgetStartDateHospitalProviderSpell()
        {
            synchronized (monitor())
            {
                check_orphaned();
                uk.nhs.nhsia.datastandards.ecds.StartDateHospitalProviderSpellType target = null;
                target = (uk.nhs.nhsia.datastandards.ecds.StartDateHospitalProviderSpellType)get_store().find_element_user(STARTDATEHOSPITALPROVIDERSPELL$10, 0);
                return target;
            }
        }
        
        /**
         * Sets the "StartDate_HospitalProviderSpell" element
         */
        public void setStartDateHospitalProviderSpell(java.util.Calendar startDateHospitalProviderSpell)
        {
            synchronized (monitor())
            {
                check_orphaned();
                org.apache.xmlbeans.SimpleValue target = null;
                target = (org.apache.xmlbeans.SimpleValue)get_store().find_element_user(STARTDATEHOSPITALPROVIDERSPELL$10, 0);
                if (target == null)
                {
                    target = (org.apache.xmlbeans.SimpleValue)get_store().add_element_user(STARTDATEHOSPITALPROVIDERSPELL$10);
                }
                target.setCalendarValue(startDateHospitalProviderSpell);
            }
        }
        
        /**
         * Sets (as xml) the "StartDate_HospitalProviderSpell" element
         */
        public void xsetStartDateHospitalProviderSpell(uk.nhs.nhsia.datastandards.ecds.StartDateHospitalProviderSpellType startDateHospitalProviderSpell)
        {
            synchronized (monitor())
            {
                check_orphaned();
                uk.nhs.nhsia.datastandards.ecds.StartDateHospitalProviderSpellType target = null;
                target = (uk.nhs.nhsia.datastandards.ecds.StartDateHospitalProviderSpellType)get_store().find_element_user(STARTDATEHOSPITALPROVIDERSPELL$10, 0);
                if (target == null)
                {
                    target = (uk.nhs.nhsia.datastandards.ecds.StartDateHospitalProviderSpellType)get_store().add_element_user(STARTDATEHOSPITALPROVIDERSPELL$10);
                }
                target.set(startDateHospitalProviderSpell);
            }
        }
        
        /**
         * Gets the "StartTime_HospitalProviderSpell" element
         */
        public java.util.Calendar getStartTimeHospitalProviderSpell()
        {
            synchronized (monitor())
            {
                check_orphaned();
                org.apache.xmlbeans.SimpleValue target = null;
                target = (org.apache.xmlbeans.SimpleValue)get_store().find_element_user(STARTTIMEHOSPITALPROVIDERSPELL$12, 0);
                if (target == null)
                {
                    return null;
                }
                return target.getCalendarValue();
            }
        }
        
        /**
         * Gets (as xml) the "StartTime_HospitalProviderSpell" element
         */
        public uk.nhs.nhsia.datastandards.ecds.StartTimeHospitalProviderSpellType xgetStartTimeHospitalProviderSpell()
        {
            synchronized (monitor())
            {
                check_orphaned();
                uk.nhs.nhsia.datastandards.ecds.StartTimeHospitalProviderSpellType target = null;
                target = (uk.nhs.nhsia.datastandards.ecds.StartTimeHospitalProviderSpellType)get_store().find_element_user(STARTTIMEHOSPITALPROVIDERSPELL$12, 0);
                return target;
            }
        }
        
        /**
         * True if has "StartTime_HospitalProviderSpell" element
         */
        public boolean isSetStartTimeHospitalProviderSpell()
        {
            synchronized (monitor())
            {
                check_orphaned();
                return get_store().count_elements(STARTTIMEHOSPITALPROVIDERSPELL$12) != 0;
            }
        }
        
        /**
         * Sets the "StartTime_HospitalProviderSpell" element
         */
        public void setStartTimeHospitalProviderSpell(java.util.Calendar startTimeHospitalProviderSpell)
        {
            synchronized (monitor())
            {
                check_orphaned();
                org.apache.xmlbeans.SimpleValue target = null;
                target = (org.apache.xmlbeans.SimpleValue)get_store().find_element_user(STARTTIMEHOSPITALPROVIDERSPELL$12, 0);
                if (target == null)
                {
                    target = (org.apache.xmlbeans.SimpleValue)get_store().add_element_user(STARTTIMEHOSPITALPROVIDERSPELL$12);
                }
                target.setCalendarValue(startTimeHospitalProviderSpell);
            }
        }
        
        /**
         * Sets (as xml) the "StartTime_HospitalProviderSpell" element
         */
        public void xsetStartTimeHospitalProviderSpell(uk.nhs.nhsia.datastandards.ecds.StartTimeHospitalProviderSpellType startTimeHospitalProviderSpell)
        {
            synchronized (monitor())
            {
                check_orphaned();
                uk.nhs.nhsia.datastandards.ecds.StartTimeHospitalProviderSpellType target = null;
                target = (uk.nhs.nhsia.datastandards.ecds.StartTimeHospitalProviderSpellType)get_store().find_element_user(STARTTIMEHOSPITALPROVIDERSPELL$12, 0);
                if (target == null)
                {
                    target = (uk.nhs.nhsia.datastandards.ecds.StartTimeHospitalProviderSpellType)get_store().add_element_user(STARTTIMEHOSPITALPROVIDERSPELL$12);
                }
                target.set(startTimeHospitalProviderSpell);
            }
        }
        
        /**
         * Unsets the "StartTime_HospitalProviderSpell" element
         */
        public void unsetStartTimeHospitalProviderSpell()
        {
            synchronized (monitor())
            {
                check_orphaned();
                get_store().remove_element(STARTTIMEHOSPITALPROVIDERSPELL$12, 0);
            }
        }
        
        /**
         * Gets the "AgeOnAdmission" element
         */
        public int getAgeOnAdmission()
        {
            synchronized (monitor())
            {
                check_orphaned();
                org.apache.xmlbeans.SimpleValue target = null;
                target = (org.apache.xmlbeans.SimpleValue)get_store().find_element_user(AGEONADMISSION$14, 0);
                if (target == null)
                {
                    return 0;
                }
                return target.getIntValue();
            }
        }
        
        /**
         * Gets (as xml) the "AgeOnAdmission" element
         */
        public uk.nhs.nhsia.datastandards.ecds.AgeOnAdmissionType xgetAgeOnAdmission()
        {
            synchronized (monitor())
            {
                check_orphaned();
                uk.nhs.nhsia.datastandards.ecds.AgeOnAdmissionType target = null;
                target = (uk.nhs.nhsia.datastandards.ecds.AgeOnAdmissionType)get_store().find_element_user(AGEONADMISSION$14, 0);
                return target;
            }
        }
        
        /**
         * Sets the "AgeOnAdmission" element
         */
        public void setAgeOnAdmission(int ageOnAdmission)
        {
            synchronized (monitor())
            {
                check_orphaned();
                org.apache.xmlbeans.SimpleValue target = null;
                target = (org.apache.xmlbeans.SimpleValue)get_store().find_element_user(AGEONADMISSION$14, 0);
                if (target == null)
                {
                    target = (org.apache.xmlbeans.SimpleValue)get_store().add_element_user(AGEONADMISSION$14);
                }
                target.setIntValue(ageOnAdmission);
            }
        }
        
        /**
         * Sets (as xml) the "AgeOnAdmission" element
         */
        public void xsetAgeOnAdmission(uk.nhs.nhsia.datastandards.ecds.AgeOnAdmissionType ageOnAdmission)
        {
            synchronized (monitor())
            {
                check_orphaned();
                uk.nhs.nhsia.datastandards.ecds.AgeOnAdmissionType target = null;
                target = (uk.nhs.nhsia.datastandards.ecds.AgeOnAdmissionType)get_store().find_element_user(AGEONADMISSION$14, 0);
                if (target == null)
                {
                    target = (uk.nhs.nhsia.datastandards.ecds.AgeOnAdmissionType)get_store().add_element_user(AGEONADMISSION$14);
                }
                target.set(ageOnAdmission);
            }
        }
    }
}
