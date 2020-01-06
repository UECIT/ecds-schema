/*
 * XML Type:  CDSInterchange_Structure
 * Namespace: http://www.nhsia.nhs.uk/DataStandards/XMLschema/CDS/ns
 * Java type: uk.nhs.nhsia.datastandards.ecds.CDSInterchangeStructure
 *
 * Automatically generated - do not modify.
 */
package uk.nhs.nhsia.datastandards.ecds.impl;
/**
 * An XML CDSInterchange_Structure(@http://www.nhsia.nhs.uk/DataStandards/XMLschema/CDS/ns).
 *
 * This is a complex type.
 */
public class CDSInterchangeStructureImpl extends org.apache.xmlbeans.impl.values.XmlComplexContentImpl implements uk.nhs.nhsia.datastandards.ecds.CDSInterchangeStructure
{
    private static final long serialVersionUID = 1L;
    
    public CDSInterchangeStructureImpl(org.apache.xmlbeans.SchemaType sType)
    {
        super(sType);
    }
    
    private static final javax.xml.namespace.QName CDSINTERCHANGEHEADER$0 = 
        new javax.xml.namespace.QName("http://www.nhsia.nhs.uk/DataStandards/XMLschema/CDS/ns", "CDSInterchangeHeader");
    private static final javax.xml.namespace.QName CDSNETCHANGEALLMESSAGETYPES$2 = 
        new javax.xml.namespace.QName("http://www.nhsia.nhs.uk/DataStandards/XMLschema/CDS/ns", "CDSNetChange-All-MessageTypes");
    private static final javax.xml.namespace.QName CDSBULKGROUP160MESSAGE$4 = 
        new javax.xml.namespace.QName("http://www.nhsia.nhs.uk/DataStandards/XMLschema/CDS/ns", "CDSBulkGroup-160-Message");
    private static final javax.xml.namespace.QName CDSINTERCHANGETRAILER$6 = 
        new javax.xml.namespace.QName("http://www.nhsia.nhs.uk/DataStandards/XMLschema/CDS/ns", "CDSInterchangeTrailer");
    
    
    /**
     * Gets the "CDSInterchangeHeader" element
     */
    public uk.nhs.nhsia.datastandards.ecds.CDSInterchangeHeaderStructure getCDSInterchangeHeader()
    {
        synchronized (monitor())
        {
            check_orphaned();
            uk.nhs.nhsia.datastandards.ecds.CDSInterchangeHeaderStructure target = null;
            target = (uk.nhs.nhsia.datastandards.ecds.CDSInterchangeHeaderStructure)get_store().find_element_user(CDSINTERCHANGEHEADER$0, 0);
            if (target == null)
            {
                return null;
            }
            return target;
        }
    }
    
    /**
     * Sets the "CDSInterchangeHeader" element
     */
    public void setCDSInterchangeHeader(uk.nhs.nhsia.datastandards.ecds.CDSInterchangeHeaderStructure cdsInterchangeHeader)
    {
        generatedSetterHelperImpl(cdsInterchangeHeader, CDSINTERCHANGEHEADER$0, 0, org.apache.xmlbeans.impl.values.XmlObjectBase.KIND_SETTERHELPER_SINGLETON);
    }
    
    /**
     * Appends and returns a new empty "CDSInterchangeHeader" element
     */
    public uk.nhs.nhsia.datastandards.ecds.CDSInterchangeHeaderStructure addNewCDSInterchangeHeader()
    {
        synchronized (monitor())
        {
            check_orphaned();
            uk.nhs.nhsia.datastandards.ecds.CDSInterchangeHeaderStructure target = null;
            target = (uk.nhs.nhsia.datastandards.ecds.CDSInterchangeHeaderStructure)get_store().add_element_user(CDSINTERCHANGEHEADER$0);
            return target;
        }
    }
    
    /**
     * Gets array of all "CDSNetChange-All-MessageTypes" elements
     */
    public uk.nhs.nhsia.datastandards.ecds.CDSInterchangeStructure.CDSNetChangeAllMessageTypes[] getCDSNetChangeAllMessageTypesArray()
    {
        synchronized (monitor())
        {
            check_orphaned();
            java.util.List targetList = new java.util.ArrayList();
            get_store().find_all_element_users(CDSNETCHANGEALLMESSAGETYPES$2, targetList);
            uk.nhs.nhsia.datastandards.ecds.CDSInterchangeStructure.CDSNetChangeAllMessageTypes[] result = new uk.nhs.nhsia.datastandards.ecds.CDSInterchangeStructure.CDSNetChangeAllMessageTypes[targetList.size()];
            targetList.toArray(result);
            return result;
        }
    }
    
    /**
     * Gets ith "CDSNetChange-All-MessageTypes" element
     */
    public uk.nhs.nhsia.datastandards.ecds.CDSInterchangeStructure.CDSNetChangeAllMessageTypes getCDSNetChangeAllMessageTypesArray(int i)
    {
        synchronized (monitor())
        {
            check_orphaned();
            uk.nhs.nhsia.datastandards.ecds.CDSInterchangeStructure.CDSNetChangeAllMessageTypes target = null;
            target = (uk.nhs.nhsia.datastandards.ecds.CDSInterchangeStructure.CDSNetChangeAllMessageTypes)get_store().find_element_user(CDSNETCHANGEALLMESSAGETYPES$2, i);
            if (target == null)
            {
                throw new IndexOutOfBoundsException();
            }
            return target;
        }
    }
    
    /**
     * Returns number of "CDSNetChange-All-MessageTypes" element
     */
    public int sizeOfCDSNetChangeAllMessageTypesArray()
    {
        synchronized (monitor())
        {
            check_orphaned();
            return get_store().count_elements(CDSNETCHANGEALLMESSAGETYPES$2);
        }
    }
    
    /**
     * Sets array of all "CDSNetChange-All-MessageTypes" element  WARNING: This method is not atomicaly synchronized.
     */
    public void setCDSNetChangeAllMessageTypesArray(uk.nhs.nhsia.datastandards.ecds.CDSInterchangeStructure.CDSNetChangeAllMessageTypes[] cdsNetChangeAllMessageTypesArray)
    {
        check_orphaned();
        arraySetterHelper(cdsNetChangeAllMessageTypesArray, CDSNETCHANGEALLMESSAGETYPES$2);
    }
    
