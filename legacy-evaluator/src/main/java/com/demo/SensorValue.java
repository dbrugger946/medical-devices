package com.demo;

import java.math.BigDecimal;


public class SensorValue {

    private String locationId;
    private String rigId;
    private String eventDateTime;
    private String source;
    private String type;
    private String metric;
    private BigDecimal value; 

    public SensorValue(String locationId, String rigId, String eventDateTime, String source, String type, String metric,
            String value ) {
        this.rigId = rigId;
        this.eventDateTime = eventDateTime;
        this.source = source;
        this.type = type;
        this.metric = metric;
        this.value = new BigDecimal(value);
        this.locationId = locationId;
    }
    public String getLocationId() {
        return locationId;
    }
    public void setLocationId(String locationId) {
        this.locationId = locationId;
    }
    public String getRigId() {
        return rigId;
    }
    public void setRigId(String rigId) {
        this.rigId = rigId;
    }
    public String getEventDateTime() {
        return eventDateTime;
    }
    public void setEventDateTime(String eventDateTime) {
        this.eventDateTime = eventDateTime;
    }
    public String getSource() {
        return source;
    }
    public void setSource(String source) {
        this.source = source;
    }
    public String getType() {
        return type;
    }
    public void setType(String type) {
        this.type = type;
    }
    public String getMetric() {
        return metric;
    }
    public void setMetric(String metric) {
        this.metric = metric;
    }
    public BigDecimal getValue() {
        return value;
    }
    public void setValue(BigDecimal value) {
        this.value = value;
    }
    
    
}



