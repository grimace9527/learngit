package cn.ac.dicp.group1809.utilities.mzML_reader.io;

import cn.ac.dicp.group1809.utilities.mzML_reader.model.*;

import javax.xml.stream.XMLStreamConstants;
import javax.xml.stream.XMLStreamException;
import javax.xml.stream.XMLStreamReader;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;

public class BinaryDataArrayListReader {

    public static BinaryDataArrayList read(XMLStreamReader reader) throws XMLStreamException {
        BinaryDataArrayList binaryDataArrayList = new BinaryDataArrayList();

        String name = reader.getLocalName();

        HashMap<String,String> attributes = GetAttributes.getAttributesMap(reader);

        binaryDataArrayList.setCount(Integer.parseInt(attributes.get(new String("count"))));

        List<BinaryDataArray> binaryDataArrays = new ArrayList<>();

        loop:
        while(reader.hasNext()){
            int nextLine = reader.next();
            switch (nextLine){
                case XMLStreamReader.START_ELEMENT:
                    String localName = reader.getLocalName();
                    if (localName.equals("binaryDataArray")){
                        BinaryDataArray binaryDataArray = readBinaryDataArray(reader);

                        binaryDataArrays.add(binaryDataArray);
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

        binaryDataArrayList.setBinaryDataArrays(binaryDataArrays);

        return binaryDataArrayList;
    }

    public static BinaryDataArray readBinaryDataArray(XMLStreamReader reader) throws XMLStreamException {
        BinaryDataArray binaryDataArray = new BinaryDataArray();

        String name = reader.getLocalName();

        HashMap<String,String> attributes = GetAttributes.getAttributesMap(reader);

        for (String key : attributes.keySet()) {
            String value = attributes.get(key);
            switch (key){
                case "arrayLength":
                    binaryDataArray.setArrayLength(Integer.parseInt(value));
                    break;
                case "dataProcessingRef":
                    binaryDataArray.setDataProcessingRef(value);
                    break;
                case "encodeLength":
                    binaryDataArray.setEncodedLength(Integer.parseInt(value));
                    break;
            }
        }

        ParamGroupReader.read(reader, binaryDataArray);

        loop:
        while(reader.hasNext()){
            int nextLine = reader.getEventType();
            switch (nextLine){
                case XMLStreamReader.START_ELEMENT:
                    String localName = reader.getLocalName();
                    switch (localName){
                        case "binary":
                            String elementText = reader.getElementText();
                            binaryDataArray.setBinary(elementText);
                    }
                    reader.next();
                    break;
                case XMLStreamConstants.END_ELEMENT:
                    localName = reader.getLocalName();
                    if (localName.equals(name)){
                        break loop;
                    }
                default:
                    reader.next();
                    break;
            }
        }


        return binaryDataArray;
    }

//    public Precision readPrecision(XMLStreamReader reader){
//        Precision precision = new Precision();
//
//
//
//        return precision;
//    }
}
