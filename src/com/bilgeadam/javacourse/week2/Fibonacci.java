package com.bilgeadam.javacourse.week2;

import java.util.Scanner;

public class Fibonacci {

	public static void main(String[] args) {
	
		Scanner scan= new Scanner(System.in);
		System.out.println("Sayý adedi giriniz: ");
		int n= scan.nextInt();
		int a=0;
		int b=1;
		int c;
		int i;
		
		   
		 System.out.print(a+" "+b); 
		    
		 for(i=2; i<n; i++)  
		 {    
		  c=a+b;    
		  System.out.print(" "+c);    
		  a=b;    
		  b=c;    
		 }   			
		
		
		
		
	}

}
