//
// This file was generated by the JavaTM Architecture for XML Binding(JAXB) Reference Implementation, v2.2.4 
// See <a href="http://java.sun.com/xml/jaxb">http://java.sun.com/xml/jaxb</a> 
// Any modifications to this file will be lost upon recompilation of the source schema. 
// Generated on: 2014.10.04 at 10:45:11 AM EDT 
//


package eu.datex2.schema._2_0rc1._2_0;

import java.math.BigInteger;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for HazardousMaterials complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="HazardousMaterials">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="chemicalName" type="{http://datex2.eu/schema/2_0RC1/2_0}MultilingualString"/>
 *         &lt;element name="dangerousGoodsFlashPoint" type="{http://datex2.eu/schema/2_0RC1/2_0}TemperatureCelsius" minOccurs="0"/>
 *         &lt;element name="dangerousGoodsRegulations" type="{http://datex2.eu/schema/2_0RC1/2_0}DangerousGoodsRegulationsEnum" minOccurs="0"/>
 *         &lt;element name="hazardCodeIdentification" type="{http://datex2.eu/schema/2_0RC1/2_0}String" minOccurs="0"/>
 *         &lt;element name="hazardCodeVersionNumber" type="{http://datex2.eu/schema/2_0RC1/2_0}NonNegativeInteger" minOccurs="0"/>
 *         &lt;element name="hazardSubstanceItemPageNumber" type="{http://datex2.eu/schema/2_0RC1/2_0}String" minOccurs="0"/>
 *         &lt;element name="tremCardNumber" type="{http://datex2.eu/schema/2_0RC1/2_0}String" minOccurs="0"/>
 *         &lt;element name="undgNumber" type="{http://datex2.eu/schema/2_0RC1/2_0}String" minOccurs="0"/>
 *         &lt;element name="volumeOfDangerousGoods" type="{http://datex2.eu/schema/2_0RC1/2_0}CubicMetres" minOccurs="0"/>
 *         &lt;element name="weightOfDangerousGoods" type="{http://datex2.eu/schema/2_0RC1/2_0}Tonnes" minOccurs="0"/>
 *         &lt;element name="hazardousMaterialsExtension" type="{http://datex2.eu/schema/2_0RC1/2_0}ExtensionType" minOccurs="0"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "HazardousMaterials", propOrder = {
    "chemicalName",
    "dangerousGoodsFlashPoint",
    "dangerousGoodsRegulations",
    "hazardCodeIdentification",
    "hazardCodeVersionNumber",
    "hazardSubstanceItemPageNumber",
    "tremCardNumber",
    "undgNumber",
    "volumeOfDangerousGoods",
    "weightOfDangerousGoods",
    "hazardousMaterialsExtension"
})
public class HazardousMaterials {

    @XmlElement(required = true)
    protected MultilingualString chemicalName;
    protected Float dangerousGoodsFlashPoint;
    protected DangerousGoodsRegulationsEnum dangerousGoodsRegulations;
    protected String hazardCodeIdentification;
    protected BigInteger hazardCodeVersionNumber;
    protected String hazardSubstanceItemPageNumber;
    protected String tremCardNumber;
    protected String undgNumber;
    protected Float volumeOfDangerousGoods;
    protected Float weightOfDangerousGoods;
    protected ExtensionType hazardousMaterialsExtension;

    /**
     * Gets the value of the chemicalName property.
     * 
     * @return
     *     possible object is
     *     {@link MultilingualString }
     *     
     */
    public MultilingualString getChemicalName() {
        return chemicalName;
    }

    /**
     * Sets the value of the chemicalName property.
     * 
     * @param value
     *     allowed object is
     *     {@link MultilingualString }
     *     
     */
    public void setChemicalName(MultilingualString value) {
        this.chemicalName = value;
    }

    /**
     * Gets the value of the dangerousGoodsFlashPoint property.
     * 
     * @return
     *     possible object is
     *     {@link Float }
     *     
     */
    public Float getDangerousGoodsFlashPoint() {
        return dangerousGoodsFlashPoint;
    }

