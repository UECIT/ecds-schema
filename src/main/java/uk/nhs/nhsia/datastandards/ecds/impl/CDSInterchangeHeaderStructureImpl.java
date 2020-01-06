/*
 * XML Type:  CDSInterchangeHeader_Structure
 * Namespace: http://www.nhsia.nhs.uk/DataStandards/XMLschema/CDS/ns
 * Java type: uk.nhs.nhsia.datastandards.ecds.CDSInterchangeHeaderStructure
 *
 * Automatically generated - do not modify.
 */
package uk.nhs.nhsia.datastandards.ecds.impl;
/**
 * An XML CDSInterchangeHeader_Structure(@http://www.nhsia.nhs.uk/DataStandards/XMLschema/CDS/ns).
 *
 * This is a complex type.
 */
public class CDSInterchangeHeaderStructureImpl extends org.apache.xmlbeans.impl.values.XmlComplexContentImpl implements uk.nhs.nhsia.datastandards.ecds.CDSInterchangeHeaderStructure
{
    private static final long serialVersionUID = 1L;
    
    public CDSInterchangeHeaderStructureImpl(org.apache.xmlbeans.SchemaType sType)
    {
        super(sType);
    }
    
    private static final javax.xml.namespace.QName CDSINTERCHANGESENDERIDENTITY$0 = 
        new javax.xml.namespace.QName("http://www.nhsia.nhs.uk/DataStandards/XMLschema/CDS/ns", "CDSInterchangeSenderIdentity");
    private static final javax.xml.namespace.QName CDSINTERCHANGERECEIVERIDENTITY$2 = 
        new javax.xml.namespace.QName("http://www.nhsia.nhs.uk/DataStandards/XMLschema/CDS/ns", "CDSInterchangeReceiverIdentity");
    private static final javax.xml.namespace.QName CDSINTERCHANGECONTROLREFERENCE$4 = 
        new javax.xml.namespace.QName("http://www.nhsia.nhs.uk/DataStandards/XMLschema/CDS/ns", "CDSInterchangeControlReference");
    private static final javax.xml.namespace.QName CDSINTERCHANGEDATEOFPREPARATION$6 = 
        new javax.xml.namespace.QName("http://www.nhsia.nhs.uk/DataStandards/XMLschema/CDS/ns", "CDSInterchangeDateOfPreparation");
    private static final javax.xml.namespace.QName CDSINTERCHANGETIMEOFPREPARATION$8 = 
        new javax.xml.namespace.QName("http://www.nhsia.nhs.uk/DataStandards/XMLschema/CDS/ns", "CDSInterchangeTimeOfPreparation");
    private static final javax.xml.namespace.QName CDSINTERCHANGEAPPLICATIONREFERENCE$10 = 
        new javax.xml.namespace.QName("http://www.nhsia.nhs.uk/DataStandards/XMLschema/CDS/ns", "CDSInterchangeApplicationReference");
    private static final javax.xml.namespace.QName CDSINTERCHANGETESTINDICATOR$12 = 
        new javax.xml.namespace.QName("http://www.nhsia.nhs.uk/DataStandards/XMLschema/CDS/ns", "CDSInterchangeTestIndicator");
    
    
    /**
     * Gets the "CDSInterchangeSenderIdentity" element
     */
    public java.lang.String getCDSInterchangeSenderIdentity()
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.SimpleValue target = null;
            target = (org.apache.xmlbeans.SimpleValue)get_store().find_element_user(CDSINTERCHANGESENDERIDENTITY$0, 0);
            if (target == null)
            {
                return null;
            }
            return target.getStringValue();
        }
    }
    
    /**
     * Gets (as xml) the "CDSInterchangeSenderIdentity" element
     */
    public uk.nhs.nhsia.datastandards.ecds.CDSInterchangeSenderIdentityType xgetCDSInterchangeSenderIdentity()
    {
        synchronized (monitor())
        {
            check_orphaned();
            uk.nhs.nhsia.datastandards.ecds.CDSInterchangeSenderIdentityType target = null;
            target = (uk.nhs.nhsia.datastandards.ecds.CDSInterchangeSenderIdentityType)get_store().find_element_user(CDSINTERCHANGESENDERIDENTITY$0, 0);
            return target;
        }
    }
    
    /**
     * Sets the "CDSInterchangeSenderIdentity" element
     */
    public void setCDSInterchangeSenderIdentity(java.lang.String cdsInterchangeSenderIdentity)
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.SimpleValue target = null;
            target = (org.apache.xmlbeans.SimpleValue)get_store().find_element_user(CDSINTERCHANGESENDERIDENTITY$0, 0);
            if (target == null)
            {
                target = (org.apache.xmlbeans.SimpleValue)get_store().add_element_user(CDSINTERCHANGESENDERIDENTITY$0);
            }
            target.setStringValue(cdsInterchangeSenderIdentity);
        }
    }
    
    /**
     * Sets (as xml) the "CDSInterchangeSenderIdentity" element
     */
    public void xsetCDSInterchangeSenderIdentity(uk.nhs.nhsia.datastandards.ecds.CDSInterchangeSenderIdentityType cdsInterchangeSenderIdentity)
    {
        synchronized (monitor())
        {
            check_orphaned();
            uk.nhs.nhsia.datastandards.ecds.CDSInterchangeSenderIdentityType target = null;
            target = (uk.nhs.nhsia.datastandards.ecds.CDSInterchangeSenderIdentityType)get_store().find_element_user(CDSINTERCHANGESENDERIDENTITY$0, 0);
            if (target == null)
            {
                target = (uk.nhs.nhsia.datastandards.ecds.CDSInterchangeSenderIdentityType)get_store().add_element_user(CDSINTERCHANGESENDERIDENTITY$0);
            }
            target.set(cdsInterchangeSenderIdentity);
        }
    }
    
    /**
     * Gets the "CDSInterchangeReceiverIdentity" element
     */
    public java.lang.String getCDSInterchangeReceiverIdentity()
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.SimpleValue target = null;
            target = (org.apache.xmlbeans.SimpleValue)get_store().find_element_user(CDSINTERCHANGERECEIVERIDENTITY$2, 0);
            if (target == null)
            {
                return null;
            }
            return target.getStringValue();
        }
    }
    
    /**
     * Gets (as xml) the "CDSInterchangeReceiverIdentity" element
     */
    public uk.nhs.nhsia.datastandards.ecds.CDSInterchangeReceiverIdentityType xgetCDSInterchangeReceiverIdentity()
    {
        synchronized (monitor())
        {
            check_orphaned();
            uk.nhs.nhsia.datastandards.ecds.CDSInterchangeReceiverIdentityType target = null;
            target = (uk.nhs.nhsia.datastandards.ecds.CDSInterchangeReceiverIdentityType)get_store().find_element_user(CDSINTERCHANGERECEIVERIDENTITY$2, 0);
            return target;
        }
    }
    
    /**
     * Sets the "CDSInterchangeReceiverIdentity" element
     */
    public void setCDSInterchangeReceiverIdentity(java.lang.String cdsInterchangeReceiverIdentity)
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.SimpleValue target = null;
            target = (org.apache.xmlbeans.SimpleValue)get_store().find_element_user(CDSINTERCHANGERECEIVERIDENTITY$2, 0);
            if (target == null)
            {
                target = (org.apache.xmlbeans.SimpleValue)get_store().add_element_user(CDSINTERCHANGERECEIVERIDENTITY$2);
            }
            target.setStringValue(cdsInterchangeReceiverIdentity);
        }
    }
    
    /**
     * Sets (as xml) the "CDSInterchangeReceiverIdentity" element
     */
    public void xsetCDSInterchangeReceiverIdentity(uk.nhs.nhsia.datastandards.ecds.CDSInterchangeReceiverIdentityType cdsInterchangeReceiverIdentity)
    {
        synchronized (monitor())
        {
            check_orphaned();
            uk.nhs.nhsia.datastandards.ecds.CDSInterchangeReceiverIdentityType target = null;
            target = (uk.nhs.nhsia.datastandards.ecds.CDSInterchangeReceiverIdentityType)get_store().find_element_user(CDSINTERCHANGERECEIVERIDENTITY$2, 0);
            if (target == null)
            {
                target = (uk.nhs.nhsia.datastandards.ecds.CDSInterchangeReceiverIdentityType)get_store().add_element_user(CDSINTERCHANGERECEIVERIDENTITY$2);
            }
            target.set(cdsInterchangeReceiverIdentity);
        }
    }
    
    /**
     * Gets the "CDSInterchangeControlReference" element
     */
    public java.lang.String getCDSInterchangeControlReference()
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.SimpleValue target = null;
            target = (org.apache.xmlbeans.SimpleValue)get_store().find_element_user(CDSINTERCHANGECONTROLREFERENCE$4, 0);
            if (target == null)
            {
                return null;
            }
            return target.getStringValue();
        }
    }
    
    /**
     * Gets (as xml) the "CDSInterchangeControlReference" element
     */
    public uk.nhs.nhsia.datastandards.ecds.CDSInterchangeControlReferenceType xgetCDSInterchangeControlReference()
    {
        synchronized (monitor())
        {
            check_orphaned();
            uk.nhs.nhsia.datastandards.ecds.CDSInterchangeControlReferenceType target = null;
            target = (uk.nhs.nhsia.datastandards.ecds.CDSInterchangeControlReferenceType)get_store().find_element_user(CDSINTERCHANGECONTROLREFERENCE$4, 0);
            return target;
        }
    }
    
    /**
     * Sets the "CDSInterchangeControlReference" element
     */
    public void setCDSInterchangeControlReference(java.lang.String cdsInterchangeControlReference)
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.SimpleValue target = null;
            target = (org.apache.xmlbeans.SimpleValue)get_store().find_element_user(CDSINTERCHANGECONTROLREFERENCE$4, 0);
            if (target == null)
            {
                target = (org.apache.xmlbeans.SimpleValue)get_store().add_element_user(CDSINTERCHANGECONTROLREFERENCE$4);
            }
            target.setStringValue(cdsInterchangeControlReference);
        }
    }
    
    /**
     * Sets (as xml) the "CDSInterchangeControlReference" element
     */
    public void xsetCDSInterchangeControlReference(uk.nhs.nhsia.datastandards.ecds.CDSInterchangeControlReferenceType cdsInterchangeControlReference)
    {
        synchronized (monitor())
        {
            check_orphaned();
            uk.nhs.nhsia.datastandards.ecds.CDSInterchangeControlReferenceType target = null;
            target = (uk.nhs.nhsia.datastandards.ecds.CDSInterchangeControlReferenceType)get_store().find_element_user(CDSINTERCHANGECONTROLREFERENCE$4, 0);
            if (target == null)
            {
                target = (uk.nhs.nhsia.datastandards.ecds.CDSInterchangeControlReferenceType)get_store().add_element_user(CDSINTERCHANGECONTROLREFERENCE$4);
            }
            target.set(cdsInterchangeControlReference);
        }
    }
    
    /**
     * Gets the "CDSInterchangeDateOfPreparation" element
     */
    public java.util.Calendar getCDSInterchangeDateOfPreparation()
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.SimpleValue target = null;
            target = (org.apache.xmlbeans.SimpleValue)get_store().find_element_user(CDSINTERCHANGEDATEOFPREPARATION$6, 0);
            if (target == null)
            {
                return null;
            }
            return target.getCalendarValue();
        }
    }
    
    /**
     * Gets (as xml) the "CDSInterchangeDateOfPreparation" element
     */
    public uk.nhs.nhsia.datastandards.ecds.CDSInterchangeDateOfPreparationType xgetCDSInterchangeDateOfPreparation()
    {
        synchronized (monitor())
        {
            check_orphaned();
            uk.nhs.nhsia.datastandards.ecds.CDSInterchangeDateOfPreparationType target = null;
            target = (uk.nhs.nhsia.datastandards.ecds.CDSInterchangeDateOfPreparationType)get_store().find_element_user(CDSINTERCHANGEDATEOFPREPARATION$6, 0);
            return target;
        }
    }
    
    /**
     * Sets the "CDSInterchangeDateOfPreparation" element
     */
    public void setCDSInterchangeDateOfPreparation(java.util.Calendar cdsInterchangeDateOfPreparation)
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.SimpleValue target = null;
            target = (org.apache.xmlbeans.SimpleValue)get_store().find_element_user(CDSINTERCHANGEDATEOFPREPARATION$6, 0);
            if (target == null)
            {
                target = (org.apache.xmlbeans.SimpleValue)get_store().add_element_user(CDSINTERCHANGEDATEOFPREPARATION$6);
            }
            target.setCalendarValue(cdsInterchangeDateOfPreparation);
        }
    }
    
    /**
     * Sets (as xml) the "CDSInterchangeDateOfPreparation" element
     */
    public void xsetCDSInterchangeDateOfPreparation(uk.nhs.nhsia.datastandards.ecds.CDSInterchangeDateOfPreparationType cdsInterchangeDateOfPreparation)
    {
        synchronized (monitor())
        {
            check_orphaned();
            uk.nhs.nhsia.datastandards.ecds.CDSInterchangeDateOfPreparationType target = null;
            target = (uk.nhs.nhsia.datastandards.ecds.CDSInterchangeDateOfPreparationType)get_store().find_element_user(CDSINTERCHANGEDATEOFPREPARATION$6, 0);
            if (target == null)
            {
                target = (uk.nhs.nhsia.datastandards.ecds.CDSInterchangeDateOfPreparationType)get_store().add_element_user(CDSINTERCHANGEDATEOFPREPARATION$6);
            }
            target.set(cdsInterchangeDateOfPreparation);
        }
    }
    
    /**
     * Gets the "CDSInterchangeTimeOfPreparation" element
     */
    public java.util.Calendar getCDSInterchangeTimeOfPreparation()
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.SimpleValue target = null;
            target = (org.apache.xmlbeans.SimpleValue)get_store().find_element_user(CDSINTERCHANGETIMEOFPREPARATION$8, 0);
            if (target == null)
            {
                return null;
            }
            return target.getCalendarValue();
        }
    }
    
    /**
     * Gets (as xml) the "CDSInterchangeTimeOfPreparation" element
     */
    public uk.nhs.nhsia.datastandards.ecds.CDSInterchangeTimeOfPreparationType xgetCDSInterchangeTimeOfPreparation()
    {
        synchronized (monitor())
        {
            check_orphaned();
            uk.nhs.nhsia.datastandards.ecds.CDSInterchangeTimeOfPreparationType target = null;
            target = (uk.nhs.nhsia.datastandards.ecds.CDSInterchangeTimeOfPreparationType)get_store().find_element_user(CDSINTERCHANGETIMEOFPREPARATION$8, 0);
            return target;
        }
    }
    
    /**
     * Sets the "CDSInterchangeTimeOfPreparation" element
     */
    public void setCDSInterchangeTimeOfPreparation(java.util.Calendar cdsInterchangeTimeOfPreparation)
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.SimpleValue target = null;
            target = (org.apache.xmlbeans.SimpleValue)get_store().find_element_user(CDSINTERCHANGETIMEOFPREPARATION$8, 0);
            if (target == null)
            {
                target = (org.apache.xmlbeans.SimpleValue)get_store().add_element_user(CDSINTERCHANGETIMEOFPREPARATION$8);
            }
            target.setCalendarValue(cdsInterchangeTimeOfPreparation);
        }
    }
    
    /**
     * Sets (as xml) the "CDSInterchangeTimeOfPreparation" element
     */
    public void xsetCDSInterchangeTimeOfPreparation(uk.nhs.nhsia.datastandards.ecds.CDSInterchangeTimeOfPreparationType cdsInterchangeTimeOfPreparation)
    {
        synchronized (monitor())
        {
            check_orphaned();
            uk.nhs.nhsia.datastandards.ecds.CDSInterchangeTimeOfPreparationType target = null;
            target = (uk.nhs.nhsia.datastandards.ecds.CDSInterchangeTimeOfPreparationType)get_store().find_element_user(CDSINTERCHANGETIMEOFPREPARATION$8, 0);
            if (target == null)
            {
                target = (uk.nhs.nhsia.datastandards.ecds.CDSInterchangeTimeOfPreparationType)get_store().add_element_user(CDSINTERCHANGETIMEOFPREPARATION$8);
            }
            target.set(cdsInterchangeTimeOfPreparation);
        }
    }
    
    /**
     * Gets the "CDSInterchangeApplicationReference" element
     */
    public java.lang.String getCDSInterchangeApplicationReference()
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.SimpleValue target = null;
            target = (org.apache.xmlbeans.SimpleValue)get_store().find_element_user(CDSINTERCHANGEAPPLICATIONREFERENCE$10, 0);
            if (target == null)
            {
                return null;
            }
            return target.getStringValue();
        }
    }
    
    /**
     * Gets (as xml) the "CDSInterchangeApplicationReference" element
     */
    public uk.nhs.nhsia.datastandards.ecds.CDSInterchangeApplicationReferenceType xgetCDSInterchangeApplicationReference()
    {
        synchronized (monitor())
        {
            check_orphaned();
            uk.nhs.nhsia.datastandards.ecds.CDSInterchangeApplicationReferenceType target = null;
            target = (uk.nhs.nhsia.datastandards.ecds.CDSInterchangeApplicationReferenceType)get_store().find_element_user(CDSINTERCHANGEAPPLICATIONREFERENCE$10, 0);
            return target;
        }
    }
    
    /**
     * Sets the "CDSInterchangeApplicationReference" element
     */
    public void setCDSInterchangeApplicationReference(java.lang.String cdsInterchangeApplicationReference)
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.SimpleValue target = null;
            target = (org.apache.xmlbeans.SimpleValue)get_store().find_element_user(CDSINTERCHANGEAPPLICATIONREFERENCE$10, 0);
            if (target == null)
            {
                target = (org.apache.xmlbeans.SimpleValue)get_store().add_element_user(CDSINTERCHANGEAPPLICATIONREFERENCE$10);
            }
            target.setStringValue(cdsInterchangeApplicationReference);
        }
    }
    
    /**
     * Sets (as xml) the "CDSInterchangeApplicationReference" element
     */
    public void xsetCDSInterchangeApplicationReference(uk.nhs.nhsia.datastandards.ecds.CDSInterchangeApplicationReferenceType cdsInterchangeApplicationReference)
    {
        synchronized (monitor())
        {
            check_orphaned();
            uk.nhs.nhsia.datastandards.ecds.CDSInterchangeApplicationReferenceType target = null;
            target = (uk.nhs.nhsia.datastandards.ecds.CDSInterchangeApplicationReferenceType)get_store().find_element_user(CDSINTERCHANGEAPPLICATIONREFERENCE$10, 0);
            if (target == null)
            {
                target = (uk.nhs.nhsia.datastandards.ecds.CDSInterchangeApplicationReferenceType)get_store().add_element_user(CDSINTERCHANGEAPPLICATIONREFERENCE$10);
            }
            target.set(cdsInterchangeApplicationReference);
        }
    }
    
    /**
     * Gets the "CDSInterchangeTestIndicator" element
     */
    public java.lang.String getCDSInterchangeTestIndicator()
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.SimpleValue target = null;
            target = (org.apache.xmlbeans.SimpleValue)get_store().find_element_user(CDSINTERCHANGETESTINDICATOR$12, 0);
            if (target == null)
            {
                return null;
            }
            return target.getStringValue();
        }
    }
    
    /**
     * Gets (as xml) the "CDSInterchangeTestIndicator" element
     */
    public uk.nhs.nhsia.datastandards.ecds.CDSInterchangeTestIndicatorType xgetCDSInterchangeTestIndicator()
    {
        synchronized (monitor())
        {
            check_orphaned();
            uk.nhs.nhsia.datastandards.ecds.CDSInterchangeTestIndicatorType target = null;
            target = (uk.nhs.nhsia.datastandards.ecds.CDSInterchangeTestIndicatorType)get_store().find_element_user(CDSINTERCHANGETESTINDICATOR$12, 0);
            return target;
        }
    }
    
    /**
     * True if has "CDSInterchangeTestIndicator" element
     */
    public boolean isSetCDSInterchangeTestIndicator()
    {
        synchronized (monitor())
        {
            check_orphaned();
            return get_store().count_elements(CDSINTERCHANGETESTINDICATOR$12) != 0;
        }
    }
    
    /**
     * Sets the "CDSInterchangeTestIndicator" element
     */
    public void setCDSInterchangeTestIndicator(java.lang.String cdsInterchangeTestIndicator)
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.SimpleValue target = null;
            target = (org.apache.xmlbeans.SimpleValue)get_store().find_element_user(CDSINTERCHANGETESTINDICATOR$12, 0);
            if (target == null)
            {
                target = (org.apache.xmlbeans.SimpleValue)get_store().add_element_user(CDSINTERCHANGETESTINDICATOR$12);
            }
            target.setStringValue(cdsInterchangeTestIndicator);
        }
    }
    
    /**
     * Sets (as xml) the "CDSInterchangeTestIndicator" element
     */
    public void xsetCDSInterchangeTestIndicator(uk.nhs.nhsia.datastandards.ecds.CDSInterchangeTestIndicatorType cdsInterchangeTestIndicator)
    {
        synchronized (monitor())
        {
            check_orphaned();
            uk.nhs.nhsia.datastandards.ecds.CDSInterchangeTestIndicatorType target = null;
            target = (uk.nhs.nhsia.datastandards.ecds.CDSInterchangeTestIndicatorType)get_store().find_element_user(CDSINTERCHANGETESTINDICATOR$12, 0);
            if (target == null)
            {
                target = (uk.nhs.nhsia.datastandards.ecds.CDSInterchangeTestIndicatorType)get_store().add_element_user(CDSINTERCHANGETESTINDICATOR$12);
            }
            target.set(cdsInterchangeTestIndicator);
        }
    }
    
    /**
     * Unsets the "CDSInterchangeTestIndicator" element
     */
    public void unsetCDSInterchangeTestIndicator()
    {
        synchronized (monitor())
        {
            check_orphaned();
            get_store().remove_element(CDSINTERCHANGETESTINDICATOR$12, 0);
        }
    }
}
