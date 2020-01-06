/*
 * XML Type:  IntendedClinicalCareIntensityCode_Type
 * Namespace: http://www.nhsia.nhs.uk/DataStandards/XMLschema/CDS/ns
 * Java type: uk.nhs.nhsia.datastandards.ecds.IntendedClinicalCareIntensityCodeType
 *
 * Automatically generated - do not modify.
 */
package uk.nhs.nhsia.datastandards.ecds;


/**
 * An XML IntendedClinicalCareIntensityCode_Type(@http://www.nhsia.nhs.uk/DataStandards/XMLschema/CDS/ns).
 *
 * This is an atomic type that is a restriction of uk.nhs.nhsia.datastandards.ecds.IntendedClinicalCareIntensityCodeType.
 */
public interface IntendedClinicalCareIntensityCodeType extends uk.nhs.nhsia.datastandards.ecds.AlphaNumericType
{
    public static final org.apache.xmlbeans.SchemaType type = (org.apache.xmlbeans.SchemaType)
        org.apache.xmlbeans.XmlBeans.typeSystemForClassLoader(IntendedClinicalCareIntensityCodeType.class.getClassLoader(), "schemaorg_apache_xmlbeans.system.s30C1180FF47174E0C8A992A2D657328B").resolveHandle("intendedclinicalcareintensitycodetype6ac9type");
    
    org.apache.xmlbeans.StringEnumAbstractBase enumValue();
    void set(org.apache.xmlbeans.StringEnumAbstractBase e);
    
    static final Enum X_11 = Enum.forString("11");
    static final Enum X_12 = Enum.forString("12");
    static final Enum X_13 = Enum.forString("13");
    static final Enum X_21 = Enum.forString("21");
    static final Enum X_22 = Enum.forString("22");
    static final Enum X_31 = Enum.forString("31");
    static final Enum X_32 = Enum.forString("32");
    static final Enum X_33 = Enum.forString("33");
    static final Enum X_41 = Enum.forString("41");
    static final Enum X_42 = Enum.forString("42");
    static final Enum X_43 = Enum.forString("43");
    static final Enum X_51 = Enum.forString("51");
    static final Enum X_52 = Enum.forString("52");
    static final Enum X_53 = Enum.forString("53");
    static final Enum X_61 = Enum.forString("61");
    static final Enum X_62 = Enum.forString("62");
    static final Enum X_63 = Enum.forString("63");
    static final Enum X_71 = Enum.forString("71");
    static final Enum X_72 = Enum.forString("72");
    static final Enum X_81 = Enum.forString("81");
    
    static final int INT_X_11 = Enum.INT_X_11;
    static final int INT_X_12 = Enum.INT_X_12;
    static final int INT_X_13 = Enum.INT_X_13;
    static final int INT_X_21 = Enum.INT_X_21;
    static final int INT_X_22 = Enum.INT_X_22;
    static final int INT_X_31 = Enum.INT_X_31;
    static final int INT_X_32 = Enum.INT_X_32;
    static final int INT_X_33 = Enum.INT_X_33;
    static final int INT_X_41 = Enum.INT_X_41;
    static final int INT_X_42 = Enum.INT_X_42;
    static final int INT_X_43 = Enum.INT_X_43;
    static final int INT_X_51 = Enum.INT_X_51;
    static final int INT_X_52 = Enum.INT_X_52;
    static final int INT_X_53 = Enum.INT_X_53;
    static final int INT_X_61 = Enum.INT_X_61;
    static final int INT_X_62 = Enum.INT_X_62;
    static final int INT_X_63 = Enum.INT_X_63;
    static final int INT_X_71 = Enum.INT_X_71;
    static final int INT_X_72 = Enum.INT_X_72;
    static final int INT_X_81 = Enum.INT_X_81;
    
