
package cn.ac.dicp.group1809.utilities.mzML_reader.model;


import cn.ac.dicp.group1809.utilities.mzML_reader.jaxb.adapters.IdRefAdapter;

import javax.xml.bind.annotation.*;
import javax.xml.bind.annotation.adapters.XmlJavaTypeAdapter;
import java.io.Serializable;

/**
 * @author He Zhu
 * @version 1.0.0
 * @since 2020/5/18 10:35
 */

/**
 * Reference to a previously defined software element
 * 
 * <p>Java class for SoftwareRefType complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="SoftwareRefType">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;attribute name="ref" use="required" type="{http://www.w3.org/2001/XMLSchema}IDREF" />
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "SoftwareRefType")
public class SoftwareRef
    implements Serializable
{

    private final static long serialVersionUID = 100L;
    @XmlAttribute(required = true)
    @XmlJavaTypeAdapter(IdRefAdapter.class)
    @XmlSchemaType(name = "IDREF")
    protected String ref;
    @XmlTransient
    private Software software;

    /**
     * Gets the value of the ref property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getRef() {
        return ref;
    }

    /**
     * Sets the value of the ref property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setRef(String value) {
        this.ref = value;
    }

    public Software getSoftware() {
        return software;
    }


    public void setSoftware(Software software) {
        this.software = software;
        if (software != null) {
            this.ref =software.getId();
        }
    }

}
