//
// This file was generated by the JavaTM Architecture for XML Binding(JAXB) Reference Implementation, v2.2.4 
// See <a href="http://java.sun.com/xml/jaxb">http://java.sun.com/xml/jaxb</a> 
// Any modifications to this file will be lost upon recompilation of the source schema. 
// Generated on: 2014.11.22 at 01:45:09 PM EST 
//


package uk.org.ifopt.ifopt;

import javax.xml.bind.annotation.XmlEnum;
import javax.xml.bind.annotation.XmlEnumValue;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for AdministrativeRoleTypeEnumeration.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * <p>
 * <pre>
 * &lt;simpleType name="AdministrativeRoleTypeEnumeration">
 *   &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string">
 *     &lt;enumeration value="all"/>
 *     &lt;enumeration value="collects"/>
 *     &lt;enumeration value="validates"/>
 *     &lt;enumeration value="aggregates"/>
 *     &lt;enumeration value="distributes"/>
 *     &lt;enumeration value="redistributes"/>
 *   &lt;/restriction>
 * &lt;/simpleType>
 * </pre>
 * 
 */
@XmlType(name = "AdministrativeRoleTypeEnumeration")
@XmlEnum
public enum AdministrativeRoleTypeEnumeration {

    @XmlEnumValue("all")
    ALL("all"),
    @XmlEnumValue("collects")
    COLLECTS("collects"),
    @XmlEnumValue("validates")
    VALIDATES("validates"),
    @XmlEnumValue("aggregates")
    AGGREGATES("aggregates"),
    @XmlEnumValue("distributes")
    DISTRIBUTES("distributes"),
    @XmlEnumValue("redistributes")
    REDISTRIBUTES("redistributes");
    private final String value;

    AdministrativeRoleTypeEnumeration(String v) {
        value = v;
    }

    public String value() {
        return value;
    }

    public static AdministrativeRoleTypeEnumeration fromValue(String v) {
        for (AdministrativeRoleTypeEnumeration c: AdministrativeRoleTypeEnumeration.values()) {
            if (c.value.equals(v)) {
                return c;
            }
        }
        throw new IllegalArgumentException(v);
    }

}
