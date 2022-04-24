package com.bilgeadam.javacourse.week2;

import java.util.Scanner;

public class Asal {

	public static void main(String[] args) {
	
		int i,count=0;
		Scanner tara= new Scanner(System.in);
		System.out.println("Kontrol etmek istediðiniz sayýyý giriniz: ");
		int n= tara.nextInt();
		
		if(n==0 || n==1) {
			System.out.println(n+ "is not prime number");
		}
		else {
		for(i=2; i<n ; i++) {
			
			if(n%i==0) {
				count++;
			}}
		if(count==0) {
			System.out.println(n+ " is prime number");
		}
		else {
			System.out.println(n + " is not prime number");
		}
			
			
			
			
		}
	
		
	}}	
		
		
		
		
		
		
		
		
		
		
		
		
		/*	Scanner tara=new Scanner(System.in);
		System.out.println("Bir sayý giriniz: ");
		int sayi=tara.nextInt();
		
		int kalan;
		boolean a=true;
		
		while(a==true) {
			for(int i=2; i<sayi;i++) {
			
			kalan=sayi%i;
			if(kalan==0) {	
				System.out.println("Sayý asal deðildir.");
			a=false;
				break;
			}}
			

		}

		
	}

}*/
