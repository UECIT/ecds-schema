/*
 * XML Type:  MedicalStaffTypeSeeingPatient_Type
 * Namespace: http://www.nhsia.nhs.uk/DataStandards/XMLschema/CDS/ns
 * Java type: uk.nhs.nhsia.datastandards.ecds.MedicalStaffTypeSeeingPatientType
 *
 * Automatically generated - do not modify.
 */
package uk.nhs.nhsia.datastandards.ecds;


/**
 * An XML MedicalStaffTypeSeeingPatient_Type(@http://www.nhsia.nhs.uk/DataStandards/XMLschema/CDS/ns).
 *
 * This is an atomic type that is a restriction of uk.nhs.nhsia.datastandards.ecds.MedicalStaffTypeSeeingPatientType.
 */
public interface MedicalStaffTypeSeeingPatientType extends uk.nhs.nhsia.datastandards.ecds.AlphaNumericType
{
    public static final org.apache.xmlbeans.SchemaType type = (org.apache.xmlbeans.SchemaType)
        org.apache.xmlbeans.XmlBeans.typeSystemForClassLoader(MedicalStaffTypeSeeingPatientType.class.getClassLoader(), "schemaorg_apache_xmlbeans.system.s30C1180FF47174E0C8A992A2D657328B").resolveHandle("medicalstafftypeseeingpatienttyped905type");
    
    org.apache.xmlbeans.StringEnumAbstractBase enumValue();
    void set(org.apache.xmlbeans.StringEnumAbstractBase e);
    
    static final Enum X_03 = Enum.forString("03");
    static final Enum X_04 = Enum.forString("04");
    static final Enum X_08 = Enum.forString("08");
    static final Enum X_09 = Enum.forString("09");
    
    static final int INT_X_03 = Enum.INT_X_03;
    static final int INT_X_04 = Enum.INT_X_04;
    static final int INT_X_08 = Enum.INT_X_08;
    static final int INT_X_09 = Enum.INT_X_09;
    
    /**
     * Enumeration value class for uk.nhs.nhsia.datastandards.ecds.MedicalStaffTypeSeeingPatientType.
     * These enum values can be used as follows:
     * <pre>
     * enum.toString(); // returns the string value of the enum
     * enum.intValue(); // returns an int value, useful for switches
     * // e.g., case Enum.INT_X_03
     * Enum.forString(s); // returns the enum value for a string
     * Enum.forInt(i); // returns the enum value for an int
     * </pre>
     * Enumeration objects are immutable singleton objects that
     * can be compared using == object equality. They have no
     * public constructor. See the constants defined within this
     * class for all the valid values.
     */
    static final class Enum extends org.apache.xmlbeans.StringEnumAbstractBase
    {
        /**
         * Returns the enum value for a string, or null if none.
         */
        public static Enum forString(java.lang.String s)
            { return (Enum)table.forString(s); }
        /**
         * Returns the enum value corresponding to an int, or null if none.
         */
        public static Enum forInt(int i)
            { return (Enum)table.forInt(i); }
        
        private Enum(java.lang.String s, int i)
            { super(s, i); }
        
        static final int INT_X_03 = 1;
        static final int INT_X_04 = 2;
        static final int INT_X_08 = 3;
        static final int INT_X_09 = 4;
        
        public static final org.apache.xmlbeans.StringEnumAbstractBase.Table table =
            new org.apache.xmlbeans.StringEnumAbstractBase.Table
        (
            new Enum[]
            {
                new Enum("03", INT_X_03),
                new Enum("04", INT_X_04),
                new Enum("08", INT_X_08),
                new Enum("09", INT_X_09),
            }
        );
        private static final long serialVersionUID = 1L;
        private java.lang.Object readResolve() { return forInt(intValue()); } 
    }
    
    /**
     * A factory class with static methods for creating instances
     * of this type.
     */
    
    public static final class Factory
    {
        public static uk.nhs.nhsia.datastandards.ecds.MedicalStaffTypeSeeingPatientType newValue(java.lang.Object obj) {
          return (uk.nhs.nhsia.datastandards.ecds.MedicalStaffTypeSeeingPatientType) type.newValue( obj ); }
        
