/*
 * XML Type:  CareEpisode_Structure
 * Namespace: http://www.nhsia.nhs.uk/DataStandards/XMLschema/CDS/ns
 * Java type: uk.nhs.nhsia.datastandards.ecds.CareEpisodeStructure
 *
 * Automatically generated - do not modify.
 */
package uk.nhs.nhsia.datastandards.ecds.impl;
/**
 * An XML CareEpisode_Structure(@http://www.nhsia.nhs.uk/DataStandards/XMLschema/CDS/ns).
 *
 * This is a complex type.
 */
public class CareEpisodeStructureImpl extends org.apache.xmlbeans.impl.values.XmlComplexContentImpl implements uk.nhs.nhsia.datastandards.ecds.CareEpisodeStructure
{
    private static final long serialVersionUID = 1L;
    
    public CareEpisodeStructureImpl(org.apache.xmlbeans.SchemaType sType)
    {
        super(sType);
    }
    
    private static final javax.xml.namespace.QName PERSONGROUPCONSULTANT$0 = 
        new javax.xml.namespace.QName("http://www.nhsia.nhs.uk/DataStandards/XMLschema/CDS/ns", "PersonGroup_Consultant");
    private static final javax.xml.namespace.QName CLINICALDIAGNOSISDETAILS$2 = 
        new javax.xml.namespace.QName("http://www.nhsia.nhs.uk/DataStandards/XMLschema/CDS/ns", "ClinicalDiagnosisDetails");
    
    
    /**
     * Gets the "PersonGroup_Consultant" element
     */
    public uk.nhs.nhsia.datastandards.ecds.PersonGroupConsultantStructure getPersonGroupConsultant()
    {
        synchronized (monitor())
        {
            check_orphaned();
            uk.nhs.nhsia.datastandards.ecds.PersonGroupConsultantStructure target = null;
            target = (uk.nhs.nhsia.datastandards.ecds.PersonGroupConsultantStructure)get_store().find_element_user(PERSONGROUPCONSULTANT$0, 0);
            if (target == null)
            {
                return null;
            }
            return target;
        }
    }
    
    /**
     * True if has "PersonGroup_Consultant" element
     */
    public boolean isSetPersonGroupConsultant()
    {
        synchronized (monitor())
        {
            check_orphaned();
            return get_store().count_elements(PERSONGROUPCONSULTANT$0) != 0;
        }
    }
    
    /**
     * Sets the "PersonGroup_Consultant" element
     */
    public void setPersonGroupConsultant(uk.nhs.nhsia.datastandards.ecds.PersonGroupConsultantStructure personGroupConsultant)
    {
        generatedSetterHelperImpl(personGroupConsultant, PERSONGROUPCONSULTANT$0, 0, org.apache.xmlbeans.impl.values.XmlObjectBase.KIND_SETTERHELPER_SINGLETON);
    }
    
    /**
     * Appends and returns a new empty "PersonGroup_Consultant" element
     */
    public uk.nhs.nhsia.datastandards.ecds.PersonGroupConsultantStructure addNewPersonGroupConsultant()
    {
        synchronized (monitor())
        {
            check_orphaned();
            uk.nhs.nhsia.datastandards.ecds.PersonGroupConsultantStructure target = null;
            target = (uk.nhs.nhsia.datastandards.ecds.PersonGroupConsultantStructure)get_store().add_element_user(PERSONGROUPCONSULTANT$0);
            return target;
        }
    }
    
    /**
     * Unsets the "PersonGroup_Consultant" element
     */
    public void unsetPersonGroupConsultant()
    {
        synchronized (monitor())
        {
            check_orphaned();
            get_store().remove_element(PERSONGROUPCONSULTANT$0, 0);
        }
    }
    
    /**
     * Gets the "ClinicalDiagnosisDetails" element
     */
    public uk.nhs.nhsia.datastandards.ecds.ClinicalDiagnosisStructure getClinicalDiagnosisDetails()
    {
        synchronized (monitor())
        {
            check_orphaned();
            uk.nhs.nhsia.datastandards.ecds.ClinicalDiagnosisStructure target = null;
            target = (uk.nhs.nhsia.datastandards.ecds.ClinicalDiagnosisStructure)get_store().find_element_user(CLINICALDIAGNOSISDETAILS$2, 0);
            if (target == null)
            {
                return null;
            }
            return target;
        }
    }
    
    /**
     * True if has "ClinicalDiagnosisDetails" element
     */
    public boolean isSetClinicalDiagnosisDetails()
    {
        synchronized (monitor())
        {
            check_orphaned();
            return get_store().count_elements(CLINICALDIAGNOSISDETAILS$2) != 0;
        }
    }
    
    /**
     * Sets the "ClinicalDiagnosisDetails" element
     */
    public void setClinicalDiagnosisDetails(uk.nhs.nhsia.datastandards.ecds.ClinicalDiagnosisStructure clinicalDiagnosisDetails)
    {
        generatedSetterHelperImpl(clinicalDiagnosisDetails, CLINICALDIAGNOSISDETAILS$2, 0, org.apache.xmlbeans.impl.values.XmlObjectBase.KIND_SETTERHELPER_SINGLETON);
    }
    
    /**
     * Appends and returns a new empty "ClinicalDiagnosisDetails" element
     */
    public uk.nhs.nhsia.datastandards.ecds.ClinicalDiagnosisStructure addNewClinicalDiagnosisDetails()
    {
        synchronized (monitor())
        {
            check_orphaned();
            uk.nhs.nhsia.datastandards.ecds.ClinicalDiagnosisStructure target = null;
            target = (uk.nhs.nhsia.datastandards.ecds.ClinicalDiagnosisStructure)get_store().add_element_user(CLINICALDIAGNOSISDETAILS$2);
            return target;
        }
    }
    
    /**
     * Unsets the "ClinicalDiagnosisDetails" element
     */
    public void unsetClinicalDiagnosisDetails()
    {
        synchronized (monitor())
        {
            check_orphaned();
            get_store().remove_element(CLINICALDIAGNOSISDETAILS$2, 0);
        }
    }
}
