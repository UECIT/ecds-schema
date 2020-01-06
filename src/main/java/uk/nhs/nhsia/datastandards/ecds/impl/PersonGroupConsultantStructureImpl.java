/*
 * XML Type:  PersonGroupConsultant_Structure
 * Namespace: http://www.nhsia.nhs.uk/DataStandards/XMLschema/CDS/ns
 * Java type: uk.nhs.nhsia.datastandards.ecds.PersonGroupConsultantStructure
 *
 * Automatically generated - do not modify.
 */
package uk.nhs.nhsia.datastandards.ecds.impl;
/**
 * An XML PersonGroupConsultant_Structure(@http://www.nhsia.nhs.uk/DataStandards/XMLschema/CDS/ns).
 *
 * This is a complex type.
 */
public class PersonGroupConsultantStructureImpl extends org.apache.xmlbeans.impl.values.XmlComplexContentImpl implements uk.nhs.nhsia.datastandards.ecds.PersonGroupConsultantStructure
{
    private static final long serialVersionUID = 1L;
    
    public PersonGroupConsultantStructureImpl(org.apache.xmlbeans.SchemaType sType)
    {
        super(sType);
    }
    
    private static final javax.xml.namespace.QName CONSULTANTCODE$0 = 
        new javax.xml.namespace.QName("http://www.nhsia.nhs.uk/DataStandards/XMLschema/CDS/ns", "ConsultantCode");
    private static final javax.xml.namespace.QName CAREPROFESSIONALMAINSPECIALTYCODE$2 = 
        new javax.xml.namespace.QName("http://www.nhsia.nhs.uk/DataStandards/XMLschema/CDS/ns", "CareProfessionalMainSpecialtyCode");
    private static final javax.xml.namespace.QName ACTIVITYTREATMENTFUNCTIONCODE$4 = 
        new javax.xml.namespace.QName("http://www.nhsia.nhs.uk/DataStandards/XMLschema/CDS/ns", "ActivityTreatmentFunctionCode");
    private static final javax.xml.namespace.QName LOCALSUBSPECIALTYCODE$6 = 
        new javax.xml.namespace.QName("http://www.nhsia.nhs.uk/DataStandards/XMLschema/CDS/ns", "LocalSubSpecialtyCode");
    
    
    /**
     * Gets the "ConsultantCode" element
     */
    public java.lang.String getConsultantCode()
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.SimpleValue target = null;
            target = (org.apache.xmlbeans.SimpleValue)get_store().find_element_user(CONSULTANTCODE$0, 0);
            if (target == null)
            {
                return null;
            }
            return target.getStringValue();
        }
    }
    
    /**
     * Gets (as xml) the "ConsultantCode" element
     */
    public uk.nhs.nhsia.datastandards.ecds.ConsultantCodeType xgetConsultantCode()
    {
        synchronized (monitor())
        {
            check_orphaned();
            uk.nhs.nhsia.datastandards.ecds.ConsultantCodeType target = null;
            target = (uk.nhs.nhsia.datastandards.ecds.ConsultantCodeType)get_store().find_element_user(CONSULTANTCODE$0, 0);
            return target;
        }
    }
    
    /**
     * True if has "ConsultantCode" element
     */
    public boolean isSetConsultantCode()
    {
        synchronized (monitor())
        {
            check_orphaned();
            return get_store().count_elements(CONSULTANTCODE$0) != 0;
        }
    }
    
    /**
     * Sets the "ConsultantCode" element
     */
    public void setConsultantCode(java.lang.String consultantCode)
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.SimpleValue target = null;
            target = (org.apache.xmlbeans.SimpleValue)get_store().find_element_user(CONSULTANTCODE$0, 0);
            if (target == null)
            {
                target = (org.apache.xmlbeans.SimpleValue)get_store().add_element_user(CONSULTANTCODE$0);
            }
            target.setStringValue(consultantCode);
        }
    }
    
    /**
     * Sets (as xml) the "ConsultantCode" element
     */
    public void xsetConsultantCode(uk.nhs.nhsia.datastandards.ecds.ConsultantCodeType consultantCode)
    {
        synchronized (monitor())
        {
            check_orphaned();
            uk.nhs.nhsia.datastandards.ecds.ConsultantCodeType target = null;
            target = (uk.nhs.nhsia.datastandards.ecds.ConsultantCodeType)get_store().find_element_user(CONSULTANTCODE$0, 0);
            if (target == null)
            {
                target = (uk.nhs.nhsia.datastandards.ecds.ConsultantCodeType)get_store().add_element_user(CONSULTANTCODE$0);
            }
            target.set(consultantCode);
        }
    }
    
    /**
     * Unsets the "ConsultantCode" element
     */
    public void unsetConsultantCode()
    {
        synchronized (monitor())
        {
            check_orphaned();
            get_store().remove_element(CONSULTANTCODE$0, 0);
        }
    }
    
    /**
     * Gets the "CareProfessionalMainSpecialtyCode" element
     */
    public uk.nhs.nhsia.datastandards.ecds.CareProfessionalMainSpecialtyCodeType.Enum getCareProfessionalMainSpecialtyCode()
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.SimpleValue target = null;
            target = (org.apache.xmlbeans.SimpleValue)get_store().find_element_user(CAREPROFESSIONALMAINSPECIALTYCODE$2, 0);
            if (target == null)
            {
                return null;
            }
            return (uk.nhs.nhsia.datastandards.ecds.CareProfessionalMainSpecialtyCodeType.Enum)target.getEnumValue();
        }
    }
    
    /**
     * Gets (as xml) the "CareProfessionalMainSpecialtyCode" element
     */
    public uk.nhs.nhsia.datastandards.ecds.CareProfessionalMainSpecialtyCodeType xgetCareProfessionalMainSpecialtyCode()
    {
        synchronized (monitor())
        {
            check_orphaned();
            uk.nhs.nhsia.datastandards.ecds.CareProfessionalMainSpecialtyCodeType target = null;
            target = (uk.nhs.nhsia.datastandards.ecds.CareProfessionalMainSpecialtyCodeType)get_store().find_element_user(CAREPROFESSIONALMAINSPECIALTYCODE$2, 0);
            return target;
        }
    }
    
    /**
     * True if has "CareProfessionalMainSpecialtyCode" element
     */
    public boolean isSetCareProfessionalMainSpecialtyCode()
    {
        synchronized (monitor())
        {
            check_orphaned();
            return get_store().count_elements(CAREPROFESSIONALMAINSPECIALTYCODE$2) != 0;
        }
    }
    
    /**
     * Sets the "CareProfessionalMainSpecialtyCode" element
     */
    public void setCareProfessionalMainSpecialtyCode(uk.nhs.nhsia.datastandards.ecds.CareProfessionalMainSpecialtyCodeType.Enum careProfessionalMainSpecialtyCode)
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.SimpleValue target = null;
            target = (org.apache.xmlbeans.SimpleValue)get_store().find_element_user(CAREPROFESSIONALMAINSPECIALTYCODE$2, 0);
            if (target == null)
            {
                target = (org.apache.xmlbeans.SimpleValue)get_store().add_element_user(CAREPROFESSIONALMAINSPECIALTYCODE$2);
            }
            target.setEnumValue(careProfessionalMainSpecialtyCode);
        }
    }
    
    /**
     * Sets (as xml) the "CareProfessionalMainSpecialtyCode" element
     */
    public void xsetCareProfessionalMainSpecialtyCode(uk.nhs.nhsia.datastandards.ecds.CareProfessionalMainSpecialtyCodeType careProfessionalMainSpecialtyCode)
    {
        synchronized (monitor())
        {
            check_orphaned();
            uk.nhs.nhsia.datastandards.ecds.CareProfessionalMainSpecialtyCodeType target = null;
            target = (uk.nhs.nhsia.datastandards.ecds.CareProfessionalMainSpecialtyCodeType)get_store().find_element_user(CAREPROFESSIONALMAINSPECIALTYCODE$2, 0);
            if (target == null)
            {
                target = (uk.nhs.nhsia.datastandards.ecds.CareProfessionalMainSpecialtyCodeType)get_store().add_element_user(CAREPROFESSIONALMAINSPECIALTYCODE$2);
            }
            target.set(careProfessionalMainSpecialtyCode);
        }
    }
    
    /**
     * Unsets the "CareProfessionalMainSpecialtyCode" element
     */
    public void unsetCareProfessionalMainSpecialtyCode()
    {
        synchronized (monitor())
        {
            check_orphaned();
            get_store().remove_element(CAREPROFESSIONALMAINSPECIALTYCODE$2, 0);
        }
    }
    
    /**
     * Gets the "ActivityTreatmentFunctionCode" element
     */
    public uk.nhs.nhsia.datastandards.ecds.ActivityTreatmentFunctionCodeType.Enum getActivityTreatmentFunctionCode()
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.SimpleValue target = null;
            target = (org.apache.xmlbeans.SimpleValue)get_store().find_element_user(ACTIVITYTREATMENTFUNCTIONCODE$4, 0);
            if (target == null)
            {
                return null;
            }
            return (uk.nhs.nhsia.datastandards.ecds.ActivityTreatmentFunctionCodeType.Enum)target.getEnumValue();
        }
    }
    
    /**
     * Gets (as xml) the "ActivityTreatmentFunctionCode" element
     */
    public uk.nhs.nhsia.datastandards.ecds.ActivityTreatmentFunctionCodeType xgetActivityTreatmentFunctionCode()
    {
        synchronized (monitor())
        {
            check_orphaned();
            uk.nhs.nhsia.datastandards.ecds.ActivityTreatmentFunctionCodeType target = null;
            target = (uk.nhs.nhsia.datastandards.ecds.ActivityTreatmentFunctionCodeType)get_store().find_element_user(ACTIVITYTREATMENTFUNCTIONCODE$4, 0);
            return target;
        }
    }
    
    /**
     * True if has "ActivityTreatmentFunctionCode" element
     */
    public boolean isSetActivityTreatmentFunctionCode()
    {
        synchronized (monitor())
        {
            check_orphaned();
            return get_store().count_elements(ACTIVITYTREATMENTFUNCTIONCODE$4) != 0;
        }
    }
    
    /**
     * Sets the "ActivityTreatmentFunctionCode" element
     */
    public void setActivityTreatmentFunctionCode(uk.nhs.nhsia.datastandards.ecds.ActivityTreatmentFunctionCodeType.Enum activityTreatmentFunctionCode)
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.SimpleValue target = null;
            target = (org.apache.xmlbeans.SimpleValue)get_store().find_element_user(ACTIVITYTREATMENTFUNCTIONCODE$4, 0);
            if (target == null)
            {
                target = (org.apache.xmlbeans.SimpleValue)get_store().add_element_user(ACTIVITYTREATMENTFUNCTIONCODE$4);
            }
            target.setEnumValue(activityTreatmentFunctionCode);
        }
    }
    
    /**
     * Sets (as xml) the "ActivityTreatmentFunctionCode" element
     */
    public void xsetActivityTreatmentFunctionCode(uk.nhs.nhsia.datastandards.ecds.ActivityTreatmentFunctionCodeType activityTreatmentFunctionCode)
    {
        synchronized (monitor())
        {
            check_orphaned();
            uk.nhs.nhsia.datastandards.ecds.ActivityTreatmentFunctionCodeType target = null;
            target = (uk.nhs.nhsia.datastandards.ecds.ActivityTreatmentFunctionCodeType)get_store().find_element_user(ACTIVITYTREATMENTFUNCTIONCODE$4, 0);
            if (target == null)
            {
                target = (uk.nhs.nhsia.datastandards.ecds.ActivityTreatmentFunctionCodeType)get_store().add_element_user(ACTIVITYTREATMENTFUNCTIONCODE$4);
            }
            target.set(activityTreatmentFunctionCode);
        }
    }
    
    /**
     * Unsets the "ActivityTreatmentFunctionCode" element
     */
    public void unsetActivityTreatmentFunctionCode()
    {
        synchronized (monitor())
        {
            check_orphaned();
            get_store().remove_element(ACTIVITYTREATMENTFUNCTIONCODE$4, 0);
        }
    }
    
    /**
     * Gets the "LocalSubSpecialtyCode" element
     */
    public java.lang.String getLocalSubSpecialtyCode()
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.SimpleValue target = null;
            target = (org.apache.xmlbeans.SimpleValue)get_store().find_element_user(LOCALSUBSPECIALTYCODE$6, 0);
            if (target == null)
            {
                return null;
            }
            return target.getStringValue();
        }
    }
    
    /**
     * Gets (as xml) the "LocalSubSpecialtyCode" element
     */
    public uk.nhs.nhsia.datastandards.ecds.LocalSubSpecialtyCodeType xgetLocalSubSpecialtyCode()
    {
        synchronized (monitor())
        {
            check_orphaned();
            uk.nhs.nhsia.datastandards.ecds.LocalSubSpecialtyCodeType target = null;
            target = (uk.nhs.nhsia.datastandards.ecds.LocalSubSpecialtyCodeType)get_store().find_element_user(LOCALSUBSPECIALTYCODE$6, 0);
            return target;
        }
    }
    
    /**
     * True if has "LocalSubSpecialtyCode" element
     */
    public boolean isSetLocalSubSpecialtyCode()
    {
        synchronized (monitor())
        {
            check_orphaned();
            return get_store().count_elements(LOCALSUBSPECIALTYCODE$6) != 0;
        }
    }
    
    /**
     * Sets the "LocalSubSpecialtyCode" element
     */
    public void setLocalSubSpecialtyCode(java.lang.String localSubSpecialtyCode)
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.SimpleValue target = null;
            target = (org.apache.xmlbeans.SimpleValue)get_store().find_element_user(LOCALSUBSPECIALTYCODE$6, 0);
            if (target == null)
            {
                target = (org.apache.xmlbeans.SimpleValue)get_store().add_element_user(LOCALSUBSPECIALTYCODE$6);
            }
            target.setStringValue(localSubSpecialtyCode);
        }
    }
    
    /**
     * Sets (as xml) the "LocalSubSpecialtyCode" element
     */
    public void xsetLocalSubSpecialtyCode(uk.nhs.nhsia.datastandards.ecds.LocalSubSpecialtyCodeType localSubSpecialtyCode)
    {
        synchronized (monitor())
        {
            check_orphaned();
            uk.nhs.nhsia.datastandards.ecds.LocalSubSpecialtyCodeType target = null;
            target = (uk.nhs.nhsia.datastandards.ecds.LocalSubSpecialtyCodeType)get_store().find_element_user(LOCALSUBSPECIALTYCODE$6, 0);
            if (target == null)
            {
                target = (uk.nhs.nhsia.datastandards.ecds.LocalSubSpecialtyCodeType)get_store().add_element_user(LOCALSUBSPECIALTYCODE$6);
            }
            target.set(localSubSpecialtyCode);
        }
    }
    
    /**
     * Unsets the "LocalSubSpecialtyCode" element
     */
    public void unsetLocalSubSpecialtyCode()
    {
        synchronized (monitor())
        {
            check_orphaned();
            get_store().remove_element(LOCALSUBSPECIALTYCODE$6, 0);
        }
    }
}
