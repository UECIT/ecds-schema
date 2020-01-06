/*
 * XML Type:  CriticalCarePeriod_Structure
 * Namespace: http://www.nhsia.nhs.uk/DataStandards/XMLschema/CDS/ns
 * Java type: uk.nhs.nhsia.datastandards.ecds.CriticalCarePeriodStructure
 *
 * Automatically generated - do not modify.
 */
package uk.nhs.nhsia.datastandards.ecds.impl;
/**
 * An XML CriticalCarePeriod_Structure(@http://www.nhsia.nhs.uk/DataStandards/XMLschema/CDS/ns).
 *
 * This is a complex type.
 */
public class CriticalCarePeriodStructureImpl extends org.apache.xmlbeans.impl.values.XmlComplexContentImpl implements uk.nhs.nhsia.datastandards.ecds.CriticalCarePeriodStructure
{
    private static final long serialVersionUID = 1L;
    
    public CriticalCarePeriodStructureImpl(org.apache.xmlbeans.SchemaType sType)
    {
        super(sType);
    }
    
    private static final javax.xml.namespace.QName NEONATALCRITICALCAREPERIOD$0 = 
        new javax.xml.namespace.QName("http://www.nhsia.nhs.uk/DataStandards/XMLschema/CDS/ns", "NeonatalCriticalCarePeriod");
    private static final javax.xml.namespace.QName PAEDIATRICCRITICALCAREPERIOD$2 = 
        new javax.xml.namespace.QName("http://www.nhsia.nhs.uk/DataStandards/XMLschema/CDS/ns", "PaediatricCriticalCarePeriod");
    private static final javax.xml.namespace.QName ADULTCRITICALCAREPERIOD$4 = 
        new javax.xml.namespace.QName("http://www.nhsia.nhs.uk/DataStandards/XMLschema/CDS/ns", "AdultCriticalCarePeriod");
    
    
    /**
     * Gets array of all "NeonatalCriticalCarePeriod" elements
     */
    public uk.nhs.nhsia.datastandards.ecds.NeonatalCriticalCarePeriodStructure[] getNeonatalCriticalCarePeriodArray()
    {
        synchronized (monitor())
        {
            check_orphaned();
            java.util.List targetList = new java.util.ArrayList();
            get_store().find_all_element_users(NEONATALCRITICALCAREPERIOD$0, targetList);
            uk.nhs.nhsia.datastandards.ecds.NeonatalCriticalCarePeriodStructure[] result = new uk.nhs.nhsia.datastandards.ecds.NeonatalCriticalCarePeriodStructure[targetList.size()];
            targetList.toArray(result);
            return result;
        }
    }
    
    /**
     * Gets ith "NeonatalCriticalCarePeriod" element
     */
    public uk.nhs.nhsia.datastandards.ecds.NeonatalCriticalCarePeriodStructure getNeonatalCriticalCarePeriodArray(int i)
    {
        synchronized (monitor())
        {
            check_orphaned();
            uk.nhs.nhsia.datastandards.ecds.NeonatalCriticalCarePeriodStructure target = null;
            target = (uk.nhs.nhsia.datastandards.ecds.NeonatalCriticalCarePeriodStructure)get_store().find_element_user(NEONATALCRITICALCAREPERIOD$0, i);
            if (target == null)
            {
                throw new IndexOutOfBoundsException();
            }
            return target;
        }
    }
    
    /**
     * Returns number of "NeonatalCriticalCarePeriod" element
     */
    public int sizeOfNeonatalCriticalCarePeriodArray()
    {
        synchronized (monitor())
        {
            check_orphaned();
            return get_store().count_elements(NEONATALCRITICALCAREPERIOD$0);
        }
    }
    
    /**
     * Sets array of all "NeonatalCriticalCarePeriod" element  WARNING: This method is not atomicaly synchronized.
     */
    public void setNeonatalCriticalCarePeriodArray(uk.nhs.nhsia.datastandards.ecds.NeonatalCriticalCarePeriodStructure[] neonatalCriticalCarePeriodArray)
    {
        check_orphaned();
        arraySetterHelper(neonatalCriticalCarePeriodArray, NEONATALCRITICALCAREPERIOD$0);
    }
    
    /**
     * Sets ith "NeonatalCriticalCarePeriod" element
     */
    public void setNeonatalCriticalCarePeriodArray(int i, uk.nhs.nhsia.datastandards.ecds.NeonatalCriticalCarePeriodStructure neonatalCriticalCarePeriod)
    {
        generatedSetterHelperImpl(neonatalCriticalCarePeriod, NEONATALCRITICALCAREPERIOD$0, i, org.apache.xmlbeans.impl.values.XmlObjectBase.KIND_SETTERHELPER_ARRAYITEM);
    }
    
    /**
     * Inserts and returns a new empty value (as xml) as the ith "NeonatalCriticalCarePeriod" element
     */
    public uk.nhs.nhsia.datastandards.ecds.NeonatalCriticalCarePeriodStructure insertNewNeonatalCriticalCarePeriod(int i)
    {
        synchronized (monitor())
        {
            check_orphaned();
            uk.nhs.nhsia.datastandards.ecds.NeonatalCriticalCarePeriodStructure target = null;
            target = (uk.nhs.nhsia.datastandards.ecds.NeonatalCriticalCarePeriodStructure)get_store().insert_element_user(NEONATALCRITICALCAREPERIOD$0, i);
            return target;
        }
    }
    
