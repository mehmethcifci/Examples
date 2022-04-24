package com.bilgeadam.javacourse.week2;

import java.util.Scanner;
public class Example {

	public static void main(String[] args) {
		
		Scanner scan=new Scanner(System.in);
		System.out.print("Bir sayý giriniz: ");
		
		int s= scan.nextInt();
	
		System.out.print("*");
		for(int i=1 ;i<=s; i++) {
			System.out.println();
			
			for(int j=1 ; j<=i; j++) {
				
				System.out.print("**");
			
			}}
		
	}

}