    /**
     * Sets ith "CDSNetChange-All-MessageTypes" element
     */
    public void setCDSNetChangeAllMessageTypesArray(int i, uk.nhs.nhsia.datastandards.ecds.CDSInterchangeStructure.CDSNetChangeAllMessageTypes cdsNetChangeAllMessageTypes)
    {
        generatedSetterHelperImpl(cdsNetChangeAllMessageTypes, CDSNETCHANGEALLMESSAGETYPES$2, i, org.apache.xmlbeans.impl.values.XmlObjectBase.KIND_SETTERHELPER_ARRAYITEM);
    }
    
    /**
     * Inserts and returns a new empty value (as xml) as the ith "CDSNetChange-All-MessageTypes" element
     */
    public uk.nhs.nhsia.datastandards.ecds.CDSInterchangeStructure.CDSNetChangeAllMessageTypes insertNewCDSNetChangeAllMessageTypes(int i)
    {
        synchronized (monitor())
        {
            check_orphaned();
            uk.nhs.nhsia.datastandards.ecds.CDSInterchangeStructure.CDSNetChangeAllMessageTypes target = null;
            target = (uk.nhs.nhsia.datastandards.ecds.CDSInterchangeStructure.CDSNetChangeAllMessageTypes)get_store().insert_element_user(CDSNETCHANGEALLMESSAGETYPES$2, i);
            return target;
        }
    }
    
    /**
     * Appends and returns a new empty value (as xml) as the last "CDSNetChange-All-MessageTypes" element
     */
    public uk.nhs.nhsia.datastandards.ecds.CDSInterchangeStructure.CDSNetChangeAllMessageTypes addNewCDSNetChangeAllMessageTypes()
    {
        synchronized (monitor())
        {
            check_orphaned();
            uk.nhs.nhsia.datastandards.ecds.CDSInterchangeStructure.CDSNetChangeAllMessageTypes target = null;
            target = (uk.nhs.nhsia.datastandards.ecds.CDSInterchangeStructure.CDSNetChangeAllMessageTypes)get_store().add_element_user(CDSNETCHANGEALLMESSAGETYPES$2);
            return target;
        }
    }
    
    /**
     * Removes the ith "CDSNetChange-All-MessageTypes" element
     */
    public void removeCDSNetChangeAllMessageTypes(int i)
    {
        synchronized (monitor())
        {
            check_orphaned();
            get_store().remove_element(CDSNETCHANGEALLMESSAGETYPES$2, i);
        }
    }
    
    /**
     * Gets array of all "CDSBulkGroup-160-Message" elements
     */
    public uk.nhs.nhsia.datastandards.ecds.CDSInterchangeStructure.CDSBulkGroup160Message[] getCDSBulkGroup160MessageArray()
    {
        synchronized (monitor())
        {
            check_orphaned();
            java.util.List targetList = new java.util.ArrayList();
            get_store().find_all_element_users(CDSBULKGROUP160MESSAGE$4, targetList);
            uk.nhs.nhsia.datastandards.ecds.CDSInterchangeStructure.CDSBulkGroup160Message[] result = new uk.nhs.nhsia.datastandards.ecds.CDSInterchangeStructure.CDSBulkGroup160Message[targetList.size()];
            targetList.toArray(result);
            return result;
        }
    }
    
    /**
     * Gets ith "CDSBulkGroup-160-Message" element
     */
    public uk.nhs.nhsia.datastandards.ecds.CDSInterchangeStructure.CDSBulkGroup160Message getCDSBulkGroup160MessageArray(int i)
    {
        synchronized (monitor())
        {
            check_orphaned();
            uk.nhs.nhsia.datastandards.ecds.CDSInterchangeStructure.CDSBulkGroup160Message target = null;
            target = (uk.nhs.nhsia.datastandards.ecds.CDSInterchangeStructure.CDSBulkGroup160Message)get_store().find_element_user(CDSBULKGROUP160MESSAGE$4, i);
            if (target == null)
            {
                throw new IndexOutOfBoundsException();
            }
            return target;
        }
    }
    
    /**
     * Returns number of "CDSBulkGroup-160-Message" element
     */
    public int sizeOfCDSBulkGroup160MessageArray()
    {
        synchronized (monitor())
        {
            check_orphaned();
            return get_store().count_elements(CDSBULKGROUP160MESSAGE$4);
        }
    }
    
    /**
     * Sets array of all "CDSBulkGroup-160-Message" element  WARNING: This method is not atomicaly synchronized.
     */
    public void setCDSBulkGroup160MessageArray(uk.nhs.nhsia.datastandards.ecds.CDSInterchangeStructure.CDSBulkGroup160Message[] cdsBulkGroup160MessageArray)
    {
        check_orphaned();
        arraySetterHelper(cdsBulkGroup160MessageArray, CDSBULKGROUP160MESSAGE$4);
    }
    
    /**
     * Sets ith "CDSBulkGroup-160-Message" element
     */
    public void setCDSBulkGroup160MessageArray(int i, uk.nhs.nhsia.datastandards.ecds.CDSInterchangeStructure.CDSBulkGroup160Message cdsBulkGroup160Message)
    {
        generatedSetterHelperImpl(cdsBulkGroup160Message, CDSBULKGROUP160MESSAGE$4, i, org.apache.xmlbeans.impl.values.XmlObjectBase.KIND_SETTERHELPER_ARRAYITEM);
    }
    
    /**
     * Inserts and returns a new empty value (as xml) as the ith "CDSBulkGroup-160-Message" element
     */
    public uk.nhs.nhsia.datastandards.ecds.CDSInterchangeStructure.CDSBulkGroup160Message insertNewCDSBulkGroup160Message(int i)
    {
        synchronized (monitor())
        {
            check_orphaned();
            uk.nhs.nhsia.datastandards.ecds.CDSInterchangeStructure.CDSBulkGroup160Message target = null;
            target = (uk.nhs.nhsia.datastandards.ecds.CDSInterchangeStructure.CDSBulkGroup160Message)get_store().insert_element_user(CDSBULKGROUP160MESSAGE$4, i);
            return target;
        }
    }
    
    /**
     * Appends and returns a new empty value (as xml) as the last "CDSBulkGroup-160-Message" element
     */
    public uk.nhs.nhsia.datastandards.ecds.CDSInterchangeStructure.CDSBulkGroup160Message addNewCDSBulkGroup160Message()
    {
        synchronized (monitor())
        {
            check_orphaned();
            uk.nhs.nhsia.datastandards.ecds.CDSInterchangeStructure.CDSBulkGroup160Message target = null;
            target = (uk.nhs.nhsia.datastandards.ecds.CDSInterchangeStructure.CDSBulkGroup160Message)get_store().add_element_user(CDSBULKGROUP160MESSAGE$4);
            return target;
        }
    }
    
