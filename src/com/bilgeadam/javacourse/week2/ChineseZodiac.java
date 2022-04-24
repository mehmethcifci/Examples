package com.bilgeadam.javacourse.week2;

import java.util.Scanner;

public class ChineseZodiac {

	public static void main(String[] args) {
		Scanner scan=new Scanner(System.in);
		
		System.out.print("Doðum yýlýnýzý giriniz: ");
		
		int dt=scan.nextInt();
		
		int mod = dt%12;
				
				switch (mod) {
				
					case 0:
						System.out.println("Burcunuz Maymun");
						break;
				
					case 1:
						System.out.println("Burcunuz Horoz");
						break;
				
					case 2:
						System.out.println("Burcunuz Köpek");
						break;
				
					case 3:
						System.out.println("Burcunuz Domuz");
						break;
				
					case 4:
						System.out.println("Burcunuz Fare");
						break;
				
					case 5:
						System.out.println("Burcunuz Öküz");
						break;
				
					case 6:
						System.out.println("Burcunuz Kaplan");
						break;
				
					case 7:
						System.out.println("Burcunuz Davþan");
						break;
				
					case 8:
						System.out.println("Burcunuz Ejderya");
						break;
				
					case 9:
						System.out.println("Burcunuz Yýlan");
						break;
				
					case 10:
						System.out.println("Burcunuz At");
						break;
				
					case 11:
						System.out.println("Burcunuz Koyun");
									break;	
				
				}
				
				
	}

}
