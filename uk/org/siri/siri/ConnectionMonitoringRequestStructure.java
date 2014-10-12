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
import javax.xml.bind.annotation.XmlAttribute;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlSchemaType;
import javax.xml.bind.annotation.XmlType;
import javax.xml.bind.annotation.adapters.CollapsedStringAdapter;
import javax.xml.bind.annotation.adapters.XmlJavaTypeAdapter;
import javax.xml.datatype.Duration;


/**
 * Type for Request Connection Monitoring Service.
 * 
 * <p>Java class for ConnectionMonitoringRequestStructure complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="ConnectionMonitoringRequestStructure">
 *   &lt;complexContent>
 *     &lt;extension base="{http://www.siri.org.uk/siri}AbstractFunctionalServiceRequestStructure">
 *       &lt;sequence>
 *         &lt;group ref="{http://www.siri.org.uk/siri}ConnectionMonitoringTopicGroup"/>
 *         &lt;group ref="{http://www.siri.org.uk/siri}ConnectionMonitoringRequestPolicyGroup"/>
 *         &lt;element ref="{http://www.siri.org.uk/siri}Extensions" minOccurs="0"/>
 *       &lt;/sequence>
 *       &lt;attribute name="version" type="{http://www.siri.org.uk/siri}VersionString" default="2.0" />
 *     &lt;/extension>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "ConnectionMonitoringRequestStructure", propOrder = {
    "previewInterval",
    "connectionLinkRef",
    "connectingTimeFilter",
    "connectingJourneyFilter",
    "language",
    "includeTranslations",
    "connectionMonitoringDetailLevel",
    "extensions"
})
public class ConnectionMonitoringRequestStructure
    extends AbstractFunctionalServiceRequestStructure
{

    @XmlElement(name = "PreviewInterval")
    protected Duration previewInterval;
    @XmlElement(name = "ConnectionLinkRef", required = true)
    protected ConnectionLinkRefStructure connectionLinkRef;
    @XmlElement(name = "ConnectingTimeFilter")
    protected ConnectingTimeFilterStructure connectingTimeFilter;
    @XmlElement(name = "ConnectingJourneyFilter")
    protected List<ConnectingJourneyFilterStructure> connectingJourneyFilter;
    @XmlElement(name = "Language", defaultValue = "en")
    @XmlJavaTypeAdapter(CollapsedStringAdapter.class)
    @XmlSchemaType(name = "language")
    protected String language;
    @XmlElement(name = "IncludeTranslations")
    protected Boolean includeTranslations;
    @XmlElement(name = "ConnectionMonitoringDetailLevel", defaultValue = "normal")
    protected ConnectionMonitoringDetailEnumeration connectionMonitoringDetailLevel;
    @XmlElement(name = "Extensions")
    protected ExtensionsStructure extensions;
    @XmlAttribute(name = "version")
    @XmlJavaTypeAdapter(CollapsedStringAdapter.class)
    protected String version;

    /**
     * Gets the value of the previewInterval property.
     * 
     * @return
     *     possible object is
     *     {@link Duration }
     *     
     */
    public Duration getPreviewInterval() {
        return previewInterval;
    }

    /**
     * Sets the value of the previewInterval property.
     * 
     * @param value
     *     allowed object is
     *     {@link Duration }
     *     
     */
    public void setPreviewInterval(Duration value) {
        this.previewInterval = value;
    }

    /**
     * Gets the value of the connectionLinkRef property.
     * 
     * @return
     *     possible object is
     *     {@link ConnectionLinkRefStructure }
     *     
     */
    public ConnectionLinkRefStructure getConnectionLinkRef() {
        return connectionLinkRef;
    }

    /**
     * Sets the value of the connectionLinkRef property.
     * 
     * @param value
     *     allowed object is
     *     {@link ConnectionLinkRefStructure }
     *     
     */
    public void setConnectionLinkRef(ConnectionLinkRefStructure value) {
        this.connectionLinkRef = value;
    }

    /**
     * Gets the value of the connectingTimeFilter property.
     * 
     * @return
     *     possible object is
     *     {@link ConnectingTimeFilterStructure }
     *     
     */
    public ConnectingTimeFilterStructure getConnectingTimeFilter() {
        return connectingTimeFilter;
    }

    /**
     * Sets the value of the connectingTimeFilter property.
     * 
     * @param value
     *     allowed object is
     *     {@link ConnectingTimeFilterStructure }
     *     
     */
    public void setConnectingTimeFilter(ConnectingTimeFilterStructure value) {
        this.connectingTimeFilter = value;
    }

    /**
     * Gets the value of the connectingJourneyFilter property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the connectingJourneyFilter property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getConnectingJourneyFilter().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link ConnectingJourneyFilterStructure }
     * 
     * 
     */
    public List<ConnectingJourneyFilterStructure> getConnectingJourneyFilter() {
        if (connectingJourneyFilter == null) {
            connectingJourneyFilter = new ArrayList<ConnectingJourneyFilterStructure>();
        }
        return this.connectingJourneyFilter;
    }

    /**
     * Gets the value of the language property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getLanguage() {
        return language;
    }

    /**
     * Sets the value of the language property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setLanguage(String value) {
        this.language = value;
    }

    /**
     * Gets the value of the includeTranslations property.
     * 
     * @return
     *     possible object is
     *     {@link Boolean }
     *     
     */
    public Boolean isIncludeTranslations() {
        return includeTranslations;
    }

    /**
     * Sets the value of the includeTranslations property.
     * 
     * @param value
     *     allowed object is
     *     {@link Boolean }
     *     
     */
    public void setIncludeTranslations(Boolean value) {
        this.includeTranslations = value;
    }

    /**
     * Gets the value of the connectionMonitoringDetailLevel property.
     * 
     * @return
     *     possible object is
     *     {@link ConnectionMonitoringDetailEnumeration }
     *     
     */
    public ConnectionMonitoringDetailEnumeration getConnectionMonitoringDetailLevel() {
        return connectionMonitoringDetailLevel;
    }

    /**
     * Sets the value of the connectionMonitoringDetailLevel property.
     * 
     * @param value
     *     allowed object is
     *     {@link ConnectionMonitoringDetailEnumeration }
     *     
     */
    public void setConnectionMonitoringDetailLevel(ConnectionMonitoringDetailEnumeration value) {
        this.connectionMonitoringDetailLevel = value;
    }

    /**
     * Gets the value of the extensions property.
     * 
     * @return
     *     possible object is
     *     {@link ExtensionsStructure }
     *     
     */
    public ExtensionsStructure getExtensions() {
        return extensions;
    }

    /**
     * Sets the value of the extensions property.
     * 
     * @param value
     *     allowed object is
     *     {@link ExtensionsStructure }
     *     
     */
    public void setExtensions(ExtensionsStructure value) {
        this.extensions = value;
    }

    /**
     * Gets the value of the version property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getVersion() {
        if (version == null) {
            return "2.0";
        } else {
            return version;
        }
    }

    /**
     * Sets the value of the version property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setVersion(String value) {
        this.version = value;
    }

}
