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
 * @since 2020/5/23 21:13
 */
public class SourceFileListReader {

    public static SourceFileList read(XMLStreamReader reader) throws XMLStreamException {
        SourceFileList sourceFileList = new SourceFileList();
        String name = reader.getLocalName();

        HashMap<String,String> attributes = GetAttributes.getAttributesMap(reader);
        sourceFileList.setCount(Integer.parseInt(attributes.get(new String("count"))));

        List<SourceFile> sourceFiles = new ArrayList<>();

        reader.next();

        loop:
        while(reader.hasNext()){
            int nextLine = reader.next();
            switch (nextLine){
                case XMLStreamReader.START_ELEMENT:
                    String localName = reader.getLocalName();
                    if (localName.equals("sourceFile")){
                        SourceFile sourceFile = SourceFileListReader.readSourceFile(reader);
                        sourceFiles.add(sourceFile);
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
        sourceFileList.setSourceFiles(sourceFiles);
        return sourceFileList;
    }

    public static SourceFile readSourceFile(XMLStreamReader reader) throws XMLStreamException {
        SourceFile sourceFile = new SourceFile();

        String name = reader.getLocalName();

        HashMap<String,String> attributes = GetAttributes.getAttributesMap(reader);

        for (String attributeName : attributes.keySet()){
            String value = attributes.get(attributeName);
            switch (attributeName){
                case "id":
                    sourceFile.setId(value);
                    break;
                case "name":
                    sourceFile.setName(value);
                    break;
                case "location":
                    sourceFile.setLocation(value);
                    break;
            }
        }

        ParamGroupReader.read(reader,sourceFile);

        return sourceFile;
    }
}
