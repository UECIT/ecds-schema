/*
 * XML Type:  MentalHealthActLegalStatusClassificationCode_Type
 * Namespace: http://www.nhsia.nhs.uk/DataStandards/XMLschema/CDS/ns
 * Java type: uk.nhs.nhsia.datastandards.ecds.MentalHealthActLegalStatusClassificationCodeType
 *
 * Automatically generated - do not modify.
 */
package uk.nhs.nhsia.datastandards.ecds;


/**
 * An XML MentalHealthActLegalStatusClassificationCode_Type(@http://www.nhsia.nhs.uk/DataStandards/XMLschema/CDS/ns).
 *
 * This is an atomic type that is a restriction of uk.nhs.nhsia.datastandards.ecds.MentalHealthActLegalStatusClassificationCodeType.
 */
public interface MentalHealthActLegalStatusClassificationCodeType extends uk.nhs.nhsia.datastandards.ecds.AlphaNumericType
{
    public static final org.apache.xmlbeans.SchemaType type = (org.apache.xmlbeans.SchemaType)
        org.apache.xmlbeans.XmlBeans.typeSystemForClassLoader(MentalHealthActLegalStatusClassificationCodeType.class.getClassLoader(), "schemaorg_apache_xmlbeans.system.s30C1180FF47174E0C8A992A2D657328B").resolveHandle("mentalhealthactlegalstatusclassificationcodetype6a9btype");
    
    org.apache.xmlbeans.StringEnumAbstractBase enumValue();
    void set(org.apache.xmlbeans.StringEnumAbstractBase e);
    
    static final Enum X_01 = Enum.forString("01");
    static final Enum X_02 = Enum.forString("02");
    static final Enum X_03 = Enum.forString("03");
    static final Enum X_04 = Enum.forString("04");
    static final Enum X_05 = Enum.forString("05");
    static final Enum X_06 = Enum.forString("06");
    static final Enum X_07 = Enum.forString("07");
    static final Enum X_08 = Enum.forString("08");
    static final Enum X_09 = Enum.forString("09");
    static final Enum X_10 = Enum.forString("10");
    static final Enum X_12 = Enum.forString("12");
    static final Enum X_13 = Enum.forString("13");
    static final Enum X_14 = Enum.forString("14");
    static final Enum X_15 = Enum.forString("15");
    static final Enum X_16 = Enum.forString("16");
    static final Enum X_17 = Enum.forString("17");
    static final Enum X_18 = Enum.forString("18");
    static final Enum X_19 = Enum.forString("19");
    static final Enum X_20 = Enum.forString("20");
    static final Enum X_31 = Enum.forString("31");
    static final Enum X_32 = Enum.forString("32");
    static final Enum X_34 = Enum.forString("34");
    static final Enum X_35 = Enum.forString("35");
    static final Enum X_36 = Enum.forString("36");
    static final Enum X_37 = Enum.forString("37");
    static final Enum X_38 = Enum.forString("38");
    static final Enum X_98 = Enum.forString("98");
    static final Enum X_99 = Enum.forString("99");
    
    static final int INT_X_01 = Enum.INT_X_01;
    static final int INT_X_02 = Enum.INT_X_02;
    static final int INT_X_03 = Enum.INT_X_03;
    static final int INT_X_04 = Enum.INT_X_04;
    static final int INT_X_05 = Enum.INT_X_05;
    static final int INT_X_06 = Enum.INT_X_06;
    static final int INT_X_07 = Enum.INT_X_07;
    static final int INT_X_08 = Enum.INT_X_08;
    static final int INT_X_09 = Enum.INT_X_09;
    static final int INT_X_10 = Enum.INT_X_10;
    static final int INT_X_12 = Enum.INT_X_12;
    static final int INT_X_13 = Enum.INT_X_13;
    static final int INT_X_14 = Enum.INT_X_14;
    static final int INT_X_15 = Enum.INT_X_15;
    static final int INT_X_16 = Enum.INT_X_16;
    static final int INT_X_17 = Enum.INT_X_17;
    static final int INT_X_18 = Enum.INT_X_18;
    static final int INT_X_19 = Enum.INT_X_19;
    static final int INT_X_20 = Enum.INT_X_20;
    static final int INT_X_31 = Enum.INT_X_31;
    static final int INT_X_32 = Enum.INT_X_32;
    static final int INT_X_34 = Enum.INT_X_34;
    static final int INT_X_35 = Enum.INT_X_35;
    static final int INT_X_36 = Enum.INT_X_36;
    static final int INT_X_37 = Enum.INT_X_37;
    static final int INT_X_38 = Enum.INT_X_38;
    static final int INT_X_98 = Enum.INT_X_98;
    static final int INT_X_99 = Enum.INT_X_99;
    
