/*
 * An XML document type.
 * Localname: CDS-XMLInterchange
 * Namespace: http://www.nhsia.nhs.uk/DataStandards/XMLschema/CDS/ns
 * Java type: uk.nhs.nhsia.datastandards.ecds.CDSXMLInterchangeDocument
 *
 * Automatically generated - do not modify.
 */
package uk.nhs.nhsia.datastandards.ecds.impl;
/**
 * A document containing one CDS-XMLInterchange(@http://www.nhsia.nhs.uk/DataStandards/XMLschema/CDS/ns) element.
 *
 * This is a complex type.
 */
public class CDSXMLInterchangeDocumentImpl extends org.apache.xmlbeans.impl.values.XmlComplexContentImpl implements uk.nhs.nhsia.datastandards.ecds.CDSXMLInterchangeDocument
{
    private static final long serialVersionUID = 1L;
    
    public CDSXMLInterchangeDocumentImpl(org.apache.xmlbeans.SchemaType sType)
    {
        super(sType);
    }
    
    private static final javax.xml.namespace.QName CDSXMLINTERCHANGE$0 = 
        new javax.xml.namespace.QName("http://www.nhsia.nhs.uk/DataStandards/XMLschema/CDS/ns", "CDS-XMLInterchange");
    
    
    /**
     * Gets the "CDS-XMLInterchange" element
     */
    public uk.nhs.nhsia.datastandards.ecds.CDSXMLInterchangeDocument.CDSXMLInterchange getCDSXMLInterchange()
    {
        synchronized (monitor())
        {
            check_orphaned();
            uk.nhs.nhsia.datastandards.ecds.CDSXMLInterchangeDocument.CDSXMLInterchange target = null;
            target = (uk.nhs.nhsia.datastandards.ecds.CDSXMLInterchangeDocument.CDSXMLInterchange)get_store().find_element_user(CDSXMLINTERCHANGE$0, 0);
            if (target == null)
            {
                return null;
            }
            return target;
        }
    }
    
    /**
     * Sets the "CDS-XMLInterchange" element
     */
    public void setCDSXMLInterchange(uk.nhs.nhsia.datastandards.ecds.CDSXMLInterchangeDocument.CDSXMLInterchange cdsxmlInterchange)
    {
        generatedSetterHelperImpl(cdsxmlInterchange, CDSXMLINTERCHANGE$0, 0, org.apache.xmlbeans.impl.values.XmlObjectBase.KIND_SETTERHELPER_SINGLETON);
    }
    
    /**
     * Appends and returns a new empty "CDS-XMLInterchange" element
     */
    public uk.nhs.nhsia.datastandards.ecds.CDSXMLInterchangeDocument.CDSXMLInterchange addNewCDSXMLInterchange()
    {
        synchronized (monitor())
        {
            check_orphaned();
            uk.nhs.nhsia.datastandards.ecds.CDSXMLInterchangeDocument.CDSXMLInterchange target = null;
            target = (uk.nhs.nhsia.datastandards.ecds.CDSXMLInterchangeDocument.CDSXMLInterchange)get_store().add_element_user(CDSXMLINTERCHANGE$0);
            return target;
        }
    }
    /**
     * An XML CDS-XMLInterchange(@http://www.nhsia.nhs.uk/DataStandards/XMLschema/CDS/ns).
     *
     * This is a complex type.
     */
    public static class CDSXMLInterchangeImpl extends uk.nhs.nhsia.datastandards.ecds.impl.CDSInterchangeStructureImpl implements uk.nhs.nhsia.datastandards.ecds.CDSXMLInterchangeDocument.CDSXMLInterchange
    {
        private static final long serialVersionUID = 1L;
        
        public CDSXMLInterchangeImpl(org.apache.xmlbeans.SchemaType sType)
        {
            super(sType);
        }
        
        private static final javax.xml.namespace.QName SCHEMAVERSION$0 = 
            new javax.xml.namespace.QName("", "SchemaVersion");
        private static final javax.xml.namespace.QName SCHEMADATE$2 = 
            new javax.xml.namespace.QName("", "SchemaDate");
        
        
        /**
         * Gets the "SchemaVersion" attribute
         */
        public java.lang.String getSchemaVersion()
        {
            synchronized (monitor())
            {
                check_orphaned();
                org.apache.xmlbeans.SimpleValue target = null;
                target = (org.apache.xmlbeans.SimpleValue)get_store().find_attribute_user(SCHEMAVERSION$0);
                if (target == null)
                {
                    target = (org.apache.xmlbeans.SimpleValue)get_default_attribute_value(SCHEMAVERSION$0);
                }
                if (target == null)
                {
                    return null;
                }
                return target.getStringValue();
            }
        }
        
