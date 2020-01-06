/*
 * XML Type:  AntenatalCare_Structure
 * Namespace: http://www.nhsia.nhs.uk/DataStandards/XMLschema/CDS/ns
 * Java type: uk.nhs.nhsia.datastandards.ecds.AntenatalCareStructure
 *
 * Automatically generated - do not modify.
 */
package uk.nhs.nhsia.datastandards.ecds.impl;
/**
 * An XML AntenatalCare_Structure(@http://www.nhsia.nhs.uk/DataStandards/XMLschema/CDS/ns).
 *
 * This is a complex type.
 */
public class AntenatalCareStructureImpl extends org.apache.xmlbeans.impl.values.XmlComplexContentImpl implements uk.nhs.nhsia.datastandards.ecds.AntenatalCareStructure
{
    private static final long serialVersionUID = 1L;
    
    public AntenatalCareStructureImpl(org.apache.xmlbeans.SchemaType sType)
    {
        super(sType);
    }
    
    private static final javax.xml.namespace.QName ACTIVITYCHARACTERISTICS$0 = 
        new javax.xml.namespace.QName("http://www.nhsia.nhs.uk/DataStandards/XMLschema/CDS/ns", "ActivityCharacteristics");
    private static final javax.xml.namespace.QName PERSONGROUPRESPONSIBLECLINICIAN$2 = 
        new javax.xml.namespace.QName("http://www.nhsia.nhs.uk/DataStandards/XMLschema/CDS/ns", "PersonGroup_ResponsibleClinician");
    private static final javax.xml.namespace.QName LOCATIONGROUP$4 = 
        new javax.xml.namespace.QName("http://www.nhsia.nhs.uk/DataStandards/XMLschema/CDS/ns", "LocationGroup");
    
    
    /**
     * Gets the "ActivityCharacteristics" element
     */
    public uk.nhs.nhsia.datastandards.ecds.AntenatalCareStructure.ActivityCharacteristics getActivityCharacteristics()
    {
        synchronized (monitor())
        {
            check_orphaned();
            uk.nhs.nhsia.datastandards.ecds.AntenatalCareStructure.ActivityCharacteristics target = null;
            target = (uk.nhs.nhsia.datastandards.ecds.AntenatalCareStructure.ActivityCharacteristics)get_store().find_element_user(ACTIVITYCHARACTERISTICS$0, 0);
            if (target == null)
            {
                return null;
            }
            return target;
        }
    }
    
    /**
     * True if has "ActivityCharacteristics" element
     */
    public boolean isSetActivityCharacteristics()
    {
        synchronized (monitor())
        {
            check_orphaned();
            return get_store().count_elements(ACTIVITYCHARACTERISTICS$0) != 0;
        }
    }
    
    /**
     * Sets the "ActivityCharacteristics" element
     */
    public void setActivityCharacteristics(uk.nhs.nhsia.datastandards.ecds.AntenatalCareStructure.ActivityCharacteristics activityCharacteristics)
    {
        generatedSetterHelperImpl(activityCharacteristics, ACTIVITYCHARACTERISTICS$0, 0, org.apache.xmlbeans.impl.values.XmlObjectBase.KIND_SETTERHELPER_SINGLETON);
    }
    
    /**
     * Appends and returns a new empty "ActivityCharacteristics" element
     */
    public uk.nhs.nhsia.datastandards.ecds.AntenatalCareStructure.ActivityCharacteristics addNewActivityCharacteristics()
    {
        synchronized (monitor())
        {
            check_orphaned();
            uk.nhs.nhsia.datastandards.ecds.AntenatalCareStructure.ActivityCharacteristics target = null;
            target = (uk.nhs.nhsia.datastandards.ecds.AntenatalCareStructure.ActivityCharacteristics)get_store().add_element_user(ACTIVITYCHARACTERISTICS$0);
            return target;
        }
    }
    
    /**
     * Unsets the "ActivityCharacteristics" element
     */
    public void unsetActivityCharacteristics()
    {
        synchronized (monitor())
        {
            check_orphaned();
            get_store().remove_element(ACTIVITYCHARACTERISTICS$0, 0);
        }
    }
    
    /**
     * Gets the "PersonGroup_ResponsibleClinician" element
     */
    public uk.nhs.nhsia.datastandards.ecds.AntenatalCareStructure.PersonGroupResponsibleClinician getPersonGroupResponsibleClinician()
    {
        synchronized (monitor())
        {
            check_orphaned();
            uk.nhs.nhsia.datastandards.ecds.AntenatalCareStructure.PersonGroupResponsibleClinician target = null;
            target = (uk.nhs.nhsia.datastandards.ecds.AntenatalCareStructure.PersonGroupResponsibleClinician)get_store().find_element_user(PERSONGROUPRESPONSIBLECLINICIAN$2, 0);
            if (target == null)
            {
                return null;
            }
            return target;
        }
    }
    
    /**
     * True if has "PersonGroup_ResponsibleClinician" element
     */
    public boolean isSetPersonGroupResponsibleClinician()
    {
        synchronized (monitor())
        {
            check_orphaned();
            return get_store().count_elements(PERSONGROUPRESPONSIBLECLINICIAN$2) != 0;
        }
    }
    
