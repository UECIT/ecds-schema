/*
 * XML Type:  ClinicalActivityGroupOPCS_Type
 * Namespace: http://www.nhsia.nhs.uk/DataStandards/XMLschema/CDS/ns
 * Java type: uk.nhs.nhsia.datastandards.ecds.ClinicalActivityGroupOPCSType
 *
 * Automatically generated - do not modify.
 */
package uk.nhs.nhsia.datastandards.ecds;


/**
 * An XML ClinicalActivityGroupOPCS_Type(@http://www.nhsia.nhs.uk/DataStandards/XMLschema/CDS/ns).
 *
 * This is a complex type.
 */
public interface ClinicalActivityGroupOPCSType extends org.apache.xmlbeans.XmlObject
{
    public static final org.apache.xmlbeans.SchemaType type = (org.apache.xmlbeans.SchemaType)
        org.apache.xmlbeans.XmlBeans.typeSystemForClassLoader(ClinicalActivityGroupOPCSType.class.getClassLoader(), "schemaorg_apache_xmlbeans.system.s30C1180FF47174E0C8A992A2D657328B").resolveHandle("clinicalactivitygroupopcstyped3c6type");
    
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
     * Gets the "PrimaryProcedureGroupOPCS" element
     */
    uk.nhs.nhsia.datastandards.ecds.ClinicalActivityGroupOPCSType.PrimaryProcedureGroupOPCS getPrimaryProcedureGroupOPCS();
    
    /**
     * Sets the "PrimaryProcedureGroupOPCS" element
     */
    void setPrimaryProcedureGroupOPCS(uk.nhs.nhsia.datastandards.ecds.ClinicalActivityGroupOPCSType.PrimaryProcedureGroupOPCS primaryProcedureGroupOPCS);
    
    /**
     * Appends and returns a new empty "PrimaryProcedureGroupOPCS" element
     */
    uk.nhs.nhsia.datastandards.ecds.ClinicalActivityGroupOPCSType.PrimaryProcedureGroupOPCS addNewPrimaryProcedureGroupOPCS();
    
    /**
     * Gets array of all "SecondaryProcedureGroupOPCS" elements
     */
    uk.nhs.nhsia.datastandards.ecds.ClinicalActivityGroupOPCSType.SecondaryProcedureGroupOPCS[] getSecondaryProcedureGroupOPCSArray();
    
    /**
     * Gets ith "SecondaryProcedureGroupOPCS" element
     */
    uk.nhs.nhsia.datastandards.ecds.ClinicalActivityGroupOPCSType.SecondaryProcedureGroupOPCS getSecondaryProcedureGroupOPCSArray(int i);
    
    /**
     * Returns number of "SecondaryProcedureGroupOPCS" element
     */
    int sizeOfSecondaryProcedureGroupOPCSArray();
    
    /**
     * Sets array of all "SecondaryProcedureGroupOPCS" element
     */
    void setSecondaryProcedureGroupOPCSArray(uk.nhs.nhsia.datastandards.ecds.ClinicalActivityGroupOPCSType.SecondaryProcedureGroupOPCS[] secondaryProcedureGroupOPCSArray);
    
    /**
     * Sets ith "SecondaryProcedureGroupOPCS" element
     */
    void setSecondaryProcedureGroupOPCSArray(int i, uk.nhs.nhsia.datastandards.ecds.ClinicalActivityGroupOPCSType.SecondaryProcedureGroupOPCS secondaryProcedureGroupOPCS);
    
    /**
     * Inserts and returns a new empty value (as xml) as the ith "SecondaryProcedureGroupOPCS" element
     */
    uk.nhs.nhsia.datastandards.ecds.ClinicalActivityGroupOPCSType.SecondaryProcedureGroupOPCS insertNewSecondaryProcedureGroupOPCS(int i);
    
    /**
     * Appends and returns a new empty value (as xml) as the last "SecondaryProcedureGroupOPCS" element
     */
    uk.nhs.nhsia.datastandards.ecds.ClinicalActivityGroupOPCSType.SecondaryProcedureGroupOPCS addNewSecondaryProcedureGroupOPCS();
    
