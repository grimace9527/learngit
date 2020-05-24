package cn.ac.dicp.group1809.utilities.mzML_reader.io;

import cn.ac.dicp.group1809.utilities.mzML_reader.model.*;

import javax.xml.stream.XMLStreamConstants;
import javax.xml.stream.XMLStreamException;
import javax.xml.stream.XMLStreamReader;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;

public class ProductListReader {

    public static ProductList read(XMLStreamReader reader) throws XMLStreamException {
        ProductList productList = new ProductList();

        String name = reader.getLocalName();

        HashMap<String,String> attributes = GetAttributes.getAttributesMap(reader);

        productList.setCount(Integer.parseInt(attributes.get(new String("count"))));

        List<Product> products = new ArrayList<>();

        loop:
        while(reader.hasNext()){
            int nextLine = reader.next();
            switch (nextLine){
                case XMLStreamReader.START_DOCUMENT:
                    String localName = reader.getLocalName();
                    if (localName.equals("product")){
                        Product product = ProductListReader.readProduct(reader);
                        products.add(product);
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
        productList.setProducts(products);

        return productList;
    }

    public static Product readProduct(XMLStreamReader reader) throws XMLStreamException {
        Product product = new Product();

        String name = reader.getLocalName();

        HashMap<String,String> attributes = GetAttributes.getAttributesMap(reader);

        loop:
        while(reader.hasNext()){
            int nextLine = reader.getEventType();
            switch (nextLine){
                case XMLStreamReader.START_ELEMENT:{
                    String localName = reader.getLocalName();
                    if (localName.equals("isolationWindow")){
                        ParamGroup isolationWindow = ParamGroupReader.read(reader);
                        product.setIsolationWindow(isolationWindow);
                        nextLine = reader.next();
                        break;
                    }}
                    /*switch (localName){
                        case "isolationWindow":
                            ParamGroup isolationWindow = ParamGroupReader.read(reader);
                            product.setIsolationWindow(isolationWindow);
                            nextLine = reader.next();
                            break;
                    }*/
                case XMLStreamConstants.END_ELEMENT:
                    String localName = reader.getLocalName();
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

        return product;
    }

}
