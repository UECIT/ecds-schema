/*
 * XML Type:  ClinicalInvestigationGroupAAndE_Type
 * Namespace: http://www.nhsia.nhs.uk/DataStandards/XMLschema/CDS/ns
 * Java type: uk.nhs.nhsia.datastandards.ecds.ClinicalInvestigationGroupAAndEType
 *
 * Automatically generated - do not modify.
 */
package uk.nhs.nhsia.datastandards.ecds.impl;
/**
 * An XML ClinicalInvestigationGroupAAndE_Type(@http://www.nhsia.nhs.uk/DataStandards/XMLschema/CDS/ns).
 *
 * This is a complex type.
 */
public class ClinicalInvestigationGroupAAndETypeImpl extends org.apache.xmlbeans.impl.values.XmlComplexContentImpl implements uk.nhs.nhsia.datastandards.ecds.ClinicalInvestigationGroupAAndEType
{
    private static final long serialVersionUID = 1L;
    
    public ClinicalInvestigationGroupAAndETypeImpl(org.apache.xmlbeans.SchemaType sType)
    {
        super(sType);
    }
    
    private static final javax.xml.namespace.QName INVESTIGATIONSCHEMEINUSE$0 = 
        new javax.xml.namespace.QName("http://www.nhsia.nhs.uk/DataStandards/XMLschema/CDS/ns", "InvestigationSchemeInUse");
    private static final javax.xml.namespace.QName PRIMARYINVESTIGATIONGROUPAANDE$2 = 
        new javax.xml.namespace.QName("http://www.nhsia.nhs.uk/DataStandards/XMLschema/CDS/ns", "PrimaryInvestigationGroupAAndE");
    private static final javax.xml.namespace.QName SECONDARYINVESTIGATIONGROUPAANDE$4 = 
        new javax.xml.namespace.QName("http://www.nhsia.nhs.uk/DataStandards/XMLschema/CDS/ns", "SecondaryInvestigationGroupAAndE");
    
    
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
     * Gets the "PrimaryInvestigationGroupAAndE" element
     */
    public uk.nhs.nhsia.datastandards.ecds.ClinicalInvestigationGroupAAndEType.PrimaryInvestigationGroupAAndE getPrimaryInvestigationGroupAAndE()
    {
        synchronized (monitor())
        {
            check_orphaned();
            uk.nhs.nhsia.datastandards.ecds.ClinicalInvestigationGroupAAndEType.PrimaryInvestigationGroupAAndE target = null;
            target = (uk.nhs.nhsia.datastandards.ecds.ClinicalInvestigationGroupAAndEType.PrimaryInvestigationGroupAAndE)get_store().find_element_user(PRIMARYINVESTIGATIONGROUPAANDE$2, 0);
            if (target == null)
            {
                return null;
            }
            return target;
        }
    }
    
    /**
     * Sets the "PrimaryInvestigationGroupAAndE" element
     */
    public void setPrimaryInvestigationGroupAAndE(uk.nhs.nhsia.datastandards.ecds.ClinicalInvestigationGroupAAndEType.PrimaryInvestigationGroupAAndE primaryInvestigationGroupAAndE)
    {
        generatedSetterHelperImpl(primaryInvestigationGroupAAndE, PRIMARYINVESTIGATIONGROUPAANDE$2, 0, org.apache.xmlbeans.impl.values.XmlObjectBase.KIND_SETTERHELPER_SINGLETON);
    }
    
    /**
     * Appends and returns a new empty "PrimaryInvestigationGroupAAndE" element
     */
    public uk.nhs.nhsia.datastandards.ecds.ClinicalInvestigationGroupAAndEType.PrimaryInvestigationGroupAAndE addNewPrimaryInvestigationGroupAAndE()
    {
        synchronized (monitor())
        {
            check_orphaned();
            uk.nhs.nhsia.datastandards.ecds.ClinicalInvestigationGroupAAndEType.PrimaryInvestigationGroupAAndE target = null;
            target = (uk.nhs.nhsia.datastandards.ecds.ClinicalInvestigationGroupAAndEType.PrimaryInvestigationGroupAAndE)get_store().add_element_user(PRIMARYINVESTIGATIONGROUPAANDE$2);
            return target;
        }
    }
    
