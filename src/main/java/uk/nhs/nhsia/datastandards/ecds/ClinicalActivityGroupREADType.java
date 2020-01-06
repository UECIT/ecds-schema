/*
 * XML Type:  ClinicalActivityGroupREAD_Type
 * Namespace: http://www.nhsia.nhs.uk/DataStandards/XMLschema/CDS/ns
 * Java type: uk.nhs.nhsia.datastandards.ecds.ClinicalActivityGroupREADType
 *
 * Automatically generated - do not modify.
 */
package uk.nhs.nhsia.datastandards.ecds;


/**
 * An XML ClinicalActivityGroupREAD_Type(@http://www.nhsia.nhs.uk/DataStandards/XMLschema/CDS/ns).
 *
 * This is a complex type.
 */
public interface ClinicalActivityGroupREADType extends org.apache.xmlbeans.XmlObject
{
    public static final org.apache.xmlbeans.SchemaType type = (org.apache.xmlbeans.SchemaType)
        org.apache.xmlbeans.XmlBeans.typeSystemForClassLoader(ClinicalActivityGroupREADType.class.getClassLoader(), "schemaorg_apache_xmlbeans.system.s30C1180FF47174E0C8A992A2D657328B").resolveHandle("clinicalactivitygroupreadtypee9cbtype");
    
    /**
     * Gets the "ProcedureSchemeInUse" element
     */
    uk.nhs.nhsia.datastandards.ecds.ProcedureSchemeInUseType.Enum getProcedureSchemeInUse();
    
    /**
     * Gets (as xml) the "ProcedureSchemeInUse" element
     */
    uk.nhs.nhsia.datastandards.ecds.ProcedureSchemeInUseType xgetProcedureSchemeInUse();
    
    /**
     * Sets the "ProcedureSchemeInUse" element
     */
    void setProcedureSchemeInUse(uk.nhs.nhsia.datastandards.ecds.ProcedureSchemeInUseType.Enum procedureSchemeInUse);
    
    /**
     * Sets (as xml) the "ProcedureSchemeInUse" element
     */
    void xsetProcedureSchemeInUse(uk.nhs.nhsia.datastandards.ecds.ProcedureSchemeInUseType procedureSchemeInUse);
    
    /**
     * Gets the "PrimaryProcedureGroupREAD" element
     */
    uk.nhs.nhsia.datastandards.ecds.ClinicalActivityGroupREADType.PrimaryProcedureGroupREAD getPrimaryProcedureGroupREAD();
    
    /**
     * Sets the "PrimaryProcedureGroupREAD" element
     */
    void setPrimaryProcedureGroupREAD(uk.nhs.nhsia.datastandards.ecds.ClinicalActivityGroupREADType.PrimaryProcedureGroupREAD primaryProcedureGroupREAD);
    
    /**
     * Appends and returns a new empty "PrimaryProcedureGroupREAD" element
     */
    uk.nhs.nhsia.datastandards.ecds.ClinicalActivityGroupREADType.PrimaryProcedureGroupREAD addNewPrimaryProcedureGroupREAD();
    
    /**
     * Gets array of all "SecondaryProcedureGroupREAD" elements
     */
    uk.nhs.nhsia.datastandards.ecds.ClinicalActivityGroupREADType.SecondaryProcedureGroupREAD[] getSecondaryProcedureGroupREADArray();
    
    /**
     * Gets ith "SecondaryProcedureGroupREAD" element
     */
    uk.nhs.nhsia.datastandards.ecds.ClinicalActivityGroupREADType.SecondaryProcedureGroupREAD getSecondaryProcedureGroupREADArray(int i);
    
    /**
     * Returns number of "SecondaryProcedureGroupREAD" element
     */
    int sizeOfSecondaryProcedureGroupREADArray();
    
