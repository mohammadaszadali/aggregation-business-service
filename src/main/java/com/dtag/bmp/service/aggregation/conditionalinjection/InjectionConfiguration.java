package com.dtag.bmp.service.aggregation.conditionalinjection;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.web.client.RestTemplate;

import com.dtag.bmp.service.aggregation.services.wrapper.HelperAdapter;


@Configuration
public class InjectionConfiguration {
  
 
  
  @Bean
  public RestTemplate restTemplate() {
	    return new RestTemplate();
	}
 
  @Bean
  public HelperAdapter injectHelperAdapter() throws Exception{
	    return new HelperAdapter();
	}
}