    /**
     * Removes the ith "SecondaryProcedureGroupOPCS" element
     */
    void removeSecondaryProcedureGroupOPCS(int i);
    
    /**
     * An XML PrimaryProcedureGroupOPCS(@http://www.nhsia.nhs.uk/DataStandards/XMLschema/CDS/ns).
     *
     * This is a complex type.
     */
    public interface PrimaryProcedureGroupOPCS extends org.apache.xmlbeans.XmlObject
    {
        public static final org.apache.xmlbeans.SchemaType type = (org.apache.xmlbeans.SchemaType)
            org.apache.xmlbeans.XmlBeans.typeSystemForClassLoader(PrimaryProcedureGroupOPCS.class.getClassLoader(), "schemaorg_apache_xmlbeans.system.s30C1180FF47174E0C8A992A2D657328B").resolveHandle("primaryproceduregroupopcsc231elemtype");
        
        /**
         * Gets the "PrimaryProcedure_OPCS" element
         */
        java.lang.String getPrimaryProcedureOPCS();
        
        /**
         * Gets (as xml) the "PrimaryProcedure_OPCS" element
         */
        uk.nhs.nhsia.datastandards.ecds.PrimaryProcedureOPCSType xgetPrimaryProcedureOPCS();
        
        /**
         * Sets the "PrimaryProcedure_OPCS" element
         */
        void setPrimaryProcedureOPCS(java.lang.String primaryProcedureOPCS);
        
        /**
         * Sets (as xml) the "PrimaryProcedure_OPCS" element
         */
        void xsetPrimaryProcedureOPCS(uk.nhs.nhsia.datastandards.ecds.PrimaryProcedureOPCSType primaryProcedureOPCS);
        
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
         * Gets the "MainOperatingHCP" element
         */
        uk.nhs.nhsia.datastandards.ecds.ProfessionalsInvolvedStructure getMainOperatingHCP();
        
        /**
         * True if has "MainOperatingHCP" element
         */
        boolean isSetMainOperatingHCP();
        
        /**
         * Sets the "MainOperatingHCP" element
         */
        void setMainOperatingHCP(uk.nhs.nhsia.datastandards.ecds.ProfessionalsInvolvedStructure mainOperatingHCP);
        
        /**
         * Appends and returns a new empty "MainOperatingHCP" element
         */
        uk.nhs.nhsia.datastandards.ecds.ProfessionalsInvolvedStructure addNewMainOperatingHCP();
        
        /**
         * Unsets the "MainOperatingHCP" element
         */
        void unsetMainOperatingHCP();
        
        /**
         * Gets the "ResponsibleAnaesthetist" element
         */
        uk.nhs.nhsia.datastandards.ecds.ProfessionalsInvolvedStructure getResponsibleAnaesthetist();
        
        /**
         * True if has "ResponsibleAnaesthetist" element
         */
        boolean isSetResponsibleAnaesthetist();
        
        /**
         * Sets the "ResponsibleAnaesthetist" element
         */
        void setResponsibleAnaesthetist(uk.nhs.nhsia.datastandards.ecds.ProfessionalsInvolvedStructure responsibleAnaesthetist);
        
        /**
         * Appends and returns a new empty "ResponsibleAnaesthetist" element
         */
        uk.nhs.nhsia.datastandards.ecds.ProfessionalsInvolvedStructure addNewResponsibleAnaesthetist();
        
        /**
         * Unsets the "ResponsibleAnaesthetist" element
         */
        void unsetResponsibleAnaesthetist();
        
        /**
         * A factory class with static methods for creating instances
         * of this type.
         */
        
        public static final class Factory
        {
            public static uk.nhs.nhsia.datastandards.ecds.ClinicalActivityGroupOPCSType.PrimaryProcedureGroupOPCS newInstance() {
              return (uk.nhs.nhsia.datastandards.ecds.ClinicalActivityGroupOPCSType.PrimaryProcedureGroupOPCS) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().newInstance( type, null ); }
            
            public static uk.nhs.nhsia.datastandards.ecds.ClinicalActivityGroupOPCSType.PrimaryProcedureGroupOPCS newInstance(org.apache.xmlbeans.XmlOptions options) {
              return (uk.nhs.nhsia.datastandards.ecds.ClinicalActivityGroupOPCSType.PrimaryProcedureGroupOPCS) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().newInstance( type, options ); }
            
