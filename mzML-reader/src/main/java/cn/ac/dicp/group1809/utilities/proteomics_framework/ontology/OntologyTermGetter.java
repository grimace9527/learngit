package cn.ac.dicp.group1809.utilities.proteomics_framework.ontology;

import cn.ac.dicp.group1809.utilities.proteomics_framework.ontology.model.OntologyTerm;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStream;
import java.io.InputStreamReader;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;

/**
 * @author He Zhu
 * @version 1.0.0
 * @since 2020/5/18 18:58
 */
public class OntologyTermGetter {

    public HashMap<String, OntologyTerm> getTermMap() {
        return termMap;
    }

    public void setTermMap(HashMap<String, OntologyTerm> termMap) {
        this.termMap = termMap;
    }

    public List<OntologyTerm> getTermList() {
        return termList;
    }

    public void setTermList(List<OntologyTerm> termList) {
        this.termList = termList;
    }

    private HashMap<String,OntologyTerm> termMap;
    private List<OntologyTerm> termList;

    public void read(InputStream inputStream){
        termList = new ArrayList<>();
        termMap = new HashMap<>();
        try {
            InputStreamReader inputStreamReader = new InputStreamReader(inputStream);
            BufferedReader bufferedReader = new BufferedReader(inputStreamReader);
            String line;
            while((line=bufferedReader.readLine())!=null){

                if (line.equals("[Term]")){
                    OntologyTerm ontologyTerm = new OntologyTerm();
                    String newLine;
                    HashMap<String, List<String>> attributeMap =  new HashMap<>();
                    while ((newLine=bufferedReader.readLine())!=null && !newLine.equals("")){
                        int colonIndex = newLine.indexOf(":");
                        String term = newLine.substring(0,colonIndex);
                        String value = newLine.substring(colonIndex+2);
                        switch (term){
                            case "id":
                                ontologyTerm.setId(value);
                                break;
                            case "name":
                                ontologyTerm.setName(value);
                                break;
                            case "def":
                                ontologyTerm.setDef(value);
                                break;
                            case "namespace":
                                ontologyTerm.setNameSpace(value);
                                break;
                            default:
                                attributeMap = ontologyTerm.getAttributeMap();
                                List<String> attributeList = attributeMap.getOrDefault(term,new ArrayList<>());
                                attributeList.add(value);
                                attributeMap.put(term,attributeList);
                                break;
                        }

                    }

                    termList.add(ontologyTerm);
                    termMap.put(ontologyTerm.getId(),ontologyTerm);
                }
            }
            bufferedReader.close();
            inputStreamReader.close();
        }catch (IOException e){

        }

    }

}