    /**
     * Appends and returns a new empty value (as xml) as the last "NeonatalCriticalCarePeriod" element
     */
    public uk.nhs.nhsia.datastandards.ecds.NeonatalCriticalCarePeriodStructure addNewNeonatalCriticalCarePeriod()
    {
        synchronized (monitor())
        {
            check_orphaned();
            uk.nhs.nhsia.datastandards.ecds.NeonatalCriticalCarePeriodStructure target = null;
            target = (uk.nhs.nhsia.datastandards.ecds.NeonatalCriticalCarePeriodStructure)get_store().add_element_user(NEONATALCRITICALCAREPERIOD$0);
            return target;
        }
    }
    
    /**
     * Removes the ith "NeonatalCriticalCarePeriod" element
     */
    public void removeNeonatalCriticalCarePeriod(int i)
    {
        synchronized (monitor())
        {
            check_orphaned();
            get_store().remove_element(NEONATALCRITICALCAREPERIOD$0, i);
        }
    }
    
    /**
     * Gets array of all "PaediatricCriticalCarePeriod" elements
     */
    public uk.nhs.nhsia.datastandards.ecds.PaediatricCriticalCarePeriodStructure[] getPaediatricCriticalCarePeriodArray()
    {
        synchronized (monitor())
        {
            check_orphaned();
            java.util.List targetList = new java.util.ArrayList();
            get_store().find_all_element_users(PAEDIATRICCRITICALCAREPERIOD$2, targetList);
            uk.nhs.nhsia.datastandards.ecds.PaediatricCriticalCarePeriodStructure[] result = new uk.nhs.nhsia.datastandards.ecds.PaediatricCriticalCarePeriodStructure[targetList.size()];
            targetList.toArray(result);
            return result;
        }
    }
    
    /**
     * Gets ith "PaediatricCriticalCarePeriod" element
     */
    public uk.nhs.nhsia.datastandards.ecds.PaediatricCriticalCarePeriodStructure getPaediatricCriticalCarePeriodArray(int i)
    {
        synchronized (monitor())
        {
            check_orphaned();
            uk.nhs.nhsia.datastandards.ecds.PaediatricCriticalCarePeriodStructure target = null;
            target = (uk.nhs.nhsia.datastandards.ecds.PaediatricCriticalCarePeriodStructure)get_store().find_element_user(PAEDIATRICCRITICALCAREPERIOD$2, i);
            if (target == null)
            {
                throw new IndexOutOfBoundsException();
            }
            return target;
        }
    }
    
    /**
     * Returns number of "PaediatricCriticalCarePeriod" element
     */
    public int sizeOfPaediatricCriticalCarePeriodArray()
    {
        synchronized (monitor())
        {
            check_orphaned();
            return get_store().count_elements(PAEDIATRICCRITICALCAREPERIOD$2);
        }
    }
    
    /**
     * Sets array of all "PaediatricCriticalCarePeriod" element  WARNING: This method is not atomicaly synchronized.
     */
    public void setPaediatricCriticalCarePeriodArray(uk.nhs.nhsia.datastandards.ecds.PaediatricCriticalCarePeriodStructure[] paediatricCriticalCarePeriodArray)
    {
        check_orphaned();
        arraySetterHelper(paediatricCriticalCarePeriodArray, PAEDIATRICCRITICALCAREPERIOD$2);
    }
    
    /**
     * Sets ith "PaediatricCriticalCarePeriod" element
     */
    public void setPaediatricCriticalCarePeriodArray(int i, uk.nhs.nhsia.datastandards.ecds.PaediatricCriticalCarePeriodStructure paediatricCriticalCarePeriod)
    {
        generatedSetterHelperImpl(paediatricCriticalCarePeriod, PAEDIATRICCRITICALCAREPERIOD$2, i, org.apache.xmlbeans.impl.values.XmlObjectBase.KIND_SETTERHELPER_ARRAYITEM);
    }
    
    /**
     * Inserts and returns a new empty value (as xml) as the ith "PaediatricCriticalCarePeriod" element
     */
    public uk.nhs.nhsia.datastandards.ecds.PaediatricCriticalCarePeriodStructure insertNewPaediatricCriticalCarePeriod(int i)
    {
        synchronized (monitor())
        {
            check_orphaned();
            uk.nhs.nhsia.datastandards.ecds.PaediatricCriticalCarePeriodStructure target = null;
            target = (uk.nhs.nhsia.datastandards.ecds.PaediatricCriticalCarePeriodStructure)get_store().insert_element_user(PAEDIATRICCRITICALCAREPERIOD$2, i);
            return target;
        }
    }
    
