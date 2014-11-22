//
// This file was generated by the JavaTM Architecture for XML Binding(JAXB) Reference Implementation, v2.2.4 
// See <a href="http://java.sun.com/xml/jaxb">http://java.sun.com/xml/jaxb</a> 
// Any modifications to this file will be lost upon recompilation of the source schema. 
// Generated on: 2014.11.22 at 01:45:09 PM EST 
//


package uk.org.siri.siri;

import javax.xml.bind.annotation.XmlEnum;
import javax.xml.bind.annotation.XmlEnumValue;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for HolidayTypeEnumerationx.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * <p>
 * <pre>
 * &lt;simpleType name="HolidayTypeEnumerationx">
 *   &lt;restriction base="{http://www.siri.org.uk/siri}DayTypeEnumeration">
 *     &lt;enumeration value="holiday"/>
 *     &lt;enumeration value="publicHoliday"/>
 *     &lt;enumeration value="religiousHoliday"/>
 *     &lt;enumeration value="federalHoliday"/>
 *     &lt;enumeration value="regionalHoliday"/>
 *     &lt;enumeration value="nationalHoliday"/>
 *     &lt;enumeration value="sundaysAndPublicHolidays"/>
 *     &lt;enumeration value="schoolDays"/>
 *     &lt;enumeration value="everyDay"/>
 *     &lt;enumeration value="undefinedDayType"/>
 *   &lt;/restriction>
 * &lt;/simpleType>
 * </pre>
 * 
 */
@XmlType(name = "HolidayTypeEnumerationx")
@XmlEnum(DayTypeEnumeration.class)
public enum HolidayTypeEnumerationx {

    @XmlEnumValue("holiday")
    HOLIDAY(DayTypeEnumeration.HOLIDAY),
    @XmlEnumValue("publicHoliday")
    PUBLIC_HOLIDAY(DayTypeEnumeration.PUBLIC_HOLIDAY),
    @XmlEnumValue("religiousHoliday")
    RELIGIOUS_HOLIDAY(DayTypeEnumeration.RELIGIOUS_HOLIDAY),
    @XmlEnumValue("federalHoliday")
    FEDERAL_HOLIDAY(DayTypeEnumeration.FEDERAL_HOLIDAY),
    @XmlEnumValue("regionalHoliday")
    REGIONAL_HOLIDAY(DayTypeEnumeration.REGIONAL_HOLIDAY),
    @XmlEnumValue("nationalHoliday")
    NATIONAL_HOLIDAY(DayTypeEnumeration.NATIONAL_HOLIDAY),
    @XmlEnumValue("sundaysAndPublicHolidays")
    SUNDAYS_AND_PUBLIC_HOLIDAYS(DayTypeEnumeration.SUNDAYS_AND_PUBLIC_HOLIDAYS),
    @XmlEnumValue("schoolDays")
    SCHOOL_DAYS(DayTypeEnumeration.SCHOOL_DAYS),
    @XmlEnumValue("everyDay")
    EVERY_DAY(DayTypeEnumeration.EVERY_DAY),
    @XmlEnumValue("undefinedDayType")
    UNDEFINED_DAY_TYPE(DayTypeEnumeration.UNDEFINED_DAY_TYPE);
    private final DayTypeEnumeration value;

    HolidayTypeEnumerationx(DayTypeEnumeration v) {
        value = v;
    }

    public DayTypeEnumeration value() {
        return value;
    }

    public static HolidayTypeEnumerationx fromValue(DayTypeEnumeration v) {
        for (HolidayTypeEnumerationx c: HolidayTypeEnumerationx.values()) {
            if (c.value.equals(v)) {
                return c;
            }
        }
        throw new IllegalArgumentException(v.toString());
    }

}
