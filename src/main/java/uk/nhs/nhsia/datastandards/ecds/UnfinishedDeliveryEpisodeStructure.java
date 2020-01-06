/*
 * XML Type:  UnfinishedDeliveryEpisode_Structure
 * Namespace: http://www.nhsia.nhs.uk/DataStandards/XMLschema/CDS/ns
 * Java type: uk.nhs.nhsia.datastandards.ecds.UnfinishedDeliveryEpisodeStructure
 *
 * Automatically generated - do not modify.
 */
package uk.nhs.nhsia.datastandards.ecds;


/**
 * An XML UnfinishedDeliveryEpisode_Structure(@http://www.nhsia.nhs.uk/DataStandards/XMLschema/CDS/ns).
 *
 * This is a complex type.
 */
public interface UnfinishedDeliveryEpisodeStructure extends org.apache.xmlbeans.XmlObject
{
    public static final org.apache.xmlbeans.SchemaType type = (org.apache.xmlbeans.SchemaType)
        org.apache.xmlbeans.XmlBeans.typeSystemForClassLoader(UnfinishedDeliveryEpisodeStructure.class.getClassLoader(), "schemaorg_apache_xmlbeans.system.s30C1180FF47174E0C8A992A2D657328B").resolveHandle("unfinisheddeliveryepisodestructure98b3type");
    
    /**
     * Gets the "EpisodeCharacteristics" element
     */
    uk.nhs.nhsia.datastandards.ecds.UnfinishedDeliveryEpisodeStructure.EpisodeCharacteristics getEpisodeCharacteristics();
    
    /**
     * Sets the "EpisodeCharacteristics" element
     */
    void setEpisodeCharacteristics(uk.nhs.nhsia.datastandards.ecds.UnfinishedDeliveryEpisodeStructure.EpisodeCharacteristics episodeCharacteristics);
    
    /**
     * Appends and returns a new empty "EpisodeCharacteristics" element
     */
    uk.nhs.nhsia.datastandards.ecds.UnfinishedDeliveryEpisodeStructure.EpisodeCharacteristics addNewEpisodeCharacteristics();
    
    /**
     * Gets the "ServiceAgreementDetails" element
     */
    uk.nhs.nhsia.datastandards.ecds.ServiceAgreementDetailsStructure getServiceAgreementDetails();
    
    /**
     * Sets the "ServiceAgreementDetails" element
     */
    void setServiceAgreementDetails(uk.nhs.nhsia.datastandards.ecds.ServiceAgreementDetailsStructure serviceAgreementDetails);
    
    /**
     * Appends and returns a new empty "ServiceAgreementDetails" element
     */
    uk.nhs.nhsia.datastandards.ecds.ServiceAgreementDetailsStructure addNewServiceAgreementDetails();
    
    /**
     * Gets the "PersonGroup_Consultant" element
     */
    uk.nhs.nhsia.datastandards.ecds.PersonGroupConsultantStructure getPersonGroupConsultant();
    
    /**
     * True if has "PersonGroup_Consultant" element
     */
    boolean isSetPersonGroupConsultant();
    
    /**
     * Sets the "PersonGroup_Consultant" element
     */
    void setPersonGroupConsultant(uk.nhs.nhsia.datastandards.ecds.PersonGroupConsultantStructure personGroupConsultant);
    
    /**
     * Appends and returns a new empty "PersonGroup_Consultant" element
     */
    uk.nhs.nhsia.datastandards.ecds.PersonGroupConsultantStructure addNewPersonGroupConsultant();
    
    /**
     * Unsets the "PersonGroup_Consultant" element
     */
    void unsetPersonGroupConsultant();
    
    /**
     * Gets the "ClinicalDiagnosisDetails" element
     */
    uk.nhs.nhsia.datastandards.ecds.ClinicalDiagnosisStructure getClinicalDiagnosisDetails();
    
    /**
     * True if has "ClinicalDiagnosisDetails" element
     */
    boolean isSetClinicalDiagnosisDetails();
    
    /**
     * Sets the "ClinicalDiagnosisDetails" element
     */
    void setClinicalDiagnosisDetails(uk.nhs.nhsia.datastandards.ecds.ClinicalDiagnosisStructure clinicalDiagnosisDetails);
    
