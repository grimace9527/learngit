package cn.ac.dicp.group1809.utilities.mzML_reader.model;

/**
 * @author He Zhu
 * @version 1.0.0
 * @since 2020/5/18 10:36
 */

import cn.ac.dicp.group1809.utilities.mzML_reader.jaxb.adapters.IdRefAdapter;

import javax.xml.bind.annotation.*;
import javax.xml.bind.annotation.adapters.XmlJavaTypeAdapter;
import java.io.Serializable;


/**
 * Scan or acquisition from original raw file used to create this peak list, as specified in sourceFile.
 *
 * <p>Java class for ScanType complex type.
 *
 * <p>The following schema fragment specifies the expected content contained within this class.
 *
 * <pre>
 * &lt;complexType name="ScanType">
 *   &lt;complexContent>
 *     &lt;extension base="{http://psi.hupo.org/ms/mzml}ParamGroupType">
 *       &lt;sequence>
 *         &lt;element name="scanWindowList" type="{http://psi.hupo.org/ms/mzml}ScanWindowListType" minOccurs="0"/>
 *       &lt;/sequence>
 *       &lt;attribute name="spectrumRef" type="{http://www.w3.org/2001/XMLSchema}string" />
 *       &lt;attribute name="sourceFileRef" type="{http://www.w3.org/2001/XMLSchema}IDREF" />
 *       &lt;attribute name="externalSpectrumID" type="{http://www.w3.org/2001/XMLSchema}string" />
 *       &lt;attribute name="instrumentConfigurationRef" type="{http://www.w3.org/2001/XMLSchema}IDREF" />
 *     &lt;/extension>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 *
 *
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "ScanType", propOrder = {
        "scanWindowList"
})
public class Scan
        extends ParamGroup
        implements Serializable
{

    private final static long serialVersionUID = 100L;
    protected ScanWindowList scanWindowList;

    @XmlAttribute
    protected String spectrumRef;

    @XmlAttribute
    @XmlJavaTypeAdapter(IdRefAdapter.class)
    @XmlSchemaType(name = "IDREF")
    protected String sourceFileRef;

    @XmlAttribute
    protected String externalSpectrumID;
    @XmlAttribute
    @XmlJavaTypeAdapter(IdRefAdapter.class)
    @XmlSchemaType(name = "IDREF")
    protected String instrumentConfigurationRef;


    /**
     * Gets the value of the scanWindowList property.
     *
     * @return
     *     possible object is
     *     {@link ScanWindowList }
     *
     */
    public ScanWindowList getScanWindowList() {
        return scanWindowList;
    }

    /**
     * Sets the value of the scanWindowList property.
     *
     * @param value
     *     allowed object is
     *     {@link ScanWindowList }
     *
     */
    public void setScanWindowList(ScanWindowList value) {
        this.scanWindowList = value;
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
     * @param value
     *     allowed object is
     *     {@link String }
     *
     */
    public void setSpectrumRef(String value) {
        this.spectrumRef = value;
    }

    /**
     * Gets the value of the sourceFileRef property.
     *
     * @return
     *     possible object is
     *     {@link String }
     *
     */
    public String getSourceFileRef() {
        return sourceFileRef;
    }

    /**
     * Sets the value of the sourceFileRef property.
     *
     * @param value
     *     allowed object is
     *     {@link String }
     *
     */
    public void setSourceFileRef(String value) {
        this.sourceFileRef = value;
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
     * @param value
     *     allowed object is
     *     {@link String }
     *
     */
    public void setExternalSpectrumID(String value) {
        this.externalSpectrumID = value;
    }

    /**
     * Gets the value of the instrumentConfigurationRef property.
     *
     * @return
     *     possible object is
     *     {@link String }
     *
     */
    public String getInstrumentConfigurationRef() {
        return instrumentConfigurationRef;
    }

    /**
     * Sets the value of the instrumentConfigurationRef property.
     *
     * @param value
     *     allowed object is
     *     {@link String }
     *
     */
    public void setInstrumentConfigurationRef(String value) {
        this.instrumentConfigurationRef = value;
    }

}
