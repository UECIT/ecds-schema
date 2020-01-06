/*
 * XML Type:  ClinicalInvestigation_Structure
 * Namespace: http://www.nhsia.nhs.uk/DataStandards/XMLschema/CDS/ns
 * Java type: uk.nhs.nhsia.datastandards.ecds.ClinicalInvestigationStructure
 *
 * Automatically generated - do not modify.
 */
package uk.nhs.nhsia.datastandards.ecds.impl;
/**
 * An XML ClinicalInvestigation_Structure(@http://www.nhsia.nhs.uk/DataStandards/XMLschema/CDS/ns).
 *
 * This is a complex type.
 */
public class ClinicalInvestigationStructureImpl extends org.apache.xmlbeans.impl.values.XmlComplexContentImpl implements uk.nhs.nhsia.datastandards.ecds.ClinicalInvestigationStructure
{
    private static final long serialVersionUID = 1L;
    
    public ClinicalInvestigationStructureImpl(org.apache.xmlbeans.SchemaType sType)
    {
        super(sType);
    }
    
    private static final javax.xml.namespace.QName CLINICALINVESTIGATIONGROUPAANDE$0 = 
        new javax.xml.namespace.QName("http://www.nhsia.nhs.uk/DataStandards/XMLschema/CDS/ns", "ClinicalInvestigationGroupAAndE");
    
    
    /**
     * Gets the "ClinicalInvestigationGroupAAndE" element
     */
    public uk.nhs.nhsia.datastandards.ecds.ClinicalInvestigationGroupAAndEType getClinicalInvestigationGroupAAndE()
    {
        synchronized (monitor())
        {
            check_orphaned();
            uk.nhs.nhsia.datastandards.ecds.ClinicalInvestigationGroupAAndEType target = null;
            target = (uk.nhs.nhsia.datastandards.ecds.ClinicalInvestigationGroupAAndEType)get_store().find_element_user(CLINICALINVESTIGATIONGROUPAANDE$0, 0);
            if (target == null)
            {
                return null;
            }
            return target;
        }
    }
    
    /**
     * True if has "ClinicalInvestigationGroupAAndE" element
     */
    public boolean isSetClinicalInvestigationGroupAAndE()
    {
        synchronized (monitor())
        {
            check_orphaned();
            return get_store().count_elements(CLINICALINVESTIGATIONGROUPAANDE$0) != 0;
        }
    }
    
    /**
     * Sets the "ClinicalInvestigationGroupAAndE" element
     */
    public void setClinicalInvestigationGroupAAndE(uk.nhs.nhsia.datastandards.ecds.ClinicalInvestigationGroupAAndEType clinicalInvestigationGroupAAndE)
    {
        generatedSetterHelperImpl(clinicalInvestigationGroupAAndE, CLINICALINVESTIGATIONGROUPAANDE$0, 0, org.apache.xmlbeans.impl.values.XmlObjectBase.KIND_SETTERHELPER_SINGLETON);
    }
    
    /**
     * Appends and returns a new empty "ClinicalInvestigationGroupAAndE" element
     */
    public uk.nhs.nhsia.datastandards.ecds.ClinicalInvestigationGroupAAndEType addNewClinicalInvestigationGroupAAndE()
    {
        synchronized (monitor())
        {
            check_orphaned();
            uk.nhs.nhsia.datastandards.ecds.ClinicalInvestigationGroupAAndEType target = null;
            target = (uk.nhs.nhsia.datastandards.ecds.ClinicalInvestigationGroupAAndEType)get_store().add_element_user(CLINICALINVESTIGATIONGROUPAANDE$0);
            return target;
        }
    }
    
    /**
     * Unsets the "ClinicalInvestigationGroupAAndE" element
     */
    public void unsetClinicalInvestigationGroupAAndE()
    {
        synchronized (monitor())
        {
            check_orphaned();
            get_store().remove_element(CLINICALINVESTIGATIONGROUPAANDE$0, 0);
        }
    }
}
