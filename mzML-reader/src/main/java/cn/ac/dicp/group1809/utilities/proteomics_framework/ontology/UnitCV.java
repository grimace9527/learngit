package cn.ac.dicp.group1809.utilities.proteomics_framework.ontology;

import cn.ac.dicp.group1809.utilities.proteomics_framework.ontology.model.OntologyTerm;

import java.io.IOException;
import java.io.InputStream;
import java.util.HashMap;
import java.util.List;

public class UnitCV {

    public static final String MILLI_SECOND_ID = "UO:0000028";
    public static final String MICROSECOND_SECOND_ID = "UO:0000029";
    public static final String PICOSECOND_SECOND_ID = "UO:0000030";
    public static final String SECOND_ID = "UO:0000010";
    public static final String MINUTE_ID = "UO:0000031";
    public static final String HOUR_ID = "UO:0000032";
    public static final String DAY_ID = "UO:0000033";
    public static final String WEEK_ID = "UO:0000034";
    public static final String MONTH_ID = "UO:0000035";
    public static final String YEAR_ID = "UO:0000036";
    public static final String ELECTRONVOLT_ID = "UO:0000266";
    public static final OntologyTerm MILLI_SECOND;
    public static final OntologyTerm MICROSECOND_SECOND;
    public static final OntologyTerm PICOSECOND_SECOND;
    public static final OntologyTerm SECOND;
    public static final OntologyTerm MINUTE;
    public static final OntologyTerm HOUR;
    public static final OntologyTerm DAY;
    public static final OntologyTerm WEEK;
    public static final OntologyTerm MONTH;
    public static final OntologyTerm YEAR;
    public static final OntologyTerm ELECTRONVOLT;
    private static final List<OntologyTerm> TERM_LIST;
    private static final HashMap<String, OntologyTerm> TERM_MAP;

    static {
        InputStream inputStream = MSCV.class.getResourceAsStream("/ontology/unit.obo");
        OntologyTermGetter ontologyTermGetter = new OntologyTermGetter();

        ontologyTermGetter.read(inputStream);
        ;
        TERM_LIST = ontologyTermGetter.getTermList();
        TERM_MAP = ontologyTermGetter.getTermMap();
        try {
            inputStream.close();
        } catch (IOException e) {
            throw new RuntimeException(e);
        }
        MILLI_SECOND = TERM_MAP.get(MILLI_SECOND_ID);
        MICROSECOND_SECOND = TERM_MAP.get(MICROSECOND_SECOND_ID);
        PICOSECOND_SECOND = TERM_MAP.get(PICOSECOND_SECOND_ID);
        SECOND = TERM_MAP.get(SECOND_ID);
        MINUTE = TERM_MAP.get(MINUTE_ID);
        HOUR = TERM_MAP.get(HOUR_ID);
        DAY = TERM_MAP.get(DAY_ID);
        WEEK = TERM_MAP.get(WEEK_ID);
        MONTH = TERM_MAP.get(MONTH_ID);
        YEAR = TERM_MAP.get(YEAR_ID);
        ELECTRONVOLT = TERM_MAP.get(ELECTRONVOLT_ID);
    }

    public static OntologyTerm getOntologyTerm(String value) {
        if (TERM_MAP.containsKey(value)) {
            return TERM_MAP.get(value);
        }
        for (OntologyTerm ontologyTerm : TERM_LIST) {
            String name = ontologyTerm.getName();
            if (name.equalsIgnoreCase(value)) {
                return ontologyTerm;
            }
        }
        throw new IllegalArgumentException("Invalid Ontology Term Value: " + value);
    }

    public static List<OntologyTerm> getTermList() {
        return TERM_LIST;
    }

    public static HashMap<String, OntologyTerm> getTermMap() {
        return TERM_MAP;
    }
}
