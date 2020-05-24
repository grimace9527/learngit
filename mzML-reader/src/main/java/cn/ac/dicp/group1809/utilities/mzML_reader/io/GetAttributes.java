package cn.ac.dicp.group1809.utilities.mzML_reader.io;

import javax.xml.stream.XMLStreamReader;
import java.util.HashMap;

public class GetAttributes {
    public static HashMap<String, String> getAttributesMap(XMLStreamReader reader){
        HashMap<String, String> attributesMap = new HashMap<String, String>();
        int attributesCount = reader.getAttributeCount();
        for (int i = 0; i < attributesCount; i++){
            String attributeName = reader.getAttributeLocalName(i);
            String attributeValue = reader.getAttributeValue(i);
            attributesMap.put(attributeName, attributeValue);
        }
        return attributesMap;
    }
}
