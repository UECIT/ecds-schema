/*
 * XML Type:  BirthOccurrence_Structure
 * Namespace: http://www.nhsia.nhs.uk/DataStandards/XMLschema/CDS/ns
 * Java type: uk.nhs.nhsia.datastandards.ecds.BirthOccurrenceStructure
 *
 * Automatically generated - do not modify.
 */
package uk.nhs.nhsia.datastandards.ecds;


/**
 * An XML BirthOccurrence_Structure(@http://www.nhsia.nhs.uk/DataStandards/XMLschema/CDS/ns).
 *
 * This is a complex type.
 */
public interface BirthOccurrenceStructure extends org.apache.xmlbeans.XmlObject
{
    public static final org.apache.xmlbeans.SchemaType type = (org.apache.xmlbeans.SchemaType)
        org.apache.xmlbeans.XmlBeans.typeSystemForClassLoader(BirthOccurrenceStructure.class.getClassLoader(), "schemaorg_apache_xmlbeans.system.s30C1180FF47174E0C8A992A2D657328B").resolveHandle("birthoccurrencestructureb45ftype");
    
    /**
     * Gets the "ActivityCharacteristics" element
     */
    uk.nhs.nhsia.datastandards.ecds.BirthOccurrenceStructure.ActivityCharacteristics getActivityCharacteristics();
    
    /**
     * True if has "ActivityCharacteristics" element
     */
    boolean isSetActivityCharacteristics();
    
    /**
     * Sets the "ActivityCharacteristics" element
     */
    void setActivityCharacteristics(uk.nhs.nhsia.datastandards.ecds.BirthOccurrenceStructure.ActivityCharacteristics activityCharacteristics);
    
    /**
     * Appends and returns a new empty "ActivityCharacteristics" element
     */
    uk.nhs.nhsia.datastandards.ecds.BirthOccurrenceStructure.ActivityCharacteristics addNewActivityCharacteristics();
    
    /**
     * Unsets the "ActivityCharacteristics" element
     */
    void unsetActivityCharacteristics();
    
    /**
     * Gets the "PersonGroup_Baby" element
     */
    uk.nhs.nhsia.datastandards.ecds.PersonGroupBabyStructure getPersonGroupBaby();
    
    /**
     * True if has "PersonGroup_Baby" element
     */
    boolean isSetPersonGroupBaby();
    
    /**
     * Sets the "PersonGroup_Baby" element
     */
    void setPersonGroupBaby(uk.nhs.nhsia.datastandards.ecds.PersonGroupBabyStructure personGroupBaby);
    
    /**
     * Appends and returns a new empty "PersonGroup_Baby" element
     */
    uk.nhs.nhsia.datastandards.ecds.PersonGroupBabyStructure addNewPersonGroupBaby();
    
    /**
     * Unsets the "PersonGroup_Baby" element
     */
    void unsetPersonGroupBaby();
    
    /**
     * Gets the "LocationGroup" element
     */
    uk.nhs.nhsia.datastandards.ecds.BirthOccurrenceStructure.LocationGroup getLocationGroup();
    
    /**
     * True if has "LocationGroup" element
     */
    boolean isSetLocationGroup();
    
    /**
     * Sets the "LocationGroup" element
     */
    void setLocationGroup(uk.nhs.nhsia.datastandards.ecds.BirthOccurrenceStructure.LocationGroup locationGroup);
    
    /**
     * Appends and returns a new empty "LocationGroup" element
     */
    uk.nhs.nhsia.datastandards.ecds.BirthOccurrenceStructure.LocationGroup addNewLocationGroup();
    
    /**
     * Unsets the "LocationGroup" element
     */
    void unsetLocationGroup();
    
    /**
     * An XML ActivityCharacteristics(@http://www.nhsia.nhs.uk/DataStandards/XMLschema/CDS/ns).
     *
     * This is a complex type.
     */
    public interface ActivityCharacteristics extends org.apache.xmlbeans.XmlObject
    {
        public static final org.apache.xmlbeans.SchemaType type = (org.apache.xmlbeans.SchemaType)
            org.apache.xmlbeans.XmlBeans.typeSystemForClassLoader(ActivityCharacteristics.class.getClassLoader(), "schemaorg_apache_xmlbeans.system.s30C1180FF47174E0C8A992A2D657328B").resolveHandle("activitycharacteristics3acaelemtype");
        
