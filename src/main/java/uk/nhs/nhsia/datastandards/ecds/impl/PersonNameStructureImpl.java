/*
 * XML Type:  PersonName_Structure
 * Namespace: http://www.nhsia.nhs.uk/DataStandards/XMLschema/CDS/ns
 * Java type: uk.nhs.nhsia.datastandards.ecds.PersonNameStructure
 *
 * Automatically generated - do not modify.
 */
package uk.nhs.nhsia.datastandards.ecds.impl;
/**
 * An XML PersonName_Structure(@http://www.nhsia.nhs.uk/DataStandards/XMLschema/CDS/ns).
 *
 * This is a complex type.
 */
public class PersonNameStructureImpl extends org.apache.xmlbeans.impl.values.XmlComplexContentImpl implements uk.nhs.nhsia.datastandards.ecds.PersonNameStructure
{
    private static final long serialVersionUID = 1L;
    
    public PersonNameStructureImpl(org.apache.xmlbeans.SchemaType sType)
    {
        super(sType);
    }
    
    private static final javax.xml.namespace.QName PERSONFULLNAME$0 = 
        new javax.xml.namespace.QName("http://www.nhsia.nhs.uk/DataStandards/XMLschema/CDS/ns", "PersonFullName");
    private static final javax.xml.namespace.QName PERSONNAMESTRUCTURED$2 = 
        new javax.xml.namespace.QName("http://www.nhsia.nhs.uk/DataStandards/XMLschema/CDS/ns", "PersonName_Structured");
    private static final javax.xml.namespace.QName PERSONREQUESTEDNAME$4 = 
        new javax.xml.namespace.QName("http://www.nhsia.nhs.uk/DataStandards/XMLschema/CDS/ns", "PersonRequestedName");
    
    
    /**
     * Gets the "PersonFullName" element
     */
    public java.lang.String getPersonFullName()
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.SimpleValue target = null;
            target = (org.apache.xmlbeans.SimpleValue)get_store().find_element_user(PERSONFULLNAME$0, 0);
            if (target == null)
            {
                return null;
            }
            return target.getStringValue();
        }
    }
    
    /**
     * Gets (as xml) the "PersonFullName" element
     */
    public uk.nhs.nhsia.datastandards.ecds.PersonNameUnstructuredTextType xgetPersonFullName()
    {
        synchronized (monitor())
        {
            check_orphaned();
            uk.nhs.nhsia.datastandards.ecds.PersonNameUnstructuredTextType target = null;
            target = (uk.nhs.nhsia.datastandards.ecds.PersonNameUnstructuredTextType)get_store().find_element_user(PERSONFULLNAME$0, 0);
            return target;
        }
    }
    
    /**
     * True if has "PersonFullName" element
     */
    public boolean isSetPersonFullName()
    {
        synchronized (monitor())
        {
            check_orphaned();
            return get_store().count_elements(PERSONFULLNAME$0) != 0;
        }
    }
    
    /**
     * Sets the "PersonFullName" element
     */
    public void setPersonFullName(java.lang.String personFullName)
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.SimpleValue target = null;
            target = (org.apache.xmlbeans.SimpleValue)get_store().find_element_user(PERSONFULLNAME$0, 0);
            if (target == null)
            {
                target = (org.apache.xmlbeans.SimpleValue)get_store().add_element_user(PERSONFULLNAME$0);
            }
            target.setStringValue(personFullName);
        }
    }
    
    /**
     * Sets (as xml) the "PersonFullName" element
     */
    public void xsetPersonFullName(uk.nhs.nhsia.datastandards.ecds.PersonNameUnstructuredTextType personFullName)
    {
        synchronized (monitor())
        {
            check_orphaned();
            uk.nhs.nhsia.datastandards.ecds.PersonNameUnstructuredTextType target = null;
            target = (uk.nhs.nhsia.datastandards.ecds.PersonNameUnstructuredTextType)get_store().find_element_user(PERSONFULLNAME$0, 0);
            if (target == null)
            {
                target = (uk.nhs.nhsia.datastandards.ecds.PersonNameUnstructuredTextType)get_store().add_element_user(PERSONFULLNAME$0);
            }
            target.set(personFullName);
        }
    }
    
    /**
     * Unsets the "PersonFullName" element
     */
    public void unsetPersonFullName()
    {
        synchronized (monitor())
        {
            check_orphaned();
            get_store().remove_element(PERSONFULLNAME$0, 0);
        }
    }
    
    /**
     * Gets the "PersonName_Structured" element
     */
    public uk.nhs.nhsia.datastandards.ecds.PersonNameStructure.PersonNameStructured getPersonNameStructured()
    {
        synchronized (monitor())
        {
            check_orphaned();
            uk.nhs.nhsia.datastandards.ecds.PersonNameStructure.PersonNameStructured target = null;
            target = (uk.nhs.nhsia.datastandards.ecds.PersonNameStructure.PersonNameStructured)get_store().find_element_user(PERSONNAMESTRUCTURED$2, 0);
            if (target == null)
            {
                return null;
            }
            return target;
        }
    }
    
    /**
     * True if has "PersonName_Structured" element
     */
    public boolean isSetPersonNameStructured()
    {
        synchronized (monitor())
        {
            check_orphaned();
            return get_store().count_elements(PERSONNAMESTRUCTURED$2) != 0;
        }
    }
    
    /**
     * Sets the "PersonName_Structured" element
     */
    public void setPersonNameStructured(uk.nhs.nhsia.datastandards.ecds.PersonNameStructure.PersonNameStructured personNameStructured)
    {
        generatedSetterHelperImpl(personNameStructured, PERSONNAMESTRUCTURED$2, 0, org.apache.xmlbeans.impl.values.XmlObjectBase.KIND_SETTERHELPER_SINGLETON);
    }
    
    /**
     * Appends and returns a new empty "PersonName_Structured" element
     */
    public uk.nhs.nhsia.datastandards.ecds.PersonNameStructure.PersonNameStructured addNewPersonNameStructured()
    {
        synchronized (monitor())
        {
            check_orphaned();
            uk.nhs.nhsia.datastandards.ecds.PersonNameStructure.PersonNameStructured target = null;
            target = (uk.nhs.nhsia.datastandards.ecds.PersonNameStructure.PersonNameStructured)get_store().add_element_user(PERSONNAMESTRUCTURED$2);
            return target;
        }
    }
    
    /**
     * Unsets the "PersonName_Structured" element
     */
    public void unsetPersonNameStructured()
    {
        synchronized (monitor())
        {
            check_orphaned();
            get_store().remove_element(PERSONNAMESTRUCTURED$2, 0);
        }
    }
    
    /**
     * Gets the "PersonRequestedName" element
     */
    public java.lang.String getPersonRequestedName()
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.SimpleValue target = null;
            target = (org.apache.xmlbeans.SimpleValue)get_store().find_element_user(PERSONREQUESTEDNAME$4, 0);
            if (target == null)
            {
                return null;
            }
            return target.getStringValue();
        }
    }
    
    /**
     * Gets (as xml) the "PersonRequestedName" element
     */
    public uk.nhs.nhsia.datastandards.ecds.PersonNameUnstructuredTextType xgetPersonRequestedName()
    {
        synchronized (monitor())
        {
            check_orphaned();
            uk.nhs.nhsia.datastandards.ecds.PersonNameUnstructuredTextType target = null;
            target = (uk.nhs.nhsia.datastandards.ecds.PersonNameUnstructuredTextType)get_store().find_element_user(PERSONREQUESTEDNAME$4, 0);
            return target;
        }
    }
    
    /**
     * True if has "PersonRequestedName" element
     */
    public boolean isSetPersonRequestedName()
    {
        synchronized (monitor())
        {
            check_orphaned();
            return get_store().count_elements(PERSONREQUESTEDNAME$4) != 0;
        }
    }
    
    /**
     * Sets the "PersonRequestedName" element
     */
    public void setPersonRequestedName(java.lang.String personRequestedName)
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.SimpleValue target = null;
            target = (org.apache.xmlbeans.SimpleValue)get_store().find_element_user(PERSONREQUESTEDNAME$4, 0);
            if (target == null)
            {
                target = (org.apache.xmlbeans.SimpleValue)get_store().add_element_user(PERSONREQUESTEDNAME$4);
            }
            target.setStringValue(personRequestedName);
        }
    }
    
    /**
     * Sets (as xml) the "PersonRequestedName" element
     */
    public void xsetPersonRequestedName(uk.nhs.nhsia.datastandards.ecds.PersonNameUnstructuredTextType personRequestedName)
    {
        synchronized (monitor())
        {
            check_orphaned();
            uk.nhs.nhsia.datastandards.ecds.PersonNameUnstructuredTextType target = null;
            target = (uk.nhs.nhsia.datastandards.ecds.PersonNameUnstructuredTextType)get_store().find_element_user(PERSONREQUESTEDNAME$4, 0);
            if (target == null)
            {
                target = (uk.nhs.nhsia.datastandards.ecds.PersonNameUnstructuredTextType)get_store().add_element_user(PERSONREQUESTEDNAME$4);
            }
            target.set(personRequestedName);
        }
    }
    
    /**
     * Unsets the "PersonRequestedName" element
     */
    public void unsetPersonRequestedName()
    {
        synchronized (monitor())
        {
            check_orphaned();
            get_store().remove_element(PERSONREQUESTEDNAME$4, 0);
        }
    }
    /**
     * An XML PersonName_Structured(@http://www.nhsia.nhs.uk/DataStandards/XMLschema/CDS/ns).
     *
     * This is a complex type.
     */
    public static class PersonNameStructuredImpl extends org.apache.xmlbeans.impl.values.XmlComplexContentImpl implements uk.nhs.nhsia.datastandards.ecds.PersonNameStructure.PersonNameStructured
    {
        private static final long serialVersionUID = 1L;
        
        public PersonNameStructuredImpl(org.apache.xmlbeans.SchemaType sType)
        {
            super(sType);
        }
        
        private static final javax.xml.namespace.QName PERSONTITLE$0 = 
            new javax.xml.namespace.QName("http://www.nhsia.nhs.uk/DataStandards/XMLschema/CDS/ns", "PersonTitle");
        private static final javax.xml.namespace.QName PERSONGIVENNAME$2 = 
            new javax.xml.namespace.QName("http://www.nhsia.nhs.uk/DataStandards/XMLschema/CDS/ns", "PersonGivenName");
        private static final javax.xml.namespace.QName PERSONFAMILYNAME$4 = 
            new javax.xml.namespace.QName("http://www.nhsia.nhs.uk/DataStandards/XMLschema/CDS/ns", "PersonFamilyName");
        private static final javax.xml.namespace.QName PERSONNAMESUFFIX$6 = 
            new javax.xml.namespace.QName("http://www.nhsia.nhs.uk/DataStandards/XMLschema/CDS/ns", "PersonNameSuffix");
        private static final javax.xml.namespace.QName PERSONINITIALS$8 = 
            new javax.xml.namespace.QName("http://www.nhsia.nhs.uk/DataStandards/XMLschema/CDS/ns", "PersonInitials");
        
        
        /**
         * Gets the "PersonTitle" element
         */
        public java.lang.String getPersonTitle()
        {
            synchronized (monitor())
            {
                check_orphaned();
                org.apache.xmlbeans.SimpleValue target = null;
                target = (org.apache.xmlbeans.SimpleValue)get_store().find_element_user(PERSONTITLE$0, 0);
                if (target == null)
                {
                    return null;
                }
                return target.getStringValue();
            }
        }
        
        /**
         * Gets (as xml) the "PersonTitle" element
         */
        public uk.nhs.nhsia.datastandards.ecds.PersonNameStructuredWordType xgetPersonTitle()
        {
            synchronized (monitor())
            {
                check_orphaned();
                uk.nhs.nhsia.datastandards.ecds.PersonNameStructuredWordType target = null;
                target = (uk.nhs.nhsia.datastandards.ecds.PersonNameStructuredWordType)get_store().find_element_user(PERSONTITLE$0, 0);
                return target;
            }
        }
        
        /**
         * True if has "PersonTitle" element
         */
        public boolean isSetPersonTitle()
        {
            synchronized (monitor())
            {
                check_orphaned();
                return get_store().count_elements(PERSONTITLE$0) != 0;
            }
        }
        
        /**
         * Sets the "PersonTitle" element
         */
        public void setPersonTitle(java.lang.String personTitle)
        {
            synchronized (monitor())
            {
                check_orphaned();
                org.apache.xmlbeans.SimpleValue target = null;
                target = (org.apache.xmlbeans.SimpleValue)get_store().find_element_user(PERSONTITLE$0, 0);
                if (target == null)
                {
                    target = (org.apache.xmlbeans.SimpleValue)get_store().add_element_user(PERSONTITLE$0);
                }
                target.setStringValue(personTitle);
            }
        }
        
        /**
         * Sets (as xml) the "PersonTitle" element
         */
        public void xsetPersonTitle(uk.nhs.nhsia.datastandards.ecds.PersonNameStructuredWordType personTitle)
        {
            synchronized (monitor())
            {
                check_orphaned();
                uk.nhs.nhsia.datastandards.ecds.PersonNameStructuredWordType target = null;
                target = (uk.nhs.nhsia.datastandards.ecds.PersonNameStructuredWordType)get_store().find_element_user(PERSONTITLE$0, 0);
                if (target == null)
                {
                    target = (uk.nhs.nhsia.datastandards.ecds.PersonNameStructuredWordType)get_store().add_element_user(PERSONTITLE$0);
                }
                target.set(personTitle);
            }
        }
        
        /**
         * Unsets the "PersonTitle" element
         */
        public void unsetPersonTitle()
        {
            synchronized (monitor())
            {
                check_orphaned();
                get_store().remove_element(PERSONTITLE$0, 0);
            }
        }
        
        /**
         * Gets the "PersonGivenName" element
         */
        public java.lang.String getPersonGivenName()
        {
            synchronized (monitor())
            {
                check_orphaned();
                org.apache.xmlbeans.SimpleValue target = null;
                target = (org.apache.xmlbeans.SimpleValue)get_store().find_element_user(PERSONGIVENNAME$2, 0);
                if (target == null)
                {
                    return null;
                }
                return target.getStringValue();
            }
        }
        
        /**
         * Gets (as xml) the "PersonGivenName" element
         */
        public uk.nhs.nhsia.datastandards.ecds.PersonNameStructuredWordType xgetPersonGivenName()
        {
            synchronized (monitor())
            {
                check_orphaned();
                uk.nhs.nhsia.datastandards.ecds.PersonNameStructuredWordType target = null;
                target = (uk.nhs.nhsia.datastandards.ecds.PersonNameStructuredWordType)get_store().find_element_user(PERSONGIVENNAME$2, 0);
                return target;
            }
        }
        
        /**
         * Sets the "PersonGivenName" element
         */
        public void setPersonGivenName(java.lang.String personGivenName)
        {
            synchronized (monitor())
            {
                check_orphaned();
                org.apache.xmlbeans.SimpleValue target = null;
                target = (org.apache.xmlbeans.SimpleValue)get_store().find_element_user(PERSONGIVENNAME$2, 0);
                if (target == null)
                {
                    target = (org.apache.xmlbeans.SimpleValue)get_store().add_element_user(PERSONGIVENNAME$2);
                }
                target.setStringValue(personGivenName);
            }
        }
        
        /**
         * Sets (as xml) the "PersonGivenName" element
         */
        public void xsetPersonGivenName(uk.nhs.nhsia.datastandards.ecds.PersonNameStructuredWordType personGivenName)
        {
            synchronized (monitor())
            {
                check_orphaned();
                uk.nhs.nhsia.datastandards.ecds.PersonNameStructuredWordType target = null;
                target = (uk.nhs.nhsia.datastandards.ecds.PersonNameStructuredWordType)get_store().find_element_user(PERSONGIVENNAME$2, 0);
                if (target == null)
                {
                    target = (uk.nhs.nhsia.datastandards.ecds.PersonNameStructuredWordType)get_store().add_element_user(PERSONGIVENNAME$2);
                }
                target.set(personGivenName);
            }
        }
        
        /**
         * Gets the "PersonFamilyName" element
         */
        public java.lang.String getPersonFamilyName()
        {
            synchronized (monitor())
            {
                check_orphaned();
                org.apache.xmlbeans.SimpleValue target = null;
                target = (org.apache.xmlbeans.SimpleValue)get_store().find_element_user(PERSONFAMILYNAME$4, 0);
                if (target == null)
                {
                    return null;
                }
                return target.getStringValue();
            }
        }
        
        /**
         * Gets (as xml) the "PersonFamilyName" element
         */
        public uk.nhs.nhsia.datastandards.ecds.PersonNameStructuredWordType xgetPersonFamilyName()
        {
            synchronized (monitor())
            {
                check_orphaned();
                uk.nhs.nhsia.datastandards.ecds.PersonNameStructuredWordType target = null;
                target = (uk.nhs.nhsia.datastandards.ecds.PersonNameStructuredWordType)get_store().find_element_user(PERSONFAMILYNAME$4, 0);
                return target;
            }
        }
        
        /**
         * Sets the "PersonFamilyName" element
         */
        public void setPersonFamilyName(java.lang.String personFamilyName)
        {
            synchronized (monitor())
            {
                check_orphaned();
                org.apache.xmlbeans.SimpleValue target = null;
                target = (org.apache.xmlbeans.SimpleValue)get_store().find_element_user(PERSONFAMILYNAME$4, 0);
                if (target == null)
                {
                    target = (org.apache.xmlbeans.SimpleValue)get_store().add_element_user(PERSONFAMILYNAME$4);
                }
                target.setStringValue(personFamilyName);
            }
        }
        
        /**
         * Sets (as xml) the "PersonFamilyName" element
         */
        public void xsetPersonFamilyName(uk.nhs.nhsia.datastandards.ecds.PersonNameStructuredWordType personFamilyName)
        {
            synchronized (monitor())
            {
                check_orphaned();
                uk.nhs.nhsia.datastandards.ecds.PersonNameStructuredWordType target = null;
                target = (uk.nhs.nhsia.datastandards.ecds.PersonNameStructuredWordType)get_store().find_element_user(PERSONFAMILYNAME$4, 0);
                if (target == null)
                {
                    target = (uk.nhs.nhsia.datastandards.ecds.PersonNameStructuredWordType)get_store().add_element_user(PERSONFAMILYNAME$4);
                }
                target.set(personFamilyName);
            }
        }
        
        /**
         * Gets the "PersonNameSuffix" element
         */
        public java.lang.String getPersonNameSuffix()
        {
            synchronized (monitor())
            {
                check_orphaned();
                org.apache.xmlbeans.SimpleValue target = null;
                target = (org.apache.xmlbeans.SimpleValue)get_store().find_element_user(PERSONNAMESUFFIX$6, 0);
                if (target == null)
                {
                    return null;
                }
                return target.getStringValue();
            }
        }
        
        /**
         * Gets (as xml) the "PersonNameSuffix" element
         */
        public uk.nhs.nhsia.datastandards.ecds.PersonNameStructuredWordType xgetPersonNameSuffix()
        {
            synchronized (monitor())
            {
                check_orphaned();
                uk.nhs.nhsia.datastandards.ecds.PersonNameStructuredWordType target = null;
                target = (uk.nhs.nhsia.datastandards.ecds.PersonNameStructuredWordType)get_store().find_element_user(PERSONNAMESUFFIX$6, 0);
                return target;
            }
        }
        
        /**
         * True if has "PersonNameSuffix" element
         */
        public boolean isSetPersonNameSuffix()
        {
            synchronized (monitor())
            {
                check_orphaned();
                return get_store().count_elements(PERSONNAMESUFFIX$6) != 0;
            }
        }
        
        /**
         * Sets the "PersonNameSuffix" element
         */
        public void setPersonNameSuffix(java.lang.String personNameSuffix)
        {
            synchronized (monitor())
            {
                check_orphaned();
                org.apache.xmlbeans.SimpleValue target = null;
                target = (org.apache.xmlbeans.SimpleValue)get_store().find_element_user(PERSONNAMESUFFIX$6, 0);
                if (target == null)
                {
                    target = (org.apache.xmlbeans.SimpleValue)get_store().add_element_user(PERSONNAMESUFFIX$6);
                }
                target.setStringValue(personNameSuffix);
            }
        }
        
        /**
         * Sets (as xml) the "PersonNameSuffix" element
         */
        public void xsetPersonNameSuffix(uk.nhs.nhsia.datastandards.ecds.PersonNameStructuredWordType personNameSuffix)
        {
            synchronized (monitor())
            {
                check_orphaned();
                uk.nhs.nhsia.datastandards.ecds.PersonNameStructuredWordType target = null;
                target = (uk.nhs.nhsia.datastandards.ecds.PersonNameStructuredWordType)get_store().find_element_user(PERSONNAMESUFFIX$6, 0);
                if (target == null)
                {
                    target = (uk.nhs.nhsia.datastandards.ecds.PersonNameStructuredWordType)get_store().add_element_user(PERSONNAMESUFFIX$6);
                }
                target.set(personNameSuffix);
            }
        }
        
        /**
         * Unsets the "PersonNameSuffix" element
         */
        public void unsetPersonNameSuffix()
        {
            synchronized (monitor())
            {
                check_orphaned();
                get_store().remove_element(PERSONNAMESUFFIX$6, 0);
            }
        }
        
        /**
         * Gets the "PersonInitials" element
         */
        public java.lang.String getPersonInitials()
        {
            synchronized (monitor())
            {
                check_orphaned();
                org.apache.xmlbeans.SimpleValue target = null;
                target = (org.apache.xmlbeans.SimpleValue)get_store().find_element_user(PERSONINITIALS$8, 0);
                if (target == null)
                {
                    return null;
                }
                return target.getStringValue();
            }
        }
        
        /**
         * Gets (as xml) the "PersonInitials" element
         */
        public uk.nhs.nhsia.datastandards.ecds.PersonNameStructuredWordType xgetPersonInitials()
        {
            synchronized (monitor())
            {
                check_orphaned();
                uk.nhs.nhsia.datastandards.ecds.PersonNameStructuredWordType target = null;
                target = (uk.nhs.nhsia.datastandards.ecds.PersonNameStructuredWordType)get_store().find_element_user(PERSONINITIALS$8, 0);
                return target;
            }
        }
        
        /**
         * True if has "PersonInitials" element
         */
        public boolean isSetPersonInitials()
        {
            synchronized (monitor())
            {
                check_orphaned();
                return get_store().count_elements(PERSONINITIALS$8) != 0;
            }
        }
        
        /**
         * Sets the "PersonInitials" element
         */
        public void setPersonInitials(java.lang.String personInitials)
        {
            synchronized (monitor())
            {
                check_orphaned();
                org.apache.xmlbeans.SimpleValue target = null;
                target = (org.apache.xmlbeans.SimpleValue)get_store().find_element_user(PERSONINITIALS$8, 0);
                if (target == null)
                {
                    target = (org.apache.xmlbeans.SimpleValue)get_store().add_element_user(PERSONINITIALS$8);
                }
                target.setStringValue(personInitials);
            }
        }
        
        /**
         * Sets (as xml) the "PersonInitials" element
         */
        public void xsetPersonInitials(uk.nhs.nhsia.datastandards.ecds.PersonNameStructuredWordType personInitials)
        {
            synchronized (monitor())
            {
                check_orphaned();
                uk.nhs.nhsia.datastandards.ecds.PersonNameStructuredWordType target = null;
                target = (uk.nhs.nhsia.datastandards.ecds.PersonNameStructuredWordType)get_store().find_element_user(PERSONINITIALS$8, 0);
                if (target == null)
                {
                    target = (uk.nhs.nhsia.datastandards.ecds.PersonNameStructuredWordType)get_store().add_element_user(PERSONINITIALS$8);
                }
                target.set(personInitials);
            }
        }
        
        /**
         * Unsets the "PersonInitials" element
         */
        public void unsetPersonInitials()
        {
            synchronized (monitor())
            {
                check_orphaned();
                get_store().remove_element(PERSONINITIALS$8, 0);
            }
        }
    }
}
