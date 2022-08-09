package com.dtag.bmp.service.aggregation.services.controller;



import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

import com.dtag.bmp.service.aggregation.dto.types.SkuReference;
import com.dtag.bmp.service.aggregation.dto.types.SkuReferenceParty;
import com.dtag.bmp.service.aggregation.dto.types.SkuReferenceUser;
import com.dtag.bmp.service.aggregation.services.SkuReferenceService;



/**
 * 
 *
 * @author TechMahindra
 */
@CrossOrigin(origins = "*")
@RestController
@RequestMapping("/5g/SkuReference/v1")
public class SkuReferenceController {
	private static Logger logger = LoggerFactory.getLogger(SkuReferenceController.class);
	@Autowired
	private SkuReferenceService skuReferenceService;

	@RequestMapping(value = { "/skuCId" }, method = RequestMethod.POST)
	public ResponseEntity<?> createServiceSkuDetails(@RequestBody SkuReference skuReference) {
		try {

			SkuReference result = skuReferenceService.save(skuReference);
			return new ResponseEntity<Object>(result, HttpStatus.CREATED);
		} catch (Exception e) {
			e.printStackTrace();
			return (new ResponseEntity<String>("", HttpStatus.INTERNAL_SERVER_ERROR));
		}
	}

	@RequestMapping(value = { "/getskuCId" }, method = RequestMethod.GET)
	public ResponseEntity<?> createServiceSku() {
		try {

			String entity = "00";
			String result = skuReferenceService.getId(entity);
			return new ResponseEntity<Object>(result, HttpStatus.CREATED);
		} catch (Exception e) {
			e.printStackTrace();
			return (new ResponseEntity<String>("", HttpStatus.INTERNAL_SERVER_ERROR));
		}
	}

	// for partId
	@RequestMapping(value = { "/skuPId" }, method = RequestMethod.POST)
	public ResponseEntity<?> createServiceSkuParty(@RequestBody SkuReferenceParty skuReference) {
		try {

			SkuReferenceParty result = skuReferenceService.saveParty(skuReference);
			return new ResponseEntity<Object>(result, HttpStatus.CREATED);
		} catch (Exception e) {
			e.printStackTrace();
			return (new ResponseEntity<String>("", HttpStatus.INTERNAL_SERVER_ERROR));
		}
	}

	@RequestMapping(value = { "/getskuPId" }, method = RequestMethod.GET)
	public ResponseEntity<?> createServiceSkuParty() {
		try {

			String entity = "00";
			String result = skuReferenceService.getPartyId(entity);
			return new ResponseEntity<Object>(result, HttpStatus.CREATED);
		} catch (Exception e) {
			e.printStackTrace();
			return (new ResponseEntity<String>("", HttpStatus.INTERNAL_SERVER_ERROR));
		}
	}

	// for User ID
	@RequestMapping(value = { "/skuUserId" }, method = RequestMethod.POST)
	public ResponseEntity<?> createServiceSkuUser(@RequestBody SkuReferenceUser skuReference) {
		try {

			SkuReferenceUser result = skuReferenceService.saveUserId(skuReference);
			return new ResponseEntity<Object>(result, HttpStatus.CREATED);
		} catch (Exception e) {
			e.printStackTrace();
			return (new ResponseEntity<String>("", HttpStatus.INTERNAL_SERVER_ERROR));
		}
	}

	@RequestMapping(value = { "/getskuUserId" }, method = RequestMethod.GET)
	public ResponseEntity<?> createServiceUserId() {
		try {

			String entity = "00";
			String result = skuReferenceService.getUserId(entity);
			return new ResponseEntity<Object>(result, HttpStatus.CREATED);
		} catch (Exception e) {
			e.printStackTrace();
			return (new ResponseEntity<String>("", HttpStatus.INTERNAL_SERVER_ERROR));
		}
	}

}