    /**
     * Enumeration value class for uk.nhs.nhsia.datastandards.ecds.MentalHealthActLegalStatusClassificationCodeType.
     * These enum values can be used as follows:
     * <pre>
     * enum.toString(); // returns the string value of the enum
     * enum.intValue(); // returns an int value, useful for switches
     * // e.g., case Enum.INT_X_01
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
        
        static final int INT_X_01 = 1;
        static final int INT_X_02 = 2;
        static final int INT_X_03 = 3;
        static final int INT_X_04 = 4;
        static final int INT_X_05 = 5;
        static final int INT_X_06 = 6;
        static final int INT_X_07 = 7;
        static final int INT_X_08 = 8;
        static final int INT_X_09 = 9;
        static final int INT_X_10 = 10;
        static final int INT_X_12 = 11;
        static final int INT_X_13 = 12;
        static final int INT_X_14 = 13;
        static final int INT_X_15 = 14;
        static final int INT_X_16 = 15;
        static final int INT_X_17 = 16;
        static final int INT_X_18 = 17;
        static final int INT_X_19 = 18;
        static final int INT_X_20 = 19;
        static final int INT_X_31 = 20;
        static final int INT_X_32 = 21;
        static final int INT_X_34 = 22;
        static final int INT_X_35 = 23;
        static final int INT_X_36 = 24;
        static final int INT_X_37 = 25;
        static final int INT_X_38 = 26;
        static final int INT_X_98 = 27;
        static final int INT_X_99 = 28;
        
        public static final org.apache.xmlbeans.StringEnumAbstractBase.Table table =
            new org.apache.xmlbeans.StringEnumAbstractBase.Table
        (
            new Enum[]
            {
                new Enum("01", INT_X_01),
                new Enum("02", INT_X_02),
                new Enum("03", INT_X_03),
                new Enum("04", INT_X_04),
                new Enum("05", INT_X_05),
                new Enum("06", INT_X_06),
                new Enum("07", INT_X_07),
                new Enum("08", INT_X_08),
                new Enum("09", INT_X_09),
                new Enum("10", INT_X_10),
                new Enum("12", INT_X_12),
                new Enum("13", INT_X_13),
                new Enum("14", INT_X_14),
                new Enum("15", INT_X_15),
                new Enum("16", INT_X_16),
                new Enum("17", INT_X_17),
                new Enum("18", INT_X_18),
                new Enum("19", INT_X_19),
                new Enum("20", INT_X_20),
                new Enum("31", INT_X_31),
                new Enum("32", INT_X_32),
                new Enum("34", INT_X_34),
                new Enum("35", INT_X_35),
                new Enum("36", INT_X_36),
                new Enum("37", INT_X_37),
                new Enum("38", INT_X_38),
                new Enum("98", INT_X_98),
                new Enum("99", INT_X_99),
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
        public static uk.nhs.nhsia.datastandards.ecds.MentalHealthActLegalStatusClassificationCodeType newValue(java.lang.Object obj) {
          return (uk.nhs.nhsia.datastandards.ecds.MentalHealthActLegalStatusClassificationCodeType) type.newValue( obj ); }
        
        public static uk.nhs.nhsia.datastandards.ecds.MentalHealthActLegalStatusClassificationCodeType newInstance() {
          return (uk.nhs.nhsia.datastandards.ecds.MentalHealthActLegalStatusClassificationCodeType) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().newInstance( type, null ); }
        
        public static uk.nhs.nhsia.datastandards.ecds.MentalHealthActLegalStatusClassificationCodeType newInstance(org.apache.xmlbeans.XmlOptions options) {
          return (uk.nhs.nhsia.datastandards.ecds.MentalHealthActLegalStatusClassificationCodeType) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().newInstance( type, options ); }
        
        /** @param xmlAsString the string value to parse */
        public static uk.nhs.nhsia.datastandards.ecds.MentalHealthActLegalStatusClassificationCodeType parse(java.lang.String xmlAsString) throws org.apache.xmlbeans.XmlException {
          return (uk.nhs.nhsia.datastandards.ecds.MentalHealthActLegalStatusClassificationCodeType) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( xmlAsString, type, null ); }
        
