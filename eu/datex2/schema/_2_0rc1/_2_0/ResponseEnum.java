//
// This file was generated by the JavaTM Architecture for XML Binding(JAXB) Reference Implementation, v2.2.4 
// See <a href="http://java.sun.com/xml/jaxb">http://java.sun.com/xml/jaxb</a> 
// Any modifications to this file will be lost upon recompilation of the source schema. 
// Generated on: 2014.07.04 at 01:00:15 PM EDT 
//


package eu.datex2.schema._2_0rc1._2_0;

import javax.xml.bind.annotation.XmlEnum;
import javax.xml.bind.annotation.XmlEnumValue;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for ResponseEnum.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * <p>
 * <pre>
 * &lt;simpleType name="ResponseEnum">
 *   &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string">
 *     &lt;enumeration value="acknowledge"/>
 *     &lt;enumeration value="catalogueRequestDenied"/>
 *     &lt;enumeration value="filterRequestDenied"/>
 *     &lt;enumeration value="requestDenied"/>
 *     &lt;enumeration value="subscriptionRequestDenied"/>
 *   &lt;/restriction>
 * &lt;/simpleType>
 * </pre>
 * 
 */
@XmlType(name = "ResponseEnum")
@XmlEnum
public enum ResponseEnum {

    @XmlEnumValue("acknowledge")
    ACKNOWLEDGE("acknowledge"),
    @XmlEnumValue("catalogueRequestDenied")
    CATALOGUE_REQUEST_DENIED("catalogueRequestDenied"),
    @XmlEnumValue("filterRequestDenied")
    FILTER_REQUEST_DENIED("filterRequestDenied"),
    @XmlEnumValue("requestDenied")
    REQUEST_DENIED("requestDenied"),
    @XmlEnumValue("subscriptionRequestDenied")
    SUBSCRIPTION_REQUEST_DENIED("subscriptionRequestDenied");
    private final String value;

    ResponseEnum(String v) {
        value = v;
    }

    public String value() {
        return value;
    }

    public static ResponseEnum fromValue(String v) {
        for (ResponseEnum c: ResponseEnum.values()) {
            if (c.value.equals(v)) {
                return c;
            }
        }
        throw new IllegalArgumentException(v);
    }

}