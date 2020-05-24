package cn.ac.dicp.group1809.utilities.mzML_reader.model;

import cn.ac.dicp.group1809.utilities.mzML_reader.io.CVParamParser;
import cn.ac.dicp.group1809.utilities.mzML_reader.jaxb.adapters.IdRefAdapter;
import cn.ac.dicp.group1809.utilities.mzML_reader.testFolder.Test;
import cn.ac.dicp.group1809.utilities.proteomics_framework.ontology.*;

import javax.xml.bind.annotation.XmlAttribute;
import javax.xml.bind.annotation.XmlSchemaType;
import javax.xml.bind.annotation.adapters.XmlJavaTypeAdapter;
import java.io.Serializable;

/**
 * @author He Zhu
 * @version 1.0.0
 * @since 2020/5/18 13:59
 */
public class CVParam implements Serializable {

    public static final CVParam MS_1_SPECTRUM_CV_PARAM;
    public static final CVParam MS_N_SPECTRUM_CV_PARAM;
    public static final CVParam MS_LEVEL_CV_PARAM;
    public static final CVParam MS_LEVEL_1_CV_PARAM;
    public static final CVParam MS_LEVEL_2_CV_PARAM;
    public static final CVParam MS_LEVEL_3_CV_PARAM;
    public static final CVParam NEGATIVE_SCAN_CV_PARAM;
    public static final CVParam POSITIVE_SCAN_CV_PARAM;
    public static final CVParam PROFILE_SPECTRUM_CV_PARAM;
    public static final CVParam CENTROID_SPECTRUM_CV_PARAM;
    public static final CVParam BASE_PEAK_MZ_CV_PARAM;
    public static final CVParam BASE_PEAK_INTENSITY_CV_PARAM;
    public static final CVParam TOTAL_ION_CURRENT_CV_PARAM;
    public static final CVParam LOWEST_OBSERVED_MZ_CV_PARAM;
    public static final CVParam HIGHEST_OBSERVED_MZ_CV_PARAM;
    public static final CVParam SPECTRUM_TITLE_CV_PARAM;
    public static final CVParam NO_COMBINATION_CV_PARAM;
    public static final CVParam SCAN_START_TIME_CV_PARAM;
    public static final CVParam FILTER_STRING_CV_PARAM;
    public static final CVParam PRESET_SCAN_CONFIGURATION_CV_PARAM;
    public static final CVParam ION_INJECTION_TIME_CV_PARAM;
    public static final CVParam SCAN_WINDOW_LOWER_LIMIT_CV_PARAM;
    public static final CVParam SCAN_WINDOW_UPPER_LIMIT_CV_PARAM;
    public static final CVParam ISOLATION_WINDOW_TARGET_MZ_CV_PARAM;
    public static final CVParam ISOLATION_WINDOW_LOWER_OFFSET_CV_PARAM;
    public static final CVParam ISOLATION_WINDOW_UPPER_OFFSET_CV_PARAM;
    public static final CVParam SELECTED_ION_MZ_CV_PARAM;
    public static final CVParam CHARGE_STATE_CV_PARAM;
    public static final CVParam PEAK_INTENSITY_CV_PARAM;
    public static final CVParam BEAM_TYPE_COLLISION_INDUCED_DISSOCIATION_CV_PARAM;
    public static final CVParam COLLISION_ENERGY_CV_PARAM;
    public static final CVParam INTEGER_32_BIT_CV_PARAM;
    public static final CVParam FLOAT_16_BIT_CV_PARAM;
    public static final CVParam FLOAT_32_BIT_CV_PARAM;
    public static final CVParam INTEGER_64_BIT_CV_PARAM;
    public static final CVParam FLOAT_64_BIT_CV_PARAM;
    public static final CVParam LINEAR_PREDICTION_COMPRESSION_CV_PARAM;
    public static final CVParam POSITIVE_INTEGER_COMPRESSION_CV_PARAM;
    public static final CVParam SHORT_LOGGED_FLOAT_COMPRESSION_CV_PARAM;
    public static final CVParam LINEAR_PREDICTION_COMPRESSION_FOLLOWED_BY_ZLIB_COMPRESSION_CV_PARAM;
    public static final CVParam POSITIVE_INTEGER_COMPRESSION_FOLLOWED_BY_ZLIB_COMPRESSION_CV_PARAM;
    public static final CVParam SHORT_LOGGED_FLOAT_COMPRESSION_FOLLOWED_BY_ZLIB_COMPRESSION_CV_PARAM;
    public static final CVParam ZLIB_COMPRESSION_CV_PARAM;
    public static final CVParam NO_COMPRESSION_CV_PARAM;
    public static final CVParam MZ_ARRAY_CV_PARAM;
    public static final CVParam INTENSITY_ARRAY_CV_PARAM;
    public static final CVParam TIME_ARRAY_CV_PARAM;
    public static final CVParam TOTAL_ION_CURRENT_CHROMATOGRAM_CV_PARAM;
    private static final long serialVersionUID = -1014332700005033102L;

