/*
 * XML Type:  CDSTransactionHeader_BulkUpdate_Structure
 * Namespace: http://www.nhsia.nhs.uk/DataStandards/XMLschema/CDS/ns
 * Java type: uk.nhs.nhsia.datastandards.ecds.CDSTransactionHeaderBulkUpdateStructure
 *
 * Automatically generated - do not modify.
 */
package uk.nhs.nhsia.datastandards.ecds.impl;
/**
 * An XML CDSTransactionHeader_BulkUpdate_Structure(@http://www.nhsia.nhs.uk/DataStandards/XMLschema/CDS/ns).
 *
 * This is a complex type.
 */
public class CDSTransactionHeaderBulkUpdateStructureImpl extends org.apache.xmlbeans.impl.values.XmlComplexContentImpl implements uk.nhs.nhsia.datastandards.ecds.CDSTransactionHeaderBulkUpdateStructure
{
    private static final long serialVersionUID = 1L;
    
    public CDSTransactionHeaderBulkUpdateStructureImpl(org.apache.xmlbeans.SchemaType sType)
    {
        super(sType);
    }
    
    private static final javax.xml.namespace.QName CDSTYPECODE$0 = 
        new javax.xml.namespace.QName("http://www.nhsia.nhs.uk/DataStandards/XMLschema/CDS/ns", "CDSTypeCode");
    private static final javax.xml.namespace.QName CDSPROTOCOLIDENTIFIERCODE$2 = 
        new javax.xml.namespace.QName("http://www.nhsia.nhs.uk/DataStandards/XMLschema/CDS/ns", "CDSProtocolIdentifierCode");
    private static final javax.xml.namespace.QName CDSUNIQUEIDENTIFIER$4 = 
        new javax.xml.namespace.QName("http://www.nhsia.nhs.uk/DataStandards/XMLschema/CDS/ns", "CDSUniqueIdentifier");
    private static final javax.xml.namespace.QName CDSBULKREPLACEMENTGROUPCODE$6 = 
        new javax.xml.namespace.QName("http://www.nhsia.nhs.uk/DataStandards/XMLschema/CDS/ns", "CDSBulkReplacementGroupCode");
    private static final javax.xml.namespace.QName CDSEXTRACTDATE$8 = 
        new javax.xml.namespace.QName("http://www.nhsia.nhs.uk/DataStandards/XMLschema/CDS/ns", "CDSExtractDate");
    private static final javax.xml.namespace.QName CDSEXTRACTTIME$10 = 
        new javax.xml.namespace.QName("http://www.nhsia.nhs.uk/DataStandards/XMLschema/CDS/ns", "CDSExtractTime");
    private static final javax.xml.namespace.QName CDSREPORTPERIODSTARTDATE$12 = 
        new javax.xml.namespace.QName("http://www.nhsia.nhs.uk/DataStandards/XMLschema/CDS/ns", "CDSReportPeriodStartDate");
    private static final javax.xml.namespace.QName CDSREPORTPERIODENDDATE$14 = 
        new javax.xml.namespace.QName("http://www.nhsia.nhs.uk/DataStandards/XMLschema/CDS/ns", "CDSReportPeriodEndDate");
    private static final javax.xml.namespace.QName CDSACTIVITYDATE$16 = 
        new javax.xml.namespace.QName("http://www.nhsia.nhs.uk/DataStandards/XMLschema/CDS/ns", "CDSActivityDate");
    private static final javax.xml.namespace.QName ORGANISATIONCODECDSSENDERIDENTITY$18 = 
        new javax.xml.namespace.QName("http://www.nhsia.nhs.uk/DataStandards/XMLschema/CDS/ns", "OrganisationCode_CDSSenderIdentity");
    private static final javax.xml.namespace.QName ORGANISATIONCODECDSPRIMERECIPIENTIDENTITY$20 = 
        new javax.xml.namespace.QName("http://www.nhsia.nhs.uk/DataStandards/XMLschema/CDS/ns", "OrganisationCode_CDSPrimeRecipientIdentity");
    private static final javax.xml.namespace.QName ORGANISATIONCODECDSCOPYRECIPIENTIDENTITY$22 = 
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
     * True if has "CDSUniqueIdentifier" element
     */
    public boolean isSetCDSUniqueIdentifier()
    {
        synchronized (monitor())
        {
            check_orphaned();
            return get_store().count_elements(CDSUNIQUEIDENTIFIER$4) != 0;
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
     * Unsets the "CDSUniqueIdentifier" element
     */
    public void unsetCDSUniqueIdentifier()
    {
        synchronized (monitor())
        {
            check_orphaned();
            get_store().remove_element(CDSUNIQUEIDENTIFIER$4, 0);
        }
    }
    
    /**
     * Gets the "CDSBulkReplacementGroupCode" element
     */
    public uk.nhs.nhsia.datastandards.ecds.CDSBulkReplacementGroupCodeType.Enum getCDSBulkReplacementGroupCode()
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.SimpleValue target = null;
            target = (org.apache.xmlbeans.SimpleValue)get_store().find_element_user(CDSBULKREPLACEMENTGROUPCODE$6, 0);
            if (target == null)
            {
                return null;
            }
            return (uk.nhs.nhsia.datastandards.ecds.CDSBulkReplacementGroupCodeType.Enum)target.getEnumValue();
        }
    }
    
