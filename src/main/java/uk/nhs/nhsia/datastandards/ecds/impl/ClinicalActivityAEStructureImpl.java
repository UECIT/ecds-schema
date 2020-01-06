/*
 * XML Type:  ClinicalActivity_AE_Structure
 * Namespace: http://www.nhsia.nhs.uk/DataStandards/XMLschema/CDS/ns
 * Java type: uk.nhs.nhsia.datastandards.ecds.ClinicalActivityAEStructure
 *
 * Automatically generated - do not modify.
 */
package uk.nhs.nhsia.datastandards.ecds.impl;
/**
 * An XML ClinicalActivity_AE_Structure(@http://www.nhsia.nhs.uk/DataStandards/XMLschema/CDS/ns).
 *
 * This is a complex type.
 */
public class ClinicalActivityAEStructureImpl extends org.apache.xmlbeans.impl.values.XmlComplexContentImpl implements uk.nhs.nhsia.datastandards.ecds.ClinicalActivityAEStructure
{
    private static final long serialVersionUID = 1L;
    
    public ClinicalActivityAEStructureImpl(org.apache.xmlbeans.SchemaType sType)
    {
        super(sType);
    }
    
    private static final javax.xml.namespace.QName CLINICALACTIVITYGROUPOPCS$0 = 
        new javax.xml.namespace.QName("http://www.nhsia.nhs.uk/DataStandards/XMLschema/CDS/ns", "ClinicalActivityGroupOPCS");
    private static final javax.xml.namespace.QName CLINICALACTIVITYGROUPREAD$2 = 
        new javax.xml.namespace.QName("http://www.nhsia.nhs.uk/DataStandards/XMLschema/CDS/ns", "ClinicalActivityGroupREAD");
    private static final javax.xml.namespace.QName CLINICALTREATMENTGROUPAANDE$4 = 
        new javax.xml.namespace.QName("http://www.nhsia.nhs.uk/DataStandards/XMLschema/CDS/ns", "ClinicalTreatmentGroupAandE");
    
    
    /**
     * Gets the "ClinicalActivityGroupOPCS" element
     */
    public uk.nhs.nhsia.datastandards.ecds.ClinicalActivityGroupOPCSType getClinicalActivityGroupOPCS()
    {
        synchronized (monitor())
        {
            check_orphaned();
            uk.nhs.nhsia.datastandards.ecds.ClinicalActivityGroupOPCSType target = null;
            target = (uk.nhs.nhsia.datastandards.ecds.ClinicalActivityGroupOPCSType)get_store().find_element_user(CLINICALACTIVITYGROUPOPCS$0, 0);
            if (target == null)
            {
                return null;
            }
            return target;
        }
    }
    
    /**
     * True if has "ClinicalActivityGroupOPCS" element
     */
    public boolean isSetClinicalActivityGroupOPCS()
    {
        synchronized (monitor())
        {
            check_orphaned();
            return get_store().count_elements(CLINICALACTIVITYGROUPOPCS$0) != 0;
        }
    }
    
    /**
     * Sets the "ClinicalActivityGroupOPCS" element
     */
    public void setClinicalActivityGroupOPCS(uk.nhs.nhsia.datastandards.ecds.ClinicalActivityGroupOPCSType clinicalActivityGroupOPCS)
    {
        generatedSetterHelperImpl(clinicalActivityGroupOPCS, CLINICALACTIVITYGROUPOPCS$0, 0, org.apache.xmlbeans.impl.values.XmlObjectBase.KIND_SETTERHELPER_SINGLETON);
    }
    
    /**
     * Appends and returns a new empty "ClinicalActivityGroupOPCS" element
     */
    public uk.nhs.nhsia.datastandards.ecds.ClinicalActivityGroupOPCSType addNewClinicalActivityGroupOPCS()
    {
        synchronized (monitor())
        {
            check_orphaned();
            uk.nhs.nhsia.datastandards.ecds.ClinicalActivityGroupOPCSType target = null;
            target = (uk.nhs.nhsia.datastandards.ecds.ClinicalActivityGroupOPCSType)get_store().add_element_user(CLINICALACTIVITYGROUPOPCS$0);
            return target;
        }
    }
    
    /**
     * Unsets the "ClinicalActivityGroupOPCS" element
     */
    public void unsetClinicalActivityGroupOPCS()
    {
        synchronized (monitor())
        {
            check_orphaned();
            get_store().remove_element(CLINICALACTIVITYGROUPOPCS$0, 0);
        }
    }
    
