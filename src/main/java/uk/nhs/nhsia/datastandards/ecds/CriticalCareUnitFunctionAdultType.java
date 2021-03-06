/*
 * XML Type:  CriticalCareUnitFunction_Adult_Type
 * Namespace: http://www.nhsia.nhs.uk/DataStandards/XMLschema/CDS/ns
 * Java type: uk.nhs.nhsia.datastandards.ecds.CriticalCareUnitFunctionAdultType
 *
 * Automatically generated - do not modify.
 */
package uk.nhs.nhsia.datastandards.ecds;


/**
 * An XML CriticalCareUnitFunction_Adult_Type(@http://www.nhsia.nhs.uk/DataStandards/XMLschema/CDS/ns).
 *
 * This is an atomic type that is a restriction of uk.nhs.nhsia.datastandards.ecds.CriticalCareUnitFunctionAdultType.
 */
public interface CriticalCareUnitFunctionAdultType extends uk.nhs.nhsia.datastandards.ecds.AlphaNumericType
{
    public static final org.apache.xmlbeans.SchemaType type = (org.apache.xmlbeans.SchemaType)
        org.apache.xmlbeans.XmlBeans.typeSystemForClassLoader(CriticalCareUnitFunctionAdultType.class.getClassLoader(), "schemaorg_apache_xmlbeans.system.s30C1180FF47174E0C8A992A2D657328B").resolveHandle("criticalcareunitfunctionadulttype5511type");
    
    org.apache.xmlbeans.StringEnumAbstractBase enumValue();
    void set(org.apache.xmlbeans.StringEnumAbstractBase e);
    
    static final Enum X_01 = Enum.forString("01");
    static final Enum X_02 = Enum.forString("02");
    static final Enum X_03 = Enum.forString("03");
    static final Enum X_05 = Enum.forString("05");
    static final Enum X_06 = Enum.forString("06");
    static final Enum X_07 = Enum.forString("07");
    static final Enum X_08 = Enum.forString("08");
    static final Enum X_09 = Enum.forString("09");
    static final Enum X_10 = Enum.forString("10");
    static final Enum X_11 = Enum.forString("11");
    static final Enum X_12 = Enum.forString("12");
    static final Enum X_90 = Enum.forString("90");
    static final Enum X_91 = Enum.forString("91");
    
    static final int INT_X_01 = Enum.INT_X_01;
    static final int INT_X_02 = Enum.INT_X_02;
    static final int INT_X_03 = Enum.INT_X_03;
    static final int INT_X_05 = Enum.INT_X_05;
    static final int INT_X_06 = Enum.INT_X_06;
    static final int INT_X_07 = Enum.INT_X_07;
    static final int INT_X_08 = Enum.INT_X_08;
    static final int INT_X_09 = Enum.INT_X_09;
    static final int INT_X_10 = Enum.INT_X_10;
    static final int INT_X_11 = Enum.INT_X_11;
    static final int INT_X_12 = Enum.INT_X_12;
    static final int INT_X_90 = Enum.INT_X_90;
    static final int INT_X_91 = Enum.INT_X_91;
    
