//
// This file was generated by the JavaTM Architecture for XML Binding(JAXB) Reference Implementation, v2.2.4 
// See <a href="http://java.sun.com/xml/jaxb">http://java.sun.com/xml/jaxb</a> 
// Any modifications to this file will be lost upon recompilation of the source schema. 
// Generated on: 2014.07.04 at 01:00:15 PM EDT 
//


package uk.org.siri.siri;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlSchemaType;
import javax.xml.bind.annotation.XmlType;
import javax.xml.datatype.XMLGregorianCalendar;


/**
 * Type for Estimated SERVICE JOURNEY INTERCHANGE.
 * 
 * <p>Java class for EstimatedServiceJourneyInterchangeStructure complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="EstimatedServiceJourneyInterchangeStructure">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;choice>
 *           &lt;element ref="{http://www.siri.org.uk/siri}InterchangeRef"/>
 *           &lt;sequence>
 *             &lt;element name="FeederJourneyRef" type="{http://www.siri.org.uk/siri}ConnectingJourneyRefStructure"/>
 *             &lt;element name="DistributorJourneyRef" type="{http://www.siri.org.uk/siri}ConnectingJourneyRefStructure"/>
 *           &lt;/sequence>
 *         &lt;/choice>
 *         &lt;choice>
 *           &lt;element name="WillNotWait" type="{http://www.siri.org.uk/siri}EmptyType"/>
 *           &lt;element name="WillWait" type="{http://www.siri.org.uk/siri}WillWaitStructure"/>
 *         &lt;/choice>
 *         &lt;element name="ExpectedDepartureTimeOfDistributor" type="{http://www.w3.org/2001/XMLSchema}dateTime" minOccurs="0"/>
 *         &lt;element name="ConnectionMonitoring" type="{http://www.w3.org/2001/XMLSchema}boolean" minOccurs="0"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "EstimatedServiceJourneyInterchangeStructure", propOrder = {
    "interchangeRef",
    "feederJourneyRef",
    "distributorJourneyRef",
    "willNotWait",
    "willWait",
    "expectedDepartureTimeOfDistributor",
    "connectionMonitoring"
})
public class EstimatedServiceJourneyInterchangeStructure {

    @XmlElement(name = "InterchangeRef")
    protected InterchangeRefStructure interchangeRef;
    @XmlElement(name = "FeederJourneyRef")
    protected ConnectingJourneyRefStructure feederJourneyRef;
    @XmlElement(name = "DistributorJourneyRef")
    protected ConnectingJourneyRefStructure distributorJourneyRef;
    @XmlElement(name = "WillNotWait")
    protected String willNotWait;
    @XmlElement(name = "WillWait")
    protected WillWaitStructure willWait;
    @XmlElement(name = "ExpectedDepartureTimeOfDistributor")
    @XmlSchemaType(name = "dateTime")
    protected XMLGregorianCalendar expectedDepartureTimeOfDistributor;
    @XmlElement(name = "ConnectionMonitoring")
    protected Boolean connectionMonitoring;

    /**
     * Gets the value of the interchangeRef property.
     * 
     * @return
     *     possible object is
     *     {@link InterchangeRefStructure }
     *     
     */
    public InterchangeRefStructure getInterchangeRef() {
        return interchangeRef;
    }

    /**
     * Sets the value of the interchangeRef property.
     * 
     * @param value
     *     allowed object is
     *     {@link InterchangeRefStructure }
     *     
     */
    public void setInterchangeRef(InterchangeRefStructure value) {
        this.interchangeRef = value;
    }

    /**
     * Gets the value of the feederJourneyRef property.
     * 
     * @return
     *     possible object is
     *     {@link ConnectingJourneyRefStructure }
     *     
     */
    public ConnectingJourneyRefStructure getFeederJourneyRef() {
        return feederJourneyRef;
    }

    /**
     * Sets the value of the feederJourneyRef property.
     * 
     * @param value
     *     allowed object is
     *     {@link ConnectingJourneyRefStructure }
     *     
     */
    public void setFeederJourneyRef(ConnectingJourneyRefStructure value) {
        this.feederJourneyRef = value;
    }

    /**
     * Gets the value of the distributorJourneyRef property.
     * 
     * @return
     *     possible object is
     *     {@link ConnectingJourneyRefStructure }
     *     
     */
    public ConnectingJourneyRefStructure getDistributorJourneyRef() {
        return distributorJourneyRef;
    }

    /**
     * Sets the value of the distributorJourneyRef property.
     * 
     * @param value
     *     allowed object is
     *     {@link ConnectingJourneyRefStructure }
     *     
     */
    public void setDistributorJourneyRef(ConnectingJourneyRefStructure value) {
        this.distributorJourneyRef = value;
    }

    /**
     * Gets the value of the willNotWait property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getWillNotWait() {
        return willNotWait;
    }

    /**
     * Sets the value of the willNotWait property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setWillNotWait(String value) {
        this.willNotWait = value;
    }

    /**
     * Gets the value of the willWait property.
     * 
     * @return
     *     possible object is
     *     {@link WillWaitStructure }
     *     
     */
    public WillWaitStructure getWillWait() {
        return willWait;
    }

    /**
     * Sets the value of the willWait property.
     * 
     * @param value
     *     allowed object is
     *     {@link WillWaitStructure }
     *     
     */
    public void setWillWait(WillWaitStructure value) {
        this.willWait = value;
    }

    /**
     * Gets the value of the expectedDepartureTimeOfDistributor property.
     * 
     * @return
     *     possible object is
     *     {@link XMLGregorianCalendar }
     *     
     */
    public XMLGregorianCalendar getExpectedDepartureTimeOfDistributor() {
        return expectedDepartureTimeOfDistributor;
    }

    /**
     * Sets the value of the expectedDepartureTimeOfDistributor property.
     * 
     * @param value
     *     allowed object is
     *     {@link XMLGregorianCalendar }
     *     
     */
    public void setExpectedDepartureTimeOfDistributor(XMLGregorianCalendar value) {
        this.expectedDepartureTimeOfDistributor = value;
    }

    /**
     * Gets the value of the connectionMonitoring property.
     * 
     * @return
     *     possible object is
     *     {@link Boolean }
     *     
     */
    public Boolean isConnectionMonitoring() {
        return connectionMonitoring;
    }

    /**
     * Sets the value of the connectionMonitoring property.
     * 
     * @param value
     *     allowed object is
     *     {@link Boolean }
     *     
     */
    public void setConnectionMonitoring(Boolean value) {
        this.connectionMonitoring = value;
    }

}