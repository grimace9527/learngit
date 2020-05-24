package cn.ac.dicp.group1809.utilities.mzML_reader.io;

import cn.ac.dicp.group1809.utilities.mzML_reader.model.CVParam;
import cn.ac.dicp.group1809.utilities.mzML_reader.model.UserParam;

import javax.xml.stream.XMLStreamException;
import javax.xml.stream.XMLStreamReader;

public class UserParamReader {

    public static UserParam read(XMLStreamReader reader) throws XMLStreamException {
        UserParam userParam = new UserParam();

        int attributeCount = reader.getAttributeCount();
        for (int i = 0; i < attributeCount; i++) {
            String attributeLocalName = reader.getAttributeLocalName(i);
            String attributeValue = reader.getAttributeValue(i);
            switch (attributeLocalName) {
                case "type":
                    userParam.setType(attributeValue);
                    break;
                case "name":
                    userParam.setName(attributeValue);
                    break;
                case "value":
                    userParam.setValue(attributeValue);
                    break;
                case "unitCvRef":
                    userParam.setUnitCvRef(attributeValue);
                    break;
                case "unitAccession":
                    userParam.setUnitAccession(attributeValue);
                    break;
                case "unitName":
                    userParam.setUnitName(attributeValue);
                    break;
                default:
                    throw new IllegalArgumentException("Invalid Attribute Local Name in CV Param: " + attributeLocalName);
            }
        }

        return userParam;
    }
}
