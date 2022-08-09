package com.dtag.bmp.service.aggregation.catalog_db_adapter;





import org.springframework.data.mongodb.repository.MongoRepository;

import com.dtag.bmp.service.aggregation.dto.types.SkuReferenceParty;


public interface SkuidPCounterRepository extends MongoRepository<SkuReferenceParty, String>{

	 SkuReferenceParty save(SkuReferenceParty skuReference);
	 SkuReferenceParty getByEntity(String entity);
	
	

}
