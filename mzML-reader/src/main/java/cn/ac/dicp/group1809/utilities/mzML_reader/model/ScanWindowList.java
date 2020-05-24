
package cn.ac.dicp.group1809.utilities.mzML_reader.model;

import javax.xml.bind.annotation.*;
import java.io.Serializable;
import java.util.ArrayList;
import java.util.List;
/**
 * @author He Zhu
 * @version 1.0.0
 * @since 2020/5/18 10:36
 */

/**
 * <p>Java class for ScanWindowListType complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="ScanWindowListType">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="scanWindow" type="{http://psi.hupo.org/ms/mzml}ParamGroupType" maxOccurs="unbounded"/>
 *       &lt;/sequence>
 *       &lt;attribute name="count" use="required" type="{http://www.w3.org/2001/XMLSchema}int" />
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "ScanWindowListType", propOrder = {
    "scanWindow"
})
public class ScanWindowList
    implements Serializable
{
    private static final long serialVersionUID = -5989503985766014078L;

    @XmlElement(required = true)
    protected List<ParamGroup> scanWindow;
    @XmlAttribute(required = true)
    protected int count;

    /**
     * Gets the value of the scanWindow property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the scanWindow property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getScanWindow().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link ParamGroup }
     * 
     * 
     */
    public List<ParamGroup> getScanWindow() {
        if (scanWindow == null) {
            scanWindow = new ArrayList<ParamGroup>();
        }
        return this.scanWindow;
    }

    public void setScanWindow(List<ParamGroup> scanWindow) {
        this.scanWindow = scanWindow;
    }

    /**
     * Gets the value of the count property.
     * 
     */
    public int getCount() {
        return count;
    }

    /**
     * Sets the value of the count property.
     * 
     */
    public void setCount(int value) {
        this.count = value;
    }

}