    /**
     * Gets array of all "SecondaryInvestigationGroupAAndE" elements
     */
    public uk.nhs.nhsia.datastandards.ecds.ClinicalInvestigationGroupAAndEType.SecondaryInvestigationGroupAAndE[] getSecondaryInvestigationGroupAAndEArray()
    {
        synchronized (monitor())
        {
            check_orphaned();
            java.util.List targetList = new java.util.ArrayList();
            get_store().find_all_element_users(SECONDARYINVESTIGATIONGROUPAANDE$4, targetList);
            uk.nhs.nhsia.datastandards.ecds.ClinicalInvestigationGroupAAndEType.SecondaryInvestigationGroupAAndE[] result = new uk.nhs.nhsia.datastandards.ecds.ClinicalInvestigationGroupAAndEType.SecondaryInvestigationGroupAAndE[targetList.size()];
            targetList.toArray(result);
            return result;
        }
    }
    
    /**
     * Gets ith "SecondaryInvestigationGroupAAndE" element
     */
    public uk.nhs.nhsia.datastandards.ecds.ClinicalInvestigationGroupAAndEType.SecondaryInvestigationGroupAAndE getSecondaryInvestigationGroupAAndEArray(int i)
    {
        synchronized (monitor())
        {
            check_orphaned();
            uk.nhs.nhsia.datastandards.ecds.ClinicalInvestigationGroupAAndEType.SecondaryInvestigationGroupAAndE target = null;
            target = (uk.nhs.nhsia.datastandards.ecds.ClinicalInvestigationGroupAAndEType.SecondaryInvestigationGroupAAndE)get_store().find_element_user(SECONDARYINVESTIGATIONGROUPAANDE$4, i);
            if (target == null)
            {
                throw new IndexOutOfBoundsException();
            }
            return target;
        }
    }
    
    /**
     * Returns number of "SecondaryInvestigationGroupAAndE" element
     */
    public int sizeOfSecondaryInvestigationGroupAAndEArray()
    {
        synchronized (monitor())
        {
            check_orphaned();
            return get_store().count_elements(SECONDARYINVESTIGATIONGROUPAANDE$4);
        }
    }
    
    /**
     * Sets array of all "SecondaryInvestigationGroupAAndE" element  WARNING: This method is not atomicaly synchronized.
     */
    public void setSecondaryInvestigationGroupAAndEArray(uk.nhs.nhsia.datastandards.ecds.ClinicalInvestigationGroupAAndEType.SecondaryInvestigationGroupAAndE[] secondaryInvestigationGroupAAndEArray)
    {
        check_orphaned();
        arraySetterHelper(secondaryInvestigationGroupAAndEArray, SECONDARYINVESTIGATIONGROUPAANDE$4);
    }
    
    /**
     * Sets ith "SecondaryInvestigationGroupAAndE" element
     */
    public void setSecondaryInvestigationGroupAAndEArray(int i, uk.nhs.nhsia.datastandards.ecds.ClinicalInvestigationGroupAAndEType.SecondaryInvestigationGroupAAndE secondaryInvestigationGroupAAndE)
    {
        generatedSetterHelperImpl(secondaryInvestigationGroupAAndE, SECONDARYINVESTIGATIONGROUPAANDE$4, i, org.apache.xmlbeans.impl.values.XmlObjectBase.KIND_SETTERHELPER_ARRAYITEM);
    }
    
    /**
     * Inserts and returns a new empty value (as xml) as the ith "SecondaryInvestigationGroupAAndE" element
     */
    public uk.nhs.nhsia.datastandards.ecds.ClinicalInvestigationGroupAAndEType.SecondaryInvestigationGroupAAndE insertNewSecondaryInvestigationGroupAAndE(int i)
    {
        synchronized (monitor())
        {
            check_orphaned();
            uk.nhs.nhsia.datastandards.ecds.ClinicalInvestigationGroupAAndEType.SecondaryInvestigationGroupAAndE target = null;
            target = (uk.nhs.nhsia.datastandards.ecds.ClinicalInvestigationGroupAAndEType.SecondaryInvestigationGroupAAndE)get_store().insert_element_user(SECONDARYINVESTIGATIONGROUPAANDE$4, i);
            return target;
        }
    }
    