    /**
     * Appends and returns a new empty "ClinicalDiagnosisDetails" element
     */
    uk.nhs.nhsia.datastandards.ecds.ClinicalDiagnosisStructure addNewClinicalDiagnosisDetails();
    
    /**
     * Unsets the "ClinicalDiagnosisDetails" element
     */
    void unsetClinicalDiagnosisDetails();
    
    /**
     * Gets the "ClinicalTreatmentDetails" element
     */
    uk.nhs.nhsia.datastandards.ecds.ClinicalActivityStructure getClinicalTreatmentDetails();
    
    /**
     * True if has "ClinicalTreatmentDetails" element
     */
    boolean isSetClinicalTreatmentDetails();
    
    /**
     * Sets the "ClinicalTreatmentDetails" element
     */
    void setClinicalTreatmentDetails(uk.nhs.nhsia.datastandards.ecds.ClinicalActivityStructure clinicalTreatmentDetails);
    
    /**
     * Appends and returns a new empty "ClinicalTreatmentDetails" element
     */
    uk.nhs.nhsia.datastandards.ecds.ClinicalActivityStructure addNewClinicalTreatmentDetails();
    
    /**
     * Unsets the "ClinicalTreatmentDetails" element
     */
    void unsetClinicalTreatmentDetails();
    
    /**
     * Gets the "APCLocationGroup" element
     */
    uk.nhs.nhsia.datastandards.ecds.APCLocationGroupStructure getAPCLocationGroup();
    
    /**
     * True if has "APCLocationGroup" element
     */
    boolean isSetAPCLocationGroup();
    
    /**
     * Sets the "APCLocationGroup" element
     */
    void setAPCLocationGroup(uk.nhs.nhsia.datastandards.ecds.APCLocationGroupStructure apcLocationGroup);
    
    /**
     * Appends and returns a new empty "APCLocationGroup" element
     */
    uk.nhs.nhsia.datastandards.ecds.APCLocationGroupStructure addNewAPCLocationGroup();
    
    /**
     * Unsets the "APCLocationGroup" element
     */
    void unsetAPCLocationGroup();
    
    /**
     * An XML EpisodeCharacteristics(@http://www.nhsia.nhs.uk/DataStandards/XMLschema/CDS/ns).
     *
     * This is a complex type.
     */
    public interface EpisodeCharacteristics extends org.apache.xmlbeans.XmlObject
    {
        public static final org.apache.xmlbeans.SchemaType type = (org.apache.xmlbeans.SchemaType)
            org.apache.xmlbeans.XmlBeans.typeSystemForClassLoader(EpisodeCharacteristics.class.getClassLoader(), "schemaorg_apache_xmlbeans.system.s30C1180FF47174E0C8A992A2D657328B").resolveHandle("episodecharacteristics55daelemtype");
        
        /**
         * Gets the "EpisodeNumber" element
         */
        int getEpisodeNumber();
        
        /**
         * Gets (as xml) the "EpisodeNumber" element
         */
        uk.nhs.nhsia.datastandards.ecds.EpisodeNumberType xgetEpisodeNumber();
        
        /**
         * True if has "EpisodeNumber" element
         */
        boolean isSetEpisodeNumber();
        
        /**
         * Sets the "EpisodeNumber" element
         */
        void setEpisodeNumber(int episodeNumber);
        
        /**
         * Sets (as xml) the "EpisodeNumber" element
         */
        void xsetEpisodeNumber(uk.nhs.nhsia.datastandards.ecds.EpisodeNumberType episodeNumber);
        
        /**
         * Unsets the "EpisodeNumber" element
         */
        void unsetEpisodeNumber();
        
        /**
         * Gets the "LastEpisodeInSpellIndicatorCode" element
         */
        uk.nhs.nhsia.datastandards.ecds.LastEpisodeInSpellIndicatorCodeType.Enum getLastEpisodeInSpellIndicatorCode();
        
        /**
         * Gets (as xml) the "LastEpisodeInSpellIndicatorCode" element
         */
        uk.nhs.nhsia.datastandards.ecds.LastEpisodeInSpellIndicatorCodeType xgetLastEpisodeInSpellIndicatorCode();
        