    /**
     * Enumeration value class for uk.nhs.nhsia.datastandards.ecds.CriticalCareUnitFunctionAdultType.
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
        static final int INT_X_05 = 4;
        static final int INT_X_06 = 5;
        static final int INT_X_07 = 6;
        static final int INT_X_08 = 7;
        static final int INT_X_09 = 8;
        static final int INT_X_10 = 9;
        static final int INT_X_11 = 10;
        static final int INT_X_12 = 11;
        static final int INT_X_90 = 12;
        static final int INT_X_91 = 13;
        
        public static final org.apache.xmlbeans.StringEnumAbstractBase.Table table =
            new org.apache.xmlbeans.StringEnumAbstractBase.Table
        (
            new Enum[]
            {
                new Enum("01", INT_X_01),
                new Enum("02", INT_X_02),
                new Enum("03", INT_X_03),
                new Enum("05", INT_X_05),
                new Enum("06", INT_X_06),
                new Enum("07", INT_X_07),
                new Enum("08", INT_X_08),
                new Enum("09", INT_X_09),
                new Enum("10", INT_X_10),
                new Enum("11", INT_X_11),
                new Enum("12", INT_X_12),
                new Enum("90", INT_X_90),
                new Enum("91", INT_X_91),
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
        public static uk.nhs.nhsia.datastandards.ecds.CriticalCareUnitFunctionAdultType newValue(java.lang.Object obj) {
          return (uk.nhs.nhsia.datastandards.ecds.CriticalCareUnitFunctionAdultType) type.newValue( obj ); }
        
        public static uk.nhs.nhsia.datastandards.ecds.CriticalCareUnitFunctionAdultType newInstance() {
          return (uk.nhs.nhsia.datastandards.ecds.CriticalCareUnitFunctionAdultType) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().newInstance( type, null ); }
        
        public static uk.nhs.nhsia.datastandards.ecds.CriticalCareUnitFunctionAdultType newInstance(org.apache.xmlbeans.XmlOptions options) {
          return (uk.nhs.nhsia.datastandards.ecds.CriticalCareUnitFunctionAdultType) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().newInstance( type, options ); }
        
        /** @param xmlAsString the string value to parse */
        public static uk.nhs.nhsia.datastandards.ecds.CriticalCareUnitFunctionAdultType parse(java.lang.String xmlAsString) throws org.apache.xmlbeans.XmlException {
          return (uk.nhs.nhsia.datastandards.ecds.CriticalCareUnitFunctionAdultType) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( xmlAsString, type, null ); }
        
        public static uk.nhs.nhsia.datastandards.ecds.CriticalCareUnitFunctionAdultType parse(java.lang.String xmlAsString, org.apache.xmlbeans.XmlOptions options) throws org.apache.xmlbeans.XmlException {
          return (uk.nhs.nhsia.datastandards.ecds.CriticalCareUnitFunctionAdultType) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( xmlAsString, type, options ); }
        
        /** @param file the file from which to load an xml document */
        public static uk.nhs.nhsia.datastandards.ecds.CriticalCareUnitFunctionAdultType parse(java.io.File file) throws org.apache.xmlbeans.XmlException, java.io.IOException {
          return (uk.nhs.nhsia.datastandards.ecds.CriticalCareUnitFunctionAdultType) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( file, type, null ); }
        
        public static uk.nhs.nhsia.datastandards.ecds.CriticalCareUnitFunctionAdultType parse(java.io.File file, org.apache.xmlbeans.XmlOptions options) throws org.apache.xmlbeans.XmlException, java.io.IOException {
          return (uk.nhs.nhsia.datastandards.ecds.CriticalCareUnitFunctionAdultType) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( file, type, options ); }
        
        public static uk.nhs.nhsia.datastandards.ecds.CriticalCareUnitFunctionAdultType parse(java.net.URL u) throws org.apache.xmlbeans.XmlException, java.io.IOException {
          return (uk.nhs.nhsia.datastandards.ecds.CriticalCareUnitFunctionAdultType) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( u, type, null ); }
        
        public static uk.nhs.nhsia.datastandards.ecds.CriticalCareUnitFunctionAdultType parse(java.net.URL u, org.apache.xmlbeans.XmlOptions options) throws org.apache.xmlbeans.XmlException, java.io.IOException {
          return (uk.nhs.nhsia.datastandards.ecds.CriticalCareUnitFunctionAdultType) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( u, type, options ); }
        
        public static uk.nhs.nhsia.datastandards.ecds.CriticalCareUnitFunctionAdultType parse(java.io.InputStream is) throws org.apache.xmlbeans.XmlException, java.io.IOException {
          return (uk.nhs.nhsia.datastandards.ecds.CriticalCareUnitFunctionAdultType) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( is, type, null ); }
        
        public static uk.nhs.nhsia.datastandards.ecds.CriticalCareUnitFunctionAdultType parse(java.io.InputStream is, org.apache.xmlbeans.XmlOptions options) throws org.apache.xmlbeans.XmlException, java.io.IOException {
          return (uk.nhs.nhsia.datastandards.ecds.CriticalCareUnitFunctionAdultType) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( is, type, options ); }
        
        public static uk.nhs.nhsia.datastandards.ecds.CriticalCareUnitFunctionAdultType parse(java.io.Reader r) throws org.apache.xmlbeans.XmlException, java.io.IOException {
          return (uk.nhs.nhsia.datastandards.ecds.CriticalCareUnitFunctionAdultType) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( r, type, null ); }
        