    /**
     * Sets the "PersonGroup_ResponsibleClinician" element
     */
    public void setPersonGroupResponsibleClinician(uk.nhs.nhsia.datastandards.ecds.AntenatalCareStructure.PersonGroupResponsibleClinician personGroupResponsibleClinician)
    {
        generatedSetterHelperImpl(personGroupResponsibleClinician, PERSONGROUPRESPONSIBLECLINICIAN$2, 0, org.apache.xmlbeans.impl.values.XmlObjectBase.KIND_SETTERHELPER_SINGLETON);
    }
    
    /**
     * Appends and returns a new empty "PersonGroup_ResponsibleClinician" element
     */
    public uk.nhs.nhsia.datastandards.ecds.AntenatalCareStructure.PersonGroupResponsibleClinician addNewPersonGroupResponsibleClinician()
    {
        synchronized (monitor())
        {
            check_orphaned();
            uk.nhs.nhsia.datastandards.ecds.AntenatalCareStructure.PersonGroupResponsibleClinician target = null;
            target = (uk.nhs.nhsia.datastandards.ecds.AntenatalCareStructure.PersonGroupResponsibleClinician)get_store().add_element_user(PERSONGROUPRESPONSIBLECLINICIAN$2);
            return target;
        }
    }
    
    /**
     * Unsets the "PersonGroup_ResponsibleClinician" element
     */
    public void unsetPersonGroupResponsibleClinician()
    {
        synchronized (monitor())
        {
            check_orphaned();
            get_store().remove_element(PERSONGROUPRESPONSIBLECLINICIAN$2, 0);
        }
    }
    
    /**
     * Gets the "LocationGroup" element
     */
    public uk.nhs.nhsia.datastandards.ecds.AntenatalCareStructure.LocationGroup getLocationGroup()
    {
        synchronized (monitor())
        {
            check_orphaned();
            uk.nhs.nhsia.datastandards.ecds.AntenatalCareStructure.LocationGroup target = null;
            target = (uk.nhs.nhsia.datastandards.ecds.AntenatalCareStructure.LocationGroup)get_store().find_element_user(LOCATIONGROUP$4, 0);
            if (target == null)
            {
                return null;
            }
            return target;
        }
    }
    
    /**
     * True if has "LocationGroup" element
     */
    public boolean isSetLocationGroup()
    {
        synchronized (monitor())
        {
            check_orphaned();
            return get_store().count_elements(LOCATIONGROUP$4) != 0;
        }
    }
    
    /**
     * Sets the "LocationGroup" element
     */
    public void setLocationGroup(uk.nhs.nhsia.datastandards.ecds.AntenatalCareStructure.LocationGroup locationGroup)
    {
        generatedSetterHelperImpl(locationGroup, LOCATIONGROUP$4, 0, org.apache.xmlbeans.impl.values.XmlObjectBase.KIND_SETTERHELPER_SINGLETON);
    }
    
    /**
     * Appends and returns a new empty "LocationGroup" element
     */
    public uk.nhs.nhsia.datastandards.ecds.AntenatalCareStructure.LocationGroup addNewLocationGroup()
    {
        synchronized (monitor())
        {
            check_orphaned();
            uk.nhs.nhsia.datastandards.ecds.AntenatalCareStructure.LocationGroup target = null;
            target = (uk.nhs.nhsia.datastandards.ecds.AntenatalCareStructure.LocationGroup)get_store().add_element_user(LOCATIONGROUP$4);
            return target;
        }
    }
    
    /**
     * Unsets the "LocationGroup" element
     */
    public void unsetLocationGroup()
    {
        synchronized (monitor())
        {
            check_orphaned();
            get_store().remove_element(LOCATIONGROUP$4, 0);
        }
    }
    /**
     * An XML ActivityCharacteristics(@http://www.nhsia.nhs.uk/DataStandards/XMLschema/CDS/ns).
     *
     * This is a complex type.
     */
    public static class ActivityCharacteristicsImpl extends org.apache.xmlbeans.impl.values.XmlComplexContentImpl implements uk.nhs.nhsia.datastandards.ecds.AntenatalCareStructure.ActivityCharacteristics
    {
        private static final long serialVersionUID = 1L;
        
        public ActivityCharacteristicsImpl(org.apache.xmlbeans.SchemaType sType)
        {
            super(sType);
        }
        
        private static final javax.xml.namespace.QName FIRSTANTENATALASSESSMENTDATE$0 = 
            new javax.xml.namespace.QName("http://www.nhsia.nhs.uk/DataStandards/XMLschema/CDS/ns", "FirstAntenatalAssessmentDate");
        
        
        /**
         * Gets the "FirstAntenatalAssessmentDate" element
         */
        public java.util.Calendar getFirstAntenatalAssessmentDate()
        {
            synchronized (monitor())
            {
                check_orphaned();
                org.apache.xmlbeans.SimpleValue target = null;
                target = (org.apache.xmlbeans.SimpleValue)get_store().find_element_user(FIRSTANTENATALASSESSMENTDATE$0, 0);
                if (target == null)
                {
                    return null;
                }
                return target.getCalendarValue();
            }
        }
        