    /**
     * Appends and returns a new empty value (as xml) as the last "SecondaryInvestigationGroupAAndE" element
     */
    public uk.nhs.nhsia.datastandards.ecds.ClinicalInvestigationGroupAAndEType.SecondaryInvestigationGroupAAndE addNewSecondaryInvestigationGroupAAndE()
    {
        synchronized (monitor())
        {
            check_orphaned();
            uk.nhs.nhsia.datastandards.ecds.ClinicalInvestigationGroupAAndEType.SecondaryInvestigationGroupAAndE target = null;
            target = (uk.nhs.nhsia.datastandards.ecds.ClinicalInvestigationGroupAAndEType.SecondaryInvestigationGroupAAndE)get_store().add_element_user(SECONDARYINVESTIGATIONGROUPAANDE$4);
            return target;
        }
    }
    
    /**
     * Removes the ith "SecondaryInvestigationGroupAAndE" element
     */
    public void removeSecondaryInvestigationGroupAAndE(int i)
    {
        synchronized (monitor())
        {
            check_orphaned();
            get_store().remove_element(SECONDARYINVESTIGATIONGROUPAANDE$4, i);
        }
    }
    /**
     * An XML PrimaryInvestigationGroupAAndE(@http://www.nhsia.nhs.uk/DataStandards/XMLschema/CDS/ns).
     *
     * This is a complex type.
     */
    public static class PrimaryInvestigationGroupAAndEImpl extends org.apache.xmlbeans.impl.values.XmlComplexContentImpl implements uk.nhs.nhsia.datastandards.ecds.ClinicalInvestigationGroupAAndEType.PrimaryInvestigationGroupAAndE
    {
        private static final long serialVersionUID = 1L;
        
        public PrimaryInvestigationGroupAAndEImpl(org.apache.xmlbeans.SchemaType sType)
        {
            super(sType);
        }
        
        private static final javax.xml.namespace.QName PRIMARYINVESTIGATIONAANDE$0 = 
            new javax.xml.namespace.QName("http://www.nhsia.nhs.uk/DataStandards/XMLschema/CDS/ns", "PrimaryInvestigation_AAndE");
        
        
        /**
         * Gets the "PrimaryInvestigation_AAndE" element
         */
        public java.lang.String getPrimaryInvestigationAAndE()
        {
            synchronized (monitor())
            {
                check_orphaned();
                org.apache.xmlbeans.SimpleValue target = null;
                target = (org.apache.xmlbeans.SimpleValue)get_store().find_element_user(PRIMARYINVESTIGATIONAANDE$0, 0);
                if (target == null)
                {
                    return null;
                }
                return target.getStringValue();
            }
        }
        
        /**
         * Gets (as xml) the "PrimaryInvestigation_AAndE" element
         */
        public uk.nhs.nhsia.datastandards.ecds.AAndEInvestigationType xgetPrimaryInvestigationAAndE()
        {
            synchronized (monitor())
            {
                check_orphaned();
                uk.nhs.nhsia.datastandards.ecds.AAndEInvestigationType target = null;
                target = (uk.nhs.nhsia.datastandards.ecds.AAndEInvestigationType)get_store().find_element_user(PRIMARYINVESTIGATIONAANDE$0, 0);
                return target;
            }
        }
        
        /**
         * Sets the "PrimaryInvestigation_AAndE" element
         */
        public void setPrimaryInvestigationAAndE(java.lang.String primaryInvestigationAAndE)
        {
            synchronized (monitor())
            {
                check_orphaned();
                org.apache.xmlbeans.SimpleValue target = null;
                target = (org.apache.xmlbeans.SimpleValue)get_store().find_element_user(PRIMARYINVESTIGATIONAANDE$0, 0);
                if (target == null)
                {
                    target = (org.apache.xmlbeans.SimpleValue)get_store().add_element_user(PRIMARYINVESTIGATIONAANDE$0);
                }
                target.setStringValue(primaryInvestigationAAndE);
            }
        }
        
