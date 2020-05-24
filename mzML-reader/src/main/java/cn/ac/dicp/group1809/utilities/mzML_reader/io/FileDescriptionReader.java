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
 * @since 2020/5/18 9:47
 */
public class FileDescriptionReader {

    public static FileDescription read(XMLStreamReader reader) throws XMLStreamException {
        FileDescription fileDescription = new FileDescription();
        String name = reader.getLocalName();

        List<ParamGroup> contacts = new ArrayList<>();

        loop:
        while(reader.hasNext()){
            int nextLine = reader.next();
            switch (nextLine){
                case XMLStreamReader.START_ELEMENT:
                    String localName = reader.getLocalName();
                    if (localName.equals("fileContent")){
                        ParamGroup fileContent = ParamGroupReader.read(reader);
                        reader.next();
                        fileDescription.setFileContent(fileContent);
                        break;
                    }else if (localName.equals("sourceFileList")){
                        SourceFileList sourceFileList = SourceFileListReader.read(reader);
                        reader.next();
                        fileDescription.setSourceFileList(sourceFileList);
                        break;
                    }else if (localName.equals("contact")){
                        ParamGroup contact = ParamGroupReader.read(reader);
                        contacts.add(contact);
                        fileDescription.setContact(contacts);
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

        fileDescription.setContact(contacts);
        return fileDescription;
    }

}
