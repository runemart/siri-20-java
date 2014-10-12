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
import javax.xml.bind.annotation.XmlSeeAlso;
import javax.xml.bind.annotation.XmlType;


/**
 * Type for SIRI Subscription Request.
 * 
 * <p>Java class for SubscriptionRequestStructure complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="SubscriptionRequestStructure">
 *   &lt;complexContent>
 *     &lt;extension base="{http://www.siri.org.uk/siri}AbstractSubscriptionRequestStructure">
 *       &lt;sequence>
 *         &lt;group ref="{http://www.siri.org.uk/siri}SiriSubscriptionRequestGroup"/>
 *       &lt;/sequence>
 *     &lt;/extension>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "SubscriptionRequestStructure", propOrder = {
    "productionTimetableSubscriptionRequest",
    "estimatedTimetableSubscriptionRequest",
    "stopTimetableSubscriptionRequest",
    "stopMonitoringSubscriptionRequest",
    "vehicleMonitoringSubscriptionRequest",
    "connectionTimetableSubscriptionRequest",
    "connectionMonitoringSubscriptionRequest",
    "generalMessageSubscriptionRequest",
    "facilityMonitoringSubscriptionRequest",
    "situationExchangeSubscriptionRequest"
})
@XmlSeeAlso({
    SubscriptionRequest.class
})
public class SubscriptionRequestStructure
    extends AbstractSubscriptionRequestStructure
{

    @XmlElement(name = "ProductionTimetableSubscriptionRequest")
    protected List<ProductionTimetableSubscriptionRequest> productionTimetableSubscriptionRequest;
    @XmlElement(name = "EstimatedTimetableSubscriptionRequest")
    protected List<EstimatedTimetableSubscriptionStructure> estimatedTimetableSubscriptionRequest;
    @XmlElement(name = "StopTimetableSubscriptionRequest")
    protected List<StopTimetableSubscriptionStructure> stopTimetableSubscriptionRequest;
    @XmlElement(name = "StopMonitoringSubscriptionRequest")
    protected List<StopMonitoringSubscriptionStructure> stopMonitoringSubscriptionRequest;
    @XmlElement(name = "VehicleMonitoringSubscriptionRequest")
    protected List<VehicleMonitoringSubscriptionStructure> vehicleMonitoringSubscriptionRequest;
    @XmlElement(name = "ConnectionTimetableSubscriptionRequest")
    protected List<ConnectionTimetableSubscriptionStructure> connectionTimetableSubscriptionRequest;
    @XmlElement(name = "ConnectionMonitoringSubscriptionRequest")
    protected List<ConnectionMonitoringSubscriptionRequestStructure> connectionMonitoringSubscriptionRequest;
    @XmlElement(name = "GeneralMessageSubscriptionRequest")
    protected List<GeneralMessageSubscriptionStructure> generalMessageSubscriptionRequest;
    @XmlElement(name = "FacilityMonitoringSubscriptionRequest")
    protected List<FacilityMonitoringSubscriptionStructure> facilityMonitoringSubscriptionRequest;
    @XmlElement(name = "SituationExchangeSubscriptionRequest")
    protected List<SituationExchangeSubscriptionStructure> situationExchangeSubscriptionRequest;

    /**
     * Gets the value of the productionTimetableSubscriptionRequest property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the productionTimetableSubscriptionRequest property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getProductionTimetableSubscriptionRequest().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link ProductionTimetableSubscriptionRequest }
     * 
     * 
     */
    public List<ProductionTimetableSubscriptionRequest> getProductionTimetableSubscriptionRequest() {
        if (productionTimetableSubscriptionRequest == null) {
            productionTimetableSubscriptionRequest = new ArrayList<ProductionTimetableSubscriptionRequest>();
        }
        return this.productionTimetableSubscriptionRequest;
    }

    /**
     * Gets the value of the estimatedTimetableSubscriptionRequest property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the estimatedTimetableSubscriptionRequest property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getEstimatedTimetableSubscriptionRequest().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link EstimatedTimetableSubscriptionStructure }
     * 
     * 
     */
    public List<EstimatedTimetableSubscriptionStructure> getEstimatedTimetableSubscriptionRequest() {
        if (estimatedTimetableSubscriptionRequest == null) {
            estimatedTimetableSubscriptionRequest = new ArrayList<EstimatedTimetableSubscriptionStructure>();
        }
        return this.estimatedTimetableSubscriptionRequest;
    }

    /**
     * Gets the value of the stopTimetableSubscriptionRequest property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the stopTimetableSubscriptionRequest property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getStopTimetableSubscriptionRequest().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link StopTimetableSubscriptionStructure }
     * 
     * 
     */
    public List<StopTimetableSubscriptionStructure> getStopTimetableSubscriptionRequest() {
        if (stopTimetableSubscriptionRequest == null) {
            stopTimetableSubscriptionRequest = new ArrayList<StopTimetableSubscriptionStructure>();
        }
        return this.stopTimetableSubscriptionRequest;
    }

    /**
     * Gets the value of the stopMonitoringSubscriptionRequest property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the stopMonitoringSubscriptionRequest property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getStopMonitoringSubscriptionRequest().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link StopMonitoringSubscriptionStructure }
     * 
     * 
     */
    public List<StopMonitoringSubscriptionStructure> getStopMonitoringSubscriptionRequest() {
        if (stopMonitoringSubscriptionRequest == null) {
            stopMonitoringSubscriptionRequest = new ArrayList<StopMonitoringSubscriptionStructure>();
        }
        return this.stopMonitoringSubscriptionRequest;
    }

    /**
     * Gets the value of the vehicleMonitoringSubscriptionRequest property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the vehicleMonitoringSubscriptionRequest property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getVehicleMonitoringSubscriptionRequest().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link VehicleMonitoringSubscriptionStructure }
     * 
     * 
     */
    public List<VehicleMonitoringSubscriptionStructure> getVehicleMonitoringSubscriptionRequest() {
        if (vehicleMonitoringSubscriptionRequest == null) {
            vehicleMonitoringSubscriptionRequest = new ArrayList<VehicleMonitoringSubscriptionStructure>();
        }
        return this.vehicleMonitoringSubscriptionRequest;
    }

    /**
     * Gets the value of the connectionTimetableSubscriptionRequest property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the connectionTimetableSubscriptionRequest property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getConnectionTimetableSubscriptionRequest().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link ConnectionTimetableSubscriptionStructure }
     * 
     * 
     */
    public List<ConnectionTimetableSubscriptionStructure> getConnectionTimetableSubscriptionRequest() {
        if (connectionTimetableSubscriptionRequest == null) {
            connectionTimetableSubscriptionRequest = new ArrayList<ConnectionTimetableSubscriptionStructure>();
        }
        return this.connectionTimetableSubscriptionRequest;
    }

    /**
     * Gets the value of the connectionMonitoringSubscriptionRequest property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the connectionMonitoringSubscriptionRequest property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getConnectionMonitoringSubscriptionRequest().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link ConnectionMonitoringSubscriptionRequestStructure }
     * 
     * 
     */
    public List<ConnectionMonitoringSubscriptionRequestStructure> getConnectionMonitoringSubscriptionRequest() {
        if (connectionMonitoringSubscriptionRequest == null) {
            connectionMonitoringSubscriptionRequest = new ArrayList<ConnectionMonitoringSubscriptionRequestStructure>();
        }
        return this.connectionMonitoringSubscriptionRequest;
    }

    /**
     * Gets the value of the generalMessageSubscriptionRequest property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the generalMessageSubscriptionRequest property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getGeneralMessageSubscriptionRequest().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link GeneralMessageSubscriptionStructure }
     * 
     * 
     */
    public List<GeneralMessageSubscriptionStructure> getGeneralMessageSubscriptionRequest() {
        if (generalMessageSubscriptionRequest == null) {
            generalMessageSubscriptionRequest = new ArrayList<GeneralMessageSubscriptionStructure>();
        }
        return this.generalMessageSubscriptionRequest;
    }

    /**
     * Gets the value of the facilityMonitoringSubscriptionRequest property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the facilityMonitoringSubscriptionRequest property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getFacilityMonitoringSubscriptionRequest().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link FacilityMonitoringSubscriptionStructure }
     * 
     * 
     */
    public List<FacilityMonitoringSubscriptionStructure> getFacilityMonitoringSubscriptionRequest() {
        if (facilityMonitoringSubscriptionRequest == null) {
            facilityMonitoringSubscriptionRequest = new ArrayList<FacilityMonitoringSubscriptionStructure>();
        }
        return this.facilityMonitoringSubscriptionRequest;
    }

    /**
     * Gets the value of the situationExchangeSubscriptionRequest property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the situationExchangeSubscriptionRequest property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getSituationExchangeSubscriptionRequest().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link SituationExchangeSubscriptionStructure }
     * 
     * 
     */
    public List<SituationExchangeSubscriptionStructure> getSituationExchangeSubscriptionRequest() {
        if (situationExchangeSubscriptionRequest == null) {
            situationExchangeSubscriptionRequest = new ArrayList<SituationExchangeSubscriptionStructure>();
        }
        return this.situationExchangeSubscriptionRequest;
    }

}
