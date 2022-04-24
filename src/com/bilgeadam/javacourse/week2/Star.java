package com.bilgeadam.javacourse.week2;

import java.util.Scanner;

public class Star {

	public static void main(String[] args) {
		
		Scanner tara= new Scanner(System.in);
		String str=" ";
		do {
		if(tara.hasNextInt()) {
			int kutu= tara.nextInt();
			
			for(int i=1 ;i<=kutu; i++) {
			System.out.println();
			
			for(int j=1 ; j<=i; j++) {
				
				System.out.print("* ");	
			}}}
			else {
				System.out.println("Hatalý giriþ");
				System.out.println("Devam etmek istiyor musunuz?(E)");
				tara.nextLine();
				str= tara.nextLine();
				
				
			}} 
				//System.out.println("ByeBye")
		
					while(str.equalsIgnoreCase("E/H"));
				
				
			}}
			
			
			
			
			/*for(int i=kutu ;i>=0; i--) {
				System.out.println();
				
				for(int j=i ; j>=0; j--) {
					
					System.out.print("* ");
	}}*/
			
			


