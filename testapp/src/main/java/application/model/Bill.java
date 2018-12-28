package application.model;

import application.create.StringAdapter;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlElementWrapper;
import javax.xml.bind.annotation.XmlRootElement;
import javax.xml.bind.annotation.XmlType;
import javax.xml.bind.annotation.adapters.XmlJavaTypeAdapter;
import java.util.List;


/**
 * This is a simple class for creating element of list Bills.
 * @see Bill
 * @see #setBillNum(String)
 * @see #getBillNum()
 * @see #setBillDate(String)
 * @see #getBillDate()
 * @see #setCsgName(String)
 * @see #getCsgName()
 * @see #setSenderCountry(String)
 * @see #getSenderCountry()
 * @see #setSenderPort(String)
 * @see #setConsigneeCountry(String)
 * @see #getConsigneeCountry()
 * @see #setConsigneePort(String)
 * @see #getConsigneePort()
 * @see #setContainer(List)
 * @see #getContainer()
 * @see #setCustomsCode(String)
 * @see #getCustomsCode()
 * @see #setSndName(String)
 * @see #getSndName()
 * @see #setSndEdrpo(String)
 * @see #getSndEdrpo()
 * @see #setSndAdr(String)
 * @see #getSndAdr()
 * @see #setCsgAdr(String)
 * @see #getCsgAdr()
 * @see #setIndName(String)
 * @see #getIndName()
 * @see #setIndEdrpo(String)
 * @see #getIndEdrpo()
 * @see #setIndAdr(String)
 * @see #getIndAdr()
 * @see #setNtfName(String)
 * @see #getNtfName()
 * @see #setTransitCountries(String)
 * @see #getTransitCountries()
 * @see #toString()
 * @author Roman Borysenko ramzes198725@gmail.com
 */
@XmlRootElement( name = "BILL" )
/*order of formation of fields for creating XML file*/
@XmlType(propOrder={"billNum","billDate","csgName","senderCountry","senderPort", "consigneeCountry",
"consigneePort","container","customsCode","sndName","sndEdrpo","sndAdr","csgAdr","indName","indEdrpo",
"indAdr","ntfName","transitCountries"})
public class Bill {
    private String billNum;
    private String billDate;
    private String csgName;
    private String senderCountry;
    private String senderPort;
    private String consigneeCountry;
    private String consigneePort;
    private List<Container> container;
    private String customsCode;
    private String sndName;
    private String sndEdrpo;
    private String sndAdr;
    private String csgAdr;
    private String indName;
    private String indEdrpo;
    private String indAdr;
    private String NtfName;
    private String transitCountries;

    /**
     *  Retrieve the value BILL_NUM.
     *  @return value type String.
     */
    public String getBillNum() {
        return billNum;
    }

    /**
     *  Set the value of billNum after unmarshalling list of BILLS from XML document from BILL_NUM.
     * @param billNum is a value BILL_NUM type String.
     */
    @XmlElement( name = "BILL_NUM")
    @XmlJavaTypeAdapter(value= StringAdapter.class, type=String.class)
    public void setBillNum(String billNum) {
        this.billNum = billNum;
    }

    /**
     *  Retrieve the value BILL_DATE.
     *  @return value type String.
     */
    public String getBillDate() {
        return billDate;
    }

    /**
     *  Set the value of billDate after unmarshalling list of BILLS from XML document from BILL_DATE.
     * @param billDate is a value BILL_DATE type String.
     */
    @XmlElement( name = "BILL_DATE")
    @XmlJavaTypeAdapter(value= StringAdapter.class, type=String.class)
    public void setBillDate(String billDate) {
        this.billDate = billDate;
    }

    /**
     *  Retrieve the value CSG_NAME.
     *  @return value type String.
     */
    public String getCsgName() {
        return csgName;
    }

    /**
     *  Set the value of csgName after unmarshalling list of BILLS from XML document from CSG_NAME.
     * @param csgName is a value CSG_NAME type String.
     */
    @XmlElement( name = "CSG_NAME")
    @XmlJavaTypeAdapter(value= StringAdapter.class, type=String.class)
    public void setCsgName(String csgName) {
        this.csgName = csgName;
    }

    /**
     *  Retrieve the value SENDER_COUNTRY.
     *  @return value type String.
     */
    public String getSenderCountry() {
        return senderCountry;
    }

    /**
     *  Set the value of senderCountry after unmarshalling list of BILLS from XML document from SENDER_COUNTRY.
     * @param senderCountry is a value SENDER_COUNTRY type String.
     */
    @XmlElement( name = "SENDER_COUNTRY")
    @XmlJavaTypeAdapter(value= StringAdapter.class, type=String.class)
    public void setSenderCountry(String senderCountry) {
        this.senderCountry = senderCountry;
    }