        public static uk.nhs.nhsia.datastandards.ecds.MentalHealthActLegalStatusClassificationCodeType parse(java.lang.String xmlAsString, org.apache.xmlbeans.XmlOptions options) throws org.apache.xmlbeans.XmlException {
          return (uk.nhs.nhsia.datastandards.ecds.MentalHealthActLegalStatusClassificationCodeType) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( xmlAsString, type, options ); }
        
        /** @param file the file from which to load an xml document */
        public static uk.nhs.nhsia.datastandards.ecds.MentalHealthActLegalStatusClassificationCodeType parse(java.io.File file) throws org.apache.xmlbeans.XmlException, java.io.IOException {
          return (uk.nhs.nhsia.datastandards.ecds.MentalHealthActLegalStatusClassificationCodeType) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( file, type, null ); }
        
        public static uk.nhs.nhsia.datastandards.ecds.MentalHealthActLegalStatusClassificationCodeType parse(java.io.File file, org.apache.xmlbeans.XmlOptions options) throws org.apache.xmlbeans.XmlException, java.io.IOException {
          return (uk.nhs.nhsia.datastandards.ecds.MentalHealthActLegalStatusClassificationCodeType) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( file, type, options ); }
        
        public static uk.nhs.nhsia.datastandards.ecds.MentalHealthActLegalStatusClassificationCodeType parse(java.net.URL u) throws org.apache.xmlbeans.XmlException, java.io.IOException {
          return (uk.nhs.nhsia.datastandards.ecds.MentalHealthActLegalStatusClassificationCodeType) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( u, type, null ); }
        
        public static uk.nhs.nhsia.datastandards.ecds.MentalHealthActLegalStatusClassificationCodeType parse(java.net.URL u, org.apache.xmlbeans.XmlOptions options) throws org.apache.xmlbeans.XmlException, java.io.IOException {
          return (uk.nhs.nhsia.datastandards.ecds.MentalHealthActLegalStatusClassificationCodeType) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( u, type, options ); }
        
        public static uk.nhs.nhsia.datastandards.ecds.MentalHealthActLegalStatusClassificationCodeType parse(java.io.InputStream is) throws org.apache.xmlbeans.XmlException, java.io.IOException {
          return (uk.nhs.nhsia.datastandards.ecds.MentalHealthActLegalStatusClassificationCodeType) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( is, type, null ); }
        
        public static uk.nhs.nhsia.datastandards.ecds.MentalHealthActLegalStatusClassificationCodeType parse(java.io.InputStream is, org.apache.xmlbeans.XmlOptions options) throws org.apache.xmlbeans.XmlException, java.io.IOException {
          return (uk.nhs.nhsia.datastandards.ecds.MentalHealthActLegalStatusClassificationCodeType) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( is, type, options ); }
        
        public static uk.nhs.nhsia.datastandards.ecds.MentalHealthActLegalStatusClassificationCodeType parse(java.io.Reader r) throws org.apache.xmlbeans.XmlException, java.io.IOException {
          return (uk.nhs.nhsia.datastandards.ecds.MentalHealthActLegalStatusClassificationCodeType) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( r, type, null ); }
        
        public static uk.nhs.nhsia.datastandards.ecds.MentalHealthActLegalStatusClassificationCodeType parse(java.io.Reader r, org.apache.xmlbeans.XmlOptions options) throws org.apache.xmlbeans.XmlException, java.io.IOException {
          return (uk.nhs.nhsia.datastandards.ecds.MentalHealthActLegalStatusClassificationCodeType) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( r, type, options ); }
        
