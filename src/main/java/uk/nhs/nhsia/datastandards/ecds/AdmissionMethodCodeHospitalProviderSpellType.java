/*
 * XML Type:  AdmissionMethodCode_HospitalProviderSpell_Type
 * Namespace: http://www.nhsia.nhs.uk/DataStandards/XMLschema/CDS/ns
 * Java type: uk.nhs.nhsia.datastandards.ecds.AdmissionMethodCodeHospitalProviderSpellType
 *
 * Automatically generated - do not modify.
 */
package uk.nhs.nhsia.datastandards.ecds;


/**
 * An XML AdmissionMethodCode_HospitalProviderSpell_Type(@http://www.nhsia.nhs.uk/DataStandards/XMLschema/CDS/ns).
 *
 * This is an atomic type that is a restriction of uk.nhs.nhsia.datastandards.ecds.AdmissionMethodCodeHospitalProviderSpellType.
 */
public interface AdmissionMethodCodeHospitalProviderSpellType extends uk.nhs.nhsia.datastandards.ecds.AlphaNumericType
{
    public static final org.apache.xmlbeans.SchemaType type = (org.apache.xmlbeans.SchemaType)
        org.apache.xmlbeans.XmlBeans.typeSystemForClassLoader(AdmissionMethodCodeHospitalProviderSpellType.class.getClassLoader(), "schemaorg_apache_xmlbeans.system.s30C1180FF47174E0C8A992A2D657328B").resolveHandle("admissionmethodcodehospitalproviderspelltype23edtype");
    
    org.apache.xmlbeans.StringEnumAbstractBase enumValue();
    void set(org.apache.xmlbeans.StringEnumAbstractBase e);
    
    static final Enum X_2_A = Enum.forString("2A");
    static final Enum X_2_B = Enum.forString("2B");
    static final Enum X_2_C = Enum.forString("2C");
    static final Enum X_2_D = Enum.forString("2D");
    static final Enum X_11 = Enum.forString("11");
    static final Enum X_12 = Enum.forString("12");
    static final Enum X_13 = Enum.forString("13");
    static final Enum X_21 = Enum.forString("21");
    static final Enum X_22 = Enum.forString("22");
    static final Enum X_23 = Enum.forString("23");
    static final Enum X_24 = Enum.forString("24");
    static final Enum X_25 = Enum.forString("25");
    static final Enum X_28 = Enum.forString("28");
    static final Enum X_31 = Enum.forString("31");
    static final Enum X_32 = Enum.forString("32");
    static final Enum X_81 = Enum.forString("81");
    static final Enum X_82 = Enum.forString("82");
    static final Enum X_83 = Enum.forString("83");
    static final Enum X_98 = Enum.forString("98");
    static final Enum X_99 = Enum.forString("99");
    
    static final int INT_X_2_A = Enum.INT_X_2_A;
    static final int INT_X_2_B = Enum.INT_X_2_B;
    static final int INT_X_2_C = Enum.INT_X_2_C;
    static final int INT_X_2_D = Enum.INT_X_2_D;
    static final int INT_X_11 = Enum.INT_X_11;
    static final int INT_X_12 = Enum.INT_X_12;
    static final int INT_X_13 = Enum.INT_X_13;
    static final int INT_X_21 = Enum.INT_X_21;
    static final int INT_X_22 = Enum.INT_X_22;
    static final int INT_X_23 = Enum.INT_X_23;
    static final int INT_X_24 = Enum.INT_X_24;
    static final int INT_X_25 = Enum.INT_X_25;
    static final int INT_X_28 = Enum.INT_X_28;
    static final int INT_X_31 = Enum.INT_X_31;
    static final int INT_X_32 = Enum.INT_X_32;
    static final int INT_X_81 = Enum.INT_X_81;
    static final int INT_X_82 = Enum.INT_X_82;
    static final int INT_X_83 = Enum.INT_X_83;
    static final int INT_X_98 = Enum.INT_X_98;
    static final int INT_X_99 = Enum.INT_X_99;
    
