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
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for PublicEvent complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="PublicEvent">
 *   &lt;complexContent>
 *     &lt;extension base="{http://datex2.eu/schema/2_0RC1/2_0}Activity">
 *       &lt;sequence>
 *         &lt;element name="publicEventType" type="{http://datex2.eu/schema/2_0RC1/2_0}PublicEventTypeEnum"/>
 *         &lt;element name="publicEventExtension" type="{http://datex2.eu/schema/2_0RC1/2_0}ExtensionType" minOccurs="0"/>
 *       &lt;/sequence>
 *     &lt;/extension>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "PublicEvent", propOrder = {
    "publicEventType",
    "publicEventExtension"
})
public class PublicEvent
    extends Activity
{

    @XmlElement(required = true)
    protected PublicEventTypeEnum publicEventType;
    protected ExtensionType publicEventExtension;

    /**
     * Gets the value of the publicEventType property.
     * 
     * @return
     *     possible object is
     *     {@link PublicEventTypeEnum }
     *     
     */
    public PublicEventTypeEnum getPublicEventType() {
        return publicEventType;
    }

    /**
     * Sets the value of the publicEventType property.
     * 
     * @param value
     *     allowed object is
     *     {@link PublicEventTypeEnum }
     *     
     */
    public void setPublicEventType(PublicEventTypeEnum value) {
        this.publicEventType = value;
    }

    /**
     * Gets the value of the publicEventExtension property.
     * 
     * @return
     *     possible object is
     *     {@link ExtensionType }
     *     
     */
    public ExtensionType getPublicEventExtension() {
        return publicEventExtension;
    }

    /**
     * Sets the value of the publicEventExtension property.
     * 
     * @param value
     *     allowed object is
     *     {@link ExtensionType }
     *     
     */
    public void setPublicEventExtension(ExtensionType value) {
        this.publicEventExtension = value;
    }

}
