/*
 * XML Type:  ReferralToTreatmentPeriod_Status_Type
 * Namespace: http://www.nhsia.nhs.uk/DataStandards/XMLschema/CDS/ns
 * Java type: uk.nhs.nhsia.datastandards.ecds.ReferralToTreatmentPeriodStatusType
 *
 * Automatically generated - do not modify.
 */
package uk.nhs.nhsia.datastandards.ecds;


/**
 * An XML ReferralToTreatmentPeriod_Status_Type(@http://www.nhsia.nhs.uk/DataStandards/XMLschema/CDS/ns).
 *
 * This is an atomic type that is a restriction of uk.nhs.nhsia.datastandards.ecds.ReferralToTreatmentPeriodStatusType.
 */
public interface ReferralToTreatmentPeriodStatusType extends uk.nhs.nhsia.datastandards.ecds.AlphaNumericType
{
    public static final org.apache.xmlbeans.SchemaType type = (org.apache.xmlbeans.SchemaType)
        org.apache.xmlbeans.XmlBeans.typeSystemForClassLoader(ReferralToTreatmentPeriodStatusType.class.getClassLoader(), "schemaorg_apache_xmlbeans.system.s30C1180FF47174E0C8A992A2D657328B").resolveHandle("referraltotreatmentperiodstatustype569atype");
    
    org.apache.xmlbeans.StringEnumAbstractBase enumValue();
    void set(org.apache.xmlbeans.StringEnumAbstractBase e);
    
    static final Enum X_10 = Enum.forString("10");
    static final Enum X_11 = Enum.forString("11");
    static final Enum X_12 = Enum.forString("12");
    static final Enum X_20 = Enum.forString("20");
    static final Enum X_21 = Enum.forString("21");
    static final Enum X_30 = Enum.forString("30");
    static final Enum X_31 = Enum.forString("31");
    static final Enum X_32 = Enum.forString("32");
    static final Enum X_33 = Enum.forString("33");
    static final Enum X_34 = Enum.forString("34");
    static final Enum X_35 = Enum.forString("35");
    static final Enum X_36 = Enum.forString("36");
    static final Enum X_90 = Enum.forString("90");
    static final Enum X_91 = Enum.forString("91");
    static final Enum X_92 = Enum.forString("92");
    static final Enum X_98 = Enum.forString("98");
    static final Enum X_99 = Enum.forString("99");
    
    static final int INT_X_10 = Enum.INT_X_10;
    static final int INT_X_11 = Enum.INT_X_11;
    static final int INT_X_12 = Enum.INT_X_12;
    static final int INT_X_20 = Enum.INT_X_20;
    static final int INT_X_21 = Enum.INT_X_21;
    static final int INT_X_30 = Enum.INT_X_30;
    static final int INT_X_31 = Enum.INT_X_31;
    static final int INT_X_32 = Enum.INT_X_32;
    static final int INT_X_33 = Enum.INT_X_33;
    static final int INT_X_34 = Enum.INT_X_34;
    static final int INT_X_35 = Enum.INT_X_35;
    static final int INT_X_36 = Enum.INT_X_36;
    static final int INT_X_90 = Enum.INT_X_90;
    static final int INT_X_91 = Enum.INT_X_91;
    static final int INT_X_92 = Enum.INT_X_92;
    static final int INT_X_98 = Enum.INT_X_98;
    static final int INT_X_99 = Enum.INT_X_99;
    