    /**
     * Enumeration value class for uk.nhs.nhsia.datastandards.ecds.AdmissionMethodCodeHospitalProviderSpellType.
     * These enum values can be used as follows:
     * <pre>
     * enum.toString(); // returns the string value of the enum
     * enum.intValue(); // returns an int value, useful for switches
     * // e.g., case Enum.INT_X_2_A
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
        
        static final int INT_X_2_A = 1;
        static final int INT_X_2_B = 2;
        static final int INT_X_2_C = 3;
        static final int INT_X_2_D = 4;
        static final int INT_X_11 = 5;
        static final int INT_X_12 = 6;
        static final int INT_X_13 = 7;
        static final int INT_X_21 = 8;
        static final int INT_X_22 = 9;
        static final int INT_X_23 = 10;
        static final int INT_X_24 = 11;
        static final int INT_X_25 = 12;
        static final int INT_X_28 = 13;
        static final int INT_X_31 = 14;
        static final int INT_X_32 = 15;
        static final int INT_X_81 = 16;
        static final int INT_X_82 = 17;
        static final int INT_X_83 = 18;
        static final int INT_X_98 = 19;
        static final int INT_X_99 = 20;
        
        public static final org.apache.xmlbeans.StringEnumAbstractBase.Table table =
            new org.apache.xmlbeans.StringEnumAbstractBase.Table
        (
            new Enum[]
            {
                new Enum("2A", INT_X_2_A),
                new Enum("2B", INT_X_2_B),
                new Enum("2C", INT_X_2_C),
                new Enum("2D", INT_X_2_D),
                new Enum("11", INT_X_11),
                new Enum("12", INT_X_12),
                new Enum("13", INT_X_13),
                new Enum("21", INT_X_21),
                new Enum("22", INT_X_22),
                new Enum("23", INT_X_23),
                new Enum("24", INT_X_24),
                new Enum("25", INT_X_25),
                new Enum("28", INT_X_28),
                new Enum("31", INT_X_31),
                new Enum("32", INT_X_32),
                new Enum("81", INT_X_81),
                new Enum("82", INT_X_82),
                new Enum("83", INT_X_83),
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
        public static uk.nhs.nhsia.datastandards.ecds.AdmissionMethodCodeHospitalProviderSpellType newValue(java.lang.Object obj) {
          return (uk.nhs.nhsia.datastandards.ecds.AdmissionMethodCodeHospitalProviderSpellType) type.newValue( obj ); }
        
        public static uk.nhs.nhsia.datastandards.ecds.AdmissionMethodCodeHospitalProviderSpellType newInstance() {
          return (uk.nhs.nhsia.datastandards.ecds.AdmissionMethodCodeHospitalProviderSpellType) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().newInstance( type, null ); }
        
        public static uk.nhs.nhsia.datastandards.ecds.AdmissionMethodCodeHospitalProviderSpellType newInstance(org.apache.xmlbeans.XmlOptions options) {
          return (uk.nhs.nhsia.datastandards.ecds.AdmissionMethodCodeHospitalProviderSpellType) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().newInstance( type, options ); }
        
        /** @param xmlAsString the string value to parse */
        public static uk.nhs.nhsia.datastandards.ecds.AdmissionMethodCodeHospitalProviderSpellType parse(java.lang.String xmlAsString) throws org.apache.xmlbeans.XmlException {
          return (uk.nhs.nhsia.datastandards.ecds.AdmissionMethodCodeHospitalProviderSpellType) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( xmlAsString, type, null ); }
        
        public static uk.nhs.nhsia.datastandards.ecds.AdmissionMethodCodeHospitalProviderSpellType parse(java.lang.String xmlAsString, org.apache.xmlbeans.XmlOptions options) throws org.apache.xmlbeans.XmlException {
          return (uk.nhs.nhsia.datastandards.ecds.AdmissionMethodCodeHospitalProviderSpellType) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( xmlAsString, type, options ); }
        
        /** @param file the file from which to load an xml document */
        public static uk.nhs.nhsia.datastandards.ecds.AdmissionMethodCodeHospitalProviderSpellType parse(java.io.File file) throws org.apache.xmlbeans.XmlException, java.io.IOException {
          return (uk.nhs.nhsia.datastandards.ecds.AdmissionMethodCodeHospitalProviderSpellType) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( file, type, null ); }
        
        public static uk.nhs.nhsia.datastandards.ecds.AdmissionMethodCodeHospitalProviderSpellType parse(java.io.File file, org.apache.xmlbeans.XmlOptions options) throws org.apache.xmlbeans.XmlException, java.io.IOException {
          return (uk.nhs.nhsia.datastandards.ecds.AdmissionMethodCodeHospitalProviderSpellType) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( file, type, options ); }
        
        public static uk.nhs.nhsia.datastandards.ecds.AdmissionMethodCodeHospitalProviderSpellType parse(java.net.URL u) throws org.apache.xmlbeans.XmlException, java.io.IOException {
          return (uk.nhs.nhsia.datastandards.ecds.AdmissionMethodCodeHospitalProviderSpellType) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( u, type, null ); }
        
        public static uk.nhs.nhsia.datastandards.ecds.AdmissionMethodCodeHospitalProviderSpellType parse(java.net.URL u, org.apache.xmlbeans.XmlOptions options) throws org.apache.xmlbeans.XmlException, java.io.IOException {
          return (uk.nhs.nhsia.datastandards.ecds.AdmissionMethodCodeHospitalProviderSpellType) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( u, type, options ); }
        
        public static uk.nhs.nhsia.datastandards.ecds.AdmissionMethodCodeHospitalProviderSpellType parse(java.io.InputStream is) throws org.apache.xmlbeans.XmlException, java.io.IOException {
          return (uk.nhs.nhsia.datastandards.ecds.AdmissionMethodCodeHospitalProviderSpellType) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( is, type, null ); }
        