        /**
         * Gets (as xml) the "FirstAntenatalAssessmentDate" element
         */
        public uk.nhs.nhsia.datastandards.ecds.FirstAntenatalAssessmentDateType xgetFirstAntenatalAssessmentDate()
        {
            synchronized (monitor())
            {
                check_orphaned();
                uk.nhs.nhsia.datastandards.ecds.FirstAntenatalAssessmentDateType target = null;
                target = (uk.nhs.nhsia.datastandards.ecds.FirstAntenatalAssessmentDateType)get_store().find_element_user(FIRSTANTENATALASSESSMENTDATE$0, 0);
                return target;
            }
        }
        
        /**
         * True if has "FirstAntenatalAssessmentDate" element
         */
        public boolean isSetFirstAntenatalAssessmentDate()
        {
            synchronized (monitor())
            {
                check_orphaned();
                return get_store().count_elements(FIRSTANTENATALASSESSMENTDATE$0) != 0;
            }
        }
        
        /**
         * Sets the "FirstAntenatalAssessmentDate" element
         */
        public void setFirstAntenatalAssessmentDate(java.util.Calendar firstAntenatalAssessmentDate)
        {
            synchronized (monitor())
            {
                check_orphaned();
                org.apache.xmlbeans.SimpleValue target = null;
                target = (org.apache.xmlbeans.SimpleValue)get_store().find_element_user(FIRSTANTENATALASSESSMENTDATE$0, 0);
                if (target == null)
                {
                    target = (org.apache.xmlbeans.SimpleValue)get_store().add_element_user(FIRSTANTENATALASSESSMENTDATE$0);
                }
                target.setCalendarValue(firstAntenatalAssessmentDate);
            }
        }
        
        /**
         * Sets (as xml) the "FirstAntenatalAssessmentDate" element
         */
        public void xsetFirstAntenatalAssessmentDate(uk.nhs.nhsia.datastandards.ecds.FirstAntenatalAssessmentDateType firstAntenatalAssessmentDate)
        {
            synchronized (monitor())
            {
                check_orphaned();
                uk.nhs.nhsia.datastandards.ecds.FirstAntenatalAssessmentDateType target = null;
                target = (uk.nhs.nhsia.datastandards.ecds.FirstAntenatalAssessmentDateType)get_store().find_element_user(FIRSTANTENATALASSESSMENTDATE$0, 0);
                if (target == null)
                {
                    target = (uk.nhs.nhsia.datastandards.ecds.FirstAntenatalAssessmentDateType)get_store().add_element_user(FIRSTANTENATALASSESSMENTDATE$0);
                }
                target.set(firstAntenatalAssessmentDate);
            }
        }
        
        /**
         * Unsets the "FirstAntenatalAssessmentDate" element
         */
        public void unsetFirstAntenatalAssessmentDate()
        {
            synchronized (monitor())
            {
                check_orphaned();
                get_store().remove_element(FIRSTANTENATALASSESSMENTDATE$0, 0);
            }
        }
    }
    /**
     * An XML PersonGroup_ResponsibleClinician(@http://www.nhsia.nhs.uk/DataStandards/XMLschema/CDS/ns).
     *
     * This is a complex type.
     */
    public static class PersonGroupResponsibleClinicianImpl extends org.apache.xmlbeans.impl.values.XmlComplexContentImpl implements uk.nhs.nhsia.datastandards.ecds.AntenatalCareStructure.PersonGroupResponsibleClinician
    {
        private static final long serialVersionUID = 1L;
        
        public PersonGroupResponsibleClinicianImpl(org.apache.xmlbeans.SchemaType sType)
        {
            super(sType);
        }
        
        private static final javax.xml.namespace.QName GENERALMEDICALPRACTITIONERANTENATALCARE$0 = 
            new javax.xml.namespace.QName("http://www.nhsia.nhs.uk/DataStandards/XMLschema/CDS/ns", "GeneralMedicalPractitioner_AntenatalCare");
        private static final javax.xml.namespace.QName GENERALMEDICALPRACTIONERPRACTICEANTENATALCARE$2 = 
            new javax.xml.namespace.QName("http://www.nhsia.nhs.uk/DataStandards/XMLschema/CDS/ns", "GeneralMedicalPractionerPractice_AntenatalCare");
        
        
        /**
         * Gets the "GeneralMedicalPractitioner_AntenatalCare" element
         */
        public java.lang.String getGeneralMedicalPractitionerAntenatalCare()
        {
            synchronized (monitor())
            {
                check_orphaned();
                org.apache.xmlbeans.SimpleValue target = null;
                target = (org.apache.xmlbeans.SimpleValue)get_store().find_element_user(GENERALMEDICALPRACTITIONERANTENATALCARE$0, 0);
                if (target == null)
                {
                    return null;
                }
                return target.getStringValue();
            }
        }
        
        /**
         * Gets (as xml) the "GeneralMedicalPractitioner_AntenatalCare" element
         */
        public uk.nhs.nhsia.datastandards.ecds.GeneralMedicalPractitionerAntenatalCareType xgetGeneralMedicalPractitionerAntenatalCare()
        {
            synchronized (monitor())
            {
                check_orphaned();
                uk.nhs.nhsia.datastandards.ecds.GeneralMedicalPractitionerAntenatalCareType target = null;
                target = (uk.nhs.nhsia.datastandards.ecds.GeneralMedicalPractitionerAntenatalCareType)get_store().find_element_user(GENERALMEDICALPRACTITIONERANTENATALCARE$0, 0);
                return target;
            }
        }
        