        /**
         * Gets the "BirthOrder" element
         */
        int getBirthOrder();
        
        /**
         * Gets (as xml) the "BirthOrder" element
         */
        uk.nhs.nhsia.datastandards.ecds.BirthOrderType xgetBirthOrder();
        
        /**
         * True if has "BirthOrder" element
         */
        boolean isSetBirthOrder();
        
        /**
         * Sets the "BirthOrder" element
         */
        void setBirthOrder(int birthOrder);
        
        /**
         * Sets (as xml) the "BirthOrder" element
         */
        void xsetBirthOrder(uk.nhs.nhsia.datastandards.ecds.BirthOrderType birthOrder);
        
        /**
         * Unsets the "BirthOrder" element
         */
        void unsetBirthOrder();
        
        /**
         * Gets the "DeliveryMethodCode" element
         */
        java.lang.String getDeliveryMethodCode();
        
        /**
         * Gets (as xml) the "DeliveryMethodCode" element
         */
        uk.nhs.nhsia.datastandards.ecds.DeliveryMethodCodeType xgetDeliveryMethodCode();
        
        /**
         * True if has "DeliveryMethodCode" element
         */
        boolean isSetDeliveryMethodCode();
        
        /**
         * Sets the "DeliveryMethodCode" element
         */
        void setDeliveryMethodCode(java.lang.String deliveryMethodCode);
        
        /**
         * Sets (as xml) the "DeliveryMethodCode" element
         */
        void xsetDeliveryMethodCode(uk.nhs.nhsia.datastandards.ecds.DeliveryMethodCodeType deliveryMethodCode);
        
        /**
         * Unsets the "DeliveryMethodCode" element
         */
        void unsetDeliveryMethodCode();
        
        /**
         * Gets the "GestationLength_Assessment" element
         */
        int getGestationLengthAssessment();
        
        /**
         * Gets (as xml) the "GestationLength_Assessment" element
         */
        uk.nhs.nhsia.datastandards.ecds.GestationLengthAssessmentType xgetGestationLengthAssessment();
        
        /**
         * True if has "GestationLength_Assessment" element
         */
        boolean isSetGestationLengthAssessment();
        
        /**
         * Sets the "GestationLength_Assessment" element
         */
        void setGestationLengthAssessment(int gestationLengthAssessment);
        
        /**
         * Sets (as xml) the "GestationLength_Assessment" element
         */
        void xsetGestationLengthAssessment(uk.nhs.nhsia.datastandards.ecds.GestationLengthAssessmentType gestationLengthAssessment);
        
        /**
         * Unsets the "GestationLength_Assessment" element
         */
        void unsetGestationLengthAssessment();
        
        /**
         * Gets the "ResuscitationMethodCode" element
         */
        uk.nhs.nhsia.datastandards.ecds.ResuscitationMethodCodeType.Enum getResuscitationMethodCode();
        
        /**
         * Gets (as xml) the "ResuscitationMethodCode" element
         */
        uk.nhs.nhsia.datastandards.ecds.ResuscitationMethodCodeType xgetResuscitationMethodCode();
        
        /**
         * True if has "ResuscitationMethodCode" element
         */
        boolean isSetResuscitationMethodCode();
        
        /**
         * Sets the "ResuscitationMethodCode" element
         */
        void setResuscitationMethodCode(uk.nhs.nhsia.datastandards.ecds.ResuscitationMethodCodeType.Enum resuscitationMethodCode);
        
        /**
         * Sets (as xml) the "ResuscitationMethodCode" element
         */
        void xsetResuscitationMethodCode(uk.nhs.nhsia.datastandards.ecds.ResuscitationMethodCodeType resuscitationMethodCode);
        
        /**
         * Unsets the "ResuscitationMethodCode" element
         */
        void unsetResuscitationMethodCode();
        
        /**
         * Gets the "StatusOfPersonConductingDeliveryCode" element
         */
        uk.nhs.nhsia.datastandards.ecds.StatusOfPersonConductingDeliveryCodeType.Enum getStatusOfPersonConductingDeliveryCode();
        
