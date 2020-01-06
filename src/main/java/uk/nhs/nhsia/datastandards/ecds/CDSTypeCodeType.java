/*
 * XML Type:  CDSTypeCode_Type
 * Namespace: http://www.nhsia.nhs.uk/DataStandards/XMLschema/CDS/ns
 * Java type: uk.nhs.nhsia.datastandards.ecds.CDSTypeCodeType
 *
 * Automatically generated - do not modify.
 */
package uk.nhs.nhsia.datastandards.ecds;


/**
 * An XML CDSTypeCode_Type(@http://www.nhsia.nhs.uk/DataStandards/XMLschema/CDS/ns).
 *
 * This is an atomic type that is a restriction of uk.nhs.nhsia.datastandards.ecds.CDSTypeCodeType.
 */
public interface CDSTypeCodeType extends uk.nhs.nhsia.datastandards.ecds.AlphaNumericType
{
    public static final org.apache.xmlbeans.SchemaType type = (org.apache.xmlbeans.SchemaType)
        org.apache.xmlbeans.XmlBeans.typeSystemForClassLoader(CDSTypeCodeType.class.getClassLoader(), "schemaorg_apache_xmlbeans.system.s30C1180FF47174E0C8A992A2D657328B").resolveHandle("cdstypecodetype7431type");
    
    org.apache.xmlbeans.StringEnumAbstractBase enumValue();
    void set(org.apache.xmlbeans.StringEnumAbstractBase e);
    
    static final Enum X_010 = Enum.forString("010");
    static final Enum X_011 = Enum.forString("011");
    static final Enum X_020 = Enum.forString("020");
    static final Enum X_021 = Enum.forString("021");
    static final Enum X_030 = Enum.forString("030");
    static final Enum X_040 = Enum.forString("040");
    static final Enum X_050 = Enum.forString("050");
    static final Enum X_060 = Enum.forString("060");
    static final Enum X_070 = Enum.forString("070");
    static final Enum X_080 = Enum.forString("080");
    static final Enum X_090 = Enum.forString("090");
    static final Enum X_100 = Enum.forString("100");
    static final Enum X_110 = Enum.forString("110");
    static final Enum X_120 = Enum.forString("120");
    static final Enum X_130 = Enum.forString("130");
    static final Enum X_140 = Enum.forString("140");
    static final Enum X_150 = Enum.forString("150");
    static final Enum X_160 = Enum.forString("160");
    static final Enum X_170 = Enum.forString("170");
    static final Enum X_180 = Enum.forString("180");
    static final Enum X_190 = Enum.forString("190");
    static final Enum X_200 = Enum.forString("200");
    
    static final int INT_X_010 = Enum.INT_X_010;
    static final int INT_X_011 = Enum.INT_X_011;
    static final int INT_X_020 = Enum.INT_X_020;
    static final int INT_X_021 = Enum.INT_X_021;
    static final int INT_X_030 = Enum.INT_X_030;
    static final int INT_X_040 = Enum.INT_X_040;
    static final int INT_X_050 = Enum.INT_X_050;
    static final int INT_X_060 = Enum.INT_X_060;
    static final int INT_X_070 = Enum.INT_X_070;
    static final int INT_X_080 = Enum.INT_X_080;
    static final int INT_X_090 = Enum.INT_X_090;
    static final int INT_X_100 = Enum.INT_X_100;
    static final int INT_X_110 = Enum.INT_X_110;
    static final int INT_X_120 = Enum.INT_X_120;
    static final int INT_X_130 = Enum.INT_X_130;
    static final int INT_X_140 = Enum.INT_X_140;
    static final int INT_X_150 = Enum.INT_X_150;
    static final int INT_X_160 = Enum.INT_X_160;
    static final int INT_X_170 = Enum.INT_X_170;
    static final int INT_X_180 = Enum.INT_X_180;
    static final int INT_X_190 = Enum.INT_X_190;
    static final int INT_X_200 = Enum.INT_X_200;
    
