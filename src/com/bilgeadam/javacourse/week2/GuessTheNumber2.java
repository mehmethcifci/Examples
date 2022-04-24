package com.bilgeadam.javacourse.week2;

import java.util.Random;
import java.util.Scanner;

public class GuessTheNumber2 {
public static void main(String[] args) {
			
	
	Random rnd = new Random(); //random sayý üretmeye yarayan sýnýf
			int numberToGuess = rnd.nextInt(101); //0 ila 100 arasýnda sayý üretiyo
			boolean numberFound = false; //ilk durumda sayý bulunmamýþ durumda	
			Scanner scan = new Scanner(System.in);
			int guess; //tahmin edilen sayý
			do {
				System.out.println("Lütfen 0 ila 100 arasýnda  bir sayý giriniz: ");
				guess= scan.nextInt();
				System.out.println();
		
		if ( guess==numberToGuess){
			System.out.println("Tebrikler buldunuz!");
			numberFound = true;
		}
		else {
			if (guess>numberToGuess) {
				System.out.println("Çok yüksek");
			}
			else {
				System.out.println("Çok alçak");
			}
			
		}}
		while(!numberFound);  //aslýnda numberFound a ihtiyaç yok. while(numberToGuess != guess) þeklinde de olabilirdi
		scan.close();
		System.out.println("Umarým eðlendiniz");
	
	}
			


}