    /**
     * Sets array of all "SecondaryProcedureGroupREAD" element
     */
    void setSecondaryProcedureGroupREADArray(uk.nhs.nhsia.datastandards.ecds.ClinicalActivityGroupREADType.SecondaryProcedureGroupREAD[] secondaryProcedureGroupREADArray);
    
    /**
     * Sets ith "SecondaryProcedureGroupREAD" element
     */
    void setSecondaryProcedureGroupREADArray(int i, uk.nhs.nhsia.datastandards.ecds.ClinicalActivityGroupREADType.SecondaryProcedureGroupREAD secondaryProcedureGroupREAD);
    
    /**
     * Inserts and returns a new empty value (as xml) as the ith "SecondaryProcedureGroupREAD" element
     */
    uk.nhs.nhsia.datastandards.ecds.ClinicalActivityGroupREADType.SecondaryProcedureGroupREAD insertNewSecondaryProcedureGroupREAD(int i);
    
    /**
     * Appends and returns a new empty value (as xml) as the last "SecondaryProcedureGroupREAD" element
     */
    uk.nhs.nhsia.datastandards.ecds.ClinicalActivityGroupREADType.SecondaryProcedureGroupREAD addNewSecondaryProcedureGroupREAD();
    
    /**
     * Removes the ith "SecondaryProcedureGroupREAD" element
     */
    void removeSecondaryProcedureGroupREAD(int i);
    
    /**
     * An XML PrimaryProcedureGroupREAD(@http://www.nhsia.nhs.uk/DataStandards/XMLschema/CDS/ns).
     *
     * This is a complex type.
     */
    public interface PrimaryProcedureGroupREAD extends org.apache.xmlbeans.XmlObject
    {
        public static final org.apache.xmlbeans.SchemaType type = (org.apache.xmlbeans.SchemaType)
            org.apache.xmlbeans.XmlBeans.typeSystemForClassLoader(PrimaryProcedureGroupREAD.class.getClassLoader(), "schemaorg_apache_xmlbeans.system.s30C1180FF47174E0C8A992A2D657328B").resolveHandle("primaryproceduregroupread64bbelemtype");
        
        /**
         * Gets the "PrimaryProcedure_READ" element
         */
        java.lang.String getPrimaryProcedureREAD();
        
        /**
         * Gets (as xml) the "PrimaryProcedure_READ" element
         */
        uk.nhs.nhsia.datastandards.ecds.PrimaryProcedureREADType xgetPrimaryProcedureREAD();
        
        /**
         * Sets the "PrimaryProcedure_READ" element
         */
        void setPrimaryProcedureREAD(java.lang.String primaryProcedureREAD);
        
        /**
         * Sets (as xml) the "PrimaryProcedure_READ" element
         */
        void xsetPrimaryProcedureREAD(uk.nhs.nhsia.datastandards.ecds.PrimaryProcedureREADType primaryProcedureREAD);
        
        /**
         * Gets the "ProcedureDate" element
         */
        java.util.Calendar getProcedureDate();
        
        /**
         * Gets (as xml) the "ProcedureDate" element
         */
        uk.nhs.nhsia.datastandards.ecds.ProcedureDateType xgetProcedureDate();
        
        /**
         * True if has "ProcedureDate" element
         */
        boolean isSetProcedureDate();
        
        /**
         * Sets the "ProcedureDate" element
         */
        void setProcedureDate(java.util.Calendar procedureDate);
        
        /**
         * Sets (as xml) the "ProcedureDate" element
         */
        void xsetProcedureDate(uk.nhs.nhsia.datastandards.ecds.ProcedureDateType procedureDate);
        
        /**
         * Unsets the "ProcedureDate" element
         */
        void unsetProcedureDate();
        
        /**
         * A factory class with static methods for creating instances
         * of this type.
         */
        
        public static final class Factory
        {
            public static uk.nhs.nhsia.datastandards.ecds.ClinicalActivityGroupREADType.PrimaryProcedureGroupREAD newInstance() {
              return (uk.nhs.nhsia.datastandards.ecds.ClinicalActivityGroupREADType.PrimaryProcedureGroupREAD) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().newInstance( type, null ); }
            