    /**
     * Enumeration value class for uk.nhs.nhsia.datastandards.ecds.CDSTypeCodeType.
     * These enum values can be used as follows:
     * <pre>
     * enum.toString(); // returns the string value of the enum
     * enum.intValue(); // returns an int value, useful for switches
     * // e.g., case Enum.INT_X_010
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
        
        static final int INT_X_010 = 1;
        static final int INT_X_011 = 2;
        static final int INT_X_020 = 3;
        static final int INT_X_021 = 4;
        static final int INT_X_030 = 5;
        static final int INT_X_040 = 6;
        static final int INT_X_050 = 7;
        static final int INT_X_060 = 8;
        static final int INT_X_070 = 9;
        static final int INT_X_080 = 10;
        static final int INT_X_090 = 11;
        static final int INT_X_100 = 12;
        static final int INT_X_110 = 13;
        static final int INT_X_120 = 14;
        static final int INT_X_130 = 15;
        static final int INT_X_140 = 16;
        static final int INT_X_150 = 17;
        static final int INT_X_160 = 18;
        static final int INT_X_170 = 19;
        static final int INT_X_180 = 20;
        static final int INT_X_190 = 21;
        static final int INT_X_200 = 22;
        
        public static final org.apache.xmlbeans.StringEnumAbstractBase.Table table =
            new org.apache.xmlbeans.StringEnumAbstractBase.Table
        (
            new Enum[]
            {
                new Enum("010", INT_X_010),
                new Enum("011", INT_X_011),
                new Enum("020", INT_X_020),
                new Enum("021", INT_X_021),
                new Enum("030", INT_X_030),
                new Enum("040", INT_X_040),
                new Enum("050", INT_X_050),
                new Enum("060", INT_X_060),
                new Enum("070", INT_X_070),
                new Enum("080", INT_X_080),
                new Enum("090", INT_X_090),
                new Enum("100", INT_X_100),
                new Enum("110", INT_X_110),
                new Enum("120", INT_X_120),
                new Enum("130", INT_X_130),
                new Enum("140", INT_X_140),
                new Enum("150", INT_X_150),
                new Enum("160", INT_X_160),
                new Enum("170", INT_X_170),
                new Enum("180", INT_X_180),
                new Enum("190", INT_X_190),
                new Enum("200", INT_X_200),
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
        public static uk.nhs.nhsia.datastandards.ecds.CDSTypeCodeType newValue(java.lang.Object obj) {
          return (uk.nhs.nhsia.datastandards.ecds.CDSTypeCodeType) type.newValue( obj ); }
        
        public static uk.nhs.nhsia.datastandards.ecds.CDSTypeCodeType newInstance() {
          return (uk.nhs.nhsia.datastandards.ecds.CDSTypeCodeType) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().newInstance( type, null ); }
        
        public static uk.nhs.nhsia.datastandards.ecds.CDSTypeCodeType newInstance(org.apache.xmlbeans.XmlOptions options) {
          return (uk.nhs.nhsia.datastandards.ecds.CDSTypeCodeType) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().newInstance( type, options ); }
        
        /** @param xmlAsString the string value to parse */
        public static uk.nhs.nhsia.datastandards.ecds.CDSTypeCodeType parse(java.lang.String xmlAsString) throws org.apache.xmlbeans.XmlException {
          return (uk.nhs.nhsia.datastandards.ecds.CDSTypeCodeType) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( xmlAsString, type, null ); }
        
        public static uk.nhs.nhsia.datastandards.ecds.CDSTypeCodeType parse(java.lang.String xmlAsString, org.apache.xmlbeans.XmlOptions options) throws org.apache.xmlbeans.XmlException {
          return (uk.nhs.nhsia.datastandards.ecds.CDSTypeCodeType) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( xmlAsString, type, options ); }
        
        /** @param file the file from which to load an xml document */
        public static uk.nhs.nhsia.datastandards.ecds.CDSTypeCodeType parse(java.io.File file) throws org.apache.xmlbeans.XmlException, java.io.IOException {
          return (uk.nhs.nhsia.datastandards.ecds.CDSTypeCodeType) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( file, type, null ); }
        
        public static uk.nhs.nhsia.datastandards.ecds.CDSTypeCodeType parse(java.io.File file, org.apache.xmlbeans.XmlOptions options) throws org.apache.xmlbeans.XmlException, java.io.IOException {
          return (uk.nhs.nhsia.datastandards.ecds.CDSTypeCodeType) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( file, type, options ); }
        
        public static uk.nhs.nhsia.datastandards.ecds.CDSTypeCodeType parse(java.net.URL u) throws org.apache.xmlbeans.XmlException, java.io.IOException {
          return (uk.nhs.nhsia.datastandards.ecds.CDSTypeCodeType) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( u, type, null ); }
        
        public static uk.nhs.nhsia.datastandards.ecds.CDSTypeCodeType parse(java.net.URL u, org.apache.xmlbeans.XmlOptions options) throws org.apache.xmlbeans.XmlException, java.io.IOException {
          return (uk.nhs.nhsia.datastandards.ecds.CDSTypeCodeType) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( u, type, options ); }
        
        public static uk.nhs.nhsia.datastandards.ecds.CDSTypeCodeType parse(java.io.InputStream is) throws org.apache.xmlbeans.XmlException, java.io.IOException {
          return (uk.nhs.nhsia.datastandards.ecds.CDSTypeCodeType) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( is, type, null ); }
        