        /**
         * True if has "GeneralMedicalPractitioner_AntenatalCare" element
         */
        public boolean isSetGeneralMedicalPractitionerAntenatalCare()
        {
            synchronized (monitor())
            {
                check_orphaned();
                return get_store().count_elements(GENERALMEDICALPRACTITIONERANTENATALCARE$0) != 0;
            }
        }
        
        /**
         * Sets the "GeneralMedicalPractitioner_AntenatalCare" element
         */
        public void setGeneralMedicalPractitionerAntenatalCare(java.lang.String generalMedicalPractitionerAntenatalCare)
        {
            synchronized (monitor())
            {
                check_orphaned();
                org.apache.xmlbeans.SimpleValue target = null;
                target = (org.apache.xmlbeans.SimpleValue)get_store().find_element_user(GENERALMEDICALPRACTITIONERANTENATALCARE$0, 0);
                if (target == null)
                {
                    target = (org.apache.xmlbeans.SimpleValue)get_store().add_element_user(GENERALMEDICALPRACTITIONERANTENATALCARE$0);
                }
                target.setStringValue(generalMedicalPractitionerAntenatalCare);
            }
        }
        
        /**
         * Sets (as xml) the "GeneralMedicalPractitioner_AntenatalCare" element
         */
        public void xsetGeneralMedicalPractitionerAntenatalCare(uk.nhs.nhsia.datastandards.ecds.GeneralMedicalPractitionerAntenatalCareType generalMedicalPractitionerAntenatalCare)
        {
            synchronized (monitor())
            {
                check_orphaned();
                uk.nhs.nhsia.datastandards.ecds.GeneralMedicalPractitionerAntenatalCareType target = null;
                target = (uk.nhs.nhsia.datastandards.ecds.GeneralMedicalPractitionerAntenatalCareType)get_store().find_element_user(GENERALMEDICALPRACTITIONERANTENATALCARE$0, 0);
                if (target == null)
                {
                    target = (uk.nhs.nhsia.datastandards.ecds.GeneralMedicalPractitionerAntenatalCareType)get_store().add_element_user(GENERALMEDICALPRACTITIONERANTENATALCARE$0);
                }
                target.set(generalMedicalPractitionerAntenatalCare);
            }
        }
        
        /**
         * Unsets the "GeneralMedicalPractitioner_AntenatalCare" element
         */
        public void unsetGeneralMedicalPractitionerAntenatalCare()
        {
            synchronized (monitor())
            {
                check_orphaned();
                get_store().remove_element(GENERALMEDICALPRACTITIONERANTENATALCARE$0, 0);
            }
        }
        
        /**
         * Gets the "GeneralMedicalPractionerPractice_AntenatalCare" element
         */
        public java.lang.String getGeneralMedicalPractionerPracticeAntenatalCare()
        {
            synchronized (monitor())
            {
                check_orphaned();
                org.apache.xmlbeans.SimpleValue target = null;
                target = (org.apache.xmlbeans.SimpleValue)get_store().find_element_user(GENERALMEDICALPRACTIONERPRACTICEANTENATALCARE$2, 0);
                if (target == null)
                {
                    return null;
                }
                return target.getStringValue();
            }
        }
        
        /**
         * Gets (as xml) the "GeneralMedicalPractionerPractice_AntenatalCare" element
         */
        public uk.nhs.nhsia.datastandards.ecds.GeneralMedicalPractitionerPracticeAntenatalCareType xgetGeneralMedicalPractionerPracticeAntenatalCare()
        {
            synchronized (monitor())
            {
                check_orphaned();
                uk.nhs.nhsia.datastandards.ecds.GeneralMedicalPractitionerPracticeAntenatalCareType target = null;
                target = (uk.nhs.nhsia.datastandards.ecds.GeneralMedicalPractitionerPracticeAntenatalCareType)get_store().find_element_user(GENERALMEDICALPRACTIONERPRACTICEANTENATALCARE$2, 0);
                return target;
            }
        }
        
        /**
         * True if has "GeneralMedicalPractionerPractice_AntenatalCare" element
         */
        public boolean isSetGeneralMedicalPractionerPracticeAntenatalCare()
        {
            synchronized (monitor())
            {
                check_orphaned();
                return get_store().count_elements(GENERALMEDICALPRACTIONERPRACTICEANTENATALCARE$2) != 0;
            }
        }
        
        /**
         * Sets the "GeneralMedicalPractionerPractice_AntenatalCare" element
         */
        public void setGeneralMedicalPractionerPracticeAntenatalCare(java.lang.String generalMedicalPractionerPracticeAntenatalCare)
        {
            synchronized (monitor())
            {
                check_orphaned();
                org.apache.xmlbeans.SimpleValue target = null;
                target = (org.apache.xmlbeans.SimpleValue)get_store().find_element_user(GENERALMEDICALPRACTIONERPRACTICEANTENATALCARE$2, 0);
                if (target == null)
                {
                    target = (org.apache.xmlbeans.SimpleValue)get_store().add_element_user(GENERALMEDICALPRACTIONERPRACTICEANTENATALCARE$2);
                }
                target.setStringValue(generalMedicalPractionerPracticeAntenatalCare);
            }
        }
        
