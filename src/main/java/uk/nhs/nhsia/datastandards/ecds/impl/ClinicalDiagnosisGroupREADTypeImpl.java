/*
 * XML Type:  ClinicalDiagnosisGroupREAD_Type
 * Namespace: http://www.nhsia.nhs.uk/DataStandards/XMLschema/CDS/ns
 * Java type: uk.nhs.nhsia.datastandards.ecds.ClinicalDiagnosisGroupREADType
 *
 * Automatically generated - do not modify.
 */
package uk.nhs.nhsia.datastandards.ecds.impl;
/**
 * An XML ClinicalDiagnosisGroupREAD_Type(@http://www.nhsia.nhs.uk/DataStandards/XMLschema/CDS/ns).
 *
 * This is a complex type.
 */
public class ClinicalDiagnosisGroupREADTypeImpl extends org.apache.xmlbeans.impl.values.XmlComplexContentImpl implements uk.nhs.nhsia.datastandards.ecds.ClinicalDiagnosisGroupREADType
{
    private static final long serialVersionUID = 1L;
    
    public ClinicalDiagnosisGroupREADTypeImpl(org.apache.xmlbeans.SchemaType sType)
    {
        super(sType);
    }
    
    private static final javax.xml.namespace.QName DIAGNOSISSCHEMEINUSE$0 = 
        new javax.xml.namespace.QName("http://www.nhsia.nhs.uk/DataStandards/XMLschema/CDS/ns", "DiagnosisSchemeInUse");
    private static final javax.xml.namespace.QName PRIMARYDIAGNOSISGROUPREAD$2 = 
        new javax.xml.namespace.QName("http://www.nhsia.nhs.uk/DataStandards/XMLschema/CDS/ns", "PrimaryDiagnosisGroupREAD");
    private static final javax.xml.namespace.QName SECONDARYDIAGNOSISGROUPREAD$4 = 
        new javax.xml.namespace.QName("http://www.nhsia.nhs.uk/DataStandards/XMLschema/CDS/ns", "SecondaryDiagnosisGroupREAD");
    
    
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
     * Gets the "PrimaryDiagnosisGroupREAD" element
     */
    public uk.nhs.nhsia.datastandards.ecds.ClinicalDiagnosisGroupREADType.PrimaryDiagnosisGroupREAD getPrimaryDiagnosisGroupREAD()
    {
        synchronized (monitor())
        {
            check_orphaned();
            uk.nhs.nhsia.datastandards.ecds.ClinicalDiagnosisGroupREADType.PrimaryDiagnosisGroupREAD target = null;
            target = (uk.nhs.nhsia.datastandards.ecds.ClinicalDiagnosisGroupREADType.PrimaryDiagnosisGroupREAD)get_store().find_element_user(PRIMARYDIAGNOSISGROUPREAD$2, 0);
            if (target == null)
            {
                return null;
            }
            return target;
        }
    }
    
    /**
     * Sets the "PrimaryDiagnosisGroupREAD" element
     */
    public void setPrimaryDiagnosisGroupREAD(uk.nhs.nhsia.datastandards.ecds.ClinicalDiagnosisGroupREADType.PrimaryDiagnosisGroupREAD primaryDiagnosisGroupREAD)
    {
        generatedSetterHelperImpl(primaryDiagnosisGroupREAD, PRIMARYDIAGNOSISGROUPREAD$2, 0, org.apache.xmlbeans.impl.values.XmlObjectBase.KIND_SETTERHELPER_SINGLETON);
    }
    
    /**
     * Appends and returns a new empty "PrimaryDiagnosisGroupREAD" element
     */
    public uk.nhs.nhsia.datastandards.ecds.ClinicalDiagnosisGroupREADType.PrimaryDiagnosisGroupREAD addNewPrimaryDiagnosisGroupREAD()
    {
        synchronized (monitor())
        {
            check_orphaned();
            uk.nhs.nhsia.datastandards.ecds.ClinicalDiagnosisGroupREADType.PrimaryDiagnosisGroupREAD target = null;
            target = (uk.nhs.nhsia.datastandards.ecds.ClinicalDiagnosisGroupREADType.PrimaryDiagnosisGroupREAD)get_store().add_element_user(PRIMARYDIAGNOSISGROUPREAD$2);
            return target;
        }
    }
    
