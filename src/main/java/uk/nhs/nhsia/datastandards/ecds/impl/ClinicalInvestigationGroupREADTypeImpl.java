/*
 * XML Type:  ClinicalInvestigationGroupREAD_Type
 * Namespace: http://www.nhsia.nhs.uk/DataStandards/XMLschema/CDS/ns
 * Java type: uk.nhs.nhsia.datastandards.ecds.ClinicalInvestigationGroupREADType
 *
 * Automatically generated - do not modify.
 */
package uk.nhs.nhsia.datastandards.ecds.impl;
/**
 * An XML ClinicalInvestigationGroupREAD_Type(@http://www.nhsia.nhs.uk/DataStandards/XMLschema/CDS/ns).
 *
 * This is a complex type.
 */
public class ClinicalInvestigationGroupREADTypeImpl extends org.apache.xmlbeans.impl.values.XmlComplexContentImpl implements uk.nhs.nhsia.datastandards.ecds.ClinicalInvestigationGroupREADType
{
    private static final long serialVersionUID = 1L;
    
    public ClinicalInvestigationGroupREADTypeImpl(org.apache.xmlbeans.SchemaType sType)
    {
        super(sType);
    }
    
    private static final javax.xml.namespace.QName INVESTIGATIONSCHEMEINUSE$0 = 
        new javax.xml.namespace.QName("http://www.nhsia.nhs.uk/DataStandards/XMLschema/CDS/ns", "InvestigationSchemeInUse");
    private static final javax.xml.namespace.QName PRIMARYINVESTIGATIONGROUPREAD$2 = 
        new javax.xml.namespace.QName("http://www.nhsia.nhs.uk/DataStandards/XMLschema/CDS/ns", "PrimaryInvestigationGroupREAD");
    private static final javax.xml.namespace.QName SECONDARYINVESTIGATIONGROUPREAD$4 = 
        new javax.xml.namespace.QName("http://www.nhsia.nhs.uk/DataStandards/XMLschema/CDS/ns", "SecondaryInvestigationGroupREAD");
    
    
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
     * Gets the "PrimaryInvestigationGroupREAD" element
     */
    public uk.nhs.nhsia.datastandards.ecds.ClinicalInvestigationGroupREADType.PrimaryInvestigationGroupREAD getPrimaryInvestigationGroupREAD()
    {
        synchronized (monitor())
        {
            check_orphaned();
            uk.nhs.nhsia.datastandards.ecds.ClinicalInvestigationGroupREADType.PrimaryInvestigationGroupREAD target = null;
            target = (uk.nhs.nhsia.datastandards.ecds.ClinicalInvestigationGroupREADType.PrimaryInvestigationGroupREAD)get_store().find_element_user(PRIMARYINVESTIGATIONGROUPREAD$2, 0);
            if (target == null)
            {
                return null;
            }
            return target;
        }
    }
    
    /**
     * Sets the "PrimaryInvestigationGroupREAD" element
     */
    public void setPrimaryInvestigationGroupREAD(uk.nhs.nhsia.datastandards.ecds.ClinicalInvestigationGroupREADType.PrimaryInvestigationGroupREAD primaryInvestigationGroupREAD)
    {
        generatedSetterHelperImpl(primaryInvestigationGroupREAD, PRIMARYINVESTIGATIONGROUPREAD$2, 0, org.apache.xmlbeans.impl.values.XmlObjectBase.KIND_SETTERHELPER_SINGLETON);
    }
    
    /**
     * Appends and returns a new empty "PrimaryInvestigationGroupREAD" element
     */
    public uk.nhs.nhsia.datastandards.ecds.ClinicalInvestigationGroupREADType.PrimaryInvestigationGroupREAD addNewPrimaryInvestigationGroupREAD()
    {
        synchronized (monitor())
        {
            check_orphaned();
            uk.nhs.nhsia.datastandards.ecds.ClinicalInvestigationGroupREADType.PrimaryInvestigationGroupREAD target = null;
            target = (uk.nhs.nhsia.datastandards.ecds.ClinicalInvestigationGroupREADType.PrimaryInvestigationGroupREAD)get_store().add_element_user(PRIMARYINVESTIGATIONGROUPREAD$2);
            return target;
        }
    }
    