    /**
     * Removes the ith "CDSBulkGroup-160-Message" element
     */
    public void removeCDSBulkGroup160Message(int i)
    {
        synchronized (monitor())
        {
            check_orphaned();
            get_store().remove_element(CDSBULKGROUP160MESSAGE$4, i);
        }
    }
    
    /**
     * Gets the "CDSInterchangeTrailer" element
     */
    public uk.nhs.nhsia.datastandards.ecds.CDSInterchangeTrailerStructure getCDSInterchangeTrailer()
    {
        synchronized (monitor())
        {
            check_orphaned();
            uk.nhs.nhsia.datastandards.ecds.CDSInterchangeTrailerStructure target = null;
            target = (uk.nhs.nhsia.datastandards.ecds.CDSInterchangeTrailerStructure)get_store().find_element_user(CDSINTERCHANGETRAILER$6, 0);
            if (target == null)
            {
                return null;
            }
            return target;
        }
    }
    
    /**
     * Sets the "CDSInterchangeTrailer" element
     */
    public void setCDSInterchangeTrailer(uk.nhs.nhsia.datastandards.ecds.CDSInterchangeTrailerStructure cdsInterchangeTrailer)
    {
        generatedSetterHelperImpl(cdsInterchangeTrailer, CDSINTERCHANGETRAILER$6, 0, org.apache.xmlbeans.impl.values.XmlObjectBase.KIND_SETTERHELPER_SINGLETON);
    }
    
    /**
     * Appends and returns a new empty "CDSInterchangeTrailer" element
     */
    public uk.nhs.nhsia.datastandards.ecds.CDSInterchangeTrailerStructure addNewCDSInterchangeTrailer()
    {
        synchronized (monitor())
        {
            check_orphaned();
            uk.nhs.nhsia.datastandards.ecds.CDSInterchangeTrailerStructure target = null;
            target = (uk.nhs.nhsia.datastandards.ecds.CDSInterchangeTrailerStructure)get_store().add_element_user(CDSINTERCHANGETRAILER$6);
            return target;
        }
    }
    /**
     * An XML CDSNetChange-All-MessageTypes(@http://www.nhsia.nhs.uk/DataStandards/XMLschema/CDS/ns).
     *
     * This is a complex type.
     */
    public static class CDSNetChangeAllMessageTypesImpl extends org.apache.xmlbeans.impl.values.XmlComplexContentImpl implements uk.nhs.nhsia.datastandards.ecds.CDSInterchangeStructure.CDSNetChangeAllMessageTypes
    {
        private static final long serialVersionUID = 1L;
        
        public CDSNetChangeAllMessageTypesImpl(org.apache.xmlbeans.SchemaType sType)
        {
            super(sType);
        }
        
        private static final javax.xml.namespace.QName CDSMESSAGEHEADER$0 = 
            new javax.xml.namespace.QName("http://www.nhsia.nhs.uk/DataStandards/XMLschema/CDS/ns", "CDSMessageHeader");
        private static final javax.xml.namespace.QName CDSTRANSACTIONHEADERNETCHANGE$2 = 
            new javax.xml.namespace.QName("http://www.nhsia.nhs.uk/DataStandards/XMLschema/CDS/ns", "CDSTransactionHeader_NetChange");
        private static final javax.xml.namespace.QName EMERGENCYCARE$4 = 
            new javax.xml.namespace.QName("http://www.nhsia.nhs.uk/DataStandards/XMLschema/CDS/ns", "EmergencyCare");
        private static final javax.xml.namespace.QName DELETETRANSACTION$6 = 
            new javax.xml.namespace.QName("http://www.nhsia.nhs.uk/DataStandards/XMLschema/CDS/ns", "DeleteTransaction");
        private static final javax.xml.namespace.QName CDSMESSAGETRAILER$8 = 
            new javax.xml.namespace.QName("http://www.nhsia.nhs.uk/DataStandards/XMLschema/CDS/ns", "CDSMessageTrailer");
        private static final javax.xml.namespace.QName CDSPROTOCOLIDENTIFIERCODE$10 = 
            new javax.xml.namespace.QName("", "CDSProtocolIdentifierCode");
        private static final javax.xml.namespace.QName CDSTYPECODE$12 = 
            new javax.xml.namespace.QName("", "CDSTypeCode");
        
        
        /**
         * Gets the "CDSMessageHeader" element
         */
        public uk.nhs.nhsia.datastandards.ecds.CDSMessageHeaderStructure getCDSMessageHeader()
        {
            synchronized (monitor())
            {
                check_orphaned();
                uk.nhs.nhsia.datastandards.ecds.CDSMessageHeaderStructure target = null;
                target = (uk.nhs.nhsia.datastandards.ecds.CDSMessageHeaderStructure)get_store().find_element_user(CDSMESSAGEHEADER$0, 0);
                if (target == null)
                {
                    return null;
                }
                return target;
            }
        }
        
        /**
         * Sets the "CDSMessageHeader" element
         */
        public void setCDSMessageHeader(uk.nhs.nhsia.datastandards.ecds.CDSMessageHeaderStructure cdsMessageHeader)
        {
            generatedSetterHelperImpl(cdsMessageHeader, CDSMESSAGEHEADER$0, 0, org.apache.xmlbeans.impl.values.XmlObjectBase.KIND_SETTERHELPER_SINGLETON);
        }
        
        /**
         * Appends and returns a new empty "CDSMessageHeader" element
         */
        public uk.nhs.nhsia.datastandards.ecds.CDSMessageHeaderStructure addNewCDSMessageHeader()
        {
            synchronized (monitor())
            {
                check_orphaned();
                uk.nhs.nhsia.datastandards.ecds.CDSMessageHeaderStructure target = null;
                target = (uk.nhs.nhsia.datastandards.ecds.CDSMessageHeaderStructure)get_store().add_element_user(CDSMESSAGEHEADER$0);
                return target;
            }
        }
        
        /**
         * Gets the "CDSTransactionHeader_NetChange" element
         */
        public uk.nhs.nhsia.datastandards.ecds.CDSTransactionHeaderNetChangeStructure getCDSTransactionHeaderNetChange()
        {
            synchronized (monitor())
            {
                check_orphaned();
                uk.nhs.nhsia.datastandards.ecds.CDSTransactionHeaderNetChangeStructure target = null;
                target = (uk.nhs.nhsia.datastandards.ecds.CDSTransactionHeaderNetChangeStructure)get_store().find_element_user(CDSTRANSACTIONHEADERNETCHANGE$2, 0);
                if (target == null)
                {
                    return null;
                }
                return target;
            }
        }
        
