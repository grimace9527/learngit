package cn.ac.dicp.group1809.utilities.mzML_reader.io;

import cn.ac.dicp.group1809.utilities.mzML_reader.model.CV;

import javax.xml.stream.XMLStreamException;
import javax.xml.stream.XMLStreamReader;
import java.util.HashMap;

/**
 * @author He Zhu
 * @version 1.0.0
 * @since 2020/5/18 14:02
 */
public class CVReader {
    public static CV readCV(XMLStreamReader reader) throws XMLStreamException {
        CV cv = new CV();

        String name = reader.getLocalName();

        HashMap<String,String> attributes = GetAttributes.getAttributesMap(reader);

        for (String attributeName : attributes.keySet()){
            String value = attributes.get(attributeName);
            switch (attributeName){
                case "id":
                    cv.setId(value);
                    break;
                case "fullName":
                    cv.setFullName(value);
                    break;
                case "version":
                    cv.setVersion(value);
                    break;
                case "URI":
                    cv.setURI(value);
                    break;
            }
        }

        return cv;
    }
}
