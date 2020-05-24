package cn.ac.dicp.group1809.utilities.mzML_reader.model;

/**
 * @author He Zhu
 * @version 1.0.0
 * @since 2020/5/18 14:00
 */

import cn.ac.dicp.group1809.utilities.mzML_reader.jaxb.adapters.IdRefAdapter;

import javax.xml.bind.annotation.*;
import javax.xml.bind.annotation.adapters.XmlJavaTypeAdapter;
import java.io.Serializable;

/**
 * The structure into which encoded binary data goes. Byte ordering is always little endian (Intel style). Computers using a different endian style must convert to/from little endian when writing/reading mzML
 * <p/>
 * <p>Java class for BinaryDataArrayType complex type.
 * <p/>
 * <p>The following schema fragment specifies the expected content contained within this class.
 * <p/>
 * <pre>
 * &lt;complexType name="BinaryDataArrayType">
 *   &lt;complexContent>
 *     &lt;extension base="{http://psi.hupo.org/ms/mzml}ParamGroupType">
 *       &lt;sequence>
 *         &lt;element name="binary" type="{http://www.w3.org/2001/XMLSchema}base64Binary"/>
 *       &lt;/sequence>
 *       &lt;attribute name="arrayLength" type="{http://www.w3.org/2001/XMLSchema}nonNegativeInteger" />
 *       &lt;attribute name="dataProcessingRef" type="{http://www.w3.org/2001/XMLSchema}IDREF" />
 *       &lt;attribute name="encodedLength" use="required" type="{http://www.w3.org/2001/XMLSchema}nonNegativeInteger" />
 *     &lt;/extension>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 */

@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "BinaryDataArrayType", propOrder = {
        "binary"
})
public class BinaryDataArray extends ParamGroup
        implements Serializable {

    private final static long serialVersionUID = 100L;
    @XmlElement(required = true)
    private String binary;

    @XmlAttribute
    @XmlSchemaType(name = "nonNegativeInteger")
    protected Integer arrayLength;
    @XmlAttribute
    @XmlJavaTypeAdapter(IdRefAdapter.class)
    @XmlSchemaType(name = "IDREF")
    protected String dataProcessingRef;

    private Integer encodedLength;

    public String getBinary() {
        return binary;
    }

    public void setBinary(String binary) {
        this.binary = binary;
    }

    public Integer getArrayLength() {
        return arrayLength;
    }

    public void setArrayLength(Integer arrayLength) {
        this.arrayLength = arrayLength;
    }

    public String getDataProcessingRef() {
        return dataProcessingRef;
    }

    public void setDataProcessingRef(String dataProcessingRef) {
        this.dataProcessingRef = dataProcessingRef;
    }

    public Integer getEncodedLength() {
        return encodedLength;
    }

    public void setEncodedLength(Integer encodedLength) {
        this.encodedLength = encodedLength;
    }


}
