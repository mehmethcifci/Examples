package com.bilgeadam.javacourse.week2;

import java.util.Scanner;

public class Zodiac {

	public static void main(String[] args) {
		Scanner scan= new Scanner(System.in);
		System.out.print("Doðum gününüzü giriniz: ");
		int day= scan.nextInt();
		System.out.println();
		System.out.print("Doðum ayýnýzý giriniz: ");
		int mounth= scan.nextInt();
		
		if(mounth==3) {
			if (day>20) {
				System.out.println("Burcunuz Koç");
			}
			else {
				System.out.println("Burcunuz Balýk");	
			}}
		
		else if(mounth==4) {
			if (day>20) {
				System.out.println("Burcunuz Boða");
				}
			else {
				System.out.println("Burcunuz Koç");	
				}}
		
		else if(mounth==5) {
			if (day>21) {
				System.out.println("Burcunuz Ýkizler");
					}
			else {
				System.out.println("Burcunuz Boða");	
					}}
		
		else if(mounth==6) {
			if (day>22) {
				System.out.println("Burcunuz Yengeç");
						}
			else {
				System.out.println("Burcunuz Ýkizler");	
						}}
		
		else if(mounth==7) {
						
			if (day>22) {
				System.out.println("Burcunuz Aslan");
				}
			else {
				System.out.println("Burcunuz Yengeç");	
				}}
		
		else if(mounth==8) {
			if (day>22) {
				System.out.println("Burcunuz Baþak");
				}
			else {
				System.out.println("Burcunuz Aslan");	
				}}	
		
		else if(mounth==9) {
			if (day>22) {
				System.out.println("Burcunuz Terazi");
			}
			else {
				System.out.println("Burcunuz Baþak");	
					}}
			
		else if(mounth==10) {
			if (day>22) {
				System.out.println("Burcunuz Akrep");
				}
			else {
				System.out.println("Burcunuz Terazi");	
				}}
			
		else if(mounth==11) {
			if (day>21) {
				System.out.println("Burcunuz Yay");
					}
			else {
				System.out.println("Burcunuz Akrep");	
					}}
		
		else if(mounth==12) {
			if (day>21) {
				System.out.println("Burcunuz Oðlak");
						}
			else {
				System.out.println("Burcunuz Yay");	
						}}
		
		else if(mounth==1) {
			if (day>21) {
				System.out.println("Burcunuz Kova");
						}
			else {
				System.out.println("Burcunuz Oðlak");	
					}}
			
		else if(mounth==2) {
			if (day>19) {
				System.out.println("Burcunuz Balýk");
				}
			else {
				System.out.println("Burcunuz Kova");	
						}					
			}
	}}
