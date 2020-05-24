package cn.ac.dicp.group1809.utilities.mzML_reader.model;

/**
 * @author He Zhu
 * @version 1.0.0
 * @since 2020/5/18 10:33
 */

import javax.xml.bind.annotation.*;
import java.io.Serializable;
import java.util.ArrayList;
import java.util.List;

/**
 * Container for one or more controlled vocabulary definitions.
 *
 * <p>Java class for CVListType complex type.
 *
 * <p>The following schema fragment specifies the expected content contained within this class.
 *
 * <pre>
 * &lt;complexType name="CVListType">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="cv" type="{http://psi.hupo.org/ms/mzml}CVType" maxOccurs="unbounded"/>
 *       &lt;/sequence>
 *       &lt;attribute name="count" use="required" type="{http://www.w3.org/2001/XMLSchema}nonNegativeInteger" />
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 *
 *
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "CVListType", propOrder = {
        "cv"
})
public class CVList
        implements Serializable{
    private static final long serialVersionUID = 8584723899454805234L;
    @XmlElement(required = true)
    protected List<CV> cv;
    @XmlAttribute(required = true)
    @XmlSchemaType(name = "nonNegativeInteger")
    protected Integer count;

    /**
     * Gets the value of the cv property.
     *
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the cv property.
     *
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getCv().add(newItem);
     * </pre>
     *
     *
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link CV }
     *
     *
     */
    public List<CV> getCv() {
        if (cv == null) {
            cv = new ArrayList<CV>();
        }
        return this.cv;
    }

    public void setCv(List<CV> cv) {
        this.cv = cv;
    }


    /**
     * Gets the value of the count property.
     *
     * @return
     *     possible object is
     *     {@link Integer }
     *
     */
    public Integer getCount() {
        return count;
    }

    /**
     * Sets the value of the count property.
     *
     * @param value
     *     allowed object is
     *     {@link Integer }
     *
     */
    public void setCount(Integer value) {
        this.count = value;
    }

}

