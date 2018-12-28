package application.model;

import application.create.StringAdapter;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlElementWrapper;
import javax.xml.bind.annotation.XmlRootElement;
import javax.xml.bind.annotation.XmlType;
import javax.xml.bind.annotation.adapters.XmlJavaTypeAdapter;
import java.util.List;

/**
 * This is a simple class for creating element of list Containers.
 * @see Container
 * @see #setMode(String)
 * @see #getMode()
 * @see #setCrunId(String)
 * @see #getCrunId()
 * @see #setContainerNum(String)
 * @see #getContainerNum()
 * @see #setContainerType(String)
 * @see #getContainerType()
 * @see #setCargoes(List)
 * @see #getCargoes()
 * @see #setFullWeight(String)
 * @see #getFullWeight()
 * @see #setLine(String)
 * @see #getLine()
 * @see #setBooking(String)
 * @see #getBooking()
 * @see #setMovType(String)
 * @see #getMovType()
 * @see #setOprTimestamp(String)
 * @see #getOprTimestamp()
 * @see #setEf(String)
 * @see #getEf()
 * @see #setSeals(String)
 * @see #getSeals()
 * @see #setFrwName(String)
 * @see #getFrwName()
 * @see #setFrwEdrpo(String)
 * @see #getFrwEdrpo()
 * @see #toString()
 * @author Roman Borysenko ramzes198725@gmail.com
 */
@XmlRootElement( name = "CONTAINER")
/*order of formation of fields for creating XML file*/
@XmlType(propOrder={"mode","crunId","containerNum","containerType","cargoes","fullWeight","line","booking",
"movType","oprTimestamp","ef","seals","frwName","frwEdrpo"})
public class Container {
    private String mode;
    private String crunId;
    private String containerNum;
    private String containerType;
    private List<Cargo> cargoes;
    private String fullWeight;
    private String line;
    private String booking;
    private String movType;
    private String oprTimestamp;
    private String ef;
    private String seals;
    private String frwName;
    private String frwEdrpo;

    /**
     *  Retrieve the value MODE.
     *  @return value type String.
     */
    public String getMode() {
        return mode;
    }

    /**
     *  Set the value of mode after unmarshalling list of CONTAINERS from XML document
     *  from MODE.
     * @param mode is a value MODE type String.
     */
    @XmlElement( name = "MODE")
    @XmlJavaTypeAdapter(value= StringAdapter.class, type=String.class)
    public void setMode(String mode) {
        this.mode = mode;
    }

    /**
     *  Retrieve the value CRUN_ID.
     *  @return value type String.
     */
    public String getCrunId() {
        return crunId;
    }

    /**
     *  Set the value of crunId after unmarshalling list of CONTAINERS from XML document
     *  from CRUN_ID.
     * @param crunId is a value CRUN_ID type String.
     */
    @XmlElement( name = "CRUN_ID")
    @XmlJavaTypeAdapter(value= StringAdapter.class, type=String.class)
    public void setCrunId(String crunId) {
        this.crunId = crunId;
    }

    /**
     *  Retrieve the value CONTAINER_NUM.
     *  @return value type String.
     */
    public String getContainerNum() {
        return containerNum;
    }

    /**
     *  Set the value of containerNum after unmarshalling list of CONTAINERS from XML document
     *  from CONTAINER_NUM.
     * @param containerNum is a value CONTAINER_NUM type String.
     */
    @XmlElement( name = "CONTAINER_NUM")
    @XmlJavaTypeAdapter(value= StringAdapter.class, type=String.class)
    public void setContainerNum(String containerNum) {
        this.containerNum = containerNum;
    }

    /**
     *  Retrieve the value CONTAINER_TYPE.
     *  @return value type String.
     */
    public String getContainerType() {
        return containerType;
    }

    /**
     *  Set the value of containerType after unmarshalling list of CONTAINERS
     *  from XML document from CONTAINER_TYPE.
     * @param containerType is a value CONTAINER_TYPE type String.
     */
    @XmlElement( name = "CONTAINER_TYPE")
    @XmlJavaTypeAdapter(value= StringAdapter.class, type=String.class)
    public void setContainerType(String containerType) {
        this.containerType = containerType;
    }

    /**
     *  Retrieve the list of Cargoes for current Container.
     *  @return value type List<Cargo>.
     * @see Cargo
     */
    public List<Cargo> getCargoes() {
        return cargoes;
    }

    /**
     *  Set the list values of list cargoes for current Container after unmarshalling
     *  list of CONTAINERS from XML document from CARGOES.
     * @param cargoes is a value CARGOES type List<Cargo>.
     * @see Cargo
     */
    @XmlElementWrapper(name="CARGOES")
    @XmlElement(name="CARGO")
    public void setCargoes(List<Cargo> cargoes) {
        this.cargoes = cargoes;
    }

    /**
     *  Retrieve the value FULLWEIGHT.
     *  @return value type String.
     */
    public String getFullWeight() {
        return fullWeight;
    }

    /**
     *  Set the value of fullWeight after unmarshalling list of CONTAINERS
     *  from XML document from FULLWEIGHT.
     * @param fullWeight is a value FULLWEIGHT type String.
     */
    @XmlElement( name = "FULLWEIGHT")
    @XmlJavaTypeAdapter(value= StringAdapter.class, type=String.class)
    public void setFullWeight(String fullWeight) {
        this.fullWeight = fullWeight;
    }

