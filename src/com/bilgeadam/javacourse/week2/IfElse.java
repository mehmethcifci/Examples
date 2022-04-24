package com.bilgeadam.javacourse.week2;

import java.util.Scanner;

public class IfElse {

	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		 int x;
		System.out.println("Bir sayý giriniz: ");
		x = scan.nextInt();
		
		if(x>0) {
			System.out.println("Sayý pozitiftir");
		}
			else if (x<0){
				
				System.out.println("Sayý negatiftir");
			}
				
			else {
				
				System.out.println("Sayý sýfýrdýr");
			}
			}
}
