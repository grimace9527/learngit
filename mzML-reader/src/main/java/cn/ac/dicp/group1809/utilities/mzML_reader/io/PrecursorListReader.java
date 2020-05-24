package cn.ac.dicp.group1809.utilities.mzML_reader.io;

import cn.ac.dicp.group1809.utilities.mzML_reader.model.*;

import javax.xml.stream.XMLStreamConstants;
import javax.xml.stream.XMLStreamException;
import javax.xml.stream.XMLStreamReader;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;

public class PrecursorListReader {

    public static PrecursorList read(XMLStreamReader reader) throws XMLStreamException {
        PrecursorList precursorList = new PrecursorList();
        String name = reader.getLocalName();

        HashMap<String,String> attributes = GetAttributes.getAttributesMap(reader);

        precursorList.setCount(Integer.parseInt(attributes.get(new String("count"))));

        List<Precursor> precursors = new ArrayList<>();

        loop:
        while(reader.hasNext()){
            int nextLine = reader.next();
            switch (nextLine){
                case XMLStreamReader.START_DOCUMENT:
                    String localName = reader.getLocalName();
                    if (localName.equals("precursor")){
                        Precursor precursor = PrecursorListReader.readPrecursor(reader);
                        precursors.add(precursor);
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
        precursorList.setPrecursors(precursors);

        return precursorList;
    }

    public static Precursor readPrecursor(XMLStreamReader reader) throws XMLStreamException {
        Precursor precursor = new Precursor();

        String name = reader.getLocalName();

        loop:
        while(reader.hasNext()){
            int nextLine = reader.getEventType();
            switch (nextLine){
                case XMLStreamReader.START_ELEMENT:
                    String localName = reader.getLocalName();
                    if (localName.equals("isolationWindow")){
                        ParamGroup isolationWindow = ParamGroupReader.read(reader);
                        precursor.setIsolationWindow(isolationWindow);
                        reader.next();
                        break;
                    }else if (localName.equals("selectedIonLlist")){
                        SelectedIonList selectedIonList = SelectedIonListReader.read(reader);
                        precursor.setSelectedIonList(selectedIonList);
                        reader.next();
                        break;
                    }else if (localName.equals("activation")){
                        ParamGroup activation = ParamGroupReader.read(reader);
                        precursor.setActivation(activation);
                        reader.next();
                        break;
                    }
                    reader.next();
                    break;
                case XMLStreamConstants.END_ELEMENT:
                    localName = reader.getLocalName();
                    if (localName.equals(name)){
                        break loop;
                    }
                    reader.next();
                    break;
                default:
                    reader.next();
                    break;
            }
        }

        return precursor;
    }
}
