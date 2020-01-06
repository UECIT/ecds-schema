/*
 * XML Type:  ClinicalDiagnosisGroupAAndE_Type
 * Namespace: http://www.nhsia.nhs.uk/DataStandards/XMLschema/CDS/ns
 * Java type: uk.nhs.nhsia.datastandards.ecds.ClinicalDiagnosisGroupAAndEType
 *
 * Automatically generated - do not modify.
 */
package uk.nhs.nhsia.datastandards.ecds.impl;
/**
 * An XML ClinicalDiagnosisGroupAAndE_Type(@http://www.nhsia.nhs.uk/DataStandards/XMLschema/CDS/ns).
 *
 * This is a complex type.
 */
public class ClinicalDiagnosisGroupAAndETypeImpl extends org.apache.xmlbeans.impl.values.XmlComplexContentImpl implements uk.nhs.nhsia.datastandards.ecds.ClinicalDiagnosisGroupAAndEType
{
    private static final long serialVersionUID = 1L;
    
    public ClinicalDiagnosisGroupAAndETypeImpl(org.apache.xmlbeans.SchemaType sType)
    {
        super(sType);
    }
    
    private static final javax.xml.namespace.QName DIAGNOSISSCHEMEINUSE$0 = 
        new javax.xml.namespace.QName("http://www.nhsia.nhs.uk/DataStandards/XMLschema/CDS/ns", "DiagnosisSchemeInUse");
    private static final javax.xml.namespace.QName PRIMARYDIAGNOSISGROUPAANDE$2 = 
        new javax.xml.namespace.QName("http://www.nhsia.nhs.uk/DataStandards/XMLschema/CDS/ns", "PrimaryDiagnosisGroupAAndE");
    private static final javax.xml.namespace.QName SECONDARYDIAGNOSISGROUPAANDE$4 = 
        new javax.xml.namespace.QName("http://www.nhsia.nhs.uk/DataStandards/XMLschema/CDS/ns", "SecondaryDiagnosisGroupAAndE");
    
    
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
     * Gets the "PrimaryDiagnosisGroupAAndE" element
     */
    public uk.nhs.nhsia.datastandards.ecds.ClinicalDiagnosisGroupAAndEType.PrimaryDiagnosisGroupAAndE getPrimaryDiagnosisGroupAAndE()
    {
        synchronized (monitor())
        {
            check_orphaned();
            uk.nhs.nhsia.datastandards.ecds.ClinicalDiagnosisGroupAAndEType.PrimaryDiagnosisGroupAAndE target = null;
            target = (uk.nhs.nhsia.datastandards.ecds.ClinicalDiagnosisGroupAAndEType.PrimaryDiagnosisGroupAAndE)get_store().find_element_user(PRIMARYDIAGNOSISGROUPAANDE$2, 0);
            if (target == null)
            {
                return null;
            }
            return target;
        }
    }
    
    /**
     * Sets the "PrimaryDiagnosisGroupAAndE" element
     */
    public void setPrimaryDiagnosisGroupAAndE(uk.nhs.nhsia.datastandards.ecds.ClinicalDiagnosisGroupAAndEType.PrimaryDiagnosisGroupAAndE primaryDiagnosisGroupAAndE)
    {
        generatedSetterHelperImpl(primaryDiagnosisGroupAAndE, PRIMARYDIAGNOSISGROUPAANDE$2, 0, org.apache.xmlbeans.impl.values.XmlObjectBase.KIND_SETTERHELPER_SINGLETON);
    }
    
    /**
     * Appends and returns a new empty "PrimaryDiagnosisGroupAAndE" element
     */
    public uk.nhs.nhsia.datastandards.ecds.ClinicalDiagnosisGroupAAndEType.PrimaryDiagnosisGroupAAndE addNewPrimaryDiagnosisGroupAAndE()
    {
        synchronized (monitor())
        {
            check_orphaned();
            uk.nhs.nhsia.datastandards.ecds.ClinicalDiagnosisGroupAAndEType.PrimaryDiagnosisGroupAAndE target = null;
            target = (uk.nhs.nhsia.datastandards.ecds.ClinicalDiagnosisGroupAAndEType.PrimaryDiagnosisGroupAAndE)get_store().add_element_user(PRIMARYDIAGNOSISGROUPAANDE$2);
            return target;
        }
    }
    
