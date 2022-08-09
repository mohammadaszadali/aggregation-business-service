package com.dtag.bmp.service.aggregation.services;





import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.dtag.bmp.service.aggregation.catalog_db_adapter.SkuidCounterRepository;
import com.dtag.bmp.service.aggregation.catalog_db_adapter.SkuidCounterUserRepository;
import com.dtag.bmp.service.aggregation.catalog_db_adapter.SkuidPCounterRepository;
import com.dtag.bmp.service.aggregation.dto.types.SkuReference;
import com.dtag.bmp.service.aggregation.dto.types.SkuReferenceParty;
import com.dtag.bmp.service.aggregation.dto.types.SkuReferenceUser;


@Service
public class CustAccSkuAdapterImpl implements SkuReferenceService {

	@Autowired
	private SkuidCounterRepository skuReferenceRepository;
	@Autowired
	private SkuidPCounterRepository skuidPCounterRepository;
	@Autowired
	SkuidCounterUserRepository skuidCounterUserRepository;
	@Override
	public SkuReference save(SkuReference skuReference) {
		
		return skuReferenceRepository.save(skuReference);
	}

	

	@Override
	public String getId(String entity) {
     SkuReference skuReference= skuReferenceRepository.getByEntity(entity);
		
		String custAccSkuId = skuReference.getPrefix() + skuReference.getNextSequenceNumber();
		String nextSequenceNumber = skuReference.getNextSequenceNumber();
		//String lastSequenceNumber = skuReference.getLastSequenceNumber();
		skuReference.setLastSequenceNumber(nextSequenceNumber);

		int number = Integer.parseInt(nextSequenceNumber);
		number = number + 1;
		String stringNumber = Integer.toString(number);

		int loopCount = 10 - (stringNumber.length());

		for (int i = 0; i < loopCount; i++) {
			stringNumber = "0" + stringNumber;
		}
		skuReference.setNextSequenceNumber(stringNumber);
		skuReferenceRepository.save(skuReference);
		return custAccSkuId;
	}



	@Override
	public SkuReferenceParty saveParty(SkuReferenceParty skuReference) {
		
		return skuidPCounterRepository.save(skuReference);
	}



	@Override
	public String getPartyId(String entity) {
SkuReferenceParty skuReference= skuidPCounterRepository.getByEntity(entity);
		
		String custAccSkuPartyId = skuReference.getPrefix() + skuReference.getNextSequenceNumber();
		String nextSequenceNumber = skuReference.getNextSequenceNumber();
		String lastSequenceNumber = skuReference.getLastSequenceNumber();
		skuReference.setLastSequenceNumber(nextSequenceNumber);

		int number = Integer.parseInt(nextSequenceNumber);
		number = number + 1;
		String stringNumber = Integer.toString(number);

		int loopCount = 10 - (stringNumber.length());

		for (int i = 0; i < loopCount; i++) {
			stringNumber = "0" + stringNumber;
		}
		skuReference.setNextSequenceNumber(stringNumber);
		skuidPCounterRepository.save(skuReference);
		return custAccSkuPartyId;
		
	}



	@Override
	public SkuReferenceUser saveUserId(SkuReferenceUser skuReference) {
		// TODO Auto-generated method stub
		return  skuidCounterUserRepository.save(skuReference);
	}



	@Override
	public String getUserId(String entity) {
		SkuReferenceUser skuReference= skuidCounterUserRepository.getByEntity(entity);
		
		String custAccSkuPartyId = skuReference.getPrefix() + skuReference.getNextSequenceNumber();
		String nextSequenceNumber = skuReference.getNextSequenceNumber();
		//String lastSequenceNumber = skuReference.getLastSequenceNumber();
		skuReference.setLastSequenceNumber(nextSequenceNumber);

		int number = Integer.parseInt(nextSequenceNumber);
		number = number + 1;
		String stringNumber = Integer.toString(number);

		int loopCount = 10 - (stringNumber.length());

		for (int i = 0; i < loopCount; i++) {
			stringNumber = "0" + stringNumber;
		}
		skuReference.setNextSequenceNumber(stringNumber);
		skuidCounterUserRepository.save(skuReference);
		return custAccSkuPartyId;
		
	}
}
	