/*
 * XML Type:  CDSInterchange_Structure
 * Namespace: http://www.nhsia.nhs.uk/DataStandards/XMLschema/CDS/ns
 * Java type: uk.nhs.nhsia.datastandards.ecds.CDSInterchangeStructure
 *
 * Automatically generated - do not modify.
 */
package uk.nhs.nhsia.datastandards.ecds;


/**
 * An XML CDSInterchange_Structure(@http://www.nhsia.nhs.uk/DataStandards/XMLschema/CDS/ns).
 *
 * This is a complex type.
 */
public interface CDSInterchangeStructure extends org.apache.xmlbeans.XmlObject
{
    public static final org.apache.xmlbeans.SchemaType type = (org.apache.xmlbeans.SchemaType)
        org.apache.xmlbeans.XmlBeans.typeSystemForClassLoader(CDSInterchangeStructure.class.getClassLoader(), "schemaorg_apache_xmlbeans.system.s30C1180FF47174E0C8A992A2D657328B").resolveHandle("cdsinterchangestructure6363type");
    
    /**
     * Gets the "CDSInterchangeHeader" element
     */
    uk.nhs.nhsia.datastandards.ecds.CDSInterchangeHeaderStructure getCDSInterchangeHeader();
    
    /**
     * Sets the "CDSInterchangeHeader" element
     */
    void setCDSInterchangeHeader(uk.nhs.nhsia.datastandards.ecds.CDSInterchangeHeaderStructure cdsInterchangeHeader);
    
    /**
     * Appends and returns a new empty "CDSInterchangeHeader" element
     */
    uk.nhs.nhsia.datastandards.ecds.CDSInterchangeHeaderStructure addNewCDSInterchangeHeader();
    
    /**
     * Gets array of all "CDSNetChange-All-MessageTypes" elements
     */
    uk.nhs.nhsia.datastandards.ecds.CDSInterchangeStructure.CDSNetChangeAllMessageTypes[] getCDSNetChangeAllMessageTypesArray();
    
    /**
     * Gets ith "CDSNetChange-All-MessageTypes" element
     */
    uk.nhs.nhsia.datastandards.ecds.CDSInterchangeStructure.CDSNetChangeAllMessageTypes getCDSNetChangeAllMessageTypesArray(int i);
    
    /**
     * Returns number of "CDSNetChange-All-MessageTypes" element
     */
    int sizeOfCDSNetChangeAllMessageTypesArray();
    
    /**
     * Sets array of all "CDSNetChange-All-MessageTypes" element
     */
    void setCDSNetChangeAllMessageTypesArray(uk.nhs.nhsia.datastandards.ecds.CDSInterchangeStructure.CDSNetChangeAllMessageTypes[] cdsNetChangeAllMessageTypesArray);
    
    /**
     * Sets ith "CDSNetChange-All-MessageTypes" element
     */
    void setCDSNetChangeAllMessageTypesArray(int i, uk.nhs.nhsia.datastandards.ecds.CDSInterchangeStructure.CDSNetChangeAllMessageTypes cdsNetChangeAllMessageTypes);
    
    /**
     * Inserts and returns a new empty value (as xml) as the ith "CDSNetChange-All-MessageTypes" element
     */
    uk.nhs.nhsia.datastandards.ecds.CDSInterchangeStructure.CDSNetChangeAllMessageTypes insertNewCDSNetChangeAllMessageTypes(int i);
    
    /**
     * Appends and returns a new empty value (as xml) as the last "CDSNetChange-All-MessageTypes" element
     */
    uk.nhs.nhsia.datastandards.ecds.CDSInterchangeStructure.CDSNetChangeAllMessageTypes addNewCDSNetChangeAllMessageTypes();
    
    /**
     * Removes the ith "CDSNetChange-All-MessageTypes" element
     */
    void removeCDSNetChangeAllMessageTypes(int i);
    
    /**
     * Gets array of all "CDSBulkGroup-160-Message" elements
     */
    uk.nhs.nhsia.datastandards.ecds.CDSInterchangeStructure.CDSBulkGroup160Message[] getCDSBulkGroup160MessageArray();
    
    /**
     * Gets ith "CDSBulkGroup-160-Message" element
     */
    uk.nhs.nhsia.datastandards.ecds.CDSInterchangeStructure.CDSBulkGroup160Message getCDSBulkGroup160MessageArray(int i);
    
