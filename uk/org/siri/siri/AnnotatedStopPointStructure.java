//
// This file was generated by the JavaTM Architecture for XML Binding(JAXB) Reference Implementation, v2.2.4 
// See <a href="http://java.sun.com/xml/jaxb">http://java.sun.com/xml/jaxb</a> 
// Any modifications to this file will be lost upon recompilation of the source schema. 
// Generated on: 2014.10.04 at 10:45:11 AM EDT 
//


package uk.org.siri.siri;

import java.util.ArrayList;
import java.util.List;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlElements;
import javax.xml.bind.annotation.XmlSchemaType;
import javax.xml.bind.annotation.XmlSeeAlso;
import javax.xml.bind.annotation.XmlType;


/**
 * View of a SCHEDULED STOP POINT description.
 * 
 * <p>Java class for AnnotatedStopPointStructure complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="AnnotatedStopPointStructure">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="StopPointRef" type="{http://www.siri.org.uk/siri}StopPointRefStructure"/>
 *         &lt;element ref="{http://www.siri.org.uk/siri}TimingPoint" minOccurs="0"/>
 *         &lt;element name="Monitored" type="{http://www.w3.org/2001/XMLSchema}boolean" minOccurs="0"/>
 *         &lt;element name="StopName" type="{http://www.siri.org.uk/siri}NaturalLanguageStringStructure" maxOccurs="unbounded" minOccurs="0"/>
 *         &lt;element name="StopAreaRef" type="{http://www.siri.org.uk/siri}StopAreaRefStructure" minOccurs="0"/>
 *         &lt;element name="Features" minOccurs="0">
 *           &lt;complexType>
 *             &lt;complexContent>
 *               &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *                 &lt;choice maxOccurs="unbounded">
 *                   &lt;element name="ServiceFeature" type="{http://www.siri.org.uk/siri}ServiceFeatureStructure"/>
 *                   &lt;element ref="{http://www.siri.org.uk/siri}ServiceFeatureRef"/>
 *                 &lt;/choice>
 *               &lt;/restriction>
 *             &lt;/complexContent>
 *           &lt;/complexType>
 *         &lt;/element>
 *         &lt;element name="Lines" minOccurs="0">
 *           &lt;complexType>
 *             &lt;complexContent>
 *               &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *                 &lt;choice maxOccurs="unbounded">
 *                   &lt;element name="LineRef" type="{http://www.siri.org.uk/siri}LineRefStructure"/>
 *                   &lt;element name="LineDirection" type="{http://www.siri.org.uk/siri}LineDirectionStructure"/>
 *                 &lt;/choice>
 *               &lt;/restriction>
 *             &lt;/complexContent>
 *           &lt;/complexType>
 *         &lt;/element>
 *         &lt;element name="Location" type="{http://www.siri.org.uk/siri}LocationStructure" minOccurs="0"/>
 *         &lt;element name="Url" type="{http://www.w3.org/2001/XMLSchema}anyURI" minOccurs="0"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "AnnotatedStopPointStructure", propOrder = {
    "stopPointRef",
    "timingPoint",
    "monitored",
    "stopName",
    "stopAreaRef",
    "features",
    "lines",
    "location",
    "url"
})
@XmlSeeAlso({
    StopPointInPatternStructure.class
})
public class AnnotatedStopPointStructure {

    @XmlElement(name = "StopPointRef", required = true)
    protected StopPointRefStructure stopPointRef;
    @XmlElement(name = "TimingPoint", defaultValue = "true")
    protected Boolean timingPoint;
    @XmlElement(name = "Monitored", defaultValue = "true")
    protected Boolean monitored;
    @XmlElement(name = "StopName")
    protected List<NaturalLanguageStringStructure> stopName;
    @XmlElement(name = "StopAreaRef")
    protected StopAreaRefStructure stopAreaRef;
    @XmlElement(name = "Features")
    protected AnnotatedStopPointStructure.Features features;
    @XmlElement(name = "Lines")
    protected AnnotatedStopPointStructure.Lines lines;
    @XmlElement(name = "Location")
    protected LocationStructure location;
    @XmlElement(name = "Url")
    @XmlSchemaType(name = "anyURI")
    protected String url;

    /**
     * Gets the value of the stopPointRef property.
     * 
     * @return
     *     possible object is
     *     {@link StopPointRefStructure }
     *     
     */
    public StopPointRefStructure getStopPointRef() {
        return stopPointRef;
    }

    /**
     * Sets the value of the stopPointRef property.
     * 
     * @param value
     *     allowed object is
     *     {@link StopPointRefStructure }
     *     
     */
    public void setStopPointRef(StopPointRefStructure value) {
        this.stopPointRef = value;
    }

    /**
     * Gets the value of the timingPoint property.
     * 
     * @return
     *     possible object is
     *     {@link Boolean }
     *     
     */
    public Boolean isTimingPoint() {
        return timingPoint;
    }

    /**
     * Sets the value of the timingPoint property.
     * 
     * @param value
     *     allowed object is
     *     {@link Boolean }
     *     
     */
    public void setTimingPoint(Boolean value) {
        this.timingPoint = value;
    }

    /**
     * Gets the value of the monitored property.
     * 
     * @return
     *     possible object is
     *     {@link Boolean }
     *     
     */
    public Boolean isMonitored() {
        return monitored;
    }

    /**
     * Sets the value of the monitored property.
     * 
     * @param value
     *     allowed object is
     *     {@link Boolean }
     *     
     */
    public void setMonitored(Boolean value) {
        this.monitored = value;
    }

    /**
     * Gets the value of the stopName property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the stopName property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getStopName().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link NaturalLanguageStringStructure }
     * 
     * 
     */
    public List<NaturalLanguageStringStructure> getStopName() {
        if (stopName == null) {
            stopName = new ArrayList<NaturalLanguageStringStructure>();
        }
        return this.stopName;
    }

    /**
     * Gets the value of the stopAreaRef property.
     * 
     * @return
     *     possible object is
     *     {@link StopAreaRefStructure }
     *     
     */
    public StopAreaRefStructure getStopAreaRef() {
        return stopAreaRef;
    }

    /**
     * Sets the value of the stopAreaRef property.
     * 
     * @param value
     *     allowed object is
     *     {@link StopAreaRefStructure }
     *     
     */
    public void setStopAreaRef(StopAreaRefStructure value) {
        this.stopAreaRef = value;
    }

    /**
     * Gets the value of the features property.
     * 
     * @return
     *     possible object is
     *     {@link AnnotatedStopPointStructure.Features }
     *     
     */
    public AnnotatedStopPointStructure.Features getFeatures() {
        return features;
    }

    /**
     * Sets the value of the features property.
     * 
     * @param value
     *     allowed object is
     *     {@link AnnotatedStopPointStructure.Features }
     *     
     */
    public void setFeatures(AnnotatedStopPointStructure.Features value) {
        this.features = value;
    }

    /**
     * Gets the value of the lines property.
     * 
     * @return
     *     possible object is
     *     {@link AnnotatedStopPointStructure.Lines }
     *     
     */
    public AnnotatedStopPointStructure.Lines getLines() {
        return lines;
    }

    /**
     * Sets the value of the lines property.
     * 
     * @param value
     *     allowed object is
     *     {@link AnnotatedStopPointStructure.Lines }
     *     
     */
    public void setLines(AnnotatedStopPointStructure.Lines value) {
        this.lines = value;
    }

    /**
     * Gets the value of the location property.
     * 
     * @return
     *     possible object is
     *     {@link LocationStructure }
     *     
     */
    public LocationStructure getLocation() {
        return location;
    }

    /**
     * Sets the value of the location property.
     * 
     * @param value
     *     allowed object is
     *     {@link LocationStructure }
     *     
     */
    public void setLocation(LocationStructure value) {
        this.location = value;
    }

    /**
     * Gets the value of the url property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getUrl() {
        return url;
    }

    /**
     * Sets the value of the url property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setUrl(String value) {
        this.url = value;
    }


    /**
     * <p>Java class for anonymous complex type.
     * 
     * <p>The following schema fragment specifies the expected content contained within this class.
     * 
     * <pre>
     * &lt;complexType>
     *   &lt;complexContent>
     *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
     *       &lt;choice maxOccurs="unbounded">
     *         &lt;element name="ServiceFeature" type="{http://www.siri.org.uk/siri}ServiceFeatureStructure"/>
     *         &lt;element ref="{http://www.siri.org.uk/siri}ServiceFeatureRef"/>
     *       &lt;/choice>
     *     &lt;/restriction>
     *   &lt;/complexContent>
     * &lt;/complexType>
     * </pre>
     * 
     * 
     */
    @XmlAccessorType(XmlAccessType.FIELD)
    @XmlType(name = "", propOrder = {
        "serviceFeatureOrServiceFeatureRef"
    })
    public static class Features {

        @XmlElements({
            @XmlElement(name = "ServiceFeature", type = ServiceFeatureStructure.class),
            @XmlElement(name = "ServiceFeatureRef", type = ServiceFeatureRefStructure.class)
        })
        protected List<Object> serviceFeatureOrServiceFeatureRef;

        /**
         * Gets the value of the serviceFeatureOrServiceFeatureRef property.
         * 
         * <p>
         * This accessor method returns a reference to the live list,
         * not a snapshot. Therefore any modification you make to the
         * returned list will be present inside the JAXB object.
         * This is why there is not a <CODE>set</CODE> method for the serviceFeatureOrServiceFeatureRef property.
         * 
         * <p>
         * For example, to add a new item, do as follows:
         * <pre>
         *    getServiceFeatureOrServiceFeatureRef().add(newItem);
         * </pre>
         * 
         * 
         * <p>
         * Objects of the following type(s) are allowed in the list
         * {@link ServiceFeatureStructure }
         * {@link ServiceFeatureRefStructure }
         * 
         * 
         */
        public List<Object> getServiceFeatureOrServiceFeatureRef() {
            if (serviceFeatureOrServiceFeatureRef == null) {
                serviceFeatureOrServiceFeatureRef = new ArrayList<Object>();
            }
            return this.serviceFeatureOrServiceFeatureRef;
        }

    }


    /**
     * <p>Java class for anonymous complex type.
     * 
     * <p>The following schema fragment specifies the expected content contained within this class.
     * 
     * <pre>
     * &lt;complexType>
     *   &lt;complexContent>
     *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
     *       &lt;choice maxOccurs="unbounded">
     *         &lt;element name="LineRef" type="{http://www.siri.org.uk/siri}LineRefStructure"/>
     *         &lt;element name="LineDirection" type="{http://www.siri.org.uk/siri}LineDirectionStructure"/>
     *       &lt;/choice>
     *     &lt;/restriction>
     *   &lt;/complexContent>
     * &lt;/complexType>
     * </pre>
     * 
     * 
     */
    @XmlAccessorType(XmlAccessType.FIELD)
    @XmlType(name = "", propOrder = {
        "lineRefOrLineDirection"
    })
    public static class Lines {

        @XmlElements({
            @XmlElement(name = "LineRef", type = LineRefStructure.class),
            @XmlElement(name = "LineDirection", type = LineDirectionStructure.class)
        })
        protected List<Object> lineRefOrLineDirection;

        /**
         * Gets the value of the lineRefOrLineDirection property.
         * 
         * <p>
         * This accessor method returns a reference to the live list,
         * not a snapshot. Therefore any modification you make to the
         * returned list will be present inside the JAXB object.
         * This is why there is not a <CODE>set</CODE> method for the lineRefOrLineDirection property.
         * 
         * <p>
         * For example, to add a new item, do as follows:
         * <pre>
         *    getLineRefOrLineDirection().add(newItem);
         * </pre>
         * 
         * 
         * <p>
         * Objects of the following type(s) are allowed in the list
         * {@link LineRefStructure }
         * {@link LineDirectionStructure }
         * 
         * 
         */
        public List<Object> getLineRefOrLineDirection() {
            if (lineRefOrLineDirection == null) {
                lineRefOrLineDirection = new ArrayList<Object>();
            }
            return this.lineRefOrLineDirection;
        }

    }

}
