/*
 * XML Type:  CDSMessageHeader_Structure
 * Namespace: http://www.nhsia.nhs.uk/DataStandards/XMLschema/CDS/ns
 * Java type: uk.nhs.nhsia.datastandards.ecds.CDSMessageHeaderStructure
 *
 * Automatically generated - do not modify.
 */
package uk.nhs.nhsia.datastandards.ecds.impl;
/**
 * An XML CDSMessageHeader_Structure(@http://www.nhsia.nhs.uk/DataStandards/XMLschema/CDS/ns).
 *
 * This is a complex type.
 */
public class CDSMessageHeaderStructureImpl extends org.apache.xmlbeans.impl.values.XmlComplexContentImpl implements uk.nhs.nhsia.datastandards.ecds.CDSMessageHeaderStructure
{
    private static final long serialVersionUID = 1L;
    
    public CDSMessageHeaderStructureImpl(org.apache.xmlbeans.SchemaType sType)
    {
        super(sType);
    }
    
    private static final javax.xml.namespace.QName CDSMESSAGETYPE$0 = 
        new javax.xml.namespace.QName("http://www.nhsia.nhs.uk/DataStandards/XMLschema/CDS/ns", "CDSMessageType");
    private static final javax.xml.namespace.QName CDSMESSAGEVERSIONNUMBER$2 = 
        new javax.xml.namespace.QName("http://www.nhsia.nhs.uk/DataStandards/XMLschema/CDS/ns", "CDSMessageVersionNumber");
    private static final javax.xml.namespace.QName CDSMESSAGEREFERENCENUMBER$4 = 
        new javax.xml.namespace.QName("http://www.nhsia.nhs.uk/DataStandards/XMLschema/CDS/ns", "CDSMessageReferenceNumber");
    private static final javax.xml.namespace.QName CDSMESSAGERECORDIDENTIFIER$6 = 
        new javax.xml.namespace.QName("http://www.nhsia.nhs.uk/DataStandards/XMLschema/CDS/ns", "CDSMessageRecordIdentifier");
    
    
    /**
     * Gets the "CDSMessageType" element
     */
    public uk.nhs.nhsia.datastandards.ecds.CDSMessageTypeType.Enum getCDSMessageType()
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.SimpleValue target = null;
            target = (org.apache.xmlbeans.SimpleValue)get_store().find_element_user(CDSMESSAGETYPE$0, 0);
            if (target == null)
            {
                return null;
            }
            return (uk.nhs.nhsia.datastandards.ecds.CDSMessageTypeType.Enum)target.getEnumValue();
        }
    }
    
    /**
     * Gets (as xml) the "CDSMessageType" element
     */
    public uk.nhs.nhsia.datastandards.ecds.CDSMessageTypeType xgetCDSMessageType()
    {
        synchronized (monitor())
        {
            check_orphaned();
            uk.nhs.nhsia.datastandards.ecds.CDSMessageTypeType target = null;
            target = (uk.nhs.nhsia.datastandards.ecds.CDSMessageTypeType)get_store().find_element_user(CDSMESSAGETYPE$0, 0);
            return target;
        }
    }
    
    /**
     * Sets the "CDSMessageType" element
     */
    public void setCDSMessageType(uk.nhs.nhsia.datastandards.ecds.CDSMessageTypeType.Enum cdsMessageType)
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.SimpleValue target = null;
            target = (org.apache.xmlbeans.SimpleValue)get_store().find_element_user(CDSMESSAGETYPE$0, 0);
            if (target == null)
            {
                target = (org.apache.xmlbeans.SimpleValue)get_store().add_element_user(CDSMESSAGETYPE$0);
            }
            target.setEnumValue(cdsMessageType);
        }
    }
    
    /**
     * Sets (as xml) the "CDSMessageType" element
     */
    public void xsetCDSMessageType(uk.nhs.nhsia.datastandards.ecds.CDSMessageTypeType cdsMessageType)
    {
        synchronized (monitor())
        {
            check_orphaned();
            uk.nhs.nhsia.datastandards.ecds.CDSMessageTypeType target = null;
            target = (uk.nhs.nhsia.datastandards.ecds.CDSMessageTypeType)get_store().find_element_user(CDSMESSAGETYPE$0, 0);
            if (target == null)
            {
                target = (uk.nhs.nhsia.datastandards.ecds.CDSMessageTypeType)get_store().add_element_user(CDSMESSAGETYPE$0);
            }
            target.set(cdsMessageType);
        }
    }
    
    /**
     * Gets the "CDSMessageVersionNumber" element
     */
    public uk.nhs.nhsia.datastandards.ecds.CDSMessageVersionNumberType.Enum getCDSMessageVersionNumber()
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.SimpleValue target = null;
            target = (org.apache.xmlbeans.SimpleValue)get_store().find_element_user(CDSMESSAGEVERSIONNUMBER$2, 0);
            if (target == null)
            {
                return null;
            }
            return (uk.nhs.nhsia.datastandards.ecds.CDSMessageVersionNumberType.Enum)target.getEnumValue();
        }
    }
    
    /**
     * Gets (as xml) the "CDSMessageVersionNumber" element
     */
    public uk.nhs.nhsia.datastandards.ecds.CDSMessageVersionNumberType xgetCDSMessageVersionNumber()
    {
        synchronized (monitor())
        {
            check_orphaned();
            uk.nhs.nhsia.datastandards.ecds.CDSMessageVersionNumberType target = null;
            target = (uk.nhs.nhsia.datastandards.ecds.CDSMessageVersionNumberType)get_store().find_element_user(CDSMESSAGEVERSIONNUMBER$2, 0);
            return target;
        }
    }
    
    /**
     * Sets the "CDSMessageVersionNumber" element
     */
    public void setCDSMessageVersionNumber(uk.nhs.nhsia.datastandards.ecds.CDSMessageVersionNumberType.Enum cdsMessageVersionNumber)
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.SimpleValue target = null;
            target = (org.apache.xmlbeans.SimpleValue)get_store().find_element_user(CDSMESSAGEVERSIONNUMBER$2, 0);
            if (target == null)
            {
                target = (org.apache.xmlbeans.SimpleValue)get_store().add_element_user(CDSMESSAGEVERSIONNUMBER$2);
            }
            target.setEnumValue(cdsMessageVersionNumber);
        }
    }
    
    /**
     * Sets (as xml) the "CDSMessageVersionNumber" element
     */
    public void xsetCDSMessageVersionNumber(uk.nhs.nhsia.datastandards.ecds.CDSMessageVersionNumberType cdsMessageVersionNumber)
    {
        synchronized (monitor())
        {
            check_orphaned();
            uk.nhs.nhsia.datastandards.ecds.CDSMessageVersionNumberType target = null;
            target = (uk.nhs.nhsia.datastandards.ecds.CDSMessageVersionNumberType)get_store().find_element_user(CDSMESSAGEVERSIONNUMBER$2, 0);
            if (target == null)
            {
                target = (uk.nhs.nhsia.datastandards.ecds.CDSMessageVersionNumberType)get_store().add_element_user(CDSMESSAGEVERSIONNUMBER$2);
            }
            target.set(cdsMessageVersionNumber);
        }
    }
    
    /**
     * Gets the "CDSMessageReferenceNumber" element
     */
    public long getCDSMessageReferenceNumber()
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.SimpleValue target = null;
            target = (org.apache.xmlbeans.SimpleValue)get_store().find_element_user(CDSMESSAGEREFERENCENUMBER$4, 0);
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
            target = (uk.nhs.nhsia.datastandards.ecds.CDSMessageReferenceNumberType)get_store().find_element_user(CDSMESSAGEREFERENCENUMBER$4, 0);
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
            target = (org.apache.xmlbeans.SimpleValue)get_store().find_element_user(CDSMESSAGEREFERENCENUMBER$4, 0);
            if (target == null)
            {
                target = (org.apache.xmlbeans.SimpleValue)get_store().add_element_user(CDSMESSAGEREFERENCENUMBER$4);
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
            target = (uk.nhs.nhsia.datastandards.ecds.CDSMessageReferenceNumberType)get_store().find_element_user(CDSMESSAGEREFERENCENUMBER$4, 0);
            if (target == null)
            {
                target = (uk.nhs.nhsia.datastandards.ecds.CDSMessageReferenceNumberType)get_store().add_element_user(CDSMESSAGEREFERENCENUMBER$4);
            }
            target.set(cdsMessageReferenceNumber);
        }
    }
    
    /**
     * Gets the "CDSMessageRecordIdentifier" element
     */
    public java.lang.String getCDSMessageRecordIdentifier()
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.SimpleValue target = null;
            target = (org.apache.xmlbeans.SimpleValue)get_store().find_element_user(CDSMESSAGERECORDIDENTIFIER$6, 0);
            if (target == null)
            {
                return null;
            }
            return target.getStringValue();
        }
    }
    
    /**
     * Gets (as xml) the "CDSMessageRecordIdentifier" element
     */
    public uk.nhs.nhsia.datastandards.ecds.CDSMessageRecordIdentifierType xgetCDSMessageRecordIdentifier()
    {
        synchronized (monitor())
        {
            check_orphaned();
            uk.nhs.nhsia.datastandards.ecds.CDSMessageRecordIdentifierType target = null;
            target = (uk.nhs.nhsia.datastandards.ecds.CDSMessageRecordIdentifierType)get_store().find_element_user(CDSMESSAGERECORDIDENTIFIER$6, 0);
            return target;
        }
    }
    
    /**
     * True if has "CDSMessageRecordIdentifier" element
     */
    public boolean isSetCDSMessageRecordIdentifier()
    {
        synchronized (monitor())
        {
            check_orphaned();
            return get_store().count_elements(CDSMESSAGERECORDIDENTIFIER$6) != 0;
        }
    }
    
    /**
     * Sets the "CDSMessageRecordIdentifier" element
     */
    public void setCDSMessageRecordIdentifier(java.lang.String cdsMessageRecordIdentifier)
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.SimpleValue target = null;
            target = (org.apache.xmlbeans.SimpleValue)get_store().find_element_user(CDSMESSAGERECORDIDENTIFIER$6, 0);
            if (target == null)
            {
                target = (org.apache.xmlbeans.SimpleValue)get_store().add_element_user(CDSMESSAGERECORDIDENTIFIER$6);
            }
            target.setStringValue(cdsMessageRecordIdentifier);
        }
    }
    
    /**
     * Sets (as xml) the "CDSMessageRecordIdentifier" element
     */
    public void xsetCDSMessageRecordIdentifier(uk.nhs.nhsia.datastandards.ecds.CDSMessageRecordIdentifierType cdsMessageRecordIdentifier)
    {
        synchronized (monitor())
        {
            check_orphaned();
            uk.nhs.nhsia.datastandards.ecds.CDSMessageRecordIdentifierType target = null;
            target = (uk.nhs.nhsia.datastandards.ecds.CDSMessageRecordIdentifierType)get_store().find_element_user(CDSMESSAGERECORDIDENTIFIER$6, 0);
            if (target == null)
            {
                target = (uk.nhs.nhsia.datastandards.ecds.CDSMessageRecordIdentifierType)get_store().add_element_user(CDSMESSAGERECORDIDENTIFIER$6);
            }
            target.set(cdsMessageRecordIdentifier);
        }
    }
    
    /**
     * Unsets the "CDSMessageRecordIdentifier" element
     */
    public void unsetCDSMessageRecordIdentifier()
    {
        synchronized (monitor())
        {
            check_orphaned();
            get_store().remove_element(CDSMESSAGERECORDIDENTIFIER$6, 0);
        }
    }
}
