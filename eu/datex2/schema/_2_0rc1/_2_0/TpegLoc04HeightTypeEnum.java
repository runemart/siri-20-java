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
 * <p>Java class for TpegLoc04HeightTypeEnum.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * <p>
 * <pre>
 * &lt;simpleType name="TpegLoc04HeightTypeEnum">
 *   &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string">
 *     &lt;enumeration value="above"/>
 *     &lt;enumeration value="aboveSeaLevel"/>
 *     &lt;enumeration value="aboveStreetLevel"/>
 *     &lt;enumeration value="at"/>
 *     &lt;enumeration value="atSeaLevel"/>
 *     &lt;enumeration value="atStreetLevel"/>
 *     &lt;enumeration value="below"/>
 *     &lt;enumeration value="belowSeaLevel"/>
 *     &lt;enumeration value="belowStreetLevel"/>
 *     &lt;enumeration value="undefined"/>
 *     &lt;enumeration value="unknown"/>
 *     &lt;enumeration value="other"/>
 *   &lt;/restriction>
 * &lt;/simpleType>
 * </pre>
 * 
 */
@XmlType(name = "TpegLoc04HeightTypeEnum")
@XmlEnum
public enum TpegLoc04HeightTypeEnum {

    @XmlEnumValue("above")
    ABOVE("above"),
    @XmlEnumValue("aboveSeaLevel")
    ABOVE_SEA_LEVEL("aboveSeaLevel"),
    @XmlEnumValue("aboveStreetLevel")
    ABOVE_STREET_LEVEL("aboveStreetLevel"),
    @XmlEnumValue("at")
    AT("at"),
    @XmlEnumValue("atSeaLevel")
    AT_SEA_LEVEL("atSeaLevel"),
    @XmlEnumValue("atStreetLevel")
    AT_STREET_LEVEL("atStreetLevel"),
    @XmlEnumValue("below")
    BELOW("below"),
    @XmlEnumValue("belowSeaLevel")
    BELOW_SEA_LEVEL("belowSeaLevel"),
    @XmlEnumValue("belowStreetLevel")
    BELOW_STREET_LEVEL("belowStreetLevel"),
    @XmlEnumValue("undefined")
    UNDEFINED("undefined"),
    @XmlEnumValue("unknown")
    UNKNOWN("unknown"),
    @XmlEnumValue("other")
    OTHER("other");
    private final String value;

    TpegLoc04HeightTypeEnum(String v) {
        value = v;
    }

    public String value() {
        return value;
    }

    public static TpegLoc04HeightTypeEnum fromValue(String v) {
        for (TpegLoc04HeightTypeEnum c: TpegLoc04HeightTypeEnum.values()) {
            if (c.value.equals(v)) {
                return c;
            }
        }
        throw new IllegalArgumentException(v);
    }

}
