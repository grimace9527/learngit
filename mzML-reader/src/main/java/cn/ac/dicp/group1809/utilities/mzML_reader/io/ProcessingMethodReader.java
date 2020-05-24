package cn.ac.dicp.group1809.utilities.mzML_reader.io;

import cn.ac.dicp.group1809.utilities.mzML_reader.model.ProcessingMethod;

import javax.xml.stream.XMLStreamException;
import javax.xml.stream.XMLStreamReader;
import java.util.HashMap;

/**
 * @author He Zhu
 * @version 1.0.0
 * @since 2020/5/23 18:54
 */
public class ProcessingMethodReader {

    public static ProcessingMethod readProcessingMethod(XMLStreamReader reader) throws XMLStreamException {
        ProcessingMethod processingMethod = new ProcessingMethod();
        HashMap<String, String> map = GetAttributes.getAttributesMap(reader);
        for (String key : map.keySet()) {
            String value = map.get(key);
            switch (key) {
                case "softwareRef":
                    processingMethod.setSoftwareRef(value);
                    break;
                case "order":
                    processingMethod.setOrder(Integer.valueOf(value));
                    break;
                default:
                    throw new IllegalArgumentException("Invalid Attribute Local Name in ProcessingMethod Section: " + key);
            }
        }
        ParamGroupReader.read(reader, processingMethod);
        return processingMethod;
    }
}
