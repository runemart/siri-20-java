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
 * <p>Java class for TpegLoc01SimplePointLocationSubtypeEnum.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * <p>
 * <pre>
 * &lt;simpleType name="TpegLoc01SimplePointLocationSubtypeEnum">
 *   &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string">
 *     &lt;enumeration value="intersection"/>
 *     &lt;enumeration value="nonLinkedPoint"/>
 *   &lt;/restriction>
 * &lt;/simpleType>
 * </pre>
 * 
 */
@XmlType(name = "TpegLoc01SimplePointLocationSubtypeEnum")
@XmlEnum
public enum TpegLoc01SimplePointLocationSubtypeEnum {

    @XmlEnumValue("intersection")
    INTERSECTION("intersection"),
    @XmlEnumValue("nonLinkedPoint")
    NON_LINKED_POINT("nonLinkedPoint");
    private final String value;

    TpegLoc01SimplePointLocationSubtypeEnum(String v) {
        value = v;
    }

    public String value() {
        return value;
    }

    public static TpegLoc01SimplePointLocationSubtypeEnum fromValue(String v) {
        for (TpegLoc01SimplePointLocationSubtypeEnum c: TpegLoc01SimplePointLocationSubtypeEnum.values()) {
            if (c.value.equals(v)) {
                return c;
            }
        }
        throw new IllegalArgumentException(v);
    }

}
