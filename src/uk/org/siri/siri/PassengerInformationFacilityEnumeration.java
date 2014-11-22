//
// This file was generated by the JavaTM Architecture for XML Binding(JAXB) Reference Implementation, v2.2.4 
// See <a href="http://java.sun.com/xml/jaxb">http://java.sun.com/xml/jaxb</a> 
// Any modifications to this file will be lost upon recompilation of the source schema. 
// Generated on: 2014.10.04 at 10:45:11 AM EDT 
//


package uk.org.siri.siri;

import javax.xml.bind.annotation.XmlEnum;
import javax.xml.bind.annotation.XmlEnumValue;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for PassengerInformationFacilityEnumeration.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * <p>
 * <pre>
 * &lt;simpleType name="PassengerInformationFacilityEnumeration">
 *   &lt;restriction base="{http://www.w3.org/2001/XMLSchema}NMTOKEN">
 *     &lt;enumeration value="unknown"/>
 *     &lt;enumeration value="nextStopIndicator"/>
 *     &lt;enumeration value="stopAnnouncements"/>
 *     &lt;enumeration value="passengerInformationDisplay"/>
 *     &lt;enumeration value="audioInformation"/>
 *     &lt;enumeration value="visualInformation"/>
 *     &lt;enumeration value="tactilePlatformEdges"/>
 *     &lt;enumeration value="tactileInformation"/>
 *     &lt;enumeration value="walkingGuidance"/>
 *     &lt;enumeration value="journeyPlanning"/>
 *     &lt;enumeration value="lostFound"/>
 *     &lt;enumeration value="informationDesk"/>
 *     &lt;enumeration value="interactiveKiosk-Display"/>
 *     &lt;enumeration value="printedPublicNotice"/>
 *   &lt;/restriction>
 * &lt;/simpleType>
 * </pre>
 * 
 */
@XmlType(name = "PassengerInformationFacilityEnumeration")
@XmlEnum
public enum PassengerInformationFacilityEnumeration {

    @XmlEnumValue("unknown")
    UNKNOWN("unknown"),
    @XmlEnumValue("nextStopIndicator")
    NEXT_STOP_INDICATOR("nextStopIndicator"),
    @XmlEnumValue("stopAnnouncements")
    STOP_ANNOUNCEMENTS("stopAnnouncements"),
    @XmlEnumValue("passengerInformationDisplay")
    PASSENGER_INFORMATION_DISPLAY("passengerInformationDisplay"),
    @XmlEnumValue("audioInformation")
    AUDIO_INFORMATION("audioInformation"),
    @XmlEnumValue("visualInformation")
    VISUAL_INFORMATION("visualInformation"),
    @XmlEnumValue("tactilePlatformEdges")
    TACTILE_PLATFORM_EDGES("tactilePlatformEdges"),
    @XmlEnumValue("tactileInformation")
    TACTILE_INFORMATION("tactileInformation"),
    @XmlEnumValue("walkingGuidance")
    WALKING_GUIDANCE("walkingGuidance"),
    @XmlEnumValue("journeyPlanning")
    JOURNEY_PLANNING("journeyPlanning"),
    @XmlEnumValue("lostFound")
    LOST_FOUND("lostFound"),
    @XmlEnumValue("informationDesk")
    INFORMATION_DESK("informationDesk"),
    @XmlEnumValue("interactiveKiosk-Display")
    INTERACTIVE_KIOSK_DISPLAY("interactiveKiosk-Display"),
    @XmlEnumValue("printedPublicNotice")
    PRINTED_PUBLIC_NOTICE("printedPublicNotice");
    private final String value;

    PassengerInformationFacilityEnumeration(String v) {
        value = v;
    }

    public String value() {
        return value;
    }

    public static PassengerInformationFacilityEnumeration fromValue(String v) {
        for (PassengerInformationFacilityEnumeration c: PassengerInformationFacilityEnumeration.values()) {
            if (c.value.equals(v)) {
                return c;
            }
        }
        throw new IllegalArgumentException(v);
    }

}