    /**
     * Returns number of "CDSBulkGroup-160-Message" element
     */
    int sizeOfCDSBulkGroup160MessageArray();
    
    /**
     * Sets array of all "CDSBulkGroup-160-Message" element
     */
    void setCDSBulkGroup160MessageArray(uk.nhs.nhsia.datastandards.ecds.CDSInterchangeStructure.CDSBulkGroup160Message[] cdsBulkGroup160MessageArray);
    
    /**
     * Sets ith "CDSBulkGroup-160-Message" element
     */
    void setCDSBulkGroup160MessageArray(int i, uk.nhs.nhsia.datastandards.ecds.CDSInterchangeStructure.CDSBulkGroup160Message cdsBulkGroup160Message);
    
    /**
     * Inserts and returns a new empty value (as xml) as the ith "CDSBulkGroup-160-Message" element
     */
    uk.nhs.nhsia.datastandards.ecds.CDSInterchangeStructure.CDSBulkGroup160Message insertNewCDSBulkGroup160Message(int i);
    
    /**
     * Appends and returns a new empty value (as xml) as the last "CDSBulkGroup-160-Message" element
     */
    uk.nhs.nhsia.datastandards.ecds.CDSInterchangeStructure.CDSBulkGroup160Message addNewCDSBulkGroup160Message();
    
    /**
     * Removes the ith "CDSBulkGroup-160-Message" element
     */
    void removeCDSBulkGroup160Message(int i);
    
    /**
     * Gets the "CDSInterchangeTrailer" element
     */
    uk.nhs.nhsia.datastandards.ecds.CDSInterchangeTrailerStructure getCDSInterchangeTrailer();
    
    /**
     * Sets the "CDSInterchangeTrailer" element
     */
    void setCDSInterchangeTrailer(uk.nhs.nhsia.datastandards.ecds.CDSInterchangeTrailerStructure cdsInterchangeTrailer);
    
    /**
     * Appends and returns a new empty "CDSInterchangeTrailer" element
     */
    uk.nhs.nhsia.datastandards.ecds.CDSInterchangeTrailerStructure addNewCDSInterchangeTrailer();
    
    /**
     * An XML CDSNetChange-All-MessageTypes(@http://www.nhsia.nhs.uk/DataStandards/XMLschema/CDS/ns).
     *
     * This is a complex type.
     */
    public interface CDSNetChangeAllMessageTypes extends org.apache.xmlbeans.XmlObject
    {
        public static final org.apache.xmlbeans.SchemaType type = (org.apache.xmlbeans.SchemaType)
            org.apache.xmlbeans.XmlBeans.typeSystemForClassLoader(CDSNetChangeAllMessageTypes.class.getClassLoader(), "schemaorg_apache_xmlbeans.system.s30C1180FF47174E0C8A992A2D657328B").resolveHandle("cdsnetchangeallmessagetypesec3felemtype");
        
        /**
         * Gets the "CDSMessageHeader" element
         */
        uk.nhs.nhsia.datastandards.ecds.CDSMessageHeaderStructure getCDSMessageHeader();
        
        /**
         * Sets the "CDSMessageHeader" element
         */
        void setCDSMessageHeader(uk.nhs.nhsia.datastandards.ecds.CDSMessageHeaderStructure cdsMessageHeader);
        
        /**
         * Appends and returns a new empty "CDSMessageHeader" element
         */
        uk.nhs.nhsia.datastandards.ecds.CDSMessageHeaderStructure addNewCDSMessageHeader();
        
        /**
         * Gets the "CDSTransactionHeader_NetChange" element
         */
        uk.nhs.nhsia.datastandards.ecds.CDSTransactionHeaderNetChangeStructure getCDSTransactionHeaderNetChange();
        
        /**
         * Sets the "CDSTransactionHeader_NetChange" element
         */
        void setCDSTransactionHeaderNetChange(uk.nhs.nhsia.datastandards.ecds.CDSTransactionHeaderNetChangeStructure cdsTransactionHeaderNetChange);
        
        /**
         * Appends and returns a new empty "CDSTransactionHeader_NetChange" element
         */
        uk.nhs.nhsia.datastandards.ecds.CDSTransactionHeaderNetChangeStructure addNewCDSTransactionHeaderNetChange();
        
