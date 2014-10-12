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


/**
 * <p>Java class for TrafficStatusValue complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="TrafficStatusValue">
 *   &lt;complexContent>
 *     &lt;extension base="{http://datex2.eu/schema/2_0RC1/2_0}BasicDataValue">
 *       &lt;sequence>
 *         &lt;element name="trafficStatus" type="{http://datex2.eu/schema/2_0RC1/2_0}TrafficStatusEnum" minOccurs="0"/>
 *         &lt;element name="trafficTrendType" type="{http://datex2.eu/schema/2_0RC1/2_0}TrafficTrendTypeEnum" minOccurs="0"/>
 *         &lt;element name="trafficStatusValueExtension" type="{http://datex2.eu/schema/2_0RC1/2_0}ExtensionType" minOccurs="0"/>
 *       &lt;/sequence>
 *     &lt;/extension>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "TrafficStatusValue", propOrder = {
    "trafficStatus",
    "trafficTrendType",
    "trafficStatusValueExtension"
})
public class TrafficStatusValue
    extends BasicDataValue
{

    protected TrafficStatusEnum trafficStatus;
    protected TrafficTrendTypeEnum trafficTrendType;
    protected ExtensionType trafficStatusValueExtension;

    /**
     * Gets the value of the trafficStatus property.
     * 
     * @return
     *     possible object is
     *     {@link TrafficStatusEnum }
     *     
     */
    public TrafficStatusEnum getTrafficStatus() {
        return trafficStatus;
    }

    /**
     * Sets the value of the trafficStatus property.
     * 
     * @param value
     *     allowed object is
     *     {@link TrafficStatusEnum }
     *     
     */
    public void setTrafficStatus(TrafficStatusEnum value) {
        this.trafficStatus = value;
    }

    /**
     * Gets the value of the trafficTrendType property.
     * 
     * @return
     *     possible object is
     *     {@link TrafficTrendTypeEnum }
     *     
     */
    public TrafficTrendTypeEnum getTrafficTrendType() {
        return trafficTrendType;
    }

    /**
     * Sets the value of the trafficTrendType property.
     * 
     * @param value
     *     allowed object is
     *     {@link TrafficTrendTypeEnum }
     *     
     */
    public void setTrafficTrendType(TrafficTrendTypeEnum value) {
        this.trafficTrendType = value;
    }

    /**
     * Gets the value of the trafficStatusValueExtension property.
     * 
     * @return
     *     possible object is
     *     {@link ExtensionType }
     *     
     */
    public ExtensionType getTrafficStatusValueExtension() {
        return trafficStatusValueExtension;
    }

    /**
     * Sets the value of the trafficStatusValueExtension property.
     * 
     * @param value
     *     allowed object is
     *     {@link ExtensionType }
     *     
     */
    public void setTrafficStatusValueExtension(ExtensionType value) {
        this.trafficStatusValueExtension = value;
    }

}
