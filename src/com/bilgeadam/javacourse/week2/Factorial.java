package com.bilgeadam.javacourse.week2;

import java.io.InputStream;

import java.util.Scanner;

public class Factorial {

	public static void main(String[] args) {
		
		
		Scanner scan =new  Scanner(System.in);
			
			
		int sayi; 
		int i;
		double fac=1;
		do {		
			System.out.println("Bir sayý giriniz: ");
			sayi = scan.nextInt();
			if (sayi ==99) {
				System.out.println("Ýþlem sonlandýrýldý");
				break;
			}
			if (sayi >0 && sayi <24) {
			for(i=1; i<=sayi ; i++ ) {
				
				fac=fac*i;
			}
			System.out.println(fac);}
				
			}while (sayi >0 && sayi <24);
		System.out.println("Geçersiz deðer girildi");
		System.exit(0);
		
		
	}
	}


/*			Scanner scan =new  Scanner(System.in);
 * 			int input;
 * 			long fac;
 * 
 * 			while(true){
 * 			System.out.println("sayý girin çýkýþ için 99");
 * 			input= scan.nextInt();
 * 			System.out.println;
 * 			if(input == 99){
 * 			System.out.println("programý kullandýðýnýz için teþeke");
 * 			break;
 * 			}
 * 			if(input <1 || input >23{
 * 			
 * 			System.err.println("Girdiðiniz sayý ile iþlem yapamýyorum")
 * 				continue;
 * 				
 * 			}
 * 			factor=1;
 * 			for(int i=1 ; i<=input ; i++){
 * 			fac = fac*i;
 * 			}
 * 
 * 			System.out.println(input + "Sayý faktoriyeli" + factor +"dir");
 * 			}
 * 			scanner.close();
 * 			System.out.println("Bye bye");
 * 
 * 
 * 
 */



