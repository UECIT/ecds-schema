/*
 * XML Type:  SourceOfAdmissionCode_HospitalProviderSpell_Type
 * Namespace: http://www.nhsia.nhs.uk/DataStandards/XMLschema/CDS/ns
 * Java type: uk.nhs.nhsia.datastandards.ecds.SourceOfAdmissionCodeHospitalProviderSpellType
 *
 * Automatically generated - do not modify.
 */
package uk.nhs.nhsia.datastandards.ecds;


/**
 * An XML SourceOfAdmissionCode_HospitalProviderSpell_Type(@http://www.nhsia.nhs.uk/DataStandards/XMLschema/CDS/ns).
 *
 * This is an atomic type that is a restriction of uk.nhs.nhsia.datastandards.ecds.SourceOfAdmissionCodeHospitalProviderSpellType.
 */
public interface SourceOfAdmissionCodeHospitalProviderSpellType extends uk.nhs.nhsia.datastandards.ecds.AlphaNumericType
{
    public static final org.apache.xmlbeans.SchemaType type = (org.apache.xmlbeans.SchemaType)
        org.apache.xmlbeans.XmlBeans.typeSystemForClassLoader(SourceOfAdmissionCodeHospitalProviderSpellType.class.getClassLoader(), "schemaorg_apache_xmlbeans.system.s30C1180FF47174E0C8A992A2D657328B").resolveHandle("sourceofadmissioncodehospitalproviderspelltype4cfatype");
    
    org.apache.xmlbeans.StringEnumAbstractBase enumValue();
    void set(org.apache.xmlbeans.StringEnumAbstractBase e);
    
    static final Enum X_19 = Enum.forString("19");
    static final Enum X_29 = Enum.forString("29");
    static final Enum X_39 = Enum.forString("39");
    static final Enum X_49 = Enum.forString("49");
    static final Enum X_51 = Enum.forString("51");
    static final Enum X_52 = Enum.forString("52");
    static final Enum X_53 = Enum.forString("53");
    static final Enum X_54 = Enum.forString("54");
    static final Enum X_65 = Enum.forString("65");
    static final Enum X_66 = Enum.forString("66");
    static final Enum X_79 = Enum.forString("79");
    static final Enum X_85 = Enum.forString("85");
    static final Enum X_87 = Enum.forString("87");
    static final Enum X_88 = Enum.forString("88");
    static final Enum X_98 = Enum.forString("98");
    static final Enum X_99 = Enum.forString("99");
    
    static final int INT_X_19 = Enum.INT_X_19;
    static final int INT_X_29 = Enum.INT_X_29;
    static final int INT_X_39 = Enum.INT_X_39;
    static final int INT_X_49 = Enum.INT_X_49;
    static final int INT_X_51 = Enum.INT_X_51;
    static final int INT_X_52 = Enum.INT_X_52;
    static final int INT_X_53 = Enum.INT_X_53;
    static final int INT_X_54 = Enum.INT_X_54;
    static final int INT_X_65 = Enum.INT_X_65;
    static final int INT_X_66 = Enum.INT_X_66;
    static final int INT_X_79 = Enum.INT_X_79;
    static final int INT_X_85 = Enum.INT_X_85;
    static final int INT_X_87 = Enum.INT_X_87;
    static final int INT_X_88 = Enum.INT_X_88;
    static final int INT_X_98 = Enum.INT_X_98;
    static final int INT_X_99 = Enum.INT_X_99;
    
