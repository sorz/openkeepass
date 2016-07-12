package de.slackspace.openkeepass.domain.xml.adapter;

import java.text.SimpleDateFormat;
import java.util.GregorianCalendar;
import java.util.TimeZone;

import org.simpleframework.xml.transform.Transform;

public class CalendarSimpleXmlAdapter implements Transform<GregorianCalendar> {

    private static SimpleDateFormat dateFormatter = new SimpleDateFormat("yyyy-MM-dd'T'HH:mm:ss.SSS'Z'");
    
    @Override
    public GregorianCalendar read(String value) throws Exception {
        return null;
    }

    @Override
    public String write(GregorianCalendar value) throws Exception {
        if(value == null) {
            return "";
        }
        
        dateFormatter.setTimeZone(TimeZone.getTimeZone("GMT"));
        return dateFormatter.format(value.getTime());
    }

}