        /**
         * Sets the "CDSTransactionHeader_NetChange" element
         */
        public void setCDSTransactionHeaderNetChange(uk.nhs.nhsia.datastandards.ecds.CDSTransactionHeaderNetChangeStructure cdsTransactionHeaderNetChange)
        {
            generatedSetterHelperImpl(cdsTransactionHeaderNetChange, CDSTRANSACTIONHEADERNETCHANGE$2, 0, org.apache.xmlbeans.impl.values.XmlObjectBase.KIND_SETTERHELPER_SINGLETON);
        }
        
        /**
         * Appends and returns a new empty "CDSTransactionHeader_NetChange" element
         */
        public uk.nhs.nhsia.datastandards.ecds.CDSTransactionHeaderNetChangeStructure addNewCDSTransactionHeaderNetChange()
        {
            synchronized (monitor())
            {
                check_orphaned();
                uk.nhs.nhsia.datastandards.ecds.CDSTransactionHeaderNetChangeStructure target = null;
                target = (uk.nhs.nhsia.datastandards.ecds.CDSTransactionHeaderNetChangeStructure)get_store().add_element_user(CDSTRANSACTIONHEADERNETCHANGE$2);
                return target;
            }
        }
        
        /**
         * Gets the "EmergencyCare" element
         */
        public uk.nhs.nhsia.datastandards.ecds.EmergencyCareStucture getEmergencyCare()
        {
            synchronized (monitor())
            {
                check_orphaned();
                uk.nhs.nhsia.datastandards.ecds.EmergencyCareStucture target = null;
                target = (uk.nhs.nhsia.datastandards.ecds.EmergencyCareStucture)get_store().find_element_user(EMERGENCYCARE$4, 0);
                if (target == null)
                {
                    return null;
                }
                return target;
            }
        }
        
        /**
         * True if has "EmergencyCare" element
         */
        public boolean isSetEmergencyCare()
        {
            synchronized (monitor())
            {
                check_orphaned();
                return get_store().count_elements(EMERGENCYCARE$4) != 0;
            }
        }
        
        /**
         * Sets the "EmergencyCare" element
         */
        public void setEmergencyCare(uk.nhs.nhsia.datastandards.ecds.EmergencyCareStucture emergencyCare)
        {
            generatedSetterHelperImpl(emergencyCare, EMERGENCYCARE$4, 0, org.apache.xmlbeans.impl.values.XmlObjectBase.KIND_SETTERHELPER_SINGLETON);
        }
        
        /**
         * Appends and returns a new empty "EmergencyCare" element
         */
        public uk.nhs.nhsia.datastandards.ecds.EmergencyCareStucture addNewEmergencyCare()
        {
            synchronized (monitor())
            {
                check_orphaned();
                uk.nhs.nhsia.datastandards.ecds.EmergencyCareStucture target = null;
                target = (uk.nhs.nhsia.datastandards.ecds.EmergencyCareStucture)get_store().add_element_user(EMERGENCYCARE$4);
                return target;
            }
        }
        
        /**
         * Unsets the "EmergencyCare" element
         */
        public void unsetEmergencyCare()
        {
            synchronized (monitor())
            {
                check_orphaned();
                get_store().remove_element(EMERGENCYCARE$4, 0);
            }
        }
        
        /**
         * Gets the "DeleteTransaction" element
         */
        public uk.nhs.nhsia.datastandards.ecds.CDSInterchangeStructure.CDSNetChangeAllMessageTypes.DeleteTransaction getDeleteTransaction()
        {
            synchronized (monitor())
            {
                check_orphaned();
                uk.nhs.nhsia.datastandards.ecds.CDSInterchangeStructure.CDSNetChangeAllMessageTypes.DeleteTransaction target = null;
                target = (uk.nhs.nhsia.datastandards.ecds.CDSInterchangeStructure.CDSNetChangeAllMessageTypes.DeleteTransaction)get_store().find_element_user(DELETETRANSACTION$6, 0);
                if (target == null)
                {
                    return null;
                }
                return target;
            }
        }
        
        /**
         * True if has "DeleteTransaction" element
         */
        public boolean isSetDeleteTransaction()
        {
            synchronized (monitor())
            {
                check_orphaned();
                return get_store().count_elements(DELETETRANSACTION$6) != 0;
            }
        }
        
        /**
         * Sets the "DeleteTransaction" element
         */
        public void setDeleteTransaction(uk.nhs.nhsia.datastandards.ecds.CDSInterchangeStructure.CDSNetChangeAllMessageTypes.DeleteTransaction deleteTransaction)
        {
            generatedSetterHelperImpl(deleteTransaction, DELETETRANSACTION$6, 0, org.apache.xmlbeans.impl.values.XmlObjectBase.KIND_SETTERHELPER_SINGLETON);
        }
        
        /**
         * Appends and returns a new empty "DeleteTransaction" element
         */
        public uk.nhs.nhsia.datastandards.ecds.CDSInterchangeStructure.CDSNetChangeAllMessageTypes.DeleteTransaction addNewDeleteTransaction()
        {
            synchronized (monitor())
            {
                check_orphaned();
                uk.nhs.nhsia.datastandards.ecds.CDSInterchangeStructure.CDSNetChangeAllMessageTypes.DeleteTransaction target = null;
                target = (uk.nhs.nhsia.datastandards.ecds.CDSInterchangeStructure.CDSNetChangeAllMessageTypes.DeleteTransaction)get_store().add_element_user(DELETETRANSACTION$6);
                return target;
            }
        }
        
        /**
         * Unsets the "DeleteTransaction" element
         */
        public void unsetDeleteTransaction()
        {
            synchronized (monitor())
            {
                check_orphaned();
                get_store().remove_element(DELETETRANSACTION$6, 0);
            }
        }
        
        /**
         * Gets the "CDSMessageTrailer" element
         */
        public uk.nhs.nhsia.datastandards.ecds.CDSMessageTrailerStructure getCDSMessageTrailer()
        {
            synchronized (monitor())
            {
                check_orphaned();
                uk.nhs.nhsia.datastandards.ecds.CDSMessageTrailerStructure target = null;
                target = (uk.nhs.nhsia.datastandards.ecds.CDSMessageTrailerStructure)get_store().find_element_user(CDSMESSAGETRAILER$8, 0);
                if (target == null)
                {
                    return null;
                }
                return target;
            }
        }
        
        /**
         * Sets the "CDSMessageTrailer" element
         */
        public void setCDSMessageTrailer(uk.nhs.nhsia.datastandards.ecds.CDSMessageTrailerStructure cdsMessageTrailer)
        {
            generatedSetterHelperImpl(cdsMessageTrailer, CDSMESSAGETRAILER$8, 0, org.apache.xmlbeans.impl.values.XmlObjectBase.KIND_SETTERHELPER_SINGLETON);
        }
        