    /**
     * Gets array of all "SecondaryDiagnosisGroupREAD" elements
     */
    public uk.nhs.nhsia.datastandards.ecds.ClinicalDiagnosisGroupREADType.SecondaryDiagnosisGroupREAD[] getSecondaryDiagnosisGroupREADArray()
    {
        synchronized (monitor())
        {
            check_orphaned();
            java.util.List targetList = new java.util.ArrayList();
            get_store().find_all_element_users(SECONDARYDIAGNOSISGROUPREAD$4, targetList);
            uk.nhs.nhsia.datastandards.ecds.ClinicalDiagnosisGroupREADType.SecondaryDiagnosisGroupREAD[] result = new uk.nhs.nhsia.datastandards.ecds.ClinicalDiagnosisGroupREADType.SecondaryDiagnosisGroupREAD[targetList.size()];
            targetList.toArray(result);
            return result;
        }
    }
    
    /**
     * Gets ith "SecondaryDiagnosisGroupREAD" element
     */
    public uk.nhs.nhsia.datastandards.ecds.ClinicalDiagnosisGroupREADType.SecondaryDiagnosisGroupREAD getSecondaryDiagnosisGroupREADArray(int i)
    {
        synchronized (monitor())
        {
            check_orphaned();
            uk.nhs.nhsia.datastandards.ecds.ClinicalDiagnosisGroupREADType.SecondaryDiagnosisGroupREAD target = null;
            target = (uk.nhs.nhsia.datastandards.ecds.ClinicalDiagnosisGroupREADType.SecondaryDiagnosisGroupREAD)get_store().find_element_user(SECONDARYDIAGNOSISGROUPREAD$4, i);
            if (target == null)
            {
                throw new IndexOutOfBoundsException();
            }
            return target;
        }
    }
    
    /**
     * Returns number of "SecondaryDiagnosisGroupREAD" element
     */
    public int sizeOfSecondaryDiagnosisGroupREADArray()
    {
        synchronized (monitor())
        {
            check_orphaned();
            return get_store().count_elements(SECONDARYDIAGNOSISGROUPREAD$4);
        }
    }
    
    /**
     * Sets array of all "SecondaryDiagnosisGroupREAD" element  WARNING: This method is not atomicaly synchronized.
     */
    public void setSecondaryDiagnosisGroupREADArray(uk.nhs.nhsia.datastandards.ecds.ClinicalDiagnosisGroupREADType.SecondaryDiagnosisGroupREAD[] secondaryDiagnosisGroupREADArray)
    {
        check_orphaned();
        arraySetterHelper(secondaryDiagnosisGroupREADArray, SECONDARYDIAGNOSISGROUPREAD$4);
    }
    
    /**
     * Sets ith "SecondaryDiagnosisGroupREAD" element
     */
    public void setSecondaryDiagnosisGroupREADArray(int i, uk.nhs.nhsia.datastandards.ecds.ClinicalDiagnosisGroupREADType.SecondaryDiagnosisGroupREAD secondaryDiagnosisGroupREAD)
    {
        generatedSetterHelperImpl(secondaryDiagnosisGroupREAD, SECONDARYDIAGNOSISGROUPREAD$4, i, org.apache.xmlbeans.impl.values.XmlObjectBase.KIND_SETTERHELPER_ARRAYITEM);
    }
    
    /**
     * Inserts and returns a new empty value (as xml) as the ith "SecondaryDiagnosisGroupREAD" element
     */
    public uk.nhs.nhsia.datastandards.ecds.ClinicalDiagnosisGroupREADType.SecondaryDiagnosisGroupREAD insertNewSecondaryDiagnosisGroupREAD(int i)
    {
        synchronized (monitor())
        {
            check_orphaned();
            uk.nhs.nhsia.datastandards.ecds.ClinicalDiagnosisGroupREADType.SecondaryDiagnosisGroupREAD target = null;
            target = (uk.nhs.nhsia.datastandards.ecds.ClinicalDiagnosisGroupREADType.SecondaryDiagnosisGroupREAD)get_store().insert_element_user(SECONDARYDIAGNOSISGROUPREAD$4, i);
            return target;
        }
    }
    