        /**
         * Gets the "EmergencyCare" element
         */
        uk.nhs.nhsia.datastandards.ecds.EmergencyCareStucture getEmergencyCare();
        
        /**
         * True if has "EmergencyCare" element
         */
        boolean isSetEmergencyCare();
        
        /**
         * Sets the "EmergencyCare" element
         */
        void setEmergencyCare(uk.nhs.nhsia.datastandards.ecds.EmergencyCareStucture emergencyCare);
        
        /**
         * Appends and returns a new empty "EmergencyCare" element
         */
        uk.nhs.nhsia.datastandards.ecds.EmergencyCareStucture addNewEmergencyCare();
        
        /**
         * Unsets the "EmergencyCare" element
         */
        void unsetEmergencyCare();
        
        /**
         * Gets the "DeleteTransaction" element
         */
        uk.nhs.nhsia.datastandards.ecds.CDSInterchangeStructure.CDSNetChangeAllMessageTypes.DeleteTransaction getDeleteTransaction();
        
        /**
         * True if has "DeleteTransaction" element
         */
        boolean isSetDeleteTransaction();
        
        /**
         * Sets the "DeleteTransaction" element
         */
        void setDeleteTransaction(uk.nhs.nhsia.datastandards.ecds.CDSInterchangeStructure.CDSNetChangeAllMessageTypes.DeleteTransaction deleteTransaction);
        
        /**
         * Appends and returns a new empty "DeleteTransaction" element
         */
        uk.nhs.nhsia.datastandards.ecds.CDSInterchangeStructure.CDSNetChangeAllMessageTypes.DeleteTransaction addNewDeleteTransaction();
        
        /**
         * Unsets the "DeleteTransaction" element
         */
        void unsetDeleteTransaction();
        
        /**
         * Gets the "CDSMessageTrailer" element
         */
        uk.nhs.nhsia.datastandards.ecds.CDSMessageTrailerStructure getCDSMessageTrailer();
        
        /**
         * Sets the "CDSMessageTrailer" element
         */
        void setCDSMessageTrailer(uk.nhs.nhsia.datastandards.ecds.CDSMessageTrailerStructure cdsMessageTrailer);
        
        /**
         * Appends and returns a new empty "CDSMessageTrailer" element
         */
        uk.nhs.nhsia.datastandards.ecds.CDSMessageTrailerStructure addNewCDSMessageTrailer();
        
        /**
         * Gets the "CDSProtocolIdentifierCode" attribute
         */
        uk.nhs.nhsia.datastandards.ecds.CDSProtocolIdentifierCodeType.Enum getCDSProtocolIdentifierCode();
        
        /**
         * Gets (as xml) the "CDSProtocolIdentifierCode" attribute
         */
        uk.nhs.nhsia.datastandards.ecds.CDSProtocolIdentifierCodeType xgetCDSProtocolIdentifierCode();
        
        /**
         * Sets the "CDSProtocolIdentifierCode" attribute
         */
        void setCDSProtocolIdentifierCode(uk.nhs.nhsia.datastandards.ecds.CDSProtocolIdentifierCodeType.Enum cdsProtocolIdentifierCode);
        
        /**
         * Sets (as xml) the "CDSProtocolIdentifierCode" attribute
         */
        void xsetCDSProtocolIdentifierCode(uk.nhs.nhsia.datastandards.ecds.CDSProtocolIdentifierCodeType cdsProtocolIdentifierCode);
        
        /**
         * Gets the "CDSTypeCode" attribute
         */
        uk.nhs.nhsia.datastandards.ecds.CDSTypeCodeType.Enum getCDSTypeCode();
        
        /**
         * Gets (as xml) the "CDSTypeCode" attribute
         */
        uk.nhs.nhsia.datastandards.ecds.CDSTypeCodeType xgetCDSTypeCode();
        
        /**
         * Sets the "CDSTypeCode" attribute
         */
        void setCDSTypeCode(uk.nhs.nhsia.datastandards.ecds.CDSTypeCodeType.Enum cdsTypeCode);
        
        /**
         * Sets (as xml) the "CDSTypeCode" attribute
         */
        void xsetCDSTypeCode(uk.nhs.nhsia.datastandards.ecds.CDSTypeCodeType cdsTypeCode);
        