        /**
         * Appends and returns a new empty "CDSMessageTrailer" element
         */
        public uk.nhs.nhsia.datastandards.ecds.CDSMessageTrailerStructure addNewCDSMessageTrailer()
        {
            synchronized (monitor())
            {
                check_orphaned();
                uk.nhs.nhsia.datastandards.ecds.CDSMessageTrailerStructure target = null;
                target = (uk.nhs.nhsia.datastandards.ecds.CDSMessageTrailerStructure)get_store().add_element_user(CDSMESSAGETRAILER$8);
                return target;
            }
        }
        
        /**
         * Gets the "CDSProtocolIdentifierCode" attribute
         */
        public uk.nhs.nhsia.datastandards.ecds.CDSProtocolIdentifierCodeType.Enum getCDSProtocolIdentifierCode()
        {
            synchronized (monitor())
            {
                check_orphaned();
                org.apache.xmlbeans.SimpleValue target = null;
                target = (org.apache.xmlbeans.SimpleValue)get_store().find_attribute_user(CDSPROTOCOLIDENTIFIERCODE$10);
                if (target == null)
                {
                    target = (org.apache.xmlbeans.SimpleValue)get_default_attribute_value(CDSPROTOCOLIDENTIFIERCODE$10);
                }
                if (target == null)
                {
                    return null;
                }
                return (uk.nhs.nhsia.datastandards.ecds.CDSProtocolIdentifierCodeType.Enum)target.getEnumValue();
            }
        }
        
        /**
         * Gets (as xml) the "CDSProtocolIdentifierCode" attribute
         */
        public uk.nhs.nhsia.datastandards.ecds.CDSProtocolIdentifierCodeType xgetCDSProtocolIdentifierCode()
        {
            synchronized (monitor())
            {
                check_orphaned();
                uk.nhs.nhsia.datastandards.ecds.CDSProtocolIdentifierCodeType target = null;
                target = (uk.nhs.nhsia.datastandards.ecds.CDSProtocolIdentifierCodeType)get_store().find_attribute_user(CDSPROTOCOLIDENTIFIERCODE$10);
                if (target == null)
                {
                    target = (uk.nhs.nhsia.datastandards.ecds.CDSProtocolIdentifierCodeType)get_default_attribute_value(CDSPROTOCOLIDENTIFIERCODE$10);
                }
                return target;
            }
        }
        
        /**
         * Sets the "CDSProtocolIdentifierCode" attribute
         */
        public void setCDSProtocolIdentifierCode(uk.nhs.nhsia.datastandards.ecds.CDSProtocolIdentifierCodeType.Enum cdsProtocolIdentifierCode)
        {
            synchronized (monitor())
            {
                check_orphaned();
                org.apache.xmlbeans.SimpleValue target = null;
                target = (org.apache.xmlbeans.SimpleValue)get_store().find_attribute_user(CDSPROTOCOLIDENTIFIERCODE$10);
                if (target == null)
                {
                    target = (org.apache.xmlbeans.SimpleValue)get_store().add_attribute_user(CDSPROTOCOLIDENTIFIERCODE$10);
                }
                target.setEnumValue(cdsProtocolIdentifierCode);
            }
        }
        
        /**
         * Sets (as xml) the "CDSProtocolIdentifierCode" attribute
         */
        public void xsetCDSProtocolIdentifierCode(uk.nhs.nhsia.datastandards.ecds.CDSProtocolIdentifierCodeType cdsProtocolIdentifierCode)
        {
            synchronized (monitor())
            {
                check_orphaned();
                uk.nhs.nhsia.datastandards.ecds.CDSProtocolIdentifierCodeType target = null;
                target = (uk.nhs.nhsia.datastandards.ecds.CDSProtocolIdentifierCodeType)get_store().find_attribute_user(CDSPROTOCOLIDENTIFIERCODE$10);
                if (target == null)
                {
                    target = (uk.nhs.nhsia.datastandards.ecds.CDSProtocolIdentifierCodeType)get_store().add_attribute_user(CDSPROTOCOLIDENTIFIERCODE$10);
                }
                target.set(cdsProtocolIdentifierCode);
            }
        }
        
        /**
         * Gets the "CDSTypeCode" attribute
         */
        public uk.nhs.nhsia.datastandards.ecds.CDSTypeCodeType.Enum getCDSTypeCode()
        {
            synchronized (monitor())
            {
                check_orphaned();
                org.apache.xmlbeans.SimpleValue target = null;
                target = (org.apache.xmlbeans.SimpleValue)get_store().find_attribute_user(CDSTYPECODE$12);
                if (target == null)
                {
                    return null;
                }
                return (uk.nhs.nhsia.datastandards.ecds.CDSTypeCodeType.Enum)target.getEnumValue();
            }
        }
        
        /**
         * Gets (as xml) the "CDSTypeCode" attribute
         */
        public uk.nhs.nhsia.datastandards.ecds.CDSTypeCodeType xgetCDSTypeCode()
        {
            synchronized (monitor())
            {
                check_orphaned();
                uk.nhs.nhsia.datastandards.ecds.CDSTypeCodeType target = null;
                target = (uk.nhs.nhsia.datastandards.ecds.CDSTypeCodeType)get_store().find_attribute_user(CDSTYPECODE$12);
                return target;
            }
        }
        
        /**
         * Sets the "CDSTypeCode" attribute
         */
        public void setCDSTypeCode(uk.nhs.nhsia.datastandards.ecds.CDSTypeCodeType.Enum cdsTypeCode)
        {
            synchronized (monitor())
            {
                check_orphaned();
                org.apache.xmlbeans.SimpleValue target = null;
                target = (org.apache.xmlbeans.SimpleValue)get_store().find_attribute_user(CDSTYPECODE$12);
                if (target == null)
                {
                    target = (org.apache.xmlbeans.SimpleValue)get_store().add_attribute_user(CDSTYPECODE$12);
                }
                target.setEnumValue(cdsTypeCode);
            }
        }
        
