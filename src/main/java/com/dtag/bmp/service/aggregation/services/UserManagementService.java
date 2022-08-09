package com.dtag.bmp.service.aggregation.services;

import org.springframework.beans.factory.annotation.Autowired;

import com.dtag.bmp.service.aggregation.dto.types.UserContact;
import com.dtag.bmp.service.aggregation.services.wrapper.HelperAdapter;


@org.springframework.stereotype.Service
public class UserManagementService {
	
	@Autowired
	private HelperAdapter helperAdpter;	
	public String addUser(UserContact user) {
		
		String userList=null;
		try {
			userList = helperAdpter.invokeAddUser(user);
		} catch (Exception e) {
			
			e.printStackTrace();
		}
	
		
		return userList;
	}
	
	

	

}