        /**
         * Gets (as xml) the "StatusOfPersonConductingDeliveryCode" element
         */
        uk.nhs.nhsia.datastandards.ecds.StatusOfPersonConductingDeliveryCodeType xgetStatusOfPersonConductingDeliveryCode();
        
        /**
         * True if has "StatusOfPersonConductingDeliveryCode" element
         */
        boolean isSetStatusOfPersonConductingDeliveryCode();
        
        /**
         * Sets the "StatusOfPersonConductingDeliveryCode" element
         */
        void setStatusOfPersonConductingDeliveryCode(uk.nhs.nhsia.datastandards.ecds.StatusOfPersonConductingDeliveryCodeType.Enum statusOfPersonConductingDeliveryCode);
        
        /**
         * Sets (as xml) the "StatusOfPersonConductingDeliveryCode" element
         */
        void xsetStatusOfPersonConductingDeliveryCode(uk.nhs.nhsia.datastandards.ecds.StatusOfPersonConductingDeliveryCodeType statusOfPersonConductingDeliveryCode);
        
        /**
         * Unsets the "StatusOfPersonConductingDeliveryCode" element
         */
        void unsetStatusOfPersonConductingDeliveryCode();
        
        /**
         * A factory class with static methods for creating instances
         * of this type.
         */
        
        public static final class Factory
        {
            public static uk.nhs.nhsia.datastandards.ecds.BirthOccurrenceStructure.ActivityCharacteristics newInstance() {
              return (uk.nhs.nhsia.datastandards.ecds.BirthOccurrenceStructure.ActivityCharacteristics) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().newInstance( type, null ); }
            
            public static uk.nhs.nhsia.datastandards.ecds.BirthOccurrenceStructure.ActivityCharacteristics newInstance(org.apache.xmlbeans.XmlOptions options) {
              return (uk.nhs.nhsia.datastandards.ecds.BirthOccurrenceStructure.ActivityCharacteristics) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().newInstance( type, options ); }
            
            private Factory() { } // No instance of this class allowed
        }
    }
    
    /**
     * An XML LocationGroup(@http://www.nhsia.nhs.uk/DataStandards/XMLschema/CDS/ns).
     *
     * This is a complex type.
     */
    public interface LocationGroup extends org.apache.xmlbeans.XmlObject
    {
        public static final org.apache.xmlbeans.SchemaType type = (org.apache.xmlbeans.SchemaType)
            org.apache.xmlbeans.XmlBeans.typeSystemForClassLoader(LocationGroup.class.getClassLoader(), "schemaorg_apache_xmlbeans.system.s30C1180FF47174E0C8A992A2D657328B").resolveHandle("locationgroup4289elemtype");
        
        /**
         * Gets the "DeliveryPlaceActual" element
         */
        uk.nhs.nhsia.datastandards.ecds.BirthOccurrenceStructure.LocationGroup.DeliveryPlaceActual getDeliveryPlaceActual();
        
        /**
         * True if has "DeliveryPlaceActual" element
         */
        boolean isSetDeliveryPlaceActual();
        
        /**
         * Sets the "DeliveryPlaceActual" element
         */
        void setDeliveryPlaceActual(uk.nhs.nhsia.datastandards.ecds.BirthOccurrenceStructure.LocationGroup.DeliveryPlaceActual deliveryPlaceActual);
        
        /**
         * Appends and returns a new empty "DeliveryPlaceActual" element
         */
        uk.nhs.nhsia.datastandards.ecds.BirthOccurrenceStructure.LocationGroup.DeliveryPlaceActual addNewDeliveryPlaceActual();
        
        /**
         * Unsets the "DeliveryPlaceActual" element
         */
        void unsetDeliveryPlaceActual();
        
        /**
         * An XML DeliveryPlaceActual(@http://www.nhsia.nhs.uk/DataStandards/XMLschema/CDS/ns).
         *
         * This is a complex type.
         */
        public interface DeliveryPlaceActual extends org.apache.xmlbeans.XmlObject
        {
            public static final org.apache.xmlbeans.SchemaType type = (org.apache.xmlbeans.SchemaType)
                org.apache.xmlbeans.XmlBeans.typeSystemForClassLoader(DeliveryPlaceActual.class.getClassLoader(), "schemaorg_apache_xmlbeans.system.s30C1180FF47174E0C8A992A2D657328B").resolveHandle("deliveryplaceactuald23celemtype");
            