            private Factory() { } // No instance of this class allowed
        }
    }
    
    /**
     * An XML SecondaryProcedureGroupOPCS(@http://www.nhsia.nhs.uk/DataStandards/XMLschema/CDS/ns).
     *
     * This is a complex type.
     */
    public interface SecondaryProcedureGroupOPCS extends org.apache.xmlbeans.XmlObject
    {
        public static final org.apache.xmlbeans.SchemaType type = (org.apache.xmlbeans.SchemaType)
            org.apache.xmlbeans.XmlBeans.typeSystemForClassLoader(SecondaryProcedureGroupOPCS.class.getClassLoader(), "schemaorg_apache_xmlbeans.system.s30C1180FF47174E0C8A992A2D657328B").resolveHandle("secondaryproceduregroupopcsb523elemtype");
        
        /**
         * Gets the "SecondaryProcedure_OPCS" element
         */
        java.lang.String getSecondaryProcedureOPCS();
        
        /**
         * Gets (as xml) the "SecondaryProcedure_OPCS" element
         */
        uk.nhs.nhsia.datastandards.ecds.ProcedureOPCSType xgetSecondaryProcedureOPCS();
        
        /**
         * Sets the "SecondaryProcedure_OPCS" element
         */
        void setSecondaryProcedureOPCS(java.lang.String secondaryProcedureOPCS);
        
        /**
         * Sets (as xml) the "SecondaryProcedure_OPCS" element
         */
        void xsetSecondaryProcedureOPCS(uk.nhs.nhsia.datastandards.ecds.ProcedureOPCSType secondaryProcedureOPCS);
        
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
         * Gets the "MainOperatingHCP" element
         */
        uk.nhs.nhsia.datastandards.ecds.ProfessionalsInvolvedStructure getMainOperatingHCP();
        
        /**
         * True if has "MainOperatingHCP" element
         */
        boolean isSetMainOperatingHCP();
        
        /**
         * Sets the "MainOperatingHCP" element
         */
        void setMainOperatingHCP(uk.nhs.nhsia.datastandards.ecds.ProfessionalsInvolvedStructure mainOperatingHCP);
        
        /**
         * Appends and returns a new empty "MainOperatingHCP" element
         */
        uk.nhs.nhsia.datastandards.ecds.ProfessionalsInvolvedStructure addNewMainOperatingHCP();
        
        /**
         * Unsets the "MainOperatingHCP" element
         */
        void unsetMainOperatingHCP();
        
        /**
         * Gets the "ResponsibleAnaesthetist" element
         */
        uk.nhs.nhsia.datastandards.ecds.ProfessionalsInvolvedStructure getResponsibleAnaesthetist();
        
        /**
         * True if has "ResponsibleAnaesthetist" element
         */
        boolean isSetResponsibleAnaesthetist();
        
        /**
         * Sets the "ResponsibleAnaesthetist" element
         */
        void setResponsibleAnaesthetist(uk.nhs.nhsia.datastandards.ecds.ProfessionalsInvolvedStructure responsibleAnaesthetist);
        
        /**
         * Appends and returns a new empty "ResponsibleAnaesthetist" element
         */
        uk.nhs.nhsia.datastandards.ecds.ProfessionalsInvolvedStructure addNewResponsibleAnaesthetist();
        
        /**
         * Unsets the "ResponsibleAnaesthetist" element
         */
        void unsetResponsibleAnaesthetist();
        
        /**
         * A factory class with static methods for creating instances
         * of this type.
         */
        
        public static final class Factory
        {
            public static uk.nhs.nhsia.datastandards.ecds.ClinicalActivityGroupOPCSType.SecondaryProcedureGroupOPCS newInstance() {
              return (uk.nhs.nhsia.datastandards.ecds.ClinicalActivityGroupOPCSType.SecondaryProcedureGroupOPCS) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().newInstance( type, null ); }
            
            public static uk.nhs.nhsia.datastandards.ecds.ClinicalActivityGroupOPCSType.SecondaryProcedureGroupOPCS newInstance(org.apache.xmlbeans.XmlOptions options) {
              return (uk.nhs.nhsia.datastandards.ecds.ClinicalActivityGroupOPCSType.SecondaryProcedureGroupOPCS) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().newInstance( type, options ); }
            
