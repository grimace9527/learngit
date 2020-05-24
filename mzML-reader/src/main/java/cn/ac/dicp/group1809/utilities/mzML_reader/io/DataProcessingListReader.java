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
 * @since 2020/5/18 9:49
 */
public class DataProcessingListReader {

    public static DataProcessingList read(XMLStreamReader reader) throws XMLStreamException {
        DataProcessingList dataProcessingList = new DataProcessingList();
        String name = reader.getLocalName();

        HashMap<String,String> attributes = GetAttributes.getAttributesMap(reader);
        dataProcessingList.setCount(Integer.parseInt(attributes.get(new String("count"))));

        List<DataProcessing> dataProcessings = new ArrayList<>();

        loop:
        while(reader.hasNext()){
            int nextLine = reader.next();
            switch (nextLine){
                case XMLStreamReader.START_ELEMENT:
                    String localName = reader.getLocalName();
                    if (localName.equals("dataProcessing")){
                        DataProcessing dataProcessing = DataProcessingListReader.readDataProcessing(reader);
                        dataProcessings.add(dataProcessing);
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
        dataProcessingList.setDataProcessing(dataProcessings);

        return dataProcessingList;
    }

    public static DataProcessing readDataProcessing(XMLStreamReader reader) throws XMLStreamException {
        DataProcessing dataProcessing = new DataProcessing();

        String name = reader.getLocalName();

        HashMap<String,String> attributes = GetAttributes.getAttributesMap(reader);
        dataProcessing.setId(attributes.get(new String("id")));

        List<ProcessingMethod> processingMethods = new ArrayList<>();

        loop:
        while(reader.hasNext()){
            int nextLine = reader.getEventType();
            switch (nextLine){
                case XMLStreamReader.START_ELEMENT:{
                    String localName = reader.getLocalName();
                    if (localName.equals("processingMethod")){
                        ProcessingMethod processingMethod = ProcessingMethodReader.readProcessingMethod(reader);
                        processingMethods.add(processingMethod);
                        reader.next();
                        break;
                    }
                    reader.next();
                    break;
                }
                case XMLStreamConstants.END_ELEMENT:
                    String localName = reader.getLocalName();
                    localName = reader.getLocalName();
                    if (localName.equals(name)){
                        break loop;
                    }
                    nextLine = reader.next();
                    break;

                default:
                    nextLine = reader.next();
                    break;
            }
        }
        dataProcessing.setProcessingMethod(processingMethods);
        return dataProcessing;
    }

}
