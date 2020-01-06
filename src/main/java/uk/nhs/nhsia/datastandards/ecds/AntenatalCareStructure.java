/*
 * XML Type:  AntenatalCare_Structure
 * Namespace: http://www.nhsia.nhs.uk/DataStandards/XMLschema/CDS/ns
 * Java type: uk.nhs.nhsia.datastandards.ecds.AntenatalCareStructure
 *
 * Automatically generated - do not modify.
 */
package uk.nhs.nhsia.datastandards.ecds;


/**
 * An XML AntenatalCare_Structure(@http://www.nhsia.nhs.uk/DataStandards/XMLschema/CDS/ns).
 *
 * This is a complex type.
 */
public interface AntenatalCareStructure extends org.apache.xmlbeans.XmlObject
{
    public static final org.apache.xmlbeans.SchemaType type = (org.apache.xmlbeans.SchemaType)
        org.apache.xmlbeans.XmlBeans.typeSystemForClassLoader(AntenatalCareStructure.class.getClassLoader(), "schemaorg_apache_xmlbeans.system.s30C1180FF47174E0C8A992A2D657328B").resolveHandle("antenatalcarestructure47d0type");
    
    /**
     * Gets the "ActivityCharacteristics" element
     */
    uk.nhs.nhsia.datastandards.ecds.AntenatalCareStructure.ActivityCharacteristics getActivityCharacteristics();
    
    /**
     * True if has "ActivityCharacteristics" element
     */
    boolean isSetActivityCharacteristics();
    
    /**
     * Sets the "ActivityCharacteristics" element
     */
    void setActivityCharacteristics(uk.nhs.nhsia.datastandards.ecds.AntenatalCareStructure.ActivityCharacteristics activityCharacteristics);
    
    /**
     * Appends and returns a new empty "ActivityCharacteristics" element
     */
    uk.nhs.nhsia.datastandards.ecds.AntenatalCareStructure.ActivityCharacteristics addNewActivityCharacteristics();
    
    /**
     * Unsets the "ActivityCharacteristics" element
     */
    void unsetActivityCharacteristics();
    
    /**
     * Gets the "PersonGroup_ResponsibleClinician" element
     */
    uk.nhs.nhsia.datastandards.ecds.AntenatalCareStructure.PersonGroupResponsibleClinician getPersonGroupResponsibleClinician();
    
    /**
     * True if has "PersonGroup_ResponsibleClinician" element
     */
    boolean isSetPersonGroupResponsibleClinician();
    
    /**
     * Sets the "PersonGroup_ResponsibleClinician" element
     */
    void setPersonGroupResponsibleClinician(uk.nhs.nhsia.datastandards.ecds.AntenatalCareStructure.PersonGroupResponsibleClinician personGroupResponsibleClinician);
    
    /**
     * Appends and returns a new empty "PersonGroup_ResponsibleClinician" element
     */
    uk.nhs.nhsia.datastandards.ecds.AntenatalCareStructure.PersonGroupResponsibleClinician addNewPersonGroupResponsibleClinician();
    
    /**
     * Unsets the "PersonGroup_ResponsibleClinician" element
     */
    void unsetPersonGroupResponsibleClinician();
    
    /**
     * Gets the "LocationGroup" element
     */
    uk.nhs.nhsia.datastandards.ecds.AntenatalCareStructure.LocationGroup getLocationGroup();
    
    /**
     * True if has "LocationGroup" element
     */
    boolean isSetLocationGroup();
    
    /**
     * Sets the "LocationGroup" element
     */
    void setLocationGroup(uk.nhs.nhsia.datastandards.ecds.AntenatalCareStructure.LocationGroup locationGroup);
    
    /**
     * Appends and returns a new empty "LocationGroup" element
     */
    uk.nhs.nhsia.datastandards.ecds.AntenatalCareStructure.LocationGroup addNewLocationGroup();
    
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
            org.apache.xmlbeans.XmlBeans.typeSystemForClassLoader(ActivityCharacteristics.class.getClassLoader(), "schemaorg_apache_xmlbeans.system.s30C1180FF47174E0C8A992A2D657328B").resolveHandle("activitycharacteristics6cfbelemtype");
        
