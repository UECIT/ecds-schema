/*
 * XML Type:  ServiceAgreementDetails_EAL_Structure
 * Namespace: http://www.nhsia.nhs.uk/DataStandards/XMLschema/CDS/ns
 * Java type: uk.nhs.nhsia.datastandards.ecds.ServiceAgreementDetailsEALStructure
 *
 * Automatically generated - do not modify.
 */
package uk.nhs.nhsia.datastandards.ecds.impl;
/**
 * An XML ServiceAgreementDetails_EAL_Structure(@http://www.nhsia.nhs.uk/DataStandards/XMLschema/CDS/ns).
 *
 * This is a complex type.
 */
public class ServiceAgreementDetailsEALStructureImpl extends org.apache.xmlbeans.impl.values.XmlComplexContentImpl implements uk.nhs.nhsia.datastandards.ecds.ServiceAgreementDetailsEALStructure
{
    private static final long serialVersionUID = 1L;
    
    public ServiceAgreementDetailsEALStructureImpl(org.apache.xmlbeans.SchemaType sType)
    {
        super(sType);
    }
    
    private static final javax.xml.namespace.QName COMMISSIONINGSERIALNUMBER$0 = 
        new javax.xml.namespace.QName("http://www.nhsia.nhs.uk/DataStandards/XMLschema/CDS/ns", "CommissioningSerialNumber");
    private static final javax.xml.namespace.QName NHSSERVICEAGREEMENTLINENUMBER$2 = 
        new javax.xml.namespace.QName("http://www.nhsia.nhs.uk/DataStandards/XMLschema/CDS/ns", "NHSServiceAgreementLineNumber");
    private static final javax.xml.namespace.QName PROVIDERREFERENCENUMBER$4 = 
        new javax.xml.namespace.QName("http://www.nhsia.nhs.uk/DataStandards/XMLschema/CDS/ns", "ProviderReferenceNumber");
    private static final javax.xml.namespace.QName COMMISSIONERREFERENCENUMBER$6 = 
        new javax.xml.namespace.QName("http://www.nhsia.nhs.uk/DataStandards/XMLschema/CDS/ns", "CommissionerReferenceNumber");
    private static final javax.xml.namespace.QName ORGANISATIONCODECODEOFPROVIDER$8 = 
        new javax.xml.namespace.QName("http://www.nhsia.nhs.uk/DataStandards/XMLschema/CDS/ns", "OrganisationCode_CodeOfProvider");
    private static final javax.xml.namespace.QName ORGANISATIONCODECODEOFCOMMISSIONER$10 = 
        new javax.xml.namespace.QName("http://www.nhsia.nhs.uk/DataStandards/XMLschema/CDS/ns", "OrganisationCode_CodeOfCommissioner");
    private static final javax.xml.namespace.QName NHSSERVICEAGREEMENTCHANGEDATE$12 = 
        new javax.xml.namespace.QName("http://www.nhsia.nhs.uk/DataStandards/XMLschema/CDS/ns", "NHSServiceAgreementChangeDate");
    
    
    /**
     * Gets the "CommissioningSerialNumber" element
     */
    public java.lang.String getCommissioningSerialNumber()
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.SimpleValue target = null;
            target = (org.apache.xmlbeans.SimpleValue)get_store().find_element_user(COMMISSIONINGSERIALNUMBER$0, 0);
            if (target == null)
            {
                return null;
            }
            return target.getStringValue();
        }
    }
    
    /**
     * Gets (as xml) the "CommissioningSerialNumber" element
     */
    public uk.nhs.nhsia.datastandards.ecds.CommissioningSerialNumberType xgetCommissioningSerialNumber()
    {
        synchronized (monitor())
        {
            check_orphaned();
            uk.nhs.nhsia.datastandards.ecds.CommissioningSerialNumberType target = null;
            target = (uk.nhs.nhsia.datastandards.ecds.CommissioningSerialNumberType)get_store().find_element_user(COMMISSIONINGSERIALNUMBER$0, 0);
            return target;
        }
    }
    
    /**
     * True if has "CommissioningSerialNumber" element
     */
    public boolean isSetCommissioningSerialNumber()
    {
        synchronized (monitor())
        {
            check_orphaned();
            return get_store().count_elements(COMMISSIONINGSERIALNUMBER$0) != 0;
        }
    }
    
    /**
     * Sets the "CommissioningSerialNumber" element
     */
    public void setCommissioningSerialNumber(java.lang.String commissioningSerialNumber)
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.SimpleValue target = null;
            target = (org.apache.xmlbeans.SimpleValue)get_store().find_element_user(COMMISSIONINGSERIALNUMBER$0, 0);
            if (target == null)
            {
                target = (org.apache.xmlbeans.SimpleValue)get_store().add_element_user(COMMISSIONINGSERIALNUMBER$0);
            }
            target.setStringValue(commissioningSerialNumber);
        }
    }
    
    /**
     * Sets (as xml) the "CommissioningSerialNumber" element
     */
    public void xsetCommissioningSerialNumber(uk.nhs.nhsia.datastandards.ecds.CommissioningSerialNumberType commissioningSerialNumber)
    {
        synchronized (monitor())
        {
            check_orphaned();
            uk.nhs.nhsia.datastandards.ecds.CommissioningSerialNumberType target = null;
            target = (uk.nhs.nhsia.datastandards.ecds.CommissioningSerialNumberType)get_store().find_element_user(COMMISSIONINGSERIALNUMBER$0, 0);
            if (target == null)
            {
                target = (uk.nhs.nhsia.datastandards.ecds.CommissioningSerialNumberType)get_store().add_element_user(COMMISSIONINGSERIALNUMBER$0);
            }
            target.set(commissioningSerialNumber);
        }
    }
    
    /**
     * Unsets the "CommissioningSerialNumber" element
     */
    public void unsetCommissioningSerialNumber()
    {
        synchronized (monitor())
        {
            check_orphaned();
            get_store().remove_element(COMMISSIONINGSERIALNUMBER$0, 0);
        }
    }
    
    /**
     * Gets the "NHSServiceAgreementLineNumber" element
     */
    public java.lang.String getNHSServiceAgreementLineNumber()
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.SimpleValue target = null;
            target = (org.apache.xmlbeans.SimpleValue)get_store().find_element_user(NHSSERVICEAGREEMENTLINENUMBER$2, 0);
            if (target == null)
            {
                return null;
            }
            return target.getStringValue();
        }
    }
    
    /**
     * Gets (as xml) the "NHSServiceAgreementLineNumber" element
     */
    public uk.nhs.nhsia.datastandards.ecds.NHSServiceAgreementLineNumberType xgetNHSServiceAgreementLineNumber()
    {
        synchronized (monitor())
        {
            check_orphaned();
            uk.nhs.nhsia.datastandards.ecds.NHSServiceAgreementLineNumberType target = null;
            target = (uk.nhs.nhsia.datastandards.ecds.NHSServiceAgreementLineNumberType)get_store().find_element_user(NHSSERVICEAGREEMENTLINENUMBER$2, 0);
            return target;
        }
    }
    
    /**
     * True if has "NHSServiceAgreementLineNumber" element
     */
    public boolean isSetNHSServiceAgreementLineNumber()
    {
        synchronized (monitor())
        {
            check_orphaned();
            return get_store().count_elements(NHSSERVICEAGREEMENTLINENUMBER$2) != 0;
        }
    }
    
    /**
     * Sets the "NHSServiceAgreementLineNumber" element
     */
    public void setNHSServiceAgreementLineNumber(java.lang.String nhsServiceAgreementLineNumber)
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.SimpleValue target = null;
            target = (org.apache.xmlbeans.SimpleValue)get_store().find_element_user(NHSSERVICEAGREEMENTLINENUMBER$2, 0);
            if (target == null)
            {
                target = (org.apache.xmlbeans.SimpleValue)get_store().add_element_user(NHSSERVICEAGREEMENTLINENUMBER$2);
            }
            target.setStringValue(nhsServiceAgreementLineNumber);
        }
    }
    
    /**
     * Sets (as xml) the "NHSServiceAgreementLineNumber" element
     */
    public void xsetNHSServiceAgreementLineNumber(uk.nhs.nhsia.datastandards.ecds.NHSServiceAgreementLineNumberType nhsServiceAgreementLineNumber)
    {
        synchronized (monitor())
        {
            check_orphaned();
            uk.nhs.nhsia.datastandards.ecds.NHSServiceAgreementLineNumberType target = null;
            target = (uk.nhs.nhsia.datastandards.ecds.NHSServiceAgreementLineNumberType)get_store().find_element_user(NHSSERVICEAGREEMENTLINENUMBER$2, 0);
            if (target == null)
            {
                target = (uk.nhs.nhsia.datastandards.ecds.NHSServiceAgreementLineNumberType)get_store().add_element_user(NHSSERVICEAGREEMENTLINENUMBER$2);
            }
            target.set(nhsServiceAgreementLineNumber);
        }
    }
    
    /**
     * Unsets the "NHSServiceAgreementLineNumber" element
     */
    public void unsetNHSServiceAgreementLineNumber()
    {
        synchronized (monitor())
        {
            check_orphaned();
            get_store().remove_element(NHSSERVICEAGREEMENTLINENUMBER$2, 0);
        }
    }
    
    /**
     * Gets the "ProviderReferenceNumber" element
     */
    public java.lang.String getProviderReferenceNumber()
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.SimpleValue target = null;
            target = (org.apache.xmlbeans.SimpleValue)get_store().find_element_user(PROVIDERREFERENCENUMBER$4, 0);
            if (target == null)
            {
                return null;
            }
            return target.getStringValue();
        }
    }
    
    /**
     * Gets (as xml) the "ProviderReferenceNumber" element
     */
    public uk.nhs.nhsia.datastandards.ecds.ProviderReferenceNumberType xgetProviderReferenceNumber()
    {
        synchronized (monitor())
        {
            check_orphaned();
            uk.nhs.nhsia.datastandards.ecds.ProviderReferenceNumberType target = null;
            target = (uk.nhs.nhsia.datastandards.ecds.ProviderReferenceNumberType)get_store().find_element_user(PROVIDERREFERENCENUMBER$4, 0);
            return target;
        }
    }
    
    /**
     * True if has "ProviderReferenceNumber" element
     */
    public boolean isSetProviderReferenceNumber()
    {
        synchronized (monitor())
        {
            check_orphaned();
            return get_store().count_elements(PROVIDERREFERENCENUMBER$4) != 0;
        }
    }
    
    /**
     * Sets the "ProviderReferenceNumber" element
     */
    public void setProviderReferenceNumber(java.lang.String providerReferenceNumber)
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.SimpleValue target = null;
            target = (org.apache.xmlbeans.SimpleValue)get_store().find_element_user(PROVIDERREFERENCENUMBER$4, 0);
            if (target == null)
            {
                target = (org.apache.xmlbeans.SimpleValue)get_store().add_element_user(PROVIDERREFERENCENUMBER$4);
            }
            target.setStringValue(providerReferenceNumber);
        }
    }
    
    /**
     * Sets (as xml) the "ProviderReferenceNumber" element
     */
    public void xsetProviderReferenceNumber(uk.nhs.nhsia.datastandards.ecds.ProviderReferenceNumberType providerReferenceNumber)
    {
        synchronized (monitor())
        {
            check_orphaned();
            uk.nhs.nhsia.datastandards.ecds.ProviderReferenceNumberType target = null;
            target = (uk.nhs.nhsia.datastandards.ecds.ProviderReferenceNumberType)get_store().find_element_user(PROVIDERREFERENCENUMBER$4, 0);
            if (target == null)
            {
                target = (uk.nhs.nhsia.datastandards.ecds.ProviderReferenceNumberType)get_store().add_element_user(PROVIDERREFERENCENUMBER$4);
            }
            target.set(providerReferenceNumber);
        }
    }
    
    /**
     * Unsets the "ProviderReferenceNumber" element
     */
    public void unsetProviderReferenceNumber()
    {
        synchronized (monitor())
        {
            check_orphaned();
            get_store().remove_element(PROVIDERREFERENCENUMBER$4, 0);
        }
    }
    
    /**
     * Gets the "CommissionerReferenceNumber" element
     */
    public java.lang.String getCommissionerReferenceNumber()
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.SimpleValue target = null;
            target = (org.apache.xmlbeans.SimpleValue)get_store().find_element_user(COMMISSIONERREFERENCENUMBER$6, 0);
            if (target == null)
            {
                return null;
            }
            return target.getStringValue();
        }
    }
    
    /**
     * Gets (as xml) the "CommissionerReferenceNumber" element
     */
    public uk.nhs.nhsia.datastandards.ecds.CommissionerReferenceNumberType xgetCommissionerReferenceNumber()
    {
        synchronized (monitor())
        {
            check_orphaned();
            uk.nhs.nhsia.datastandards.ecds.CommissionerReferenceNumberType target = null;
            target = (uk.nhs.nhsia.datastandards.ecds.CommissionerReferenceNumberType)get_store().find_element_user(COMMISSIONERREFERENCENUMBER$6, 0);
            return target;
        }
    }
    
    /**
     * True if has "CommissionerReferenceNumber" element
     */
    public boolean isSetCommissionerReferenceNumber()
    {
        synchronized (monitor())
        {
            check_orphaned();
            return get_store().count_elements(COMMISSIONERREFERENCENUMBER$6) != 0;
        }
    }
    
    /**
     * Sets the "CommissionerReferenceNumber" element
     */
    public void setCommissionerReferenceNumber(java.lang.String commissionerReferenceNumber)
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.SimpleValue target = null;
            target = (org.apache.xmlbeans.SimpleValue)get_store().find_element_user(COMMISSIONERREFERENCENUMBER$6, 0);
            if (target == null)
            {
                target = (org.apache.xmlbeans.SimpleValue)get_store().add_element_user(COMMISSIONERREFERENCENUMBER$6);
            }
            target.setStringValue(commissionerReferenceNumber);
        }
    }
    
    /**
     * Sets (as xml) the "CommissionerReferenceNumber" element
     */
    public void xsetCommissionerReferenceNumber(uk.nhs.nhsia.datastandards.ecds.CommissionerReferenceNumberType commissionerReferenceNumber)
    {
        synchronized (monitor())
        {
            check_orphaned();
            uk.nhs.nhsia.datastandards.ecds.CommissionerReferenceNumberType target = null;
            target = (uk.nhs.nhsia.datastandards.ecds.CommissionerReferenceNumberType)get_store().find_element_user(COMMISSIONERREFERENCENUMBER$6, 0);
            if (target == null)
            {
                target = (uk.nhs.nhsia.datastandards.ecds.CommissionerReferenceNumberType)get_store().add_element_user(COMMISSIONERREFERENCENUMBER$6);
            }
            target.set(commissionerReferenceNumber);
        }
    }
    
    /**
     * Unsets the "CommissionerReferenceNumber" element
     */
    public void unsetCommissionerReferenceNumber()
    {
        synchronized (monitor())
        {
            check_orphaned();
            get_store().remove_element(COMMISSIONERREFERENCENUMBER$6, 0);
        }
    }
    
    /**
     * Gets the "OrganisationCode_CodeOfProvider" element
     */
    public java.lang.String getOrganisationCodeCodeOfProvider()
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.SimpleValue target = null;
            target = (org.apache.xmlbeans.SimpleValue)get_store().find_element_user(ORGANISATIONCODECODEOFPROVIDER$8, 0);
            if (target == null)
            {
                return null;
            }
            return target.getStringValue();
        }
    }
    
    /**
     * Gets (as xml) the "OrganisationCode_CodeOfProvider" element
     */
    public uk.nhs.nhsia.datastandards.ecds.OrganisationCodeType xgetOrganisationCodeCodeOfProvider()
    {
        synchronized (monitor())
        {
            check_orphaned();
            uk.nhs.nhsia.datastandards.ecds.OrganisationCodeType target = null;
            target = (uk.nhs.nhsia.datastandards.ecds.OrganisationCodeType)get_store().find_element_user(ORGANISATIONCODECODEOFPROVIDER$8, 0);
            return target;
        }
    }
    
    /**
     * Sets the "OrganisationCode_CodeOfProvider" element
     */
    public void setOrganisationCodeCodeOfProvider(java.lang.String organisationCodeCodeOfProvider)
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.SimpleValue target = null;
            target = (org.apache.xmlbeans.SimpleValue)get_store().find_element_user(ORGANISATIONCODECODEOFPROVIDER$8, 0);
            if (target == null)
            {
                target = (org.apache.xmlbeans.SimpleValue)get_store().add_element_user(ORGANISATIONCODECODEOFPROVIDER$8);
            }
            target.setStringValue(organisationCodeCodeOfProvider);
        }
    }
    
    /**
     * Sets (as xml) the "OrganisationCode_CodeOfProvider" element
     */
    public void xsetOrganisationCodeCodeOfProvider(uk.nhs.nhsia.datastandards.ecds.OrganisationCodeType organisationCodeCodeOfProvider)
    {
        synchronized (monitor())
        {
            check_orphaned();
            uk.nhs.nhsia.datastandards.ecds.OrganisationCodeType target = null;
            target = (uk.nhs.nhsia.datastandards.ecds.OrganisationCodeType)get_store().find_element_user(ORGANISATIONCODECODEOFPROVIDER$8, 0);
            if (target == null)
            {
                target = (uk.nhs.nhsia.datastandards.ecds.OrganisationCodeType)get_store().add_element_user(ORGANISATIONCODECODEOFPROVIDER$8);
            }
            target.set(organisationCodeCodeOfProvider);
        }
    }
    
    /**
     * Gets the "OrganisationCode_CodeOfCommissioner" element
     */
    public java.lang.String getOrganisationCodeCodeOfCommissioner()
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.SimpleValue target = null;
            target = (org.apache.xmlbeans.SimpleValue)get_store().find_element_user(ORGANISATIONCODECODEOFCOMMISSIONER$10, 0);
            if (target == null)
            {
                return null;
            }
            return target.getStringValue();
        }
    }
    
    /**
     * Gets (as xml) the "OrganisationCode_CodeOfCommissioner" element
     */
    public uk.nhs.nhsia.datastandards.ecds.OrganisationCodeType xgetOrganisationCodeCodeOfCommissioner()
    {
        synchronized (monitor())
        {
            check_orphaned();
            uk.nhs.nhsia.datastandards.ecds.OrganisationCodeType target = null;
            target = (uk.nhs.nhsia.datastandards.ecds.OrganisationCodeType)get_store().find_element_user(ORGANISATIONCODECODEOFCOMMISSIONER$10, 0);
            return target;
        }
    }
    
    /**
     * Sets the "OrganisationCode_CodeOfCommissioner" element
     */
    public void setOrganisationCodeCodeOfCommissioner(java.lang.String organisationCodeCodeOfCommissioner)
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.SimpleValue target = null;
            target = (org.apache.xmlbeans.SimpleValue)get_store().find_element_user(ORGANISATIONCODECODEOFCOMMISSIONER$10, 0);
            if (target == null)
            {
                target = (org.apache.xmlbeans.SimpleValue)get_store().add_element_user(ORGANISATIONCODECODEOFCOMMISSIONER$10);
            }
            target.setStringValue(organisationCodeCodeOfCommissioner);
        }
    }
    
    /**
     * Sets (as xml) the "OrganisationCode_CodeOfCommissioner" element
     */
    public void xsetOrganisationCodeCodeOfCommissioner(uk.nhs.nhsia.datastandards.ecds.OrganisationCodeType organisationCodeCodeOfCommissioner)
    {
        synchronized (monitor())
        {
            check_orphaned();
            uk.nhs.nhsia.datastandards.ecds.OrganisationCodeType target = null;
            target = (uk.nhs.nhsia.datastandards.ecds.OrganisationCodeType)get_store().find_element_user(ORGANISATIONCODECODEOFCOMMISSIONER$10, 0);
            if (target == null)
            {
                target = (uk.nhs.nhsia.datastandards.ecds.OrganisationCodeType)get_store().add_element_user(ORGANISATIONCODECODEOFCOMMISSIONER$10);
            }
            target.set(organisationCodeCodeOfCommissioner);
        }
    }
    
    /**
     * Gets the "NHSServiceAgreementChangeDate" element
     */
    public java.util.Calendar getNHSServiceAgreementChangeDate()
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.SimpleValue target = null;
            target = (org.apache.xmlbeans.SimpleValue)get_store().find_element_user(NHSSERVICEAGREEMENTCHANGEDATE$12, 0);
            if (target == null)
            {
                return null;
            }
            return target.getCalendarValue();
        }
    }
    
    /**
     * Gets (as xml) the "NHSServiceAgreementChangeDate" element
     */
    public uk.nhs.nhsia.datastandards.ecds.NHSServiceAgreementChangeDateType xgetNHSServiceAgreementChangeDate()
    {
        synchronized (monitor())
        {
            check_orphaned();
            uk.nhs.nhsia.datastandards.ecds.NHSServiceAgreementChangeDateType target = null;
            target = (uk.nhs.nhsia.datastandards.ecds.NHSServiceAgreementChangeDateType)get_store().find_element_user(NHSSERVICEAGREEMENTCHANGEDATE$12, 0);
            return target;
        }
    }
    
    /**
     * True if has "NHSServiceAgreementChangeDate" element
     */
    public boolean isSetNHSServiceAgreementChangeDate()
    {
        synchronized (monitor())
        {
            check_orphaned();
            return get_store().count_elements(NHSSERVICEAGREEMENTCHANGEDATE$12) != 0;
        }
    }
    
    /**
     * Sets the "NHSServiceAgreementChangeDate" element
     */
    public void setNHSServiceAgreementChangeDate(java.util.Calendar nhsServiceAgreementChangeDate)
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.SimpleValue target = null;
            target = (org.apache.xmlbeans.SimpleValue)get_store().find_element_user(NHSSERVICEAGREEMENTCHANGEDATE$12, 0);
            if (target == null)
            {
                target = (org.apache.xmlbeans.SimpleValue)get_store().add_element_user(NHSSERVICEAGREEMENTCHANGEDATE$12);
            }
            target.setCalendarValue(nhsServiceAgreementChangeDate);
        }
    }
    
    /**
     * Sets (as xml) the "NHSServiceAgreementChangeDate" element
     */
    public void xsetNHSServiceAgreementChangeDate(uk.nhs.nhsia.datastandards.ecds.NHSServiceAgreementChangeDateType nhsServiceAgreementChangeDate)
    {
        synchronized (monitor())
        {
            check_orphaned();
            uk.nhs.nhsia.datastandards.ecds.NHSServiceAgreementChangeDateType target = null;
            target = (uk.nhs.nhsia.datastandards.ecds.NHSServiceAgreementChangeDateType)get_store().find_element_user(NHSSERVICEAGREEMENTCHANGEDATE$12, 0);
            if (target == null)
            {
                target = (uk.nhs.nhsia.datastandards.ecds.NHSServiceAgreementChangeDateType)get_store().add_element_user(NHSSERVICEAGREEMENTCHANGEDATE$12);
            }
            target.set(nhsServiceAgreementChangeDate);
        }
    }
    
    /**
     * Unsets the "NHSServiceAgreementChangeDate" element
     */
    public void unsetNHSServiceAgreementChangeDate()
    {
        synchronized (monitor())
        {
            check_orphaned();
            get_store().remove_element(NHSSERVICEAGREEMENTCHANGEDATE$12, 0);
        }
    }
}
