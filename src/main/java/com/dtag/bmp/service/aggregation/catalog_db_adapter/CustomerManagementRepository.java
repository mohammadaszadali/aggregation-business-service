package com.dtag.bmp.service.aggregation.catalog_db_adapter;

import org.springframework.data.mongodb.repository.MongoRepository;

import com.dtag.bmp.service.aggregation.dto.types.CustomerManagementRequest;

public interface CustomerManagementRepository extends MongoRepository<CustomerManagementRequest, String>{



}
