package cn.ac.dicp.group1809.utilities.proteomics_framework.ontology;

import cn.ac.dicp.group1809.utilities.proteomics_framework.ontology.model.OntologyTerm;

import java.io.IOException;
import java.io.InputStream;
import java.util.HashMap;
import java.util.Iterator;
import java.util.List;

/**
 * @author He Zhu
 * @version 1.0.0
 * @since 2020/5/18 18:51
 */
public class MSCV {

        public static final String MZ_ID = "MS:1000040";
        public static final String NUMBER_OF_DETECTOR_COUNTS_ID = "MS:1000131";
        public static final String PERCENT_OF_BASE_PEAK_ID = "MS:1000132";
        public static final String MS_1_SPECTRUM_ID = "MS:1000579";
        public static final String MS_N_SPECTRUM_ID = "MS:1000580";
        public static final String MS_LEVEL_ID = "MS:1000511";
        public static final String NEGATIVE_SCAN_ID = "MS:1000129";
        public static final String POSITIVE_SCAN_ID = "MS:1000130";
        public static final String PROFILE_SPECTRUM_ID = "MS:1000128";
        public static final String CENTROID_SPECTRUM_ID = "MS:1000127";
        public static final String BASE_PEAK_MZ_ID = "MS:1000504";
        public static final String BASE_PEAK_INTENSITY_ID = "MS:1000505";
        public static final String TOTAL_ION_CURRENT_ID = "MS:1000285";
        public static final String LOWEST_OBSERVED_MZ_ID = "MS:1000528";
        public static final String HIGHEST_OBSERVED_MZ_ID = "MS:1000527";
        public static final String SPECTRUM_TITLE_ID = "MS:1000796";
        public static final String NO_COMBINATION_ID = "MS:1000795";
        public static final String SCAN_START_TIME_ID = "MS:1000016";
        public static final String FILTER_STRING_ID = "MS:1000512";
        public static final String PRESET_SCAN_CONFIGURATION_ID = "MS:1000616";
        public static final String ION_INJECTION_TIME_ID = "MS:1000927";
        public static final String SCAN_WINDOW_LOWER_LIMIT_ID = "MS:1000501";
        public static final String SCAN_WINDOW_UPPER_LIMIT_ID = "MS:1000500";
        public static final String ISOLATION_WINDOW_TARGET_MZ_ID = "MS:1000827";
        public static final String ISOLATION_WINDOW_LOWER_OFFSET_ID = "MS:1000828";
        public static final String ISOLATION_WINDOW_UPPER_OFFSET_ID = "MS:1000829";
        public static final String SELECTED_ION_MZ_ID = "MS:1000744";
        public static final String CHARGE_STATE_ID = "MS:1000041";
        public static final String PEAK_INTENSITY_ID = "MS:1000042";
        public static final String BEAM_TYPE_COLLISION_INDUCED_DISSOCIATION_ID = "MS:1000422";
        public static final String COLLISION_INDUCED_DISSOCIATION_ID = "MS:1000133";
        public static final String NORMALIZED_COLLISION_ENERGY_ID = "MS:1000138";
        public static final String COLLISION_ENERGY_ID = "MS:1000045";
        public static final String INTEGER_32_BIT_ID = "MS:1000519";
        public static final String FLOAT_16_BIT_ID = "MS:1000520";
        public static final String FLOAT_32_BIT_ID = "MS:1000521";
        public static final String INTEGER_64_BIT_ID = "MS:1000522";
        public static final String FLOAT_64_BIT_ID = "MS:1000523";
        public static final String LINEAR_PREDICTION_COMPRESSION_ID = "MS:1002312";
        public static final String POSITIVE_INTEGER_COMPRESSION_ID = "MS:1002313";
        public static final String SHORT_LOGGED_FLOAT_COMPRESSION_ID = "MS:1002314";
        public static final String LINEAR_PREDICTION_COMPRESSION_FOLLOWED_BY_ZLIB_COMPRESSION_ID = "MS:1002746";
        public static final String POSITIVE_INTEGER_COMPRESSION_FOLLOWED_BY_ZLIB_COMPRESSION_ID = "MS:1002747";
        public static final String SHORT_LOGGED_FLOAT_COMPRESSION_FOLLOWED_BY_ZLIB_COMPRESSION_ID = "MS:1002748";
        public static final String ZLIB_COMPRESSION_ID = "MS:1000574";
        public static final String NO_COMPRESSION_ID = "MS:1000576";
        public static final String MZ_ARRAY_ID = "MS:1000514";
        public static final String INTENSITY_ARRAY_ID = "MS:1000515";
        public static final String TIME_ARRAY_ID = "MS:1000595";
        public static final String TOTAL_ION_CURRENT_CHROMATOGRAM_ID = "MS:1000235";

