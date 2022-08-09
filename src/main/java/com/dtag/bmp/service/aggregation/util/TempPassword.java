package com.dtag.bmp.service.aggregation.util;



import java.util.Random;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.mail.SimpleMailMessage;
import org.springframework.mail.javamail.JavaMailSender;

public class TempPassword {
	
	@Autowired
    private JavaMailSender javaMailSender;
public String temp_Password() {
	 //public static void main(String[] args) {
		int length = 8; 
		String myStr=null;
		 Random rndm_method = new Random();
		  String Capital_chars = "ABCDEFGHIJKLMNOPQRSTUVWXYZ"; 
	        String Small_chars = "abcdefghijklmnopqrstuvwxyz"; 
	        String numbers = "0123456789"; 
	                String symbols = "@#$&"; 
	  
	  
	        String values = Capital_chars + Small_chars + 
	                        numbers + symbols; 
	        int i = 0;
	        char[] password = new char[length]; 
	       
	        for ( i = 0; i < length; i++) 
	        { 
	           
	        	 password[i] = values.charAt(rndm_method.nextInt(values.length())); 
	       

	        } 
	      
	        //System.out.print(myStr);
		return new String(password);
	}
	 
	
}
