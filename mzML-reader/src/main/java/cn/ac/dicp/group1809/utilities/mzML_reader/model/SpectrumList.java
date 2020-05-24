package cn.ac.dicp.group1809.utilities.mzML_reader.model;

/**
 * @author He Zhu
 * @version 1.0.0
 * @since 2020/5/18 13:59
 */
import cn.ac.dicp.group1809.utilities.mzML_reader.jaxb.adapters.IdRefAdapter;

import javax.xml.bind.annotation.*;
import javax.xml.bind.annotation.adapters.XmlJavaTypeAdapter;
import java.io.Serializable;
import java.util.ArrayList;
import java.util.List;

/**
 * List and descriptions of spectra.
 * <p/>
 * <p>Java class for SpectrumListType complex type.
 * <p/>
 * <p>The following schema fragment specifies the expected content contained within this class.
 * <p/>
 * <pre>
 * &lt;complexType name="SpectrumListType">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="spectrum" type="{http://psi.hupo.org/ms/mzml}SpectrumType" maxOccurs="unbounded" minOccurs="0"/>
 *       &lt;/sequence>
 *       &lt;attribute name="count" use="required" type="{http://www.w3.org/2001/XMLSchema}nonNegativeInteger" />
 *       &lt;attribute name="defaultDataProcessingRef" use="required" type="{http://www.w3.org/2001/XMLSchema}IDREF" />
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "SpectrumListType", propOrder = {
        "spectrums"
})
public class SpectrumList
        implements Serializable {

    private static final long serialVersionUID = 7513317634913192004L;

    protected List<Spectrum> spectrums;
    @XmlAttribute(required = true)
    @XmlSchemaType(name = "nonNegativeInteger")
    protected Integer count;
    @XmlAttribute(required = true)
    @XmlJavaTypeAdapter(IdRefAdapter.class)
    @XmlSchemaType(name = "IDREF")
    protected String defaultDataProcessingRef;

    /**
     * Gets the value of the spectrum property.
     * <p/>
     * <p/>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the spectrum property.
     * <p/>
     * <p/>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getSpectrum().add(newItem);
     * </pre>
     * <p/>
     * <p/>
     * <p/>
     * Objects of the following type(s) are allowed in the list
     * {@link Spectrum }
     */
    public List<Spectrum> getSpectrums() {
        if (spectrums == null) {
            spectrums = new ArrayList<Spectrum>();
        }
        return this.spectrums;
    }

    public void setSpectrums(List<Spectrum> spectrums) {
        this.spectrums = spectrums;
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

    /**
     * Sets the value of the defaultDataProcessingRef property.
     *
     * @param value allowed object is
     *              {@link String }
     */
    public void setDefaultDataProcessingRef(String value) {
        this.defaultDataProcessingRef = value;
    }
}