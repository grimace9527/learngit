package cn.ac.dicp.group1809.utilities.mzML_reader.model;

import cn.ac.dicp.group1809.utilities.mzML_reader.jaxb.adapters.IdRefAdapter;

import javax.xml.bind.annotation.*;
import javax.xml.bind.annotation.adapters.XmlJavaTypeAdapter;
import java.io.Serializable;
import java.util.ArrayList;
import java.util.List;

/**
 * Include the chromatograms of the chromatogramList.
 *
 * @author He Zhu
 * @version 1.0.0
 * @since 2020/5/18 14:00
 */

/**
 * List of chromatograms.
 * <p/>
 * <p>Java class for ChromatogramListType complex type.
 * <p/>
 * <p>The following schema fragment specifies the expected content contained within this class.
 * <p/>
 * <pre>
 * &lt;complexType name="ChromatogramListType">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="chromatogram" type="{http://psi.hupo.org/ms/mzml}ChromatogramType" maxOccurs="unbounded"/>
 *       &lt;/sequence>
 *       &lt;attribute name="count" use="required" type="{http://www.w3.org/2001/XMLSchema}nonNegativeInteger" />
 *       &lt;attribute name="defaultDataProcessingRef" use="required" type="{http://www.w3.org/2001/XMLSchema}IDREF" />
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "ChromatogramListType", propOrder = {
        "chromatograms"
})
public class ChromatogramList
        implements Serializable {

    private static final long serialVersionUID = 8557250810360120203L;

    @XmlElement(required = true)
    private List<Chromatogram> chromatograms;

    @XmlAttribute(required = true)
    @XmlSchemaType(name = "nonNegativeInteger")
    private Integer count;

    @XmlAttribute(required = true)
    @XmlJavaTypeAdapter(IdRefAdapter.class)
    @XmlSchemaType(name = "IDREF")
    private String defaultDataProcessingRef;

    public void setChromatograms(List<Chromatogram> chromatograms) {
        this.chromatograms = chromatograms;
    }

    public void setDefaultDataProcessingRef(String defaultDataProcessingRef) {
        this.defaultDataProcessingRef = defaultDataProcessingRef;
    }

    /**
     * Gets the value of the chromatogram property.
     * <p/>
     * <p/>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the chromatogram property.
     * <p/>
     * <p/>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getChromatogram().add(newItem);
     * </pre>
     * <p/>
     * <p/>
     * <p/>
     * Objects of the following type(s) are allowed in the list
     * {@link Chromatogram }
     */
    public List<Chromatogram> getChromatograms() {
        if (chromatograms == null) {
            chromatograms = new ArrayList<Chromatogram>();
        }
        return this.chromatograms;
    }

    /**
     * Gets the value of the count property.
     *
     * @return possible object is
     *         {@link Integer }
     */
    public Integer getCount() {
        return count;
    }

    /**
     * Sets the value of the count property.
     *
     * @param value allowed object is
     *              {@link Integer }
     */
    public void setCount(Integer value) {
        this.count = value;
    }

    /**
     * Gets the value of the defaultDataProcessingRef property.
     *
     * @return possible object is
     *         {@link String }
     */
    public String getDefaultDataProcessingRef() {
        return defaultDataProcessingRef;
    }

}
