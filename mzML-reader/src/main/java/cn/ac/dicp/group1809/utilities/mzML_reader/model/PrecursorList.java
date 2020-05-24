package cn.ac.dicp.group1809.utilities.mzML_reader.model;

import javax.xml.bind.annotation.*;
import java.io.Serializable;
import java.util.ArrayList;
import java.util.List;

/**
 * @author He Zhu
 * @version 1.0.0
 * @since 2020/5/19 13:56
 */

/**
 * List and descriptions of precursor isolations to the spectrum currently being described, ordered.
 *
 * <p>Java class for PrecursorListType complex type.
 *
 * <p>The following schema fragment specifies the expected content contained within this class.
 *
 * <pre>
 * &lt;complexType name="PrecursorListType">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="precursor" type="{http://psi.hupo.org/ms/mzml}PrecursorType" maxOccurs="unbounded"/>
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
@XmlType(name = "PrecursorListType", propOrder = {
        "precursors"
})
public class PrecursorList
        implements Serializable
{
    private static final long serialVersionUID = -7953962487728847427L;
    @XmlElement(required = true)
    private List<Precursor> precursors;

    @XmlAttribute(required = true)
    @XmlSchemaType(name = "nonNegativeInteger")
    private Integer count;

    /**
     * Gets the value of the precursor property.
     *
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the precursor property.
     *
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getPrecursor().add(newItem);
     * </pre>
     *
     *
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link Precursor }
     *
     *
     */
    public List<Precursor> getPrecursors() {
        if (precursors == null) {
            precursors = new ArrayList<Precursor>();
        }
        return this.precursors;
    }

    public void setPrecursors(List<Precursor> precursors) {
        this.precursors = precursors;
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