        /**
         * An XML DeleteTransaction(@http://www.nhsia.nhs.uk/DataStandards/XMLschema/CDS/ns).
         *
         * This is a complex type.
         */
        public interface DeleteTransaction extends org.apache.xmlbeans.XmlObject
        {
            public static final org.apache.xmlbeans.SchemaType type = (org.apache.xmlbeans.SchemaType)
                org.apache.xmlbeans.XmlBeans.typeSystemForClassLoader(DeleteTransaction.class.getClassLoader(), "schemaorg_apache_xmlbeans.system.s30C1180FF47174E0C8A992A2D657328B").resolveHandle("deletetransaction7cfeelemtype");
            
            /**
             * A factory class with static methods for creating instances
             * of this type.
             */
            
            public static final class Factory
            {
                public static uk.nhs.nhsia.datastandards.ecds.CDSInterchangeStructure.CDSNetChangeAllMessageTypes.DeleteTransaction newInstance() {
                  return (uk.nhs.nhsia.datastandards.ecds.CDSInterchangeStructure.CDSNetChangeAllMessageTypes.DeleteTransaction) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().newInstance( type, null ); }
                
                public static uk.nhs.nhsia.datastandards.ecds.CDSInterchangeStructure.CDSNetChangeAllMessageTypes.DeleteTransaction newInstance(org.apache.xmlbeans.XmlOptions options) {
                  return (uk.nhs.nhsia.datastandards.ecds.CDSInterchangeStructure.CDSNetChangeAllMessageTypes.DeleteTransaction) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().newInstance( type, options ); }
                
                private Factory() { } // No instance of this class allowed
            }
        }
        
        /**
         * A factory class with static methods for creating instances
         * of this type.
         */
        
        public static final class Factory
        {
            public static uk.nhs.nhsia.datastandards.ecds.CDSInterchangeStructure.CDSNetChangeAllMessageTypes newInstance() {
              return (uk.nhs.nhsia.datastandards.ecds.CDSInterchangeStructure.CDSNetChangeAllMessageTypes) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().newInstance( type, null ); }
            
            public static uk.nhs.nhsia.datastandards.ecds.CDSInterchangeStructure.CDSNetChangeAllMessageTypes newInstance(org.apache.xmlbeans.XmlOptions options) {
              return (uk.nhs.nhsia.datastandards.ecds.CDSInterchangeStructure.CDSNetChangeAllMessageTypes) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().newInstance( type, options ); }
            
            private Factory() { } // No instance of this class allowed
        }
    }
    
    /**
     * An XML CDSBulkGroup-160-Message(@http://www.nhsia.nhs.uk/DataStandards/XMLschema/CDS/ns).
     *
     * This is a complex type.
     */
    public interface CDSBulkGroup160Message extends org.apache.xmlbeans.XmlObject
    {
        public static final org.apache.xmlbeans.SchemaType type = (org.apache.xmlbeans.SchemaType)
            org.apache.xmlbeans.XmlBeans.typeSystemForClassLoader(CDSBulkGroup160Message.class.getClassLoader(), "schemaorg_apache_xmlbeans.system.s30C1180FF47174E0C8A992A2D657328B").resolveHandle("cdsbulkgroup160message5ed2elemtype");
        
        /**
         * Gets the "CDSMessageHeader" element
         */
        uk.nhs.nhsia.datastandards.ecds.CDSMessageHeaderStructure getCDSMessageHeader();
        
        /**
         * Sets the "CDSMessageHeader" element
         */
        void setCDSMessageHeader(uk.nhs.nhsia.datastandards.ecds.CDSMessageHeaderStructure cdsMessageHeader);
        
        /**
         * Appends and returns a new empty "CDSMessageHeader" element
         */
        uk.nhs.nhsia.datastandards.ecds.CDSMessageHeaderStructure addNewCDSMessageHeader();
        
        /**
         * Gets the "CDSTransactionHeader_BulkUpdate" element
         */
        uk.nhs.nhsia.datastandards.ecds.CDSTransactionHeaderBulkUpdateStructure getCDSTransactionHeaderBulkUpdate();
        
        /**
         * Sets the "CDSTransactionHeader_BulkUpdate" element
         */
        void setCDSTransactionHeaderBulkUpdate(uk.nhs.nhsia.datastandards.ecds.CDSTransactionHeaderBulkUpdateStructure cdsTransactionHeaderBulkUpdate);
        
