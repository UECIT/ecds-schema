/*
 * XML Type:  ActivityLocationType_Type
 * Namespace: http://www.nhsia.nhs.uk/DataStandards/XMLschema/CDS/ns
 * Java type: uk.nhs.nhsia.datastandards.ecds.ActivityLocationTypeType
 *
 * Automatically generated - do not modify.
 */
package uk.nhs.nhsia.datastandards.ecds;


/**
 * An XML ActivityLocationType_Type(@http://www.nhsia.nhs.uk/DataStandards/XMLschema/CDS/ns).
 *
 * This is an atomic type that is a restriction of uk.nhs.nhsia.datastandards.ecds.ActivityLocationTypeType.
 */
public interface ActivityLocationTypeType extends uk.nhs.nhsia.datastandards.ecds.AlphaNumericType
{
    public static final org.apache.xmlbeans.SchemaType type = (org.apache.xmlbeans.SchemaType)
        org.apache.xmlbeans.XmlBeans.typeSystemForClassLoader(ActivityLocationTypeType.class.getClassLoader(), "schemaorg_apache_xmlbeans.system.s30C1180FF47174E0C8A992A2D657328B").resolveHandle("activitylocationtypetyped488type");
    
    org.apache.xmlbeans.StringEnumAbstractBase enumValue();
    void set(org.apache.xmlbeans.StringEnumAbstractBase e);
    
    static final Enum A_01 = Enum.forString("A01");
    static final Enum A_02 = Enum.forString("A02");
    static final Enum A_03 = Enum.forString("A03");
    static final Enum A_04 = Enum.forString("A04");
    static final Enum B_01 = Enum.forString("B01");
    static final Enum B_02 = Enum.forString("B02");
    static final Enum C_01 = Enum.forString("C01");
    static final Enum C_02 = Enum.forString("C02");
    static final Enum C_03 = Enum.forString("C03");
    static final Enum D_01 = Enum.forString("D01");
    static final Enum D_02 = Enum.forString("D02");
    static final Enum D_03 = Enum.forString("D03");
    static final Enum E_01 = Enum.forString("E01");
    static final Enum E_02 = Enum.forString("E02");
    static final Enum E_03 = Enum.forString("E03");
    static final Enum E_04 = Enum.forString("E04");
    static final Enum E_99 = Enum.forString("E99");
    static final Enum F_01 = Enum.forString("F01");
    static final Enum G_01 = Enum.forString("G01");
    static final Enum G_02 = Enum.forString("G02");
    static final Enum G_03 = Enum.forString("G03");
    static final Enum H_01 = Enum.forString("H01");
    static final Enum J_01 = Enum.forString("J01");
    static final Enum K_01 = Enum.forString("K01");
    static final Enum K_02 = Enum.forString("K02");
    static final Enum L_01 = Enum.forString("L01");
    static final Enum L_02 = Enum.forString("L02");
    static final Enum L_03 = Enum.forString("L03");
    static final Enum L_04 = Enum.forString("L04");
    static final Enum L_05 = Enum.forString("L05");
    static final Enum L_06 = Enum.forString("L06");
    static final Enum L_99 = Enum.forString("L99");
    static final Enum M_01 = Enum.forString("M01");
    static final Enum M_02 = Enum.forString("M02");
    static final Enum M_03 = Enum.forString("M03");
    static final Enum M_04 = Enum.forString("M04");
    static final Enum M_05 = Enum.forString("M05");
    static final Enum N_01 = Enum.forString("N01");
    static final Enum N_02 = Enum.forString("N02");
    static final Enum N_03 = Enum.forString("N03");
    static final Enum N_04 = Enum.forString("N04");
    static final Enum N_05 = Enum.forString("N05");
    static final Enum X_01 = Enum.forString("X01");
    