        /**
         * Sets (as xml) the "CDSTypeCode" attribute
         */
        public void xsetCDSTypeCode(uk.nhs.nhsia.datastandards.ecds.CDSTypeCodeType cdsTypeCode)
        {
            synchronized (monitor())
            {
                check_orphaned();
                uk.nhs.nhsia.datastandards.ecds.CDSTypeCodeType target = null;
                target = (uk.nhs.nhsia.datastandards.ecds.CDSTypeCodeType)get_store().find_attribute_user(CDSTYPECODE$12);
                if (target == null)
                {
                    target = (uk.nhs.nhsia.datastandards.ecds.CDSTypeCodeType)get_store().add_attribute_user(CDSTYPECODE$12);
                }
                target.set(cdsTypeCode);
            }
        }
        /**
         * An XML DeleteTransaction(@http://www.nhsia.nhs.uk/DataStandards/XMLschema/CDS/ns).
         *
         * This is a complex type.
         */
        public static class DeleteTransactionImpl extends org.apache.xmlbeans.impl.values.XmlComplexContentImpl implements uk.nhs.nhsia.datastandards.ecds.CDSInterchangeStructure.CDSNetChangeAllMessageTypes.DeleteTransaction
        {
            private static final long serialVersionUID = 1L;
            
            public DeleteTransactionImpl(org.apache.xmlbeans.SchemaType sType)
            {
                super(sType);
            }
            
            
        }
    }
    /**
     * An XML CDSBulkGroup-160-Message(@http://www.nhsia.nhs.uk/DataStandards/XMLschema/CDS/ns).
     *
     * This is a complex type.
     */
    public static class CDSBulkGroup160MessageImpl extends org.apache.xmlbeans.impl.values.XmlComplexContentImpl implements uk.nhs.nhsia.datastandards.ecds.CDSInterchangeStructure.CDSBulkGroup160Message
    {
        private static final long serialVersionUID = 1L;
        
        public CDSBulkGroup160MessageImpl(org.apache.xmlbeans.SchemaType sType)
        {
            super(sType);
        }
        
        private static final javax.xml.namespace.QName CDSMESSAGEHEADER$0 = 
            new javax.xml.namespace.QName("http://www.nhsia.nhs.uk/DataStandards/XMLschema/CDS/ns", "CDSMessageHeader");
        private static final javax.xml.namespace.QName CDSTRANSACTIONHEADERBULKUPDATE$2 = 
            new javax.xml.namespace.QName("http://www.nhsia.nhs.uk/DataStandards/XMLschema/CDS/ns", "CDSTransactionHeader_BulkUpdate");
        private static final javax.xml.namespace.QName EMERGENCYCARE$4 = 
            new javax.xml.namespace.QName("http://www.nhsia.nhs.uk/DataStandards/XMLschema/CDS/ns", "EmergencyCare");
        private static final javax.xml.namespace.QName CDSMESSAGETRAILER$6 = 
            new javax.xml.namespace.QName("http://www.nhsia.nhs.uk/DataStandards/XMLschema/CDS/ns", "CDSMessageTrailer");
        private static final javax.xml.namespace.QName CDSPROTOCOLIDENTIFIERCODE$8 = 
            new javax.xml.namespace.QName("", "CDSProtocolIdentifierCode");
        private static final javax.xml.namespace.QName CDSBULKREPLACEMENTGROUPCODE$10 = 
            new javax.xml.namespace.QName("", "CDSBulkReplacementGroupCode");
        private static final javax.xml.namespace.QName CDSTYPECODE$12 = 
            new javax.xml.namespace.QName("", "CDSTypeCode");
        
        
        /**
         * Gets the "CDSMessageHeader" element
         */
        public uk.nhs.nhsia.datastandards.ecds.CDSMessageHeaderStructure getCDSMessageHeader()
        {
            synchronized (monitor())
            {
                check_orphaned();
                uk.nhs.nhsia.datastandards.ecds.CDSMessageHeaderStructure target = null;
                target = (uk.nhs.nhsia.datastandards.ecds.CDSMessageHeaderStructure)get_store().find_element_user(CDSMESSAGEHEADER$0, 0);
                if (target == null)
                {
                    return null;
                }
                return target;
            }
        }
        
        /**
         * Sets the "CDSMessageHeader" element
         */
        public void setCDSMessageHeader(uk.nhs.nhsia.datastandards.ecds.CDSMessageHeaderStructure cdsMessageHeader)
        {
            generatedSetterHelperImpl(cdsMessageHeader, CDSMESSAGEHEADER$0, 0, org.apache.xmlbeans.impl.values.XmlObjectBase.KIND_SETTERHELPER_SINGLETON);
        }
        
        /**
         * Appends and returns a new empty "CDSMessageHeader" element
         */
        public uk.nhs.nhsia.datastandards.ecds.CDSMessageHeaderStructure addNewCDSMessageHeader()
        {
            synchronized (monitor())
            {
                check_orphaned();
                uk.nhs.nhsia.datastandards.ecds.CDSMessageHeaderStructure target = null;
                target = (uk.nhs.nhsia.datastandards.ecds.CDSMessageHeaderStructure)get_store().add_element_user(CDSMESSAGEHEADER$0);
                return target;
            }
        }
        
        /**
         * Gets the "CDSTransactionHeader_BulkUpdate" element
         */
        public uk.nhs.nhsia.datastandards.ecds.CDSTransactionHeaderBulkUpdateStructure getCDSTransactionHeaderBulkUpdate()
        {
            synchronized (monitor())
            {
                check_orphaned();
                uk.nhs.nhsia.datastandards.ecds.CDSTransactionHeaderBulkUpdateStructure target = null;
                target = (uk.nhs.nhsia.datastandards.ecds.CDSTransactionHeaderBulkUpdateStructure)get_store().find_element_user(CDSTRANSACTIONHEADERBULKUPDATE$2, 0);
                if (target == null)
                {
                    return null;
                }
                return target;
            }
        }
        
        /**
         * Sets the "CDSTransactionHeader_BulkUpdate" element
         */
        public void setCDSTransactionHeaderBulkUpdate(uk.nhs.nhsia.datastandards.ecds.CDSTransactionHeaderBulkUpdateStructure cdsTransactionHeaderBulkUpdate)
        {
            generatedSetterHelperImpl(cdsTransactionHeaderBulkUpdate, CDSTRANSACTIONHEADERBULKUPDATE$2, 0, org.apache.xmlbeans.impl.values.XmlObjectBase.KIND_SETTERHELPER_SINGLETON);
        }
        
        /**
         * Appends and returns a new empty "CDSTransactionHeader_BulkUpdate" element
         */
        public uk.nhs.nhsia.datastandards.ecds.CDSTransactionHeaderBulkUpdateStructure addNewCDSTransactionHeaderBulkUpdate()
        {
            synchronized (monitor())
            {
                check_orphaned();
                uk.nhs.nhsia.datastandards.ecds.CDSTransactionHeaderBulkUpdateStructure target = null;
                target = (uk.nhs.nhsia.datastandards.ecds.CDSTransactionHeaderBulkUpdateStructure)get_store().add_element_user(CDSTRANSACTIONHEADERBULKUPDATE$2);
                return target;
            }
        }
        