    /**
     * Gets the "ClinicalActivityGroupREAD" element
     */
    public uk.nhs.nhsia.datastandards.ecds.ClinicalActivityGroupREADType getClinicalActivityGroupREAD()
    {
        synchronized (monitor())
        {
            check_orphaned();
            uk.nhs.nhsia.datastandards.ecds.ClinicalActivityGroupREADType target = null;
            target = (uk.nhs.nhsia.datastandards.ecds.ClinicalActivityGroupREADType)get_store().find_element_user(CLINICALACTIVITYGROUPREAD$2, 0);
            if (target == null)
            {
                return null;
            }
            return target;
        }
    }
    
    /**
     * True if has "ClinicalActivityGroupREAD" element
     */
    public boolean isSetClinicalActivityGroupREAD()
    {
        synchronized (monitor())
        {
            check_orphaned();
            return get_store().count_elements(CLINICALACTIVITYGROUPREAD$2) != 0;
        }
    }
    
    /**
     * Sets the "ClinicalActivityGroupREAD" element
     */
    public void setClinicalActivityGroupREAD(uk.nhs.nhsia.datastandards.ecds.ClinicalActivityGroupREADType clinicalActivityGroupREAD)
    {
        generatedSetterHelperImpl(clinicalActivityGroupREAD, CLINICALACTIVITYGROUPREAD$2, 0, org.apache.xmlbeans.impl.values.XmlObjectBase.KIND_SETTERHELPER_SINGLETON);
    }
    
    /**
     * Appends and returns a new empty "ClinicalActivityGroupREAD" element
     */
    public uk.nhs.nhsia.datastandards.ecds.ClinicalActivityGroupREADType addNewClinicalActivityGroupREAD()
    {
        synchronized (monitor())
        {
            check_orphaned();
            uk.nhs.nhsia.datastandards.ecds.ClinicalActivityGroupREADType target = null;
            target = (uk.nhs.nhsia.datastandards.ecds.ClinicalActivityGroupREADType)get_store().add_element_user(CLINICALACTIVITYGROUPREAD$2);
            return target;
        }
    }
    
    /**
     * Unsets the "ClinicalActivityGroupREAD" element
     */
    public void unsetClinicalActivityGroupREAD()
    {
        synchronized (monitor())
        {
            check_orphaned();
            get_store().remove_element(CLINICALACTIVITYGROUPREAD$2, 0);
        }
    }
    
    /**
     * Gets the "ClinicalTreatmentGroupAandE" element
     */
    public uk.nhs.nhsia.datastandards.ecds.ClinicalTreatmentGroupAAndEType getClinicalTreatmentGroupAandE()
    {
        synchronized (monitor())
        {
            check_orphaned();
            uk.nhs.nhsia.datastandards.ecds.ClinicalTreatmentGroupAAndEType target = null;
            target = (uk.nhs.nhsia.datastandards.ecds.ClinicalTreatmentGroupAAndEType)get_store().find_element_user(CLINICALTREATMENTGROUPAANDE$4, 0);
            if (target == null)
            {
                return null;
            }
            return target;
        }
    }
    
    /**
     * True if has "ClinicalTreatmentGroupAandE" element
     */
    public boolean isSetClinicalTreatmentGroupAandE()
    {
        synchronized (monitor())
        {
            check_orphaned();
            return get_store().count_elements(CLINICALTREATMENTGROUPAANDE$4) != 0;
        }
    }
    
    /**
     * Sets the "ClinicalTreatmentGroupAandE" element
     */
    public void setClinicalTreatmentGroupAandE(uk.nhs.nhsia.datastandards.ecds.ClinicalTreatmentGroupAAndEType clinicalTreatmentGroupAandE)
    {
        generatedSetterHelperImpl(clinicalTreatmentGroupAandE, CLINICALTREATMENTGROUPAANDE$4, 0, org.apache.xmlbeans.impl.values.XmlObjectBase.KIND_SETTERHELPER_SINGLETON);
    }
    
    /**
     * Appends and returns a new empty "ClinicalTreatmentGroupAandE" element
     */
    public uk.nhs.nhsia.datastandards.ecds.ClinicalTreatmentGroupAAndEType addNewClinicalTreatmentGroupAandE()
    {
        synchronized (monitor())
        {
            check_orphaned();
            uk.nhs.nhsia.datastandards.ecds.ClinicalTreatmentGroupAAndEType target = null;
            target = (uk.nhs.nhsia.datastandards.ecds.ClinicalTreatmentGroupAAndEType)get_store().add_element_user(CLINICALTREATMENTGROUPAANDE$4);
            return target;
        }
    }
    
    /**
     * Unsets the "ClinicalTreatmentGroupAandE" element
     */
    public void unsetClinicalTreatmentGroupAandE()
    {
        synchronized (monitor())
        {
            check_orphaned();
            get_store().remove_element(CLINICALTREATMENTGROUPAANDE$4, 0);
        }
    }
}
