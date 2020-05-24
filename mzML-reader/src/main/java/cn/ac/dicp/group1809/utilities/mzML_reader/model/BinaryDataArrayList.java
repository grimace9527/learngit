package cn.ac.dicp.group1809.utilities.mzML_reader.model;

import javax.xml.bind.annotation.*;
import java.io.Serializable;
import java.util.ArrayList;
import java.util.List;

/**
 * @author He Zhu
 * @version 1.0.0
 * @since 2020/5/18 14:00
 */
    /**
     * List of binary data arrays.
     *
     * <p>Java class for BinaryDataArrayListType complex type.
     *
     * <p>The following schema fragment specifies the expected content contained within this class.
     *
     * <pre>
     * &lt;complexType name="BinaryDataArrayListType">
     *   &lt;complexContent>
     *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
     *       &lt;sequence>
     *         &lt;element name="binaryDataArray" type="{http://psi.hupo.org/ms/mzml}BinaryDataArrayType" maxOccurs="unbounded" minOccurs="2"/>
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
    @XmlType(name = "BinaryDataArrayListType", propOrder = {
        "binaryDataArrays"
    })
public class BinaryDataArrayList

        implements Serializable
    {
        private static final long serialVersionUID = -8264936303507101337L;

        @XmlElement(required = true)
        protected List<BinaryDataArray> binaryDataArrays;
        @XmlAttribute(required = true)
        @XmlSchemaType(name = "nonNegativeInteger")
        protected Integer count;

        public void setBinaryDataArrays(List<BinaryDataArray> binaryDataArrays) {
            this.binaryDataArrays = binaryDataArrays;
        }

        /**
         * Gets the value of the binaryDataArray property.
         *
         * <p>
         * This accessor method returns a reference to the live list,
         * not a snapshot. Therefore any modification you make to the
         * returned list will be present inside the JAXB object.
         * This is why there is not a <CODE>set</CODE> method for the binaryDataArray property.
         *
         * <p>
         * For example, to add a new item, do as follows:
         * <pre>
         *    getBinaryDataArray().add(newItem);
         * </pre>
         *
         *
         * <p>
         * Objects of the following type(s) are allowed in the list
         * {@link BinaryDataArray }
         *
         *
         */
        public List<BinaryDataArray> getBinaryDataArray() {
            if (binaryDataArrays == null) {
                binaryDataArrays = new ArrayList<BinaryDataArray>();
            }
            return this.binaryDataArrays;
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