            private Factory() { } // No instance of this class allowed
        }
    }
    
    /**
     * A factory class with static methods for creating instances
     * of this type.
     */
    
    public static final class Factory
    {
        public static uk.nhs.nhsia.datastandards.ecds.ClinicalActivityGroupOPCSType newInstance() {
          return (uk.nhs.nhsia.datastandards.ecds.ClinicalActivityGroupOPCSType) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().newInstance( type, null ); }
        
        public static uk.nhs.nhsia.datastandards.ecds.ClinicalActivityGroupOPCSType newInstance(org.apache.xmlbeans.XmlOptions options) {
          return (uk.nhs.nhsia.datastandards.ecds.ClinicalActivityGroupOPCSType) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().newInstance( type, options ); }
        
        /** @param xmlAsString the string value to parse */
        public static uk.nhs.nhsia.datastandards.ecds.ClinicalActivityGroupOPCSType parse(java.lang.String xmlAsString) throws org.apache.xmlbeans.XmlException {
          return (uk.nhs.nhsia.datastandards.ecds.ClinicalActivityGroupOPCSType) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( xmlAsString, type, null ); }
        
        public static uk.nhs.nhsia.datastandards.ecds.ClinicalActivityGroupOPCSType parse(java.lang.String xmlAsString, org.apache.xmlbeans.XmlOptions options) throws org.apache.xmlbeans.XmlException {
          return (uk.nhs.nhsia.datastandards.ecds.ClinicalActivityGroupOPCSType) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( xmlAsString, type, options ); }
        
        /** @param file the file from which to load an xml document */
        public static uk.nhs.nhsia.datastandards.ecds.ClinicalActivityGroupOPCSType parse(java.io.File file) throws org.apache.xmlbeans.XmlException, java.io.IOException {
          return (uk.nhs.nhsia.datastandards.ecds.ClinicalActivityGroupOPCSType) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( file, type, null ); }
        
        public static uk.nhs.nhsia.datastandards.ecds.ClinicalActivityGroupOPCSType parse(java.io.File file, org.apache.xmlbeans.XmlOptions options) throws org.apache.xmlbeans.XmlException, java.io.IOException {
          return (uk.nhs.nhsia.datastandards.ecds.ClinicalActivityGroupOPCSType) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( file, type, options ); }
        
        public static uk.nhs.nhsia.datastandards.ecds.ClinicalActivityGroupOPCSType parse(java.net.URL u) throws org.apache.xmlbeans.XmlException, java.io.IOException {
          return (uk.nhs.nhsia.datastandards.ecds.ClinicalActivityGroupOPCSType) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( u, type, null ); }
        
        public static uk.nhs.nhsia.datastandards.ecds.ClinicalActivityGroupOPCSType parse(java.net.URL u, org.apache.xmlbeans.XmlOptions options) throws org.apache.xmlbeans.XmlException, java.io.IOException {
          return (uk.nhs.nhsia.datastandards.ecds.ClinicalActivityGroupOPCSType) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( u, type, options ); }
        
        public static uk.nhs.nhsia.datastandards.ecds.ClinicalActivityGroupOPCSType parse(java.io.InputStream is) throws org.apache.xmlbeans.XmlException, java.io.IOException {
          return (uk.nhs.nhsia.datastandards.ecds.ClinicalActivityGroupOPCSType) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( is, type, null ); }
        
        public static uk.nhs.nhsia.datastandards.ecds.ClinicalActivityGroupOPCSType parse(java.io.InputStream is, org.apache.xmlbeans.XmlOptions options) throws org.apache.xmlbeans.XmlException, java.io.IOException {
          return (uk.nhs.nhsia.datastandards.ecds.ClinicalActivityGroupOPCSType) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( is, type, options ); }
        
        public static uk.nhs.nhsia.datastandards.ecds.ClinicalActivityGroupOPCSType parse(java.io.Reader r) throws org.apache.xmlbeans.XmlException, java.io.IOException {
          return (uk.nhs.nhsia.datastandards.ecds.ClinicalActivityGroupOPCSType) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( r, type, null ); }
        