    static final int INT_A_01 = Enum.INT_A_01;
    static final int INT_A_02 = Enum.INT_A_02;
    static final int INT_A_03 = Enum.INT_A_03;
    static final int INT_A_04 = Enum.INT_A_04;
    static final int INT_B_01 = Enum.INT_B_01;
    static final int INT_B_02 = Enum.INT_B_02;
    static final int INT_C_01 = Enum.INT_C_01;
    static final int INT_C_02 = Enum.INT_C_02;
    static final int INT_C_03 = Enum.INT_C_03;
    static final int INT_D_01 = Enum.INT_D_01;
    static final int INT_D_02 = Enum.INT_D_02;
    static final int INT_D_03 = Enum.INT_D_03;
    static final int INT_E_01 = Enum.INT_E_01;
    static final int INT_E_02 = Enum.INT_E_02;
    static final int INT_E_03 = Enum.INT_E_03;
    static final int INT_E_04 = Enum.INT_E_04;
    static final int INT_E_99 = Enum.INT_E_99;
    static final int INT_F_01 = Enum.INT_F_01;
    static final int INT_G_01 = Enum.INT_G_01;
    static final int INT_G_02 = Enum.INT_G_02;
    static final int INT_G_03 = Enum.INT_G_03;
    static final int INT_H_01 = Enum.INT_H_01;
    static final int INT_J_01 = Enum.INT_J_01;
    static final int INT_K_01 = Enum.INT_K_01;
    static final int INT_K_02 = Enum.INT_K_02;
    static final int INT_L_01 = Enum.INT_L_01;
    static final int INT_L_02 = Enum.INT_L_02;
    static final int INT_L_03 = Enum.INT_L_03;
    static final int INT_L_04 = Enum.INT_L_04;
    static final int INT_L_05 = Enum.INT_L_05;
    static final int INT_L_06 = Enum.INT_L_06;
    static final int INT_L_99 = Enum.INT_L_99;
    static final int INT_M_01 = Enum.INT_M_01;
    static final int INT_M_02 = Enum.INT_M_02;
    static final int INT_M_03 = Enum.INT_M_03;
    static final int INT_M_04 = Enum.INT_M_04;
    static final int INT_M_05 = Enum.INT_M_05;
    static final int INT_N_01 = Enum.INT_N_01;
    static final int INT_N_02 = Enum.INT_N_02;
    static final int INT_N_03 = Enum.INT_N_03;
    static final int INT_N_04 = Enum.INT_N_04;
    static final int INT_N_05 = Enum.INT_N_05;
    static final int INT_X_01 = Enum.INT_X_01;
    
    /**
     * Enumeration value class for uk.nhs.nhsia.datastandards.ecds.ActivityLocationTypeType.
     * These enum values can be used as follows:
     * <pre>
     * enum.toString(); // returns the string value of the enum
     * enum.intValue(); // returns an int value, useful for switches
     * // e.g., case Enum.INT_A_01
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
        
        static final int INT_A_01 = 1;
        static final int INT_A_02 = 2;
        static final int INT_A_03 = 3;
        static final int INT_A_04 = 4;
        static final int INT_B_01 = 5;
        static final int INT_B_02 = 6;
        static final int INT_C_01 = 7;
        static final int INT_C_02 = 8;
        static final int INT_C_03 = 9;
        static final int INT_D_01 = 10;
        static final int INT_D_02 = 11;
        static final int INT_D_03 = 12;
        static final int INT_E_01 = 13;
        static final int INT_E_02 = 14;
        static final int INT_E_03 = 15;
        static final int INT_E_04 = 16;
        static final int INT_E_99 = 17;
        static final int INT_F_01 = 18;
        static final int INT_G_01 = 19;
        static final int INT_G_02 = 20;
        static final int INT_G_03 = 21;
        static final int INT_H_01 = 22;
        static final int INT_J_01 = 23;
        static final int INT_K_01 = 24;
        static final int INT_K_02 = 25;
        static final int INT_L_01 = 26;
        static final int INT_L_02 = 27;
        static final int INT_L_03 = 28;
        static final int INT_L_04 = 29;
        static final int INT_L_05 = 30;
        static final int INT_L_06 = 31;
        static final int INT_L_99 = 32;
        static final int INT_M_01 = 33;
        static final int INT_M_02 = 34;
        static final int INT_M_03 = 35;
        static final int INT_M_04 = 36;
        static final int INT_M_05 = 37;
        static final int INT_N_01 = 38;
        static final int INT_N_02 = 39;
        static final int INT_N_03 = 40;
        static final int INT_N_04 = 41;
        static final int INT_N_05 = 42;
        static final int INT_X_01 = 43;
        
        public static final org.apache.xmlbeans.StringEnumAbstractBase.Table table =
            new org.apache.xmlbeans.StringEnumAbstractBase.Table
        (
            new Enum[]
            {
                new Enum("A01", INT_A_01),
                new Enum("A02", INT_A_02),
                new Enum("A03", INT_A_03),
                new Enum("A04", INT_A_04),
                new Enum("B01", INT_B_01),
                new Enum("B02", INT_B_02),
                new Enum("C01", INT_C_01),
                new Enum("C02", INT_C_02),
                new Enum("C03", INT_C_03),
                new Enum("D01", INT_D_01),
                new Enum("D02", INT_D_02),
                new Enum("D03", INT_D_03),
                new Enum("E01", INT_E_01),
                new Enum("E02", INT_E_02),
                new Enum("E03", INT_E_03),
                new Enum("E04", INT_E_04),
                new Enum("E99", INT_E_99),
                new Enum("F01", INT_F_01),
                new Enum("G01", INT_G_01),
                new Enum("G02", INT_G_02),
                new Enum("G03", INT_G_03),
                new Enum("H01", INT_H_01),
                new Enum("J01", INT_J_01),
                new Enum("K01", INT_K_01),
                new Enum("K02", INT_K_02),
                new Enum("L01", INT_L_01),
                new Enum("L02", INT_L_02),
                new Enum("L03", INT_L_03),
                new Enum("L04", INT_L_04),
                new Enum("L05", INT_L_05),
                new Enum("L06", INT_L_06),
                new Enum("L99", INT_L_99),
                new Enum("M01", INT_M_01),
                new Enum("M02", INT_M_02),
                new Enum("M03", INT_M_03),
                new Enum("M04", INT_M_04),
                new Enum("M05", INT_M_05),
                new Enum("N01", INT_N_01),
                new Enum("N02", INT_N_02),
                new Enum("N03", INT_N_03),
                new Enum("N04", INT_N_04),
                new Enum("N05", INT_N_05),
                new Enum("X01", INT_X_01),
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
        public static uk.nhs.nhsia.datastandards.ecds.ActivityLocationTypeType newValue(java.lang.Object obj) {
          return (uk.nhs.nhsia.datastandards.ecds.ActivityLocationTypeType) type.newValue( obj ); }
        
        public static uk.nhs.nhsia.datastandards.ecds.ActivityLocationTypeType newInstance() {
          return (uk.nhs.nhsia.datastandards.ecds.ActivityLocationTypeType) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().newInstance( type, null ); }
        
        public static uk.nhs.nhsia.datastandards.ecds.ActivityLocationTypeType newInstance(org.apache.xmlbeans.XmlOptions options) {
          return (uk.nhs.nhsia.datastandards.ecds.ActivityLocationTypeType) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().newInstance( type, options ); }
        
        /** @param xmlAsString the string value to parse */
        public static uk.nhs.nhsia.datastandards.ecds.ActivityLocationTypeType parse(java.lang.String xmlAsString) throws org.apache.xmlbeans.XmlException {
          return (uk.nhs.nhsia.datastandards.ecds.ActivityLocationTypeType) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( xmlAsString, type, null ); }
        