        /**
         * Gets the "FirstAntenatalAssessmentDate" element
         */
        java.util.Calendar getFirstAntenatalAssessmentDate();
        
        /**
         * Gets (as xml) the "FirstAntenatalAssessmentDate" element
         */
        uk.nhs.nhsia.datastandards.ecds.FirstAntenatalAssessmentDateType xgetFirstAntenatalAssessmentDate();
        
        /**
         * True if has "FirstAntenatalAssessmentDate" element
         */
        boolean isSetFirstAntenatalAssessmentDate();
        
        /**
         * Sets the "FirstAntenatalAssessmentDate" element
         */
        void setFirstAntenatalAssessmentDate(java.util.Calendar firstAntenatalAssessmentDate);
        
        /**
         * Sets (as xml) the "FirstAntenatalAssessmentDate" element
         */
        void xsetFirstAntenatalAssessmentDate(uk.nhs.nhsia.datastandards.ecds.FirstAntenatalAssessmentDateType firstAntenatalAssessmentDate);
        
        /**
         * Unsets the "FirstAntenatalAssessmentDate" element
         */
        void unsetFirstAntenatalAssessmentDate();
        
        /**
         * A factory class with static methods for creating instances
         * of this type.
         */
        
        public static final class Factory
        {
            public static uk.nhs.nhsia.datastandards.ecds.AntenatalCareStructure.ActivityCharacteristics newInstance() {
              return (uk.nhs.nhsia.datastandards.ecds.AntenatalCareStructure.ActivityCharacteristics) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().newInstance( type, null ); }
            
            public static uk.nhs.nhsia.datastandards.ecds.AntenatalCareStructure.ActivityCharacteristics newInstance(org.apache.xmlbeans.XmlOptions options) {
              return (uk.nhs.nhsia.datastandards.ecds.AntenatalCareStructure.ActivityCharacteristics) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().newInstance( type, options ); }
            