            /**
             * Gets the "LocationClass" element
             */
            uk.nhs.nhsia.datastandards.ecds.LocationClassType.Enum getLocationClass();
            
            /**
             * Gets (as xml) the "LocationClass" element
             */
            uk.nhs.nhsia.datastandards.ecds.LocationClassType xgetLocationClass();
            
            /**
             * True if has "LocationClass" element
             */
            boolean isSetLocationClass();
            
            /**
             * Sets the "LocationClass" element
             */
            void setLocationClass(uk.nhs.nhsia.datastandards.ecds.LocationClassType.Enum locationClass);
            
            /**
             * Sets (as xml) the "LocationClass" element
             */
            void xsetLocationClass(uk.nhs.nhsia.datastandards.ecds.LocationClassType locationClass);
            
            /**
             * Unsets the "LocationClass" element
             */
            void unsetLocationClass();
            
            /**
             * Gets the "ActivityLocationType" element
             */
            uk.nhs.nhsia.datastandards.ecds.ActivityLocationTypeType.Enum getActivityLocationType();
            
            /**
             * Gets (as xml) the "ActivityLocationType" element
             */
            uk.nhs.nhsia.datastandards.ecds.ActivityLocationTypeType xgetActivityLocationType();
            
            /**
             * True if has "ActivityLocationType" element
             */
            boolean isSetActivityLocationType();
            
            /**
             * Sets the "ActivityLocationType" element
             */
            void setActivityLocationType(uk.nhs.nhsia.datastandards.ecds.ActivityLocationTypeType.Enum activityLocationType);
            
            /**
             * Sets (as xml) the "ActivityLocationType" element
             */
            void xsetActivityLocationType(uk.nhs.nhsia.datastandards.ecds.ActivityLocationTypeType activityLocationType);
            
            /**
             * Unsets the "ActivityLocationType" element
             */
            void unsetActivityLocationType();
            
            /**
             * Gets the "DeliveryPlaceTypeCode_Actual" element
             */
            java.lang.String getDeliveryPlaceTypeCodeActual();
            
            /**
             * Gets (as xml) the "DeliveryPlaceTypeCode_Actual" element
             */
            uk.nhs.nhsia.datastandards.ecds.DeliveryPlaceTypeCodeActualType xgetDeliveryPlaceTypeCodeActual();
            
            /**
             * True if has "DeliveryPlaceTypeCode_Actual" element
             */
            boolean isSetDeliveryPlaceTypeCodeActual();
            
            /**
             * Sets the "DeliveryPlaceTypeCode_Actual" element
             */
            void setDeliveryPlaceTypeCodeActual(java.lang.String deliveryPlaceTypeCodeActual);
            
            /**
             * Sets (as xml) the "DeliveryPlaceTypeCode_Actual" element
             */
            void xsetDeliveryPlaceTypeCodeActual(uk.nhs.nhsia.datastandards.ecds.DeliveryPlaceTypeCodeActualType deliveryPlaceTypeCodeActual);
            
            /**
             * Unsets the "DeliveryPlaceTypeCode_Actual" element
             */
            void unsetDeliveryPlaceTypeCodeActual();
            
            /**
             * A factory class with static methods for creating instances
             * of this type.
             */
            
            public static final class Factory
            {
                public static uk.nhs.nhsia.datastandards.ecds.BirthOccurrenceStructure.LocationGroup.DeliveryPlaceActual newInstance() {
                  return (uk.nhs.nhsia.datastandards.ecds.BirthOccurrenceStructure.LocationGroup.DeliveryPlaceActual) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().newInstance( type, null ); }
                
                public static uk.nhs.nhsia.datastandards.ecds.BirthOccurrenceStructure.LocationGroup.DeliveryPlaceActual newInstance(org.apache.xmlbeans.XmlOptions options) {
                  return (uk.nhs.nhsia.datastandards.ecds.BirthOccurrenceStructure.LocationGroup.DeliveryPlaceActual) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().newInstance( type, options ); }
                
                private Factory() { } // No instance of this class allowed
            }
        }
        
        /**
         * A factory class with static methods for creating instances
         * of this type.
         */
        