        /**
         * Appends and returns a new empty "CDSTransactionHeader_BulkUpdate" element
         */
        uk.nhs.nhsia.datastandards.ecds.CDSTransactionHeaderBulkUpdateStructure addNewCDSTransactionHeaderBulkUpdate();
        
        /**
         * Gets the "EmergencyCare" element
         */
        uk.nhs.nhsia.datastandards.ecds.EmergencyCareStucture getEmergencyCare();
        
        /**
         * Sets the "EmergencyCare" element
         */
        void setEmergencyCare(uk.nhs.nhsia.datastandards.ecds.EmergencyCareStucture emergencyCare);
        
        /**
         * Appends and returns a new empty "EmergencyCare" element
         */
        uk.nhs.nhsia.datastandards.ecds.EmergencyCareStucture addNewEmergencyCare();
        
        /**
         * Gets the "CDSMessageTrailer" element
         */
        uk.nhs.nhsia.datastandards.ecds.CDSMessageTrailerStructure getCDSMessageTrailer();
        
        /**
         * Sets the "CDSMessageTrailer" element
         */
        void setCDSMessageTrailer(uk.nhs.nhsia.datastandards.ecds.CDSMessageTrailerStructure cdsMessageTrailer);
        
        /**
         * Appends and returns a new empty "CDSMessageTrailer" element
         */
        uk.nhs.nhsia.datastandards.ecds.CDSMessageTrailerStructure addNewCDSMessageTrailer();
        
        /**
         * Gets the "CDSProtocolIdentifierCode" attribute
         */
        uk.nhs.nhsia.datastandards.ecds.CDSProtocolIdentifierCodeType.Enum getCDSProtocolIdentifierCode();
        
        /**
         * Gets (as xml) the "CDSProtocolIdentifierCode" attribute
         */
        uk.nhs.nhsia.datastandards.ecds.CDSProtocolIdentifierCodeType xgetCDSProtocolIdentifierCode();
        
        /**
         * Sets the "CDSProtocolIdentifierCode" attribute
         */
        void setCDSProtocolIdentifierCode(uk.nhs.nhsia.datastandards.ecds.CDSProtocolIdentifierCodeType.Enum cdsProtocolIdentifierCode);
        
        /**
         * Sets (as xml) the "CDSProtocolIdentifierCode" attribute
         */
        void xsetCDSProtocolIdentifierCode(uk.nhs.nhsia.datastandards.ecds.CDSProtocolIdentifierCodeType cdsProtocolIdentifierCode);
        
        /**
         * Gets the "CDSBulkReplacementGroupCode" attribute
         */
        uk.nhs.nhsia.datastandards.ecds.CDSBulkReplacementGroupCodeType.Enum getCDSBulkReplacementGroupCode();
        
        /**
         * Gets (as xml) the "CDSBulkReplacementGroupCode" attribute
         */
        uk.nhs.nhsia.datastandards.ecds.CDSBulkReplacementGroupCodeType xgetCDSBulkReplacementGroupCode();
        
        /**
         * Sets the "CDSBulkReplacementGroupCode" attribute
         */
        void setCDSBulkReplacementGroupCode(uk.nhs.nhsia.datastandards.ecds.CDSBulkReplacementGroupCodeType.Enum cdsBulkReplacementGroupCode);
        
        /**
         * Sets (as xml) the "CDSBulkReplacementGroupCode" attribute
         */
        void xsetCDSBulkReplacementGroupCode(uk.nhs.nhsia.datastandards.ecds.CDSBulkReplacementGroupCodeType cdsBulkReplacementGroupCode);
        
        /**
         * Gets the "CDSTypeCode" attribute
         */
        uk.nhs.nhsia.datastandards.ecds.CDSTypeCodeType.Enum getCDSTypeCode();
        
        /**
         * Gets (as xml) the "CDSTypeCode" attribute
         */
        uk.nhs.nhsia.datastandards.ecds.CDSTypeCodeType xgetCDSTypeCode();
        
        /**
         * Sets the "CDSTypeCode" attribute
         */
        void setCDSTypeCode(uk.nhs.nhsia.datastandards.ecds.CDSTypeCodeType.Enum cdsTypeCode);
        
