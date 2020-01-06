/*
 * XML Type:  PatientCharacteristics_Psychiatric_Structure
 * Namespace: http://www.nhsia.nhs.uk/DataStandards/XMLschema/CDS/ns
 * Java type: uk.nhs.nhsia.datastandards.ecds.PatientCharacteristicsPsychiatricStructure
 *
 * Automatically generated - do not modify.
 */
package uk.nhs.nhsia.datastandards.ecds.impl;
/**
 * An XML PatientCharacteristics_Psychiatric_Structure(@http://www.nhsia.nhs.uk/DataStandards/XMLschema/CDS/ns).
 *
 * This is a complex type.
 */
public class PatientCharacteristicsPsychiatricStructureImpl extends org.apache.xmlbeans.impl.values.XmlComplexContentImpl implements uk.nhs.nhsia.datastandards.ecds.PatientCharacteristicsPsychiatricStructure
{
    private static final long serialVersionUID = 1L;
    
    public PatientCharacteristicsPsychiatricStructureImpl(org.apache.xmlbeans.SchemaType sType)
    {
        super(sType);
    }
    
    private static final javax.xml.namespace.QName MENTALHEALTHACTLEGALSTATUSCLASSIFICATIONCODEATCENSUSDATE$0 = 
        new javax.xml.namespace.QName("http://www.nhsia.nhs.uk/DataStandards/XMLschema/CDS/ns", "MentalHealthActLegalStatusClassificationCode_AtCensusDate");
    private static final javax.xml.namespace.QName DATEDETENTIONCOMMENCED$2 = 
        new javax.xml.namespace.QName("http://www.nhsia.nhs.uk/DataStandards/XMLschema/CDS/ns", "DateDetentionCommenced");
    private static final javax.xml.namespace.QName AGEATCENSUS$4 = 
        new javax.xml.namespace.QName("http://www.nhsia.nhs.uk/DataStandards/XMLschema/CDS/ns", "AgeAtCensus");
    private static final javax.xml.namespace.QName DURATIONOFCARETOPSYCHIATRICCENSUSDATE$6 = 
        new javax.xml.namespace.QName("http://www.nhsia.nhs.uk/DataStandards/XMLschema/CDS/ns", "DurationOfCareToPsychiatricCensusDate");
    private static final javax.xml.namespace.QName DURATIONOFDETENTION$8 = 
        new javax.xml.namespace.QName("http://www.nhsia.nhs.uk/DataStandards/XMLschema/CDS/ns", "DurationOfDetention");
    private static final javax.xml.namespace.QName MENTALHEALTHACT2007MENTALCATEGORY$10 = 
        new javax.xml.namespace.QName("http://www.nhsia.nhs.uk/DataStandards/XMLschema/CDS/ns", "MentalHealthAct2007_MentalCategory");
    private static final javax.xml.namespace.QName STATUSOFPATIENTINCLUDEDINTHEPSYCHIATRICCENSUSCODE$12 = 
        new javax.xml.namespace.QName("http://www.nhsia.nhs.uk/DataStandards/XMLschema/CDS/ns", "StatusOfPatientIncludedInThePsychiatricCensusCode");
    
    
    /**
     * Gets the "MentalHealthActLegalStatusClassificationCode_AtCensusDate" element
     */
    public uk.nhs.nhsia.datastandards.ecds.MentalHealthActLegalStatusClassificationCodeType.Enum getMentalHealthActLegalStatusClassificationCodeAtCensusDate()
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.SimpleValue target = null;
            target = (org.apache.xmlbeans.SimpleValue)get_store().find_element_user(MENTALHEALTHACTLEGALSTATUSCLASSIFICATIONCODEATCENSUSDATE$0, 0);
            if (target == null)
            {
                return null;
            }
            return (uk.nhs.nhsia.datastandards.ecds.MentalHealthActLegalStatusClassificationCodeType.Enum)target.getEnumValue();
        }
    }
    
    /**
     * Gets (as xml) the "MentalHealthActLegalStatusClassificationCode_AtCensusDate" element
     */
    public uk.nhs.nhsia.datastandards.ecds.MentalHealthActLegalStatusClassificationCodeAtCensusDateType xgetMentalHealthActLegalStatusClassificationCodeAtCensusDate()
    {
        synchronized (monitor())
        {
            check_orphaned();
            uk.nhs.nhsia.datastandards.ecds.MentalHealthActLegalStatusClassificationCodeAtCensusDateType target = null;
            target = (uk.nhs.nhsia.datastandards.ecds.MentalHealthActLegalStatusClassificationCodeAtCensusDateType)get_store().find_element_user(MENTALHEALTHACTLEGALSTATUSCLASSIFICATIONCODEATCENSUSDATE$0, 0);
            return target;
        }
    }
    
    /**
     * True if has "MentalHealthActLegalStatusClassificationCode_AtCensusDate" element
     */
    public boolean isSetMentalHealthActLegalStatusClassificationCodeAtCensusDate()
    {
        synchronized (monitor())
        {
            check_orphaned();
            return get_store().count_elements(MENTALHEALTHACTLEGALSTATUSCLASSIFICATIONCODEATCENSUSDATE$0) != 0;
        }
    }
    
    /**
     * Sets the "MentalHealthActLegalStatusClassificationCode_AtCensusDate" element
     */
    public void setMentalHealthActLegalStatusClassificationCodeAtCensusDate(uk.nhs.nhsia.datastandards.ecds.MentalHealthActLegalStatusClassificationCodeType.Enum mentalHealthActLegalStatusClassificationCodeAtCensusDate)
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.SimpleValue target = null;
            target = (org.apache.xmlbeans.SimpleValue)get_store().find_element_user(MENTALHEALTHACTLEGALSTATUSCLASSIFICATIONCODEATCENSUSDATE$0, 0);
            if (target == null)
            {
                target = (org.apache.xmlbeans.SimpleValue)get_store().add_element_user(MENTALHEALTHACTLEGALSTATUSCLASSIFICATIONCODEATCENSUSDATE$0);
            }
            target.setEnumValue(mentalHealthActLegalStatusClassificationCodeAtCensusDate);
        }
    }
    
    /**
     * Sets (as xml) the "MentalHealthActLegalStatusClassificationCode_AtCensusDate" element
     */
    public void xsetMentalHealthActLegalStatusClassificationCodeAtCensusDate(uk.nhs.nhsia.datastandards.ecds.MentalHealthActLegalStatusClassificationCodeAtCensusDateType mentalHealthActLegalStatusClassificationCodeAtCensusDate)
    {
        synchronized (monitor())
        {
            check_orphaned();
            uk.nhs.nhsia.datastandards.ecds.MentalHealthActLegalStatusClassificationCodeAtCensusDateType target = null;
            target = (uk.nhs.nhsia.datastandards.ecds.MentalHealthActLegalStatusClassificationCodeAtCensusDateType)get_store().find_element_user(MENTALHEALTHACTLEGALSTATUSCLASSIFICATIONCODEATCENSUSDATE$0, 0);
            if (target == null)
            {
                target = (uk.nhs.nhsia.datastandards.ecds.MentalHealthActLegalStatusClassificationCodeAtCensusDateType)get_store().add_element_user(MENTALHEALTHACTLEGALSTATUSCLASSIFICATIONCODEATCENSUSDATE$0);
            }
            target.set(mentalHealthActLegalStatusClassificationCodeAtCensusDate);
        }
    }
    
    /**
     * Unsets the "MentalHealthActLegalStatusClassificationCode_AtCensusDate" element
     */
    public void unsetMentalHealthActLegalStatusClassificationCodeAtCensusDate()
    {
        synchronized (monitor())
        {
            check_orphaned();
            get_store().remove_element(MENTALHEALTHACTLEGALSTATUSCLASSIFICATIONCODEATCENSUSDATE$0, 0);
        }
    }
    
    /**
     * Gets the "DateDetentionCommenced" element
     */
    public java.util.Calendar getDateDetentionCommenced()
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.SimpleValue target = null;
            target = (org.apache.xmlbeans.SimpleValue)get_store().find_element_user(DATEDETENTIONCOMMENCED$2, 0);
            if (target == null)
            {
                return null;
            }
            return target.getCalendarValue();
        }
    }
    
    /**
     * Gets (as xml) the "DateDetentionCommenced" element
     */
    public uk.nhs.nhsia.datastandards.ecds.DateDetentionCommencedType xgetDateDetentionCommenced()
    {
        synchronized (monitor())
        {
            check_orphaned();
            uk.nhs.nhsia.datastandards.ecds.DateDetentionCommencedType target = null;
            target = (uk.nhs.nhsia.datastandards.ecds.DateDetentionCommencedType)get_store().find_element_user(DATEDETENTIONCOMMENCED$2, 0);
            return target;
        }
    }
    
    /**
     * True if has "DateDetentionCommenced" element
     */
    public boolean isSetDateDetentionCommenced()
    {
        synchronized (monitor())
        {
            check_orphaned();
            return get_store().count_elements(DATEDETENTIONCOMMENCED$2) != 0;
        }
    }
    
    /**
     * Sets the "DateDetentionCommenced" element
     */
    public void setDateDetentionCommenced(java.util.Calendar dateDetentionCommenced)
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.SimpleValue target = null;
            target = (org.apache.xmlbeans.SimpleValue)get_store().find_element_user(DATEDETENTIONCOMMENCED$2, 0);
            if (target == null)
            {
                target = (org.apache.xmlbeans.SimpleValue)get_store().add_element_user(DATEDETENTIONCOMMENCED$2);
            }
            target.setCalendarValue(dateDetentionCommenced);
        }
    }
    
    /**
     * Sets (as xml) the "DateDetentionCommenced" element
     */
    public void xsetDateDetentionCommenced(uk.nhs.nhsia.datastandards.ecds.DateDetentionCommencedType dateDetentionCommenced)
    {
        synchronized (monitor())
        {
            check_orphaned();
            uk.nhs.nhsia.datastandards.ecds.DateDetentionCommencedType target = null;
            target = (uk.nhs.nhsia.datastandards.ecds.DateDetentionCommencedType)get_store().find_element_user(DATEDETENTIONCOMMENCED$2, 0);
            if (target == null)
            {
                target = (uk.nhs.nhsia.datastandards.ecds.DateDetentionCommencedType)get_store().add_element_user(DATEDETENTIONCOMMENCED$2);
            }
            target.set(dateDetentionCommenced);
        }
    }
    
    /**
     * Unsets the "DateDetentionCommenced" element
     */
    public void unsetDateDetentionCommenced()
    {
        synchronized (monitor())
        {
            check_orphaned();
            get_store().remove_element(DATEDETENTIONCOMMENCED$2, 0);
        }
    }
    
    /**
     * Gets the "AgeAtCensus" element
     */
    public int getAgeAtCensus()
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.SimpleValue target = null;
            target = (org.apache.xmlbeans.SimpleValue)get_store().find_element_user(AGEATCENSUS$4, 0);
            if (target == null)
            {
                return 0;
            }
            return target.getIntValue();
        }
    }
    
    /**
     * Gets (as xml) the "AgeAtCensus" element
     */
    public uk.nhs.nhsia.datastandards.ecds.AgeAtCensusType xgetAgeAtCensus()
    {
        synchronized (monitor())
        {
            check_orphaned();
            uk.nhs.nhsia.datastandards.ecds.AgeAtCensusType target = null;
            target = (uk.nhs.nhsia.datastandards.ecds.AgeAtCensusType)get_store().find_element_user(AGEATCENSUS$4, 0);
            return target;
        }
    }
    
    /**
     * Sets the "AgeAtCensus" element
     */
    public void setAgeAtCensus(int ageAtCensus)
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.SimpleValue target = null;
            target = (org.apache.xmlbeans.SimpleValue)get_store().find_element_user(AGEATCENSUS$4, 0);
            if (target == null)
            {
                target = (org.apache.xmlbeans.SimpleValue)get_store().add_element_user(AGEATCENSUS$4);
            }
            target.setIntValue(ageAtCensus);
        }
    }
    
    /**
     * Sets (as xml) the "AgeAtCensus" element
     */
    public void xsetAgeAtCensus(uk.nhs.nhsia.datastandards.ecds.AgeAtCensusType ageAtCensus)
    {
        synchronized (monitor())
        {
            check_orphaned();
            uk.nhs.nhsia.datastandards.ecds.AgeAtCensusType target = null;
            target = (uk.nhs.nhsia.datastandards.ecds.AgeAtCensusType)get_store().find_element_user(AGEATCENSUS$4, 0);
            if (target == null)
            {
                target = (uk.nhs.nhsia.datastandards.ecds.AgeAtCensusType)get_store().add_element_user(AGEATCENSUS$4);
            }
            target.set(ageAtCensus);
        }
    }
    
    /**
     * Gets the "DurationOfCareToPsychiatricCensusDate" element
     */
    public int getDurationOfCareToPsychiatricCensusDate()
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.SimpleValue target = null;
            target = (org.apache.xmlbeans.SimpleValue)get_store().find_element_user(DURATIONOFCARETOPSYCHIATRICCENSUSDATE$6, 0);
            if (target == null)
            {
                return 0;
            }
            return target.getIntValue();
        }
    }
    
    /**
     * Gets (as xml) the "DurationOfCareToPsychiatricCensusDate" element
     */
    public uk.nhs.nhsia.datastandards.ecds.DurationOfCareToPsychiatricCensusDateType xgetDurationOfCareToPsychiatricCensusDate()
    {
        synchronized (monitor())
        {
            check_orphaned();
            uk.nhs.nhsia.datastandards.ecds.DurationOfCareToPsychiatricCensusDateType target = null;
            target = (uk.nhs.nhsia.datastandards.ecds.DurationOfCareToPsychiatricCensusDateType)get_store().find_element_user(DURATIONOFCARETOPSYCHIATRICCENSUSDATE$6, 0);
            return target;
        }
    }
    
    /**
     * True if has "DurationOfCareToPsychiatricCensusDate" element
     */
    public boolean isSetDurationOfCareToPsychiatricCensusDate()
    {
        synchronized (monitor())
        {
            check_orphaned();
            return get_store().count_elements(DURATIONOFCARETOPSYCHIATRICCENSUSDATE$6) != 0;
        }
    }
    
    /**
     * Sets the "DurationOfCareToPsychiatricCensusDate" element
     */
    public void setDurationOfCareToPsychiatricCensusDate(int durationOfCareToPsychiatricCensusDate)
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.SimpleValue target = null;
            target = (org.apache.xmlbeans.SimpleValue)get_store().find_element_user(DURATIONOFCARETOPSYCHIATRICCENSUSDATE$6, 0);
            if (target == null)
            {
                target = (org.apache.xmlbeans.SimpleValue)get_store().add_element_user(DURATIONOFCARETOPSYCHIATRICCENSUSDATE$6);
            }
            target.setIntValue(durationOfCareToPsychiatricCensusDate);
        }
    }
    
    /**
     * Sets (as xml) the "DurationOfCareToPsychiatricCensusDate" element
     */
    public void xsetDurationOfCareToPsychiatricCensusDate(uk.nhs.nhsia.datastandards.ecds.DurationOfCareToPsychiatricCensusDateType durationOfCareToPsychiatricCensusDate)
    {
        synchronized (monitor())
        {
            check_orphaned();
            uk.nhs.nhsia.datastandards.ecds.DurationOfCareToPsychiatricCensusDateType target = null;
            target = (uk.nhs.nhsia.datastandards.ecds.DurationOfCareToPsychiatricCensusDateType)get_store().find_element_user(DURATIONOFCARETOPSYCHIATRICCENSUSDATE$6, 0);
            if (target == null)
            {
                target = (uk.nhs.nhsia.datastandards.ecds.DurationOfCareToPsychiatricCensusDateType)get_store().add_element_user(DURATIONOFCARETOPSYCHIATRICCENSUSDATE$6);
            }
            target.set(durationOfCareToPsychiatricCensusDate);
        }
    }
    
    /**
     * Unsets the "DurationOfCareToPsychiatricCensusDate" element
     */
    public void unsetDurationOfCareToPsychiatricCensusDate()
    {
        synchronized (monitor())
        {
            check_orphaned();
            get_store().remove_element(DURATIONOFCARETOPSYCHIATRICCENSUSDATE$6, 0);
        }
    }
    
    /**
     * Gets the "DurationOfDetention" element
     */
    public int getDurationOfDetention()
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.SimpleValue target = null;
            target = (org.apache.xmlbeans.SimpleValue)get_store().find_element_user(DURATIONOFDETENTION$8, 0);
            if (target == null)
            {
                return 0;
            }
            return target.getIntValue();
        }
    }
    
    /**
     * Gets (as xml) the "DurationOfDetention" element
     */
    public uk.nhs.nhsia.datastandards.ecds.DurationOfDetentionType xgetDurationOfDetention()
    {
        synchronized (monitor())
        {
            check_orphaned();
            uk.nhs.nhsia.datastandards.ecds.DurationOfDetentionType target = null;
            target = (uk.nhs.nhsia.datastandards.ecds.DurationOfDetentionType)get_store().find_element_user(DURATIONOFDETENTION$8, 0);
            return target;
        }
    }
    
    /**
     * True if has "DurationOfDetention" element
     */
    public boolean isSetDurationOfDetention()
    {
        synchronized (monitor())
        {
            check_orphaned();
            return get_store().count_elements(DURATIONOFDETENTION$8) != 0;
        }
    }
    
    /**
     * Sets the "DurationOfDetention" element
     */
    public void setDurationOfDetention(int durationOfDetention)
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.SimpleValue target = null;
            target = (org.apache.xmlbeans.SimpleValue)get_store().find_element_user(DURATIONOFDETENTION$8, 0);
            if (target == null)
            {
                target = (org.apache.xmlbeans.SimpleValue)get_store().add_element_user(DURATIONOFDETENTION$8);
            }
            target.setIntValue(durationOfDetention);
        }
    }
    
    /**
     * Sets (as xml) the "DurationOfDetention" element
     */
    public void xsetDurationOfDetention(uk.nhs.nhsia.datastandards.ecds.DurationOfDetentionType durationOfDetention)
    {
        synchronized (monitor())
        {
            check_orphaned();
            uk.nhs.nhsia.datastandards.ecds.DurationOfDetentionType target = null;
            target = (uk.nhs.nhsia.datastandards.ecds.DurationOfDetentionType)get_store().find_element_user(DURATIONOFDETENTION$8, 0);
            if (target == null)
            {
                target = (uk.nhs.nhsia.datastandards.ecds.DurationOfDetentionType)get_store().add_element_user(DURATIONOFDETENTION$8);
            }
            target.set(durationOfDetention);
        }
    }
    
    /**
     * Unsets the "DurationOfDetention" element
     */
    public void unsetDurationOfDetention()
    {
        synchronized (monitor())
        {
            check_orphaned();
            get_store().remove_element(DURATIONOFDETENTION$8, 0);
        }
    }
    
    /**
     * Gets the "MentalHealthAct2007_MentalCategory" element
     */
    public uk.nhs.nhsia.datastandards.ecds.MentalHealthAct2007MentalCategoryType.Enum getMentalHealthAct2007MentalCategory()
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.SimpleValue target = null;
            target = (org.apache.xmlbeans.SimpleValue)get_store().find_element_user(MENTALHEALTHACT2007MENTALCATEGORY$10, 0);
            if (target == null)
            {
                return null;
            }
            return (uk.nhs.nhsia.datastandards.ecds.MentalHealthAct2007MentalCategoryType.Enum)target.getEnumValue();
        }
    }
    
    /**
     * Gets (as xml) the "MentalHealthAct2007_MentalCategory" element
     */
    public uk.nhs.nhsia.datastandards.ecds.MentalHealthAct2007MentalCategoryType xgetMentalHealthAct2007MentalCategory()
    {
        synchronized (monitor())
        {
            check_orphaned();
            uk.nhs.nhsia.datastandards.ecds.MentalHealthAct2007MentalCategoryType target = null;
            target = (uk.nhs.nhsia.datastandards.ecds.MentalHealthAct2007MentalCategoryType)get_store().find_element_user(MENTALHEALTHACT2007MENTALCATEGORY$10, 0);
            return target;
        }
    }
    
    /**
     * True if has "MentalHealthAct2007_MentalCategory" element
     */
    public boolean isSetMentalHealthAct2007MentalCategory()
    {
        synchronized (monitor())
        {
            check_orphaned();
            return get_store().count_elements(MENTALHEALTHACT2007MENTALCATEGORY$10) != 0;
        }
    }
    
    /**
     * Sets the "MentalHealthAct2007_MentalCategory" element
     */
    public void setMentalHealthAct2007MentalCategory(uk.nhs.nhsia.datastandards.ecds.MentalHealthAct2007MentalCategoryType.Enum mentalHealthAct2007MentalCategory)
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.SimpleValue target = null;
            target = (org.apache.xmlbeans.SimpleValue)get_store().find_element_user(MENTALHEALTHACT2007MENTALCATEGORY$10, 0);
            if (target == null)
            {
                target = (org.apache.xmlbeans.SimpleValue)get_store().add_element_user(MENTALHEALTHACT2007MENTALCATEGORY$10);
            }
            target.setEnumValue(mentalHealthAct2007MentalCategory);
        }
    }
    
    /**
     * Sets (as xml) the "MentalHealthAct2007_MentalCategory" element
     */
    public void xsetMentalHealthAct2007MentalCategory(uk.nhs.nhsia.datastandards.ecds.MentalHealthAct2007MentalCategoryType mentalHealthAct2007MentalCategory)
    {
        synchronized (monitor())
        {
            check_orphaned();
            uk.nhs.nhsia.datastandards.ecds.MentalHealthAct2007MentalCategoryType target = null;
            target = (uk.nhs.nhsia.datastandards.ecds.MentalHealthAct2007MentalCategoryType)get_store().find_element_user(MENTALHEALTHACT2007MENTALCATEGORY$10, 0);
            if (target == null)
            {
                target = (uk.nhs.nhsia.datastandards.ecds.MentalHealthAct2007MentalCategoryType)get_store().add_element_user(MENTALHEALTHACT2007MENTALCATEGORY$10);
            }
            target.set(mentalHealthAct2007MentalCategory);
        }
    }
    
    /**
     * Unsets the "MentalHealthAct2007_MentalCategory" element
     */
    public void unsetMentalHealthAct2007MentalCategory()
    {
        synchronized (monitor())
        {
            check_orphaned();
            get_store().remove_element(MENTALHEALTHACT2007MENTALCATEGORY$10, 0);
        }
    }
    
    /**
     * Gets the "StatusOfPatientIncludedInThePsychiatricCensusCode" element
     */
    public uk.nhs.nhsia.datastandards.ecds.StatusOfPatientIncludedInThePsychiatricCensusCodeType.Enum getStatusOfPatientIncludedInThePsychiatricCensusCode()
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.SimpleValue target = null;
            target = (org.apache.xmlbeans.SimpleValue)get_store().find_element_user(STATUSOFPATIENTINCLUDEDINTHEPSYCHIATRICCENSUSCODE$12, 0);
            if (target == null)
            {
                return null;
            }
            return (uk.nhs.nhsia.datastandards.ecds.StatusOfPatientIncludedInThePsychiatricCensusCodeType.Enum)target.getEnumValue();
        }
    }
    
    /**
     * Gets (as xml) the "StatusOfPatientIncludedInThePsychiatricCensusCode" element
     */
    public uk.nhs.nhsia.datastandards.ecds.StatusOfPatientIncludedInThePsychiatricCensusCodeType xgetStatusOfPatientIncludedInThePsychiatricCensusCode()
    {
        synchronized (monitor())
        {
            check_orphaned();
            uk.nhs.nhsia.datastandards.ecds.StatusOfPatientIncludedInThePsychiatricCensusCodeType target = null;
            target = (uk.nhs.nhsia.datastandards.ecds.StatusOfPatientIncludedInThePsychiatricCensusCodeType)get_store().find_element_user(STATUSOFPATIENTINCLUDEDINTHEPSYCHIATRICCENSUSCODE$12, 0);
            return target;
        }
    }
    
    /**
     * True if has "StatusOfPatientIncludedInThePsychiatricCensusCode" element
     */
    public boolean isSetStatusOfPatientIncludedInThePsychiatricCensusCode()
    {
        synchronized (monitor())
        {
            check_orphaned();
            return get_store().count_elements(STATUSOFPATIENTINCLUDEDINTHEPSYCHIATRICCENSUSCODE$12) != 0;
        }
    }
    
    /**
     * Sets the "StatusOfPatientIncludedInThePsychiatricCensusCode" element
     */
    public void setStatusOfPatientIncludedInThePsychiatricCensusCode(uk.nhs.nhsia.datastandards.ecds.StatusOfPatientIncludedInThePsychiatricCensusCodeType.Enum statusOfPatientIncludedInThePsychiatricCensusCode)
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.SimpleValue target = null;
            target = (org.apache.xmlbeans.SimpleValue)get_store().find_element_user(STATUSOFPATIENTINCLUDEDINTHEPSYCHIATRICCENSUSCODE$12, 0);
            if (target == null)
            {
                target = (org.apache.xmlbeans.SimpleValue)get_store().add_element_user(STATUSOFPATIENTINCLUDEDINTHEPSYCHIATRICCENSUSCODE$12);
            }
            target.setEnumValue(statusOfPatientIncludedInThePsychiatricCensusCode);
        }
    }
    
    /**
     * Sets (as xml) the "StatusOfPatientIncludedInThePsychiatricCensusCode" element
     */
    public void xsetStatusOfPatientIncludedInThePsychiatricCensusCode(uk.nhs.nhsia.datastandards.ecds.StatusOfPatientIncludedInThePsychiatricCensusCodeType statusOfPatientIncludedInThePsychiatricCensusCode)
    {
        synchronized (monitor())
        {
            check_orphaned();
            uk.nhs.nhsia.datastandards.ecds.StatusOfPatientIncludedInThePsychiatricCensusCodeType target = null;
            target = (uk.nhs.nhsia.datastandards.ecds.StatusOfPatientIncludedInThePsychiatricCensusCodeType)get_store().find_element_user(STATUSOFPATIENTINCLUDEDINTHEPSYCHIATRICCENSUSCODE$12, 0);
            if (target == null)
            {
                target = (uk.nhs.nhsia.datastandards.ecds.StatusOfPatientIncludedInThePsychiatricCensusCodeType)get_store().add_element_user(STATUSOFPATIENTINCLUDEDINTHEPSYCHIATRICCENSUSCODE$12);
            }
            target.set(statusOfPatientIncludedInThePsychiatricCensusCode);
        }
    }
    
    /**
     * Unsets the "StatusOfPatientIncludedInThePsychiatricCensusCode" element
     */
    public void unsetStatusOfPatientIncludedInThePsychiatricCensusCode()
    {
        synchronized (monitor())
        {
            check_orphaned();
            get_store().remove_element(STATUSOFPATIENTINCLUDEDINTHEPSYCHIATRICCENSUSCODE$12, 0);
        }
    }
}