        public static uk.nhs.nhsia.datastandards.ecds.ActivityLocationTypeType parse(java.lang.String xmlAsString, org.apache.xmlbeans.XmlOptions options) throws org.apache.xmlbeans.XmlException {
          return (uk.nhs.nhsia.datastandards.ecds.ActivityLocationTypeType) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( xmlAsString, type, options ); }
        
        /** @param file the file from which to load an xml document */
        public static uk.nhs.nhsia.datastandards.ecds.ActivityLocationTypeType parse(java.io.File file) throws org.apache.xmlbeans.XmlException, java.io.IOException {
          return (uk.nhs.nhsia.datastandards.ecds.ActivityLocationTypeType) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( file, type, null ); }
        
        public static uk.nhs.nhsia.datastandards.ecds.ActivityLocationTypeType parse(java.io.File file, org.apache.xmlbeans.XmlOptions options) throws org.apache.xmlbeans.XmlException, java.io.IOException {
          return (uk.nhs.nhsia.datastandards.ecds.ActivityLocationTypeType) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( file, type, options ); }
        
        public static uk.nhs.nhsia.datastandards.ecds.ActivityLocationTypeType parse(java.net.URL u) throws org.apache.xmlbeans.XmlException, java.io.IOException {
          return (uk.nhs.nhsia.datastandards.ecds.ActivityLocationTypeType) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( u, type, null ); }
        
        public static uk.nhs.nhsia.datastandards.ecds.ActivityLocationTypeType parse(java.net.URL u, org.apache.xmlbeans.XmlOptions options) throws org.apache.xmlbeans.XmlException, java.io.IOException {
          return (uk.nhs.nhsia.datastandards.ecds.ActivityLocationTypeType) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( u, type, options ); }
        
        public static uk.nhs.nhsia.datastandards.ecds.ActivityLocationTypeType parse(java.io.InputStream is) throws org.apache.xmlbeans.XmlException, java.io.IOException {
          return (uk.nhs.nhsia.datastandards.ecds.ActivityLocationTypeType) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( is, type, null ); }
        