    /**
     * Gets array of all "SecondaryInvestigationGroupREAD" elements
     */
    public uk.nhs.nhsia.datastandards.ecds.ClinicalInvestigationGroupREADType.SecondaryInvestigationGroupREAD[] getSecondaryInvestigationGroupREADArray()
    {
        synchronized (monitor())
        {
            check_orphaned();
            java.util.List targetList = new java.util.ArrayList();
            get_store().find_all_element_users(SECONDARYINVESTIGATIONGROUPREAD$4, targetList);
            uk.nhs.nhsia.datastandards.ecds.ClinicalInvestigationGroupREADType.SecondaryInvestigationGroupREAD[] result = new uk.nhs.nhsia.datastandards.ecds.ClinicalInvestigationGroupREADType.SecondaryInvestigationGroupREAD[targetList.size()];
            targetList.toArray(result);
            return result;
        }
    }
    
    /**
     * Gets ith "SecondaryInvestigationGroupREAD" element
     */
    public uk.nhs.nhsia.datastandards.ecds.ClinicalInvestigationGroupREADType.SecondaryInvestigationGroupREAD getSecondaryInvestigationGroupREADArray(int i)
    {
        synchronized (monitor())
        {
            check_orphaned();
            uk.nhs.nhsia.datastandards.ecds.ClinicalInvestigationGroupREADType.SecondaryInvestigationGroupREAD target = null;
            target = (uk.nhs.nhsia.datastandards.ecds.ClinicalInvestigationGroupREADType.SecondaryInvestigationGroupREAD)get_store().find_element_user(SECONDARYINVESTIGATIONGROUPREAD$4, i);
            if (target == null)
            {
                throw new IndexOutOfBoundsException();
            }
            return target;
        }
    }
    
    /**
     * Returns number of "SecondaryInvestigationGroupREAD" element
     */
    public int sizeOfSecondaryInvestigationGroupREADArray()
    {
        synchronized (monitor())
        {
            check_orphaned();
            return get_store().count_elements(SECONDARYINVESTIGATIONGROUPREAD$4);
        }
    }
    
    /**
     * Sets array of all "SecondaryInvestigationGroupREAD" element  WARNING: This method is not atomicaly synchronized.
     */
    public void setSecondaryInvestigationGroupREADArray(uk.nhs.nhsia.datastandards.ecds.ClinicalInvestigationGroupREADType.SecondaryInvestigationGroupREAD[] secondaryInvestigationGroupREADArray)
    {
        check_orphaned();
        arraySetterHelper(secondaryInvestigationGroupREADArray, SECONDARYINVESTIGATIONGROUPREAD$4);
    }
    
    /**
     * Sets ith "SecondaryInvestigationGroupREAD" element
     */
    public void setSecondaryInvestigationGroupREADArray(int i, uk.nhs.nhsia.datastandards.ecds.ClinicalInvestigationGroupREADType.SecondaryInvestigationGroupREAD secondaryInvestigationGroupREAD)
    {
        generatedSetterHelperImpl(secondaryInvestigationGroupREAD, SECONDARYINVESTIGATIONGROUPREAD$4, i, org.apache.xmlbeans.impl.values.XmlObjectBase.KIND_SETTERHELPER_ARRAYITEM);
    }
    
    /**
     * Inserts and returns a new empty value (as xml) as the ith "SecondaryInvestigationGroupREAD" element
     */
    public uk.nhs.nhsia.datastandards.ecds.ClinicalInvestigationGroupREADType.SecondaryInvestigationGroupREAD insertNewSecondaryInvestigationGroupREAD(int i)
    {
        synchronized (monitor())
        {
            check_orphaned();
            uk.nhs.nhsia.datastandards.ecds.ClinicalInvestigationGroupREADType.SecondaryInvestigationGroupREAD target = null;
            target = (uk.nhs.nhsia.datastandards.ecds.ClinicalInvestigationGroupREADType.SecondaryInvestigationGroupREAD)get_store().insert_element_user(SECONDARYINVESTIGATIONGROUPREAD$4, i);
            return target;
        }
    }
    
