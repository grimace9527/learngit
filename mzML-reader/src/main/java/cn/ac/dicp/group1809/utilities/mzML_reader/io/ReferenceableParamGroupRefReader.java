package cn.ac.dicp.group1809.utilities.mzML_reader.io;

import cn.ac.dicp.group1809.utilities.mzML_reader.model.ReferenceableParamGroupRef;

import javax.xml.stream.XMLStreamReader;

public class ReferenceableParamGroupRefReader {

    public static ReferenceableParamGroupRef read(XMLStreamReader reader){
        ReferenceableParamGroupRef referenceableParamGroupRef =  new ReferenceableParamGroupRef();

        int count = reader.getAttributeCount();
        for (int i = 0; i < count; i++) {
            String name = reader.getAttributeLocalName(i);
            String value = reader.getAttributeValue(i);
            if ("ref".equals(name)) {
                referenceableParamGroupRef.setRef(value);
            } else {
                throw new IllegalArgumentException("Invalid Attribute Local Name in ReferenceableParamGroupRefp Section: " + name);
            }
        }

        return referenceableParamGroupRef;
    }
}
