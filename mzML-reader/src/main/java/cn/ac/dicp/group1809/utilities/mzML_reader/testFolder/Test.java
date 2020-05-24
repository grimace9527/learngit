package cn.ac.dicp.group1809.utilities.mzML_reader.testFolder;

import cn.ac.dicp.group1809.utilities.mzML_reader.io.*;
import cn.ac.dicp.group1809.utilities.mzML_reader.model.*;
import cn.ac.dicp.group1809.utilities.proteomics_framework.ontology.MSCV;
import org.apache.commons.io.FilenameUtils;

import javax.xml.stream.XMLInputFactory;
import javax.xml.stream.XMLStreamReader;
import java.io.File;
import java.io.FileInputStream;

public class Test {

    public static void main(String[] args) throws Exception {
        String path = "D:\\reader2\\mzML-reader\\src\\main\\java\\cn\\ac\\dicp\\group1809\\utilities\\mzML_reader\\testFolder\\Test2.xml";
        String extension = FilenameUtils.getExtension(path);

        FileInputStream inputStream = new FileInputStream(new File(path));
        XMLInputFactory factory = XMLInputFactory.newInstance();
        XMLStreamReader reader = factory.createXMLStreamReader(inputStream);

        reader.next();

        FileDescription fileDescription = FileDescriptionReader.read(reader);
        System.out.println();

    }

}