        /**
         * Sets (as xml) the "GeneralMedicalPractionerPractice_AntenatalCare" element
         */
        public void xsetGeneralMedicalPractionerPracticeAntenatalCare(uk.nhs.nhsia.datastandards.ecds.GeneralMedicalPractitionerPracticeAntenatalCareType generalMedicalPractionerPracticeAntenatalCare)
        {
            synchronized (monitor())
            {
                check_orphaned();
                uk.nhs.nhsia.datastandards.ecds.GeneralMedicalPractitionerPracticeAntenatalCareType target = null;
                target = (uk.nhs.nhsia.datastandards.ecds.GeneralMedicalPractitionerPracticeAntenatalCareType)get_store().find_element_user(GENERALMEDICALPRACTIONERPRACTICEANTENATALCARE$2, 0);
                if (target == null)
                {
                    target = (uk.nhs.nhsia.datastandards.ecds.GeneralMedicalPractitionerPracticeAntenatalCareType)get_store().add_element_user(GENERALMEDICALPRACTIONERPRACTICEANTENATALCARE$2);
                }
                target.set(generalMedicalPractionerPracticeAntenatalCare);
            }
        }
        
        /**
         * Unsets the "GeneralMedicalPractionerPractice_AntenatalCare" element
         */
        public void unsetGeneralMedicalPractionerPracticeAntenatalCare()
        {
            synchronized (monitor())
            {
                check_orphaned();
                get_store().remove_element(GENERALMEDICALPRACTIONERPRACTICEANTENATALCARE$2, 0);
            }
        }
    }
    /**
     * An XML LocationGroup(@http://www.nhsia.nhs.uk/DataStandards/XMLschema/CDS/ns).
     *
     * This is a complex type.
     */
    public static class LocationGroupImpl extends org.apache.xmlbeans.impl.values.XmlComplexContentImpl implements uk.nhs.nhsia.datastandards.ecds.AntenatalCareStructure.LocationGroup
    {
        private static final long serialVersionUID = 1L;
        
        public LocationGroupImpl(org.apache.xmlbeans.SchemaType sType)
        {
            super(sType);
        }
        
        private static final javax.xml.namespace.QName DELIVERYPLACEINTENDED$0 = 
            new javax.xml.namespace.QName("http://www.nhsia.nhs.uk/DataStandards/XMLschema/CDS/ns", "DeliveryPlaceIntended");
        
        
        /**
         * Gets the "DeliveryPlaceIntended" element
         */
        public uk.nhs.nhsia.datastandards.ecds.AntenatalCareStructure.LocationGroup.DeliveryPlaceIntended getDeliveryPlaceIntended()
        {
            synchronized (monitor())
            {
                check_orphaned();
                uk.nhs.nhsia.datastandards.ecds.AntenatalCareStructure.LocationGroup.DeliveryPlaceIntended target = null;
                target = (uk.nhs.nhsia.datastandards.ecds.AntenatalCareStructure.LocationGroup.DeliveryPlaceIntended)get_store().find_element_user(DELIVERYPLACEINTENDED$0, 0);
                if (target == null)
                {
                    return null;
                }
                return target;
            }
        }
        
        /**
         * True if has "DeliveryPlaceIntended" element
         */
        public boolean isSetDeliveryPlaceIntended()
        {
            synchronized (monitor())
            {
                check_orphaned();
                return get_store().count_elements(DELIVERYPLACEINTENDED$0) != 0;
            }
        }
        
        /**
         * Sets the "DeliveryPlaceIntended" element
         */
        public void setDeliveryPlaceIntended(uk.nhs.nhsia.datastandards.ecds.AntenatalCareStructure.LocationGroup.DeliveryPlaceIntended deliveryPlaceIntended)
        {
            generatedSetterHelperImpl(deliveryPlaceIntended, DELIVERYPLACEINTENDED$0, 0, org.apache.xmlbeans.impl.values.XmlObjectBase.KIND_SETTERHELPER_SINGLETON);
        }
        
        /**
         * Appends and returns a new empty "DeliveryPlaceIntended" element
         */
        public uk.nhs.nhsia.datastandards.ecds.AntenatalCareStructure.LocationGroup.DeliveryPlaceIntended addNewDeliveryPlaceIntended()
        {
            synchronized (monitor())
            {
                check_orphaned();
                uk.nhs.nhsia.datastandards.ecds.AntenatalCareStructure.LocationGroup.DeliveryPlaceIntended target = null;
                target = (uk.nhs.nhsia.datastandards.ecds.AntenatalCareStructure.LocationGroup.DeliveryPlaceIntended)get_store().add_element_user(DELIVERYPLACEINTENDED$0);
                return target;
            }
        }
        