        /**
         * Gets the "EmergencyCare" element
         */
        public uk.nhs.nhsia.datastandards.ecds.EmergencyCareStucture getEmergencyCare()
        {
            synchronized (monitor())
            {
                check_orphaned();
                uk.nhs.nhsia.datastandards.ecds.EmergencyCareStucture target = null;
                target = (uk.nhs.nhsia.datastandards.ecds.EmergencyCareStucture)get_store().find_element_user(EMERGENCYCARE$4, 0);
                if (target == null)
                {
                    return null;
                }
                return target;
            }
        }
        
        /**
         * Sets the "EmergencyCare" element
         */
        public void setEmergencyCare(uk.nhs.nhsia.datastandards.ecds.EmergencyCareStucture emergencyCare)
        {
            generatedSetterHelperImpl(emergencyCare, EMERGENCYCARE$4, 0, org.apache.xmlbeans.impl.values.XmlObjectBase.KIND_SETTERHELPER_SINGLETON);
        }
        
        /**
         * Appends and returns a new empty "EmergencyCare" element
         */
        public uk.nhs.nhsia.datastandards.ecds.EmergencyCareStucture addNewEmergencyCare()
        {
            synchronized (monitor())
            {
                check_orphaned();
                uk.nhs.nhsia.datastandards.ecds.EmergencyCareStucture target = null;
                target = (uk.nhs.nhsia.datastandards.ecds.EmergencyCareStucture)get_store().add_element_user(EMERGENCYCARE$4);
                return target;
            }
        }
        
        /**
         * Gets the "CDSMessageTrailer" element
         */
        public uk.nhs.nhsia.datastandards.ecds.CDSMessageTrailerStructure getCDSMessageTrailer()
        {
            synchronized (monitor())
            {
                check_orphaned();
                uk.nhs.nhsia.datastandards.ecds.CDSMessageTrailerStructure target = null;
                target = (uk.nhs.nhsia.datastandards.ecds.CDSMessageTrailerStructure)get_store().find_element_user(CDSMESSAGETRAILER$6, 0);
                if (target == null)
                {
                    return null;
                }
                return target;
            }
        }
        
        /**
         * Sets the "CDSMessageTrailer" element
         */
        public void setCDSMessageTrailer(uk.nhs.nhsia.datastandards.ecds.CDSMessageTrailerStructure cdsMessageTrailer)
        {
            generatedSetterHelperImpl(cdsMessageTrailer, CDSMESSAGETRAILER$6, 0, org.apache.xmlbeans.impl.values.XmlObjectBase.KIND_SETTERHELPER_SINGLETON);
        }
        
        /**
         * Appends and returns a new empty "CDSMessageTrailer" element
         */
        public uk.nhs.nhsia.datastandards.ecds.CDSMessageTrailerStructure addNewCDSMessageTrailer()
        {
            synchronized (monitor())
            {
                check_orphaned();
                uk.nhs.nhsia.datastandards.ecds.CDSMessageTrailerStructure target = null;
                target = (uk.nhs.nhsia.datastandards.ecds.CDSMessageTrailerStructure)get_store().add_element_user(CDSMESSAGETRAILER$6);
                return target;
            }
        }
        
        /**
         * Gets the "CDSProtocolIdentifierCode" attribute
         */
        public uk.nhs.nhsia.datastandards.ecds.CDSProtocolIdentifierCodeType.Enum getCDSProtocolIdentifierCode()
        {
            synchronized (monitor())
            {
                check_orphaned();
                org.apache.xmlbeans.SimpleValue target = null;
                target = (org.apache.xmlbeans.SimpleValue)get_store().find_attribute_user(CDSPROTOCOLIDENTIFIERCODE$8);
                if (target == null)
                {
                    target = (org.apache.xmlbeans.SimpleValue)get_default_attribute_value(CDSPROTOCOLIDENTIFIERCODE$8);
                }
                if (target == null)
                {
                    return null;
                }
                return (uk.nhs.nhsia.datastandards.ecds.CDSProtocolIdentifierCodeType.Enum)target.getEnumValue();
            }
        }
        
        /**
         * Gets (as xml) the "CDSProtocolIdentifierCode" attribute
         */
        public uk.nhs.nhsia.datastandards.ecds.CDSProtocolIdentifierCodeType xgetCDSProtocolIdentifierCode()
        {
            synchronized (monitor())
            {
                check_orphaned();
                uk.nhs.nhsia.datastandards.ecds.CDSProtocolIdentifierCodeType target = null;
                target = (uk.nhs.nhsia.datastandards.ecds.CDSProtocolIdentifierCodeType)get_store().find_attribute_user(CDSPROTOCOLIDENTIFIERCODE$8);
                if (target == null)
                {
                    target = (uk.nhs.nhsia.datastandards.ecds.CDSProtocolIdentifierCodeType)get_default_attribute_value(CDSPROTOCOLIDENTIFIERCODE$8);
                }
                return target;
            }
        }
        
        /**
         * Sets the "CDSProtocolIdentifierCode" attribute
         */
        public void setCDSProtocolIdentifierCode(uk.nhs.nhsia.datastandards.ecds.CDSProtocolIdentifierCodeType.Enum cdsProtocolIdentifierCode)
        {
            synchronized (monitor())
            {
                check_orphaned();
                org.apache.xmlbeans.SimpleValue target = null;
                target = (org.apache.xmlbeans.SimpleValue)get_store().find_attribute_user(CDSPROTOCOLIDENTIFIERCODE$8);
                if (target == null)
                {
                    target = (org.apache.xmlbeans.SimpleValue)get_store().add_attribute_user(CDSPROTOCOLIDENTIFIERCODE$8);
                }
                target.setEnumValue(cdsProtocolIdentifierCode);
            }
        }
        
        /**
         * Sets (as xml) the "CDSProtocolIdentifierCode" attribute
         */
        public void xsetCDSProtocolIdentifierCode(uk.nhs.nhsia.datastandards.ecds.CDSProtocolIdentifierCodeType cdsProtocolIdentifierCode)
        {
            synchronized (monitor())
            {
                check_orphaned();
                uk.nhs.nhsia.datastandards.ecds.CDSProtocolIdentifierCodeType target = null;
                target = (uk.nhs.nhsia.datastandards.ecds.CDSProtocolIdentifierCodeType)get_store().find_attribute_user(CDSPROTOCOLIDENTIFIERCODE$8);
                if (target == null)
                {
                    target = (uk.nhs.nhsia.datastandards.ecds.CDSProtocolIdentifierCodeType)get_store().add_attribute_user(CDSPROTOCOLIDENTIFIERCODE$8);
                }
                target.set(cdsProtocolIdentifierCode);
            }
        }
        
