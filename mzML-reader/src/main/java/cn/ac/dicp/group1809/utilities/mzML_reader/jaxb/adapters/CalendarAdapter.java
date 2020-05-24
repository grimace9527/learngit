package cn.ac.dicp.group1809.utilities.mzML_reader.jaxb.adapters;

import javax.xml.bind.annotation.adapters.XmlAdapter;
import java.util.Calendar;

/**
 * @author Florian Reisinger
 * @version $Id$
 * @since x.y
 */
public class CalendarAdapter extends XmlAdapter<String, Calendar> {

    public Calendar unmarshal(String value) {
        return (javax.xml.bind.DatatypeConverter.parseDateTime(value));
    }

    public String marshal(Calendar value) {
        if (value == null) {
            return null;
        }
        return (javax.xml.bind.DatatypeConverter.printDateTime(value));
    }

}
