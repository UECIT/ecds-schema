/*
 * XML Type:  ConsultantEpisodeLengthOfStayAdjustment_Structure
 * Namespace: http://www.nhsia.nhs.uk/DataStandards/XMLschema/CDS/ns
 * Java type: uk.nhs.nhsia.datastandards.ecds.ConsultantEpisodeLengthOfStayAdjustmentStructure
 *
 * Automatically generated - do not modify.
 */
package uk.nhs.nhsia.datastandards.ecds.impl;
/**
 * An XML ConsultantEpisodeLengthOfStayAdjustment_Structure(@http://www.nhsia.nhs.uk/DataStandards/XMLschema/CDS/ns).
 *
 * This is a complex type.
 */
public class ConsultantEpisodeLengthOfStayAdjustmentStructureImpl extends org.apache.xmlbeans.impl.values.XmlComplexContentImpl implements uk.nhs.nhsia.datastandards.ecds.ConsultantEpisodeLengthOfStayAdjustmentStructure
{
    private static final long serialVersionUID = 1L;
    
    public ConsultantEpisodeLengthOfStayAdjustmentStructureImpl(org.apache.xmlbeans.SchemaType sType)
    {
        super(sType);
    }
    
    private static final javax.xml.namespace.QName LENGTHOFSTAYADJUSTMENTREHAB$0 = 
        new javax.xml.namespace.QName("http://www.nhsia.nhs.uk/DataStandards/XMLschema/CDS/ns", "LengthOfStayAdjustmentRehab");
    private static final javax.xml.namespace.QName LENGTHOFSTAYADJUSTMENTSPECIALISTPALLIATIVECARE$2 = 
        new javax.xml.namespace.QName("http://www.nhsia.nhs.uk/DataStandards/XMLschema/CDS/ns", "LengthOfStayAdjustmentSpecialistPalliativeCare");
    
    
    /**
     * Gets the "LengthOfStayAdjustmentRehab" element
     */
    public int getLengthOfStayAdjustmentRehab()
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.SimpleValue target = null;
            target = (org.apache.xmlbeans.SimpleValue)get_store().find_element_user(LENGTHOFSTAYADJUSTMENTREHAB$0, 0);
            if (target == null)
            {
                return 0;
            }
            return target.getIntValue();
        }
    }
    
    /**
     * Gets (as xml) the "LengthOfStayAdjustmentRehab" element
     */
    public uk.nhs.nhsia.datastandards.ecds.LengthOfStayAdjustmentType xgetLengthOfStayAdjustmentRehab()
    {
        synchronized (monitor())
        {
            check_orphaned();
            uk.nhs.nhsia.datastandards.ecds.LengthOfStayAdjustmentType target = null;
            target = (uk.nhs.nhsia.datastandards.ecds.LengthOfStayAdjustmentType)get_store().find_element_user(LENGTHOFSTAYADJUSTMENTREHAB$0, 0);
            return target;
        }
    }
    
    /**
     * True if has "LengthOfStayAdjustmentRehab" element
     */
    public boolean isSetLengthOfStayAdjustmentRehab()
    {
        synchronized (monitor())
        {
            check_orphaned();
            return get_store().count_elements(LENGTHOFSTAYADJUSTMENTREHAB$0) != 0;
        }
    }
    
    /**
     * Sets the "LengthOfStayAdjustmentRehab" element
     */
    public void setLengthOfStayAdjustmentRehab(int lengthOfStayAdjustmentRehab)
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.SimpleValue target = null;
            target = (org.apache.xmlbeans.SimpleValue)get_store().find_element_user(LENGTHOFSTAYADJUSTMENTREHAB$0, 0);
            if (target == null)
            {
                target = (org.apache.xmlbeans.SimpleValue)get_store().add_element_user(LENGTHOFSTAYADJUSTMENTREHAB$0);
            }
            target.setIntValue(lengthOfStayAdjustmentRehab);
        }
    }
    
    /**
     * Sets (as xml) the "LengthOfStayAdjustmentRehab" element
     */
    public void xsetLengthOfStayAdjustmentRehab(uk.nhs.nhsia.datastandards.ecds.LengthOfStayAdjustmentType lengthOfStayAdjustmentRehab)
    {
        synchronized (monitor())
        {
            check_orphaned();
            uk.nhs.nhsia.datastandards.ecds.LengthOfStayAdjustmentType target = null;
            target = (uk.nhs.nhsia.datastandards.ecds.LengthOfStayAdjustmentType)get_store().find_element_user(LENGTHOFSTAYADJUSTMENTREHAB$0, 0);
            if (target == null)
            {
                target = (uk.nhs.nhsia.datastandards.ecds.LengthOfStayAdjustmentType)get_store().add_element_user(LENGTHOFSTAYADJUSTMENTREHAB$0);
            }
            target.set(lengthOfStayAdjustmentRehab);
        }
    }
    
    /**
     * Unsets the "LengthOfStayAdjustmentRehab" element
     */
    public void unsetLengthOfStayAdjustmentRehab()
    {
        synchronized (monitor())
        {
            check_orphaned();
            get_store().remove_element(LENGTHOFSTAYADJUSTMENTREHAB$0, 0);
        }
    }
    
    /**
     * Gets the "LengthOfStayAdjustmentSpecialistPalliativeCare" element
     */
    public int getLengthOfStayAdjustmentSpecialistPalliativeCare()
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.SimpleValue target = null;
            target = (org.apache.xmlbeans.SimpleValue)get_store().find_element_user(LENGTHOFSTAYADJUSTMENTSPECIALISTPALLIATIVECARE$2, 0);
            if (target == null)
            {
                return 0;
            }
            return target.getIntValue();
        }
    }
    
    /**
     * Gets (as xml) the "LengthOfStayAdjustmentSpecialistPalliativeCare" element
     */
    public uk.nhs.nhsia.datastandards.ecds.LengthOfStayAdjustmentType xgetLengthOfStayAdjustmentSpecialistPalliativeCare()
    {
        synchronized (monitor())
        {
            check_orphaned();
            uk.nhs.nhsia.datastandards.ecds.LengthOfStayAdjustmentType target = null;
            target = (uk.nhs.nhsia.datastandards.ecds.LengthOfStayAdjustmentType)get_store().find_element_user(LENGTHOFSTAYADJUSTMENTSPECIALISTPALLIATIVECARE$2, 0);
            return target;
        }
    }
    
    /**
     * True if has "LengthOfStayAdjustmentSpecialistPalliativeCare" element
     */
    public boolean isSetLengthOfStayAdjustmentSpecialistPalliativeCare()
    {
        synchronized (monitor())
        {
            check_orphaned();
            return get_store().count_elements(LENGTHOFSTAYADJUSTMENTSPECIALISTPALLIATIVECARE$2) != 0;
        }
    }
    
    /**
     * Sets the "LengthOfStayAdjustmentSpecialistPalliativeCare" element
     */
    public void setLengthOfStayAdjustmentSpecialistPalliativeCare(int lengthOfStayAdjustmentSpecialistPalliativeCare)
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.SimpleValue target = null;
            target = (org.apache.xmlbeans.SimpleValue)get_store().find_element_user(LENGTHOFSTAYADJUSTMENTSPECIALISTPALLIATIVECARE$2, 0);
            if (target == null)
            {
                target = (org.apache.xmlbeans.SimpleValue)get_store().add_element_user(LENGTHOFSTAYADJUSTMENTSPECIALISTPALLIATIVECARE$2);
            }
            target.setIntValue(lengthOfStayAdjustmentSpecialistPalliativeCare);
        }
    }
    
    /**
     * Sets (as xml) the "LengthOfStayAdjustmentSpecialistPalliativeCare" element
     */
    public void xsetLengthOfStayAdjustmentSpecialistPalliativeCare(uk.nhs.nhsia.datastandards.ecds.LengthOfStayAdjustmentType lengthOfStayAdjustmentSpecialistPalliativeCare)
    {
        synchronized (monitor())
        {
            check_orphaned();
            uk.nhs.nhsia.datastandards.ecds.LengthOfStayAdjustmentType target = null;
            target = (uk.nhs.nhsia.datastandards.ecds.LengthOfStayAdjustmentType)get_store().find_element_user(LENGTHOFSTAYADJUSTMENTSPECIALISTPALLIATIVECARE$2, 0);
            if (target == null)
            {
                target = (uk.nhs.nhsia.datastandards.ecds.LengthOfStayAdjustmentType)get_store().add_element_user(LENGTHOFSTAYADJUSTMENTSPECIALISTPALLIATIVECARE$2);
            }
            target.set(lengthOfStayAdjustmentSpecialistPalliativeCare);
        }
    }
    
    /**
     * Unsets the "LengthOfStayAdjustmentSpecialistPalliativeCare" element
     */
    public void unsetLengthOfStayAdjustmentSpecialistPalliativeCare()
    {
        synchronized (monitor())
        {
            check_orphaned();
            get_store().remove_element(LENGTHOFSTAYADJUSTMENTSPECIALISTPALLIATIVECARE$2, 0);
        }
    }
}