    /**
     *  Retrieve the value SENDER_PORT.
     *  @return value type String.
     */
    public String getSenderPort() {
        return senderPort;
    }

    /**
     *  Set the value of senderPort after unmarshalling list of BILLS from XML document from SENDER_PORT.
     * @param senderPort is a value SENDER_PORT type String.
     */
    @XmlElement( name = "SENDER_PORT")
    @XmlJavaTypeAdapter(value= StringAdapter.class, type=String.class)
    public void setSenderPort(String senderPort) {
        this.senderPort = senderPort;
    }

    /**
     *  Retrieve the value CONSIGNEE_COUNTRY.
     *  @return value type String.
     */
    public String getConsigneeCountry() {
        return consigneeCountry;
    }

    /**
     *  Set the value of consigneeCountry after unmarshalling list of BILLS from XML document from CONSIGNEE_COUNTRY.
     * @param consigneeCountry is a value CONSIGNEE_COUNTRY type String.
     */
    @XmlElement( name = "CONSIGNEE_COUNTRY")
    @XmlJavaTypeAdapter(value= StringAdapter.class, type=String.class)
    public void setConsigneeCountry(String consigneeCountry) {
        this.consigneeCountry = consigneeCountry;
    }

    /**
     *  Retrieve the value CONSIGNEE_PORT.
     *  @return value type String.
     */
    public String getConsigneePort() {
        return consigneePort;
    }

    /**
     *  Set the value of consigneePort after unmarshalling list of BILLS from XML document from CONSIGNEE_PORT.
     * @param consigneePort is a value CONSIGNEE_PORT type String.
     */
    @XmlElement( name = "CONSIGNEE_PORT")
    @XmlJavaTypeAdapter(value= StringAdapter.class, type=String.class)
    public void setConsigneePort(String consigneePort) {
        this.consigneePort = consigneePort;
    }

    /**
     *  Retrieve the list of containers for current BILL.
     *  @return value type List<Container>.
     * @see  Container
     */
    public List<Container> getContainer() {
        return container;
    }

    /**
     *  Set the list containers for current BILL from BILLS.
     * @param container is a list of containers type List<Container>.
     * @see Container
     */
    @XmlElementWrapper(name="CONTAINERS")
    @XmlElement(name="CONTAINER")
    public void setContainer(List<Container> container) {
        this.container = container;
    }

    /**
     *  Retrieve the value CUSTOM_CODE.
     *  @return value type String.
     */
    public String getCustomsCode() {
        return customsCode;
    }

    /**
     *  Set the value of customsCode after unmarshalling list of BILLS from XML document from CUSTOMS_CODE.
     * @param customsCode is a value CUSTOMS_CODE type String.
     */
    @XmlElement( name = "CUSTOMS_CODE")
    @XmlJavaTypeAdapter(value= StringAdapter.class, type=String.class)
    public void setCustomsCode(String customsCode) {
        this.customsCode = customsCode;
    }

    /**
     *  Retrieve the value SND_NAME.
     *  @return value type String.
     */
    public String getSndName() {
        return sndName;
    }

    /**
     *  Set the value of sndName after unmarshalling list of BILLS from XML document from SND_NAME.
     * @param sndName is a value SND_NAME type String.
     */
    @XmlElement( name = "SND_NAME")
    @XmlJavaTypeAdapter(value= StringAdapter.class, type=String.class)
    public void setSndName(String sndName) {
        this.sndName = sndName;
    }

    /**
     *  Retrieve the value SND_EDRPO.
     *  @return value type String.
     */
    public String getSndEdrpo() {
        return sndEdrpo;
    }

    /**
     *  Set the value of sndEdrpo after unmarshalling list of BILLS from XML document from SND_EDRPO.
     * @param sndEdrpo is a value SND_EDRPO type String.
     */
    @XmlElement( name = "SND_EDRPO")
    @XmlJavaTypeAdapter(value= StringAdapter.class, type=String.class)
    public void setSndEdrpo(String sndEdrpo) {
        this.sndEdrpo = sndEdrpo;
    }

    /**
     *  Retrieve the value SNA_ADR.
     *  @return value type String.
     */
    public String getSndAdr() {
        return sndAdr;
    }

    /**
     *  Set the value of sndAdr after unmarshalling list of BILLS from XML document from SND_ADR.
     * @param sndAdr is a value SND_ADR type String.
     */
    @XmlElement( name = "SND_ADR")
    @XmlJavaTypeAdapter(value= StringAdapter.class, type=String.class)
    public void setSndAdr(String sndAdr) {
        this.sndAdr = sndAdr;
    }

