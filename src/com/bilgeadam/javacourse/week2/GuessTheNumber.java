package com.bilgeadam.javacourse.week2;

import java.util.Random;
import java.util.Scanner;

public class GuessTheNumber {
/*Bilgisayar 1 ile 100 aras�nda bir tam say�y� kafas�ndan atacak siz de o say�y� tahmin etmeye �al��acaks�n�z
 * Sonuca g�re al�ak ya da y�ksek verecek
 * 10 defa bulunamazsa oyuncu oyunu kaybetsin.
 * 0 say�s� ile oyun sonland�r�labilsin
 */
	public static void main(String[] args) {
		
		Random rnd = new Random(); //random say� �retmeye yarayan s�n�f
		
		int numberToGuess; //0 ila 100 aras�nda say� �retiyo
		do {
			numberToGuess = rnd.nextInt(101);		//0 ila 100 aras�nda say� �retiyo
			
		}while (numberToGuess ==0 || numberToGuess ==50);
		
		
		boolean numberFound = false; //ilk durumda say� bulunmam�� durumda	
		
		Scanner scan = new Scanner(System.in);
		
		int guess; //tahmin edilen say�
		
		int guessCnt=0;
		
		
		do {
			do {
			System.out.println("L�tfen 1 ila 100 aras�nda  bir say� giriniz(0 ile oyunu sonland�rabilirsiniz): ");
			guess= scan.nextInt();
			if(0>guess || guess > 100)
			System.err.println("L�tfen biraz dikkat");
				
				
			} while (!(0<=guess && guess <= 100));
			if (guess==0) {
				break; //bir loopu an�nda sonland�r�r
			}
			
			if(guess==50) {
				System.out.println("50 giremezsiniz");
				continue; //bir loop'un i�leme devam etmesini durdurur ve loopun ba��na d�ner
			}
		
			
			guessCnt++;
			
			System.out.println();
			
			if ( guess==numberToGuess){
				System.out.println("Tebrikler" + guessCnt + ". denemede buldunuz!");
				numberFound = true;
			}
			else {
				if (guess>numberToGuess) {
					System.out.println("Y�ksek");
				}
				else {
					System.out.println("�ok al�ak");
				}
				
			}}
			while(!numberFound && guessCnt <= 10);  //asl�nda numberFound a ihtiya� yok. while(numberToGuess != guess) �eklinde de olabilirdi
			scan.close();
			
			if(!numberFound){
				System.err.println("�ok ba�ar�s�zs�n�z");
			}
			System.out.println("Umar�m e�lendiniz");
		
		}
				
	}