        public static uk.nhs.nhsia.datastandards.ecds.AdmissionMethodCodeHospitalProviderSpellType parse(java.io.InputStream is, org.apache.xmlbeans.XmlOptions options) throws org.apache.xmlbeans.XmlException, java.io.IOException {
          return (uk.nhs.nhsia.datastandards.ecds.AdmissionMethodCodeHospitalProviderSpellType) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( is, type, options ); }
        
        public static uk.nhs.nhsia.datastandards.ecds.AdmissionMethodCodeHospitalProviderSpellType parse(java.io.Reader r) throws org.apache.xmlbeans.XmlException, java.io.IOException {
          return (uk.nhs.nhsia.datastandards.ecds.AdmissionMethodCodeHospitalProviderSpellType) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( r, type, null ); }
        
        public static uk.nhs.nhsia.datastandards.ecds.AdmissionMethodCodeHospitalProviderSpellType parse(java.io.Reader r, org.apache.xmlbeans.XmlOptions options) throws org.apache.xmlbeans.XmlException, java.io.IOException {
          return (uk.nhs.nhsia.datastandards.ecds.AdmissionMethodCodeHospitalProviderSpellType) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( r, type, options ); }
        
        public static uk.nhs.nhsia.datastandards.ecds.AdmissionMethodCodeHospitalProviderSpellType parse(javax.xml.stream.XMLStreamReader sr) throws org.apache.xmlbeans.XmlException {
          return (uk.nhs.nhsia.datastandards.ecds.AdmissionMethodCodeHospitalProviderSpellType) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( sr, type, null ); }
        
        public static uk.nhs.nhsia.datastandards.ecds.AdmissionMethodCodeHospitalProviderSpellType parse(javax.xml.stream.XMLStreamReader sr, org.apache.xmlbeans.XmlOptions options) throws org.apache.xmlbeans.XmlException {
          return (uk.nhs.nhsia.datastandards.ecds.AdmissionMethodCodeHospitalProviderSpellType) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( sr, type, options ); }
        
        public static uk.nhs.nhsia.datastandards.ecds.AdmissionMethodCodeHospitalProviderSpellType parse(org.w3c.dom.Node node) throws org.apache.xmlbeans.XmlException {
          return (uk.nhs.nhsia.datastandards.ecds.AdmissionMethodCodeHospitalProviderSpellType) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( node, type, null ); }
        
        public static uk.nhs.nhsia.datastandards.ecds.AdmissionMethodCodeHospitalProviderSpellType parse(org.w3c.dom.Node node, org.apache.xmlbeans.XmlOptions options) throws org.apache.xmlbeans.XmlException {
          return (uk.nhs.nhsia.datastandards.ecds.AdmissionMethodCodeHospitalProviderSpellType) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( node, type, options ); }
        
        /** @deprecated {@link org.apache.xmlbeans.xml.stream.XMLInputStream} */
        public static uk.nhs.nhsia.datastandards.ecds.AdmissionMethodCodeHospitalProviderSpellType parse(org.apache.xmlbeans.xml.stream.XMLInputStream xis) throws org.apache.xmlbeans.XmlException, org.apache.xmlbeans.xml.stream.XMLStreamException {
          return (uk.nhs.nhsia.datastandards.ecds.AdmissionMethodCodeHospitalProviderSpellType) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( xis, type, null ); }
        
        /** @deprecated {@link org.apache.xmlbeans.xml.stream.XMLInputStream} */
        public static uk.nhs.nhsia.datastandards.ecds.AdmissionMethodCodeHospitalProviderSpellType parse(org.apache.xmlbeans.xml.stream.XMLInputStream xis, org.apache.xmlbeans.XmlOptions options) throws org.apache.xmlbeans.XmlException, org.apache.xmlbeans.xml.stream.XMLStreamException {
          return (uk.nhs.nhsia.datastandards.ecds.AdmissionMethodCodeHospitalProviderSpellType) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( xis, type, options ); }
        
        /** @deprecated {@link org.apache.xmlbeans.xml.stream.XMLInputStream} */
        public static org.apache.xmlbeans.xml.stream.XMLInputStream newValidatingXMLInputStream(org.apache.xmlbeans.xml.stream.XMLInputStream xis) throws org.apache.xmlbeans.XmlException, org.apache.xmlbeans.xml.stream.XMLStreamException {
          return org.apache.xmlbeans.XmlBeans.getContextTypeLoader().newValidatingXMLInputStream( xis, type, null ); }
        
        /** @deprecated {@link org.apache.xmlbeans.xml.stream.XMLInputStream} */
        public static org.apache.xmlbeans.xml.stream.XMLInputStream newValidatingXMLInputStream(org.apache.xmlbeans.xml.stream.XMLInputStream xis, org.apache.xmlbeans.XmlOptions options) throws org.apache.xmlbeans.XmlException, org.apache.xmlbeans.xml.stream.XMLStreamException {
          return org.apache.xmlbeans.XmlBeans.getContextTypeLoader().newValidatingXMLInputStream( xis, type, options ); }
        
        private Factory() { } // No instance of this class allowed
    }
}