        public static uk.nhs.nhsia.datastandards.ecds.ActivityLocationTypeType parse(java.io.InputStream is, org.apache.xmlbeans.XmlOptions options) throws org.apache.xmlbeans.XmlException, java.io.IOException {
          return (uk.nhs.nhsia.datastandards.ecds.ActivityLocationTypeType) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( is, type, options ); }
        
        public static uk.nhs.nhsia.datastandards.ecds.ActivityLocationTypeType parse(java.io.Reader r) throws org.apache.xmlbeans.XmlException, java.io.IOException {
          return (uk.nhs.nhsia.datastandards.ecds.ActivityLocationTypeType) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( r, type, null ); }
        
        public static uk.nhs.nhsia.datastandards.ecds.ActivityLocationTypeType parse(java.io.Reader r, org.apache.xmlbeans.XmlOptions options) throws org.apache.xmlbeans.XmlException, java.io.IOException {
          return (uk.nhs.nhsia.datastandards.ecds.ActivityLocationTypeType) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( r, type, options ); }
        
        public static uk.nhs.nhsia.datastandards.ecds.ActivityLocationTypeType parse(javax.xml.stream.XMLStreamReader sr) throws org.apache.xmlbeans.XmlException {
          return (uk.nhs.nhsia.datastandards.ecds.ActivityLocationTypeType) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( sr, type, null ); }
        
        public static uk.nhs.nhsia.datastandards.ecds.ActivityLocationTypeType parse(javax.xml.stream.XMLStreamReader sr, org.apache.xmlbeans.XmlOptions options) throws org.apache.xmlbeans.XmlException {
          return (uk.nhs.nhsia.datastandards.ecds.ActivityLocationTypeType) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( sr, type, options ); }
        
        public static uk.nhs.nhsia.datastandards.ecds.ActivityLocationTypeType parse(org.w3c.dom.Node node) throws org.apache.xmlbeans.XmlException {
          return (uk.nhs.nhsia.datastandards.ecds.ActivityLocationTypeType) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( node, type, null ); }
        
        public static uk.nhs.nhsia.datastandards.ecds.ActivityLocationTypeType parse(org.w3c.dom.Node node, org.apache.xmlbeans.XmlOptions options) throws org.apache.xmlbeans.XmlException {
          return (uk.nhs.nhsia.datastandards.ecds.ActivityLocationTypeType) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( node, type, options ); }
        
        /** @deprecated {@link org.apache.xmlbeans.xml.stream.XMLInputStream} */
        public static uk.nhs.nhsia.datastandards.ecds.ActivityLocationTypeType parse(org.apache.xmlbeans.xml.stream.XMLInputStream xis) throws org.apache.xmlbeans.XmlException, org.apache.xmlbeans.xml.stream.XMLStreamException {
          return (uk.nhs.nhsia.datastandards.ecds.ActivityLocationTypeType) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( xis, type, null ); }
        
        /** @deprecated {@link org.apache.xmlbeans.xml.stream.XMLInputStream} */
        public static uk.nhs.nhsia.datastandards.ecds.ActivityLocationTypeType parse(org.apache.xmlbeans.xml.stream.XMLInputStream xis, org.apache.xmlbeans.XmlOptions options) throws org.apache.xmlbeans.XmlException, org.apache.xmlbeans.xml.stream.XMLStreamException {
          return (uk.nhs.nhsia.datastandards.ecds.ActivityLocationTypeType) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( xis, type, options ); }
        
        /** @deprecated {@link org.apache.xmlbeans.xml.stream.XMLInputStream} */
        public static org.apache.xmlbeans.xml.stream.XMLInputStream newValidatingXMLInputStream(org.apache.xmlbeans.xml.stream.XMLInputStream xis) throws org.apache.xmlbeans.XmlException, org.apache.xmlbeans.xml.stream.XMLStreamException {
          return org.apache.xmlbeans.XmlBeans.getContextTypeLoader().newValidatingXMLInputStream( xis, type, null ); }
        
        /** @deprecated {@link org.apache.xmlbeans.xml.stream.XMLInputStream} */
        public static org.apache.xmlbeans.xml.stream.XMLInputStream newValidatingXMLInputStream(org.apache.xmlbeans.xml.stream.XMLInputStream xis, org.apache.xmlbeans.XmlOptions options) throws org.apache.xmlbeans.XmlException, org.apache.xmlbeans.xml.stream.XMLStreamException {
          return org.apache.xmlbeans.XmlBeans.getContextTypeLoader().newValidatingXMLInputStream( xis, type, options ); }
        
        private Factory() { } // No instance of this class allowed
    }
}
