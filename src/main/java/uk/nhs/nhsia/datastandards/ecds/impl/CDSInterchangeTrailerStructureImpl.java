/*
 * XML Type:  CDSInterchangeTrailer_Structure
 * Namespace: http://www.nhsia.nhs.uk/DataStandards/XMLschema/CDS/ns
 * Java type: uk.nhs.nhsia.datastandards.ecds.CDSInterchangeTrailerStructure
 *
 * Automatically generated - do not modify.
 */
package uk.nhs.nhsia.datastandards.ecds.impl;
/**
 * An XML CDSInterchangeTrailer_Structure(@http://www.nhsia.nhs.uk/DataStandards/XMLschema/CDS/ns).
 *
 * This is a complex type.
 */
public class CDSInterchangeTrailerStructureImpl extends org.apache.xmlbeans.impl.values.XmlComplexContentImpl implements uk.nhs.nhsia.datastandards.ecds.CDSInterchangeTrailerStructure
{
    private static final long serialVersionUID = 1L;
    
    public CDSInterchangeTrailerStructureImpl(org.apache.xmlbeans.SchemaType sType)
    {
        super(sType);
    }
    
    private static final javax.xml.namespace.QName CDSINTERCHANGECONTROLREFERENCE$0 = 
        new javax.xml.namespace.QName("http://www.nhsia.nhs.uk/DataStandards/XMLschema/CDS/ns", "CDSInterchangeControlReference");
    private static final javax.xml.namespace.QName CDSINTERCHANGECONTROLCOUNT$2 = 
        new javax.xml.namespace.QName("http://www.nhsia.nhs.uk/DataStandards/XMLschema/CDS/ns", "CDSInterchangeControlCount");
    private static final javax.xml.namespace.QName CDSINTERCHANGESENDERIDENTITY$4 = 
        new javax.xml.namespace.QName("http://www.nhsia.nhs.uk/DataStandards/XMLschema/CDS/ns", "CDSInterchangeSenderIdentity");
    private static final javax.xml.namespace.QName CDSINTERCHANGERECEIVERIDENTITY$6 = 
        new javax.xml.namespace.QName("http://www.nhsia.nhs.uk/DataStandards/XMLschema/CDS/ns", "CDSInterchangeReceiverIdentity");
    
    
    /**
     * Gets the "CDSInterchangeControlReference" element
     */
    public java.lang.String getCDSInterchangeControlReference()
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.SimpleValue target = null;
            target = (org.apache.xmlbeans.SimpleValue)get_store().find_element_user(CDSINTERCHANGECONTROLREFERENCE$0, 0);
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
            target = (uk.nhs.nhsia.datastandards.ecds.CDSInterchangeControlReferenceType)get_store().find_element_user(CDSINTERCHANGECONTROLREFERENCE$0, 0);
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
            target = (org.apache.xmlbeans.SimpleValue)get_store().find_element_user(CDSINTERCHANGECONTROLREFERENCE$0, 0);
            if (target == null)
            {
                target = (org.apache.xmlbeans.SimpleValue)get_store().add_element_user(CDSINTERCHANGECONTROLREFERENCE$0);
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
            target = (uk.nhs.nhsia.datastandards.ecds.CDSInterchangeControlReferenceType)get_store().find_element_user(CDSINTERCHANGECONTROLREFERENCE$0, 0);
            if (target == null)
            {
                target = (uk.nhs.nhsia.datastandards.ecds.CDSInterchangeControlReferenceType)get_store().add_element_user(CDSINTERCHANGECONTROLREFERENCE$0);
            }
            target.set(cdsInterchangeControlReference);
        }
    }
    
    /**
     * Gets the "CDSInterchangeControlCount" element
     */
    public long getCDSInterchangeControlCount()
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.SimpleValue target = null;
            target = (org.apache.xmlbeans.SimpleValue)get_store().find_element_user(CDSINTERCHANGECONTROLCOUNT$2, 0);
            if (target == null)
            {
                return 0L;
            }
            return target.getLongValue();
        }
    }
    
    /**
     * Gets (as xml) the "CDSInterchangeControlCount" element
     */
    public uk.nhs.nhsia.datastandards.ecds.CDSInterchangeControlCountType xgetCDSInterchangeControlCount()
    {
        synchronized (monitor())
        {
            check_orphaned();
            uk.nhs.nhsia.datastandards.ecds.CDSInterchangeControlCountType target = null;
            target = (uk.nhs.nhsia.datastandards.ecds.CDSInterchangeControlCountType)get_store().find_element_user(CDSINTERCHANGECONTROLCOUNT$2, 0);
            return target;
        }
    }
    
    /**
     * Sets the "CDSInterchangeControlCount" element
     */
    public void setCDSInterchangeControlCount(long cdsInterchangeControlCount)
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.SimpleValue target = null;
            target = (org.apache.xmlbeans.SimpleValue)get_store().find_element_user(CDSINTERCHANGECONTROLCOUNT$2, 0);
            if (target == null)
            {
                target = (org.apache.xmlbeans.SimpleValue)get_store().add_element_user(CDSINTERCHANGECONTROLCOUNT$2);
            }
            target.setLongValue(cdsInterchangeControlCount);
        }
    }
    
    /**
     * Sets (as xml) the "CDSInterchangeControlCount" element
     */
    public void xsetCDSInterchangeControlCount(uk.nhs.nhsia.datastandards.ecds.CDSInterchangeControlCountType cdsInterchangeControlCount)
    {
        synchronized (monitor())
        {
            check_orphaned();
            uk.nhs.nhsia.datastandards.ecds.CDSInterchangeControlCountType target = null;
            target = (uk.nhs.nhsia.datastandards.ecds.CDSInterchangeControlCountType)get_store().find_element_user(CDSINTERCHANGECONTROLCOUNT$2, 0);
            if (target == null)
            {
                target = (uk.nhs.nhsia.datastandards.ecds.CDSInterchangeControlCountType)get_store().add_element_user(CDSINTERCHANGECONTROLCOUNT$2);
            }
            target.set(cdsInterchangeControlCount);
        }
    }
    
    /**
     * Gets the "CDSInterchangeSenderIdentity" element
     */
    public java.lang.String getCDSInterchangeSenderIdentity()
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.SimpleValue target = null;
            target = (org.apache.xmlbeans.SimpleValue)get_store().find_element_user(CDSINTERCHANGESENDERIDENTITY$4, 0);
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
            target = (uk.nhs.nhsia.datastandards.ecds.CDSInterchangeSenderIdentityType)get_store().find_element_user(CDSINTERCHANGESENDERIDENTITY$4, 0);
            return target;
        }
    }
    
    /**
     * True if has "CDSInterchangeSenderIdentity" element
     */
    public boolean isSetCDSInterchangeSenderIdentity()
    {
        synchronized (monitor())
        {
            check_orphaned();
            return get_store().count_elements(CDSINTERCHANGESENDERIDENTITY$4) != 0;
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
            target = (org.apache.xmlbeans.SimpleValue)get_store().find_element_user(CDSINTERCHANGESENDERIDENTITY$4, 0);
            if (target == null)
            {
                target = (org.apache.xmlbeans.SimpleValue)get_store().add_element_user(CDSINTERCHANGESENDERIDENTITY$4);
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
            target = (uk.nhs.nhsia.datastandards.ecds.CDSInterchangeSenderIdentityType)get_store().find_element_user(CDSINTERCHANGESENDERIDENTITY$4, 0);
            if (target == null)
            {
                target = (uk.nhs.nhsia.datastandards.ecds.CDSInterchangeSenderIdentityType)get_store().add_element_user(CDSINTERCHANGESENDERIDENTITY$4);
            }
            target.set(cdsInterchangeSenderIdentity);
        }
    }
    
    /**
     * Unsets the "CDSInterchangeSenderIdentity" element
     */
    public void unsetCDSInterchangeSenderIdentity()
    {
        synchronized (monitor())
        {
            check_orphaned();
            get_store().remove_element(CDSINTERCHANGESENDERIDENTITY$4, 0);
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
            target = (org.apache.xmlbeans.SimpleValue)get_store().find_element_user(CDSINTERCHANGERECEIVERIDENTITY$6, 0);
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
            target = (uk.nhs.nhsia.datastandards.ecds.CDSInterchangeReceiverIdentityType)get_store().find_element_user(CDSINTERCHANGERECEIVERIDENTITY$6, 0);
            return target;
        }
    }
    
    /**
     * True if has "CDSInterchangeReceiverIdentity" element
     */
    public boolean isSetCDSInterchangeReceiverIdentity()
    {
        synchronized (monitor())
        {
            check_orphaned();
            return get_store().count_elements(CDSINTERCHANGERECEIVERIDENTITY$6) != 0;
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
            target = (org.apache.xmlbeans.SimpleValue)get_store().find_element_user(CDSINTERCHANGERECEIVERIDENTITY$6, 0);
            if (target == null)
            {
                target = (org.apache.xmlbeans.SimpleValue)get_store().add_element_user(CDSINTERCHANGERECEIVERIDENTITY$6);
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
            target = (uk.nhs.nhsia.datastandards.ecds.CDSInterchangeReceiverIdentityType)get_store().find_element_user(CDSINTERCHANGERECEIVERIDENTITY$6, 0);
            if (target == null)
            {
                target = (uk.nhs.nhsia.datastandards.ecds.CDSInterchangeReceiverIdentityType)get_store().add_element_user(CDSINTERCHANGERECEIVERIDENTITY$6);
            }
            target.set(cdsInterchangeReceiverIdentity);
        }
    }
    
    /**
     * Unsets the "CDSInterchangeReceiverIdentity" element
     */
    public void unsetCDSInterchangeReceiverIdentity()
    {
        synchronized (monitor())
        {
            check_orphaned();
            get_store().remove_element(CDSINTERCHANGERECEIVERIDENTITY$6, 0);
        }
    }
}
