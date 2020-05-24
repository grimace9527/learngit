package cn.ac.dicp.group1809.utilities.mzML_reader.io;

import cn.ac.dicp.group1809.utilities.mzML_reader.model.*;

import javax.xml.stream.XMLStreamConstants;
import javax.xml.stream.XMLStreamException;
import javax.xml.stream.XMLStreamReader;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;

public class ParamGroupReader {

    public static ParamGroup read(XMLStreamReader reader, ParamGroup paramGroup) throws XMLStreamException {
        String name = reader.getLocalName();
        List<CVParam> cvParamList = new ArrayList<>();
        List<ReferenceableParamGroupRef> referenceableParamGroupRefList = new ArrayList<>();
        List<UserParam> userParamList = new ArrayList<>();
        String localName;
        l1:
        while (reader.hasNext()) {
            int next = reader.next();
            switch (next) {
                case XMLStreamReader.START_ELEMENT:
                    localName = reader.getLocalName();
                    switch (localName) {
                        case "cvParam":
                            CVParam cvParam = CVParamParser.read(reader);
                            cvParamList.add(cvParam);
                            break;
                        case "referenceableParamGroupRef":
                            ReferenceableParamGroupRef referenceableParamGroupRef = ReferenceableParamGroupRefReader.read(reader);
                            referenceableParamGroupRefList.add(referenceableParamGroupRef);
                            break;
                        case "userParam":
                            UserParam userParam = UserParamReader.read(reader);
                            userParamList.add(userParam);
                            break;
                        default:
                            break l1;
                    }
                    break;
                case XMLStreamConstants.END_ELEMENT:
                    localName = reader.getLocalName();
                    if (localName.equals(name)) {
                        break l1;
                    }
                    break;
            }
        }

        paramGroup.setCvParamGroup(cvParamList);
        paramGroup.setReferenceableParamGroupRefGroup(referenceableParamGroupRefList);
        paramGroup.setUserParamGroup(userParamList);

        return paramGroup;
    }

    public static ParamGroup read(XMLStreamReader reader) throws XMLStreamException {
        ParamGroup paramGroup = new ParamGroup();
        read(reader, paramGroup);
        return paramGroup;
    }
}