            public static uk.nhs.nhsia.datastandards.ecds.ClinicalActivityGroupREADType.PrimaryProcedureGroupREAD newInstance(org.apache.xmlbeans.XmlOptions options) {
              return (uk.nhs.nhsia.datastandards.ecds.ClinicalActivityGroupREADType.PrimaryProcedureGroupREAD) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().newInstance( type, options ); }
            
            private Factory() { } // No instance of this class allowed
        }
    }
    
    /**
     * An XML SecondaryProcedureGroupREAD(@http://www.nhsia.nhs.uk/DataStandards/XMLschema/CDS/ns).
     *
     * This is a complex type.
     */
    public interface SecondaryProcedureGroupREAD extends org.apache.xmlbeans.XmlObject
    {
        public static final org.apache.xmlbeans.SchemaType type = (org.apache.xmlbeans.SchemaType)
            org.apache.xmlbeans.XmlBeans.typeSystemForClassLoader(SecondaryProcedureGroupREAD.class.getClassLoader(), "schemaorg_apache_xmlbeans.system.s30C1180FF47174E0C8A992A2D657328B").resolveHandle("secondaryproceduregroupread57adelemtype");
        
        /**
         * Gets the "SecondaryProcedure_READ" element
         */
        java.lang.String getSecondaryProcedureREAD();
        
        /**
         * Gets (as xml) the "SecondaryProcedure_READ" element
         */
        uk.nhs.nhsia.datastandards.ecds.ProcedureREADType xgetSecondaryProcedureREAD();
        
        /**
         * Sets the "SecondaryProcedure_READ" element
         */
        void setSecondaryProcedureREAD(java.lang.String secondaryProcedureREAD);
        
        /**
         * Sets (as xml) the "SecondaryProcedure_READ" element
         */
        void xsetSecondaryProcedureREAD(uk.nhs.nhsia.datastandards.ecds.ProcedureREADType secondaryProcedureREAD);
        
        /**
         * Gets the "ProcedureDate" element
         */
        java.util.Calendar getProcedureDate();
        
        /**
         * Gets (as xml) the "ProcedureDate" element
         */
        uk.nhs.nhsia.datastandards.ecds.ProcedureDateType xgetProcedureDate();
        
        /**
         * True if has "ProcedureDate" element
         */
        boolean isSetProcedureDate();
        
        /**
         * Sets the "ProcedureDate" element
         */
        void setProcedureDate(java.util.Calendar procedureDate);
        
        /**
         * Sets (as xml) the "ProcedureDate" element
         */
        void xsetProcedureDate(uk.nhs.nhsia.datastandards.ecds.ProcedureDateType procedureDate);
        
        /**
         * Unsets the "ProcedureDate" element
         */
        void unsetProcedureDate();
        
        /**
         * A factory class with static methods for creating instances
         * of this type.
         */
        
        public static final class Factory
        {
            public static uk.nhs.nhsia.datastandards.ecds.ClinicalActivityGroupREADType.SecondaryProcedureGroupREAD newInstance() {
              return (uk.nhs.nhsia.datastandards.ecds.ClinicalActivityGroupREADType.SecondaryProcedureGroupREAD) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().newInstance( type, null ); }
            
            public static uk.nhs.nhsia.datastandards.ecds.ClinicalActivityGroupREADType.SecondaryProcedureGroupREAD newInstance(org.apache.xmlbeans.XmlOptions options) {
              return (uk.nhs.nhsia.datastandards.ecds.ClinicalActivityGroupREADType.SecondaryProcedureGroupREAD) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().newInstance( type, options ); }
            
            private Factory() { } // No instance of this class allowed
        }
    }
    
    /**
     * A factory class with static methods for creating instances
     * of this type.
     */
    
