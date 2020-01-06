/*
 * XML Type:  CDSMessageTrailer_Structure
 * Namespace: http://www.nhsia.nhs.uk/DataStandards/XMLschema/CDS/ns
 * Java type: uk.nhs.nhsia.datastandards.ecds.CDSMessageTrailerStructure
 *
 * Automatically generated - do not modify.
 */
package uk.nhs.nhsia.datastandards.ecds.impl;
/**
 * An XML CDSMessageTrailer_Structure(@http://www.nhsia.nhs.uk/DataStandards/XMLschema/CDS/ns).
 *
 * This is a complex type.
 */
public class CDSMessageTrailerStructureImpl extends org.apache.xmlbeans.impl.values.XmlComplexContentImpl implements uk.nhs.nhsia.datastandards.ecds.CDSMessageTrailerStructure
{
    private static final long serialVersionUID = 1L;
    
    public CDSMessageTrailerStructureImpl(org.apache.xmlbeans.SchemaType sType)
    {
        super(sType);
    }
    
    private static final javax.xml.namespace.QName CDSMESSAGEREFERENCENUMBER$0 = 
        new javax.xml.namespace.QName("http://www.nhsia.nhs.uk/DataStandards/XMLschema/CDS/ns", "CDSMessageReferenceNumber");
    
    
    /**
     * Gets the "CDSMessageReferenceNumber" element
     */
    public long getCDSMessageReferenceNumber()
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.SimpleValue target = null;
            target = (org.apache.xmlbeans.SimpleValue)get_store().find_element_user(CDSMESSAGEREFERENCENUMBER$0, 0);
            if (target == null)
            {
                return 0L;
            }
            return target.getLongValue();
        }
    }
    
    /**
     * Gets (as xml) the "CDSMessageReferenceNumber" element
     */
    public uk.nhs.nhsia.datastandards.ecds.CDSMessageReferenceNumberType xgetCDSMessageReferenceNumber()
    {
        synchronized (monitor())
        {
            check_orphaned();
            uk.nhs.nhsia.datastandards.ecds.CDSMessageReferenceNumberType target = null;
            target = (uk.nhs.nhsia.datastandards.ecds.CDSMessageReferenceNumberType)get_store().find_element_user(CDSMESSAGEREFERENCENUMBER$0, 0);
            return target;
        }
    }
    
    /**
     * Sets the "CDSMessageReferenceNumber" element
     */
    public void setCDSMessageReferenceNumber(long cdsMessageReferenceNumber)
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.SimpleValue target = null;
            target = (org.apache.xmlbeans.SimpleValue)get_store().find_element_user(CDSMESSAGEREFERENCENUMBER$0, 0);
            if (target == null)
            {
                target = (org.apache.xmlbeans.SimpleValue)get_store().add_element_user(CDSMESSAGEREFERENCENUMBER$0);
            }
            target.setLongValue(cdsMessageReferenceNumber);
        }
    }
    
    /**
     * Sets (as xml) the "CDSMessageReferenceNumber" element
     */
    public void xsetCDSMessageReferenceNumber(uk.nhs.nhsia.datastandards.ecds.CDSMessageReferenceNumberType cdsMessageReferenceNumber)
    {
        synchronized (monitor())
        {
            check_orphaned();
            uk.nhs.nhsia.datastandards.ecds.CDSMessageReferenceNumberType target = null;
            target = (uk.nhs.nhsia.datastandards.ecds.CDSMessageReferenceNumberType)get_store().find_element_user(CDSMESSAGEREFERENCENUMBER$0, 0);
            if (target == null)
            {
                target = (uk.nhs.nhsia.datastandards.ecds.CDSMessageReferenceNumberType)get_store().add_element_user(CDSMESSAGEREFERENCENUMBER$0);
            }
            target.set(cdsMessageReferenceNumber);
        }
    }
}