    /**
     * Enumeration value class for uk.nhs.nhsia.datastandards.ecds.SourceOfAdmissionCodeHospitalProviderSpellType.
     * These enum values can be used as follows:
     * <pre>
     * enum.toString(); // returns the string value of the enum
     * enum.intValue(); // returns an int value, useful for switches
     * // e.g., case Enum.INT_X_19
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
        
        static final int INT_X_19 = 1;
        static final int INT_X_29 = 2;
        static final int INT_X_39 = 3;
        static final int INT_X_49 = 4;
        static final int INT_X_51 = 5;
        static final int INT_X_52 = 6;
        static final int INT_X_53 = 7;
        static final int INT_X_54 = 8;
        static final int INT_X_65 = 9;
        static final int INT_X_66 = 10;
        static final int INT_X_79 = 11;
        static final int INT_X_85 = 12;
        static final int INT_X_87 = 13;
        static final int INT_X_88 = 14;
        static final int INT_X_98 = 15;
        static final int INT_X_99 = 16;
        
        public static final org.apache.xmlbeans.StringEnumAbstractBase.Table table =
            new org.apache.xmlbeans.StringEnumAbstractBase.Table
        (
            new Enum[]
            {
                new Enum("19", INT_X_19),
                new Enum("29", INT_X_29),
                new Enum("39", INT_X_39),
                new Enum("49", INT_X_49),
                new Enum("51", INT_X_51),
                new Enum("52", INT_X_52),
                new Enum("53", INT_X_53),
                new Enum("54", INT_X_54),
                new Enum("65", INT_X_65),
                new Enum("66", INT_X_66),
                new Enum("79", INT_X_79),
                new Enum("85", INT_X_85),
                new Enum("87", INT_X_87),
                new Enum("88", INT_X_88),
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
        public static uk.nhs.nhsia.datastandards.ecds.SourceOfAdmissionCodeHospitalProviderSpellType newValue(java.lang.Object obj) {
          return (uk.nhs.nhsia.datastandards.ecds.SourceOfAdmissionCodeHospitalProviderSpellType) type.newValue( obj ); }
        
        public static uk.nhs.nhsia.datastandards.ecds.SourceOfAdmissionCodeHospitalProviderSpellType newInstance() {
          return (uk.nhs.nhsia.datastandards.ecds.SourceOfAdmissionCodeHospitalProviderSpellType) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().newInstance( type, null ); }
        
        public static uk.nhs.nhsia.datastandards.ecds.SourceOfAdmissionCodeHospitalProviderSpellType newInstance(org.apache.xmlbeans.XmlOptions options) {
          return (uk.nhs.nhsia.datastandards.ecds.SourceOfAdmissionCodeHospitalProviderSpellType) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().newInstance( type, options ); }
        
        /** @param xmlAsString the string value to parse */
        public static uk.nhs.nhsia.datastandards.ecds.SourceOfAdmissionCodeHospitalProviderSpellType parse(java.lang.String xmlAsString) throws org.apache.xmlbeans.XmlException {
          return (uk.nhs.nhsia.datastandards.ecds.SourceOfAdmissionCodeHospitalProviderSpellType) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( xmlAsString, type, null ); }
        
        public static uk.nhs.nhsia.datastandards.ecds.SourceOfAdmissionCodeHospitalProviderSpellType parse(java.lang.String xmlAsString, org.apache.xmlbeans.XmlOptions options) throws org.apache.xmlbeans.XmlException {
          return (uk.nhs.nhsia.datastandards.ecds.SourceOfAdmissionCodeHospitalProviderSpellType) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( xmlAsString, type, options ); }
        
        /** @param file the file from which to load an xml document */
        public static uk.nhs.nhsia.datastandards.ecds.SourceOfAdmissionCodeHospitalProviderSpellType parse(java.io.File file) throws org.apache.xmlbeans.XmlException, java.io.IOException {
          return (uk.nhs.nhsia.datastandards.ecds.SourceOfAdmissionCodeHospitalProviderSpellType) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( file, type, null ); }
        
        public static uk.nhs.nhsia.datastandards.ecds.SourceOfAdmissionCodeHospitalProviderSpellType parse(java.io.File file, org.apache.xmlbeans.XmlOptions options) throws org.apache.xmlbeans.XmlException, java.io.IOException {
          return (uk.nhs.nhsia.datastandards.ecds.SourceOfAdmissionCodeHospitalProviderSpellType) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( file, type, options ); }
        
        public static uk.nhs.nhsia.datastandards.ecds.SourceOfAdmissionCodeHospitalProviderSpellType parse(java.net.URL u) throws org.apache.xmlbeans.XmlException, java.io.IOException {
          return (uk.nhs.nhsia.datastandards.ecds.SourceOfAdmissionCodeHospitalProviderSpellType) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( u, type, null ); }
        
        public static uk.nhs.nhsia.datastandards.ecds.SourceOfAdmissionCodeHospitalProviderSpellType parse(java.net.URL u, org.apache.xmlbeans.XmlOptions options) throws org.apache.xmlbeans.XmlException, java.io.IOException {
          return (uk.nhs.nhsia.datastandards.ecds.SourceOfAdmissionCodeHospitalProviderSpellType) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( u, type, options ); }
        
        public static uk.nhs.nhsia.datastandards.ecds.SourceOfAdmissionCodeHospitalProviderSpellType parse(java.io.InputStream is) throws org.apache.xmlbeans.XmlException, java.io.IOException {
          return (uk.nhs.nhsia.datastandards.ecds.SourceOfAdmissionCodeHospitalProviderSpellType) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( is, type, null ); }
        
        public static uk.nhs.nhsia.datastandards.ecds.SourceOfAdmissionCodeHospitalProviderSpellType parse(java.io.InputStream is, org.apache.xmlbeans.XmlOptions options) throws org.apache.xmlbeans.XmlException, java.io.IOException {
          return (uk.nhs.nhsia.datastandards.ecds.SourceOfAdmissionCodeHospitalProviderSpellType) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( is, type, options ); }
        
