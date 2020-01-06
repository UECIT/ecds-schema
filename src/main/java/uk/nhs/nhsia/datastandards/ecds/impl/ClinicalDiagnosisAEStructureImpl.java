/*
 * XML Type:  ClinicalDiagnosis_AE_Structure
 * Namespace: http://www.nhsia.nhs.uk/DataStandards/XMLschema/CDS/ns
 * Java type: uk.nhs.nhsia.datastandards.ecds.ClinicalDiagnosisAEStructure
 *
 * Automatically generated - do not modify.
 */
package uk.nhs.nhsia.datastandards.ecds.impl;
/**
 * An XML ClinicalDiagnosis_AE_Structure(@http://www.nhsia.nhs.uk/DataStandards/XMLschema/CDS/ns).
 *
 * This is a complex type.
 */
public class ClinicalDiagnosisAEStructureImpl extends org.apache.xmlbeans.impl.values.XmlComplexContentImpl implements uk.nhs.nhsia.datastandards.ecds.ClinicalDiagnosisAEStructure
{
    private static final long serialVersionUID = 1L;
    
    public ClinicalDiagnosisAEStructureImpl(org.apache.xmlbeans.SchemaType sType)
    {
        super(sType);
    }
    
    private static final javax.xml.namespace.QName CLINICALDIAGNOSISGROUPICD$0 = 
        new javax.xml.namespace.QName("http://www.nhsia.nhs.uk/DataStandards/XMLschema/CDS/ns", "ClinicalDiagnosisGroupICD");
    private static final javax.xml.namespace.QName CLINICALDIAGNOSISGROUPREAD$2 = 
        new javax.xml.namespace.QName("http://www.nhsia.nhs.uk/DataStandards/XMLschema/CDS/ns", "ClinicalDiagnosisGroupREAD");
    private static final javax.xml.namespace.QName CLINICALDIAGNOSISGROUPAANDE$4 = 
        new javax.xml.namespace.QName("http://www.nhsia.nhs.uk/DataStandards/XMLschema/CDS/ns", "ClinicalDiagnosisGroupAAndE");
    
    
    /**
     * Gets the "ClinicalDiagnosisGroupICD" element
     */
    public uk.nhs.nhsia.datastandards.ecds.ClinicalDiagnosisGroupICDType getClinicalDiagnosisGroupICD()
    {
        synchronized (monitor())
        {
            check_orphaned();
            uk.nhs.nhsia.datastandards.ecds.ClinicalDiagnosisGroupICDType target = null;
            target = (uk.nhs.nhsia.datastandards.ecds.ClinicalDiagnosisGroupICDType)get_store().find_element_user(CLINICALDIAGNOSISGROUPICD$0, 0);
            if (target == null)
            {
                return null;
            }
            return target;
        }
    }
    
    /**
     * True if has "ClinicalDiagnosisGroupICD" element
     */
    public boolean isSetClinicalDiagnosisGroupICD()
    {
        synchronized (monitor())
        {
            check_orphaned();
            return get_store().count_elements(CLINICALDIAGNOSISGROUPICD$0) != 0;
        }
    }
    
    /**
     * Sets the "ClinicalDiagnosisGroupICD" element
     */
    public void setClinicalDiagnosisGroupICD(uk.nhs.nhsia.datastandards.ecds.ClinicalDiagnosisGroupICDType clinicalDiagnosisGroupICD)
    {
        generatedSetterHelperImpl(clinicalDiagnosisGroupICD, CLINICALDIAGNOSISGROUPICD$0, 0, org.apache.xmlbeans.impl.values.XmlObjectBase.KIND_SETTERHELPER_SINGLETON);
    }
    
    /**
     * Appends and returns a new empty "ClinicalDiagnosisGroupICD" element
     */
    public uk.nhs.nhsia.datastandards.ecds.ClinicalDiagnosisGroupICDType addNewClinicalDiagnosisGroupICD()
    {
        synchronized (monitor())
        {
            check_orphaned();
            uk.nhs.nhsia.datastandards.ecds.ClinicalDiagnosisGroupICDType target = null;
            target = (uk.nhs.nhsia.datastandards.ecds.ClinicalDiagnosisGroupICDType)get_store().add_element_user(CLINICALDIAGNOSISGROUPICD$0);
            return target;
        }
    }
    
    /**
     * Unsets the "ClinicalDiagnosisGroupICD" element
     */
    public void unsetClinicalDiagnosisGroupICD()
    {
        synchronized (monitor())
        {
            check_orphaned();
            get_store().remove_element(CLINICALDIAGNOSISGROUPICD$0, 0);
        }
    }
    
