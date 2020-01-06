/*
 * XML Type:  ClinicalTreatmentGroupAAndE_Type
 * Namespace: http://www.nhsia.nhs.uk/DataStandards/XMLschema/CDS/ns
 * Java type: uk.nhs.nhsia.datastandards.ecds.ClinicalTreatmentGroupAAndEType
 *
 * Automatically generated - do not modify.
 */
package uk.nhs.nhsia.datastandards.ecds;


/**
 * An XML ClinicalTreatmentGroupAAndE_Type(@http://www.nhsia.nhs.uk/DataStandards/XMLschema/CDS/ns).
 *
 * This is a complex type.
 */
public interface ClinicalTreatmentGroupAAndEType extends org.apache.xmlbeans.XmlObject
{
    public static final org.apache.xmlbeans.SchemaType type = (org.apache.xmlbeans.SchemaType)
        org.apache.xmlbeans.XmlBeans.typeSystemForClassLoader(ClinicalTreatmentGroupAAndEType.class.getClassLoader(), "schemaorg_apache_xmlbeans.system.s30C1180FF47174E0C8A992A2D657328B").resolveHandle("clinicaltreatmentgroupaandetypea82dtype");
    
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
     * Gets the "PrimaryTreatmentGroupAAndE" element
     */
    uk.nhs.nhsia.datastandards.ecds.ClinicalTreatmentGroupAAndEType.PrimaryTreatmentGroupAAndE getPrimaryTreatmentGroupAAndE();
    
    /**
     * Sets the "PrimaryTreatmentGroupAAndE" element
     */
    void setPrimaryTreatmentGroupAAndE(uk.nhs.nhsia.datastandards.ecds.ClinicalTreatmentGroupAAndEType.PrimaryTreatmentGroupAAndE primaryTreatmentGroupAAndE);
    
    /**
     * Appends and returns a new empty "PrimaryTreatmentGroupAAndE" element
     */
    uk.nhs.nhsia.datastandards.ecds.ClinicalTreatmentGroupAAndEType.PrimaryTreatmentGroupAAndE addNewPrimaryTreatmentGroupAAndE();
    
    /**
     * Gets array of all "SecondaryTreatmentGroupAAndE" elements
     */
    uk.nhs.nhsia.datastandards.ecds.ClinicalTreatmentGroupAAndEType.SecondaryTreatmentGroupAAndE[] getSecondaryTreatmentGroupAAndEArray();
    
    /**
     * Gets ith "SecondaryTreatmentGroupAAndE" element
     */
    uk.nhs.nhsia.datastandards.ecds.ClinicalTreatmentGroupAAndEType.SecondaryTreatmentGroupAAndE getSecondaryTreatmentGroupAAndEArray(int i);
    
    /**
     * Returns number of "SecondaryTreatmentGroupAAndE" element
     */
    int sizeOfSecondaryTreatmentGroupAAndEArray();
    
    /**
     * Sets array of all "SecondaryTreatmentGroupAAndE" element
     */
    void setSecondaryTreatmentGroupAAndEArray(uk.nhs.nhsia.datastandards.ecds.ClinicalTreatmentGroupAAndEType.SecondaryTreatmentGroupAAndE[] secondaryTreatmentGroupAAndEArray);
    
    /**
     * Sets ith "SecondaryTreatmentGroupAAndE" element
     */
    void setSecondaryTreatmentGroupAAndEArray(int i, uk.nhs.nhsia.datastandards.ecds.ClinicalTreatmentGroupAAndEType.SecondaryTreatmentGroupAAndE secondaryTreatmentGroupAAndE);
    
    /**
     * Inserts and returns a new empty value (as xml) as the ith "SecondaryTreatmentGroupAAndE" element
     */
    uk.nhs.nhsia.datastandards.ecds.ClinicalTreatmentGroupAAndEType.SecondaryTreatmentGroupAAndE insertNewSecondaryTreatmentGroupAAndE(int i);
    
    /**
     * Appends and returns a new empty value (as xml) as the last "SecondaryTreatmentGroupAAndE" element
     */
    uk.nhs.nhsia.datastandards.ecds.ClinicalTreatmentGroupAAndEType.SecondaryTreatmentGroupAAndE addNewSecondaryTreatmentGroupAAndE();
    
    /**
     * Removes the ith "SecondaryTreatmentGroupAAndE" element
     */
    void removeSecondaryTreatmentGroupAAndE(int i);
    