    /**
     * Enumeration value class for uk.nhs.nhsia.datastandards.ecds.ReferralToTreatmentPeriodStatusType.
     * These enum values can be used as follows:
     * <pre>
     * enum.toString(); // returns the string value of the enum
     * enum.intValue(); // returns an int value, useful for switches
     * // e.g., case Enum.INT_X_10
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
        
        static final int INT_X_10 = 1;
        static final int INT_X_11 = 2;
        static final int INT_X_12 = 3;
        static final int INT_X_20 = 4;
        static final int INT_X_21 = 5;
        static final int INT_X_30 = 6;
        static final int INT_X_31 = 7;
        static final int INT_X_32 = 8;
        static final int INT_X_33 = 9;
        static final int INT_X_34 = 10;
        static final int INT_X_35 = 11;
        static final int INT_X_36 = 12;
        static final int INT_X_90 = 13;
        static final int INT_X_91 = 14;
        static final int INT_X_92 = 15;
        static final int INT_X_98 = 16;
        static final int INT_X_99 = 17;
        
        public static final org.apache.xmlbeans.StringEnumAbstractBase.Table table =
            new org.apache.xmlbeans.StringEnumAbstractBase.Table
        (
            new Enum[]
            {
                new Enum("10", INT_X_10),
                new Enum("11", INT_X_11),
                new Enum("12", INT_X_12),
                new Enum("20", INT_X_20),
                new Enum("21", INT_X_21),
                new Enum("30", INT_X_30),
                new Enum("31", INT_X_31),
                new Enum("32", INT_X_32),
                new Enum("33", INT_X_33),
                new Enum("34", INT_X_34),
                new Enum("35", INT_X_35),
                new Enum("36", INT_X_36),
                new Enum("90", INT_X_90),
                new Enum("91", INT_X_91),
                new Enum("92", INT_X_92),
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
        public static uk.nhs.nhsia.datastandards.ecds.ReferralToTreatmentPeriodStatusType newValue(java.lang.Object obj) {
          return (uk.nhs.nhsia.datastandards.ecds.ReferralToTreatmentPeriodStatusType) type.newValue( obj ); }
        
        public static uk.nhs.nhsia.datastandards.ecds.ReferralToTreatmentPeriodStatusType newInstance() {
          return (uk.nhs.nhsia.datastandards.ecds.ReferralToTreatmentPeriodStatusType) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().newInstance( type, null ); }
        
        public static uk.nhs.nhsia.datastandards.ecds.ReferralToTreatmentPeriodStatusType newInstance(org.apache.xmlbeans.XmlOptions options) {
          return (uk.nhs.nhsia.datastandards.ecds.ReferralToTreatmentPeriodStatusType) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().newInstance( type, options ); }
        
        /** @param xmlAsString the string value to parse */
        public static uk.nhs.nhsia.datastandards.ecds.ReferralToTreatmentPeriodStatusType parse(java.lang.String xmlAsString) throws org.apache.xmlbeans.XmlException {
          return (uk.nhs.nhsia.datastandards.ecds.ReferralToTreatmentPeriodStatusType) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( xmlAsString, type, null ); }
        
        public static uk.nhs.nhsia.datastandards.ecds.ReferralToTreatmentPeriodStatusType parse(java.lang.String xmlAsString, org.apache.xmlbeans.XmlOptions options) throws org.apache.xmlbeans.XmlException {
          return (uk.nhs.nhsia.datastandards.ecds.ReferralToTreatmentPeriodStatusType) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( xmlAsString, type, options ); }
        
        /** @param file the file from which to load an xml document */
        public static uk.nhs.nhsia.datastandards.ecds.ReferralToTreatmentPeriodStatusType parse(java.io.File file) throws org.apache.xmlbeans.XmlException, java.io.IOException {
          return (uk.nhs.nhsia.datastandards.ecds.ReferralToTreatmentPeriodStatusType) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( file, type, null ); }
        
        public static uk.nhs.nhsia.datastandards.ecds.ReferralToTreatmentPeriodStatusType parse(java.io.File file, org.apache.xmlbeans.XmlOptions options) throws org.apache.xmlbeans.XmlException, java.io.IOException {
          return (uk.nhs.nhsia.datastandards.ecds.ReferralToTreatmentPeriodStatusType) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( file, type, options ); }
        
        public static uk.nhs.nhsia.datastandards.ecds.ReferralToTreatmentPeriodStatusType parse(java.net.URL u) throws org.apache.xmlbeans.XmlException, java.io.IOException {
          return (uk.nhs.nhsia.datastandards.ecds.ReferralToTreatmentPeriodStatusType) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( u, type, null ); }
        
        public static uk.nhs.nhsia.datastandards.ecds.ReferralToTreatmentPeriodStatusType parse(java.net.URL u, org.apache.xmlbeans.XmlOptions options) throws org.apache.xmlbeans.XmlException, java.io.IOException {
          return (uk.nhs.nhsia.datastandards.ecds.ReferralToTreatmentPeriodStatusType) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( u, type, options ); }
        
        public static uk.nhs.nhsia.datastandards.ecds.ReferralToTreatmentPeriodStatusType parse(java.io.InputStream is) throws org.apache.xmlbeans.XmlException, java.io.IOException {
          return (uk.nhs.nhsia.datastandards.ecds.ReferralToTreatmentPeriodStatusType) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( is, type, null ); }
        
        public static uk.nhs.nhsia.datastandards.ecds.ReferralToTreatmentPeriodStatusType parse(java.io.InputStream is, org.apache.xmlbeans.XmlOptions options) throws org.apache.xmlbeans.XmlException, java.io.IOException {
          return (uk.nhs.nhsia.datastandards.ecds.ReferralToTreatmentPeriodStatusType) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( is, type, options ); }
        