    /**
     * Appends and returns a new empty value (as xml) as the last "SecondaryInvestigationGroupREAD" element
     */
    public uk.nhs.nhsia.datastandards.ecds.ClinicalInvestigationGroupREADType.SecondaryInvestigationGroupREAD addNewSecondaryInvestigationGroupREAD()
    {
        synchronized (monitor())
        {
            check_orphaned();
            uk.nhs.nhsia.datastandards.ecds.ClinicalInvestigationGroupREADType.SecondaryInvestigationGroupREAD target = null;
            target = (uk.nhs.nhsia.datastandards.ecds.ClinicalInvestigationGroupREADType.SecondaryInvestigationGroupREAD)get_store().add_element_user(SECONDARYINVESTIGATIONGROUPREAD$4);
            return target;
        }
    }
    
    /**
     * Removes the ith "SecondaryInvestigationGroupREAD" element
     */
    public void removeSecondaryInvestigationGroupREAD(int i)
    {
        synchronized (monitor())
        {
            check_orphaned();
            get_store().remove_element(SECONDARYINVESTIGATIONGROUPREAD$4, i);
        }
    }
    /**
     * An XML PrimaryInvestigationGroupREAD(@http://www.nhsia.nhs.uk/DataStandards/XMLschema/CDS/ns).
     *
     * This is a complex type.
     */
    public static class PrimaryInvestigationGroupREADImpl extends org.apache.xmlbeans.impl.values.XmlComplexContentImpl implements uk.nhs.nhsia.datastandards.ecds.ClinicalInvestigationGroupREADType.PrimaryInvestigationGroupREAD
    {
        private static final long serialVersionUID = 1L;
        
        public PrimaryInvestigationGroupREADImpl(org.apache.xmlbeans.SchemaType sType)
        {
            super(sType);
        }
        
        private static final javax.xml.namespace.QName PRIMARYINVESTIGATIONREAD$0 = 
            new javax.xml.namespace.QName("http://www.nhsia.nhs.uk/DataStandards/XMLschema/CDS/ns", "PrimaryInvestigation_READ");
        
        
        /**
         * Gets the "PrimaryInvestigation_READ" element
         */
        public java.lang.String getPrimaryInvestigationREAD()
        {
            synchronized (monitor())
            {
                check_orphaned();
                org.apache.xmlbeans.SimpleValue target = null;
                target = (org.apache.xmlbeans.SimpleValue)get_store().find_element_user(PRIMARYINVESTIGATIONREAD$0, 0);
                if (target == null)
                {
                    return null;
                }
                return target.getStringValue();
            }
        }
        
        /**
         * Gets (as xml) the "PrimaryInvestigation_READ" element
         */
        public uk.nhs.nhsia.datastandards.ecds.PrimaryDiagnosisREADType xgetPrimaryInvestigationREAD()
        {
            synchronized (monitor())
            {
                check_orphaned();
                uk.nhs.nhsia.datastandards.ecds.PrimaryDiagnosisREADType target = null;
                target = (uk.nhs.nhsia.datastandards.ecds.PrimaryDiagnosisREADType)get_store().find_element_user(PRIMARYINVESTIGATIONREAD$0, 0);
                return target;
            }
        }
        
        /**
         * Sets the "PrimaryInvestigation_READ" element
         */
        public void setPrimaryInvestigationREAD(java.lang.String primaryInvestigationREAD)
        {
            synchronized (monitor())
            {
                check_orphaned();
                org.apache.xmlbeans.SimpleValue target = null;
                target = (org.apache.xmlbeans.SimpleValue)get_store().find_element_user(PRIMARYINVESTIGATIONREAD$0, 0);
                if (target == null)
                {
                    target = (org.apache.xmlbeans.SimpleValue)get_store().add_element_user(PRIMARYINVESTIGATIONREAD$0);
                }
                target.setStringValue(primaryInvestigationREAD);
            }
        }
        