        /**
         * Gets (as xml) the "SchemaVersion" attribute
         */
        public org.apache.xmlbeans.XmlNMTOKEN xgetSchemaVersion()
        {
            synchronized (monitor())
            {
                check_orphaned();
                org.apache.xmlbeans.XmlNMTOKEN target = null;
                target = (org.apache.xmlbeans.XmlNMTOKEN)get_store().find_attribute_user(SCHEMAVERSION$0);
                if (target == null)
                {
                    target = (org.apache.xmlbeans.XmlNMTOKEN)get_default_attribute_value(SCHEMAVERSION$0);
                }
                return target;
            }
        }
        
        /**
         * Sets the "SchemaVersion" attribute
         */
        public void setSchemaVersion(java.lang.String schemaVersion)
        {
            synchronized (monitor())
            {
                check_orphaned();
                org.apache.xmlbeans.SimpleValue target = null;
                target = (org.apache.xmlbeans.SimpleValue)get_store().find_attribute_user(SCHEMAVERSION$0);
                if (target == null)
                {
                    target = (org.apache.xmlbeans.SimpleValue)get_store().add_attribute_user(SCHEMAVERSION$0);
                }
                target.setStringValue(schemaVersion);
            }
        }
        
        /**
         * Sets (as xml) the "SchemaVersion" attribute
         */
        public void xsetSchemaVersion(org.apache.xmlbeans.XmlNMTOKEN schemaVersion)
        {
            synchronized (monitor())
            {
                check_orphaned();
                org.apache.xmlbeans.XmlNMTOKEN target = null;
                target = (org.apache.xmlbeans.XmlNMTOKEN)get_store().find_attribute_user(SCHEMAVERSION$0);
                if (target == null)
                {
                    target = (org.apache.xmlbeans.XmlNMTOKEN)get_store().add_attribute_user(SCHEMAVERSION$0);
                }
                target.set(schemaVersion);
            }
        }
        
        /**
         * Gets the "SchemaDate" attribute
         */
        public java.util.Calendar getSchemaDate()
        {
            synchronized (monitor())
            {
                check_orphaned();
                org.apache.xmlbeans.SimpleValue target = null;
                target = (org.apache.xmlbeans.SimpleValue)get_store().find_attribute_user(SCHEMADATE$2);
                if (target == null)
                {
                    target = (org.apache.xmlbeans.SimpleValue)get_default_attribute_value(SCHEMADATE$2);
                }
                if (target == null)
                {
                    return null;
                }
                return target.getCalendarValue();
            }
        }
        
        /**
         * Gets (as xml) the "SchemaDate" attribute
         */
        public org.apache.xmlbeans.XmlDate xgetSchemaDate()
        {
            synchronized (monitor())
            {
                check_orphaned();
                org.apache.xmlbeans.XmlDate target = null;
                target = (org.apache.xmlbeans.XmlDate)get_store().find_attribute_user(SCHEMADATE$2);
                if (target == null)
                {
                    target = (org.apache.xmlbeans.XmlDate)get_default_attribute_value(SCHEMADATE$2);
                }
                return target;
            }
        }
        
        /**
         * Sets the "SchemaDate" attribute
         */
        public void setSchemaDate(java.util.Calendar schemaDate)
        {
            synchronized (monitor())
            {
                check_orphaned();
                org.apache.xmlbeans.SimpleValue target = null;
                target = (org.apache.xmlbeans.SimpleValue)get_store().find_attribute_user(SCHEMADATE$2);
                if (target == null)
                {
                    target = (org.apache.xmlbeans.SimpleValue)get_store().add_attribute_user(SCHEMADATE$2);
                }
                target.setCalendarValue(schemaDate);
            }
        }
        
        /**
         * Sets (as xml) the "SchemaDate" attribute
         */
        public void xsetSchemaDate(org.apache.xmlbeans.XmlDate schemaDate)
        {
            synchronized (monitor())
            {
                check_orphaned();
                org.apache.xmlbeans.XmlDate target = null;
                target = (org.apache.xmlbeans.XmlDate)get_store().find_attribute_user(SCHEMADATE$2);
                if (target == null)
                {
                    target = (org.apache.xmlbeans.XmlDate)get_store().add_attribute_user(SCHEMADATE$2);
                }
                target.set(schemaDate);
            }
        }
    }
}