        public static uk.nhs.nhsia.datastandards.ecds.SourceOfAdmissionCodeHospitalProviderSpellType parse(java.io.Reader r) throws org.apache.xmlbeans.XmlException, java.io.IOException {
          return (uk.nhs.nhsia.datastandards.ecds.SourceOfAdmissionCodeHospitalProviderSpellType) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( r, type, null ); }
        
        public static uk.nhs.nhsia.datastandards.ecds.SourceOfAdmissionCodeHospitalProviderSpellType parse(java.io.Reader r, org.apache.xmlbeans.XmlOptions options) throws org.apache.xmlbeans.XmlException, java.io.IOException {
          return (uk.nhs.nhsia.datastandards.ecds.SourceOfAdmissionCodeHospitalProviderSpellType) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( r, type, options ); }
        
        public static uk.nhs.nhsia.datastandards.ecds.SourceOfAdmissionCodeHospitalProviderSpellType parse(javax.xml.stream.XMLStreamReader sr) throws org.apache.xmlbeans.XmlException {
          return (uk.nhs.nhsia.datastandards.ecds.SourceOfAdmissionCodeHospitalProviderSpellType) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( sr, type, null ); }
        
        public static uk.nhs.nhsia.datastandards.ecds.SourceOfAdmissionCodeHospitalProviderSpellType parse(javax.xml.stream.XMLStreamReader sr, org.apache.xmlbeans.XmlOptions options) throws org.apache.xmlbeans.XmlException {
          return (uk.nhs.nhsia.datastandards.ecds.SourceOfAdmissionCodeHospitalProviderSpellType) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( sr, type, options ); }
        
        public static uk.nhs.nhsia.datastandards.ecds.SourceOfAdmissionCodeHospitalProviderSpellType parse(org.w3c.dom.Node node) throws org.apache.xmlbeans.XmlException {
          return (uk.nhs.nhsia.datastandards.ecds.SourceOfAdmissionCodeHospitalProviderSpellType) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( node, type, null ); }
        
        public static uk.nhs.nhsia.datastandards.ecds.SourceOfAdmissionCodeHospitalProviderSpellType parse(org.w3c.dom.Node node, org.apache.xmlbeans.XmlOptions options) throws org.apache.xmlbeans.XmlException {
          return (uk.nhs.nhsia.datastandards.ecds.SourceOfAdmissionCodeHospitalProviderSpellType) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( node, type, options ); }
        
        /** @deprecated {@link org.apache.xmlbeans.xml.stream.XMLInputStream} */
        public static uk.nhs.nhsia.datastandards.ecds.SourceOfAdmissionCodeHospitalProviderSpellType parse(org.apache.xmlbeans.xml.stream.XMLInputStream xis) throws org.apache.xmlbeans.XmlException, org.apache.xmlbeans.xml.stream.XMLStreamException {
          return (uk.nhs.nhsia.datastandards.ecds.SourceOfAdmissionCodeHospitalProviderSpellType) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( xis, type, null ); }
        
        /** @deprecated {@link org.apache.xmlbeans.xml.stream.XMLInputStream} */
        public static uk.nhs.nhsia.datastandards.ecds.SourceOfAdmissionCodeHospitalProviderSpellType parse(org.apache.xmlbeans.xml.stream.XMLInputStream xis, org.apache.xmlbeans.XmlOptions options) throws org.apache.xmlbeans.XmlException, org.apache.xmlbeans.xml.stream.XMLStreamException {
          return (uk.nhs.nhsia.datastandards.ecds.SourceOfAdmissionCodeHospitalProviderSpellType) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( xis, type, options ); }
        
        /** @deprecated {@link org.apache.xmlbeans.xml.stream.XMLInputStream} */
        public static org.apache.xmlbeans.xml.stream.XMLInputStream newValidatingXMLInputStream(org.apache.xmlbeans.xml.stream.XMLInputStream xis) throws org.apache.xmlbeans.XmlException, org.apache.xmlbeans.xml.stream.XMLStreamException {
          return org.apache.xmlbeans.XmlBeans.getContextTypeLoader().newValidatingXMLInputStream( xis, type, null ); }
        
        /** @deprecated {@link org.apache.xmlbeans.xml.stream.XMLInputStream} */
        public static org.apache.xmlbeans.xml.stream.XMLInputStream newValidatingXMLInputStream(org.apache.xmlbeans.xml.stream.XMLInputStream xis, org.apache.xmlbeans.XmlOptions options) throws org.apache.xmlbeans.XmlException, org.apache.xmlbeans.xml.stream.XMLStreamException {
          return org.apache.xmlbeans.XmlBeans.getContextTypeLoader().newValidatingXMLInputStream( xis, type, options ); }
        
        private Factory() { } // No instance of this class allowed
    }
}
