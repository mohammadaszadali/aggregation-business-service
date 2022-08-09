package com.dtag.bmp.service.aggregation.catalog_db_adapter;





import org.springframework.data.mongodb.repository.MongoRepository;

import com.dtag.bmp.service.aggregation.dto.types.SkuReference;
import com.dtag.bmp.service.aggregation.dto.types.SkuReferenceParty;



public interface SkuidCounterRepository extends MongoRepository<SkuReference, String>{

	SkuReference getByEntity(String entity);

	SkuReference save(SkuReferenceParty skuReference);
	

}