        /**
         * Sets (as xml) the "CDSTypeCode" attribute
         */
        void xsetCDSTypeCode(uk.nhs.nhsia.datastandards.ecds.CDSTypeCodeType cdsTypeCode);
        
        /**
         * A factory class with static methods for creating instances
         * of this type.
         */
        
        public static final class Factory
        {
            public static uk.nhs.nhsia.datastandards.ecds.CDSInterchangeStructure.CDSBulkGroup160Message newInstance() {
              return (uk.nhs.nhsia.datastandards.ecds.CDSInterchangeStructure.CDSBulkGroup160Message) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().newInstance( type, null ); }
            
            public static uk.nhs.nhsia.datastandards.ecds.CDSInterchangeStructure.CDSBulkGroup160Message newInstance(org.apache.xmlbeans.XmlOptions options) {
              return (uk.nhs.nhsia.datastandards.ecds.CDSInterchangeStructure.CDSBulkGroup160Message) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().newInstance( type, options ); }
            
            private Factory() { } // No instance of this class allowed
        }
    }
    
    /**
     * A factory class with static methods for creating instances
     * of this type.
     */
    
    public static final class Factory
    {
        public static uk.nhs.nhsia.datastandards.ecds.CDSInterchangeStructure newInstance() {
          return (uk.nhs.nhsia.datastandards.ecds.CDSInterchangeStructure) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().newInstance( type, null ); }
        
        public static uk.nhs.nhsia.datastandards.ecds.CDSInterchangeStructure newInstance(org.apache.xmlbeans.XmlOptions options) {
          return (uk.nhs.nhsia.datastandards.ecds.CDSInterchangeStructure) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().newInstance( type, options ); }
        
        /** @param xmlAsString the string value to parse */
        public static uk.nhs.nhsia.datastandards.ecds.CDSInterchangeStructure parse(java.lang.String xmlAsString) throws org.apache.xmlbeans.XmlException {
          return (uk.nhs.nhsia.datastandards.ecds.CDSInterchangeStructure) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( xmlAsString, type, null ); }
        
        public static uk.nhs.nhsia.datastandards.ecds.CDSInterchangeStructure parse(java.lang.String xmlAsString, org.apache.xmlbeans.XmlOptions options) throws org.apache.xmlbeans.XmlException {
          return (uk.nhs.nhsia.datastandards.ecds.CDSInterchangeStructure) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( xmlAsString, type, options ); }
        
        /** @param file the file from which to load an xml document */
        public static uk.nhs.nhsia.datastandards.ecds.CDSInterchangeStructure parse(java.io.File file) throws org.apache.xmlbeans.XmlException, java.io.IOException {
          return (uk.nhs.nhsia.datastandards.ecds.CDSInterchangeStructure) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( file, type, null ); }
        
        public static uk.nhs.nhsia.datastandards.ecds.CDSInterchangeStructure parse(java.io.File file, org.apache.xmlbeans.XmlOptions options) throws org.apache.xmlbeans.XmlException, java.io.IOException {
          return (uk.nhs.nhsia.datastandards.ecds.CDSInterchangeStructure) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( file, type, options ); }
        
        public static uk.nhs.nhsia.datastandards.ecds.CDSInterchangeStructure parse(java.net.URL u) throws org.apache.xmlbeans.XmlException, java.io.IOException {
          return (uk.nhs.nhsia.datastandards.ecds.CDSInterchangeStructure) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( u, type, null ); }
        
        public static uk.nhs.nhsia.datastandards.ecds.CDSInterchangeStructure parse(java.net.URL u, org.apache.xmlbeans.XmlOptions options) throws org.apache.xmlbeans.XmlException, java.io.IOException {
          return (uk.nhs.nhsia.datastandards.ecds.CDSInterchangeStructure) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( u, type, options ); }
        
        public static uk.nhs.nhsia.datastandards.ecds.CDSInterchangeStructure parse(java.io.InputStream is) throws org.apache.xmlbeans.XmlException, java.io.IOException {
          return (uk.nhs.nhsia.datastandards.ecds.CDSInterchangeStructure) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( is, type, null ); }
        
        public static uk.nhs.nhsia.datastandards.ecds.CDSInterchangeStructure parse(java.io.InputStream is, org.apache.xmlbeans.XmlOptions options) throws org.apache.xmlbeans.XmlException, java.io.IOException {
          return (uk.nhs.nhsia.datastandards.ecds.CDSInterchangeStructure) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( is, type, options ); }
        
