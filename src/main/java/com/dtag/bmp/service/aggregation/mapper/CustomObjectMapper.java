package com.dtag.bmp.service.aggregation.mapper;

import java.text.DateFormat;
import java.text.SimpleDateFormat;

import org.springframework.stereotype.Component;

import com.fasterxml.jackson.databind.ObjectMapper;

@Component
public class CustomObjectMapper extends ObjectMapper {
	
	

	public CustomObjectMapper() {
		super();
		DateFormat dateFormat= new SimpleDateFormat("MMM-dd-yyyy HH:mm:ss");
		this.setDateFormat(dateFormat);
	}   
	   
}


