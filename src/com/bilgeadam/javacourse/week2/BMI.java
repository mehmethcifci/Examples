package com.bilgeadam.javacourse.week2;

import java.util.Scanner;

public class BMI {

	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		int p;
		String cinsiyet;
		
		System.out.println("Boy giriniz ");
		
		
		p = scan.nextInt();

		int f;
		System.out.println("A��rl�k giriniz: ");
		f = scan.nextInt();
		System.out.println("Cinsiyeti giriniz: ");
		scan.nextLine();
		cinsiyet = scan.nextLine();		
		
		float BMI = (f * 10000)/(p*p);
		
		if(cinsiyet.equals("kad�n")) {
		
			if(BMI>30) {
				System.out.println("Obez");
			}
			else if ( BMI> 25) {
				System.out.println("�i�man");
		}
			else if (BMI>19){
				System.out.println("Normal");
		}
			else {
				System.out.println("Zay�f");
		}}
		
		
		else if (cinsiyet.equals("erkek"))  {
			
			if(BMI>31) {
				System.out.println("Obez");	
			}
			else if (BMI >26 ) {
				System.out.println("�i�man");
			}
			else if (BMI > 20){
				System.out.println("Normal");
			}
			else {
				System.out.println("Zay�f");
			}}
		else {
			
			System.out.println("Bilinmeyen bir cinsiyet");
		}
				
	
	
	}

}