    /**
     * Gets array of all "SecondaryDiagnosisGroupAAndE" elements
     */
    public uk.nhs.nhsia.datastandards.ecds.ClinicalDiagnosisGroupAAndEType.SecondaryDiagnosisGroupAAndE[] getSecondaryDiagnosisGroupAAndEArray()
    {
        synchronized (monitor())
        {
            check_orphaned();
            java.util.List targetList = new java.util.ArrayList();
            get_store().find_all_element_users(SECONDARYDIAGNOSISGROUPAANDE$4, targetList);
            uk.nhs.nhsia.datastandards.ecds.ClinicalDiagnosisGroupAAndEType.SecondaryDiagnosisGroupAAndE[] result = new uk.nhs.nhsia.datastandards.ecds.ClinicalDiagnosisGroupAAndEType.SecondaryDiagnosisGroupAAndE[targetList.size()];
            targetList.toArray(result);
            return result;
        }
    }
    
    /**
     * Gets ith "SecondaryDiagnosisGroupAAndE" element
     */
    public uk.nhs.nhsia.datastandards.ecds.ClinicalDiagnosisGroupAAndEType.SecondaryDiagnosisGroupAAndE getSecondaryDiagnosisGroupAAndEArray(int i)
    {
        synchronized (monitor())
        {
            check_orphaned();
            uk.nhs.nhsia.datastandards.ecds.ClinicalDiagnosisGroupAAndEType.SecondaryDiagnosisGroupAAndE target = null;
            target = (uk.nhs.nhsia.datastandards.ecds.ClinicalDiagnosisGroupAAndEType.SecondaryDiagnosisGroupAAndE)get_store().find_element_user(SECONDARYDIAGNOSISGROUPAANDE$4, i);
            if (target == null)
            {
                throw new IndexOutOfBoundsException();
            }
            return target;
        }
    }
    
    /**
     * Returns number of "SecondaryDiagnosisGroupAAndE" element
     */
    public int sizeOfSecondaryDiagnosisGroupAAndEArray()
    {
        synchronized (monitor())
        {
            check_orphaned();
            return get_store().count_elements(SECONDARYDIAGNOSISGROUPAANDE$4);
        }
    }
    
    /**
     * Sets array of all "SecondaryDiagnosisGroupAAndE" element  WARNING: This method is not atomicaly synchronized.
     */
    public void setSecondaryDiagnosisGroupAAndEArray(uk.nhs.nhsia.datastandards.ecds.ClinicalDiagnosisGroupAAndEType.SecondaryDiagnosisGroupAAndE[] secondaryDiagnosisGroupAAndEArray)
    {
        check_orphaned();
        arraySetterHelper(secondaryDiagnosisGroupAAndEArray, SECONDARYDIAGNOSISGROUPAANDE$4);
    }
    
    /**
     * Sets ith "SecondaryDiagnosisGroupAAndE" element
     */
    public void setSecondaryDiagnosisGroupAAndEArray(int i, uk.nhs.nhsia.datastandards.ecds.ClinicalDiagnosisGroupAAndEType.SecondaryDiagnosisGroupAAndE secondaryDiagnosisGroupAAndE)
    {
        generatedSetterHelperImpl(secondaryDiagnosisGroupAAndE, SECONDARYDIAGNOSISGROUPAANDE$4, i, org.apache.xmlbeans.impl.values.XmlObjectBase.KIND_SETTERHELPER_ARRAYITEM);
    }
    
    /**
     * Inserts and returns a new empty value (as xml) as the ith "SecondaryDiagnosisGroupAAndE" element
     */
    public uk.nhs.nhsia.datastandards.ecds.ClinicalDiagnosisGroupAAndEType.SecondaryDiagnosisGroupAAndE insertNewSecondaryDiagnosisGroupAAndE(int i)
    {
        synchronized (monitor())
        {
            check_orphaned();
            uk.nhs.nhsia.datastandards.ecds.ClinicalDiagnosisGroupAAndEType.SecondaryDiagnosisGroupAAndE target = null;
            target = (uk.nhs.nhsia.datastandards.ecds.ClinicalDiagnosisGroupAAndEType.SecondaryDiagnosisGroupAAndE)get_store().insert_element_user(SECONDARYDIAGNOSISGROUPAANDE$4, i);
            return target;
        }
    }
    
