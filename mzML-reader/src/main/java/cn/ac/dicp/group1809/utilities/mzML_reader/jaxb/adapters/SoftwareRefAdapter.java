package cn.ac.dicp.group1809.utilities.mzML_reader.jaxb.adapters;


import cn.ac.dicp.group1809.utilities.mzML_reader.model.SoftwareRef;

import javax.xml.bind.annotation.adapters.XmlAdapter;

/**
 * Created by IntelliJ IDEA.
 * User: dani
 * Date: 08/03/11
 * Time: 10:45
 * To change this template use File | Settings | File Templates.
 */
public class SoftwareRefAdapter extends XmlAdapter<SoftwareRef, String> {

    public String unmarshal(SoftwareRef value) {
        return value.getRef();
    }

    public SoftwareRef marshal(String value) {
        SoftwareRef softwareRef = new SoftwareRef();
        softwareRef.setRef(value);
        return softwareRef;
    }
}