    /**
     * Enumeration value class for uk.nhs.nhsia.datastandards.ecds.IntendedClinicalCareIntensityCodeType.
     * These enum values can be used as follows:
     * <pre>
     * enum.toString(); // returns the string value of the enum
     * enum.intValue(); // returns an int value, useful for switches
     * // e.g., case Enum.INT_X_11
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
        
        static final int INT_X_11 = 1;
        static final int INT_X_12 = 2;
        static final int INT_X_13 = 3;
        static final int INT_X_21 = 4;
        static final int INT_X_22 = 5;
        static final int INT_X_31 = 6;
        static final int INT_X_32 = 7;
        static final int INT_X_33 = 8;
        static final int INT_X_41 = 9;
        static final int INT_X_42 = 10;
        static final int INT_X_43 = 11;
        static final int INT_X_51 = 12;
        static final int INT_X_52 = 13;
        static final int INT_X_53 = 14;
        static final int INT_X_61 = 15;
        static final int INT_X_62 = 16;
        static final int INT_X_63 = 17;
        static final int INT_X_71 = 18;
        static final int INT_X_72 = 19;
        static final int INT_X_81 = 20;
        
        public static final org.apache.xmlbeans.StringEnumAbstractBase.Table table =
            new org.apache.xmlbeans.StringEnumAbstractBase.Table
        (
            new Enum[]
            {
                new Enum("11", INT_X_11),
                new Enum("12", INT_X_12),
                new Enum("13", INT_X_13),
                new Enum("21", INT_X_21),
                new Enum("22", INT_X_22),
                new Enum("31", INT_X_31),
                new Enum("32", INT_X_32),
                new Enum("33", INT_X_33),
                new Enum("41", INT_X_41),
                new Enum("42", INT_X_42),
                new Enum("43", INT_X_43),
                new Enum("51", INT_X_51),
                new Enum("52", INT_X_52),
                new Enum("53", INT_X_53),
                new Enum("61", INT_X_61),
                new Enum("62", INT_X_62),
                new Enum("63", INT_X_63),
                new Enum("71", INT_X_71),
                new Enum("72", INT_X_72),
                new Enum("81", INT_X_81),
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
        public static uk.nhs.nhsia.datastandards.ecds.IntendedClinicalCareIntensityCodeType newValue(java.lang.Object obj) {
          return (uk.nhs.nhsia.datastandards.ecds.IntendedClinicalCareIntensityCodeType) type.newValue( obj ); }
        
        public static uk.nhs.nhsia.datastandards.ecds.IntendedClinicalCareIntensityCodeType newInstance() {
          return (uk.nhs.nhsia.datastandards.ecds.IntendedClinicalCareIntensityCodeType) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().newInstance( type, null ); }
        
        public static uk.nhs.nhsia.datastandards.ecds.IntendedClinicalCareIntensityCodeType newInstance(org.apache.xmlbeans.XmlOptions options) {
          return (uk.nhs.nhsia.datastandards.ecds.IntendedClinicalCareIntensityCodeType) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().newInstance( type, options ); }
        
        /** @param xmlAsString the string value to parse */
        public static uk.nhs.nhsia.datastandards.ecds.IntendedClinicalCareIntensityCodeType parse(java.lang.String xmlAsString) throws org.apache.xmlbeans.XmlException {
          return (uk.nhs.nhsia.datastandards.ecds.IntendedClinicalCareIntensityCodeType) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( xmlAsString, type, null ); }
        
        public static uk.nhs.nhsia.datastandards.ecds.IntendedClinicalCareIntensityCodeType parse(java.lang.String xmlAsString, org.apache.xmlbeans.XmlOptions options) throws org.apache.xmlbeans.XmlException {
          return (uk.nhs.nhsia.datastandards.ecds.IntendedClinicalCareIntensityCodeType) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( xmlAsString, type, options ); }
        
        /** @param file the file from which to load an xml document */
        public static uk.nhs.nhsia.datastandards.ecds.IntendedClinicalCareIntensityCodeType parse(java.io.File file) throws org.apache.xmlbeans.XmlException, java.io.IOException {
          return (uk.nhs.nhsia.datastandards.ecds.IntendedClinicalCareIntensityCodeType) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( file, type, null ); }
        
        public static uk.nhs.nhsia.datastandards.ecds.IntendedClinicalCareIntensityCodeType parse(java.io.File file, org.apache.xmlbeans.XmlOptions options) throws org.apache.xmlbeans.XmlException, java.io.IOException {
          return (uk.nhs.nhsia.datastandards.ecds.IntendedClinicalCareIntensityCodeType) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( file, type, options ); }
        
        public static uk.nhs.nhsia.datastandards.ecds.IntendedClinicalCareIntensityCodeType parse(java.net.URL u) throws org.apache.xmlbeans.XmlException, java.io.IOException {
          return (uk.nhs.nhsia.datastandards.ecds.IntendedClinicalCareIntensityCodeType) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( u, type, null ); }
        
        public static uk.nhs.nhsia.datastandards.ecds.IntendedClinicalCareIntensityCodeType parse(java.net.URL u, org.apache.xmlbeans.XmlOptions options) throws org.apache.xmlbeans.XmlException, java.io.IOException {
          return (uk.nhs.nhsia.datastandards.ecds.IntendedClinicalCareIntensityCodeType) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( u, type, options ); }
        
        public static uk.nhs.nhsia.datastandards.ecds.IntendedClinicalCareIntensityCodeType parse(java.io.InputStream is) throws org.apache.xmlbeans.XmlException, java.io.IOException {
          return (uk.nhs.nhsia.datastandards.ecds.IntendedClinicalCareIntensityCodeType) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( is, type, null ); }
        