        public static final OntologyTerm MZ;
        public static final OntologyTerm NUMBER_OF_DETECTOR_COUNTS;
        public static final OntologyTerm PERCENT_OF_BASE_PEAK;
        public static final OntologyTerm MS_1_SPECTRUM;
        public static final OntologyTerm MS_N_SPECTRUM;
        public static final OntologyTerm MS_LEVEL;
        public static final OntologyTerm NEGATIVE_SCAN;
        public static final OntologyTerm POSITIVE_SCAN;
        public static final OntologyTerm PROFILE_SPECTRUM;
        public static final OntologyTerm CENTROID_SPECTRUM;
        public static final OntologyTerm BASE_PEAK_MZ;
        public static final OntologyTerm BASE_PEAK_INTENSITY;
        public static final OntologyTerm TOTAL_ION_CURRENT;
        public static final OntologyTerm LOWEST_OBSERVED_MZ;
        public static final OntologyTerm HIGHEST_OBSERVED_MZ;
        public static final OntologyTerm SPECTRUM_TITLE;
        public static final OntologyTerm NO_COMBINATION;
        public static final OntologyTerm SCAN_START_TIME;
        public static final OntologyTerm FILTER_STRING;
        public static final OntologyTerm PRESET_SCAN_CONFIGURATION;
        public static final OntologyTerm ION_INJECTION_TIME;
        public static final OntologyTerm SCAN_WINDOW_LOWER_LIMIT;
        public static final OntologyTerm SCAN_WINDOW_UPPER_LIMIT;
        public static final OntologyTerm ISOLATION_WINDOW_TARGET_MZ;
        public static final OntologyTerm ISOLATION_WINDOW_LOWER_OFFSET;
        public static final OntologyTerm ISOLATION_WINDOW_UPPER_OFFSET;
        public static final OntologyTerm SELECTED_ION_MZ;
        public static final OntologyTerm CHARGE_STATE;
        public static final OntologyTerm PEAK_INTENSITY;
        public static final OntologyTerm BEAM_TYPE_COLLISION_INDUCED_DISSOCIATION;
        public static final OntologyTerm COLLISION_INDUCED_DISSOCIATION;
        public static final OntologyTerm NORMALIZED_COLLISION_ENERGY;
        public static final OntologyTerm COLLISION_ENERGY;
        public static final OntologyTerm INTEGER_32_BIT;
        public static final OntologyTerm FLOAT_16_BIT;
        public static final OntologyTerm FLOAT_32_BIT;
        public static final OntologyTerm INTEGER_64_BIT;
        public static final OntologyTerm FLOAT_64_BIT;
        public static final OntologyTerm LINEAR_PREDICTION_COMPRESSION;
        public static final OntologyTerm POSITIVE_INTEGER_COMPRESSION;
        public static final OntologyTerm SHORT_LOGGED_FLOAT_COMPRESSION;
        public static final OntologyTerm LINEAR_PREDICTION_COMPRESSION_FOLLOWED_BY_ZLIB_COMPRESSION;
        public static final OntologyTerm POSITIVE_INTEGER_COMPRESSION_FOLLOWED_BY_ZLIB_COMPRESSION;
        public static final OntologyTerm SHORT_LOGGED_FLOAT_COMPRESSION_FOLLOWED_BY_ZLIB_COMPRESSION;
        public static final OntologyTerm ZLIB_COMPRESSION;
        public static final OntologyTerm NO_COMPRESSION;
        public static final OntologyTerm MZ_ARRAY;
        public static final OntologyTerm INTENSITY_ARRAY;
        public static final OntologyTerm TIME_ARRAY;
        public static final OntologyTerm TOTAL_ION_CURRENT_CHROMATOGRAM;
        private static final List<OntologyTerm> TERM_LIST;
        private static final HashMap<String, OntologyTerm> TERM_MAP;