    /**
     * Appends and returns a new empty value (as xml) as the last "SecondaryDiagnosisGroupREAD" element
     */
    public uk.nhs.nhsia.datastandards.ecds.ClinicalDiagnosisGroupREADType.SecondaryDiagnosisGroupREAD addNewSecondaryDiagnosisGroupREAD()
    {
        synchronized (monitor())
        {
            check_orphaned();
            uk.nhs.nhsia.datastandards.ecds.ClinicalDiagnosisGroupREADType.SecondaryDiagnosisGroupREAD target = null;
            target = (uk.nhs.nhsia.datastandards.ecds.ClinicalDiagnosisGroupREADType.SecondaryDiagnosisGroupREAD)get_store().add_element_user(SECONDARYDIAGNOSISGROUPREAD$4);
            return target;
        }
    }
    
    /**
     * Removes the ith "SecondaryDiagnosisGroupREAD" element
     */
    public void removeSecondaryDiagnosisGroupREAD(int i)
    {
        synchronized (monitor())
        {
            check_orphaned();
            get_store().remove_element(SECONDARYDIAGNOSISGROUPREAD$4, i);
        }
    }
    /**
     * An XML PrimaryDiagnosisGroupREAD(@http://www.nhsia.nhs.uk/DataStandards/XMLschema/CDS/ns).
     *
     * This is a complex type.
     */
    public static class PrimaryDiagnosisGroupREADImpl extends org.apache.xmlbeans.impl.values.XmlComplexContentImpl implements uk.nhs.nhsia.datastandards.ecds.ClinicalDiagnosisGroupREADType.PrimaryDiagnosisGroupREAD
    {
        private static final long serialVersionUID = 1L;
        
        public PrimaryDiagnosisGroupREADImpl(org.apache.xmlbeans.SchemaType sType)
        {
            super(sType);
        }
        
        private static final javax.xml.namespace.QName PRIMARYDIAGNOSISREAD$0 = 
            new javax.xml.namespace.QName("http://www.nhsia.nhs.uk/DataStandards/XMLschema/CDS/ns", "PrimaryDiagnosis_READ");
        
        
        /**
         * Gets the "PrimaryDiagnosis_READ" element
         */
        public java.lang.String getPrimaryDiagnosisREAD()
        {
            synchronized (monitor())
            {
                check_orphaned();
                org.apache.xmlbeans.SimpleValue target = null;
                target = (org.apache.xmlbeans.SimpleValue)get_store().find_element_user(PRIMARYDIAGNOSISREAD$0, 0);
                if (target == null)
                {
                    return null;
                }
                return target.getStringValue();
            }
        }
        
        /**
         * Gets (as xml) the "PrimaryDiagnosis_READ" element
         */
        public uk.nhs.nhsia.datastandards.ecds.PrimaryDiagnosisREADType xgetPrimaryDiagnosisREAD()
        {
            synchronized (monitor())
            {
                check_orphaned();
                uk.nhs.nhsia.datastandards.ecds.PrimaryDiagnosisREADType target = null;
                target = (uk.nhs.nhsia.datastandards.ecds.PrimaryDiagnosisREADType)get_store().find_element_user(PRIMARYDIAGNOSISREAD$0, 0);
                return target;
            }
        }
        
        /**
         * Sets the "PrimaryDiagnosis_READ" element
         */
        public void setPrimaryDiagnosisREAD(java.lang.String primaryDiagnosisREAD)
        {
            synchronized (monitor())
            {
                check_orphaned();
                org.apache.xmlbeans.SimpleValue target = null;
                target = (org.apache.xmlbeans.SimpleValue)get_store().find_element_user(PRIMARYDIAGNOSISREAD$0, 0);
                if (target == null)
                {
                    target = (org.apache.xmlbeans.SimpleValue)get_store().add_element_user(PRIMARYDIAGNOSISREAD$0);
                }
                target.setStringValue(primaryDiagnosisREAD);
            }
        }
        
