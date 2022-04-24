package com.bilgeadam.javacourse.week2;

import java.util.Scanner;

public class Palindrom {
	/*
	 * Kullan�c�n�n girdi�i bir kelimenin palindrom olup
	 * olmad���n� kontrol edin
	 * 
	 * String'lerin .charAt(i) metodunu kullanabilirsiniz
	 */

	public static void main(String[] args) {
		Scanner scan= new Scanner(System.in);
		System.out.println("L�tfen bir kelime giriniz: ");
		String palindrome= scan.nextLine();
		int length = palindrome.length();
		
		
		 palindrome=palindrome.trim();// girilen metni ba� ve sonundaki spaceleri silmek i�in
		 palindrome=palindrome.toLowerCase();// girilen metri t�m�yle k���k harf yapar
		 
		 
		
		boolean isPalindrome= true;
		
		for (int i=0; i<= length/2; i++) {
				if(palindrome.charAt(i) != palindrome.charAt(length-i-1)) {
					isPalindrome=false;
					break;
				}
			
		}	
		String result = palindrome + " bir" + (isPalindrome ? " palindromedur." :" palindrome de�ildir");
		System.out.println(result);
		scan.close();
		System.out.println("Bye bye Baby");

	}

}
