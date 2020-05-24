package cn.ac.dicp.group1809.utilities.proteomics_framework.ontology.model;

/**
 * @author He Zhu
 * @version 1.0.0
 * @since 2020/5/18 16:44
 */

import java.util.HashMap;
import java.util.List;

public class OntologyTerm implements Comparable<OntologyTerm> {
    private String id;
    private String name;
    private String nameSpace;
    private String def;
    private HashMap<String, List<String>> attributeMap;

    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getNameSpace() {
        return nameSpace;
    }

    public void setNameSpace(String nameSpace) {
        this.nameSpace = nameSpace;
    }

    public String getDef() {
        return def;
    }

    public void setDef(String ref) {
        this.def = ref;
    }

    public HashMap<String, List<String>> getAttributeMap() {
        if (this.attributeMap == null) {
            this.attributeMap = new HashMap<>();
        }
        return attributeMap;
    }

    public void setAttributeMap(HashMap<String, List<String>> attributeMap) {
        this.attributeMap = attributeMap;
    }

    @Override
    public int hashCode() {
        return this.getNameSpace().hashCode();
    }

    @Override
    public boolean equals(Object obj) {
        if (!(obj instanceof OntologyTerm)) {
            return false;
        }
        if (obj == this) {
            return true;
        }
        OntologyTerm ontologyTerm = (OntologyTerm) obj;
        return this.getId().equals(ontologyTerm.getId());
    }

    @Override
    public String toString() {
        return this.getNameSpace() + "\t" +
                this.getId() + "\t" +
                this.getName();
    }

    @Override
    public int compareTo(OntologyTerm o) {
        return this.getId().compareTo(o.getId());
    }
}