        /**
         * Unsets the "DeliveryPlaceIntended" element
         */
        public void unsetDeliveryPlaceIntended()
        {
            synchronized (monitor())
            {
                check_orphaned();
                get_store().remove_element(DELIVERYPLACEINTENDED$0, 0);
            }
        }
        /**
         * An XML DeliveryPlaceIntended(@http://www.nhsia.nhs.uk/DataStandards/XMLschema/CDS/ns).
         *
         * This is a complex type.
         */
        public static class DeliveryPlaceIntendedImpl extends org.apache.xmlbeans.impl.values.XmlComplexContentImpl implements uk.nhs.nhsia.datastandards.ecds.AntenatalCareStructure.LocationGroup.DeliveryPlaceIntended
        {
            private static final long serialVersionUID = 1L;
            
            public DeliveryPlaceIntendedImpl(org.apache.xmlbeans.SchemaType sType)
            {
                super(sType);
            }
            
            private static final javax.xml.namespace.QName LOCATIONCLASS$0 = 
                new javax.xml.namespace.QName("http://www.nhsia.nhs.uk/DataStandards/XMLschema/CDS/ns", "LocationClass");
            private static final javax.xml.namespace.QName ACTIVITYLOCATIONTYPE$2 = 
                new javax.xml.namespace.QName("http://www.nhsia.nhs.uk/DataStandards/XMLschema/CDS/ns", "ActivityLocationType");
            private static final javax.xml.namespace.QName DELIVERYPLACECHANGEREASONCODE$4 = 
                new javax.xml.namespace.QName("http://www.nhsia.nhs.uk/DataStandards/XMLschema/CDS/ns", "DeliveryPlaceChangeReasonCode");
            private static final javax.xml.namespace.QName DELIVERYPLACETYPECODEINTENDED$6 = 
                new javax.xml.namespace.QName("http://www.nhsia.nhs.uk/DataStandards/XMLschema/CDS/ns", "DeliveryPlaceTypeCode_Intended");
            
            
            /**
             * Gets the "LocationClass" element
             */
            public uk.nhs.nhsia.datastandards.ecds.LocationClassType.Enum getLocationClass()
            {
                synchronized (monitor())
                {
                    check_orphaned();
                    org.apache.xmlbeans.SimpleValue target = null;
                    target = (org.apache.xmlbeans.SimpleValue)get_store().find_element_user(LOCATIONCLASS$0, 0);
                    if (target == null)
                    {
                      return null;
                    }
                    return (uk.nhs.nhsia.datastandards.ecds.LocationClassType.Enum)target.getEnumValue();
                }
            }
            
            /**
             * Gets (as xml) the "LocationClass" element
             */
            public uk.nhs.nhsia.datastandards.ecds.LocationClassType xgetLocationClass()
            {
                synchronized (monitor())
                {
                    check_orphaned();
                    uk.nhs.nhsia.datastandards.ecds.LocationClassType target = null;
                    target = (uk.nhs.nhsia.datastandards.ecds.LocationClassType)get_store().find_element_user(LOCATIONCLASS$0, 0);
                    return target;
                }
            }
            
            /**
             * True if has "LocationClass" element
             */
            public boolean isSetLocationClass()
            {
                synchronized (monitor())
                {
                    check_orphaned();
                    return get_store().count_elements(LOCATIONCLASS$0) != 0;
                }
            }
            
            /**
             * Sets the "LocationClass" element
             */
            public void setLocationClass(uk.nhs.nhsia.datastandards.ecds.LocationClassType.Enum locationClass)
            {
                synchronized (monitor())
                {
                    check_orphaned();
                    org.apache.xmlbeans.SimpleValue target = null;
                    target = (org.apache.xmlbeans.SimpleValue)get_store().find_element_user(LOCATIONCLASS$0, 0);
                    if (target == null)
                    {
                      target = (org.apache.xmlbeans.SimpleValue)get_store().add_element_user(LOCATIONCLASS$0);
                    }
                    target.setEnumValue(locationClass);
                }
            }
            
            /**
             * Sets (as xml) the "LocationClass" element
             */
            public void xsetLocationClass(uk.nhs.nhsia.datastandards.ecds.LocationClassType locationClass)
            {
                synchronized (monitor())
                {
                    check_orphaned();
                    uk.nhs.nhsia.datastandards.ecds.LocationClassType target = null;
                    target = (uk.nhs.nhsia.datastandards.ecds.LocationClassType)get_store().find_element_user(LOCATIONCLASS$0, 0);
                    if (target == null)
                    {
                      target = (uk.nhs.nhsia.datastandards.ecds.LocationClassType)get_store().add_element_user(LOCATIONCLASS$0);
                    }
                    target.set(locationClass);
                }
            }
            
            /**
             * Unsets the "LocationClass" element
             */
            public void unsetLocationClass()
            {
                synchronized (monitor())
                {
                    check_orphaned();
                    get_store().remove_element(LOCATIONCLASS$0, 0);
                }
            }
            
            /**
             * Gets the "ActivityLocationType" element
             */
            public uk.nhs.nhsia.datastandards.ecds.ActivityLocationTypeType.Enum getActivityLocationType()
            {
                synchronized (monitor())
                {
                    check_orphaned();
                    org.apache.xmlbeans.SimpleValue target = null;
                    target = (org.apache.xmlbeans.SimpleValue)get_store().find_element_user(ACTIVITYLOCATIONTYPE$2, 0);
                    if (target == null)
                    {
                      return null;
                    }
                    return (uk.nhs.nhsia.datastandards.ecds.ActivityLocationTypeType.Enum)target.getEnumValue();
                }
            }
            
