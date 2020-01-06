/*
 * XML Type:  PatientCharacteristics_Delivery_Structure
 * Namespace: http://www.nhsia.nhs.uk/DataStandards/XMLschema/CDS/ns
 * Java type: uk.nhs.nhsia.datastandards.ecds.PatientCharacteristicsDeliveryStructure
 *
 * Automatically generated - do not modify.
 */
package uk.nhs.nhsia.datastandards.ecds.impl;
/**
 * An XML PatientCharacteristics_Delivery_Structure(@http://www.nhsia.nhs.uk/DataStandards/XMLschema/CDS/ns).
 *
 * This is a complex type.
 */
public class PatientCharacteristicsDeliveryStructureImpl extends org.apache.xmlbeans.impl.values.XmlComplexContentImpl implements uk.nhs.nhsia.datastandards.ecds.PatientCharacteristicsDeliveryStructure
{
    private static final long serialVersionUID = 1L;
    
    public PatientCharacteristicsDeliveryStructureImpl(org.apache.xmlbeans.SchemaType sType)
    {
        super(sType);
    }
    
    private static final javax.xml.namespace.QName PREGNANCYTOTALPREVIOUSPREGNANCIES$0 = 
        new javax.xml.namespace.QName("http://www.nhsia.nhs.uk/DataStandards/XMLschema/CDS/ns", "PregnancyTotalPreviousPregnancies");
    
    
    /**
     * Gets the "PregnancyTotalPreviousPregnancies" element
     */
    public uk.nhs.nhsia.datastandards.ecds.PregnancyTotalPreviousPregnanciesType.Enum getPregnancyTotalPreviousPregnancies()
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.SimpleValue target = null;
            target = (org.apache.xmlbeans.SimpleValue)get_store().find_element_user(PREGNANCYTOTALPREVIOUSPREGNANCIES$0, 0);
            if (target == null)
            {
                return null;
            }
            return (uk.nhs.nhsia.datastandards.ecds.PregnancyTotalPreviousPregnanciesType.Enum)target.getEnumValue();
        }
    }
    
    /**
     * Gets (as xml) the "PregnancyTotalPreviousPregnancies" element
     */
    public uk.nhs.nhsia.datastandards.ecds.PregnancyTotalPreviousPregnanciesType xgetPregnancyTotalPreviousPregnancies()
    {
        synchronized (monitor())
        {
            check_orphaned();
            uk.nhs.nhsia.datastandards.ecds.PregnancyTotalPreviousPregnanciesType target = null;
            target = (uk.nhs.nhsia.datastandards.ecds.PregnancyTotalPreviousPregnanciesType)get_store().find_element_user(PREGNANCYTOTALPREVIOUSPREGNANCIES$0, 0);
            return target;
        }
    }
    
    /**
     * True if has "PregnancyTotalPreviousPregnancies" element
     */
    public boolean isSetPregnancyTotalPreviousPregnancies()
    {
        synchronized (monitor())
        {
            check_orphaned();
            return get_store().count_elements(PREGNANCYTOTALPREVIOUSPREGNANCIES$0) != 0;
        }
    }
    
    /**
     * Sets the "PregnancyTotalPreviousPregnancies" element
     */
    public void setPregnancyTotalPreviousPregnancies(uk.nhs.nhsia.datastandards.ecds.PregnancyTotalPreviousPregnanciesType.Enum pregnancyTotalPreviousPregnancies)
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.SimpleValue target = null;
            target = (org.apache.xmlbeans.SimpleValue)get_store().find_element_user(PREGNANCYTOTALPREVIOUSPREGNANCIES$0, 0);
            if (target == null)
            {
                target = (org.apache.xmlbeans.SimpleValue)get_store().add_element_user(PREGNANCYTOTALPREVIOUSPREGNANCIES$0);
            }
            target.setEnumValue(pregnancyTotalPreviousPregnancies);
        }
    }
    
    /**
     * Sets (as xml) the "PregnancyTotalPreviousPregnancies" element
     */
    public void xsetPregnancyTotalPreviousPregnancies(uk.nhs.nhsia.datastandards.ecds.PregnancyTotalPreviousPregnanciesType pregnancyTotalPreviousPregnancies)
    {
        synchronized (monitor())
        {
            check_orphaned();
            uk.nhs.nhsia.datastandards.ecds.PregnancyTotalPreviousPregnanciesType target = null;
            target = (uk.nhs.nhsia.datastandards.ecds.PregnancyTotalPreviousPregnanciesType)get_store().find_element_user(PREGNANCYTOTALPREVIOUSPREGNANCIES$0, 0);
            if (target == null)
            {
                target = (uk.nhs.nhsia.datastandards.ecds.PregnancyTotalPreviousPregnanciesType)get_store().add_element_user(PREGNANCYTOTALPREVIOUSPREGNANCIES$0);
            }
            target.set(pregnancyTotalPreviousPregnancies);
        }
    }
    
    /**
     * Unsets the "PregnancyTotalPreviousPregnancies" element
     */
    public void unsetPregnancyTotalPreviousPregnancies()
    {
        synchronized (monitor())
        {
            check_orphaned();
            get_store().remove_element(PREGNANCYTOTALPREVIOUSPREGNANCIES$0, 0);
        }
    }
}
