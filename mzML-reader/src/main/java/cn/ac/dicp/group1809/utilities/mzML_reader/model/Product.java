package cn.ac.dicp.group1809.utilities.mzML_reader.model;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;
import java.io.Serializable;

/**
 * @author He Zhu
 * @version 1.0.0
 * @since 2020/5/19 10:24
 */

/**
 * The method of product ion selection and activation in a precursor ion scan
 *
 * <p>Java class for ProductType complex type.
 *
 * <p>The following schema fragment specifies the expected content contained within this class.
 *
 * <pre>
 * &lt;complexType name="ProductType">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="isolationWindow" type="{http://psi.hupo.org/ms/mzml}ParamGroupType" minOccurs="0"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 *
 *
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "ProductType", propOrder = {
        "isolationWindow"
})
public class Product implements Serializable {
    private static final long serialVersionUID = 1301791035145748877L;

    @XmlElement
    private ParamGroup isolationWindow;

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
}
