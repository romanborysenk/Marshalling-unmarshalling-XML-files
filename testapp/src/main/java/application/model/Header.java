package application.model;

import application.create.StringAdapter;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlRootElement;
import javax.xml.bind.annotation.XmlType;
import javax.xml.bind.annotation.adapters.XmlJavaTypeAdapter;

/**
 * This is a simple class for creating header of XML document.
 * @see Header
 * @see #setDocId(String)
 * @see #getDocId()
 * @see #setDtpId(String)
 * @see #getDtpId()
 * @see #setVersion(String)
 * @see #getVersion()
 * @see #setSender(String)
 * @see #getSender()
 * @see #setSenderId(String)
 * @see #getSenderId()
 * @see #setMessageId(String)
 * @see #getMessageId()
 * @see #setOwnNum(String)
 * @see #getOwnNum()
 * @see #setOwnDate(String)
 * @see #getOwnDate()
 * @see #setTimestamp(String)
 * @see #getTimestamp()
 * @see #setCopy(String)
 * @see #getCopy()
 * @see #setCtId(String)
 * @see #getCtId()
 * @see #toString()
 * @author Roman Borysenko ramzes198725@gmail.com
 */
@XmlRootElement( name = "HEADER" )
/*order of formation of fields for creating XML file*/
@XmlType(propOrder={"docId","dtpId","version","sender","senderId","messageId","ownNum","ownDate",
        "timestamp","copy","ctId"})
public class Header {
    private String docId;
    private String dtpId;
    private String version;
    private String sender;
    private String senderId;
    private String messageId;
    private String ownNum;
    private String ownDate;
    private String timestamp;
    private String copy;
    private String ctId;

    /**
     *  Retrieve the value DOC_ID of header XML document.
     *  @return value type String.
     */
    public String getDocId() {
        return docId;
    }

    /**
     *  Set the value of docId after unmarshalling of header XML document from DOC_ID.
     * @param docId is a value DOC_ID type String.
     */
    @XmlElement( name = "DOC_ID" )
    @XmlJavaTypeAdapter(value= StringAdapter.class, type=String.class)
    public void setDocId(String docId) {
        this.docId = docId;
    }

    /**
     *  Retrieve the value DTP_ID of header XML document.
     *  @return value type String.
     */
    public String getDtpId() {
        return dtpId;
    }

    /**
     *  Set the value of dtpId after unmarshalling of header XML document from DTP_ID.
     * @param dtpId is a value DTP_ID type String.
     */
    @XmlElement( name = "DTP_ID" )
    @XmlJavaTypeAdapter(value= StringAdapter.class, type=String.class)
    public void setDtpId(String dtpId) {
        this.dtpId = dtpId;
    }

    /**
     *  Retrieve the value VERSION of header XML document.
     *  @return value type String.
     */
    public String getVersion() {
        return version;
    }

    /**
     *  Set the value of version after unmarshalling of header XML document from VERSION.
     * @param version is a value VERSION type String.
     */
    @XmlElement( name = "VERSION" )
    @XmlJavaTypeAdapter(value= StringAdapter.class, type=String.class)
    public void setVersion(String version) {
        this.version = version;
    }

    /**
     *  Retrieve the value SENDER of header XML document.
     *  @return value type String.
     */
    public String getSender() {
        return sender;
    }

    /**
     *  Set the value of sender after unmarshalling of header XML document from SENDER.
     * @param sender is a value SENDER type String.
     */
    @XmlElement( name = "SENDER" )
    @XmlJavaTypeAdapter(value= StringAdapter.class, type=String.class)
    public void setSender(String sender) {
        this.sender = sender;
    }

    /**
     *  Retrieve the value SENDER_ID of header XML document.
     *  @return value type String.
     */
    public String getSenderId() {
        return senderId;
    }

    /**
     *  Set the value of senderId after unmarshalling of header XML document from SENDER_ID.
     * @param senderId is a value SENDER_ID type String.
     */
    @XmlElement( name = "SENDER_ID" )
    @XmlJavaTypeAdapter(value= StringAdapter.class, type=String.class)
    public void setSenderId(String senderId) {
        this.senderId = senderId;
    }

