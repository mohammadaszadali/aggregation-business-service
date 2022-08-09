package com.dtag.bmp.service.aggregation.catalog_db_adapter;





import org.springframework.data.mongodb.repository.MongoRepository;

import com.dtag.bmp.service.aggregation.dto.types.SkuReferenceUser;


public interface SkuidCounterUserRepository extends MongoRepository<SkuReferenceUser, String>{

	SkuReferenceUser getByEntity(String entity);

	SkuReferenceUser save(SkuReferenceUser skuReference);
	

}
