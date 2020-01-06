/*
 * XML Type:  HospitalProviderSpell_Birth_Structure
 * Namespace: http://www.nhsia.nhs.uk/DataStandards/XMLschema/CDS/ns
 * Java type: uk.nhs.nhsia.datastandards.ecds.HospitalProviderSpellBirthStructure
 *
 * Automatically generated - do not modify.
 */
package uk.nhs.nhsia.datastandards.ecds.impl;
/**
 * An XML HospitalProviderSpell_Birth_Structure(@http://www.nhsia.nhs.uk/DataStandards/XMLschema/CDS/ns).
 *
 * This is a complex type.
 */
public class HospitalProviderSpellBirthStructureImpl extends org.apache.xmlbeans.impl.values.XmlComplexContentImpl implements uk.nhs.nhsia.datastandards.ecds.HospitalProviderSpellBirthStructure
{
    private static final long serialVersionUID = 1L;
    
    public HospitalProviderSpellBirthStructureImpl(org.apache.xmlbeans.SchemaType sType)
    {
        super(sType);
    }
    
    private static final javax.xml.namespace.QName ADMISSIONCHARACTERISTICS$0 = 
        new javax.xml.namespace.QName("http://www.nhsia.nhs.uk/DataStandards/XMLschema/CDS/ns", "AdmissionCharacteristics");
    private static final javax.xml.namespace.QName DISCHARGECHARACTERISTICS$2 = 
        new javax.xml.namespace.QName("http://www.nhsia.nhs.uk/DataStandards/XMLschema/CDS/ns", "DischargeCharacteristics");
    
    
    /**
     * Gets the "AdmissionCharacteristics" element
     */
    public uk.nhs.nhsia.datastandards.ecds.HospitalProviderSpellBirthStructure.AdmissionCharacteristics getAdmissionCharacteristics()
    {
        synchronized (monitor())
        {
            check_orphaned();
            uk.nhs.nhsia.datastandards.ecds.HospitalProviderSpellBirthStructure.AdmissionCharacteristics target = null;
            target = (uk.nhs.nhsia.datastandards.ecds.HospitalProviderSpellBirthStructure.AdmissionCharacteristics)get_store().find_element_user(ADMISSIONCHARACTERISTICS$0, 0);
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
    public void setAdmissionCharacteristics(uk.nhs.nhsia.datastandards.ecds.HospitalProviderSpellBirthStructure.AdmissionCharacteristics admissionCharacteristics)
    {
        generatedSetterHelperImpl(admissionCharacteristics, ADMISSIONCHARACTERISTICS$0, 0, org.apache.xmlbeans.impl.values.XmlObjectBase.KIND_SETTERHELPER_SINGLETON);
    }
    
    /**
     * Appends and returns a new empty "AdmissionCharacteristics" element
     */
    public uk.nhs.nhsia.datastandards.ecds.HospitalProviderSpellBirthStructure.AdmissionCharacteristics addNewAdmissionCharacteristics()
    {
        synchronized (monitor())
        {
            check_orphaned();
            uk.nhs.nhsia.datastandards.ecds.HospitalProviderSpellBirthStructure.AdmissionCharacteristics target = null;
            target = (uk.nhs.nhsia.datastandards.ecds.HospitalProviderSpellBirthStructure.AdmissionCharacteristics)get_store().add_element_user(ADMISSIONCHARACTERISTICS$0);
            return target;
        }
    }
    
    /**
     * Gets the "DischargeCharacteristics" element
     */
    public uk.nhs.nhsia.datastandards.ecds.HospitalProviderSpellBirthStructure.DischargeCharacteristics getDischargeCharacteristics()
    {
        synchronized (monitor())
        {
            check_orphaned();
            uk.nhs.nhsia.datastandards.ecds.HospitalProviderSpellBirthStructure.DischargeCharacteristics target = null;
            target = (uk.nhs.nhsia.datastandards.ecds.HospitalProviderSpellBirthStructure.DischargeCharacteristics)get_store().find_element_user(DISCHARGECHARACTERISTICS$2, 0);
            if (target == null)
            {
                return null;
            }
            return target;
        }
    }
    
    /**
     * True if has "DischargeCharacteristics" element
     */
    public boolean isSetDischargeCharacteristics()
    {
        synchronized (monitor())
        {
            check_orphaned();
            return get_store().count_elements(DISCHARGECHARACTERISTICS$2) != 0;
        }
    }
    
    /**
     * Sets the "DischargeCharacteristics" element
     */
    public void setDischargeCharacteristics(uk.nhs.nhsia.datastandards.ecds.HospitalProviderSpellBirthStructure.DischargeCharacteristics dischargeCharacteristics)
    {
        generatedSetterHelperImpl(dischargeCharacteristics, DISCHARGECHARACTERISTICS$2, 0, org.apache.xmlbeans.impl.values.XmlObjectBase.KIND_SETTERHELPER_SINGLETON);
    }
    
    /**
     * Appends and returns a new empty "DischargeCharacteristics" element
     */
    public uk.nhs.nhsia.datastandards.ecds.HospitalProviderSpellBirthStructure.DischargeCharacteristics addNewDischargeCharacteristics()
    {
        synchronized (monitor())
        {
            check_orphaned();
            uk.nhs.nhsia.datastandards.ecds.HospitalProviderSpellBirthStructure.DischargeCharacteristics target = null;
            target = (uk.nhs.nhsia.datastandards.ecds.HospitalProviderSpellBirthStructure.DischargeCharacteristics)get_store().add_element_user(DISCHARGECHARACTERISTICS$2);
            return target;
        }
    }
    
    /**
     * Unsets the "DischargeCharacteristics" element
     */
    public void unsetDischargeCharacteristics()
    {
        synchronized (monitor())
        {
            check_orphaned();
            get_store().remove_element(DISCHARGECHARACTERISTICS$2, 0);
        }
    }
    /**
     * An XML AdmissionCharacteristics(@http://www.nhsia.nhs.uk/DataStandards/XMLschema/CDS/ns).
     *
     * This is a complex type.
     */
    public static class AdmissionCharacteristicsImpl extends org.apache.xmlbeans.impl.values.XmlComplexContentImpl implements uk.nhs.nhsia.datastandards.ecds.HospitalProviderSpellBirthStructure.AdmissionCharacteristics
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
    /**
     * An XML DischargeCharacteristics(@http://www.nhsia.nhs.uk/DataStandards/XMLschema/CDS/ns).
     *
     * This is a complex type.
     */
    public static class DischargeCharacteristicsImpl extends org.apache.xmlbeans.impl.values.XmlComplexContentImpl implements uk.nhs.nhsia.datastandards.ecds.HospitalProviderSpellBirthStructure.DischargeCharacteristics
    {
        private static final long serialVersionUID = 1L;
        
        public DischargeCharacteristicsImpl(org.apache.xmlbeans.SchemaType sType)
        {
            super(sType);
        }
        
        private static final javax.xml.namespace.QName DISCHARGEDESTINATIONCODEHOSPITALPROVIDERSPELL$0 = 
            new javax.xml.namespace.QName("http://www.nhsia.nhs.uk/DataStandards/XMLschema/CDS/ns", "DischargeDestinationCode_HospitalProviderSpell");
        private static final javax.xml.namespace.QName DISCHARGEMETHODCODEHOSPITALPROVIDERSPELL$2 = 
            new javax.xml.namespace.QName("http://www.nhsia.nhs.uk/DataStandards/XMLschema/CDS/ns", "DischargeMethodCode_HospitalProviderSpell");
        private static final javax.xml.namespace.QName DISCHARGEREADYDATEHOSPITALPROVIDERSPELL$4 = 
            new javax.xml.namespace.QName("http://www.nhsia.nhs.uk/DataStandards/XMLschema/CDS/ns", "DischargeReadyDate_HospitalProviderSpell");
        private static final javax.xml.namespace.QName DISCHARGEDATEHOSPITALPROVIDERSPELL$6 = 
            new javax.xml.namespace.QName("http://www.nhsia.nhs.uk/DataStandards/XMLschema/CDS/ns", "DischargeDate_HospitalProviderSpell");
        private static final javax.xml.namespace.QName DISCHARGETIMEHOSPITALPROVIDERSPELL$8 = 
            new javax.xml.namespace.QName("http://www.nhsia.nhs.uk/DataStandards/XMLschema/CDS/ns", "DischargeTime_HospitalProviderSpell");
        private static final javax.xml.namespace.QName DISCHARGEDTOHOSPITALATHOMESERVICEINDICATOR$10 = 
            new javax.xml.namespace.QName("http://www.nhsia.nhs.uk/DataStandards/XMLschema/CDS/ns", "DischargedToHospitalAtHomeServiceIndicator");
        
        
        /**
         * Gets the "DischargeDestinationCode_HospitalProviderSpell" element
         */
        public uk.nhs.nhsia.datastandards.ecds.DischargeDestinationCodeHospitalProviderSpellType.Enum getDischargeDestinationCodeHospitalProviderSpell()
        {
            synchronized (monitor())
            {
                check_orphaned();
                org.apache.xmlbeans.SimpleValue target = null;
                target = (org.apache.xmlbeans.SimpleValue)get_store().find_element_user(DISCHARGEDESTINATIONCODEHOSPITALPROVIDERSPELL$0, 0);
                if (target == null)
                {
                    return null;
                }
                return (uk.nhs.nhsia.datastandards.ecds.DischargeDestinationCodeHospitalProviderSpellType.Enum)target.getEnumValue();
            }
        }
        
        /**
         * Gets (as xml) the "DischargeDestinationCode_HospitalProviderSpell" element
         */
        public uk.nhs.nhsia.datastandards.ecds.DischargeDestinationCodeHospitalProviderSpellType xgetDischargeDestinationCodeHospitalProviderSpell()
        {
            synchronized (monitor())
            {
                check_orphaned();
                uk.nhs.nhsia.datastandards.ecds.DischargeDestinationCodeHospitalProviderSpellType target = null;
                target = (uk.nhs.nhsia.datastandards.ecds.DischargeDestinationCodeHospitalProviderSpellType)get_store().find_element_user(DISCHARGEDESTINATIONCODEHOSPITALPROVIDERSPELL$0, 0);
                return target;
            }
        }
        
        /**
         * True if has "DischargeDestinationCode_HospitalProviderSpell" element
         */
        public boolean isSetDischargeDestinationCodeHospitalProviderSpell()
        {
            synchronized (monitor())
            {
                check_orphaned();
                return get_store().count_elements(DISCHARGEDESTINATIONCODEHOSPITALPROVIDERSPELL$0) != 0;
            }
        }
        
        /**
         * Sets the "DischargeDestinationCode_HospitalProviderSpell" element
         */
        public void setDischargeDestinationCodeHospitalProviderSpell(uk.nhs.nhsia.datastandards.ecds.DischargeDestinationCodeHospitalProviderSpellType.Enum dischargeDestinationCodeHospitalProviderSpell)
        {
            synchronized (monitor())
            {
                check_orphaned();
                org.apache.xmlbeans.SimpleValue target = null;
                target = (org.apache.xmlbeans.SimpleValue)get_store().find_element_user(DISCHARGEDESTINATIONCODEHOSPITALPROVIDERSPELL$0, 0);
                if (target == null)
                {
                    target = (org.apache.xmlbeans.SimpleValue)get_store().add_element_user(DISCHARGEDESTINATIONCODEHOSPITALPROVIDERSPELL$0);
                }
                target.setEnumValue(dischargeDestinationCodeHospitalProviderSpell);
            }
        }
        
        /**
         * Sets (as xml) the "DischargeDestinationCode_HospitalProviderSpell" element
         */
        public void xsetDischargeDestinationCodeHospitalProviderSpell(uk.nhs.nhsia.datastandards.ecds.DischargeDestinationCodeHospitalProviderSpellType dischargeDestinationCodeHospitalProviderSpell)
        {
            synchronized (monitor())
            {
                check_orphaned();
                uk.nhs.nhsia.datastandards.ecds.DischargeDestinationCodeHospitalProviderSpellType target = null;
                target = (uk.nhs.nhsia.datastandards.ecds.DischargeDestinationCodeHospitalProviderSpellType)get_store().find_element_user(DISCHARGEDESTINATIONCODEHOSPITALPROVIDERSPELL$0, 0);
                if (target == null)
                {
                    target = (uk.nhs.nhsia.datastandards.ecds.DischargeDestinationCodeHospitalProviderSpellType)get_store().add_element_user(DISCHARGEDESTINATIONCODEHOSPITALPROVIDERSPELL$0);
                }
                target.set(dischargeDestinationCodeHospitalProviderSpell);
            }
        }
        
        /**
         * Unsets the "DischargeDestinationCode_HospitalProviderSpell" element
         */
        public void unsetDischargeDestinationCodeHospitalProviderSpell()
        {
            synchronized (monitor())
            {
                check_orphaned();
                get_store().remove_element(DISCHARGEDESTINATIONCODEHOSPITALPROVIDERSPELL$0, 0);
            }
        }
        
        /**
         * Gets the "DischargeMethodCode_HospitalProviderSpell" element
         */
        public uk.nhs.nhsia.datastandards.ecds.DischargeMethodCodeHospitalProviderSpellType.Enum getDischargeMethodCodeHospitalProviderSpell()
        {
            synchronized (monitor())
            {
                check_orphaned();
                org.apache.xmlbeans.SimpleValue target = null;
                target = (org.apache.xmlbeans.SimpleValue)get_store().find_element_user(DISCHARGEMETHODCODEHOSPITALPROVIDERSPELL$2, 0);
                if (target == null)
                {
                    return null;
                }
                return (uk.nhs.nhsia.datastandards.ecds.DischargeMethodCodeHospitalProviderSpellType.Enum)target.getEnumValue();
            }
        }
        
        /**
         * Gets (as xml) the "DischargeMethodCode_HospitalProviderSpell" element
         */
        public uk.nhs.nhsia.datastandards.ecds.DischargeMethodCodeHospitalProviderSpellType xgetDischargeMethodCodeHospitalProviderSpell()
        {
            synchronized (monitor())
            {
                check_orphaned();
                uk.nhs.nhsia.datastandards.ecds.DischargeMethodCodeHospitalProviderSpellType target = null;
                target = (uk.nhs.nhsia.datastandards.ecds.DischargeMethodCodeHospitalProviderSpellType)get_store().find_element_user(DISCHARGEMETHODCODEHOSPITALPROVIDERSPELL$2, 0);
                return target;
            }
        }
        
        /**
         * True if has "DischargeMethodCode_HospitalProviderSpell" element
         */
        public boolean isSetDischargeMethodCodeHospitalProviderSpell()
        {
            synchronized (monitor())
            {
                check_orphaned();
                return get_store().count_elements(DISCHARGEMETHODCODEHOSPITALPROVIDERSPELL$2) != 0;
            }
        }
        
        /**
         * Sets the "DischargeMethodCode_HospitalProviderSpell" element
         */
        public void setDischargeMethodCodeHospitalProviderSpell(uk.nhs.nhsia.datastandards.ecds.DischargeMethodCodeHospitalProviderSpellType.Enum dischargeMethodCodeHospitalProviderSpell)
        {
            synchronized (monitor())
            {
                check_orphaned();
                org.apache.xmlbeans.SimpleValue target = null;
                target = (org.apache.xmlbeans.SimpleValue)get_store().find_element_user(DISCHARGEMETHODCODEHOSPITALPROVIDERSPELL$2, 0);
                if (target == null)
                {
                    target = (org.apache.xmlbeans.SimpleValue)get_store().add_element_user(DISCHARGEMETHODCODEHOSPITALPROVIDERSPELL$2);
                }
                target.setEnumValue(dischargeMethodCodeHospitalProviderSpell);
            }
        }
        
        /**
         * Sets (as xml) the "DischargeMethodCode_HospitalProviderSpell" element
         */
        public void xsetDischargeMethodCodeHospitalProviderSpell(uk.nhs.nhsia.datastandards.ecds.DischargeMethodCodeHospitalProviderSpellType dischargeMethodCodeHospitalProviderSpell)
        {
            synchronized (monitor())
            {
                check_orphaned();
                uk.nhs.nhsia.datastandards.ecds.DischargeMethodCodeHospitalProviderSpellType target = null;
                target = (uk.nhs.nhsia.datastandards.ecds.DischargeMethodCodeHospitalProviderSpellType)get_store().find_element_user(DISCHARGEMETHODCODEHOSPITALPROVIDERSPELL$2, 0);
                if (target == null)
                {
                    target = (uk.nhs.nhsia.datastandards.ecds.DischargeMethodCodeHospitalProviderSpellType)get_store().add_element_user(DISCHARGEMETHODCODEHOSPITALPROVIDERSPELL$2);
                }
                target.set(dischargeMethodCodeHospitalProviderSpell);
            }
        }
        
        /**
         * Unsets the "DischargeMethodCode_HospitalProviderSpell" element
         */
        public void unsetDischargeMethodCodeHospitalProviderSpell()
        {
            synchronized (monitor())
            {
                check_orphaned();
                get_store().remove_element(DISCHARGEMETHODCODEHOSPITALPROVIDERSPELL$2, 0);
            }
        }
        
        /**
         * Gets the "DischargeReadyDate_HospitalProviderSpell" element
         */
        public java.util.Calendar getDischargeReadyDateHospitalProviderSpell()
        {
            synchronized (monitor())
            {
                check_orphaned();
                org.apache.xmlbeans.SimpleValue target = null;
                target = (org.apache.xmlbeans.SimpleValue)get_store().find_element_user(DISCHARGEREADYDATEHOSPITALPROVIDERSPELL$4, 0);
                if (target == null)
                {
                    return null;
                }
                return target.getCalendarValue();
            }
        }
        
        /**
         * Gets (as xml) the "DischargeReadyDate_HospitalProviderSpell" element
         */
        public uk.nhs.nhsia.datastandards.ecds.DischargeReadyDateHospitalProviderSpellType xgetDischargeReadyDateHospitalProviderSpell()
        {
            synchronized (monitor())
            {
                check_orphaned();
                uk.nhs.nhsia.datastandards.ecds.DischargeReadyDateHospitalProviderSpellType target = null;
                target = (uk.nhs.nhsia.datastandards.ecds.DischargeReadyDateHospitalProviderSpellType)get_store().find_element_user(DISCHARGEREADYDATEHOSPITALPROVIDERSPELL$4, 0);
                return target;
            }
        }
        
        /**
         * True if has "DischargeReadyDate_HospitalProviderSpell" element
         */
        public boolean isSetDischargeReadyDateHospitalProviderSpell()
        {
            synchronized (monitor())
            {
                check_orphaned();
                return get_store().count_elements(DISCHARGEREADYDATEHOSPITALPROVIDERSPELL$4) != 0;
            }
        }
        
        /**
         * Sets the "DischargeReadyDate_HospitalProviderSpell" element
         */
        public void setDischargeReadyDateHospitalProviderSpell(java.util.Calendar dischargeReadyDateHospitalProviderSpell)
        {
            synchronized (monitor())
            {
                check_orphaned();
                org.apache.xmlbeans.SimpleValue target = null;
                target = (org.apache.xmlbeans.SimpleValue)get_store().find_element_user(DISCHARGEREADYDATEHOSPITALPROVIDERSPELL$4, 0);
                if (target == null)
                {
                    target = (org.apache.xmlbeans.SimpleValue)get_store().add_element_user(DISCHARGEREADYDATEHOSPITALPROVIDERSPELL$4);
                }
                target.setCalendarValue(dischargeReadyDateHospitalProviderSpell);
            }
        }
        
        /**
         * Sets (as xml) the "DischargeReadyDate_HospitalProviderSpell" element
         */
        public void xsetDischargeReadyDateHospitalProviderSpell(uk.nhs.nhsia.datastandards.ecds.DischargeReadyDateHospitalProviderSpellType dischargeReadyDateHospitalProviderSpell)
        {
            synchronized (monitor())
            {
                check_orphaned();
                uk.nhs.nhsia.datastandards.ecds.DischargeReadyDateHospitalProviderSpellType target = null;
                target = (uk.nhs.nhsia.datastandards.ecds.DischargeReadyDateHospitalProviderSpellType)get_store().find_element_user(DISCHARGEREADYDATEHOSPITALPROVIDERSPELL$4, 0);
                if (target == null)
                {
                    target = (uk.nhs.nhsia.datastandards.ecds.DischargeReadyDateHospitalProviderSpellType)get_store().add_element_user(DISCHARGEREADYDATEHOSPITALPROVIDERSPELL$4);
                }
                target.set(dischargeReadyDateHospitalProviderSpell);
            }
        }
        
        /**
         * Unsets the "DischargeReadyDate_HospitalProviderSpell" element
         */
        public void unsetDischargeReadyDateHospitalProviderSpell()
        {
            synchronized (monitor())
            {
                check_orphaned();
                get_store().remove_element(DISCHARGEREADYDATEHOSPITALPROVIDERSPELL$4, 0);
            }
        }
        
        /**
         * Gets the "DischargeDate_HospitalProviderSpell" element
         */
        public java.util.Calendar getDischargeDateHospitalProviderSpell()
        {
            synchronized (monitor())
            {
                check_orphaned();
                org.apache.xmlbeans.SimpleValue target = null;
                target = (org.apache.xmlbeans.SimpleValue)get_store().find_element_user(DISCHARGEDATEHOSPITALPROVIDERSPELL$6, 0);
                if (target == null)
                {
                    return null;
                }
                return target.getCalendarValue();
            }
        }
        
        /**
         * Gets (as xml) the "DischargeDate_HospitalProviderSpell" element
         */
        public uk.nhs.nhsia.datastandards.ecds.DischargeDateHospitalProviderSpellType xgetDischargeDateHospitalProviderSpell()
        {
            synchronized (monitor())
            {
                check_orphaned();
                uk.nhs.nhsia.datastandards.ecds.DischargeDateHospitalProviderSpellType target = null;
                target = (uk.nhs.nhsia.datastandards.ecds.DischargeDateHospitalProviderSpellType)get_store().find_element_user(DISCHARGEDATEHOSPITALPROVIDERSPELL$6, 0);
                return target;
            }
        }
        
        /**
         * True if has "DischargeDate_HospitalProviderSpell" element
         */
        public boolean isSetDischargeDateHospitalProviderSpell()
        {
            synchronized (monitor())
            {
                check_orphaned();
                return get_store().count_elements(DISCHARGEDATEHOSPITALPROVIDERSPELL$6) != 0;
            }
        }
        
        /**
         * Sets the "DischargeDate_HospitalProviderSpell" element
         */
        public void setDischargeDateHospitalProviderSpell(java.util.Calendar dischargeDateHospitalProviderSpell)
        {
            synchronized (monitor())
            {
                check_orphaned();
                org.apache.xmlbeans.SimpleValue target = null;
                target = (org.apache.xmlbeans.SimpleValue)get_store().find_element_user(DISCHARGEDATEHOSPITALPROVIDERSPELL$6, 0);
                if (target == null)
                {
                    target = (org.apache.xmlbeans.SimpleValue)get_store().add_element_user(DISCHARGEDATEHOSPITALPROVIDERSPELL$6);
                }
                target.setCalendarValue(dischargeDateHospitalProviderSpell);
            }
        }
        
        /**
         * Sets (as xml) the "DischargeDate_HospitalProviderSpell" element
         */
        public void xsetDischargeDateHospitalProviderSpell(uk.nhs.nhsia.datastandards.ecds.DischargeDateHospitalProviderSpellType dischargeDateHospitalProviderSpell)
        {
            synchronized (monitor())
            {
                check_orphaned();
                uk.nhs.nhsia.datastandards.ecds.DischargeDateHospitalProviderSpellType target = null;
                target = (uk.nhs.nhsia.datastandards.ecds.DischargeDateHospitalProviderSpellType)get_store().find_element_user(DISCHARGEDATEHOSPITALPROVIDERSPELL$6, 0);
                if (target == null)
                {
                    target = (uk.nhs.nhsia.datastandards.ecds.DischargeDateHospitalProviderSpellType)get_store().add_element_user(DISCHARGEDATEHOSPITALPROVIDERSPELL$6);
                }
                target.set(dischargeDateHospitalProviderSpell);
            }
        }
        
        /**
         * Unsets the "DischargeDate_HospitalProviderSpell" element
         */
        public void unsetDischargeDateHospitalProviderSpell()
        {
            synchronized (monitor())
            {
                check_orphaned();
                get_store().remove_element(DISCHARGEDATEHOSPITALPROVIDERSPELL$6, 0);
            }
        }
        
        /**
         * Gets the "DischargeTime_HospitalProviderSpell" element
         */
        public java.util.Calendar getDischargeTimeHospitalProviderSpell()
        {
            synchronized (monitor())
            {
                check_orphaned();
                org.apache.xmlbeans.SimpleValue target = null;
                target = (org.apache.xmlbeans.SimpleValue)get_store().find_element_user(DISCHARGETIMEHOSPITALPROVIDERSPELL$8, 0);
                if (target == null)
                {
                    return null;
                }
                return target.getCalendarValue();
            }
        }
        
        /**
         * Gets (as xml) the "DischargeTime_HospitalProviderSpell" element
         */
        public uk.nhs.nhsia.datastandards.ecds.DischargeTimeHospitalProviderSpellType xgetDischargeTimeHospitalProviderSpell()
        {
            synchronized (monitor())
            {
                check_orphaned();
                uk.nhs.nhsia.datastandards.ecds.DischargeTimeHospitalProviderSpellType target = null;
                target = (uk.nhs.nhsia.datastandards.ecds.DischargeTimeHospitalProviderSpellType)get_store().find_element_user(DISCHARGETIMEHOSPITALPROVIDERSPELL$8, 0);
                return target;
            }
        }
        
        /**
         * True if has "DischargeTime_HospitalProviderSpell" element
         */
        public boolean isSetDischargeTimeHospitalProviderSpell()
        {
            synchronized (monitor())
            {
                check_orphaned();
                return get_store().count_elements(DISCHARGETIMEHOSPITALPROVIDERSPELL$8) != 0;
            }
        }
        
        /**
         * Sets the "DischargeTime_HospitalProviderSpell" element
         */
        public void setDischargeTimeHospitalProviderSpell(java.util.Calendar dischargeTimeHospitalProviderSpell)
        {
            synchronized (monitor())
            {
                check_orphaned();
                org.apache.xmlbeans.SimpleValue target = null;
                target = (org.apache.xmlbeans.SimpleValue)get_store().find_element_user(DISCHARGETIMEHOSPITALPROVIDERSPELL$8, 0);
                if (target == null)
                {
                    target = (org.apache.xmlbeans.SimpleValue)get_store().add_element_user(DISCHARGETIMEHOSPITALPROVIDERSPELL$8);
                }
                target.setCalendarValue(dischargeTimeHospitalProviderSpell);
            }
        }
        
        /**
         * Sets (as xml) the "DischargeTime_HospitalProviderSpell" element
         */
        public void xsetDischargeTimeHospitalProviderSpell(uk.nhs.nhsia.datastandards.ecds.DischargeTimeHospitalProviderSpellType dischargeTimeHospitalProviderSpell)
        {
            synchronized (monitor())
            {
                check_orphaned();
                uk.nhs.nhsia.datastandards.ecds.DischargeTimeHospitalProviderSpellType target = null;
                target = (uk.nhs.nhsia.datastandards.ecds.DischargeTimeHospitalProviderSpellType)get_store().find_element_user(DISCHARGETIMEHOSPITALPROVIDERSPELL$8, 0);
                if (target == null)
                {
                    target = (uk.nhs.nhsia.datastandards.ecds.DischargeTimeHospitalProviderSpellType)get_store().add_element_user(DISCHARGETIMEHOSPITALPROVIDERSPELL$8);
                }
                target.set(dischargeTimeHospitalProviderSpell);
            }
        }
        
        /**
         * Unsets the "DischargeTime_HospitalProviderSpell" element
         */
        public void unsetDischargeTimeHospitalProviderSpell()
        {
            synchronized (monitor())
            {
                check_orphaned();
                get_store().remove_element(DISCHARGETIMEHOSPITALPROVIDERSPELL$8, 0);
            }
        }
        
        /**
         * Gets the "DischargedToHospitalAtHomeServiceIndicator" element
         */
        public uk.nhs.nhsia.datastandards.ecds.DischargedToHospitalAtHomeServiceIndicatorType.Enum getDischargedToHospitalAtHomeServiceIndicator()
        {
            synchronized (monitor())
            {
                check_orphaned();
                org.apache.xmlbeans.SimpleValue target = null;
                target = (org.apache.xmlbeans.SimpleValue)get_store().find_element_user(DISCHARGEDTOHOSPITALATHOMESERVICEINDICATOR$10, 0);
                if (target == null)
                {
                    return null;
                }
                return (uk.nhs.nhsia.datastandards.ecds.DischargedToHospitalAtHomeServiceIndicatorType.Enum)target.getEnumValue();
            }
        }
        
        /**
         * Gets (as xml) the "DischargedToHospitalAtHomeServiceIndicator" element
         */
        public uk.nhs.nhsia.datastandards.ecds.DischargedToHospitalAtHomeServiceIndicatorType xgetDischargedToHospitalAtHomeServiceIndicator()
        {
            synchronized (monitor())
            {
                check_orphaned();
                uk.nhs.nhsia.datastandards.ecds.DischargedToHospitalAtHomeServiceIndicatorType target = null;
                target = (uk.nhs.nhsia.datastandards.ecds.DischargedToHospitalAtHomeServiceIndicatorType)get_store().find_element_user(DISCHARGEDTOHOSPITALATHOMESERVICEINDICATOR$10, 0);
                return target;
            }
        }
        
        /**
         * True if has "DischargedToHospitalAtHomeServiceIndicator" element
         */
        public boolean isSetDischargedToHospitalAtHomeServiceIndicator()
        {
            synchronized (monitor())
            {
                check_orphaned();
                return get_store().count_elements(DISCHARGEDTOHOSPITALATHOMESERVICEINDICATOR$10) != 0;
            }
        }
        
        /**
         * Sets the "DischargedToHospitalAtHomeServiceIndicator" element
         */
        public void setDischargedToHospitalAtHomeServiceIndicator(uk.nhs.nhsia.datastandards.ecds.DischargedToHospitalAtHomeServiceIndicatorType.Enum dischargedToHospitalAtHomeServiceIndicator)
        {
            synchronized (monitor())
            {
                check_orphaned();
                org.apache.xmlbeans.SimpleValue target = null;
                target = (org.apache.xmlbeans.SimpleValue)get_store().find_element_user(DISCHARGEDTOHOSPITALATHOMESERVICEINDICATOR$10, 0);
                if (target == null)
                {
                    target = (org.apache.xmlbeans.SimpleValue)get_store().add_element_user(DISCHARGEDTOHOSPITALATHOMESERVICEINDICATOR$10);
                }
                target.setEnumValue(dischargedToHospitalAtHomeServiceIndicator);
            }
        }
        
        /**
         * Sets (as xml) the "DischargedToHospitalAtHomeServiceIndicator" element
         */
        public void xsetDischargedToHospitalAtHomeServiceIndicator(uk.nhs.nhsia.datastandards.ecds.DischargedToHospitalAtHomeServiceIndicatorType dischargedToHospitalAtHomeServiceIndicator)
        {
            synchronized (monitor())
            {
                check_orphaned();
                uk.nhs.nhsia.datastandards.ecds.DischargedToHospitalAtHomeServiceIndicatorType target = null;
                target = (uk.nhs.nhsia.datastandards.ecds.DischargedToHospitalAtHomeServiceIndicatorType)get_store().find_element_user(DISCHARGEDTOHOSPITALATHOMESERVICEINDICATOR$10, 0);
                if (target == null)
                {
                    target = (uk.nhs.nhsia.datastandards.ecds.DischargedToHospitalAtHomeServiceIndicatorType)get_store().add_element_user(DISCHARGEDTOHOSPITALATHOMESERVICEINDICATOR$10);
                }
                target.set(dischargedToHospitalAtHomeServiceIndicator);
            }
        }
        
        /**
         * Unsets the "DischargedToHospitalAtHomeServiceIndicator" element
         */
        public void unsetDischargedToHospitalAtHomeServiceIndicator()
        {
            synchronized (monitor())
            {
                check_orphaned();
                get_store().remove_element(DISCHARGEDTOHOSPITALATHOMESERVICEINDICATOR$10, 0);
            }
        }
    }
}
