//
// This file was generated by the JavaTM Architecture for XML Binding(JAXB) Reference Implementation, v2.2.4 
// See <a href="http://java.sun.com/xml/jaxb">http://java.sun.com/xml/jaxb</a> 
// Any modifications to this file will be lost upon recompilation of the source schema. 
// Generated on: 2014.11.22 at 01:45:09 PM EST 
//


package eu.datex2.schema._2_0rc1._2_0;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for GeneralInstructionToRoadUsers complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="GeneralInstructionToRoadUsers">
 *   &lt;complexContent>
 *     &lt;extension base="{http://datex2.eu/schema/2_0RC1/2_0}NetworkManagement">
 *       &lt;sequence>
 *         &lt;element name="generalInstructionToRoadUsersType" type="{http://datex2.eu/schema/2_0RC1/2_0}GeneralInstructionToRoadUsersTypeEnum"/>
 *         &lt;element name="generalInstructionToRoadUsersExtension" type="{http://datex2.eu/schema/2_0RC1/2_0}ExtensionType" minOccurs="0"/>
 *       &lt;/sequence>
 *     &lt;/extension>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "GeneralInstructionToRoadUsers", propOrder = {
    "generalInstructionToRoadUsersType",
    "generalInstructionToRoadUsersExtension"
})
public class GeneralInstructionToRoadUsers
    extends NetworkManagement
{

    @XmlElement(required = true)
    protected GeneralInstructionToRoadUsersTypeEnum generalInstructionToRoadUsersType;
    protected ExtensionType generalInstructionToRoadUsersExtension;

    /**
     * Gets the value of the generalInstructionToRoadUsersType property.
     * 
     * @return
     *     possible object is
     *     {@link GeneralInstructionToRoadUsersTypeEnum }
     *     
     */
    public GeneralInstructionToRoadUsersTypeEnum getGeneralInstructionToRoadUsersType() {
        return generalInstructionToRoadUsersType;
    }

    /**
     * Sets the value of the generalInstructionToRoadUsersType property.
     * 
     * @param value
     *     allowed object is
     *     {@link GeneralInstructionToRoadUsersTypeEnum }
     *     
     */
    public void setGeneralInstructionToRoadUsersType(GeneralInstructionToRoadUsersTypeEnum value) {
        this.generalInstructionToRoadUsersType = value;
    }

    /**
     * Gets the value of the generalInstructionToRoadUsersExtension property.
     * 
     * @return
     *     possible object is
     *     {@link ExtensionType }
     *     
     */
    public ExtensionType getGeneralInstructionToRoadUsersExtension() {
        return generalInstructionToRoadUsersExtension;
    }

    /**
     * Sets the value of the generalInstructionToRoadUsersExtension property.
     * 
     * @param value
     *     allowed object is
     *     {@link ExtensionType }
     *     
     */
    public void setGeneralInstructionToRoadUsersExtension(ExtensionType value) {
        this.generalInstructionToRoadUsersExtension = value;
    }

}
