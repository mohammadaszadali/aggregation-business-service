package com.dtag.bmp.service.aggregation.services;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.mongodb.core.MongoTemplate;
import org.springframework.data.mongodb.core.query.Criteria;
import org.springframework.data.mongodb.core.query.Query;
import org.springframework.stereotype.Service;

import com.dtag.bmp.service.aggregation.dto.types.EventData;


@Service
public class EventHubServiceImpl implements EventHubService {
	
	@Autowired
	private MongoTemplate mongoTemplate;
	 @Override
	public EventData addEvent(EventData event) {
		
		mongoTemplate.save(event);
		return event;
		}
	 @Override
	 public String delete(String id) {
		 if(id!=null) {
			 
		 }
		Query query = new Query();
        query.addCriteria(Criteria.where("id").is(id));
        mongoTemplate.remove(query, EventData.class);
		return " delete Sucessfully";
	}
	 @Override
	public List<EventData> getAll() {
		List<EventData> eventData=mongoTemplate.findAll(EventData.class);
		return eventData;
	}
		
	
}


