//
// This file was generated by the JavaTM Architecture for XML Binding(JAXB) Reference Implementation, v2.2.4 
// See <a href="http://java.sun.com/xml/jaxb">http://java.sun.com/xml/jaxb</a> 
// Any modifications to this file will be lost upon recompilation of the source schema. 
// Generated on: 2014.10.04 at 10:45:11 AM EDT 
//


package eu.datex2.schema._2_0rc1._2_0;

import java.util.ArrayList;
import java.util.List;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for RoadsideServiceDisruption complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="RoadsideServiceDisruption">
 *   &lt;complexContent>
 *     &lt;extension base="{http://datex2.eu/schema/2_0RC1/2_0}NonRoadEventInformation">
 *       &lt;sequence>
 *         &lt;element name="roadsideServiceDisruptionType" type="{http://datex2.eu/schema/2_0RC1/2_0}RoadsideServiceDisruptionTypeEnum" maxOccurs="unbounded"/>
 *         &lt;element name="roadsideServiceDisruptionExtension" type="{http://datex2.eu/schema/2_0RC1/2_0}ExtensionType" minOccurs="0"/>
 *       &lt;/sequence>
 *     &lt;/extension>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "RoadsideServiceDisruption", propOrder = {
    "roadsideServiceDisruptionType",
    "roadsideServiceDisruptionExtension"
})
public class RoadsideServiceDisruption
    extends NonRoadEventInformation
{

    @XmlElement(required = true)
    protected List<RoadsideServiceDisruptionTypeEnum> roadsideServiceDisruptionType;
    protected ExtensionType roadsideServiceDisruptionExtension;

    /**
     * Gets the value of the roadsideServiceDisruptionType property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the roadsideServiceDisruptionType property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getRoadsideServiceDisruptionType().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link RoadsideServiceDisruptionTypeEnum }
     * 
     * 
     */
    public List<RoadsideServiceDisruptionTypeEnum> getRoadsideServiceDisruptionType() {
        if (roadsideServiceDisruptionType == null) {
            roadsideServiceDisruptionType = new ArrayList<RoadsideServiceDisruptionTypeEnum>();
        }
        return this.roadsideServiceDisruptionType;
    }

    /**
     * Gets the value of the roadsideServiceDisruptionExtension property.
     * 
     * @return
     *     possible object is
     *     {@link ExtensionType }
     *     
     */
    public ExtensionType getRoadsideServiceDisruptionExtension() {
        return roadsideServiceDisruptionExtension;
    }

    /**
     * Sets the value of the roadsideServiceDisruptionExtension property.
     * 
     * @param value
     *     allowed object is
     *     {@link ExtensionType }
     *     
     */
    public void setRoadsideServiceDisruptionExtension(ExtensionType value) {
        this.roadsideServiceDisruptionExtension = value;
    }

}
