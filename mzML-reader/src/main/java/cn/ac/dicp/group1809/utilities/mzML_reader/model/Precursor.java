package cn.ac.dicp.group1809.utilities.mzML_reader.model;

/**
 * @author He Zhu
 * @version 1.0.0
 * @since 2020/5/19 13:56
 */

import cn.ac.dicp.group1809.utilities.mzML_reader.jaxb.adapters.IdRefAdapter;

import javax.xml.bind.annotation.*;
import javax.xml.bind.annotation.adapters.XmlJavaTypeAdapter;

/**
 * The method of precursor ion selection and activation
 *
 * <p>Java class for PrecursorType complex type.
 *
 * <p>The following schema fragment specifies the expected content contained within this class.
 *
 * <pre>
 * &lt;complexType name="PrecursorType">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="isolationWindow" type="{http://psi.hupo.org/ms/mzml}ParamGroupType" minOccurs="0"/>
 *         &lt;element name="selectedIonList" type="{http://psi.hupo.org/ms/mzml}SelectedIonListType" minOccurs="0"/>
 *         &lt;element name="activation" type="{http://psi.hupo.org/ms/mzml}ParamGroupType"/>
 *       &lt;/sequence>
 *       &lt;attribute name="spectrumRef" type="{http://www.w3.org/2001/XMLSchema}string" />
 *       &lt;attribute name="sourceFileRef" type="{http://www.w3.org/2001/XMLSchema}IDREF" />
 *       &lt;attribute name="externalSpectrumID" type="{http://www.w3.org/2001/XMLSchema}string" />
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 *
 *
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "PrecursorType", propOrder = {
        "isolationWindow",
        "selectedIonList",
        "activation"
})

public class Precursor {

    private ParamGroup isolationWindow;

    @XmlElement(required = true)
    private ParamGroup activation;

    private SelectedIonList selectedIonList;

    @XmlAttribute
    private String spectrumRef;

    @XmlAttribute
    @XmlJavaTypeAdapter(IdRefAdapter.class)
    @XmlSchemaType(name = "IDREF")
    private SourceFileRef sourceFileRef;

    @XmlAttribute
    private String externalSpectrumID;

    /**
     * Gets the value of the isolationWindow property.
     *
     * @return
     *     possible object is
     *     {@link ParamGroup }
     *
     */
    public ParamGroup getIsolationWindow() {
        return isolationWindow;
    }

    /**
     * Sets the value of the isolationWindow property.
     *
     * @param isolationWindow
     *     allowed object is
     *     {@link ParamGroup }
     *
     */
    public void setIsolationWindow(ParamGroup isolationWindow) {
        this.isolationWindow = isolationWindow;
    }

    /**
     * Gets the value of the activation property.
     *
     * @return
     *     possible object is
     *     {@link ParamGroup }
     *
     */
    public ParamGroup getActivation() {
        return activation;
    }

    /**
     * Sets the value of the activation property.
     *
     * @param activation
     *     allowed object is
     *     {@link ParamGroup }
     *
     */
    public void setActivation(ParamGroup activation) {
        this.activation = activation;
    }

    /**
     * Gets the value of the selectedIonList property.
     *
     * @return
     *     possible object is
     *     {@link SelectedIonList }
     *
     */
    public SelectedIonList getSelectedIonList() {
        return selectedIonList;
    }

    /**
     * Sets the value of the selectedIonList property.
     *
     * @param selectedIonList
     *     allowed object is
     *     {@link SelectedIonList }
     *
     */
    public void setSelectedIonList(SelectedIonList selectedIonList) {
        this.selectedIonList = selectedIonList;
    }

    /**
     * Gets the value of the spectrumRef property.
     *
     * @return
     *     possible object is
     *     {@link String }
     *
     */
    public String getSpectrumRef() {
        return spectrumRef;
    }

    /**
     * Sets the value of the spectrumRef property.
     *
     * @param spectrumRef
     *     allowed object is
     *     {@link String }
     *
     */
    public void setSpectrumRef(String spectrumRef) {
        this.spectrumRef = spectrumRef;
    }

    /**
     * Gets the value of the sourceFileRef property.
     *
     * @return
     *     possible object is
     *     {@link String }
     *
     */
    public SourceFileRef getSourceFileRef() {
        return sourceFileRef;
    }

    /**
     * Sets the value of the sourceFileRef property.
     *
     * @param sourceFileRef
     *     allowed object is
     *     {@link String }
     *
     */
    public void setSourceFileRef(SourceFileRef sourceFileRef) {
        this.sourceFileRef = sourceFileRef;
    }

    /**
     * Gets the value of the externalSpectrumID property.
     *
     * @return
     *     possible object is
     *     {@link String }
     *
     */
    public String getExternalSpectrumID() {
        return externalSpectrumID;
    }

    /**
     * Sets the value of the externalSpectrumID property.
     *
     * @param externalSpectrumID
     *     allowed object is
     *     {@link String }
     *
     */
    public void setExternalSpectrumID(String externalSpectrumID) {
        this.externalSpectrumID = externalSpectrumID;
    }
}
