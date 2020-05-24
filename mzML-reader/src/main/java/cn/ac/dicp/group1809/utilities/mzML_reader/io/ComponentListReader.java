package cn.ac.dicp.group1809.utilities.mzML_reader.io;

import cn.ac.dicp.group1809.utilities.mzML_reader.model.*;

import javax.xml.stream.XMLStreamConstants;
import javax.xml.stream.XMLStreamException;
import javax.xml.stream.XMLStreamReader;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;

/**
 * @author He Zhu
 * @version 1.0.0
 * @since 2020/5/24 19:02
 */
public class ComponentListReader {
    public static ComponentList read(XMLStreamReader reader) throws XMLStreamException {
        String name = reader.getLocalName();
        ComponentList componentList = new ComponentList();

        List<SourceComponent> sourceComponents = new ArrayList<>();
        List<AnalyzerComponent> analyzerComponents = new ArrayList<>();
        List<DetectorComponent> detectorComponents = new ArrayList<>();

        HashMap<String, String> attributes = GetAttributes.getAttributesMap(reader);
        componentList.setCount(Integer.parseInt(attributes.get(new String("count"))));

        reader.next();

        loop:
        while (reader.hasNext()) {
            int nextLine = reader.next();
            switch (nextLine) {
                case XMLStreamReader.START_ELEMENT:
                    String localName = reader.getLocalName();
                    if (localName.equals("source")) {
                        SourceComponent sourceComponent = new SourceComponent();
                        sourceComponent = readComponent(reader);
                        sourceComponents.add(sourceComponent);
                    }
                    break;
                case XMLStreamConstants.END_ELEMENT:
                    localName = reader.getLocalName();
                    if (localName.equals(name)) {
                        break loop;
                    }
                default:
                    break;
            }
        }
        chromatogramList.setChromatograms(chromatograms);

        return chromatogramList;
    }

    public static Component readComponent(XMLStreamReader reader){

    }
}
