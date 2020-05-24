package cn.ac.dicp.group1809.utilities.mzML_reader.io;

import cn.ac.dicp.group1809.utilities.mzML_reader.model.*;

import javax.xml.stream.XMLStreamConstants;
import javax.xml.stream.XMLStreamException;
import javax.xml.stream.XMLStreamReader;
import javax.xml.stream.events.StartElement;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;

/**
 * @author He Zhu
 * @version 1.0.0
 * @since 2020/5/18 14:01
 */
public class ChromatogramListReader {

    public static ChromatogramList read(XMLStreamReader reader) throws XMLStreamException {
        ChromatogramList chromatogramList = new ChromatogramList();
        String name = reader.getLocalName();

        HashMap<String,String> attributes = GetAttributes.getAttributesMap(reader);
        chromatogramList.setCount(Integer.parseInt(attributes.get(new String("count"))));

        String defaultDataProcessingRef = attributes.get("defaultDataProcessingRef");
        chromatogramList.setDefaultDataProcessingRef(defaultDataProcessingRef);

        List<Chromatogram> chromatograms = new ArrayList<>();


        loop:
        while(reader.hasNext()){
            int nextLine = reader.next();
            switch (nextLine){
                case XMLStreamReader.START_ELEMENT:
                    String localName = reader.getLocalName();
                    if (localName.equals("chromatogram")){
                        Chromatogram chromatogram = ChromatogramListReader.readChromatogram(reader);
                        chromatograms.add(chromatogram);
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
        chromatogramList.setChromatograms(chromatograms);

        return chromatogramList;
    }

    public static Chromatogram readChromatogram(XMLStreamReader reader) throws XMLStreamException {
        Chromatogram chromatogram = new Chromatogram();

        String name = reader.getLocalName();


        HashMap<String,String> attributes = GetAttributes.getAttributesMap(reader);

        for (String attributeName : attributes.keySet()){
            String value = attributes.get(attributeName);
            switch (attributeName){
                case "id":
                    chromatogram.setId(value);
                    break;
                case "index":
                    chromatogram.setIndex(Integer.parseInt(value));
                    break;
                case "defaultArrayLength":
                    chromatogram.setDefaultArrayLength(Integer.parseInt(value));
                    break;
                case "dataProcessingRef":
                    chromatogram.setDataProcessingRef(value);
                    break;
            }
        }


        ParamGroupReader.read(reader,chromatogram);
//        ParamGroupReader.read(reader, chromatogram);


        loop:
        while(reader.hasNext()){
            int nextLine = reader.getEventType();
            switch (nextLine){

                case XMLStreamReader.START_ELEMENT:{
                    String localName = reader.getLocalName();
                    if (localName.equals("precursor")){
                        Precursor precursor = PrecursorListReader.readPrecursor(reader);
                        chromatogram.setPrecursor(precursor);
                        nextLine = reader.next();
                        break;
                    }else if (localName.equals("product")){
                        Product product = ProductListReader.readProduct(reader);
                        chromatogram.setProduct(product);
                        nextLine = reader.next();
                        break;
                    }else if (localName.equals("binaryDataArrayList")){
                        BinaryDataArrayList binaryDataArrayList = BinaryDataArrayListReader.read(reader);
                        chromatogram.setBinaryDataArrayList(binaryDataArrayList);
                        nextLine = reader.next();
                        break;
                    }}
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
        return chromatogram;
    }
}

/**
 * 读Attribute和普通文本的方法不一样：
 * 前者使用
 *      HashMap<String, String> map = new HashMap<>();
 * 		int count = reader.getAttributeCount();
 * 		for (int i = 0; i < count; i++) {
 * 			String name = reader.getAttributeLocalName(i);
 * 			String value = reader.getAttributeValue(i);
 * 			map.put(name, value);
 *       }
 * 后者使用
 *      while (!binaryDataArraySwi(binaryDataArray, name, reader)) {
 * 			reader.next();
 *      }
 *      private static boolean binaryDataArraySwi(BinaryDataArray binaryDataArray, String name, XMLStreamReader reader) throws XMLStreamException {
 * 		    String localName;
 * 		    if (reader.isStartElement()) {
 * 			    localName = reader.getLocalName();
 * 			    if ("binary".equals(localName)) {
 * 				    String elementText = reader.getElementText();
 * 				    binaryDataArray.setBinary(elementText);
 *              } else {
 * 				    throw new IllegalArgumentException("Invalid Local Name in Spectrum Section: " + localName);
 *           	} else if (reader.isEndElement()) {
 * 			        localName = reader.getLocalName();
 * 			        return localName.equals(name);
 * 		        }
 * 		return false;
 * 	}
 */