        static {
                InputStream inputStream = MSCV.class.getResourceAsStream("/ontology/psi-ms.obo");
                OntologyTermGetter ontologyTermGetter = new OntologyTermGetter();
                ontologyTermGetter.read(inputStream);

                TERM_MAP = ontologyTermGetter.getTermMap();
                TERM_LIST = ontologyTermGetter.getTermList();

                Iterator<OntologyTerm> listIterator = TERM_LIST.listIterator();
                Iterator<String> mapKeyIterator = TERM_MAP.keySet().iterator();
                Iterator<OntologyTerm> mapValueIterator = TERM_MAP.values().iterator();
                while (listIterator.hasNext()){
                        listIterator.next().setNameSpace("MS");
                }

                try{
                    inputStream.close();
                }catch (IOException e){

                }

                MZ = TERM_MAP.get(MZ_ID);
                NUMBER_OF_DETECTOR_COUNTS = TERM_MAP.get(NUMBER_OF_DETECTOR_COUNTS_ID);
                PERCENT_OF_BASE_PEAK = TERM_MAP.get(PERCENT_OF_BASE_PEAK_ID);
                MS_1_SPECTRUM = TERM_MAP.get(MS_1_SPECTRUM_ID);
                MS_N_SPECTRUM = TERM_MAP.get(MS_N_SPECTRUM_ID);
                MS_LEVEL = TERM_MAP.get(MS_LEVEL_ID);
                NEGATIVE_SCAN = TERM_MAP.get(NEGATIVE_SCAN_ID);
                POSITIVE_SCAN = TERM_MAP.get(POSITIVE_SCAN_ID);
                PROFILE_SPECTRUM = TERM_MAP.get(PROFILE_SPECTRUM_ID);
                CENTROID_SPECTRUM = TERM_MAP.get(CENTROID_SPECTRUM_ID);
                BASE_PEAK_MZ = TERM_MAP.get(BASE_PEAK_MZ_ID);
                BASE_PEAK_INTENSITY = TERM_MAP.get(BASE_PEAK_INTENSITY_ID);
                TOTAL_ION_CURRENT = TERM_MAP.get(TOTAL_ION_CURRENT_ID);
                LOWEST_OBSERVED_MZ = TERM_MAP.get(LOWEST_OBSERVED_MZ_ID);
                HIGHEST_OBSERVED_MZ = TERM_MAP.get(HIGHEST_OBSERVED_MZ_ID);
                SPECTRUM_TITLE = TERM_MAP.get(SPECTRUM_TITLE_ID);
                NO_COMBINATION = TERM_MAP.get(NO_COMBINATION_ID);
                SCAN_START_TIME = TERM_MAP.get(SCAN_START_TIME_ID);
                FILTER_STRING = TERM_MAP.get(FILTER_STRING_ID);
                PRESET_SCAN_CONFIGURATION = TERM_MAP.get(PRESET_SCAN_CONFIGURATION_ID);
                ION_INJECTION_TIME = TERM_MAP.get(ION_INJECTION_TIME_ID);
                SCAN_WINDOW_LOWER_LIMIT = TERM_MAP.get(SCAN_WINDOW_LOWER_LIMIT_ID);
                SCAN_WINDOW_UPPER_LIMIT = TERM_MAP.get(SCAN_WINDOW_UPPER_LIMIT_ID);
                ISOLATION_WINDOW_TARGET_MZ = TERM_MAP.get(ISOLATION_WINDOW_TARGET_MZ_ID);
                ISOLATION_WINDOW_LOWER_OFFSET = TERM_MAP.get(ISOLATION_WINDOW_LOWER_OFFSET_ID);
                ISOLATION_WINDOW_UPPER_OFFSET = TERM_MAP.get(ISOLATION_WINDOW_UPPER_OFFSET_ID);
                SELECTED_ION_MZ = TERM_MAP.get(SELECTED_ION_MZ_ID);
                CHARGE_STATE = TERM_MAP.get(CHARGE_STATE_ID);
                PEAK_INTENSITY = TERM_MAP.get(PEAK_INTENSITY_ID);
                BEAM_TYPE_COLLISION_INDUCED_DISSOCIATION = TERM_MAP.get(BEAM_TYPE_COLLISION_INDUCED_DISSOCIATION_ID);
                COLLISION_INDUCED_DISSOCIATION = TERM_MAP.get(COLLISION_INDUCED_DISSOCIATION_ID);
                NORMALIZED_COLLISION_ENERGY = TERM_MAP.get(NORMALIZED_COLLISION_ENERGY_ID);
                COLLISION_ENERGY = TERM_MAP.get(COLLISION_ENERGY_ID);
                INTEGER_32_BIT = TERM_MAP.get(INTEGER_32_BIT_ID);
                FLOAT_16_BIT = TERM_MAP.get(FLOAT_16_BIT_ID);
                FLOAT_32_BIT = TERM_MAP.get(FLOAT_32_BIT_ID);
                INTEGER_64_BIT = TERM_MAP.get(INTEGER_64_BIT_ID);
                FLOAT_64_BIT = TERM_MAP.get(FLOAT_64_BIT_ID);
                LINEAR_PREDICTION_COMPRESSION = TERM_MAP.get(LINEAR_PREDICTION_COMPRESSION_ID);
                POSITIVE_INTEGER_COMPRESSION = TERM_MAP.get(POSITIVE_INTEGER_COMPRESSION_ID);
                SHORT_LOGGED_FLOAT_COMPRESSION = TERM_MAP.get(SHORT_LOGGED_FLOAT_COMPRESSION_ID);
                LINEAR_PREDICTION_COMPRESSION_FOLLOWED_BY_ZLIB_COMPRESSION = TERM_MAP.get(LINEAR_PREDICTION_COMPRESSION_FOLLOWED_BY_ZLIB_COMPRESSION_ID);
                POSITIVE_INTEGER_COMPRESSION_FOLLOWED_BY_ZLIB_COMPRESSION = TERM_MAP.get(POSITIVE_INTEGER_COMPRESSION_FOLLOWED_BY_ZLIB_COMPRESSION_ID);
                SHORT_LOGGED_FLOAT_COMPRESSION_FOLLOWED_BY_ZLIB_COMPRESSION = TERM_MAP.get(SHORT_LOGGED_FLOAT_COMPRESSION_FOLLOWED_BY_ZLIB_COMPRESSION_ID);
                ZLIB_COMPRESSION = TERM_MAP.get(ZLIB_COMPRESSION_ID);
                NO_COMPRESSION = TERM_MAP.get(NO_COMPRESSION_ID);
                MZ_ARRAY = TERM_MAP.get(MZ_ARRAY_ID);
                INTENSITY_ARRAY = TERM_MAP.get(INTENSITY_ARRAY_ID);
                TIME_ARRAY = TERM_MAP.get(TIME_ARRAY_ID);
                TOTAL_ION_CURRENT_CHROMATOGRAM = TERM_MAP.get(TOTAL_ION_CURRENT_CHROMATOGRAM_ID);
        }
}
