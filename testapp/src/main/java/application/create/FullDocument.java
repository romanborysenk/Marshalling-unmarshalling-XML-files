package application.create;

import application.model.Body;
import application.model.Header;
import javax.xml.bind.annotation.*;

/**
 * This is a simple class for creating XML document.
 * @see FullDocument
 * @see #setBf(String)
 * @see #getBf()
 * @see #setBody(Body)
 * @see #getBody()
 * @see #setHeader(Header)
 * @see #getHeader()
 * @see #setLen(String)
 * @see #getLen()
 * @author Roman Borysenko ramzes198725@gmail.com
 */
@XmlRootElement( name = "DOCUMENT")
@XmlAccessorType(XmlAccessType.FIELD)
public class FullDocument {
    @XmlAttribute
    private String bf;
    @XmlAttribute
    private String len;
    @XmlElement( name = "HEADER" )
    private Header header;
    @XmlElement( name = "BODY" )
    private Body body;

    /**
     *  Retrieve the header of XML document.
     *  @return header XML document
     * @see Header
     */
    public Header getHeader() {
        return header;
    }

    /**
     *  Set the header of XML document.
     * @param header is a header of XML document
     * @see Header
     */
    public void setHeader(Header header) {
        this.header = header;
    }

    /**
     *  Retrieve the body of XML document.
     *  @return body of XML document
     * @see Body
     */
    public Body getBody() {
        return body;
    }

    /**
     *  Set the body of XML document.
     * @param body is a body of XML document
     * @see Body
     */
    public void setBody(Body body) {
        this.body = body;
    }

    /**
     *  Retrieve the parameter bf of XML document.
     *  @return bf is parameter of XML document type String
     */
    public String getBf() {
        return bf;
    }

    /**
     * Set bf is  parameter of XML document.
     * @param bf is a String value
     */
    public void setBf(String bf) {
        this.bf = bf;
    }

    /**
     *  Retrieve the parameter len of XML document.
     *  @return len is parameter of XML document type String
     */
    public String getLen() {
        return len;
    }

    /**
     * Set len is  parameter of XML document.
     * @param len is a String value
     */
    public void setLen(String len) {
        this.len = len;
    }
}