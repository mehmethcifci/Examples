package com.bilgeadam.javacourse.week2;

import java.util.Scanner;

public class ObebOkek {

	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		System.out.print("Birinci sayýyý giriniz: ");
		int sayi1=scan.nextInt();
		System.out.println();
		System.out.print("Ýkinci sayýyý giriniz: ");
		int sayi2=scan.nextInt();
		int ebob=2;
		int ekok=1 ;
		int ebobkontrol=2;
		int ekokkontrol=1;
		while (ebobkontrol <=sayi1 && ebobkontrol <=sayi2) {
			
			if(sayi1%ebobkontrol==0 && sayi2%ebobkontrol==0) {
				ebob=ebobkontrol;
			}
			ebobkontrol++;
		}
		if (ebob==2) {
			System.out.println(sayi1 + " ve "+ sayi2 +" aralarýnda asaldýr.");
		}
		else {
			System.out.println(sayi1 +" ve " + sayi2+ " sayýlarýnýn ebobu: " +ebob);
		}
		
		
		while(ekokkontrol <= sayi1*sayi2) {
			ekokkontrol++;
		if(ekokkontrol%sayi1==0 && ekokkontrol%sayi2==0) {
			ekok=ekokkontrol;
			break;
			
			
		}
		
		}System.out.println(sayi1 +" ve " + sayi2+ " sayýlarýnýn ekoku: " +ekok);
		
		
		
	}

}