        public static final class Factory
        {
            public static uk.nhs.nhsia.datastandards.ecds.BirthOccurrenceStructure.LocationGroup newInstance() {
              return (uk.nhs.nhsia.datastandards.ecds.BirthOccurrenceStructure.LocationGroup) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().newInstance( type, null ); }
            
            public static uk.nhs.nhsia.datastandards.ecds.BirthOccurrenceStructure.LocationGroup newInstance(org.apache.xmlbeans.XmlOptions options) {
              return (uk.nhs.nhsia.datastandards.ecds.BirthOccurrenceStructure.LocationGroup) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().newInstance( type, options ); }
            
            private Factory() { } // No instance of this class allowed
        }
    }
    
    /**
     * A factory class with static methods for creating instances
     * of this type.
     */
    
    public static final class Factory
    {
        public static uk.nhs.nhsia.datastandards.ecds.BirthOccurrenceStructure newInstance() {
          return (uk.nhs.nhsia.datastandards.ecds.BirthOccurrenceStructure) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().newInstance( type, null ); }
        
        public static uk.nhs.nhsia.datastandards.ecds.BirthOccurrenceStructure newInstance(org.apache.xmlbeans.XmlOptions options) {
          return (uk.nhs.nhsia.datastandards.ecds.BirthOccurrenceStructure) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().newInstance( type, options ); }
        
        /** @param xmlAsString the string value to parse */
        public static uk.nhs.nhsia.datastandards.ecds.BirthOccurrenceStructure parse(java.lang.String xmlAsString) throws org.apache.xmlbeans.XmlException {
          return (uk.nhs.nhsia.datastandards.ecds.BirthOccurrenceStructure) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( xmlAsString, type, null ); }
        
        public static uk.nhs.nhsia.datastandards.ecds.BirthOccurrenceStructure parse(java.lang.String xmlAsString, org.apache.xmlbeans.XmlOptions options) throws org.apache.xmlbeans.XmlException {
          return (uk.nhs.nhsia.datastandards.ecds.BirthOccurrenceStructure) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( xmlAsString, type, options ); }
        
        /** @param file the file from which to load an xml document */
        public static uk.nhs.nhsia.datastandards.ecds.BirthOccurrenceStructure parse(java.io.File file) throws org.apache.xmlbeans.XmlException, java.io.IOException {
          return (uk.nhs.nhsia.datastandards.ecds.BirthOccurrenceStructure) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( file, type, null ); }
        
        public static uk.nhs.nhsia.datastandards.ecds.BirthOccurrenceStructure parse(java.io.File file, org.apache.xmlbeans.XmlOptions options) throws org.apache.xmlbeans.XmlException, java.io.IOException {
          return (uk.nhs.nhsia.datastandards.ecds.BirthOccurrenceStructure) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( file, type, options ); }
        
        public static uk.nhs.nhsia.datastandards.ecds.BirthOccurrenceStructure parse(java.net.URL u) throws org.apache.xmlbeans.XmlException, java.io.IOException {
          return (uk.nhs.nhsia.datastandards.ecds.BirthOccurrenceStructure) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( u, type, null ); }
        
        public static uk.nhs.nhsia.datastandards.ecds.BirthOccurrenceStructure parse(java.net.URL u, org.apache.xmlbeans.XmlOptions options) throws org.apache.xmlbeans.XmlException, java.io.IOException {
          return (uk.nhs.nhsia.datastandards.ecds.BirthOccurrenceStructure) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( u, type, options ); }
        
        public static uk.nhs.nhsia.datastandards.ecds.BirthOccurrenceStructure parse(java.io.InputStream is) throws org.apache.xmlbeans.XmlException, java.io.IOException {
          return (uk.nhs.nhsia.datastandards.ecds.BirthOccurrenceStructure) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( is, type, null ); }
        
        public static uk.nhs.nhsia.datastandards.ecds.BirthOccurrenceStructure parse(java.io.InputStream is, org.apache.xmlbeans.XmlOptions options) throws org.apache.xmlbeans.XmlException, java.io.IOException {
          return (uk.nhs.nhsia.datastandards.ecds.BirthOccurrenceStructure) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( is, type, options ); }
        