        /**
         * True if has "LastEpisodeInSpellIndicatorCode" element
         */
        boolean isSetLastEpisodeInSpellIndicatorCode();
        
        /**
         * Sets the "LastEpisodeInSpellIndicatorCode" element
         */
        void setLastEpisodeInSpellIndicatorCode(uk.nhs.nhsia.datastandards.ecds.LastEpisodeInSpellIndicatorCodeType.Enum lastEpisodeInSpellIndicatorCode);
        
        /**
         * Sets (as xml) the "LastEpisodeInSpellIndicatorCode" element
         */
        void xsetLastEpisodeInSpellIndicatorCode(uk.nhs.nhsia.datastandards.ecds.LastEpisodeInSpellIndicatorCodeType lastEpisodeInSpellIndicatorCode);
        
        /**
         * Unsets the "LastEpisodeInSpellIndicatorCode" element
         */
        void unsetLastEpisodeInSpellIndicatorCode();
        
        /**
         * Gets the "OperationStatusCode" element
         */
        uk.nhs.nhsia.datastandards.ecds.OperationStatusCodeType.Enum getOperationStatusCode();
        
        /**
         * Gets (as xml) the "OperationStatusCode" element
         */
        uk.nhs.nhsia.datastandards.ecds.OperationStatusCodeType xgetOperationStatusCode();
        
        /**
         * True if has "OperationStatusCode" element
         */
        boolean isSetOperationStatusCode();
        
        /**
         * Sets the "OperationStatusCode" element
         */
        void setOperationStatusCode(uk.nhs.nhsia.datastandards.ecds.OperationStatusCodeType.Enum operationStatusCode);
        
        /**
         * Sets (as xml) the "OperationStatusCode" element
         */
        void xsetOperationStatusCode(uk.nhs.nhsia.datastandards.ecds.OperationStatusCodeType operationStatusCode);
        
        /**
         * Unsets the "OperationStatusCode" element
         */
        void unsetOperationStatusCode();
        
        /**
         * Gets the "PsychiatricPatientStatusCode" element
         */
        uk.nhs.nhsia.datastandards.ecds.PsychiatricPatientStatusCodeType.Enum getPsychiatricPatientStatusCode();
        
        /**
         * Gets (as xml) the "PsychiatricPatientStatusCode" element
         */
        uk.nhs.nhsia.datastandards.ecds.PsychiatricPatientStatusCodeType xgetPsychiatricPatientStatusCode();
        
        /**
         * True if has "PsychiatricPatientStatusCode" element
         */
        boolean isSetPsychiatricPatientStatusCode();
        
        /**
         * Sets the "PsychiatricPatientStatusCode" element
         */
        void setPsychiatricPatientStatusCode(uk.nhs.nhsia.datastandards.ecds.PsychiatricPatientStatusCodeType.Enum psychiatricPatientStatusCode);
        
        /**
         * Sets (as xml) the "PsychiatricPatientStatusCode" element
         */
        void xsetPsychiatricPatientStatusCode(uk.nhs.nhsia.datastandards.ecds.PsychiatricPatientStatusCodeType psychiatricPatientStatusCode);
        
        /**
         * Unsets the "PsychiatricPatientStatusCode" element
         */
        void unsetPsychiatricPatientStatusCode();
        
        /**
         * Gets the "StartDate_Episode" element
         */
        java.util.Calendar getStartDateEpisode();
        
        /**
         * Gets (as xml) the "StartDate_Episode" element
         */
        uk.nhs.nhsia.datastandards.ecds.StartDateEpisodeType xgetStartDateEpisode();
        
        /**
         * Sets the "StartDate_Episode" element
         */
        void setStartDateEpisode(java.util.Calendar startDateEpisode);
        
        /**
         * Sets (as xml) the "StartDate_Episode" element
         */
        void xsetStartDateEpisode(uk.nhs.nhsia.datastandards.ecds.StartDateEpisodeType startDateEpisode);
        
        /**
         * Gets the "StartTime_Episode" element
         */
        java.util.Calendar getStartTimeEpisode();
        
        /**
         * Gets (as xml) the "StartTime_Episode" element
         */
        uk.nhs.nhsia.datastandards.ecds.StartTimeEpisodeType xgetStartTimeEpisode();
        