            /**
             * Gets (as xml) the "ActivityLocationType" element
             */
            public uk.nhs.nhsia.datastandards.ecds.ActivityLocationTypeType xgetActivityLocationType()
            {
                synchronized (monitor())
                {
                    check_orphaned();
                    uk.nhs.nhsia.datastandards.ecds.ActivityLocationTypeType target = null;
                    target = (uk.nhs.nhsia.datastandards.ecds.ActivityLocationTypeType)get_store().find_element_user(ACTIVITYLOCATIONTYPE$2, 0);
                    return target;
                }
            }
            
            /**
             * True if has "ActivityLocationType" element
             */
            public boolean isSetActivityLocationType()
            {
                synchronized (monitor())
                {
                    check_orphaned();
                    return get_store().count_elements(ACTIVITYLOCATIONTYPE$2) != 0;
                }
            }
            
            /**
             * Sets the "ActivityLocationType" element
             */
            public void setActivityLocationType(uk.nhs.nhsia.datastandards.ecds.ActivityLocationTypeType.Enum activityLocationType)
            {
                synchronized (monitor())
                {
                    check_orphaned();
                    org.apache.xmlbeans.SimpleValue target = null;
                    target = (org.apache.xmlbeans.SimpleValue)get_store().find_element_user(ACTIVITYLOCATIONTYPE$2, 0);
                    if (target == null)
                    {
                      target = (org.apache.xmlbeans.SimpleValue)get_store().add_element_user(ACTIVITYLOCATIONTYPE$2);
                    }
                    target.setEnumValue(activityLocationType);
                }
            }
            
            /**
             * Sets (as xml) the "ActivityLocationType" element
             */
            public void xsetActivityLocationType(uk.nhs.nhsia.datastandards.ecds.ActivityLocationTypeType activityLocationType)
            {
                synchronized (monitor())
                {
                    check_orphaned();
                    uk.nhs.nhsia.datastandards.ecds.ActivityLocationTypeType target = null;
                    target = (uk.nhs.nhsia.datastandards.ecds.ActivityLocationTypeType)get_store().find_element_user(ACTIVITYLOCATIONTYPE$2, 0);
                    if (target == null)
                    {
                      target = (uk.nhs.nhsia.datastandards.ecds.ActivityLocationTypeType)get_store().add_element_user(ACTIVITYLOCATIONTYPE$2);
                    }
                    target.set(activityLocationType);
                }
            }
            
            /**
             * Unsets the "ActivityLocationType" element
             */
            public void unsetActivityLocationType()
            {
                synchronized (monitor())
                {
                    check_orphaned();
                    get_store().remove_element(ACTIVITYLOCATIONTYPE$2, 0);
                }
            }
            
            /**
             * Gets the "DeliveryPlaceChangeReasonCode" element
             */
            public uk.nhs.nhsia.datastandards.ecds.DeliveryPlaceChangeReasonCodeType.Enum getDeliveryPlaceChangeReasonCode()
            {
                synchronized (monitor())
                {
                    check_orphaned();
                    org.apache.xmlbeans.SimpleValue target = null;
                    target = (org.apache.xmlbeans.SimpleValue)get_store().find_element_user(DELIVERYPLACECHANGEREASONCODE$4, 0);
                    if (target == null)
                    {
                      return null;
                    }
                    return (uk.nhs.nhsia.datastandards.ecds.DeliveryPlaceChangeReasonCodeType.Enum)target.getEnumValue();
                }
            }
            
            /**
             * Gets (as xml) the "DeliveryPlaceChangeReasonCode" element
             */
            public uk.nhs.nhsia.datastandards.ecds.DeliveryPlaceChangeReasonCodeType xgetDeliveryPlaceChangeReasonCode()
            {
                synchronized (monitor())
                {
                    check_orphaned();
                    uk.nhs.nhsia.datastandards.ecds.DeliveryPlaceChangeReasonCodeType target = null;
                    target = (uk.nhs.nhsia.datastandards.ecds.DeliveryPlaceChangeReasonCodeType)get_store().find_element_user(DELIVERYPLACECHANGEREASONCODE$4, 0);
                    return target;
                }
            }
            
            /**
             * True if has "DeliveryPlaceChangeReasonCode" element
             */
            public boolean isSetDeliveryPlaceChangeReasonCode()
            {
                synchronized (monitor())
                {
                    check_orphaned();
                    return get_store().count_elements(DELIVERYPLACECHANGEREASONCODE$4) != 0;
                }
            }
            
            /**
             * Sets the "DeliveryPlaceChangeReasonCode" element
             */
            public void setDeliveryPlaceChangeReasonCode(uk.nhs.nhsia.datastandards.ecds.DeliveryPlaceChangeReasonCodeType.Enum deliveryPlaceChangeReasonCode)
            {
                synchronized (monitor())
                {
                    check_orphaned();
                    org.apache.xmlbeans.SimpleValue target = null;
                    target = (org.apache.xmlbeans.SimpleValue)get_store().find_element_user(DELIVERYPLACECHANGEREASONCODE$4, 0);
                    if (target == null)
                    {
                      target = (org.apache.xmlbeans.SimpleValue)get_store().add_element_user(DELIVERYPLACECHANGEREASONCODE$4);
                    }
                    target.setEnumValue(deliveryPlaceChangeReasonCode);
                }
            }
            
