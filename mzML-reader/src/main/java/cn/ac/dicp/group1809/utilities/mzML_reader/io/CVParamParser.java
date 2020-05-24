package cn.ac.dicp.group1809.utilities.mzML_reader.io;

import cn.ac.dicp.group1809.utilities.mzML_reader.model.CVParam;
import cn.ac.dicp.group1809.utilities.proteomics_framework.ontology.model.OntologyTerm;

import javax.xml.stream.XMLStreamException;
import javax.xml.stream.XMLStreamReader;

/**
 * @author He Zhu
 * @version 1.0.0
 * @since 2020/5/18 16:18
 */
public class CVParamParser {
    public static CVParam read(String cvRef,
                               String accession,
                               String value,
                               String name,
                               String unitAccession,
                               String unitName,
                               String unitCvRef){
        CVParam cvParam = new CVParam();
        cvParam.setAccession(accession);
        cvParam.setCvRef(cvRef);
        cvParam.setName(name);
        cvParam.setUnitAccession(unitAccession);
        cvParam.setValue(value);
        cvParam.setUnitCvRef(unitCvRef);
        cvParam.setUnitName(unitName);
        return cvParam;
    }

    public static CVParam read(XMLStreamReader reader) throws XMLStreamException {
        CVParam cvParam = new CVParam();

        int attributeCount = reader.getAttributeCount();

        for (int i = 0; i < attributeCount; i++) {
            String attributeLocalName = reader.getAttributeLocalName(i);
            String attributeValue = reader.getAttributeValue(i);
            switch (attributeLocalName) {
                case "cvRef":
                    cvParam.setCvRef(attributeValue);
                    break;
                case "accession":
                    cvParam.setAccession(attributeValue);
                    break;
                case "name":
                    cvParam.setName(attributeValue);
                    break;
                case "value":
                    cvParam.setValue(attributeValue);
                    break;
                case "unitCvRef":
                    cvParam.setUnitCvRef(attributeValue);
                    break;
                case "unitAccession":
                    cvParam.setUnitAccession(attributeValue);
                    break;
                case "unitName":
                    cvParam.setUnitName(attributeValue);
                    break;
                default:
                    throw new IllegalArgumentException("Invalid Attribute Local Name in CV Param: " + attributeLocalName);
            }
        }

        return cvParam;
    }

    public static CVParam getParam(String cvRef, OntologyTerm ontologyTerm){

        CVParam cvParam = new CVParam();
        cvParam.setCvRef(cvRef);
        cvParam.setAccession(ontologyTerm.getId());
        cvParam.setName(ontologyTerm.getName());
        cvParam.setValue("");
        return cvParam;
    }

    public static CVParam getParam(String cvRef, OntologyTerm ontologyTerm, String unitRef, OntologyTerm unitOntologyTerm, String value){
        CVParam cvParam = new CVParam();
        cvParam.setCvRef(cvRef);
        cvParam.setAccession(ontologyTerm.getId());
        cvParam.setName(ontologyTerm.getName());
        cvParam.setValue("");
        cvParam.setUnitCvRef(unitRef);
        cvParam.setUnitAccession(unitOntologyTerm.getId());
        cvParam.setName(unitOntologyTerm.getName());
        return cvParam;
    }

}
