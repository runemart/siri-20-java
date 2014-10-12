//
// This file was generated by the JavaTM Architecture for XML Binding(JAXB) Reference Implementation, v2.2.4 
// See <a href="http://java.sun.com/xml/jaxb">http://java.sun.com/xml/jaxb</a> 
// Any modifications to this file will be lost upon recompilation of the source schema. 
// Generated on: 2014.10.04 at 10:45:11 AM EDT 
//


package uk.org.ifopt.acsb;

import javax.xml.bind.annotation.XmlEnum;
import javax.xml.bind.annotation.XmlEnumValue;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for MobilityEnumeration.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * <p>
 * <pre>
 * &lt;simpleType name="MobilityEnumeration">
 *   &lt;restriction base="{http://www.w3.org/2001/XMLSchema}NMTOKEN">
 *     &lt;enumeration value="wheelchair"/>
 *     &lt;enumeration value="assistedWheelchair"/>
 *     &lt;enumeration value="motorizedWheelchair"/>
 *     &lt;enumeration value="walkingFrame"/>
 *     &lt;enumeration value="restrictedMobility"/>
 *     &lt;enumeration value="otherMobilityNeed"/>
 *   &lt;/restriction>
 * &lt;/simpleType>
 * </pre>
 * 
 */
@XmlType(name = "MobilityEnumeration")
@XmlEnum
public enum MobilityEnumeration {

    @XmlEnumValue("wheelchair")
    WHEELCHAIR("wheelchair"),
    @XmlEnumValue("assistedWheelchair")
    ASSISTED_WHEELCHAIR("assistedWheelchair"),
    @XmlEnumValue("motorizedWheelchair")
    MOTORIZED_WHEELCHAIR("motorizedWheelchair"),
    @XmlEnumValue("walkingFrame")
    WALKING_FRAME("walkingFrame"),
    @XmlEnumValue("restrictedMobility")
    RESTRICTED_MOBILITY("restrictedMobility"),
    @XmlEnumValue("otherMobilityNeed")
    OTHER_MOBILITY_NEED("otherMobilityNeed");
    private final String value;

    MobilityEnumeration(String v) {
        value = v;
    }

    public String value() {
        return value;
    }

    public static MobilityEnumeration fromValue(String v) {
        for (MobilityEnumeration c: MobilityEnumeration.values()) {
            if (c.value.equals(v)) {
                return c;
            }
        }
        throw new IllegalArgumentException(v);
    }

}