    /**
     * An XML PrimaryTreatmentGroupAAndE(@http://www.nhsia.nhs.uk/DataStandards/XMLschema/CDS/ns).
     *
     * This is a complex type.
     */
    public interface PrimaryTreatmentGroupAAndE extends org.apache.xmlbeans.XmlObject
    {
        public static final org.apache.xmlbeans.SchemaType type = (org.apache.xmlbeans.SchemaType)
            org.apache.xmlbeans.XmlBeans.typeSystemForClassLoader(PrimaryTreatmentGroupAAndE.class.getClassLoader(), "schemaorg_apache_xmlbeans.system.s30C1180FF47174E0C8A992A2D657328B").resolveHandle("primarytreatmentgroupaande03afelemtype");
        
        /**
         * Gets the "PrimaryTreatment_AAndE" element
         */
        java.lang.String getPrimaryTreatmentAAndE();
        
        /**
         * Gets (as xml) the "PrimaryTreatment_AAndE" element
         */
        uk.nhs.nhsia.datastandards.ecds.AAndETreatmentType xgetPrimaryTreatmentAAndE();
        
        /**
         * Sets the "PrimaryTreatment_AAndE" element
         */
        void setPrimaryTreatmentAAndE(java.lang.String primaryTreatmentAAndE);
        
        /**
         * Sets (as xml) the "PrimaryTreatment_AAndE" element
         */
        void xsetPrimaryTreatmentAAndE(uk.nhs.nhsia.datastandards.ecds.AAndETreatmentType primaryTreatmentAAndE);
        
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
            public static uk.nhs.nhsia.datastandards.ecds.ClinicalTreatmentGroupAAndEType.PrimaryTreatmentGroupAAndE newInstance() {
              return (uk.nhs.nhsia.datastandards.ecds.ClinicalTreatmentGroupAAndEType.PrimaryTreatmentGroupAAndE) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().newInstance( type, null ); }
            
            public static uk.nhs.nhsia.datastandards.ecds.ClinicalTreatmentGroupAAndEType.PrimaryTreatmentGroupAAndE newInstance(org.apache.xmlbeans.XmlOptions options) {
              return (uk.nhs.nhsia.datastandards.ecds.ClinicalTreatmentGroupAAndEType.PrimaryTreatmentGroupAAndE) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().newInstance( type, options ); }
            
