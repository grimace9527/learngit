package cn.ac.dicp.group1809.utilities.mzML_reader.io;

import cn.ac.dicp.group1809.utilities.mzML_reader.model.ParamGroup;
import cn.ac.dicp.group1809.utilities.mzML_reader.model.SelectedIonList;

import javax.xml.stream.XMLStreamConstants;
import javax.xml.stream.XMLStreamException;
import javax.xml.stream.XMLStreamReader;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;

public class SelectedIonListReader {

    public static SelectedIonList read(XMLStreamReader reader) throws XMLStreamException {
        SelectedIonList selectedIonList = new SelectedIonList();

        String name = reader.getLocalName();

        HashMap<String, String> map = GetAttributes.getAttributesMap(reader);
        for (String key : map.keySet()) {
            String value = map.get(key);
            if ("count".equals(key)) {
                selectedIonList.setCount(Integer.valueOf(value));
            }
        }

        List<ParamGroup> selectedIons = new ArrayList<>();

        loop:
        while(reader.hasNext()){
            int nextLine = reader.next();
            switch (nextLine){
                case XMLStreamReader.START_DOCUMENT:
                    String localName = reader.getLocalName();
                    switch (localName){
                        case "selectedIon":
                            ParamGroup selectedIon = ParamGroupReader.read(reader);
                            selectedIons.add(selectedIon);
                    }
                    break;
                case XMLStreamConstants.END_ELEMENT:
                    localName = reader.getLocalName();
                    if (localName.equals(name)){
                        break loop;
                    }
                default:
                    break;
            }
        }

        return selectedIonList;
    }
}
