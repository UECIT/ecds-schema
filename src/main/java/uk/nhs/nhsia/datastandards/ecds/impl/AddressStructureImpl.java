/*
 * XML Type:  Address_Structure
 * Namespace: http://www.nhsia.nhs.uk/DataStandards/XMLschema/CDS/ns
 * Java type: uk.nhs.nhsia.datastandards.ecds.AddressStructure
 *
 * Automatically generated - do not modify.
 */
package uk.nhs.nhsia.datastandards.ecds.impl;
/**
 * An XML Address_Structure(@http://www.nhsia.nhs.uk/DataStandards/XMLschema/CDS/ns).
 *
 * This is a complex type.
 */
public class AddressStructureImpl extends org.apache.xmlbeans.impl.values.XmlComplexContentImpl implements uk.nhs.nhsia.datastandards.ecds.AddressStructure
{
    private static final long serialVersionUID = 1L;
    
    public AddressStructureImpl(org.apache.xmlbeans.SchemaType sType)
    {
        super(sType);
    }
    
    private static final javax.xml.namespace.QName UNSTRUCTUREDADDRESS$0 = 
        new javax.xml.namespace.QName("http://www.nhsia.nhs.uk/DataStandards/XMLschema/CDS/ns", "UnstructuredAddress");
    private static final javax.xml.namespace.QName STRUCTUREDADDRESS$2 = 
        new javax.xml.namespace.QName("http://www.nhsia.nhs.uk/DataStandards/XMLschema/CDS/ns", "StructuredAddress");
    
    
    /**
     * Gets the "UnstructuredAddress" element
     */
    public java.lang.String getUnstructuredAddress()
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.SimpleValue target = null;
            target = (org.apache.xmlbeans.SimpleValue)get_store().find_element_user(UNSTRUCTUREDADDRESS$0, 0);
            if (target == null)
            {
                return null;
            }
            return target.getStringValue();
        }
    }
    
    /**
     * Gets (as xml) the "UnstructuredAddress" element
     */
    public uk.nhs.nhsia.datastandards.ecds.UnstructuredAddressType xgetUnstructuredAddress()
    {
        synchronized (monitor())
        {
            check_orphaned();
            uk.nhs.nhsia.datastandards.ecds.UnstructuredAddressType target = null;
            target = (uk.nhs.nhsia.datastandards.ecds.UnstructuredAddressType)get_store().find_element_user(UNSTRUCTUREDADDRESS$0, 0);
            return target;
        }
    }
    
    /**
     * True if has "UnstructuredAddress" element
     */
    public boolean isSetUnstructuredAddress()
    {
        synchronized (monitor())
        {
            check_orphaned();
            return get_store().count_elements(UNSTRUCTUREDADDRESS$0) != 0;
        }
    }
    
    /**
     * Sets the "UnstructuredAddress" element
     */
    public void setUnstructuredAddress(java.lang.String unstructuredAddress)
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.SimpleValue target = null;
            target = (org.apache.xmlbeans.SimpleValue)get_store().find_element_user(UNSTRUCTUREDADDRESS$0, 0);
            if (target == null)
            {
                target = (org.apache.xmlbeans.SimpleValue)get_store().add_element_user(UNSTRUCTUREDADDRESS$0);
            }
            target.setStringValue(unstructuredAddress);
        }
    }
    
    /**
     * Sets (as xml) the "UnstructuredAddress" element
     */
    public void xsetUnstructuredAddress(uk.nhs.nhsia.datastandards.ecds.UnstructuredAddressType unstructuredAddress)
    {
        synchronized (monitor())
        {
            check_orphaned();
            uk.nhs.nhsia.datastandards.ecds.UnstructuredAddressType target = null;
            target = (uk.nhs.nhsia.datastandards.ecds.UnstructuredAddressType)get_store().find_element_user(UNSTRUCTUREDADDRESS$0, 0);
            if (target == null)
            {
                target = (uk.nhs.nhsia.datastandards.ecds.UnstructuredAddressType)get_store().add_element_user(UNSTRUCTUREDADDRESS$0);
            }
            target.set(unstructuredAddress);
        }
    }
    
    /**
     * Unsets the "UnstructuredAddress" element
     */
    public void unsetUnstructuredAddress()
    {
        synchronized (monitor())
        {
            check_orphaned();
            get_store().remove_element(UNSTRUCTUREDADDRESS$0, 0);
        }
    }
    
    /**
     * Gets array of all "StructuredAddress" elements
     */
    public java.lang.String[] getStructuredAddressArray()
    {
        synchronized (monitor())
        {
            check_orphaned();
            java.util.List targetList = new java.util.ArrayList();
            get_store().find_all_element_users(STRUCTUREDADDRESS$2, targetList);
            java.lang.String[] result = new java.lang.String[targetList.size()];
            for (int i = 0, len = targetList.size() ; i < len ; i++)
                result[i] = ((org.apache.xmlbeans.SimpleValue)targetList.get(i)).getStringValue();
            return result;
        }
    }
    
    /**
     * Gets ith "StructuredAddress" element
     */
    public java.lang.String getStructuredAddressArray(int i)
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.SimpleValue target = null;
            target = (org.apache.xmlbeans.SimpleValue)get_store().find_element_user(STRUCTUREDADDRESS$2, i);
            if (target == null)
            {
                throw new IndexOutOfBoundsException();
            }
            return target.getStringValue();
        }
    }
    
    /**
     * Gets (as xml) array of all "StructuredAddress" elements
     */
    public uk.nhs.nhsia.datastandards.ecds.StructuredAddressType[] xgetStructuredAddressArray()
    {
        synchronized (monitor())
        {
            check_orphaned();
            java.util.List targetList = new java.util.ArrayList();
            get_store().find_all_element_users(STRUCTUREDADDRESS$2, targetList);
            uk.nhs.nhsia.datastandards.ecds.StructuredAddressType[] result = new uk.nhs.nhsia.datastandards.ecds.StructuredAddressType[targetList.size()];
            targetList.toArray(result);
            return result;
        }
    }
    
    /**
     * Gets (as xml) ith "StructuredAddress" element
     */
    public uk.nhs.nhsia.datastandards.ecds.StructuredAddressType xgetStructuredAddressArray(int i)
    {
        synchronized (monitor())
        {
            check_orphaned();
            uk.nhs.nhsia.datastandards.ecds.StructuredAddressType target = null;
            target = (uk.nhs.nhsia.datastandards.ecds.StructuredAddressType)get_store().find_element_user(STRUCTUREDADDRESS$2, i);
            if (target == null)
            {
                throw new IndexOutOfBoundsException();
            }
            return target;
        }
    }
    
    /**
     * Returns number of "StructuredAddress" element
     */
    public int sizeOfStructuredAddressArray()
    {
        synchronized (monitor())
        {
            check_orphaned();
            return get_store().count_elements(STRUCTUREDADDRESS$2);
        }
    }
    
    /**
     * Sets array of all "StructuredAddress" element
     */
    public void setStructuredAddressArray(java.lang.String[] structuredAddressArray)
    {
        synchronized (monitor())
        {
            check_orphaned();
            arraySetterHelper(structuredAddressArray, STRUCTUREDADDRESS$2);
        }
    }
    
    /**
     * Sets ith "StructuredAddress" element
     */
    public void setStructuredAddressArray(int i, java.lang.String structuredAddress)
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.SimpleValue target = null;
            target = (org.apache.xmlbeans.SimpleValue)get_store().find_element_user(STRUCTUREDADDRESS$2, i);
            if (target == null)
            {
                throw new IndexOutOfBoundsException();
            }
            target.setStringValue(structuredAddress);
        }
    }
    
    /**
     * Sets (as xml) array of all "StructuredAddress" element
     */
    public void xsetStructuredAddressArray(uk.nhs.nhsia.datastandards.ecds.StructuredAddressType[]structuredAddressArray)
    {
        synchronized (monitor())
        {
            check_orphaned();
            arraySetterHelper(structuredAddressArray, STRUCTUREDADDRESS$2);
        }
    }
    
    /**
     * Sets (as xml) ith "StructuredAddress" element
     */
    public void xsetStructuredAddressArray(int i, uk.nhs.nhsia.datastandards.ecds.StructuredAddressType structuredAddress)
    {
        synchronized (monitor())
        {
            check_orphaned();
            uk.nhs.nhsia.datastandards.ecds.StructuredAddressType target = null;
            target = (uk.nhs.nhsia.datastandards.ecds.StructuredAddressType)get_store().find_element_user(STRUCTUREDADDRESS$2, i);
            if (target == null)
            {
                throw new IndexOutOfBoundsException();
            }
            target.set(structuredAddress);
        }
    }
    
    /**
     * Inserts the value as the ith "StructuredAddress" element
     */
    public void insertStructuredAddress(int i, java.lang.String structuredAddress)
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.SimpleValue target = 
                (org.apache.xmlbeans.SimpleValue)get_store().insert_element_user(STRUCTUREDADDRESS$2, i);
            target.setStringValue(structuredAddress);
        }
    }
    
    /**
     * Appends the value as the last "StructuredAddress" element
     */
    public void addStructuredAddress(java.lang.String structuredAddress)
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.SimpleValue target = null;
            target = (org.apache.xmlbeans.SimpleValue)get_store().add_element_user(STRUCTUREDADDRESS$2);
            target.setStringValue(structuredAddress);
        }
    }
    
    /**
     * Inserts and returns a new empty value (as xml) as the ith "StructuredAddress" element
     */
    public uk.nhs.nhsia.datastandards.ecds.StructuredAddressType insertNewStructuredAddress(int i)
    {
        synchronized (monitor())
        {
            check_orphaned();
            uk.nhs.nhsia.datastandards.ecds.StructuredAddressType target = null;
            target = (uk.nhs.nhsia.datastandards.ecds.StructuredAddressType)get_store().insert_element_user(STRUCTUREDADDRESS$2, i);
            return target;
        }
    }
    
    /**
     * Appends and returns a new empty value (as xml) as the last "StructuredAddress" element
     */
    public uk.nhs.nhsia.datastandards.ecds.StructuredAddressType addNewStructuredAddress()
    {
        synchronized (monitor())
        {
            check_orphaned();
            uk.nhs.nhsia.datastandards.ecds.StructuredAddressType target = null;
            target = (uk.nhs.nhsia.datastandards.ecds.StructuredAddressType)get_store().add_element_user(STRUCTUREDADDRESS$2);
            return target;
        }
    }
    
    /**
     * Removes the ith "StructuredAddress" element
     */
    public void removeStructuredAddress(int i)
    {
        synchronized (monitor())
        {
            check_orphaned();
            get_store().remove_element(STRUCTUREDADDRESS$2, i);
        }
    }
}
