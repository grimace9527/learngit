
package cn.ac.dicp.group1809.utilities.mzML_reader.model;

import javax.xml.bind.annotation.*;
import java.io.Serializable;

/**
 * @author He Zhu
 * @version 1.0.0
 * @since 2020/5/18 14:00
 */

/**
 * <p>Java class for ComponentType complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="ComponentType">
 *   &lt;complexContent>
 *     &lt;extension base="{http://psi.hupo.org/ms/mzml}ParamGroupType">
 *       &lt;attribute name="order" use="required" type="{http://www.w3.org/2001/XMLSchema}int" />
 *     &lt;/extension>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "ComponentType")
@XmlSeeAlso({
    SourceComponent.class,
    DetectorComponent.class,
    AnalyzerComponent.class
})
public class Component
    extends ParamGroup
    implements Serializable
{
    private static final long serialVersionUID = 2441301782023024861L;

    @XmlAttribute(required = true)
    protected int order;

    /**
     * Gets the value of the order property.
     * 
     */
    public int getOrder() {
        return order;
    }

    /**
     * Sets the value of the order property.
     * 
     */
    public void setOrder(int value) {
        this.order = value;
    }

}
