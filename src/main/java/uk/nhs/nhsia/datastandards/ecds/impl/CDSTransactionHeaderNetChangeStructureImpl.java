/*
 * XML Type:  CDSTransactionHeader_NetChange_Structure
 * Namespace: http://www.nhsia.nhs.uk/DataStandards/XMLschema/CDS/ns
 * Java type: uk.nhs.nhsia.datastandards.ecds.CDSTransactionHeaderNetChangeStructure
 *
 * Automatically generated - do not modify.
 */
package uk.nhs.nhsia.datastandards.ecds.impl;
/**
 * An XML CDSTransactionHeader_NetChange_Structure(@http://www.nhsia.nhs.uk/DataStandards/XMLschema/CDS/ns).
 *
 * This is a complex type.
 */
public class CDSTransactionHeaderNetChangeStructureImpl extends org.apache.xmlbeans.impl.values.XmlComplexContentImpl implements uk.nhs.nhsia.datastandards.ecds.CDSTransactionHeaderNetChangeStructure
{
    private static final long serialVersionUID = 1L;
    
    public CDSTransactionHeaderNetChangeStructureImpl(org.apache.xmlbeans.SchemaType sType)
    {
        super(sType);
    }
    
    private static final javax.xml.namespace.QName CDSTYPECODE$0 = 
        new javax.xml.namespace.QName("http://www.nhsia.nhs.uk/DataStandards/XMLschema/CDS/ns", "CDSTypeCode");
    private static final javax.xml.namespace.QName CDSPROTOCOLIDENTIFIERCODE$2 = 
        new javax.xml.namespace.QName("http://www.nhsia.nhs.uk/DataStandards/XMLschema/CDS/ns", "CDSProtocolIdentifierCode");
    private static final javax.xml.namespace.QName CDSUNIQUEIDENTIFIER$4 = 
        new javax.xml.namespace.QName("http://www.nhsia.nhs.uk/DataStandards/XMLschema/CDS/ns", "CDSUniqueIdentifier");
    private static final javax.xml.namespace.QName CDSUPDATETYPE$6 = 
        new javax.xml.namespace.QName("http://www.nhsia.nhs.uk/DataStandards/XMLschema/CDS/ns", "CDSUpdateType");
    private static final javax.xml.namespace.QName CDSAPPLICABLEDATE$8 = 
        new javax.xml.namespace.QName("http://www.nhsia.nhs.uk/DataStandards/XMLschema/CDS/ns", "CDSApplicableDate");
    private static final javax.xml.namespace.QName CDSAPPLICABLETIME$10 = 
        new javax.xml.namespace.QName("http://www.nhsia.nhs.uk/DataStandards/XMLschema/CDS/ns", "CDSApplicableTime");
    private static final javax.xml.namespace.QName CDSACTIVITYDATE$12 = 
        new javax.xml.namespace.QName("http://www.nhsia.nhs.uk/DataStandards/XMLschema/CDS/ns", "CDSActivityDate");
    private static final javax.xml.namespace.QName ORGANISATIONCODECDSSENDERIDENTITY$14 = 
        new javax.xml.namespace.QName("http://www.nhsia.nhs.uk/DataStandards/XMLschema/CDS/ns", "OrganisationCode_CDSSenderIdentity");
    private static final javax.xml.namespace.QName ORGANISATIONCODECDSPRIMERECIPIENTIDENTITY$16 = 
        new javax.xml.namespace.QName("http://www.nhsia.nhs.uk/DataStandards/XMLschema/CDS/ns", "OrganisationCode_CDSPrimeRecipientIdentity");
    private static final javax.xml.namespace.QName ORGANISATIONCODECDSCOPYRECIPIENTIDENTITY$18 = 
        new javax.xml.namespace.QName("http://www.nhsia.nhs.uk/DataStandards/XMLschema/CDS/ns", "OrganisationCode_CDSCopyRecipientIdentity");
    
    
    /**
     * Gets the "CDSTypeCode" element
     */
    public uk.nhs.nhsia.datastandards.ecds.CDSTypeCodeType.Enum getCDSTypeCode()
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.SimpleValue target = null;
            target = (org.apache.xmlbeans.SimpleValue)get_store().find_element_user(CDSTYPECODE$0, 0);
            if (target == null)
            {
                return null;
            }
            return (uk.nhs.nhsia.datastandards.ecds.CDSTypeCodeType.Enum)target.getEnumValue();
        }
    }
    
    /**
     * Gets (as xml) the "CDSTypeCode" element
     */
    public uk.nhs.nhsia.datastandards.ecds.CDSTypeCodeType xgetCDSTypeCode()
    {
        synchronized (monitor())
        {
            check_orphaned();
            uk.nhs.nhsia.datastandards.ecds.CDSTypeCodeType target = null;
            target = (uk.nhs.nhsia.datastandards.ecds.CDSTypeCodeType)get_store().find_element_user(CDSTYPECODE$0, 0);
            return target;
        }
    }
    
    /**
     * Sets the "CDSTypeCode" element
     */
    public void setCDSTypeCode(uk.nhs.nhsia.datastandards.ecds.CDSTypeCodeType.Enum cdsTypeCode)
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.SimpleValue target = null;
            target = (org.apache.xmlbeans.SimpleValue)get_store().find_element_user(CDSTYPECODE$0, 0);
            if (target == null)
            {
                target = (org.apache.xmlbeans.SimpleValue)get_store().add_element_user(CDSTYPECODE$0);
            }
            target.setEnumValue(cdsTypeCode);
        }
    }
    
    /**
     * Sets (as xml) the "CDSTypeCode" element
     */
    public void xsetCDSTypeCode(uk.nhs.nhsia.datastandards.ecds.CDSTypeCodeType cdsTypeCode)
    {
        synchronized (monitor())
        {
            check_orphaned();
            uk.nhs.nhsia.datastandards.ecds.CDSTypeCodeType target = null;
            target = (uk.nhs.nhsia.datastandards.ecds.CDSTypeCodeType)get_store().find_element_user(CDSTYPECODE$0, 0);
            if (target == null)
            {
                target = (uk.nhs.nhsia.datastandards.ecds.CDSTypeCodeType)get_store().add_element_user(CDSTYPECODE$0);
            }
            target.set(cdsTypeCode);
        }
    }
    
    /**
     * Gets the "CDSProtocolIdentifierCode" element
     */
    public uk.nhs.nhsia.datastandards.ecds.CDSProtocolIdentifierCodeType.Enum getCDSProtocolIdentifierCode()
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.SimpleValue target = null;
            target = (org.apache.xmlbeans.SimpleValue)get_store().find_element_user(CDSPROTOCOLIDENTIFIERCODE$2, 0);
            if (target == null)
            {
                return null;
            }
            return (uk.nhs.nhsia.datastandards.ecds.CDSProtocolIdentifierCodeType.Enum)target.getEnumValue();
        }
    }
    
    /**
     * Gets (as xml) the "CDSProtocolIdentifierCode" element
     */
    public uk.nhs.nhsia.datastandards.ecds.CDSProtocolIdentifierCodeType xgetCDSProtocolIdentifierCode()
    {
        synchronized (monitor())
        {
            check_orphaned();
            uk.nhs.nhsia.datastandards.ecds.CDSProtocolIdentifierCodeType target = null;
            target = (uk.nhs.nhsia.datastandards.ecds.CDSProtocolIdentifierCodeType)get_store().find_element_user(CDSPROTOCOLIDENTIFIERCODE$2, 0);
            return target;
        }
    }
    
    /**
     * Sets the "CDSProtocolIdentifierCode" element
     */
    public void setCDSProtocolIdentifierCode(uk.nhs.nhsia.datastandards.ecds.CDSProtocolIdentifierCodeType.Enum cdsProtocolIdentifierCode)
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.SimpleValue target = null;
            target = (org.apache.xmlbeans.SimpleValue)get_store().find_element_user(CDSPROTOCOLIDENTIFIERCODE$2, 0);
            if (target == null)
            {
                target = (org.apache.xmlbeans.SimpleValue)get_store().add_element_user(CDSPROTOCOLIDENTIFIERCODE$2);
            }
            target.setEnumValue(cdsProtocolIdentifierCode);
        }
    }
    
    /**
     * Sets (as xml) the "CDSProtocolIdentifierCode" element
     */
    public void xsetCDSProtocolIdentifierCode(uk.nhs.nhsia.datastandards.ecds.CDSProtocolIdentifierCodeType cdsProtocolIdentifierCode)
    {
        synchronized (monitor())
        {
            check_orphaned();
            uk.nhs.nhsia.datastandards.ecds.CDSProtocolIdentifierCodeType target = null;
            target = (uk.nhs.nhsia.datastandards.ecds.CDSProtocolIdentifierCodeType)get_store().find_element_user(CDSPROTOCOLIDENTIFIERCODE$2, 0);
            if (target == null)
            {
                target = (uk.nhs.nhsia.datastandards.ecds.CDSProtocolIdentifierCodeType)get_store().add_element_user(CDSPROTOCOLIDENTIFIERCODE$2);
            }
            target.set(cdsProtocolIdentifierCode);
        }
    }
    
    /**
     * Gets the "CDSUniqueIdentifier" element
     */
    public java.lang.String getCDSUniqueIdentifier()
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.SimpleValue target = null;
            target = (org.apache.xmlbeans.SimpleValue)get_store().find_element_user(CDSUNIQUEIDENTIFIER$4, 0);
            if (target == null)
            {
                return null;
            }
            return target.getStringValue();
        }
    }
    
    /**
     * Gets (as xml) the "CDSUniqueIdentifier" element
     */
    public uk.nhs.nhsia.datastandards.ecds.CDSUniqueIdentifierType xgetCDSUniqueIdentifier()
    {
        synchronized (monitor())
        {
            check_orphaned();
            uk.nhs.nhsia.datastandards.ecds.CDSUniqueIdentifierType target = null;
            target = (uk.nhs.nhsia.datastandards.ecds.CDSUniqueIdentifierType)get_store().find_element_user(CDSUNIQUEIDENTIFIER$4, 0);
            return target;
        }
    }
    
    /**
     * Sets the "CDSUniqueIdentifier" element
     */
    public void setCDSUniqueIdentifier(java.lang.String cdsUniqueIdentifier)
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.SimpleValue target = null;
            target = (org.apache.xmlbeans.SimpleValue)get_store().find_element_user(CDSUNIQUEIDENTIFIER$4, 0);
            if (target == null)
            {
                target = (org.apache.xmlbeans.SimpleValue)get_store().add_element_user(CDSUNIQUEIDENTIFIER$4);
            }
            target.setStringValue(cdsUniqueIdentifier);
        }
    }
    
    /**
     * Sets (as xml) the "CDSUniqueIdentifier" element
     */
    public void xsetCDSUniqueIdentifier(uk.nhs.nhsia.datastandards.ecds.CDSUniqueIdentifierType cdsUniqueIdentifier)
    {
        synchronized (monitor())
        {
            check_orphaned();
            uk.nhs.nhsia.datastandards.ecds.CDSUniqueIdentifierType target = null;
            target = (uk.nhs.nhsia.datastandards.ecds.CDSUniqueIdentifierType)get_store().find_element_user(CDSUNIQUEIDENTIFIER$4, 0);
            if (target == null)
            {
                target = (uk.nhs.nhsia.datastandards.ecds.CDSUniqueIdentifierType)get_store().add_element_user(CDSUNIQUEIDENTIFIER$4);
            }
            target.set(cdsUniqueIdentifier);
        }
    }
    
    /**
     * Gets the "CDSUpdateType" element
     */
    public uk.nhs.nhsia.datastandards.ecds.CDSUpdateTypeType.Enum getCDSUpdateType()
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.SimpleValue target = null;
            target = (org.apache.xmlbeans.SimpleValue)get_store().find_element_user(CDSUPDATETYPE$6, 0);
            if (target == null)
            {
                return null;
            }
            return (uk.nhs.nhsia.datastandards.ecds.CDSUpdateTypeType.Enum)target.getEnumValue();
        }
    }
    
    /**
     * Gets (as xml) the "CDSUpdateType" element
     */
    public uk.nhs.nhsia.datastandards.ecds.CDSUpdateTypeType xgetCDSUpdateType()
    {
        synchronized (monitor())
        {
            check_orphaned();
            uk.nhs.nhsia.datastandards.ecds.CDSUpdateTypeType target = null;
            target = (uk.nhs.nhsia.datastandards.ecds.CDSUpdateTypeType)get_store().find_element_user(CDSUPDATETYPE$6, 0);
            return target;
        }
    }
    
    /**
     * Sets the "CDSUpdateType" element
     */
    public void setCDSUpdateType(uk.nhs.nhsia.datastandards.ecds.CDSUpdateTypeType.Enum cdsUpdateType)
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.SimpleValue target = null;
            target = (org.apache.xmlbeans.SimpleValue)get_store().find_element_user(CDSUPDATETYPE$6, 0);
            if (target == null)
            {
                target = (org.apache.xmlbeans.SimpleValue)get_store().add_element_user(CDSUPDATETYPE$6);
            }
            target.setEnumValue(cdsUpdateType);
        }
    }
    
    /**
     * Sets (as xml) the "CDSUpdateType" element
     */
    public void xsetCDSUpdateType(uk.nhs.nhsia.datastandards.ecds.CDSUpdateTypeType cdsUpdateType)
    {
        synchronized (monitor())
        {
            check_orphaned();
            uk.nhs.nhsia.datastandards.ecds.CDSUpdateTypeType target = null;
            target = (uk.nhs.nhsia.datastandards.ecds.CDSUpdateTypeType)get_store().find_element_user(CDSUPDATETYPE$6, 0);
            if (target == null)
            {
                target = (uk.nhs.nhsia.datastandards.ecds.CDSUpdateTypeType)get_store().add_element_user(CDSUPDATETYPE$6);
            }
            target.set(cdsUpdateType);
        }
    }
    
    /**
     * Gets the "CDSApplicableDate" element
     */
    public java.util.Calendar getCDSApplicableDate()
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.SimpleValue target = null;
            target = (org.apache.xmlbeans.SimpleValue)get_store().find_element_user(CDSAPPLICABLEDATE$8, 0);
            if (target == null)
            {
                return null;
            }
            return target.getCalendarValue();
        }
    }
    
    /**
     * Gets (as xml) the "CDSApplicableDate" element
     */
    public uk.nhs.nhsia.datastandards.ecds.CDSApplicableDateType xgetCDSApplicableDate()
    {
        synchronized (monitor())
        {
            check_orphaned();
            uk.nhs.nhsia.datastandards.ecds.CDSApplicableDateType target = null;
            target = (uk.nhs.nhsia.datastandards.ecds.CDSApplicableDateType)get_store().find_element_user(CDSAPPLICABLEDATE$8, 0);
            return target;
        }
    }
    
    /**
     * Sets the "CDSApplicableDate" element
     */
    public void setCDSApplicableDate(java.util.Calendar cdsApplicableDate)
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.SimpleValue target = null;
            target = (org.apache.xmlbeans.SimpleValue)get_store().find_element_user(CDSAPPLICABLEDATE$8, 0);
            if (target == null)
            {
                target = (org.apache.xmlbeans.SimpleValue)get_store().add_element_user(CDSAPPLICABLEDATE$8);
            }
            target.setCalendarValue(cdsApplicableDate);
        }
    }
    
    /**
     * Sets (as xml) the "CDSApplicableDate" element
     */
    public void xsetCDSApplicableDate(uk.nhs.nhsia.datastandards.ecds.CDSApplicableDateType cdsApplicableDate)
    {
        synchronized (monitor())
        {
            check_orphaned();
            uk.nhs.nhsia.datastandards.ecds.CDSApplicableDateType target = null;
            target = (uk.nhs.nhsia.datastandards.ecds.CDSApplicableDateType)get_store().find_element_user(CDSAPPLICABLEDATE$8, 0);
            if (target == null)
            {
                target = (uk.nhs.nhsia.datastandards.ecds.CDSApplicableDateType)get_store().add_element_user(CDSAPPLICABLEDATE$8);
            }
            target.set(cdsApplicableDate);
        }
    }
    
    /**
     * Gets the "CDSApplicableTime" element
     */
    public java.util.Calendar getCDSApplicableTime()
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.SimpleValue target = null;
            target = (org.apache.xmlbeans.SimpleValue)get_store().find_element_user(CDSAPPLICABLETIME$10, 0);
            if (target == null)
            {
                return null;
            }
            return target.getCalendarValue();
        }
    }
    
    /**
     * Gets (as xml) the "CDSApplicableTime" element
     */
    public uk.nhs.nhsia.datastandards.ecds.CDSApplicableTimeType xgetCDSApplicableTime()
    {
        synchronized (monitor())
        {
            check_orphaned();
            uk.nhs.nhsia.datastandards.ecds.CDSApplicableTimeType target = null;
            target = (uk.nhs.nhsia.datastandards.ecds.CDSApplicableTimeType)get_store().find_element_user(CDSAPPLICABLETIME$10, 0);
            return target;
        }
    }
    
    /**
     * Sets the "CDSApplicableTime" element
     */
    public void setCDSApplicableTime(java.util.Calendar cdsApplicableTime)
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.SimpleValue target = null;
            target = (org.apache.xmlbeans.SimpleValue)get_store().find_element_user(CDSAPPLICABLETIME$10, 0);
            if (target == null)
            {
                target = (org.apache.xmlbeans.SimpleValue)get_store().add_element_user(CDSAPPLICABLETIME$10);
            }
            target.setCalendarValue(cdsApplicableTime);
        }
    }
    
    /**
     * Sets (as xml) the "CDSApplicableTime" element
     */
    public void xsetCDSApplicableTime(uk.nhs.nhsia.datastandards.ecds.CDSApplicableTimeType cdsApplicableTime)
    {
        synchronized (monitor())
        {
            check_orphaned();
            uk.nhs.nhsia.datastandards.ecds.CDSApplicableTimeType target = null;
            target = (uk.nhs.nhsia.datastandards.ecds.CDSApplicableTimeType)get_store().find_element_user(CDSAPPLICABLETIME$10, 0);
            if (target == null)
            {
                target = (uk.nhs.nhsia.datastandards.ecds.CDSApplicableTimeType)get_store().add_element_user(CDSAPPLICABLETIME$10);
            }
            target.set(cdsApplicableTime);
        }
    }
    
    /**
     * Gets the "CDSActivityDate" element
     */
    public java.util.Calendar getCDSActivityDate()
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.SimpleValue target = null;
            target = (org.apache.xmlbeans.SimpleValue)get_store().find_element_user(CDSACTIVITYDATE$12, 0);
            if (target == null)
            {
                return null;
            }
            return target.getCalendarValue();
        }
    }
    
    /**
     * Gets (as xml) the "CDSActivityDate" element
     */
    public uk.nhs.nhsia.datastandards.ecds.CDSActivityDateType xgetCDSActivityDate()
    {
        synchronized (monitor())
        {
            check_orphaned();
            uk.nhs.nhsia.datastandards.ecds.CDSActivityDateType target = null;
            target = (uk.nhs.nhsia.datastandards.ecds.CDSActivityDateType)get_store().find_element_user(CDSACTIVITYDATE$12, 0);
            return target;
        }
    }
    
    /**
     * Sets the "CDSActivityDate" element
     */
    public void setCDSActivityDate(java.util.Calendar cdsActivityDate)
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.SimpleValue target = null;
            target = (org.apache.xmlbeans.SimpleValue)get_store().find_element_user(CDSACTIVITYDATE$12, 0);
            if (target == null)
            {
                target = (org.apache.xmlbeans.SimpleValue)get_store().add_element_user(CDSACTIVITYDATE$12);
            }
            target.setCalendarValue(cdsActivityDate);
        }
    }
    
    /**
     * Sets (as xml) the "CDSActivityDate" element
     */
    public void xsetCDSActivityDate(uk.nhs.nhsia.datastandards.ecds.CDSActivityDateType cdsActivityDate)
    {
        synchronized (monitor())
        {
            check_orphaned();
            uk.nhs.nhsia.datastandards.ecds.CDSActivityDateType target = null;
            target = (uk.nhs.nhsia.datastandards.ecds.CDSActivityDateType)get_store().find_element_user(CDSACTIVITYDATE$12, 0);
            if (target == null)
            {
                target = (uk.nhs.nhsia.datastandards.ecds.CDSActivityDateType)get_store().add_element_user(CDSACTIVITYDATE$12);
            }
            target.set(cdsActivityDate);
        }
    }
    
    /**
     * Gets the "OrganisationCode_CDSSenderIdentity" element
     */
    public java.lang.String getOrganisationCodeCDSSenderIdentity()
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.SimpleValue target = null;
            target = (org.apache.xmlbeans.SimpleValue)get_store().find_element_user(ORGANISATIONCODECDSSENDERIDENTITY$14, 0);
            if (target == null)
            {
                return null;
            }
            return target.getStringValue();
        }
    }
    
    /**
     * Gets (as xml) the "OrganisationCode_CDSSenderIdentity" element
     */
    public uk.nhs.nhsia.datastandards.ecds.CDSSenderCodeType xgetOrganisationCodeCDSSenderIdentity()
    {
        synchronized (monitor())
        {
            check_orphaned();
            uk.nhs.nhsia.datastandards.ecds.CDSSenderCodeType target = null;
            target = (uk.nhs.nhsia.datastandards.ecds.CDSSenderCodeType)get_store().find_element_user(ORGANISATIONCODECDSSENDERIDENTITY$14, 0);
            return target;
        }
    }
    
    /**
     * Sets the "OrganisationCode_CDSSenderIdentity" element
     */
    public void setOrganisationCodeCDSSenderIdentity(java.lang.String organisationCodeCDSSenderIdentity)
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.SimpleValue target = null;
            target = (org.apache.xmlbeans.SimpleValue)get_store().find_element_user(ORGANISATIONCODECDSSENDERIDENTITY$14, 0);
            if (target == null)
            {
                target = (org.apache.xmlbeans.SimpleValue)get_store().add_element_user(ORGANISATIONCODECDSSENDERIDENTITY$14);
            }
            target.setStringValue(organisationCodeCDSSenderIdentity);
        }
    }
    
    /**
     * Sets (as xml) the "OrganisationCode_CDSSenderIdentity" element
     */
    public void xsetOrganisationCodeCDSSenderIdentity(uk.nhs.nhsia.datastandards.ecds.CDSSenderCodeType organisationCodeCDSSenderIdentity)
    {
        synchronized (monitor())
        {
            check_orphaned();
            uk.nhs.nhsia.datastandards.ecds.CDSSenderCodeType target = null;
            target = (uk.nhs.nhsia.datastandards.ecds.CDSSenderCodeType)get_store().find_element_user(ORGANISATIONCODECDSSENDERIDENTITY$14, 0);
            if (target == null)
            {
                target = (uk.nhs.nhsia.datastandards.ecds.CDSSenderCodeType)get_store().add_element_user(ORGANISATIONCODECDSSENDERIDENTITY$14);
            }
            target.set(organisationCodeCDSSenderIdentity);
        }
    }
    
    /**
     * Gets the "OrganisationCode_CDSPrimeRecipientIdentity" element
     */
    public java.lang.String getOrganisationCodeCDSPrimeRecipientIdentity()
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.SimpleValue target = null;
            target = (org.apache.xmlbeans.SimpleValue)get_store().find_element_user(ORGANISATIONCODECDSPRIMERECIPIENTIDENTITY$16, 0);
            if (target == null)
            {
                return null;
            }
            return target.getStringValue();
        }
    }
    
    /**
     * Gets (as xml) the "OrganisationCode_CDSPrimeRecipientIdentity" element
     */
    public uk.nhs.nhsia.datastandards.ecds.CDSPrimeRecipientCodeType xgetOrganisationCodeCDSPrimeRecipientIdentity()
    {
        synchronized (monitor())
        {
            check_orphaned();
            uk.nhs.nhsia.datastandards.ecds.CDSPrimeRecipientCodeType target = null;
            target = (uk.nhs.nhsia.datastandards.ecds.CDSPrimeRecipientCodeType)get_store().find_element_user(ORGANISATIONCODECDSPRIMERECIPIENTIDENTITY$16, 0);
            return target;
        }
    }
    
    /**
     * Sets the "OrganisationCode_CDSPrimeRecipientIdentity" element
     */
    public void setOrganisationCodeCDSPrimeRecipientIdentity(java.lang.String organisationCodeCDSPrimeRecipientIdentity)
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.SimpleValue target = null;
            target = (org.apache.xmlbeans.SimpleValue)get_store().find_element_user(ORGANISATIONCODECDSPRIMERECIPIENTIDENTITY$16, 0);
            if (target == null)
            {
                target = (org.apache.xmlbeans.SimpleValue)get_store().add_element_user(ORGANISATIONCODECDSPRIMERECIPIENTIDENTITY$16);
            }
            target.setStringValue(organisationCodeCDSPrimeRecipientIdentity);
        }
    }
    
    /**
     * Sets (as xml) the "OrganisationCode_CDSPrimeRecipientIdentity" element
     */
    public void xsetOrganisationCodeCDSPrimeRecipientIdentity(uk.nhs.nhsia.datastandards.ecds.CDSPrimeRecipientCodeType organisationCodeCDSPrimeRecipientIdentity)
    {
        synchronized (monitor())
        {
            check_orphaned();
            uk.nhs.nhsia.datastandards.ecds.CDSPrimeRecipientCodeType target = null;
            target = (uk.nhs.nhsia.datastandards.ecds.CDSPrimeRecipientCodeType)get_store().find_element_user(ORGANISATIONCODECDSPRIMERECIPIENTIDENTITY$16, 0);
            if (target == null)
            {
                target = (uk.nhs.nhsia.datastandards.ecds.CDSPrimeRecipientCodeType)get_store().add_element_user(ORGANISATIONCODECDSPRIMERECIPIENTIDENTITY$16);
            }
            target.set(organisationCodeCDSPrimeRecipientIdentity);
        }
    }
    
    /**
     * Gets array of all "OrganisationCode_CDSCopyRecipientIdentity" elements
     */
    public java.lang.String[] getOrganisationCodeCDSCopyRecipientIdentityArray()
    {
        synchronized (monitor())
        {
            check_orphaned();
            java.util.List targetList = new java.util.ArrayList();
            get_store().find_all_element_users(ORGANISATIONCODECDSCOPYRECIPIENTIDENTITY$18, targetList);
            java.lang.String[] result = new java.lang.String[targetList.size()];
            for (int i = 0, len = targetList.size() ; i < len ; i++)
                result[i] = ((org.apache.xmlbeans.SimpleValue)targetList.get(i)).getStringValue();
            return result;
        }
    }
    
    /**
     * Gets ith "OrganisationCode_CDSCopyRecipientIdentity" element
     */
    public java.lang.String getOrganisationCodeCDSCopyRecipientIdentityArray(int i)
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.SimpleValue target = null;
            target = (org.apache.xmlbeans.SimpleValue)get_store().find_element_user(ORGANISATIONCODECDSCOPYRECIPIENTIDENTITY$18, i);
            if (target == null)
            {
                throw new IndexOutOfBoundsException();
            }
            return target.getStringValue();
        }
    }
    
    /**
     * Gets (as xml) array of all "OrganisationCode_CDSCopyRecipientIdentity" elements
     */
    public uk.nhs.nhsia.datastandards.ecds.CDSCopyRecipientCodeType[] xgetOrganisationCodeCDSCopyRecipientIdentityArray()
    {
        synchronized (monitor())
        {
            check_orphaned();
            java.util.List targetList = new java.util.ArrayList();
            get_store().find_all_element_users(ORGANISATIONCODECDSCOPYRECIPIENTIDENTITY$18, targetList);
            uk.nhs.nhsia.datastandards.ecds.CDSCopyRecipientCodeType[] result = new uk.nhs.nhsia.datastandards.ecds.CDSCopyRecipientCodeType[targetList.size()];
            targetList.toArray(result);
            return result;
        }
    }
    
    /**
     * Gets (as xml) ith "OrganisationCode_CDSCopyRecipientIdentity" element
     */
    public uk.nhs.nhsia.datastandards.ecds.CDSCopyRecipientCodeType xgetOrganisationCodeCDSCopyRecipientIdentityArray(int i)
    {
        synchronized (monitor())
        {
            check_orphaned();
            uk.nhs.nhsia.datastandards.ecds.CDSCopyRecipientCodeType target = null;
            target = (uk.nhs.nhsia.datastandards.ecds.CDSCopyRecipientCodeType)get_store().find_element_user(ORGANISATIONCODECDSCOPYRECIPIENTIDENTITY$18, i);
            if (target == null)
            {
                throw new IndexOutOfBoundsException();
            }
            return target;
        }
    }
    
    /**
     * Returns number of "OrganisationCode_CDSCopyRecipientIdentity" element
     */
    public int sizeOfOrganisationCodeCDSCopyRecipientIdentityArray()
    {
        synchronized (monitor())
        {
            check_orphaned();
            return get_store().count_elements(ORGANISATIONCODECDSCOPYRECIPIENTIDENTITY$18);
        }
    }
    
    /**
     * Sets array of all "OrganisationCode_CDSCopyRecipientIdentity" element
     */
    public void setOrganisationCodeCDSCopyRecipientIdentityArray(java.lang.String[] organisationCodeCDSCopyRecipientIdentityArray)
    {
        synchronized (monitor())
        {
            check_orphaned();
            arraySetterHelper(organisationCodeCDSCopyRecipientIdentityArray, ORGANISATIONCODECDSCOPYRECIPIENTIDENTITY$18);
        }
    }
    
    /**
     * Sets ith "OrganisationCode_CDSCopyRecipientIdentity" element
     */
    public void setOrganisationCodeCDSCopyRecipientIdentityArray(int i, java.lang.String organisationCodeCDSCopyRecipientIdentity)
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.SimpleValue target = null;
            target = (org.apache.xmlbeans.SimpleValue)get_store().find_element_user(ORGANISATIONCODECDSCOPYRECIPIENTIDENTITY$18, i);
            if (target == null)
            {
                throw new IndexOutOfBoundsException();
            }
            target.setStringValue(organisationCodeCDSCopyRecipientIdentity);
        }
    }
    
    /**
     * Sets (as xml) array of all "OrganisationCode_CDSCopyRecipientIdentity" element
     */
    public void xsetOrganisationCodeCDSCopyRecipientIdentityArray(uk.nhs.nhsia.datastandards.ecds.CDSCopyRecipientCodeType[]organisationCodeCDSCopyRecipientIdentityArray)
    {
        synchronized (monitor())
        {
            check_orphaned();
            arraySetterHelper(organisationCodeCDSCopyRecipientIdentityArray, ORGANISATIONCODECDSCOPYRECIPIENTIDENTITY$18);
        }
    }
    
    /**
     * Sets (as xml) ith "OrganisationCode_CDSCopyRecipientIdentity" element
     */
    public void xsetOrganisationCodeCDSCopyRecipientIdentityArray(int i, uk.nhs.nhsia.datastandards.ecds.CDSCopyRecipientCodeType organisationCodeCDSCopyRecipientIdentity)
    {
        synchronized (monitor())
        {
            check_orphaned();
            uk.nhs.nhsia.datastandards.ecds.CDSCopyRecipientCodeType target = null;
            target = (uk.nhs.nhsia.datastandards.ecds.CDSCopyRecipientCodeType)get_store().find_element_user(ORGANISATIONCODECDSCOPYRECIPIENTIDENTITY$18, i);
            if (target == null)
            {
                throw new IndexOutOfBoundsException();
            }
            target.set(organisationCodeCDSCopyRecipientIdentity);
        }
    }
    
    /**
     * Inserts the value as the ith "OrganisationCode_CDSCopyRecipientIdentity" element
     */
    public void insertOrganisationCodeCDSCopyRecipientIdentity(int i, java.lang.String organisationCodeCDSCopyRecipientIdentity)
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.SimpleValue target = 
                (org.apache.xmlbeans.SimpleValue)get_store().insert_element_user(ORGANISATIONCODECDSCOPYRECIPIENTIDENTITY$18, i);
            target.setStringValue(organisationCodeCDSCopyRecipientIdentity);
        }
    }
    
    /**
     * Appends the value as the last "OrganisationCode_CDSCopyRecipientIdentity" element
     */
    public void addOrganisationCodeCDSCopyRecipientIdentity(java.lang.String organisationCodeCDSCopyRecipientIdentity)
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.SimpleValue target = null;
            target = (org.apache.xmlbeans.SimpleValue)get_store().add_element_user(ORGANISATIONCODECDSCOPYRECIPIENTIDENTITY$18);
            target.setStringValue(organisationCodeCDSCopyRecipientIdentity);
        }
    }
    
    /**
     * Inserts and returns a new empty value (as xml) as the ith "OrganisationCode_CDSCopyRecipientIdentity" element
     */
    public uk.nhs.nhsia.datastandards.ecds.CDSCopyRecipientCodeType insertNewOrganisationCodeCDSCopyRecipientIdentity(int i)
    {
        synchronized (monitor())
        {
            check_orphaned();
            uk.nhs.nhsia.datastandards.ecds.CDSCopyRecipientCodeType target = null;
            target = (uk.nhs.nhsia.datastandards.ecds.CDSCopyRecipientCodeType)get_store().insert_element_user(ORGANISATIONCODECDSCOPYRECIPIENTIDENTITY$18, i);
            return target;
        }
    }
    
    /**
     * Appends and returns a new empty value (as xml) as the last "OrganisationCode_CDSCopyRecipientIdentity" element
     */
    public uk.nhs.nhsia.datastandards.ecds.CDSCopyRecipientCodeType addNewOrganisationCodeCDSCopyRecipientIdentity()
    {
        synchronized (monitor())
        {
            check_orphaned();
            uk.nhs.nhsia.datastandards.ecds.CDSCopyRecipientCodeType target = null;
            target = (uk.nhs.nhsia.datastandards.ecds.CDSCopyRecipientCodeType)get_store().add_element_user(ORGANISATIONCODECDSCOPYRECIPIENTIDENTITY$18);
            return target;
        }
    }
    
    /**
     * Removes the ith "OrganisationCode_CDSCopyRecipientIdentity" element
     */
    public void removeOrganisationCodeCDSCopyRecipientIdentity(int i)
    {
        synchronized (monitor())
        {
            check_orphaned();
            get_store().remove_element(ORGANISATIONCODECDSCOPYRECIPIENTIDENTITY$18, i);
        }
    }
}
