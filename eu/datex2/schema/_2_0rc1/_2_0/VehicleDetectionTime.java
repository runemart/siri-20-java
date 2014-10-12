//
// This file was generated by the JavaTM Architecture for XML Binding(JAXB) Reference Implementation, v2.2.4 
// See <a href="http://java.sun.com/xml/jaxb">http://java.sun.com/xml/jaxb</a> 
// Any modifications to this file will be lost upon recompilation of the source schema. 
// Generated on: 2014.10.04 at 10:45:11 AM EDT 
//


package eu.datex2.schema._2_0rc1._2_0;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlType;
import javax.xml.datatype.XMLGregorianCalendar;


/**
 * <p>Java class for VehicleDetectionTime complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="VehicleDetectionTime">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="arrivalTime" type="{http://datex2.eu/schema/2_0RC1/2_0}DateTime" minOccurs="0"/>
 *         &lt;element name="exitTime" type="{http://datex2.eu/schema/2_0RC1/2_0}DateTime" minOccurs="0"/>
 *         &lt;element name="passageTime" type="{http://datex2.eu/schema/2_0RC1/2_0}DateTime" minOccurs="0"/>
 *         &lt;element name="presenceTime" type="{http://datex2.eu/schema/2_0RC1/2_0}DateTime" minOccurs="0"/>
 *         &lt;element name="timeGap" type="{http://datex2.eu/schema/2_0RC1/2_0}Seconds" minOccurs="0"/>
 *         &lt;element name="timeHeadway" type="{http://datex2.eu/schema/2_0RC1/2_0}Seconds" minOccurs="0"/>
 *         &lt;element name="vehicleDetectionTimeExtension" type="{http://datex2.eu/schema/2_0RC1/2_0}ExtensionType" minOccurs="0"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "VehicleDetectionTime", propOrder = {
    "arrivalTime",
    "exitTime",
    "passageTime",
    "presenceTime",
    "timeGap",
    "timeHeadway",
    "vehicleDetectionTimeExtension"
})
public class VehicleDetectionTime {

    protected XMLGregorianCalendar arrivalTime;
    protected XMLGregorianCalendar exitTime;
    protected XMLGregorianCalendar passageTime;
    protected XMLGregorianCalendar presenceTime;
    protected Float timeGap;
    protected Float timeHeadway;
    protected ExtensionType vehicleDetectionTimeExtension;

    /**
     * Gets the value of the arrivalTime property.
     * 
     * @return
     *     possible object is
     *     {@link XMLGregorianCalendar }
     *     
     */
    public XMLGregorianCalendar getArrivalTime() {
        return arrivalTime;
    }

    /**
     * Sets the value of the arrivalTime property.
     * 
     * @param value
     *     allowed object is
     *     {@link XMLGregorianCalendar }
     *     
     */
    public void setArrivalTime(XMLGregorianCalendar value) {
        this.arrivalTime = value;
    }

    /**
     * Gets the value of the exitTime property.
     * 
     * @return
     *     possible object is
     *     {@link XMLGregorianCalendar }
     *     
     */
    public XMLGregorianCalendar getExitTime() {
        return exitTime;
    }

    /**
     * Sets the value of the exitTime property.
     * 
     * @param value
     *     allowed object is
     *     {@link XMLGregorianCalendar }
     *     
     */
    public void setExitTime(XMLGregorianCalendar value) {
        this.exitTime = value;
    }

    /**
     * Gets the value of the passageTime property.
     * 
     * @return
     *     possible object is
     *     {@link XMLGregorianCalendar }
     *     
     */
    public XMLGregorianCalendar getPassageTime() {
        return passageTime;
    }

    /**
     * Sets the value of the passageTime property.
     * 
     * @param value
     *     allowed object is
     *     {@link XMLGregorianCalendar }
     *     
     */
    public void setPassageTime(XMLGregorianCalendar value) {
        this.passageTime = value;
    }

    /**
     * Gets the value of the presenceTime property.
     * 
     * @return
     *     possible object is
     *     {@link XMLGregorianCalendar }
     *     
     */
    public XMLGregorianCalendar getPresenceTime() {
        return presenceTime;
    }

    /**
     * Sets the value of the presenceTime property.
     * 
     * @param value
     *     allowed object is
     *     {@link XMLGregorianCalendar }
     *     
     */
    public void setPresenceTime(XMLGregorianCalendar value) {
        this.presenceTime = value;
    }

    /**
     * Gets the value of the timeGap property.
     * 
     * @return
     *     possible object is
     *     {@link Float }
     *     
     */
    public Float getTimeGap() {
        return timeGap;
    }

    /**
     * Sets the value of the timeGap property.
     * 
     * @param value
     *     allowed object is
     *     {@link Float }
     *     
     */
    public void setTimeGap(Float value) {
        this.timeGap = value;
    }

    /**
     * Gets the value of the timeHeadway property.
     * 
     * @return
     *     possible object is
     *     {@link Float }
     *     
     */
    public Float getTimeHeadway() {
        return timeHeadway;
    }

    /**
     * Sets the value of the timeHeadway property.
     * 
     * @param value
     *     allowed object is
     *     {@link Float }
     *     
     */
    public void setTimeHeadway(Float value) {
        this.timeHeadway = value;
    }

    /**
     * Gets the value of the vehicleDetectionTimeExtension property.
     * 
     * @return
     *     possible object is
     *     {@link ExtensionType }
     *     
     */
    public ExtensionType getVehicleDetectionTimeExtension() {
        return vehicleDetectionTimeExtension;
    }

    /**
     * Sets the value of the vehicleDetectionTimeExtension property.
     * 
     * @param value
     *     allowed object is
     *     {@link ExtensionType }
     *     
     */
    public void setVehicleDetectionTimeExtension(ExtensionType value) {
        this.vehicleDetectionTimeExtension = value;
    }

}