        public static uk.nhs.nhsia.datastandards.ecds.MentalHealthActLegalStatusClassificationCodeType parse(javax.xml.stream.XMLStreamReader sr) throws org.apache.xmlbeans.XmlException {
          return (uk.nhs.nhsia.datastandards.ecds.MentalHealthActLegalStatusClassificationCodeType) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( sr, type, null ); }
        
        public static uk.nhs.nhsia.datastandards.ecds.MentalHealthActLegalStatusClassificationCodeType parse(javax.xml.stream.XMLStreamReader sr, org.apache.xmlbeans.XmlOptions options) throws org.apache.xmlbeans.XmlException {
          return (uk.nhs.nhsia.datastandards.ecds.MentalHealthActLegalStatusClassificationCodeType) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( sr, type, options ); }
        
        public static uk.nhs.nhsia.datastandards.ecds.MentalHealthActLegalStatusClassificationCodeType parse(org.w3c.dom.Node node) throws org.apache.xmlbeans.XmlException {
          return (uk.nhs.nhsia.datastandards.ecds.MentalHealthActLegalStatusClassificationCodeType) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( node, type, null ); }
        
        public static uk.nhs.nhsia.datastandards.ecds.MentalHealthActLegalStatusClassificationCodeType parse(org.w3c.dom.Node node, org.apache.xmlbeans.XmlOptions options) throws org.apache.xmlbeans.XmlException {
          return (uk.nhs.nhsia.datastandards.ecds.MentalHealthActLegalStatusClassificationCodeType) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( node, type, options ); }
        
        /** @deprecated {@link org.apache.xmlbeans.xml.stream.XMLInputStream} */
        public static uk.nhs.nhsia.datastandards.ecds.MentalHealthActLegalStatusClassificationCodeType parse(org.apache.xmlbeans.xml.stream.XMLInputStream xis) throws org.apache.xmlbeans.XmlException, org.apache.xmlbeans.xml.stream.XMLStreamException {
          return (uk.nhs.nhsia.datastandards.ecds.MentalHealthActLegalStatusClassificationCodeType) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( xis, type, null ); }
        
        /** @deprecated {@link org.apache.xmlbeans.xml.stream.XMLInputStream} */
        public static uk.nhs.nhsia.datastandards.ecds.MentalHealthActLegalStatusClassificationCodeType parse(org.apache.xmlbeans.xml.stream.XMLInputStream xis, org.apache.xmlbeans.XmlOptions options) throws org.apache.xmlbeans.XmlException, org.apache.xmlbeans.xml.stream.XMLStreamException {
          return (uk.nhs.nhsia.datastandards.ecds.MentalHealthActLegalStatusClassificationCodeType) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( xis, type, options ); }
        
        /** @deprecated {@link org.apache.xmlbeans.xml.stream.XMLInputStream} */
        public static org.apache.xmlbeans.xml.stream.XMLInputStream newValidatingXMLInputStream(org.apache.xmlbeans.xml.stream.XMLInputStream xis) throws org.apache.xmlbeans.XmlException, org.apache.xmlbeans.xml.stream.XMLStreamException {
          return org.apache.xmlbeans.XmlBeans.getContextTypeLoader().newValidatingXMLInputStream( xis, type, null ); }
        
        /** @deprecated {@link org.apache.xmlbeans.xml.stream.XMLInputStream} */
        public static org.apache.xmlbeans.xml.stream.XMLInputStream newValidatingXMLInputStream(org.apache.xmlbeans.xml.stream.XMLInputStream xis, org.apache.xmlbeans.XmlOptions options) throws org.apache.xmlbeans.XmlException, org.apache.xmlbeans.xml.stream.XMLStreamException {
          return org.apache.xmlbeans.XmlBeans.getContextTypeLoader().newValidatingXMLInputStream( xis, type, options ); }
        
        private Factory() { } // No instance of this class allowed
    }
}