        /**
         * Sets (as xml) the "PrimaryInvestigation_AAndE" element
         */
        public void xsetPrimaryInvestigationAAndE(uk.nhs.nhsia.datastandards.ecds.AAndEInvestigationType primaryInvestigationAAndE)
        {
            synchronized (monitor())
            {
                check_orphaned();
                uk.nhs.nhsia.datastandards.ecds.AAndEInvestigationType target = null;
                target = (uk.nhs.nhsia.datastandards.ecds.AAndEInvestigationType)get_store().find_element_user(PRIMARYINVESTIGATIONAANDE$0, 0);
                if (target == null)
                {
                    target = (uk.nhs.nhsia.datastandards.ecds.AAndEInvestigationType)get_store().add_element_user(PRIMARYINVESTIGATIONAANDE$0);
                }
                target.set(primaryInvestigationAAndE);
            }
        }
    }
    /**
     * An XML SecondaryInvestigationGroupAAndE(@http://www.nhsia.nhs.uk/DataStandards/XMLschema/CDS/ns).
     *
     * This is a complex type.
     */
    public static class SecondaryInvestigationGroupAAndEImpl extends org.apache.xmlbeans.impl.values.XmlComplexContentImpl implements uk.nhs.nhsia.datastandards.ecds.ClinicalInvestigationGroupAAndEType.SecondaryInvestigationGroupAAndE
    {
        private static final long serialVersionUID = 1L;
        
        public SecondaryInvestigationGroupAAndEImpl(org.apache.xmlbeans.SchemaType sType)
        {
            super(sType);
        }
        
        private static final javax.xml.namespace.QName SECONDARYINVESTIGATIONAANDE$0 = 
            new javax.xml.namespace.QName("http://www.nhsia.nhs.uk/DataStandards/XMLschema/CDS/ns", "SecondaryInvestigation_AAndE");
        
        
        /**
         * Gets the "SecondaryInvestigation_AAndE" element
         */
        public java.lang.String getSecondaryInvestigationAAndE()
        {
            synchronized (monitor())
            {
                check_orphaned();
                org.apache.xmlbeans.SimpleValue target = null;
                target = (org.apache.xmlbeans.SimpleValue)get_store().find_element_user(SECONDARYINVESTIGATIONAANDE$0, 0);
                if (target == null)
                {
                    return null;
                }
                return target.getStringValue();
            }
        }
        
        /**
         * Gets (as xml) the "SecondaryInvestigation_AAndE" element
         */
        public uk.nhs.nhsia.datastandards.ecds.AAndEInvestigationType xgetSecondaryInvestigationAAndE()
        {
            synchronized (monitor())
            {
                check_orphaned();
                uk.nhs.nhsia.datastandards.ecds.AAndEInvestigationType target = null;
                target = (uk.nhs.nhsia.datastandards.ecds.AAndEInvestigationType)get_store().find_element_user(SECONDARYINVESTIGATIONAANDE$0, 0);
                return target;
            }
        }
        
        /**
         * Sets the "SecondaryInvestigation_AAndE" element
         */
        public void setSecondaryInvestigationAAndE(java.lang.String secondaryInvestigationAAndE)
        {
            synchronized (monitor())
            {
                check_orphaned();
                org.apache.xmlbeans.SimpleValue target = null;
                target = (org.apache.xmlbeans.SimpleValue)get_store().find_element_user(SECONDARYINVESTIGATIONAANDE$0, 0);
                if (target == null)
                {
                    target = (org.apache.xmlbeans.SimpleValue)get_store().add_element_user(SECONDARYINVESTIGATIONAANDE$0);
                }
                target.setStringValue(secondaryInvestigationAAndE);
            }
        }
        
        /**
         * Sets (as xml) the "SecondaryInvestigation_AAndE" element
         */
        public void xsetSecondaryInvestigationAAndE(uk.nhs.nhsia.datastandards.ecds.AAndEInvestigationType secondaryInvestigationAAndE)
        {
            synchronized (monitor())
            {
                check_orphaned();
                uk.nhs.nhsia.datastandards.ecds.AAndEInvestigationType target = null;
                target = (uk.nhs.nhsia.datastandards.ecds.AAndEInvestigationType)get_store().find_element_user(SECONDARYINVESTIGATIONAANDE$0, 0);
                if (target == null)
                {
                    target = (uk.nhs.nhsia.datastandards.ecds.AAndEInvestigationType)get_store().add_element_user(SECONDARYINVESTIGATIONAANDE$0);
                }
                target.set(secondaryInvestigationAAndE);
            }
        }
    }
}
