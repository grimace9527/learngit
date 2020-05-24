//package cn.ac.dicp.group1809.utilities.mzML_reader.io;
//
//import cn.ac.dicp.group1809.utilities.mzML_reader.model.*;
//
//import javax.xml.stream.XMLStreamConstants;
//import javax.xml.stream.XMLStreamException;
//import javax.xml.stream.XMLStreamReader;
//import java.util.ArrayList;
//import java.util.HashMap;
//import java.util.List;
//
///**
// * @author He Zhu
// * @version 1.0.0
// * @since 2020/5/18 9:49
// */
//public class InstrumentConfigurationListReader {
//    public static InstrumentConfigurationList read(XMLStreamReader reader) throws XMLStreamException {
//        InstrumentConfigurationList instrumentConfigurationList = new InstrumentConfigurationList();
//        String name = reader.getLocalName();
//
//        HashMap<String,String> attributes = GetAttributes.getAttributesMap(reader);
//        instrumentConfigurationList.setCount(Integer.parseInt(attributes.get(new String("count"))));
//
//        List<InstrumentConfiguration> instrumentConfigurations = new ArrayList<>();
//
//        reader.next();
//
//        loop:
//        while(reader.hasNext()){
//            int nextLine = reader.next();
//            switch (nextLine){
//                case XMLStreamReader.START_ELEMENT:
//                    String localName = reader.getLocalName();
//                    if (localName.equals("instrumentConfiguration")){
//                        InstrumentConfiguration instrumentConfiguration =
//                        chromatograms.add(chromatogram);
//                    }
//                    break;
//                case XMLStreamConstants.END_ELEMENT:
//                    localName = reader.getLocalName();
//                    if (localName.equals(name)){
//                        break loop;
//                    }
//                default:
//                    break;
//            }
//        }
//        chromatogramList.setChromatograms(chromatograms);
//
//        return chromatogramList;
//    }
//
//    public static InstrumentConfiguration readInstrumentConfiguration(XMLStreamReader reader) throws XMLStreamException {
//        InstrumentConfiguration instrumentConfiguration = new InstrumentConfiguration();
//
//        String name = reader.getLocalName();
//
//        HashMap<String,String> attributes = GetAttributes.getAttributesMap(reader);
//
//        for (String attributeName : attributes.keySet()){
//            String value = attributes.get(attributeName);
//            switch (attributeName){
//                case "id":
//                    instrumentConfiguration.setId(value);
//                    break;
//            }
//        }
//
//        loop:
//        while(reader.hasNext()){
//            int nextLine = reader.getEventType();
//            switch (nextLine){
//                case XMLStreamReader.START_ELEMENT:{
//                    String localName = reader.getLocalName();
//                    if (localName.equals("componentList")){
//                        Com
//                        chromatogram.setPrecursor(precursor);
//                        nextLine = reader.next();
//                        break;
//                    }else if (localName.equals("product")){
//                        Product product = ProductListReader.readProduct(reader);
//                        chromatogram.setProduct(product);
//                        nextLine = reader.next();
//                        break;
//                    }else if (localName.equals("binaryDataArrayList")){
//                        BinaryDataArrayList binaryDataArrayList = BinaryDataArrayListReader.read(reader);
//                        chromatogram.setBinaryDataArrayList(binaryDataArrayList);
//                        nextLine = reader.next();
//                        break;
//                    }}
//                case XMLStreamConstants.END_ELEMENT:
//                    String localName = reader.getLocalName();
//                    localName = reader.getLocalName();
//                    if (localName.equals(name)){
//                        break loop;
//                    }
//                    nextLine = reader.next();
//                    break;
//
//                default:
//                    nextLine = reader.next();
//                    break;
//            }
//        }
//        return chromatogram;
//    }
//}