        public static uk.nhs.nhsia.datastandards.ecds.CDSTypeCodeType parse(java.io.InputStream is, org.apache.xmlbeans.XmlOptions options) throws org.apache.xmlbeans.XmlException, java.io.IOException {
          return (uk.nhs.nhsia.datastandards.ecds.CDSTypeCodeType) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( is, type, options ); }
        
        public static uk.nhs.nhsia.datastandards.ecds.CDSTypeCodeType parse(java.io.Reader r) throws org.apache.xmlbeans.XmlException, java.io.IOException {
          return (uk.nhs.nhsia.datastandards.ecds.CDSTypeCodeType) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( r, type, null ); }
        
        public static uk.nhs.nhsia.datastandards.ecds.CDSTypeCodeType parse(java.io.Reader r, org.apache.xmlbeans.XmlOptions options) throws org.apache.xmlbeans.XmlException, java.io.IOException {
          return (uk.nhs.nhsia.datastandards.ecds.CDSTypeCodeType) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( r, type, options ); }
        
        public static uk.nhs.nhsia.datastandards.ecds.CDSTypeCodeType parse(javax.xml.stream.XMLStreamReader sr) throws org.apache.xmlbeans.XmlException {
          return (uk.nhs.nhsia.datastandards.ecds.CDSTypeCodeType) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( sr, type, null ); }
        
        public static uk.nhs.nhsia.datastandards.ecds.CDSTypeCodeType parse(javax.xml.stream.XMLStreamReader sr, org.apache.xmlbeans.XmlOptions options) throws org.apache.xmlbeans.XmlException {
          return (uk.nhs.nhsia.datastandards.ecds.CDSTypeCodeType) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( sr, type, options ); }
        
        public static uk.nhs.nhsia.datastandards.ecds.CDSTypeCodeType parse(org.w3c.dom.Node node) throws org.apache.xmlbeans.XmlException {
          return (uk.nhs.nhsia.datastandards.ecds.CDSTypeCodeType) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( node, type, null ); }
        
        public static uk.nhs.nhsia.datastandards.ecds.CDSTypeCodeType parse(org.w3c.dom.Node node, org.apache.xmlbeans.XmlOptions options) throws org.apache.xmlbeans.XmlException {
          return (uk.nhs.nhsia.datastandards.ecds.CDSTypeCodeType) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( node, type, options ); }
        
        /** @deprecated {@link org.apache.xmlbeans.xml.stream.XMLInputStream} */
        public static uk.nhs.nhsia.datastandards.ecds.CDSTypeCodeType parse(org.apache.xmlbeans.xml.stream.XMLInputStream xis) throws org.apache.xmlbeans.XmlException, org.apache.xmlbeans.xml.stream.XMLStreamException {
          return (uk.nhs.nhsia.datastandards.ecds.CDSTypeCodeType) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( xis, type, null ); }
        
        /** @deprecated {@link org.apache.xmlbeans.xml.stream.XMLInputStream} */
        public static uk.nhs.nhsia.datastandards.ecds.CDSTypeCodeType parse(org.apache.xmlbeans.xml.stream.XMLInputStream xis, org.apache.xmlbeans.XmlOptions options) throws org.apache.xmlbeans.XmlException, org.apache.xmlbeans.xml.stream.XMLStreamException {
          return (uk.nhs.nhsia.datastandards.ecds.CDSTypeCodeType) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( xis, type, options ); }
        
        /** @deprecated {@link org.apache.xmlbeans.xml.stream.XMLInputStream} */
        public static org.apache.xmlbeans.xml.stream.XMLInputStream newValidatingXMLInputStream(org.apache.xmlbeans.xml.stream.XMLInputStream xis) throws org.apache.xmlbeans.XmlException, org.apache.xmlbeans.xml.stream.XMLStreamException {
          return org.apache.xmlbeans.XmlBeans.getContextTypeLoader().newValidatingXMLInputStream( xis, type, null ); }
        
        /** @deprecated {@link org.apache.xmlbeans.xml.stream.XMLInputStream} */
        public static org.apache.xmlbeans.xml.stream.XMLInputStream newValidatingXMLInputStream(org.apache.xmlbeans.xml.stream.XMLInputStream xis, org.apache.xmlbeans.XmlOptions options) throws org.apache.xmlbeans.XmlException, org.apache.xmlbeans.xml.stream.XMLStreamException {
          return org.apache.xmlbeans.XmlBeans.getContextTypeLoader().newValidatingXMLInputStream( xis, type, options ); }
        
        private Factory() { } // No instance of this class allowed
    }
}