        public static uk.nhs.nhsia.datastandards.ecds.CriticalCareUnitFunctionAdultType parse(java.io.Reader r, org.apache.xmlbeans.XmlOptions options) throws org.apache.xmlbeans.XmlException, java.io.IOException {
          return (uk.nhs.nhsia.datastandards.ecds.CriticalCareUnitFunctionAdultType) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( r, type, options ); }
        
        public static uk.nhs.nhsia.datastandards.ecds.CriticalCareUnitFunctionAdultType parse(javax.xml.stream.XMLStreamReader sr) throws org.apache.xmlbeans.XmlException {
          return (uk.nhs.nhsia.datastandards.ecds.CriticalCareUnitFunctionAdultType) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( sr, type, null ); }
        
        public static uk.nhs.nhsia.datastandards.ecds.CriticalCareUnitFunctionAdultType parse(javax.xml.stream.XMLStreamReader sr, org.apache.xmlbeans.XmlOptions options) throws org.apache.xmlbeans.XmlException {
          return (uk.nhs.nhsia.datastandards.ecds.CriticalCareUnitFunctionAdultType) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( sr, type, options ); }
        
        public static uk.nhs.nhsia.datastandards.ecds.CriticalCareUnitFunctionAdultType parse(org.w3c.dom.Node node) throws org.apache.xmlbeans.XmlException {
          return (uk.nhs.nhsia.datastandards.ecds.CriticalCareUnitFunctionAdultType) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( node, type, null ); }
        
        public static uk.nhs.nhsia.datastandards.ecds.CriticalCareUnitFunctionAdultType parse(org.w3c.dom.Node node, org.apache.xmlbeans.XmlOptions options) throws org.apache.xmlbeans.XmlException {
          return (uk.nhs.nhsia.datastandards.ecds.CriticalCareUnitFunctionAdultType) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( node, type, options ); }
        
        /** @deprecated {@link org.apache.xmlbeans.xml.stream.XMLInputStream} */
        public static uk.nhs.nhsia.datastandards.ecds.CriticalCareUnitFunctionAdultType parse(org.apache.xmlbeans.xml.stream.XMLInputStream xis) throws org.apache.xmlbeans.XmlException, org.apache.xmlbeans.xml.stream.XMLStreamException {
          return (uk.nhs.nhsia.datastandards.ecds.CriticalCareUnitFunctionAdultType) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( xis, type, null ); }
        
        /** @deprecated {@link org.apache.xmlbeans.xml.stream.XMLInputStream} */
        public static uk.nhs.nhsia.datastandards.ecds.CriticalCareUnitFunctionAdultType parse(org.apache.xmlbeans.xml.stream.XMLInputStream xis, org.apache.xmlbeans.XmlOptions options) throws org.apache.xmlbeans.XmlException, org.apache.xmlbeans.xml.stream.XMLStreamException {
          return (uk.nhs.nhsia.datastandards.ecds.CriticalCareUnitFunctionAdultType) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( xis, type, options ); }
        
        /** @deprecated {@link org.apache.xmlbeans.xml.stream.XMLInputStream} */
        public static org.apache.xmlbeans.xml.stream.XMLInputStream newValidatingXMLInputStream(org.apache.xmlbeans.xml.stream.XMLInputStream xis) throws org.apache.xmlbeans.XmlException, org.apache.xmlbeans.xml.stream.XMLStreamException {
          return org.apache.xmlbeans.XmlBeans.getContextTypeLoader().newValidatingXMLInputStream( xis, type, null ); }
        
        /** @deprecated {@link org.apache.xmlbeans.xml.stream.XMLInputStream} */
        public static org.apache.xmlbeans.xml.stream.XMLInputStream newValidatingXMLInputStream(org.apache.xmlbeans.xml.stream.XMLInputStream xis, org.apache.xmlbeans.XmlOptions options) throws org.apache.xmlbeans.XmlException, org.apache.xmlbeans.xml.stream.XMLStreamException {
          return org.apache.xmlbeans.XmlBeans.getContextTypeLoader().newValidatingXMLInputStream( xis, type, options ); }
        
        private Factory() { } // No instance of this class allowed
    }
}