    static {
        MS_1_SPECTRUM_CV_PARAM = CVParamParser.getParam("MS", MSCV.MS_1_SPECTRUM);
        MS_N_SPECTRUM_CV_PARAM = CVParamParser.getParam("MS", MSCV.MS_N_SPECTRUM);
        MS_LEVEL_CV_PARAM = CVParamParser.getParam("MS", MSCV.MS_LEVEL);
        MS_LEVEL_1_CV_PARAM = CVParamParser.getParam("MS", MSCV.MS_LEVEL);
        MS_LEVEL_1_CV_PARAM.setValue("1");
        MS_LEVEL_2_CV_PARAM = CVParamParser.getParam("MS", MSCV.MS_LEVEL);
        MS_LEVEL_2_CV_PARAM.setValue("2");
        MS_LEVEL_3_CV_PARAM = CVParamParser.getParam("MS", MSCV.MS_LEVEL);
        MS_LEVEL_3_CV_PARAM.setValue("3");
        NEGATIVE_SCAN_CV_PARAM = CVParamParser.getParam("MS", MSCV.NEGATIVE_SCAN);
        POSITIVE_SCAN_CV_PARAM = CVParamParser.getParam("MS", MSCV.POSITIVE_SCAN);
        CENTROID_SPECTRUM_CV_PARAM = CVParamParser.getParam("MS", MSCV.CENTROID_SPECTRUM);
        PROFILE_SPECTRUM_CV_PARAM = CVParamParser.getParam("MS", MSCV.PROFILE_SPECTRUM);
        BASE_PEAK_MZ_CV_PARAM = CVParamParser.getParam("MS", MSCV.BASE_PEAK_MZ, "MS", MSCV.MZ,"" );
        BASE_PEAK_INTENSITY_CV_PARAM = CVParamParser.getParam("MS", MSCV.BASE_PEAK_INTENSITY);
        TOTAL_ION_CURRENT_CV_PARAM = CVParamParser.getParam("MS", MSCV.TOTAL_ION_CURRENT);
        LOWEST_OBSERVED_MZ_CV_PARAM = CVParamParser.getParam("MS", MSCV.LOWEST_OBSERVED_MZ, "MS", MSCV.MZ,"");
        HIGHEST_OBSERVED_MZ_CV_PARAM = CVParamParser.getParam("MS", MSCV.HIGHEST_OBSERVED_MZ, "MS", MSCV.MZ,"");
        SPECTRUM_TITLE_CV_PARAM = CVParamParser.getParam("MS", MSCV.SPECTRUM_TITLE);
        NO_COMBINATION_CV_PARAM = CVParamParser.getParam("MS", MSCV.NO_COMBINATION);

        SCAN_START_TIME_CV_PARAM = CVParamParser.getParam("MS", MSCV.SCAN_START_TIME);
        FILTER_STRING_CV_PARAM = CVParamParser.getParam("MS", MSCV.FILTER_STRING);
        PRESET_SCAN_CONFIGURATION_CV_PARAM = CVParamParser.getParam("MS", MSCV.PRESET_SCAN_CONFIGURATION);
        ION_INJECTION_TIME_CV_PARAM = CVParamParser.getParam("MS", MSCV.ION_INJECTION_TIME);
        SCAN_WINDOW_LOWER_LIMIT_CV_PARAM = CVParamParser.getParam("MS", MSCV.SCAN_WINDOW_LOWER_LIMIT, "MS", MSCV.MZ,"");
        SCAN_WINDOW_UPPER_LIMIT_CV_PARAM = CVParamParser.getParam("MS", MSCV.SCAN_WINDOW_UPPER_LIMIT, "MS", MSCV.MZ,"");
        ISOLATION_WINDOW_TARGET_MZ_CV_PARAM = CVParamParser.getParam("MS", MSCV.ISOLATION_WINDOW_TARGET_MZ, "MS", MSCV.MZ,"");
        ISOLATION_WINDOW_LOWER_OFFSET_CV_PARAM = CVParamParser.getParam("MS", MSCV.ISOLATION_WINDOW_LOWER_OFFSET, "MS", MSCV.MZ,"");
        ISOLATION_WINDOW_UPPER_OFFSET_CV_PARAM = CVParamParser.getParam("MS", MSCV.ISOLATION_WINDOW_UPPER_OFFSET, "MS", MSCV.MZ,"");
        SELECTED_ION_MZ_CV_PARAM = CVParamParser.getParam("MS", MSCV.SELECTED_ION_MZ, "MS", MSCV.MZ,"");
        CHARGE_STATE_CV_PARAM = CVParamParser.getParam("MS", MSCV.CHARGE_STATE);
        PEAK_INTENSITY_CV_PARAM = CVParamParser.getParam("MS", MSCV.PEAK_INTENSITY);
        BEAM_TYPE_COLLISION_INDUCED_DISSOCIATION_CV_PARAM = CVParamParser.getParam("MS", MSCV.BEAM_TYPE_COLLISION_INDUCED_DISSOCIATION);
        COLLISION_ENERGY_CV_PARAM = CVParamParser.getParam("MS", MSCV.COLLISION_ENERGY);

        INTEGER_32_BIT_CV_PARAM = CVParamParser.getParam("MS", MSCV.INTEGER_32_BIT);
        INTEGER_64_BIT_CV_PARAM = CVParamParser.getParam("MS", MSCV.INTEGER_64_BIT);
        FLOAT_16_BIT_CV_PARAM = CVParamParser.getParam("MS", MSCV.FLOAT_16_BIT);
        FLOAT_32_BIT_CV_PARAM = CVParamParser.getParam("MS", MSCV.FLOAT_32_BIT);
        FLOAT_64_BIT_CV_PARAM = CVParamParser.getParam("MS", MSCV.FLOAT_64_BIT);
        LINEAR_PREDICTION_COMPRESSION_CV_PARAM = CVParamParser.getParam("MS", MSCV.LINEAR_PREDICTION_COMPRESSION);
        POSITIVE_INTEGER_COMPRESSION_CV_PARAM = CVParamParser.getParam("MS", MSCV.POSITIVE_INTEGER_COMPRESSION);
        SHORT_LOGGED_FLOAT_COMPRESSION_CV_PARAM = CVParamParser.getParam("MS", MSCV.SHORT_LOGGED_FLOAT_COMPRESSION);
        LINEAR_PREDICTION_COMPRESSION_FOLLOWED_BY_ZLIB_COMPRESSION_CV_PARAM = CVParamParser.getParam("MS", MSCV.LINEAR_PREDICTION_COMPRESSION_FOLLOWED_BY_ZLIB_COMPRESSION);
        POSITIVE_INTEGER_COMPRESSION_FOLLOWED_BY_ZLIB_COMPRESSION_CV_PARAM = CVParamParser.getParam("MS", MSCV.POSITIVE_INTEGER_COMPRESSION_FOLLOWED_BY_ZLIB_COMPRESSION);
        SHORT_LOGGED_FLOAT_COMPRESSION_FOLLOWED_BY_ZLIB_COMPRESSION_CV_PARAM = CVParamParser.getParam("MS", MSCV.SHORT_LOGGED_FLOAT_COMPRESSION_FOLLOWED_BY_ZLIB_COMPRESSION);
        ZLIB_COMPRESSION_CV_PARAM = CVParamParser.getParam("MS", MSCV.ZLIB_COMPRESSION);
        NO_COMPRESSION_CV_PARAM = CVParamParser.getParam("MS", MSCV.NO_COMPRESSION);
        MZ_ARRAY_CV_PARAM = CVParamParser.getParam("MS", MSCV.MZ_ARRAY, "MS", MSCV.MZ,"");
        INTENSITY_ARRAY_CV_PARAM = CVParamParser.getParam("MS", MSCV.INTENSITY_ARRAY, "MS",MSCV.NUMBER_OF_DETECTOR_COUNTS,"");
        TIME_ARRAY_CV_PARAM = CVParamParser.getParam("MS", MSCV.TIME_ARRAY,  "UO", UnitCV.MINUTE,"");
        TOTAL_ION_CURRENT_CHROMATOGRAM_CV_PARAM= CVParamParser.getParam("MS", MSCV.TOTAL_ION_CURRENT_CHROMATOGRAM);
    }

