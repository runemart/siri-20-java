//
// This file was generated by the JavaTM Architecture for XML Binding(JAXB) Reference Implementation, v2.2.4 
// See <a href="http://java.sun.com/xml/jaxb">http://java.sun.com/xml/jaxb</a> 
// Any modifications to this file will be lost upon recompilation of the source schema. 
// Generated on: 2014.07.04 at 01:00:15 PM EDT 
//


package uk.org.siri.siri;

import javax.xml.bind.annotation.XmlEnum;
import javax.xml.bind.annotation.XmlEnumValue;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for HireFacilityEnumeration.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * <p>
 * <pre>
 * &lt;simpleType name="HireFacilityEnumeration">
 *   &lt;restriction base="{http://www.w3.org/2001/XMLSchema}NMTOKEN">
 *     &lt;enumeration value="unknown"/>
 *     &lt;enumeration value="carHire"/>
 *     &lt;enumeration value="motorCycleHire"/>
 *     &lt;enumeration value="cycleHire"/>
 *     &lt;enumeration value="taxi"/>
 *     &lt;enumeration value="recreationDeviceHire"/>
 *   &lt;/restriction>
 * &lt;/simpleType>
 * </pre>
 * 
 */
@XmlType(name = "HireFacilityEnumeration")
@XmlEnum
public enum HireFacilityEnumeration {

    @XmlEnumValue("unknown")
    UNKNOWN("unknown"),
    @XmlEnumValue("carHire")
    CAR_HIRE("carHire"),
    @XmlEnumValue("motorCycleHire")
    MOTOR_CYCLE_HIRE("motorCycleHire"),
    @XmlEnumValue("cycleHire")
    CYCLE_HIRE("cycleHire"),
    @XmlEnumValue("taxi")
    TAXI("taxi"),
    @XmlEnumValue("recreationDeviceHire")
    RECREATION_DEVICE_HIRE("recreationDeviceHire");
    private final String value;

    HireFacilityEnumeration(String v) {
        value = v;
    }

    public String value() {
        return value;
    }

    public static HireFacilityEnumeration fromValue(String v) {
        for (HireFacilityEnumeration c: HireFacilityEnumeration.values()) {
            if (c.value.equals(v)) {
                return c;
            }
        }
        throw new IllegalArgumentException(v);
    }

}