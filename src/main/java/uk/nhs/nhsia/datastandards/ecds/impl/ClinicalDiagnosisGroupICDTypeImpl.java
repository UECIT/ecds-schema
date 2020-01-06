/*
 * XML Type:  ClinicalDiagnosisGroupICD_Type
 * Namespace: http://www.nhsia.nhs.uk/DataStandards/XMLschema/CDS/ns
 * Java type: uk.nhs.nhsia.datastandards.ecds.ClinicalDiagnosisGroupICDType
 *
 * Automatically generated - do not modify.
 */
package uk.nhs.nhsia.datastandards.ecds.impl;
/**
 * An XML ClinicalDiagnosisGroupICD_Type(@http://www.nhsia.nhs.uk/DataStandards/XMLschema/CDS/ns).
 *
 * This is a complex type.
 */
public class ClinicalDiagnosisGroupICDTypeImpl extends org.apache.xmlbeans.impl.values.XmlComplexContentImpl implements uk.nhs.nhsia.datastandards.ecds.ClinicalDiagnosisGroupICDType
{
    private static final long serialVersionUID = 1L;
    
    public ClinicalDiagnosisGroupICDTypeImpl(org.apache.xmlbeans.SchemaType sType)
    {
        super(sType);
    }
    
    private static final javax.xml.namespace.QName DIAGNOSISSCHEMEINUSE$0 = 
        new javax.xml.namespace.QName("http://www.nhsia.nhs.uk/DataStandards/XMLschema/CDS/ns", "DiagnosisSchemeInUse");
    private static final javax.xml.namespace.QName PRIMARYDIAGNOSISGROUPICD$2 = 
        new javax.xml.namespace.QName("http://www.nhsia.nhs.uk/DataStandards/XMLschema/CDS/ns", "PrimaryDiagnosisGroupICD");
    private static final javax.xml.namespace.QName SECONDARYDIAGNOSISGROUPICD$4 = 
        new javax.xml.namespace.QName("http://www.nhsia.nhs.uk/DataStandards/XMLschema/CDS/ns", "SecondaryDiagnosisGroupICD");
    
    
    /**
     * Gets the "DiagnosisSchemeInUse" element
     */
    public uk.nhs.nhsia.datastandards.ecds.DiagnosisSchemeInUseType.Enum getDiagnosisSchemeInUse()
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.SimpleValue target = null;
            target = (org.apache.xmlbeans.SimpleValue)get_store().find_element_user(DIAGNOSISSCHEMEINUSE$0, 0);
            if (target == null)
            {
                return null;
            }
            return (uk.nhs.nhsia.datastandards.ecds.DiagnosisSchemeInUseType.Enum)target.getEnumValue();
        }
    }
    
    /**
     * Gets (as xml) the "DiagnosisSchemeInUse" element
     */
    public uk.nhs.nhsia.datastandards.ecds.DiagnosisSchemeInUseType xgetDiagnosisSchemeInUse()
    {
        synchronized (monitor())
        {
            check_orphaned();
            uk.nhs.nhsia.datastandards.ecds.DiagnosisSchemeInUseType target = null;
            target = (uk.nhs.nhsia.datastandards.ecds.DiagnosisSchemeInUseType)get_store().find_element_user(DIAGNOSISSCHEMEINUSE$0, 0);
            return target;
        }
    }
    
    /**
     * Sets the "DiagnosisSchemeInUse" element
     */
    public void setDiagnosisSchemeInUse(uk.nhs.nhsia.datastandards.ecds.DiagnosisSchemeInUseType.Enum diagnosisSchemeInUse)
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.SimpleValue target = null;
            target = (org.apache.xmlbeans.SimpleValue)get_store().find_element_user(DIAGNOSISSCHEMEINUSE$0, 0);
            if (target == null)
            {
                target = (org.apache.xmlbeans.SimpleValue)get_store().add_element_user(DIAGNOSISSCHEMEINUSE$0);
            }
            target.setEnumValue(diagnosisSchemeInUse);
        }
    }
    
    /**
     * Sets (as xml) the "DiagnosisSchemeInUse" element
     */
    public void xsetDiagnosisSchemeInUse(uk.nhs.nhsia.datastandards.ecds.DiagnosisSchemeInUseType diagnosisSchemeInUse)
    {
        synchronized (monitor())
        {
            check_orphaned();
            uk.nhs.nhsia.datastandards.ecds.DiagnosisSchemeInUseType target = null;
            target = (uk.nhs.nhsia.datastandards.ecds.DiagnosisSchemeInUseType)get_store().find_element_user(DIAGNOSISSCHEMEINUSE$0, 0);
            if (target == null)
            {
                target = (uk.nhs.nhsia.datastandards.ecds.DiagnosisSchemeInUseType)get_store().add_element_user(DIAGNOSISSCHEMEINUSE$0);
            }
            target.set(diagnosisSchemeInUse);
        }
    }
    
    /**
     * Gets the "PrimaryDiagnosisGroupICD" element
     */
    public uk.nhs.nhsia.datastandards.ecds.ClinicalDiagnosisGroupICDType.PrimaryDiagnosisGroupICD getPrimaryDiagnosisGroupICD()
    {
        synchronized (monitor())
        {
            check_orphaned();
            uk.nhs.nhsia.datastandards.ecds.ClinicalDiagnosisGroupICDType.PrimaryDiagnosisGroupICD target = null;
            target = (uk.nhs.nhsia.datastandards.ecds.ClinicalDiagnosisGroupICDType.PrimaryDiagnosisGroupICD)get_store().find_element_user(PRIMARYDIAGNOSISGROUPICD$2, 0);
            if (target == null)
            {
                return null;
            }
            return target;
        }
    }
    
    /**
     * Sets the "PrimaryDiagnosisGroupICD" element
     */
    public void setPrimaryDiagnosisGroupICD(uk.nhs.nhsia.datastandards.ecds.ClinicalDiagnosisGroupICDType.PrimaryDiagnosisGroupICD primaryDiagnosisGroupICD)
    {
        generatedSetterHelperImpl(primaryDiagnosisGroupICD, PRIMARYDIAGNOSISGROUPICD$2, 0, org.apache.xmlbeans.impl.values.XmlObjectBase.KIND_SETTERHELPER_SINGLETON);
    }
    
    /**
     * Appends and returns a new empty "PrimaryDiagnosisGroupICD" element
     */
    public uk.nhs.nhsia.datastandards.ecds.ClinicalDiagnosisGroupICDType.PrimaryDiagnosisGroupICD addNewPrimaryDiagnosisGroupICD()
    {
        synchronized (monitor())
        {
            check_orphaned();
            uk.nhs.nhsia.datastandards.ecds.ClinicalDiagnosisGroupICDType.PrimaryDiagnosisGroupICD target = null;
            target = (uk.nhs.nhsia.datastandards.ecds.ClinicalDiagnosisGroupICDType.PrimaryDiagnosisGroupICD)get_store().add_element_user(PRIMARYDIAGNOSISGROUPICD$2);
            return target;
        }
    }
    
    /**
     * Gets array of all "SecondaryDiagnosisGroupICD" elements
     */
    public uk.nhs.nhsia.datastandards.ecds.ClinicalDiagnosisGroupICDType.SecondaryDiagnosisGroupICD[] getSecondaryDiagnosisGroupICDArray()
    {
        synchronized (monitor())
        {
            check_orphaned();
            java.util.List targetList = new java.util.ArrayList();
            get_store().find_all_element_users(SECONDARYDIAGNOSISGROUPICD$4, targetList);
            uk.nhs.nhsia.datastandards.ecds.ClinicalDiagnosisGroupICDType.SecondaryDiagnosisGroupICD[] result = new uk.nhs.nhsia.datastandards.ecds.ClinicalDiagnosisGroupICDType.SecondaryDiagnosisGroupICD[targetList.size()];
            targetList.toArray(result);
            return result;
        }
    }
    
    /**
     * Gets ith "SecondaryDiagnosisGroupICD" element
     */
    public uk.nhs.nhsia.datastandards.ecds.ClinicalDiagnosisGroupICDType.SecondaryDiagnosisGroupICD getSecondaryDiagnosisGroupICDArray(int i)
    {
        synchronized (monitor())
        {
            check_orphaned();
            uk.nhs.nhsia.datastandards.ecds.ClinicalDiagnosisGroupICDType.SecondaryDiagnosisGroupICD target = null;
            target = (uk.nhs.nhsia.datastandards.ecds.ClinicalDiagnosisGroupICDType.SecondaryDiagnosisGroupICD)get_store().find_element_user(SECONDARYDIAGNOSISGROUPICD$4, i);
            if (target == null)
            {
                throw new IndexOutOfBoundsException();
            }
            return target;
        }
    }
    
    /**
     * Returns number of "SecondaryDiagnosisGroupICD" element
     */
    public int sizeOfSecondaryDiagnosisGroupICDArray()
    {
        synchronized (monitor())
        {
            check_orphaned();
            return get_store().count_elements(SECONDARYDIAGNOSISGROUPICD$4);
        }
    }
    
    /**
     * Sets array of all "SecondaryDiagnosisGroupICD" element  WARNING: This method is not atomicaly synchronized.
     */
    public void setSecondaryDiagnosisGroupICDArray(uk.nhs.nhsia.datastandards.ecds.ClinicalDiagnosisGroupICDType.SecondaryDiagnosisGroupICD[] secondaryDiagnosisGroupICDArray)
    {
        check_orphaned();
        arraySetterHelper(secondaryDiagnosisGroupICDArray, SECONDARYDIAGNOSISGROUPICD$4);
    }
    
    /**
     * Sets ith "SecondaryDiagnosisGroupICD" element
     */
    public void setSecondaryDiagnosisGroupICDArray(int i, uk.nhs.nhsia.datastandards.ecds.ClinicalDiagnosisGroupICDType.SecondaryDiagnosisGroupICD secondaryDiagnosisGroupICD)
    {
        generatedSetterHelperImpl(secondaryDiagnosisGroupICD, SECONDARYDIAGNOSISGROUPICD$4, i, org.apache.xmlbeans.impl.values.XmlObjectBase.KIND_SETTERHELPER_ARRAYITEM);
    }
    
    /**
     * Inserts and returns a new empty value (as xml) as the ith "SecondaryDiagnosisGroupICD" element
     */
    public uk.nhs.nhsia.datastandards.ecds.ClinicalDiagnosisGroupICDType.SecondaryDiagnosisGroupICD insertNewSecondaryDiagnosisGroupICD(int i)
    {
        synchronized (monitor())
        {
            check_orphaned();
            uk.nhs.nhsia.datastandards.ecds.ClinicalDiagnosisGroupICDType.SecondaryDiagnosisGroupICD target = null;
            target = (uk.nhs.nhsia.datastandards.ecds.ClinicalDiagnosisGroupICDType.SecondaryDiagnosisGroupICD)get_store().insert_element_user(SECONDARYDIAGNOSISGROUPICD$4, i);
            return target;
        }
    }
    
    /**
     * Appends and returns a new empty value (as xml) as the last "SecondaryDiagnosisGroupICD" element
     */
    public uk.nhs.nhsia.datastandards.ecds.ClinicalDiagnosisGroupICDType.SecondaryDiagnosisGroupICD addNewSecondaryDiagnosisGroupICD()
    {
        synchronized (monitor())
        {
            check_orphaned();
            uk.nhs.nhsia.datastandards.ecds.ClinicalDiagnosisGroupICDType.SecondaryDiagnosisGroupICD target = null;
            target = (uk.nhs.nhsia.datastandards.ecds.ClinicalDiagnosisGroupICDType.SecondaryDiagnosisGroupICD)get_store().add_element_user(SECONDARYDIAGNOSISGROUPICD$4);
            return target;
        }
    }
    
    /**
     * Removes the ith "SecondaryDiagnosisGroupICD" element
     */
    public void removeSecondaryDiagnosisGroupICD(int i)
    {
        synchronized (monitor())
        {
            check_orphaned();
            get_store().remove_element(SECONDARYDIAGNOSISGROUPICD$4, i);
        }
    }
    /**
     * An XML PrimaryDiagnosisGroupICD(@http://www.nhsia.nhs.uk/DataStandards/XMLschema/CDS/ns).
     *
     * This is a complex type.
     */
    public static class PrimaryDiagnosisGroupICDImpl extends org.apache.xmlbeans.impl.values.XmlComplexContentImpl implements uk.nhs.nhsia.datastandards.ecds.ClinicalDiagnosisGroupICDType.PrimaryDiagnosisGroupICD
    {
        private static final long serialVersionUID = 1L;
        
        public PrimaryDiagnosisGroupICDImpl(org.apache.xmlbeans.SchemaType sType)
        {
            super(sType);
        }
        
        private static final javax.xml.namespace.QName PRIMARYDIAGNOSISICD$0 = 
            new javax.xml.namespace.QName("http://www.nhsia.nhs.uk/DataStandards/XMLschema/CDS/ns", "PrimaryDiagnosis_ICD");
        private static final javax.xml.namespace.QName PRESENTONADMISSIONINDICATOR$2 = 
            new javax.xml.namespace.QName("http://www.nhsia.nhs.uk/DataStandards/XMLschema/CDS/ns", "PresentOnAdmissionIndicator");
        
        
        /**
         * Gets the "PrimaryDiagnosis_ICD" element
         */
        public java.lang.String getPrimaryDiagnosisICD()
        {
            synchronized (monitor())
            {
                check_orphaned();
                org.apache.xmlbeans.SimpleValue target = null;
                target = (org.apache.xmlbeans.SimpleValue)get_store().find_element_user(PRIMARYDIAGNOSISICD$0, 0);
                if (target == null)
                {
                    return null;
                }
                return target.getStringValue();
            }
        }
        
        /**
         * Gets (as xml) the "PrimaryDiagnosis_ICD" element
         */
        public uk.nhs.nhsia.datastandards.ecds.PrimaryDiagnosisICDType xgetPrimaryDiagnosisICD()
        {
            synchronized (monitor())
            {
                check_orphaned();
                uk.nhs.nhsia.datastandards.ecds.PrimaryDiagnosisICDType target = null;
                target = (uk.nhs.nhsia.datastandards.ecds.PrimaryDiagnosisICDType)get_store().find_element_user(PRIMARYDIAGNOSISICD$0, 0);
                return target;
            }
        }
        
        /**
         * Sets the "PrimaryDiagnosis_ICD" element
         */
        public void setPrimaryDiagnosisICD(java.lang.String primaryDiagnosisICD)
        {
            synchronized (monitor())
            {
                check_orphaned();
                org.apache.xmlbeans.SimpleValue target = null;
                target = (org.apache.xmlbeans.SimpleValue)get_store().find_element_user(PRIMARYDIAGNOSISICD$0, 0);
                if (target == null)
                {
                    target = (org.apache.xmlbeans.SimpleValue)get_store().add_element_user(PRIMARYDIAGNOSISICD$0);
                }
                target.setStringValue(primaryDiagnosisICD);
            }
        }
        
        /**
         * Sets (as xml) the "PrimaryDiagnosis_ICD" element
         */
        public void xsetPrimaryDiagnosisICD(uk.nhs.nhsia.datastandards.ecds.PrimaryDiagnosisICDType primaryDiagnosisICD)
        {
            synchronized (monitor())
            {
                check_orphaned();
                uk.nhs.nhsia.datastandards.ecds.PrimaryDiagnosisICDType target = null;
                target = (uk.nhs.nhsia.datastandards.ecds.PrimaryDiagnosisICDType)get_store().find_element_user(PRIMARYDIAGNOSISICD$0, 0);
                if (target == null)
                {
                    target = (uk.nhs.nhsia.datastandards.ecds.PrimaryDiagnosisICDType)get_store().add_element_user(PRIMARYDIAGNOSISICD$0);
                }
                target.set(primaryDiagnosisICD);
            }
        }
        
        /**
         * Gets the "PresentOnAdmissionIndicator" element
         */
        public uk.nhs.nhsia.datastandards.ecds.PresentOnAdmissionIndicatorType.Enum getPresentOnAdmissionIndicator()
        {
            synchronized (monitor())
            {
                check_orphaned();
                org.apache.xmlbeans.SimpleValue target = null;
                target = (org.apache.xmlbeans.SimpleValue)get_store().find_element_user(PRESENTONADMISSIONINDICATOR$2, 0);
                if (target == null)
                {
                    return null;
                }
                return (uk.nhs.nhsia.datastandards.ecds.PresentOnAdmissionIndicatorType.Enum)target.getEnumValue();
            }
        }
        
        /**
         * Gets (as xml) the "PresentOnAdmissionIndicator" element
         */
        public uk.nhs.nhsia.datastandards.ecds.PresentOnAdmissionIndicatorType xgetPresentOnAdmissionIndicator()
        {
            synchronized (monitor())
            {
                check_orphaned();
                uk.nhs.nhsia.datastandards.ecds.PresentOnAdmissionIndicatorType target = null;
                target = (uk.nhs.nhsia.datastandards.ecds.PresentOnAdmissionIndicatorType)get_store().find_element_user(PRESENTONADMISSIONINDICATOR$2, 0);
                return target;
            }
        }
        
        /**
         * True if has "PresentOnAdmissionIndicator" element
         */
        public boolean isSetPresentOnAdmissionIndicator()
        {
            synchronized (monitor())
            {
                check_orphaned();
                return get_store().count_elements(PRESENTONADMISSIONINDICATOR$2) != 0;
            }
        }
        
        /**
         * Sets the "PresentOnAdmissionIndicator" element
         */
        public void setPresentOnAdmissionIndicator(uk.nhs.nhsia.datastandards.ecds.PresentOnAdmissionIndicatorType.Enum presentOnAdmissionIndicator)
        {
            synchronized (monitor())
            {
                check_orphaned();
                org.apache.xmlbeans.SimpleValue target = null;
                target = (org.apache.xmlbeans.SimpleValue)get_store().find_element_user(PRESENTONADMISSIONINDICATOR$2, 0);
                if (target == null)
                {
                    target = (org.apache.xmlbeans.SimpleValue)get_store().add_element_user(PRESENTONADMISSIONINDICATOR$2);
                }
                target.setEnumValue(presentOnAdmissionIndicator);
            }
        }
        
        /**
         * Sets (as xml) the "PresentOnAdmissionIndicator" element
         */
        public void xsetPresentOnAdmissionIndicator(uk.nhs.nhsia.datastandards.ecds.PresentOnAdmissionIndicatorType presentOnAdmissionIndicator)
        {
            synchronized (monitor())
            {
                check_orphaned();
                uk.nhs.nhsia.datastandards.ecds.PresentOnAdmissionIndicatorType target = null;
                target = (uk.nhs.nhsia.datastandards.ecds.PresentOnAdmissionIndicatorType)get_store().find_element_user(PRESENTONADMISSIONINDICATOR$2, 0);
                if (target == null)
                {
                    target = (uk.nhs.nhsia.datastandards.ecds.PresentOnAdmissionIndicatorType)get_store().add_element_user(PRESENTONADMISSIONINDICATOR$2);
                }
                target.set(presentOnAdmissionIndicator);
            }
        }
        
        /**
         * Unsets the "PresentOnAdmissionIndicator" element
         */
        public void unsetPresentOnAdmissionIndicator()
        {
            synchronized (monitor())
            {
                check_orphaned();
                get_store().remove_element(PRESENTONADMISSIONINDICATOR$2, 0);
            }
        }
    }
    /**
     * An XML SecondaryDiagnosisGroupICD(@http://www.nhsia.nhs.uk/DataStandards/XMLschema/CDS/ns).
     *
     * This is a complex type.
     */
    public static class SecondaryDiagnosisGroupICDImpl extends org.apache.xmlbeans.impl.values.XmlComplexContentImpl implements uk.nhs.nhsia.datastandards.ecds.ClinicalDiagnosisGroupICDType.SecondaryDiagnosisGroupICD
    {
        private static final long serialVersionUID = 1L;
        
        public SecondaryDiagnosisGroupICDImpl(org.apache.xmlbeans.SchemaType sType)
        {
            super(sType);
        }
        
        private static final javax.xml.namespace.QName SECONDARYDIAGNOSISICD$0 = 
            new javax.xml.namespace.QName("http://www.nhsia.nhs.uk/DataStandards/XMLschema/CDS/ns", "SecondaryDiagnosis_ICD");
        private static final javax.xml.namespace.QName PRESENTONADMISSIONINDICATOR$2 = 
            new javax.xml.namespace.QName("http://www.nhsia.nhs.uk/DataStandards/XMLschema/CDS/ns", "PresentOnAdmissionIndicator");
        
        
        /**
         * Gets the "SecondaryDiagnosis_ICD" element
         */
        public java.lang.String getSecondaryDiagnosisICD()
        {
            synchronized (monitor())
            {
                check_orphaned();
                org.apache.xmlbeans.SimpleValue target = null;
                target = (org.apache.xmlbeans.SimpleValue)get_store().find_element_user(SECONDARYDIAGNOSISICD$0, 0);
                if (target == null)
                {
                    return null;
                }
                return target.getStringValue();
            }
        }
        
        /**
         * Gets (as xml) the "SecondaryDiagnosis_ICD" element
         */
        public uk.nhs.nhsia.datastandards.ecds.SecondaryDiagnosisICDType xgetSecondaryDiagnosisICD()
        {
            synchronized (monitor())
            {
                check_orphaned();
                uk.nhs.nhsia.datastandards.ecds.SecondaryDiagnosisICDType target = null;
                target = (uk.nhs.nhsia.datastandards.ecds.SecondaryDiagnosisICDType)get_store().find_element_user(SECONDARYDIAGNOSISICD$0, 0);
                return target;
            }
        }
        
        /**
         * Sets the "SecondaryDiagnosis_ICD" element
         */
        public void setSecondaryDiagnosisICD(java.lang.String secondaryDiagnosisICD)
        {
            synchronized (monitor())
            {
                check_orphaned();
                org.apache.xmlbeans.SimpleValue target = null;
                target = (org.apache.xmlbeans.SimpleValue)get_store().find_element_user(SECONDARYDIAGNOSISICD$0, 0);
                if (target == null)
                {
                    target = (org.apache.xmlbeans.SimpleValue)get_store().add_element_user(SECONDARYDIAGNOSISICD$0);
                }
                target.setStringValue(secondaryDiagnosisICD);
            }
        }
        
        /**
         * Sets (as xml) the "SecondaryDiagnosis_ICD" element
         */
        public void xsetSecondaryDiagnosisICD(uk.nhs.nhsia.datastandards.ecds.SecondaryDiagnosisICDType secondaryDiagnosisICD)
        {
            synchronized (monitor())
            {
                check_orphaned();
                uk.nhs.nhsia.datastandards.ecds.SecondaryDiagnosisICDType target = null;
                target = (uk.nhs.nhsia.datastandards.ecds.SecondaryDiagnosisICDType)get_store().find_element_user(SECONDARYDIAGNOSISICD$0, 0);
                if (target == null)
                {
                    target = (uk.nhs.nhsia.datastandards.ecds.SecondaryDiagnosisICDType)get_store().add_element_user(SECONDARYDIAGNOSISICD$0);
                }
                target.set(secondaryDiagnosisICD);
            }
        }
        
        /**
         * Gets the "PresentOnAdmissionIndicator" element
         */
        public uk.nhs.nhsia.datastandards.ecds.PresentOnAdmissionIndicatorType.Enum getPresentOnAdmissionIndicator()
        {
            synchronized (monitor())
            {
                check_orphaned();
                org.apache.xmlbeans.SimpleValue target = null;
                target = (org.apache.xmlbeans.SimpleValue)get_store().find_element_user(PRESENTONADMISSIONINDICATOR$2, 0);
                if (target == null)
                {
                    return null;
                }
                return (uk.nhs.nhsia.datastandards.ecds.PresentOnAdmissionIndicatorType.Enum)target.getEnumValue();
            }
        }
        
        /**
         * Gets (as xml) the "PresentOnAdmissionIndicator" element
         */
        public uk.nhs.nhsia.datastandards.ecds.PresentOnAdmissionIndicatorType xgetPresentOnAdmissionIndicator()
        {
            synchronized (monitor())
            {
                check_orphaned();
                uk.nhs.nhsia.datastandards.ecds.PresentOnAdmissionIndicatorType target = null;
                target = (uk.nhs.nhsia.datastandards.ecds.PresentOnAdmissionIndicatorType)get_store().find_element_user(PRESENTONADMISSIONINDICATOR$2, 0);
                return target;
            }
        }
        
        /**
         * True if has "PresentOnAdmissionIndicator" element
         */
        public boolean isSetPresentOnAdmissionIndicator()
        {
            synchronized (monitor())
            {
                check_orphaned();
                return get_store().count_elements(PRESENTONADMISSIONINDICATOR$2) != 0;
            }
        }
        
        /**
         * Sets the "PresentOnAdmissionIndicator" element
         */
        public void setPresentOnAdmissionIndicator(uk.nhs.nhsia.datastandards.ecds.PresentOnAdmissionIndicatorType.Enum presentOnAdmissionIndicator)
        {
            synchronized (monitor())
            {
                check_orphaned();
                org.apache.xmlbeans.SimpleValue target = null;
                target = (org.apache.xmlbeans.SimpleValue)get_store().find_element_user(PRESENTONADMISSIONINDICATOR$2, 0);
                if (target == null)
                {
                    target = (org.apache.xmlbeans.SimpleValue)get_store().add_element_user(PRESENTONADMISSIONINDICATOR$2);
                }
                target.setEnumValue(presentOnAdmissionIndicator);
            }
        }
        
        /**
         * Sets (as xml) the "PresentOnAdmissionIndicator" element
         */
        public void xsetPresentOnAdmissionIndicator(uk.nhs.nhsia.datastandards.ecds.PresentOnAdmissionIndicatorType presentOnAdmissionIndicator)
        {
            synchronized (monitor())
            {
                check_orphaned();
                uk.nhs.nhsia.datastandards.ecds.PresentOnAdmissionIndicatorType target = null;
                target = (uk.nhs.nhsia.datastandards.ecds.PresentOnAdmissionIndicatorType)get_store().find_element_user(PRESENTONADMISSIONINDICATOR$2, 0);
                if (target == null)
                {
                    target = (uk.nhs.nhsia.datastandards.ecds.PresentOnAdmissionIndicatorType)get_store().add_element_user(PRESENTONADMISSIONINDICATOR$2);
                }
                target.set(presentOnAdmissionIndicator);
            }
        }
        
        /**
         * Unsets the "PresentOnAdmissionIndicator" element
         */
        public void unsetPresentOnAdmissionIndicator()
        {
            synchronized (monitor())
            {
                check_orphaned();
                get_store().remove_element(PRESENTONADMISSIONINDICATOR$2, 0);
            }
        }
    }
}