    @XmlAttribute(required = true)
    @XmlJavaTypeAdapter(IdRefAdapter.class)
    @XmlSchemaType(name = "IDREF")
    protected String cvRef;

    @XmlAttribute(required = true)
    protected String accession;
    @XmlAttribute
    protected String value;
    @XmlAttribute(required = true)
    protected String name;
    @XmlAttribute
    protected String unitAccession;
    @XmlAttribute
    protected String unitName;
    @XmlAttribute
    @XmlJavaTypeAdapter(IdRefAdapter.class)
    @XmlSchemaType(name = "IDREF")
    protected String unitCvRef;

//    public static CVParam getMs1SpectrumCvParam() {
//        return MS_1_SPECTRUM_CV_PARAM;
//    }

    public String getCvRef() {
        return cvRef;
    }

    public void setCvRef(String cvRef) {
        this.cvRef = cvRef;
    }

    public String getAccession() {
        return accession;
    }

    public void setAccession(String accession) {
        this.accession = accession;
    }

    public String getValue() {
        return value;
    }

    public void setValue(String value) {
        this.value = value;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getUnitAccession() {
        return unitAccession;
    }

    public void setUnitAccession(String unitAccession) {
        this.unitAccession = unitAccession;
    }

    public String getUnitName() {
        return unitName;
    }

    public void setUnitName(String unitName) {
        this.unitName = unitName;
    }

    public String getUnitCvRef() {
        return unitCvRef;
    }

    public void setUnitCvRef(String unitCvRef) {
        this.unitCvRef = unitCvRef;
    }


}