        public static uk.nhs.nhsia.datastandards.ecds.ReferralToTreatmentPeriodStatusType parse(java.io.Reader r) throws org.apache.xmlbeans.XmlException, java.io.IOException {
          return (uk.nhs.nhsia.datastandards.ecds.ReferralToTreatmentPeriodStatusType) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( r, type, null ); }
        
        public static uk.nhs.nhsia.datastandards.ecds.ReferralToTreatmentPeriodStatusType parse(java.io.Reader r, org.apache.xmlbeans.XmlOptions options) throws org.apache.xmlbeans.XmlException, java.io.IOException {
          return (uk.nhs.nhsia.datastandards.ecds.ReferralToTreatmentPeriodStatusType) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( r, type, options ); }
        
        public static uk.nhs.nhsia.datastandards.ecds.ReferralToTreatmentPeriodStatusType parse(javax.xml.stream.XMLStreamReader sr) throws org.apache.xmlbeans.XmlException {
          return (uk.nhs.nhsia.datastandards.ecds.ReferralToTreatmentPeriodStatusType) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( sr, type, null ); }
        
        public static uk.nhs.nhsia.datastandards.ecds.ReferralToTreatmentPeriodStatusType parse(javax.xml.stream.XMLStreamReader sr, org.apache.xmlbeans.XmlOptions options) throws org.apache.xmlbeans.XmlException {
          return (uk.nhs.nhsia.datastandards.ecds.ReferralToTreatmentPeriodStatusType) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( sr, type, options ); }
        
        public static uk.nhs.nhsia.datastandards.ecds.ReferralToTreatmentPeriodStatusType parse(org.w3c.dom.Node node) throws org.apache.xmlbeans.XmlException {
          return (uk.nhs.nhsia.datastandards.ecds.ReferralToTreatmentPeriodStatusType) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( node, type, null ); }
        
        public static uk.nhs.nhsia.datastandards.ecds.ReferralToTreatmentPeriodStatusType parse(org.w3c.dom.Node node, org.apache.xmlbeans.XmlOptions options) throws org.apache.xmlbeans.XmlException {
          return (uk.nhs.nhsia.datastandards.ecds.ReferralToTreatmentPeriodStatusType) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( node, type, options ); }
        
        /** @deprecated {@link org.apache.xmlbeans.xml.stream.XMLInputStream} */
        public static uk.nhs.nhsia.datastandards.ecds.ReferralToTreatmentPeriodStatusType parse(org.apache.xmlbeans.xml.stream.XMLInputStream xis) throws org.apache.xmlbeans.XmlException, org.apache.xmlbeans.xml.stream.XMLStreamException {
          return (uk.nhs.nhsia.datastandards.ecds.ReferralToTreatmentPeriodStatusType) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( xis, type, null ); }
        
        /** @deprecated {@link org.apache.xmlbeans.xml.stream.XMLInputStream} */
        public static uk.nhs.nhsia.datastandards.ecds.ReferralToTreatmentPeriodStatusType parse(org.apache.xmlbeans.xml.stream.XMLInputStream xis, org.apache.xmlbeans.XmlOptions options) throws org.apache.xmlbeans.XmlException, org.apache.xmlbeans.xml.stream.XMLStreamException {
          return (uk.nhs.nhsia.datastandards.ecds.ReferralToTreatmentPeriodStatusType) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( xis, type, options ); }
        
        /** @deprecated {@link org.apache.xmlbeans.xml.stream.XMLInputStream} */
        public static org.apache.xmlbeans.xml.stream.XMLInputStream newValidatingXMLInputStream(org.apache.xmlbeans.xml.stream.XMLInputStream xis) throws org.apache.xmlbeans.XmlException, org.apache.xmlbeans.xml.stream.XMLStreamException {
          return org.apache.xmlbeans.XmlBeans.getContextTypeLoader().newValidatingXMLInputStream( xis, type, null ); }
        
        /** @deprecated {@link org.apache.xmlbeans.xml.stream.XMLInputStream} */
        public static org.apache.xmlbeans.xml.stream.XMLInputStream newValidatingXMLInputStream(org.apache.xmlbeans.xml.stream.XMLInputStream xis, org.apache.xmlbeans.XmlOptions options) throws org.apache.xmlbeans.XmlException, org.apache.xmlbeans.xml.stream.XMLStreamException {
          return org.apache.xmlbeans.XmlBeans.getContextTypeLoader().newValidatingXMLInputStream( xis, type, options ); }
        
        private Factory() { } // No instance of this class allowed
    }
}
