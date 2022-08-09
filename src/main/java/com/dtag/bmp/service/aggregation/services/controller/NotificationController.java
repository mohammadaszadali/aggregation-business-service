package com.dtag.bmp.service.aggregation.services.controller;

import java.util.List;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.dtag.bmp.service.aggregation.dto.types.EventData;
import com.dtag.bmp.service.aggregation.services.EventHubService;

/**
 * 
 *
 * @author TechMahindra
 */
@CrossOrigin(origins = "*")
@RestController
@RequestMapping("/bsi/5gslices/aggregate")
public class NotificationController {
	private static Logger logger = LoggerFactory.getLogger(NotificationController.class);
	  @Autowired
      private EventHubService  eventService ;
	
	private final String className=this.getClass().getSimpleName();

	@PostMapping("/hub")
    public ResponseEntity<?> createNotification(@RequestBody EventData eventData) {
            ResponseEntity<?> responseEntity = null;
            try {
            EventData data = eventService.addEvent(eventData);
            responseEntity = new ResponseEntity<>(data, HttpStatus.CREATED);
            }catch(Exception exception) {
                   exception.printStackTrace();
            }
            return responseEntity;
    }

	
	@DeleteMapping("/deleteById/{id}")
    public ResponseEntity<?> deleteEvent(@PathVariable(value ="id")String id) {
            ResponseEntity<?> responseEntity = null;
            try {
            String message = eventService.delete(id);
            responseEntity = new ResponseEntity<>(message, HttpStatus.OK);
            }catch(Exception exception) {
                    exception.printStackTrace();
            }
            return responseEntity;
    }
	
	@GetMapping("/hub/getEvents")
    public ResponseEntity<?> getEvents() {
            ResponseEntity<?> responseEntity = null;
            try {
            List<EventData> eventDatas = eventService.getAll();
            responseEntity = new ResponseEntity<>(eventDatas, HttpStatus.OK);
            }catch(Exception exception) {
                    exception.printStackTrace();
            }
            return responseEntity;
    }
}