    /**
     * Appends and returns a new empty value (as xml) as the last "SecondaryDiagnosisGroupAAndE" element
     */
    public uk.nhs.nhsia.datastandards.ecds.ClinicalDiagnosisGroupAAndEType.SecondaryDiagnosisGroupAAndE addNewSecondaryDiagnosisGroupAAndE()
    {
        synchronized (monitor())
        {
            check_orphaned();
            uk.nhs.nhsia.datastandards.ecds.ClinicalDiagnosisGroupAAndEType.SecondaryDiagnosisGroupAAndE target = null;
            target = (uk.nhs.nhsia.datastandards.ecds.ClinicalDiagnosisGroupAAndEType.SecondaryDiagnosisGroupAAndE)get_store().add_element_user(SECONDARYDIAGNOSISGROUPAANDE$4);
            return target;
        }
    }
    
    /**
     * Removes the ith "SecondaryDiagnosisGroupAAndE" element
     */
    public void removeSecondaryDiagnosisGroupAAndE(int i)
    {
        synchronized (monitor())
        {
            check_orphaned();
            get_store().remove_element(SECONDARYDIAGNOSISGROUPAANDE$4, i);
        }
    }
    /**
     * An XML PrimaryDiagnosisGroupAAndE(@http://www.nhsia.nhs.uk/DataStandards/XMLschema/CDS/ns).
     *
     * This is a complex type.
     */
    public static class PrimaryDiagnosisGroupAAndEImpl extends org.apache.xmlbeans.impl.values.XmlComplexContentImpl implements uk.nhs.nhsia.datastandards.ecds.ClinicalDiagnosisGroupAAndEType.PrimaryDiagnosisGroupAAndE
    {
        private static final long serialVersionUID = 1L;
        
        public PrimaryDiagnosisGroupAAndEImpl(org.apache.xmlbeans.SchemaType sType)
        {
            super(sType);
        }
        
        private static final javax.xml.namespace.QName PRIMARYDIAGNOSISAANDE$0 = 
            new javax.xml.namespace.QName("http://www.nhsia.nhs.uk/DataStandards/XMLschema/CDS/ns", "PrimaryDiagnosis_AAndE");
        
        
        /**
         * Gets the "PrimaryDiagnosis_AAndE" element
         */
        public java.lang.String getPrimaryDiagnosisAAndE()
        {
            synchronized (monitor())
            {
                check_orphaned();
                org.apache.xmlbeans.SimpleValue target = null;
                target = (org.apache.xmlbeans.SimpleValue)get_store().find_element_user(PRIMARYDIAGNOSISAANDE$0, 0);
                if (target == null)
                {
                    return null;
                }
                return target.getStringValue();
            }
        }
        
        /**
         * Gets (as xml) the "PrimaryDiagnosis_AAndE" element
         */
        public uk.nhs.nhsia.datastandards.ecds.AAndEDiagnosisType xgetPrimaryDiagnosisAAndE()
        {
            synchronized (monitor())
            {
                check_orphaned();
                uk.nhs.nhsia.datastandards.ecds.AAndEDiagnosisType target = null;
                target = (uk.nhs.nhsia.datastandards.ecds.AAndEDiagnosisType)get_store().find_element_user(PRIMARYDIAGNOSISAANDE$0, 0);
                return target;
            }
        }
        
        /**
         * Sets the "PrimaryDiagnosis_AAndE" element
         */
        public void setPrimaryDiagnosisAAndE(java.lang.String primaryDiagnosisAAndE)
        {
            synchronized (monitor())
            {
                check_orphaned();
                org.apache.xmlbeans.SimpleValue target = null;
                target = (org.apache.xmlbeans.SimpleValue)get_store().find_element_user(PRIMARYDIAGNOSISAANDE$0, 0);
                if (target == null)
                {
                    target = (org.apache.xmlbeans.SimpleValue)get_store().add_element_user(PRIMARYDIAGNOSISAANDE$0);
                }
                target.setStringValue(primaryDiagnosisAAndE);
            }
        }
        