        /**
         * Sets (as xml) the "PrimaryInvestigation_READ" element
         */
        public void xsetPrimaryInvestigationREAD(uk.nhs.nhsia.datastandards.ecds.PrimaryDiagnosisREADType primaryInvestigationREAD)
        {
            synchronized (monitor())
            {
                check_orphaned();
                uk.nhs.nhsia.datastandards.ecds.PrimaryDiagnosisREADType target = null;
                target = (uk.nhs.nhsia.datastandards.ecds.PrimaryDiagnosisREADType)get_store().find_element_user(PRIMARYINVESTIGATIONREAD$0, 0);
                if (target == null)
                {
                    target = (uk.nhs.nhsia.datastandards.ecds.PrimaryDiagnosisREADType)get_store().add_element_user(PRIMARYINVESTIGATIONREAD$0);
                }
                target.set(primaryInvestigationREAD);
            }
        }
    }
    /**
     * An XML SecondaryInvestigationGroupREAD(@http://www.nhsia.nhs.uk/DataStandards/XMLschema/CDS/ns).
     *
     * This is a complex type.
     */
    public static class SecondaryInvestigationGroupREADImpl extends org.apache.xmlbeans.impl.values.XmlComplexContentImpl implements uk.nhs.nhsia.datastandards.ecds.ClinicalInvestigationGroupREADType.SecondaryInvestigationGroupREAD
    {
        private static final long serialVersionUID = 1L;
        
        public SecondaryInvestigationGroupREADImpl(org.apache.xmlbeans.SchemaType sType)
        {
            super(sType);
        }
        
        private static final javax.xml.namespace.QName SECONDARYINVESTIGATIONREAD$0 = 
            new javax.xml.namespace.QName("http://www.nhsia.nhs.uk/DataStandards/XMLschema/CDS/ns", "SecondaryInvestigation_READ");
        
        
        /**
         * Gets the "SecondaryInvestigation_READ" element
         */
        public java.lang.String getSecondaryInvestigationREAD()
        {
            synchronized (monitor())
            {
                check_orphaned();
                org.apache.xmlbeans.SimpleValue target = null;
                target = (org.apache.xmlbeans.SimpleValue)get_store().find_element_user(SECONDARYINVESTIGATIONREAD$0, 0);
                if (target == null)
                {
                    return null;
                }
                return target.getStringValue();
            }
        }
        
        /**
         * Gets (as xml) the "SecondaryInvestigation_READ" element
         */
        public uk.nhs.nhsia.datastandards.ecds.PrimaryDiagnosisREADType xgetSecondaryInvestigationREAD()
        {
            synchronized (monitor())
            {
                check_orphaned();
                uk.nhs.nhsia.datastandards.ecds.PrimaryDiagnosisREADType target = null;
                target = (uk.nhs.nhsia.datastandards.ecds.PrimaryDiagnosisREADType)get_store().find_element_user(SECONDARYINVESTIGATIONREAD$0, 0);
                return target;
            }
        }
        
        /**
         * Sets the "SecondaryInvestigation_READ" element
         */
        public void setSecondaryInvestigationREAD(java.lang.String secondaryInvestigationREAD)
        {
            synchronized (monitor())
            {
                check_orphaned();
                org.apache.xmlbeans.SimpleValue target = null;
                target = (org.apache.xmlbeans.SimpleValue)get_store().find_element_user(SECONDARYINVESTIGATIONREAD$0, 0);
                if (target == null)
                {
                    target = (org.apache.xmlbeans.SimpleValue)get_store().add_element_user(SECONDARYINVESTIGATIONREAD$0);
                }
                target.setStringValue(secondaryInvestigationREAD);
            }
        }
        
        /**
         * Sets (as xml) the "SecondaryInvestigation_READ" element
         */
        public void xsetSecondaryInvestigationREAD(uk.nhs.nhsia.datastandards.ecds.PrimaryDiagnosisREADType secondaryInvestigationREAD)
        {
            synchronized (monitor())
            {
                check_orphaned();
                uk.nhs.nhsia.datastandards.ecds.PrimaryDiagnosisREADType target = null;
                target = (uk.nhs.nhsia.datastandards.ecds.PrimaryDiagnosisREADType)get_store().find_element_user(SECONDARYINVESTIGATIONREAD$0, 0);
                if (target == null)
                {
                    target = (uk.nhs.nhsia.datastandards.ecds.PrimaryDiagnosisREADType)get_store().add_element_user(SECONDARYINVESTIGATIONREAD$0);
                }
                target.set(secondaryInvestigationREAD);
            }
        }
    }
}
