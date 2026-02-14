package com.rays.basic;

public class HighestArray {
	public static void main(String[] args) {
		
		
		int []a = {20,30,40};
		
          int max = 0 ;
           
          int max2 = 0;

          for (int i = 0; i < a.length; i++) {
        	  
        	  if(a[i] > max);
        	   max = a[i];
        	   
        			  
        	  
          }
         
        	
        	  
          for (int i = 0; i < a.length; i++) {
        	  
        	  if (a[i]> max2 && a[i]< max);{
        		  
        		  
        		  max2 = a[i];
        		  
        		  
        	  }
        	  
        	  
        	  
          }
          System.out.println("second largest number is" + " " + max2 );
	}

	}