        /**
         * True if has "StartTime_Episode" element
         */
        boolean isSetStartTimeEpisode();
        
        /**
         * Sets the "StartTime_Episode" element
         */
        void setStartTimeEpisode(java.util.Calendar startTimeEpisode);
        
        /**
         * Sets (as xml) the "StartTime_Episode" element
         */
        void xsetStartTimeEpisode(uk.nhs.nhsia.datastandards.ecds.StartTimeEpisodeType startTimeEpisode);
        
        /**
         * Unsets the "StartTime_Episode" element
         */
        void unsetStartTimeEpisode();
        
        /**
         * Gets the "EndDate_Episode" element
         */
        java.util.Calendar getEndDateEpisode();
        
        /**
         * Gets (as xml) the "EndDate_Episode" element
         */
        uk.nhs.nhsia.datastandards.ecds.EndDateEpisodeType xgetEndDateEpisode();
        
        /**
         * True if has "EndDate_Episode" element
         */
        boolean isSetEndDateEpisode();
        
        /**
         * Sets the "EndDate_Episode" element
         */
        void setEndDateEpisode(java.util.Calendar endDateEpisode);
        
        /**
         * Sets (as xml) the "EndDate_Episode" element
         */
        void xsetEndDateEpisode(uk.nhs.nhsia.datastandards.ecds.EndDateEpisodeType endDateEpisode);
        
        /**
         * Unsets the "EndDate_Episode" element
         */
        void unsetEndDateEpisode();
        
        /**
         * Gets the "EndTime_Episode" element
         */
        java.util.Calendar getEndTimeEpisode();
        
        /**
         * Gets (as xml) the "EndTime_Episode" element
         */
        uk.nhs.nhsia.datastandards.ecds.EndTimeEpisodeType xgetEndTimeEpisode();
        
        /**
         * True if has "EndTime_Episode" element
         */
        boolean isSetEndTimeEpisode();
        
        /**
         * Sets the "EndTime_Episode" element
         */
        void setEndTimeEpisode(java.util.Calendar endTimeEpisode);
        
        /**
         * Sets (as xml) the "EndTime_Episode" element
         */
        void xsetEndTimeEpisode(uk.nhs.nhsia.datastandards.ecds.EndTimeEpisodeType endTimeEpisode);
        
        /**
         * Unsets the "EndTime_Episode" element
         */
        void unsetEndTimeEpisode();
        
        /**
         * Gets the "AgeAtCDSActivityDate" element
         */
        int getAgeAtCDSActivityDate();
        
        /**
         * Gets (as xml) the "AgeAtCDSActivityDate" element
         */
        uk.nhs.nhsia.datastandards.ecds.AgeAtCDSActivityDateType xgetAgeAtCDSActivityDate();
        
        /**
         * Sets the "AgeAtCDSActivityDate" element
         */
        void setAgeAtCDSActivityDate(int ageAtCDSActivityDate);
        
        /**
         * Sets (as xml) the "AgeAtCDSActivityDate" element
         */
        void xsetAgeAtCDSActivityDate(uk.nhs.nhsia.datastandards.ecds.AgeAtCDSActivityDateType ageAtCDSActivityDate);
        
        /**
         * Gets the "MultiProfOrDiscIndCode" element
         */
        uk.nhs.nhsia.datastandards.ecds.MultiProfOrDiscIndCodeType.Enum getMultiProfOrDiscIndCode();
        
        /**
         * Gets (as xml) the "MultiProfOrDiscIndCode" element
         */
        uk.nhs.nhsia.datastandards.ecds.MultiProfOrDiscIndCodeType xgetMultiProfOrDiscIndCode();
        
        /**
         * True if has "MultiProfOrDiscIndCode" element
         */
        boolean isSetMultiProfOrDiscIndCode();
        
        /**
         * Sets the "MultiProfOrDiscIndCode" element
         */
        void setMultiProfOrDiscIndCode(uk.nhs.nhsia.datastandards.ecds.MultiProfOrDiscIndCodeType.Enum multiProfOrDiscIndCode);
        
        /**
         * Sets (as xml) the "MultiProfOrDiscIndCode" element
         */
        void xsetMultiProfOrDiscIndCode(uk.nhs.nhsia.datastandards.ecds.MultiProfOrDiscIndCodeType multiProfOrDiscIndCode);
        