        /**
         * Sets (as xml) the "PrimaryDiagnosis_AAndE" element
         */
        public void xsetPrimaryDiagnosisAAndE(uk.nhs.nhsia.datastandards.ecds.AAndEDiagnosisType primaryDiagnosisAAndE)
        {
            synchronized (monitor())
            {
                check_orphaned();
                uk.nhs.nhsia.datastandards.ecds.AAndEDiagnosisType target = null;
                target = (uk.nhs.nhsia.datastandards.ecds.AAndEDiagnosisType)get_store().find_element_user(PRIMARYDIAGNOSISAANDE$0, 0);
                if (target == null)
                {
                    target = (uk.nhs.nhsia.datastandards.ecds.AAndEDiagnosisType)get_store().add_element_user(PRIMARYDIAGNOSISAANDE$0);
                }
                target.set(primaryDiagnosisAAndE);
            }
        }
    }
    /**
     * An XML SecondaryDiagnosisGroupAAndE(@http://www.nhsia.nhs.uk/DataStandards/XMLschema/CDS/ns).
     *
     * This is a complex type.
     */
    public static class SecondaryDiagnosisGroupAAndEImpl extends org.apache.xmlbeans.impl.values.XmlComplexContentImpl implements uk.nhs.nhsia.datastandards.ecds.ClinicalDiagnosisGroupAAndEType.SecondaryDiagnosisGroupAAndE
    {
        private static final long serialVersionUID = 1L;
        
        public SecondaryDiagnosisGroupAAndEImpl(org.apache.xmlbeans.SchemaType sType)
        {
            super(sType);
        }
        
        private static final javax.xml.namespace.QName SECONDARYDIAGNOSISAANDE$0 = 
            new javax.xml.namespace.QName("http://www.nhsia.nhs.uk/DataStandards/XMLschema/CDS/ns", "SecondaryDiagnosis_AandE");
        
        
        /**
         * Gets the "SecondaryDiagnosis_AandE" element
         */
        public java.lang.String getSecondaryDiagnosisAandE()
        {
            synchronized (monitor())
            {
                check_orphaned();
                org.apache.xmlbeans.SimpleValue target = null;
                target = (org.apache.xmlbeans.SimpleValue)get_store().find_element_user(SECONDARYDIAGNOSISAANDE$0, 0);
                if (target == null)
                {
                    return null;
                }
                return target.getStringValue();
            }
        }
        
        /**
         * Gets (as xml) the "SecondaryDiagnosis_AandE" element
         */
        public uk.nhs.nhsia.datastandards.ecds.AAndEDiagnosisType xgetSecondaryDiagnosisAandE()
        {
            synchronized (monitor())
            {
                check_orphaned();
                uk.nhs.nhsia.datastandards.ecds.AAndEDiagnosisType target = null;
                target = (uk.nhs.nhsia.datastandards.ecds.AAndEDiagnosisType)get_store().find_element_user(SECONDARYDIAGNOSISAANDE$0, 0);
                return target;
            }
        }
        
        /**
         * Sets the "SecondaryDiagnosis_AandE" element
         */
        public void setSecondaryDiagnosisAandE(java.lang.String secondaryDiagnosisAandE)
        {
            synchronized (monitor())
            {
                check_orphaned();
                org.apache.xmlbeans.SimpleValue target = null;
                target = (org.apache.xmlbeans.SimpleValue)get_store().find_element_user(SECONDARYDIAGNOSISAANDE$0, 0);
                if (target == null)
                {
                    target = (org.apache.xmlbeans.SimpleValue)get_store().add_element_user(SECONDARYDIAGNOSISAANDE$0);
                }
                target.setStringValue(secondaryDiagnosisAandE);
            }
        }
        
        /**
         * Sets (as xml) the "SecondaryDiagnosis_AandE" element
         */
        public void xsetSecondaryDiagnosisAandE(uk.nhs.nhsia.datastandards.ecds.AAndEDiagnosisType secondaryDiagnosisAandE)
        {
            synchronized (monitor())
            {
                check_orphaned();
                uk.nhs.nhsia.datastandards.ecds.AAndEDiagnosisType target = null;
                target = (uk.nhs.nhsia.datastandards.ecds.AAndEDiagnosisType)get_store().find_element_user(SECONDARYDIAGNOSISAANDE$0, 0);
                if (target == null)
                {
                    target = (uk.nhs.nhsia.datastandards.ecds.AAndEDiagnosisType)get_store().add_element_user(SECONDARYDIAGNOSISAANDE$0);
                }
                target.set(secondaryDiagnosisAandE);
            }
        }
    }
}