        public static uk.nhs.nhsia.datastandards.ecds.MedicalStaffTypeSeeingPatientType newInstance() {
          return (uk.nhs.nhsia.datastandards.ecds.MedicalStaffTypeSeeingPatientType) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().newInstance( type, null ); }
        
        public static uk.nhs.nhsia.datastandards.ecds.MedicalStaffTypeSeeingPatientType newInstance(org.apache.xmlbeans.XmlOptions options) {
          return (uk.nhs.nhsia.datastandards.ecds.MedicalStaffTypeSeeingPatientType) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().newInstance( type, options ); }
        
        /** @param xmlAsString the string value to parse */
        public static uk.nhs.nhsia.datastandards.ecds.MedicalStaffTypeSeeingPatientType parse(java.lang.String xmlAsString) throws org.apache.xmlbeans.XmlException {
          return (uk.nhs.nhsia.datastandards.ecds.MedicalStaffTypeSeeingPatientType) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( xmlAsString, type, null ); }
        
        public static uk.nhs.nhsia.datastandards.ecds.MedicalStaffTypeSeeingPatientType parse(java.lang.String xmlAsString, org.apache.xmlbeans.XmlOptions options) throws org.apache.xmlbeans.XmlException {
          return (uk.nhs.nhsia.datastandards.ecds.MedicalStaffTypeSeeingPatientType) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( xmlAsString, type, options ); }
        
        /** @param file the file from which to load an xml document */
        public static uk.nhs.nhsia.datastandards.ecds.MedicalStaffTypeSeeingPatientType parse(java.io.File file) throws org.apache.xmlbeans.XmlException, java.io.IOException {
          return (uk.nhs.nhsia.datastandards.ecds.MedicalStaffTypeSeeingPatientType) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( file, type, null ); }
        
        public static uk.nhs.nhsia.datastandards.ecds.MedicalStaffTypeSeeingPatientType parse(java.io.File file, org.apache.xmlbeans.XmlOptions options) throws org.apache.xmlbeans.XmlException, java.io.IOException {
          return (uk.nhs.nhsia.datastandards.ecds.MedicalStaffTypeSeeingPatientType) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( file, type, options ); }
        
        public static uk.nhs.nhsia.datastandards.ecds.MedicalStaffTypeSeeingPatientType parse(java.net.URL u) throws org.apache.xmlbeans.XmlException, java.io.IOException {
          return (uk.nhs.nhsia.datastandards.ecds.MedicalStaffTypeSeeingPatientType) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( u, type, null ); }
        
        public static uk.nhs.nhsia.datastandards.ecds.MedicalStaffTypeSeeingPatientType parse(java.net.URL u, org.apache.xmlbeans.XmlOptions options) throws org.apache.xmlbeans.XmlException, java.io.IOException {
          return (uk.nhs.nhsia.datastandards.ecds.MedicalStaffTypeSeeingPatientType) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( u, type, options ); }
        
        public static uk.nhs.nhsia.datastandards.ecds.MedicalStaffTypeSeeingPatientType parse(java.io.InputStream is) throws org.apache.xmlbeans.XmlException, java.io.IOException {
          return (uk.nhs.nhsia.datastandards.ecds.MedicalStaffTypeSeeingPatientType) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( is, type, null ); }
        
        public static uk.nhs.nhsia.datastandards.ecds.MedicalStaffTypeSeeingPatientType parse(java.io.InputStream is, org.apache.xmlbeans.XmlOptions options) throws org.apache.xmlbeans.XmlException, java.io.IOException {
          return (uk.nhs.nhsia.datastandards.ecds.MedicalStaffTypeSeeingPatientType) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( is, type, options ); }
        
        public static uk.nhs.nhsia.datastandards.ecds.MedicalStaffTypeSeeingPatientType parse(java.io.Reader r) throws org.apache.xmlbeans.XmlException, java.io.IOException {
          return (uk.nhs.nhsia.datastandards.ecds.MedicalStaffTypeSeeingPatientType) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( r, type, null ); }
        