    /**
     * Gets (as xml) the "CDSBulkReplacementGroupCode" element
     */
    public uk.nhs.nhsia.datastandards.ecds.CDSBulkReplacementGroupCodeType xgetCDSBulkReplacementGroupCode()
    {
        synchronized (monitor())
        {
            check_orphaned();
            uk.nhs.nhsia.datastandards.ecds.CDSBulkReplacementGroupCodeType target = null;
            target = (uk.nhs.nhsia.datastandards.ecds.CDSBulkReplacementGroupCodeType)get_store().find_element_user(CDSBULKREPLACEMENTGROUPCODE$6, 0);
            return target;
        }
    }
    
    /**
     * Sets the "CDSBulkReplacementGroupCode" element
     */
    public void setCDSBulkReplacementGroupCode(uk.nhs.nhsia.datastandards.ecds.CDSBulkReplacementGroupCodeType.Enum cdsBulkReplacementGroupCode)
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.SimpleValue target = null;
            target = (org.apache.xmlbeans.SimpleValue)get_store().find_element_user(CDSBULKREPLACEMENTGROUPCODE$6, 0);
            if (target == null)
            {
                target = (org.apache.xmlbeans.SimpleValue)get_store().add_element_user(CDSBULKREPLACEMENTGROUPCODE$6);
            }
            target.setEnumValue(cdsBulkReplacementGroupCode);
        }
    }
    
    /**
     * Sets (as xml) the "CDSBulkReplacementGroupCode" element
     */
    public void xsetCDSBulkReplacementGroupCode(uk.nhs.nhsia.datastandards.ecds.CDSBulkReplacementGroupCodeType cdsBulkReplacementGroupCode)
    {
        synchronized (monitor())
        {
            check_orphaned();
            uk.nhs.nhsia.datastandards.ecds.CDSBulkReplacementGroupCodeType target = null;
            target = (uk.nhs.nhsia.datastandards.ecds.CDSBulkReplacementGroupCodeType)get_store().find_element_user(CDSBULKREPLACEMENTGROUPCODE$6, 0);
            if (target == null)
            {
                target = (uk.nhs.nhsia.datastandards.ecds.CDSBulkReplacementGroupCodeType)get_store().add_element_user(CDSBULKREPLACEMENTGROUPCODE$6);
            }
            target.set(cdsBulkReplacementGroupCode);
        }
    }
    
    /**
     * Gets the "CDSExtractDate" element
     */
    public java.util.Calendar getCDSExtractDate()
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.SimpleValue target = null;
            target = (org.apache.xmlbeans.SimpleValue)get_store().find_element_user(CDSEXTRACTDATE$8, 0);
            if (target == null)
            {
                return null;
            }
            return target.getCalendarValue();
        }
    }
    
    /**
     * Gets (as xml) the "CDSExtractDate" element
     */
    public uk.nhs.nhsia.datastandards.ecds.CDSExtractDateType xgetCDSExtractDate()
    {
        synchronized (monitor())
        {
            check_orphaned();
            uk.nhs.nhsia.datastandards.ecds.CDSExtractDateType target = null;
            target = (uk.nhs.nhsia.datastandards.ecds.CDSExtractDateType)get_store().find_element_user(CDSEXTRACTDATE$8, 0);
            return target;
        }
    }
    
    /**
     * Sets the "CDSExtractDate" element
     */
    public void setCDSExtractDate(java.util.Calendar cdsExtractDate)
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.SimpleValue target = null;
            target = (org.apache.xmlbeans.SimpleValue)get_store().find_element_user(CDSEXTRACTDATE$8, 0);
            if (target == null)
            {
                target = (org.apache.xmlbeans.SimpleValue)get_store().add_element_user(CDSEXTRACTDATE$8);
            }
            target.setCalendarValue(cdsExtractDate);
        }
    }
    
    /**
     * Sets (as xml) the "CDSExtractDate" element
     */
    public void xsetCDSExtractDate(uk.nhs.nhsia.datastandards.ecds.CDSExtractDateType cdsExtractDate)
    {
        synchronized (monitor())
        {
            check_orphaned();
            uk.nhs.nhsia.datastandards.ecds.CDSExtractDateType target = null;
            target = (uk.nhs.nhsia.datastandards.ecds.CDSExtractDateType)get_store().find_element_user(CDSEXTRACTDATE$8, 0);
            if (target == null)
            {
                target = (uk.nhs.nhsia.datastandards.ecds.CDSExtractDateType)get_store().add_element_user(CDSEXTRACTDATE$8);
            }
            target.set(cdsExtractDate);
        }
    }
    
    /**
     * Gets the "CDSExtractTime" element
     */
    public java.util.Calendar getCDSExtractTime()
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.SimpleValue target = null;
            target = (org.apache.xmlbeans.SimpleValue)get_store().find_element_user(CDSEXTRACTTIME$10, 0);
            if (target == null)
            {
                return null;
            }
            return target.getCalendarValue();
        }
    }
    
    /**
     * Gets (as xml) the "CDSExtractTime" element
     */
    public uk.nhs.nhsia.datastandards.ecds.CDSExtractTimeType xgetCDSExtractTime()
    {
        synchronized (monitor())
        {
            check_orphaned();
            uk.nhs.nhsia.datastandards.ecds.CDSExtractTimeType target = null;
            target = (uk.nhs.nhsia.datastandards.ecds.CDSExtractTimeType)get_store().find_element_user(CDSEXTRACTTIME$10, 0);
            return target;
        }
    }
    
    /**
     * Sets the "CDSExtractTime" element
     */
    public void setCDSExtractTime(java.util.Calendar cdsExtractTime)
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.SimpleValue target = null;
            target = (org.apache.xmlbeans.SimpleValue)get_store().find_element_user(CDSEXTRACTTIME$10, 0);
            if (target == null)
            {
                target = (org.apache.xmlbeans.SimpleValue)get_store().add_element_user(CDSEXTRACTTIME$10);
            }
            target.setCalendarValue(cdsExtractTime);
        }
    }
    
    /**
     * Sets (as xml) the "CDSExtractTime" element
     */
    public void xsetCDSExtractTime(uk.nhs.nhsia.datastandards.ecds.CDSExtractTimeType cdsExtractTime)
    {
        synchronized (monitor())
        {
            check_orphaned();
            uk.nhs.nhsia.datastandards.ecds.CDSExtractTimeType target = null;
            target = (uk.nhs.nhsia.datastandards.ecds.CDSExtractTimeType)get_store().find_element_user(CDSEXTRACTTIME$10, 0);
            if (target == null)
            {
                target = (uk.nhs.nhsia.datastandards.ecds.CDSExtractTimeType)get_store().add_element_user(CDSEXTRACTTIME$10);
            }
            target.set(cdsExtractTime);
        }
    }
    
    /**
     * Gets the "CDSReportPeriodStartDate" element
     */
    public java.util.Calendar getCDSReportPeriodStartDate()
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.SimpleValue target = null;
            target = (org.apache.xmlbeans.SimpleValue)get_store().find_element_user(CDSREPORTPERIODSTARTDATE$12, 0);
            if (target == null)
            {
                return null;
            }
            return target.getCalendarValue();
        }
    }
    
    /**
     * Gets (as xml) the "CDSReportPeriodStartDate" element
     */
    public uk.nhs.nhsia.datastandards.ecds.CDSReportPeriodStartDateType xgetCDSReportPeriodStartDate()
    {
        synchronized (monitor())
        {
            check_orphaned();
            uk.nhs.nhsia.datastandards.ecds.CDSReportPeriodStartDateType target = null;
            target = (uk.nhs.nhsia.datastandards.ecds.CDSReportPeriodStartDateType)get_store().find_element_user(CDSREPORTPERIODSTARTDATE$12, 0);
            return target;
        }
    }
    
    /**
     * Sets the "CDSReportPeriodStartDate" element
     */
    public void setCDSReportPeriodStartDate(java.util.Calendar cdsReportPeriodStartDate)
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.SimpleValue target = null;
            target = (org.apache.xmlbeans.SimpleValue)get_store().find_element_user(CDSREPORTPERIODSTARTDATE$12, 0);
            if (target == null)
            {
                target = (org.apache.xmlbeans.SimpleValue)get_store().add_element_user(CDSREPORTPERIODSTARTDATE$12);
            }
            target.setCalendarValue(cdsReportPeriodStartDate);
        }
    }
    
    /**
     * Sets (as xml) the "CDSReportPeriodStartDate" element
     */
    public void xsetCDSReportPeriodStartDate(uk.nhs.nhsia.datastandards.ecds.CDSReportPeriodStartDateType cdsReportPeriodStartDate)
    {
        synchronized (monitor())
        {
            check_orphaned();
            uk.nhs.nhsia.datastandards.ecds.CDSReportPeriodStartDateType target = null;
            target = (uk.nhs.nhsia.datastandards.ecds.CDSReportPeriodStartDateType)get_store().find_element_user(CDSREPORTPERIODSTARTDATE$12, 0);
            if (target == null)
            {
                target = (uk.nhs.nhsia.datastandards.ecds.CDSReportPeriodStartDateType)get_store().add_element_user(CDSREPORTPERIODSTARTDATE$12);
            }
            target.set(cdsReportPeriodStartDate);
        }
    }
    
    /**
     * Gets the "CDSReportPeriodEndDate" element
     */
    public java.util.Calendar getCDSReportPeriodEndDate()
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.SimpleValue target = null;
            target = (org.apache.xmlbeans.SimpleValue)get_store().find_element_user(CDSREPORTPERIODENDDATE$14, 0);
            if (target == null)
            {
                return null;
            }
            return target.getCalendarValue();
        }
    }
    
    /**
     * Gets (as xml) the "CDSReportPeriodEndDate" element
     */
    public uk.nhs.nhsia.datastandards.ecds.CDSReportPeriodEndDateType xgetCDSReportPeriodEndDate()
    {
        synchronized (monitor())
        {
            check_orphaned();
            uk.nhs.nhsia.datastandards.ecds.CDSReportPeriodEndDateType target = null;
            target = (uk.nhs.nhsia.datastandards.ecds.CDSReportPeriodEndDateType)get_store().find_element_user(CDSREPORTPERIODENDDATE$14, 0);
            return target;
        }
    }
    
    /**
     * Sets the "CDSReportPeriodEndDate" element
     */
    public void setCDSReportPeriodEndDate(java.util.Calendar cdsReportPeriodEndDate)
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.SimpleValue target = null;
            target = (org.apache.xmlbeans.SimpleValue)get_store().find_element_user(CDSREPORTPERIODENDDATE$14, 0);
            if (target == null)
            {
                target = (org.apache.xmlbeans.SimpleValue)get_store().add_element_user(CDSREPORTPERIODENDDATE$14);
            }
            target.setCalendarValue(cdsReportPeriodEndDate);
        }
    }
    
    /**
     * Sets (as xml) the "CDSReportPeriodEndDate" element
     */
    public void xsetCDSReportPeriodEndDate(uk.nhs.nhsia.datastandards.ecds.CDSReportPeriodEndDateType cdsReportPeriodEndDate)
    {
        synchronized (monitor())
        {
            check_orphaned();
            uk.nhs.nhsia.datastandards.ecds.CDSReportPeriodEndDateType target = null;
            target = (uk.nhs.nhsia.datastandards.ecds.CDSReportPeriodEndDateType)get_store().find_element_user(CDSREPORTPERIODENDDATE$14, 0);
            if (target == null)
            {
                target = (uk.nhs.nhsia.datastandards.ecds.CDSReportPeriodEndDateType)get_store().add_element_user(CDSREPORTPERIODENDDATE$14);
            }
            target.set(cdsReportPeriodEndDate);
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
            target = (org.apache.xmlbeans.SimpleValue)get_store().find_element_user(CDSACTIVITYDATE$16, 0);
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
            target = (uk.nhs.nhsia.datastandards.ecds.CDSActivityDateType)get_store().find_element_user(CDSACTIVITYDATE$16, 0);
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
            target = (org.apache.xmlbeans.SimpleValue)get_store().find_element_user(CDSACTIVITYDATE$16, 0);
            if (target == null)
            {
                target = (org.apache.xmlbeans.SimpleValue)get_store().add_element_user(CDSACTIVITYDATE$16);
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
            target = (uk.nhs.nhsia.datastandards.ecds.CDSActivityDateType)get_store().find_element_user(CDSACTIVITYDATE$16, 0);
            if (target == null)
            {
                target = (uk.nhs.nhsia.datastandards.ecds.CDSActivityDateType)get_store().add_element_user(CDSACTIVITYDATE$16);
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
            target = (org.apache.xmlbeans.SimpleValue)get_store().find_element_user(ORGANISATIONCODECDSSENDERIDENTITY$18, 0);
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
            target = (uk.nhs.nhsia.datastandards.ecds.CDSSenderCodeType)get_store().find_element_user(ORGANISATIONCODECDSSENDERIDENTITY$18, 0);
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
            target = (org.apache.xmlbeans.SimpleValue)get_store().find_element_user(ORGANISATIONCODECDSSENDERIDENTITY$18, 0);
            if (target == null)
            {
                target = (org.apache.xmlbeans.SimpleValue)get_store().add_element_user(ORGANISATIONCODECDSSENDERIDENTITY$18);
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
            target = (uk.nhs.nhsia.datastandards.ecds.CDSSenderCodeType)get_store().find_element_user(ORGANISATIONCODECDSSENDERIDENTITY$18, 0);
            if (target == null)
            {
                target = (uk.nhs.nhsia.datastandards.ecds.CDSSenderCodeType)get_store().add_element_user(ORGANISATIONCODECDSSENDERIDENTITY$18);
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
            target = (org.apache.xmlbeans.SimpleValue)get_store().find_element_user(ORGANISATIONCODECDSPRIMERECIPIENTIDENTITY$20, 0);
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
            target = (uk.nhs.nhsia.datastandards.ecds.CDSPrimeRecipientCodeType)get_store().find_element_user(ORGANISATIONCODECDSPRIMERECIPIENTIDENTITY$20, 0);
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
            target = (org.apache.xmlbeans.SimpleValue)get_store().find_element_user(ORGANISATIONCODECDSPRIMERECIPIENTIDENTITY$20, 0);
            if (target == null)
            {
                target = (org.apache.xmlbeans.SimpleValue)get_store().add_element_user(ORGANISATIONCODECDSPRIMERECIPIENTIDENTITY$20);
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
            target = (uk.nhs.nhsia.datastandards.ecds.CDSPrimeRecipientCodeType)get_store().find_element_user(ORGANISATIONCODECDSPRIMERECIPIENTIDENTITY$20, 0);
            if (target == null)
            {
                target = (uk.nhs.nhsia.datastandards.ecds.CDSPrimeRecipientCodeType)get_store().add_element_user(ORGANISATIONCODECDSPRIMERECIPIENTIDENTITY$20);
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
            get_store().find_all_element_users(ORGANISATIONCODECDSCOPYRECIPIENTIDENTITY$22, targetList);
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
            target = (org.apache.xmlbeans.SimpleValue)get_store().find_element_user(ORGANISATIONCODECDSCOPYRECIPIENTIDENTITY$22, i);
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
            get_store().find_all_element_users(ORGANISATIONCODECDSCOPYRECIPIENTIDENTITY$22, targetList);
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
            target = (uk.nhs.nhsia.datastandards.ecds.CDSCopyRecipientCodeType)get_store().find_element_user(ORGANISATIONCODECDSCOPYRECIPIENTIDENTITY$22, i);
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
            return get_store().count_elements(ORGANISATIONCODECDSCOPYRECIPIENTIDENTITY$22);
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
            arraySetterHelper(organisationCodeCDSCopyRecipientIdentityArray, ORGANISATIONCODECDSCOPYRECIPIENTIDENTITY$22);
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
            target = (org.apache.xmlbeans.SimpleValue)get_store().find_element_user(ORGANISATIONCODECDSCOPYRECIPIENTIDENTITY$22, i);
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
            arraySetterHelper(organisationCodeCDSCopyRecipientIdentityArray, ORGANISATIONCODECDSCOPYRECIPIENTIDENTITY$22);
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
            target = (uk.nhs.nhsia.datastandards.ecds.CDSCopyRecipientCodeType)get_store().find_element_user(ORGANISATIONCODECDSCOPYRECIPIENTIDENTITY$22, i);
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
                (org.apache.xmlbeans.SimpleValue)get_store().insert_element_user(ORGANISATIONCODECDSCOPYRECIPIENTIDENTITY$22, i);
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
            target = (org.apache.xmlbeans.SimpleValue)get_store().add_element_user(ORGANISATIONCODECDSCOPYRECIPIENTIDENTITY$22);
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
            target = (uk.nhs.nhsia.datastandards.ecds.CDSCopyRecipientCodeType)get_store().insert_element_user(ORGANISATIONCODECDSCOPYRECIPIENTIDENTITY$22, i);
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
            target = (uk.nhs.nhsia.datastandards.ecds.CDSCopyRecipientCodeType)get_store().add_element_user(ORGANISATIONCODECDSCOPYRECIPIENTIDENTITY$22);
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
            get_store().remove_element(ORGANISATIONCODECDSCOPYRECIPIENTIDENTITY$22, i);
        }
    }
}