            /**
             * Sets (as xml) the "DeliveryPlaceChangeReasonCode" element
             */
            public void xsetDeliveryPlaceChangeReasonCode(uk.nhs.nhsia.datastandards.ecds.DeliveryPlaceChangeReasonCodeType deliveryPlaceChangeReasonCode)
            {
                synchronized (monitor())
                {
                    check_orphaned();
                    uk.nhs.nhsia.datastandards.ecds.DeliveryPlaceChangeReasonCodeType target = null;
                    target = (uk.nhs.nhsia.datastandards.ecds.DeliveryPlaceChangeReasonCodeType)get_store().find_element_user(DELIVERYPLACECHANGEREASONCODE$4, 0);
                    if (target == null)
                    {
                      target = (uk.nhs.nhsia.datastandards.ecds.DeliveryPlaceChangeReasonCodeType)get_store().add_element_user(DELIVERYPLACECHANGEREASONCODE$4);
                    }
                    target.set(deliveryPlaceChangeReasonCode);
                }
            }
            
            /**
             * Unsets the "DeliveryPlaceChangeReasonCode" element
             */
            public void unsetDeliveryPlaceChangeReasonCode()
            {
                synchronized (monitor())
                {
                    check_orphaned();
                    get_store().remove_element(DELIVERYPLACECHANGEREASONCODE$4, 0);
                }
            }
            
            /**
             * Gets the "DeliveryPlaceTypeCode_Intended" element
             */
            public java.lang.String getDeliveryPlaceTypeCodeIntended()
            {
                synchronized (monitor())
                {
                    check_orphaned();
                    org.apache.xmlbeans.SimpleValue target = null;
                    target = (org.apache.xmlbeans.SimpleValue)get_store().find_element_user(DELIVERYPLACETYPECODEINTENDED$6, 0);
                    if (target == null)
                    {
                      return null;
                    }
                    return target.getStringValue();
                }
            }
            
            /**
             * Gets (as xml) the "DeliveryPlaceTypeCode_Intended" element
             */
            public uk.nhs.nhsia.datastandards.ecds.DeliveryPlaceTypeCodeIntendedType xgetDeliveryPlaceTypeCodeIntended()
            {
                synchronized (monitor())
                {
                    check_orphaned();
                    uk.nhs.nhsia.datastandards.ecds.DeliveryPlaceTypeCodeIntendedType target = null;
                    target = (uk.nhs.nhsia.datastandards.ecds.DeliveryPlaceTypeCodeIntendedType)get_store().find_element_user(DELIVERYPLACETYPECODEINTENDED$6, 0);
                    return target;
                }
            }
            
            /**
             * True if has "DeliveryPlaceTypeCode_Intended" element
             */
            public boolean isSetDeliveryPlaceTypeCodeIntended()
            {
                synchronized (monitor())
                {
                    check_orphaned();
                    return get_store().count_elements(DELIVERYPLACETYPECODEINTENDED$6) != 0;
                }
            }
            
            /**
             * Sets the "DeliveryPlaceTypeCode_Intended" element
             */
            public void setDeliveryPlaceTypeCodeIntended(java.lang.String deliveryPlaceTypeCodeIntended)
            {
                synchronized (monitor())
                {
                    check_orphaned();
                    org.apache.xmlbeans.SimpleValue target = null;
                    target = (org.apache.xmlbeans.SimpleValue)get_store().find_element_user(DELIVERYPLACETYPECODEINTENDED$6, 0);
                    if (target == null)
                    {
                      target = (org.apache.xmlbeans.SimpleValue)get_store().add_element_user(DELIVERYPLACETYPECODEINTENDED$6);
                    }
                    target.setStringValue(deliveryPlaceTypeCodeIntended);
                }
            }
            
            /**
             * Sets (as xml) the "DeliveryPlaceTypeCode_Intended" element
             */
            public void xsetDeliveryPlaceTypeCodeIntended(uk.nhs.nhsia.datastandards.ecds.DeliveryPlaceTypeCodeIntendedType deliveryPlaceTypeCodeIntended)
            {
                synchronized (monitor())
                {
                    check_orphaned();
                    uk.nhs.nhsia.datastandards.ecds.DeliveryPlaceTypeCodeIntendedType target = null;
                    target = (uk.nhs.nhsia.datastandards.ecds.DeliveryPlaceTypeCodeIntendedType)get_store().find_element_user(DELIVERYPLACETYPECODEINTENDED$6, 0);
                    if (target == null)
                    {
                      target = (uk.nhs.nhsia.datastandards.ecds.DeliveryPlaceTypeCodeIntendedType)get_store().add_element_user(DELIVERYPLACETYPECODEINTENDED$6);
                    }
                    target.set(deliveryPlaceTypeCodeIntended);
                }
            }
            
            /**
             * Unsets the "DeliveryPlaceTypeCode_Intended" element
             */
            public void unsetDeliveryPlaceTypeCodeIntended()
            {
                synchronized (monitor())
                {
                    check_orphaned();
                    get_store().remove_element(DELIVERYPLACETYPECODEINTENDED$6, 0);
                }
            }
        }
    }
}
