package application.model;

import application.create.StringAdapter;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlRootElement;
import javax.xml.bind.annotation.XmlType;
import javax.xml.bind.annotation.adapters.XmlJavaTypeAdapter;

/**
 * This is a simple class for creating element of list Cargoes.
 * @see Container
 * @see #setGoodsName(String)
 * @see #getGoodsName()
 * @see #setGoodsCode(String)
 * @see #getGoodsCode()
 * @see #setNetto(String)
 * @see #getNetto()
 * @see #setGross(String)
 * @see #getGross()
 * @see #setPakage(String)
 * @see #getPakage()
 * @see #setPieces(String)
 * @see #getPieces()
 * @see #setDangerClass(String)
 * @see #getDangerClass()
 * @see #setDangerCode(String)
 * @see #getDangerCode()
 * @see #toString()
 * @author Roman Borysenko ramzes198725@gmail.com
 */
@XmlRootElement( name = "CARGO" )
/*order of formation of fields for creating XML file*/
@XmlType(propOrder={"goodsName","goodsCode","netto","gross","pakage","pieces","dangerClass","dangerCode"})
public class Cargo extends Bill{
    private String goodsName;
    private String goodsCode;
    private String netto;
    private String gross;
    private String pakage;
    private String pieces;
    private String dangerClass;
    private String dangerCode;

    /**
     *  Retrieve the value GOODS_NAME.
     *  @return value type String.
     */
    public String getGoodsName() {
        return goodsName;
    }

    /**
     *  Set the value of goodsName after unmarshalling list of CARGOES from XML document
     *  from GOODS_NAME.
     * @param goodsName is a value GOODS_NAME type String.
     */
    @XmlElement( name = "GOODS_NAME")
    @XmlJavaTypeAdapter(value= StringAdapter.class, type=String.class)
    public void setGoodsName(String goodsName) {
        this.goodsName = goodsName;
    }

    /**
     *  Retrieve the value GOODS_CODE.
     *  @return value type String.
     */
    public String getGoodsCode() {
        return goodsCode;
    }

    /**
     *  Set the value of goodsCode after unmarshalling list of CARGOES from XML document
     *  from GOODS_CODE.
     * @param goodsCode is a value GOODS_CODE type String.
     */
    @XmlElement( name = "GOODS_CODE")
    @XmlJavaTypeAdapter(value= StringAdapter.class, type=String.class)
    public void setGoodsCode(String goodsCode) {
        this.goodsCode = goodsCode;
    }

    /**
     *  Retrieve the value NETTO.
     *  @return value type String.
     */
    public String getNetto() {
        return netto;
    }

    /**
     *  Set the value of netto after unmarshalling list of CARGOES from XML document
     *  from NETTO.
     * @param netto is a value NETTO type String.
     */
    @XmlElement( name = "NETTO")
    @XmlJavaTypeAdapter(value= StringAdapter.class, type=String.class)
    public void setNetto(String netto) {
        this.netto = netto;
    }

    /**
     *  Retrieve the value GROSS.
     *  @return value type String.
     */
    public String getGross() {
        return gross;
    }

    /**
     *  Set the value of gross after unmarshalling list of CARGOES from XML document
     *  from GROSS.
     * @param gross is a value GROSS type String.
     */
    @XmlElement( name = "GROSS")
    @XmlJavaTypeAdapter(value= StringAdapter.class, type=String.class)
    public void setGross(String gross) {
        this.gross = gross;
    }

    /**
     *  Retrieve the value PACKAGE.
     *  @return value type String.
     */
    public String getPakage() {
        return pakage;
    }

    /**
     *  Set the value of pakage after unmarshalling list of CARGOES from XML document
     *  from PACKAGE.
     * @param pakage is a value PACKAGE type String.
     */
    @XmlElement( name = "PACKAGE")
    @XmlJavaTypeAdapter(value= StringAdapter.class, type=String.class)
    public void setPakage(String pakage) {
        this.pakage = pakage;
    }

    /**
     *  Retrieve the value PIECES.
     *  @return value type String.
     */
    public String getPieces() {
        return pieces;
    }

    /**
     *  Set the value of pieces after unmarshalling list of CARGOES from XML document
     *  from PIECES.
     * @param pieces is a value PIECES type String.
     */
    @XmlElement( name = "PIECES")
    @XmlJavaTypeAdapter(value= StringAdapter.class, type=String.class)
    public void setPieces(String pieces) {
        this.pieces = pieces;
    }

    /**
     *  Retrieve the value DANGER_CLASS.
     *  @return value type String.
     */
    public String getDangerClass() {
        return dangerClass;
    }

    /**
     *  Set the value of dangerClass after unmarshalling list of CARGOES from XML document
     *  from DANGER_CLASS.
     * @param dangerClass is a value DANGER_CLASS type String.
     */
    @XmlElement( name = "DANGER_CLASS")
    @XmlJavaTypeAdapter(value= StringAdapter.class, type=String.class)
    public void setDangerClass(String dangerClass) {
        this.dangerClass = dangerClass;
    }

    /**
     *  Retrieve the value DANGER_CODE.
     *  @return value type String.
     */
    public String getDangerCode() {
        return dangerCode;
    }

    /**
     *  Set the value of dangerCode after unmarshalling list of CARGOES from XML document
     *  from DANGER_CODE.
     * @param dangerCode is a value DANGER_CODE type String.
     */
    @XmlElement( name = "DANGER_CODE")
    @XmlJavaTypeAdapter(value= StringAdapter.class, type=String.class)
    public void setDangerCode(String dangerCode) {
        this.dangerCode = dangerCode;
    }

    /**
     * Overriding method toString()  for generate string field which contains al value fields<br>
     *     for printing values object.
     * @return value type String.
     * */
    @Override
    public String toString() {
        return "Cargo{\n" +
                "goodsName='" + goodsName + '\'' +
                ", goodsCode=" + goodsCode +
                ", netto=" + netto +
                ", gross=" + gross +
                ", pakage='" + pakage + '\'' +
                ", pieces=" + pieces +
                ", dangerClass='" + dangerClass + '\'' +
                ", dangerCode=" + dangerCode +
                '}';
    }
}