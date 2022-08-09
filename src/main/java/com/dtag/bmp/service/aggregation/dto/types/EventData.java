package com.dtag.bmp.service.aggregation.dto.types;

import org.springframework.data.mongodb.core.mapping.Document;

import io.swagger.annotations.ApiModelProperty;

@Document(collection = "CustomerHubEvents")
public class EventData {
	
	private String id;
	private String callback;
	private String query;

	public String getCallback() {
	return callback;
	}

	public void setCallback(String callback) {
	this.callback = callback;
	}
	public String getId() {
		return id;
	}
	 @ApiModelProperty(hidden=true)
	public void setId(String id) {
		this.id = id;
	}

	public String getQuery() {
	return query;
	}

	public void setQuery(String query) {
	this.query = query;
	}

	@Override
	public String toString() {
		return "EventData [id=" + id + ", callback=" + callback + ", query=" + query + "]";
	}

	
}
