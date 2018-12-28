package application.create;
import javax.xml.bind.annotation.adapters.XmlAdapter;

/**
 * This is a simple class for override methods marshalling and unmarshalling.
 * @see StringAdapter
 * @see #unmarshal(String)
 * @see #marshal(String)
 * @author Roman Borysenko ramzes198725@gmail.com
 */
public class StringAdapter extends XmlAdapter<String, String> {
    /**
     * Retrieve the value after marshalling.
     * @param v is variable that was reading from XML  type String
     * @return String data type.
     * @throws Exception if operation doesn't successfull
     */
    @Override
    public String unmarshal(String v) throws Exception {
        return v;
    }

    /**
     * Set the value after marshalling and create tag <[name]/> if value = "".
     * @param v is variable of type String.
     * @return String data type.
     * @throws Exception if operation doesn't successfull
     */
    @Override
    public String marshal(String v) throws Exception {
        if("".equals(v)) {
            return null;
        }
        return v;
    }
}