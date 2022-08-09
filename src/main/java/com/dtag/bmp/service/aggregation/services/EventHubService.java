package com.dtag.bmp.service.aggregation.services;

import java.util.List;

import org.springframework.stereotype.Service;

import com.dtag.bmp.service.aggregation.dto.types.EventData;
@Service
public interface EventHubService {
	 public EventData addEvent(EventData event);
	 public String delete(String id);
	 public List<EventData> getAll();
	
	

}
