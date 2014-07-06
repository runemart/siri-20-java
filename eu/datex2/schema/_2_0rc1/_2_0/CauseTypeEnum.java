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
 * <p>Java class for CauseTypeEnum.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * <p>
 * <pre>
 * &lt;simpleType name="CauseTypeEnum">
 *   &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string">
 *     &lt;enumeration value="accident"/>
 *     &lt;enumeration value="congestion"/>
 *     &lt;enumeration value="earlierAccident"/>
 *     &lt;enumeration value="earlierEvent"/>
 *     &lt;enumeration value="earlierIncident"/>
 *     &lt;enumeration value="equipmentFailure"/>
 *     &lt;enumeration value="excessiveHeat"/>
 *     &lt;enumeration value="frost"/>
 *     &lt;enumeration value="holidayTraffic"/>
 *     &lt;enumeration value="infrastructureFailure"/>
 *     &lt;enumeration value="largeNumbersOfVisitors"/>
 *     &lt;enumeration value="obstruction"/>
 *     &lt;enumeration value="pollutionAlert"/>
 *     &lt;enumeration value="poorWeather"/>
 *     &lt;enumeration value="problemsAtBorderPost"/>
 *     &lt;enumeration value="problemsAtCustomPost"/>
 *     &lt;enumeration value="problemsOnLocalRoads"/>
 *     &lt;enumeration value="radioactiveLeakAlert"/>
 *     &lt;enumeration value="roadsideEvent"/>
 *     &lt;enumeration value="rubberNecking"/>
 *     &lt;enumeration value="securityIncident"/>
 *     &lt;enumeration value="shearWeightOfTraffic"/>
 *     &lt;enumeration value="technicalProblems"/>
 *     &lt;enumeration value="terrorism"/>
 *     &lt;enumeration value="toxicCloudAlert"/>
 *     &lt;enumeration value="vandalism"/>
 *     &lt;enumeration value="other"/>
 *   &lt;/restriction>
 * &lt;/simpleType>
 * </pre>
 * 
 */
@XmlType(name = "CauseTypeEnum")
@XmlEnum
public enum CauseTypeEnum {

    @XmlEnumValue("accident")
    ACCIDENT("accident"),
    @XmlEnumValue("congestion")
    CONGESTION("congestion"),
    @XmlEnumValue("earlierAccident")
    EARLIER_ACCIDENT("earlierAccident"),
    @XmlEnumValue("earlierEvent")
    EARLIER_EVENT("earlierEvent"),
    @XmlEnumValue("earlierIncident")
    EARLIER_INCIDENT("earlierIncident"),
    @XmlEnumValue("equipmentFailure")
    EQUIPMENT_FAILURE("equipmentFailure"),
    @XmlEnumValue("excessiveHeat")
    EXCESSIVE_HEAT("excessiveHeat"),
    @XmlEnumValue("frost")
    FROST("frost"),
    @XmlEnumValue("holidayTraffic")
    HOLIDAY_TRAFFIC("holidayTraffic"),
    @XmlEnumValue("infrastructureFailure")
    INFRASTRUCTURE_FAILURE("infrastructureFailure"),
    @XmlEnumValue("largeNumbersOfVisitors")
    LARGE_NUMBERS_OF_VISITORS("largeNumbersOfVisitors"),
    @XmlEnumValue("obstruction")
    OBSTRUCTION("obstruction"),
    @XmlEnumValue("pollutionAlert")
    POLLUTION_ALERT("pollutionAlert"),
    @XmlEnumValue("poorWeather")
    POOR_WEATHER("poorWeather"),
    @XmlEnumValue("problemsAtBorderPost")
    PROBLEMS_AT_BORDER_POST("problemsAtBorderPost"),
    @XmlEnumValue("problemsAtCustomPost")
    PROBLEMS_AT_CUSTOM_POST("problemsAtCustomPost"),
    @XmlEnumValue("problemsOnLocalRoads")
    PROBLEMS_ON_LOCAL_ROADS("problemsOnLocalRoads"),
    @XmlEnumValue("radioactiveLeakAlert")
    RADIOACTIVE_LEAK_ALERT("radioactiveLeakAlert"),
    @XmlEnumValue("roadsideEvent")
    ROADSIDE_EVENT("roadsideEvent"),
    @XmlEnumValue("rubberNecking")
    RUBBER_NECKING("rubberNecking"),
    @XmlEnumValue("securityIncident")
    SECURITY_INCIDENT("securityIncident"),
    @XmlEnumValue("shearWeightOfTraffic")
    SHEAR_WEIGHT_OF_TRAFFIC("shearWeightOfTraffic"),
    @XmlEnumValue("technicalProblems")
    TECHNICAL_PROBLEMS("technicalProblems"),
    @XmlEnumValue("terrorism")
    TERRORISM("terrorism"),
    @XmlEnumValue("toxicCloudAlert")
    TOXIC_CLOUD_ALERT("toxicCloudAlert"),
    @XmlEnumValue("vandalism")
    VANDALISM("vandalism"),
    @XmlEnumValue("other")
    OTHER("other");
    private final String value;

    CauseTypeEnum(String v) {
        value = v;
    }

    public String value() {
        return value;
    }

    public static CauseTypeEnum fromValue(String v) {
        for (CauseTypeEnum c: CauseTypeEnum.values()) {
            if (c.value.equals(v)) {
                return c;
            }
        }
        throw new IllegalArgumentException(v);
    }

}