        /**
         * Unsets the "MultiProfOrDiscIndCode" element
         */
        void unsetMultiProfOrDiscIndCode();
        
        /**
         * Gets the "RehabilitationAssessmentTeamType" element
         */
        uk.nhs.nhsia.datastandards.ecds.RehabilitationAssessmentTeamTypeType.Enum getRehabilitationAssessmentTeamType();
        
        /**
         * Gets (as xml) the "RehabilitationAssessmentTeamType" element
         */
        uk.nhs.nhsia.datastandards.ecds.RehabilitationAssessmentTeamTypeType xgetRehabilitationAssessmentTeamType();
        
        /**
         * True if has "RehabilitationAssessmentTeamType" element
         */
        boolean isSetRehabilitationAssessmentTeamType();
        
        /**
         * Sets the "RehabilitationAssessmentTeamType" element
         */
        void setRehabilitationAssessmentTeamType(uk.nhs.nhsia.datastandards.ecds.RehabilitationAssessmentTeamTypeType.Enum rehabilitationAssessmentTeamType);
        
        /**
         * Sets (as xml) the "RehabilitationAssessmentTeamType" element
         */
        void xsetRehabilitationAssessmentTeamType(uk.nhs.nhsia.datastandards.ecds.RehabilitationAssessmentTeamTypeType rehabilitationAssessmentTeamType);
        
        /**
         * Unsets the "RehabilitationAssessmentTeamType" element
         */
        void unsetRehabilitationAssessmentTeamType();
        
        /**
         * Gets array of all "OverseasVisitorStatus" elements
         */
        uk.nhs.nhsia.datastandards.ecds.OverseasVisitorStatusStructure[] getOverseasVisitorStatusArray();
        
        /**
         * Gets ith "OverseasVisitorStatus" element
         */
        uk.nhs.nhsia.datastandards.ecds.OverseasVisitorStatusStructure getOverseasVisitorStatusArray(int i);
        
        /**
         * Returns number of "OverseasVisitorStatus" element
         */
        int sizeOfOverseasVisitorStatusArray();
        
        /**
         * Sets array of all "OverseasVisitorStatus" element
         */
        void setOverseasVisitorStatusArray(uk.nhs.nhsia.datastandards.ecds.OverseasVisitorStatusStructure[] overseasVisitorStatusArray);
        
        /**
         * Sets ith "OverseasVisitorStatus" element
         */
        void setOverseasVisitorStatusArray(int i, uk.nhs.nhsia.datastandards.ecds.OverseasVisitorStatusStructure overseasVisitorStatus);
        
        /**
         * Inserts and returns a new empty value (as xml) as the ith "OverseasVisitorStatus" element
         */
        uk.nhs.nhsia.datastandards.ecds.OverseasVisitorStatusStructure insertNewOverseasVisitorStatus(int i);
        
        /**
         * Appends and returns a new empty value (as xml) as the last "OverseasVisitorStatus" element
         */
        uk.nhs.nhsia.datastandards.ecds.OverseasVisitorStatusStructure addNewOverseasVisitorStatus();
        
        /**
         * Removes the ith "OverseasVisitorStatus" element
         */
        void removeOverseasVisitorStatus(int i);
        
        /**
         * A factory class with static methods for creating instances
         * of this type.
         */
        
        public static final class Factory
        {
            public static uk.nhs.nhsia.datastandards.ecds.UnfinishedDeliveryEpisodeStructure.EpisodeCharacteristics newInstance() {
              return (uk.nhs.nhsia.datastandards.ecds.UnfinishedDeliveryEpisodeStructure.EpisodeCharacteristics) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().newInstance( type, null ); }
            
            public static uk.nhs.nhsia.datastandards.ecds.UnfinishedDeliveryEpisodeStructure.EpisodeCharacteristics newInstance(org.apache.xmlbeans.XmlOptions options) {
              return (uk.nhs.nhsia.datastandards.ecds.UnfinishedDeliveryEpisodeStructure.EpisodeCharacteristics) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().newInstance( type, options ); }
            
            private Factory() { } // No instance of this class allowed
        }
    }
    