    /**
     *  Retrieve the value MESSAGE_ID of header XML document.
     *  @return value type String.
     */
    public String getMessageId() {
        return messageId;
    }

    /**
     *  Set the value of messageId after unmarshalling of header XML document from MESSAGE_ID.
     * @param messageId is a value MESSAGE_ID type String.
     */
    @XmlElement( name = "MESSAGE_ID" )
    @XmlJavaTypeAdapter(value= StringAdapter.class, type=String.class)
    public void setMessageId(String messageId) {
        this.messageId = messageId;
    }

    /**
     *  Retrieve the value OWN_NUM of header XML document.
     *  @return value type String.
     */
    public String getOwnNum() {
        return ownNum;
    }

    /**
     *  Set the value of ownNum after unmarshalling of header XML document from OWN_NUM.
     * @param ownNum is a value OWN_NUM type String.
     */
    @XmlElement(name = "OWN_NUM")
    @XmlJavaTypeAdapter(value= StringAdapter.class, type=String.class)
    public void setOwnNum(String ownNum) {
        this.ownNum = ownNum;
    }

    /**
     *  Retrieve the value OWN_DATE of header XML document.
     *  @return value type String.
     */
    public String getOwnDate() {
        return ownDate;
    }

    /**
     *  Set the value of ownDate after unmarshalling of header XML document from OWN_DATE.
     * @param ownDate is a value OWN_DATE type String.
     */
    @XmlElement( name = "OWN_DATE" )
    @XmlJavaTypeAdapter(value= StringAdapter.class, type=String.class)
    public void setOwnDate(String ownDate) {
        this.ownDate = ownDate;
    }

    /**
     *  Retrieve the value Timestamp of header XML document.
     *  @return value type String.
     */
    public String getTimestamp() {
        return timestamp;
    }

    /**
     *  Set the value of timestamp after unmarshalling of header XML document from TIMESTAMP.
     * @param timestamp is a value TIMESTAMP type String.
     */
    @XmlElement( name = "TIMESTAMP")
    @XmlJavaTypeAdapter(value= StringAdapter.class, type=String.class)
    public void setTimestamp(String timestamp) {
        this.timestamp = timestamp;
    }

    /**
     *  Retrieve the value COPY of header XML document.
     *  @return value type String.
     */
    public String getCopy() {
        return copy;
    }

    /**
     *  Set the value of copy after unmarshalling of header XML document from COPY.
     * @param copy is a value COPY type String.
     */
    @XmlElement( name = "COPY" )
    @XmlJavaTypeAdapter(value= StringAdapter.class, type=String.class)
    public void setCopy(String copy) {
        this.copy = copy;
    }

    /**
     *  Retrieve the value CT_ID of header XML document.
     *  @return value type String.
     */
    public String getCtId() {
        return ctId;
    }

    /**
     *  Set the value of ctId after unmarshalling of header XML document from CT_ID.
     * @param ctId is a value CT_ID type String.
     */
    @XmlElement( name = "CT_ID" )
    @XmlJavaTypeAdapter(value= StringAdapter.class, type=String.class)
    public void setCtId(String ctId) {
        this.ctId = ctId;
    }

    /**
     * Overriding method toString()  for generate string field which contains al value fields<br>
     *     for printing values object.
     * @return value type String.
     * */
    @Override
    public String toString() {
        return "Header{" +
                "docId='" + docId + '\'' +
                ", dtpId='" + dtpId + '\'' +
                ", version='" + version + '\'' +
                ", sender='" + sender + '\'' +
                ", senderId='" + senderId + '\'' +
                ", messageId='" + messageId + '\'' +
                ", ownNum='" + ownNum + '\'' +
                ", ownDate='" + ownDate + '\'' +
                ", timestamp='" + timestamp + '\'' +
                ", copy='" + copy + '\'' +
                ", ctId='" + ctId + '\'' +
                '}';
    }
}