            private Factory() { } // No instance of this class allowed
        }
    }
    
    /**
     * An XML PersonGroup_ResponsibleClinician(@http://www.nhsia.nhs.uk/DataStandards/XMLschema/CDS/ns).
     *
     * This is a complex type.
     */
    public interface PersonGroupResponsibleClinician extends org.apache.xmlbeans.XmlObject
    {
        public static final org.apache.xmlbeans.SchemaType type = (org.apache.xmlbeans.SchemaType)
            org.apache.xmlbeans.XmlBeans.typeSystemForClassLoader(PersonGroupResponsibleClinician.class.getClassLoader(), "schemaorg_apache_xmlbeans.system.s30C1180FF47174E0C8A992A2D657328B").resolveHandle("persongroupresponsibleclinician9707elemtype");
        
        /**
         * Gets the "GeneralMedicalPractitioner_AntenatalCare" element
         */
        java.lang.String getGeneralMedicalPractitionerAntenatalCare();
        
        /**
         * Gets (as xml) the "GeneralMedicalPractitioner_AntenatalCare" element
         */
        uk.nhs.nhsia.datastandards.ecds.GeneralMedicalPractitionerAntenatalCareType xgetGeneralMedicalPractitionerAntenatalCare();
        
        /**
         * True if has "GeneralMedicalPractitioner_AntenatalCare" element
         */
        boolean isSetGeneralMedicalPractitionerAntenatalCare();
        
        /**
         * Sets the "GeneralMedicalPractitioner_AntenatalCare" element
         */
        void setGeneralMedicalPractitionerAntenatalCare(java.lang.String generalMedicalPractitionerAntenatalCare);
        
        /**
         * Sets (as xml) the "GeneralMedicalPractitioner_AntenatalCare" element
         */
        void xsetGeneralMedicalPractitionerAntenatalCare(uk.nhs.nhsia.datastandards.ecds.GeneralMedicalPractitionerAntenatalCareType generalMedicalPractitionerAntenatalCare);
        
        /**
         * Unsets the "GeneralMedicalPractitioner_AntenatalCare" element
         */
        void unsetGeneralMedicalPractitionerAntenatalCare();
        
        /**
         * Gets the "GeneralMedicalPractionerPractice_AntenatalCare" element
         */
        java.lang.String getGeneralMedicalPractionerPracticeAntenatalCare();
        
        /**
         * Gets (as xml) the "GeneralMedicalPractionerPractice_AntenatalCare" element
         */
        uk.nhs.nhsia.datastandards.ecds.GeneralMedicalPractitionerPracticeAntenatalCareType xgetGeneralMedicalPractionerPracticeAntenatalCare();
        
        /**
         * True if has "GeneralMedicalPractionerPractice_AntenatalCare" element
         */
        boolean isSetGeneralMedicalPractionerPracticeAntenatalCare();
        
        /**
         * Sets the "GeneralMedicalPractionerPractice_AntenatalCare" element
         */
        void setGeneralMedicalPractionerPracticeAntenatalCare(java.lang.String generalMedicalPractionerPracticeAntenatalCare);
        
        /**
         * Sets (as xml) the "GeneralMedicalPractionerPractice_AntenatalCare" element
         */
        void xsetGeneralMedicalPractionerPracticeAntenatalCare(uk.nhs.nhsia.datastandards.ecds.GeneralMedicalPractitionerPracticeAntenatalCareType generalMedicalPractionerPracticeAntenatalCare);
        
        /**
         * Unsets the "GeneralMedicalPractionerPractice_AntenatalCare" element
         */
        void unsetGeneralMedicalPractionerPracticeAntenatalCare();
        
        /**
         * A factory class with static methods for creating instances
         * of this type.
         */
        
        public static final class Factory
        {
            public static uk.nhs.nhsia.datastandards.ecds.AntenatalCareStructure.PersonGroupResponsibleClinician newInstance() {
              return (uk.nhs.nhsia.datastandards.ecds.AntenatalCareStructure.PersonGroupResponsibleClinician) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().newInstance( type, null ); }
            
            public static uk.nhs.nhsia.datastandards.ecds.AntenatalCareStructure.PersonGroupResponsibleClinician newInstance(org.apache.xmlbeans.XmlOptions options) {
              return (uk.nhs.nhsia.datastandards.ecds.AntenatalCareStructure.PersonGroupResponsibleClinician) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().newInstance( type, options ); }
            
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
            org.apache.xmlbeans.XmlBeans.typeSystemForClassLoader(LocationGroup.class.getClassLoader(), "schemaorg_apache_xmlbeans.system.s30C1180FF47174E0C8A992A2D657328B").resolveHandle("locationgroup587aelemtype");
        
        /**
         * Gets the "DeliveryPlaceIntended" element
         */
        uk.nhs.nhsia.datastandards.ecds.AntenatalCareStructure.LocationGroup.DeliveryPlaceIntended getDeliveryPlaceIntended();
        
        /**
         * True if has "DeliveryPlaceIntended" element
         */
        boolean isSetDeliveryPlaceIntended();
        
        /**
         * Sets the "DeliveryPlaceIntended" element
         */
        void setDeliveryPlaceIntended(uk.nhs.nhsia.datastandards.ecds.AntenatalCareStructure.LocationGroup.DeliveryPlaceIntended deliveryPlaceIntended);
        
        /**
         * Appends and returns a new empty "DeliveryPlaceIntended" element
         */
        uk.nhs.nhsia.datastandards.ecds.AntenatalCareStructure.LocationGroup.DeliveryPlaceIntended addNewDeliveryPlaceIntended();
        
        /**
         * Unsets the "DeliveryPlaceIntended" element
         */
        void unsetDeliveryPlaceIntended();
        
        /**
         * An XML DeliveryPlaceIntended(@http://www.nhsia.nhs.uk/DataStandards/XMLschema/CDS/ns).
         *
         * This is a complex type.
         */
        public interface DeliveryPlaceIntended extends org.apache.xmlbeans.XmlObject
        {
            public static final org.apache.xmlbeans.SchemaType type = (org.apache.xmlbeans.SchemaType)
                org.apache.xmlbeans.XmlBeans.typeSystemForClassLoader(DeliveryPlaceIntended.class.getClassLoader(), "schemaorg_apache_xmlbeans.system.s30C1180FF47174E0C8A992A2D657328B").resolveHandle("deliveryplaceintendeda4b0elemtype");
            
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
             * Gets the "DeliveryPlaceChangeReasonCode" element
             */
            uk.nhs.nhsia.datastandards.ecds.DeliveryPlaceChangeReasonCodeType.Enum getDeliveryPlaceChangeReasonCode();
            
            /**
             * Gets (as xml) the "DeliveryPlaceChangeReasonCode" element
             */
            uk.nhs.nhsia.datastandards.ecds.DeliveryPlaceChangeReasonCodeType xgetDeliveryPlaceChangeReasonCode();
            
            /**
             * True if has "DeliveryPlaceChangeReasonCode" element
             */
            boolean isSetDeliveryPlaceChangeReasonCode();
            
            /**
             * Sets the "DeliveryPlaceChangeReasonCode" element
             */
            void setDeliveryPlaceChangeReasonCode(uk.nhs.nhsia.datastandards.ecds.DeliveryPlaceChangeReasonCodeType.Enum deliveryPlaceChangeReasonCode);
            
            /**
             * Sets (as xml) the "DeliveryPlaceChangeReasonCode" element
             */
            void xsetDeliveryPlaceChangeReasonCode(uk.nhs.nhsia.datastandards.ecds.DeliveryPlaceChangeReasonCodeType deliveryPlaceChangeReasonCode);
            
            /**
             * Unsets the "DeliveryPlaceChangeReasonCode" element
             */
            void unsetDeliveryPlaceChangeReasonCode();
            
            /**
             * Gets the "DeliveryPlaceTypeCode_Intended" element
             */
            java.lang.String getDeliveryPlaceTypeCodeIntended();
            
            /**
             * Gets (as xml) the "DeliveryPlaceTypeCode_Intended" element
             */
            uk.nhs.nhsia.datastandards.ecds.DeliveryPlaceTypeCodeIntendedType xgetDeliveryPlaceTypeCodeIntended();
            
            /**
             * True if has "DeliveryPlaceTypeCode_Intended" element
             */
            boolean isSetDeliveryPlaceTypeCodeIntended();
            
            /**
             * Sets the "DeliveryPlaceTypeCode_Intended" element
             */
            void setDeliveryPlaceTypeCodeIntended(java.lang.String deliveryPlaceTypeCodeIntended);
            
            /**
             * Sets (as xml) the "DeliveryPlaceTypeCode_Intended" element
             */
            void xsetDeliveryPlaceTypeCodeIntended(uk.nhs.nhsia.datastandards.ecds.DeliveryPlaceTypeCodeIntendedType deliveryPlaceTypeCodeIntended);
            
            /**
             * Unsets the "DeliveryPlaceTypeCode_Intended" element
             */
            void unsetDeliveryPlaceTypeCodeIntended();
            
            /**
             * A factory class with static methods for creating instances
             * of this type.
             */
            
            public static final class Factory
            {
                public static uk.nhs.nhsia.datastandards.ecds.AntenatalCareStructure.LocationGroup.DeliveryPlaceIntended newInstance() {
                  return (uk.nhs.nhsia.datastandards.ecds.AntenatalCareStructure.LocationGroup.DeliveryPlaceIntended) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().newInstance( type, null ); }
                
                public static uk.nhs.nhsia.datastandards.ecds.AntenatalCareStructure.LocationGroup.DeliveryPlaceIntended newInstance(org.apache.xmlbeans.XmlOptions options) {
                  return (uk.nhs.nhsia.datastandards.ecds.AntenatalCareStructure.LocationGroup.DeliveryPlaceIntended) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().newInstance( type, options ); }
                
                private Factory() { } // No instance of this class allowed
            }
        }
        
        /**
         * A factory class with static methods for creating instances
         * of this type.
         */
        
        public static final class Factory
        {
            public static uk.nhs.nhsia.datastandards.ecds.AntenatalCareStructure.LocationGroup newInstance() {
              return (uk.nhs.nhsia.datastandards.ecds.AntenatalCareStructure.LocationGroup) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().newInstance( type, null ); }
            
            public static uk.nhs.nhsia.datastandards.ecds.AntenatalCareStructure.LocationGroup newInstance(org.apache.xmlbeans.XmlOptions options) {
              return (uk.nhs.nhsia.datastandards.ecds.AntenatalCareStructure.LocationGroup) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().newInstance( type, options ); }
            
            private Factory() { } // No instance of this class allowed
        }
    }
    
    /**
     * A factory class with static methods for creating instances
     * of this type.
     */
    
    public static final class Factory
    {
        public static uk.nhs.nhsia.datastandards.ecds.AntenatalCareStructure newInstance() {
          return (uk.nhs.nhsia.datastandards.ecds.AntenatalCareStructure) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().newInstance( type, null ); }
        
        public static uk.nhs.nhsia.datastandards.ecds.AntenatalCareStructure newInstance(org.apache.xmlbeans.XmlOptions options) {
          return (uk.nhs.nhsia.datastandards.ecds.AntenatalCareStructure) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().newInstance( type, options ); }
        
        /** @param xmlAsString the string value to parse */
        public static uk.nhs.nhsia.datastandards.ecds.AntenatalCareStructure parse(java.lang.String xmlAsString) throws org.apache.xmlbeans.XmlException {
          return (uk.nhs.nhsia.datastandards.ecds.AntenatalCareStructure) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( xmlAsString, type, null ); }
        
        public static uk.nhs.nhsia.datastandards.ecds.AntenatalCareStructure parse(java.lang.String xmlAsString, org.apache.xmlbeans.XmlOptions options) throws org.apache.xmlbeans.XmlException {
          return (uk.nhs.nhsia.datastandards.ecds.AntenatalCareStructure) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( xmlAsString, type, options ); }
        
        /** @param file the file from which to load an xml document */
        public static uk.nhs.nhsia.datastandards.ecds.AntenatalCareStructure parse(java.io.File file) throws org.apache.xmlbeans.XmlException, java.io.IOException {
          return (uk.nhs.nhsia.datastandards.ecds.AntenatalCareStructure) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( file, type, null ); }
        
        public static uk.nhs.nhsia.datastandards.ecds.AntenatalCareStructure parse(java.io.File file, org.apache.xmlbeans.XmlOptions options) throws org.apache.xmlbeans.XmlException, java.io.IOException {
          return (uk.nhs.nhsia.datastandards.ecds.AntenatalCareStructure) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( file, type, options ); }
        
        public static uk.nhs.nhsia.datastandards.ecds.AntenatalCareStructure parse(java.net.URL u) throws org.apache.xmlbeans.XmlException, java.io.IOException {
          return (uk.nhs.nhsia.datastandards.ecds.AntenatalCareStructure) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( u, type, null ); }
        
        public static uk.nhs.nhsia.datastandards.ecds.AntenatalCareStructure parse(java.net.URL u, org.apache.xmlbeans.XmlOptions options) throws org.apache.xmlbeans.XmlException, java.io.IOException {
          return (uk.nhs.nhsia.datastandards.ecds.AntenatalCareStructure) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( u, type, options ); }
        
        public static uk.nhs.nhsia.datastandards.ecds.AntenatalCareStructure parse(java.io.InputStream is) throws org.apache.xmlbeans.XmlException, java.io.IOException {
          return (uk.nhs.nhsia.datastandards.ecds.AntenatalCareStructure) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( is, type, null ); }
        
        public static uk.nhs.nhsia.datastandards.ecds.AntenatalCareStructure parse(java.io.InputStream is, org.apache.xmlbeans.XmlOptions options) throws org.apache.xmlbeans.XmlException, java.io.IOException {
          return (uk.nhs.nhsia.datastandards.ecds.AntenatalCareStructure) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( is, type, options ); }
        
        public static uk.nhs.nhsia.datastandards.ecds.AntenatalCareStructure parse(java.io.Reader r) throws org.apache.xmlbeans.XmlException, java.io.IOException {
          return (uk.nhs.nhsia.datastandards.ecds.AntenatalCareStructure) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( r, type, null ); }
        
        public static uk.nhs.nhsia.datastandards.ecds.AntenatalCareStructure parse(java.io.Reader r, org.apache.xmlbeans.XmlOptions options) throws org.apache.xmlbeans.XmlException, java.io.IOException {
          return (uk.nhs.nhsia.datastandards.ecds.AntenatalCareStructure) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( r, type, options ); }
        
        public static uk.nhs.nhsia.datastandards.ecds.AntenatalCareStructure parse(javax.xml.stream.XMLStreamReader sr) throws org.apache.xmlbeans.XmlException {
          return (uk.nhs.nhsia.datastandards.ecds.AntenatalCareStructure) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( sr, type, null ); }
        
        public static uk.nhs.nhsia.datastandards.ecds.AntenatalCareStructure parse(javax.xml.stream.XMLStreamReader sr, org.apache.xmlbeans.XmlOptions options) throws org.apache.xmlbeans.XmlException {
          return (uk.nhs.nhsia.datastandards.ecds.AntenatalCareStructure) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( sr, type, options ); }
        
        public static uk.nhs.nhsia.datastandards.ecds.AntenatalCareStructure parse(org.w3c.dom.Node node) throws org.apache.xmlbeans.XmlException {
          return (uk.nhs.nhsia.datastandards.ecds.AntenatalCareStructure) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( node, type, null ); }
        
        public static uk.nhs.nhsia.datastandards.ecds.AntenatalCareStructure parse(org.w3c.dom.Node node, org.apache.xmlbeans.XmlOptions options) throws org.apache.xmlbeans.XmlException {
          return (uk.nhs.nhsia.datastandards.ecds.AntenatalCareStructure) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( node, type, options ); }
        
        /** @deprecated {@link org.apache.xmlbeans.xml.stream.XMLInputStream} */
        public static uk.nhs.nhsia.datastandards.ecds.AntenatalCareStructure parse(org.apache.xmlbeans.xml.stream.XMLInputStream xis) throws org.apache.xmlbeans.XmlException, org.apache.xmlbeans.xml.stream.XMLStreamException {
          return (uk.nhs.nhsia.datastandards.ecds.AntenatalCareStructure) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( xis, type, null ); }
        
        /** @deprecated {@link org.apache.xmlbeans.xml.stream.XMLInputStream} */
        public static uk.nhs.nhsia.datastandards.ecds.AntenatalCareStructure parse(org.apache.xmlbeans.xml.stream.XMLInputStream xis, org.apache.xmlbeans.XmlOptions options) throws org.apache.xmlbeans.XmlException, org.apache.xmlbeans.xml.stream.XMLStreamException {
          return (uk.nhs.nhsia.datastandards.ecds.AntenatalCareStructure) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( xis, type, options ); }
        
        /** @deprecated {@link org.apache.xmlbeans.xml.stream.XMLInputStream} */
        public static org.apache.xmlbeans.xml.stream.XMLInputStream newValidatingXMLInputStream(org.apache.xmlbeans.xml.stream.XMLInputStream xis) throws org.apache.xmlbeans.XmlException, org.apache.xmlbeans.xml.stream.XMLStreamException {
          return org.apache.xmlbeans.XmlBeans.getContextTypeLoader().newValidatingXMLInputStream( xis, type, null ); }
        
        /** @deprecated {@link org.apache.xmlbeans.xml.stream.XMLInputStream} */
        public static org.apache.xmlbeans.xml.stream.XMLInputStream newValidatingXMLInputStream(org.apache.xmlbeans.xml.stream.XMLInputStream xis, org.apache.xmlbeans.XmlOptions options) throws org.apache.xmlbeans.XmlException, org.apache.xmlbeans.xml.stream.XMLStreamException {
          return org.apache.xmlbeans.XmlBeans.getContextTypeLoader().newValidatingXMLInputStream( xis, type, options ); }
        
        private Factory() { } // No instance of this class allowed
    }
}