    public static final class Factory
    {
        public static uk.nhs.nhsia.datastandards.ecds.ClinicalActivityGroupREADType newInstance() {
          return (uk.nhs.nhsia.datastandards.ecds.ClinicalActivityGroupREADType) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().newInstance( type, null ); }
        
        public static uk.nhs.nhsia.datastandards.ecds.ClinicalActivityGroupREADType newInstance(org.apache.xmlbeans.XmlOptions options) {
          return (uk.nhs.nhsia.datastandards.ecds.ClinicalActivityGroupREADType) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().newInstance( type, options ); }
        
        /** @param xmlAsString the string value to parse */
        public static uk.nhs.nhsia.datastandards.ecds.ClinicalActivityGroupREADType parse(java.lang.String xmlAsString) throws org.apache.xmlbeans.XmlException {
          return (uk.nhs.nhsia.datastandards.ecds.ClinicalActivityGroupREADType) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( xmlAsString, type, null ); }
        
        public static uk.nhs.nhsia.datastandards.ecds.ClinicalActivityGroupREADType parse(java.lang.String xmlAsString, org.apache.xmlbeans.XmlOptions options) throws org.apache.xmlbeans.XmlException {
          return (uk.nhs.nhsia.datastandards.ecds.ClinicalActivityGroupREADType) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( xmlAsString, type, options ); }
        
        /** @param file the file from which to load an xml document */
        public static uk.nhs.nhsia.datastandards.ecds.ClinicalActivityGroupREADType parse(java.io.File file) throws org.apache.xmlbeans.XmlException, java.io.IOException {
          return (uk.nhs.nhsia.datastandards.ecds.ClinicalActivityGroupREADType) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( file, type, null ); }
        
        public static uk.nhs.nhsia.datastandards.ecds.ClinicalActivityGroupREADType parse(java.io.File file, org.apache.xmlbeans.XmlOptions options) throws org.apache.xmlbeans.XmlException, java.io.IOException {
          return (uk.nhs.nhsia.datastandards.ecds.ClinicalActivityGroupREADType) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( file, type, options ); }
        
        public static uk.nhs.nhsia.datastandards.ecds.ClinicalActivityGroupREADType parse(java.net.URL u) throws org.apache.xmlbeans.XmlException, java.io.IOException {
          return (uk.nhs.nhsia.datastandards.ecds.ClinicalActivityGroupREADType) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( u, type, null ); }
        
        public static uk.nhs.nhsia.datastandards.ecds.ClinicalActivityGroupREADType parse(java.net.URL u, org.apache.xmlbeans.XmlOptions options) throws org.apache.xmlbeans.XmlException, java.io.IOException {
          return (uk.nhs.nhsia.datastandards.ecds.ClinicalActivityGroupREADType) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( u, type, options ); }
        
        public static uk.nhs.nhsia.datastandards.ecds.ClinicalActivityGroupREADType parse(java.io.InputStream is) throws org.apache.xmlbeans.XmlException, java.io.IOException {
          return (uk.nhs.nhsia.datastandards.ecds.ClinicalActivityGroupREADType) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( is, type, null ); }
        
        public static uk.nhs.nhsia.datastandards.ecds.ClinicalActivityGroupREADType parse(java.io.InputStream is, org.apache.xmlbeans.XmlOptions options) throws org.apache.xmlbeans.XmlException, java.io.IOException {
          return (uk.nhs.nhsia.datastandards.ecds.ClinicalActivityGroupREADType) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( is, type, options ); }
        
        public static uk.nhs.nhsia.datastandards.ecds.ClinicalActivityGroupREADType parse(java.io.Reader r) throws org.apache.xmlbeans.XmlException, java.io.IOException {
          return (uk.nhs.nhsia.datastandards.ecds.ClinicalActivityGroupREADType) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( r, type, null ); }
        
