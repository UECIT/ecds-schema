/*
 * XML Type:  ClinicalDiagnosis_Structure
 * Namespace: http://www.nhsia.nhs.uk/DataStandards/XMLschema/CDS/ns
 * Java type: uk.nhs.nhsia.datastandards.ecds.ClinicalDiagnosisStructure
 *
 * Automatically generated - do not modify.
 */
package uk.nhs.nhsia.datastandards.ecds.impl;
/**
 * An XML ClinicalDiagnosis_Structure(@http://www.nhsia.nhs.uk/DataStandards/XMLschema/CDS/ns).
 *
 * This is a complex type.
 */
public class ClinicalDiagnosisStructureImpl extends org.apache.xmlbeans.impl.values.XmlComplexContentImpl implements uk.nhs.nhsia.datastandards.ecds.ClinicalDiagnosisStructure
{
    private static final long serialVersionUID = 1L;
    
    public ClinicalDiagnosisStructureImpl(org.apache.xmlbeans.SchemaType sType)
    {
        super(sType);
    }
    
    private static final javax.xml.namespace.QName CLINICALDIAGNOSISGROUPICD$0 = 
        new javax.xml.namespace.QName("http://www.nhsia.nhs.uk/DataStandards/XMLschema/CDS/ns", "ClinicalDiagnosisGroupICD");
    private static final javax.xml.namespace.QName CLINICALDIAGNOSISGROUPREAD$2 = 
        new javax.xml.namespace.QName("http://www.nhsia.nhs.uk/DataStandards/XMLschema/CDS/ns", "ClinicalDiagnosisGroupREAD");
    
    
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
}
