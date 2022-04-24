package com.bilgeadam.javacourse.week2;

import java.util.Random;
import java.util.Scanner;

public class GuessTheNumber {
/*Bilgisayar 1 ile 100 arasýnda bir tam sayýyý kafasýndan atacak siz de o sayýyý tahmin etmeye çalýþacaksýnýz
 * Sonuca göre alçak ya da yüksek verecek
 * 10 defa bulunamazsa oyuncu oyunu kaybetsin.
 * 0 sayýsý ile oyun sonlandýrýlabilsin
 */
	public static void main(String[] args) {
		
		Random rnd = new Random(); //random sayý üretmeye yarayan sýnýf
		
		int numberToGuess; //0 ila 100 arasýnda sayý üretiyo
		do {
			numberToGuess = rnd.nextInt(101);		//0 ila 100 arasýnda sayý üretiyo
			
		}while (numberToGuess ==0 || numberToGuess ==50);
		
		
		boolean numberFound = false; //ilk durumda sayý bulunmamýþ durumda	
		
		Scanner scan = new Scanner(System.in);
		
		int guess; //tahmin edilen sayý
		
		int guessCnt=0;
		
		
		do {
			do {
			System.out.println("Lütfen 1 ila 100 arasýnda  bir sayý giriniz(0 ile oyunu sonlandýrabilirsiniz): ");
			guess= scan.nextInt();
			if(0>guess || guess > 100)
			System.err.println("Lütfen biraz dikkat");
				
				
			} while (!(0<=guess && guess <= 100));
			if (guess==0) {
				break; //bir loopu anýnda sonlandýrýr
			}
			
			if(guess==50) {
				System.out.println("50 giremezsiniz");
				continue; //bir loop'un iþleme devam etmesini durdurur ve loopun baþýna döner
			}
		
			
			guessCnt++;
			
			System.out.println();
			
			if ( guess==numberToGuess){
				System.out.println("Tebrikler" + guessCnt + ". denemede buldunuz!");
				numberFound = true;
			}
			else {
				if (guess>numberToGuess) {
					System.out.println("Yüksek");
				}
				else {
					System.out.println("Çok alçak");
				}
				
			}}
			while(!numberFound && guessCnt <= 10);  //aslýnda numberFound a ihtiyaç yok. while(numberToGuess != guess) þeklinde de olabilirdi
			scan.close();
			
			if(!numberFound){
				System.err.println("Çok baþarýsýzsýnýz");
			}
			System.out.println("Umarým eðlendiniz");
		
		}
				
	}