    /**
     * Appends and returns a new empty value (as xml) as the last "PaediatricCriticalCarePeriod" element
     */
    public uk.nhs.nhsia.datastandards.ecds.PaediatricCriticalCarePeriodStructure addNewPaediatricCriticalCarePeriod()
    {
        synchronized (monitor())
        {
            check_orphaned();
            uk.nhs.nhsia.datastandards.ecds.PaediatricCriticalCarePeriodStructure target = null;
            target = (uk.nhs.nhsia.datastandards.ecds.PaediatricCriticalCarePeriodStructure)get_store().add_element_user(PAEDIATRICCRITICALCAREPERIOD$2);
            return target;
        }
    }
    
    /**
     * Removes the ith "PaediatricCriticalCarePeriod" element
     */
    public void removePaediatricCriticalCarePeriod(int i)
    {
        synchronized (monitor())
        {
            check_orphaned();
            get_store().remove_element(PAEDIATRICCRITICALCAREPERIOD$2, i);
        }
    }
    
    /**
     * Gets array of all "AdultCriticalCarePeriod" elements
     */
    public uk.nhs.nhsia.datastandards.ecds.AdultCriticalCarePeriodStructure[] getAdultCriticalCarePeriodArray()
    {
        synchronized (monitor())
        {
            check_orphaned();
            java.util.List targetList = new java.util.ArrayList();
            get_store().find_all_element_users(ADULTCRITICALCAREPERIOD$4, targetList);
            uk.nhs.nhsia.datastandards.ecds.AdultCriticalCarePeriodStructure[] result = new uk.nhs.nhsia.datastandards.ecds.AdultCriticalCarePeriodStructure[targetList.size()];
            targetList.toArray(result);
            return result;
        }
    }
    
    /**
     * Gets ith "AdultCriticalCarePeriod" element
     */
    public uk.nhs.nhsia.datastandards.ecds.AdultCriticalCarePeriodStructure getAdultCriticalCarePeriodArray(int i)
    {
        synchronized (monitor())
        {
            check_orphaned();
            uk.nhs.nhsia.datastandards.ecds.AdultCriticalCarePeriodStructure target = null;
            target = (uk.nhs.nhsia.datastandards.ecds.AdultCriticalCarePeriodStructure)get_store().find_element_user(ADULTCRITICALCAREPERIOD$4, i);
            if (target == null)
            {
                throw new IndexOutOfBoundsException();
            }
            return target;
        }
    }
    
    /**
     * Returns number of "AdultCriticalCarePeriod" element
     */
    public int sizeOfAdultCriticalCarePeriodArray()
    {
        synchronized (monitor())
        {
            check_orphaned();
            return get_store().count_elements(ADULTCRITICALCAREPERIOD$4);
        }
    }
    
    /**
     * Sets array of all "AdultCriticalCarePeriod" element  WARNING: This method is not atomicaly synchronized.
     */
    public void setAdultCriticalCarePeriodArray(uk.nhs.nhsia.datastandards.ecds.AdultCriticalCarePeriodStructure[] adultCriticalCarePeriodArray)
    {
        check_orphaned();
        arraySetterHelper(adultCriticalCarePeriodArray, ADULTCRITICALCAREPERIOD$4);
    }
    
    /**
     * Sets ith "AdultCriticalCarePeriod" element
     */
    public void setAdultCriticalCarePeriodArray(int i, uk.nhs.nhsia.datastandards.ecds.AdultCriticalCarePeriodStructure adultCriticalCarePeriod)
    {
        generatedSetterHelperImpl(adultCriticalCarePeriod, ADULTCRITICALCAREPERIOD$4, i, org.apache.xmlbeans.impl.values.XmlObjectBase.KIND_SETTERHELPER_ARRAYITEM);
    }
    
    /**
     * Inserts and returns a new empty value (as xml) as the ith "AdultCriticalCarePeriod" element
     */
    public uk.nhs.nhsia.datastandards.ecds.AdultCriticalCarePeriodStructure insertNewAdultCriticalCarePeriod(int i)
    {
        synchronized (monitor())
        {
            check_orphaned();
            uk.nhs.nhsia.datastandards.ecds.AdultCriticalCarePeriodStructure target = null;
            target = (uk.nhs.nhsia.datastandards.ecds.AdultCriticalCarePeriodStructure)get_store().insert_element_user(ADULTCRITICALCAREPERIOD$4, i);
            return target;
        }
    }
    
    /**
     * Appends and returns a new empty value (as xml) as the last "AdultCriticalCarePeriod" element
     */
    public uk.nhs.nhsia.datastandards.ecds.AdultCriticalCarePeriodStructure addNewAdultCriticalCarePeriod()
    {
        synchronized (monitor())
        {
            check_orphaned();
            uk.nhs.nhsia.datastandards.ecds.AdultCriticalCarePeriodStructure target = null;
            target = (uk.nhs.nhsia.datastandards.ecds.AdultCriticalCarePeriodStructure)get_store().add_element_user(ADULTCRITICALCAREPERIOD$4);
            return target;
        }
    }
    
    /**
     * Removes the ith "AdultCriticalCarePeriod" element
     */
    public void removeAdultCriticalCarePeriod(int i)
    {
        synchronized (monitor())
        {
            check_orphaned();
            get_store().remove_element(ADULTCRITICALCAREPERIOD$4, i);
        }
    }
}
