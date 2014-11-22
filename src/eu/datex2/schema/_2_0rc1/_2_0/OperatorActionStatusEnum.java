//
// This file was generated by the JavaTM Architecture for XML Binding(JAXB) Reference Implementation, v2.2.4 
// See <a href="http://java.sun.com/xml/jaxb">http://java.sun.com/xml/jaxb</a> 
// Any modifications to this file will be lost upon recompilation of the source schema. 
// Generated on: 2014.11.22 at 01:45:09 PM EST 
//


package eu.datex2.schema._2_0rc1._2_0;

import javax.xml.bind.annotation.XmlEnum;
import javax.xml.bind.annotation.XmlEnumValue;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for OperatorActionStatusEnum.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * <p>
 * <pre>
 * &lt;simpleType name="OperatorActionStatusEnum">
 *   &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string">
 *     &lt;enumeration value="requested"/>
 *     &lt;enumeration value="approved"/>
 *     &lt;enumeration value="beingImplemented"/>
 *     &lt;enumeration value="implemented"/>
 *     &lt;enumeration value="rejected"/>
 *     &lt;enumeration value="terminationRequested"/>
 *     &lt;enumeration value="beingTerminated"/>
 *   &lt;/restriction>
 * &lt;/simpleType>
 * </pre>
 * 
 */
@XmlType(name = "OperatorActionStatusEnum")
@XmlEnum
public enum OperatorActionStatusEnum {

    @XmlEnumValue("requested")
    REQUESTED("requested"),
    @XmlEnumValue("approved")
    APPROVED("approved"),
    @XmlEnumValue("beingImplemented")
    BEING_IMPLEMENTED("beingImplemented"),
    @XmlEnumValue("implemented")
    IMPLEMENTED("implemented"),
    @XmlEnumValue("rejected")
    REJECTED("rejected"),
    @XmlEnumValue("terminationRequested")
    TERMINATION_REQUESTED("terminationRequested"),
    @XmlEnumValue("beingTerminated")
    BEING_TERMINATED("beingTerminated");
    private final String value;

    OperatorActionStatusEnum(String v) {
        value = v;
    }

    public String value() {
        return value;
    }

    public static OperatorActionStatusEnum fromValue(String v) {
        for (OperatorActionStatusEnum c: OperatorActionStatusEnum.values()) {
            if (c.value.equals(v)) {
                return c;
            }
        }
        throw new IllegalArgumentException(v);
    }

}