            private Factory() { } // No instance of this class allowed
        }
    }
    
    /**
     * An XML SecondaryTreatmentGroupAAndE(@http://www.nhsia.nhs.uk/DataStandards/XMLschema/CDS/ns).
     *
     * This is a complex type.
     */
    public interface SecondaryTreatmentGroupAAndE extends org.apache.xmlbeans.XmlObject
    {
        public static final org.apache.xmlbeans.SchemaType type = (org.apache.xmlbeans.SchemaType)
            org.apache.xmlbeans.XmlBeans.typeSystemForClassLoader(SecondaryTreatmentGroupAAndE.class.getClassLoader(), "schemaorg_apache_xmlbeans.system.s30C1180FF47174E0C8A992A2D657328B").resolveHandle("secondarytreatmentgroupaanded37delemtype");
        
        /**
         * Gets the "SecondaryTreatment_AAndE" element
         */
        java.lang.String getSecondaryTreatmentAAndE();
        
        /**
         * Gets (as xml) the "SecondaryTreatment_AAndE" element
         */
        uk.nhs.nhsia.datastandards.ecds.AAndETreatmentType xgetSecondaryTreatmentAAndE();
        
        /**
         * Sets the "SecondaryTreatment_AAndE" element
         */
        void setSecondaryTreatmentAAndE(java.lang.String secondaryTreatmentAAndE);
        
        /**
         * Sets (as xml) the "SecondaryTreatment_AAndE" element
         */
        void xsetSecondaryTreatmentAAndE(uk.nhs.nhsia.datastandards.ecds.AAndETreatmentType secondaryTreatmentAAndE);
        
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
            public static uk.nhs.nhsia.datastandards.ecds.ClinicalTreatmentGroupAAndEType.SecondaryTreatmentGroupAAndE newInstance() {
              return (uk.nhs.nhsia.datastandards.ecds.ClinicalTreatmentGroupAAndEType.SecondaryTreatmentGroupAAndE) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().newInstance( type, null ); }
            
            public static uk.nhs.nhsia.datastandards.ecds.ClinicalTreatmentGroupAAndEType.SecondaryTreatmentGroupAAndE newInstance(org.apache.xmlbeans.XmlOptions options) {
              return (uk.nhs.nhsia.datastandards.ecds.ClinicalTreatmentGroupAAndEType.SecondaryTreatmentGroupAAndE) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().newInstance( type, options ); }
            
            private Factory() { } // No instance of this class allowed
        }
    }
    
    /**
     * A factory class with static methods for creating instances
     * of this type.
     */
    
    public static final class Factory
    {
        public static uk.nhs.nhsia.datastandards.ecds.ClinicalTreatmentGroupAAndEType newInstance() {
          return (uk.nhs.nhsia.datastandards.ecds.ClinicalTreatmentGroupAAndEType) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().newInstance( type, null ); }
        
        public static uk.nhs.nhsia.datastandards.ecds.ClinicalTreatmentGroupAAndEType newInstance(org.apache.xmlbeans.XmlOptions options) {
          return (uk.nhs.nhsia.datastandards.ecds.ClinicalTreatmentGroupAAndEType) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().newInstance( type, options ); }
        
        /** @param xmlAsString the string value to parse */
        public static uk.nhs.nhsia.datastandards.ecds.ClinicalTreatmentGroupAAndEType parse(java.lang.String xmlAsString) throws org.apache.xmlbeans.XmlException {
          return (uk.nhs.nhsia.datastandards.ecds.ClinicalTreatmentGroupAAndEType) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( xmlAsString, type, null ); }
        
        public static uk.nhs.nhsia.datastandards.ecds.ClinicalTreatmentGroupAAndEType parse(java.lang.String xmlAsString, org.apache.xmlbeans.XmlOptions options) throws org.apache.xmlbeans.XmlException {
          return (uk.nhs.nhsia.datastandards.ecds.ClinicalTreatmentGroupAAndEType) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( xmlAsString, type, options ); }
        
        /** @param file the file from which to load an xml document */
        public static uk.nhs.nhsia.datastandards.ecds.ClinicalTreatmentGroupAAndEType parse(java.io.File file) throws org.apache.xmlbeans.XmlException, java.io.IOException {
          return (uk.nhs.nhsia.datastandards.ecds.ClinicalTreatmentGroupAAndEType) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( file, type, null ); }
        
        public static uk.nhs.nhsia.datastandards.ecds.ClinicalTreatmentGroupAAndEType parse(java.io.File file, org.apache.xmlbeans.XmlOptions options) throws org.apache.xmlbeans.XmlException, java.io.IOException {
          return (uk.nhs.nhsia.datastandards.ecds.ClinicalTreatmentGroupAAndEType) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( file, type, options ); }
        
        public static uk.nhs.nhsia.datastandards.ecds.ClinicalTreatmentGroupAAndEType parse(java.net.URL u) throws org.apache.xmlbeans.XmlException, java.io.IOException {
          return (uk.nhs.nhsia.datastandards.ecds.ClinicalTreatmentGroupAAndEType) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( u, type, null ); }
        
        public static uk.nhs.nhsia.datastandards.ecds.ClinicalTreatmentGroupAAndEType parse(java.net.URL u, org.apache.xmlbeans.XmlOptions options) throws org.apache.xmlbeans.XmlException, java.io.IOException {
          return (uk.nhs.nhsia.datastandards.ecds.ClinicalTreatmentGroupAAndEType) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( u, type, options ); }
        
        public static uk.nhs.nhsia.datastandards.ecds.ClinicalTreatmentGroupAAndEType parse(java.io.InputStream is) throws org.apache.xmlbeans.XmlException, java.io.IOException {
          return (uk.nhs.nhsia.datastandards.ecds.ClinicalTreatmentGroupAAndEType) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( is, type, null ); }
        
        public static uk.nhs.nhsia.datastandards.ecds.ClinicalTreatmentGroupAAndEType parse(java.io.InputStream is, org.apache.xmlbeans.XmlOptions options) throws org.apache.xmlbeans.XmlException, java.io.IOException {
          return (uk.nhs.nhsia.datastandards.ecds.ClinicalTreatmentGroupAAndEType) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( is, type, options ); }
        
        public static uk.nhs.nhsia.datastandards.ecds.ClinicalTreatmentGroupAAndEType parse(java.io.Reader r) throws org.apache.xmlbeans.XmlException, java.io.IOException {
          return (uk.nhs.nhsia.datastandards.ecds.ClinicalTreatmentGroupAAndEType) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( r, type, null ); }
        
        public static uk.nhs.nhsia.datastandards.ecds.ClinicalTreatmentGroupAAndEType parse(java.io.Reader r, org.apache.xmlbeans.XmlOptions options) throws org.apache.xmlbeans.XmlException, java.io.IOException {
          return (uk.nhs.nhsia.datastandards.ecds.ClinicalTreatmentGroupAAndEType) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( r, type, options ); }
        
        public static uk.nhs.nhsia.datastandards.ecds.ClinicalTreatmentGroupAAndEType parse(javax.xml.stream.XMLStreamReader sr) throws org.apache.xmlbeans.XmlException {
          return (uk.nhs.nhsia.datastandards.ecds.ClinicalTreatmentGroupAAndEType) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( sr, type, null ); }
        
        public static uk.nhs.nhsia.datastandards.ecds.ClinicalTreatmentGroupAAndEType parse(javax.xml.stream.XMLStreamReader sr, org.apache.xmlbeans.XmlOptions options) throws org.apache.xmlbeans.XmlException {
          return (uk.nhs.nhsia.datastandards.ecds.ClinicalTreatmentGroupAAndEType) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( sr, type, options ); }
        
        public static uk.nhs.nhsia.datastandards.ecds.ClinicalTreatmentGroupAAndEType parse(org.w3c.dom.Node node) throws org.apache.xmlbeans.XmlException {
          return (uk.nhs.nhsia.datastandards.ecds.ClinicalTreatmentGroupAAndEType) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( node, type, null ); }
        
        public static uk.nhs.nhsia.datastandards.ecds.ClinicalTreatmentGroupAAndEType parse(org.w3c.dom.Node node, org.apache.xmlbeans.XmlOptions options) throws org.apache.xmlbeans.XmlException {
          return (uk.nhs.nhsia.datastandards.ecds.ClinicalTreatmentGroupAAndEType) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( node, type, options ); }
        
        /** @deprecated {@link org.apache.xmlbeans.xml.stream.XMLInputStream} */
        public static uk.nhs.nhsia.datastandards.ecds.ClinicalTreatmentGroupAAndEType parse(org.apache.xmlbeans.xml.stream.XMLInputStream xis) throws org.apache.xmlbeans.XmlException, org.apache.xmlbeans.xml.stream.XMLStreamException {
          return (uk.nhs.nhsia.datastandards.ecds.ClinicalTreatmentGroupAAndEType) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( xis, type, null ); }
        
        /** @deprecated {@link org.apache.xmlbeans.xml.stream.XMLInputStream} */
        public static uk.nhs.nhsia.datastandards.ecds.ClinicalTreatmentGroupAAndEType parse(org.apache.xmlbeans.xml.stream.XMLInputStream xis, org.apache.xmlbeans.XmlOptions options) throws org.apache.xmlbeans.XmlException, org.apache.xmlbeans.xml.stream.XMLStreamException {
          return (uk.nhs.nhsia.datastandards.ecds.ClinicalTreatmentGroupAAndEType) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( xis, type, options ); }
        
        /** @deprecated {@link org.apache.xmlbeans.xml.stream.XMLInputStream} */
        public static org.apache.xmlbeans.xml.stream.XMLInputStream newValidatingXMLInputStream(org.apache.xmlbeans.xml.stream.XMLInputStream xis) throws org.apache.xmlbeans.XmlException, org.apache.xmlbeans.xml.stream.XMLStreamException {
          return org.apache.xmlbeans.XmlBeans.getContextTypeLoader().newValidatingXMLInputStream( xis, type, null ); }
        
        /** @deprecated {@link org.apache.xmlbeans.xml.stream.XMLInputStream} */
        public static org.apache.xmlbeans.xml.stream.XMLInputStream newValidatingXMLInputStream(org.apache.xmlbeans.xml.stream.XMLInputStream xis, org.apache.xmlbeans.XmlOptions options) throws org.apache.xmlbeans.XmlException, org.apache.xmlbeans.xml.stream.XMLStreamException {
          return org.apache.xmlbeans.XmlBeans.getContextTypeLoader().newValidatingXMLInputStream( xis, type, options ); }
        
        private Factory() { } // No instance of this class allowed
    }
}
