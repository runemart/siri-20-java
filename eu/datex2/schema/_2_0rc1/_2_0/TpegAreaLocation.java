//
// This file was generated by the JavaTM Architecture for XML Binding(JAXB) Reference Implementation, v2.2.4 
// See <a href="http://java.sun.com/xml/jaxb">http://java.sun.com/xml/jaxb</a> 
// Any modifications to this file will be lost upon recompilation of the source schema. 
// Generated on: 2014.10.04 at 10:45:11 AM EDT 
//


package eu.datex2.schema._2_0rc1._2_0;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlSeeAlso;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for TpegAreaLocation complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="TpegAreaLocation">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="tpegAreaLocationType" type="{http://datex2.eu/schema/2_0RC1/2_0}TpegLoc01AreaLocationSubtypeEnum"/>
 *         &lt;element name="tpegHeight" type="{http://datex2.eu/schema/2_0RC1/2_0}TpegHeight" minOccurs="0"/>
 *         &lt;element name="tpegAreaLocationExtension" type="{http://datex2.eu/schema/2_0RC1/2_0}ExtensionType" minOccurs="0"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "TpegAreaLocation", propOrder = {
    "tpegAreaLocationType",
    "tpegHeight",
    "tpegAreaLocationExtension"
})
@XmlSeeAlso({
    TpegGeometricArea.class,
    TpegNamedOnlyArea.class
})
public abstract class TpegAreaLocation {

    @XmlElement(required = true)
    protected TpegLoc01AreaLocationSubtypeEnum tpegAreaLocationType;
    protected TpegHeight tpegHeight;
    protected ExtensionType tpegAreaLocationExtension;

    /**
     * Gets the value of the tpegAreaLocationType property.
     * 
     * @return
     *     possible object is
     *     {@link TpegLoc01AreaLocationSubtypeEnum }
     *     
     */
    public TpegLoc01AreaLocationSubtypeEnum getTpegAreaLocationType() {
        return tpegAreaLocationType;
    }

    /**
     * Sets the value of the tpegAreaLocationType property.
     * 
     * @param value
     *     allowed object is
     *     {@link TpegLoc01AreaLocationSubtypeEnum }
     *     
     */
    public void setTpegAreaLocationType(TpegLoc01AreaLocationSubtypeEnum value) {
        this.tpegAreaLocationType = value;
    }

    /**
     * Gets the value of the tpegHeight property.
     * 
     * @return
     *     possible object is
     *     {@link TpegHeight }
     *     
     */
    public TpegHeight getTpegHeight() {
        return tpegHeight;
    }

    /**
     * Sets the value of the tpegHeight property.
     * 
     * @param value
     *     allowed object is
     *     {@link TpegHeight }
     *     
     */
    public void setTpegHeight(TpegHeight value) {
        this.tpegHeight = value;
    }

    /**
     * Gets the value of the tpegAreaLocationExtension property.
     * 
     * @return
     *     possible object is
     *     {@link ExtensionType }
     *     
     */
    public ExtensionType getTpegAreaLocationExtension() {
        return tpegAreaLocationExtension;
    }

    /**
     * Sets the value of the tpegAreaLocationExtension property.
     * 
     * @param value
     *     allowed object is
     *     {@link ExtensionType }
     *     
     */
    public void setTpegAreaLocationExtension(ExtensionType value) {
        this.tpegAreaLocationExtension = value;
    }

}
