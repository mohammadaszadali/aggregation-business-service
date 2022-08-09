package com.dtag.bmp.service.aggregation.dto.types;


import org.springframework.data.annotation.Id;
import org.springframework.data.mongodb.core.mapping.Document;

@Document(collection = "skureferencePartyId")
public class SkuReferenceParty {
	@Id
	private int skuReferenceId;	
	private String entity;
	private String prefix;
	private String format;
	private String lastSequenceNumber;
	private String nextSequenceNumber;
	private String length;
	
	
	public int getSkuReferenceId() {
		return skuReferenceId;
	}
	public void setSkuReferenceId(int skuReferenceId) {
		this.skuReferenceId = skuReferenceId;
	}
	public String getEntity() {
		return entity;
	}
	public void setEntity(String entity) {
		this.entity = entity;
	}
	public String getPrefix() {
		return prefix;
	}
	public void setPrefix(String prefix) {
		this.prefix = prefix;
	}
	public String getFormat() {
		return format;
	}
	public void setFormat(String format) {
		this.format = format;
	}
	public String getLastSequenceNumber() {
		return lastSequenceNumber;
	}
	public void setLastSequenceNumber(String lastSequenceNumber) {
		this.lastSequenceNumber = lastSequenceNumber;
	}
	public String getNextSequenceNumber() {
		return nextSequenceNumber;
	}
	public void setNextSequenceNumber(String nextSequenceNumber) {
		this.nextSequenceNumber = nextSequenceNumber;
	}
	public String getLength() {
		return length;
	}
	public void setLength(String length) {
		this.length = length;
	}
	
}
