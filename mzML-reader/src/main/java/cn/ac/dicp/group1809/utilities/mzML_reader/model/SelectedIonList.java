package cn.ac.dicp.group1809.utilities.mzML_reader.model;

import javax.xml.bind.annotation.*;
import java.io.Serializable;
import java.util.ArrayList;
import java.util.List;

/**
 * @author He Zhu
 * @version 1.0.0
 * @since 2020/5/19 14:29
 */

/**
 * The list of selected precursor ions.
 *
 * <p>Java class for SelectedIonListType complex type.
 *
 * <p>The following schema fragment specifies the expected content contained within this class.
 *
 * <pre>
 * &lt;complexType name="SelectedIonListType">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="selectedIon" type="{http://psi.hupo.org/ms/mzml}ParamGroupType" maxOccurs="unbounded"/>
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
@XmlType(name = "SelectedIonListType", propOrder = {
        "selectedIons"
})
public class SelectedIonList implements Serializable
{
    private static final long serialVersionUID = -2027597605533739324L;

    @XmlElement(required = true)
    protected List<ParamGroup> selectedIons;
    @XmlAttribute(required = true)
    @XmlSchemaType(name = "nonNegativeInteger")
    protected Integer count;

    /**
     * Gets the value of the selectedIon property.
     *
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the selectedIon property.
     *
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getSelectedIon().add(newItem);
     * </pre>
     *
     *
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link ParamGroup }
     *
     *
     */
    public List<ParamGroup> getSelectedIons() {
        if (selectedIons == null) {
            selectedIons = new ArrayList<ParamGroup>();
        }
        return this.selectedIons;
    }

    public void setSelectedIons(List<ParamGroup> selectedIons) {
        this.selectedIons = selectedIons;
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