    /**
     * A factory class with static methods for creating instances
     * of this type.
     */
    
    public static final class Factory
    {
        public static uk.nhs.nhsia.datastandards.ecds.UnfinishedDeliveryEpisodeStructure newInstance() {
          return (uk.nhs.nhsia.datastandards.ecds.UnfinishedDeliveryEpisodeStructure) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().newInstance( type, null ); }
        
        public static uk.nhs.nhsia.datastandards.ecds.UnfinishedDeliveryEpisodeStructure newInstance(org.apache.xmlbeans.XmlOptions options) {
          return (uk.nhs.nhsia.datastandards.ecds.UnfinishedDeliveryEpisodeStructure) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().newInstance( type, options ); }
        
        /** @param xmlAsString the string value to parse */
        public static uk.nhs.nhsia.datastandards.ecds.UnfinishedDeliveryEpisodeStructure parse(java.lang.String xmlAsString) throws org.apache.xmlbeans.XmlException {
          return (uk.nhs.nhsia.datastandards.ecds.UnfinishedDeliveryEpisodeStructure) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( xmlAsString, type, null ); }
        
        public static uk.nhs.nhsia.datastandards.ecds.UnfinishedDeliveryEpisodeStructure parse(java.lang.String xmlAsString, org.apache.xmlbeans.XmlOptions options) throws org.apache.xmlbeans.XmlException {
          return (uk.nhs.nhsia.datastandards.ecds.UnfinishedDeliveryEpisodeStructure) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( xmlAsString, type, options ); }
        
        /** @param file the file from which to load an xml document */
        public static uk.nhs.nhsia.datastandards.ecds.UnfinishedDeliveryEpisodeStructure parse(java.io.File file) throws org.apache.xmlbeans.XmlException, java.io.IOException {
          return (uk.nhs.nhsia.datastandards.ecds.UnfinishedDeliveryEpisodeStructure) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( file, type, null ); }
        
        public static uk.nhs.nhsia.datastandards.ecds.UnfinishedDeliveryEpisodeStructure parse(java.io.File file, org.apache.xmlbeans.XmlOptions options) throws org.apache.xmlbeans.XmlException, java.io.IOException {
          return (uk.nhs.nhsia.datastandards.ecds.UnfinishedDeliveryEpisodeStructure) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( file, type, options ); }
        
        public static uk.nhs.nhsia.datastandards.ecds.UnfinishedDeliveryEpisodeStructure parse(java.net.URL u) throws org.apache.xmlbeans.XmlException, java.io.IOException {
          return (uk.nhs.nhsia.datastandards.ecds.UnfinishedDeliveryEpisodeStructure) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( u, type, null ); }
        
        public static uk.nhs.nhsia.datastandards.ecds.UnfinishedDeliveryEpisodeStructure parse(java.net.URL u, org.apache.xmlbeans.XmlOptions options) throws org.apache.xmlbeans.XmlException, java.io.IOException {
          return (uk.nhs.nhsia.datastandards.ecds.UnfinishedDeliveryEpisodeStructure) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( u, type, options ); }
        
        public static uk.nhs.nhsia.datastandards.ecds.UnfinishedDeliveryEpisodeStructure parse(java.io.InputStream is) throws org.apache.xmlbeans.XmlException, java.io.IOException {
          return (uk.nhs.nhsia.datastandards.ecds.UnfinishedDeliveryEpisodeStructure) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( is, type, null ); }
        
        public static uk.nhs.nhsia.datastandards.ecds.UnfinishedDeliveryEpisodeStructure parse(java.io.InputStream is, org.apache.xmlbeans.XmlOptions options) throws org.apache.xmlbeans.XmlException, java.io.IOException {
          return (uk.nhs.nhsia.datastandards.ecds.UnfinishedDeliveryEpisodeStructure) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( is, type, options ); }
        
        public static uk.nhs.nhsia.datastandards.ecds.UnfinishedDeliveryEpisodeStructure parse(java.io.Reader r) throws org.apache.xmlbeans.XmlException, java.io.IOException {
          return (uk.nhs.nhsia.datastandards.ecds.UnfinishedDeliveryEpisodeStructure) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( r, type, null ); }
        
