package com.dtag.bmp.service.aggregation.services;

import com.dtag.bmp.service.aggregation.dto.types.SkuReference;
import com.dtag.bmp.service.aggregation.dto.types.SkuReferenceParty;
import com.dtag.bmp.service.aggregation.dto.types.SkuReferenceUser;

public interface SkuReferenceService {
	
	public SkuReference save(SkuReference skuReference);
	public String getId(String entity);
	public SkuReferenceParty saveParty(SkuReferenceParty skuReference);
	public String getPartyId(String entity);
	public SkuReferenceUser saveUserId(SkuReferenceUser skuReference);
	public String getUserId(String entity);

	
	

}