        public static uk.nhs.nhsia.datastandards.ecds.BirthOccurrenceStructure parse(java.io.Reader r) throws org.apache.xmlbeans.XmlException, java.io.IOException {
          return (uk.nhs.nhsia.datastandards.ecds.BirthOccurrenceStructure) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( r, type, null ); }
        
        public static uk.nhs.nhsia.datastandards.ecds.BirthOccurrenceStructure parse(java.io.Reader r, org.apache.xmlbeans.XmlOptions options) throws org.apache.xmlbeans.XmlException, java.io.IOException {
          return (uk.nhs.nhsia.datastandards.ecds.BirthOccurrenceStructure) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( r, type, options ); }
        
        public static uk.nhs.nhsia.datastandards.ecds.BirthOccurrenceStructure parse(javax.xml.stream.XMLStreamReader sr) throws org.apache.xmlbeans.XmlException {
          return (uk.nhs.nhsia.datastandards.ecds.BirthOccurrenceStructure) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( sr, type, null ); }
        
        public static uk.nhs.nhsia.datastandards.ecds.BirthOccurrenceStructure parse(javax.xml.stream.XMLStreamReader sr, org.apache.xmlbeans.XmlOptions options) throws org.apache.xmlbeans.XmlException {
          return (uk.nhs.nhsia.datastandards.ecds.BirthOccurrenceStructure) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( sr, type, options ); }
        
        public static uk.nhs.nhsia.datastandards.ecds.BirthOccurrenceStructure parse(org.w3c.dom.Node node) throws org.apache.xmlbeans.XmlException {
          return (uk.nhs.nhsia.datastandards.ecds.BirthOccurrenceStructure) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( node, type, null ); }
        
        public static uk.nhs.nhsia.datastandards.ecds.BirthOccurrenceStructure parse(org.w3c.dom.Node node, org.apache.xmlbeans.XmlOptions options) throws org.apache.xmlbeans.XmlException {
          return (uk.nhs.nhsia.datastandards.ecds.BirthOccurrenceStructure) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( node, type, options ); }
        
        /** @deprecated {@link org.apache.xmlbeans.xml.stream.XMLInputStream} */
        public static uk.nhs.nhsia.datastandards.ecds.BirthOccurrenceStructure parse(org.apache.xmlbeans.xml.stream.XMLInputStream xis) throws org.apache.xmlbeans.XmlException, org.apache.xmlbeans.xml.stream.XMLStreamException {
          return (uk.nhs.nhsia.datastandards.ecds.BirthOccurrenceStructure) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( xis, type, null ); }
        
        /** @deprecated {@link org.apache.xmlbeans.xml.stream.XMLInputStream} */
        public static uk.nhs.nhsia.datastandards.ecds.BirthOccurrenceStructure parse(org.apache.xmlbeans.xml.stream.XMLInputStream xis, org.apache.xmlbeans.XmlOptions options) throws org.apache.xmlbeans.XmlException, org.apache.xmlbeans.xml.stream.XMLStreamException {
          return (uk.nhs.nhsia.datastandards.ecds.BirthOccurrenceStructure) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( xis, type, options ); }
        
        /** @deprecated {@link org.apache.xmlbeans.xml.stream.XMLInputStream} */
        public static org.apache.xmlbeans.xml.stream.XMLInputStream newValidatingXMLInputStream(org.apache.xmlbeans.xml.stream.XMLInputStream xis) throws org.apache.xmlbeans.XmlException, org.apache.xmlbeans.xml.stream.XMLStreamException {
          return org.apache.xmlbeans.XmlBeans.getContextTypeLoader().newValidatingXMLInputStream( xis, type, null ); }
        
        /** @deprecated {@link org.apache.xmlbeans.xml.stream.XMLInputStream} */
        public static org.apache.xmlbeans.xml.stream.XMLInputStream newValidatingXMLInputStream(org.apache.xmlbeans.xml.stream.XMLInputStream xis, org.apache.xmlbeans.XmlOptions options) throws org.apache.xmlbeans.XmlException, org.apache.xmlbeans.xml.stream.XMLStreamException {
          return org.apache.xmlbeans.XmlBeans.getContextTypeLoader().newValidatingXMLInputStream( xis, type, options ); }
        
        private Factory() { } // No instance of this class allowed
    }
}