        /**
         * Sets (as xml) the "PrimaryDiagnosis_READ" element
         */
        public void xsetPrimaryDiagnosisREAD(uk.nhs.nhsia.datastandards.ecds.PrimaryDiagnosisREADType primaryDiagnosisREAD)
        {
            synchronized (monitor())
            {
                check_orphaned();
                uk.nhs.nhsia.datastandards.ecds.PrimaryDiagnosisREADType target = null;
                target = (uk.nhs.nhsia.datastandards.ecds.PrimaryDiagnosisREADType)get_store().find_element_user(PRIMARYDIAGNOSISREAD$0, 0);
                if (target == null)
                {
                    target = (uk.nhs.nhsia.datastandards.ecds.PrimaryDiagnosisREADType)get_store().add_element_user(PRIMARYDIAGNOSISREAD$0);
                }
                target.set(primaryDiagnosisREAD);
            }
        }
    }
    /**
     * An XML SecondaryDiagnosisGroupREAD(@http://www.nhsia.nhs.uk/DataStandards/XMLschema/CDS/ns).
     *
     * This is a complex type.
     */
    public static class SecondaryDiagnosisGroupREADImpl extends org.apache.xmlbeans.impl.values.XmlComplexContentImpl implements uk.nhs.nhsia.datastandards.ecds.ClinicalDiagnosisGroupREADType.SecondaryDiagnosisGroupREAD
    {
        private static final long serialVersionUID = 1L;
        
        public SecondaryDiagnosisGroupREADImpl(org.apache.xmlbeans.SchemaType sType)
        {
            super(sType);
        }
        
        private static final javax.xml.namespace.QName SECONDARYDIAGNOSISREAD$0 = 
            new javax.xml.namespace.QName("http://www.nhsia.nhs.uk/DataStandards/XMLschema/CDS/ns", "SecondaryDiagnosis_READ");
        
        
        /**
         * Gets the "SecondaryDiagnosis_READ" element
         */
        public java.lang.String getSecondaryDiagnosisREAD()
        {
            synchronized (monitor())
            {
                check_orphaned();
                org.apache.xmlbeans.SimpleValue target = null;
                target = (org.apache.xmlbeans.SimpleValue)get_store().find_element_user(SECONDARYDIAGNOSISREAD$0, 0);
                if (target == null)
                {
                    return null;
                }
                return target.getStringValue();
            }
        }
        
        /**
         * Gets (as xml) the "SecondaryDiagnosis_READ" element
         */
        public uk.nhs.nhsia.datastandards.ecds.SecondaryDiagnosisREADType xgetSecondaryDiagnosisREAD()
        {
            synchronized (monitor())
            {
                check_orphaned();
                uk.nhs.nhsia.datastandards.ecds.SecondaryDiagnosisREADType target = null;
                target = (uk.nhs.nhsia.datastandards.ecds.SecondaryDiagnosisREADType)get_store().find_element_user(SECONDARYDIAGNOSISREAD$0, 0);
                return target;
            }
        }
        
        /**
         * Sets the "SecondaryDiagnosis_READ" element
         */
        public void setSecondaryDiagnosisREAD(java.lang.String secondaryDiagnosisREAD)
        {
            synchronized (monitor())
            {
                check_orphaned();
                org.apache.xmlbeans.SimpleValue target = null;
                target = (org.apache.xmlbeans.SimpleValue)get_store().find_element_user(SECONDARYDIAGNOSISREAD$0, 0);
                if (target == null)
                {
                    target = (org.apache.xmlbeans.SimpleValue)get_store().add_element_user(SECONDARYDIAGNOSISREAD$0);
                }
                target.setStringValue(secondaryDiagnosisREAD);
            }
        }
        
        /**
         * Sets (as xml) the "SecondaryDiagnosis_READ" element
         */
        public void xsetSecondaryDiagnosisREAD(uk.nhs.nhsia.datastandards.ecds.SecondaryDiagnosisREADType secondaryDiagnosisREAD)
        {
            synchronized (monitor())
            {
                check_orphaned();
                uk.nhs.nhsia.datastandards.ecds.SecondaryDiagnosisREADType target = null;
                target = (uk.nhs.nhsia.datastandards.ecds.SecondaryDiagnosisREADType)get_store().find_element_user(SECONDARYDIAGNOSISREAD$0, 0);
                if (target == null)
                {
                    target = (uk.nhs.nhsia.datastandards.ecds.SecondaryDiagnosisREADType)get_store().add_element_user(SECONDARYDIAGNOSISREAD$0);
                }
                target.set(secondaryDiagnosisREAD);
            }
        }
    }
}