        /**
         * Gets the "CDSBulkReplacementGroupCode" attribute
         */
        public uk.nhs.nhsia.datastandards.ecds.CDSBulkReplacementGroupCodeType.Enum getCDSBulkReplacementGroupCode()
        {
            synchronized (monitor())
            {
                check_orphaned();
                org.apache.xmlbeans.SimpleValue target = null;
                target = (org.apache.xmlbeans.SimpleValue)get_store().find_attribute_user(CDSBULKREPLACEMENTGROUPCODE$10);
                if (target == null)
                {
                    target = (org.apache.xmlbeans.SimpleValue)get_default_attribute_value(CDSBULKREPLACEMENTGROUPCODE$10);
                }
                if (target == null)
                {
                    return null;
                }
                return (uk.nhs.nhsia.datastandards.ecds.CDSBulkReplacementGroupCodeType.Enum)target.getEnumValue();
            }
        }
        
        /**
         * Gets (as xml) the "CDSBulkReplacementGroupCode" attribute
         */
        public uk.nhs.nhsia.datastandards.ecds.CDSBulkReplacementGroupCodeType xgetCDSBulkReplacementGroupCode()
        {
            synchronized (monitor())
            {
                check_orphaned();
                uk.nhs.nhsia.datastandards.ecds.CDSBulkReplacementGroupCodeType target = null;
                target = (uk.nhs.nhsia.datastandards.ecds.CDSBulkReplacementGroupCodeType)get_store().find_attribute_user(CDSBULKREPLACEMENTGROUPCODE$10);
                if (target == null)
                {
                    target = (uk.nhs.nhsia.datastandards.ecds.CDSBulkReplacementGroupCodeType)get_default_attribute_value(CDSBULKREPLACEMENTGROUPCODE$10);
                }
                return target;
            }
        }
        
        /**
         * Sets the "CDSBulkReplacementGroupCode" attribute
         */
        public void setCDSBulkReplacementGroupCode(uk.nhs.nhsia.datastandards.ecds.CDSBulkReplacementGroupCodeType.Enum cdsBulkReplacementGroupCode)
        {
            synchronized (monitor())
            {
                check_orphaned();
                org.apache.xmlbeans.SimpleValue target = null;
                target = (org.apache.xmlbeans.SimpleValue)get_store().find_attribute_user(CDSBULKREPLACEMENTGROUPCODE$10);
                if (target == null)
                {
                    target = (org.apache.xmlbeans.SimpleValue)get_store().add_attribute_user(CDSBULKREPLACEMENTGROUPCODE$10);
                }
                target.setEnumValue(cdsBulkReplacementGroupCode);
            }
        }
        
        /**
         * Sets (as xml) the "CDSBulkReplacementGroupCode" attribute
         */
        public void xsetCDSBulkReplacementGroupCode(uk.nhs.nhsia.datastandards.ecds.CDSBulkReplacementGroupCodeType cdsBulkReplacementGroupCode)
        {
            synchronized (monitor())
            {
                check_orphaned();
                uk.nhs.nhsia.datastandards.ecds.CDSBulkReplacementGroupCodeType target = null;
                target = (uk.nhs.nhsia.datastandards.ecds.CDSBulkReplacementGroupCodeType)get_store().find_attribute_user(CDSBULKREPLACEMENTGROUPCODE$10);
                if (target == null)
                {
                    target = (uk.nhs.nhsia.datastandards.ecds.CDSBulkReplacementGroupCodeType)get_store().add_attribute_user(CDSBULKREPLACEMENTGROUPCODE$10);
                }
                target.set(cdsBulkReplacementGroupCode);
            }
        }
        
        /**
         * Gets the "CDSTypeCode" attribute
         */
        public uk.nhs.nhsia.datastandards.ecds.CDSTypeCodeType.Enum getCDSTypeCode()
        {
            synchronized (monitor())
            {
                check_orphaned();
                org.apache.xmlbeans.SimpleValue target = null;
                target = (org.apache.xmlbeans.SimpleValue)get_store().find_attribute_user(CDSTYPECODE$12);
                if (target == null)
                {
                    return null;
                }
                return (uk.nhs.nhsia.datastandards.ecds.CDSTypeCodeType.Enum)target.getEnumValue();
            }
        }
        
        /**
         * Gets (as xml) the "CDSTypeCode" attribute
         */
        public uk.nhs.nhsia.datastandards.ecds.CDSTypeCodeType xgetCDSTypeCode()
        {
            synchronized (monitor())
            {
                check_orphaned();
                uk.nhs.nhsia.datastandards.ecds.CDSTypeCodeType target = null;
                target = (uk.nhs.nhsia.datastandards.ecds.CDSTypeCodeType)get_store().find_attribute_user(CDSTYPECODE$12);
                return target;
            }
        }
        
        /**
         * Sets the "CDSTypeCode" attribute
         */
        public void setCDSTypeCode(uk.nhs.nhsia.datastandards.ecds.CDSTypeCodeType.Enum cdsTypeCode)
        {
            synchronized (monitor())
            {
                check_orphaned();
                org.apache.xmlbeans.SimpleValue target = null;
                target = (org.apache.xmlbeans.SimpleValue)get_store().find_attribute_user(CDSTYPECODE$12);
                if (target == null)
                {
                    target = (org.apache.xmlbeans.SimpleValue)get_store().add_attribute_user(CDSTYPECODE$12);
                }
                target.setEnumValue(cdsTypeCode);
            }
        }
        
        /**
         * Sets (as xml) the "CDSTypeCode" attribute
         */
        public void xsetCDSTypeCode(uk.nhs.nhsia.datastandards.ecds.CDSTypeCodeType cdsTypeCode)
        {
            synchronized (monitor())
            {
                check_orphaned();
                uk.nhs.nhsia.datastandards.ecds.CDSTypeCodeType target = null;
                target = (uk.nhs.nhsia.datastandards.ecds.CDSTypeCodeType)get_store().find_attribute_user(CDSTYPECODE$12);
                if (target == null)
                {
                    target = (uk.nhs.nhsia.datastandards.ecds.CDSTypeCodeType)get_store().add_attribute_user(CDSTYPECODE$12);
                }
                target.set(cdsTypeCode);
            }
        }
    }
}
