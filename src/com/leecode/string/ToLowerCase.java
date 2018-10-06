package com.leecode.string;

/*Implement function ToLowerCase() that has a string parameter str, and returns the same string in lowercase.



Example 1:

Input: "Hello"
Output: "hello"
Example 2:

Input: "here"
Output: "here"
Example 3:

Input: "LOVELY"
Output: "lovely"*/

public class ToLowerCase {


	 public String toLowerCase(String str) {
	        
	        char [] cha=str.toCharArray();
	        for(int i=0;i<cha.length;i++)
	        { 
	        	if ('A'<=cha[i]&&cha[i]<='Z')
	            //if (0<='Z'-cha[i]&&'Z'-cha[i]<=25)
	            {
	               cha[i]+='a'-'A';
	            }
	        	
	            /*else {
	            	cha[i]-='a'-'A';
	            	
	            }*/
	         
	         }
			return String.valueOf(cha);
	      
	    }
  
}