    /**
     *  Retrieve the value CSG_ADR.
     *  @return value type String.
     */
    public String getCsgAdr() {
        return csgAdr;
    }

    /**
     *  Set the value of csgAdr after unmarshalling list of BILLS from XML document from CSG_ADR.
     * @param csgAdr is a value CSG_ADR type String.
     */
    @XmlElement( name = "CSG_ADR")
    @XmlJavaTypeAdapter(value= StringAdapter.class, type=String.class)
    public void setCsgAdr(String csgAdr) {
        this.csgAdr = csgAdr;
    }

    /**
     *  Retrieve the value IND_NAME.
     *  @return value type String.
     */
    public String getIndName() {
        return indName;
    }

    /**
     *  Set the value of indName after unmarshalling list of BILLS from XML document from IND_NAME.
     * @param indName is a value IND_NAME type String.
     */
    @XmlElement( name = "IND_NAME")
    @XmlJavaTypeAdapter(value= StringAdapter.class, type=String.class)
    public void setIndName(String indName) {
        this.indName = indName;
    }

    /**
     *  Retrieve the value IND_EDRPO.
     *  @return value type String.
     */
    public String getIndEdrpo() {
        return indEdrpo;
    }

    /**
     *  Set the value of indEdrpo after unmarshalling list of BILLS from XML document from IND_EDRPO.
     * @param indEdrpo is a value IND_EDRPO type String.
     */
    @XmlElement( name = "IND_EDRPO")
    @XmlJavaTypeAdapter(value= StringAdapter.class, type=String.class)
    public void setIndEdrpo(String indEdrpo) {
        this.indEdrpo = indEdrpo;
    }

    /**
     *  Retrieve the value IND_ADR.
     *  @return value type String.
     */
    public String getIndAdr() {
        return indAdr;
    }

    /**
     *  Set the value of indAdr after unmarshalling list of BILLS from XML document from IND_ADR.
     * @param indAdr is a value IND_ADR type String.
     */
    @XmlElement( name = "IND_ADR")
    @XmlJavaTypeAdapter(value= StringAdapter.class, type=String.class)
    public void setIndAdr(String indAdr) {
        this.indAdr = indAdr;
    }

    /**
     *  Retrieve the value NTF_NAME.
     *  @return value type String.
     */
    public String getNtfName() {
        return NtfName;
    }

    /**
     *  Set the value of ntfName after unmarshalling list of BILLS from XML document from NTF_NAME.
     * @param ntfName is a value NTF_NAME type String.
     */
    @XmlElement( name = "NTF_NAME")
    @XmlJavaTypeAdapter(value= StringAdapter.class, type=String.class)
    public void setNtfName(String ntfName) {
        NtfName = ntfName;
    }

    /**
     *  Retrieve the value TRANSIT_COUNTRIES.
     *  @return value type String.
     */
    public String getTransitCountries() {
        return transitCountries;
    }

    /**
     *  Set the value of transitCountries after unmarshalling list of BILLS from XML document from TRANSIT_COUNTRIES.
     * @param transitCountries is a value TRANSIT_COUNTRIES type String.
     */
    @XmlElement( name = "TRANSIT_COUNTRIES")
    @XmlJavaTypeAdapter(value= StringAdapter.class, type=String.class)
    public void setTransitCountries(String transitCountries) {
        this.transitCountries = transitCountries;
    }

    /**
     * Overriding method toString()  for generate string field which contains al value fields<br>
     *     for printing values object.
     * @return value type String.
     * */
    @Override
    public String toString() {
        return "Bill{\n" +
                "billNum='" + billNum + '\'' +
                ", billDate=" + billDate +
                ", csgName='" + csgName + '\'' +
                ", senderCountry='" + senderCountry + '\'' +
                ", senderPort='" + senderPort + '\'' +
                ", consigneeCountry='" + consigneeCountry + '\'' +
                ", consigneePort='" + consigneePort + '\'' +
                ", container=" + container +
                ", customsCode='" + customsCode + '\'' +
                ", sndName='" + sndName + '\'' +
                ", sndEdrpo='" + sndEdrpo + '\'' +
                ", sndAdr='" + sndAdr + '\'' +
                ", csgAdr='" + csgAdr + '\'' +
                ", indName='" + indName + '\'' +
                ", indEdrpo='" + indEdrpo + '\'' +
                ", indAdr='" + indAdr + '\'' +
                ", NtfName='" + NtfName + '\'' +
                ", transitCountries='" + transitCountries + '\'' +
                '}';
    }
}