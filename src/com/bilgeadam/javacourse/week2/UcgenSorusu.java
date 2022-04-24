package com.bilgeadam.javacourse.week2;

import java.util.Scanner;

public class UcgenSorusu {

	public static void main(String[] args) {
		
		Scanner scan = new Scanner(System.in);
		double x,y,z,a,b,c;
		System.out.println("Ýlk açýyý giriniz: ");
		x = scan.nextDouble();
		System.out.println("Ýkinci açýyý giriniz: ");
		y = scan.nextDouble();
	
		System.out.println("Ýlk kenar uzunluðunu giriniz: ");
		a = scan.nextDouble();
		System.out.println("Ýkinci kenar uzunluðunu giriniz: ");
		b = scan.nextDouble();
		
		z= 180 - (x+y);
		double zrad= Math.toRadians(z); //dereceyi radyana çevirme
		double temp = Math.pow(a, 2)+ (b*b) -(2*a*b*(Math.cos(zrad)));
	
		System.out.println(Math.pow(temp, 0.5));
		c=Math.sqrt(temp);
		System.out.println(Math.sqrt(temp)); //karekök alma
		System.out.println(z);	
	}
}