        public static uk.nhs.nhsia.datastandards.ecds.MedicalStaffTypeSeeingPatientType parse(java.io.Reader r, org.apache.xmlbeans.XmlOptions options) throws org.apache.xmlbeans.XmlException, java.io.IOException {
          return (uk.nhs.nhsia.datastandards.ecds.MedicalStaffTypeSeeingPatientType) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( r, type, options ); }
        
        public static uk.nhs.nhsia.datastandards.ecds.MedicalStaffTypeSeeingPatientType parse(javax.xml.stream.XMLStreamReader sr) throws org.apache.xmlbeans.XmlException {
          return (uk.nhs.nhsia.datastandards.ecds.MedicalStaffTypeSeeingPatientType) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( sr, type, null ); }
        
        public static uk.nhs.nhsia.datastandards.ecds.MedicalStaffTypeSeeingPatientType parse(javax.xml.stream.XMLStreamReader sr, org.apache.xmlbeans.XmlOptions options) throws org.apache.xmlbeans.XmlException {
          return (uk.nhs.nhsia.datastandards.ecds.MedicalStaffTypeSeeingPatientType) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( sr, type, options ); }
        
        public static uk.nhs.nhsia.datastandards.ecds.MedicalStaffTypeSeeingPatientType parse(org.w3c.dom.Node node) throws org.apache.xmlbeans.XmlException {
          return (uk.nhs.nhsia.datastandards.ecds.MedicalStaffTypeSeeingPatientType) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( node, type, null ); }
        
        public static uk.nhs.nhsia.datastandards.ecds.MedicalStaffTypeSeeingPatientType parse(org.w3c.dom.Node node, org.apache.xmlbeans.XmlOptions options) throws org.apache.xmlbeans.XmlException {
          return (uk.nhs.nhsia.datastandards.ecds.MedicalStaffTypeSeeingPatientType) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( node, type, options ); }
        
        /** @deprecated {@link org.apache.xmlbeans.xml.stream.XMLInputStream} */
        public static uk.nhs.nhsia.datastandards.ecds.MedicalStaffTypeSeeingPatientType parse(org.apache.xmlbeans.xml.stream.XMLInputStream xis) throws org.apache.xmlbeans.XmlException, org.apache.xmlbeans.xml.stream.XMLStreamException {
          return (uk.nhs.nhsia.datastandards.ecds.MedicalStaffTypeSeeingPatientType) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( xis, type, null ); }
        
        /** @deprecated {@link org.apache.xmlbeans.xml.stream.XMLInputStream} */
        public static uk.nhs.nhsia.datastandards.ecds.MedicalStaffTypeSeeingPatientType parse(org.apache.xmlbeans.xml.stream.XMLInputStream xis, org.apache.xmlbeans.XmlOptions options) throws org.apache.xmlbeans.XmlException, org.apache.xmlbeans.xml.stream.XMLStreamException {
          return (uk.nhs.nhsia.datastandards.ecds.MedicalStaffTypeSeeingPatientType) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( xis, type, options ); }
        
        /** @deprecated {@link org.apache.xmlbeans.xml.stream.XMLInputStream} */
        public static org.apache.xmlbeans.xml.stream.XMLInputStream newValidatingXMLInputStream(org.apache.xmlbeans.xml.stream.XMLInputStream xis) throws org.apache.xmlbeans.XmlException, org.apache.xmlbeans.xml.stream.XMLStreamException {
          return org.apache.xmlbeans.XmlBeans.getContextTypeLoader().newValidatingXMLInputStream( xis, type, null ); }
        
        /** @deprecated {@link org.apache.xmlbeans.xml.stream.XMLInputStream} */
        public static org.apache.xmlbeans.xml.stream.XMLInputStream newValidatingXMLInputStream(org.apache.xmlbeans.xml.stream.XMLInputStream xis, org.apache.xmlbeans.XmlOptions options) throws org.apache.xmlbeans.XmlException, org.apache.xmlbeans.xml.stream.XMLStreamException {
          return org.apache.xmlbeans.XmlBeans.getContextTypeLoader().newValidatingXMLInputStream( xis, type, options ); }
        
        private Factory() { } // No instance of this class allowed
    }
}
