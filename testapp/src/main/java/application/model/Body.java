package application.model;

import application.create.StringAdapter;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlElementWrapper;
import javax.xml.bind.annotation.XmlRootElement;
import javax.xml.bind.annotation.XmlType;
import javax.xml.bind.annotation.adapters.XmlJavaTypeAdapter;
import java.util.List;

/**
 * This is a simple class for creating header of XML document.
 * @see Body
 * @see #setOprType(String)
 * @see #getOprType()
 * @see #setDocShrId(String)
 * @see #getDocShrId()
 * @see #setTripNum(String)
 * @see #getTripNum()
 * @see #setShipName(String)
 * @see #getShipName()
 * @see #setAgeId(String)
 * @see #getAgeId()
 * @see #setBill(List)
 * @see #getBill()
 * @see #toString()
 * @author Roman Borysenko ramzes198725@gmail.com
 */
@XmlRootElement( name = "BODY" )
/*order of formation of fields for creating XML file*/
@XmlType(propOrder={"oprType","docShrId","tripNum","shipName","ageId","bill"})
public class Body {
    private String oprType;
    private String docShrId;
    private String tripNum;
    private String shipName;
    private String ageId;
    private List<Bill> bills;

    /**
     *  Retrieve the value OPR_TYPE of body XML document.
     *  @return value type String.
     */
    public String getOprType() {
        return oprType;
    }

    /**
     *  Set the value of oprType after unmarshalling of body XML document from OPR_TYPE.
     * @param oprType is a value OPR_TYPE type String.
     */
    @XmlElement( name = "OPR_TYPE" )
    @XmlJavaTypeAdapter(value= StringAdapter.class, type=String.class)
    public void setOprType(String oprType) {
        this.oprType = oprType;
    }

    /**
     *  Retrieve the value DOC_SHR_ID of body XML document.
     *  @return value type String.
     */
    public String getDocShrId() {
        return docShrId;
    }

    /**
     *  Set the value of docShrId after unmarshalling of body XML document from DOC_SHR_ID.
     * @param docShrId is a value DOC_SHR_ID type String.
     */
    @XmlElement( name = "DOC_SHR_ID" )
    @XmlJavaTypeAdapter(value= StringAdapter.class, type=String.class)
    public void setDocShrId(String docShrId) {
        this.docShrId = docShrId;
    }

    /**
     *  Retrieve the value TRIP_NUM of body XML document.
     *  @return value type String.
     */
    public String getTripNum() {
        return tripNum;
    }

    /**
     *  Set the value of tripNum after unmarshalling of body XML document from TRIP_NUM.
     * @param tripNum is a value TRIP_NUM type String.
     */
    @XmlElement( name = "TRIP_NUM" )
    @XmlJavaTypeAdapter(value= StringAdapter.class, type=String.class)
    public void setTripNum(String tripNum) {
        this.tripNum = tripNum;
    }

    /**
     *  Retrieve the value SHIP_NAME of body XML document.
     *  @return value type String.
     */
    public String getShipName() {
        return shipName;
    }

    /**
     *  Set the value of shipName after unmarshalling of body XML document from SHIP_NAME.
     * @param shipName is a value SHIP_NAME type String.
     */
    @XmlElement( name = "SHIP_NAME" )
    @XmlJavaTypeAdapter(value= StringAdapter.class, type=String.class)
    public void setShipName(String shipName) {
        this.shipName = shipName;
    }

    /**
     *  Retrieve the value AGE_ID of body XML document.
     *  @return value type String.
     */
    public String getAgeId() {
        return ageId;
    }

    /**
     *  Set the value of ageId after unmarshalling of body XML document from AGE_ID.
     * @param ageId is a value AGE_ID type String.
     */
    @XmlElement( name = "AGE_ID" )
    @XmlJavaTypeAdapter(value= StringAdapter.class, type=String.class)
    public void setAgeId(String ageId) {
        this.ageId = ageId;
    }

    /**
     *  Retrieve the list BILLS of body XML document.
     *  @return value type List<Bill>.
     * @see Bill
     */
    public List<Bill> getBill() {
        return bills;
    }
    /**
     *  Set the list values of bills after unmarshalling of body XML document from BILLS.
     * @param bills is a list BILL type List<Bill>.
     * @see Bill
     */
    @XmlElementWrapper(name="BILLS")
    @XmlElement(name="BILL")
    public void setBill(List<Bill> bills) {
        this.bills = bills;
    }

    /**
     * Overriding method toString()  for generate string field which contains al value fields<br>
     *     for printing values object.
     * @return value type String.
     * */
    @Override
    public String toString() {
        return "Body{" +
                "oprType='" + oprType + '\'' +
                ", docShrId='" + docShrId + '\'' +
                ", tripNum=" + tripNum +
                ", shipName='" + shipName + '\'' +
                ", ageId='" + ageId + '\'' +
                ", bills=" + bills +
                '}';
    }
}