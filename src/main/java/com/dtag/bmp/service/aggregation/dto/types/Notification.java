package com.dtag.bmp.service.aggregation.dto.types;
import com.fasterxml.jackson.annotation.JsonProperty;

public final class Notification{
	
@JsonProperty("eventId")
private String eventId;
@JsonProperty("eventTime")
private String eventTime;
@JsonProperty("eventType")
private String eventType;
@JsonProperty("event")
private Event event;

public String getEventId() {
	return eventId;
}
public void setEventId(String eventId) {
	this.eventId = eventId;
}
public String getEventTime() {
	return eventTime;
}
public void setEventTime(String eventTime) {
	this.eventTime = eventTime;
}
public String getEventType() {
	return eventType;
}
public void setEventType(String eventType) {
	this.eventType = eventType;
}
public Event getEvent() {
	return event;
}
public void setEvent(Event event) {
	this.event = event;
}

@Override
public String toString() {
	return "Notification [eventId=" + eventId + ", eventTime=" + eventTime + ", eventType=" + eventType + ", event="
			+ event + "]";
}


	
}
