package com.bilgeadam.javacourse.week2;

import java.util.Scanner;

public class Palindrom {
	/*
	 * Kullanýcýnýn girdiði bir kelimenin palindrom olup
	 * olmadýðýný kontrol edin
	 * 
	 * String'lerin .charAt(i) metodunu kullanabilirsiniz
	 */

	public static void main(String[] args) {
		Scanner scan= new Scanner(System.in);
		System.out.println("Lütfen bir kelime giriniz: ");
		String palindrome= scan.nextLine();
		int length = palindrome.length();
		
		
		 palindrome=palindrome.trim();// girilen metni baþ ve sonundaki spaceleri silmek için
		 palindrome=palindrome.toLowerCase();// girilen metri tümüyle küçük harf yapar
		 
		 
		
		boolean isPalindrome= true;
		
		for (int i=0; i<= length/2; i++) {
				if(palindrome.charAt(i) != palindrome.charAt(length-i-1)) {
					isPalindrome=false;
					break;
				}
			
		}	
		String result = palindrome + " bir" + (isPalindrome ? " palindromedur." :" palindrome deðildir");
		System.out.println(result);
		scan.close();
		System.out.println("Bye bye Baby");

	}

}
