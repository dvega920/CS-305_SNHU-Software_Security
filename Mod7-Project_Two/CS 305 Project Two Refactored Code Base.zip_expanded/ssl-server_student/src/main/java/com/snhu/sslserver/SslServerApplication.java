/******************************************************************
** 
** CS-305 Project 2
** SslServerApplication.java
** 
** David Vega
** Southern New Hampshire University
** CS-305-T3311 Software Security
** Dr. Vivian Lyon
** February 19, 2023
**
******************************************************************/

package com.snhu.sslserver;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.web.bind.annotation.RequestMapping; //Needed for creating RESTful architecture endpoint.
import org.springframework.web.bind.annotation.RestController; //Needed for creating RESTful architecture
import java.security.MessageDigest; // Needed to create hash (digest)
import java.security.NoSuchAlgorithmException; // Used in error handling to catch and display exception when an invalid hash algorithm is used

@SpringBootApplication
public class SslServerApplication {

	public static void main(String[] args) {
		SpringApplication.run(SslServerApplication.class, args);
	}

}
// Adds a route to enable check sum return of static data example:  String data = "Hello World Check Sum!";
@RestController

class ServerController{
//Add hash function to return the checksum value for the data string that should contain your name.    
    @RequestMapping("/hash")
    // implement error handling "throws" to display exception that the md isn't available.
    public String myHash()throws NoSuchAlgorithmException{
    	String data = "David Vega";
    	MessageDigest md = null; // initialize the MessageDigest object  	 	
    	md = MessageDigest.getInstance("SHA-256");

    	//Use the digest() method of the class to generate a hash value of byte type from the unique data string (your first and last name).
    	byte[] digest = md.digest(data.getBytes());	
    	
    	String hexVal = null; // initialize hexVal variable
    	
    	hexVal = bytesToHex(digest); //Converts the hash value to hex using the bytesToHex function.  	    
    	return "data: "+ data + "<br><br>" + "Name of Algorith Cipher Used: Checksum " + "Value: " + hexVal;
    }
    
    
    // define bytesToHex method that takes in the byte array and loops through to convert each
    // index value to hexadecimal. 
    public String bytesToHex(byte[] digest) {
    	StringBuilder sb = new StringBuilder();
    	
    	for(byte h : digest) {
    		int num = h & 0xff; // performs bitwise AND operation and assigns to num. 
    		if (num < 0x10) {   // condition to evaluate if num value is less than 10 ("0x" lets you know its hexadecimal).
    			sb.append('0');  //when condition is true appends "0" to the string builder for the specified array index value.
    		}
    		sb.append(Integer.toHexString(num));
    	}
    	return sb.toString();
    }
}
