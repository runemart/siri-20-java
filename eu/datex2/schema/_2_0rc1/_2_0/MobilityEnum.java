//
// This file was generated by the JavaTM Architecture for XML Binding(JAXB) Reference Implementation, v2.2.4 
// See <a href="http://java.sun.com/xml/jaxb">http://java.sun.com/xml/jaxb</a> 
// Any modifications to this file will be lost upon recompilation of the source schema. 
// Generated on: 2014.10.04 at 10:45:11 AM EDT 
//


package eu.datex2.schema._2_0rc1._2_0;

import javax.xml.bind.annotation.XmlEnum;
import javax.xml.bind.annotation.XmlEnumValue;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for MobilityEnum.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * <p>
 * <pre>
 * &lt;simpleType name="MobilityEnum">
 *   &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string">
 *     &lt;enumeration value="mobile"/>
 *     &lt;enumeration value="stationary"/>
 *     &lt;enumeration value="unknown"/>
 *   &lt;/restriction>
 * &lt;/simpleType>
 * </pre>
 * 
 */
@XmlType(name = "MobilityEnum")
@XmlEnum
public enum MobilityEnum {

    @XmlEnumValue("mobile")
    MOBILE("mobile"),
    @XmlEnumValue("stationary")
    STATIONARY("stationary"),
    @XmlEnumValue("unknown")
    UNKNOWN("unknown");
    private final String value;

    MobilityEnum(String v) {
        value = v;
    }

    public String value() {
        return value;
    }

    public static MobilityEnum fromValue(String v) {
        for (MobilityEnum c: MobilityEnum.values()) {
            if (c.value.equals(v)) {
                return c;
            }
        }
        throw new IllegalArgumentException(v);
    }

}