        public static uk.nhs.nhsia.datastandards.ecds.CDSInterchangeStructure parse(java.io.Reader r) throws org.apache.xmlbeans.XmlException, java.io.IOException {
          return (uk.nhs.nhsia.datastandards.ecds.CDSInterchangeStructure) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( r, type, null ); }
        
        public static uk.nhs.nhsia.datastandards.ecds.CDSInterchangeStructure parse(java.io.Reader r, org.apache.xmlbeans.XmlOptions options) throws org.apache.xmlbeans.XmlException, java.io.IOException {
          return (uk.nhs.nhsia.datastandards.ecds.CDSInterchangeStructure) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( r, type, options ); }
        
        public static uk.nhs.nhsia.datastandards.ecds.CDSInterchangeStructure parse(javax.xml.stream.XMLStreamReader sr) throws org.apache.xmlbeans.XmlException {
          return (uk.nhs.nhsia.datastandards.ecds.CDSInterchangeStructure) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( sr, type, null ); }
        
        public static uk.nhs.nhsia.datastandards.ecds.CDSInterchangeStructure parse(javax.xml.stream.XMLStreamReader sr, org.apache.xmlbeans.XmlOptions options) throws org.apache.xmlbeans.XmlException {
          return (uk.nhs.nhsia.datastandards.ecds.CDSInterchangeStructure) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( sr, type, options ); }
        
        public static uk.nhs.nhsia.datastandards.ecds.CDSInterchangeStructure parse(org.w3c.dom.Node node) throws org.apache.xmlbeans.XmlException {
          return (uk.nhs.nhsia.datastandards.ecds.CDSInterchangeStructure) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( node, type, null ); }
        
        public static uk.nhs.nhsia.datastandards.ecds.CDSInterchangeStructure parse(org.w3c.dom.Node node, org.apache.xmlbeans.XmlOptions options) throws org.apache.xmlbeans.XmlException {
          return (uk.nhs.nhsia.datastandards.ecds.CDSInterchangeStructure) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( node, type, options ); }
        
        /** @deprecated {@link org.apache.xmlbeans.xml.stream.XMLInputStream} */
        public static uk.nhs.nhsia.datastandards.ecds.CDSInterchangeStructure parse(org.apache.xmlbeans.xml.stream.XMLInputStream xis) throws org.apache.xmlbeans.XmlException, org.apache.xmlbeans.xml.stream.XMLStreamException {
          return (uk.nhs.nhsia.datastandards.ecds.CDSInterchangeStructure) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( xis, type, null ); }
        
        /** @deprecated {@link org.apache.xmlbeans.xml.stream.XMLInputStream} */
        public static uk.nhs.nhsia.datastandards.ecds.CDSInterchangeStructure parse(org.apache.xmlbeans.xml.stream.XMLInputStream xis, org.apache.xmlbeans.XmlOptions options) throws org.apache.xmlbeans.XmlException, org.apache.xmlbeans.xml.stream.XMLStreamException {
          return (uk.nhs.nhsia.datastandards.ecds.CDSInterchangeStructure) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( xis, type, options ); }
        
        /** @deprecated {@link org.apache.xmlbeans.xml.stream.XMLInputStream} */
        public static org.apache.xmlbeans.xml.stream.XMLInputStream newValidatingXMLInputStream(org.apache.xmlbeans.xml.stream.XMLInputStream xis) throws org.apache.xmlbeans.XmlException, org.apache.xmlbeans.xml.stream.XMLStreamException {
          return org.apache.xmlbeans.XmlBeans.getContextTypeLoader().newValidatingXMLInputStream( xis, type, null ); }
        
        /** @deprecated {@link org.apache.xmlbeans.xml.stream.XMLInputStream} */
        public static org.apache.xmlbeans.xml.stream.XMLInputStream newValidatingXMLInputStream(org.apache.xmlbeans.xml.stream.XMLInputStream xis, org.apache.xmlbeans.XmlOptions options) throws org.apache.xmlbeans.XmlException, org.apache.xmlbeans.xml.stream.XMLStreamException {
          return org.apache.xmlbeans.XmlBeans.getContextTypeLoader().newValidatingXMLInputStream( xis, type, options ); }
        
        private Factory() { } // No instance of this class allowed
    }
}
