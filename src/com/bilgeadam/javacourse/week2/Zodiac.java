package com.bilgeadam.javacourse.week2;

import java.util.Scanner;

public class Zodiac {

	public static void main(String[] args) {
		Scanner scan= new Scanner(System.in);
		System.out.print("Do�um g�n�n�z� giriniz: ");
		int day= scan.nextInt();
		System.out.println();
		System.out.print("Do�um ay�n�z� giriniz: ");
		int mounth= scan.nextInt();
		
		if(mounth==3) {
			if (day>20) {
				System.out.println("Burcunuz Ko�");
			}
			else {
				System.out.println("Burcunuz Bal�k");	
			}}
		
		else if(mounth==4) {
			if (day>20) {
				System.out.println("Burcunuz Bo�a");
				}
			else {
				System.out.println("Burcunuz Ko�");	
				}}
		
		else if(mounth==5) {
			if (day>21) {
				System.out.println("Burcunuz �kizler");
					}
			else {
				System.out.println("Burcunuz Bo�a");	
					}}
		
		else if(mounth==6) {
			if (day>22) {
				System.out.println("Burcunuz Yenge�");
						}
			else {
				System.out.println("Burcunuz �kizler");	
						}}
		
		else if(mounth==7) {
						
			if (day>22) {
				System.out.println("Burcunuz Aslan");
				}
			else {
				System.out.println("Burcunuz Yenge�");	
				}}
		
		else if(mounth==8) {
			if (day>22) {
				System.out.println("Burcunuz Ba�ak");
				}
			else {
				System.out.println("Burcunuz Aslan");	
				}}	
		
		else if(mounth==9) {
			if (day>22) {
				System.out.println("Burcunuz Terazi");
			}
			else {
				System.out.println("Burcunuz Ba�ak");	
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
				System.out.println("Burcunuz O�lak");
						}
			else {
				System.out.println("Burcunuz Yay");	
						}}
		
		else if(mounth==1) {
			if (day>21) {
				System.out.println("Burcunuz Kova");
						}
			else {
				System.out.println("Burcunuz O�lak");	
					}}
			
		else if(mounth==2) {
			if (day>19) {
				System.out.println("Burcunuz Bal�k");
				}
			else {
				System.out.println("Burcunuz Kova");	
						}					
			}
	}}
