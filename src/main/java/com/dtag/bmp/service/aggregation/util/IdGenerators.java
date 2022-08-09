package com.dtag.bmp.service.aggregation.util;

import java.util.UUID;

import com.fasterxml.uuid.Generators;

public class IdGenerators {
	
	
	public String createId()
	{
	UUID uuid1 = Generators.timeBasedGenerator().generate();
	Long cid1 = uuid1.node();
	return cid1.toString();
		
	}

}
