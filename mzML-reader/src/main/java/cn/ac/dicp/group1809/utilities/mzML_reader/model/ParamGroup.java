package cn.ac.dicp.group1809.utilities.mzML_reader.model;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlSeeAlso;
import javax.xml.bind.annotation.XmlType;
import java.io.Serializable;
import java.util.ArrayList;
import java.util.List;

/**
 * @author He Zhu
 * @version 1.0.0
 * @since 2020/5/19 13:53
 */

/**
 * Structure allowing the use of a controlled (cvParam) or uncontrolled vocabulary (userParam), or a reference to a predefined set of these in this mzML file (paramGroupRef).
 *
 * <p>Java class for ParamGroupType complex type.
 *
 * <p>The following schema fragment specifies the expected content contained within this class.
 *
 * <pre>
 * &lt;complexType name="ParamGroupType">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="referenceableParamGroupRef" type="{http://psi.hupo.org/ms/mzml}ReferenceableParamGroupRefType" maxOccurs="unbounded" minOccurs="0"/>
 *         &lt;element name="cvParam" type="{http://psi.hupo.org/ms/mzml}CVParamType" maxOccurs="unbounded" minOccurs="0"/>
 *         &lt;element name="userParam" type="{http://psi.hupo.org/ms/mzml}UserParamType" maxOccurs="unbounded" minOccurs="0"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 *
 *
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "ParamGroupType", propOrder = {
        "referenceableParamGroupRefGroup",
        "cvParamGroup",
        "userParamGroup"
})
@XmlSeeAlso({
        Scan.class,
        ProcessingMethod.class,
        Run.class,
        Software.class,
        SourceFile.class,
        InstrumentConfiguration.class,
        BinaryDataArray.class,
        Sample.class,
        Spectrum.class,
        Component.class,
        ScanSettings.class,
        Chromatogram.class,
        ScanList.class
})

public class ParamGroup implements Serializable {

    private static final long serialVersionUID = 2571033336832453607L;
    private List<CVParam> cvParamGroup;

    private List<UserParam> userParamGroup;

    private List<ReferenceableParamGroupRef> referenceableParamGroupRefGroup;

    /**
     * Gets the value of the cvParam property.
     *
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the cvParam property.
     *
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getCvParam().add(newItem);
     * </pre>
     *
     *
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link CVParam }
     *
     *
     */
    public List<CVParam> getCvParamGroup() {
        if (cvParamGroup == null){
            cvParamGroup = new ArrayList<CVParam>();
        }

        return cvParamGroup;
    }

    public void setCvParamGroup(List<CVParam> cvParamGroup) {
        this.cvParamGroup = cvParamGroup;
    }

    /**
     * Gets the value of the userParam property.
     *
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the userParam property.
     *
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getUserParam().add(newItem);
     * </pre>
     *
     *
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link UserParam }
     *
     *
     */
    public List<UserParam> getUserParamGroup() {
        if (userParamGroup == null){
            userParamGroup = new ArrayList<UserParam>();
        }
        return userParamGroup;
    }

    public void setUserParamGroup(List<UserParam> userParamGroup) {
        this.userParamGroup = userParamGroup;
    }
    /**
     * Gets the value of the referenceableParamGroupRef property.
     *
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the referenceableParamGroupRef property.
     *
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getReferenceableParamGroupRef().add(newItem);
     * </pre>
     *
     *
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link ReferenceableParamGroupRef }
     *
     *
     */
    public List<ReferenceableParamGroupRef> getReferenceableParamGroupRefGroup() {
        if (referenceableParamGroupRefGroup == null){
            referenceableParamGroupRefGroup = new ArrayList<ReferenceableParamGroupRef>();
        }
        return referenceableParamGroupRefGroup;
    }

    public void setReferenceableParamGroupRefGroup(List<ReferenceableParamGroupRef> referenceableParamGroupRefGroup) {
        this.referenceableParamGroupRefGroup = referenceableParamGroupRefGroup;
    }
}