        public static uk.nhs.nhsia.datastandards.ecds.IntendedClinicalCareIntensityCodeType parse(java.io.InputStream is, org.apache.xmlbeans.XmlOptions options) throws org.apache.xmlbeans.XmlException, java.io.IOException {
          return (uk.nhs.nhsia.datastandards.ecds.IntendedClinicalCareIntensityCodeType) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( is, type, options ); }
        
        public static uk.nhs.nhsia.datastandards.ecds.IntendedClinicalCareIntensityCodeType parse(java.io.Reader r) throws org.apache.xmlbeans.XmlException, java.io.IOException {
          return (uk.nhs.nhsia.datastandards.ecds.IntendedClinicalCareIntensityCodeType) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( r, type, null ); }
        
        public static uk.nhs.nhsia.datastandards.ecds.IntendedClinicalCareIntensityCodeType parse(java.io.Reader r, org.apache.xmlbeans.XmlOptions options) throws org.apache.xmlbeans.XmlException, java.io.IOException {
          return (uk.nhs.nhsia.datastandards.ecds.IntendedClinicalCareIntensityCodeType) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( r, type, options ); }
        
        public static uk.nhs.nhsia.datastandards.ecds.IntendedClinicalCareIntensityCodeType parse(javax.xml.stream.XMLStreamReader sr) throws org.apache.xmlbeans.XmlException {
          return (uk.nhs.nhsia.datastandards.ecds.IntendedClinicalCareIntensityCodeType) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( sr, type, null ); }
        
        public static uk.nhs.nhsia.datastandards.ecds.IntendedClinicalCareIntensityCodeType parse(javax.xml.stream.XMLStreamReader sr, org.apache.xmlbeans.XmlOptions options) throws org.apache.xmlbeans.XmlException {
          return (uk.nhs.nhsia.datastandards.ecds.IntendedClinicalCareIntensityCodeType) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( sr, type, options ); }
        
        public static uk.nhs.nhsia.datastandards.ecds.IntendedClinicalCareIntensityCodeType parse(org.w3c.dom.Node node) throws org.apache.xmlbeans.XmlException {
          return (uk.nhs.nhsia.datastandards.ecds.IntendedClinicalCareIntensityCodeType) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( node, type, null ); }
        
        public static uk.nhs.nhsia.datastandards.ecds.IntendedClinicalCareIntensityCodeType parse(org.w3c.dom.Node node, org.apache.xmlbeans.XmlOptions options) throws org.apache.xmlbeans.XmlException {
          return (uk.nhs.nhsia.datastandards.ecds.IntendedClinicalCareIntensityCodeType) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( node, type, options ); }
        
        /** @deprecated {@link org.apache.xmlbeans.xml.stream.XMLInputStream} */
        public static uk.nhs.nhsia.datastandards.ecds.IntendedClinicalCareIntensityCodeType parse(org.apache.xmlbeans.xml.stream.XMLInputStream xis) throws org.apache.xmlbeans.XmlException, org.apache.xmlbeans.xml.stream.XMLStreamException {
          return (uk.nhs.nhsia.datastandards.ecds.IntendedClinicalCareIntensityCodeType) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( xis, type, null ); }
        
        /** @deprecated {@link org.apache.xmlbeans.xml.stream.XMLInputStream} */
        public static uk.nhs.nhsia.datastandards.ecds.IntendedClinicalCareIntensityCodeType parse(org.apache.xmlbeans.xml.stream.XMLInputStream xis, org.apache.xmlbeans.XmlOptions options) throws org.apache.xmlbeans.XmlException, org.apache.xmlbeans.xml.stream.XMLStreamException {
          return (uk.nhs.nhsia.datastandards.ecds.IntendedClinicalCareIntensityCodeType) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( xis, type, options ); }
        
        /** @deprecated {@link org.apache.xmlbeans.xml.stream.XMLInputStream} */
        public static org.apache.xmlbeans.xml.stream.XMLInputStream newValidatingXMLInputStream(org.apache.xmlbeans.xml.stream.XMLInputStream xis) throws org.apache.xmlbeans.XmlException, org.apache.xmlbeans.xml.stream.XMLStreamException {
          return org.apache.xmlbeans.XmlBeans.getContextTypeLoader().newValidatingXMLInputStream( xis, type, null ); }
        
        /** @deprecated {@link org.apache.xmlbeans.xml.stream.XMLInputStream} */
        public static org.apache.xmlbeans.xml.stream.XMLInputStream newValidatingXMLInputStream(org.apache.xmlbeans.xml.stream.XMLInputStream xis, org.apache.xmlbeans.XmlOptions options) throws org.apache.xmlbeans.XmlException, org.apache.xmlbeans.xml.stream.XMLStreamException {
          return org.apache.xmlbeans.XmlBeans.getContextTypeLoader().newValidatingXMLInputStream( xis, type, options ); }
        
        private Factory() { } // No instance of this class allowed
    }
}
