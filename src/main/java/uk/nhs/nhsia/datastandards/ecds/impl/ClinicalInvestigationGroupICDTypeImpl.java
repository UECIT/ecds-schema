/*
 * XML Type:  ClinicalInvestigationGroupICD_Type
 * Namespace: http://www.nhsia.nhs.uk/DataStandards/XMLschema/CDS/ns
 * Java type: uk.nhs.nhsia.datastandards.ecds.ClinicalInvestigationGroupICDType
 *
 * Automatically generated - do not modify.
 */
package uk.nhs.nhsia.datastandards.ecds.impl;
/**
 * An XML ClinicalInvestigationGroupICD_Type(@http://www.nhsia.nhs.uk/DataStandards/XMLschema/CDS/ns).
 *
 * This is a complex type.
 */
public class ClinicalInvestigationGroupICDTypeImpl extends org.apache.xmlbeans.impl.values.XmlComplexContentImpl implements uk.nhs.nhsia.datastandards.ecds.ClinicalInvestigationGroupICDType
{
    private static final long serialVersionUID = 1L;
    
    public ClinicalInvestigationGroupICDTypeImpl(org.apache.xmlbeans.SchemaType sType)
    {
        super(sType);
    }
    
    private static final javax.xml.namespace.QName INVESTIGATIONSCHEMEINUSE$0 = 
        new javax.xml.namespace.QName("http://www.nhsia.nhs.uk/DataStandards/XMLschema/CDS/ns", "InvestigationSchemeInUse");
    private static final javax.xml.namespace.QName PRIMARYINVESTIGATIONGROUPICD$2 = 
        new javax.xml.namespace.QName("http://www.nhsia.nhs.uk/DataStandards/XMLschema/CDS/ns", "PrimaryInvestigationGroupICD");
    private static final javax.xml.namespace.QName SECONDARYINVESTIGATIONGROUPICD$4 = 
        new javax.xml.namespace.QName("http://www.nhsia.nhs.uk/DataStandards/XMLschema/CDS/ns", "SecondaryInvestigationGroupICD");
    
    
    /**
     * Gets the "InvestigationSchemeInUse" element
     */
    public uk.nhs.nhsia.datastandards.ecds.InvestigationSchemeInUseType.Enum getInvestigationSchemeInUse()
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.SimpleValue target = null;
            target = (org.apache.xmlbeans.SimpleValue)get_store().find_element_user(INVESTIGATIONSCHEMEINUSE$0, 0);
            if (target == null)
            {
                return null;
            }
            return (uk.nhs.nhsia.datastandards.ecds.InvestigationSchemeInUseType.Enum)target.getEnumValue();
        }
    }
    
    /**
     * Gets (as xml) the "InvestigationSchemeInUse" element
     */
    public uk.nhs.nhsia.datastandards.ecds.InvestigationSchemeInUseType xgetInvestigationSchemeInUse()
    {
        synchronized (monitor())
        {
            check_orphaned();
            uk.nhs.nhsia.datastandards.ecds.InvestigationSchemeInUseType target = null;
            target = (uk.nhs.nhsia.datastandards.ecds.InvestigationSchemeInUseType)get_store().find_element_user(INVESTIGATIONSCHEMEINUSE$0, 0);
            return target;
        }
    }
    
    /**
     * Sets the "InvestigationSchemeInUse" element
     */
    public void setInvestigationSchemeInUse(uk.nhs.nhsia.datastandards.ecds.InvestigationSchemeInUseType.Enum investigationSchemeInUse)
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.SimpleValue target = null;
            target = (org.apache.xmlbeans.SimpleValue)get_store().find_element_user(INVESTIGATIONSCHEMEINUSE$0, 0);
            if (target == null)
            {
                target = (org.apache.xmlbeans.SimpleValue)get_store().add_element_user(INVESTIGATIONSCHEMEINUSE$0);
            }
            target.setEnumValue(investigationSchemeInUse);
        }
    }
    
    /**
     * Sets (as xml) the "InvestigationSchemeInUse" element
     */
    public void xsetInvestigationSchemeInUse(uk.nhs.nhsia.datastandards.ecds.InvestigationSchemeInUseType investigationSchemeInUse)
    {
        synchronized (monitor())
        {
            check_orphaned();
            uk.nhs.nhsia.datastandards.ecds.InvestigationSchemeInUseType target = null;
            target = (uk.nhs.nhsia.datastandards.ecds.InvestigationSchemeInUseType)get_store().find_element_user(INVESTIGATIONSCHEMEINUSE$0, 0);
            if (target == null)
            {
                target = (uk.nhs.nhsia.datastandards.ecds.InvestigationSchemeInUseType)get_store().add_element_user(INVESTIGATIONSCHEMEINUSE$0);
            }
            target.set(investigationSchemeInUse);
        }
    }
    
    /**
     * Gets the "PrimaryInvestigationGroupICD" element
     */
    public uk.nhs.nhsia.datastandards.ecds.ClinicalInvestigationGroupICDType.PrimaryInvestigationGroupICD getPrimaryInvestigationGroupICD()
    {
        synchronized (monitor())
        {
            check_orphaned();
            uk.nhs.nhsia.datastandards.ecds.ClinicalInvestigationGroupICDType.PrimaryInvestigationGroupICD target = null;
            target = (uk.nhs.nhsia.datastandards.ecds.ClinicalInvestigationGroupICDType.PrimaryInvestigationGroupICD)get_store().find_element_user(PRIMARYINVESTIGATIONGROUPICD$2, 0);
            if (target == null)
            {
                return null;
            }
            return target;
        }
    }
    
    /**
     * Sets the "PrimaryInvestigationGroupICD" element
     */
    public void setPrimaryInvestigationGroupICD(uk.nhs.nhsia.datastandards.ecds.ClinicalInvestigationGroupICDType.PrimaryInvestigationGroupICD primaryInvestigationGroupICD)
    {
        generatedSetterHelperImpl(primaryInvestigationGroupICD, PRIMARYINVESTIGATIONGROUPICD$2, 0, org.apache.xmlbeans.impl.values.XmlObjectBase.KIND_SETTERHELPER_SINGLETON);
    }
    
    /**
     * Appends and returns a new empty "PrimaryInvestigationGroupICD" element
     */
    public uk.nhs.nhsia.datastandards.ecds.ClinicalInvestigationGroupICDType.PrimaryInvestigationGroupICD addNewPrimaryInvestigationGroupICD()
    {
        synchronized (monitor())
        {
            check_orphaned();
            uk.nhs.nhsia.datastandards.ecds.ClinicalInvestigationGroupICDType.PrimaryInvestigationGroupICD target = null;
            target = (uk.nhs.nhsia.datastandards.ecds.ClinicalInvestigationGroupICDType.PrimaryInvestigationGroupICD)get_store().add_element_user(PRIMARYINVESTIGATIONGROUPICD$2);
            return target;
        }
    }
    
    /**
     * Gets array of all "SecondaryInvestigationGroupICD" elements
     */
    public uk.nhs.nhsia.datastandards.ecds.ClinicalInvestigationGroupICDType.SecondaryInvestigationGroupICD[] getSecondaryInvestigationGroupICDArray()
    {
        synchronized (monitor())
        {
            check_orphaned();
            java.util.List targetList = new java.util.ArrayList();
            get_store().find_all_element_users(SECONDARYINVESTIGATIONGROUPICD$4, targetList);
            uk.nhs.nhsia.datastandards.ecds.ClinicalInvestigationGroupICDType.SecondaryInvestigationGroupICD[] result = new uk.nhs.nhsia.datastandards.ecds.ClinicalInvestigationGroupICDType.SecondaryInvestigationGroupICD[targetList.size()];
            targetList.toArray(result);
            return result;
        }
    }
    
    /**
     * Gets ith "SecondaryInvestigationGroupICD" element
     */
    public uk.nhs.nhsia.datastandards.ecds.ClinicalInvestigationGroupICDType.SecondaryInvestigationGroupICD getSecondaryInvestigationGroupICDArray(int i)
    {
        synchronized (monitor())
        {
            check_orphaned();
            uk.nhs.nhsia.datastandards.ecds.ClinicalInvestigationGroupICDType.SecondaryInvestigationGroupICD target = null;
            target = (uk.nhs.nhsia.datastandards.ecds.ClinicalInvestigationGroupICDType.SecondaryInvestigationGroupICD)get_store().find_element_user(SECONDARYINVESTIGATIONGROUPICD$4, i);
            if (target == null)
            {
                throw new IndexOutOfBoundsException();
            }
            return target;
        }
    }
    
    /**
     * Returns number of "SecondaryInvestigationGroupICD" element
     */
    public int sizeOfSecondaryInvestigationGroupICDArray()
    {
        synchronized (monitor())
        {
            check_orphaned();
            return get_store().count_elements(SECONDARYINVESTIGATIONGROUPICD$4);
        }
    }
    
    /**
     * Sets array of all "SecondaryInvestigationGroupICD" element  WARNING: This method is not atomicaly synchronized.
     */
    public void setSecondaryInvestigationGroupICDArray(uk.nhs.nhsia.datastandards.ecds.ClinicalInvestigationGroupICDType.SecondaryInvestigationGroupICD[] secondaryInvestigationGroupICDArray)
    {
        check_orphaned();
        arraySetterHelper(secondaryInvestigationGroupICDArray, SECONDARYINVESTIGATIONGROUPICD$4);
    }
    
    /**
     * Sets ith "SecondaryInvestigationGroupICD" element
     */
    public void setSecondaryInvestigationGroupICDArray(int i, uk.nhs.nhsia.datastandards.ecds.ClinicalInvestigationGroupICDType.SecondaryInvestigationGroupICD secondaryInvestigationGroupICD)
    {
        generatedSetterHelperImpl(secondaryInvestigationGroupICD, SECONDARYINVESTIGATIONGROUPICD$4, i, org.apache.xmlbeans.impl.values.XmlObjectBase.KIND_SETTERHELPER_ARRAYITEM);
    }
    
    /**
     * Inserts and returns a new empty value (as xml) as the ith "SecondaryInvestigationGroupICD" element
     */
    public uk.nhs.nhsia.datastandards.ecds.ClinicalInvestigationGroupICDType.SecondaryInvestigationGroupICD insertNewSecondaryInvestigationGroupICD(int i)
    {
        synchronized (monitor())
        {
            check_orphaned();
            uk.nhs.nhsia.datastandards.ecds.ClinicalInvestigationGroupICDType.SecondaryInvestigationGroupICD target = null;
            target = (uk.nhs.nhsia.datastandards.ecds.ClinicalInvestigationGroupICDType.SecondaryInvestigationGroupICD)get_store().insert_element_user(SECONDARYINVESTIGATIONGROUPICD$4, i);
            return target;
        }
    }
    
    /**
     * Appends and returns a new empty value (as xml) as the last "SecondaryInvestigationGroupICD" element
     */
    public uk.nhs.nhsia.datastandards.ecds.ClinicalInvestigationGroupICDType.SecondaryInvestigationGroupICD addNewSecondaryInvestigationGroupICD()
    {
        synchronized (monitor())
        {
            check_orphaned();
            uk.nhs.nhsia.datastandards.ecds.ClinicalInvestigationGroupICDType.SecondaryInvestigationGroupICD target = null;
            target = (uk.nhs.nhsia.datastandards.ecds.ClinicalInvestigationGroupICDType.SecondaryInvestigationGroupICD)get_store().add_element_user(SECONDARYINVESTIGATIONGROUPICD$4);
            return target;
        }
    }
    
    /**
     * Removes the ith "SecondaryInvestigationGroupICD" element
     */
    public void removeSecondaryInvestigationGroupICD(int i)
    {
        synchronized (monitor())
        {
            check_orphaned();
            get_store().remove_element(SECONDARYINVESTIGATIONGROUPICD$4, i);
        }
    }
    /**
     * An XML PrimaryInvestigationGroupICD(@http://www.nhsia.nhs.uk/DataStandards/XMLschema/CDS/ns).
     *
     * This is a complex type.
     */
    public static class PrimaryInvestigationGroupICDImpl extends org.apache.xmlbeans.impl.values.XmlComplexContentImpl implements uk.nhs.nhsia.datastandards.ecds.ClinicalInvestigationGroupICDType.PrimaryInvestigationGroupICD
    {
        private static final long serialVersionUID = 1L;
        
        public PrimaryInvestigationGroupICDImpl(org.apache.xmlbeans.SchemaType sType)
        {
            super(sType);
        }
        
        private static final javax.xml.namespace.QName PRIMARYINVESTIGATIONICD$0 = 
            new javax.xml.namespace.QName("http://www.nhsia.nhs.uk/DataStandards/XMLschema/CDS/ns", "PrimaryInvestigation_ICD");
        
        
        /**
         * Gets the "PrimaryInvestigation_ICD" element
         */
        public java.lang.String getPrimaryInvestigationICD()
        {
            synchronized (monitor())
            {
                check_orphaned();
                org.apache.xmlbeans.SimpleValue target = null;
                target = (org.apache.xmlbeans.SimpleValue)get_store().find_element_user(PRIMARYINVESTIGATIONICD$0, 0);
                if (target == null)
                {
                    return null;
                }
                return target.getStringValue();
            }
        }
        
        /**
         * Gets (as xml) the "PrimaryInvestigation_ICD" element
         */
        public uk.nhs.nhsia.datastandards.ecds.PrimaryDiagnosisICDType xgetPrimaryInvestigationICD()
        {
            synchronized (monitor())
            {
                check_orphaned();
                uk.nhs.nhsia.datastandards.ecds.PrimaryDiagnosisICDType target = null;
                target = (uk.nhs.nhsia.datastandards.ecds.PrimaryDiagnosisICDType)get_store().find_element_user(PRIMARYINVESTIGATIONICD$0, 0);
                return target;
            }
        }
        
        /**
         * Sets the "PrimaryInvestigation_ICD" element
         */
        public void setPrimaryInvestigationICD(java.lang.String primaryInvestigationICD)
        {
            synchronized (monitor())
            {
                check_orphaned();
                org.apache.xmlbeans.SimpleValue target = null;
                target = (org.apache.xmlbeans.SimpleValue)get_store().find_element_user(PRIMARYINVESTIGATIONICD$0, 0);
                if (target == null)
                {
                    target = (org.apache.xmlbeans.SimpleValue)get_store().add_element_user(PRIMARYINVESTIGATIONICD$0);
                }
                target.setStringValue(primaryInvestigationICD);
            }
        }
        
        /**
         * Sets (as xml) the "PrimaryInvestigation_ICD" element
         */
        public void xsetPrimaryInvestigationICD(uk.nhs.nhsia.datastandards.ecds.PrimaryDiagnosisICDType primaryInvestigationICD)
        {
            synchronized (monitor())
            {
                check_orphaned();
                uk.nhs.nhsia.datastandards.ecds.PrimaryDiagnosisICDType target = null;
                target = (uk.nhs.nhsia.datastandards.ecds.PrimaryDiagnosisICDType)get_store().find_element_user(PRIMARYINVESTIGATIONICD$0, 0);
                if (target == null)
                {
                    target = (uk.nhs.nhsia.datastandards.ecds.PrimaryDiagnosisICDType)get_store().add_element_user(PRIMARYINVESTIGATIONICD$0);
                }
                target.set(primaryInvestigationICD);
            }
        }
    }
    /**
     * An XML SecondaryInvestigationGroupICD(@http://www.nhsia.nhs.uk/DataStandards/XMLschema/CDS/ns).
     *
     * This is a complex type.
     */
    public static class SecondaryInvestigationGroupICDImpl extends org.apache.xmlbeans.impl.values.XmlComplexContentImpl implements uk.nhs.nhsia.datastandards.ecds.ClinicalInvestigationGroupICDType.SecondaryInvestigationGroupICD
    {
        private static final long serialVersionUID = 1L;
        
        public SecondaryInvestigationGroupICDImpl(org.apache.xmlbeans.SchemaType sType)
        {
            super(sType);
        }
        
        private static final javax.xml.namespace.QName SECONDARYINVESTIGATIONICD$0 = 
            new javax.xml.namespace.QName("http://www.nhsia.nhs.uk/DataStandards/XMLschema/CDS/ns", "SecondaryInvestigation_ICD");
        
        
        /**
         * Gets the "SecondaryInvestigation_ICD" element
         */
        public java.lang.String getSecondaryInvestigationICD()
        {
            synchronized (monitor())
            {
                check_orphaned();
                org.apache.xmlbeans.SimpleValue target = null;
                target = (org.apache.xmlbeans.SimpleValue)get_store().find_element_user(SECONDARYINVESTIGATIONICD$0, 0);
                if (target == null)
                {
                    return null;
                }
                return target.getStringValue();
            }
        }
        
        /**
         * Gets (as xml) the "SecondaryInvestigation_ICD" element
         */
        public uk.nhs.nhsia.datastandards.ecds.PrimaryDiagnosisICDType xgetSecondaryInvestigationICD()
        {
            synchronized (monitor())
            {
                check_orphaned();
                uk.nhs.nhsia.datastandards.ecds.PrimaryDiagnosisICDType target = null;
                target = (uk.nhs.nhsia.datastandards.ecds.PrimaryDiagnosisICDType)get_store().find_element_user(SECONDARYINVESTIGATIONICD$0, 0);
                return target;
            }
        }
        
        /**
         * Sets the "SecondaryInvestigation_ICD" element
         */
        public void setSecondaryInvestigationICD(java.lang.String secondaryInvestigationICD)
        {
            synchronized (monitor())
            {
                check_orphaned();
                org.apache.xmlbeans.SimpleValue target = null;
                target = (org.apache.xmlbeans.SimpleValue)get_store().find_element_user(SECONDARYINVESTIGATIONICD$0, 0);
                if (target == null)
                {
                    target = (org.apache.xmlbeans.SimpleValue)get_store().add_element_user(SECONDARYINVESTIGATIONICD$0);
                }
                target.setStringValue(secondaryInvestigationICD);
            }
        }
        
        /**
         * Sets (as xml) the "SecondaryInvestigation_ICD" element
         */
        public void xsetSecondaryInvestigationICD(uk.nhs.nhsia.datastandards.ecds.PrimaryDiagnosisICDType secondaryInvestigationICD)
        {
            synchronized (monitor())
            {
                check_orphaned();
                uk.nhs.nhsia.datastandards.ecds.PrimaryDiagnosisICDType target = null;
                target = (uk.nhs.nhsia.datastandards.ecds.PrimaryDiagnosisICDType)get_store().find_element_user(SECONDARYINVESTIGATIONICD$0, 0);
                if (target == null)
                {
                    target = (uk.nhs.nhsia.datastandards.ecds.PrimaryDiagnosisICDType)get_store().add_element_user(SECONDARYINVESTIGATIONICD$0);
                }
                target.set(secondaryInvestigationICD);
            }
        }
    }
}