    /**
     * Sets the value of the dangerousGoodsFlashPoint property.
     * 
     * @param value
     *     allowed object is
     *     {@link Float }
     *     
     */
    public void setDangerousGoodsFlashPoint(Float value) {
        this.dangerousGoodsFlashPoint = value;
    }

    /**
     * Gets the value of the dangerousGoodsRegulations property.
     * 
     * @return
     *     possible object is
     *     {@link DangerousGoodsRegulationsEnum }
     *     
     */
    public DangerousGoodsRegulationsEnum getDangerousGoodsRegulations() {
        return dangerousGoodsRegulations;
    }

    /**
     * Sets the value of the dangerousGoodsRegulations property.
     * 
     * @param value
     *     allowed object is
     *     {@link DangerousGoodsRegulationsEnum }
     *     
     */
    public void setDangerousGoodsRegulations(DangerousGoodsRegulationsEnum value) {
        this.dangerousGoodsRegulations = value;
    }

    /**
     * Gets the value of the hazardCodeIdentification property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getHazardCodeIdentification() {
        return hazardCodeIdentification;
    }

    /**
     * Sets the value of the hazardCodeIdentification property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setHazardCodeIdentification(String value) {
        this.hazardCodeIdentification = value;
    }

    /**
     * Gets the value of the hazardCodeVersionNumber property.
     * 
     * @return
     *     possible object is
     *     {@link BigInteger }
     *     
     */
    public BigInteger getHazardCodeVersionNumber() {
        return hazardCodeVersionNumber;
    }

    /**
     * Sets the value of the hazardCodeVersionNumber property.
     * 
     * @param value
     *     allowed object is
     *     {@link BigInteger }
     *     
     */
    public void setHazardCodeVersionNumber(BigInteger value) {
        this.hazardCodeVersionNumber = value;
    }

    /**
     * Gets the value of the hazardSubstanceItemPageNumber property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getHazardSubstanceItemPageNumber() {
        return hazardSubstanceItemPageNumber;
    }

    /**
     * Sets the value of the hazardSubstanceItemPageNumber property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setHazardSubstanceItemPageNumber(String value) {
        this.hazardSubstanceItemPageNumber = value;
    }

    /**
     * Gets the value of the tremCardNumber property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getTremCardNumber() {
        return tremCardNumber;
    }

    /**
     * Sets the value of the tremCardNumber property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setTremCardNumber(String value) {
        this.tremCardNumber = value;
    }

    /**
     * Gets the value of the undgNumber property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getUndgNumber() {
        return undgNumber;
    }

    /**
     * Sets the value of the undgNumber property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setUndgNumber(String value) {
        this.undgNumber = value;
    }

    /**
     * Gets the value of the volumeOfDangerousGoods property.
     * 
     * @return
     *     possible object is
     *     {@link Float }
     *     
     */
    public Float getVolumeOfDangerousGoods() {
        return volumeOfDangerousGoods;
    }

    /**
     * Sets the value of the volumeOfDangerousGoods property.
     * 
     * @param value
     *     allowed object is
     *     {@link Float }
     *     
     */
    public void setVolumeOfDangerousGoods(Float value) {
        this.volumeOfDangerousGoods = value;
    }

    /**
     * Gets the value of the weightOfDangerousGoods property.
     * 
     * @return
     *     possible object is
     *     {@link Float }
     *     
     */
    public Float getWeightOfDangerousGoods() {
        return weightOfDangerousGoods;
    }

    /**
     * Sets the value of the weightOfDangerousGoods property.
     * 
     * @param value
     *     allowed object is
     *     {@link Float }
     *     
     */
    public void setWeightOfDangerousGoods(Float value) {
        this.weightOfDangerousGoods = value;
    }

    /**
     * Gets the value of the hazardousMaterialsExtension property.
     * 
     * @return
     *     possible object is
     *     {@link ExtensionType }
     *     
     */
    public ExtensionType getHazardousMaterialsExtension() {
        return hazardousMaterialsExtension;
    }

    /**
     * Sets the value of the hazardousMaterialsExtension property.
     * 
     * @param value
     *     allowed object is
     *     {@link ExtensionType }
     *     
     */
    public void setHazardousMaterialsExtension(ExtensionType value) {
        this.hazardousMaterialsExtension = value;
    }

}