        public static uk.nhs.nhsia.datastandards.ecds.ClinicalActivityGroupOPCSType parse(java.io.Reader r, org.apache.xmlbeans.XmlOptions options) throws org.apache.xmlbeans.XmlException, java.io.IOException {
          return (uk.nhs.nhsia.datastandards.ecds.ClinicalActivityGroupOPCSType) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( r, type, options ); }
        
        public static uk.nhs.nhsia.datastandards.ecds.ClinicalActivityGroupOPCSType parse(javax.xml.stream.XMLStreamReader sr) throws org.apache.xmlbeans.XmlException {
          return (uk.nhs.nhsia.datastandards.ecds.ClinicalActivityGroupOPCSType) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( sr, type, null ); }
        
        public static uk.nhs.nhsia.datastandards.ecds.ClinicalActivityGroupOPCSType parse(javax.xml.stream.XMLStreamReader sr, org.apache.xmlbeans.XmlOptions options) throws org.apache.xmlbeans.XmlException {
          return (uk.nhs.nhsia.datastandards.ecds.ClinicalActivityGroupOPCSType) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( sr, type, options ); }
        
        public static uk.nhs.nhsia.datastandards.ecds.ClinicalActivityGroupOPCSType parse(org.w3c.dom.Node node) throws org.apache.xmlbeans.XmlException {
          return (uk.nhs.nhsia.datastandards.ecds.ClinicalActivityGroupOPCSType) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( node, type, null ); }
        
        public static uk.nhs.nhsia.datastandards.ecds.ClinicalActivityGroupOPCSType parse(org.w3c.dom.Node node, org.apache.xmlbeans.XmlOptions options) throws org.apache.xmlbeans.XmlException {
          return (uk.nhs.nhsia.datastandards.ecds.ClinicalActivityGroupOPCSType) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( node, type, options ); }
        
        /** @deprecated {@link org.apache.xmlbeans.xml.stream.XMLInputStream} */
        public static uk.nhs.nhsia.datastandards.ecds.ClinicalActivityGroupOPCSType parse(org.apache.xmlbeans.xml.stream.XMLInputStream xis) throws org.apache.xmlbeans.XmlException, org.apache.xmlbeans.xml.stream.XMLStreamException {
          return (uk.nhs.nhsia.datastandards.ecds.ClinicalActivityGroupOPCSType) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( xis, type, null ); }
        
        /** @deprecated {@link org.apache.xmlbeans.xml.stream.XMLInputStream} */
        public static uk.nhs.nhsia.datastandards.ecds.ClinicalActivityGroupOPCSType parse(org.apache.xmlbeans.xml.stream.XMLInputStream xis, org.apache.xmlbeans.XmlOptions options) throws org.apache.xmlbeans.XmlException, org.apache.xmlbeans.xml.stream.XMLStreamException {
          return (uk.nhs.nhsia.datastandards.ecds.ClinicalActivityGroupOPCSType) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( xis, type, options ); }
        
        /** @deprecated {@link org.apache.xmlbeans.xml.stream.XMLInputStream} */
        public static org.apache.xmlbeans.xml.stream.XMLInputStream newValidatingXMLInputStream(org.apache.xmlbeans.xml.stream.XMLInputStream xis) throws org.apache.xmlbeans.XmlException, org.apache.xmlbeans.xml.stream.XMLStreamException {
          return org.apache.xmlbeans.XmlBeans.getContextTypeLoader().newValidatingXMLInputStream( xis, type, null ); }
        
        /** @deprecated {@link org.apache.xmlbeans.xml.stream.XMLInputStream} */
        public static org.apache.xmlbeans.xml.stream.XMLInputStream newValidatingXMLInputStream(org.apache.xmlbeans.xml.stream.XMLInputStream xis, org.apache.xmlbeans.XmlOptions options) throws org.apache.xmlbeans.XmlException, org.apache.xmlbeans.xml.stream.XMLStreamException {
          return org.apache.xmlbeans.XmlBeans.getContextTypeLoader().newValidatingXMLInputStream( xis, type, options ); }
        
        private Factory() { } // No instance of this class allowed
    }
}