    /**
     *  Retrieve the value LINE.
     *  @return value type String.
     */
    public String getLine() {
        return line;
    }

    /**
     *  Set the value of line after unmarshalling list of CONTAINERS
     *  from XML document from LINE.
     * @param line is a value LINE type String.
     */
    @XmlElement( name = "LINE")
    @XmlJavaTypeAdapter(value= StringAdapter.class, type=String.class)
    public void setLine(String line) {
        this.line = line;
    }

    /**
     *  Retrieve the value BOOKING.
     *  @return value type String.
     */
    public String getBooking() {
        return booking;
    }

    /**
     *  Set the value of booking after unmarshalling list of CONTAINERS
     *  from XML document from BOOKING.
     * @param booking is a value BOOKING type String.
     */
    @XmlElement( name = "BOOKING")
    @XmlJavaTypeAdapter(value= StringAdapter.class, type=String.class)
    public void setBooking(String booking) {
        this.booking = booking;
    }

    /**
     *  Retrieve the value MOV_TYPE.
     *  @return value type String.
     */
    public String getMovType() {
        return movType;
    }

    /**
     *  Set the value of movType after unmarshalling list of CONTAINERS
     *  from XML document from MOV_TYPE.
     * @param movType is a value MOV_TYPE type String.
     */
    @XmlElement( name = "MOV_TYPE")
    @XmlJavaTypeAdapter(value= StringAdapter.class, type=String.class)
    public void setMovType(String movType) {
        this.movType = movType;
    }

    /**
     *  Retrieve the value OPR_TIMESTAMP.
     *  @return value type String.
     */
    public String getOprTimestamp() {
        return oprTimestamp;
    }

    /**
     *  Set the value of oprTimestamp after unmarshalling list of CONTAINERS
     *  from XML document from OPR_TIMESTAMP.
     * @param oprTimestamp is a value OPR_TIMESTAMP type String.
     */
    @XmlElement( name = "OPR_TIMESTAMP")
    @XmlJavaTypeAdapter(value= StringAdapter.class, type=String.class)
    public void setOprTimestamp(String oprTimestamp) {
        this.oprTimestamp = oprTimestamp;
    }

    /**
     *  Retrieve the value EF.
     *  @return value type String.
     */
    public String getEf() {
        return ef;
    }

    /**
     *  Set the value of ef after unmarshalling list of CONTAINERS
     *  from XML document from EF.
     * @param ef is a value EF type String.
     */
    @XmlElement( name = "EF")
    @XmlJavaTypeAdapter(value= StringAdapter.class, type=String.class)
    public void setEf(String ef) {
        this.ef = ef;
    }

    /**
     *  Retrieve the value SEALS.
     *  @return value type String.
     */
    public String getSeals() {
        return seals;
    }

    /**
     *  Set the value of seals after unmarshalling list of CONTAINERS
     *  from XML document from SEALS.
     * @param seals is a value SEALS type String.
     */
    @XmlElement( name = "SEALS")
    @XmlJavaTypeAdapter(value= StringAdapter.class, type=String.class)
    public void setSeals(String seals) {
        this.seals = seals;
    }

    /**
     *  Retrieve the value FRW_NAME.
     *  @return value type String.
     */
    public String getFrwName() {
        return frwName;
    }

    /**
     *  Set the value of frwName after unmarshalling list of CONTAINERS
     *  from XML document from FRW_NAME.
     * @param frwName is a value FRW_NAME type String.
     */
    @XmlElement( name = "FRW_NAME")
    @XmlJavaTypeAdapter(value= StringAdapter.class, type=String.class)
    public void setFrwName(String frwName) {
        this.frwName = frwName;
    }

    /**
     *  Retrieve the value FRW_EDRPO.
     *  @return value type String.
     */
    public String getFrwEdrpo() {
        return frwEdrpo;
    }

    /**
     *  Set the value of frwEdrpo after unmarshalling list of CONTAINERS
     *  from XML document from FRW_EDRPO.
     * @param frwEdrpo is a value FRW_EDRPO type String.
     */
    @XmlElement( name = "FRW_EDRPO")
    @XmlJavaTypeAdapter(value= StringAdapter.class, type=String.class)
    public void setFrwEdrpo(String frwEdrpo) {
        this.frwEdrpo = frwEdrpo;
    }

    /**
     * Overriding method toString()  for generate string field which contains al value fields<br>
     *     for printing values object.
     * @return value type String.
     * */
    @Override
    public String toString() {
        return "Container{\n" +
                "mode=" + mode +
                ", crunId=" + crunId +
                ", containerNum='" + containerNum + '\'' +
                ", containerType=" + containerType +
                ", cargoes=" + cargoes +
                ", fullWeight=" + fullWeight +
                ", line='" + line + '\'' +
                ", booking='" + booking + '\'' +
                ", movType=" + movType +
                ", oprTimestamp=" + oprTimestamp +
                ", ef='" + ef + '\'' +
                ", seals='" + seals + '\'' +
                ", frwName='" + frwName + '\'' +
                ", frwEdrpo='" + frwEdrpo + '\'' +
                '}';
    }
}