        public static uk.nhs.nhsia.datastandards.ecds.ClinicalActivityGroupREADType parse(java.io.Reader r, org.apache.xmlbeans.XmlOptions options) throws org.apache.xmlbeans.XmlException, java.io.IOException {
          return (uk.nhs.nhsia.datastandards.ecds.ClinicalActivityGroupREADType) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( r, type, options ); }
        
        public static uk.nhs.nhsia.datastandards.ecds.ClinicalActivityGroupREADType parse(javax.xml.stream.XMLStreamReader sr) throws org.apache.xmlbeans.XmlException {
          return (uk.nhs.nhsia.datastandards.ecds.ClinicalActivityGroupREADType) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( sr, type, null ); }
        
        public static uk.nhs.nhsia.datastandards.ecds.ClinicalActivityGroupREADType parse(javax.xml.stream.XMLStreamReader sr, org.apache.xmlbeans.XmlOptions options) throws org.apache.xmlbeans.XmlException {
          return (uk.nhs.nhsia.datastandards.ecds.ClinicalActivityGroupREADType) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( sr, type, options ); }
        
        public static uk.nhs.nhsia.datastandards.ecds.ClinicalActivityGroupREADType parse(org.w3c.dom.Node node) throws org.apache.xmlbeans.XmlException {
          return (uk.nhs.nhsia.datastandards.ecds.ClinicalActivityGroupREADType) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( node, type, null ); }
        
        public static uk.nhs.nhsia.datastandards.ecds.ClinicalActivityGroupREADType parse(org.w3c.dom.Node node, org.apache.xmlbeans.XmlOptions options) throws org.apache.xmlbeans.XmlException {
          return (uk.nhs.nhsia.datastandards.ecds.ClinicalActivityGroupREADType) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( node, type, options ); }
        
        /** @deprecated {@link org.apache.xmlbeans.xml.stream.XMLInputStream} */
        public static uk.nhs.nhsia.datastandards.ecds.ClinicalActivityGroupREADType parse(org.apache.xmlbeans.xml.stream.XMLInputStream xis) throws org.apache.xmlbeans.XmlException, org.apache.xmlbeans.xml.stream.XMLStreamException {
          return (uk.nhs.nhsia.datastandards.ecds.ClinicalActivityGroupREADType) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( xis, type, null ); }
        
        /** @deprecated {@link org.apache.xmlbeans.xml.stream.XMLInputStream} */
        public static uk.nhs.nhsia.datastandards.ecds.ClinicalActivityGroupREADType parse(org.apache.xmlbeans.xml.stream.XMLInputStream xis, org.apache.xmlbeans.XmlOptions options) throws org.apache.xmlbeans.XmlException, org.apache.xmlbeans.xml.stream.XMLStreamException {
          return (uk.nhs.nhsia.datastandards.ecds.ClinicalActivityGroupREADType) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( xis, type, options ); }
        
        /** @deprecated {@link org.apache.xmlbeans.xml.stream.XMLInputStream} */
        public static org.apache.xmlbeans.xml.stream.XMLInputStream newValidatingXMLInputStream(org.apache.xmlbeans.xml.stream.XMLInputStream xis) throws org.apache.xmlbeans.XmlException, org.apache.xmlbeans.xml.stream.XMLStreamException {
          return org.apache.xmlbeans.XmlBeans.getContextTypeLoader().newValidatingXMLInputStream( xis, type, null ); }
        
        /** @deprecated {@link org.apache.xmlbeans.xml.stream.XMLInputStream} */
        public static org.apache.xmlbeans.xml.stream.XMLInputStream newValidatingXMLInputStream(org.apache.xmlbeans.xml.stream.XMLInputStream xis, org.apache.xmlbeans.XmlOptions options) throws org.apache.xmlbeans.XmlException, org.apache.xmlbeans.xml.stream.XMLStreamException {
          return org.apache.xmlbeans.XmlBeans.getContextTypeLoader().newValidatingXMLInputStream( xis, type, options ); }
        
        private Factory() { } // No instance of this class allowed
    }
}