        public static uk.nhs.nhsia.datastandards.ecds.UnfinishedDeliveryEpisodeStructure parse(java.io.Reader r, org.apache.xmlbeans.XmlOptions options) throws org.apache.xmlbeans.XmlException, java.io.IOException {
          return (uk.nhs.nhsia.datastandards.ecds.UnfinishedDeliveryEpisodeStructure) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( r, type, options ); }
        
        public static uk.nhs.nhsia.datastandards.ecds.UnfinishedDeliveryEpisodeStructure parse(javax.xml.stream.XMLStreamReader sr) throws org.apache.xmlbeans.XmlException {
          return (uk.nhs.nhsia.datastandards.ecds.UnfinishedDeliveryEpisodeStructure) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( sr, type, null ); }
        
        public static uk.nhs.nhsia.datastandards.ecds.UnfinishedDeliveryEpisodeStructure parse(javax.xml.stream.XMLStreamReader sr, org.apache.xmlbeans.XmlOptions options) throws org.apache.xmlbeans.XmlException {
          return (uk.nhs.nhsia.datastandards.ecds.UnfinishedDeliveryEpisodeStructure) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( sr, type, options ); }
        
        public static uk.nhs.nhsia.datastandards.ecds.UnfinishedDeliveryEpisodeStructure parse(org.w3c.dom.Node node) throws org.apache.xmlbeans.XmlException {
          return (uk.nhs.nhsia.datastandards.ecds.UnfinishedDeliveryEpisodeStructure) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( node, type, null ); }
        
        public static uk.nhs.nhsia.datastandards.ecds.UnfinishedDeliveryEpisodeStructure parse(org.w3c.dom.Node node, org.apache.xmlbeans.XmlOptions options) throws org.apache.xmlbeans.XmlException {
          return (uk.nhs.nhsia.datastandards.ecds.UnfinishedDeliveryEpisodeStructure) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( node, type, options ); }
        
        /** @deprecated {@link org.apache.xmlbeans.xml.stream.XMLInputStream} */
        public static uk.nhs.nhsia.datastandards.ecds.UnfinishedDeliveryEpisodeStructure parse(org.apache.xmlbeans.xml.stream.XMLInputStream xis) throws org.apache.xmlbeans.XmlException, org.apache.xmlbeans.xml.stream.XMLStreamException {
          return (uk.nhs.nhsia.datastandards.ecds.UnfinishedDeliveryEpisodeStructure) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( xis, type, null ); }
        
        /** @deprecated {@link org.apache.xmlbeans.xml.stream.XMLInputStream} */
        public static uk.nhs.nhsia.datastandards.ecds.UnfinishedDeliveryEpisodeStructure parse(org.apache.xmlbeans.xml.stream.XMLInputStream xis, org.apache.xmlbeans.XmlOptions options) throws org.apache.xmlbeans.XmlException, org.apache.xmlbeans.xml.stream.XMLStreamException {
          return (uk.nhs.nhsia.datastandards.ecds.UnfinishedDeliveryEpisodeStructure) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( xis, type, options ); }
        
        /** @deprecated {@link org.apache.xmlbeans.xml.stream.XMLInputStream} */
        public static org.apache.xmlbeans.xml.stream.XMLInputStream newValidatingXMLInputStream(org.apache.xmlbeans.xml.stream.XMLInputStream xis) throws org.apache.xmlbeans.XmlException, org.apache.xmlbeans.xml.stream.XMLStreamException {
          return org.apache.xmlbeans.XmlBeans.getContextTypeLoader().newValidatingXMLInputStream( xis, type, null ); }
        
        /** @deprecated {@link org.apache.xmlbeans.xml.stream.XMLInputStream} */
        public static org.apache.xmlbeans.xml.stream.XMLInputStream newValidatingXMLInputStream(org.apache.xmlbeans.xml.stream.XMLInputStream xis, org.apache.xmlbeans.XmlOptions options) throws org.apache.xmlbeans.XmlException, org.apache.xmlbeans.xml.stream.XMLStreamException {
          return org.apache.xmlbeans.XmlBeans.getContextTypeLoader().newValidatingXMLInputStream( xis, type, options ); }
        
        private Factory() { } // No instance of this class allowed
    }
}