    /**
     * Gets the "ClinicalDiagnosisGroupREAD" element
     */
    public uk.nhs.nhsia.datastandards.ecds.ClinicalDiagnosisGroupREADType getClinicalDiagnosisGroupREAD()
    {
        synchronized (monitor())
        {
            check_orphaned();
            uk.nhs.nhsia.datastandards.ecds.ClinicalDiagnosisGroupREADType target = null;
            target = (uk.nhs.nhsia.datastandards.ecds.ClinicalDiagnosisGroupREADType)get_store().find_element_user(CLINICALDIAGNOSISGROUPREAD$2, 0);
            if (target == null)
            {
                return null;
            }
            return target;
        }
    }
    
    /**
     * True if has "ClinicalDiagnosisGroupREAD" element
     */
    public boolean isSetClinicalDiagnosisGroupREAD()
    {
        synchronized (monitor())
        {
            check_orphaned();
            return get_store().count_elements(CLINICALDIAGNOSISGROUPREAD$2) != 0;
        }
    }
    
    /**
     * Sets the "ClinicalDiagnosisGroupREAD" element
     */
    public void setClinicalDiagnosisGroupREAD(uk.nhs.nhsia.datastandards.ecds.ClinicalDiagnosisGroupREADType clinicalDiagnosisGroupREAD)
    {
        generatedSetterHelperImpl(clinicalDiagnosisGroupREAD, CLINICALDIAGNOSISGROUPREAD$2, 0, org.apache.xmlbeans.impl.values.XmlObjectBase.KIND_SETTERHELPER_SINGLETON);
    }
    
    /**
     * Appends and returns a new empty "ClinicalDiagnosisGroupREAD" element
     */
    public uk.nhs.nhsia.datastandards.ecds.ClinicalDiagnosisGroupREADType addNewClinicalDiagnosisGroupREAD()
    {
        synchronized (monitor())
        {
            check_orphaned();
            uk.nhs.nhsia.datastandards.ecds.ClinicalDiagnosisGroupREADType target = null;
            target = (uk.nhs.nhsia.datastandards.ecds.ClinicalDiagnosisGroupREADType)get_store().add_element_user(CLINICALDIAGNOSISGROUPREAD$2);
            return target;
        }
    }
    
    /**
     * Unsets the "ClinicalDiagnosisGroupREAD" element
     */
    public void unsetClinicalDiagnosisGroupREAD()
    {
        synchronized (monitor())
        {
            check_orphaned();
            get_store().remove_element(CLINICALDIAGNOSISGROUPREAD$2, 0);
        }
    }
    
    /**
     * Gets the "ClinicalDiagnosisGroupAAndE" element
     */
    public uk.nhs.nhsia.datastandards.ecds.ClinicalDiagnosisGroupAAndEType getClinicalDiagnosisGroupAAndE()
    {
        synchronized (monitor())
        {
            check_orphaned();
            uk.nhs.nhsia.datastandards.ecds.ClinicalDiagnosisGroupAAndEType target = null;
            target = (uk.nhs.nhsia.datastandards.ecds.ClinicalDiagnosisGroupAAndEType)get_store().find_element_user(CLINICALDIAGNOSISGROUPAANDE$4, 0);
            if (target == null)
            {
                return null;
            }
            return target;
        }
    }
    
    /**
     * True if has "ClinicalDiagnosisGroupAAndE" element
     */
    public boolean isSetClinicalDiagnosisGroupAAndE()
    {
        synchronized (monitor())
        {
            check_orphaned();
            return get_store().count_elements(CLINICALDIAGNOSISGROUPAANDE$4) != 0;
        }
    }
    
    /**
     * Sets the "ClinicalDiagnosisGroupAAndE" element
     */
    public void setClinicalDiagnosisGroupAAndE(uk.nhs.nhsia.datastandards.ecds.ClinicalDiagnosisGroupAAndEType clinicalDiagnosisGroupAAndE)
    {
        generatedSetterHelperImpl(clinicalDiagnosisGroupAAndE, CLINICALDIAGNOSISGROUPAANDE$4, 0, org.apache.xmlbeans.impl.values.XmlObjectBase.KIND_SETTERHELPER_SINGLETON);
    }
    
    /**
     * Appends and returns a new empty "ClinicalDiagnosisGroupAAndE" element
     */
    public uk.nhs.nhsia.datastandards.ecds.ClinicalDiagnosisGroupAAndEType addNewClinicalDiagnosisGroupAAndE()
    {
        synchronized (monitor())
        {
            check_orphaned();
            uk.nhs.nhsia.datastandards.ecds.ClinicalDiagnosisGroupAAndEType target = null;
            target = (uk.nhs.nhsia.datastandards.ecds.ClinicalDiagnosisGroupAAndEType)get_store().add_element_user(CLINICALDIAGNOSISGROUPAANDE$4);
            return target;
        }
    }
    
    /**
     * Unsets the "ClinicalDiagnosisGroupAAndE" element
     */
    public void unsetClinicalDiagnosisGroupAAndE()
    {
        synchronized (monitor())
        {
            check_orphaned();
            get_store().remove_element(CLINICALDIAGNOSISGROUPAANDE$4, 0);
        }
    }
}
